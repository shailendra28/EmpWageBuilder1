
public class EmpWageBuilder {
	public static final  int IS_PART_TIME = 1;// Variable will be a compile time constant
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int DAYS_PER_MONTH = 20;
	public static void main(String[] args) {
		System.out.println("========> Welcome To The Employee Wage Computation Program ");
	    int empHrs = 0;
        int empWage = 0;
        int TotalWage = 0;
        //Using for loop for days per month
        for (int day = 0; day<DAYS_PER_MONTH ; day++) {
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
        empWage = empHrs * WAGE_PER_HOUR;//Calculating Employee Wage
        TotalWage += empWage; //Calculating Total Employee Wage
        System.out.println("Employee Wage is : " +empWage);
        } 
        System.out.println("Total Employee wage of Month :" + TotalWage);
     } 
}


