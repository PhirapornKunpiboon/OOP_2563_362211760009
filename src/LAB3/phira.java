
package LAB3;

        import java.util.Scanner;

public class phira {
    public static void main(String[] args) {
        Scanner ph = new Scanner(System.in);
        int count = 0;

        while(count<3){
            System.out.print("Username : ");
            String aa = ph.nextLine();

            System.out.print("Password : ");
            String bb = ph.nextLine();
            if(aa.equals("admin") && bb.equals("saiyai"))
            {
                System.out.println("Welcome to MT Website.");
                break;
            }
            else {
                System.out.println("username or password not correct." );
                count++;
            }
            if(count==3)
            {
                System.out.println("You account has been locked.Please, contect admin.");
            }
        }//while


    }//main
}//class
