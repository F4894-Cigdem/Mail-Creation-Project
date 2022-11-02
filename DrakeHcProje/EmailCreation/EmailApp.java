package DrakeHcProje.EmailCreation;

import java.util.Scanner;

public class EmailApp {

    String firstName;
    String lastName;
    String passWord;
    String department;
    String email;
    String emailSuffix="clarusway.com"; //şirket domaini
    int mailBoxCapacity=1000;
    int defaultPasswordLenght=12;



    public EmailApp(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;

        this.department=setDepartment();
        //System.out.println("department = " + department);

        this.passWord=setRandomPassWord(defaultPasswordLenght);
        //System.out.println("passWord = " + passWord);

        email=firstName.toLowerCase()+"@" + department+emailSuffix;
    }

    /*
    testautomation.
    fullstackdeveloper.
    salesforce.
    hiçbiri
      */

    public String setDepartment() {
        System.out.println("Lütfen aşağıda belirtilen departmanlardan herhangi birini seçiniz...\n"+
                "\n1 Test Automation \n2 Full Stack Developer \n3 Salesforce \n0 Hiçbiri");

        Scanner scanner=new Scanner(System.in);
        int options=scanner.nextInt();

        if(options==1){
            return "test automation";
        } else if (options==2) {
            return "Full Stack Developer";
        } else if(options==3) {
            return "Salesforce";
        }else return
        "";
    }

    public String setRandomPassWord(int lenght) {

        String passWordSet = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char[] passWord = new char[lenght];

        for (int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * passWordSet.length());
            passWord[i] = passWordSet.charAt(random);
        }
        return new String(passWord);
    }

    public String showInfo() {

        return "Ad-Soyad: " +firstName+" "+lastName+ "\n"+
                "Şirket Email: "+email+"\n"+
                "Capacity: " +mailBoxCapacity+"mb \n" +
                "Password: " + passWord;
    }




}
