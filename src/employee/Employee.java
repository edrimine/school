package employee;

public class Employee extends Person {
  	private EmployeeType type;
    private double rate;

	/**
	* Default empty Employee constructor
	*/
	public Employee() {
		super();
        this.type = EmployeeType.UNSPECIFIED;
        this.rate = 0;
	}

	/**
	* Default Employee constructor
	*/
	public Employee(String name, int age, EmployeeType type, double rate) {
		super(name, age);
        this.type = type;
        this.rate = rate;
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
        return "Employee name:\t" + getName() + "\nEmployee age:\t" + getAge() + "\nEmployee type:\t" + getType() +"\n" +
                "Rate:\t\t\t" + getRate() + "\nWeekly wage:\t" + calcPay() + "\n";
	}

	public double calcPay(){
		double weeklyPay = 0;
	    switch (type){
            case PART_TIME:
                weeklyPay = getRate() * 20;
                break;
            case FULL_TIME:
                weeklyPay = getRate() * 40;
                break;
            case SEASONAL:
                weeklyPay = getRate() * 30;
                break;
            case UNSPECIFIED:
                weeklyPay = getRate();
                break;
        }
	    return weeklyPay;
	}

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
