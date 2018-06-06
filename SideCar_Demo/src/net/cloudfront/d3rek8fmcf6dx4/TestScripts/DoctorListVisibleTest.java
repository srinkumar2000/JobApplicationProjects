package net.cloudfront.d3rek8fmcf6dx4.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.cloudfront.d3rek8fmcf6dx4.Pages.DoctorList;

public class DoctorListVisibleTest extends BaseTest {
	DoctorList dl; 

	@Test(priority=0)
	public void doctorStevenVisiblity() {
		dl= new DoctorList(driver);
		boolean drStevenVisibility = dl.drStevenStrange.isDisplayed();
		Assert.assertTrue(drStevenVisibility);
	}

	@Test(priority=1)
	public void doctorRedPandaVisiblity() {
		boolean drRedPandaVisibility = dl.drRedPanda.isDisplayed();
		Assert.assertTrue(drRedPandaVisibility);
	}

	@Test(priority=2)
	public void doctorAliceSwiftVisiblity() {
		boolean drAliceSwiftVisibility = dl.drAliceSwift.isDisplayed();
		Assert.assertTrue(drAliceSwiftVisibility);
		
	}

}
