//UC9 Create Employee Wage Builder Class to save total wage for each company
//UC10 Ability to manage Employee Wage of multiple companies
//UC11 Ability to manage Employee Wage of multiple companies using Interface approach
//UC12 Ability to manage Employee Wage of multiple companies using Interface approach and ArrayList
//UC13 Store Daily Wage
//UC14 Ability to get Total Wage when queried by creating method in EmpWageBuilder

package employeewagecomputation;
public class EmployeeWageComputation {
    public static void main(String[] args) {

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.saveCompanies("ABC Pvt. Ltd.",20, 20, 100);
        empWageBuilder.saveCompanies("DEF Pvt Ltd.", 22, 21, 120);
        empWageBuilder.getMonthlyWage();
        //empWageBuilder.displayDetails();

        String yourQuery = "DEF Pvt Ltd.";
        System.out.println("After Query of Companies for Total Wage..");
        System.out.println("Total Wage for Company "+yourQuery+"==>"+empWageBuilder.getQueried(yourQuery));
        //another query
        String yourQuery1 = "ABC Pvt. Ltd.";
        System.out.println("Total Wage for Company "+yourQuery1+"==>"+empWageBuilder.getQueried(yourQuery1));

    }
}