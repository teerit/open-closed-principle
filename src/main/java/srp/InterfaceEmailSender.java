package srp;

public interface InterfaceEmailSender {
    public interface IEmailSender {
        public void sendEmail(Employee employee, InterfaceEmailContent content);
    }
}
