import javax.swing.*;
import java.awt.*;

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
