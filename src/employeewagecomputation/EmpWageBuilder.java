package employeewagecomputation;

import java.util.Random;

public class EmpWageBuilder {
    private static final int fullDayHr = 8;
    private static final int halfDayHr = 4;
    private final String companyName;
    private final int wagePerHr;
    private final int workingDaysInMonth;
    private final int workingHoursInMonth;

    public EmpWageBuilder(String companyName, int wagePerHr, int workingDaysInMonth, int workingHoursInMonth) {
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
                        System.out.println("DAY "+workingDays+"==> Employee present for Half-Day and wage is: $"+salary);
                        break;
                    case 2:
                        workingHours = fullDayHr;
                        salary = workingHours * wagePerHr;
                        System.out.println("DAY "+workingDays+"==> Employee present for Full-Day and wage is: $"+salary);

                        break;
                    default:
                }
                totalSalary += salary;
            } else{
                System.out.println("DAY "+workingDays+"==> Employee is Absent and wage is: $0");}
        }

        //System.out.println("TOTAL SALARY IS: $"+totalSalary);
        return totalSalary;
    }

    public int attendance() {
        return new Random().nextInt(2)+1;
    }
    public static int fullOrPartTime(){
        return new Random().nextInt(2)+1;
    }
}
