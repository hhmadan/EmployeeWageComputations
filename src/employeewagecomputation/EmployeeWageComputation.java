//Displaying Welcome message on master branch
//UC2 Calculate Daily Wage of Employee

package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHr = 20;
        int fullDayHr = 8;
        int dailyWage;

        if(attendance()) {
            System.out.println("Employee is Present");
            dailyWage = wagePerHr * fullDayHr;
            System.out.println("\nDaily wage of Employee is: "+ dailyWage);
        }
        else
            System.out.println("Employee is Absent");
    }
    public static boolean attendance(){
        return new Random().nextBoolean();
    }
}
