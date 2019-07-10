import java.util.Random;
import java.util.Scanner;

class Exercise4{
  public static void main(String[] args){

    System.out.println("Welcome to DiceGame!");
    System.out.print("How many people do you play?\n> ");

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    for(int i = 0; i < num; i++){
    System.out.println("\nPlayer " + (i+1));
    DiceRoll();
      }
    }

  public static void DiceRoll(){
    int dice1;
    int dice2;
    int total;
    Random r;
    String str;

    r = new Random();
    str = Greet();

    // r.nextInt(6) generates 0 to 5
    dice1 = r.nextInt(6) + 1;
    dice2 = r.nextInt(6) + 1;
    total = dice1 + dice2;

    System.out.println("Rolling the dice...");
    System.out.println("Dic 1: " + dice1);
    System.out.println("Dic 2: " + dice2);
    System.out.println("Total value: " + total);

    if(total >= 7)System.out.println(str + " won!");
    else System.out.println(str + " lost!");
  }

  public static String Greet(){
    System.out.print("What is your name?\n> ");
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    System.out.println("Hello, " + str + "!");
    return str;
  }
}
