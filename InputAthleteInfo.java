package costCalculator;

import java.util.Scanner;

public class InputAthleteInfo extends AthleteInfo{

    public void acceptAthleteInput() {

        System.out.println("Welcome to North Sussex Judo Athlete Training center");

        Scanner scan = new Scanner(System.in);

        //for athlete name input
        while (true) {
            System.out.println("Please enter your name");
            setName(scan.nextLine());

            //expression to check user input name is valid or not
            String regexp = "([A-Z][a-z]+)(\\s[A-Z][a-z]+)*";
            if (getName().matches(regexp)) {
                break;//break out of the loop if the input is valid
            } else {
                System.out.println("please try again, your name is invalid!!");

            }
        }

            //for training plan inputS
            while (true) {
                System.out.println("In our training center, there are three training plan:'Beginner', 'Intermediate','Elite', Please Choose one!! ");
                setTrainingPlan(scan.nextLine());

                //expression to check the input training plan

                if (getTrainingPlan().equalsIgnoreCase("Beginner") || getTrainingPlan().equalsIgnoreCase("Intermediate") || getTrainingPlan().equalsIgnoreCase("Elite")) {
                    break;
                } else {
                    System.out.println("your input plan is invalid, please try again");
                }

            }

            //for current weight input
            while(true){
                System.out.println("Please Enter your current weight");
                boolean isDouble= false;
                while(isDouble==false){
                    scan=new Scanner(System.in);
                    // expression to check the current weight input
                    if(scan.hasNextDouble()){
                        setCurrentWeight(scan.nextDouble());
                        isDouble=true;

                    }
                    else {
                        System.out.println("invalid current weight, Please try again");
                        isDouble=false;
                    }


                }
                if (getCurrentWeight()>=0){
                    break;
                }
                else{
                    System.out.println("invalid input , the current weight can't be negative");
                }


            }



        if(getCurrentWeight() > 100.0) {
            setCompWtCat("Heavyweight");
            System.out.println("Heavy Weight");
        } else if(getCurrentWeight() >= 90.1 && getCurrentWeight() <= 100.0) {
            setCompWtCat("Light Heavy Weight");
            System.out.println("Light-heavyweight");
        } else if(getCurrentWeight() >= 81.1 && getCurrentWeight() <= 90.0) {
            setCompWtCat("Middle Weight");
            System.out.println("Middleweight");
        } else if(getCurrentWeight() >= 73.1 && getCurrentWeight() <= 81.0) {
            setCompWtCat("Light-middleWeight");
            System.out.println("Light-middleweight");
        } else if(getCurrentWeight() >= 66.1 && getCurrentWeight() <= 73.0) {
            setCompWtCat("Light Weight");
            System.out.println("Lightweight");
        } else {
            setCompWtCat("Fly Weight");
            System.out.println("Flyweight");
        }



        //for no of competition entered this month

        if(getTrainingPlan().equalsIgnoreCase("Beginner")){
            setNoCompEnt(0);
        }
        else{
            System.out.println("Enter no of competition entered this month");
           while(true) {
               boolean isInteger = false;

               while (isInteger == false) {

                   scan = new Scanner(System.in);
                   if (scan.hasNextInt()) {
                       setNoCompEnt(scan.nextInt());
                       isInteger = true;
                   } else {
                       System.out.println("Invalid input, please enter integer value");
                       isInteger = false;

                   }
               }
               int noOfComp=getNoCompEnt();
               if(noOfComp>=0){
                   break;
               }
               else {
                   System.out.println("no negative value, please try again positive value");
               }

           }
        }


        // for private coaching input

        // for private coaching input


        // for private coaching input
        while(true){
            System.out.println("Do you want private coaching or not? please say 'yes' or 'no' ");
            scan=new Scanner(System.in);
            String ans=scan.nextLine();
            if(ans.equalsIgnoreCase("yes")){
                System.out.println("Please Enter the no of hours for private coaching");
                boolean isDouble= false;
                while(isDouble==false){
                    scan=new Scanner(System.in);


                    //checking private coaching input
                    if(scan.hasNextDouble()){
                        setPrivateHourCoaching(scan.nextDouble());
                        isDouble=true;
                    }
                    else{
                        System.out.println("please enter a valid number");
                        isDouble=false;
                    }


                }
                double noOfHour=getPrivateHourCoaching();
                if(noOfHour<0 || noOfHour>5){
                    System.out.println("please try again, athletes can have 5 hours of maximun private hours coaching");
                }
                else{ break;


            }

        }
            else{
                break;
            }

    }


    }}

 //if(ans.equalsIgnoreCase("yes")){