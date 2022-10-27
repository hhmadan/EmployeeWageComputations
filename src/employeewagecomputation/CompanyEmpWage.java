package employeewagecomputation;

public class CompanyEmpWage {
    public String companyName;
    public int wagePerHr;
    public int workingDaysInMonth;
    public int workingHoursInMonth;
    public int totalSalary =0;

    public CompanyEmpWage (String companyName, int wagePerHr, int workingDaysInMonth, int workingHoursInMonth) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.workingDaysInMonth = workingDaysInMonth;
        this.workingHoursInMonth = workingHoursInMonth;
    }
    public void setTotalSalary(int totalSalary){
        this.totalSalary= totalSalary;
    }

    public String toString() {
        return
                "\nTOTAL SALARY OF EMPLOYEE OF "+this.companyName+" IS: $"+this.totalSalary+"\n";
    }



}
