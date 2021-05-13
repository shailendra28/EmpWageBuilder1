public class EmpWageBuilder {
	public static final  int IS_PART_TIME = 1;// Variable will be a compile time constant
    public static final int IS_FULL_TIME = 2;
    private int WAGE_PER_HOUR;
	private int DAYS_PER_MONTH;
	private int MAX_HOUR_MONTH;
	//Created Method along with parameter
    //Put the while loop inside a method
    public EmpWageBuilder(String company, int WAGE_PER_HOUR, int  DAYS_PER_MONTH, int MAX_HOUR_MONTH)
    { 
    	this.WAGE_PER_HOUR =  WAGE_PER_HOUR;
    	this. DAYS_PER_MONTH = DAYS_PER_MONTH;
    	this.MAX_HOUR_MONTH = MAX_HOUR_MONTH;
    }
    public void computeEmpWage()
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
        
	    }
	  }
	    public static void main(String[] args) {
		  System.out.println("========> Welcome To The Employee Wage Computation Program ");
		  EmpWageBuilder DMart = new EmpWageBuilder("Dmart", 20,29,100);
		  DMart.computeEmpWage();
		  System.out.println(DMart);
        } 
	     
  } 



