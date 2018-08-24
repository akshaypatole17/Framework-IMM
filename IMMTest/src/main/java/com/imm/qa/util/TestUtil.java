package com.imm.qa.util;

import com.imm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 30;
	
	//Switch Frame
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	

}
