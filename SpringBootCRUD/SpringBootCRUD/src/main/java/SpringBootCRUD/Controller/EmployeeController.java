package SpringBootCRUD.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import SpringBootCRUD.Service.EmployeeService;
import SpringBootCRUD.entity.Employee;

@Controller
public class EmployeeController {
	 @Autowired private EmployeeService employeeservice;
	 
	 @RequestMapping("/")
	 public String index (Model model) {
		 List<Employee> employee = employeeservice.getAllEMployee();
		 model.addAttribute("employees" , employee);
		 return "index";
	 }
	 
	 @RequestMapping(value="/add" , method= RequestMethod.GET)
	 public String addEmployee(Model model) {
		 model.addAttribute("employee", new Employee());
		 return "addEmployee";
	 }
	 
	 @RequestMapping(value ="/edit",method = RequestMethod.GET )
	 public String editEmployee(@RequestParam("id") Long id , Model model) {
		 Optional<Employee> employeeEdit = employeeservice.findEmployeeById(id);
		 employeeEdit.ifPresent(employee ->model.addAttribute("employee",employee));
		 return "editEmployee";
	 }
	 
	 @RequestMapping(value ="/save",method = RequestMethod.POST)
	 public String save(Employee employee) {
		 employeeservice.saveEmployye(employee);
		 return "redirect:/"; 
	 }
	 
	 @RequestMapping(value = "/delete", method = RequestMethod.GET) 
	 public String deleteEmployee(@RequestParam("id") Long id , Model model) {
		 employeeservice.deleteEmployee(id);
		 return "redirect:/"; 
	 }
}
