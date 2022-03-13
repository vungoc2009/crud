package SpringBootCRUD.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SpringBootCRUD.entity.Employee;


@Repository 
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
}
