package org.usfirst.frc.team2342.actions;

public class ActionGoDistance extends Action {
	
	private double requiredDistance;
	private double distance;
	
	public ActionGoDistance(double requiredDistance)
	{
		super();
		this.requiredDistance = requiredDistance;
		distance = 0;
	}
	
	@Override
	public void reset()
	{
		distance = 0;
	}
	
	@Override
	public void execute()
	{
		/*
		 * code to drive robot forward and read encoder distance in here
		 */
		
		if(distance >= requiredDistance)
			completed = true;
	}

}
