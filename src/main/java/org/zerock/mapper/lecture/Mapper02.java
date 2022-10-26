package org.zerock.mapper.lecture;

import java.time.LocalDate;
import java.util.List;

public interface Mapper02 {
	
	List<String> getCustomerNames();

	List<Integer> getCustomerId();
	
	List<Double> getProductPrices();

	List<LocalDate> getEmployeeBirthDate();
}
