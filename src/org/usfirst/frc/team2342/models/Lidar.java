package org.usfirst.frc.team2342.models;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.I2C;

public class Lidar 
{
	private int m_mode;
	private double m_distance;
	private double m_fastAverage;
	private double m_slowAverage;
	private double m_distances[] = new double[10];
	private byte m_status;
	private I2C m_I2C;
	private Counter m_monitorPin;
	private DigitalOutput m_triggerPin;
	private int m_counter;
	
	
	public void run() 
	{
	}


	public double getM_distance() {
		return m_distance;
	}





	public double getM_fastAverage() {
		return m_fastAverage;
	}




	public double getM_slowAverage() {
		return m_slowAverage;
	}




	public byte getM_status() {
		return m_status;
	}



	
	
}
