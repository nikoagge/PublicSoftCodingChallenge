package com.napps.codingchallenge.service.implementation;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.napps.crudspringbootrestapi.employeedataaccessobject.EmployeeDataAccessObject;
import com.napps.crudspringbootrestapi.entity.Employee;
import com.napps.crudspringbootrestapi.service.EmployeeService;


@Service
public class SupplierServiceImplementation implements SupplierService {

	
	@Autowired
	private SupplierDataAccessObject supplierDataAccessObject;
	
	
	@Override
	public Supplier saveSupplier(Supplier supplier) {
		
		// TODO Auto-generated method stub
		return supplierDataAccessObject.save(supplier);
	}


	@Override
	public Employee updateSupplier(Supplier supplier) {
		
		// TODO Auto-generated method stub
		return supplierDataAccessObject.saveAndFlush(supplier);
	}

	
	@Override
	public List<Supplier> getAllSuppliers() {
		
		// TODO Auto-generated method stub
		return supplierDataAccessObject.findAll();
	}

	
	@Override
	public Supplier getSupplier(Long supplierId) {
		
		// TODO Auto-generated method stub
		return supplierDataAccessObject.findOne(supplierId);
	}

	@Override
	public Supplier getSupplier(String companyName) {
		
		// TODO Auto-generated method stub
		return supplierDataAccessObject.findOne(companyName);
	}
	
	@Override
	public Supplier getSupplier(Int vatNumber) {
		
		// TODO Auto-generated method stub
		return supplierDataAccessObject.findOne(vatNumber);
	}
	
	
	@Override
	public void deleteSupplier(Long supplierId) {
		
		// TODO Auto-generated method stub
		supplierDataAccessObject.delete(supplierId);
	}
}








@Service
public class EmployeeServiceImplementation implements EmployeeService {

	
	@Autowired
	private EmployeeDataAccessObject employeeDataAccessObject;
	
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		// TODO Auto-generated method stub
		return employeeDataAccessObject.save(employee);
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		
		// TODO Auto-generated method stub
		return employeeDataAccessObject.saveAndFlush(employee);
	}

	
	@Override
	public List<Employee> getAllEmployees() {
		
		// TODO Auto-generated method stub
		return employeeDataAccessObject.findAll();
	}

	
	@Override
	public Employee getEmployee(Long employeeId) {
		
		// TODO Auto-generated method stub
		return employeeDataAccessObject.findOne(employeeId);
	}

	
	@Override
	public void deleteEmployee(Long employeeId) {
		
		// TODO Auto-generated method stub
		employeeDataAccessObject.delete(employeeId);
	}
}
