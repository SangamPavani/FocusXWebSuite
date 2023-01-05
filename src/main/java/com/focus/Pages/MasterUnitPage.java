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

public class MasterUnitPage extends BaseEngine
{

	
		
		//Units Menu	
		 @FindBy (xpath="//*[@id='221']")
		 public static WebElement itemsMenu;
		
			//Units Menu	
			 @FindBy (xpath="//*[@id='1114']")
			 public static WebElement unitsMenu;
		 
				//Accounts Title
				@FindBy (xpath="//span[@id='spnHeaderText']")
				public static WebElement accountsTitle;
				
				
				
			    
			   
				
		
	
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
				
			
				//TreeViewID//Elements		
				
											
				
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
			    @FindBy(xpath="//*[@id='divModal_properties']/div[1]/h5")
			    public static WebElement unitsPropertiesLabel;

		 
		    //Units Creation Screen
		 
			
		    		    
		   
		    
		    @FindBy(xpath="//td[@class='text-center']")
			private static WebElement unitsInMainPageEmty;
		    
		
			
		    //Edit option Fields
		
		    
			/*@FindBy(xpath="//div[@id='idGlobalError']")
			public static WebElement validationConfirmationMessage;

			@FindBy(xpath="//div[@class='theme_color font-6']")
			public static WebElement validationUpdatingConfirmationMessage;
			
			@FindBy(xpath="//div[@id='idGlobalError']//td[3]")
			public static WebElement closeValidationConfirmationMessage;*/
			
			
			@FindBy(xpath="//*[@id='LandingGridBody']/tr[1]/td[11]")
			public static WebElement accountCreation;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
			public static WebElement accountNewCreationName;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
			public static WebElement unitNewCreationNameOfLane;               
			
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
			public static WebElement unitFirstCheckBoxToSelection;
			
			
			@FindBy(xpath="//input[@id='liSelectAllMasters']")
			public static WebElement accountMasterSelect;
		
			//Units Conversion Page			
			
			
			@FindBy(xpath="//*[@id='btnSave']/i")
			private static WebElement unitsConversionSaveButton;
			
			@FindBy(xpath="//*[@id='btnImport']")
			private static WebElement unitsConversionImportFromExcelButton;
			
			@FindBy(xpath="//*[@id='btnDelete']")
			private static WebElement unitsConversionDeleteButton;
			
			@FindBy(xpath="//*[@id='btnClearUC']")
			private static WebElement unitsConversionClearButton;
			
			@FindBy(xpath="//*[@id='ucCancel']")
			private static WebElement unitsConversionCancelButton;
			
			@FindBy(xpath="//input[@id='optionBaseUnit']")
			private static WebElement unitsConversionBaseUnit;
			
			@FindBy(xpath="//input[@id='optionProduct']")
			private static WebElement unitsConversionProduct;
			
			@FindBy(xpath="//input[@id='optionLoadFrom']")
			private static WebElement unitsConversionLoadFrom;
			
			@FindBy(xpath="//td[@id='myTagsTable_col_1-2']")
			private static WebElement unitsConversionUnit;
			
			@FindBy(xpath="//input[@id='myTagsTable_UnitName']")
			private static WebElement inputUnitConversionUnit;
					
			@FindBy(xpath="//td[@id='myTagsTable_col_1-3']")
			private static WebElement unitsConversionXFactor;
			
			@FindBy(xpath="//input[@id='myTagsTable_XFactor']")
			private static WebElement inputUnitsConversionXFactor;	
			
			@FindBy(xpath="//input[@id='myTagsTable_AdditionalQuantity']")
			private static WebElement inputUnitsConversionAdditionalQuantity;
			
			@FindBy(xpath="//td[@id='myTagsTable_col_1-4']")
			private static WebElement unitsConversionAdditionalQuantity;
			
			@FindBy(xpath="//input[@id='myTagsTable_RoundOff']")
			private static WebElement unitsConversionRoundOff;
				
			@FindBy(xpath="//td[@id='myTagsTable_col_1-0']")
			private static WebElement selectRow;
			
			@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[2]/div[2]/table/tbody/tr[1]/td[1]/div[2]/div[2]/table/tbody/tr[2]/td[2]")
			private static WebElement selectDeleteOption;
			
			@FindBy(xpath="//span[@id='DeleteData']")
			private static WebElement exchnageRateDeleteOption;
			
			//User Name Display
			
		
		    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
			private static WebElement noIn;
			
			
			//Dash board Page
		
   	    
   	    
		 
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
	
	
	Thread.sleep(4000);
	} 
			

		    
		 private static String xlfile;
		 private static String resPass="Pass";
		 private static String resFail="Fail";
		 private static ExcelReader excelReader;

	
	
	
	  public static boolean checkOpenUnitsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		Thread.sleep(2000);
		
        LoginPage lp=new LoginPage(getDriver()); 
		
		String unamelt="su";
				      
		String pawslt="su";
			
		Thread.sleep(2000);
		
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
		companyLogoImg.click();
				    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
				    	
		String getDashboard=dashboardName.getText();
	   
		System.out.println("getDashboard"+getDashboard);	
		
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	     
	    homeMenu.click();
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	     
	    mastersMenu.click();
	     
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemsMenu));
	     
	    itemsMenu.click();
	     
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsMenu));
	     
	    unitsMenu.click();
	    	  
	    Thread.sleep(3000);
	  
		
	     
		if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") /*&& getDashboard.equalsIgnoreCase("Graph with Active and setAsDefault") && accountsTitle.getText().equalsIgnoreCase("Units")*/)
		{	
				excelReader.setCellData(xlfile, "Sheet1", 477, 9, resPass);
				return true;
		}	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 477, 9, resFail);
			 return false;
		}
	}

	 public static boolean checkMainOptionsUnitsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	     
	     homeMenu.click();
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	     
	     mastersMenu.click();
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemsMenu));
	     
	     itemsMenu.click();
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsMenu));
	     
	     unitsMenu.click();
		 
	     Thread.sleep(3000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
	     
	     boolean actmasterNewBtn                =  masterNewBtn.isDisplayed();
	     boolean actmasterAddGroupBtn           =  masterAddGroupBtn.isDisplayed();
	     boolean actmasterEditBtn               =  masterEditBtn.isDisplayed();
	     boolean actmasterCloneBtn              =  masterCloneBtn.isDisplayed();
	     boolean actmasterPropertiesBtn         =  masterPropertiesBtn.isDisplayed();
	     boolean actmasterDeleteBtn             =  masterDeleteBtn.isDisplayed();
	     boolean actmasterCloseBtn              =  masterCloseBtn.isDisplayed();
	     boolean actmasterRibbonToExpandOptions =  masterRibbonToExpandOptions.isDisplayed();
			
	     boolean expmasterNewBtn               = true;
	     boolean expmasterAddGroupBtn          = true;
	     boolean expmasterEditBtn              = true;
	     boolean expmasterCloneBtn             = true;
	     boolean expmasterPropertiesBtn        = true;
	     boolean expmasterDeleteBtn            = true;
	     boolean expmasterCloseBtn             = true;
	     boolean expmasterRibbonToExpandOptions= true;
			
	     System.out.println("******************************checkMainOptionsUnitsMenu********************************************");
		
	     System.out.println("Home Page masterNewBtn Value Actual           :"+actmasterNewBtn+                "   Value Expected : "+expmasterNewBtn);
	     System.out.println("Home Page masterAddGroupBtn Value Actual      :"+actmasterAddGroupBtn+           "   Value Expected : "+expmasterAddGroupBtn);
	     System.out.println("Home Page masterEditBtn Value Actual          :"+actmasterEditBtn+               "	 Value Expected : "+expmasterEditBtn);
	     System.out.println("Home Page masterCloneBtn Value Actual         :"+actmasterCloneBtn+              "	 Value Expected : "+expmasterCloneBtn);
	     System.out.println("Home Page masterPropertiesBtn Value Actual    :"+actmasterPropertiesBtn+         "	 Value Expected : "+expmasterPropertiesBtn);
	     System.out.println("Home Page masterDeleteBtn Value Actual        :"+actmasterDeleteBtn+             "	 Value Expected : "+expmasterDeleteBtn);
	     System.out.println("Home Page masterCloseBtn Value Actual         :"+actmasterCloseBtn+              "	 Value Expected : "+expmasterCloseBtn);
	     System.out.println("Home Page Close Btn Value Actual              :"+actmasterRibbonToExpandOptions+ "	 Value Expected : "+expmasterRibbonToExpandOptions);
			
			
	     if( actmasterNewBtn==expmasterNewBtn && actmasterAddGroupBtn==expmasterAddGroupBtn
	    	     && actmasterEditBtn==expmasterEditBtn && actmasterCloneBtn==expmasterCloneBtn && actmasterPropertiesBtn==expmasterPropertiesBtn
	    	     && actmasterDeleteBtn==expmasterDeleteBtn&& actmasterCloseBtn==expmasterCloseBtn
				 && actmasterRibbonToExpandOptions==expmasterRibbonToExpandOptions)
	     
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 478, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 478, 9, resFail);
			 return false;
		 }
		
     }
		 
	 public static boolean checkToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 
		masterRibbonToExpandOptions.click();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));	
		 
		boolean actmasterGroupBtn                                                         =masterGroupBtn.isDisplayed();
		boolean actmasterDeleteAllBtn                                                     =masterDeleteAllBtn.isDisplayed();
		/*boolean actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity    =masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity.isDisplayed();
		boolean actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState             =masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState.isDisplayed();
		boolean actmasterAdvanceMasterImportORExportBtn                                   =masterAdvanceMasterImportORExportBtn.isDisplayed();
		boolean actmasterAuthorInfoBtn                                                    =masterAuthorInfoBtn.isDisplayed();
		boolean actmasterMoveUpBtn                                                        =masterMoveUpBtn.isDisplayed();
		boolean actmasterMoveDownBtn                                                      =masterMoveDownBtn.isDisplayed();*/
		boolean actmasterSortBtn                                                          =masterSortBtn.isDisplayed();
		boolean actmasterMassUpdateBtn                                                    =masterMassUpdateBtn.isDisplayed();
	/*	boolean actmasterImportFromXmlBtn                                                 =masterImportFromXmlBtn.isDisplayed();
		boolean actmasterExportFormatToXmlBtn                                             =masterExportFormatToXmlBtn.isDisplayed();
		*/
		boolean expmasterGroupBtn                                                         =true;
		boolean expmasterDeleteAllBtn                                                     =true;
		/*boolean expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity    =true;
		boolean expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState             =true;
		boolean expmasterAdvanceMasterImportORExportBtn                                   =true;
		boolean expmasterAuthorInfoBtn                                                    =true;
		boolean expmasterMoveUpBtn                                                        =true;
		boolean expmasterMoveDownBtn                                                      =true;*/
		boolean expmasterSortBtn                                                          =true;
		boolean expmasterMassUpdateBtn                                                    =true;
		/*boolean expmasterImportFromXmlBtn                                                 =true;
		boolean expmasterExportFormatToXmlBtn                                             =true;*/
		
		System.out.println("****************************** checkToolsOptionsAccountsMenu  ********************************************");
	
		System.out.println("Home Page masterGroupBtn Value Actual                          :"+actmasterGroupBtn+           "     Value Expected : "+expmasterGroupBtn);
		System.out.println("Home Page masterDeleteAllBtn Value Actual                      :"+actmasterDeleteAllBtn+       "     Value Expected : "+expmasterDeleteAllBtn);
		/*System.out.println("Home Page masterCloseAccOrItemOrUnitsOrDepOrWhOrStateOrCity    :"+actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity+       "	 Value Expected : "+expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity);
		System.out.println("Home PagemasteropenCloseAccOrItemOrDepOrWhOrState Value Actual :"+actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState+      "	 Value Expected : "+expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState);
		System.out.println("Home Page masterAdvanceMasterImportORExportBtn Value Actual    :"+actmasterAdvanceMasterImportORExportBtn+     "	 Value Expected : "+expmasterAdvanceMasterImportORExportBtn);
		System.out.println("Home Page masterAuthorInfoBtn Value Actual                     :"+actmasterAuthorInfoBtn+      "	 Value Expected : "+expmasterAuthorInfoBtn);
		System.out.println("Home Page masterMoveUpBtn Value Actual                         :"+actmasterMoveUpBtn+          "	 Value Expected : "+expmasterMoveUpBtn);
		System.out.println("Home Page masterMoveDownBtn Value Actual                       :"+actmasterMoveDownBtn+        "	 Value Expected : "+expmasterMoveDownBtn);*/
		System.out.println("Home Page masterSortBtn Value Actual                           :"+actmasterSortBtn+            "	 Value Expected : "+expmasterSortBtn);
		System.out.println("Home Page masterMassUpdateBtn Value Actual                     :"+actmasterMassUpdateBtn+      "	 Value Expected : "+expmasterMassUpdateBtn);
		/*System.out.println("Home Page masterImportFromXmlBtn Value Actual                  :"+actmasterImportFromXmlBtn+   "	 Value Expected : "+expmasterImportFromXmlBtn);
		System.out.println("Home Page masterExportFormatToXmlBtn Value Actual              :"+actmasterExportFormatToXmlBtn+"	 Value Expected : "+expmasterExportFormatToXmlBtn);*/
		
		
		if( actmasterGroupBtn==expmasterGroupBtn  && actmasterDeleteAllBtn==expmasterDeleteAllBtn
				/*&& actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity==expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity
				&& actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState==expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState
				&& actmasterAdvanceMasterImportORExportBtn==expmasterAdvanceMasterImportORExportBtn
			    && actmasterAuthorInfoBtn==expmasterAuthorInfoBtn&& actmasterMoveUpBtn==expmasterMoveUpBtn
				&& actmasterMoveDownBtn==expmasterMoveDownBtn&& */ && actmasterSortBtn==expmasterSortBtn /*&& actmasterImportFromXmlBtn==expmasterImportFromXmlBtn*/
				&& actmasterMassUpdateBtn==expmasterMassUpdateBtn /*&& actmasterExportFormatToXmlBtn==expmasterExportFormatToXmlBtn*/)
	     {	
			excelReader.setCellData(xlfile, "Sheet1", 479, 9, resPass);
			return true;
	     }	 
	     else
	    {
		   excelReader.setCellData(xlfile, "Sheet1", 479, 9, resFail);
		   return false;
	    }
		
     }
		 
	 public static boolean checkOtherToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	

		 boolean actmasterCustamizemasterBtn  =masterCustamizemasterBtn.isDisplayed();
		/* boolean actmasterCustamizeViewBtn    =masterCustamizeViewBtn.isDisplayed();*/
		 boolean actmastercustamizeTreeBtn    =mastercustamizeTreeBtn.isDisplayed();
		 
		 boolean expmasterCustamizemasterBtn  =true;
		/* boolean expmasterCustamizeViewBtn    =true;*/
		 boolean expmastercustamizeTreeBtn    =true;
		 
		 System.out.println("*********************checkOtherToolsOptionsAccountsMenu*********************************************");
		 
		System.out.println("masterCustamizemasterBtn      "+actmasterCustamizemasterBtn  +" Value Excepted  :"+expmasterCustamizemasterBtn);
	/*	System.out.println("masterCustamizeViewBtn        "+actmasterCustamizeViewBtn    +" Value Excepted  :"+expmasterCustamizeViewBtn);*/
		System.out.println("mastercustamizeTreeBtn        "+actmastercustamizeTreeBtn    +" Value Excepted  :"+expmastercustamizeTreeBtn);
		 
		 
		 if (actmasterCustamizemasterBtn==expmasterCustamizemasterBtn/* && actmasterCustamizeViewBtn==expmasterCustamizeViewBtn*/ && 
				 actmastercustamizeTreeBtn==expmastercustamizeTreeBtn) 
		  {	
				excelReader.setCellData(xlfile, "Sheet1", 480, 9, resPass);
				return true;
		  }	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 480, 9, resFail);
			 return false;
		}
		
     }
 
	 @SuppressWarnings("unchecked")
	public static boolean checkTreeViewOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));	
		 
		boolean actmasterTreeIdDropdown                =masterTreeIdDropdown.isDisplayed();
		boolean actmasterTreeIDToggleBtn               =masterTreeIDToggleBtn.isDisplayed();
		boolean actmasterTreeViewIDDropdown            =masterTreeViewIDDropdown.isDisplayed();
		boolean actmasterTreeViewIDToggleBtn           =masterTreeViewIDToggleBtn.isDisplayed();
		boolean actmasterOptionToHideAccountsGroupTree =masterOptionToHideAccountsGroupTree.isDisplayed();
		
		
		boolean expmasterTreeIdDropdown                =true;
		boolean expmasterTreeIDToggleBtn               =true;
		boolean expmasterTreeViewIDDropdown            =true;
		boolean expmasterTreeViewIDToggleBtn           =true;
		boolean expmasterOptionToHideAccountsGroupTree =true;
		
		
		System.out.println("********************checkTreeViewOptionsAccountsMenu*****************************************************************");
		
		System.out.println("masterTreeIdDropdown               "+actmasterTreeIdDropdown                +" Value Excepted  "+expmasterTreeIdDropdown);
		System.out.println("masterTreeIDToggleBtn              " +actmasterTreeIDToggleBtn              +" Value Excepted  "+expmasterTreeIDToggleBtn);
		System.out.println("masterTreeViewIDDropdown           "+actmasterTreeViewIDDropdown            +" Value Excepted  "+expmasterTreeViewIDDropdown);
		System.out.println("masterTreeViewIDToggleBtn          "+actmasterTreeViewIDToggleBtn           +" Value Excepted  "+expmasterTreeViewIDToggleBtn);
		System.out.println("masterOptionToHideAccountsGroupTree"+actmasterOptionToHideAccountsGroupTree +" Value Excepted  "+expmasterOptionToHideAccountsGroupTree);
		
		
		if (actmasterTreeIdDropdown==expmasterTreeIdDropdown && actmasterTreeIDToggleBtn==expmasterTreeIDToggleBtn && 
               actmasterTreeViewIDDropdown==expmasterTreeViewIDDropdown && actmasterTreeViewIDToggleBtn==expmasterTreeViewIDToggleBtn && 
               actmasterOptionToHideAccountsGroupTree==expmasterOptionToHideAccountsGroupTree) 
		
		{
				excelReader.setCellData(xlfile, "Sheet1", 481, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 481, 9, resFail);
			 return false;
		 }
		
      }
		 
		 
	 public static boolean checkCreateTreeToggleOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggleBtn));	
		 
		masterTreeIDToggleBtn.click();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggle_CreateTreeBtn));	
		 
		 
		boolean actmasterTreeIDToggle_CreateTreeBtn         =masterTreeIDToggle_CreateTreeBtn.isDisplayed();
		boolean actmasterTreeIDToggle_EditBtn               =masterTreeIDToggle_EditBtn.isDisplayed();
		boolean actmasterTreeIDToggle_DeleteBtn             =masterTreeIDToggle_DeleteBtn.isDisplayed();
		boolean actmasterTreeIDToggle_setDefaultBtn         =masterTreeIDToggle_setDefaultBtn.isDisplayed();
		
		
		boolean expmasterTreeIDToggle_CreateTreeBtn         =true;
		boolean expmasterTreeIDToggle_EditBtn               =true;
		boolean expmasterTreeIDToggle_DeleteBtn             =true;
		boolean expmasterTreeIDToggle_setDefaultBtn         =true;
		
		
		System.out.println("*********************checkCreateTreeToggleOptionsAccountsMenu*******************************************************");
		
		System.out.println("masterTreeIDToggle_CreateTreeBtn    "+actmasterTreeIDToggle_CreateTreeBtn +" Value Excepted  "+expmasterTreeIDToggle_CreateTreeBtn);
		System.out.println("masterTreeIDToggle_EditBtn          "+actmasterTreeIDToggle_EditBtn       +" Value Excepted  "+expmasterTreeIDToggle_EditBtn);
		System.out.println("masterTreeIDToggle_DeleteBtn        "+actmasterTreeIDToggle_DeleteBtn     +" Value Excepted  "+expmasterTreeIDToggle_DeleteBtn);
		System.out.println("masterTreeIDToggle_setDefaultBtn    "+actmasterTreeIDToggle_setDefaultBtn +" Value Excepted  "+expmasterTreeIDToggle_setDefaultBtn);
		
		if (actmasterTreeIDToggle_CreateTreeBtn==expmasterTreeIDToggle_CreateTreeBtn&& actmasterTreeIDToggle_EditBtn==expmasterTreeIDToggle_EditBtn && 
               actmasterTreeIDToggle_DeleteBtn==expmasterTreeIDToggle_DeleteBtn && actmasterTreeIDToggle_setDefaultBtn==expmasterTreeIDToggle_setDefaultBtn) 
	 
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 482, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 482, 9, resFail);
		 return false;
	 }
	
      }
 
		 
	 public static boolean checkCreateViewToggleOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIDToggleBtn));	
		 masterTreeViewIDToggleBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIdCreateViewBtn));	
		 
		 
		 boolean actmasterTreeViewIdCreateViewBtn=masterTreeViewIdCreateViewBtn.isDisplayed();
		 boolean expmasterTreeViewIdCreateViewBtn=true;
		 
		 System.out.println("*************checkCreateViewToggleOptionsAccountsMenu***********************************************");
		 
		 System.out.println("masterTreeViewIdCreateViewBtn        "+actmasterTreeViewIdCreateViewBtn +"Value Excepted  "+expmasterTreeViewIdCreateViewBtn);
		 
		 if(actmasterTreeViewIdCreateViewBtn==expmasterTreeViewIdCreateViewBtn)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 483, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 483, 9, resFail);
			 return false;
		 }
		
      }
 
	 public static boolean checkHideAccountGroupsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));	
		 masterOptionToHideAccountsGroupTree.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeUnitsDisplay));	
		 
		 boolean acttreeUnitsDisplay=treeUnitsDisplay.isDisplayed();
		 boolean exptreeUnitsDisplay=true;
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));	
		 masterOptionToHideAccountsGroupTree.click();
		 
		 System.out.println("******************checkHideAccountGroupsOptionsAccountsMenu****************************");
		 
		 System.out.println("treeUnitsDisplay         "+acttreeUnitsDisplay +" Value Excepted  "+exptreeUnitsDisplay);
		 
		 if(acttreeUnitsDisplay==exptreeUnitsDisplay)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 484, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 484, 9, resFail);
			 return false;
		 }
		
      }

			 
	 public static boolean checkMainPageHeaderFieldsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));	
		 
	    boolean actmasterSearchTxt                             = masterSearchTxt.isDisplayed();
		boolean actmasterSearchBtn                             = masterSearchBtn.isDisplayed();
		boolean actmastercmbMasterTxt                          = mastercmbMasterTxt.isDisplayed();
		boolean actmasterMoveTheSelectionToNextBookMarkBtn     = masterMoveTheSelectionToNextBookMarkBtn.isDisplayed();
		boolean actmasterMoveTheSelectionToPrevoiusBookmarkBtn = masterMoveTheSelectionToPrevoiusBookmarkBtn.isDisplayed();
		boolean actmasterShowAllRecordsBtn                     = masterShowAllRecordsBtn.isDisplayed();
		boolean actmasterShowAllUnauthorisedRecords            = masterShowAllUnauthorisedRecords.isDisplayed();
		boolean actmasterShowAllClosedRecordsBtn               = masterShowAllClosedRecordsBtn.isDisplayed();
		boolean actmasterAutoAdjustColoumnsBtn                 = masterAutoAdjustColoumnsBtn.isDisplayed();
		boolean actmasterRetainSelectionCheckBox               = masterRetainSelectionCheckBox.isDisplayed();
		boolean actmasterSideBarBtn                            = masterSideBarBtn.isDisplayed();
		
		
		boolean expmasterSearchTxt                             = true;
		boolean expmasterSearchBtn                             = true;
		boolean expmastercmbMasterTxt                          = true;
		boolean expmasterMoveTheSelectionToNextBookMarkBtn     = true;
		boolean expmasterMoveTheSelectionToPrevoiusBookmarkBtn = true;
		boolean expmasterShowAllRecordsBtn                     = true;
		boolean expmasterShowAllUnauthorisedRecords            = true;
		boolean expmasterShowAllClosedRecordsBtn               = true;
		boolean expmasterAutoAdjustColoumnsBtn                 = true;
		boolean expmasterRetainSelectionCheckBox               = true;
		boolean expmasterSideBarBtn                            = true;
		
		
		System.out.println("****************************** checkMainPageHeaderFieldsOptionsAccountsMenu ********************************************");
	
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
			excelReader.setCellData(xlfile, "Sheet1", 485, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 485, 9, resFail);
		 return false;
	 }
		
      }
	
			
		
		 
	/*public static boolean checkSearchOptionsInMainPageHeaderFieldsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));	
		 
		 masterSearchBtn.click();
		 
		 boolean actmasterSearchTxtBtn_SearchOnBtn=masterSearchTxtBtn_SearchOnBtn.isDisplayed();
		 boolean actmasterSearchTxtBtn_AdvanceSearchBtn=masterSearchTxtBtn_AdvanceSearchBtn.isDisplayed();
		 
		 boolean expmasterSearchTxtBtn_SearchOnBtn=true;
		 boolean expmasterSearchTxtBtn_AdvanceSearchBtn=true;
		 
		 System.out.println("*********************checkSearchOptionsInMainPageHeaderFieldsOptionsAccountsMenu**********************************");
		 
		 System.out.println("masterSearchTxtBtn_SearchOnBtn          "+actmasterSearchTxtBtn_SearchOnBtn      +" Value Excepted  "+expmasterSearchTxtBtn_SearchOnBtn);
		 System.out.println("masterSearchTxtBtn_AdvanceSearchBtn     "+actmasterSearchTxtBtn_AdvanceSearchBtn +" Value Excepted  "+expmasterSearchTxtBtn_AdvanceSearchBtn);
		 
		 if(actmasterSearchTxtBtn_SearchOnBtn==expmasterSearchTxtBtn_SearchOnBtn && 
				 actmasterSearchTxtBtn_AdvanceSearchBtn==expmasterSearchTxtBtn_AdvanceSearchBtn)
		 {	
			 excelReader.setCellData(xlfile, "Sheet1", 486, 9, resPass);
			 return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 486, 9, resFail);
			 return false;
		 }
		
      }*/
	
		    
			
	public static boolean checkNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			
		 masterNewBtn.click();
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemRoundingTypeDropdown));
		
		 Select oSelect = new Select(itemRoundingTypeDropdown);
		 List <WebElement> elementCount = oSelect.getOptions();
		
		 int roundTypeDropdown = elementCount.size();
		 System.out.println("Account Type :"+roundTypeDropdown);
		 		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitTypeDropdown));
			
		 Select uSelect = new Select(unitTypeDropdown);
		 List <WebElement> elementunitCount = uSelect.getOptions();
		
		 int unitTypeSize = elementunitCount.size();
		 System.out.println("Account Type :"+unitTypeSize);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 boolean actnameTxt                 = nameTxt.isDisplayed();
		 boolean actcodeTxt                 = codeTxt.isDisplayed();
		 boolean actnoOfDecimalsTxt         = noOfDecimalsTxt.isDisplayed();
		 boolean actitemRoundingTypeDropdown    = itemRoundingTypeDropdown.isDisplayed();
		 boolean actunitTypeDropdown        = unitTypeDropdown.isDisplayed();
		 boolean acttreeUnitsDisplay        = treeUnitsDisplay.isDisplayed();
		 
		 
		 boolean expnameTxt                 = true;
		 boolean expcodeTxt                 = true;
		 boolean expnoOfDecimalsTxt         = true;
		 boolean expitemRoundingTypeDropdown    = true;
		 boolean expunitTypeDropdown        = true;
		 boolean exptreeUnitsDisplay        = true;
		 
		 
		 System.out.println("***********************checkNewButtonBeforeCustomization**********************************");
		 
		 System.out.println("nameTxt                "+actnameTxt              +" Value Excepted  "+expnameTxt);
		 System.out.println("codeTxt                "+actcodeTxt              +"Value Excepted   "+expcodeTxt);
		 System.out.println("noOfDecimalsTxt        "+actnoOfDecimalsTxt      +"Value Excepted   "+expnoOfDecimalsTxt);
		 System.out.println("itemRoundingTypeDropdown   "+actitemRoundingTypeDropdown +"Value Excepted   "+expitemRoundingTypeDropdown);
		 System.out.println("unitTypeDropdown       "+actunitTypeDropdown     +"Value Excepted   "+expunitTypeDropdown);
		 System.out.println("treeUnitsDisplay       "+acttreeUnitsDisplay     +"Value Excepted   "+exptreeUnitsDisplay);
		 
		 
		 if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actnoOfDecimalsTxt==expnoOfDecimalsTxt && 
				 actitemRoundingTypeDropdown==expitemRoundingTypeDropdown && actunitTypeDropdown==expunitTypeDropdown &&
				 acttreeUnitsDisplay==exptreeUnitsDisplay && roundTypeDropdown==3 && unitTypeSize==2 )
		 
		 {
			 
			 excelReader.setCellData(xlfile, "Sheet1", 487, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 487, 9, resFail);
			 return false;
		 }
      }
	
			
			
	public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInNewOptionBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("************************checkSaveButtonWithoutInputNameMandatoryFieldsInNewOptionBeforeCustomization**************");
		 
		 String expMessage="In Tab :General ---> Name Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 488, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 488, 9, resFail);
			 return false;
		 }
      }
			
			
	public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInNewOptionBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.sendKeys("Pc");
		
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("**********************checkSaveButtonWithoutInputCodeMandatoryFieldsInNewOptionBeforeCustomization****************");
		 
		 String expMessage="In Tab :General ---> Code Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 489, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 489, 9, resFail);
			 return false;
		 }
      }
	
	public static boolean checkSaveButtonWithoutInputDecimalsFieldMandatoryFieldsInNewOptionBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
         codeTxt.sendKeys("Pc");
         
         Thread.sleep(2000);
         
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("***************************checkSaveButtonWithoutInputDecimalsFieldMandatoryFieldsInNewOptionBeforeCustomization***************");
		 
		 String expMessage="In Tab :General ---> No of decimals Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 490, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 490, 9, resFail);
			 return false;
		 }
      }
	
			
			
	// Fails Due to Focus Staying on Save Button And Cannot capture Error Message But Saves the Data
	public static boolean checkSaveButtonWithInputingMandatoryFieldsBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxt));
		 
		 noOfDecimalsTxt.click();
		 
		 noOfDecimalsTxt.clear();
		 Thread.sleep(1000);
		 noOfDecimalsTxt.sendKeys("2");
         
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("************************checkSaveButtonWithInputingMandatoryFieldsBeforeCustomization**************************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 Thread.sleep(2000);
			 excelReader.setCellData(xlfile, "Sheet1", 491, 9, resPass);
			 return true;
		 }
		 else
		 {
			 Thread.sleep(2000);
			 excelReader.setCellData(xlfile, "Sheet1", 491, 9, resFail);
			 return false;
		 }
      }
	
			
			
	public static boolean checkUnitsCreationScreenAfterSavingBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 
  		 
  		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		
		 nameTxt.click();

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemRoundingTypeDropdown));
			
		 Select oSelect = new Select(itemRoundingTypeDropdown);
		 List <WebElement> elementCount = oSelect.getOptions();
		
		 int roundTypeDropdown = elementCount.size();
		 System.out.println("Account Type :"+roundTypeDropdown);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitTypeDropdown));
			
		 Select uSelect = new Select(unitTypeDropdown);
		 List <WebElement> elementunitCount = uSelect.getOptions();
		
		 int unitTypeSize = elementunitCount.size();
		 System.out.println("Account Type :"+unitTypeSize);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 boolean actnameTxt                 = nameTxt.isDisplayed();
		 boolean actcodeTxt                 = codeTxt.isDisplayed();
		 boolean actnoOfDecimalsTxt         = noOfDecimalsTxt.isDisplayed();
		 boolean actitemRoundingTypeDropdown    = itemRoundingTypeDropdown.isDisplayed();
		 boolean actunitTypeDropdown        = unitTypeDropdown.isDisplayed();
		 boolean acttreeUnitsDisplay        = treeUnitsDisplay.isDisplayed();
		 
		 
		 boolean expnameTxt                 = true;
		 boolean expcodeTxt                 = true;
		 boolean expnoOfDecimalsTxt         = true;
		 boolean expitemRoundingTypeDropdown    = true;
		 boolean expunitTypeDropdown        = true;
		 boolean exptreeUnitsDisplay        = true;
		 
		 
		 System.out.println("**********************checkUnitsCreationScreenAfterSavingBeforeCustomization**************");
		 
		 System.out.println("nameTxt                "+actnameTxt              +" Value Excepted  "+expnameTxt);
		 System.out.println("codeTxt                "+actcodeTxt              +"Value Excepted   "+expcodeTxt);
		 System.out.println("noOfDecimalsTxt        "+actnoOfDecimalsTxt      +"Value Excepted   "+expnoOfDecimalsTxt);
		 System.out.println("itemRoundingTypeDropdown   "+actitemRoundingTypeDropdown +"Value Excepted   "+expitemRoundingTypeDropdown);
		 System.out.println("unitTypeDropdown       "+actunitTypeDropdown     +"Value Excepted   "+expunitTypeDropdown);
		 System.out.println("treeUnitsDisplay       "+acttreeUnitsDisplay     +"Value Excepted   "+exptreeUnitsDisplay);
		 
		 
		 if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actnoOfDecimalsTxt==expnoOfDecimalsTxt && 
				 actitemRoundingTypeDropdown==expitemRoundingTypeDropdown && actunitTypeDropdown==expunitTypeDropdown &&
				 acttreeUnitsDisplay==exptreeUnitsDisplay && roundTypeDropdown==3 && unitTypeSize==2 )
		 
		 {
			 
			 excelReader.setCellData(xlfile, "Sheet1", 492, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 492, 9, resFail);
			 return false;
		 }
      }
	
			
	public static boolean checkUnitDisplayInUnitsGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 
		 closeBtn.click();
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 System.out.println("New"+accountNewCreationName.getText());
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="Pc";*/
		 
		 
		 
		 int unitsCount = unitNameList.size();
			boolean pc =false;

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("Pc"))     
		 			{
		 				pc = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("*********************************checkUnitDisplayInUnitsGridBeforeCustomization************");
		 
		/* System.out.println("accountNewCreationName    :"+actaccountNewCreationName +" Value Excepted  "+expaccountNewCreationName);*/
		 
		 if(pc == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 493, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 493, 9, resFail);
			 return false;
		 }
      }


	

	public static boolean checkEditOptionForNewlyCreatedUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();
		 */
		 
		 
		 int unitsCount = unitNameList.size();
			

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("Pc"))     
		 			{
		 				unitsCheckBoxList.get(i).click();
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
		 
		 
		 String actnameTxt=nameTxt.getAttribute("value");
		 String expnameTxt="Pc";
		 
		 
		 System.out.println("****************checkEditOptionForNewlyCreatedUnit****************");
		 
		 System.out.println("nameTxt      "+actnameTxt  +" Value Excepted  "+expnameTxt);
		 
		 if(actnameTxt.equalsIgnoreCase(expnameTxt))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 494, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 494, 9, resFail);
			 return false;
		 }
      }
	
			
	public static boolean checkUpateForNewlyCreateAccountBeforeCustomiztaion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 	 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 nameTxt.clear();
		 
		 nameTxt.sendKeys("Pcs");
		 
		 getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();
		 
		 Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.click();
		 
		 codeTxt.clear();
		 
		 codeTxt.sendKeys("Pcs");
		 
		 getAction().moveToElement(codeTxt).sendKeys(Keys.TAB).perform();
		 
		 Thread.sleep(3000);
	
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
     
         nameTxt.click();
         
         Thread.sleep(2000);
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 
		 System.out.println("*******************************checkUpateForNewlyCreateAccountBeforeCustomiztaion************************");
		 
		 String expMessage="Updated Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 495, 9, resPass);
			 return true;
		 }
		 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 495, 9, resFail);
			 return false;
		 }
      }

			
	public static boolean checkUpdatedAccountDisplayInAccountGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 System.out.println("New"+accountNewCreationName.getText());
		 
		 String getAccountNewCreationOfLane=accountNewCreationName.getText();
		 
		 String expgetAccountNewCreationOfLane="Pcs";
		 */
		 
		 
		 int unitsCount = unitNameList.size();
			boolean pcs =false;

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("Pcs"))     
		 			{
		 				pcs = true;
		 				break;
		 			}
		 		}
		 System.out.println("**************************checkUpdatedAccountDisplayInAccountGridBeforeCustomization**************");
		 
	/*	 System.out.println("getAccountNewCreationOfLane   "+getAccountNewCreationOfLane +" Value Excepted  :"+expgetAccountNewCreationOfLane);*/
		 
		 
		 if(pcs == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 496, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 496, 9, resFail);
			 return false;
		 }
      }
	
		
	
	
				
	public static boolean checkCloneButtonAndSaveInUnitsMasterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click(); */
		 
		 
		 Thread.sleep(3000);
		 
		 int unitsCount = unitNameList.size();
		

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("Pcs"))     
		 			{
		 				unitsCheckBoxList.get(i).click();
		 				break;
		 			}
		 		}


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		 
		 masterEditBtn.click();

		 Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editcloneBtn));
			
		 editcloneBtn.click();						  		 
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 

		 nameTxt.sendKeys("Dozs");
		 
		 getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.sendKeys("Dozs");
		 
		 getAction().moveToElement(codeTxt).sendKeys(Keys.TAB).perform();
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxt));
		 
		 noOfDecimalsTxt.click();
		
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("****************************checkCloneButtonAndSaveInUnitsMasterCreation************************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 Thread.sleep(2000);
			 excelReader.setCellData(xlfile, "Sheet1", 497, 9, resPass);
			 return true;
		 }
		 else
		 {
			 Thread.sleep(2000);
			 excelReader.setCellData(xlfile, "Sheet1", 497, 9, resFail);
			 return false;
		 }
      }
	
		
		
		
		
		
		
		
		
		
	public static boolean checkUnitDisplayInUnitsSavingWithCloneMasterCreationOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="Dozs";*/
		 
		 
		 int unitsCount = unitNameList.size();
			boolean dozs =false;

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("Dozs"))     
		 			{
		 				dozs = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("***********checkUnitDisplayInUnitsSavingWithCloneMasterCreationOptions*********");
		 
		/* System.out.println("accountNewCreationName    : "+actaccountNewCreationName +" Value Excepted  "+expaccountNewCreationName);*/
	
		 
		 if(dozs == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 498, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 498, 9, resFail);
			 return false;
		 }
      }



		
		
	public static boolean checkCloneButtonAndSaveInUnitsMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
		 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();
		 */
		 
		 
		 int unitsCount = unitNameList.size();
			

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("Dozs"))     
		 			{
		 				unitsCheckBoxList.get(i).click();
		 				break;
		 			}
		 		}
		 

		 //Copy and Clone is checked at once
		 
		 //First Copy is selected then the Clone 
							  		 
		 
		 Thread.sleep(3000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloneBtn));
			
		 masterCloneBtn.click();
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();

		 nameTxt.sendKeys("Box");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.sendKeys("Box");
		 
		 codeTxt.sendKeys(Keys.TAB);
		 
		 
		 //here we are doing copy option
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyBtn));
			
		 copyBtn.click();
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("****************************checkCloneButtonAndSaveInUnitsMasterOptions****************************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
		
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
		   
		   excelReader.setCellData(xlfile, "Sheet1", 499, 9, resPass);
		   return true;
		 }
		 else
		 {
			
			 excelReader.setCellData(xlfile, "Sheet1", 499, 9, resFail);
			 return false;
		 }
      }
	
	
		
		
		
	public static boolean checkUnitDisplayInUnitsSavingWithCloneMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="Box";*/
		 
		 
		 int unitsCount = unitNameList.size();
			boolean box =false;

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("Box"))     
		 			{
		 				box = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("***********checkUnitDisplayInUnitsSavingWithCloneMasterOptions*********");
		 
		 /*System.out.println("accountNewCreationName    : "+actaccountNewCreationName +" Value Excepted  "+expaccountNewCreationName);*/
		 
		 
		 if(box == true)
		 
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 500, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 500, 9, resFail);
			 return false;
		 }
      }


	public static boolean checkCopyOptionByPasteOptionWithNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			
		masterNewBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteBtn));
		 
		pasteBtn.click();
		 
		//here we are doing copy option
		
		Thread.sleep(3000);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		nameTxt.click();
		 
		nameTxt.clear();

		nameTxt.sendKeys("Pc");
		 
		getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		codeTxt.click();
		 
		codeTxt.clear();
		 
		codeTxt.sendKeys("Pc");
		 
		codeTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		SaveBtn.click();
		
		System.out.println("*********************************************checkCopyOptionByPasteOptionWithNewButton*****************************************");
		
		String expMessage="Saved Successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		 
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			 
			 excelReader.setCellData(xlfile, "Sheet1", 501, 9, resPass);
			 return true;
		}
	    else
		{
			 
			 excelReader.setCellData(xlfile, "Sheet1", 501, 9, resFail);
			 return false;
		 }
      }
	
	
	public static boolean checkUnitDisplayInUnitsSavingWithCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 
		 closeBtn.click();
		 
		 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="Pc";
		 */
		 
		 
		 int unitsCount = unitNameList.size();
			boolean pc =false;

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("Pc"))     
		 			{
		 				pc = true;
		 				break;
		 			}
		 		}
		 System.out.println("*************************checkUnitDisplayInUnitsSavingWithCopyAndPaste*********");
		 
		 /*System.out.println("accountNewCreationName    : "+actaccountNewCreationName +" Value Excepted  "+expaccountNewCreationName);*/
		 
		 if(pc == true)
		 
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 502, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 502, 9, resFail);
			 return false;
		 }
      }
	
	

		
				
	public static boolean checkCreateNewUnitForProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			
		 masterNewBtn.click();
			  		 
	
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 nameTxt.clear();
	
		 nameTxt.sendKeys("PIAU");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.click();
		 
		 codeTxt.clear();
		 
		 codeTxt.sendKeys("PIAU");
		 
		 codeTxt.sendKeys(Keys.TAB);
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxt));
		 
		 noOfDecimalsTxt.click();
		 
		 noOfDecimalsTxt.clear();
		 
		 noOfDecimalsTxt.sendKeys("2");
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
		 
		 System.out.println("validationConfirmationMessage"+validationConfirmationMessage.getText());
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
		 
		 closeValidationConfirmationMessage.click();*/
		 Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			 
		 closeBtn.click();
			 
		 		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();*/
		 
		 
		 int unitsCount = unitNameList.size();
			

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("PIAU"))     
		 			{
		 				unitsCheckBoxList.get(i).click();
		 				break;
		 			}
		 		}

		 		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		 
		 masterPropertiesBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsPropertiesLabel));
	 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsPropertiesLabel));
	     
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsPropertiesLabel));
		 
		 boolean actunitsPropertiesLabel                                 = unitsPropertiesLabel.isDisplayed();
		 boolean actstatusDropdown                                         = statusDropdown.isDisplayed();
		 boolean actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox  = doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox.isDisplayed();
		 boolean actallowOtherCompaniesToViewRecordsCheckbox               = allowOtherCompaniesToViewRecordsCheckbox.isDisplayed();
		
		 boolean expunitsPropertiesLabel                                 = true;
		 boolean expstatusDropdown                                         = true;
		 boolean expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox  = true;
		 boolean expallowOtherCompaniesToViewRecordsCheckbox               = true;
		
		 System.out.println("  ******************************************checkCreateNewUnitForProperties************************************");
		 
		 System.out.println("unitsPropertiesLabel                                "+actunitsPropertiesLabel        +" Value Excepted  "+expunitsPropertiesLabel);
		 System.out.println("statusDropdown                                        "+actstatusDropdown              +"Value Excepted   "+expstatusDropdown);
		 System.out.println("doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox "+actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox      +"Value Excepted   "+expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox);
		 System.out.println("allowOtherCompaniesToViewRecordsCheckbox              "+actallowOtherCompaniesToViewRecordsCheckbox +"Value Excepted   "+expallowOtherCompaniesToViewRecordsCheckbox);
		 
		 
		 if(actunitsPropertiesLabel==expunitsPropertiesLabel && actstatusDropdown==expstatusDropdown &&
				 actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox==expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox && 
				 actallowOtherCompaniesToViewRecordsCheckbox==expallowOtherCompaniesToViewRecordsCheckbox  )
		 
		 {	
			 excelReader.setCellData(xlfile, "Sheet1", 503, 9, resPass);
			 return true;
		 }
		 else
		 {
	
			 excelReader.setCellData(xlfile, "Sheet1", 503, 9, resFail);
			 return false;
		 }
				 
      }
	
		

	public static boolean checkInActiveBySelectingOkButtonInPropertiesOptionForAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(statusDropdown));
		 
        statusDropdown.click();
        
        statusDropdown.sendKeys("Inactive");
        
        Thread.sleep(2000);
        
        statusDropdown.sendKeys(Keys.TAB);
		 

         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(properties_okBtn));
		 
         properties_okBtn.click();
        
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="PIAU";*/
         
         int unitsCount = unitNameList.size();
			boolean piau =false;

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("PIAU"))     
		 			{
		 				piau = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("****************checkInActiveBySelectingOkButtonInPropertiesOptionForAccount**********");
		 
		/* System.out.println("accountNewCreationName    :"+actaccountNewCreationName +" Value Excepted  "+expaccountNewCreationName);*/
		 
		 
		 if(piau == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 504, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 504, 9, resFail);
			 return false;
		 }
      }
	
	
	public static boolean checkCreateNewUnitForDeleteOptionValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			
		 masterNewBtn.click();
			  		 
	
		 Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 nameTxt.clear();
	
		 nameTxt.sendKeys("PUD");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.click();
		 
		 codeTxt.clear();
		 
		 codeTxt.sendKeys("PUD");
		 
		 codeTxt.sendKeys(Keys.TAB);
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxt));
		 
		 noOfDecimalsTxt.click();
		 
		 noOfDecimalsTxt.clear();
		 
		 noOfDecimalsTxt.sendKeys("2");
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
		 
		 System.out.println("validationConfirmationMessage"+errorMessage.getText());
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		 errorMessageCloseBtn.click();
		 
		 Thread.sleep(3000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterSelect));
		 accountMasterSelect.click();
		  
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterSelect));
		 accountMasterSelect.click();
		 
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
		 int unitsCount = unitNameList.size();
			

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("PUD"))     
		 			{
		 				unitsCheckBoxList.get(i).click();
		 				break;
		 			}
		 		}

		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
	     masterDeleteBtn.click();
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
	     
	     System.out.println(getMsgOnDelete.getText());
	     
	     System.out.println(getMsgOnDelete.getAttribute("Value"));
	     
	     String actgetMsgOnDelete=getMsgOnDelete.getText();
	     
	     String expgetMsgOnDelete="Would you like to delete this selected master";
	     
	     

	     System.out.println("*************************checkCreateNewUnitForDeleteOptionValidationMessage*************");
	     
	     System.out.println("getMsgOnDelete                  "+actgetMsgOnDelete +" Value Excepted  :"+expgetMsgOnDelete);
	     
	     
		 if(actgetMsgOnDelete.equalsIgnoreCase(expgetMsgOnDelete))
		 {
	
			 excelReader.setCellData(xlfile, "Sheet1", 505, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 505, 9, resFail);
			 return false;
		 }
    }
	
	
	

	public static boolean checkOkInDeleteValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 Thread.sleep(2000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
	    
	     clickOnOkInDelete.click();
	     
	     System.out.println("**********************************checkOkInDeleteValidationMessage***********************************");
	     
	     String expMessage="Record Deleted Successfully.";
			
	     String actMessage=checkValidationMessage(expMessage);
	     
	     System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
	     
	     if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 506, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 506, 9, resFail);
			 return false;
		 }	 
	}
	
		
	public static boolean checkDeleteAccountDisplayBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="PIAU";*/
		 
		 
		 int unitsCount = unitNameList.size();
			boolean pud =false;

		 ArrayList<String> accountslist = new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = unitNameList.get(i).getText();
		 			accountslist.add(data);
		 			if(data.equalsIgnoreCase("PIAU"))     
		 			{
		 				pud = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("****************checkInActiveBySelectingOkButtonInPropertiesOptionForAccount**********");
		 
		/* System.out.println("accountNewCreationName    :"+actaccountNewCreationName +" Value Excepted  "+expaccountNewCreationName);*/
		 
		 
		 if(pud == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 507, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 507, 9, resFail);
			 return false;
		 }
	        	 
	}
	 	 	
	public static boolean checkCloseUnitsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsCloseBtn));
		 
		 unitsCloseBtn.click();
		 
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
		
		boolean actlabelDashboard                 = dashboardName.isDisplayed();
		/*boolean actselectDashboard                = selectDashboard.isDisplayed();*/
		boolean actnewAddDashBoard                = newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings = dashboardCustomizationSettings.isDisplayed();
		
		boolean explabelDashboard                 = true;
		/*boolean expselectDashboard                = true;*/
		boolean expnewAddDashBoard                = true;
		boolean expdashboardCustomizationSettings = true;
		
		System.out.println("***************************************** checkCloseUnitsMaster ******************");
	
		System.out.println("Home Page labelDashboard Value Actual                      :"+actlabelDashboard+               "  Value Expected : "+explabelDashboard);
		/*System.out.println("Home Page selectDashboard Value Actual                     :"+actselectDashboard+   "  Value Expected : "+expselectDashboard);*/
		System.out.println("Home Page newAddDashBoard Actual                           :"+actnewAddDashBoard+    "	 Value Expected : "+expnewAddDashBoard);
		System.out.println("Home Page dashboardCustomizationSettings Value Actual      :"+actdashboardCustomizationSettings+"	 Value Expected : "+expdashboardCustomizationSettings);
		
		if( actlabelDashboard==explabelDashboard /* && actselectDashboard==expselectDashboard*/
				&& actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings)
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 508, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 508, 9, resFail);
			 return false;
		 }
	  }
	
	
	//Units Conversion
		
	public static boolean checkUnitsConversionTitle() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	     
	     homeMenu.click();
		
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	     
	     mastersMenu.click();
	     
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemsMenu));
	     
         itemsMenu.click();
	     
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionMenu));
	     
         unitsConversionMenu.click();
	    	  
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionTitle));		
	 
	     
	     String actunitsConversionTitle=unitsConversionTitle.getText();
	     String expunitsConversionTitle="Unit Conversion";
	     
	     
	     System.out.println("**********************checkUnitsConversionTitle********************************************");
	     
	     System.out.println("unitsConversionTitle     "+actunitsConversionTitle +" Value Excepted  : "+expunitsConversionTitle);
	     
	     
		 if(actunitsConversionTitle.equalsIgnoreCase(expunitsConversionTitle))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 509, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 509, 9, resFail);
			 return false;
		 }
      }
			
		
	
		
		
		
	public static boolean checkUnitsConversionFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));		
	     
	     boolean actunitsConversionSaveButton                 =unitsConversionSaveButton.isDisplayed();
	     boolean actunitsConversionImportFromExcelButton      =unitsConversionImportFromExcelButton.isDisplayed();
	     boolean actunitsConversionDeleteButton               =unitsConversionDeleteButton.isDisplayed();
	     boolean actunitsConversionClearButton                =unitsConversionClearButton.isDisplayed();
	     boolean actunitsConversionCancelButton               =unitsConversionCancelButton.isDisplayed();
	     boolean actunitsConversionBaseUnit                   =unitsConversionBaseUnit.isDisplayed();
	     boolean actunitsConversionProduct                    =unitsConversionProduct.isDisplayed();
	     boolean actunitsConversionLoadFrom                   =unitsConversionLoadFrom.isDisplayed();
	     boolean actunitsConversionUnit                       =unitsConversionUnit.isDisplayed();
	     boolean actunitsConversionXFactor                    =unitsConversionXFactor.isDisplayed();
	     boolean actunitsConversionAdditionalQuantity         =unitsConversionAdditionalQuantity.isDisplayed();
			
			
	     boolean expunitsConversionSaveButton                 =true;
	     boolean expunitsConversionImportFromExcelButton      =true;
	     boolean expunitsConversionDeleteButton               =true;
	     boolean expunitsConversionClearButton                =true;
	     boolean expunitsConversionCancelButton               =true;
	     boolean expunitsConversionBaseUnit                   =true;
	     boolean expunitsConversionProduct                    =true;
	     boolean expunitsConversionLoadFrom                   =true;
	     boolean expunitsConversionUnit                       =true;
	     boolean expunitsConversionXFactor                    =true;
	     boolean expunitsConversionAdditionalQuantity         =true;
			
			
	     System.out.println("******************************checkUnitsConversionFields ********************************************");
		
	     System.out.println("unitsConversionSaveButton Value Actual              :"+actunitsConversionSaveButton+            "    Value Expected : "+expunitsConversionSaveButton);
	     System.out.println("unitsConversionImportFromExcelButton Value Actual   :"+actunitsConversionImportFromExcelButton+ "    Value Expected : "+expunitsConversionImportFromExcelButton);
	     System.out.println("unitsConversionDeleteButton Value Actual            :"+actunitsConversionDeleteButton+          "	 Value Expected : "+expunitsConversionDeleteButton);
	     System.out.println("unitsConversionClearButtonValue Actual              :"+actunitsConversionClearButton+           "	 Value Expected : "+expunitsConversionClearButton);
	     System.out.println("unitsConversionCancelButtonValue Actual             :"+actunitsConversionCancelButton+          "	 Value Expected : "+expunitsConversionCancelButton);
	     System.out.println("unitsConversionBaseUnit Value Actual                :"+actunitsConversionBaseUnit+              "	 Value Expected : "+expunitsConversionBaseUnit);
	     System.out.println("unitsConversionProduct Value Actual                 :"+actunitsConversionProduct+               "	 Value Expected : "+expunitsConversionProduct);
	     System.out.println("unitsConversionLoadFrom Value Actual                :"+actunitsConversionLoadFrom+              "	 Value Expected : "+expunitsConversionLoadFrom);
	     System.out.println("unitsConversionUnit Value Actual                    :"+actunitsConversionUnit+                  "	 Value Expected : "+expunitsConversionUnit);
	     System.out.println("unitsConversionXFactor Value Actual                 :"+actunitsConversionXFactor+               "	 Value Expected : "+expunitsConversionXFactor);
	     System.out.println("unitsConversionAdditionalQuantity Value Actual      :"+actunitsConversionAdditionalQuantity+    "	 Value Expected : "+expunitsConversionAdditionalQuantity);
			
			
	     if( actunitsConversionSaveButton==expunitsConversionSaveButton  && actunitsConversionImportFromExcelButton==expunitsConversionImportFromExcelButton 
	    	     && actunitsConversionDeleteButton==expunitsConversionDeleteButton && actunitsConversionClearButton==expunitsConversionClearButton 
	    	     && actunitsConversionCancelButton==expunitsConversionCancelButton 
			     && actunitsConversionBaseUnit==expunitsConversionBaseUnit && actunitsConversionProduct==expunitsConversionProduct
			     && actunitsConversionLoadFrom==expunitsConversionLoadFrom && actunitsConversionUnit==expunitsConversionUnit
				 && actunitsConversionXFactor==expunitsConversionXFactor
				 && actunitsConversionAdditionalQuantity==expunitsConversionAdditionalQuantity)
	     
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 510, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 510, 9, resFail);
			 return false;
		 }
      }
			
		
		public static boolean checkSaveButtonWithoutInputBaseUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));		
			 
			 unitsConversionSaveButton.click();
			 
			 System.out.println("******************************checkSaveButtonWithoutInputBaseUnit*********************");
			 
			 String expMessage="Select base unit";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 511, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 511, 9, resFail);
				 return false;
			 }
	      }
		
		
		
		public static boolean checkSaveButtonWithoutInputUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			 Thread.sleep(5000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
			 
			 unitsConversionBaseUnit.click();
			 
			 unitsConversionBaseUnit.sendKeys("Pc");		
			 
			 Thread.sleep(3000);
			 
			 unitsConversionBaseUnit.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
			 
			 unitsConversionSaveButton.click();
			 
			 
			 System.out.println("*****************************checkSaveButtonWithoutInputUnit*************************");
			 
			 String expMessage="Select the Unit first";
				
			 String actMessage=checkValidationMessage(expMessage);
			

			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 512, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 512, 9, resFail);
				 return false;
			 }
	      }
	
	
	public static boolean checkSaveButtonWithoutInputXFactor() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
		 
		 unitsConversionBaseUnit.click();
		 
		 unitsConversionBaseUnit.sendKeys(Keys.END);
		 unitsConversionBaseUnit.sendKeys(Keys.SHIFT,Keys.HOME);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.BACK_SPACE);
		 
		 unitsConversionBaseUnit.sendKeys("Pcs");
		 	 
		 Thread.sleep(2000);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.TAB);
		 	
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
		 
		 unitsConversionProduct.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionLoadFrom));
		 
		 unitsConversionLoadFrom.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitConversionUnit));
		 
		 inputUnitConversionUnit.click();
		 
		 inputUnitConversionUnit.sendKeys("Dozs");
		 
		 Thread.sleep(2000);
		 
		 inputUnitConversionUnit.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
		 
		 unitsConversionSaveButton.click();
		 
		 System.out.println("**********************checkSaveButtonWithoutInputXFactor***********************");
		 
		 
		 String expMessage="Enter X Factor in Row1";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 513, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 513, 9, resFail);
			 return false;
		 }
      }
	
		
	public static boolean checkClearButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionClearButton));		
		 
		 unitsConversionClearButton.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));	
		 
		 unitsConversionSaveButton.click();
		 
		 System.out.println("*******************************checkClearButton********************************");
		 
		 String expMessage="Select base unit";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 514, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 514, 9, resFail);
			 return false;
		 }
      }
	
	
	public static boolean checkSaveButtonWithAllInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
		 
		 unitsConversionBaseUnit.click();
		 unitsConversionBaseUnit.clear();
		 unitsConversionBaseUnit.sendKeys("Pcs");
		 
		 Thread.sleep(2000);
		 	 
		 unitsConversionBaseUnit.sendKeys(Keys.TAB);
		 
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
		 
		 unitsConversionProduct.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionLoadFrom));
		 
		 unitsConversionLoadFrom.sendKeys(Keys.TAB);
		 
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitConversionUnit));
		 
		 inputUnitConversionUnit.sendKeys("Dozs");
	
		 Thread.sleep(2000);
		 
		 inputUnitConversionUnit.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionXFactor));
		 
		 inputUnitsConversionXFactor.sendKeys("10");
		 
		 
		 	 
		 inputUnitsConversionXFactor.sendKeys(Keys.TAB);
		 
		 
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
		 
		 unitsConversionSaveButton.click();

		 
		 System.out.println("***************************************checkSaveButtonWithAllInputs**************************************");
		 
		 String expMessage="Successfully saved";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 515, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 515, 9, resFail);
			 return false;
		 }
      }
	
	
	
	public static boolean checkUpdateButtonWithAllInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
		 
		 unitsConversionBaseUnit.click();
		 unitsConversionBaseUnit.clear();
		 
		 unitsConversionBaseUnit.sendKeys("Pcs");
		 
		 Thread.sleep(2000);
		 	 
		 unitsConversionBaseUnit.sendKeys(Keys.TAB);
		 
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
		 
		 unitsConversionProduct.sendKeys(Keys.TAB);
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitConversionUnit));
		 
		 inputUnitConversionUnit.sendKeys(Keys.TAB);
		 
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionXFactor));
		 
		 inputUnitsConversionXFactor.click();
	
		 inputUnitsConversionXFactor.clear();
		 
		 inputUnitsConversionXFactor.sendKeys("12");
		 
		 Thread.sleep(2000);
		 	 
		 inputUnitsConversionXFactor.sendKeys(Keys.TAB);
		 
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
		 
		 unitsConversionSaveButton.click();
		 
		 System.out.println("********************************checkUpdateButtonWithAllInputs*************************************");
		 
		 String expMessage="Successfully saved";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Error Message              "+actMessage +" Value Expected  :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 516, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 516, 9, resFail);
			 return false;
		 }
      }
	
	@FindBy(xpath="//*[@id='myTagsTable_body']//tr[1]//td[1]")
	public static WebElement Unit_1stRow1stCol;
	
	
	@FindBy(xpath="//*[@id='id_UnitConversoin_body_menu']/a[1]")
	public static WebElement Unit_DeleteRow;
	
	
	@FindBy(xpath="//*[@id='id_UnitConversoin_body_menu']/a[2]")
	public static WebElement Unit_InsertRow;
	
	@FindBy(xpath="//*[@id='id_UnitConversoin_body_menu']/a[3]")
	public static WebElement Unit_SelectRow;
	
	

	public static boolean checkRowDeleteFieldInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
		 
		 unitsConversionBaseUnit.click();
		 
		 unitsConversionBaseUnit.sendKeys("Pcs");
		 	 
		 Thread.sleep(2000);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.TAB);
		 
		 unitsConversionProduct.sendKeys(Keys.TAB);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRow));
		
		 selectRow.click();			
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectDeleteOption));
			
		 boolean actselectDeleteOption=selectDeleteOption.isDisplayed();
		 boolean expselectDeleteOption=true;
		 
		 System.out.println("*******************************checkRowDeleteFieldInExchangeRate********************************");
		 
		 System.out.println("selectDeleteOption       " +actselectDeleteOption +" Value Excepted  :"+expselectDeleteOption);
		 
		 
		 if(actselectDeleteOption==expselectDeleteOption)
		 {	

			excelReader.setCellData(xlfile, "Sheet1", 517, 9, resPass);
			return true;
		 }	 
		 else
		 {   
			 excelReader.setCellData(xlfile, "Sheet1", 517, 9, resFail);
			 return false;
		 }	     
	 }
	
		
	
	public static boolean checkRowDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
		String getExpectedDeleteRowMsg="Are you sure that you want to delete this row?";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectDeleteOption));
		
		selectDeleteOption.click();
		
		MasterCurrencyPage.getWaitForAlert();
	     
	    String actCompanySaveMsg=MasterCurrencyPage.getAlert().getText();
	     	     
	    System.out.println("************************************checkRowDeleteOptionInExchangeRate************************************"); 
	    
	    
	    System.out.println("Company message is displaying as "+ getExpectedDeleteRowMsg);
	     
	    System.out.println("Company message is displaying as "+ actCompanySaveMsg);
	     
	    if(getExpectedDeleteRowMsg.equalsIgnoreCase(actCompanySaveMsg))
	    {
	    	 excelReader.setCellData(xlfile, "Sheet1", 518, 9, resPass);
	    	 return true;
	     }
	     else
	     {
	    	 excelReader.setCellData(xlfile, "Sheet1", 518, 9, resFail);
	    	 return false;
	     }
		
	}
	
	
		
		
	public static boolean checkYesRowDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
		LoginPageCompanyCreationPage.getAlert().accept();
		    	  
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
		 
		unitsConversionSaveButton.click();
		
		System.out.println("*********************************checkYesRowDeleteOptionInExchangeRate*******************************");
		
		String expMessage="Select the Unit first";
		
		String actMessage=checkValidationMessage(expMessage);
	     
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 519, 9, resPass);
			//delete it modified for below delete option and load not working
			unitsConversionCancelButton.click();
			
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		 	 userNameDisplay.click();
				  
		 	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 	 logoutOption.click();
		 	 
			
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 519, 9, resFail);
			 
			//delete it modified for below delete option and load not working
			unitsConversionCancelButton.click();
			
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplayLogo));
		 	 userNameDisplayLogo.click();
				  
		 	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		 	 logoutOption.click();
		 	 
			 return false;
		}	    
		
	}
	
	
	
	
	
	/*
		// 2423 to 2431 Commented Previously
	public static boolean checkLoadFromWithSaveOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
		 
		 unitsConversionBaseUnit.click();
		 
		 unitsConversionBaseUnit.click();
		 unitsConversionBaseUnit.sendKeys(Keys.END);
		 unitsConversionBaseUnit.sendKeys(Keys.SHIFT,Keys.HOME);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.BACK_SPACE);
		 
		 Thread.sleep(2000);
		 
		 unitsConversionBaseUnit.sendKeys("Pc");
		 	 
		 Thread.sleep(2000);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.TAB);
		 
		 Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
		 
		 unitsConversionProduct.sendKeys(Keys.TAB);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionLoadFrom));
		 
		 unitsConversionLoadFrom.sendKeys("Pcs");
		 
		 Thread.sleep(2000);
		 
		 unitsConversionLoadFrom.sendKeys(Keys.TAB);
		 
		 Thread.sleep(3000);
		 

		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
		 
		 unitsConversionSaveButton.click();
		 
		 String expMessage="Successfully saved";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 520, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 520, 9, resFail);
			 return false;
		 }
      }
	
	
		
	public static boolean checkEditUnitsConversionWithLoadFomOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
		 
		 unitsConversionBaseUnit.click();
		 unitsConversionBaseUnit.sendKeys(Keys.END);
		 unitsConversionBaseUnit.sendKeys(Keys.SHIFT,Keys.HOME);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.BACK_SPACE);
		 
		 Thread.sleep(2000);
		 unitsConversionBaseUnit.sendKeys("Pc");
		 
		 Thread.sleep(4000);
		 	 
		 unitsConversionBaseUnit.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
		 
		 Thread.sleep(2000);
		 	
		 unitsConversionProduct.sendKeys(Keys.TAB);
		 	
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionLoadFrom));
		 
		 Thread.sleep(2000);
		 
		 unitsConversionLoadFrom.sendKeys(Keys.TAB);
		 
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitConversionUnit));
		
         Thread.sleep(2000);
         
		 inputUnitConversionUnit.sendKeys(Keys.TAB);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionXFactor));
		 	 	 
		 Thread.sleep(2000);
		 
		 inputUnitsConversionXFactor.sendKeys(Keys.TAB);

		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionAdditionalQuantity));
 	 	 
		 Thread.sleep(2000);
		 
		 inputUnitsConversionAdditionalQuantity.sendKeys(Keys.TAB);

		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionRoundOff));
 	 	 
         unitsConversionRoundOff.sendKeys(Keys.TAB);
         
         Thread.sleep(3000);
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitConversionUnit));
		 
		 inputUnitConversionUnit.click();
		 
		 inputUnitConversionUnit.sendKeys("Box");
	
		 Thread.sleep(2000);
		 
		 inputUnitConversionUnit.sendKeys(Keys.TAB);
		 
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionXFactor));
		 
		 inputUnitsConversionXFactor.click();
		 
		 inputUnitsConversionXFactor.sendKeys("24");
		 
		 Thread.sleep(2000);
		 	 
		 inputUnitsConversionXFactor.sendKeys(Keys.TAB);
		 
	  	 
		 Thread.sleep(3000);
         
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
		 
		 unitsConversionSaveButton.click();
		 
		 String expMessage="Successfully saved";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 521, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 521, 9, resFail);
			 return false;
		 }
      }
	
	
	
	
	public static boolean checkSaveUnitsConversionWithTwoRows() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
		 
		 unitsConversionBaseUnit.click();
		 unitsConversionBaseUnit.sendKeys(Keys.END);
		 unitsConversionBaseUnit.sendKeys(Keys.SHIFT,Keys.HOME);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.BACK_SPACE);
		 
		 Thread.sleep(2000);
		 
		 unitsConversionBaseUnit.sendKeys("Dozs");
		 	 
		 Thread.sleep(2000);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
		 
		 Thread.sleep(2000);
		 
		 unitsConversionProduct.sendKeys(Keys.TAB);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionLoadFrom));
		 
         Thread.sleep(2000);
         
         unitsConversionLoadFrom.sendKeys(Keys.TAB);
		 

         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitConversionUnit));
		
         inputUnitConversionUnit.sendKeys("Box");
         
         Thread.sleep(2000);
         
		 inputUnitConversionUnit.sendKeys(Keys.TAB);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionXFactor));
		 	 	 
		 inputUnitsConversionXFactor.sendKeys("2");
		 
		 Thread.sleep(2000);
		 
		 inputUnitsConversionXFactor.sendKeys(Keys.TAB);

		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionAdditionalQuantity));
 	 	 
		 Thread.sleep(2000);
		 
		 inputUnitsConversionAdditionalQuantity.sendKeys(Keys.TAB);

		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionRoundOff));
 	 	 
         Thread.sleep(2000);
         
         unitsConversionRoundOff.sendKeys(Keys.TAB);
         
         Thread.sleep(3000);
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitConversionUnit));
		 
		 inputUnitConversionUnit.click();
		 
		 inputUnitConversionUnit.sendKeys("Pcs");
	
		 Thread.sleep(2000);
		 
		 inputUnitConversionUnit.sendKeys(Keys.TAB);
		 
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionXFactor));
		 
		 inputUnitsConversionXFactor.click();
		 
		 inputUnitsConversionXFactor.sendKeys("1");
		 
		 Thread.sleep(2000);
		 	 
		 inputUnitsConversionXFactor.sendKeys(Keys.TAB);
		 
	  	 
		 Thread.sleep(3000);
         
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
		 
		 unitsConversionSaveButton.click();
		 
		 String expMessage="Successfully saved";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 522, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 522, 9, resFail);
			 return false;
		 }
      }
	
		
	public static boolean checkDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 String getExpectedDeleteRowMsg="Are you sure that you want to delete all rows";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
		 
		 unitsConversionBaseUnit.click();
		 unitsConversionBaseUnit.sendKeys(Keys.END);
		 unitsConversionBaseUnit.sendKeys(Keys.SHIFT,Keys.HOME);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.BACK_SPACE);
		 
		 Thread.sleep(2000);
		 
		 unitsConversionBaseUnit.sendKeys("Dozs");
		 	 
		 Thread.sleep(2000);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.TAB);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
		 
		 Thread.sleep(2000);
		 
		 unitsConversionProduct.sendKeys(Keys.TAB);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionDeleteButton));
		 
		 unitsConversionDeleteButton.click();
		 

		 MasterUnitPage.getWaitForAlert();
		     
	     String actCompanySaveMsg=MasterUnitPage.getAlert().getText();
	     
	     System.out.println("Company message is displaying as "+ actCompanySaveMsg);
	     
	     if(getExpectedDeleteRowMsg.equalsIgnoreCase(actCompanySaveMsg))
	     {
	    	 excelReader.setCellData(xlfile, "Sheet1", 523, 9, resPass);
	    	 return true;
	     }
	     else
	     {
	    	 excelReader.setCellData(xlfile, "Sheet1", 523, 9, resFail);
	    	 return false;
	     }
	 
		
      }
	
		
		
	public static boolean checkNoButtonInDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 LoginPageCompanyCreationPage.getAlert().dismiss();

		    	  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
		 
		 unitsConversionSaveButton.click();
		 
		 String expMessage="Successfully saved";
			
		 String actMessage=checkValidationMessage(expMessage);
		  
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 524, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 524, 9, resFail);
			 return false;
		 }
			
	}
	

	
		
		
	public static boolean checkYesButtonInDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
		 
		 unitsConversionBaseUnit.click();
		 unitsConversionBaseUnit.sendKeys(Keys.END);
		 unitsConversionBaseUnit.sendKeys(Keys.SHIFT,Keys.HOME);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.BACK_SPACE);
		 
		 Thread.sleep(2000);
		 
		 unitsConversionBaseUnit.sendKeys("Dozs");
		 	 
		 Thread.sleep(2000);
		 
		 unitsConversionBaseUnit.sendKeys(Keys.TAB);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
		 
		 Thread.sleep(2000);
		 
		 unitsConversionProduct.sendKeys(Keys.TAB);
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionDeleteButton));
		 
		 unitsConversionDeleteButton.click();
		 
		 getWaitForAlert();
		 
		 getAlert().accept();
		 
		 String expMessage="Deleted Successfully.";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
			if(actMessage.equalsIgnoreCase(expMessage))
			{	
				excelReader.setCellData(xlfile, "Sheet1", 525, 9, resPass);
				
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
				userNameDisplay.click();
				  
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			    logoutOption.click();
				
				return true;
			}	 
			else
			{
				 excelReader.setCellData(xlfile, "Sheet1", 525, 9, resFail);
				 
				 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			 	 userNameDisplay.click();
					  
			 	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			 	 logoutOption.click();
			
			 	 return false;
			}
		 }
		 */
	
	
	
    public MasterUnitPage(WebDriver driver)
    {
    	
   	 PageFactory.initElements(driver, this);
   	
    }
		
}
