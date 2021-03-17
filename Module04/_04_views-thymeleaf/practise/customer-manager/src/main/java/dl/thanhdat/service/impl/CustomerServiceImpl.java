package dl.thanhdat.service.impl;

import com.mysql.cj.xdevapi.SessionFactory;
import dl.thanhdat.model.Customer;
import dl.thanhdat.service.ICustomerService;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}
