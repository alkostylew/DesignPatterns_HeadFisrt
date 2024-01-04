package headfirst.builder;

public class main {
    public static void main(String[] args) {

        Employee employee = Employee.builder()
                .id(1)
                .name("aleks")
                .role("achitecte")
                .salary(250000.00)
                .build();

        System.out.println(employee);

    }
}
