import Problem2Solving.Employee;
import Problem2Solving.EmployeeDataSource;
import Problem2Solving.EmployeeTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Problem2SolvingTest {

    @Test
    public void testGetEmployeeByName() {
        EmployeeTree<Employee> records = EmployeeDataSource.getEmployeeRecords();

        Employee testEmployee = records.getEmployeeByName(EmployeeDataSource.WILL);
        Assertions.assertEquals(EmployeeDataSource.WILL, testEmployee.getName());
    }

    @Test
    public void testAddEmployee() {
        EmployeeTree<Employee> records = EmployeeDataSource.getEmployeeRecords();

        Employee newEmployee = new Employee(99, "Jeremy", 24,"Belgium");
        records.addEmployee(newEmployee, records.getEmployeeByName(EmployeeDataSource.WILL));

        Assertions.assertEquals(newEmployee, records.getEmployeeByName("Jeremy"));
    }

    @Test
    public void testGetEmployeesByName() {
        EmployeeTree<Employee> records = EmployeeDataSource.getEmployeeRecords();

        Employee newEmployee1 = new Employee(100, "Lucy", 28,"China");
        Employee newEmployee2 = new Employee(101, "Lucy", 29,"Japan");
        Employee newEmployee3 = new Employee(102, "Lucy", 30,"Korea");
        records.addEmployee(newEmployee1, records.getEmployeeByName(EmployeeDataSource.WILL));
        records.addEmployee(newEmployee2, records.getEmployeeByName(EmployeeDataSource.WILL));
        records.addEmployee(newEmployee3, records.getEmployeeByName(EmployeeDataSource.WILL));

        List<Employee> testEmployees = records.getEmployeesByName("Lucy");
        for (Employee e: testEmployees) {
            Assertions.assertEquals("Lucy", e.getName());
        }
    }
}
