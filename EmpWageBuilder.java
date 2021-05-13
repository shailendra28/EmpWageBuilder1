
public class EmpWageBuilder {
	public static final  int IS_PART_TIME = 1;// Variable will be a compile time constant
    public static final int IS_FULL_TIME = 2;
    //Created Method along with parameter
    //Put the while loop inside a method
    public static int calculateTotalwage(String company, int WAGE_PER_HOUR, int  DAYS_PER_MONTH, int MAX_HOUR_MONTH)
    { 
	    int empHrs = 0;
        int totalWorkingDays = 0;
	    int totalEmpHrs = 0;
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
        System.out.println("Total Employee wage of Company: " + TotalWage);
        return TotalWage;
	    }
	  }
	    
	    //Inside main method parameter work as input
	    public static void main(String[] args) {
		  System.out.println("========> Welcome To The Employee Wage Computation Program ");
		  calculateTotalwage("DMart", 20, 20, 100);
			calculateTotalwage("Reliance", 30, 15, 150);
        } 
	     
  } 



