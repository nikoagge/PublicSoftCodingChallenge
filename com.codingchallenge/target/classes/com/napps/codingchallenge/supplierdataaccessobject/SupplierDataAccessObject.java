package com.napps.codingchallenge.supplierdataaccessobject;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.napps.crudspringbootrestapi.entity.Employee;
import com.napps.crudspringbootrestapi.entity.Supplier;


@Repository
public interface SupplierDataAccessObject extends JpaRepository<Supplier, Long> {

}
