public class IncomeDataAdapter implements Solution.IncomeData {
    Solution.Customer customer;
    Solution.Contact contact;

    public IncomeDataAdapter(Solution.Customer customer, Solution.Contact contact) {
        this.customer = customer;
        this.contact = contact;
    }

    @Override
    public String getCountryCode() {
        return Solution.countries.get(customer.getCountryName());
    }

    @Override
    public String getCompany() {
        return customer.getCompanyName();
    }

    @Override
    public String getContactFirstName() {
        return contact.getName().split(",")[1].trim();
    }

    @Override
    public String getContactLastName() {
        return contact.getName().split(",")[0].trim();
    }

    @Override
    public int getCountryPhoneCode() {
        return Integer.parseInt(contact.getPhoneNumber()
                .substring(0, contact.getPhoneNumber().indexOf("("))
                .replace("+", ""));
    }

    @Override
    public int getPhoneNumber() {
        return Integer.parseInt(contact.getPhoneNumber()
                .substring(contact.getPhoneNumber().indexOf("("))
                .replaceAll("\\(|\\)|-", ""));
    }
}