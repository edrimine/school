package employee;

public class Person {
  private String name;
  private int age;

	/**
	* Default empty Person constructor
	*/
	public Person() {
		super();
	}

	/**
	* Default Person constructor
	*/
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of age
	* @return
	*/
	public int getAge() {
		return age;
	}

	/**
	* Sets new value of age
	* @param
	*/
	public void setAge(int age) {
		this.age = age;
	}

}
