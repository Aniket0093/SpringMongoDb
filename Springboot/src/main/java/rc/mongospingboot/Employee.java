package rc.mongospingboot;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Employee")
public class Employee {
    @Id
    private String id;
    private String name;
    private String role;
    @Indexed(direction = IndexDirection.ASCENDING)
    private int level;
    private Address address;
    private List<Department> departments;

    protected Employee() {
        this.departments = new ArrayList<>();
    }

    public Employee(String name,String role, int level, Address address, List<Department> deparments) {
        this.name = name;
        this.role = role;
        this.level = level;
        this.address = address;
        this.departments = departments;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getLevel() {
        return level;
    }

    public Address getAddress() {
        return address;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
