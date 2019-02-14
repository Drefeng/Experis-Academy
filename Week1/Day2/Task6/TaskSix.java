/**
 * @author Thinh To, Billy Infante
 */

public class TaskSix{
    public static void main(String[]args){
        double height, weight, bmi;
        if(args.length > 1){
            weight = Double.parseDouble(args[0]);
            height = Double.parseDouble(args[1]);  
        }
        else{
        System.out.println("Require two input arguments");
        return;
    }

        if(weight <= 0 || height <= 0){
            System.out.println("Can't be negative or zero");
            return;
        }

        bmi = weight / (height * height) ;   
        
        if(bmi < 18.5){
            System.out.println("BMI: " + bmi +  " You're are underweight");

        }
        else if(bmi >=18.5 && bmi <= 24.9){
            System.out.println("BMI:" + bmi + " You're weight is normal.");
        }
        else if(bmi >= 25 && bmi <= 29.9){
            System.out.println("BMI: " + bmi +  " You're over overweight");

        }
        else if(bmi > 30){
            System.out.println("BMI: " + bmi +  " You're obese!");
        }
    }
}