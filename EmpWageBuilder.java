public class EmpWageBuilder {

	public static void main(String[] args) {
		System.out.println("========> Welcome To The Employee Wage Computation Program <========");
		// Condition to check Employee Attendance
		int WAGE_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int empWage = 0;
		int EmpCheck = 1;
        double present = Math.floor(Math.random()*10) %2;
        if (present==EmpCheck)
        	System.out.println("Employee is present");
        else
        	System.out.println("Employee is abscent not Earn");
        // Condition for Daily Employee Wage
        if (present==EmpCheck)
        	empWage= WAGE_PER_HOUR*FULL_DAY_HOUR;
        System.out.println("Emp Wage : " +empWage);

	}

}
