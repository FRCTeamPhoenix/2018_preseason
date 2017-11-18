package org.usfirst.frc.team2342.actions;

import java.util.ArrayList;

/**
 * 
 * @author cooli
 * Simple first draft of an action queue. This takes in an array of abstract Action classes,
 * and runs them one at a time using an index. This is capable of completing actions one at a
 * time only, but it's a start.
 *
 */
public class ActionQueue {

	private ArrayList<Action> allActions;
	private int index;
	private boolean completed;
	
	public ActionQueue(ArrayList<Action> allActions)
	{
		this.allActions = allActions;
		index = 0;
		completed = false;
	}
	
	public ActionQueue(Action[] actions)
	{
		allActions = new ArrayList<Action>();
		for(int i=0;i<actions.length;i++)
			allActions.add(actions[i]);
		index = 0;
		completed = false;
	}
	
	public ActionQueue()
	{
		allActions = new ArrayList<Action>();
		index = 0;
		completed = false;
	}
	
	public void appendAction(Action action, int index)
	{
		allActions.add(index, action);
	}
	
	public void appendAction(Action action)
	{
		allActions.add(action);
	}
	
	public void reset()
	{
		for(int i=0;i<allActions.size();i++)
			allActions.get(i).reset();
		index = 0;
		completed = false;
	}
	
	public boolean isCompleted()
	{
		return completed;
	}
	
	public void execute()
	{
		if(completed)
			return;
		
		allActions.get(index).execute();
		
		if(allActions.get(index).isCompleted())
		{
			if(index < allActions.size())
				index++;
			else
				completed = true;
		}
	}
}
