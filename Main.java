import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] value = new int[6];
    System.out.println("exercise 1: ");
    System.out.println(
        "You have six integer values to enter. Type your values- press enter in between each one. The array will print itself out when you have entered all the values needed.");
    for (int x = 0; x < 6; x++) {
      value[x] = in.nextInt();
    }
    System.out.println(Arrays.toString(value));
    // exercise 2
    System.out.println("exercise 2: ");
    Arrays.sort(value);
    System.out.println(Arrays.toString(value));
    // exercise 3
    System.out.println("exercise 3:");
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("I have cleared the screen.");
    System.out.println("Enter a term to search for and press Enter: ");
    int searchQuery = in.nextInt();
    int searchResult=  Arrays.binarySearch(value, searchQuery);
    System.out.println("Your search " + searchQuery + " was found at index " + searchResult);
    System.out.println("If the index was a negative number, no results were found for your search.");
    
  }
}
