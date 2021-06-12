package StackFormpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormData1 {
	
	WebDriver driver;
	
	public FormData1(WebDriver driver) {
		this.driver =driver;
	}
	
	@FindBy(how = How.XPATH , using ="//input[@id='job-name']") WebElement name;
	@FindBy(how = How.XPATH , using ="//input[@id='job-email']") WebElement email;
	@FindBy(how = How.XPATH , using ="//input[@id='job-file']") WebElement file;
	@FindBy(how = How.XPATH , using ="//textarea[@id='job-message']") WebElement comment;
	@FindBy(how = How.XPATH , using ="//span[contains(text(),'Submit Application')]") WebElement submit;

	public void setName(String strName) {
		name.sendKeys(strName);
	}
	
	public void setEmail(String strEmail) {
		email.sendKeys(strEmail);
	}
	

	
	public void setComment(String strComment) {
		comment.sendKeys(strComment);
	}
	
	public void setSubmit() {
		submit.click();
	}


}
