//Displaying Welcome message on master branch
//UC4 Calculate wages for a month

package employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String args[])
    {
    final int wagePerHr = 20;
    final int workingDays = 20;

    int totalWage = 0;
        for (int day = 1; day <= workingDays; day++) {
            int empType = new Random().nextInt(3)+1;
            int workingHours =0;
            switch (empType)
            {
                case 1 :
                    System.out.println("Employee is Present for Full-Day");
                    workingHours = 8;
                    break;
                case 2:
                    System.out.println("Employee is Present for Half-Day");
                    workingHours = 4;
                    break;
                default:
                    System.out.println("Employee is ABSENT");
            }
            int wage = workingHours * wagePerHr;
            System.out.println("Day " + day + " wage is: $" + wage);
            totalWage += wage;
        }
    System.out.println("\nTOTAL WAGE FOR A MONTH IS: $" + totalWage);
    }
}
