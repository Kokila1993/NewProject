package org.link;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class BrokenLInks {
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kokpa\\eclipse-workspace\\new\\NewJava\\Driver\\chromedriver.exe");
	WebDriver driver = new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	
	int count = 0;
	for (int i = 0; i < allLinks.size(); i++) {
		WebElement individualLink = allLinks.get(i);
		
		String attribute = individualLink.getAttribute("href");
		
		URL u = new URL(attribute);
		
		URLConnection openConnection = u.openConnection();
		
		HttpsURLConnection hc = (HttpsURLConnection)openConnection;
		
		int responseCode = hc.getResponseCode();
		
		if (responseCode != 200) {
			
			System.out.println(attribute);
		
		}
		
		
	}
	
	System.out.println("Total number of Broken Links :"+count);
	
	driver.close();
	}
	
	

}
