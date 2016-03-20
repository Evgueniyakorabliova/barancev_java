package by.stqa.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String company;
    private final String address;
    private final String email;
    private final String notes;
    private String group;

    public ContactData(String firstname, String lastname, String company, String address, String email, String notes, String group) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.address = address;
        this.email = email;
        this.notes = notes;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getNotes() {
        return notes;
    }

    public String getGroup() {
        return group;
    }
}
