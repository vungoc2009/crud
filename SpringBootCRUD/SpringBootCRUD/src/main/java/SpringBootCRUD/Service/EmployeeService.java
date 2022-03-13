package SpringBootCRUD.Service;

import java.util.List;
import java.util.Optional;

import SpringBootCRUD.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEMployee() ;
	
	void saveEmployye(Employee employee);
	
	void deleteEmployee(Long id);
	
	Optional<Employee> findEmployeeById(Long id);
}
