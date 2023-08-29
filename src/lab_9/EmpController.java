package lab_9;

import java.util.Arrays;
import java.util.List;

public class EmpController {
    public int getTotalSalary(List<EmpAbs> employeeList) {
        int totalSalary = 0;

        for (EmpAbs empAbs : employeeList) {
            totalSalary += empAbs.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {

        EmpAbs e1 = new FTEAbs();
        EmpAbs e2 = new FTEAbs();
        EmpAbs e3 = new FTEAbs();
        EmpAbs c1 = new ContractorEmpAbs();
        EmpAbs c2 = new ContractorEmpAbs();
        EmpController empController = new EmpController();
        System.out.println("Total Salary:" + empController.getTotalSalary(Arrays.asList(e1, e2, e3, c1, c2)));
    }
}
