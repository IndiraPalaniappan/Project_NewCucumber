package org.Facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookObjectRepository extends CommonActions {
	public FacebookObjectRepository()
	
	{
				PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement createBtn;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement fname;
	
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement password;
	
	@FindBy(xpath="//select[@title='Day']")
	private WebElement dob;
	
	@FindBy(xpath="//select[@title='Month']")
	private WebElement mth;
	
	@FindBy(xpath="//select[@title='Year']")
	private WebElement yr;
	
	@FindBy(xpath="(//input[@class='_8esa'])[1]")
	private WebElement femaleBtn;
	
	@FindBy(xpath="(//input[@class='_8esa'])[2]")
	private WebElement maleBtn;
	
	@FindBy(xpath="(//input[@class='_8esa'])[3]")
	private WebElement custom;

	public WebElement getCreateBtn() {
		return createBtn;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getMth() {
		return mth;
	}

	public WebElement getYr() {
		return yr;
	}

	public WebElement getFemaleBtn() {
		return femaleBtn;
	}

	public WebElement getMaleBtn() {
		return maleBtn;
	}

	public WebElement getCustom() {
		return custom;
	}

	



}
