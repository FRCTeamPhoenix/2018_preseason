package org.usfirst.frc.team2342.models;


public class TalonReader 
{
	private int id = 0;
	private String name = "gearTalon";
	private float maxPower = 0.5f;

	public int getID()
	{
		return id; 
	} // gets id

	public String getName() 
	{
		return name;
	} // gets name

	public float getMaxPower() 
	{
		return maxPower;
	} // gets max power

	public void setID(int newID) 
	{
		id = newID;
	} //sets the id

	public void setName(String newName) 
	{
		name = newName;
	} // sets name
}