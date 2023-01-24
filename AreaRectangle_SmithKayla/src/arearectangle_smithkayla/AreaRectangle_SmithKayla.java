
package arearectangle_smithkayla;
import javax.swing.JOptionPane; // Needed for Dialog Box

/**
 * Kayla Smith
 * 1/24/2023
 * This program finds the area of a rectangle
 * using an input output dialog box
 */
public class AreaRectangle_SmithKayla
{
    public static void main(String[] args)
    {
        String name;
        int length;     // To hold length.
        int width;      // To hold width.
        int area;       // To hold area.
        
        name = getName();
        length = getLength();
        width = getWidth();

        // Calculate area of rectangle.
        area = length * width;
        
        // Display area of rectangle.
        JOptionPane.showMessageDialog(null, name + ", the area of your rectangle is " + area);
    }
    public static String getName()
    {
        String name;
        name = JOptionPane.showInputDialog("What is your name? ");
        return name;
    }
    public static int getLength()
    {
        String input;
        int length;
        // Prompt user to input length.
        input = JOptionPane.showInputDialog("Enter Length");
        
        // Convert the String input to an int.
        length = Integer.parseInt(input);
        return length;
    }
    public static int getWidth()
    {
        String input;
        int width;
        // Prompt user to input width.
        input = JOptionPane.showInputDialog("Enter Width");
        
        // Convert the String input to an int.
        width = Integer.parseInt(input);
        return width;
    }
}
