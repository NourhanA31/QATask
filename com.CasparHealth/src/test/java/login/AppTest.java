package login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import common.CommonConstants;
import common.CommonFunctions;
import common.TestBase;

public class AppTest extends TestBase
{
	@Test(enabled = true, priority =2)
	public static void addPatient() throws IOException
	{
		WebElement casparID = driver.findElement(ElementsID.BY_ID_CASPAR_ID);
		casparID.sendKeys(CommonFunctions.getTestData(1, 1, CommonConstants.CREDENTIALS_SHEET));
		WebElement password = driver.findElement(ElementsID.BY_ID_PASSWORD);
		password.sendKeys(CommonFunctions.getTestData(1, 2, CommonConstants.CREDENTIALS_SHEET));
		WebElement loginBtn = driver.findElement(ElementsID.BY_XPATH_LOGIN_BTN);
		loginBtn.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement addBtn = driver.findElement(ElementsID.BY_XPATH_ADD_PATIENT_BTN);
		addBtn.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement pageTitle = driver.findElement(ElementsID.BY_XPATH_PAGE_TITLE);
		assertEquals(pageTitle.getText(), Constants.ADD_PATIENT_TITLE);
		//Fill the new patient form data from TestData sheet
		WebElement firstName = driver.findElement(ElementsID.BY_ID_FIRST_NAME);
		firstName.sendKeys(CommonFunctions.getTestData(1, 0, CommonConstants.PATIENTS_SHEET));
		WebElement lastName = driver.findElement(ElementsID.BY_ID_LAST_NAME);
		lastName.sendKeys(CommonFunctions.getTestData(1, 1, CommonConstants.PATIENTS_SHEET));
		WebElement dayDropDown = driver.findElement(ElementsID.BY_ID_BIRTH_DAY);
		dayDropDown.click();
		WebElement dayOption = driver.findElement(By.xpath("//span[contains(text(),'"+ CommonFunctions.getTestData(1, 2, CommonConstants.PATIENTS_SHEET)+ "')]"));
		dayOption.click();
		WebElement monthDropDown = driver.findElement(ElementsID.BY_ID_BIRTH_MONTH);
		monthDropDown.click();
		WebElement monthOption = driver.findElement(By.xpath("//span[contains(text(),'"+ CommonFunctions.getTestData(1, 3, CommonConstants.PATIENTS_SHEET)+ "')]"));
		monthOption.click();
		WebElement yearDropDown = driver.findElement(ElementsID.BY_ID_BIRTH_YEAR);
		yearDropDown.click();
		WebElement yearOption = driver.findElement(By.xpath("//span[contains(text(),'"+ CommonFunctions.getTestData(1, 4, CommonConstants.PATIENTS_SHEET)+ "')]"));
		yearOption.click();
	    WebElement genderDropDown = driver.findElement(ElementsID.BY_ID_GENDER);
	    genderDropDown.click();
		WebElement genderOption = driver.findElement(By.xpath("//span[contains(text(),'"+ CommonFunctions.getTestData(1, 5, CommonConstants.PATIENTS_SHEET)+ "')]"));
		genderOption.click();
	    WebElement height = driver.findElement(ElementsID.BY_ID_HEIGHT);
	    height.sendKeys(CommonFunctions.getTestData(1, 6, CommonConstants.PATIENTS_SHEET));
	    WebElement weight = driver.findElement(ElementsID.BY_ID_WEIGTH);
	    weight.sendKeys(CommonFunctions.getTestData(1, 7, CommonConstants.PATIENTS_SHEET));
	    WebElement bmi = driver.findElement(ElementsID.BY_ID_BMI);
	    bmi.sendKeys(CommonFunctions.getTestData(1, 8, CommonConstants.PATIENTS_SHEET));
	    WebElement therapyGoal = driver.findElement(ElementsID.BY_ID_THERAPY_GOAL);
	    therapyGoal.sendKeys(CommonFunctions.getTestData(1, 9, CommonConstants.PATIENTS_SHEET));
	    WebElement therapyRecomm = driver.findElement(ElementsID.BY_ID_RECOMMENDATION);
	    therapyRecomm.sendKeys(CommonFunctions.getTestData(1, 10, CommonConstants.PATIENTS_SHEET));
	    WebElement other = driver.findElement(ElementsID.BY_ID_OTHER);
	    other.sendKeys(CommonFunctions.getTestData(1,11, CommonConstants.PATIENTS_SHEET));
	    WebElement email = driver.findElement(ElementsID.BY_ID_EMAIL);
	    email.sendKeys(CommonFunctions.getTestData(1, 12, CommonConstants.PATIENTS_SHEET));
	    WebElement phone = driver.findElement(ElementsID.BY_ID_PHONE);
	    phone.sendKeys(CommonFunctions.getTestData(1, 13, CommonConstants.PATIENTS_SHEET));
	    WebElement street = driver.findElement(ElementsID.BY_ID_STREET);
	    street.sendKeys(CommonFunctions.getTestData(1, 14, CommonConstants.PATIENTS_SHEET));
	    WebElement streetNum = driver.findElement(ElementsID.BY_ID_STREET_NUM);
	    streetNum.sendKeys(CommonFunctions.getTestData(1, 15, CommonConstants.PATIENTS_SHEET));
	    WebElement zip = driver.findElement(ElementsID.BY_ID_ZIP);
	    zip.sendKeys(CommonFunctions.getTestData(1, 16, CommonConstants.PATIENTS_SHEET));
	    WebElement city = driver.findElement(ElementsID.BY_ID_CITY);
	    city.sendKeys(CommonFunctions.getTestData(1, 17, CommonConstants.PATIENTS_SHEET));
	    JavascriptExecutor scroll = (JavascriptExecutor)driver;
	    scroll.executeScript("window.scrollBy(0,250)", "");
	    WebElement countryDropDown = driver.findElement(ElementsID.BY_ID_COUNTRY);
	    countryDropDown.click();
		WebElement countryOption = driver.findElement(By.xpath("//span[contains(text(),'"+ CommonFunctions.getTestData(1, 18, CommonConstants.PATIENTS_SHEET)+ "')]"));
		countryOption.click();
	    WebElement saveBtn = driver.findElement(ElementsID.BY_XPATH_SAVE_BTN);
	    assertTrue(saveBtn.isEnabled());
	    saveBtn.click();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  //  WebElement title = driver.findElement(ElementsID.BY_ID_TITLE);
	  //  assertTrue(title.isDisplayed());
	  //  assertEquals(title.getText(), Constants.PATIENT_STATUS_TITLE);
	  //  WebElement subtitle = driver.findElement(ElementsID.BY_XPATH_SUBTITLE);
	  //  assertTrue(subtitle.isDisplayed());
	  //  assertEquals(subtitle.getText(), Constants.PATIENT_STATUS_SUBTITLE);
	    WebElement newID = driver.findElement(ElementsID.BY_XPATH_NEW_ID);
	    String newUserID  = newID.getText();
	    WebElement tempPW = driver.findElement(ElementsID.BY_XPATH_NEW_PW);
	    String newTempPW = tempPW.getText();
	    WebElement closeBtn = driver.findElement(ElementsID.BY_XPATH_CLOSE_BTN);
	    closeBtn.click();
	    WebElement userLogo = driver.findElement(ElementsID.BY_XPATH_INTIALS);
	    userLogo.click();
	    WebElement signOut = driver.findElement(ElementsID.BY_XPATH_SIGN_OUT);
	    signOut.click();
	    WebElement loginHeader = driver.findElement(ElementsID.BY_XPATH_LOGIN_HEADER);
	    assertTrue(loginHeader.isDisplayed());
	    assertEquals(loginHeader.getText(), Constants.LOGIN_HEADER);
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    WebElement newIDSign = driver.findElement(ElementsID.BY_ID_CASPAR_ID_NEW);
	    newIDSign.sendKeys(newUserID);
	    WebElement newPWSign = driver.findElement(ElementsID.BY_ID_CASPAR_PW_NEW);
	    newPWSign.sendKeys(newTempPW);
	    WebElement secondLogin = driver.findElement(ElementsID.BY_XPATH_LOGIN_BTN);
	    secondLogin.click();
	    driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	    String tcURL = driver.getCurrentUrl();
	    assertTrue(tcURL.contains("terms_of_service"));
	}
}
