package StackTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import StackFormpages.FormData1;


public class TestFormData extends HomePage{
	
	@Test
	public void init() throws InterruptedException {
		
		FormData1 formfill = PageFactory.initElements(driver, FormData1.class);
		formfill.setName("saurav singh");
		formfill.setEmail("Sauravsingh037@gmail.com");
		
		formfill.setComment("this is testing exercise");
		
		Thread.sleep(3000);
		formfill.setSubmit( );
		
		Thread.sleep(3000);
		
	}

}
