public class hritikaUC3
{
    /**
 * OOPSBannerApp UC3 – Optimized Banner Display using String.join()
 *
 * This class enhances the OOPS Banner Application by improving memory efficiency
 * and modularity. Instead of concatenating string literals with the '+' operator,
 * this version uses the String.join() method to construct each line of the ASCII banner.
 *
 * <p>This refactoring minimizes the creation of intermediate String objects,
 * optimizing performance while maintaining the same visual layout of the OOPS banner.</p>
 *
 * @author HritikaSingh
 * @version 3.0
 */

// with the String.join() method to efficiently form each banner line. This approach
// enhances readability, reduces memory overhead, and follows modular coding practices.

    // Main method to display the "OOPS" banner using String.join()
    public static void main(String[] args)
    {
        // Each line of the banner is formed using String.join() for better efficiency
        String line1 = String.join("", "   ***   ", "    ***   ", "  ******  ", "   ***** ");
        String line2 = String.join("", " **   ** ", "  **   ** ", "  **    **", "  **     ");
        String line3 = String.join("", "**     **", " **     **", "  **    **", "  **     ");
        String line4 = String.join("", "**     **", " **     **", "  ******  ", "   ***** ");
        String line5 = String.join("", "**     **", " **     **", "  **      ", "       **");
        String line6 = String.join("", " **   ** ", "  **   ** ", "  **      ", "       **");
        String line7 = String.join("", "   ***   ", "    ***   ", "  **      ", "   ***** ");

        // Printing each line of the banner
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}