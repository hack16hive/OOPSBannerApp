public class hritikaUC4
{
    /**
 * OOPSBannerAppUC4 – Banner Display using Array and Loop
 *
 * This class enhances the OOPS Banner Application by improving modularity and reusability.
 * Instead of printing each banner line separately, it stores all lines in a String array
 * and prints them using a loop. The String.join() method is used for efficient string construction.
 *
 * <p>This refactoring demonstrates array handling and iteration concepts in Java,
 * while maintaining the same visual banner design as previous use cases.</p>
 *
 * @author HritikaSingh
 * @version 4.0
 */

// Extend the User Story 3 by storing banner lines in an array and
// printing them using a loop instead of individual print statements.
// This approach reduces redundancy, enhances modularity, and simplifies maintenance.

    // Main method to display the OOPS banner using an array and a loop
    public static void main(String[] args) {

        // Using String.join() to form each banner line
        String[] bannerLines = {
            String.join("", "   ***   ", "     ***   ", "   ******  ", "   *****  "),
            String.join("", " **   ** ", "   **   ** ", "   **    **", "  **       "),
            String.join("", "**     **", "  **     **", "   **    **", "  **       "),
            String.join("", "**     **", "  **     **", "   ******  ", "   *****   "),
            String.join("", "**     **", "  **     **", "   **      ", "       **  "),
            String.join("", " **   ** ", "   **   ** ", "   **      ", "       **  "),
            String.join("", "   ***   ", "     ***   ", "   **      ", "   *****   ")
        };

        // Using an enhanced for-loop to print all banner lines
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}