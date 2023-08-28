public class StepTracker {
    //properties
    private int minimumSteps;

    private int totalSteps;

    private int dailySteps;


    private int days;

    private int activeDays;

    //constructor
    public StepTracker(int minimumSteps){
        this.minimumSteps = minimumSteps;

    }
    //methods
    public int activeDays(){
        return activeDays;


    }

    public double averageSteps(){
        if(days>0) {
            return totalSteps / days;
        }
        else return 0;

    }

    public void addDailySteps(int steps){
        this.dailySteps = steps;
        totalSteps += steps;
        days+=1;
        if(dailySteps>=minimumSteps){
            activeDays+=1;
        }

    }

    public int getDays(){
        return days;

    }

    public int getStepsForActiveDay(){
        return minimumSteps;

    }

    public int getTotalSteps(){
        return totalSteps;

    }

    public int getActiveDays(){
        return activeDays;

    }






}
