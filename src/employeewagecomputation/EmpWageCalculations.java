package employeewagecomputation;

public interface EmpWageCalculations {
    public void saveCompanies(String companyName, int wagePerHr, int workingDaysInMonth, int workingHoursInMonth);
    public void getMonthlyWage();
}
