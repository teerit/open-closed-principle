package dip.daointerface;

import dip.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    Optional<Customer> findById(int id);

    List<Customer> findAll();
}
