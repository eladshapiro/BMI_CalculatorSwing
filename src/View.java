import javax.swing.*;

public class View
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame ("BMI calculator");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Model());
        frame.setSize(700,500);
        frame.pack();
        frame.setVisible(true);

    }
}
