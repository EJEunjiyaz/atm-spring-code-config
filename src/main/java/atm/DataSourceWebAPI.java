package atm;

import java.util.HashMap;
import java.util.Map;

public class DataSourceWebAPI implements DataSource{

    @Override
    public Map<Integer, Customer> readCustomers() {
        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1 , new Customer(1, "Mind", 1111, 100));
        customers.put(2 , new Customer(2, "Aom", 2222, 2000));
        customers.put(3 , new Customer(3, "Ploy", 3333, 30000));

        return customers;
    }
}