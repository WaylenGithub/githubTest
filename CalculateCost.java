package costCalculator;
import java.text.DecimalFormat;
public class CalculateCost extends InputAthleteInfo{
    private final DecimalFormat df;
    public CalculateCost() {
        this.df = new DecimalFormat();
        this.df.setMaximumFractionDigits(2);
    }
    //Method to print athlete name and cost break down

    // Event-driven aspect: Method calls as response to events
    public void showOutPut(){
        System.out.println("Athlete's name: "+getName());

        double trainingCost=calculateTrainingCost();
        System.out.println("Training cost: $ " + df.format(trainingCost));

        double privateTrainingCost=calculatePrivateTrainingCost();
        System.out.println("Private cost: $ " + df.format(privateTrainingCost));

        double competitionFee=calculateCompetitionFee();
        System.out.println("Competition Fee:$ "+ df.format(competitionFee));

        double totalCost = trainingCost + privateTrainingCost + competitionFee;
        System.out.println("Total cost of training and competitions for the month: $" + df.format(totalCost));

        String weightCategory = getCompWtCat().trim().toLowerCase();
        double competitionWeight = 0.0;

        if(getCurrentWeight() > 100.0)
            System.out.println("Heavyweight");
        else if(getCurrentWeight() >= 90.1 && getCurrentWeight() <= 100.0)
            System.out.println("Light-heavyweight");
        else if(getCurrentWeight() >= 81.1 && getCurrentWeight() <= 90.0)
            System.out.println("Middleweight");
        else if(getCurrentWeight() >= 73.1 && getCurrentWeight() <= 81.0)
            System.out.println("Light-middleweight");
        else if(getCurrentWeight() >= 66.1 && getCurrentWeight() <= 73.0)
            System.out.println("Lightweight");
        else
            System.out.println("Flyweight");

        Double weightDifference= getCurrentWeight()- competitionWeight;
        boolean matchWeight=weightDifference>=0;
        
        printWeightComparison(matchWeight, weightCategory, weightDifference);
    }
    public double calculateTrainingCost() {

        double cost= 0.0;
        switch (getTrainingPlan()){
            case "Beginner":
                cost=4*25.00;
                break;
            case "Intermediate":
                cost=4*30.00;
                break;
            case "Elite":
                cost=4*35.00;
                break;
        }

        return cost;
    }

    public double calculatePrivateTrainingCost() {
        return getPrivateHourCoaching()*9.0;
    }

    public double calculateCompetitionFee() {
        return getNoCompEnt()*22.00;
    }


    public void printWeightComparison(boolean matchWeight, String weightCategory, Double weightDifference) {

        if (matchWeight) {
            System.out.println(getName() + "'s current weight matches with '" + weightCategory + "' in competition weight category.");
        }


    }

}


