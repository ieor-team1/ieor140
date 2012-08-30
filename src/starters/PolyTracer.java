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
	  pilot = new DifferentialPilot(wheelDiameter, trackWidth, Motor.A, Motor.C);
	  Button.waitForAnyPress();
	  pilot.arc(turnDirection*radius, angle);
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
    DifferentialPilot pilot = new DifferentialPilot(wheelDiameter, trackWidth, Motor.A, Motor.C);
	pilot.setRotateSpeed(180);
    pilot.setAcceleration(3000);
    double angle = (sides-2)*180/sides;
    for (int i = 0; i<sides; i++){
		pilot.travel(length);
		pilot.rotate(turnDirection*angle);
	}
    
  }
 DifferentialPilot pilot;
 float wheelDiameter =  5.6f;
 float trackWidth = 11.4f;
}