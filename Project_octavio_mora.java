import java.util.Scanner;

public class Project_octavio_mora 
{
    //Main method for testing the Policy class
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;
        
        //Read input from user
        System.out.println("Please enter the Policy Number: ");
        policyNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Please enter the Provider Name: ");
        providerName = keyboard.nextLine();
        System.out.println("Please enter the Policyholder's First Name: ");
        firstName = keyboard.nextLine();
        System.out.println("Please enter the Policyholder's Last Name: ");
        lastName = keyboard.nextLine();
        System.out.println("Please enter the Policyholder's Age: ");
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        smokingStatus = keyboard.nextLine();
        System.out.println("Please enter the Policyholder's Height (in inches): ");
        height = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Please enter the Policyholder's Weight (in pounds): ");
        weight = keyboard.nextDouble();
        keyboard.nextLine();
        
        //Instantiate a Policy Object
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName,
                                   age, smokingStatus, height, weight);

        //Display policy details
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        
        //Display policyholder details
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");

        // Calculate and display BMI and Insurance price
        double bmi = policy.calculateBMI();
        System.out.println("Policyholder's BMI: " + String.format("%.2f", bmi));
        double price = policy.calculateInsurancePrice();
        System.out.println("Policy Price: $" + String.format("%.2f", price));
    }
}