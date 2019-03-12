/**
 * Created by 114596 on 3/12/2019.
 */
abstract class Contacts{
    private String name;

    public Contacts(String name) {
        this.name = name;
    }

    public abstract void action();

}

class  Email extends Contacts{
    private String mail;

    public Email(String name, String mail) {
        super(name);
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Email{" +
                "mail='" + mail + '\'' +
                '}';
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public void action() {
        System.out.println( "Emailing to" + mail);
    }
}
class  Phone extends Contacts{
    private String phoneN;

    public Phone(String name, String phoneN) {
        super(name);
        this.phoneN = phoneN;
    }

    public String getPhoneN() {
        return phoneN;
    }

    public void setPhoneN(String phoneN) {
        this.phoneN = phoneN;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneN='" + phoneN + '\'' +
                '}';
    }

    @Override
    public void action() {
        System.out.println("calling " + phoneN);
    }
}
public class Main{
    public static void main(String[] args) {
        Email h1 = new Email("jek","hola@hotmail.com");
        Phone p1 = new Phone("jekku","6140663636");
        h1.action();
        p1.action();
    }
}