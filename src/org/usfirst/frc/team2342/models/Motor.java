package org.usfirst.frc.team2342.models;

import org.usfirst.frc.team2342.robot.SmartTalon;

public class Motor {
	private SmartTalon m_talon;
	private int id;
	private String name;
	private float m_maxPower;
	
	public Motor(SmartTalon talon, int id, String name, float maxPower) {
		this.m_talon = talon;
		this.id = id;
		this.name = name;
		this.m_maxPower = maxPower;
	}
	
	public void go() {
		m_talon.goVoltage(0.25*m_maxPower);
	}
	
	public void stop() {
		m_talon.goVoltage(0.0f);
	}
}
