package furama_resort.commons;

import furama_resort.models.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        int result = customer1.getName().compareTo(customer2.getName());
        if (result == 0) {
            return customer1.getBirthDayToDate().compareTo(customer2.getBirthDayToDate());
        } else {
            return result;
        }
    }
}
