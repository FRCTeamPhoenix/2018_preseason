package org.usfirst.frc.team2342.models;

public class Constants {
	//Port Assign
	// CANTalon ID's
	public final static int backLeftWheelMotor = 2;
	public final static int frontLeftWheelMotor = 8;
	public final static int frontRightWheelMotor = 7;
	public final static int backRightWheelMotor = 1;
	public final static int topFlyWheelMotor = 4;
	public final static int lowerFlyWheelMotor = 3;
	public final static int climber = 10;
	public final static int feeder = 5;
	public final static int turret = 9;
	public final static int indexer = 6;

	// Talon Ports
	public final static int loader = 0;

	//Controllers
	public final static int joystickLeft = 0;
	public final static int joystickRight = 1;
	public final static int gamepad = 4;
	public final static int driverCustomBox = 3;
	public final static int customBox = 2;

	// Limit Switches
	public final static int rightLimitSwitch = 1;
	public final static int leftLimitSwtich = 2;

	//Lidar Pins
	public final static int lidarTriggerPin = 9;
	public final static int lidarMonitorPin = 9;

	// Robot Constants
	public final static float turretDamp = 0.3f;
	public final static double turretSpeed = 0.05f;
	public final static double lidarValueTolerance = 12;
	public final static double lidarMaxReading = 700;
	public final static double degreesToTicks = 27.2727273f;

	// Shooter Constants
	public final static double maxFlywheelVelocity = 75000;
	public final static double minFlywheelVelocity = 2000;

	// Drive Station Constants

	public enum buttonNames
	{
		BUTTON_X(1),
		BUTTON_A(2), // START/STOP CLIMBER
		BUTTON_B(3),
		BUTTON_Y(4),
		BUTTON_LB(5),
		BUTTON_RB(6),
		TRIGGER_LT(7), // STOP SHOOTER
		TRIGGER_RT(8), // START SHOOTER
		BUTTON_BACK(9),
		BUTTON_START(10),
		JOYSTICK_LEFT_BUTTON(11),
		JOYSTICK_RIGHT_BUTTON(12);
		private final int buttonNum;
		buttonNames (int buttonNum){
			this.buttonNum = buttonNum;
		}
	};
	public enum controlBox
	{
		buttonIndexer(4),
		buttonFeeder(2),
		buttonClimberUP(3),
		buttonFlywheelManual(5),
		buttonFlywheelAuto(6),
		buttonIndexerReverse(7),
		buttonAutoStart(8),
		buttonAutoStop(9),

		potTurret(2),
		potFlywheelSpeed(3),
		potXChange(1),
		potYChange(0);

		private final int buttonNum;
		controlBox (int buttonNum){
			this.buttonNum = buttonNum;
		}
	};
	public enum driverControl
	{
		voltageMode(2),
		fieldOriented(3),
		gyroReset(4),
		spareButton(5);
		private final int buttonNum;
		driverControl (int buttonNum){
			this.buttonNum = buttonNum;
		}

	};
	public static String dashButtonNames[] =
		{
				"New Name",
				"DB/Button 1",
				"DB/Button 2",
				"DB/Button 3",
				"Get Value",
				"Set Value"
		};
	public static String textBoxNames[] =
		{
				"DB/String 0",
				"DB/String 1",
				"DB/String 2",
				"DB/String 3",
				"DB/String 4",
				"DB/String 5",
				"DB/String 6",
				"DB/String 7",
				"DB/String 8",
				"DB/String 9",
				"Key Name",
				"Key Value",
				"New Value"
		};

	public static int gamepadButtons = 12;
}
