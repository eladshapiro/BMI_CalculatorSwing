import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Model extends JPanel
{
    private NorthPanel northPanel;
    private SouthPanel southPanel;
    private EastPanel eastPanel;
    private WestPanel westPanel;

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



        southPanel.getSubmitButton().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Controller controller=new Controller(height,weight,age,bodyFrameSlimness);
                JOptionPane.showMessageDialog(null,"Your BMI is : "+controller.getBMI()+"\nAnd you body status is: "+controller.getWeightStatus()+ "\n\nYour ideal weight is: "+ controller.getIdealWeight()+"\nAnd your Actual Weight is: "+weight);

            }
        });


        eastPanel.getHeightSlider().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                height= eastPanel.getHeightSlider().getValue();
            }
        });

        eastPanel.getLargeRadioButton().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                bodyFrameSlimness=1.1;
            }
        });
        eastPanel.getMediumRadioButton().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                bodyFrameSlimness=1;
            }
        });
        eastPanel.getSmallRadioButton().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                bodyFrameSlimness=0.9;
            }
        });


        westPanel.getAgeTextField().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                ageText= westPanel.getAgeTextField().getText();
                age =Integer.parseInt(ageText);
            }
        });

        westPanel.getActualWeightField().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                weightText=westPanel.getActualWeightField().getText();
                weight=Integer.parseInt(weightText);
            }
        });

        southPanel.getClearButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                westPanel.setFirstNameTextField();
                westPanel.setLastNameTextField();
                westPanel.setAgeTextField();
                westPanel.setActualWeightField();

                eastPanel.clearBodyFrameGroup();
                westPanel.clearGenderGroup();

                eastPanel.clearHeightSlider();



            }
        });







    }

}
