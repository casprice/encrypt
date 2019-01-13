import java.util.Scanner;
import java.util.InputMismatchException;

public class CaesarCipher {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String plaintext = "";
    String ciphertext = "";

    int shift = -1;

    System.out.println("\nLet's make a Caesar Cipher!\n");

    // Shift amount
    do {
        try {
          System.out.print("Enter shift amount (0-26): ");
          shift = keyboard.nextInt();
        } catch ( InputMismatchException e ) {}

        if ( shift < 0 || shift > 26 ) {
          System.out.print("Invalid shift amount! ");
        }

        keyboard.nextLine(); // clears the buffer
    } while ( shift < 0 || shift > 26 );

    System.out.println();

    // Plain ciphertext
    System.out.print("Enter word/phrase to encrypt: ");
    plaintext = (keyboard.nextLine()).toUpperCase();
    System.out.println();

    // Encryption
    for (int i = 0; i < plaintext.length(); i++) {
      if (plaintext.charAt(i) == ' ') {
        ciphertext = ciphertext + " ";
        continue;
      }

      int index = (alphabet.indexOf(plaintext.charAt(i)) + shift) % 26;
      ciphertext = ciphertext + alphabet.charAt(index);
    }

    System.out.println("Your encrypted ciphertext: " + ciphertext);

  }
}
