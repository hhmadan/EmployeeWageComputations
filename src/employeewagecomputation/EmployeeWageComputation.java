//UC9 Create Employee Wage Builder Class to save total wage for each company
//UC10 Ability to manage Employee Wage of multiple companies
//UC11 Ability to manage Employee Wage of multiple companies using Interface approach
//UC12 Ability to manage Employee Wage of multiple companies using Interface approach and ArrayList
//UC13 Store Daily Wage

package employeewagecomputation;
public class EmployeeWageComputation {
    public static void main(String[] args) {

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.saveCompanies("ABC Pvt. Ltd.",20, 20, 100);
        empWageBuilder.saveCompanies("DEF Pvt Ltd.", 22, 21, 120);
        empWageBuilder.getMonthlyWage();
        empWageBuilder.displayDetails();
    }
}