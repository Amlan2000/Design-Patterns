import Factory.Employee;
import Factory.EmployeeFactory;

public class FactoryMain {

    public static void main(String[] args)
    {
        System.out.printf("Hello and welcome to Factory Main!\n");

        // This way is also fine, however it keeps the system tightly coupled and client has to handle the object creation
//        Employee e1 = new Doctor();
//        System.out.println(e1.getSalary());
//
//        Employee e2 = new Engineer();
//        System.out.println(e2.getSalary());

        // Using factory method
        Employee e1= EmployeeFactory.getEmployee("Doctor");
        System.out.println(e1.getSalary());

        Employee e2= EmployeeFactory.getEmployee("Engineer");
        System.out.println(e2.getSalary());

    }
}
