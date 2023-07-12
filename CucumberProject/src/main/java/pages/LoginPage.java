package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver(); 
	}
	
	public void openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=SB54a79X22Y&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiU0I1NGE3OVgyMlkiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY4MTA3MTM3MCwiaWF0IjoxNjgxMDcwMTcwLCJqdGkiOiI2YzM2YjVlYS1kNTljLTQ2MGMtYjUxOC04OTM2ZTdlMjU0YmYiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.Jd7cfVHN2QujSuKXh5pCgTw-nYIQUVlKzCs99K_OAPRDRJoQScsM4GYW8YNKSrqHEf0Rw_BaeZLijOvD4UUYcX654hU0ZIok-de_NA8DkBd_TLFQqVardTAx9Q_H-J7_oEi225qwxruK-2X8q4LyTaDdue2MHI5fQW4WK7CZaCyfXeO6sgfhlKTxY1H_kOouSglIo6EJ9-4cxm1YLJoYXmOolTaptbWrdh_eQvPpUI-EFYdp30AFWucNjqkAMhEHg7IPeXdFLxF6US6wf8YLS8SzKZ5GN9ZXsCYO91BIL8G4dyJlhBmvQwUXi0ueTmQwB0kU0ZAtL3lmHRWYPuE6ww&preferred_environment=");
	}
	
	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void enterEmailAndPassword(String a, String b) {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
	}
	
	public void clickOnLoginButton() throws InterruptedException {
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
	}
	
	public String readEmailErr() {
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		return actualErr;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
