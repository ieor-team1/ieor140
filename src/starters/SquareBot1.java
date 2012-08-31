package starters;

import lejos.robotics.navigation.DifferentialPilot;

import lejos.nxt.*;


/**
 * This class an trace a square of any size and in any direction.
 * @author 
 */
// use this  class to build and run your robot
public class SquareBot1 
{
  public SquareBot1(DifferentialPilot aPilot )
  {
      pilot = aPilot;
      pilot.setTravelSpeed(20);
      pilot.setAcceleration(60);
  }

    /**
   * Constructs the robot and drives it to meet the project specifications
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      LCD.drawString("GO",0,0);
      Button.waitForAnyPress();
      SquareBot1 robot = new SquareBot1(pilot);
      
    
      int direction = 1;
      Button.waitForAnyPress();
      for(int i = 0 ;i< 4; i++)
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
      for (int i = 0; i<4; i++)
      {
//       more code here  
//        
      }
    }
    
      static DifferentialPilot pilot;
    //  instance variables -- check these values for your robot
	// adjust wheelDiameter first - to travel 90 cm
      float wheelDiameter =  5.35f;
	  // then adjust track width to rotate  360 deg accurately
      float trackWidth = 13.5f;
}
