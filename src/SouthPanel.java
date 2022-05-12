import javax.swing.*;

public class SouthPanel extends JPanel
{
    private JButton submitButton;
    private JButton clearButton;

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }


    public SouthPanel()
    {

        submitButton=new JButton("Submit");
        clearButton=new JButton("Clear");

        add(submitButton);
        add(clearButton);
    }
}
