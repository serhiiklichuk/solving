package Problem2Solving;

import java.util.ArrayList;
import java.util.List;

public class EmployeeNode<T extends Employee> {
    private T data = null;
    private List<EmployeeNode<T>> children = new ArrayList<>();
    private EmployeeNode<T> parent = null;

    public EmployeeNode(T data) {
        this.data = data;
    }

    public void addChild(EmployeeNode<T> child) {
        child.setParent(this);
        child.data.setCurrentBoss(this.data);
        this.children.add(child);
        this.data.addReport(child.data);
    }

    public void addChild(T data) {
        EmployeeNode<T> newChild = new EmployeeNode<T>(data);
        this.addChild(newChild);
    }

    public void addChildren(List<EmployeeNode<T>> children) {
        for(EmployeeNode<T> t : children) {
            t.setParent(this);
            t.data.setCurrentBoss(this.data);
        }
        this.children.addAll(children);
        for (EmployeeNode<T> c : children) {
            this.data.addReport(c.data);
        }
    }

    public List<EmployeeNode<T>> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(EmployeeNode<T> parent) {
        this.parent = parent;
    }

    public void setParent(T parent) {
        EmployeeNode<T> newParent = new EmployeeNode<T>(parent);
        setParent(newParent);
    }

    public EmployeeNode<T> getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return "Employee{" + data + "}";
    }
}
