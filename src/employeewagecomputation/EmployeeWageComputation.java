//UC6 Calculate Wages till a condition of total working hours or days is reached for a month
// Assume 100 hours and 20 days

package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String args[])
    {

        final int wagePerHr = 20;
        final int maxWorkingDays = 20;
        final int maxWorkingHrs = 100;

        int totalWage = 0;
        int workingHrs;
        System.out.printf("%5s   | %5s|   %5s   |  %5s\n", "DAY#", "WORKING HRS", "WAGE", "TOTAL WORKING HRS");
        for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays
                && totalWorkingHrs < maxWorkingHrs; day++, totalWorkingHrs += workingHrs)
        {

            int empType = new Random().nextInt(3)+1;
            switch (empType)
            {
                case 1:
                    workingHrs = 8;
                    break;
                case 2:
                    workingHrs = 4;
                    break;
                default:
                    workingHrs = 0;
                    break;
            }
            int wage = workingHrs * wagePerHr;
            totalWage += wage;
            System.out.printf("%5d   |  %5d     |   %5d   |   %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);

        }
        System.out.println("Total wage for a month is $" + totalWage);
    }
}
