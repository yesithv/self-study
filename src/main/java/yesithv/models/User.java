package yesithv.models;

import yesithv.interfaces.Customer;
import yesithv.interfaces.Employee;
import lombok.Data;

/**
 * User inherits the behaviours of Customer and Employee
 */
@Data
public class User implements Customer, Employee {

    private String userName;
    private String password;

    @Override
    public void customerPlaceTask() {

    }

    @Override
    public void employeeClockIn() {

    }

}
