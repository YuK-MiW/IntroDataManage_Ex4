import java.util.Random;

class Exercise4{
  public static void main(String[] args){
    int dice1;
    int dice2;
    Random r;

    r = new Random();

    // r.nextInt(6) generates 0 to 5
    dice1 = r.nextInt(6) + 1;
    dice2 = r.nextInt(6) + 1;

    System.out.println("Rolling the dice...");
    System.out.println("Dic 1: " + dice1);
    System.out.println("Dic 2: " + dice2);
    System.out.println("Total value: " + (dice1 + dice2));
  }
}
