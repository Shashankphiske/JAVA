import javax.swing.JOptionPane; //Joption pane class


public class Day5_BasicGUI {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("NAME :");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Age :"));
        // here the showinputdialogue gives string value so we converted into integer value 
        // if converting to double then use Double.parseDouble()
        JOptionPane.showMessageDialog(null, "Age is "+ age);
    }
}
