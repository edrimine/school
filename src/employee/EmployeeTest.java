package employee;

public class EmployeeTest {
  public static void main(String[] args) {
    Employee emp1 = new Employee("Justin", 26, EmployeeType.FULL_TIME,26.0);
    System.out.println(emp1);

    emp1.setType(EmployeeType.PART_TIME);
    System.out.println(emp1);

    emp1.setType(EmployeeType.SEASONAL);
    System.out.println(emp1);

    emp1.setType(EmployeeType.UNSPECIFIED);
    System.out.println(emp1);
  }
}
