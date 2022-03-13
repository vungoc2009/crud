package SpringBootCRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootCRUD.Repository.EmployeeRepository;
import SpringBootCRUD.entity.Employee;
@Service 
public class EmloyeeServiceIML implements EmployeeService{
	@Autowired private EmployeeRepository employeerepository;
	@Override
	public List<Employee> getAllEMployee() {
	
		return (List<Employee>) employeerepository.findAll();
	}
	@Override
	public void saveEmployye(Employee employee) {
		employeerepository.save(employee);
		
	}
	@Override
	public void deleteEmployee(Long id) {
		employeerepository.deleteById(id);
		
	}
	@Override
	public Optional<Employee> findEmployeeById(Long id) {
		
		return employeerepository.findById(id);
	}

}
