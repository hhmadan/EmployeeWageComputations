package employeewagecomputation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class EmpWageBuilder implements EmpWageCalculations {
    public final int fullDayHr = 8;
    public final int halfDayHr = 4;
    ArrayList<CompanyEmpWage> al;
    HashMap<String,Integer> totalEmpSalary;
    public EmpWageBuilder(){
        this.al =  new ArrayList<>();
        this.totalEmpSalary = new HashMap<>();
    }
    public void getMonthlyWage(){
        for(CompanyEmpWage companyEmpWage:this.al){
            companyEmpWage.setTotalSalary(this.getMonthlyWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }
    public int getMonthlyWage(CompanyEmpWage companyEmpWage) {
        int salary = 0, totalSalary=0;
        int workingHours = 0, workingDays = 0;
        while (workingDays <= companyEmpWage.workingDaysInMonth && workingHours <= companyEmpWage.workingHoursInMonth) {
            workingDays++;
            if (attendance()==1) {
                switch (fullOrPartTime()) {
                    case 1:
                        workingHours = halfDayHr;
                        salary = workingHours * companyEmpWage.wagePerHr;
                        System.out.println("DAY "+workingDays+"==> Employee present for Half-Day and wage is: $"+salary);
                        break;
                    case 2:
                        workingHours = fullDayHr;
                        salary = workingHours * companyEmpWage.wagePerHr;
                        System.out.println("DAY "+workingDays+"==> Employee present for Full-Day and wage is: $"+salary);
                        break;
                    default:
                }
                totalSalary += salary;
            } else{
                System.out.println("DAY "+workingDays+"==> Employee is Absent and wage is: $0");}
        }
        totalEmpSalary.put(companyEmpWage.companyName,totalSalary);
        //System.out.println("TOTAL SALARY IS: $"+totalSalary);
        return totalSalary;
    }

    public int attendance() {
        return new Random().nextInt(2)+1;
    }
    public static int fullOrPartTime(){
        return new Random().nextInt(2)+1;
    }

    public void saveCompanies(String companyName, int wagePerHr, int workingDaysInMonth, int workingHoursInMonth){
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHr, workingDaysInMonth, workingHoursInMonth);
        al.add(companyEmpWage);
        totalEmpSalary.put(companyName,0);
    }
    public int getQueried(String companyName){
        return totalEmpSalary.get(companyName);
    }
}
