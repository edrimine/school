package employee;

public class EmployeeTest {
  public static void main(String[] args) {
    Employee emp1 = new Employee("Justin", 26, EmployeeType.FULL_TIME);
    System.out.println(emp1);
    emp1.setType(EmployeeType.PART_TIME);
    System.out.println(emp1);
    emp1.setName("Justin Kohl");
    System.out.println(emp1);
    emp1.setAge(25);
    System.out.println(emp1);
  }
}
