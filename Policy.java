public class Policy 
{
    // Attributes of the insurance policy
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;  // in inches
    private double weight;  // in pounds

    //no-arg constructor
    public Policy() {
        policyNumber = 0;
        providerName = "N/A";
        firstName = "N/A";
        lastName = "N/A";
        age = 0;
        smokingStatus = "N/A";
        height = 0.0;
        weight = 0.0;
    }

    /**
       Constructor with arguments to initialize all fields
       @param
    */
    public Policy(int pNum, String pName, String fName, 
                  String lName, int a, String sS, double h, double w) {
        policyNumber = pNum;
        providerName = pName;
        firstName = fName;
        lastName = lName;
        age = a;
        smokingStatus = sS;
        height = h;
        weight = w;
    }

    // Getters and Setters (Accessor and Mutator methods)
    
      /**
         Accessor (getter) method
         @return policy number      
      */
    public int getPolicyNumber() {
        return policyNumber;
    }

      /**
         Mutator (setter) method
         @param pNum policy number      
      */
    public void setPolicyNumber(int pNum) {
        policyNumber = pNum;
    }
      /**
         Accessor (getter) method
         @return provider name     
      */
    public String getProviderName() {
        return providerName;
    }
      /**
         Mutator (setter) method
         @param pName provider name    
      */
    public void setProviderName(String pName) {
        providerName = pName;
    }
      /**
         Accessor (getter) method
         @return first name      
      */
    public String getFirstName() {
        return firstName;
    }
      /**
         Mutator (setter) method
         @param fName first name   
      */
    public void setFirstName(String fName) {
        firstName = fName;
    }
      /**
         Accessor (getter) method
         @return last name      
      */
    public String getLastName() {
        return lastName;
    }
      /**
         Mutator (setter) method
         @param lName last name
      */
    public void setLastName(String lName) {
        lastName = lName;
    }
      /**
         Accessor (getter) method
         @return age      
      */
    public int getAge() {
        return age;
    }
      /**
         Mutator (setter) method
         @param a age     
      */
    public void setAge(int a) {
        age = a;
    }
      /**
         Accessor (getter) method
         @return smoking status      
      */
    public String getSmokingStatus() {
        return smokingStatus;
    }
      /**
         Mutator (setter) method
         @param sS smoking status      
      */
    public void setSmokingStatus(String sS) {
        smokingStatus = sS;
    }
      /**
         Accessor (getter) method
         @return height      
      */
    public double getHeight() {
        return height;
    }
      /**
         Mutator (setter) method
         @param h height     
      */
    public void setHeight(double h) {
        height = h;
    }
      /**
         Accessor (getter) method
         @return weight      
      */
    public double getWeight() {
        return weight;
    }
      /**
         Mutator (getter) method
         @param w weight      
      */
    public void setWeight(double w) {
        weight = w;
    }

    // Method to calculate BMI (Body Mass Index)
    public double calculateBMI() {
        if (height == 0.0) {  // To avoid division by zero
            return 0.0;
        }
        return (weight * 703.0) / (height * height);
    }

    // Method to calculate the price of the insurance policy
    public double calculateInsurancePrice() {
        double baseFee = 600;
        double additionalFee = 0;

        // Additional fee for policyholder over 50 years old
        if (age > 50) {
            additionalFee += 75;
        }

        // Additional fee for smokers
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            additionalFee += 100;
        }

        // BMI calculation and additional fee if BMI > 35
        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }

        return baseFee + additionalFee;
    }
}