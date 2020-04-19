package Entities;

public class Organization {
    private String name;
    private String email;
    private String faxNumber;
    private String phoneNumber;

    public Organization(String name, String email, String faxNumber, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.faxNumber = faxNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
