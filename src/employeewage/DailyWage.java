package employeewage;

public class DailyWage extends AbsentPresent implements IWageCalculation{
	 static int dailyWage;
	    public int wageOfEmp(int day, int wage,int hours) {

	        if(AbsentPresent()==1)
	        {
	            dailyWage= wage*hours;
	            System.out.println("Employee is present \n His daily wage is "+dailyWage);
	        }
	        else {
	            System.out.println("Employee is absent  \n His daily wage is 0");
	            dailyWage=0;
	        }

	        return dailyWage;

	    }
}
