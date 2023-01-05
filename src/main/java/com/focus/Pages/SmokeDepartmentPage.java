package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.focus.base.BaseEngine;
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

public class SmokeDepartmentPage extends BaseEngine
{
	
	//Home Menu
	@FindBy (xpath="//*[@id='1']/div/span")
	public static WebElement homeMenu;

      //Masters Menu	
	  @FindBy (xpath="//*[@id='1000']/span")
      public static WebElement mastersMenu;
	
		 //Department Menu	
		 @FindBy (xpath="/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[10]/a[1]/span[1]")
		 public static WebElement departmentMenu;
	 
			//Department Title
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
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[2]/span[1]")
			public static WebElement accountGroupTitleDisplay;

			@FindBy(xpath="//label[@class='msgInfo']")
			public static WebElement clickOnEmptyGroup;
			

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
		    @FindBy(xpath="//span[contains(text(),'Department Properties')]")
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
	 
			
	    @FindBy(xpath="//div[@id='divTreeMenu']")
		private static WebElement treeDepartmentDisplay;
	    
	    @FindBy(xpath="//td[@class='text-center']")
		private static WebElement DepartmentInMainPageEmpty;
	    
		@FindBy(xpath="//*[@id='btnMasterSaveClick']")
		public static WebElement saveBtn;
		
        //Departments Creation Page	
	    @FindBy(xpath="//input[@id='sName']")
		private static WebElement nameTxt;
		
		@FindBy(xpath="//input[@id='sCode']")
		private static WebElement codeTxt;
				
		/*@FindBy(xpath="//*[@id='iCurrencyId']")
		private static WebElement localCurrencyComboBox;*/
	
		
		@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement closeBtn;
		
		@FindBy(xpath="//span[@id='btnClose']")
		public static WebElement unitsCloseBtn;
		
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
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[10]")
		public static WebElement binGroupNewCreationName;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
		public static WebElement unitNewCreationNameOfLane;               
					
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement unitFirstCheckBoxToSelection;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement unitFirstCheckBox;

		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[9]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]")
		public static WebElement getMsgOnDelete;
		
		@FindBy(xpath="//input[@id='liSelectAllMasters']")
		public static WebElement accountMasterSelect;
		
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]")
		public static WebElement binsFirstLevelMastersDisplay;
		
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
		@FindBy(xpath="//*[@id='dashName']")
	    private static WebElement labelDashboard ;
		
		@FindBy(xpath="//*[@id='Select_dash']")
		private static WebElement selectDashboard ;
			
		@FindBy(xpath="//*[@id='Dashboard_AddDash']")
	    private static WebElement newAddDashBoard;
		 
	    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
        private static WebElement dashboardCustomizationSettings;
	
		@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
		private static WebElement companyName;
	
		@FindBy(xpath="//*[@id='companyLogo']")
		private static WebElement companyLogo;
	
	    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
		private static WebElement noIn;
	    
	    // Login Page
 		@FindBy(xpath = "//*[@id='txtUsername']")
 		private static WebElement username;					 		
 		
 		@FindBy(xpath="//*[@id='navigation_menu']/li/a/div/div")
 		private static List<WebElement> menusList;
 		
 		@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li/a/span")
 		private static List<WebElement> homeMenuList;
 		
 		@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li/a/span")
 		private static List<WebElement> mastersMenuList;
 		
 		@FindBy(xpath="//span[@class='hidden-xs']")
 		private static WebElement userNameDisplay;

 	    
 	   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
 		private static WebElement userNameDisplay;*/
		    
 		@FindBy(xpath="//*[@id='ulCommonlyUsedRibbon']/li/span")
 		private static List<WebElement> mastersRibbonControlList;
 		
 		@FindBy(xpath ="//*[@id='ulRibbonControl']/li/span")
	 	private static List<WebElement> ribbonControlExpandList;					 					 		
		
 		@FindBy(xpath = "//*[@id='ulCommonlyUsedRibbon']/li/span")
 		private static List<WebElement> itemRibbonControlList;

 		@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[2]/a")
 		public static WebElement masterTreeeViewIdEditBtn;

 		@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[3]/a")
 		public static WebElement masterTreeViewIdDeleteBtn;

 	@FindBy(xpath = "//*[@id='0']/a")
 		private static WebElement accountRootAccount;

 	  @FindBy(xpath = "//*[@id='btnClose']")
 	  private static WebElement itemCloseBtn;


 	@FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[10]")
 		public static List<WebElement> masterDepNameList;

 	 @FindBy(xpath="//*[@id='divSearchControls']/div//div/a")
 	  private static List<WebElement> masterItemSearchControlList;

 	@FindBy(xpath = "//i[@class='icon-font6 icon-custamize']")
 		public static WebElement masterCustamizeMasterBtn;

 	@FindBy(xpath = "//div[@id='divTreeMenu']")
 		private static WebElement treeUnitsDisplay;

 	@FindBy(xpath = "//th[2]//span[1]")
 		public static WebElement masterGrid_Header_SelectTxt;

 	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_input_settings']/span")
 		public static WebElement masterCumMasterSettingBtn;

 	/*@FindBy(xpath ="//*[@id='landgridData']/thead/tr/th")
 		public static List<WebElement> masterItemHeaderList

 	@FindBy(xpath="//*[@id='btnSearchAcc']/ol/li")
 	  private static List<WebElement> masterSearchList;*/  

 	@FindBy(xpath ="//*[@id='ulRibbonControl']/li/span/i/parent::span")
    private static List<WebElement> itemRibbonControlExpandList;

 	@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li")
 	private static List<WebElement> mastertreeIdList;

 	@FindBy(xpath = "//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
 	private static WebElement extraFields_PropertiesTab;


 		@FindBy(xpath = "//*[@id='userprofile']/li/span[2]")
 		private static WebElement logoutOption;


 	@FindBy(xpath = "//*[@id='FieldsDetails_HiddenInGroup']")
 	private static WebElement extraFields_PropertiesHiddenInGroupChekbox;

 		@FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
 		public static WebElement newErrorMessage;

 	    @FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li")
 	    private static List<WebElement> mastertreeViewIdList;

 	    @FindBy(xpath = "//*[@id='FieldsDetails_IsHidden']")
 		private static WebElement extraFields_PropertiesHiddenChekbox;

 		@FindBy(xpath = "//span[@class='icon-reject2 theme_color']")
 		public static WebElement newErrorMessageCloseBtn;

 		
 		
	    private static String xlfile;
		private static String resPass = "Pass";
		private static String resFail = "Fail";
		private static ExcelReader excelReader;
		private static boolean methodReturnStatus;
		private static String xlSheetName = "SmokeMasters";
		private static boolean statusOfValue;
	    private static Alert alert;

	 
	 public static boolean checkSignToCheckDepartmentMastersPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {
	      excelReader = new ExcelReader(POJOUtility.getExcelPath());
	      xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
	      System.out.println("***************** checkSignToCheckBinsMastersPage Method Executes.............  *********************");
	      
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

	 
	 
	//DEPARTMENTS MASTER PAGE STARTS
	 
	 public static boolean checkDepartmentsMasterPageIsDisplayByClickOnDepartmentsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	 {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("************************************ checkDepartmentsMasterPageIsDisplayByClickOnDepartmentsMenu ********************************************");

		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
			mastersMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentMenu));
			departmentMenu.click();
			
			/*boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			boolean expSummaryErrorMessage  = true;
			
			boolean actServerErrorMessage  = checkServerErrorMessageIsNotDisplay();
			boolean expServerErrorMessage  = false;
			
			System.out.println("Opening UnitsConversion Error Message Value Actual : " + actSummaryErrorMessage +  " Value Expected : " + expSummaryErrorMessage);
			System.out.println("Opening UnitsConversion Error Message              : " + actServerErrorMessage +   " Value Expected : " +  expServerErrorMessage);*/
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));

			String actDepartmentTitle = accountsTitle.getText();
			String expDepartmentTitle = excelReader.getCellData(xlSheetName, 699, 7);

			excelReader.setCellData(xlfile, xlSheetName, 699, 8, actDepartmentTitle);
			
			System.out.println("Opening Units Master From Item Menu Title Actual Value  :" + actDepartmentTitle + "     Expected Value    : " + expDepartmentTitle);

			if (actDepartmentTitle.equalsIgnoreCase(expDepartmentTitle)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 698, 9, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 698, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 698, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }
	  
	  
	 public static boolean checkMainOptionsAvailabilityInDepartmentsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
		 System.out.println("************ checkMainOptionsAvailabilityInDepartmentsMasterPage Method Executes............ *********************");

		 try
		 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));

			
	        Set<String> actRibbonControl= new HashSet<String>();
			
			int count = itemRibbonControlList.size();
			
			System.err.println(" Ribbon :   "+count);
			
			for (int i=1;i<count;i++)
			{
				String data=itemRibbonControlList.get(i).getText();
				actRibbonControl.add(data);
			}
			
			String actItemRibbon = actRibbonControl.toString();
			
			String expItemRibbon = excelReader.getCellData(xlSheetName, 701, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 701, 8, actItemRibbon);
			
			System.out.println("actItemRibbon  : "+actItemRibbon);
			System.out.println("expItemRibbon  : "+expItemRibbon);
			
			boolean actAccountMasterNewBtn        = masterNewBtn.isDisplayed();
			boolean actAccountMasterAddGroupBtn   = masterAddGroupBtn.isDisplayed();
			boolean actAccountMasterEditBtn       = masterEditBtn.isDisplayed();
			boolean actAccountMasterCloneBtn      = masterCloneBtn.isDisplayed();
			boolean actAccountMasterPropertiesBtn = masterPropertiesBtn.isDisplayed();
			boolean actAccountMasterDeleteBtn     = masterDeleteBtn.isDisplayed();
			boolean actAccountMasterCloseBtn      = masterCloseBtn.isDisplayed();
			boolean actAccountMasterExpandBtn     = masterRibbonToExpandOptions.isDisplayed();

			boolean expAccountMasterNewBtn        = true;
			boolean expAccountMasterAddGroupBtn   = true;
			boolean expAccountMasterEditBtn       = true;
			boolean expAccountMasterCloneBtn      = true;
			boolean expAccountMasterPropertiesBtn = true;
			boolean expAccountMasterDeleteBtn     = true;
			boolean expAccountMasterCloseBtn      = true;
			boolean expAccountMasterExpandBtn     = true;

			System.out.println("New Button Display Value Actual          : " + actAccountMasterNewBtn+        "  Value Expected : " + expAccountMasterNewBtn);
			System.out.println("Add Group Button Display Value Actual    : " + actAccountMasterAddGroupBtn+   "  Value Expected : " + expAccountMasterAddGroupBtn);
			System.out.println("Edit Button Display Value Actual         : " + actAccountMasterEditBtn +      "  Value Expected : " + expAccountMasterEditBtn);
			System.out.println("Close Button Display Value Actual        : " + actAccountMasterCloneBtn+      "  Value Expected : " + expAccountMasterCloneBtn);
			System.out.println("Properties Button Display Value Actual   : " + actAccountMasterPropertiesBtn+ "  Value Expected : " + expAccountMasterPropertiesBtn);
			System.out.println("Delete Button Display Value Actual       : " + actAccountMasterDeleteBtn+     "  Value Expected : " + expAccountMasterDeleteBtn);
			System.out.println("Close Button Button Display Value Actual : " + actAccountMasterCloseBtn+      "  Value Expected : " + expAccountMasterCloseBtn);
			System.out.println("Expand Button Display Value Actual       : " + actAccountMasterExpandBtn+     "  Value Expected : " + expAccountMasterExpandBtn);
				
			if (actItemRibbon.equals(expItemRibbon) && actAccountMasterNewBtn == expAccountMasterNewBtn
					&& actAccountMasterAddGroupBtn == expAccountMasterAddGroupBtn
					&& actAccountMasterEditBtn == expAccountMasterEditBtn
					&& actAccountMasterCloneBtn == expAccountMasterCloneBtn
					&& actAccountMasterPropertiesBtn == actAccountMasterPropertiesBtn
					&& actAccountMasterDeleteBtn == expAccountMasterDeleteBtn
					&& actAccountMasterCloseBtn == expAccountMasterCloseBtn
					&& actAccountMasterExpandBtn == expAccountMasterExpandBtn)
			{
				excelReader.setCellData(xlfile, xlSheetName, 700, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 700, 9, resFail);
				return false;
			}
		  }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 700, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }

	 

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
   



	 public static boolean checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("*********** checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInDepartmentMastersPage Method Executes............*******************");

		 try
		 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));
			masterRibbonToExpandOptions.click();

			/*boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			boolean expSummaryErrorMessage  = true;
			
	       System.out.println("Click On Ribbon Expand Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
			*/
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));

			boolean actAccountMasterGroupBtn              = masterGroupBtn.isDisplayed();
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

			Thread.sleep(1000);
			
			
		     ArrayList<String> actRibbonControlExpandList= new ArrayList<String>();
			
		 	 int count = itemRibbonControlExpandList.size();
			
			 System.err.println("count   :"+count);
			
			 for (int i=0;i<count;i++)
			 {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
				masterRibbonControlNextBtn.click();
				
				String data=itemRibbonControlExpandList.get(i).getText();
				actRibbonControlExpandList.add(data);
			 }
			
			 String actItemRibbonExpand = actRibbonControlExpandList.toString();
		 	
			 String expItemRibbonExpand = "[Group, Delete All, Close Department, Open Close Department, Advance Master Import/Export, Auth Info, Move Up, Move Down, Sort, Mass Update, Export Format To XML, Customize Master, Customize View, Customize Tree, Print]";
			
			 excelReader.setCellData(xlfile, xlSheetName, 703, 8, actItemRibbonExpand);
			
			 System.out.println("actItemRibbonExpand   : "+actItemRibbonExpand);
			
			 System.out.println("expItemRibbonExpand   : "+expItemRibbonExpand);	
			
			
			 if (/*actSummaryErrorMessage==expSummaryErrorMessage
					&&*/ actAccountMasterGroupBtn == expAccountMasterGroupBtn
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
					&& actAccountMasterExportFormatToXMLBtn == expAccountMasterExportFormatToXMLBtn && 
					
					actItemRibbonExpand.equalsIgnoreCase(expItemRibbonExpand))
			{
				excelReader.setCellData(xlfile, xlSheetName, 702, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 702, 9, resFail);
				return false;
			}
		  }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 702, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	 
	 
	   public static boolean checkOtherToolsOptionsAvailabilityInDepartmentMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("********* checkOtherToolsOptionsAvailabilityInDepartmentMastersPageOnClickRibbonControlNextButton Method Executes............  *******************");

		 try
		 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));

			masterRibbonControlNextBtn.click();
			
			/*boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			boolean expSummaryErrorMessage  = true;
			

	        System.out.println("Click On Ribbon Control Next Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
		*/
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			/*masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();*/

			

		     ArrayList<String> actRibbonControlExpandList= new ArrayList<String>();
			
		 	 int count = itemRibbonControlExpandList.size();
			
			 System.err.println("count   :"+count);
			
			 for (int i=0;i<count;i++)
			 {
				String data=itemRibbonControlExpandList.get(i).getText();
				actRibbonControlExpandList.add(data);
			 }
			
			 String actItemRibbonExpand = actRibbonControlExpandList.toString();
		 	
			 String expItemRibbonExpand = "[, , , , Advance Master Import/Export, Auth Info, Move Up, Move Down, Sort, Mass Update, Export Format To XML, Customize Master, Customize View, Customize Tree, Print]";
			
			 excelReader.setCellData(xlfile, xlSheetName, 705, 8, actItemRibbonExpand);
			
			 System.out.println("actItemRibbonExpand   : "+actItemRibbonExpand);
			
			 System.out.println("expItemRibbonExpand   : "+expItemRibbonExpand);	
			
			
			getWebDriverWait().until(ExpectedConditions.visibilityOf(masterCustamizeMasterBtn));

			boolean actAccountMasterCustomizeMasterBtn = masterCustamizeMasterBtn.isDisplayed();
			boolean actAccountMasterCustomizeViewBtn   = masterCustamizeViewBtn.isDisplayed();
			boolean actAccountMasterCustomizeTreeBtn   = mastercustamizeTreeBtn.isDisplayed();

			boolean expAccountMasterCustomizeMasterBtn = true;
			boolean expAccountMasterCustomizeViewBtn   = true;
			boolean expAccountMasterCustomizeTreeBtn   = true;

			System.out.println("Customize Master Option Value Actual        : " + actAccountMasterCustomizeMasterBtn+        " Value Expected : " + expAccountMasterCustomizeMasterBtn);
			System.out.println("Customize View Option Value Actual          : " + actAccountMasterCustomizeViewBtn+          " Value Expected : " + expAccountMasterCustomizeViewBtn);
			System.out.println("Customize Tree Option Value Actual          : " + actAccountMasterCustomizeTreeBtn+          " Value Expected : " + expAccountMasterCustomizeTreeBtn);

			if (/*actSummaryErrorMessage==expSummaryErrorMessage 
					&&*/ actAccountMasterCustomizeMasterBtn == expAccountMasterCustomizeMasterBtn
					&& actAccountMasterCustomizeViewBtn == expAccountMasterCustomizeViewBtn
					&& actAccountMasterCustomizeTreeBtn == expAccountMasterCustomizeTreeBtn && actItemRibbonExpand.equalsIgnoreCase(expItemRibbonExpand))
			{
				excelReader.setCellData(xlfile, xlSheetName, 704, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 704, 9, resFail);
				return false;
			}
		  }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 704, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
		
	 

	 public static boolean checkTreeViewOptionsAvailableInDepartmentsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("***********  checkTreeViewOptionsAvailableInDepartmentsMastersPage Method Executes............ ********************");

		 try
		 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));

			boolean actAccountMasterTreeIdDropdownIsDisplay        = masterTreeIdDropdown.isDisplayed();
			
			Select MasterId=new Select(masterTreeIdDropdown);
			String actAccountMasterTreeIdDropdownGetText           = MasterId.getFirstSelectedOption().getText();
			
			boolean actAccountMasterTreeIDToggleBtnIsDisplay       = masterTreeIDToggleBtn.isDisplayed();
			boolean actAccountMasterTreeViewIDDropdownIsDisplay    = masterTreeViewIDDropdown.isDisplayed();
			
			Select MasterTreeViewId=new Select(masterTreeViewIDDropdown);
			String actAccountMasterTreeViewIDDropdownGetText          = MasterTreeViewId.getFirstSelectedOption().getText();
			
			boolean actAccountMasterTreeViewIDToggleBtnIsDisplay   = masterTreeViewIDToggleBtn.isDisplayed();
			boolean actAccountMasterHideAccountsGroupTreeIsDisplay = masterOptionToHideAccountsGroupTree.isDisplayed();

			boolean expAccountMasterTreeIdDropdownIsDisplay        = true;
			String expAccountMasterTreeIdDropdownGetText           = excelReader.getCellData(xlSheetName, 707, 7);
			                                                        
			boolean expAccountMasterTreeIDToggleBtnIsDisplay       = true;
			boolean expAccountMasterTreeViewIDDropdownIsDisplay    = true;
			String expAccountMasterTreeViewIDDropdownGetText       = excelReader.getCellData(xlSheetName, 708, 7);
			
			boolean expAccountMasterTreeViewIDToggleBtnIsDisplay   = true;
			boolean expAccountMasterHideAccountsGroupTreeIsDisplay = true;
			

			System.out.println("Tree ID Dropdown Option Value Actual      : " +actAccountMasterTreeIdDropdownIsDisplay+        " Value Expected : " + expAccountMasterTreeIdDropdownIsDisplay);
			System.out.println("Tree ID Dropdown Option Value Actual      : " +actAccountMasterTreeIdDropdownGetText+         " Value Expected : " + expAccountMasterTreeIdDropdownGetText);
			
			System.out.println("Tree ID Toggle Option Value Actual        : " +actAccountMasterTreeIDToggleBtnIsDisplay+        " Value Expected : " + expAccountMasterTreeIDToggleBtnIsDisplay);
		
			
			System.out.println("Tree View ID Option Value Actual          : " +actAccountMasterTreeViewIDDropdownIsDisplay+     " Value Expected : " + expAccountMasterTreeViewIDDropdownIsDisplay);
			System.out.println("Tree View ID Option Value Actual          : " +actAccountMasterTreeViewIDDropdownGetText+     " Value Expected : " + expAccountMasterTreeViewIDDropdownGetText);
			
			System.out.println("Tree View ID Toggle Value Actual          : " +actAccountMasterTreeViewIDToggleBtnIsDisplay +   " Value Expected : " + expAccountMasterTreeViewIDToggleBtnIsDisplay);
			
			
			System.out.println("Hide Accounts Group Tree Value Actual     : " +actAccountMasterHideAccountsGroupTreeIsDisplay+  " Value Expected : " + expAccountMasterHideAccountsGroupTreeIsDisplay);
			
	        excelReader.setCellData(xlfile, xlSheetName, 707, 8, actAccountMasterTreeIdDropdownGetText);
			
			excelReader.setCellData(xlfile, xlSheetName, 708, 8, actAccountMasterTreeViewIDDropdownGetText);
			
			
			if ( actAccountMasterTreeIdDropdownIsDisplay == expAccountMasterTreeIdDropdownIsDisplay
					&& actAccountMasterTreeIDToggleBtnIsDisplay == expAccountMasterTreeIDToggleBtnIsDisplay
					&& actAccountMasterTreeViewIDDropdownIsDisplay == expAccountMasterTreeViewIDDropdownIsDisplay
					&& actAccountMasterTreeViewIDToggleBtnIsDisplay == expAccountMasterTreeViewIDToggleBtnIsDisplay
					&& actAccountMasterHideAccountsGroupTreeIsDisplay == expAccountMasterHideAccountsGroupTreeIsDisplay && 
					
					actAccountMasterTreeIdDropdownGetText.equalsIgnoreCase(expAccountMasterTreeIdDropdownGetText) && 
					 
					actAccountMasterTreeViewIDDropdownGetText.equalsIgnoreCase(expAccountMasterTreeViewIDDropdownGetText))
					 
					
			{
				excelReader.setCellData(xlfile, xlSheetName, 706, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 706, 9, resFail);
				return false;
			}
		  }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 706, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }
		

	 public static boolean checkDisplayOfGroupAvailableTreeStructureLeftPageDepartmentsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("**************************  checkDisplayOfGroupAvailableTreeStructureLeftPageDepartmentsMasterPage Method Executes............  *******************************");
	    
		 try
		 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));

			boolean actDepartmentMasterRoot                = accountRootAccount.isDisplayed();
			
			boolean expDepartmentMasterRoot                = true;
			
			String actDepartmentRootName=accountRootAccount.getText();
			
			String expDepartmentRootName=excelReader.getCellData(xlSheetName, 710, 7);	
			
			System.out.println("Open Units Master Department Root Is Display Value Actual  : " + actDepartmentMasterRoot+   " Value Expected : " + expDepartmentMasterRoot);
			System.out.println("Root Department Text Display Value Actual                 : " + actDepartmentRootName+      " Value Expected : " + expDepartmentRootName);
				
			excelReader.setCellData(xlfile, xlSheetName, 710, 8, actDepartmentRootName);
			
			
			if (actDepartmentMasterRoot == expDepartmentMasterRoot
					&& actDepartmentRootName.equalsIgnoreCase(expDepartmentRootName))
			{
				excelReader.setCellData(xlfile, xlSheetName, 709, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 709, 9, resFail);
				return false;
			}
		  }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 709, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }


	 public static boolean checkCreateTreeToggleOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 System.out.println("********************* checkCreateTreeToggleOptionsAvailableInDepartmentMastersPage Method Executes............ *******************************");
	    
		 try
		 {
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggleBtn)); 
			masterTreeIDToggleBtn.click();
			
			
			 ArrayList<String> actMasterIDListList= new ArrayList<String>();
				
				int count = mastertreeIdList.size();
				System.err.println("count   :"+count);
				
				for (int i=0;i<count;i++)
				{
					String data=mastertreeIdList.get(i).getText();
					actMasterIDListList.add(data);
				}
				
				String actMasterIDExpand = actMasterIDListList.toString();
				String expMasterIDExpand = excelReader.getCellData(xlSheetName, 711, 7);
				
				System.out.println("actMasterIDExpand   : "+actMasterIDExpand);
				System.out.println("expMasterIDExpand   : "+expMasterIDExpand);	
		 	    
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggle_setDefaultBtn));

		 		boolean actAccountMasterTreeCreateTreeBtn = masterTreeIDToggle_CreateTreeBtn.isDisplayed();
		 		boolean actAccountMasterTreeEditBtn       = masterTreeIDToggle_EditBtn.isDisplayed();
		 		boolean actAccountMasterTreeDeleteBtn     = masterTreeIDToggle_DeleteBtn.isDisplayed();
		 		boolean actAccountMasterTreeSetDefaultBtn = masterTreeIDToggle_setDefaultBtn.isDisplayed();

		 		boolean expAccountMasterTreeCreateTreeBtn = true;
		 		boolean expAccountMasterTreeEditBtn       = true;
		 		boolean expAccountMasterTreeDeleteBtn     = true;
		 		boolean expAccountMasterTreeSetDefaultBtn = true;

		 		System.out.println("Tree ID Dropdown Option Value Actual  : " + actAccountMasterTreeCreateTreeBtn+ " Value Expected : " + expAccountMasterTreeCreateTreeBtn);
		 		System.out.println("Tree ID Toggle Option Value Actual    : " + actAccountMasterTreeEditBtn+       " Value Expected : " + expAccountMasterTreeEditBtn);
		 		System.out.println("Tree View ID Option Value Actual      : " + actAccountMasterTreeDeleteBtn+     " Value Expected : " + expAccountMasterTreeDeleteBtn);
		 		System.out.println("Tree View ID Toggle Value Actual      : " + actAccountMasterTreeSetDefaultBtn+ " Value Expected : " + expAccountMasterTreeDeleteBtn);
		 		
		 		
		 		System.out.println("Master Item Tree ID       : " + actMasterIDExpand+ " Value Expected : " + expMasterIDExpand);
		 		 
		 		excelReader.setCellData(xlfile, xlSheetName, 711, 8, actMasterIDExpand);
		 		
		 		if ( actAccountMasterTreeCreateTreeBtn == expAccountMasterTreeCreateTreeBtn
		 				&& actAccountMasterTreeEditBtn == expAccountMasterTreeEditBtn
		 				&& actAccountMasterTreeDeleteBtn == expAccountMasterTreeDeleteBtn
		 				&& actAccountMasterTreeSetDefaultBtn==expAccountMasterTreeSetDefaultBtn && actMasterIDExpand.equalsIgnoreCase(expMasterIDExpand))
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 711, 9, resPass);
		 			return true;
		 		} 
		 		else 
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 711, 9, resFail);
		 			return false;
		 		}
		 	  }
		 	 catch (Exception e) 
			  {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 711, 10, exception);
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
				  return false;
			  }
	 }
			
		
	 public static boolean checkCreateViewToggleOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("********************** checkCreateViewToggleOptionsAvailableInUnitsMastersPage Method Executes............***********************************");

	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIDToggleBtn));
	 		masterTreeViewIDToggleBtn.click();

	  	   ArrayList<String> actMasterViewIDListList= new ArrayList<String>();
			
	 		int count = mastertreeViewIdList.size();
	 		System.err.println("count   :"+count);
	 		
	 		for (int i=0;i<count;i++)
	 		{
	 			String data=mastertreeViewIdList.get(i).getText();
	 			actMasterViewIDListList.add(data);
	 		}
	 		
	 		String actMasterViewIDExpand = actMasterViewIDListList.toString();
	 		String expMasterViewIDExpand = excelReader.getCellData(xlSheetName, 712, 7);
	 		
	 		System.out.println("actMasterViewIDExpand   : "+actMasterViewIDExpand);
	 		System.out.println("expMasterViewIDExpand   : "+expMasterViewIDExpand);	
	 		
	 		
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIdCreateViewBtn));

	 		boolean actAccountMasterTreeViewCreateViewBtn = masterTreeViewIdCreateViewBtn.isDisplayed();
	 		boolean actAccountMasterTreeViewEditViewBtn   = masterTreeeViewIdEditBtn.isDisplayed();
	 		boolean actAccountMasterTreeViewDeleteBtn     = masterTreeViewIdDeleteBtn.isDisplayed();

	 		boolean expAccountMasterTreeViewCreateViewBtn = true;
	 		boolean expAccountMasterTreeViewEditViewBtn   = true;
	 		boolean expAccountMasterTreeViewDeleteBtn     = true;

	 		System.out.println("Tree View Create View Option Value Actual : " + actAccountMasterTreeViewCreateViewBtn+ " Value Expected : " + expAccountMasterTreeViewCreateViewBtn);
	 		System.out.println("Tree View Edit View Option Value Actual   : " + actAccountMasterTreeViewEditViewBtn+   " Value Expected : " + expAccountMasterTreeViewEditViewBtn);
	 		System.out.println("Tree View Delete View Option Value Actual : " + actAccountMasterTreeViewDeleteBtn+     " Value Expected : " + expAccountMasterTreeViewDeleteBtn);

	 		excelReader.setCellData(xlfile, xlSheetName, 712, 8, actMasterViewIDExpand);
	 		
	 		if (actAccountMasterTreeViewCreateViewBtn == expAccountMasterTreeViewCreateViewBtn
	 				&& actAccountMasterTreeViewEditViewBtn == expAccountMasterTreeViewEditViewBtn
	 				&& actAccountMasterTreeViewDeleteBtn == expAccountMasterTreeViewDeleteBtn && 
	 				
	 				actMasterViewIDExpand.equalsIgnoreCase(expMasterViewIDExpand))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 712, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 712, 9, resPass);
	 			return false;
	 		}
	 	  }
	 	  catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 712, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
		
		
	 public static boolean checkHideUnitGroupOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("********************* checkHideUnitGroupOptionsAvailableInDepartmentMastersPage Method Executes............*************************");

		 try
	 	 {
	 	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
	 	   masterOptionToHideAccountsGroupTree.click();
	 	   
	 	 /*  boolean actSummaryErrorMessage    = checkErrorMessageIsDisplayingOrNotDisplaying();
	 	   boolean expSummaryErrorMessage    = true;

	 	   System.out.println("Click on Hide Units Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);  
*/
	 	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeUnitsDisplay));

	 	   boolean actAccountMasterTreeUnits = treeUnitsDisplay.isDisplayed();
	 	   boolean expAccountMasterTreeUnits = true;
	 		
	 	   System.out.println("Tree View Create View Option Value Actual : " + actAccountMasterTreeUnits+ " Value Expected : " + expAccountMasterTreeUnits);

	 	   boolean actTestResult=/*actSummaryErrorMessage==actSummaryErrorMessage 
	 			                  && */actAccountMasterTreeUnits == expAccountMasterTreeUnits && masterOptionToHideAccountsGroupTree.isDisplayed()==true;
	 	   
	 	   String actValue = Boolean.toString(actTestResult);
	 	   String expValue = excelReader.getCellData(xlSheetName, 713, 7);
	 	   
	 	   System.err.println(" Actual; Value : "+actValue +"  Value Expected : "+expValue);
	 	  
	 	   
	 	  excelReader.setCellData(xlfile, xlSheetName, 713, 8, actValue.toUpperCase());
	 	  
	 	   if (actValue.equalsIgnoreCase(expValue))
	 	   {
	 		    excelReader.setCellData(xlfile, xlSheetName, 713, 9, resPass);
	 			return true;
	 	   } 
	 	   else 
	 	   {
	 		  excelReader.setCellData(xlfile, xlSheetName, 713, 9, resFail);
	 			return false;
	 	   }
	 	 }
	 	 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 713, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
		
		
	 public static boolean checkUnHideUnitsGroupOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("********************** checkUnHideUnitsGroupOptionsAvailableInDepartmentMastersPage Method Executes............ ******************************");
	   
		 
		 
		 try
	 	 {
	 		  
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
		    masterOptionToHideAccountsGroupTree.click();
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));
		    
			boolean actUnitsMasterRoot                = accountRootAccount.isDisplayed();
			
			boolean expUnitsMasterRoot                = true;
			
			String actUnitRootName=accountRootAccount.getText();
			
			String expUnitRootName=excelReader.getCellData(xlSheetName, 714, 7);	

			
			
			System.out.println("Open Units Master Unit Root Is Display Value Actual  : " + actUnitsMasterRoot+ " Value Expected : " + expUnitsMasterRoot);
			System.out.println("Root Units Text Display Value Actual          : " + actUnitRootName+            " Value Expected : " + expUnitRootName);
				
			excelReader.setCellData(xlfile, xlSheetName, 714, 8, actUnitRootName);
			
			if (actUnitsMasterRoot == expUnitsMasterRoot
					&& actUnitRootName.equalsIgnoreCase(expUnitRootName))
			{
				 excelReader.setCellData(xlfile, xlSheetName, 714, 9, resPass);
				 return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 714, 9, resFail);
				return false;
			}
		  }
	 	 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 714, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
		   
	 	 }
		 
		 
		
		
	 public static boolean checkHeaderFieldsOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("********************** checkHeaderFieldsOptionsAvailableInDepartmentMastersPage Method Executes............ **********************************");

		 
		 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));

	 		
	 		String actAccountMasterSearchGetText               = masterSearchTxt.getAttribute("placeholder");
	 		
	 		String expAccountMasterSearchGetText               = excelReader.getCellData(xlSheetName, 715, 7);
	 		
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 715, 8, actAccountMasterSearchGetText);
	 		
	 		boolean actAccountMasterSearchBtn                  = masterSearchBtn.isDisplayed();
	 		boolean actAccountMasterCmbMasterTxt               = mastercmbMasterTxt.isDisplayed();
	 		boolean actAccountMasterCmbMasterExpansionBtn      = masterCmbMasterExpansionBtn.isDisplayed();
	 		boolean actAccountMasterCmbMasterSettingsBtn       = masterCumMasterSettingBtn.isDisplayed();
	 		boolean actAccountMasterRetainSelectionCheckbox    = masterRetainSelectionCheckBox.isDisplayed();
	 		boolean actAccountMasterSideBarBtn                 = masterSideBarBtn.isDisplayed();
	 		
	 		ArrayList<String> actmasterItemSearchControlList= new ArrayList<String>();
	 		
	  		int count = masterItemSearchControlList.size();
	  		System.err.println("count   :"+count);
	  		
	  		for (int i=0;i<count;i++)
	  		{
	  			String data=masterItemSearchControlList.get(i).getAttribute("title");
	  			actmasterItemSearchControlList.add(data);
	  		}
	  		
	  		String actControlList = actmasterItemSearchControlList.toString();
	  		String expControlList = excelReader.getCellData(xlSheetName, 716, 7);
	  		
	  		System.out.println("actControlList   : "+actControlList);
	  		System.out.println("expControlList   : "+expControlList);

	  		excelReader.setCellData(xlfile, xlSheetName, 716, 8, actControlList);
	  		
	 		boolean expAccountMasterSearchBtn                  = true;
	 		boolean expAccountMasterCmbMasterTxt               = true;
	 		boolean expAccountMasterCmbMasterExpansionBtn      = true;
	 		boolean expAccountMasterCmbMasterSettingsBtn       = true;
	 		boolean expAccountMasterRetainSelectionCheckbox    = true;
	 		boolean expAccountMasterSideBarBtn                 = true;

	 		
	 		System.out.println("Search Button Value Actual           : "+ actAccountMasterSearchBtn+                  " Value Expected : " + expAccountMasterSearchBtn);
	 		System.out.println("Comb Box Value Actual                : "+ actAccountMasterCmbMasterTxt+               " Value Expected : " + expAccountMasterCmbMasterTxt);
	 		System.out.println("Combo Box Expansion Value Actual     : "+ actAccountMasterCmbMasterExpansionBtn+      " Value Expected : " + expAccountMasterCmbMasterExpansionBtn);
	 		System.out.println("Combo Box Settings Value Actual      : "+ actAccountMasterCmbMasterSettingsBtn+       " Value Expected : " + expAccountMasterCmbMasterSettingsBtn);
	 		System.out.println("Selection Check Box Value Actual     : "+ actAccountMasterRetainSelectionCheckbox+    " Value Expected : " + expAccountMasterRetainSelectionCheckbox);
	 		System.out.println("Side Bar Value Actual                : "+ actAccountMasterSideBarBtn+                 " Value Expected : " + expAccountMasterSideBarBtn);
	 		
	 		System.out.println("AccountMasterSearchGetText          : "+actAccountMasterSearchGetText +"  Value Expected  : "+expAccountMasterSearchGetText);
	 		
	 		
	 		
	 		
	 		
	 		boolean actTestResult= actAccountMasterSearchBtn == expAccountMasterSearchBtn
					 				&& actAccountMasterCmbMasterTxt == expAccountMasterCmbMasterTxt
					 				&& actAccountMasterCmbMasterExpansionBtn == expAccountMasterCmbMasterExpansionBtn
					 				&& actAccountMasterCmbMasterSettingsBtn == expAccountMasterCmbMasterSettingsBtn
			 						&& actAccountMasterRetainSelectionCheckbox == expAccountMasterRetainSelectionCheckbox
			 		 				&& actAccountMasterSideBarBtn == expAccountMasterSideBarBtn;
	 		
	 		String actDispalyResult=Boolean.toString(actTestResult);
	 		String expDispalyResult=excelReader.getCellData(xlSheetName, 717, 7);	
	 		
	 		System.err.println("DispalyResult  "+actDispalyResult +" Value Expected : "+expDispalyResult);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 717, 8, actDispalyResult.toUpperCase());
	 		
	 		
	 		if(actDispalyResult.equalsIgnoreCase(expDispalyResult) && actControlList.equalsIgnoreCase(expControlList) 
	 				&& actAccountMasterSearchGetText.equalsIgnoreCase(expAccountMasterSearchGetText)) 
	 		
	 		{
	 			 excelReader.setCellData(xlfile, xlSheetName, 715, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			 excelReader.setCellData(xlfile, xlSheetName, 715, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 715, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }
		 
		
	 @FindBy(xpath="//*[@id='btnSearchAcc']/ol/li")
	  private static List<WebElement> masterSearchList; 
		
	 public static boolean checkSearchOptionAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("*************************** checkSearchOptionAvailableInDepartmentMastersPage Method Executes............ ********************************");

		 
		 
		 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));
	 		masterSearchBtn.click();

	 /*		boolean actSummaryErrorMessage                      = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		boolean expSummaryErrorMessage                      = true;

	 		System.out.println("Click on Search Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
*/	 		
	        ArrayList<String> actmasterSearchList= new ArrayList<String>();
	 		
	  		int count = masterSearchList.size();
	  		System.err.println("count   :"+count);
	  		
	  		for (int i=0;i<count;i++)
	  		{
	  			String data=masterSearchList.get(i).getText();
	  			actmasterSearchList.add(data);
	  		}
	  		
	  		String actSearchList = actmasterSearchList.toString();
	  		String expSearchList = excelReader.getCellData(xlSheetName, 718, 7);
	  		
	  		System.out.println("actSearchList   : "+actSearchList);
	  		System.out.println("expSearchList   : "+expSearchList);
	 		
	  		excelReader.setCellData(xlfile, xlSheetName, 718, 8, actSearchList);
	  		
	 		if (actSearchList.equalsIgnoreCase(expSearchList) /*&& actSummaryErrorMessage==expSummaryErrorMessage*/)
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 718, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			 excelReader.setCellData(xlfile, xlSheetName, 718, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	catch (Exception e) 
		  {
			  String exception =e.getMessage();
			 
			  
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 718, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
		 

	
	 
	  
	 @FindBy(xpath ="//*[@id='landgridData']/thead/tr/th")
	 public static List<WebElement> masterItemHeaderList;
	 
	 public static boolean checkDepartmentMastersDisplayTableColumnNamesAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 System.out.println("************************* checkDepartmentMastersDisplayTableColumnNamesAvailableInDepartmentMastersPage Method Executes............ *************************");
			
		 
		 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGrid_Header_SelectTxt));
	 		boolean actAccountMasterGridSelectTxt = masterGrid_Header_SelectTxt.isDisplayed();
	 		masterGrid_Header_SelectTxt.click();

	 		/*boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		boolean expSummaryErrorMessage  = true;

	 		System.out.println("Click on Master Grid Header Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	 	*/	
	 		
	 		ArrayList<String> actmasterItemHeaderList=new ArrayList<String>();
	 		
	 		int HeaderCount =masterItemHeaderList.size();
	 		
	 		System.err.println("HeaderCount   :  "+HeaderCount);
	 		
	 		for (int i = 0; i < HeaderCount; i++) 
	 		{
				String data=masterItemHeaderList.get(i).getText();
				actmasterItemHeaderList.add(data);
			}
	 	
	 		 String actMasterItemHeaderTextList=actmasterItemHeaderList.toString();
	 		 String expMasterItemHeaderTextList=excelReader.getCellData(xlSheetName, 719, 7);
	 		
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 719, 8, actMasterItemHeaderTextList);
	 		
	 		if (actMasterItemHeaderTextList.equalsIgnoreCase(expMasterItemHeaderTextList))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 719, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 719, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	 catch (Exception e) 
	 	  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 719, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
		 
		 

	 @FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[11]")
		public static List<WebElement> masterDepCodeList;


	 public static boolean checkDepartmentMastersDisplayTableColumnValuesAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	   excelReader=new ExcelReader(POJOUtility.getExcelPath());
	   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
	   System.out.println("********************** checkDepartmentMastersDisplayTableColumnValuesAvailableInDepartmentMastersPage Method Executes............ **************************");
		
	   try
	   {
	         ArrayList<String> actmasterDepNameList=new ArrayList<String>();
		
			 int HeaderCount =masterDepNameList.size();
			
			 System.err.println("HeaderCount   :  "+HeaderCount);
			
			 for (int i = 0; i < HeaderCount; i++) 
			 {
				String data=masterDepNameList.get(i).getText();
				actmasterDepNameList.add(data);
			 }
			
			 String actMasterDepNameTextList=actmasterDepNameList.toString();
			 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 721, 7);
			
			 excelReader.setCellData(xlfile, xlSheetName, 721, 8, actMasterDepNameTextList);
	   	
		   	 System.err.println("  Actual MasterDepNameTextList : "+actMasterDepNameTextList);
		   	 System.err.println("  Expected  MasterDepNameTextList : "+expMasterDepNameTextList);
		   	
	   	
	         ArrayList<String> actmasterDepCodeList=new ArrayList<String>();
			
			 int CodeList =masterDepCodeList.size();
			
			 System.err.println("CodeList   :  "+CodeList);
			
			 for (int i = 0; i < CodeList; i++) 
			 {
				String data=masterDepCodeList.get(i).getText();
				actmasterDepCodeList.add(data);
			 }
			
		
			 String actMasterDepCodeTextList=actmasterDepCodeList.toString();
			 String expMasterDepCodeTextList=excelReader.getCellData(xlSheetName, 722, 7);
			
			 excelReader.setCellData(xlfile, xlSheetName, 722, 8, actMasterDepCodeTextList);
		   	
		   	System.err.println("  Actual MasterItemDepCodeTextList : "+actMasterDepCodeTextList);
		   	System.err.println("  Expected  MasterDepCodeTextList : "+expMasterDepNameTextList);
		   	
		   	if(actMasterDepNameTextList.equalsIgnoreCase(expMasterDepNameTextList) && 
		   			actMasterDepCodeTextList.equalsIgnoreCase(expMasterDepCodeTextList))
		   	
			 {
	   		excelReader.setCellData(xlfile, xlSheetName, 720, 9, resPass);
			return true;
		 } 
		 else 
		 {
			excelReader.setCellData(xlfile, xlSheetName, 720, 9, resFail);
			return false;
		 }
	   }
	   catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 720, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }
	   
	 
	 
	  @FindBy(xpath = "//*[@id='iCurrencyId']")
	  private static WebElement localCurrencyComboBox;

	  @FindBy(xpath = "//*[@id='newMasterDiv0']/div/div/div/label/a")
	  private static List<WebElement> depNewScreenBodyList;
	  
	  @FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div/div/div/ul/li/button")
	  private static List<WebElement> depNewScreenHeaderList;

	  
	  
	  public static boolean checkClickOnNewButtonInDepartmentMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {

		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("****************************************** checkClickOnNewButtonInDepartmentMasterPage  ****************************************************");
		
		try
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			masterNewBtn.click();
			
			//boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			//boolean expSummaryErrorMessage  = true;
			
			//System.out.println("Check Any Error Message On Click On New Value Actual  : " + actSummaryErrorMessage + "  Value Expected : "+ expSummaryErrorMessage);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			
			
	       ArrayList<String> actdepNewScreenBodyList=new ArrayList<String>();
			
			int BodyList =depNewScreenBodyList.size();
			
			System.err.println("BodyList   :  "+BodyList);
			
			for (int i = 0; i < BodyList; i++) 
			{
				String data=depNewScreenBodyList.get(i).getText();
				actdepNewScreenBodyList.add(data);
			}
			
		
			String actdepNewScreenBodyText=actdepNewScreenBodyList.toString();
			String expdepNewScreenBodyText=excelReader.getCellData(xlSheetName, 724, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 724, 8, actdepNewScreenBodyText);
			
			System.out.println("actdepNewScreenBodyText        :"+actdepNewScreenBodyText);
			System.out.println("expdepNewScreenBodyText        :"+expdepNewScreenBodyText);
			
			
			ArrayList<String> actdepNewScreenHeaderList=new ArrayList<String>();
				
			int HeaderList =depNewScreenHeaderList.size();
			
			System.err.println("HeaderList   :  "+HeaderList);
			
			for (int i = 0; i < HeaderList; i++) 
			{
				String data=depNewScreenHeaderList.get(i).getText();
				actdepNewScreenHeaderList.add(data);
			}
			
		
			String actdepNewScreenHeaderText=actdepNewScreenHeaderList.toString();
			String expdepNewScreenHeaderText=excelReader.getCellData(xlSheetName, 725, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 725, 8, actdepNewScreenHeaderText);

			System.out.println("actdepNewScreenHeaderText        :"+actdepNewScreenHeaderText);
			System.out.println("expdepNewScreenHeaderText        :"+expdepNewScreenHeaderText);
			
			
			
			boolean actUnitsMasterName      = nameTxt.isDisplayed();
			boolean actUnitsMasterCode      = codeTxt.isDisplayed();
			boolean actLocalCurrency        = localCurrencyComboBox.isDisplayed();
			boolean actMasterSearchSaveBtn  = saveBtn.isDisplayed();
			boolean actMasterSearchCloseBtn = closeBtn.isDisplayed();

			boolean expUnitsMasterName      = true;
			boolean expUnitsMasterCode      = true;
			boolean expLocalCurrency        = true;
			boolean expMasterSearchSaveBtn  = true;
			boolean expMasterSearchCloseBtn = true;

			System.out.println("Name Value Actual                          : " + actUnitsMasterName +     " Value Expected : " + expUnitsMasterName);
			System.out.println("Code Value Actual                          : " + actUnitsMasterCode +     " Value Expected : " + expUnitsMasterCode);
			System.out.println("Code Value Actual                          : " + actLocalCurrency +       " Value Expected : " + expLocalCurrency);
			System.out.println("Save Button Value Actual                   : " + actMasterSearchSaveBtn+  " Value Expected : " + expMasterSearchSaveBtn);
			System.out.println("Close Button Value Actual                  : " + actMasterSearchCloseBtn+ " Value Expected : " + expMasterSearchCloseBtn);

			
			boolean DisplayResult=actUnitsMasterName == expUnitsMasterName && actUnitsMasterCode == expUnitsMasterCode
										&& actLocalCurrency == actLocalCurrency && actMasterSearchSaveBtn == expMasterSearchSaveBtn
										&& actMasterSearchCloseBtn == expMasterSearchCloseBtn;
			
			String actDepNewScreen=Boolean.toString(DisplayResult);
			String expDepNewScreen=excelReader.getCellData(xlSheetName, 726, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 726, 8, actDepNewScreen.toUpperCase());
			
			
			if (actDepNewScreen.equalsIgnoreCase(expDepNewScreen)&& actdepNewScreenHeaderText.equalsIgnoreCase(expdepNewScreenHeaderText) && 
					actdepNewScreenBodyText.equalsIgnoreCase(expdepNewScreenBodyText))
			{
				excelReader.setCellData(xlfile, xlSheetName, 723, 9, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 723, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 723, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }
	 
	 
	  public static boolean checkInputNameCodeLocalCurrencyFieldsInDepartmentCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {

		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("******************************** checkInputNameCodeLocalCurrencyFieldsInDepartmentCreationPage ************************************");
			
	    try
	    {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 728, 6));
			Thread.sleep(2000);
			nameTxt.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 729, 6));
			Thread.sleep(2000);
			codeTxt.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(localCurrencyComboBox));
			localCurrencyComboBox.sendKeys(excelReader.getCellData(xlSheetName, 730, 6));
			Thread.sleep(5000);
			localCurrencyComboBox.sendKeys(Keys.TAB);

			boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			boolean expSummaryErrorMessage  = true;
			
			
			System.out.println("Check Any Error Message On Click On New Value Actual  : " + actSummaryErrorMessage + "  Value Expected : "+ expSummaryErrorMessage);
		

			if (actSummaryErrorMessage==expSummaryErrorMessage) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 727, 9, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 727, 9, resFail);
				return false;
			}
	    }	

		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 727, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }

	  public static boolean checkClickOnSaveButtonInDepartmentCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {

		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("******************************** checkClickOnSaveButtonInDepartmentCreationPage ************************************");

	    try
	    {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();

			String expMasterSaveMessage = excelReader.getCellData(xlSheetName, 732, 7);;
			
			//excelReader.setCellData(xlfile, xlSheetName, 732, 8, expMasterSaveMessage);
			
			boolean actMasterSave = checkValidationMessageboolean(expMasterSaveMessage);
			boolean expMasterSave = true;

			System.out.println("Click on Save                   : " + actMasterSave + "  Value Expected :       " + expMasterSave);

			if (actMasterSave == expMasterSave)
			{
				excelReader.setCellData(xlfile, xlSheetName, 731, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 731, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 731, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }

	  
	  
	  @FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
	  public static WebElement unitsNewCreationNameInFirstRow;
	  
	  public static boolean checkDepartmentCreationAndClickOnCloseButtonToDisplayCreatedDepartmentInDisplayGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	    excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkDepartmentCreationAndClickOnCloseButtonToDisplayCreatedDepartmentInDisplayGrid *******************************");
		
		try
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));

			boolean actUnitsMasterName      = nameTxt.getText().isEmpty();
			boolean actUnitsMasterCode      = codeTxt.getText().isEmpty();
			boolean actLocalCurrency        = localCurrencyComboBox.isDisplayed();
			boolean actMasterSearchSaveBtn  = saveBtn.isDisplayed();
			boolean actMasterSearchCloseBtn = closeBtn.isDisplayed();

			boolean expUnitsMasterName      = true;
			boolean expUnitsMasterCode      = true;
			boolean expLocalCurrency        = true;
			boolean expMasterSearchSaveBtn  = true;
			boolean expMasterSearchCloseBtn = true;

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsNewCreationNameInFirstRow));
			String actUnitsCreationNameDisplayInGrid = unitsNewCreationNameInFirstRow.getText();
			String expUnitsCreationNameDisplayInGrid = excelReader.getCellData(xlSheetName, 734, 7);

			excelReader.setCellData(xlfile, xlSheetName, 734, 8, actUnitsCreationNameDisplayInGrid);
			
			System.out.println("Name Value Actual                         : " + actUnitsMasterName+                " Value Expected : " + expUnitsMasterName);
			System.out.println("Code Value Actual                         : " + actUnitsMasterCode+                " Value Expected : " + expUnitsMasterCode);
			System.out.println("Local Curency Value Actual                : " + actLocalCurrency +                 " Value Expected : "+ expLocalCurrency);
			System.out.println("Save Button Value Actual                  : " + actMasterSearchSaveBtn+            " Value Expected : " + expMasterSearchSaveBtn);
			System.out.println("Close Button Value Actual                 : " + actMasterSearchCloseBtn+           " Value Expected : " + expMasterSearchCloseBtn);
			System.out.println("Department Created display in Grid        : " + actUnitsCreationNameDisplayInGrid+ " Value Expected : " + expUnitsCreationNameDisplayInGrid);

			boolean DisplayedResult=actUnitsMasterName == expUnitsMasterName && actUnitsMasterCode == expUnitsMasterCode
									&& actLocalCurrency == expLocalCurrency && actMasterSearchSaveBtn == expMasterSearchSaveBtn
									&& actMasterSearchCloseBtn == expMasterSearchCloseBtn;
			
			String actDisplayResult=Boolean.toString(DisplayedResult);
			
			String expDisplayResult=excelReader.getCellData(xlSheetName, 735, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 735, 8, expDisplayResult.toUpperCase());
							
			System.out.println("actDisplayResult   : "+actDisplayResult);
			System.out.println("expDisplayResult   : "+expDisplayResult);
		
		if (actDisplayResult.equalsIgnoreCase(expDisplayResult)
					&& actUnitsCreationNameDisplayInGrid.equalsIgnoreCase(expUnitsCreationNameDisplayInGrid)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 733, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 733, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 733, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	}

	  public static boolean checkClickOnEditForNewlyCreatedDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("**************************************** checkClickOnEditForNewlyCreatedDepartment **************************************************");

		try
		{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
	 		unitFirstCheckBox.click();
	 		
			/*boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			boolean expSummaryErrorMessage  = true;*/
			
			boolean actMessage=unitFirstCheckBox.isDisplayed();
			
			boolean expMessage=true;
			
			System.out.println("Check Any Error Message On Click On New Value Actual  : " + actMessage +" Value Expected : "+ expMessage);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
			masterEditBtn.click();
			
			if (actMessage==expMessage) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 736, 9, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 736, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 736, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }

	  
	  public static boolean checkNameCodeAndCurrencyOptionForNewlyCreatedDepartmentThroughEdit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkNameCodeAndCurrencyOptionForNewlyCreatedDepartmentThroughEdit *******************************");
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.click();

			String actDepartmentNameTxt = nameTxt.getAttribute("value");
			String actDepartmentCodeTxt = codeTxt.getAttribute("value");

			excelReader.setCellData(xlfile, xlSheetName, 739, 8, actDepartmentNameTxt);
			
			excelReader.setCellData(xlfile, xlSheetName, 740, 8, actDepartmentCodeTxt);
			
			String expDepartmentNameTxt = excelReader.getCellData(xlSheetName, 739, 7);
			String expDepartmentCodeTxt = excelReader.getCellData(xlSheetName, 740, 7);

			System.out.println("Name Value Actual                         : " + actDepartmentNameTxt+ "     Value Expected : " + expDepartmentNameTxt);
			System.out.println("Code Value Actual                         : " + actDepartmentCodeTxt+ "     Value Expected : " + expDepartmentCodeTxt);

			if (actDepartmentNameTxt.equalsIgnoreCase(expDepartmentNameTxt)
					&& actDepartmentCodeTxt.equalsIgnoreCase(expDepartmentCodeTxt)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 738, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 738, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 738, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }

	}

	  public static boolean checkUpatingNameCodeCurrencyForNewlyCreateDepartment()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkUpatingNameCodeCurrencyForNewlyCreateDepartment *******************************");
		
	    try
	    {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.click();
			nameTxt.clear();
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 742, 6));
			Thread.sleep(2000);
			getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.click();
			codeTxt.clear();
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 743, 6));
			Thread.sleep(2000);
			getAction().moveToElement(codeTxt).sendKeys(Keys.TAB).perform();

			Thread.sleep(3000);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(localCurrencyComboBox));
			localCurrencyComboBox.sendKeys(excelReader.getCellData(xlSheetName, 744, 6));
			Thread.sleep(5000);
			localCurrencyComboBox.sendKeys(Keys.TAB);
			
			/*boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			boolean expSummaryErrorMessage  = true;
			
			System.out.println("Check Any Error Message On Click On New Value Actual  : " + actSummaryErrorMessage + "  Value Expected : "+ expSummaryErrorMessage);
*/

			if (true) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 741, 9, resPass);
				return true;
			} 
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 741, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 741, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  } 

	  public static boolean checkClickOnSaveByUpdatingMasterAndDisplayDepartmentDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkUpatingNameCodeCurrencyForNewlyCreateDepartment *******************************");
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();

			String expMasterSaveMessage = excelReader.getCellData(xlSheetName, 746, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 746, 8, expMasterSaveMessage);
			
			//boolean MasterSave = checkValidationMessageboolean(expMasterSaveMessage);
			/*boolean Mastersave = true;*/

			
			/*String actMasterSave=Boolean.toString(MasterSave);
			String expMasterSave=excelReader.getCellData(xlSheetName, 747, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 747, 8, actMasterSave);
			
			System.out.println("Click on Save                   : " + actMasterSave + "  Value Expected :       " + expMasterSave);
*/
			Thread.sleep(1000);
			
			String actUnitsCreationNameDisplayInGrid = unitsNewCreationNameInFirstRow.getText();
			String expUnitsCreationNameDisplayInGrid = excelReader.getCellData(xlSheetName, 748, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 748, 8, actUnitsCreationNameDisplayInGrid);
			
			System.out.println("Department Created display in Grid        : " + actUnitsCreationNameDisplayInGrid + "     Value Expected : " + expUnitsCreationNameDisplayInGrid);

			if (actUnitsCreationNameDisplayInGrid.equalsIgnoreCase(expUnitsCreationNameDisplayInGrid)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 745, 9, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 745, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 745, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  } 
	  
	  
	  @FindBy(xpath = "//input[@id='liSelectAllMasters']")
	  public static WebElement itemMasterSelect;

	  public static boolean checkDeleteDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
			excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkDeleteItemGroupFromItemMasterPageInGroup *************************");
		
	    try
	    {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterSelect));
			itemMasterSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterSelect));
			itemMasterSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
			unitFirstCheckBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
			masterDeleteBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
			String actGetMsgOnDelete = getMsgOnDelete.getText();
			String expGetMsgOnDelete = excelReader.getCellData(xlSheetName, 750, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 750, 8, actGetMsgOnDelete);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
			clickOnOkInDelete.click();

			String expMasterSaveMessage =  excelReader.getCellData(xlSheetName, 751, 7);
			excelReader.setCellData(xlfile, xlSheetName, 751, 8, expMasterSaveMessage);
			
			/*boolean MasterSave = checkValidationMessageboolean(expMasterSaveMessage);
			boolean Mastersave = true;
			
			String actMasterSave=Boolean.toString(MasterSave);
			*/String expMasterSave=excelReader.getCellData(xlSheetName, 752, 7);
			
			//excelReader.setCellData(xlfile, xlSheetName, 752, 8, actMasterSave);
			
			System.out.println("Item Name Display               : " + actGetMsgOnDelete + " Value Expected :  " + expGetMsgOnDelete);
			//System.out.println("Delete the Master               : " + actMasterSave + "  Value Expected : " + expMasterSave);

			if (actGetMsgOnDelete.equalsIgnoreCase(expGetMsgOnDelete) /*&& actMasterSave.equalsIgnoreCase(expMasterSave)*/)
			{
				excelReader.setCellData(xlfile, xlSheetName, 749, 9, resPass);
				return true;
			} 
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 749, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 749, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }

	  public static boolean checkDeleteMasterDisplayInGroup()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkDeletenMasterDisplayInGroup *************************");
		
	    try
	    {
	   	 ArrayList<String> actmasterDepNameList=new ArrayList<String>();
			
		 int HeaderCount =masterDepNameList.size();
			
		 System.err.println("HeaderCount   :  "+HeaderCount);
			
		 for (int i = 0; i < HeaderCount; i++) 
		 {
			String data=masterDepNameList.get(i).getText();
			actmasterDepNameList.add(data);
		 }
		
		 String actMasterDepNameTextList=actmasterDepNameList.toString();
		 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 754, 7);
			
		 excelReader.setCellData(xlfile, xlSheetName, 754, 8, actMasterDepNameTextList);
		

		 
		/*	String actItemName = unitsNewCreationNameInFirstRow.getText();
			String expItemName = excelReader.getCellData(xlSheetName, 754, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 754, 8, actItemName);
			
			System.out.println("Item Name Display                : " + actItemName + " Value Expected :  " + expItemName);*/

			if (actMasterDepNameTextList.equalsIgnoreCase(expMasterDepNameTextList)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 753, 9, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 753, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 753, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }

	  } 

	  
	  
	  public static boolean checkSaveDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {

		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("******************************** checkInputNameCodeLocalCurrencyFieldsInDepartmentCreationPage ************************************");
			
	    try
	    {
	    	
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			masterNewBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 728, 6));
			Thread.sleep(2000);
			nameTxt.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 729, 6));
			Thread.sleep(2000);
			codeTxt.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(localCurrencyComboBox));
			localCurrencyComboBox.sendKeys(excelReader.getCellData(xlSheetName, 730, 6));
			Thread.sleep(5000);
			localCurrencyComboBox.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 		nameTxt.click();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 		saveBtn.click();

	 		
	        String exWarehouseSaveMessage = excelReader.getCellData(xlSheetName, 879, 7);
	 		
	 		//excelReader.setCellData(xlfile, xlSheetName, 1666, 8, exWarehouseSaveMessage);
	 		
	 		boolean MasterSave = checkValidationMessageboolean(exWarehouseSaveMessage);
	 		
	 		
	 		String actMasterSave= Boolean.toString(MasterSave);
	 		String expMasterSave=excelReader.getCellData(xlSheetName, 880, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 880, 8, actMasterSave.toUpperCase());
	 		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();

			if (actMasterSave.equalsIgnoreCase(expMasterSave)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 727, 9, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 727, 9, resFail);
				return false;
			}
	    }	

		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 727, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	  
	  
	  public static boolean checkCloseDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkCloseDepartmentMaster ********************************");

	    try
	    {
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemCloseBtn));
			itemCloseBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));

			boolean actLoadDashboard          = labelDashboard.isDisplayed();
			boolean actSelectDashboard        = selectDashboard.isDisplayed();
			boolean actNewDashboard           = newAddDashBoard.isDisplayed();
			boolean actDashboardCustomization = dashboardCustomizationSettings.isDisplayed();

			boolean expLoadDashboard          = true;
			boolean expSelectDashboard        = true;
			boolean expNewDashboard           = true;
			boolean expDashboardCustomization = true;

			System.out.println("Load Dashbord Value Actual          : " + actLoadDashboard +         " Value Expected : " + expLoadDashboard);
			System.out.println("Select Dashbord Value Actual        : " + actSelectDashboard +       " Value Expected : " + expSelectDashboard);
			System.out.println("New Dashbord Value Actual           : " + actNewDashboard +          " Value Expected : " + expNewDashboard);
			System.out.println("Dashbord Customization Value Actual : " + actDashboardCustomization+ " Value Expected : " + expDashboardCustomization);

			
			boolean DisplayResult=actLoadDashboard == expLoadDashboard && actSelectDashboard == expSelectDashboard
					                 && actNewDashboard == expNewDashboard && actDashboardCustomization == expDashboardCustomization;
			
			String actDispalyResult=Boolean.toString(DisplayResult);
			String expDispalyResult=excelReader.getCellData(xlSheetName, 756, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 756, 8, actDispalyResult.toUpperCase());
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));

			String actDashboardLabel = labelDashboard.getText();
			String expDashboardLabel = excelReader.getCellData(xlSheetName, 757, 7);

			excelReader.setCellData(xlfile, xlSheetName, 757, 8, actDashboardLabel);
			
			
			System.out.println("Close Button  : " + actDashboardLabel + "  Value Expected : " + expDashboardLabel);
			
			
			if (actDashboardLabel.equalsIgnoreCase(expDashboardLabel) && actDispalyResult.equalsIgnoreCase(expDispalyResult)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 755, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 755, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 755, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	  
	  
	   @FindBy(id = "txtPassword")
	   private static WebElement password;
	   
	   public boolean checkLogoutInDepartmentMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
	

	public SmokeDepartmentPage(WebDriver driver)
	{
		
		 PageFactory.initElements(driver, this);
		
	}

	
}
