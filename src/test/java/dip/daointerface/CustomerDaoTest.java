package dip.daointerface;

import dip.daoimplementation.SimpleCustomerDao;
import dip.entity.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class CustomerDaoTest {

    private CustomerDao customerDao;

    @Before
    public void setUpCustomerDaoInstance() {
        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        customerDao = new SimpleCustomerDao(customers);
    }

    @Test
    public void givenCustomerDaoInstance_whenCalledFindById_thenCorrect() {
        assertTrue(Objects.nonNull(customerDao.findById(1)));
        assertTrue(customerDao.findById(1) instanceof Optional);
    }

    @Test
    public void givenCustomerDaoInstance_whenCalledFindAll_thenCorrect() {
        assertTrue(Objects.nonNull(customerDao.findAll()));
        assertTrue(customerDao.findAll() instanceof List);
    }

    @Test
    public void givenCustomerDaoInstance_whenCalledFindByIdWithNullCustomer_thenCorrect() throws Exception {
        Map<Integer, Customer> customers = new HashMap<Integer, Customer>();
        customers.put(1, null);

        CustomerDao customerDaoObject = new SimpleCustomerDao(customers);

        Customer customer = customerDaoObject.findById(1).orElseGet(() -> new Customer("Non-existing customer"));

        assertEquals("Non-existing customer", customer.getName());
    }
}