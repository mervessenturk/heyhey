
package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

  private final CANSparkMax sparkMax1 = new CANSparkMax(4, MotorType.kBrushless);
  private final Joystick joystick = new Joystick(0);

 
  @Override
  public void robotInit() {
  }
  @Override

  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {

  }

  @Override
  public void teleopPeriodic() {
    double raw = joystick.getRawAxis(1);
    sparkMax1.set(raw);
  }

  @Override
  public void testPeriodic() {
  }
}
 