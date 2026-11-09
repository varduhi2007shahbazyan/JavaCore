
package bracechecker;

import java.util.Stack;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        Stack indexes = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    indexes.push(i);
                    break;

                case ')':
                case '}':
                case ']':

                    if (stack.isEmpty()) {
                        System.out.println("Error: unexpected " + c + " at " + i);
                        return;
                    }

                    char opened = (char) stack.pop();
                    indexes.pop();

                    switch (opened) {
                        case '(':
                            if (c != ')') {
                                System.out.println("Error: opened " + opened +
                                        " but closed " + c + " at " + i);
                                return;
                            }
                            break;
                        case '{':
                            if (c != '}') {
                                System.out.println("Error: opened " + opened +
                                        " but closed " + c + " at " + i);
                                return;
                            }
                            break;
                        case '[':
                            if (c != ']') {
                                System.out.println("Error: opened " + opened +
                                        " but closed " + c + " at " + i);
                                return;
                            }
                            break;
                    }

                    break;
            }
        }

        if (!stack.isEmpty()) {
            char opened = (char) stack.pop();
            int index = (int) indexes.pop();

            switch (opened) {
                case '(':
                    System.out.println("Error: opened ( but expected ) at " + index);
                    break;

                case '{':
                    System.out.println("Error: opened { but expected } at " + index);
                    break;
                case '[':
                    System.out.println("Error: opened [ but expected ] at " + index);
                    break;
            }
        } else {
            System.out.println("No errors");
        }

    }
}
