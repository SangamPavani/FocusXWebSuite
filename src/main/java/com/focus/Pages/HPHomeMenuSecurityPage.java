package com.focus.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.List;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class HPHomeMenuSecurityPage extends BaseEngine
{

    //Home Menu
	@FindBy(xpath="//span[@class='icon-home icon-font1']")
	private static WebElement  homeMenu;   

	//Home Menu Company Menu
	@FindBy(xpath="//*[@id='2']/span")
	private static WebElement  homeCompanyMenu; 
	
	//Home Menu Security Menu
	@FindBy(xpath="//*[@id='6']/span")
	private static WebElement  homeSecurityMenu; 
	
	//Home Menu Password Policy Menu
	@FindBy(xpath="//span[contains(text(),'Password policy')]")
	private static WebElement  homeSecurityPasswordPolicyMenu;   
	
	@FindBy(xpath="//span[contains(text(),'Create Profile')]")
	private static WebElement  homeSecurityCreateProfileMenu;   
	
	@FindBy(xpath="//span[contains(text(),'Create Role')]")
	private static WebElement  homeSecurityCreateRoleMenu; 
	
	@FindBy(xpath="//span[contains(text(),'Create User')]")
	private static WebElement  homeSecurityCreateUserMenu; 
	
	@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Password policy')]")
	private static WebElement  passwordPolicyScreenLabel; 
	
	@FindBy(xpath="//input[@id='policyName']")
	private static WebElement  passwordPolicyPolicyNameTxt; 
	
	@FindBy(xpath="//input[@id='MinPassLength']")
	private static WebElement  passwordPolicyMinPasswordLengthTxt; 
	
	@FindBy(xpath="//select[@id='complexity']")
	private static WebElement  passwordPolicyComplexityDropdown; 
	
	@FindBy(xpath="//input[@id='Donotallprevious']")
	private static WebElement  passwordPolicyDonotallpreviousTxt; 
	
	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	private static WebElement  passwordPolicyAddIcon; 
	
	@FindBy(xpath="//i[@class='icon-font6 icon-delete']")
	private static WebElement  passwordPolicyDeleteIcon; 
	
	@FindBy(xpath="//i[@class='icon-font6 icon-cancel']")
	private static WebElement  passwordPolicyCancelIcon; 
	
	@FindBy(xpath="//span[@id='btnSaveId']//i[@class='icon-save icon-font6']")
	private static WebElement  passwordPolicySaveIcon; 
	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement  passwordPolicyCloseIcon; 
	
	@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Create Profile')]")
	private static WebElement  createProfileLabel; 
	
	@FindBy(xpath="//input[@id='profileName']")
	private static WebElement  createProfileProfileNameDropdown; 
	
	@FindBy(xpath="//a[@id='1']//i[@class='icon icon-expand']")
	private static WebElement  createProfileHomeExpandBtn; 
	
	@FindBy(xpath="//a[@id='60']//i[@class='icon icon-expand']")
	private static WebElement  createProfileFininicalExpandBtn; 
	
	@FindBy(xpath="//a[@id='135']//i[@class='icon icon-expand']")
	private static WebElement  createProfileInventoryExpandBtn; 
	
	@FindBy(xpath="//a[@id='136']//i[@class='icon icon-expand']")
	private static WebElement  createProfileFixedAssestsExpandBtn; 
	
	@FindBy(xpath="//a[@id='3000']//i[@class='icon icon-expand']")
	private static WebElement  createProfileProductionExpandBtn; 
	
	@FindBy(xpath="//a[@id='8000']//i[@class='icon icon-expand']")
	private static WebElement  createProfilePointOfSaleExpandBtn; 
	
	@FindBy(xpath="//a[@id='150']//i[@class='icon icon-expand']")
	private static WebElement  createProfileQualityExpandBtn; 
	
	@FindBy(xpath="//a[@id='16']//i[@class='icon icon-expand']")
	private static WebElement  createProfileSettingExpandBtn; 
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	private static WebElement  createProfileSaveIcon; 
	
	@FindBy(xpath="//i[@class='icon-delete icon-font6']")
	private static WebElement  createProfileDeleteIcon; 
	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement  createProfileCloseIcon; 
	
	@FindBy(xpath="//i[@class='icon-font6 icon-selectall']")
	private static WebElement  createProfileSelectAllIcon; 
	
	@FindBy(xpath="//i[@class='icon-font6 icon-unselectall1']")
	private static WebElement  createProfileUnSelectAllIcon; 
	
	@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Create Role')]")
	private static WebElement  createRoleLabel; 
	
	@FindBy(xpath="//input[@id='roleName']")
	private static WebElement  createRoleRoleNameDropdown; 
	
	@FindBy(xpath="//select[@id='passwordPolicy']")
	private static WebElement  createRolePasswordPolicyDropdown; 
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	private static WebElement  createRoleSaveicon; 
	
	@FindBy(xpath="//i[@class='icon-delete icon-font6']")
	private static WebElement  createRoleDeleteIcon; 
	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement  createRoleCloseIcon; 
	
	@FindBy(xpath="//span[2]//span[1]")
	private static WebElement  createRoleMOveFiledsFronLeftSideToRightSide; 
	
	@FindBy(xpath="//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
	public static WebElement newErrorMessage;
	 
	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement newErrorMessageCloseBtn;

	//Home Menu Security Menu
	@FindBy (xpath="//*[@id='6']/span")
    private static WebElement securityMenu;
	
	//Home Menu Network Policy Menu
		@FindBy (xpath="//*[@id='7']/span")
		private static WebElement networkPolicy;
		
			@FindBy (xpath="//*[@id='securityNavBar']/div/div[1]/a/div/span[2]")
			private static WebElement networkPolicyTitle;
			
			@FindBy (xpath="//*[@id='allowDiv']/div[1]/label")
			private static WebElement allowRadioBtnInNetworkPolicy;
		
			@FindBy (xpath="//*[@id='allowDiv']/div[2]/label")
			private static WebElement blockRadioBtnInNetworkPolicy;
			
			@FindBy (xpath="//*[@id='IPtable']/thead/tr/td[1]")
			private static WebElement startIp;
			
			@FindBy (xpath="//*[@id='IPtable']/thead/tr/td[2]")
			private static WebElement endIp;
				
			@FindBy (xpath="//*[@id='0']/td[1]")
			private static WebElement startIpValue;
			
			@FindBy (xpath="//*[@id='0']/td[2]")
			private static WebElement endIpValue;
			
			@FindBy (xpath="//*[@id='0']/td[2]/span[1]")
			private static WebElement closeImage;
			
			@FindBy (xpath="//*[@id='From']")
			private static WebElement fromIp;
			
			@FindBy (xpath="//*[@id='To']")
			private static WebElement toIp;
			
			@FindBy (xpath="//i[@class='icon-font6 icon-add']")
			private static WebElement addIp;
			
			@FindBy (xpath="//i[@class='icon-font6 icon-clear']")
			private static WebElement clearIp;
			
			@FindBy (xpath="//*[@id='buttons']/span[1]/i")
			private static WebElement saveBtnInNetworkPolicy;
			
			@FindBy (xpath="//*[@id='addbtn']/i")
			private static WebElement updateBtnInNetworkPolicy;
			
			@FindBy (xpath="//*[@id='buttons']/span[2]/i")
			private static WebElement closeBtnInNetworkPolicy;

		@FindBy (xpath="//*[@id='8']/span")
		private static WebElement passwordPolicy;
		
		@FindBy (xpath="//*[@id='9']/span")
		private static WebElement createProfile;
		
		@FindBy (xpath="//*[@id='10']/span")
		private static WebElement createRole;
		
		@FindBy (xpath="//*[@id='11']/span")
		private static WebElement createUser;
		
		@FindBy (xpath="//*[@id='12']/span")
		private static WebElement changePassword;
		
		@FindBy (xpath="//*[@id='13']/span")
		private static WebElement updatePersonalInfo;
		
		@FindBy (xpath="//*[@id='14']/span")
		private static WebElement usageLog;
		
		@FindBy (xpath="//*[@id='644']/span")
		private static WebElement userRightsReport;
		
		@FindBy (xpath="//*[@id='652']/span")
		private static WebElement roleRightsReport;
		
		@FindBy (xpath="//*[@id='653']/span")
		private static WebElement profileRightsReport;
		
		@FindBy(xpath="//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
		private static WebElement msgNPGlobalError;
		
		@FindBy(xpath="//*[@id='idGlobalError']/div/table/tbody/tr/td[3]/span")
		private static WebElement closeMsgNPGlobalError;
		
		@FindBy(xpath="//*[@id='allow']")
		private static WebElement allowRadioBtn;
		

		//Password Policy Menu
		@FindBy (xpath="//*[@id='8']/span")
	    private static WebElement passwordPolicySubMenu;
		
		//Password Policy Screen Title
		@FindBy (xpath="//*[@id='securityNavBar']/div/div[1]/a/div/span[2]")
	    private static WebElement passwordPolicyTitle;
		
		//Password Policy List
		@FindBy (xpath="//*[@id='PolicyListDiv']")
		private static WebElement passwordPolicyList;

		    //Password Policy Name in the List
			@FindBy (xpath="//html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]")
			private static WebElement passwordPolicyNameInList;
		
			//Password Policy Name in the List
			@FindBy (xpath="//html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]")
			private static WebElement passwordPolicyNameListTwo;
				
		//Password Policy AddBtn
		@FindBy (xpath="//*[@id='addPasswordPolicybtn']/i")
		private static WebElement passwordPolicyAddBtn;
		
		//Password Policy DeleteBtn
		@FindBy (xpath="//*[@id='controlBtns']/span[2]/i")
		private static WebElement passwordPolicyDeletebtn;
		
		//Password Policy CancelBtn
		@FindBy (xpath="//*[@id='controlBtns']/span[3]/i")
		private static WebElement passwordPolicyCancelBtn;
		
		//Password Policy SaveBtn
		@FindBy (xpath="//*[@id='btnSaveId']/i")
		private static WebElement passwordPolicySaveBtn;
		
		//Password Policy SaveBtnone
		@FindBy (xpath="//span[@id='btnSaveId']")
		private static WebElement pPSaveBtn;
				
		
	    //Password Policy CloseBtn
	  	@FindBy (xpath="//*[@id='myNavbar']/ul/li/span[2]/i")
	  	private static WebElement passwordPolicyCloseBtn;
		
	    //Password Policy policyName
	  	@FindBy (xpath="//*[@id='policyName']")
	  	private static WebElement policyName;

	    //Password Policy passwordLength
	  	@FindBy (xpath="//*[@id='MinPassLength']")
	  	private static WebElement passwordLength;
	   	
	    //Password Policy passwordComplexity
	  	@FindBy (xpath="//*[@id='complexity']")
	  	private static WebElement passwordComplexity;
	  	
	    //Password Policy doNotAllowPreviousPassword
	  	@FindBy (xpath="//*[@id='Donotallprevious']")
	  	private static WebElement doNotAllowPrevious;
	  	
	    //Password Policy passwordExpiryDays
	  	@FindBy (xpath="//*[@id='passwordexpirydays']")
	  	private static WebElement passwordExpiryDays;
	  	
	    //Password Policy passwordOTPExpiryInMins
	  	@FindBy (xpath="//*[@id='OTPexpiryinminute']")
	  	private static WebElement passwordExpiryInMins;
	  	
	    //Password Policy passwordInvalidAttempts
	  	@FindBy (xpath="//*[@id='NoOfInvalidAttemps']")
	  	private static WebElement passwordInvalidAttempts;
	  	
	    //Password Policy passwordLockOut
	  	@FindBy (xpath="//*[@id='Lockoutperiod']")
	  	private static WebElement passwordLockOut;
	  	
	    //Password Policy passwordLockOutUnits
	  	@FindBy (xpath="//*[@id='Units']")
	  	private static WebElement passwordLockOutUnits;
	  	
	    //Password Policy sendMailCheck
	  	@FindBy (xpath="//*[@id='Sendemailchk']")
	  	private static WebElement sendMailCheck;
	  	
	    //Password Policy sendMailOnSuccess
	  	@FindBy (xpath="//*[@id='sendemailonloginsuccesschk']")
	  	private static WebElement sendMailOnSuccess;
	  	
	  	
	    //Password Policy sendMailOnFailure
	  	@FindBy (xpath="//*[@id='Sendemailonloginfailurechk']")
	  	private static WebElement sendMailOnFailure;
	  	
	  	//Password Policy sendMailOnFailure
	  	@FindBy (xpath="//*[@id='PolicyDiv']/div[14]/div/label")
	  	private static WebElement changePasswordAfterFirstLogin;
	  	
	  	//Password Policy sendMailOnFailure
	  	@FindBy (xpath="//*[@id='PolicyDiv']/div[15]/div/label")
	  	private static WebElement cannotChangePassword;
	  	
	  	//Password Policy sendMailOnFailure
	  	@FindBy (xpath="//*[@id='PolicyDiv']/div[16]/div/label")
	  	private static WebElement otpBasedLogin;
	  	
	  	//Password Policy sendMailOnFailure
	  	@FindBy (xpath="//*[@id='sendEmailId']")
	  	private static WebElement sendEmailId;
	  	
	  	//Password Policy sendMailOnFailure
	  	@FindBy (xpath="//*[@id='sendemailonloginsuccessId']")
	  	private static WebElement sendEmailOnLoginSuccess;
	  	
	  	//Password Policy sendMailOnFailure
	  	@FindBy (xpath="//*[@id='SendemailonloginfailureId']")
	  	private static WebElement sendEmailOnLoginFailure;
	  	
		@FindBy(xpath="//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
		private static WebElement msgPasswordGlobalError;
		
		@FindBy(xpath="//*[@id='idGlobalError']/div/table/tbody/tr/td[3]/span")
		private static WebElement closeMsgPasswordGlobalError;

	  	
		
		

    //Web Elements of CraeteUser Screen
	
	@FindBy(xpath="//span[contains(text(),'Create user')]")
	private static WebElement createUserLabel;

	@FindBy(xpath="//span[contains(text(),'Additional Info')]")
	private static WebElement createUserAdditionalInfoTab;

	@FindBy(xpath="//ul[@class='nav nav-tabs theme_background-color theme_button_color']//span[contains(text(),'Restrictions')]")
	private static WebElement createUserRestrictionsTab;

	@FindBy(xpath="//span[contains(text(),'Device')]")
	private static WebElement createUserDeviceTab;

	@FindBy(xpath="//span[contains(text(),'Restriction for entry')]")
	private static WebElement createUserRestrictionforentryTab;

	@FindBy(xpath="//span[contains(text(),'User Information')]")
	private static WebElement createUserUserInformationTab;

	@FindBy(xpath="//i[@class='icon-font6 icon-create-user']")
	private static WebElement createUserIcon;

	@FindBy(xpath="//i[@class='icon-font6 icon-group']")
	private static WebElement createUserCreateGroupIcon;

	@FindBy(xpath="//i[@class='icon-font6 icon-cancel']")
	private static WebElement createUserCancelIcon;

	@FindBy(xpath="//input[@id='loginName']")
	private static WebElement createUserLoginNameTxt;

	@FindBy(xpath="//select[@id='ERPRoles']")
	private static WebElement createUserERPRoleDropDown;

	@FindBy(xpath="//select[@id='passwordPolicy']")
	private static WebElement createUserPasswordPolicyDropdown;

	@FindBy(xpath="//input[@id='password']")
	private static WebElement createUserPasswordTxt;

	@FindBy(xpath="//input[@id='confirmpassword']")
	private static WebElement createUserPasswordConformTxt;

	@FindBy(xpath="//input[@id='Username']")
	private static WebElement createUserNameTxt;

	@FindBy(xpath="//input[@id='lginAbbr']")
	private static WebElement createUserLoginAbbrivationTxt;

	@FindBy(xpath="//select[@id='SecurityQues']")
	private static WebElement createUserSecurityQuestionDropDown;

	@FindBy(xpath="//input[@id='SecurityAns']")
	private static WebElement createUserSecurityAnswerTxt;

	@FindBy(xpath="//select[@id='language']")
	private static WebElement createUserLanguageTxt;

	@FindBy(xpath="//select[@id='altLanguage']")
	private static WebElement createUserAlternateLanguageTxt;

	@FindBy(xpath="//select[@id='timezone']")
	private static WebElement createUserSelectTimeZoneTxt;

	@FindBy(xpath="//i[@class='icon-unlock-user icon-font6']")
	private static WebElement createUserUnlockUserIcon;

	@FindBy(xpath="//i[@class='icon-move-user icon-font6']")
	private static WebElement createUserMoveUserIcon;

	@FindBy(xpath="//i[@class='icon-reset icon-font6']")
	private static WebElement createUserResetIcon;

	/*@FindBy(xpath="//i[@class='icon-load-from icon-font6 ImagesinArabic']")
	private static WebElement createUserLoadFormIcon;
*/
	@FindBy(xpath="//span[@id='btnLoadForm']")
	private static WebElement createUserLoadFormIcon;	
	
	@FindBy(xpath="//span[@id='btnSave']//i[@class='icon-save icon-font6']")
	private static WebElement createUserSaveIcon;

	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement createUserCloseIcon;

	@FindBy(xpath="//input[@id='emailId']")
	private static WebElement createUserEmailTxt;

	@FindBy(xpath="//select[@id='typeOfUser']")
	private static WebElement createUserUserTypeIcon;

	@FindBy(xpath="//span[contains(text(),'Create User')]")
	private static WebElement createUserMenu;

	@FindBy(xpath="//span[@class='hidden-xs']")
	private static WebElement userNameDisplay;

    
   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
	private static WebElement userNameDisplay;*/

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;

	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;
    
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;
	
	
	 private static String xlfile;
	 private static String resPass="Pass";
	 private static String resFail="Fail";
	 private static ExcelReader excelReader;
	
	 
	 
	//Home Menu Security Network Policy Page Starts
	 
	 public static boolean checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			LoginPage lp=new LoginPage(getDriver()); 
			
	        String unamelt="su";
	      
	        String pawslt="su";
	      
	        LoginPage.enterUserName(unamelt);
	
	        LoginPage.enterPassword(pawslt);
	  
	        LoginPage.clickOnSignInBtn();
	        
	        Thread.sleep(9000);
	           	
	    	String userInfo=userNameDisplay.getText();
	    	
	    	System.out.println("User Info : "+userInfo);
	    	
	    	System.out.println("User Info Capture Text :"+userNameDisplay.getText());
	    	
	    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
	    	
	    	companyLogo.click();
	    	
	    	String getCompanyTxt=companyName.getText();
	    	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
	    	System.out.println("company name :"+ getLoginCompanyName);
	    	companyLogo.click();
	    	
	    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
	    	
	    	String getDashboard=dashboard.getText();
	    	
	    	System.out.println(getDashboard);

			  if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
			    		getDashboard.equalsIgnoreCase("Dashboard"))
			  {
					excelReader.setCellData(xlfile, "Sheet1", 7, 9, resPass);
					return true;
			  }
			  else
			  {
					excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
					return true;
			  }

	 }
	 
	 
	 
	 
	public static boolean checkOpenNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException  
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			
		homeMenu.click();
			
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
			
		securityMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicy));
	 	
	 	networkPolicy.click();
	
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicyTitle));
	 	
		String getNetPolicyScreenName=networkPolicyTitle.getText();
        
		System.out.println(getNetPolicyScreenName);
		
		  if(getNetPolicyScreenName.equalsIgnoreCase("Network Policy"))
		  {
			System.out.println("Pass : Network Policy Title is displaying Corrrect");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowRadioBtnInNetworkPolicy));
			  
			  if(allowRadioBtnInNetworkPolicy.isDisplayed())
			  {
				  System.out.println("pass allowRadioBtnInNetworkPolicy");
				  
				  if(blockRadioBtnInNetworkPolicy.isDisplayed())
				  {
					  System.out.println("pass blockRadioBtnInNetworkPolicy");
		
					  if(startIp.isDisplayed())
					  {
						  System.out.println("pass startIp");
			
						  if(endIp.isDisplayed())
						  {
							  System.out.println("pass endIp");
				
							  if(fromIp.isDisplayed())
							  {
								  System.out.println("pass fromIp");
					
								  if(toIp.isDisplayed())
								  {
									  System.out.println("pass toIp");
						              
									  if(addIp.isDisplayed())
									  {
										  System.out.println("pass addIp");
							
										  if(clearIp.isDisplayed())
										  {
											  System.out.println("pass clearIp");
								
											  if(saveBtnInNetworkPolicy.isDisplayed())
											  {
												  System.out.println("pass saveBtnInNetworkPolicy");
												  
												  if(closeBtnInNetworkPolicy.isDisplayed())
												  {
													  System.out.println("pass closeBtnInNetworkPolicy");
													  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resPass);
                                                      return true;
												  }
												  else
												  {
													  System.out.println("Fail closeBtnInNetworkPolicy");
													  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
													  return false;
												  }  

											  }
											  else
											  {
												  System.out.println("Fail saveBtnInNetworkPolicy");
												  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
												  return false;
											  }  
										  }
										  else
										  {
											  System.out.println("Fail clearIp");
											  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
											  return false;
										  }  

										  
									  }
									  else
									  {
										  System.out.println("Fail addIp");
										  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
										  return false;
									  }  
								  }		  
								  else
								  {
									  System.out.println("Fail toIp");
									  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
									  return false;
								  }  
							  }
							  else
							  {
								  System.out.println("Fail fromIp");
								  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
								  return false;
							  }  
						  }

						  else
						  {
							  System.out.println("Fail endIp");
							  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
							  return false;
						  }  
					  }

					  else
					  {
						  System.out.println("Fail startIp");
						  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
						  return false;
					  }  
				  }

				  else
				  {
					  System.out.println("Fail blockRadioBtnInNetworkPolicy");
					  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
					  return false;
				  }  
			  }

			  else
			  {
				  System.out.println("Fail allowRadioBtnInNetworkPolicy");
				  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
				  return false;
			  }  
		  }

		  else
		  {
			  System.out.println("Fail Network Policy Title is displaying Wrong");
			  excelReader.setCellData(xlfile, "Sheet4", 8, 9, resFail);
			  return false;
		  }  
	  }
	
	
	
	
	public static boolean checkAddBtnWithAllBlankIPsInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException  
	{

		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));
			
		addIp.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(msgNPGlobalError));
		
        String getMandatoryMessageNewPassword=msgNPGlobalError.getText();
        
		System.out.println(getMandatoryMessageNewPassword);
        
		
		if(getMandatoryMessageNewPassword.equalsIgnoreCase("Enter To IP Address"))
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
			closeMsgNPGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 9, 9, resPass);
			return true;
		}
		else
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
			closeMsgNPGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 9, 9, resFail);
			return false;
		}
	}
	
	
	
	public static boolean checkAddBtnFromIPMoreThanToIPCheckInNetworkPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));
	
		fromIp.click();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		fromIp.sendKeys("192.193.9.91");
		
		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(toIp));
		
		toIp.clear();
		
		toIp.sendKeys("0");
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));
		
		addIp.click();
		
		Thread.sleep(2000);
		
        String getMandatoryMessageNewPassword=msgNPGlobalError.getText();
		
		System.out.println(getMandatoryMessageNewPassword);
		
		if(getMandatoryMessageNewPassword.equalsIgnoreCase("The End range of IP Address can not be less than Start range."))
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
			closeMsgNPGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 10, 9, resPass);
			return true;
		}
		else
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
			closeMsgNPGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 10, 9, resFail);
			return false;
		}
		
	}
	
	

	
	public static boolean checkAddBtnFromEndingWithZeroCheckInNetworkPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));
	
		fromIp.click();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		fromIp.sendKeys("0.0");
		
		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.RIGHT).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();
		
		toIp.sendKeys("192.193.9.99");
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));
		
		addIp.click();
		
		Thread.sleep(2000);
		
        String getMandatoryMessageNewPassword=msgNPGlobalError.getText();
		
		System.out.println(getMandatoryMessageNewPassword);
		
		if(getMandatoryMessageNewPassword.equalsIgnoreCase("IP cannot end with 0 and Negative values."))
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
			closeMsgNPGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 11, 9, resPass);
			return true;
		}
		else
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
			closeMsgNPGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 11, 9, resFail);
			return false;
		}
		
	}
	
	
	public static boolean checkClearBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearIp));
		clearIp.click();

		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));
		
		addIp.click();
		
		 String getMandatoryMessageNewPassword=msgNPGlobalError.getText();
			
			System.out.println(getMandatoryMessageNewPassword);
			
			if(getMandatoryMessageNewPassword.equalsIgnoreCase("Enter From IP Address"))
			{
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
				closeMsgNPGlobalError.click();
				excelReader.setCellData(xlfile, "Sheet4", 12, 9, resPass);
				return true;
			}
			else
			{
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
				closeMsgNPGlobalError.click();
				excelReader.setCellData(xlfile, "Sheet4", 12, 9, resFail);
				return false;
			}
		
	}
	
	
	
	
	public static boolean checkIpStartWithZeroMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));
	
		fromIp.click();

		fromIp.sendKeys("0.0.0.4");
		
		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(toIp));
		
		toIp.sendKeys("0.0.0.9");
	
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));
		
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));
		
		addIp.click();
		


		
		String getMandatoryMessageNewPassword=msgNPGlobalError.getText();
			
			System.out.println(getMandatoryMessageNewPassword);
			
			if(getMandatoryMessageNewPassword.equalsIgnoreCase("IP cannot start with 0 Negative values."))
			{
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
				closeMsgNPGlobalError.click();
				excelReader.setCellData(xlfile, "Sheet4", 13, 9, resPass);
				return true;
			}
			else
			{
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
				closeMsgNPGlobalError.click();
				excelReader.setCellData(xlfile, "Sheet4", 13, 9, resFail);
				return false;
			}
		
	}
	
	
	
	public static boolean checkInputValidStartIpAndEndIpInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearIp));
		
		clearIp.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));
	
		fromIp.click();

		fromIp.sendKeys("192.168.5.99");
		
		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(toIp));
		
		toIp.sendKeys("192.168.5.99");
	
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));
		
		addIp.click();
	
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(startIpValue));
		
		String getStartIp=startIpValue.getText();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(endIpValue));
		
		String getEndIp=endIpValue.getText();
		
        System.out.println(getStartIp);
        System.out.println(getEndIp);
        
        if(getStartIp.equalsIgnoreCase("192.168.5.99") && getEndIp.equalsIgnoreCase("192.168.5.99"))
        {
        	System.out.println("Pass");
        	excelReader.setCellData(xlfile, "Sheet4", 14, 9, resPass);
        	return true;
        }
        else
        {
        	System.out.println("Fail");
        	excelReader.setCellData(xlfile, "Sheet4", 14, 9, resFail);
        	return false;
        }
		
	}
	
	
	
	
	
	public static boolean checkClickOnSaveBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		 Thread.sleep(2000);
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInNetworkPolicy));
		 saveBtnInNetworkPolicy.click();

	    
		 String getMandatoryMessageNewPassword=msgNPGlobalError.getText();
		 
		 if(getMandatoryMessageNewPassword.equalsIgnoreCase("Network policy saved successfully"))
		 {
			 System.out.println("Pass : Network policy saved successfully");
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
			 closeMsgNPGlobalError.click();
			 excelReader.setCellData(xlfile, "Sheet4", 15, 9, resPass);
			 return true;
		 }
		 else
		 {
			 System.out.println("Fail : Network policy not saved successfully");
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
			 closeMsgNPGlobalError.click();
			 excelReader.setCellData(xlfile, "Sheet4", 15, 9, resFail);
			 return false;
		 }
		
	}
	
	
	
	public static boolean checkUpdateBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(startIpValue));
		
		getAction().doubleClick(startIpValue).perform();
		
		Thread.sleep(2000);
		
		fromIp.click();

		getAction().moveToElement(fromIp).sendKeys(Keys.END).perform();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		
		fromIp.sendKeys("8");
		
		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.END).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();
		
		toIp.sendKeys("8");
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtnInNetworkPolicy));
		
		updateBtnInNetworkPolicy.click();
		
		Thread.sleep(2000);
		
		String getStartIp=startIpValue.getText();
		String getEndIp=endIpValue.getText();
		
        System.out.println(getStartIp);
        System.out.println(getEndIp);
        
        if(getStartIp.equalsIgnoreCase("192.168.5.98") && getEndIp.equalsIgnoreCase("192.168.5.98"))
        {
        	System.out.println("Pass");
        	excelReader.setCellData(xlfile, "Sheet4", 16, 9, resPass);
        	return true;
        }
        else
        {
        	System.out.println("Fail");
        	excelReader.setCellData(xlfile, "Sheet4", 16, 9, resFail);
        	return false;
        }
         
	}
	
	
	
	
	public static boolean checkClearBtnWhileUpdate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(startIpValue));
		
		getAction().doubleClick(startIpValue).perform();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearIp));
		
		clearIp.click();			
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));
	
		fromIp.click();
		
		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();
		
		getAction().moveToElement(toIp).sendKeys(Keys.SHIFT,Keys.TAB).perform();
		
		String getStartIpClear=fromIp.getAttribute("value");
		
		System.out.println(getStartIpClear);
	
		getAction().moveToElement(toIp).sendKeys(Keys.TAB).perform();
		
		String getEndIpclear=toIp.getAttribute("value");
		
       
        System.out.println(getEndIpclear);
        
        
        if(getStartIpClear.equalsIgnoreCase("0.0.0.0") && getEndIpclear.equalsIgnoreCase("0.0.0.0"))
        {
        	System.out.println("Pass");
        	excelReader.setCellData(xlfile, "Sheet4", 17, 9, resPass);
        	return true;
        }
        else
        {
        	System.out.println("Fail");
        	excelReader.setCellData(xlfile, "Sheet4", 17, 9, resFail);
        	return false;
        }
		
	}
	
	
	
	
	
	public static boolean checkCloseBtn() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInNetworkPolicy));
		 closeBtnInNetworkPolicy.click();

	     getWaitForAlert();
	       
	     String getExpectedCompMsg="Are you sure to close netWork policy?";
	     
	     String actCompanySaveMsg=getDriver().switchTo().alert().getText();
	     
	     System.out.println(getExpectedCompMsg);
	     
	     System.out.println(actCompanySaveMsg);
	     
	     Assert.assertEquals(actCompanySaveMsg, getExpectedCompMsg);
	     
	     getDriver().switchTo().alert().dismiss();
	     
         if(getExpectedCompMsg.equalsIgnoreCase(actCompanySaveMsg))
         {
         	System.out.println("Pass");
         	excelReader.setCellData(xlfile, "Sheet4", 18, 9, resPass);
         	return true;
         }
         else
         {
         	System.out.println("Fail");
         	excelReader.setCellData(xlfile, "Sheet4", 18, 9, resFail);
         	return false;
         }

	}
	
	
	
	
   public static boolean checkTitleAfterClickOnCancelBtnInAlertWhenUserClickOnCloseBtn() throws EncryptedDocumentException, InvalidFormatException, IOException
   {
	   
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	   
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicyTitle));
		
        String getNetPolicyScreenName=networkPolicyTitle.getText();
        
        if(getNetPolicyScreenName.equalsIgnoreCase("Network Policy"))
        {
        	System.out.println("Pass : Cancel button is working in the Alert Of Close");
         	excelReader.setCellData(xlfile, "Sheet4", 19, 9, resPass);
        	return true;
        }
        else
        {
        	System.out.println("Fail : Cancel button is working in the Alert Of Close");
         	excelReader.setCellData(xlfile, "Sheet4", 19, 9, resFail);
        	return false;
        }  
   }
   
	//Dash board Page
	@FindBy(xpath="//*[@id='dashName']")
    private static WebElement labelDashboard ;
	
	@FindBy(xpath="//*[@id='Select_dash']")
	private static WebElement selectDashboard ;
		
	@FindBy(xpath="//*[@id='Dashboard_AddDash']")
    private static WebElement newAddDashBoard;
	 
    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
    private static WebElement dashboardCustomizationSettings;
	
	
   
   
   public static boolean checkCloseAlertInAlertClickOnOkBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 String getExpectedCompMsg="Are you sure to close netWork policy?";

		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInNetworkPolicy));
		 closeBtnInNetworkPolicy.click();
		 
	     getWaitForAlert();
	     
	     String actCompanySaveMsg=getDriver().switchTo().alert().getText();

	     getDriver().switchTo().alert().accept();
	     
	     Thread.sleep(2000);
	     
	     if(getExpectedCompMsg.equalsIgnoreCase(actCompanySaveMsg) && labelDashboard.isDisplayed() &&
	    		 selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() &&
	    		 dashboardCustomizationSettings.isDisplayed())
         {
         	System.out.println("Pass");
         	excelReader.setCellData(xlfile, "Sheet4", 20, 9, resPass);
         	return true;
         }
         else
         {
         	System.out.println("Fail");
         	excelReader.setCellData(xlfile, "Sheet4", 20, 9, resFail);
         	return false;
         }
	     
	}
   
   
	public static boolean checkCloseImageInIpTextBoxOnMove() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	     String winHandleBefore =getDriver().getWindowHandle();

	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		 homeMenu.click();
		
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		 securityMenu.click();

		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicy));
		 networkPolicy.click();
		
		 Thread.sleep(5000);

		 Actions moveAction=new Actions(getDriver());
		
		 moveAction.moveToElement(closeImage);
		 moveAction.click().build().perform();
		 
		 Thread.sleep(3000);
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInNetworkPolicy));
		 saveBtnInNetworkPolicy.click();

	     getWaitForAlert();
	    
	     String getExpectedCompMsg="Do you want to update empty ip range?";
	     
	     String actCompanySaveMsg=getDriver().switchTo().alert().getText();
	    		  
	     Assert.assertEquals(actCompanySaveMsg, getExpectedCompMsg);
	     
	     System.out.println(actCompanySaveMsg);
	     
	     System.out.println(getExpectedCompMsg);
	     
	     getDriver().switchTo().alert().accept();

	     Thread.sleep(2000);
	     

	     
         if(getExpectedCompMsg.equalsIgnoreCase(actCompanySaveMsg))
         {
        	System.out.println("Pass");
        	excelReader.setCellData(xlfile, "Sheet4", 21, 9, resPass);
   		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInNetworkPolicy));
   		    closeBtnInNetworkPolicy.click();
   		    Thread.sleep(3000);
   		    getDriver().switchTo().alert().accept();
        	return true;
         }
         else
         {
        	System.out.println("Fail");
        	excelReader.setCellData(xlfile, "Sheet4", 21, 9, resFail);
   		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInNetworkPolicy));
   		    closeBtnInNetworkPolicy.click();
   		    Thread.sleep(3000);
   		    getDriver().switchTo().alert().accept();
        	return false;
          }
	   
		
	}
   
	
	@FindBy(xpath="//div[@id='TableDiv']")
	private static WebElement startIpValueAfterDelete;
   
   public boolean checkSavedIpIsdisplayingUserCloseReOpenTheNetworkpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				
		homeMenu.click();
				
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
				
		securityMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicy));
				
		networkPolicy.click();
		
		Thread.sleep(5000);
	  
        if(startIpValueAfterDelete.isDisplayed())
        {
        	System.out.println("Pass");
        	excelReader.setCellData(xlfile, "Sheet4", 22, 9, resPass);
        	return true;
        }
        else
        {
        	System.out.println("Fail");
        	excelReader.setCellData(xlfile, "Sheet4", 22, 9, resFail);
        	return false;
        }

   }
   
   
 public static boolean checkSaveIP() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 {
	 
	   
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	   

 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowRadioBtn));
 	
 	allowRadioBtn.click();
 	
 	fromIp.click();
 	
 	getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
	getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
	getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
	getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
	getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
	getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
	getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
	
	fromIp.sendKeys("192.168.5.91");
	
	getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();
	
	toIp.sendKeys("192.168.5.91");
	
	addIp.click();
	
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInNetworkPolicy));
	 saveBtnInNetworkPolicy.click();

     Thread.sleep(2000);

	 String getMandatoryMessageNewPassword=msgNPGlobalError.getText();
	 
	 if(getMandatoryMessageNewPassword.equalsIgnoreCase("Network policy saved successfully"))
	 {
		 System.out.println("Pass : Network policy saved successfully");
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
		 closeMsgNPGlobalError.click();
		 excelReader.setCellData(xlfile, "Sheet4", 23, 9, resPass);
		 return true;
	 }
	 else
	 {
		 System.out.println("Fail : Network policy not saved successfully");
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgNPGlobalError));
		 closeMsgNPGlobalError.click();
		 excelReader.setCellData(xlfile, "Sheet4", 23, 9, resFail);
		 return false;
	 }
 
 }
 
 
 
 
 public static boolean checkSavedAllowIpInNetworkPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(startIpValue));
		
		getAction().doubleClick(startIpValue).perform();
		
		Thread.sleep(2000);
		
		fromIp.click();		  
	 
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(startIpValue));
		
		String getStartIp=startIpValue.getText();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(endIpValue));
		
		String getEndIp=endIpValue.getText();
		
        System.out.println(getStartIp);
        System.out.println(getEndIp);
        
        if(getStartIp.equalsIgnoreCase("192.168.5.91") && getEndIp.equalsIgnoreCase("192.168.5.91"))
        {
        	System.out.println("Pass : Deleted IP is not displaying in the Network policy");
        	excelReader.setCellData(xlfile, "Sheet4", 24, 9, resPass);
        	return true;
        }
        else
        {
        	System.out.println("Fail : Deleted IP is displaying in the Network policy");
        	excelReader.setCellData(xlfile, "Sheet4", 24, 9, resFail);
        	return false;
        }	   
  }
 
 //Home Menu Security Menu Network Policy Page is Stop
 
 
 
 //Home Menu Security Password Policy Starts
 
 public static boolean checkPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	
	homeMenu.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
	
	securityMenu.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySubMenu));
	
	passwordPolicySubMenu.click();
	
	Thread.sleep(3000);
			
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyTitle));
		
		String getPasswordPolicyScreenName=passwordPolicyTitle.getText();

		System.out.println(getPasswordPolicyScreenName);
		
		if(getPasswordPolicyScreenName.equalsIgnoreCase("Password policy"))
		  {
			System.out.println("Pass : Password Policy Title is displaying Corrrect");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyList));
			  
			  if(passwordPolicyList.isDisplayed())
			  {
				  System.out.println("pass passwordPolicyList");
				  
				  if(passwordPolicyAddBtn.isDisplayed())
				  {
					  System.out.println("pass passwordPolicyAddBtn");
		
					  if(passwordPolicyAddBtn.isDisplayed())
					  {
						  System.out.println("pass passwordPolicyAddBtn");
			
						  if(passwordPolicyDeletebtn.isDisplayed())
						  {
							  System.out.println("pass passwordPolicyDeletebtn");
				
							  if(passwordPolicyCancelBtn.isDisplayed())
							  {
								  System.out.println("pass passwordPolicyCancelBtn");
					
								  if(passwordPolicySaveBtn.isDisplayed())
								  {
									  System.out.println("pass passwordPolicySaveBtn");
						              
									  if(passwordPolicyCloseBtn.isDisplayed())
									  {
										  System.out.println("pass passwordPolicyCloseBtn");
							
										  if(policyName.isDisplayed())
										  {
											  System.out.println("pass policyName");
								
											  if(passwordLength.isDisplayed())
											  {
												  System.out.println("pass passwordLength");
												  
												  if(passwordComplexity.isDisplayed())
												  {
													  System.out.println("pass passwordComplexity");
													 
													  if(doNotAllowPrevious.isDisplayed())
													  {
														  System.out.println("pass doNotAllowPrevious");
														 
														  if(passwordExpiryDays.isDisplayed())
														  {
															  System.out.println("pass passwordExpiryDays");
															 
															  if(passwordExpiryInMins.isDisplayed())
															  {
																  System.out.println("pass passwordExpiryInMins");
																 
																  if(passwordInvalidAttempts.isDisplayed())
																  {
																	  System.out.println("pass passwordInvalidAttempts");
																	 
																	  if(passwordLockOut.isDisplayed())
																	  {
																		  System.out.println("pass passwordLockOut");
																		 
																		  if(passwordLockOutUnits.isDisplayed())
																		  {
																			  System.out.println("pass passwordLockOutUnits");
																			 
																			  if(sendMailCheck.isDisplayed())
																			  {
																				  System.out.println("pass sendMailCheck");
																				 
																				  if(sendMailOnSuccess.isDisplayed())
																				  {
																					  System.out.println("pass sendMailOnSuccess");
																					 
																					  if(sendMailOnFailure.isDisplayed())
																					  {
																						  System.out.println("pass sendMailOnFailure");
																						  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resPass);
																						  return true;
																						  }
																						  else
																						  {
																							  System.out.println("Fail sendMailOnFailure");
																							  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
																							  return false;
																						  }  
																					  }
																					  else
																					  {
																						  System.out.println("Fail sendMailOnSuccess");
																						  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
																						  return false;
																					  }  
																				  }
																				  else
																				  {
																					  System.out.println("Fail sendMailCheck");
																					  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
																					  return false;
																				  }  
																			  }
																			  else
																			  {
																				  System.out.println("Fail passwordLockOutUnits");
																				  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
																				  return false;
																			  }  
																		  }
																		  else
																		  {
																			  System.out.println("Fail passwordLockOut");
																			  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
																			  return false;
																		  }  
																	  }
																	  else
																	  {
																		  System.out.println("Fail passwordInvalidAttempts");
																		  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
																		  return false;
																	  }  
																  }
																  else
																  {
																	  System.out.println("Fail passwordExpiryInMins");
																	  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
																	  return false;
																  }  
															  }
															  else
															  {
																  System.out.println("Fail passwordExpiryDays");
																  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
																  return false;
															  }  
														  }
														  else
														  {
															  System.out.println("Fail doNotAllowPrevious");
															  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
															  return false;
														  }  
													  }
													  else
													  {
														  System.out.println("Fail passwordComplexity");
														  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
														  return false;
													  }  

												  }
												  else
												  {
													  System.out.println("Fail passwordLength");
													  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
													  return false;
												  }  
											  }
											  else
											  {
												  System.out.println("Fail policyName");
												  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
												  return false;
											  }  

											  
										  }
										  else
										  {
											  System.out.println("Fail passwordPolicyCloseBtn");
											  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
											  return false;
										  }  
									  }

									  else
									  {
										  System.out.println("Fail passwordPolicySaveBtn");
										  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
										  return false;
									  }  
								  }
								  else
								  {
									  System.out.println("Fail passwordPolicyCancelBtn");
									  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
									  return false;
								  }  
							  }

							  else
							  {
								  System.out.println("Fail passwordPolicyDeletebtn");
								  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
								  return false;
							  }  
						  }

						  else
						  {
							  System.out.println("Fail passwordPolicyAddBtn");
							  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
							  return false;
						  }  
					  }

					  else
					  {
						  System.out.println("Fail passwordPolicyTitle");
						  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
						  return false;
					  }  
				  }

				  else
				  {
					  System.out.println("Fail passwordPolicyList");
					  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
					  return false;
				  }  
			  }

			  else
			  {
				  System.out.println("Fail Password Policy Title is displaying Wrong");
				  excelReader.setCellData(xlfile, "Sheet4", 29, 9, resFail);
				  return false;
			  }  
		  }
	
	
	public boolean checkPolicyNameAsMandatory() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		passwordPolicyAddBtn.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		passwordPolicySaveBtn.click();
		
		String getPolciyNameAsMandatoryMsg=msgPasswordGlobalError.getText();
		
		System.out.println(getPolciyNameAsMandatoryMsg);
		
		if(getPolciyNameAsMandatoryMsg.equalsIgnoreCase("Provide your policy name"))
		{
			System.out.println("Pass : Policy Name as mandatory message is displaying");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
			closeMsgPasswordGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 30, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Policy Name as mandatory message is not displaying");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
			closeMsgPasswordGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 30, 9, resFail);
			return false;
		}
		
		
	}
	
	
	public boolean checkMinimumPasswordLengthAsMandatory() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(policyName));
		policyName.sendKeys("Simple Policy");
		
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		passwordPolicySaveBtn.click();
		
        String getPasswordLengthAsMandatoryMsg=msgPasswordGlobalError.getText();
		
		System.out.println(getPasswordLengthAsMandatoryMsg);
		
		if(getPasswordLengthAsMandatoryMsg.equalsIgnoreCase("Provide password length"))
		{
			System.out.println("Pass : Policy Password Length as mandatory message is displaying");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
			closeMsgPasswordGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 31, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Policy Password length as mandatory message is not displaying");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
			closeMsgPasswordGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 31, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkMinimumPasswordLengthAsNumericFields() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordLength));
		passwordLength.sendKeys("4Test");
		
        String getPasswordLengthNumeric=passwordLength.getAttribute("value");
		
		System.out.println(getPasswordLengthNumeric);
		
		if(getPasswordLengthNumeric.equalsIgnoreCase("4"))
		{
			System.out.println("Pass : Policy Password Length accepts Numeric");
			excelReader.setCellData(xlfile, "Sheet4", 32, 9, resPass);
            return true;
		}
		else
		{
			System.out.println("Fail : Policy Password Length not accepting Numeric");
			excelReader.setCellData(xlfile, "Sheet4", 32, 9, resFail);
			return false;
		
		}
	}
	
	
	public static boolean checkComplexity() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Select complexity = new Select(passwordComplexity);
		
		String[] complexityValues={"Simple","Alphabets","Alpha-numeric","Alpha-numeirc*","Numeric","Alpha-numeric & special characters","Alpha-numeric & special characters*"};
		 
		int count=0;
		
		boolean q=true;
		
	    List<WebElement> options=complexity.getOptions();
	    
	    
	    for(WebElement we:options)
	    {
	    	for(int i=0;i<complexityValues.length;i++)
	    	{
	    		if(we.getText().equalsIgnoreCase(complexityValues[i]))
	    		{
	    			count=count+1;
	    		
	    		}

	    	}	    	
	    }
	   
	    
	    if(count==6)
	    {
	    	excelReader.setCellData(xlfile, "Sheet4", 33, 9, resPass);
	    	return true;
	    	
	    }
	    else
	    {
	    	excelReader.setCellData(xlfile, "Sheet4", 33, 9, resFail);
	    	return false;
	    	
	    }
	
		
		
	}
	
	
	public static boolean checkPasswordPolicySimpleSave() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		
		passwordPolicySaveBtn.click();
			
        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
		
		System.out.println(getPasswordSaveSimpleMsg);
		
		if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Password policy created successfully"))
		{
			System.out.println("Pass : Password policy Simple complexity Save message is displaying");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
			closeMsgPasswordGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 34, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Simple complexity Save message is not displaying");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
			closeMsgPasswordGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 34, 9, resFail);
			return false;
		}
		
	}
	
	
	
	public static boolean checkPasswordPolicyLists() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameInList));
		
		passwordPolicyNameInList.click();
		
        String getPasswordSaveListName=passwordPolicyNameInList.getText();
		
		System.out.println(getPasswordSaveListName);
		
		if(getPasswordSaveListName.equalsIgnoreCase("Simple Policy"))
		{
			System.out.println("Pass : Password policy Simple is displaying");
			excelReader.setCellData(xlfile, "Sheet4", 35, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Simple is not displaying");
			excelReader.setCellData(xlfile, "Sheet4", 35, 9, resFail);
			return false;
		}
		
	}
	
	
	
	
	public static boolean checkGetTheSimplePasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameInList));
		
		 passwordPolicyNameInList.click();
		
	     String getPolicyName=policyName.getAttribute("value");
			        
	     String getPolicyMinPasswordLength=passwordLength.getAttribute("value");
	     
	     String getPolicyComplexity=passwordComplexity.getText();
     
		 System.out.println(getPolicyName);
		 System.out.println(getPolicyMinPasswordLength);
		 System.out.println("getPolicyComplexity"+getPolicyComplexity);
		
		 Select complexity = new Select(passwordComplexity);

		 List<WebElement> options=complexity.getOptions();
		
		 if(getPolicyName.equalsIgnoreCase("Simple Policy"))
		 {
			System.out.println("Pass : Password policy Simple is displaying");
			//closeMsgPasswordGlobalError.click();
			if(getPolicyMinPasswordLength.equalsIgnoreCase("4"))
			{
				System.out.println("Pass : Password policy Simple is displaying");

						
					WebElement comboBox = passwordComplexity;
					Select selectedValue = new Select(comboBox);
					String wantedText = selectedValue.getFirstSelectedOption().getText();
					System.out.println("wantedText"+wantedText);
				
					
					if(wantedText.equalsIgnoreCase("Simple"))
					{
					    System.out.println("Pass : Password policy Complexity Simple is dipslaying");
					    excelReader.setCellData(xlfile, "Sheet4", 36, 9, resPass);
						return true;
				    }    

				else
				{
					System.out.println("Fail : Password policy Complexity Simple is not displaying");
					excelReader.setCellData(xlfile, "Sheet4", 36, 9, resFail);
					//closeMsgPasswordGlobalError.click();
					return false;
				}
			}
			else
			{
				System.out.println("Fail : Password policy Simple is not displaying");
				excelReader.setCellData(xlfile, "Sheet4", 36, 9, resFail);
				//closeMsgPasswordGlobalError.click();
				return false;
			}
		}
		else
		{
			System.out.println("Fail : Password policy Simple is not displaying");
			excelReader.setCellData(xlfile, "Sheet4", 36, 9, resFail);
			
			//closeMsgPasswordGlobalError.click();
			return false;
		}
		
	}
	
	
	
	public static boolean checkUpdateSimplePasswordPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameInList));
		
		passwordPolicyNameInList.click();
				
		Thread.sleep(2000);
		
		getAction().moveToElement(passwordLength).sendKeys(Keys.END).perform();
		
		getAction().moveToElement(passwordLength).sendKeys(Keys.BACK_SPACE).perform();
		
		passwordLength.sendKeys("3");
				
        passwordPolicySaveBtn.click();
		
        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
		
		System.out.println(getPasswordSaveSimpleMsg);
		
		if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Password policy updated successfully"))
		{
			System.out.println("Pass : Password policy Simple complexity Save message is displaying");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
			closeMsgPasswordGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 37, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Simple complexity Save message is not displaying");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
			closeMsgPasswordGlobalError.click();
			excelReader.setCellData(xlfile, "Sheet4", 37, 9, resFail);
			return false;
		}
		
	}
	
	
	public static boolean checkGetTheUpdatedPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameInList));
		
		passwordPolicyNameInList.click();
		
					WebElement comboBox = passwordComplexity;
					Select selectedValue = new Select(comboBox);
					String wantedText = selectedValue.getFirstSelectedOption().getText();
					System.out.println("wantedText"+wantedText);
				
					
					if(wantedText.equalsIgnoreCase("Simple"))
					{
					    System.out.println("Pass : Password Policy, Updated Complexity is displaying Correct");
					    excelReader.setCellData(xlfile, "Sheet4", 38, 9, resPass);
						return true;
				    }    
					else
					{
						System.out.println("Fail : Password policy, Updated Complexity is not displaying Correct");
						excelReader.setCellData(xlfile, "Sheet4", 38, 9, resFail);
						return false;
					}

		
	}

	
	
	
	
	public static boolean checkAlertOnDeletePasswordPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		passwordPolicyAddBtn.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(policyName));
		policyName.sendKeys("PaswordPolicy");
				
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordLength));
		passwordLength.sendKeys("4");		
				
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		passwordPolicySaveBtn.click();
		
		Thread.sleep(3000);
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameListTwo));
		 
		 passwordPolicyNameListTwo.click();
		 					
		 passwordPolicyDeletebtn.click();
		 
		 getWaitForAlert();
		  
		 
	     String getExpectedCompMsg="Are you sure that you want to delete this policy?";
	     
	     String actCompanySaveMsg=getDriver().switchTo().alert().getText();
	     
	     if(actCompanySaveMsg.equalsIgnoreCase(getExpectedCompMsg))
	     {
	    	 excelReader.setCellData(xlfile, "Sheet4", 39, 9, resPass);
	    	return true;
	     }
	     else
	     {
	    	 excelReader.setCellData(xlfile, "Sheet4", 39, 9, resFail);
	    	 return false;
	     }
	     


									
    	}
	
	
	
	
	public static boolean checkCancelInAlertDeletePasswordPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		Thread.sleep(3000);
	
		
		getAlert().dismiss();
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameListTwo));
		 passwordPolicyNameListTwo.click();

			
			String getPasswordSaveListName=passwordPolicyNameListTwo.getText();
			
			System.out.println(getPasswordSaveListName);
			
			if(getPasswordSaveListName.equalsIgnoreCase("PaswordPolicy"))
			{
				System.out.println("Pass : Password policy Simple is displaying");
				excelReader.setCellData(xlfile, "Sheet4", 40, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Fail : Password policy Simple is not displaying");
				 excelReader.setCellData(xlfile, "Sheet4", 40, 9, resFail);
				return false;
			}
				
					
	 }
	
	
	
	public static boolean checkOkInAlertDeletePasswordPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameListTwo));
		 passwordPolicyNameListTwo.click();
							
           passwordPolicyDeletebtn.click();
 			
		   getWaitForAlert();
            
		   getDriver().switchTo().alert().accept();
            
		   String getPasswordpolicyDeleteSimpleMsg=msgPasswordGlobalError.getText();
			
		   System.out.println(getPasswordpolicyDeleteSimpleMsg);
			
		   if(getPasswordpolicyDeleteSimpleMsg.equalsIgnoreCase("Policy removed Successfully"))
		   {
				System.out.println("Pass : Password policy Simple is Deleted Successfully Message is displaying");
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
				closeMsgPasswordGlobalError.click();
				excelReader.setCellData(xlfile, "Sheet4", 41, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Fail : Password policy Simple is Deleted Successfully Message is not displaying");
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
				closeMsgPasswordGlobalError.click();
				excelReader.setCellData(xlfile, "Sheet4", 41, 9, resFail);
				return false;
			}				
			
	}
	
	
	
	
	public static boolean checkSaveAlphabetsWithDoNotAllowPreviousPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		
		passwordPolicyAddBtn.click();

		policyName.sendKeys("Alphabets with Dont allow Previous as Three");

		passwordLength.sendKeys("4");
		
		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();
		
		
		
		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(1);
		
		
		doNotAllowPrevious.sendKeys("3");

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		
		passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Password policy created successfully"))
				{
					System.out.println("Pass : Password policy Alphabets complexity Save message is displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 42, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Password policy Alphabets complexity Save message is not displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 42, 9, resFail);
					return false;
				}
	}
	
	
	public static boolean checkSaveAlphanumericPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		
		passwordPolicyAddBtn.click();

		policyName.sendKeys("Alphabets With Numeric");

		passwordLength.sendKeys("4");
		
		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();
		
		
		
		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(2);
		
		


		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		
		passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Password policy created successfully"))
				{
					System.out.println("Pass : Password policy Alphabets complexity Save message is displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 43, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Password policy Alphabets complexity Save message is not displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 43, 9, resFail);
					return false;
				}
	}
	
	
	
	public static boolean checkSaveAlphanumericStarPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		
		passwordPolicyAddBtn.click();

		policyName.sendKeys("Alphabets With Numeric Star");

		passwordLength.sendKeys("4");
		
		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();
		
		
		
		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(3);
		
		


		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		
		passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Password policy created successfully"))
				{
					System.out.println("Pass : Password policy Alphabets complexity Save message is displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 44, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Password policy Alphabets complexity Save message is not displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 44, 9, resFail);
					return false;
				}
	}
	
	
	
	public static boolean checkSaveNumericPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		
		passwordPolicyAddBtn.click();

		policyName.sendKeys("Numeric");

		passwordLength.sendKeys("5");
		
		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();
		
		
		
		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(4);
		
		


		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		
		passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Password policy created successfully"))
				{
					System.out.println("Pass : Password policy Alphabets complexity Save message is displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 45, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Password policy Alphabets complexity Save message is not displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 45, 9, resFail);
					return false;
				}
	}
	
	
	
	
	
	public static boolean checkSaveAlphaNumericSpecialPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		
		passwordPolicyAddBtn.click();

		policyName.sendKeys("Alpha Numeric Special");

		passwordLength.sendKeys("6");
		
		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();
		
		
		
		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(5);
		
		


		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		
		passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Password policy created successfully"))
				{
					System.out.println("Pass : Password policy Alphabets complexity Save message is displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 46, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Password policy Alphabets complexity Save message is not displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 46, 9, resFail);
					return false;
				}
	}
	
	
	
	

	public static boolean checkInputAlphaNumericSpecialStarPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		
		passwordPolicyAddBtn.click();

		policyName.sendKeys("Alpha Numeric Special Star with all options");

		passwordLength.sendKeys("12");
		
		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();
	
		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(6);
		
		doNotAllowPrevious.sendKeys("1");

		getAction().moveToElement(doNotAllowPrevious).sendKeys(Keys.TAB).perform();
		
		passwordExpiryDays.sendKeys("1");
		
		getAction().moveToElement(passwordExpiryDays).sendKeys(Keys.TAB).perform();
		
		passwordExpiryInMins.sendKeys("1");
		
		getAction().moveToElement(passwordExpiryInMins).sendKeys(Keys.TAB).perform();
		
		passwordInvalidAttempts.sendKeys("1");
		
		getAction().moveToElement(passwordInvalidAttempts).sendKeys(Keys.TAB).perform();
		
		passwordLockOut.sendKeys("1");
		
		getAction().moveToElement(passwordLockOut).sendKeys(Keys.TAB).perform();
		
        Select lockout = new Select(passwordLockOutUnits);
		
		String[] complexityValues={"Unit","Minute","Hour","Day"};
		 
		int count=0;
		
		boolean q=true;
		
	    List<WebElement> options=lockout.getOptions();
	    
	    for(WebElement we:options)
	    {
	    	for(int i=0;i<complexityValues.length;i++)
	    	{
	    		if(we.getText().equalsIgnoreCase(complexityValues[i]))
	    		{
	    			count=count+1;
	    		
	    		}

	    	}	    	
	    }
	   
	    
	    System.out.print("The count of"+ count);
	    
	    if(count==4)
	    {
	    	excelReader.setCellData(xlfile, "Sheet4", 47, 9, resPass);
	    	
	    	return true;
	    }
	    else
	    {
	    	excelReader.setCellData(xlfile, "Sheet4", 47, 9, resFail);
	    	return false;
	    }

	    
	}
	
	
	
	
public static boolean checkMandatoyEmailAlphaNumericSpecailStarAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	
	  Select lockout = new Select(passwordLockOutUnits);
	  
	  lockout.selectByIndex(1);
		
	  getAction().moveToElement(passwordLockOutUnits).sendKeys(Keys.TAB).perform();
	  
	  sendMailCheck.click();
	 
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		
	  passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Provide email address for Send E-Mail"))
				{
					System.out.println("Pass : Provide email address for Send E-Mail Validation message is displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 48, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Provide email address for Send E-Mail Validation message is not displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 48, 9, resFail);
					return false;
				}
		
}
	

public static boolean checkMandatoryEmailOnLoginSuccess() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	 
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));
	  
	  sendEmailId.sendKeys("naveenkumar@focussoftnet.com");
	  
	  getAction().moveToElement(sendEmailId).sendKeys(Keys.TAB).perform();
	  
	  sendMailOnSuccess.click();
	
	  passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Provide email address for Send E-Mail on login success"))
				{
					System.out.println("Pass : Provide email address for Send E-Mail on Login Success Validation message is displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 49, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Provide email address for Send E-Mail on Login Success Validation message is not displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 49, 9, resFail);
					return false;
				}
				
}
	
	


public static boolean checkMandatoryEmailOnLoginFailure() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));
	  
	  sendEmailOnLoginSuccess.sendKeys("naveenkumar@focussoftnet.com");
	  
	  Thread.sleep(2000);
	  
	  getAction().moveToElement(sendEmailOnLoginSuccess).sendKeys(Keys.TAB).perform();
	  
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendMailOnFailure));
	  sendMailOnFailure.click();
	  
	  Thread.sleep(2000);
	  
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
	  passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Provide email address for Send E-Mail on login failure"))
				{
					System.out.println("Pass : Provide email address for Send E-Mail on login failure Validation message is displaying");
					if(closeMsgPasswordGlobalError.isDisplayed())
					{
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
						closeMsgPasswordGlobalError.click();	
					}
					
					Thread.sleep(9000);
					excelReader.setCellData(xlfile, "Sheet4", 50, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Provide email address for Send E-Mail on login failure Validation message is not displaying");
					if(closeMsgPasswordGlobalError.isDisplayed())
					{
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
						closeMsgPasswordGlobalError.click();	
					}
					Thread.sleep(9000);
					excelReader.setCellData(xlfile, "Sheet4", 50, 9, resFail);
					return false;
				}
}


public static boolean checkValidEmailOnSendEmailId() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendMailOnFailure));
	  sendMailOnFailure.click();
	
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));
	  	  
	  sendEmailId.click();
	  
	  sendEmailId.clear();
	  
	  sendEmailId.sendKeys("naveenkumar");
	  
	  Thread.sleep(4000);
	  
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
	  
	  passwordPolicySaveBtn.click();
				
	  
		        String getPasswordSaveSimpleInvalidMailMsg=msgPasswordGlobalError.getText();
				
				System.out.println("getPasswordSaveSimpleInvalidMailMsg"+getPasswordSaveSimpleInvalidMailMsg);
				
				
				if(getPasswordSaveSimpleInvalidMailMsg.equalsIgnoreCase("Invalid email address"))
				{
					System.out.println("Pass : Invalid email address message is displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 51, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Invalid email address message is not displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 51, 9, resFail);
					return false;
				}
}

public static boolean checkValidEmailOnLoginSucess() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	  Thread.sleep(3000);
	  
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));
	  
	  sendEmailId.clear();
	  
	  sendEmailId.sendKeys("naveenkumar@focussoftnet.com");
	  
	  getAction().moveToElement(sendEmailId).sendKeys(Keys.TAB).perform();
	  
	  sendMailOnSuccess.click();
	   
	  sendEmailOnLoginSuccess.sendKeys("naveenkumar");
	  
	  //sendEmailOnLoginFailure.sendKeys("naveenkumar@focussoftnet.com");
		
		passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Invalid email address"))
				{
					System.out.println("Pass : Invalid email address message is displaying");
					excelReader.setCellData(xlfile, "Sheet4", 52, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Invalid email address message is not displaying");
					excelReader.setCellData(xlfile, "Sheet4", 52, 9, resFail);
					return false;
				}
}

public static boolean checkValidEmailOnLoginFailure() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));
	  
	  sendEmailOnLoginSuccess.clear();
	  
	  sendEmailOnLoginSuccess.sendKeys("naveenkumar@focussoftnet.com");
	  
	  getAction().moveToElement(sendEmailOnLoginSuccess).sendKeys(Keys.TAB).perform();
	  
	  sendMailOnFailure.click();
	  
	  sendEmailOnLoginFailure.sendKeys("naveenkumar");
		
		passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Invalid email address"))
				{
					System.out.println("Pass : Invalid email address message is displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 53, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Fail : Invalid email address message is not displaying");
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					excelReader.setCellData(xlfile, "Sheet4", 53, 9, resFail);
					return false;
				}
}


public static boolean checkSavePasswordPolicyWithAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));
	  
	  sendEmailId.clear();
	  sendEmailId.sendKeys("naveenkumar@focussoftnet.com");
	  
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailOnLoginSuccess));
	  sendEmailOnLoginSuccess.clear();
	  sendEmailOnLoginSuccess.sendKeys("naveenkumar@focussoftnet.com");
	  
	  
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailOnLoginFailure));
	  sendEmailOnLoginFailure.clear();
	  sendEmailOnLoginFailure.sendKeys("naveenkumar@foussoftnet.com");
		
	  
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(changePasswordAfterFirstLogin));
      changePasswordAfterFirstLogin.click();
	  
	  getAction().moveToElement(changePasswordAfterFirstLogin).sendKeys(Keys.TAB).perform();
	  
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotChangePassword));
	  cannotChangePassword.click();
	  
	  getAction().moveToElement(cannotChangePassword).sendKeys(Keys.TAB).perform();
	  
	  
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(otpBasedLogin));
	  otpBasedLogin.click();
	  
	  
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		passwordPolicySaveBtn.click();
				
		        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
				
				System.out.println(getPasswordSaveSimpleMsg);
				
				if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Password policy created successfully"))
				{
					System.out.println("Pass : Invalid email address message is displaying");
					excelReader.setCellData(xlfile, "Sheet4", 54, 9, resPass);
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					return true;
				}
				else
				{
					System.out.println("Fail : Invalid email address message is not displaying");
					excelReader.setCellData(xlfile, "Sheet4", 54, 9, resFail);
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
					closeMsgPasswordGlobalError.click();
					return false;
				}
}








public static boolean checkCannotChangePasswordInPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		
		passwordPolicyAddBtn.click();

		policyName.sendKeys("Simple With Cannot Change Password");

		passwordLength.sendKeys("2");
		
		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();
		
		getAction().moveToElement(passwordComplexity).sendKeys(Keys.TAB).perform();
		
		//doNotAllowPrevious.sendKeys("1");

		getAction().moveToElement(doNotAllowPrevious).sendKeys(Keys.TAB).perform();
		
		//passwordExpiryDays.sendKeys("1");
		
		getAction().moveToElement(passwordExpiryDays).sendKeys(Keys.TAB).perform();
		
		//passwordExpiryInMins.sendKeys("1");
		
		getAction().moveToElement(passwordExpiryInMins).sendKeys(Keys.TAB).perform();
		
		//passwordInvalidAttempts.sendKeys("1");
		
		getAction().moveToElement(passwordInvalidAttempts).sendKeys(Keys.TAB).perform();
		
		//passwordLockOut.sendKeys("1");
		
		getAction().moveToElement(passwordLockOut).sendKeys(Keys.TAB).perform();
		
		 getAction().moveToElement(passwordLockOutUnits).sendKeys(Keys.TAB).perform();
		
		getAction().moveToElement(sendMailCheck).sendKeys(Keys.TAB).perform();
		getAction().moveToElement(sendMailOnSuccess).sendKeys(Keys.TAB).perform();
		getAction().moveToElement(sendMailOnFailure).sendKeys(Keys.TAB).perform();
		
		
		 getAction().moveToElement(changePasswordAfterFirstLogin).sendKeys(Keys.TAB).perform();
		 
		 cannotChangePassword.click();
		
		 
		 
		 passwordPolicySaveBtn.click();
			
	        String getPasswordSaveSimpleMsg=msgPasswordGlobalError.getText();
			
			System.out.println(getPasswordSaveSimpleMsg);
			
			if(getPasswordSaveSimpleMsg.equalsIgnoreCase("Password policy created successfully"))
			{
				System.out.println("Pass : Invalid email address message is displaying");
				excelReader.setCellData(xlfile, "Sheet4", 55, 9, resPass);
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
				closeMsgPasswordGlobalError.click();
				return true;
			}
			else
			{
				System.out.println("Fail : Invalid email address message is not displaying");
				excelReader.setCellData(xlfile, "Sheet4", 55, 9, resFail);
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeMsgPasswordGlobalError));
				closeMsgPasswordGlobalError.click();
				return false;
			}
		 
}



public static boolean checkCancelBtnInPasswordPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(4999);
	
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		
		passwordPolicyAddBtn.click();

		policyName.sendKeys("Cancel Button");

		passwordLength.sendKeys("2");
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyCancelBtn));
		passwordPolicyCancelBtn.click();

		
		Thread.sleep(4000);
		
		String policyNameCancel=policyName.getAttribute("disabled");
		
		System.out.println("policyNameCancel"+policyNameCancel);
		
		if(policyNameCancel.equalsIgnoreCase("true"))
		{
			excelReader.setCellData(xlfile, "Sheet4", 56, 9, resPass);
			return true;
		
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet4", 56, 9, resFail);
			return false;
			
		}
    }




    //Need to Update this test case
	
	public static boolean checkCloseBtnInPasswordpolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyCloseBtn));
		passwordPolicyCloseBtn.click();
		
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
		
	    if(labelDashboard.isDisplayed() &&
	    		 selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() &&
	    		 dashboardCustomizationSettings.isDisplayed())
	    {
	    	excelReader.setCellData(xlfile, "Sheet4", 57, 9, resPass);
	    	return true;
	    }
	    else
	    {
	    	excelReader.setCellData(xlfile, "Sheet4", 57, 9, resFail);
	    	return false;
	    }
		
	}


    //Home Menu Security Menu Password Policy Stops
 
 
   //Home Menu Security Menu Create Profile Starts
	
	@FindBy(xpath="//span[contains(text(),'Create Profile')]")
	private static WebElement createProfileMenu;

	 public boolean checkOpenSecurityMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		 homeMenu.click();
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		 homeSecurityMenu.click();
		 
		 Thread.sleep(2000);
		
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
		 createProfileMenu.click();
		
		 Thread.sleep(2000);
		
		if (createProfileLabel.isDisplayed() &&createProfileProfileNameDropdown .isDisplayed() && createProfileSaveIcon.isDisplayed() && createProfileDeleteIcon.isDisplayed()
				 /*&& createUserLoadFormIcon.isDisplayed()*/ && createProfileCloseIcon.isDisplayed()&& createProfileSelectAllIcon.isDisplayed()&& createProfileUnSelectAllIcon.isDisplayed()
				 && createProfileHomeExpandBtn.isDisplayed() && createProfileFininicalExpandBtn.isDisplayed() && createProfileInventoryExpandBtn.isDisplayed()
				 && createProfileFixedAssestsExpandBtn.isDisplayed() && createProfilePointOfSaleExpandBtn.isDisplayed() && createProfileQualityExpandBtn.isDisplayed()
				 && createProfileSettingExpandBtn.isDisplayed())
		{
			System.out.println(" Pass :  Displayed Successfully All the Elements in Create Profile Screen ");
			excelReader.setCellData(xlfile, "Sheet4", 62, 9, resPass);
			return true;
		} else {
			System.out.println(" Fail :  Displayed Successfully All the Elements in Create Profile Screen ");
			excelReader.setCellData(xlfile, "Sheet4", 62, 9, resFail);
			return false;
		}
	}
 
	 public boolean checkSaveProfileWithProfileNameAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Please provide profile name";
			System.out.println(Actdata);
			
			
		   if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Save Profile button in the Blank Profile Name");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 63, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail: Save Profile button in the Blank Profile Name");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 63, 9, resFail);
				return false;
			}

		}
 
 
	 
	 public boolean checkErrorMessageDisplayInputProfileName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
			createProfileProfileNameDropdown.click();
			createProfileProfileNameDropdown.sendKeys("All Profile");
	        
			try
			{
				
			  if (newErrorMessage.isDisplayed()) 
			  {
					System.out.println("Pass:  Allow to input the Profile Name as All Profile");
					excelReader.setCellData(xlfile, "Sheet4", 64, 9, resPass);
					return false;
			   } 
			   else 
			   {
					System.out.println("Fail: Allow to input the Profile Name as All Profile");
					
					return true;
			   }
			}
			catch(Exception e)
			{
				System.out.println("Pass: Catch Stmt Allow to input the Profile Name as All Profile");
				excelReader.setCellData(xlfile, "Sheet4", 64, 9, resFail);
				return true;
			}
		}
	 
	 
	 public boolean checkMenuOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		
		if ( createProfileHomeExpandBtn.isDisplayed() && createProfileFininicalExpandBtn.isDisplayed() && createProfileInventoryExpandBtn.isDisplayed()
				 && createProfileFixedAssestsExpandBtn.isDisplayed() && createProfilePointOfSaleExpandBtn.isDisplayed() && createProfileQualityExpandBtn.isDisplayed()
				 && createProfileSettingExpandBtn.isDisplayed()) 
		{
			System.out.println("  Pass:  Displayed All the Menu Options in Create Profile Screen");
			excelReader.setCellData(xlfile, "Sheet4", 65, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("  Fail:  Displayed All the Menu Options in Create Profile Screen");
			
			excelReader.setCellData(xlfile, "Sheet4", 65, 9, resFail);
			return false;
		}
			
	}
	 
	 
	 //Home Menu Options using Select All 

	@FindBy(xpath="//a[@id='2']//i[@class='icon icon-expand']")
	private static WebElement homeCompanyExpandBtn;
	
	@FindBy(xpath="//a[@id='6']//i[@class='icon icon-expand']")
	private static WebElement homeSecurityExapndBtn ;
	
	@FindBy(xpath="//a[@id='1000']//i[@class='icon icon-expand']")
	private static WebElement homeMastersExpandBtn;
	
	@FindBy(xpath="//a[@id='25']//i[@class='icon icon-expand']")
	private static WebElement homeDataManagementExpandBtn;
	
	@FindBy(xpath="//a[@id='20']//i[@class='icon icon-expand']")
	private static WebElement homeUtilitesExpandBtn;
		
	
	
	public boolean checkClickOnHomeMenus() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();
		
		Thread.sleep(2000);
		
		createProfileSelectAllIcon.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeCompanyExpandBtn));
		
		if (homeCompanyExpandBtn.isDisplayed() && homeSecurityExapndBtn.isDisplayed() && homeMastersExpandBtn.isDisplayed()
				&& homeDataManagementExpandBtn.isDisplayed() && homeUtilitesExpandBtn.isDisplayed()) 
		{
			System.out.println("Pass: Dispalyed Home Menu And Sub Menu options In Create Profile Screen ");
			excelReader.setCellData(xlfile, "Sheet4", 66, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Dispalyed Home Menu And Sub Menu options In Create Profile Screen ");
			excelReader.setCellData(xlfile, "Sheet4", 66, 9, resFail);
			return false;
		}
		
	}
	
	
	
	
	
	//Financial Menu
	
	
	@FindBy(xpath="//a[@id='61']//i[@class='icon icon-expand']")
	private static WebElement transactionsExpandBtn ;
	
	@FindBy(xpath="//a[@id='62']//i[@class='icon icon-expand']")
	private static WebElement creditManagementExpandBtn;
	
	
	@FindBy(xpath="//a[@id='81']//i[@class='icon icon-expand']")
	private static WebElement finincalsReportsExpandBtn;
	
	@FindBy(xpath="//a[@id='530']//i[@class='icon icon-expand']")
	private static WebElement finalAccountsExpandBtn;
	
	@FindBy(xpath="//a[@id='558']//i[@class='icon icon-expand']")
	private static WebElement receivableandPayableAnalysisExpandBtn;
	
	@FindBy(xpath="//a[@id='3301']//i[@class='icon icon-expand']")
	private static WebElement budgetExpandBtn;
	
	
	@FindBy(xpath="//a[@id='3311']//i[@class='icon icon-expand']")
	private static WebElement onlineExpandBtn;
	
	
	
	
	public boolean checkClickOnFinancialMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFininicalExpandBtn));
		createProfileFininicalExpandBtn.click();
		
		Thread.sleep(2000);
		
		createProfileSelectAllIcon.click();
	
		Thread.sleep(2000);
		
	
		
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsExpandBtn));
		if (transactionsExpandBtn.isDisplayed() && creditManagementExpandBtn.isDisplayed() && finincalsReportsExpandBtn.isDisplayed()
			&& finalAccountsExpandBtn.isDisplayed() && receivableandPayableAnalysisExpandBtn.isDisplayed()&& budgetExpandBtn.isDisplayed()
			&& onlineExpandBtn.isDisplayed()) 
		{
			System.out.println("  Pass: Dispalyed Financials Menu And Sub Menu options In Create Profile Screen ");
			excelReader.setCellData(xlfile, "Sheet4", 67, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println("  Fail: Dispalyed Financials Menu And Sub Menu options In Create Profile Screen ");
			excelReader.setCellData(xlfile, "Sheet4", 67, 9, resFail);
			return false;
		}
		
	}
	
	//Financial Menu Options by Using Select All
	

	@FindBy(xpath="//a[@id='2001']//i[@class='icon icon-expand']")
	private static WebElement cashAndBankExpansionBtn;
	
	@FindBy(xpath="//li[@class='treeview']//a[@id='2002']//span[contains(text(),'Receipts')]")
	private static WebElement CashAndBAnkrecepitOption;
		
	@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
	private static WebElement recepitAlwayssuspendonsavingChkBox;
		
	@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
	private static WebElement recepitHideMenuChkBox;
	

	@FindBy(xpath="//a[@id='137']//i[@class='icon icon-expand']")
	private static WebElement inventorytransactionExpandBtn;
	
	@FindBy(xpath="//a[@id='550']//i[@class='icon icon-expand']")
	private static WebElement inventoryOrderMangementExpandBtn;
	
	@FindBy(xpath="//a[@id='200']//i[@class='icon icon-expand']")
	private static WebElement inventoryreportsExpandBtn;

	
	
	
	public boolean checkClickOnInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();
		
		
		Thread.sleep(2000);
		
		createProfileSelectAllIcon.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		if (inventorytransactionExpandBtn.isDisplayed() && inventoryreportsExpandBtn.isDisplayed() && inventorytransactionExpandBtn.isDisplayed()) 
		{
			System.out.println("  Pass: Dispalyed Financials Menu And Sub Menu options In Create Profile Screen ");
			excelReader.setCellData(xlfile, "Sheet4", 68, 9, resPass);
			return true;
		} else {
			System.out.println("  Fail: Dispalyed Financials Menu And Sub Menu options In Create Profile Screen ");
			excelReader.setCellData(xlfile, "Sheet4", 68, 9, resFail);
			return false;
		}

	}
	
	
@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement purchaseVocherEditchkBox;


@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
private static WebElement purchaseVocherDeleteChkBox;

@FindBy(xpath="//li[@class='treeview']//a[@id='138']//span[contains(text(),'Transactions')]")
private static WebElement fixedAssetsTransactionExpandBtn;


public boolean checkClickOnFixedAssetsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFixedAssestsExpandBtn));
	createProfileFixedAssestsExpandBtn.click();
	
	Thread.sleep(2000);
	
	
	createProfileSelectAllIcon.click();
	
	Thread.sleep(2000);
	
	
	
	if (fixedAssetsTransactionExpandBtn.isDisplayed()) 
	{
		System.out.println(" Pass: CLosed Inventory options And Fixed Aseets Transation is Displayed");
		excelReader.setCellData(xlfile, "Sheet4", 69, 9, resPass);
		return true;
	} else {
		System.out.println(" Fail: CLosed Inventory options And Fixed Aseets Transation is Displayed");
		excelReader.setCellData(xlfile, "Sheet4", 69, 9, resFail);
		return false;
	}
}
	
	


@FindBy(xpath="//li[@class='treeview']//a[@id='50002']//span[contains(text(),'Asset Usage')]")
private static WebElement transAssetUsageOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Add Asset Value')]")
private static WebElement transAddAssetValueOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Reduce Asset Value')]")
private static WebElement transReduceAssetValueoption;


@FindBy(xpath="//li[@class='treeview']//a[@id='50005']//span[contains(text(),'Disposal Of Asset')]")
private static WebElement transDisposalOfAssetOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Post Depreciation Entries')]")
private static WebElement transPostDepreciationEntriesoption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Capitalization of Asset')]")
private static WebElement transCapitalizationofAssetoption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Multiple Asset Usage')]")
private static WebElement transMultipleAssetUsageoption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Add Depreciation Years')]")
private static WebElement transAddDepreciationYearsoption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Transfer Of Asset Request')]")
private static WebElement transTransferOfAssetRequestoption;

@FindBy(xpath="//li[@class='treeview']//a[@id='50004']//span[contains(text(),'Transfer Of Asset')]")
private static WebElement transTransferOfAssetoption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Transfer of asset')]")
private static WebElement reportsTransferofassetoption;



@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Assets Usage')]")
private static WebElement reportsAssetsUsageOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Add Assets value')]")
private static WebElement reportsAddAssetsvalueOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Component Added')]")
private static WebElement reportsComponentAddedOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Reduce asset value')]")
private static WebElement reportsReduceassetvalueOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Component Reduced')]")
private static WebElement reportsComponentReducedOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Disposal of Asset')]")
private static WebElement reportsDisposalofAssetOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Fixed Asset Report')]")
private static WebElement reportsFixedAssetReportOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Depreciation Schedule')]")
private static WebElement reportsDepreciationScheduleOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Disposal Of Asset Request')]")
private static WebElement reportsDisposalOfAssetRequestOption;
              
@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement faAccessChkbox;

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement faAddchkbox;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement faEditChkBox;

@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
private static WebElement faDeleteChkbox;
               
@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement faSaveChkbox;

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement faPOstDepreciationChkbox;

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement faMultipleAssetUsageDeleteChkbox;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement faMultipleusageAssetSaveChkbox;

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement searchChkbox;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement printChkbox;

@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
private static WebElement viewChkbox;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement exportChkbox;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement emailReportChkbox;

@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
private static WebElement editPrintlayoutChkbox;

@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
private static WebElement viewCustomizeLayoutChkbox;

@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
private static WebElement addCustomizeLAyoutChkbox;

@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
private static WebElement BackTrackChkbox;

@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
private static WebElement emailChkbox;

@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
private static WebElement viewGraphChkbox;

@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
private static WebElement filterChkbox;

@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
private static WebElement analyzeChkbox;

@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
private static WebElement crossReferenceChkbox;

@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
private static WebElement AddAnalyzeReportChkbox;







@FindBy(xpath="//a[@id='3001']//i[@class='icon icon-expand']")
private static WebElement productiontransactionOption;

@FindBy(xpath="//a[@id='625']//i[@class='icon icon-expand']")
private static WebElement productionreportsOption;

@FindBy(xpath="//li[@class='treeview']//a[@id='3006']")
private static WebElement productionMRPsettingsOption;





public boolean  checkClickOnProductionMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProductionExpandBtn));
	createProfileProductionExpandBtn.click();
	
	Thread.sleep(2000);
	
	
	createProfileSelectAllIcon.click();
	
	Thread.sleep(2000);
	
	if(productiontransactionOption.isDisplayed() && productionreportsOption.isDisplayed()
			&& productionMRPsettingsOption.isDisplayed())
	{
		System.out.println("Test Pass : Unselect all working in production");
		excelReader.setCellData(xlfile, "Sheet4", 70, 9, resPass);
		return true;
	}
	else
	{
		System.out.println("Test Fail : Unselect all NOT working in production");
		excelReader.setCellData(xlfile, "Sheet4", 70, 9, resFail);
		return false;
	}
}




@FindBy(xpath="//a[@id='8000']//i[@class='icon icon-expand']")
private static WebElement pointOfSaleExpandBtn;

@FindBy(xpath="//a[@id='8004']//i[@class='icon icon-expand']")
private static WebElement POSMainScreenExpandBtn;

@FindBy(xpath="//a[@id='8500']//i[@class='icon icon-expand']")
private static WebElement POSReportsExpandBtn;

@FindBy(xpath="//a[@id='8003']//i[@class='icon icon-expand']")
private static WebElement POSUtilitiesExpandBtn;

@FindBy(xpath="//a[@id='150']//i[@class='icon icon-expand']")
private static WebElement qualityControlExpandBtn;

@FindBy(xpath="//a[@id='151']//i[@class='icon icon-expand']")
private static WebElement qtyCtrTransactionsExpandBtn;

@FindBy(xpath="//a[@id='16']//i[@class='icon icon-expand']")
private static WebElement settingExpandBtn;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Configure Transactions')]")
private static WebElement settingConfigureTransactionsOption;

@FindBy(xpath="//li[@class='treeview']//a[@id='68']//span[contains(text(),'Transaction Authorization')]")
private static WebElement settingTransactionAuthorizationOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Pricebook Authorization')]")
private static WebElement settingPricebookAuthorizationOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Configure Masters')]")
private static WebElement settingConfigureMastersOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Master Authorization')]")
private static WebElement settingMasterAuthorizationOption;

@FindBy(xpath="//span[contains(text(),'Dashboard')]")
private static WebElement settingDashboardOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Credit Limit Authorization')]")
private static WebElement settingCreditLimitAuthorizationOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Design Workflow')]")
private static WebElement settingDesignWorkflowOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Settings Wizard')]")
private static WebElement settingSettingsWizardOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Batch Code Generation')]")
private static WebElement settingBatchCodeGenerationOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Map Credit Limit')]")
private static WebElement settingMapCreditLimitOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'VAT Tax Code')]")
private static WebElement settingVATTaxCodeOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Customer Portal Admin')]")
private static WebElement settingCustomerPortalAdminOption;

@FindBy(xpath="//li[@class='treeview']//a[@id='3308']//span[contains(text(),'Budget Authorization')]")
private static WebElement settingBudgetAuthorizationOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Payment Gateway Integration')]")
private static WebElement settingPaymentGatewayIntegrationOption;




public boolean checkClickONPointOfSaleMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSaleExpandBtn));
	pointOfSaleExpandBtn.click();
	
	Thread.sleep(2000);
	
	createProfileSelectAllIcon.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSMainScreenExpandBtn));
	if (POSMainScreenExpandBtn.isDisplayed() && POSReportsExpandBtn.isDisplayed() && POSUtilitiesExpandBtn.isDisplayed()) 
	{
		System.out.println(" Pass: Displayed All the Sub Menu Options In POint Of Sale");
		excelReader.setCellData(xlfile, "Sheet4", 71, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail: Displayed All the Sub Menu Options In POint Of Sale");
		excelReader.setCellData(xlfile, "Sheet4", 71, 9, resFail);
		return false;
	}
}



public boolean checkClickOnQualityControlMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(qualityControlExpandBtn));
	qualityControlExpandBtn.click();
	
	Thread.sleep(2000);
	
	createProfileSelectAllIcon.click();
	
	Thread.sleep(2000);
	
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(qtyCtrTransactionsExpandBtn));
	if (qtyCtrTransactionsExpandBtn.isDisplayed()) 
	{
		System.out.println(" Pass: Display Sub Menu OPtion in Qulaity Control");
		createProfileSelectAllIcon.click();
		excelReader.setCellData(xlfile, "Sheet4", 72, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println(" Fail: Display Sub Menu OPtion in Qulaity Control");
		excelReader.setCellData(xlfile, "Sheet4", 72, 9, resFail);
		return false;
	}
	
}



public boolean checkClickOnSettingsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingExpandBtn));
	settingExpandBtn.click();
	
	Thread.sleep(2000);
	
	createProfileSelectAllIcon.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingConfigureTransactionsOption));
	if (settingConfigureTransactionsOption.isDisplayed() && settingTransactionAuthorizationOption.isDisplayed() && settingPricebookAuthorizationOption.isDisplayed()
		&& settingConfigureMastersOption.isDisplayed() && settingDashboardOption.isDisplayed() && settingCreditLimitAuthorizationOption.isDisplayed()
		&& settingDesignWorkflowOption.isDisplayed()&& settingSettingsWizardOption.isDisplayed()&& settingBatchCodeGenerationOption.isDisplayed() 
		&& settingMapCreditLimitOption.isDisplayed()&& settingVATTaxCodeOption.isDisplayed() && settingCustomerPortalAdminOption.isDisplayed() 
		&& settingBudgetAuthorizationOption.isDisplayed()&& settingPaymentGatewayIntegrationOption.isDisplayed()) 
	{
		System.out.println(" Pass: Display All Sun Menu Options In Setting Menu");
		excelReader.setCellData(xlfile, "Sheet4", 73, 9, resPass);
		createProfileSelectAllIcon.click();
		return true;
	}
	else
	{
		System.out.println(" Fail: Display All Sun Menu Options In Setting Menu");
		excelReader.setCellData(xlfile, "Sheet4", 73, 9, resFail);
		return false;
	}
	
	
	
}


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Bill of Material')]")
private static WebElement billOfMaterialOption;

@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement productionBill_AddChkBox;



public boolean checkclickOnSave() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 Thread.sleep(2000);
    
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
    createProfileSaveIcon.click();
    
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Profile saved Successfully";
	System.out.println(Actdata);
	
	
   if (Actdata.equalsIgnoreCase(Expdata)) {
		System.out.println("  Pass:  All Profile Is Saved ");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 74, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail: All Profile Is Saved");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 74, 9, resFail);
		return false;
	}
    
    
}


@FindBy(xpath="//span[contains(text(),'Access')]")
private static WebElement faAccessChkboxN;

@FindBy(xpath="//a[@id='136']//i[@class='icon-collepse']")
private static WebElement fixedAssetsMinnimizeOption;

@FindBy(xpath="//a[@id='138']//i[@class='icon-collepse']")
private static WebElement fixedAssetsTransactionMinimizeOption;


public boolean  checkRestrictionOptionsUnderFixedAssetsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(5000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.click();
	createProfileProfileNameDropdown.sendKeys("All Profile");
	
	Thread.sleep(2000);
	
	createProfileProfileNameDropdown.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
	createProfileHomeExpandBtn.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFininicalExpandBtn));
	createProfileFininicalExpandBtn.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	createProfileInventoryExpandBtn.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFixedAssestsExpandBtn));
	createProfileFixedAssestsExpandBtn.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetsTransactionExpandBtn));
	fixedAssetsTransactionExpandBtn.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transAssetUsageOption));
	transAssetUsageOption.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(faAccessChkbox));
	if (faAccessChkbox.isSelected() && faAddchkbox.isSelected() && faEditChkBox.isSelected() && faDeleteChkbox.isSelected()
			&& faSaveChkbox.isSelected()) 
	{
		System.out.println("Pass : Asset Usage Options Are Checked");
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transAddAssetValueOption));
		transAddAssetValueOption.click();
		
		if (faAccessChkbox.isSelected() && faAddchkbox.isSelected() && faEditChkBox.isSelected() && faDeleteChkbox.isSelected()
				&& faSaveChkbox.isSelected()) 
		{
			System.out.println("Pass : Add Asset Value Options Are Checked");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transReduceAssetValueoption));
			transReduceAssetValueoption.click();
			
			if (faAccessChkbox.isSelected() && faAddchkbox.isSelected() && faEditChkBox.isSelected() && faDeleteChkbox.isSelected()
					&& faSaveChkbox.isSelected())
			{

				System.out.println("Pass : Reduce Asset Value Options Are Checked");
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transDisposalOfAssetOption));
				transDisposalOfAssetOption.click();
				
				if (faAccessChkbox.isSelected() && faAddchkbox.isSelected() && faEditChkBox.isSelected() && faDeleteChkbox.isSelected()
						&& faSaveChkbox.isSelected())
				{
					System.out.println("Pass : Disposal oF Asset Options Are Checked");
					
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transPostDepreciationEntriesoption));
					transPostDepreciationEntriesoption.click();
					
					
					if (faAccessChkbox.isSelected() && faPOstDepreciationChkbox.isSelected() ) 
					{
						System.out.println("Pass : Post Depreciation Options Are Checked");
						
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transCapitalizationofAssetoption));
						transCapitalizationofAssetoption.click();
						
						if (faAccessChkbox.isSelected() && faAddchkbox.isSelected() && faEditChkBox.isSelected() && faDeleteChkbox.isSelected()
								&& faSaveChkbox.isSelected()) 
						{
							System.out.println("Pass : CapitalizationofAsset Options Are Checked");
							
							Thread.sleep(3000);
							
							getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transMultipleAssetUsageoption));
							transMultipleAssetUsageoption.click();
							
							Thread.sleep(3000);
							
							getWebDriverWait().until(ExpectedConditions.elementToBeClickable(faAccessChkbox));
							
							if (faAccessChkbox.isSelected() && faMultipleAssetUsageDeleteChkbox.isSelected() && faMultipleusageAssetSaveChkbox.isSelected())
							{
							
								Thread.sleep(2000);
								
								getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetsTransactionMinimizeOption));
								fixedAssetsTransactionMinimizeOption.click();
								
								Thread.sleep(2000);
								
								getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetsMinnimizeOption));
								fixedAssetsMinnimizeOption.click();
								
							
								
								System.out.println(" Pass : Multiple Asset Usage option Are Checked  ");
								excelReader.setCellData(xlfile, "Sheet4", 75, 9, resPass);
								return true;
							}
							else 
							{
								
								
								Thread.sleep(2000);
								
								getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetsTransactionExpandBtn));
								fixedAssetsTransactionExpandBtn.click();
								
								Thread.sleep(2000);
								
								getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFixedAssestsExpandBtn));
								createProfileFixedAssestsExpandBtn.click();
								
								System.out.println(" Fail : Multiple Asset Usage option Are Checked  ");
								excelReader.setCellData(xlfile, "Sheet4", 75, 9, resFail);
								return false;
							}
						} 
						else 
						{
							
							
							System.out.println("Fail : CapitalizationofAsset Options Are Checked");
							excelReader.setCellData(xlfile, "Sheet4", 75, 9, resFail);
							return false;
						}
						
					} 
					else 
					{
						System.out.println("Fail : Post Depreciation Options Are Checked");
						excelReader.setCellData(xlfile, "Sheet4", 75, 9, resFail);
						return false;
					}
				} 
				else 
				{
					System.out.println("Fail : Disposal oF Asset Options Are Checked");
					excelReader.setCellData(xlfile, "Sheet4", 75, 9, resFail);
					return false;
				}
			} 
			else 
			{
				System.out.println("Fail : Reduce Asset Value Options Are Checked");
				excelReader.setCellData(xlfile, "Sheet4", 75, 9, resFail);
				return false;
			}			
		} else {
			System.out.println("Fail : Add Asset Value Options Are Checked");
			excelReader.setCellData(xlfile, "Sheet4", 75, 9, resFail);
			return false;
		}
	} 
	else 
	{
		System.out.println("Fail : Asset Usage Options Are Checked");
		excelReader.setCellData(xlfile, "Sheet4", 75, 9, resFail);
		return false;
	}
}




@FindBy(xpath="//li[@class='treeview']//a[@id='139']//span[contains(text(),'Purchases')]")
private static WebElement inventoryTransactionPurchaseExpandBtn;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Request for Quote')]")
private static WebElement RequestforQuoteOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Purchases Quotations')]")
private static WebElement purchasesQuotationsOption;

@FindBy(xpath="//li[@class='treeview']//a[@id='2012']//span[contains(text(),'Purchases Orders')]")
private static WebElement purchaseOrderOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Material Receipt Notes')]")
private static WebElement materialReceiptNotesOPtion;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Home')]")
private static WebElement homemenu;


@FindBy(xpath="//i[@class='icon-expand']")
private static WebElement homemnu;



@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Financials')]")
private static WebElement finanaceMenu;



@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Inventory')]")
private static WebElement inventoryMenu;



@FindBy(xpath="//li[@class='treeview']//a[@id='137']//span[contains(text(),'Transactions')]")
private static WebElement inventoryTransactionsMenu;



@FindBy(xpath="//li[@class='treeview']//a[@id='139']//span[contains(text(),'Purchases')]")
private static WebElement inventoryTransactionsPurchasesMenu;


public boolean checkPurchaseProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
    Thread.sleep(2000);	
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	Thread.sleep(2000);
	createProfileProfileNameDropdown.clear();
	Thread.sleep(2000);
	
	createProfileProfileNameDropdown.sendKeys(Keys.END);
	Thread.sleep(2000);
	
	createProfileProfileNameDropdown.sendKeys(Keys.SHIFT,Keys.HOME);
	Thread.sleep(2000);
	
	createProfileProfileNameDropdown.sendKeys("Purchase Profile");
	Thread.sleep(2000);
	createProfileProfileNameDropdown.sendKeys(Keys.TAB);
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homemnu));
	homemnu.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanaceMenu));
	finanaceMenu.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
	inventoryMenu.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
	inventoryTransactionsMenu.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
	inventoryTransactionsPurchasesMenu.click();
	
	Thread.sleep(2000);
	
	if (RequestforQuoteOption.isDisplayed() && purchasesQuotationsOption.isDisplayed() && purchaseOrderOption.isDisplayed()
			&& materialReceiptNotesOPtion.isDisplayed()) 
	{
		System.out.println(" Pass: Displayed the Purchase Profile in Inventory ");
		excelReader.setCellData(xlfile, "Sheet4", 76, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println(" Fail: Not  Displayed the Purchase Profile in Inventory ");
		excelReader.setCellData(xlfile, "Sheet4", 76, 9, resFail);
		return false;
	}
	
	
}




@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Issues to Production')]")
private static WebElement issuetoProductionOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Job Order')]")
private static WebElement jobOrderOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Receipts from Production')]")
private static WebElement receiptsfromProductionOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Planned Independent Requirement')]")
private static WebElement plannedIndependentRequirementOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Production Process')]")
private static WebElement productionProcessOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Pending production order')]")
private static WebElement pendingproductionorderOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Job Work Issues')]")
private static WebElement jobWorkIssuesOption;


@FindBy(xpath="//li[@class='treeview']//a[@id='3002']//span[contains(text(),'Production Orders')]")
private static WebElement productionOrdersOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Job Work Receipts')]")
private static WebElement jobWorkReceiptsOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Returns from Shop Floor')]")
private static WebElement returnsfromShopFloorOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Refresh Rates')]")
private static WebElement refreshRatesOption;

@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
private static WebElement ProductionTransaactionIssueToProductionHideChkbox;

@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
private static WebElement ProductionTransaactionIssueToProductionAlwaysSuspenedOnSavingChkbox;

@FindBy(xpath="//li[31]//div[1]//label[1]//input[1]")
private static WebElement ProductionTransaactionJobOrderHideChkbox;

@FindBy(xpath="//li[17]//div[1]//label[1]//input[1]")
private static WebElement ProductionTransaactionJobToOrderAlwaysSuspenedOnSavingChkbox;

@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement holdAndUnHoldacessChkBox;

@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
private static WebElement hideChkBox;

@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
private static WebElement alwaysSuspendedSavingChkBox;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Sales Quotations')]")
private static WebElement salesQuotationsOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Delivery Notes')]")
private static WebElement DeliveryNotesOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'POS Sales')]")
private static WebElement posSalesOption;

@FindBy(xpath="//li[@class='treeview']//a[@id='2045']//span[contains(text(),'Production Orders')]")
private static WebElement productionOrdeOption;

@FindBy(xpath="//li[@class='treeview']//a[@id='2017']//span[contains(text(),'Sales Orders')]")
private static WebElement salesOrdersOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Auto Sales Order')]")
private static WebElement autoSalesOrdersOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Shortages in Stock')]")
private static WebElement shortageinStocksOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Excesses in Stocks')]")
private static WebElement excessinStocksOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Transfers')]")
private static WebElement stocksTransfersOption;

@FindBy(xpath="//li[@class='treeview']//a[@id='2037']//span[contains(text(),'Opening Stocks')]")
private static WebElement openingStocksOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Material Requisition')]")
private static WebElement materialRequisitionOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock adjustment')]")
private static WebElement stockAdjustmentOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Opening Stocks New')]")
private static WebElement openingStocksNewOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Transfer New')]")
private static WebElement stocksTransferNewOption;


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Hold/Unhold Stock')]")
private static WebElement holdandUnholdStockTransfer;


@FindBy(xpath="//a[@id='140']//i[@class='icon icon-expand']")
private static WebElement inventoryTransactionSalesExpansionBtn;

@FindBy(xpath="//a[@id='2033']//i[@class='icon-expand']")
private static WebElement inventoryTransactionStocksExpansionBtn;



//Request For Quote Hide option is enabled
//Purchase Quotation Always Suspend on saving option is enabled
//Purchase Order Select All
//Material Receipt Notes Select All

public boolean checkSavePurchaseProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(RequestforQuoteOption));
	RequestforQuoteOption.click();
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(hideChkBox));
	hideChkBox.click();
	Thread.sleep(2000);
	/*getWebDriverWait().until(ExpectedConditions.elementToBeClickable(alwaysSuspendedSavingChkBox));
	alwaysSuspendedSavingChkBox.click();
	Thread.sleep(2000);*/
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesQuotationsOption));
	purchasesQuotationsOption.click();
	Thread.sleep(2000);
    /*	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(hideChkBox));
	hideChkBox.click();
	Thread.sleep(2000);*/
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(alwaysSuspendedSavingChkBox));
	alwaysSuspendedSavingChkBox.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseOrderOption));
	purchaseOrderOption.click();
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	createProfileSelectAllIcon.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialReceiptNotesOPtion));
	materialReceiptNotesOPtion.click();
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	createProfileSelectAllIcon.click();
	
	
	
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	createProfileSaveIcon.click();
	   

	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Profile saved Successfully";
	System.out.println(Actdata);


	if (Actdata.equalsIgnoreCase(Expdata)) {
		System.out.println("  Pass:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 77, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 77, 9, resFail);
		return false;
	}
}





@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement accessChkBox;

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement addChkBox;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement editChkBox;

@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
private static WebElement deleteChkBox;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement printChkBox;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement reprintChkBox;

@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
private static WebElement printBarCodeChkBox;

@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
private static WebElement printUnAuthoDocumentsChkBox;

@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
private static WebElement exportChkBox;

@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
private static WebElement editDocEnteredByOthersChkBox;

@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
private static WebElement editDocThatareCheckedChkBox;

@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
private static WebElement editReconciledDocsChkBox;

@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
private static WebElement editDocAuthByHigherUpsChkBox;

@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
private static WebElement enterDocThatExceedLimitChkBox;

@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
private static WebElement enterDocThatMakeCashORBankBalanceNegativeChkBox;

@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
private static WebElement editDocsThatAreRePrintedChkBox;

@FindBy(xpath="//li[17]//div[1]//label[1]//input[1]")
private static WebElement accessThroughAPIChkBox;

@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
private static WebElement alwaysSuspendOnSavingChkBox;

@FindBy(xpath="//li[19]//div[1]//label[1]//input[1]")
private static WebElement changePrintLayoutChkBox;

@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
private static WebElement authorizeChkBox;

@FindBy(xpath="//li[21]//div[1]//label[1]//input[1]")
private static WebElement rejectChkBox;

@FindBy(xpath="//li[22]//div[1]//label[1]//input[1]")
private static WebElement showhomePageChkBox;

@FindBy(xpath="//li[23]//div[1]//label[1]//input[1]")
private static WebElement stopChkBox;

@FindBy(xpath="//li[24]//div[1]//label[1]//input[1]")
private static WebElement modifySettingsChkBox;

@FindBy(xpath="//li[25]//div[1]//label[1]//input[1]")
private static WebElement viewDocEnteredByOthersChkBox;

@FindBy(xpath="//li[26]//div[1]//label[1]//input[1]")
private static WebElement closeLinksChkBox;

@FindBy(xpath="//li[27]//div[1]//label[1]//input[1]")
private static WebElement saveRevisionChkBox;

@FindBy(xpath="//li[28]//div[1]//label[1]//input[1]")
private static WebElement showPostingDetailsChkBox;

@FindBy(xpath="//li[29]//div[1]//label[1]//input[1]")
private static WebElement suspendChkBox;

@FindBy(xpath="//li[30]//div[1]//label[1]//input[1]")
private static WebElement editExportedDocsChkBox;

@FindBy(xpath="//li[31]//div[1]//label[1]//input[1]")
private static WebElement editImportedDocsChkBox;

@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
private static WebElement hideMenuChkBox;

@FindBy(xpath="//li[33]//div[1]//label[1]//input[1]")
private static WebElement amendChkBox;

@FindBy(xpath="//li[34]//div[1]//label[1]//input[1]")
private static WebElement customizeLinkChkBox;

@FindBy(xpath="//li[35]//div[1]//label[1]//input[1]")
private static WebElement filterHomePageChkBox;

@FindBy(xpath="//li[36]//div[1]//label[1]//input[1]")
private static WebElement addToStockChkBox;

@FindBy(xpath="//li[37]//div[1]//label[1]//input[1]")
private static WebElement reverseEntryChkBox;

@FindBy(xpath="//li[38]//div[1]//label[1]//input[1]")
private static WebElement customizeInfoPanelChkBox;

@FindBy(xpath="//li[39]//div[1]//label[1]//input[1]")
private static WebElement raiseChequeReturnChkBox;


public boolean checkRestrictionsInSalesOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalesOrderProfile");
	
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	    createProfileInventoryExpandBtn.click();
		
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
	
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
	    Thread.sleep(2000);
	     
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accessChkBox));
	     if(accessChkBox.isDisplayed() && addChkBox.isDisplayed() && editChkBox.isDisplayed() && deleteChkBox.isDisplayed()
					&& printChkBox.isDisplayed() && reprintChkBox.isDisplayed() && printBarCodeChkBox.isDisplayed()
					&& printUnAuthoDocumentsChkBox.isDisplayed() && exportChkBox.isDisplayed() && editDocEnteredByOthersChkBox.isDisplayed()
					&& editDocThatareCheckedChkBox.isDisplayed() && editReconciledDocsChkBox.isDisplayed() && editDocAuthByHigherUpsChkBox.isDisplayed()
					&& enterDocThatExceedLimitChkBox.isDisplayed() && enterDocThatMakeCashORBankBalanceNegativeChkBox.isDisplayed()
					&& editDocsThatAreRePrintedChkBox.isDisplayed() && accessThroughAPIChkBox.isDisplayed() && alwaysSuspendOnSavingChkBox.isDisplayed()
					&& changePrintLayoutChkBox.isDisplayed() && authorizeChkBox.isDisplayed() && rejectChkBox.isDisplayed() 
					&& showhomePageChkBox.isDisplayed() && stopChkBox.isDisplayed() && modifySettingsChkBox.isDisplayed()
					&& viewDocEnteredByOthersChkBox.isDisplayed() && closeLinksChkBox.isDisplayed() && saveRevisionChkBox.isDisplayed()
					&& showPostingDetailsChkBox.isDisplayed() && suspendChkBox.isDisplayed() && editExportedDocsChkBox.isDisplayed()
					&& editImportedDocsChkBox.isDisplayed() && hideMenuChkBox.isDisplayed() && amendChkBox.isDisplayed()
					&& customizeLinkChkBox.isDisplayed() && filterHomePageChkBox.isDisplayed() && addToStockChkBox.isDisplayed()
					&& reverseEntryChkBox.isDisplayed() && customizeInfoPanelChkBox.isDisplayed() && raiseChequeReturnChkBox.isDisplayed()) 
		     {
				System.out.println(" Pass: Displyed All the Elements in the Master Account Option");
				excelReader.setCellData(xlfile, "Sheet4", 78, 9, resPass);
				return true;
		} 
	     else 
		{
			System.out.println(" Fail: Displyed All the Elements in the Master Account Option");
			excelReader.setCellData(xlfile, "Sheet4", 78, 9, resFail);
			return false;
		}
	}
	
public boolean checkSaveSalesOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	createProfileSelectAllIcon.click();
	
	Thread.sleep(2000);
	

	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	createProfileSaveIcon.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Profile saved Successfully";
	System.out.println(Actdata);
	
	
	if (Actdata.equalsIgnoreCase(Expdata)) {
		System.out.println("  Pass:  Allow to select Add option  in Sales Order ");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 79, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:  Allow to select Add option  in Sales Order");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 79, 9, resFail);
		return false;
	}
}
 





public boolean checkAcessRestrictionOptionInSalesOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SaleAccessProfile");
	
	
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
   createProfileInventoryExpandBtn.click();
	
   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
	inventorytransactionExpandBtn.click();
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
	inventoryTransactionSalesExpansionBtn.click();
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
	salesOrdersOption.click();
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(faAccessChkbox));
	faAccessChkbox.click();
	if (faAccessChkbox.isSelected()) 
	{
	System.out.println(" Pass: Access ChkBox IS Checked ");	
	excelReader.setCellData(xlfile, "Sheet4", 80, 9, resPass);
	return true;
	} 
	else 
	{
		System.out.println(" Fail: Access ChkBox IS Checked ");	
		excelReader.setCellData(xlfile, "Sheet4", 80, 9, resFail);
		return false;
	}
	
}

public boolean checkSaveAccessRestrictionInSalesOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
    createProfileSaveIcon.click();
	 
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Profile saved Successfully";
	System.out.println(Actdata);
	
	
   if (Actdata.equalsIgnoreCase(Expdata)) {
		System.out.println("  Pass:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 81, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 81, 9, resFail);
		return false;
	}
	
}	


public boolean checkAddRestrictionOptioninSaleAddProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SaleAddProfile");
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addChkBox));
		addChkBox.click();
		
		Thread.sleep(2000);
		if (addChkBox.isSelected())
		{
			
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		   createProfileSaveIcon.click();

		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		   if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Add option   in Screen in Sales Order");
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 82, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Add option Sales Order");
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 82, 9, resFail);
				return false;
			}

		   
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Add option");	
			 excelReader.setCellData(xlfile, "Sheet4", 82, 9, resFail);
			 return false;
		}
		
		
}


public boolean checkEditRestrictionOptioninSaleOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SaleEditProfile");
	
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(editChkBox));
	    editChkBox.click();
		
	    Thread.sleep(2000);
	    
		if (editChkBox.isSelected())
		{
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Edit option in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 83, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Edit option Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 83, 9, resFail);
				return false;
			}
		
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Edit option");	
			 excelReader.setCellData(xlfile, "Sheet4", 83, 9, resFail);
			 return false;
		}
		
		
}







public boolean checkDeleteRestrictionOptioninSaleOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SaleDeleteProfile");
	
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteChkBox));
		deleteChkBox.click();
		
	    Thread.sleep(2000);
	    
		if (deleteChkBox.isSelected())
		{
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Delete option in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 84, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Delete option Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 84, 9, resFail);
				return false;
			}
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Edit option");	
				excelReader.setCellData(xlfile, "Sheet4", 84, 9, resFail);
			 return false;
		}
		
		
}






public boolean checkSelecttheSalesOrdervoucherfromthemenuandclickonPrintChkBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalePrintProfile");
	
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(printChkBox));
		printChkBox.click();
		
	    Thread.sleep(2000);
	    
		if (printChkBox.isSelected())
		{
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Print option in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 85, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Print option Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 85, 9, resFail);
				return false;
			}
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Edit option");	
			 excelReader.setCellData(xlfile, "Sheet4", 85, 9, resFail);
			 return false;
		}
		
		
}



public boolean checkRePrintRestrictionOptioninSaleOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SaleRePrintProfile");
	
	
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(reprintChkBox));
		reprintChkBox.click();
		
	    Thread.sleep(2000);
	    
		if (reprintChkBox.isSelected())
		{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Re-Print option in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 86, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Re-Print option Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 86, 9, resFail);
				return false;
			}
			
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Edit option");	
				excelReader.setCellData(xlfile, "Sheet4", 86, 9, resFail);
			 return false;
		}
		
		
}


public boolean checkUnAuthorizeRestrictionOptioninSaleOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalesPrintUnAuthorizeProfile");
	

	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(printUnAuthoDocumentsChkBox));
		printUnAuthoDocumentsChkBox.click();
		
	    Thread.sleep(2000);
	    
		if (printUnAuthoDocumentsChkBox.isSelected())
		{
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Re-Print option in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 87, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Re-Print option Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 87, 9, resFail);
				return false;
			}
			
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Edit option");	
				excelReader.setCellData(xlfile, "Sheet4", 87, 9, resFail);
			 return false;
		}
		
		
}











public boolean checkEditDocumentsByOtherEditDocumentsAreCheckedEditReconciledDocumentsEditDocumentsAuthorizationByHigherUps() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalesEditMiscProfile");
	

	
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(editDocEnteredByOthersChkBox));
		editDocEnteredByOthersChkBox.click();
		
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(editDocThatareCheckedChkBox));
		editDocThatareCheckedChkBox.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(editReconciledDocsChkBox));
		editReconciledDocsChkBox.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(editDocAuthByHigherUpsChkBox));
		editDocAuthByHigherUpsChkBox.click();
		
		
	    Thread.sleep(2000);
	    
		if (editDocEnteredByOthersChkBox.isSelected() && editDocThatareCheckedChkBox.isSelected() && editReconciledDocsChkBox.isSelected()
				&& editDocAuthByHigherUpsChkBox.isSelected())
		{
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Edit Document options in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 88, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Edit Documents options Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 88, 9, resFail);
				return false;
			}
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the  Edit Document options");	
				excelReader.setCellData(xlfile, "Sheet4", 88, 9, resFail);
			 return false;
		}
		
		
}





public boolean checkAccessThroughAPI() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalesAccessAPIProfile");
	
	
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accessThroughAPIChkBox));
		accessThroughAPIChkBox.click();
		
		
		
		
	    Thread.sleep(2000);
	    
		if (accessThroughAPIChkBox.isSelected() )
		{
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Access Through API ChkBox options in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 89, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Access Through API ChkBox options Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 89, 9, resFail);
				return false;
			}
			
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the  Edit Document options");	
				excelReader.setCellData(xlfile, "Sheet4", 89, 9, resFail);
			 return false;
		}
		
		
}



public boolean checkAlwaysSuspendingOnSavingoption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalesAlwaysSuspendingProfile");
	
	
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(alwaysSuspendOnSavingChkBox));
		alwaysSuspendOnSavingChkBox.click();
		
		
	    Thread.sleep(2000);
	    
		if (alwaysSuspendOnSavingChkBox.isSelected() )
		{
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Always Suspend On Saving in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 90, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   Allow to select Always Suspend On Saving in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 90, 9, resFail);
				return false;
			}
			
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the  Edit Document options");	
				excelReader.setCellData(xlfile, "Sheet4", 90, 9, resFail);
			 return false;
		}
		
		
}


public boolean checkSalesChangePrintLayoutProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalesChangePrintLayoutProfile");
	
	
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(changePrintLayoutChkBox));
		changePrintLayoutChkBox.click();
		
		
	    Thread.sleep(2000);
	    
		if (changePrintLayoutChkBox.isSelected() )
		{
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Change Print Layout ChkBox in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 91, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Change Print Layout ChkBox in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 91, 9, resFail);
				return false;
			}
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the  Edit Document options");	
				excelReader.setCellData(xlfile, "Sheet4", 91, 9, resFail);
			 return false;
		}
		
		
}


public boolean checkAuthorizeAndRejectProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalesAuthorizeProfile");
	

	
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeChkBox));
		authorizeChkBox.click();
		
	
	    Thread.sleep(2000);
	    
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rejectChkBox));
		rejectChkBox.click();
		
		Thread.sleep(2000);
	    
		if (authorizeChkBox.isSelected() && rejectChkBox.isSelected() )
		{
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select Authorize ChkBox in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 92, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Authorize ChkBox in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 92, 9, resFail);
				return false;
			}
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the  Edit Document options");	
				excelReader.setCellData(xlfile, "Sheet4", 92, 9, resFail);
			 return false;
		}
		
		
}



public boolean checkHomePageOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalesHomePageProfile");
	

	
	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(showhomePageChkBox));
		showhomePageChkBox.click();
		

	    Thread.sleep(2000);
	    
		if (showhomePageChkBox.isSelected() )
		{

			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select showhomePageChkBox in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 93, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select showhomePageChkBox in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 93, 9, resFail);
				return false;
			}
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the  Edit Document options");	
				excelReader.setCellData(xlfile, "Sheet4", 93, 9, resFail);
			 return false;
		}
		
		
}


public boolean checkStopPageOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalesStopProfile");
	

	
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stopChkBox));
		stopChkBox.click();
		

	    Thread.sleep(2000);
	    
		if (stopChkBox.isSelected() )
		{
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select stopChkBox in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 94, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select stopChkBox in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 94, 9, resFail);
				return false;
			}
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the  Edit Document options");
			 excelReader.setCellData(xlfile, "Sheet4", 94, 9, resFail);
			 return false;
		}
		
		
}




public boolean checkViewDocumentsEnterByOtherCloseLinksSaveRevisionSuspendAndModifySettingsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	 
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
	homeSecurityMenu.click();
	 
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
	createProfileMenu.click();
	
	Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SalesViewDocumentsEnterByOther");

	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	   createProfileInventoryExpandBtn.click();
		
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewDocEnteredByOthersChkBox));
		viewDocEnteredByOthersChkBox.click();
		

	    Thread.sleep(2000);
	    
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinksChkBox));
		closeLinksChkBox.click();
		

	    Thread.sleep(2000);
	    
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveRevisionChkBox));
		saveRevisionChkBox.click();
	

	    Thread.sleep(2000);
	    
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendChkBox));
		suspendChkBox.click();


	    Thread.sleep(2000);
	    
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(modifySettingsChkBox));
		modifySettingsChkBox.click();
		
		Thread.sleep(2000);
	    
		if (viewDocEnteredByOthersChkBox.isSelected() && closeLinksChkBox.isSelected() && saveRevisionChkBox.isSelected() && suspendChkBox.isSelected() && modifySettingsChkBox.isSelected()  )
		{
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 95, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 95, 9, resFail);
				return false;
			}
		}
		else 
		{
			 System.out.println(" Fail: Allow to Select the  Edit Document options");	
				excelReader.setCellData(xlfile, "Sheet4", 95, 9, resFail);
			 return false;
		}
		
		
}








@FindBy(xpath="//li[@class='treeview']//a[@id='500']//span[contains(text(),'Ledger')]")
private static WebElement ledgerOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Ledger detail')]")
private static WebElement ledgerDetailOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Sub Ledger')]")
private static WebElement subLedgerDetailOption;

@FindBy(xpath="//a[@id='82']//i[@class='icon icon-expand']")
private static WebElement cashAndBankBooksExpandBtn;

@FindBy(xpath="//a[@id='502']//i[@class='icon icon-expand']")
private static WebElement salesdReportsExpandBtn;

@FindBy(xpath="//a[@id='506']//i[@class='icon icon-expand']")
private static WebElement purchaseReportsExpandBtn;

@FindBy(xpath="//a[@id='514']//i[@class='icon icon-expand']")
private static WebElement registersExpandBtn;

@FindBy(xpath="//a[@id='523']//i[@class='icon icon-expand']")
private static WebElement salesAndPurchaseExpandBtn;

@FindBy(xpath="//a[@id='568']//i[@class='icon icon-expand']")
private static WebElement miscellaneousAnalysisExpandBtn;

@FindBy(xpath="//a[@id='536']//i[@class='icon icon-expand']")
private static WebElement masterInformationExpandBtn;

@FindBy(xpath="//a[@id='520']//i[@class='icon icon-expand']")
private static WebElement auidtTrailExpandBtn;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Account Query')]")
private static WebElement accountQueryOption;

@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Transaction authorization report')]")
private static WebElement transactionAuthorizationReportOption;






public boolean checkFAReportsAllOptionsProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	 homeMenu.click();
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
	 homeSecurityMenu.click();
	 
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
	createProfileMenu.click();
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("FAReportsAllOptions");
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFininicalExpandBtn));
	createProfileFininicalExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(finincalsReportsExpandBtn));
	finincalsReportsExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledgerOption));
	
	if (ledgerOption.isDisplayed() && ledgerDetailOption.isDisplayed() && subLedgerDetailOption.isDisplayed()
			&& cashAndBankBooksExpandBtn.isDisplayed() && salesdReportsExpandBtn.isDisplayed() && purchaseReportsExpandBtn.isDisplayed()
			&& registersExpandBtn.isDisplayed() && salesAndPurchaseExpandBtn.isDisplayed() && miscellaneousAnalysisExpandBtn.isDisplayed()
			&& masterInformationExpandBtn.isDisplayed() && auidtTrailExpandBtn.isDisplayed() && accountQueryOption.isDisplayed()
			&& transactionAuthorizationReportOption.isDisplayed()) 
	{
		System.out.println(" Pass:  Reports Sub Menu Options Are Displayed ");
		excelReader.setCellData(xlfile, "Sheet4", 96, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println(" Fail:  Reports Sub Menu Options Are Displayed ");
		excelReader.setCellData(xlfile, "Sheet4", 96, 9, resFail);
		return false;
	}
	
	
}


public boolean checkReportsSelectAllOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	createProfileSelectAllIcon.click();

   Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
    createProfileSaveIcon.click();
       
	 
   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Profile saved Successfully";
	System.out.println(Actdata);
	
	
  if (Actdata.equalsIgnoreCase(Expdata)) {
		System.out.println("  Pass:  FAReportsAllOptions profile saves Successfully");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 97, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:   FAReportsAllOptions profile saves Successfully");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 97, 9, resFail);
		return false;
	}
}





@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement ledgerAcessChkbox;

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement ledgerSearchChkbox;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement ledgerPrintChkbox;

@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
private static WebElement ledgerViewChkbox;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement ledgerExportChkbox;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement ledgerEmailReportChkbox;

@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
private static WebElement ledgerEditPrintLayoutChkbox;

@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
private static WebElement ledgerViewCustomizedLayoutChkbox;

@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
private static WebElement ledgerAddCustomizedLayoutChkbox;

@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
private static WebElement ledgerBackTrackChkbox;

@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
private static WebElement ledgerEmailChkbox;

@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
private static WebElement ledgerVeiwGraphChkbox;

@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
private static WebElement ledgerFilterChkbox;

@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
private static WebElement ledgerAnalyzeChkbox;

@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
private static WebElement ledgerCrossReferenceChkbox;

@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
private static WebElement ledgerAddAnalyzeReportChkbox;








public boolean checkLedgerProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("LedgerProfile");
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFininicalExpandBtn));
	createProfileFininicalExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(finincalsReportsExpandBtn));
	finincalsReportsExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledgerOption));
	ledgerOption.click();
	
	if (ledgerAcessChkbox.isDisplayed() && ledgerSearchChkbox.isDisplayed() && ledgerPrintChkbox.isDisplayed()
			&& ledgerViewChkbox.isDisplayed() && ledgerExportChkbox.isDisplayed() && ledgerEmailReportChkbox.isDisplayed()
			&& ledgerEditPrintLayoutChkbox.isDisplayed() && ledgerViewCustomizedLayoutChkbox.isDisplayed() && ledgerAddCustomizedLayoutChkbox.isDisplayed()
			&& ledgerBackTrackChkbox.isDisplayed() && ledgerEmailChkbox.isDisplayed() && ledgerVeiwGraphChkbox.isDisplayed()
			&& ledgerFilterChkbox.isDisplayed() && ledgerAnalyzeChkbox.isDisplayed() && ledgerCrossReferenceChkbox.isDisplayed() 
			&& ledgerAddAnalyzeReportChkbox.isDisplayed()) 
	{
		System.out.println(" Pass: Ledger Sun Menu Options Are Displayed ");
		excelReader.setCellData(xlfile, "Sheet4", 98, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println(" Fail: Ledger Sun Menu Options Are Displayed ");
		excelReader.setCellData(xlfile, "Sheet4", 98, 9, resFail);
		return false;
	}
	
	
}




public boolean checkLedgerSelectAllOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	createProfileSelectAllIcon.click();

   Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
    createProfileSaveIcon.click();
       
	 
   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Profile saved Successfully";
	System.out.println(Actdata);
	
	
  if (Actdata.equalsIgnoreCase(Expdata)) {
		System.out.println("  Pass:  LedgerProfile profile saves Successfully");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 99, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:   LedgerProfile profile saves Successfully");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 99, 9, resFail);
		return false;
	}
}




@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerAcessOption;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerEmailReportOption;

@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerEditPrintLayoutOption;

@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerViewCustomizedLayoutOption;

@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerAddCustomizedLayoutOption;

@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerBackTrackOption;

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerSearchOption;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerPrintOption;

@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerViewOption;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerExportOption;

@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerEmailOption;

@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerViewGraphOption;

@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerFilterOption;

@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerAnalyzeOption;

@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerCrossReferenceOption;

@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
private static WebElement stockLedgerAddAnalyzeReportOption;



@FindBy(xpath="//li[@class='active']//a[@id='200']//i[@class='icon-expand']")
private static WebElement addInvReportsExpandBtn;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Ledger')]")
private static WebElement addInvReportsStockLedgerOption;


@FindBy(xpath="//li[@class='active']//span[contains(text(),'Item Query')]")
private static WebElement invReportsItemQuery;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Ledger')]")
private static WebElement invReportsStockLedger;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Opening Stocks Register')]")
private static WebElement invReportsOpeningStocksRegister;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Statement')]")
private static WebElement invReportsStockStatement;

@FindBy(xpath="//li[@class='active']//a[@id='575']//span[contains(text(),'Stock Movement')]")
private static WebElement invReportsStockMovement;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Multi Level Stock Movement')]")
private static WebElement invReportsMultiLevelStockMovement;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Virtual Stock Analysis')]")
private static WebElement invReportsVirtualStockAnalysis;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Valuation')]")
private static WebElement invReportsStockValuation;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock report by Tag')]")
private static WebElement invReportsStockReportByTag;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'ABC Analysis')]")
private static WebElement invReportsABCAnalysis;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Analysis by Batch')]")
private static WebElement invReportsStockAnalysisByBatch;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Analysis by RMA')]")
private static WebElement invReportsStockAnalysisByRMA;

@FindBy(xpath="//li[@class='active']//a[@id='540']//i[@class='icon-expand']")
private static WebElement invReportsBinExpandBtn;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock balance by warehouse')]")
private static WebElement invReportsStockBalanceByWarehouse;

@FindBy(xpath="//li[@class='active']//a[@id='621']//i[@class='icon-expand']")
private static WebElement invReportsStockAgeingAnalysisExpandBtn;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Reorder Report')]")
private static WebElement invReportsReorderReport;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Fast Moving Item')]")
private static WebElement invReportsFastMovingItem;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Slow Moving Item')]")
private static WebElement invReportsSlowMovingItem;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Peak/Low Balances')]")
private static WebElement invReportsPeakOrLowBalances;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Best Selling Item')]")
private static WebElement invReportsBestSellingItem;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Raise Indent Item with Low Stock')]")
private static WebElement invReportsRaiseIndentItemWithLowStock;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock transfer report')]")
private static WebElement invReportsStockTransferReport;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Raise request for quote')]")
private static WebElement invReportsRaiseRequestForQuote;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock reservation report')]")
private static WebElement invReportsStockReservationReport;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Transaction type-wise stock report')]")
private static WebElement invReportsTransactionTypewiseStockReport;

@FindBy(xpath="//li[@class='active']//a[@id='550']//i[@class='icon-expand']")
private static WebElement invReportsOrderManagementExpandBtn;



@FindBy(xpath="//li[@class='treeview']//a[@id='1104']//span[contains(text(),'Account')]")
private static WebElement masterAccountOption;





public boolean checkStockLedgerProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("StockLedgerProfile");
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFininicalExpandBtn));
	createProfileFininicalExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(finincalsReportsExpandBtn));
	finincalsReportsExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledgerOption));
	ledgerOption.click();
	
	if (stockLedgerAcessOption.isDisplayed() && stockLedgerSearchOption.isDisplayed() && stockLedgerPrintOption.isDisplayed()
			&& stockLedgerViewOption.isDisplayed() && stockLedgerExportOption.isDisplayed() && stockLedgerEmailReportOption.isDisplayed()
			&& stockLedgerEditPrintLayoutOption.isDisplayed() && stockLedgerViewCustomizedLayoutOption.isDisplayed() && stockLedgerAddCustomizedLayoutOption.isDisplayed()
			&& stockLedgerBackTrackOption.isDisplayed() && stockLedgerEmailOption.isDisplayed() && stockLedgerViewGraphOption.isDisplayed()
			&& stockLedgerFilterOption.isDisplayed() && stockLedgerAnalyzeOption.isDisplayed() && stockLedgerCrossReferenceOption.isDisplayed() 
			&& stockLedgerAddAnalyzeReportOption.isDisplayed()) 
	{
		System.out.println(" Pass: Ledger Sun Menu Options Are Displayed ");
		excelReader.setCellData(xlfile, "Sheet4", 100, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println(" Fail: Ledger Sun Menu Options Are Displayed ");
		excelReader.setCellData(xlfile, "Sheet4", 100, 9, resFail);
		return false;
	}
	
	
}


public boolean checkStockLedgerSelectAllOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	createProfileSelectAllIcon.click();

   Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
    createProfileSaveIcon.click();
       
	 
   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Profile saved Successfully";
	System.out.println(Actdata);
	
	
  if (Actdata.equalsIgnoreCase(Expdata)) {
		System.out.println("  Pass: Stock LedgerProfile profile saves Successfully");
		
		if(newErrorMessageCloseBtn.isDisplayed())
		{
			newErrorMessageCloseBtn.click();	
		}
		excelReader.setCellData(xlfile, "Sheet4", 101, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:  Stock  LedgerProfile profile saves Successfully");
		if(newErrorMessageCloseBtn.isDisplayed())
		{
			newErrorMessageCloseBtn.click();	
		}
		excelReader.setCellData(xlfile, "Sheet4", 101, 9, resFail);
		return false;
	}
}


@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Ledger')]")
private static WebElement stockLedgerOption;

public boolean checkSLAccessProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SLAcessProfile");
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	createProfileInventoryExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryreportsExpandBtn));
	inventoryreportsExpandBtn.click();
	
	 Thread.sleep(2000);
	 
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerOption));
	stockLedgerOption.click();
	
	 Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accessChkBox));
	accessChkBox.click();
	
	 Thread.sleep(2000);
	if (accessChkBox.isSelected()) 
	{
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	    createProfileSaveIcon.click();
	       
		 
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Profile saved Successfully";
		
		System.out.println(Actdata);
		
		
	  if (Actdata.equalsIgnoreCase(Expdata)) {
			System.out.println("  Pass:  SLAcessProfile profile saves Successfully");
			excelReader.setCellData(xlfile, "Sheet4", 102, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:   SLAcessProfile profile saves Successfully");
			excelReader.setCellData(xlfile, "Sheet4", 102, 9, resFail);
			return false;
		}
	}
	else 
	{
		System.out.println(" Fail : Access ChkBox iS Checked ");
		excelReader.setCellData(xlfile, "Sheet4", 102, 9, resFail);
		return false;
	}
}
  


public boolean checkSLSearchProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));

	createProfileProfileNameDropdown.sendKeys("SLSearchProfile");
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	createProfileInventoryExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryreportsExpandBtn));
	inventoryreportsExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerOption));
	stockLedgerOption.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerSearchOption));
	stockLedgerSearchOption.click();
	
	 Thread.sleep(2000);
	if (stockLedgerSearchOption.isSelected()) 
	{Thread.sleep(4000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
    createProfileSaveIcon.click();
       
	 
   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Profile saved Successfully";
	System.out.println(Actdata);
	
	
  if (Actdata.equalsIgnoreCase(Expdata)) {
		System.out.println("  Pass:  SLSProfile profile saves Successfully");
		excelReader.setCellData(xlfile, "Sheet4", 103, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:   SLSearchProfile profile saves Successfully");
		excelReader.setCellData(xlfile, "Sheet4", 103, 9, resFail);
		return false;
	}
	}
	else 
	{
		System.out.println(" Fail : Search ChkBox iS Checked ");
		excelReader.setCellData(xlfile, "Sheet4", 103, 9, resFail);
		return false;
	}
	
}









public boolean checkSLPrintViewExportFilterProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	
	createProfileProfileNameDropdown.sendKeys("SLPrintProfile");
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	createProfileInventoryExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryreportsExpandBtn));
	inventoryreportsExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerOption));
	stockLedgerOption.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerPrintOption));
	stockLedgerPrintOption.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerViewOption));
	stockLedgerViewOption.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerExportOption));
	stockLedgerExportOption.click();
	
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerFilterOption));
	stockLedgerFilterOption.click();
	
	
	if (stockLedgerPrintOption.isSelected()) 
	{
		 Thread.sleep(4000);
		 
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  SLPrintProfile profile saves Successfully");
				excelReader.setCellData(xlfile, "Sheet4", 104, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   SLPrintProfile profile saves Successfully");
				excelReader.setCellData(xlfile, "Sheet4", 104, 9, resFail);
				return false;
			}
	}
	else 
	{
		System.out.println(" Fail : Print ChkBox iS Checked ");
		excelReader.setCellData(xlfile, "Sheet4", 104, 9, resFail);
		return false;
	}
	
}






public boolean checkAllMastersProfileOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	 
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
	homeSecurityMenu.click();
	 
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
	createProfileMenu.click();
	
	Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("AllMasterProfile");
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
	createProfileHomeExpandBtn.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
	homeMastersExpandBtn.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	createProfileSelectAllIcon.click();

	    Thread.sleep(3000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	    createProfileSaveIcon.click();
	       
		 
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Profile saved Successfully";
		System.out.println(Actdata);
		
		
	  if (Actdata.equalsIgnoreCase(Expdata)) {
			 System.out.println("  Pass:  SLAddAnalyzeReportProfile saved Successfully");
             newErrorMessageCloseBtn.click();
			 excelReader.setCellData(xlfile, "Sheet4", 105, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:   SLAddAnalyzeReportProfile profile saved Successfully");
			 newErrorMessageCloseBtn.click();
			 excelReader.setCellData(xlfile, "Sheet4", 105, 9, resFail);
			return false;
		}
		
	}




public boolean checkRestrictionOptionsProductProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("AllProductProfile");
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
    createProfileHomeExpandBtn.click();
	
    Thread.sleep(2000);
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
	homeMastersExpandBtn.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
	itemExpandBtn.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemOption));
	itemOption.click();

    Thread.sleep(3000);
    
    if (itemAddChkbox.isDisplayed() && itemEditChkbox.isDisplayed()&& itemCopyChkbox.isDisplayed()&& itemSearchChkbox.isDisplayed()&& itemDeleteChkbox.isDisplayed()&& itemPrintChkbox.isDisplayed()&& itemExportChkbox.isDisplayed() 
   	 && itemCustomizeViewChkbox.isDisplayed()&& itemSortChkbox.isDisplayed()&& itemMassUpdateChkbox.isDisplayed()&& itemAuthorizeChkbox.isDisplayed()&& itemTransferChkbox.isDisplayed()&& itemPropertiesChkbox.isDisplayed()&& itemLedgerChkbox.isDisplayed()
   	 && itemBackTrackChkbox.isDisplayed()&&itembudgetChkbox .isDisplayed()&& itemHelpChkbox.isDisplayed()&& itemCreateTreeChkbox.isDisplayed()&& itemDeleteTreeChkbox.isDisplayed()&& itemCreateViewChkbox.isDisplayed()&& itemEditViewChkbox.isDisplayed()
   	 && itemDeleteViewChkbox.isDisplayed()&& itemSelectViewChkbox.isDisplayed()&& itemSelectTreeChkbox.isDisplayed()&& itemCloneChkbox.isDisplayed()&& itemAddGroupChkbox.isDisplayed()&& itemGroupMasterChkbox.isDisplayed()&& itemSetTypeChkbox.isDisplayed()
   	 && itemDeleteAllChkbox.isDisplayed()&&itemMoveUpChkbox .isDisplayed()&&itemMoveDownChkbox .isDisplayed()&&itemCreditManangementChkbox .isDisplayed()&&itemDepartmentAppropriationChkbox .isDisplayed()&& itemCustomizeTreeChkbox.isDisplayed()&&itemCustomizeMAsterChkbox .isDisplayed()
   	 &&itemCanchangeGroupChkbox .isDisplayed()&& itemCanNavigateChkbox.isDisplayed()&& itemAddInfoPannelChkbox.isDisplayed()&&itemEditInfoPannelChkbox .isDisplayed()&& itemViewInfoPannelChkbox.isDisplayed()&&itemRejectChkbox .isDisplayed()
   	 && itemImportChkbox.isDisplayed()&& itemShowHomePageChkbox.isDisplayed()&&itemDeleteInfoPannelChkbox .isDisplayed()&& itemStopChkbox.isDisplayed()&& itemSaveRevisionChkbox.isDisplayed()&& itemSetDefaultTreeChkbox.isDisplayed()&& itemModifierChkbox.isDisplayed()
   	 &&itemEditTreeChkbox .isDisplayed()&& itemAuthorizationInfoChkbox.isDisplayed()&& itemAlternateChkbox.isDisplayed()&& itemrealtedChkbox.isDisplayed()&&itemOpenCLoseChkbox .isDisplayed()&&itemCloseProductChkbox .isDisplayed()&&itemAdvanceMasterImportandExportChkbox .isDisplayed()
   	 &&itemUnitConversionChkbox .isDisplayed()&& itemGeneralChkbox.isDisplayed()&& itemUnitsChkbox.isDisplayed()&& itemSettingChkbox.isDisplayed()&& itemClassificaionChkbox.isDisplayed()&&itemOtherDetailsChkbox .isDisplayed()&& itemReplenishmentChkbox.isDisplayed()
   	 && itemReorderChkbox.isDisplayed()&& itemOutletChkbox.isDisplayed())
    {
	   	 System.out.println(" Pass : Displayed All the Fileds in AllProductProfile  ");
			excelReader.setCellData(xlfile, "Sheet4", 106, 9, resPass);
	   	 return true;
	 } 
   else 
    {
	   	 System.out.println(" Fail : Displayed All the Fileds in AllProductProfile  ");
			excelReader.setCellData(xlfile, "Sheet4", 106, 9, resFail);
	   	 return false;
	 }
	
}


public boolean checkSelectAllOptionsProduct() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	createProfileSelectAllIcon.click();
	
	    Thread.sleep(3000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	    createProfileSaveIcon.click();
	       
		 
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Profile saved Successfully";
		System.out.println(Actdata);
		
		
	  if (Actdata.equalsIgnoreCase(Expdata)) 
	  {
			System.out.println("  Pass:  AllProductProfile saved Successfully");
             newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 107, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:   AllProductProfile profile saved Successfully");
			 newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 107, 9, resFail);
			return false;
		}
		
	}




@FindBy(xpath="//li[@class='active']//a[@id='221']//i[@class='icon-expand']")
private static WebElement addHomeMasterItemExpandBtn;



@FindBy(xpath="//li[@class='active']//a[@id='1105']//span[contains(text(),'Item')]")
private static WebElement addMasterItemItemOption;





@FindBy(xpath="//li[@class='active']//span[contains(text(),'Item')]")
private static WebElement addHomeMAsterItemoption;


@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement addMasterItemAddChkbox;	

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement addMasterItemEditChkbox;	

@FindBy(xpath="//label[contains(text(),'Copy')]//input[@id='1105']")
private static WebElement addMasterItemCopyChkbox;

@FindBy(xpath="//label[contains(text(),'Search')]//input[@id='1105']")
private static WebElement addMasterItemSearchChkbox;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement addMasterItemDeleteChkbox;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement addMasterItemPrintChkbox;

@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
private static WebElement addMasterItemExportChkbox;

@FindBy(xpath="//label[contains(text(),'Customize View')]//input[@id='1105']")
private static WebElement addMasterItemCustomizeViewChkbox;

@FindBy(xpath="//label[contains(text(),'Sort')]//input[@id='1105']")
private static WebElement addMasterItemSortChkbox;

@FindBy(xpath="//label[contains(text(),'Mass Update')]//input[@id='1105']")
private static WebElement addMasterItemMassUpdateChkbox;

@FindBy(xpath="//label[contains(text(),'Authorize')]//input[@id='1105']")
private static WebElement addMasterItemAuthorizeChkbox;

@FindBy(xpath="//label[contains(text(),'Transfer')]//input[@id='1105']")
private static WebElement addMasterItemTransferChkbox;

@FindBy(xpath="//label[contains(text(),'Properties')]//input[@id='1105']")
private static WebElement addMasterItemPropertiesChkbox;

@FindBy(xpath="//label[contains(text(),'Ledger')]//input[@id='1105']")
private static WebElement addMasterItemLedgerChkbox;

@FindBy(xpath="//label[contains(text(),'Back Track')]//input[@id='1105']")
private static WebElement addMasterItemBackTrackChkbox;

@FindBy(xpath="//label[contains(text(),'Budgets')]//input[@id='1105']")
private static WebElement addMasterItemBudgetsChkbox;

@FindBy(xpath="//label[contains(text(),'Help')]//input[@id='1105']")
private static WebElement addMasterItemHelpChkbox;

@FindBy(xpath="//label[contains(text(),'Create Tree')]//input[@id='1105']")
private static WebElement addMasterItemCreateTreeChkbox;

@FindBy(xpath="//label[contains(text(),'DeleteTree')]//input[@id='1105']")
private static WebElement addMasterItemDeleteTreeChkbox;

@FindBy(xpath="//label[contains(text(),'CreateView')]//input[@id='1105']")
private static WebElement addMasterItemCreateViewChkbox;

@FindBy(xpath="//label[contains(text(),'Edit View')]//input[@id='1105']")
private static WebElement addMasterItemEditViewChkbox;

@FindBy(xpath="//label[contains(text(),'Delete View')]//input[@id='1105']")
private static WebElement addMasterItemDeleteViewChkbox;

@FindBy(xpath="//label[contains(text(),'Select View')]//input[@id='1105']")
private static WebElement addMasterItemSelectViewChkbox;

@FindBy(xpath="//label[contains(text(),'Select Tree')]//input[@id='1105']")
private static WebElement addMasterItemSelectTreeChkbox;

@FindBy(xpath="//label[contains(text(),'Clone')]//input[@id='1105']")
private static WebElement addMasterItemCloneChkbox;

@FindBy(xpath="//label[contains(text(),'Add Group')]//input[@id='1105']")
private static WebElement addMasterItemAddGroupChkbox;

@FindBy(xpath="//label[contains(text(),'Group Master')]//input[@id='1105']")
private static WebElement addMasterItemGroupMasterChkbox;

@FindBy(xpath="//label[contains(text(),'Set Type')]//input[@id='1105']")
private static WebElement addMasterItemSettypeChkbox;

@FindBy(xpath="//label[contains(text(),'Delete All')]//input[@id='1105']")
private static WebElement addMasterItemDeleteAllChkbox;

@FindBy(xpath="//label[contains(text(),'Move Up')]//input[@id='1105']")
private static WebElement addMasterItemMoveupChkbox;

@FindBy(xpath="//label[contains(text(),'Move Down')]//input[@id='1105']")
private static WebElement addMasterItemMOveDownChkbox;

@FindBy(xpath="//label[contains(text(),'Credit Management')]//input[@id='1105']")
private static WebElement addMasterItemCreditMangementChkbox;

@FindBy(xpath="//label[contains(text(),'Department Appropriation')]//input[@id='1105']")
private static WebElement addMasterItemdepartmentApproriationChkbox;

@FindBy(xpath="//label[contains(text(),'Customize Tree')]//input[@id='1105']")
private static WebElement addMasterItemCustomizeTreeChkbox;

@FindBy(xpath="//label[contains(text(),'Customize Master')]//input[@id='1105']")
private static WebElement addMasterItemCustomizeMasterChkbox;

@FindBy(xpath="//label[contains(text(),'Can Change Group')]//input[@id='1105']")
private static WebElement addMasterItemCanChangeGroupChkbox;

@FindBy(xpath="//label[contains(text(),'Can Navigate')]//input[@id='1105']")
private static WebElement addMasterItemCanNAvigateChkbox;

@FindBy(xpath="//label[contains(text(),'Add Info Panel')]//input[@id='1105']")
private static WebElement addMasterItemAddInfoPannelChkbox;

@FindBy(xpath="//label[contains(text(),'Edit Info Panel')]//input[@id='1105']")
private static WebElement addMasterItemEditInfoPannelChkbox;

@FindBy(xpath="//label[contains(text(),'View Info Panel')]//input[@id='1105']")
private static WebElement addMasterItemViewInfoPannelChkbox;

@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='1105']")
private static WebElement addMasterItemRejectChkbox;

@FindBy(xpath="//li[42]//div[1]//label[1]//input[1]")
private static WebElement addMasterItemImportChkbox;

@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='1105']")
private static WebElement addMasterItemShowHomePageChkbox;

@FindBy(xpath="//label[contains(text(),'DeleteInfoPanel')]//input[@id='1105']")
private static WebElement addMasterItemDeletInfoPannelChkbox;

@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='1105']")
private static WebElement addMasterItemStopChkbox;

@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='1105']")
private static WebElement addMasterItemSaveRevisionChkbox;

@FindBy(xpath="//label[contains(text(),'SetDefaultTree')]//input[@id='1105']")
private static WebElement addMasterItemSetDefaultTreeChkbox;

@FindBy(xpath="//label[contains(text(),'Modifier')]//input[@id='1105']")
private static WebElement addMasterItemModiferChkbox;

@FindBy(xpath="//label[contains(text(),'Edit Tree')]//input[@id='1105']")
private static WebElement addMasterItemEditTreeChkbox;

@FindBy(xpath="//label[contains(text(),'Authorization Info')]//input[@id='1105']")
private static WebElement addMasterItemAutorizationInfoChkbox;

@FindBy(xpath="//label[contains(text(),'Alternate')]//input[@id='1105']")
private static WebElement addMasterItemAlternateChkbox;

@FindBy(xpath="//label[contains(text(),'Related')]//input[@id='1105']")
private static WebElement addMasterItemRelatedChkbox;

@FindBy(xpath="//label[contains(text(),'Open Close')]//input[@id='1105']")
private static WebElement addMasterItemOpenCloseChkbox;

@FindBy(xpath="//label[contains(text(),'CloseProduct')]//input[@id='1105']")
private static WebElement addMasterItemCLoseProductChkbox;

@FindBy(xpath="//label[contains(text(),'Adv Master Import/Export')]//input[@id='1105']")
private static WebElement addMasterItemAdvanceMasterImportAndExportChkbox;

@FindBy(xpath="//label[contains(text(),'General')]//input[@id='1105']")
private static WebElement addMasterItemGeneralChkbox;
              
@FindBy(xpath="//label[contains(text(),'Setting')]//input[@id='1105']")
private static WebElement addMasterItemSettingChkbox;

@FindBy(xpath="//label[contains(text(),'Classification')]//input[@id='1105']")
private static WebElement addMasterClassificationItemChkbox;

@FindBy(xpath="//label[contains(text(),'Other Details')]//input[@id='1105']")
private static WebElement addMasterItemOtherDetailsItemChkbox;

@FindBy(xpath="//label[contains(text(),'Replenishment')]//input[@id='1105']")
private static WebElement addMasterItemReplenishmentItemChkbox;

@FindBy(xpath="//label[contains(text(),'Reorder')]//input[@id='1105']")
private static WebElement addMasterItemReorderItemChkbox;

@FindBy(xpath="//label[contains(text(),'Outlet')]//input[@id='1105']")
private static WebElement addMasterItemOutletItemChkbox;

@FindBy(xpath="//a[@id='221']//i[@class='icon icon-expand']")
private static WebElement itemExpandBtn;

@FindBy(xpath="//li[@class='treeview']//a[@id='1105']//span[contains(text(),'Item')]")
private static WebElement itemOption;

@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement itemAddChkbox;

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement itemEditChkbox;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement itemCopyChkbox;

@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
private static WebElement itemSearchChkbox;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement itemDeleteChkbox;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement itemPrintChkbox;

@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
private static WebElement itemExportChkbox;

@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
private static WebElement itemCustomizeViewChkbox;

@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
private static WebElement itemSortChkbox;

@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
private static WebElement itemMassUpdateChkbox;

@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
private static WebElement itemAuthorizeChkbox;

@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
private static WebElement itemTransferChkbox;

@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
private static WebElement itemPropertiesChkbox;

@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
private static WebElement itemLedgerChkbox;

@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
private static WebElement itemBackTrackChkbox;

@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
private static WebElement itembudgetChkbox;

@FindBy(xpath="//li[17]//div[1]//label[1]//input[1]")
private static WebElement itemHelpChkbox;

@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
private static WebElement itemCreateTreeChkbox;

@FindBy(xpath="//li[19]//div[1]//label[1]//input[1]")
private static WebElement itemDeleteTreeChkbox;

@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
private static WebElement itemCreateViewChkbox;

@FindBy(xpath="//li[21]//div[1]//label[1]//input[1]")
private static WebElement itemEditViewChkbox;

@FindBy(xpath="//li[22]//div[1]//label[1]//input[1]")
private static WebElement itemDeleteViewChkbox;

@FindBy(xpath="//li[23]//div[1]//label[1]//input[1]")
private static WebElement itemSelectViewChkbox;

@FindBy(xpath="//li[24]//div[1]//label[1]//input[1]")
private static WebElement itemSelectTreeChkbox;

@FindBy(xpath="//li[25]//div[1]//label[1]//input[1]")
private static WebElement itemCloneChkbox;

@FindBy(xpath="//li[26]//div[1]//label[1]//input[1]")
private static WebElement itemAddGroupChkbox;

@FindBy(xpath="//li[27]//div[1]//label[1]//input[1]")
private static WebElement itemGroupMasterChkbox;

@FindBy(xpath="//li[28]//div[1]//label[1]//input[1]")
private static WebElement itemSetTypeChkbox;

@FindBy(xpath="//li[29]//div[1]//label[1]//input[1]")
private static WebElement itemDeleteAllChkbox;

@FindBy(xpath="//li[30]//div[1]//label[1]//input[1]")
private static WebElement itemMoveUpChkbox;

@FindBy(xpath="//li[31]//div[1]//label[1]//input[1]")
private static WebElement itemMoveDownChkbox;

@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
private static WebElement itemCreditManangementChkbox;

@FindBy(xpath="//li[33]//div[1]//label[1]//input[1]")
private static WebElement itemDepartmentAppropriationChkbox;

@FindBy(xpath="//li[34]//div[1]//label[1]//input[1]")
private static WebElement itemCustomizeTreeChkbox;

@FindBy(xpath="//li[35]//div[1]//label[1]//input[1]")
private static WebElement itemCustomizeMAsterChkbox;

@FindBy(xpath="//li[36]//div[1]//label[1]//input[1]")
private static WebElement itemCanchangeGroupChkbox;

@FindBy(xpath="//li[37]//div[1]//label[1]//input[1]")
private static WebElement itemCanNavigateChkbox;

@FindBy(xpath="//li[38]//div[1]//label[1]//input[1]")
private static WebElement itemAddInfoPannelChkbox;

@FindBy(xpath="//li[39]//div[1]//label[1]//input[1]")
private static WebElement itemEditInfoPannelChkbox;

@FindBy(xpath="//li[40]//div[1]//label[1]//input[1]")
private static WebElement itemViewInfoPannelChkbox;

@FindBy(xpath="//li[41]//div[1]//label[1]//input[1]")
private static WebElement itemRejectChkbox;


@FindBy(xpath="//li[42]//div[1]//label[1]//input[1]")
private static WebElement itemImportChkbox;

@FindBy(xpath="//li[43]//div[1]//label[1]//input[1]")
private static WebElement itemShowHomePageChkbox;

@FindBy(xpath="//li[44]//div[1]//label[1]//input[1]")
private static WebElement itemDeleteInfoPannelChkbox;

@FindBy(xpath="//li[45]//div[1]//label[1]//input[1]")
private static WebElement itemStopChkbox;

@FindBy(xpath="//li[46]//div[1]//label[1]//input[1]")
private static WebElement itemSaveRevisionChkbox;

@FindBy(xpath="//li[47]//div[1]//label[1]//input[1]")
private static WebElement itemSetDefaultTreeChkbox;

@FindBy(xpath="//li[48]//div[1]//label[1]//input[1]")
private static WebElement itemModifierChkbox;

@FindBy(xpath="//li[49]//div[1]//label[1]//input[1]")
private static WebElement itemEditTreeChkbox;

@FindBy(xpath="//li[50]//div[1]//label[1]//input[1]")
private static WebElement itemAuthorizationInfoChkbox;

@FindBy(xpath="//li[51]//div[1]//label[1]//input[1]")
private static WebElement itemAlternateChkbox;

@FindBy(xpath="//li[52]//div[1]//label[1]//input[1]")
private static WebElement itemrealtedChkbox;

@FindBy(xpath="//li[53]//div[1]//label[1]//input[1]")
private static WebElement itemOpenCLoseChkbox;

@FindBy(xpath="//li[54]//div[1]//label[1]//input[1]")
private static WebElement itemCloseProductChkbox;

@FindBy(xpath="//li[55]//div[1]//label[1]//input[1]")
private static WebElement itemAdvanceMasterImportandExportChkbox;

@FindBy(xpath="//li[56]//div[1]//label[1]//input[1]")
private static WebElement itemUnitConversionChkbox;

@FindBy(xpath="//li[57]//div[1]//label[1]//input[1]")
private static WebElement itemGeneralChkbox;

@FindBy(xpath="//li[58]//div[1]//label[1]//input[1]")
private static WebElement itemUnitsChkbox;

@FindBy(xpath="//li[59]//div[1]//label[1]//input[1]")
private static WebElement itemSettingChkbox;

@FindBy(xpath="//li[60]//div[1]//label[1]//input[1]")
private static WebElement itemClassificaionChkbox;

@FindBy(xpath="//li[61]//div[1]//label[1]//input[1]")
private static WebElement itemOtherDetailsChkbox;

@FindBy(xpath="//li[62]//div[1]//label[1]//input[1]")
private static WebElement itemReplenishmentChkbox;

@FindBy(xpath="//li[63]//div[1]//label[1]//input[1]")
private static WebElement itemReorderChkbox;

@FindBy(xpath="//li[64]//div[1]//label[1]//input[1]")
private static WebElement itemOutletChkbox;



public boolean checkProfileAddProduct() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	

	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("ProfileAddProduct");
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
    createProfileHomeExpandBtn.click();
	
    Thread.sleep(2000);
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
	homeMastersExpandBtn.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
	itemExpandBtn.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemOption));
	itemOption.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemAddChkbox));
	itemAddChkbox.click();
	
	Thread.sleep(2000);
	
	if (itemAddChkbox.isSelected()) 
	{
		 Thread.sleep(2000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  ProfileAddProduct saved Successfully");
	             newErrorMessageCloseBtn.click();
					excelReader.setCellData(xlfile, "Sheet4", 108, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   ProfileAddProduct profile saved Successfully");
				 newErrorMessageCloseBtn.click();
					excelReader.setCellData(xlfile, "Sheet4", 108, 9, resFail);
				return false;
			}
	} 
	else
	{
		System.out.println(" Fail : Item  Add Chkbox is Checked in ProfileAddProduct");	
		excelReader.setCellData(xlfile, "Sheet4", 108, 9, resFail);
		return false;
	}
	
}








public boolean checkProfileEditProduct() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("ProfileEditProduct");
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
    createProfileHomeExpandBtn.click();
	
    Thread.sleep(2000);
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
	homeMastersExpandBtn.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
	itemExpandBtn.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemOption));
	itemOption.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemEditChkbox));
	itemEditChkbox.click();
	
	Thread.sleep(2000);
	
	if (itemEditChkbox.isSelected()) 
	{
		 Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		    createProfileSaveIcon.click();
		       
			 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
			
		  if (Actdata.equalsIgnoreCase(Expdata)) {
				System.out.println("  Pass:  ProfileEditProduct saved Successfully");
	             newErrorMessageCloseBtn.click();
					excelReader.setCellData(xlfile, "Sheet4", 109, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   ProfileEditProduct profile saved Successfully");
				 newErrorMessageCloseBtn.click();
					excelReader.setCellData(xlfile, "Sheet4", 109, 9, resFail);
				return false;
			}
			
	} 
	else
	{
		System.out.println(" Fail : Item  Edit Chkbox is Checked in ProfileEditProduct");
		excelReader.setCellData(xlfile, "Sheet4", 109, 9, resFail);
		return false;
	}
	
}






public boolean checkProfileCopyProduct() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("ProfileCopyProduct");
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
    createProfileHomeExpandBtn.click();
	
    Thread.sleep(2000);
    
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
	homeMastersExpandBtn.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
	itemExpandBtn.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemOption));
	itemOption.click();

	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemCopyChkbox));
	itemCopyChkbox.click();
	
	Thread.sleep(2000);
	
	if (itemCopyChkbox.isSelected()) 
	{
		Thread.sleep(3000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	    createProfileSaveIcon.click();
	       
		 
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Profile saved Successfully";
		System.out.println(Actdata);
		
		
	  if (Actdata.equalsIgnoreCase(Expdata)) {
			System.out.println("  Pass:  ProfileCopyProduct saved Successfully");
             newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 110, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:   ProfileCopyProduct profile saved Successfully");
			 newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 110, 9, resFail);
			return false;
		}
	} 
	else
	{
		System.out.println(" Fail : Item  Copy Chkbox is Checked in ProfileCopyProduct");	
		excelReader.setCellData(xlfile, "Sheet4", 110, 9, resFail);
		return false;
	}
	
}





public boolean checkProfileSearchDeleteProduct() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("ProfileSearchProduct");
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
    createProfileHomeExpandBtn.click();
	
    Thread.sleep(2000);
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
	homeMastersExpandBtn.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
	itemExpandBtn.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemOption));
	itemOption.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSearchChkbox));
	itemSearchChkbox.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemDeleteChkbox));
	itemDeleteChkbox.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPrintChkbox));
	itemPrintChkbox.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExportChkbox));
	itemExportChkbox.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemAuthorizeChkbox));
	itemAuthorizeChkbox.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemLedgerChkbox));
	itemLedgerChkbox.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemCreateTreeChkbox));
	itemCreateTreeChkbox.click();
	
	if (itemSearchChkbox.isSelected() && itemDeleteChkbox.isSelected() && itemPrintChkbox.isSelected() && 
			itemExportChkbox.isSelected() && itemAuthorizeChkbox.isSelected() && itemLedgerChkbox.isSelected() &&
			itemCreateTreeChkbox.isSelected()) 
	{
	    Thread.sleep(3000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	    createProfileSaveIcon.click();
	      
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Profile saved Successfully";
		System.out.println(Actdata);
			
		  if (Actdata.equalsIgnoreCase(Expdata)) 
		  {
				System.out.println("  Pass:  ProfileSearchProduct saved Successfully");
	            newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 111, 9, resPass);
				return true;
		  } 
		  else 
		  {
				System.out.println("Fail:   ProfileSearchProduct profile saved Successfully");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 111, 9, resFail);
				return false;
		  }
	} 
	else
	{
		System.out.println(" Fail : Item  Search Chkbox is Checked in ProfileSearchProduct");	
		excelReader.setCellData(xlfile, "Sheet4", 111, 9, resFail);
		return false;
	}
	
}


@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement accountAddChkbox;	

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement accountEditChkbox;	

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement accountCopyChkbox;

@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
private static WebElement accountSearchChkbox;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement accountDeleteChkbox;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement accountPrintChkbox;

@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
private static WebElement accountExportChkbox;

@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
private static WebElement accountCustomizeViewChkbox;

@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
private static WebElement accountSortChkbox;

@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
private static WebElement accountMassUpdateChkbox;

@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
private static WebElement accountAuthorizeChkbox;

@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
private static WebElement accountTransferChkbox;

@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
private static WebElement accountPropertiesChkbox;

@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
private static WebElement accountLedgerChkbox;

@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
private static WebElement accountBackTrackChkbox;

@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
private static WebElement accountBudgetsChkbox;

@FindBy(xpath="//li[17]//div[1]//label[1]//input[1]")
private static WebElement accountHelpChkbox;

@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
private static WebElement accountCreateTreeChkbox;

@FindBy(xpath="//li[19]//div[1]//label[1]//input[1]")
private static WebElement accountDeleteTreeChkbox;

@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
private static WebElement accountCreateViewChkbox;


@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
private static WebElement salesOrderAuthorizeChkbox;


@FindBy(xpath="//li[21]//div[1]//label[1]//input[1]")
private static WebElement accountEditViewChkbox;

@FindBy(xpath="//li[22]//div[1]//label[1]//input[1]")
private static WebElement accountDeleteViewChkbox;

@FindBy(xpath="//li[23]//div[1]//label[1]//input[1]")
private static WebElement accountSelectViewChkbox;

@FindBy(xpath="//li[24]//div[1]//label[1]//input[1]")
private static WebElement accountSelectTreeChkbox;

@FindBy(xpath="//li[25]//div[1]//label[1]//input[1]")
private static WebElement accountCloneChkbox;

@FindBy(xpath="//li[26]//div[1]//label[1]//input[1]")
private static WebElement accountAddGroupChkbox;

@FindBy(xpath="//li[27]//div[1]//label[1]//input[1]")
private static WebElement accountGroupMasterChkbox;

@FindBy(xpath="//li[28]//div[1]//label[1]//input[1]")
private static WebElement accountSettypeChkbox;

@FindBy(xpath="//li[29]//div[1]//label[1]//input[1]")
private static WebElement accountDeleteAllChkbox;

@FindBy(xpath="//li[30]//div[1]//label[1]//input[1]")
private static WebElement accountMoveupChkbox;

@FindBy(xpath="//li[31]//div[1]//label[1]//input[1]")
private static WebElement accountMOveDownChkbox;

@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
private static WebElement accountCreditMangementChkbox;

@FindBy(xpath="//li[33]//div[1]//label[1]//input[1]")
private static WebElement accountdepartmentApprooriationChkbox;

@FindBy(xpath="//li[34]//div[1]//label[1]//input[1]")
private static WebElement accountCustomizeTreeChkbox;

@FindBy(xpath="//li[35]//div[1]//label[1]//input[1]")
private static WebElement accountCustomizeMasterChkbox;

@FindBy(xpath="//li[36]//div[1]//label[1]//input[1]")
private static WebElement accountCanChangeGroupChkbox;

@FindBy(xpath="//li[37]//div[1]//label[1]//input[1]")
private static WebElement accountCanNAvigateChkbox;

@FindBy(xpath="//li[38]//div[1]//label[1]//input[1]")
private static WebElement accountAddInfoPannelChkbox;

@FindBy(xpath="//li[39]//div[1]//label[1]//input[1]")
private static WebElement accountEditInfoPannelChkbox;

@FindBy(xpath="//li[40]//div[1]//label[1]//input[1]")
private static WebElement accountViewInfoPannelChkbox;

@FindBy(xpath="//li[41]//div[1]//label[1]//input[1]")
private static WebElement accountRejectChkbox;

@FindBy(xpath="//li[42]//div[1]//label[1]//input[1]")
private static WebElement accountImportChkbox;

@FindBy(xpath="//li[43]//div[1]//label[1]//input[1]")
private static WebElement accountShowHomePageChkbox;

@FindBy(xpath="//li[44]//div[1]//label[1]//input[1]")
private static WebElement accountDeletInfoPannelChkbox;

@FindBy(xpath="//li[45]//div[1]//label[1]//input[1]")
private static WebElement accountStopChkbox;

@FindBy(xpath="//li[46]//div[1]//label[1]//input[1]")
private static WebElement accountSaveRevisionChkbox;

@FindBy(xpath="//li[47]//div[1]//label[1]//input[1]")
private static WebElement accountSetDefaultTreeChkbox;

@FindBy(xpath="//li[48]//div[1]//label[1]//input[1]")
private static WebElement accountModiferChkbox;

@FindBy(xpath="//li[49]//div[1]//label[1]//input[1]")
private static WebElement accountEditTreeChkbox;

@FindBy(xpath="//li[50]//div[1]//label[1]//input[1]")
private static WebElement accountAutorizationInfoChkbox;

@FindBy(xpath="//li[51]//div[1]//label[1]//input[1]")
private static WebElement accountAlternateChkbox;

@FindBy(xpath="//li[52]//div[1]//label[1]//input[1]")
private static WebElement accountRelatedChkbox;

@FindBy(xpath="//li[53]//div[1]//label[1]//input[1]")
private static WebElement accountOpenCloseChkbox;

@FindBy(xpath="//li[54]//div[1]//label[1]//input[1]")
private static WebElement accountCLoseProductChkbox;

@FindBy(xpath="//li[55]//div[1]//label[1]//input[1]")
private static WebElement accountAdvanceMasterImportAndExportChkbox;

@FindBy(xpath="//li[56]//div[1]//label[1]//input[1]")
private static WebElement accountGeneralChkbox;

@FindBy(xpath="//li[57]//div[1]//label[1]//input[1]")
private static WebElement accountSettingChkbox;

@FindBy(xpath="//li[58]//div[1]//label[1]//input[1]")
private static WebElement accountDetailsChkbox;

@FindBy(xpath="//li[59]//div[1]//label[1]//input[1]")
private static WebElement accountPrintLayoutChkbox;

@FindBy(xpath="//a[@id='1000']//i[@class='icon icon-expand']")
private static WebElement mastersExpandBtn;

public boolean checkProfileAllAcountsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 Thread.sleep(2000);
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	 homeMenu.click();
	 
	 Thread.sleep(2000);
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
	 homeSecurityMenu.click();
	 
	 Thread.sleep(2000);
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
	 createProfileMenu.click();
		
	 Thread.sleep(2000);
	
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	 createProfileProfileNameDropdown.clear();
	 createProfileProfileNameDropdown.sendKeys("ProfileAllAcountsOption");
	
	 Thread.sleep(2000);
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
     createProfileHomeExpandBtn.click();
    
     Thread.sleep(2000);
    
     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersExpandBtn));
     mastersExpandBtn.click();
    
     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAccountOption));
     masterAccountOption.click();
     Thread.sleep(2000);
    
     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
     if (accountAddChkbox.isDisplayed() && accountEditChkbox.isDisplayed()&& accountCopyChkbox.isDisplayed()&& accountSearchChkbox.isDisplayed()&& accountDeleteChkbox.isDisplayed()
   		 && accountPrintChkbox.isDisplayed()&& accountExportChkbox.isDisplayed()&& accountCustomizeViewChkbox.isDisplayed()&&accountSortChkbox .isDisplayed()&& accountMassUpdateChkbox.isDisplayed()
   		 && accountAuthorizeChkbox.isDisplayed()&&accountTransferChkbox .isDisplayed()&& accountPropertiesChkbox.isDisplayed()&& accountLedgerChkbox.isDisplayed()&& accountBackTrackChkbox.isDisplayed()
   		 && accountBudgetsChkbox.isDisplayed()&& accountHelpChkbox.isDisplayed()&& accountCreateTreeChkbox.isDisplayed()&& accountDeleteTreeChkbox.isDisplayed()&& accountCreateViewChkbox.isDisplayed()
   		 && accountEditViewChkbox.isDisplayed()&&accountDeleteViewChkbox .isDisplayed()&& accountSelectViewChkbox.isDisplayed()&& accountSelectTreeChkbox.isDisplayed()&& accountCloneChkbox.isDisplayed()
   		 && accountAddGroupChkbox.isDisplayed()&& accountGroupMasterChkbox.isDisplayed()&& accountSettypeChkbox.isDisplayed()&& accountDeleteAllChkbox.isDisplayed()&& accountMoveupChkbox.isDisplayed()
   		 && accountMOveDownChkbox.isDisplayed()&& accountCreditMangementChkbox.isDisplayed()&& accountdepartmentApprooriationChkbox.isDisplayed() && accountCustomizeTreeChkbox.isDisplayed()&& accountCustomizeMasterChkbox.isDisplayed()
   		 && accountCanChangeGroupChkbox.isDisplayed()&& accountCanNAvigateChkbox.isDisplayed()&& accountAddInfoPannelChkbox.isDisplayed()&& accountEditInfoPannelChkbox.isDisplayed()&& accountViewInfoPannelChkbox.isDisplayed()
   		 && accountRejectChkbox.isDisplayed()&& accountImportChkbox.isDisplayed()&& accountShowHomePageChkbox.isDisplayed()&& accountDeletInfoPannelChkbox.isDisplayed()&& accountStopChkbox.isDisplayed()
   		 && accountSaveRevisionChkbox.isDisplayed()&& accountSetDefaultTreeChkbox.isDisplayed()&& accountModiferChkbox.isDisplayed()&& accountEditTreeChkbox.isDisplayed()&& accountAutorizationInfoChkbox.isDisplayed()
   		 && accountAlternateChkbox.isDisplayed()&& accountRelatedChkbox.isDisplayed()&& accountOpenCloseChkbox.isDisplayed()&& accountCLoseProductChkbox.isDisplayed()&& accountAdvanceMasterImportAndExportChkbox.isDisplayed()
   		 && accountGeneralChkbox.isDisplayed()&& accountSettingChkbox.isDisplayed()&& accountDetailsChkbox.isDisplayed()&&accountPrintLayoutChkbox .isDisplayed()) 
	     {
			System.out.println(" Pass: Displyed All the Elements in the Master Account Option");
			excelReader.setCellData(xlfile, "Sheet4", 112, 9, resPass);
			return true;
	} 
    else 
	{
		System.out.println(" Fail: Displyed All the Elements in the Master Account Option");
		excelReader.setCellData(xlfile, "Sheet4", 112, 9, resFail);
		return false;
	}
}





public boolean checkProfileAllAcountsOptionwithSelectAll() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);

	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	  createProfileSelectAllIcon.click();
	  
	  Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
	    if (accountAddChkbox.isSelected() && accountEditChkbox.isSelected()&& accountCopyChkbox.isSelected()&& accountSearchChkbox.isSelected()&& accountDeleteChkbox.isSelected()
	   		 && accountPrintChkbox.isSelected()&& accountExportChkbox.isSelected()&& accountCustomizeViewChkbox.isSelected()&&accountSortChkbox .isSelected()&& accountMassUpdateChkbox.isSelected()
	   		 && accountAuthorizeChkbox.isSelected()&&accountTransferChkbox .isSelected()&& accountPropertiesChkbox.isSelected()&& accountLedgerChkbox.isSelected()&& accountBackTrackChkbox.isSelected()
	   		 && accountBudgetsChkbox.isSelected()&& accountHelpChkbox.isSelected()&& accountCreateTreeChkbox.isSelected()&& accountDeleteTreeChkbox.isSelected()&& accountCreateViewChkbox.isSelected()
	   		 && accountEditViewChkbox.isSelected()&&accountDeleteViewChkbox .isSelected()&& accountSelectViewChkbox.isSelected()&& accountSelectTreeChkbox.isSelected()&& accountCloneChkbox.isSelected()
	   		 && accountAddGroupChkbox.isSelected()&& accountGroupMasterChkbox.isSelected()&& accountSettypeChkbox.isSelected()&& accountDeleteAllChkbox.isSelected()&& accountMoveupChkbox.isSelected()
	   		 && accountMOveDownChkbox.isSelected()&& accountCreditMangementChkbox.isSelected()&& accountdepartmentApprooriationChkbox.isSelected() && accountCustomizeTreeChkbox.isSelected()&& accountCustomizeMasterChkbox.isSelected()
	   		 && accountCanChangeGroupChkbox.isSelected()&& accountCanNAvigateChkbox.isSelected()&& accountAddInfoPannelChkbox.isSelected()&& accountEditInfoPannelChkbox.isSelected()&& accountViewInfoPannelChkbox.isSelected()
	   		 && accountRejectChkbox.isSelected()&& accountImportChkbox.isSelected()&& accountShowHomePageChkbox.isSelected()&& accountDeletInfoPannelChkbox.isSelected()&& accountStopChkbox.isSelected()
	   		 && accountSaveRevisionChkbox.isSelected()&& accountSetDefaultTreeChkbox.isSelected()&& accountModiferChkbox.isSelected()&& accountEditTreeChkbox.isSelected()&& accountAutorizationInfoChkbox.isSelected()
	   		 && accountAlternateChkbox.isSelected()&& accountRelatedChkbox.isSelected()&& accountOpenCloseChkbox.isSelected()&& accountCLoseProductChkbox.isSelected()&& accountAdvanceMasterImportAndExportChkbox.isSelected()
	   		 && accountGeneralChkbox.isSelected() && accountSettingChkbox.isSelected() && accountDetailsChkbox.isSelected() && accountPrintLayoutChkbox.isSelected()) 
	    {
				System.out.println(" Pass: Displyed All the Elements in the Master Account Option");
				excelReader.setCellData(xlfile, "Sheet4", 113, 9, resPass);
				return true;
		} 
	    else 
		{
			System.out.println(" Fail: Displyed All the Elements in the Master Account Option");
			excelReader.setCellData(xlfile, "Sheet4", 113, 9, resFail);
			return false;
		}
	  
}
	  
	  
	  public boolean checkProfileAllAcountsOptionwithSaveBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		  
		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
		 Thread.sleep(2000);
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	     createProfileSaveIcon.click();
     
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
			
		
	   if (Actdata.equalsIgnoreCase(Expdata)) 
	   {
			System.out.println(" Pass: All Accounts Profile is Saved Succesfully and All Options Are enable ");
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 114, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  All Accounts Profile is Saved Succesfully and All Options Are enable");
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 114, 9, resFail);
			return false;
		}

}



@FindBy(xpath="//li[@class='treeview']//a[@id='1106']//span[contains(text(),'Department')]")
private static WebElement accountDepartmentOption;




public boolean checkProfileAllDepartmentOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("ProfileAllDepartmentOption");
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
    createProfileHomeExpandBtn.click();
    
    
    Thread.sleep(2000);
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersExpandBtn));
    mastersExpandBtn.click();
    
    Thread.sleep(2000);
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountDepartmentOption));
    accountDepartmentOption.click();
    
    Thread.sleep(2000);
   
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
    if (accountAddChkbox.isDisplayed() && accountEditChkbox.isDisplayed()&& accountCopyChkbox.isDisplayed()&& accountSearchChkbox.isDisplayed()&& accountDeleteChkbox.isDisplayed()
   		 && accountPrintChkbox.isDisplayed()&& accountExportChkbox.isDisplayed()&& accountCustomizeViewChkbox.isDisplayed()&&accountSortChkbox .isDisplayed()&& accountMassUpdateChkbox.isDisplayed()
   		 && accountAuthorizeChkbox.isDisplayed()&&accountTransferChkbox .isDisplayed()&& accountPropertiesChkbox.isDisplayed()&& accountLedgerChkbox.isDisplayed()&& accountBackTrackChkbox.isDisplayed()
   		 && accountBudgetsChkbox.isDisplayed()&& accountHelpChkbox.isDisplayed()&& accountCreateTreeChkbox.isDisplayed()&& accountDeleteTreeChkbox.isDisplayed()&& accountCreateViewChkbox.isDisplayed()
   		 && accountEditViewChkbox.isDisplayed()&&accountDeleteViewChkbox .isDisplayed()&& accountSelectViewChkbox.isDisplayed()&& accountSelectTreeChkbox.isDisplayed()&& accountCloneChkbox.isDisplayed()
   		 && accountAddGroupChkbox.isDisplayed()&& accountGroupMasterChkbox.isDisplayed()&& accountSettypeChkbox.isDisplayed()&& accountDeleteAllChkbox.isDisplayed()&& accountMoveupChkbox.isDisplayed()
   		 && accountMOveDownChkbox.isDisplayed()&& accountCreditMangementChkbox.isDisplayed()&& accountdepartmentApprooriationChkbox.isDisplayed() && accountCustomizeTreeChkbox.isDisplayed()&& accountCustomizeMasterChkbox.isDisplayed()
   		 && accountCanChangeGroupChkbox.isDisplayed()&& accountCanNAvigateChkbox.isDisplayed()&& accountAddInfoPannelChkbox.isDisplayed()&& accountEditInfoPannelChkbox.isDisplayed()&& accountViewInfoPannelChkbox.isDisplayed()
   		 && accountRejectChkbox.isDisplayed()&& accountImportChkbox.isDisplayed()&& accountShowHomePageChkbox.isDisplayed()&& accountDeletInfoPannelChkbox.isDisplayed()&& accountStopChkbox.isDisplayed()
   		 && accountSaveRevisionChkbox.isDisplayed()&& accountSetDefaultTreeChkbox.isDisplayed()&& accountModiferChkbox.isDisplayed()&& accountEditTreeChkbox.isDisplayed()&& accountAutorizationInfoChkbox.isDisplayed()
   		 && accountAlternateChkbox.isDisplayed()&& accountRelatedChkbox.isDisplayed()&& accountOpenCloseChkbox.isDisplayed()&& accountCLoseProductChkbox.isDisplayed()&& accountAdvanceMasterImportAndExportChkbox.isDisplayed()
   		 && accountGeneralChkbox.isDisplayed()) 
	     {
			System.out.println(" Pass: Displyed All the Elements in the Master Department Option");
			excelReader.setCellData(xlfile, "Sheet4", 115, 9, resPass);
			return true;
	} 
    else 
	{
		System.out.println(" Fail: Displyed All the Elements in the Master Department Option");
		excelReader.setCellData(xlfile, "Sheet4", 115, 9, resFail);
		return false;
	}

}




public boolean checkProfileAllDepartmentOptionWithSelectAllOPtion() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	createProfileSelectAllIcon.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
    if (accountAddChkbox.isSelected() && accountEditChkbox.isSelected()&& accountCopyChkbox.isSelected()&& accountSearchChkbox.isSelected()&& accountDeleteChkbox.isSelected()
   		 && accountPrintChkbox.isSelected()&& accountExportChkbox.isSelected()&& accountCustomizeViewChkbox.isSelected()&&accountSortChkbox .isSelected()&& accountMassUpdateChkbox.isSelected()
   		 && accountAuthorizeChkbox.isSelected()&&accountTransferChkbox .isSelected()&& accountPropertiesChkbox.isSelected()&& accountLedgerChkbox.isSelected()&& accountBackTrackChkbox.isSelected()
   		 && accountBudgetsChkbox.isSelected()&& accountHelpChkbox.isSelected()&& accountCreateTreeChkbox.isSelected()&& accountDeleteTreeChkbox.isSelected()&& accountCreateViewChkbox.isSelected()
   		 && accountEditViewChkbox.isSelected()&&accountDeleteViewChkbox .isSelected()&& accountSelectViewChkbox.isSelected()&& accountSelectTreeChkbox.isSelected()&& accountCloneChkbox.isSelected()
   		 && accountAddGroupChkbox.isSelected()&& accountGroupMasterChkbox.isSelected()&& accountSettypeChkbox.isSelected()&& accountDeleteAllChkbox.isSelected()&& accountMoveupChkbox.isSelected()
   		 && accountMOveDownChkbox.isSelected()&& accountCreditMangementChkbox.isSelected()&& accountdepartmentApprooriationChkbox.isSelected() && accountCustomizeTreeChkbox.isSelected()&& accountCustomizeMasterChkbox.isSelected()
   		 && accountCanChangeGroupChkbox.isSelected()&& accountCanNAvigateChkbox.isSelected()&& accountAddInfoPannelChkbox.isSelected()&& accountEditInfoPannelChkbox.isSelected()&& accountViewInfoPannelChkbox.isSelected()
   		 && accountRejectChkbox.isSelected()&& accountImportChkbox.isSelected()&& accountShowHomePageChkbox.isSelected()&& accountDeletInfoPannelChkbox.isSelected()&& accountStopChkbox.isSelected()
   		 && accountSaveRevisionChkbox.isSelected()&& accountSetDefaultTreeChkbox.isSelected()&& accountModiferChkbox.isSelected()&& accountEditTreeChkbox.isSelected()&& accountAutorizationInfoChkbox.isSelected()
   		 && accountAlternateChkbox.isSelected()&& accountRelatedChkbox.isSelected()&& accountOpenCloseChkbox.isSelected()&& accountCLoseProductChkbox.isSelected()&& accountAdvanceMasterImportAndExportChkbox.isSelected()
   		 && accountGeneralChkbox.isSelected()) 
	     {
			System.out.println(" Pass: Displyed All the Elements in the Master Department Option");
			excelReader.setCellData(xlfile, "Sheet4", 116, 9, resPass);
			return true;
	} 
    else 
	{
		System.out.println(" Fail: Displyed All the Elements in the Master Department Option");
		excelReader.setCellData(xlfile, "Sheet4", 116, 9, resFail);
		return false;
	}
}










public boolean checkProfileDepartmentOptionwithSaveBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		 Thread.sleep(2000);
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	     createProfileSaveIcon.click();
	
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile saved Successfully";
			System.out.println(Actdata);
		
	
		 if (Actdata.equalsIgnoreCase(Expdata)) 
		 {
				System.out.println(" Pass: All Accounts Profile is Saved Succesfully and All Options Are enable ");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 117, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  All Accounts Profile is Saved Succesfully and All Options Are enable");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 117, 9, resFail);
				return false;
			}

}




public boolean checkEditProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	 homeMenu.click();
	 
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
	 homeSecurityMenu.click();
	 
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
	createProfileMenu.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("ProfileAllDepartmentOption");
	
	Thread.sleep(2000);
	
	createProfileProfileNameDropdown.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
    createProfileHomeExpandBtn.click();
    
    Thread.sleep(2000);
    
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersExpandBtn));
    mastersExpandBtn.click();
    
    Thread.sleep(2000);
    
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountDepartmentOption));
    accountDepartmentOption.click();
    
    Thread.sleep(2000);
    
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
    if (accountAddChkbox.isSelected() && accountEditChkbox.isSelected() && accountCopyChkbox.isSelected()&& accountSearchChkbox.isSelected() && accountDeleteChkbox.isSelected()
      		 && accountPrintChkbox.isSelected()&& accountExportChkbox.isSelected()&& accountCustomizeViewChkbox.isSelected()&&accountSortChkbox .isSelected()&& accountMassUpdateChkbox.isSelected()
       		 && accountAuthorizeChkbox.isSelected()&&accountTransferChkbox .isSelected()&& accountPropertiesChkbox.isSelected()&& accountLedgerChkbox.isSelected()&& accountBackTrackChkbox.isSelected()
       		 && accountBudgetsChkbox.isSelected()&& accountHelpChkbox.isSelected()&& accountCreateTreeChkbox.isSelected()&& accountDeleteTreeChkbox.isSelected()&& accountCreateViewChkbox.isSelected()
       		 && accountEditViewChkbox.isSelected()&&accountDeleteViewChkbox .isSelected()&& accountSelectViewChkbox.isSelected()&& accountSelectTreeChkbox.isSelected()&& accountCloneChkbox.isSelected()
       		 && accountAddGroupChkbox.isSelected()&& accountGroupMasterChkbox.isSelected()&& accountSettypeChkbox.isSelected()&& accountDeleteAllChkbox.isSelected()&& accountMoveupChkbox.isSelected()
       		 && accountMOveDownChkbox.isSelected()&& accountCreditMangementChkbox.isSelected()&& accountdepartmentApprooriationChkbox.isSelected() && accountCustomizeTreeChkbox.isSelected()&& accountCustomizeMasterChkbox.isSelected()
       		 && accountCanChangeGroupChkbox.isSelected()&& accountCanNAvigateChkbox.isSelected()&& accountAddInfoPannelChkbox.isSelected()&& accountEditInfoPannelChkbox.isSelected()&& accountViewInfoPannelChkbox.isSelected()
       		 && accountRejectChkbox.isSelected()&& accountImportChkbox.isSelected()&& accountShowHomePageChkbox.isSelected()&& accountDeletInfoPannelChkbox.isSelected()&& accountStopChkbox.isSelected()
       		 && accountSaveRevisionChkbox.isSelected()&& accountSetDefaultTreeChkbox.isSelected()&& accountModiferChkbox.isSelected()&& accountEditTreeChkbox.isSelected()&& accountAutorizationInfoChkbox.isSelected()
       		 && accountAlternateChkbox.isSelected()&& accountRelatedChkbox.isSelected()&& accountOpenCloseChkbox.isSelected()&& accountCLoseProductChkbox.isSelected()&& accountAdvanceMasterImportAndExportChkbox.isSelected()
       		 && accountGeneralChkbox.isSelected()) 
    {
    	Thread.sleep(2000);
    	
    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileUnSelectAllIcon));
    	createProfileUnSelectAllIcon.click();
    	
    	
    	Thread.sleep(2000);
    	
    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
    	accountAddChkbox.click();
    	
    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
    	createProfileSaveIcon.click();
    	
    	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
    		String Actdata=newErrorMessage.getText();
    		String Expdata="Profile Updated Successfully";
    		System.out.println(Actdata);
    		
    		
    	   if (Actdata.equalsIgnoreCase(Expdata)) {
    			System.out.println("  Pass:  Allow to unselect All Options  in Department profile and Selected Only Add Chkbox");
    			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
    			newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 118, 9, resPass);
    			return true;
    		} 
    		else 
    		{
    			System.out.println("Fail:   Allow to unselect All Options  in Department profile and Selected Only Add Chkbox");
    			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
    			newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 118, 9, resFail);
    			return false;
    		}
	} 
    else 
    {
    	System.out.println(" Fail: Allow to select the Profile AllDepartmentProfile and display all options in the Department");
		excelReader.setCellData(xlfile, "Sheet4", 118, 9, resFail);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
		newErrorMessageCloseBtn.click();
		return false;
	}

	
}


	  
public boolean checkDeleteProfileSalesAccessAPIProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	 
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
	homeSecurityMenu.click();
	 
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
	createProfileMenu.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));

	createProfileProfileNameDropdown.sendKeys("SalesAccessAPIProfile");
	
	Thread.sleep(2000);
	
	createProfileProfileNameDropdown.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);

	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileDeleteIcon));
    createProfileDeleteIcon.click();
    
	Thread.sleep(5000);
	
    String message= getDriver().switchTo().alert().getText();
   
    System.out.println(" Delete Pop Message"     +message);
     
    String exp,act;
    
    act=getDriver().switchTo().alert().getText();
    exp="are you sure that you want to delete Profile";
    
    
    if (act.equalsIgnoreCase(exp)) 
	   {
			System.out.println(" Pass: displayed message as Are you Sure want to Delete with Yes and No buttons");
			excelReader.setCellData(xlfile, "Sheet4", 119, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  displayed message as Are you Sure want to Delete with Yes and No buttons");
			excelReader.setCellData(xlfile, "Sheet4", 119, 9, resFail);
			return false;
		}
    
}

public boolean  checkNoOptioninDeletePopMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	
	getDriver().switchTo().alert().dismiss();
	
	Thread.sleep(3000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	
	if (createProfileProfileNameDropdown.isDisplayed())
	{
		 System.out.println(" Pass: SalesAccessAPIProfile is Not Deleted Successfully");
			excelReader.setCellData(xlfile, "Sheet4", 120, 9, resPass);
		 return true;
	} 
	else 
	{
		 System.out.println(" Fail: SalesAccessAPIProfile is Not Deleted Successfully");
			excelReader.setCellData(xlfile, "Sheet4", 120, 9, resFail);
		 return false;
	}
	
	
	
}
	
	
	
	public boolean SelectagainandClickonDeleteProfileButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
         Thread.sleep(2000);
         
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileDeleteIcon));
        createProfileDeleteIcon.click();
        
        Thread.sleep(2000);
        
       String message= getDriver().switchTo().alert().getText();
       
        System.out.println(" Delete Pop Message"  +message);
        
        String exp,act;
        
        act=getDriver().switchTo().alert().getText();
        exp="are you sure that you want to delete Profile";
        
        
        if (act.equalsIgnoreCase(exp)) 
		   {
				System.out.println(" Pass: displayed message as Are you Sure want to Delete ");
				excelReader.setCellData(xlfile, "Sheet4", 121, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  displayed message as Are you Sure want to Delete ");
				excelReader.setCellData(xlfile, "Sheet4", 121, 9, resFail);
				return false;
			}
	}
	
	
	
	
	public boolean checkYesOptioninDeletePopMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 getDriver().switchTo().alert().accept();
		 
		 Thread.sleep(2000);
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Profile deleted Successfully";
			System.out.println(Actdata);
			
			
		   if (Actdata.equalsIgnoreCase(Expdata)) 
		   {
				System.out.println(" Pass: SalesAccessAPIProfile is Deleted Successfully");
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			    newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 122, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail: SalesAccessAPIProfile is Deleted Successfull");
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
				    newErrorMessageCloseBtn.click();
					excelReader.setCellData(xlfile, "Sheet4", 122, 9, resFail);
				return false;
			}
	}
	


	

public boolean checkLoadFrom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	
	Thread.sleep(3000);
	
	createProfileProfileNameDropdown.sendKeys("ProfileLoadFrom");
	
	    Thread.sleep(2000);
	    
	    createProfileProfileNameDropdown.sendKeys(Keys.TAB);
	    
	    Thread.sleep(2000);
	    
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoadFormIcon));
	     createUserLoadFormIcon.click();
	     
	     Thread.sleep(3000);
	     
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadFromLabel));
	     
	     if (loadFromLabel.isDisplayed() && loadOkBtn.isDisplayed() && loadCancelBtn.isDisplayed() && loadSearchTxt.isDisplayed()
	    		 && avaliableAllProfile.isDisplayed() && avaliableProfilePurchaseProfile.isDisplayed() && avaliableProfileSalesOrderProfile.isDisplayed() 
	    		 && avaliableProfileSaleAccessProfile.isDisplayed() && avaliableProfileSaleAddProfile.isDisplayed() && avaliableProfileSaleEditProfile.isDisplayed() 
	    		 &&avaliableProfileSaleDeleteProfile.isDisplayed() && avaliableProfileSalePrintProfile.isDisplayed() && avaliableProfileSaleRePrintProfile.isDisplayed()
	    		 && avaliableProfileSalesPrintUnAuthorizeProfile.isDisplayed() && avaliableProfileSalesEditMiscProfile.isDisplayed() && avaliableProfileSalesAlwaysSuspendingProfile.isDisplayed() 
	    		 && avaliableProfileSalesChangePrintLayoutProfile.isDisplayed() && avaliableProfileSalesAuthorizeProfile.isDisplayed() && avaliableProfileSalesHomePageProfile.isDisplayed() 
	    		 && avaliableProfileSalesStopProfile.isDisplayed() && avaliableProfileSalesViewDocumentsEnterByOther.isDisplayed() && avaliableProfileFAReportsAllOptions.isDisplayed() && avaliableProfileLedgerProfile.isDisplayed() && avaliableProfileSLAcessProfile.isDisplayed() && avaliableProfileSLSearchProfile.isDisplayed()
	    		 && avaliableProfileSLPrintProfile.isDisplayed()  && avaliableProfileAllMasterProfile.isDisplayed() && avaliableProfileAllProductProfile.isDisplayed() && avaliableProfileProfileEditProduct.isDisplayed()
	    		 && avaliableProfileProfileCopyProduct.isDisplayed() && avaliableProfileProfileSearchProduct.isDisplayed() && avaliableProfileProfileAllAcountsOption.isDisplayed() && avaliableProfileProfileAllDepartmentOption.isDisplayed() ) 
	     {
			System.out.println(" Pass: Dipalyed All Option In Load From ");
			excelReader.setCellData(xlfile, "Sheet4", 123, 9, resPass);
			return true;
		}
	     else 
	     {
			System.out.println(" Fail:Dipalyed All Option In Load From ");
			excelReader.setCellData(xlfile, "Sheet4", 123, 9, resFail);
			return false;
		}
	
	
}




@FindBy(xpath="//span[contains(text(),'AllProductProfile')]")
private static WebElement loadFromAllProductProfile;

@FindBy(xpath="//span[contains(text(),'All Profile')]")
private static WebElement loadFromAllProfile;





public boolean checkLoadFromScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	if (loadFromAllProductProfile.isDisplayed() && loadFromAllProfile.isDisplayed() ) 
	{
	    System.out.println(" Pass: Dispalyed All the Profiles in Load From Screen ");	
		excelReader.setCellData(xlfile, "Sheet4", 124, 9, resPass);
	    return true;
	} 
	else 
	{
	    System.out.println(" Fail: Dispalyed All the Profiles in Load From Screen ");
		excelReader.setCellData(xlfile, "Sheet4", 124, 9, resFail);
	    return false;
	}
}

public boolean checkSearchinLoadFrom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadSearchTxt));
	loadSearchTxt.sendKeys("AllProductProfile");
	
	if (loadFromAllProductProfile.isDisplayed()) 
	{
		System.out.println(" Pass:  All Product Profile is Highlighted ");
		excelReader.setCellData(xlfile, "Sheet4", 125, 9, resPass);
		return true;
		
	}
	else 
	{
       System.out.println(" Fail : All Product Profile is Highlighted");
		excelReader.setCellData(xlfile, "Sheet4", 125, 9, resFail);
       return false;
	}
}


public boolean checkCanceloptioninLoadFrom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadCancelBtn));
	loadCancelBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	
	if (createProfileProfileNameDropdown.isDisplayed())
	{
		 System.out.println(" Pass: Cancel Option in Load From");
			excelReader.setCellData(xlfile, "Sheet4", 126, 9, resPass);
		 return true;
	} 
	else 
	{
		 System.out.println(" Fail: Cancel Option in Load From");
			excelReader.setCellData(xlfile, "Sheet4", 126, 9, resFail);
		 return false;
	}
}




public boolean checkSaveoptioninLoadFrom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	createProfileSaveIcon.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Provide some Permissions and Save";
	System.out.println(Actdata);
	
	
   if (Actdata.equalsIgnoreCase(Expdata)) {
		System.out.println("  Pass:  Not Allow to select save option without selecting profile in LoadFrom");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 127, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:  Not Allow to select save option without selecting profile in LoadFrom");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 127, 9, resFail);
		return false;
	}
}



@FindBy(xpath="//h4[contains(text(),'Load From')]")
private static WebElement loadFromLabel;


@FindBy(xpath="//input[@id='searchLoadPrfletxtBox']")
private static WebElement loadSearchTxt;

@FindBy(xpath="//button[@class='Fbutton'][contains(text(),'Ok')]")
private static WebElement loadOkBtn;

@FindBy(xpath="//button[@class='Fbutton'][contains(text(),'Cancel')]")
private static WebElement loadCancelBtn;




public boolean checkSelecttheAllProductProfilefromtheLoadFromScreenandclickonOk() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoadFormIcon));
    createUserLoadFormIcon.click();
     
    Thread.sleep(2000);
 	
 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadSearchTxt));
 	loadSearchTxt.sendKeys("All");
 	
 	Thread.sleep(2000);
 	
 	avaliableProfileAllProductProfile.click();
 	
 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadOkBtn));
 	loadOkBtn.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
    createProfileSaveIcon.click();
        
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Profile saved Successfully";
		System.out.println(Actdata);
		
		
	   if (Actdata.equalsIgnoreCase(Expdata)) 
	   {
			System.out.println("  Pass:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 128, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 128, 9, resFail);
			return false;
		}
  }







	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Auto Sales Order')]")
	private static WebElement salesOrderTypeAutoSalesOrder;
	
	//Checking the Sales Order Type Voucher Creation is displaying or not
	public boolean checkNewVoucherDisplay() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		 
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();
		 
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
		createProfileMenu.click();
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
		createProfileProfileNameDropdown.clear();
		createProfileProfileNameDropdown.sendKeys("Sales Order AutoAddPrintAuthorize");
	
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
	    createProfileInventoryExpandBtn.click();
		
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		
		Thread.sleep(2000);
		
		if(salesOrderTypeAutoSalesOrder.isDisplayed())
		{
		
		salesOrderTypeAutoSalesOrder.click();
		
		Thread.sleep(3000);
		
		if(accessChkBox.isDisplayed() && addChkBox.isDisplayed() && editChkBox.isDisplayed() && deleteChkBox.isDisplayed()
				&& printChkBox.isDisplayed() && reprintChkBox.isDisplayed() && printBarCodeChkBox.isDisplayed()
				&& printUnAuthoDocumentsChkBox.isDisplayed() && exportChkBox.isDisplayed() && editDocEnteredByOthersChkBox.isDisplayed()
				&& editDocThatareCheckedChkBox.isDisplayed() && editReconciledDocsChkBox.isDisplayed() && editDocAuthByHigherUpsChkBox.isDisplayed()
				&& enterDocThatExceedLimitChkBox.isDisplayed() && enterDocThatMakeCashORBankBalanceNegativeChkBox.isDisplayed()
				&& editDocsThatAreRePrintedChkBox.isDisplayed() && accessThroughAPIChkBox.isDisplayed() && alwaysSuspendOnSavingChkBox.isDisplayed()
				&& changePrintLayoutChkBox.isDisplayed() && authorizeChkBox.isDisplayed() && rejectChkBox.isDisplayed() 
				&& showhomePageChkBox.isDisplayed() && stopChkBox.isDisplayed() && modifySettingsChkBox.isDisplayed()
				&& viewDocEnteredByOthersChkBox.isDisplayed() && closeLinksChkBox.isDisplayed() && saveRevisionChkBox.isDisplayed()
				&& showPostingDetailsChkBox.isDisplayed() && suspendChkBox.isDisplayed() && editExportedDocsChkBox.isDisplayed()
				&& editImportedDocsChkBox.isDisplayed() && hideMenuChkBox.isDisplayed() && amendChkBox.isDisplayed()
				&& customizeLinkChkBox.isDisplayed() && filterHomePageChkBox.isDisplayed() && addToStockChkBox.isDisplayed()
				&& reverseEntryChkBox.isDisplayed() && customizeInfoPanelChkBox.isDisplayed() && raiseChequeReturnChkBox.isDisplayed()) 
		
		System.out.println("  Pass:  User Created Voucher Auto Sales Order is display");
		excelReader.setCellData(xlfile, "Sheet4", 130, 9, resPass);
		return true;
		
		
	
	}
	else
	{
		System.out.println("  Pass:  User Created Voucher Auto Sales Order is not display");
		excelReader.setCellData(xlfile, "Sheet4", 130, 9, resFail);
		return true;
	}
	
}

public boolean checkNewVoucherSaveRestrictionWithMoreLengthsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accessChkBox));
	accessChkBox.click();
	
   
    
	if (accessChkBox.isSelected() )
	{
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	    createProfileSaveIcon.click();
	       
		 
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Profile Name length should be less that 30 characters";
		System.out.println(Actdata);
		
		
	  if (Actdata.equalsIgnoreCase(Expdata)) {
			System.out.println("  Pass:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 131, 9, resPass);

			return true;
		} 
	
		else 
		{
			System.out.println("Fail:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 131, 9, resFail);
			return false;
		}
	}
	else
	{
		System.out.println("Fail:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 131, 9, resFail);
		return false;
	}
	
}



public boolean checkNewVoucherSaveRestrictionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	Thread.sleep(2000);
    
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameDropdown));
	createProfileProfileNameDropdown.clear();
	createProfileProfileNameDropdown.sendKeys("SOAutoAddPrintAuthorize");

    Thread.sleep(3000);
    
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrderTypeAutoSalesOrder));
    salesOrderTypeAutoSalesOrder.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accessChkBox));
	accessChkBox.click();
	
    Thread.sleep(2000);
    
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addChkBox));
    addChkBox.click();
	
    Thread.sleep(2000);
    
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(printChkBox));
	printChkBox.click();

    Thread.sleep(2000);
    
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveRevisionChkBox));
    saveRevisionChkBox.click();

    Thread.sleep(2000);
    
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(modifySettingsChkBox));
	modifySettingsChkBox.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeChkBox));
	authorizeChkBox.click();
	
	Thread.sleep(2000);
    
	if (accessChkBox.isSelected() && addChkBox.isSelected() && printChkBox.isSelected() && saveRevisionChkBox.isSelected() && modifySettingsChkBox.isSelected() 
			&& authorizeChkBox.isSelected())
    
	
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
	    createProfileSaveIcon.click();
	       
		 
	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Profile saved Successfully";
		System.out.println(Actdata);
		
		
	  if (Actdata.equalsIgnoreCase(Expdata)) {
			System.out.println("  Pass:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 132, 9, resPass);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCloseIcon));
			createProfileCloseIcon.click();
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 132, 9, resFail);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCloseIcon));
			createProfileCloseIcon.click();
			return false;
		}
	

	
}





public boolean checkCLoseinCreateProfileScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCloseIcon));
	createProfileCloseIcon.click();
	
	if (labelDashboard.isDisplayed() &&
			 selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() &&
			 dashboardCustomizationSettings.isDisplayed()) 
	{
		System.out.println(" Pass: Create Profile Screen closed Succesfully");
		excelReader.setCellData(xlfile, "Sheet4", 129, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println(" Fail: Create Profile Screen closed Succesfully");
		excelReader.setCellData(xlfile, "Sheet4", 129, 9, resFail);
		return false;

	}
}



	  
	//Create Profile Stops
	
	
	//Create Role Starts


	@FindBy(xpath="//a[@id='2']//span[contains(text(),'Company')]")
	private static WebElement  companymenu;
	
	@FindBy(xpath="//span[contains(text(),'Security')]")
	private static WebElement securitymenu ;
	
	@FindBy(xpath="//a[@id='1000']//span[contains(text(),'Masters')]")
	private static WebElement masterMenu ;
	
	@FindBy(xpath="//span[contains(text(),'Data Management')]")
	private static WebElement  datamanagementMenu;
	
	@FindBy(xpath="//a[@id='20']//span[contains(text(),'Utilities')]")
	private static WebElement  utilitiesmenu;

	  
	
	
	public boolean checkOpenCreateRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
      homeMenu.click();

	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(securitymenu));
	  securitymenu.click();
		
	  Thread.sleep(2000);
		 
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMenu));
	  createRoleMenu.click();
		
	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
		 
	  if (createRoleRoleNameDropdown.isDisplayed() && createRolePasswordPolicyDropdown.isDisplayed()
				&&assignedProfilesTab.isDisplayed() && exclusionsTab.isDisplayed() && restrictionforEntryTab.isDisplayed()
				&& restrictionforTreesTab.isDisplayed() && transactionRightsTab.isDisplayed() && AIRightsTab.isDisplayed()
				&& createRoleLabel.isDisplayed() && createRoleSaveicon.isDisplayed() && createRoleCloseIcon.isDisplayed()) 
		{
		  System.out.println(" Pass : Dispalyed Create Role Screen Successfully");
		  excelReader.setCellData(xlfile, "Sheet4", 138, 9, resPass);
		  return true;
		} 
		else 
		{
			System.out.println(" Fail : Dispalyed Create Role Screen Successfully");
			excelReader.setCellData(xlfile, "Sheet4", 138, 9, resPass);
		 return false;
		}
	}

	
	
	@FindBy(xpath="//span[contains(text(),'Network Policy')]")
	private static WebElement networkPolicyMenu;
	
	
	@FindBy(xpath="//span[contains(text(),'Password policy')]")
	private static WebElement passwordPolicyMenu;
	
	@FindBy(xpath="//span[contains(text(),'Create Role')]")
	private static WebElement createRoleMenu;
	
	@FindBy(xpath="//a[@id='12']//span[contains(text(),'Change Password')]")
	private static WebElement changePasswordMenu;

	@FindBy(xpath="//span[contains(text(),'Update Personal Info')]")
	private static WebElement updatePersoanalInfo;
	
	@FindBy(xpath="//span[contains(text(),'Usage Log')]")
	private static WebElement usageLogMenu;
	
	@FindBy(xpath="//span[contains(text(),'Currently Logged Users')]")
	private static WebElement currentlyLoggedUsersMenu;
	
	@FindBy(xpath="//span[contains(text(),'User rights report')]")
	private static WebElement userRightsReportsMenu;
	
	
	@FindBy(xpath="//span[contains(text(),'Role rights report')]")
	private static WebElement roleRightsREports;
	
	@FindBy(xpath="//span[contains(text(),'Profile rights report')]")
	private static WebElement profileRightsReportsMenu;
	
	@FindBy(xpath="//a[contains(text(),'Assigned Profiles')]")
	private static WebElement  assignedProfilesTab;

	@FindBy(xpath="//a[contains(text(),'Additions')]")
	private static WebElement  additionTab;

	@FindBy(xpath="//a[contains(text(),'Exclusions')]")
	private static WebElement  exclusionsTab;

	@FindBy(xpath="//a[contains(text(),'Restriction for entry')]")
	private static WebElement  restrictionforEntryTab;

	@FindBy(xpath="//a[contains(text(),'Restriction for trees')]")
	private static WebElement  restrictionforTreesTab;

	@FindBy(xpath="//a[contains(text(),'Transaction Rights')]")
	private static WebElement  transactionRightsTab;

	@FindBy(xpath="//a[contains(text(),'AI Rights')]")
	private static WebElement  AIRightsTab;
	

	public boolean checkSaveButtonWithBlank() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	     
		Thread.sleep(2000);
	
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
	     createRoleSaveicon.click();
	
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		 String Actdata=newErrorMessage.getText();
		 String Expdata="Please specify a role name to save";
		 System.out.println(Actdata);
		
		
	   if (Actdata.equalsIgnoreCase(Expdata)) 
	   {
			System.out.println("  Pass:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 139, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 139, 9, resFail);
			return false;
		}
	}


	public boolean checkCreateRoleTabs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 Thread.sleep(2000);
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(assignedProfilesTab));
		 
		if (assignedProfilesTab.isDisplayed() && exclusionsTab.isDisplayed() && restrictionforEntryTab.isDisplayed()
				&& restrictionforTreesTab.isDisplayed() && transactionRightsTab.isDisplayed() && AIRightsTab.isDisplayed()) 
		{
			System.out.println(" Pass: All the Role Tabs are Displayed");
			excelReader.setCellData(xlfile, "Sheet4", 140, 9, resPass);
			return true;
			
		}
		else 
		{
			System.out.println(" Fail: All the Role Tabs are Displayed");
			excelReader.setCellData(xlfile, "Sheet4", 140, 9, resPass);
			return false;
		}
	
	}
	
	
	@FindBy(xpath="//ul[@id='availableProfiles']")
	private static WebElement  availableProfilesArea;
	
	@FindBy(xpath="//ul[@id='assignedProfiles']")
	private static WebElement  assignedProfilesArea;


	public boolean checkAssignedProfilesTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	    Thread.sleep(2000);
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
	  
		if (createRoleRoleNameDropdown.isDisplayed() && createRolePasswordPolicyDropdown.isDisplayed()
				 && availableProfilesArea.isDisplayed() && assignedProfilesArea.isDisplayed()) 
		{
		  System.out.println(" Pass : Dispalyed Assigned Profiles Tab Successfully");
		  excelReader.setCellData(xlfile, "Sheet4", 141, 9, resPass);
		  return true;
		} 
		else 
		{
		  System.out.println(" Fail : Dispalyed Assigned Profiles Tab Successfully");
		  excelReader.setCellData(xlfile, "Sheet4", 141, 9, resFail);
		  return false;
		}
     }


	public boolean checkPasswordPolicyintheAssignedProfileTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	    Thread.sleep(3000);
	    
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
	    createRolePasswordPolicyDropdown.click();
	 
			Select pw=new Select(createRolePasswordPolicyDropdown);
			
			int act=pw.getOptions().size();
			int exp=9;
					
			
			if (act==exp) 
			{
			   System.out.println(" Pass:  Displayed All the PolicyPassword fields ");
			   
			   System.out.println("  Number of  PasswordPolicy DropDown Fileds "  + act  );
			   
				   for (int i = 0; i <=8 ; i++) 
				   {
					String s=pw.getOptions().get(i).getText();
					
					System.out.println(s);
				   }
			   
			   excelReader.setCellData(xlfile, "Sheet4", 142, 9, resPass);
			   return true;
			   
			}
			else 
			{
				   System.out.println(" Fail:  Displayed All the PolicyPassword fields ");
				   System.out.println(" PasswordPolicy DropDown Fileds "  + act);
				   excelReader.setCellData(xlfile, "Sheet4", 142, 9, resFail);
				   return false;
			}
	
	   }




	public boolean checkAvailableProfilesArea() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		Thread.sleep(2000);
		
		if (avaliableAllProfile.isDisplayed() && avaliableProfilePurchaseProfile.isDisplayed() && avaliableProfileSalesOrderProfile.isDisplayed() 
	   		 && avaliableProfileSaleAccessProfile.isDisplayed() && avaliableProfileSaleAddProfile.isDisplayed() && avaliableProfileSaleEditProfile.isDisplayed() 
	   		 &&avaliableProfileSaleDeleteProfile.isDisplayed() && avaliableProfileSalePrintProfile.isDisplayed() && avaliableProfileSaleRePrintProfile.isDisplayed()
	   		 && avaliableProfileSalesPrintUnAuthorizeProfile.isDisplayed() && avaliableProfileSalesEditMiscProfile.isDisplayed() && avaliableProfileSalesAlwaysSuspendingProfile.isDisplayed() 
	   		 && avaliableProfileSalesChangePrintLayoutProfile.isDisplayed() && avaliableProfileSalesAuthorizeProfile.isDisplayed() && avaliableProfileSalesHomePageProfile.isDisplayed() 
	   		 && avaliableProfileSalesStopProfile.isDisplayed() && avaliableProfileSalesViewDocumentsEnterByOther.isDisplayed() && avaliableProfileFAReportsAllOptions.isDisplayed() && avaliableProfileLedgerProfile.isDisplayed() && avaliableProfileSLAcessProfile.isDisplayed() && avaliableProfileSLSearchProfile.isDisplayed()
	   		 && avaliableProfileSLPrintProfile.isDisplayed()  && avaliableProfileAllMasterProfile.isDisplayed() && avaliableProfileAllProductProfile.isDisplayed() && avaliableProfileProfileEditProduct.isDisplayed()
	   		 && avaliableProfileProfileCopyProduct.isDisplayed() && avaliableProfileProfileSearchProduct.isDisplayed() && avaliableProfileProfileAllAcountsOption.isDisplayed() && avaliableProfileProfileAllDepartmentOption.isDisplayed()) 
		{
			System.out.println(" Pass : Displayed all the Profiled in Avaliable Profiles Area ");
			excelReader.setCellData(xlfile, "Sheet4", 143, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Fail : Displayed all the Profiled in Avaliable Profiles Area ");
			excelReader.setCellData(xlfile, "Sheet4", 143, 9, resFail);
			return false;
		}
	}




@FindBy(xpath="//*[contains(text(),'All Profile')]")
private static WebElement avaliableAllProfile ;

@FindBy(xpath="//*[contains(text(),'Purchase Profile')]")
private static WebElement avaliableProfilePurchaseProfile ;

@FindBy(xpath="//*[contains(text(),'SalesOrderProfile')]")
private static WebElement avaliableProfileSalesOrderProfile ;

@FindBy(xpath="//*[contains(text(),'SaleAccessProfile')]")
private static WebElement avaliableProfileSaleAccessProfile ;

@FindBy(xpath="//*[contains(text(),'SaleAddProfile')]")
private static WebElement avaliableProfileSaleAddProfile ;

@FindBy(xpath="//*[contains(text(),'SaleEditProfile')]")
private static WebElement avaliableProfileSaleEditProfile ;

@FindBy(xpath="//*[contains(text(),'SaleDeleteProfile')]")
private static WebElement avaliableProfileSaleDeleteProfile ;

@FindBy(xpath="//*[contains(text(),'SalePrintProfile')]")
private static WebElement avaliableProfileSalePrintProfile ;

@FindBy(xpath="//*[contains(text(),'SaleRePrintProfile')]")
private static WebElement avaliableProfileSaleRePrintProfile ;

@FindBy(xpath="//*[contains(text(),'SalesPrintUnAuthorizeProfile')]")
private static WebElement avaliableProfileSalesPrintUnAuthorizeProfile ;

@FindBy(xpath="//*[contains(text(),'SalesEditMiscProfile')]")
private static WebElement avaliableProfileSalesEditMiscProfile ;

@FindBy(xpath="//*[contains(text(),'SalesAlwaysSuspendingProfile')]")
private static WebElement avaliableProfileSalesAlwaysSuspendingProfile ;

@FindBy(xpath="//*[contains(text(),'SalesChangePrintLayoutProfile')]")
private static WebElement avaliableProfileSalesChangePrintLayoutProfile ;

@FindBy(xpath="//*[contains(text(),'SalesAuthorizeProfile')]")
private static WebElement avaliableProfileSalesAuthorizeProfile ;

@FindBy(xpath="//*[contains(text(),'SalesRejectProfile')]")
private static WebElement avaliableProfileSalesRejectProfile ;

@FindBy(xpath="//*[contains(text(),'SalesHomePageProfile')]")
private static WebElement avaliableProfileSalesHomePageProfile ;

@FindBy(xpath="//*[contains(text(),'SalesStopProfile')]")
private static WebElement avaliableProfileSalesStopProfile ;

@FindBy(xpath="//*[contains(text(),'SalesModifySettingsProfile')]")
private static WebElement avaliableProfileSalesModifySettingsProfile ;

@FindBy(xpath="//*[contains(text(),'SalesViewDocumentsEnterByOther')]")
private static WebElement avaliableProfileSalesViewDocumentsEnterByOther ;

@FindBy(xpath="//*[contains(text(),'SalesCloseLinkProfile')]")
private static WebElement avaliableProfileSalesCloseLinkProfile ;

@FindBy(xpath="//*[contains(text(),'SalesSaveRevisionProfile')]")
private static WebElement avaliableProfileSalesSaveRevisionProfile ;

@FindBy(xpath="//*[contains(text(),'SalesSuspendProfile')]")
private static WebElement avaliableProfileSalesSuspendProfile ;

@FindBy(xpath="//*[contains(text(),'EditExportedSyncDocProfile')]")
private static WebElement avaliableProfileEditExportedSyncDocProfile ;

@FindBy(xpath="//*[contains(text(),'EditImportedSyncDocProfile')]")
private static WebElement avaliableProfileEditImportedSyncDocProfile ;

@FindBy(xpath="//*[contains(text(),'SaleHideProfile')]")
private static WebElement avaliableProfileSaleHideProfile ;

@FindBy(xpath="//*[contains(text(),'FAReportsAllOptions')]")
private static WebElement avaliableProfileFAReportsAllOptions ;

@FindBy(xpath="//*[contains(text(),'LedgerProfile')]")
private static WebElement avaliableProfileLedgerProfile ;

@FindBy(xpath="//*[contains(text(),'SLAcessProfile')]")
private static WebElement avaliableProfileSLAcessProfile ;

@FindBy(xpath="//*[contains(text(),'SLSearchProfile')]")
private static WebElement avaliableProfileSLSearchProfile ;

@FindBy(xpath="//*[contains(text(),'SLPrintProfile')]")
private static WebElement avaliableProfileSLPrintProfile ;

@FindBy(xpath="//*[contains(text(),'SLViewProfile')]")
private static WebElement avaliableProfileSLViewProfile ;

@FindBy(xpath="//*[contains(text(),'SLExportProfile')]")
private static WebElement avaliableProfileSLExportProfile ;

@FindBy(xpath="//*[contains(text(),'SLEmailProfile')]")
private static WebElement avaliableProfileSLEmailProfile ;

@FindBy(xpath="//*[contains(text(),'SLViewGraphProfile')]")
private static WebElement avaliableProfileSLViewGraphProfile ;

@FindBy(xpath="//*[contains(text(),'SLFilterProfile')]")
private static WebElement avaliableProfileSLFilterProfile ;

@FindBy(xpath="//*[contains(text(),'SLAnalyzeProfile')]")
private static WebElement avaliableProfileSLAnalyzeProfile ;

@FindBy(xpath="//*[contains(text(),'SLCrossReferenceProfile')]")
private static WebElement avaliableProfileSLCrossReferenceProfile ;

@FindBy(xpath="//*[contains(text(),'SLAddAnalyzeProfile')]")
private static WebElement avaliableProfileSLAddAnalyzeProfile ;

@FindBy(xpath="//*[contains(text(),'AllMasterProfile')]")
private static WebElement avaliableProfileAllMasterProfile ;

@FindBy(xpath="//*[contains(text(),'AllProductProfile')]")
private static WebElement avaliableProfileAllProductProfile ;

@FindBy(xpath="//*[contains(text(),'ProfileAddProduct')]")
private static WebElement avaliableProfileProfileAddProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileEditProduct')]")
private static WebElement avaliableProfileProfileEditProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileCopyProduct')]")
private static WebElement avaliableProfileProfileCopyProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileSearchProduct')]")
private static WebElement avaliableProfileProfileSearchProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileDeleteProduct')]")
private static WebElement avaliableProfileProfileDeleteProduct ;

@FindBy(xpath="//*[contains(text(),'ProfilePrintProduct')]")
private static WebElement avaliableProfileProfilePrintProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileExportProduct')]")
private static WebElement avaliableProfileProfileExportProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileCustomizeViewProduct')]")
private static WebElement avaliableProfileProfileCustomizeViewProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileSortProduct')]")
private static WebElement avaliableProfileProfileSortProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileMassUpdateProduct')]")
private static WebElement avaliableProfileProfileMassUpdateProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileAuthorizeProduct')]")
private static WebElement avaliableProfileProfileAuthorizeProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileTransferProduct')]")
private static WebElement avaliableProfileProfileTransferProduct ;

@FindBy(xpath="//*[contains(text(),'ProfilePropertiesProduct')]")
private static WebElement avaliableProfileProfilePropertiesProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileLedgerProduct')]")
private static WebElement avaliableProfileProfileLedgerProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileBackTrackProduct')]")
private static WebElement avaliableProfileProfileBackTrackProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileBudgetsProduct')]")
private static WebElement avaliableProfileProfileBudgetsProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileHelpProduct')]")
private static WebElement avaliableProfileProfileHelpProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileCreateTreeProduct')]")
private static WebElement avaliableProfileProfileCreateTreeProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileDeleteTreeProduct')]")
private static WebElement avaliableProfileProfileDeleteTreeProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileCreateViewProduct')]")
private static WebElement avaliableProfileProfileCreateViewProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileEditViewProduct')]")
private static WebElement avaliableProfileProfileEditViewProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileDeleteViewProduct')]")
private static WebElement avaliableProfileProfileDeleteViewProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileSelectViewProduct')]")
private static WebElement avaliableProfileProfileSelectViewProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileSelectTreeProduct')]")
private static WebElement avaliableProfileProfileSelectTreeProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileCloneProduct')]")
private static WebElement avaliableProfileProfileCloneProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileAddGroupProduct')]")
private static WebElement avaliableProfileProfileAddGroupProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileGroupMasterProduct')]")
private static WebElement avaliableProfileProfileGroupMasterProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileSetTypeProduct')]")
private static WebElement avaliableProfileProfileSetTypeProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileDeleteAllProduct')]")
private static WebElement avaliableProfileProfileDeleteAllProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileMoveUpProduct')]")
private static WebElement avaliableProfileProfileMoveUpProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileMoveDownProduct')]")
private static WebElement avaliableProfileProfileMoveDownProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileCreditManagementProduct')]")
private static WebElement avaliableProfileProfileCreditManagementProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileDepAppropirationProduct')]")
private static WebElement avaliableProfileProfileDepAppropirationProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileCustomizeTreeProduct')]")
private static WebElement avaliableProfileProfileCustomizeTreeProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileCustomizeMasterProduct')]")
private static WebElement avaliableProfileProfileCustomizeMasterProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileCanChangeGroupProduct')]")
private static WebElement avaliableProfileProfileCanChangeGroupProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileCanNavigateProduct')]")
private static WebElement avaliableProfileProfileCanNavigateProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileAddInfoPanelProduct')]")
private static WebElement avaliableProfileProfileAddInfoPanelProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileEditInfoPanelProduct')]")
private static WebElement avaliableProfileProfileEditInfoPanelProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileViewInfoPanelProduct')]")
private static WebElement avaliableProfileProfileViewInfoPanelProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileRejectProduct')]")
private static WebElement avaliableProfileProfileRejectProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileImportProduct')]")
private static WebElement avaliableProfileProfileImportProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileShowHomePageProduct')]")
private static WebElement avaliableProfileProfileShowHomePageProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileDeleteInfoPanelProduct')]")
private static WebElement avaliableProfileProfileDeleteInfoPanelProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileStopProduct')]")
private static WebElement avaliableProfileProfileStopProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileSaveRevisionProduct')]")
private static WebElement avaliableProfileProfileSaveRevisionProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileSetDeafultTreeProduct')]")
private static WebElement avaliableProfileProfileSetDeafultTreeProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileModifierProduct')]")
private static WebElement avaliableProfileProfileModifierProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileEditTreeProduct')]")
private static WebElement avaliableProfileProfileEditTreeProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileGeneralProduct')]")
private static WebElement avaliableProfileProfileGeneralProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileUnitsProduct')]")
private static WebElement avaliableProfileProfileUnitsProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileSettingsProduct')]")
private static WebElement avaliableProfileProfileSettingsProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileClassificationProduct')]")
private static WebElement avaliableProfileProfileClassificationProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileOtherDetailsProduct')]")
private static WebElement avaliableProfileProfileOtherDetailsProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileReplenishmentProduct')]")
private static WebElement avaliableProfileProfileReplenishmentProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileReorderProduct')]")
private static WebElement avaliableProfileProfileReorderProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileOutletProduct')]")
private static WebElement avaliableProfileProfileOutletProduct ;

@FindBy(xpath="//*[contains(text(),'ProfileAllAcountsOption')]")
private static WebElement avaliableProfileProfileAllAcountsOption ;

@FindBy(xpath="//*[contains(text(),'ProfileAllDepartmentOption')]")
private static WebElement avaliableProfileProfileAllDepartmentOption ;

@FindBy(xpath="//*[contains(text(),'ProfileLoadFrom')]")
private static WebElement avaliableProfileProfileLoadFrom ;

@FindBy(xpath="//span[2]//span[1]")
private static WebElement  createRoleMOveFiledsFromLeftSideToRightSide; 



public boolean  checkClickOnRightArrowIconWithoutSelectProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
	 createRoleMOveFiledsFromLeftSideToRightSide.click();
	 
	 Thread.sleep(2000);
	 
     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 String Actdata=newErrorMessage.getText();
	 String Expdata="Select any profile";
	 System.out.println(Actdata);
	
	 Thread.sleep(2000);
	
    if (Actdata.equalsIgnoreCase(Expdata))
    {
		System.out.println("  Pass:  Right Side Navigatation is Working Succesfully");
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 144, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail: Right Side Navigatation is Working Succesfully");
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 144, 9, resFail);
		return false;
	}
	

}



@FindBy(xpath="//span[3]//span[1]")
private static WebElement createRoleMOveFiledsFromRigheSideToLeftSide;

public boolean  checkClickOnLeftArrowIconWithoutSelectProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromRigheSideToLeftSide));
	createRoleMOveFiledsFromRigheSideToLeftSide.click();
	
	 
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Select any profile";
	System.out.println(Actdata);
	
	
   if (Actdata.equalsIgnoreCase(Expdata)) 
   {
		System.out.println("  Pass:  Left Side Navigatation is Working Succesfully");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 145, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail: Left Side Navigatation is Working Succesfully");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 145, 9, resFail);
		return false;
	}
}




public boolean  checkClickOnRightArrowIconWitSelectProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfile));
	avaliableAllProfile.click();
	
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
	 createRoleMOveFiledsFromLeftSideToRightSide.click();
	
	if (avaliableAllProfile.isDisplayed()) 
	{
		System.out.println(" Pass :  All Profile IS Displayed in Assign New Profiles Area ");
        excelReader.setCellData(xlfile, "Sheet4", 146, 9, resPass);
		return true;
	}
	else
	{
		System.out.println(" Fail :  All Profile IS Displayed in Assigne New Profiles Area ");
		excelReader.setCellData(xlfile, "Sheet4", 146, 9, resFail);
		return false;
	}
}




public boolean  checkClickOnLeftArrowIconWitSelectProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 Thread.sleep(2000);
	
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfile));
	 avaliableAllProfile.click();
	
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromRigheSideToLeftSide));
	 createRoleMOveFiledsFromRigheSideToLeftSide.click();
	
	if (avaliableAllProfile.isDisplayed()) 
	{
		System.out.println(" Pass :  All Profile IS Displayed in Assign New Profiles Area ");
		excelReader.setCellData(xlfile, "Sheet4", 147, 9, resPass);
		return true;
	}
	else
	{
		System.out.println(" Fail :  All Profile IS Displayed in Assigne New Profiles Area ");
		excelReader.setCellData(xlfile, "Sheet4", 147, 9, resFail);
		return false;
	}
	
}







public boolean  checkSavebuttonwithoutselectingPasswordProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
	createRoleRoleNameDropdown.sendKeys("SampleRole");
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
	createRoleSaveicon.click();
	 
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Select a Password Policy for Role";
	System.out.println(Actdata);
	
	
   if (Actdata.equalsIgnoreCase(Expdata)) 
   {
		System.out.println("  Pass:  Save button without selecting Password Profile");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 148, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:  Save button without selecting Password Profile");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 148, 9, resFail);
		return false;
	}
}







public boolean  checkSavebuttonwithoutselectingAssignedProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
	Select s=new Select(createRolePasswordPolicyDropdown);
	s.selectByVisibleText("Numeric");
	
	Thread.sleep(2000);
	
 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
	createRoleSaveicon.click();
	 
	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Assign a profile for the Role";
		System.out.println(Actdata);
		
		
	   if (Actdata.equalsIgnoreCase(Expdata))
	   {
			System.out.println("  Pass:  Save button without selecting Assigned Profile");
			if (newErrorMessage.isDisplayed()) 
			{
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
				newErrorMessageCloseBtn.click();
			}
			
			excelReader.setCellData(xlfile, "Sheet4", 149, 9, resPass);
			return true;

					} 
		else 
		{
			System.out.println("Fail:  Save button without selecting Assigned Profile");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 149, 9, resFail);
			return false;
		}
}



public boolean  checkSavebuttonwithselectingAllabovefields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
	createRoleCloseIcon.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
	homeSecurityMenu.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
	homeSecurityCreateRoleMenu.click();
	
	
	Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
	createRoleRoleNameDropdown.sendKeys("SampleRole1");
	
	Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
	Select s=new Select(createRolePasswordPolicyDropdown);
	s.selectByVisibleText("Numeric");
	
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfile));
	avaliableAllProfile.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
	createRoleMOveFiledsFromLeftSideToRightSide.click();
	 
	Thread.sleep(2000);
	
 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
	createRoleSaveicon.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	String Actdata=newErrorMessage.getText();
	String Expdata="Role saved Successfully";
	System.out.println(Actdata);
	
	
   if (Actdata.equalsIgnoreCase(Expdata)) {
		System.out.println("  Pass:  Save button with selecting Assigned Profile");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 150, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:  Save button with selecting Assigned Profile");
		newErrorMessageCloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet4", 150, 9, resFail);
		return false;
	}
	
}
	


@FindBy(xpath="//div[@id='Additions']//label[@class='Flabel font-4'][contains(text(),'Menu')]")
private static WebElement menuLabel;

@FindBy(xpath="//ul[@id='Addmenu']//a[@id='1']//i[@class='icon-expand']")
private static WebElement  addHomeExpandBtn; 

@FindBy(xpath="//ul[@id='Addmenu']//a[@id='60']//i[@class='icon-expand']")
private static WebElement  addFininicalExpandBtn; 

@FindBy(xpath="//ul[@id='Addmenu']//a[@id='135']//i[@class='icon-expand']")
private static WebElement  addInventoryExpandBtn; 

@FindBy(xpath="//ul[@id='Addmenu']//a[@id='136']//i[@class='icon-expand']")
private static WebElement  addFixedAssestsExpandBtn; 

@FindBy(xpath="//ul[@id='Addmenu']//a[@id='3000']//i[@class='icon-expand']")
private static WebElement  addProductionExpandBtn; 

@FindBy(xpath="//ul[@id='Addmenu']//a[@id='8000']//i[@class='icon-expand']")
private static WebElement  addPointOfSaleExpandBtn; 

@FindBy(xpath="//ul[@id='Addmenu']//a[@id='150']//i[@class='icon-expand']")
private static WebElement  addQualityExpandBtn; 

@FindBy(xpath="//ul[@id='Addmenu']//a[@id='16']//i[@class='icon-expand']")
private static WebElement  addSettingExpandBtn; 

@FindBy(xpath="//li[@class='active']//a[@id='61']//i[@class='icon-expand']")
private static WebElement  addFinTransationExpandBtn;

@FindBy(xpath="//li[@class='active']//a[@id='2007']//i[@class='icon-expand']")
private static WebElement addFinTransationpurchaseExpandBtn;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchases Vouchers')]")
private static WebElement addFinTransPurPurchasesVouchers;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchases Returns')]")
private static WebElement addFinTransPurPurchasesReturns;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchase Vouchers N')]")
private static WebElement addFinTransPurPurchaseVouchersN;

@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2008']")
private static WebElement purAlwaysSuspendChkBox;

@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2008']")
private static WebElement purHideMenuChkbox;

@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement finPurAccessChkbox;

@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement finPurAddChkbox;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement finPurEditChkbox;

@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2008']")
private static WebElement finPurDeleteChkbox;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement finPurPrintChkbox;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement finPurRePrintChkbox;

@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2008']")
private static WebElement finPurPrintBarcodeChkbox;

@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2008']")
private static WebElement finPurPrintUnAuthorizedDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2008']")
private static WebElement finPurExportChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2008']")
private static WebElement finPurEditDocumentsEnteredbyOtherChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2008']")
private static WebElement finPurEditDocumentsThatAreCheckedChkbox;

@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2008']")
private static WebElement finPurEditReconciledDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2008']")
private static WebElement finPurEditDocumentsAuthorizationByHigherUpsChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2008']")
private static WebElement finPurEnterDocumentsThatExceedLimitChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2008']")
private static WebElement finPurChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2008']")
private static WebElement finPurEditDocumentsThatAreRePrintedChkbox;

@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2008']")
private static WebElement finPurAccessThroughAPIChkbox;

@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2008']")
private static WebElement finPurAlwaysSuspendOnSavingChkbox;

@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2008']")
private static WebElement finPurChangePrintLayoutChkbox;

@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
private static WebElement finPurAuthorizeChkbox;

@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='2008']")
private static WebElement finPurRejectChkbox;

@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2008']")
private static WebElement finPurShowHomepageChkbox;

@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2008']")
private static WebElement finPurStopChkbox;

@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2008']")
private static WebElement finPurModifySettingsChkbox;

@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2008']")
private static WebElement finPurViewDocumentEnteredByOthersChkbox;

@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2008']")
private static WebElement finPurCloseLinksChkbox;

@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2008']")
private static WebElement finPurSaveRevisionChkbox;

@FindBy(xpath="//label[contains(text(),'Show Posting Details')]//input[@id='2008']")
private static WebElement finPurShowPostingDetailsChkbox;

@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2008']")
private static WebElement finPurSuspendChkbox;

@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2008']")
private static WebElement finPurEditExportedChkbox;

@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2008']")
private static WebElement finPurEditImportedChkbox;

@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2008']")
private static WebElement finPurHideMenuChkbox;

@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2008']")
private static WebElement finPurAmendChkbox;

@FindBy(xpath="//label[contains(text(),'Customize link')]//input[@id='2008']")
private static WebElement finPurCustomizeLinkChkbox;

@FindBy(xpath="//label[contains(text(),'Filter home page')]//input[@id='2008']")
private static WebElement finPurFilterHomePageChkbox;

@FindBy(xpath="//label[contains(text(),'Add to stock')]//input[@id='2008']")
private static WebElement finPurAddToStockChkbox;

@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2008']")
private static WebElement finPurReverseEntryChkbox;

@FindBy(xpath="//label[contains(text(),'Customize info panel')]//input[@id='2008']")
private static WebElement finPurCustomizeInfoPanelChkbox;

@FindBy(xpath="//label[contains(text(),'Raise Cheque Return')]//input[@id='2008']")
private static WebElement finPurRaiseChequeReturnChkbox;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Request for Quote')]")
private static WebElement addRequestForQuoteOption;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchases Quotations')]")
private static WebElement addPurchaseQuotationOption;

@FindBy(xpath="//li[@class='active']//a[@id='2012']//span[contains(text(),'Purchases Orders')]")
private static WebElement addPurchaseorderOption;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Material Receipt Notes')]")
private static WebElement addMaterialRecepitNotes;

//Request For Quote

@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement reqForQuoteAccessChkbox;


@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement reqForQuoteAddChkbox;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement reqForQuoteEditChkbox;

@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2010']")
private static WebElement reqForQuoteDeleteChkbox;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement reqForQuotePrintChkbox;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement reqForQuoteRePrintChkbox;

@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2010']")
private static WebElement reqForQuotePrintBarcodeChkbox;

@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2010']")
private static WebElement reqForQuotePrintUnAuthorizedDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2010']")
private static WebElement reqForQuoteExportChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2010']")
private static WebElement reqForQuoteEditDocumentsEnteredbyOtherChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2010']")
private static WebElement reqForQuoteEditDocumentsThatAreCheckedChkbox;

@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2010']")
private static WebElement reqForQuoteEditReconciledDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2010']")
private static WebElement reqForQuoteEditDocumentsAuthorizationByHigherUpsChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2010']")
private static WebElement reqForQuoteEnterDocumentsThatExceedLimitChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2010']")
private static WebElement reqForQuoteChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2010']")
private static WebElement reqForQuoteEditDocumentsThatAreRePrintedChkbox;

@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2010']")
private static WebElement reqForQuoteAccessThroughAPIChkbox;

@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2010']")
private static WebElement reqForQuoteAlwaysSuspendOnSavingChkbox;

@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2010']")
private static WebElement reqForQuoteChangePrintLayoutChkbox;

@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
private static WebElement reqForQuoteAuthorizeChkbox;

@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='2010']")
private static WebElement reqForQuoteRejectChkbox;

@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2010']")
private static WebElement reqForQuoteShowHomepageChkbox;

@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2010']")
private static WebElement reqForQuoteStopChkbox;

@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2010']")
private static WebElement reqForQuoteModifySettingsChkbox;

@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2010']")
private static WebElement reqForQuoteViewDocumentEnteredByOthersChkbox;

@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2010']")
private static WebElement reqForQuoteCloseLinksChkbox;

@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2010']")
private static WebElement reqForQuoteSaveRevisionChkbox;

@FindBy(xpath="//label[contains(text(),'Show Posting Details')]//input[@id='2010']")
private static WebElement reqForQuoteShowPostingDetailsChkbox;

@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2010']")
private static WebElement reqForQuoteSuspendChkbox;

@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2010']")
private static WebElement reqForQuoteEditExportedDocChkbox;

@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2010']")
private static WebElement reqForQuoteEditImportedDocChkbox;

@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2010']")
private static WebElement reqForQuoteAmendChkbox;

@FindBy(xpath="//label[contains(text(),'Customize link')]//input[@id='2010']")
private static WebElement reqForQuoteCustomizeLinkChkbox;

@FindBy(xpath="//label[contains(text(),'Filter home page')]//input[@id='2010']")
private static WebElement reqForQuoteFilterHomePageChkbox;

@FindBy(xpath="//label[contains(text(),'Add to stock')]//input[@id='2010']")
private static WebElement reqForQuoteAddToStockChkbox;

@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2010']")
private static WebElement reqForQuoteReverseEntryChkbox;

@FindBy(xpath="//label[contains(text(),'Customize info panel')]//input[@id='2010']")
private static WebElement reqForQuoteCustomizeInfoPanelChkbox;

@FindBy(xpath="//label[contains(text(),'Raise Cheque Return')]//input[@id='2010']")
private static WebElement reqForQuoteRaiseChequeReturnChkbox;

//Purchase Quotations 

@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement purQuotationsAccessChkbox;


@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement purQuotationsAddChkbox;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement purQuotationsEditChkbox;

@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2011']")
private static WebElement purQuotationsDeleteChkbox;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement purQuotationsPrintChkbox;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement purQuotationsRePrintChkbox;

@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2011']")
private static WebElement purQuotationsPrintBarcodeChkbox;

@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2011']")
private static WebElement purQuotationsPrintUnAuthorizedDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2011']")
private static WebElement purQuotationsExportChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2011']")
private static WebElement purQuotationsEditDocumentsEnteredbyOtherChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2011']")
private static WebElement purQuotationsEditDocumentsThatAreCheckedChkbox;

@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2011']")
private static WebElement purQuotationsEditReconciledDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2011']")
private static WebElement purQuotationsEditDocumentsAuthorizationByHigherUpsChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2011']")
private static WebElement purQuotationsEnterDocumentsThatExceedLimitChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2011']")
private static WebElement purQuotationsChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2011']")
private static WebElement purQuotationsEditDocumentsThatAreRePrintedChkbox;

@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2011']")
private static WebElement purQuotationsAccessThroughAPIChkbox;

@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2011']")
private static WebElement purQuotationsHideChkbox;

@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2011']")
private static WebElement purQuotationsChangePrintLayoutChkbox;

@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
private static WebElement purQuotationsAuthorizeChkbox;

@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='2011']")
private static WebElement purQuotationsRejectChkbox;

@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2011']")
private static WebElement purQuotationsShowHomepageChkbox;

@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2011']")
private static WebElement purQuotationsStopChkbox;

@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2011']")
private static WebElement purQuotationsModifySettingsChkbox;

@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2011']")
private static WebElement purQuotationsViewDocumentEnteredByOthersChkbox;

@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2011']")
private static WebElement purQuotationsCloseLinksChkbox;

@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2011']")
private static WebElement purQuotationsSaveRevisionChkbox;

@FindBy(xpath="//label[contains(text(),'Show Posting Details')]//input[@id='2011']")
private static WebElement purQuotationsShowPostingDetailsChkbox;

@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2011']")
private static WebElement purQuotationsSuspendChkbox;

@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2011']")
private static WebElement purQuotationsEditExportedChkbox;

@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2011']")
private static WebElement purQuotationsEditImportedChkbox;

@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2011']")
private static WebElement purQuotationsHideMenuChkbox;

@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2011']")
private static WebElement purQuotationsAmendChkbox;

@FindBy(xpath="//label[contains(text(),'Customize link')]//input[@id='2011']")
private static WebElement purQuotationsCustomizeLinkChkbox;

@FindBy(xpath="//label[contains(text(),'Filter home page')]//input[@id='2011']")
private static WebElement purQuotationsFilterHomePageChkbox;

@FindBy(xpath="//label[contains(text(),'Add to stock')]//input[@id='2011']")
private static WebElement purQuotationsAddToStockChkbox;

@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2011']")
private static WebElement purQuotationsReverseEntryChkbox;

@FindBy(xpath="//label[contains(text(),'Customize info panel')]//input[@id='2011']")
private static WebElement purQuotationsCustomizeInfoPanelChkbox;

@FindBy(xpath="//label[contains(text(),'Raise Cheque Return')]//input[@id='2011']")
private static WebElement purQuotationsRaiseChequeReturnChkbox;


//Purchase Order
@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2012']")
private static WebElement purOrderAlwaysSuspendOnSavingChkbox;

@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2012']")
private static WebElement purOrderHidewMenuChkbox;	

//Material Receipts Notes 
@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2013']")
private static WebElement materialRecpNotesAlwaysSuspendSavingChkbox;

@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2013']")
private static WebElement materialRecpNotesHideMenuChkbox;

@FindBy(xpath="//li[@class='active']//a[@id='137']//i[@class='icon-expand']")
private static WebElement addInventoryTransactionExpansionBtn;

@FindBy(xpath="//ul[@id='Exclmenu']//a[@id='135']//i[@class='icon-expand']")
private static WebElement exclInvExpandBtn;

@FindBy(xpath="//li[@class='active']//a[@id='137']//i[@class='icon-expand']")
private static WebElement exclInvTransactionExpandBtn;

@FindBy(xpath="//li[@class='active']//a[@id='139']//i[@class='icon-expand']")
private static WebElement addInventoryTransactionpurchaseExpansionBtn;


public boolean  checkAdditionsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{	
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
    Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
	createRoleRoleNameDropdown.sendKeys("PurchaseINVAndFA");
     
	createRoleRoleNameDropdown.sendKeys(Keys.TAB);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
	Select s=new Select(createRolePasswordPolicyDropdown);
	s.selectByVisibleText("Numeric");
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableProfilePurchaseProfile));
	avaliableProfilePurchaseProfile.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
	createRoleMOveFiledsFromLeftSideToRightSide.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(additionTab));
	additionTab.click();

	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(menuLabel));
	
	if (menuLabel.isDisplayed() && addHomeExpandBtn.isDisplayed() && addFininicalExpandBtn.isDisplayed() &&  
			addInventoryExpandBtn.isDisplayed() && addFixedAssestsExpandBtn.isDisplayed() && addProductionExpandBtn.isDisplayed() &&
			addPointOfSaleExpandBtn.isDisplayed() && addQualityExpandBtn.isDisplayed() &&
			createProfileSelectAllIcon.isDisplayed() && createProfileUnSelectAllIcon.isDisplayed()
			&& createRoleCloseIcon.isDisplayed() && createRoleDeleteIcon.isDisplayed() && createRoleCloseIcon.isDisplayed())
	{
		System.out.println(" Pass: Additional Tab is Displayed Successfully");
		excelReader.setCellData(xlfile, "Sheet4", 151, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail: Additional Tab is Displayed Successfully");
		excelReader.setCellData(xlfile, "Sheet4", 151, 9, resFail);
		return false;
	}
}
    

public boolean checkClickonPurchaseTransactionOfFinance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFininicalExpandBtn));
	addFininicalExpandBtn.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransationExpandBtn));
	addFinTransationExpandBtn.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransationpurchaseExpandBtn));
	addFinTransationpurchaseExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransPurPurchasesVouchers));
	if (addFinTransPurPurchasesVouchers.isDisplayed() && addFinTransPurPurchasesReturns.isDisplayed()
			&& addFinTransPurPurchaseVouchersN.isDisplayed()) 
	{
		System.out.println(" Pass : Diplayed All the Sub Menu's in Purchase Option");
		excelReader.setCellData(xlfile, "Sheet4", 152, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail : Diplayed All the Sub Menu's in Purchase Option");
		excelReader.setCellData(xlfile, "Sheet4", 152, 9, resFail);
		return false;
	}
	
}




public boolean checkPurchaseVoucherRestrictionsArea() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
	createProfileSelectAllIcon.click();
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransPurPurchasesVouchers));
	addFinTransPurPurchasesVouchers.click();
	
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purAlwaysSuspendChkBox));
	
	if (finPurAccessChkbox.isSelected() &&finPurAddChkbox.isSelected() && finPurEditChkbox.isSelected()
			&& finPurDeleteChkbox.isSelected() &&finPurPrintChkbox.isSelected() &&  finPurRePrintChkbox.isSelected()
			&& finPurPrintBarcodeChkbox.isSelected() && finPurPrintUnAuthorizedDocumentsChkbox.isSelected()&&finPurEditDocumentsThatAreCheckedChkbox.isSelected()
			&& finPurEditReconciledDocumentsChkbox.isSelected() && finPurEditDocumentsAuthorizationByHigherUpsChkbox.isSelected() && finPurEnterDocumentsThatExceedLimitChkbox.isSelected()
			&& finPurChkboxEnterDocumentsThatMakeCashorBankBalanceNeg.isSelected() && finPurEditDocumentsThatAreRePrintedChkbox.isDisplayed() && finPurAccessThroughAPIChkbox.isSelected()
			&& finPurAlwaysSuspendOnSavingChkbox.isSelected()&& finPurChangePrintLayoutChkbox.isSelected() && finPurAuthorizeChkbox.isSelected() && finPurRejectChkbox.isSelected() && finPurShowHomepageChkbox.isSelected()
			&& finPurStopChkbox.isSelected() && finPurModifySettingsChkbox.isSelected() && finPurViewDocumentEnteredByOthersChkbox.isSelected() && finPurCloseLinksChkbox.isSelected() && finPurSaveRevisionChkbox.isSelected()
			&& finPurShowPostingDetailsChkbox.isSelected() && finPurSuspendChkbox.isSelected()&&finPurEditExportedChkbox.isSelected()&&finPurEditImportedChkbox.isSelected() && finPurHideMenuChkbox.isSelected()
			&& finPurAmendChkbox.isSelected() && finPurCustomizeLinkChkbox.isSelected() && finPurFilterHomePageChkbox.isSelected() && finPurAddToStockChkbox.isSelected() && finPurReverseEntryChkbox.isSelected()
			&& finPurCustomizeInfoPanelChkbox.isSelected() && finPurRaiseChequeReturnChkbox.isSelected()) 
	{
		System.out.println(" Pass: selected All above three vouchers and its sub options in Restrictions Area");
		excelReader.setCellData(xlfile, "Sheet4", 153, 9, resPass);
		return true;
	}
	else
	{
		System.out.println(" Fail: selected All above three vouchers and its sub options in Restrictions Area");
		excelReader.setCellData(xlfile, "Sheet4", 153, 9, resFail);
		return false;
	}
}


public boolean checkAdditionTabPurchaseProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addInventoryExpandBtn));
addInventoryExpandBtn.click();

getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addInventoryTransactionExpansionBtn));
addInventoryTransactionExpansionBtn.click();

getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addInventoryTransactionpurchaseExpansionBtn));
addInventoryTransactionpurchaseExpansionBtn.click();

getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addRequestForQuoteOption));

	if (addRequestForQuoteOption.isDisplayed() && addPurchaseQuotationOption.isDisplayed()&& addPurchaseorderOption.isDisplayed()
			&&addMaterialRecepitNotes.isDisplayed() ) 
	{
		System.out.println(" Pass : Sun Menu Options Are Displayed ");
		excelReader.setCellData(xlfile, "Sheet4", 154, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail : Sun Menu Options Are Displayed ");
		excelReader.setCellData(xlfile, "Sheet4", 154, 9, resFail);
		
		return false;
	}
}


public boolean checkAdditionTabRequestForQuoteSubMenuOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addRequestForQuoteOption));
	addRequestForQuoteOption.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(reqForQuoteAccessChkbox));
	if (reqForQuoteAccessChkbox.isDisplayed() &&reqForQuoteAddChkbox.isDisplayed() && reqForQuoteEditChkbox.isDisplayed()
			&& reqForQuoteDeleteChkbox.isDisplayed() &&reqForQuotePrintChkbox.isDisplayed() &&  reqForQuoteRePrintChkbox.isDisplayed()
			&& reqForQuotePrintBarcodeChkbox.isDisplayed() && reqForQuotePrintUnAuthorizedDocumentsChkbox.isDisplayed()&&reqForQuoteEditDocumentsThatAreCheckedChkbox.isDisplayed()
			&& reqForQuoteEditReconciledDocumentsChkbox.isDisplayed() && reqForQuoteEditDocumentsAuthorizationByHigherUpsChkbox.isDisplayed() && reqForQuoteEnterDocumentsThatExceedLimitChkbox.isDisplayed()
			&& reqForQuoteChkboxEnterDocumentsThatMakeCashorBankBalanceNeg.isDisplayed() && reqForQuoteEditDocumentsThatAreRePrintedChkbox.isDisplayed() && reqForQuoteAccessThroughAPIChkbox.isDisplayed()
			&& reqForQuoteAlwaysSuspendOnSavingChkbox.isDisplayed()&& reqForQuoteChangePrintLayoutChkbox.isDisplayed() && reqForQuoteAuthorizeChkbox.isDisplayed() && reqForQuoteRejectChkbox.isDisplayed() && reqForQuoteShowHomepageChkbox.isDisplayed()
			&& reqForQuoteStopChkbox.isDisplayed() && reqForQuoteModifySettingsChkbox.isDisplayed() && reqForQuoteViewDocumentEnteredByOthersChkbox.isDisplayed() && reqForQuoteCloseLinksChkbox.isDisplayed() && reqForQuoteSaveRevisionChkbox.isDisplayed()
			&& reqForQuoteShowPostingDetailsChkbox.isDisplayed() && reqForQuoteSuspendChkbox.isDisplayed()&&reqForQuoteEditExportedDocChkbox.isDisplayed()&&reqForQuoteEditImportedDocChkbox.isDisplayed()
			&& reqForQuoteAmendChkbox.isDisplayed() && reqForQuoteCustomizeLinkChkbox.isDisplayed() && reqForQuoteFilterHomePageChkbox.isDisplayed() && reqForQuoteAddToStockChkbox.isDisplayed() && reqForQuoteReverseEntryChkbox.isDisplayed()
			&& reqForQuoteCustomizeInfoPanelChkbox.isDisplayed() && reqForQuoteRaiseChequeReturnChkbox.isDisplayed()) 
	{
		System.out.println(" Pass: Displayed All the Chkboxes");
		excelReader.setCellData(xlfile, "Sheet4", 155, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail: Displayed All the Chkboxes");
        excelReader.setCellData(xlfile, "Sheet4", 155, 9, resFail);
		return false;
	}
	
	
}


public boolean checkAdditionTabPurchaseQuationsSubMenuOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addPurchaseQuotationOption));
	addPurchaseQuotationOption.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purQuotationsAccessChkbox));
	if (purQuotationsAccessChkbox.isDisplayed() &&purQuotationsAddChkbox.isDisplayed() && purQuotationsEditChkbox.isDisplayed()
			&& purQuotationsDeleteChkbox.isDisplayed() &&purQuotationsPrintChkbox.isDisplayed() &&  purQuotationsRePrintChkbox.isDisplayed()
			&& purQuotationsPrintBarcodeChkbox.isDisplayed() && purQuotationsPrintUnAuthorizedDocumentsChkbox.isDisplayed()&&purQuotationsEditDocumentsThatAreCheckedChkbox.isDisplayed()
			&& purQuotationsEditReconciledDocumentsChkbox.isDisplayed() && purQuotationsEditDocumentsAuthorizationByHigherUpsChkbox.isDisplayed() && purQuotationsEnterDocumentsThatExceedLimitChkbox.isDisplayed()
			&& purQuotationsChkboxEnterDocumentsThatMakeCashorBankBalanceNeg.isDisplayed() && purQuotationsEditDocumentsThatAreRePrintedChkbox.isDisplayed() && purQuotationsAccessThroughAPIChkbox.isDisplayed()
			&& purQuotationsHideChkbox.isDisplayed()&& purQuotationsChangePrintLayoutChkbox.isDisplayed() && purQuotationsAuthorizeChkbox.isDisplayed() && purQuotationsRejectChkbox.isDisplayed() && purQuotationsShowHomepageChkbox.isDisplayed()
			&& purQuotationsStopChkbox.isDisplayed() && purQuotationsModifySettingsChkbox.isDisplayed() && purQuotationsViewDocumentEnteredByOthersChkbox.isDisplayed() && purQuotationsCloseLinksChkbox.isDisplayed() && purQuotationsSaveRevisionChkbox.isDisplayed()
			&& purQuotationsShowPostingDetailsChkbox.isDisplayed() && purQuotationsSuspendChkbox.isDisplayed()&&purQuotationsEditExportedChkbox.isDisplayed()&&purQuotationsEditImportedChkbox.isDisplayed()
			&& purQuotationsAmendChkbox.isDisplayed() && purQuotationsCustomizeLinkChkbox.isDisplayed() && purQuotationsFilterHomePageChkbox.isDisplayed() && purQuotationsAddToStockChkbox.isDisplayed() && purQuotationsReverseEntryChkbox.isDisplayed()
			&& purQuotationsCustomizeInfoPanelChkbox.isDisplayed() && purQuotationsRaiseChequeReturnChkbox.isDisplayed()) 
	{
		System.out.println(" Pass: Displayed All the Chkboxes");
		excelReader.setCellData(xlfile, "Sheet4", 156, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail: Displayed All the Chkboxes");
		excelReader.setCellData(xlfile, "Sheet4", 156, 9, resFail);
		return false;
	}
	
}



public boolean checkAdditionTabPurchaseOrderSubMenuOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
  Thread.sleep(2000);
    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addPurchaseorderOption));
	addPurchaseorderOption.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purOrderAlwaysSuspendOnSavingChkbox));
	if (purOrderAlwaysSuspendOnSavingChkbox.isDisplayed() &&purOrderHidewMenuChkbox.isDisplayed()) 
	{
		System.out.println(" Pass: Displayed All the Chkboxes");
		excelReader.setCellData(xlfile, "Sheet4", 157, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail: Displayed All the Chkboxes");
		excelReader.setCellData(xlfile, "Sheet4", 157, 9, resFail);
		return false;
	}
	
}


public boolean checkAdditionTabMaterialRecepitNotesSubMenuOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
  Thread.sleep(2000);
  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addMaterialRecepitNotes));
  addMaterialRecepitNotes.click();
	
  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialRecpNotesAlwaysSuspendSavingChkbox));
	if (materialRecpNotesAlwaysSuspendSavingChkbox.isDisplayed() &&materialRecpNotesHideMenuChkbox.isDisplayed()) 
	{
		System.out.println(" Pass: Displayed All the Chkboxes");
		excelReader.setCellData(xlfile, "Sheet4", 158, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail: Displayed All the Chkboxes");
		excelReader.setCellData(xlfile, "Sheet4", 158, 9, resFail);
		return false;
	}
	
}


@FindBy(xpath="//ul[@id='Exclmenu']//span[contains(text(),'Request for Quote')]")
private static WebElement excPurchaseRequestForQuote;

@FindBy(xpath="//ul[@id='Exclmenu']//span[contains(text(),'Purchases Quotations')]")
private static WebElement excPurchaseQuotations;

@FindBy(xpath="//ul[@id='Exclmenu']//li[@class='active']//li[@class='active']//span[contains(text(),'Purchases Orders')]")
private static WebElement excPurchaeOrders;

@FindBy(xpath="//ul[@id='Exclmenu']//span[contains(text(),'Material Receipt Notes')]")
private static WebElement excMaterialRecepitNotes;


public boolean ExculsionTabInPurchaseProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(exclusionsTab));
	exclusionsTab.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(exclInvExpandBtn));
	exclInvExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(exclInvTransactionExpandBtn));
	exclInvTransactionExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(addInventoryTransactionpurchaseExpansionBtn));
	addInventoryTransactionpurchaseExpansionBtn.click();
	
	 Thread.sleep(2000);
	 
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurchaseRequestForQuote));
	if (excPurchaseRequestForQuote.isDisplayed() && excPurchaseQuotations.isDisplayed()&& excPurchaeOrders.isDisplayed()
			&&excMaterialRecepitNotes.isDisplayed() ) 
	{
		System.out.println(" Pass : Sun Menu Options Are Displayed ");
		excelReader.setCellData(xlfile, "Sheet4", 159, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail : Sun Menu Options Are Displayed ");
		excelReader.setCellData(xlfile, "Sheet4", 159, 9, resFail);
		return false;
	}

}



@FindBy(xpath="//label[contains(text(),'HideMenu')]//input[@id='2010']")
private static WebElement excPurReqForQuoteHideChkbox;




public boolean checkClickonExculsionInventoryPurchaseRequestFoqQuote() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	  Thread.sleep(2000);
	  
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurchaseRequestForQuote));
	excPurchaseRequestForQuote.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurReqForQuoteHideChkbox));
	if (excPurReqForQuoteHideChkbox.isSelected()) 
	{
		System.out.println(" Pass: Hide chkbox is Displayed and is Checked" );
		excelReader.setCellData(xlfile, "Sheet4", 160, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail: Hide chkbox is Displayed and is Checked" );
		excelReader.setCellData(xlfile, "Sheet4", 160, 9, resFail);
		return false;
	}
}



@FindBy(xpath="//input[@id='2011']")
private static WebElement excPurPurQuotationsAlwaysSuspendOnSaving;

public boolean checkClickonExculsionInventoryPurchasePurchaseQuotation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 Thread.sleep(2000);
	  
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurchaseQuotations));
	excPurchaseQuotations.click();
	
	Thread.sleep(5000);
	
	boolean isSelct=excPurPurQuotationsAlwaysSuspendOnSaving.isSelected();
	System.out.println("isSelct is retrurning"+isSelct);
	
	if (excPurPurQuotationsAlwaysSuspendOnSaving.isDisplayed()) 
	{
		System.out.println(" Pass: Always Suspending on Saving chkbox is Displayed and is Checked" );
		excelReader.setCellData(xlfile, "Sheet4", 161, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail: Always Suspending on Saving chkbox is Displayed and is Checked" );
        excelReader.setCellData(xlfile, "Sheet4", 161, 9, resFail);
		return false;
	}
}


@FindBy(xpath="//div[@id='Exclusions']//li[1]//div[1]//label[1]//input[1]")
private static WebElement excPurPurOrdersAccessChkbox;


@FindBy(xpath="//div[@id='Exclusions']//li[2]//div[1]//label[1]//input[1]")
private static WebElement excPurPurOrdersAddChkbox;

@FindBy(xpath="//div[@id='Exclusions']//li[3]//div[1]//label[1]//input[1]")
private static WebElement excPurPurOrdersEditChkbox;

@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2012']")
private static WebElement excPurPurOrdersDeleteChkbox;

@FindBy(xpath="//div[@id='Exclusions']//li[5]//div[1]//label[1]//input[1]")
private static WebElement excPurPurOrdersPrintChkbox;

@FindBy(xpath="//div[@id='Exclusions']//li[6]//div[1]//label[1]//input[1]")
private static WebElement excPurPurOrdersRePrintChkbox;

@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2012']")
private static WebElement excPurPurOrdersPrintBarcodeChkbox;

@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2012']")
private static WebElement excPurPurOrdersPrintUnAuthorizedDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2012']")
private static WebElement excPurPurOrdersExportChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2012']")
private static WebElement excPurPurOrdersEditDocumentsEnteredbyOtherChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2012']")
private static WebElement excPurPurOrdersEditDocumentsThatAreCheckedChkbox;

@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2012']")
private static WebElement excPurPurOrdersEditReconciledDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2012']")
private static WebElement excPurPurOrdersEditDocumentsAuthorizationByHigherUpsChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2012']")
private static WebElement excPurPurOrdersEnterDocumentsThatExceedLimitChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2012']")
private static WebElement excPurPurOrdersChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2012']")
private static WebElement excPurPurOrdersEditDocumentsThatAreRePrintedChkbox;

@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2012']")
private static WebElement excPurPurOrdersAccessThroughAPIChkbox;

@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2012']")
private static WebElement excPurPurOrdersChangePrintLayoutChkbox;

@FindBy(xpath="//div[@id='Exclusions']//li[19]//div[1]//label[1]//input[1]")
private static WebElement excPurPurOrdersAuthorizeChkbox;
               
@FindBy(xpath="//label[contains(text(),'Re_ject')]//input[@id='2012']")
private static WebElement excPurPurOrdersRejectChkbox;

@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2012']")
private static WebElement excPurPurOrdersShowHomepageChkbox;

@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2012']")
private static WebElement excPurPurOrdersStopChkbox;

@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2012']")
private static WebElement excPurPurOrdersModifySettingsChkbox;

@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2012']")
private static WebElement excPurPurOrdersViewDocumentEnteredByOthersChkbox;

@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2012']")
private static WebElement excPurPurOrdersCloseLinksChkbox;

@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2012']")
private static WebElement excPurPurOrdersSaveRevisionChkbox;

@FindBy(xpath="//label[contains(text(),'PostingDetails')]//input[@id='2012']")
private static WebElement excPurPurOrdersShowPostingDetailsChkbox;

@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2012']")
private static WebElement excPurPurOrdersSuspendChkbox;

@FindBy(xpath="//label[contains(text(),'CanEditIfExported')]//input[@id='2012']")
private static WebElement excPurPurOrdersEditExportedChkbox;

@FindBy(xpath="//label[contains(text(),'CanEditIfImported')]//input[@id='2012']")
private static WebElement excPurPurOrdersEditImportedChkbox;

@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2012']")
private static WebElement excPurPurOrdersHideMenuChkbox;

@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2012']")
private static WebElement excPurPurOrdersAmendChkbox;

@FindBy(xpath="//label[contains(text(),'CustomizeLink')]//input[@id='2012']")
private static WebElement excPurPurOrdersCustomizeLinkChkbox;

@FindBy(xpath="//label[contains(text(),'FilterHomePage')]//input[@id='2012']")
private static WebElement excPurPurOrdersFilterHomePageChkbox;

@FindBy(xpath="//label[contains(text(),'Add To Stock')]//input[@id='2012']")
private static WebElement excPurPurOrdersAddToStockChkbox;

@FindBy(xpath="//label[contains(text(),'ReverseEntry')]//input[@id='2012']")
private static WebElement excPurPurOrdersReverseEntryChkbox;

@FindBy(xpath="//label[contains(text(),'CustomizeInfoPanel')]//input[@id='2012']")
private static WebElement excPurPurOrdersCustomizeInfoPanelChkbox;

@FindBy(xpath="//label[contains(text(),'RaiseChequeReturn')]//input[@id='2012']")
private static WebElement excPurPurOrdersRaiseChequeReturnChkbox;



public boolean checkClickonExculsionInventoryPurchasePurchaseOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurchaeOrders));
	excPurchaeOrders.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurPurOrdersAccessChkbox));
	if (excPurPurOrdersAccessChkbox.isSelected() &&excPurPurOrdersAddChkbox.isSelected() && excPurPurOrdersEditChkbox.isSelected()
			&& excPurPurOrdersDeleteChkbox.isSelected() &&excPurPurOrdersPrintChkbox.isSelected() &&  excPurPurOrdersRePrintChkbox.isSelected()
			&& excPurPurOrdersPrintBarcodeChkbox.isSelected() && excPurPurOrdersPrintUnAuthorizedDocumentsChkbox.isSelected()&&excPurPurOrdersEditDocumentsThatAreCheckedChkbox.isSelected()
			&& excPurPurOrdersEditReconciledDocumentsChkbox.isSelected() && excPurPurOrdersEditDocumentsAuthorizationByHigherUpsChkbox.isSelected() && excPurPurOrdersEnterDocumentsThatExceedLimitChkbox.isSelected()
			&& excPurPurOrdersChkboxEnterDocumentsThatMakeCashorBankBalanceNeg.isSelected() && excPurPurOrdersEditDocumentsThatAreRePrintedChkbox.isSelected() && excPurPurOrdersAccessThroughAPIChkbox.isSelected()
			&& excPurPurOrdersChangePrintLayoutChkbox.isSelected() && excPurPurOrdersAuthorizeChkbox.isSelected() && excPurPurOrdersRejectChkbox.isSelected() && excPurPurOrdersShowHomepageChkbox.isSelected()
			&& excPurPurOrdersStopChkbox.isSelected() && excPurPurOrdersModifySettingsChkbox.isSelected() && excPurPurOrdersViewDocumentEnteredByOthersChkbox.isSelected() && excPurPurOrdersCloseLinksChkbox.isSelected() && excPurPurOrdersSaveRevisionChkbox.isSelected()
			&& excPurPurOrdersShowPostingDetailsChkbox.isSelected() && excPurPurOrdersSuspendChkbox.isSelected()&&excPurPurOrdersEditExportedChkbox.isSelected()&&excPurPurOrdersEditImportedChkbox.isSelected()
			&& excPurPurOrdersAmendChkbox.isSelected() && excPurPurOrdersCustomizeLinkChkbox.isSelected() && excPurPurOrdersFilterHomePageChkbox.isSelected() && excPurPurOrdersAddToStockChkbox.isSelected() && excPurPurOrdersReverseEntryChkbox.isSelected()
			&& excPurPurOrdersCustomizeInfoPanelChkbox.isSelected() && excPurPurOrdersRaiseChequeReturnChkbox.isSelected()) 
	{
		System.out.println(" Pass: All chkbox is Displayed and is Checked" );
		excelReader.setCellData(xlfile, "Sheet4", 162, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail: All chkbox is Displayed and is Checked" );
		excelReader.setCellData(xlfile, "Sheet4", 162, 9, resFail);
		return false;
	}
}


@FindBy(xpath="//div[@id='Exclusions']//li[1]//div[1]//label[1]//input[1]")
private static WebElement excPurMRNAccessChkbox;


@FindBy(xpath="//div[@id='Exclusions']//li[2]//div[1]//label[1]//input[1]")
private static WebElement excPurMRNAddChkbox;

@FindBy(xpath="//div[@id='Exclusions']//li[3]//div[1]//label[1]//input[1]")
private static WebElement excPurMRNEditChkbox;

@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2013']")
private static WebElement excPurMRNDeleteChkbox;

@FindBy(xpath="//div[@id='Exclusions']//li[5]//div[1]//label[1]//input[1]")
private static WebElement excPurMRNPrintChkbox;

@FindBy(xpath="//div[@id='Exclusions']//li[6]//div[1]//label[1]//input[1]")
private static WebElement excPurMRNRePrintChkbox;

@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2013']")
private static WebElement excPurMRNPrintBarcodeChkbox;

@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2013']")
private static WebElement excPurMRNPrintUnAuthorizedDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2013']")
private static WebElement excPurMRNExportChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2013']")
private static WebElement excPurMRNEditDocumentsEnteredbyOtherChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2013']")
private static WebElement excPurMRNEditDocumentsThatAreCheckedChkbox;

@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2013']")
private static WebElement excPurMRNEditReconciledDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2013']")
private static WebElement excPurMRNEditDocumentsAuthorizationByHigherUpsChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2013']")
private static WebElement excPurMRNEnterDocumentsThatExceedLimitChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2013']")
private static WebElement excPurMRNChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2013']")
private static WebElement excPurMRNEditDocumentsThatAreRePrintedChkbox;

@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2013']")
private static WebElement excPurMRNAccessThroughAPIChkbox;

@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2013']")
private static WebElement excPurMRNChangePrintLayoutChkbox;

@FindBy(xpath="//div[@id='Exclusions']//li[19]//div[1]//label[1]//input[1]")
private static WebElement excPurMRNAuthorizeChkbox;

@FindBy(xpath="//label[contains(text(),'Re_ject')]//input[@id='2013']")
private static WebElement excPurMRNRejectChkbox;

@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2013']")
private static WebElement excPurMRNShowHomepageChkbox;

@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2013']")
private static WebElement excPurMRNStopChkbox;

@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2013']")
private static WebElement excPurMRNModifySettingsChkbox;

@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2013']")
private static WebElement excPurMRNViewDocumentEnteredByOthersChkbox;

@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2013']")
private static WebElement excPurMRNCloseLinksChkbox;

@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2013']")
private static WebElement excPurMRNSaveRevisionChkbox;

@FindBy(xpath="//label[contains(text(),'PostingDetails')]//input[@id='2013']")
private static WebElement excPurMRNShowPostingDetailsChkbox;

@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2013']")
private static WebElement excPurMRNSuspendChkbox;

@FindBy(xpath="//label[contains(text(),'CanEditIfExported')]//input[@id='2013']")
private static WebElement excPurMRNEditExportedChkbox;

@FindBy(xpath="//label[contains(text(),'CanEditIfImported')]//input[@id='2013']")
private static WebElement excPurMRNEditImportedChkbox;

@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2013']")
private static WebElement excPurMRNHideMenuChkbox;

@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2013']")
private static WebElement excPurMRNAmendChkbox;

@FindBy(xpath="//label[contains(text(),'CustomizeLink')]//input[@id='2013']")
private static WebElement excPurMRNCustomizeLinkChkbox;

@FindBy(xpath="//label[contains(text(),'FilterHomePage')]//input[@id='2013']")
private static WebElement excPurMRNFilterHomePageChkbox;

@FindBy(xpath="//label[contains(text(),'Add To Stock')]//input[@id='2013']")
private static WebElement excPurMRNAddToStockChkbox;

@FindBy(xpath="//label[contains(text(),'ReverseEntry')]//input[@id='2013']")
private static WebElement excPurMRNReverseEntryChkbox;

@FindBy(xpath="//label[contains(text(),'CustomizeInfoPanel')]//input[@id='2013']")
private static WebElement excPurMRNCustomizeInfoPanelChkbox;

@FindBy(xpath="//label[contains(text(),'Add To Stock')]//input[@id='2013']")
private static WebElement excPurMRNRaiseChequeReturnChkbox;



public boolean checkClickonExculsionInventoryPurchaseMaterialRecepitsNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excMaterialRecepitNotes));
	excMaterialRecepitNotes.click();
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurPurOrdersAccessChkbox));
	if (excPurMRNAccessChkbox.isSelected() &&excPurMRNAddChkbox.isSelected() && excPurMRNEditChkbox.isSelected()
			&& excPurMRNDeleteChkbox.isSelected() &&excPurMRNPrintChkbox.isSelected() &&  excPurMRNRePrintChkbox.isSelected()
			&& excPurMRNPrintBarcodeChkbox.isSelected() && excPurMRNPrintUnAuthorizedDocumentsChkbox.isSelected()&&excPurMRNEditDocumentsThatAreCheckedChkbox.isSelected()
			&& excPurMRNEditReconciledDocumentsChkbox.isSelected() && excPurMRNEditDocumentsAuthorizationByHigherUpsChkbox.isSelected() && excPurMRNEnterDocumentsThatExceedLimitChkbox.isSelected()
			&& excPurMRNChkboxEnterDocumentsThatMakeCashorBankBalanceNeg.isSelected() && excPurMRNEditDocumentsThatAreRePrintedChkbox.isSelected() && excPurMRNAccessThroughAPIChkbox.isSelected()
			&& excPurMRNChangePrintLayoutChkbox.isSelected() && excPurMRNAuthorizeChkbox.isSelected() && excPurMRNRejectChkbox.isSelected() && excPurMRNShowHomepageChkbox.isSelected()
			&& excPurMRNStopChkbox.isSelected() && excPurMRNModifySettingsChkbox.isSelected() && excPurMRNViewDocumentEnteredByOthersChkbox.isSelected() && excPurMRNCloseLinksChkbox.isSelected() && excPurMRNSaveRevisionChkbox.isSelected()
			&& excPurMRNShowPostingDetailsChkbox.isSelected() && excPurMRNSuspendChkbox.isSelected()&&excPurMRNEditExportedChkbox.isSelected()&&excPurMRNEditImportedChkbox.isSelected()
			&& excPurMRNAmendChkbox.isSelected() && excPurMRNCustomizeLinkChkbox.isSelected() && excPurMRNFilterHomePageChkbox.isSelected() && excPurMRNAddToStockChkbox.isSelected() && excPurMRNReverseEntryChkbox.isSelected()
			&& excPurMRNCustomizeInfoPanelChkbox.isSelected() && excPurMRNRaiseChequeReturnChkbox.isSelected()) 
	{
		System.out.println(" Pass: All chkbox is Displayed and is Checked" );
		excelReader.setCellData(xlfile, "Sheet4", 163, 9, resPass);
		return true;
	}
	else 
	{
		System.out.println(" Fail: All chkbox is Displayed and is Checked" );
		excelReader.setCellData(xlfile, "Sheet4", 163, 9, resFail);
		return false;
	}
}




@FindBy(xpath="//ul[@id='Exclmenu']//a[@id='136']//i[@class='icon-expand']")
private static WebElement excFixedAsstExpandBtn;


@FindBy(xpath="//li[@class='active']//a[@id='138']//i[@class='icon-expand']")
private static WebElement excFixedAssetTransactionExpandBtn;

@FindBy(xpath="//li[@class='active']//a[@id='50002']//span[contains(text(),'Asset Usage')]")
private static WebElement excFixesAssetTranAssetUsageOption;






@FindBy(xpath="//ul[@id='ExclrestrictionsDiv']")
private static WebElement excEmptyRestrictionArea;

@FindBy(xpath="//ul[@id='Exclmenu']//a[@id='60']//i[@class='icon-expand']")
private static WebElement excFinExpandBtn;

@FindBy(xpath="//li[@class='active']//a[@id='61']//i[@class='icon-expand']")
private static WebElement excFinTransExpandBtn;

@FindBy(xpath="//li[@class='active']//a[@id='2007']//i[@class='icon-expand']")
private static WebElement excFinTrandPurchaseExpandBtn;

@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchases Vouchers')]")
private static WebElement excFinTrandPurPurchaseVoucherOption;







public boolean checkClichOnExculsionRestrictionFiniancal() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excFinExpandBtn));
	excFinExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excFinTransExpandBtn));
	excFinTransExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excFinTrandPurchaseExpandBtn));
	excFinTrandPurchaseExpandBtn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excFinTrandPurPurchaseVoucherOption));
	excFinTrandPurPurchaseVoucherOption.click();
	
	
	 Thread.sleep(2000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(excEmptyRestrictionArea));
	if (excEmptyRestrictionArea.isDisplayed()) 
	{
		System.out.println(" Pass: Restriction Area is Empty");
		excelReader.setCellData(xlfile, "Sheet4", 164, 9, resPass);
		return true;
	}
	else
	{
		System.out.println(" Fail: Restriction Area is Empty");
		excelReader.setCellData(xlfile, "Sheet4", 164, 9, resFail);
		return false;
	}
	
	
}


  public boolean checkClickOnSaveAdditionAndExculsionTab() throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Role saved Successfully";
		System.out.println(Actdata);
		
		
	   if (Actdata.equalsIgnoreCase(Expdata))
	   {
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 165, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 165, 9, resFail);
			return false;
		}
	  
	  
	  
  }
		
		
		
  








@FindBy(xpath="//li[@class='active']//a[@id='140']//i[@class='icon-expand']")
private static WebElement addInventoryTransactionSalesExpansionBtn;


@FindBy(xpath="//li[@class='active']//a[@id='2017']//span[contains(text(),'Sales Orders')]")
private static WebElement addInvTranssSalesSlaesOrderOption;





@FindBy(xpath="//li[@class='active']//a[@id='2012']//span[contains(text(),'Purchases Orders')]")
private static WebElement addInvTransPurPurchaseOrderOption;




@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
private static WebElement invPurAccessChkbox;


@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
private static WebElement invPurAddChkbox;

@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
private static WebElement invPurEditChkbox;

@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2012']")
private static WebElement invPurDeleteChkbox;

@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
private static WebElement invPurPrintChkbox;

@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
private static WebElement invPurRePrintChkbox;

@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2012']")
private static WebElement invPurPrintBarcodeChkbox;

@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2012']")
private static WebElement invPurPrintUnAuthorizedDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2012']")
private static WebElement invPurExportChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2012']")
private static WebElement invPurEditDocumentsEnteredbyOtherChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2012']")
private static WebElement invPurEditDocumentsThatAreCheckedChkbox;

@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2012']")
private static WebElement invPurEditReconciledDocumentsChkbox;

@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2012']")
private static WebElement invPurEditDocumentsAuthorizationByHigherUpsChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2012']")
private static WebElement invPurEnterDocumentsThatExceedLimitChkbox;

@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2012']")
private static WebElement invPurChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2012']")
private static WebElement invPurEditDocumentsThatAreRePrintedChkbox;

@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2012']")
private static WebElement invPurAccessThroughAPIChkbox;

@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2012']")
private static WebElement invPurAlwaysSuspendOnSavingChkbox;

@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2012']")
private static WebElement invPurChangePrintLayoutChkbox;

@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
private static WebElement invPurAuthorizeChkbox;

@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='2012']")
private static WebElement invPurRejectChkbox;

@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2012']")
private static WebElement invPurShowHomepageChkbox;

@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2012']")
private static WebElement invPurStopChkbox;

@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2012']")
private static WebElement invPurModifySettingsChkbox;

@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2012']")
private static WebElement invPurViewDocumentEnteredByOthersChkbox;

@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2012']")
private static WebElement invPurCloseLinksChkbox;

@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2012']")
private static WebElement invPurSaveRevisionChkbox;

@FindBy(xpath="//label[contains(text(),'Show Posting Details')]//input[@id='2012']")
private static WebElement invPurShowPostingDetailsChkbox;

@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2012']")
private static WebElement invPurSuspendChkbox;

@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2012']")
private static WebElement invPurEditExportedChkbox;

@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2012']")
private static WebElement invPurEditImportedChkbox;

@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2012']")
private static WebElement invPurHideMenuChkbox;

@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2012']")
private static WebElement invPurAmendChkbox;

@FindBy(xpath="//label[contains(text(),'Customize link')]//input[@id='2012']")
private static WebElement invPurCustomizeLinkChkbox;

@FindBy(xpath="//label[contains(text(),'Filter home page')]//input[@id='2012']")
private static WebElement invPurFilterHomePageChkbox;

@FindBy(xpath="//label[contains(text(),'Add to stock')]//input[@id='2012']")
private static WebElement invPurAddToStockChkbox;

@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2012']")
private static WebElement invPurReverseEntryChkbox;

@FindBy(xpath="//label[contains(text(),'Customize info panel')]//input[@id='2012']")
private static WebElement invPurCustomizeInfoPanelChkbox;

@FindBy(xpath="//label[contains(text(),'Raise Cheque Return')]//input[@id='2012']")
private static WebElement invPurRaiseChequeReturnChkbox;

@FindBy(xpath="//input[@id='MasteroptionControl']")
private static WebElement gridMasterAfterClick;

@FindBy(xpath="//td[@id='restrictionEntryTable_col_1-1']")
private static WebElement gridFirstRowMasterToClick;

@FindBy(xpath="//td[@id='restrictionEntryTable_col_2-1']")
private static WebElement gridSecondRowMasterToClick;

@FindBy(xpath="//input[@id='chkEntry_1_2']")
private static WebElement gridEntryFirstRowChkBox;

@FindBy(xpath="//input[@id='chkReport_1_3']")
private static WebElement gridReportFirstRowChkBox;

@FindBy(xpath="//input[@id='chkView_1_4']")
private static WebElement gridViewFirstRowChkBox;


@FindBy(xpath="//input[@id='chkEntry_2_2']")
private static WebElement gridEntrySecondRowChkBox;

@FindBy(xpath="//input[@id='chkReport_2_3']")
private static WebElement gridReportSecondRowChkBox;

@FindBy(xpath="//input[@id='chkView_2_4']")
private static WebElement gridViewSecondRowChkBox;


@FindBy(xpath="//a[contains(text(),'Restriction for entry')]")
private static WebElement createRoleRestrictionForEntryTab;

@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='1']")
private static WebElement resOFEntryAccount;

@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='2']")
private static WebElement resOFEntryItem;

@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='3']")
private static WebElement resOFEntryDepartment;

@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='4']")
private static WebElement resOFEntryWarehouse;

@FindBy(xpath="//input[@id='chkExclusion']")
private static WebElement resOFEntryExclusionchkBox;

@FindBy(xpath="//div[contains(text(),'Masters')]")
private static WebElement  resOFEntryGridMasterColoumn;






public boolean checkAccountsCreationDisplayInRestrictionForEntryInSORestrictionRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	    Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
		createRoleRoleNameDropdown.click();
		createRoleRoleNameDropdown.clear();
		createRoleRoleNameDropdown.sendKeys("SORestForEntryRole");
		
		Thread.sleep(3000);
		
	    createRoleRoleNameDropdown.sendKeys(Keys.TAB);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText("Numeric");
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableProfileSalesOrderProfile));
		avaliableProfileSalesOrderProfile.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();
	
		Thread.sleep(5000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
		createRoleRestrictionForEntryTab.click();
		
		resOFEntryAccount.click();
		
		gridFirstRowMasterToClick.click();
		
		gridMasterAfterClick.sendKeys("Customer Update");
		
		Thread.sleep(4999);
		
		gridMasterAfterClick.sendKeys(Keys.TAB);
		
		Thread.sleep(3959);
		
		String getAccountSelection=gridMasterAfterClick.getAttribute("value");
		
		System.out.println("getAccountSelection"+getAccountSelection);
	  
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();
		
		Thread.sleep(2000);
		
		  if(getAccountSelection.equalsIgnoreCase("Customer Update"))
		   {
				System.out.println("  Pass:  Save button with selecting Assigned Profile");
				excelReader.setCellData(xlfile, "Sheet4", 166, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Save button with selecting Assigned Profile");
				excelReader.setCellData(xlfile, "Sheet4", 166, 9, resFail);
				return false;
			}
		 
}
  
  
  

public boolean checkItemCreationDisplayInRestrictionForEntryInSORestrictionRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	    
		
		resOFEntryItem.click();
		
		gridFirstRowMasterToClick.click();
		
		gridMasterAfterClick.sendKeys("STOCK ITEM");
		
		Thread.sleep(2000);
		
		gridMasterAfterClick.sendKeys(Keys.TAB);
		
		
		String getItemFirstSelection=gridMasterAfterClick.getAttribute("value");
		
		System.out.println("getAccountSelection"+getItemFirstSelection);
	  
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();
		
		Thread.sleep(2000);
		
		gridSecondRowMasterToClick.click();
		
       gridMasterAfterClick.sendKeys("ITEMS GROUP");
		
       Thread.sleep(2000);
       
       gridMasterAfterClick.sendKeys(Keys.TAB);
       
		String getItemSecondSelection=gridMasterAfterClick.getAttribute("value");
		
		System.out.println("getAccountSelection"+getItemSecondSelection);
	  
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
		gridEntrySecondRowChkBox.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
		gridReportSecondRowChkBox.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
		gridViewSecondRowChkBox.click();
		
		Thread.sleep(2000);
		
		  if(getItemFirstSelection.equalsIgnoreCase("STOCK ITEM") && getItemSecondSelection.equalsIgnoreCase("ITEMS GROUP"))
		   {
				System.out.println("  Pass:  Save button with selecting Assigned Profile");
				excelReader.setCellData(xlfile, "Sheet4", 167, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Save button with selecting Assigned Profile");
				excelReader.setCellData(xlfile, "Sheet4", 167, 9, resFail);
				return false;
			}
		 
}
		




public boolean checkWarehouseCreationDisplayInRestrictionForEntryInSORestrictionRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	    Thread.sleep(2000);
		
		
		
		resOFEntryWarehouse.click();
		
		gridFirstRowMasterToClick.click();
		
		gridMasterAfterClick.sendKeys("HYDERABAD");
		
		Thread.sleep(2000);
		
		gridMasterAfterClick.sendKeys(Keys.TAB);
		
		String getAccountSelection=gridMasterAfterClick.getAttribute("value");
		
		System.out.println("getAccountSelection"+getAccountSelection);
	  
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();
		
		Thread.sleep(2000);
		
		  if(getAccountSelection.equalsIgnoreCase("HYDERABAD"))
		   {
				System.out.println("  Pass:  Save button with selecting Assigned Profile");
				excelReader.setCellData(xlfile, "Sheet4", 168, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Save button with selecting Assigned Profile");
				excelReader.setCellData(xlfile, "Sheet4", 168, 9, resFail);
				return false;
			}
		 
}
  
  


public boolean checkClickOnSaveRestrictionEntry() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Role saved Successfully";
		System.out.println(Actdata);
		
		
	   if (Actdata.equalsIgnoreCase(Expdata))
	   {
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 169, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 169, 9, resFail);
			return false;
		}
	  
	  
	  
}
		
		

public boolean checkClickOnSaveRestrictionEntryWithExclusion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  
	  
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
		createRoleRoleNameDropdown.sendKeys("SORestForEntryRoleExclusion");
		
	    createRoleRoleNameDropdown.sendKeys(Keys.TAB);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText("Simple Policy");
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableProfileSalesOrderProfile));
		avaliableProfileSalesOrderProfile.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();
	
		Thread.sleep(5000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
		createRoleRestrictionForEntryTab.click();
		
		Thread.sleep(2000);
		
		resOFEntryAccount.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
		resOFEntryExclusionchkBox.click();
		
		gridFirstRowMasterToClick.click();
		
		gridMasterAfterClick.sendKeys("Customer Update Group");
		
		Thread.sleep(4999);
		
		gridMasterAfterClick.sendKeys(Keys.TAB);
		
		Thread.sleep(3959);
		
		String getAccountSelection=gridMasterAfterClick.getAttribute("value");
		
		System.out.println("getAccountSelection"+getAccountSelection);
	  
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();
		
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();
	  
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();
		
		
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Role saved Successfully";
		System.out.println(Actdata);
		
		
	   if (Actdata.equalsIgnoreCase(Expdata))
	   {
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 170, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 170, 9, resFail);
			return false;
		}
	  
	  
	  
}

@FindBy(xpath="//input[@id='allowBillWiseAcc']")
private static WebElement allowBillWiseOnAccountChkBox;

@FindBy(xpath="//select[@id='BudgetLimitWarning']")
private static WebElement budgetLimitWarningDropdown;

@FindBy(xpath="//select[@id='CreditLimitWarning']")
private static WebElement creditLimitWarningDropdown;

@FindBy(xpath="//select[@id='NegativeCashCheck']")
private static WebElement negativeCashCheckDropdown;

@FindBy(xpath="//select[@id='NegativeStockCheck']")
private static WebElement negativeStockCheckDropdown;

@FindBy(xpath="//input[@id='CantaddfutureTrans']")
private static WebElement cantaddfutureTransChkbox;

@FindBy(xpath="//input[@id='CantAdTransThtAremrethan']")
private static WebElement cannotAddTransThatAreMoreThanTxt;

@FindBy(xpath="//input[@id='CantEditPrevTransaremorethn']")
private static WebElement cannotEditPreviousMonthEntriesAfterTxt;

@FindBy(xpath="//input[@id='CantEditTranstharemorethn']")
private static WebElement CantEditTransthatAreremorethanTxt;

@FindBy(xpath="//input[@id='CantAddPrevMnthEntriesaft']")
private static WebElement CantAddPrevMnthEntriesaftTxt;

@FindBy(xpath="//input[@id='CantPrintAfterValue']")
private static WebElement CantPrintAfterValueTxt;

@FindBy(xpath="//select[@id='CantPrintAfterOption']")
private static WebElement cantPrintAfterValueDropdown;

@FindBy(xpath="//input[@id='CantRe-PrintAfterValue']")
private static WebElement CantRePrintAfterValueTxt;

@FindBy(xpath="//select[@id='CantRe-PrintAfterOption']")
private static WebElement CantRePrintAfterDropdown;

@FindBy(xpath="//input[@id='DntAlwmastercust']")
private static WebElement doNotAllowMastewrCustomization;


public boolean checkTransactionRights() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  
	  
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
		createRoleRoleNameDropdown.sendKeys("RoleWithAllProTransRight");
		
	    createRoleRoleNameDropdown.sendKeys(Keys.TAB);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText("Simple Policy");
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfile));
		avaliableAllProfile.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();
		
		Thread.sleep(2000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionRightsTab));
		transactionRightsTab.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowBillWiseOnAccountChkBox));
		allowBillWiseOnAccountChkBox.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(budgetLimitWarningDropdown));
		Select s1=new Select(budgetLimitWarningDropdown);
		s1.selectByVisibleText("Allow");
		
		Thread.sleep(2000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitWarningDropdown));
		Select s2=new Select(creditLimitWarningDropdown);
		s2.selectByVisibleText("Request Credit Limit Increase");

		Thread.sleep(2000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(negativeCashCheckDropdown));
		Select s3=new Select(negativeCashCheckDropdown);
		s3.selectByVisibleText("Allow");


		Thread.sleep(2000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(negativeStockCheckDropdown));
		Select s4=new Select(negativeStockCheckDropdown);
		s4.selectByVisibleText("Allow");
		
		cantaddfutureTransChkbox.click();
		
		cannotAddTransThatAreMoreThanTxt.click();
		cannotAddTransThatAreMoreThanTxt.clear();
		cannotAddTransThatAreMoreThanTxt.sendKeys("2");

		cannotEditPreviousMonthEntriesAfterTxt.click();
		cannotEditPreviousMonthEntriesAfterTxt.clear();
		cannotEditPreviousMonthEntriesAfterTxt.sendKeys("2");

		CantEditTransthatAreremorethanTxt.click();
		CantEditTransthatAreremorethanTxt.clear();
		CantEditTransthatAreremorethanTxt.sendKeys("2");
		
		CantAddPrevMnthEntriesaftTxt.click();
		CantEditTransthatAreremorethanTxt.clear();
		CantAddPrevMnthEntriesaftTxt.sendKeys("2");
		
		CantPrintAfterValueTxt.click();
		CantPrintAfterValueTxt.clear();
		CantPrintAfterValueTxt.sendKeys("2");

		
		CantRePrintAfterValueTxt.click();
		CantRePrintAfterValueTxt.clear();
		CantRePrintAfterValueTxt.sendKeys("2");
		
		CantRePrintAfterValueTxt.click();
		CantRePrintAfterValueTxt.clear();
		CantRePrintAfterValueTxt.sendKeys("2");
		
		doNotAllowMastewrCustomization.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();
		
		
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
		String Actdata=newErrorMessage.getText();
		String Expdata="Role saved Successfully";
		System.out.println(Actdata);
		
		
	   if (Actdata.equalsIgnoreCase(Expdata))
	   {
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 171, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 171, 9, resFail);
			return false;
		}
		
}



public boolean checkEditAndUpdateRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  
	  
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
	 createRoleRoleNameDropdown.sendKeys("SORestForEntryRoleExclusion");
	
	 Thread.sleep(3000);
	 
     createRoleRoleNameDropdown.sendKeys(Keys.TAB);
	
     Thread.sleep(3000);
    
     restrictionforEntryTab.click();
    
     Thread.sleep(2000);
	
	 gridSecondRowMasterToClick.click();
	
     gridMasterAfterClick.sendKeys("Customer C");
	
     Thread.sleep(2000);
   
     gridMasterAfterClick.sendKeys(Keys.TAB);
   
	 String getItemSecondSelection=gridMasterAfterClick.getAttribute("value");
	
	 System.out.println("getAccountSelection"+getItemSecondSelection);
  
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
	 gridEntrySecondRowChkBox.click();
	
	 Thread.sleep(2000);
	
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
	 gridReportSecondRowChkBox.click();
	
	 Thread.sleep(2000);
	
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
	 gridViewSecondRowChkBox.click();
	
	 Thread.sleep(2000);

	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
	 createRoleSaveicon.click();
	
	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 String Actdata=newErrorMessage.getText();
	 String Expdata="Role updated Successfully";
	 System.out.println(Actdata);
	
	
	   if (Actdata.equalsIgnoreCase(Expdata))
	   {
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 172, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			newErrorMessageCloseBtn.click();
			excelReader.setCellData(xlfile, "Sheet4", 172, 9, resFail);
			return false;
		}
	
	
	
}


public boolean checkUpdatedRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  
	 Thread.sleep(4000);
	  
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
	createRoleRoleNameDropdown.sendKeys("SORestForEntryRoleExclusion");
	
	Thread.sleep(4000);
    
	createRoleRoleNameDropdown.sendKeys(Keys.TAB);
	
	
   Thread.sleep(3000);
   
   restrictionforEntryTab.click();
   
   Thread.sleep(2000);
	
	gridSecondRowMasterToClick.click();
	
	 gridMasterAfterClick.click();
	
   String getItemSecondSelection=gridMasterAfterClick.getAttribute("value");
	
	System.out.println("getAccountSelection"+getItemSecondSelection);
	
  Thread.sleep(2000);
  
  if(getItemSecondSelection.equalsIgnoreCase("Customer C"))
  {
		System.out.println("  Pass:  Save button with selecting Assigned Profile");
		excelReader.setCellData(xlfile, "Sheet4", 173, 9, resPass);
		return true;
	} 
	else 
	{
		System.out.println("Fail:  Save button with selecting Assigned Profile");
		excelReader.setCellData(xlfile, "Sheet4", 173, 9, resFail);
		return false;
	}
  
}


public boolean checkDeleteRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	
	   excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  
	  

		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
		 createRoleCloseIcon.click();

		 Thread.sleep(3000);
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		 homeMenu.click();
			
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(securitymenu));
		 securitymenu.click();
				
		 Thread.sleep(2000);
				 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMenu));
		 createRoleMenu.click();
	  
	  
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
		 createRoleRoleNameDropdown.click();
		 
		 Thread.sleep(3000);
		 
		 createRoleRoleNameDropdown.clear();
		
		 createRoleRoleNameDropdown.sendKeys("RoleForDelete");
		
		 Thread.sleep(3000);
		
	     createRoleRoleNameDropdown.sendKeys(Keys.TAB);
		
	     Thread.sleep(3000);
	    
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		 Select s=new Select(createRolePasswordPolicyDropdown);
		 s.selectByVisibleText("Simple Policy");
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfile));
		 avaliableAllProfile.click();
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		 createRoleMOveFiledsFromLeftSideToRightSide.click();
		
		 Thread.sleep(3000);
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		 createRoleSaveicon.click();
		
		 Thread.sleep(3000);
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
		 newErrorMessageCloseBtn.click();
		
		 Thread.sleep(3000);
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
		 createRoleRoleNameDropdown.sendKeys("RoleForDelete");
		
		 Thread.sleep(3000);
		
	    createRoleRoleNameDropdown.sendKeys(Keys.TAB);
		
	    Thread.sleep(3000);
		
        createRoleDeleteIcon.click();
        
        Thread.sleep(5000);
    	
        String message= getDriver().switchTo().alert().getText();
       
        System.out.println(" Delete Pop Message"     +message);
         
        String exp,act;
        
        act=getDriver().switchTo().alert().getText();
        exp="are you sure that you want to delete Role";
        
        
        if (act.equalsIgnoreCase(exp)) 
    	   {
    			System.out.println(" Pass: displayed message as Are you Sure want to Delete with Yes and No buttons");
    			excelReader.setCellData(xlfile, "Sheet4", 174, 9, resPass);
    			return true;
    		} 
    		else 
    		{
    			System.out.println("Fail:  displayed message as Are you Sure want to Delete with Yes and No buttons");
    			excelReader.setCellData(xlfile, "Sheet4", 174, 9, resFail);
    			return false;
    		}
}


public boolean  checkNoOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	
	getDriver().switchTo().alert().dismiss();
	
	Thread.sleep(3000);
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
	
	
	createRoleRoleNameDropdown.click();
	String actRoleName=createRoleRoleNameDropdown.getAttribute("value");
	String expRoleName="RoleForDelete";
	
	if (actRoleName.equalsIgnoreCase(expRoleName))
	{
		 System.out.println(" Pass: SalesAccessAPIProfile is Not Deleted Successfully");
			excelReader.setCellData(xlfile, "Sheet4", 175, 9, resPass);
		 return true;
	} 
	else 
	{
		 System.out.println(" Fail: SalesAccessAPIProfile is Not Deleted Successfully");
			excelReader.setCellData(xlfile, "Sheet4", 175, 9, resFail);
		 return false;
	}
	
	
	
}
	
	
	
	public boolean SelectagainandClickonDeleteRoleButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
         Thread.sleep(2000);
         
     	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameDropdown));
    	
    	
    	createRoleRoleNameDropdown.click();
    	
    	Thread.sleep(2000);
    	
    	createRoleRoleNameDropdown.sendKeys(Keys.TAB);
         
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleDeleteIcon));
		createRoleDeleteIcon.click();
        
        Thread.sleep(2000);
        
        
       String message= getDriver().switchTo().alert().getText();
       
        System.out.println(" Delete Pop Message"  +message);
        
        String exp,act;
        
        act=getDriver().switchTo().alert().getText();
        exp="are you sure that you want to delete Role";
        
        
        if (act.equalsIgnoreCase(exp)) 
		   {
				System.out.println(" Pass: displayed message as Are you Sure want to Delete ");
				excelReader.setCellData(xlfile, "Sheet4", 176, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  displayed message as Are you Sure want to Delete ");
				excelReader.setCellData(xlfile, "Sheet4", 176, 9, resFail);
				return false;
			}
	}
	
	
	
	
	public boolean checkYesOptioninDeleteRolePopMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 getDriver().switchTo().alert().accept();
		 
		 Thread.sleep(2000);
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata=newErrorMessage.getText();
			String Expdata="Role Successfully deleted..";
			System.out.println(Actdata);
			
			
		   if (Actdata.equalsIgnoreCase(Expdata)) 
		   {
				System.out.println(" Pass: SalesAccessAPIProfile is Deleted Successfully");
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			    newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 177, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail: SalesAccessAPIProfile is Deleted Successfull");
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
				    newErrorMessageCloseBtn.click();
					excelReader.setCellData(xlfile, "Sheet4", 177, 9, resFail);
				return false;
			}
	}
	





	 public static boolean checkCloseButtonInRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
			
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
	

			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
			 createRoleCloseIcon.click();
			 
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
			 
		     if(labelDashboard.isDisplayed() && selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() &&
		    		 dashboardCustomizationSettings.isDisplayed())
	         {
	         	System.out.println("Pass");
	         	excelReader.setCellData(xlfile, "Sheet4", 178, 9, resPass);
	         	return true;
	         }
	         else
	         {
	         	System.out.println("Fail");
	         	excelReader.setCellData(xlfile, "Sheet4", 178, 9, resFail);
	         	return false;
	         }
		     
		}

	 
	    // Create User    
	    
	    public boolean  checkClickOnCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException
	    {
	    	
	    	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    			
	    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	    				
	    	homeMenu.click();
	    				
	    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
	    				
	    	securityMenu.click();

	 	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
	 	    createUserMenu.click();
	 	   
	 	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLabel));
	 	    if (createUserLabel.isDisplayed()&&createUserAdditionalInfoTab.isDisplayed() && createUserRestrictionsTab.isDisplayed() && createUserDeviceTab.isDisplayed()
	 			   && createUserRestrictionforentryTab.isDisplayed() && createUserUserInformationTab.isDisplayed() && createUserIcon.isDisplayed() && createUserCreateGroupIcon.isDisplayed()
	 			   && createUserCancelIcon.isDisplayed() && createUserLoginNameTxt.isDisplayed() && createUserERPRoleDropDown.isDisplayed() && createUserPasswordPolicyDropdown.isDisplayed()
	 			   && createUserIcon.isDisplayed())
	 	    {
	 		 System.out.println("Pass : Displayed Create User Screen");
	 		 excelReader.setCellData(xlfile, "Sheet4", 185, 9, resPass);
	 		 return true;
	 	   } 
	 	   else 
	 	   {
	 		 
	 		   System.out.println("Fail : Displayed Create User Screen");
	 		  excelReader.setCellData(xlfile, "Sheet4", 185, 9, resFail);
	 		   return false;
	 	   }
	 	   
	 	   
	    }
	    
	    
	    
	    
	 public boolean checkSaveButtonWithoutMandatoryInputsInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	     
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
	 	createUserIcon.click();
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	 String Actdata=newErrorMessage.getText();
	 		String Expdata="Please Provide Username";
	 		System.out.println(Actdata);
	 		
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		 excelReader.setCellData(xlfile, "Sheet4", 186, 9, resPass);
		 		 return true;
		 	   } 
		 	   else 
		 	   {
		 		 
		 		   System.out.println("Fail : Displayed Create User Screen");
		 		  excelReader.setCellData(xlfile, "Sheet4", 186, 9, resFail);
		 		
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	
	 }

	 

	 public boolean checkRoleAsMandatoryCheckByInputUserName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
	 	createUserLoginNameTxt.click();
	 	createUserLoginNameTxt.sendKeys("UserAllOptions");

	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		String Actdata=newErrorMessage.getText();
	 		String Expdata="Please select role for this user";
	 		System.out.println(Actdata);
	 		
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) {
	 			System.out.println("  Pass: Should Provide Role Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		 excelReader.setCellData(xlfile, "Sheet4", 187, 9, resPass);
		 		 return true;
		 	   } 
		 	   else 
		 	   {
		 		 
		 		   System.out.println("Fail : Displayed Create User Screen");
		 		  excelReader.setCellData(xlfile, "Sheet4", 187, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 }
	 
	 
	 
	 public boolean checkERPRolesOptionInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
	 	Thread.sleep(3000);
	 	
	 	createUserERPRoleDropDown.click();
	 	String list=createUserERPRoleDropDown.getText();
	 	System.out.println(list);

	 	Select s=new Select(createUserERPRoleDropDown);
	 	int act=s.getOptions().size();
	 	
	 	System.out.println(act);
	 	
	 	int exp=6;
	 	
	 	if (act==exp) 
	 	{
	 		System.out.println(" Pass: Dispalyed All the Elements in Erp ROle DropDown");
	 		 excelReader.setCellData(xlfile, "Sheet4", 188, 9, resPass);
	 		 return true;
	 	   } 
	 	   else 
	 	   {
	 		 
	 		   System.out.println("Fail : Displayed Create User Screen");
	 		  excelReader.setCellData(xlfile, "Sheet4", 188, 9, resFail);
	 		return false;
	 	}
	 }

	 
	 
	 @FindBy(xpath="//select[@id='passwordPolicy']//option[6]")
	 private static WebElement getNumericValue;
	 
	 

	 public boolean checkPasswordPolicyOnSelectingERPRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		Thread.sleep(2000);
		createUserERPRoleDropDown.click();
		
		createUserERPRoleDropDown.sendKeys("SampleRole1");
		
		//createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		Thread.sleep(2000);
		
		createUserERPRoleDropDown.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
      /* System.out.println("createUserPasswordPolicyDropdown"+createUserPasswordPolicyDropdown.getText());
		
		String Act=createUserPasswordPolicyDropdown.getAttribute("value");*/
		
		String getPasswordPolicyNumericValue=getNumericValue.getText();
		
		System.out.println("getNumericValue"+getNumericValue.getText());
		
	 	Select s=new Select(createUserPasswordPolicyDropdown);
	 	String act=s.getFirstSelectedOption().getText();
	 	
	 	System.out.println("getNumericValue  act"+act);
		
		if (getPasswordPolicyNumericValue.equalsIgnoreCase("Numeric")) 
		{
		  System.out.println(" Pass: Password Policy is Selected As SampleRole1  ");	
	 		 excelReader.setCellData(xlfile, "Sheet4", 189, 9, resPass);
	 		 return true;
	 	   } 
	 	   else 
	 	   {
	 		 
	 		   System.out.println("Fail : Displayed Create User Screen");
	 		  excelReader.setCellData(xlfile, "Sheet4", 189, 9, resFail);	
		  return false;
		}
	 }
	 
	 

	 public boolean checkPasswordPolicyInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	 	Thread.sleep(2000);
	 	
	 	createUserPasswordPolicyDropdown.click();
	 	
	 	Thread.sleep(2000);
	 	
	 	Select s=new Select(createUserPasswordPolicyDropdown);
	 	int act=s.getOptions().size();
	 	
	 	System.out.println(act);
	 	
	 	int Act=s.getOptions().size();
	 	int Exp=9;
	 	
	 	System.out.println("Act is "+Act);
	 	
	 	if (Act==Exp) 
	 	{
	 	 System.out.println(" Pass: Password Policy is Selected As SampleRole1  ");	
 		 excelReader.setCellData(xlfile, "Sheet4", 190, 9, resPass);
 		 return true;
 	   } 
 	   else 
 	   {
 		 
 		   System.out.println("Fail : Displayed Create User Screen");
 		  excelReader.setCellData(xlfile, "Sheet4", 190, 9, resFail);
	 		 return false;
	 	}
	 }

	 
	 
	 public boolean checkPasswordAsMandatoryCheckInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	    String Actdata=newErrorMessage.getText();
	 		String Expdata="Please Enter Password";
	 		
	 		System.out.println(Actdata);
	 		
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 191, 9, resPass);
		 		return true;
		 	   } 
		 	   else 
		 	   {
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 191, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	
	 }

	 
	 public boolean checkConfirmPasswordAsMandatoryCheckInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
	 	 createUserPasswordTxt.sendKeys("12345");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	 String Actdata=newErrorMessage.getText();
	 	 
	     String Expdata="Enter confirm password";
	     
	 	 System.out.println(Actdata);
	 		 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		 excelReader.setCellData(xlfile, "Sheet4", 192, 9, resPass);
		 		 return true;
		 	   } 
		 	   else 
		 	   {
		 		 
		 		   System.out.println("Fail : Displayed Create User Screen");
		 		  excelReader.setCellData(xlfile, "Sheet4", 192, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	
	 }
	 
	 
	 
	 public boolean checkNameAsMandatoryCheckInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
	 	 createUserPasswordConformTxt.sendKeys("12345");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	 String Actdata=newErrorMessage.getText();
	 		String Expdata="Please provide the Fullname";
	 		System.out.println(Actdata);
	 		
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 193, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 193, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	
	 }
	 
	 
	 public boolean checkLoginAbbreviationAsMandatoryCheckInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
	 	 createUserNameTxt.sendKeys("UserAllOptions");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	 String Actdata=newErrorMessage.getText();
	 	 String Expdata="Please provide the Login abbreviation";
	 	 
	 	 System.out.println(Actdata);
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 194, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 194, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	
	 }
	 
	 
	 
	 
	 
	 public boolean checkSecurityQuestionAsMandatoryInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginAbbrivationTxt));
	 	 createUserLoginAbbrivationTxt.sendKeys("UAO");
	 	 
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	 String Actdata=newErrorMessage.getText();
	 		String Expdata="Please select a Security question";
	 		System.out.println(Actdata);
	 		
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 195, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 195, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	
	 
	 }
	 
	 
	 public boolean checkSecurityAnswerAsMandatoryInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	 	 
		 createUserSecurityQuestionDropDown.click();
 		 String list=createUserSecurityQuestionDropDown.getText();
 		 System.out.println(list);
 		
	 		
	 	 Select s=new Select(createUserSecurityQuestionDropDown);
	 	 
	 	 int act=s.getOptions().size();
	 	 System.out.println(act);
	 		
	 	 int exp=26;
	 	
	 	 createUserSecurityQuestionDropDown.sendKeys("In which country were you born?");
	 		
	 	 Thread.sleep(2000);
	 		
	 	 createUserSecurityQuestionDropDown.sendKeys(Keys.TAB);
	 		
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	 String Actdata=newErrorMessage.getText();
	 	 String Expdata="Provide your security answer";
	 	 
	 	 System.out.println(Actdata);
	 		

	 	   if (Actdata.equalsIgnoreCase(Expdata) && act==exp) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 196, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 196, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	

	 	
	 }
	 


	 public boolean checkTypeAsMandatoryInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityAnswerTxt));
	 	
	 	 createUserSecurityAnswerTxt.sendKeys("India");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	 String Actdata=newErrorMessage.getText();
	 	 String Expdata="Please select user type for this user";
	 	 System.out.println(Actdata);
	 		
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 197, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 197, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	   
	 }
	 

	 
	 @FindBy(xpath="//select[@id='language']")
	 private static WebElement getLanguage;

	 
	 @FindBy(xpath="//select[@id='altLanguage']")
	 private static WebElement getAltLanguage;
	 
	 
	 public boolean checkLanguageInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	 
		 getLanguage.click();
 		 String list=getLanguage.getText();
 		 System.out.println(list);
 		
	 		
	 		Select s=new Select(getLanguage);
	 		int act=s.getOptions().size();
	 		
	 		System.out.println(act);
	 		
	 		
	 		int exp=3;
	 		if (act==exp) 
	 		{
	 			System.out.println(" Pass: Dispalyed All the Questions in Security Question Dropdown");
		 		excelReader.setCellData(xlfile, "Sheet4", 198, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 198, 9, resFail);
	 			return false;
	 		}
	 	 
	 	
	 }

	 
	 
	 public boolean checkAltLanguageInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	 
		 getAltLanguage.click();
 		 String list=getAltLanguage.getText();
 		 System.out.println(list);
 		
	 		
	 		Select s=new Select(getAltLanguage);
	 		int act=s.getOptions().size();
	 		
	 		System.out.println(act);
	 		
	 		int exp=3;
	 		if (act==exp) 
	 		{
	 			System.out.println(" Pass: Dispalyed All the Questionsin Security Question Dropdown ");
		 		excelReader.setCellData(xlfile, "Sheet4", 199, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 199, 9, resFail);
	 			return false;
	 		}
	 	 
	 	
	 }
	 
	 

	 public boolean checkEmailAsMandatoryInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	

	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
	 	 createUserAdditionalInfoTab.click();

	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
	 	 Select user=new Select(createUserUserTypeIcon);
	 	 user.selectByVisibleText("Customer");
	 	 
	 		Thread.sleep(3000);
	 	 
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	createUserSaveIcon.click();
	 	
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	    String Actdata=newErrorMessage.getText();
	 		String Expdata="Please provide your EmailID";
	 		System.out.println(Actdata);
	 		
	 		
		 	 
		 	 String Act1=createUserUserTypeIcon.getAttribute("value");
		 	 String Exp1= "2";
		 	 
		 	 
		 	 
		 	System.out.println(Act1);
		 	
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata) && Act1.equalsIgnoreCase(Exp1)) 
	 	   {
	 			 System.out.println("  Pass: Should Provide User Name ");
                 if(newErrorMessageCloseBtn.isDisplayed())
                 {
                	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
     	 			newErrorMessageCloseBtn.click();	 
                 }
	 			
		 		excelReader.setCellData(xlfile, "Sheet4", 200, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 200, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}

	       }
	 	 
	 	 
	 	 
	 
	 public boolean checkInvalidEmailAsMandatoryInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	 	
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		 	createUserEmailTxt.sendKeys("naveen");
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		 	createUserSaveIcon.click();
	 	
	 	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	    String Actdata=newErrorMessage.getText();
	 		String Expdata="Invalid email address";
	 		System.out.println(Actdata);
	 		
	 	
		 	 
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata) ) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
                if(newErrorMessageCloseBtn.isDisplayed())
                {
               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
    	 			newErrorMessageCloseBtn.click();	 
                }
	 			
		 		excelReader.setCellData(xlfile, "Sheet4", 201, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 201, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}

	       }
	 	 
	 	 
	 
	 
	 	public boolean checkConfirmPasswordAsInvalid() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 	{
	 		
	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		     
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
	 		createUserEmailTxt.click();
	 		createUserEmailTxt.clear();
		 	createUserEmailTxt.sendKeys("naveenkumar@focussoftnet.com");
		 	
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
		 	createUserUserInformationTab.click();
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
		 	 createUserPasswordConformTxt.clear();
		 	 createUserPasswordConformTxt.sendKeys("123");
		 	
	 	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	    createUserSaveIcon.click();
	 	 
	 	    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
	 		String Actdata=newErrorMessage.getText();
	 		String Expdata="Confirm password does not match";
	 		System.out.println(Actdata);
	 		
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata))
	 	   {
	 			System.out.println("Pass: Validating Confirm Password");
                if(newErrorMessageCloseBtn.isDisplayed())
                {
               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
    	 			newErrorMessageCloseBtn.click();	 
                }
	 			
		 		excelReader.setCellData(xlfile, "Sheet4", 202, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 202, 9, resFail);
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	        }



	 public boolean checkSaveUserWithAllMandatoryInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
	 	 createUserPasswordConformTxt.clear();
	 	 createUserPasswordConformTxt.sendKeys("12345");

	 	 Thread.sleep(2000);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	 
	 	 
	 	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		String Actdata=newErrorMessage.getText();
	 		String Expdata="new user created successfully";
	 		System.out.println(Actdata);
	 	
	 	   if (Actdata.equalsIgnoreCase(Expdata)) {
	 			System.out.println("Pass: Validating Password and UserAllOptions is Created ");
                if(newErrorMessageCloseBtn.isDisplayed())
                {
               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
    	 			newErrorMessageCloseBtn.click();	 
                }
	 			
		 		excelReader.setCellData(xlfile, "Sheet4", 203, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 203, 9, resFail);
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	 
	 	 
	 }
	 
	 
	 //Edit
	 
	 
	 //Restriction For Entry
	 
	 
	 //Restriction with Exclusion
	 

	 //Delete
	 
	 
	 
	 @FindBy(xpath="//span//span[contains(text(),'UserAllOptions')]")
	 private static WebElement getSaveUserName;
	 
	 
	 public boolean checkGetSaveUserNameDisplayInTheList() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx"; 	
	     
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(getSaveUserName));
	 	 getSaveUserName.click();

	 	 Thread.sleep(2000);
	 	 /*
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	 */
	 	 
	 	    
	 		String Actdata=getSaveUserName.getText();
	 		String Expdata="UserAllOptions";
	 		System.out.println(Actdata);
	 	
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("Pass: Validating Password and UserAllOptions is Created ");
		 		excelReader.setCellData(xlfile, "Sheet4", 204, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 204, 9, resFail);
	 			return false;
	 		}
	 	 
	 	 
	 }
	 
	 
	 
	 public boolean checkCreateUserWithPurchaseINVFARole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
		    Thread.sleep(2000);
		    
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		 	createUserIcon.click();
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		 	createUserLoginNameTxt.sendKeys("UserWithPurchaseFAINV");
		 	
		 	//Selected Role As select Role as PurchaseINVAndFA
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		 	 createUserPasswordTxt.sendKeys("12345");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
		 	 createUserPasswordConformTxt.sendKeys("12345");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		 	 createUserNameTxt.sendKeys("UserWithPurchaseFAINV");
		 	 createUserLoginAbbrivationTxt.sendKeys("UWP");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		 	 createUserSecurityQuestionDropDown.click();
		 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		 	 createUserSecurityAnswerTxt.sendKeys("blue");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		 	 createUserAdditionalInfoTab.click();
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		 	 createUserEmailTxt.sendKeys("vasu@gmail.com");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
		 	 Select user=new Select(createUserUserTypeIcon);
		 	 user.selectByVisibleText("Customer");
		 	 
		 	 Thread.sleep(3000);
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			 createUserSaveIcon.click();
		 
		 
			    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			 	String Actdata=newErrorMessage.getText();
				String Expdata="new user created successfully";
				System.out.println(Actdata);
				
				
			   if (Actdata.equalsIgnoreCase(Expdata)) 
			   {
					System.out.println("Pass: UserWithAccDisable Create Successfully");
	                 if(newErrorMessageCloseBtn.isDisplayed())
	                 {
	                	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	     	 			newErrorMessageCloseBtn.click();	 
	                 }
		 			
			 		excelReader.setCellData(xlfile, "Sheet4", 205, 9, resPass);
			 		return true;
			 	} 
			 	else 
			 	{
			 		 
			 		System.out.println("Fail : Displayed Create User Screen");
			 		excelReader.setCellData(xlfile, "Sheet4", 205, 9, resFail);
					newErrorMessageCloseBtn.click();
					return false;
				}
		 
	 	 
	 	 
	 }
	 
	 
	 
	 public boolean checkRestrictionOfEntryTabInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		 
		 
	       Thread.sleep(2000);
	    
	 	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
	 	   createUserIcon.click();
	 	
	       Thread.sleep(3000);
		 
		   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		   createUserRestrictionforentryTab.click();
		 
		   Thread.sleep(3000);
		 
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountMaster));
		 	if (AccountMaster.isDisplayed()&&  ItemMaster.isDisplayed()&&  DepartmentMaster.isDisplayed()&&  CostCentreMaster.isDisplayed()
		 			&&  WarehouseMaster.isDisplayed() &&  LocationMaster.isDisplayed() &&  RegionMaster.isDisplayed()&&  CountryMaster.isDisplayed()
		 			&&  StateMaster.isDisplayed()&&  CityMaster.isDisplayed()&&  UnitsMaster.isDisplayed()&&  BinsMaster.isDisplayed()
		 			&&  TaxCodeMaster.isDisplayed()&&  PlantMaster.isDisplayed()&&  SupplyAreaMaster.isDisplayed()&&  MaintanceParameterMaster.isDisplayed()
		 			&&  SafetyInstructionsMaster.isDisplayed()&&  CapacityMaster.isDisplayed()&&  WorkCentreMaster.isDisplayed() &&  holidayMaster.isDisplayed()
		 			&&  ProcessMaster.isDisplayed()&&  QcFailureREsonMaster.isDisplayed()&&  QCParametersMaster.isDisplayed()&&  InsurenceMaster.isDisplayed()
		 			&&  FixedAssetMaster.isDisplayed()&&  BreakDownStandedReasonMaster.isDisplayed()&&  EmployeeMaster.isDisplayed()
		 			&&  DesigniationMaster.isDisplayed()&&  PositionMaster.isDisplayed()&&  QualificationMaster.isDisplayed()&&  SpecializationMaster.isDisplayed()
		 			&&  NationalityMaster.isDisplayed()&&  SkillTypeMaster.isDisplayed()&&  SkillMaster.isDisplayed()&&  SourceTypeMaster.isDisplayed()&&  SourceMaster.isDisplayed()
		 			&&  RoundTypeMaster.isDisplayed()&&  GradeMaster.isDisplayed()&&  ScaleMaster.isDisplayed()&&  CourseTypeMaster.isDisplayed()&&  CourseMaster.isDisplayed()&&  TranierMaster.isDisplayed()
		 			&&  AirlineSectorMaster.isDisplayed()&&  VenueMaster.isDisplayed()&&  RequestTypesMaster.isDisplayed()&&  ExpenceClaimsMaster.isDisplayed()&&  EmpoloyeeBankMaster.isDisplayed()
		 			&&  TravelAgentMaster.isDisplayed()&&  JobGradeMaster.isDisplayed()&&  OutletMaster.isDisplayed()&&  CounterMaster.isDisplayed()&&  MemberTypeMaster.isDisplayed()
		 			&&  GiftVoucherDefMaster.isDisplayed()&&  CategoryMaster.isDisplayed()&&  BankCardTypeMaster.isDisplayed()&&  MemberMaster.isDisplayed()&&  DiscountVoucherDefMaster.isDisplayed()
		 			&&  FloorMaster.isDisplayed()&&  SectionMaster.isDisplayed()&&  TableMaster.isDisplayed()&&  GuestMaster.isDisplayed()&&  VoidRemarksMaster.isDisplayed()&&  MemberCardDefMaster.isDisplayed()
		 			&&  ReturnRemarksMaster.isDisplayed()&&  KichenDisplaySystemMaster.isDisplayed()&&  DeliveryTimeIntervalMaster.isDisplayed()&&  EpaymentMaster.isDisplayed()
		 			&& createRoleSaveicon.isDisplayed()&& createRoleCloseIcon.isDisplayed()) 
		 	{
		 		 System.out.println(" Pass: Dispalyed Restriction For Entry Tab And All Masters ");
			 		excelReader.setCellData(xlfile, "Sheet4", 206, 9, resPass);
			 		return true;
			 	} 
			 	else 
			 	{
			 		 
			 		System.out.println("Fail : Displayed Create User Screen");
			 		excelReader.setCellData(xlfile, "Sheet4", 206, 9, resFail);
		 		return false;
		 	}
	 }
	 
	 
	 
	 public boolean checkCreateUserWithAccPOTransRight() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		 
		 
		     Thread.sleep(2000);
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
	 	    createUserUserInformationTab.click();
		  
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		 	createUserLoginNameTxt.sendKeys("UserAccPOTransRestrictions");
		 	
		 	//Selected Role As select Role as PurchaseINVAndFA
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN);
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);
		 	
		 	//Password length should be equal or greater than minimum password length 3
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		 	 createUserPasswordTxt.sendKeys("12345");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
		 	 createUserPasswordConformTxt.sendKeys("12345");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		 	 createUserNameTxt.sendKeys("UserPOTransRestrictions");
		 	 createUserLoginAbbrivationTxt.sendKeys("UPOR");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		 	 createUserSecurityQuestionDropDown.click();
		 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		 	 createUserSecurityAnswerTxt.sendKeys("blue");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		 	 createUserAdditionalInfoTab.click();
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		 	 createUserEmailTxt.sendKeys("dhana@gmail.com");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
		 	 Select user=new Select(createUserUserTypeIcon);
		 	 user.selectByVisibleText("Customer");
		 	 
		 	 Thread.sleep(3000);
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		 	createUserRestrictionforentryTab.click();
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryAccount));
		 	 resOFEntryAccount.click();
			
			gridFirstRowMasterToClick.click();
			
			gridMasterAfterClick.sendKeys("Customer Update");
			
			Thread.sleep(4999);
			
			gridMasterAfterClick.sendKeys(Keys.TAB);
			
			Thread.sleep(3959);
			
			String getAccountSelection=gridMasterAfterClick.getAttribute("value");
			
			System.out.println("getAccountSelection"+getAccountSelection);
		  
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
			gridEntryFirstRowChkBox.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
			gridReportFirstRowChkBox.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
			gridViewFirstRowChkBox.click();
			
			Thread.sleep(2000);
			
	        gridSecondRowMasterToClick.click();
		
	        gridMasterAfterClick.sendKeys("Customer Update Group");
			
	        Thread.sleep(2000);
	       
	        gridMasterAfterClick.sendKeys(Keys.TAB);
	       
			String getAccountSecondSelection=gridMasterAfterClick.getAttribute("value");
			
			System.out.println("getAccountSecondSelection"+getAccountSecondSelection);
		  
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
			gridEntrySecondRowChkBox.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
			gridReportSecondRowChkBox.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
			gridViewSecondRowChkBox.click();
		
			Thread.sleep(2000);
			
			  if(getAccountSelection.equalsIgnoreCase("Customer Update") && getAccountSecondSelection.equalsIgnoreCase("Customer Update Group"))
			   {
					System.out.println("  Pass:  Save button with selecting Assigned Profile");
					Thread.sleep(3000);
				 	 
				 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
					createUserSaveIcon.click();
				 
				 
				    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
				 	String Actdata=newErrorMessage.getText();
					String Expdata="new user created successfully";
					System.out.println(Actdata);
						
						
					   if (Actdata.equalsIgnoreCase(Expdata)) 
					   {
							System.out.println("Pass: UserWithAccDisable Create Successfully");
			                if(newErrorMessageCloseBtn.isDisplayed())
			                {
			               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			    	 			newErrorMessageCloseBtn.click();	 
			                }
					 		excelReader.setCellData(xlfile, "Sheet4", 207, 9, resPass);
					 		return true;
					 	} 
					 	else 
					 	{
					 		 
					 		System.out.println("Fail : Displayed Create User Screen");
					 		excelReader.setCellData(xlfile, "Sheet4", 207, 9, resFail);
							newErrorMessageCloseBtn.click();
							return false;
						}
					
				} 
				else 
				{
					System.out.println("Fail:  Save button with selecting Assigned Profile");
					
					return false;
				}
	 }
	 
	 
	 
	
	 
	 
	@FindBy (xpath="//span//span[contains(text(),'UserAccPOTransRestrictions')]")
	private static WebElement UserAccPOTransRestrictionsOption;
		 
	@FindBy (xpath="//td[@id='restrictionEntryTable_col_1-0']")
	private static WebElement gridRow1;
	
	@FindBy (xpath="//div[contains(text(),'Delete Row')]")
	private static WebElement deleteRowBtn;
	
	@FindBy (xpath="//td[@id='restrictionEntryTable_col_3-1']")
	private static WebElement gridThirdRowMasterToClick;

	 
	 public boolean checkDeleteRowInInResOfEntryInCreatedUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		 
		 
		    Thread.sleep(2000);
		    
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSerachTxt));
		 	createUserSerachTxt.click();
		 	createUserSerachTxt.sendKeys("useraccpo");
		 	
		     Thread.sleep(3000);
		 
		 	UserAccPOTransRestrictionsOption.click();
		 	
		 	Thread.sleep(3000);
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		 	createUserRestrictionforentryTab.click();
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRow1));
		 	gridRow1.click();
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
		 	deleteRowBtn.click();
		 	
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		 	gridSecondRowMasterToClick.click();
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridMasterAfterClick));
		 	gridMasterAfterClick.click();
		 	
		 	Thread.sleep(3000);
		 	 String SecondGridTxt=gridMasterAfterClick.getAttribute("value");
		 	Thread.sleep(3000);
		 	System.out.println(SecondGridTxt);
		 	
		 	/*Thread.sleep(3000);
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridThirdRowMasterToClick));
		 	gridThirdRowMasterToClick.click();
		 	Thread.sleep(3000);
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridMasterAfterClick));             // To check Logic
		 	gridMasterAfterClick.click();
		 	Thread.sleep(3000);
		 	 String ThirdGridTxt=gridMasterAfterClick.getAttribute("value");
		 	
		 	System.out.println(ThirdGridTxt);*/
		 	
		 	
		 	if (SecondGridTxt.equalsIgnoreCase("Customer Update Group")) 
		 	{
				System.out.println(" Pass: Delete Row Successfully");
				Thread.sleep(3000);
			 	 
			 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
				createUserSaveIcon.click();
			 
			 
			    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			 	String Actdata=newErrorMessage.getText();
				String Expdata="User updated successfully.";
				System.out.println(Actdata);
					
					
				   if (Actdata.equalsIgnoreCase(Expdata)) 
				   {
						System.out.println("Pass: UserWithAccDisable Create Successfully");
		                if(newErrorMessageCloseBtn.isDisplayed())
		                {
		               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
		    	 			newErrorMessageCloseBtn.click();	 
		                }
				 		excelReader.setCellData(xlfile, "Sheet4", 208, 9, resPass);
				 		return true;
				 	} 
				 	else 
				 	{
				 		 
				 		System.out.println("Fail : Displayed Create User Screen");
				 		excelReader.setCellData(xlfile, "Sheet4", 208, 9, resFail);
						newErrorMessageCloseBtn.click();
						return false;
					}
				
			}
		 	else 
		 	{
		 		System.out.println(" Fail: Delete Row Successfully");
				return false;
			}
	 }
	 
	 
	 
	 
	 public boolean checkCreateUserWithItemPOTransRight() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	     
		    Thread.sleep(2000);
		    
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		 	createUserIcon.click();
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		 	createUserLoginNameTxt.sendKeys("UserItemPOTransRestrictions");
		 	
		 	//Selected Role As select Role as PurchaseINVAndFA
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN);
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);
		 	
		 	//Password length should be equal or greater than minimum password length 3
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		 	 createUserPasswordTxt.sendKeys("12345");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
		 	 createUserPasswordConformTxt.sendKeys("12345");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		 	 createUserNameTxt.sendKeys("UserPOTransRestrictions");
		 	 createUserLoginAbbrivationTxt.sendKeys("UPOR");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		 	 createUserSecurityQuestionDropDown.click();
		 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		 	 createUserSecurityAnswerTxt.sendKeys("blue");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		 	 createUserAdditionalInfoTab.click();
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		 	 createUserEmailTxt.sendKeys("sai@gmail.com");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
		 	 Select user=new Select(createUserUserTypeIcon);
		 	 user.selectByVisibleText("Customer");
		 	 
		 	 Thread.sleep(3000);
		 	 
		 	 
		 	createUserRestrictionforentryTab.click();
		 	resOFEntryItem.click();
			
			gridFirstRowMasterToClick.click();
			
			gridMasterAfterClick.sendKeys("BATCH BR ITEM");
			
			Thread.sleep(4999);
			
			gridMasterAfterClick.sendKeys(Keys.TAB);
			
			Thread.sleep(3959);
			
			String getItemSelection=gridMasterAfterClick.getAttribute("value");
			
			System.out.println("getItemSelection"+getItemSelection);
		  
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
			gridEntryFirstRowChkBox.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
			gridReportFirstRowChkBox.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
			gridViewFirstRowChkBox.click();
			
			
		
			Thread.sleep(2000);
			
			  if(getItemSelection.equalsIgnoreCase("BATCH BR ITEM"))
			   {
					System.out.println("  Pass:  Save button with selecting Assigned Profile");
					Thread.sleep(3000);
				 	 
				 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
					createUserSaveIcon.click();
				 
				 
				    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
				 	String Actdata=newErrorMessage.getText();
					String Expdata="new user created successfully";
					System.out.println(Actdata);
						
						
					   if (Actdata.equalsIgnoreCase(Expdata)) 
					   {
							System.out.println("Pass: UserWithAccDisable Create Successfully");
			                if(newErrorMessageCloseBtn.isDisplayed())
			                {
			               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			    	 			newErrorMessageCloseBtn.click();	 
			                }
					 		excelReader.setCellData(xlfile, "Sheet4", 209, 9, resPass);
					 		return true;
					 	} 
					 	else 
					 	{
					 		 
					 		System.out.println("Fail : Displayed Create User Screen");
					 		excelReader.setCellData(xlfile, "Sheet4", 209, 9, resFail);
							newErrorMessageCloseBtn.click();
							return false;
						}
					
				} 
				else 
				{
					System.out.println("Fail:  Save button with selecting Assigned Profile");
					
					return false;
				}
	 }
	 
	 
	 
	 @FindBy (xpath="//span//span[contains(text(),'UserItemPOTransRestrictions')]")
	 private static WebElement UserItemPOTransRestrictionsOption;
	 
	
	 
	
	 
	 
	 public boolean checkAddRowInResOfEntryInCreatedUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
		    Thread.sleep(2000);
		    
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSerachTxt));
		 	createUserSerachTxt.click();
		 	createUserSerachTxt.sendKeys("UserItemPOTransRestrictions");
		 	
		     Thread.sleep(3000);
		 
		     UserItemPOTransRestrictionsOption.click();
		 	
		 	Thread.sleep(3000);
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		 	createUserRestrictionforentryTab.click();
		 	
             Thread.sleep(2000);
			
	        gridSecondRowMasterToClick.click();
		
	        gridMasterAfterClick.sendKeys("BATCH FIFO ITEM");
			
	        Thread.sleep(2000);
	       
	        gridMasterAfterClick.sendKeys(Keys.TAB);
	       
			String getItemSecondSelection=gridMasterAfterClick.getAttribute("value");
			
			System.out.println("getAccountSecondSelection"+getItemSecondSelection);
		  
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
			gridEntrySecondRowChkBox.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
			gridReportSecondRowChkBox.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
			gridViewSecondRowChkBox.click();
		 	
		 	if (getItemSecondSelection.equalsIgnoreCase("BATCH FIFO ITEM")) 
		 	{
				System.out.println(" Pass:  Row  Addded Successfully");
				Thread.sleep(3000);
			 	 
			 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
				createUserSaveIcon.click();
			 
			 
			    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			 	String Actdata=newErrorMessage.getText();
				String Expdata="User updated successfully.";
				System.out.println(Actdata);
					
					
				   if (Actdata.equalsIgnoreCase(Expdata)) 
				   {
						System.out.println("Pass: UserWithAccDisable Create Successfully");
		                if(newErrorMessageCloseBtn.isDisplayed())
		                {
		               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
		    	 			newErrorMessageCloseBtn.click();	 
		                }
				 		excelReader.setCellData(xlfile, "Sheet4", 210, 9, resPass);
				 		return true;
				 	} 
				 	else 
				 	{
				 		 
				 		System.out.println("Fail : Displayed Create User Screen");
				 		excelReader.setCellData(xlfile, "Sheet4", 210, 9, resFail);
						newErrorMessageCloseBtn.click();
						return false;
					}
				
			}
		 	else 
		 	{
		 		System.out.println(" Fail:  Row  Added Successfully");
				return false;
			}
	 }
	 
	 
	 public boolean checUserWithExculsion() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
	 	   Thread.sleep(2000);
		    
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		 	createUserIcon.click();
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		 	createUserLoginNameTxt.sendKeys("UserItemPOExclusion");
		 	
		 	//Selected Role As select Role as PurchaseINVAndFA
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN);
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);
		 	
		 	//Password length should be equal or greater than minimum password length 3
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		 	 createUserPasswordTxt.sendKeys("12345");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
		 	 createUserPasswordConformTxt.sendKeys("12345");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		 	 createUserNameTxt.sendKeys("UserItemPOExclusion");
		 	 createUserLoginAbbrivationTxt.sendKeys("UIPOE");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		 	 createUserSecurityQuestionDropDown.click();
		 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		 	 createUserSecurityAnswerTxt.sendKeys("blue");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		 	 createUserAdditionalInfoTab.click();
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		 	 createUserEmailTxt.sendKeys("rathod@gmail.com");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
		 	 Select user=new Select(createUserUserTypeIcon);
		 	 user.selectByVisibleText("Customer");
		 	 
		 	 Thread.sleep(3000);
		 	 
		 	 
		 	createUserRestrictionforentryTab.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	resOFEntryItem.click();
			
		 	Thread.sleep(2000);
		 	
		 	resOFEntryExclusionchkBox.click();
		 	
		 	Thread.sleep(2000);
		 	
			gridFirstRowMasterToClick.click();
			
			gridMasterAfterClick.sendKeys("BIN FINISHED GOODS ITEM");
			
			Thread.sleep(4999);
			
			gridMasterAfterClick.sendKeys(Keys.TAB);
			
			Thread.sleep(3959);
			
			String getItemSelection=gridMasterAfterClick.getAttribute("value");
			
			System.out.println("getItemSelection"+getItemSelection);
		  
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
			gridEntryFirstRowChkBox.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
			gridReportFirstRowChkBox.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
			gridViewFirstRowChkBox.click();
			
			
		
			Thread.sleep(2000);
			
			  if(getItemSelection.equalsIgnoreCase("BIN FINISHED GOODS ITEM") && resOFEntryExclusionchkBox.isSelected())
			   {
					System.out.println("  Pass:  Save button with selecting Assigned Profile");
					Thread.sleep(3000);
				 	 
				 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
					createUserSaveIcon.click();
				 
				 
				    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
				 	String Actdata=newErrorMessage.getText();
					String Expdata="new user created successfully";
					System.out.println(Actdata);
						
						
					   if (Actdata.equalsIgnoreCase(Expdata)) 
					   {
							System.out.println("Pass: UserWithAccDisable Create Successfully");
			                if(newErrorMessageCloseBtn.isDisplayed())
			                {
			               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			    	 			newErrorMessageCloseBtn.click();	 
			                }
					 		excelReader.setCellData(xlfile, "Sheet4", 211, 9, resPass);
					 		return true;
					 	} 
					 	else 
					 	{
					 		 
					 		System.out.println("Fail : Displayed Create User Screen");
					 		excelReader.setCellData(xlfile, "Sheet4", 211, 9, resFail);
							newErrorMessageCloseBtn.click();
							return false;
						}
					
				} 
				else 
				{
					System.out.println("Fail:  Save button with selecting Assigned Profile");
					
					return false;
				}
	 	    
	 }	 
	 
	 public boolean checkCreateUserWithAccDisable() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	
	 	
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		    Thread.sleep(2000);
		    
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		 	createUserIcon.click();
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		 	createUserLoginNameTxt.sendKeys("UserWithAccDisableRole");
		 	
		 	//Selected Role As SORestForEntryRole
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.TAB);
		 	
		 	//Password length should be equal or greater than minimum password length 3
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		 	 createUserPasswordTxt.sendKeys("12345");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
		 	 createUserPasswordConformTxt.sendKeys("12345");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		 	 createUserNameTxt.sendKeys("UserWithAccDisableRole");
		 	 createUserLoginAbbrivationTxt.sendKeys("UAD");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		 	 createUserSecurityQuestionDropDown.click();
		 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		 	 createUserSecurityAnswerTxt.sendKeys("blue");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		 	 createUserAdditionalInfoTab.click();
		 	 
	    	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		 	 createUserEmailTxt.sendKeys("raki@gmail.com");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
		 	 Select user=new Select(createUserUserTypeIcon);
		 	 user.selectByVisibleText("Customer");
		 	 
		 	 Thread.sleep(3000);
		 	 
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountDisableChkbox));
		 	 accountDisableChkbox.click();
		 	 
		 	 Thread.sleep(3000);
		 	 
		 	    if (accountDisableChkbox.isSelected())
		 		{
		 			
		 			 System.out.println(" Pass: Account Disable ChkBox iS Chked  ");
		 			 Thread.sleep(2000);
		 			 
		 			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		 			 createUserSaveIcon.click();
		 		 
		 			    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
		 			 	String Actdata=newErrorMessage.getText();
		 				String Expdata="new user created successfully";
		 				System.out.println(Actdata);
		 				
		 				
		 			   if (Actdata.equalsIgnoreCase(Expdata)) 
		 			   {
		 					System.out.println("Pass: UserWithAccDisable Create Successfully");
		 	                if(newErrorMessageCloseBtn.isDisplayed())
		 	                {
		 	               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
		 	    	 			newErrorMessageCloseBtn.click();	 
		 	                }
					 		excelReader.setCellData(xlfile, "Sheet4", 212, 9, resPass);
					 		return true;
					 	} 
					 	else 
					 	{
					 		 
					 		System.out.println("Fail : Displayed Create User Screen");
					 		excelReader.setCellData(xlfile, "Sheet4", 212, 9, resFail);
		 					newErrorMessageCloseBtn.click();
		 					return false;
		 				}
		 		 
		 		 }
		 		 else
		 		 {
		 			 System.out.println(" Fail: Account Disable ChkBox iS Chked  ");
		 			 return false;
		 		 }
	 }
	 
	 public boolean checkCreateUserWithDonotLockAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
	 	Thread.sleep(2000);
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
	 	createUserIcon.click();
	 	
	 	Thread.sleep(2000);
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
	 	createUserLoginNameTxt.sendKeys("UserWithDNotLock");
	 	
	 	//Selected Role As select Role as SORestForEntryRole
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
	 	createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);
	 
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
	 	createUserPasswordPolicyDropdown.sendKeys("Alpha Numeric Special Star with all options");
	 	createUserPasswordPolicyDropdown.sendKeys(Keys.TAB);
	 	
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
	 	 createUserPasswordTxt.sendKeys("UserWithDNotLock@4");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
	 	 createUserPasswordConformTxt.sendKeys("UserWithDNotLock@4");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
	 	 createUserNameTxt.sendKeys("UserWithDNotLock");
	 	 createUserLoginAbbrivationTxt.sendKeys("UWDL");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
	 	 createUserSecurityQuestionDropDown.click();
	 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
	 	 createUserSecurityAnswerTxt.sendKeys("blue");
	 	 
	 	Thread.sleep(2000);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
	 	 createUserAdditionalInfoTab.click();
	 	Thread.sleep(2000);
	 	 
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
	 	 createUserEmailTxt.sendKeys("teja@gmail.com");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
	 	 Select user=new Select(createUserUserTypeIcon);
	 	 user.selectByVisibleText("Customer");
	 	 
	 	 Thread.sleep(2000);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotLockAccountChkBox));
	 	 doNotLockAccountChkBox.click();
	 	 
	 	Thread.sleep(2000);
	 	 
	     if (doNotLockAccountChkBox.isSelected())
	 	{
	 		
	 		 System.out.println(" Pass: Do Not Lock  ChkBox Is Checked ");
	 		 Thread.sleep(2000);
	 		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 		 createUserSaveIcon.click();
	 	 
	 	 
	 		    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
	 		 	String Actdata=newErrorMessage.getText();
	 			String Expdata="new user created successfully";
	 			System.out.println(Actdata);
	 			
	 			 
	 			if (Actdata.contains(Expdata)) 
	 		   {
	 				System.out.println("Pass: UserWithDNotLock Create Successfully");
	                if(newErrorMessageCloseBtn.isDisplayed())
	                {
	               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	    	 			newErrorMessageCloseBtn.click();	 
	                }
			 		excelReader.setCellData(xlfile, "Sheet4", 213, 9, resPass);
			 		return true;
			 	} 
			 	else 
			 	{
			 		 
			 		System.out.println("Fail : Displayed Create User Screen");
			 		excelReader.setCellData(xlfile, "Sheet4", 213, 9, resFail);
	 				newErrorMessageCloseBtn.click();
	 				return false;
	 			}
	 	 
	 	 }
	 	 else
	 	 {
	 		 System.out.println(" Fail: Do Not Lock  ChkBox Is Checked ");
	 		 return false;
	 	 }
	 }

 
	 public boolean checkCreateUserWithAllowMultiLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	 	
	 	Thread.sleep(2000);
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
	 	createUserIcon.click();
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
	 	createUserLoginNameTxt.sendKeys("UserWithAllowMulLogin");
	 	
	 	//Selected Role As select Role as SORestForEntryRoleExclusion,
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
	 	createUserERPRoleDropDown.sendKeys("SORestForEntryRoleExclusion");
	 	createUserERPRoleDropDown.sendKeys(Keys.TAB);
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
	 	 createUserPasswordTxt.sendKeys("sss");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
	 	 createUserPasswordConformTxt.sendKeys("sss");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
	 	 createUserNameTxt.sendKeys("UserWithAllowMulLogin");
	 	 createUserLoginAbbrivationTxt.sendKeys("UWAML");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
	 	 createUserSecurityQuestionDropDown.click();
	 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
	 	 createUserSecurityAnswerTxt.sendKeys("blue");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
	 	 createUserAdditionalInfoTab.click();
	 	 
	 	Thread.sleep(2000);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
	 	 createUserEmailTxt.sendKeys("sudheer@gmail.com");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
	 	 Select user=new Select(createUserUserTypeIcon);
	 	 user.selectByVisibleText("Customer");
	 	 
	 	Thread.sleep(2000);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(multipleLoginChkbox));
	 	 multipleLoginChkbox.click();
	 	 
	 	
	 	 
	 	 Thread.sleep(2000);
	 	 String act=createUserUserTypeIcon.getAttribute("value");
	 	 String exp="2";
	 	 
	 	Thread.sleep(2000);
	 	 
	    if (multipleLoginChkbox.isSelected() && act.equalsIgnoreCase(exp))
	 	{
	 		
	 		 System.out.println(" Pass: Multiple Login  ChkBox Is Checked And User Type is Selected As Customer ");
	 		 
	 		 Thread.sleep(2000);
	 		 
	 		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 		 createUserSaveIcon.click();
	 	 
	 	 
	 		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		 	String Actdata=newErrorMessage.getText();
	 			String Expdata="new user created successfully";
	 			System.out.println(Actdata);
	 			
	 			 
	 			if (Actdata.contains(Expdata)) 
	 		   {
	 				System.out.println("Pass: UserWithAllowMulLogin Create Successfully");
	                if(newErrorMessageCloseBtn.isDisplayed())
	                {
	               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	    	 			newErrorMessageCloseBtn.click();	 
	                }
			 		excelReader.setCellData(xlfile, "Sheet4", 214, 9, resPass);
			 		return true;
			 	} 
			 	else 
			 	{
			 		 
			 		System.out.println("Fail : Displayed Create User Screen");
			 		excelReader.setCellData(xlfile, "Sheet4", 214, 9, resFail);
	 				newErrorMessageCloseBtn.click();
	 				return false;
	 			}
	 	 
	 	 }
	 	 else
	 	 {
	 		 System.out.println(" Fail: Do Not Lock  ChkBox Is Checked ");
	 		 return false;
	 	 }
	 	
	 } 
	 
	
	 
	 public boolean checkCreateUserWithSendEmailNotificationOnLognSuccess() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	 	
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	 	Thread.sleep(2000);
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
	 	createUserIcon.click();
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
	 	createUserLoginNameTxt.sendKeys("UserSendEmailLoginSuccess");
	 	
	 	//Selected Role As select Role as SORestForEntryRoleExclusion,
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
	 	createUserERPRoleDropDown.sendKeys("SORestForEntryRoleExclusion");
	 	createUserERPRoleDropDown.sendKeys(Keys.TAB);
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
	 	createUserPasswordPolicyDropdown.sendKeys("Alpha Numeric Special Star with all options");
	 	createUserPasswordPolicyDropdown.sendKeys(Keys.TAB);
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
	 	 createUserPasswordTxt.sendKeys("UserSendEmailLoginSuccess@4");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
	 	 createUserPasswordConformTxt.sendKeys("UserSendEmailLoginSuccess@4");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
	 	 createUserNameTxt.sendKeys("UserSendEmailLoginSuccess");
	 	 createUserLoginAbbrivationTxt.sendKeys("USELS");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
	 	 createUserSecurityQuestionDropDown.click();
	 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
	 	 createUserSecurityAnswerTxt.sendKeys("blue");
	 	 
	 	Thread.sleep(2000);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
	 	 createUserAdditionalInfoTab.click();
	 	 
	 	Thread.sleep(2000);
	 	 
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
	 	 createUserEmailTxt.sendKeys("sudheer@focussoftnet.com");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
	 	 Select user=new Select(createUserUserTypeIcon);
	 	 user.selectByVisibleText("Customer");
	 	 
	 	Thread.sleep(2000);
	 	 
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailNotificationChkbox));
	 	 sendEmailNotificationChkbox.click();
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailUserOnLoginSuccessChkbox));
	 	 emailUserOnLoginSuccessChkbox.click();
	 	 
	 	 Thread.sleep(2000);
	 	 
	 	 String act=createUserUserTypeIcon.getAttribute("value");
	 	 String exp="2";
	 	 
	 	 
	   if (sendEmailNotificationChkbox.isSelected() && emailUserOnLoginSuccessChkbox.isSelected() && act.equalsIgnoreCase(exp))
	 	{
	 		
	 		 System.out.println(" Pass: Send Email Notification  ChkBox Is Checked And User Type is Selected As Customer ");
	 		 
	 		 Thread.sleep(2000);
	 		 
	 		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 		 createUserSaveIcon.click();
	 	 
	 	 
	 		    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
	 		 	String Actdata=newErrorMessage.getText();
	 			String Expdata="new user created successfully";
	 			System.out.println(Actdata);
	 			
	 			 
	 			if (Actdata.contains(Expdata)) 
	 		   {
	 				System.out.println("Pass: UserSendEmailLoginSuccess Create Successfully");
	                if(newErrorMessageCloseBtn.isDisplayed())
	                {
	               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	    	 			newErrorMessageCloseBtn.click();	 
	                }
			 		excelReader.setCellData(xlfile, "Sheet4", 215, 9, resPass);
			 		return true;
			 	} 
			 	else 
			 	{
			 		 
			 		System.out.println("Fail : Displayed Create User Screen");
			 		excelReader.setCellData(xlfile, "Sheet4", 215, 9, resFail);
	 				newErrorMessageCloseBtn.click();
	 				return false;
	 			}
	 	 
	 	 }
	 	 else
	 	 {
	 		 System.out.println(" Fail: Do Not Lock  ChkBox Is Checked ");
	 		 return false;
	 	 }
	 }

	 
	 @FindBy(xpath="//input[@id='chkAccDisabled']")
	 private static WebElement accountDisableChkbox;	
	 
	 @FindBy(xpath="//input[@id='chklockAcc']")
	 private static WebElement doNotLockAccountChkBox;
	 
	 @FindBy(xpath="//input[@id='chkMultiLogin']")
	 private static WebElement multipleLoginChkbox;
	 
	 @FindBy(xpath="//input[@id='chkEmailnoti']")
	 private static WebElement sendEmailNotificationChkbox;

	 @FindBy(xpath="//input[@id='chkLoginSuccess']")
	 private static WebElement emailUserOnLoginSuccessChkbox;
	 
	 @FindBy(xpath="//*[@id='chkLoginFailure']")
	 private static WebElement emailOnLoginFaliureChkbox;
	 

	 @FindBy(xpath="//input[@id='fromDate_checkbox']")
	 private static WebElement resTabFromDateChkBox;

	 @FindBy(xpath="//input[@id='toDate_checkbox']")
	 private static WebElement resTabToDateChkBox;

	 @FindBy(xpath="//input[@id='startDate_checkbox']")
	 private static WebElement resTabWorkingHoursFromChkbox;

	 @FindBy(xpath="//input[@id='endDate_checkbox']")
	 private static WebElement resTabWorkingHoursToChkbox;

	 @FindBy(xpath="//input[@id='chkSelectAllDays']")
	 private static WebElement resTabSelectAllChkbox;

	 @FindBy(xpath="//input[@id='chkSunDay']")
	 private static WebElement resTabSundayChkbox;

	 @FindBy(xpath="//input[@id='chkMonDay']")
	 private static WebElement resTabMondayChkbox;

	 @FindBy(xpath="//input[@id='chkTuesDay']")
	 private static WebElement resTabTuesdayChkbox;

	 @FindBy(xpath="//input[@id='chkWednesDay']")
	 private static WebElement resTabWednesdayChkbox;

	 @FindBy(xpath="//input[@id='chkThursDay']")
	 private static WebElement resTabThursdaychkbox;

	 @FindBy(xpath="//input[@id='chkFriDay']")
	 private static WebElement resTabFirdayChkbox;

	 @FindBy(xpath="//input[@id='chkSaturDay']")
	 private static WebElement resTabSaturdayChkbox;

	 @FindBy(xpath="//input[@id='domaintext']")
	 private static WebElement resTabDomainTxt;

	 @FindBy(xpath="//ul[@id='domainNames']")
	 private static WebElement resTabDomainNameTxtArea;



	 public boolean checkCreateUserWithSendEmailNotificationonLoginFailure() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	 	
	 	Thread.sleep(2000);
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
	 	createUserIcon.click();
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
	 	createUserLoginNameTxt.sendKeys("UserSendEmailLoginFailure");
	 	
	 	//Selected Role As select Role as SORestForEntryRoleExclusion
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
	 	createUserERPRoleDropDown.sendKeys("SORestForEntryRoleExclusion");
	 	createUserERPRoleDropDown.sendKeys(Keys.TAB);
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
	 	createUserPasswordPolicyDropdown.sendKeys("Alpha Numeric Special Star with all options");
	 	createUserPasswordPolicyDropdown.sendKeys(Keys.TAB);
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
	 	 createUserPasswordTxt.sendKeys("UserSendEmailLoginFailure@4");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
	 	 createUserPasswordConformTxt.sendKeys("UserSendEmailLoginFailure@4");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
	 	 createUserNameTxt.sendKeys("UserSendEmailLoginFailure");
	 	 createUserLoginAbbrivationTxt.sendKeys("USELF");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
	 	 createUserSecurityQuestionDropDown.click();
	 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
	 	 createUserSecurityAnswerTxt.sendKeys("blue");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
	 	 createUserAdditionalInfoTab.click();
	 	 
	 	Thread.sleep(2000);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
	 	 createUserEmailTxt.sendKeys("testfail@gmail.com");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
	 	 Select user=new Select(createUserUserTypeIcon);
	 	 user.selectByVisibleText("Customer");
	 	 
	 	Thread.sleep(2000);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailNotificationChkbox));
	 	 sendEmailNotificationChkbox.click();
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailOnLoginFaliureChkbox));
	 	 emailOnLoginFaliureChkbox.click();
	 	 
	 	 Thread.sleep(2000);
	 	 
	 	 String act=createUserUserTypeIcon.getAttribute("value");
	 	 String exp="2";
	 	 
	 	 
	 	Thread.sleep(2000);
	 	 
	   if (sendEmailNotificationChkbox.isSelected() && emailOnLoginFaliureChkbox.isSelected() && act.equalsIgnoreCase(exp))
	 	{
	 		
	 		 System.out.println(" Pass: Send Email Notification  ChkBox Is Checked And User Type is Selected As Customer ");
	 		 
	 		 Thread.sleep(3000);
	 		 
	 		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 		 createUserSaveIcon.click();
	 	 
	 		    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
	 		 	String Actdata=newErrorMessage.getText();
	 			String Expdata="new user created successfully";
	 			System.out.println(Actdata);
	 			
	 			 
	 			if (Actdata.contains(Expdata)) 
	 		   {
	 				System.out.println("Pass: UserSendEmailLoginFailure Create Successfully");
	                if(newErrorMessageCloseBtn.isDisplayed())
	                {
	               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	    	 			newErrorMessageCloseBtn.click();	 
	                }
			 		excelReader.setCellData(xlfile, "Sheet4", 216, 9, resPass);
			 		return true;
			 	} 
			 	else 
			 	{
			 		 
			 		System.out.println("Fail : Displayed Create User Screen");
			 		excelReader.setCellData(xlfile, "Sheet4", 216, 9, resFail);
	 				newErrorMessageCloseBtn.click();
	 				return false;
	 			}
	 	 
	 	 }
	 	 else
	 	 {
	 		 System.out.println(" Fail: Do Not Lock  ChkBox Is Checked ");
	 		 return false;
	 	 }
	 }
	 
	 

	 public boolean checkCreateUserwithBlockDateandTime() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	 	Thread.sleep(5000);
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
	 	createUserIcon.click();
		 
		Thread.sleep(2000);
		 
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
	 	createUserUserInformationTab.click();
	 	
	 	Thread.sleep(2000);
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
	 	createUserLoginNameTxt.sendKeys("UserBlockWithTime");
	 	
	 	//Selected Role As select Role as RoleWithAllProTransRight
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
	 	createUserERPRoleDropDown.sendKeys("RoleWithAllProTransRight");
	 	createUserERPRoleDropDown.sendKeys(Keys.TAB);
	 	
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
	 	 createUserPasswordTxt.sendKeys("susu");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
	 	 createUserPasswordConformTxt.sendKeys("susu");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
	 	 createUserNameTxt.sendKeys("UserBlockWithTime");
	 	 createUserLoginAbbrivationTxt.sendKeys("UBWT");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
	 	 createUserSecurityQuestionDropDown.click();
	 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
	 	 createUserSecurityAnswerTxt.sendKeys("blue");
	 	 
	 	Thread.sleep(2000);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
	 	 createUserAdditionalInfoTab.click();
	 	 
	 	Thread.sleep(2000);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
	 	 createUserEmailTxt.sendKeys("Test@gmail.com");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
	 	 Select user=new Select(createUserUserTypeIcon);
	 	 user.selectByVisibleText("Customer");
	 	 
	 	Thread.sleep(2000);
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionsTab));
	 	 createUserRestrictionsTab.click();
	 	
	 	Thread.sleep(2000);
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(resTabFromDateChkBox));
	 	if (resTabFromDateChkBox.isDisplayed() && resTabToDateChkBox.isDisplayed() && resTabWorkingHoursToChkbox.isDisplayed()
	 			&& resTabWorkingHoursFromChkbox.isDisplayed()&&resTabSelectAllChkbox.isDisplayed()&&resTabMondayChkbox.isDisplayed()
	 			&& resTabTuesdayChkbox.isDisplayed() && resTabWednesdayChkbox.isDisplayed() && resTabThursdaychkbox.isDisplayed()
	 			&& resTabFirdayChkbox.isDisplayed() && resTabSaturdayChkbox.isDisplayed()&& resTabDomainTxt.isDisplayed()
	 			&& resTabDomainNameTxtArea.isDisplayed()) 
	 	{
	 		 System.out.println(" Pass: Dispalyed Resttriction Tab ");
		 		excelReader.setCellData(xlfile, "Sheet4", 217, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 217, 9, resFail);
	 		return false;
	 	}
	 	
	 }



	 @FindBy(xpath="//input[@id='startTime']")
	 private static WebElement startTimeTxt;


	 @FindBy(xpath="//input[@id='endTime']")
	 private static WebElement EndTimeTxt;


	 public boolean  checkCurrentTimewithLessThanCurrentTimeInRestrictionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	 	
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
           Thread.sleep(3000);
	 	 
	 	   startTimeTxt.click();
	 	  
	 	    startTimeTxt.sendKeys(Keys.LEFT,Keys.LEFT);
	 		startTimeTxt.sendKeys("180000");
	 		
	 		Thread.sleep(3000);
	 		
	 		EndTimeTxt.sendKeys(Keys.LEFT,Keys.LEFT);
	 		EndTimeTxt.sendKeys("172500");
	 		
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 		createUserSaveIcon.click();

	 		
	 		   getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
	 			String Actdata=newErrorMessage.getText();
	 			String Expdata="Working Hours End time can not be less than Start time";
	 			System.out.println(Actdata);
	 			
	 			 
	 			if (Actdata.contains(Expdata)) 
	 		  {
	 				System.out.println("Pass: UserBlockWithDate Create Successfully");
	                if(newErrorMessageCloseBtn.isDisplayed())
	                {
	               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	    	 			newErrorMessageCloseBtn.click();	 
	                }
			 		excelReader.setCellData(xlfile, "Sheet4", 218, 9, resPass);
			 		return true;
			 	} 
			 	else 
			 	{
			 		 
			 		System.out.println("Fail : Displayed Create User Screen");
			 		excelReader.setCellData(xlfile, "Sheet4", 218, 9, resFail);
	 				newErrorMessageCloseBtn.click();
	 				return false;
	 			}
	 		
	 		
	 }



	 @FindBy(xpath="//input[@id='endDate']")
	 private static WebElement endDateTxt;


	 public boolean  checkwithMoreThanCurrentTimeInRestrictionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
           Thread.sleep(2000);
           
	 	   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(startTimeTxt));
	 	   startTimeTxt.click();
	 	  
	 	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(startTimeTxt));
	 	    startTimeTxt.sendKeys(Keys.LEFT,Keys.LEFT);
	 		startTimeTxt.sendKeys("180000");
	 		
	 		Thread.sleep(3000);
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(EndTimeTxt));
	 		EndTimeTxt.sendKeys(Keys.LEFT,Keys.LEFT);
	 		EndTimeTxt.sendKeys("182500");
	 		
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(resTabWorkingHoursToChkbox));
	 		resTabWorkingHoursToChkbox.click();
	 		
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(resTabWorkingHoursFromChkbox));
	 		resTabWorkingHoursFromChkbox.click();
	 		
	 		String Currentdate=endDateTxt.getAttribute("value");
	 		System.out.println(Currentdate);
	 		
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 		createUserSaveIcon.click();
	 		
	 		   getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
	 			String Actdata=newErrorMessage.getText();
	 			String Expdata="new user created successfully";
	 			System.out.println(Actdata);
	 			
	 			 
	 			if (Actdata.contains(Expdata)) 
	 		  {
	 				System.out.println("Pass: UserBlockWithTime Create Successfully");
	                if(newErrorMessageCloseBtn.isDisplayed())
	                {
	               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	    	 			newErrorMessageCloseBtn.click();	 
	                }
			 		excelReader.setCellData(xlfile, "Sheet4", 219, 9, resPass);
			 		return true;
			 	} 
			 	else 
			 	{
			 		 
			 		System.out.println("Fail : Displayed Create User Screen");
			 		excelReader.setCellData(xlfile, "Sheet4", 219, 9, resFail);
	 				newErrorMessageCloseBtn.click();
	 				return false;
	 			}
	 		
	 		
	 }

	 
	 public boolean checkCreateGroup() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	     Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCreateGroupIcon));
			createUserCreateGroupIcon.click();

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Please provide the group name";
			System.out.println(Actdata);

			if (Actdata.equalsIgnoreCase(Expdata)) 
			{
				System.out.println(" Pass: Add Edit Master Profile Profile is Saved Succesfully");
                if(newErrorMessageCloseBtn.isDisplayed())
                {
               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
    	 			newErrorMessageCloseBtn.click();	 
                }
		 		excelReader.setCellData(xlfile, "Sheet4", 220, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 220, 9, resFail);
				newErrorMessageCloseBtn.click();
				return false;
			}	
	 }
	 
	 public boolean CheckCreateGroupWithGroupName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	     
			Thread.sleep(2000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
			createUserLoginNameTxt.sendKeys("UserGroup");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			 String LoginName=createUserLoginNameTxt.getAttribute("value");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Please assign role for this group";
			System.out.println(Actdata);

			if (Actdata.equalsIgnoreCase(Expdata) && LoginName.equalsIgnoreCase("UserGroup")) 
			{
				System.out.println(" Pass:Create Group With Group Name");
                if(newErrorMessageCloseBtn.isDisplayed())
                {
               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
    	 			newErrorMessageCloseBtn.click();	 
                }
				excelReader.setCellData(xlfile, "Sheet4", 221, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 221, 9, resFail);
				newErrorMessageCloseBtn.click();
				return false;
			}	
			

		}
	 
	 
	 
	 
	 public boolean CheckCreateGroupWithMandatoryFileds() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
			Thread.sleep(2000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
			createUserERPRoleDropDown.click();
			createUserERPRoleDropDown.sendKeys("PurchaseINVAndFA");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "New group created successfully";
			System.out.println(Actdata);

			if (Actdata.equalsIgnoreCase(Expdata)) 
			{
				System.out.println(" Pass:  New Group Created Succesfully");
                if(newErrorMessageCloseBtn.isDisplayed())
                {
               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
    	 			newErrorMessageCloseBtn.click();	 
                }
				excelReader.setCellData(xlfile, "Sheet4", 222, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 222, 9, resFail);
				newErrorMessageCloseBtn.click();
				return false;
			}	
			

		}
	 
	 
	 
	 
	 @FindBy (xpath="//span//span[contains(text(),'UserGroup')]")
	 private static WebElement UserGroupOption; 
	 
	 
	 public boolean checkCreationOFUserUnderCreatedGroup() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		     Thread.sleep(2000);
		    
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSerachTxt));
		 	 createUserSerachTxt.click();
		 	 createUserSerachTxt.sendKeys("UserGroup");
		 
		 	 Thread.sleep(3000);
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(UserGroupOption));
		 	 UserGroupOption.click();
		 	
		 	 Thread.sleep(2000);
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		 	 createUserIcon.click();
		 	
		 	 Thread.sleep(2000);
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		 	 createUserLoginNameTxt.sendKeys("UserUGChangePassword");
		 	
		 	 //Selected Role As select Role as PurchaseINVAndFA
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		 	 createUserERPRoleDropDown.sendKeys("PurchaseINVAndFA");
		 	 createUserERPRoleDropDown.sendKeys(Keys.TAB);
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		 	 createUserPasswordPolicyDropdown.sendKeys("Simple With Cannot Change Password");
		 	 createUserPasswordPolicyDropdown.sendKeys(Keys.TAB);
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		 	 createUserPasswordTxt.sendKeys("ss");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
		 	 createUserPasswordConformTxt.sendKeys("ss");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		 	 createUserNameTxt.sendKeys("UserUGChangePassword");
		 	 createUserLoginAbbrivationTxt.sendKeys("UUGCP");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		 	 createUserSecurityQuestionDropDown.click();
		 	 
		 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		 	 createUserSecurityAnswerTxt.sendKeys("blue");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		 	 createUserAdditionalInfoTab.click();
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		 	 createUserEmailTxt.sendKeys("iii@gmail.com");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
		 	 Select user=new Select(createUserUserTypeIcon);
		 	 user.selectByVisibleText("Customer");
		 	
		 	 Thread.sleep(2000);
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 		 createUserSaveIcon.click();
	 		
	 		 getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
	 		 String Actdata=newErrorMessage.getText();
	 		 String Expdata="new user created successfully";
	 		 System.out.println(Actdata);
	 			
	 			 
	 		 if (Actdata.contains(Expdata)) 
	 		  {
	 				System.out.println("Pass: UserUnderGroup Create Successfully");
	                if(newErrorMessageCloseBtn.isDisplayed())
	                {
	               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	    	 			newErrorMessageCloseBtn.click();	 
	                }
					excelReader.setCellData(xlfile, "Sheet4", 223, 9, resPass);
			 		return true;
			 	} 
			 	else 
			 	{
			 		 
			 		System.out.println("Fail : Displayed Create User Screen");
			 		excelReader.setCellData(xlfile, "Sheet4", 223, 9, resFail);
	 				newErrorMessageCloseBtn.click();
	 				return false;
	 			}
	 }
	 
	 
	 
	 @FindBy (xpath="//span//span[contains(text(),'UserForDelete')]")
	 private static WebElement UserForDeleteOption; 
	 
	 
	 public boolean checkDeleteInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		    Thread.sleep(3000);
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(UserGroupOption));
		 	UserGroupOption.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		 	createUserIcon.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		 	createUserLoginNameTxt.sendKeys("UserForDelete");
		 	
		 	//Selected Role As select Role as PurchaseINVAndFA
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		 	createUserERPRoleDropDown.sendKeys("PurchaseINVAndFA");
		 	createUserERPRoleDropDown.sendKeys(Keys.TAB);
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		 	 createUserPasswordTxt.sendKeys("12345");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
		 	 createUserPasswordConformTxt.sendKeys("12345");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		 	 createUserNameTxt.sendKeys("UserForDelete");
		 	 createUserLoginAbbrivationTxt.sendKeys("UUG");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		 	 createUserSecurityQuestionDropDown.click();
		 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		 	 createUserSecurityAnswerTxt.sendKeys("blue");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		 	 createUserAdditionalInfoTab.click();
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		 	 createUserEmailTxt.sendKeys("erp@gmail.com");
		 	 
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
		 	 Select user=new Select(createUserUserTypeIcon);
		 	 user.selectByVisibleText("Customer");
		 	
		 	 Thread.sleep(2000);
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 		 createUserSaveIcon.click();
		 
	 		 
	 		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 		 newErrorMessageCloseBtn.click();
	 		 
             Thread.sleep(5000);
             
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSerachTxt));
		 	 createUserSerachTxt.click();
		 	 createUserSerachTxt.sendKeys("UserForDelete");
		 	 
	 		 Thread.sleep(3000);
	 		 
		 	 UserForDeleteOption.click();
	 		 
		 	 Thread.sleep(3000);
		 	
	 		 createUserDeleteIcon.click();
	 		 
	 		Thread.sleep(5000);
	    	
	        String message= getDriver().switchTo().alert().getText();
	       
	        System.out.println(" Delete Pop Message"     +message);
	         
	        String exp,act;
	        
	        act=getDriver().switchTo().alert().getText();
	        exp="Are you sure Delete this User?";
	        
	        
	        if (act.equalsIgnoreCase(exp)) 
	    	   {
	    			System.out.println(" Pass: displayed message as Are you Sure want to Delete with Yes and No buttons");
	    			excelReader.setCellData(xlfile, "Sheet4", 224, 9, resPass);
	    			return true;
	    		} 
	    		else 
	    		{
	    			System.out.println("Fail:  displayed message as Are you Sure want to Delete with Yes and No buttons");
	    			excelReader.setCellData(xlfile, "Sheet4", 224, 9, resFail);
	    			return false;
	    		}
	 		 
	 		 
	 }
	 
	 
	 public boolean  checkNoOptionInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 
	 	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
	 	Thread.sleep(3000);
	 	
	 	getDriver().switchTo().alert().dismiss();
	 	
	 	Thread.sleep(3000);
	 	
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
	 	createUserNameTxt.click();
	 	
	 	String actUserName=createUserNameTxt.getAttribute("value");
	 	String expUserName="UserForDelete";
	 	
	 	if (actUserName.equalsIgnoreCase(expUserName))
	 	{
	 		 System.out.println(" Pass: UserForDelete is Not Deleted Successfully");
	 		 excelReader.setCellData(xlfile, "Sheet4", 225, 9, resPass);
	 		 return true;
	 	} 
	 	else 
	 	{
	 		 System.out.println(" Fail: UserForDelete is Not Deleted Successfully");
	 		 excelReader.setCellData(xlfile, "Sheet4", 225, 9, resFail);
	 		 return false;
	 	}
	 	
	 	
	 	
	 }
	 	
	 	
	 	
	 	public boolean SelectagainUserandClickonDeleteButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 	{
	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		
	          Thread.sleep(2000);
	          
	      	
	          
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleDeleteIcon));
	 		createRoleDeleteIcon.click();
	         
	         Thread.sleep(2000);
	         
	         
	        String message= getDriver().switchTo().alert().getText();
	        
	         System.out.println(" Delete Pop Message"  +message);
	         
	         String exp,act;
	         
	         act=getDriver().switchTo().alert().getText();
	         exp="Are you sure Delete this User?";
	         
	         
	         if (act.equalsIgnoreCase(exp)) 
	 		   {
	 				System.out.println(" Pass: displayed message as Are you Sure want to Delete ");
	 				excelReader.setCellData(xlfile, "Sheet4", 226, 9, resPass);
	 				return true;
	 			} 
	 			else 
	 			{
	 				System.out.println("Fail:  displayed message as Are you Sure want to Delete ");
	 				excelReader.setCellData(xlfile, "Sheet4", 226, 9, resFail);
	 				return false;
	 			}
	 	}
	 	
	 	
	 	
	 	
	 	public boolean checkYesOptioninDeleteUserPopMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 	{

	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		
	 		 getDriver().switchTo().alert().accept();
	 		 
	 		 Thread.sleep(2000);
	 		 
	 		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 			String Actdata=newErrorMessage.getText();
	 			String Expdata="User is deleted successfully";
	 			System.out.println(Actdata);
	 			
	 			
	 		   if (Actdata.equalsIgnoreCase(Expdata)) 
	 		   {
	 				System.out.println(" Pass: UserForDelete is Deleted Successfully");
	 				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	                if(newErrorMessageCloseBtn.isDisplayed())
	                {
	               	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	    	 			newErrorMessageCloseBtn.click();	 
	                }
	 				excelReader.setCellData(xlfile, "Sheet4", 227, 9, resPass);
	 				return true;
	 			} 
	 			else 
	 			{
	 				System.out.println("Fail: UserForDelete is Deleted Successfull");
	 				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
 				    newErrorMessageCloseBtn.click();
 					excelReader.setCellData(xlfile, "Sheet4", 227, 9, resFail);
	 				return false;
	 			}
	 	}
	 	


	 @FindBy(xpath="//li[@id='1']")
	 private static WebElement AccountMaster;

	 @FindBy(xpath="//li[@id='2']")
	 private static WebElement ItemMaster;

	 @FindBy(xpath="//li[@id='3']")
	 private static WebElement DepartmentMaster;

	 @FindBy(xpath="//li[@id='4']")
	 private static WebElement WarehouseMaster;

	 @FindBy(xpath="//li[@id='5']")
	 private static WebElement CostCentreMaster;

	 @FindBy(xpath="//li[@id='6']")
	 private static WebElement LocationMaster;

	 @FindBy(xpath="//li[@id='7']")
	 private static WebElement RegionMaster;

	 @FindBy(xpath="//li[@id='8']")
	 private static WebElement CountryMaster;

	 @FindBy(xpath="//li[@id='9']")
	 private static WebElement StateMaster;

	 @FindBy(xpath="//li[@id='10']")
	 private static WebElement CityMaster;

	 @FindBy(xpath="//li[@id='11']")
	 private static WebElement UnitsMaster;

	 @FindBy(xpath="//li[@id='12']")
	 private static WebElement BinsMaster;

	 @FindBy(xpath="//li[@id='13']")
	 private static WebElement TaxCodeMaster;

	 @FindBy(xpath="//li[@id='300']")
	 private static WebElement PlantMaster;

	 @FindBy(xpath="//li[@id='301']")
	 private static WebElement SupplyAreaMaster;

	 @FindBy(xpath="//li[@id='302']")
	 private static WebElement MaintanceParameterMaster;

	 @FindBy(xpath="//li[@id='303']")
	 private static WebElement SafetyInstructionsMaster;

	 @FindBy(xpath="//li[@id='304']")
	 private static WebElement CapacityMaster;

	 @FindBy(xpath="//li[@id='305']")
	 private static WebElement WorkCentreMaster;

	 @FindBy(xpath="//li[@id='306']")
	 private static WebElement holidayMaster;

	 @FindBy(xpath="//li[@id='307']")
	 private static WebElement ProcessMaster;

	 @FindBy(xpath="//li[@id='500']")
	 private static WebElement QcFailureREsonMaster;

	 @FindBy(xpath="//li[@id='501']")
	 private static WebElement QCParametersMaster;

	 @FindBy(xpath="//li[@id='600']")
	 private static WebElement InsurenceMaster;

	 @FindBy(xpath="//li[@id='601']")
	 private static WebElement FixedAssetMaster;

	 @FindBy(xpath="//li[@id='700']")
	 private static WebElement BreakDownStandedReasonMaster;

	 @FindBy(xpath="//li[@id='800']")
	 private static WebElement EmployeeMaster;

	 @FindBy(xpath="//li[@id='801']")
	 private static WebElement DesigniationMaster;

	 @FindBy(xpath="//li[@id='802']")
	 private static WebElement PositionMaster;

	 @FindBy(xpath="//li[@id='803']")
	 private static WebElement QualificationMaster;

	 @FindBy(xpath="//li[@id='804']")
	 private static WebElement SpecializationMaster;

	 @FindBy(xpath="//li[@id='805']")
	 private static WebElement NationalityMaster;

	 @FindBy(xpath="//li[@id='806']")
	 private static WebElement SkillTypeMaster;

	 @FindBy(xpath="//li[@id='807']")
	 private static WebElement SkillMaster;

	 @FindBy(xpath="//li[@id='808']")
	 private static WebElement SourceTypeMaster;

	 @FindBy(xpath="//li[@id='809']")
	 private static WebElement SourceMaster;

	 @FindBy(xpath="//li[@id='810']")
	 private static WebElement RoundTypeMaster;

	 @FindBy(xpath="//li[@id='811']")
	 private static WebElement GradeMaster;

	 @FindBy(xpath="//li[@id='812']")
	 private static WebElement ScaleMaster;

	 @FindBy(xpath="//li[@id='813']")
	 private static WebElement CourseTypeMaster;

	 @FindBy(xpath="//li[@id='814']")
	 private static WebElement CourseMaster;

	 @FindBy(xpath="//li[@id='815']")
	 private static WebElement TranierMaster;

	 @FindBy(xpath="//li[@id='816']")
	 private static WebElement AirlineSectorMaster;

	 @FindBy(xpath="//li[@id='817']")
	 private static WebElement VenueMaster;

	 @FindBy(xpath="//li[@id='818']")
	 private static WebElement RequestTypesMaster;

	 @FindBy(xpath="//li[@id='819']")
	 private static WebElement ExpenceClaimsMaster;

	 @FindBy(xpath="//li[@id='820']")
	 private static WebElement EmpoloyeeBankMaster;

	 @FindBy(xpath="//li[@id='821']")
	 private static WebElement TravelAgentMaster;

	 @FindBy(xpath="//li[@id='822']")
	 private static WebElement JobGradeMaster;

	 @FindBy(xpath="//li[@id='1100']")
	 private static WebElement OutletMaster;

	 @FindBy(xpath="//li[@id='1101']")
	 private static WebElement CounterMaster;

	 @FindBy(xpath="//li[@id='1102']")
	 private static WebElement MemberTypeMaster;

	 @FindBy(xpath="//li[@id='1103']")
	 private static WebElement GiftVoucherDefMaster;

	 @FindBy(xpath="//li[@id='1104']")
	 private static WebElement CategoryMaster;

	 @FindBy(xpath="//li[@id='1105']")
	 private static WebElement BankCardTypeMaster;

	 @FindBy(xpath="//li[@id='1106']")
	 private static WebElement MemberMaster;

	 @FindBy(xpath="//li[@id='1107']")
	 private static WebElement DiscountVoucherDefMaster;

	 @FindBy(xpath="//li[@id='1108']")
	 private static WebElement FloorMaster;

	 @FindBy(xpath="//li[@id='1109']")
	 private static WebElement SectionMaster;

	 @FindBy(xpath="//li[@id='1110']")
	 private static WebElement TableMaster;

	 @FindBy(xpath="//li[@id='1111']")
	 private static WebElement GuestMaster;

	 @FindBy(xpath="//li[@id='1112']")
	 private static WebElement VoidRemarksMaster;

	 @FindBy(xpath="//li[@id='1113']")
	 private static WebElement MemberCardDefMaster;

	 @FindBy(xpath="//li[@id='1114']")
	 private static WebElement ReturnRemarksMaster;

	 @FindBy(xpath="//li[@id='1115']")
	 private static WebElement KichenDisplaySystemMaster;

	 @FindBy(xpath="//li[@id='1116']")
	 private static WebElement DeliveryTimeIntervalMaster;
	                
	 @FindBy(xpath="//li[@id='1117']")
	 private static WebElement EpaymentMaster;	

	 @FindBy(xpath="//td[@id='restrictionEntryTable_col_1-1']")
	 private static WebElement gridMasterToClick;





	 public boolean checkCreateUserRestrictionForEntryAccountsReportAndView() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
 		excelReader=new ExcelReader(POJOUtility.getExcelPath());
 		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		
	 	 Thread.sleep(4000);
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
	 	 createUserIcon.click();
	 	
	 	 Thread.sleep(4000);
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
	 	 createUserLoginNameTxt.sendKeys("UserWithAccRestrictionsReportView");
	 	
	 	 //Selected Role As select Role as SLALRole
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
	 	 createUserERPRoleDropDown.sendKeys("SampleRole1");
	 	 createUserERPRoleDropDown.sendKeys(Keys.TAB);
	 	
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
	 	 createUserPasswordPolicyDropdown.click();
	 	 Select Password=new Select(createUserPasswordPolicyDropdown);
	 	 Password.selectByVisibleText("Alpha Numeric Special Star with all options");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
	 	 createUserPasswordTxt.sendKeys("Test@123456789");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
	 	 createUserPasswordConformTxt.sendKeys("Test@123456789");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
	 	 createUserNameTxt.sendKeys("UserWithAccRestrictionsReportView");
	 	 createUserLoginAbbrivationTxt.sendKeys("UWARRV");
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
	 	 createUserSecurityQuestionDropDown.click();
	 	 createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
	 	 createUserSecurityAnswerTxt.sendKeys("blue");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
	 	 createUserAdditionalInfoTab.click();
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
	 	 createUserEmailTxt.sendKeys("iiiiizzzz@gmail.com");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
	 	 Select user=new Select(createUserUserTypeIcon);
	 	 user.selectByVisibleText("Customer");
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
	 	 createUserRestrictionforentryTab.click();
	 	
	 	 Thread.sleep(2000);
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountMaster));
	 	 AccountMaster.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridMasterToClick));
	 	 gridMasterToClick.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridMasterAfterClick));
	 	 gridMasterAfterClick.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridMasterAfterClick));
	 	 gridMasterAfterClick.sendKeys("vendor");
	 	 
	 	 Thread.sleep(2000);
	 	 
	 	 gridMasterAfterClick.sendKeys(Keys.ENTER);
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
	 	 gridEntryFirstRowChkBox.click();
	  	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
	 	 gridReportFirstRowChkBox.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
	 	 gridViewFirstRowChkBox.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
	 	 
	 	 if (gridEntryFirstRowChkBox.isSelected()&&gridReportFirstRowChkBox.isSelected()&& gridViewFirstRowChkBox.isDisplayed()) 
	 	 {
	 		System.out.println(" Pass: The check Boxes in the Grid Are Checked ");
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 		createUserSaveIcon.click();

	 		    getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
	 			String Actdata=newErrorMessage.getText();
	 			String Expdata="new user created successfully";
	 			System.out.println(Actdata);
	 			
	 			 
	 			if (Actdata.contains(Expdata)) 
	 		    {
	 				System.out.println("Pass: UserWithAccRestrictions Create Successfully");
	 				newErrorMessageCloseBtn.click();
	 		 		 excelReader.setCellData(xlfile, "Sheet4", 228, 9, resPass);
	 		 		 return true;
	 		 	} 
	 		 	else 
	 		 	{
	 		 		 System.out.println(" Fail: UserForDelete is Not Deleted Successfully");
	 		 		 excelReader.setCellData(xlfile, "Sheet4", 228, 9, resFail);
	 				newErrorMessageCloseBtn.click();
	 				return false;
	 			}
	 		
	 		
		 	}
		 	else 
		 	{
		 		System.out.println(" Fail: The check Boxes in the Grid Are Checked ");
		 		excelReader.setCellData(xlfile, "Sheet4", 228, 9, resFail);
		 		return false;
		 	}
	 }










	 @FindBy(xpath="//span[contains(text(),'UserWithPurchaseFAINV')]")
	 private static WebElement loadUserWithPurchaseFAINV;

	 @FindBy(xpath="//span[contains(text(),'UserAccPOTransRestrictions')]")
	 private static WebElement loadUserAccPOTransRestrictions;

	 @FindBy(xpath="//span[contains(text(),'UserItemPOTransRestrictions')]")
	 private static WebElement loadUserItemPOTransRestrictions;

	 @FindBy(xpath="//span[contains(text(),'UserItemPOExclusion')]")
	 private static WebElement loadUserItemPOExclusion;

	 @FindBy(xpath="//span[contains(text(),'UserWithAccDisableRole')]")
	 private static WebElement loadUserWithAccDisableRole;

	 @FindBy(xpath="//span[contains(text(),'UserWithDNotLock')]")
	 private static WebElement loadUserWithDNotLock;

	 @FindBy(xpath="//span[contains(text(),'UserWithAllowMulLogin')]")
	 private static WebElement loadUserWithAllowMulLogin;

	 @FindBy(xpath="//span[contains(text(),'UserSendEmailLoginSuccess')]")
	 private static WebElement loadUserSendEmailLoginSuccess;

	 @FindBy(xpath="//span[contains(text(),'UserSendEmailLoginFailure')]")
	 private static WebElement loadUserSendEmailLoginFailure;

	 @FindBy(xpath="//span[contains(text(),'UserBlockWithTime')]")
	 private static WebElement loadUserBlockWithTime;

	 @FindBy(xpath="//span[contains(text(),'UserUGChangePassword')]")
	 private static WebElement createUserUGChangePassword;

	 @FindBy(xpath="//input[@id='searchUserLoadUsertxtBox']")
	 private static WebElement createUserloadSearchTxt;
	 
	 @FindBy(xpath="//button[contains(text(),'Load')]")
	 private static WebElement CreateUserloadLoadBtn;

	 @FindBy(xpath="//div[@id='LoadForm']//button[@class='Fbutton'][contains(text(),'Cancel')]")
	 private static WebElement createUserloadCancelBtn;

	 @FindBy(xpath="//div[@id='LoadForm']//button[@class='close'][contains(text(),'×')]')]")
	 private static WebElement loadCloseIcon;

	 @FindBy(xpath="//i[@class='icon-load-from icon-font6 ImagesinArabic']")
	 private static WebElement createUserLoadIcon;
	 
	 
	 @FindBy(xpath="//div[@id='controlBtns']")
	 private static WebElement createUserCancelButton;

	 public boolean checkCreateUseWithLoadFromUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		
			
		 	Thread.sleep(2000);
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		 	createUserIcon.click();
	
		 	Thread.sleep(2000);
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoadIcon));
		 	createUserLoadIcon.click();
		 	
		 	
		 	Thread.sleep(3000);
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadUserWithPurchaseFAINV));
		 	
		 	if (loadUserWithPurchaseFAINV.isDisplayed() && loadUserAccPOTransRestrictions.isDisplayed() && loadUserWithDNotLock.isDisplayed()&& 
		 			loadUserWithAllowMulLogin.isDisplayed() && loadUserSendEmailLoginSuccess.isDisplayed()&& loadUserItemPOTransRestrictions.isDisplayed() && 
		 			loadUserBlockWithTime.isDisplayed() && loadUserItemPOExclusion.isDisplayed() && loadUserWithAccDisableRole.isDisplayed() && 
		 			loadUserSendEmailLoginSuccess.isDisplayed() && loadUserSendEmailLoginFailure.isDisplayed() && createUserUGChangePassword.isDisplayed() && 
		 			createUserloadCancelBtn.isDisplayed() && createUserloadSearchTxt.isDisplayed() && CreateUserloadLoadBtn.isDisplayed() && 
		 			createUserLoadIcon.isDisplayed()) 
		 	{
		 		System.out.println(" Pass: display Load From the Create User Screen with all saved users");
		 		
		 		 excelReader.setCellData(xlfile, "Sheet4", 229, 9, resPass);
		 		 return true;
		 	} 
		 	else 
		 	{
		 		 System.out.println(" Fail: UserForDelete is Not Deleted Successfully");
		 		 excelReader.setCellData(xlfile, "Sheet4", 229, 9, resFail);
		 	
		 		return false;
		 	}
	 }
	 
	 

	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]")
	 private static WebElement getLoadUser;
	 
	 public boolean checkSelectionOfUserInLoadFromButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		
			
		 	Thread.sleep(2000);
		 	
		 	createUserloadSearchTxt.click();
		 	createUserloadSearchTxt.sendKeys("UserAccPOTransRestrictions");
		 	
		 	Thread.sleep(2000);
		 	
		 	getLoadUser.click();
		 	
		 	Thread.sleep(2000);
		 	
		    CreateUserloadLoadBtn.click();
		    
		    
		    Thread.sleep(2000);
		 	
		 	if(createUserNameTxt.getAttribute("value").equalsIgnoreCase("UserPOTransRestrictions"))
		 	{
		 		excelReader.setCellData(xlfile, "Sheet4", 230, 9, resPass);
		 		return true;
		 	}
		 	else
		 	{
		 		excelReader.setCellData(xlfile, "Sheet4", 230, 9, resFail);
		 		return false;
		 	}
		 	
	 }

	

	 
	 
	 

	 public boolean checkSaveUserWithLoadFromAsNameMandatory()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	    String Actdata=newErrorMessage.getText();
	 		String Expdata="Please Provide Username";
	 		System.out.println(Actdata);
	 		
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 231, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 231, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	
	 }
	 
	 
	 
	 public boolean checkSaveUserWithLoadFromAsEmail()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		 createUserLoginNameTxt.sendKeys("UserWithLoadOption");
	 	 
	     Thread.sleep(3000);
	     
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	 String Actdata=newErrorMessage.getText();
	 		String Expdata="Email id already assign toUserPOTransRestrictions";
	 		System.out.println(Actdata);
	 		
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 232, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 232, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	
	 }
	 

	 public boolean checkSaveUserWithLoadFrom()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
			 
		 
		 createUserAdditionalInfoTab.click();
		 
		 createUserEmailTxt.click();
		 createUserEmailTxt.clear();
		 createUserEmailTxt.sendKeys("UserWithLoadOption@gmail.com");
		 
		 Thread.sleep(3000);
		 
		 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
	 	 createUserSaveIcon.click();
	 	
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
	 		
	 	 String Actdata=newErrorMessage.getText();
	 		String Expdata="new user created successfully";
	 		System.out.println(Actdata);
	 		
	 		
	 	   if (Actdata.equalsIgnoreCase(Expdata)) 
	 	   {
	 			System.out.println("  Pass: Should Provide User Name ");
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 233, 9, resPass);
		 		return true;
		 	} 
		 	else 
		 	{
		 		 
		 		System.out.println("Fail : Displayed Create User Screen");
		 		excelReader.setCellData(xlfile, "Sheet4", 233, 9, resFail);
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
	 			newErrorMessageCloseBtn.click();
	 			return false;
	 		}
	 	
	 }
	 
	 
	 
	 

		//Password Policy Validation in Create User
			
		public boolean CheckPasswordPolicyForSimpleinCraeteUserScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(2000);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
			createUserIcon.click();

			Thread.sleep(4000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
			createUserLoginNameTxt.click();
			createUserLoginNameTxt.sendKeys("Password");

			// Selected Role As select Role as AllProfiles
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
			createUserERPRoleDropDown.click();
			createUserERPRoleDropDown.sendKeys("SampleRole1");
			createUserERPRoleDropDown.sendKeys(Keys.TAB);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
			createUserPasswordPolicyDropdown.click();
			Select Password = new Select(createUserPasswordPolicyDropdown);
			Password.selectByVisibleText("Simple Policy");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.sendKeys("12");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
			createUserPasswordConformTxt.sendKeys("12");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
			createUserNameTxt.sendKeys("Password");
			createUserLoginAbbrivationTxt.sendKeys("Password");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
			createUserSecurityQuestionDropDown.click();
			createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN, Keys.END, Keys.ARROW_UP);
			createUserSecurityAnswerTxt.sendKeys("blue");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
			createUserAdditionalInfoTab.click();

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
			createUserEmailTxt.sendKeys("tyu@gmail.com");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeIcon));
			Select user = new Select(createUserUserTypeIcon);
			user.selectByVisibleText("Customer");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Password length should be equal or greater than minimum password length 3";
			
			System.out.println(Actdata);

			if (Actdata.contains(Expdata)) 
			{
				System.out.println("Pass: Simple Policy ");
				newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 234, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:Simple Policy ");
				newErrorMessageCloseBtn.click();
		 		excelReader.setCellData(xlfile, "Sheet4", 234, 9, resFail);
				return false;
			}
			
			
		}
		
		
		
		
		
		public boolean checkAlphabetsWithDontallowPrevious() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			

	        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
			createUserUserInformationTab.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
			createUserPasswordPolicyDropdown.click();
			Select Password = new Select(createUserPasswordPolicyDropdown);
			Password.selectByVisibleText("Alphabets with Dont allow Previous as Three");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.clear();
			createUserPasswordTxt.sendKeys("1234");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
			createUserPasswordConformTxt.clear();
			createUserPasswordConformTxt.sendKeys("1234");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Only alphabets can be given in password.";
			
			System.out.println(Actdata);

			if (Actdata.contains(Expdata)) 
			{
				System.out.println("Pass: Alphabets with Dont allow Previous as Three ");
				excelReader.setCellData(xlfile, "Sheet4", 235, 9, resPass);
				newErrorMessageCloseBtn.click();
				return true;
			} else {
				System.out.println("Fail:Alphabets with Dont allow Previous as Three ");
				excelReader.setCellData(xlfile, "Sheet4", 235, 9, resFail);
				newErrorMessageCloseBtn.click();
				return false;
			}
			
			
		}
		
		
		
		

		public boolean checkAlphabetsWithNumeric() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException	
		{



			
			
	        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(5000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
			createUserPasswordPolicyDropdown.click();
			
			Thread.sleep(2000);
			
			
			Select Password = new Select(createUserPasswordPolicyDropdown);
			Password.selectByVisibleText("Alphabets With Numeric");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.clear();
			createUserPasswordTxt.sendKeys("!@#$");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
			createUserPasswordConformTxt.clear();
			createUserPasswordConformTxt.sendKeys("!@#$");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Alphabets and numerics must be given in the password.";
			
			System.out.println(Actdata);

			if (Actdata.contains(Expdata)) 
			{
				System.out.println("Pass: Alphabets With Numeric ");
				excelReader.setCellData(xlfile, "Sheet4", 236, 9, resPass);
				newErrorMessageCloseBtn.click();
				return true;
			} else {
				System.out.println("Fail: Alphabets With Numeric ");
				excelReader.setCellData(xlfile, "Sheet4", 236, 9, resFail);
				newErrorMessageCloseBtn.click();
				return false;
			}
			
			
		}
		
		
		
		

		public boolean checkAlphabetsWithNumericStar() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException	
		{
			
			
	        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
			createUserPasswordPolicyDropdown.click();
			Select Password = new Select(createUserPasswordPolicyDropdown);
			Password.selectByVisibleText("Alphabets With Numeric Star");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.clear();
			createUserPasswordTxt.sendKeys("as!@#");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
			createUserPasswordConformTxt.clear();
			createUserPasswordConformTxt.sendKeys("as!@#");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Alphabets and numerics but atleast 1 lower case and 1 upper case alphabet must be given in the password.";
			
			System.out.println(Actdata);

			if (Actdata.contains(Expdata)) 
			{
				System.out.println("Pass: Alphabets With Numeric Star ");
				excelReader.setCellData(xlfile, "Sheet4", 237, 9, resPass);
				newErrorMessageCloseBtn.click();
				return true;
			} else {
				System.out.println("Fail: Alphabets With Numeric Star ");
				excelReader.setCellData(xlfile, "Sheet4", 237, 9, resFail);
				newErrorMessageCloseBtn.click();
				return false;
			}
			
			
		}
		
		
		
		

		public boolean checkNumeric() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			
			
			
	        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
			createUserPasswordPolicyDropdown.click();
			Select Password = new Select(createUserPasswordPolicyDropdown);
			Password.selectByVisibleText("Numeric");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.clear();
			createUserPasswordTxt.sendKeys("focus");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
			createUserPasswordConformTxt.clear();
			createUserPasswordConformTxt.sendKeys("focus");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Only numerics can be given in password.";
			
			System.out.println(Actdata);

			if (Actdata.contains(Expdata)) 
			{
				System.out.println("Pass: Numeric ");
				excelReader.setCellData(xlfile, "Sheet4", 238, 9, resPass);
				newErrorMessageCloseBtn.click();
				return true;
			} else {
				System.out.println("Fail: Numeric ");
				excelReader.setCellData(xlfile, "Sheet4", 238, 9, resFail);
				newErrorMessageCloseBtn.click();
				return false;
			}
			
			
		}
		
		
		
		
		public boolean checkAlphaNumericSpecial() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
	        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
			createUserPasswordPolicyDropdown.click();
			Select Password = new Select(createUserPasswordPolicyDropdown);
			Password.selectByVisibleText("Alpha Numeric Special");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.clear();
			createUserPasswordTxt.sendKeys("1234567");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
			createUserPasswordConformTxt.clear();
			createUserPasswordConformTxt.sendKeys("1234567");
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Password must contain alphabets, numerics and special characters.";
			
			System.out.println(Actdata);

			if (Actdata.contains(Expdata)) 
			{
				System.out.println("Pass: Alpha Numeric Special ");
				excelReader.setCellData(xlfile, "Sheet4", 239, 9, resPass);
				newErrorMessageCloseBtn.click();
				return true;
			} else {
				System.out.println("Fail: Alpha Numeric Special ");
				excelReader.setCellData(xlfile, "Sheet4", 239, 9, resFail);
				newErrorMessageCloseBtn.click();
				return false;
			}
			
			
		}
		
		
		
		
		
		public boolean checkAlphaNumericSpecialStarWithAllOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
	        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
			createUserPasswordPolicyDropdown.click();
			Select Password = new Select(createUserPasswordPolicyDropdown);
			Password.selectByVisibleText("Alpha Numeric Special Star with all options");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.clear();
			createUserPasswordTxt.sendKeys("12345678912345");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
			createUserPasswordConformTxt.clear();
			createUserPasswordConformTxt.sendKeys("12345678912345");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Alphabets, numerics and special characters but atleast 1 lower case and 1 upper case alphabet must be given in the password.";
			
			System.out.println(Actdata);

			if (Actdata.contains(Expdata)) 
			{
				System.out.println("Pass: Alpha Numeric Special Star with all options ");
				excelReader.setCellData(xlfile, "Sheet4", 240, 9, resPass);
				newErrorMessageCloseBtn.click();
				return true;
			} else {
				System.out.println("Fail: Alpha Numeric Special Star with all options ");
				excelReader.setCellData(xlfile, "Sheet4", 240, 9, resFail);
				newErrorMessageCloseBtn.click();
				return false;
			}
			
			
		}
		
		
		
		
		
		public boolean checkSimpleWithCannotChangePassword() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
	        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(3000);
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
			createUserPasswordPolicyDropdown.click();
			
			Select Password = new Select(createUserPasswordPolicyDropdown);
			Password.selectByVisibleText("Simple With Cannot Change Password");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.clear();
			createUserPasswordTxt.sendKeys("1");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordConformTxt));
			createUserPasswordConformTxt.clear();
			createUserPasswordConformTxt.sendKeys("1");
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();
			
			getWebDriverWait().until(ExpectedConditions.visibilityOf(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Password length should be equal or greater than minimum password length 2";
			
			System.out.println(Actdata);

			if (Actdata.contains(Expdata)) 
			{
				System.out.println("Pass: Simple With Cannot Change Password");
				excelReader.setCellData(xlfile, "Sheet4", 241, 9, resPass);
				newErrorMessageCloseBtn.click();
				return true;
			} 
			else 
			{
				System.out.println("Fail: Simple With Cannot Change Password ");
				excelReader.setCellData(xlfile, "Sheet4", 241, 9, resFail);
				newErrorMessageCloseBtn.click();
				return false;
			}
			
			
		}
		
	 
	 
	 
	 

	 @FindBy(xpath="//input[@id='searchUsertxtBox']")
	 private static WebElement createUserSerachTxt;

	 @FindBy(xpath="//div[@id='38']//span//span[contains(text(),'UserWithProRestrictions')]")
	 private static WebElement usersAndGruopsAreaRoleOfUserWithProRestrictions;

	 @FindBy(xpath="//span[contains(text(),'Reset')]")
	 private static WebElement craeteUserResetIcon;


	 
	 //Check Reset Option
	 

	 public boolean checkResetOptionInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
	        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
		 	Thread.sleep(2000);
		 	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		 	createUserIcon.click();
	
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		 	createUserLoginNameTxt.sendKeys("UserWithProRes");
		 	
		 	//Selected Role As select Role as simpleRole1
		 	Thread.sleep(2000);
		 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		 	createUserERPRoleDropDown.click();
		 	createUserERPRoleDropDown.sendKeys("samplerole1");
		 	createUserERPRoleDropDown.sendKeys(Keys.TAB);
		 	
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		 	 createUserPasswordPolicyDropdown.click();
		 	 Select Password=new Select(createUserPasswordPolicyDropdown);
		 	 Password.selectByVisibleText("Alpha Numeric Special Star with all options");
		 	
		 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		 	 createUserPasswordTxt.sendKeys("Test@123456789");
		 	
		 	 String act1,exp1;
		 	 act1=createUserPasswordTxt.getAttribute("value");
		 	 exp1="Test@123456789";
		 	
			 	if (act1.equalsIgnoreCase(exp1)) 
			 	{
			 		System.out.println(" Pass:  Confirm Password is Entered As Password");
			 		craeteUserResetIcon.click();
			 		
			 		Thread.sleep(2000);
			 		String act2,exp2;
			 		
			 		act2=createUserPasswordTxt.getAttribute("placeholder");
			 		exp2="Password";
			 		System.out.println(act2);
			 		
			 		Thread.sleep(2000);
			 		
			 		if (act2.equalsIgnoreCase(exp2)) 
			 		{
			 			System.out.println(" Pass: Reset Option in Create User Screen");
			 			excelReader.setCellData(xlfile, "Sheet4", 242, 9, resPass);
			 			return true;
			 		}
			 		else 
			 		{
			 			System.out.println(" Fail: Reset Option in Create User Screen");
			 			excelReader.setCellData(xlfile, "Sheet4", 242, 9, resFail);
			 			return false;
			 		}
			 	} 
			 	else 
			 	{
			 		System.out.println(" Fail:  Confirm Password is Entered As Password");
		 			excelReader.setCellData(xlfile, "Sheet4", 242, 9, resFail);
			 		return false;
			 	}
	 }



	 
	 //Check Move User
	 
	 
	 
	 public boolean checkMoveOptionWithoutSelctionOfUserInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		 
			Thread.sleep(2000);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMoveUserIcon));
			createUserMoveUserIcon.click();
			
			Thread.sleep(2000);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			String Actdata = newErrorMessage.getText();
			String Expdata = "Please select any user";
			
			System.out.println(Actdata);

			if (Actdata.contains(Expdata)) 
			{
				System.out.println("Pass:User Option in Create User");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 243, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail: User Option in Create User ");
				newErrorMessageCloseBtn.click();
				excelReader.setCellData(xlfile, "Sheet4", 243, 9, resFail);
				return false;
			}
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	    @FindBy(xpath = "//span//span[contains(text(),'UserWithPurchaseFAINV')]")
		private static WebElement createusersUserWithPurchaseFAINVOption;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[2]/span[1]")
		private static WebElement moveUserUserGroup;
		
		@FindBy(xpath="//h4[contains(text(),'Move User')]")
		private static WebElement moveUserLabel;

		
		@FindBy(xpath="//button[contains(text(),'Move')]")
		private static WebElement moveUserMoveBtn;
		
		
		@FindBy(xpath="//div[@id='LoadGroups']//button[@class='Fbutton'][contains(text(),'Cancel')]")
		private static WebElement moveUserCancelBtn;
		
		
		
		public boolean checkMovePageWithSelectingUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			

	        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCancelIcon));
			createUserCancelIcon.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSerachTxt));
			createUserSerachTxt.click();
			
			createUserSerachTxt.clear();
			
			Thread.sleep(2000);
			
			createUserSerachTxt.sendKeys("UserWithPurchaseFAINV");
			
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createusersUserWithPurchaseFAINVOption));
			createusersUserWithPurchaseFAINVOption.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMoveUserIcon));
			createUserMoveUserIcon.click();
			
			Thread.sleep(3000);
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(moveUserUserGroup));
			if (moveUserUserGroup.isDisplayed() && moveUserLabel.isDisplayed() && 
					moveUserMoveBtn.isDisplayed() && 
					moveUserCancelBtn.isDisplayed()) 
			{
				excelReader.setCellData(xlfile, "Sheet4", 244, 9, resPass);
				return true;
				
			}
			else 
			{
				excelReader.setCellData(xlfile, "Sheet4", 244, 9, resFail);
	              return false;
			}
		}
		
	 
	 
		 public boolean checkMovePageClickOnMoveWithoutSelectionOfGroup() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		 {
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
			 Thread.sleep(3000);
			 
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(moveUserMoveBtn));
			 
			 moveUserMoveBtn.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
				String Actdata = newErrorMessage.getText();
				String Expdata = "Select any group to move user";
				
				System.out.println(Actdata);

				if (Actdata.contains(Expdata)) 
				{
					System.out.println("Pass:User Option in Create User");
					newErrorMessageCloseBtn.click();
					excelReader.setCellData(xlfile, "Sheet4", 245, 9, resPass);
					return true;
				} 
				else 
				{
					System.out.println("Fail: User Option in Create User ");
					newErrorMessageCloseBtn.click();
					excelReader.setCellData(xlfile, "Sheet4", 245, 9, resFail);
					return false;
				}
				
			}
		 
		 

			@FindBy(xpath = "//span//span[contains(text(),'UserGroup ')]")
			private static WebElement createusersUserGroupOption;
			
			
			
			public boolean checkMoveUserWitSelectingUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
		        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				Thread.sleep(2000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(moveUserUserGroup));
				moveUserUserGroup.click();
				
				Thread.sleep(2000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(moveUserMoveBtn));
				moveUserMoveBtn.click();
				
				Thread.sleep(2000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSerachTxt));
				createUserSerachTxt.click();
				
				createUserSerachTxt.clear();
				
				createUserSerachTxt.sendKeys("UserWithPurchaseFAINV");
				
				Thread.sleep(3000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createusersUserWithPurchaseFAINVOption));
				createusersUserWithPurchaseFAINVOption.click();
						
				
				if (createusersUserGroupOption.isDisplayed()) 
				{
					System.out.println(" Pass :PurchaseFAINV is Succesfully Moves into UserGroup");
					
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSerachTxt));
					createUserSerachTxt.clear();
					
				
					
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCancelIcon));
					createUserCancelIcon.click();
                 
					excelReader.setCellData(xlfile, "Sheet4", 246, 9, resPass);
					return true;
				}
				else 
				{
				   System.out.println(" Fail :PurchaseFAINV is Succesfully Moves into UserGroup");
				   
				   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSerachTxt));
				   createUserSerachTxt.clear();
				   
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCancelIcon));
					createUserCancelIcon.click();
				   
				   excelReader.setCellData(xlfile, "Sheet4", 246, 9, resFail);
		           return false;
				}
				
			}
	 

			 @FindBy(xpath="//span[@id='userIconId']//i[contains(@class,'icon-move-user icon-font6')]")
             private static WebElement createUserAddPhoto;
	 
			 @FindBy(xpath="//span[@id='signIconId']//i[contains(@class,'icon-move-user icon-font6')]")
			 private static WebElement createSignInAddPhoto;
			 
			 @FindBy(xpath="//img[@id='userImage']")
			 private static WebElement getCreateUserAddPhoto;
			 
			 @FindBy(xpath="//img[@id='signImage']")
			 private static WebElement getCreateSignInAddPhoto;
			 
			 
			 
			 
			public boolean checkEditUserWithAddPhoto() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
		        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				Thread.sleep(4000);
				
			 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSerachTxt));
			
				
			 	createUserSerachTxt.click();
			 	
			 	Thread.sleep(4000);
			 	
			 	
			 	
			 	createUserSerachTxt.sendKeys("UserAccPOTransRestrictions");
			 	
			 	Thread.sleep(3000);
			 	 
			 	UserAccPOTransRestrictionsOption.click();
			 	
			 	Thread.sleep(3000);
			 		
			 	createUserAddPhoto.click();
			 	
			 	Thread.sleep(3000);
			 	
			 	Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\createUserPhoto.exe");
			 	 	
			 	Thread.sleep(3000);
			 	
			 	if(getCreateUserAddPhoto.isDisplayed())
			 	{
			 		excelReader.setCellData(xlfile, "Sheet4", 247, 9, resPass);
			 		return true;	
			 	}
			 	else
			 	{
			 		excelReader.setCellData(xlfile, "Sheet4", 247, 9, resFail);
			 		return false;
			 	}
				
			}
	 
	 
			public boolean checkEditUserWithAddSignature() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
		        excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				Thread.sleep(2000);
			 		
				createSignInAddPhoto.click();
			 	
			 	Thread.sleep(3000);
			 	
			 	Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\createUserSignIn.exe");
			 	
			 	
			 	Thread.sleep(3000);
			 	
			 	if(getCreateSignInAddPhoto.isDisplayed())
			 	{
			 	
			 		excelReader.setCellData(xlfile, "Sheet4", 248, 9, resPass);
			 		return true;
			 		
			 	}
			 	else
			 	{
			 		excelReader.setCellData(xlfile, "Sheet4", 248, 9, resFail);
			 		return false;
			 	}
				
			}
			
			
			
			
			 public boolean checkSaveUserWithAddPhotoAndSignature()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			     xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 	 
			 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			 	 createUserSaveIcon.click();
			 	
			 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessage));
			 		
			 	    String Actdata=newErrorMessage.getText();
			 		String Expdata="User updated successfully.";
			 		System.out.println(Actdata);
			 		
			 		
			 	   if (Actdata.equalsIgnoreCase(Expdata)) 
			 	   {
			 			System.out.println("  Pass: Should Provide User Name ");
			 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			 			newErrorMessageCloseBtn.click();
				 		excelReader.setCellData(xlfile, "Sheet4", 249, 9, resPass);
				 		return true;
				 	} 
				 	else 
				 	{
				 		 
				 		System.out.println("Fail : Displayed Create User Screen");
				 		excelReader.setCellData(xlfile, "Sheet4", 249, 9, resFail);
			 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
			 			newErrorMessageCloseBtn.click();
			 			return false;
			 		}
			 	
			 }
			
			
				public boolean checkEditAndCheckUserWithAddPhotoAndAddSignature() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					
			        excelReader=new ExcelReader(POJOUtility.getExcelPath());
			    	xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					Thread.sleep(2000);
					
				 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSerachTxt));
				 	createUserSerachTxt.click();
				 	createUserSerachTxt.sendKeys("UserAccPOTransRestrictions");
				 	
				 	Thread.sleep(2000);
				 	 
				 	UserAccPOTransRestrictionsOption.click();
				 	
				 	Thread.sleep(2000);
				 	
				 	if(getCreateUserAddPhoto.isDisplayed() && getCreateSignInAddPhoto.isDisplayed())
				 	{
				 		excelReader.setCellData(xlfile, "Sheet4", 250, 9, resPass);
				 		return true;	
				 	}
				 	else
				 	{
				 		excelReader.setCellData(xlfile, "Sheet4", 250, 9, resFail);
				 		return false;
				 	}
					
				}
		 
			 
			
	 public boolean checkCloseOptionInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	 	
		 

	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		Thread.sleep(2000);
		
	 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
	 	createUserCloseIcon.click();
	 	
	 	
	 	 if(labelDashboard.isDisplayed() && selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() &&
	    		 dashboardCustomizationSettings.isDisplayed())
         {
         	System.out.println("Pass");
         	excelReader.setCellData(xlfile, "Sheet4", 251, 9, resPass);
         	return true;
         }
         else
         {
         	System.out.println("Fail");
         	excelReader.setCellData(xlfile, "Sheet4", 251, 9, resFail);
         	return false;
         }
	 }






	 @FindBy(xpath="//span[contains(text(),'UserWithDelete')]")
	 private static WebElement createusersAreaUserWithDeleteOption;


	 @FindBy(xpath="//span//span[contains(text(),'UserWithAccDisable')]")
	 private static WebElement createusersAreaUserWithAccDisableOption;


	 @FindBy(xpath="//i[@class='icon-delete icon-font6']")
	 private static WebElement createUserDeleteIcon;



	 	

	 	@FindBy(xpath="//input[@id='loginName']")
	 	private static WebElement groupNameTxt;
	 	
	 	
	 	@FindBy(xpath="//select[@id='timezone']")
	 	private static WebElement createUserSelectTimeZoneDropdown;
	



	 @FindBy(xpath="//span//span[contains(text(),'UserWithGroup')]")
	 private static WebElement createusersAreaUserWithGroupOption;








	public HPHomeMenuSecurityPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	
	}
		

}	

