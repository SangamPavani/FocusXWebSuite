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

public class SmokeBinsPage extends BaseEngine 
{
 	
     	//Home Menu
		@FindBy (xpath="//*[@id='1']/div/span")
	    public static WebElement homeMenu;
		
	        //Masters Menu	
			@FindBy (xpath="//*[@id='1000']/span")
		    public static WebElement mastersMenu;
			
				 //Bins Menu	
				 @FindBy (xpath="/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[18]/a[1]/span[1]")
				 public static WebElement binsMenu;
			 
					//Bins Title
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
				    @FindBy(xpath="//span[contains(text(),'Bins Properties')]")
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
			 
			/*@FindBy(xpath="//a[contains(text(),'General')]")
			private static WebElement generalTabOpen;//Before Clicking
			*/
				@FindBy(xpath="//input[@id='sName']")
				private static WebElement  nameTxt;
				
				@FindBy(xpath="//input[@id='sCode']")
				private static WebElement codeTxt ;
				
				/*@FindBy(xpath="//input[@id='iCapacity']")
				private static WebElement  capacityTxt;
				
				@FindBy(xpath="//input[@id='fCurrentCapacity']")
				private static WebElement  currentCapacityTxt;
				
				@FindBy(xpath="//select[@id='iType']")
				private static WebElement  typeDropdown;
	
				@FindBy(xpath="//input[@id='iCategory']")
				private static WebElement  categoryTxt;
				
				@FindBy(xpath="//td[@id='iCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
				private static WebElement  categorySettingBtn;
	
				@FindBy(xpath="//input[@id='iDistance']")
				private static WebElement distanceTxt ;
	
				@FindBy(xpath="//select[@id='ibinLevel']")
				private static WebElement  levelTxt;	
				
				@FindBy(xpath="//input[@id='iColNo']")
				private static WebElement colNoTxt ;
	
				@FindBy(xpath="//select[@id='iStorageType']")
				private static WebElement  storageTypeDropdown;
				
				@FindBy(xpath="//input[@id='bHold']")
				private static WebElement holdChkBox;

				@FindBy(xpath="//input[@id='bDamaged']")
				private static WebElement damagedChkBox;
					
				@FindBy(xpath="//textarea[@id='sRemarks']")
				private static WebElement  remarksTxt;*/
					
			@FindBy(xpath="//a[@class='icon-font7 theme_color-inverse']")
			private static WebElement  generalTabToOpen;//After Clicking
			
			/*@FindBy(xpath="//a[contains(text(),'Task Manager')]")
			private static WebElement taskManagerTab;
			*/
			
			/*
				@FindBy(xpath="//input[@id='iEmployee1']")
				private static WebElement  gridEmployeeTxt;
				
				@FindBy(xpath="//select[@id='iPick1']")
				private static WebElement gridPickDropDown ;
				
				@FindBy(xpath="//select[@id='iPut1']")
				private static WebElement  gridPutDropdown;
			
			@FindBy(xpath="//a[contains(text(),'Dimension')]")
			private static WebElement  dimensionTab;
		
				@FindBy(xpath="//input[@id='fLength']")
				private static WebElement  lengthTxt;
				
				@FindBy(xpath="//input[@id='fWidth']")
				private static WebElement widthTxt ;				
				
				@FindBy(xpath="//input[@id='fHeight']")
				private static WebElement  heightTxt;			
				
				@FindBy(xpath="//input[@id='fCBM']")
				private static WebElement  CBMTxt;
				
				@FindBy(xpath="//input[@id='fCurrentLength']")
				private static WebElement  currentLengthTxt;
				
				@FindBy(xpath="//input[@id='fCurrentWidth']")
				private static WebElement  currentWidthTxt;
								
				@FindBy(xpath="//input[@id='fCurrentHeight']")
				private static WebElement  currentHeightTxt;
				
				@FindBy(xpath="//input[@id='FCurrentCBM']")
				private static WebElement  currentCBMTxt;
				
				@FindBy(xpath="//input[@id='fWeight']")
				private static WebElement  weightTxt;
				
				@FindBy(xpath="//input[@id='fMinimumCBM']")
				private static WebElement minimumCBMTxt ;
				
				@FindBy(xpath="//input[@id='fOccupiedWeight']")
				private static WebElement occupiedWeightTxt ;
				
				@FindBy(xpath="//input[@id='fOccupiedCBM']")
				private static WebElement  occupiedCBMTxt;
				
				@FindBy(xpath="//input[@id='bConsiderSize']")
				private static WebElement  considerSizeChkBox;
				
				@FindBy(xpath="//input[@id='bConsiderWeight']")
				private static WebElement  considerWeightChkBox;*/
												
				@FindBy(xpath="//input[@id='iNoOfDecimals']")
				private static WebElement noOfDecimalsTxt;
				
				@FindBy(xpath="//select[@id='iRoundingType']")
				private static WebElement roundingTypeDropdown;
			
			   /* @FindBy(xpath="//select[@id='UnitType']")
				private static WebElement unitTypeDropdown;
			    		    */
			    @FindBy(xpath="//div[@id='divTreeMenu']")
				private static WebElement treeUnitsDisplay;
			    
			   /* @FindBy(xpath="//td[@class='text-center']")
				private static WebElement unitsInMainPageEmpty;*/
			    
			@FindBy(xpath="//*[@id='btnMasterSaveClick']")
			public static WebElement saveBtn;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/button[2]")
			public static WebElement unitSaveBtns;
			
			@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/ul/li[2]/button[1]/i")
			public static WebElement unitSaveBtn;

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
	    
	    @FindBy(xpath="//span[@class='hidden-xs']")
		private static WebElement userNameDisplay;

	    
	   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
		private static WebElement userNameDisplay;*/
	   
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
 		
 		@FindBy(xpath="//*[@id='ulCommonlyUsedRibbon']/li/span")
 		private static List<WebElement> mastersRibbonControlList;
 		
 		@FindBy(xpath ="//*[@id='ulRibbonControl']/li/span")
	 	private static List<WebElement> ribbonControlExpandList;
		
	    private static String xlfile;
		private static String resPass = "Pass";
		private static String resFail = "Fail";
		private static ExcelReader excelReader;
		private static boolean methodReturnStatus;
		private static String xlSheetName = "SmokeMasters";
		private static boolean statusOfValue;
	    private static Alert alert;
	    
	    
	    public boolean checkSignToCheckBinsMastersPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
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
		  

	 
	 //BIN MASTER PAGE STARTS
	   
	   public static boolean checkBinsMasterPageIsDisplayByClickOnBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {
	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("************************************ checkBinsMasterPageIsDisplayByClickOnBinsMenu ********************************************");

	  	try
	  	{
	  		
	  		Thread.sleep(2000);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	  		homeMenu.click();

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	  		mastersMenu.click();

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsMenu));
	  		binsMenu.click();
	  		
	  		
	  		/*boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	  		boolean expSummaryErrorMessage  = true;
	  		
	  		boolean actServerErrorMessage  = checkServerErrorMessageIsNotDisplay();
	  		boolean expServerErrorMessage  = false;
	  		
	  		System.out.println("Opening UnitsConversion Error Message Value Actual : " + actSummaryErrorMessage +  " Value Expected : " + expSummaryErrorMessage);
	  		System.out.println("Opening UnitsConversion Error Message              : " + actServerErrorMessage +   " Value Expected : " +  expServerErrorMessage);*/
	  		
	  		
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));

	  		String actUnitsTitle = accountsTitle.getText();
	  		String expUnitsTitle = excelReader.getCellData(xlSheetName, 760, 7	);

	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 760, 8, actUnitsTitle);
	  		
	  		System.out.println("Opening Units Master From Item Menu Title Actual Value  :" + actUnitsTitle + "     Expected Value    : " + expUnitsTitle);

	  		if (actUnitsTitle.equalsIgnoreCase(expUnitsTitle)) 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 759, 9, resPass);
	  			return true;
	  		}
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 759, 9, resFail);
	  			return false;
	  		}
	  	}
	  	catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 759, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		  return false;
	 	  }
	   }
	    
	 
	   @FindBy(xpath = "//*[@id='ulCommonlyUsedRibbon']/li/span")
	   private static List<WebElement> itemRibbonControlList;
	   
	   public static boolean checkMainOptionsAvailabilityInBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		 
	  	 System.out.println("************ checkMainOptionsAvailabilityInBinsMasterPage Method Executes............ *********************");

	  	 try
	  	 {  		 
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));

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
	  			
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));

	 		
	         Set<String> actRibbonControl= new HashSet<String>();
	 		
	 		int count = itemRibbonControlList.size();
	 		
	 		System.err.println(" Ribbon :   "+count);
	 		
	 		for (int i=1;i<count;i++)
	 		{
	 			String data=itemRibbonControlList.get(i).getText();
	 			actRibbonControl.add(data);
	 		}
	 		
	 		String actBinsRibbon = actRibbonControl.toString();
	 		
	 		String expBinsRibbon = excelReader.getCellData(xlSheetName, 762, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 762, 8, actBinsRibbon);
	 		
	 		System.out.println("actItemRibbon  : "+actBinsRibbon);
	 		System.out.println("expItemRibbon  : "+expBinsRibbon);
	  		
	  		
	  		if (actBinsRibbon.equalsIgnoreCase(expBinsRibbon) && actAccountMasterNewBtn == expAccountMasterNewBtn
	  				&& actAccountMasterAddGroupBtn == expAccountMasterAddGroupBtn
	  				&& actAccountMasterEditBtn == expAccountMasterEditBtn
	  				&& actAccountMasterCloneBtn == expAccountMasterCloneBtn
	  				&& actAccountMasterPropertiesBtn == actAccountMasterPropertiesBtn
	  				&& actAccountMasterDeleteBtn == expAccountMasterDeleteBtn
	  				&& actAccountMasterCloseBtn == expAccountMasterCloseBtn
	  				&& actAccountMasterExpandBtn == expAccountMasterExpandBtn)
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 761, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 761, 9, resFail);
	  			return false;
	  		}
	  	  }
	  	catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 761, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 		  return false;
	 	  }
	    }

	   
		@FindBy(xpath ="//*[@id='ulRibbonControl']/li/span/i/parent::span")
		private static List<WebElement> itemRibbonControlExpandList;
	   
	   public static boolean checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		  
	  	 System.out.println("*********** checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInBinsMastersPage Method Executes............*******************");

	  	 try
	  	 {
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));
	  		masterRibbonToExpandOptions.click();

	  		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	  		boolean expSummaryErrorMessage  = true;
	  		
	         System.out.println("Click On Ribbon Expand Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	  		
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
	 	 	
	 		 String expItemRibbonExpand = "[Group, Delete All, Close Bins, Open Close Bins, Advance Master Import/Export, Auth Info, Move Up, Move Down, Sort, Mass Update, Export Format To XML, Customize Master, Customize View, Customize Tree, Print Label, Print]";
	 		
	 		 excelReader.setCellData(xlfile, xlSheetName, 764, 8, actItemRibbonExpand);
	 		
	 		 System.out.println("actItemRibbonExpand   : "+actItemRibbonExpand);
	 		
	 		 System.out.println("expItemRibbonExpand   : "+expItemRibbonExpand);	
	  		
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
	  				&& actAccountMasterExportFormatToXMLBtn == expAccountMasterExportFormatToXMLBtn 
	  				&& actItemRibbonExpand.equalsIgnoreCase(expItemRibbonExpand))
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 763, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 763, 9, resFail);
	  			return false;
	  		}
	  	  }
	  	catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 763, 10, e.getMessage());
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	    }
	  
	   
	   @FindBy(xpath = "//i[@class='icon-font6 icon-custamize']")
	   public static WebElement masterCustamizeMasterBtn;
	   
	   public static boolean checkOtherToolsOptionsAvailabilityInBinsMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		  
	  	 System.out.println("********* checkOtherToolsOptionsAvailabilityInBinsMastersPageOnClickRibbonControlNextButton Method Executes............  *******************");

	  	 try
	  	 {
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
	         masterRibbonControlNextBtn.click();
	  		
	  		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	  		boolean expSummaryErrorMessage  = true;
	  		
	         System.out.println("Click On Ribbon Control Next Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	  	
	  		masterRibbonControlNextBtn.click();
	  		masterRibbonControlNextBtn.click();
	  		/*masterRibbonControlNextBtn.click();
	  		masterRibbonControlNextBtn.click();
	  		masterRibbonControlNextBtn.click();
	  		masterRibbonControlNextBtn.click();
	  		masterRibbonControlNextBtn.click();*/

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

	  		ArrayList<String> actRibbonControlExpandList= new ArrayList<String>();
	 		
	 	 	 int count = itemRibbonControlExpandList.size();
	 		
	 		 System.err.println("count   :"+count);
	 		
	 		 for (int i=0;i<count;i++)
	 		 {
	 			String data=itemRibbonControlExpandList.get(i).getText();
	 			actRibbonControlExpandList.add(data);
	 		 }
	 		
	 		 String actItemRibbonExpand = actRibbonControlExpandList.toString();
	 	 	
	 		 String expItemRibbonExpand = "[, , , , Advance Master Import/Export, Auth Info, Move Up, Move Down, Sort, Mass Update, Export Format To XML, Customize Master, Customize View, Customize Tree, Print Label, Print]";
	 		
	 		 excelReader.setCellData(xlfile, xlSheetName, 766, 8, actItemRibbonExpand);
	 		
	 		 System.out.println("actItemRibbonExpand   : "+actItemRibbonExpand);
	 		
	 		 System.out.println("expItemRibbonExpand   : "+expItemRibbonExpand);	
	  		
	  		
	 		 boolean displayResult=actSummaryErrorMessage==expSummaryErrorMessage 
	 					 				&& actAccountMasterCustomizeMasterBtn == expAccountMasterCustomizeMasterBtn
	 					 				&& actAccountMasterCustomizeViewBtn == expAccountMasterCustomizeViewBtn
	 					 				&& actAccountMasterCustomizeTreeBtn == expAccountMasterCustomizeTreeBtn;
	 		 
	 		 String actDisplayResult=Boolean.toString(displayResult);
	 		 String expDispalyResult=excelReader.getCellData(xlSheetName, 767, 7);
	 		 
	 				
	 		 excelReader.setCellData(xlfile, xlSheetName, 767, 8, actDisplayResult.toUpperCase());
	 				 
	 		 
	  		if (actItemRibbonExpand.equalsIgnoreCase(expItemRibbonExpand) && 
	  				actDisplayResult.equalsIgnoreCase(expDispalyResult))
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 765, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 765, 9, resFail);
	  			return false;
	  		}
	  	  }

	  	catch (Exception e) 
	  	  {
	  		  String exception =e.getMessage();
	  		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 765, 10, exception);
	  		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	  		  return false;
	  	  }
	    }
	  	
	   

	   public static boolean checkTreeViewOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		  
	  	 System.out.println("***********  checkTreeViewOptionsAvailableInBinsMastersPage Method Executes............ ********************");
	  	 
	  	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));

	 		boolean actAccountMasterTreeIdDropdownIsDisplay                 = masterTreeIdDropdown.isDisplayed();
	 		
	 		Select MasterId=new Select(masterTreeIdDropdown);
	 		String actAccountMasterTreeIdDropdownGetText                    = MasterId.getFirstSelectedOption().getText();
	 		
	 		boolean actAccountMasterTreeIDToggleBtnIsDisplay                = masterTreeIDToggleBtn.isDisplayed();
	 		boolean actAccountMasterTreeViewIDDropdownIsDisplay             = masterTreeViewIDDropdown.isDisplayed();
	 		
	 		Select MasterTreeViewId=new Select(masterTreeViewIDDropdown);
	 		String actAccountMasterTreeViewIDDropdownGetText                = MasterTreeViewId.getFirstSelectedOption().getText();
	 		
	 		boolean actAccountMasterTreeViewIDToggleBtnIsDisplay            = masterTreeViewIDToggleBtn.isDisplayed();
	 		boolean actAccountMasterHideAccountsGroupTreeIsDisplay          = masterOptionToHideAccountsGroupTree.isDisplayed();

	 		boolean expAccountMasterTreeIdDropdownIsDisplay                 = true;
	 		String expAccountMasterTreeIdDropdownGetText                    = excelReader.getCellData(xlSheetName, 769, 7);
	 		                                                        
	 		boolean expAccountMasterTreeIDToggleBtnIsDisplay                = true;
	 		boolean expAccountMasterTreeViewIDDropdownIsDisplay             = true;
	 		String expAccountMasterTreeViewIDDropdownGetText                = excelReader.getCellData(xlSheetName, 770, 7);
	 		
	 		boolean expAccountMasterTreeViewIDToggleBtnIsDisplay            = true;
	 		boolean expAccountMasterHideAccountsGroupTreeIsDisplay          = true;
	 		

	 		System.out.println("Tree ID Dropdown Option Value Actual      : " +actAccountMasterTreeIdDropdownIsDisplay    +" Value Expected : " + expAccountMasterTreeIdDropdownIsDisplay);
	 		System.out.println("Tree ID Dropdown Option Value Actual      : " +actAccountMasterTreeIdDropdownGetText      +" Value Expected : " + expAccountMasterTreeIdDropdownGetText);
	 		
	 		System.out.println("Tree ID Toggle Option Value Actual        : " +actAccountMasterTreeIDToggleBtnIsDisplay   +" Value Expected : " + expAccountMasterTreeIDToggleBtnIsDisplay);
	 	
	 		
	 		System.out.println("Tree View ID Option Value Actual          : " +actAccountMasterTreeViewIDDropdownIsDisplay +" Value Expected : " + expAccountMasterTreeViewIDDropdownIsDisplay);
	 		System.out.println("Tree View ID Option Value Actual          : " +actAccountMasterTreeViewIDDropdownGetText   +" Value Expected : " + expAccountMasterTreeViewIDDropdownGetText);
	 		
	 		System.out.println("Tree View ID Toggle Value Actual          : " +actAccountMasterTreeViewIDToggleBtnIsDisplay +" Value Expected : " + expAccountMasterTreeViewIDToggleBtnIsDisplay);
	 		
	 		
	 		System.out.println("Hide Accounts Group Tree Value Actual     : " +actAccountMasterHideAccountsGroupTreeIsDisplay+" Value Expected : " + expAccountMasterHideAccountsGroupTreeIsDisplay);
	 		
	         excelReader.setCellData(xlfile, xlSheetName, 769, 8, actAccountMasterTreeIdDropdownGetText);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 770, 8, actAccountMasterTreeViewIDDropdownGetText);
	 		
	 		
	 		if ( actAccountMasterTreeIdDropdownIsDisplay == expAccountMasterTreeIdDropdownIsDisplay
	 				&& actAccountMasterTreeIDToggleBtnIsDisplay == expAccountMasterTreeIDToggleBtnIsDisplay
	 				&& actAccountMasterTreeViewIDDropdownIsDisplay == expAccountMasterTreeViewIDDropdownIsDisplay
	 				&& actAccountMasterTreeViewIDToggleBtnIsDisplay == expAccountMasterTreeViewIDToggleBtnIsDisplay
	 				&& actAccountMasterHideAccountsGroupTreeIsDisplay == expAccountMasterHideAccountsGroupTreeIsDisplay && 
	 				
	 				actAccountMasterTreeIdDropdownGetText.equalsIgnoreCase(expAccountMasterTreeIdDropdownGetText) && 
	 				 
	 				actAccountMasterTreeViewIDDropdownGetText.equalsIgnoreCase(expAccountMasterTreeViewIDDropdownGetText))
	 				 
	 				
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 768, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 768, 9, resFail);
	 			return false;
	 		}
	 	  }
	 	 catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 768, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	   }
	  	
	   @FindBy(xpath = "//*[@id='10']/a[2]")
	   private static WebElement localBinOneGroupDisplayInTree;
	   
	   @FindBy(xpath = "//*[@id='7']/a[2]")
	   private static WebElement localBinTwoGroupDisplayInTree;
	   
	   @FindBy(xpath = "//*[@id='6']/a[2]")
	   private static WebElement warehouseGroupDisplayInTree;
	   
	   @FindBy(xpath = "//*[@id='tree2']/li//a[2]")
	   private static List<WebElement> leftPannelList;
	   
	   @FindBy(xpath = "//*[@id='0']/a")
	   private static WebElement accountRootAccount;

	   
	   public static boolean checkDisplayOfGroupAvailableTreeStructureLeftPageBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		  
	  	 System.out.println("**************************  checkDisplayOfGroupAvailableTreeStructureLeftPageBinsMasterPage Method Executes............  *******************************");
	      
	  	 try
	  	 {
	  		 
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));
	  
	  		boolean actBinsMasterRoot                 = accountRootAccount.isDisplayed();
	  		/*boolean actBinGroupOneMasterRoot          = localBinOneGroupDisplayInTree.isDisplayed();
	  		boolean actBinGroupTwoMasterRoot          = localBinTwoGroupDisplayInTree.isDisplayed();
	  		*/
	  		boolean expBinsMasterRoot                 = true;
	  	/*	boolean expBinGroupOneMasterRoot          = true;
	  		boolean expBinGroupTwoMasterRoot          = true;
	  		*/
	  		System.out.println("Bins Root Is Display Value Actual        : " + actBinsMasterRoot+        " Value Expected : " + expBinsMasterRoot);
	  		/*System.out.println("Root Bins Group One Display Value Actual : " + actBinGroupOneMasterRoot+ " Value Expected : " + expBinGroupOneMasterRoot);
	  		System.out.println("Root Bins Group Two Display Value Actual : " + actBinGroupTwoMasterRoot+ " Value Expected : " + expBinGroupTwoMasterRoot);
	  		*/
	  		String actBinsRootName                    = accountRootAccount.getText();
	  		String expBinsRootName                    = excelReader.getCellData(xlSheetName, 772, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 772, 8, actBinsRootName);
	  		
	  	/*	ArrayList<String> actleftPannelList= new ArrayList<String>();
	 		
	 	 	 int count = leftPannelList.size();
	 		
	 		 System.err.println("count   :"+count);
	 		
	 		 for (int i=0;i<count;i++)
	 		 {
	 			String data=leftPannelList.get(i).getText();
	 			actleftPannelList.add(data);
	 		 }
	 		
	 		 String actleftPannelElements = actleftPannelList.toString();
	 	 	
	 		 String expleftPannelElements = excelReader.getCellData(xlSheetName, 773, 7);
	 		
	 		 excelReader.setCellData(xlfile, xlSheetName, 773, 8, actleftPannelElements);
	 		
	 		 System.out.println("actleftPannelElements   : "+actleftPannelElements);
	 		
	 		 System.out.println("expleftPannelElements   : "+expleftPannelElements);	
	  		*/
	  		
	         boolean DisplayResult=actBinsMasterRoot == expBinsMasterRoot /*&& actBinGroupOneMasterRoot==expBinGroupOneMasterRoot
	  				                              && actBinGroupTwoMasterRoot==expBinGroupTwoMasterRoot*/
	  				                              && actBinsRootName.equalsIgnoreCase(expBinsRootName);
	         
	         String actDisplayResult=Boolean.toString(DisplayResult);
	         String expDisplayResult=excelReader.getCellData(xlSheetName, 774, 7);
	  		
	         excelReader.setCellData(xlfile, xlSheetName, 774, 8, actDisplayResult.toUpperCase());
	  		
	  		
	  			
	  		if (actDisplayResult.equalsIgnoreCase(expDisplayResult) /*&& actleftPannelElements.equalsIgnoreCase(expleftPannelElements)
	  				&& actBinsRootName.equalsIgnoreCase(expBinsRootName)*/)
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 771, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 771, 9, resFail);
	  			return false;
	  		}
	  	  }
	  	  catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 771, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	    }


	   @FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li")
	   private static List<WebElement> mastertreeIdList;
	   
	   public static boolean checkCreateTreeToggleOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	 
	  	 System.out.println("********************* checkCreateTreeToggleOptionsAvailableInBinsMastersPage Method Executes............ *******************************");
	      
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
	 			String expMasterIDExpand = excelReader.getCellData(xlSheetName, 776, 7);
	 			
	 			excelReader.setCellData(xlfile, xlSheetName, 776, 8, actMasterIDExpand);
	 			
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
	 	 		 
	 	 		
	 	 		
	 	 		if ( actAccountMasterTreeCreateTreeBtn == expAccountMasterTreeCreateTreeBtn
	 	 				&& actAccountMasterTreeEditBtn == expAccountMasterTreeEditBtn
	 	 				&& actAccountMasterTreeDeleteBtn == expAccountMasterTreeDeleteBtn
	 	 				&& actAccountMasterTreeSetDefaultBtn==expAccountMasterTreeSetDefaultBtn && actMasterIDExpand.equalsIgnoreCase(expMasterIDExpand))
	 	 		{
	 	 			excelReader.setCellData(xlfile, xlSheetName, 775, 9, resPass);
	 	 			return true;
	 	 		} 
	 	 		else 
	 	 		{
	 	 			excelReader.setCellData(xlfile, xlSheetName, 775, 9, resFail);
	 	 			return false;
	 	 		}
	 	 	  }
	 	 	 catch (Exception e) 
	 		  {
	 			  String exception =e.getMessage();
	 			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 775, 10, exception);
	 			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 			  return false;
	 		  }
	   }
	   
	  	
	   @FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li")
	   private static List<WebElement> mastertreeViewIdList;
	   
		@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[2]/a")
		public static WebElement masterTreeeViewIdEditBtn;

		@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[3]/a")
		public static WebElement masterTreeViewIdDeleteBtn;

	   
	   public static boolean checkCreateViewToggleOptionsAvailableBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		  
	  	 System.out.println("********************** checkCreateViewToggleOptionsAvailableBinsMastersPage Method Executes............***********************************");

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
	 		String expMasterViewIDExpand = excelReader.getCellData(xlSheetName, 778, 7);
	 		
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

	 		excelReader.setCellData(xlfile, xlSheetName, 778, 8, actMasterViewIDExpand);
	 		
	 		if (actAccountMasterTreeViewCreateViewBtn == expAccountMasterTreeViewCreateViewBtn
	 				&& actAccountMasterTreeViewEditViewBtn == expAccountMasterTreeViewEditViewBtn
	 				&& actAccountMasterTreeViewDeleteBtn == expAccountMasterTreeViewDeleteBtn && 
	 				
	 				actMasterViewIDExpand.equalsIgnoreCase(expMasterViewIDExpand))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 777, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 777, 9, resPass);
	 			return false;
	 		}
	 	  }
	 	  catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 777, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	  }
	  	
	  	
	   public static boolean checkHideUnitGroupOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		  
	  	 System.out.println("********************* checkHideUnitGroupOptionsAvailableInBinsMastersPage Method Executes............*************************");

	  	 try
	  	 {
	  	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
	  	   masterOptionToHideAccountsGroupTree.click();
	  	   
	  	   boolean actSummaryErrorMessage    = checkErrorMessageIsDisplayingOrNotDisplaying();
	  	   boolean expSummaryErrorMessage    = true;

	  	   System.out.println("Click on Hide Units Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);  

	  	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeUnitsDisplay));

	  	   boolean actAccountMasterTreeUnits = treeUnitsDisplay.isDisplayed();
	  	   boolean expAccountMasterTreeUnits = true;
	  		
	  	   System.out.println("Tree View Create View Option Value Actual : " + actAccountMasterTreeUnits+ " Value Expected : " + expAccountMasterTreeUnits);

	  	   boolean actTestResult=actSummaryErrorMessage==actSummaryErrorMessage 
	  			                  && actSummaryErrorMessage == expAccountMasterTreeUnits && masterOptionToHideAccountsGroupTree.isDisplayed()==true;
	  	   
	  	   String actValue = Boolean.toString(actTestResult);
	  	   String expValue = excelReader.getCellData(xlSheetName, 779, 7);
	  	   
	  	   System.err.println(" Actual; Value : "+actValue +"  Value Expected : "+expValue);
	  	  
	  	   
	  	  excelReader.setCellData(xlfile, xlSheetName, 779, 8, actValue);
	  	  
	  	   if (actValue.equalsIgnoreCase(expValue))
	  	   {
	  		    excelReader.setCellData(xlfile, xlSheetName, 779, 9, resPass);
	  			return true;
	  	   } 
	  	   else 
	  	   {
	  		  excelReader.setCellData(xlfile, xlSheetName, 779, 9, resFail);
	  			return false;
	  	   }
	  	 }
	  	 catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 779, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	   }
	  	
	  	
	   public static boolean checkUnHideUnitsGroupOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
	 		
	 		String expUnitRootName=excelReader.getCellData(xlSheetName, 781, 7);	

	 		System.out.println("Open Units Master Unit Root Is Display Value Actual  : " + actUnitsMasterRoot+ " Value Expected : " + expUnitsMasterRoot);
	 		System.out.println("Root Units Text Display Value Actual          : " + actUnitRootName+            " Value Expected : " + expUnitRootName);
	 			
	 		excelReader.setCellData(xlfile, xlSheetName, 781, 8, actUnitRootName);
	 		
	 		if (actUnitsMasterRoot == expUnitsMasterRoot
	 				&& actUnitRootName.equalsIgnoreCase(expUnitRootName))
	 		{
	 			 excelReader.setCellData(xlfile, xlSheetName, 780, 9, resPass);
	 			 return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 780, 9, resFail);
	 			return false;
	 		}
	 	  }
	  	 catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 780, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	 	   
	  	 }
	  	 

	 	
	   @FindBy(xpath="//*[@id='divSearchControls']/div//div/a")
	   private static List<WebElement> masterItemSearchControlList;
	  	
		@FindBy(xpath = "//*[@id='cmbUserTypeMaster_input_settings']/span")
		public static WebElement masterCumMasterSettingBtn;
		
	   public static boolean checkHeaderFieldsOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		  
	  	 System.out.println("********************** checkHeaderFieldsOptionsAvailableInBinsMastersPage Method Executes............ **********************************");

	  	 
	  	 
	 	 try
	  	 {
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));

	  		
	  		String actAccountMasterSearchGetText               = masterSearchTxt.getAttribute("placeholder");
	  		
	  		String expAccountMasterSearchGetText               = excelReader.getCellData(xlSheetName, 782, 7);
	  		
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 782, 8, actAccountMasterSearchGetText);
	  		
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
	   		String expControlList = excelReader.getCellData(xlSheetName, 783, 7);
	   		
	   		System.out.println("actControlList   : "+actControlList);
	   		System.out.println("expControlList   : "+expControlList);

	   		excelReader.setCellData(xlfile, xlSheetName, 783, 8, actControlList);
	   		
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
	  		String expDispalyResult=excelReader.getCellData(xlSheetName, 784, 7);	
	  		
	  		System.err.println("DispalyResult  "+actDispalyResult +" Value Expected : "+expDispalyResult);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 784, 8, actDispalyResult.toUpperCase());
	  		
	  		
	  		if(actDispalyResult.equalsIgnoreCase(expDispalyResult) && actControlList.equalsIgnoreCase(expControlList) 
	  				&& actAccountMasterSearchGetText.equalsIgnoreCase(expAccountMasterSearchGetText)) 	
	  		{
	  			 excelReader.setCellData(xlfile, xlSheetName, 782, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			 excelReader.setCellData(xlfile, xlSheetName, 782, 9, resFail);
	  			return false;
	  		}
	  	 }
	  	 catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 782, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	  }
	  	 
		
	   @FindBy(xpath="//*[@id='btnSearchAcc']/ol/li")
	   private static List<WebElement> masterSearchList; 
	  	
	   public static boolean checkSearchOptionAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		  
	  	 System.out.println("*************************** checkSearchOptionAvailableInBinsMastersPage Method Executes............ ********************************");
	  	 
	 	 try
	  	 {
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));
	  		masterSearchBtn.click();

	  		boolean actSummaryErrorMessage                      = checkErrorMessageIsDisplayingOrNotDisplaying();
	  		boolean expSummaryErrorMessage                      = true;

	  		System.out.println("Click on Search Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	  		
	         ArrayList<String> actmasterSearchList= new ArrayList<String>();
	  		
	   		int count = masterSearchList.size();
	   		System.err.println("count   :"+count);
	   		
	   		for (int i=0;i<count;i++)
	   		{
	   			String data=masterSearchList.get(i).getText();
	   			actmasterSearchList.add(data);
	   		}
	   		
	   		String actSearchList = actmasterSearchList.toString();
	   		String expSearchList = excelReader.getCellData(xlSheetName, 785, 7);
	   		
	   		System.out.println("actSearchList   : "+actSearchList);
	   		System.out.println("expSearchList   : "+expSearchList);
	  		
	   		excelReader.setCellData(xlfile, xlSheetName, 785, 8, actSearchList);
	   		
	  		if (actSearchList.equalsIgnoreCase(expSearchList) && actSummaryErrorMessage==expSummaryErrorMessage)
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 785, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			 excelReader.setCellData(xlfile, xlSheetName, 785, 9, resFail);
	  			return false;
	  		}
	  	 }
	  	catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 785, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	   }
	  	 
	  	 
		@FindBy(xpath = "//th[2]//span[1]")
		public static WebElement masterGrid_Header_SelectTxt;

		@FindBy(xpath = "//input[@id='liSelectAllMasters']")
		public static WebElement masterGridHeader_SelectAllRowsCheckBox;

		@FindBy(xpath = "//section[@id='page_Content']//th[3]")
		public static WebElement masterGridHeader_MasterId;

		@FindBy(xpath = "//section[@id='page_Content']//th[4]]")
		public static WebElement masterGridHeader_Name;
		
		
		@FindBy(xpath = "//*[@id='landgridData']/thead/tr/th[2]")
		public static WebElement masterItemGridHeader_SelectAll;

		@FindBy(xpath = "//*[@id='landgridData']/thead/tr/th[3]")
		public static WebElement masterItemGridHeader_MasterId;

		@FindBy(xpath = "//*[@id='landgridData']/thead/tr/th[4]")
		public static WebElement masterItemGridHeader_Name;
		
		@FindBy(xpath = "//*[@id='landgridData']/thead/tr/th[5]")
		public static WebElement masterItemGridHeader_Code;
		
		@FindBy(xpath ="//*[@id='landgridData']/thead/tr/th")
		public static List<WebElement> masterItemHeaderList;
	  	
	   public static boolean checkBinsMastersDisplayTableColumnNamesAvailableInBinstMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		  		 
	  	 System.out.println("************************* checkBinsMastersDisplayTableColumnNamesAvailableInBinstMastersPage Method Executes............ *************************");
	  		
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
	  		 String expMasterItemHeaderTextList=excelReader.getCellData(xlSheetName, 786, 7);
	  		
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 786, 8, actMasterItemHeaderTextList);
	  		
	  		if (/*actSummaryErrorMessage==expSummaryErrorMessage &&*/ actMasterItemHeaderTextList.equalsIgnoreCase(expMasterItemHeaderTextList))
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 786, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 786, 9, resFail);
	  			return false;
	  		}
	  	 }
	  	 catch (Exception e) 
	  	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 786, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	   }
	  	 
	  	 
	  	 

		@FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[12]")
		public static List<WebElement> masterItemNameList;

		@FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[13]")
		public static List<WebElement> masterItemCodeList;
	  

		
		@FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[10]")
		public static List<WebElement> masterDepNameList;
		
		@FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[11]")
		public static List<WebElement> masterDepCodeList;


	   public static boolean checkBinsMastersDisplayTableColumnValuesAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	     excelReader=new ExcelReader(POJOUtility.getExcelPath());
	     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		  		 
	     System.out.println("********************** checkBinsMastersDisplayTableColumnValuesAvailableInBinsMastersPage Method Executes............ **************************");
	  	
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
	  		 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 788, 7);
	  		
	  		 excelReader.setCellData(xlfile, xlSheetName, 788, 8, actMasterDepNameTextList);
	     	
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
	  		String expMasterDepCodeTextList=excelReader.getCellData(xlSheetName, 789, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 789, 8, actMasterDepCodeTextList);
	     	
	     	System.err.println("  Actual MasterItemDepCodeTextList : "+actMasterDepCodeTextList);
	     	System.err.println("  Expected  MasterDepCodeTextList : "+expMasterDepNameTextList);
	     	
	     	if(actMasterDepNameTextList.equalsIgnoreCase(expMasterDepNameTextList) && 
	     			actMasterDepCodeTextList.equalsIgnoreCase(expMasterDepCodeTextList))
	     	
	  	 {
	     		excelReader.setCellData(xlfile, xlSheetName, 787, 9, resPass);
	  		return true;
	  	 } 
	  	 else 
	  	 {
	  		excelReader.setCellData(xlfile, xlSheetName, 787, 9, resFail);
	  		return false;
	  	 }
	     }
	     catch (Exception e) 
	  	  {
	  		  String exception =e.getMessage();
	  		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 787, 10, exception);
	  		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	  		  return false;
	  	  }
	   }
	     
	     
	    
	   
	     @FindBy(xpath = "//a[contains(text(),'General')]")
	 	private static WebElement generalTabOpen;// Before Clicking

	 	@FindBy(xpath = "//input[@id='iCapacity']")
	 	private static WebElement capacityTxt;

	 	@FindBy(xpath = "//input[@id='fCurrentCapacity']")
	 	private static WebElement currentCapacityTxt;

	 	@FindBy(xpath = "//select[@id='iType']")
	 	private static WebElement typeDropdown;

	 	@FindBy(xpath = "//input[@id='iCategory']")
	 	private static WebElement categoryTxt;

	 	@FindBy(xpath = "//td[@id='iCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	 	private static WebElement categorySettingBtn;

	 	@FindBy(xpath = "//input[@id='iDistance']")
	 	private static WebElement distanceTxt;

	 	@FindBy(xpath = "//*[@id='ibinLevel']")
	 	private static WebElement levelTxt;

	 	@FindBy(xpath = "//input[@id='iColNo']")
	 	private static WebElement colNoTxt;

	 	@FindBy(xpath = "//select[@id='iStorageType']")
	 	private static WebElement storageTypeDropdown;

	 	@FindBy(xpath = "//input[@id='bHold']")
	 	private static WebElement holdChkBox;

	 	@FindBy(xpath = "//input[@id='bDamaged']")
	 	private static WebElement damagedChkBox;

	 	@FindBy(xpath = "//textarea[@id='sRemarks']")
	 	private static WebElement remarksTxt;

	 	@FindBy(xpath = "//a[contains(text(),'Task Manager')]")
	 	private static WebElement taskManagerTab;

	 	@FindBy(xpath = "//input[@id='iEmployee1']")
	 	private static WebElement gridEmployeeTxt;

	 	@FindBy(xpath = "//select[@id='iPick1']")
	 	private static WebElement gridPickDropDown;

	 	@FindBy(xpath = "//select[@id='iPut1']")
	 	private static WebElement gridPutDropdown;

	 	@FindBy(xpath = "//a[contains(text(),'Dimension')]")
	 	private static WebElement dimensionTab;

	 	@FindBy(xpath = "//input[@id='fLength']")
	 	private static WebElement lengthTxt;

	 	@FindBy(xpath = "//input[@id='fWidth']")
	 	private static WebElement widthTxt;

	 	@FindBy(xpath = "//input[@id='fHeight']")
	 	private static WebElement heightTxt;

	 	@FindBy(xpath = "//input[@id='fCBM']")
	 	private static WebElement CBMTxt;

	 	@FindBy(xpath = "//input[@id='fCurrentLength']")
	 	private static WebElement currentLengthTxt;

	 	@FindBy(xpath = "//input[@id='fCurrentWidth']")
	 	private static WebElement currentWidthTxt;

	 	@FindBy(xpath = "//input[@id='fCurrentHeight']")
	 	private static WebElement currentHeightTxt;

	 	@FindBy(xpath = "//input[@id='FCurrentCBM']")
	 	private static WebElement currentCBMTxt;

	 	@FindBy(xpath = "//input[@id='fWeight']")
	 	private static WebElement weightTxt;

	 	@FindBy(xpath = "//select[@id='iType']")
	 	private static WebElement selectLevelTxt;
	 	
	 	@FindBy(xpath = "//input[@id='fMinimumCBM']")
	 	private static WebElement minimumCBMTxt;

	 	@FindBy(xpath = "//input[@id='fOccupiedWeight']")
	 	private static WebElement occupiedWeightTxt;

	 	@FindBy(xpath = "//input[@id='fOccupiedCBM']")
	 	private static WebElement occupiedCBMTxt;

	 	@FindBy(xpath = "//input[@id='bConsiderSize']")
	 	private static WebElement considerSizeChkBox;

	 	@FindBy(xpath = "//input[@id='bConsiderWeight']")
	 	private static WebElement considerWeightChkBox;

	 	@FindBy(xpath = "//select[@id='UnitType']")
	 	private static WebElement unitTypeDropdown;

	 	@FindBy(xpath = "//td[@class='text-center']")
	 	private static WebElement unitsInMainPageEmpty;

	 	  @FindBy(xpath = "//*[@id='iCurrencyId']")
	 	  private static WebElement localCurrencyComboBox;

	 	  @FindBy(xpath = "//*[@id='newMasterDiv0']/div/div/div/label/a")
	 	  private static List<WebElement> depNewScreenBodyList;
	 	  
	 	  @FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div/div/div/ul/li/button")
	 	  private static List<WebElement> depNewScreenHeaderList;
	 	
	 	
	   public static boolean checkClickOnNewButtonInBinGroups() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("**************************************** checkClickOnNewButtonInBinsMasterPage  ***********************************************");

	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	 		masterNewBtn.click();
	 		
	 		boolean actClickOnNewBtnErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	  		boolean expClickOnNewBtnErrorMessage  = true;
	  		
	  		
	         
	  		ArrayList<String> actdepNewScreenBodyList=new ArrayList<String>();
	 		
	 		int BodyList =depNewScreenBodyList.size();
	 		
	 		System.err.println("BodyList   :  "+BodyList);
	 		
	 		for (int i = 0; i < BodyList; i++) 
	 		{
	 			String data=depNewScreenBodyList.get(i).getText();
	 			actdepNewScreenBodyList.add(data);
	 		}
	 		
	 	
	 		String actBinsNewScreenBodyText=actdepNewScreenBodyList.toString();
	 		String expBinsNewScreenBodyText=excelReader.getCellData(xlSheetName, 791, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 791, 8, actBinsNewScreenBodyText);
	 		
	 		System.out.println("actBinsNewScreenBodyText        :"+actBinsNewScreenBodyText);
	 		System.out.println("expBinsNewScreenBodyText        :"+expBinsNewScreenBodyText);
	 		
	 		
	 		ArrayList<String> actdepNewScreenHeaderList=new ArrayList<String>();
	 			
	 		int HeaderList =depNewScreenHeaderList.size();
	 		
	 		System.err.println("HeaderList   :  "+HeaderList);
	 		
	 		for (int i = 0; i < HeaderList; i++) 
	 		{
	 			String data=depNewScreenHeaderList.get(i).getText();
	 			actdepNewScreenHeaderList.add(data);
	 		}
	 		
	 	
	 		String actBinsNewScreenHeaderText=actdepNewScreenHeaderList.toString();
	 		String expBinsNewScreenHeaderText=excelReader.getCellData(xlSheetName, 792, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 792, 8, actBinsNewScreenHeaderText);

	 		System.out.println("actBinsNewScreenHeaderText        :"+actBinsNewScreenHeaderText);
	 		System.out.println("expBinsNewScreenHeaderText        :"+expBinsNewScreenHeaderText);
	  		
	  		
	         System.out.println("Click On New Button Is Any Error Message Value Actual : " + actClickOnNewBtnErrorMessage + " Value Expected : " + expClickOnNewBtnErrorMessage);
	  	
	 		boolean actMasterName                 = nameTxt.getText().isEmpty();
	 		boolean actMasterCode                 = codeTxt.getText().isEmpty();
	 		boolean actMasterCapacity             = capacityTxt.isDisplayed();
	 		boolean actMasterCurrentMaster        = currentCapacityTxt.isDisplayed();
	 		boolean actMasterType                 = typeDropdown.isDisplayed();

	 		Select binTypeDefaultValueSelected    = new Select(typeDropdown);
	 		String actBinTypeDefaultSelectedValue = binTypeDefaultValueSelected.getFirstSelectedOption().getText();

	 		boolean actMasterCategory             = categoryTxt.isDisplayed();
	 		boolean actMasterCategorySettings     = categorySettingBtn.isDisplayed();
	 		boolean actMasterDistance             = distanceTxt.isDisplayed();
	 		boolean actMasterColumn               = colNoTxt.isDisplayed();                 
	 		boolean actMasterRemarks              = remarksTxt.isDisplayed();
	 		boolean actMasterLevel                = levelTxt.isDisplayed();

	 		boolean actMasterSaveBtn              = saveBtn.isDisplayed();
	 		boolean actMasterCloseBtn             = closeBtn.isDisplayed();

	 		boolean expMasterName                 = true;
	 		boolean expMasterCode                 = true;
	 		boolean expMasterCapacity             = true;
	 		boolean expMasterCurrentCapacity      = true;
	 		boolean expMasterType                 = true;
	 		String expBinTypeDefaultSelectedValue = excelReader.getCellData(xlSheetName, 793, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 793, 8, expBinTypeDefaultSelectedValue);
	 		
	 		boolean expMasterCategory             = true;
	 		boolean expMasterCategorySettings     = true;
	 		boolean expMasterDistance             = true;
	 		boolean expMasterLevel                = true;
	 		boolean expMasterColumn               = true;
	 		
	 		boolean expMasterSaveBtn              = true;
	 		boolean expMasterCloseBtn             = true;

	 		System.out.println("************************************************** FieldsInGeneralDisplayAfterCreationNewBins  **********************************************************************");

	 		System.out.println("Name Value Actual                       : " + actMasterName +                 "  Value Expected : " + expMasterName);
	 		System.out.println("Code Value Actual                       : " + actMasterCode +                 "  Value Expected : " + expMasterCode);
	 		System.out.println("Capacity Value Actual                   : " + actMasterCapacity+              "  Value Expected : " + expMasterCapacity);
	 		System.out.println("Current Capacity Value Actual           : " + actMasterCurrentMaster+         "  Value Expected : " + expMasterCurrentCapacity);
	 		
	 		System.out.println("Type Value Actual                       : " + actMasterType +                 "  Value Expected : " + expMasterType);
	 		System.out.println("Type Default Value Actual               : " + actBinTypeDefaultSelectedValue+ "  Value Expected : " + expBinTypeDefaultSelectedValue);
	 		System.out.println("Category Value Actual                   : " + actMasterCategory+              "  Value Expected : " + expMasterCategory);
	 		System.out.println("Cateogry Settings Value Actual          : " + actMasterCategorySettings+      "  Value Expected : " + expMasterCategorySettings);
	 		System.out.println("Distance Value Actual                   : " + actMasterDistance+              "  Value Expected : " + expMasterDistance);
	 		System.out.println("Remarks Value Actual                    : " + actMasterRemarks+               "  Value Expected : " + actMasterRemarks);
	 		System.out.println("Level Value Actual                      : " + actMasterLevel +                "  Value Expected : " + expMasterLevel);
	 		System.out.println("Columnn Value Actual                    : " + actMasterColumn +               "  Value Expected : " + expMasterColumn);
	 		
	 		System.out.println("Save Button Value Actual                : " + actMasterSaveBtn+               "  Value Expected : " + expMasterSaveBtn);
	 		System.out.println("Close Button Value Actual               : " + actMasterCloseBtn+              "  Value Expected : " + expMasterCloseBtn);

	 		
	 		boolean DispalyResult=actClickOnNewBtnErrorMessage==actClickOnNewBtnErrorMessage && actMasterName == expMasterName 
	 								&& actMasterCode == expMasterCode && actMasterCapacity == expMasterCapacity 
	 								&& actMasterType == expMasterType && actBinTypeDefaultSelectedValue.equalsIgnoreCase(expBinTypeDefaultSelectedValue)
	 								&& actMasterCategory == expMasterCategory && actMasterCategorySettings == expMasterCategorySettings
	 								&& actMasterDistance == expMasterDistance && actMasterLevel == expMasterLevel
	 								&& actMasterColumn == expMasterColumn && actMasterSaveBtn == expMasterSaveBtn 
	 								&& actMasterCloseBtn == expMasterCloseBtn;
	 		
	 		String actDisplayResult=Boolean.toString(DispalyResult);
	 		String expDisplayResult=excelReader.getCellData(xlSheetName, 794, 7);
	 		
	         excelReader.setCellData(xlfile, xlSheetName, 794, 8, actDisplayResult.toUpperCase());
	 		
	 		if (actDisplayResult.equalsIgnoreCase(expDisplayResult) && actBinsNewScreenHeaderText.equalsIgnoreCase(expBinsNewScreenHeaderText)&& 
	 				actBinsNewScreenBodyText.equalsIgnoreCase(expBinsNewScreenBodyText)) 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 790, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 790, 9, resFail);
	 			return false;
	 		}
	 	}
	 	 catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 790, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	   }
	   
	  
	   public static boolean checkSaveBinCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************************************************ checkSaveButtonInBinsGroupCreationPage  **********************************************************");
	 	
	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 796, 6));
	 		
	 		getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 		codeTxt.click();
	 		codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 797, 6));
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
	 		capacityTxt.click();
	 		capacityTxt.clear();
	 		capacityTxt.sendKeys(excelReader.getCellData(xlSheetName, 798, 6));
	 		capacityTxt.sendKeys(Keys.TAB);
	 		Thread.sleep(4000);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 		saveBtn.click();

	 		Thread.sleep(2000);
	 		
	         String expMasterSaveMessage = excelReader.getCellData(xlSheetName, 799, 7);
	 		
	 		//excelReader.setCellData(xlfile, xlSheetName, 799, 8, expMasterSaveMessage);
	 		
	 		boolean MasterSave = checkValidationMessageboolean(expMasterSaveMessage);
	 		
	 		
	 		String actMasterSave= Boolean.toString(MasterSave);
	 		String expMasterSave=excelReader.getCellData(xlSheetName, 800, 7);
	 		
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
	 	
	 		boolean actMasterName                 = nameTxt.getText().isEmpty();
	 		boolean actMasterCode                 = codeTxt.getText().isEmpty();
	 		boolean actMasterCapacity             = capacityTxt.isDisplayed();
	 		boolean actMasterCurrentMaster        = currentCapacityTxt.isDisplayed();
	 		boolean actMasterType                 = typeDropdown.isDisplayed();

	 		Select binTypeDefaultValueSelected    = new Select(typeDropdown);
	 		String actBinTypeDefaultSelectedValue = binTypeDefaultValueSelected.getFirstSelectedOption().getText();

	 		boolean actMasterCategory             = categoryTxt.isDisplayed();
	 		boolean actMasterCategorySettings     = categorySettingBtn.isDisplayed();
	 		boolean actMasterDistance             = distanceTxt.isDisplayed();
	 		boolean actMasterColumn               = colNoTxt.isDisplayed();                 
	 		boolean actMasterRemarks              = remarksTxt.isDisplayed();
	 		boolean actMasterLevel                = levelTxt.isDisplayed();

	 		boolean actMasterSaveBtn              = saveBtn.isDisplayed();
	 		boolean actMasterCloseBtn             = closeBtn.isDisplayed();

	 		boolean expMasterName                 = true;
	 		boolean expMasterCode                 = true;
	 		boolean expMasterCapacity             = true;
	 		boolean expMasterCurrentCapacity      = true;
	 		boolean expMasterType                 = true;
	 		String expBinTypeDefaultSelectedValue = excelReader.getCellData(xlSheetName, 801, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 801, 8, actBinTypeDefaultSelectedValue);
	 		
	 		boolean expMasterCategory             = true;
	 		boolean expMasterCategorySettings     = true;
	 		boolean expMasterDistance             = true;
	 		boolean expMasterLevel                = true;
	 		boolean expMasterColumn               = true;
	 		
	 		boolean expMasterSaveBtn              = true;
	 		boolean expMasterCloseBtn             = true;
	 		
	 		System.out.println("************************************************** FieldsInGeneralDisplayAfterCreationNewBins  **********************************************************************");

	 		System.out.println("Name Value Actual                       : " + actMasterName +                 "  Value Expected : " + expMasterName);
	 		System.out.println("Code Value Actual                       : " + actMasterCode +                 "  Value Expected : " + expMasterCode);
	 		System.out.println("Capacity Value Actual                   : " + actMasterCapacity+              "  Value Expected : " + expMasterCapacity);
	 		System.out.println("Current Capacity Value Actual           : " + actMasterCurrentMaster+         "  Value Expected : " + expMasterCurrentCapacity);
	 		
	 		System.out.println("Type Value Actual                       : " + actMasterType +                 "  Value Expected : " + expMasterType);
	 		System.out.println("Type Default Value Actual               : " + actBinTypeDefaultSelectedValue+ "  Value Expected : " + expBinTypeDefaultSelectedValue);
	 		System.out.println("Category Value Actual                   : " + actMasterCategory+              "  Value Expected : " + expMasterCategory);
	 		System.out.println("Cateogry Settings Value Actual          : " + actMasterCategorySettings+      "  Value Expected : " + expMasterCategorySettings);
	 		System.out.println("Distance Value Actual                   : " + actMasterDistance+              "  Value Expected : " + expMasterDistance);
	 		System.out.println("Remarks Value Actual                    : " + actMasterRemarks+               "  Value Expected : " + actMasterRemarks);
	 		System.out.println("Level Value Actual                      : " + actMasterLevel +                "  Value Expected : " + expMasterLevel);
	 		System.out.println("Columnn Value Actual                    : " + actMasterColumn +               "  Value Expected : " + expMasterColumn);
	 		
	 		System.out.println("Save Button Value Actual                : " + actMasterSaveBtn+               "  Value Expected : " + expMasterSaveBtn);
	 		System.out.println("Close Button Value Actual               : " + actMasterCloseBtn+              "  Value Expected : " + expMasterCloseBtn);

	 		
	 		
	 		boolean DispalyResult= actMasterSave.equalsIgnoreCase(expMasterSave) && actMasterName == expMasterName && actMasterCode == expMasterCode
	 								&& actMasterCapacity == expMasterCapacity && actMasterType == expMasterType
	 								&& actBinTypeDefaultSelectedValue.equalsIgnoreCase(expBinTypeDefaultSelectedValue)
	 								&& actMasterCategory == expMasterCategory && actMasterCategorySettings == expMasterCategorySettings
	 								&& actMasterDistance == expMasterDistance && actMasterLevel == expMasterLevel
	 								&& actMasterColumn == expMasterColumn
	 								&& actMasterSaveBtn == expMasterSaveBtn && actMasterCloseBtn == expMasterCloseBtn ;
	 						
	 		String actDisaplayResult=Boolean.toString(DispalyResult);
	 		String expDisaplayResult=excelReader.getCellData(xlSheetName, 802, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 802, 8, actDisaplayResult.toUpperCase());
	 		
	 		if (actDisaplayResult.equalsIgnoreCase(expDisaplayResult)&& actMasterSave.equalsIgnoreCase(expMasterSave)) 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 795, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 795, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 795, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	   }

	 	
	   public static boolean checkCloseButtonBinsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("********************************** checkCloseButtonInBinGroupCreationPage ******************************************");
	     
	 	try
	 	{
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	 		closeBtn.click();

	 		boolean actClickOnCloseBtnErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	  		boolean expClickOnCloseBtnErrorMessage  = true;

	  		System.out.println("Click On Close Button Is Error Message Value Actual : " + actClickOnCloseBtnErrorMessage + " Value Expected : " + expClickOnCloseBtnErrorMessage);

	         ArrayList<String> actmasterDepNameList=new ArrayList<String>();
	  		
	  		int HeaderCount =masterDepNameList.size();
	  		
	  		System.err.println("HeaderCount   :  "+HeaderCount);
	  		
	  		for (int i = 0; i < HeaderCount; i++) 
	  		{
	  			String data=masterDepNameList.get(i).getText();
	  			actmasterDepNameList.add(data);
	  		}
	  		
	  	
	  		 String actMasterDepNameTextList=actmasterDepNameList.toString();
	  		 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 804, 7);
	  		
	  		 excelReader.setCellData(xlfile, xlSheetName, 804, 8, actMasterDepNameTextList);
	     	
	     	 System.err.println("  Actual MasterDepNameTextList : "+actMasterDepNameTextList);
	     	 System.err.println("  Expected  MasterDepNameTextList : "+expMasterDepNameTextList);

	 		if (actClickOnCloseBtnErrorMessage == expClickOnCloseBtnErrorMessage && 
	 				actMasterDepNameTextList.equalsIgnoreCase(expMasterDepNameTextList)) 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 803, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 803, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 803, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	   }

	 	@FindBy(xpath="//tr[5]//td[8]//div[1]//label[1]//input[1]")
	 	private static WebElement unitFifthCheckBox;
	 	
	   public static boolean checkEditOptionForNewlyCreateBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************************************************** checkEditOptionForNewlyCreateBins *******************************************************");
	 	try
	 	{

	 	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
	 	  unitFirstCheckBox.click();
	 		
	 		/*getWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFifthCheckBox));
	 		unitFifthCheckBox.click();*/

	 	  boolean actClickOnCheckBoxErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	  	  boolean expClickOnCheckBoxErrorMessage  = true;

	  	  System.out.println("Check Check Box Is Any Error Message Value Actual : " + actClickOnCheckBoxErrorMessage + " Value Expected : " + expClickOnCheckBoxErrorMessage);
	  		
	 	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	 	  masterEditBtn.click();

	 	  boolean actClickOnEditBtnErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	  	  boolean expClickOnEditBtnErrorMessage  = true;
	  	  	
	       System.out.println("Click On Edit Button Is Any Error Message Value Actual : " + actClickOnEditBtnErrorMessage + " Value Expected : " + expClickOnEditBtnErrorMessage);
	  	
	       String actMasterName                  = nameTxt.getAttribute("value");
	 	  String actMasterCode                  = codeTxt.getAttribute("value");
	 	  String actMasterCapacity              = capacityTxt.getAttribute("value");
	 	  String actMasterCurrentMaster         = currentCapacityTxt.getAttribute("value");
	 	  boolean actMasterType                 = typeDropdown.isDisplayed();

	 	  Select binTypeDefaultValueSelected    = new Select(typeDropdown);
	 	  String actBinTypeDefaultSelectedValue = binTypeDefaultValueSelected.getFirstSelectedOption().getText();  
	 	 
	 	  boolean actMasterCategory             = categoryTxt.isDisplayed();
	 	  boolean actMasterCategorySettings     = categorySettingBtn.isDisplayed();
	       boolean actMasterDistance             = distanceTxt.isDisplayed();
	 	  boolean actMasterLevel                = levelTxt.isDisplayed();

	 	  boolean actMasterColumn               = colNoTxt.isDisplayed();
	 	  boolean actMasterRemarks              = remarksTxt.isDisplayed();

	 	  boolean actMasterSaveBtn              = saveBtn.isDisplayed();
	 	  boolean actMasterCloseBtn             = closeBtn.isDisplayed();
	      
	 	  excelReader.setCellData(xlfile, xlSheetName, 806, 8, actMasterName);
	 	  excelReader.setCellData(xlfile, xlSheetName, 807, 8, actMasterCode);
	 	  excelReader.setCellData(xlfile, xlSheetName, 808, 8, actMasterCapacity);
	 	  excelReader.setCellData(xlfile, xlSheetName, 809, 8, actBinTypeDefaultSelectedValue);
	 	  excelReader.setCellData(xlfile, xlSheetName, 810, 8, actMasterCurrentMaster);
	 	  
	 	  String expMasterName                  = excelReader.getCellData(xlSheetName, 806, 7);
	 	  String expMasterCode                  = excelReader.getCellData(xlSheetName, 807, 7);
	 	  String expMasterCapacity              = excelReader.getCellData(xlSheetName, 808, 7);
	 	  boolean expMasterType                 = true;
	 	  String expBinTypeDefaultSelectedValue = excelReader.getCellData(xlSheetName, 809, 7);
	 	  String expMasterCurrentCapacity       = excelReader.getCellData(xlSheetName, 810, 7);
	 	  boolean expMasterCategory             = true;
	 	  boolean expMasterCategorySettings     = true;
	 	  boolean expMasterDistance             = true;
	 	  boolean expMasterLevel                = true;
	 	  boolean expMasterColumn               = true;
	 	  boolean expMasterRemarks              = true;
	 	  boolean expMasterStorageType          = true;
	 	  boolean expMasterSaveBtn              = true;
	 	  boolean expMasterCloseBtn             = true;

	 	  System.out.println("****************************************** FieldsInGeneralDisplayAfterCreationNewBins  **********************************************");
	 	  
	 	  System.out.println("Name Value Actual                       : " + actMasterName +                 "  Value Expected : " + expMasterName);
	 	  System.out.println("Code Value Actual                       : " + actMasterCode +                 "  Value Expected : " + expMasterCode);
	 	  System.out.println("Capacity Value Actual                   : " + actMasterCapacity+              "  Value Expected : " + expMasterCapacity);
	 	  System.out.println("Current Capacity Value Actual           : " + actMasterCurrentMaster+         "  Value Expected : " + expMasterCurrentCapacity);
	 	  
	 	  System.out.println("Type Value Actual                       : " + actMasterType +                 "  Value Expected : " + expMasterType);
	 	  System.out.println("Type Default Value Actual               : " + actBinTypeDefaultSelectedValue+ "  Value Expected : " + expBinTypeDefaultSelectedValue);
	 	  System.out.println("Category Value Actual                   : " + actMasterCategory+              "  Value Expected : " + expMasterCategory);
	 	  System.out.println("Cateogry Settings Value Actual          : " + actMasterCategorySettings+      "  Value Expected : " + expMasterCategorySettings);
	 	  System.out.println("Distance Value Actual                   : " + actMasterDistance+              "  Value Expected : " + expMasterDistance);
	 	  System.out.println("Remarks Value Actual                    : " + actMasterRemarks+               "  Value Expected : " + actMasterRemarks);
	 	  System.out.println("Level Value Actual                      : " + actMasterLevel +                "  Value Expected : " + expMasterLevel);
	 	  System.out.println("Columnn Value Actual                    : " + actMasterColumn +               "  Value Expected : " + expMasterColumn);
	 	
	 	  System.out.println("Save Button Value Actual                : " + actMasterSaveBtn+               "  Value Expected : " + expMasterSaveBtn);
	 	  System.out.println("Close Button Value Actual               : " + actMasterCloseBtn+              "  Value Expected : " + expMasterCloseBtn);

	 	  
	 	  boolean DisplayResult=actClickOnCheckBoxErrorMessage==expClickOnCheckBoxErrorMessage && actClickOnEditBtnErrorMessage==expClickOnEditBtnErrorMessage 
	 										&& actMasterName.equalsIgnoreCase(expMasterName) && actMasterCode.equalsIgnoreCase(expMasterCode) 
	 										&& actMasterCapacity.equalsIgnoreCase(expMasterCapacity) && actMasterCurrentMaster.equalsIgnoreCase(expMasterCurrentCapacity)
	 										&& actMasterType == expMasterType && actBinTypeDefaultSelectedValue.equalsIgnoreCase(expBinTypeDefaultSelectedValue) 
	 										&& actMasterCategory == expMasterCategory  && actMasterCategorySettings == expMasterCategorySettings 
	 										&& actMasterDistance == expMasterDistance && actMasterLevel == expMasterLevel 
	 										&& actMasterColumn == expMasterColumn && actMasterSaveBtn == expMasterSaveBtn 
	 										&& actMasterCloseBtn == expMasterCloseBtn;
	 	  
	 	  
	 	  String actDisplayResult=Boolean.toString(DisplayResult);
	 	  String expDisplayResult=excelReader.getCellData(xlSheetName, 811, 7);
	 	  
	 	  excelReader.setCellData(xlfile, xlSheetName, 811, 8, actDisplayResult.toUpperCase());
	 	  
	 	  if (actDisplayResult.equalsIgnoreCase(expDisplayResult)) 
	 	  {
	 		  excelReader.setCellData(xlfile, xlSheetName, 805, 9, resPass);
	 		return true;
	 	  } 
	 	  else 
	 	  {
	 		  excelReader.setCellData(xlfile, xlSheetName, 805, 9, resFail);
	 		return false;
	 	  }
	 	}
	 	catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 805, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	   }
	   
	 	
	  public static boolean checkSaveByUpdatingNameCodeTypeInBinsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	    excelReader = new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	    System.out.println("**************************************** checkSaveByUpdatingNameCodeTypeInBinsCreationPage *******************************************");
	    
	    try
	    {
	 	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 	 nameTxt.click();
	 	 nameTxt.clear();
	 	 nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 813, 6));

	 	 getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();

	 	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 	 codeTxt.click();
	 	 codeTxt.clear();
	 	 codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 814, 6));

	 	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
	 	 capacityTxt.click();
	 	 capacityTxt.clear();
	 	 capacityTxt.sendKeys(excelReader.getCellData(xlSheetName, 815, 6));
	 	 Thread.sleep(2000);
	 	
	 	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 	 nameTxt.click();

	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 	 saveBtn.click();

	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));

	 	 
	 	 String expMasterSaveMessage = excelReader.getCellData(xlSheetName, 816, 7);
	 		
	 	 excelReader.setCellData(xlfile, xlSheetName, 816, 8, expMasterSaveMessage);
	 			
	 	 boolean MasterSave = checkValidationMessageboolean(expMasterSaveMessage);
	 			
	 			
	 	 String actMasterSave= Boolean.toString(MasterSave);
	 	 String expMasterSave=excelReader.getCellData(xlSheetName, 817, 7);
	 			
	 	 excelReader.setCellData(xlfile, xlSheetName, 817, 8, actMasterSave);
	 	 
	 	 System.out.println(" Saving Message : "+actMasterSave +" Value Expected : "+expMasterSave);
	 	
	 	 ArrayList<String> actmasterDepNameList=new ArrayList<String>();
	 		
	 	 int HeaderCount =masterDepNameList.size();
	 		
	 	 System.err.println("HeaderCount   :  "+HeaderCount);
	 		
	 	 for (int i = 0; i < HeaderCount; i++) 
	 	 {
	 		String data=masterDepNameList.get(i).getText();
	 		actmasterDepNameList.add(data);
	 	 }
	 	
	 	 String actMasterDepNameTextList=actmasterDepNameList.toString();
	 	 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 818, 7);
	 		
	 	 excelReader.setCellData(xlfile, xlSheetName, 818, 8, actMasterDepNameTextList);
	 	
	 	 System.err.println("  Actual MasterDepNameTextList : "+actMasterDepNameTextList);
	 	 System.err.println("  Expected  MasterDepNameTextList : "+expMasterDepNameTextList);

	 	 if (actMasterSave.equalsIgnoreCase(expMasterSave) && actMasterDepNameTextList.equals(expMasterDepNameTextList))
	 			
	 	 {
	 		 excelReader.setCellData(xlfile, xlSheetName, 812, 9, resPass);
	 		return true;
	 	 }
	 	 else 
	 	 {
	 		 excelReader.setCellData(xlfile, xlSheetName, 812, 9, resFail);
	 		return false;
	 	 }
	    }
	    catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 812, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	  }



	  public static boolean checkEditOptionForNewlyUpdateBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************************************************** checkEditOptionForNewlyCreateAddGroupBins *******************************************************");
	 	
	 	try
	 	{
	 	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
	 	  unitFirstCheckBox.click();

	 	  boolean actClickOnCheckBoxErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 	  boolean expClickOnCheckBoxErrorMessage  = true;

	 	  System.out.println("Check Check Box Is Any Error Message Value Actual : " + actClickOnCheckBoxErrorMessage + " Value Expected : " + expClickOnCheckBoxErrorMessage);
	 		
	 	  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	 	  masterEditBtn.click();

	 	  boolean actClickOnEditBtnErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 	  boolean expClickOnEditBtnErrorMessage  = true;
	 	  	
	       System.out.println("Click On Edit Button Is Any Error Message Value Actual : " + actClickOnEditBtnErrorMessage + " Value Expected : " + expClickOnEditBtnErrorMessage);
	 	
	       String actMasterName                  = nameTxt.getAttribute("value");
	 	  String actMasterCode                  = codeTxt.getAttribute("value");
	 	  String actMasterCapacity              = capacityTxt.getAttribute("value");
	 	  String actMasterCurrentMaster         = currentCapacityTxt.getAttribute("value");
	 	  boolean actMasterType                 = typeDropdown.isDisplayed();

	 	  Select binTypeDefaultValueSelected    = new Select(typeDropdown);
	 	  String actBinTypeDefaultSelectedValue = binTypeDefaultValueSelected.getFirstSelectedOption().getText();  
	 	 

	       excelReader.setCellData(xlfile, xlSheetName, 820, 8, actMasterName);
	       excelReader.setCellData(xlfile, xlSheetName, 821, 8, actMasterCode);      
	       excelReader.setCellData(xlfile, xlSheetName, 822, 8, actMasterCapacity);
	       excelReader.setCellData(xlfile, xlSheetName, 823, 8, actBinTypeDefaultSelectedValue);
	       
	 	  boolean actMasterCategory             = categoryTxt.isDisplayed();
	 	  boolean actMasterCategorySettings     = categorySettingBtn.isDisplayed();
	       boolean actMasterDistance             = distanceTxt.isDisplayed();
	 	  boolean actMasterLevel                = levelTxt.isDisplayed();


	 	  boolean actMasterColumn               = colNoTxt.isDisplayed();
	 	  boolean actMasterRemarks              = remarksTxt.isDisplayed();

	 	  boolean actMasterSaveBtn              = saveBtn.isDisplayed();
	 	  boolean actMasterCloseBtn             = closeBtn.isDisplayed();
	      
	     
	 	  String expMasterName                  = excelReader.getCellData(xlSheetName, 820, 7);
	 	  String expMasterCode                  = excelReader.getCellData(xlSheetName, 821, 7);
	 	  String expMasterCapacity              = excelReader.getCellData(xlSheetName, 822, 7);
	 	  boolean expMasterType                 = true;
	 	  String expBinTypeDefaultSelectedValue = excelReader.getCellData(xlSheetName, 823, 7);
	 	  boolean expMasterCurrentCapacity      = true;
	 	  boolean expMasterCategory             = true;
	 	  boolean expMasterCategorySettings     = true;
	 	  boolean expMasterDistance             = true;
	 	  boolean expMasterLevel                = true;
	 	  boolean expMasterColumn               = true;
	 	  boolean expMasterRemarks              = true;
	 	  boolean expMasterStorageType          = true;
	 	  boolean expMasterSaveBtn              = true;
	 	  boolean expMasterCloseBtn             = true;

	 	  System.out.println("****************************************** FieldsInGeneralDisplayAfterCreationNewBins  **********************************************");
	 	  
	 	  System.out.println("Name Value Actual                       : " + actMasterName +                 "  Value Expected : " + expMasterName);
	 	  System.out.println("Code Value Actual                       : " + actMasterCode +                 "  Value Expected : " + expMasterCode);
	 	  System.out.println("Capacity Value Actual                   : " + actMasterCapacity+              "  Value Expected : " + expMasterCapacity);
	 	  System.out.println("Current Capacity Value Actual           : " + actMasterCurrentMaster+         "  Value Expected : " + expMasterCurrentCapacity);
	 	  
	 	  System.out.println("Type Value Actual                       : " + actMasterType +                 "  Value Expected : " + expMasterType);
	 	  System.out.println("Type Default Value Actual               : " + actBinTypeDefaultSelectedValue+ "  Value Expected : " + expBinTypeDefaultSelectedValue);
	 	  System.out.println("Category Value Actual                   : " + actMasterCategory+              "  Value Expected : " + expMasterCategory);
	 	  System.out.println("Cateogry Settings Value Actual          : " + actMasterCategorySettings+      "  Value Expected : " + expMasterCategorySettings);
	 	  System.out.println("Distance Value Actual                   : " + actMasterDistance+              "  Value Expected : " + expMasterDistance);
	 	  System.out.println("Remarks Value Actual                    : " + actMasterRemarks+               "  Value Expected : " + actMasterRemarks);
	 	  System.out.println("Level Value Actual                      : " + actMasterLevel +                "  Value Expected : " + expMasterLevel);
	 	  System.out.println("Columnn Value Actual                    : " + actMasterColumn +               "  Value Expected : " + expMasterColumn);
	 	
	 	  System.out.println("Save Button Value Actual                : " + actMasterSaveBtn+               "  Value Expected : " + expMasterSaveBtn);
	 	  System.out.println("Close Button Value Actual               : " + actMasterCloseBtn+              "  Value Expected : " + expMasterCloseBtn);

	 	  if (actClickOnCheckBoxErrorMessage==expClickOnCheckBoxErrorMessage && actClickOnEditBtnErrorMessage==expClickOnEditBtnErrorMessage 
	 			&& actMasterName.equalsIgnoreCase(expMasterName) && actMasterCode.equalsIgnoreCase(expMasterCode)
	 			&& actMasterCapacity.equalsIgnoreCase(expMasterCapacity) && actMasterType == expMasterType
	 			&& actBinTypeDefaultSelectedValue.equalsIgnoreCase(expBinTypeDefaultSelectedValue) && actMasterCategory == expMasterCategory 
	 			&& actMasterCategorySettings == expMasterCategorySettings && actMasterDistance == expMasterDistance 
	 			&& actMasterLevel == expMasterLevel && actMasterColumn == expMasterColumn 
	 			&& actMasterSaveBtn == expMasterSaveBtn && actMasterCloseBtn == expMasterCloseBtn) 
	 	  {
	 		  excelReader.setCellData(xlfile, xlSheetName, 819, 9, resPass);
	 		return true;
	 	  } 
	 	  else 
	 	  {
	 		  excelReader.setCellData(xlfile, xlSheetName, 819, 9, resFail);
	 		return false;
	 	  }
	 	}
	 	catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 819, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	  }
	  
	 	
	  
	  public static boolean checkCloseButtonBinsUpdateCheck() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("******************************************* checkCloseButtonBinsUpdateCheck **************************************************");

	 	try
	 	{
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(editcloseBtn));
	 		editcloseBtn.click();
	 	
	 		boolean actClickOnCloseBtnErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		boolean expClickOnCloseBtnErrorMessage  = true;
	 		  	
	 	    System.out.println("Click On Edit Button Is Any Error Message Value Actual : " + actClickOnCloseBtnErrorMessage + " Value Expected : " + expClickOnCloseBtnErrorMessage);
	 			
	 	    
	 	    ArrayList<String> actmasterDepNameList=new ArrayList<String>();
	 		
	 		 int HeaderCount =masterDepNameList.size();
	 			
	 		 System.err.println("HeaderCount   :  "+HeaderCount);
	 			
	 		 for (int i = 0; i < HeaderCount; i++) 
	 		 {
	 			String data=masterDepNameList.get(i).getText();
	 			actmasterDepNameList.add(data);
	 		 }
	 		
	 		 String actMasterDepNameTextList=actmasterDepNameList.toString();
	 		 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 825, 7);
	 			
	 		 excelReader.setCellData(xlfile, xlSheetName, 825, 8, actMasterDepNameTextList);
	 		
	 		 System.err.println("  Actual MasterDepNameTextList : "+actMasterDepNameTextList);
	 		 System.err.println("  Expected  MasterDepNameTextList : "+expMasterDepNameTextList);
	 	
	 		if (actClickOnCloseBtnErrorMessage == expClickOnCloseBtnErrorMessage
	 				&& actMasterDepNameTextList.equalsIgnoreCase(expMasterDepNameTextList)) 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 824, 9, resPass);
	 			return true;
	 		}
	 		else
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 824, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 824, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	  }

	  
	  
	  
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
	  	
	  
	  
	  
	  public static boolean checkUnCheckingSelectBinsAndCheckUnSelectBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************************************************** checkUnCheckingSelectBinsAndCheckUnSelectBins *******************************************************");
	 		
	 	try
	 	{
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
	 		unitFirstCheckBox.click();

	 		/* boolean UnCheckErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		
	 		 String actUnCheckErrorMessage=Boolean.toString(UnCheckErrorMessage);
	 		 String expUnCheckErrorMessage=excelReader.getCellData(xlSheetName, 827, 7);
	 		
	 		
	 	    System.out.println("Click On Edit Button Is Any Error Message Value Actual : " + actUnCheckErrorMessage + " Value Expected : " + expUnCheckErrorMessage);
	 		
	 		boolean ServerErrorMessage  = checkServerErrorMessageIsNotDisplay();
	  		
	  		String actServerErrorMessage=Boolean.toString(ServerErrorMessage);
	  		String expServerErrorMessage=excelReader.getCellData(xlSheetName, 828, 7);
	  		
	  		
	  		System.out.println("Un Checking Bins Error Message                         : " + actServerErrorMessage +   " Value Expected : " +  expServerErrorMessage);
	 		*/
	 		
	 		
	 		
	 		if (unitFirstCheckBox.isDisplayed()) 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 826, 9, resPass);
	 			return true;
	 		}
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 826, 9, resFail);
	 			return false;
	 		}
	 	}
	 	 catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 826, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	   }
	  
	  
	  

	  public static boolean checkDeleteBinsOptionForBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************************************************** chekDeleteBinsOptionForBinsMasterPage *******************************************************");
	 	
	 	try
	 	{
	 		if(unitFirstCheckBox.isSelected())
	 		{
	 			System.out.println("Check Box is Selected");
	 		}
	 		else
	 		{
	 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
	 			unitFirstCheckBox.click();
	 		
	 		}
	 	
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
	 		masterDeleteBtn.click();		

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
	 		System.out.println(getMsgOnDelete.getText());

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
	 		clickOnOkInDelete.click();

	 		
	         String expSaveMessage = excelReader.getCellData(xlSheetName, 830, 7);
	 		
	         //excelReader.setCellData(xlfile, xlSheetName, 830, 8, expSaveMessage);
	         
	 		boolean ValidationConfirmationMessageOnDelete = checkValidationMessageboolean(expSaveMessage);
	 		
	 		
	 		String actValidationConfirmationMessageOnDelete=Boolean.toString(ValidationConfirmationMessageOnDelete);
	 	    String expValidationConfirmationMessageOnDelete = excelReader.getCellData(xlSheetName, 831, 7);
	 		
	 		 excelReader.setCellData(xlfile, xlSheetName, 831, 8, actValidationConfirmationMessageOnDelete.toUpperCase());
	 		 	 
	 		 ArrayList<String> actmasterDepNameList=new ArrayList<String>();
	 			
	 		 int HeaderCount =masterDepNameList.size();
	 			
	 		 System.err.println("HeaderCount   :  "+HeaderCount);
	 			
	 		 for (int i = 0; i < HeaderCount; i++) 
	 		 {
	 			String data=masterDepNameList.get(i).getText();
	 			actmasterDepNameList.add(data);
	 		 }
	 		
	 		 String actMasterDepNameTextList=actmasterDepNameList.toString();
	 		 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 832, 7);
	 			
	 		 excelReader.setCellData(xlfile, xlSheetName, 832, 8, actMasterDepNameTextList);
	 		
	 		 System.err.println("  Actual MasterDepNameTextList : "+actMasterDepNameTextList);
	 		 System.err.println("  Expected  MasterDepNameTextList : "+expMasterDepNameTextList);

	 		if (actValidationConfirmationMessageOnDelete.equalsIgnoreCase(expValidationConfirmationMessageOnDelete)
	 				&& actMasterDepNameTextList.equalsIgnoreCase(expMasterDepNameTextList)) 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 829, 9, resPass);
	 			return true;
	 		} 
	 		else
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 829, 9, resFail);
	 			return false;
	 		}
	 	}

	 	 catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 829, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	    }
	  
	  
	  public static boolean checkSaveBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {

	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("************************************************ checkSaveButtonInBinsGroupCreationPage  **********************************************************");
	 	
	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	 		masterNewBtn.click();

	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 796, 6));
	 		
	 		getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 		codeTxt.click();
	 		codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 797, 6));
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
	 		capacityTxt.click();
	 		capacityTxt.clear();
	 		capacityTxt.sendKeys(excelReader.getCellData(xlSheetName, 798, 6));
	 		capacityTxt.sendKeys(Keys.TAB);
	 		Thread.sleep(4000);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 		saveBtn.click();

	 		Thread.sleep(2000);
	 		
	         String expMasterSaveMessage = excelReader.getCellData(xlSheetName, 799, 7);
	 		
	 		//excelReader.setCellData(xlfile, xlSheetName, 799, 8, expMasterSaveMessage);
	 		
	 		boolean MasterSave = checkValidationMessageboolean(expMasterSaveMessage);
	 		
	 		
	 		String actMasterSave= Boolean.toString(MasterSave);
	 		String expMasterSave=excelReader.getCellData(xlSheetName, 800, 7);
	 		
	 		
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	 		closeBtn.click();

	 		if ( actMasterSave.equalsIgnoreCase(expMasterSave)) 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 795, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 795, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 795, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	  }
	  
	  
	  
	  
	  
	  


	  
		
		
	  @FindBy(xpath = "//*[@id='btnClose']")
	  private static WebElement itemCloseBtn;
	  
	  public static boolean checkCloseBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
	 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	System.out.println("********************************** checkCloseBinsMaster ********************************");

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
	 		String expDispalyResult=excelReader.getCellData(xlSheetName, 834, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 834, 8, actDispalyResult.toUpperCase());
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));

	 		String actDashboardLabel = labelDashboard.getText();
	 		String expDashboardLabel = excelReader.getCellData(xlSheetName, 835, 7);

	 		excelReader.setCellData(xlfile, xlSheetName, 835, 8, actDashboardLabel);
	 		
	 		
	 		System.out.println("Close Button  : " + actDashboardLabel + "  Value Expected : " + expDashboardLabel);
	 		
	 		
	 		if (actDashboardLabel.equalsIgnoreCase(expDashboardLabel) && actDispalyResult.equalsIgnoreCase(expDispalyResult)) 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 833, 9, resPass);
	 			return true;
	 		}
	 		else
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 833, 9, resFail);
	 			return false;
	 		}
	     }
	     catch (Exception e) 
	 	  {
	 		  String exception =e.getMessage();
	 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 833, 10, exception);
	 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 		  return false;
	 	  }
	   }
	  


	   @FindBy(xpath = "//*[@id='userprofile']/li/span[2]")
	   private static WebElement logoutOption;
	   
	   @FindBy(id = "txtPassword")
	   private static WebElement password;
	   
	   public boolean checkLogoutInBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
	
	
	public SmokeBinsPage(WebDriver driver)
    {
    	
   	 PageFactory.initElements(driver, this);
   	
    }
	
	
}
