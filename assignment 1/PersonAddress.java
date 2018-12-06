public class PersonAddress {
    String firstName;
    String lastName;
    String email;
    long phone = 0;
    PersonAddress() {
    }
    public String getFirst() {
        return firstName;
    }
    public String getLast() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public long getPhone() {
        return phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public String Equal(String name, String name2) {
        if (name == name2) {
            return " have the same name";
        } else
            return " dont have  the same name";
    }
}