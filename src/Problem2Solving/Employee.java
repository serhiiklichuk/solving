package Problem2Solving;

import java.util.ArrayList;

public class Employee {

    private int employeeId;
    private String name;
    private int age;
    private String address;
    private ArrayList<Employee> currentReports = new ArrayList<>();
    private Employee currentBoss;

    public Employee(int employeeId, String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Employee> getCurrentReports() {
        return currentReports;
    }

    public void setCurrentReports(ArrayList<Employee> currentReports) {
        this.currentReports = currentReports;
    }

    public void addReport(Employee employee) {
        this.currentReports.add(employee);
    }

    public Employee getCurrentBoss() {
        return currentBoss;
    }

    public void setCurrentBoss(Employee currentBoss) {
        this.currentBoss = currentBoss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name)
                .append(": ")
                .append("boss{")
                .append(currentBoss != null ? currentBoss.name : null)
                .append("}, ")
                .append("reports{ ");
        for (Employee report : currentReports) {
            sb.append(report != null ? report.name : null)
                    .append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
}
