import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
this class is the model class, it's purpose is to init all the panels and buttons and labels
and the actions they do
 */


public class Model extends JPanel
{
    private final NorthPanel northPanel;
    private final SouthPanel southPanel;
    private final EastPanel eastPanel;
    private final WestPanel westPanel;

    private double height;
    private double bodyFrameSlimness;
    private String ageText;
    private double age;
    private String weightText;
    private double weight;


    public Model()
    {
        northPanel=new NorthPanel();
        southPanel=new SouthPanel();
        westPanel=new WestPanel();
        eastPanel=new EastPanel();
        setBackground (Color.green);
        setLayout(new BorderLayout());
        add(northPanel,BorderLayout.NORTH);
        add(southPanel,BorderLayout.SOUTH);
        add(westPanel,BorderLayout.WEST);
        add(eastPanel,BorderLayout.EAST);



        southPanel.getSubmitButton().addActionListener(e -> {             //the listener to the submit button
            Controller controller=new Controller(height,weight,age,bodyFrameSlimness);
            JOptionPane.showMessageDialog(null,"Your BMI is : "+controller.getBMI()+"\nAnd you body status is: "+controller.getWeightStatus()+ "\n\nYour ideal weight is: "+ controller.getIdealWeight()+"\nAnd your Actual Weight is: "+weight);

        });


        eastPanel.getHeightSlider().addChangeListener(e -> height= eastPanel.getHeightSlider().getValue());    //the listener to the height slider

        eastPanel.getLargeRadioButton().addItemListener(e -> bodyFrameSlimness=1.1);
        eastPanel.getMediumRadioButton().addItemListener(e -> bodyFrameSlimness=1);
        eastPanel.getSmallRadioButton().addItemListener(e -> bodyFrameSlimness=0.9);


        westPanel.getAgeTextField().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {       //the listener to the age input
                ageText= westPanel.getAgeTextField().getText();
                age =Integer.parseInt(ageText);
            }
        });

        westPanel.getActualWeightField().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {       //the listener to the weight input
                weightText=westPanel.getActualWeightField().getText();
                weight=Integer.parseInt(weightText);
            }
        });

        southPanel.getClearButton().addActionListener(e -> {              //the listener to the clear button
            westPanel.setFirstNameTextField();
            westPanel.setLastNameTextField();
            westPanel.setAgeTextField();
            westPanel.setActualWeightField();

            eastPanel.clearBodyFrameGroup();
            westPanel.clearGenderGroup();

            eastPanel.clearHeightSlider();



        });







    }

}
