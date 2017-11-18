package org.usfirst.frc.team2342.models;

import org.usfirst.frc.team2342.robot.PIDGains;

public class Talon 
{
	private int ID;
	private PIDGains distance;
	private PIDGains velocity;
	private double maxForward;
	private double maxReverse;
	private boolean inverted;

	public Talon() 
	{
		ID = 0;
		distance = new PIDGains(0,0,0,0,0,0);
		velocity = new PIDGains(0,0,0,0,0,0);
		maxForward = 0;
		maxReverse = 0;
		inverted = false;

	}
	public Talon(int ID, PIDGains distance, PIDGains velocity, double maxForward,
			double maxReverse, boolean inverted) 
	{
		this.ID = ID;
		this.distance = distance;
		this.velocity = velocity;
		this.maxForward = maxForward;
		this.maxReverse = maxReverse;
		this.inverted = inverted;
	}

	public int getID() 
	{
		return ID;
	} //gets ID

	public PIDGains getDistance() 
	{
		return distance;
	} //gets distance

	public PIDGains getVelocity() 
	{
		return velocity;
	} //gets velocity

	public double getMaxForward() 
	{
		return maxForward;
	}

	public double getMaxReverse() 
	{
		return maxReverse;
	} //gets maxReverse

	public boolean getInverted() 
	{
		return inverted;
	} //gets inverted

	public void setID(int ID) 
	{
		this.ID = ID;
	} //sets ID

	public void setDistance(PIDGains distance) 
	{
		this.distance = distance;
	} //sets distance

	public void setVelocity(PIDGains velocity) 
	{
		this.velocity = velocity;
	} //sets velocity

	public void setMaxForward(double maxForward) 
	{
		this.maxForward = maxForward;
	} //sets maxForward

	public void setMaxReverse(double maxReverse) 
	{
		this.maxReverse = maxReverse;
	} //sets maxReverse

	public void setInverted(boolean inverted) 
	{
		this.inverted = inverted;
	} //sets inverted

}


