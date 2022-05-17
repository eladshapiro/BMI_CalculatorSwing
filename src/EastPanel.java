import javax.swing.*;
/*
this class is responsible for the east panel, it has the height slider, and the body-frame radio buttons
 */
public class EastPanel extends JPanel
{
    private JSlider heightSlider;
    private JRadioButton largeRadioButton;
    private JRadioButton mediumRadioButton;
    private JRadioButton smallRadioButton;
    private JLabel height;
    private JLabel bodyFrame;
    private ButtonGroup bodyFrameGroup;

    public JSlider getHeightSlider() {
        return heightSlider;
    }

    public void clearHeightSlider() {
        this.heightSlider.setValue(140);
    }

    public JRadioButton getLargeRadioButton() {
        return largeRadioButton;
    }


    public JRadioButton getMediumRadioButton() {
        return mediumRadioButton;
    }



    public JRadioButton getSmallRadioButton() {
        return smallRadioButton;
    }


    public void clearBodyFrameGroup() {
        this.bodyFrameGroup.clearSelection();
    }





    public EastPanel()
    {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        height=new JLabel("Height: ");
        heightSlider=new JSlider(JSlider.HORIZONTAL, 140, 190, 140);
        heightSlider.setMajorTickSpacing(10);
        heightSlider.setMinorTickSpacing(5);
        heightSlider.createStandardLabels(10,140);
        heightSlider.setPaintTicks(true);
        heightSlider.setPaintLabels(true);

        bodyFrame=new JLabel("Body Frame: ");

        largeRadioButton=new JRadioButton("Large");
        mediumRadioButton=new JRadioButton("Medium");
        smallRadioButton=new JRadioButton("Small");
        bodyFrameGroup=new ButtonGroup();
        bodyFrameGroup.add(largeRadioButton);
        bodyFrameGroup.add(mediumRadioButton);
        bodyFrameGroup.add(smallRadioButton);

        height.setLabelFor(heightSlider);
        bodyFrame.setLabelFor(largeRadioButton);

        add(height);
        add(heightSlider);
        add(bodyFrame);
        add(largeRadioButton);
        add(mediumRadioButton);
        add(smallRadioButton);


    }



}
