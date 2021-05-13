
public class EmpWageBuilder {
	public static final  int IS_PART_TIME = 1;// Variable will be a compile time constant
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int DAYS_PER_MONTH = 20;
    public static final int MAX_HOUR_MONTH = 100;
        int empHrs = 0;
        int totalWorkingDays = 0;
	    int totalEmpHrs = 0;
	    //Put the while loop inside a method
        //Using for loop for days per month
	    void calculateTotalwage() 
	    {
        while (totalEmpHrs <=  MAX_HOUR_MONTH && totalWorkingDays < DAYS_PER_MONTH) 
        {
        	totalWorkingDays++;
        int present = (int)Math.floor(Math.random()*10) %3;//Random Condition
        switch (present) // Using Switch case
        {
        case IS_PART_TIME:
        	empHrs = 4;
        	break;
        case IS_FULL_TIME:	
        	empHrs = 8;
        	break;
        	default:
        	empHrs=0;
        	break;
        }
        totalEmpHrs += empHrs;
        System.out.println("Day : " + totalWorkingDays + " Emp Hr: " +empHrs);
        }
        int TotalWage = totalEmpHrs * WAGE_PER_HOUR;
        System.out.println("Total Employee wage of Month: " + TotalWage);
	    }
	    //Inside method created an object emp to call calculateTotalwage method
	    public static void main(String[] args) {
			System.out.println("========> Welcome To The Employee Wage Computation Program ");
			EmpWageBuilder emp = new EmpWageBuilder();
			emp.calculateTotalwage();
        } 
	     
  } 



