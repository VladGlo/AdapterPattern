class CustomerImpl implements Solution.Customer {
    String companyName;
    String countryName;

    CustomerImpl(String companyName, String countryName) {
        this.companyName = companyName;
        this.countryName = countryName;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getCountryName() {
        return countryName;
    }
}
