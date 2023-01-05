package com.focus.Pages;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class HPWrapperLayoutPage extends BaseEngine 
{
	
	private static String xlfile;
	private static String resPass="Pass";
	private static String resFail="Fail";
	private static ExcelReader excelReader;
	private static WebElement loginTitle;
	private static String url;
	private static int cSize;
	private static String userN;	
	private static String getReleaseDateFromAbout;
	private static String modifyGetReleaseDateFromAbout;

	//Login Screen
	
	@FindBy(xpath="//*[@id='txtUsername']")
	private static WebElement username;

	@FindBy(id="txtPassword")
	private static WebElement password;
	
    @FindBy(id="ddlCompany")
    private static WebElement companyDropDownList;

	@FindBy(id="btnSignin")
	private static WebElement signIn;
	
    @FindBy (xpath="//*[@id='ReminderNavBar']/div/nav/ol/li[3]")
    private static WebElement CreateCompanyTitle;
	
	//@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/header[1]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]")
	

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;
    
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;
    
	 @FindBy (xpath="//*[@id='CompanyName']")
	 private static WebElement getCompanyNameTextInEditScreen;
	 
	 @FindBy (xpath="//*[@id='id_search_menu']/input")
	 private static WebElement getSearch;
	 
	 /*@FindBy (xpath="//*[@id='txtSearch']")
	 private static WebElement getSearch;*/
	 
	 @FindBy (xpath="//*[@id='107']")
	 private static WebElement getTextFromSearch;
	
	 @FindBy (xpath="//li[@class='dropdown searchBox hidden-xs open']//li[1]")
	 private static WebElement getSearchOne;
	 
	 @FindBy(xpath="//*[@id='btn_common_header']/ul/li[3]/a/i")
	 private static WebElement okButtonInEditCompany;
	 
	 @FindBy (xpath="//*[@id='CreatedDate']")
	 private static WebElement companyDateInEditCompany;
	
	 @FindBy(xpath="//div[contains(text(),'Cancel')]")
	 private static WebElement cancelButtonInEditCompanyScreen;
	
	 private static LoginPage lp;
		
		@FindBy(xpath="//i[@title='Create Company']")
	    private static WebElement companyCreateBtn;
		
		@FindBy(xpath="//div[@id='errorCompanyName']")
		private static WebElement getCompanyNameError;
		
		@FindBy(xpath="//*[@id='CalendarType']")
		private static WebElement calendarType;
		
		@FindBy(xpath="//*[@id='CreatedDate_input_image']/span")
		private static WebElement datePicker;	
		
		@FindBy(xpath="//input[@id='CreatedDate']")
		private static WebElement accountingDate;
		
		@FindBy(xpath="//*[@id='CreatedDate_day_today']/td/span[2]")
		private static WebElement getDate;
		
		@FindBy(id="securityNormal")
		private static WebElement securityNormal;
		
		@FindBy(id="securityLow")
		private static WebElement securityLow;
		
	    @FindBy(id="securityHigh")
	    private static WebElement securityHigh;
		
		@FindBy(xpath="//input[@id='SUserPassword']")
	    private static WebElement passwordSU;
		
		@FindBy(xpath=" //div[@id='errorUserPassword']")
		private static WebElement getPasswordErrorMsg;
		
		@FindBy(id="chkRemeberLoginCredentials")
		private static WebElement rememberLoginCredentials;
		
		@FindBy(id="chkUnauthorizedUsers")
		private static WebElement unAuthorizeUsers;
		
		@FindBy(id="Currency1")
		private static WebElement globalCurrency;
		
		@FindBy(id="Country")
		private static WebElement country;
		
		@FindBy(id="DefLanguages")
		private static WebElement defaultLanguage;
	
		@FindBy(xpath="//*[@id='errmsgDiv']")
		private static WebElement mandatoryMsgs;
		
		@FindBy(xpath="//label[@class='chk-margin Flabel']//input[@value='0']")
		private static WebElement languagesEnglish;
		
		@FindBy(xpath="//label[@class='chk-margin Flabel']//input[@value='1']")
		private static WebElement languagesArabic;
			
		@FindBy(xpath="//label[@class='chk-margin Flabel']//input[@value='2']")
		private static WebElement languagesPersian;
		
		@FindBy(xpath="//label[@class='chk-margin Flabel']//input[@value='3']")
		private static WebElement languagesChinese;
		
		@FindBy(xpath="//label[@class='chk-margin Flabel']//input[@value='4']")
		private static WebElement languagesSpanish;
		
		@FindBy(xpath="//label[@class='chk-margin Flabel']//input[@value='5']")
		private static WebElement languagesPortuguese;
		
		@FindBy(xpath="//label[@class='chk-margin Flabel']//input[@value='6']")
		private static WebElement languagesIndonesian;
		
		@FindBy(xpath="//span[contains(@class,'icon-ok icon-font6')]")
		private static WebElement okButtonInCreateCompany;
		
		@FindBy(xpath="//span[contains(@class,'icon-close icon-font6')]")
		private static WebElement cancelButtonInCreateCompany;
		
		@FindBy(xpath="//i[@class='indicator pull-right icon-collepse icon-font6']")
		private static WebElement companyMinimizeAndMaximize;
		
		
		@FindBy(xpath="//*[@id='2']/div/span")
		private static WebElement companyMenu;
		
		@FindBy(xpath="//*[@id='2']/span")
		private static WebElement companyMenuExpand;
	 
	 
	 
     
       
       
       
		 
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
			 
			
	
	
	public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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

	 
	
	
@FindBy(xpath="//button[contains(text(),'Ok')]")
private static WebElement loginRefreshOkBtn;


public static void checkRefershPopOnlogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

try 
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginRefreshOkBtn));
	loginRefreshOkBtn.click();
	
	
} 
catch (Exception e)
{
	System.err.println("NO ALERT POP UP DISPLAYED");
}


Thread.sleep(4000);
}
	
	
	public static boolean checkAvailibityOfOptionsInWrapperLayout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 String unamelt=excelReader.getCellData("Sheet1", 47, 6);
		 String passwordlt=excelReader.getCellData("Sheet1", 48, 6);

	     getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
	     username.click();
	    	     
         username.sendKeys(unamelt);
         
         getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
		 
         getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(password));
         password.click();
		 password.sendKeys(passwordlt);
		 
		 getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
		 
/*Thread.sleep(2000);
		 
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
   
   }*/
		  
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rememberMeChk));
	     rememberMeChk.click();
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rememberPwdChk));
		 rememberPwdChk.click();

		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(signIn));
		 signIn.click();
		 
		
         
         reLogin(unamelt, passwordlt, "Automation Company");
		 
		 //checkRefershPopOnlogin();
		 //checkPopUpWindow();
		 
		 Thread.sleep(8000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(aboutIdQuickAccessMenu));
	
		 boolean actaboutIdQuickAccessMenu=aboutIdQuickAccessMenu.isDisplayed();
		 boolean actsearchOption=searchOption.isDisplayed();
		 //boolean actproductTourOption=productTourOption.isDisplayed();
		 boolean actalertsOption=alertsOption.isDisplayed();
		 boolean actrecentMenus=recentMenus.isDisplayed();
		 boolean actimgOfTheUser=userNameDisplay.isDisplayed();
		 boolean acttextNameOfTheUser=userNameTxt.isDisplayed();
		/* boolean actdropdownMenuUserChangePasswordLanguageAndLogout=dropdownMenuUserChangePasswordLanguageAndLogout.isDisplayed();*/
		 boolean actcompanyLogo=companyLogoImg.isDisplayed();
		 
		 boolean expaboutIdQuickAccessMenu=true;
		 boolean expsearchOption=true;
		 boolean expproductTourOption=true;
		 boolean expalertsOption=true;
		 boolean exprecentMenus=true;
		 boolean expimgOfTheUser=true;
		 boolean exptextNameOfTheUser=true;
		 /*boolean expdropdownMenuUserChangePasswordLanguageAndLogout=true;*/
		 boolean expcompanyLogo=true;
		 
		 System.out.println("aboutIdQuickAccessMenu  : "+actaboutIdQuickAccessMenu  +"  value expected  "+expaboutIdQuickAccessMenu);
		 System.out.println("searchOption            : "+actsearchOption            +"  value expected  "+expsearchOption);
		 //System.out.println("productTourOption       : "+actproductTourOption       +"  value expected  "+expproductTourOption);
		 System.out.println("alertsOption            : "+actalertsOption            +"  value expected  "+expalertsOption);
		 System.out.println("recentMenus             : "+actrecentMenus             +"  value expected  "+exprecentMenus);
		 System.out.println("imgOfTheUser            : "+actimgOfTheUser            +"  value expected  "+expimgOfTheUser);
		 System.out.println("textNameOfTheUser       : "+acttextNameOfTheUser       +"  value expected  "+exptextNameOfTheUser);
		// System.out.println("dropdownMenuUserChangePasswordLanguageAndLogout: "+actdropdownMenuUserChangePasswordLanguageAndLogout+"  value expected  "+expdropdownMenuUserChangePasswordLanguageAndLogout);
		 System.out.println("companyLogo             : "+actcompanyLogo             +"  value expected  "+expcompanyLogo);
		 
		 if(actaboutIdQuickAccessMenu==expaboutIdQuickAccessMenu && actsearchOption==expsearchOption /*&& actproductTourOption==expproductTourOption*/ && 
			 actalertsOption==expalertsOption && actrecentMenus==exprecentMenus && actimgOfTheUser==expimgOfTheUser && acttextNameOfTheUser==exptextNameOfTheUser && 
		 	 /*actdropdownMenuUserChangePasswordLanguageAndLogout==expdropdownMenuUserChangePasswordLanguageAndLogout && */actcompanyLogo==expcompanyLogo)
		 {
				
			 excelReader.setCellData(xlfile, "Sheet1", 47, 9, resPass);
			 return true;
		 }							
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 47, 9, resFail);
			return false;
			
		}
	 }

	public static boolean checkAboutIdQuickAccessMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(aboutIdQuickAccessMenu));
		
		System.out.println("checkAboutIdQuickAccessMenu");
		
		aboutIdQuickAccessMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(aboutOption));
		
		boolean actfavouriteOption          =favouriteOption.isDisplayed();
		boolean actrecentItemsOpion         =recentItemsOpion.isDisplayed();
		/*boolean actrunOption                =runOption.isDisplayed(); */
		boolean actquickAccessOption        =quickAccessOption.isDisplayed();
		boolean actaboutOption              =aboutOption.isDisplayed();
		
		boolean expfavouriteOption          =true;
		boolean exprecentItemsOpion         =true;
		/*boolean exprunOption                =true; */
		boolean expquickAccessOption        =true;
		boolean expaboutOption              =true;
		
		 System.out.println("favouriteOption   : "+actfavouriteOption    +"  value expected  "+expfavouriteOption);
		 System.out.println("recentItemsOpion  : "+actrecentItemsOpion   +"  value expected  "+exprecentItemsOpion);
		/* System.out.println("runOption         : "+actrunOption          +"  value expected  "+exprunOption);*/
		 System.out.println("quickAccessOption : "+actquickAccessOption  +"  value expected  "+expquickAccessOption);
		 System.out.println("aboutOption       : "+actaboutOption        +"  value expected  "+expaboutOption);
		
		if(actfavouriteOption==expfavouriteOption && actrecentItemsOpion==exprecentItemsOpion/* && actrunOption==exprunOption */&& 
			actquickAccessOption==expquickAccessOption && actaboutOption==expaboutOption)
		{
			excelReader.setCellData(xlfile, "Sheet1", 49, 9, resPass);
		    return true;
		}				
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 49, 9, resFail);
			return false;
	
		}		
		
	}
	
	
	
	public static boolean clickOnAbout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(aboutOption));
		
		System.out.println("clickonabout");
		
		aboutOption.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(aboutLicensed));
		
		/*boolean actaboutImage         =aboutImage.isDisplayed();*/
		boolean actaboutVersioin      =aboutVersioin.isDisplayed();
		boolean actaboutRelease       =aboutRelease.isDisplayed(); 
		boolean actaboutLicensed      =aboutLicensed.isDisplayed();
		
		/*boolean expaboutImage         =true;*/
		boolean expaboutVersioin      =true;
		boolean expaboutRelease       =true; 
		boolean expaboutLicensed      =true;
		
		 /*System.out.println("aboutImage    : "+actaboutImage    +"  value expected  "+expaboutImage);*/
		 System.out.println("aboutVersioin : "+actaboutVersioin +"  value expected  "+expaboutVersioin);
		 System.out.println("aboutRelease  : "+actaboutRelease  +"  value expected  "+expaboutRelease);
		 System.out.println("aboutLicensed : "+actaboutLicensed +"  value expected  "+expaboutLicensed);
		 
		if(/*(actaboutImage==expaboutImage && */actaboutVersioin==expaboutVersioin && actaboutRelease==expaboutRelease && actaboutLicensed==expaboutLicensed)
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(aboutRelease));
			getReleaseDateFromAbout=aboutRelease.getText();
			modifyGetReleaseDateFromAbout=" "+getReleaseDateFromAbout;

	        getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(aboutIdQuickAccessMenu));
			System.out.println("ClickOnCloseAbout");
			aboutIdQuickAccessMenu.click();	 
		 
		  excelReader.setCellData(xlfile, "Sheet1", 50, 9, resPass);
          return true;
					
		}
		else
		{
			
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(aboutIdQuickAccessMenu));
				System.out.println("ClickOnCloseAbout");
				aboutIdQuickAccessMenu.click();	 
				
			excelReader.setCellData(xlfile, "Sheet1", 50, 9, resFail);
			return false;
		}
		
	}
	
	
	
	public static String getReleasedate() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(aboutRelease));
		String getReleaseDateFromAbout=aboutRelease.getText();
		String modifyGetReleaseDateFromAbout=" "+getReleaseDateFromAbout;
		
		return modifyGetReleaseDateFromAbout;
	}
	
	

	
	public static void clickOnAboutToClose()
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(aboutIdQuickAccessMenu));
		System.out.println("ClickOnCloseAbout");
		aboutIdQuickAccessMenu.click();
	}
	
	
	public static boolean checkEditCompanyOptionInSearch() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
		getSearch.click();
		getSearch.sendKeys("Edit Company");
		
		
        String serachDropdown= getTextFromSearch.getText();
        
		System.out.println("recentDropdown  :  "+serachDropdown);
		
		
		boolean getUpdatedLang=false;
		String[] str= serachDropdown.split("\n");   
		for(String sto :str)
		{
		
			sto.equals("Edit Company");
			getUpdatedLang=true;
			break;
		}
		
		if (getUpdatedLang==true)
		{
			excelReader.setCellData(xlfile, "Sheet1", 51, 9, resPass);
			return true;
			
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 51, 9, resFail);
			return false;
			
		}
		
	
		
	}
	
	
	
	
	
	
	
	public static boolean checkSelectingEditCompanyInSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getTextFromSearch.click();
		
		Thread.sleep(5000);
		
		LoginPageCompanyCreationPage llccp=new LoginPageCompanyCreationPage(getDriver());
		
		boolean getCompanyFields=llccp.verifyAvailablityOfCreateCompanyFieldsInEditCompany();
	
		System.out.println("CreateCompanyTitle.getText()  :  "+CreateCompanyTitle.getText());
		
		System.out.println("getCompanyFields  :  "+getCompanyFields);
		
		Thread.sleep(3000);
		
		String actCreateCompanyTitle=CreateCompanyTitle.getText();
		
		boolean expCompanyFields=true;
		String expCreateCompanyTitle="Edit Company";
		
		if(actCreateCompanyTitle.equalsIgnoreCase(expCreateCompanyTitle) && getCompanyFields==expCompanyFields)
		{
			excelReader.setCellData(xlfile, "Sheet1", 52, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 52, 9, resFail);
			return false;
		}
	}
	
	@FindBy(xpath="//*[@id='Country']")
	private static WebElement countryDropdown;
	
	@FindBy(xpath="//*[@id='Currency1']")
	private static WebElement currencyDropdown;
	
	
	public static boolean checkUpdateTheCompanyAlertThroughSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(getCompanyNameTextInEditScreen));
	     getCompanyNameTextInEditScreen.sendKeys(modifyGetReleaseDateFromAbout);
	     
	     Thread.sleep(2000);
	     
	     getAction().moveToElement(getCompanyNameTextInEditScreen).sendKeys(Keys.TAB).perform();
	     companyDateInEditCompany.sendKeys("0201");
	     
	     Thread.sleep(2000);
	     
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(countryDropdown));
	    countryDropdown.sendKeys("India");
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyDropdown));
	    currencyDropdown.sendKeys("Indian Rupees, Rupees");
	     
	    	
	     Thread.sleep(2000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(okButtonInEditCompany));
	     okButtonInEditCompany.click();
	     
	     
	     getWaitForAlert();
	     
			
		 String getExpectedCompMsg="Company updated successfully";
					     
		 LoginPageCompanyCreationPage cco=new LoginPageCompanyCreationPage(getDriver());
		     
		 System.out.println("q");
	     
         String actCompanySaveMsg=cco.getAlert().getText();
	     
	     System.out.println("qq");
	     
	     System.out.println("getExpectedCompMsg  :  "+getExpectedCompMsg);
	     
	     System.out.println("qqq");
	     
	     System.out.println("actCompanySaveMsg  :  "+actCompanySaveMsg);
	     
	     System.out.println("qqqq");
	     
	     
	     if(getExpectedCompMsg.equalsIgnoreCase(actCompanySaveMsg))
	     {
	    	 cco.getAlert().accept();
	    	 excelReader.setCellData(xlfile, "Sheet1", 53, 9, resPass);
	    	 return true;
	     }
	     else
	     {
	    	 excelReader.setCellData(xlfile, "Sheet1", 53, 9, resFail);
	    	 return false;
	     }
	   
    }
	
    
	
    // commented Code Because after Updating Sign In Page Displays """cancelButtonInEditCompanyScreen"" and ""DashBoard"" 
    public static boolean clickOnCloseTheEditCompanyThroughSearch() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
    	
		/*Thread.sleep(5000);
		
     	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(cancelButtonInEditCompanyScreen));
    	cancelButtonInEditCompanyScreen.click();*/
    	
		Thread.sleep(2000);
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
    	
    	
    	getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(userNameTxt, "SU"));
    	String userInfo=userNameTxt.getText();
    	
    	System.out.println("User Info  : "+userInfo);
    	System.out.println("User Info Capture Text  :  "+userNameTxt.getText());
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
    	companyLogoImg.click();
    	
    	String getCompanyTxt=companyName.getText();
    	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    	System.out.println("company name  :  "+ getLoginCompanyName);
    	companyLogoImg.click();
    	
    	/*Thread.sleep(5000);
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
    	
    	String getDashboard=dashboard.getText();
    	
    	System.out.println(getDashboard);*/
    	
    	String expuserInfo="SU";
    	String expLoginCompanyName="Automation Company ";
    	
    	System.out.println("userInfo             "+userInfo             +"  value expected  "+expuserInfo);
    	System.out.println("getLoginCompanyName  "+getLoginCompanyName  +"  value expected  "+expLoginCompanyName);
    	
    		if(userInfo.equalsIgnoreCase(expuserInfo)&&getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))
    		{
    			getLogger().info("Login User the Company Name and Information is displaying correct");
    			System.out.println("Pass : Login User and Company Name is displaying Correct");
    		
    			
    			return true;
    		/*
    			if(getDashboard.equalsIgnoreCase("Dashboard"))
    			{
    				excelReader.setCellData(xlfile, "Sheet1", 54, 9, resPass);
    				return true;
    				
    			}
    		    else
    		    {
    		    	excelReader.setCellData(xlfile, "Sheet1", 54, 9, resFail);
    		    	return false;
    		    	
    		    }*/
    		}
    		else
    		{
    			excelReader.setCellData(xlfile, "Sheet1", 54, 9, resFail);
    			getLogger().info("Fail : Login User the Company Name and Information is displaying Wrong");
    			System.out.println("Fail : Login Name the Company Name and Information is displaying Wrong");
    			return false;
    		}

    	
    }
	

	
	public static String getCompanyNameUserClickOnCompanyLogo()
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(companyLogoImg));
		
		companyLogoImg.click();
		
		String companyNameCompanyLogo=companyNameInCompanyLogo.getText();
		
    	String getCompanyName=companyNameCompanyLogo.substring(0, 32);
    	System.out.println("getCompanyName  :  "+ getCompanyName);
    	companyLogoImg.click();
		
		
		return getCompanyName;
		
	}
	
	
	public static boolean checkUpdatedLanguage() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		userNameDisplay.click();

		String langDropdown= languageDropdownInLogout.getText();
		
		System.out.println("langDropdown  :  "+langDropdown);
		
		boolean getUpdatedLang=false;
		String[] str= langDropdown.split("\n");   
		for(String sto :str)
		{
		
			sto.equals("Persian");
			getUpdatedLang=true;
			break;
		}
		
		return getUpdatedLang;
		
	}
		
	
	
	public static boolean clickOnChangePasssword() throws InterruptedException
	{
		HPWrapperLayoutPage wlp=new HPWrapperLayoutPage(getDriver());
		
		getSearch.click();
		getSearch.sendKeys("Change Password");
		Thread.sleep(2000);
		getSearch.click();
		getSearch.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		if (changePasswordSaveBtn.isDisplayed()) 
		{
			Thread.sleep(2000);
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
	
	
	//Change Password Screen : Click on Save button
	public static void clickOnSavebuttonInChangePassword()
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordSaveBtn));
		changePasswordSaveBtn.click();
	}
	
	
		@FindBy(xpath="//*[@id='107']")
		public static WebElement recentMenusText; 
	
		public boolean checkRecentMenus() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(recentMenus));
			recentMenus.click();
			
		    String recentMenusOption= recentMenusText.getText();
			
			System.out.println("recentMenusOption  :  "+recentMenusOption);
			
			boolean getUpdatedLang=false;
			String[] str= recentMenusOption.split("\n");   
			for(String sto :str)
			{
			
				sto.equals("Edit company");
				getUpdatedLang=true;
				break;
			}
			
			if (getUpdatedLang=true)
			{
				excelReader.setCellData(xlfile, "Sheet1", 55, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 55, 9, resFail);
				return false;
			}
			
			
		}
		
		public static boolean checkUserInfo() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			 userNameDisplay.click();
			
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(logoutOption));
			 
			 boolean actchangePassword              =changePassword.isDisplayed();
			 boolean actlanguageDropdownInLogout    =languageDropdownInLogout.isDisplayed();
			 boolean actlogoutOption                =logoutOption.isDisplayed();
			 
			 boolean expchangePassword              =true;
			 boolean explanguageDropdownInLogout    =true;
			 boolean explogoutOption                =true;
			 
			 System.out.println("changePassword           "+actchangePassword            +"  value expected  "+expchangePassword);
		     System.out.println("languageDropdownInLogout "+actlanguageDropdownInLogout  +"  value expected  "+explanguageDropdownInLogout);
		     System.out.println("logoutOption             "+actlogoutOption              +"  value expected  "+explogoutOption);
		     
			 if(actchangePassword==expchangePassword && actlanguageDropdownInLogout==explanguageDropdownInLogout && actlogoutOption==explogoutOption)
			 {
	             excelReader.setCellData(xlfile, "Sheet1", 56, 9, resPass);
				 return true;
				 
			 }
			 else
			 {
				  excelReader.setCellData(xlfile, "Sheet1", 56, 9, resFail);
				 return false;
			 }
		}
	
	
	public static boolean checkChangePasswordFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException	
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		clickOnChangePasssword();
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordCloseBtn));
		
		 boolean actchangePasswordTitle            =changePasswordTitle.isDisplayed();
		 String actcompareChnagePasswordTxt        =changePasswordTitle.getText();
		 boolean actchangePasswordOldPasswordTxt   =changePasswordOldPasswordTxt.isDisplayed();
		 boolean actchangePasswordNewPasswordTxt   =changePasswordNewPasswordTxt.isDisplayed();
		 boolean actchangePasswordConfirmTxt       =changePasswordConfirmTxt.isDisplayed();
		 boolean actchangePasswordSaveBtn          =changePasswordSaveBtn.isDisplayed();
		 boolean actchangePasswordCloseBtn         =changePasswordCloseBtn.isDisplayed();

		 boolean expchangePasswordTitle            =true;
		 String expcompareChnagePasswordTxt        ="Change Password";
		 boolean expchangePasswordOldPasswordTxt   =true;
		 boolean expchangePasswordNewPasswordTxt   =true;
		 boolean expchangePasswordConfirmTxt       =true;
		 boolean expchangePasswordSaveBtn          =true;
		 boolean expchangePasswordCloseBtn         =true;
		 
		 System.out.println("changePasswordTitle           "+actchangePasswordTitle           +"  value expected  "+expchangePasswordTitle);
	     System.out.println("changePasswordTitle           "+actcompareChnagePasswordTxt      +"  value expected  "+expcompareChnagePasswordTxt);
	     System.out.println("changePasswordOldPasswordTxt  "+actchangePasswordOldPasswordTxt  +"  value expected  "+expchangePasswordOldPasswordTxt);
	     System.out.println("changePasswordNewPasswordTxt  "+actchangePasswordNewPasswordTxt  +"  value expected  "+expchangePasswordNewPasswordTxt);
	     System.out.println("changePasswordConfirmTxt      "+actchangePasswordConfirmTxt      +"  value expected  "+expchangePasswordConfirmTxt);
	     System.out.println("changePasswordSaveBtn         "+actchangePasswordSaveBtn         +"  value expected  "+expchangePasswordSaveBtn);
	     System.out.println("changePasswordCloseBtn        "+actchangePasswordCloseBtn        +"  value expected  "+expchangePasswordCloseBtn);

		 
		if(actchangePasswordTitle==expchangePasswordTitle && actcompareChnagePasswordTxt.equalsIgnoreCase(expcompareChnagePasswordTxt) && 
		    actchangePasswordOldPasswordTxt==expchangePasswordOldPasswordTxt && actchangePasswordNewPasswordTxt==expchangePasswordNewPasswordTxt && 
		    actchangePasswordConfirmTxt==expchangePasswordConfirmTxt && actchangePasswordSaveBtn==expchangePasswordSaveBtn && 
		    actchangePasswordCloseBtn==expchangePasswordCloseBtn)
		{
			excelReader.setCellData(xlfile, "Sheet1", 57, 9, resPass);
			return true;
			
		}
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 57, 9, resFail);
			return false;
		}
		
	}
	

	    //Change Password Screen : Check Mandatory message is displaying on Click on Save button
		public static boolean checkMandatoryMessageForOldPasswordOnClickSaveButtonInChangePassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
		{

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getAction().moveToElement(changePasswordSaveBtn).build().perform();
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordSaveBtn));
			changePasswordSaveBtn.click();

			String expMessage="Enter old password";
			
			String actMessage=checkValidationMessage(expMessage);
			
			System.out.println("getMandatoryMessage  :  "+actMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				excelReader.setCellData(xlfile, "Sheet1", 58, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 58, 9, resFail);
				return false;
			}
			
		}
		
		
		
	
	
   
    
        //Change Password Screen : Check Mandatory message is displaying on Click on Save button
  		public static boolean checkMandatoryMessageForNewPasswordOnClickSaveButtonInChangePassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  		{
  			excelReader=new ExcelReader(POJOUtility.getExcelPath());
  			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
  			
  				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordOldPasswordTxt));
  				
  				String op=excelReader.getCellData("Sheet1", 59, 6);
  				
  				changePasswordOldPasswordTxt.sendKeys(op);
  				
  				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordSaveBtn));
  				
  				changePasswordSaveBtn.click();
  				
  				
  				Thread.sleep(3000);
  				
  				String expMessage="Enter new password";
  				
  				String actMessage=checkValidationMessage(expMessage);
  				
  				if(actMessage.equalsIgnoreCase(expMessage))
  				{
  					excelReader.setCellData(xlfile, "Sheet1", 59, 9, resPass);
  					return true;
  				}
  				else
  				{
  					excelReader.setCellData(xlfile, "Sheet1", 59, 9, resFail);
  					return false;
  				}
  				
  			}
  		
  		
  		public static boolean checkMandatoryMessageForConfirmPasswordOnClickSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
  			
  			excelReader=new ExcelReader(POJOUtility.getExcelPath());
  			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
  			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordOldPasswordTxt));
			
			changePasswordOldPasswordTxt.clear();
			String op=excelReader.getCellData("Sheet1", 60, 6);
			changePasswordOldPasswordTxt.sendKeys(op);
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordNewPasswordTxt));
			
			changePasswordNewPasswordTxt.clear();
			String np=excelReader.getCellData("Sheet1", 60, 6);
			changePasswordNewPasswordTxt.sendKeys("s");
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordSaveBtn));
			
			changePasswordSaveBtn.click();
			
			String expMessage="Enter confirm password";
			
			String actMessage=checkValidationMessage(expMessage);
			
			System.out.println("getMandatoryMessageNewPassword  :  "+actMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				excelReader.setCellData(xlfile, "Sheet1", 60, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 60, 9, resFail);
				return false;
			}
			
		}
  		
  		
  		
  		
  		
  		public static boolean checkConfirmPasswordNewPasswordMatchOnClickSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  		
		{
  			excelReader=new ExcelReader(POJOUtility.getExcelPath());
  			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
            getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordOldPasswordTxt));
			
            changePasswordOldPasswordTxt.clear();
            String op=excelReader.getCellData("Sheet1", 60, 6);
			changePasswordOldPasswordTxt.sendKeys(op);
				
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordNewPasswordTxt));
			
			changePasswordNewPasswordTxt.clear();
			String np=excelReader.getCellData("Sheet1", 60, 6);
			changePasswordNewPasswordTxt.sendKeys(np);
				
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordConfirmTxt));
			String cp=excelReader.getCellData("Sheet1", 61, 6);
			changePasswordConfirmTxt.sendKeys(cp);
	
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordSaveBtn));
			
			changePasswordSaveBtn.click();
			
			String expMessage="Confirm password does not match";
			
			String actMessage=checkValidationMessage(expMessage);
	
			System.out.println("getMandatoryMessageNewPassword  :  "+actMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				excelReader.setCellData(xlfile, "Sheet1", 61, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 61, 9, resFail);
				return false;
			}
			
		}
  		
  		

		public static boolean checkInvalidMessageForOldPasswordOnClickSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			changePasswordOldPasswordTxt.clear();
			String op=excelReader.getCellData("Sheet1", 62, 6);
			changePasswordOldPasswordTxt.sendKeys(op);
				
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordNewPasswordTxt));
			
			changePasswordNewPasswordTxt.clear();
			String np=excelReader.getCellData("Sheet1", 63, 6);
			changePasswordNewPasswordTxt.sendKeys(np);
				
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordConfirmTxt));
			changePasswordConfirmTxt.clear();
			String cp=excelReader.getCellData("Sheet1", 64, 6);
			changePasswordConfirmTxt.sendKeys(cp);

			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordSaveBtn));
			
			changePasswordSaveBtn.click();
			
			String expMessage="Provided old password is incorrect";
			
			String actMessage=checkValidationMessage(expMessage);
		
			System.out.println("getMandatoryMessageNewPassword  :  "+actMessage);
			Thread.sleep(5000);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				excelReader.setCellData(xlfile, "Sheet1", 62, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 62, 9, resFail);
				return false;
			}
		}
	
  		
  	
  	
		
		
		public static boolean checkMessageOldNewPasswordSameFOnClickSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			Thread.sleep(5000);
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			changePasswordOldPasswordTxt.clear();
			String op=excelReader.getCellData("Sheet1", 65, 6);
			changePasswordOldPasswordTxt.sendKeys(op);
				
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordNewPasswordTxt));
			
			changePasswordNewPasswordTxt.clear();
			String np=excelReader.getCellData("Sheet1", 66, 6);
			changePasswordNewPasswordTxt.sendKeys(np);
				
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordConfirmTxt));
			changePasswordConfirmTxt.clear();
			String cp=excelReader.getCellData("Sheet1", 67, 6);
			changePasswordConfirmTxt.sendKeys(cp);

			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordSaveBtn));
			changePasswordSaveBtn.click();
			
			String expMessage="Old and new passwords cannot be same";
			
			String actMessage=checkValidationMessage(expMessage);
		
			System.out.println("getMandatoryMessageNewPassword  :  "+actMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				excelReader.setCellData(xlfile, "Sheet1", 65, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 65, 9, resFail);
				return false;
			}
		}
		
		
		public static boolean checkSaveValidOldNewPasswordFOnClickSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{	
			Thread.sleep(3000);
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			changePasswordOldPasswordTxt.clear();
			String op=excelReader.getCellData("Sheet1", 68, 6);
			changePasswordOldPasswordTxt.sendKeys(op);
				
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordNewPasswordTxt));
			
			changePasswordNewPasswordTxt.clear();
			String np=excelReader.getCellData("Sheet1", 69, 6);
			changePasswordNewPasswordTxt.sendKeys(np);
				
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordConfirmTxt));
			changePasswordConfirmTxt.clear();
			String cp=excelReader.getCellData("Sheet1", 70, 6);
			changePasswordConfirmTxt.sendKeys(cp);

			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordSaveBtn));
			
			changePasswordSaveBtn.click();
			Thread.sleep(2000);
		
			String expMessage="Password Saved Successfully";
			
			String actMessage=checkValidationMessage(expMessage);
	
			System.out.println("getMandatoryMessageNewPassword  :  "+actMessage);
			
			String actUserName=userNameTxt.getText();
			String actDashboard=dashboard.getText();
			
			String expUserName="SU";
			String expDashboard="Dashboard";
			
			System.out.println("UserName  :  "+actUserName   +"  value expected  "+expUserName);
			System.out.println("Dashboard :  "+actDashboard  +"  value expected  "+expDashboard);
			
			if(actMessage.equalsIgnoreCase(expMessage) && actUserName.equalsIgnoreCase(expUserName) && actDashboard.equalsIgnoreCase(expDashboard))
			{
				excelReader.setCellData(xlfile, "Sheet1", 68, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 68, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		public static boolean checkCloseBtnInChangePasswordAndCheckLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
			
			/*getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			userNameDisplay.click();

			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePassword));
			changePassword.click();
			
			*/
			clickOnChangePasssword();
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordCloseBtn));
			changePasswordCloseBtn.click();

			//Thread.sleep(4000);
			
			    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
			    	
			    	String userInfo=userNameTxt.getText();
			    	
			    	System.out.println("User Info  :  "+userInfo);
			    	System.out.println("User Info Capture Text  :  "+userNameTxt.getText());
			    	
			    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
			    	companyLogoImg.click();
			    	
			    	String getCompanyTxt=companyName.getText();
			    	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
			    	System.out.println("company name  :  "+ getLoginCompanyName);
			    	companyLogoImg.click();
			    	
			    	
			    	
			    	
			    	String expuserInfo="SU";
			    	String expLoginCompanyName="Automation Company ";
			    	
			    		if(userInfo.equalsIgnoreCase(expuserInfo)&&getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))
			    			{
			    			getLogger().info("Login User the Company Name and Information is displaying correct");
			    			System.out.println("Pass : Login User and Company Name is displaying Correct");
			    			excelReader.setCellData(xlfile, "Sheet1", 71, 9, resPass);
			    		    
			    			
			    			Thread.sleep(3000);
			    			
			    			  getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			    			  userNameDisplay.click();

			    			 
			    			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			    			  logoutOption.click();
			    			 
			    			  Thread.sleep(3000);
			    			  
			    				boolean verifyFiledsStatus=true;
			    				
			    				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
			    				
			    				boolean actusername             =username.isDisplayed();
			    				boolean actpassword             =password.isDisplayed();
			    				boolean actcompanyDropDownList  =companyDropDownList.isDisplayed(); 
			    				boolean actsignIn               =signIn.isDisplayed();
			    				
			    				boolean expusername             =true;
			    				boolean exppassword             =true;
			    				boolean expcompanyDropDownList  =true; 
			    				boolean expsignIn               =true;
			    				
			    				System.out.println("username            : "+actusername            +"  value expected  "+expusername);
			    				System.out.println("password            : "+actpassword            +"  value expected  "+exppassword);
			    				System.out.println("companyDropDownList : "+actcompanyDropDownList +"  value expected  "+expcompanyDropDownList);
			    				System.out.println("signIn              : "+actsignIn              +"  value expected  "+expsignIn);
			    				
			    				if(actusername==expusername && actpassword==exppassword && actcompanyDropDownList==expcompanyDropDownList && actsignIn==expsignIn)
			    				{
			    						excelReader.setCellData(xlfile, "Sheet1", 71, 9, resPass);
			    						return true;
			    				}
			    				else
			    				{
			    						excelReader.setCellData(xlfile, "Sheet1", 71, 9, resFail);
			    						return false;
			    			     }
			    			
			    		}
			    		else
			    		{
			    			
			    			getLogger().info("Fail : Login User the Company Name and Information is displaying Wrong");
			    			System.out.println("Fail : Login Name the Company Name and Information is displaying Wrong");
			    			excelReader.setCellData(xlfile, "Sheet1", 71, 9, resFail);
			    			return false;
			    		}
			
			
		
			
		 }
		
		
	/*	public static boolean checkLogoutChangaePassword() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			 
			  getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			  userNameDisplay.click();

			 
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			  logoutOption.click();
			 
				boolean verifyFiledsStatus=true;
				
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
				
				if(username.isDisplayed() && password.isDisplayed()&& companyDropDownList.isDisplayed() && signIn.isDisplayed())
				{
					
						excelReader.setCellData(xlfile, "Sheet1", 72, 9, resPass);
						return true;
							 
				}
				else
				{
						excelReader.setCellData(xlfile, "Sheet1", 72, 9, resFail);
						return false;
			     }
				 


		}*/
		
		
		
		
		// here we are checking with change password
		public static boolean checkLoginAfterChangePasswordChangePasswordAndLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		    username.click();
		    Thread.sleep(2000);
			username.clear();
		    Thread.sleep(2000);
	        username.sendKeys("su");
	        getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
			password.click();
			Thread.sleep(2000);
			password.clear();
			Thread.sleep(2000);
			password.sendKeys("s");
			//getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
			
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
			signIn.click();	
			
			  reLogin("su", "su", "Automation Company");
	        	    	
			//checkRefershPopOnlogin();
			
			//checkPopUpWindow();
			
			Thread.sleep(5000);
			
	    	String userInfo=userNameTxt.getText();
	    	
	    	System.out.println("User Info  :  "+userInfo);
	    	
	    	System.out.println("User Info Capture Text :"+userNameTxt.getText());
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
	    	
	    	companyLogoImg.click();
	    	
	    	String getCompanyTxt=companyName.getText();
	    	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
	    	System.out.println("company name  :  "+ getLoginCompanyName);
	    	companyLogoImg.click();
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
	    	
	    	String getDashboard=dashboardName.getText();
	    	
	    	System.out.println("getDashboard  :  "+getDashboard);
	    	
	    	Thread.sleep(3000);
	    	
	    	boolean acthomeMenu=homeMenu.isDisplayed();
	    	
	    	String expuserInfo          ="SU";
	    	String expLoginCompanyName  ="Automation Company ";
	    	String expDashboard         ="Dashboard";
	    	boolean exphomemenu         =true;
	    	
	    	System.out.println("userInfo         : "+userInfo            +"  value expected  "+expuserInfo);
	    	System.out.println("LoginCompanyName : "+getLoginCompanyName +"  value expected  "+expLoginCompanyName);
	    	System.out.println("Dashboard        : "+getDashboard        +"  value expected  "+expDashboard);
	    	System.out.println("Homemenu         : "+acthomeMenu         +"  value expected  "+exphomemenu);
	    	
	    		if(userInfo.equalsIgnoreCase(expuserInfo) && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName) && getDashboard.equalsIgnoreCase(expDashboard))
//	    			acthomeMenu==exphomemenu
	    		{
					excelReader.setCellData(xlfile, "Sheet1", 72, 9, resPass);
			
	    			Thread.sleep(4000);
	    		
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
					userNameDisplay.click();

					
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePassword));
					changePassword.click();
					
					Thread.sleep(2000);
					getAction().moveToElement(recentMenus).build().perform();
					
					changePasswordOldPasswordTxt.clear();
					String op="s";
					changePasswordOldPasswordTxt.sendKeys(op);
						
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordNewPasswordTxt));
					
					changePasswordNewPasswordTxt.clear();
					String np="su";
					changePasswordNewPasswordTxt.sendKeys(np);
						
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordConfirmTxt));
					changePasswordConfirmTxt.clear();
					String cp="su";
					changePasswordConfirmTxt.sendKeys(cp);

					getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordSaveBtn));
					
					changePasswordSaveBtn.click();
				
					String expMessage="Password Saved Successfully";
					
					String actMessage=checkValidationMessage(expMessage);
					
					System.out.println("getMandatoryMessageNewPassword  :  "+actMessage);
					
					String actuserInfo1   =userNameTxt.getText();
					String actDashboard1  =dashboardName.getText();
					
					String expuserInfo1   ="SU";
			    	String expDashboard1  ="Dashboard";
			    	
			    	System.out.println("userInfo       : "+actuserInfo1       +"  value expected  "+expuserInfo1);
			    	System.out.println("Dashboard      : "+actDashboard1      +"  value expected  "+expDashboard1);
					
					
					if(actMessage.equalsIgnoreCase(expMessage) && actuserInfo1.equalsIgnoreCase(expuserInfo1) /*&& actDashboard1.equalsIgnoreCase(expDashboard1)*/)
					{
						excelReader.setCellData(xlfile, "Sheet1", 72, 9, resPass);
						//return true;
					
						
						Thread.sleep(3000);
		    			
		    			
		    			  getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		    			  userNameDisplay.click();

		    			 
		    			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		    			  logoutOption.click();
		    			 
		    				boolean verifyFiledsStatus=true;
		    				
		    				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		    				
		    				boolean actusername             =username.isDisplayed();
		    				boolean actpassword             =password.isDisplayed();
		    				boolean actcompanyDropDownList  =companyDropDownList.isDisplayed(); 
		    				boolean actsignIn               =signIn.isDisplayed();
		    				
		    				boolean expusername             =true;
		    				boolean exppassword             =true;
		    				boolean expcompanyDropDownList  =true; 
		    				boolean expsignIn               =true;
		    				
		    				System.out.println("username            : "+actusername            +"  value expected  "+expusername);
		    				System.out.println("password            : "+actpassword            +"  value expected  "+exppassword);
		    				System.out.println("companyDropDownList : "+actcompanyDropDownList +"  value expected  "+expcompanyDropDownList);
		    				System.out.println("signIn              : "+actsignIn              +"  value expected  "+expsignIn);
		    				
		    				if(actusername==expusername && actpassword==exppassword && actcompanyDropDownList==expcompanyDropDownList && actsignIn==expsignIn)
		    				{
		    					
		    					excelReader.setCellData(xlfile, "Sheet1", 72, 9, resPass);
		    				    return true;
		    							 
		    				}
		    				else
		    				{
		    					excelReader.setCellData(xlfile, "Sheet1", 72, 9, resFail);
		    					return false;
		    			    }
						
						
						
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 72, 9, resFail);
						return false;
					}
	    		}
	    		else
	    		{
	    			
	    		
	    			excelReader.setCellData(xlfile, "Sheet1", 73, 9, resFail);
	    			return false;
	    		}
			}
			
		
		
		
		
		
		/*public static boolean checkSaveSuPassword() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			userNameDisplay.click();

			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePassword));
			changePassword.click();
			
			
			changePasswordOldPasswordTxt.clear();
			String op="s";
			changePasswordOldPasswordTxt.sendKeys(op);
				
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordNewPasswordTxt));
			
			changePasswordNewPasswordTxt.clear();
			String np="su";
			changePasswordNewPasswordTxt.sendKeys(np);
				
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordConfirmTxt));
			changePasswordConfirmTxt.clear();
			String cp="su";
			changePasswordConfirmTxt.sendKeys(cp);

			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(changePasswordSaveBtn));
			
			changePasswordSaveBtn.click();
		
	
			String getMandatoryMessageNewPassword=msgGlobalError.getText();
			
			System.out.println(getMandatoryMessageNewPassword);
			
			if(getMandatoryMessageNewPassword.equalsIgnoreCase("Password Saved Successfully") && userNameDisplay.getText().equalsIgnoreCase("SU") && dashboard.getText().equalsIgnoreCase("Dashboard"))
			{
				closeMsgGlobalError.click();
				excelReader.setCellData(xlfile, "Sheet1", 68, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 68, 9, resFail);
				return false;
			}
		}
		*/
		
		
		
		
		
		
		
		
		
  		 public HPWrapperLayoutPage(WebDriver driver)
  	     {
  	    	
  	    	PageFactory.initElements(driver, this);
  	    	
  	     }
  	
	
	
	
}
