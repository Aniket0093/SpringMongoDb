package rc.mongospingboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private EmployeeRepository employeeRepository;

    public DbSeeder(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee Ron = new Employee(
                "Ron",
                "Developer",
                12,
                new Address("Paris", "France"),
                Arrays.asList(
                        new Department("Technology", 2)
                )
        );

        Employee John = new Employee(
                "John",
                "Senior Developer",
                11,
                new Address("CA", "USA"),
                Arrays.asList(
                        new Department("Technology", 2)
                )
        );

        Employee Bob = new Employee(
                "Bob",
                "Manager",
                10,
                new Address("Bucharest", "Romania"),
                Arrays.asList(
                        new Department("Management", 3)
                )
        );

        Employee Smith = new Employee(
                "Smith",
                "Senior Manager",
                9,
                new Address("Rome", "Italy"),
                Arrays.asList(
                        new Department("Management", 3)
                )
        );

        // drop all employees
        this.employeeRepository.deleteAll();

        //add employees to the database
        List<Employee> employees = Arrays.asList(Ron, John, Bob, Smith);
        this.employeeRepository.saveAll(employees);
    }
}
