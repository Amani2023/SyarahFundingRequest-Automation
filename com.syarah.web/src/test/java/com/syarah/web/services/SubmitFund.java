package com.syarah.web.services;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.syarah.web.pages.FinanceApplyPage;

public class SubmitFund {

	private WebDriver driver;
	private String driverPatgh = "E:\\driver\\chromedriver.exe";
	private FinanceApplyPage financeApplyPage;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPatgh);
		driver = new ChromeDriver();
		financeApplyPage = new FinanceApplyPage(driver);
	}

	@Test
	public void SubmitFundRequest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://syarah.com/finance-apply/137860");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"))
				.sendKeys("Amani");
		driver.findElement(financeApplyPage.getGender()).click();
		driver.findElement(financeApplyPage.getUserId()).sendKeys("2500002300");
		driver.findElement(financeApplyPage.getPhonNumber()).sendKeys("0500002300");
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);

		Select drpWorkPlace = new Select(driver.findElement(financeApplyPage.getWorkPlace()));
		drpWorkPlace.selectByIndex(2);

		Select drpCountry = new Select(driver.findElement(financeApplyPage.getCity()));
		drpCountry.selectByIndex(2);

		driver.findElement(financeApplyPage.getSallary()).sendKeys("13000");
		Select drpSalary = new Select(driver.findElement(financeApplyPage.getSalaryTransfer()));
		drpSalary.selectByIndex(2);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(financeApplyPage.getSemaIssue()).click();
		driver.findElement(financeApplyPage.getTraffic()).click();
		driver.findElement(financeApplyPage.getTrafficAmount()).sendKeys("13000");
		driver.findElement(financeApplyPage.getMortgage()).click();
		driver.findElement(financeApplyPage.getAnotherFinance()).click();
		driver.findElement(financeApplyPage.getMonthlyInstallment()).sendKeys("13000");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		driver.findElement(financeApplyPage.getSubmit()).click();

		Thread.sleep(6000);
		if(driver.findElement(financeApplyPage.getFinanceStatus()).getText().contains("نعتذر"))
		System.out.print("Build Output=>" + "Order Rejected");
		else
			System.out.print("Build Output=>" + "Order Approved");
	}

	@After
	public void tearDown() {
		// driver.quit();
	}
}
