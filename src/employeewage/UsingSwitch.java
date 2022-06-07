package employeewage;

public class UsingSwitch extends AbsentPresent implements ISolvingWithSwitch {
	static int dailyWage;
    public int wageWithSwitch(int day, int wage) {

        switch (AbsentPresent())
        {
            case 1:
                dailyWage = day*wage;
                System.out.println("Employee is present today \n His daily wage is :"+dailyWage+"\n-------------");
                break;
            case 0:
                dailyWage = 0;
                System.out.println("Employee is absent today \n His daily wage is :"+dailyWage+"\n-------------");
                break;
        }
        return dailyWage;
    }

}
