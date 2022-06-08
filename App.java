import java.util.Scanner;
public class App {
    static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt) {
        System.out.println(prompt);
        String stringInput = inputScanner.next(); 
        return stringInput;
    }
    private static double getDouble(String prompt){
        System.out.println(prompt);
        double doubleInput = inputScanner.nextDouble(); 
        return doubleInput; 
    }
    public static void main(String[] args) {
      //String menu = getString("What would you like to do? (Add,Subtract,Divide, or Multiply)");
      //String result = String.format ("You want to add %f and %f?", num1, num2); 


      //replace true with something that equals True or False
      //replace true with a boolean
      //probably call the boolean something like moveOn
      boolean moveOn = true;
      String menu = App.getString("Hello! What would you like to do? (Add, Subtract, Multiply,or Divide?)");

      while(moveOn){
        String menu2 = App.getString("What would you like to do?");
      double num1 = getDouble("Please enter first number: ");
      
      double num2 = getDouble("Please enter second number:");
    
      Calculator calculator = new Calculator(); 
      
      if (menu.equals("Add")){
      double addResult = calculator.add(num1,num2); 
      System.out.println(addResult); 
      }
      if (menu.equals("Subtract")){
      double subResult = calculator.subtract(num1, num2);
      System.out.println(subResult);
      }
      if (menu.equals("Divide")){
      double divResult = calculator.divide(num1, num2);
      System.out.println(divResult);
      }
      if (menu.equals("Multiply")){
      double mulResult = calculator.multiply(num1, num2); 
      System.out.println(mulResult);
      }

      // first print out the question
      //System.out.println("Calculate again? Y/N"); 

        String response = App.getString("Calculate Again? Y/N"); 
        System.out.println(response);
        moveOn = true; 

        if (response.equals("N")){
            moveOn = false; 
            System.out.println("Goodbye!");

        }
        //make code to set moveOn to true if response is Y
        //else moveOn = false;






      // if yes, do it all again (loop).
      // if no, exit the loop
      // while (true); 
      //1. checks the condtion
      // 2. executes
      //3. checks the ame condtion
      
      } // while loop
    } // main method

} // App class






