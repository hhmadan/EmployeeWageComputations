//UC8 Compute Employee wage for Multiple Companies

package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {
    private static final int fullDayHr = 8;
    private static final int halfDayHr = 4;
    private final String companyName;
    private final int wagePerHr;
    private final int workingDaysInMonth;
    private final int workingHoursInMonth;

    public EmployeeWageComputation(String companyName, int wagePerHr, int workingDaysInMonth, int workingHoursInMonth) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.workingDaysInMonth = workingDaysInMonth;
        this.workingHoursInMonth = workingHoursInMonth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getMonthlyWage() {
        int salary = 0, totalSalary=0;
        int workingHours = 0, workingDays = 0;
        while (workingDays <= workingDaysInMonth && workingHours <= workingHoursInMonth) {
            workingDays++;
            if (attendance()==1) {
                switch (fullOrPartTime()) {
                    case 1:
                        workingHours = halfDayHr;
                        salary = workingHours * wagePerHr;
                        System.out.println("Employee present for Half-Day and today,s wage is: $"+salary);
                        break;
                    case 2:
                        workingHours = fullDayHr;
                        salary = workingHours * wagePerHr;
                        System.out.println("Employee present for Full-Day and today,s wage is: $"+salary);

                        break;
                    default:
                }
                totalSalary += salary;
            } else{
                System.out.println("Employee is Absent");}
        }

        System.out.println("Total Salary is: $"+totalSalary);
        return totalSalary;
    }

    public int attendance() {
        return new Random().nextInt(2)+1;
    }
    public static int fullOrPartTime(){
        return new Random().nextInt(2)+1;

    }

    public static void main(String[] args) {

        System.out.println("=====CALCULATING WAGE FOR COMPANY 1=====");
        EmployeeWageComputation comp1 = new EmployeeWageComputation("ABC Pvt Ltd.", 20, 20, 100);
        EmployeeWageComputation comp2 = new EmployeeWageComputation("DEF Pvt Ltd.", 22, 21, 120);

        System.out.println("\nMonthly wage for an employee of " + comp1.getCompanyName() + " is $" + comp1.getMonthlyWage()+"\n");
        System.out.println("=====CALCULATING WAGE FOR COMPANY 2=====");
        System.out.println("\nMonthly wage for an employee of " + comp2.getCompanyName() + " is $" + comp2.getMonthlyWage());
    }

}