//UC7 Refactor code using Class Methods and Variables

package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {
        private static int wagePerHr = 20;
        static int fullDayHr = 8;
        static int halfDayHr = 4;
        static int totalEmpHrs=0;
        static int totalWorkingDays;
        static int maxWorkingHrs = 100;
        static int maxWorkingDays = 20;
        static int totalSalary = 0;
        public int getTotalWage(){
            int empHrs = 0, salary = 0;
            while (totalEmpHrs <= maxWorkingHrs && totalWorkingDays <= maxWorkingDays) {
                totalWorkingDays++;
                if (attendance()) {
                    switch (fullOrPartTime()) {
                        case 1:
                            System.out.println("Employee present for Half-Day");
                            empHrs = halfDayHr;
                            salary = empHrs * wagePerHr;
                            break;
                        case 2:
                            System.out.println("Employee present for Full-Day");
                            empHrs = fullDayHr;
                            salary = empHrs * wagePerHr;
                            break;
                        default:
                    }
                    totalEmpHrs += empHrs;
                    totalSalary += salary;
                } else{
                    System.out.println("Employee is Absent");}
            }

            System.out.println("Total Salary is: $"+totalSalary);
            return totalSalary;
        }

            public static int fullOrPartTime(){
            return new Random().nextInt(2)+1;
        }
            public static boolean attendance(){
            return new Random().nextBoolean();
            }

        public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageComputation e = new EmployeeWageComputation();
        e.getTotalWage();
    }

}