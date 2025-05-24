package Factory;

public class EmployeeFactory {

    public static Employee getEmployee(String emp)
    {
        if(emp.equalsIgnoreCase("Engineer"))
        {
            return new Engineer();
        }
        else if(emp.equalsIgnoreCase("Doctor"))
        {
            return new Doctor();
        }

        return null;
    }
}
