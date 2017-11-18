package org.usfirst.frc.team2342.robot;

import org.usfirst.frc.team2342.handler.JSONHandler;
import org.usfirst.frc.team2342.models.Motor;
import org.usfirst.frc.team2342.models.TalonReader;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

public class Robot extends IterativeRobot 
{
	RobotDrive myRobot = new RobotDrive(0, 1);
	Joystick stick = new Joystick(0);
	Timer timer = new Timer();
	JSONHandler jsonh = new JSONHandler("json/talons.json");
	TalonReader tReader = new TalonReader();
	SmartTalon m_motorT = new SmartTalon(0); 
	Motor motor = new Motor(m_motorT, tReader.getID(), tReader.getName(), tReader.getMaxPower());

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() 
	{
		try 
		{
			jsonh.read(tReader.getClass());
			System.out.println(tReader.getID() + "  " + tReader.getMaxPower() + "   " + tReader.getName());
		}		
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}

	/**
	 * This function is run once each time the robot enters autonomous mode
	 */
	@Override
	public void autonomousInit() 
	{
		timer.reset();
		timer.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() 
	{
		// Drive for 2 seconds
		if (timer.get() < 2.0) 
		{
			myRobot.drive(-0.5, 0.0); // drive forwards half speed
		} else 
		{
			myRobot.drive(0.0, 0.0); // stop robot
		}
	}

	/**
	 * This function is called once each time the robot enters tele-operated
	 * mode
	 */
	@Override
	public void teleopInit() 
	{
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() 
	{
		myRobot.arcadeDrive(stick);
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() 
	{
		LiveWindow.run();
		motor.go();
		Timer.delay(3.0d);
		motor.stop();
		Timer.delay(3.0d);
	}
}
