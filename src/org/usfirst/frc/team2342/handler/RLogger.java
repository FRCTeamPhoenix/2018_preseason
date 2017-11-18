package org.usfirst.frc.team2342.handler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * The RLogger logs files and then writes them into a CSV format.
 * WARNING: You have to do it in your own CSV format.
 */

public class RLogger 
{
	private String m_fname = "";
	private FileWriter fw = null;
	private BufferedWriter bw = null;
	private final DateFormat dF = new SimpleDateFormat("HH:mm:ss");
	private Date dN = null;
	private String curTime = "";
	
	/*
	 * This constructor takes the names of files and utilizes them.
	 */

	public RLogger(String fname) throws IOException
	{
		this.m_fname = fname;
		this.fw = new FileWriter(this.m_fname);
		this.bw = new BufferedWriter(this.fw);
		this.dN = new Date();
		this.curTime = this.dF.format(this.dN);
		update();
	}
	
	public void update() 
	{
		this.dN = new Date();
		this.curTime = this.dF.format(this.dN) + ",";
	}
	
	/*
	 * This is the getM_fname method. It returns the name of the file.
	 */

	public String getM_fname() 
	{
		return m_fname;
	}
	
	/*
	 * This is the setM_fname method. It returns the name of the file.
	 */

	public void setM_fname(String m_fname) 
	{
		this.m_fname = m_fname;
	}

	public Date getdN() {
		return dN;
	}

	public void setdN(Date dN) {
		this.dN = dN;
	}

	public String getCurTime() {
		return curTime;
	}

	public void setCurTime(String curTime) {
		this.curTime = curTime;
	}
	
	/*
	 * Write headers to the file. Headers are the first 
	 * WARNING: DONOT add time to your headers, it is already taken care of.
	 */
	
	public void writeHeaders(String headers) {
		update();
		SimpleDateFormat f = new SimpleDateFormat("HH:mm");
		String timeH = f.format(this.dN) + ",";
		try {
			this.bw.write(timeH + headers);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	/*
	 * This is the write method which writes the values of the file.
	 * WARNING: DONOT add the time to your content, time is already taken care of in this class.
	 */
	
	public void write(String content) throws IOException
	{
		update();
		this.bw.write(this.curTime + content);
	}

	//TODO Read
}
