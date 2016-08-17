package employee;

public class Employee extends Person {
  EmployeeType type;


	/**
	* Default empty Employee constructor
	*/
	public Employee() {
		super();
    this.type = EmployeeType.UNSPECIFIED;
	}

	/**
	* Default Employee constructor
	*/
	public Employee(String name, int age, EmployeeType type) {
		super(name, age);
    this.type = type;
	}

  public void setType(EmployeeType type){
    this.type = type;
  }

  public EmployeeType getType(){
    return type;
  }

	/**
	* Create string representation of Employee for printing
	* @return
	*/
	@Override
	public String toString() {
    boolean bonus;

    return "Employee name:\t" + getName() + "\nEmployee age:\t" + getAge() + "\nEmployee type:\t" + getType() +"\n";
	}
}
