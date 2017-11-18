package org.usfirst.frc.team2342.actions;

public abstract class Action {

	protected boolean completed;
	
	public Action()
	{
		completed = false;
	}

	public boolean isCompleted()
	{
		return completed;
	}
	
	public void reset()
	{
		completed = false;
	}
	
	public void execute()
	{
		
	}
}
