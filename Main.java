import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //CREATE SCANNER OBJECT, COLLECT EACH SIDE FROM USER AND SAVE IT TO ITS RESPECTIVE VARIABLE
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter side 1");

    double side1 = myObj.nextDouble(); 

    Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter side 2");

    double side2 = myObj1.nextDouble(); 

    Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter side 3");

    double side3 = myObj2.nextDouble(); 

    //CREATE OBJECT FOR BOX CLASS
    //SEND THE USER DATA TO THE CLASS TO HELP BUILD OBJECT

    Box b = new Box(side1,side2,side3);

    //CALL EACH FUNCTION WITH RESPECT TO THE OBJECT AND PRINT EACH RESULT

    System.out.println(b.volume());
    System.out.println(b.surfaceArea());
    System.out.println(b.toString());
    System.out.println(b.accessS1());
    System.out.println(b.accessS2());
    System.out.println(b.accessS3());
    System.out.println(b.mutateS1());
    System.out.println(b.mutateS2());
    System.out.println(b.mutateS3());

    
  }
}