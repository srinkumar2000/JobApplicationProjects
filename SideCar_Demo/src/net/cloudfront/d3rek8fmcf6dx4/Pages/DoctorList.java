package net.cloudfront.d3rek8fmcf6dx4.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorList {

	@FindBy(partialLinkText = "Steven")
	@CacheLookup
	public WebElement drStevenStrange;

	@FindBy(partialLinkText = "Red")
	@CacheLookup
	public WebElement drRedPanda;

	@FindBy(partialLinkText = "Alice")
	@CacheLookup
	public WebElement drAliceSwift;

	public DoctorList(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
