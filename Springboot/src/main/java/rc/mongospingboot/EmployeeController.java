package rc.mongospingboot;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class EmployeeController {
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/all")
    public List<Employee> getAll(){
        List<Employee> employees = this.employeeRepository.findAll();
        return employees;
    }

}
