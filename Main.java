import java.util.Scanner;
import java.lang.StringBuffer;
// Program sprawdzający, czy podany wyraz/ciąg znaków jest palindromem tzn.
// wyrażeniem brzmiącym tak samo czytanym od lewej do prawej i od prawej do
// lewej.

class Main {

  public static Scanner s = new Scanner(System.in);

  private static boolean is_palindrome(String input) {
    String reversed = new StringBuffer(input).reverse().toString().toLowerCase().replaceAll("\\s+", "");
    if (input.toLowerCase().replaceAll("\\s+", "").equals(reversed))
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    System.out.println("Podaj wyraz/ciąg znaków by sprawdzić czy jest palindromem: ");
    String original = s.nextLine();
    if (is_palindrome(original))
      System.out.println(original + " jest palindromem!\n");
    else
      System.out.println(original + " nie jest palindromem!");
    s.close();
  }
}