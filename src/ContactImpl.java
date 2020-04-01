class ContactImpl implements Solution.Contact {
    String name;
    String phoneNumber;

    ContactImpl(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}