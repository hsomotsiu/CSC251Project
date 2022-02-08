public class Policy {
    //private instance variables
    
    private int policyNumber;
    private String policyProvider;
    private String firstName;
    private String lastName;
    private int age;
    private boolean smoking;
    private double height;
    private double weight;
    
    /*
    https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
    we can refer to any member of the current object from within an 
    instance method or a constructor by using "this" keyword.   
    */
    
    /* No-arg constructor and (set default values for all fields), we can also
    declare it above at instance variables as int policyNumber = 0; 
    */
    
    Policy(){
    this.policyNumber = 0;
    this.policyProvider = "";
    this.firstName = "";
    this.lastName = "";
    this.age = 0;
    this.smoking = false;
    this.height = 0.0;
    this.weight = 0.0;
    }
    
   /* Constructor with arguments */
    Policy(int policyNumber,String policyProvider,String firstName,String lastName,int age,boolean smoking,double height,double weight){
        this.policyNumber = policyNumber;
        this.policyProvider = policyProvider;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age  = age;
        this.smoking = smoking;
        this.height = height;
        this.weight = weight;
    }
    
   //Calculate BMI
    
   public double getBMI()
   {
       return (weight * 703 ) / (height*height );
      
   }
   // Calculate policy price
   
   public double getPolicyPrice()
   {
       double basePrice=600;
       
       //Check if age is over 50
       if(age>50){
           basePrice+=75;
       }
       //Check person is smoker
       if(smoking==true)
           basePrice+=100;
       //Check BMI is above 40
       if(getBMI()>35)
           basePrice+=(getBMI() - 35 ) * 20.0 ;
      
       //return policy cost
       return basePrice;
   }
   
   // setters 
   public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPolicyProvider(String policyProvider) {
        this.policyProvider = policyProvider;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    // getters
    
    public int getPolicyNumber() {
        return policyNumber;
    }
    public String getPolicyProvider() {
        return policyProvider;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }

    public boolean getSmoking() {
        return smoking;
    }
    
    //get details of policy in string form
   public String toString(){
       String output = "";
       /*
       I started with create an empty string and use += to assign the result to our string output variable
       */           
        output +="Policy Number: "+ policyNumber + "\n";
        output +="Provider Name: "+ policyProvider + "\n";
        output +="Policyholder's First Name: "+ firstName + "\n";
        output +="Policyholder's Last Name: "+ lastName + "\n";
        output +="Policyholder's Age: "+ age + "\n";
        /* this is the short version of if else statement(Ternary Operator)
        instead of if smoking == true{print("smoker")} esle{print("non-smoker")} */
        output +="Policyholder’s Smoking Status: "+ (smoking==true?"smoker":"non-smoker") + "\n";
        output +="Policyholder's Height: "+ height + " inches"+ "\n";
        output +="Policyholder's Weight: "+ weight +" pounds"+ "\n";
        /*
        https://www.javatpoint.com/java-string-format
        This method supports various data types and formats them into a string type.
        */
        output +="Policyholder's BMI: "+ String.format("%.2f",getBMI())+"\n";
        output +="Policy Price: $"+ String.format("%.2f",getPolicyPrice())+"\n";
          
       return output;  
   }
}
