public class Contacts extends ContactsUpdate {

    private String firstName;
    private String lastName;
    private int phoneNumber;

    public Contacts (String firstName, String lastName, int phoneNumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;


    }

    public String getString () {
        return this.firstName + " " + this.lastName + " PH:" + this.phoneNumber;
    }

    public static void main(String[] args) {
        ContactsUpdate contact = new Contacts("Alex","Hernandez","123456789");

    }

}
