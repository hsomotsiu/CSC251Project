import java.util.Scanner;
public class Project_Hsomot_Siu {
    public static void main(String[] args) {
        // TODO code application logic here
      

       //create an instance of Scanner class
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = sc.nextInt();
        System.out.print("Please enter the Provider Name: ");
        /*because the Scanner.nextInt method does not read the newline character in my 
        input and so the call to Scanner.nextLine returns after reading that newline. = clear buffer
        https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo */
        sc.nextLine(); //clear buffer
        String policyProvider = sc.nextLine();
        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Please enter the Policyholder's Age: ");
        int age = sc.nextInt();
        System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
        sc.nextLine();//clear buffer
        String smoke = sc.nextLine();
        /* Since string can not be converted into a boolean and our Policy argument is boolean type 
        we can compare our input with "smoker" using compareTo */
        boolean smoker = (smoke.compareTo("smoker")==0);
        /* "compareTo" is a method that compares two strings lexicographically 
        java string compareTo return value 0, negative, positive and
        in this case if our input the same as "smoker" then 0==0 true,
         otherwise -1==0 false, 1==0 false    
        https://www.tutorialspoint.com/java/lang/string_compareto.htm 
        */
        System.out.print("Please enter the Policyholder's Height(in inches): ");
        double height = sc.nextDouble();
        System.out.print("Please enter the Policyholder's Weight(in inches): ");
        double weight = sc.nextDouble();
        System.out.println();

      
       //create a Policy object
       Policy policy = new Policy(policyNumber,policyProvider,firstName,lastName,age,smoker,height,weight);
       
       System.out.println(policy);
      
      
      
    }
}
