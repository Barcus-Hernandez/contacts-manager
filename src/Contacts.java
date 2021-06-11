

public class Contacts  {

    private String name;
    private String phoneNumber;

   public Contacts(String name, String phoneNumber) {
       this.name = name;
       this.phoneNumber = phoneNumber;

   }
    public Contacts(){


    }

    public String getPhoneNumber() {
        return phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
    }

    public String getName() {
        return name;
    }



}
