package starters;



import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * NB rename this class so that it has a unique name on the Robot
 * @author 

 * @version 1.0
 */
public class PolyTest_starter 
{ 
/**
   * Constructs a the robot and drives it through the project specificatioins
   * @param aArg 
   */
    public static void main(String[] aArg) 
    {
      DifferentialPilot pilot = new DifferentialPilot(5.35f, 13.7f, Motor.A, Motor.C);
      PolyTracer robot = new PolyTracer(pilot);   
      robot.polygon(____________);
      robot.arc(_________________);
    }  
}