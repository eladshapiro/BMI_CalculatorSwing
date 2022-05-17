/*
this class is the controller, it is doing all the calculations
 */
public class Controller
{
    private double height;
    private double weight;
    private double age;
    private double bodyFrameSlimness;
    double bmi;


public Controller(double height,double weight,double age,double bodyFrameSlimness)
{
this.height=height;
this.weight=weight;
this.age=age;
this.bodyFrameSlimness=bodyFrameSlimness;
}
public double getBMI()
{
    bmi=weight/(Math.pow((height*0.01),2));       //calculates the BMI according to the equation
    return bmi;
}

public double getIdealWeight()
{
    return (height-100+(age/10))*0.9*bodyFrameSlimness;      //calculates the ideal weight according to the equation
}

    public String getWeightStatus()          //returns the weight status according the BMI.
    {
        if (bmi<15)
        {
            return "Anorexic ";
        }
        if (bmi>=15 && bmi<=18.5)
        {
            return "Underweight ";
        }
        if (bmi>=18.5 && bmi<=24.9)
        {
            return "Normal ";
        }
        if (bmi>=25 && bmi<=29.9)
        {
            return "Overweight  ";
        }
        if (bmi>=30 && bmi<=35)
        {
            return "Obese  ";
        }
        if (bmi>=35)
        {
            return "Extreme Obese  ";
        }
        return "";
    }

}
