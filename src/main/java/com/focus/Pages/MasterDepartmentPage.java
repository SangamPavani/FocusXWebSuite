package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.focus.base.BaseEngine;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.focus.base.BaseEngine;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;

public class MasterDepartmentPage extends BaseEngine
{
	
	
	
		 //Department Menu	
		
	 
			//Department Title
			@FindBy (xpath="//span[@id='spnHeaderText']")
			public static WebElement accountsTitle;
			
			@FindBy (xpath="//div[@class='navText']//span[contains(text(),'Unit Conversion')]")
			public static WebElement unitsConversionTitle;		
		    
		  
			@FindBy(xpath="//*[@id='btnCloseAccount']")
			public static WebElement masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity; 
	
			
	
			@FindBy(xpath="//*[@id='btnAdvImportForMaster']")
			public static WebElement masterAdvanceMasterImportORExportBtn; 
	
			@FindBy(xpath="//*[@id='btnAuthInfo']")
			public static WebElement masterAuthorInfoBtn; 
	
			@FindBy(xpath="//*[@id='btnMoveUp']")
			public static WebElement masterMoveUpBtn; 
	
			@FindBy(xpath="//*[@id='btnMOveDown']")
			public static WebElement masterMoveDownBtn; 
	
			@FindBy(xpath="//*[@id='btnSorting']")
			public static WebElement masterSortBtn; 
	
			@FindBy(xpath="//*[@id='btnMassUpdate']")
			public static WebElement masterMassUpdateBtn; 
	
			@FindBy(xpath="//a[@class='lSNext']")
			public static WebElement masterRibbonControlNextBtn; 
			
			@FindBy(xpath="//*[@id='btnXMLImport']")
			public static WebElement masterImportFromXmlBtn; 
	
			@FindBy(xpath="//*[@id='btnXMLExport']")
			public static WebElement masterExportFormatToXmlBtn; 
	
			
			@FindBy(xpath="//*[@id='btnCustomizeMaster']")
			public static WebElement masterCustamizeViewBtn; 
	
			
			
		

			@FindBy(xpath="//label[@class='msgInfo']")
			public static WebElement clickOnEmptyGroup;
			

		//Master Left panel//TreeID//Elements

		
				
				@FindBy(xpath="//*[@id='btnCancel']")
				public static WebElement treeID_CloseBtn; 
				
				@FindBy(xpath="//input[@id='txtTreeName']")
				public static WebElement treeID_TreeTxt; 
				
				@FindBy(xpath="//input[@id='rbtManual']")
				public static WebElement treeID_ManualRadioBtn; 
				
				@FindBy(xpath="//input[@id='rbtAuto']")
				public static WebElement treeID_AutoRadioBtn; 
				
				@FindBy(xpath="//select[@id='cmbTreeList']")
				public static WebElement treeID_SelectTreeDropdown; 
				
				@FindBy(xpath="//input[@id='chkIncludeGroup']")
				public static WebElement treeID_IncludeGroupsCheckBox; 
				
				@FindBy(xpath="//input[@id='chkAddLeaveAtZeroLevel']")
				public static WebElement treeID_AddLeafAlwaysAtTheZerolevelOnCreationCheckbox; 
				
				@FindBy(xpath="//*[@id='MasterTreeTable_SelectFields']")
				public static WebElement treeID_GridFirstSelectFields; 
				
				@FindBy(xpath="//*[@id='MasterTreeTable_col_2-1']")
				public static WebElement treeID_GridSecondSelectFields; 
				
				@FindBy(xpath="//input[@id='chkAutoGroup']")
				public static WebElement treeID_AlwaysAutoGroupOnCreationCheckbox; 
				
				@FindBy(xpath="//input[@id='chkAlwaysSorted']")
				public static WebElement treeID_AlwaysSortedCheckbox; 
				
				@FindBy(xpath="//*[@id='btnOk']")
				public static WebElement treeID_PopOkBtn; 
				
				@FindBy(xpath="//*[@id='btnCancel']")
				public static WebElement treeID_PopCancelBtn; 
			
			

 

			

		/*								
			//Header Elements of Master MainLanding
			@FindBy(xpath="//*[@id='txtsrch-term']")
			public static WebElement masterSearchTxt; 

			@FindBy(xpath="//*[@id='btnSearchAcc1']/i")
			public static WebElement masterSearchBtn; 

            @FindBy(xpath="//a[contains(text(),'Search on')]")
			public static WebElement masterSearchTxtBtn_SearchOnBtn; 								

			@FindBy(xpath="//a[contains(text(),'Advance Search')]")
			public static WebElement masterSearchTxtBtn_AdvanceSearchBtn; 
			
			@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
			public static WebElement mastercmbMasterTxt; 

			@FindBy(xpath="//*[@id='cmbUserTypeMaster_input_image']/span")
			public static WebElement masterCmbMasterExpansionBtn; 
			
		   	@FindBy(xpath="//*[@id='li_moveup']/div/div[1]/a[1]/span")
			public static WebElement masterMoveTheSelectionToNextBookMarkBtn; 

			@FindBy(xpath="//span[@class='icon-font6 icon-bookmarkdown theme_icon-color']")
			public static WebElement masterMoveTheSelectionToPrevoiusBookmarkBtn; 

			@FindBy(xpath="//span[@class='theme_icon-color icon-font6 icon-show-all-records']")
			public static WebElement masterShowAllRecordsBtn; 

			@FindBy(xpath="//span[@class='icon-font6 icon-missmatched-entries theme_icon-color']")
			public static WebElement masterShowAllUnauthorisedRecords; 

			@FindBy(xpath="//span[@class='icon-font6 icon-Closed-records theme_icon-color']")
			public static WebElement masterShowAllClosedRecordsBtn; 

			@FindBy(xpath="//span[@class='icon-font6 icon-external-module theme_icon-color']")
			public static WebElement masterAutoAdjustColoumnsBtn; 

			@FindBy(xpath="//input[@id='chkRetainSelection']")
			public static WebElement masterRetainSelectionCheckBox; 

			@FindBy(xpath="//*[@id='btnsideBar']")
			public static WebElement masterSideBarBtn; 
		*/
				
			//InfoPanel
			@FindBy(xpath="//label[contains(text(),'Info Panel')]")
			public static WebElement masterInfoPanelLabel; 

			@FindBy(xpath="//i[@class='icon-custamize theme_icon-color']")
			public static WebElement masterInfoPanelCustammizeBtn;
					
			@FindBy(xpath="//*[@id='lblnchecked']/input")
			public static WebElement masterGrid_SelectFirstRow;

			//Footer Fields
			@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[1]/div/input")
			public static WebElement masterFirstBtn;

			@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[2]/div/input")
			public static WebElement masterPreviousBtn;

			@FindBy(xpath="//*[@id='btn1']")
			public static WebElement masterOneBtn;

			@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[4]/div/input")
			public static WebElement masterNextBtn;

			@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[5]/div/input")
			public static WebElement masterEndBtn;
			

		    //Properties Page
		   

	       
		
		
			
	   
	    
	    @FindBy(xpath="//td[@class='text-center']")
		private static WebElement DepartmentInMainPageEmpty;
	    
		
		
        //Departments Creation Page	
	  
		
		

		
/*		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/button[2]")
		public static WebElement unitSaveBtns;
		
		@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/ul/li[2]/button[1]/i")
		public static WebElement unitSaveBtn;*/
		
		
		
	    //Edit option Fields				
		@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
		public static WebElement editCloseBtn;
		
		
		@FindBy(xpath="//button[@id='btnMasterClone']")
		public static WebElement editcloneBtn;
		
		@FindBy(xpath="//*[@id='btnMasterCopy']")
		public static WebElement copyBtn;
	    
		/*@FindBy(xpath="//div[@id='idGlobalError']")
		public static WebElement validationConfirmationMessage;

		@FindBy(xpath="//div[@class='theme_color font-6']")
		public static WebElement validationUpdatingConfirmationMessage;
		
		@FindBy(xpath="//div[@id='idGlobalError']//td[3]")
		public static WebElement CloseValidationConfirmationMessage;*/
		
		
		
		
		@FindBy(xpath="//*[@id='LandingGridBody']/tr[1]/td[11]")
		public static WebElement accountCreation;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
		public static WebElement accountNewCreationName;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[10]")
		public static WebElement binGroupNewCreationName;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
		public static WebElement unitNewCreationNameOfLane;               
					
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement unitFirstCheckBoxToSelection;
		
		
		@FindBy(xpath="//input[@id='liSelectAllMasters']")
		public static WebElement accountMasterSelect;
		
		
		
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement selectSecondRow;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement selectThirdRow;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement selectFourthRow;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[5]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement selectFifthRow;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[6]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement selectRow;
			
		@FindBy(xpath="//button[@id='btnOkForDelete']")
		public static WebElement clickOnOkInDelete;
		

		//Dash board Page
		
	
		@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
		private static WebElement companyName;
	
		@FindBy(xpath="//*[@id='companyLogo']")
		private static WebElement companyLogo;
	
	    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
		private static WebElement noIn;
	    
	    @FindBy(xpath="//input[@id='donotshow']")
		private static WebElement doNotShowCheckbox;
	    
	    @FindBy(xpath="//span[@class='pull-right']")
		private static WebElement CloseBtnInDemoPopupScreen;
	    
	    
		 
	public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 //Thread.sleep(5000);
	        
	        try 
	        {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
				doNotShowCheckbox.click();
				
				//Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtnInDemoPopupScreen));
				CloseBtnInDemoPopupScreen.click(); 
				
				System.err.println("POP UP DISPLAYED AND CloseD SUCCESSFULLY");
				
			} 
	        catch (Exception e)
	        {
	        	System.err.println("NO POP UP DISPLAYED");
			}

	    	
	    	//Thread.sleep(4000);
	}
			 
	
	
	
	public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	        try
	        {
	                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
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
	
	
	//Thread.sleep(4000);
	}
	    
	      
	 private static String xlfile;
	 private static String resPass="Pass";
	 private static String resFail="Fail";
	 private static ExcelReader excelReader;


	 public static boolean checkOpenDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		  LoginPage lp=new LoginPage(getDriver()); 
			
			String unamelt="su";
					      
			String pawslt="su";
					      
			lp.enterUserName(unamelt);
					
			lp.enterPassword(pawslt);
					  
			lp.clickOnSignInBtn();
			
			 reLogin(unamelt, pawslt, "Automation Company");
			
			//checkRefershPopOnlogin();
			
			//checkPopUpWindow();
		
			Thread.sleep(5000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
			String userInfo=userNameTxt.getText();
					    	
			System.out.println("User Info : "+userInfo);
					    	
			System.out.println("User Info Capture Text :"+userNameDisplay.getText());
					    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
					    	
			companyLogoImg.click();
					    	
			String getCompanyTxt=companyName.getText();
			String getLoginCompanyName=getCompanyTxt.substring(0, 19);
			System.out.println("company name :"+ getLoginCompanyName);
			companyLogo.click();
					    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
					    	
			String getDashboard=dashboardName.getText();

		
		
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	     
	     homeMenu.click();
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	     
	     mastersMenu.click();
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentMenu));
	     
	     departmentMenu.click();
	    	  
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));		
	     
		 if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ")/* && getDashboard.equalsIgnoreCase("Graph with Active and setAsDefault") && accountsTitle.getText().equalsIgnoreCase("Department")*/)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 586, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 586, 9, resFail);
			 return false;
		 }
	  }
	 
	 
	public static boolean checkMainOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
	     
	    boolean actmasterNewBtn                 = masterNewBtn.isDisplayed();
		boolean actmasterAddGroupBtn            = masterAddGroupBtn.isDisplayed();
		boolean actmasterEditBtn                = masterEditBtn.isDisplayed();
		boolean actmasterCloneBtn               = masterCloneBtn.isDisplayed();
		boolean actmasterPropertiesBtn          = masterPropertiesBtn.isDisplayed();
		boolean actmasterDeleteBtn              = masterDeleteBtn.isDisplayed();
		boolean actmasterCloseBtn               = masterCloseBtn.isDisplayed();
		boolean actmasterRibbonToExpandOptions  = masterRibbonToExpandOptions.isDisplayed();
		
		boolean expmasterNewBtn                 = true;
		boolean expmasterAddGroupBtn            = true;
		boolean expmasterEditBtn                = true;
		boolean expmasterCloneBtn               = true;
		boolean expmasterPropertiesBtn          = true;
		boolean expmasterDeleteBtn              = true;
		boolean expmasterCloseBtn               = true;
		boolean expmasterRibbonToExpandOptions  = true;
		
		System.out.println("********************* checkMainOptionsBinsMenu ******************");
	
		System.out.println("Home Page masterNewBtn Value Actual                :"+actmasterNewBtn+               "  Value Expected : "+expmasterNewBtn);
		System.out.println("Home Page masterAddGroupBtn Value Actual           :"+actmasterAddGroupBtn+   "  Value Expected : "+expmasterAddGroupBtn);
		System.out.println("Home Page masterEditBtn Actual                     :"+actmasterEditBtn+    "	 Value Expected : "+expmasterEditBtn);
		System.out.println("Home Page masterCloneBtn Value Actual              :"+actmasterCloneBtn+"	 Value Expected : "+expmasterCloneBtn);
		System.out.println("Home Page masterPropertiesBtn Value Actual         :"+actmasterPropertiesBtn+               "  Value Expected : "+expmasterPropertiesBtn);
		System.out.println("Home Page masterDeleteBtn Value Actual             :"+actmasterDeleteBtn+   "  Value Expected : "+expmasterDeleteBtn);
		System.out.println("Home Page masterCloseBtn Actual                    :"+actmasterCloseBtn+    "	 Value Expected : "+expmasterCloseBtn);
		System.out.println("Home Page masterRibbonToExpandOptions Value Actual :"+actmasterRibbonToExpandOptions+"	 Value Expected : "+expmasterRibbonToExpandOptions);
		
		if( actmasterNewBtn==expmasterNewBtn  && actmasterAddGroupBtn==expmasterAddGroupBtn &&
				actmasterEditBtn==expmasterEditBtn && actmasterCloneBtn==expmasterCloneBtn && 
				actmasterPropertiesBtn==expmasterPropertiesBtn  && actmasterDeleteBtn==expmasterDeleteBtn && 
			    actmasterCloseBtn==expmasterCloseBtn && actmasterRibbonToExpandOptions==expmasterRibbonToExpandOptions)
		
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 587, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 587, 9, resFail);
			 return false;
		 }
	
     }

 
	 public static boolean checkToolsOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 
		masterRibbonToExpandOptions.click();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));	
	     
	    boolean actmasterGroupBtn                                                         =masterGroupBtn.isDisplayed();
		boolean actmasterDeleteAllBtn                                                     =masterDeleteAllBtn.isDisplayed();
		boolean actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity    =masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity.isDisplayed();
		boolean actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState             =masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState.isDisplayed();
		boolean actmasterAdvanceMasterImportORExportBtn                                   =masterAdvanceMasterImportORExportBtn.isDisplayed();
		boolean actmasterAuthorInfoBtn                                                    =masterAuthorInfoBtn.isDisplayed();
		boolean actmasterMoveUpBtn                                                        =masterMoveUpBtn.isDisplayed();
		boolean actmasterMoveDownBtn                                                      =masterMoveDownBtn.isDisplayed();
		boolean actmasterSortBtn                                                          =masterSortBtn.isDisplayed();
		boolean actmasterMassUpdateBtn                                                    =masterMassUpdateBtn.isDisplayed();
		boolean actmasterImportFromXmlBtn                                                 =masterImportFromXmlBtn.isDisplayed();
		boolean actmasterExportFormatToXmlBtn                                             =masterExportFormatToXmlBtn.isDisplayed();
		
		boolean expmasterGroupBtn                                                         =true;
		boolean expmasterDeleteAllBtn                                                     =true;
		boolean expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity    =true;
		boolean expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState             =true;
		boolean expmasterAdvanceMasterImportORExportBtn                                   =true;
		boolean expmasterAuthorInfoBtn                                                    =true;
		boolean expmasterMoveUpBtn                                                        =true;
		boolean expmasterMoveDownBtn                                                      =true;
		boolean expmasterSortBtn                                                          =true;
		boolean expmasterMassUpdateBtn                                                    =true;
		boolean expmasterImportFromXmlBtn                                                 =true;
		boolean expmasterExportFormatToXmlBtn                                             =true;
		
		System.out.println("****************************** checkToolsOptionsDepartmentMenu  ********************************************");
	
		System.out.println("Home Page masterGroupBtn Value Actual                          :"+actmasterGroupBtn+           "     Value Expected : "+expmasterGroupBtn);
		System.out.println("Home Page masterDeleteAllBtn Value Actual                      :"+actmasterDeleteAllBtn+       "     Value Expected : "+expmasterDeleteAllBtn);
		System.out.println("Home Page masterCloseAccOrItemOrUnitsOrDepOrWhOrStateOrCity    :"+actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity+       "	 Value Expected : "+expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity);
		System.out.println("Home PagemasteropenCloseAccOrItemOrDepOrWhOrState Value Actual :"+actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState+      "	 Value Expected : "+expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState);
		System.out.println("Home Page masterAdvanceMasterImportORExportBtn Value Actual    :"+actmasterAdvanceMasterImportORExportBtn+     "	 Value Expected : "+expmasterAdvanceMasterImportORExportBtn);
		System.out.println("Home Page masterAuthorInfoBtn Value Actual                     :"+actmasterAuthorInfoBtn+      "	 Value Expected : "+expmasterAuthorInfoBtn);
		System.out.println("Home Page masterMoveUpBtn Value Actual                         :"+actmasterMoveUpBtn+          "	 Value Expected : "+expmasterMoveUpBtn);
		System.out.println("Home Page masterMoveDownBtn Value Actual                       :"+actmasterMoveDownBtn+        "	 Value Expected : "+expmasterMoveDownBtn);
		System.out.println("Home Page masterSortBtn Value Actual                           :"+actmasterSortBtn+            "	 Value Expected : "+expmasterSortBtn);
		System.out.println("Home Page masterMassUpdateBtn Value Actual                     :"+actmasterMassUpdateBtn+      "	 Value Expected : "+expmasterMassUpdateBtn);
		System.out.println("Home Page masterImportFromXmlBtn Value Actual                  :"+actmasterImportFromXmlBtn+   "	 Value Expected : "+expmasterImportFromXmlBtn);
		System.out.println("Home Page masterExportFormatToXmlBtn Value Actual              :"+actmasterExportFormatToXmlBtn+"	 Value Expected : "+expmasterExportFormatToXmlBtn);
		
		
		if( actmasterGroupBtn==expmasterGroupBtn  && actmasterDeleteAllBtn==expmasterDeleteAllBtn
				&& actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity==expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity
				&& actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState==expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState
				&& actmasterAdvanceMasterImportORExportBtn==expmasterAdvanceMasterImportORExportBtn
			    && actmasterAuthorInfoBtn==expmasterAuthorInfoBtn&& actmasterMoveUpBtn==expmasterMoveUpBtn
				&& actmasterMoveDownBtn==expmasterMoveDownBtn&& actmasterSortBtn==expmasterSortBtn && actmasterImportFromXmlBtn==expmasterImportFromXmlBtn
				&& actmasterMassUpdateBtn==expmasterMassUpdateBtn && actmasterExportFormatToXmlBtn==expmasterExportFormatToXmlBtn)
	 
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 588, 9, resPass);
			return true;
	  }	 
	else
	{
		 excelReader.setCellData(xlfile, "Sheet1", 588, 9, resFail);
		 return false;
	}
	
	  }
	 
	  
	 public static boolean checkOtherToolsOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	

		 boolean actCustomizemasterBtn=masterCustamizemasterBtn.isDisplayed();
	 boolean actCustomizeviewBtn=masterCustamizeViewBtn.isDisplayed();
		 boolean actCustomizetreeBtn=MastercustamizeTreeBtn.isDisplayed();
		 
		 boolean expCustomizemasterBtn=true;
		 boolean expCustomizeviewBtn=true;
		 boolean expCustomizetreeBtn=true;

		 System.out.println("********************************************checkOtherToolsOptionsDepartmentMenu***************************************");
		 
		 System.out.println("Customize master Button:  "+actCustomizemasterBtn+"  "+expCustomizemasterBtn);
		/* System.out.println("Customize view Button:  "+actCustomizeviewBtn+"  "+expCustomizeviewBtn);*/
		 System.out.println("Customize tree Button:  "+actCustomizetreeBtn+"  "+expCustomizetreeBtn);

		 if(actCustomizemasterBtn==expCustomizemasterBtn/* && actCustomizeviewBtn==expCustomizeviewBtn*/ &&
			actCustomizetreeBtn==expCustomizetreeBtn)
		 
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 589, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 589, 9, resFail);
				 return false;
		 }
		
     }

	 public static boolean checkTreeViewOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));	
		 
		 boolean actmasterTreeIdDropdown                = masterTreeIdDropdown.isDisplayed();
		 boolean actmasterTreeIDToggleBtn               = masterTreeIDToggleBtn.isDisplayed();
		 boolean actmasterTreeViewIDDropdown            = masterTreeViewIDDropdown.isDisplayed();
		 boolean actmasterTreeViewIDToggleBtn           = masterTreeViewIDToggleBtn.isDisplayed();
		 boolean actmasterOptionToHideAccountsGroupTree = masterOptionToHideAccountsGroupTree.isDisplayed();
		 
		 boolean expmasterTreeIdDropdown                = true;
		 boolean expmasterTreeIDToggleBtn               = true;
		 boolean expmasterTreeViewIDDropdown            = true;
		 boolean expmasterTreeViewIDToggleBtn           = true;
		 boolean expmasterOptionToHideAccountsGroupTree = true ;

		 System.out.println("********************************************checkTreeViewOptionsDepartmentMenu***************************************");
		 
		 System.out.println("masterTreeIdDropdown:               "+actmasterTreeIdDropdown                +" "+expmasterTreeIdDropdown);
		 System.out.println("masterTreeIDToggleBtn:              "+actmasterTreeIDToggleBtn               +" "+expmasterTreeIDToggleBtn);
		 System.out.println("masterTreeViewIDDropdown:           "+actmasterTreeViewIDDropdown            +" "+expmasterTreeViewIDDropdown);
		 System.out.println("masterTreeViewIDToggleBtn           "+actmasterTreeViewIDToggleBtn           +" "+expmasterTreeViewIDToggleBtn);
		 System.out.println("masterOptionToHideAccountsGroupTree "+actmasterOptionToHideAccountsGroupTree +" "+expmasterOptionToHideAccountsGroupTree);

		 
		 if(actmasterTreeIdDropdown==expmasterTreeIdDropdown && actmasterTreeIDToggleBtn==expmasterTreeIDToggleBtn &&
			actmasterTreeViewIDDropdown==expmasterTreeViewIDDropdown && actmasterTreeViewIDToggleBtn==expmasterTreeViewIDToggleBtn && 
			actmasterOptionToHideAccountsGroupTree==expmasterOptionToHideAccountsGroupTree)
		 
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 590, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 590, 9, resFail);
			 return false;
		 }
	
    }
	 
	 
	 public static boolean checkCreateTreeToggleOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggleBtn));	
		 
		 masterTreeIDToggleBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggle_CreateTreeBtn));	
		 boolean actmasterTreeIDToggle_CreateTreeBtn          = masterTreeIDToggle_CreateTreeBtn.isDisplayed();
		 boolean actmasterTreeIDToggle_EditBtn                = masterTreeIDToggle_EditBtn.isDisplayed();
		 boolean actmasterTreeIDToggle_DeleteBtn              = masterTreeIDToggle_DeleteBtn.isDisplayed();
		 boolean actmasterTreeIDToggle_setDefaultBtn          = masterTreeIDToggle_setDefaultBtn.isDisplayed();
		
		 
		 boolean expmasterTreeIDToggle_CreateTreeBtn         = true;
		 boolean expmasterTreeIDToggle_EditBtn               = true;
		 boolean expmasterTreeIDToggle_DeleteBtn             = true;
		 boolean expmasterTreeIDToggle_setDefaultBtn         = true;
		

		 System.out.println("********************************************checkCreateTreeToggleOptionsDepartmentMenu***************************************");
		 
		 System.out.println("masterTreeIDToggle_CreateTreeBtn:        "+actmasterTreeIDToggle_CreateTreeBtn   +" "+expmasterTreeIDToggle_CreateTreeBtn);
		 System.out.println("masterTreeIDToggle_EditBtn:              "+actmasterTreeIDToggle_EditBtn         +" "+expmasterTreeIDToggle_EditBtn);
		 System.out.println("masterTreeIDToggle_DeleteBtn:            "+actmasterTreeIDToggle_DeleteBtn       +" "+expmasterTreeIDToggle_DeleteBtn);
		 System.out.println("masterTreeIDToggle_setDefaultBtn         "+actmasterTreeIDToggle_setDefaultBtn   +" "+expmasterTreeIDToggle_setDefaultBtn);
		 
		 if(actmasterTreeIDToggle_CreateTreeBtn==expmasterTreeIDToggle_CreateTreeBtn && actmasterTreeIDToggle_EditBtn==expmasterTreeIDToggle_EditBtn &&
			actmasterTreeIDToggle_DeleteBtn==expmasterTreeIDToggle_DeleteBtn && actmasterTreeIDToggle_setDefaultBtn==expmasterTreeIDToggle_setDefaultBtn)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 591, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 591, 9, resFail);
				 return false;
		 }
		
     }

		 
	 public static boolean checkCreateViewToggleOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIDToggleBtn));	
		 masterTreeViewIDToggleBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIdCreateViewBtn));	
		 
		 boolean actmasterTreeViewIdCreateViewBtn=masterTreeViewIdCreateViewBtn.isDisplayed();
		 boolean expmasterTreeViewIdCreateViewBtn=true;
		 
		 System.out.println("********************************************checkCreateViewToggleOptionsDepartmentMenu***********************************");
		 System.out.println("masterTreeViewIdCreateViewBtn    "+actmasterTreeViewIdCreateViewBtn +"   "+expmasterTreeViewIdCreateViewBtn);
		 
		 if(actmasterTreeViewIdCreateViewBtn==expmasterTreeViewIdCreateViewBtn)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 592, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 592, 9, resFail);
			 return false;
		 }
		
    }

	 public static boolean checkHideAccountGroupsOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

	     excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));	
		 masterOptionToHideAccountsGroupTree.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeDepartmentDisplay));	
		 
		 boolean acttreeDepartmentDisplay=treeDepartmentDisplay.isDisplayed();
		 boolean exptreeDepartmentDisplay=true;
		 
		 System.out.println("*********************************checkHideAccountGroupsOptionsDepartmentMenu******");
		 
		 System.out.println("treeDepartmentDisplay          "+acttreeDepartmentDisplay +" Value Expected  :"+exptreeDepartmentDisplay);
		 
		 if(acttreeDepartmentDisplay==exptreeDepartmentDisplay)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 593, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 593, 9, resFail);
			 return false;
		 }
	
    }
    
	 
	 public static boolean checkMainPageHeaderFieldsOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));	
		 
	    boolean actmasterSearchTxt                             =masterSearchTxt.isDisplayed();
		boolean actmasterSearchBtn                             =masterSearchBtn.isDisplayed();
		boolean actmastercmbMasterTxt                          =mastercmbMasterTxt.isDisplayed();
		boolean actmasterMoveTheSelectionToNextBookMarkBtn     =masterMoveTheSelectionToNextBookMarkBtn.isDisplayed();
		boolean actmasterMoveTheSelectionToPrevoiusBookmarkBtn =masterMoveTheSelectionToPrevoiusBookmarkBtn.isDisplayed();
		boolean actmasterShowAllRecordsBtn                     =masterShowAllRecordsBtn.isDisplayed();
		boolean actmasterShowAllUnauthorisedRecords            =masterShowAllUnauthorisedRecords.isDisplayed();
		boolean actmasterShowAllClosedRecordsBtn               =masterShowAllClosedRecordsBtn.isDisplayed();
		boolean actmasterAutoAdjustColoumnsBtn                 =masterAutoAdjustColoumnsBtn.isDisplayed();
		boolean actmasterRetainSelectionCheckBox               =masterRetainSelectionCheckBox.isDisplayed();
		boolean actmasterSideBarBtn                            =masterSideBarBtn.isDisplayed();
		
		
		boolean expmasterSearchTxt                             =true;
		boolean expmasterSearchBtn                             =true;
		boolean expmastercmbMasterTxt                          =true;
		boolean expmasterMoveTheSelectionToNextBookMarkBtn     =true;
		boolean expmasterMoveTheSelectionToPrevoiusBookmarkBtn =true;
		boolean expmasterShowAllRecordsBtn                     =true;
		boolean expmasterShowAllUnauthorisedRecords            =true;
		boolean expmasterShowAllClosedRecordsBtn               =true;
		boolean expmasterAutoAdjustColoumnsBtn                 =true;
		boolean expmasterRetainSelectionCheckBox               =true;
		boolean expmasterSideBarBtn                            =true;
		
		System.out.println("****************************** checkMainPageHeaderFieldsOptionsDepartmentMenu ********************************************");
	
		System.out.println("Home Page masterSearchTxt Value Actual                :"+actmasterSearchTxt+                 "     Value Expected : "+expmasterSearchTxt);
		System.out.println("Home Page masterSearchBtn Value Actual                :"+actmasterSearchBtn+                 "     Value Expected : "+expmasterSearchBtn);
		System.out.println("Home Page mastercmbMasterTxt Value Actual             :"+actmastercmbMasterTxt+              "	 Value Expected : "+expmastercmbMasterTxt);
		System.out.println("Home Page masterMoveTheSelToNextBookMarkBtn           :"+actmasterMoveTheSelectionToNextBookMarkBtn+ "	 Value Expected : "+expmasterMoveTheSelectionToNextBookMarkBtn);
		System.out.println("Home Page masterMoveTheSelToPrevoiusBookmarkBtn       :"+actmasterMoveTheSelectionToPrevoiusBookmarkBtn+"	 Value Expected : "+expmasterMoveTheSelectionToPrevoiusBookmarkBtn);
		System.out.println("Home Page masterShowAllRecordsBtn Value Actual        :"+actmasterShowAllRecordsBtn+          "	 Value Expected : "+expmasterShowAllRecordsBtn);
		System.out.println("Home Page masterShowAllUnauthorisedRecordsValue Actual:"+actmasterShowAllUnauthorisedRecords+ "	 Value Expected : "+expmasterShowAllUnauthorisedRecords);
		System.out.println("Home Page masterShowAllClosedRecordsBtn Value Actual  :"+actmasterShowAllClosedRecordsBtn+    "	 Value Expected : "+expmasterShowAllClosedRecordsBtn);
		System.out.println("Home Page masterAutoAdjustColoumnsBtnValue Actual     :"+actmasterAutoAdjustColoumnsBtn+      "	 Value Expected : "+expmasterAutoAdjustColoumnsBtn);
		System.out.println("Home Page masterRetainSelectionCheckBox Value Actual  :"+actmasterRetainSelectionCheckBox+    "	 Value Expected : "+expmasterRetainSelectionCheckBox);
		System.out.println("Home Page masterSideBarBtn Value Actual               :"+actmasterSideBarBtn+                 "	 Value Expected : "+expmasterSideBarBtn);
		
		
		if( actmasterSearchTxt==expmasterSearchTxt&& actmasterSearchBtn==expmasterSearchBtn
				&& actmastercmbMasterTxt==expmastercmbMasterTxt && actmasterMoveTheSelectionToNextBookMarkBtn==expmasterMoveTheSelectionToNextBookMarkBtn 
				&& actmasterMoveTheSelectionToPrevoiusBookmarkBtn==expmasterMoveTheSelectionToPrevoiusBookmarkBtn
			    && actmasterShowAllRecordsBtn==expmasterShowAllRecordsBtn && actmasterShowAllUnauthorisedRecords==expmasterShowAllUnauthorisedRecords
				&& actmasterShowAllClosedRecordsBtn==expmasterShowAllClosedRecordsBtn && actmasterAutoAdjustColoumnsBtn==expmasterAutoAdjustColoumnsBtn 
				&& actmasterRetainSelectionCheckBox==expmasterRetainSelectionCheckBox
				&& actmasterSideBarBtn==expmasterSideBarBtn)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 594, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 594, 9, resFail);
			 return false;
		 }
		
	  }

		

	 
	/*public static boolean checkSearchOptionsInMainPageHeaderFieldsOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));	
		 
		 masterSearchBtn.click();
		 
		 boolean actmasterSearchTxtBtn_SearchOnBtn      =masterSearchTxtBtn_SearchOnBtn.isDisplayed();
		 boolean actmasterSearchTxtBtn_AdvanceSearchBtn =masterSearchTxtBtn_AdvanceSearchBtn.isDisplayed();
		 
		 boolean expmasterSearchTxtBtn_SearchOnBtn      =true;
		 boolean expmasterSearchTxtBtn_AdvanceSearchBtn =true;
		 
		 
		 System.out.println("*******************************************checkSearchOptionsInMainPageHeaderFieldsOptionsBinsMenu************************");
		 
		 System.out.println("masterSearchTxtBtn_SearchOnBtn    "+actmasterSearchTxtBtn_SearchOnBtn+"   "+expmasterSearchTxtBtn_SearchOnBtn);
		 System.out.println("masterSearchTxtBtn_AdvanceSearchBtn "+actmasterSearchTxtBtn_AdvanceSearchBtn +"   "+expmasterSearchTxtBtn_AdvanceSearchBtn);
		 
		 if(actmasterSearchTxtBtn_SearchOnBtn==expmasterSearchTxtBtn_SearchOnBtn &&
			 actmasterSearchTxtBtn_AdvanceSearchBtn==expmasterSearchTxtBtn_AdvanceSearchBtn)
		 {	
			 excelReader.setCellData(xlfile, "Sheet1", 595, 9, resPass);
			 return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 595, 9, resFail);
			 return false;
		 }
	
  }*/


			
	public static boolean checkNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		  masterNewBtn.click();
			  		
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		  boolean actnameTxt             =nameTxt.isDisplayed();
		  boolean actcodeTxt             =codeTxt.isDisplayed();
		  boolean actlocalCurrencyCB     =localCurrencyComboBox.isDisplayed();
		  boolean actSaveBtn             =SaveBtn.isDisplayed();
		  boolean actCloseBtn            =CloseBtn.isDisplayed();
			
		  boolean expnameTxt             =true;
		  boolean expcodeTxt             =true;
		  boolean explocalCurrencyCB     =true;
		  boolean expSaveBtn             =true;
		  boolean expCloseBtn            =true;
			
			
		  System.out.println("******************************checkNewButton  ********************************************");
			
		  System.out.println("Name Txt Value Actual         :"+actnameTxt +           "  Value Expected : "+expnameTxt);
		  System.out.println("Code Txt Value Actual         :"+actcodeTxt+            "  Value Expected : "+expcodeTxt);
		  System.out.println("localCurrencyCB Value Actual  :"+actlocalCurrencyCB+    "  Value Expected : "+explocalCurrencyCB);
		  System.out.println("Save Btn Value Actual         :"+actSaveBtn+            "	 Value Expected : "+expSaveBtn);
		  System.out.println("CloseBtn Value Actual         :"+actCloseBtn+           "	 Value Expected : "+expCloseBtn);
			
		  if( actnameTxt==expnameTxt  && actcodeTxt==expcodeTxt 
				  && actlocalCurrencyCB==explocalCurrencyCB && actSaveBtn==expSaveBtn&& actCloseBtn==expCloseBtn)
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 596, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 596, 9, resFail);
				 return false;
		 }
      }

	 
	public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("*******************************************checkSaveButtonWithoutInputNameMandatoryFieldsInNew***************"); 
		 
		 String expMessage="In Tab :General ---> Name Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);

		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 597, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 597, 9, resFail);
			 return false;
		 }
      }
			
			
	public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 nameTxt.sendKeys("IND");
		
		 nameTxt.sendKeys(Keys.TAB);
		 
		 //Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("***********************************checkSaveButtonWithoutInputCodeMandatoryFieldsInNew********************");
		 
		 String expMessage="In Tab :General ---> Code Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 598, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 598, 9, resFail);
			 return false;
		 }
      }
	

	public static boolean checkSaveButtonWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			 
	     codeTxt.sendKeys("IND");
	         
         //Thread.sleep(2000);
         
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("****************************************checkSaveButtonWithInputingMandatoryFields************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 599, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 599, 9, resFail);
			 return false;
		 }
      }
	
			
			
	public static boolean checkDepartmentCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		   		 
  		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		  nameTxt.click();

		  boolean actnameTxt             =nameTxt.isDisplayed();
		  boolean actcodeTxt             =codeTxt.isDisplayed();
		  boolean actlocalCurrencyCB     =localCurrencyComboBox.isDisplayed();
		  boolean actSaveBtn             =SaveBtn.isDisplayed();
		  boolean actCloseBtn            =CloseBtn.isDisplayed();
			
		  boolean expnameTxt             =true;
		  boolean expcodeTxt             =true;
		  boolean explocalCurrencyCB     =true;
		  boolean expSaveBtn             =true;
		  boolean expCloseBtn            =true;
			
		  System.out.println("******************************checkDepartmentCreationScreenAfterSaving  ********************************");
			
		  System.out.println("Name Txt Value Actual         :"+actnameTxt +           "  Value Expected : "+expnameTxt);
		  System.out.println("Code Txt Value Actual         :"+actcodeTxt+            "  Value Expected : "+expcodeTxt);
		  System.out.println("localCurrencyCB Value Actual  :"+actlocalCurrencyCB+    "  Value Expected : "+explocalCurrencyCB);
		  System.out.println("Save Btn Value Actual         :"+actSaveBtn+            "	 Value Expected : "+expSaveBtn);
		  System.out.println("CloseBtn Value Actual         :"+actCloseBtn+           "	 Value Expected : "+expCloseBtn);
			
		  if( actnameTxt==expnameTxt  && actcodeTxt==expcodeTxt 
				  && actlocalCurrencyCB==explocalCurrencyCB && actSaveBtn==expSaveBtn&& actCloseBtn==expCloseBtn)
		 {
			 
			 excelReader.setCellData(xlfile, "Sheet1", 600, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 600, 9, resFail);
				 return false;
		 }
      }
	
	
	
	
			
	public static boolean checkNewlyCreatedDepartmentDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		 
		 CloseBtn.click();
		 
		 //Thread.sleep(2000);
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="IND";*/
		 
		 
		 Thread.sleep(3000);
		 
		 int deptCount= departmentNameList.size();
			boolean dept=false;

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("IND"))     
		 			{
		 				dept = true;
		 				break;
		 			}
		 		}
		 
		 
		 System.out.println("*********************************checkNewlyCreatedDepartmentDisplayInGrid******");
		 
		 
		/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 if(dept == true)
	
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 601, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 601, 9, resFail);
			 return false;
		 }
      }

	
	
	
	public static boolean checkEditOptionForNewlyCreatedDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();*/
		 
		 Thread.sleep(3000);
		 int deptCount = departmentNameList.size();
			

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("IND"))     
		 			{
		 				departMentCheckboxList.get(i).click();
		 				break;
		 			}
		 		}
		 
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	 
		 masterEditBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 System.out.println("nameTxt"+nameTxt.getText());
		 
		 System.out.println("nameTxt"+nameTxt.getAttribute("Value"));
		 
		 System.out.println("codeTxt"+codeTxt.getText());
		 
		 System.out.println("codeTxt"+codeTxt.getAttribute("Value"));
		 
		 String  actnameTxt=nameTxt.getAttribute("Value");
		 String  expnameTxt="IND";
		 
		 System.out.println("*************************************checkEditOptionForNewlyCreatedDepartment***********************");
		 
		 System.out.println("nameTxt                 "+actnameTxt +" Value Expected  "+expnameTxt);
		 
		 
		 if(actnameTxt.equalsIgnoreCase(expnameTxt))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 602, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 602, 9, resFail);
			 return false;
		 }
      }
	
	
	
	public static boolean checkUpateForNewlyCreateDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 	 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 nameTxt.clear();
		 
		 nameTxt.sendKeys("INDIA");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.click();
		 
		 codeTxt.clear();
		 
		 codeTxt.sendKeys("INDIA");
		 
		 codeTxt.sendKeys(Keys.TAB);
		 
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
     
         nameTxt.click();
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 
		 System.out.println("*********************************************checkUpateForNewlyCreateDepartment************");
		 
		 String expMessage="Updated Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 603, 9, resPass);
			 return true;
		 }
		 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 603, 9, resFail);
			 return false;
		 }
      }

			
	
	
	public static boolean checkUpdatedMasterDepartmentDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="INDIA";*/
		 
		 
		 Thread.sleep(3000);
		 
		 int deptCount= departmentNameList.size();
			boolean dept=false;

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("INDIA"))     
		 			{
		 				dept = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("*********************************checkUpdatedMasterDepartmentDisplayInGrid******");
		 
		/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 if(dept == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 604, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 604, 9, resFail);
			 return false;
		 }
      }
	
	
	

	
	
	public static boolean checkCloneButtonAndSaveInDepartmentMasterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();*/
		 
		 Thread.sleep(3000);
		 int deptCount = departmentNameList.size();
			

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("INDIA"))     
		 			{
		 				departMentCheckboxList.get(i).click();
		 				break;
		 			}
		 		}
		 
		 
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		 
		 masterEditBtn.click();

		 //Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editcloneBtn));
			
		 editcloneBtn.click();						  		 
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();

		 nameTxt.sendKeys("DUBAI");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.sendKeys("DUBAI");
		 
		 codeTxt.sendKeys(Keys.TAB);
		 
		//Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("*******************************************checkCloneButtonAndSaveInDepartmentMasterCreation**************************");
		 String expMessage="Saved Successfully";
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 605, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 605, 9, resFail);
			 return false;
		 }
      }
	
		
		
		
		
		
		
		
		
		
	public static boolean checkDepartmentDisplayInUnitsSavingWithCloneMasterCreationOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="DUBAI";
		 */
		 
		 
		 Thread.sleep(3000);
		 
		 int deptCount= departmentNameList.size();
			boolean dept=false;

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("DUBAI"))     
		 			{
		 				dept = true;
		 				break;
		 			}
		 		}
		 
		 
		 
		 System.out.println("*********************************checkDepartmentDisplayInUnitsSavingWithCloneMasterCreationOptions******");
		 
		/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 if(dept == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 606, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 606, 9, resFail);
			 return false;
		 }
      }

	
	
	
	
	
	public static boolean checkCloneButtonAndSaveInUnitsMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();*/
		 
		 Thread.sleep(3000);
		 int deptCount = departmentNameList.size();
			

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("DUBAI"))     
		 			{
		 				departMentCheckboxList.get(i).click();
		 				break;
		 			}
		 		}
		 

		 //Copy and Clone is checked at once
		 
		 //First Copy is selected then the Clone 
							  		 
		 
		 //Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloneBtn));
			
		 masterCloneBtn.click();
			  		 
		 //Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();

		 nameTxt.sendKeys("AMERICA");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.sendKeys("AMERICA");
		 
		 codeTxt.sendKeys(Keys.TAB);
		 
		 
		 //here we are doing copy option
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyBtn));
			
		 copyBtn.click();
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 //Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("****************************************************checkCloneButtonAndSaveInUnitsMasterOptions***************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 607, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 607, 9, resFail);
			 return false;
		 }
      }
	
	
		
		
		
	public static boolean checkUnitDisplayInUnitsSavingWithCloneMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		/* 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="AMERICA";*/
		 
		 
		 Thread.sleep(3000);
		 
		 int deptCount= departmentNameList.size();
			boolean dept=false;

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("AMERICA"))     
		 			{
		 				dept = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("*********************************checkUnitDisplayInUnitsSavingWithCloneMasterOptions******");
		 
		 
		/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 if(dept == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 608, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 608, 9, resFail);
			 return false;
		 }
      }


	public static boolean checkCopyOptionByPasteOptionWithNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 Thread.sleep(3000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			
		 masterNewBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteBtn));
		 
	     pasteBtn.click();
		
		 //Thread.sleep(3000);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("**********************************checkCopyOptionByPasteOptionWithNewButton********************************");
		 
		 String expMessage="Code Is Unique";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 609, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 609, 9, resFail);
			 return false;
		 }
      }
	
	
	
	public static boolean checkSaveDepartmentUsingCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 nameTxt.clear();

		 nameTxt.sendKeys("SINGPORE");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 codeTxt.click();
		 codeTxt.clear();
		 codeTxt.sendKeys("SINGAPORE");
		 codeTxt.sendKeys(Keys.TAB);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("**********************************checkSaveDepartmentUsingCopyAndPaste****************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 Thread.sleep(2000);

		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 610, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 610, 9, resFail);
			 return false;
		 }
      }
	
	
	
	
	
	public static boolean checkDepartmentDisplaySavingWithCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 Thread.sleep(2000);
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		 
		 CloseBtn.click();
		 
		 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="SINGAPORE";*/
		 
		
		 
		 int deptCount= departmentNameList.size();
			boolean dept=false;

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("SINGPORE"))     
		 			{
		 				dept = true;
		 				break;
		 			}
		 		}
		 
		 
		 System.out.println("*********************************checkDepartmentDisplaySavingWithCopyAndPaste******");
		 
		 
		/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 if(dept == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 611, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 611, 9, resFail);
			 return false;
		 }
      }
	
	

				
	public static boolean checkDepartmentMasterProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		 		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();*/
		 
		 Thread.sleep(3000);
		 int deptCount = departmentNameList.size();
			

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("SINGAPORE"))     
		 			{
		 				departMentCheckboxList.get(i).click();
		 				break;
		 			}
		 		}
		 		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		 
		 masterPropertiesBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentPropertiesLabel));
	     
		 boolean actdepartmentPropertiesLabel         = departmentPropertiesLabel.isDisplayed();
		 boolean actstatusDropdown                 = statusDropdown.isDisplayed();
		 boolean actdoNotRestChkBox                = doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox.isDisplayed();
		 boolean actallowOtherCompnyCheckbox       = allowOtherCompaniesToViewRecordsCheckbox.isDisplayed();
		 
		 boolean expdepartmentPropertiesLabel         = true;
		 boolean expstatusDropdown                 = true;
		 boolean expdoNotRestChkBox                = true;
		 boolean expallowOtherCompnyCheckbox       = true;
		 
		 System.out.println("******************************************checkDepartmentMasterProperties*****************");
		 
		 System.out.println("departmentPropertiesLabel   "+actdepartmentPropertiesLabel   +" Value Excepted :"+expdepartmentPropertiesLabel);
		 System.out.println("statusDropdown           "+actstatusDropdown           +" Value Excepted :"+expstatusDropdown);
		 System.out.println("doNotRestChkBox          "+actdoNotRestChkBox          +" Value Excepted :"+expdoNotRestChkBox);
		 System.out.println("allowOtherCompnyCheckbox "+actallowOtherCompnyCheckbox +" Value Excepted :"+expallowOtherCompnyCheckbox);
		 
		 
		 if(actdepartmentPropertiesLabel==expdepartmentPropertiesLabel && actstatusDropdown==expstatusDropdown && 
		      actdoNotRestChkBox==expdoNotRestChkBox && actallowOtherCompnyCheckbox==expallowOtherCompnyCheckbox)

		 {
	
			 excelReader.setCellData(xlfile, "Sheet1", 612, 9, resPass);
			 return true;
		 }
		 else
		 {
	
			 excelReader.setCellData(xlfile, "Sheet1", 612, 9, resFail);
			 return false;
		 }
				 
      }
	
		

	public static boolean checkInActiveBySelectingOkButtonInPropertiesOptionForDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(statusDropdown));
		 
        statusDropdown.click();
        
        statusDropdown.sendKeys("Inactive");
        
        //Thread.sleep(2000);
        
        statusDropdown.sendKeys(Keys.TAB);
		 

         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(properties_okBtn));
		 
         properties_okBtn.click();
        
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));*/
		 
		 
		 System.out.println("**********************************checkInActiveBySelectingOkButtonInPropertiesOptionForDepartment**************************");
		 
		/* String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="SINGAPORE";
		 
		 System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 Thread.sleep(3000);
		 
		 int deptCount= departmentNameList.size();
			boolean dept=false;

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("SINGPORE"))     
		 			{
		 				dept = true;
		 				break;
		 			}
		 		}
		 
		 if(dept == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 613, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 613, 9, resFail);
			 return false;
		 }
      }
	
	
	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div/label/input")
	public static List<WebElement> checkboxListInMasters;

	public static boolean checkCreateNewDepartmentForDeleteOptionValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		
	 masterNewBtn.click();

	 //Thread.sleep(3000);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	 nameTxt.click();
	 
	 nameTxt.clear();

	 nameTxt.sendKeys("Pakistan");
	 
	
	 nameTxt.sendKeys(Keys.TAB);
	
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 
	 codeTxt.click();
	 
	 codeTxt.clear();
	 
	 codeTxt.sendKeys("Pakistan");
	 
	 codeTxt.sendKeys(Keys.TAB);
	 
	 Thread.sleep(2000);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
	 
	 SaveBtn.click();
	 
	 String expMessage=" ";
		
	 String actMessage=checkValidationMessage(expMessage);
	 
	 Thread.sleep(2000);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
	 
	 CloseBtn.click();
		 
	 //Thread.sleep(3000);
	 
	 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterSelect));
	  
	 accountMasterSelect.click();
	  
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterSelect));
	  
	 accountMasterSelect.click();*/
	  

	 for(int i=0; i < checkboxListInMasters.size(); i++)
	 {
	 if(checkboxListInMasters.get(i).isSelected())
	 {
		 checkboxListInMasters.get(i).click();
	 }
	 }
		 
	/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
	 unitFirstCheckBox.click();*/
	 
	 
	 Thread.sleep(3000);
	 int deptCount = departmentNameList.size();
		

	 ArrayList<String> deptList = new ArrayList<String>();

	 		for (int i = 0; i < deptCount; i++)
	 		{
	 			 String data = departmentNameList.get(i).getText();
	 			deptList.add(data);
	 			if(data.equalsIgnoreCase("Pakistan"))     
	 			{
	 				departMentCheckboxList.get(i).click();
	 				break;
	 			}
	 		}
		 

		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
     
     masterDeleteBtn.click();
     
     //Thread.sleep(2000);
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
     
     String actgetMsgOnDelete=getMsgOnDelete.getText();
     
	 String expgetMsgOnDelete="Would you like to delete this selected master";
	 
	 System.out.println("*********************************************checkCreateNewDepartmentForDeleteOptionValidationMessage****************************");
	 
	 System.out.println("getMsgOnDelete          "+actgetMsgOnDelete +" Value Expected  :"+expgetMsgOnDelete );
	 
	 if(actgetMsgOnDelete.equalsIgnoreCase(expgetMsgOnDelete))
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 614, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 614, 9, resFail);
		 return false;
	 }
    }
	
	
	

public static boolean checkOkInDeleteValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
    
     clickOnOkInDelete.click();
     
     System.out.println("*************************************checkOkInDeleteValidationMessage************************"); 
     
     
     String expMessage="Record Deleted Successfully.";
		
     String actMessage=checkValidationMessage(expMessage);
     
     System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
     
     if(actMessage.equalsIgnoreCase(expMessage))
	 {
    	 
    	 
		 excelReader.setCellData(xlfile, "Sheet1", 615, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 615, 9, resFail);
		 return false;
	 }	 
}



		
public static boolean checkDeleteDepartmentDisplayBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
	 String  actaccountNewCreationName=accountNewCreationName.getText();
	 String  expaccountNewCreationName="SINGAPORE";*/
	 
	 
	 Thread.sleep(3000);
	 
	 int deptCount= departmentNameList.size();
		boolean dept=false;

	 ArrayList<String> deptList = new ArrayList<String>();

	 		for (int i = 0; i < deptCount; i++)
	 		{
	 			 String data = departmentNameList.get(i).getText();
	 			deptList.add(data);
	 			if(data.equalsIgnoreCase("SINGPORE"))     
	 			{
	 				dept = true;
	 				break;
	 			}
	 		}
	 
	 System.out.println("*********************************checkDeleteDepartmentDisplayBeforeCustomization******");
	 
	 
	/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
	 
	 if(dept == true)
	 { 
		 excelReader.setCellData(xlfile, "Sheet1", 616, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 616, 9, resFail);
		 return false;
	 }
     
     	 
}


    //Add Group Option


	public static boolean checkAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
		
		  masterAddGroupBtn.click();
		 
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		  boolean actnameTxt             =nameTxt.isDisplayed();
		  boolean actcodeTxt             =codeTxt.isDisplayed();
		  boolean actlocalCurrencyCB     =localCurrencyComboBox.isDisplayed();
		  boolean actSaveBtn             =SaveBtn.isDisplayed();
		  boolean actCloseBtn            =CloseBtn.isDisplayed();
			
		  boolean expnameTxt             =true;
		  boolean expcodeTxt             =true;
		  boolean explocalCurrencyCB     =true;
		  boolean expSaveBtn             =true;
		  boolean expCloseBtn            =true;
			
		  System.out.println("******************************checkAddGroupButton  ********************************");
			
		  System.out.println("Name Txt Value Actual         :"+actnameTxt +           "  Value Expected : "+expnameTxt);
		  System.out.println("Code Txt Value Actual         :"+actcodeTxt+            "  Value Expected : "+expcodeTxt);
		  System.out.println("localCurrencyCB Value Actual  :"+actlocalCurrencyCB+    "  Value Expected : "+explocalCurrencyCB);
		  System.out.println("Save Btn Value Actual         :"+actSaveBtn+            "	 Value Expected : "+expSaveBtn);
		  System.out.println("CloseBtn Value Actual         :"+actCloseBtn+           "	 Value Expected : "+expCloseBtn);
			
		  if( actnameTxt==expnameTxt  && actcodeTxt==expcodeTxt 
				  && actlocalCurrencyCB==explocalCurrencyCB && actSaveBtn==expSaveBtn&& actCloseBtn==expCloseBtn)
		 	 {
				 
				 excelReader.setCellData(xlfile, "Sheet1", 617, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 617, 9, resFail);
					 return false;
			 }
    }
	
	
	
	public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 //Thread.sleep(5000);
		 System.err.println("************Department************");
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("************************************checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption****************");
		 
		 String expMessage="In Tab :General ---> Name Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 618, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 618, 9, resFail);
			 return false;
		 }
    }
	
	
	public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(nameTxt));
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.sendKeys("EURO");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 //Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("**********************************************checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption*********************");
		 
		 String expMessage="In Tab :General ---> Code Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 619, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 619, 9, resFail);
			 return false;
		 }
    }
	
	
	// Error Meassage May not Capture
	public static boolean checkSaveButtonInAddGroupWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
         codeTxt.click();
       
         codeTxt.sendKeys("EURO");
      
         //Thread.sleep(3000);
       
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("*******************************checkSaveButtonInAddGroupWithInputingMandatoryFields************************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 620, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 620, 9, resFail);
			 return false;
		 }
    }
	
	
	
	public static boolean checkBinsAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 

		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		  boolean actnameTxt             =nameTxt.isDisplayed();
		  boolean actcodeTxt             =codeTxt.isDisplayed();
		  boolean actlocalCurrencyCB     =localCurrencyComboBox.isDisplayed();
		  boolean actSaveBtn             =SaveBtn.isDisplayed();
		  boolean actCloseBtn            =CloseBtn.isDisplayed();
			
		  boolean expnameTxt             =true;
		  boolean expcodeTxt             =true;
		  boolean explocalCurrencyCB     =true;
		  boolean expSaveBtn             =true;
		  boolean expCloseBtn            =true;
			
		  System.out.println("******************************checkBinsAddGroupCreationScreenAfterSaving  ********************************");
			
		  System.out.println("Name Txt Value Actual         :"+actnameTxt +           "  Value Expected : "+expnameTxt);
		  System.out.println("Code Txt Value Actual         :"+actcodeTxt+            "  Value Expected : "+expcodeTxt);
		  System.out.println("localCurrencyCB Value Actual  :"+actlocalCurrencyCB+    "  Value Expected : "+explocalCurrencyCB);
		  System.out.println("Save Btn Value Actual         :"+actSaveBtn+            "	 Value Expected : "+expSaveBtn);
		  System.out.println("CloseBtn Value Actual         :"+actCloseBtn+           "	 Value Expected : "+expCloseBtn);
			
		  if( actnameTxt==expnameTxt  && actcodeTxt==expcodeTxt 
				  && actlocalCurrencyCB==explocalCurrencyCB && actSaveBtn==expSaveBtn&& actCloseBtn==expCloseBtn)
		 {
				 
				 excelReader.setCellData(xlfile, "Sheet1", 621, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 621, 9, resFail);
					 return false;
			 }
    }
	
	
	
	public static boolean checkBinsAddGroupNewCreateDisplayInBinsGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  			 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		 
		 CloseBtn.click();
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="EURO";*/
		 Thread.sleep(3000);
		 
		 int deptCount= departmentNameList.size();
			boolean dept=false;

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("EURO"))     
		 			{
		 				dept = true;
		 				break;
		 			}
		 		}
		 
		 
		 System.out.println("*********************************checkBinsAddGroupNewCreateDisplayInBinsGrid******");
		 
		 
		/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 if(dept == true)
	 
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 622, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 622, 9, resFail);
			 return false;
		 }
    }
	

	public static boolean checkEditOptionForNewlyCreateAddGroupBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
        /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();*/
		 
		 
		 Thread.sleep(3000);
		 int deptCount = departmentNameList.size();
			

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("EURO"))     
		 			{
		 				departMentCheckboxList.get(i).click();
		 				break;
		 			}
		 		}
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	 
		 masterEditBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 System.out.println("nameTxt"+nameTxt.getText());
		 
		 System.out.println("nameTxt"+nameTxt.getAttribute("Value"));
		 
		 System.out.println("codeTxt"+codeTxt.getText());
		 
		 System.out.println("codeTxt"+codeTxt.getAttribute("Value"));
		 
		 String  actnameTxt=nameTxt.getAttribute("Value");
		 String  expnameTxt="EURO";
		 
		 System.out.println("*************************************checkEditOptionForNewlyCreateAddGroupBins***********************");
		 
		 System.out.println("nameTxt                 "+actnameTxt +" Value Expected  "+expnameTxt);
		 
		 
		 if(actnameTxt.equalsIgnoreCase(expnameTxt))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 623, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 623, 9, resFail);
			 return false;
		 }
    }
	
	
	public static boolean checkUpateForNewlyCreateAddGroupDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		
		 nameTxt.clear();

		 nameTxt.sendKeys("EUROPE");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		
		 codeTxt.click();
		 
		 codeTxt.clear();

		 codeTxt.sendKeys("EUROPE");
		 
		 //Thread.sleep(3000);
		 		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("********************************checkUpateForNewlyCreateAddGroupDepartment************************************");
		 
		 String expMessage="Updated Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 624, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 624, 9, resFail);
			 return false;
		 }
    }

	
	public static boolean checkUpdatedBinGroupDisplayInBinGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		
		 String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="EUROPE";*/
		 
		 
		 Thread.sleep(3000);
		 
		 int deptCount= departmentNameList.size();
			boolean dept=false;

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("EUROPE"))     
		 			{
		 				dept = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("*********************************checkUpdatedBinGroupDisplayInBinGrid******");
		 
		 
		/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 if(dept == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 625, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 625, 9, resFail);
			 return false;
		 }
    }
	
	
	
	
	
	public static boolean checkClickOnGroupToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
       /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();
		 		 
		 getAction().doubleClick(unitFirstCheckBox).perform();*/
		 
		 
		 Thread.sleep(3000);
		 int deptCount = departmentNameList.size();
			

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("EUROPE"))     
		 			{
		 				WebElement checkBox = departMentCheckboxList.get(i);
		 				getAction().doubleClick(checkBox).perform();
		 				break;
		 			}
		 		}
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountGroupTitleDisplay));
		 
		 System.out.println("accountGroupTitleDisplay"+accountGroupTitleDisplay.getText());
		 
		 System.out.println("accountGroupTitleDisplay"+accountGroupTitleDisplay.getAttribute("Value"));
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnEmptyGroup));
		
		 String actaccountGroupTitleDisplay=accountGroupTitleDisplay.getText();
		 String actclickOnEmptyGroup=clickOnEmptyGroup.getText();
		 
		 String expaccountGroupTitleDisplay="EUROPE";
		 String expclickOnEmptyGroup="No record found";
		 
		 System.out.println("**************************************************checkClickOnGroupToDisplayEmpty*********************************");
		 
		 System.out.println("accountGroupTitleDisplay      "+actaccountGroupTitleDisplay +" Value Expected  :"+expaccountGroupTitleDisplay);
		 System.out.println("clickOnEmptyGroup             "+actclickOnEmptyGroup        +" Value Expected  :"+expclickOnEmptyGroup);
		 
		 if(actaccountGroupTitleDisplay.equalsIgnoreCase(expaccountGroupTitleDisplay) && 
				 actclickOnEmptyGroup.equalsIgnoreCase(expclickOnEmptyGroup))
	
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 626, 9, resPass);
			 return true;
		 }
		 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 626, 9, resFail);
			 return false;
		 }
    }
	
	
	

	public static boolean checkSaveDepartmentInDepartmentGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			
		 masterNewBtn.click();

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 		 
		 nameTxt.sendKeys("WALES");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
         codeTxt.sendKeys("WALES");
       
         codeTxt.sendKeys(Keys.TAB);
       
         //Thread.sleep(2000);     
       
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("****************************************checkSaveDepartmentInDepartmentGroup**************************************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message    "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 627, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 627, 9, resFail);
			 return false;
		 }
    }
	
	
	
	
	
	
	
	public static boolean checkCloseOptionInBinsCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		 
		 CloseBtn.click();
		 
		
		 
		/* String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="WALES";*/
		 
		 
		 Thread.sleep(3000);
		 
		 int deptCount= departmentNameList.size();
			boolean dept=false;

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("WALES"))     
		 			{
		 				dept = true;
		 				break;
		 			}
		 		}
		 
		 
		 
		 
		 System.out.println("*********************************checkCloseOptionInBinsCreation******");
		 
		 
		/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 if(dept == true)
		 
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 628, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 628, 9, resFail);
			 return false;
		 }
    }
	
	
	public static boolean checkBinFirstLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsFirstLevelMastersDisplay));
		 
		 binsFirstLevelMastersDisplay.click();
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="EUROPE";*/
		 
		 Thread.sleep(3000);
		 
		 int deptCount= departmentNameList.size();
			boolean dept=false;

		 ArrayList<String> deptList = new ArrayList<String>();

		 		for (int i = 0; i < deptCount; i++)
		 		{
		 			 String data = departmentNameList.get(i).getText();
		 			deptList.add(data);
		 			if(data.equalsIgnoreCase("EUROPE"))     
		 			{
		 				dept = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("*********************************checkBinFirstLevel******");
		 
		 
		/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 if(dept == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 629, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 629, 9, resFail);
			 return false;
	     }
		 
    }

  
	
	public static boolean checkCloseBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsCloseBtn));
		 
		unitsCloseBtn.click();
		 
		//Thread.sleep(3000);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
			 
	    boolean actlabelDashboard                 = dashboardName.isDisplayed();
		
		boolean actnewAddDashBoard                = newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings = dashboardCustomizationSettings.isDisplayed();
		
		
		boolean explabelDashboard                 = true;
		
		boolean expnewAddDashBoard                = true;
		boolean expdashboardCustomizationSettings = true;
		
		System.out.println("********************************************** checkCloseBinsMaster ******************");
	
		System.out.println("Home Page labelDashboard Value Actual                      :"+actlabelDashboard+               "  Value Expected : "+explabelDashboard);
		
		System.out.println("Home Page newAddDashBoard Actual                           :"+actnewAddDashBoard+    "	 Value Expected : "+expnewAddDashBoard);
		System.out.println("Home Page dashboardCustomizationSettings Value Actual      :"+actdashboardCustomizationSettings+"	 Value Expected : "+expdashboardCustomizationSettings);
		
		if( actlabelDashboard==explabelDashboard 
				&& actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 630, 9, resPass);
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplayLogo));
		 userNameDisplayLogo.click();
			  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		 
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 630, 9, resFail);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 userNameDisplay.click();
			  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 logoutOption.click();
		 return false;
	 }
}
	


	public MasterDepartmentPage(WebDriver driver)
	{
		
		 PageFactory.initElements(driver, this);
		
	}

	
}
