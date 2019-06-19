package login;

import org.openqa.selenium.By;

public class ElementsID {
	
	//Login Page
	public final static By BY_XPATH_LOGIN_HEADER = By.xpath("/html/body/app-root/div/ui-view/ng-component/ui-view/app-sign-in/div/div[2]/div[1]/div/h1");
	public final static By BY_ID_CASPAR_ID = By.id("mat-input-0");
	public final static By BY_ID_CASPAR_ID_NEW = By.id("mat-input-26");
	public final static By BY_ID_PASSWORD = By.id("mat-input-1");
	public final static By BY_ID_CASPAR_PW_NEW = By.id("mat-input-27");
	public final static By BY_XPATH_LOGIN_BTN = By.xpath("/html/body/app-root/div/ui-view/ng-component/ui-view/app-sign-in/div/div[2]/form/div[3]/div/button");

	//Home Page
	public final static By BY_XPATH_ADD_PATIENT_BTN = By.xpath("/html/body/app-root/div/ui-view/ng-component/ui-view/app-therapist-dashboard/app-stats-display/div/div[1]/button");
	public final static By BY_XPATH_INTIALS = By.xpath("/html/body/app-root/ui-view/app-top-navigation/nav/div[2]/app-user-logo/div");
	public final static By BY_XPATH_SIGN_OUT = By.xpath("/html/body/div[3]/div[2]/div/div/div/button[2]");
	
	//Add Patient Page
	public final static By BY_XPATH_PAGE_TITLE = By.xpath("/html/body/app-root/ui-view/app-top-navigation/nav/h1");
	public final static By BY_ID_FIRST_NAME = By.id("mat-input-7");
	public final static By BY_ID_LAST_NAME = By.id("mat-input-8");
	public final static By BY_ID_BIRTH_DAY = By.id("mat-select-1");
	public final static By BY_ID_BIRTH_MONTH = By.id("mat-select-2");
	public final static By BY_ID_BIRTH_YEAR = By.id("mat-select-3");
	public final static By BY_ID_GENDER = By.id("mat-select-0");
	public final static By BY_ID_HEIGHT = By.id("mat-input-11");
	public final static By BY_ID_WEIGTH = By.id("mat-input-12");
	public final static By BY_ID_BMI = By.id("mat-input-13");
	public final static By BY_ID_THERAPY_GOAL = By.id("mat-input-14");
	public final static By BY_ID_RECOMMENDATION = By.id("mat-input-15");
	public final static By BY_ID_OTHER = By.id("mat-input-16");
	public final static By BY_ID_EMAIL = By.id("mat-input-9");
	public final static By BY_ID_PHONE = By.id("mat-input-10");
	public final static By BY_ID_STREET = By.id("mat-input-17");
	public final static By BY_ID_STREET_NUM = By.id("mat-input-18");
	public final static By BY_ID_ZIP = By.id("mat-input-19");
	public final static By BY_ID_CITY = By.id("mat-input-20");
	public final static By BY_ID_COUNTRY = By.id ("mat-select-4");
	public final static By BY_XPATH_SAVE_BTN = By.xpath("/html/body/app-root/div/ui-view/ng-component/ui-view/app-new-patient/div/div/app-profile-form/form/app-footer/button");
	
	//Creation Status Dialog
	public final static By BY_ID_TITLE = By.id("mat-dialog-title-3");
	public final static By BY_XPATH_SUBTITLE = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-user-dialog/div[2]/div[1]");		
	public final static By BY_XPATH_NEW_ID = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-user-dialog/div[2]/div[3]/div[3]/div[2]");
	public final static By BY_XPATH_NEW_PW = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-user-dialog/div[2]/div[3]/div[4]/div[2]");
	public final static By BY_XPATH_CLOSE_BTN = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-user-dialog/div[3]/button[2]");
}