package starters;

import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;

/**
 *
 * @author glassey
 */
public class TrackWidthTest
{

  /**
   *test track width. 
   * Adjust track width to get accurate 360 degree 
   */
  public static void main(String[] args)
  {
    DifferentialPilot pilot = new DifferentialPilot(5.6f, 12.5f, Motor.A, Motor.C);
    pilot.setRotateSpeed(180);
    pilot.setAcceleration(60);
    Button.waitForAnyPress();
    Delay.msDelay(200);
	pilot.rotate(-90);
  }
}
