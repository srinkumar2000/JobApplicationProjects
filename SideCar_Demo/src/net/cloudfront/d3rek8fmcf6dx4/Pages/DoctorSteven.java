package net.cloudfront.d3rek8fmcf6dx4.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorSteven {

	@FindBy(css = "body")
	@CacheLookup
	public WebElement mainBody;

	@FindBy(css = "#root > div > div.sc-ifAKCX.hqGNjp > div:nth-child(1) > ul > li:nth-child(1)")
	@CacheLookup
	public WebElement title;

	@FindBy(css = "#root > div > div.sc-ifAKCX.hqGNjp > div:nth-child(1) > ul > li:nth-child(2)")
	@CacheLookup
	public WebElement description;

	@FindBy(css = "#root > div > div.sc-ifAKCX.hqGNjp > div:nth-child(1) > ul > li:nth-child(3)")
	@CacheLookup
	public WebElement date;

	@FindBy(css = "#root > div > div.sc-ifAKCX.hqGNjp > div:nth-child(1) > div")
	@CacheLookup
	public WebElement upvote1;

	public DoctorSteven(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
