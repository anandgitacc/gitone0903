package org.testone;

public class EmployeeDetails {

	// method 1
	private void employeeName() {

		System.out.println("Employee Name : Anand");
	}

	// method 2
	private void employeeMobile() {

		System.out.println("Employee Mobile : 8939278836");
	}

	private void employeeStatus() {
			
			System.out.println("Working");
	}
	
	private void employeeCompany() {

		System.out.println("Greens");
		
	}
// >>>>>>> cc488570a714854071c46d8468d19072054e3015
//<<<<<<< HEAD
		
//=======
	

	// main method
	public static void main(String[] args) {

		// obj
		EmployeeDetails e = new EmployeeDetails();

		// method call
		e.employeeName();
		e.employeeMobile();

	}

}
