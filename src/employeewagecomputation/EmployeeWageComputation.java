//UC9 Create Employee Wage Builder Class to save total wage for each company

package employeewagecomputation;
public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------");
        System.out.println("=====CALCULATING WAGE FOR COMPANY 1=====");
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.saveCompanies();
        //EmpWageBuilder comp2 = new EmpWageBuilder("DEF Pvt Ltd.", 22, 21, 120);

        System.out.println("\nMONTHLY WAGE FOR AN EMPLOYEE OF " + empWageBuilder.getCompanyName() + " IS $" + empWageBuilder.getMonthlyWage()+"\n");
        System.out.println("--------------------------------------------------------------");
        System.out.println("=====CALCULATING WAGE FOR COMPANY 2=====");
        //System.out.println("\nMONTHLY WAGE FOR AN EMPLOYEE OF " + comp2.getCompanyName() + " IS $" + comp2.getMonthlyWage());

    }

}