import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("input how long you want the array to be and press enter: ");
    int xlength = in.nextInt();
    int[] value = new int[xlength];
    System.out.println("exercise 1: ");
    wait(2000);
    System.out.println("You have " + xlength
        + " integer values to enter. Type your values- press enter in between each one. The array will print itself out when you have entered all the values needed.");
    for (int x = 0; x < xlength; x++) {
      value[x] = in.nextInt();
    }
    System.out.println(Arrays.toString(value));
    // exercise 2
    System.out.println("exercise 2: ");
    wait(2000);
    Arrays.sort(value);
    System.out.println(Arrays.toString(value));
    // exercise 3
    System.out.println("exercise 3:");
    wait(2000);
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("I have cleared the screen.");
    wait(2000);
    System.out.println("Enter a term to search for and press Enter: ");
    int searchQuery = in.nextInt();
    int searchResult = Arrays.binarySearch(value, searchQuery);
    wait(2000);
    System.out.println("Your search " + searchQuery + " was found at index " + searchResult);
    wait(500);
    System.out.println("If the index was a negative number, no results were found for your search.");
    System.out.println();
    // exercise 4
    System.out.println("exercise 4: ");
    wait(2000);
    int[] value2 = Arrays.copyOf(value, xlength);
    System.out.println("i have made a copy of the first array. here it is: ");
    wait(500);
    System.out.println(Arrays.toString(value2));
    // exercise 5
    System.out.println("exercise 5: ");
    wait(2000);
    System.out.println("i am now going to fill the entire array with 3's.");
    wait(1000);
    for (int z = 0; z < xlength; z++) {
      value[z] = 3;
    }
    System.out.println(Arrays.toString(value));
    // exercise 6
    System.out.println("exercise 6: ");
    wait(2000);
    System.out.println("I am now going to search for 4.");
    searchQuery = 4;
    wait(1000);
    searchResult = Arrays.binarySearch(value, searchQuery);
    System.out.println("Now searching with Bing. Please wait...");
    wait(2000);
    System.out.println("Still searching...");
    wait(500);
    System.out.println("Result: " + searchResult);
    wait(2000);
    System.out.println("\"Of course I couldn't find it\" -bing");
    // exercise 7
    System.out.println("exercise 7");
    wait(2000);
    System.out.println("The length of the original array is: " + value.length);
  }

  public static void wait(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}
