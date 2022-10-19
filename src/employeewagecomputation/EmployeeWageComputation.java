//Displaying Welcome message on master branch
//UC4 Calculate Daily wage in terms of Part Time and Full Time Wage of Employee Using Switch Case

package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

        static int wagePerHr = 20;
        static int fullDayHr = 8;
        static int halfDayHr = 4;
        static int dailyWage;
        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program");

            switch(fullOrPartTime()){
                case 1:
                    System.out.println("Employee present for Half-Day and wage is: $"+(halfDayHr * wagePerHr));
                    break;
                case 2:
                    System.out.println("Employee present for Full-Day and wage is: $"+(fullDayHr * wagePerHr));
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
        }
        public static int fullOrPartTime(){
            return new Random().nextInt(3);
        }
        public static boolean attendance(){
            return new Random().nextBoolean();
        }
}
