package homeworks.employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size;

    public boolean add(Company company) {
        if (company == null || getById(company.getCompanyId()) != null) {
            return false;
        }

        if (size == companies.length) {
            Company[] newCompanies = new Company[companies.length * 2];

            for (int i = 0; i < size; i++) {
                newCompanies[i] = companies[i];
            }

            companies = newCompanies;
        }

        companies[size++] = company;
        return true;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }

    public Company getById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equalsIgnoreCase(companyId)) {
                return companies[i];
            }
        }

        return null;
    }

    public boolean deleteById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equalsIgnoreCase(companyId)) {
                for (int j = i; j < size - 1; j++) {
                    companies[j] = companies[j + 1];
                }

                companies[size - 1] = null;
                size--;

                return true;
            }
        }

        return false;
    }
}