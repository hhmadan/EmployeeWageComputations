//Displaying Welcome message on master branch
//UC1 Check Emp is Present or Absent
package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        if(!attendance())
            System.out.println("Employee is Absent");
        else
            System.out.println("Employee is Present");
    }
    public static boolean attendance(){
        return new Random().nextBoolean();
    }
}
