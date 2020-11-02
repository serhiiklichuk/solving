package Problem2Solving;

public class EmployeeDataSource {

    public static final String JOHN = "John";
    public static final String MARY = "Mary";
    public static final String PETER = "Peter";
    public static final String MICHAEL = "Michael";
    public static final String SAM = "Sam";
    public static final String WILL = "Will";
    public static final String JACKIE = "Jackie";
    public static final String FRANK = "Frank";

    public static EmployeeTree<Employee> getEmployeeRecords() {
        EmployeeTree<Employee> employeeTree = new EmployeeTree<Employee>();

        Employee john = new Employee(1, JOHN, 23, "USA");
        Employee mary = new Employee(2, MARY, 24, "Great Britain");
        Employee peter = new Employee(3, PETER, 30, "Italia");
        Employee michael = new Employee(4, MICHAEL, 20, "Spain");
        Employee sam = new Employee(5, SAM, 31, "Russia");
        Employee will = new Employee(6, WILL, 25, "Ukraine");
        Employee jackie = new Employee(7, JACKIE, 19, "Poland");
        Employee frank = new Employee(8, FRANK, 18, "France");

        employeeTree.addEmployee(john, null);
        employeeTree.addEmployee(mary, employeeTree.getEmployeeByName(JOHN));
        employeeTree.addEmployee(peter, employeeTree.getEmployeeByName(JOHN));
        employeeTree.addEmployee(michael, employeeTree.getEmployeeByName(JOHN));
        employeeTree.addEmployee(sam, employeeTree.getEmployeeByName(MARY));
        employeeTree.addEmployee(will, employeeTree.getEmployeeByName(MARY));
        employeeTree.addEmployee(jackie, employeeTree.getEmployeeByName(WILL));
        employeeTree.addEmployee(frank, employeeTree.getEmployeeByName(WILL));

        return employeeTree;
    }
}
