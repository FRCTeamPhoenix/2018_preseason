package org.usfirst.frc.team2342.models;

import java.io.IOException;
import java.util.ArrayList;

import org.usfirst.frc.team2342.handler.JSONHandler;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class JSON 
{
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		JSONHandler json = new JSONHandler("jsonFile.txt");
		TalonList talonList = new TalonList();
		Talon talon = new Talon();
		json.write(talonList);

		//	TalonReader talon2 = json.read(talon3.getClass());
		//System.out.print(talon2.getID());


	}


}

