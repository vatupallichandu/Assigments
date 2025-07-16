package day9.com;

public class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Getters
    public String getName()  { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Contact{name='" + name + "', phone='" + phone + "', email='" + email + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact c = (Contact) o;
        // consider equal if name OR phone OR email matches
        return (name != null && name.equals(c.name))
            || (phone != null && phone.equals(c.phone))
            || (email != null && email.equals(c.email));
    }

    @Override
    public int hashCode() {
        return (name != null ? name.hashCode() : 0)
             + (phone != null ? phone.hashCode() : 0)
             + (email != null ? email.hashCode() : 0);
    }
}
