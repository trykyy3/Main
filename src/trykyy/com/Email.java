package trykyy.com;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName, lastName, department,password,alternateEmail;
    private int mailBoxCapacity;
    private int defaultPasswordLenght = 10;
    private String email;
    private String companySuffix = "company.com";



    //Costruttore per avere nome e cognome //

public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;

    //chiamata al method dipartimento per darci il dipartimento
    this.department = setDepartment();
    System.out.println("Dipartimento: " + this.department);
    //chiamata al method password per darci una password
    this.password = randomPassword(defaultPasswordLenght);
    System.out.println("Your password is: " + this.password);
    // generare email
    email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "." + "@" + department + "." + companySuffix;
    System.out.println("your email is: " + email);

}
        public String setDepartment() {
            System.out.println("Lista dipartimenti: ");
            System.out.println("1. for sales");
            System.out.println("2. for development");
            System.out.println("3. for accounting");
            System.out.println("0. for none ");
            System.out.println("inserisci il tuo dipartimento: ");

            var in = new Scanner(System.in);
            int depChoice = in.nextInt();
            if (depChoice == 1) {return "sales";}
            else if (depChoice == 2) {return "development";}
            else if (depChoice == 3) {return "accounting";}
            else {return "";}
}
    private String randomPassword(int lenght) {

    String passwordSet = "ABCDQWEJTOIQWJ%$£%JOI112859051";
    char[] password = new char[lenght];
    for (int i=0; i<lenght; i++) {
        int rand = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rand);

    }
    return new String(password); }


    public String showInfo() {
        System.out.println("------------------");
    return "DISPLAY NAME : " + firstName + " " + lastName +
            "\nCOMPANY EMAIL : " + email +
            "\nMAIL BOX CAPACITY " + mailBoxCapacity + "mb";
    }




    //setters
    public void setAlternateEmail(String alternateEmail) {this.alternateEmail = alternateEmail;}
    public void setMailBoxCapacity(int mailBoxCapacity) {this.mailBoxCapacity = mailBoxCapacity;}
    public void setPassword(String password) {this.password = password;}

    //getters

    public String getPassword() {return password;}
    public String getAlternateEmail() {return alternateEmail;}
    public int getMailBoxCapacity() {return mailBoxCapacity;}



}
