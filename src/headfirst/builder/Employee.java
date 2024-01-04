package headfirst.builder;

public class Employee {

    private int id;
    private String name;
    private String role;
    private Double salary;

    private Employee() {
    }

    private Employee(int id, String name, String role, Double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        private int id;
        private String name;
        private String role;
        private Double salary;

        EmployeeBuilder() {
        }

        public EmployeeBuilder id(int id) {
            this.id = id;
            return this;
        }
        public EmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }
        public EmployeeBuilder role(String role) {
            this.role = role;
            return this;
        }
        public EmployeeBuilder salary(Double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this.id, this.name, this.role, this.salary);
        }
    }
}
