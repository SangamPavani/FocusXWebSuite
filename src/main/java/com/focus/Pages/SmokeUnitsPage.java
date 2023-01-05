package com.focus.Pages;

import java.io.IOException;
import com.focus.base.BaseEngine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class SmokeUnitsPage extends BaseEngine
{

	//Home Menu
	@FindBy (xpath="//*[@id='1']/div/span")
    public static WebElement homeMenu;
	
        //Masters Menu	
		@FindBy (xpath="//*[@id='1000']/span")
	    public static WebElement mastersMenu;
		
		//Units Menu	
		 @FindBy (xpath="/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]")
		 public static WebElement itemsMenu;
		
			//Units Menu	
			 @FindBy (xpath="/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]")
			 public static WebElement unitsMenu;
		 
				//Accounts Title
				@FindBy (xpath="//span[@id='spnHeaderText']")
				public static WebElement accountsTitle;
				
				@FindBy (xpath="//div[@class='navText']//span[contains(text(),'Unit Conversion')]")
				public static WebElement unitsConversionTitle;
						    
			    //Master Main Header Fields		
				@FindBy(xpath="//i[@class='icon-font6 icon-new']")
				public static WebElement masterNewBtn;
					
				@FindBy(xpath="//i[@class='icon-font6 icon-add-group']")
				public static WebElement masterAddGroupBtn; 
				 
				@FindBy(xpath="//i[@class='icon-font6 icon-edit']")
				public static WebElement masterEditBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-clone']")
				public static WebElement masterCloneBtn; 
		
				@FindBy(xpath="//i[@class='icon-properties icon-font6']")
				public static WebElement masterPropertiesBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-delete']")
				public static WebElement masterDeleteBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-close']")
				public static WebElement masterCloseBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-group']")
				public static WebElement masterGroupBtn; 
				
				@FindBy(xpath="//*[@id='toggle_ribbon']")
				public static WebElement masterRibbonToExpandOptions; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-delete-all']")
				public static WebElement masterDeleteAllBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-closed-account']")
				public static WebElement masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-open-close-account']")
				public static WebElement masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-import']")
				public static WebElement masterAdvanceMasterImportORExportBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-info']")
				public static WebElement masterAuthorInfoBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-up-arrow']")
				public static WebElement masterMoveUpBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-down-arrow']")
				public static WebElement masterMoveDownBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-sort']")
				public static WebElement masterSortBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-mass-update']")
				public static WebElement masterMassUpdateBtn; 
		
				@FindBy(xpath="//a[@class='lSNext']")
				public static WebElement masterRibbonControlNextBtn; 
				
				@FindBy(xpath="//*[@id='btnXMLImport']")
				public static WebElement masterImportFromXmlBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-xmlexport']")
				public static WebElement masterExportFormatToXmlBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-custamize']")
				public static WebElement masterCustamizemasterBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-options']")
				public static WebElement masterCustamizeViewBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-tree']")
				public static WebElement mastercustamizeTreeBtn; 
		
	
			//Master Left panel//TreeID//Elements

			@FindBy(xpath="//*[@id='iTreeId']")
			public static WebElement masterTreeIdDropdown; 

			@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/button/span")
			public static WebElement masterTreeIDToggleBtn; 
		                        
				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[1]/a")
				public static WebElement masterTreeIDToggle_CreateTreeBtn; 
				
					@FindBy(xpath="//h4[contains(text(),'Create Tree')]")
					public static WebElement treeID_CreateTreeLabel; 
					
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
				
				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[2]")
				public static WebElement masterTreeIDToggle_EditBtn; 
				
				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[3]")
				public static WebElement masterTreeIDToggle_DeleteBtn; 
				
				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[4]")
				public static WebElement masterTreeIDToggle_setDefaultBtn;

				//TreeViewID//Elements		
				@FindBy(xpath="//select[@id='iTreeViewId']")
				public static WebElement masterTreeViewIDDropdown; 

				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/button/span")
				public static WebElement masterTreeViewIDToggleBtn;

					@FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[1]")
					public static WebElement masterTreeViewIdCreateViewBtn; 
					
						@FindBy(xpath="//*[@id='createViewDiv']/div/div[1]/div[1]/h4")
						public static WebElement CreateView_Label; 
	
						@FindBy(xpath="//*[@id='btnCancel']/i")
						public static WebElement CreateView_CloseBtn; 
											
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

				@FindBy(xpath="//span[@class='icon-font6 icon-closed-records theme_icon-color']")
				public static WebElement masterShowAllClosedRecordsBtn; 

				@FindBy(xpath="//span[@class='icon-font6 icon-external-module theme_icon-color']")
				public static WebElement masterAutoAdjustColoumnsBtn; 

				@FindBy(xpath="//input[@id='chkRetainSelection']")
				public static WebElement masterRetainSelectionCheckBox; 

				@FindBy(xpath="//*[@id='btnsideBar']")
				public static WebElement masterSideBarBtn; 
				
				@FindBy(xpath="//*[@id='oncheckaccorderan']")
				public static WebElement masterOptionToHideAccountsGroupTree;

    				
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
			    @FindBy(xpath="//span[contains(text(),'Units Properties')]")
			    public static WebElement accountPropertiesLabel;

		        @FindBy(xpath="//select[@id='ddlStatus']")
				public static WebElement  statusDropdown;
				
				@FindBy(xpath="//input[@id='chkDoNotRestrictSelectionEvenIfRightsNotAllotted']")
				public static WebElement  doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox;
				
				@FindBy(xpath="//input[@id='chkAllowOtherCompaniesToViewRecords']")
				public static WebElement allowOtherCompaniesToViewRecordsCheckbox;
			
				@FindBy(xpath="//span[@id='btnPropOk']")
				public static WebElement properties_okBtn;
				
				@FindBy(xpath="//*[@id='divMasterProperty']/ul/li/span[2]")
				public static WebElement  properties_cancelBtn;
		 
		    //Units Creation Screen
		    @FindBy(xpath="//input[@id='sName']")
			private static WebElement nameTxt;
			
			@FindBy(xpath="//input[@id='sCode']")
			private static WebElement codeTxt;
			
			@FindBy(xpath="//input[@id='iNoOfDecimals']")
			private static WebElement noOfDecimalsTxt;
			
			@FindBy(xpath="//select[@id='iRoundingType']")
			private static WebElement roundingTypeDropdown;
		
		    @FindBy(xpath="//select[@id='UnitType']")
			private static WebElement unitTypeDropdown;
		    		    
		    @FindBy(xpath="//div[@id='divTreeMenu']")
			private static WebElement treeUnitsDisplay;
		    
		    @FindBy(xpath="//td[@class='text-center']")
			private static WebElement unitsInMainPageEmty;
		    
			@FindBy(xpath="//*[@id='btnMasterSaveClick']")
			public static WebElement saveBtn;

			@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
			public static WebElement closeBtn;

/*			@FindBy(xpath="//span[@id='btnClose']")
			public static WebElement unitsCloseBtn;
*/			
		    //Edit option Fields
			
			@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
			public static WebElement editcloseBtn;
			
			@FindBy(xpath="//i[@class='icon-font6 icon-paste-clipboard']")
			public static WebElement pasteBtn;
			
			@FindBy(xpath="//button[@id='btnMasterClone']")
			public static WebElement editcloneBtn;
			
			@FindBy(xpath="//*[@id='btnMasterCopy']")
			public static WebElement copyBtn;
		    
			@FindBy(xpath="//div[@id='idGlobalError']")
			public static WebElement validationConfirmationMessage;

			@FindBy(xpath="//div[@class='theme_color font-6']")
			public static WebElement validationUpdatingConfirmationMessage;
			
			@FindBy(xpath="//div[@id='idGlobalError']//td[3]")
			public static WebElement closeValidationConfirmationMessage;
			
			@FindBy(xpath="//*[@id='LandingGridBody']/tr[1]/td[11]")
			public static WebElement accountCreation;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
			public static WebElement accountNewCreationName;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
			public static WebElement unitNewCreationNameOfLane;               
			
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
			public static WebElement unitFirstCheckBoxToSelection;
			
			/*@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
			public static WebElement unitFirstCheckBox;
*/
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[9]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]")
			public static WebElement getMsgOnDelete;
			
			@FindBy(xpath="//input[@id='liSelectAllMasters']")
			public static WebElement accountMasterSelect;
			
			@FindBy(xpath="//button[@id='btnOkForDelete']")
			public static WebElement clickOnOkInDelete;
			
			//Units Conversion Page			
			@FindBy(xpath="//a[@id='72']//span[contains(text(),'Unit Conversion')]")
			private static WebElement unitsConversionMenu;
			
		/*	@FindBy(xpath="//div[contains(text(),'Save')]")
			private static WebElement unitsConversionSaveButton;
			
			@FindBy(xpath="//div[contains(text(),'Import From Excel')]")
			private static WebElement unitsConversionImportFromExcelButton;
			
			@FindBy(xpath="//div[contains(text(),'Delete')]")
			private static WebElement unitsConversionDeleteButton;
			
			@FindBy(xpath="//div[contains(text(),'Clear')]")
			private static WebElement unitsConversionClearButton;
			
			@FindBy(xpath="//li[@id='ucCancel']//div[@class='toolbar_button_text'][contains(text(),'Cancel')]")
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
			private static WebElement unitsConversionRoundOff;*/
				
			@FindBy(xpath="//td[@id='myTagsTable_col_1-0']")
			private static WebElement selectRow;
			
			@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[2]/div[2]/table/tbody/tr[1]/td[1]/div[2]/div[2]/table/tbody/tr[2]/td[2]")
			private static WebElement selectDeleteOption;
			
			@FindBy(xpath="//span[@id='DeleteData']")
			private static WebElement exchnageRateDeleteOption;
			
		
			@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
			private static WebElement companyName;
		
			@FindBy(xpath="//*[@id='companyLogo']")
			private static WebElement companyLogo;
		
		    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
			private static WebElement noIn;
			
			
			//Dash board Page
			@FindBy(xpath="//*[@id='dashName']")
		    private static WebElement labelDashboard ;
			
			@FindBy(xpath="//*[@id='Select_dash']")
			private static WebElement selectDashboard ;
				
			@FindBy(xpath="//*[@id='Dashboard_AddDash']")
		    private static WebElement newAddDashBoard;
			 
		    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
	        private static WebElement dashboardCustomizationSettings;
			
		    @FindBy(xpath="//span[@class='hidden-xs']")
			private static WebElement userNameDisplay;

		    
		   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
			private static WebElement userNameDisplay;*/
		    
		    
		    private static String xlfile;
			private static String resPass = "Pass";
			private static String resFail = "Fail";
			private static ExcelReader excelReader;
			private static boolean methodReturnStatus;
			private static String xlSheetName = "SmokeMasters";
			private static boolean statusOfValue;
		    private static Alert alert;
		
			// Login Page
			@FindBy(xpath = "//*[@id='txtUsername']")
			private static WebElement username;
			
			@FindBy(xpath="//*[@id='navigation_menu']/li/a/div/div")
			private static List<WebElement> menusList;
			
			@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li/a/span")
			private static List<WebElement> homeMenuList;
			
			@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li/a/span")
			private static List<WebElement> mastersMenuList;
			
			@FindBy(xpath="//*[@id='ulCommonlyUsedRibbon']/li/span")
			private static List<WebElement> mastersRibbonControlList;
			
			@FindBy(xpath ="//*[@id='ulRibbonControl']/li/span")
			private static List<WebElement> ribbonControlExpandList;

	
			public boolean checkSignToCheckUnitsMastersPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
		    {
		      excelReader = new ExcelReader(POJOUtility.getExcelPath());
		      xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		      System.out.println("***************** checkSignToCheckCurrencyMastersPage Method Executes.............  *********************");
		      
		 	 try
		 	 {
		 		 
		 		 getDriver().navigate().refresh();
		 		 Thread.sleep(1999);
		 		 
		 		 getDriver().navigate().refresh();
		 		 Thread.sleep(1999);
		 		 	 		 
		 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		 	    	 
		 		 LoginPage lp = new LoginPage(getDriver());
		 		 
		 		 String unamelt =excelReader.getCellData(xlSheetName, 8, 6);
		 		 String pawslt  =excelReader.getCellData(xlSheetName, 8, 6);
		 		 
		 		 LoginPage.enterUserName(unamelt);
		 		 LoginPage.enterPassword(pawslt);
		 		 
		 		 LoginPage.clickOnSignInBtn();
		 		 
		 		 Thread.sleep(5000);
		 		
		 		 
		 		 int actMenusCount	= menusList.size();
		 		 
		 		 ArrayList<String> actMenusArray=new ArrayList<String>();
		 		 
		 		 for (int i = 0; i < actMenusCount; i++) 
		 		 {
		 			 String data = menusList.get(i).getText();
		 			 actMenusArray.add(data);
		 		 }	
		 				
		 		 String actMenus 	=actMenusArray.toString();
		 		 String expMenus	= excelReader.getCellData(xlSheetName, 8, 7);
		 		 
		 		 System.out.println("Menus Display Value Actual        : " + actMenus);
		 		 System.out.println("Menus Display Value Expected      : " + expMenus);
		 		 
		 		 
		 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		 		 String actUserInfo = userNameDisplay.getText();
		 		 String expUserInfo = excelReader.getCellData(xlSheetName, 9, 7);	
		 		 
		 		 System.out.println("User Name Display Value Actual    : " + actUserInfo            + " Value Expected : " + expUserInfo);
		 		 
		
		 		 
		 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		 		 companyLogo.click();
		 		 
		 
		 		 
		 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
		 		 String actGetLoginCompanyNameInformation = companyName.getText();
		 		 String actGetLoginCompanyName   = actGetLoginCompanyNameInformation.substring(0, 19);
		 		 String expGetLoginCompanyName   = excelReader.getCellData(xlSheetName, 10, 7);
		 		
		 		 System.out.println("Company Name Display Value Actual : " + actGetLoginCompanyName + " Value Expected : " + expGetLoginCompanyName);
		 		 
		 		 companyLogo.click();
		 		 
		 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
		 		 String actDashboardLabel        = labelDashboard.getText();
		 		 String expDashboardLabel        = excelReader.getCellData(xlSheetName, 11, 7);
		 		 
		 		 excelReader.setCellData(xlfile, xlSheetName, 8, 8, actMenus);
		 		 excelReader.setCellData(xlfile, xlSheetName, 9, 8, actUserInfo);
		 		 excelReader.setCellData(xlfile, xlSheetName, 10, 8, actGetLoginCompanyName);
		 		 excelReader.setCellData(xlfile, xlSheetName, 11, 8, actDashboardLabel);
		 		

		 		 System.out.println("Dashboard Label Value Actual      : " + actDashboardLabel      + " Value Expected : " + expDashboardLabel);
		 		 
		 		 if (actUserInfo.equalsIgnoreCase(expUserInfo) && actGetLoginCompanyName.equalsIgnoreCase(expGetLoginCompanyName)
		 				 && actDashboardLabel.equalsIgnoreCase(expDashboardLabel) && actMenus.equalsIgnoreCase(expMenus)) 
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
		 	 catch (Exception e) 
		      {
		          excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
		          System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		          return false;
		      }
		    }	

	   @FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
	   public static WebElement newErrorMessage;

	   @FindBy(xpath = "//span[@class='icon-reject2 theme_color']")
	   public static WebElement newErrorMessageCloseBtn;

	   public static boolean checkErrorMessageIsDisplayingOrNotDisplaying() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	   {     
		   
		 System.out.println("************************   checkErrorMessageIsDisplayingOrNotDisplaying Method Executes.............    ******************************");
		   
		 try 
		 { 
			boolean actValidationMessageIsEmptyDisplay      = validationConfirmationMessage.getText().isEmpty();
	        boolean expValidationMessageIsEmptyDisplay      = true;   
			
	        System.out.println("Error Message Is Displaying Or Not Displaying Value Actual : " + actValidationMessageIsEmptyDisplay + " Value Expected : " + expValidationMessageIsEmptyDisplay);
	        
			if (actValidationMessageIsEmptyDisplay == expValidationMessageIsEmptyDisplay)
			{
				//System.out.println("No Error Message Is Displaying On Opening Page,Click On Add, Edit, Delete Etc...... In Method : " + validationConfirmationMessage.getText());
				return true;
			} 
			else 
			{
				//System.err.println("Error Message Is Displaying On Opening Page, Click, Add, Edit, Delete Etc..... In Method : " + validationConfirmationMessage.getText());
				newErrorMessageCloseBtn.click();
				return false;
			}
			
		 } 
		 catch (NoSuchElementException nse)
		 {
			System.err.println("CATCH BLOCK : NO SUCH ELEMENT MESSAGE IS DISPLAY  :   "+ nse.getMessage());
			return false;
		 }
	  }
	  
	  
	//UNITS MASTER PAGE STARTS FROM HERE
	  
	  public static boolean checkUnitsMasterPageIsDisplayByClickOnUnitsMenuFromItemMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************************************ checkUnitsMasterPageIsDisplayByClickOnUnitsMenuFromItemMenu ********************************************");

	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	 		homeMenu.click();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	 		mastersMenu.click();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemsMenu));
	 		itemsMenu.click();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsMenu));
	 		unitsMenu.click();
	 		//Thread.sleep(3000);

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));

	 		String actUnitsTitle = accountsTitle.getText();
	 		String expUnitsTitle = excelReader.getCellData(xlSheetName, 315, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 315, 8, actUnitsTitle);

	 		System.out.println("Opening Units Master From Item Menu Title Actual Value  :" + actUnitsTitle + "     Expected Value    : " + expUnitsTitle);

	 		if (actUnitsTitle.equalsIgnoreCase(expUnitsTitle)) 
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 314, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 314, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 314, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		return false;
	 	}
	  }
	   
	   
	  public static boolean checkMainOptionsAvailabilityInUnitsMastersPageOnClickOnUnitsFromItemMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		 
	 	 System.out.println("************ checkMainOptionsAvailabilityInUnitsMastersPageOnClickOnUnitsFromItemMastersMenu Method Executes............ *********************");

	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));

	 		
	 		int mastersRibbonControlListCount = mastersRibbonControlList.size();
	 		   
	 		System.err.println("mastersRibbonControlList : "+mastersRibbonControlListCount);
	 		
	 		Set<String> actMenusArray= new HashSet<String>();
	 		
	 		for (int i = 1; i < mastersRibbonControlListCount; i++) 
	 		{
	 			String data = mastersRibbonControlList.get(i).getText();
	 			System.err.println(data);
	 			actMenusArray.add(data);
	 		}	
	 		
	 		String actMenus =actMenusArray.toString();
	 		String expMenus = excelReader.getCellData(xlSheetName, 317, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 317, 8, actMenus);
	 		
	 		System.out.println("Account Ribbon Control Display Value Actual    : " + actMenus);
	 		System.out.println("Account Ribbon Control  Display Value Expected : " + expMenus);
	 		   
	 		
	 		if (actMenus.equalsIgnoreCase(expMenus))	
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 316, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 316, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 316, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		return false;
	 	}
	  }

	  
	  
	  
	  public static boolean checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("*********** checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInUnitsMastersPage Method Executes............*******************");

	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));
	 		masterRibbonToExpandOptions.click();

	 		boolean actSummaryErrorMessage                  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		boolean expSummaryErrorMessage                  = true;
	 		
	        System.out.println("Click On Ribbon Expand Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));

	 		/*boolean actAccountMasterGroupBtn              = masterGroupBtn.isDisplayed();
	 		boolean actAccountMasterDeleteAllBtn          = masterDeleteAllBtn.isDisplayed();
	 		boolean actAccountMasterCloseAccountBtn       = masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity.isDisplayed();
	 		boolean actAccountMasterOpenCloseAccountBtn   = masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState.isDisplayed();
	 		boolean actAccountMasterAdvanceImortExportBtn = masterAdvanceMasterImportORExportBtn.isDisplayed();
	 		boolean actAccountMasterAuthorInfoBtn         = masterAuthorInfoBtn.isDisplayed();
	 		boolean actAccountMasterMoveUpBtn             = masterMoveUpBtn.isDisplayed();
	 		boolean actAccountMasterMoveDownBtn           = masterMoveDownBtn.isDisplayed();
	 		boolean actAccountMasterSortBtn               = masterSortBtn.isDisplayed();
	 		boolean actAccountMasterMassUpdateBtn         = masterMassUpdateBtn.isDisplayed();
	 		boolean actAccountMasterImportFromXMLBtn      = masterImportFromXmlBtn.isDisplayed();
	 		boolean actAccountMasterExportFormatToXMLBtn  = masterExportFormatToXmlBtn.isDisplayed();

	 		boolean expAccountMasterGroupBtn              = true;
	 		boolean expAccountMasterDeleteAllBtn          = true;
	 		boolean expAccountMasterCloseAccountBtn       = true;
	 		boolean expAccountMasterOpenCloseAccountBtn   = true;
	 		boolean expAccountMasterAdvanceImortExportBtn = true;
	 		boolean expAccountMasterAuthorInfoBtn         = true;
	 		boolean expAccountMasterMoveUpBtn             = true;
	 		boolean expAccountMasterMoveDownBtn           = true;
	 		boolean expAccountMasterSortBtn               = true;
	 		boolean expAccountMasterMassUpdateBtn         = true;
	 		boolean expAccountMasterImportFromXMLBtn      = true;
	 		boolean expAccountMasterExportFormatToXMLBtn  = true;

	 		System.out.println("Group Button Display Value Actual           : " + actAccountMasterGroupBtn+              " Value Expected : " + expAccountMasterGroupBtn);
	 		System.out.println("Delete All Button Display Value Actual      : " + actAccountMasterDeleteAllBtn+          " Value Expected : " + expAccountMasterDeleteAllBtn);
	 		System.out.println("Close Account Button Display Value Actual   : " + actAccountMasterCloseAccountBtn+       " Value Expected : " + expAccountMasterCloseAccountBtn);
	 		System.out.println("Import Export Button Display Value Actual   : " + actAccountMasterAdvanceImortExportBtn+ " Value Expected : " + expAccountMasterAdvanceImortExportBtn);
	 		System.out.println("Authorize Info Button Display Value Actual  : " + actAccountMasterAuthorInfoBtn+         " Value Expected : " + expAccountMasterAuthorInfoBtn); 
	 		System.out.println("Move Down Button Display Value Actual       : " + actAccountMasterMoveDownBtn+           " Value Expected : " + expAccountMasterMoveDownBtn);
	 		System.out.println("Move Up Button Display Value Actual         : " + expAccountMasterMoveUpBtn+             " Value Expected : " + expAccountMasterMoveUpBtn);
	 		System.out.println("Sort Button Display Value Actual            : " + actAccountMasterSortBtn+               " Value Expected : " + expAccountMasterSortBtn);
	 		System.out.println("Import From XML Button Display Value Actual : " + actAccountMasterImportFromXMLBtn+      " Value Expected : " + expAccountMasterImportFromXMLBtn);
	 		System.out.println("Export From XML Button Display Value Actual : "+ actAccountMasterExportFormatToXMLBtn+   " Value Expected : " + expAccountMasterExportFormatToXMLBtn);

	 		if (actSummaryErrorMessage==expSummaryErrorMessage
	 				&& actAccountMasterGroupBtn == expAccountMasterGroupBtn
	 				&& actAccountMasterDeleteAllBtn == expAccountMasterDeleteAllBtn
	 				&& actAccountMasterCloseAccountBtn == expAccountMasterCloseAccountBtn
	 				&& actAccountMasterOpenCloseAccountBtn == expAccountMasterOpenCloseAccountBtn
	 				&& actAccountMasterAdvanceImortExportBtn == expAccountMasterAdvanceImortExportBtn
	 				&& actAccountMasterAuthorInfoBtn == expAccountMasterAuthorInfoBtn
	 				&& actAccountMasterMoveUpBtn == expAccountMasterMoveUpBtn
	 				&& actAccountMasterMoveDownBtn == expAccountMasterMoveDownBtn
	 				&& actAccountMasterSortBtn == expAccountMasterSortBtn
	 				&& actAccountMasterMassUpdateBtn == expAccountMasterMassUpdateBtn
	 				&& actAccountMasterImportFromXMLBtn == expAccountMasterImportFromXMLBtn
	 				&& actAccountMasterExportFormatToXMLBtn == expAccountMasterExportFormatToXMLBtn)*/
	 		

	 		int ribbonControlExpandListCount =ribbonControlExpandList.size();
	 		
	 		System.err.println("ribbonControlExpandList : "+ribbonControlExpandListCount);
	 		
	 		ArrayList<String> actribbonControlExpandList=new ArrayList<String>();
	 		
	 		for(int i=0;i<ribbonControlExpandListCount;i++)
	 		{
	 			String data=ribbonControlExpandList.get(i).getText();
	 			actribbonControlExpandList.add(data);
	 		}
	 		
	 		String actToggleList =actribbonControlExpandList.toString();
	 		String expToggleList ="[Group, Delete All, Close Units, Open Close Units, Advance Master Import/Export, Auth Info, Move Up, Move Down, Sort, Mass Update, Export Format To XML, Customize Master, , , ]";
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 319, 8, actToggleList);

	 		System.out.println("ToggleList Actual   : "+actToggleList);
	 		System.out.println("ToggleList Expected : "+expToggleList);
	 		
	 		if (actSummaryErrorMessage==expSummaryErrorMessage
	 				&& actToggleList.equalsIgnoreCase(expToggleList))
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 318, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 318, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 318, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		return false;
	 	}
	  }
	  
	  @FindBy(xpath = "//a[@class='clsMasterName']")
	  public static WebElement unitsMasterRootUnitsDisplayInTree;
	  
	  @FindBy(xpath = "//i[@class='icon-font6 icon-custamize']")
	  public static WebElement masterCustamizeMasterBtn;
	  
	  public static boolean checkOtherToolsOptionsAvailabilityInUnitsMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("********* checkOtherToolsOptionsAvailabilityInAccountMastersPageOnClickRibbonControlNextButton Method Executes............  *******************");

	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));

	 		masterRibbonControlNextBtn.click();
	 		
	 		boolean actSummaryErrorMessage             = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		boolean expSummaryErrorMessage             = true;
	 		

	        System.out.println("Click On Ribbon Control Next Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	 	
	 		masterRibbonControlNextBtn.click();
	 		masterRibbonControlNextBtn.click();
	 		masterRibbonControlNextBtn.click();
	 		masterRibbonControlNextBtn.click();
	 		masterRibbonControlNextBtn.click();
	 		masterRibbonControlNextBtn.click();
	 		masterRibbonControlNextBtn.click();

	 		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterCustamizeMasterBtn));

	 		int ribbonControlExpandListCount =ribbonControlExpandList.size();
	 		
	 		System.err.println("ribbonControlExpandList : "+ribbonControlExpandListCount);
	 		
	 		ArrayList<String> actribbonControlExpandList=new ArrayList<String>();
	 		
	 		for(int i=0;i<ribbonControlExpandListCount;i++)
	 		{
	 			String data=ribbonControlExpandList.get(i).getText();
	 			System.err.println(data);
	 			actribbonControlExpandList.add(data);
	 		}
	 		
	 		String actToggleList =actribbonControlExpandList.toString();
	 		String expToggleList ="[, , , , Advance Master Import/Export, Auth Info, Move Up, Move Down, Sort, Mass Update, Export Format To XML, Customize Master, Customize View, Customize Tree, Print]";
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 321, 8, actToggleList);

	 		System.out.println("ToggleList Actual   : "+actToggleList);
	 		System.out.println("ToggleList Expected : "+expToggleList);
	 		
	 		if (actSummaryErrorMessage==expSummaryErrorMessage 
	 				&& actToggleList.equalsIgnoreCase(expToggleList))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 320, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 320, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 320, 10, exception);
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		 return false;
	 	 } 
	   }
	 	
	  

	  public static boolean checkTreeViewOptionsAvailableInUnitsMastersPageOnClickOnUnitsFromMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("***********  checkTreeViewOptionsAvailableInAccountMastersPageOnClickOnAccountsFromMastersMenu Method Executes............ ********************");

	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));
	 		
	 		boolean actAccountMasterTreeIdDropdown        = masterTreeIdDropdown.isDisplayed();
	 		boolean actAccountMasterTreeIDToggleBtn       = masterTreeIDToggleBtn.isDisplayed();
	 		boolean actAccountMasterTreeViewIDDropdown    = masterTreeViewIDDropdown.isDisplayed();
	 		boolean actAccountMasterTreeViewIDToggleBtn   = masterTreeViewIDToggleBtn.isDisplayed();
	 		boolean actAccountMasterHideAccountsGroupTree = masterOptionToHideAccountsGroupTree.isDisplayed();

	 		boolean expAccountMasterTreeIdDropdown        = true;
	 		boolean expAccountMasterTreeIDToggleBtn       = true;
	 		boolean expAccountMasterTreeViewIDDropdown    = true;
	 		boolean expAccountMasterTreeViewIDToggleBtn   = true;
	 		boolean expAccountMasterHideAccountsGroupTree = true;
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));

	 		Select masterTreeIdDropdownSelect=new Select(masterTreeIdDropdown);
	 		String actmasterTreeIdDropdownText=masterTreeIdDropdownSelect.getFirstSelectedOption().getText();
	 		String expmasterTreeIdDropdownText=excelReader.getCellData(xlSheetName, 323, 7);
	 		
	 		Select masterTreeViewIDDropdownSelect=new Select(masterTreeViewIDDropdown);
	 		String actmasterTreeViewIDDropdownText=masterTreeViewIDDropdownSelect.getFirstSelectedOption().getText();
	 		String expmasterTreeViewIDDropdownText=excelReader.getCellData(xlSheetName, 324, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 323, 8, actmasterTreeIdDropdownText);
	 		excelReader.setCellData(xlfile, xlSheetName, 324, 8, actmasterTreeViewIDDropdownText);
	 		
	 		boolean actMethod = actAccountMasterTreeIdDropdown == expAccountMasterTreeIdDropdown
	 							&& actAccountMasterTreeIDToggleBtn == expAccountMasterTreeIDToggleBtn
	 							&& actAccountMasterTreeViewIDDropdown == expAccountMasterTreeViewIDDropdown
	 							&& actAccountMasterTreeViewIDToggleBtn == expAccountMasterTreeViewIDToggleBtn
	 							&& actAccountMasterHideAccountsGroupTree == expAccountMasterHideAccountsGroupTree; 
	 		
	 		String actResult = Boolean.toString(actMethod);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 322, 8, actResult.toUpperCase());

	 		System.out.println("Tree ID Dropdown Option Value Actual      : " + actAccountMasterTreeIdDropdown+         " Value Expected : " + expAccountMasterTreeIdDropdown);
	 		System.out.println("Tree ID Toggle Option Value Actual        : " + actAccountMasterTreeIDToggleBtn+        " Value Expected : " + expAccountMasterTreeIDToggleBtn);
	 		System.out.println("Tree View ID Option Value Actual          : " + actAccountMasterTreeViewIDDropdown+     " Value Expected : " + expAccountMasterTreeViewIDDropdown);
	 		System.out.println("Tree View ID Toggle Value Actual          : " + actAccountMasterTreeViewIDToggleBtn +   " Value Expected : " + expAccountMasterTreeViewIDToggleBtn);
	 		System.out.println("Hide Accounts Group Tree Value Actual     : " + actAccountMasterHideAccountsGroupTree+  " Value Expected : " + expAccountMasterHideAccountsGroupTree);
	 		System.out.println("masterTreeIdDropdownText                  : " +actmasterTreeIdDropdownText+             " Value Expected : " +expmasterTreeIdDropdownText);
	 		System.out.println("masterTreeViewIDDropdownText              : " +actmasterTreeViewIDDropdownText+         " Value Expected : " +expmasterTreeViewIDDropdownText);
	 		
	 		if ( actAccountMasterTreeIdDropdown == expAccountMasterTreeIdDropdown
	 				&& actAccountMasterTreeIDToggleBtn == expAccountMasterTreeIDToggleBtn
	 				&& actAccountMasterTreeViewIDDropdown == expAccountMasterTreeViewIDDropdown
	 				&& actAccountMasterTreeViewIDToggleBtn == expAccountMasterTreeViewIDToggleBtn
	 				&& actAccountMasterHideAccountsGroupTree == expAccountMasterHideAccountsGroupTree
	 				&& actmasterTreeIdDropdownText.equalsIgnoreCase(expmasterTreeIdDropdownText)
	 				&& actmasterTreeViewIDDropdownText.equalsIgnoreCase(expmasterTreeViewIDDropdownText))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 322, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 322, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 322, 10, exception);
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		 return false;
	 	 } 
	  }


	  @FindBy(xpath = "//*[@id='0']/a")
      private static WebElement accountRootAccount;
	  
	  public static boolean checkDisplayOfGroupAvailableTreeStructureLeftPaneInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("**************************  checkDisplayOfGroupAvailableInAccountMastersPage Method Executes............  *******************************");
	     
	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));

	 		boolean actUnitsMasterRoot                = accountRootAccount.isDisplayed();
	 		boolean expUnitsMasterRoot                = true;
	 		
	 		String actUnitRootName=accountRootAccount.getText();
	 		String expUnitRootName=excelReader.getCellData(xlSheetName, 326, 7);

	 		String actResult = Boolean.toString(actUnitsMasterRoot);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 325, 8, actResult.toUpperCase());
	 		
	 		
	 		System.out.println("Open Units Master Unit Root Is Display Value Actual  : " + actUnitsMasterRoot+ " Value Expected : " + expUnitsMasterRoot);
	 		System.out.println("Root Units Text Display Value Actual                 : " + actUnitRootName+            " Value Expected : " + expUnitRootName);
	 			
	 		if (actUnitsMasterRoot == expUnitsMasterRoot
	 				&& actUnitRootName.equalsIgnoreCase(expUnitRootName))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 325, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 325, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 325, 10, exception);
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		 return false;
	 	 } 
	   }


	  @FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li/a")
	  public static List<WebElement> masterTreeIDToggleList;
	  
	  public static boolean checkCreateTreeToggleOptionsAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	 
	 	 System.out.println("********************* checkCreateTreeToggleOptionsAvailableInAccountMastersPage Method Executes............ *******************************");
	     
	 	 try
	 	 {
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggleBtn)); 
	 		 masterTreeIDToggleBtn.click();
	 			
	 		 boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		 boolean expSummaryErrorMessage  = true;
	 		 
	 		 System.out.println("Click on Create Tree Toggle Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggle_setDefaultBtn));
	 		 
	 		 int masterTreeIDToggleListCount=masterTreeIDToggleList.size();
	 		 
	 		 ArrayList<String> actmasterTreeIDToggleListArray=new ArrayList<String>();
	 		 
	 		 for(int i=0;i<masterTreeIDToggleListCount;i++)
	 		 {
	 			 String data=masterTreeIDToggleList.get(i).getText();
	 			 actmasterTreeIDToggleListArray.add(data);
	 		 }	
	 		 
	 		 String actmasterTreeIDToggleList=actmasterTreeIDToggleListArray.toString();
	 		 
	 		 String expmasterTreeIDToggleList=excelReader.getCellData(xlSheetName, 328, 7);
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 328, 8, actmasterTreeIDToggleList);
	 		 
	 		 System.out.println("masterTreeIDToggleList Actual   : "+actmasterTreeIDToggleList);
	 		 System.out.println("masterTreeIDToggleList Expected : "+expmasterTreeIDToggleList);
	 		 
	 		 if (actSummaryErrorMessage==actSummaryErrorMessage && actmasterTreeIDToggleList.equalsIgnoreCase(expmasterTreeIDToggleList))
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 327, 9, resPass);
	 			 return true;
	 		 }	 
	 		 else	 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 327, 9, resFail);
	 			 return false;
	 		 }	
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 327, 10, exception);
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		 return false;
	 	 } 
	  }
	 	
	 
	  
	  @FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li/a")
	  public static List<WebElement> masterViewIDToggleList;
	  
	  public static boolean checkCreateViewToggleOptionsAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("********************** checkCreateViewToggleOptionsAvailableInUnitsMastersPage Method Executes............***********************************");

	 	 try
	 	 {
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIDToggleBtn));
	 		 masterTreeViewIDToggleBtn.click();

	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIdCreateViewBtn));
	 		 
	 		 int masterViewIDToggleListCount=masterViewIDToggleList.size();
	 		 
	 		 ArrayList<String> actmasterViewIDToggleListArray=new ArrayList<String>();
	 		 
	 		 for(int i=0;i<masterViewIDToggleListCount;i++)
	 		 {
	 			 String data=masterViewIDToggleList.get(i).getText();
	 			 actmasterViewIDToggleListArray.add(data);
	 		 }
	 			
	 		 String actmasterViewIDToggleList=actmasterViewIDToggleListArray.toString();
	 		 
	 		 String expmasterViewIDToggleList=excelReader.getCellData(xlSheetName, 330, 7);
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 330, 8, actmasterViewIDToggleList);
	 		 
	 		 System.out.println("masterViewIDToggleList Actual   : "+actmasterViewIDToggleList);
	 		 System.out.println("masterViewIDToggleList Expected : "+expmasterViewIDToggleList);
	 		 
	 		 if(actmasterViewIDToggleList.equalsIgnoreCase(expmasterViewIDToggleList))
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 329, 9, resPass);
	 			 return true;
	 		 } 
	 		 else 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 329, 9, resFail);
	 			 return false;
	 		 }	
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 329, 10, exception);
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		 return false;
	 	 } 
	  }
	 	
	 
	  
	  
	  
	  @FindBy(xpath = "//div[@id='divTreeMenu']")
	  public static WebElement masterTreeDisplayMenuAccountGroups;

	 
	  
	  public static boolean checkHideUnitGroupOptionsAvailableInUnitMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("********************* checkHideUnitGroupOptionsAvailableInUnitMastersPage Method Executes............*************************");

	 	 try
	 	 {
	 			
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
	 		 masterOptionToHideAccountsGroupTree.click();
	 		   
	 		 boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		 boolean expSummaryErrorMessage  = true;
	 		 
	 		 System.out.println("Click on Hide Accounts Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);  
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeDisplayMenuAccountGroups));
	 		 
	 		 boolean actAccountMasterTreeUnits = treeUnitsDisplay.isDisplayed();
	 		 boolean expAccountMasterTreeUnits = true;
	 		 
	 		 String actResult = Boolean.toString(actAccountMasterTreeUnits);
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 331, 8, actResult.toUpperCase());
	 		 
	 		 System.out.println("Tree View Create View Option Value Actual : " + actAccountMasterTreeUnits+ " Value Expected : " + expAccountMasterTreeUnits);
	 		 
	 		 if (actSummaryErrorMessage==actSummaryErrorMessage && actAccountMasterTreeUnits == expAccountMasterTreeUnits)
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 331, 9, resPass);
	 			 return true;
	 		 } 
	 		 else 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 331, 9, resFail);
	 			 return false;
	 		 }	
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 331, 10, exception);
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		 return false;
	 	 } 
	  }
	 	
	 	
	  public static boolean checkUnHideUnitsGroupOptionsAvailableInUnitMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("********************** checkUnHideUnitsGroupOptionsAvailableInUnitMastersPage Method Executes............ ******************************");
	      //Thread.sleep(2000);
	 	 
	 	 
	 	 try
	 	 {

	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
	 		 masterOptionToHideAccountsGroupTree.click();
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));
	 		 
	 		 boolean actUnitsMasterRoot                = accountRootAccount.isDisplayed();
	 		 boolean expUnitsMasterRoot                = true;
	 		 
	 		 
	 		 String actUnitRootName=accountRootAccount.getText();
	 		 String expUnitRootName=excelReader.getCellData(xlSheetName, 333, 7);

	 		 String actResult = Boolean.toString(actUnitsMasterRoot);
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 333, 8, actResult.toUpperCase());
	 		 
	 		 
	 		 System.out.println("Open Units Master Unit Root Is Display Value Actual  : " + actUnitsMasterRoot+ " Value Expected : " + expUnitsMasterRoot);
	 		 System.out.println("Root Units Text Display Value Actual                 : " + actUnitRootName+            " Value Expected : " + expUnitRootName);
	 		 
	 		 if (actUnitsMasterRoot == expUnitsMasterRoot
	 				 && actUnitRootName.equalsIgnoreCase(expUnitRootName))
	 		 {	
	 			 excelReader.setCellData(xlfile, xlSheetName, 332, 9, resPass);
	 			 return true;
	 		 } 
	 		 else 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 332, 9, resFail);
	 			 return false;
	 		 }
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 332, 10, exception);
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		 return false;
	 	 } 
	  }
	 	
	 	
	  @FindBy(xpath = "//*[@id='cmbUserTypeMaster_input_settings']/span")
	  public static WebElement masterCumMasterSettingBtn;

	  @FindBy(xpath="//*[@id='li_moveup']/div/div[1]/a")
	  private static List<WebElement> searchControlList;
	  
	  public static boolean checkHeaderFieldsOptionsAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("********************** checkHeaderFieldsOptionsAvailableInUnitsMastersPage Method Executes............ **********************************");

	 	 try
	 	 {
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));

	 		 boolean actAccountMasterSearchTxt                  = masterSearchTxt.isDisplayed();
	 		 boolean actAccountMasterSearchBtn                  = masterSearchBtn.isDisplayed();
	 		 boolean actAccountMasterCmbMasterTxt               = mastercmbMasterTxt.isDisplayed();
	 		 boolean actAccountMasterCmbMasterExpansionBtn      = masterCmbMasterExpansionBtn.isDisplayed();
	 		 boolean actAccountMasterCmbMasterSettingsBtn       = masterCumMasterSettingBtn.isDisplayed();
	 		 boolean actAccountMasterNextBookMark               = masterMoveTheSelectionToNextBookMarkBtn.isDisplayed();
	 		 boolean actAccountMasterPrviousBookMark            = masterMoveTheSelectionToPrevoiusBookmarkBtn.isDisplayed();
	 		 boolean actAccountMasterShowAllRecordsBtn          = masterShowAllRecordsBtn.isDisplayed();
	 		 boolean actAccountMasterShowAllUnAuthorisedRecords = masterShowAllUnauthorisedRecords.isDisplayed();
	 		 boolean actAccountMasterShowAllClosedRecordsBtn    = masterShowAllClosedRecordsBtn.isDisplayed();
	 		 boolean actAccountMasterAutoAdjustColumnBtn        = masterAutoAdjustColoumnsBtn.isDisplayed();
	 		 boolean actAccountMasterRetainSelectionCheckbox    = masterRetainSelectionCheckBox.isDisplayed();
	 		 boolean actAccountMasterSideBarBtn                 = masterSideBarBtn.isDisplayed();
	 		 
	 		 boolean expAccountMasterSearchTxt                  = true;
	 		 boolean expAccountMasterSearchBtn                  = true;
	 		 boolean expAccountMasterCmbMasterTxt               = true;
	 		 boolean expAccountMasterCmbMasterExpansionBtn      = true;
	 		 boolean expAccountMasterCmbMasterSettingsBtn       = true;
	 		 boolean expAccountMasterNextBookMark               = true;
	 		 boolean expAccountMasterPrviousBookMark            = true;
	 		 boolean expAccountMasterShowAllRecordsBtn          = true;
	 		 boolean expAccountMasterShowAllUnAuthorisedRecords = true;
	 		 boolean expAccountMasterShowAllClosedRecordsBtn    = true;
	 		 boolean expAccountMasterAutoAdjustColumnBtn        = true;
	 		 boolean expAccountMasterRetainSelectionCheckbox    = true;
	 		 boolean expAccountMasterSideBarBtn                 = true;
	 		 
	 		 boolean actMethod = actAccountMasterSearchTxt == 	expAccountMasterSearchTxt && actAccountMasterSearchBtn == expAccountMasterSearchBtn
	 					&& actAccountMasterCmbMasterTxt == expAccountMasterCmbMasterTxt 
	 					&& actAccountMasterCmbMasterExpansionBtn == expAccountMasterCmbMasterExpansionBtn
	 					&& actAccountMasterCmbMasterSettingsBtn == expAccountMasterCmbMasterSettingsBtn 
	 					&& actAccountMasterNextBookMark == expAccountMasterNextBookMark
	 					&& actAccountMasterPrviousBookMark == expAccountMasterPrviousBookMark
	 					&& actAccountMasterShowAllRecordsBtn == expAccountMasterShowAllRecordsBtn
	 					&& actAccountMasterShowAllUnAuthorisedRecords == expAccountMasterShowAllUnAuthorisedRecords
	 					&& actAccountMasterShowAllClosedRecordsBtn == expAccountMasterShowAllClosedRecordsBtn 
	 					&& actAccountMasterAutoAdjustColumnBtn == expAccountMasterAutoAdjustColumnBtn
	 					&& actAccountMasterRetainSelectionCheckbox == expAccountMasterRetainSelectionCheckbox 
	 					&& actAccountMasterSideBarBtn == expAccountMasterSideBarBtn;
	 		
	 		String actResult=Boolean.toString(actMethod);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 38, 8, actResult.toUpperCase());
	 		
	 		int searchControlListCount=searchControlList.size();
	 		
	 		ArrayList<String> searchControlListArray=new ArrayList<String>();
	 		
	 		for(int i=0;i<searchControlListCount;i++)
	 		{
	 			String data=searchControlList.get(i).getAttribute("title");
	 			searchControlListArray.add(data);
	 		}
	 		
	 		String actsearchControlList=searchControlListArray.toString();
	 		
	 		String expsearchControlList=excelReader.getCellData(xlSheetName, 335, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 335, 8, actsearchControlList);
	 		
	 		System.out.println("Search Txt  Value Actual             : " + actAccountMasterSearchTxt                  + " Value Expected : " + expAccountMasterSearchTxt);
	 		System.out.println("Search Button Value Actual           : " + actAccountMasterSearchBtn                  + " Value Expected : " + expAccountMasterSearchBtn);
	 		System.out.println("Comb Box Value Actual                : " + actAccountMasterCmbMasterTxt               + " Value Expected : " + expAccountMasterCmbMasterTxt);
	 		System.out.println("Combo Box Expansion Value Actual     : " + actAccountMasterCmbMasterExpansionBtn      + " Value Expected : " + expAccountMasterCmbMasterExpansionBtn);
	 		System.out.println("Combo Box Settings Value Actual      : " + actAccountMasterCmbMasterSettingsBtn       + " Value Expected : " + expAccountMasterCmbMasterSettingsBtn);
	 		System.out.println("Next Book Mark Value Actual          : " + actAccountMasterNextBookMark               + " Value Expected : " + expAccountMasterNextBookMark);
	 		System.out.println("Previous Book Mark Value Actual      : " + actAccountMasterPrviousBookMark            + " Value Expected : " + expAccountMasterPrviousBookMark);
	 		System.out.println("Show All Records Value Actual        : " + actAccountMasterShowAllRecordsBtn          + " Value Expected : " + expAccountMasterShowAllRecordsBtn);
	 		System.out.println("Show All Un Authoize Value Actual    : " + actAccountMasterShowAllUnAuthorisedRecords + " Value Expected : " + expAccountMasterShowAllUnAuthorisedRecords);
	 		System.out.println("Show All Closed Value Actual         : " + actAccountMasterShowAllClosedRecordsBtn    + " Value Expected : " + expAccountMasterShowAllClosedRecordsBtn);
	 		System.out.println("Auto Adjust Column Value Actual      : " + actAccountMasterAutoAdjustColumnBtn        + " Value Expected : " + expAccountMasterAutoAdjustColumnBtn);
	 		System.out.println("Selection Check Box Value Actual     : " + actAccountMasterRetainSelectionCheckbox    + " Value Expected : " + expAccountMasterRetainSelectionCheckbox);
	 		System.out.println("Side Bar Value Actual                : " + actAccountMasterSideBarBtn                 + " Value Expected : " + expAccountMasterSideBarBtn);
	 		
	 		System.out.println("searchControlList Actual             : "+actsearchControlList);
	 		System.out.println("searchControlList Axpected           : "+expsearchControlList);
	 		
	 		if (actAccountMasterSearchTxt == expAccountMasterSearchTxt
	 				&& actAccountMasterSearchBtn == expAccountMasterSearchBtn
	 				&& actAccountMasterCmbMasterTxt == expAccountMasterCmbMasterTxt
	 				&& actAccountMasterCmbMasterExpansionBtn == expAccountMasterCmbMasterExpansionBtn
	 				&& actAccountMasterCmbMasterSettingsBtn == expAccountMasterCmbMasterSettingsBtn
	 				&& actAccountMasterNextBookMark == expAccountMasterNextBookMark
	 				&& actAccountMasterPrviousBookMark == expAccountMasterPrviousBookMark
	 				&& actAccountMasterShowAllRecordsBtn == expAccountMasterShowAllRecordsBtn
	 				&& actAccountMasterShowAllUnAuthorisedRecords == expAccountMasterShowAllUnAuthorisedRecords
	 				&& actAccountMasterShowAllClosedRecordsBtn == expAccountMasterShowAllClosedRecordsBtn
	 				&& actAccountMasterAutoAdjustColumnBtn == expAccountMasterAutoAdjustColumnBtn
	 				&& actAccountMasterRetainSelectionCheckbox == expAccountMasterRetainSelectionCheckbox
	 				&& actAccountMasterSideBarBtn == expAccountMasterSideBarBtn
	 				
	 				&& actsearchControlList.equalsIgnoreCase(expsearchControlList))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 334, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 334, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 334, 10, exception);
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		 return false;
	 	 } 
	  }
	 	
	 	
	  
	  @FindBy(xpath="//*[@id='btnSearchAcc']/ol/li/a")
	  private static List<WebElement> searchOnOptions;
	  
	  public static boolean checkSearchOptionAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("*************************** checkSearchOptionAvailableInUnitsMastersPage Method Executes............ ********************************");

	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));
	 		masterSearchBtn.click();

	 		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		boolean expSummaryErrorMessage  = true;

	 		System.out.println("Click on Search Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	 		
	 		int searchOnOptionsCount=searchOnOptions.size();
	 		
	 		ArrayList<String> searchOnOptionsArray = new ArrayList<String>();
	 		
	 		for(int i=0;i<searchOnOptionsCount;i++)
	 		{
	 			String data=searchOnOptions.get(i).getText();
	 			searchOnOptionsArray.add(data);
	 		}
	 		
	 		String actsearchOnOptions=searchOnOptionsArray.toString();
	 		
	 		String expsearchOnOptions=excelReader.getCellData(xlSheetName, 337, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 337, 8, actsearchOnOptions);

	 		System.out.println("searchOnOptions Actual   : "+actsearchOnOptions);
	 		System.out.println("searchOnOptions Expected : "+expsearchOnOptions);
	 		
	 		if (actSummaryErrorMessage==expSummaryErrorMessage && actsearchOnOptions.equalsIgnoreCase(expsearchOnOptions))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 336, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 336, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 336, 10, exception);
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		 return false;
	 	 } 

	  }
	 	
	  
	  @FindBy(xpath = "//th[2]//span[1]")
	  public static WebElement masterGrid_Header_SelectTxt;

	  @FindBy(xpath = "//input[@id='liSelectAllMasters']")
	  public static WebElement masterGridHeader_SelectAllRowsCheckBox;
	  
	  @FindBy(xpath="//*[@id='landgridData']/thead/tr/th/span")
	  private static List<WebElement> masterGridHeader;
	  
	  public static boolean checkUnitsDisplayTableColumnNamesAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  		 
	 	 System.out.println("************************* checkUnitsDisplayTableColumnNamesAvailableInUnitsMastersPage Method Executes............ *************************");
	 		
	 	 try
	 	 {
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGrid_Header_SelectTxt));
	 		 boolean actAccountMasterGridSelectTxt = masterGrid_Header_SelectTxt.isDisplayed();
	 		 masterGrid_Header_SelectTxt.click();

	 		 boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		 boolean expSummaryErrorMessage  = true;
	 			
	 		 System.out.println("Click on Master Grid Header Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	 			
	 		 boolean actAccountMasterGridSelectAllChkbox = masterGridHeader_SelectAllRowsCheckBox.isDisplayed();

	 		 boolean expAccountMasterGridSelectTxt       = true;
	 		 boolean expAccountMasterGridSelectAllChkbox = true;
	 			
	 		 int masterGridHeaderCount=masterGridHeader.size();
	 			
	 		 ArrayList<String> masterGridHeaderArray=new ArrayList<String>();
	 			
	 		 for (int i=1;i<masterGridHeaderCount;i++)
	 		 {
	 			 String data=masterGridHeader.get(i).getText();
	 			 masterGridHeaderArray.add(data);
	 		 }
	 			
	 		 String actmasterGridHeader=masterGridHeaderArray.toString();
	 		 
	 		 String expmasterGridHeader=excelReader.getCellData(xlSheetName, 339, 7);
	 		 
	 		 
	 		 boolean actMethod = actAccountMasterGridSelectTxt == expAccountMasterGridSelectTxt && actAccountMasterGridSelectAllChkbox == expAccountMasterGridSelectAllChkbox;
	 		 
	 		 String actResult = Boolean.toString(actMethod);
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 339, 8, actmasterGridHeader);
	 		 excelReader.setCellData(xlfile, xlSheetName, 338, 8, actResult.toUpperCase());
	 		 
	 		 System.out.println("Grid Select txt Option Value Actual  : " + actAccountMasterGridSelectTxt       + " Value Expected : " + expAccountMasterGridSelectTxt);
	 		 System.out.println("Grid Select All Option Value Actual  : " + actAccountMasterGridSelectAllChkbox + " Value Expected : " + expAccountMasterGridSelectAllChkbox);
	 		 System.out.println("masterGridHeader Actual              : " +actmasterGridHeader);
	 		 System.out.println("masterGridHeader Expected            : " +expmasterGridHeader);
	 		 
	 		 if (actSummaryErrorMessage==expSummaryErrorMessage && actMethod==true && actmasterGridHeader.equalsIgnoreCase(expmasterGridHeader))
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 338, 9, resPass);
	 			 return true;
	 		 }	 
	 		 else	 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 338, 9, resFail);
	 			 return false;
	 		 }	
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 338, 10, exception);
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		 return false;
	 	 } 
	  }
	 	
	  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[10]")
	  private static List<WebElement> unitGridBodyName;
	  
	  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[11]")
	  private static List<WebElement> unitGridBodycode;
	  
	  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
	  private static List<WebElement> unitGridBodyNoOfDecimals;
	  
	  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[13]")
	  private static List<WebElement> unitGridBodyRoundingType;
	  
	  @FindBy(xpath="//*[@id='LandingGridBody']/tr")
	  private static List<WebElement> masterGridBodyRowCount;
	  
	  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[11]")
	  private static List<WebElement> masterGridBodyName;
	  
	  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
	  private static List<WebElement> masterGridBodyCode;
	  
	  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[13]")
	  private static List<WebElement> masterGridBodyAccountType;
	 
	  @FindBy(xpath = "//label[@class='msgInfo']")
	  public static WebElement clickOnEmptyGroup;
	  
	  public static boolean checkUnitsDisplayTableColumnValuesAvailableInUnitMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  		 
	    System.out.println("********************** checkUnitsDisplayTableColumnValuesAvailableInUnitMastersPage Method Executes............ **************************");
	 	
	    try
	    {
	 	   int actMasterGridBodyListCount=masterGridBodyRowCount.size();
	    	
	 	   int expMasterGridBodyListCount=0;
	 	  
	 	   /*System.out.println("masterGridBodyListCount"+masterGridBodyListCount);
	 	    	
	 	   String actmasterGridBodyList=clickOnEmptyGroup.getText();
	 	   	
	 	   String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 341, 7);
	 	   	
	 	   excelReader.setCellData(xlfile, xlSheetName, 341, 8, actmasterGridBodyList);*/
	 	   	
	 	   System.out.println("masterGridBodyList Actual   : "+actMasterGridBodyListCount);
	 	   System.out.println("masterGridBodyList Expected : "+expMasterGridBodyListCount);
	 	   	
	 	   if(actMasterGridBodyListCount==expMasterGridBodyListCount)
	 	   {
	 		   excelReader.setCellData(xlfile, xlSheetName, 340, 9, resPass);
	 		   return true;
	 	   } 
	 	   else 
	 	   {
	 		   excelReader.setCellData(xlfile, xlSheetName, 340, 9, resFail);
	 		   return false;
	 	   }
	    }
	    catch (Exception e) 
	    {
	 	   String exception =e.getMessage().substring(0, 50);
	 	   excelReader.setExceptionInExcel(xlfile, xlSheetName, 340, 10, exception);
	 	   System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 	   return false;
	    } 
	  }
	   
	   
	  
	  
	 	@FindBy(xpath = "//select[@id='iRoundingType']")
	 	private static WebElement unitsmasterRoundingType;
	 	
	 	@FindBy(xpath = "//*[@id='UnitType']")
	 	private static WebElement unitsmasterUnitType;
	  
	 	
	 	  @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[2]/div[1]/ul/li/div/div/a")
	 	  private static List<WebElement> masterNewGridHeader;
	 	  
	 	  @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button")
	 	  private static List<WebElement> masterNewGridHeaderButtons;
	 	  
	 	  @FindBy(xpath="//*[@id='newMasterDiv0']/div/div/div[1]/label/a")
	 	  private static List<WebElement> masterNewGeneralTabList;
	  
	  public static boolean checkClickOnNewButtonInUnitsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	 	 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
	 	 System.out.println("********************** checkClickOnNewButtonInUnitsMasterPage Method Executes............ **************************");
	 	
	 	 try
	 	 {
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	 		 masterNewBtn.click();
	 		 
	 		 int masterNewGridHeaderButtonsCount=masterNewGridHeaderButtons.size();
	 		 
	 		 ArrayList<String> masterNewGridHeaderButtonsArray = new ArrayList<String>();
	 		 
	 		 for (int i=0;i<masterNewGridHeaderButtonsCount;i++)
	 		 {
	 			 String data=masterNewGridHeaderButtons.get(i).getText();
	 			 masterNewGridHeaderButtonsArray.add(data);
	 		 }	
	 		 
	 		 String actmasterNewGridHeaderButtons=masterNewGridHeaderButtonsArray.toString();
	 		 
	 		 String expmasterNewGridHeaderButtons=excelReader.getCellData(xlSheetName, 343, 7);
	 		 
	 		 int masterNewGeneralTabListCount=masterNewGeneralTabList.size();
	 		 
	 		 ArrayList<String> masterNewGeneralTabListArray = new ArrayList<String>();
	 		 
	 		 for (int i=0;i<masterNewGeneralTabListCount;i++)
	 		 {
	 			 String data=masterNewGeneralTabList.get(i).getText();
	 			 masterNewGeneralTabListArray.add(data);
	 		 }
	 		 
	 		 String actmasterNewGeneralTabList=masterNewGeneralTabListArray.toString();
	 		 
	 		 String expmasterNewGeneralTabList=excelReader.getCellData(xlSheetName, 344, 7);
	 		 
	 		 Select oSelect = new Select(unitsmasterRoundingType);
	 		 List<WebElement> elementCount = oSelect.getOptions();
	 		 
	 		 int accRoundingTypeSize = elementCount.size();
	 		 
	 		 String actRoundingTypeSize=Integer.toString(accRoundingTypeSize);
	 		 
	 		 String expRoundingTypeSize = excelReader.getCellData(xlSheetName, 345, 7);
	 		 
	 		 Select oSelect1 = new Select(unitsmasterUnitType);
	 		 List<WebElement> elementCount1 = oSelect1.getOptions();
	 		 
	 		 int accunitsmasterUnitType = elementCount1.size();
	 		 
	 		 String actunitsmasterUnitType=Integer.toString(accunitsmasterUnitType);
	 		 
	 		 String expunitsmasterUnitType = excelReader.getCellData(xlSheetName, 346, 7);
	 		 
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 343, 8, actmasterNewGridHeaderButtons);
	 		 excelReader.setCellData(xlfile, xlSheetName, 344, 8, actmasterNewGeneralTabList);
	 		 excelReader.setCellData(xlfile, xlSheetName, 345, 8, actRoundingTypeSize);
	 		 excelReader.setCellData(xlfile, xlSheetName, 346, 8, actunitsmasterUnitType);
	 		 
	 		 System.out.println("actmasterNewGridHeaderButtons    : " + actmasterNewGridHeaderButtons);
	 		 System.out.println("expmasterNewGridHeaderButtons    : " + expmasterNewGridHeaderButtons);
	 		 System.out.println("actmasterNewGeneralTabList       : " + actmasterNewGeneralTabList);
	 		 System.out.println("expmasterNewGeneralTabList       : " + expmasterNewGeneralTabList);
	 		 System.out.println("RoundingTypeSize Value Actual    : " + actRoundingTypeSize     + " Value Expected : " + expRoundingTypeSize);
	 		 System.out.println("unitsmasterUnitType Value Actual : " + actunitsmasterUnitType  + " Value Expected : " + expunitsmasterUnitType);
	 		 
	 		 
	 		 if (actmasterNewGridHeaderButtons.equalsIgnoreCase(expmasterNewGridHeaderButtons) && actmasterNewGeneralTabList.equalsIgnoreCase(expmasterNewGeneralTabList)
	 				 && actRoundingTypeSize.equalsIgnoreCase(expRoundingTypeSize) && actunitsmasterUnitType.equalsIgnoreCase(expunitsmasterUnitType)) 
	 		 {	
	 			 excelReader.setCellData(xlfile, xlSheetName, 342, 9, resPass);
	 			 return true;
	 		 } 
	 		 else 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 342, 9, resFail);
	 			 return false;
	 		 }		
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		  String exception =e.getMessage().substring(0, 50);
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 342, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	 } 	
	  }

	  
	 
	  public static boolean checkInputNameCodeNoOfDecimalsAndClickOnSaveButtonInUnitsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	 	 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
	 	 System.out.println("***************** checkInputNameCodeNoOfDecimalsAndClickOnSaveButtonInUnitsCreationPage Method Executes............************************");
	 	
	 	 try
	 	 {
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 		 nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 347, 6));
	 		 	
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 		 codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 348, 6));
	 		 codeTxt.sendKeys(Keys.TAB);
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxt));
	 		 noOfDecimalsTxt.sendKeys(excelReader.getCellData(xlSheetName, 349, 6));
	 	
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 		 saveBtn.click();
	 	
	 		 String expUnitsSaveMessage = excelReader.getCellData(xlSheetName, 348, 7);
	 	
	 		 boolean actMessageOnSaveUnit = checkValidationMessageboolean(expUnitsSaveMessage);
	 		 boolean expMessageOnSaveUnit = true;
	 		 
	 		 String actResult = Boolean.toString(actMessageOnSaveUnit);
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 347, 8, actResult.toUpperCase());
	 	
	 		 System.out.println("Click on Save                   : " + actMessageOnSaveUnit + "  Value Expected :       "+ expMessageOnSaveUnit);
	 	
	 		 if (actMessageOnSaveUnit==expMessageOnSaveUnit)
	 		 {	
	 			 excelReader.setCellData(xlfile, xlSheetName, 347, 9, resPass);
	 			 return true;
	 		 } 
	 		 else 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 347, 9, resFail);
	 			 return false;
	 		 }		
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		  String exception =e.getMessage().substring(0, 50);
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 347, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	 } 	
	  }

	  
	 	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
	 	public static WebElement unitsNewCreationNameInFirstRow;

	 	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
	 	public static WebElement unitNewCreationNameInSecondRow;

	 	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[11]")
	 	public static WebElement unitNewCreationNameInThirdRow;

	 	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[6]/td[11]")
	 	public static WebElement unitNewCreationNameInSixthRow;
	  
	   public static boolean checkUnitsCreationAndClickOnCloseButtonToDisplayCreatedUnitsInDisplayGrid()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("***************  checkUnitsCreationAndClickOnCloseButtonToDisplayCreatedUnitsInDisplayGrid Method Executes..........   *********************");
	 	
	 	try
	 	{
	 		boolean actUnitsMasterName                   = nameTxt.getText().isEmpty();
	 		boolean actUnitsMasterCode                   = codeTxt.getText().isEmpty();
	 		
	 		boolean expUnitsMasterName                   = true;
	 		boolean expUnitsMasterCode                   = true;
	 		
	 		boolean actMethod = actUnitsMasterName == expUnitsMasterName && actUnitsMasterCode == expUnitsMasterCode;
	 		
	 		String actResult = Boolean.toString(actMethod);
	 		
	 		int masterNewGridHeaderButtonsCount=masterNewGridHeaderButtons.size();
	 		 
	 		 ArrayList<String> masterNewGridHeaderButtonsArray = new ArrayList<String>();
	 		 
	 		 for (int i=0;i<masterNewGridHeaderButtonsCount;i++)
	 		 {
	 			 String data=masterNewGridHeaderButtons.get(i).getText();
	 			 masterNewGridHeaderButtonsArray.add(data);
	 		 }	
	 		 
	 		 String actmasterNewGridHeaderButtons=masterNewGridHeaderButtonsArray.toString();
	 		 
	 		 String expmasterNewGridHeaderButtons=excelReader.getCellData(xlSheetName, 351, 7);
	 		 
	 		 int masterNewGeneralTabListCount=masterNewGeneralTabList.size();
	 		 
	 		 ArrayList<String> masterNewGeneralTabListArray = new ArrayList<String>();
	 		 
	 		 for (int i=0;i<masterNewGeneralTabListCount;i++)
	 		 {
	 			 String data=masterNewGeneralTabList.get(i).getText();
	 			 masterNewGeneralTabListArray.add(data);
	 		 }
	 		 
	 		 String actmasterNewGeneralTabList=masterNewGeneralTabListArray.toString();
	 		 
	 		 String expmasterNewGeneralTabList=excelReader.getCellData(xlSheetName, 352, 7);
	 		 
	 		 Select oSelect = new Select(unitsmasterRoundingType);
	 		 List<WebElement> elementCount = oSelect.getOptions();
	 		 
	 		 int accRoundingTypeSize = elementCount.size();
	 		 
	 		 String actRoundingTypeSize=Integer.toString(accRoundingTypeSize);
	 		 
	 		 String expRoundingTypeSize = excelReader.getCellData(xlSheetName, 353, 7);
	 		 
	 		 Select oSelect1 = new Select(unitsmasterUnitType);
	 		 List<WebElement> elementCount1 = oSelect1.getOptions();
	 		 
	 		 int accunitsmasterUnitType = elementCount1.size();
	 		 
	 		 String actunitsmasterUnitType=Integer.toString(accunitsmasterUnitType);
	 		 
	 		 String expunitsmasterUnitType = excelReader.getCellData(xlSheetName, 354, 7);
	 		 
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	 		 closeBtn.click();
	 			
	 		 int masterGridBodyListCount=masterGridBodyRowCount.size();
	 		 
	 		 ArrayList<String> masterGridBodyListArray = new ArrayList<String>();
	 		 
	 		 for (int i=0;i<masterGridBodyListCount;i++)
	 		 {
	 			 String unitGridBodyNamedata         =unitGridBodyName.get(i).getText();
	 			 String unitGridBodycodedata         =unitGridBodycode.get(i).getText();
	 			 String unitGridBodyNoOfDecimalsdata =unitGridBodyNoOfDecimals.get(i).getText();
	 			 String unitGridBodyRoundingTypedata =unitGridBodyRoundingType.get(i).getText();
	 			 
	 			 masterGridBodyListArray.add(unitGridBodyNamedata);
	 			 masterGridBodyListArray.add(unitGridBodycodedata);
	 			 masterGridBodyListArray.add(unitGridBodyNoOfDecimalsdata);
	 			 masterGridBodyListArray.add(unitGridBodyRoundingTypedata);
	 		 }
	 		 
	 		 String actmasterGridBodyList=masterGridBodyListArray.toString();
	 		 
	 		 String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 355, 7);
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 350, 8, actResult.toUpperCase());
	 		 excelReader.setCellData(xlfile, xlSheetName, 351, 8, actmasterNewGridHeaderButtons);
	 		 excelReader.setCellData(xlfile, xlSheetName, 352, 8, actmasterNewGeneralTabList);
	 		 excelReader.setCellData(xlfile, xlSheetName, 353, 8, actRoundingTypeSize);
	 		 excelReader.setCellData(xlfile, xlSheetName, 354, 8, actunitsmasterUnitType);
	 		 excelReader.setCellData(xlfile, xlSheetName, 355, 8, actmasterGridBodyList);
	 		 
	 		 System.out.println("actmasterNewGridHeaderButtons    : " + actmasterNewGridHeaderButtons);
	 		 System.out.println("expmasterNewGridHeaderButtons    : " + expmasterNewGridHeaderButtons);
	 		 System.out.println("actmasterNewGeneralTabList       : " + actmasterNewGeneralTabList);
	 		 System.out.println("expmasterNewGeneralTabList       : " + expmasterNewGeneralTabList);
	 		 System.out.println("RoundingTypeSize Value Actual    : " + actRoundingTypeSize     + " Value Expected : " + expRoundingTypeSize);
	 		 System.out.println("unitsmasterUnitType Value Actual : " + actunitsmasterUnitType  + " Value Expected : " + expunitsmasterUnitType);
	 		 System.out.println("masterGridBodyList Actual        : " + actmasterGridBodyList);
	 		 System.out.println("masterGridBodyList Expected      : " + expmasterGridBodyList);
	 		 
	 		 
	 		 if (actMethod==true && actmasterNewGridHeaderButtons.equalsIgnoreCase(expmasterNewGridHeaderButtons)
	 				 && actmasterNewGeneralTabList.equalsIgnoreCase(expmasterNewGeneralTabList) && actRoundingTypeSize.equalsIgnoreCase(expRoundingTypeSize) 
	 				 && actunitsmasterUnitType.equalsIgnoreCase(expunitsmasterUnitType) && actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList)) 
	 		 {	
	 			 excelReader.setCellData(xlfile, xlSheetName, 350, 9, resPass);
	 			 return true;
	 		 } 
	 		 else 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 350, 9, resFail);
	 			 return false;
	 		 }		
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		  String exception =e.getMessage().substring(0, 50);
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 350, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	 } 	
	  }

	  @FindBy(xpath = "//*[@id='lblnchecked']/input")
	  public static WebElement unitsNameCheckBoxIsCheckedAfterSearch;

	  @FindBy(xpath = "//input[@id='liSelectAllMasters']")
	  public static WebElement mastersSelectAllCheckbox;
	  
	  @FindBy(xpath = "//tbody[@id='cmbUserTypeMaster_table_body']/tr/td[2]")
	  private static List<WebElement> mastercmbMasterListCount;


	  // Edit Units

	  public static boolean checkSearchUnitsAndClickOnEditToDisplayUnitsSavedInformation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	 	 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	 System.out.println("*****************  checkSearchUnitsAndClickOnEditToDisplayUnitsSavedInformation Method Executes.........     ********************");
	   
	 	 try
	 	 {
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
	 		 mastercmbMasterTxt.click();
	 		 mastercmbMasterTxt.sendKeys(Keys.SPACE);
	 		 
	 		 int mastercmbMasterList = mastercmbMasterListCount.size();
	 		 
	 		 for(int i=0;i<mastercmbMasterList;i++)
	 		 {
	 			 String data = mastercmbMasterListCount.get(i).getText();
	 			 if(data.equalsIgnoreCase("PcsST"))
	 			 {
	 				 mastercmbMasterListCount.get(i).click();
	 			 }	
	 		 }
	 		 
	 		 mastercmbMasterTxt.sendKeys(Keys.TAB);
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsNameCheckBoxIsCheckedAfterSearch));
	 		 boolean actUnitNameSearchedIsChecked = unitsNameCheckBoxIsCheckedAfterSearch.isSelected();
	 		 boolean expUnitNameSearchedIsChecked = true;
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	 		 masterEditBtn.click();
	 		 
	 		 int masterNewGridHeaderButtonsCount=masterNewGridHeaderButtons.size();
	 		 
	 		 ArrayList<String> masterNewGridHeaderButtonsArray = new ArrayList<String>();
	 		 
	 		 for (int i=0;i<masterNewGridHeaderButtonsCount;i++)
	 		 {
	 			 String data=masterNewGridHeaderButtons.get(i).getText();
	 			 masterNewGridHeaderButtonsArray.add(data);
	 		 }	
	 		 
	 		 String actmasterNewGridHeaderButtons=masterNewGridHeaderButtonsArray.toString();
	 		 
	 		 String expmasterNewGridHeaderButtons=excelReader.getCellData(xlSheetName, 357, 7);
	 		 
	 		 int masterNewGeneralTabListCount=masterNewGeneralTabList.size();
	 		 
	 		 ArrayList<String> masterNewGeneralTabListArray = new ArrayList<String>();
	 		 
	 		 for (int i=0;i<masterNewGeneralTabListCount;i++)
	 		 {
	 			 String data=masterNewGeneralTabList.get(i).getText();
	 			 masterNewGeneralTabListArray.add(data);
	 		 }
	 		 
	 		 String actmasterNewGeneralTabList=masterNewGeneralTabListArray.toString();
	 		 
	 		 String expmasterNewGeneralTabList=excelReader.getCellData(xlSheetName, 358, 7);
	 		 
	 		 Select oSelect = new Select(unitsmasterRoundingType);
	 		 List<WebElement> elementCount = oSelect.getOptions();
	 		 
	 		 int accRoundingTypeSize = elementCount.size();
	 		 
	 		 String actRoundingTypeSize=Integer.toString(accRoundingTypeSize);
	 		 
	 		 String expRoundingTypeSize = excelReader.getCellData(xlSheetName, 359, 7);
	 		 
	 		 Select oSelect1 = new Select(unitsmasterUnitType);
	 		 List<WebElement> elementCount1 = oSelect1.getOptions();
	 		 
	 		 int accunitsmasterUnitType = elementCount1.size();
	 		 
	 		 String actunitsmasterUnitType=Integer.toString(accunitsmasterUnitType);
	 		 
	 		 String expunitsmasterUnitType = excelReader.getCellData(xlSheetName, 360, 7);
	 		 
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 		 
	 		 String actUnitsMasterName                    = nameTxt.getAttribute("value");
	 		 String actUnitsMasterCode                    = codeTxt.getAttribute("value");
	 		 String actUnitsNoOfDecimals                  = noOfDecimalsTxt.getAttribute("value");
	 		 
	 		 String expUnitMasterName                     = excelReader.getCellData(xlSheetName, 361, 7);
	 		 String expUnitsMasterCode                    = excelReader.getCellData(xlSheetName, 362, 7);
	 		 String expUnitsNoOfDecimals                  = excelReader.getCellData(xlSheetName, 363, 7);
	 		 
	 		 String actResult = Boolean.toString(actUnitNameSearchedIsChecked);
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 356, 8, actResult.toUpperCase());
	 		 excelReader.setCellData(xlfile, xlSheetName, 357, 8, actmasterNewGridHeaderButtons);
	 		 excelReader.setCellData(xlfile, xlSheetName, 358, 8, actmasterNewGeneralTabList);
	 		 excelReader.setCellData(xlfile, xlSheetName, 359, 8, actRoundingTypeSize);
	 		 excelReader.setCellData(xlfile, xlSheetName, 360, 8, actunitsmasterUnitType);
	 		 excelReader.setCellData(xlfile, xlSheetName, 361, 8, actUnitsMasterName);
	 		 excelReader.setCellData(xlfile, xlSheetName, 362, 8, actUnitsMasterCode);
	 		 excelReader.setCellData(xlfile, xlSheetName, 363, 8, actUnitsNoOfDecimals);
	 		 
	 		 System.out.println("actmasterNewGridHeaderButtons    : " + actmasterNewGridHeaderButtons);
	 		 System.out.println("expmasterNewGridHeaderButtons    : " + expmasterNewGridHeaderButtons);
	 		 System.out.println("actmasterNewGeneralTabList       : " + actmasterNewGeneralTabList);
	 		 System.out.println("expmasterNewGeneralTabList       : " + expmasterNewGeneralTabList);
	 		 System.out.println("RoundingTypeSize Value Actual    : " + actRoundingTypeSize               + " Value Expected : " + expRoundingTypeSize);
	 		 System.out.println("unitsmasterUnitType Value Actual : " + actunitsmasterUnitType            + " Value Expected : " + expunitsmasterUnitType);
	 		 System.out.println("Name Value Actual                : " + actUnitNameSearchedIsChecked      + " Value Expected : " + expUnitNameSearchedIsChecked);
	 		 System.out.println("Name Value Actual                : " + actUnitsMasterName                + " Value Expected : " + expUnitMasterName);
	 		 System.out.println("Code Value Actual                : " + actUnitsMasterCode                + " Value Expected : " + expUnitsMasterCode);
	 		 System.out.println("No Of Decimals Value Actual      : " + actUnitsNoOfDecimals              + " Value Expected : " + expUnitsNoOfDecimals);
	 		 
	 		 if (actUnitNameSearchedIsChecked == expUnitNameSearchedIsChecked && actUnitsMasterName.equalsIgnoreCase(expUnitMasterName)
	 				 && actUnitsMasterCode.equalsIgnoreCase(expUnitsMasterCode) && actUnitsNoOfDecimals.equalsIgnoreCase(expUnitsNoOfDecimals)
	 				 && actmasterNewGridHeaderButtons.equalsIgnoreCase(expmasterNewGridHeaderButtons) 
	 				 && actmasterNewGeneralTabList.equalsIgnoreCase(expmasterNewGeneralTabList)
	 				 && actRoundingTypeSize.equalsIgnoreCase(expRoundingTypeSize) && actunitsmasterUnitType.equalsIgnoreCase(expunitsmasterUnitType))
	 		 {			
	 			 excelReader.setCellData(xlfile, xlSheetName, 356, 9, resPass);
	 			 return true;
	 		 } 
	 		 else 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 356, 9, resFail);
	 			 return false;
	 		 }		
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 356, 10, e.getMessage());
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		 return false;
	 	 } 	
	  }

	  // Update Units

	  public static boolean checkUpdateUnitsOnInputNameCodeAndClickOnSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("*******************      checkUpdateUnitsOnInputNameCodeAndClickOnSaveButton Method Executes............    ***************************");
	 		
	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 		nameTxt.click();
	 		nameTxt.sendKeys(Keys.END);
	 		nameTxt.sendKeys(Keys.SHIFT, Keys.HOME);
	 		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 364, 6));
	 		//Thread.sleep(2000);
	 		nameTxt.sendKeys(Keys.TAB);
	 		

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 		codeTxt.click();
	 		codeTxt.sendKeys(Keys.END);
	 		codeTxt.sendKeys(Keys.SHIFT, Keys.HOME);
	 		codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 365, 6));
	 		//Thread.sleep(2000);
	 		codeTxt.sendKeys(Keys.TAB);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 		saveBtn.click();
	 		
	 		String expUnitsUpdateMessage = excelReader.getCellData(xlSheetName, 365, 7);
	 		
	 		boolean actMessageOnUpdateUnits = checkValidationMessageboolean(expUnitsUpdateMessage);
	 		boolean expMessageOnUpdateUnits = true;
	 		
	 		String actResult = Boolean.toString(actMessageOnUpdateUnits);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 364, 8, actResult.toUpperCase());
	 	
	 		System.out.println("Click on Save in Edit Units        : " + actMessageOnUpdateUnits +        "  Value Expected :       "+ expMessageOnUpdateUnits);

	 		if (actMessageOnUpdateUnits==expMessageOnUpdateUnits) 
	 		{			
	 			 excelReader.setCellData(xlfile, xlSheetName, 364, 9, resPass);
	 			 return true;
	 		 } 
	 		 else 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 364, 9, resFail);
	 			 return false;
	 		 }		
	 	 }
	 	 catch (Exception e) 
	 	 {
	 		 String exception =e.getMessage().substring(0, 50);
	 		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 364, 10, e.getMessage());
	 		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		 return false;
	 	 } 	
	  }

	 	// Update Unit display in Unit Display Grid

	   public static boolean checkUpdateUnitNameInUnitDisplayGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	 	  
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("********************     checkUpdateUnitNameInUnitDisplayGrid Method Executes............     ********************************");
	 		
	     try
	     {
	     	//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitNewCreationNameInThirdRow));
	     	
	     	int masterGridBodyListCount=masterGridBodyRowCount.size();
	 		 
	     	ArrayList<String> masterGridBodyListArray = new ArrayList<String>();
	     	
	     	for (int i=0;i<masterGridBodyListCount;i++)
	     	{
	     		String unitGridBodyNamedata         =unitGridBodyName.get(i).getText();
	     		String unitGridBodycodedata         =unitGridBodycode.get(i).getText();
	     		String unitGridBodyNoOfDecimalsdata =unitGridBodyNoOfDecimals.get(i).getText();
	     		String unitGridBodyRoundingTypedata =unitGridBodyRoundingType.get(i).getText();
	 			 
	     		masterGridBodyListArray.add(unitGridBodyNamedata);
	     		masterGridBodyListArray.add(unitGridBodycodedata);
	     		masterGridBodyListArray.add(unitGridBodyNoOfDecimalsdata);
	     		masterGridBodyListArray.add(unitGridBodyRoundingTypedata);
	     	}
	 		 
	     	String actmasterGridBodyList=masterGridBodyListArray.toString();
	 		 
	     	String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 367, 7);
	     	
	     	excelReader.setCellData(xlfile, xlSheetName, 367, 8, actmasterGridBodyList);
	     	
	     	System.out.println("masterGridBodyList Actual        : " + actmasterGridBodyList);
	     	System.out.println("masterGridBodyList Expected      : " + expmasterGridBodyList);

	 		if (actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList)) 
	 		{			
	 			excelReader.setCellData(xlfile, xlSheetName, 366, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 366, 9, resFail);
	 			return false;
	 		}		
	     }
	     catch (Exception e) 
	     {
	     	String exception =e.getMessage().substring(0, 50);
	     	excelReader.setExceptionInExcel(xlfile, xlSheetName, 366, 10, e.getMessage());
	     	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	     	return false;
	     } 	
	   }

	   // Delete Unit

	   @FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
	   public static WebElement unitFirstCheckBox;

	   @FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/label[1]/input[1]")
	   public static WebElement masterSecondCheckBox;

	   public static boolean checkDeleteUnitsWhichAreDefinedInProductsOnSelectUnitAndClickOnDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	    excelReader = new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	    System.out.println("***************   checkDeleteUnitsWhichAreDefinedInProductsOnSelectUnitAndClickOnDelete Method Executes............    **********************");
	 		
	    try
	    {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
	 		masterSearchTxt.click();
	 		masterSearchTxt.sendKeys(Keys.END);
	 		masterSearchTxt.sendKeys(Keys.SHIFT, Keys.HOME);

	 		masterSearchTxt.sendKeys("DozsST");
	 		//Thread.sleep(2000);

	 		masterSearchTxt.sendKeys(Keys.ENTER);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsNewCreationNameInFirstRow));
	 		System.out.println(unitsNewCreationNameInFirstRow.getText());
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
	 		unitFirstCheckBox.click();
	 	
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
	 		masterDeleteBtn.click();
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));

	 		String actMessageOnClickOnDeleteButton = getMsgOnDelete.getText();
	 		
	 		String expMessageOnClickOnDeleteButton = excelReader.getCellData(xlSheetName, 369, 7);
	 		
	 		System.out.println("Click on Save in Edit Units        : " + actMessageOnClickOnDeleteButton+ " Value Expected :       " + expMessageOnClickOnDeleteButton);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
	 		clickOnOkInDelete.click();
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 		String actUnitsDeleteOkMessage = validationConfirmationMessage.getText();
	 		String expUnitsDeleteOkMessage = excelReader.getCellData(xlSheetName, 370, 7);
	 		
	 		if(closeValidationConfirmationMessage.isDisplayed())
	 		{
	 			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
		 		closeValidationConfirmationMessage.click();
	
	 		}
	 		
	 		
	 		System.out.println("Click on Save in Edit Units        : " + actUnitsDeleteOkMessage+         " Value Expected :       " + expUnitsDeleteOkMessage);
	 		
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 369, 8, expMessageOnClickOnDeleteButton);

	 		if (actMessageOnClickOnDeleteButton.equalsIgnoreCase(expMessageOnClickOnDeleteButton)
	 				&& actUnitsDeleteOkMessage.equalsIgnoreCase(expUnitsDeleteOkMessage)) 
	 		{			
	 			excelReader.setCellData(xlfile, xlSheetName, 368, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 368, 9, resFail);
	 			return false;
	 		}		
	     }
	     catch (Exception e) 
	     {
	     	excelReader.setExceptionInExcel(xlfile, xlSheetName, 368, 10, e.getMessage());
	     	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	     	return false;
	     } 	
	   }

	   @FindBy(xpath = "//a[@class='clsMasterName theme_color-inverse']")
	   public static WebElement unitsTreeLeftSide;

	   public static boolean checkDeleteUnitsOnSelectUnitAndClickOnDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("**********************   checkDeleteUnitsOnSelectUnitAndClickOnDelete  Method Executes............  *******************************");

	    try
	    {
	 	  
	 	    /*//Creating Units of Pcs   
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsNewCreationNameInFirstRow));
	 		unitsNewCreationNameInFirstRow.click();
	 		*/
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	 		masterNewBtn.click();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 371, 6));

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 		codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 371, 6));
	 		codeTxt.sendKeys(Keys.TAB);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxt));
	 		noOfDecimalsTxt.sendKeys(excelReader.getCellData(xlSheetName, 373, 6));
	 		
	 		//Thread.sleep(2000);

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 		saveBtn.click();

	 		String expUnitsSaveMessage = excelReader.getCellData(xlSheetName, 372, 7);
	 		
	 		boolean actMessageOnSaveUnits=checkValidationMessageboolean(expUnitsSaveMessage);
	 		boolean expMessageOnSaveUnits=true;
	 		
	 		System.out.println("Click on Save                   : " + actMessageOnSaveUnits +            " Value Expected :  " + expMessageOnSaveUnits);

	 		
	 		Thread.sleep(2000);
	 		
	 		
	 		//Creating Units of Dozs
	 	
	 		   

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 372, 6));

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 		codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 372, 6));
	 		codeTxt.sendKeys(Keys.TAB);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxt));
	 		noOfDecimalsTxt.sendKeys(excelReader.getCellData(xlSheetName, 373, 6));
	 		
	 		//Thread.sleep(2000);

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 		saveBtn.click();

	 		String expUnitsSaveMessages = excelReader.getCellData(xlSheetName, 372, 7);
	 		
	 		boolean actMessageOnSaveUnitss=checkValidationMessageboolean(expUnitsSaveMessages);
	 		boolean expMessageOnSaveUnitss=true;
	 		
	 		System.out.println("Click on Save                   : " + actMessageOnSaveUnitss +            " Value Expected :  " + expMessageOnSaveUnitss);

	 		
	 		Thread.sleep(2000);
	 		
	 	
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	 		 closeBtn.click();
	 			
	 		//Thread.sleep(5000); 
	 		
	 			if (actMessageOnSaveUnits==expMessageOnSaveUnits) 
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
	     catch (Exception e) 
	     {
	     	String exception =e.getMessage().substring(0, 100);
	     	excelReader.setExceptionInExcel(xlfile, xlSheetName, 371, 10, exception);
	     	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	     	return false;
	     } 		
	   }
	   
	   
	 /* public static boolean ServerErrorExecption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	
	 		 boolean actValidationDisplayMessage = serverErrorPopup.isDisplayed();

	 			if (actValidationDisplayMessage == true)
	 			{
	 				System.err.println("Server Error Popup is Displaying");
	 				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serverErrorClose));
	 				serverErrorClose.click();
	 				return actValidationDisplayMessage;
	 			} 
	 			else
	 			{
	 				System.out.println("NO Server Error Popup is Displaying");
	 				return false;
	 			}
	 	 
	  }*/
	   

	   public static boolean checkDeletedUnitDisplayInUnitsMainGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************************ checkDeleteUnitsOnSelectUnitAndClickOnDelete  Method Executes  ............ *******************************");

	 	try
	 	{
	 		  String actmasterGridBodyList=clickOnEmptyGroup.getText();
	 		   	
	 		   String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 341, 7);
	 		   	
	 		   excelReader.setCellData(xlfile, xlSheetName, 341, 8, actmasterGridBodyList);
	 		   	
	 		   System.out.println("masterGridBodyList Actual   : "+actmasterGridBodyList);
	 		   System.out.println("masterGridBodyList Expected : "+expmasterGridBodyList);
	 		   	
	 		   if(actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList))
	 		   {
	 			   excelReader.setCellData(xlfile, xlSheetName, 340, 9, resPass);
	 			   return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 375, 9, resFail);
	 			return false;
	 		}		
	     }
	     catch (Exception e) 
	     {
	     	String exception =e.getMessage().substring(0, 50);
	     	excelReader.setExceptionInExcel(xlfile, xlSheetName, 375, 10, exception);
	     	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	     	return false;
	     } 	
	   }

	   @FindBy(xpath = "//span[@id='btnClose']")
	   public static WebElement unitsCloseBtn;

	   public static boolean checkClicOnCloseButtonToCloseUnitsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("*********************************    checkCloseUnitsMaster Method Executes............    **********************************************");
	 		
	     try
	     {	
	 	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsCloseBtn));
	 		unitsCloseBtn.click();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));

	 		boolean actLoadDashboard           = labelDashboard.isDisplayed();
	 		boolean actSelectDashboard         = selectDashboard.isDisplayed();
	 		boolean actNewDashboard            = newAddDashBoard.isDisplayed();
	 		boolean actDashboardCustomization  = dashboardCustomizationSettings.isDisplayed();

	 		boolean expLoadDashboard          = true;
	 		boolean expSelectDashboard        = true;
	 		boolean expNewDashboard           = true;
	 		boolean expDashboardCustomization = true;
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
	 		String actDashboardLabel = labelDashboard.getText();
	 		String expDashboardLabel = excelReader.getCellData(xlSheetName, 378, 7);
	 		
	 		boolean actMethod = actLoadDashboard == expLoadDashboard && actSelectDashboard == expSelectDashboard
	 							&& actNewDashboard == expNewDashboard && actDashboardCustomization == expDashboardCustomization;
	 		
	 		String actResult = Boolean.toString(actMethod);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 377, 8, actResult.toUpperCase());
	 		excelReader.setCellData(xlfile, xlSheetName, 378, 8, actDashboardLabel);

	 		System.out.println("Load Dashbord Value Actual                          : " + actLoadDashboard+          " Value Expected : " + expLoadDashboard);
	 		System.out.println("Select Dashbord Value Actual                        : " + actSelectDashboard+        " Value Expected : " + expSelectDashboard);
	 		System.out.println("New Dashbord Value Actual                           : " + actNewDashboard+           " Value Expected : " + expNewDashboard);
	 		System.out.println("Dashbord Customization Value Actual                 : " + actDashboardCustomization+ " Value Expected : " + expDashboardCustomization);

	 		if (actDashboardLabel.equalsIgnoreCase(expDashboardLabel) && actMethod==true)
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 377, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 377, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 377, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		return false;
	 	}

	 }
	  

	   
	   
	   
	   
	   
	   
	   //UNITS CONVERTION PAGE STARTS
	   	   
	   @FindBy(xpath = "//div[contains(text(),'Save')]")
	   private static WebElement unitsConversionSaveButton;

	   @FindBy(xpath = "//div[contains(text(),'Import From Excel')]")
	   private static WebElement unitsConversionImportFromExcelButton;

	   @FindBy(xpath = "//div[contains(text(),'Delete')]")
	   private static WebElement unitsConversionDeleteButton;
	   
	   @FindBy(xpath = "//*[@id='btnDelete']")
	   private static WebElement unitsConversionDeleteQButton;

	   @FindBy(xpath = "//div[contains(text(),'Clear')]")
	   private static WebElement unitsConversionClearButton;

	   @FindBy(xpath = "//li[@id='ucCancel']//div[@class='toolbar_button_text'][contains(text(),'Cancel')]")
	   private static WebElement unitsConversionCancelButton;

	   @FindBy(xpath = "//input[@id='optionBaseUnit']")
	   private static WebElement unitsConversionBaseUnit;

	   @FindBy(xpath = "//input[@id='optionProduct']")
	   private static WebElement unitsConversionProduct;

	   @FindBy(xpath = "//input[@id='optionLoadFrom']")
	   private static WebElement unitsConversionLoadFrom;

	   @FindBy(xpath = "//td[@id='myTagsTable_col_1-2']")
	   private static WebElement unitsConversionUnit;

	   @FindBy(xpath = "//input[@id='myTagsTable_UnitName']")
	   private static WebElement inputUnitConversionUnit;

	   @FindBy(xpath = "//td[@id='myTagsTable_col_1-3']")
	   private static WebElement unitsConversionXFactor;

	   @FindBy(xpath = "//input[@id='myTagsTable_XFactor']")
	   private static WebElement inputUnitsConversionXFactor;

	   @FindBy(xpath = "//input[@id='myTagsTable_AdditionalQuantity']")
	   private static WebElement inputUnitsConversionAdditionalQuantity;

	   @FindBy(xpath = "//td[@id='myTagsTable_col_1-4']")
	   private static WebElement unitsConversionAdditionalQuantity;

	   @FindBy(xpath = "//input[@id='myTagsTable_RoundOff']")
	   private static WebElement unitsConversionRoundOff;

	   @FindBy(xpath = "///*[@id='myTagsTable_body']/tr[1]/td[1]")
	   private static WebElement selectFirstRowInUnitsConversion;

	   @FindBy(xpath = "//*[@id='myTagsTable_body']/tr[2]/td[1]")
	   private static WebElement selectSecondRowInUnitsConversion;

	   @FindBy(xpath = "//td[@id='myTagsTable_col_1-6']")
	   private static WebElement unitsConversionDescriptionFirstRow;

	   // Server Error Elements
	   @FindBy(xpath = "//div[@id='id_focus_msgbox_main']")
	   private static WebElement serverErrorPopup;

	   @FindBy(xpath = "//div[@id='id_focus_msgbox_main']/div[2]/button")
	   private static WebElement serverErrorClose;
	   
	   public static boolean checkServerErrorMessageIsNotDisplay() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
	      try
	      {
	         getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(serverErrorClose));
	  
	         boolean actValidationMessageIsEmptyDisplay                  = serverErrorClose.isDisplayed();
	         boolean expValidationMessageIsEmptyDisplay                  = false;
	                   
	        if(actValidationMessageIsEmptyDisplay==expValidationMessageIsEmptyDisplay)
	        {      
	          System.out.println("Server Error Message Is Not Display  :  "+actValidationMessageIsEmptyDisplay +" Value Expected : "+expValidationMessageIsEmptyDisplay);
	 	     return true;
	        }
	        else
	        {
	     	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serverErrorClose));
	     	 serverErrorClose.click();

	     	 System.out.println("Server Error Message Is Not Display  :  "+actValidationMessageIsEmptyDisplay +" Value Expected : "+expValidationMessageIsEmptyDisplay);
	          return false;    
	        }          
	      }
	      catch(Exception e)
	      {
	       System.err.println("Error Message NOT Found or NOT Clickable");
	       return true;
	      }
	   }
	   	
	   
	   
	   // Units Conversion Page
	   
	   @FindBy(xpath="//*[@id='page_Content']/div[2]/div[1]/div/label")
	   private static List<WebElement> unitConversionHeaderList;
	   
	   @FindBy(xpath="//*[@id='myTagsTable_head']/tr/th/div")
	   private static List<WebElement> unitConversionTabelHeaderList;
	   
	   @FindBy(xpath="//*[@id='myNavbar']/ul/li/div/div[2]")
	   private static List<WebElement> currencyRibbonControlList;
	   
	   public static boolean checkClickOnUnitsConversionMenuFromItemMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("******************************      checkClickOnUnitsConversionMenuFromItemMenu Method Executes............     ******************************");
	     
	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	 		homeMenu.click();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	 		mastersMenu.click();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemsMenu));
	 		itemsMenu.click();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionMenu));
	 		unitsConversionMenu.click();
	 		 
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
	 		
	 		String actUnitsConversionTitle             = unitsConversionTitle.getText();
	 		String expUnitsConversionTitle             = excelReader.getCellData(xlSheetName, 381, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 381, 8, actUnitsConversionTitle);
	 		
	 		int currencyRibbonControlListCount = currencyRibbonControlList.size();
	 			
	 		ArrayList<String> currencyRibbonControlListArray = new ArrayList<String>();
	 		
	 		for(int i=0;i<currencyRibbonControlListCount;i++)
	 		{
	 			String data = currencyRibbonControlList.get(i).getText();
	 			currencyRibbonControlListArray.add(data);
	 		}
	 			
	 		String actcurrencyRibbonControlList = currencyRibbonControlListArray.toString();
	 		String expcurrencyRibbonControlList = excelReader.getCellData(xlSheetName, 382, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 382, 8, actcurrencyRibbonControlList);
	 		
	 		int unitConversionHeaderListCount = unitConversionHeaderList.size();
	 		
	 		ArrayList<String> unitConversionHeaderListArray = new ArrayList<String>();
	 		
	 		for(int i=0;i<unitConversionHeaderListCount;i++)
	 		{
	 			String data = unitConversionHeaderList.get(i).getText();
	 			unitConversionHeaderListArray.add(data);
	 		}
	 			
	 		String actunitConversionHeaderList = unitConversionHeaderListArray.toString();
	 		String expunitConversionHeaderList = excelReader.getCellData(xlSheetName, 383, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 383, 8, actunitConversionHeaderList);
	 		
	 		int unitConversionTabelHeaderListCount = unitConversionTabelHeaderList.size();
	 		
	 		ArrayList<String> unitConversionTabelHeaderListArray = new ArrayList<String>();
	 		
	 		for(int i=0;i<unitConversionTabelHeaderListCount;i++)
	 		{
	 			String data = unitConversionTabelHeaderList.get(i).getText();
	 			unitConversionTabelHeaderListArray.add(data);
	 		}
	 			
	 		String actunitConversionTabelHeaderList = unitConversionTabelHeaderListArray.toString();
	 		String expunitConversionTabelHeaderList = excelReader.getCellData(xlSheetName, 384, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 384, 8, actunitConversionTabelHeaderList);
	 			
	 		System.out.println("New Value Actual          : " + actUnitsConversionTitle +            " Value Expected : " + expUnitsConversionTitle);
	 		System.out.println("UnitConversionRibbonControlList Value Actual   : " + actcurrencyRibbonControlList);
	 		System.out.println("UnitConversionRibbonControlList Value Expected : " + expcurrencyRibbonControlList);
	 		System.out.println("unitConversionHeaderList Value Actual          : " + actunitConversionHeaderList);
	 		System.out.println("unitConversionHeaderList Value Expected        : " + expunitConversionHeaderList);
	 		System.out.println("unitConversionTabelHeaderList Value Actual     : " + actunitConversionTabelHeaderList);
	 		System.out.println("unitConversionTabelHeaderList Value Expected   : " + expunitConversionTabelHeaderList);

	 		if (actUnitsConversionTitle.equalsIgnoreCase(expUnitsConversionTitle) && actcurrencyRibbonControlList.equalsIgnoreCase(expcurrencyRibbonControlList)
	 				&& actunitConversionHeaderList.equalsIgnoreCase(expunitConversionHeaderList) 
	 				&& actunitConversionTabelHeaderList.equalsIgnoreCase(expunitConversionTabelHeaderList))
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 380, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 380, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 380, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		return false;
	 	}
	   }
	   
	   
	   @FindBy(xpath="//*[@id='optionBaseUnit_table_body']/tr/td[2]")
	   private static List<WebElement> baseUnitComboList;
	   
	   public static boolean checkPreviousValuesOfConversionPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************************************* checkPreviousValuesOfConversionPage  Method Executes............  *************************************");
	 		
	     try
	     {	
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
	 		unitsConversionBaseUnit.click();
	 		unitsConversionBaseUnit.sendKeys(Keys.SPACE);

	 		int baseUnitComboListCount = baseUnitComboList.size();
	 		
	 		for(int i=0;i<baseUnitComboListCount;i++)
	 		{
	 			String data= baseUnitComboList.get(i).getText();
	 			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 385, 6)))
	 			{
	 				baseUnitComboList.get(i).click();
	 			}
	 		}
	 		
	 		unitsConversionBaseUnit.sendKeys(Keys.TAB);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionDescriptionFirstRow));
	 		String actUnitConversionBaseUnit       = unitsConversionBaseUnit.getAttribute("value");
	 		String actUnitConversionConversionUnit = unitsConversionUnit.getText();
	 		String actUnitConversionXFactor        = unitsConversionXFactor.getText();
	 		String actUnitConversionAdditionalQty  = unitsConversionAdditionalQuantity.getText();
	 		String actUnitConversionDescription    = unitsConversionDescriptionFirstRow.getText();

	 		String expUnitConversionBaseUnit       = excelReader.getCellData(xlSheetName, 386, 7);
	 		String expUnitConversionConversionUnit = excelReader.getCellData(xlSheetName, 387, 7);
	 		String expUnitConversionXFactor        = excelReader.getCellData(xlSheetName, 388, 7);
	 		String expUnitConversionAdditionalQty  = excelReader.getCellData(xlSheetName, 389, 7);
	 		String expUnitConversionDescription    = excelReader.getCellData(xlSheetName, 390, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 386, 8, actUnitConversionBaseUnit);
	 		excelReader.setCellData(xlfile, xlSheetName, 387, 8, actUnitConversionConversionUnit);
	 		excelReader.setCellData(xlfile, xlSheetName, 388, 8, actUnitConversionXFactor);
	 		excelReader.setCellData(xlfile, xlSheetName, 389, 8, actUnitConversionAdditionalQty);
	 		excelReader.setCellData(xlfile, xlSheetName, 390, 8, actUnitConversionDescription);

	 		System.out.println("Base Unit Value Actual          : " + actUnitConversionBaseUnit +      " Value Expected : " + expUnitConversionBaseUnit);
	 		System.out.println("Conversion Unit Value Actual    : " + actUnitConversionConversionUnit+ " Value Expected : " + expUnitConversionConversionUnit);
	 		System.out.println("X Factor Value Actual           : " + actUnitConversionXFactor +       " Value Expected : " + expUnitConversionXFactor);
	 		System.out.println("Additional Qty Value Actual     : " + actUnitConversionAdditionalQty + " Value Expected : " + expUnitConversionAdditionalQty);
	 		System.out.println("Description Value Actual        : " + actUnitConversionDescription +   " Value Expected : " + expUnitConversionDescription);

	 		if (actUnitConversionBaseUnit.equalsIgnoreCase(expUnitConversionBaseUnit)
	 				&& actUnitConversionConversionUnit.equalsIgnoreCase(expUnitConversionConversionUnit)
	 				&& actUnitConversionXFactor.equalsIgnoreCase(expUnitConversionXFactor)
	 				&& actUnitConversionAdditionalQty.equalsIgnoreCase(expUnitConversionAdditionalQty)
	 				&& actUnitConversionDescription.equalsIgnoreCase(expUnitConversionDescription))
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 385, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 385, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 385, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		return false;
	 	}
	 }


	 public static boolean checkPreviousConversionIsDeletingOnClickOnDeleteOptionInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	 {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("******************** checkPreviousConversionIsDeletingOnClickOnDeleteOptionInUnitsConversion Method Executes............*************************");

	 	try
	 	{
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
	 		unitsConversionBaseUnit.click();
	 		unitsConversionBaseUnit.sendKeys(Keys.SPACE);

	 		int baseUnitComboListCount = baseUnitComboList.size();
	 		
	 		for(int i=0;i<baseUnitComboListCount;i++)
	 		{
	 			String data= baseUnitComboList.get(i).getText();
	 			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 385, 6)))
	 			{
	 				baseUnitComboList.get(i).click();
	 			}
	 		}
	 		
	 		unitsConversionBaseUnit.sendKeys(Keys.TAB);
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionDeleteButton));
	 		unitsConversionDeleteButton.click();
	 		
	 		getWaitForAlert();

	 		String actAlertMessageOnDeletUnitsConversion = getAlert().getText();
	 		String expAlertMessageOnDeletUnitsConversion = excelReader.getCellData(xlSheetName, 392, 7);

	 		excelReader.setCellData(xlfile, xlSheetName, 392, 8, actAlertMessageOnDeletUnitsConversion);
	 		
	 		System.out.println("Alert On Delete Value Actual        : " + actAlertMessageOnDeletUnitsConversion+  "  Value Expected : " + expAlertMessageOnDeletUnitsConversion);
	 		
	 		getAlert().accept();

	 		String expDeleteMessageOkIsClicked = excelReader.getCellData(xlSheetName, 393, 7);

	 		boolean actDeleteDisplayMessageOkIsClicked = checkValidationMessageboolean(expDeleteMessageOkIsClicked);
	 		boolean expDeleteDisplayMessageOkIsClicked = true;
	 		
	 	
	 		System.out.println("Message on Ok Click Value Actual   : " + actDeleteDisplayMessageOkIsClicked +    "  Value Expected : " + expDeleteDisplayMessageOkIsClicked);

	 		if ( actAlertMessageOnDeletUnitsConversion.equalsIgnoreCase(expAlertMessageOnDeletUnitsConversion)
	 				&& actDeleteDisplayMessageOkIsClicked == expDeleteDisplayMessageOkIsClicked) 
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 391, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 391, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 391, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		return false;
	 	}
	 }

	 public static boolean checkTheConversionValuesDeletedIsDisplayingInUnitsConversion()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	 {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("******************** checkClickOnClearButtonToClearTheFiledsInUnitsConversion Method Executes............  **************************");

	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
	 		unitsConversionBaseUnit.click();
	 		unitsConversionBaseUnit.sendKeys(Keys.END);
	 		unitsConversionBaseUnit.sendKeys(Keys.SHIFT,Keys.HOME);
	 		unitsConversionBaseUnit.sendKeys(Keys.SPACE);

	 		int baseUnitComboListCount = baseUnitComboList.size();
	 		
	 		for(int i=0;i<baseUnitComboListCount;i++)
	 		{
	 			String data= baseUnitComboList.get(i).getText();
	 			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 394, 6)))
	 			{
	 				baseUnitComboList.get(i).click();
	 			}
	 		}
	 		
	 		unitsConversionBaseUnit.sendKeys(Keys.TAB);

	 		//Thread.sleep(2000);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionDescriptionFirstRow));
	 		String actUnitConversionBaseUnit       = unitsConversionBaseUnit.getAttribute("value");
	 		boolean actUnitConversionConversionUnit = unitsConversionUnit.getText().isEmpty();
	 		String actUnitConversionXFactor         = unitsConversionXFactor.getText();
	 		String actUnitConversionAdditionalQty   = unitsConversionAdditionalQuantity.getText();
	 		boolean actUnitConversionDescription    = unitsConversionDescriptionFirstRow.getText().isEmpty();

	 		String expUnitConversionBaseUnit        = excelReader.getCellData(xlSheetName, 395, 7);
	 		boolean expUnitConversionConversionUnit = true;
	 		String expUnitConversionXFactor         = excelReader.getCellData(xlSheetName, 396, 7);
	 		String expUnitConversionAdditionalQty   = excelReader.getCellData(xlSheetName, 397, 7);
	 		boolean expUnitConversionDescription    = true;
	 		
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 395, 8, actUnitConversionBaseUnit);
	 		excelReader.setCellData(xlfile, xlSheetName, 396, 8, actUnitConversionXFactor);
	 		excelReader.setCellData(xlfile, xlSheetName, 397, 8, actUnitConversionAdditionalQty);
	 		
	 		boolean actMethod = actUnitConversionConversionUnit == expUnitConversionConversionUnit && actUnitConversionDescription == expUnitConversionDescription;
	 		
	 		String actResult = Boolean.toString(actMethod);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 394, 8, actResult.toUpperCase());

	 		System.out.println("Base Unit Value Actual          : " + actUnitConversionBaseUnit +      " Value Expected : " + expUnitConversionBaseUnit);
	 		System.out.println("Conversion Unit Value Actual    : " + actUnitConversionConversionUnit+ " Value Expected : " + expUnitConversionConversionUnit);
	 		System.out.println("X Factor Value Actual           : " + actUnitConversionXFactor +       " Value Expected : " + expUnitConversionXFactor);
	 		System.out.println("Additional Qty Value Actual     : " + actUnitConversionAdditionalQty + " Value Expected : " + expUnitConversionAdditionalQty);
	 		System.out.println("Description Value Actual        : " + actUnitConversionDescription +   " Value Expected : " + expUnitConversionDescription);

	 		if ( actUnitConversionBaseUnit.equalsIgnoreCase(expUnitConversionBaseUnit)
	 				&& actUnitConversionConversionUnit == expUnitConversionConversionUnit
	 				&& actUnitConversionXFactor.equalsIgnoreCase(expUnitConversionXFactor)
	 				&& actUnitConversionAdditionalQty.equalsIgnoreCase(expUnitConversionAdditionalQty)
	 				&& actUnitConversionDescription == expUnitConversionDescription) 
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 394, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 394, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 394, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		return false;
	 	}
	 }

	  

	   // Clear Option
	   public static boolean checkClickOnClearButtonToClearOnFirstTheFiledsInUnitsConversion()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************* checkClickOnClearButtonToClearTheFiledsInUnitsConversion Method Executes............  ************************");

	 	try
	 	{
	 		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
	 		unitsConversionBaseUnit.click();
	 		unitsConversionBaseUnit.sendKeys(Keys.END);
	 		unitsConversionBaseUnit.sendKeys(Keys.SHIFT,Keys.HOME);
	 		//Thread.sleep(2000);
	 		unitsConversionBaseUnit.sendKeys("Pcs");
	 		//Thread.sleep(2000);
	 		unitsConversionBaseUnit.sendKeys(Keys.TAB);

	 		//Thread.sleep(2000);
	 */		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionClearButton));
	 		unitsConversionClearButton.click();
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionDescriptionFirstRow));
	 		boolean actUnitConversionBaseUnit       = unitsConversionBaseUnit.getAttribute("value").isEmpty();
	 		boolean actUnitConversionConversionUnit = unitsConversionUnit.getText().isEmpty();
	 		boolean actUnitConversionXFactor        = unitsConversionXFactor.getText().isEmpty();
	 		boolean actUnitConversionAdditionalQty  = unitsConversionAdditionalQuantity.getText().isEmpty();
	 		boolean actUnitConversionDescription    = unitsConversionDescriptionFirstRow.getText().isEmpty();

	 		boolean expUnitConversionBaseUnit       = true;
	 		boolean expUnitConversionConversionUnit = true;
	 		boolean expUnitConversionXFactor        = true;
	 		boolean expUnitConversionAdditionalQty  = true;
	 		boolean expUnitConversionDescription    = true;
	 		
	 		boolean actMethod = actUnitConversionBaseUnit == expUnitConversionBaseUnit && actUnitConversionConversionUnit == expUnitConversionConversionUnit
	 							&& actUnitConversionConversionUnit == expUnitConversionConversionUnit && actUnitConversionXFactor == expUnitConversionXFactor
	 							&& actUnitConversionAdditionalQty == expUnitConversionAdditionalQty && actUnitConversionDescription == expUnitConversionDescription
	 							&& actUnitConversionBaseUnit == expUnitConversionBaseUnit;
	 		
	 		String actResult = Boolean.toString(actMethod);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 398, 8, actResult.toUpperCase());

	 		System.out.println("Base Unit Value Actual          : " + actUnitConversionBaseUnit +      " Value Expected : " + expUnitConversionBaseUnit);
	 		System.out.println("Conversion Unit Value Actual    : " + actUnitConversionConversionUnit+ " Value Expected : " + expUnitConversionConversionUnit);
	 		System.out.println("X Factor Value Actual           : " + actUnitConversionXFactor +       " Value Expected : " + expUnitConversionXFactor);
	 		System.out.println("Additional Qty Value Actual     : " + actUnitConversionAdditionalQty + " Value Expected : " + expUnitConversionAdditionalQty);
	 		System.out.println("Description Value Actual        : " + actUnitConversionDescription +   " Value Expected : " + expUnitConversionDescription);

	 		if (actMethod==true) 
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 398, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 398, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 398, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		return false;
	 	}
	   }

	   
	   @FindBy(xpath="//*[@id='myTagsTable_UnitName_table_body']/tr/td[2]")
	   private static List<WebElement> unitNameComboList;
	   
	   public static boolean checkClickOnSaveWithAllInputsInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException   
	   {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("********************   checkClickOnSaveWithAllInputsInUnitsConversion Method Executes............   ***********************");
	 	
	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
	 		unitsConversionBaseUnit.click();
	 		unitsConversionBaseUnit.sendKeys(Keys.SPACE);

	 		int baseUnitComboListCount = baseUnitComboList.size();
	 		
	 		for(int i=0;i<baseUnitComboListCount;i++)
	 		{
	 			String data= baseUnitComboList.get(i).getText();
	 			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 399, 6)))
	 			{
	 				baseUnitComboList.get(i).click();
	 			}
	 		}
	 		
	 		unitsConversionBaseUnit.sendKeys(Keys.TAB);
	 		 
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
	 		unitsConversionProduct.sendKeys(Keys.TAB);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionLoadFrom));
	 		unitsConversionLoadFrom.click();
	 		unitsConversionLoadFrom.sendKeys(Keys.TAB);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitConversionUnit));
	 		inputUnitConversionUnit.click();
	 		inputUnitConversionUnit.sendKeys(Keys.SPACE);

	 		int unitNameComboListCount = unitNameComboList.size();
	 		
	 		for(int i=0;i<unitNameComboListCount;i++)
	 		{
	 			String data= unitNameComboList.get(i).getText();
	 			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 400, 6)))
	 			{
	 				unitNameComboList.get(i).click();
	 			}
	 		}
	 		
	 		inputUnitConversionUnit.sendKeys(Keys.TAB);
	 	
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionXFactor));
	 		inputUnitsConversionXFactor.sendKeys(excelReader.getCellData(xlSheetName, 401, 6));
	 		inputUnitsConversionXFactor.sendKeys(Keys.TAB);
	 			
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
	 		unitsConversionSaveButton.click();
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 			
	 		String actUnitsSaveConversion = validationConfirmationMessage.getText();
	 		String expUnitsSaveConversion = excelReader.getCellData(xlSheetName, 400, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 400, 8, actUnitsSaveConversion);
	 			
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
	 		closeValidationConfirmationMessage.click();
	 		
	 		System.out.println("Save Conversion          : " + actUnitsSaveConversion           + "  Value Expected : " + expUnitsSaveConversion);
	 		
	 		if (actUnitsSaveConversion.equalsIgnoreCase(expUnitsSaveConversion)) 
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 399, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 399, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 399, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		return false;
	 	}
	  }

	   
	   
	  public static boolean checkUnitConversionSaveInformationAndUpdateButtonWithAllInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("**********************    checkUnitConversionSaveInformationAndUpdateButtonWithAllInputs Method Executes............    *********************************");

	 	try
	 	{
	 		
	 		System.out.println("**********************    checkUnitConversionSaveInformationAndUpdateButtonWithAllInputs Method Executes1............    *********************************");

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
	 		unitsConversionBaseUnit.click();
	 		Thread.sleep(2000);
	 		unitsConversionBaseUnit.sendKeys(Keys.SPACE);

	 		int baseUnitComboListCount = baseUnitComboList.size();
	 		
	 		for(int i=0;i<baseUnitComboListCount;i++)
	 		{
	 			String data= baseUnitComboList.get(i).getText();
	 			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 405, 6)))
	 			{
	 				baseUnitComboList.get(i).click();
	 			}
	 		}
	 		
	 		unitsConversionBaseUnit.sendKeys(Keys.TAB);
	 		Thread.sleep(2000);		
	 		
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionDescriptionFirstRow));
	 		String actUnitConversionBaseUnit       = unitsConversionBaseUnit.getAttribute("value");
	 		String actUnitConversionConversionUnit = unitsConversionUnit.getText();
	 		String actUnitConversionXFactor        = unitsConversionXFactor.getText();
	 		String actUnitConversionAdditionalQty  = unitsConversionAdditionalQuantity.getText();
	 		String actUnitConversionDescription    = unitsConversionDescriptionFirstRow.getText();

	 		String expUnitConversionBaseUnit       = excelReader.getCellData(xlSheetName, 406, 7);
	 		String expUnitConversionConversionUnit = excelReader.getCellData(xlSheetName, 407, 7);
	 		String expUnitConversionXFactor        = excelReader.getCellData(xlSheetName, 408, 7);
	 		String expUnitConversionAdditionalQty  = excelReader.getCellData(xlSheetName, 409, 7);
	 		String expUnitConversionDescription    = excelReader.getCellData(xlSheetName, 410, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 406, 8, actUnitConversionBaseUnit);
	 		excelReader.setCellData(xlfile, xlSheetName, 407, 8, actUnitConversionConversionUnit);
	 		excelReader.setCellData(xlfile, xlSheetName, 408, 8, actUnitConversionXFactor);
	 		excelReader.setCellData(xlfile, xlSheetName, 409, 8, actUnitConversionAdditionalQty);
	 		excelReader.setCellData(xlfile, xlSheetName, 410, 8, actUnitConversionDescription);
	 		
	 	
	 		System.out.println("Base Unit Value Actual             : " + actUnitConversionBaseUnit +       " Value Expected : " + expUnitConversionBaseUnit);
	 		System.out.println("Conversion Unit Value Actual       : " + actUnitConversionConversionUnit+  " Value Expected : " + expUnitConversionConversionUnit);
	 		System.out.println("X Factor Value Actual              : " + actUnitConversionXFactor +        " Value Expected : " + expUnitConversionXFactor);
	 		System.out.println("Additional Qty Value Actual        : " + actUnitConversionAdditionalQty+   " Value Expected : " + expUnitConversionAdditionalQty);
	 		System.out.println("Description Value Actual           : " + actUnitConversionDescription+     " Value Expected : " + expUnitConversionDescription);

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
	 		unitsConversionProduct.sendKeys(Keys.TAB);

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitConversionUnit));
	 		inputUnitConversionUnit.click();
	 		inputUnitConversionUnit.sendKeys(Keys.TAB);

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionXFactor));
	 		inputUnitsConversionXFactor.sendKeys(excelReader.getCellData(xlSheetName, 406, 6));	
	 		inputUnitsConversionXFactor.sendKeys(Keys.TAB);
	 		
	 		Thread.sleep(2000);
	 	
	 		String actUnitConversionDescriptionInput = unitsConversionDescriptionFirstRow.getText();
	 		String expUnitConversionDescriptionInput = excelReader.getCellData(xlSheetName, 411, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 411, 8, actUnitConversionDescriptionInput);
	 			
	 			
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
	 		unitsConversionSaveButton.click();
	 		
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 		String actUpdateUnitConversionMessage = validationConfirmationMessage.getText();
	 		String expUpdateUnitConversionMessage = excelReader.getCellData(xlSheetName, 412, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 412, 8, actUpdateUnitConversionMessage);
	 		
	 		System.out.println("Save Message  Value Actual         : " + actUpdateUnitConversionMessage+ "  Value Expected : " + expUpdateUnitConversionMessage);

	 		if (actUnitConversionBaseUnit.equalsIgnoreCase(expUnitConversionBaseUnit)
	 				&& actUnitConversionConversionUnit.equalsIgnoreCase(expUnitConversionConversionUnit)
	 				&& actUnitConversionConversionUnit.equalsIgnoreCase(expUnitConversionConversionUnit)
	 				&& actUnitConversionXFactor.equalsIgnoreCase(expUnitConversionXFactor)
	 				&& actUnitConversionAdditionalQty.equalsIgnoreCase(expUnitConversionAdditionalQty)
	 				&& actUnitConversionDescription.equalsIgnoreCase(expUnitConversionDescription)
	 				&& actUnitConversionDescriptionInput.equalsIgnoreCase(expUnitConversionDescriptionInput)
	 				&& actUpdateUnitConversionMessage.equalsIgnoreCase(expUpdateUnitConversionMessage))
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 405, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 405, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 405, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		return false;
	 	}
	  }

	  public static boolean checkUpdatedConversionValueDisplayUserModifyAndSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	 	 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	 System.out.println("************** checkUpdatedConversionValueDisplayUserModifyAndSave Method Executes............   ********************************************");
	 		
	     try                                                        
	     {
	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
	 		unitsConversionBaseUnit.click();
	 		unitsConversionBaseUnit.sendKeys(Keys.SPACE);

	 		int baseUnitComboListCount = baseUnitComboList.size();
	 		
	 		for(int i=0;i<baseUnitComboListCount;i++)
	 		{
	 			String data= baseUnitComboList.get(i).getText();
	 			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 413, 6)))
	 			{
	 				baseUnitComboList.get(i).click();
	 			}
	 		}
	 		
	 		unitsConversionBaseUnit.sendKeys(Keys.TAB);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionDescriptionFirstRow));
	 		String actUnitConversionBaseUnit       = unitsConversionBaseUnit.getAttribute("value");
	 		String actUnitConversionConversionUnit = unitsConversionUnit.getText();
	 		String actUnitConversionXFactor        = unitsConversionXFactor.getText();
	 		String actUnitConversionAdditionalQty  = unitsConversionAdditionalQuantity.getText();
	 		String actUnitConversionDescription    = unitsConversionDescriptionFirstRow.getText();

	 		String expUnitConversionBaseUnit       = excelReader.getCellData(xlSheetName, 414, 7);
	 		String expUnitConversionConversionUnit = excelReader.getCellData(xlSheetName, 415, 7);
	 		String expUnitConversionXFactor        = excelReader.getCellData(xlSheetName, 416, 7);
	 		String expUnitConversionAdditionalQty  = excelReader.getCellData(xlSheetName, 417, 7);
	 		String expUnitConversionDescription    = excelReader.getCellData(xlSheetName, 418, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 414, 8, actUnitConversionBaseUnit);
	 		excelReader.setCellData(xlfile, xlSheetName, 415, 8, actUnitConversionConversionUnit);
	 		excelReader.setCellData(xlfile, xlSheetName, 416, 8, actUnitConversionXFactor);
	 		excelReader.setCellData(xlfile, xlSheetName, 417, 8, actUnitConversionAdditionalQty);
	 		excelReader.setCellData(xlfile, xlSheetName, 418, 8, actUnitConversionDescription);

	 		System.out.println("Base Unit Value Actual          : " + actUnitConversionBaseUnit +      " Value Expected : " + expUnitConversionBaseUnit);
	 		System.out.println("Conversion Unit Value Actual    : " + actUnitConversionConversionUnit+ " Value Expected : " + expUnitConversionConversionUnit);
	 		System.out.println("X Factor Value Actual           : " + actUnitConversionXFactor +       " Value Expected : " + expUnitConversionXFactor);
	 		System.out.println("Additional Qty Value Actual     : " + actUnitConversionAdditionalQty + " Value Expected : " + expUnitConversionAdditionalQty);
	 		System.out.println("Description Value Actual        : " + actUnitConversionDescription +   " Value Expected : " + expUnitConversionDescription);

	 		if (actUnitConversionBaseUnit.equalsIgnoreCase(expUnitConversionBaseUnit)
	 				&& actUnitConversionConversionUnit.equalsIgnoreCase(expUnitConversionConversionUnit)
	 				&& actUnitConversionXFactor.equalsIgnoreCase(expUnitConversionXFactor)
	 				&& actUnitConversionAdditionalQty.equalsIgnoreCase(expUnitConversionAdditionalQty)
	 				&& actUnitConversionDescription.equalsIgnoreCase(expUnitConversionDescription))
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 413, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 413, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 413, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		return false;
	 	}
	  }

	   public static boolean checkClickOnClearButtonToClearTheFiledsInUnitsConversion()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************* checkClickOnClearButtonToClearTheFiledsInUnitsConversion  Method Executes............   *******************");

	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionClearButton));
	 		unitsConversionClearButton.click();
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionDescriptionFirstRow));
	 		boolean actUnitConversionBaseUnit       = unitsConversionBaseUnit.getAttribute("value").isEmpty();
	 		boolean actUnitConversionConversionUnit = unitsConversionUnit.getText().isEmpty();
	 		boolean actUnitConversionXFactor        = unitsConversionXFactor.getText().isEmpty();
	 		boolean actUnitConversionAdditionalQty  = unitsConversionAdditionalQuantity.getText().isEmpty();
	 		boolean actUnitConversionDescription    = unitsConversionDescriptionFirstRow.getText().isEmpty();

	 		boolean expUnitConversionBaseUnit       = true;
	 		boolean expUnitConversionConversionUnit = true;
	 		boolean expUnitConversionXFactor        = true;
	 		boolean expUnitConversionAdditionalQty  = true;
	 		boolean expUnitConversionDescription    = true;
	 		
	 		boolean actMethod = actUnitConversionBaseUnit == expUnitConversionBaseUnit && actUnitConversionConversionUnit == expUnitConversionConversionUnit
	 							&& actUnitConversionConversionUnit == expUnitConversionConversionUnit && actUnitConversionXFactor == expUnitConversionXFactor
	 							&& actUnitConversionAdditionalQty == expUnitConversionAdditionalQty && actUnitConversionDescription == expUnitConversionDescription
	 							&& actUnitConversionBaseUnit == expUnitConversionBaseUnit;
	 		
	 		String actResult = Boolean.toString(actMethod);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 419, 8, actResult.toUpperCase());

	 		System.out.println("Base Unit Value Actual          : " + actUnitConversionBaseUnit +      " Value Expected : " + expUnitConversionBaseUnit);
	 		System.out.println("Conversion Unit Value Actual    : " + actUnitConversionConversionUnit+ " Value Expected : " + expUnitConversionConversionUnit);
	 		System.out.println("X Factor Value Actual           : " + actUnitConversionXFactor +       " Value Expected : " + expUnitConversionXFactor);
	 		System.out.println("Additional Qty Value Actual     : " + actUnitConversionAdditionalQty + " Value Expected : " + expUnitConversionAdditionalQty);
	 		System.out.println("Description Value Actual        : " + actUnitConversionDescription +   " Value Expected : " + expUnitConversionDescription);

	 		if (actMethod==true) 
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 419, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 419, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 419, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		return false;
	 	}
	   }

	   public static boolean checkSaveUnitsConversionOfOtherBaseUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException   
	   {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("********************   checkClickOnSaveWithAllInputsInUnitsConversion Method Executes............   ***********************");
	 	
	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionBaseUnit));
	 		unitsConversionBaseUnit.click();
	 		Thread.sleep(2000);
	 		unitsConversionBaseUnit.sendKeys(Keys.SPACE);

	 		int baseUnitComboListCount = baseUnitComboList.size();
	 		
	 		for(int i=0;i<baseUnitComboListCount;i++)
	 		{
	 			String data= baseUnitComboList.get(i).getText();
	 			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 420, 6)))
	 			{
	 				baseUnitComboList.get(i).click();
	 			}
	 		}
	 		
	 		
	 		
	 		unitsConversionBaseUnit.sendKeys(Keys.TAB);
	 		Thread.sleep(2000); 
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionProduct));
	 		unitsConversionProduct.sendKeys(Keys.TAB);
	 		Thread.sleep(3000);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionLoadFrom));
	 		unitsConversionLoadFrom.click();
	 		unitsConversionLoadFrom.sendKeys(Keys.TAB);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitConversionUnit));
	 		inputUnitConversionUnit.click();
	 		inputUnitConversionUnit.sendKeys(Keys.SPACE);

	 		int unitNameComboListCount = unitNameComboList.size();
	 		
	 		for(int i=0;i<unitNameComboListCount;i++)
	 		{
	 			String data= unitNameComboList.get(i).getText();
	 			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 421, 6)))
	 			{
	 				unitNameComboList.get(i).click();
	 			}
	 		}
	 		
	 		inputUnitConversionUnit.sendKeys(Keys.TAB);
	 	
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputUnitsConversionXFactor));
	 		inputUnitsConversionXFactor.sendKeys(excelReader.getCellData(xlSheetName, 422, 6));
	 		inputUnitsConversionXFactor.sendKeys(Keys.TAB);
	 			
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionSaveButton));
	 		unitsConversionSaveButton.click();
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 			
	 		String actUnitsSaveConversion = validationConfirmationMessage.getText();
	 		String expUnitsSaveConversion = excelReader.getCellData(xlSheetName, 421, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 421, 8, actUnitsSaveConversion);
	 			
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
	 		closeValidationConfirmationMessage.click();
	 		
	 		System.out.println("Save Conversion          : " + actUnitsSaveConversion           + "  Value Expected : " + expUnitsSaveConversion);
	 		
	 		if (actUnitsSaveConversion.equalsIgnoreCase(expUnitsSaveConversion)) 
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 420, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 420, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 420, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		return false;
	 	}
	  }

	   

	  // Cancel in Units Conversion

	   public static boolean checkClickOnCancelToCloseUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("********************************************** checkClickOnCancelToCloseUnitsConversion  ********************************************");
	    
	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsConversionCancelButton));
	 		unitsConversionCancelButton.click();
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));

	 		boolean actLoadDashboard           = labelDashboard.isDisplayed();
	 		boolean actSelectDashboard         = selectDashboard.isDisplayed();
	 		boolean actNewDashboard            = newAddDashBoard.isDisplayed();
	 		boolean actDashboardCustomization  = dashboardCustomizationSettings.isDisplayed();

	 		boolean expLoadDashboard          = true;
	 		boolean expSelectDashboard        = true;
	 		boolean expNewDashboard           = true;
	 		boolean expDashboardCustomization = true;
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
	 		String actDashboardLabel = labelDashboard.getText();
	 		String expDashboardLabel = excelReader.getCellData(xlSheetName, 424, 7);
	 		
	 		boolean actMethod = actLoadDashboard == expLoadDashboard && actSelectDashboard == expSelectDashboard
	 							&& actNewDashboard == expNewDashboard && actDashboardCustomization == expDashboardCustomization;
	 		
	 		String actResult = Boolean.toString(actMethod);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 423, 8, actResult.toUpperCase());
	 		excelReader.setCellData(xlfile, xlSheetName, 424, 8, actDashboardLabel);

	 		System.out.println("Load Dashbord Value Actual                          : " + actLoadDashboard+          " Value Expected : " + expLoadDashboard);
	 		System.out.println("Select Dashbord Value Actual                        : " + actSelectDashboard+        " Value Expected : " + expSelectDashboard);
	 		System.out.println("New Dashbord Value Actual                           : " + actNewDashboard+           " Value Expected : " + expNewDashboard);
	 		System.out.println("Dashbord Customization Value Actual                 : " + actDashboardCustomization+ " Value Expected : " + expDashboardCustomization);

	 		if (actDashboardLabel.equalsIgnoreCase(expDashboardLabel) && actMethod==true)
	 		{
	 			System.out.println(" Test Pass: Close Button is working");
	 			excelReader.setCellData(xlfile, xlSheetName, 423, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			System.out.println(" Test Fail: Close Button is not working");
	 			excelReader.setCellData(xlfile, xlSheetName, 423, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	{
	 		String exception =e.getMessage().substring(0, 100);
	 		excelReader.setExceptionInExcel(xlfile, xlSheetName, 423, 10, exception);
	 		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		return false;
	 	}
	   }

	  

	   @FindBy(xpath = "//*[@id='userprofile']/li/span[2]")
	   private static WebElement logoutOption;
	   
	   @FindBy(id = "txtPassword")
	   private static WebElement password;
	   
	   public boolean checkLogoutInCurrencyMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
 		 	excelReader.setCellData(xlfile, xlSheetName, 285, 10, e.getMessage());	
 			return false;
 		}
	 }
	   

	  
	  
	  

	  
	  
	  
	  
	
    public SmokeUnitsPage(WebDriver driver)
    {
    	
   	 PageFactory.initElements(driver, this);
   	
    }
		
}
