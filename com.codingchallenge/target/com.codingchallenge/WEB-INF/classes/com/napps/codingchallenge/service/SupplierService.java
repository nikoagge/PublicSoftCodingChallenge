package com.napps.codingchallenge.service;


import java.util.List;
import com.napps.crudspringbootrestapi.entity.Supplier;


public interface SupplierService {

	
	Supplier saveSupplier(Supplier supplier);
	
	Supplier updateSupplier(Supplier supplier);
	
	List<Supplier> getAllSuppliers();
	
	Supplier getSupplier(Long supplierId);
	
	Supplier getSupplier(String companyName);
	
	Supplier getSupplier(Int vatNumber);
	
	void deleteSupplier(Long supplierId);
}
