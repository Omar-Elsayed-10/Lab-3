public class EvenOrOdd {
  public static void main(String[] args) {

    int randomNumber = (int)(Math.random() * 100) + 1;
    System.out.println("Generated random number: " + randomNumber);

    // 2. Check if the number is even or odd using modulo (%)
    // The modulo operator returns the remainder of a division.
    if (randomNumber % 2 == 0) {

      System.out.println("The number " + randomNumber + " is EVEN because " + randomNumber + " % 2 = 0.");
    } else {

      System.out.println("The number " + randomNumber + " is ODD because " + randomNumber + " % 2 != 0.");
    }
  }
}