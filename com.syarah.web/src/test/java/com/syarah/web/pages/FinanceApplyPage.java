package com.syarah.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FinanceApplyPage {

	protected WebDriver driver;
	private By fullName = By.name("applicant_name");// ("/html/body/div[1]/div[1]/main/div/div[1]/form/div[1]/div[2]/input");
	private By gender = By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[2]/div/div/label[1]/input");
	private By userId = By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[3]/div/input");
	private By phonNumber = By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[4]/div/input");
	private By sallary = By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[7]/div/input");
	private By semaIssue = By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[9]/div/div/label[1]/input");
	private By traffic = By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[10]/div/div/label[1]/input");
	private By trafficAmount = By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[11]/div/input");
	private By mortgage = By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[12]/div/div/label[1]/input");
	private By anotherFinance = By
			.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[13]/div/div/label[1]/input");
	private By monthlyInstallment = By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[14]/div/input");
	private By submit = By.xpath("/html/body/div[1]/div[1]/main/div/div[1]/form/div[15]/button");
	private By workPlace = By.xpath("//select[@name='جهة العمل']");
	private By city = By.xpath("//select[@name='city_id']");
	private By salaryTransfer = By.xpath("//select[@name='salary_transfer_method']");

	private By financeStatus = By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/h3[1]");

	public By getFinanceStatus() {
		return financeStatus;
	}

	public void setFinanceStatus(By financeStatus) {
		this.financeStatus = financeStatus;
	}

	public void get_page_title() {

	}

	public By getSalaryTransfer() {
		return salaryTransfer;
	}

	public void setSalaryTransfer(By salaryTransfer) {
		this.salaryTransfer = salaryTransfer;
	}

	public FinanceApplyPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public By getFullName() {
		return fullName;
	}

	public void setFullName(By fullName) {
		this.fullName = fullName;
	}

	public By getGender() {
		return gender;
	}

	public void setGender(By gender) {
		this.gender = gender;
	}

	public By getUserId() {
		return userId;
	}

	public void setUserId(By userId) {
		this.userId = userId;
	}

	public By getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(By phonNumber) {
		this.phonNumber = phonNumber;
	}

	public By getSallary() {
		return sallary;
	}

	public void setSallary(By sallary) {
		this.sallary = sallary;
	}

	public By getSemaIssue() {
		return semaIssue;
	}

	public void setSemaIssue(By semaIssue) {
		this.semaIssue = semaIssue;
	}

	public By getTraffic() {
		return traffic;
	}

	public void setTraffic(By traffic) {
		this.traffic = traffic;
	}

	public By getTrafficAmount() {
		return trafficAmount;
	}

	public void setTrafficAmount(By trafficAmount) {
		this.trafficAmount = trafficAmount;
	}

	public By getMortgage() {
		return mortgage;
	}

	public void setMortgage(By mortgage) {
		this.mortgage = mortgage;
	}

	public By getAnotherFinance() {
		return anotherFinance;
	}

	public void setAnotherFinance(By anotherFinance) {
		this.anotherFinance = anotherFinance;
	}

	public By getMonthlyInstallment() {
		return monthlyInstallment;
	}

	public void setMonthlyInstallment(By monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}

	public By getSubmit() {
		return submit;
	}

	public void setSubmit(By submit) {
		this.submit = submit;
	}

	public void selectCity() {

	}

	public void selectWorkPlace() {

	}

	public By getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(By workPlace) {
		this.workPlace = workPlace;
	}

	public By getCity() {
		return city;
	}

	public void setCity(By city) {
		this.city = city;
	}

}
