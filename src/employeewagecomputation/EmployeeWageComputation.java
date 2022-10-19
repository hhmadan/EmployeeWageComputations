//Displaying Welcome message on master branch
//UC3 Calculate Daily wage in terms of Part Time and Full Time Wage of Employee

package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHr = 20;
        int fullDayHr = 8;
        int halfDayHr = 4;
        int dailyWage;

        if(attendance()) {
//            System.out.println("Employee is Present");
            if (fullOrPartTime()==1){
                dailyWage = wagePerHr * fullDayHr;
                System.out.println("Employee present for Full-Day and wage is: $"+dailyWage);
            }
            else {
                dailyWage = wagePerHr * halfDayHr;
                System.out.println("Employee present for Half-Day and wage is: $"+dailyWage);
            }
        }
        else
            System.out.println("Employee is Absent");
    }
    public static int fullOrPartTime(){
        return new Random().nextInt(2);
    }
    public static boolean attendance(){
        return new Random().nextBoolean();
    }
}
