// ------------------------------------------------
// OPCoach Training Projects
// ? OPCoach 2009     http://www.opcoach.com
// ------------------------------------------------ 

package com.scalian.rental.model.rental.helpers;

/**
 * @author olivier
 *
 */
public class IDGenerator
{
	
	private static long id = 0L;
	
	public static synchronized  long get()
	{
		long result = id;
		id++;
		return result;
	}

}