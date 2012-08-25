package starters;



import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;


/**
 * This class an trace a square of any size and in any direction.
 * @author 
 */
// use this  class to build and run your robot
public class SquareBot 
{

    /**
   * Constructs the robot and drives it to meet the project specifications
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      LCD.drawString("GO",0,0);
      Button.waitForAnyPress();
      SquareBot robot = new SquareBot();
      Motor.A.setSpeed(300);
      Motor.A.setAcceleration(3000);
      Motor.C.setSpeed(300);
      Motor.C.setAcceleration(3000);
      int direction = 1;
      Button.waitForAnyPress();
      for(int i = 0 ;i< 2; i++)
      {
        robot.square(60,direction);
     /// more code here
      }
    }
    /**
     * Top level task:  trace a square of specified size, and direction
     * @param length
     * @param direction 
     */
    public void square(float length,int direction)
    {
    	DifferentialPilot pilot = new DifferentialPilot(5.6f, 11.0f, Motor.A, Motor.C);
    	for (int i = 0; i<4; i++){
    		pilot.travel(60.96);
    		pilot.rotate(90);
    	}
    }
   
    //  instance variables -- check these values for your robot
      float wheelDiameter =  5.35f;
      float trackWidth = 11.7f;
}
