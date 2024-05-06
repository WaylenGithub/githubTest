package costCalculator;

public class AthleteInfo {


    //for athlete name
    private String name;

    // for training plan
    private String trainingPlan;

    //for current weight
    private double currentWeight;

    // for competition weight category
    private String compWtCat;

    //for number of competition entered this month
    private int noCompEnt;

    //for private hour coaching
    private double privateHourCoaching;

    //getter setter method
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTrainingPlan() {
        return trainingPlan;
    }
    public void setTrainingPlan(String trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }
    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public String getCompWtCat() {
        return compWtCat;
    }
    public void setCompWtCat(String compWtCat) {
        this.compWtCat = compWtCat;
    }

    public int getNoCompEnt() {
        return noCompEnt;
    }
    public void setNoCompEnt(int noCompEnt) {
        this.noCompEnt = noCompEnt;
    }

    public double getPrivateHourCoaching() {
        return privateHourCoaching;
    }
    public void setPrivateHourCoaching(double privateHourCoaching) {
        this.privateHourCoaching = privateHourCoaching;
    }

}
