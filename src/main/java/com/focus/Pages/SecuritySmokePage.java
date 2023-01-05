package com.focus.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class SecuritySmokePage extends BaseEngine
{
	//Home Menu Security Menu
	@FindBy(xpath="//*[@id='6']/span")
	public static WebElement  homeSecurityMenu; 

	//Home Menu Password Policy Menu
	@FindBy(xpath="//span[contains(text(),'Password policy')]")
	public static WebElement  homeSecurityPasswordPolicyMenu;  

	@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Password policy')]")
	public static WebElement  passwordPolicyScreenLabel; 

	@FindBy(xpath="//input[@id='policyName']")
	public static WebElement  passwordPolicyPolicyNameTxt; 

	@FindBy(xpath="//input[@id='MinPassLength']")
	public static WebElement  passwordPolicyMinPasswordLengthTxt; 

	@FindBy(xpath="//select[@id='complexity']")
	public static WebElement  passwordPolicyComplexityDropdown; 

	@FindBy(xpath="//input[@id='Donotallprevious']")
	public static WebElement  passwordPolicyDonotallpreviousTxt; 

	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	public static WebElement  passwordPolicyAddIcon; 

	@FindBy(xpath="//i[@class='icon-font6 icon-delete']")
	public static WebElement  passwordPolicyDeleteIcon; 

	@FindBy(xpath="//i[@class='icon-font6 icon-cancel']")
	public static WebElement  passwordPolicyCancelIcon; 

	@FindBy(xpath="//span[@id='btnSaveId']//i[@class='icon-save icon-font6']")
	public static WebElement  passwordPolicySaveIcon; 

	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	public static WebElement  passwordPolicyCloseIcon;

	@FindBy(xpath="//span[contains(text(),'Create Profile')]")
	public static WebElement  homeSecurityCreateProfileMenu;   

	@FindBy(xpath="//span[contains(text(),'Create Role')]")
	public static WebElement  homeSecurityCreateRoleMenu; 

	@FindBy(xpath="//span[contains(text(),'Create User')]")
	public static WebElement  homeSecurityCreateUserMenu; 

	@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Create Profile')]")
	public static WebElement  createProfileLabel; 

	@FindBy(xpath="//input[@id='profileName']")
	public static WebElement  createProfileProfileNameCombo; 

	@FindBy(xpath="//*[@id='Profilemenu']/li[1]/i")
	public static WebElement  createProfileHomeExpandBtn; 

	@FindBy(xpath="//*[@id='Profilemenu']/li[2]/i")
	public static WebElement  createProfileFinancalsExpandBtn; 

	@FindBy(xpath="//*[@id='Profilemenu']/li[3]/i")
	public static WebElement  createProfileInventoryExpandBtn; 

	@FindBy(xpath="//*[@id='Profilemenu']/li[4]/i")
	public static WebElement  createProfileFixedAssestsExpandBtn; 

	@FindBy(xpath="//li[@class='treeview']//a[@id='50002']//span[contains(text(),'Asset Usage')]")
	public static WebElement transAssetUsageOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Add Asset Value')]")
	public static WebElement transAddAssetValueOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Reduce Asset Value')]")
	public static WebElement transReduceAssetValueoption;


	@FindBy(xpath="//li[@class='treeview']//a[@id='50005']//span[contains(text(),'Disposal Of Asset')]")
	public static WebElement transDisposalOfAssetOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Post Depreciation Entries')]")
	public static WebElement transPostDepreciationEntriesoption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Capitalization of Asset')]")
	public static WebElement transCapitalizationofAssetoption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Multiple Asset Usage')]")
	public static WebElement transMultipleAssetUsageoption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Add Depreciation Years')]")
	public static WebElement transAddDepreciationYearsoption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Transfer Of Asset Request')]")
	public static WebElement transTransferOfAssetRequestoption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='50004']//span[contains(text(),'Transfer Of Asset')]")
	public static WebElement transTransferOfAssetoption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Transfer of asset')]")
	public static WebElement reportsTransferofassetoption;



	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Assets Usage')]")
	public static WebElement reportsAssetsUsageOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Add Assets value')]")
	public static WebElement reportsAddAssetsvalueOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Component Added')]")
	public static WebElement reportsComponentAddedOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Reduce asset value')]")
	public static WebElement reportsReduceassetvalueOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Component Reduced')]")
	public static WebElement reportsComponentReducedOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Disposal of Asset')]")
	public static WebElement reportsDisposalofAssetOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Fixed Asset Report')]")
	public static WebElement reportsFixedAssetReportOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Depreciation Schedule')]")
	public static WebElement reportsDepreciationScheduleOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Disposal Of Asset Request')]")
	public static WebElement reportsDisposalOfAssetRequestOption;

	@FindBy(xpath="//*[@id='Profilemenu']/li[5]/i")
	public static WebElement  createProfileProductionExpandBtn; 

	@FindBy(xpath="//ul[@id='Profilemenu']/li[6]/i")
	public static WebElement  createProfilePointOfSaleExpandBtn; 

	@FindBy(xpath="//ul[@id='Profilemenu']/li[7]/i")
	public static WebElement  createProfileQualityControlExpandBtn; 

	@FindBy(xpath="//ul[@id='Profilemenu']/li[8]/i")
	public static WebElement  createProfileSettingExpandBtn; 


	@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Create Role')]")
	public static WebElement  createRoleLabel; 

	@FindBy(xpath="//input[@id='roleName']")
	public static WebElement createRoleRoleNameCombo; 

	@FindBy(xpath="//tbody[@id='roleName_table_body']/tr/td[2]")
	public static List<WebElement> createRoleRoleNameComboList;



	@FindBy(xpath="//span[2]//span[1]")
	public static WebElement  createRoleMOveFiledsFronLeftSideToRightSide; 

	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div/div[1]/nav/div/div[2]/ul/li/span[2]")
	public static WebElement CreateRoleDeleteButtonImage; 

	/*@FindBy(xpath="//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
	public static WebElement newErrorMessage;*/



	//Home Menu Network Policy Menu


	@FindBy (xpath="//*[@id='IPtable']/thead/tr/th[1]")
	public static WebElement startIp;

	@FindBy (xpath="//*[@id='IPtable']/thead/tr/th[2]")
	public static WebElement endIp;

	@FindBy (xpath="//*[@id='0']/td[1]")
	public static WebElement startIpValue;

	@FindBy (xpath="//*[@id='0']/td[2]")
	public static WebElement endIpValue;

	@FindBy (xpath="//*[@id='0']/td[2]/span[1]")
	public static WebElement closeImage;



	@FindBy (xpath="//*[@id='8']/span")
	public static WebElement passwordPolicy;

	@FindBy (xpath="//*[@id='9']")
	public static WebElement createProfile;

	@FindBy (xpath="//*[@id='10']/span")
	public static WebElement createRole;

	@FindBy (xpath="//*[@id='11']/span")
	public static WebElement createUser;

	@FindBy (xpath="//*[@id='12']/span")
	public static WebElement changePassword;

	@FindBy (xpath="//*[@id='13']/span")
	public static WebElement updatePersonalInfo;

	@FindBy (xpath="//*[@id='14']/span")
	public static WebElement usageLog;

	@FindBy (xpath="//*[@id='644']/span")
	public static WebElement userRightsReport;

	@FindBy (xpath="//*[@id='652']/span")
	public static WebElement roleRightsReport;

	@FindBy (xpath="//*[@id='653']/span")
	public static WebElement profileRightsReport;

	@FindBy(xpath="//*[@id='allow']")
	public static WebElement allowRadioBtn;





	//Password Policy Name in the List
	@FindBy (xpath="//html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]")
	public static WebElement passwordPolicyNameInList;

	//Password Policy Name in the List
	@FindBy (xpath="//html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]")
	public static WebElement passwordPolicyNameListTwo;

	@FindBy (xpath="//html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]")
	public static WebElement passwordPolicyNameListThree;

	//Password Policy sendMailOnFailure
	@FindBy (xpath="//*[@id='sendEmailId']")
	public static WebElement sendEmailId;

	//Password Policy sendMailOnFailure
	@FindBy (xpath="//*[@id='sendemailonloginsuccessId']")
	public static WebElement sendEmailOnLoginSuccess;

	//Password Policy sendMailOnFailure
	@FindBy (xpath="//*[@id='SendemailonloginfailureId']")
	public static WebElement sendEmailOnLoginFailure;



	//Web Elements of CraeteUser Screen
	@FindBy(xpath="//span[contains(text(),'Create user')]")
	public static WebElement createUserLabel;

	@FindBy(xpath="//*[@id='additionalInfotabMenu']/a")
	public static WebElement createUserAdditionalInfoTab;

	@FindBy(xpath="//*[@id='grpRestrictionstabMenu']/a")
	public static WebElement createUserRestrictionsTab;

	@FindBy(xpath="//*[@id='device-tab']/a")
	public static WebElement createUserDeviceTab;

	@FindBy(xpath="//*[@id='RestrictionForEntry-tab']/a")
	public static WebElement createUserRestrictionforentryTab;

	@FindBy(xpath="//li[@id='userInfotabMenu']/a")
	public static WebElement createUserUserInformationTab;

	//@FindBy(xpath="//*[@id='additionalInfo']/div/div/div[1]/div[5]/label/span")
	@FindBy(xpath="//*[@id='additionalInfo']//div[5]//div//label/span")
	public static WebElement createUserSetPermissionForEmailAuthorizationChkBox;

	@FindBy(xpath="//select[@id='DominSecurityMping']")
	public static WebElement createUserDomainUserMappingDrpDwn;

	@FindBy(xpath="//input[@id='domainUserName']")
	public static WebElement createUserDomainUserMappingTxt;

	@FindBy(xpath="//input[@id='ipAddr1']")
	public static WebElement createUserUserValuesTxt1;

	@FindBy(xpath="//input[@id='ipAddr2']")
	public static WebElement createUserUserValuesTxt2;

	@FindBy(xpath="//input[@id='ipAddr3']")
	public static WebElement createUserUserValuesTxt3;

	@FindBy(xpath="//input[@id='ipAddr4']")
	public static WebElement createUserUserValuesTxt4;

	@FindBy(xpath="//input[@id='ipAddr5']")
	public static WebElement createUserUserValuesTxt5;

	@FindBy(xpath="//select[@id='typeOfUser']")
	public static WebElement createUserUserTypeDrpDwn;

	@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
	public static WebElement createUserUserTypeCombo;

	@FindBy(xpath="//select[@id='crmRoles']")
	public static WebElement createUserCRMRolesDrpDwn;

	@FindBy(xpath="//input[@id='UserTypeMobile']")
	public static WebElement createUserMobileChkBox;

	@FindBy(xpath="//input[@id='UserTypeOffline']")
	public static WebElement createUserOfflineChkBox;

	@FindBy(xpath="//input[@id='UserTypeWeb']")
	public static WebElement createUserWebChkBox;




	public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		Thread.sleep(5000);

		try 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
			doNotShowCheckbox.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDemoPopupScreen));
			closeBtnInDemoPopupScreen.click(); 

			System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");

		} 
		catch (Exception e)
		{
			System.err.println("NO POP UP DISPLAYED");
		}


		Thread.sleep(4000);
	}





	/*public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage=errorMessage.getText();
			String expErrorMessage=ExpMessage;
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();
				
				System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
				
				return actErrorMessage;
			}
			catch(Exception ee)
			{
				
				System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
				
				return actErrorMessage;
			}
		}
		catch(Exception e)
		{
			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());
	                
			String Exception=e.getMessage();
			
			return Exception;	
		} 
	  }

*/



	public static String xlfile;
	public static String resPass="Pass";
	public static String resFail="Fail";
	public static ExcelReader excelReader;
	public static String xlSheetName = "SmokeUsers";

	public static int cSize;

	//Home Menu Security Network Policy Page Starts

	public static boolean checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";



		getDriver().navigate().refresh();
		Thread.sleep(3000);

		getDriver().navigate().refresh();
		Thread.sleep(3000);

		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";

		String pawslt="su";

		lp.enterUserName(unamelt);

		lp.enterPassword(pawslt);

		String compname="Automation Company";

		Select oSelect = new Select(companyDropDownList);

		List <WebElement> elementCount = oSelect.getOptions();

		int cqSize = elementCount.size();

		int zqSize=cSize+1;

		System.out.println("CompanyDropdownList Count :"+cqSize);

		System.out.println("Company dropdown is :"+ zqSize);


		//Select dropdown= new Select(lp.companyDropDownList);
		int i;

		//List<WebElement> list = dropdown.getOptions();

		//List<String> text = new ArrayList<>();
		for(i=0; i<elementCount.size(); i++) 
		{

			elementCount.get(i).getText();
			String optionName = elementCount.get(i).getText();
			if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
			{
				System.out.println("q"+elementCount.get(i).getText());
				elementCount.get(i).click();

			}

		}

		lp.clickOnSignInBtn();

		//checkPopUpWindow();

		Thread.sleep(5000);

		String userInfo=userNameTxt.getText();

		System.out.println("User Info : "+userInfo);

		System.out.println("User Info Capture Text :"+userNameTxt.getText());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));

		companyLogoImg.click();

		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogoImg.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));

		String getDashboard=dashboardName.getText();

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
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));

		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));

		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicy));

		networkPolicy.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicyTitle));

		String actnetworkPolicyTitle=networkPolicyTitle.getText();

		String expnetworkPolicyTitle = excelReader.getCellData(xlSheetName, 361, 7);

		excelReader.setCellData(xlfile, xlSheetName, 361, 8, actnetworkPolicyTitle);

		boolean actallowRadioBtnInNetworkPolicy = allowRadioBtnInNetworkPolicy.isDisplayed();
		boolean actblockRadioBtnInNetworkPolicy = blockRadioBtnInNetworkPolicy.isDisplayed();
		boolean actstartIp = startIp.isDisplayed();
		boolean actendIp = endIp.isDisplayed();
		boolean actfromIp = fromIp.isDisplayed();
		boolean acttoIp = toIp.isDisplayed();
		boolean actaddIp = addIp.isDisplayed();
		boolean actclearIp = clearIp.isDisplayed();
		boolean actsaveBtnInNetworkPolicy = saveBtnInNetworkPolicy.isDisplayed();
		boolean actcloseBtnInNetworkPolicy = closeBtnInNetworkPolicy.isDisplayed();

		System.out.println("networkPolicyTitle : "+actnetworkPolicyTitle +" Value Expected : "+expnetworkPolicyTitle);

		boolean actDisplay = actallowRadioBtnInNetworkPolicy==true && actblockRadioBtnInNetworkPolicy==true && actstartIp==true
				&& actendIp==true && actfromIp==true && acttoIp==true && actaddIp==true && actclearIp==true 
				&& actsaveBtnInNetworkPolicy==true && actcloseBtnInNetworkPolicy==true;

		String actMethod = Boolean.toString(actDisplay);

		String expMethod = excelReader.getCellData(xlSheetName, 362, 7);

		excelReader.setCellData(xlfile, xlSheetName, 362, 8, actMethod);

		System.out.println("Display Result : "+actMethod+" Value Expected: "+expMethod);

		System.out.println("allowRadioBtnInNetworkPolicy : "+actallowRadioBtnInNetworkPolicy);
		System.out.println("blockRadioBtnInNetworkPolicy : "+actblockRadioBtnInNetworkPolicy);
		System.out.println("startIp                      : "+actstartIp);
		System.out.println("endIp                        : "+actendIp);
		System.out.println("fromIp                       : "+actfromIp);
		System.out.println("toIp                         : "+acttoIp);
		System.out.println("addIp                        : "+actaddIp);
		System.out.println("clearIp                      : "+actclearIp);
		System.out.println("saveBtnInNetworkPolicy       : "+actsaveBtnInNetworkPolicy);
		System.out.println("closeBtnInNetworkPolicy      : "+actcloseBtnInNetworkPolicy);


		if(actnetworkPolicyTitle.equalsIgnoreCase(expnetworkPolicyTitle) && actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Fail Network Policy Title is displaying Wrong");
			excelReader.setCellData(xlfile, xlSheetName, 360, 9, resPass);
			return true;
		}

		else
		{
			System.out.println("Fail Network Policy Title is displaying Wrong");
			excelReader.setCellData(xlfile, xlSheetName, 360, 9, resFail);
			return false;
		}  
	}




	public static boolean checkAddBtnWithAllBlankIPsInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException  
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));

		addIp.click();

		String expMessage=excelReader.getCellData(xlSheetName, 364, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 364, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, xlSheetName, 363, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 363, 9, resFail);
			return false;
		}
	}



	public static boolean checkAddBtnFromIPMoreThanToIPCheckInNetworkPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));

		fromIp.click();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		fromIp.sendKeys(excelReader.getCellData(xlSheetName, 365, 6));

		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toIp));

		toIp.clear();

		toIp.sendKeys(excelReader.getCellData(xlSheetName, 366, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));

		addIp.click();

		String expMessage=excelReader.getCellData(xlSheetName, 366, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 366, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, xlSheetName, 365, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 365, 9, resFail);
			return false;
		}

	}




	public static boolean checkAddBtnFromEndingWithZeroCheckInNetworkPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));

		fromIp.click();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		fromIp.sendKeys(excelReader.getCellData(xlSheetName, 367, 6));

		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.RIGHT).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

		toIp.sendKeys(excelReader.getCellData(xlSheetName, 368, 6));

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));

		addIp.click();

		String expMessage=excelReader.getCellData(xlSheetName, 368, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 368, 8, actMessage);

		if(actMessage.contains(expMessage))
		{
			excelReader.setCellData(xlfile, xlSheetName, 367, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 367, 9, resFail);
			return false;
		}

	}


	public static boolean checkClearBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearIp));
		clearIp.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));

		addIp.click();

		String expMessage=excelReader.getCellData(xlSheetName, 370, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 370, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, xlSheetName, 369, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 369, 9, resFail);
			return false;
		}

	}




	public static boolean checkIpStartWithZeroMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));

		fromIp.click();

		fromIp.sendKeys(excelReader.getCellData(xlSheetName, 371, 6));

		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toIp));

		toIp.sendKeys(excelReader.getCellData(xlSheetName, 372, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));


		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));

		addIp.click();

		String expMessage=excelReader.getCellData(xlSheetName, 372, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 372, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, xlSheetName, 371, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 371, 9, resFail);
			return false;
		}

	}



	public static boolean checkInputValidStartIpAndEndIpInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearIp));

		clearIp.click();

		Thread.sleep(2000);*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));

		fromIp.click();

		fromIp.sendKeys(excelReader.getCellData(xlSheetName, 373, 6));

		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toIp));

		toIp.sendKeys(excelReader.getCellData(xlSheetName, 374, 6));

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));

		addIp.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startIpValue));

		String getStartIp=startIpValue.getText();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endIpValue));

		String getEndIp=endIpValue.getText();

		String expstartIpValue = excelReader.getCellData(xlSheetName, 374, 7);
		String expendIpValue   = excelReader.getCellData(xlSheetName, 375, 7);	

		System.out.println(getStartIp);
		System.out.println(getEndIp);


		excelReader.setCellData(xlfile, xlSheetName, 374, 8, getStartIp);
		excelReader.setCellData(xlfile, xlSheetName, 375, 8, getEndIp);


		if(getStartIp.equalsIgnoreCase(expstartIpValue) && getEndIp.equalsIgnoreCase(expendIpValue))
		{
			System.out.println("Pass");
			excelReader.setCellData(xlfile, xlSheetName, 373, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail");
			excelReader.setCellData(xlfile, xlSheetName, 373, 9, resFail);
			return false;
		}

	}





	public static boolean checkClickOnSaveBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInNetworkPolicy));
		saveBtnInNetworkPolicy.click();

		String expMessage=excelReader.getCellData(xlSheetName, 377, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 377, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Network policy saved successfully");
			excelReader.setCellData(xlfile, xlSheetName, 376, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Network policy not saved successfully");
			excelReader.setCellData(xlfile, xlSheetName, 376, 9, resFail);
			return false;
		}

	}



	public static boolean checkUpdateBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startIpValue));
		getAction().doubleClick(startIpValue).perform();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));	
		fromIp.click();

		getAction().moveToElement(fromIp).sendKeys(Keys.END).perform();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		fromIp.sendKeys(excelReader.getCellData(xlSheetName, 378, 6));

		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.END).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

		toIp.sendKeys(excelReader.getCellData(xlSheetName, 379, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtnInNetworkPolicy));

		updateBtnInNetworkPolicy.click();

		Thread.sleep(2000);

		String getStartIp=startIpValue.getText();
		String getEndIp=endIpValue.getText();

		String expstartIpValue = excelReader.getCellData(xlSheetName, 379, 7);
		String expendIpValue   = excelReader.getCellData(xlSheetName, 380, 7);	

		System.out.println(getStartIp);
		System.out.println(getEndIp);


		excelReader.setCellData(xlfile, xlSheetName, 379, 8, getStartIp);
		excelReader.setCellData(xlfile, xlSheetName, 380, 8, getEndIp);


		if(getStartIp.equalsIgnoreCase(expstartIpValue) && getEndIp.equalsIgnoreCase(expendIpValue))
		{
			System.out.println("Pass");
			excelReader.setCellData(xlfile, xlSheetName, 378, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail");
			excelReader.setCellData(xlfile, xlSheetName, 378, 9, resFail);
			return false;
		}

	}




	public static boolean checkClearBtnWhileUpdate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startIpValue));

		getAction().doubleClick(startIpValue).perform();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearIp));

		clearIp.click();			

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));

		fromIp.click();

		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();

		getAction().moveToElement(toIp).sendKeys(Keys.SHIFT,Keys.TAB).perform();

		String getStartIpClear=fromIp.getAttribute("value");

		System.out.println(getStartIpClear);

		getAction().moveToElement(toIp).sendKeys(Keys.TAB).perform();

		String getEndIpclear=toIp.getAttribute("value");


		System.out.println(getEndIpclear);

		String expstartIpValue = excelReader.getCellData(xlSheetName, 382, 7);
		String expendIpValue   = excelReader.getCellData(xlSheetName, 383, 7);	



		excelReader.setCellData(xlfile, xlSheetName, 382, 8, getStartIpClear);
		excelReader.setCellData(xlfile, xlSheetName, 383, 8, getEndIpclear);




		if(getStartIpClear.equalsIgnoreCase(expstartIpValue) && getEndIpclear.equalsIgnoreCase(expendIpValue))
		{
			System.out.println("Pass");
			excelReader.setCellData(xlfile, xlSheetName, 381, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail");
			excelReader.setCellData(xlfile, xlSheetName, 381, 9, resFail);
			return false;
		}

	}





	public static boolean checkCloseBtnInNetworkPolicyPage() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInNetworkPolicy));
		closeBtnInNetworkPolicy.click();

		getWaitForAlert();

		String getExpectedCompMsg=excelReader.getCellData(xlSheetName, 385, 7);

		String actCompanySaveMsg=getDriver().switchTo().alert().getText();

		excelReader.setCellData(xlfile, xlSheetName, 385, 8, actCompanySaveMsg);

		System.out.println(getExpectedCompMsg);

		System.out.println(actCompanySaveMsg);

		Assert.assertEquals(actCompanySaveMsg, getExpectedCompMsg);

		getDriver().switchTo().alert().dismiss();

		if(getExpectedCompMsg.equalsIgnoreCase(actCompanySaveMsg))
		{
			System.out.println("Pass");
			excelReader.setCellData(xlfile, xlSheetName, 384, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail");
			excelReader.setCellData(xlfile, xlSheetName, 384, 9, resFail);
			return false;
		}

	}




	public static boolean checkTitleAfterClickOnCancelBtnInAlertWhenUserClickOnCloseBtn() throws EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicyTitle));

		String getNetPolicyScreenName=networkPolicyTitle.getText();

		String expNetPolicyScreenName=excelReader.getCellData(xlSheetName, 387, 7);

		excelReader.setCellData(xlfile, xlSheetName, 387, 8, getNetPolicyScreenName);

		System.out.println("getNetPolicyScreenName : "+getNetPolicyScreenName);

		if(getNetPolicyScreenName.equalsIgnoreCase(expNetPolicyScreenName))
		{
			System.out.println("Pass : Cancel button is working in the Alert Of Close");
			excelReader.setCellData(xlfile, xlSheetName, 386, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Cancel button is working in the Alert Of Close");
			excelReader.setCellData(xlfile, xlSheetName, 386, 9, resFail);
			return false;
		}


	}



	public static boolean checkCloseAlertInAlertClickOnOkBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		String expectedCompMsg=excelReader.getCellData(xlSheetName, 389, 7);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInNetworkPolicy));
		closeBtnInNetworkPolicy.click();

		Thread.sleep(3000);
		getWaitForAlert();

		String actCompanySaveMsg=getDriver().switchTo().alert().getText();   

		getDriver().switchTo().alert().accept();

		excelReader.setCellData(xlfile, xlSheetName, 389, 8, actCompanySaveMsg);

		Thread.sleep(2000);

		boolean actDisplay = dashboardName.isDisplayed() &&
				newAddDashBoard.isDisplayed() &&
				dashboardCustomizationSettings.isDisplayed();

		String actMethod = Boolean.toString(actDisplay);

		String expMethod = excelReader.getCellData(xlSheetName, 390, 7);

		excelReader.setCellData(xlfile, xlSheetName, 390, 8, actMethod);

		if(actCompanySaveMsg.equalsIgnoreCase(expectedCompMsg) && actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Pass");
			excelReader.setCellData(xlfile, xlSheetName, 388, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail");
			excelReader.setCellData(xlfile, xlSheetName, 388, 9, resFail);
			return false;
		}

	}


	public static boolean checkOptionDeleteToCickCloseImageInIpTextBoxOnMove() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		String winHandleBefore =getDriver().getWindowHandle();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
		homeMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));		
		securityMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicy));		
		networkPolicy.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));
		fromIp.click();

		Actions moveAction=new Actions(getDriver());

		moveAction.moveToElement(closeImage);
		moveAction.click().build().perform();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInNetworkPolicy));
		saveBtnInNetworkPolicy.click();

		getWaitForAlert();

		String getExpectedCompMsg=excelReader.getCellData(xlSheetName, 392, 7);

		String actCompanySaveMsg=getDriver().switchTo().alert().getText();

		Assert.assertEquals(actCompanySaveMsg, getExpectedCompMsg);

		System.out.println(actCompanySaveMsg);

		System.out.println(getExpectedCompMsg);

		getDriver().switchTo().alert().accept();

		excelReader.setCellData(xlfile, xlSheetName, 392, 8, actCompanySaveMsg);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInNetworkPolicy));
		closeBtnInNetworkPolicy.click();

		getWaitForAlert();

		getDriver().switchTo().alert().accept();

		if(getExpectedCompMsg.equalsIgnoreCase(actCompanySaveMsg))
		{
			System.out.println("Pass");
			excelReader.setCellData(xlfile, xlSheetName, 391, 9, resPass);   		    
			return true;
		}
		else
		{
			System.out.println("Fail");
			excelReader.setCellData(xlfile, xlSheetName, 391, 9, resFail);
			return false;
		}


	}


	@FindBy(xpath="//div[@id='TableDiv']")
	public static WebElement startIpValueAfterDelete;

	public boolean checkSavedIpIsdisplayingUserCloseReOpenTheNetworkpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));

		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));

		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicy));

		networkPolicy.click();

		Thread.sleep(5000);

		boolean actDisplay = startIpValueAfterDelete.isDisplayed();

		String actMethod = Boolean.toString(actDisplay);

		String expMethod = excelReader.getCellData(xlSheetName, 394, 7);

		excelReader.setCellData(xlfile, xlSheetName, 394, 8, actMethod);

		if( actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Pass");
			excelReader.setCellData(xlfile, xlSheetName, 393, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail");
			excelReader.setCellData(xlfile, xlSheetName, 393, 9, resFail);
			return false;
		}

	}


	public static boolean checkSaveIP() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowRadioBtn));

		allowRadioBtn.click();

		fromIp.click();

		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();
		getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

		fromIp.sendKeys(excelReader.getCellData(xlSheetName, 395, 6));

		getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();

		toIp.sendKeys(excelReader.getCellData(xlSheetName, 396, 6));

		addIp.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInNetworkPolicy));
		saveBtnInNetworkPolicy.click();

		String expMessage=excelReader.getCellData(xlSheetName, 396, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 396, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Network policy saved successfully");
			excelReader.setCellData(xlfile, xlSheetName, 395, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Network policy not saved successfully");
			excelReader.setCellData(xlfile, xlSheetName, 395, 9, resFail);
			return false;
		}

	}




	public static boolean checkSavedAllowIpInNetworkPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startIpValue));

		getAction().doubleClick(startIpValue).perform();

		Thread.sleep(2000);

		fromIp.click();		  

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startIpValue));

		String getStartIp=startIpValue.getText();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endIpValue));

		String getEndIp=endIpValue.getText();

		String expstartIpValue = excelReader.getCellData(xlSheetName, 398, 7);
		String expendIpValue   = excelReader.getCellData(xlSheetName, 399, 7);	

		System.out.println(getStartIp+" Value Expected : "+expstartIpValue);
		System.out.println(getEndIp  +" Value Expected : "+expendIpValue);


		excelReader.setCellData(xlfile, xlSheetName, 398, 8, getStartIp);
		excelReader.setCellData(xlfile, xlSheetName, 399, 8, getEndIp);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInNetworkPolicy));
		closeBtnInNetworkPolicy.click();

		getWaitForAlert();

		getAlert().accept();

		if(getStartIp.equalsIgnoreCase(expstartIpValue) && getEndIp.equalsIgnoreCase(expendIpValue))
		{
			System.out.println("Pass : Deleted IP is not displaying in the Network policy");
			excelReader.setCellData(xlfile, xlSheetName, 397, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Deleted IP is displaying in the Network policy");
			excelReader.setCellData(xlfile, xlSheetName, 397, 9, resFail);
			return false;
		}	   
	}

	//Home Menu Security Menu Network Policy Page is Stop



	//Home Menu Security Password Policy Starts

	public static boolean checkPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));	
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySubMenu));
		passwordPolicySubMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyTitle));

		String actpasswordPolicyTitle=passwordPolicyTitle.getText();

		String exppasswordPolicyTitle = excelReader.getCellData(xlSheetName, 404, 7);	

		System.out.println(actpasswordPolicyTitle);

		System.out.println("passwordPolicyTitle : "+actpasswordPolicyTitle+" Value Expected : "+exppasswordPolicyTitle);

		excelReader.setCellData(xlfile, xlSheetName, 404, 8, actpasswordPolicyTitle);

		boolean actpasswordPolicyList      = passwordPolicyList.isDisplayed();
		boolean actpasswordPolicyAddBtn    = passwordPolicyAddBtn.isDisplayed();
		boolean actpasswordPolicyDeletebtn = passwordPolicyDeletebtn.isDisplayed();
		boolean actpasswordPolicyCancelBtn = passwordPolicyCancelBtn.isDisplayed();
		boolean actpasswordPolicySaveBtn   = passwordPolicySaveBtn.isDisplayed();
		boolean actpasswordPolicyCloseBtn  = passwordPolicyCloseBtn.isDisplayed();
		boolean actpolicyName              = policyName.isDisplayed();
		boolean actpasswordLength          = passwordLength.isDisplayed();
		boolean actpasswordComplexity      = passwordComplexity.isDisplayed();
		boolean actdoNotAllowPrevious      = doNotAllowPrevious.isDisplayed();
		boolean actpasswordExpiryDays      = passwordExpiryDays.isDisplayed();
		boolean actpasswordExpiryInMins    = passwordExpiryInMins.isDisplayed();
		boolean actpasswordInvalidAttempts = passwordInvalidAttempts.isDisplayed();
		boolean actpasswordLockOut         = passwordLockOut.isDisplayed();
		boolean actpasswordLockOutUnits    = passwordLockOutUnits.isDisplayed();
		boolean actsendMailCheck           = sendMailCheck.isDisplayed();
		boolean actsendMailOnSuccess       = sendMailOnSuccess.isDisplayed();
		boolean actsendMailOnFailure       = sendMailOnFailure.isDisplayed();




		boolean actDisplay = actpasswordPolicyList==true && actpasswordPolicyAddBtn==true && actpasswordPolicyDeletebtn==true 
				&& actpasswordPolicyCancelBtn==true && actpasswordPolicySaveBtn==true && actpasswordPolicyCloseBtn==true 
				&& actpolicyName==true && actpasswordLength==true && actpasswordComplexity==true && actdoNotAllowPrevious==true
				&& actpasswordExpiryDays==true && actpasswordExpiryInMins==true && actpasswordInvalidAttempts==true 
				&& actpasswordLockOut==true && actpasswordLockOutUnits==true && actsendMailCheck==true 
				&& actsendMailOnSuccess==true && actsendMailOnFailure==true;

		String actMethod = Boolean.toString(actDisplay);

		String expMethod = excelReader.getCellData(xlSheetName, 405, 7);

		excelReader.setCellData(xlfile, xlSheetName, 405, 8, actMethod);

		System.out.println("********************************************** checkCloseImportExportScreenAndImport  *****************************************");
		System.out.println("File Name                    : " + actMethod				+ "           Value Expected : " + expMethod);


		if(actpasswordPolicyTitle.equalsIgnoreCase(exppasswordPolicyTitle) && actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Pass : Password Policy Title is displaying Corrrect");
			excelReader.setCellData(xlfile, xlSheetName, 403, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail Password Policy Title is displaying Wrong");
			excelReader.setCellData(xlfile, xlSheetName, 403, 9, resFail);
			return false;
		}
	}


	public boolean checkPolicyNameAsMandatory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		passwordPolicyAddBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		passwordPolicySaveBtn.click();

		String expMessage=excelReader.getCellData(xlSheetName, 407, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 407, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Policy Name as mandatory message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 406, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Policy Name as mandatory message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 406, 9, resFail);
			return false;
		}


	}


	public boolean checkMinimumPasswordLengthAsMandatory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(policyName));
		policyName.sendKeys("Simple Policy");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		passwordPolicySaveBtn.click();

		String expMessage=excelReader.getCellData(xlSheetName, 409, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 409, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Policy Password Length as mandatory message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 408, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Policy Password length as mandatory message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 408, 9, resFail);
			return false;
		}
	}



	public boolean checkMinimumPasswordLengthAsNumericFields() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordLength));
		passwordLength.sendKeys(excelReader.getCellData(xlSheetName, 410, 6));

		String actpasswordLength=passwordLength.getAttribute("value");
		String exppasswordLength = excelReader.getCellData(xlSheetName, 411, 7);

		excelReader.setCellData(xlfile, xlSheetName, 411, 8, actpasswordLength);

		System.out.println(actpasswordLength);

		if(actpasswordLength.equalsIgnoreCase(exppasswordLength))
		{
			System.out.println("Pass : Policy Password Length accepts Numeric");
			excelReader.setCellData(xlfile, xlSheetName, 410, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Policy Password Length not accepting Numeric");
			excelReader.setCellData(xlfile, xlSheetName, 410, 9, resFail);
			return false;

		}
	}


	public static boolean checkComplexity() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Select complexity = new Select(passwordComplexity);

		int count = complexity.getOptions().size()-1;

		String actCount = Integer.toString(count);

		String expCount = excelReader.getCellData(xlSheetName, 413, 7);

		excelReader.setCellData(xlfile, xlSheetName, 413, 8, actCount);

		System.out.println("actCount : "+actCount+" Value Expected : "+expCount);


		if(actCount.equalsIgnoreCase(expCount))
		{
			excelReader.setCellData(xlfile, xlSheetName, 412, 9, resPass);
			return true;

		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 412, 9, resFail);
			return false;

		}



	}


	public static boolean checkPasswordPolicySimpleSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		passwordPolicyAddBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(policyName));
		policyName.sendKeys("Simple Policy");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordLength));
		passwordLength.sendKeys(excelReader.getCellData(xlSheetName, 410, 6));	


		Select complexity = new Select(passwordComplexity);

		int count = complexity.getOptions().size()-1;

		String actCount = Integer.toString(count);

		String expCount = excelReader.getCellData(xlSheetName, 413, 7);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));

		passwordPolicySaveBtn.click();
		Thread.sleep(1000);

		String expMessage="Password policy created successfully";/*excelReader.getCellData(xlSheetName, 415, 7);*/

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 415, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage) && actCount.equalsIgnoreCase(expCount))
		{
			System.out.println("Pass : Password policy Simple complexity Save message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 414, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Simple complexity Save message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 414, 9, resFail);
			return false;
		}

	}



	public static boolean checkPasswordPolicyLists() throws EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameInList));

		passwordPolicyNameInList.click();

        String actpasswordPolicyNameInList=passwordPolicyNameInList.getText();
		 */


		int count = passwordPolicyNameLists.size();
		ArrayList<String> passwordList = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{

			String data = passwordPolicyNameLists.get(i).getText();
			if(data.equalsIgnoreCase("Simple Policy"))
			{
				passwordList.add(data);
			}

		}

		String actpasswordPolicyNameInList = passwordList.toString();

		String exppasswordPolicyNameInList ="[Simple Policy]";/* excelReader.getCellData(xlSheetName, 417, 7)*/

		System.out.println("actSavedPasswordpolicy  : "+actpasswordPolicyNameInList);
		System.out.println("expSavedPasswordPolicy  : "+exppasswordPolicyNameInList);


		/*String exppasswordPolicyNameInList = excelReader.getCellData(xlSheetName, 417, 7);

        excelReader.setCellData(xlfile, xlSheetName, 417, 8, actpasswordPolicyNameInList);

		System.out.println(actpasswordPolicyNameInList);*/

		if(actpasswordPolicyNameInList.equalsIgnoreCase(exppasswordPolicyNameInList))
		{
			System.out.println("Pass : Password policy Simple is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 416, 9, resPass);
			return true;
		}		
		else
		{
			System.out.println("Fail : Password policy Simple is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 416, 9, resFail);
			return false;
		}

	}




	public static boolean checkGetTheSimplePasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameInList));

		 passwordPolicyNameInList.click();*/

		int count = passwordPolicyNameLists.size();


		for (int i = 0; i < count; i++) 
		{

			String data = passwordPolicyNameLists.get(i).getText();
			if(data.equalsIgnoreCase("Simple Policy"))
			{
				passwordPolicyNameLists.get(i).click();
			}

		}

		Thread.sleep(2000);

		String actpolicyName=policyName.getAttribute("value");
		String exppolicyName = excelReader.getCellData(xlSheetName, 419, 7);

		String actpasswordLength=passwordLength.getAttribute("value");
		String exppasswordLength = excelReader.getCellData(xlSheetName, 420, 7);


		Select complexity = new Select(passwordComplexity);

		List<WebElement> options=complexity.getOptions();

		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		String actpasswordComplexity = selectedValue.getFirstSelectedOption().getText();
		String exppasswordComplexity = excelReader.getCellData(xlSheetName, 421, 7);

		System.out.println("actpolicyName : "+actpolicyName);
		System.out.println("actpasswordLength : "+actpasswordLength);
		System.out.println("actpasswordComplexity :"+actpasswordComplexity);

		if(actpolicyName.equalsIgnoreCase(exppolicyName) && actpasswordLength.equalsIgnoreCase(exppasswordLength) && actpasswordComplexity.equalsIgnoreCase(exppasswordComplexity))
		{

			System.out.println("Pass : Password policy Complexity Simple is dipslaying");
			excelReader.setCellData(xlfile, xlSheetName, 418, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Simple is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 418, 9, resFail);

			//closeMsgPasswordGlobalError.click();
			return false;
		}

	}



	public static boolean checkUpdateSimplePasswordPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		/*
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameInList));

		passwordPolicyNameInList.click();*/



		Thread.sleep(2000);

		int count = passwordPolicyNameLists.size();


		for (int i = 0; i < count; i++) 
		{

			String data = passwordPolicyNameLists.get(i).getText();
			if(data.equalsIgnoreCase("Simple Policy"))
			{
				passwordPolicyNameLists.get(i).click();
			}

		}



		getAction().doubleClick(passwordLength).perform();
		/*getAction().moveToElement(passwordLength).sendKeys(Keys.END).perform();*/

		getAction().moveToElement(passwordLength).sendKeys(Keys.BACK_SPACE).perform();

		passwordLength.sendKeys(excelReader.getCellData(xlSheetName, 422, 6));

		passwordPolicySaveBtn.click();
		Thread.sleep(1000);

		String expMessage=excelReader.getCellData(xlSheetName, 423, 7);

		String actMessage=checkValidationMessage(expMessage);
		
		System.out.println("actMessage:"+actMessage +"value expected:"+expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 423, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Password policy Simple complexity Save message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 422, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Simple complexity Save message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 422, 9, resFail);
			return false;
		}

	}


	public static boolean checkGetTheUpdatedPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameInList));
		passwordPolicyNameInList.click();
		 */



		int count = passwordPolicyNameLists.size();


		for (int i = 0; i < count; i++) 
		{

			String data = passwordPolicyNameLists.get(i).getText();
			if(data.equalsIgnoreCase("Simple Policy"))
			{
				passwordPolicyNameLists.get(i).click();
			}

		}


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordComplexity));

		//WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(passwordComplexity);
		String actpasswordComplexity = selectedValue.getFirstSelectedOption().getText();

		String exppasswordComplexity = excelReader.getCellData(xlSheetName, 425, 7);
		System.out.println("actpasswordComplexity  :  "+actpasswordComplexity);


		excelReader.setCellData(xlfile, xlSheetName, 425, 8, actpasswordComplexity);

		if(actpasswordComplexity.equalsIgnoreCase(exppasswordComplexity))
		{
			System.out.println("Pass : Password Policy, Updated Complexity is displaying Correct");
			excelReader.setCellData(xlfile, xlSheetName, 424, 9, resPass);
			return true;
		}    
		else
		{
			System.out.println("Fail : Password policy, Updated Complexity is not displaying Correct");
			excelReader.setCellData(xlfile, xlSheetName, 424, 9, resFail);
			return false;
		}


	}





	public static boolean checkAlertOnDeletePasswordPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		passwordPolicyAddBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(policyName));
		policyName.sendKeys(excelReader.getCellData(xlSheetName, 426, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordLength));
		passwordLength.sendKeys(excelReader.getCellData(xlSheetName, 427, 6));		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		passwordPolicySaveBtn.click();
		Thread.sleep(1000);

		String actMessageSave=checkValidationMessage("Password policy created successfully");

		Thread.sleep(3000);

		int count = passwordPolicyNameLists.size();

		for (int i = 0; i < count; i++) 
		{
			String data = passwordPolicyNameLists.get(i).getText();

			if (data.equalsIgnoreCase("PaswordPolicy")) 
			{
				passwordPolicyNameLists.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}

		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameListTwo));

		 passwordPolicyNameListTwo.click();*/

		passwordPolicyDeletebtn.click();
		
		Thread.sleep(2000);
		getWaitForAlert();

		
		Thread.sleep(2000);
		String getExpectedCompMsg="Are you sure that you want to delete this policy?";

		String actCompanySaveMsg=getDriver().switchTo().alert().getText();

		System.out.println("actCompanySaveMsg : "+actCompanySaveMsg);

		excelReader.setCellData(xlfile, xlSheetName, 427, 8, actCompanySaveMsg);
		
		Thread.sleep(1000);
		getDriver().switchTo().alert().accept();
		Thread.sleep(1000);

		String expMessage=excelReader.getCellData(xlSheetName, 431, 7);


		String actMessage=checkValidationMessage(expMessage);

		System.out.println("actMessage:  "+actMessage);
		System.out.println("expMessage:  "+expMessage);

		if(actCompanySaveMsg.equalsIgnoreCase(getExpectedCompMsg) && actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, xlSheetName, 426, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 426, 9, resFail);
			return false;
		}
	}




	public static boolean checkCancelInAlertDeletePasswordPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(3000);


		getAlert().dismiss();

		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameListTwo));
		 passwordPolicyNameListTwo.click();*/



		int count = passwordPolicyNameLists.size();

		for (int i = 0; i < count; i++) 
		{
			String data = passwordPolicyNameLists.get(i).getText();

			if (data.equalsIgnoreCase("PaswordPolicy")) 
			{
				passwordPolicyNameLists.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}

		String actpasswordPolicyNameListTwo=passwordPolicyNameListTwo.getText();

		String exppasswordPolicyNameListTwo = excelReader.getCellData(xlSheetName, 429, 7);

		System.out.println(actpasswordPolicyNameListTwo);

		excelReader.setCellData(xlfile, xlSheetName, 429, 8, actpasswordPolicyNameListTwo);

		if(actpasswordPolicyNameListTwo.equalsIgnoreCase(exppasswordPolicyNameListTwo))
		{
			System.out.println("Pass : Password policy Simple is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 428, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Simple is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 428, 9, resFail);
			return false;
		}


	}



	public static boolean checkOkInAlertDeletePasswordPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyNameListTwo));
		 passwordPolicyNameListTwo.click();

		 Thread.sleep(2000);

           passwordPolicyDeletebtn.click();*/ 			
		getWaitForAlert();

		getDriver().switchTo().alert().accept();

		String expMessage=excelReader.getCellData(xlSheetName, 431, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 431, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Password policy Simple is Deleted Successfully Message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 430, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Simple is Deleted Successfully Message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 430, 9, resFail);
			return false;
		}				

	}




	public static boolean checkSaveAlphabetsWithDoNotAllowPreviousPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));

		passwordPolicyAddBtn.click();

		policyName.sendKeys("Alphabets with Dont allow Previous as Three");

		passwordLength.sendKeys("4");

		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();



		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(1);


		doNotAllowPrevious.sendKeys("3");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));

		passwordPolicySaveBtn.click();
		Thread.sleep(1000);

		String expMessage="Password policy created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Password policy Alphabets complexity Save message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 42, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Alphabets complexity Save message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 42, 9, resFail);
			return false;
		}
	}


	public static boolean checkSaveAlphanumericPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));

		passwordPolicyAddBtn.click();

		policyName.sendKeys("Alphabets With Numeric");

		passwordLength.sendKeys("4");

		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();



		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(2);




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));

		passwordPolicySaveBtn.click();

		String expMessage="Password policy created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Password policy Alphabets complexity Save message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 43, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Alphabets complexity Save message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 43, 9, resFail);
			return false;
		}
	}



	public static boolean checkSaveAlphanumericStarPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));

		passwordPolicyAddBtn.click();

		policyName.sendKeys("Alphabets With Numeric Star");

		passwordLength.sendKeys("4");

		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();



		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(3);




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));

		passwordPolicySaveBtn.click();

		String expMessage="Password policy created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Password policy Alphabets complexity Save message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 44, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Alphabets complexity Save message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 44, 9, resFail);
			return false;
		}
	}



	public static boolean checkSaveNumericPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));

		passwordPolicyAddBtn.click();

		policyName.sendKeys("Numeric");

		passwordLength.sendKeys("5");

		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();



		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(4);




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));

		passwordPolicySaveBtn.click();

		String expMessage="Password policy created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Password policy Alphabets complexity Save message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 45, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Alphabets complexity Save message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 45, 9, resFail);
			return false;
		}
	}





	public static boolean checkSaveAlphaNumericSpecialPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));

		passwordPolicyAddBtn.click();

		policyName.sendKeys("Alpha Numeric Special");

		passwordLength.sendKeys("6");

		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();

		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByIndex(5);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));

		passwordPolicySaveBtn.click();

		String expMessage="Password policy created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Password policy Alphabets complexity Save message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 46, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Password policy Alphabets complexity Save message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 46, 9, resFail);
			return false;
		}
	}





	public static boolean checkInputAlphaNumericSpecialStarPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));

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
			excelReader.setCellData(xlfile, xlSheetName, 47, 9, resPass);

			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 47, 9, resFail);
			return false;
		}


	}




	public static boolean checkMandatoyEmailAlphaNumericSpecailStarAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Select lockout = new Select(passwordLockOutUnits);

		lockout.selectByIndex(1);

		getAction().moveToElement(passwordLockOutUnits).sendKeys(Keys.TAB).perform();

		sendMailCheck.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));

		passwordPolicySaveBtn.click();

		String expMessage="Provide email address for Send E-Mail";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Provide email address for Send E-Mail Validation message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 48, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Provide email address for Send E-Mail Validation message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 48, 9, resFail);
			return false;
		}

	}


	public static boolean checkMandatoryEmailOnLoginSuccess() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));

		sendEmailId.sendKeys("naveenkumar@focussoftnet.com");

		getAction().moveToElement(sendEmailId).sendKeys(Keys.TAB).perform();

		sendMailOnSuccess.click();

		passwordPolicySaveBtn.click();

		String expMessage="Provide email address for Send E-Mail on login success";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Provide email address for Send E-Mail on Login Success Validation message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 49, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Provide email address for Send E-Mail on Login Success Validation message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 49, 9, resFail);
			return false;
		}

	}




	public static boolean checkMandatoryEmailOnLoginFailure() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));

		sendEmailOnLoginSuccess.sendKeys("naveenkumar@focussoftnet.com");

		Thread.sleep(2000);

		getAction().moveToElement(sendEmailOnLoginSuccess).sendKeys(Keys.TAB).perform();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendMailOnFailure));
		sendMailOnFailure.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		passwordPolicySaveBtn.click();

		String expMessage="Provide email address for Send E-Mail on login failure";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Provide email address for Send E-Mail on login failure Validation message is displaying");
			Thread.sleep(9000);
			excelReader.setCellData(xlfile, xlSheetName, 50, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Provide email address for Send E-Mail on login failure Validation message is not displaying");
			Thread.sleep(9000);
			excelReader.setCellData(xlfile, xlSheetName, 50, 9, resFail);
			return false;
		}
	}


	public static boolean checkValidEmailOnSendEmailId() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendMailOnFailure));
		sendMailOnFailure.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));

		sendEmailId.click();

		sendEmailId.clear();

		sendEmailId.sendKeys("naveenkumar");

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));

		passwordPolicySaveBtn.click();

		String expMessage="Invalid email address";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Invalid email address message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 51, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Invalid email address message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 51, 9, resFail);
			return false;
		}
	}

	public static boolean checkValidEmailOnLoginSucess() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));

		sendEmailId.clear();

		sendEmailId.sendKeys("naveenkumar@focussoftnet.com");

		getAction().moveToElement(sendEmailId).sendKeys(Keys.TAB).perform();

		sendMailOnSuccess.click();

		sendEmailOnLoginSuccess.sendKeys("naveenkumar");

		//sendEmailOnLoginFailure.sendKeys("naveenkumar@focussoftnet.com");

		passwordPolicySaveBtn.click();

		String expMessage="Invalid email address";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Invalid email address message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 52, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Invalid email address message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 52, 9, resFail);
			return false;
		}
	}

	public static boolean checkValidEmailOnLoginFailure() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));

		sendEmailOnLoginSuccess.clear();

		sendEmailOnLoginSuccess.sendKeys("naveenkumar@focussoftnet.com");

		getAction().moveToElement(sendEmailOnLoginSuccess).sendKeys(Keys.TAB).perform();

		sendMailOnFailure.click();

		sendEmailOnLoginFailure.sendKeys("naveenkumar");

		passwordPolicySaveBtn.click();

		String expMessage="Invalid email address";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Invalid email address message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 53, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Invalid email address message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 53, 9, resFail);
			return false;
		}
	}


	public static boolean checkSavePasswordPolicyWithAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailId));

		sendEmailId.clear();
		sendEmailId.sendKeys("naveenkumar@focussoftnet.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailOnLoginSuccess));
		sendEmailOnLoginSuccess.clear();
		sendEmailOnLoginSuccess.sendKeys("naveenkumar@focussoftnet.com");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailOnLoginFailure));
		sendEmailOnLoginFailure.clear();
		sendEmailOnLoginFailure.sendKeys("naveenkumar@foussoftnet.com");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(changePasswordAfterFirstLogin));
		changePasswordAfterFirstLogin.click();

		getAction().moveToElement(changePasswordAfterFirstLogin).sendKeys(Keys.TAB).perform();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotChangePassword));
		cannotChangePassword.click();

		getAction().moveToElement(cannotChangePassword).sendKeys(Keys.TAB).perform();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(otpBasedLogin));
		otpBasedLogin.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		passwordPolicySaveBtn.click();

		String expMessage="Password policy created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Invalid email address message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 54, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Invalid email address message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 54, 9, resFail);
			return false;
		}
	}








	public static boolean checkCannotChangePasswordInPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));

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

		String expMessage="Password policy created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Pass : Invalid email address message is displaying");
			excelReader.setCellData(xlfile, xlSheetName, 55, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail : Invalid email address message is not displaying");
			excelReader.setCellData(xlfile, xlSheetName, 55, 9, resFail);
			return false;
		}

	}



	public static boolean checkCancelBtnInPasswordPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(4999);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));

		passwordPolicyAddBtn.click();

		policyName.sendKeys("Cancel Button");

		passwordLength.sendKeys("2");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyCancelBtn));
		passwordPolicyCancelBtn.click();


		Thread.sleep(4000);

		String policyNameCancel=policyName.getAttribute("disabled");

		System.out.println("policyNameCancel"+policyNameCancel);

		if(policyNameCancel.equalsIgnoreCase("true"))
		{
			excelReader.setCellData(xlfile, xlSheetName, 56, 9, resPass);
			return true;

		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 56, 9, resFail);
			return false;

		}
	}




	//Need to Update this test case

	public static boolean checkCloseBtnInPasswordpolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyCloseBtn));
		passwordPolicyCloseBtn.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));

		if(labelDashboard.isDisplayed() &&
				selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() &&
				dashboardCustomizationSettings.isDisplayed())
		{
			excelReader.setCellData(xlfile, xlSheetName, 57, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 57, 9, resFail);
			return false;
		}

	}


	//Home Menu Security Menu Password Policy Stops


	//Home Menu Security Menu Create Profile Starts

	@FindBy(xpath="//span[contains(text(),'Create Profile')]")
	public static WebElement createProfileMenu;

	public boolean checkOpenSecurityMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
		createProfileMenu.click();

		Thread.sleep(2000);

		boolean actcreateProfileLabel=createProfileLabel.isDisplayed();
		boolean actcreateProfileProfileNameDropdown=createProfileProfileNameCombo.isDisplayed();
		boolean actcreateProfileSaveIcon=createProfileSaveIcon.isDisplayed();
		boolean actcreateProfileDeleteIcon=createProfileDeleteIcon.isDisplayed();
		boolean actcreateUserLoadFormIcon=createUserLoadFromIcon.isDisplayed();
		boolean actcreateProfileCloseIcon=createProfileCloseIcon.isDisplayed();
		boolean actcreateProfileSelectAllIcon=createProfileSelectAllIcon.isDisplayed();
		boolean actcreateProfileUnSelectAllIcon=createProfileUnSelectAllIcon.isDisplayed();
		boolean actcreateProfileHomeExpandBtn=createProfileHomeExpandBtn.isDisplayed();
		boolean actcreateProfileFininicalExpandBtn=createProfileFinancalsExpandBtn.isDisplayed();
		boolean actcreateProfileInventoryExpandBtn=createProfileInventoryExpandBtn.isDisplayed();
		boolean actcreateProfileFixedAssestsExpandBtn=createProfileFixedAssestsExpandBtn.isDisplayed();
		boolean actcreateProfilePointOfSaleExpandBtn=createProfilePointOfSaleExpandBtn.isDisplayed();
		boolean actcreateProfileQualityExpandBtn=createProfileQualityControlExpandBtn.isDisplayed();
		boolean actcreateProfileSettingExpandBtn=createProfileSettingExpandBtn.isDisplayed();


		boolean expcreateProfileLabel=true;
		boolean expcreateProfileProfileNameDropdown=true;
		boolean expcreateProfileSaveIcon=true;
		boolean expcreateProfileDeleteIcon=true;
		boolean expcreateUserLoadFormIcon=true;
		boolean expcreateProfileCloseIcon=true;
		boolean expcreateProfileSelectAllIcon=true;
		boolean expcreateProfileUnSelectAllIcon=true;
		boolean expcreateProfileHomeExpandBtn=true;
		boolean expcreateProfileFininicalExpandBtn=true;
		boolean expcreateProfileInventoryExpandBtn=true;
		boolean expcreateProfileFixedAssestsExpandBtn=true;
		boolean expcreateProfilePointOfSaleExpandBtn=true;
		boolean expcreateProfileQualityExpandBtn=true;
		boolean expcreateProfileSettingExpandBtn=true;



		System.out.println("createProfileLabel                 : "+actcreateProfileLabel                  +"  value expected  "+expcreateProfileLabel);
		System.out.println("createProfileProfileNameDropdown   : "+actcreateProfileProfileNameDropdown    +"  value expected  "+expcreateProfileProfileNameDropdown);
		System.out.println("createProfileSaveIcon              : "+actcreateProfileSaveIcon               +"  value expected  "+expcreateProfileSaveIcon);
		System.out.println("createProfileDeleteIcon            : "+actcreateProfileDeleteIcon             +"  value expected  "+expcreateProfileDeleteIcon);
		System.out.println("createUserLoadFormIcon             : "+actcreateUserLoadFormIcon              +"  value expected  "+expcreateUserLoadFormIcon);
		System.out.println("createProfileCloseIcon             : "+actcreateProfileCloseIcon              +"  value expected  "+expcreateProfileCloseIcon);
		System.out.println("createProfileSelectAllIcon         : "+actcreateProfileSelectAllIcon          +"  value expected  "+expcreateProfileSelectAllIcon);
		System.out.println("createProfileUnSelectAllIcon       : "+actcreateProfileUnSelectAllIcon        +"  value expected  "+expcreateProfileUnSelectAllIcon);
		System.out.println("createProfileHomeExpandBtn         : "+actcreateProfileHomeExpandBtn          +"  value expected  "+expcreateProfileHomeExpandBtn);
		System.out.println("createProfileFininicalExpandBtn    : "+actcreateProfileFininicalExpandBtn     +"  value expected  "+expcreateProfileFininicalExpandBtn);
		System.out.println("createProfileInventoryExpandBtn    : "+actcreateProfileInventoryExpandBtn     +"  value expected  "+expcreateProfileInventoryExpandBtn);
		System.out.println("createProfileFixedAssestsExpandBtn : "+actcreateProfileFixedAssestsExpandBtn  +"  value expected  "+expcreateProfileFixedAssestsExpandBtn);
		System.out.println("createProfilePointOfSaleExpandBtn  : "+actcreateProfilePointOfSaleExpandBtn   +"  value expected  "+expcreateProfilePointOfSaleExpandBtn);
		System.out.println("createProfileQualityExpandBtn      : "+actcreateProfileQualityExpandBtn       +"  value expected  "+expcreateProfileQualityExpandBtn);
		System.out.println("createProfileSettingExpandBtn      : "+actcreateProfileSettingExpandBtn       +"  value expected  "+expcreateProfileSettingExpandBtn);

		if (actcreateProfileLabel==expcreateProfileLabel && actcreateProfileProfileNameDropdown==expcreateProfileProfileNameDropdown && 
				actcreateProfileSaveIcon==expcreateProfileSaveIcon && actcreateProfileDeleteIcon==expcreateProfileDeleteIcon && 
				actcreateUserLoadFormIcon==expcreateUserLoadFormIcon && actcreateProfileCloseIcon==expcreateProfileCloseIcon && 
				actcreateProfileSelectAllIcon==expcreateProfileSelectAllIcon && actcreateProfileUnSelectAllIcon==expcreateProfileUnSelectAllIcon && 
				actcreateProfileHomeExpandBtn==expcreateProfileHomeExpandBtn && actcreateProfileFininicalExpandBtn==expcreateProfileFininicalExpandBtn && 
				actcreateProfileInventoryExpandBtn==expcreateProfileInventoryExpandBtn && actcreateProfileFixedAssestsExpandBtn==expcreateProfileFixedAssestsExpandBtn && 
				actcreateProfilePointOfSaleExpandBtn==expcreateProfilePointOfSaleExpandBtn && actcreateProfileQualityExpandBtn==expcreateProfileQualityExpandBtn && 
				actcreateProfileSettingExpandBtn==expcreateProfileSettingExpandBtn)
		{
			System.out.println(" Pass :  Displayed Successfully All the Elements in Create Profile Screen ");
			excelReader.setCellData(xlfile, xlSheetName, 62, 9, resPass);
			return true;
		} else {
			System.out.println(" Fail :  Displayed Successfully All the Elements in Create Profile Screen ");
			excelReader.setCellData(xlfile, xlSheetName, 62, 9, resFail);
			return false;
		}
	}

	public boolean checkSaveProfileWithProfileNameAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Please provide profile name";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass:  Save Profile button in the Blank Profile Name");
			excelReader.setCellData(xlfile, xlSheetName, 63, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail: Save Profile button in the Blank Profile Name");
			excelReader.setCellData(xlfile, xlSheetName, 63, 9, resFail);
			return false;
		}

	}



	public boolean checkErrorMessageDisplayInputProfileName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.click();
		createProfileProfileNameCombo.sendKeys("All Profile");

		try
		{

			if (errorMessage.isDisplayed()) 
			{
				System.out.println("Fail: Not Allowing to input the Profile Name as All Profile");
				excelReader.setCellData(xlfile, xlSheetName, 64, 9, resPass);
				errorMessageCloseBtn.click();
				return false;
			} 
			else 
			{
				System.out.println("Pass: Allow to input the Profile Name as All Profile");

				return true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Pass: Catch Stmt Allow to input the Profile Name as All Profile");
			excelReader.setCellData(xlfile, xlSheetName, 64, 9, resFail);
			return true;
		}
	}


	public boolean checkMenuOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));

		boolean actcreateProfileHomeExpandBtn=createProfileHomeExpandBtn.isDisplayed();
		boolean actcreateProfileFininicalExpandBtn=createProfileFinancalsExpandBtn.isDisplayed();
		boolean actcreateProfileInventoryExpandBtn=createProfileInventoryExpandBtn.isDisplayed();
		boolean actcreateProfileFixedAssestsExpandBtn=createProfileFixedAssestsExpandBtn.isDisplayed();
		boolean actcreateProfilePointOfSaleExpandBtn=createProfilePointOfSaleExpandBtn.isDisplayed();
		boolean actcreateProfileQualityExpandBtn=createProfileQualityControlExpandBtn.isDisplayed();
		boolean actcreateProfileSettingExpandBtn=createProfileSettingExpandBtn.isDisplayed();


		boolean expcreateProfileHomeExpandBtn=true;
		boolean expcreateProfileFininicalExpandBtn=true;
		boolean expcreateProfileInventoryExpandBtn=true;
		boolean expcreateProfileFixedAssestsExpandBtn=true;
		boolean expcreateProfilePointOfSaleExpandBtn=true;
		boolean expcreateProfileQualityExpandBtn=true;
		boolean expcreateProfileSettingExpandBtn=true;


		System.out.println("createProfileHomeExpandBtn         : "+actcreateProfileHomeExpandBtn          +"  value expected  "+expcreateProfileHomeExpandBtn);
		System.out.println("createProfileFininicalExpandBtn    : "+actcreateProfileFininicalExpandBtn     +"  value expected  "+expcreateProfileFininicalExpandBtn);
		System.out.println("createProfileInventoryExpandBtn    : "+actcreateProfileInventoryExpandBtn     +"  value expected  "+expcreateProfileInventoryExpandBtn);
		System.out.println("createProfileFixedAssestsExpandBtn : "+actcreateProfileFixedAssestsExpandBtn  +"  value expected  "+expcreateProfileFixedAssestsExpandBtn);
		System.out.println("createProfilePointOfSaleExpandBtn  : "+actcreateProfilePointOfSaleExpandBtn   +"  value expected  "+expcreateProfilePointOfSaleExpandBtn);
		System.out.println("createProfileQualityExpandBtn      : "+actcreateProfileQualityExpandBtn       +"  value expected  "+expcreateProfileQualityExpandBtn);
		System.out.println("createProfileSettingExpandBtn      : "+actcreateProfileSettingExpandBtn       +"  value expected  "+expcreateProfileSettingExpandBtn);


		if (actcreateProfileHomeExpandBtn==expcreateProfileHomeExpandBtn && actcreateProfileFininicalExpandBtn==expcreateProfileFininicalExpandBtn && 
				actcreateProfileInventoryExpandBtn==expcreateProfileInventoryExpandBtn && actcreateProfileFixedAssestsExpandBtn==expcreateProfileFixedAssestsExpandBtn && 
				actcreateProfilePointOfSaleExpandBtn==expcreateProfilePointOfSaleExpandBtn && actcreateProfileQualityExpandBtn==expcreateProfileQualityExpandBtn && 
				actcreateProfileSettingExpandBtn==expcreateProfileSettingExpandBtn) 
		{
			System.out.println("  Pass:  Displayed All the Menu Options in Create Profile Screen");
			excelReader.setCellData(xlfile, xlSheetName, 65, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("  Fail:  Displayed All the Menu Options in Create Profile Screen");

			excelReader.setCellData(xlfile, xlSheetName, 65, 9, resFail);
			return false;
		}

	}


	//Create Profile Home Options

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[1]/a/span")
	public static WebElement homeCompanyExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[2]/a/span")
	public static WebElement homeSecurityExapndBtn ;

	@FindBy(xpath="//span[contains(text(),'Network Policy')]")
	public static WebElement networkPolicyMenu;

	@FindBy(xpath="//span[contains(text(),'Password policy')]")
	public static WebElement passwordPolicyMenu;

	@FindBy(xpath="//span[contains(text(),'Create Role')]")
	public static WebElement createRoleMenu;

	@FindBy(xpath="//a[@id='12']//span[contains(text(),'Change Password')]")
	public static WebElement changePasswordMenu;

	@FindBy(xpath="//span[contains(text(),'Update Personal Info')]")
	public static WebElement updatePersoanalInfo;

	@FindBy(xpath="//span[contains(text(),'Usage Log')]")
	public static WebElement usageLogMenu;

	@FindBy(xpath="//span[contains(text(),'Currently Logged Users')]")
	public static WebElement currentlyLoggedUsersMenu;

	@FindBy(xpath="//span[contains(text(),'User rights report')]")
	public static WebElement userRightsReportsMenu;

	@FindBy(xpath="//span[contains(text(),'Role rights report')]")
	public static WebElement roleRightsREports;

	@FindBy(xpath="//span[contains(text(),'Profile rights report')]")
	public static WebElement profileRightsReportsMenu;

	@FindBy(xpath="//*[@id='Profilemenu']/li[1]/ul/li[3]/i")
	public static WebElement homeMastersExpandBtn;

	@FindBy(xpath="(//*[@id='1104'])[2]")
	public static WebElement masterAccountOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='1106']//span[contains(text(),'Department')]")
	public static WebElement accountDepartmentOption;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[4]/a/span")
	public static WebElement homeDataManagementExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[5]/a/span")
	public static WebElement homeUtilitesExpandBtn;



	//Create profile Financial Menu options

	@FindBy(xpath="//*[@id='Profilemenu']/li[2]/ul/li[1]/i")
	public static WebElement financialsTransactionsExpandBtn;

	@FindBy(xpath="//*[@id='Profilemenu']/li[2]/ul/li[1]/ul//li")
	public static List<WebElement> financialsTransactionsList;

	@FindBy(xpath="//li[@class='treeview']//a[@id='2001']//span[contains(text(),'Cash and Bank')]")
	public static WebElement financialsTransactionsCashAndBank;

	@FindBy(xpath="//li[@class='active']//a[@id='2007']//span[contains(text(),'Purchases')]")
	public static WebElement financialsTransactionsPurchases;

	@FindBy(xpath="//li[@class='treeview']//a[@id='2014']//span[contains(text(),'Sales')]")
	public static WebElement financialsTransactionsSales;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Journals')]")
	public static WebElement financialsTransactionsJournals;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Auto Postings')]")
	public static WebElement financialsTransactionsAutoPostings;



	@FindBy(xpath="//*[@id='Profilemenu']/li[2]/ul/li[1]/ul/li[3]/i")
	public static WebElement financialsTransactionsSalesExpandBtn;

	@FindBy(xpath="//*[@id='Profilemenu']/li[2]/ul/li[1]/ul/li[3]/ul/li")
	public static List<WebElement> financialsTransactionsSalesOptionsList;

	@FindBy(xpath="(//*[@id='2015'])[2]")
	public static WebElement financialsTransactionsSalesInvoiceOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Sales Returns')]")
	public static WebElement financialsTransactionsSalesReturnsOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Auto Sales Invoice')]")
	public static WebElement financialsTransactionsAutoSalesInvoiceOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Sales Invoice N')]")
	public static WebElement financialsTransactionsSalesInvoiceNOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Cash Sales')]")
	public static WebElement financialsTransactionsCashSalesOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Hire-Purchase Sales')]")
	public static WebElement financialsTransactionsHirePurchaseSalesOption;

	@FindBy(xpath="//*[@id='Profilemenu']/li[2]/ul/li[1]/ul/li[2]/i")
	public static WebElement financialsTransactionsPurchasesExpandBtn;

	@FindBy(xpath="(//*[@id='2008'])[2]")
	public static WebElement financialsTransactionsPurchasesVoucherOption;



	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[2]/a/span")
	public static WebElement financialsCreditManagementExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[3]/a/span")
	public static WebElement finincalsReportsExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[4]/a/span")
	public static WebElement finalAccountsExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[5]/a/span")
	public static WebElement financialsReceivableandPayableAnalysisExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[6]/a/span")
	public static WebElement financialsBudgetExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[2]/ul/li[7]/a/span")
	public static WebElement financialsOnlinePaymentsExpandBtn;

	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement faAccessChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement faAddchkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement faEditChkBox;

	@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
	public static WebElement faDeleteChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement faSaveChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement faPOstDepreciationChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement faMultipleAssetUsageDeleteChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement faMultipleusageAssetSaveChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement searchChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement printChkbox;

	@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
	public static WebElement viewChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement exportChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement emailReportChkbox;

	@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
	public static WebElement editPrintlayoutChkbox;

	@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
	public static WebElement viewCustomizeLayoutChkbox;

	@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
	public static WebElement addCustomizeLAyoutChkbox;

	@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
	public static WebElement BackTrackChkbox;

	@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
	public static WebElement emailChkbox;

	@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
	public static WebElement viewGraphChkbox;

	@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
	public static WebElement filterChkbox;

	@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
	public static WebElement analyzeChkbox;

	@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
	public static WebElement crossReferenceChkbox;

	@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
	public static WebElement AddAnalyzeReportChkbox;





	public boolean checkClickOnFinancialMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
		createProfileFinancalsExpandBtn.click();

		Thread.sleep(2000);

		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsExpandBtn));

		boolean acttransactionsExpandBtn=financialsTransactionsExpandBtn.isDisplayed();
		boolean actcreditManagementExpandBtn=financialsCreditManagementExpandBtn.isDisplayed();
		boolean actfinincalsReportsExpandBtn=finincalsReportsExpandBtn.isDisplayed();
		boolean actfinalAccountsExpandBtn=finalAccountsExpandBtn.isDisplayed();
		boolean actreceivableandPayableAnalysisExpandBtn=financialsReceivableandPayableAnalysisExpandBtn.isDisplayed();
		boolean actbudgetExpandBtn=financialsBudgetExpandBtn.isDisplayed();
		boolean actonlineExpandBtn=financialsOnlinePaymentsExpandBtn.isDisplayed();


		boolean exptransactionsExpandBtn=true;
		boolean expcreditManagementExpandBtn=true;
		boolean expfinincalsReportsExpandBtn=true;
		boolean expfinalAccountsExpandBtn=true;
		boolean expreceivableandPayableAnalysisExpandBtn=true;
		boolean expbudgetExpandBtn=true;
		boolean exponlineExpandBtn=true;


		System.out.println("transactionsExpandBtn                 : "+acttransactionsExpandBtn                  +"  value expected  "+exptransactionsExpandBtn);
		System.out.println("creditManagementExpandBtn             : "+actcreditManagementExpandBtn              +"  value expected  "+expcreditManagementExpandBtn);
		System.out.println("finincalsReportsExpandBtn             : "+actfinincalsReportsExpandBtn              +"  value expected  "+expfinincalsReportsExpandBtn);
		System.out.println("finalAccountsExpandBtn                : "+actfinalAccountsExpandBtn                 +"  value expected  "+expfinalAccountsExpandBtn);
		System.out.println("receivableandPayableAnalysisExpandBtn : "+actreceivableandPayableAnalysisExpandBtn  +"  value expected  "+expreceivableandPayableAnalysisExpandBtn);
		System.out.println("budgetExpandBtn                       : "+actbudgetExpandBtn                        +"  value expected  "+expbudgetExpandBtn);
		System.out.println("onlineExpandBtn                       : "+actonlineExpandBtn                        +"  value expected  "+exponlineExpandBtn);


		if (acttransactionsExpandBtn==exptransactionsExpandBtn && actcreditManagementExpandBtn==expcreditManagementExpandBtn &&
				actfinincalsReportsExpandBtn==expfinincalsReportsExpandBtn && actfinalAccountsExpandBtn==expfinalAccountsExpandBtn &&
				actreceivableandPayableAnalysisExpandBtn==expreceivableandPayableAnalysisExpandBtn && actbudgetExpandBtn==expbudgetExpandBtn &&
				actonlineExpandBtn==exponlineExpandBtn) 
		{
			System.out.println("  Pass: Dispalyed Financials Menu And Sub Menu options In Create Profile Screen ");
			excelReader.setCellData(xlfile, xlSheetName, 67, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println("  Fail: Dispalyed Financials Menu And Sub Menu options In Create Profile Screen ");
			excelReader.setCellData(xlfile, xlSheetName, 67, 9, resFail);
			return false;
		}

	}

	//Financial Menu Options by Using Select All


	@FindBy(xpath="//a[@id='2001']//i[@class='icon icon-expand']")
	public static WebElement cashAndBankExpansionBtn;

	@FindBy(xpath="//li[@class='treeview']//a[@id='2002']//span[contains(text(),'Receipts')]")
	public static WebElement CashAndBAnkrecepitOption;

	@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
	public static WebElement recepitAlwayssuspendonsavingChkBox;

	@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
	public static WebElement recepitHideMenuChkBox;


	@FindBy(xpath="//ul[@id='Profilemenu']/li[3]/ul/li[1]/a/span")
	public static WebElement inventorytransactionExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[3]/ul/li[3]/a/span")
	public static WebElement inventoryOrderMangementExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[3]/ul/li[2]/a/span")
	public static WebElement inventoryreportsExpandBtn;

	@FindBy(xpath="//*[@id='Profilemenu']/li[3]/ul/li[2]/ul/li/a/span")
	public static List<WebElement> inventoryReportsOptionsList;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Item Query')]")
	public static WebElement inventoryReportsItemQueryOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Ledger')]")
	public static WebElement inventoryReportsStockLedgerOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Opening Stocks Register')]")
	public static WebElement inventoryReportsOpeningStocksRegisterOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Statement')]")
	public static WebElement inventoryReportsStockStatmentOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='575']//span[contains(text(),'Stock Movement')]")
	public static WebElement inventoryReportsStockMovementOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Multi Level Stock Movement')]")
	public static WebElement inventoryReportsMultiLevelStockMovementOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Virtual Stock Analysis')]")
	public static WebElement inventoryReportsVirtualStockAnalysisOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Valuation')]")
	public static WebElement inventoryReportsStockValuationOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock report by Tag')]")
	public static WebElement inventoryReportsStockReportByTagOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='579']//span[contains(text(),'ABC Analysis')]")
	public static WebElement inventoryReportsABCAnalysisOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Analysis by Batch')]")
	public static WebElement inventoryReportsStockAnalysisByBatchOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Analysis by RMA')]")
	public static WebElement inventoryReportsStockAnalysisByRMAOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Bins Report')]")
	public static WebElement inventoryReportsBinsReportOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock balance by warehouse')]")
	public static WebElement inventoryReportsStockBalanceByWarehouseOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock ageing analysis')]")
	public static WebElement inventoryReportsStockAgeingAnalysis;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Reorder Report')]")
	public static WebElement inventoryReportsReorderReportOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='584']//span[contains(text(),'Fast Moving Item')]")
	public static WebElement inventoryReportsFastMovingItemOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='585']//span[contains(text(),'Slow Moving Item')]")
	public static WebElement inventoryReportsSlowMovingItemOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Peak/Low Balances')]")
	public static WebElement inventoryReportsPeakOrLowBalancesOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Best Selling Item')]")
	public static WebElement inventoryReportsBestSellingItemOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Raise Indent Item with Low Stock')]")
	public static WebElement inventoryReportsRaiseIndentItemWithLowStockOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock transfer report')]")
	public static WebElement inventoryReportsStockTransferReportOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Raise request for quote')]")
	public static WebElement inventoryReportsRaiseRequestForQuoteOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock reservation report')]")
	public static WebElement inventoryReportsStockReservationReportOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Transaction type-wise stock report')]")
	public static WebElement inventoryReportsTransactionTypeWiseStockReportOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Actual consumption report')]")
	public static WebElement inventoryReportsActualConsumptionReportOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'General ledger and Inventory mismatch report')]")
	public static WebElement inventoryReportsGeneralLedgerAndInventoryMismatchReportOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Negitive Batch List')]")
	public static WebElement inventoryReportsNegitiveBatchListOption;








	public boolean checkClickOnInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();


		Thread.sleep(2000);

		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));

		boolean actinventorytransactionExpandBtn=inventorytransactionExpandBtn.isDisplayed();
		boolean actinventoryreportsExpandBtn=inventoryreportsExpandBtn.isDisplayed();
		boolean actinventoryOrderMangementExpandBtn=inventoryOrderMangementExpandBtn.isDisplayed();

		boolean expinventorytransactionExpandBtn=true;
		boolean expinventoryreportsExpandBtn=true;
		boolean expinventoryOrderMangementExpandBtn=true;

		System.out.println("inventorytransactionExpandBtn     : "+actinventorytransactionExpandBtn     +"  value expected  "+expinventorytransactionExpandBtn);
		System.out.println("inventoryreportsExpandBtn         : "+actinventoryreportsExpandBtn         +"  value expected  "+expinventoryreportsExpandBtn);
		System.out.println("inventoryOrderMangementExpandBtn  : "+actinventoryOrderMangementExpandBtn  +"  value expected  "+expinventoryOrderMangementExpandBtn);

		if (actinventorytransactionExpandBtn==expinventorytransactionExpandBtn && actinventoryreportsExpandBtn==expinventoryreportsExpandBtn && 
				actinventoryOrderMangementExpandBtn==expinventoryOrderMangementExpandBtn) 
		{
			System.out.println("  Pass: Dispalyed Financials Menu And Sub Menu options In Create Profile Screen ");
			excelReader.setCellData(xlfile, xlSheetName, 68, 9, resPass);
			return true;
		} else {
			System.out.println("  Fail: Dispalyed Financials Menu And Sub Menu options In Create Profile Screen ");
			excelReader.setCellData(xlfile, xlSheetName, 68, 9, resFail);
			return false;
		}

	}


	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement purchaseVocherEditchkBox;


	@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
	public static WebElement purchaseVocherDeleteChkBox;


	//Create Profile Fixed Assets
	@FindBy(xpath="(//*[@id='138'])[2]")
	public static WebElement fixedAssetsTransactionExpandBtn;


	public boolean checkClickOnFixedAssetsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFixedAssestsExpandBtn));
		createProfileFixedAssestsExpandBtn.click();

		Thread.sleep(2000);

		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		boolean actfixedAssetsTransactionExpandBtn=fixedAssetsTransactionExpandBtn.isDisplayed();

		boolean expfixedAssetsTransactionExpandBtn=true;

		System.out.println("fixedAssetsTransactionExpandBtn : "+actfixedAssetsTransactionExpandBtn+"  value expected  "+expfixedAssetsTransactionExpandBtn);

		if (actfixedAssetsTransactionExpandBtn==expfixedAssetsTransactionExpandBtn) 
		{
			System.out.println(" Pass: CLosed Inventory options And Fixed Aseets Transation is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 69, 9, resPass);
			return true;
		} else {
			System.out.println(" Fail: CLosed Inventory options And Fixed Aseets Transation is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 69, 9, resFail);
			return false;
		}
	}


	//Create Profile Production

	@FindBy(xpath="//ul[@id='Profilemenu']/li[5]/ul/li[1]/a/span")
	public static WebElement productiontransactionExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[5]/ul/li[2]/a/span")
	public static WebElement productionreportsExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[5]/ul/li[3]/a/span")
	public static WebElement productionMRPsettingsExpandBtn;





	public boolean  checkClickOnProductionMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProductionExpandBtn));
		createProfileProductionExpandBtn.click();

		Thread.sleep(2000);

		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		boolean actproductiontransactionOption=productiontransactionExpandBtn.isDisplayed();
		boolean actproductionreportsOption=productionreportsExpandBtn.isDisplayed();
		boolean actproductionMRPsettingsOption=productionMRPsettingsExpandBtn.isDisplayed();

		boolean expproductiontransactionOption=true;
		boolean expproductionreportsOption=true;
		boolean expproductionMRPsettingsOption=true;


		System.out.println("productiontransactionOption  : "+actproductiontransactionOption  +"  value expected  "+expproductiontransactionOption);
		System.out.println("productionreportsOption      : "+actproductionreportsOption      +"  value expected  "+expproductionreportsOption);
		System.out.println("productionMRPsettingsOption  : "+actproductionMRPsettingsOption  +"  value expected  "+expproductionMRPsettingsOption);


		if(actproductiontransactionOption==expproductiontransactionOption && actproductionreportsOption==expproductionreportsOption && 
				actproductionMRPsettingsOption==expproductionMRPsettingsOption)
		{
			System.out.println("Test Pass : Unselect all working in production");
			excelReader.setCellData(xlfile, xlSheetName, 70, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Unselect all NOT working in production");
			excelReader.setCellData(xlfile, xlSheetName, 70, 9, resFail);
			return false;
		}
	}



	//create profile Point of sale

	@FindBy(xpath="//ul[@id='Profilemenu']/li[6]/ul/li[1]/a/span")
	public static WebElement POSMainScreenExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[6]/ul/li[2]/a/span")
	public static WebElement POSReportsExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[6]/ul/li[3]/a/span")
	public static WebElement POSTableManagementExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[6]/ul/li[4]/a/span")
	public static WebElement POSUtilitiesExpandBtn;



	//create profile quality control

	@FindBy(xpath="//ul[@id='Profilemenu']/li[7]/ul/li[1]/a/span")
	public static WebElement qtyCtrTransactionsExpandBtn;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[7]/ul/li[2]/a/span")
	public static WebElement qtyCtrReportsExpandBtn;


	//create profile settings

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Configure Transactions')]")
	public static WebElement settingConfigureTransactionsOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='68']//span[contains(text(),'Transaction Authorization')]")
	public static WebElement settingTransactionAuthorizationOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Pricebook Authorization')]")
	public static WebElement settingPricebookAuthorizationOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Configure Masters')]")
	public static WebElement settingConfigureMastersOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Master Authorization')]")
	public static WebElement settingMasterAuthorizationOption;

	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	public static WebElement settingDashboardOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Credit Limit Authorization')]")
	public static WebElement settingCreditLimitAuthorizationOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Design Workflow')]")
	public static WebElement settingDesignWorkflowOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Settings Wizard')]")
	public static WebElement settingSettingsWizardOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Batch Code Generation')]")
	public static WebElement settingBatchCodeGenerationOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Map Credit Limit')]")
	public static WebElement settingMapCreditLimitOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'VAT Tax Code')]")
	public static WebElement settingVATTaxCodeOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Customer Portal Admin')]")
	public static WebElement settingCustomerPortalAdminOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='3308']//span[contains(text(),'Budget Authorization')]")
	public static WebElement settingBudgetAuthorizationOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Payment Gateway Integration')]")
	public static WebElement settingPaymentGatewayIntegrationOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Fixed Asset Authorization')]")
	public static WebElement settingFixedAssetAuthorizationOption;


	public boolean checkClickONPointOfSaleMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfilePointOfSaleExpandBtn));
		createProfilePointOfSaleExpandBtn.click();

		Thread.sleep(2000);

		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSMainScreenExpandBtn));

		boolean actPOSMainScreenExpandBtn=POSMainScreenExpandBtn.isDisplayed();
		boolean actPOSReportsExpandBtn=POSReportsExpandBtn.isDisplayed();
		boolean actPOSTableManagementExpandBtn=POSTableManagementExpandBtn.isDisplayed();
		boolean actPOSUtilitiesExpandBtn=POSUtilitiesExpandBtn.isDisplayed();

		boolean expPOSMainScreenExpandBtn=true;
		boolean expPOSReportsExpandBtn=true;
		boolean expPOSTableManagementExpandBtn=true;
		boolean expPOSUtilitiesExpandBtn=true;

		System.out.println("POSMainScreenExpandBtn       : "+actPOSMainScreenExpandBtn       +"  value expected  "+expPOSMainScreenExpandBtn);
		System.out.println("POSReportsExpandBtn          : "+actPOSReportsExpandBtn          +"  value expected  "+expPOSReportsExpandBtn);
		System.out.println("POSTableManagementExpandBtn  : "+actPOSTableManagementExpandBtn  +"  value expected  "+expPOSTableManagementExpandBtn);
		System.out.println("POSUtilitiesExpandBtn        : "+actPOSUtilitiesExpandBtn        +"  value expected  "+expPOSUtilitiesExpandBtn);

		if (actPOSMainScreenExpandBtn==expPOSMainScreenExpandBtn && actPOSReportsExpandBtn==expPOSReportsExpandBtn && 
				actPOSTableManagementExpandBtn==expPOSTableManagementExpandBtn && actPOSUtilitiesExpandBtn==expPOSUtilitiesExpandBtn) 
		{
			System.out.println(" Pass: Displayed All the Sub Menu Options In POint Of Sale");
			excelReader.setCellData(xlfile, xlSheetName, 71, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail: Displayed All the Sub Menu Options In POint Of Sale");
			excelReader.setCellData(xlfile, xlSheetName, 71, 9, resFail);
			return false;
		}
	}



	public boolean checkClickOnQualityControlMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileQualityControlExpandBtn));
		createProfileQualityControlExpandBtn.click();

		Thread.sleep(2000);

		createProfileSelectAllIcon.click();

		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(qtyCtrTransactionsExpandBtn));

		boolean actqtyCtrTransactionsExpandBtn=qtyCtrTransactionsExpandBtn.isDisplayed();
		boolean actqtyCtrReportsExpandBtn=qtyCtrReportsExpandBtn.isDisplayed();

		boolean expqtyCtrTransactionsExpandBtn=true;
		boolean expqtyCtrReportsExpandBtn=true;

		System.out.println("qtyCtrTransactionsExpandBtn  : "+actqtyCtrTransactionsExpandBtn  +"  value expected  "+expqtyCtrTransactionsExpandBtn);
		System.out.println("qtyCtrReportsExpandBtn       : "+actqtyCtrReportsExpandBtn       +"  value expected  "+expqtyCtrReportsExpandBtn);


		if (actqtyCtrTransactionsExpandBtn==expqtyCtrTransactionsExpandBtn && actqtyCtrReportsExpandBtn==expqtyCtrReportsExpandBtn) 
		{
			System.out.println(" Pass: Display Sub Menu OPtion in Qulaity Control");
			createProfileSelectAllIcon.click();
			excelReader.setCellData(xlfile, xlSheetName, 72, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Display Sub Menu OPtion in Qulaity Control");
			excelReader.setCellData(xlfile, xlSheetName, 72, 9, resFail);
			return false;
		}

	}



	public boolean checkClickOnSettingsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSettingExpandBtn));
		createProfileSettingExpandBtn.click();

		Thread.sleep(2000);

		createProfileSelectAllIcon.click();

		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingConfigureTransactionsOption));

		boolean actsettingConfigureTransactionsOption=settingConfigureTransactionsOption.isDisplayed();
		boolean actsettingTransactionAuthorizationOption=settingTransactionAuthorizationOption.isDisplayed();
		boolean actsettingPricebookAuthorizationOption=settingPricebookAuthorizationOption.isDisplayed();
		boolean actsettingConfigureMastersOption=settingConfigureMastersOption.isDisplayed();
		boolean actsettingMasterAuthorizationOption=settingMasterAuthorizationOption.isDisplayed();
		boolean actsettingDashboardOption=settingDashboardOption.isDisplayed();
		boolean actsettingCreditLimitAuthorizationOption=settingCreditLimitAuthorizationOption.isDisplayed();
		boolean actsettingDesignWorkflowOption=settingDesignWorkflowOption.isDisplayed();
		boolean actsettingSettingsWizardOption=settingSettingsWizardOption.isDisplayed();
		boolean actsettingBatchCodeGenerationOption=settingBatchCodeGenerationOption.isDisplayed(); 
		boolean actsettingMapCreditLimitOption=settingMapCreditLimitOption.isDisplayed();
		boolean actsettingVATTaxCodeOption=settingVATTaxCodeOption.isDisplayed();
		boolean actsettingCustomerPortalAdminOption=settingCustomerPortalAdminOption.isDisplayed(); 
		boolean actsettingBudgetAuthorizationOption=settingBudgetAuthorizationOption.isDisplayed();
		boolean actsettingPaymentGatewayIntegrationOption=settingPaymentGatewayIntegrationOption.isDisplayed();
		boolean actsettingFixedAssetAuthorizationOption=settingFixedAssetAuthorizationOption.isDisplayed();

		boolean expsettingConfigureTransactionsOption=true;
		boolean expsettingTransactionAuthorizationOption=true;
		boolean expsettingPricebookAuthorizationOption=true;
		boolean expsettingConfigureMastersOption=true;
		boolean expsettingMasterAuthorizationOption=true;
		boolean expsettingDashboardOption=true;
		boolean expsettingCreditLimitAuthorizationOption=true;
		boolean expsettingDesignWorkflowOption=true;
		boolean expsettingSettingsWizardOption=true;
		boolean expsettingBatchCodeGenerationOption=true; 
		boolean expsettingMapCreditLimitOption=true;
		boolean expsettingVATTaxCodeOption=true;
		boolean expsettingCustomerPortalAdminOption=true; 
		boolean expsettingBudgetAuthorizationOption=true;
		boolean expsettingPaymentGatewayIntegrationOption=true;
		boolean expsettingFixedAssetAuthorizationOption=true;

		System.out.println("settingConfigureTransactionsOption     : "+actsettingConfigureTransactionsOption      +"  value expected  "+expsettingConfigureTransactionsOption);
		System.out.println("settingTransactionAuthorizationOption  : "+actsettingTransactionAuthorizationOption   +"  value expected  "+expsettingTransactionAuthorizationOption);
		System.out.println("settingPricebookAuthorizationOption    : "+actsettingPricebookAuthorizationOption     +"  value expected  "+expsettingPricebookAuthorizationOption);
		System.out.println("settingConfigureMastersOption          : "+actsettingConfigureMastersOption           +"  value expected  "+expsettingConfigureMastersOption);
		System.out.println("settingMasterAuthorizationOption       : "+actsettingMasterAuthorizationOption        +"  value expected  "+expsettingMasterAuthorizationOption);
		System.out.println("settingDashboardOption                 : "+actsettingDashboardOption                  +"  value expected  "+expsettingDashboardOption);
		System.out.println("settingCreditLimitAuthorizationOption  : "+actsettingCreditLimitAuthorizationOption   +"  value expected  "+expsettingCreditLimitAuthorizationOption);
		System.out.println("settingDesignWorkflowOption            : "+actsettingDesignWorkflowOption             +"  value expected  "+expsettingDesignWorkflowOption);
		System.out.println("settingSettingsWizardOption            : "+actsettingSettingsWizardOption             +"  value expected  "+expsettingSettingsWizardOption);
		System.out.println("settingBatchCodeGenerationOption       : "+actsettingBatchCodeGenerationOption        +"  value expected  "+expsettingBatchCodeGenerationOption);
		System.out.println("settingMapCreditLimitOption            : "+actsettingMapCreditLimitOption             +"  value expected  "+expsettingMapCreditLimitOption);
		System.out.println("settingVATTaxCodeOption                : "+actsettingVATTaxCodeOption                 +"  value expected  "+expsettingVATTaxCodeOption);
		System.out.println("settingCustomerPortalAdminOption       : "+actsettingCustomerPortalAdminOption        +"  value expected  "+expsettingCustomerPortalAdminOption);
		System.out.println("settingBudgetAuthorizationOption       : "+actsettingBudgetAuthorizationOption        +"  value expected  "+expsettingBudgetAuthorizationOption);
		System.out.println("settingPaymentGatewayIntegrationOption : "+actsettingPaymentGatewayIntegrationOption  +"  value expected  "+expsettingPaymentGatewayIntegrationOption);
		System.out.println("settingFixedAssetAuthorizationOption   : "+actsettingFixedAssetAuthorizationOption    +"  value expected  "+expsettingFixedAssetAuthorizationOption);

		if (actsettingConfigureTransactionsOption==expsettingConfigureTransactionsOption && actsettingTransactionAuthorizationOption==expsettingTransactionAuthorizationOption &&
				actsettingPricebookAuthorizationOption==expsettingPricebookAuthorizationOption && actsettingConfigureMastersOption==expsettingConfigureMastersOption && 
				actsettingMasterAuthorizationOption==expsettingMasterAuthorizationOption && actsettingDashboardOption==expsettingDashboardOption && 
				actsettingCreditLimitAuthorizationOption==expsettingCreditLimitAuthorizationOption && actsettingDesignWorkflowOption==expsettingDesignWorkflowOption && 
				actsettingSettingsWizardOption==expsettingSettingsWizardOption && actsettingBatchCodeGenerationOption==expsettingBatchCodeGenerationOption &&   
				actsettingMapCreditLimitOption==expsettingMapCreditLimitOption && actsettingVATTaxCodeOption==expsettingVATTaxCodeOption && 
				actsettingCustomerPortalAdminOption==expsettingCustomerPortalAdminOption && actsettingBudgetAuthorizationOption==expsettingBudgetAuthorizationOption && 
				actsettingPaymentGatewayIntegrationOption==expsettingPaymentGatewayIntegrationOption && actsettingFixedAssetAuthorizationOption==expsettingFixedAssetAuthorizationOption) 
		{
			System.out.println(" Pass: Display All Sun Menu Options In Setting Menu");
			excelReader.setCellData(xlfile, xlSheetName, 73, 9, resPass);
			createProfileSelectAllIcon.click();
			return true;
		}
		else
		{
			System.out.println(" Fail: Display All Sun Menu Options In Setting Menu");
			excelReader.setCellData(xlfile, xlSheetName, 73, 9, resFail);
			return false;
		}



	}


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Bill of Material')]")
	public static WebElement billOfMaterialOption;

	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement productionBill_AddChkBox;



	public boolean checkclickOnSave() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass:  All Profile Is Saved ");
			excelReader.setCellData(xlfile, xlSheetName, 74, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail: All Profile Is Saved");
			excelReader.setCellData(xlfile, xlSheetName, 74, 9, resFail);
			return false;
		}


	}




	@FindBy(xpath="//span[contains(text(),'Access')]")
	public static WebElement faAccessChkboxN;

	@FindBy(xpath="//a[@id='136']//i[@class='icon-collepse']")
	public static WebElement fixedAssetsMinnimizeOption;

	@FindBy(xpath="//a[@id='138']//i[@class='icon-collepse']")
	public static WebElement fixedAssetsTransactionMinimizeOption;


	public boolean  checkRestrictionOptionsUnderFixedAssetsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.click();
		createProfileProfileNameCombo.sendKeys("All Profile");

		Thread.sleep(2000);

		createProfileProfileNameCombo.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
		createProfileFinancalsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFixedAssestsExpandBtn));
		createProfileFixedAssestsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetsTransactionExpandBtn));
		fixedAssetsTransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transAssetUsageOption));
		transAssetUsageOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(faAccessChkbox));
		if (faAccessChkbox.isSelected() && faAddchkbox.isSelected() && faEditChkBox.isSelected() && faDeleteChkbox.isSelected()
				&& faSaveChkbox.isSelected()) 
		{
			System.out.println("Pass : Asset Usage Options Are Checked");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transAddAssetValueOption));
			transAddAssetValueOption.click();

			if (faAccessChkbox.isSelected() && faAddchkbox.isSelected() && faEditChkBox.isSelected() && faDeleteChkbox.isSelected()
					&& faSaveChkbox.isSelected()) 
			{
				System.out.println("Pass : Add Asset Value Options Are Checked");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transReduceAssetValueoption));
				transReduceAssetValueoption.click();

				if (faAccessChkbox.isSelected() && faAddchkbox.isSelected() && faEditChkBox.isSelected() && faDeleteChkbox.isSelected()
						&& faSaveChkbox.isSelected())
				{

					System.out.println("Pass : Reduce Asset Value Options Are Checked");

					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transDisposalOfAssetOption));
					transDisposalOfAssetOption.click();

					if (faAccessChkbox.isSelected() && faAddchkbox.isSelected() && faEditChkBox.isSelected() && faDeleteChkbox.isSelected()
							&& faSaveChkbox.isSelected())
					{
						System.out.println("Pass : Disposal oF Asset Options Are Checked");

						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transPostDepreciationEntriesoption));
						transPostDepreciationEntriesoption.click();


						if (faAccessChkbox.isSelected() && faPOstDepreciationChkbox.isSelected() ) 
						{
							System.out.println("Pass : Post Depreciation Options Are Checked");

							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transCapitalizationofAssetoption));
							transCapitalizationofAssetoption.click();

							if (faAccessChkbox.isSelected() && faAddchkbox.isSelected() && faEditChkBox.isSelected() && faDeleteChkbox.isSelected()
									&& faSaveChkbox.isSelected()) 
							{
								System.out.println("Pass : CapitalizationofAsset Options Are Checked");

								Thread.sleep(3000);

								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transMultipleAssetUsageoption));
								transMultipleAssetUsageoption.click();

								Thread.sleep(3000);

								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(faAccessChkbox));

								if (faAccessChkbox.isSelected() && faMultipleAssetUsageDeleteChkbox.isSelected() && faMultipleusageAssetSaveChkbox.isSelected())
								{

									Thread.sleep(2000);

									getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetsTransactionMinimizeOption));
									fixedAssetsTransactionMinimizeOption.click();

									Thread.sleep(2000);

									getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetsMinnimizeOption));
									fixedAssetsMinnimizeOption.click();



									System.out.println(" Pass : Multiple Asset Usage option Are Checked  ");
									excelReader.setCellData(xlfile, xlSheetName, 75, 9, resPass);
									return true;
								}
								else 
								{


									Thread.sleep(2000);

									getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetsTransactionExpandBtn));
									fixedAssetsTransactionExpandBtn.click();

									Thread.sleep(2000);

									getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFixedAssestsExpandBtn));
									createProfileFixedAssestsExpandBtn.click();

									System.out.println(" Fail : Multiple Asset Usage option Are Checked  ");
									excelReader.setCellData(xlfile, xlSheetName, 75, 9, resFail);
									return false;
								}
							} 
							else 
							{


								System.out.println("Fail : CapitalizationofAsset Options Are Checked");
								excelReader.setCellData(xlfile, xlSheetName, 75, 9, resFail);
								return false;
							}

						} 
						else 
						{
							System.out.println("Fail : Post Depreciation Options Are Checked");
							excelReader.setCellData(xlfile, xlSheetName, 75, 9, resFail);
							return false;
						}
					} 
					else 
					{
						System.out.println("Fail : Disposal oF Asset Options Are Checked");
						excelReader.setCellData(xlfile, xlSheetName, 75, 9, resFail);
						return false;
					}
				} 
				else 
				{
					System.out.println("Fail : Reduce Asset Value Options Are Checked");
					excelReader.setCellData(xlfile, xlSheetName, 75, 9, resFail);
					return false;
				}			
			} else {
				System.out.println("Fail : Add Asset Value Options Are Checked");
				excelReader.setCellData(xlfile, xlSheetName, 75, 9, resFail);
				return false;
			}
		} 
		else 
		{
			System.out.println("Fail : Asset Usage Options Are Checked");
			excelReader.setCellData(xlfile, xlSheetName, 75, 9, resFail);
			return false;
		}
	}



	// create profile inventory transactions purchase

	@FindBy(xpath="//li[@class='treeview']//a[@id='139']//span[contains(text(),'Purchases')]")
	public static WebElement inventoryTransactionPurchaseExpandBtn;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Request for Quote')]")
	public static WebElement RequestforQuoteOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Purchases Quotations')]")
	public static WebElement purchasesQuotationsOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='2012']//span[contains(text(),'Purchases Orders')]")
	public static WebElement purchaseOrderOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Material Receipt Notes')]")
	public static WebElement materialReceiptNotesOPtion;




	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Home')]")
	public static WebElement homemenu;

	@FindBy(xpath="//i[@class='icon-expand']")
	public static WebElement homemnu;



	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Financials')]")
	public static WebElement finanaceMenu;



	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Inventory')]")
	public static WebElement inventoryMenu;



	@FindBy(xpath="//li[@class='treeview']//a[@id='137']//span[contains(text(),'Transactions')]")
	public static WebElement inventoryTransactionsMenu;



	@FindBy(xpath="//li[@class='treeview']//a[@id='139']//span[contains(text(),'Purchases')]")
	public static WebElement inventoryTransactionsPurchasesMenu;


	public boolean checkPurchaseProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		Thread.sleep(2000);
		createProfileProfileNameCombo.clear();
		Thread.sleep(2000);

		createProfileProfileNameCombo.sendKeys(Keys.END);
		Thread.sleep(2000);

		createProfileProfileNameCombo.sendKeys(Keys.SHIFT,Keys.HOME);
		Thread.sleep(2000);

		createProfileProfileNameCombo.sendKeys("Purchase Profile");
		Thread.sleep(2000);
		createProfileProfileNameCombo.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homemnu));
		homemnu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanaceMenu));
		finanaceMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
		inventoryTransactionsPurchasesMenu.click();

		Thread.sleep(2000);

		if (RequestforQuoteOption.isDisplayed() && purchasesQuotationsOption.isDisplayed() && purchaseOrderOption.isDisplayed()
				&& materialReceiptNotesOPtion.isDisplayed()) 
		{
			System.out.println(" Pass: Displayed the Purchase Profile in Inventory ");
			excelReader.setCellData(xlfile, xlSheetName, 76, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Not  Displayed the Purchase Profile in Inventory ");
			excelReader.setCellData(xlfile, xlSheetName, 76, 9, resFail);
			return false;
		}


	}




	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Issues to Production')]")
	public static WebElement issuetoProductionOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Job Order')]")
	public static WebElement jobOrderOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Receipts from Production')]")
	public static WebElement receiptsfromProductionOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Planned Independent Requirement')]")
	public static WebElement plannedIndependentRequirementOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Production Process')]")
	public static WebElement productionProcessOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Pending production order')]")
	public static WebElement pendingproductionorderOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Job Work Issues')]")
	public static WebElement jobWorkIssuesOption;


	@FindBy(xpath="//li[@class='treeview']//a[@id='3002']//span[contains(text(),'Production Orders')]")
	public static WebElement productionOrdersOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Job Work Receipts')]")
	public static WebElement jobWorkReceiptsOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Returns from Shop Floor')]")
	public static WebElement returnsfromShopFloorOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Refresh Rates')]")
	public static WebElement refreshRatesOption;

	@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
	public static WebElement ProductionTransaactionIssueToProductionHideChkbox;

	@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
	public static WebElement ProductionTransaactionIssueToProductionAlwaysSuspenedOnSavingChkbox;

	@FindBy(xpath="//li[31]//div[1]//label[1]//input[1]")
	public static WebElement ProductionTransaactionJobOrderHideChkbox;

	@FindBy(xpath="//li[17]//div[1]//label[1]//input[1]")
	public static WebElement ProductionTransaactionJobToOrderAlwaysSuspenedOnSavingChkbox;

	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement holdAndUnHoldacessChkBox;

	@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
	public static WebElement hideChkBox;

	@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
	public static WebElement alwaysSuspendedSavingChkBox;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Sales Quotations')]")
	public static WebElement salesQuotationsOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Delivery Notes')]")
	public static WebElement DeliveryNotesOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'POS Sales')]")
	public static WebElement posSalesOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='2045']//span[contains(text(),'Production Orders')]")
	public static WebElement productionOrdeOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='2017']//span[contains(text(),'Sales Orders')]")
	public static WebElement salesOrdersOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Auto Sales Order')]")
	public static WebElement autoSalesOrdersOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Shortages in Stock')]")
	public static WebElement shortageinStocksOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Excesses in Stocks')]")
	public static WebElement excessinStocksOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Transfers')]")
	public static WebElement stocksTransfersOption;

	@FindBy(xpath="//li[@class='treeview']//a[@id='2037']//span[contains(text(),'Opening Stocks')]")
	public static WebElement openingStocksOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Material Requisition')]")
	public static WebElement materialRequisitionOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock adjustment')]")
	public static WebElement stockAdjustmentOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Opening Stocks New')]")
	public static WebElement openingStocksNewOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Transfer New')]")
	public static WebElement stocksTransferNewOption;


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Hold/Unhold Stock')]")
	public static WebElement holdandUnholdStockTransfer;


	@FindBy(xpath="//a[@id='140']//i[@class='icon icon-expand']")
	public static WebElement inventoryTransactionSalesExpansionBtn;

	@FindBy(xpath="//a[@id='2033']//i[@class='icon-expand']")
	public static WebElement inventoryTransactionStocksExpansionBtn;



	//Request For Quote Hide option is enabled
	//Purchase Quotation Always Suspend on saving option is enabled
	//Purchase Order Select All
	//Material Receipt Notes Select All

	public boolean checkSavePurchaseProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RequestforQuoteOption));
		RequestforQuoteOption.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(hideChkBox));
		hideChkBox.click();
		Thread.sleep(2000);

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alwaysSuspendedSavingChkBox));
	alwaysSuspendedSavingChkBox.click();
	Thread.sleep(2000);*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesQuotationsOption));
		purchasesQuotationsOption.click();
		Thread.sleep(2000);

		/*	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(hideChkBox));
	hideChkBox.click();
	Thread.sleep(2000);*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alwaysSuspendedSavingChkBox));
		alwaysSuspendedSavingChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseOrderOption));
		purchaseOrderOption.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialReceiptNotesOPtion));
		materialReceiptNotesOPtion.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
			excelReader.setCellData(xlfile, xlSheetName, 77, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
			excelReader.setCellData(xlfile, xlSheetName, 77, 9, resFail);
			return false;
		}
	}




	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement accessChkBox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement addChkBox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement editChkBox;

	@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
	public static WebElement deleteChkBox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement printChkBox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement reprintChkBox;

	@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
	public static WebElement printBarCodeChkBox;

	@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
	public static WebElement printUnAuthoDocumentsChkBox;

	@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
	public static WebElement exportChkBox;

	@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
	public static WebElement editDocEnteredByOthersChkBox;

	@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
	public static WebElement editDocThatareCheckedChkBox;

	@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
	public static WebElement editReconciledDocsChkBox;

	@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
	public static WebElement editDocAuthByHigherUpsChkBox;

	@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
	public static WebElement enterDocThatExceedLimitChkBox;

	@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
	public static WebElement enterDocThatMakeCashORBankBalanceNegativeChkBox;

	@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
	public static WebElement editDocsThatAreRePrintedChkBox;

	@FindBy(xpath="//li[17]//div[1]//label[1]//input[1]")
	public static WebElement accessThroughAPIChkBox;

	@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
	public static WebElement alwaysSuspendOnSavingChkBox;

	@FindBy(xpath="//li[19]//div[1]//label[1]//input[1]")
	public static WebElement changePrintLayoutChkBox;

	@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
	public static WebElement authorizeChkBox;

	@FindBy(xpath="//li[21]//div[1]//label[1]//input[1]")
	public static WebElement rejectChkBox;

	@FindBy(xpath="//li[22]//div[1]//label[1]//input[1]")
	public static WebElement showhomePageChkBox;

	@FindBy(xpath="//li[23]//div[1]//label[1]//input[1]")
	public static WebElement stopChkBox;

	@FindBy(xpath="//li[24]//div[1]//label[1]//input[1]")
	public static WebElement modifySettingsChkBox;

	@FindBy(xpath="//li[25]//div[1]//label[1]//input[1]")
	public static WebElement viewDocEnteredByOthersChkBox;

	@FindBy(xpath="//li[26]//div[1]//label[1]//input[1]")
	public static WebElement closeLinksChkBox;

	@FindBy(xpath="//li[27]//div[1]//label[1]//input[1]")
	public static WebElement saveRevisionChkBox;

	@FindBy(xpath="//li[28]//div[1]//label[1]//input[1]")
	public static WebElement showPostingDetailsChkBox;

	@FindBy(xpath="//li[29]//div[1]//label[1]//input[1]")
	public static WebElement suspendChkBox;

	@FindBy(xpath="//li[30]//div[1]//label[1]//input[1]")
	public static WebElement editExportedDocsChkBox;

	@FindBy(xpath="//li[31]//div[1]//label[1]//input[1]")
	public static WebElement editImportedDocsChkBox;

	@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
	public static WebElement hideMenuChkBox;

	@FindBy(xpath="//li[33]//div[1]//label[1]//input[1]")
	public static WebElement amendChkBox;

	@FindBy(xpath="//li[34]//div[1]//label[1]//input[1]")
	public static WebElement customizeLinkChkBox;

	@FindBy(xpath="//li[35]//div[1]//label[1]//input[1]")
	public static WebElement filterHomePageChkBox;

	@FindBy(xpath="//li[36]//div[1]//label[1]//input[1]")
	public static WebElement addToStockChkBox;

	@FindBy(xpath="//li[37]//div[1]//label[1]//input[1]")
	public static WebElement reverseEntryChkBox;

	@FindBy(xpath="//li[38]//div[1]//label[1]//input[1]")
	public static WebElement customizeInfoPanelChkBox;

	@FindBy(xpath="//li[39]//div[1]//label[1]//input[1]")
	public static WebElement raiseChequeReturnChkBox;


	public boolean checkRestrictionsInSalesOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalesOrderProfile");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accessChkBox));
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
			excelReader.setCellData(xlfile, xlSheetName, 78, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Displyed All the Elements in the Master Account Option");
			excelReader.setCellData(xlfile, xlSheetName, 78, 9, resFail);
			return false;
		}
	}

	public boolean checkSaveSalesOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass:  Allow to select Add option  in Sales Order ");
			excelReader.setCellData(xlfile, xlSheetName, 79, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Allow to select Add option  in Sales Order");
			excelReader.setCellData(xlfile, xlSheetName, 79, 9, resFail);
			return false;
		}
	}






	public boolean checkAcessRestrictionOptionInSalesOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SaleAccessProfile");



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(faAccessChkbox));
		faAccessChkbox.click();
		if (faAccessChkbox.isSelected()) 
		{
			System.out.println(" Pass: Access ChkBox IS Checked ");	
			excelReader.setCellData(xlfile, xlSheetName, 80, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Access ChkBox IS Checked ");	
			excelReader.setCellData(xlfile, xlSheetName, 80, 9, resFail);
			return false;
		}

	}

	public boolean checkSaveAccessRestrictionInSalesOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			System.out.println("  Pass:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
			excelReader.setCellData(xlfile, xlSheetName, 81, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
			excelReader.setCellData(xlfile, xlSheetName, 81, 9, resFail);
			return false;
		}

	}	


	public boolean checkAddRestrictionOptioninSaleAddProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SaleAddProfile");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addChkBox));
		addChkBox.click();

		Thread.sleep(2000);
		if (addChkBox.isSelected())
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Add option   in Screen in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 82, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Add option Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 82, 9, resFail);
				return false;
			}


		}
		else 
		{
			System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Add option");	
			excelReader.setCellData(xlfile, xlSheetName, 82, 9, resFail);
			return false;
		}


	}


	public boolean checkEditRestrictionOptioninSaleOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SaleEditProfile");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editChkBox));
		editChkBox.click();

		Thread.sleep(2000);

		if (editChkBox.isSelected())
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Edit option in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 83, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Edit option Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 83, 9, resFail);
				return false;
			}

		}
		else 
		{
			System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Edit option");	
			excelReader.setCellData(xlfile, xlSheetName, 83, 9, resFail);
			return false;
		}


	}







	public boolean checkDeleteRestrictionOptioninSaleOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SaleDeleteProfile");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteChkBox));
		deleteChkBox.click();

		Thread.sleep(2000);

		if (deleteChkBox.isSelected())
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Delete option in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 84, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Delete option Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 84, 9, resFail);
				return false;
			}
		}
		else 
		{
			System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Edit option");	
			excelReader.setCellData(xlfile, xlSheetName, 84, 9, resFail);
			return false;
		}


	}






	public boolean checkSelecttheSalesOrdervoucherfromthemenuandclickonPrintChkBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalePrintProfile");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printChkBox));
		printChkBox.click();

		Thread.sleep(2000);

		if (printChkBox.isSelected())
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Print option in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 85, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Print option Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 85, 9, resFail);
				return false;
			}
		}
		else 
		{
			System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Edit option");	
			excelReader.setCellData(xlfile, xlSheetName, 85, 9, resFail);
			return false;
		}


	}



	public boolean checkRePrintRestrictionOptioninSaleOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SaleRePrintProfile");



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reprintChkBox));
		reprintChkBox.click();

		Thread.sleep(2000);

		if (reprintChkBox.isSelected())
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Re-Print option in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 86, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Re-Print option Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 86, 9, resFail);
				return false;
			}

		}
		else 
		{
			System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Edit option");	
			excelReader.setCellData(xlfile, xlSheetName, 86, 9, resFail);
			return false;
		}


	}


	public boolean checkUnAuthorizeRestrictionOptioninSaleOrderProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalesPrintUnAuthorizeProfile");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printUnAuthoDocumentsChkBox));
		printUnAuthoDocumentsChkBox.click();

		Thread.sleep(2000);

		if (printUnAuthoDocumentsChkBox.isSelected())
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Re-Print option in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 87, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Re-Print option Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 87, 9, resFail);
				return false;
			}

		}
		else 
		{
			System.out.println(" Fail: Allow to Select the Sales Order voucher from the menu and click on Edit option");	
			excelReader.setCellData(xlfile, xlSheetName, 87, 9, resFail);
			return false;
		}


	}











	public boolean checkEditDocumentsByOtherEditDocumentsAreCheckedEditReconciledDocumentsEditDocumentsAuthorizationByHigherUps() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalesEditMiscProfile");




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editDocEnteredByOthersChkBox));
		editDocEnteredByOthersChkBox.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editDocThatareCheckedChkBox));
		editDocThatareCheckedChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editReconciledDocsChkBox));
		editReconciledDocsChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editDocAuthByHigherUpsChkBox));
		editDocAuthByHigherUpsChkBox.click();


		Thread.sleep(2000);

		if (editDocEnteredByOthersChkBox.isSelected() && editDocThatareCheckedChkBox.isSelected() && editReconciledDocsChkBox.isSelected()
				&& editDocAuthByHigherUpsChkBox.isSelected())
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Edit Document options in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 88, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Edit Documents options Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 88, 9, resFail);
				return false;
			}
		}
		else 
		{
			System.out.println(" Fail: Allow to Select the  Edit Document options");	
			excelReader.setCellData(xlfile, xlSheetName, 88, 9, resFail);
			return false;
		}


	}





	public boolean checkAccessThroughAPI() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalesAccessAPIProfile");



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accessThroughAPIChkBox));
		accessThroughAPIChkBox.click();




		Thread.sleep(2000);

		if (accessThroughAPIChkBox.isSelected() )
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Access Through API ChkBox options in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 89, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Access Through API ChkBox options Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 89, 9, resFail);
				return false;
			}

		}
		else 
		{
			System.out.println(" Fail: Allow to Select the  Edit Document options");	
			excelReader.setCellData(xlfile, xlSheetName, 89, 9, resFail);
			return false;
		}


	}



	public boolean checkAlwaysSuspendingOnSavingoption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalesAlwaysSuspendingProfile");



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alwaysSuspendOnSavingChkBox));
		alwaysSuspendOnSavingChkBox.click();


		Thread.sleep(2000);

		if (alwaysSuspendOnSavingChkBox.isSelected() )
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Always Suspend On Saving in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 90, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   Allow to select Always Suspend On Saving in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 90, 9, resFail);
				return false;
			}

		}
		else 
		{
			System.out.println(" Fail: Allow to Select the  Edit Document options");	
			excelReader.setCellData(xlfile, xlSheetName, 90, 9, resFail);
			return false;
		}


	}


	public boolean checkSalesChangePrintLayoutProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalesChangePrintLayoutProfile");



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(changePrintLayoutChkBox));
		changePrintLayoutChkBox.click();


		Thread.sleep(2000);

		if (changePrintLayoutChkBox.isSelected() )
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Change Print Layout ChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 91, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Change Print Layout ChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 91, 9, resFail);
				return false;
			}
		}
		else 
		{
			System.out.println(" Fail: Allow to Select the  Edit Document options");	
			excelReader.setCellData(xlfile, xlSheetName, 91, 9, resFail);
			return false;
		}


	}


	public boolean checkAuthorizeAndRejectProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalesAuthorizeProfile");




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeChkBox));
		authorizeChkBox.click();


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rejectChkBox));
		rejectChkBox.click();

		Thread.sleep(2000);

		if (authorizeChkBox.isSelected() && rejectChkBox.isSelected() )
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select Authorize ChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 92, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select Authorize ChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 92, 9, resFail);
				return false;
			}
		}
		else 
		{
			System.out.println(" Fail: Allow to Select the  Edit Document options");	
			excelReader.setCellData(xlfile, xlSheetName, 92, 9, resFail);
			return false;
		}


	}



	public boolean checkHomePageOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalesHomePageProfile");




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(showhomePageChkBox));
		showhomePageChkBox.click();


		Thread.sleep(2000);

		if (showhomePageChkBox.isSelected() )
		{

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select showhomePageChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 93, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select showhomePageChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 93, 9, resFail);
				return false;
			}
		}
		else 
		{
			System.out.println(" Fail: Allow to Select the  Edit Document options");	
			excelReader.setCellData(xlfile, xlSheetName, 93, 9, resFail);
			return false;
		}


	}


	public boolean checkStopPageOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalesStopProfile");



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stopChkBox));
		stopChkBox.click();


		Thread.sleep(2000);

		if (stopChkBox.isSelected() )
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select stopChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 94, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select stopChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 94, 9, resFail);
				return false;
			}
		}
		else 
		{
			System.out.println(" Fail: Allow to Select the  Edit Document options");
			excelReader.setCellData(xlfile, xlSheetName, 94, 9, resFail);
			return false;
		}


	}




	public boolean checkViewDocumentsEnterByOtherCloseLinksSaveRevisionSuspendAndModifySettingsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
		createProfileMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SalesViewDocumentsEnterByOther");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
		inventoryTransactionSalesExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersOption));
		salesOrdersOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewDocEnteredByOthersChkBox));
		viewDocEnteredByOthersChkBox.click();


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeLinksChkBox));
		closeLinksChkBox.click();


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveRevisionChkBox));
		saveRevisionChkBox.click();


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendChkBox));
		suspendChkBox.click();


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(modifySettingsChkBox));
		modifySettingsChkBox.click();

		Thread.sleep(2000);

		if (viewDocEnteredByOthersChkBox.isSelected() && closeLinksChkBox.isSelected() && saveRevisionChkBox.isSelected() && suspendChkBox.isSelected() && modifySettingsChkBox.isSelected()  )
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 95, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 95, 9, resFail);
				return false;
			}
		}
		else 
		{
			System.out.println(" Fail: Allow to Select the  Edit Document options");	
			excelReader.setCellData(xlfile, xlSheetName, 95, 9, resFail);
			return false;
		}


	}








	@FindBy(xpath="//li[@class='treeview']//a[@id='500']//span[contains(text(),'Ledger')]")
	public static WebElement ledgerOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Ledger detail')]")
	public static WebElement ledgerDetailOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Sub Ledger')]")
	public static WebElement subLedgerDetailOption;

	@FindBy(xpath="//a[@id='82']//i[@class='icon icon-expand']")
	public static WebElement cashAndBankBooksExpandBtn;

	@FindBy(xpath="//a[@id='502']//i[@class='icon icon-expand']")
	public static WebElement salesdReportsExpandBtn;

	@FindBy(xpath="//a[@id='506']//i[@class='icon icon-expand']")
	public static WebElement purchaseReportsExpandBtn;

	@FindBy(xpath="//a[@id='514']//i[@class='icon icon-expand']")
	public static WebElement registersExpandBtn;

	@FindBy(xpath="//a[@id='523']//i[@class='icon icon-expand']")
	public static WebElement salesAndPurchaseExpandBtn;

	@FindBy(xpath="//a[@id='568']//i[@class='icon icon-expand']")
	public static WebElement miscellaneousAnalysisExpandBtn;

	@FindBy(xpath="//a[@id='536']//i[@class='icon icon-expand']")
	public static WebElement masterInformationExpandBtn;

	@FindBy(xpath="//a[@id='520']//i[@class='icon icon-expand']")
	public static WebElement auidtTrailExpandBtn;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Account Query')]")
	public static WebElement accountQueryOption;

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Transaction authorization report')]")
	public static WebElement transactionAuthorizationReportOption;






	public boolean checkFAReportsAllOptionsProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
		createProfileMenu.click();

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("FAReportsAllOptions");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
		createProfileFinancalsExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finincalsReportsExpandBtn));
		finincalsReportsExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledgerOption));

		if (ledgerOption.isDisplayed() && ledgerDetailOption.isDisplayed() && subLedgerDetailOption.isDisplayed()
				&& cashAndBankBooksExpandBtn.isDisplayed() && salesdReportsExpandBtn.isDisplayed() && purchaseReportsExpandBtn.isDisplayed()
				&& registersExpandBtn.isDisplayed() && salesAndPurchaseExpandBtn.isDisplayed() && miscellaneousAnalysisExpandBtn.isDisplayed()
				&& masterInformationExpandBtn.isDisplayed() && auidtTrailExpandBtn.isDisplayed() && accountQueryOption.isDisplayed()
				&& transactionAuthorizationReportOption.isDisplayed()) 
		{
			System.out.println(" Pass:  Reports Sub Menu Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 96, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail:  Reports Sub Menu Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 96, 9, resFail);
			return false;
		}


	}


	public boolean checkReportsSelectAllOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			System.out.println("  Pass:  FAReportsAllOptions profile saves Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 97, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:   FAReportsAllOptions profile saves Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 97, 9, resFail);
			return false;
		}
	}





	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement ledgerAcessChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement ledgerSearchChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement ledgerPrintChkbox;

	@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
	public static WebElement ledgerViewChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement ledgerExportChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement ledgerEmailReportChkbox;

	@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
	public static WebElement ledgerEditPrintLayoutChkbox;

	@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
	public static WebElement ledgerViewCustomizedLayoutChkbox;

	@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
	public static WebElement ledgerAddCustomizedLayoutChkbox;

	@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
	public static WebElement ledgerBackTrackChkbox;

	@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
	public static WebElement ledgerEmailChkbox;

	@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
	public static WebElement ledgerVeiwGraphChkbox;

	@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
	public static WebElement ledgerFilterChkbox;

	@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
	public static WebElement ledgerAnalyzeChkbox;

	@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
	public static WebElement ledgerCrossReferenceChkbox;

	@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
	public static WebElement ledgerAddAnalyzeReportChkbox;








	public boolean checkLedgerProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("LedgerProfile");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
		createProfileFinancalsExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finincalsReportsExpandBtn));
		finincalsReportsExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledgerOption));
		ledgerOption.click();

		if (ledgerAcessChkbox.isDisplayed() && ledgerSearchChkbox.isDisplayed() && ledgerPrintChkbox.isDisplayed()
				&& ledgerViewChkbox.isDisplayed() && ledgerExportChkbox.isDisplayed() && ledgerEmailReportChkbox.isDisplayed()
				&& ledgerEditPrintLayoutChkbox.isDisplayed() && ledgerViewCustomizedLayoutChkbox.isDisplayed() && ledgerAddCustomizedLayoutChkbox.isDisplayed()
				&& ledgerBackTrackChkbox.isDisplayed() && ledgerEmailChkbox.isDisplayed() && ledgerVeiwGraphChkbox.isDisplayed()
				&& ledgerFilterChkbox.isDisplayed() && ledgerAnalyzeChkbox.isDisplayed() && ledgerCrossReferenceChkbox.isDisplayed() 
				&& ledgerAddAnalyzeReportChkbox.isDisplayed()) 
		{
			System.out.println(" Pass: Ledger Sun Menu Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 98, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Ledger Sun Menu Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 98, 9, resFail);
			return false;
		}


	}




	public boolean checkLedgerSelectAllOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			System.out.println("  Pass:  LedgerProfile profile saves Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 99, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:   LedgerProfile profile saves Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 99, 9, resFail);
			return false;
		}
	}




	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerAcessOption;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerEmailReportOption;

	@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerEditPrintLayoutOption;

	@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerViewCustomizedLayoutOption;

	@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerAddCustomizedLayoutOption;

	@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerBackTrackOption;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerSearchOption;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerPrintOption;

	@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerViewOption;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerExportOption;

	@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerEmailOption;

	@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerViewGraphOption;

	@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerFilterOption;

	@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerAnalyzeOption;

	@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerCrossReferenceOption;

	@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
	public static WebElement stockLedgerAddAnalyzeReportOption;



	@FindBy(xpath="//li[@class='active']//a[@id='200']//i[@class='icon-expand']")
	public static WebElement addInvReportsExpandBtn;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Ledger')]")
	public static WebElement addInvReportsStockLedgerOption;


	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Item Query')]")
	public static WebElement invReportsItemQuery;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Ledger')]")
	public static WebElement invReportsStockLedger;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Opening Stocks Register')]")
	public static WebElement invReportsOpeningStocksRegister;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Statement')]")
	public static WebElement invReportsStockStatement;

	@FindBy(xpath="//li[@class='active']//a[@id='575']//span[contains(text(),'Stock Movement')]")
	public static WebElement invReportsStockMovement;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Multi Level Stock Movement')]")
	public static WebElement invReportsMultiLevelStockMovement;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Virtual Stock Analysis')]")
	public static WebElement invReportsVirtualStockAnalysis;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Valuation')]")
	public static WebElement invReportsStockValuation;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock report by Tag')]")
	public static WebElement invReportsStockReportByTag;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'ABC Analysis')]")
	public static WebElement invReportsABCAnalysis;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Analysis by Batch')]")
	public static WebElement invReportsStockAnalysisByBatch;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock Analysis by RMA')]")
	public static WebElement invReportsStockAnalysisByRMA;

	@FindBy(xpath="//li[@class='active']//a[@id='540']//i[@class='icon-expand']")
	public static WebElement invReportsBinExpandBtn;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock balance by warehouse')]")
	public static WebElement invReportsStockBalanceByWarehouse;

	@FindBy(xpath="//li[@class='active']//a[@id='621']//i[@class='icon-expand']")
	public static WebElement invReportsStockAgeingAnalysisExpandBtn;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Reorder Report')]")
	public static WebElement invReportsReorderReport;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Fast Moving Item')]")
	public static WebElement invReportsFastMovingItem;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Slow Moving Item')]")
	public static WebElement invReportsSlowMovingItem;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Peak/Low Balances')]")
	public static WebElement invReportsPeakOrLowBalances;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Best Selling Item')]")
	public static WebElement invReportsBestSellingItem;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Raise Indent Item with Low Stock')]")
	public static WebElement invReportsRaiseIndentItemWithLowStock;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock transfer report')]")
	public static WebElement invReportsStockTransferReport;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Raise request for quote')]")
	public static WebElement invReportsRaiseRequestForQuote;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Stock reservation report')]")
	public static WebElement invReportsStockReservationReport;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Transaction type-wise stock report')]")
	public static WebElement invReportsTransactionTypewiseStockReport;

	@FindBy(xpath="//li[@class='active']//a[@id='550']//i[@class='icon-expand']")
	public static WebElement invReportsOrderManagementExpandBtn;









	public boolean checkStockLedgerProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("StockLedgerProfile");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
		createProfileFinancalsExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finincalsReportsExpandBtn));
		finincalsReportsExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledgerOption));
		ledgerOption.click();

		if (stockLedgerAcessOption.isDisplayed() && stockLedgerSearchOption.isDisplayed() && stockLedgerPrintOption.isDisplayed()
				&& stockLedgerViewOption.isDisplayed() && stockLedgerExportOption.isDisplayed() && stockLedgerEmailReportOption.isDisplayed()
				&& stockLedgerEditPrintLayoutOption.isDisplayed() && stockLedgerViewCustomizedLayoutOption.isDisplayed() && stockLedgerAddCustomizedLayoutOption.isDisplayed()
				&& stockLedgerBackTrackOption.isDisplayed() && stockLedgerEmailOption.isDisplayed() && stockLedgerViewGraphOption.isDisplayed()
				&& stockLedgerFilterOption.isDisplayed() && stockLedgerAnalyzeOption.isDisplayed() && stockLedgerCrossReferenceOption.isDisplayed() 
				&& stockLedgerAddAnalyzeReportOption.isDisplayed()) 
		{
			System.out.println(" Pass: Ledger Sun Menu Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 100, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Ledger Sun Menu Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 100, 9, resFail);
			return false;
		}


	}


	public boolean checkStockLedgerSelectAllOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			System.out.println("  Pass: Stock LedgerProfile profile saves Successfully");

			excelReader.setCellData(xlfile, xlSheetName, 101, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Stock  LedgerProfile profile saves Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 101, 9, resFail);
			return false;
		}
	}


	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Stock Ledger')]")
	public static WebElement stockLedgerOption;

	public boolean checkSLAccessProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SLAcessProfile");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryreportsExpandBtn));
		inventoryreportsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerOption));
		stockLedgerOption.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accessChkBox));
		accessChkBox.click();

		Thread.sleep(2000);
		if (accessChkBox.isSelected()) 
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  SLAcessProfile profile saves Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 102, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   SLAcessProfile profile saves Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 102, 9, resFail);
				return false;
			}
		}
		else 
		{
			System.out.println(" Fail : Access ChkBox iS Checked ");
			excelReader.setCellData(xlfile, xlSheetName, 102, 9, resFail);
			return false;
		}
	}



	public boolean checkSLSearchProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));

		createProfileProfileNameCombo.sendKeys("SLSearchProfile");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryreportsExpandBtn));
		inventoryreportsExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerOption));
		stockLedgerOption.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerSearchOption));
		stockLedgerSearchOption.click();

		Thread.sleep(2000);
		if (stockLedgerSearchOption.isSelected()) 
		{Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			System.out.println("  Pass:  SLSProfile profile saves Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 103, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:   SLSearchProfile profile saves Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 103, 9, resFail);
			return false;
		}
		}
		else 
		{
			System.out.println(" Fail : Search ChkBox iS Checked ");
			excelReader.setCellData(xlfile, xlSheetName, 103, 9, resFail);
			return false;
		}

	}









	public boolean checkSLPrintViewExportFilterProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));

		createProfileProfileNameCombo.sendKeys("SLPrintProfile");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryreportsExpandBtn));
		inventoryreportsExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerOption));
		stockLedgerOption.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerPrintOption));
		stockLedgerPrintOption.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerViewOption));
		stockLedgerViewOption.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerExportOption));
		stockLedgerExportOption.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockLedgerFilterOption));
		stockLedgerFilterOption.click();


		if (stockLedgerPrintOption.isSelected()) 
		{
			Thread.sleep(4000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  SLPrintProfile profile saves Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 104, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   SLPrintProfile profile saves Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 104, 9, resFail);
				return false;
			}
		}
		else 
		{
			System.out.println(" Fail : Print ChkBox iS Checked ");
			excelReader.setCellData(xlfile, xlSheetName, 104, 9, resFail);
			return false;
		}

	}






	public boolean checkAllMastersProfileOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
		createProfileMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("AllMasterProfile");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
		homeMastersExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			System.out.println("  Pass:  SLAddAnalyzeReportProfile saved Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 105, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:   SLAddAnalyzeReportProfile profile saved Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 105, 9, resFail);
			return false;
		}

	}




	public boolean checkRestrictionOptionsProductProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("AllProductProfile");

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
		homeMastersExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
		itemExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemOption));
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
			excelReader.setCellData(xlfile, xlSheetName, 106, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail : Displayed All the Fileds in AllProductProfile  ");
			excelReader.setCellData(xlfile, xlSheetName, 106, 9, resFail);
			return false;
		}

	}


	public boolean checkSelectAllOptionsProduct() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass:  AllProductProfile saved Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 107, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:   AllProductProfile profile saved Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 107, 9, resFail);
			return false;
		}

	}




	@FindBy(xpath="//li[@class='active']//a[@id='221']//i[@class='icon-expand']")
	public static WebElement addHomeMasterItemExpandBtn;


	@FindBy(xpath="//*[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[3]/ul//li")
	public static List<WebElement> masterItemOptionsList;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[3]/ul/li[1]/a/span")
	public static WebElement masterItemItemOption;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[3]/ul/li[2]/a/span")
	public static WebElement masterItemUnitsOption;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[3]/ul/li[3]/a/span")
	public static WebElement masterItemUnitConversionOption;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[3]/ul/li[4]/a/span")
	public static WebElement masterItemSellerPriceBookOption;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[3]/ul/li[5]/a/span")
	public static WebElement masterItemBuyerPriceBookOption;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[3]/ul/li[6]/a/span")
	public static WebElement masterItemBarcodeDefinitionOption;







	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Item')]")
	public static WebElement addHomeMAsterItemoption;


	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement addMasterItemAddChkbox;	

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement addMasterItemEditChkbox;	

	@FindBy(xpath="//label[contains(text(),'Copy')]//input[@id='1105']")
	public static WebElement addMasterItemCopyChkbox;

	@FindBy(xpath="//label[contains(text(),'Search')]//input[@id='1105']")
	public static WebElement addMasterItemSearchChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement addMasterItemDeleteChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement addMasterItemPrintChkbox;

	@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
	public static WebElement addMasterItemExportChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize View')]//input[@id='1105']")
	public static WebElement addMasterItemCustomizeViewChkbox;

	@FindBy(xpath="//label[contains(text(),'Sort')]//input[@id='1105']")
	public static WebElement addMasterItemSortChkbox;

	@FindBy(xpath="//label[contains(text(),'Mass Update')]//input[@id='1105']")
	public static WebElement addMasterItemMassUpdateChkbox;

	@FindBy(xpath="//label[contains(text(),'Authorize')]//input[@id='1105']")
	public static WebElement addMasterItemAuthorizeChkbox;

	@FindBy(xpath="//label[contains(text(),'Transfer')]//input[@id='1105']")
	public static WebElement addMasterItemTransferChkbox;

	@FindBy(xpath="//label[contains(text(),'Properties')]//input[@id='1105']")
	public static WebElement addMasterItemPropertiesChkbox;

	@FindBy(xpath="//label[contains(text(),'Ledger')]//input[@id='1105']")
	public static WebElement addMasterItemLedgerChkbox;

	@FindBy(xpath="//label[contains(text(),'Back Track')]//input[@id='1105']")
	public static WebElement addMasterItemBackTrackChkbox;

	@FindBy(xpath="//label[contains(text(),'Budgets')]//input[@id='1105']")
	public static WebElement addMasterItemBudgetsChkbox;

	@FindBy(xpath="//label[contains(text(),'Help')]//input[@id='1105']")
	public static WebElement addMasterItemHelpChkbox;

	@FindBy(xpath="//label[contains(text(),'Create Tree')]//input[@id='1105']")
	public static WebElement addMasterItemCreateTreeChkbox;

	@FindBy(xpath="//label[contains(text(),'DeleteTree')]//input[@id='1105']")
	public static WebElement addMasterItemDeleteTreeChkbox;

	@FindBy(xpath="//label[contains(text(),'CreateView')]//input[@id='1105']")
	public static WebElement addMasterItemCreateViewChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit View')]//input[@id='1105']")
	public static WebElement addMasterItemEditViewChkbox;

	@FindBy(xpath="//label[contains(text(),'Delete View')]//input[@id='1105']")
	public static WebElement addMasterItemDeleteViewChkbox;

	@FindBy(xpath="//label[contains(text(),'Select View')]//input[@id='1105']")
	public static WebElement addMasterItemSelectViewChkbox;

	@FindBy(xpath="//label[contains(text(),'Select Tree')]//input[@id='1105']")
	public static WebElement addMasterItemSelectTreeChkbox;

	@FindBy(xpath="//label[contains(text(),'Clone')]//input[@id='1105']")
	public static WebElement addMasterItemCloneChkbox;

	@FindBy(xpath="//label[contains(text(),'Add Group')]//input[@id='1105']")
	public static WebElement addMasterItemAddGroupChkbox;

	@FindBy(xpath="//label[contains(text(),'Group Master')]//input[@id='1105']")
	public static WebElement addMasterItemGroupMasterChkbox;

	@FindBy(xpath="//label[contains(text(),'Set Type')]//input[@id='1105']")
	public static WebElement addMasterItemSettypeChkbox;

	@FindBy(xpath="//label[contains(text(),'Delete All')]//input[@id='1105']")
	public static WebElement addMasterItemDeleteAllChkbox;

	@FindBy(xpath="//label[contains(text(),'Move Up')]//input[@id='1105']")
	public static WebElement addMasterItemMoveupChkbox;

	@FindBy(xpath="//label[contains(text(),'Move Down')]//input[@id='1105']")
	public static WebElement addMasterItemMOveDownChkbox;

	@FindBy(xpath="//label[contains(text(),'Credit Management')]//input[@id='1105']")
	public static WebElement addMasterItemCreditMangementChkbox;

	@FindBy(xpath="//label[contains(text(),'Department Appropriation')]//input[@id='1105']")
	public static WebElement addMasterItemdepartmentApproriationChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize Tree')]//input[@id='1105']")
	public static WebElement addMasterItemCustomizeTreeChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize Master')]//input[@id='1105']")
	public static WebElement addMasterItemCustomizeMasterChkbox;

	@FindBy(xpath="//label[contains(text(),'Can Change Group')]//input[@id='1105']")
	public static WebElement addMasterItemCanChangeGroupChkbox;

	@FindBy(xpath="//label[contains(text(),'Can Navigate')]//input[@id='1105']")
	public static WebElement addMasterItemCanNAvigateChkbox;

	@FindBy(xpath="//label[contains(text(),'Add Info Panel')]//input[@id='1105']")
	public static WebElement addMasterItemAddInfoPannelChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit Info Panel')]//input[@id='1105']")
	public static WebElement addMasterItemEditInfoPannelChkbox;

	@FindBy(xpath="//label[contains(text(),'View Info Panel')]//input[@id='1105']")
	public static WebElement addMasterItemViewInfoPannelChkbox;

	@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='1105']")
	public static WebElement addMasterItemRejectChkbox;

	@FindBy(xpath="//li[42]//div[1]//label[1]//input[1]")
	public static WebElement addMasterItemImportChkbox;

	@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='1105']")
	public static WebElement addMasterItemShowHomePageChkbox;

	@FindBy(xpath="//label[contains(text(),'DeleteInfoPanel')]//input[@id='1105']")
	public static WebElement addMasterItemDeletInfoPannelChkbox;

	@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='1105']")
	public static WebElement addMasterItemStopChkbox;

	@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='1105']")
	public static WebElement addMasterItemSaveRevisionChkbox;

	@FindBy(xpath="//label[contains(text(),'SetDefaultTree')]//input[@id='1105']")
	public static WebElement addMasterItemSetDefaultTreeChkbox;

	@FindBy(xpath="//label[contains(text(),'Modifier')]//input[@id='1105']")
	public static WebElement addMasterItemModiferChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit Tree')]//input[@id='1105']")
	public static WebElement addMasterItemEditTreeChkbox;

	@FindBy(xpath="//label[contains(text(),'Authorization Info')]//input[@id='1105']")
	public static WebElement addMasterItemAutorizationInfoChkbox;

	@FindBy(xpath="//label[contains(text(),'Alternate')]//input[@id='1105']")
	public static WebElement addMasterItemAlternateChkbox;

	@FindBy(xpath="//label[contains(text(),'Related')]//input[@id='1105']")
	public static WebElement addMasterItemRelatedChkbox;

	@FindBy(xpath="//label[contains(text(),'Open Close')]//input[@id='1105']")
	public static WebElement addMasterItemOpenCloseChkbox;

	@FindBy(xpath="//label[contains(text(),'CloseProduct')]//input[@id='1105']")
	public static WebElement addMasterItemCLoseProductChkbox;

	@FindBy(xpath="//label[contains(text(),'Adv Master Import/Export')]//input[@id='1105']")
	public static WebElement addMasterItemAdvanceMasterImportAndExportChkbox;

	@FindBy(xpath="//label[contains(text(),'General')]//input[@id='1105']")
	public static WebElement addMasterItemGeneralChkbox;

	@FindBy(xpath="//label[contains(text(),'Setting')]//input[@id='1105']")
	public static WebElement addMasterItemSettingChkbox;

	@FindBy(xpath="//label[contains(text(),'Classification')]//input[@id='1105']")
	public static WebElement addMasterClassificationItemChkbox;

	@FindBy(xpath="//label[contains(text(),'Other Details')]//input[@id='1105']")
	public static WebElement addMasterItemOtherDetailsItemChkbox;

	@FindBy(xpath="//label[contains(text(),'Replenishment')]//input[@id='1105']")
	public static WebElement addMasterItemReplenishmentItemChkbox;

	@FindBy(xpath="//label[contains(text(),'Reorder')]//input[@id='1105']")
	public static WebElement addMasterItemReorderItemChkbox;

	@FindBy(xpath="//label[contains(text(),'Outlet')]//input[@id='1105']")
	public static WebElement addMasterItemOutletItemChkbox;

	@FindBy(xpath="//*[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[3]/i")
	public static WebElement itemExpandBtn;

	@FindBy(xpath="//*[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[3]/ul/li[1]")
	public static WebElement itemOption;

	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement itemAddChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement itemEditChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement itemCopyChkbox;

	@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
	public static WebElement itemSearchChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement itemDeleteChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement itemPrintChkbox;

	@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
	public static WebElement itemExportChkbox;

	@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
	public static WebElement itemCustomizeViewChkbox;

	@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
	public static WebElement itemSortChkbox;

	@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
	public static WebElement itemMassUpdateChkbox;

	@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
	public static WebElement itemAuthorizeChkbox;

	@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
	public static WebElement itemTransferChkbox;

	@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
	public static WebElement itemPropertiesChkbox;

	@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
	public static WebElement itemLedgerChkbox;

	@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
	public static WebElement itemBackTrackChkbox;

	@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
	public static WebElement itembudgetChkbox;

	@FindBy(xpath="//li[17]//div[1]//label[1]//input[1]")
	public static WebElement itemHelpChkbox;

	@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
	public static WebElement itemCreateTreeChkbox;

	@FindBy(xpath="//li[19]//div[1]//label[1]//input[1]")
	public static WebElement itemDeleteTreeChkbox;

	@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
	public static WebElement itemCreateViewChkbox;

	@FindBy(xpath="//li[21]//div[1]//label[1]//input[1]")
	public static WebElement itemEditViewChkbox;

	@FindBy(xpath="//li[22]//div[1]//label[1]//input[1]")
	public static WebElement itemDeleteViewChkbox;

	@FindBy(xpath="//li[23]//div[1]//label[1]//input[1]")
	public static WebElement itemSelectViewChkbox;

	@FindBy(xpath="//li[24]//div[1]//label[1]//input[1]")
	public static WebElement itemSelectTreeChkbox;

	@FindBy(xpath="//li[25]//div[1]//label[1]//input[1]")
	public static WebElement itemCloneChkbox;

	@FindBy(xpath="//li[26]//div[1]//label[1]//input[1]")
	public static WebElement itemAddGroupChkbox;

	@FindBy(xpath="//li[27]//div[1]//label[1]//input[1]")
	public static WebElement itemGroupMasterChkbox;

	@FindBy(xpath="//li[28]//div[1]//label[1]//input[1]")
	public static WebElement itemSetTypeChkbox;

	@FindBy(xpath="//li[29]//div[1]//label[1]//input[1]")
	public static WebElement itemDeleteAllChkbox;

	@FindBy(xpath="//li[30]//div[1]//label[1]//input[1]")
	public static WebElement itemMoveUpChkbox;

	@FindBy(xpath="//li[31]//div[1]//label[1]//input[1]")
	public static WebElement itemMoveDownChkbox;

	@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
	public static WebElement itemCreditManangementChkbox;

	@FindBy(xpath="//li[33]//div[1]//label[1]//input[1]")
	public static WebElement itemDepartmentAppropriationChkbox;

	@FindBy(xpath="//li[34]//div[1]//label[1]//input[1]")
	public static WebElement itemCustomizeTreeChkbox;

	@FindBy(xpath="//li[35]//div[1]//label[1]//input[1]")
	public static WebElement itemCustomizeMAsterChkbox;

	@FindBy(xpath="//li[36]//div[1]//label[1]//input[1]")
	public static WebElement itemCanchangeGroupChkbox;

	@FindBy(xpath="//li[37]//div[1]//label[1]//input[1]")
	public static WebElement itemCanNavigateChkbox;

	@FindBy(xpath="//li[38]//div[1]//label[1]//input[1]")
	public static WebElement itemAddInfoPannelChkbox;

	@FindBy(xpath="//li[39]//div[1]//label[1]//input[1]")
	public static WebElement itemEditInfoPannelChkbox;

	@FindBy(xpath="//li[40]//div[1]//label[1]//input[1]")
	public static WebElement itemViewInfoPannelChkbox;

	@FindBy(xpath="//li[41]//div[1]//label[1]//input[1]")
	public static WebElement itemRejectChkbox;


	@FindBy(xpath="//li[42]//div[1]//label[1]//input[1]")
	public static WebElement itemImportChkbox;

	@FindBy(xpath="//li[43]//div[1]//label[1]//input[1]")
	public static WebElement itemShowHomePageChkbox;

	@FindBy(xpath="//li[44]//div[1]//label[1]//input[1]")
	public static WebElement itemDeleteInfoPannelChkbox;

	@FindBy(xpath="//li[45]//div[1]//label[1]//input[1]")
	public static WebElement itemStopChkbox;

	@FindBy(xpath="//li[46]//div[1]//label[1]//input[1]")
	public static WebElement itemSaveRevisionChkbox;

	@FindBy(xpath="//li[47]//div[1]//label[1]//input[1]")
	public static WebElement itemSetDefaultTreeChkbox;

	@FindBy(xpath="//li[48]//div[1]//label[1]//input[1]")
	public static WebElement itemModifierChkbox;

	@FindBy(xpath="//li[49]//div[1]//label[1]//input[1]")
	public static WebElement itemEditTreeChkbox;

	@FindBy(xpath="//li[50]//div[1]//label[1]//input[1]")
	public static WebElement itemAuthorizationInfoChkbox;

	@FindBy(xpath="//li[51]//div[1]//label[1]//input[1]")
	public static WebElement itemAlternateChkbox;

	@FindBy(xpath="//li[52]//div[1]//label[1]//input[1]")
	public static WebElement itemrealtedChkbox;

	@FindBy(xpath="//li[53]//div[1]//label[1]//input[1]")
	public static WebElement itemOpenCLoseChkbox;

	@FindBy(xpath="//li[54]//div[1]//label[1]//input[1]")
	public static WebElement itemCloseProductChkbox;

	@FindBy(xpath="//li[55]//div[1]//label[1]//input[1]")
	public static WebElement itemAdvanceMasterImportandExportChkbox;

	@FindBy(xpath="//li[56]//div[1]//label[1]//input[1]")
	public static WebElement itemUnitConversionChkbox;

	@FindBy(xpath="//li[57]//div[1]//label[1]//input[1]")
	public static WebElement itemGeneralChkbox;

	@FindBy(xpath="//li[58]//div[1]//label[1]//input[1]")
	public static WebElement itemUnitsChkbox;

	@FindBy(xpath="//li[59]//div[1]//label[1]//input[1]")
	public static WebElement itemSettingChkbox;

	@FindBy(xpath="//li[60]//div[1]//label[1]//input[1]")
	public static WebElement itemClassificaionChkbox;

	@FindBy(xpath="//li[61]//div[1]//label[1]//input[1]")
	public static WebElement itemOtherDetailsChkbox;

	@FindBy(xpath="//li[62]//div[1]//label[1]//input[1]")
	public static WebElement itemReplenishmentChkbox;

	@FindBy(xpath="//li[63]//div[1]//label[1]//input[1]")
	public static WebElement itemReorderChkbox;

	@FindBy(xpath="//li[64]//div[1]//label[1]//input[1]")
	public static WebElement itemOutletChkbox;



	public boolean checkProfileAddProduct() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("ProfileAddProduct");

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
		homeMastersExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
		itemExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemOption));
		itemOption.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemAddChkbox));
		itemAddChkbox.click();

		Thread.sleep(2000);

		if (itemAddChkbox.isSelected()) 
		{
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  ProfileAddProduct saved Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 108, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   ProfileAddProduct profile saved Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 108, 9, resFail);
				return false;
			}
		} 
		else
		{
			System.out.println(" Fail : Item  Add Chkbox is Checked in ProfileAddProduct");	
			excelReader.setCellData(xlfile, xlSheetName, 108, 9, resFail);
			return false;
		}

	}








	public boolean checkProfileEditProduct() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("ProfileEditProduct");

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
		homeMastersExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
		itemExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemOption));
		itemOption.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemEditChkbox));
		itemEditChkbox.click();

		Thread.sleep(2000);

		if (itemEditChkbox.isSelected()) 
		{
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  ProfileEditProduct saved Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 109, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   ProfileEditProduct profile saved Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 109, 9, resFail);
				return false;
			}

		} 
		else
		{
			System.out.println(" Fail : Item  Edit Chkbox is Checked in ProfileEditProduct");
			excelReader.setCellData(xlfile, xlSheetName, 109, 9, resFail);
			return false;
		}

	}






	public boolean checkProfileCopyProduct() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("ProfileCopyProduct");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
		homeMastersExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
		itemExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemOption));
		itemOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemCopyChkbox));
		itemCopyChkbox.click();

		Thread.sleep(2000);

		if (itemCopyChkbox.isSelected()) 
		{
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  ProfileCopyProduct saved Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 110, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   ProfileCopyProduct profile saved Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 110, 9, resFail);
				return false;
			}
		} 
		else
		{
			System.out.println(" Fail : Item  Copy Chkbox is Checked in ProfileCopyProduct");	
			excelReader.setCellData(xlfile, xlSheetName, 110, 9, resFail);
			return false;
		}

	}





	public boolean checkProfileSearchDeleteProduct() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("ProfileSearchProduct");

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
		homeMastersExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
		itemExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemOption));
		itemOption.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSearchChkbox));
		itemSearchChkbox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemDeleteChkbox));
		itemDeleteChkbox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPrintChkbox));
		itemPrintChkbox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExportChkbox));
		itemExportChkbox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemAuthorizeChkbox));
		itemAuthorizeChkbox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemLedgerChkbox));
		itemLedgerChkbox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemCreateTreeChkbox));
		itemCreateTreeChkbox.click();

		if (itemSearchChkbox.isSelected() && itemDeleteChkbox.isSelected() && itemPrintChkbox.isSelected() && 
				itemExportChkbox.isSelected() && itemAuthorizeChkbox.isSelected() && itemLedgerChkbox.isSelected() &&
				itemCreateTreeChkbox.isSelected()) 
		{
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile saved Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("  Pass:  ProfileSearchProduct saved Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 111, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   ProfileSearchProduct profile saved Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 111, 9, resFail);
				return false;
			}
		} 
		else
		{
			System.out.println(" Fail : Item  Search Chkbox is Checked in ProfileSearchProduct");	
			excelReader.setCellData(xlfile, xlSheetName, 111, 9, resFail);
			return false;
		}

	}


	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement accountAddChkbox;	

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement accountEditChkbox;	

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement accountCopyChkbox;

	@FindBy(xpath="//li[4]//div[1]//label[1]//input[1]")
	public static WebElement accountSearchChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement accountDeleteChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement accountPrintChkbox;

	@FindBy(xpath="//li[7]//div[1]//label[1]//input[1]")
	public static WebElement accountExportChkbox;

	@FindBy(xpath="//li[8]//div[1]//label[1]//input[1]")
	public static WebElement accountCustomizeViewChkbox;

	@FindBy(xpath="//li[9]//div[1]//label[1]//input[1]")
	public static WebElement accountSortChkbox;

	@FindBy(xpath="//li[10]//div[1]//label[1]//input[1]")
	public static WebElement accountMassUpdateChkbox;

	@FindBy(xpath="//li[11]//div[1]//label[1]//input[1]")
	public static WebElement accountAuthorizeChkbox;

	@FindBy(xpath="//li[12]//div[1]//label[1]//input[1]")
	public static WebElement accountTransferChkbox;

	@FindBy(xpath="//li[13]//div[1]//label[1]//input[1]")
	public static WebElement accountPropertiesChkbox;

	@FindBy(xpath="//li[14]//div[1]//label[1]//input[1]")
	public static WebElement accountLedgerChkbox;

	@FindBy(xpath="//li[15]//div[1]//label[1]//input[1]")
	public static WebElement accountBackTrackChkbox;

	@FindBy(xpath="//li[16]//div[1]//label[1]//input[1]")
	public static WebElement accountBudgetsChkbox;

	@FindBy(xpath="//li[17]//div[1]//label[1]//input[1]")
	public static WebElement accountHelpChkbox;

	@FindBy(xpath="//li[18]//div[1]//label[1]//input[1]")
	public static WebElement accountCreateTreeChkbox;

	@FindBy(xpath="//li[19]//div[1]//label[1]//input[1]")
	public static WebElement accountDeleteTreeChkbox;

	@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
	public static WebElement accountCreateViewChkbox;


	@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
	public static WebElement salesOrderAuthorizeChkbox;


	@FindBy(xpath="//li[21]//div[1]//label[1]//input[1]")
	public static WebElement accountEditViewChkbox;

	@FindBy(xpath="//li[22]//div[1]//label[1]//input[1]")
	public static WebElement accountDeleteViewChkbox;

	@FindBy(xpath="//li[23]//div[1]//label[1]//input[1]")
	public static WebElement accountSelectViewChkbox;

	@FindBy(xpath="//li[24]//div[1]//label[1]//input[1]")
	public static WebElement accountSelectTreeChkbox;

	@FindBy(xpath="//li[25]//div[1]//label[1]//input[1]")
	public static WebElement accountCloneChkbox;

	@FindBy(xpath="//li[26]//div[1]//label[1]//input[1]")
	public static WebElement accountAddGroupChkbox;

	@FindBy(xpath="//li[27]//div[1]//label[1]//input[1]")
	public static WebElement accountGroupMasterChkbox;

	@FindBy(xpath="//li[28]//div[1]//label[1]//input[1]")
	public static WebElement accountSettypeChkbox;

	@FindBy(xpath="//li[29]//div[1]//label[1]//input[1]")
	public static WebElement accountDeleteAllChkbox;

	@FindBy(xpath="//li[30]//div[1]//label[1]//input[1]")
	public static WebElement accountMoveupChkbox;

	@FindBy(xpath="//li[31]//div[1]//label[1]//input[1]")
	public static WebElement accountMOveDownChkbox;

	@FindBy(xpath="//li[32]//div[1]//label[1]//input[1]")
	public static WebElement accountCreditMangementChkbox;

	@FindBy(xpath="//li[33]//div[1]//label[1]//input[1]")
	public static WebElement accountdepartmentApprooriationChkbox;

	@FindBy(xpath="//li[34]//div[1]//label[1]//input[1]")
	public static WebElement accountCustomizeTreeChkbox;

	@FindBy(xpath="//li[35]//div[1]//label[1]//input[1]")
	public static WebElement accountCustomizeMasterChkbox;

	@FindBy(xpath="//li[36]//div[1]//label[1]//input[1]")
	public static WebElement accountCanChangeGroupChkbox;

	@FindBy(xpath="//li[37]//div[1]//label[1]//input[1]")
	public static WebElement accountCanNAvigateChkbox;

	@FindBy(xpath="//li[38]//div[1]//label[1]//input[1]")
	public static WebElement accountAddInfoPannelChkbox;

	@FindBy(xpath="//li[39]//div[1]//label[1]//input[1]")
	public static WebElement accountEditInfoPannelChkbox;

	@FindBy(xpath="//li[40]//div[1]//label[1]//input[1]")
	public static WebElement accountViewInfoPannelChkbox;

	@FindBy(xpath="//li[41]//div[1]//label[1]//input[1]")
	public static WebElement accountRejectChkbox;

	@FindBy(xpath="//li[42]//div[1]//label[1]//input[1]")
	public static WebElement accountImportChkbox;

	@FindBy(xpath="//li[43]//div[1]//label[1]//input[1]")
	public static WebElement accountShowHomePageChkbox;

	@FindBy(xpath="//li[44]//div[1]//label[1]//input[1]")
	public static WebElement accountDeletInfoPannelChkbox;

	@FindBy(xpath="//li[45]//div[1]//label[1]//input[1]")
	public static WebElement accountStopChkbox;

	@FindBy(xpath="//li[46]//div[1]//label[1]//input[1]")
	public static WebElement accountSaveRevisionChkbox;

	@FindBy(xpath="//li[47]//div[1]//label[1]//input[1]")
	public static WebElement accountSetDefaultTreeChkbox;

	@FindBy(xpath="//li[48]//div[1]//label[1]//input[1]")
	public static WebElement accountModiferChkbox;

	@FindBy(xpath="//li[49]//div[1]//label[1]//input[1]")
	public static WebElement accountEditTreeChkbox;

	@FindBy(xpath="//li[50]//div[1]//label[1]//input[1]")
	public static WebElement accountAutorizationInfoChkbox;

	@FindBy(xpath="//li[51]//div[1]//label[1]//input[1]")
	public static WebElement accountAlternateChkbox;

	@FindBy(xpath="//li[52]//div[1]//label[1]//input[1]")
	public static WebElement accountRelatedChkbox;

	@FindBy(xpath="//li[53]//div[1]//label[1]//input[1]")
	public static WebElement accountOpenCloseChkbox;

	@FindBy(xpath="//li[54]//div[1]//label[1]//input[1]")
	public static WebElement accountCLoseProductChkbox;

	@FindBy(xpath="//li[55]//div[1]//label[1]//input[1]")
	public static WebElement accountAdvanceMasterImportAndExportChkbox;

	@FindBy(xpath="//li[56]//div[1]//label[1]//input[1]")
	public static WebElement accountGeneralChkbox;

	@FindBy(xpath="//li[57]//div[1]//label[1]//input[1]")
	public static WebElement accountSettingChkbox;

	@FindBy(xpath="//li[58]//div[1]//label[1]//input[1]")
	public static WebElement accountDetailsChkbox;

	@FindBy(xpath="//li[59]//div[1]//label[1]//input[1]")
	public static WebElement accountPrintLayoutChkbox;

	@FindBy(xpath="//a[@id='1000']//i[@class='icon icon-expand']")
	public static WebElement mastersExpandBtn;

	public boolean checkProfileAllAcountsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
		createProfileMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("ProfileAllAcountsOption");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersExpandBtn));
		mastersExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAccountOption));
		masterAccountOption.click();
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
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
			excelReader.setCellData(xlfile, xlSheetName, 112, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Displyed All the Elements in the Master Account Option");
			excelReader.setCellData(xlfile, xlSheetName, 112, 9, resFail);
			return false;
		}
	}





	public boolean checkProfileAllAcountsOptionwithSelectAll() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
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
			excelReader.setCellData(xlfile, xlSheetName, 113, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Displyed All the Elements in the Master Account Option");
			excelReader.setCellData(xlfile, xlSheetName, 113, 9, resFail);
			return false;
		}

	}


	public boolean checkProfileAllAcountsOptionwithSaveBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println(" Pass: All Accounts Profile is Saved Succesfully and All Options Are enable ");
			excelReader.setCellData(xlfile, xlSheetName, 114, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  All Accounts Profile is Saved Succesfully and All Options Are enable");
			excelReader.setCellData(xlfile, xlSheetName, 114, 9, resFail);
			return false;
		}

	}








	public boolean checkProfileAllDepartmentOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("ProfileAllDepartmentOption");

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();


		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersExpandBtn));
		mastersExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountDepartmentOption));
		accountDepartmentOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
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
			excelReader.setCellData(xlfile, xlSheetName, 115, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Displyed All the Elements in the Master Department Option");
			excelReader.setCellData(xlfile, xlSheetName, 115, 9, resFail);
			return false;
		}

	}




	public boolean checkProfileAllDepartmentOptionWithSelectAllOPtion() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
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
			excelReader.setCellData(xlfile, xlSheetName, 116, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Displyed All the Elements in the Master Department Option");
			excelReader.setCellData(xlfile, xlSheetName, 116, 9, resFail);
			return false;
		}
	}










	public boolean checkProfileDepartmentOptionwithSaveBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println(" Pass: All Accounts Profile is Saved Succesfully and All Options Are enable ");
			excelReader.setCellData(xlfile, xlSheetName, 117, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  All Accounts Profile is Saved Succesfully and All Options Are enable");
			excelReader.setCellData(xlfile, xlSheetName, 117, 9, resFail);
			return false;
		}

	}




	public boolean checkEditProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
		createProfileMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("ProfileAllDepartmentOption");

		Thread.sleep(2000);

		createProfileProfileNameCombo.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersExpandBtn));
		mastersExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountDepartmentOption));
		accountDepartmentOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
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

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileUnSelectAllIcon));
			createProfileUnSelectAllIcon.click();


			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAddChkbox));
			accountAddChkbox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile Updated Successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("  Pass:  Allow to unselect All Options  in Department profile and Selected Only Add Chkbox");
				excelReader.setCellData(xlfile, xlSheetName, 118, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Fail:   Allow to unselect All Options  in Department profile and Selected Only Add Chkbox");
				excelReader.setCellData(xlfile, xlSheetName, 118, 9, resFail);
				return false;
			}
		} 
		else 
		{
			System.out.println(" Fail: Allow to select the Profile AllDepartmentProfile and display all options in the Department");
			excelReader.setCellData(xlfile, xlSheetName, 118, 9, resFail);
			return false;
		}


	}



	public boolean checkDeleteProfileSalesAccessAPIProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
		createProfileMenu.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));

		createProfileProfileNameCombo.sendKeys("SalesAccessAPIProfile");

		Thread.sleep(2000);

		createProfileProfileNameCombo.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileDeleteIcon));
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
			excelReader.setCellData(xlfile, xlSheetName, 119, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  displayed message as Are you Sure want to Delete with Yes and No buttons");
			excelReader.setCellData(xlfile, xlSheetName, 119, 9, resFail);
			return false;
		}

	}

	public boolean  checkNoOptioninDeletePopMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getDriver().switchTo().alert().dismiss();

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));

		if (createProfileProfileNameCombo.isDisplayed())
		{
			System.out.println(" Pass: SalesAccessAPIProfile is Not Deleted Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 120, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: SalesAccessAPIProfile is Not Deleted Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 120, 9, resFail);
			return false;
		}



	}



	public boolean SelectagainandClickonDeleteProfileButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileDeleteIcon));
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
			excelReader.setCellData(xlfile, xlSheetName, 121, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  displayed message as Are you Sure want to Delete ");
			excelReader.setCellData(xlfile, xlSheetName, 121, 9, resFail);
			return false;
		}
	}




	public boolean checkYesOptioninDeletePopMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		getDriver().switchTo().alert().accept();

		String expMessage="Profile deleted Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println(" Pass: SalesAccessAPIProfile is Deleted Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 122, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail: SalesAccessAPIProfile is Deleted Successfull");
			excelReader.setCellData(xlfile, xlSheetName, 122, 9, resFail);
			return false;
		}
	}





	public boolean checkLoadFrom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();

		Thread.sleep(3000);

		createProfileProfileNameCombo.sendKeys("ProfileLoadFrom");

		Thread.sleep(2000);

		createProfileProfileNameCombo.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoadFromIcon));
		createUserLoadFromIcon.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadFromLabel));

		if (loadFromLabel.isDisplayed() && loadPopupOkBtn.isDisplayed() && loadPopupCancelBtn.isDisplayed() && loadSearchTxt.isDisplayed()
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
			excelReader.setCellData(xlfile, xlSheetName, 123, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail:Dipalyed All Option In Load From ");
			excelReader.setCellData(xlfile, xlSheetName, 123, 9, resFail);
			return false;
		}


	}




	@FindBy(xpath="//span[contains(text(),'AllProductProfile')]")
	public static WebElement loadFromAllProductProfile;

	@FindBy(xpath="//span[contains(text(),'All Profile')]")
	public static WebElement loadFromAllProfile;





	public boolean checkLoadFromScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		if (loadFromAllProductProfile.isDisplayed() && loadFromAllProfile.isDisplayed() ) 
		{
			System.out.println(" Pass: Dispalyed All the Profiles in Load From Screen ");	
			excelReader.setCellData(xlfile, xlSheetName, 124, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Dispalyed All the Profiles in Load From Screen ");
			excelReader.setCellData(xlfile, xlSheetName, 124, 9, resFail);
			return false;
		}
	}

	public boolean checkSearchinLoadFrom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadSearchTxt));
		loadSearchTxt.sendKeys("AllProductProfile");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadFromAllProductProfile));
		if (loadFromAllProductProfile.isDisplayed()) 
		{
			System.out.println(" Pass:  All Product Profile is Highlighted ");
			excelReader.setCellData(xlfile, xlSheetName, 125, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail : All Product Profile is Highlighted");
			excelReader.setCellData(xlfile, xlSheetName, 125, 9, resFail);
			return false;
		}
	}


	public boolean checkCanceloptioninLoadFrom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadPopupCancelBtn));
		loadPopupCancelBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));

		if (createProfileProfileNameCombo.isDisplayed())
		{
			System.out.println(" Pass: Cancel Option in Load From");
			excelReader.setCellData(xlfile, xlSheetName, 126, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Cancel Option in Load From");
			excelReader.setCellData(xlfile, xlSheetName, 126, 9, resFail);
			return false;
		}
	}




	public boolean checkSaveoptioninLoadFrom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Provide some Permissions and Save";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			System.out.println("  Pass:  Not Allow to select save option without selecting profile in LoadFrom");
			excelReader.setCellData(xlfile, xlSheetName, 127, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Not Allow to select save option without selecting profile in LoadFrom");
			excelReader.setCellData(xlfile, xlSheetName, 127, 9, resFail);
			return false;
		}
	}



	@FindBy(xpath="//h4[contains(text(),'Load From')]")
	public static WebElement loadFromLabel;


	@FindBy(xpath="//input[@id='searchLoadPrfletxtBox']")
	public static WebElement loadSearchTxt;

	/*@FindBy(xpath="//button[@class='Fbutton'][contains(text(),'Ok')]")
public static WebElement loadPopupOkBtn;*/


	@FindBy(xpath="//*[@id='LoadProfile']/div[2]/div/div[3]/div/input[1]")
	public static WebElement loadPopupOkBtn;

	@FindBy(xpath="//*[@id='LoadProfile']/div[2]/div/div[3]/div/input[2]")
	public static WebElement loadPopupCancelBtn;




	public boolean checkSelecttheAllProductProfilefromtheLoadFromScreenandclickonOk() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoadFromIcon));
		createUserLoadFromIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadSearchTxt));
		loadSearchTxt.sendKeys("All");

		Thread.sleep(2000);

		avaliableProfileAllProductProfile.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadPopupOkBtn));
		loadPopupOkBtn.click();

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
			excelReader.setCellData(xlfile, xlSheetName, 128, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Allow to select Add option ,Edit Option And Delete Option  in Screen in Finanicals Menu");
			excelReader.setCellData(xlfile, xlSheetName, 128, 9, resFail);
			return false;
		}
	}







	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Auto Sales Order')]")
	public static WebElement salesOrderTypeAutoSalesOrder;

	//Checking the Sales Order Type Voucher Creation is displaying or not
	public boolean checkNewVoucherDisplay() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileMenu));
		createProfileMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("Sales Order AutoAddPrintAuthorize");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventorytransactionExpandBtn));
		inventorytransactionExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionSalesExpansionBtn));
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
			excelReader.setCellData(xlfile, xlSheetName, 130, 9, resPass);
			return true;



		}
		else
		{
			System.out.println("  Pass:  User Created Voucher Auto Sales Order is not display");
			excelReader.setCellData(xlfile, xlSheetName, 130, 9, resFail);
			return true;
		}

	}

	public boolean checkNewVoucherSaveRestrictionWithMoreLengthsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accessChkBox));
		accessChkBox.click();



		if (accessChkBox.isSelected() )
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage="Profile Name length should be less that 30 characters";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) {
				System.out.println("  Pass:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 131, 9, resPass);

				return true;
			} 

			else 
			{
				System.out.println("Fail:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
				excelReader.setCellData(xlfile, xlSheetName, 131, 9, resFail);
				return false;
			}
		}
		else
		{
			System.out.println("Fail:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
			excelReader.setCellData(xlfile, xlSheetName, 131, 9, resFail);
			return false;
		}

	}



	public boolean checkNewVoucherSaveRestrictionOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.clear();
		createProfileProfileNameCombo.sendKeys("SOAutoAddPrintAuthorize");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrderTypeAutoSalesOrder));
		salesOrderTypeAutoSalesOrder.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accessChkBox));
		accessChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addChkBox));
		addChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printChkBox));
		printChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveRevisionChkBox));
		saveRevisionChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(modifySettingsChkBox));
		modifySettingsChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(authorizeChkBox));
		authorizeChkBox.click();

		Thread.sleep(2000);

		if (accessChkBox.isSelected() && addChkBox.isSelected() && printChkBox.isSelected() && saveRevisionChkBox.isSelected() && modifySettingsChkBox.isSelected() 
				&& authorizeChkBox.isSelected())


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage="Profile saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) {
			System.out.println("  Pass:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
			excelReader.setCellData(xlfile, xlSheetName, 132, 9, resPass);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCloseIcon));
			createProfileCloseIcon.click();
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Allow to select viewDocEnteredByOthersChkBox in Sales Order");
			excelReader.setCellData(xlfile, xlSheetName, 132, 9, resFail);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCloseIcon));
			createProfileCloseIcon.click();
			return false;
		}



	}





	public boolean checkCLoseinCreateProfileScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCloseIcon));
		createProfileCloseIcon.click();

		if (labelDashboard.isDisplayed() &&
				selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() &&
				dashboardCustomizationSettings.isDisplayed()) 
		{
			System.out.println(" Pass: Create Profile Screen closed Succesfully");
			excelReader.setCellData(xlfile, xlSheetName, 129, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: Create Profile Screen closed Succesfully");
			excelReader.setCellData(xlfile, xlSheetName, 129, 9, resFail);
			return false;

		}
	}




	//Create Profile Stops





	@FindBy(xpath="//a[@id='2']//span[contains(text(),'Company')]")
	public static WebElement  companymenu;

	@FindBy(xpath="//span[contains(text(),'Security')]")
	public static WebElement securitymenu ;

	@FindBy(xpath="//a[@id='1000']//span[contains(text(),'Masters')]")
	public static WebElement masterMenu ;

	@FindBy(xpath="//span[contains(text(),'Data Management')]")
	public static WebElement  datamanagementMenu;

	@FindBy(xpath="//a[@id='20']//span[contains(text(),'Utilities')]")
	public static WebElement  utilitiesmenu;





	@FindBy(xpath="//*[contains(text(),'All Profile')]")
	public static WebElement avaliableAllProfile ;

	@FindBy(xpath="//*[contains(text(),'All Profile ST')]")
	public static WebElement avaliableAllProfileSt ;

	@FindBy(xpath="//*[contains(text(),'Purchase Profile')]")
	public static WebElement avaliableProfilePurchaseProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesOrderProfile')]")
	public static WebElement avaliableProfileSalesOrderProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleAccessProfile')]")
	public static WebElement avaliableProfileSaleAccessProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleAddProfile')]")
	public static WebElement avaliableProfileSaleAddProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleEditProfile')]")
	public static WebElement avaliableProfileSaleEditProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleDeleteProfile')]")
	public static WebElement avaliableProfileSaleDeleteProfile ;

	@FindBy(xpath="//*[contains(text(),'SalePrintProfile')]")
	public static WebElement avaliableProfileSalePrintProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleRePrintProfile')]")
	public static WebElement avaliableProfileSaleRePrintProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesPrintUnAuthorizeProfile')]")
	public static WebElement avaliableProfileSalesPrintUnAuthorizeProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesEditMiscProfile')]")
	public static WebElement avaliableProfileSalesEditMiscProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesAlwaysSuspendingProfile')]")
	public static WebElement avaliableProfileSalesAlwaysSuspendingProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesChangePrintLayoutProfile')]")
	public static WebElement avaliableProfileSalesChangePrintLayoutProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesAuthorizeProfile')]")
	public static WebElement avaliableProfileSalesAuthorizeProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesRejectProfile')]")
	public static WebElement avaliableProfileSalesRejectProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesHomePageProfile')]")
	public static WebElement avaliableProfileSalesHomePageProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesStopProfile')]")
	public static WebElement avaliableProfileSalesStopProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesModifySettingsProfile')]")
	public static WebElement avaliableProfileSalesModifySettingsProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesViewDocumentsEnterByOther')]")
	public static WebElement avaliableProfileSalesViewDocumentsEnterByOther ;

	@FindBy(xpath="//*[contains(text(),'SalesCloseLinkProfile')]")
	public static WebElement avaliableProfileSalesCloseLinkProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesSaveRevisionProfile')]")
	public static WebElement avaliableProfileSalesSaveRevisionProfile ;

	@FindBy(xpath="//*[contains(text(),'SalesSuspendProfile')]")
	public static WebElement avaliableProfileSalesSuspendProfile ;

	@FindBy(xpath="//*[contains(text(),'EditExportedSyncDocProfile')]")
	public static WebElement avaliableProfileEditExportedSyncDocProfile ;

	@FindBy(xpath="//*[contains(text(),'EditImportedSyncDocProfile')]")
	public static WebElement avaliableProfileEditImportedSyncDocProfile ;

	@FindBy(xpath="//*[contains(text(),'SaleHideProfile')]")
	public static WebElement avaliableProfileSaleHideProfile ;

	@FindBy(xpath="//*[contains(text(),'FAReportsAllOptions')]")
	public static WebElement avaliableProfileFAReportsAllOptions ;

	@FindBy(xpath="//*[contains(text(),'LedgerProfile')]")
	public static WebElement avaliableProfileLedgerProfile ;

	@FindBy(xpath="//*[contains(text(),'SLAcessProfile')]")
	public static WebElement avaliableProfileSLAcessProfile ;

	@FindBy(xpath="//*[contains(text(),'SLSearchProfile')]")
	public static WebElement avaliableProfileSLSearchProfile ;

	@FindBy(xpath="//*[contains(text(),'SLPrintProfile')]")
	public static WebElement avaliableProfileSLPrintProfile ;

	@FindBy(xpath="//*[contains(text(),'SLViewProfile')]")
	public static WebElement avaliableProfileSLViewProfile ;

	@FindBy(xpath="//*[contains(text(),'SLExportProfile')]")
	public static WebElement avaliableProfileSLExportProfile ;

	@FindBy(xpath="//*[contains(text(),'SLEmailProfile')]")
	public static WebElement avaliableProfileSLEmailProfile ;

	@FindBy(xpath="//*[contains(text(),'SLViewGraphProfile')]")
	public static WebElement avaliableProfileSLViewGraphProfile ;

	@FindBy(xpath="//*[contains(text(),'SLFilterProfile')]")
	public static WebElement avaliableProfileSLFilterProfile ;

	@FindBy(xpath="//*[contains(text(),'SLAnalyzeProfile')]")
	public static WebElement avaliableProfileSLAnalyzeProfile ;

	@FindBy(xpath="//*[contains(text(),'SLCrossReferenceProfile')]")
	public static WebElement avaliableProfileSLCrossReferenceProfile ;

	@FindBy(xpath="//*[contains(text(),'SLAddAnalyzeProfile')]")
	public static WebElement avaliableProfileSLAddAnalyzeProfile ;

	@FindBy(xpath="//*[contains(text(),'AllMasterProfile')]")
	public static WebElement avaliableProfileAllMasterProfile ;

	@FindBy(xpath="//*[contains(text(),'AllProductProfile')]")
	public static WebElement avaliableProfileAllProductProfile ;

	@FindBy(xpath="//*[contains(text(),'ProfileAddProduct')]")
	public static WebElement avaliableProfileProfileAddProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileEditProduct')]")
	public static WebElement avaliableProfileProfileEditProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCopyProduct')]")
	public static WebElement avaliableProfileProfileCopyProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSearchProduct')]")
	public static WebElement avaliableProfileProfileSearchProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDeleteProduct')]")
	public static WebElement avaliableProfileProfileDeleteProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfilePrintProduct')]")
	public static WebElement avaliableProfileProfilePrintProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileExportProduct')]")
	public static WebElement avaliableProfileProfileExportProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCustomizeViewProduct')]")
	public static WebElement avaliableProfileProfileCustomizeViewProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSortProduct')]")
	public static WebElement avaliableProfileProfileSortProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileMassUpdateProduct')]")
	public static WebElement avaliableProfileProfileMassUpdateProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileAuthorizeProduct')]")
	public static WebElement avaliableProfileProfileAuthorizeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileTransferProduct')]")
	public static WebElement avaliableProfileProfileTransferProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfilePropertiesProduct')]")
	public static WebElement avaliableProfileProfilePropertiesProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileLedgerProduct')]")
	public static WebElement avaliableProfileProfileLedgerProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileBackTrackProduct')]")
	public static WebElement avaliableProfileProfileBackTrackProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileBudgetsProduct')]")
	public static WebElement avaliableProfileProfileBudgetsProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileHelpProduct')]")
	public static WebElement avaliableProfileProfileHelpProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCreateTreeProduct')]")
	public static WebElement avaliableProfileProfileCreateTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDeleteTreeProduct')]")
	public static WebElement avaliableProfileProfileDeleteTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCreateViewProduct')]")
	public static WebElement avaliableProfileProfileCreateViewProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileEditViewProduct')]")
	public static WebElement avaliableProfileProfileEditViewProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDeleteViewProduct')]")
	public static WebElement avaliableProfileProfileDeleteViewProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSelectViewProduct')]")
	public static WebElement avaliableProfileProfileSelectViewProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSelectTreeProduct')]")
	public static WebElement avaliableProfileProfileSelectTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCloneProduct')]")
	public static WebElement avaliableProfileProfileCloneProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileAddGroupProduct')]")
	public static WebElement avaliableProfileProfileAddGroupProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileGroupMasterProduct')]")
	public static WebElement avaliableProfileProfileGroupMasterProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSetTypeProduct')]")
	public static WebElement avaliableProfileProfileSetTypeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDeleteAllProduct')]")
	public static WebElement avaliableProfileProfileDeleteAllProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileMoveUpProduct')]")
	public static WebElement avaliableProfileProfileMoveUpProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileMoveDownProduct')]")
	public static WebElement avaliableProfileProfileMoveDownProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCreditManagementProduct')]")
	public static WebElement avaliableProfileProfileCreditManagementProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDepAppropirationProduct')]")
	public static WebElement avaliableProfileProfileDepAppropirationProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCustomizeTreeProduct')]")
	public static WebElement avaliableProfileProfileCustomizeTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCustomizeMasterProduct')]")
	public static WebElement avaliableProfileProfileCustomizeMasterProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCanChangeGroupProduct')]")
	public static WebElement avaliableProfileProfileCanChangeGroupProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileCanNavigateProduct')]")
	public static WebElement avaliableProfileProfileCanNavigateProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileAddInfoPanelProduct')]")
	public static WebElement avaliableProfileProfileAddInfoPanelProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileEditInfoPanelProduct')]")
	public static WebElement avaliableProfileProfileEditInfoPanelProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileViewInfoPanelProduct')]")
	public static WebElement avaliableProfileProfileViewInfoPanelProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileRejectProduct')]")
	public static WebElement avaliableProfileProfileRejectProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileImportProduct')]")
	public static WebElement avaliableProfileProfileImportProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileShowHomePageProduct')]")
	public static WebElement avaliableProfileProfileShowHomePageProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileDeleteInfoPanelProduct')]")
	public static WebElement avaliableProfileProfileDeleteInfoPanelProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileStopProduct')]")
	public static WebElement avaliableProfileProfileStopProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSaveRevisionProduct')]")
	public static WebElement avaliableProfileProfileSaveRevisionProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSetDeafultTreeProduct')]")
	public static WebElement avaliableProfileProfileSetDeafultTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileModifierProduct')]")
	public static WebElement avaliableProfileProfileModifierProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileEditTreeProduct')]")
	public static WebElement avaliableProfileProfileEditTreeProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileGeneralProduct')]")
	public static WebElement avaliableProfileProfileGeneralProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileUnitsProduct')]")
	public static WebElement avaliableProfileProfileUnitsProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileSettingsProduct')]")
	public static WebElement avaliableProfileProfileSettingsProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileClassificationProduct')]")
	public static WebElement avaliableProfileProfileClassificationProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileOtherDetailsProduct')]")
	public static WebElement avaliableProfileProfileOtherDetailsProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileReplenishmentProduct')]")
	public static WebElement avaliableProfileProfileReplenishmentProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileReorderProduct')]")
	public static WebElement avaliableProfileProfileReorderProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileOutletProduct')]")
	public static WebElement avaliableProfileProfileOutletProduct ;

	@FindBy(xpath="//*[contains(text(),'ProfileAllAcountsOption')]")
	public static WebElement avaliableProfileProfileAllAcountsOption ;

	@FindBy(xpath="//*[contains(text(),'ProfileAllDepartmentOption')]")
	public static WebElement avaliableProfileProfileAllDepartmentOption ;

	@FindBy(xpath="//*[contains(text(),'ProfileLoadFrom')]")
	public static WebElement avaliableProfileProfileLoadFrom ;

	@FindBy(xpath="//*[@id='profileAdditionbtns']/div[2]/span")
	public static WebElement  createRoleMOveFiledsFromLeftSideToRightSide; 


	@FindBy(xpath="//*[@id='profileAdditionbtns']/div[3]/span")
	public static WebElement createRoleMOveFiledsFromRigheSideToLeftSide;



	@FindBy(xpath="//div[@id='Additions']//label[@class='Flabel font-4'][contains(text(),'Menu')]")
	public static WebElement menuLabel;


	@FindBy(xpath="//*[@id='Addmenu']/li[2]/ul/li[1]/i")
	public static WebElement  addFinTransationExpandBtn;

	@FindBy(xpath="//*[@id='Addmenu']/li[2]/ul/li[1]/ul/li[2]/i")
	public static WebElement addFinTransationpurchaseExpandBtn;

	@FindBy(xpath="//*[@id='Addmenu']/li[2]/ul/li[1]/ul/li[2]/ul/li[1]/a[@id='2008']")
	public static WebElement addFinTransPurPurchasesVouchers;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchases Returns')]")
	public static WebElement addFinTransPurPurchasesReturns;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchase Vouchers N')]")
	public static WebElement addFinTransPurPurchaseVouchersN;

	@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2008']")
	public static WebElement purAlwaysSuspendChkBox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2008']")
	public static WebElement purHideMenuChkbox;

	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement finPurAccessChkbox;

	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement finPurAddChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement finPurEditChkbox;

	@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2008']")
	public static WebElement finPurDeleteChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement finPurPrintChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement finPurRePrintChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2008']")
	public static WebElement finPurPrintBarcodeChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2008']")
	public static WebElement finPurPrintUnAuthorizedDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2008']")
	public static WebElement finPurExportChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2008']")
	public static WebElement finPurEditDocumentsEnteredbyOtherChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2008']")
	public static WebElement finPurEditDocumentsThatAreCheckedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2008']")
	public static WebElement finPurEditReconciledDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2008']")
	public static WebElement finPurEditDocumentsAuthorizationByHigherUpsChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2008']")
	public static WebElement finPurEnterDocumentsThatExceedLimitChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2008']")
	public static WebElement finPurChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2008']")
	public static WebElement finPurEditDocumentsThatAreRePrintedChkbox;

	@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2008']")
	public static WebElement finPurAccessThroughAPIChkbox;

	@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2008']")
	public static WebElement finPurAlwaysSuspendOnSavingChkbox;

	@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2008']")
	public static WebElement finPurChangePrintLayoutChkbox;

	@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
	public static WebElement finPurAuthorizeChkbox;

	@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='2008']")
	public static WebElement finPurRejectChkbox;

	@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2008']")
	public static WebElement finPurShowHomepageChkbox;

	@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2008']")
	public static WebElement finPurStopChkbox;

	@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2008']")
	public static WebElement finPurModifySettingsChkbox;

	@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2008']")
	public static WebElement finPurViewDocumentEnteredByOthersChkbox;

	@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2008']")
	public static WebElement finPurCloseLinksChkbox;

	@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2008']")
	public static WebElement finPurSaveRevisionChkbox;

	@FindBy(xpath="//label[contains(text(),'Show Posting Details')]//input[@id='2008']")
	public static WebElement finPurShowPostingDetailsChkbox;

	@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2008']")
	public static WebElement finPurSuspendChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2008']")
	public static WebElement finPurEditExportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2008']")
	public static WebElement finPurEditImportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2008']")
	public static WebElement finPurHideMenuChkbox;

	@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2008']")
	public static WebElement finPurAmendChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize link')]//input[@id='2008']")
	public static WebElement finPurCustomizeLinkChkbox;

	@FindBy(xpath="//label[contains(text(),'Filter home page')]//input[@id='2008']")
	public static WebElement finPurFilterHomePageChkbox;

	@FindBy(xpath="//label[contains(text(),'Add to stock')]//input[@id='2008']")
	public static WebElement finPurAddToStockChkbox;

	@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2008']")
	public static WebElement finPurReverseEntryChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize info panel')]//input[@id='2008']")
	public static WebElement finPurCustomizeInfoPanelChkbox;

	@FindBy(xpath="//label[contains(text(),'Raise Cheque Return')]//input[@id='2008']")
	public static WebElement finPurRaiseChequeReturnChkbox;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Request for Quote')]")
	public static WebElement addRequestForQuoteOption;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchases Quotations')]")
	public static WebElement addPurchaseQuotationOption;

	@FindBy(xpath="//li[@class='active']//a[@id='2012']//span[contains(text(),'Purchases Orders')]")
	public static WebElement addPurchaseorderOption;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Material Receipt Notes')]")
	public static WebElement addMaterialRecepitNotes;

	//Request For Quote

	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement reqForQuoteAccessChkbox;


	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement reqForQuoteAddChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement reqForQuoteEditChkbox;

	@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2010']")
	public static WebElement reqForQuoteDeleteChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement reqForQuotePrintChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement reqForQuoteRePrintChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2010']")
	public static WebElement reqForQuotePrintBarcodeChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2010']")
	public static WebElement reqForQuotePrintUnAuthorizedDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2010']")
	public static WebElement reqForQuoteExportChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2010']")
	public static WebElement reqForQuoteEditDocumentsEnteredbyOtherChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2010']")
	public static WebElement reqForQuoteEditDocumentsThatAreCheckedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2010']")
	public static WebElement reqForQuoteEditReconciledDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2010']")
	public static WebElement reqForQuoteEditDocumentsAuthorizationByHigherUpsChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2010']")
	public static WebElement reqForQuoteEnterDocumentsThatExceedLimitChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2010']")
	public static WebElement reqForQuoteChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2010']")
	public static WebElement reqForQuoteEditDocumentsThatAreRePrintedChkbox;

	@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2010']")
	public static WebElement reqForQuoteAccessThroughAPIChkbox;

	@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2010']")
	public static WebElement reqForQuoteAlwaysSuspendOnSavingChkbox;

	@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2010']")
	public static WebElement reqForQuoteChangePrintLayoutChkbox;

	@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
	public static WebElement reqForQuoteAuthorizeChkbox;

	@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='2010']")
	public static WebElement reqForQuoteRejectChkbox;

	@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2010']")
	public static WebElement reqForQuoteShowHomepageChkbox;

	@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2010']")
	public static WebElement reqForQuoteStopChkbox;

	@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2010']")
	public static WebElement reqForQuoteModifySettingsChkbox;

	@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2010']")
	public static WebElement reqForQuoteViewDocumentEnteredByOthersChkbox;

	@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2010']")
	public static WebElement reqForQuoteCloseLinksChkbox;

	@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2010']")
	public static WebElement reqForQuoteSaveRevisionChkbox;

	@FindBy(xpath="//label[contains(text(),'Show Posting Details')]//input[@id='2010']")
	public static WebElement reqForQuoteShowPostingDetailsChkbox;

	@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2010']")
	public static WebElement reqForQuoteSuspendChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2010']")
	public static WebElement reqForQuoteEditExportedDocChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2010']")
	public static WebElement reqForQuoteEditImportedDocChkbox;

	@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2010']")
	public static WebElement reqForQuoteAmendChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize link')]//input[@id='2010']")
	public static WebElement reqForQuoteCustomizeLinkChkbox;

	@FindBy(xpath="//label[contains(text(),'Filter home page')]//input[@id='2010']")
	public static WebElement reqForQuoteFilterHomePageChkbox;

	@FindBy(xpath="//label[contains(text(),'Add to stock')]//input[@id='2010']")
	public static WebElement reqForQuoteAddToStockChkbox;

	@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2010']")
	public static WebElement reqForQuoteReverseEntryChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize info panel')]//input[@id='2010']")
	public static WebElement reqForQuoteCustomizeInfoPanelChkbox;

	@FindBy(xpath="//label[contains(text(),'Raise Cheque Return')]//input[@id='2010']")
	public static WebElement reqForQuoteRaiseChequeReturnChkbox;

	//Purchase Quotations 

	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement purQuotationsAccessChkbox;


	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement purQuotationsAddChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement purQuotationsEditChkbox;

	@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2011']")
	public static WebElement purQuotationsDeleteChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement purQuotationsPrintChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement purQuotationsRePrintChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2011']")
	public static WebElement purQuotationsPrintBarcodeChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2011']")
	public static WebElement purQuotationsPrintUnAuthorizedDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2011']")
	public static WebElement purQuotationsExportChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2011']")
	public static WebElement purQuotationsEditDocumentsEnteredbyOtherChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2011']")
	public static WebElement purQuotationsEditDocumentsThatAreCheckedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2011']")
	public static WebElement purQuotationsEditReconciledDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2011']")
	public static WebElement purQuotationsEditDocumentsAuthorizationByHigherUpsChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2011']")
	public static WebElement purQuotationsEnterDocumentsThatExceedLimitChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2011']")
	public static WebElement purQuotationsChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2011']")
	public static WebElement purQuotationsEditDocumentsThatAreRePrintedChkbox;

	@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2011']")
	public static WebElement purQuotationsAccessThroughAPIChkbox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2011']")
	public static WebElement purQuotationsHideChkbox;

	@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2011']")
	public static WebElement purQuotationsChangePrintLayoutChkbox;

	@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
	public static WebElement purQuotationsAuthorizeChkbox;

	@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='2011']")
	public static WebElement purQuotationsRejectChkbox;

	@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2011']")
	public static WebElement purQuotationsShowHomepageChkbox;

	@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2011']")
	public static WebElement purQuotationsStopChkbox;

	@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2011']")
	public static WebElement purQuotationsModifySettingsChkbox;

	@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2011']")
	public static WebElement purQuotationsViewDocumentEnteredByOthersChkbox;

	@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2011']")
	public static WebElement purQuotationsCloseLinksChkbox;

	@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2011']")
	public static WebElement purQuotationsSaveRevisionChkbox;

	@FindBy(xpath="//label[contains(text(),'Show Posting Details')]//input[@id='2011']")
	public static WebElement purQuotationsShowPostingDetailsChkbox;

	@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2011']")
	public static WebElement purQuotationsSuspendChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2011']")
	public static WebElement purQuotationsEditExportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2011']")
	public static WebElement purQuotationsEditImportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2011']")
	public static WebElement purQuotationsHideMenuChkbox;

	@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2011']")
	public static WebElement purQuotationsAmendChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize link')]//input[@id='2011']")
	public static WebElement purQuotationsCustomizeLinkChkbox;

	@FindBy(xpath="//label[contains(text(),'Filter home page')]//input[@id='2011']")
	public static WebElement purQuotationsFilterHomePageChkbox;

	@FindBy(xpath="//label[contains(text(),'Add to stock')]//input[@id='2011']")
	public static WebElement purQuotationsAddToStockChkbox;

	@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2011']")
	public static WebElement purQuotationsReverseEntryChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize info panel')]//input[@id='2011']")
	public static WebElement purQuotationsCustomizeInfoPanelChkbox;

	@FindBy(xpath="//label[contains(text(),'Raise Cheque Return')]//input[@id='2011']")
	public static WebElement purQuotationsRaiseChequeReturnChkbox;


	//Purchase Order
	@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2012']")
	public static WebElement purOrderAlwaysSuspendOnSavingChkbox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2012']")
	public static WebElement purOrderHidewMenuChkbox;	

	//Material Receipts Notes 
	@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2013']")
	public static WebElement materialRecpNotesAlwaysSuspendSavingChkbox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2013']")
	public static WebElement materialRecpNotesHideMenuChkbox;

	@FindBy(xpath="//li[@class='active']//a[@id='137']//i[@class='icon-expand']")
	public static WebElement addInventoryTransactionExpansionBtn;

	@FindBy(xpath="//ul[@id='Exclmenu']//a[@id='135']//i[@class='icon-expand']")
	public static WebElement exclInvExpandBtn;

	@FindBy(xpath="//li[@class='active']//a[@id='137']//i[@class='icon-expand']")
	public static WebElement exclInvTransactionExpandBtn;

	@FindBy(xpath="//li[@class='active']//a[@id='139']//i[@class='icon-expand']")
	public static WebElement addInventoryTransactionpurchaseExpansionBtn;


	//Create Role Starts


	public boolean  checkAdditionsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("PurchaseINVAndFA");

		createRoleRoleNameCombo.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText("Numeric");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableProfilePurchaseProfile));
		avaliableProfilePurchaseProfile.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(additionTab));
		additionTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(menuLabel));

		if (menuLabel.isDisplayed() && addHomeExpandBtn.isDisplayed() && addFininicalExpandBtn.isDisplayed() &&  
				addInventoryExpandBtn.isDisplayed() && addFixedAssestsExpandBtn.isDisplayed() && addProductionExpandBtn.isDisplayed() &&
				addPointOfSaleExpandBtn.isDisplayed() && addQualityExpandBtn.isDisplayed() &&
				createProfileSelectAllIcon.isDisplayed() && createProfileUnSelectAllIcon.isDisplayed()
				&& createRoleCloseIcon.isDisplayed() && createRoleDeleteIcon.isDisplayed() && createRoleCloseIcon.isDisplayed())
		{
			System.out.println(" Pass: Additional Tab is Displayed Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 151, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail: Additional Tab is Displayed Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 151, 9, resFail);
			return false;
		}
	}


	public boolean checkClickonPurchaseTransactionOfFinance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFininicalExpandBtn));
		addFininicalExpandBtn.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransationExpandBtn));
		addFinTransationExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransationpurchaseExpandBtn));
		addFinTransationpurchaseExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransPurPurchasesVouchers));
		if (addFinTransPurPurchasesVouchers.isDisplayed() && addFinTransPurPurchasesReturns.isDisplayed()
				&& addFinTransPurPurchaseVouchersN.isDisplayed()) 
		{
			System.out.println(" Pass : Diplayed All the Sub Menu's in Purchase Option");
			excelReader.setCellData(xlfile, xlSheetName, 152, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail : Diplayed All the Sub Menu's in Purchase Option");
			excelReader.setCellData(xlfile, xlSheetName, 152, 9, resFail);
			return false;
		}

	}




	public boolean checkPurchaseVoucherRestrictionsArea() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransPurPurchasesVouchers));
		addFinTransPurPurchasesVouchers.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purAlwaysSuspendChkBox));

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
			excelReader.setCellData(xlfile, xlSheetName, 153, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Fail: selected All above three vouchers and its sub options in Restrictions Area");
			excelReader.setCellData(xlfile, xlSheetName, 153, 9, resFail);
			return false;
		}
	}


	public boolean checkAdditionTabPurchaseProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addInventoryExpandBtn));
		addInventoryExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addInventoryTransactionExpansionBtn));
		addInventoryTransactionExpansionBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addInventoryTransactionpurchaseExpansionBtn));
		addInventoryTransactionpurchaseExpansionBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addRequestForQuoteOption));


		boolean actaddRequestForQuoteOption=addRequestForQuoteOption.isDisplayed();
		boolean actaddPurchaseQuotationOption=addPurchaseQuotationOption.isDisplayed();
		boolean actaddPurchaseorderOption=addPurchaseorderOption.isDisplayed();
		boolean actaddMaterialRecepitNotes=addMaterialRecepitNotes.isDisplayed(); 


		boolean expaddRequestForQuoteOption=true;
		boolean expaddPurchaseQuotationOption=true;
		boolean expaddPurchaseorderOption=true;
		boolean expaddMaterialRecepitNotes=true; 


		System.out.println("addRequestForQuoteOption   :  "+actaddRequestForQuoteOption+"     "+expaddRequestForQuoteOption);
		System.out.println("addPurchaseQuotationOption :  "+actaddPurchaseQuotationOption+"     "+expaddPurchaseQuotationOption);
		System.out.println("addPurchaseorderOption     :  "+actaddPurchaseorderOption+"     "+expaddPurchaseorderOption);
		System.out.println("addMaterialRecepitNotes    :  "+actaddMaterialRecepitNotes+"     "+expaddMaterialRecepitNotes);


		if (actaddRequestForQuoteOption==expaddRequestForQuoteOption && actaddPurchaseQuotationOption==expaddPurchaseQuotationOption && 
				actaddPurchaseorderOption==expaddPurchaseorderOption && actaddMaterialRecepitNotes==expaddMaterialRecepitNotes) 
		{
			System.out.println(" Pass : Sun Menu Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 154, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail : Sun Menu Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 154, 9, resFail);

			return false;
		}
	}


	public boolean checkAdditionTabRequestForQuoteSubMenuOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addRequestForQuoteOption));
		addRequestForQuoteOption.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reqForQuoteAccessChkbox));
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
			excelReader.setCellData(xlfile, xlSheetName, 155, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail: Displayed All the Chkboxes");
			excelReader.setCellData(xlfile, xlSheetName, 155, 9, resFail);
			return false;
		}


	}


	public boolean checkAdditionTabPurchaseQuationsSubMenuOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addPurchaseQuotationOption));
		addPurchaseQuotationOption.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purQuotationsAccessChkbox));
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
			excelReader.setCellData(xlfile, xlSheetName, 156, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail: Displayed All the Chkboxes");
			excelReader.setCellData(xlfile, xlSheetName, 156, 9, resFail);
			return false;
		}

	}



	public boolean checkAdditionTabPurchaseOrderSubMenuOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addPurchaseorderOption));
		addPurchaseorderOption.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purOrderAlwaysSuspendOnSavingChkbox));
		if (purOrderAlwaysSuspendOnSavingChkbox.isDisplayed() &&purOrderHidewMenuChkbox.isDisplayed()) 
		{
			System.out.println(" Pass: Displayed All the Chkboxes");
			excelReader.setCellData(xlfile, xlSheetName, 157, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail: Displayed All the Chkboxes");
			excelReader.setCellData(xlfile, xlSheetName, 157, 9, resFail);
			return false;
		}

	}


	public boolean checkAdditionTabMaterialRecepitNotesSubMenuOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addMaterialRecepitNotes));
		addMaterialRecepitNotes.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialRecpNotesAlwaysSuspendSavingChkbox));
		if (materialRecpNotesAlwaysSuspendSavingChkbox.isDisplayed() &&materialRecpNotesHideMenuChkbox.isDisplayed()) 
		{
			System.out.println(" Pass: Displayed All the Chkboxes");
			excelReader.setCellData(xlfile, xlSheetName, 158, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail: Displayed All the Chkboxes");
			excelReader.setCellData(xlfile, xlSheetName, 158, 9, resFail);
			return false;
		}

	}


	@FindBy(xpath="//ul[@id='Exclmenu']//span[contains(text(),'Request for Quote')]")
	public static WebElement excPurchaseRequestForQuote;

	@FindBy(xpath="//ul[@id='Exclmenu']//span[contains(text(),'Purchases Quotations')]")
	public static WebElement excPurchaseQuotations;

	@FindBy(xpath="//ul[@id='Exclmenu']//li[@class='active']//li[@class='active']//span[contains(text(),'Purchases Orders')]")
	public static WebElement excPurchaeOrders;

	@FindBy(xpath="//ul[@id='Exclmenu']//span[contains(text(),'Material Receipt Notes')]")
	public static WebElement excMaterialRecepitNotes;


	public boolean ExculsionTabInPurchaseProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exclusionsTab));
		exclusionsTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exclInvExpandBtn));
		exclInvExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exclInvTransactionExpandBtn));
		exclInvTransactionExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addInventoryTransactionpurchaseExpansionBtn));
		addInventoryTransactionpurchaseExpansionBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurchaseRequestForQuote));
		if (excPurchaseRequestForQuote.isDisplayed() && excPurchaseQuotations.isDisplayed()&& excPurchaeOrders.isDisplayed()
				&&excMaterialRecepitNotes.isDisplayed() ) 
		{
			System.out.println(" Pass : Sun Menu Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 159, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail : Sun Menu Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 159, 9, resFail);
			return false;
		}

	}



	@FindBy(xpath="//label[contains(text(),'HideMenu')]//input[@id='2010']")
	public static WebElement excPurReqForQuoteHideChkbox;




	public boolean checkClickonExculsionInventoryPurchaseRequestFoqQuote() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurchaseRequestForQuote));
		excPurchaseRequestForQuote.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurReqForQuoteHideChkbox));
		if (excPurReqForQuoteHideChkbox.isSelected()) 
		{
			System.out.println(" Pass: Hide chkbox is Displayed and is Checked" );
			excelReader.setCellData(xlfile, xlSheetName, 160, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail: Hide chkbox is Displayed and is Checked" );
			excelReader.setCellData(xlfile, xlSheetName, 160, 9, resFail);
			return false;
		}
	}



	@FindBy(xpath="//input[@id='2011']")
	public static WebElement excPurPurQuotationsAlwaysSuspendOnSaving;

	public boolean checkClickonExculsionInventoryPurchasePurchaseQuotation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurchaseQuotations));
		excPurchaseQuotations.click();

		Thread.sleep(5000);

		boolean isSelct=excPurPurQuotationsAlwaysSuspendOnSaving.isSelected();
		System.out.println("isSelct is retrurning"+isSelct);

		if (excPurPurQuotationsAlwaysSuspendOnSaving.isDisplayed()) 
		{
			System.out.println(" Pass: Always Suspending on Saving chkbox is Displayed and is Checked" );
			excelReader.setCellData(xlfile, xlSheetName, 161, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail: Always Suspending on Saving chkbox is Displayed and is Checked" );
			excelReader.setCellData(xlfile, xlSheetName, 161, 9, resFail);
			return false;
		}
	}


	@FindBy(xpath="//div[@id='Exclusions']//li[1]//div[1]//label[1]//input[1]")
	public static WebElement excPurPurOrdersAccessChkbox;


	@FindBy(xpath="//div[@id='Exclusions']//li[2]//div[1]//label[1]//input[1]")
	public static WebElement excPurPurOrdersAddChkbox;

	@FindBy(xpath="//div[@id='Exclusions']//li[3]//div[1]//label[1]//input[1]")
	public static WebElement excPurPurOrdersEditChkbox;

	@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2012']")
	public static WebElement excPurPurOrdersDeleteChkbox;

	@FindBy(xpath="//div[@id='Exclusions']//li[5]//div[1]//label[1]//input[1]")
	public static WebElement excPurPurOrdersPrintChkbox;

	@FindBy(xpath="//div[@id='Exclusions']//li[6]//div[1]//label[1]//input[1]")
	public static WebElement excPurPurOrdersRePrintChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2012']")
	public static WebElement excPurPurOrdersPrintBarcodeChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2012']")
	public static WebElement excPurPurOrdersPrintUnAuthorizedDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2012']")
	public static WebElement excPurPurOrdersExportChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2012']")
	public static WebElement excPurPurOrdersEditDocumentsEnteredbyOtherChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2012']")
	public static WebElement excPurPurOrdersEditDocumentsThatAreCheckedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2012']")
	public static WebElement excPurPurOrdersEditReconciledDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2012']")
	public static WebElement excPurPurOrdersEditDocumentsAuthorizationByHigherUpsChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2012']")
	public static WebElement excPurPurOrdersEnterDocumentsThatExceedLimitChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2012']")
	public static WebElement excPurPurOrdersChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2012']")
	public static WebElement excPurPurOrdersEditDocumentsThatAreRePrintedChkbox;

	@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2012']")
	public static WebElement excPurPurOrdersAccessThroughAPIChkbox;

	@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2012']")
	public static WebElement excPurPurOrdersChangePrintLayoutChkbox;

	@FindBy(xpath="//div[@id='Exclusions']//li[19]//div[1]//label[1]//input[1]")
	public static WebElement excPurPurOrdersAuthorizeChkbox;

	@FindBy(xpath="//label[contains(text(),'Re_ject')]//input[@id='2012']")
	public static WebElement excPurPurOrdersRejectChkbox;

	@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2012']")
	public static WebElement excPurPurOrdersShowHomepageChkbox;

	@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2012']")
	public static WebElement excPurPurOrdersStopChkbox;

	@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2012']")
	public static WebElement excPurPurOrdersModifySettingsChkbox;

	@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2012']")
	public static WebElement excPurPurOrdersViewDocumentEnteredByOthersChkbox;

	@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2012']")
	public static WebElement excPurPurOrdersCloseLinksChkbox;

	@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2012']")
	public static WebElement excPurPurOrdersSaveRevisionChkbox;

	@FindBy(xpath="//label[contains(text(),'PostingDetails')]//input[@id='2012']")
	public static WebElement excPurPurOrdersShowPostingDetailsChkbox;

	@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2012']")
	public static WebElement excPurPurOrdersSuspendChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2012']")
	public static WebElement excPurPurOrdersEditExportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2012']")
	public static WebElement excPurPurOrdersEditImportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2012']")
	public static WebElement excPurPurOrdersHideMenuChkbox;

	@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2012']")
	public static WebElement excPurPurOrdersAmendChkbox;

	@FindBy(xpath="//label[contains(text(),'CustomizeLink')]//input[@id='2012']")
	public static WebElement excPurPurOrdersCustomizeLinkChkbox;

	@FindBy(xpath="//label[contains(text(),'FilterHomePage')]//input[@id='2012']")
	public static WebElement excPurPurOrdersFilterHomePageChkbox;

	@FindBy(xpath="//label[contains(text(),'Add To Stock')]//input[@id='2012']")
	public static WebElement excPurPurOrdersAddToStockChkbox;

	@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2012']")
	public static WebElement excPurPurOrdersReverseEntryChkbox;

	@FindBy(xpath="//label[contains(text(),'CustomizeInfoPanel')]//input[@id='2012']")
	public static WebElement excPurPurOrdersCustomizeInfoPanelChkbox;

	@FindBy(xpath="//label[contains(text(),'RaiseChequeReturn')]//input[@id='2012']")
	public static WebElement excPurPurOrdersRaiseChequeReturnChkbox;



	public boolean checkClickonExculsionInventoryPurchasePurchaseOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurchaeOrders));
		excPurchaeOrders.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurPurOrdersAccessChkbox));
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
			excelReader.setCellData(xlfile, xlSheetName, 162, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail: All chkbox is Displayed and is Checked" );
			excelReader.setCellData(xlfile, xlSheetName, 162, 9, resFail);
			return false;
		}
	}


	@FindBy(xpath="//div[@id='Exclusions']//li[1]//div[1]//label[1]//input[1]")
	public static WebElement excPurMRNAccessChkbox;


	@FindBy(xpath="//div[@id='Exclusions']//li[2]//div[1]//label[1]//input[1]")
	public static WebElement excPurMRNAddChkbox;

	@FindBy(xpath="//div[@id='Exclusions']//li[3]//div[1]//label[1]//input[1]")
	public static WebElement excPurMRNEditChkbox;

	@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2013']")
	public static WebElement excPurMRNDeleteChkbox;

	@FindBy(xpath="//div[@id='Exclusions']//li[5]//div[1]//label[1]//input[1]")
	public static WebElement excPurMRNPrintChkbox;

	@FindBy(xpath="//div[@id='Exclusions']//li[6]//div[1]//label[1]//input[1]")
	public static WebElement excPurMRNRePrintChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2013']")
	public static WebElement excPurMRNPrintBarcodeChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2013']")
	public static WebElement excPurMRNPrintUnAuthorizedDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2013']")
	public static WebElement excPurMRNExportChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2013']")
	public static WebElement excPurMRNEditDocumentsEnteredbyOtherChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2013']")
	public static WebElement excPurMRNEditDocumentsThatAreCheckedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2013']")
	public static WebElement excPurMRNEditReconciledDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2013']")
	public static WebElement excPurMRNEditDocumentsAuthorizationByHigherUpsChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2013']")
	public static WebElement excPurMRNEnterDocumentsThatExceedLimitChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2013']")
	public static WebElement excPurMRNChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2013']")
	public static WebElement excPurMRNEditDocumentsThatAreRePrintedChkbox;

	@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2013']")
	public static WebElement excPurMRNAccessThroughAPIChkbox;

	@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2013']")
	public static WebElement excPurMRNChangePrintLayoutChkbox;

	@FindBy(xpath="//div[@id='Exclusions']//li[19]//div[1]//label[1]//input[1]")
	public static WebElement excPurMRNAuthorizeChkbox;

	@FindBy(xpath="//label[contains(text(),'Re_ject')]//input[@id='2013']")
	public static WebElement excPurMRNRejectChkbox;

	@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2013']")
	public static WebElement excPurMRNShowHomepageChkbox;

	@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2013']")
	public static WebElement excPurMRNStopChkbox;

	@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2013']")
	public static WebElement excPurMRNModifySettingsChkbox;

	@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2013']")
	public static WebElement excPurMRNViewDocumentEnteredByOthersChkbox;

	@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2013']")
	public static WebElement excPurMRNCloseLinksChkbox;

	@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2013']")
	public static WebElement excPurMRNSaveRevisionChkbox;

	@FindBy(xpath="//label[contains(text(),'PostingDetails')]//input[@id='2013']")
	public static WebElement excPurMRNShowPostingDetailsChkbox;

	@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2013']")
	public static WebElement excPurMRNSuspendChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2013']")
	public static WebElement excPurMRNEditExportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2013']")
	public static WebElement excPurMRNEditImportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2013']")
	public static WebElement excPurMRNHideMenuChkbox;

	@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2013']")
	public static WebElement excPurMRNAmendChkbox;

	@FindBy(xpath="//label[contains(text(),'CustomizeLink')]//input[@id='2013']")
	public static WebElement excPurMRNCustomizeLinkChkbox;

	@FindBy(xpath="//label[contains(text(),'FilterHomePage')]//input[@id='2013']")
	public static WebElement excPurMRNFilterHomePageChkbox;

	@FindBy(xpath="//label[contains(text(),'Add To Stock')]//input[@id='2013']")
	public static WebElement excPurMRNAddToStockChkbox;

	@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2013']")
	public static WebElement excPurMRNReverseEntryChkbox;

	@FindBy(xpath="//label[contains(text(),'CustomizeInfoPanel')]//input[@id='2013']")
	public static WebElement excPurMRNCustomizeInfoPanelChkbox;

	@FindBy(xpath="//label[contains(text(),'Add To Stock')]//input[@id='2013']")
	public static WebElement excPurMRNRaiseChequeReturnChkbox;



	public boolean checkClickonExculsionInventoryPurchaseMaterialRecepitsNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excMaterialRecepitNotes));
		excMaterialRecepitNotes.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excPurPurOrdersAccessChkbox));
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
			excelReader.setCellData(xlfile, xlSheetName, 163, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail: All chkbox is Displayed and is Checked" );
			excelReader.setCellData(xlfile, xlSheetName, 163, 9, resFail);
			return false;
		}
	}




	@FindBy(xpath="//ul[@id='Exclmenu']//a[@id='136']//i[@class='icon-expand']")
	public static WebElement excFixedAsstExpandBtn;


	@FindBy(xpath="//li[@class='active']//a[@id='138']//i[@class='icon-expand']")
	public static WebElement excFixedAssetTransactionExpandBtn;

	@FindBy(xpath="//li[@class='active']//a[@id='50002']//span[contains(text(),'Asset Usage')]")
	public static WebElement excFixesAssetTranAssetUsageOption;






	@FindBy(xpath="//ul[@id='ExclrestrictionsDiv']")
	public static WebElement excEmptyRestrictionArea;

	@FindBy(xpath="//ul[@id='Exclmenu']//a[@id='60']//i[@class='icon-expand']")
	public static WebElement excFinExpandBtn;

	@FindBy(xpath="//li[@class='active']//a[@id='61']//i[@class='icon-expand']")
	public static WebElement excFinTransExpandBtn;

	@FindBy(xpath="//li[@class='active']//a[@id='2007']//i[@class='icon-expand']")
	public static WebElement excFinTrandPurchaseExpandBtn;

	@FindBy(xpath="//li[@class='active']//span[contains(text(),'Purchases Vouchers')]")
	public static WebElement excFinTrandPurPurchaseVoucherOption;







	public boolean checkClichOnExculsionRestrictionFiniancal() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excFinExpandBtn));
		excFinExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excFinTransExpandBtn));
		excFinTransExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excFinTrandPurchaseExpandBtn));
		excFinTrandPurchaseExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excFinTrandPurPurchaseVoucherOption));
		excFinTrandPurPurchaseVoucherOption.click();


		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excEmptyRestrictionArea));
		if (excEmptyRestrictionArea.isDisplayed()) 
		{
			System.out.println(" Pass: Restriction Area is Empty");
			excelReader.setCellData(xlfile, xlSheetName, 164, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Fail: Restriction Area is Empty");
			excelReader.setCellData(xlfile, xlSheetName, 164, 9, resFail);
			return false;
		}


	}


	public boolean checkClickOnSaveAdditionAndExculsionTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		String expMessage="Role saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 165, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 165, 9, resFail);
			return false;
		}



	}












	@FindBy(xpath="//li[@class='active']//a[@id='140']//i[@class='icon-expand']")
	public static WebElement addInventoryTransactionSalesExpansionBtn;


	@FindBy(xpath="//li[@class='active']//a[@id='2017']//span[contains(text(),'Sales Orders')]")
	public static WebElement addInvTranssSalesSlaesOrderOption;





	@FindBy(xpath="//li[@class='active']//a[@id='2012']//span[contains(text(),'Purchases Orders')]")
	public static WebElement addInvTransPurPurchaseOrderOption;




	@FindBy(xpath="//li[1]//div[1]//label[1]//input[1]")
	public static WebElement invPurAccessChkbox;


	@FindBy(xpath="//li[2]//div[1]//label[1]//input[1]")
	public static WebElement invPurAddChkbox;

	@FindBy(xpath="//li[3]//div[1]//label[1]//input[1]")
	public static WebElement invPurEditChkbox;

	@FindBy(xpath="//label[contains(text(),'Delete')]//input[@id='2012']")
	public static WebElement invPurDeleteChkbox;

	@FindBy(xpath="//li[5]//div[1]//label[1]//input[1]")
	public static WebElement invPurPrintChkbox;

	@FindBy(xpath="//li[6]//div[1]//label[1]//input[1]")
	public static WebElement invPurRePrintChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Barcode')]//input[@id='2012']")
	public static WebElement invPurPrintBarcodeChkbox;

	@FindBy(xpath="//label[contains(text(),'Print Un-Authorized documents')]//input[@id='2012']")
	public static WebElement invPurPrintUnAuthorizedDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Export')]//input[@id='2012']")
	public static WebElement invPurExportChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents entered by other')]//input[@id='2012']")
	public static WebElement invPurEditDocumentsEnteredbyOtherChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are checked')]//input[@id='2012']")
	public static WebElement invPurEditDocumentsThatAreCheckedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit Reconciled documents')]//input[@id='2012']")
	public static WebElement invPurEditReconciledDocumentsChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit documents authorization by higher ups')]//input[@id='2012']")
	public static WebElement invPurEditDocumentsAuthorizationByHigherUpsChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that exceed limit')]//input[@id='2012']")
	public static WebElement invPurEnterDocumentsThatExceedLimitChkbox;

	@FindBy(xpath="//label[contains(text(),'Enter documents that make Cash or Bank Balance Neg')]//input[@id='2012']")
	public static WebElement invPurChkboxEnterDocumentsThatMakeCashorBankBalanceNeg;

	@FindBy(xpath="//label[contains(text(),'Edit documents that are Re-Printed')]//input[@id='2012']")
	public static WebElement invPurEditDocumentsThatAreRePrintedChkbox;

	@FindBy(xpath="//label[contains(text(),'Access through API')]//input[@id='2012']")
	public static WebElement invPurAccessThroughAPIChkbox;

	@FindBy(xpath="//label[contains(text(),'Always suspend on saving')]//input[@id='2012']")
	public static WebElement invPurAlwaysSuspendOnSavingChkbox;

	@FindBy(xpath="//label[contains(text(),'Change print layout')]//input[@id='2012']")
	public static WebElement invPurChangePrintLayoutChkbox;

	@FindBy(xpath="//li[20]//div[1]//label[1]//input[1]")
	public static WebElement invPurAuthorizeChkbox;

	@FindBy(xpath="//label[contains(text(),'Reject')]//input[@id='2012']")
	public static WebElement invPurRejectChkbox;

	@FindBy(xpath="//label[contains(text(),'Show home page')]//input[@id='2012']")
	public static WebElement invPurShowHomepageChkbox;

	@FindBy(xpath="//label[contains(text(),'Stop')]//input[@id='2012']")
	public static WebElement invPurStopChkbox;

	@FindBy(xpath="//label[contains(text(),'Modify Settings')]//input[@id='2012']")
	public static WebElement invPurModifySettingsChkbox;

	@FindBy(xpath="//label[contains(text(),'View document entered by others')]//input[@id='2012']")
	public static WebElement invPurViewDocumentEnteredByOthersChkbox;

	@FindBy(xpath="//label[contains(text(),'Close Links')]//input[@id='2012']")
	public static WebElement invPurCloseLinksChkbox;

	@FindBy(xpath="//label[contains(text(),'Save Revision')]//input[@id='2012']")
	public static WebElement invPurSaveRevisionChkbox;

	@FindBy(xpath="//label[contains(text(),'Show Posting Details')]//input[@id='2012']")
	public static WebElement invPurShowPostingDetailsChkbox;

	@FindBy(xpath="//label[contains(text(),'Suspend')]//input[@id='2012']")
	public static WebElement invPurSuspendChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit exported (Sync) documents')]//input[@id='2012']")
	public static WebElement invPurEditExportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Edit imported (Sync) documents')]//input[@id='2012']")
	public static WebElement invPurEditImportedChkbox;

	@FindBy(xpath="//label[contains(text(),'Hide Menu')]//input[@id='2012']")
	public static WebElement invPurHideMenuChkbox;

	@FindBy(xpath="//label[contains(text(),'Amend')]//input[@id='2012']")
	public static WebElement invPurAmendChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize link')]//input[@id='2012']")
	public static WebElement invPurCustomizeLinkChkbox;

	@FindBy(xpath="//label[contains(text(),'Filter home page')]//input[@id='2012']")
	public static WebElement invPurFilterHomePageChkbox;

	@FindBy(xpath="//label[contains(text(),'Add to stock')]//input[@id='2012']")
	public static WebElement invPurAddToStockChkbox;

	@FindBy(xpath="//label[contains(text(),'Reverse Entry')]//input[@id='2012']")
	public static WebElement invPurReverseEntryChkbox;

	@FindBy(xpath="//label[contains(text(),'Customize info panel')]//input[@id='2012']")
	public static WebElement invPurCustomizeInfoPanelChkbox;

	@FindBy(xpath="//label[contains(text(),'Raise Cheque Return')]//input[@id='2012']")
	public static WebElement invPurRaiseChequeReturnChkbox;

	@FindBy(xpath="//input[@id='MasteroptionControl']")
	public static WebElement gridMasterAfterClick;

	@FindBy(xpath="//td[@id='restrictionEntryTable_col_2-0']")
	public static WebElement gridSecondRowRoleIndex;

	@FindBy(xpath="//td[@id='restrictionEntryTable_col_3-0']")
	public static WebElement gridThirdRowRoleIndex;

	@FindBy(xpath="//td[@id='restrictionEntryTable_col_4-0']")
	public static WebElement gridFourthRowRoleIndex;

	@FindBy(xpath="//*[contains(text(),'Delete Row')]")
	public static WebElement gridDeleteRowRoleIndex;


	@FindBy(xpath="//td[@id='restrictionEntryTable_col_1-1']")
	public static WebElement gridFirstRowMasterToClick;

	@FindBy(xpath="//td[@id='restrictionEntryTable_col_2-1']")
	public static WebElement gridSecondRowMasterToClick;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_1-2']/label/span")
	public static WebElement gridEntryFirstRowChkBox;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_1-3']/label/span")
	public static WebElement gridReportFirstRowChkBox;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_1-4']/label/span")
	public static WebElement gridViewFirstRowChkBox;


	@FindBy(xpath="//*[@id='restrictionEntryTable_col_2-2']/label/span")
	public static WebElement gridEntrySecondRowChkBox;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_2-3']/label/span")
	public static WebElement gridReportSecondRowChkBox;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_2-4']/label/span")
	public static WebElement gridViewSecondRowChkBox;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_3-2']/label/span")
	public static WebElement gridEntryThirdRowChkBox;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_3-3']/label/span")
	public static WebElement gridReportThirdRowChkBox;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_3-4']/label/span")
	public static WebElement gridViewThirdRowChkBox;


	@FindBy(xpath="//a[contains(text(),'Restriction for entry')]")
	public static WebElement createRoleRestrictionForEntryTab;

//	@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='1']")
	@FindBy(xpath="//*[@id='RestrictionEntryMasters']//li[1]")
	public static WebElement resOFEntryAccount;

	//@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='2']")
	@FindBy(xpath="//*[@id='RestrictionEntryMasters']//li[2]")
	public static WebElement resOFEntryItem;

	//@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='3']")
	@FindBy(xpath="//*[@id='RestrictionEntryMasters']//li[3]")
	public static WebElement resOFEntryDepartment;

	//@FindBy(xpath="//div[@id='RestrictionEntryMasters']//li[@id='4']")
	@FindBy(xpath="//*[@id='RestrictionEntryMasters']//li[4]")
	public static WebElement resOFEntryWarehouse;

	//@FindBy(xpath="//*[@id='RestrictionForEntry']/div/div/div[2]/div[1]/label/span")
	@FindBy(xpath="//*[@id='chkExclusion']/following-sibling::span")
	public static WebElement resOFEntryExclusionchkBox;

	@FindBy(xpath="//div[contains(text(),'Masters')]")
	public static WebElement  resOFEntryGridMasterColoumn;

	@FindBy(xpath="//table[@id='restrictionEntryTable']")
	public static WebElement  resOFEntryTable;






	public boolean checkAccountsCreationDisplayInRestrictionForEntryInSORestrictionRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.click();
		createRoleRoleNameCombo.clear();
		createRoleRoleNameCombo.sendKeys("SORestForEntryRole");

		Thread.sleep(3000);

		createRoleRoleNameCombo.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText("Numeric");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableProfileSalesOrderProfile));
		avaliableProfileSalesOrderProfile.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
		createRoleRestrictionForEntryTab.click();

		resOFEntryAccount.click();

		gridFirstRowMasterToClick.click();

		gridMasterAfterClick.sendKeys("Customer Update");

		Thread.sleep(4999);

		gridMasterAfterClick.sendKeys(Keys.TAB);

		Thread.sleep(3959);

		String getAccountSelection=gridMasterAfterClick.getAttribute("value");

		System.out.println("getAccountSelection"+getAccountSelection);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();

		Thread.sleep(2000);

		if(getAccountSelection.equalsIgnoreCase("Customer Update"))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 166, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 166, 9, resFail);
			return false;
		}

	}




	public boolean checkItemCreationDisplayInRestrictionForEntryInSORestrictionRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";



		resOFEntryItem.click();

		gridFirstRowMasterToClick.click();

		gridMasterAfterClick.sendKeys("STOCK ITEM");

		Thread.sleep(2000);

		gridMasterAfterClick.sendKeys(Keys.TAB);


		String getItemFirstSelection=gridMasterAfterClick.getAttribute("value");

		System.out.println("getAccountSelection"+getItemFirstSelection);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();

		Thread.sleep(2000);

		gridSecondRowMasterToClick.click();

		gridMasterAfterClick.sendKeys("ITEMS GROUP");

		Thread.sleep(2000);

		gridMasterAfterClick.sendKeys(Keys.TAB);

		String getItemSecondSelection=gridMasterAfterClick.getAttribute("value");

		System.out.println("getAccountSelection"+getItemSecondSelection);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
		gridEntrySecondRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
		gridReportSecondRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
		gridViewSecondRowChkBox.click();

		Thread.sleep(2000);

		if(getItemFirstSelection.equalsIgnoreCase("STOCK ITEM") && getItemSecondSelection.equalsIgnoreCase("ITEMS GROUP"))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 167, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 167, 9, resFail);
			return false;
		}

	}





	public boolean checkWarehouseCreationDisplayInRestrictionForEntryInSORestrictionRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);



		resOFEntryWarehouse.click();

		gridFirstRowMasterToClick.click();

		gridMasterAfterClick.sendKeys("HYDERABAD");

		Thread.sleep(2000);

		gridMasterAfterClick.sendKeys(Keys.TAB);

		String getAccountSelection=gridMasterAfterClick.getAttribute("value");

		System.out.println("getAccountSelection"+getAccountSelection);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();

		Thread.sleep(2000);

		if(getAccountSelection.equalsIgnoreCase("HYDERABAD"))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 168, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 168, 9, resFail);
			return false;
		}

	}




	public boolean checkClickOnSaveRestrictionEntry() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		String expMessage="Role saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 169, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 169, 9, resFail);
			return false;
		}



	}



	public boolean checkClickOnSaveRestrictionEntryWithExclusion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("SORestForEntryRoleExclusion");

		createRoleRoleNameCombo.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText("Simple Policy");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableProfileSalesOrderProfile));
		avaliableProfileSalesOrderProfile.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
		createRoleRestrictionForEntryTab.click();

		Thread.sleep(2000);

		resOFEntryAccount.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
		resOFEntryExclusionchkBox.click();

		gridFirstRowMasterToClick.click();

		gridMasterAfterClick.sendKeys("Customer Update Group");

		Thread.sleep(4999);

		gridMasterAfterClick.sendKeys(Keys.TAB);

		Thread.sleep(3959);

		String getAccountSelection=gridMasterAfterClick.getAttribute("value");

		System.out.println("getAccountSelection"+getAccountSelection);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		String expMessage="Role saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 170, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 170, 9, resFail);
			return false;
		}



	}


	public boolean checkTransactionRights() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("RoleWithAllProTransRight");

		createRoleRoleNameCombo.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText("Simple Policy");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfile));
		avaliableAllProfile.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionRightsTab));
		transactionRightsTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowBillWiseOnAccountChkBox));
		allowBillWiseOnAccountChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(budgetLimitWarningDropdown));
		Select s1=new Select(budgetLimitWarningDropdown);
		s1.selectByVisibleText("Allow");

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitWarningDropdown));
		Select s2=new Select(creditLimitWarningDropdown);
		s2.selectByVisibleText("Request Credit Limit Increase");

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(negativeCashCheckDropdown));
		Select s3=new Select(negativeCashCheckDropdown);
		s3.selectByVisibleText("Allow");


		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(negativeStockCheckDropdown));
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

		doNotAllowMasterCustomization.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		String expMessage="Role saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 171, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 171, 9, resFail);
			return false;
		}

	}



	public boolean checkEditAndUpdateRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("SORestForEntryRoleExclusion");

		Thread.sleep(3000);

		createRoleRoleNameCombo.sendKeys(Keys.TAB);

		Thread.sleep(3000);

		createRoleRestrictionForEntryTab.click();

		Thread.sleep(2000);

		gridSecondRowMasterToClick.click();

		gridMasterAfterClick.sendKeys("Customer C");

		Thread.sleep(2000);

		gridMasterAfterClick.sendKeys(Keys.TAB);

		String getItemSecondSelection=gridMasterAfterClick.getAttribute("value");

		System.out.println("getAccountSelection"+getItemSecondSelection);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
		gridEntrySecondRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
		gridReportSecondRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
		gridViewSecondRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		String expMessage="Role updated Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 172, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 172, 9, resFail);
			return false;
		}



	}


	public boolean checkUpdatedRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("SORestForEntryRoleExclusion");

		Thread.sleep(4000);

		createRoleRoleNameCombo.sendKeys(Keys.TAB);


		Thread.sleep(3000);

		createRoleRestrictionForEntryTab.click();

		Thread.sleep(2000);

		gridSecondRowMasterToClick.click();

		gridMasterAfterClick.click();

		String getItemSecondSelection=gridMasterAfterClick.getAttribute("value");

		System.out.println("getAccountSelection"+getItemSecondSelection);

		Thread.sleep(2000);

		if(getItemSecondSelection.equalsIgnoreCase("Customer C"))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 173, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 173, 9, resFail);
			return false;
		}

	}


	public boolean checkDeleteRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
		createRoleCloseIcon.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securitymenu));
		securitymenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMenu));
		createRoleMenu.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.click();

		Thread.sleep(3000);

		createRoleRoleNameCombo.clear();

		createRoleRoleNameCombo.sendKeys("RoleForDelete");

		Thread.sleep(3000);

		createRoleRoleNameCombo.sendKeys(Keys.TAB);

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText("Simple Policy");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfile));
		avaliableAllProfile.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		errorMessageCloseBtn.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys("RoleForDelete");

		Thread.sleep(3000);

		createRoleRoleNameCombo.sendKeys(Keys.TAB);

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
			excelReader.setCellData(xlfile, xlSheetName, 174, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  displayed message as Are you Sure want to Delete with Yes and No buttons");
			excelReader.setCellData(xlfile, xlSheetName, 174, 9, resFail);
			return false;
		}
	}


	public boolean  checkNoOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getDriver().switchTo().alert().dismiss();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));


		createRoleRoleNameCombo.click();
		String actRoleName=createRoleRoleNameCombo.getAttribute("value");
		String expRoleName="RoleForDelete";

		if (actRoleName.equalsIgnoreCase(expRoleName))
		{
			System.out.println(" Pass: SalesAccessAPIProfile is Not Deleted Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 175, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: SalesAccessAPIProfile is Not Deleted Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 175, 9, resFail);
			return false;
		}



	}



	public boolean SelectagainandClickonDeleteRoleButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));


		createRoleRoleNameCombo.click();

		Thread.sleep(2000);

		createRoleRoleNameCombo.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleDeleteIcon));
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
			excelReader.setCellData(xlfile, xlSheetName, 176, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  displayed message as Are you Sure want to Delete ");
			excelReader.setCellData(xlfile, xlSheetName, 176, 9, resFail);
			return false;
		}
	}




	public boolean checkYesOptioninDeleteRolePopMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		getDriver().switchTo().alert().accept();

		String expMessage="Role Successfully deleted..";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println(" Pass: SalesAccessAPIProfile is Deleted Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 177, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail: SalesAccessAPIProfile is Deleted Successfull");
			excelReader.setCellData(xlfile, xlSheetName, 177, 9, resFail);
			return false;
		}
	}






	public static boolean checkCloseButtonInRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
		createRoleCloseIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));

		if(labelDashboard.isDisplayed() && selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() &&
				dashboardCustomizationSettings.isDisplayed())
		{
			System.out.println("Pass");
			excelReader.setCellData(xlfile, xlSheetName, 178, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Fail");
			excelReader.setCellData(xlfile, xlSheetName, 178, 9, resFail);
			return false;
		}

	}





	@FindBy(xpath="//select[@id='passwordPolicy']//option[6]")
	public static WebElement getNumericValue;


	@FindBy(xpath="//select[@id='language']")
	public static WebElement getLanguage;


	@FindBy(xpath="//select[@id='altLanguage']")
	public static WebElement getAltLanguage;


	//CreateUser

	//Edit

	//Restriction For Entry


	//Restriction with Exclusion


	//Delete



	@FindBy(xpath="//span//span[contains(text(),'UserAllOptions')]")
	public static WebElement getSaveUserName;

	public boolean checkCreateUserWithPurchaseINVFARole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserWithPurchaseFAINV");

		//Selected Role As select Role as PurchaseINVAndFA

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserWithPurchaseFAINV");
		createUserLoginAbbrivationTxt.sendKeys("UWP");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("vasu@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="new user created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: UserWithAccDisable Create Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 205, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 205, 9, resFail);
			return false;
		}



	}



	public boolean checkRestrictionOfEntryTabInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		 

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		createUserRestrictionforentryTab.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountMaster));
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
			excelReader.setCellData(xlfile, xlSheetName, 206, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 206, 9, resFail);
			return false;
		}
	}



	public boolean checkCreateUserWithAccPOTransRight() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		 

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
		createUserUserInformationTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserAccPOTransRestrictions");

		//Selected Role As select Role as PurchaseINVAndFA

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN);
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);

		//Password length should be equal or greater than minimum password length 3
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserPOTransRestrictions");
		createUserLoginAbbrivationTxt.sendKeys("UPOR");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("dhana@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		createUserRestrictionforentryTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryAccount));
		resOFEntryAccount.click();

		gridFirstRowMasterToClick.click();

		gridMasterAfterClick.sendKeys("Customer Update");

		Thread.sleep(4999);

		gridMasterAfterClick.sendKeys(Keys.TAB);

		Thread.sleep(3959);

		String getAccountSelection=gridMasterAfterClick.getAttribute("value");

		System.out.println("getAccountSelection"+getAccountSelection);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();

		Thread.sleep(2000);

		gridSecondRowMasterToClick.click();

		gridMasterAfterClick.sendKeys("Customer Update Group");

		Thread.sleep(2000);

		gridMasterAfterClick.sendKeys(Keys.TAB);

		String getAccountSecondSelection=gridMasterAfterClick.getAttribute("value");

		System.out.println("getAccountSecondSelection"+getAccountSecondSelection);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
		gridEntrySecondRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
		gridReportSecondRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
		gridViewSecondRowChkBox.click();

		Thread.sleep(2000);

		if(getAccountSelection.equalsIgnoreCase("Customer Update") && getAccountSecondSelection.equalsIgnoreCase("Customer Update Group"))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="new user created successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserWithAccDisable Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 207, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 207, 9, resFail);
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
	public static WebElement UserAccPOTransRestrictionsOption;

	@FindBy (xpath="//td[@id='restrictionEntryTable_col_1-0']")
	public static WebElement gridRow1;

	@FindBy (xpath="//div[contains(text(),'Delete Row')]")
	public static WebElement deleteRowBtn;

	@FindBy (xpath="//td[@id='restrictionEntryTable_col_3-1']")
	public static WebElement gridThirdRowMasterToClick;

	@FindBy (xpath="//td[@id='restrictionEntryTable_col_4-1']")
	public static WebElement gridFourthRowMasterToClick;

	@FindBy (xpath="//td[@id='restrictionEntryTable_col_5-1']")
	public static WebElement gridFifthRowMasterToClick;


	public boolean checkDeleteRowInInResOfEntryInCreatedUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		 

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));
		createUserSearchTxt.click();
		createUserSearchTxt.sendKeys("useraccpo");

		Thread.sleep(3000);

		UserAccPOTransRestrictionsOption.click();

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		createUserRestrictionforentryTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRow1));
		gridRow1.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
		deleteRowBtn.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		gridSecondRowMasterToClick.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridMasterAfterClick));
		gridMasterAfterClick.click();

		Thread.sleep(3000);
		String SecondGridTxt=gridMasterAfterClick.getAttribute("value");
		Thread.sleep(3000);
		System.out.println(SecondGridTxt);

		/*Thread.sleep(3000);
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridThirdRowMasterToClick));
		 	gridThirdRowMasterToClick.click();
		 	Thread.sleep(3000);
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridMasterAfterClick));             // To check Logic
		 	gridMasterAfterClick.click();
		 	Thread.sleep(3000);
		 	 String ThirdGridTxt=gridMasterAfterClick.getAttribute("value");

		 	System.out.println(ThirdGridTxt);*/


		if (SecondGridTxt.equalsIgnoreCase("Customer Update Group")) 
		{
			System.out.println(" Pass: Delete Row Successfully");
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="User updated successfully.";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserWithAccDisable Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 208, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 208, 9, resFail);
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
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserItemPOTransRestrictions");

		//Selected Role As select Role as PurchaseINVAndFA

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN);
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);

		//Password length should be equal or greater than minimum password length 3
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserPOTransRestrictions");
		createUserLoginAbbrivationTxt.sendKeys("UPOR");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("sai@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();



		Thread.sleep(2000);

		if(getItemSelection.equalsIgnoreCase("BATCH BR ITEM"))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="new user created successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserWithAccDisable Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 209, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 209, 9, resFail);
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
	public static WebElement UserItemPOTransRestrictionsOption;






	public boolean checkAddRowInResOfEntryInCreatedUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));
		createUserSearchTxt.click();
		createUserSearchTxt.sendKeys("UserItemPOTransRestrictions");

		Thread.sleep(3000);

		UserItemPOTransRestrictionsOption.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		createUserRestrictionforentryTab.click();

		Thread.sleep(2000);

		gridSecondRowMasterToClick.click();

		gridMasterAfterClick.sendKeys("BATCH FIFO ITEM");

		Thread.sleep(2000);

		gridMasterAfterClick.sendKeys(Keys.TAB);

		String getItemSecondSelection=gridMasterAfterClick.getAttribute("value");

		System.out.println("getAccountSecondSelection"+getItemSecondSelection);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
		gridEntrySecondRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
		gridReportSecondRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
		gridViewSecondRowChkBox.click();

		if (getItemSecondSelection.equalsIgnoreCase("BATCH FIFO ITEM")) 
		{
			System.out.println(" Pass:  Row  Addded Successfully");
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="User updated successfully.";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserWithAccDisable Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 210, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 210, 9, resFail);
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
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserItemPOExclusion");

		//Selected Role As select Role as PurchaseINVAndFA

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN);
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);

		//Password length should be equal or greater than minimum password length 3
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserItemPOExclusion");
		createUserLoginAbbrivationTxt.sendKeys("UIPOE");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("rathod@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();



		Thread.sleep(2000);

		if(getItemSelection.equalsIgnoreCase("BIN FINISHED GOODS ITEM") && resOFEntryExclusionchkBox.isSelected())
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="new user created successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserWithAccDisable Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 211, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 211, 9, resFail);
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
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserWithAccDisableRole");

		//Selected Role As SORestForEntryRole

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.TAB);

		//Password length should be equal or greater than minimum password length 3
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserWithAccDisableRole");
		createUserLoginAbbrivationTxt.sendKeys("UAD");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("raki@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		Thread.sleep(3000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountDisableChkbox));
		accountDisableChkbox.click();

		Thread.sleep(3000);

		if (accountDisableChkbox.isSelected())
		{

			System.out.println(" Pass: Account Disable ChkBox iS Chked  ");
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="new user created successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserWithAccDisable Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 212, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 212, 9, resFail);
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
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserWithDNotLock");

		//Selected Role As select Role as SORestForEntryRole

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.sendKeys("Alpha Numeric Special Star with all options");
		createUserPasswordPolicyDropdown.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("UserWithDNotLock@4");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("UserWithDNotLock@4");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserWithDNotLock");
		createUserLoginAbbrivationTxt.sendKeys("UWDL");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();
		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("teja@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotLockAccountChkBox));
		doNotLockAccountChkBox.click();

		Thread.sleep(2000);

		if (doNotLockAccountChkBox.isSelected())
		{

			System.out.println(" Pass: Do Not Lock  ChkBox Is Checked ");
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="new user created successfullyUser role is Restricted for change password screen,Cant change password after login";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserWithDNotLock Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 213, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 213, 9, resFail);
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
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserWithAllowMulLogin");

		//Selected Role As select Role as SORestForEntryRoleExclusion,

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys("SORestForEntryRoleExclusion");
		createUserERPRoleDropDown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("sss");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("sss");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserWithAllowMulLogin");
		createUserLoginAbbrivationTxt.sendKeys("UWAML");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("sudheer@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(multipleLoginChkbox));
		multipleLoginChkbox.click();



		Thread.sleep(2000);
		String act=createUserUserTypeDrpDwn.getAttribute("value");
		String exp="2";

		Thread.sleep(2000);

		if (multipleLoginChkbox.isSelected() && act.equalsIgnoreCase(exp))
		{

			System.out.println(" Pass: Multiple Login  ChkBox Is Checked And User Type is Selected As Customer ");

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="new user created successfully";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserWithAllowMulLogin Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 214, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 214, 9, resFail);
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
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserSendEmailLoginSuccess");

		//Selected Role As select Role as SORestForEntryRoleExclusion,

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys("SORestForEntryRoleExclusion");
		createUserERPRoleDropDown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.sendKeys("Alpha Numeric Special Star with all options");
		createUserPasswordPolicyDropdown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("UserSendEmailLoginSuccess@4");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("UserSendEmailLoginSuccess@4");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserSendEmailLoginSuccess");
		createUserLoginAbbrivationTxt.sendKeys("USELS");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("sudheer@focussoftnet.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailNotificationChkbox));
		sendEmailNotificationChkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailUserOnLoginSuccessChkbox));
		emailUserOnLoginSuccessChkbox.click();

		Thread.sleep(2000);

		String act=createUserUserTypeDrpDwn.getAttribute("value");
		String exp="2";


		if (sendEmailNotificationChkbox.isSelected() && emailUserOnLoginSuccessChkbox.isSelected() && act.equalsIgnoreCase(exp))
		{

			System.out.println(" Pass: Send Email Notification  ChkBox Is Checked And User Type is Selected As Customer ");

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="new user created successfullyUser role is Restricted for change password screen,Cant change password after login";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserSendEmailLoginSuccess Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 215, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 215, 9, resFail);
				return false;
			}

		}
		else
		{
			System.out.println(" Fail: Do Not Lock  ChkBox Is Checked ");
			return false;
		}
	}


/*	@FindBy(xpath="//*[@id='additionalInfo']/div/div/div[2]/div[5]/label/span")*/
					
 //   @FindBy(xpath="//*[id='additionalInfo']/div/div/div[2]/div[3]/div[1]/label/span")
	@FindBy(xpath="//*[@id='chkAccDisabled']/following-sibling::span")
	
 
	public static WebElement accountDisableChkbox;	
	

	//@FindBy(xpath="//input[@id='chklockAcc']")//*[@id="additionalInfo"]/div/div/div[2]/div[3]/div[2]/label/span
	@FindBy(xpath="//*[@id='chklockAcc']/following-sibling::span")
	public static WebElement doNotLockAccountChkBox;

	//@FindBy(xpath="//*[@id='additionalInfo']/div/div/div[2]/div[3]/div[3]/label/span")
	@FindBy(xpath="//*[@id='chkMultiLogin']/following-sibling::span")
	public static WebElement multipleLoginChkbox;

	//@FindBy(xpath="//*[@id='additionalInfo']/div/div/div[2]/div[3]/div[4]/label/span")
	@FindBy(xpath="//*[@id='chkEmailnoti']/following-sibling::span")
	public static WebElement sendEmailNotificationChkbox;

	//@FindBy(xpath="//*[@id='additionalInfo']/div/div/div[2]/div[3]/div[5]/label/span")
	@FindBy(xpath="//*[@id='chkLoginSuccess']/following-sibling::span")
	public static WebElement emailUserOnLoginSuccessChkbox;

	//@FindBy(xpath="//*[@id='additionalInfo']/div/div/div[2]/div[3]/div[6]/label/span")
	@FindBy(xpath="//*[@id='chkLoginFailure']/following-sibling::span")
	public static WebElement emailOnLoginFaliureChkbox;


	@FindBy(xpath="//input[@id='fromDate_checkbox']")
	public static WebElement resTabFromDateChkBox;

	@FindBy(xpath="//input[@id='toDate_checkbox']")
	public static WebElement resTabToDateChkBox;

	@FindBy(xpath="//input[@id='startDate_checkbox']")
	public static WebElement resTabWorkingHoursFromChkbox;

	@FindBy(xpath="//input[@id='endDate_checkbox']")
	public static WebElement resTabWorkingHoursToChkbox;

	

	public boolean checkCreateUserWithSendEmailNotificationonLoginFailure() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserSendEmailLoginFailure");

		//Selected Role As select Role as SORestForEntryRoleExclusion

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys("SORestForEntryRoleExclusion");
		createUserERPRoleDropDown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.sendKeys("Alpha Numeric Special Star with all options");
		createUserPasswordPolicyDropdown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("UserSendEmailLoginFailure@4");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("UserSendEmailLoginFailure@4");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserSendEmailLoginFailure");
		createUserLoginAbbrivationTxt.sendKeys("USELF");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("testfail@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailNotificationChkbox));
		sendEmailNotificationChkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailOnLoginFaliureChkbox));
		emailOnLoginFaliureChkbox.click();

		Thread.sleep(2000);

		String act=createUserUserTypeDrpDwn.getAttribute("value");
		String exp="2";


		Thread.sleep(2000);

		if (sendEmailNotificationChkbox.isSelected() && emailOnLoginFaliureChkbox.isSelected() && act.equalsIgnoreCase(exp))
		{

			System.out.println(" Pass: Send Email Notification  ChkBox Is Checked And User Type is Selected As Customer ");

			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="new user created successfullyUser role is Restricted for change password screen,Cant change password after login";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserSendEmailLoginFailure Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 216, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 216, 9, resFail);
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
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
		createUserUserInformationTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserBlockWithTime");

		//Selected Role As select Role as RoleWithAllProTransRight

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys("RoleWithAllProTransRight");
		createUserERPRoleDropDown.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("susu");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("susu");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserBlockWithTime");
		createUserLoginAbbrivationTxt.sendKeys("UBWT");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("Test@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionsTab));
		createUserRestrictionsTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resTabFromDateChkBox));
		if (resTabFromDateChkBox.isDisplayed() && resTabToDateChkBox.isDisplayed() && resTabWorkingHoursToChkbox.isDisplayed()
				&& resTabWorkingHoursFromChkbox.isDisplayed()&&resTabSelectAllChkbox.isDisplayed()&&resTabMondayChkbox.isDisplayed()
				&& resTabTuesdayChkbox.isDisplayed() && resTabWednesdayChkbox.isDisplayed() && resTabThursdaychkbox.isDisplayed()
				&& resTabFridayChkbox.isDisplayed() && resTabSaturdayChkbox.isDisplayed()&& resTabDomainTxt.isDisplayed()
				&& resTabDomainNameTxtArea.isDisplayed()) 
		{
			System.out.println(" Pass: Dispalyed Resttriction Tab ");
			excelReader.setCellData(xlfile, xlSheetName, 217, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 217, 9, resFail);
			return false;
		}

	}



	@FindBy(xpath="//input[@id='startTime']")
	public static WebElement startTimeTxt;


	@FindBy(xpath="//input[@id='endTime']")
	public static WebElement EndTimeTxt;


	public boolean  checkCurrentTimewithLessThanCurrentTimeInRestrictionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		startTimeTxt.click();

		startTimeTxt.sendKeys(Keys.LEFT,Keys.LEFT);
		startTimeTxt.sendKeys("180000");

		Thread.sleep(3000);

		EndTimeTxt.sendKeys(Keys.LEFT,Keys.LEFT);
		EndTimeTxt.sendKeys("172500");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Working Hours End time can not be less than Start time.";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: UserBlockWithDate Create Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 218, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 218, 9, resFail);
			return false;
		}


	}



	@FindBy(xpath="//input[@id='endDate']")
	public static WebElement endDateTxt;


	public boolean  checkwithMoreThanCurrentTimeInRestrictionTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startTimeTxt));
		startTimeTxt.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startTimeTxt));
		startTimeTxt.sendKeys(Keys.LEFT,Keys.LEFT);
		startTimeTxt.sendKeys("180000");

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EndTimeTxt));
		EndTimeTxt.sendKeys(Keys.LEFT,Keys.LEFT);
		EndTimeTxt.sendKeys("182500");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resTabWorkingHoursToChkbox));
		resTabWorkingHoursToChkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resTabWorkingHoursFromChkbox));
		resTabWorkingHoursFromChkbox.click();

		String Currentdate=endDateTxt.getAttribute("value");
		System.out.println(Currentdate);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="new user created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: UserBlockWithTime Create Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 219, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 219, 9, resFail);
			return false;
		}


	}


	public boolean checkCreateGroup() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCreateGroupIcon));
		createUserCreateGroupIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Please provide the group name";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println(" Pass: Add Edit Master Profile Profile is Saved Succesfully");
			excelReader.setCellData(xlfile, xlSheetName, 220, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 220, 9, resFail);
			return false;
		}	
	}

	public boolean CheckCreateGroupWithGroupName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserGroup");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Please assign role for this group";

		String actMessage=checkValidationMessage(expMessage);

		String LoginName=createUserLoginNameTxt.getAttribute("value");

		if (actMessage.equalsIgnoreCase(expMessage) && LoginName.equalsIgnoreCase("UserGroup")) 
		{
			System.out.println(" Pass:Create Group With Group Name");
			excelReader.setCellData(xlfile, xlSheetName, 221, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 221, 9, resFail);
			return false;
		}	


	}




	public boolean CheckCreateGroupWithMandatoryFileds() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.click();
		createUserERPRoleDropDown.sendKeys("PurchaseINVAndFA");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="New group created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println(" Pass:  New Group Created Succesfully");
			excelReader.setCellData(xlfile, xlSheetName, 222, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 222, 9, resFail);
			return false;
		}	


	}




	@FindBy (xpath="//span//span[contains(text(),'UserGroup')]")
	public static WebElement UserGroupOption; 


	public boolean checkCreationOFUserUnderCreatedGroup() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));
		createUserSearchTxt.click();
		createUserSearchTxt.sendKeys("UserGroup");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UserGroupOption));
		UserGroupOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserUGChangePassword");

		//Selected Role As select Role as PurchaseINVAndFA

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys("PurchaseINVAndFA");
		createUserERPRoleDropDown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.sendKeys("Simple With Cannot Change Password");
		createUserPasswordPolicyDropdown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("ss");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("ss");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserUGChangePassword");
		createUserLoginAbbrivationTxt.sendKeys("UUGCP");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();

		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("iii@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="new user created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: UserUnderGroup Create Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 223, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 223, 9, resFail);
			return false;
		}
	}



	@FindBy (xpath="//span//span[contains(text(),'UserForDelete')]")
	public static WebElement UserForDeleteOption; 


	public boolean checkDeleteInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UserGroupOption));
		UserGroupOption.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserForDelete");

		//Selected Role As select Role as PurchaseINVAndFA

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys("PurchaseINVAndFA");
		createUserERPRoleDropDown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("12345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserForDelete");
		createUserLoginAbbrivationTxt.sendKeys("UUG");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("erp@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		errorMessageCloseBtn.click();

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));
		createUserSearchTxt.click();
		createUserSearchTxt.sendKeys("UserForDelete");

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
			excelReader.setCellData(xlfile, xlSheetName, 224, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  displayed message as Are you Sure want to Delete with Yes and No buttons");
			excelReader.setCellData(xlfile, xlSheetName, 224, 9, resFail);
			return false;
		}


	}


	public boolean  checkNoOptionInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getDriver().switchTo().alert().dismiss();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.click();

		String actUserName=createUserNameTxt.getAttribute("value");
		String expUserName="UserForDelete";

		if (actUserName.equalsIgnoreCase(expUserName))
		{
			System.out.println(" Pass: UserForDelete is Not Deleted Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 225, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: UserForDelete is Not Deleted Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 225, 9, resFail);
			return false;
		}



	}



	public boolean SelectagainUserandClickonDeleteButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleDeleteIcon));
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
			excelReader.setCellData(xlfile, xlSheetName, 226, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  displayed message as Are you Sure want to Delete ");
			excelReader.setCellData(xlfile, xlSheetName, 226, 9, resFail);
			return false;
		}
	}




	public boolean checkYesOptioninDeleteUserPopMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getDriver().switchTo().alert().accept();

		String expMessage="User is deleted successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println(" Pass: UserForDelete is Deleted Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 227, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail: UserForDelete is Deleted Successfull");
			excelReader.setCellData(xlfile, xlSheetName, 227, 9, resFail);
			return false;
		}
	}



	@FindBy(xpath="//li[@id='1']")
	public static WebElement AccountMaster;

	@FindBy(xpath="//li[@id='2']")
	public static WebElement ItemMaster;

	@FindBy(xpath="//li[@id='3']")
	public static WebElement DepartmentMaster;

	@FindBy(xpath="//li[@id='4']")
	public static WebElement WarehouseMaster;

	@FindBy(xpath="//li[@id='5']")
	public static WebElement CostCentreMaster;

	@FindBy(xpath="//li[@id='6']")
	public static WebElement LocationMaster;

	@FindBy(xpath="//li[@id='7']")
	public static WebElement RegionMaster;

	@FindBy(xpath="//li[@id='8']")
	public static WebElement CountryMaster;

	@FindBy(xpath="//li[@id='9']")
	public static WebElement StateMaster;

	@FindBy(xpath="//li[@id='10']")
	public static WebElement CityMaster;

	@FindBy(xpath="//li[@id='11']")
	public static WebElement UnitsMaster;

	@FindBy(xpath="//li[@id='12']")
	public static WebElement BinsMaster;

	@FindBy(xpath="//li[@id='13']")
	public static WebElement TaxCodeMaster;

	@FindBy(xpath="//li[@id='300']")
	public static WebElement PlantMaster;

	@FindBy(xpath="//li[@id='301']")
	public static WebElement SupplyAreaMaster;

	@FindBy(xpath="//li[@id='302']")
	public static WebElement MaintanceParameterMaster;

	@FindBy(xpath="//li[@id='303']")
	public static WebElement SafetyInstructionsMaster;

	@FindBy(xpath="//li[@id='304']")
	public static WebElement CapacityMaster;

	@FindBy(xpath="//li[@id='305']")
	public static WebElement WorkCentreMaster;

	@FindBy(xpath="//li[@id='306']")
	public static WebElement holidayMaster;

	@FindBy(xpath="//li[@id='307']")
	public static WebElement ProcessMaster;

	@FindBy(xpath="//li[@id='500']")
	public static WebElement QcFailureREsonMaster;

	@FindBy(xpath="//li[@id='501']")
	public static WebElement QCParametersMaster;

	@FindBy(xpath="//li[@id='600']")
	public static WebElement InsurenceMaster;

	@FindBy(xpath="//li[@id='601']")
	public static WebElement FixedAssetMaster;

	@FindBy(xpath="//li[@id='700']")
	public static WebElement BreakDownStandedReasonMaster;

	@FindBy(xpath="//li[@id='800']")
	public static WebElement EmployeeMaster;

	@FindBy(xpath="//li[@id='801']")
	public static WebElement DesigniationMaster;

	@FindBy(xpath="//li[@id='802']")
	public static WebElement PositionMaster;

	@FindBy(xpath="//li[@id='803']")
	public static WebElement QualificationMaster;

	@FindBy(xpath="//li[@id='804']")
	public static WebElement SpecializationMaster;

	@FindBy(xpath="//li[@id='805']")
	public static WebElement NationalityMaster;

	@FindBy(xpath="//li[@id='806']")
	public static WebElement SkillTypeMaster;

	@FindBy(xpath="//li[@id='807']")
	public static WebElement SkillMaster;

	@FindBy(xpath="//li[@id='808']")
	public static WebElement SourceTypeMaster;

	@FindBy(xpath="//li[@id='809']")
	public static WebElement SourceMaster;

	@FindBy(xpath="//li[@id='810']")
	public static WebElement RoundTypeMaster;

	@FindBy(xpath="//li[@id='811']")
	public static WebElement GradeMaster;

	@FindBy(xpath="//li[@id='812']")
	public static WebElement ScaleMaster;

	@FindBy(xpath="//li[@id='813']")
	public static WebElement CourseTypeMaster;

	@FindBy(xpath="//li[@id='814']")
	public static WebElement CourseMaster;

	@FindBy(xpath="//li[@id='815']")
	public static WebElement TranierMaster;

	@FindBy(xpath="//li[@id='816']")
	public static WebElement AirlineSectorMaster;

	@FindBy(xpath="//li[@id='817']")
	public static WebElement VenueMaster;

	@FindBy(xpath="//li[@id='818']")
	public static WebElement RequestTypesMaster;

	@FindBy(xpath="//li[@id='819']")
	public static WebElement ExpenceClaimsMaster;

	@FindBy(xpath="//li[@id='820']")
	public static WebElement EmpoloyeeBankMaster;

	@FindBy(xpath="//li[@id='821']")
	public static WebElement TravelAgentMaster;

	@FindBy(xpath="//li[@id='822']")
	public static WebElement JobGradeMaster;

	@FindBy(xpath="//li[@id='1100']")
	public static WebElement OutletMaster;

	@FindBy(xpath="//li[@id='1101']")
	public static WebElement CounterMaster;

	@FindBy(xpath="//li[@id='1102']")
	public static WebElement MemberTypeMaster;

	@FindBy(xpath="//li[@id='1103']")
	public static WebElement GiftVoucherDefMaster;

	@FindBy(xpath="//li[@id='1104']")
	public static WebElement CategoryMaster;

	@FindBy(xpath="//li[@id='1105']")
	public static WebElement BankCardTypeMaster;

	@FindBy(xpath="//li[@id='1106']")
	public static WebElement MemberMaster;

	@FindBy(xpath="//li[@id='1107']")
	public static WebElement DiscountVoucherDefMaster;

	@FindBy(xpath="//li[@id='1108']")
	public static WebElement FloorMaster;

	@FindBy(xpath="//li[@id='1109']")
	public static WebElement SectionMaster;

	@FindBy(xpath="//li[@id='1110']")
	public static WebElement TableMaster;

	@FindBy(xpath="//li[@id='1111']")
	public static WebElement GuestMaster;

	@FindBy(xpath="//li[@id='1112']")
	public static WebElement VoidRemarksMaster;

	@FindBy(xpath="//li[@id='1113']")
	public static WebElement MemberCardDefMaster;

	@FindBy(xpath="//li[@id='1114']")
	public static WebElement ReturnRemarksMaster;

	@FindBy(xpath="//li[@id='1115']")
	public static WebElement KichenDisplaySystemMaster;

	@FindBy(xpath="//li[@id='1116']")
	public static WebElement DeliveryTimeIntervalMaster;

	@FindBy(xpath="//li[@id='1117']")
	public static WebElement EpaymentMaster;	

	@FindBy(xpath="//td[@id='restrictionEntryTable_col_1-1']")
	public static WebElement gridMasterToClick;





	public boolean checkCreateUserRestrictionForEntryAccountsReportAndView() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserWithAccRestrictionsReportView");

		//Selected Role As select Role as SLALRole

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.sendKeys("SampleRole1");
		createUserERPRoleDropDown.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.click();
		Select Password=new Select(createUserPasswordPolicyDropdown);
		Password.selectByVisibleText("Alpha Numeric Special Star with all options");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("Test@123456789");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("Test@123456789");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("UserWithAccRestrictionsReportView");
		createUserLoginAbbrivationTxt.sendKeys("UWARRV");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN,Keys.END,Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("iiiiizzzz@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		createUserRestrictionforentryTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountMaster));
		AccountMaster.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridMasterToClick));
		gridMasterToClick.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridMasterAfterClick));
		gridMasterAfterClick.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridMasterAfterClick));
		gridMasterAfterClick.sendKeys("vendor");

		Thread.sleep(2000);

		gridMasterAfterClick.sendKeys(Keys.ENTER);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));

		if (gridEntryFirstRowChkBox.isSelected()&&gridReportFirstRowChkBox.isSelected()&& gridViewFirstRowChkBox.isDisplayed()) 
		{
			System.out.println(" Pass: The check Boxes in the Grid Are Checked ");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage="new user created successfullyUser role is Restricted for change password screen,Cant change password after login";

			String actMessage=checkValidationMessage(expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				System.out.println("Pass: UserWithAccRestrictions Create Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 228, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println(" Fail: UserForDelete is Not Deleted Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 228, 9, resFail);
				return false;
			}


		}
		else 
		{
			System.out.println(" Fail: The check Boxes in the Grid Are Checked ");
			excelReader.setCellData(xlfile, xlSheetName, 228, 9, resFail);
			return false;
		}
	}










	@FindBy(xpath="//span[contains(text(),'UserWithPurchaseFAINV')]")
	public static WebElement loadUserWithPurchaseFAINV;

	@FindBy(xpath="//span[contains(text(),'UserAccPOTransRestrictions')]")
	public static WebElement loadUserAccPOTransRestrictions;

	@FindBy(xpath="//span[contains(text(),'UserItemPOTransRestrictions')]")
	public static WebElement loadUserItemPOTransRestrictions;

	@FindBy(xpath="//span[contains(text(),'UserItemPOExclusion')]")
	public static WebElement loadUserItemPOExclusion;

	@FindBy(xpath="//span[contains(text(),'UserWithAccDisableRole')]")
	public static WebElement loadUserWithAccDisableRole;

	@FindBy(xpath="//span[contains(text(),'UserWithDNotLock')]")
	public static WebElement loadUserWithDNotLock;

	@FindBy(xpath="//span[contains(text(),'UserWithAllowMulLogin')]")
	public static WebElement loadUserWithAllowMulLogin;

	@FindBy(xpath="//span[contains(text(),'UserSendEmailLoginSuccess')]")
	public static WebElement loadUserSendEmailLoginSuccess;

	@FindBy(xpath="//span[contains(text(),'UserSendEmailLoginFailure')]")
	public static WebElement loadUserSendEmailLoginFailure;

	@FindBy(xpath="//span[contains(text(),'UserBlockWithTime')]")
	public static WebElement loadUserBlockWithTime;

	@FindBy(xpath="//span[contains(text(),'UserUGChangePassword')]")
	public static WebElement createUserUGChangePassword;

	@FindBy(xpath="//input[@id='searchUserLoadUsertxtBox']")
	public static WebElement createUserloadSearchTxt;

	@FindBy(xpath="//button[contains(text(),'Load')]")
	public static WebElement CreateUserloadLoadBtn;

	@FindBy(xpath="//div[@id='LoadForm']//button[@class='Fbutton'][contains(text(),'Cancel')]")
	public static WebElement createUserloadCancelBtn;

	@FindBy(xpath="//div[@id='LoadForm']//button[@class='close'][contains(text(),'×')]')]")
	public static WebElement loadCloseIcon;

	@FindBy(xpath="//i[@class='icon-load-from icon-font6 ImagesinArabic']")
	public static WebElement createUserLoadIcon;


	@FindBy(xpath="//div[@id='controlBtns']")
	public static WebElement createUserCancelButton;

	public boolean checkCreateUseWithLoadFromUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoadIcon));
		createUserLoadIcon.click();


		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadUserWithPurchaseFAINV));

		if (loadUserWithPurchaseFAINV.isDisplayed() && loadUserAccPOTransRestrictions.isDisplayed() && loadUserWithDNotLock.isDisplayed()&& 
				loadUserWithAllowMulLogin.isDisplayed() && loadUserSendEmailLoginSuccess.isDisplayed()&& loadUserItemPOTransRestrictions.isDisplayed() && 
				loadUserBlockWithTime.isDisplayed() && loadUserItemPOExclusion.isDisplayed() && loadUserWithAccDisableRole.isDisplayed() && 
				loadUserSendEmailLoginSuccess.isDisplayed() && loadUserSendEmailLoginFailure.isDisplayed() && createUserUGChangePassword.isDisplayed() && 
				createUserloadCancelBtn.isDisplayed() && createUserloadSearchTxt.isDisplayed() && CreateUserloadLoadBtn.isDisplayed() && 
				createUserLoadIcon.isDisplayed()) 
		{
			System.out.println(" Pass: display Load From the Create User Screen with all saved users");

			excelReader.setCellData(xlfile, xlSheetName, 229, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println(" Fail: UserForDelete is Not Deleted Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 229, 9, resFail);

			return false;
		}
	}



	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]")
	public static WebElement getLoadUser;

	public boolean checkSelectionOfUserInLoadFromButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


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
			excelReader.setCellData(xlfile, xlSheetName, 230, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 230, 9, resFail);
			return false;
		}

	}







	public boolean checkSaveUserWithLoadFromAsNameMandatory()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Please Provide Username";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass: Should Provide User Name ");
			excelReader.setCellData(xlfile, xlSheetName, 231, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 231, 9, resFail);
			return false;
		}

	}



	public boolean checkSaveUserWithLoadFromAsEmail()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserWithLoadOption");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Email id already assign toUserPOTransRestrictions";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass: Should Provide User Name ");
			excelReader.setCellData(xlfile, xlSheetName, 232, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 232, 9, resFail);
			return false;
		}

	}


	public boolean checkSaveUserWithLoadFrom()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";



		createUserAdditionalInfoTab.click();

		createUserEmailTxt.click();
		createUserEmailTxt.clear();
		createUserEmailTxt.sendKeys("UserWithLoadOption@gmail.com");

		Thread.sleep(3000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="new user created successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass: Should Provide User Name ");
			excelReader.setCellData(xlfile, xlSheetName, 233, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 233, 9, resFail);
			return false;
		}

	}





	//Password Policy Validation in Create User

	public boolean CheckPasswordPolicyForSimpleinCraeteUserScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.click();
		createUserLoginNameTxt.sendKeys("Password");

		// Selected Role As select Role as AllProfiles

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.click();
		createUserERPRoleDropDown.sendKeys("SampleRole1");
		createUserERPRoleDropDown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.click();
		Select Password = new Select(createUserPasswordPolicyDropdown);
		Password.selectByVisibleText("Simple Policy");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys("12");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys("12");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys("Password");
		createUserLoginAbbrivationTxt.sendKeys("Password");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.click();
		createUserSecurityQuestionDropDown.sendKeys(Keys.ARROW_DOWN, Keys.END, Keys.ARROW_UP);
		createUserSecurityAnswerTxt.sendKeys("blue");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys("tyu@gmail.com");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user = new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText("Customer");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Password length should be equal or greater than minimum password length 3";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: Simple Policy ");
			excelReader.setCellData(xlfile, xlSheetName, 234, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:Simple Policy ");
			excelReader.setCellData(xlfile, xlSheetName, 234, 9, resFail);
			return false;
		}


	}





	public boolean checkAlphabetsWithDontallowPrevious() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
		createUserUserInformationTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.click();
		Select Password = new Select(createUserPasswordPolicyDropdown);
		Password.selectByVisibleText("Alphabets with Dont allow Previous as Three");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.clear();
		createUserPasswordTxt.sendKeys("1234");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.clear();
		createUserConfirmPasswordTxt.sendKeys("1234");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Only alphabets can be given in password.";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: Alphabets with Dont allow Previous as Three ");
			excelReader.setCellData(xlfile, xlSheetName, 235, 9, resPass);
			return true;
		} else {
			System.out.println("Fail:Alphabets with Dont allow Previous as Three ");
			excelReader.setCellData(xlfile, xlSheetName, 235, 9, resFail);
			return false;
		}


	}





	public boolean checkAlphabetsWithNumeric() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException	
	{





		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(5000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.click();

		Thread.sleep(2000);


		Select Password = new Select(createUserPasswordPolicyDropdown);
		Password.selectByVisibleText("Alphabets With Numeric");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.clear();
		createUserPasswordTxt.sendKeys("!@#$");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.clear();
		createUserConfirmPasswordTxt.sendKeys("!@#$");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Alphabets and numerics must be given in the password.";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: Alphabets With Numeric ");
			excelReader.setCellData(xlfile, xlSheetName, 236, 9, resPass);
			return true;
		} else {
			System.out.println("Fail: Alphabets With Numeric ");
			excelReader.setCellData(xlfile, xlSheetName, 236, 9, resFail);
			return false;
		}


	}





	public boolean checkAlphabetsWithNumericStar() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException	
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.click();
		Select Password = new Select(createUserPasswordPolicyDropdown);
		Password.selectByVisibleText("Alphabets With Numeric Star");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.clear();
		createUserPasswordTxt.sendKeys("as!@#");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.clear();
		createUserConfirmPasswordTxt.sendKeys("as!@#");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Alphabets and numerics but atleast 1 lower case and 1 upper case alphabet must be given in the password.";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: Alphabets With Numeric Star ");
			excelReader.setCellData(xlfile, xlSheetName, 237, 9, resPass);
			return true;
		} else {
			System.out.println("Fail: Alphabets With Numeric Star ");
			excelReader.setCellData(xlfile, xlSheetName, 237, 9, resFail);
			return false;
		}


	}





	public boolean checkNumeric() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.click();
		Select Password = new Select(createUserPasswordPolicyDropdown);
		Password.selectByVisibleText("Numeric");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.clear();
		createUserPasswordTxt.sendKeys("focus");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.clear();
		createUserConfirmPasswordTxt.sendKeys("focus");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Only numerics can be given in password.";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: Numeric ");
			excelReader.setCellData(xlfile, xlSheetName, 238, 9, resPass);
			return true;
		} else {
			System.out.println("Fail: Numeric ");
			excelReader.setCellData(xlfile, xlSheetName, 238, 9, resFail);
			return false;
		}


	}




	public boolean checkAlphaNumericSpecial() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.click();
		Select Password = new Select(createUserPasswordPolicyDropdown);
		Password.selectByVisibleText("Alpha Numeric Special");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.clear();
		createUserPasswordTxt.sendKeys("1234567");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.clear();
		createUserConfirmPasswordTxt.sendKeys("1234567");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Password must contain alphabets, numerics and special characters.";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: Alpha Numeric Special ");
			excelReader.setCellData(xlfile, xlSheetName, 239, 9, resPass);
			return true;
		} else {
			System.out.println("Fail: Alpha Numeric Special ");
			excelReader.setCellData(xlfile, xlSheetName, 239, 9, resFail);
			return false;
		}


	}





	public boolean checkAlphaNumericSpecialStarWithAllOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.click();
		Select Password = new Select(createUserPasswordPolicyDropdown);
		Password.selectByVisibleText("Alpha Numeric Special Star with all options");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.clear();
		createUserPasswordTxt.sendKeys("12345678912345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.clear();
		createUserConfirmPasswordTxt.sendKeys("12345678912345");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Alphabets, numerics and special characters but atleast 1 lower case and 1 upper case alphabet must be given in the password.";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: Alpha Numeric Special Star with all options ");
			excelReader.setCellData(xlfile, xlSheetName, 240, 9, resPass);
			return true;
		} else {
			System.out.println("Fail: Alpha Numeric Special Star with all options ");
			excelReader.setCellData(xlfile, xlSheetName, 240, 9, resFail);
			return false;
		}


	}





	public boolean checkSimpleWithCannotChangePassword() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.click();

		Select Password = new Select(createUserPasswordPolicyDropdown);
		Password.selectByVisibleText("Simple With Cannot Change Password");


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.clear();
		createUserPasswordTxt.sendKeys("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.clear();
		createUserConfirmPasswordTxt.sendKeys("1");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="Password length should be equal or greater than minimum password length 2";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass: Simple With Cannot Change Password");
			excelReader.setCellData(xlfile, xlSheetName, 241, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail: Simple With Cannot Change Password ");
			excelReader.setCellData(xlfile, xlSheetName, 241, 9, resFail);
			return false;
		}


	}






	@FindBy(xpath="//input[@id='searchUsertxtBox']")
	public static WebElement createUserSearchTxt;

	@FindBy(xpath="//div[@id='38']//span//span[contains(text(),'UserWithProRestrictions')]")
	public static WebElement usersAndGruopsAreaRoleOfUserWithProRestrictions;

	@FindBy(xpath="//span[contains(text(),'Reset')]")
	public static WebElement craeteUserResetIcon;



	//Check Reset Option


	public boolean checkResetOptionInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.sendKeys("UserWithProRes");

		//Selected Role As select Role as simpleRole1
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.click();
		createUserERPRoleDropDown.sendKeys("samplerole1");
		createUserERPRoleDropDown.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordPolicyDropdown));
		createUserPasswordPolicyDropdown.click();
		Select Password=new Select(createUserPasswordPolicyDropdown);
		Password.selectByVisibleText("Alpha Numeric Special Star with all options");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
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
				excelReader.setCellData(xlfile, xlSheetName, 242, 9, resPass);
				return true;
			}
			else 
			{
				System.out.println(" Fail: Reset Option in Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 242, 9, resFail);
				return false;
			}
		} 
		else 
		{
			System.out.println(" Fail:  Confirm Password is Entered As Password");
			excelReader.setCellData(xlfile, xlSheetName, 242, 9, resFail);
			return false;
		}
	}




	//Check Move User



	public boolean checkMoveOptionWithoutSelctionOfUserInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMoveUserIcon));
		createUserMoveUserIcon.click();

		String expMessage="Please select any user";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass:User Option in Create User");
			excelReader.setCellData(xlfile, xlSheetName, 243, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail: User Option in Create User ");
			excelReader.setCellData(xlfile, xlSheetName, 243, 9, resFail);
			return false;
		}
	}












	@FindBy(xpath = "//span//span[contains(text(),'UserWithPurchaseFAINV')]")
	public static WebElement createusersUserWithPurchaseFAINVOption;

	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[2]/span[1]")
	public static WebElement moveUserUserGroup;

	@FindBy(xpath="//h4[contains(text(),'Move User')]")
	public static WebElement moveUserLabel;


	@FindBy(xpath="//button[contains(text(),'Move')]")
	public static WebElement moveUserMoveBtn;


	@FindBy(xpath="//div[@id='LoadGroups']//button[@class='Fbutton'][contains(text(),'Cancel')]")
	public static WebElement moveUserCancelBtn;



	public boolean checkMovePageWithSelectingUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCancelIcon));
		createUserCancelIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));
		createUserSearchTxt.click();

		createUserSearchTxt.clear();

		Thread.sleep(2000);

		createUserSearchTxt.sendKeys("UserWithPurchaseFAINV");


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createusersUserWithPurchaseFAINVOption));
		createusersUserWithPurchaseFAINVOption.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMoveUserIcon));
		createUserMoveUserIcon.click();

		Thread.sleep(3000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(moveUserUserGroup));
		if (moveUserUserGroup.isDisplayed() && moveUserLabel.isDisplayed() && 
				moveUserMoveBtn.isDisplayed() && 
				moveUserCancelBtn.isDisplayed()) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 244, 9, resPass);
			return true;

		}
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 244, 9, resFail);
			return false;
		}
	}



	public boolean checkMovePageClickOnMoveWithoutSelectionOfGroup() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(moveUserMoveBtn));

		moveUserMoveBtn.click();

		String expMessage="Select any group to move user";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("Pass:User Option in Create User");
			excelReader.setCellData(xlfile, xlSheetName, 245, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail: User Option in Create User ");
			excelReader.setCellData(xlfile, xlSheetName, 245, 9, resFail);
			return false;
		}

	}



	@FindBy(xpath = "//span//span[contains(text(),'UserGroup ')]")
	public static WebElement createusersUserGroupOption;



	public boolean checkMoveUserWitSelectingUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(moveUserUserGroup));
		moveUserUserGroup.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(moveUserMoveBtn));
		moveUserMoveBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));
		createUserSearchTxt.click();

		createUserSearchTxt.clear();

		createUserSearchTxt.sendKeys("UserWithPurchaseFAINV");

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createusersUserWithPurchaseFAINVOption));
		createusersUserWithPurchaseFAINVOption.click();


		if (createusersUserGroupOption.isDisplayed()) 
		{
			System.out.println(" Pass :PurchaseFAINV is Succesfully Moves into UserGroup");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));
			createUserSearchTxt.clear();



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCancelIcon));
			createUserCancelIcon.click();

			excelReader.setCellData(xlfile, xlSheetName, 246, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println(" Fail :PurchaseFAINV is Succesfully Moves into UserGroup");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));
			createUserSearchTxt.clear();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCancelIcon));
			createUserCancelIcon.click();

			excelReader.setCellData(xlfile, xlSheetName, 246, 9, resFail);
			return false;
		}

	}




	public boolean checkEditUserWithAddPhoto() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));


		createUserSearchTxt.click();

		Thread.sleep(4000);

		createUserSearchTxt.sendKeys("UserAccPOTransRestrictions");

		Thread.sleep(3000);

		UserAccPOTransRestrictionsOption.click();

		Thread.sleep(3000);

		createUserAddOrEditPhoto.click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\createUserPhoto.exe");

		Thread.sleep(3000);

		if(getCreateUserAddPhoto.isDisplayed())
		{
			excelReader.setCellData(xlfile, xlSheetName, 247, 9, resPass);
			return true;	
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 247, 9, resFail);
			return false;
		}

	}


	public boolean checkEditUserWithAddSignature() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		createUserSignaturePhoto.click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\createUserSignIn.exe");


		Thread.sleep(3000);

		if(getCreateSignnatureAddPhoto.isDisplayed())
		{

			excelReader.setCellData(xlfile, xlSheetName, 248, 9, resPass);
			return true;

		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 248, 9, resFail);
			return false;
		}

	}




	public boolean checkSaveUserWithAddPhotoAndSignature()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		String expMessage="User updated successfully.";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass: Should Provide User Name ");
			excelReader.setCellData(xlfile, xlSheetName, 249, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 249, 9, resFail);
			return false;
		}

	}


	public boolean checkEditAndCheckUserWithAddPhotoAndAddSignature() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));
		createUserSearchTxt.click();
		createUserSearchTxt.sendKeys("UserAccPOTransRestrictions");

		Thread.sleep(2000);

		UserAccPOTransRestrictionsOption.click();

		Thread.sleep(2000);

		System.out.println(getCreateUserAddPhoto.isDisplayed());
		System.out.println(getCreateSignnatureAddPhoto.isDisplayed());


		if(getCreateUserAddPhoto.isDisplayed() && getCreateSignnatureAddPhoto.isDisplayed())
		{
			excelReader.setCellData(xlfile, xlSheetName, 250, 9, resPass);
			return true;	
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 250, 9, resFail);
			return false;
		}

	}



	public boolean checkCloseOptionInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{



		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
		createUserCloseIcon.click();


		if(labelDashboard.isDisplayed() && selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() &&
				dashboardCustomizationSettings.isDisplayed())
		{
			System.out.println("Pass");
			excelReader.setCellData(xlfile, xlSheetName, 251, 9, resPass);

			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			userNameDisplay.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
			return true;
		}
		else
		{
			System.out.println("Fail");
			excelReader.setCellData(xlfile, xlSheetName, 251, 9, resFail);

			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			userNameDisplay.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
			return false;
		}
	}


	@FindBy(xpath="//span[contains(text(),'UserWithDelete')]")
	public static WebElement createusersAreaUserWithDeleteOption;


	@FindBy(xpath="//span//span[contains(text(),'UserWithAccDisable')]")
	public static WebElement createusersAreaUserWithAccDisableOption;


	@FindBy(xpath="//input[@id='loginName']")
	public static WebElement groupNameTxt;


	@FindBy(xpath="//select[@id='timezone']")
	public static WebElement createUserSelectTimeZoneDropdown;


	@FindBy(xpath="//span//span[contains(text(),'UserWithGroup')]")
	public static WebElement createusersAreaUserWithGroupOption;





	//Create Profile All Checkboxes

	@FindBy(xpath="//ul[@id='restrictionsDiv']/li//input")
	public static List<WebElement> createProfileRestrictionsChkBoxCount;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Access']/parent::label/input")
	public static WebElement createProfileAccessChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Delete']/parent::label/input")
	public static WebElement createProfileDeleteChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Add']/parent::label/input")
	public static WebElement createProfileAddChkBox;

	@FindBy(xpath="//*[@id='restrictionsDiv']/li[3]/label/span")
	public static WebElement createProfileEditChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Print']/parent::label/input")
	public static WebElement createProfilePrintChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Re-Print']/parent::label/input")
	public static WebElement createProfileRePrintChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Print Barcode']/parent::label/input")
	public static WebElement createProfilePrintBarcodeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Print Un-Authorized documents']/parent::label/input")
	public static WebElement createProfilePrintUnAuthorizedDocumentsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Export']/parent::label/input")
	public static WebElement createProfileExportChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit documents entered by other']/parent::label/input")
	public static WebElement createProfileEditDocumentsEnteredByOtherChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit Reconciled documents']/parent::label/input")
	public static WebElement createProfileEditReconciledDocumentsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit documents authorization by higher ups']/parent::label/input")
	public static WebElement createProfileEditDocumentsAuthorizationByHigherUpsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Enter documents that exceed limit']/parent::label/input")
	public static WebElement createProfileEnterDocumentsThatExceedLimitChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Enter documents that make Cash or Bank Balance Negative']/parent::label/input")
	public static WebElement createProfileEnterDocumentsThatMakeCashOrBankBalanceNegativeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit documents that are Re-Printed']/parent::label/input")
	public static WebElement createProfileEditDocumentsThatAreRePrintedChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Access through API']/parent::label/input")
	public static WebElement createProfileAccessThroughAPIChkBox;

	@FindBy(xpath="//*[@id='restrictionsDiv']/li[18]/label/span")
	public static WebElement createProfileAlwaysSuspendOnSavingChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Change print layout']/parent::label/input")
	public static WebElement createProfileChangePrintLayoutChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Authorize']/parent::label/input")
	public static WebElement createProfileAuthorizeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Re_ject']/parent::label/input")
	public static WebElement createProfileRejectChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Show home page']/parent::label/input")
	public static WebElement createProfileShowHomepageChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Stop']/parent::label/input")
	public static WebElement createProfileStopChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Modify Settings']/parent::label/input")
	public static WebElement createProfileModifySettingsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='View document entered by others']/parent::label/input")
	public static WebElement createProfileViewDocumentsEnteredByOthersChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Close Links']/parent::label/input")
	public static WebElement createProfileCloseLinksChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Save Revision']/parent::label/input")
	public static WebElement createProfileSaveRevisionChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Show Posting Details']/parent::label/input")
	public static WebElement createProfileShowPostingDetailsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Suspend']/parent::label/input")
	public static WebElement createProfileSuspendChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit exported (Sync) documents']/parent::label/input")
	public static WebElement createProfileEditExportedSyncDocumentsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit imported (Sync) documents']/parent::label/input")
	public static WebElement createProfileEditImportedSyncDocumentsChkBox;

	@FindBy(xpath="//*[@id='restrictionsDiv']/li[32]/label/span")
	public static WebElement createProfileHideMenuChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Amend']/parent::label/input")
	public static WebElement createProfileAmendChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Customize link']/parent::label/input")
	public static WebElement createProfileCustomizeLinkChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Filter home page']/parent::label/input")
	public static WebElement createProfileFilterHomePageChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Add to stock']/parent::label/input")
	public static WebElement createProfileAddToStockChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Reverse Entry']/parent::label/input")
	public static WebElement createProfileReverseEntryChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Customize info panel']/parent::label/input")
	public static WebElement createProfileCustomizeInfoPanelChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Raise Cheque Return']/parent::label/input")
	public static WebElement createProfileRaiseChequeReturnChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Delete documents created by others']/parent::label/input")
	public static WebElement createProfileDeleteDocumentsCreatedByOthersChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Delete authorized documents']/parent::label/input")
	public static WebElement createProfileDeleteAuthorizedDocumentsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit Suspended Documents']/parent::label/input")
	public static WebElement createProfileEditSuspendedDocumentsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Save']/parent::label/input")
	public static WebElement createProfileSaveChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Accept']/parent::label/input")
	public static WebElement createProfileAcceptChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Hold']/parent::label/input")
	public static WebElement createProfileHoldChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Send']/parent::label/input")
	public static WebElement createProfileSendChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Move To Inbox']/parent::label/input")
	public static WebElement createProfileMoveToInboxChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Move To Outbox']/parent::label/input")
	public static WebElement createProfileMoveToOutboxChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Import']/parent::label/input")
	public static WebElement createProfileImportChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='View']/parent::label/input")
	public static WebElement createProfileViewChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='EditUsersCrOthers']/parent::label/input")
	public static WebElement createProfileEditUsersCrOthersChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Unlock Users']/parent::label/input")
	public static WebElement createProfileUnlockUsersChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Search']/parent::label/input")
	public static WebElement createProfileSearchChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Email report']/parent::label/input")
	public static WebElement createProfileEmailReportChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit print layout']/parent::label/input")
	public static WebElement createProfileEditPrintLayoutChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='View customized layout']/parent::label/input")
	public static WebElement createProfileViewCustomizedLayoutChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Add customized layout']/parent::label/input")
	public static WebElement createProfileAddCustomizedLayoutChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Email']/parent::label/input")
	public static WebElement createProfileEmailChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='ViewGraph']/parent::label/input")
	public static WebElement createProfileViewGraphChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Filter']/parent::label/input")
	public static WebElement createProfileFilterChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Analyze']/parent::label/input")
	public static WebElement createProfileAnalyzeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='AddAnalyzeReport']/parent::label/input")
	public static WebElement createProfileAddAnalyzeReportChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Back Track']/parent::label/input")
	public static WebElement createProfileBackTrackChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='CrossRefrence']/parent::label/input")
	public static WebElement createProfileCrossRefrenceChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Copy']/parent::label/input")
	public static WebElement createProfileCopyChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Customize View']/parent::label/input")
	public static WebElement createProfileCustomizeViewChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Sort']/parent::label/input")
	public static WebElement createProfileSortChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Mass Update']/parent::label/input")
	public static WebElement createProfileMassUpdateChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Transfer']/parent::label/input")
	public static WebElement createProfileTransferChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Properties']/parent::label/input")
	public static WebElement createProfilePropertiesChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Ledger']/parent::label/input")
	public static WebElement createProfileLedgerChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Budgets']/parent::label/input")
	public static WebElement createProfileBudgetsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Help']/parent::label/input")
	public static WebElement createProfileHelpChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Create Tree']/parent::label/input")
	public static WebElement createProfileCreateTreeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit View']/parent::label/input")
	public static WebElement createProfileEditViewChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Delete View']/parent::label/input")
	public static WebElement createProfileDeleteViewChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Select View']/parent::label/input")
	public static WebElement createProfileSelectViewChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Select Tree']/parent::label/input")
	public static WebElement createProfileSelectTreeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Clone']/parent::label/input")
	public static WebElement createProfileCloneChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Add Group']/parent::label/input")
	public static WebElement createProfileAddGroupChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Group Master']/parent::label/input")
	public static WebElement createProfileGroupMasterChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Set Type']/parent::label/input")
	public static WebElement createProfileSetTypeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Delete All']/parent::label/input")
	public static WebElement createProfileDeleteAllChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Move Up']/parent::label/input")
	public static WebElement createProfileMoveUpChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Move Do_wn']/parent::label/input")
	public static WebElement createProfileMoveDownChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Credit Management']/parent::label/input")
	public static WebElement createProfileCreditManagementChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Department Appropriation']/parent::label/input")
	public static WebElement createProfileDepartmentAppropriationChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Customize Tree']/parent::label/input")
	public static WebElement createProfileCustomizeTreeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Customize Master']/parent::label/input")
	public static WebElement createProfileCustomizeMasterChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Can Change Group']/parent::label/input")
	public static WebElement createProfileCanChangeGroupChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Can Navigate']/parent::label/input")
	public static WebElement createProfileCanNavigateChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Add Info Panel']/parent::label/input")
	public static WebElement createProfileAddInfoPanelChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit Info Panel']/parent::label/input")
	public static WebElement createProfileEditInfoPanelChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='View Info Panel']/parent::label/input")
	public static WebElement createProfileViewInfoPanelChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='DeleteInfoPanel']/parent::label/input")
	public static WebElement createProfileDeleteInfoPanelChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='SetDefaultTree']/parent::label/input")
	public static WebElement createProfileSetDefaultTreeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Modifier']/parent::label/input")
	public static WebElement createProfileModifierChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit Tree']/parent::label/input")
	public static WebElement createProfileEditTreeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Authorization Info']/parent::label/input")
	public static WebElement createProfileAuthorizationInfoChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Alternate']/parent::label/input")
	public static WebElement createProfileAlternateChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Related']/parent::label/input")
	public static WebElement createProfileRelatedChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Open Close']/parent::label/input")
	public static WebElement createProfileOpenCloseChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='CloseProduct']/parent::label/input")
	public static WebElement createProfileCloseProductChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Adv Master Import/Export']/parent::label/input")
	public static WebElement createProfileAdvMasterImportOrExportChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='New Set']/parent::label/input")
	public static WebElement createProfileNewSetChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='General']/parent::label/input")
	public static WebElement createProfileGeneralChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Setting']/parent::label/input")
	public static WebElement createProfileSettingChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Details']/parent::label/input")
	public static WebElement createProfileDetailsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Print Layout']/parent::label/input")
	public static WebElement createProfilePrintLayoutChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Tree Tab']/parent::label/input")
	public static WebElement createProfileTreeTabChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Tree Tab Delete']/parent::label/input")
	public static WebElement createProfileTreeTabDeleteChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Document Tab']/parent::label/input")
	public static WebElement createProfileDocumentTabChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Create Tab']/parent::label/input")
	public static WebElement createProfileCreateTabChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='DeleteTree']/parent::label/input")
	public static WebElement createProfileDeleteTreeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='CreateView']/parent::label/input")
	public static WebElement createProfileCreateViewChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Capacity']/parent::label/input")
	public static WebElement createProfileCapacityChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='HR Details']/parent::label/input")
	public static WebElement createProfileHRDetailsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Routing Values']/parent::label/input")
	public static WebElement createProfileRoutingValuesChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Exempt Calculation']/parent::label/input")
	public static WebElement createProfileExemptCalculationChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Contact Details']/parent::label/input")
	public static WebElement createProfileContactDetailsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Other Details']/parent::label/input")
	public static WebElement createProfileOtherDetailsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Card Details']/parent::label/input")
	public static WebElement createProfileCardDetailsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='KYC']/parent::label/input")
	public static WebElement createProfileKYCChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Pole Display']/parent::label/input")
	public static WebElement createProfilePoleDisplayChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Cash Drawer']/parent::label/input")
	public static WebElement createProfileCashDrawerChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Weighing Scale']/parent::label/input")
	public static WebElement createProfileWeighingScaleChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Personal Information']/parent::label/input")
	public static WebElement createProfilePersonalInformationChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Dependant Detail']/parent::label/input")
	public static WebElement createProfileDependantDetailChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Educational Qualifications']/parent::label/input")
	public static WebElement createProfileEducationalQualificationsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Hike Info']/parent::label/input")
	public static WebElement createProfileHikeInfoChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Salary Info']/parent::label/input")
	public static WebElement createProfileSalaryInfoChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Depreciation']/parent::label/input")
	public static WebElement createProfileDepreciationChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Accounting Links']/parent::label/input")
	public static WebElement createProfileAccountingLinksChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Insurance Details']/parent::label/input")
	public static WebElement createProfileInsuranceDetailsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Maintenance']/parent::label/input")
	public static WebElement createProfileMainrenanceChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit documents that are checked']/parent::label/input")
	public static WebElement createProfileEditDocumentsThatAreCheckedChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Post']/parent::label/input")
	public static WebElement createProfilePostChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Custo_mize']/parent::label/input")
	public static WebElement createProfileCustomizeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Dismiss']/parent::label/input")
	public static WebElement createProfileDismissChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='ToggleBRS']/parent::label/input")
	public static WebElement createProfileToggleBRSChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='ToggleClearedBRS']/parent::label/input")
	public static WebElement createProfileToggleClearedBRSChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='MissMatchedEntries']/parent::label/input")
	public static WebElement createProfileMissMatchedEntriesChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Average rate']/parent::label/input")
	public static WebElement createProfileAverageRateChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Recent sales and purchase']/parent::label/input")
	public static WebElement createProfileRecentSalesAndPurchaseChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Balance by warehouse']/parent::label/input")
	public static WebElement createProfileBalanceByWarehouseChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Selling and buying rates']/parent::label/input")
	public static WebElement createProfileSellingAndBuyingRatesChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Confirm']/parent::label/input")
	public static WebElement createProfileConfirmChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Send for Auth']/parent::label/input")
	public static WebElement createProfileSendForAuthChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Consolidated budget']/parent::label/input")
	public static WebElement createProfileConsolidatedBudgetChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='PostDepreciation']/parent::label/input")
	public static WebElement createProfilePostDepreciationChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Create variant']/parent::label/input")
	public static WebElement createProfileCreateVariantChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Delete variant']/parent::label/input")
	public static WebElement createProfileDeleteVariantChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Exploded BOM']/parent::label/input")
	public static WebElement createProfileExplodedBOMChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Copy BOM']/parent::label/input")
	public static WebElement createProfileCopyBOMChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Authorise']/parent::label/input")
	public static WebElement createProfileAuthoriseChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='AuthoriseAndPropagate']/parent::label/input")
	public static WebElement createProfileAuthoriseAndPropagateChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Select Member by Code']/parent::label/input")
	public static WebElement createProfileSelectMemberByCodeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Select Member by Name']/parent::label/input")
	public static WebElement createProfileSelectMemberByNameChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Select Member by Telephone']/parent::label/input")
	public static WebElement createProfileSelectMemberByTelephoneChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Advanced Search Member']/parent::label/input")
	public static WebElement createProfileAdvancedSearchMemberChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Clear Member']/parent::label/input")
	public static WebElement createProfileClearMemberChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Create Member']/parent::label/input")
	public static WebElement createProfileCreateMemberChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Quick Create Member']/parent::label/input")
	public static WebElement createProfileQuickCreateMemberChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='View Member']/parent::label/input")
	public static WebElement createProfileViewMemberChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit Member']/parent::label/input")
	public static WebElement createProfileEditMemberChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Home Delivery']/parent::label/input")
	public static WebElement createProfileHomeDeliveryChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Select Item by Code']/parent::label/input")
	public static WebElement createProfileSelectItemByCodeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Select Item by Name']/parent::label/input")
	public static WebElement createProfileSelectItemByNameChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Advanced Search Item']/parent::label/input")
	public static WebElement createProfileAdvancedSearchItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Create Item']/parent::label/input")
	public static WebElement createProfileCreateItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Quick Create Item']/parent::label/input")
	public static WebElement createProfileQuickCreateItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='View Item']/parent::label/input")
	public static WebElement createProfileViewItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit Item']/parent::label/input")
	public static WebElement createProfileEditItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Add Item Comment']/parent::label/input")
	public static WebElement createProfileAddItemCommentChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Substitute Item']/parent::label/input")
	public static WebElement createProfileSubstituteItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Related Item']/parent::label/input")
	public static WebElement createProfileRelatedItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Schemes List for selected Item']/parent::label/input")
	public static WebElement createProfileSchemesListForSelectedItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Edit Line Item']/parent::label/input")
	public static WebElement createProfileEditLineItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Delete Line Item']/parent::label/input")
	public static WebElement createProfileDeleteLineItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Change Quantity']/parent::label/input")
	public static WebElement createProfileChangeQuantityChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Discount Line Item']/parent::label/input")
	public static WebElement createProfileDiscountLineItemChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Cancel Transaction']/parent::label/input")
	public static WebElement createProfileCancelTransactionChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Hold Transaction']/parent::label/input")
	public static WebElement createProfileHoldTransactionChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Recall Transaction']/parent::label/input")
	public static WebElement createProfileRecallTransactionChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Void Transaction']/parent::label/input")
	public static WebElement createProfileVoidTransactionChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Search Transaction by Member']/parent::label/input")
	public static WebElement createProfileSearchTransactionByMemberChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Search Transaction by Date']/parent::label/input")
	public static WebElement createProfileSearchTransactionByDateChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Search Transaction by Receipt']/parent::label/input")
	public static WebElement createProfileSearchTransactionByReceiptChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Advanced Search Transaction']/parent::label/input")
	public static WebElement createProfileAdvancedSearchTransactionChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Exchange/Spoilage/Normal']/parent::label/input")
	public static WebElement createProfileExchangeOrSpoilageOrNormalChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Cash In']/parent::label/input")
	public static WebElement createProfileCashInChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Cash Out']/parent::label/input")
	public static WebElement createProfileCashOutChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Cash Collection']/parent::label/input")
	public static WebElement createProfileCashCollectionChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Reprint Receipt/Bill']/parent::label/input")
	public static WebElement createProfileReprintReceiptOrBillChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Open – Day In']/parent::label/input")
	public static WebElement createProfileOpenDayInChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Close – Day End']/parent::label/input")
	public static WebElement createProfileCloseDayEndChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Sales Return by Receipt']/parent::label/input")
	public static WebElement createProfileSalesReturnByReceiptChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Sales Return by Member']/parent::label/input")
	public static WebElement createProfileSalesReturnByMemberChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Home Delivery Feedback']/parent::label/input")
	public static WebElement createProfileHomeDeliveryFeedbackChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Home Delivery Picklist']/parent::label/input")
	public static WebElement createProfileHomeDeliveryPicklistChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Internet Link']/parent::label/input")
	public static WebElement createProfileInternetLinkChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Bill Settlement']/parent::label/input")
	public static WebElement createProfileBillSettelmentChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Bill Settlement - Cash']/parent::label/input")
	public static WebElement createProfileBillSettelmentCashChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Bill Settlement - Credit Card']/parent::label/input")
	public static WebElement createProfileBillSettelmentCreditCardChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Bill Settlement - Debit Card']/parent::label/input")
	public static WebElement createProfileBillSettelmentDebitCardChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Bill Settlement - Cheque']/parent::label/input")
	public static WebElement createProfileBillSettelmentChequeChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Bill Settlement - Gift Voucher']/parent::label/input")
	public static WebElement createProfileBillSettelmentGiftVoucherChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Unit conversion']/parent::label/input")
	public static WebElement createProfileUnitConversionChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Units']/parent::label/input")
	public static WebElement createProfileUnitsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Classification']/parent::label/input")
	public static WebElement createProfileClassificationChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Replenishment']/parent::label/input")
	public static WebElement createProfileReplenishmentChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Reorder']/parent::label/input")
	public static WebElement createProfileReOrderChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']//span[text()='Outlet']/parent::label/input")
	public static WebElement createProfileOutletChkBox;



	//Home 



	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[1]/a/span")
	public static WebElement createProfileMenuHomeMastersAccount;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[2]/a/span")
	public static WebElement createProfileMenuHomeMastersCurrency;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[3]/a/span")
	public static WebElement createProfileMenuHomeMastersItem;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[4]/a/span")
	public static WebElement createProfileMenuHomeMastersSchemes;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[5]/a/span")
	public static WebElement createProfileMenuHomeMastersMRP;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[6]/a/span")
	public static WebElement createProfileMenuHomeMastersQC;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[7]/a/span")
	public static WebElement createProfileMenuHomeMastersMaintainance;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[8]/a/span")
	public static WebElement createProfileMenuHomeMastersPointOfSale;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[9]/a/span")
	public static WebElement createProfileMenuHomeMastersPayroll;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[10]/a/span")
	public static WebElement createProfileMenuHomeMastersDepartment;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[11]/a/span")
	public static WebElement createProfileMenuHomeMastersWarehouse;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[12]/a/span")
	public static WebElement createProfileMenuHomeMastersCostCenter;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[13]/a/span")
	public static WebElement createProfileMenuHomeMastersLoaction;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[14]/a/span")
	public static WebElement createProfileMenuHomeMastersRegion;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[15]/a/span")
	public static WebElement createProfileMenuHomeMastersCountry;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[16]/a/span")
	public static WebElement createProfileMenuHomeMastersState;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[17]/a/span")
	public static WebElement createProfileMenuHomeMastersCity;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[18]/a/span")
	public static WebElement createProfileMenuHomeMastersBins;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[19]/a/span")
	public static WebElement createProfileMenuHomeMastersInsurance;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[20]/a/span")
	public static WebElement createProfileMenuHomeMastersFixedAssets;

	@FindBy(xpath="//ul[@id='Profilemenu']/li[1]/ul/li[3]/ul/li[21]/a/span")
	public static WebElement createProfileMenuHomeMastersTaxCode;

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[3]")
	public static WebElement createProfileLoadFromIcon;

	@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li")
	public static List<WebElement> createProfileHomeToolButtons;




	// Create Profile Starts here

	public boolean checkCreateProfilePageWithAllOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfile));
		createProfile.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));

		int actcount = createProfileHomeToolButtons.size();
		int expCount = 6;


		ArrayList<String> buttons = new ArrayList<String>();

		for (int i = 0; i < actcount; i++) 
		{
			String data = createProfileHomeToolButtons.get(i).getText();

			buttons.add(data);
		}

		String actButtons = buttons.toString();

		String expButtons = excelReader.getCellData(xlSheetName, 6, 7);

		System.out.println("actCreateProfileHomeToolButtons  : "+actButtons);
		System.out.println("expCreateProfileHomeToolButtons  : "+expButtons);

		excelReader.setCellData(xlfile, xlSheetName, 6, 8, actButtons);

		if (actcount == expCount) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 5, 9, resPass);

			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 5, 9, resFail);

			return false;
		}

	}



	@FindBy(xpath="//*[@id='Profilemenu']/li/a")
	public static List<WebElement> profilesMenusList;




	public boolean checkCreateProfileSubMenus() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage = excelReader.getCellData(xlSheetName, 8, 7);

		String actMessage = checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 8, 8, actMessage); 

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		String expMessage1 = excelReader.getCellData(xlSheetName, 9, 7);

		String actMessage1 = checkValidationMessage(expMessage1);

		excelReader.setCellData(xlfile, xlSheetName, 9, 8, actMessage1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.click();

		createProfileProfileNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 10, 6),Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage2 = excelReader.getCellData(xlSheetName, 10, 7);

		String actMessage2 = checkValidationMessage(expMessage2);

		excelReader.setCellData(xlfile, xlSheetName, 10, 8, actMessage2);

		int count = profilesMenusList.size();

		ArrayList<String> profileMenus = new ArrayList<String>();

		for (int i = 0; i < count; i++) 
		{
			String data = profilesMenusList.get(i).getText();

			profileMenus.add(data);
		}

		String actProfileMenus = profileMenus.toString();

		String expProfileMenus = excelReader.getCellData(xlSheetName, 11, 7);

		excelReader.setCellData(xlfile, xlSheetName, 11, 8, actProfileMenus);	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);

		int homeMenusCount = homeExpansionMenusList.size();

		ArrayList<String> homeMenus = new ArrayList<String>();

		for (int i = 0; i < homeMenusCount; i++) 
		{
			String data = homeExpansionMenusList.get(i).getText();

			homeMenus.add(data);
		}

		String actHomeMenus = homeMenus.toString();

		String expHomeMenus = excelReader.getCellData(xlSheetName, 12, 7);

		excelReader.setCellData(xlfile, xlSheetName, 12, 8, actHomeMenus);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
		createProfileFinancalsExpandBtn.click();

		Thread.sleep(2000);

		int financialMenusCount = financialsExpansionMenusList.size();

		ArrayList<String> financialMenus = new ArrayList<String>();

		for (int i = 0; i < financialMenusCount; i++) 
		{
			String data = financialsExpansionMenusList.get(i).getText();

			financialMenus.add(data);
		}

		String actFinancialMenus = financialMenus.toString();

		String expFinancialMenus = excelReader.getCellData(xlSheetName, 13, 7);

		excelReader.setCellData(xlfile, xlSheetName, 13, 8, actFinancialMenus);




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		Thread.sleep(2000);

		int inventoryMenusCount = inventoryExpansionMenusList.size();

		ArrayList<String> inventoryMenus = new ArrayList<String>();

		for (int i = 0; i < inventoryMenusCount; i++) 
		{
			String data = inventoryExpansionMenusList.get(i).getText();

			inventoryMenus.add(data);
		}

		String actInventoryMenus = inventoryMenus.toString();

		String expInventoryMenus = excelReader.getCellData(xlSheetName, 14, 7);

		excelReader.setCellData(xlfile, xlSheetName, 14, 8, actInventoryMenus);





		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFixedAssestsExpandBtn));
		createProfileFixedAssestsExpandBtn.click();

		Thread.sleep(2000);

		boolean actFixedAssetsMenus = fixedAssetsTransactionExpandBtn.isDisplayed();

		boolean expFixedAssetsMenus = true;


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProductionExpandBtn));
		createProfileProductionExpandBtn.click();

		Thread.sleep(2000);

		int productionMenusCount = productionExpansionMenusList.size();

		ArrayList<String> productionMenus = new ArrayList<String>();

		for (int i = 0; i < productionMenusCount; i++) 
		{
			String data = productionExpansionMenusList.get(i).getText();

			productionMenus.add(data);
		}

		String actProductionMenus = productionMenus.toString();

		String expProductionMenus = excelReader.getCellData(xlSheetName, 16, 7);

		excelReader.setCellData(xlfile, xlSheetName, 16, 8, actProductionMenus);





		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfilePointOfSaleExpandBtn));
		createProfilePointOfSaleExpandBtn.click();

		Thread.sleep(2000);

		int POSMenusCount = pointOfSaleExpansionMenusList.size();

		ArrayList<String> POSMenus = new ArrayList<String>();

		for (int i = 0; i < POSMenusCount; i++) 
		{
			String data = pointOfSaleExpansionMenusList.get(i).getText();

			POSMenus.add(data);
		}

		String actPointOfSaleMenus = POSMenus.toString();

		String expPointOfSaleMenus = excelReader.getCellData(xlSheetName, 17, 7);

		excelReader.setCellData(xlfile, xlSheetName, 17, 8, actPointOfSaleMenus);





		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileQualityControlExpandBtn));
		createProfileQualityControlExpandBtn.click();

		Thread.sleep(2000);

		int qtyCtrlMenusCount = qualityControlExpansionMenusList.size();

		ArrayList<String> qtyCtrlMenus = new ArrayList<String>();

		for (int i = 0; i < qtyCtrlMenusCount; i++) 
		{
			String data = qualityControlExpansionMenusList.get(i).getText();

			qtyCtrlMenus.add(data);
		}

		String actQualityControlMenus = qtyCtrlMenus.toString();

		String expQualityControlMenus = excelReader.getCellData(xlSheetName, 18, 7);

		excelReader.setCellData(xlfile, xlSheetName, 18, 8, actQualityControlMenus);




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSettingExpandBtn));
		createProfileSettingExpandBtn.click();

		Thread.sleep(2000);

		int actSettingsOptionsCount=settingsExpansionOptionsList.size();


		int settingsMenusCount = settingsExpansionOptionsList.size();

		ArrayList<String> settingsMenus = new ArrayList<String>();

		for (int i = 0; i < settingsMenusCount; i++) 
		{

			getAction().moveToElement(settingsExpansionOptionsList.get(i)).build().perform();
			String data = settingsExpansionOptionsList.get(i).getText();

			settingsMenus.add(data);
		}

		String actsettingsMenus = settingsMenus.toString();

		String expsettingsMenus = "[Configure Transactions, Transaction Authorization, Pricebook Authorization, Configure Masters, Master Authorization, Dashboard, Credit Limit Authorization, Design Workflow, Settings Wizard, Export/Import Settings, Batch Code Generation, Map Credit Limit, VAT Tax Code, Customer Portal Admin, Budget Authorization, Payment Gateway Integration, AI Setup, Fixed Asset Authorization, Configure Forms, Form Authorization]";

		excelReader.setCellData(xlfile, xlSheetName, 19, 8, actsettingsMenus);


		//System.out.println("SaveWithEmptyProfile          : "+actMessage       +"  value expected  "+expMessage);
		System.out.println("ClickHomeWithEmptyProfile     : "+actMessage1      +"  value expected  "+expMessage1);
		System.out.println("SaveWithoutPermissions        : "+actMessage2      +"  value expected  "+expMessage2);
		System.out.println("Actual Profile Menus          : "+actProfileMenus);
		System.out.println("Exoected Profile Menus        : "+expProfileMenus);
		System.out.println("Actual Home Menus             : "+actHomeMenus);
		System.out.println("Exoected Home Menus           : "+expHomeMenus);
		System.out.println("Actual Financial Menus        : "+actFinancialMenus);
		System.out.println("Exoected Financial Menus      : "+expFinancialMenus);
		System.out.println("Actual Inventory Menus        : "+actInventoryMenus);
		System.out.println("Exoected Inventory Menus      : "+expInventoryMenus);
		System.out.println("Actual FixedAssets Menus      : "+actFixedAssetsMenus);
		System.out.println("Exoected FixedAssets Menus    : "+expFixedAssetsMenus);
		System.out.println("Actual Production Menus       : "+actProductionMenus);
		System.out.println("Exoected Production Menus     : "+expProductionMenus);
		System.out.println("Actual PointOfSale Menus      : "+actPointOfSaleMenus);
		System.out.println("Exoected PointOfSale Menus    : "+expPointOfSaleMenus);
		System.out.println("Actual QualityControl Menus   : "+actQualityControlMenus);
		System.out.println("Exoected QualityControl Menus : "+expQualityControlMenus);
		System.out.println("Actual Settings Menus         : "+actsettingsMenus);
		System.out.println("Exoected Settings Menus       : "+expsettingsMenus);




		if (actMessage1.equalsIgnoreCase(expMessage1) && actMessage2.equalsIgnoreCase(expMessage2) && 
				actProfileMenus.equalsIgnoreCase(expProfileMenus) && actHomeMenus.equalsIgnoreCase(expHomeMenus) && actFinancialMenus.equalsIgnoreCase(expFinancialMenus) &&
				actInventoryMenus.equalsIgnoreCase(expInventoryMenus) && actFixedAssetsMenus == expFixedAssetsMenus && actProductionMenus.equalsIgnoreCase(expProductionMenus) &&
				actPointOfSaleMenus.equalsIgnoreCase(expPointOfSaleMenus) && actQualityControlMenus.equalsIgnoreCase(expQualityControlMenus) && actsettingsMenus.equalsIgnoreCase(expsettingsMenus)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 7, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 7, 9, resFail);
			return false;
		}

	}




	@FindBy(xpath="//*[@id='Profilemenu']/li[1]/ul/li[3]/ul/li")
	public static List<WebElement> homeMasterList; 





	public boolean checkCreateProfileHomeMastersAccountRestrictionsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
		createProfileHomeExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMastersExpandBtn));
		homeMastersExpandBtn.click();

		Thread.sleep(2000);



		/*
	 int actHomeMasterListCount=homeMasterList.size();

	 ArrayList<String> homeMastersMenus = new ArrayList<String>();
	 1
	 for (int i = 0; i < actHomeMasterListCount; i++) 
	 {
		 String data = homeMasterList.get(i).getText();
		 homeMastersMenus.add(data);
	 }

	 String actHomeMasterMenusList = homeMastersMenus.toString();

	 String expHomeMasterMenusList = excelReader.getCellData(xlSheetName, 21, 7);

	 excelReader.setCellData(xlfile, xlSheetName, 21, 8, actHomeMasterMenusList);*/




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAccountOption));
		masterAccountOption.click();

		Thread.sleep(2000);

		int actRestrictionsChkBoxCount=restrictionTabChkBoxTxt.size();

		ArrayList<String> RestrictionsChkBox = new ArrayList<String>();

		for (int i = 0; i < actRestrictionsChkBoxCount; i++) 
		{
			String data = restrictionTabChkBoxTxt.get(i).getText();
			RestrictionsChkBox.add(data);
		}

		String actRestrictionsChkBoxList = RestrictionsChkBox.toString();

		String expRestrictionsChkBoxList = "[Access, Add, Edit, Copy, Search, Delete, Print, Export, Customize View, Sort, Mass Update, Authorize, Transfer, Properties, Ledger, Back Track, Budgets, Help, Create Tree, DeleteTree, CreateView, Edit View, Delete View, Select View, Select Tree, Clone, Add Group, Group Master, Set Type, Delete All, Move Up, Move Do_wn, Credit Management, Department Appropriation, Customize Tree, Customize Master, Can Change Group, Can Navigate, Add Info Panel, Edit Info Panel, View Info Panel, Re_ject, Import, Show home page, DeleteInfoPanel, Stop, Save Revision, SetDefaultTree, Modifier, Edit Tree, Authorization Info, Alternate, Related, Open Close, CloseProduct, Adv Master Import/Export, General, Setting, Details, Print Layout, Integration, Tree Tab, Document Tab, Create Tab, VAT Settings]";

		excelReader.setCellData(xlfile, xlSheetName, 22, 8, actRestrictionsChkBoxList);






		System.out.println("actRestrictionsChkBoxList   : "+actRestrictionsChkBoxList);
		System.out.println("expRestrictionsChkBoxList   : "+expRestrictionsChkBoxList);






		if (actRestrictionsChkBoxList.equalsIgnoreCase(expRestrictionsChkBoxList)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 20, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 20, 9, resFail);
			return false;
		}

	}




	@FindBy(xpath="//*[@id='restrictionsDiv']/li/label/span")
	public static List<WebElement> restrictionTabChkBoxList;

	@FindBy(xpath="//*[@id='restrictionsDiv']/li/label/input")
	public static List<WebElement> restrictionTabChkBoxListSelected;

	@FindBy(xpath="//*[@id='restrictionsDiv']/li/div/label/span")
	public static List<WebElement> restrictionTabChkBoxNameList;


	public boolean checkCreateProfileHomeMastersAccountSelectingAllCheckBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
		createProfileSelectAllIcon.click();

		int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

		boolean selected = false;

		for(int i=0;i<restrictionTabChkBoxListCount;i++)
		{
			selected = restrictionTabChkBoxListSelected.get(i).isSelected();

			if(selected==false)
			{
				String notSelect = restrictionTabChkBoxList.get(i).getText();
				System.err.println("Un Selected CheckBox : "+notSelect);
			}
		}



		String actRestrictionsChkBoxSelected = Boolean.toString(selected);

		String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 24, 7);

		excelReader.setCellData(xlfile, xlSheetName, 24, 8, actRestrictionsChkBoxSelected);

		if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resFail);
			return false;
		} 

	}








	public boolean checkCreateProfileHomeMastersItemRestrictionsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{	 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
			itemExpandBtn.click();

			Thread.sleep(2000);

			int actMasterItemOptionsListCount=masterItemOptionsList.size();

			ArrayList<String> itemMenus = new ArrayList<String>();

			for (int i = 0; i < actMasterItemOptionsListCount; i++) 
			{
				String data = masterItemOptionsList.get(i).getText();
				itemMenus.add(data);
			}

			String actItemMenusList = itemMenus.toString();

			String expItemMenusList = excelReader.getCellData(xlSheetName, 26, 7);

			excelReader.setCellData(xlfile, xlSheetName, 26, 8, actItemMenusList);	 

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterItemItemOption));
			masterItemItemOption.click();

			int actRestrictionsChkBoxCount=restrictionTabChkBoxTxt.size();

			ArrayList<String> RestrictionsChkBox = new ArrayList<String>();

			for (int i = 0; i < actRestrictionsChkBoxCount; i++) 
			{
				String data = restrictionTabChkBoxTxt.get(i).getText();
				RestrictionsChkBox.add(data);
			}

			String actRestrictionsChkBoxList = RestrictionsChkBox.toString();

			String expRestrictionsChkBoxList = excelReader.getCellData(xlSheetName, 27, 7);

			excelReader.setCellData(xlfile, xlSheetName, 27, 8, actRestrictionsChkBoxList);


			System.out.println("actItemMenusList           : "+actItemMenusList);
			System.out.println("expItemMenusList           : "+expItemMenusList);

			System.out.println("actRestrictionsChkBoxList  : "+actRestrictionsChkBoxList);
			System.out.println("expRestrictionsChkBoxList  : "+expRestrictionsChkBoxList);

			if (actItemMenusList.equalsIgnoreCase(expItemMenusList) && actRestrictionsChkBoxList.equalsIgnoreCase(expRestrictionsChkBoxList)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 25, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 25, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 25, 10, exception);

			return false;
		}
	}








	public boolean checkCreateProfileHomeMastersItemSelectingAllCheckBoxes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
			createProfileSelectAllIcon.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			boolean selected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				selected = restrictionTabChkBoxList.get(i).isSelected();

				if(selected==false)
				{
					String notSelect = restrictionTabChkBoxNameList.get(i).getText();
					System.err.println("Un Selected CheckBox : "+notSelect);
				}
			}



			String actRestrictionsChkBoxSelected = Boolean.toString(selected);

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 29, 7);

			excelReader.setCellData(xlfile, xlSheetName, 29, 8, actRestrictionsChkBoxSelected);


			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 28, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 28, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 28, 10, exception);

			return false;
		}
	}

	public boolean checkCreateProfileFinancialsTransactionsSalesSalesInvoiceRestrictionsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
			createProfileFinancalsExpandBtn.click();	 
			Thread.sleep(2999);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsExpandBtn));
			financialsTransactionsExpandBtn.click();
			Thread.sleep(2999);

			int actTransactionsListCount=financialsTransactionsList.size();

			ArrayList<String> TransactionsList = new ArrayList<String>();

			for (int i = 0; i < actTransactionsListCount; i++) 
			{
				String data = financialsTransactionsList.get(i).getText();
				TransactionsList.add(data);
			}

			String actTransactionsList = TransactionsList.toString();

			String expTransactionsList = excelReader.getCellData(xlSheetName, 31, 7);

			excelReader.setCellData(xlfile, xlSheetName, 31, 8, actTransactionsList);


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesExpandBtn));
			financialsTransactionsSalesExpandBtn.click(); 
			Thread.sleep(2000);

			int actSalesOptionsCount=financialsTransactionsSalesOptionsList.size();

			ArrayList<String> SalesOptionsList = new ArrayList<String>();

			for (int i = 0; i < actSalesOptionsCount; i++) 
			{
				String data = financialsTransactionsSalesOptionsList.get(i).getText();
				SalesOptionsList.add(data);
			}

			String actSalesOptionsList = SalesOptionsList.toString();

			String expSalesOptionsList ="[Sales Invoices, Sales Returns, Sales invoice N, Sales invoice VAT, Cash Sales, Hire-Purchase Sales]";

			excelReader.setCellData(xlfile, xlSheetName, 32, 8, actSalesOptionsList);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesInvoiceOption));
			financialsTransactionsSalesInvoiceOption.click();

			Thread.sleep(2000);

			int actRestrictionsChkBoxCount	= restrictionTabChkBoxList.size();

			ArrayList<String> RestrictionsChkBox = new ArrayList<String>();

			for (int i = 0; i < actRestrictionsChkBoxCount; i++) 
			{
				String data = restrictionTabChkBoxTxt.get(i).getText();
				RestrictionsChkBox.add(data);
			}

			String actRestrictionsChkBoxList = RestrictionsChkBox.toString();

			String expRestrictionsChkBoxList = "[Access, Add, Edit, Delete, Print, Re-Print, Print Barcode, Print Un-Authorized documents, Export, Edit documents entered by other, Edit documents that are checked, Edit Reconciled documents, Edit documents authorization by higher ups, Enter documents that exceed limit, Enter documents that make Cash or Bank Balance Negative, Edit documents that are Re-Printed, Access through API, Always suspend on saving, Change print layout, Authorize, Re_ject, Show home page, Stop, Modify Settings, View document entered by others, Close Links, Save Revision, Show Posting Details, Suspend, Edit exported (Sync) documents, Edit imported (Sync) documents, Hide Menu, Amend, Customize link, Filter home page, Add to stock, Reverse Entry, Customize info panel, Raise Cheque Return, Delete Documents Created By Others, Delete Authorized Documents, Edit Suspended Documents, Permanent Suspend or Cancel, Always save version, Allow mark converted, Dont allow to edit rejected documents]";

			excelReader.setCellData(xlfile, xlSheetName, 33, 8, actRestrictionsChkBoxList);




			System.out.println("actTransactionsList         : "+actTransactionsList);
			System.out.println("expTransactionsList         : "+expTransactionsList);

			System.out.println("actSalesOptionsList         : "+actSalesOptionsList);
			System.out.println("expSalesOptionsList         : "+expSalesOptionsList);

			System.out.println("actRestrictionsChkBoxList   : "+actRestrictionsChkBoxList);
			System.out.println("expRestrictionsChkBoxList   : "+expRestrictionsChkBoxList);


			if (/*actTransactionsList.equalsIgnoreCase(expTransactionsList) && */actSalesOptionsList.equalsIgnoreCase(expSalesOptionsList)  
					/*actRestrictionsChkBoxList.equalsIgnoreCase(expRestrictionsChkBoxList)*/) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 30, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 30, 9, resFail);
				return false;
			}
		
	}








	public boolean checkCreateProfileFinancialsTransactionsSalesSalesInvoiceSelectingAllCheckBoxes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
			createProfileSelectAllIcon.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			boolean selected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				selected = restrictionTabChkBoxListSelected.get(i).isSelected();
				System.err.println(selected);

				if(selected==false)
				{
					String notSelect = restrictionTabChkBoxTxt.get(i).getText();
					System.err.println("Un Selected CheckBox : "+notSelect);
				}
			}



			String actRestrictionsChkBoxSelected = Boolean.toString(selected);

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 35, 7);
			
			System.out.println("actRestrictionsChkBoxSelected: "+actRestrictionsChkBoxSelected);
			System.out.println("expRestrictionsChkBoxSelected: "+expRestrictionsChkBoxSelected);

			excelReader.setCellData(xlfile, xlSheetName, 35, 8, actRestrictionsChkBoxSelected);


			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
			{
				Thread.sleep(2000);
				excelReader.setCellData(xlfile, xlSheetName, 34, 9, resPass);
				return true;
			}
			else
			{
				Thread.sleep(2000);
				excelReader.setCellData(xlfile, xlSheetName, 34, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 34, 10, exception);

			return false;
		}
	}










	public boolean checkCreateProfileInventoryReportsStockLedgerRestrictionsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
			createProfileInventoryExpandBtn.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryreportsExpandBtn));
			inventoryreportsExpandBtn.click();

			Thread.sleep(2000);



			int actReportsOptionsCount = inventoryReportsOptionsList.size();

			ArrayList<String> ReportsOptionsList = new ArrayList<String>();

			for (int i = 0; i < actReportsOptionsCount; i++) 
			{
				String data = inventoryReportsOptionsList.get(i).getText();
				ReportsOptionsList.add(data);
			}

			String actReportsOptionsList = ReportsOptionsList.toString();

			String expReportsOptionsList = excelReader.getCellData(xlSheetName, 37, 7);

			excelReader.setCellData(xlfile, xlSheetName, 37, 8, actReportsOptionsList);





			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsStockLedgerOption));
			inventoryReportsStockLedgerOption.click();

			int actRestrictionsChkBoxCount=createProfileRestrictionsChkBoxCount.size();

			ArrayList<String> RestrictionsChkBox = new ArrayList<String>();

			for (int i = 0; i < actRestrictionsChkBoxCount; i++) 
			{
				String data = restrictionTabChkBoxTxt.get(i).getText();
				RestrictionsChkBox.add(data);
			}

			String actRestrictionsChkBoxList = RestrictionsChkBox.toString();

			String expRestrictionsChkBoxList = excelReader.getCellData(xlSheetName, 38, 7);

			excelReader.setCellData(xlfile, xlSheetName, 38, 8, actRestrictionsChkBoxList);



			System.out.println("actReportsOptionsList       : "+actReportsOptionsList);
			System.out.println("expReportsOptionsList       : "+expReportsOptionsList);

			System.out.println("actRestrictionsChkBoxList   : "+actRestrictionsChkBoxList);
			System.out.println("expRestrictionsChkBoxList   : "+expRestrictionsChkBoxList);


			if (actReportsOptionsList.equalsIgnoreCase(expReportsOptionsList) && actRestrictionsChkBoxList.equalsIgnoreCase(expRestrictionsChkBoxList))
			{
				excelReader.setCellData(xlfile, xlSheetName, 36, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 36, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 36, 10, exception);

			return false;
		}
	}









	public boolean checkCreateProfileInventoryReportsStockLedgerSelectingAllCheckBoxes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
			createProfileSelectAllIcon.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			boolean selected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				selected = restrictionTabChkBoxList.get(i).isSelected();

				if(selected==false)
				{
					String notSelect = restrictionTabChkBoxNameList.get(i).getText();
					System.err.println("Un Selected CheckBox : "+notSelect);
				}
			}

			/* boolean actcreateProfileAccessChkBox=createProfileAccessChkBox.isSelected();
	 boolean actcreateProfileSearchChkBox=createProfileSearchChkBox.isSelected();
	 boolean actcreateProfilePrintChkBox=createProfilePrintChkBox.isSelected();
	 boolean actcreateProfileViewChkBox=createProfileViewChkBox.isSelected();
	 boolean actcreateProfileExportChkBox=createProfileExportChkBox.isSelected();
	 boolean actcreateProfileEmailReportChkBox=createProfileEmailReportChkBox.isSelected();
	 boolean actcreateProfileEditPrintLayoutChkBox=createProfileEditPrintLayoutChkBox.isSelected();
	 boolean actcreateProfileViewCustomizedLayoutChkBox=createProfileViewCustomizedLayoutChkBox.isSelected();
	 boolean actcreateProfileAddCustomizedLayoutChkBox=createProfileAddCustomizedLayoutChkBox.isSelected();
	 boolean actcreateProfileBackTrackChkBox=createProfileBackTrackChkBox.isSelected();
	 boolean actcreateProfileEmailChkBox=createProfileEmailChkBox.isSelected();
	 boolean actcreateProfileViewGraphChkBox=createProfileViewGraphChkBox.isSelected();
	 boolean actcreateProfileFilterChkBox=createProfileFilterChkBox.isSelected();
	 boolean actcreateProfileAnalyzeChkBox=createProfileAnalyzeChkBox.isSelected();
	 boolean actcreateProfileCrossRefrenceChkBox=createProfileCrossRefrenceChkBox.isSelected();
	 boolean actcreateProfileAddAnalyzeReportChkBox=createProfileAddAnalyzeReportChkBox.isSelected();


	 boolean expcreateProfileAccessChkBox=true;
	 boolean expcreateProfileSearchChkBox=true;
	 boolean expcreateProfilePrintChkBox=true;
	 boolean expcreateProfileViewChkBox=true;
	 boolean expcreateProfileExportChkBox=true;
	 boolean expcreateProfileEmailReportChkBox=true;
	 boolean expcreateProfileEditPrintLayoutChkBox=true;
	 boolean expcreateProfileViewCustomizedLayoutChkBox=true;
	 boolean expcreateProfileAddCustomizedLayoutChkBox=true;
	 boolean expcreateProfileBackTrackChkBox=true;
	 boolean expcreateProfileEmailChkBox=true;
	 boolean expcreateProfileViewGraphChkBox=true;
	 boolean expcreateProfileFilterChkBox=true;
	 boolean expcreateProfileAnalyzeChkBox=true;
	 boolean expcreateProfileCrossRefrenceChkBox=true;
	 boolean expcreateProfileAddAnalyzeReportChkBox=true;

	 boolean isSelected = actcreateProfileAccessChkBox==expcreateProfileAccessChkBox && actcreateProfileSearchChkBox==expcreateProfileSearchChkBox && 
			 			  actcreateProfilePrintChkBox==expcreateProfilePrintChkBox && actcreateProfileViewChkBox==expcreateProfileViewChkBox && 
			 			  actcreateProfileExportChkBox==expcreateProfileExportChkBox && actcreateProfileEmailReportChkBox==expcreateProfileEmailReportChkBox && 
			 			  actcreateProfileEditPrintLayoutChkBox==expcreateProfileEditPrintLayoutChkBox && actcreateProfileViewCustomizedLayoutChkBox==expcreateProfileViewCustomizedLayoutChkBox && 
			 			  actcreateProfileAddCustomizedLayoutChkBox==expcreateProfileAddCustomizedLayoutChkBox && actcreateProfileBackTrackChkBox==expcreateProfileBackTrackChkBox && 
			 			  actcreateProfileEmailChkBox==expcreateProfileEmailChkBox && actcreateProfileViewGraphChkBox==expcreateProfileViewGraphChkBox && 
			 			  actcreateProfileFilterChkBox==expcreateProfileFilterChkBox && actcreateProfileAnalyzeChkBox==expcreateProfileAnalyzeChkBox && 
			 			  actcreateProfileCrossRefrenceChkBox==expcreateProfileCrossRefrenceChkBox && actcreateProfileAddAnalyzeReportChkBox==expcreateProfileAddAnalyzeReportChkBox;*/

			String actRestrictionsChkBoxSelected = Boolean.toString(selected);

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 40, 7);

			excelReader.setCellData(xlfile, xlSheetName, 40, 8, actRestrictionsChkBoxSelected);


			/*System.out.println("createProfileAccessChkBox                : "+actcreateProfileAccessChkBox                +"  value expected  "+expcreateProfileAccessChkBox);
	 System.out.println("createProfileSearchChkBox                : "+actcreateProfileSearchChkBox                +"  value expected  "+expcreateProfileSearchChkBox);
	 System.out.println("createProfilePrintChkBox                 : "+actcreateProfilePrintChkBox                 +"  value expected  "+expcreateProfilePrintChkBox);
	 System.out.println("createProfileViewChkBox                  : "+actcreateProfileViewChkBox                  +"  value expected  "+expcreateProfileViewChkBox);
	 System.out.println("createProfileExportChkBox                : "+actcreateProfileExportChkBox                +"  value expected  "+expcreateProfileExportChkBox);
	 System.out.println("createProfileEmailReportChkBox           : "+actcreateProfileEmailReportChkBox           +"  value expected  "+expcreateProfileEmailReportChkBox);
	 System.out.println("createProfileEditPrintLayoutChkBox       : "+actcreateProfileEditPrintLayoutChkBox       +"  value expected  "+expcreateProfileEditPrintLayoutChkBox);
	 System.out.println("createProfileViewCustomizedLayoutChkBox  : "+actcreateProfileViewCustomizedLayoutChkBox  +"  value expected  "+expcreateProfileViewCustomizedLayoutChkBox);
	 System.out.println("createProfileAddCustomizedLayoutChkBox   : "+actcreateProfileAddCustomizedLayoutChkBox   +"  value expected  "+expcreateProfileAddCustomizedLayoutChkBox);
	 System.out.println("createProfileBackTrackChkBox             : "+actcreateProfileBackTrackChkBox             +"  value expected  "+expcreateProfileBackTrackChkBox);
	 System.out.println("createProfileEmailChkBox                 : "+actcreateProfileEmailChkBox                 +"  value expected  "+expcreateProfileEmailChkBox);
	 System.out.println("createProfileViewGraphChkBox             : "+actcreateProfileViewGraphChkBox             +"  value expected  "+expcreateProfileViewGraphChkBox);
	 System.out.println("createProfileFilterChkBox                : "+actcreateProfileFilterChkBox                +"  value expected  "+expcreateProfileFilterChkBox);
	 System.out.println("createProfileAnalyzeChkBox               : "+actcreateProfileAnalyzeChkBox               +"  value expected  "+expcreateProfileAnalyzeChkBox);
	 System.out.println("createProfileCrossRefrenceChkBox         : "+actcreateProfileCrossRefrenceChkBox         +"  value expected  "+expcreateProfileCrossRefrenceChkBox);
	 System.out.println("createProfileAddAnalyzeReportChkBox      : "+actcreateProfileAddAnalyzeReportChkBox      +"  value expected  "+expcreateProfileAddAnalyzeReportChkBox);*/


			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected))
			{
				Thread.sleep(2000);

				excelReader.setCellData(xlfile, xlSheetName, 39, 9, resPass);
				return true;
			} 
			else 
			{
				Thread.sleep(2000);

				excelReader.setCellData(xlfile, xlSheetName, 39, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 39, 10, exception);

			return false;
		}
	}










	public boolean checkCreateProfileSavingProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 42, 7);

			String actMessage=checkValidationMessage(expMessage);

			excelReader.setCellData(xlfile, xlSheetName, 42, 8, actMessage);

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCloseIcon));
	 createProfileCloseIcon.click();

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));*/

			System.out.println("Validation Message     : "+actMessage   +"  value expected  "+expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 41, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 41, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 41, 10, exception);

			return false;
		}
	}








	@FindBy(xpath="//tbody[@id='profileName_table_body']/tr/td[2]")
	public static List<WebElement> createProfileProfileNameList;


	public boolean checkCreateProfileValidateMastersAccountInSavedProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
	securityMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfile));
	createProfile.click();

	Thread.sleep(3000);
			 */	



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
			createProfileProfileNameCombo.click();
			createProfileProfileNameCombo.sendKeys(Keys.SPACE);

			int actSize=createProfileProfileNameList.size();

			for (int i = 0; i < actSize; i++) 
			{
				String actProfileName=createProfileProfileNameList.get(i).getText();

				if (actProfileName.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 44, 6))) 
				{
					createProfileProfileNameList.get(i).click();

					createProfileProfileNameCombo.sendKeys(Keys.TAB);

					break;
				}
			}



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
			createProfileHomeExpandBtn.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersExpandBtn));
			mastersExpandBtn.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAccountOption));
			masterAccountOption.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			boolean accountselected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				accountselected = restrictionTabChkBoxList.get(i).isSelected();

				if(accountselected==false)
				{
					String notSelect = restrictionTabChkBoxNameList.get(i).getText();
					System.err.println("Un Selected CheckBox : "+notSelect);
				}
			}


			String actRestrictionsChkBoxSelected = Boolean.toString(accountselected);

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 44, 7);

			excelReader.setCellData(xlfile, xlSheetName, 44, 8, actRestrictionsChkBoxSelected);


			System.out.println("RestrictionsChkBoxSelected  : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 43, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 43, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 43, 10, exception);

			return false;
		}
	}








	public boolean checkCreateProfileMastersAccountUnSelectingAllCheckBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileUnSelectAllIcon));
			createProfileUnSelectAllIcon.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			boolean unselected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				unselected = restrictionTabChkBoxList.get(i).isSelected();

				if(unselected==true)
				{
					String Selected = restrictionTabChkBoxNameList.get(i).getText();
					System.err.println("Selected CheckBox : "+Selected);
				}
			}




			boolean actselected = unselected==false;

			String actRestrictionsChkBoxSelected = Boolean.toString(actselected);

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 46, 7);

			excelReader.setCellData(xlfile, xlSheetName, 46, 8, actRestrictionsChkBoxSelected);



			System.out.println("RestrictionsChkBoxSelected  : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
			{

				excelReader.setCellData(xlfile, xlSheetName, 45, 9, resPass);
				return true;
			} 
			else 
			{

				excelReader.setCellData(xlfile, xlSheetName, 45, 9, resFail);
				return false;
			} 

		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 45, 10, exception);

			return false;
		}
	}






	@FindBy(xpath="//*[@id='restrictionsDiv']//li//label")
	public static List<WebElement> restrictionTabChkBoxTxt;



	public boolean checkCreateProfileValidatingHomeMastersItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
			itemExpandBtn.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterItemItemOption));
			masterItemItemOption.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			boolean selected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				selected = restrictionTabChkBoxListSelected.get(i).isSelected();

				if(selected==false)
				{
					String notSelect = restrictionTabChkBoxList.get(i).getText();
					System.err.println("Un Selected CheckBox : "+notSelect);
				}
			}



			String actRestrictionsChkBoxSelected = Boolean.toString(selected);

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 48, 7);

			excelReader.setCellData(xlfile, xlSheetName, 48, 8, actRestrictionsChkBoxSelected);

			System.out.println("RestrictionsChkBoxSelected  : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 47, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 47, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 47, 10, exception);

			return false;
		}
	}









	public boolean checkCreateProfileHomeMastersItemUnSelectingSomeCheckBoxes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileEditChkBox));
			createProfileEditChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCopyChkBox));
			createProfileCopyChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSearchChkBox));
			createProfileSearchChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileDeleteChkBox));
			createProfileDeleteChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfilePrintChkBox));
			createProfilePrintChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSearchChkBox));
			createProfileSearchChkBox.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			Set<String> restrictionTabChkBoxListArray=new HashSet<String>();

			boolean selected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				selected = restrictionTabChkBoxList.get(i).isSelected();

				if(selected==false)
				{
					String notSelect = restrictionTabChkBoxNameList.get(i).getText();
					System.err.println("Un Selected CheckBox : "+notSelect);
					restrictionTabChkBoxListArray.add(notSelect);
				}
			}



			String actRestrictionsChkBoxSelected = restrictionTabChkBoxListArray.toString();

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 50, 7);

			excelReader.setCellData(xlfile, xlSheetName, 50, 8, actRestrictionsChkBoxSelected);




			System.out.println("RestrictionsChkBoxSelected  : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
			{
				Thread.sleep(2000);

				excelReader.setCellData(xlfile, xlSheetName, 49, 9, resPass);
				return true;
			}
			else
			{
				Thread.sleep(2000);

				excelReader.setCellData(xlfile, xlSheetName, 49, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 49, 10, exception);

			return false;
		}
	}










	public boolean checkCreateProfileValidatingSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.click();
		createProfileProfileNameCombo.sendKeys("Test");
		createProfileProfileNameCombo.sendKeys(Keys.TAB);

		int actSize=createProfileProfileNameList.size();

		for (int i = 0; i < actSize; i++) 
		{
			String actProfileName=createProfileProfileNameList.get(i).getText();

			if (actProfileName.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 44, 6))) 
			{
				createProfileProfileNameList.get(i).click();

				createProfileProfileNameCombo.sendKeys(Keys.TAB);

				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
		createProfileFinancalsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsExpandBtn));
		financialsTransactionsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesExpandBtn));
		financialsTransactionsSalesExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesInvoiceOption));
		financialsTransactionsSalesInvoiceOption.click();

		int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

		boolean selected = false;

		for(int i=0;i<restrictionTabChkBoxListCount;i++)
		{
			selected = restrictionTabChkBoxListSelected.get(i).isSelected();
			System.err.println(selected);

			if(selected==false)
			{
				String notSelect = restrictionTabChkBoxTxt.get(i).getText();
				System.err.println("Un Selected CheckBox : "+notSelect);
			}
		}



		String actRestrictionsChkBoxSelected = Boolean.toString(selected);

		String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 52, 7);
		
		

		excelReader.setCellData(xlfile, xlSheetName, 52, 8, actRestrictionsChkBoxSelected);



		System.out.println("RestrictionsChkBoxSelected   : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

		if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 51, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 51, 9, resFail);
			return false;
		}

	}

	public boolean checkCreateProfileSalesInvoiceSelectingSuspendOnSavingAndHideMenuCheckBoxes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", createProfileAlwaysSuspendOnSavingChkBox);

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileAlwaysSuspendOnSavingChkBox));
		createProfileAlwaysSuspendOnSavingChkBox.click();


		Thread.sleep(3000);


		jse.executeScript("arguments[0].scrollIntoView(true);", createProfileHideMenuChkBox);

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHideMenuChkBox));
		createProfileHideMenuChkBox.click();



		int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

		boolean selected = false;

		for(int i=0;i<restrictionTabChkBoxListCount;i++)
		{
			selected = restrictionTabChkBoxListSelected.get(i).isSelected();

			if(selected==false)
			{
				String notSelect = restrictionTabChkBoxTxt.get(i).getText();
				System.err.println("Un Selected CheckBox : "+notSelect);
			}
		}

		String actRestrictionsChkBoxSelected = Boolean.toString(selected);

		String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 54, 7);

		excelReader.setCellData(xlfile, xlSheetName, 54, 8, actRestrictionsChkBoxSelected);



		System.out.println("RestrictionsChkBoxSelected   : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

		if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
		{
			Thread.sleep(2000);

			excelReader.setCellData(xlfile, xlSheetName, 53, 9, resPass);
			return true;
		}
		else
		{
			Thread.sleep(2000);

			excelReader.setCellData(xlfile, xlSheetName, 53, 9, resFail);
			return false;
		}

	}








	public boolean checkCreateProfileValidatingReportsStockLedger() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
			createProfileInventoryExpandBtn.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryreportsExpandBtn));
			inventoryreportsExpandBtn.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsStockLedgerOption));
			inventoryReportsStockLedgerOption.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			boolean selected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				selected = restrictionTabChkBoxList.get(i).isSelected();

				if(selected==false)
				{
					String notSelect = restrictionTabChkBoxNameList.get(i).getText();
					System.err.println("Un Selected CheckBox : "+notSelect);
				}
			}	



			String actRestrictionsChkBoxSelected = Boolean.toString(selected);

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 56, 7);

			excelReader.setCellData(xlfile, xlSheetName, 56, 8, actRestrictionsChkBoxSelected);


			System.out.println("RestrictionsChkBoxSelected  : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected))
			{
				excelReader.setCellData(xlfile, xlSheetName, 55, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 55, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 55, 10, exception);

			return false;
		}
	}









	public boolean checkCreateProfileReportsStockLedgerUnSelectingAllCheckBoxes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileUnSelectAllIcon));
			createProfileUnSelectAllIcon.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			boolean unselected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				unselected = restrictionTabChkBoxList.get(i).isSelected();

				if(unselected==true)
				{
					String Selected = restrictionTabChkBoxNameList.get(i).getText();
					System.err.println("Selected CheckBox : "+Selected);
				}
			}


			boolean actselected = unselected==false;

			String actRestrictionsChkBoxSelected = Boolean.toString(actselected);

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 58, 7);

			excelReader.setCellData(xlfile, xlSheetName, 58, 8, actRestrictionsChkBoxSelected);



			System.out.println("RestrictionsChkBoxSelected  : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected))
			{

				excelReader.setCellData(xlfile, xlSheetName, 57, 9, resPass);
				return true;
			} 
			else 
			{

				excelReader.setCellData(xlfile, xlSheetName, 57, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 57, 10, exception);

			return false;
		}
	}









	public boolean checkCreateProfileSavingAfterEditingProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
			createProfileSaveIcon.click();

			String expMessage=excelReader.getCellData(xlSheetName, 60, 7);

			String actMessage=checkValidationMessage(expMessage);

			excelReader.setCellData(xlfile, xlSheetName, 60, 8, actMessage);


			System.out.println("Validation Message     : "+actMessage   +"  value expected  "+expMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 59, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 59, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 59, 10, exception);

			return false;
		}
	}








	public boolean checkCreateProfileValidateMastersAccountAfterSavingEditedProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
	securityMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfile));
	createProfile.click();

	Thread.sleep(3000);
			 */

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
			createProfileProfileNameCombo.click();
			createProfileProfileNameCombo.sendKeys(Keys.SPACE);

			int actSize=createProfileProfileNameList.size();

			for (int i = 0; i < actSize; i++) 
			{
				String actProfileName=createProfileProfileNameList.get(i).getText();

				if (actProfileName.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 62, 6))) 
				{
					createProfileProfileNameList.get(i).click();

					createProfileProfileNameCombo.sendKeys(Keys.TAB);

					break;
				}
			}

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileHomeExpandBtn));
			createProfileHomeExpandBtn.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersExpandBtn));
			mastersExpandBtn.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAccountOption));
			masterAccountOption.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			boolean unselected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				unselected = restrictionTabChkBoxListSelected.get(i).isSelected();

				if(unselected==false)
				{
					String Select = restrictionTabChkBoxList.get(i).getText();
					System.err.println("Un Selected CheckBox : "+Select);
				}
			}	


			boolean actselected = unselected==false;

			String actRestrictionsChkBoxSelected = Boolean.toString(actselected);

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 62, 7);

			excelReader.setCellData(xlfile, xlSheetName, 62, 8, actRestrictionsChkBoxSelected);


			System.out.println("RestrictionsChkBoxSelected  : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 61, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 61, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 61, 10, exception);

			return false;
		}
	}









	public boolean checkCreateProfileValidatingHomeMastersItemAfterSavingEditedProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
			itemExpandBtn.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterItemItemOption));
			masterItemItemOption.click();

			int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

			Set<String> restrictionTabChkBoxListArray=new HashSet<String>();

			boolean selected = false;

			for(int i=0;i<restrictionTabChkBoxListCount;i++)
			{
				selected = restrictionTabChkBoxList.get(i).isSelected();

				if(selected==false)
				{
					String notSelect = restrictionTabChkBoxNameList.get(i).getText();
					System.err.println("Un Selected CheckBox : "+notSelect);
					restrictionTabChkBoxListArray.add(notSelect);
				}
			}



			String actRestrictionsChkBoxSelected = restrictionTabChkBoxListArray.toString();

			String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 64, 7);

			excelReader.setCellData(xlfile, xlSheetName, 64, 8, actRestrictionsChkBoxSelected);



			System.out.println("RestrictionsChkBoxSelected  : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

			if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
			{
				Thread.sleep(2000);

				excelReader.setCellData(xlfile, xlSheetName, 63, 9, resPass);
				return true;
			}
			else
			{
				Thread.sleep(2000);

				excelReader.setCellData(xlfile, xlSheetName, 63, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 63, 10, exception);

			return false;
		}
	}








	public boolean checkCreateProfileValidatingSalesInvoiceAfterSavingEditedProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.click();

		createProfileProfileNameCombo.sendKeys("Test");
		createProfileProfileNameCombo.sendKeys(Keys.TAB);
		int actSize=createProfileProfileNameList.size();

		for (int i = 0; i < actSize; i++) 
		{
			String actProfileName=createProfileProfileNameList.get(i).getText();

			if (actProfileName.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 62, 6))) 
			{
				createProfileProfileNameList.get(i).click();

				createProfileProfileNameCombo.sendKeys(Keys.TAB);

				break;
			}

		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
		createProfileFinancalsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsExpandBtn));
		financialsTransactionsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesExpandBtn));
		financialsTransactionsSalesExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesInvoiceOption));
		financialsTransactionsSalesInvoiceOption.click();

		int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

		boolean selected = false;

		for(int i=0;i<restrictionTabChkBoxListCount;i++)
		{
			selected = restrictionTabChkBoxListSelected.get(i).isSelected();

			if(selected==false)
			{
				String notSelect = restrictionTabChkBoxTxt.get(i).getText();
				System.err.println("Un Selected CheckBox : "+notSelect);
			}
		}



		String actRestrictionsChkBoxSelected = Boolean.toString(selected);

		String expRestrictionsChkBoxSelected = excelReader.getCellData(xlSheetName, 66, 7);

		excelReader.setCellData(xlfile, xlSheetName, 66, 8, actRestrictionsChkBoxSelected);



		System.out.println("RestrictionsChkBoxSelected  : "+actRestrictionsChkBoxSelected+"  value expected  "+expRestrictionsChkBoxSelected);

		if (actRestrictionsChkBoxSelected.equalsIgnoreCase(expRestrictionsChkBoxSelected)) 
		{
			Thread.sleep(2000);

			excelReader.setCellData(xlfile, xlSheetName, 65, 9, resPass);
			return true;
		}
		else
		{
			Thread.sleep(2000);

			excelReader.setCellData(xlfile, xlSheetName, 65, 9, resFail);
			return false;
		}

	}









	public boolean checkCreateProfileValidatingReportsStockLedgerAfterSavingEditedProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileInventoryExpandBtn));
		createProfileInventoryExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryreportsExpandBtn));
		inventoryreportsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsStockLedgerOption));
		inventoryReportsStockLedgerOption.click();

		int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

		boolean selected = false;

		for(int i=0;i<restrictionTabChkBoxListCount;i++)
		{
			selected = restrictionTabChkBoxList.get(i).isSelected();

			if(selected==false)
			{
				String notSelect = restrictionTabChkBoxTxt.get(i).getText();
				System.err.println("Un Selected CheckBox : "+notSelect);
			}
		}



		boolean actselected = selected==false;

		String actRestrictionTabCheckboxSelected = Boolean.toString(actselected);

		String expRestrictionTabCheckboxSelected = excelReader.getCellData(xlSheetName, 68, 7);

		excelReader.setCellData(xlfile, xlSheetName, 68, 8, actRestrictionTabCheckboxSelected);


		System.out.println("RestrictionTabCheckboxSelected   : "+actRestrictionTabCheckboxSelected+"  value expected  "+expRestrictionTabCheckboxSelected);

		if (actRestrictionTabCheckboxSelected.equalsIgnoreCase(expRestrictionTabCheckboxSelected))
		{ 
			excelReader.setCellData(xlfile, xlSheetName, 67, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 67, 9, resFail);
			return false;
		}

	}










	public boolean checkCreateProfileDeletingSavedProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileDeleteIcon));
			createProfileDeleteIcon.click();

			getWaitForAlert();

			String actAlert=getAlert().getText();

			String expAlert=excelReader.getCellData(xlSheetName, 70, 7);

			excelReader.setCellData(xlfile, xlSheetName, 70, 8, actAlert);

			getAlert().accept();


			String expMessage=excelReader.getCellData(xlSheetName, 71, 7);

			String actMessage=checkValidationMessage(expMessage);

			excelReader.setCellData(xlfile, xlSheetName, 71, 8, actMessage);


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileDeleteIcon));
			createProfileProfileNameCombo.click();
			createProfileProfileNameCombo.sendKeys(Keys.SPACE);

			boolean Deleted=true;

			int actSize=createProfileProfileNameList.size();

			for (int i = 0; i < actSize; i++) 
			{
				String profileName=restrictionTabChkBoxTxt.get(i).getText();

				if (profileName.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 72, 6))) 
				{
					System.out.println(" Profile Not Deleted ");

					Deleted=false;
				}
			}

			createProfileProfileNameCombo.sendKeys(Keys.TAB);

			String actProfileDeleted = Boolean.toString(Deleted);

			String expProfileDeleted = excelReader.getCellData(xlSheetName, 72, 7);

			excelReader.setCellData(xlfile, xlSheetName, 72, 8, actProfileDeleted);

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCloseIcon));
			createProfileCloseIcon.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));

			System.out.println("Alert Text             : "+actAlert     +"  value expected  "+expAlert);
			System.out.println("Validation Message     : "+actMessage   +"  value expected  "+expMessage);
			System.out.println("Deleted Profile        : "+actProfileDeleted   +"  value expected  "+expProfileDeleted);

			if (actAlert.equalsIgnoreCase(expAlert) && actMessage.equalsIgnoreCase(expMessage) && actProfileDeleted.equalsIgnoreCase(expProfileDeleted)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 69, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 69, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 69, 10, exception);

			return false;
		}
	}





	@FindBy(xpath="//ul[@id='ProfileloadFromDiv']/li/span")
	public static List<WebElement> createProfileLoadFromPopupProfilesList;




	public boolean checkCreateProfileLoadFromAllProfileAndValidatePurchasesVouchers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfile));
		createProfile.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileLoadFromIcon));
		createProfileLoadFromIcon.click();

		String expMessage=excelReader.getCellData(xlSheetName, 74, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 74, 8, actMessage);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		Thread.sleep(2000);
		createProfileProfileNameCombo.click();
		Thread.sleep(2000);
		createProfileProfileNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 75, 6));
		Thread.sleep(1000);
		createProfileProfileNameCombo.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileLoadFromIcon));
		createProfileLoadFromIcon.click();

		Thread.sleep(2000);

		int profilesCount=createProfileLoadFromPopupProfilesList.size();

		System.out.println("Number of Profiles : "+profilesCount);

		for (int i = 0; i < profilesCount; i++) 
		{
			String actloadProfile=createProfileLoadFromPopupProfilesList.get(i).getText();

			System.out.println("loadProfile  : "+actloadProfile);

			if (actloadProfile.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 76, 6))) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 76, 9, actloadProfile);

				createProfileLoadFromPopupProfilesList.get(i).click();

				break;
			}

			else
			{
				System.out.println(" Profile NOT Found ");
			}
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadPopupOkBtn));
		loadPopupOkBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
		createProfileFinancalsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsExpandBtn));
		financialsTransactionsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchasesExpandBtn));
		financialsTransactionsPurchasesExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchasesVoucherOption));
		financialsTransactionsPurchasesVoucherOption.click();

		int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

		boolean selected = false;

		for(int i=0;i<restrictionTabChkBoxListCount;i++)
		{
			selected = restrictionTabChkBoxListSelected.get(i).isSelected();

			if(selected==false)
			{
				String notSelect = restrictionTabChkBoxTxt.get(i).getText();
				System.err.println("Un Selected CheckBox : "+notSelect);
			}
		}




		String actRestrictionTabCheckboxSelected = Boolean.toString(selected);

		String expRestrictionTabCheckboxSelected = excelReader.getCellData(xlSheetName, 77, 7);

		excelReader.setCellData(xlfile, xlSheetName, 77, 8, actRestrictionTabCheckboxSelected);


		System.out.println("RestrictionTabCheckboxSelected   : "+actRestrictionTabCheckboxSelected+"  value expected  "+expRestrictionTabCheckboxSelected);

		if (actMessage.equalsIgnoreCase(expMessage) && actRestrictionTabCheckboxSelected.equalsIgnoreCase(expRestrictionTabCheckboxSelected)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 73, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 73, 9, resFail);
			return false;
		}

	}









	public boolean checkCreateProfileSavingValidatingAndDeletingLoadedProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		String expMessage=excelReader.getCellData(xlSheetName, 79, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 79, 8, actMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.click();
		createProfileProfileNameCombo.sendKeys(Keys.SPACE);

		int actSize=createProfileProfileNameList.size();

		for (int i = 0; i < actSize; i++) 
		{
			String actProfileName=createProfileProfileNameList.get(i).getText();
			if (actProfileName.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 80, 6))) 
			{
				createProfileProfileNameList.get(i).click();

				createProfileProfileNameCombo.sendKeys(Keys.TAB);

				break;
			}
		}

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileFinancalsExpandBtn));
		createProfileFinancalsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsExpandBtn));
		financialsTransactionsExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchasesExpandBtn));
		financialsTransactionsPurchasesExpandBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchasesVoucherOption));
		financialsTransactionsPurchasesVoucherOption.click();

		int restrictionTabChkBoxListCount = restrictionTabChkBoxList.size();

		boolean selected = false;

		for(int i=0;i<restrictionTabChkBoxListCount;i++)
		{
			selected = restrictionTabChkBoxListSelected.get(i).isSelected();

			if(selected==false)
			{
				String notSelect = restrictionTabChkBoxTxt.get(i).getText();
				System.err.println("Un Selected CheckBox : "+notSelect);
			}
		}


		String actRestrictionTabCheckboxSelected = Boolean.toString(selected);

		String expRestrictionTabCheckboxSelected = excelReader.getCellData(xlSheetName, 80, 7);

		excelReader.setCellData(xlfile, xlSheetName, 80, 8, actRestrictionTabCheckboxSelected);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileDeleteIcon));
		createProfileDeleteIcon.click();

		getWaitForAlert();

		String actAlert=getAlert().getText();

		String expAlert=excelReader.getCellData(xlSheetName, 81, 7);

		excelReader.setCellData(xlfile, xlSheetName, 81, 8, actAlert);

		getAlert().accept();

		String expMessage1=excelReader.getCellData(xlSheetName, 82, 7);

		String actMessage1=checkValidationMessage(expMessage1);

		excelReader.setCellData(xlfile, xlSheetName, 82, 8, actMessage1);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileDeleteIcon));
		createProfileProfileNameCombo.click();
		createProfileProfileNameCombo.sendKeys(Keys.SPACE);

		boolean Deleted=true;

		int sizeAfterDelete=createProfileProfileNameList.size();

		for (int i = 0; i < sizeAfterDelete; i++) 
		{
			String profileName=createProfileProfileNameList.get(i).getText();

			if (profileName.equalsIgnoreCase("Test")) 
			{
				System.out.println(" Profile Not Deleted ");

				Deleted=false;
			}
		}

		createProfileProfileNameCombo.sendKeys(Keys.TAB);

		String actProfileDeleted = Boolean.toString(Deleted);

		String expProfileDeleted = excelReader.getCellData(xlSheetName, 83, 7);

		excelReader.setCellData(xlfile, xlSheetName, 83, 8, actProfileDeleted);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCloseIcon));
		createProfileCloseIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));

		System.out.println("RestrictionTabCheckboxSelected                          : "+actRestrictionTabCheckboxSelected                                     +"  value expected  "+expRestrictionTabCheckboxSelected);
		System.out.println("Alert Text                                              : "+actAlert                                                              +"  value expected  "+expAlert);
		System.out.println("Validation Message                                      : "+actMessage1                                                           +"  value expected  "+expMessage1);
		System.out.println("Deleted Profile                                         : "+actProfileDeleted                                                     +"  value expected  "+expProfileDeleted);

		if (actMessage.equalsIgnoreCase(expMessage) && actRestrictionTabCheckboxSelected.equalsIgnoreCase(expProfileDeleted) && actAlert.equalsIgnoreCase(expAlert) && 
				actMessage1.equalsIgnoreCase(expMessage1) && actProfileDeleted.equalsIgnoreCase(expProfileDeleted))
		{
			excelReader.setCellData(xlfile, xlSheetName, 78, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 78, 9, resFail);
			return false;
		}

	}








	// Create Role Starts Here

	@FindBy(xpath="//ul[@id='availableProfiles']/li")
	public static List<WebElement> createRoleAvailableProfilesList;

	// Addtions Tab
	@FindBy(xpath="//ul[@id='Addmenu']/li/a/span")
	public static List<WebElement> createRoleAddTabMenuList;

	@FindBy(xpath="//ul[@id='Addmenu']/li[1]/a/span")
	public static WebElement createRoleAddTabHomeMenu;

	@FindBy(xpath="//*[@id='Addmenu']/li[2]/i")
	public static WebElement createRoleAddTabFinancialsMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[3]/a/span")
	public static WebElement createRoleAddTabInventoryMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[4]/a/span")
	public static WebElement createRoleAddTabFixedAssetsMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[5]/a/span")
	public static WebElement createRoleAddTabProductionMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[6]/a/span")
	public static WebElement createRoleAddTabPointOfSaleMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[7]/a/span")
	public static WebElement createRoleAddTabQualityControlMenu;

	@FindBy(xpath="//ul[@id='Addmenu']/li[8]/a/span")
	public static WebElement createRoleAddTabSettingsMenu;

	@FindBy(xpath="(//*[@id='controlBtns']/div/i[1])[1]")
	public static WebElement createRoleAddTabSelectAllChkBox;

	@FindBy(xpath="(//*[@id='controlBtns']/div/i[2])[1]")
	public static WebElement createRoleAddTabUnSelectAllChkBox;


	// Exclusions Tab
	@FindBy(xpath="//ul[@id='Exclmenu']/li/a/span")
	public static List<WebElement> createRoleExclTabMenuList;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[1]/a/span")
	public static WebElement createRoleExclTabHomeMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[2]/a/span")
	public static WebElement createRoleExclTabFinancialsMenu;

	@FindBy(xpath="//*[@id='Exclmenu']/li[3]/i")
	public static WebElement createRoleExclTabInventoryMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[4]/a/span")
	public static WebElement createRoleExclTabFixedAssetsMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[5]/a/span")
	public static WebElement createRoleExclTabProductionMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[6]/a/span")
	public static WebElement createRoleExclTabPointOfSaleMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[7]/a/span")
	public static WebElement createRoleExclTabQualityControlMenu;

	@FindBy(xpath="//ul[@id='Exclmenu']/li[8]/a/span")
	public static WebElement createRoleExclTabSettingsMenu;

	@FindBy(xpath="//div[@id='Exclusions']//div[@id='controlBtns']//span[1]")
	public static WebElement createRoleExclTabSelectAllChkBox;

	@FindBy(xpath="(//*[@id='controlBtns']/div/i[2])[2]")
	public static WebElement createRoleExclTabUnSelectAllChkBox;



	// Restriction for Entry Tab
	@FindBy(xpath="//ul[@id='RestrictionEntryMasters']//li")
	public static List<WebElement> createRoleRestrictionForEntryTabMastersList;

	@FindBy(xpath="//*[@id='RestrictionForEntry']/div/div/div[2]/div[2]/label/span")
	public static WebElement createRoleRestrictionForEntryTabExclChkBox;

	@FindBy(xpath="//table[@id='restrictionEntryTable']")
	public static WebElement createRoleRestrictionForEntryTabTable;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[2]")
	public static WebElement restrictionForEntryTabTableSelectRow1Col1;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_1-2']/label/span")
	public static WebElement restrictionForEntryTabRow1EntryChkBox;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_1-3']/label/span")
	public static WebElement restrictionForEntryTabRow1ReportChkBox;

	@FindBy(xpath="//*[@id='restrictionEntryTable_col_1-4']/label/span")
	public static WebElement restrictionForEntryTabRow1ViewChkBox;


	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[2]")
	public static WebElement restrictionForEntryTabTableSelectRow2Col1;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[3]//input")
	public static WebElement restrictionForEntryTabRow2EntryChkBox;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[4]//input")
	public static WebElement restrictionForEntryTabRow2ReportChkBox;

	@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[5]//input")
	public static WebElement restrictionForEntryTabRow2ViewChkBox;




	@FindBy(xpath="//input[@id='MasteroptionControl']")
	public static WebElement restrictionForEntryTabTableEnterMasterTxt;

	@FindBy(xpath="//tbody[@id='MasteroptionControl_table_body']/tr/td[2]")
	public static List<WebElement> restrictionForEntryTabTableMasterComboList;







	public boolean checkCreateRolePageWithAllOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securitymenu));
		securitymenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMenu));
		createRoleMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));

		boolean actcreateRoleSaveicon						=createRoleSaveicon.isDisplayed();
		boolean actcreateRoleDeleteIcon					=createRoleDeleteIcon.isDisplayed();
		boolean actcreateRoleCloseIcon					=createRoleCloseIcon.isDisplayed();
		boolean actcreateRoleRoleNameCombo				=createRoleRoleNameCombo.isDisplayed();
		boolean actcreateRolePasswordPolicyDropdown		=createRolePasswordPolicyDropdown.isDisplayed();
		boolean actassignedProfilesTab					=assignedProfilesTab.isDisplayed();
		boolean actadditionTab							=additionTab.isDisplayed();
		boolean actexclusionsTab							=exclusionsTab.isDisplayed();
		boolean actrestrictionforEntryTab					=createRoleRestrictionForEntryTab.isDisplayed();
		boolean actrestrictionforTreesTab					=restrictionforTreesTab.isDisplayed();
		boolean acttransactionRightsTab					=transactionRightsTab.isDisplayed();
		boolean actAIRightsTab							=AIRightsTab.isDisplayed();
		boolean actCreateRoleAssignAllToRight				=CreateRoleAssignAllToRight.isDisplayed();
		boolean actCreateRoleAssignSelectedToRight		=CreateRoleAssignSelectedToRight.isDisplayed();
		boolean actCreateRoleAssignSelectedToLeft			=CreateRoleAssignSelectedToLeft.isDisplayed();
		boolean actCreateRoleAssignAllToLeft				=CreateRoleAssignAllToLeft.isDisplayed();

		boolean expcreateRoleRoleNameCombo				=true;
		boolean expcreateRolePasswordPolicyDropdown		=true;
		boolean expassignedProfilesTab					=true;
		boolean expadditionTab							=true;
		boolean expexclusionsTab							=true;
		boolean exprestrictionforEntryTab					=true;
		boolean exprestrictionforTreesTab					=true;
		boolean exptransactionRightsTab					=true;
		boolean expAIRightsTab							=true;
		boolean expcreateRoleSaveicon						=true;
		boolean expcreateRoleDeleteIcon					=true;
		boolean expcreateRoleCloseIcon					=true;
		boolean expCreateRoleAssignAllToRight				=true;
		boolean expCreateRoleAssignSelectedToRight		=true;
		boolean expCreateRoleAssignSelectedToLeft			=true;
		boolean expCreateRoleAssignAllToLeft				=true;

		boolean isDisplayed =	actcreateRoleRoleNameCombo==expcreateRoleRoleNameCombo && actcreateRolePasswordPolicyDropdown==expcreateRolePasswordPolicyDropdown &&
				actassignedProfilesTab==expassignedProfilesTab && actadditionTab==expadditionTab && actexclusionsTab==expexclusionsTab && 
				actrestrictionforEntryTab==exprestrictionforEntryTab && actrestrictionforTreesTab==exprestrictionforTreesTab && 
				acttransactionRightsTab==exptransactionRightsTab && actAIRightsTab==expAIRightsTab && actcreateRoleSaveicon==expcreateRoleSaveicon && 
				actcreateRoleDeleteIcon==expcreateRoleDeleteIcon && actcreateRoleCloseIcon==expcreateRoleCloseIcon && 
				actCreateRoleAssignAllToRight==expCreateRoleAssignAllToRight && actCreateRoleAssignSelectedToRight==expCreateRoleAssignSelectedToRight &&
				actCreateRoleAssignSelectedToLeft==expCreateRoleAssignSelectedToLeft && actCreateRoleAssignAllToLeft==expCreateRoleAssignAllToLeft;


		String actAssignedProfilesOptions = Boolean.toString(isDisplayed);

		String expAssignedProfilesOptions = excelReader.getCellData(xlSheetName, 84, 7);

		excelReader.setCellData(xlfile, xlSheetName, 84, 8, actAssignedProfilesOptions);


		/*// Available Profiles List in Assigned Profilse
	  int actAvalilableProfilesListCount=createRoleAvailableProfilesList.size();

	  Set<String> ProfilesList=new HashSet<String>();

	  for (int i = 0; i < actAvalilableProfilesListCount; i++) 
	  {
		  String profile=createRoleAvailableProfilesList.get(i).getText();

		  ProfilesList.add(profile);
	  }

	  String actProfilesList = ProfilesList.toString();

	  String expProfilesList = excelReader.getCellData(xlSheetName, 85, 7);

	  excelReader.setCellData(xlfile, xlSheetName, 85, 8, actProfilesList);


	  // Additions Tab
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(additionTab));
	  additionTab.click();

	  //int actCreateRoleAddTabMenusCount = createRoleAddTabMenuList.size();

	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleAddTabFinancialsMenu));
	  boolean actcreateRoleAddTabHomeMenu				=createRoleAddTabHomeMenu.isDisplayed();
	  boolean actcreateRoleAddTabFinancialsMenu			=createRoleAddTabFinancialsMenu.isDisplayed();
	  boolean actcreateRoleAddTabInventoryMenu			=createRoleAddTabInventoryMenu.isDisplayed();
	  boolean actcreateRoleAddTabFixedAssetsMenu		=createRoleAddTabFixedAssetsMenu.isDisplayed();
	  boolean actcreateRoleAddTabProductionMenu			=createRoleAddTabProductionMenu.isDisplayed();
	  boolean actcreateRoleAddTabPointOfSaleMenu		=createRoleAddTabPointOfSaleMenu.isDisplayed();
	  boolean actcreateRoleAddTabQualityControlMenu		=createRoleAddTabQualityControlMenu.isDisplayed();
	  boolean actcreateRoleAddTabSettingsMenu			=createRoleAddTabSettingsMenu.isDisplayed();
	  boolean actcreateRoleAddTabSelectAllChkBox		=createRoleAddTabSelectAllChkBox.isDisplayed();
	  boolean actcreateRoleAddTabUnSelectAllChkBox		=createRoleAddTabUnSelectAllChkBox.isDisplayed();

	  boolean expcreateRoleAddTabHomeMenu				=true;
	  boolean expcreateRoleAddTabFinancialsMenu			=true;
	  boolean expcreateRoleAddTabInventoryMenu			=true;
	  boolean expcreateRoleAddTabFixedAssetsMenu		=true;
	  boolean expcreateRoleAddTabProductionMenu			=true;
	  boolean expcreateRoleAddTabPointOfSaleMenu		=true;
	  boolean expcreateRoleAddTabQualityControlMenu		=true;
	  boolean expcreateRoleAddTabSettingsMenu			=true;
	  boolean expcreateRoleAddTabSelectAllChkBox		=true;
	  boolean expcreateRoleAddTabUnSelectAllChkBox		=true;

	  boolean additionTabOptions = actcreateRoleAddTabHomeMenu==expcreateRoleAddTabHomeMenu && actcreateRoleAddTabFinancialsMenu==expcreateRoleAddTabFinancialsMenu && 
			  					   actcreateRoleAddTabInventoryMenu==expcreateRoleAddTabInventoryMenu && actcreateRoleAddTabFixedAssetsMenu==expcreateRoleAddTabFixedAssetsMenu && 
			  					   actcreateRoleAddTabProductionMenu==expcreateRoleAddTabProductionMenu && actcreateRoleAddTabPointOfSaleMenu==expcreateRoleAddTabPointOfSaleMenu && 
			  					   actcreateRoleAddTabQualityControlMenu==expcreateRoleAddTabQualityControlMenu && actcreateRoleAddTabSettingsMenu==expcreateRoleAddTabSettingsMenu && 
			  					   actcreateRoleAddTabSelectAllChkBox==expcreateRoleAddTabSelectAllChkBox && actcreateRoleAddTabUnSelectAllChkBox==expcreateRoleAddTabUnSelectAllChkBox;

	  String actAdditionTabOptions = Boolean.toString(additionTabOptions);

	  String expAdditionTabOptions = excelReader.getCellData(xlSheetName, 86, 7);

	  excelReader.setCellData(xlfile, xlSheetName, 86, 8, actAdditionTabOptions);



	  //Exclusions Tab
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exclusionsTab));
	  exclusionsTab.click();


	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleExclTabFixedAssetsMenu));
	  boolean actcreateRoleExclTabHomeMenu					=createRoleExclTabHomeMenu.isDisplayed();
	  boolean actcreateRoleExclTabFinancialsMenu			=createRoleExclTabFinancialsMenu.isDisplayed();
	  boolean actcreateRoleExclTabInventoryMenu				=createRoleExclTabInventoryMenu.isDisplayed();
	  boolean actcreateRoleExclTabFixedAssetsMenu			=createRoleExclTabFixedAssetsMenu.isDisplayed();
	  boolean actcreateRoleExclTabProductionMenu			=createRoleExclTabProductionMenu.isDisplayed();
	  boolean actcreateRoleExclTabPointOfSaleMenu			=createRoleExclTabPointOfSaleMenu.isDisplayed();
	  boolean actcreateRoleExclTabQualityControlMenu		=createRoleExclTabQualityControlMenu.isDisplayed();
	  boolean actcreateRoleExclTabSettingsMenu				=createRoleExclTabSettingsMenu.isDisplayed();
	  boolean actcreateRoleExclTabSelectAllChkBox			=createRoleExclTabSelectAllChkBox.isDisplayed();
	  boolean actcreateRoleExclTabUnSelectAllChkBox			=createRoleExclTabUnSelectAllChkBox.isDisplayed();

	  boolean expcreateRoleExclTabHomeMenu					=true;
	  boolean expcreateRoleExclTabFinancialsMenu			=true;
	  boolean expcreateRoleExclTabInventoryMenu				=true;
	  boolean expcreateRoleExclTabFixedAssetsMenu			=true;
	  boolean expcreateRoleExclTabProductionMenu			=true;
	  boolean expcreateRoleExclTabPointOfSaleMenu			=true;
	  boolean expcreateRoleExclTabQualityControlMenu		=true;
	  boolean expcreateRoleExclTabSettingsMenu				=true;
	  boolean expcreateRoleExclTabSelectAllChkBox			=true;
	  boolean expcreateRoleExclTabUnSelectAllChkBox			=true;

	  boolean exclusionsTabOptions = actcreateRoleExclTabHomeMenu==expcreateRoleExclTabHomeMenu && actcreateRoleExclTabFinancialsMenu==expcreateRoleExclTabFinancialsMenu && 
			  						 actcreateRoleExclTabInventoryMenu==expcreateRoleExclTabInventoryMenu && actcreateRoleExclTabFixedAssetsMenu==expcreateRoleExclTabFixedAssetsMenu && 
			  						 actcreateRoleExclTabProductionMenu==expcreateRoleExclTabProductionMenu && actcreateRoleExclTabPointOfSaleMenu==expcreateRoleExclTabPointOfSaleMenu && 
			  						 actcreateRoleExclTabQualityControlMenu==expcreateRoleExclTabQualityControlMenu && actcreateRoleExclTabSettingsMenu==expcreateRoleExclTabSettingsMenu && 
			  						 actcreateRoleExclTabSelectAllChkBox==expcreateRoleExclTabSelectAllChkBox && actcreateRoleExclTabUnSelectAllChkBox==expcreateRoleExclTabUnSelectAllChkBox;

	  String actExclusionsTabOptions = Boolean.toString(exclusionsTabOptions);

	  String expExclusionsTabOptions = excelReader.getCellData(xlSheetName, 87, 7);

	  excelReader.setCellData(xlfile, xlSheetName, 87, 8, actExclusionsTabOptions);


	  //Restriction For Entry Tab
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
	  createRoleRestrictionForEntryTab.click();





	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTabExclChkBox));
	  boolean actRestrictionForEntryTabExclChkBox			=createRoleRestrictionForEntryTabExclChkBox.isDisplayed();
	  boolean actcreateRoleRestrictionForEntryTabTable		=createRoleRestrictionForEntryTabTable.isDisplayed();

	  boolean expRestrictionForEntryTabExclChkBox			=true;
	  boolean expcreateRoleRestrictionForEntryTabTable		=true;

      int actRestrictionForEntryMastersListCount=createRoleRestrictionForEntryTabMastersList.size();

	  Set<String> RestrictionForEntryMastersList=new HashSet<String>();

	  for (int i = 0; i < actRestrictionForEntryMastersListCount; i++) 
	  {
		  String profile=createRoleRestrictionForEntryTabMastersList.get(i).getText();

		  RestrictionForEntryMastersList.add(profile);
	  }

	  String actRestrictionForEntryMastersList = RestrictionForEntryMastersList.toString();

	  String expRestrictionForEntryMastersList = excelReader.getCellData(xlSheetName, 88, 7);

	  excelReader.setCellData(xlfile, xlSheetName, 88, 8, actRestrictionForEntryMastersList);

	  boolean restrictionForEntryOptions = actRestrictionForEntryTabExclChkBox==expRestrictionForEntryTabExclChkBox && 
			  							   actcreateRoleRestrictionForEntryTabTable==expcreateRoleRestrictionForEntryTabTable;

	  String actRestrictionForEntryOptions = Boolean.toString(restrictionForEntryOptions);

	  String expRestrictionForEntryOptions = excelReader.getCellData(xlSheetName, 89, 7);

	  excelReader.setCellData(xlfile, xlSheetName, 89, 8, actRestrictionForEntryOptions);



	//Restriction For Trees Tab
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictionforTreesTab));
	  restrictionforTreesTab.click();

	  Thread.sleep(2000);

	  int actRestrictionForTreesMastersListCount=createRoleRestrictionForTreesTabMastersList.size();

	  Set<String> RestrictionForTreesMastersList=new HashSet<String>();

	  for (int i = 0; i < actRestrictionForTreesMastersListCount; i++) 
	  {
		  String profile=createRoleRestrictionForTreesTabMastersList.get(i).getText();

		  RestrictionForTreesMastersList.add(profile);
	  }

	  String actRestrictionForTreesMastersList = RestrictionForTreesMastersList.toString();

	  String expRestrictionForTreesMastersList = excelReader.getCellData(xlSheetName, 90, 7);

	  excelReader.setCellData(xlfile, xlSheetName, 90, 8, actRestrictionForTreesMastersList);



	  //Transaction Rights Tab
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionRightsTab));
	  transactionRightsTab.click();

	  Thread.sleep(2000);

	  boolean actallowBillWiseOnAccountChkBox				=allowBillWiseOnAccountChkBox.isDisplayed();
	  boolean actbudgetLimitWarningDropdown					=budgetLimitWarningDropdown.isDisplayed();
	  boolean actcreditLimitWarningDropdown					=creditLimitWarningDropdown.isDisplayed();
	  boolean actnegativeCashCheckDropdown					=negativeCashCheckDropdown.isDisplayed();
	  boolean actnegativeStockCheckDropdown					=negativeStockCheckDropdown.isDisplayed();
	  boolean actcantaddfutureTransChkbox					=cantaddfutureTransChkbox.isDisplayed();
	  boolean actcannotAddTransThatAreMoreThanTxt			=cannotAddTransThatAreMoreThanTxt.isDisplayed();
	  boolean actcannotEditPreviousMonthEntriesAfterTxt		=cannotEditPreviousMonthEntriesAfterTxt.isDisplayed();
	  boolean actCantEditTransthatAreremorethanTxt			=CantEditTransthatAreremorethanTxt.isDisplayed();
	  boolean actCantAddPrevMnthEntriesaftTxt				=CantAddPrevMnthEntriesaftTxt.isDisplayed();
	  boolean actCantPrintAfterValueTxt						=CantPrintAfterValueTxt.isDisplayed();
	  boolean actcantPrintAfterValueDropdown				=cantPrintAfterValueDropdown.isDisplayed();
	  boolean actCantRePrintAfterValueTxt					=CantRePrintAfterValueTxt.isDisplayed();
	  boolean actCantRePrintAfterDropdown					=CantRePrintAfterDropdown.isDisplayed();
	  boolean actdoNotAllowMastewrCustomization				=doNotAllowMasterCustomization.isDisplayed();

	  boolean expallowBillWiseOnAccountChkBox				=true;
	  boolean expbudgetLimitWarningDropdown					=true;
	  boolean expcreditLimitWarningDropdown					=true;
	  boolean expnegativeCashCheckDropdown					=true;
	  boolean expnegativeStockCheckDropdown					=true;
	  boolean expcantaddfutureTransChkbox					=true;
	  boolean expcannotAddTransThatAreMoreThanTxt			=true;
	  boolean expcannotEditPreviousMonthEntriesAfterTxt		=true;
	  boolean expCantEditTransthatAreremorethanTxt			=true;
	  boolean expCantAddPrevMnthEntriesaftTxt				=true;
	  boolean expCantPrintAfterValueTxt						=true;
	  boolean expcantPrintAfterValueDropdown				=true;
	  boolean expCantRePrintAfterValueTxt					=true;
	  boolean expCantRePrintAfterDropdown					=true;
	  boolean expdoNotAllowMastewrCustomization				=true;

	  boolean transactionRightsTabOptions = actallowBillWiseOnAccountChkBox==expallowBillWiseOnAccountChkBox && actbudgetLimitWarningDropdown==expbudgetLimitWarningDropdown &&
			   								 actcreditLimitWarningDropdown==expcreditLimitWarningDropdown && actnegativeCashCheckDropdown==expnegativeCashCheckDropdown &&
			   								 actnegativeStockCheckDropdown==expnegativeStockCheckDropdown && actcantaddfutureTransChkbox==expcantaddfutureTransChkbox &&
			   								 actcannotAddTransThatAreMoreThanTxt==expcannotAddTransThatAreMoreThanTxt && actcannotEditPreviousMonthEntriesAfterTxt==expcannotEditPreviousMonthEntriesAfterTxt &&
			   								 actCantEditTransthatAreremorethanTxt==expCantEditTransthatAreremorethanTxt && actCantAddPrevMnthEntriesaftTxt==expCantAddPrevMnthEntriesaftTxt &&
			   								 actCantPrintAfterValueTxt==expCantPrintAfterValueTxt && actcantPrintAfterValueDropdown==expcantPrintAfterValueDropdown &&
			   								 actCantRePrintAfterValueTxt==expCantRePrintAfterValueTxt && actCantRePrintAfterDropdown==expCantRePrintAfterDropdown && 
			   								 actdoNotAllowMastewrCustomization==expdoNotAllowMastewrCustomization;

	  String actTransactionRightsTabOptions = Boolean.toString(transactionRightsTabOptions);

	  String expTransactionRightsTabOptions = excelReader.getCellData(xlSheetName, 91, 7);

	  excelReader.setCellData(xlfile, xlSheetName, 91, 8, actTransactionRightsTabOptions);



	  // AI Rights
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AIRightsTab));
	  AIRightsTab.click();


	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(NoOfVoiceCommandsPermittedTxt));
	  boolean actAIRightsEnableVIUChkBox							=AIRightsEnableVUIChkBox.isDisplayed();
	  boolean actAIRightsEnableAIChkBox								=AIRightsEnableAIChkBox.isDisplayed();
	  boolean actdoNotApplyTheTagResTrictionToTheResultsChkBox		=doNotApplyTheTagResTrictionToTheResultsChkBox.isDisplayed();
	  boolean actNoOfVoiceCommandsPermittedTxt						=NoOfVoiceCommandsPermittedTxt.isDisplayed();
	  boolean actNoOfTextCommandsPermittedTxt						=NoOfTextCommandsPermittedTxt.isDisplayed();
	  boolean actAIRightsSalesChkBox								=AIRightsSalesChkBox.isDisplayed();
	  boolean actAIRightsSalesOrderChkBox							=AIRightsSalesOrderChkBox.isDisplayed();
	  boolean actAIRightsStockChkBox								=AIRightsStockChkBox.isDisplayed();
	  boolean actAIRightsPurchasesChkBox							=AIRightsPurchasesChkBox.isDisplayed();
	  boolean actAIRightsPurchasesOrdersChkBox						=AIRightsPurchasesOrdersChkBox.isDisplayed();
	  boolean actAIRightsAccountsReceivablesChkBox					=AIRightsAccountsReceivablesChkBox.isDisplayed();
	  boolean actAIRightsAccountsPayablesChkBox						=AIRightsAccountsPayablesChkBox.isDisplayed();
	  boolean actAIRightsFinanceChkBox								=AIRightsFinanceChkBox.isDisplayed();

	  boolean expAIRightsEnableVIUChkBox							=true;
	  boolean expAIRightsEnableAIChkBox								=true;
	  boolean expdoNotApplyTheTagResTrictionToTheResultsChkBox		=true;
	  boolean expNoOfVoiceCommandsPermittedTxt						=true;
	  boolean expNoOfTextCommandsPermittedTxt						=true;
	  boolean expAIRightsSalesChkBox								=true;
	  boolean expAIRightsSalesOrderChkBox							=true;
	  boolean expAIRightsStockChkBox								=true;
	  boolean expAIRightsPurchasesChkBox							=true;
	  boolean expAIRightsPurchasesOrdersChkBox						=true;
	  boolean expAIRightsAccountsReceivablesChkBox					=true;
	  boolean expAIRightsAccountsPayablesChkBox						=true;
	  boolean expAIRightsFinanceChkBox								=true;

	  boolean AIRightsOptions = actAIRightsEnableVIUChkBox==expAIRightsEnableVIUChkBox && actAIRightsEnableAIChkBox==expAIRightsEnableAIChkBox &&
			   					actdoNotApplyTheTagResTrictionToTheResultsChkBox==expdoNotApplyTheTagResTrictionToTheResultsChkBox &&
			   					actNoOfVoiceCommandsPermittedTxt==expNoOfVoiceCommandsPermittedTxt && actNoOfTextCommandsPermittedTxt==expNoOfTextCommandsPermittedTxt &&
			   					actAIRightsSalesChkBox==expAIRightsSalesChkBox && actAIRightsSalesOrderChkBox==expAIRightsSalesOrderChkBox &&
			   					actAIRightsStockChkBox==expAIRightsStockChkBox && actAIRightsPurchasesChkBox==expAIRightsPurchasesChkBox &&
			   					actAIRightsPurchasesOrdersChkBox==expAIRightsPurchasesOrdersChkBox && actAIRightsAccountsReceivablesChkBox==expAIRightsAccountsReceivablesChkBox &&
			   					actAIRightsAccountsPayablesChkBox==expAIRightsAccountsPayablesChkBox && actAIRightsFinanceChkBox==expAIRightsFinanceChkBox;

	  String actAIRightsOptions = Boolean.toString(AIRightsOptions);

	  String expAIRightsOptions = excelReader.getCellData(xlSheetName, 92, 7);

	  excelReader.setCellData(xlfile, xlSheetName, 92, 8, actAIRightsOptions);

		 */	  

		System.out.println("createRoleRoleNameCombo          : "+actcreateRoleRoleNameCombo           +"  value expected  "+expcreateRoleRoleNameCombo);
		System.out.println("createRolePasswordPolicyDropdown : "+actcreateRolePasswordPolicyDropdown  +"  value expected  "+expcreateRolePasswordPolicyDropdown);
		System.out.println("assignedProfilesTab              : "+actassignedProfilesTab               +"  value expected  "+expassignedProfilesTab);
		System.out.println("additionTab                      : "+actadditionTab                       +"  value expected  "+expadditionTab);
		System.out.println("exclusionsTab                    : "+actexclusionsTab                     +"  value expected  "+expexclusionsTab);
		System.out.println("restrictionforEntryTab           : "+actrestrictionforEntryTab            +"  value expected  "+exprestrictionforEntryTab);
		System.out.println("restrictionforTreesTab           : "+actrestrictionforTreesTab            +"  value expected  "+exprestrictionforTreesTab);
		System.out.println("transactionRightsTab             : "+acttransactionRightsTab              +"  value expected  "+exptransactionRightsTab);
		System.out.println("AIRightsTab                      : "+actAIRightsTab                       +"  value expected  "+expAIRightsTab);
		System.out.println("createRoleSaveicon               : "+actcreateRoleSaveicon                +"  value expected  "+expcreateRoleSaveicon);
		System.out.println("createRoleDeleteIcon             : "+actcreateRoleDeleteIcon              +"  value expected  "+expcreateRoleDeleteIcon);
		System.out.println("createRoleCloseIcon              : "+actcreateRoleCloseIcon               +"  value expected  "+expcreateRoleCloseIcon);
		System.out.println("CreateRoleAssignAllToRight       : "+actCreateRoleAssignAllToRight        +"  value expected  "+expCreateRoleAssignAllToRight);
		System.out.println("CreateRoleAssignSelectedToRight  : "+actCreateRoleAssignSelectedToRight   +"  value expected  "+expCreateRoleAssignSelectedToRight);
		System.out.println("CreateRoleAssignSelectedToLeft   : "+actCreateRoleAssignSelectedToLeft    +"  value expected  "+expCreateRoleAssignSelectedToLeft);
		System.out.println("CreateRoleAssignAllToLeft        : "+actCreateRoleAssignAllToLeft         +"  value expected  "+expCreateRoleAssignAllToLeft);


		/*  System.out.println("createRoleAddTabHomeMenu            : "+actcreateRoleAddTabHomeMenu           +"  value expected  "+expcreateRoleAddTabHomeMenu);
	  System.out.println("createRoleAddTabFinancialsMenu      : "+actcreateRoleAddTabFinancialsMenu     +"  value expected  "+expcreateRoleAddTabFinancialsMenu);
	  System.out.println("createRoleAddTabInventoryMenu       : "+actcreateRoleAddTabInventoryMenu      +"  value expected  "+expcreateRoleAddTabInventoryMenu);
	  System.out.println("createRoleAddTabFixedAssetsMenu     : "+actcreateRoleAddTabFixedAssetsMenu    +"  value expected  "+expcreateRoleAddTabFixedAssetsMenu);
	  System.out.println("createRoleAddTabProductionMenu      : "+actcreateRoleAddTabProductionMenu     +"  value expected  "+expcreateRoleAddTabProductionMenu);
	  System.out.println("createRoleAddTabPointOfSaleMenu     : "+actcreateRoleAddTabPointOfSaleMenu    +"  value expected  "+expcreateRoleAddTabPointOfSaleMenu);
	  System.out.println("createRoleAddTabQualityControlMenu  : "+actcreateRoleAddTabQualityControlMenu +"  value expected  "+expcreateRoleAddTabQualityControlMenu);
	  System.out.println("createRoleAddTabSettingsMenu        : "+actcreateRoleAddTabSettingsMenu       +"  value expected  "+expcreateRoleAddTabSettingsMenu);
	  System.out.println("createRoleAddTabSelectAllChkBox     : "+actcreateRoleAddTabSelectAllChkBox    +"  value expected  "+expcreateRoleAddTabSelectAllChkBox);
	  System.out.println("createRoleAddTabUnSelectAllChkBox   : "+actcreateRoleAddTabUnSelectAllChkBox  +"  value expected  "+expcreateRoleAddTabUnSelectAllChkBox);


	  System.out.println("createRoleExclTabHomeMenu            : "+actcreateRoleExclTabHomeMenu            +"  value expected  "+expcreateRoleExclTabHomeMenu);
	  System.out.println("createRoleExclTabFinancialsMenu      : "+actcreateRoleExclTabFinancialsMenu      +"  value expected  "+expcreateRoleExclTabFinancialsMenu);
	  System.out.println("createRoleExclTabInventoryMenu       : "+actcreateRoleExclTabInventoryMenu       +"  value expected  "+expcreateRoleExclTabInventoryMenu);
	  System.out.println("createRoleExclTabFixedAssetsMenu     : "+actcreateRoleExclTabFixedAssetsMenu     +"  value expected  "+expcreateRoleExclTabFixedAssetsMenu);
	  System.out.println("createRoleExclTabProductionMenu      : "+actcreateRoleExclTabProductionMenu      +"  value expected  "+expcreateRoleExclTabProductionMenu);
	  System.out.println("createRoleExclTabPointOfSaleMenu     : "+actcreateRoleExclTabPointOfSaleMenu     +"  value expected  "+expcreateRoleExclTabPointOfSaleMenu);
	  System.out.println("createRoleExclTabQualityControlMenu  : "+actcreateRoleExclTabQualityControlMenu  +"  value expected  "+expcreateRoleExclTabQualityControlMenu);
	  System.out.println("createRoleExclTabSettingsMenu        : "+actcreateRoleExclTabSettingsMenu        +"  value expected  "+expcreateRoleExclTabSettingsMenu);
	  System.out.println("createRoleExclTabSelectAllChkBox     : "+actcreateRoleExclTabSelectAllChkBox     +"  value expected  "+expcreateRoleExclTabSelectAllChkBox);
	  System.out.println("createRoleExclTabUnSelectAllChkBox   : "+actcreateRoleExclTabUnSelectAllChkBox   +"  value expected  "+expcreateRoleExclTabUnSelectAllChkBox);


	  System.out.println("RestrictionForEntryTabExclChkBox      : "+actRestrictionForEntryTabExclChkBox      +"  value expected  "+expRestrictionForEntryTabExclChkBox);
	  System.out.println("createRoleRestrictionForEntryTabTable : "+actcreateRoleRestrictionForEntryTabTable +"  value expected  "+expcreateRoleRestrictionForEntryTabTable);


	  System.out.println("allowBillWiseOnAccountChkBox            : "+actallowBillWiseOnAccountChkBox            +"  value expected  "+expallowBillWiseOnAccountChkBox);
	  System.out.println("budgetLimitWarningDropdown              : "+actbudgetLimitWarningDropdown              +"  value expected  "+expbudgetLimitWarningDropdown);
	  System.out.println("creditLimitWarningDropdown              : "+actcreditLimitWarningDropdown              +"  value expected  "+expcreditLimitWarningDropdown);
	  System.out.println("negativeCashCheckDropdown               : "+actnegativeCashCheckDropdown               +"  value expected  "+expnegativeCashCheckDropdown);
	  System.out.println("negativeStockCheckDropdown              : "+actnegativeStockCheckDropdown              +"  value expected  "+expnegativeStockCheckDropdown);
	  System.out.println("cantaddfutureTransChkbox                : "+actcantaddfutureTransChkbox                +"  value expected  "+expcantaddfutureTransChkbox);
	  System.out.println("cannotAddTransThatAreMoreThanTxt        : "+actcannotAddTransThatAreMoreThanTxt        +"  value expected  "+expcannotAddTransThatAreMoreThanTxt);
	  System.out.println("cannotEditPreviousMonthEntriesAfterTxt  : "+actcannotEditPreviousMonthEntriesAfterTxt  +"  value expected  "+expcannotEditPreviousMonthEntriesAfterTxt);
	  System.out.println("CantEditTransthatAreremorethanTxt       : "+actCantEditTransthatAreremorethanTxt       +"  value expected  "+expCantEditTransthatAreremorethanTxt);
	  System.out.println("CantAddPrevMnthEntriesaftTxt            : "+actCantAddPrevMnthEntriesaftTxt            +"  value expected  "+expCantAddPrevMnthEntriesaftTxt);
	  System.out.println("CantPrintAfterValueTxt                  : "+actCantPrintAfterValueTxt                  +"  value expected  "+expCantPrintAfterValueTxt);
	  System.out.println("cantPrintAfterValueDropdown             : "+actcantPrintAfterValueDropdown             +"  value expected  "+expcantPrintAfterValueDropdown);
	  System.out.println("CantRePrintAfterValueTxt                : "+actCantRePrintAfterValueTxt                +"  value expected  "+expCantRePrintAfterValueTxt);
	  System.out.println("CantRePrintAfterDropdown                : "+actCantRePrintAfterDropdown                +"  value expected  "+expCantRePrintAfterDropdown);
	  System.out.println("doNotAllowMastewrCustomization          : "+actdoNotAllowMastewrCustomization          +"  value expected  "+expdoNotAllowMastewrCustomization);


	  System.out.println("AIRightsEnableVIUChkBox                       : "+actAIRightsEnableVIUChkBox                       +"  value expected  "+expAIRightsEnableVIUChkBox);
	  System.out.println("AIRightsEnableAIChkBox                        : "+actAIRightsEnableAIChkBox                        +"  value expected  "+expAIRightsEnableAIChkBox);
	  System.out.println("doNotApplyTheTagResTrictionToTheResultsChkBox : "+actdoNotApplyTheTagResTrictionToTheResultsChkBox +"  value expected  "+expdoNotApplyTheTagResTrictionToTheResultsChkBox);
	  System.out.println("NoOfVoiceCommandsPermittedTxt                 : "+actNoOfVoiceCommandsPermittedTxt                 +"  value expected  "+expNoOfVoiceCommandsPermittedTxt);
	  System.out.println("NoOfTextCommandsPermittedTxt                  : "+actNoOfTextCommandsPermittedTxt                  +"  value expected  "+expNoOfTextCommandsPermittedTxt);
	  System.out.println("AIRightsSalesChkBox                           : "+actAIRightsSalesChkBox                           +"  value expected  "+expAIRightsSalesChkBox);
	  System.out.println("AIRightsSalesOrderChkBox                      : "+actAIRightsSalesOrderChkBox                      +"  value expected  "+expAIRightsSalesOrderChkBox);
	  System.out.println("AIRightsStockChkBox                           : "+actAIRightsStockChkBox                           +"  value expected  "+expAIRightsStockChkBox);
	  System.out.println("AIRightsPurchasesChkBox                       : "+actAIRightsPurchasesChkBox                       +"  value expected  "+expAIRightsPurchasesChkBox);
	  System.out.println("AIRightsPurchasesOrdersChkBox                 : "+actAIRightsPurchasesOrdersChkBox                 +"  value expected  "+expAIRightsPurchasesOrdersChkBox);
	  System.out.println("AIRightsAccountsReceivablesChkBox             : "+actAIRightsAccountsReceivablesChkBox             +"  value expected  "+expAIRightsAccountsReceivablesChkBox);
	  System.out.println("AIRightsAccountsPayablesChkBox                : "+actAIRightsAccountsPayablesChkBox                +"  value expected  "+expAIRightsAccountsPayablesChkBox);
	  System.out.println("AIRightsFinanceChkBox                         : "+actAIRightsFinanceChkBox                         +"  value expected  "+expAIRightsFinanceChkBox);

		 */
		/*System.out.println("AssignedProfilesOptions  : "+actAssignedProfilesOptions+"  value expected  "+expAssignedProfilesOptions);

	  System.out.println("actProfilesList   : "+actProfilesList);
	  System.out.println("expProfilesList   : "+expProfilesList);

	  System.out.println("AdditionTabOptions   : "+actAdditionTabOptions+"  value expected  "+expAdditionTabOptions);

	  System.out.println("ExclusionsTabOptions : "+actExclusionsTabOptions+"  value expected  "+expExclusionsTabOptions);

	  System.out.println("actRestrictionForEntryMastersList  : "+actRestrictionForEntryMastersList);
	  System.out.println("ExpRestrictionForEntryMastersList  : "+expRestrictionForEntryMastersList);

	  System.out.println("RestrictionForEntryOptions  : "+actRestrictionForEntryOptions+"  value expected  "+expRestrictionForEntryOptions);

	  System.out.println("actRestrictionForTreesMastersList  : "+actRestrictionForTreesMastersList);
	  System.out.println("expRestrictionForTreesMastersList  : "+expRestrictionForTreesMastersList);

	  System.out.println("TransactionRightsTabOptions  : "+actTransactionRightsTabOptions+"  value expected  "+expTransactionRightsTabOptions);

	  System.out.println("AIRightsOptions  : "+actAIRightsOptions+"  value expected  "+expAIRightsOptions);
		 */

		if (actAssignedProfilesOptions.equalsIgnoreCase(expAssignedProfilesOptions) /*&& actProfilesList.equalsIgnoreCase(expProfilesList) && 
		    actAdditionTabOptions.equalsIgnoreCase(expAdditionTabOptions) && actExclusionsTabOptions.equalsIgnoreCase(expExclusionsTabOptions) &&
		    actRestrictionForEntryMastersList.equalsIgnoreCase(expRestrictionForEntryMastersList) && actRestrictionForEntryOptions.equalsIgnoreCase(expRestrictionForEntryOptions) &&
		    actRestrictionForTreesMastersList.equalsIgnoreCase(expRestrictionForTreesMastersList) && actTransactionRightsTabOptions.equalsIgnoreCase(expTransactionRightsTabOptions) &&
		    actAIRightsOptions.equalsIgnoreCase(expAIRightsOptions)*/) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 84, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 84, 9, resFail);
			return false;
		}

	}



	public boolean checkSaveButtonWithBlank() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(assignedProfilesTab));
		assignedProfilesTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		String expMessage = excelReader.getCellData(xlSheetName, 93, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 93, 8, actMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 93, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 93, 9, resFail);
			return false;
		}

	}


	public boolean checkPasswordPolicyintheAssignedProfileTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));

			Select pw=new Select(createRolePasswordPolicyDropdown);

			int PasswordPolicyListCount = pw.getOptions().size()-1;

			String actPasswordPolicyList = Integer.toString(PasswordPolicyListCount);

			String expPasswordPolicyList = "3";/*excelReader.getCellData(xlSheetName, 94, 7);*///3 profiles

			excelReader.setCellData(xlfile, xlSheetName, 94, 8, actPasswordPolicyList);

			if (actPasswordPolicyList.equalsIgnoreCase(expPasswordPolicyList)) 
			{
				System.out.println(" Pass:  Displayed All the PolicyPassword fields ");

				System.out.println("Number of PasswordPolicy DropDown Fileds "  + actPasswordPolicyList);

				for (int i = 1; i <= PasswordPolicyListCount; i++) 
				{
					String s=pw.getOptions().get(i).getText();

					System.out.println(s);
				}
				excelReader.setCellData(xlfile, xlSheetName, 94, 9, resPass);
				return true;

			}
			else 
			{
				System.out.println(" Fail:  Displayed All the PolicyPassword fields ");
				System.out.println(" PasswordPolicy DropDown Fileds "  + actPasswordPolicyList);

				for (int i = 1; i <= PasswordPolicyListCount; i++) 
				{
					String s=pw.getOptions().get(i).getText();

					System.out.println(s);
				}
				excelReader.setCellData(xlfile, xlSheetName, 94, 9, resFail);
				return false;
			}
		
	}



	@FindBy(xpath="//ul[@id='availableProfiles']/li")
	public static List<WebElement> availableProfilesList;






	public boolean  checkClickOnRightArrowIconWithoutSelectProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
			createRoleMOveFiledsFromLeftSideToRightSide.click();

			String expMessage=excelReader.getCellData(xlSheetName, 95, 7);

			String actMessage=checkValidationMessage(expMessage);

			excelReader.setCellData(xlfile, xlSheetName, 95, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage))
			{
				excelReader.setCellData(xlfile, xlSheetName, 95, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 95, 9, resFail);
				return false;
			}
		
	}

	public boolean  checkClickOnLeftArrowIconWithoutSelectProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromRigheSideToLeftSide));
			createRoleMOveFiledsFromRigheSideToLeftSide.click();

			String expMessage=excelReader.getCellData(xlSheetName, 96, 7);

			String actMessage=checkValidationMessage(expMessage);

			excelReader.setCellData(xlfile, xlSheetName, 96, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 96, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 96, 9, resFail);
				return false;
			}
		
	}


	@FindBy(xpath="//ul[@id='assignedProfiles']/li")
	public static List<WebElement> assignedProfileList;


	public boolean  checkClickOnRightArrowIconWitSelectProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(assignedProfilesTab));
			assignedProfilesTab.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfileSt));
			avaliableAllProfileSt.click();


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
			createRoleMOveFiledsFromLeftSideToRightSide.click();

			Thread.sleep(2000);

			int actAssignedProfilesListCount=assignedProfileList.size();

			Set<String> AssignedProfilesList=new HashSet<String>();

			for (int i = 0; i < actAssignedProfilesListCount; i++) 
			{
				String profile=assignedProfileList.get(i).getText();

				AssignedProfilesList.add(profile);
			}

			String actAssignedProfilesList = AssignedProfilesList.toString();

			String expAssignedProfilesList = excelReader.getCellData(xlSheetName, 97, 7);//

			excelReader.setCellData(xlfile, xlSheetName, 97, 8, actAssignedProfilesList);

			System.err.println("availableProfilesArea : "+availableProfilesArea.getText().isEmpty());

			boolean availableProfilesAreaCount = availableProfilesArea.getText().isEmpty();

			String actavailableProfilesArea= Boolean.toString(availableProfilesAreaCount);

			/*int actAvalilableProfilesListCount=createRoleAvailableProfilesList.size();

	  Set<String> ProfilesList=new HashSet<String>();

	  for (int i = 0; i < actAvalilableProfilesListCount; i++) 
	  {
		  String profile=createRoleAvailableProfilesList.get(i).getText();

		  ProfilesList.add(profile);
	  }

	  String actProfilesList = ProfilesList.toString();

	  String expProfilesList = excelReader.getCellData(xlSheetName, 98, 7);*/

			String expavailableProfilesArea = excelReader.getCellData(xlSheetName, 98, 7);//false 

			excelReader.setCellData(xlfile, xlSheetName, 98, 8, actavailableProfilesArea);

			System.out.println(actAssignedProfilesList);
			System.out.println(expAssignedProfilesList);

			System.out.println(actavailableProfilesArea);
			System.out.println(expavailableProfilesArea);

			if (actAssignedProfilesList.equalsIgnoreCase(expAssignedProfilesList)/* && actavailableProfilesArea.equalsIgnoreCase(expavailableProfilesArea)*/) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 97, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 97, 9, resFail);
				return false;
			}
		
	}





	public boolean  checkClickOnLeftArrowIconWitSelectProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfileSt));
			avaliableAllProfileSt.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromRigheSideToLeftSide));
			createRoleMOveFiledsFromRigheSideToLeftSide.click();

			Thread.sleep(2000);

			int actAvalilableProfilesListCount=createRoleAvailableProfilesList.size();

			Set<String> ProfilesList=new HashSet<String>();

			for (int i = 0; i < actAvalilableProfilesListCount; i++) 
			{
				String profile=createRoleAvailableProfilesList.get(i).getText();

				ProfilesList.add(profile);
			}

			String actProfilesList = ProfilesList.toString();

			String expProfilesList = excelReader.getCellData(xlSheetName, 99, 7);

			excelReader.setCellData(xlfile, xlSheetName, 99, 8, actProfilesList);

			System.err.println("assignedProfilesArea : "+assignedProfilesArea.getText().isEmpty());

			boolean assignedProfilesAreaCount = assignedProfilesArea.getText().isEmpty();

			String actassignedProfilesArea = Boolean.toString(assignedProfilesAreaCount);	  

			String expassignedProfilesArea = excelReader.getCellData(xlSheetName, 100, 7);

			excelReader.setCellData(xlfile, xlSheetName, 100, 8, actassignedProfilesArea);

			System.out.println(actProfilesList);
			System.out.println(expProfilesList);

			System.out.println("AssignedProfilesListCount   : "+actassignedProfilesArea+"  value expected  "+expassignedProfilesArea);

			if (actProfilesList.equals(expProfilesList) && actassignedProfilesArea.equalsIgnoreCase(expassignedProfilesArea)) 
			{
				System.out.println(" Pass :  All Profile IS Displayed in Assign New Profiles Area ");
				excelReader.setCellData(xlfile, xlSheetName, 99, 9, resPass);
				return true;
			}
			else
			{
				System.out.println(" Fail :  All Profile IS Displayed in Assigne New Profiles Area ");
				excelReader.setCellData(xlfile, xlSheetName, 99, 9, resFail);
				return false;
			}
		
	}

	public boolean  checkSavebuttonwithoutselectingPasswordProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
			createRoleRoleNameCombo.click();
			createRoleRoleNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 101, 6));
			createRoleRoleNameCombo.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
			createRoleSaveicon.click();

			String expMessage=excelReader.getCellData(xlSheetName, 101, 7);

			String actMessage=checkValidationMessage(expMessage);

			excelReader.setCellData(xlfile, xlSheetName, 101, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 101, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 101, 9, resFail);
				return false;
			}
		
	}
	public boolean  checkSavebuttonwithoutselectingAssignedProfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
			Select s=new Select(createRolePasswordPolicyDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlSheetName, 102, 6));

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
			createRoleSaveicon.click();

			String expMessage=excelReader.getCellData(xlSheetName, 102, 7);

			String actMessage=checkValidationMessage(expMessage);

			excelReader.setCellData(xlfile, xlSheetName, 102, 8, actMessage);

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
	createRoleCloseIcon.click();
			 */
			if (actMessage.equalsIgnoreCase(expMessage))
			{
				excelReader.setCellData(xlfile, xlSheetName, 102, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 102, 9, resFail);
				return false;
			}
		
	}



	@FindBy(xpath="//*[@id='AddrestrictionsDiv']/li[1]/label/span")
	public static WebElement CRAddAlwaysSuspendOnSavingChkBox;

	@FindBy(xpath="//*[@id='AddrestrictionsDiv']/li[2]/label/span")
	public static WebElement CRAddHideMenuChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='Deletedocumentscreatedbyothers']")
	public static WebElement CRAddDeleteDocumentsCreatedByOthersChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='Deleteauthorizeddocuments']")
	public static WebElement CRAddDeleteAuthorizedDocumentsChkBox;

	@FindBy(xpath="//div[@class='Fcheckbox']/label/input[@name='EditSuspendedDocuments']")
	public static WebElement CRAddEditSuspendedDocumentsChkBox;

	@FindBy(xpath="//*[@id='Exclmenu']/li[3]/ul//li/a")
	public static List<WebElement> exclusionsTabInventoryMenusList;

	@FindBy(xpath="//*[@id='Exclmenu']/li[3]/ul/li[1]/ul//li/a")
	public static List<WebElement> exclusionsTabInventoryTransactionsMenusList;

	@FindBy(xpath="//*[@id='ExclrestrictionsDiv']/li//label[text()='Save']//span")
	public static WebElement CreateRoleSaveChkBox;

	@FindBy(xpath="//*[@id='ExclrestrictionsDiv']/li//label[text()='Access']//span")
	public static WebElement CreateRoleAccessChkBox;

	@FindBy(xpath="//*[@id='ExclrestrictionsDiv']/li//label[text()='Edit']//span")
	public static WebElement CreateRoleEditChkBox;
	
	@FindBy(xpath="//*[@id='ExclrestrictionsDiv']/li//label[text()='Edit']//input")
	public static WebElement CreateRoleEditChkBoxSelected;



	public boolean  checkSaveingRoleWithAllfieldsInAllTabs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
			createRoleRoleNameCombo.click();

			createRoleRoleNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 103, 6));
			createRoleRoleNameCombo.sendKeys(Keys.TAB);
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
			Select s=new Select(createRolePasswordPolicyDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlSheetName, 104, 6));

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfile));
			avaliableAllProfile.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
			createRoleMOveFiledsFromLeftSideToRightSide.click();

			Thread.sleep(2000);

			int actAssignedProfilesListCount=assignedProfileList.size();

			Set<String> AssignedProfilesList=new HashSet<String>();

			for (int i = 0; i < actAssignedProfilesListCount; i++) 
			{
				String profile=assignedProfileList.get(i).getText();
				Thread.sleep(2000);
				AssignedProfilesList.add(profile);
			}

			String actAssignedProfilesList = AssignedProfilesList.toString();

			String expAssignedProfilesList = excelReader.getCellData(xlSheetName, 105, 7);

			excelReader.setCellData(xlfile, xlSheetName, 105, 8, actAssignedProfilesList);


			boolean actavailableProfilesAreaCount = availableProfilesArea.getText().isEmpty();

			String actavailableProfilesArea = Boolean.toString(actavailableProfilesAreaCount);

			/*int actAvalilableProfilesListCount=createRoleAvailableProfilesList.size();

	  Set<String> ProfilesList=new HashSet<String>();

	  for (int i = 0; i < actAvalilableProfilesListCount; i++) 
	  {
		  String profile=createRoleAvailableProfilesList.get(i).getText();

		  ProfilesList.add(profile);
	  }

	  String actProfilesList = ProfilesList.toString();*/

			String expavailableProfilesArea = excelReader.getCellData(xlSheetName, 106, 7);

			excelReader.setCellData(xlfile, xlSheetName, 106, 8, actavailableProfilesArea);

			System.out.println(actAssignedProfilesList);
			System.out.println(expAssignedProfilesList);

			System.out.println(actavailableProfilesArea);
			System.out.println(expavailableProfilesArea);


			//Additions Tab
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(additionTab));
			additionTab.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleAddTabFinancialsMenu));
			createRoleAddTabFinancialsMenu.click();

			Thread.sleep(2000);

			int actFinancialMenusCount=additionTabFinancialsMenuList.size();

			Set<String> FinancialMenusList=new HashSet<String>();

			for (int i = 0; i < actFinancialMenusCount; i++) 
			{
				String profile=additionTabFinancialsMenuList.get(i).getText();

				FinancialMenusList.add(profile);
			}

			String actFinancialMenusList = FinancialMenusList.toString();

			String expFinancialMenusList = excelReader.getCellData(xlSheetName, 107, 7);

			excelReader.setCellData(xlfile, xlSheetName, 107, 8, actFinancialMenusList);

			System.out.println(actFinancialMenusList);
			System.out.println(expFinancialMenusList);



			for (int i = 0; i < actFinancialMenusCount; i++) 
			{
				String text=additionTabFinancialsMenuList.get(i).getText();

				if (text.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 108, 6))) 
				{
					additionTabFinancialsMenuList.get(i).click();
				}
			}

			Thread.sleep(2000);

			int actTransactionsMenusCount=additionTabFinancialsTransactionMenusList.size();

			Set<String> TransactionsMenusList=new HashSet<String>();

			for (int i = 0; i < actTransactionsMenusCount; i++) 
			{
				String profile=additionTabFinancialsTransactionMenusList.get(i).getText();

				TransactionsMenusList.add(profile);
			}

			String actTransactionsMenusList = TransactionsMenusList.toString();

			String expTransactionsMenusList = excelReader.getCellData(xlSheetName, 108, 7);

			excelReader.setCellData(xlfile, xlSheetName, 108, 8, actTransactionsMenusList);

			System.out.println(actTransactionsMenusList);
			System.out.println(expTransactionsMenusList);




			for (int i = 0; i < actTransactionsMenusCount; i++) 
			{
				String text=additionTabFinancialsTransactionMenusList.get(i).getText();

				if (text.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 109, 6))) 
				{
					additionTabFinancialsTransactionMenusList.get(i).click();
				}
			}

			Thread.sleep(2000);

			int actPurchasesMenusCount=additionTabFinancialsTransactionsPurchasesMenusList.size();

			Set<String> PurchasesMenusList=new HashSet<String>();

			for (int i = 0; i < actPurchasesMenusCount; i++) 
			{
				String profile=additionTabFinancialsTransactionsPurchasesMenusList.get(i).getText();

				PurchasesMenusList.add(profile);
			}

			String actPurchasesMenusList = PurchasesMenusList.toString();

			String expPurchasesMenusList = "[Purchases Returns, Purchases Vouchers, Purchase Voucher VAT]";

			excelReader.setCellData(xlfile, xlSheetName, 109, 8, actPurchasesMenusList);

			System.out.println("actPurchasesMenusList: "+actPurchasesMenusList);
			System.out.println("expPurchasesMenusList: "+expPurchasesMenusList);



			for (int i = 0; i < actPurchasesMenusCount; i++) 
			{
				String text=additionTabFinancialsTransactionsPurchasesMenusList.get(i).getText();

				if (text.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 110, 6))) //purchase voucher
				{
					additionTabFinancialsTransactionsPurchasesMenusList.get(i).click();
				}
			}

			Thread.sleep(2000);

			boolean actCRAddAlwaysSuspendOnSavingChkBox				=CRAddAlwaysSuspendOnSavingChkBox.isDisplayed();
			boolean actCRAddHideMenuChkBox							=CRAddHideMenuChkBox.isDisplayed();
			/*boolean actCRAddDeleteDocumentsCreatedByOthersChkBox		=CRAddDeleteDocumentsCreatedByOthersChkBox.isDisplayed();
	  boolean actCRAddDeleteAuthorizedDocumentsChkBox			=CRAddDeleteAuthorizedDocumentsChkBox.isDisplayed();
	  boolean actCRAddEditSuspendedDocumentsChkBox				=CRAddEditSuspendedDocumentsChkBox.isDisplayed();*/

			boolean expCRAddAlwaysSuspendOnSavingChkBox				=true;
			boolean expCRAddHideMenuChkBox							=true;
			/*boolean expCRAddDeleteDocumentsCreatedByOthersChkBox		=true;
	  boolean expCRAddDeleteAuthorizedDocumentsChkBox			=true;
	  boolean expCRAddEditSuspendedDocumentsChkBox				=true;*/

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleAddTabSelectAllChkBox));
			createRoleAddTabSelectAllChkBox.click();

			Thread.sleep(2000);

			boolean PurchaseVoucherChkbox = actCRAddAlwaysSuspendOnSavingChkBox==expCRAddAlwaysSuspendOnSavingChkBox && actCRAddHideMenuChkBox==expCRAddHideMenuChkBox /*&&
			    					     actCRAddDeleteDocumentsCreatedByOthersChkBox==expCRAddDeleteDocumentsCreatedByOthersChkBox && 
			    					     actCRAddDeleteAuthorizedDocumentsChkBox==expCRAddDeleteAuthorizedDocumentsChkBox && actCRAddEditSuspendedDocumentsChkBox==expCRAddEditSuspendedDocumentsChkBox*/;

			String actPurchaseVoucherChkbox = Boolean.toString(PurchaseVoucherChkbox);

			String expPurchaseVoucherChkbox = excelReader.getCellData(xlSheetName, 110, 7);

			excelReader.setCellData(xlfile, xlSheetName, 110, 8, actPurchaseVoucherChkbox);

			System.out.println("CRAddAlwaysSuspendOnSavingChkBox           : "+actCRAddAlwaysSuspendOnSavingChkBox          +"  value expected  "+expCRAddAlwaysSuspendOnSavingChkBox);
			System.out.println("CRAddHideMenuChkBox                        : "+actCRAddHideMenuChkBox                       +"  value expected  "+expCRAddHideMenuChkBox);
			/*System.out.println("CRAddDeleteDocumentsCreatedByOthersChkBox  : "+actCRAddDeleteDocumentsCreatedByOthersChkBox +"  value expected  "+expCRAddDeleteDocumentsCreatedByOthersChkBox);
	  System.out.println("CRAddDeleteAuthorizedDocumentsChkBox       : "+actCRAddDeleteAuthorizedDocumentsChkBox      +"  value expected  "+expCRAddDeleteAuthorizedDocumentsChkBox);
	  System.out.println("CRAddEditSuspendedDocumentsChkBox          : "+actCRAddEditSuspendedDocumentsChkBox         +"  value expected  "+expCRAddEditSuspendedDocumentsChkBox);*/

			System.out.println("PurchaseVoucherChkbox  : "+actPurchaseVoucherChkbox+"  value expected  "+expPurchaseVoucherChkbox);


			//Exclusions Tab
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exclusionsTab));
			exclusionsTab.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleExclTabInventoryMenu));
			createRoleExclTabInventoryMenu.click();

			Thread.sleep(2000);

			int actInventoryMenusCount=exclusionsTabInventoryMenusList.size();

			Set<String> InventoryMenusList=new HashSet<String>();

			for (int i = 0; i < actInventoryMenusCount; i++) 
			{
				String menu=exclusionsTabInventoryMenusList.get(i).getText();

				InventoryMenusList.add(menu);
			}

			String actInventoryMenusList = InventoryMenusList.toString();

			String expInventoryMenusList = excelReader.getCellData(xlSheetName, 111, 7);

			excelReader.setCellData(xlfile, xlSheetName, 111, 8, actInventoryMenusList);

			System.out.println(actInventoryMenusList);
			System.out.println(expInventoryMenusList);


			for (int i = 0; i < actInventoryMenusCount; i++) 
			{
				String menu=exclusionsTabInventoryMenusList.get(i).getText();

				if (menu.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 112, 6))) 
				{
					exclusionsTabInventoryMenusList.get(i).click();
				}
			}

			Thread.sleep(2000);

			int actInventoryTransactionsMenusCount=exclusionsTabInventoryTransactionsMenusList.size();

			Set<String> InventoryTransactionsMenusList=new HashSet<String>();

			for (int i = 0; i < actInventoryTransactionsMenusCount; i++) 
			{
				String menu=exclusionsTabInventoryTransactionsMenusList.get(i).getText();

				InventoryTransactionsMenusList.add(menu);
			}

			String actInventoryTransactionsMenusList = InventoryTransactionsMenusList.toString();

			String expInventoryTransactionsMenusList = excelReader.getCellData(xlSheetName, 112, 7);

			excelReader.setCellData(xlfile, xlSheetName, 112, 8, actInventoryTransactionsMenusList);

			System.out.println(actInventoryTransactionsMenusList);
			System.out.println(expInventoryTransactionsMenusList);



			for (int i = 0; i < actInventoryTransactionsMenusCount; i++) 
			{
				String menu=exclusionsTabInventoryTransactionsMenusList.get(i).getText();

				if (menu.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 113, 6))) 
				{
					exclusionsTabInventoryTransactionsMenusList.get(i).click();
				}
			}

			Thread.sleep(2000);

			boolean actCreateRoleSaveChkBox			=CreateRoleSaveChkBox.isDisplayed();
			boolean actCreateRoleAccessChkBox			=CreateRoleAccessChkBox.isDisplayed();
			boolean actCreateRoleEditChkBox			=CreateRoleEditChkBox.isDisplayed();

			boolean expCreateRoleSaveChkBox			=true;
			boolean expCreateRoleAccessChkBox			=true;
			boolean expCreateRoleEditChkBox			=true;

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleExclTabUnSelectAllChkBox));
			createRoleExclTabUnSelectAllChkBox.click();

			boolean StockAllocationChkbox = actCreateRoleSaveChkBox==expCreateRoleSaveChkBox && actCreateRoleAccessChkBox==expCreateRoleAccessChkBox &&
					actCreateRoleEditChkBox==expCreateRoleEditChkBox;

			String actStockAllocationChkbox = Boolean.toString(StockAllocationChkbox);

			String expStockAllocationChkbox = excelReader.getCellData(xlSheetName, 113, 7);

			excelReader.setCellData(xlfile, xlSheetName, 113, 8, actStockAllocationChkbox);

			System.out.println("CreateRoleSaveChkBox    : "+actCreateRoleSaveChkBox    +"  value expected  "+expCreateRoleSaveChkBox);
			System.out.println("CreateRoleAccessChkBox  : "+actCreateRoleAccessChkBox  +"  value expected  "+expCreateRoleAccessChkBox);
			System.out.println("CreateRoleEditChkBox    : "+actCreateRoleEditChkBox    +"  value expected  "+expCreateRoleEditChkBox);

			System.out.println("StockAllocationChkbox  : "+actStockAllocationChkbox+"  value expected  "+expStockAllocationChkbox);



			//Restriction For Entry Tab

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
			createRoleRestrictionForEntryTab.click();

			Thread.sleep(2000);

			int actRestrictionForEntryMastersListCount=createRoleRestrictionForEntryTabMastersList.size();

			for (int i = 0; i < actRestrictionForEntryMastersListCount; i++) 
			{
				String masters=createRoleRestrictionForEntryTabMastersList.get(i).getText();

				if (masters.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 114, 6))) 
				{
					createRoleRestrictionForEntryTabMastersList.get(i).click();  
				}
			}


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTabExclChkBox));
			createRoleRestrictionForEntryTabExclChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictionForEntryTabTableSelectRow1Col1));
			restrictionForEntryTabTableSelectRow1Col1.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictionForEntryTabTableEnterMasterTxt));
			String v = excelReader.getCellData(xlSheetName, 115, 6);
			restrictionForEntryTabTableEnterMasterTxt.sendKeys(v);

			int actSize=restrictionForEntryTabTableMasterComboList.size();

			for (int i = 0; i < actSize; i++) 
			{
				String actMasters=restrictionForEntryTabTableMasterComboList.get(i).getText();

				if (actMasters.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 116, 6))) 
				{
					restrictionForEntryTabTableMasterComboList.get(i).click();
					Thread.sleep(2000);
					restrictionForEntryTabTableEnterMasterTxt.sendKeys(Keys.TAB);
					break;
				}
			}

			Thread.sleep(2000);

			boolean actrestrictionForEntryTabRow1EntryChkBox				=restrictionForEntryTabRow1EntryChkBox.isDisplayed();
			boolean actrestrictionForEntryTabRow1ReportChkBox				=restrictionForEntryTabRow1ReportChkBox.isDisplayed();
			boolean actrestrictionForEntryTabRow1ViewChkBox				    =restrictionForEntryTabRow1ViewChkBox.isDisplayed();

			boolean exprestrictionForEntryTabRow1EntryChkBox				=true;
			boolean exprestrictionForEntryTabRow1ReportChkBox				=true;
			boolean exprestrictionForEntryTabRow1ViewChkBox				=true;

			boolean restrictionForEntryChkboxs = actrestrictionForEntryTabRow1EntryChkBox==exprestrictionForEntryTabRow1EntryChkBox && 
					actrestrictionForEntryTabRow1ReportChkBox==exprestrictionForEntryTabRow1ReportChkBox &&
					actrestrictionForEntryTabRow1ViewChkBox==exprestrictionForEntryTabRow1ViewChkBox;

			String actRestrictionForEntryChkboxs = Boolean.toString(restrictionForEntryChkboxs);

			String expRestrictionForEntryChkboxs = excelReader.getCellData(xlSheetName, 115, 7);

			excelReader.setCellData(xlfile, xlSheetName, 115, 8, actRestrictionForEntryChkboxs);

			System.out.println("restrictionForEntryTabRow1EntryChkBox  : "+actrestrictionForEntryTabRow1EntryChkBox  +"  value expected  "+exprestrictionForEntryTabRow1EntryChkBox);
			System.out.println("restrictionForEntryTabRow1ReportChkBox : "+actrestrictionForEntryTabRow1ReportChkBox +"  value expected  "+exprestrictionForEntryTabRow1ReportChkBox);
			System.out.println("restrictionForEntryTabRow1ViewChkBox   : "+actrestrictionForEntryTabRow1ViewChkBox   +"  value expected  "+exprestrictionForEntryTabRow1ViewChkBox);

			restrictionForEntryTabRow1EntryChkBox.click();
			Thread.sleep(1000);
			restrictionForEntryTabRow1ReportChkBox.click();
			Thread.sleep(1000);
			restrictionForEntryTabRow1ViewChkBox.click();




			//Restriction For Trees
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictionforTreesTab));
			restrictionforTreesTab.click();

			Thread.sleep(2000);

			int actRestrictionForTreesMastersListCount=createRoleRestrictionForTreesTabMastersList.size();

			for (int i = 0; i < actRestrictionForTreesMastersListCount; i++) 
			{
				String masters=createRoleRestrictionForTreesTabMastersList.get(i).getText();

				if (masters.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 117, 6))) 
				{
					createRoleRestrictionForTreesTabMastersList.get(i).click();  
				}
			}
			
			Thread.sleep(3000);
			boolean actrestrictionForTreesTabDefaultChkBox		=restrictionForTreesTabDefaultChkBox.isDisplayed();

			boolean exprestrictionForTreesTabDefaultChkBox		=true;

			boolean RestrictionForTreesDefaultChkbox = actrestrictionForTreesTabDefaultChkBox==exprestrictionForTreesTabDefaultChkBox;

			String actRestrictionForTreesDefaultChkbox = Boolean.toString(RestrictionForTreesDefaultChkbox);

			String expRestrictionForTreesDefaultChkbox = excelReader.getCellData(xlSheetName, 117, 7);

			excelReader.setCellData(xlfile, xlSheetName, 117, 8, actRestrictionForTreesDefaultChkbox);


			System.out.println("restrictionForTreesTabDefaultChkBox : "+actrestrictionForTreesTabDefaultChkBox+"  value expected  "+exprestrictionForTreesTabDefaultChkBox);

			restrictionForTreesTabDefaultChkBox.click();

			// Transaction Rights Tab
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionRightsTab));
			transactionRightsTab.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowBillWiseOnAccountChkBox));
			allowBillWiseOnAccountChkBox.click();

			Select budgetLimitWarning= new Select(budgetLimitWarningDropdown);
			budgetLimitWarning.selectByVisibleText(excelReader.getCellData(xlSheetName, 119, 6));
			Thread.sleep(2000);

			Select creditLimitWarning= new Select(creditLimitWarningDropdown);
			creditLimitWarning.selectByVisibleText(excelReader.getCellData(xlSheetName, 120, 6));
			Thread.sleep(2000);
			
			boolean actnegativeCashCheckDropdown = negativeCashCheckDropdown.isDisplayed();
			boolean expnegativeCashCheckDropdown = true;
			
			System.out.println("actnegativeCashCheckDropdown: "+actnegativeCashCheckDropdown);
			
			System.out.println("expnegativeCashCheckDropdown: "+expnegativeCashCheckDropdown);
			
			/*Thread.sleep(2000);
			Select negativeCashCheck= new Select(negativeCashCheckDropdown);
			negativeCashCheck.selectByVisibleText(excelReader.getCellData(xlSheetName, 121, 6));*/
			Thread.sleep(2000);
			Select negativeStockCheck= new Select(negativeStockCheckDropdown);
			negativeStockCheck.selectByVisibleText(excelReader.getCellData(xlSheetName, 122, 6));
			Thread.sleep(2000);
			cantaddfutureTransChkbox.click();

			cannotAddTransThatAreMoreThanTxt.click();
			cannotAddTransThatAreMoreThanTxt.clear();
			cannotAddTransThatAreMoreThanTxt.sendKeys(excelReader.getCellData(xlSheetName, 123, 6));
			Thread.sleep(2000);
			cannotEditPreviousMonthEntriesAfterTxt.click();
			cannotEditPreviousMonthEntriesAfterTxt.clear();
			cannotEditPreviousMonthEntriesAfterTxt.sendKeys(excelReader.getCellData(xlSheetName, 124, 6));
			Thread.sleep(2000);
			CantEditTransthatAreremorethanTxt.click();
			CantEditTransthatAreremorethanTxt.clear();
			CantEditTransthatAreremorethanTxt.sendKeys(excelReader.getCellData(xlSheetName, 125, 6));
			Thread.sleep(2000);
			CantAddPrevMnthEntriesaftTxt.click();
			CantAddPrevMnthEntriesaftTxt.clear();
			CantAddPrevMnthEntriesaftTxt.sendKeys(excelReader.getCellData(xlSheetName, 126, 6));
			Thread.sleep(2000);
			CantPrintAfterValueTxt.click();
			CantPrintAfterValueTxt.clear();
			CantPrintAfterValueTxt.sendKeys(excelReader.getCellData(xlSheetName, 127, 6));
			Thread.sleep(2000);
			Select CantPrintAfterValue= new Select(cantPrintAfterValueDropdown);
			CantPrintAfterValue.selectByVisibleText(excelReader.getCellData(xlSheetName, 128, 6));
			Thread.sleep(2000);
			CantRePrintAfterValueTxt.click();
			CantRePrintAfterValueTxt.clear();
			CantRePrintAfterValueTxt.sendKeys(excelReader.getCellData(xlSheetName, 129, 6));
			
			Thread.sleep(2000);
			Select CantRePrintAfterValue= new Select(CantRePrintAfterDropdown);
			CantRePrintAfterValue.selectByVisibleText(excelReader.getCellData(xlSheetName, 130, 6));

			doNotAllowMasterCustomization.click();


			Thread.sleep(2000);
			//AI Rights
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AIRightsTab));
			AIRightsTab.click();

			Thread.sleep(2000);

			AIRightsEnableVUIChkBox.click();

			AIRightsEnableAIChkBox.click();
			Thread.sleep(2000);
			NoOfVoiceCommandsPermittedTxt.click();
			NoOfVoiceCommandsPermittedTxt.clear();
			NoOfVoiceCommandsPermittedTxt.sendKeys(excelReader.getCellData(xlSheetName, 131, 6));
			Thread.sleep(2000);
			NoOfTextCommandsPermittedTxt.click();
			NoOfTextCommandsPermittedTxt.clear();
			NoOfTextCommandsPermittedTxt.sendKeys(excelReader.getCellData(xlSheetName, 132, 6));
			Thread.sleep(2000);
			AIRightsSalesChkBox.click();
			AIRightsSalesOrderChkBox.click();
			AIRightsStockChkBox.click();
			AIRightsPurchasesChkBox.click();
			AIRightsPurchasesOrdersChkBox.click();
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
			createRoleSaveicon.click();

			String expMessage=excelReader.getCellData(xlSheetName, 133, 7);

			String actMessage=errorMessage.getText();


			String ExpMessage = "";
			String ActMessage =checkValidationMessage(ExpMessage);

			excelReader.setCellData(xlfile, xlSheetName, 133, 8, actMessage);

			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
	  createRoleCloseIcon.click();*/

			System.out.println("actAssignedProfilesList : "+actAssignedProfilesList);
			System.out.println("expAssignedProfilesList : "+expAssignedProfilesList);

			System.out.println("actProfilesList : "+actavailableProfilesArea);
			System.out.println("expProfilesList : "+expavailableProfilesArea);

			System.out.println("actFinancialMenusList : "+actFinancialMenusList);
			System.out.println("expFinancialMenusList : "+expFinancialMenusList);

			System.out.println("actTransactionsMenusList : "+actTransactionsMenusList);
			System.out.println("expTransactionsMenusList : "+expTransactionsMenusList);

			System.out.println("actPurchasesMenusList : "+actPurchasesMenusList);
			System.out.println("expPurchasesMenusList : "+expPurchasesMenusList);

			System.out.println("PurchaseVoucherChkbox : "+actPurchaseVoucherChkbox+"  value expected  "+expPurchaseVoucherChkbox);

			System.out.println("actInventoryMenusList : "+actInventoryMenusList);
			System.out.println("expInventoryMenusList : "+expInventoryMenusList);

			System.out.println("actInventoryTransactionsMenusList : "+actInventoryTransactionsMenusList);
			System.out.println("expInventoryTransactionsMenusList : "+expInventoryTransactionsMenusList);

			System.out.println("StockAllocationChkbox : "+actStockAllocationChkbox+"  value expected  "+expStockAllocationChkbox);

			System.out.println("RestrictionForEntryChkboxs : "+actRestrictionForEntryChkboxs+"  value expected  "+expRestrictionForEntryChkboxs);

			System.out.println("RestrictionForTreesDefaultChkbox : "+actRestrictionForTreesDefaultChkbox+"  value expected  "+expRestrictionForTreesDefaultChkbox);

			System.out.println("Error Message : "+actMessage+"  value expected  "+expMessage);

			if (actAssignedProfilesList.equalsIgnoreCase(expAssignedProfilesList) && actavailableProfilesArea.equalsIgnoreCase(expavailableProfilesArea) && actFinancialMenusList.equalsIgnoreCase(expFinancialMenusList) &&
					actTransactionsMenusList.equalsIgnoreCase(expTransactionsMenusList) && actPurchasesMenusList.equalsIgnoreCase(expPurchasesMenusList) && 
					actPurchaseVoucherChkbox.equalsIgnoreCase(expPurchaseVoucherChkbox) && actInventoryMenusList.equalsIgnoreCase(expInventoryMenusList) &&
					actInventoryTransactionsMenusList.equalsIgnoreCase(expInventoryTransactionsMenusList) && actStockAllocationChkbox.equalsIgnoreCase(expStockAllocationChkbox) &&
					actRestrictionForEntryChkboxs.equalsIgnoreCase(expRestrictionForEntryChkboxs) && actRestrictionForTreesDefaultChkbox.equalsIgnoreCase(expRestrictionForTreesDefaultChkbox) &&
					actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 103, 9, resPass);
				res= true;
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 103, 9, resFail);
				res= true;
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 103, 10, exception);

			System.err.println(e.getMessage());

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ServerErrorPopupCloseBtn));
			ServerErrorPopupCloseBtn.click();

			getDriver().navigate().refresh();

			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securitymenu));
			securitymenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMenu));
			createRoleMenu.click();

			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
			createRoleRoleNameCombo.click();

			createRoleRoleNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 103, 6));
			createRoleRoleNameCombo.sendKeys(Keys.TAB);
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
			Select s=new Select(createRolePasswordPolicyDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlSheetName, 104, 6));

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfile));
			avaliableAllProfile.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
			createRoleMOveFiledsFromLeftSideToRightSide.click();


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
			createRoleSaveicon.click();

			String expMessage=excelReader.getCellData(xlSheetName, 133, 7);

			String actMessage=errorMessage.getText();

			excelReader.setCellData(xlfile, xlSheetName, 133, 8, actMessage);

			res = false;

			return false;
		}
	}

	boolean res = false;

	@FindBy (xpath="//div[@id='id_focus_msgbox_main']")
	public static WebElement ServerErrorPopup;

	@FindBy (xpath="//div[@id='id_focus_msgbox_title']/div[2]/span")
	public static WebElement ServerErrorPopupCloseBtn;

	@FindBy (xpath="//*[@id='id_focus_msgbox_detail']/span/h2/i")
	public static WebElement ServerErrorPopupTxt;



	public boolean checkCompareSavedRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
	homeSecurityMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
	homeSecurityCreateRoleMenu.click();

	Thread.sleep(5000);

			 */

			if(res)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
				createRoleRoleNameCombo.click();
				Thread.sleep(2000);
				createRoleRoleNameCombo.sendKeys(Keys.SPACE);

				int roleNamesCount=createRoleRoleNameComboList.size();

				for (int i = 0; i < roleNamesCount; i++) 
				{
					String roleName=createRoleRoleNameComboList.get(i).getText();

					if (roleName.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 135, 6))) 
					{
						createRoleRoleNameComboList.get(i).click();

						createRoleRoleNameCombo.sendKeys(Keys.TAB);

						break;
					}
				}

				Thread.sleep(2000);

				String actRoleName=createRoleRoleNameCombo.getAttribute("data-focustext");

				String expRoleName=excelReader.getCellData(xlSheetName, 135, 7);

				excelReader.setCellData(xlfile, xlSheetName, 135, 8, actRoleName);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
				Select s=new Select(createRolePasswordPolicyDropdown);

				String actPwPolicySelected=s.getFirstSelectedOption().getText();

				String expPwPolicySelected=excelReader.getCellData(xlSheetName, 136, 7);

				excelReader.setCellData(xlfile, xlSheetName, 136, 8, actPwPolicySelected);


				int AssignedProfilesListCount = assignedProfileList.size();

				String actAssignedProfilesListCount = Integer.toString(AssignedProfilesListCount);

				String expAssignedProfilesListCount=excelReader.getCellData(xlSheetName, 137, 7);

				excelReader.setCellData(xlfile, xlSheetName, 137, 8, actAssignedProfilesListCount);


				Set<String> AssignedProfilesList=new HashSet<String>();

				for (int i = 0; i < AssignedProfilesListCount; i++) 
				{
					String profile=assignedProfileList.get(i).getText();

					AssignedProfilesList.add(profile);
				}

				String actAssignedProfilesList = AssignedProfilesList.toString();

				String expAssignedProfilesList = excelReader.getCellData(xlSheetName, 138, 7);

				excelReader.setCellData(xlfile, xlSheetName, 138, 8, actAssignedProfilesList);


				/*int AvalilableProfilesListCount=createRoleAvailableProfilesList.size();

	  String actAvalilableProfilesListCount = Integer.toString(AvalilableProfilesListCount);

	  String expAvalilableProfilesListCount = excelReader.getCellData(xlSheetName, 139, 7);

	  excelReader.setCellData(xlfile, xlSheetName, 139, 8, actAvalilableProfilesListCount);*/

				boolean actavailableProfilesAreaCount = availableProfilesArea.getText().isEmpty();

				String actavailableProfilesArea = Boolean.toString(actavailableProfilesAreaCount);

				/* Set<String> ProfilesList=new HashSet<String>();

	  for (int i = 0; i < AvalilableProfilesListCount; i++) 
	  {
		  String profile=createRoleAvailableProfilesList.get(i).getText();

		  ProfilesList.add(profile);
	  }

	  String actProfilesList = ProfilesList.toString();*/

				String expavailableProfilesArea = excelReader.getCellData(xlSheetName, 140, 7);

				excelReader.setCellData(xlfile, xlSheetName, 140, 8, actavailableProfilesArea);

				System.out.println("createRoleRoleNameCombo          : "+actRoleName                    +"  value expected  "+expRoleName );
				System.out.println("createRolePasswordPolicyDropdown : "+actPwPolicySelected            +"  value expected  "+expPwPolicySelected);
				System.out.println("AssignedProfilesListCount        : "+actAssignedProfilesListCount   +"  value expected  "+expAssignedProfilesListCount);
				System.out.println(actAssignedProfilesList);
				System.out.println(expAssignedProfilesList);
				// System.out.println("AvalilableProfilesListCount      : "+actAvalilableProfilesListCount +"  value expected  "+expAvalilableProfilesListCount);
				System.out.println(actavailableProfilesArea);
				System.out.println(expavailableProfilesArea);

				//Additions Tab
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(additionTab));
				additionTab.click();

				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleAddTabFinancialsMenu));
				createRoleAddTabFinancialsMenu.click();

				Thread.sleep(2000);

				int actFinancialMenusCount=additionTabFinancialsMenuList.size();

				for (int i = 0; i < actFinancialMenusCount; i++) 
				{
					String text=additionTabFinancialsMenuList.get(i).getText();

					if (text.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 141, 6))) 
					{
						additionTabFinancialsMenuList.get(i).click();
					}

				}

				Thread.sleep(2000);

				int actTransactionsMenusCount=additionTabFinancialsTransactionMenusList.size();

				for (int i = 0; i < actTransactionsMenusCount; i++) 
				{
					String text=additionTabFinancialsTransactionMenusList.get(i).getText();

					if (text.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 142, 6))) 
					{
						additionTabFinancialsTransactionMenusList.get(i).click();
					}
				}

				Thread.sleep(2000);

				int actPurchasesMenusCount=additionTabFinancialsTransactionsPurchasesMenusList.size();

				for (int i = 0; i < actPurchasesMenusCount; i++) 
				{
					String text=additionTabFinancialsTransactionsPurchasesMenusList.get(i).getText();

					if (text.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 143, 6))) 
					{
						additionTabFinancialsTransactionsPurchasesMenusList.get(i).click();
					}
				}

				Thread.sleep(3000);

				boolean actCRAddAlwaysSuspendOnSavingChkBox					=CRAddAlwaysSuspendOnSavingChkBox.isSelected();
				boolean actCRAddHideMenuChkBox								=CRAddHideMenuChkBox.isSelected();
				/*boolean actCRAddDeleteDocumentsCreatedByOthersChkBox			=CRAddDeleteDocumentsCreatedByOthersChkBox.isSelected();
	  boolean actCRAddDeleteAuthorizedDocumentsChkBox				=CRAddDeleteAuthorizedDocumentsChkBox.isSelected();
	  boolean actCRAddEditSuspendedDocumentsChkBox					=CRAddEditSuspendedDocumentsChkBox.isSelected();*/

				Thread.sleep(2000);

				boolean expCRAddAlwaysSuspendOnSavingChkBox					=true;
				boolean expCRAddHideMenuChkBox								=true;
				/* boolean expCRAddDeleteDocumentsCreatedByOthersChkBox			=true;
	  boolean expCRAddDeleteAuthorizedDocumentsChkBox				=true;
	  boolean expCRAddEditSuspendedDocumentsChkBox					=true;*/

				boolean additionsTabRestrictionsChkboxs = actCRAddAlwaysSuspendOnSavingChkBox==expCRAddAlwaysSuspendOnSavingChkBox && actCRAddHideMenuChkBox==expCRAddHideMenuChkBox /*&&
			    								actCRAddDeleteDocumentsCreatedByOthersChkBox==expCRAddDeleteDocumentsCreatedByOthersChkBox && 
			    								actCRAddDeleteAuthorizedDocumentsChkBox==expCRAddDeleteAuthorizedDocumentsChkBox && actCRAddEditSuspendedDocumentsChkBox==expCRAddEditSuspendedDocumentsChkBox*/;

				String actAdditionsTabRestrictionsChkboxs = Boolean.toString(additionsTabRestrictionsChkboxs);

				String expAdditionsTabRestrictionsChkboxs = excelReader.getCellData(xlSheetName, 141, 7);

				excelReader.setCellData(xlfile, xlSheetName, 141, 8, actAdditionsTabRestrictionsChkboxs);


				System.out.println("CRAddAlwaysSuspendOnSavingChkBox           : "+actCRAddAlwaysSuspendOnSavingChkBox          +"  value expected  "+expCRAddAlwaysSuspendOnSavingChkBox);
				System.out.println("CRAddHideMenuChkBox                        : "+actCRAddHideMenuChkBox                       +"  value expected  "+expCRAddHideMenuChkBox);
				/*System.out.println("CRAddDeleteDocumentsCreatedByOthersChkBox  : "+actCRAddDeleteDocumentsCreatedByOthersChkBox +"  value expected  "+expCRAddDeleteDocumentsCreatedByOthersChkBox);
	  System.out.println("CRAddDeleteAuthorizedDocumentsChkBox       : "+actCRAddDeleteAuthorizedDocumentsChkBox      +"  value expected  "+expCRAddDeleteAuthorizedDocumentsChkBox);
	  System.out.println("CRAddEditSuspendedDocumentsChkBox          : "+actCRAddEditSuspendedDocumentsChkBox         +"  value expected  "+expCRAddEditSuspendedDocumentsChkBox);*/
				System.out.println("AdditionsTabRestrictionsChkboxs            : "+actAdditionsTabRestrictionsChkboxs           +"  value expected  "+expAdditionsTabRestrictionsChkboxs);




				//Exclusions Tab
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exclusionsTab));
				exclusionsTab.click();

				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleExclTabInventoryMenu));
				createRoleExclTabInventoryMenu.click();

				Thread.sleep(2000);

				int actInventoryMenusCount=exclusionsTabInventoryMenusList.size();

				for (int i = 0; i < actInventoryMenusCount; i++) 
				{
					String menu=exclusionsTabInventoryMenusList.get(i).getText();

					if (menu.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 144, 6))) 
					{
						exclusionsTabInventoryMenusList.get(i).click();
					}

				}

				Thread.sleep(2000);


				int actInventoryTransactionsMenusCount=exclusionsTabInventoryTransactionsMenusList.size();

				for (int i = 0; i < actInventoryTransactionsMenusCount; i++) 
				{
					String menu=exclusionsTabInventoryTransactionsMenusList.get(i).getText();

					if (menu.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 145, 6))) 
					{
						exclusionsTabInventoryTransactionsMenusList.get(i).click();
					}
				}

				Thread.sleep(2000);

				boolean actCreateRoleSaveChkBox				=CreateRoleSaveChkBox.isSelected();
				boolean actCreateRoleAccessChkBox				=CreateRoleAccessChkBox.isSelected();
				boolean actCreateRoleEditChkBox				=CreateRoleEditChkBox.isSelected();

				boolean expCreateRoleSaveChkBox				=false;
				boolean expCreateRoleAccessChkBox				=false;
				boolean expCreateRoleEditChkBox				=false;

				boolean exclusionTabRestrictionsChkbox = actCreateRoleSaveChkBox==expCreateRoleSaveChkBox && actCreateRoleAccessChkBox==expCreateRoleAccessChkBox &&
						actCreateRoleEditChkBox==expCreateRoleEditChkBox;

				String actExclusionTabRestrictionsChkbox = Boolean.toString(exclusionTabRestrictionsChkbox);

				String expExclusionTabRestrictionsChkbox = excelReader.getCellData(xlSheetName, 144, 7);

				excelReader.setCellData(xlfile, xlSheetName, 144, 8, actExclusionTabRestrictionsChkbox);

				System.out.println("CreateRoleSaveChkBox    : "+actCreateRoleSaveChkBox    +"  value expected  "+expCreateRoleSaveChkBox);
				System.out.println("CreateRoleAccessChkBox  : "+actCreateRoleAccessChkBox  +"  value expected  "+expCreateRoleAccessChkBox);
				System.out.println("CreateRoleEditChkBox    : "+actCreateRoleEditChkBox    +"  value expected  "+expCreateRoleEditChkBox);
				System.out.println("ExclusionTabRestrictionsChkbox : "+actExclusionTabRestrictionsChkbox+"  value expected  "+expExclusionTabRestrictionsChkbox);




				//Restriction For Entry Tab
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
				createRoleRestrictionForEntryTab.click();

				Thread.sleep(2000);

				int RestrictionForEntryMastersListCount=createRoleRestrictionForEntryTabMastersList.size();

				String actRestrictionForEntryMastersListCount = Integer.toString(RestrictionForEntryMastersListCount);

				String expRestrictionForEntryMastersListCount = excelReader.getCellData(xlSheetName, 146, 7);

				excelReader.setCellData(xlfile, xlSheetName, 146, 8, actRestrictionForEntryMastersListCount);

				boolean RestrictionForEntryTabExclChkBox = createRoleRestrictionForEntryTabExclChkBox.isSelected();

				String actRestrictionForEntryTabExclChkBox = Boolean.toString(RestrictionForEntryTabExclChkBox);

				String expRestrictionForEntryTabExclChkBox = excelReader.getCellData(xlSheetName, 147, 7);

				excelReader.setCellData(xlfile, xlSheetName, 147, 8, actRestrictionForEntryTabExclChkBox);


				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictionForEntryTabTableSelectRow1Col1));

				String actRow1Col1=restrictionForEntryTabTableSelectRow1Col1.getText();

				String expRow1Col1=excelReader.getCellData(xlSheetName, 148, 7);

				excelReader.setCellData(xlfile, xlSheetName, 148, 8, actRow1Col1);

				boolean actrestrictionForEntryTabRow1EntryChkBox			=restrictionForEntryTabRow1EntryChkBox.isSelected();
				boolean actrestrictionForEntryTabRow1ReportChkBox			=restrictionForEntryTabRow1ReportChkBox.isSelected();
				boolean actrestrictionForEntryTabRow1ViewChkBox			=restrictionForEntryTabRow1ViewChkBox.isSelected();

				boolean exprestrictionForEntryTabRow1EntryChkBox			=true;
				boolean exprestrictionForEntryTabRow1ReportChkBox			=true;
				boolean exprestrictionForEntryTabRow1ViewChkBox			=true;

				boolean actTableChkboxs = actrestrictionForEntryTabRow1EntryChkBox==exprestrictionForEntryTabRow1EntryChkBox && 
						actrestrictionForEntryTabRow1ReportChkBox==exprestrictionForEntryTabRow1ReportChkBox && 
						actrestrictionForEntryTabRow1ViewChkBox==exprestrictionForEntryTabRow1ViewChkBox;

				String actRestrictionForEntryTableCheckbox = Boolean.toString(actTableChkboxs);

				String expRestrictionForEntryTableCheckbox = excelReader.getCellData(xlSheetName, 149, 7);

				excelReader.setCellData(xlfile, xlSheetName, 149, 8, actRestrictionForEntryTableCheckbox);

				System.out.println("RestrictionForEntryMastersListCount : "+actRestrictionForEntryMastersListCount+"  value expected  "+expRestrictionForEntryMastersListCount);
				System.out.println("RestrictionForEntryTabExclChkBox    : "+actRestrictionForEntryTabExclChkBox   +"  value expected  "+expRestrictionForEntryTabExclChkBox);
				System.out.println("restrictionForEntryTabTableSelectRow1Col1 : "+actRow1Col1+"  value expected  "+expRow1Col1);
				System.out.println("restrictionForEntryTabRow1EntryChkBox  : "+actrestrictionForEntryTabRow1EntryChkBox  +"  value expected  "+exprestrictionForEntryTabRow1EntryChkBox);
				System.out.println("restrictionForEntryTabRow1ReportChkBox : "+actrestrictionForEntryTabRow1ReportChkBox +"  value expected  "+exprestrictionForEntryTabRow1ReportChkBox);
				System.out.println("restrictionForEntryTabRow1ViewChkBox   : "+actrestrictionForEntryTabRow1ViewChkBox   +"  value expected  "+exprestrictionForEntryTabRow1ViewChkBox);
				System.out.println("RestrictionForEntryTableCheckbox       : "+actRestrictionForEntryTableCheckbox       +"  value expected  "+expRestrictionForEntryTableCheckbox);



				//Restriction For Trees
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictionforTreesTab));
				restrictionforTreesTab.click();

				Thread.sleep(2000);

				int actRestrictionForTreesMastersListCount=createRoleRestrictionForTreesTabMastersList.size();

				for (int i = 0; i < actRestrictionForTreesMastersListCount; i++) 
				{
					String masters=createRoleRestrictionForTreesTabMastersList.get(i).getText();

					if (masters.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 150, 6))) 
					{
						createRoleRestrictionForTreesTabMastersList.get(i).click();  
					}
				}

				boolean restrictionForTreesTabDefaultChkbox=restrictionForTreesTabDefaultChkBox.isSelected();

				String actrestrictionForTreesTabDefaultChkBox = Boolean.toString(restrictionForTreesTabDefaultChkbox);

				String exprestrictionForTreesTabDefaultChkBox = excelReader.getCellData(xlSheetName, 150, 7);

				excelReader.setCellData(xlfile, xlSheetName, 150, 8, actrestrictionForTreesTabDefaultChkBox);

				System.out.println("restrictionForTreesTabDefaultChkBox : "+actrestrictionForTreesTabDefaultChkBox+"  value expected  "+exprestrictionForTreesTabDefaultChkBox);



				// Transaction Rights Tab
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionRightsTab));
				transactionRightsTab.click();

				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowBillWiseOnAccountChkBox));

				boolean allowBillWiseOnAccountChkbox=allowBillWiseOnAccountChkBox.isSelected();

				String actallowBillWiseOnAccountChkBox = Boolean.toString(allowBillWiseOnAccountChkbox);

				String expallowBillWiseOnAccountChkBox = excelReader.getCellData(xlSheetName, 151, 7);

				excelReader.setCellData(xlfile, xlSheetName, 151, 8, actallowBillWiseOnAccountChkBox);


				Select budgetLimitWarning = new Select(budgetLimitWarningDropdown);
				String actbudgetLimitWarning = budgetLimitWarning.getFirstSelectedOption().getText();
				String expbudgetLimitWarning = excelReader.getCellData(xlSheetName, 152, 7);
				excelReader.setCellData(xlfile, xlSheetName, 152, 8, actbudgetLimitWarning);

				Select creditLimitWarning = new Select(creditLimitWarningDropdown);
				String actcreditLimitWarning = creditLimitWarning.getFirstSelectedOption().getText();
				String expcreditLimitWarning = excelReader.getCellData(xlSheetName, 153, 7);
				excelReader.setCellData(xlfile, xlSheetName, 153, 8, actcreditLimitWarning);


				/*Select negativeCashCheck = new Select(negativeCashCheckDropdown);
				String actnegativeCashCheck = negativeCashCheck.getFirstSelectedOption().getText();
				String expnegativeCashCheck = excelReader.getCellData(xlSheetName, 154, 7);
				excelReader.setCellData(xlfile, xlSheetName, 154, 8, actnegativeCashCheck);*/

				Select negativeStockCheck = new Select(negativeStockCheckDropdown);
				String actnegativeStockCheck = negativeStockCheck.getFirstSelectedOption().getText();
				String expnegativeStockCheck = excelReader.getCellData(xlSheetName, 155, 7);
				excelReader.setCellData(xlfile, xlSheetName, 155, 8, actnegativeStockCheck);

				boolean cantaddfutureTransChkBox = cantaddfutureTransChkbox.isSelected();
				String actcantaddfutureTransChkbox = Boolean.toString(cantaddfutureTransChkBox);
				String expcantaddfutureTransChkbox = excelReader.getCellData(xlSheetName, 156, 7);
				excelReader.setCellData(xlfile, xlSheetName, 156, 8, actcantaddfutureTransChkbox);

				String actcannotAddTransThatAreMoreThanTxt = cannotAddTransThatAreMoreThanTxt.getAttribute("value");
				String expcannotAddTransThatAreMoreThanTxt = excelReader.getCellData(xlSheetName, 157, 7);
				excelReader.setCellData(xlfile, xlSheetName, 157, 8, actcannotAddTransThatAreMoreThanTxt);

				String actcannotEditPreviousMonthEntriesAfterTxt = cannotEditPreviousMonthEntriesAfterTxt.getAttribute("value");
				String expcannotEditPreviousMonthEntriesAfterTxt = excelReader.getCellData(xlSheetName, 158, 7);
				excelReader.setCellData(xlfile, xlSheetName, 158, 8, actcannotEditPreviousMonthEntriesAfterTxt);

				String actCantEditTransthatAreremorethanTxt = CantEditTransthatAreremorethanTxt.getAttribute("value");
				String expCantEditTransthatAreremorethanTxt = excelReader.getCellData(xlSheetName, 159, 7);
				excelReader.setCellData(xlfile, xlSheetName, 159, 8, actCantEditTransthatAreremorethanTxt);

				String actCantAddPrevMnthEntriesaftTxt = CantAddPrevMnthEntriesaftTxt.getAttribute("value");
				String expCantAddPrevMnthEntriesaftTxt = excelReader.getCellData(xlSheetName, 160, 7);
				excelReader.setCellData(xlfile, xlSheetName, 160, 8, actCantAddPrevMnthEntriesaftTxt);

				String actCantPrintAfterValueTxt = CantPrintAfterValueTxt.getAttribute("value");
				String expCantPrintAfterValueTxt = excelReader.getCellData(xlSheetName, 161, 7);
				excelReader.setCellData(xlfile, xlSheetName, 161, 8, actCantPrintAfterValueTxt);

				Select CantPrintAfterValue = new Select(cantPrintAfterValueDropdown);
				String actCantPrintAfterValue = CantPrintAfterValue.getFirstSelectedOption().getText();
				String expCantPrintAfterValue = excelReader.getCellData(xlSheetName, 162, 7);
				excelReader.setCellData(xlfile, xlSheetName, 162, 8, actCantPrintAfterValue);

				String actCantRePrintAfterValueTxt = CantRePrintAfterValueTxt.getAttribute("value");
				String expCantRePrintAfterValueTxt = excelReader.getCellData(xlSheetName, 163, 7);
				excelReader.setCellData(xlfile, xlSheetName, 163, 8, actCantRePrintAfterValueTxt);

				Select CantRePrintAfterValue = new Select(CantRePrintAfterDropdown);
				String actCantRePrintAfterValue = CantRePrintAfterValue.getFirstSelectedOption().getText();
				String expCantRePrintAfterValue = excelReader.getCellData(xlSheetName, 164, 7);
				excelReader.setCellData(xlfile, xlSheetName, 164, 8, actCantRePrintAfterValue);

				boolean dontAllowMasterCustomization = doNotAllowMasterCustomization.isSelected();
				String actdoNotAllowMasterCustomization = Boolean.toString(dontAllowMasterCustomization); 
				String expdoNotAllowMasterCustomization = excelReader.getCellData(xlSheetName, 165, 7);
				excelReader.setCellData(xlfile, xlSheetName, 165, 8, actdoNotAllowMasterCustomization);

				System.out.println("allowBillWiseOnAccountChkBox           : "+actallowBillWiseOnAccountChkBox           +"  value expected  "+expallowBillWiseOnAccountChkBox);
				System.out.println("budgetLimitWarning                     : "+actbudgetLimitWarning                     +"  value expected  "+expbudgetLimitWarning);
				System.out.println("creditLimitWarning                     : "+actcreditLimitWarning                     +"  value expected  "+expcreditLimitWarning);
			/*	System.out.println("negativeCashCheck                      : "+actnegativeCashCheck                      +"  value expected  "+expnegativeCashCheck);*/
				System.out.println("negativeStockCheck                     : "+actnegativeStockCheck                     +"  value expected  "+expnegativeStockCheck);
				System.out.println("cantaddfutureTransChkbox               : "+actcantaddfutureTransChkbox               +"  value expected  "+expcantaddfutureTransChkbox);
				System.out.println("cannotAddTransThatAreMoreThanTxt       : "+actcannotAddTransThatAreMoreThanTxt       +"  value expected  "+expcannotAddTransThatAreMoreThanTxt);
				System.out.println("cannotEditPreviousMonthEntriesAfterTxt : "+actcannotEditPreviousMonthEntriesAfterTxt +"  value expected  "+expcannotEditPreviousMonthEntriesAfterTxt);
				System.out.println("CantEditTransthatAreremorethanTxt      : "+actCantEditTransthatAreremorethanTxt      +"  value expected  "+expCantEditTransthatAreremorethanTxt);
				System.out.println("CantAddPrevMnthEntriesaftTxt           : "+actCantAddPrevMnthEntriesaftTxt           +"  value expected  "+expCantAddPrevMnthEntriesaftTxt);
				System.out.println("CantPrintAfterValueTxt                 : "+actCantPrintAfterValueTxt                 +"  value expected  "+expCantPrintAfterValueTxt);
				System.out.println("CantPrintAfterValue                    : "+actCantPrintAfterValue                    +"  value expected  "+expCantPrintAfterValue);
				System.out.println("CantRePrintAfterValueTxt               : "+actCantRePrintAfterValueTxt               +"  value expected  "+expCantRePrintAfterValueTxt);
				System.out.println("CantRePrintAfterValue                  : "+actCantRePrintAfterValue                  +"  value expected  "+expCantRePrintAfterValue);
				System.out.println("doNotAllowMasterCustomization          : "+actdoNotAllowMasterCustomization          +"  value expected  "+expdoNotAllowMasterCustomization);



				//AI Rights
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AIRightsTab));
				AIRightsTab.click();

				Thread.sleep(2000);

				boolean AIRightsEnableVUIChkbox = AIRightsEnableVUIChkBox.isSelected();
				String actAIRightsEnableVUIChkBox = Boolean.toString(AIRightsEnableVUIChkbox);
				String expAIRightsEnableVUIChkBox = excelReader.getCellData(xlSheetName, 166, 7);
				excelReader.setCellData(xlfile, xlSheetName, 166, 8, actAIRightsEnableVUIChkBox);

				boolean AIRightsEnableAIChkbox = AIRightsEnableAIChkBox.isSelected();
				String actAIRightsEnableAIChkBox = Boolean.toString(AIRightsEnableAIChkbox);
				String expAIRightsEnableAIChkBox = excelReader.getCellData(xlSheetName, 167, 7);
				excelReader.setCellData(xlfile, xlSheetName, 167, 8, actAIRightsEnableAIChkBox);

				boolean actDoNotApplyTheTagResTrictionToTheResultsChkBox = doNotApplyTheTagResTrictionToTheResultsChkBox.isSelected();
				boolean expDoNotApplyTheTagResTrictionToTheResultsChkBox = false;

				boolean DoNotApplyTheTagResTrictionToTheResults = actDoNotApplyTheTagResTrictionToTheResultsChkBox==expDoNotApplyTheTagResTrictionToTheResultsChkBox;

				String actDoNotApplyTheTagResTrictionToTheResults = Boolean.toString(DoNotApplyTheTagResTrictionToTheResults);
				String expDoNotApplyTheTagResTrictionToTheResults = excelReader.getCellData(xlSheetName, 168, 7);
				excelReader.setCellData(xlfile, xlSheetName, 168, 8, actDoNotApplyTheTagResTrictionToTheResults);


				String actNoOfVoiceCommandsPermittedTxt = NoOfVoiceCommandsPermittedTxt.getAttribute("value");
				String expNoOfVoiceCommandsPermittedTxt = excelReader.getCellData(xlSheetName, 169, 7);
				excelReader.setCellData(xlfile, xlSheetName, 169, 8, actNoOfVoiceCommandsPermittedTxt);

				String actNoOfTextCommandsPermittedTxt = NoOfTextCommandsPermittedTxt.getAttribute("value");
				String expNoOfTextCommandsPermittedTxt = excelReader.getCellData(xlSheetName, 170, 7);
				excelReader.setCellData(xlfile, xlSheetName, 170, 8, actNoOfTextCommandsPermittedTxt);

				boolean actAIRightsSalesChkBox				=AIRightsSalesChkBox.isSelected();
				boolean actAIRightsSalesOrderChkBox			=AIRightsSalesOrderChkBox.isSelected();
				boolean actAIRightsStockChkBox				=AIRightsStockChkBox.isSelected();
				boolean actAIRightsPurchasesChkBox			=AIRightsPurchasesChkBox.isSelected();
				boolean actAIRightsPurchasesOrdersChkBox		=AIRightsPurchasesOrdersChkBox.isSelected();

				boolean expAIRightsSalesChkBox				=true;
				boolean expAIRightsSalesOrderChkBox			=true;
				boolean expAIRightsStockChkBox				=true;
				boolean expAIRightsPurchasesChkBox			=true;
				boolean expAIRightsPurchasesOrdersChkBox		=true;

				boolean AIRightsChkbox = actAIRightsSalesChkBox==expAIRightsSalesChkBox && actAIRightsSalesOrderChkBox==expAIRightsSalesOrderChkBox &&
						actAIRightsStockChkBox==expAIRightsStockChkBox && actAIRightsPurchasesChkBox==expAIRightsPurchasesChkBox && 
						actAIRightsPurchasesOrdersChkBox==expAIRightsPurchasesOrdersChkBox;

				String actAIRightsChkbox = Boolean.toString(AIRightsChkbox);
				String expAIRightsChkbox = excelReader.getCellData(xlSheetName, 171, 7);
				excelReader.setCellData(xlfile, xlSheetName, 171, 8, actAIRightsChkbox);

				System.out.println("AIRightsEnableVUIChkBox                       : "+actAIRightsEnableVUIChkBox                       +"  value expected  "+expAIRightsEnableVUIChkBox);
				System.out.println("AIRightsEnableAIChkBox                        : "+actAIRightsEnableAIChkBox                        +"  value expected  "+expAIRightsEnableAIChkBox);
				System.out.println("NoOfVoiceCommandsPermittedTxt                 : "+actNoOfVoiceCommandsPermittedTxt                 +"  value expected  "+expNoOfVoiceCommandsPermittedTxt);
				System.out.println("NoOfTextCommandsPermittedTxt                  : "+actNoOfTextCommandsPermittedTxt                  +"  value expected  "+expNoOfTextCommandsPermittedTxt);
				System.out.println("AIRightsSalesChkBox                           : "+actAIRightsSalesChkBox                           +"  value expected  "+expAIRightsSalesChkBox);
				System.out.println("AIRightsSalesOrderChkBox                      : "+actAIRightsSalesOrderChkBox                      +"  value expected  "+expAIRightsSalesOrderChkBox);
				System.out.println("AIRightsStockChkBox                           : "+actAIRightsStockChkBox                           +"  value expected  "+expAIRightsStockChkBox);
				System.out.println("AIRightsPurchasesChkBox                       : "+actAIRightsPurchasesChkBox                       +"  value expected  "+expAIRightsPurchasesChkBox);
				System.out.println("AIRightsPurchasesOrdersChkBox                 : "+actAIRightsPurchasesOrdersChkBox                 +"  value expected  "+expAIRightsPurchasesOrdersChkBox);


				System.out.println("RoleName                                       : "+actRoleName										+"  value expected  "+expRoleName);
				System.out.println("PwPolicySelected                               : "+actPwPolicySelected								+"  value expected  "+expPwPolicySelected);
				System.out.println("AssignedProfilesListCount                      : "+actAssignedProfilesListCount						+"  value expected  "+expAssignedProfilesListCount);
				System.out.println("AssignedProfilesList                           : "+actAssignedProfilesList							+"  value expected  "+expAssignedProfilesList);
				//System.out.println("AvalilableProfilesListCount                    : "+actAvalilableProfilesListCount						+"  value expected  "+expAvalilableProfilesListCount);
				System.out.println("ProfilesList                                   : "+actavailableProfilesArea							+"  value expected  "+expavailableProfilesArea);
				System.out.println("AdditionsTabRestrictionsChkboxs                : "+actAdditionsTabRestrictionsChkboxs					+"  value expected  "+expAdditionsTabRestrictionsChkboxs);
				System.out.println("ExclusionTabRestrictionsChkbox                 : "+actExclusionTabRestrictionsChkbox					+"  value expected  "+expExclusionTabRestrictionsChkbox);
				System.out.println("RestrictionForEntryMastersListCount            : "+actRestrictionForEntryMastersListCount				+"  value expected  "+expRestrictionForEntryMastersListCount);
				System.out.println("RestrictionForEntryTabExclChkBox               : "+actRestrictionForEntryTabExclChkBox				+"  value expected  "+expRestrictionForEntryTabExclChkBox);
				System.out.println("Row1Col1                                       : "+actRow1Col1										+"  value expected  "+expRow1Col1);
				System.out.println("RestrictionForEntryTableCheckbox               : "+actRestrictionForEntryTableCheckbox				+"  value expected  "+expRestrictionForEntryTableCheckbox);
				System.out.println("restrictionForTreesTabDefaultChkbox            : "+actrestrictionForTreesTabDefaultChkBox				+"  value expected  "+exprestrictionForTreesTabDefaultChkBox);
				System.out.println("allowBillWiseOnAccountChkbox                   : "+actallowBillWiseOnAccountChkBox					+"  value expected  "+expallowBillWiseOnAccountChkBox);
				System.out.println("budgetLimitWarning                             : "+actbudgetLimitWarning								+"  value expected  "+expbudgetLimitWarning);
				System.out.println("creditLimitWarning                             : "+actcreditLimitWarning								+"  value expected  "+expcreditLimitWarning);
				/*System.out.println("negativeCashCheck                              : "+actnegativeCashCheck								+"  value expected  "+expnegativeCashCheck);*/
				System.out.println("negativeStockCheck                             : "+actnegativeStockCheck								+"  value expected  "+expnegativeStockCheck);
				System.out.println("cantaddfutureTransChkbox                       : "+actcantaddfutureTransChkbox						+"  value expected  "+expcantaddfutureTransChkbox);
				System.out.println("cannotAddTransThatAreMoreThanTxt               : "+actcannotAddTransThatAreMoreThanTxt				+"  value expected  "+expcannotAddTransThatAreMoreThanTxt);
				System.out.println("cannotEditPreviousMonthEntriesAfterTxt         : "+actcannotEditPreviousMonthEntriesAfterTxt			+"  value expected  "+expcannotEditPreviousMonthEntriesAfterTxt);
				System.out.println("CantEditTransthatAreremorethanTxt              : "+actCantEditTransthatAreremorethanTxt				+"  value expected  "+expCantEditTransthatAreremorethanTxt);
				System.out.println("CantAddPrevMnthEntriesaftTxt                   : "+actCantAddPrevMnthEntriesaftTxt					+"  value expected  "+expCantAddPrevMnthEntriesaftTxt);
				System.out.println("CantPrintAfterValueTxt                         : "+actCantPrintAfterValueTxt							+"  value expected  "+expCantPrintAfterValueTxt);
				System.out.println("CantPrintAfterValue                            : "+actCantPrintAfterValue								+"  value expected  "+expCantPrintAfterValue);
				System.out.println("CantRePrintAfterValueTxt                       : "+actCantRePrintAfterValueTxt						+"  value expected  "+expCantRePrintAfterValueTxt);
				System.out.println("CantRePrintAfterValue                          : "+actCantRePrintAfterValue							+"  value expected  "+expCantRePrintAfterValue);
				System.out.println("doNotAllowMasterCustomization                  : "+actdoNotAllowMasterCustomization					+"  value expected  "+expdoNotAllowMasterCustomization);
				System.out.println("AIRightsEnableVUIChkBox                        : "+actAIRightsEnableVUIChkBox							+"  value expected  "+expAIRightsEnableVUIChkBox);
				System.out.println("AIRightsEnableAIChkBox                         : "+actAIRightsEnableAIChkBox							+"  value expected  "+expAIRightsEnableAIChkBox);
				System.out.println("DoNotApplyTheTagResTrictionToTheResults        : "+actDoNotApplyTheTagResTrictionToTheResults         +"  value expected  "+expDoNotApplyTheTagResTrictionToTheResults);
				System.out.println("NoOfVoiceCommandsPermittedTxt                  : "+actNoOfVoiceCommandsPermittedTxt				    +"  value expected  "+expNoOfVoiceCommandsPermittedTxt);
				System.out.println("NoOfTextCommandsPermittedTxt                   : "+actNoOfTextCommandsPermittedTxt				    +"  value expected  "+expNoOfTextCommandsPermittedTxt);
				System.out.println("AIRightsChkbox                                 : "+actAIRightsChkbox									+"  value expected  "+expAIRightsChkbox);


				if (actRoleName.equalsIgnoreCase(expRoleName) && actPwPolicySelected.equalsIgnoreCase(expPwPolicySelected) && actAssignedProfilesListCount.equalsIgnoreCase(expAssignedProfilesListCount) &&
						actAssignedProfilesList.equalsIgnoreCase(expAssignedProfilesList) /*&& actAvalilableProfilesListCount.equalsIgnoreCase(expAvalilableProfilesListCount)*/ &&
						actavailableProfilesArea.equalsIgnoreCase(expavailableProfilesArea) && actAdditionsTabRestrictionsChkboxs.equalsIgnoreCase(expAdditionsTabRestrictionsChkboxs) &&
						actExclusionTabRestrictionsChkbox.equalsIgnoreCase(expExclusionTabRestrictionsChkbox) && actRestrictionForEntryMastersListCount.equalsIgnoreCase(expRestrictionForEntryMastersListCount) &&
						actRestrictionForEntryTabExclChkBox.equalsIgnoreCase(expRestrictionForEntryTabExclChkBox) && actRow1Col1.equalsIgnoreCase(expRow1Col1) &&
						actRestrictionForEntryTableCheckbox.equalsIgnoreCase(expRestrictionForEntryTableCheckbox) && actrestrictionForTreesTabDefaultChkBox.equalsIgnoreCase(exprestrictionForTreesTabDefaultChkBox) &&
						actallowBillWiseOnAccountChkBox.equalsIgnoreCase(expallowBillWiseOnAccountChkBox) && actbudgetLimitWarning.equalsIgnoreCase(expbudgetLimitWarning) &&
						actcreditLimitWarning.equalsIgnoreCase(expcreditLimitWarning) /*&& actnegativeCashCheck.equalsIgnoreCase(expnegativeCashCheck) */&& actnegativeStockCheck.equalsIgnoreCase(expnegativeStockCheck) &&
						actcantaddfutureTransChkbox.equalsIgnoreCase(expcantaddfutureTransChkbox) && actcannotAddTransThatAreMoreThanTxt.equalsIgnoreCase(expcannotAddTransThatAreMoreThanTxt) &&
						actcannotEditPreviousMonthEntriesAfterTxt.equalsIgnoreCase(expcannotEditPreviousMonthEntriesAfterTxt) && actCantEditTransthatAreremorethanTxt.equalsIgnoreCase(expCantEditTransthatAreremorethanTxt) &&
						actCantAddPrevMnthEntriesaftTxt.equalsIgnoreCase(expCantAddPrevMnthEntriesaftTxt) && actCantPrintAfterValueTxt.equalsIgnoreCase(expCantPrintAfterValueTxt) &&
						actCantPrintAfterValue.equalsIgnoreCase(expCantPrintAfterValue) && actCantRePrintAfterValueTxt.equalsIgnoreCase(expCantRePrintAfterValueTxt) &&
						actCantRePrintAfterValue.equalsIgnoreCase(expCantRePrintAfterValue) && actdoNotAllowMasterCustomization.equalsIgnoreCase(expdoNotAllowMasterCustomization) &&
						actAIRightsEnableVUIChkBox.equalsIgnoreCase(expAIRightsEnableVUIChkBox) && actAIRightsEnableAIChkBox.equalsIgnoreCase(expAIRightsEnableAIChkBox) &&
						actDoNotApplyTheTagResTrictionToTheResults.equalsIgnoreCase(expDoNotApplyTheTagResTrictionToTheResults) && actNoOfVoiceCommandsPermittedTxt.equalsIgnoreCase(expNoOfVoiceCommandsPermittedTxt) &&
						actNoOfTextCommandsPermittedTxt.equalsIgnoreCase(expNoOfTextCommandsPermittedTxt) && actAIRightsChkbox.equalsIgnoreCase(expAIRightsChkbox)) 
				{
					excelReader.setCellData(xlfile, xlSheetName, 134, 9, resPass);
					return true;
				} 
				else 
				{
					excelReader.setCellData(xlfile, xlSheetName, 134, 9, resFail);
					return false;
				}
			}
			else
			{
				System.err.println("DUE TO SERVER ERRRO SKIPPED THIS");
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 134, 10, exception);

			return false;
		}
	}









	public boolean  checkEditAndUpdateSavedRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


			if(res)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
				createRoleRoleNameCombo.click();
				createRoleRoleNameCombo.sendKeys("Test");
				Thread.sleep(2000);
				createRoleRoleNameCombo.sendKeys(Keys.TAB);


				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(assignedProfilesTab));
				assignedProfilesTab.click();


				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfileSt));
				avaliableAllProfileSt.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
				createRoleMOveFiledsFromLeftSideToRightSide.click();


				//Additions Tab
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(additionTab));
				additionTab.click();

				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFininicalExpandBtn));
				addFininicalExpandBtn.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransationExpandBtn));
				addFinTransationExpandBtn.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransationpurchaseExpandBtn));
				addFinTransationpurchaseExpandBtn.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransPurPurchasesVouchers));
				addFinTransPurPurchasesVouchers.click();


				int actPurchasesMenusCount=additionTabFinancialsTransactionsPurchasesMenusList.size();
				int expPurchasesMenusCount=3;

				System.out.println("additionTabFinancialsTransactionsPurchasesMenusList : "+actPurchasesMenusCount);
				System.out.println("additionTabFinancialsTransactionsPurchasesMenusList : "+expPurchasesMenusCount);



				boolean actCRAddAlwaysSuspendOnSavingChkBox				=CRAddAlwaysSuspendOnSavingChkBox.isDisplayed();
				boolean actCRAddHideMenuChkBox							=CRAddHideMenuChkBox.isDisplayed();



				boolean expCRAddAlwaysSuspendOnSavingChkBox				=true;
				boolean expCRAddHideMenuChkBox							=true;

				System.out.println("CRAddAlwaysSuspendOnSavingChkBox           : "+actCRAddAlwaysSuspendOnSavingChkBox          +"  value expected  "+expCRAddAlwaysSuspendOnSavingChkBox);
				System.out.println("CRAddHideMenuChkBox                        : "+actCRAddHideMenuChkBox                       +"  value expected  "+expCRAddHideMenuChkBox);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleAddTabSelectAllChkBox));
				createRoleAddTabSelectAllChkBox.click();





				//Restriction For Entry Tab
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
				createRoleRestrictionForEntryTab.click();

				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictionForEntryTabTableSelectRow1Col1));
				restrictionForEntryTabTableSelectRow1Col1.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictionForEntryTabTableEnterMasterTxt));
				restrictionForEntryTabTableEnterMasterTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				restrictionForEntryTabTableEnterMasterTxt.sendKeys(Keys.BACK_SPACE);

				Thread.sleep(2000);

				restrictionForEntryTabTableEnterMasterTxt.sendKeys(excelReader.getCellData(xlSheetName, 175, 6));

				Thread.sleep(2000);

				int actSize=restrictionForEntryTabTableMasterComboList.size();
				System.out.println("The Number Of Fields" + actSize);




				Thread.sleep(2000);

				createRoleRestrictionForEntryTabExclChkBox.click();
				restrictionForEntryTabRow1ReportChkBox.click();
				restrictionForEntryTabRow1ViewChkBox.click();


				/* //Restriction For Trees
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictionforTreesTab));
	  restrictionforTreesTab.click();

	  Thread.sleep(2000);

	  boolean actrestrictionForTreesTabDefaultChkBox=restrictionForTreesTabDefaultChkBox.isDisplayed();

	  boolean exprestrictionForTreesTabDefaultChkBox=true;

	  System.out.println("restrictionForTreesTabDefaultChkBox : "+actrestrictionForTreesTabDefaultChkBox+"  value expected  "+exprestrictionForTreesTabDefaultChkBox);

	  restrictionForTreesTabDefaultChkBox.click();*/


				//Transaction Rights Tab
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionRightsTab));
				transactionRightsTab.click();

				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowBillWiseOnAccountChkBox));
				allowBillWiseOnAccountChkBox.click();

				Select budgetLimitWarning= new Select(budgetLimitWarningDropdown);
				budgetLimitWarning.selectByVisibleText(excelReader.getCellData(xlSheetName, 178, 6));

				Select creditLimitWarning= new Select(creditLimitWarningDropdown);
				creditLimitWarning.selectByVisibleText(excelReader.getCellData(xlSheetName, 179, 6));

				Select negativeCashCheck= new Select(negativeCashCheckDropdown);
				negativeCashCheck.selectByVisibleText(excelReader.getCellData(xlSheetName, 180, 6));

				Select negativeStockCheck= new Select(negativeStockCheckDropdown);
				negativeStockCheck.selectByVisibleText(excelReader.getCellData(xlSheetName, 181, 6));

				cantaddfutureTransChkbox.click();

				cannotAddTransThatAreMoreThanTxt.click();
				cannotAddTransThatAreMoreThanTxt.clear();
				cannotAddTransThatAreMoreThanTxt.sendKeys(excelReader.getCellData(xlSheetName, 182, 6));

				cannotEditPreviousMonthEntriesAfterTxt.click();
				cannotEditPreviousMonthEntriesAfterTxt.clear();
				cannotEditPreviousMonthEntriesAfterTxt.sendKeys(excelReader.getCellData(xlSheetName, 183, 6));

				CantEditTransthatAreremorethanTxt.click();
				CantEditTransthatAreremorethanTxt.clear();
				CantEditTransthatAreremorethanTxt.sendKeys(excelReader.getCellData(xlSheetName, 184, 6));

				CantAddPrevMnthEntriesaftTxt.click();
				CantAddPrevMnthEntriesaftTxt.clear();
				CantAddPrevMnthEntriesaftTxt.sendKeys(excelReader.getCellData(xlSheetName, 185, 6));

				CantPrintAfterValueTxt.click();
				CantPrintAfterValueTxt.clear();
				CantPrintAfterValueTxt.sendKeys(excelReader.getCellData(xlSheetName, 186, 6));

				Select CantPrintAfterValue= new Select(cantPrintAfterValueDropdown);
				CantPrintAfterValue.selectByVisibleText(excelReader.getCellData(xlSheetName, 187, 6));

				CantRePrintAfterValueTxt.click();
				CantRePrintAfterValueTxt.clear();
				CantRePrintAfterValueTxt.sendKeys(excelReader.getCellData(xlSheetName, 188, 6));

				Select CantRePrintAfterValue= new Select(CantRePrintAfterDropdown);
				CantRePrintAfterValue.selectByVisibleText(excelReader.getCellData(xlSheetName, 189, 6));

				doNotAllowMasterCustomization.click();


				//AI Rights
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AIRightsTab));
				AIRightsTab.click();

				Thread.sleep(2000);


				AIRightsEnableVUIChkBox.click();

				AIRightsEnableAIChkBox.click();

				doNotApplyTheTagResTrictionToTheResultsChkBox.click();

				NoOfVoiceCommandsPermittedTxt.click();
				NoOfVoiceCommandsPermittedTxt.clear();
				NoOfVoiceCommandsPermittedTxt.sendKeys(excelReader.getCellData(xlSheetName, 191, 6));

				NoOfTextCommandsPermittedTxt.click();
				NoOfTextCommandsPermittedTxt.clear();
				NoOfTextCommandsPermittedTxt.sendKeys(excelReader.getCellData(xlSheetName, 192, 6));

				AIRightsSalesOrderChkBox.click();
				AIRightsPurchasesOrdersChkBox.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
				createRoleSaveicon.click();

				String expMessage = excelReader.getCellData(xlSheetName, 193, 7);
				String actMessage = checkValidationMessage(expMessage);
				excelReader.setCellData(xlfile, xlSheetName, 193, 8, actMessage);

				/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
	  createRoleCloseIcon.click();*/

				if (actMessage.equalsIgnoreCase(expMessage)) 
				{
					excelReader.setCellData(xlfile, xlSheetName, 172, 9, resPass);
					return true;
				} 
				else 
				{
					excelReader.setCellData(xlfile, xlSheetName, 172, 9, resFail);
					return false;
				}
			}
			else
			{
				System.err.println("DUE TO SERVER ERRRO SKIPPED THIS");
				return false;
			}
		}

	public boolean  checkCompareAndDeleteUpdatedRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			if(res)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
				createRoleRoleNameCombo.click();

				createRoleRoleNameCombo.sendKeys("RoleToDelete");
				Thread.sleep(2000);
				createRoleRoleNameCombo.sendKeys(Keys.TAB);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
				createRolePasswordPolicyDropdown.click();
				createRolePasswordPolicyDropdown.sendKeys("Simple");
				createRolePasswordPolicyDropdown.sendKeys(Keys.TAB);


				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfileSt));
				avaliableAllProfileSt.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
				createRoleMOveFiledsFromLeftSideToRightSide.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
				createRoleSaveicon.click();

				Thread.sleep(4000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
				createRoleRoleNameCombo.click();
				createRoleRoleNameCombo.sendKeys(Keys.END);
				createRoleRoleNameCombo.sendKeys(Keys.SHIFT,Keys.END);
				createRoleRoleNameCombo.sendKeys("RoleToDelete");

				createRoleRoleNameCombo.sendKeys(Keys.TAB);
				Thread.sleep(4000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
				createRoleSaveicon.click();

				System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqq");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CreateRoleDeleteButtonImage));
				CreateRoleDeleteButtonImage.click();

				getWaitForAlert();

				String actAlertText = getAlert().getText();
				String expAlertText = excelReader.getCellData(xlSheetName, 233, 7);
				excelReader.setCellData(xlfile, xlSheetName, 233, 8, actAlertText);

				getAlert().accept();

				String expMessage = excelReader.getCellData(xlSheetName, 234, 7);
				String actMessage = checkValidationMessage(expMessage);
				excelReader.setCellData(xlfile, xlSheetName, 234, 8, actMessage);


				System.out.println("AlertText  : "+actAlertText+"  value expected  "+expAlertText);
				System.out.println("Error Message  : "+actMessage+"  value expected  "+expMessage);




				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
				createRoleCloseIcon.click();



				if ( actAlertText.equalsIgnoreCase(expAlertText) && actMessage.equalsIgnoreCase(expMessage)) 
				{
					excelReader.setCellData(xlfile, xlSheetName, 194, 9, resPass);
					return true;
				} 
				else 
				{
					excelReader.setCellData(xlfile, xlSheetName, 194, 9, resFail);
					return false;
				}
			}
			else
			{
				System.err.println("DUE TO SERVER ERRRO SKIPPED THIS");
				return false;
			}
		
	}





	// Create User 

	//@FindBy(xpath="//div[@id='RestrictionEntryMasters']/ul/li")
	@FindBy(xpath="//*[@id='RestrictionEntryMasters']//li")
	public static List<WebElement> restrictionForEntryTabMasterList;

	public boolean  checkCreateUsersPageWithAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
		createUserMenu.click();

		Thread.sleep(4000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSearchTxt));

		boolean actcreateUserSearchTxt					=createUserSearchTxt.isDisplayed();
		boolean actcreateUserIcon						=createUserIcon.isDisplayed();
		boolean actcreateUserCreateGroupIcon			=createUserCreateGroupIcon.isDisplayed();
		boolean actcreateUserCancelIcon					=createUserCancelIcon.isDisplayed();
		boolean actcreateUserUnlockUserIcon				=createUserUnlockUserIcon.isDisplayed();
		boolean actcreateUserMoveUserIcon				=createUserMoveUserIcon.isDisplayed();
		boolean actcreateUserResetIcon					=createUserResetIcon.isDisplayed();
		boolean actcreateUserLoadFromIcon				=createUserLoadFromIcon.isDisplayed();
		boolean actcreateUserSaveIcon					=createUserSaveIcon.isDisplayed();
		boolean actcreateUserDeleteIcon					=createUserDeleteIcon.isDisplayed();
		boolean actcreateUserCloseIcon					=createUserCloseIcon.isDisplayed();
		boolean actcreateUserUserInformationTab			=createUserUserInformationTab.isDisplayed();
		boolean actcreateUserAdditionalInfoTab			=createUserAdditionalInfoTab.isDisplayed();
		boolean actcreateUserRestrictionsTab			=createUserRestrictionsTab.isDisplayed();
		boolean actcreateUserDeviceTab					=createUserDeviceTab.isDisplayed();
		boolean actcreateUserRestrictionforentryTab		=createUserRestrictionforentryTab.isDisplayed();

		boolean expcreateUserSearchTxt					=true;
		boolean expcreateUserIcon						=true;
		boolean expcreateUserCreateGroupIcon			=true;
		boolean expcreateUserCancelIcon					=true;
		boolean expcreateUserUnlockUserIcon				=true;
		boolean expcreateUserMoveUserIcon				=true;
		boolean expcreateUserResetIcon					=true;
		boolean expcreateUserLoadFromIcon				=true;
		boolean expcreateUserSaveIcon					=true;
		boolean expcreateUserDeleteIcon					=true;
		boolean expcreateUserCloseIcon					=true;
		boolean expcreateUserUserInformationTab			=true;
		boolean expcreateUserAdditionalInfoTab			=true;
		boolean expcreateUserRestrictionsTab			=true;
		boolean expcreateUserDeviceTab					=true;
		boolean expcreateUserRestrictionforentryTab		=true;

		boolean CreateUserHomepageOptions = actcreateUserSearchTxt==expcreateUserSearchTxt && actcreateUserIcon==expcreateUserIcon && actcreateUserCreateGroupIcon==expcreateUserCreateGroupIcon &&
				actcreateUserCancelIcon==expcreateUserCancelIcon && actcreateUserUnlockUserIcon==expcreateUserUnlockUserIcon && actcreateUserMoveUserIcon==expcreateUserMoveUserIcon &&
				actcreateUserResetIcon==expcreateUserResetIcon && actcreateUserLoadFromIcon==expcreateUserLoadFromIcon && actcreateUserSaveIcon==expcreateUserSaveIcon &&
				actcreateUserDeleteIcon==expcreateUserDeleteIcon && actcreateUserCloseIcon==expcreateUserCloseIcon && actcreateUserUserInformationTab==expcreateUserUserInformationTab &&
				actcreateUserAdditionalInfoTab==expcreateUserAdditionalInfoTab && actcreateUserRestrictionsTab==expcreateUserRestrictionsTab && actcreateUserDeviceTab==expcreateUserDeviceTab &&
				actcreateUserRestrictionforentryTab==expcreateUserRestrictionforentryTab;

		String actCreateUserHomepageOptions = Boolean.toString(CreateUserHomepageOptions);
		String expCreateUserHomepageOptions = excelReader.getCellData(xlSheetName, 240, 7);
		excelReader.setCellData(xlfile, xlSheetName, 240, 8, actCreateUserHomepageOptions);

		System.out.println("createUserSearchTxt               : "+actcreateUserSearchTxt               +"  value expected  "+expcreateUserSearchTxt);
		System.out.println("createUserIcon                    : "+actcreateUserIcon                    +"  value expected  "+expcreateUserIcon);
		System.out.println("createUserCreateGroupIcon         : "+actcreateUserCreateGroupIcon         +"  value expected  "+expcreateUserCreateGroupIcon);
		System.out.println("createUserCancelIcon              : "+actcreateUserCancelIcon              +"  value expected  "+expcreateUserCancelIcon);
		System.out.println("createUserUnlockUserIcon          : "+actcreateUserUnlockUserIcon          +"  value expected  "+expcreateUserUnlockUserIcon);
		System.out.println("createUserMoveUserIcon            : "+actcreateUserMoveUserIcon            +"  value expected  "+expcreateUserMoveUserIcon);
		System.out.println("createUserResetIcon               : "+actcreateUserResetIcon               +"  value expected  "+expcreateUserResetIcon);
		System.out.println("createUserLoadFromIcon            : "+actcreateUserLoadFromIcon            +"  value expected  "+expcreateUserLoadFromIcon);
		System.out.println("createUserSaveIcon                : "+actcreateUserSaveIcon                +"  value expected  "+expcreateUserSaveIcon);
		System.out.println("createUserDeleteIcon              : "+actcreateUserDeleteIcon              +"  value expected  "+expcreateUserDeleteIcon);
		System.out.println("createUserCloseIcon               : "+actcreateUserCloseIcon               +"  value expected  "+expcreateUserCloseIcon);
		System.out.println("createUserUserInformationTab      : "+actcreateUserUserInformationTab      +"  value expected  "+expcreateUserUserInformationTab);
		System.out.println("createUserAdditionalInfoTab       : "+actcreateUserAdditionalInfoTab       +"  value expected  "+expcreateUserAdditionalInfoTab);
		System.out.println("createUserRestrictionsTab         : "+actcreateUserRestrictionsTab         +"  value expected  "+expcreateUserRestrictionsTab);
		System.out.println("createUserDeviceTab               : "+actcreateUserDeviceTab               +"  value expected  "+expcreateUserDeviceTab);
		System.out.println("createUserRestrictionforentryTab  : "+actcreateUserRestrictionforentryTab  +"  value expected  "+expcreateUserRestrictionforentryTab);


		//User Information Tab
		boolean actcreateUserLoginNameTxt						=createUserLoginNameTxt.isDisplayed();
		boolean actcreateUserERPRoleDropDown					=createUserERPRoleDropDown.isDisplayed();
		boolean actcreateUserPasswordPolicyDropdown				=createUserPasswordPolicyDropdown.isDisplayed();
		boolean actcreateUserPasswordTxt						=createUserPasswordTxt.isDisplayed();
		boolean actcreateUserConfirmPasswordTxt					=createUserConfirmPasswordTxt.isDisplayed();
		boolean actcreateUserNameTxt							=createUserNameTxt.isDisplayed();
		boolean actcreateUserLoginAbbrivationTxt				=createUserLoginAbbrivationTxt.isDisplayed();
		boolean actcreateUserSecurityQuestionDropDown			=createUserSecurityQuestionDropDown.isDisplayed();
		boolean actcreateUserSecurityAnswerTxt					=createUserSecurityAnswerTxt.isDisplayed();
		boolean actcreateUserLanguageTxt						=createUserLanguageTxt.isDisplayed();
		boolean actcreateUserAlternateLanguageTxt				=createUserAlternateLanguageTxt.isDisplayed();
		boolean actcreateUserSelectTimeZoneDropdown				=createUserSelectTimeZoneDropdown.isDisplayed();
		boolean actcreateUserAddOrEditPhoto						=createUserAddOrEditPhoto.isDisplayed();
		boolean actcreateUserSignaturePhoto						=createUserSignaturePhoto.isDisplayed();

		boolean expcreateUserLoginNameTxt						=true;
		boolean expcreateUserERPRoleDropDown					=true;
		boolean expcreateUserPasswordPolicyDropdown				=true;
		boolean expcreateUserPasswordTxt						=true;
		boolean expcreateUserConfirmPasswordTxt					=true;
		boolean expcreateUserNameTxt							=true;
		boolean expcreateUserLoginAbbrivationTxt				=true;
		boolean expcreateUserSecurityQuestionDropDown			=true;
		boolean expcreateUserSecurityAnswerTxt					=true;
		boolean expcreateUserLanguageTxt						=true;
		boolean expcreateUserAlternateLanguageTxt				=true;
		boolean expcreateUserSelectTimeZoneDropdown				=true;
		boolean expcreateUserAddOrEditPhoto						=true;
		boolean expcreateUserSignaturePhoto						=true;

		boolean UserInformationTabOptions = actcreateUserLoginNameTxt==expcreateUserLoginNameTxt && actcreateUserERPRoleDropDown==expcreateUserERPRoleDropDown &&
				actcreateUserPasswordPolicyDropdown==expcreateUserPasswordPolicyDropdown && actcreateUserPasswordTxt==expcreateUserPasswordTxt &&
				actcreateUserConfirmPasswordTxt==expcreateUserConfirmPasswordTxt && actcreateUserNameTxt==expcreateUserNameTxt &&
				actcreateUserLoginAbbrivationTxt==expcreateUserLoginAbbrivationTxt && actcreateUserSecurityQuestionDropDown==expcreateUserSecurityQuestionDropDown &&
				actcreateUserSecurityAnswerTxt==expcreateUserSecurityAnswerTxt && actcreateUserLanguageTxt==expcreateUserLanguageTxt &&
				actcreateUserAlternateLanguageTxt==expcreateUserAlternateLanguageTxt && actcreateUserSelectTimeZoneDropdown==expcreateUserSelectTimeZoneDropdown &&
				actcreateUserAddOrEditPhoto==expcreateUserAddOrEditPhoto && actcreateUserSignaturePhoto==expcreateUserSignaturePhoto;

		String actUserInformationTabOptions = Boolean.toString(UserInformationTabOptions);
		String expUserInformationTabOptions = excelReader.getCellData(xlSheetName, 241, 7);
		excelReader.setCellData(xlfile, xlSheetName, 241, 8, actUserInformationTabOptions);

		System.out.println("createUserLoginNameTxt             : "+actcreateUserLoginNameTxt             +"  value expected  "+expcreateUserLoginNameTxt);
		System.out.println("createUserERPRoleDropDown          : "+actcreateUserERPRoleDropDown          +"  value expected  "+expcreateUserERPRoleDropDown);
		System.out.println("createUserPasswordPolicyDropdown   : "+actcreateUserPasswordPolicyDropdown   +"  value expected  "+expcreateUserPasswordPolicyDropdown);
		System.out.println("createUserPasswordTxt              : "+actcreateUserPasswordTxt              +"  value expected  "+expcreateUserPasswordTxt);
		System.out.println("createUserConfirmPasswordTxt       : "+actcreateUserConfirmPasswordTxt       +"  value expected  "+expcreateUserConfirmPasswordTxt);
		System.out.println("createUserNameTxt                  : "+actcreateUserNameTxt                  +"  value expected  "+expcreateUserNameTxt);
		System.out.println("createUserLoginAbbrivationTxt      : "+actcreateUserLoginAbbrivationTxt      +"  value expected  "+expcreateUserLoginAbbrivationTxt);
		System.out.println("createUserSecurityQuestionDropDown : "+actcreateUserSecurityQuestionDropDown +"  value expected  "+expcreateUserSecurityQuestionDropDown);
		System.out.println("createUserSecurityAnswerTxt        : "+actcreateUserSecurityAnswerTxt        +"  value expected  "+expcreateUserSecurityAnswerTxt);
		System.out.println("createUserLanguageTxt              : "+actcreateUserLanguageTxt              +"  value expected  "+expcreateUserLanguageTxt);
		System.out.println("createUserAlternateLanguageTxt     : "+actcreateUserAlternateLanguageTxt     +"  value expected  "+expcreateUserAlternateLanguageTxt);
		System.out.println("createUserSelectTimeZoneDropdown   : "+actcreateUserSelectTimeZoneDropdown   +"  value expected  "+expcreateUserSelectTimeZoneDropdown);
		System.out.println("createUserAddOrEditPhoto           : "+actcreateUserAddOrEditPhoto           +"  value expected  "+expcreateUserAddOrEditPhoto);
		System.out.println("createUserSignaturePhoto           : "+actcreateUserSignaturePhoto           +"  value expected  "+expcreateUserSignaturePhoto);



		//Additional Info Tab
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		Thread.sleep(2000);

		boolean actcreateUserEmailTxt										=createUserEmailTxt.isDisplayed();
		boolean actcreateUserEmailPasswordTxt								=createUserEmailPasswordTxt.isDisplayed();
		boolean actcreateUserPhoneTxt										=createUserPhoneTxt.isDisplayed();
		boolean actcreateUserMobileTxt										=createUserMobileTxt.isDisplayed();
		boolean actcreateUserSetPermissionForEmailAuthorizationChkBox		=createUserSetPermissionForEmailAuthorizationChkBox.isDisplayed();
		boolean actcreateUserDomainUserMappingDrpDwn						=createUserDomainUserMappingDrpDwn.isDisplayed();
		boolean actcreateUserDomainUserMappingTxt							=createUserDomainUserMappingTxt.isDisplayed();
		boolean actcreateUserUserValuesTxt1									=createUserUserValuesTxt1.isDisplayed();
		boolean actcreateUserUserValuesTxt2									=createUserUserValuesTxt2.isDisplayed();
		boolean actcreateUserUserValuesTxt3									=createUserUserValuesTxt3.isDisplayed();
		boolean actcreateUserUserValuesTxt4									=createUserUserValuesTxt4.isDisplayed();
		boolean actcreateUserUserValuesTxt5									=createUserUserValuesTxt5.isDisplayed();
		boolean actcreateUserUserTypeDrpDwn									=createUserUserTypeDrpDwn.isDisplayed();
		boolean actcreateUserUserTypeCombo									=createUserUserTypeCombo.isDisplayed();
		boolean actcreateUserCRMRolesDrpDwn									=createUserCRMRolesDrpDwn.isDisplayed();
		/* boolean actcreateUserMobileChkBox									=createUserMobileChkBox.isDisplayed();
    	boolean actcreateUserOfflineChkBox									=createUserOfflineChkBox.isDisplayed();
    	boolean actcreateUserWebChkBox										=createUserWebChkBox.isDisplayed();*/
		boolean actaccountDisableChkbox										=accountDisableChkbox.isDisplayed();
		boolean actdoNotLockAccountChkBox									=doNotLockAccountChkBox.isDisplayed();
		boolean actmultipleLoginChkbox										=multipleLoginChkbox.isDisplayed();
		boolean actsendEmailNotificationChkbox								=sendEmailNotificationChkbox.isDisplayed();
		boolean actemailUserOnLoginSuccessChkbox							=emailUserOnLoginSuccessChkbox.isDisplayed();
		boolean actemailOnLoginFaliureChkbox								=emailOnLoginFaliureChkbox.isDisplayed();

		boolean expcreateUserEmailTxt										=true;
		boolean expcreateUserEmailPasswordTxt								=true;
		boolean expcreateUserPhoneTxt										=true;
		boolean expcreateUserMobileTxt										=true;
		boolean expcreateUserSetPermissionForEmailAuthorizationChkBox		=true;
		boolean expcreateUserDomainUserMappingDrpDwn						=true;
		boolean expcreateUserDomainUserMappingTxt							=true;
		boolean expcreateUserUserValuesTxt1									=true;
		boolean expcreateUserUserValuesTxt2									=true;
		boolean expcreateUserUserValuesTxt3									=true;
		boolean expcreateUserUserValuesTxt4									=true;
		boolean expcreateUserUserValuesTxt5									=true;
		boolean expcreateUserUserTypeDrpDwn									=true;
		boolean expcreateUserUserTypeCombo									=true;
		boolean expcreateUserCRMRolesDrpDwn									=true;
		/*boolean expcreateUserMobileChkBox									=true;
    boolean expcreateUserOfflineChkBox									=true;
    boolean expcreateUserWebChkBox										=true;*/
		boolean expaccountDisableChkbox										=true;
		boolean expdoNotLockAccountChkBox									=true;
		boolean expmultipleLoginChkbox										=true;
		boolean expsendEmailNotificationChkbox								=true;
		boolean expemailUserOnLoginSuccessChkbox							=true;
		boolean expemailOnLoginFaliureChkbox								=true;

		boolean AdditionalInfoTabOptions = actcreateUserEmailTxt==expcreateUserEmailTxt && actcreateUserEmailPasswordTxt==expcreateUserEmailPasswordTxt && actcreateUserPhoneTxt==expcreateUserPhoneTxt && 
				actcreateUserMobileTxt==expcreateUserMobileTxt && actcreateUserSetPermissionForEmailAuthorizationChkBox==expcreateUserSetPermissionForEmailAuthorizationChkBox &&
				actcreateUserDomainUserMappingDrpDwn==expcreateUserDomainUserMappingDrpDwn && actcreateUserDomainUserMappingTxt==expcreateUserDomainUserMappingTxt &&
				actcreateUserUserValuesTxt1==expcreateUserUserValuesTxt1 && actcreateUserUserValuesTxt2==expcreateUserUserValuesTxt2 && 
				actcreateUserUserValuesTxt3==expcreateUserUserValuesTxt3 && actcreateUserUserValuesTxt4==expcreateUserUserValuesTxt4 &&
				actcreateUserUserValuesTxt5==expcreateUserUserValuesTxt5 && actcreateUserUserTypeDrpDwn==expcreateUserUserTypeDrpDwn &&
				actcreateUserUserTypeCombo==expcreateUserUserTypeCombo && actcreateUserCRMRolesDrpDwn==expcreateUserCRMRolesDrpDwn &&
				/*actcreateUserMobileChkBox==expcreateUserMobileChkBox && actcreateUserOfflineChkBox==expcreateUserOfflineChkBox &&
    								   actcreateUserWebChkBox==expcreateUserWebChkBox &&*/ actaccountDisableChkbox==expaccountDisableChkbox && actdoNotLockAccountChkBox==expdoNotLockAccountChkBox &&
    								   actmultipleLoginChkbox==expmultipleLoginChkbox && actsendEmailNotificationChkbox==expsendEmailNotificationChkbox && 
    								   actemailUserOnLoginSuccessChkbox==expemailUserOnLoginSuccessChkbox && actemailOnLoginFaliureChkbox==expemailOnLoginFaliureChkbox;

		String actAdditionalInfoTabOptions = Boolean.toString(AdditionalInfoTabOptions);
		String expAdditionalInfoTabOptions = excelReader.getCellData(xlSheetName, 242, 7);
		excelReader.setCellData(xlfile, xlSheetName, 242, 8, actAdditionalInfoTabOptions);

		System.out.println("createUserEmailTxt                 : "+actcreateUserEmailTxt                 +"  value expected  "+expcreateUserEmailTxt);
		System.out.println("createUserEmailPasswordTxt         : "+actcreateUserEmailPasswordTxt         +"  value expected  "+expcreateUserEmailPasswordTxt);
		System.out.println("createUserPhoneTxt                 : "+actcreateUserPhoneTxt                 +"  value expected  "+expcreateUserPhoneTxt);
		System.out.println("createUserMobileTxt                : "+actcreateUserMobileTxt                +"  value expected  "+expcreateUserMobileTxt);
		System.out.println("createUserSetPermissionForEmailAuthorizationChkBox : "+actcreateUserSetPermissionForEmailAuthorizationChkBox+"  value expected  "+expcreateUserSetPermissionForEmailAuthorizationChkBox);
		System.out.println("createUserDomainUserMappingDrpDwn  : "+actcreateUserDomainUserMappingDrpDwn  +"  value expected  "+expcreateUserDomainUserMappingDrpDwn);
		System.out.println("createUserDomainUserMappingTxt     : "+actcreateUserDomainUserMappingTxt     +"  value expected  "+expcreateUserDomainUserMappingTxt);
		System.out.println("createUserUserValuesTxt1           : "+actcreateUserUserValuesTxt1           +"  value expected  "+expcreateUserUserValuesTxt1);
		System.out.println("createUserUserValuesTxt2           : "+actcreateUserUserValuesTxt2           +"  value expected  "+expcreateUserUserValuesTxt2);
		System.out.println("createUserUserValuesTxt3           : "+actcreateUserUserValuesTxt3           +"  value expected  "+expcreateUserUserValuesTxt3);
		System.out.println("createUserUserValuesTxt4           : "+actcreateUserUserValuesTxt4           +"  value expected  "+expcreateUserUserValuesTxt4);
		System.out.println("createUserUserValuesTxt5           : "+actcreateUserUserValuesTxt5           +"  value expected  "+expcreateUserUserValuesTxt5);
		System.out.println("createUserUserTypeDrpDwn           : "+actcreateUserUserTypeDrpDwn           +"  value expected  "+expcreateUserUserTypeDrpDwn);
		System.out.println("createUserUserTypeCombo            : "+actcreateUserUserTypeCombo            +"  value expected  "+expcreateUserUserTypeCombo);
		System.out.println("createUserCRMRolesDrpDwn           : "+actcreateUserCRMRolesDrpDwn           +"  value expected  "+expcreateUserCRMRolesDrpDwn);
		//System.out.println("createUserMobileChkBox             : "+actcreateUserMobileChkBox             +"  value expected  "+expcreateUserMobileChkBox);
		//System.out.println("createUserOfflineChkBox            : "+actcreateUserOfflineChkBox            +"  value expected  "+expcreateUserOfflineChkBox);
		//System.out.println("createUserWebChkBox                : "+actcreateUserWebChkBox                +"  value expected  "+expcreateUserWebChkBox);
		System.out.println("accountDisableChkbox               : "+actaccountDisableChkbox               +"  value expected  "+expaccountDisableChkbox);
		System.out.println("doNotLockAccountChkBox             : "+actdoNotLockAccountChkBox             +"  value expected  "+expdoNotLockAccountChkBox);
		System.out.println("multipleLoginChkbox                : "+actmultipleLoginChkbox                +"  value expected  "+expmultipleLoginChkbox);
		System.out.println("sendEmailNotificationChkbox        : "+actsendEmailNotificationChkbox        +"  value expected  "+expsendEmailNotificationChkbox);
		System.out.println("emailUserOnLoginSuccessChkbox      : "+actemailUserOnLoginSuccessChkbox      +"  value expected  "+expemailUserOnLoginSuccessChkbox);
		System.out.println("emailOnLoginFaliureChkbox          : "+actemailOnLoginFaliureChkbox          +"  value expected  "+expemailOnLoginFaliureChkbox);

		//Restrictions Tab
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionsTab));
		createUserRestrictionsTab.click();

		Thread.sleep(2000);

		/*boolean actresTabFromDateChkBox							=resTabFromDateChkBox.isDisplayed();
		boolean actresTabToDateChkBox							=resTabToDateChkBox.isDisplayed();*/
		boolean actresTabWorkingHoursFromChkbox					=resTabWorkingHoursFromChkbox.isDisplayed();
		boolean actresTabWorkingHoursToChkbox					=resTabWorkingHoursToChkbox.isDisplayed();
		boolean actresTabSelectAllChkbox						=resTabSelectAllChkbox.isDisplayed();
		boolean actresTabSundayChkbox							=resTabSundayChkbox.isDisplayed();
		boolean actresTabMondayChkbox							=resTabMondayChkbox.isDisplayed();
		boolean actresTabTuesdayChkbox							=resTabTuesdayChkbox.isDisplayed();
		boolean actresTabWednesdayChkbox						=resTabWednesdayChkbox.isDisplayed();
		boolean actresTabThursdaychkbox							=resTabThursdaychkbox.isDisplayed();
		boolean actresTabFridayChkbox							=resTabFridayChkbox.isDisplayed();
		boolean actresTabSaturdayChkbox							=resTabSaturdayChkbox.isDisplayed();
		/*boolean actresTabDomainTxt								=resTabDomainTxt.isDisplayed();
		boolean actresTabDomainNameTxtArea						=resTabDomainNameTxtArea.isDisplayed();
*/
		boolean expresTabFromDateChkBox							=true;
		boolean expresTabToDateChkBox							=true;
		boolean expresTabWorkingHoursFromChkbox					=true;
		boolean expresTabWorkingHoursToChkbox					=true;
		boolean expresTabSelectAllChkbox						=true;
		boolean expresTabSundayChkbox							=true;
		boolean expresTabMondayChkbox							=true;
		boolean expresTabTuesdayChkbox							=true;
		boolean expresTabWednesdayChkbox						=true;
		boolean expresTabThursdaychkbox							=true;
		boolean expresTabFridayChkbox							=true;
		boolean expresTabSaturdayChkbox							=true;
		/*boolean expresTabDomainTxt								=true;
		boolean expresTabDomainNameTxtArea						=true;*/

		boolean RestrictionsTabOptions = /*actresTabFromDateChkBox==expresTabFromDateChkBox && actresTabToDateChkBox==expresTabToDateChkBox && */
				actresTabWorkingHoursFromChkbox==expresTabWorkingHoursFromChkbox && actresTabWorkingHoursToChkbox==expresTabWorkingHoursToChkbox &&
				actresTabSelectAllChkbox==expresTabSelectAllChkbox && actresTabSundayChkbox==expresTabSundayChkbox && actresTabMondayChkbox==expresTabMondayChkbox &&
				actresTabTuesdayChkbox==expresTabTuesdayChkbox && actresTabWednesdayChkbox==expresTabWednesdayChkbox && actresTabThursdaychkbox==expresTabThursdaychkbox &&
				actresTabFridayChkbox==expresTabFridayChkbox && actresTabSaturdayChkbox==expresTabSaturdayChkbox; /*&& actresTabDomainTxt==expresTabDomainTxt &&*/
			/*	actresTabDomainNameTxtArea==expresTabDomainNameTxtArea;*/

		String actRestrictionsTabOptions = Boolean.toString(RestrictionsTabOptions);
		String expRestrictionsTabOptions = excelReader.getCellData(xlSheetName, 243, 7);
		excelReader.setCellData(xlfile, xlSheetName, 243, 8, actRestrictionsTabOptions);

//		System.out.println("resTabFromDateChkBox         : "+actresTabFromDateChkBox          +"  value expected  "+expresTabFromDateChkBox);
//		System.out.println("resTabToDateChkBox           : "+actresTabToDateChkBox            +"  value expected  "+expresTabToDateChkBox);
		System.out.println("resTabWorkingHoursFromChkbox : "+actresTabWorkingHoursFromChkbox  +"  value expected  "+expresTabWorkingHoursFromChkbox);
		System.out.println("resTabWorkingHoursToChkbox   : "+actresTabWorkingHoursToChkbox    +"  value expected  "+expresTabWorkingHoursToChkbox);
		System.out.println("resTabSelectAllChkbox        : "+actresTabSelectAllChkbox         +"  value expected  "+expresTabSelectAllChkbox);
		System.out.println("resTabSundayChkbox           : "+actresTabSundayChkbox            +"  value expected  "+expresTabSundayChkbox);
		System.out.println("resTabMondayChkbox           : "+actresTabMondayChkbox            +"  value expected  "+expresTabMondayChkbox);
		System.out.println("resTabTuesdayChkbox          : "+actresTabTuesdayChkbox           +"  value expected  "+expresTabTuesdayChkbox);
		System.out.println("resTabWednesdayChkbox        : "+actresTabWednesdayChkbox         +"  value expected  "+expresTabWednesdayChkbox);
		System.out.println("resTabThursdaychkbox         : "+actresTabThursdaychkbox          +"  value expected  "+expresTabThursdaychkbox);
		System.out.println("resTabFridayChkbox           : "+actresTabFridayChkbox            +"  value expected  "+expresTabFridayChkbox);
		System.out.println("resTabSaturdayChkbox         : "+actresTabSaturdayChkbox          +"  value expected  "+expresTabSaturdayChkbox);
		/*System.out.println("resTabDomainTxt              : "+actresTabDomainTxt               +"  value expected  "+expresTabDomainTxt);
		System.out.println("resTabDomainNameTxtArea      : "+actresTabDomainNameTxtArea       +"  value expected  "+expresTabDomainNameTxtArea);
*/

		//Device Tab
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserDeviceTab));
		createUserDeviceTab.click();

		Thread.sleep(2000);

		//boolean actdeviceTabDeviceLabel								=deviceTabDeviceLabel.isDisplayed();
		boolean actdeviceTabDeviceTable								=deviceTabDeviceTable.isDisplayed();
		boolean actdeviceTabDeviceTableGridStatus					=deviceTabDeviceTableGridStatus.isDisplayed();
		boolean actdeviceTabDeviceTableGridDevice					=deviceTabDeviceTableGridDevice.isDisplayed();
		boolean actdeviceTabDeviceTableGridMacID					=deviceTabDeviceTableGridMacID.isDisplayed();

		//boolean expdeviceTabDeviceLabel								=true;
		boolean expdeviceTabDeviceTable								=true;
		boolean expdeviceTabDeviceTableGridStatus					=true;
		boolean expdeviceTabDeviceTableGridDevice					=true;
		boolean expdeviceTabDeviceTableGridMacID					=true;

		boolean DeviceTabOptions = /*actdeviceTabDeviceLabel==expdeviceTabDeviceLabel &&*/ actdeviceTabDeviceTable==expdeviceTabDeviceTable && 
				actdeviceTabDeviceTableGridStatus==expdeviceTabDeviceTableGridStatus && actdeviceTabDeviceTableGridDevice==expdeviceTabDeviceTableGridDevice &&
				actdeviceTabDeviceTableGridMacID==expdeviceTabDeviceTableGridMacID;

		String actDeviceTabOptions = Boolean.toString(DeviceTabOptions);
		String expDeviceTabOptions = excelReader.getCellData(xlSheetName, 244, 7);
		excelReader.setCellData(xlfile, xlSheetName, 244, 8, actDeviceTabOptions);

		//System.out.println("deviceTabDeviceLabel            : "+actdeviceTabDeviceLabel           +"  value expected  "+expdeviceTabDeviceLabel);
		System.out.println("deviceTabDeviceTable            : "+actdeviceTabDeviceTable           +"  value expected  "+expdeviceTabDeviceTable);
		System.out.println("deviceTabDeviceTableGridStatus  : "+actdeviceTabDeviceTableGridStatus +"  value expected  "+expdeviceTabDeviceTableGridStatus);
		System.out.println("deviceTabDeviceTableGridDevice  : "+actdeviceTabDeviceTableGridDevice +"  value expected  "+expdeviceTabDeviceTableGridDevice);
		System.out.println("deviceTabDeviceTableGridMacID   : "+actdeviceTabDeviceTableGridMacID  +"  value expected  "+expdeviceTabDeviceTableGridMacID);



		//Restriction For Entry Tab
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		createUserRestrictionforentryTab.click();

		Thread.sleep(2000);

		int actMasterListCount = restrictionForEntryTabMasterList.size();

		Set<String> MastersList=new HashSet<String>();

		for (int i = 0; i < actMasterListCount; i++) 
		{
			String masters=restrictionForEntryTabMasterList.get(i).getText();

			MastersList.add(masters);
		}

		String actMastersList = MastersList.toString();
		String expMastersList = "[Kitchen Display System, Account, E- Payment, SourceType, Maintenance Parameter, Trainer, Process, Item, Department, Counter, Capacity, Qc failure reason, Request Types, Course, Member, Discount Voucher Definition, Gift Voucher Definition, Venue, Position, Guest, Travel Agent, Grade, City, Units, Place of supply, Jurisdiction, Qualification, Job Grade, Employee, State, Supply Area, Bank Card Type, Region, Country, Member Card Definition, Expense Claims, Warehouse, Work Center, Category, Tax Code, Employee Bank, Return Remarks, Source, Cost Center, Plant, Specialization, Outlet, Designation, Floor, Airline Sector, Member Type, Safety Instructions, Fixed Asset, Table, Delivery Time Interval, Scale, QC Parameters, Break down standard reason, RoundType, Section, Order Type, Nationality, Course Type, Skill, Bins, Holiday, Skill Type, Insurance, Void Remarks, Location]";
		excelReader.setCellData(xlfile, xlSheetName, 245, 8, actMastersList);

		boolean actresOFEntryExclusionchkBox		=resOFEntryExclusionchkBox.isDisplayed();
		boolean actresOFEntryTable					=resOFEntryTable.isDisplayed();

		boolean expresOFEntryExclusionchkBox		=true;
		boolean expresOFEntryTable					=true;

		boolean RestrictionForEntryTabOptions = actresOFEntryExclusionchkBox==expresOFEntryExclusionchkBox && actresOFEntryTable==expresOFEntryTable;

		String actRestrictionForEntryTabOptions = Boolean.toString(RestrictionForEntryTabOptions);
		String expRestrictionForEntryTabOptions = excelReader.getCellData(xlSheetName, 246, 7);
		excelReader.setCellData(xlfile, xlSheetName, 246, 8, actRestrictionForEntryTabOptions);

		System.out.println(actMastersList);
		System.out.println(expMastersList);
		System.out.println("resOFEntryExclusionchkBox : "+actresOFEntryExclusionchkBox  +"  value expected  "+expresOFEntryExclusionchkBox);
		System.out.println("resOFEntryTable           : "+actresOFEntryTable            +"  value expected  "+expresOFEntryTable);

		System.out.println("CreateUserHomepageOptions      : "+actCreateUserHomepageOptions		+"  value expected  "+expCreateUserHomepageOptions);
		System.out.println("UserInformationTabOptions      : "+actUserInformationTabOptions		+"  value expected  "+expUserInformationTabOptions);
		System.out.println("AdditionalInfoTabOptions       : "+actAdditionalInfoTabOptions		+"  value expected  "+expAdditionalInfoTabOptions);
		System.out.println("RestrictionsTabOptions         : "+actRestrictionsTabOptions		+"  value expected  "+expRestrictionsTabOptions);
		System.out.println("DeviceTabOptions               : "+actDeviceTabOptions				+"  value expected  "+expDeviceTabOptions);
		System.out.println("MastersList                    : "+actMastersList					+"  value expected  "+expMastersList);
		System.out.println("RestrictionForEntryTabOptions  : "+actRestrictionForEntryTabOptions	+"  value expected  "+expRestrictionForEntryTabOptions);


		if(actCreateUserHomepageOptions.equalsIgnoreCase(expCreateUserHomepageOptions) && actUserInformationTabOptions.equalsIgnoreCase(expUserInformationTabOptions) &&
				actAdditionalInfoTabOptions.equalsIgnoreCase(expAdditionalInfoTabOptions) && actRestrictionsTabOptions.equalsIgnoreCase(expRestrictionsTabOptions) &&
				actDeviceTabOptions.equalsIgnoreCase(expDeviceTabOptions) && actMastersList.equalsIgnoreCase(expMastersList) &&
				actRestrictionForEntryTabOptions.equalsIgnoreCase(expRestrictionForEntryTabOptions))
		{
			excelReader.setCellData(xlfile, xlSheetName, 240, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 240, 9, resFail);
			return false;
		}
		
	}




	public boolean checkSaveButtonWithoutMandatoryInputsInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
			createUserUserInformationTab.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
			createUserIcon.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 247, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 247, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 247, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 247, 9, resFail);
				return false;
			}
		
	}







	public boolean checkRoleAsMandatoryCheckByInputUserName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
			createUserLoginNameTxt.click();
			createUserLoginNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 248, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 248, 7);
			String actMessage=checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 248, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 248, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 248, 9, resFail);
				return false;
			}
		
	}




	@FindBy(xpath="//select[@id='ERPRoles']/option")
	public static List<WebElement> createUserERPRolesDropdownOptions;



	public boolean checkERPRolesOptionInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		//createUserERPRoleDropDown.click();

			int count = createUserERPRolesDropdownOptions.size()-1;

			String actERPRoleCount = Integer.toString(count);
			String expERPRoleCount = excelReader.getCellData(xlSheetName, 249, 7);
			excelReader.setCellData(xlfile, xlSheetName, 249, 8, actERPRoleCount);

			/*Set ERPRoleDropdownList = new HashSet<String>();

	for (int i = 1; i <= count; i++)
	{
		String data = createUserERPRolesDropdownOptions.get(i).getText();
		ERPRoleDropdownList.add(data);
	}

	String actERPRoleDropdownList = ERPRoleDropdownList.toString();
	String expERPRoleDropdownList = excelReader.getCellData(xlSheetName, 250, 7);
	excelReader.setCellData(xlfile, xlSheetName, 250, 8, actERPRoleDropdownList);*/

			System.out.println("ERPRoleCount         : "+actERPRoleCount         +"  value expected  "+expERPRoleCount);
			//System.out.println("ERPRoleDropdownList  : "+actERPRoleDropdownList  +"  value expected  "+expERPRoleDropdownList);

			if (actERPRoleCount.equalsIgnoreCase(expERPRoleCount) /*&& actERPRoleDropdownList.equalsIgnoreCase(expERPRoleDropdownList)*/) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 249, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 249, 9, resFail);
				return false;
			}
		
	}






	public boolean checkPasswordPolicyOnSelectingERPRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
			Select role = new Select(createUserERPRoleDropDown);
			role.selectByVisibleText(excelReader.getCellData(xlSheetName, 251, 6));

			Thread.sleep(2000);

			Select s = new Select(createUserPasswordPolicyDropdown);
			String actPasswordPolicy = s.getFirstSelectedOption().getText();
			String expPasswordPolicy = excelReader.getCellData(xlSheetName, 251, 7);
			excelReader.setCellData(xlfile, xlSheetName, 251, 8, actPasswordPolicy);

			System.out.println("Password Policy : "+actPasswordPolicy+"  value expected  "+expPasswordPolicy);

			if (actPasswordPolicy.equalsIgnoreCase(expPasswordPolicy)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 251, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 251, 9, resFail);
				return false;
			}
		
	}



	@FindBy(xpath="//select[@id='passwordPolicy']/option")
	public static List<WebElement> createUserPasswordPolicyList;



	public boolean checkPasswordPolicyInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			createUserPasswordPolicyDropdown.click();

			int count = createUserPasswordPolicyList.size()-1;

			String actPasswordPolicyDropdownCount = Integer.toString(count);
			String expPasswordPolicyDropdownCount = excelReader.getCellData(xlSheetName, 252, 7);
			excelReader.setCellData(xlfile, xlSheetName, 252, 8, actPasswordPolicyDropdownCount);

			Set PasswordPolicyDropdownList = new HashSet<String>();

			for (int i = 1; i <= count; i++) 
			{
				String data = createUserPasswordPolicyList.get(i).getText();
				PasswordPolicyDropdownList.add(data);
			}

			String actPasswordPolicyDropdownList = PasswordPolicyDropdownList.toString();
			String expPasswordPolicyDropdownList = excelReader.getCellData(xlSheetName, 253, 7);
			excelReader.setCellData(xlfile, xlSheetName, 253, 8, actPasswordPolicyDropdownList);

			System.out.println("PasswordPolicyDropdownCount : "+actPasswordPolicyDropdownCount  +"  value expected  "+expPasswordPolicyDropdownCount);
			System.out.println("PasswordPolicyDropdownList  : "+actPasswordPolicyDropdownList   +"  value expected  "+expPasswordPolicyDropdownList);

			if (actPasswordPolicyDropdownCount.equalsIgnoreCase(expPasswordPolicyDropdownCount) && actPasswordPolicyDropdownList.equalsIgnoreCase(expPasswordPolicyDropdownList)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 252, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 252, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 252, 10, exception);
			System.err.println("Exception : "+exception);
			return false;
		}
	}







	public boolean checkPasswordAsMandatoryCheckInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 254, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 254, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 254, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 254, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 254, 10, exception);
			return false;
		}
	}









	public boolean checkConfirmPasswordAsMandatoryCheckInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try

		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 255, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 255, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 255, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 255, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 255, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 255, 10, exception);
			return false;
		}
	}







	public boolean checkNameAsMandatoryCheckInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try	
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
			createUserConfirmPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 256, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 256, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 256, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 256, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 256, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 256, 10, exception);
			return false;
		}
	}





	public boolean checkLoginAbbreviationAsMandatoryCheckInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try	
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
			createUserNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 257, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 257, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 257, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 257, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 257, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 257, 10, exception);
			return false;
		}
	}






	public boolean checkSecurityQuestionAsMandatoryInCreateUser()throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginAbbrivationTxt));
			createUserLoginAbbrivationTxt.sendKeys(excelReader.getCellData(xlSheetName, 258, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 258, 7);
			String actMessage=checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 258, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 258, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 258, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 258, 10, exception);
			return false;
		}
	}







	public boolean checkSecurityAnswerAsMandatoryInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		try
		{
			createUserSecurityQuestionDropDown.click();
			Select s = new Select(createUserSecurityQuestionDropDown);
			s.selectByVisibleText(excelReader.getCellData(xlSheetName, 259, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 259, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 259, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 259, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 259, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 259, 10, exception);
			return false;
		}
	}


	public boolean checInputMandatoryFieldsInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
			createUserUserInformationTab.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
			createUserIcon.click();


			createUserLoginNameTxt.click();
			createUserLoginNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 248, 6));
			createUserLoginNameTxt.sendKeys(Keys.TAB);

			createUserERPRoleDropDown.click();
			createUserERPRoleDropDown.sendKeys("Test");


			int count = createUserERPRolesDropdownOptions.size()-1;
			System.out.println("Count "+ count);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.sendKeys("12345");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
			createUserConfirmPasswordTxt.sendKeys("12345");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
			createUserNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 257, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginAbbrivationTxt));
			createUserLoginAbbrivationTxt.sendKeys(excelReader.getCellData(xlSheetName, 258, 6));

			createUserSecurityQuestionDropDown.click();
			Select s = new Select(createUserSecurityQuestionDropDown);
			s.selectByVisibleText(excelReader.getCellData(xlSheetName, 259, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityAnswerTxt));	
			createUserSecurityAnswerTxt.sendKeys(excelReader.getCellData(xlSheetName, 260, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
			createUserUserInformationTab.click();

			getLanguage.click();
			int counnt = createUserLanguageDropdownList.size()-1;
			String actLanguageDropdownCount = Integer.toString(counnt);
			String expLanguageDropdownCount = excelReader.getCellData(xlSheetName, 261, 7);
			excelReader.setCellData(xlfile, xlSheetName, 261, 8, actLanguageDropdownCount);

			Set LanguageDropdownList = new HashSet<String>();

			for (int i = 0; i < count; i++) 
			{
				String data = createUserLanguageDropdownList.get(i).getText();
				LanguageDropdownList.add(data);
			}

			String actLanguageDropdownList = LanguageDropdownList.toString();
			String expLanguageDropdownList = excelReader.getCellData(xlSheetName, 262, 7);
			excelReader.setCellData(xlfile, xlSheetName, 262, 8, actLanguageDropdownList);

			System.out.println("LanguageDropdownCount  : "+actLanguageDropdownCount  +"  value expected  "+expLanguageDropdownCount);
			System.out.println("LanguageDropdownList   : "+actLanguageDropdownList   +"  value expected  "+expLanguageDropdownList);


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
			createUserUserInformationTab.click();

			getAltLanguage.click();
			int cont = createUserAltLanguageDropdownList.size()-1;
			String actAltLanguageDropdownCount = Integer.toString(count);
			String expAltLanguageDropdownCount = excelReader.getCellData(xlSheetName, 263, 7);
			excelReader.setCellData(xlfile, xlSheetName, 263, 8, actAltLanguageDropdownCount);

			Set AltLanguageDropdownList = new HashSet<String>();

			for (int i = 1; i <= cont; i++) 
			{
				String data = createUserAltLanguageDropdownList.get(i).getText();
				AltLanguageDropdownList.add(data);
			}

			String actAltLanguageDropdownList = AltLanguageDropdownList.toString();
			String expAltLanguageDropdownList = excelReader.getCellData(xlSheetName, 264, 7);
			excelReader.setCellData(xlfile, xlSheetName, 264, 8, actAltLanguageDropdownList);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSelectTimeZoneDropdown));
			Select userTime = new Select(createUserSelectTimeZoneDropdown);
			userTime.selectByVisibleText("(GMT+05:30) Chennai, Kolkatta, Mumbai, New Delhi");
			
			



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
			createUserAdditionalInfoTab.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
			Select user = new Select(createUserUserTypeDrpDwn);
			user.selectByVisibleText(excelReader.getCellData(xlSheetName, 265, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
			createUserEmailTxt.click();
			createUserEmailTxt.clear();
			createUserEmailTxt.sendKeys(excelReader.getCellData(xlSheetName, 267, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
			createUserUserInformationTab.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = "new user created successfully";
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 260, 8, actMessage); 

			System.out.println(actMessage);
			System.out.println(expMessage);


			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 260, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 260, 9, resFail);
				return false;
			}
		
	}

	@FindBy(xpath="//select[@id='language']/option")
	public static List<WebElement> createUserLanguageDropdownList;


	public boolean checkLanguageInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
			createUserUserInformationTab.click();

			getLanguage.click();
			int count = createUserLanguageDropdownList.size()-1;
			String actLanguageDropdownCount = Integer.toString(count);
			String expLanguageDropdownCount = excelReader.getCellData(xlSheetName, 261, 7);
			excelReader.setCellData(xlfile, xlSheetName, 261, 8, actLanguageDropdownCount);

			Set LanguageDropdownList = new HashSet<String>();

			for (int i = 0; i < count; i++) 
			{
				String data = createUserLanguageDropdownList.get(i).getText();
				LanguageDropdownList.add(data);
			}

			String actLanguageDropdownList = LanguageDropdownList.toString();
			String expLanguageDropdownList = excelReader.getCellData(xlSheetName, 262, 7);
			excelReader.setCellData(xlfile, xlSheetName, 262, 8, actLanguageDropdownList);

			System.out.println("LanguageDropdownCount  : "+actLanguageDropdownCount  +"  value expected  "+expLanguageDropdownCount);
			System.out.println("LanguageDropdownList   : "+actLanguageDropdownList   +"  value expected  "+expLanguageDropdownList);


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
			createUserUserInformationTab.click();

			getAltLanguage.click();
			int cont = createUserAltLanguageDropdownList.size()-1;
			String actAltLanguageDropdownCount = Integer.toString(count);
			String expAltLanguageDropdownCount = excelReader.getCellData(xlSheetName, 263, 7);
			excelReader.setCellData(xlfile, xlSheetName, 263, 8, actAltLanguageDropdownCount);

			Set AltLanguageDropdownList = new HashSet<String>();

			for (int i = 1; i <= cont; i++) 
			{
				String data = createUserAltLanguageDropdownList.get(i).getText();
				AltLanguageDropdownList.add(data);
			}

			String actAltLanguageDropdownList = AltLanguageDropdownList.toString();
			String expAltLanguageDropdownList = excelReader.getCellData(xlSheetName, 264, 7);
			excelReader.setCellData(xlfile, xlSheetName, 264, 8, actAltLanguageDropdownList);


			if (actLanguageDropdownCount.equalsIgnoreCase(expLanguageDropdownCount) && actLanguageDropdownList.equalsIgnoreCase(expLanguageDropdownList)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 261, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 261, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 261, 10, exception);
			System.err.println("Exception : "+exception);
			return false;
		}
	}





	@FindBy(xpath="//select[@id='altLanguage']/option")
	public static List<WebElement> createUserAltLanguageDropdownList;


	public boolean checkAltLanguageInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
			createUserUserInformationTab.click();

			getAltLanguage.click();
			int count = createUserAltLanguageDropdownList.size()-1;
			String actAltLanguageDropdownCount = Integer.toString(count);
			String expAltLanguageDropdownCount = excelReader.getCellData(xlSheetName, 263, 7);
			excelReader.setCellData(xlfile, xlSheetName, 263, 8, actAltLanguageDropdownCount);

			Set AltLanguageDropdownList = new HashSet<String>();

			for (int i = 1; i <= count; i++) 
			{
				String data = createUserAltLanguageDropdownList.get(i).getText();
				AltLanguageDropdownList.add(data);
			}

			String actAltLanguageDropdownList = AltLanguageDropdownList.toString();
			String expAltLanguageDropdownList = excelReader.getCellData(xlSheetName, 264, 7);
			excelReader.setCellData(xlfile, xlSheetName, 264, 8, actAltLanguageDropdownList);

			System.out.println("AltLanguageDropdownCount  : "+actAltLanguageDropdownCount  +"  value expected  "+expAltLanguageDropdownCount);
			System.out.println("AltLanguageDropdownList   : "+actAltLanguageDropdownList   +"  value expected  "+expAltLanguageDropdownList);

			if (actAltLanguageDropdownCount.equalsIgnoreCase(expAltLanguageDropdownCount) && actAltLanguageDropdownList.equalsIgnoreCase(expAltLanguageDropdownList)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 263, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 263, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 263, 10, exception);
			System.err.println("Exception : "+exception);

			return false;
		}
	}







	public boolean checkEmailAsMandatoryInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
			createUserAdditionalInfoTab.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
			Select user = new Select(createUserUserTypeDrpDwn);
			user.selectByVisibleText(excelReader.getCellData(xlSheetName, 265, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 265, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 265, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 265, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 265, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 265, 10, exception);
			return false;
		}
	}








	public boolean checkInvalidEmailAsMandatoryInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
			createUserEmailTxt.sendKeys(excelReader.getCellData(xlSheetName, 266, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 266, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 266, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 266, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 266, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 266, 10, exception);
			return false;
		}
	}



	public boolean checkConfirmPasswordAsInvalid() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
			createUserEmailTxt.click();
			createUserEmailTxt.clear();
			createUserEmailTxt.sendKeys(excelReader.getCellData(xlSheetName, 267, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
			createUserUserInformationTab.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
			createUserConfirmPasswordTxt.clear();
			createUserConfirmPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 268, 6));

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 267, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 267, 8, actMessage);


			for(int i=0;i<4;i++)
			{
				boolean actValidationMessage=errorMessage.getText().isEmpty();
				System.err.println("actValidationMessage : "+actValidationMessage);
				if(actValidationMessage==false)
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
					errorMessageCloseBtn.click();
				}	
			}

			if (actMessage.equalsIgnoreCase(expMessage))
			{
				excelReader.setCellData(xlfile, xlSheetName, 267, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 267, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 267, 10, exception);
			return false;
		}
	}







	public boolean checkSaveUserWithPasswordLength3() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.clear();
			createUserPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 269, 6));

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 269, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 269, 8, actMessage);


			for(int i=0;i<5;i++)
			{
				boolean actValidationMessage=errorMessage.getText().isEmpty();

				System.err.println("actValidationMessage : "+actValidationMessage);
				if(actValidationMessage==false)
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
					errorMessageCloseBtn.click();
				}	
			}

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 269, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 269, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 269, 10, exception);
			return false;
		}
	}







	public boolean checkSaveUserWithAllMandatoryInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.clear();
			createUserPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 270, 6));

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
			createUserConfirmPasswordTxt.clear();
			createUserConfirmPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 271, 6));

			Thread.sleep(2000);

			for(int i=0;i<5;i++)
			{
				boolean actValidationMessage=errorMessage.getText().isEmpty();

				System.err.println("actValidationMessage : "+actValidationMessage);
				if(actValidationMessage==false)
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
					errorMessageCloseBtn.click();
				}	
			}

			Thread.sleep(4000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();

			String expMessage = excelReader.getCellData(xlSheetName, 270, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 270, 8, actMessage);


			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
    	createUserCloseIcon.click();*/

				excelReader.setCellData(xlfile, xlSheetName, 270, 9, resPass);
				return true;
			} 
			else 
			{
				/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
    	createUserCloseIcon.click();*/

				excelReader.setCellData(xlfile, xlSheetName, 270, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 270, 10, exception);
			System.err.println("Exception : "+e.getMessage());
			return false;
		}
	}







	@FindBy(xpath="//div[@id='userAndGroups']/ul/li/ul/li/div/span/span[1]")
	public static List<WebElement> createUserSavedUsersList;


	public boolean checkUserDataInSavedUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			int actUsersCount=createUserSavedUsersList.size();

			System.out.println(actUsersCount);

			boolean actData=true;

			for (int i = 0; i < actUsersCount; i++) 
			{
				String actUser = createUserSavedUsersList.get(i).getText();

				if (actUser.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 272, 6))) 
				{
					createUserSavedUsersList.get(i).click();

					Thread.sleep(4000);

					String actLoginName = createUserLoginNameTxt.getAttribute("value");
					String expLoginName = excelReader.getCellData(xlSheetName, 272, 7);
					excelReader.setCellData(xlfile, xlSheetName, 272, 8, actLoginName);

					Select ERPRole = new Select(createUserERPRoleDropDown);
					String actERPRole = ERPRole.getFirstSelectedOption().getText();
					String expERPRole = "Test";
					excelReader.setCellData(xlfile, xlSheetName, 273, 8, actERPRole);

					Select PP = new Select(createUserPasswordPolicyDropdown);
					String actPasswordPolicy = PP.getFirstSelectedOption().getText();
					String expPasswordPolicy = "Simple Policy";
					excelReader.setCellData(xlfile, xlSheetName, 274, 8, actPasswordPolicy);

					String actUserName = createUserNameTxt.getAttribute("value");
					String expUserName = excelReader.getCellData(xlSheetName, 275, 7);
					excelReader.setCellData(xlfile, xlSheetName, 275, 8, actUserName);

					String actLoginAbbreviation = createUserLoginAbbrivationTxt.getAttribute("value");
					String expLoginAbbreviation = excelReader.getCellData(xlSheetName, 276, 7);
					excelReader.setCellData(xlfile, xlSheetName, 276, 8, actLoginAbbreviation);

					Select SQ = new Select(createUserSecurityQuestionDropDown);
					String actSecutiryQuestion = SQ.getFirstSelectedOption().getText();
					String expSecutiryQuestion = excelReader.getCellData(xlSheetName, 277, 7);
					excelReader.setCellData(xlfile, xlSheetName, 277, 8, actSecutiryQuestion);

					String actSecurityAnswer = createUserSecurityAnswerTxt.getAttribute("value");
					String expSecurityAnswer = excelReader.getCellData(xlSheetName, 278, 7);
					excelReader.setCellData(xlfile, xlSheetName, 278, 8, actSecurityAnswer);

					Select language = new Select(createUserLanguageTxt);
					String actLanguage = language.getFirstSelectedOption().getText();
					String expLanguage = excelReader.getCellData(xlSheetName, 279, 7);
					excelReader.setCellData(xlfile, xlSheetName, 279, 8, actLanguage);

					Select altLanguage = new Select(createUserAlternateLanguageTxt);
					String actAltLanguage = altLanguage.getFirstSelectedOption().getText();
					String expAltLanguage = excelReader.getCellData(xlSheetName, 280, 7);
					excelReader.setCellData(xlfile, xlSheetName, 280, 8, actAltLanguage);

					Thread.sleep(2000);

					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
					createUserAdditionalInfoTab.click();

					Thread.sleep(2000);

					String actEmail = createUserEmailTxt.getAttribute("value");
					String expEmail = excelReader.getCellData(xlSheetName, 281, 7);
					excelReader.setCellData(xlfile, xlSheetName, 281, 8, actEmail);

					Select userType = new Select(createUserUserTypeDrpDwn);
					String actUserType = userType.getFirstSelectedOption().getText();
					String expUserType = excelReader.getCellData(xlSheetName, 282, 7);
					excelReader.setCellData(xlfile, xlSheetName, 282, 8, actUserType);

					System.out.println("LoginName         : "+actLoginName         +"  value expected  "+expLoginName);
					System.out.println("ERPRole           : "+actERPRole           +"  value expected  "+expERPRole);
					System.out.println("PasswordPolicy    : "+actPasswordPolicy    +"  value expected  "+expPasswordPolicy);
					System.out.println("UserName          : "+actUserName          +"  value expected  "+expUserName);
					System.out.println("LoginAbbreviation : "+actLoginAbbreviation +"  value expected  "+expLoginAbbreviation);
					System.out.println("SecutiryQuestion  : "+actSecutiryQuestion  +"  value expected  "+expSecutiryQuestion);
					System.out.println("SecurityAnswer    : "+actSecurityAnswer    +"  value expected  "+expSecurityAnswer);
					System.out.println("Language          : "+actLanguage          +"  value expected  "+expLanguage);
					System.out.println("AltLanguage       : "+actAltLanguage       +"  value expected  "+expAltLanguage);
					System.out.println("Email             : "+actEmail             +"  value expected  "+expEmail);
					System.out.println("UserType          : "+actUserType          +"  value expected  "+expUserType);


					if (actLoginName.equalsIgnoreCase(expLoginName) && actERPRole.equalsIgnoreCase(expERPRole) && actPasswordPolicy.equalsIgnoreCase(expPasswordPolicy) &&
							actUserName.equalsIgnoreCase(expUserName) && actLoginAbbreviation.equalsIgnoreCase(expLoginAbbreviation) && 
							actSecutiryQuestion.equalsIgnoreCase(expSecutiryQuestion) && actSecurityAnswer.equalsIgnoreCase(expSecurityAnswer) &&
							actLanguage.equalsIgnoreCase(expLanguage) && actAltLanguage.equalsIgnoreCase(expAltLanguage) && actEmail.equalsIgnoreCase(expEmail) &&
							actUserType.equalsIgnoreCase(expUserType)) 
					{
						excelReader.setCellData(xlfile, xlSheetName, 272, 9, resPass);
						actData=true;
					}
					else 
					{
						excelReader.setCellData(xlfile, xlSheetName, 272, 9, resFail);
						actData=false;
					}

				} 

				else 
				{
					System.out.println("User NOT Found");
					excelReader.setCellData(xlfile, xlSheetName, 272, 9, resFail);
					actData=false;
				}
			}

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
			createUserCloseIcon.click();

			Thread.sleep(2000);

			System.out.println("The Act Data Is Display As Output"+actData);

			return actData;
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 272, 10, exception);
			return false;
		}
	}




	@FindBy(xpath="//*[@id='txtUsername']")
	public static WebElement username;

	@FindBy(id="txtPassword")
	public static WebElement password;

	@FindBy(id="btnSignin")
	public static WebElement signIn;

	@FindBy(id="ddlCompany")
	public static WebElement companyDropDownList;

	/*@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/header[1]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]")
public static WebElement userNameDisplay;

@FindBy(xpath="//*[@id='companyLogoImg']")
public static WebElement companyLogoImg;

@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
public static WebElement companyName;

@FindBy(xpath="//*[@id='userprofile']/li/span[2]")
public static WebElement logoutOption;
	 */



	public boolean checkLogoutAndLoginWithNewlySavedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
			userNameDisplayLogo.click();
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();

			Thread.sleep(2000);

			getDriver().navigate().refresh();
			Thread.sleep(3000);

			getDriver().navigate().refresh();
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
			username.sendKeys(excelReader.getCellData(xlSheetName, 283, 6));
			getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
			password.sendKeys(excelReader.getCellData(xlSheetName, 284, 6));
			getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
			signIn.click();
			
			

			Thread.sleep(3000);
			
			reLogin(excelReader.getCellData(xlSheetName, 283, 6), excelReader.getCellData(xlSheetName, 284, 6), "Automation Company");

			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
			userNameTxt.click();

			String actUserInfo = userNameTxt.getText();
			String expUserInfo = excelReader.getCellData(xlSheetName, 283, 7);
			excelReader.setCellData(xlfile, xlSheetName, 283, 8, actUserInfo);

			Thread.sleep(2000);;

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
			companyLogoImg.click();

			String getCompanyTxt=companyName.getText();
			String actLoginCompanyName = getCompanyTxt.substring(0, 19);
			String expLoginCompanyName = excelReader.getCellData(xlSheetName, 284, 7);
			excelReader.setCellData(xlfile, xlSheetName, 284, 8, actLoginCompanyName);
			companyLogoImg.click();
			Thread.sleep(2000);

			System.out.println("UserInfo               : ."+actUserInfo          +".  value expected  ."+expUserInfo+".");
			System.out.println("LoginCompanyName       : ."+actLoginCompanyName  +".  value expected  ."+expLoginCompanyName+".");

			if(actUserInfo.equalsIgnoreCase(expUserInfo) && actLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))  
			{
				System.out.println("***Test Pass: Login Successfull***");
				excelReader.setCellData(xlfile, xlSheetName, 283, 9, resPass);
				return true;
			}
			else
			{

				System.out.println("***Test Fail: Login Not Successfull***");
				excelReader.setCellData(xlfile, xlSheetName, 283, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 283, 10, exception);
			return false;
		}
	}







	public boolean checkLogoutAndLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
			userNameDisplayLogo.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
			username.sendKeys(excelReader.getCellData(xlSheetName, 285, 6));
			getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
			password.sendKeys(excelReader.getCellData(xlSheetName, 286, 6));

			getAction().moveToElement(password).sendKeys(Keys.TAB).perform();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));

			signIn.click();

			Thread.sleep(3000);
			reLogin(excelReader.getCellData(xlSheetName, 285, 6), excelReader.getCellData(xlSheetName, 286, 6), "Automation Company");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
			userNameTxt.click();

			String actUserInfo = userNameTxt.getText();
			String expUserInfo = excelReader.getCellData(xlSheetName, 285, 7);
			excelReader.setCellData(xlfile, xlSheetName, 285, 8, actUserInfo);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));

			companyLogoImg.click();

			String getCompanyTxt=companyName.getText();
			String actLoginCompanyName = getCompanyTxt.substring(0, 19);
			String expLoginCompanyName = excelReader.getCellData(xlSheetName, 286, 7);
			excelReader.setCellData(xlfile, xlSheetName, 286, 8, actLoginCompanyName);
			companyLogoImg.click();

			System.out.println("UserInfo               : ."+actUserInfo          +".  value expected  ."+expUserInfo+".");
			System.out.println("LoginCompanyName       : ."+actLoginCompanyName  +".  value expected  ."+expLoginCompanyName+".");

			if(actUserInfo.equalsIgnoreCase(expUserInfo) && actLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))  
			{
				System.out.println("***Test Pass: Login Successfull***");
				excelReader.setCellData(xlfile, xlSheetName, 285, 9, resPass);
				return true;
			}
			else
			{

				System.out.println("***Test Fail: Login Not Successfull***");
				excelReader.setCellData(xlfile, xlSheetName, 285, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 285, 10, exception);

			return false;
		}
	}






	public boolean checkEditingAndUpdatingSavedUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{ 
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
			securityMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
			createUserMenu.click();

			Thread.sleep(4000);

			int actUsersCount=createUserSavedUsersList.size();

			System.out.println(actUsersCount);

			boolean actData=true;

			for (int i = 0; i < actUsersCount; i++) 
			{
				String actUser=createUserSavedUsersList.get(i).getText();

				if (actUser.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 287, 6))) 
				{
					createUserSavedUsersList.get(i).click();

					Thread.sleep(2000);

					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
					createUserPasswordTxt.clear();
					createUserPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 288, 6));

					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
					createUserConfirmPasswordTxt.clear();
					createUserConfirmPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 289, 6));

					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
					createUserNameTxt.clear();
					createUserNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 290, 6));
/*
					for(int j=0;j<5;j++)
					{
						boolean actValidationMessage=errorMessage.getText().isEmpty();

						System.err.println("actValidationMessage : "+actValidationMessage);
						if(actValidationMessage==false)
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
							errorMessageCloseBtn.click();
						}	
					}*/

					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
					createUserSaveIcon.click();

					String expMessage = excelReader.getCellData(xlSheetName, 291, 7);
					String actMessage = checkValidationMessage(expMessage);
					excelReader.setCellData(xlfile, xlSheetName, 291, 8, actMessage);

					if (actMessage.equalsIgnoreCase(expMessage)) 
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
						createUserCloseIcon.click();

						excelReader.setCellData(xlfile, xlSheetName, 287, 9, resPass);
						actData=true;
					}
					else 
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
						createUserCloseIcon.click();

						excelReader.setCellData(xlfile, xlSheetName, 287, 9, resFail);
						actData=false;
					}
				} 
				else 
				{
					System.out.println("User NOT Found");
					excelReader.setCellData(xlfile, xlSheetName, 287, 9, resPass);
					actData=false;
				}
			}	
			return actData;
		
	}








	public boolean checkUserDataInUpdatedUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
			securityMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
			createUserMenu.click();

			Thread.sleep(4000);

			int actUsersCount=createUserSavedUsersList.size();

			System.out.println(actUsersCount);

			boolean actData=true;

			for (int i = 0; i < actUsersCount; i++) 
			{
				String actUser=createUserSavedUsersList.get(i).getText();

				if (actUser.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 292, 6))) 
				{
					createUserSavedUsersList.get(i).click();

					Thread.sleep(2000);

					String actLoginName = createUserLoginNameTxt.getAttribute("value");
					String expLoginName = excelReader.getCellData(xlSheetName, 293, 7);
					excelReader.setCellData(xlfile, xlSheetName, 293, 8, actLoginName);

					Select ERPRole = new Select(createUserERPRoleDropDown);
					String actERPRole = ERPRole.getFirstSelectedOption().getText();
					String expERPRole = "Test";
					excelReader.setCellData(xlfile, xlSheetName, 294, 8, actERPRole);

					Select PP = new Select(createUserPasswordPolicyDropdown);
					String actPasswordPolicy = PP.getFirstSelectedOption().getText();
					String expPasswordPolicy = "Simple Policy";
					excelReader.setCellData(xlfile, xlSheetName, 295, 8, actPasswordPolicy);

					String actUserName = createUserNameTxt.getAttribute("value");
					String expUserName = excelReader.getCellData(xlSheetName, 296, 7);
					excelReader.setCellData(xlfile, xlSheetName, 296, 8, actUserName);

					String actLoginAbbreviation = createUserLoginAbbrivationTxt.getAttribute("value");
					String expLoginAbbreviation = excelReader.getCellData(xlSheetName, 297, 7);
					excelReader.setCellData(xlfile, xlSheetName, 297, 8, actLoginAbbreviation);

					Select SQ = new Select(createUserSecurityQuestionDropDown);
					String actSecutiryQuestion = SQ.getFirstSelectedOption().getText();
					String expSecutiryQuestion = excelReader.getCellData(xlSheetName, 298, 7);
					excelReader.setCellData(xlfile, xlSheetName, 298, 8, actSecutiryQuestion);

					String actSecurityAnswer = createUserSecurityAnswerTxt.getAttribute("value");
					String expSecurityAnswer = excelReader.getCellData(xlSheetName, 299, 7);
					excelReader.setCellData(xlfile, xlSheetName, 299, 8, actSecurityAnswer);

					Select language = new Select(createUserLanguageTxt);
					String actLanguage = language.getFirstSelectedOption().getText();
					String expLanguage = excelReader.getCellData(xlSheetName, 300, 7);
					excelReader.setCellData(xlfile, xlSheetName, 300, 8, actLanguage);

					Select altLanguage = new Select(createUserAlternateLanguageTxt);
					String actAltLanguage = altLanguage.getFirstSelectedOption().getText();
					String expAltLanguage = excelReader.getCellData(xlSheetName, 301, 7);
					excelReader.setCellData(xlfile, xlSheetName, 301, 8, actAltLanguage);

					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
					createUserAdditionalInfoTab.click();

					Thread.sleep(2000);

					String actEmail = createUserEmailTxt.getAttribute("value");
					String expEmail = excelReader.getCellData(xlSheetName, 302, 7);
					excelReader.setCellData(xlfile, xlSheetName, 302, 8, actEmail);

					Select userType = new Select(createUserUserTypeDrpDwn);
					String actUserType = userType.getFirstSelectedOption().getText();
					String expUserType = excelReader.getCellData(xlSheetName, 303, 7);
					excelReader.setCellData(xlfile, xlSheetName, 303, 8, actUserType);

					System.out.println("LoginName         : "+actLoginName         +"  value expected  "+expLoginName);
					System.out.println("ERPRole           : "+actERPRole           +"  value expected  "+expERPRole);
					System.out.println("PasswordPolicy    : "+actPasswordPolicy    +"  value expected  "+expPasswordPolicy);
					/*System.out.println("UserName          : "+actUserName          +"  value expected  "+expUserName);*/
					System.out.println("LoginAbbreviation : "+actLoginAbbreviation +"  value expected  "+expLoginAbbreviation);
					System.out.println("SecutiryQuestion  : "+actSecutiryQuestion  +"  value expected  "+expSecutiryQuestion);
					System.out.println("SecurityAnswer    : "+actSecurityAnswer    +"  value expected  "+expSecurityAnswer);
					System.out.println("Language          : "+actLanguage          +"  value expected  "+expLanguage);
					System.out.println("AltLanguage       : "+actAltLanguage       +"  value expected  "+expAltLanguage);
					System.out.println("Email             : "+actEmail             +"  value expected  "+expEmail);
					System.out.println("UserType          : "+actUserType          +"  value expected  "+expUserType);


					if (actLoginName.equalsIgnoreCase(expLoginName) && actERPRole.equalsIgnoreCase(expERPRole) && actPasswordPolicy.equalsIgnoreCase(expPasswordPolicy) &&
							/*actUserName.equalsIgnoreCase(expUserName) && */actLoginAbbreviation.equalsIgnoreCase(expLoginAbbreviation) && 
							actSecutiryQuestion.equalsIgnoreCase(expSecutiryQuestion) && actSecurityAnswer.equalsIgnoreCase(expSecurityAnswer) &&
							actLanguage.equalsIgnoreCase(expLanguage) && actAltLanguage.equalsIgnoreCase(expAltLanguage) && actEmail.equalsIgnoreCase(expEmail) &&
							actUserType.equalsIgnoreCase(expUserType)) 
					{
						excelReader.setCellData(xlfile, xlSheetName, 292, 9, resPass);
						actData=true;
					}
					else 
					{
						excelReader.setCellData(xlfile, xlSheetName, 292, 9, resFail);
						actData=false;
					}

				} 

				else 
				{
					excelReader.setCellData(xlfile, xlSheetName, 292, 9, resFail);
					actData=false;
				}
			}

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
			createUserCloseIcon.click();

			return actData;
		}
		
	





	@FindBy(xpath="//*[@id='errmsgDiv']")
	public static WebElement mandatoryMsgs;

	/*@FindBy(xpath="//div[@id='id_login_div']//div[contains(text(),'Invalid Password')]")
	public static WebElement invalidPasswordMsgs;*/
	
	@FindBy(xpath="//*[@id='errmsgDiv']")
	public static WebElement invalidPasswordMsgs;
	
	

	public boolean checkLogoutAndLoginWithUpdatedUserWithPreviousPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();

			Thread.sleep(2000);

			getDriver().navigate().refresh();
			Thread.sleep(3000);



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
			username.sendKeys(excelReader.getCellData(xlSheetName, 304, 6));
			getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
			password.sendKeys(excelReader.getCellData(xlSheetName, 305, 6));

			getAction().moveToElement(password).sendKeys(Keys.TAB).perform();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));

			signIn.click();

			String actMessage = invalidPasswordMsgs.getText();
			String expMessage = excelReader.getCellData(xlSheetName, 304, 7);
			excelReader.setCellData(xlfile, xlSheetName, 304, 8, actMessage);

			System.out.println("mandatoryMsgs : "+actMessage+"  value expected  "+expMessage);

			if(actMessage.equalsIgnoreCase(expMessage))  
			{
				excelReader.setCellData(xlfile, xlSheetName, 304, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 304, 9, resFail);
				return false;
			}
		
	}







	public boolean checkLoginWithUpdatedPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
			username.sendKeys(Keys.END);
			username.sendKeys(Keys.SHIFT,Keys.HOME);
			Thread.sleep(2000);
			username.sendKeys(excelReader.getCellData(xlSheetName, 304, 6));

			getAction().moveToElement(username).sendKeys(Keys.TAB).perform();


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
			password.sendKeys(excelReader.getCellData(xlSheetName, 306, 6));

			getAction().moveToElement(password).sendKeys(Keys.TAB).perform();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));

			signIn.click();

			Thread.sleep(3000);
			
			reLogin(excelReader.getCellData(xlSheetName, 304, 6), excelReader.getCellData(xlSheetName, 306, 6), "Automation Company");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
			userNameTxt.click();

			String actUserInfo = userNameTxt.getText();
			String expUserInfo = excelReader.getCellData(xlSheetName, 307, 7);
			excelReader.setCellData(xlfile, xlSheetName, 307, 8, actUserInfo);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));

			companyLogoImg.click();

			String getCompanyTxt=companyName.getText();
			String actLoginCompanyName = getCompanyTxt.substring(0, 19);
			String expLoginCompanyName = excelReader.getCellData(xlSheetName, 308, 7);
			excelReader.setCellData(xlfile, xlSheetName, 308, 8, actLoginCompanyName);

			companyLogoImg.click();

			System.out.println("UserInfo               : "+actUserInfo            +"  value expected  "+expUserInfo);
			System.out.println("LoginCompanyName       : "+actLoginCompanyName    +"  value expected  "+expLoginCompanyName);

			if(actUserInfo.equalsIgnoreCase(expUserInfo) && actLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))  
			{
				System.out.println("***Test Pass: Login Successfull***");
				excelReader.setCellData(xlfile, xlSheetName, 306, 9, resPass);
				return true;
			}
			else
			{

				System.out.println("***Test Fail: Login Not Successfull***");
				excelReader.setCellData(xlfile, xlSheetName, 306, 9, resFail);
				return false;
			}
		
	}







	public boolean checkLogoutAndLoginWithSUToUpdatedUserDeleteUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
			username.sendKeys(excelReader.getCellData(xlSheetName, 309, 6));
			getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
			password.sendKeys(excelReader.getCellData(xlSheetName, 310, 6));

			getAction().moveToElement(password).sendKeys(Keys.TAB).perform();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));

			signIn.click();

			Thread.sleep(3000);
			
			reLogin(excelReader.getCellData(xlSheetName, 309, 6), excelReader.getCellData(xlSheetName, 310, 6), "Automation Company");
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
			userNameTxt.click();

			String actUserInfo = userNameTxt.getText();
			String expUserInfo = excelReader.getCellData(xlSheetName, 309, 7);
			excelReader.setCellData(xlfile, xlSheetName, 309, 8, actUserInfo);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));

			companyLogoImg.click();

			String getCompanyTxt = companyName.getText();
			String actLoginCompanyName = getCompanyTxt.substring(0, 19);
			String expLoginCompanyName = excelReader.getCellData(xlSheetName, 310, 7);
			excelReader.setCellData(xlfile, xlSheetName, 310, 8, actLoginCompanyName);

			companyLogoImg.click();

			System.out.println("UserInfo               : "+actUserInfo            +"  value expected  "+expUserInfo);
			System.out.println("LoginCompanyName       : "+actLoginCompanyName    +"  value expected  "+expLoginCompanyName);

			if(actUserInfo.equalsIgnoreCase(expUserInfo) && actLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))  
			{
				System.out.println("***Test Pass: Login Successfull***");
				excelReader.setCellData(xlfile, xlSheetName, 309, 9, resPass);
				return true;
			}
			else
			{

				System.out.println("***Test Fail: Login Not Successfull***");
				excelReader.setCellData(xlfile, xlSheetName, 309, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 309, 10, exception);
			return false;
		}
	}







	public boolean checkDeletingUpdatedUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
			securityMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
			createUserMenu.click();

			Thread.sleep(4000);

			int actUsersCount=createUserSavedUsersList.size();

			for (int i = 0; i < actUsersCount; i++) 
			{
				String actUser=createUserSavedUsersList.get(i).getText();
				System.out.println(actUser);

				if (actUser.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 311, 6))) 
				{
					createUserSavedUsersList.get(i).click();

					Thread.sleep(2000);
				}
			}

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserDeleteIcon));
			createUserDeleteIcon.click();

			getWaitForAlert();

			getAlert().accept();

			String expMessage = excelReader.getCellData(xlSheetName, 311, 7);
			String actMessage = checkValidationMessage(expMessage);
			excelReader.setCellData(xlfile, xlSheetName, 311, 8, actMessage);

			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
				createUserCloseIcon.click();

				excelReader.setCellData(xlfile, xlSheetName, 311, 9, resPass);
				return true;
			} 
			else 
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
				createUserCloseIcon.click();

				excelReader.setCellData(xlfile, xlSheetName, 311, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 311, 10, exception);
			return false;
		}	
	}
















	@FindBy(xpath="//tbody[@id='profileName_table_data_body']/tr")
	public static List<WebElement> createProfileNameTxtList;

	@FindBy(xpath="//ul[@id='PolicyListDiv']/li")
	public static List<WebElement> policyNameCount;

	@FindBy(xpath="//ul[@id='PolicyListDiv']/li[1]")
	public static WebElement policyNameSimplePolicy;

	@FindBy(xpath="//ul[@id='PolicyListDiv']/li[2]")
	public static WebElement policyNameAlphabetsWithDontAllowPreviousAsThree;

	@FindBy(xpath="//ul[@id='PolicyListDiv']/li[3]")
	public static WebElement policyNameAlphabetsWithNumeric;

	@FindBy(xpath="//ul[@id='PolicyListDiv']/li[4]")
	public static WebElement policyNameAlphabetsWithNumericStar;

	@FindBy(xpath="//ul[@id='PolicyListDiv']/li[5]")
	public static WebElement policyNameNumeric;

	@FindBy(xpath="//ul[@id='PolicyListDiv']/li[6]")
	public static WebElement policyNameAlphaNumericSpecial;

	@FindBy(xpath="//ul[@id='PolicyListDiv']/li[7]")
	public static WebElement policyNameAlphaNumericSpecialStarWithAllOptions;

	@FindBy(xpath="//ul[@id='PolicyListDiv']/li[8]")
	public static WebElement policyNameSimpleWithCannotChangePassword;




	@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[4]")
	public static WebElement openingStocksNewHomeRow1VoucherNo;

	@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[5]")
	public static WebElement openingStocksNewHomeRow1CreatedBy;

	@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[6]")
	public static WebElement openingStocksNewHomeRow1ModifiedBy;

	@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[11]")
	public static WebElement openingStocksNewHomeRow1SuspendStatus;

	@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[12]")
	public static WebElement openingStocksNewHomeRow1AuthorizationStatus;

	@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr")
	public static List<WebElement> openingStocksNewHomePageTableRowsCount;







	public boolean CheckSavingaNetWorkPolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
			securityMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicy));
			networkPolicy.click();

			Thread.sleep(3000);

			if(allowRadioBtnInNetworkPolicy.isSelected()==false)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowRadioBtnInNetworkPolicy));
				allowRadioBtnInNetworkPolicy.click();
			}

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fromIp));
			fromIp.click();

			getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(fromIp).sendKeys(Keys.BACK_SPACE).perform();

			fromIp.sendKeys(excelReader.getCellData(xlSheetName, 328, 6));

			getAction().moveToElement(fromIp).sendKeys(Keys.TAB).perform();


			getAction().moveToElement(toIp).sendKeys(Keys.RIGHT).perform();

			getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

			getAction().moveToElement(toIp).sendKeys(Keys.BACK_SPACE).perform();

			toIp.sendKeys(excelReader.getCellData(xlSheetName, 329, 6));

			getAction().moveToElement(toIp).sendKeys(Keys.TAB).perform();

			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addIp));
			addIp.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInNetworkPolicy));
			saveBtnInNetworkPolicy.click();

			System.out.println("*****************************************checkClickOnSaveBtn**********************************************");

			String expMessage=excelReader.getCellData(xlSheetName, 328, 7);

			String actMessage=checkValidationMessage(expMessage);

			excelReader.setCellData(xlfile, xlSheetName, 328, 8, actMessage);

			System.out.println("Saving Message of NetWork Policy : " +actMessage+" Value Expected : "+expMessage);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInNetworkPolicy));
			closeBtnInNetworkPolicy.click();

			getWaitForAlert();

			getAlert().accept();

			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Pass : Network policy saved successfully");
				excelReader.setCellData(xlfile, xlSheetName, 328, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Fail : Network policy not saved successfully");
				excelReader.setCellData(xlfile, xlSheetName, 328, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();

			excelReader.setCellData(xlfile, xlSheetName, 328, 10, exception);

			return false;
		}
	}

	public boolean CheckSavingPassWordPolicyOfNumericTypeandSimplePolicy() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySubMenu));
		passwordPolicySubMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
		passwordPolicyAddBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(policyName));
		policyName.sendKeys(excelReader.getCellData(xlSheetName, 330, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordLength));
		passwordLength.sendKeys(excelReader.getCellData(xlSheetName, 331, 6));

		getAction().moveToElement(passwordLength).sendKeys(Keys.TAB).perform();

		WebElement comboBox = passwordComplexity;
		Select selectedValue = new Select(comboBox);
		selectedValue.selectByVisibleText(excelReader.getCellData(xlSheetName, 332, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
		passwordPolicySaveBtn.click();

		System.out.println("*********************************************CheckSavingPassWordPolicyOfNumericTypeandSimplePolicy**************************************************");

		String expMessage=excelReader.getCellData(xlSheetName, 330, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 330, 8, actMessage);

		System.out.println("Saving Message of PassWord Pplicy : " +actMessage+" Value Expected : "+expMessage);

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyAddBtn));
			passwordPolicyAddBtn.click();

		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(policyName));
			policyName.sendKeys(excelReader.getCellData(xlSheetName, 333, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordLength));
			passwordLength.sendKeys(excelReader.getCellData(xlSheetName, 334, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicySaveBtn));
			passwordPolicySaveBtn.click();


			String expMessage1=excelReader.getCellData(xlSheetName, 331, 7);

			String actMessage1=checkValidationMessage(expMessage1);

		    excelReader.setCellData(xlfile, xlSheetName, 331, 8, actMessage1);*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordPolicyCloseBtn));
		passwordPolicyCloseBtn.click();

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass:  All Profile Is Saved ");
			excelReader.setCellData(xlfile, xlSheetName, 330, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail: All Profile Is Saved");
			excelReader.setCellData(xlfile, xlSheetName, 330, 9, resFail);
			return false;
		}

	}



	@FindBy(xpath="//*[@id='Profilemenu']/li/i")
	public static List<WebElement> profileMenuPanelList;


	public boolean CheckSavingAllProfileSTwithAlloptionsEnabled() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfile));
		createProfile.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileProfileNameCombo));
		createProfileProfileNameCombo.click();
		createProfileProfileNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 314, 6),Keys.TAB);

		int profileMenuPanelListCount = profileMenuPanelList.size();
		System.out.println("profileMenuPanelListCount: "+profileMenuPanelListCount);

		for(int i=0;i<profileMenuPanelListCount;i++)
		{	
			Thread.sleep(2000);
			profileMenuPanelList.get(i).click();	
			System.err.println("element clicked");
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSelectAllIcon));
			createProfileSelectAllIcon.click();
		}



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileSaveIcon));
		createProfileSaveIcon.click();

		System.out.println("***********************************************CheckSavingAllProfileSTwithAlloptionsEnabled************************************************");

		String expMessage=excelReader.getCellData(xlSheetName, 314, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 314, 8, actMessage);

		System.out.println("Saving Message of Profile : " +actMessage+" Value Expected : "+expMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createProfileCloseIcon));
		createProfileCloseIcon.click();

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			System.out.println("  Pass:  All Profile Is Saved ");
			excelReader.setCellData(xlfile, xlSheetName, 314, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail: All Profile Is Saved");
			excelReader.setCellData(xlfile, xlSheetName, 314, 9, resFail);
			return false;
		}

	}

	@FindBy(xpath="//*[@id='availableProfiles']/li")
	public static List<WebElement> avaliableprofileList ;



	public boolean  checkSavingRoleWithAllProfileST() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		homeSecurityCreateRoleMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 315, 6));
		Thread.sleep(2000);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlSheetName, 316, 6));


		Thread.sleep(2000);

		int avaliableprofileListCount = avaliableprofileList.size();

		for(int i=0;i<avaliableprofileListCount;i++)
		{
			String data = avaliableprofileList.get(i).getText();

			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 317, 6)))
			{
				avaliableprofileList.get(i).click();
			}
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		System.out.println("**************************************checkSavingRoleWithAllProfileST***********************************************");

		String expMessage=excelReader.getCellData(xlSheetName, 315, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 315, 8, actMessage);

		System.out.println("Saving Message of Rolw : " +actMessage+" Value Expected : "+expMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
		createRoleCloseIcon.click();

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 315, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 315, 9, resFail);
			return false;
		}


	}


	public boolean  checkSavingUserWithRoleST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
		createUserMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.click();
		createUserLoginNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 318, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.click();
		createUserERPRoleDropDown.sendKeys(excelReader.getCellData(xlSheetName, 319, 6));
		Thread.sleep(2000);
		createUserERPRoleDropDown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 320, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 321, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 322, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginAbbrivationTxt));
		createUserLoginAbbrivationTxt.sendKeys(excelReader.getCellData(xlSheetName, 323, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.sendKeys(excelReader.getCellData(xlSheetName, 324, 6));
		Thread.sleep(2000);
		createUserSecurityQuestionDropDown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityAnswerTxt));
		createUserSecurityAnswerTxt.sendKeys(excelReader.getCellData(xlSheetName, 325, 6));
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSelectTimeZoneDropdown));
		Select userTime = new Select(createUserSelectTimeZoneDropdown);
		userTime.selectByVisibleText("(GMT+05:30) Chennai, Kolkatta, Mumbai, New Delhi");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText(excelReader.getCellData(xlSheetName, 326, 6));


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys(excelReader.getCellData(xlSheetName, 327, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
		createUserUserInformationTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		System.out.println("***********************************checkSavingUserWithRoleST************************************");

		String expMessage=excelReader.getCellData(xlSheetName, 318, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 318, 8, actMessage);

		System.out.println("Saving Message of User : " +actMessage+" Value Expected : "+expMessage);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
		createUserCloseIcon.click();

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, xlSheetName, 318, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 318, 9, resFail);
			return false;
		}

	}


	public boolean  checkSavingUserWithRoleSTRestriction() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		securityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
		createUserMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		createUserIcon.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		createUserLoginNameTxt.click();
		createUserLoginNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 347, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		createUserERPRoleDropDown.click();
		createUserERPRoleDropDown.sendKeys(excelReader.getCellData(xlSheetName, 348, 6));
		Thread.sleep(2000);
		createUserERPRoleDropDown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		createUserPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 349, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		createUserConfirmPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 350, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		createUserNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 351, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginAbbrivationTxt));
		createUserLoginAbbrivationTxt.sendKeys(excelReader.getCellData(xlSheetName, 352, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
		createUserSecurityQuestionDropDown.sendKeys(excelReader.getCellData(xlSheetName, 353, 6));
		Thread.sleep(2000);
		createUserSecurityQuestionDropDown.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityAnswerTxt));
		createUserSecurityAnswerTxt.sendKeys(excelReader.getCellData(xlSheetName, 354, 6));
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSelectTimeZoneDropdown));
		Select userTime = new Select(createUserSelectTimeZoneDropdown);
		userTime.selectByVisibleText("(GMT+05:30) Chennai, Kolkatta, Mumbai, New Delhi");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
		Select user=new Select(createUserUserTypeDrpDwn);
		user.selectByVisibleText(excelReader.getCellData(xlSheetName, 355, 6));


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
		createUserEmailTxt.sendKeys(excelReader.getCellData(xlSheetName, 356, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserInformationTab));
		createUserUserInformationTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();

		System.out.println("***********************************checkSavingUserWithRoleSTRestriction************************************");

		String expMessage=excelReader.getCellData(xlSheetName, 347, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 347, 8, actMessage);

		System.out.println("Saving Message of User : " +actMessage+" Value Expected : "+expMessage);

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
		    createUserCloseIcon.click();*/

		if (actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, xlSheetName, 347, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 347, 9, resFail);
			return false;
		}

	}



	public boolean  checkSavingUserWithExclusion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	    	homeMenu.click();

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
	    	securityMenu.click();

	 	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
	 	    createUserMenu.click();

	 	    Thread.sleep(3000);*/

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
			createUserIcon.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
			createUserLoginNameTxt.click();
			createUserLoginNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 465, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
			createUserERPRoleDropDown.click();

			createUserERPRoleDropDown.sendKeys(excelReader.getCellData(xlSheetName, 466, 6));
			Thread.sleep(2000);
			createUserERPRoleDropDown.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			createUserPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 467, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
			createUserConfirmPasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 468, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
			createUserNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 469, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginAbbrivationTxt));
			createUserLoginAbbrivationTxt.sendKeys(excelReader.getCellData(xlSheetName, 470, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityQuestionDropDown));
			createUserSecurityQuestionDropDown.sendKeys(excelReader.getCellData(xlSheetName, 471, 6));
			Thread.sleep(2000);
			createUserSecurityQuestionDropDown.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityAnswerTxt));
			createUserSecurityAnswerTxt.sendKeys(excelReader.getCellData(xlSheetName, 472, 6));
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSelectTimeZoneDropdown));
			Select userTime = new Select(createUserSelectTimeZoneDropdown);
			userTime.selectByVisibleText("(GMT+05:30) Chennai, Kolkatta, Mumbai, New Delhi");

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
			createUserAdditionalInfoTab.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
			Select user=new Select(createUserUserTypeDrpDwn);
			user.selectByVisibleText(excelReader.getCellData(xlSheetName, 473, 6));


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
			createUserEmailTxt.sendKeys(excelReader.getCellData(xlSheetName, 474, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
			createUserRestrictionforentryTab.click();

			// Account

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryAccount));
			resOFEntryAccount.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
			gridFirstRowMasterToClick.click();

			gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 475, 6));
			Thread.sleep(3000);
			gridMasterAfterClick.sendKeys(Keys.TAB);

			String actAccountSelection			=gridMasterAfterClick.getAttribute("value");
			String expAccountSelection			=excelReader.getCellData(xlSheetName, 475, 7);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
			gridEntryFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
			gridReportFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
			gridViewFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
			gridSecondRowMasterToClick.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
			resOFEntryExclusionchkBox.click();


			// Item

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryItem));
			resOFEntryItem.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
			gridFirstRowMasterToClick.click();

			gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 476, 6));
			Thread.sleep(2000);
			gridMasterAfterClick.sendKeys(Keys.TAB);

			String actItemFirstSelection			=gridMasterAfterClick.getAttribute("value");
			String expItemFirstSelection			=excelReader.getCellData(xlSheetName, 476, 7);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
			gridEntryFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
			gridReportFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
			gridViewFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
			gridSecondRowMasterToClick.click();

			gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 477, 6));
			Thread.sleep(3000);
			gridMasterAfterClick.sendKeys(Keys.TAB);

			String actItemSecondSelection		=gridMasterAfterClick.getAttribute("value");
			String expItemSecondSelection			=excelReader.getCellData(xlSheetName, 477, 7);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
			gridEntrySecondRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
			gridReportSecondRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
			gridViewSecondRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
			resOFEntryExclusionchkBox.click();


			// Warehouse

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryWarehouse));
			resOFEntryWarehouse.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
			gridFirstRowMasterToClick.click();

			gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 478, 6));
			Thread.sleep(2000);
			gridMasterAfterClick.sendKeys(Keys.TAB);

			String actWarehouseFirstSelection			=gridMasterAfterClick.getAttribute("value");
			String expWarehouseFirstSelection			=excelReader.getCellData(xlSheetName, 478, 7);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
			gridEntryFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
			gridReportFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
			gridViewFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
			resOFEntryExclusionchkBox.click();



			// Department

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryDepartment));
			resOFEntryDepartment.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
			gridFirstRowMasterToClick.click();

			gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 479, 6));
			Thread.sleep(2000);
			gridMasterAfterClick.sendKeys(Keys.TAB);

			String actDepartmentFirstSelection			=gridMasterAfterClick.getAttribute("value");
			String expDepartmentFirstSelection			=excelReader.getCellData(xlSheetName, 479, 7);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
			gridEntryFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
			gridReportFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
			gridViewFirstRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
			resOFEntryExclusionchkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			createUserSaveIcon.click();


			String expMessage=excelReader.getCellData(xlSheetName, 465, 7);

			String actMessage=checkValidationMessage(expMessage);

			excelReader.setCellData(xlfile, xlSheetName, 465, 8, actMessage);

			System.out.println("Saving Message of User : " +actMessage+" Value Expected : "+expMessage);

			System.out.println("actAccountSelection    : "+actAccountSelection  +"  value expected  "+expAccountSelection);
			System.out.println("ItemFirstSelection     : "+actItemFirstSelection+"  Value Expected : "+expItemFirstSelection);
			System.out.println("ItemSecondSelection     : "+actItemSecondSelection+"  Value Expected : "+expItemSecondSelection);

			System.out.println("WarehouseFirstSelection     : "+actWarehouseFirstSelection+"  Value Expected : "+expWarehouseFirstSelection);

			System.out.println("DepartmentFirstSelection     : "+actDepartmentFirstSelection+"  Value Expected : "+expDepartmentFirstSelection);


			if(actMessage.equalsIgnoreCase(expMessage) && actAccountSelection.equalsIgnoreCase(expAccountSelection) 
					&& actItemFirstSelection.equalsIgnoreCase(expItemFirstSelection) && actItemSecondSelection.equalsIgnoreCase(expItemSecondSelection)
					&& actWarehouseFirstSelection.equalsIgnoreCase(expWarehouseFirstSelection) 
					&& actDepartmentFirstSelection.equalsIgnoreCase(expDepartmentFirstSelection))
			{
				excelReader.setCellData(xlfile, xlSheetName, 465, 9, resPass);
				return true;
			} 
			else 
			{

				System.out.println("Fail : Displayed Create User Screen");
				excelReader.setCellData(xlfile, xlSheetName, 465, 9, resFail);
				return false;
			}
		
	}



	@FindBy(xpath="//span[contains(text(),'UserExclusionST')]")
	public static WebElement userExclusionSt;



	public boolean  checkSavedUserWithExclusionAndUpdating() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userExclusionSt));
		userExclusionSt.click();

		Thread.sleep(3000);

		String actLoginName = createUserLoginNameTxt.getAttribute("value");
		String expLoginName = excelReader.getCellData(xlSheetName, 480, 7);
		excelReader.setCellData(xlfile, xlSheetName, 480, 8, actLoginName);

		Select ERPRole = new Select(createUserERPRoleDropDown);
		String actERPRole = ERPRole.getFirstSelectedOption().getText();
		String expERPRole = excelReader.getCellData(xlSheetName, 481, 7);
		excelReader.setCellData(xlfile, xlSheetName, 481, 8, actERPRole);

		Select PP = new Select(createUserPasswordPolicyDropdown);
		String actPasswordPolicy = PP.getFirstSelectedOption().getText();
		String expPasswordPolicy = excelReader.getCellData(xlSheetName, 482, 7);
		excelReader.setCellData(xlfile, xlSheetName, 482, 8, actPasswordPolicy);

		String actUserName = createUserNameTxt.getAttribute("value");
		String expUserName = excelReader.getCellData(xlSheetName, 483, 7);
		excelReader.setCellData(xlfile, xlSheetName, 483, 8, actUserName);

		String actLoginAbbreviation = createUserLoginAbbrivationTxt.getAttribute("value");
		String expLoginAbbreviation = excelReader.getCellData(xlSheetName, 484, 7);
		excelReader.setCellData(xlfile, xlSheetName, 484, 8, actLoginAbbreviation);

		Select SQ = new Select(createUserSecurityQuestionDropDown);
		String actSecutiryQuestion = SQ.getFirstSelectedOption().getText();
		String expSecutiryQuestion = excelReader.getCellData(xlSheetName, 485, 7);
		excelReader.setCellData(xlfile, xlSheetName, 485, 8, actSecutiryQuestion);

		String actSecurityAnswer = createUserSecurityAnswerTxt.getAttribute("value");
		String expSecurityAnswer = excelReader.getCellData(xlSheetName, 486, 7);
		excelReader.setCellData(xlfile, xlSheetName, 486, 8, actSecurityAnswer);

		Select language = new Select(createUserLanguageTxt);
		String actLanguage = language.getFirstSelectedOption().getText();
		String expLanguage = excelReader.getCellData(xlSheetName, 487, 7);
		excelReader.setCellData(xlfile, xlSheetName, 487, 8, actLanguage);

		Select altLanguage = new Select(createUserAlternateLanguageTxt);
		String actAltLanguage = altLanguage.getFirstSelectedOption().getText();
		String expAltLanguage = excelReader.getCellData(xlSheetName, 488, 7);
		excelReader.setCellData(xlfile, xlSheetName, 488, 8, actAltLanguage);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		Thread.sleep(2000);

		String actEmail = createUserEmailTxt.getAttribute("value");
		String expEmail = excelReader.getCellData(xlSheetName, 489, 7);
		excelReader.setCellData(xlfile, xlSheetName, 489, 8, actEmail);

		Select userType = new Select(createUserUserTypeDrpDwn);
		String actUserType = userType.getFirstSelectedOption().getText();
		String expUserType = excelReader.getCellData(xlSheetName, 490, 7);
		excelReader.setCellData(xlfile, xlSheetName, 490, 8, actUserType);



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		createUserRestrictionforentryTab.click();

		// Account

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryAccount));
		resOFEntryAccount.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actAccountSelection			=gridFirstRowMasterToClick.getText();
		String expAccountSelection			=excelReader.getCellData(xlSheetName, 491, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
		boolean accresOFEntryExclusionchkBox = resOFEntryExclusionchkBox.isSelected();

		// Updtae Account

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		gridFirstRowMasterToClick.click();
		gridMasterAfterClick.sendKeys(Keys.END);
		gridMasterAfterClick.sendKeys(Keys.SHIFT,Keys.HOME);

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 492, 6));
		Thread.sleep(2000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actAccountSelectionUpdate			=gridMasterAfterClick.getAttribute("value");
		String expAccountSelectionUpdate			=excelReader.getCellData(xlSheetName, 492, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();


		// Item

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryItem));
		resOFEntryItem.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actItemFirstSelection			=gridFirstRowMasterToClick.getText();
		String expItemFirstSelection			=excelReader.getCellData(xlSheetName, 493, 7);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		String actItemSecondSelection		    =gridSecondRowMasterToClick.getText();
		String expItemSecondSelection			=excelReader.getCellData(xlSheetName, 494, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
		boolean itemresOFEntryExclusionchkBox = resOFEntryExclusionchkBox.isSelected();


		// Warehouse

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryWarehouse));
		resOFEntryWarehouse.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actWarehouseFirstSelection			=gridFirstRowMasterToClick.getText();
		String expWarehouseFirstSelection			=excelReader.getCellData(xlSheetName, 495, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
		boolean warehouseresOFEntryExclusionchkBox = resOFEntryExclusionchkBox.isSelected();


		// Department

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryDepartment));
		resOFEntryDepartment.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actDepartmentFirstSelection			=gridFirstRowMasterToClick.getText();
		String expDepartmentFirstSelection			=excelReader.getCellData(xlSheetName, 496, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
		boolean departmentresOFEntryExclusionchkBox = resOFEntryExclusionchkBox.isSelected();

		boolean actselected = accresOFEntryExclusionchkBox==true && itemresOFEntryExclusionchkBox==true && warehouseresOFEntryExclusionchkBox==true
				&& departmentresOFEntryExclusionchkBox==true;



		String actExclusion = Boolean.toString(actselected);

		String expExclusion = excelReader.getCellData(xlSheetName, 498, 7);

		excelReader.setCellData(xlfile, xlSheetName, 498, 8, actExclusion);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		createUserSaveIcon.click();


		String expMessage=excelReader.getCellData(xlSheetName, 497, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 497, 8, actMessage);



		excelReader.setCellData(xlfile, xlSheetName, 491, 8, actAccountSelection);
		excelReader.setCellData(xlfile, xlSheetName, 492, 8, actAccountSelectionUpdate);
		excelReader.setCellData(xlfile, xlSheetName, 493, 8, actItemFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 494, 8, actItemSecondSelection);
		excelReader.setCellData(xlfile, xlSheetName, 495, 8, actWarehouseFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 496, 8, actDepartmentFirstSelection);




		System.out.println("LoginName         : "+actLoginName         +"  value expected  "+expLoginName);
		System.out.println("ERPRole           : "+actERPRole           +"  value expected  "+expERPRole);
		System.out.println("PasswordPolicy    : "+actPasswordPolicy    +"  value expected  "+expPasswordPolicy);
		System.out.println("UserName          : "+actUserName          +"  value expected  "+expUserName);
		System.out.println("LoginAbbreviation : "+actLoginAbbreviation +"  value expected  "+expLoginAbbreviation);
		System.out.println("SecutiryQuestion  : "+actSecutiryQuestion  +"  value expected  "+expSecutiryQuestion);
		System.out.println("SecurityAnswer    : "+actSecurityAnswer    +"  value expected  "+expSecurityAnswer);
		System.out.println("Language          : "+actLanguage          +"  value expected  "+expLanguage);
		System.out.println("AltLanguage       : "+actAltLanguage       +"  value expected  "+expAltLanguage);
		System.out.println("Email             : "+actEmail             +"  value expected  "+expEmail);
		System.out.println("UserType          : "+actUserType          +"  value expected  "+expUserType);


		System.out.println("AccountSelection    : "+actAccountSelection  +"  value expected  "+expAccountSelection);
		System.out.println("AccountSelectionUpdate   : "+actAccountSelectionUpdate +"  value expected  "+expAccountSelectionUpdate);
		System.out.println("ItemFirstSelection     : "+actItemFirstSelection+"  Value Expected : "+expItemFirstSelection);
		System.out.println("ItemSecondSelection     : "+actItemSecondSelection+"  Value Expected : "+expItemSecondSelection);

		System.out.println("WarehouseFirstSelection     : "+actWarehouseFirstSelection+"  Value Expected : "+expWarehouseFirstSelection);

		System.out.println("DepartmentFirstSelection     : "+actDepartmentFirstSelection+"  Value Expected : "+expDepartmentFirstSelection);

		System.out.println("Exclusion     : "+actExclusion+"  Value Expected : "+expExclusion);


		if (actLoginName.equalsIgnoreCase(expLoginName) && actERPRole.equalsIgnoreCase(expERPRole) && actPasswordPolicy.equalsIgnoreCase(expPasswordPolicy) &&
				actUserName.equalsIgnoreCase(expUserName) && actLoginAbbreviation.equalsIgnoreCase(expLoginAbbreviation) && 
				actSecutiryQuestion.equalsIgnoreCase(expSecutiryQuestion) && actSecurityAnswer.equalsIgnoreCase(expSecurityAnswer) &&
				actLanguage.equalsIgnoreCase(expLanguage) && actAltLanguage.equalsIgnoreCase(expAltLanguage) && actEmail.equalsIgnoreCase(expEmail) &&
				actUserType.equalsIgnoreCase(expUserType) && actMessage.equalsIgnoreCase(expMessage) && actAccountSelection.equalsIgnoreCase(expAccountSelection)
				&& actAccountSelectionUpdate.equalsIgnoreCase(expAccountSelectionUpdate) && actItemFirstSelection.equalsIgnoreCase(expItemFirstSelection)
				&& actItemSecondSelection.equalsIgnoreCase(expItemSecondSelection) && actWarehouseFirstSelection.equalsIgnoreCase(expWarehouseFirstSelection)
				&& actDepartmentFirstSelection.equalsIgnoreCase(expDepartmentFirstSelection) && actExclusion.equalsIgnoreCase(expExclusion)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 480, 9, resPass);
			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 480, 9, resFail);
			return false;
		}
	}



	public boolean  checkUpdatedUserWithExclusion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userExclusionSt));
		userExclusionSt.click();

		String actLoginName = createUserLoginNameTxt.getAttribute("value");
		String expLoginName = excelReader.getCellData(xlSheetName, 499, 7);
		excelReader.setCellData(xlfile, xlSheetName, 499, 8, actLoginName);

		Select ERPRole = new Select(createUserERPRoleDropDown);
		String actERPRole = ERPRole.getFirstSelectedOption().getText();
		String expERPRole = excelReader.getCellData(xlSheetName, 500, 7);
		excelReader.setCellData(xlfile, xlSheetName, 500, 8, actERPRole);

		Select PP = new Select(createUserPasswordPolicyDropdown);
		String actPasswordPolicy = PP.getFirstSelectedOption().getText();
		String expPasswordPolicy = excelReader.getCellData(xlSheetName, 501, 7);
		excelReader.setCellData(xlfile, xlSheetName, 501, 8, actPasswordPolicy);

		String actUserName = createUserNameTxt.getAttribute("value");
		String expUserName = excelReader.getCellData(xlSheetName, 502, 7);
		excelReader.setCellData(xlfile, xlSheetName, 502, 8, actUserName);

		String actLoginAbbreviation = createUserLoginAbbrivationTxt.getAttribute("value");
		String expLoginAbbreviation = excelReader.getCellData(xlSheetName, 503, 7);
		excelReader.setCellData(xlfile, xlSheetName, 503, 8, actLoginAbbreviation);

		Select SQ = new Select(createUserSecurityQuestionDropDown);
		String actSecutiryQuestion = SQ.getFirstSelectedOption().getText();
		String expSecutiryQuestion = excelReader.getCellData(xlSheetName, 504, 7);
		excelReader.setCellData(xlfile, xlSheetName, 504, 8, actSecutiryQuestion);

		String actSecurityAnswer = createUserSecurityAnswerTxt.getAttribute("value");
		String expSecurityAnswer = excelReader.getCellData(xlSheetName, 505, 7);
		excelReader.setCellData(xlfile, xlSheetName, 505, 8, actSecurityAnswer);

		Select language = new Select(createUserLanguageTxt);
		String actLanguage = language.getFirstSelectedOption().getText();
		String expLanguage = excelReader.getCellData(xlSheetName, 506, 7);
		excelReader.setCellData(xlfile, xlSheetName, 506, 8, actLanguage);

		Select altLanguage = new Select(createUserAlternateLanguageTxt);
		String actAltLanguage = altLanguage.getFirstSelectedOption().getText();
		String expAltLanguage = excelReader.getCellData(xlSheetName, 507, 7);
		excelReader.setCellData(xlfile, xlSheetName, 507, 8, actAltLanguage);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
		createUserAdditionalInfoTab.click();

		Thread.sleep(2000);

		String actEmail = createUserEmailTxt.getAttribute("value");
		String expEmail = excelReader.getCellData(xlSheetName, 508, 7);
		excelReader.setCellData(xlfile, xlSheetName, 508, 8, actEmail);

		Select userType = new Select(createUserUserTypeDrpDwn);
		String actUserType = userType.getFirstSelectedOption().getText();
		String expUserType = excelReader.getCellData(xlSheetName, 509, 7);
		excelReader.setCellData(xlfile, xlSheetName, 509, 8, actUserType);



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
		createUserRestrictionforentryTab.click();

		// Account

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryAccount));
		resOFEntryAccount.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actAccountSelection			=gridFirstRowMasterToClick.getText();
		String expAccountSelection			=excelReader.getCellData(xlSheetName, 510, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
		boolean accresOFEntryExclusionchkBox = resOFEntryExclusionchkBox.isSelected();



		// Item

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryItem));
		resOFEntryItem.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actItemFirstSelection			=gridFirstRowMasterToClick.getText();
		String expItemFirstSelection			=excelReader.getCellData(xlSheetName, 511, 7);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		String actItemSecondSelection		    =gridSecondRowMasterToClick.getText();
		String expItemSecondSelection			=excelReader.getCellData(xlSheetName, 512, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
		boolean itemresOFEntryExclusionchkBox = resOFEntryExclusionchkBox.isSelected();


		// Warehouse

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryWarehouse));
		resOFEntryWarehouse.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actWarehouseFirstSelection			=gridFirstRowMasterToClick.getText();
		String expWarehouseFirstSelection			=excelReader.getCellData(xlSheetName, 513, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
		boolean warehouseresOFEntryExclusionchkBox = resOFEntryExclusionchkBox.isSelected();


		// Department

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryDepartment));
		resOFEntryDepartment.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actDepartmentFirstSelection			=gridFirstRowMasterToClick.getText();
		String expDepartmentFirstSelection			=excelReader.getCellData(xlSheetName, 514, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryExclusionchkBox));
		boolean departmentresOFEntryExclusionchkBox = resOFEntryExclusionchkBox.isSelected();

		boolean actselected = accresOFEntryExclusionchkBox==true && itemresOFEntryExclusionchkBox==true && warehouseresOFEntryExclusionchkBox==true
				&& departmentresOFEntryExclusionchkBox==true;



		String actExclusion = Boolean.toString(actselected);

		String expExclusion = excelReader.getCellData(xlSheetName, 515, 7);

		excelReader.setCellData(xlfile, xlSheetName, 515, 8, actExclusion);



		excelReader.setCellData(xlfile, xlSheetName, 510, 8, actAccountSelection);
		excelReader.setCellData(xlfile, xlSheetName, 511, 8, actItemFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 512, 8, actItemSecondSelection);
		excelReader.setCellData(xlfile, xlSheetName, 513, 8, actWarehouseFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 514, 8, actDepartmentFirstSelection);


		System.out.println("LoginName         : "+actLoginName         +"  value expected  "+expLoginName);
		System.out.println("ERPRole           : "+actERPRole           +"  value expected  "+expERPRole);
		System.out.println("PasswordPolicy    : "+actPasswordPolicy    +"  value expected  "+expPasswordPolicy);
		System.out.println("UserName          : "+actUserName          +"  value expected  "+expUserName);
		System.out.println("LoginAbbreviation : "+actLoginAbbreviation +"  value expected  "+expLoginAbbreviation);
		System.out.println("SecutiryQuestion  : "+actSecutiryQuestion  +"  value expected  "+expSecutiryQuestion);
		System.out.println("SecurityAnswer    : "+actSecurityAnswer    +"  value expected  "+expSecurityAnswer);
		System.out.println("Language          : "+actLanguage          +"  value expected  "+expLanguage);
		System.out.println("AltLanguage       : "+actAltLanguage       +"  value expected  "+expAltLanguage);
		System.out.println("Email             : "+actEmail             +"  value expected  "+expEmail);
		System.out.println("UserType          : "+actUserType          +"  value expected  "+expUserType);


		System.out.println("AccountSelection    : "+actAccountSelection  +"  value expected  "+expAccountSelection);
		System.out.println("ItemFirstSelection     : "+actItemFirstSelection+"  Value Expected : "+expItemFirstSelection);
		System.out.println("ItemSecondSelection     : "+actItemSecondSelection+"  Value Expected : "+expItemSecondSelection);

		System.out.println("WarehouseFirstSelection     : "+actWarehouseFirstSelection+"  Value Expected : "+expWarehouseFirstSelection);

		System.out.println("DepartmentFirstSelection     : "+actDepartmentFirstSelection+"  Value Expected : "+expDepartmentFirstSelection);

		System.out.println("Exclusion     : "+actExclusion+"  Value Expected : "+expExclusion);

		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
			 createUserCloseIcon.click();*/

		if (actLoginName.equalsIgnoreCase(expLoginName) && actERPRole.equalsIgnoreCase(expERPRole) && actPasswordPolicy.equalsIgnoreCase(expPasswordPolicy) &&
				actUserName.equalsIgnoreCase(expUserName) && actLoginAbbreviation.equalsIgnoreCase(expLoginAbbreviation) && 
				actSecutiryQuestion.equalsIgnoreCase(expSecutiryQuestion) && actSecurityAnswer.equalsIgnoreCase(expSecurityAnswer) &&
				actLanguage.equalsIgnoreCase(expLanguage) && actAltLanguage.equalsIgnoreCase(expAltLanguage) && actEmail.equalsIgnoreCase(expEmail) &&
				actUserType.equalsIgnoreCase(expUserType)&& actAccountSelection.equalsIgnoreCase(expAccountSelection)
				&& actItemFirstSelection.equalsIgnoreCase(expItemFirstSelection)
				&& actItemSecondSelection.equalsIgnoreCase(expItemSecondSelection) && actWarehouseFirstSelection.equalsIgnoreCase(expWarehouseFirstSelection)
				&& actDepartmentFirstSelection.equalsIgnoreCase(expDepartmentFirstSelection) && actExclusion.equalsIgnoreCase(expExclusion)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 480, 9, resPass);

			return true;
		} 
		else 
		{

			System.out.println("Fail : Displayed Create User Screen");
			excelReader.setCellData(xlfile, xlSheetName, 480, 9, resFail);

			return false;
		}
	}



	public boolean checkRestrictionOnEntryInRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		homeSecurityCreateRoleMenu.click();

		Thread.sleep(3000);*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 336, 6));
		createRoleRoleNameCombo.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlSheetName, 337, 6));

		Thread.sleep(2000);

		int avaliableprofileListCount = avaliableprofileList.size();

		for(int i=0;i<avaliableprofileListCount;i++)
		{
			String data = avaliableprofileList.get(i).getText();

			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 338, 6)))
			{
				avaliableprofileList.get(i).click();
			}
		}


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
		createRoleRestrictionForEntryTab.click();

		// Account

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryAccount));
		resOFEntryAccount.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		gridFirstRowMasterToClick.click();

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 339, 6));
		Thread.sleep(3000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actAccountSelection			=gridMasterAfterClick.getAttribute("value");
		String expAccountSelection			=excelReader.getCellData(xlSheetName, 336, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		gridSecondRowMasterToClick.click();

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 340, 6));
		Thread.sleep(3000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actAccountSelection2			=gridMasterAfterClick.getAttribute("value");
		String expAccountSelection2			=excelReader.getCellData(xlSheetName, 337, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
		gridEntrySecondRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
		gridReportSecondRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
		gridViewSecondRowChkBox.click();

		// Item

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryItem));
		resOFEntryItem.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		gridFirstRowMasterToClick.click();

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 341, 6));
		Thread.sleep(2000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actItemFirstSelection			=gridMasterAfterClick.getAttribute("value");
		String expItemFirstSelection			=excelReader.getCellData(xlSheetName, 338, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		gridSecondRowMasterToClick.click();

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 342, 6));
		Thread.sleep(3000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actItemSecondSelection		=gridMasterAfterClick.getAttribute("value");
		String expItemSecondSelection			=excelReader.getCellData(xlSheetName, 339, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
		gridEntrySecondRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
		gridReportSecondRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
		gridViewSecondRowChkBox.click();


		// Warehouse

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryWarehouse));
		resOFEntryWarehouse.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		gridFirstRowMasterToClick.click();

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 343, 6));
		Thread.sleep(2000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actWarehouseFirstSelection			=gridMasterAfterClick.getAttribute("value");
		String expWarehouseFirstSelection			=excelReader.getCellData(xlSheetName, 340, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		gridSecondRowMasterToClick.click();

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 344, 6));
		Thread.sleep(3000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actWarehouseSecondSelection		=gridMasterAfterClick.getAttribute("value");
		String expWarehouseSecondSelection			=excelReader.getCellData(xlSheetName, 341, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
		gridEntrySecondRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
		gridReportSecondRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
		gridViewSecondRowChkBox.click();


		// Department

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryDepartment));
		resOFEntryDepartment.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		gridFirstRowMasterToClick.click();

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 345, 6));
		Thread.sleep(2000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actDepartmentFirstSelection			=gridMasterAfterClick.getAttribute("value");
		String expDepartmentFirstSelection			=excelReader.getCellData(xlSheetName, 342, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryFirstRowChkBox));
		gridEntryFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportFirstRowChkBox));
		gridReportFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewFirstRowChkBox));
		gridViewFirstRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		gridSecondRowMasterToClick.click();

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 346, 6));
		Thread.sleep(3000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actDepartmentSecondSelection		=gridMasterAfterClick.getAttribute("value");
		String expDepartmentSecondSelection			=excelReader.getCellData(xlSheetName, 343, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
		gridEntrySecondRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
		gridReportSecondRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
		gridViewSecondRowChkBox.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		System.out.println("***********************************checkClickOnSaveRestrictionEntry**************************************");

		String expMessage=excelReader.getCellData(xlSheetName, 344, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 344, 8, actMessage);

		excelReader.setCellData(xlfile, xlSheetName, 336, 8, actAccountSelection);
		excelReader.setCellData(xlfile, xlSheetName, 337, 8, actAccountSelection2);
		excelReader.setCellData(xlfile, xlSheetName, 338, 8, actItemFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 339, 8, actItemSecondSelection);
		excelReader.setCellData(xlfile, xlSheetName, 340, 8, actWarehouseFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 341, 8, actWarehouseSecondSelection);
		excelReader.setCellData(xlfile, xlSheetName, 342, 8, actDepartmentFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 343, 8, actDepartmentSecondSelection);



		System.out.println("*******************************checkRestrictionOnEntryInRole***********************************");

		System.out.println("actAccountSelection    : "+actAccountSelection  +"  value expected  "+expAccountSelection);
		System.out.println("actAccountSelection2   : "+actAccountSelection2 +"  value expected  "+expAccountSelection2);
		System.out.println("ItemFirstSelection     : "+actItemFirstSelection+"  Value Expected : "+expItemFirstSelection);
		System.out.println("ItemSecondSelection     : "+actItemSecondSelection+"  Value Expected : "+expItemSecondSelection);

		System.out.println("WarehouseFirstSelection     : "+actWarehouseFirstSelection+"  Value Expected : "+expWarehouseFirstSelection);
		System.out.println("WarehouseSecondSelection     : "+actWarehouseSecondSelection+"  Value Expected : "+expWarehouseSecondSelection);

		System.out.println("DepartmentFirstSelection     : "+actDepartmentFirstSelection+"  Value Expected : "+expDepartmentFirstSelection);
		System.out.println("DepartmentSecondSelection     : "+actDepartmentSecondSelection+"  Value Expected : "+expDepartmentSecondSelection);

		System.out.println("Message : "+actMessage+" Value Expected : "+expMessage);

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
	    createUserCloseIcon.click();
		 */
		if(actAccountSelection.equalsIgnoreCase(expAccountSelection) && actAccountSelection2.equalsIgnoreCase(expAccountSelection2)
				&& actItemFirstSelection.equalsIgnoreCase(expItemFirstSelection) && actItemSecondSelection.equalsIgnoreCase(expItemSecondSelection)
				&& actWarehouseFirstSelection.equalsIgnoreCase(expWarehouseFirstSelection) && actWarehouseSecondSelection.equalsIgnoreCase(expWarehouseSecondSelection)
				&& actDepartmentFirstSelection.equalsIgnoreCase(expDepartmentFirstSelection) && actDepartmentSecondSelection.equalsIgnoreCase(expDepartmentSecondSelection)
				&& actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 166, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 166, 9, resFail);
			return false;
		}
	}


	public boolean checkSavedRestrictionOnEntryInRoleAndUpdating() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		homeSecurityCreateRoleMenu.click();

		Thread.sleep(3000);
		 */
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 440, 6));
		Thread.sleep(1000);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);

		String actcreateRolePasswordPolicyDropdown = s.getFirstSelectedOption().getText();

		String expcreateRolePasswordPolicyDropdown = excelReader.getCellData(xlSheetName, 440, 7);




		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
		createRoleRestrictionForEntryTab.click();

		// Account

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryAccount));
		resOFEntryAccount.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actAccountSelection			=gridFirstRowMasterToClick.getText();
		String expAccountSelection			=excelReader.getCellData(xlSheetName, 441, 7);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		String actAccountSelection2			=gridSecondRowMasterToClick.getText(); 
		String expAccountSelection2			=excelReader.getCellData(xlSheetName, 442, 7);

		// Updtae Account
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryAccount));
		resOFEntryAccount.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowRoleIndex));
		gridSecondRowRoleIndex.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDeleteRowRoleIndex));
		gridDeleteRowRoleIndex.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridThirdRowMasterToClick));
		gridThirdRowMasterToClick.click();
		gridMasterAfterClick.sendKeys(Keys.END);
		gridMasterAfterClick.sendKeys(Keys.SHIFT,Keys.HOME);

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 441, 6));
		Thread.sleep(2000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actAccountSelectionUpdate			=gridMasterAfterClick.getAttribute("value");
		String expAccountSelectionUpdate			=excelReader.getCellData(xlSheetName, 449, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
		gridEntrySecondRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
		gridReportSecondRowChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
		gridViewSecondRowChkBox.click();



		// Item

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryItem));
		resOFEntryItem.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actItemFirstSelection			=gridFirstRowMasterToClick.getText();
		String expItemFirstSelection			=excelReader.getCellData(xlSheetName, 443, 7);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridThirdRowMasterToClick));
		String actItemSecondSelection		    =gridThirdRowMasterToClick.getText();
		String expItemSecondSelection			=excelReader.getCellData(xlSheetName, 444, 7);


		// Update Item
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryItem));
				resOFEntryItem.click();*/

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridThirdRowRoleIndex));
				gridThirdRowRoleIndex.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDeleteRowRoleIndex));
				gridDeleteRowRoleIndex.click();*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridThirdRowMasterToClick));
		gridThirdRowMasterToClick.click();
		gridMasterAfterClick.sendKeys(Keys.END);
		gridMasterAfterClick.sendKeys(Keys.SHIFT,Keys.HOME);

		gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 442, 6));
		Thread.sleep(2000);
		gridMasterAfterClick.sendKeys(Keys.TAB);

		String actItemSelectionUpdate			=gridMasterAfterClick.getAttribute("value");
		String expItemSelectionUpdate			=excelReader.getCellData(xlSheetName, 450, 7);

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntryThirdRowChkBox));
				gridEntryThirdRowChkBox.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportThirdRowChkBox));
				gridReportThirdRowChkBox.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewThirdRowChkBox));
				gridViewThirdRowChkBox.click();*/


		/*	// Warehouse

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryWarehouse));
		resOFEntryWarehouse.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actWarehouseFirstSelection			=gridFirstRowMasterToClick.getText();
		String expWarehouseFirstSelection			=excelReader.getCellData(xlSheetName, 445, 7);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridThirdRowMasterToClick));
		String actWarehouseSecondSelection		    =gridThirdRowMasterToClick.getText();
		String expWarehouseSecondSelection			=excelReader.getCellData(xlSheetName, 446, 7);


		// Department

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryDepartment));
		resOFEntryDepartment.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actDepartmentFirstSelection			=gridFirstRowMasterToClick.getText();
		String expDepartmentFirstSelection			=excelReader.getCellData(xlSheetName, 447, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridThirdRowMasterToClick));
		String actDepartmentSecondSelection		    =gridThirdRowMasterToClick.getText();
		String expDepartmentSecondSelection			=excelReader.getCellData(xlSheetName, 343, 7);

		 */

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		System.out.println("***********************************checkClickOnSaveRestrictionEntry**************************************");

		String expMessage=excelReader.getCellData(xlSheetName, 451, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 451, 8, actMessage);

		excelReader.setCellData(xlfile, xlSheetName, 440, 8, actcreateRolePasswordPolicyDropdown);
		excelReader.setCellData(xlfile, xlSheetName, 441, 8, actAccountSelection);
		excelReader.setCellData(xlfile, xlSheetName, 442, 8, actAccountSelection2);
		excelReader.setCellData(xlfile, xlSheetName, 443, 8, actItemFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 444, 8, actItemSecondSelection);
		/*excelReader.setCellData(xlfile, xlSheetName, 445, 8, actWarehouseFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 446, 8, actWarehouseSecondSelection);
		excelReader.setCellData(xlfile, xlSheetName, 447, 8, actDepartmentFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 448, 8, actDepartmentSecondSelection);*/

		excelReader.setCellData(xlfile, xlSheetName, 449, 8, actAccountSelectionUpdate);
		excelReader.setCellData(xlfile, xlSheetName, 450, 8, actItemSelectionUpdate);


		System.out.println("*******************************checkRestrictionOnEntryInRole***********************************");

		System.out.println("actAccountSelection    : "+actAccountSelection  +"  value expected  "+expAccountSelection);
		System.out.println("actAccountSelection2   : "+actAccountSelection2 +"  value expected  "+expAccountSelection2);
		System.out.println("ItemFirstSelection     : "+actItemFirstSelection+"  Value Expected : "+expItemFirstSelection);
		System.out.println("ItemSecondSelection     : "+actItemSecondSelection+"  Value Expected : "+expItemSecondSelection);

		/*	System.out.println("WarehouseFirstSelection     : "+actWarehouseFirstSelection+"  Value Expected : "+expWarehouseFirstSelection);
		System.out.println("WarehouseSecondSelection     : "+actWarehouseSecondSelection+"  Value Expected : "+expWarehouseSecondSelection);

		System.out.println("DepartmentFirstSelection     : "+actDepartmentFirstSelection+"  Value Expected : "+expDepartmentFirstSelection);
		System.out.println("DepartmentSecondSelection     : "+actDepartmentSecondSelection+"  Value Expected : "+expDepartmentSecondSelection);*/

		System.out.println("AccountSelectionUpdate     : "+actAccountSelectionUpdate+"  Value Expected : "+expAccountSelectionUpdate);
		System.out.println("ItemSelectionUpdate    : "+actItemSelectionUpdate+" Value Expected : "+expItemSelectionUpdate);

		System.out.println("Message : "+actMessage+" Value Expected : "+expMessage);

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
		createRoleCloseIcon.click();*/

		if(actAccountSelection.equalsIgnoreCase(expAccountSelection) && actAccountSelection2.equalsIgnoreCase(expAccountSelection2)
				&& actItemFirstSelection.equalsIgnoreCase(expItemFirstSelection) && actItemSecondSelection.equalsIgnoreCase(expItemSecondSelection)
				/*&& actWarehouseFirstSelection.equalsIgnoreCase(expWarehouseFirstSelection) && actWarehouseSecondSelection.equalsIgnoreCase(expWarehouseSecondSelection)
				&& actDepartmentFirstSelection.equalsIgnoreCase(expDepartmentFirstSelection) && actDepartmentSecondSelection.equalsIgnoreCase(expDepartmentSecondSelection)*/
				&& actAccountSelectionUpdate.equalsIgnoreCase(expAccountSelectionUpdate)&& actItemSelectionUpdate.equalsIgnoreCase(expItemSelectionUpdate)
				&& actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 440, 9, resPass);
			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 440, 9, resFail);
			return false;
		}
	}



	public boolean checkUpdatedRestrictionOnEntryInRoleAndUpdating() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		homeSecurityMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		homeSecurityCreateRoleMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 452, 6));
		Thread.sleep(1000);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);

		String actcreateRolePasswordPolicyDropdown = s.getFirstSelectedOption().getText();

		String expcreateRolePasswordPolicyDropdown = excelReader.getCellData(xlSheetName, 452, 7);


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRestrictionForEntryTab));
		createRoleRestrictionForEntryTab.click();

		// Account

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryAccount));
		resOFEntryAccount.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actAccountSelection			=gridFirstRowMasterToClick.getText();
		String expAccountSelection			=excelReader.getCellData(xlSheetName, 453, 7);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		String actAccountSelection2			=gridSecondRowMasterToClick.getText(); 
		String expAccountSelection2			=excelReader.getCellData(xlSheetName, 454, 7);


		// Item

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryItem));
		resOFEntryItem.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actItemFirstSelection			=gridFirstRowMasterToClick.getText();
		String expItemFirstSelection			=excelReader.getCellData(xlSheetName, 455, 7);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		String actItemSecondSelection		    =gridSecondRowMasterToClick.getText();
		String expItemSecondSelection			=excelReader.getCellData(xlSheetName, 456, 7);



		// Warehouse

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryWarehouse));
		resOFEntryWarehouse.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actWarehouseFirstSelection			=gridFirstRowMasterToClick.getText();
		String expWarehouseFirstSelection			=excelReader.getCellData(xlSheetName, 457, 7);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		String actWarehouseSecondSelection		    =gridSecondRowMasterToClick.getText();
		String expWarehouseSecondSelection			=excelReader.getCellData(xlSheetName, 458, 7);


		// Department

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryDepartment));
		resOFEntryDepartment.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridFirstRowMasterToClick));
		String actDepartmentFirstSelection			=gridFirstRowMasterToClick.getText();
		String expDepartmentFirstSelection			=excelReader.getCellData(xlSheetName, 459, 7);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowMasterToClick));
		String actDepartmentSecondSelection		    =gridSecondRowMasterToClick.getText();
		String expDepartmentSecondSelection			=excelReader.getCellData(xlSheetName, 460, 7);


		excelReader.setCellData(xlfile, xlSheetName, 452, 8, actcreateRolePasswordPolicyDropdown);
		excelReader.setCellData(xlfile, xlSheetName, 453, 8, actAccountSelection);
		excelReader.setCellData(xlfile, xlSheetName, 454, 8, actAccountSelection2);
		excelReader.setCellData(xlfile, xlSheetName, 455, 8, actItemFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 456, 8, actItemSecondSelection);
		excelReader.setCellData(xlfile, xlSheetName, 457, 8, actWarehouseFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 458, 8, actWarehouseSecondSelection);
		excelReader.setCellData(xlfile, xlSheetName, 459, 8, actDepartmentFirstSelection);
		excelReader.setCellData(xlfile, xlSheetName, 460, 8, actDepartmentSecondSelection);



		System.out.println("*******************************checkRestrictionOnEntryInRole***********************************");

		System.out.println("actAccountSelection    : "+actAccountSelection  +"  value expected  "+expAccountSelection);
		System.out.println("actAccountSelection2   : "+actAccountSelection2 +"  value expected  "+expAccountSelection2);
		System.out.println("ItemFirstSelection     : "+actItemFirstSelection+"  Value Expected : "+expItemFirstSelection);
		System.out.println("ItemSecondSelection     : "+actItemSecondSelection+"  Value Expected : "+expItemSecondSelection);

		System.out.println("WarehouseFirstSelection     : "+actWarehouseFirstSelection+"  Value Expected : "+expWarehouseFirstSelection);
		System.out.println("WarehouseSecondSelection     : "+actWarehouseSecondSelection+"  Value Expected : "+expWarehouseSecondSelection);

		System.out.println("DepartmentFirstSelection     : "+actDepartmentFirstSelection+"  Value Expected : "+expDepartmentFirstSelection);
		System.out.println("DepartmentSecondSelection     : "+actDepartmentSecondSelection+"  Value Expected : "+expDepartmentSecondSelection);


		if(actAccountSelection.equalsIgnoreCase(expAccountSelection) && actAccountSelection2.equalsIgnoreCase(expAccountSelection2)
				&& actItemFirstSelection.equalsIgnoreCase(expItemFirstSelection) && actItemSecondSelection.equalsIgnoreCase(expItemSecondSelection)
				&& actWarehouseFirstSelection.equalsIgnoreCase(expWarehouseFirstSelection) && actWarehouseSecondSelection.equalsIgnoreCase(expWarehouseSecondSelection)
				&& actDepartmentFirstSelection.equalsIgnoreCase(expDepartmentFirstSelection) && actDepartmentSecondSelection.equalsIgnoreCase(expDepartmentSecondSelection))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 452, 9, resPass);


			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 452, 9, resFail);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(resOFEntryItem));
			resOFEntryItem.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridSecondRowRoleIndex));
			gridSecondRowRoleIndex.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDeleteRowRoleIndex));
			gridDeleteRowRoleIndex.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridThirdRowMasterToClick));
			gridThirdRowMasterToClick.click();
			gridMasterAfterClick.sendKeys(Keys.END);
			gridMasterAfterClick.sendKeys(Keys.SHIFT,Keys.HOME);

			gridMasterAfterClick.sendKeys(excelReader.getCellData(xlSheetName, 442, 6));
			Thread.sleep(2000);
			gridMasterAfterClick.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEntrySecondRowChkBox));
			gridEntrySecondRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridReportSecondRowChkBox));
			gridReportSecondRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridViewSecondRowChkBox));
			gridViewSecondRowChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
			createRoleSaveicon.click();

			String expMessage=excelReader.getCellData(xlSheetName, 451, 7);

			String actMessage=checkValidationMessage(expMessage);

			excelReader.setCellData(xlfile, xlSheetName, 451, 8, actMessage);


			return false;
		}
	}



	public boolean checkAssigningTransactionRightsToRoleRestrictions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		  homeMenu.click();

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityMenu));
		  homeSecurityMenu.click();

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeSecurityCreateRoleMenu));
		  homeSecurityCreateRoleMenu.click();

		  Thread.sleep(3000);
		 */

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.sendKeys(excelReader.getCellData(xlSheetName, 452, 6));
		Thread.sleep(1000);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionRightsTab));
		transactionRightsTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allowBillWiseOnAccountChkBox));
		allowBillWiseOnAccountChkBox.click();

		Select budgetLimitWarning= new Select(budgetLimitWarningDropdown);
		budgetLimitWarning.selectByVisibleText(excelReader.getCellData(xlSheetName, 522, 6));

		Select creditLimitWarning= new Select(creditLimitWarningDropdown);
		creditLimitWarning.selectByVisibleText(excelReader.getCellData(xlSheetName, 523, 6));

		Select negativeCashCheck= new Select(negativeCashCheckDropdown);
		negativeCashCheck.selectByVisibleText(excelReader.getCellData(xlSheetName, 524, 6));

		Select negativeStockCheck= new Select(negativeStockCheckDropdown);
		negativeStockCheck.selectByVisibleText(excelReader.getCellData(xlSheetName, 525, 6));

		cantaddfutureTransChkbox.click();

		cannotAddTransThatAreMoreThanTxt.click();
		cannotAddTransThatAreMoreThanTxt.clear();
		cannotAddTransThatAreMoreThanTxt.sendKeys(excelReader.getCellData(xlSheetName, 526, 6));

		cannotEditPreviousMonthEntriesAfterTxt.click();
		cannotEditPreviousMonthEntriesAfterTxt.clear();
		cannotEditPreviousMonthEntriesAfterTxt.sendKeys(excelReader.getCellData(xlSheetName, 527, 6));

		CantEditTransthatAreremorethanTxt.click();
		CantEditTransthatAreremorethanTxt.clear();
		CantEditTransthatAreremorethanTxt.sendKeys(excelReader.getCellData(xlSheetName, 528, 6));

		CantAddPrevMnthEntriesaftTxt.click();
		CantAddPrevMnthEntriesaftTxt.clear();
		CantAddPrevMnthEntriesaftTxt.sendKeys(excelReader.getCellData(xlSheetName, 529, 6));

		CantPrintAfterValueTxt.click();
		CantPrintAfterValueTxt.clear();
		CantPrintAfterValueTxt.sendKeys(excelReader.getCellData(xlSheetName, 530, 6));

		Select CantPrintAfterValue= new Select(cantPrintAfterValueDropdown);
		CantPrintAfterValue.selectByVisibleText(excelReader.getCellData(xlSheetName, 531, 6));

		CantRePrintAfterValueTxt.click();
		CantRePrintAfterValueTxt.clear();
		CantRePrintAfterValueTxt.sendKeys(excelReader.getCellData(xlSheetName, 532, 6));

		Select CantRePrintAfterValue= new Select(CantRePrintAfterDropdown);
		CantRePrintAfterValue.selectByVisibleText(excelReader.getCellData(xlSheetName, 533, 6));

		doNotAllowMasterCustomization.click();

		createRoleSaveicon.click();

		String expMessage=excelReader.getCellData(xlSheetName, 537, 7);

		String actMessage=checkValidationMessage(expMessage);

		excelReader.setCellData(xlfile, xlSheetName, 537, 8, actMessage);


		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("  Pass:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 521, 9, resPass);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
			createRoleCloseIcon.click();

			return true;
		} 
		else 
		{
			System.out.println("Fail:  Save button with selecting Assigned Profile");
			excelReader.setCellData(xlfile, xlSheetName, 521, 9, resFail);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
			createRoleCloseIcon.click();

			return false;
		}
	}




	public boolean checkLogoutUserSecurityPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();

			Thread.sleep(2000);

			boolean actUserLoginPage              = username.isDisplayed() && username.isEnabled()
					&& password.isDisplayed() && password.isEnabled();

			boolean expUserLoginPage              = true;

			if(actUserLoginPage==expUserLoginPage)  
			{
				System.out.println("***Test Pass: Login Successfull***");
				excelReader.setCellData(xlfile, xlSheetName, 285, 9, resPass);
				return true;
			}
			else
			{

				System.out.println("***Test Fail: Login Not Successfull***");
				excelReader.setCellData(xlfile, xlSheetName, 285, 9, resFail);
				return false;
			}
		}
		catch (Exception e)
		{
			String exception = e.getMessage();
			excelReader.setCellData(xlfile, xlSheetName, 285, 10, exception);	
			return false;
		}
	}


	public static boolean checkSaveingRole() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securitymenu));
		securitymenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMenu));
		createRoleMenu.click();

		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.click();

		createRoleRoleNameCombo.sendKeys("MasterRole");
		createRoleRoleNameCombo.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRolePasswordPolicyDropdown));
		Select s=new Select(createRolePasswordPolicyDropdown);
		s.selectByVisibleText("Simple Policy");

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(avaliableAllProfile));
		avaliableAllProfile.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMOveFiledsFromLeftSideToRightSide));
		createRoleMOveFiledsFromLeftSideToRightSide.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		String expMessage="Role saved Successfully";

		String actMessage=checkValidationMessage(expMessage);

		if (actMessage.equalsIgnoreCase(expMessage)) {

			return true;

		} else {
			return false;

		}


	}

	public static boolean checkEditAndUpdateTheSavedRole() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		    homeMenu.click();

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securitymenu));
			  securitymenu.click();

			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleMenu));
			  createRoleMenu.click();


		 */

		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleRoleNameCombo));
		createRoleRoleNameCombo.click();
		createRoleRoleNameCombo.sendKeys("MasterRole");
		Thread.sleep(2000);
		createRoleRoleNameCombo.sendKeys(Keys.TAB);



		//Additions Tab
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(additionTab));
		additionTab.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFininicalExpandBtn));
		addFininicalExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransationExpandBtn));
		addFinTransationExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransationpurchaseExpandBtn));
		addFinTransationpurchaseExpandBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFinTransPurPurchasesVouchers));
		addFinTransPurPurchasesVouchers.click();


		int actPurchasesMenusCount=additionTabFinancialsTransactionsPurchasesMenusList.size();
		int expPurchasesMenusCount=2;

		System.out.println("additionTabFinancialsTransactionsPurchasesMenusList : "+actPurchasesMenusCount);
		System.out.println("additionTabFinancialsTransactionsPurchasesMenusList : "+expPurchasesMenusCount);



		boolean actCRAddAlwaysSuspendOnSavingChkBox				=CRAddAlwaysSuspendOnSavingChkBox.isDisplayed();
		boolean actCRAddHideMenuChkBox							=CRAddHideMenuChkBox.isDisplayed();



		boolean expCRAddAlwaysSuspendOnSavingChkBox				=true;
		boolean expCRAddHideMenuChkBox							=true;

		System.out.println("CRAddAlwaysSuspendOnSavingChkBox           : "+actCRAddAlwaysSuspendOnSavingChkBox          +"  value expected  "+expCRAddAlwaysSuspendOnSavingChkBox);
		System.out.println("CRAddHideMenuChkBox                        : "+actCRAddHideMenuChkBox                       +"  value expected  "+expCRAddHideMenuChkBox);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleAddTabSelectAllChkBox));
		createRoleAddTabSelectAllChkBox.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleSaveicon));
		createRoleSaveicon.click();

		String expMessage = "Role updated Successfully";
		String actMessage = checkValidationMessage(expMessage);

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRoleCloseIcon));
	  createRoleCloseIcon.click();*/

		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;

		}

	}

	public SecuritySmokePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}	

