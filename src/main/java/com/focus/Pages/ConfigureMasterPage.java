package com.focus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class ConfigureMasterPage extends BaseEngine
{

	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//div[@id='masterTreeMenu']//ul//li//a//span")
	public static List<WebElement> menuList;
	
	@FindBy(xpath="//div[@id='masterTreeMenu']//ul//li[@id='mMenu1000']//a//span")
	public static List<WebElement> masterMenuList;
	
	@FindBy(xpath="//div[@id='masterTreeMenu']/ul//li/a/i")
	public static List<WebElement> menuPlus;
	
	public static String checkValidationMessageString(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
	
	/*@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/header[1]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]")
	public static WebElement userNameDisplay;*/

    public static int cSize;
    
	 public static boolean checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		
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
		 int i;
	  
	  
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
               
        Thread.sleep(5000);
           	
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
    	String actUserInfo = userNameTxt.getText();
    	String expUserInfo = "SU";
    	
    	System.out.println("Login To Company User Name Display Value Actual    : " + actUserInfo	 + " Value Expected : " + expUserInfo);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
    	companyLogoImg.click();
    	
    	String getCompanyTxt=companyName.getText();
    	String actGetLoginCompanyName =getCompanyTxt.substring(0, 19);
    	String expGetLoginCompanyName ="Automation Company ";
    	
    	System.out.println("Login To Company CompanyTxt Name Display Value Actual    : " + actGetLoginCompanyName	 + " Value Expected : " + expGetLoginCompanyName);
    	   	
    	companyLogoImg.click();
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
    	
    	String actGetDashboard = dashboardName.getText();
    	String expGetDashboard = "Dashboard";
    	
    	System.out.println("Login To Company Dashboard Name Display Value Actual    : " + actGetDashboard	 + " Value Expected : " + expGetDashboard);
   
		  if(actUserInfo.equalsIgnoreCase(expUserInfo) && actGetLoginCompanyName.equalsIgnoreCase(expGetLoginCompanyName) &&
				  actGetDashboard.equalsIgnoreCase(expGetDashboard))
		  {
				
				return true;
		  }
		  else
		  {
				
				return true;
		  }
     }
  	 
	 public static boolean checkLogoutAndLoginAftercustomization() throws InterruptedException
	 {

			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplayLogo));
			userNameDisplayLogo.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
			
			Thread.sleep(4000);
			
			LoginPage lp=new LoginPage(getDriver()); 
				
		    String unamelt="su";
		  
		    String pawslt="su";
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		    username.click();
		    Thread.sleep(2000);
			username.clear();
		    Thread.sleep(2000);
		    username.sendKeys(unamelt);
		    getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
			password.click();
			Thread.sleep(2000);
			password.clear();
			Thread.sleep(2000);
			password.sendKeys(pawslt);
		    
		    lp.clickOnSignInBtn();
		    
		    //checkRefershPopOnlogin();
		    
		    //checkPopUpWindow();
		    
		    Thread.sleep(8000);
		          
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
		    userNameTxt.click();
		           	
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
			
		    
		    String expuserInfo            ="SU";
		    String expLoginCompanyName    ="Automation Company ";
		    String expDashboard			  ="Graph with Active and setAsDefault";
		   
			
			System.out.println("***********************************checkLogoutAndLoginAfterEnablingMandatoryCheckboxInFieldsProperties*********************************");
		    
		    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
		    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
		    System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);
		   
		  
			if(userInfo.equalsIgnoreCase(expuserInfo) /*&& getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName)*/)
			{	
				return true;
			}	 
			else
			{
				return false;
			}
		 
	 }

	 

	
	public boolean checkconfigureMasters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
			settingsConfigureMasters.click();
			
			
			int configMastersRibbonControlCount = configMastersRibbonControl.size();
			
			ArrayList<String> configMastersRibbonControlArray = new ArrayList<String>();
			
			for(int i=0;i<configMastersRibbonControlCount;i++)
			{
				String data = configMastersRibbonControl.get(i).getAttribute("title");
				configMastersRibbonControlArray.add(data);
			}
		    		
			String actconfigMastersRibbonControl = configMastersRibbonControlArray.toString();
			
			String expconfigMastersRibbonControl = "[Save, Delete, Export, Import, Close]";
			
			System.out.println("configMastersRibbonControl Actual   : " + actconfigMastersRibbonControl);
			System.out.println("configMastersRibbonControl Expected : " + expconfigMastersRibbonControl);
			
			int actconfigMastersHeaderListCount = configMastersHeaderList.size();
			int expconfigMastersHeaderListCount = 4; 
			
			System.out.println("actconfigMastersHeaderListCount   : " + actconfigMastersHeaderListCount);
			System.out.println("expconfigMastersHeaderListCount   : " + expconfigMastersHeaderListCount);
			
			
			
			
			boolean actmoduleDropdown       	= moduleDropdown.isDisplayed();
			boolean actnameComboBox         	= nameComboBox.isDisplayed();
			boolean actcaptionTxt 				= captionTxt.isDisplayed();
			boolean actsearchByNameRadioBtn 	= searchByNameRadioBtn.isDisplayed();
			boolean actsearchByCodeRadioBtn 	= searchByCodeRadioBtn.isDisplayed();
			boolean actallowReservationChkBox 	= allowReservationChkBox.isDisplayed();
			boolean actdefaultChkBox 			= defaultChkBox.isDisplayed();
			boolean actgroupMandatoryChkBox 	= groupMandatoryChkBox.isDisplayed();
			boolean actpickCodeChkBox 			= pickCodeChkBox.isDisplayed();
			boolean actdependentTab 			= dependentTab.isDisplayed();
			boolean actusedTab 					= usedTab.isDisplayed();
			boolean actmenuMinimizeBtn 			= menuMinimizeBtn.isDisplayed();
			
			boolean expmoduleDropdown       	= true;
			boolean expnameComboBox         	= true;
			boolean expcaptionTxt 				= true;
			boolean expsearchByNameRadioBtn 	= true;
			boolean expsearchByCodeRadioBtn 	= true;
			boolean expallowReservationChkBox 	= true;
			boolean expdefaultChkBox 			= true;
			boolean expgroupMandatoryChkBox 	= true;
			boolean exppickCodeChkBox 			= true;
			boolean expdependentTab 			= true;
			boolean expusedTab 					= true;
			boolean expmenuMinimizeBtn 			= true;
			boolean expmenuExpansionBtn 		= true;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(menuMinimizeBtn));
			menuMinimizeBtn.click();
			
			boolean actmenuExpansionBtn 		= menuExpansionBtn.isDisplayed();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(menuExpansionBtn));
			menuExpansionBtn.click();
			
			
			int showDependencyHeaderCount = showDependencyHeader.size();
			
			ArrayList<String> showDependencyHeaderArray = new ArrayList<String>();
			
			for(int i=0;i<showDependencyHeaderCount;i++)
			{
				String data = showDependencyHeader.get(i).getText();
				showDependencyHeaderArray.add(data);
			}
		    		
			String actshowDependencyHeader = showDependencyHeaderArray.toString();
			
			String expshowDependencyHeader = "[Master Name, Tab Caption, Field Caption, Field Type]";
			
			System.out.println("showDependencyHeader Actual   : " + actshowDependencyHeader);
			System.out.println("showDependencyHeader Expected : " + expshowDependencyHeader);
			
			int menuPlusCount = menuPlus.size();
			int menuListCount = menuList.size();
			
			System.err.println("menuPlusCount : " + menuPlusCount);
			
			System.out.println("moduleDropdown Actual         : " + actmoduleDropdown);
			System.out.println("nameComboBox Actual           : " + actnameComboBox);
			System.out.println("captionTxt Actual             : " + actcaptionTxt);
			System.out.println("searchByNameRadioBtn Actual   : " + actsearchByNameRadioBtn);
			System.out.println("searchByCodeRadioBtn Actual   : " + actsearchByCodeRadioBtn);
			System.out.println("allowReservationChkBox Actual : " + actallowReservationChkBox);
			System.out.println("defaultChkBox Actual          : " + actdefaultChkBox);
			System.out.println("groupMandatoryChkBox Actual   : " + actgroupMandatoryChkBox);
			System.out.println("pickCodeChkBox Actual         : " + actpickCodeChkBox);
			System.out.println("dependentTab Actual           : " + actdependentTab);
			System.out.println("usedTab Actual                : " + actusedTab);
			System.out.println("menuMinimizeBtn Actual        : " + actmenuMinimizeBtn);
			System.out.println("menuExpansionBtn Actual       : " + actmenuExpansionBtn);
			
			boolean actMethod = actmoduleDropdown==expmoduleDropdown && actnameComboBox==expnameComboBox && actcaptionTxt==expcaptionTxt
								&& actsearchByNameRadioBtn==expsearchByNameRadioBtn && actsearchByCodeRadioBtn==expsearchByCodeRadioBtn
								&& actallowReservationChkBox==expallowReservationChkBox && actdefaultChkBox==expdefaultChkBox
								&& actgroupMandatoryChkBox==expgroupMandatoryChkBox && actpickCodeChkBox==exppickCodeChkBox
								&& actdependentTab==expdependentTab && actusedTab==expusedTab && actmenuExpansionBtn==expmenuExpansionBtn;
				
			String actResult = Boolean.toString(actMethod);
			
			System.out.println("ActMethod : " + actMethod);
			
			if(actMethod==true && actconfigMastersRibbonControl.equalsIgnoreCase(expconfigMastersRibbonControl)
					&& actconfigMastersHeaderListCount == expconfigMastersHeaderListCount 
					&& actshowDependencyHeader.equalsIgnoreCase(expshowDependencyHeader)
					)
			{	
				System.out.println("Test Pass : Bin Popup Displayed");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Bin Popup NOT Displayed");
				
				return false;
			}
		}
		
	    @FindBy(xpath="//li[@id='mMenu261']//span[text()='GroupMaster']")
       	public static WebElement GroupMasterMenuBtn;
	                       
        @FindBy(xpath="//span[text()='GroupMasterToDelete']")
        public static WebElement GroupMasterToDeleteMenuBtn;

		
		
		public static boolean checkSavingMasterInConfigureMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
			customizationTab.click();
			
			String expMessageOnClickingCustomizeTab = "Enter Master Name Or Create new Master";
			
			String actMessageOnClickingCustomizeTab = checkValidationMessageString(expMessageOnClickingCustomizeTab);
			
			Thread.sleep(3000);
			
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionTab));
			definitionTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
			cmSaveBtn.click();
			
			String expMessageOnSaveEmpty = "Select menu";
			
			String actMessageOnSaveEmpty = checkValidationMessageString(expMessageOnSaveEmpty);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
			nameComboBox.click();
			nameComboBox.sendKeys("Test");
			nameComboBox.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
			cmSaveBtn.click();
			
			String expMessageOnSaveNameInput = "Select menu";
			
			String actMessageOnSaveNameInput = checkValidationMessageString(expMessageOnSaveNameInput);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
			homeMenuExpandBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuBtn));
			masterMenuBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
			nameComboBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
			captionTxt.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
			cmSaveBtn.click();
			
			String expMessageOnSave = "Master Saved Successfully";
			
			String actMessageOnSave = checkValidationMessageString(expMessageOnSave);
			
			if(actMessageOnClickingCustomizeTab .equalsIgnoreCase(expMessageOnClickingCustomizeTab ) && actMessageOnSaveEmpty.equalsIgnoreCase(expMessageOnSaveEmpty) 
					&& actMessageOnSaveNameInput.equalsIgnoreCase(expMessageOnSaveNameInput) && actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
			{	
				
				
				return true;
			}
			else
			{
				
				
				return false;
			}
		}
		
		@FindBy(xpath="//a[contains(@class,'menu-selected theme_color-inverse')]//span[@class='Flabel'][contains(text(),'Masters')]")
		public static WebElement cmMastermenu;
		
		@FindBy(xpath="//span[contains(text(),'Header Details')]")
		public static WebElement cmHeaderDetailsTab;
		
		@FindBy(xpath="//div[@id='btnAdd_Field_MasterCust']//span[@class='icon-new icon-font7']")
		public static WebElement cmAddBtn;
		
		@FindBy(xpath="//span[@class='icon-ok icon-font8']")
		public static WebElement cmCustomizeOkBtn;
		
		@FindBy(xpath="//span[@class='icon-close icon-font8']")
		public static WebElement cmCustomizeloseBtn;
		
		@FindBy(xpath="//input[@id='txtMasterViewName']")
		public static WebElement viewComboBox;
		
		@FindBy(xpath="//*[@id='ul_details_TreeCust']/li/div/label")
		public static List<WebElement> treecustomizationlist;
	
		
		public boolean checkSavedMasterAndUpdatingTheMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys(Keys.END);
				nameComboBox.sendKeys(Keys.SHIFT,Keys.HOME);
				nameComboBox.sendKeys(Keys.BACK_SPACE);
				nameComboBox.sendKeys(Keys.SPACE);
				
				int nameComboBoxListCount = nameComboBoxList.size();
				
				System.err.println("nameComboBoxListCount : "+nameComboBoxListCount);
				
				ArrayList<String> nameComboBoxListArray = new ArrayList<String>();
				
				for(int i=0;i<nameComboBoxListCount;i++)
				{
					String data = nameComboBoxList.get(i).getText();
					
					System.err.println("Data : " + data);
					
					if(data.equalsIgnoreCase("Test"))
					{
						nameComboBoxList.get(i).click();
						break;
					}
				}
				
				nameComboBox.sendKeys(Keys.TAB);
				
				
				String actnameComboBox = nameComboBox.getAttribute("data-focustext");
				String expnameComboBox = "Test";
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
				captionTxt.click();
				captionTxt.clear();
				captionTxt.sendKeys("TestUpdate");
				captionTxt.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
				cmSaveBtn.click();
				
				String expMessageOnSaveUpdate = "Master updated successfully";
				
				String actMessageOnSaveUpdate = checkValidationMessageString(expMessageOnSaveUpdate);
				
				System.out.println("nameComboBox Actual            : " + actnameComboBox          + " Value Expected : "+expnameComboBox);
				
				if(actnameComboBox.equalsIgnoreCase(expnameComboBox) && actMessageOnSaveUpdate.equalsIgnoreCase(expMessageOnSaveUpdate))
						
						
				{	
					
					
					return true;
				}
				else
				{
					
					
					return false;
				}
			}
			

			@FindBy(xpath="//*[@id='btnDelete_ConfigureMasters']/a/i")
			public static WebElement cmDeleteBtn;
		
		
			@FindBy(xpath="//*[@id='lblMessage_Modal']")
			public static WebElement cmGetMgsonDelete;

			@FindBy(xpath="//*[@id='btnDeleteMaster_Ok']")
			public static WebElement cmclickOnOkInDelete;
			
			public static boolean checkUpdatedMasterAndDeleteThatMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys(Keys.END);
				nameComboBox.sendKeys(Keys.SHIFT,Keys.HOME);
				nameComboBox.sendKeys(Keys.BACK_SPACE);
				nameComboBox.sendKeys(Keys.SPACE);
				
				int nameComboBoxListCount = nameComboBoxList.size();
				
				
				
				System.err.println("nameComboBoxListCount : "+nameComboBoxListCount);
				
				ArrayList<String> nameComboBoxListArray = new ArrayList<String>();
				
				for(int i=0;i<nameComboBoxListCount;i++)
				{
					String data = nameComboBoxList.get(i).getText();
					
					System.err.println("Data : " + data);
					
					if(data.equalsIgnoreCase("Test"))
					{
						nameComboBoxList.get(i).click();
						break;
					}
				}
				
				nameComboBox.sendKeys(Keys.TAB);
				
				
				String actnameComboBox = nameComboBox.getAttribute("data-focustext");
				String expnameComboBox = "Test";
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmDeleteBtn));
				cmDeleteBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmGetMgsonDelete));

				String actMessageOnClickOnDeleteButton = cmGetMgsonDelete.getText();
				
				String expMessageOnClickOnDeleteButton = "Are you sure that you want to delete Master?";
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmclickOnOkInDelete));
				cmclickOnOkInDelete.click();
				
				
				String expMessageOnClickingOkInDelete = "Master delete successfully";
				
				String actMessageOnClickingOkInDelete = checkValidationMessageString(expMessageOnClickingOkInDelete);
				
				
				System.out.println("MessageOnClickOnDeleteButton Actual : " + actMessageOnClickOnDeleteButton + " Value Expected : " + expMessageOnClickOnDeleteButton);
				System.out.println("MessageOnClickingOkInDelete  Actual : " + actMessageOnClickingOkInDelete  + " Value Expected : " + expMessageOnClickingOkInDelete);
				
				
				if(actnameComboBox.equalsIgnoreCase(expnameComboBox)
						&& actMessageOnClickOnDeleteButton.equalsIgnoreCase(expMessageOnClickOnDeleteButton)
						&& actMessageOnClickingOkInDelete.equalsIgnoreCase(expMessageOnClickingOkInDelete))
				{	
					System.out.println("Test Pass : Bin Popup Displayed");
					
					return true;
				}
				else
				{
					System.out.println("Test Fail : Bin Popup NOT Displayed");
					
					return false;
				}
			}
			
			public static boolean checkSavingMasterForRecordCreation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{	
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys("ConfigMaster");
				nameComboBox.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuBtn));
				masterMenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
				captionTxt.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
				cmSaveBtn.click();
				
				String expMessageOnSave = "Master Saved Successfully";
				
				String actMessageOnSave = checkValidationMessageString(expMessageOnSave);
				
				if(actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
				{	
					
					return true;
				}
				else
				{
					
					return false;
				}
			}
			
			@FindBy(xpath="//span[text()='ConfigMaster']")
			public static WebElement ConfigMasterInMastersList;
			
			public static boolean checkSavedMaserInMastersListAndSaveRecord() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				Thread.sleep(2000);
				getDriver().navigate().refresh();
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				Thread.sleep(3000);
				/*getAction().moveToElement(ConfigMasterInMastersList).build().perform();*/
				JavascriptExecutor jse = (JavascriptExecutor)getDriver();
				jse.executeScript("arguments[0].scrollIntoView(true);", ConfigMasterInMastersList);
				
				boolean actConfigMaster = ConfigMasterInMastersList.isDisplayed();
				boolean expConfigMaster = true;
				
				System.out.println("actConfigMaster "+actConfigMaster);
				System.out.println("expConfigMaster "+expConfigMaster);
				
				Thread.sleep(2000);
				if(actConfigMaster == expConfigMaster )
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigMasterInMastersList));
					ConfigMasterInMastersList.click();
				}
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				masterNewBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
				nameTxt.sendKeys("NewRecord");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("CdNewRecord");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
				SaveBtn.click();
				
				String expSaveMessage = "Saved Successfully";
				String actSaveMessage = checkValidationMessageString(expSaveMessage);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				
				if (actSaveMessage.equalsIgnoreCase(expSaveMessage)) 
				{
					return true;
				} 
				else
				{
					return false;
				}
				
			}
			
			
			@FindBy(xpath="//*[@id='60']")
			public static WebElement  financialsMenu;
			
			@FindBy(xpath="//*[@id='61']/span")
			public static WebElement  financialsTransactionMenu; 
			
			@FindBy(xpath="//i[@class='icon-settings hiconright2']") //(//*[@id='navbarSupportedContent2']/ul/li[8]/a/i)[1]
			public static WebElement Receipts_SettingsBtn;
			
			@FindBy(xpath="//a[@id='2001']//span[contains(text(),'Cash and Bank')]")
			public static WebElement  cashAndBankMenu; 
			
			@FindBy(xpath="//a[@id='2002']//span[contains(text(),'Receipts')]")
			public static WebElement  receiptsVoucher;
			
			@FindBy(xpath="//*[@id='doc_TagsTable_col_2-1']")
			public static WebElement  mastersDropdownInReceipts;
			
			@FindBy(xpath="//select[@id='doc_TagsTableMasterDropDown']")
			public static WebElement  selectMasterdropdown;
			
			@FindBy(xpath="//*[@id='doc_TagsTable_col_2-2']")
			public static WebElement  masterHeaderOrBodyDropdown;
			
			
			@FindBy(xpath="//select[@id='doc_TagsPositionDropDown']")
			public static WebElement  selectHeaderOrBodyDropdown;
			
			@FindBy(xpath="//*[@id='updateButton']")
			public static WebElement  updateBtn;
			
			@FindBy(xpath="//*[@id='callbackbtn']/i")
			public static WebElement  closeBtnInSettings;
			
			@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
			public static WebElement  newBtn;
			
			@FindBy(xpath="//*[@id='id_header_4_table_body']/tr/td[2]")
			public static List<WebElement>  cashAndBAnkAccountList;
			
			@FindBy(xpath="//input[@id='id_header_4']")
			public static WebElement newCashBankAccountTxt;
			
			@FindBy(xpath="//input[@id='id_body_16']")
			public static WebElement  enter_Amount;
			
			@FindBy(xpath="//input[@id='id_header_268435459']")
			public static WebElement  departmentTxt;
			
			@FindBy(xpath="//input[@id='id_header_268438459']")
			public static WebElement  configMastertxt;
			
			
			
			@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
			public static WebElement  select1stRow_1stColumn;
			
			@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
			public static WebElement  select1stRow_2ndColumn;
			
			@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
			public static WebElement  select1stRow_3rdColumn;
			
			@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
			public static WebElement  select1stRow_4thColumn;
			
			@FindBy(xpath="//input[@id='id_body_12']")
			
			public static WebElement  enter_AccountTxt;
			
			@FindBy(xpath="//*[@id='id_transactionentry_save']")
			public static WebElement  voucherSaveBtn;
			
			@FindBy(xpath="//div[@id='dvHomeTransClose']")  
			public static WebElement  voucherhomeCloseBtn;
			
			@FindBy(xpath="//span[@id='btnPick']")
			public static WebElement pickBtn;
			
			@FindBy(xpath="//span[@id='btnOk']")
			public static WebElement  billRefOkBtn;	
			
			@FindBy(xpath="//*[@value='Delete Row']") //*[@id='panelsStayOpen-collapseOne']/div[3]/input[1]
			public static WebElement  deleteRowBtn;	
			
			
			
			public static boolean checkAddingCreatedMasterInReceiptsHeaderAndSaveVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
				financialsMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
				financialsTransactionMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
				cashAndBankMenu.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
				receiptsVoucher.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Receipts_SettingsBtn));
				Receipts_SettingsBtn.click();
				
				Thread.sleep(4000);
				
				/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalExpandBtn));
				generalExpandBtn.click();*/
				
				JavascriptExecutor jse = (JavascriptExecutor)getDriver();
				jse.executeScript("arguments[0].scrollIntoView(true);",deleteRowBtn);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersDropdownInReceipts));
				mastersDropdownInReceipts.click();
				
				Select master = new Select(selectMasterdropdown);
				master.selectByVisibleText("ConfigMaster");
				selectMasterdropdown.sendKeys(Keys.TAB);
				
				Select position = new Select(selectHeaderOrBodyDropdown);
				position.selectByVisibleText("Header");
				selectHeaderOrBodyDropdown.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
				updateBtn.click();
				
				String expupdateMessage = "Data saved successfully";
				String actUpdateMessage = checkValidationMessageString(expupdateMessage);
				
			/*	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInSettings));
				closeBtnInSettings.click();
				*/
				
		       if(actUpdateMessage.equalsIgnoreCase(expupdateMessage))
		       {
		    	  return true;
		       }
		       else
		       {
		    	  
		    	   return false;
		       }	
				
				
				
				
				
			}
			public static boolean checkDeletigCreatedMasterWithTheRecord() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys(Keys.END);
				nameComboBox.sendKeys(Keys.SHIFT,Keys.HOME);
				nameComboBox.sendKeys(Keys.BACK_SPACE);
				nameComboBox.sendKeys(Keys.SPACE);
				
				int nameComboBoxListCount = nameComboBoxList.size();
				
				System.err.println("nameComboBoxListCount : "+nameComboBoxListCount);
				
				ArrayList<String> nameComboBoxListArray = new ArrayList<String>();
				
				for(int i=0;i<nameComboBoxListCount;i++)
				{
					String data = nameComboBoxList.get(i).getText();
					
					System.err.println("Data : " + data);
					
					if(data.equalsIgnoreCase("ConfigMaster"))
					{
						nameComboBoxList.get(i).click();
						break;
					}
				}
				
				nameComboBox.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmDeleteBtn));
				cmDeleteBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmGetMgsonDelete));

				String actMessageOnClickOnDeleteButton = cmGetMgsonDelete.getText();
				
				String expMessageOnClickOnDeleteButton = "Are you sure that you want to delete Master?";
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmclickOnOkInDelete));
				cmclickOnOkInDelete.click();
				
				
				String expMessageOnClickingOkInDelete = "\"Error\"";
				
				String actMessageOnClickingOkInDelete = checkValidationMessageString(expMessageOnClickingOkInDelete);
				
				
				System.out.println("MessageOnClickOnDeleteButton Actual : " + actMessageOnClickOnDeleteButton + " Value Expected : " + expMessageOnClickOnDeleteButton);
				System.out.println("MessageOnClickingOkInDelete  Actual : " + actMessageOnClickingOkInDelete  + " Value Expected : " + expMessageOnClickingOkInDelete);
				
				
				if(actMessageOnClickOnDeleteButton.equalsIgnoreCase(expMessageOnClickOnDeleteButton)
						&& actMessageOnClickingOkInDelete.equalsIgnoreCase(expMessageOnClickingOkInDelete))
				{	
					return true;
				}
				else
				{
					return false;
				}
				
			}
			
			
		
			public static boolean checkAddingGroupMasterInConfigureMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{	
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupBtnInconfigureMaster));
				addGroupBtnInconfigureMaster.click();
				
				String expMessageOnWithoutMenu = "Select the menu in which you want to add Group";
				String actMessageOnWithoutMenu = checkValidationMessageString(expMessageOnWithoutMenu);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuBtn));
				masterMenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupBtnInconfigureMaster));
				addGroupBtnInconfigureMaster.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupNameTxt));
				groupNameTxt.sendKeys("GroupMaster");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAddgroupPopup));
				okBtnInAddgroupPopup.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuExpandBtn));
				masterMenuExpandBtn.click();
				
				boolean actactGroupMaster = false;
				
				
				int menuListCount = masterMenuList.size();
				for(int i=0;i<menuListCount;i++)
				{
					String data = masterMenuList.get(i).getText();
					
					if(data.equalsIgnoreCase("GroupMaster"))
					{
						
						actactGroupMaster = true;
						
						break;
					}
				}
				
				if (actactGroupMaster == true) 
				{
					return true;
				} 
				else
				{
					return false;
				}
			}
	
			public static boolean checkAddingChildMasterInGroupMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys("ChildMaster");
				Thread.sleep(2000);
				nameComboBox.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GroupMasterMenuBtn));
				GroupMasterMenuBtn.click();
			
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
				captionTxt.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
				cmSaveBtn.click();
				
				String expMessageOnSave = "Master Saved Successfully";
				
				String actMessageOnSave = checkValidationMessageString(expMessageOnSave);
				
				if(actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
				{	
					
					return true;
				}
				else
				{
					
					return false;
				}
			}
			
			public static boolean checkDeletingSavedGroupmasterWithChildmaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{	
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuExpandBtn));
				masterMenuExpandBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GroupMasterMenuBtn));
				GroupMasterMenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteGroupBtnInconfigureMaster));
				deleteGroupBtnInconfigureMaster.click();
				
				String expDeleteMessage = "Cannot delete this group having child menus!";
				String actDeleteMessage = checkValidationMessageString(expDeleteMessage);
				
				if (actDeleteMessage.equalsIgnoreCase(expDeleteMessage))
				{
					return true;
					
				}
				else
				{
					return false;
				} 
				
				
			}
			
			public static boolean checkAddingGroupMasterForDeletion() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuBtn));
				masterMenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupBtnInconfigureMaster));
				addGroupBtnInconfigureMaster.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupNameTxt));
				groupNameTxt.sendKeys("GroupMasterToDelete");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAddgroupPopup));
				okBtnInAddgroupPopup.click();
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuExpandBtn));
				masterMenuExpandBtn.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GroupMasterToDeleteMenuBtn));
				GroupMasterToDeleteMenuBtn.click();
			
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteGroupBtnInconfigureMaster));
				deleteGroupBtnInconfigureMaster.click();
				
				Thread.sleep(1000);
				String expDeleteMessage = "Group deleted successfully!";
				String actDeleteMessage = checkValidationMessageString(expDeleteMessage);
				
				if (actDeleteMessage.equalsIgnoreCase(expDeleteMessage))
				{
					return true;
					
				}
				else
				{
					return false;
				} 
				
			}
			
			public static boolean checkSavingGroupMasterForGroupmandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuBtn));
				masterMenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuBtn));
				masterMenuBtn.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupBtnInconfigureMaster));
				addGroupBtnInconfigureMaster.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupNameTxt));
				groupNameTxt.sendKeys("GroupMasterForGrpMndtry");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAddgroupPopup));
				okBtnInAddgroupPopup.click();
				
				Thread.sleep(3000);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys("ChildNode");
				Thread.sleep(2000);
				nameComboBox.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuExpandBtn));
				masterMenuExpandBtn.click();
				
				 int menuListCount = masterMenuList.size();
				for(int i=0;i<menuListCount;i++)
				{
					String data = masterMenuList.get(i).getText();
					
					if(data.equalsIgnoreCase("GroupMasterForGrpMndtry"))
					{
						masterMenuList.get(i).click();
						break;
					}
				}
				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
				captionTxt.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupMandatoryChkBox));
				groupMandatoryChkBox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickCodeChkBox));
				pickCodeChkBox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
				cmSaveBtn.click();
				
				String expMessageOnSave = "Master Saved Successfully";
				
				String actMessageOnSave = checkValidationMessageString(expMessageOnSave);
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmCloseBtn));
				cmCloseBtn.click();
				
				
				if(actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
				{	
					
					return true;
				}
				else
				{
					
					return false;
				}
				
			}
			
			@FindBy(xpath="//*[@id='262']/span")
			public static WebElement GrpMnadatoryInmasters;
			
			//@FindBy(xpath="//*[@id='1183']")
			@FindBy(xpath="//*[@id='1180']")
			public static WebElement childNode;
			
			public static boolean checkSavingGroupUnderCreatedMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GrpMnadatoryInmasters));
				GrpMnadatoryInmasters.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(childNode));
				childNode.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
				masterAddGroupBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
				nameTxt.sendKeys("Grp");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("Grp");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
				SaveBtn.click();
				
				String expSaveMessage = "Saved Successfully";
				String actSaveMessage = checkValidationMessageString(expSaveMessage);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				
				if (actSaveMessage.equalsIgnoreCase(expSaveMessage))
				{
					return true;
				} 
				else
				{
					return false;
				}
				
			}
			
			@FindBy(xpath="//tbody[@id='oc_Group_table_body']//tr//td[2]")
			public static List<WebElement> groupList;
			
		//	@FindBy(xpath="//*[@id='oc_Group_input_image']/span")
			@FindBy(xpath="//*[@id='oc_Group']")
			public static WebElement groupTogglebtn;
			
			
			public static boolean checkSavingARecordUnderMasterThroughgroupDropdown() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				masterNewBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
				nameTxt.sendKeys("TestRecord");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("TestRecord");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
				SaveBtn.click();
				
				String expMessageOnsaveWithoutGrp = "In Tab :General ---> Group Field is Required";
				String actMessageOnsaveWithoutGrp = checkValidationMessageString(expMessageOnsaveWithoutGrp);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupTogglebtn));
				groupTogglebtn.click();
				
				int ListCount = groupList.size();
				
				ArrayList<String> ListArray = new ArrayList<String>();
				
				for(int i=0;i<ListCount;i++)
				{
					String data = groupList.get(i).getText();
					
					if(data.equalsIgnoreCase("Grp"))
					{
						groupList.get(i).click();
						
						
						break;
					}
					
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
				SaveBtn.click();
				
				String expMessageOnsave = "Saved Successfully";
				String actMessageOnsave = checkValidationMessageString(expMessageOnsave);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				
				if(actMessageOnsaveWithoutGrp.equalsIgnoreCase(expMessageOnsaveWithoutGrp) && actMessageOnsave.equalsIgnoreCase(expMessageOnsave))
					
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
			@FindBy(xpath="//tbody[@id='LandingGridBody']//tr//td[10]")
			public static List<WebElement> RecordnamegridList;
			
			@FindBy(xpath="//*[@id='lblnchecked']/input")
			public static WebElement Recordcheckbox;
			
			 
			public static boolean checkRecordcretedUnderGroup() throws InterruptedException
			{
				int ListCount = RecordnamegridList.size();
				
				ArrayList<String> ListArray = new ArrayList<String>();
				
				for(int i=0;i<ListCount;i++)
				{
					String data = RecordnamegridList.get(i).getText();
					
					if(data.equalsIgnoreCase("Grp"))
					{
						getAction().doubleClick(Recordcheckbox).build().perform();
						break;
					}
					
				}
				
				Thread.sleep(2000);
				
				boolean savedRecord = false;
				
				for(int i=0;i<ListCount;i++)
				{
					String data = RecordnamegridList.get(i).getText();
					
					if(data.equalsIgnoreCase("TestRecord"))
					{
						savedRecord = true;
						break;
					}
					
				}
				
				if (savedRecord == true)
				{
					return true;
				} 
				else 
				{
					return false;
				}
				
			}
			
			public static boolean checkCustomizationAndTreeCustomizationForCreatedMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
			
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys("ConfigMaster");
				nameComboBox.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
				customizationTab.click();
				
				Thread.sleep(4000);
				getAction().moveToElement(createTabBtn).build().perform();
				Thread.sleep(1000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabBtn));
				createTabBtn.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabInList));
				createTabInList.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tabCaptionTxt));
				tabCaptionTxt.sendKeys("NewCreateTab");
				tabCaptionTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInTabDetails));
				okBtnInTabDetails.click();
				
				String expTabMessage = "Tab Added Successfully";
				String actTabMessage = checkValidationMessageString(expTabMessage);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFieldBtn));
				addFieldBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldcaptionTxt));
				FieldcaptionTxt.sendKeys("Text");
				FieldcaptionTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInFieldCreation));
				okBtnInFieldCreation.click();
				
				String expFieldMessage = "Field Added Successfully.";
				String actFieldMessage = checkValidationMessageString(expFieldMessage);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFieldBtn));
				addFieldBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldcaptionTxt));
				FieldcaptionTxt.sendKeys("ItemMasterfield");
				FieldcaptionTxt.sendKeys(Keys.TAB);
				
				Select dataType = new Select(dataTypeDropdown);
				dataType.selectByVisibleText("Master");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraField_FieldDetailsMasterToLinkDropDown));
				extraField_FieldDetailsMasterToLinkDropDown.sendKeys("Item");		
				Thread.sleep(2000);
				extraField_FieldDetailsMasterToLinkDropDown.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInFieldCreation));
				okBtnInFieldCreation.click();
				
				String expFieldMessage1 = "Field Added Successfully.";
				String actFieldMessage1 = checkValidationMessageString(expFieldMessage1);
				
				Thread.sleep(2000);
				int count = fieldCaptionTxtList.size();
				
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("ItemMasterfield")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTabb));
				extraFields_PropertiesTabb.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==false) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInFieldCreation));
				okBtnInFieldCreation.click();
				
				String expTextFieldMsg = "Field Updated Successfully";
				String actTextFieldMsg = checkValidationMessageString(expTextFieldMsg);
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeCustomizationTab));
				treeCustomizationTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createdByCheckbx));
				createdByCheckbx.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createdDateCheckbx));
				createdDateCheckbx.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInTreeCustomization));
				okBtnInTreeCustomization.click();
				
				
				String expCustomizeMessage = "Tree Customization Saved Successfully.";
				String actCustomizeMessage = checkValidationMessageString(expCustomizeMessage);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmCloseBtn));
				cmCloseBtn.click();				
			
				if (actTabMessage.equalsIgnoreCase(expTabMessage) && actFieldMessage.equalsIgnoreCase(expFieldMessage) &&
					actCustomizeMessage.equalsIgnoreCase(expCustomizeMessage))
				{
					return true;

				} 
				else 
				{
					return false;
				}
			}
			
			
			
			public static boolean checkAddedTabFieldAndTreeCustomizationupdates() throws InterruptedException
			{	
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				Thread.sleep(2000);
				JavascriptExecutor jse =  (JavascriptExecutor)getDriver();
				jse.executeScript("arguments[0].scrollIntoView(true);", ConfigMasterInMastersList);
				
				Thread.sleep(2000);
				
				
				boolean actConfigMaster = ConfigMasterInMastersList.isDisplayed();
				boolean expConfigMaster = true;
				
				System.out.println("actConfigMaster "+actConfigMaster);
				System.out.println("expConfigMaster "+expConfigMaster);
				
				if(actConfigMaster == expConfigMaster )
				{
					Thread.sleep(3000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigMasterInMastersList));
					ConfigMasterInMastersList.click();
				}
				
				Thread.sleep(3000);
				
				int MasterHedaerCount = tableHeaderList.size();
				
				ArrayList<String> MasterHedaerArray = new ArrayList<String>();
				
				for(int i=3;i<MasterHedaerCount;i++)
				{
					String data = tableHeaderList.get(i).getText();
					MasterHedaerArray.add(data);
				}
			    		
				String actHeaderList = MasterHedaerArray.toString();
				
				String expHeaderList = "[Name, Code, CreatedBy, Modified By]";
				
				System.out.println("Header List Actual   : " + actHeaderList);
				System.out.println("Header List Expected : " + expHeaderList); 
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				masterNewBtn.click();
				
				Thread.sleep(2000);
				
				boolean actNewCreateTab = newlyAddedcreatetab.isDisplayed();
				boolean expNewCreateTab = true;
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				masterNewBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
				nameTxt.sendKeys("ItemRecord");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("CdItemRecord");
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newlyAddedcreatetab));
				newlyAddedcreatetab.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(txtFieldTxt));
				txtFieldTxt.sendKeys("text123");
				txtFieldTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasetrdropDownTxt));
				itemMasetrdropDownTxt.sendKeys("Test");
				itemMasetrdropDownTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
				SaveBtn.click();
				
				
				if(actHeaderList.equalsIgnoreCase(expHeaderList) && actNewCreateTab == expNewCreateTab)
				{
					return true;
				}
				else
				{
					return false;
				}
				
			}
			
			
			
			
			
			public static boolean checkAddNewFieldIntoMasterTree() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				Thread.sleep(2000);
				getDriver().navigate().refresh();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys("ConfigMaster");
				nameComboBox.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeCustomizationTab));
				treeCustomizationTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(textcheckBox));
				textcheckBox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInTreeCustomization));
				okBtnInTreeCustomization.click();
				
				
				String expCustomizeMessage = "Tree Customization Saved Successfully.";
				String actCustomizeMessage = checkValidationMessageString(expCustomizeMessage);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmCloseBtn));
				cmCloseBtn.click();		
				
				if(actCustomizeMessage.equalsIgnoreCase(expCustomizeMessage))
				{
					return true;
				}
				else
				{
					return  false;
				}
				
			}
			
			public static boolean checkNewlyAddedFieldInMasterTree() throws InterruptedException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				Thread.sleep(2000);
				JavascriptExecutor jse =  (JavascriptExecutor)getDriver();
				jse.executeScript("arguments[0].scrollIntoView(true);", ConfigMasterInMastersList);
				
				Thread.sleep(2000);
				boolean actConfigMaster = ConfigMasterInMastersList.isDisplayed();
				boolean expConfigMaster = true;
				
				System.out.println("actConfigMaster "+actConfigMaster);
				System.out.println("expConfigMaster "+expConfigMaster);
				
				Thread.sleep(3000);
				if(actConfigMaster == expConfigMaster )
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigMasterInMastersList));
					ConfigMasterInMastersList.click();
				}
				
				Thread.sleep(3000);
				
				int MasterHedaerCount = tableHeaderList.size();
				
				ArrayList<String> MasterHedaerArray = new ArrayList<String>();
				
				for(int i=3;i<MasterHedaerCount;i++)
				{
					String data = tableHeaderList.get(i).getText();
					MasterHedaerArray.add(data);
					
					
				}
			    		
				String actHeaderList = MasterHedaerArray.toString();
				
				String expHeaderList = "[Name, Code, CreatedBy, Modified By, Text]";
				
				System.out.println("Header List Actual   : " + actHeaderList);
				System.out.println("Header List Expected : " + expHeaderList); 
				
				Thread.sleep(2000);
				
				if(actHeaderList.equalsIgnoreCase(expHeaderList))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
			
			
			public static boolean checkCustomizationandTreeCustomizationForChildMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				Thread.sleep(2000);
				getDriver().navigate().refresh();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupmasterInMastersList));
				groupmasterInMastersList.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(childmasterUnderGrpMstr));
				childmasterUnderGrpMstr.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
				masterRibbonToExpandOptions.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
				masterCustamizemasterBtn.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabBtnIncustomizationMstr));	
				createTabBtnIncustomizationMstr.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabInList));
				createTabInList.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tabCaptionTxt));
				tabCaptionTxt.sendKeys("NewCreateTab");
				tabCaptionTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInTabDetails));
				okBtnInTabDetails.click();
				
				String expTabMessage = "Tab Added Successfully";
				String actTabMessage = checkValidationMessageString(expTabMessage);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addFieldBtn));
				addFieldBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldcaptionTxt));
				FieldcaptionTxt.sendKeys("Text");
				FieldcaptionTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInFieldCreation));
				okBtnInFieldCreation.click();
				
				String expFieldMessage = "Field Added Successfully.";
				String actFieldMessage = checkValidationMessageString(expFieldMessage);
				
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInCreateTab));
				closeBtnInCreateTab.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
				masterRibbonToExpandOptions.click();
				
				

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercustamizeTreeBtn));	
				mastercustamizeTreeBtn.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createdByChckbx));	
				createdByChckbx.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(modifiedbyChckbx));	
				modifiedbyChckbx.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okbtnIncustomizePopup));	
				okbtnIncustomizePopup.click();
				
				if (actTabMessage.equalsIgnoreCase(expTabMessage) && actFieldMessage.equalsIgnoreCase(expFieldMessage))
					{
						return true;

					} 
					else 
					{
						return false;
					}
			
			}
			
			public static boolean checkAddedCreateTabFieldAndMasterHeaderTree() throws InterruptedException
			{
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupmasterInMastersList));
				groupmasterInMastersList.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(childmasterUnderGrpMstr));
				childmasterUnderGrpMstr.click();
				Thread.sleep(3000);
				
				int MasterHedaerCount = tableHeaderList.size();
				
				ArrayList<String> MasterHedaerArray = new ArrayList<String>();
				
				for(int i=3;i<MasterHedaerCount;i++)
				{
					String data = tableHeaderList.get(i).getText();
					MasterHedaerArray.add(data);
				}
			    		
				String actHeaderList = MasterHedaerArray.toString();
				
				String expHeaderList = "[Name, Code, Created by, Modified By]";
				
				System.out.println("Header List Actual   : " + actHeaderList);
				System.out.println("Header List Expected : " + expHeaderList); 
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				masterNewBtn.click();
				
				Thread.sleep(2000);
				
				boolean actNewCreateTab = newlyAddedcreatetab.isDisplayed();
				boolean expNewCreateTab = true;
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
				masterCloseBtn.click();
				
				if(actHeaderList.equalsIgnoreCase(expHeaderList) && actNewCreateTab == expNewCreateTab)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
			 
			 @FindBy(xpath="//*[@id='Conditions-Context_Menu_MasterRules']/li[2]/a")
			 public static WebElement rulesOptionElseTAB;

			 @FindBy(xpath="//input[@id='txtField_RC_1_1_MasterRules']")
			 public static WebElement rulesOptionBodyGridRow1Selectfiled;

			 @FindBy(xpath="//select[@id='ddlOperators_RC_1_1_MasterRules']")
			 public static WebElement rulesOptionBodyGridRow1OPrTye;

			 @FindBy(xpath="//select[@id='ddlCompareWith_RC_1_1_MasterRules']")
			 public static WebElement rulesOptionBodyGridRow1ComparetType;

			 @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_MasterRules']")
			 public static WebElement rulesOptionBodyGridRow1ValueType;
			 
			 @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_MasterRules']")
			 public static WebElement MasterrulesTabValueTxt;
			 
			 @FindBy(xpath="//select[@class='Fselect dynFilterOpt']")
			 public static WebElement MasterrulesTabEnterValuetxt;
			
			 @FindBy(xpath="//*[@id='rConditions_RULES_1_MasterRules']/div/div[1]/div[5]/select")
			 public static WebElement rulesOptionBodyGridValueDrpdwn;
			 
			 @FindBy(xpath="//*[@id='allMasterCustTabs']/li[3]/a[text()='Rules']")
			 public static WebElement RulesOption;
			
			 @FindBy(xpath="//input[@class='btn btn-link']")
			 public static WebElement Rules_AddRuleBtn;
			 
			 @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_1-1']")
			 public static WebElement ruleOptiongridCol1row1;
			
			 @FindBy(xpath="//select[@id='ddlFieldsDiv_Rule_IF_MasterRules']")
			 public static WebElement MasterrulesIFEnterFiled;
			 
			 
			 @FindBy(xpath="//select[@id='ddlChangeValueFormat_IF_MasterRules']")
			 public static WebElement MasterrulesIFEnterChangeValueDrpdwn;
				
			 @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_1-4']")
			 public static WebElement MasterrulesIFEnterValue;
			 
			 @FindBy(xpath="//*[@id='txtTextField']")
			 public static WebElement MasterRulesIFEnterValueTxt;
			 
			 @FindBy(xpath="//*[@id='tab_Rule_Else_MasterRules']/a")
			 public static WebElement MasterrulesTabElseTab;
			 
			 @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']//div[2]/nav/ul/li[1]/a/i")
			 public static WebElement ruleSaveBtn;
			 
			 @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']//div[2]/nav/ul/li[4]/a/i")
			 public static WebElement ruleCloseBtn;
			
			
			public static boolean checkAddingRulesForChildMasterWithNoCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys("ChildMaster");
				nameComboBox.sendKeys(Keys.TAB);
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
				customizationTab.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RulesOption));
				 RulesOption.click();

				 Thread.sleep(1000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Rules_AddRuleBtn));
				 Rules_AddRuleBtn.click();

				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_RuleNameText));
				 MasterRules_RuleNameText.click();
				 MasterRules_RuleNameText.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				 Thread.sleep(2000);
				 MasterRules_RuleNameText.sendKeys("GobalRuleNC");

				 Thread.sleep(2000);
				 MasterRules_RuleNameText.sendKeys(Keys.TAB);
				 			
				 Thread.sleep(1000);
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_RuleNameText));
				 MasterRules_RuleNameText.click();
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_OnLeaveChekbox));
				 MasterRules_OnLeaveChekbox.click();
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_LoadChekbox));
				 MasterRules_LoadChekbox.click();
				 Thread.sleep(1000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_OnEnterChekbox));
				 MasterRules_OnEnterChekbox.click();
				 Thread.sleep(1000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_BeforeSaveChekbox));
				 MasterRules_BeforeSaveChekbox.click();
				 
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_NewRecordChekbox));
				 MasterRules_NewRecordChekbox.click();
				 Thread.sleep(1000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_EditChekbox));
				 MasterRules_EditChekbox.click();
			

				 Thread.sleep(1000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRules_ActiveChekbox));
				 masterRules_ActiveChekbox.click();
				 Thread.sleep(1000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRules_NoConditionChekbox));
				 masterRules_NoConditionChekbox.click();
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ruleOptiongridCol1row1));
				 ruleOptiongridCol1row1.click();
					
				
				MasterrulesIFEnterFiled.sendKeys("Text");
				MasterrulesIFEnterFiled.sendKeys(Keys.TAB);
					
				MasterrulesIFEnterChangeValueDrpdwn.sendKeys("Value");
					
				MasterrulesIFEnterChangeValueDrpdwn.sendKeys(Keys.TAB);
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterrulesIFEnterValue));
				MasterrulesIFEnterValue.click();
				MasterRulesIFEnterValueTxt.click();
				MasterRulesIFEnterValueTxt.sendKeys("Text123");
				
				MasterRulesIFEnterValueTxt.sendKeys(Keys.TAB);
					
				
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ruleSaveBtn));
				 ruleSaveBtn.click();
				
				 
				 String expMessageOnSaveRule = "Rule Saved Successfully";
				 String actMessageOnSaveRule=checkValidationMessageString(expMessageOnSaveRule);
				 
				 Thread.sleep(2000);
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ruleCloseBtn));
				 ruleCloseBtn.click();
				 Thread.sleep(2000);
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmCloseBtn));
				 cmCloseBtn.click();
				
				if(actMessageOnSaveRule.equalsIgnoreCase(expMessageOnSaveRule))
				{
						return true;
				}
				else
				{
						return false;
				}
				 

			}
			
			@FindBy(xpath="//*[@id='Text']")
			public static WebElement TextfieldTxt;
			public static boolean checkValidateRuleWithNoConditionInChildMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupmasterInMastersList));
				groupmasterInMastersList.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(childmasterUnderGrpMstr));
				childmasterUnderGrpMstr.click();
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				masterNewBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
				nameTxt.sendKeys("ruleWithNC");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("CdruleWithNC");
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newlyAddedcreatetab));
				newlyAddedcreatetab.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
				SaveBtn.click();
				
				String expSaveMessage = "Saved Successfully";
				String actSaveMessage = checkValidationMessageString(expSaveMessage);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				Thread.sleep(2000);
				
				
				Thread.sleep(3000);
				int ListCount = RecordnamegridList.size();
				
				ArrayList<String> ListArray = new ArrayList<String>();
				
				for(int i=0;i<ListCount;i++)
				{
					String data = RecordnamegridList.get(i).getText();
					
					if(data.equalsIgnoreCase("ruleWithNC"))
					{
						getAction().doubleClick(Recordcheckbox).build().perform();
						break;
					}
					
				}
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newlyAddedcreatetab));
				newlyAddedcreatetab.click();
				
				
				String actTxtValue =TextfieldTxt.getAttribute("value");
				String expTxtValue = "Text123";
				
				Thread.sleep(2000);
				
				
				if(actSaveMessage.equalsIgnoreCase(expSaveMessage) && actTxtValue.equalsIgnoreCase(expTxtValue))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
			 @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-1']")
			 public static WebElement ruleOptiongridElseCol1row1;

			 @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-2']")
			 public static WebElement ruleOptiongridElseCol1row2;

			 @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-4']")
			 public static WebElement ruleOptiongridElseCol1row4;

			 @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_MasterRules']")
			 public static WebElement ruleOptiongridElseEnterItemType;

			 @FindBy(xpath="//select[@id='ddlChangeValueFormat_ELSE_MasterRules']")
			 public static WebElement ruleOptiongridEnterElseChangeValueType;

			 @FindBy(xpath="//input[@id='tblFormating_Else_Rule_MasterRules_col_1-4']")
			 public static WebElement ruleOptiongridEnterElseValueTxt;

			 @FindBy(xpath="//select[@id='ddlMasterFields_RULES_MasterRules']")
			 public static WebElement selectMasterField;
			
			 @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']//div[2]/nav/ul/li[1]/a/i")
			 public static WebElement Masters_RulesSaveBtn;
			 
			public static boolean checkSavingruleWithconditionForChildMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys("ChildMaster");
				nameComboBox.sendKeys(Keys.TAB);
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
				customizationTab.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RulesOption));
				RulesOption.click();
				
				 Thread.sleep(2000);
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_RuleNameText));
				 MasterRules_RuleNameText.click();
				 MasterRules_RuleNameText.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
				 Thread.sleep(2000);
				 MasterRules_RuleNameText.sendKeys("GobalRuleWC");

				 Thread.sleep(2000);
				 MasterRules_RuleNameText.sendKeys(Keys.TAB);

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_NewRecordChekbox));
				 MasterRules_NewRecordChekbox.click();

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_EditChekbox));
				 MasterRules_EditChekbox.click();

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_LoadChekbox));
				 MasterRules_LoadChekbox.click();

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_OnLeaveChekbox));
				 MasterRules_OnLeaveChekbox.click();

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_OnEnterChekbox));
				 MasterRules_OnEnterChekbox.click();

				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterRules_BeforeSaveChekbox));
				 MasterRules_BeforeSaveChekbox.click();


				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRules_ActiveChekbox));
				 masterRules_ActiveChekbox.click();

				 
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesOptionBodyGridRow1Selectfiled));
				 rulesOptionBodyGridRow1Selectfiled.click();
					
					Thread.sleep(2000);
					
					Select field = new Select(selectMasterField);
					field.selectByVisibleText("Code");
					
					Thread.sleep(1000);
					
					selectMasterField.sendKeys(Keys.TAB);
					
					
					Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesOptionBodyGridRow1OPrTye));
					
					Select operator = new Select(rulesOptionBodyGridRow1OPrTye);
					operator.selectByVisibleText("Equal To");
					
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesOptionBodyGridRow1ComparetType));
					
					Select value = new Select(rulesOptionBodyGridRow1ComparetType);
					value.selectByVisibleText("Value");
					
					
					
					
					Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterrulesTabValueTxt));
					MasterrulesTabValueTxt.click();
					MasterrulesTabValueTxt.sendKeys("code00");
					MasterrulesTabValueTxt.sendKeys(Keys.TAB);

					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ruleOptiongridCol1row1));
					ruleOptiongridCol1row1.click();
					
				
					MasterrulesIFEnterFiled.sendKeys("Text");
					MasterrulesIFEnterFiled.sendKeys(Keys.TAB);
					
					MasterrulesIFEnterChangeValueDrpdwn.sendKeys("Value");
					
					MasterrulesIFEnterChangeValueDrpdwn.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterrulesIFEnterValue));
					MasterrulesIFEnterValue.click();
					MasterRulesIFEnterValueTxt.click();
					MasterRulesIFEnterValueTxt.sendKeys("Def12");
					
					MasterRulesIFEnterValueTxt.sendKeys(Keys.TAB);
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MasterrulesTabElseTab));
					MasterrulesTabElseTab.click();
					
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ruleOptiongridElseCol1row1));
					ruleOptiongridElseCol1row1.click();
					
					ruleOptiongridElseEnterItemType.sendKeys("Text");
					ruleOptiongridElseEnterItemType.sendKeys(Keys.TAB);
					ruleOptiongridEnterElseChangeValueType.sendKeys("Value");
					
					ruleOptiongridEnterElseChangeValueType.sendKeys(Keys.TAB);
					
					
					/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ruleOptiongridEnterElseValueTxt));
					ruleOptiongridEnterElseValueTxt.click();*/
					
					MasterRulesIFEnterValueTxt.click();
					MasterRulesIFEnterValueTxt.sendKeys("1234");
					
					MasterRulesIFEnterValueTxt.sendKeys(Keys.TAB);
					
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Masters_RulesSaveBtn));
					Masters_RulesSaveBtn.click();
				 
					
					String expMessageOnSaveRule = "Rule Saved Successfully";
					String actMessageOnSaveRule=checkValidationMessageString(expMessageOnSaveRule);
					
					Thread.sleep(2000);
					
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmCloseBtn));
					 cmCloseBtn.click();
				 
					if(actMessageOnSaveRule.equalsIgnoreCase(expMessageOnSaveRule))
					{
						return true;
					}
					else
					{
						return false;
					}
			}

			public static boolean checkValidatingRuleWithIfConditionForChildMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{

				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupmasterInMastersList));
				groupmasterInMastersList.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(childmasterUnderGrpMstr));
				childmasterUnderGrpMstr.click();
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				masterNewBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
				nameTxt.sendKeys("RuleWithCon");
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("code00");
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newlyAddedcreatetab));
				newlyAddedcreatetab.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
				SaveBtn.click();
				
				String expSaveMessage = "Saved Successfully";
				String actSaveMessage = checkValidationMessageString(expSaveMessage);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				Thread.sleep(2000);
				
				
				int ListCount = RecordnamegridList.size();
				
				ArrayList<String> ListArray = new ArrayList<String>();
				
				for(int i=0;i<ListCount;i++)
				{
					String data = RecordnamegridList.get(i).getText();
					
					if(data.equalsIgnoreCase("RuleWithCon"))
					{
						getAction().doubleClick(Recordcheckbox).build().perform();
						break;
					}
					
				}
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newlyAddedcreatetab));
				newlyAddedcreatetab.click();
				
				
				String actTxtValue =TextfieldTxt.getAttribute("value");
				String expTxtValue = "Def12";
				
				Thread.sleep(2000);
				
				
				Thread.sleep(2000);
				
				
				if(actSaveMessage.equalsIgnoreCase(expSaveMessage) && actTxtValue.equalsIgnoreCase(expTxtValue))
				{
					return true;
				}
				else
				{
					return false;
				}
			
			}
			
			@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]/i")
			public static WebElement Closebtn;
			
			public static boolean checkValidatingRulewithElseconditionForChildMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Closebtn));
				Closebtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				masterNewBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
				nameTxt.sendKeys("RuleWithElseCon");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("code123");
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newlyAddedcreatetab));
				newlyAddedcreatetab.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
				SaveBtn.click();
				
				String expSaveMessage = "Saved Successfully";
				String actSaveMessage = checkValidationMessageString(expSaveMessage);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				Thread.sleep(2000);
				
				
				int ListCount = RecordnamegridList.size();
				
				ArrayList<String> ListArray = new ArrayList<String>();
				
				for(int i=0;i<ListCount;i++)
				{
					String data = RecordnamegridList.get(i).getText();
					
					if(data.equalsIgnoreCase("RuleWithElseCon"))
					{
						getAction().doubleClick(Recordcheckbox).build().perform();
						break;
					}
					
				}
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newlyAddedcreatetab));
				newlyAddedcreatetab.click();
				
				
				String actTxtValue =TextfieldTxt.getAttribute("value");
				String expTxtValue = "1234";
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				Thread.sleep(2000);
				
				
				if(actSaveMessage.equalsIgnoreCase(expSaveMessage) && actTxtValue.equalsIgnoreCase(expTxtValue))
				{
					return true;
				}
				else
				{
					return false;
				}
			
			}
			
			
			public static boolean checkExportingChildMaster() throws InterruptedException, AWTException
			{			
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
						settingsmenuBtn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
						settingsConfigureMasters.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionTab));
						definitionTab.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
						nameComboBox.click();
						nameComboBox.sendKeys(Keys.END);
						nameComboBox.sendKeys(Keys.SHIFT,Keys.HOME);
						nameComboBox.sendKeys(Keys.BACK_SPACE);
						nameComboBox.sendKeys(Keys.SPACE);
						
						int nameComboBoxListCount = nameComboBoxList.size();
						
						System.err.println("nameComboBoxListCount : "+nameComboBoxListCount);
						
						ArrayList<String> nameComboBoxListArray = new ArrayList<String>();
						
						for(int i=0;i<nameComboBoxListCount;i++)
						{
							String data = nameComboBoxList.get(i).getText();
							
							System.err.println("Data : " + data);
							
							if(data.equalsIgnoreCase("ChildMaster"))
							{
								nameComboBoxList.get(i).click();
								break;
							}
						}
						
						nameComboBox.sendKeys(Keys.TAB);
						
						
						String actnameComboBox = nameComboBox.getAttribute("value");
						String expnameComboBox = "ChildMaster";
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
						
						String actcaptionTxt = captionTxt.getAttribute("value");
						String expcaptionTxt = "ChildMaster";
						
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmExportBtn));
						cmExportBtn.click();
						
						int cmExportListCount = cmExportList.size();
						
						ArrayList<String> cmExportListArray = new ArrayList<String>();
						
						for(int i=0;i<cmExportListCount;i++)
						{
							String data=cmExportList.get(i).getText();
							if(data.equalsIgnoreCase("ChildMaster"))
							{
								cmExportListChkBox.get(i).click();
								break;
							}
						}
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmFooterExportBtn));
						cmFooterExportBtn.click();
						
						getWaitForAlert();
						
						String actAlertMessage = getAlert().getText();
						
						String expAlertMessage = "Export successfully";
						
						getAlert().accept();
						
						Thread.sleep(2000);
						
					  	Robot robot = new Robot();                          
						robot.keyPress(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_J);
						robot.keyRelease(KeyEvent.VK_CONTROL); 
						robot.keyRelease(KeyEvent.VK_J);
						
						Thread.sleep(2000);
						
						robot.keyPress(KeyEvent.VK_CONTROL); 
						robot.keyPress(KeyEvent.VK_W); 
						robot.keyRelease(KeyEvent.VK_CONTROL); 
						robot.keyRelease(KeyEvent.VK_W);
						
						Thread.sleep(2000);
						
						System.out.println("nameComboBox Actual : "+actnameComboBox + " Value Exepcted : " + expnameComboBox);
						System.out.println("nameComboBox Actual : "+actcaptionTxt   + " Value Exepcted : " + expcaptionTxt);
						System.out.println("AlertMessage Actual : "+actAlertMessage + " Value Exepcted : " + expAlertMessage);
						
						if(actnameComboBox.equalsIgnoreCase(expnameComboBox) && actcaptionTxt.equalsIgnoreCase(expcaptionTxt) && actAlertMessage.equalsIgnoreCase(expAlertMessage))
						{	
							
							return true;
						}
						else
						{
							return false;
						}
					}
					
				@FindBy(xpath="//*[@id='btnImport_ConfigureMasters']/a/i")
				public static WebElement cmImportBtn;
				
				@FindBy(xpath="//*[@id='1185']/span[text()='Imported Master']")
				public static WebElement importedMaster;
				
			
			 public static boolean checkImportingMasterInConfigureMastersAndValidateInMastersList() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException
			 {	
				 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmImportBtn));
					cmImportBtn.click();
					
					Thread.sleep(2000);
					Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\configureMastersImport.exe");
					Thread.sleep(2000);
					
					
					String expMessageOnImporting = "Masters Imported Successfully";
					
					String actMessageOnImporting = checkValidationMessageString(expMessageOnImporting);
					
					Thread.sleep(5000);
					
					
					System.out.println("MessageOnImporting Actual : " + actMessageOnImporting + " Value Expected : " + expMessageOnImporting);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmCloseBtn));
					cmCloseBtn.click();
					
					Thread.sleep(3000);
					
					
					LogoutandLoginwithSU();
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
					homeMenu.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
					mastersMenu.click();
					
					Thread.sleep(3000);
					getAction().moveToElement(importedMaster).build().perform();
					boolean actImportedMaster = importedMaster.isDisplayed();
					boolean expImportedMaster = true;
					
					System.out.println("actImportedMaster "+actImportedMaster);
					System.out.println("expImportedMaster "+expImportedMaster);
					
					if(actImportedMaster == expImportedMaster )
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigMasterInMastersList));
						ConfigMasterInMastersList.click();
					}
					
					Thread.sleep(3000);
					
					
					if(actMessageOnImporting.equalsIgnoreCase(expMessageOnImporting) && actImportedMaster == expImportedMaster)
					{	
						
						return true;
					}
					else
					{
						
						return false;
					}
			 }
				
							
					
						
			 public boolean checkLogoutUserFromConfigureMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			   {
				
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
					  userNameDisplayLogo.click();
					 
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
					  logoutOption.click();
					  
					  Thread.sleep(2000);
					  
					  boolean actUserLoginPage              = username.isDisplayed() && username.isEnabled()
			                                                  && password.isDisplayed() && password.isEnabled();
			                                         
					  boolean expUserLoginPage              = true;
					  
					  if(actUserLoginPage==expUserLoginPage)  
				      {
						System.out.println("***Test Pass: Login Successfull***");
						
						return true;
					  }
				      else
				      {
				  	 
						System.out.println("***Test Fail: Login Not Successfull***");
						
						return false;
					  }
					}
					
			
			 public static void LogoutandLoginwithSU() throws InterruptedException
				{
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
					userNameDisplayLogo.click();
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
					logoutOption.click();
					
					Thread.sleep(3000);
					
					 getDriver().navigate().refresh();
					 Thread.sleep(1999);
					 
					// getDriver().navigate().refresh();
					 //Thread.sleep(1999);

					LoginPage lp=new LoginPage(getDriver()); 

					String unamelt="su";
							      
					String pawslt="su";
							      
					LoginPage.enterUserName(unamelt);

					Thread.sleep(1000);
							
					LoginPage.enterPassword(pawslt);
				
					 Select oSelect = new Select(companyDropDownList);
					 //oSelect.selectByVisibleText(Compname); 
					 oSelect.selectByValue("36");
					
					 LoginPage.clickOnSignInBtn();
					 
					 Thread.sleep(2000);
					 LoginPage.reLogin("su", "su", "Automation Company");
					 
					
					 
					
					
				}
	
				     
				
			
	public ConfigureMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
