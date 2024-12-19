package ex1_QA_MOAMER1;

public class App
{
	/**
	 * MOAMER RABEA 207661836
	 * */

	public static String compare(double A, double B, String mod) 
	{
		switch (mod) 
		{

		case "regular":
			if (A < B)
				return "B";
			else
				return "A";


		case "negative":
			if (-A < -B)
				return "B";
			else
				return "A";


		case "inverse":
			if (1/A > 1/B)
				return "A";
			else
				return "B";


		default:
			return "ERROR";
		}
	}


	public static String compare(double A, String B, String mod) 
	{
		return "ERROR";
	}

	
	public static String compare(String B, double A, String mod) 
	{
		return "ERROR";
	}

	
	public static String compare(String B, String A, String mod) 
	{
		return "ERROR";
	}
}
