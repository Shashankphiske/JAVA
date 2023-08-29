import javax.swing.JOptionPane;

public class Day6_Trainglep {
    public static void main(String[] args)
    {
        double c;
        JOptionPane.showMessageDialog(null, "Enter the H and B of the Triangle");
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the height :"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the base :"));
        
        a *= a;
        b *= b;
        c = a + b;
        c = Math.sqrt(c);

        JOptionPane.showMessageDialog(null, "The hypoteneuse is :"+c);
    }
}
