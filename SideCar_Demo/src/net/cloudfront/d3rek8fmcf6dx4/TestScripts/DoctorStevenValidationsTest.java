package net.cloudfront.d3rek8fmcf6dx4.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.cloudfront.d3rek8fmcf6dx4.Pages.DoctorList;
import net.cloudfront.d3rek8fmcf6dx4.Pages.DoctorSteven;

public class DoctorStevenValidationsTest extends BaseTest {
	DoctorSteven ds;
	DoctorList dl;

	@Test(priority = 0)
	public void contentValidationTest() throws InterruptedException {
		ds = new DoctorSteven(driver);
		dl = new DoctorList(driver);
		dl.drStevenStrange.click();
		Thread.sleep(2000);
		
		String content = ds.mainBody.getText();
		boolean contentVisible;
		if (content.trim().length() == 0) {
			contentVisible = false;
		}

		else {
			contentVisible = true;
		}
		Assert.assertTrue(contentVisible);
	}

	@Test(priority = 1)
	public void titleValidationTest() {
		int numberOfCharactersInTitle = ds.title.getText().length();
		boolean testResult;
		if (numberOfCharactersInTitle > 6) {
			testResult = true;
		}

		else {
			testResult = false;
		}

		Assert.assertTrue(testResult);

	}

	@Test(priority = 2)
	public void descriptionValidationTest() {
		int numberOfCharactersInDescription = ds.description.getText().length();
		boolean testResult;
		if (numberOfCharactersInDescription > 12) {
			testResult = true;
		}

		else {
			testResult = false;
		}

		Assert.assertTrue(testResult);

	}

	@Test(priority = 3)
	public void dateValidationTest() {
		boolean GMTPresent = ds.date.getText().contains("GMT");
		boolean testResult;
		if (GMTPresent) {
			testResult = true;
		}

		else {
			testResult = false;
		}

		Assert.assertTrue(testResult);

	}

	@Test(priority = 4)
	public void upvoteBtnTest() throws InterruptedException {
		ds.upvote1.click();
		Thread.sleep(2000);
		String message = driver.switchTo().alert().getText();
		boolean testResult;
		if (!message.equals("Upvote successfully")) {
			testResult = false;
		} else {
			testResult = true;
		}
		Assert.assertTrue(testResult);
		
	}

}
