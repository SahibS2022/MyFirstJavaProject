package learningEncapsulation;

public class EmployeeDetails {
	private int empId;// declared class Level variable named as empId of DataType Integer with private
						// access modifier
	private String empName;// declared class Level variable named as empName of DataType String with
							// private access modifier
	private int empAge;// declared class Level variable named as empAge of DataType Integer with
						// private access modifier

	// Constructor of a class
	public EmployeeDetails(int employeeId, String empName, int empAge) {
		this.empId = employeeId;
		this.empName = empName;
		this.empAge = empAge;
	}

	// Getter and Setter methods
	// get method to get the employee Id
	public int getEmployeeId() {
		return empId;
	}

	// get method to get the employee Name
	public String getEmployeeName() {
		return empName;
	}

	// get method to get the employee Age
	public int getEmployeeAge() {
		return empAge;
	}

	// method to update the current employee Age
	public boolean updateEmployeeAge(int currentEmpId, int currentAge, int newAge) {
		if (this.empId == currentEmpId) {
			if (empAge == currentAge) {
				empAge = newAge;
				return true;
			} else {
				System.out.println("You must enter correct employee age to update");
			}
		} else {
			System.out.println("You have entered Incorrect Employee ID");
		}
		return false;
	}

	// method to print the user details by using Class level Variables
	public void getUserDetails() {
		System.out.println("Employee Details :\n");
		System.out.println("Id  : " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Age : " + empAge);
	}

}
