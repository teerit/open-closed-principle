package srp;

public interface InterfaceEmployeeStore {
    public Employee getEmployeeById(Long id);

    public void addEmployee(Employee employee);
}
