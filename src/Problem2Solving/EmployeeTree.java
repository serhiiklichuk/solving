package Problem2Solving;

import com.sun.istack.internal.Nullable;

import java.util.*;

public class EmployeeTree<T extends Employee> {

    private final Set<EmployeeNode<T>> employees = new LinkedHashSet<EmployeeNode<T>>();

    /**
     * (a)  Write a function to add employee records.
     *
     * This method add employee.
     * Also if this employee has a boss, will add employee to his children.
     */
    public void addEmployee(T employee, @Nullable T boss) {
        if (boss != null) {
            for (EmployeeNode<T> en : employees) {
                if (en.getData().equals(boss)) {
                    en.addChild(employee);
                }
            }
        }
        EmployeeNode<T> employeeNode = new EmployeeNode<T>(employee);
        employees.add(employeeNode);
        employeeNode.setParent(boss);
    }


    /**
     * (b) Write a function to return an employee record by given name for reading and writing.
     *
     * It gets the first employee with the following name;
     */
    public T getEmployeeByName(String name) {
        for (EmployeeNode<T> e: employees) {
            if (e.getData().getName().equals(name)) {
                return e.getData();
            }
        }
        return null;
    }

    /**
     * (b) Write a function to return an employee record by given name for reading and writing.
     *
     * It wasn't unclear in task description, could employees have equal names,
     * so in the case it is possible, i decided to add this method,
     * in order to get all employees with the following name
     */
    public List<T> getEmployeesByName(String name) {
        List<T> namedEmployees = new ArrayList<>();
        for (EmployeeNode<T> e: employees) {
            if (e.getData().getName().equals(name)) {
                namedEmployees.add(e.getData());
            }
        }
        return namedEmployees;
    }

    @Override
    public String toString() {
        return "EmployeeTree{" +
                "employees=" + employees +
                '}';
    }
}
