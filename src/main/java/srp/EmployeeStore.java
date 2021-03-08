package srp;

public class EmployeeStore implements InterfaceEmployeeStore {

    //inject in runtime
    private InterfaceEmailSender emailSender;

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {

    }
}
