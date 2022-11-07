package org.zerock.mapper.lecture;

import java.util.List;

import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;

public interface Mapper11 {
	int updateCustomer(JavaBean18 customer);

	JavaBean18 getCustomerById(int id);
	
	JavaBean19 getSupplierById(int id);

	int updateSupplier(JavaBean19 supplier);

	void updateBank(int i, int j);
	
	int insertCustomer(JavaBean18 customer);
	
	int insertSupplier(JavaBean19 supplier);

	int deleteCustomer(int id);

	int deleteSupplier(int id);

	List<JavaBean18> getCustomers();

	List<JavaBean19> getSuppliers();
	
}
