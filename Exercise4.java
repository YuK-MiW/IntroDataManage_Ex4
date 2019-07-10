import java.util.Random;
import java.util.Scanner;
/*
class Greet{
  void Greet(){
    System.out.print("What is your name?\n> ");
  }
}
*/

class Exercise4{
  public static void main(String[] args){
    int dice1;
    int dice2;
    Random r;

    r = new Random();

    Greet();

    // r.nextInt(6) generates 0 to 5
    dice1 = r.nextInt(6) + 1;
    dice2 = r.nextInt(6) + 1;

    System.out.println("Rolling the dice...");
    System.out.println("Dic 1: " + dice1);
    System.out.println("Dic 2: " + dice2);
    System.out.println("Total value: " + (dice1 + dice2));
  }

  public static void Greet(){
    System.out.print("What is your name?\n> ");
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    System.out.println("Hello, " + str + "!");

  }

}
