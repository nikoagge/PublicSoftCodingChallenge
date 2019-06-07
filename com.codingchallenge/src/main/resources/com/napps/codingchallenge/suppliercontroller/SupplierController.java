package com.napps.codingchallenge.suppliercontroller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.napps.crudspringbootrestapi.entity.Employee;
import com.napps.crudspringbootrestapi.service.EmployeeService;


@RequestMapping("supplier")
@RestController
public class SupplierController {

	
	@Autowired
	private SupplierService supplierService;
	
	
	@PostMapping("/save")
	public Supplier save(@RequestBody Supplier supplier) {
		
		return supplierService.saveSupplier(supplier);
	}
	
	
	@PutMapping("/update")
	public Supplier update(@RequestBody Supplier supplier) {
		
		return supplierService.updateSupplier(supplier);
	}
	
	
	@GetMapping("/all")
	public List<Supplier> getAllSuppliers() {
		
		return supplierService.getAllSuppliers();
	}
	
	
	@GetMapping("/by/{supplierId}")
	public Supplier getSupplier(@PathVariable(name = "supplierId") Long supplierId) {
		
		return supplierService.getSupplier(supplierId);
	}
	
	@GetMapping("/by/{companyName}")
	public Supplier getSupplier(@PathVariable(name = "companyName") String companyName) {
		
		return supplierService.getSupplier(companyName);
	}
	
	
	@GetMapping("/by/{vatNumber}")
	public Supplier getSupplier(@PathVariable(name = "vatNumber") Int vatNumber) {
		
		return supplierService.getSupplier(vatNumber);
	}
	
	
	@DeleteMapping("/delete/{supplierId}")
	public void deleteSupplier(@PathVariable(name = "supplierId") Long supplierId) {
		
		supplierService.deleteSupplier(supplierId);
	}
}







@RequestMapping("employee")
@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}
	
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee) {
		
		return employeeService.updateEmployee(employee);
	}
	
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		
		return employeeService.getAllEmployees();
	}
	
	
	@GetMapping("/by/{employeeId}")
	public Employee getEmployee(@PathVariable(name = "employeeId") Long employeeId) {
		
		return employeeService.getEmployee(employeeId);
	}
	
	
	@DeleteMapping("/delete/{employeeId}")
	public void deleteEmployee(@PathVariable(name = "employeeId") Long employeeId) {
		
		employeeService.deleteEmployee(employeeId);
	}
}
