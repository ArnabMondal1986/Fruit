package webdriverListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class ActivityCapture implements WebDriverEventListener{
	
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("inside method afterChangeValueOf on " + arg0.toString());
		
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("inside method afterClickOn on " + arg0.toString());
		
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("inside method afterFindBy on " + arg0.toString());
	}

	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("inside method afterNavigateBack on " + arg0.toString());

	}

	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("inside method afterNavigateForward on " + arg0.toString());
	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("inside method afterNavigateRefresh on " + arg0.toString());
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("inside method afterNavigateTo on " + arg0.toString());
	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("inside method afterScript on " + arg0.toString());
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("inside method beforeChangeValueOf on " + arg0.toString());
	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("inside method beforeClickOn on " + arg0.toString());
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("inside method beforeFindBy on " + arg0.toString());
	}

	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("inside method beforeNavigateBack on " + arg0.toString());
	}

	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("inside method beforeNavigateForward on " + arg0.toString());
	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("inside method beforeNavigateRefresh on " + arg0.toString());
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("inside method beforeNavigateTo on " + arg0.toString());
	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("inside method beforeScrip on " + arg0.toString());
	}

	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("inside method onException on " + arg0.toString());
	}

}
