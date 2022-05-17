import javax.swing.*;
import java.awt.*;
/*
this class is responsible for the north panel
 */
public class NorthPanel extends JPanel
{
    private final JLabel welcome;
    NorthPanel()
    {
        this.welcome=new JLabel("welcome to the BMI calculator");
        add(welcome);
        setBackground (Color.yellow);
    }
}
