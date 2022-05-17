import javax.swing.*;
/*
this class is responsible for the south panel, it has the submit and clear buttons
 */
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
