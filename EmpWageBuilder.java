public class EmpWageBuilder {

	public static void main(String[] args) {
		System.out.println("========> Welcome To The Employee Wage Computation Program <========");
		// Condition to check Employee Attendance
		int EmpCheck = 1;
        double present = Math.floor(Math.random()*10) %2;
        if (present==EmpCheck)
        	System.out.println("Employee is present");
        else
        	
        	System.out.println("Employee is abscent");

	}

}
