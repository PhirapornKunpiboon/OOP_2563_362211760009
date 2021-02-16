package LAB8;

import java.util.ArrayList;
import java.util.Scanner;


public class CompanyApp {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.setPid("1805566471");
        emp1.setName("phiraporn");
        emp1.setAge(22);
        emp1.setGender("female");
        emp1.setTel("0859467715");
        emp1.setEmpID("emp001");
        emp1.setPosition("Programmer");
        emp1.setSalary(30000.00);

        //display object data
        System.out.println(emp1.toString());

        ArrayList<Employee>myEmp = new ArrayList<Employee>();
        for (int i = 0; i < 3; i++ ){
            //input data to object
            System.out.println("Please,enter emp1 info"+(i+1)+": ");
            Employee c = inputDataObject();
            myEmp.add(c);

            //display data in ArrayList
            displayObject(myEmp);

    }//main
}
    private static void displayObject(ArrayList<Employee> myEmp) {

    }

    private static Employee inputDataObject() {
        Scanner sc = new Scanner(System.in);



        return ;
    }
    }
