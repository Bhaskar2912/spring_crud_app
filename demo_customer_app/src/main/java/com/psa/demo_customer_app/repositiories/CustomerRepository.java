package com.psa.demo_customer_app.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.psa.demo_customer_app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long > {

}