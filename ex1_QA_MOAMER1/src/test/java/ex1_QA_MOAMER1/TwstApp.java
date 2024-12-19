package ex1_QA_MOAMER1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * MOAMER RABEA 207661836
 * */
public class TwstApp 
{
	
	App tester = new App();

	@Test
	public void test_1()
	{/* console will print : B */
		String Expected_result = "B";
		int a= 2 , b = 15;
		String mod = "regular";
		String actual_result = tester.compare(a, b,mod);
		System.out.println("Test 1 : "+Expected_result);
		assertEquals(Expected_result,actual_result);
	}		
	
	
	@Test
	public void test_2() 
	{/* console will print : A */
		String Expected_result = "A";
		int a = -2 , b = -15;
		String mod = "regular";
		String actual_result = tester.compare(a, b,mod);
		System.out.println("Test 2 : "+Expected_result);
		assertEquals(Expected_result,actual_result);
	}		
	
	
	@Test
	public void test_3() 
	{/* console will print : ERROR */
		String Expected_result = "ERROR";
		int a = 275;
		String b = "MR";
		String mod = "regular";
		String actual_result = tester.compare(a, b,mod);
		System.out.println("Test 3 : "+Expected_result);
		assertEquals(Expected_result,actual_result);
	}
	
	
	@Test
	public void test_4() 
	{/* console will print : A */
		String Expected_result = "A";
		int a = 5 ,b = 27;
		String mod = "negative";
		String actual_result = tester.compare(a, b,mod);
		System.out.println("Test 4 : "+Expected_result);
		assertEquals(Expected_result,actual_result);

	}
	
	
	@Test
	public void test_5() 
	{/* console will print : B */
		String Expected_result = "B";
		int a = 4 ,b = -6;
		String mod = "negative";
		String actual_result = tester.compare(a, b,mod);
		System.out.println("Test 5 : "+Expected_result);
		assertEquals(Expected_result,actual_result);

	}
	
	
	@Test
	public void test_6() 
	{/* console will print : ERROR */
		String Expected_result = "ERROR";
		int a = - 275;
		String b = "HI";
		String mod = "negative";
		String actual_result = tester.compare(a, b,mod);
		System.out.println("Test 6 : "+Expected_result);
		assertEquals(Expected_result,actual_result);

	}
	
	
	@Test
	public void test_7() 
	{/* console will print : A */
		String Expected_result = "A";
		int a = 12 ,b = 18;
		String mod = "inverse";
		String actual_result = tester.compare(a, b, mod); 
		System.out.println("Test 7 : "+Expected_result);
		assertEquals(Expected_result,actual_result);
	}
	
	
	@Test
	public void test_8() 
	{/* console will print : B */
		String Expected_result = "B";
		int a = -3 ,b = -7;
		String mod = "inverse";
		String actual_result = tester.compare(a, b, mod);
		System.out.println("Test 8 : "+Expected_result);
		assertEquals(Expected_result,actual_result);
	}
	
	
	@Test
	public void test_9() 
	{/* console will print : ERROR */
		String Expected_result = "ERROR";
		int a = -999;
		String b = "H";
		String mod = "inverse";
		String actual_result = tester.compare(a, b,mod);
		System.out.println("Test 9 : "+Expected_result);
		assertEquals(Expected_result,actual_result);
	}

}
