package lab_7.BaiTap1;

import java.util.Arrays;
import java.util.List;

public class SalaryController {

    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new FullTimeEmployee();
        Employee e3 = new FullTimeEmployee();
        Employee c1 = new ContractEmployee();
        Employee c2 = new ContractEmployee();
        SalaryController salarcontroller = new SalaryController();
        System.out.println("Total Salary:" + salarcontroller.getTotalSalary(Arrays.asList(e1, e2, e3, c1, c2)));
    }
}
