package starters;


import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;


/**
 * what this class does: 
 * @author ??
 */

public class PolyTracer
{
public PolyTracer(DifferentialPilot pilot)
  {
    this.pilot = pilot;
    pilot.setTravelSpeed(25);
	pilot.setAcceleration(60);
    pilot.setRotateSpeed(180);
  }
/**
 * what this method does
 * @param radius
 * @param angle
 * @param turnDirection 
 */
  public void arc(float radius,  float  angle, int turnDirection)
  {
    // your code here
  }

/**
   * what this class does
   * @param length
   * @param sides
   * @param turnDirection 
   */
  public void polygon(float length, int sides, int turnDirection)
  {
    LCD.drawString("Polygon", 0, 0);
    Button.waitForAnyPress();
    // your code here
    
  }
 DifferentialPilot pilot;
}