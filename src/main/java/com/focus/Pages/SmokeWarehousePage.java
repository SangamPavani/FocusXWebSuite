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


public class SmokeWarehousePage extends BaseEngine
{
	    //Home Menu
		@FindBy (xpath="//*[@id='1']/div/span")
		public static WebElement homeMenu;

	      //Masters Menu	
		  @FindBy (xpath="//*[@id='1000']/span")
	      public static WebElement mastersMenu;
		
			 //Department Menu	
			 @FindBy (xpath="/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[11]/a[1]/span[1]")
			 public static WebElement warehouseMenu;
		 
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
			    @FindBy(xpath="//span[contains(text(),'Warehouse Properties')]")
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
			private static WebElement treeWarehouseDisplay;
		    
		    @FindBy(xpath="//td[@class='text-center']")
			private static WebElement warehouseInMainPageEmpty;
		    
			@FindBy(xpath="//*[@id='btnMasterSaveClick']")
			public static WebElement saveBtn;
			
	        //Departments Creation Page	
		    @FindBy(xpath="//input[@id='sName']")
			private static WebElement nameTxt;
			
			@FindBy(xpath="//input[@id='sCode']")
			private static WebElement codeTxt;
					
/*			@FindBy(xpath="//*[@id='iBins']")
			private static WebElement binsCombobox;
		
			@FindBy(xpath="//*[@id='iPhysInventoryCountingFrequency']")
			private static WebElement physicalInventoryCountingFrequency;
			
			@FindBy(xpath="//*[@id='iWarehouseType']")
			private static WebElement warehouseType;

			@FindBy(xpath="//*[@id='bDontMaintainBin']")
			private static WebElement doNotMain;*/
			
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
			
			
			
//Master Customization
			
			@FindBy(xpath="//i[@class='icon-expand']")
			private static WebElement plusBtn;

			@FindBy(xpath="//i[@class='icon-collepse']")
			private static WebElement minusBtn;

			@FindBy(xpath="//span[contains(text(),'Master Fields')]")
			private static WebElement masterFieldsOption;
			
				@FindBy(xpath="//*[@id='masterFields_list']/li[1]/span")
				private static WebElement generalTab;
				
					@FindBy(xpath="//span[@class='font-5'][contains(text(),'Main')]")
					private static WebElement generalMainTab;
					
						@FindBy(xpath="//div[@id='mainTab_0']//tbody//tr[1]//td[4]")
						private static WebElement accountCustomizeName;
	
						@FindBy(xpath="//div[@id='mainTab_0']//tr[2]//td[4]")
						private static WebElement accountCustomizeCode;

					@FindBy(xpath="//span[contains(text(),'Header Details')]")
					private static WebElement generalHeaderDetailsTab;
						
						/*@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/table/tbody/tr[1]/td[4]")
						private static WebElement warehouseHeaderDetailsBins;
	
						@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/table/tbody/tr[2]/td[4]")
						private static WebElement warehouseHeaderDetailsPhysInventory;

						@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/table/tbody/tr[3]/td[4]")
						private static WebElement warehouseHeaderDetailsWarehouse;
						
						@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/table/tbody/tr[4]/td[4]")
						private static WebElement warehouseHeaderDetailsDonotMaintainStocks;
						
						@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/table/tbody/tr[1]/td[1]/i[1]")
						private static WebElement warehouseHeaderDetailsBinsEdit;*/						

						@FindBy(xpath="//div[contains(text(),'Preview')]")
						private static WebElement accountHeaderPreview;
						
						@FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
						private static WebElement accountSaveBtn;
									     
						@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[1]/span")
						private static WebElement accountAddBtn;
												     
						@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[1]/span")
						private static WebElement accountCloseBtn;
						

					    @FindBy(xpath="//span[contains(text(),'Unique Constraints')]")
						private static WebElement accountMasterFieldsUniqueConstraintsOption; 
						
							 @FindBy(xpath="//div[@id='tabContent_UConstraints_MasterCust']//div[@id='btnAddOrEdit_UniqueConstraints']")
							 private static WebElement UniqueConstraintsAddBtn;
									     
							 @FindBy(xpath="//div[@id='tabContent_UConstraints_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
							 private static WebElement UniqueConstraintsDeleteBtn;
									     
							 @FindBy(xpath="//div[@id='tabContent_UConstraints_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
							 private static WebElement UniqueConstraintsCloseBtn;
							 
								 @FindBy(xpath="//input[@id='txtConstraintName']")
								 private static WebElement ConstraintNameTxt;
							
							     @FindBy(xpath="//select[@id='ddlConstraintTabList']")
							     private static WebElement UniqueConstraints_TabsDropdown;

							     @FindBy(xpath="//*[@id='tab_Main_UcFields']/i")
							     private static WebElement UniqueConstraints_MainExpansionBtn;
							   
								     @FindBy(xpath="//*[@id='chkList_MainFields_1']/div[1]")
								     private static WebElement accountUniqueConstraints_Main_NameChekbox;
								     
								     @FindBy(xpath="//div[@id='chkList_MainFields_1']//div[2]")
								     private static WebElement accountUniqueConstraints_Main_CodeChekbox;
								     
								     @FindBy(xpath="//div[@id='chkList_MainFields_1']//div[3]")
								     private static WebElement accountUniqueConstraints_Main_AccountTypeCheckbox;
								     
								     @FindBy(xpath="//div[@id='chkList_MainFields_1']//div[4]")
								     private static WebElement accountUniqueConstraints_Main_CreditLimitCheckBox;
								     
								     @FindBy(xpath="//div[@id='chkList_MainFields_1']//div[5]")
								     private static WebElement accountUniqueConstraints_Main_CreditDays;
								     
								 @FindBy(xpath="//div[@id='tab_Header_UcFields']//i[@class='pull-right icon-expand theme_icon-color']")
								 private static WebElement UniqueConstraints_HeaderExpansionBtn;

								     @FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[1]")
								     private static WebElement UniqueConstraints_Header_ChequeDiscountLimitChekbox;
								     
								     @FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[2]")
								     private static WebElement UniqueConstraints_Header_RateOfInterestChekbox;
								     
								     @FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[3]")
								     private static WebElement UniqueConstraints_Header_BankAcChekbox;
								     
								     @FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[4]")
								     private static WebElement UniqueConstraints_Header_PDCDiscountedChekbox;
								  
								 @FindBy(xpath="//*[@id='tab_Body_UcFields']/i")
							     private static WebElement UniqueConstraints_BodyExpansionBtn;
								 
						@FindBy(xpath="//span[contains(text(),'Rules')]")
						private static WebElement RulesOption;
						
							 @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[1]/div[1]")
							 private static WebElement accountRules_SaveBtn ;
							               
							 @FindBy(xpath="//div[contains(text(),'New')]")
							 private static WebElement accountRules_NewBtn ;
							
							 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]")
							 private static WebElement accountRules_DeleteBtn ;
							 
							 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]")
							 private static WebElement accountRules_CloseBtn ;   
							 
							 @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules']")
							 private static WebElement Rules_RuleNameText ;
								     
				
							 @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_MasterRules']")
							 private static WebElement Rules_CreatingGroupChekbox ;
				
							 @FindBy(xpath="//*[@id='chkNewRecord_Rule_MasterRules']")
							 private static WebElement Rules_NewRecordChekbox ;
				
							 @FindBy(xpath="//*[@id='chkEdit_Rule_MasterRules']")
							 private static WebElement Rules_EditChekbox ;
				
							 @FindBy(xpath="//*[@id='chkLoad_Rule_MasterRules']")
							 private static WebElement Rules_LoadChekbox ;
				
							 @FindBy(xpath="//*[@id='chkBeforeSave_Rule_MasterRules']")
							 private static WebElement Rules_BeforeSaveChekbox ;
				
							 @FindBy(xpath="//*[@id='chkOnLeave_Rule_MasterRules']")
							 private static WebElement Rules_OnLeaveChekbox ;
				
							 @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_MasterRules']")
							 private static WebElement Rules_BeforeDeleteChekbox ;
				
							 @FindBy(xpath="//*[@id='chkOnEnter_Rule_MasterRules']")
							 private static WebElement Rules_OnEnterChekbox ;
							 
							 @FindBy(xpath="//label[contains(text(),'Active')]")
							 private static WebElement Rules_ActiveChekbox ;
				
							 @FindBy(xpath="//*[@id='Conditions-Context_Menu']/li[3]")
							 private static WebElement Rules_NoConditionChekbox;	  

						@FindBy(xpath="//*[@id='allMasterCustTabs']/li[4]/span")
						private static WebElement rules_ExternalModules;
				
							@FindBy(xpath="//select[@id='ddlOnEvent_MasterExternalModule']")
							private static WebElement rules_ExternalModulesOnEventDropdown;	
							
							@FindBy(xpath="//input[@id='txtbuttonCaption_MasterExternalModule']")
							private static WebElement rules_ExternalModulesButtonCaption;
				
							@FindBy(xpath="//select[@id='ddlModuleType_MasterExternalModule']")
							private static WebElement rules_ExternalModules_ModuleTypeBtn;
				
							@FindBy(xpath="//select[@id='ddlAllDllFiles_MasterExternalModule']")
							private static WebElement rules_ExternalModules_ModuleNameDropdown;
				
							@FindBy(xpath="//select[@id='ddlClassNames_MasterExternalModule']")
							private static WebElement rules_ExternalModulesClassNameDropdown;
						
							@FindBy(xpath="//select[@id='ddlClassMethods_MasterExternalModule']")
							private static WebElement rules_ExternalModulesFuctionalNameDropdown;
					
							@FindBy(xpath="//div[contains(text(),'Update')]")
							private static WebElement rules_ExternalModulesUpdateBtn;
				
							@FindBy(xpath="//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
							private static WebElement rules_ExternalModulesSaveBtn;
				
							@FindBy(xpath="//div[contains(text(),'Edit')]")
							private static WebElement rules_ExternalModulesEditBtn;
				
							@FindBy(xpath="//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
							private static WebElement rules_ExternalModulesDeleteBtn;
				
						    @FindBy(xpath="//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
							private static WebElement rules_ExternalModulesCloseBtn;
				
					    @FindBy(xpath="//span[contains(text(),'Info Panel Customization')]")
						private static WebElement itemInfoPanelCustomizationTab;

						    @FindBy(xpath="//body[@class='custom_scrollbar']/section[@id='mainDiv']/div[@id='id_focus8_wrapper_default']/div[@class='content-wrapper']/section[@id='page_Content']/div[@class='container']/div[@id='mainLandingDiv']/div[@id='masterFirstDiv']/div[@class='tab-content']/div[@id='divLanding']/div[@id='divSecondsub']/div/div[@class='col-xs-12 col-sm-8 col-md-9 col-lg-9 padding-left-right5 mainDivCustomWidth']/div[@id='tabContent_IPCust_MasterCust']/div[@class='col-xs-12 col-sm-12 padding0']/div[@class='pull-right']/div[1]")
						    private static WebElement iteminfoPanelCust_AddBtn;
				
						    @FindBy(xpath="//div[@id='tabContent_IPCust_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
						    private static WebElement infoPanelCust_DeleteBtn;
				
						    @FindBy(xpath="//div[@id='tabContent_IPCust_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
						    private static WebElement infoPanelCust_CloseBtn;
				
						    @FindBy(xpath="//strong[contains(text(),'Credit History')]")
						    private static WebElement infoPanelCustCreditHistory;
				
						    @FindBy(xpath="//div[@id='divPanel_2']//strong[contains(text(),'Ageing Analysis')]")
						    private static WebElement infoPanelCustAgeingAnalysis;
				
						    @FindBy(xpath="//strong[contains(text(),'Ageing Analysis Base')]")
						    private static WebElement infoPanelCustAgeingAnalysisBase;
				
						    @FindBy(xpath="//strong[contains(text(),'Ageing Analysis Local')]")
						    private static WebElement infoPanelCustAgeingAnalysisLocal;
				
						    @FindBy(xpath="//strong[contains(text(),'Authorization')]")
						    private static WebElement infoPanelAuthorization;
						   
					    @FindBy(xpath="//span[@class='Flabel'][contains(text(),'Reports')]")
					    private static WebElement accountReportsTab;
							
					    @FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
					     private static WebElement extraFields_FieldDetailsCaption;   
					     
					     @FindBy(xpath="//div[@id='tab_FieldDetails_ExtraField']//div[1]//div[2]//div[1]//input[1]")
					     private static WebElement extraFields_FieldDetailsName;  
					     
					     @FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
					     private static WebElement extraFields_FieldDetailsDatTypeDropdown;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
					     private static WebElement extraFields_FieldDetailsDefaultValue;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_BannerText']")
					     private static WebElement extraFields_FieldDetailsBannerText;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_MaxSize']")
					     private static WebElement extraFields_FieldDetails_MaxSize;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_ControlType']")
					     private static WebElement extraFields_FieldDetailsControlTypeDropdown;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
					     private static WebElement extraFields_FieldDetailsToolTipText;  
					     
					    /* @FindBy(xpath="//*[@id='ExtraField_IncludeGroups']")
					     private static WebElement extraFields_FieldDetailsInCludeGroups;  
					     */

					     
					     
					     
					     
					     @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")
						 private static WebElement extraFields_OkBtn;
						    
						 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]")
						 private static WebElement extraFields_CloseBtn;
						 
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
							
						    private static String xlfile;
							private static String resPass = "Pass";
							private static String resFail = "Fail";
							private static ExcelReader excelReader;
							private static boolean methodReturnStatus;
							private static String xlSheetName = "SmokeMasters";
							private static boolean statusOfValue;
						    private static Alert alert;



		  public boolean checkSignToCheckWarehouseMastersPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
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
		  
		  
		//WAREHOUSE MASTER PAGE
		  
		  @FindBy (xpath="//*[@id='1107']/span")
		  private static WebElement warehouse;
		  
		  public static boolean checkWarehouseMasterPageIsDisplayByClickOnWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
		  {
		 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
		 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 	System.out.println("************************************ checkWarehouseMasterPageIsDisplayByClickOnWarehouseMenu ********************************************");

		 	try
		 	{
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		 		homeMenu.click();

		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		 		mastersMenu.click();

		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouse));
		 		warehouse.click();
		 	
		 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));

		 		String actUnitsTitle = accountsTitle.getText();
		 		String expUnitsTitle = excelReader.getCellData(xlSheetName, 838, 7);

		 		excelReader.setCellData(xlfile, xlSheetName, 838, 8, actUnitsTitle);
		 		
		 		System.out.println("Opening Units Master From Item Menu Title Actual Value  :" + actUnitsTitle + "     Expected Value    : " + expUnitsTitle);

		 		if (actUnitsTitle.equalsIgnoreCase(expUnitsTitle)) 
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 837, 9, resPass);
		 			return true;
		 		}
		 		else 
		 		{
		 	excelReader.setCellData(xlfile, xlSheetName, 837, 9, resFail);
		 			return false;
		 		}
		 	}
		 	catch (Exception e) 
		 	{
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 837, 10, e.getMessage());
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 		  return false;
		 	}
		  }
		   
		   
			@FindBy(xpath = "//*[@id='ulCommonlyUsedRibbon']/li/span")
			private static List<WebElement> itemRibbonControlList;
		  
		  public static boolean checkMainOptionsAvailabilityInWarhouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		 
		 	 System.out.println("************************ checkMainOptionsAvailabilityInWarhouseMasterPage Method Executes............ ****************************");

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
		 			
		 		
		         Set<String> actRibbonControl= new HashSet<String>();
		 		
		 		int count = itemRibbonControlList.size();
		 		
		 		System.err.println(" Ribbon :   "+count);
		 		
		 		for (int i=1;i<count;i++)
		 		{
		 			String data=itemRibbonControlList.get(i).getText();
		 			actRibbonControl.add(data);
		 		}
		 		
		 		String actBinsRibbon = actRibbonControl.toString();
		 		
		 		String expBinsRibbon = excelReader.getCellData(xlSheetName, 840, 7);
		 		
		 		excelReader.setCellData(xlfile, xlSheetName, 840, 8, actBinsRibbon);
		 		
		 		System.out.println("actItemRibbon  : "+actBinsRibbon);
		 		System.out.println("expItemRibbon  : "+expBinsRibbon); 
		 		
		 		
		 		
		 		
		 		if (actAccountMasterNewBtn == expAccountMasterNewBtn
		 				&& actAccountMasterAddGroupBtn == expAccountMasterAddGroupBtn
		 				&& actAccountMasterEditBtn == expAccountMasterEditBtn
		 				&& actAccountMasterCloneBtn == expAccountMasterCloneBtn
		 				&& actAccountMasterPropertiesBtn == actAccountMasterPropertiesBtn
		 				&& actAccountMasterDeleteBtn == expAccountMasterDeleteBtn
		 				&& actAccountMasterCloseBtn == expAccountMasterCloseBtn
		 				&& actAccountMasterExpandBtn == expAccountMasterExpandBtn && 
		 				
		 				actBinsRibbon.equalsIgnoreCase(expBinsRibbon))
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 839, 9, resPass);
		 			return true;
		 		} 
		 		else 
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 839, 9, resFail);
		 			return false;
		 		}
		 	  }
		 	 catch (Exception e) 
		 	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 839, 10, exception);
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
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
		   
			  
		  @FindBy(xpath ="//*[@id='ulRibbonControl']/li/span/i/parent::span")
			private static List<WebElement> itemRibbonControlExpandList;
		  
		  public static boolean checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		  
		 	 System.out.println("*********** checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInWarehouseMastersPage Method Executes............*******************");

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
		 	 	
		 		 String expItemRibbonExpand = "[Group, Delete All, Close Warehouse, Open Close Warehouse, Advance Master Import/Export, Auth Info, Move Up, Move Down, Sort, Mass Update, Export Format To XML, Customize Master, Customize View, Customize Tree, Print]";
		 		
		 		 excelReader.setCellData(xlfile, xlSheetName, 842, 8, actItemRibbonExpand);
		 		
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
		 			excelReader.setCellData(xlfile, xlSheetName, 841, 9, resPass);
		 			return true;
		 		} 
		 		else 
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 841, 9, resFail);
		 			return false;
		 		}
		 	  }
		 	 catch (Exception e) 
		 	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 841, 10, exception);
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		 		  return false;
		 	  }
		   }

		  
		  
		  @FindBy(xpath = "//i[@class='icon-font6 icon-custamize']")
			public static WebElement masterCustamizeMasterBtn;
		  
		  
		  public static boolean checkOtherToolsOptionsAvailabilityInWarehouseMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
		 	 	
		 		 String expItemRibbonExpand = "[, , , , Advance Master Import/Export, Auth Info, Move Up, Move Down, Sort, Mass Update, Export Format To XML, Customize Master, Customize View, Customize Tree, Print]";
		 		
		 		 excelReader.setCellData(xlfile, xlSheetName, 844, 8, actItemRibbonExpand);
		 		
		 		 System.out.println("actItemRibbonExpand   : "+actItemRibbonExpand);
		 		
		 		 System.out.println("expItemRibbonExpand   : "+expItemRibbonExpand);
		 		
		 		
		 		
		 		if (actSummaryErrorMessage==expSummaryErrorMessage 
		 				&& actAccountMasterCustomizeMasterBtn == expAccountMasterCustomizeMasterBtn
		 				&& actAccountMasterCustomizeViewBtn == expAccountMasterCustomizeViewBtn
		 				&& actAccountMasterCustomizeTreeBtn == expAccountMasterCustomizeTreeBtn
		 				&& actItemRibbonExpand.equalsIgnoreCase(expItemRibbonExpand))
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 843, 9, resPass);
		 			return true;
		 		} 
		 		else 
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 843, 9, resFail);
		 			return false;
		 		}
		 	  }
		 	 catch (Exception e) 
		 	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 843, 10, e.getMessage());
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 		  return false;
		 	  }
		   }
		 	
		  

		  public static boolean checkTreeViewOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		  
		 	 System.out.println("********************  checkTreeViewOptionsAvailableInWarehouseMastersPage Method Executes............ *****************************");

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
		 		String expAccountMasterTreeIdDropdownGetText                    = excelReader.getCellData(xlSheetName, 846, 7);
		 		                                                        
		 		boolean expAccountMasterTreeIDToggleBtnIsDisplay                = true;
		 		boolean expAccountMasterTreeViewIDDropdownIsDisplay             = true;
		 		String expAccountMasterTreeViewIDDropdownGetText                = excelReader.getCellData(xlSheetName, 847, 7);
		 		
		 		boolean expAccountMasterTreeViewIDToggleBtnIsDisplay            = true;
		 		boolean expAccountMasterHideAccountsGroupTreeIsDisplay          = true;
		 		

		 		System.out.println("Tree ID Dropdown Option Value Actual      : " +actAccountMasterTreeIdDropdownIsDisplay    +" Value Expected : " + expAccountMasterTreeIdDropdownIsDisplay);
		 		System.out.println("Tree ID Dropdown Option Value Actual      : " +actAccountMasterTreeIdDropdownGetText      +" Value Expected : " + expAccountMasterTreeIdDropdownGetText);
		 		
		 		System.out.println("Tree ID Toggle Option Value Actual        : " +actAccountMasterTreeIDToggleBtnIsDisplay   +" Value Expected : " + expAccountMasterTreeIDToggleBtnIsDisplay);
		 	
		 		
		 		System.out.println("Tree View ID Option Value Actual          : " +actAccountMasterTreeViewIDDropdownIsDisplay +" Value Expected : " + expAccountMasterTreeViewIDDropdownIsDisplay);
		 		System.out.println("Tree View ID Option Value Actual          : " +actAccountMasterTreeViewIDDropdownGetText   +" Value Expected : " + expAccountMasterTreeViewIDDropdownGetText);
		 		
		 		System.out.println("Tree View ID Toggle Value Actual          : " +actAccountMasterTreeViewIDToggleBtnIsDisplay +" Value Expected : " + expAccountMasterTreeViewIDToggleBtnIsDisplay);
		 		
		 		
		 		System.out.println("Hide Accounts Group Tree Value Actual     : " +actAccountMasterHideAccountsGroupTreeIsDisplay+" Value Expected : " + expAccountMasterHideAccountsGroupTreeIsDisplay);
		 		
		         excelReader.setCellData(xlfile, xlSheetName, 846, 8, actAccountMasterTreeIdDropdownGetText);
		 		
		 		excelReader.setCellData(xlfile, xlSheetName, 847, 8, actAccountMasterTreeViewIDDropdownGetText);
		 		
		 		
		 		if ( actAccountMasterTreeIdDropdownIsDisplay == expAccountMasterTreeIdDropdownIsDisplay
		 				&& actAccountMasterTreeIDToggleBtnIsDisplay == expAccountMasterTreeIDToggleBtnIsDisplay
		 				&& actAccountMasterTreeViewIDDropdownIsDisplay == expAccountMasterTreeViewIDDropdownIsDisplay
		 				&& actAccountMasterTreeViewIDToggleBtnIsDisplay == expAccountMasterTreeViewIDToggleBtnIsDisplay
		 				&& actAccountMasterHideAccountsGroupTreeIsDisplay == expAccountMasterHideAccountsGroupTreeIsDisplay && 
		 				
		 				actAccountMasterTreeIdDropdownGetText.equalsIgnoreCase(expAccountMasterTreeIdDropdownGetText) && 
		 				 
		 				actAccountMasterTreeViewIDDropdownGetText.equalsIgnoreCase(expAccountMasterTreeViewIDDropdownGetText))
		 				 
		 				
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 845, 9, resPass);
		 			return true;
		 		} 
		 		else 
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 845, 9, resFail);
		 			return false;
		 		}
		 	  }
		 	 catch (Exception e) 
		 	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 845, 10, exception);
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		 		  return false;
		 	  }
		   }
		 	

		  
		  @FindBy(xpath = "//*[@id='0']/a")
			private static WebElement accountRootAccount;
		  
		  public static boolean checkDisplayOfGroupAvailableTreeStructureLeftPageWarehouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		  
		 	 System.out.println("**************************  checkDisplayOfGroupAvailableTreeStructureLeftPageWarehouseMasterPage Method Executes............  *******************************");
		     
		 	 try
		 	 {
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));

		 		boolean actUnitsMasterRoot                = accountRootAccount.isDisplayed();
		 		//boolean actBinGroupOneMasterRoot          = warehouseGroupDisplayInTree.isDisplayed();
		 		
		 		boolean expUnitsMasterRoot                = true;
		 		//boolean expBinGroupOneMasterRoot          = true;
		 		
		 		System.out.println("Warehouse Root Is Display Value Actual        : " + actUnitsMasterRoot+       " Value Expected : " + expUnitsMasterRoot);
		 		//System.out.println("Root Warehouse Group One Display Value Actual : " + actBinGroupOneMasterRoot+ " Value Expected : " + expBinGroupOneMasterRoot);
		 		
		 		String actUnitRootName                    = accountRootAccount.getText();
		 		//String actBinOneGroupRootName             = warehouseGroupDisplayInTree.getText();
		 			
		 		excelReader.setCellData(xlfile, xlSheetName, 849, 8, actUnitRootName);
		 		//excelReader.setCellData(xlfile, xlSheetName, 850, 8, actBinOneGroupRootName);
		 		
		 		String expUnitRootName                    = excelReader.getCellData(xlSheetName, 849, 7);
		 		//String expBinOneGroupRootName             = excelReader.getCellData(xlSheetName, 850, 7);
		 		
		 		System.out.println("Bin Root Text Is Display Value Actual   : " + actUnitsMasterRoot+   " Value Expected : " + expUnitsMasterRoot);
		 		System.out.println("Bin Group One Text Display Value Actual : " + actUnitRootName+      " Value Expected : " + expUnitRootName);
		 		
		 			
		 		if (actUnitsMasterRoot == expUnitsMasterRoot/* && actBinGroupOneMasterRoot==expBinGroupOneMasterRoot*/
		 		    	&& actUnitRootName.equalsIgnoreCase(expUnitRootName)
		 				/*&& actBinOneGroupRootName.equalsIgnoreCase(expBinOneGroupRootName)*/)
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 848, 9, resPass);
		 			return true;
		 		} 
		 		else 
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 848, 9, resFail);
		 			return false;
		 		}
		 	  }
		 	 catch (Exception e) 
		 	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 848, 10, exception);
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		 		  return false;
		 	  }
		   }

		  
		  @FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li")
		  private static List<WebElement> mastertreeIdList;

		  public static boolean checkCreateTreeToggleOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 	 
		 	 System.out.println("********************* checkCreateTreeToggleOptionsAvailableInWarehouseMastersPage Method Executes............ *******************************");
		     
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
		 			String expMasterIDExpand = excelReader.getCellData(xlSheetName, 852, 7);
		 			
		 			excelReader.setCellData(xlfile, xlSheetName, 852, 8, actMasterIDExpand);
		 			
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
		 	 			excelReader.setCellData(xlfile, xlSheetName, 851, 9, resPass);
		 	 			return true;
		 	 		} 
		 	 		else 
		 	 		{
		 	 			excelReader.setCellData(xlfile, xlSheetName, 851, 9, resFail);
		 	 			return false;
		 	 		}
		 	 	  }
		 	 	 catch (Exception e) 
		 		  {
		 			  String exception =e.getMessage();
		 			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 851, 10, exception);
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
			
		  public static boolean checkCreateViewToggleOptionsAvailableWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		  
		 	 System.out.println("********************** checkCreateViewToggleOptionsAvailableWarehouseMastersPage Method Executes............***********************************");

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
		 		String expMasterViewIDExpand = excelReader.getCellData(xlSheetName, 854, 7);
		 		
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

		 		excelReader.setCellData(xlfile, xlSheetName, 854, 8, actMasterViewIDExpand);
		 		
		 		if (actAccountMasterTreeViewCreateViewBtn == expAccountMasterTreeViewCreateViewBtn
		 				&& actAccountMasterTreeViewEditViewBtn == expAccountMasterTreeViewEditViewBtn
		 				&& actAccountMasterTreeViewDeleteBtn == expAccountMasterTreeViewDeleteBtn && 
		 				
		 				actMasterViewIDExpand.equalsIgnoreCase(expMasterViewIDExpand))
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 853, 9, resPass);
		 			return true;
		 		} 
		 		else 
		 		{
		 			excelReader.setCellData(xlfile, xlSheetName, 853, 9, resPass);
		 			return false;
		 		}
		 	  }
		 	  catch (Exception e) 
		 	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 853, 10, exception);
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		 		  return false;
		 	  }
		  }
		 	
		 	
		  @FindBy(xpath = "//div[@id='divTreeMenu']")
			private static WebElement treeUnitsDisplay;
		  
		  public static boolean checkHideUnitGroupOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		  
		 	 System.out.println("********************* checkHideUnitGroupOptionsAvailableInWarehouseMastersPage Method Executes............*************************");

		 	 try
		 	 {
		 	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
		 	   masterOptionToHideAccountsGroupTree.click();
		 	   
		 	   boolean SummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
		 	  
		        String actSummaryErrorMessage=Boolean.toString(SummaryErrorMessage);
		        String expSummaryErrorMessage=excelReader.getCellData(xlSheetName, 856, 7);
		 	   

		         excelReader.setCellData(xlfile, xlSheetName, 856, 8, actSummaryErrorMessage.toUpperCase());
		        
		 	   System.out.println("Click on Hide Units Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);  

		 	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeUnitsDisplay));

		 	   boolean AccountMasterTreeUnits = treeUnitsDisplay.isDisplayed();
		 	   
		 	   String actAccountMasterTreeUnits=Boolean.toString(AccountMasterTreeUnits);
		 	   String expAccountMasterTreeUnits=excelReader.getCellData(xlSheetName, 857, 7);

		        excelReader.setCellData(xlfile, xlSheetName, 857, 8, actAccountMasterTreeUnits.toUpperCase());
		 	   
		 	   System.out.println("Tree View Create View Option Value Actual : " + actAccountMasterTreeUnits+ " Value Expected : " + expAccountMasterTreeUnits);

		 	   if (actAccountMasterTreeUnits.equalsIgnoreCase(expAccountMasterTreeUnits) && actSummaryErrorMessage.equalsIgnoreCase(expSummaryErrorMessage))
		 	   {
		 		   excelReader.setCellData(xlfile, xlSheetName, 855, 9, resPass);
		 			return true;
		 	   } 
		 	   else 
		 	   {
		 		   excelReader.setCellData(xlfile, xlSheetName, 855, 9, resFail);
		 			return false;
		 	   }
		 	 }
		 	 catch (Exception e) 
		 	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 855, 10, exception);
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		 		  return false;
		 	  }
		  }
		 	
		 	
		  public static boolean checkUnHideUnitsGroupOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		  
		 	 System.out.println("********************** checkUnHideUnitsGroupOptionsAvailableInWarehouseMastersPage Method Executes............ ******************************");
		    
		 	 try
		 	 {
		 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
		 		 masterOptionToHideAccountsGroupTree.click();
		 		 
		 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));
		 	 
		 		 boolean actUnitsMasterRoot                = accountRootAccount.isDisplayed();	
		 		 String actUnitRootName=accountRootAccount.getText();
		 		
		 		 boolean expUnitsMasterRoot                = true;
		 		 String expUnitRootName                    =excelReader.getCellData(xlSheetName, 859, 7);

		 		 excelReader.setCellData(xlfile, xlSheetName, 859, 8, actUnitRootName);
		 		 
		 		 System.out.println("Open Units Master Unit Root Is Display Value Actual  : " + actUnitsMasterRoot+ " Value Expected : " + expUnitsMasterRoot);
		 		 System.out.println("Root Units Text Display Value Actual                 : " + actUnitRootName+    " Value Expected : " + expUnitRootName);
		 			
		 		 if (actUnitsMasterRoot == expUnitsMasterRoot
		 				&& actUnitRootName.equalsIgnoreCase(expUnitRootName))
		 		 {
		 			 excelReader.setCellData(xlfile, xlSheetName, 858, 9, resPass);
		 			return true;
		 		 } 
		 		 else 
		 		 {
		 			 excelReader.setCellData(xlfile, xlSheetName, 858, 9, resFail);
		 			return false;
		 		 }
		 	  }
		 	 catch (Exception e) 
		 	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 858, 10, exception);
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		 		  return false;
		 	  }
		   }
		 	
		  
		  @FindBy(xpath = "//*[@id='cmbUserTypeMaster_input_settings']/span")
		  public static WebElement masterCumMasterSettingBtn;
		  
		  @FindBy(xpath="//*[@id='divSearchControls']/div//div/a")
		  private static List<WebElement> masterItemSearchControlList;
		  
		  public static boolean checkHeaderFieldsOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		  
		 	 System.out.println("********************** checkHeaderFieldsOptionsAvailableInWarehouseMastersPage Method Executes............ **********************************");

		 	 try
		  	 {
		  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));

		  		
		  		String actAccountMasterSearchGetText               = masterSearchTxt.getAttribute("placeholder");
		  		
		  		String expAccountMasterSearchGetText               = excelReader.getCellData(xlSheetName, 861, 7);
		  		
		  		
		  		excelReader.setCellData(xlfile, xlSheetName, 861, 8, actAccountMasterSearchGetText);
		  		
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
		   		String expControlList = excelReader.getCellData(xlSheetName, 862, 7);
		   		
		   		System.out.println("actControlList   : "+actControlList);
		   		System.out.println("expControlList   : "+expControlList);

		   		excelReader.setCellData(xlfile, xlSheetName, 862, 8, actControlList);
		   		
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
		  		String expDispalyResult=excelReader.getCellData(xlSheetName, 863, 7);	
		  		
		  		System.err.println("DispalyResult  "+actDispalyResult +" Value Expected : "+expDispalyResult);
		  		
		  		excelReader.setCellData(xlfile, xlSheetName, 863, 8, actDispalyResult.toUpperCase());
		  		
		  		
		  		if(actDispalyResult.equalsIgnoreCase(expDispalyResult) && actControlList.equalsIgnoreCase(expControlList) 
		  				&& actAccountMasterSearchGetText.equalsIgnoreCase(expAccountMasterSearchGetText)) 
		  		
		  		{
		  			 excelReader.setCellData(xlfile, xlSheetName, 860, 9, resPass);
		  			return true;
		  		} 
		  		else 
		  		{
		  			 excelReader.setCellData(xlfile, xlSheetName, 860, 9, resFail);
		  			return false;
		  		}
		  	
		  	 
		  	 }
		  	 catch (Exception e) 
		 	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 860, 10, exception);
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		 		  return false;
		 	  }
		  }
		 	
		 	
		  @FindBy(xpath="//*[@id='btnSearchAcc']/ol/li")
		  private static List<WebElement> masterSearchList;  
		  
		  public static boolean checkSearchOptionAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		  
		 	 System.out.println("*************************** checkSearchOptionAvailableInWarehouseMastersPage Method Executes............ ********************************");
		 	 try
		  	 {
		  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));
		  		masterSearchBtn.click();

		  		boolean SummaryErrorMessage                      = checkErrorMessageIsDisplayingOrNotDisplaying();
		  		
		         String actSummaryErrorMessage=Boolean.toString(SummaryErrorMessage);
		         String expSummaryErrorMessage=excelReader.getCellData(xlSheetName, 865, 7);
		  		
		         excelReader.setCellData(xlfile, xlSheetName, 865, 8, actSummaryErrorMessage.toUpperCase());
		  		
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
		   		String expSearchList = excelReader.getCellData(xlSheetName, 866, 7);
		   		
		   		System.out.println("actSearchList   : "+actSearchList);
		   		System.out.println("expSearchList   : "+expSearchList);
		  		
		   		excelReader.setCellData(xlfile, xlSheetName, 866, 8, actSearchList);
		   		
		  		if (actSearchList.equalsIgnoreCase(expSearchList) && actSummaryErrorMessage.equalsIgnoreCase(expSummaryErrorMessage))
		  		{
		  			excelReader.setCellData(xlfile, xlSheetName, 864, 9, resPass);
		  			return true;
		  		} 
		  		else 
		  		{
		  			 excelReader.setCellData(xlfile, xlSheetName, 864, 9, resFail);
		  			return false;
		  		}
		  	 }
		  	catch (Exception e) 
		 	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 864, 10, exception);
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		 		  return false;
		 	  }
		   }
		  
		  
		  @FindBy(xpath = "//th[2]//span[1]")
		  public static WebElement masterGrid_Header_SelectTxt;
		 
		  
		  @FindBy(xpath ="//*[@id='landgridData']/thead/tr/th")
			public static List<WebElement> masterItemHeaderList;
			
		  public static boolean checkWarehouseMastersDisplayTableColumnNamesAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		  		 
		 	 System.out.println("************************* checkWarehouseMastersDisplayTableColumnNamesAvailableInWarehouseMastersPage Method Executes............ *************************");
		 		
		 	 try
		  	 {
		  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGrid_Header_SelectTxt));
		  		boolean actAccountMasterGridSelectTxt = masterGrid_Header_SelectTxt.isDisplayed();
		  		masterGrid_Header_SelectTxt.click();

		  		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
		  		boolean expSummaryErrorMessage  = true;

		  		System.out.println("Click on Master Grid Header Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
		  		
		  		
		  		ArrayList<String> actmasterItemHeaderList=new ArrayList<String>();
		  		
		  		int HeaderCount =masterItemHeaderList.size();
		  		
		  		System.err.println("HeaderCount   :  "+HeaderCount);
		  		
		  		for (int i = 0; i < HeaderCount; i++) 
		  		{
		 			String data=masterItemHeaderList.get(i).getText();
		 			actmasterItemHeaderList.add(data);
		 		}
		  	
		  		 String actMasterItemHeaderTextList=actmasterItemHeaderList.toString();
		  		 String expMasterItemHeaderTextList=excelReader.getCellData(xlSheetName, 868, 7);
		  		
		  		
		  		excelReader.setCellData(xlfile, xlSheetName, 868, 8, actMasterItemHeaderTextList);
		  		
		  		if (actSummaryErrorMessage==expSummaryErrorMessage && actMasterItemHeaderTextList.equalsIgnoreCase(expMasterItemHeaderTextList))
		  		{
		  			excelReader.setCellData(xlfile, xlSheetName, 867, 9, resPass);
		  			return true;
		  		} 
		  		else 
		  		{
		  			excelReader.setCellData(xlfile, xlSheetName, 867, 9, resFail);
		  			return false;
		  		}
		  	 }
		  	 catch (Exception e) 
		  	  {
		 		  String exception =e.getMessage();
		 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 867, 10, exception);
		 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		 		  return false;
		 	  }
		   }
		 	

		  public static boolean checkWarehouseMastersDisplayTableColumnValuesAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
		    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 		  		 
		    System.out.println("********************** checkWarehouseMastersDisplayTableColumnValuesAvailableInWarehouseMastersPage Method Executes............ **************************");
		 	
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
		    
		   
		  
		 	@FindBy(xpath = "//*[@id='iBins']")
		 	private static WebElement binsCombobox;

		 	@FindBy(xpath = "//*[@id='iPhysInventoryCountingFrequency']")
		 	private static WebElement physicalInventoryCountingFrequency;

		 	@FindBy(xpath = "//*[@id='iWarehouseType']")
		 	private static WebElement warehouseType;

		 	@FindBy(xpath = "//*[@id='bDontMaintainBin']")
		 	private static WebElement doNotMain;
		 	
		 	
		 	
		 	
		 	
		 	
		 	  
		 	
		 	//Customization of warehouse master where bins option to be enabled
		 	
		 	@FindBy(xpath="//i[@class='icon-font6 icon-custamize']")
		 	public static WebElement masterCustamizemasterBtn; 
		 	
		 	
		 			public static boolean checkCustomizeMasterTabOptionInWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 			{

		 				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 				 		 
		 			    /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 			 
		 			     masterRibbonToExpandOptions.click();*/
		 			     	     
		 			     //Thread.sleep(3000);
		 				 
		 		         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
		 				 
		 		         masterRibbonControlNextBtn.click();
		 				 
		 				 //Thread.sleep(3000);
		 				 		 
		 				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		 				 
		 				 masterCustamizemasterBtn.click();
		 				 
		 				 //Thread.sleep(3000);
		 			     
		 				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minusBtn));			 
		 				 minusBtn.click();

		 				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(plusBtn));
		 				 
		 				 boolean actplusBtn                                 = plusBtn.isDisplayed();
		 				 boolean actmasterFieldsOption                      = masterFieldsOption.isDisplayed();
		 				 boolean actaccUniqueConstraintsOption              = accountMasterFieldsUniqueConstraintsOption.isDisplayed();
		 				 boolean actRulesOption                             = RulesOption.isDisplayed();
		 				 boolean actrules_ExternalModules                   = rules_ExternalModules.isDisplayed();
		 				 boolean actitemInfoPanelCustomizationTab           = itemInfoPanelCustomizationTab.isDisplayed();
		 				 boolean actaccountReportsTab                       = accountReportsTab.isDisplayed();
		 				 
		 				 boolean expplusBtn                                 = true;
		 				 boolean expmasterFieldsOption                      = true;
		 				 boolean expaccUniqueConstraintsOption              = true;
		 				 boolean expRulesOption                             = true;
		 				 boolean exprules_ExternalModules                   = true;
		 				 boolean expitemInfoPanelCustomizationTab           = true;
		 				 boolean expaccountReportsTab                       = true;
		 				 
		 				 System.out.println("********************************checkCustomizeMasterTabOption****************************");
		 				 
		 				 System.out.println("plusBtn                          "+actplusBtn                       +" Value Excepted   :"+expplusBtn);
		 				 System.out.println("masterFieldsOption               "+actmasterFieldsOption            +" Value Excepted   :"+expmasterFieldsOption);
		 				 System.out.println("accUniqueConstraintsOption       "+actaccUniqueConstraintsOption    +" Value Excepted   :"+expaccUniqueConstraintsOption);
		 				 System.out.println("RulesOption                      "+actRulesOption                   +" Value Excepted   :"+expRulesOption);
		 				 System.out.println("rules_ExternalModules            "+actrules_ExternalModules         +" Value Excepted   :"+exprules_ExternalModules);
		 				 System.out.println("itemInfoPanelCustomizationTab    "+actitemInfoPanelCustomizationTab +" Value Excepted   :"+expitemInfoPanelCustomizationTab);
		 				 System.out.println("accountReportsTab                "+actaccountReportsTab             +" Value Excepted   :"+expaccountReportsTab);
		 				 
		 				 if (actplusBtn==expplusBtn && actmasterFieldsOption==expmasterFieldsOption && actaccUniqueConstraintsOption==expaccUniqueConstraintsOption && 
		 						 actRulesOption==expRulesOption && actrules_ExternalModules==exprules_ExternalModules && actitemInfoPanelCustomizationTab==expitemInfoPanelCustomizationTab && 
		 						 actaccountReportsTab==expaccountReportsTab)
		 				 {
		 					 
		 					 excelReader.setCellData(xlfile, "Sheet1", 680, 9, resPass);
		 					 return true;
		 				 }
		 				 else
		 				 {
		 					 excelReader.setCellData(xlfile, "Sheet1", 680, 9, resFail);
		 					 return false;
		 				 }
		 		      }

		 		
		 			public static boolean checkCustomizeMasterTabMasterFieldsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 			{

		 				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 				
		 				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(plusBtn));				 
		 				 plusBtn.click();
		 				 
		 				 //Thread.sleep(3000);

		 				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));
		 				 boolean actgeneralTab                   = generalTab.isDisplayed();
		 				 boolean actgeneralMainTab               = generalMainTab.isDisplayed();
		 				 boolean actgeneralHeaderDetailsTab      = generalHeaderDetailsTab.isDisplayed();
		 				 
		 				 
		 				 boolean expgeneralTab                   = true;
		 				 boolean expgeneralMainTab               = true;
		 				 boolean expgeneralHeaderDetailsTab      = true;
		 				
		 				 
		 				 System.out.println("*************************************checkCustomizeMasterTabMasterFieldsOption***********************************");
		 				 
		 				 System.out.println("generalTab                 : "+actgeneralTab               +" Value Expected : "+expgeneralTab);
		 				 System.out.println("generalMainTab             : "+actgeneralMainTab           +" Value Expected : "+expgeneralMainTab);
		 				 System.out.println("generalHeaderDetailsTab    : "+actgeneralHeaderDetailsTab  +" Value Expected : "+expgeneralHeaderDetailsTab);
		 				
		 				 
		 				 if(actgeneralTab==expgeneralTab && actgeneralMainTab==expgeneralMainTab
		 						 && actgeneralHeaderDetailsTab==expgeneralHeaderDetailsTab)
		 				 {
		 					 excelReader.setCellData(xlfile, "Sheet1", 681, 9, resPass);
		 					 return true;
		 				 }
		 				 else
		 				 {
		 					 excelReader.setCellData(xlfile, "Sheet1", 681, 9, resFail);
		 					 return false;
		 				 }
		 		      }
		 			
		 			public static boolean checkGeneralTabOptionMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 			{

		 				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 			 
		 				
		 				 
		 				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountCustomizeName));
		 				 
		 				 boolean actaccountCustomizeName          =accountCustomizeName.isDisplayed();
		 				 boolean actaccountCustomizeCode          =accountCustomizeCode.isDisplayed();
		 				 boolean actaccountSaveBtn                =accountSaveBtn.isDisplayed();
		 				 boolean actaccountHeaderPreview          =accountHeaderPreview.isDisplayed();
		 				 boolean actaccountCloseBtn               =accountCloseBtn.isDisplayed();
		 				 
		 				 boolean expaccountCustomizeName          =true;
		 				 boolean expaccountCustomizeCode          =true;
		 				 boolean expaccountSaveBtn                =true;
		 				 boolean expaccountHeaderPreview          =true;
		 				 boolean expaccountCloseBtn              =true;
		 				 
		 				 System.out.println("*******************************checkGeneralTabOptionMainTabInCustomizeMaster***************************");
		 				 
		 				 System.out.println("accountCustomizeName         : "+actaccountCustomizeName     +" value Expected : "+expaccountCustomizeName);
		 				 System.out.println("accountCustomizeCode         : "+actaccountCustomizeCode     +" value Expected : "+expaccountCustomizeCode);
		 				 System.out.println("accountSaveBtn               : "+actaccountSaveBtn           +" value Expected : "+expaccountSaveBtn);
		 				 System.out.println("accountHeaderPreview         : "+actaccountHeaderPreview     +" value Expected : "+expaccountHeaderPreview);
		 				 System.out.println("accountCloseBtn              : "+actaccountCloseBtn          +" value Expected : "+expaccountCloseBtn);
		 				 
		 				 if(actaccountCustomizeName==expaccountCustomizeName && actaccountCustomizeCode==expaccountCustomizeCode
		 						 && actaccountSaveBtn==expaccountSaveBtn && actaccountHeaderPreview==expaccountHeaderPreview
		 						 && actaccountCloseBtn==expaccountCloseBtn)
		 				 {
		 					 excelReader.setCellData(xlfile, "Sheet1", 682, 9, resPass);
		 					 return true;
		 				 }
		 				 else
		 				 {
		 					 excelReader.setCellData(xlfile, "Sheet1", 682, 9, resFail);
		 					 return false;
		 				 }
		 		      }
		 			

		 			
		 			@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/table/tbody/tr[1]/td[4]")
		 			private static WebElement warehouseHeaderDetailsBins;

		 			@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/table/tbody/tr[2]/td[4]")
		 			private static WebElement warehouseHeaderDetailsPhysInventory;

		 			@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/table/tbody/tr[3]/td[4]")
		 			private static WebElement warehouseHeaderDetailsWarehouse;
		 			
		 			@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/table/tbody/tr[4]/td[4]")
		 			private static WebElement warehouseHeaderDetailsDonotMaintainStocks;

		 			
		 			public static boolean checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 			{

		 				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 			 
		 				 
		 				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalHeaderDetailsTab));
		 				 
		 				 generalHeaderDetailsTab.click();
		 				
		 				 //Thread.sleep(3000);
		 				 
		 				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseHeaderDetailsBins));
		 				 
		 				 boolean actwarehouseHeaderDetailsBins                  = warehouseHeaderDetailsBins.isDisplayed();
		 				 boolean actwarehouseHeaderDetailsPhysInventory         = warehouseHeaderDetailsPhysInventory.isDisplayed();
		 				 boolean actwarehouseHeaderDetailsWarehouse             = warehouseHeaderDetailsWarehouse.isDisplayed();
		 				 boolean actwarehouseHeaderDetailsDonotMaintainStocks   = warehouseHeaderDetailsDonotMaintainStocks.isDisplayed();
		 				
		 				 
		 				 boolean expwarehouseHeaderDetailsBins                   = true;
		 				 boolean expwarehouseHeaderDetailsPhysInventory          = true;
		 				 boolean expwarehouseHeaderDetailsWarehouse              = true;
		 				 boolean expwarehouseHeaderDetailsDonotMaintainStocks    = true;
		 			
		 				 
		 				 System.out.println("*******************************checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster***************************");
		 				 
		 				 System.out.println("warehouseHeaderDetailsBins                 : "+actwarehouseHeaderDetailsBins               +" value Expected : "+expwarehouseHeaderDetailsBins);
		 				 System.out.println("warehouseHeaderDetailsPhysInventory        : "+actwarehouseHeaderDetailsPhysInventory      +" value Expected : "+expwarehouseHeaderDetailsPhysInventory);
		 				 System.out.println("warehouseHeaderDetailsWarehouse            : "+actwarehouseHeaderDetailsWarehouse          +" value Expected : "+expwarehouseHeaderDetailsWarehouse);
		 				 System.out.println("warehouseHeaderDetailsDonotMaintainStocks  : "+actwarehouseHeaderDetailsDonotMaintainStocks+" value Expected : "+expwarehouseHeaderDetailsDonotMaintainStocks);
		 				 
		 				 
		 				 if(actwarehouseHeaderDetailsBins==expwarehouseHeaderDetailsBins && actwarehouseHeaderDetailsPhysInventory==expwarehouseHeaderDetailsPhysInventory &&
		 						 actwarehouseHeaderDetailsWarehouse==expwarehouseHeaderDetailsWarehouse && 
		 						 actwarehouseHeaderDetailsDonotMaintainStocks==expwarehouseHeaderDetailsDonotMaintainStocks)
		 				 {
		 					 excelReader.setCellData(xlfile, "Sheet1", 683, 9, resPass);
		 					 return true;
		 				 }
		 				 else
		 				 {
		 					 excelReader.setCellData(xlfile, "Sheet1", 683, 9, resFail);
		 					 return false;
		 				 }
		 		      }
		 			

		 			
		 			@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/table/tbody/tr[1]/td[1]/i[1]")
		 			private static WebElement warehouseHeaderDetailsBinsEdit;
		 			
		 		     @FindBy(xpath="//*[@id='ExtraField_IncludeGroups']")
		 		     private static WebElement extraFields_FieldDetailsInCludeGroups;  
		 		
		 			public static boolean checkEditBinInMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 			{

		 				excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseHeaderDetailsBinsEdit));
		 				 
		 				warehouseHeaderDetailsBinsEdit.click();

		 				//Thread.sleep(3000);
		 	             
		 	            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		 	             
		 	            boolean actextraFields_FieldDetailsCaption   				=extraFields_FieldDetailsCaption.isDisplayed();
		 	         	boolean actextraFields_FieldDetailsName   					=extraFields_FieldDetailsName.isDisplayed();
		 	         	boolean actextraFields_FieldDetailsDatTypeDropdown   		=extraFields_FieldDetailsDatTypeDropdown.isDisplayed();
		 	         	boolean actextraFields_FieldDetailsBannerText   			=extraFields_FieldDetailsBannerText.isDisplayed();
		 	         	boolean actextraFields_FieldDetails_MaxSize   				=extraFields_FieldDetails_MaxSize.isDisplayed();
		 	         	boolean actextraFields_FieldDetailsControlTypeDropdown   	=extraFields_FieldDetailsControlTypeDropdown.isDisplayed();
		 	         	boolean actextraFields_FieldDetailsToolTipText   			=extraFields_FieldDetailsToolTipText.isDisplayed();
		 	         	boolean actextraFields_FieldDetailsInCludeGroups   	         =extraFields_FieldDetailsInCludeGroups.isDisplayed();
		 	         
		 	         	
		 	         	boolean expextraFields_FieldDetailsCaption   				=true;
		 	         	boolean expextraFields_FieldDetailsName   					=true;
		 	         	boolean expextraFields_FieldDetailsDatTypeDropdown   		=true;
		 	         	boolean expextraFields_FieldDetailsBannerText   			=true;
		 	         	boolean expextraFields_FieldDetails_MaxSize   				=true;
		 	         	boolean expextraFields_FieldDetailsControlTypeDropdown   	=true;
		 	         	boolean expextraFields_FieldDetailsToolTipText   			=true;
		 	         	boolean expextraFields_FieldDetailsInCludeGroups   	        =true;
		 	         	
		 	         	
		 	         	System.out.println("************************checkFieldsDetailsTabInCreateCreateTabDisplayInCustomizeTab********************************");
		 	         	
		 	         	System.out.println("extraFields_FieldDetailsCaption                : "+actextraFields_FieldDetailsCaption               +" Value Expected : "+expextraFields_FieldDetailsCaption);
		 	         	System.out.println("extraFields_FieldDetailsName                   : "+actextraFields_FieldDetailsName                  +" Value Expected : "+expextraFields_FieldDetailsName);
		 	         	System.out.println("extraFields_FieldDetailsDatTypeDropdown        : "+actextraFields_FieldDetailsDatTypeDropdown       +" Value Expected : "+expextraFields_FieldDetailsDatTypeDropdown);
		 	         	System.out.println("extraFields_FieldDetailsBannerText             : "+actextraFields_FieldDetailsBannerText            +" Value Expected : "+expextraFields_FieldDetailsBannerText);
		 	         	System.out.println("extraFields_FieldDetails_MaxSize               : "+actextraFields_FieldDetails_MaxSize              +" Value Expected : "+expextraFields_FieldDetails_MaxSize);
		 	         	System.out.println("extraFields_FieldDetailsControlTypeDropdown    : "+actextraFields_FieldDetailsControlTypeDropdown   +" Value Expected : "+expextraFields_FieldDetailsControlTypeDropdown);
		 	         	System.out.println("extraFields_FieldDetailsToolTipText            : "+actextraFields_FieldDetailsToolTipText           +" Value Expected : "+expextraFields_FieldDetailsToolTipText);
		 	         	System.out.println("extraFields_FieldDetailsInCludeGroups          : "+actextraFields_FieldDetailsInCludeGroups         +" Value Expected : "+expextraFields_FieldDetailsInCludeGroups);
		 	         	
		 	                  
		 	         	if(actextraFields_FieldDetailsCaption==expextraFields_FieldDetailsCaption && actextraFields_FieldDetailsName==expextraFields_FieldDetailsName
		 	         			&& actextraFields_FieldDetailsDatTypeDropdown==expextraFields_FieldDetailsDatTypeDropdown
		 	         			&& actextraFields_FieldDetailsBannerText==expextraFields_FieldDetailsBannerText
		 	         			&& actextraFields_FieldDetails_MaxSize==expextraFields_FieldDetails_MaxSize
		 	         			&& actextraFields_FieldDetailsControlTypeDropdown==expextraFields_FieldDetailsControlTypeDropdown
		 	         			&& actextraFields_FieldDetailsToolTipText==expextraFields_FieldDetailsToolTipText
		 	         			&& actextraFields_FieldDetailsInCludeGroups==expextraFields_FieldDetailsInCludeGroups)
		 	 	   		{
		 					 excelReader.setCellData(xlfile, "Sheet1", 684, 9, resPass);
		 					 return true;
		 				 }
		 				 else
		 				 {
		 					 excelReader.setCellData(xlfile, "Sheet1", 684, 9, resFail);
		 					 return false;
		 				 }
		 		      }
		 			
		 			

		 			@FindBy(xpath="//div[@class='theme_color font-6']")
		 			public static WebElement errorMessage;
		 			
		 			@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
		 			public static WebElement errorMessageCloseBtn;
		 			
		 			public static String checkValidationMessageInWhM(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
		 				

		 			@FindBy(xpath = "//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
		 			private static WebElement extraFields_PropertiesTab;
		 			
		 			@FindBy(xpath = "//*[@id='FieldsDetails_IsHidden']")
		 			private static WebElement extraFields_PropertiesHiddenChekbox;
		 			
		 			@FindBy(xpath = "//*[@id='FieldsDetails_HiddenInGroup']")
		 			private static WebElement extraFields_PropertiesHiddenInGroupChekbox;
		 			
		 			public static boolean checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 		     {
		 	   			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	   			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 	   			
		 	   			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsInCludeGroups));
		 	   			 
		 	   			 extraFields_FieldDetailsInCludeGroups.click();
		 	   			   			
		 	   			 extraFields_FieldDetailsInCludeGroups.sendKeys("All Data");
		 	   			
		 	   			 extraFields_FieldDetailsInCludeGroups.sendKeys(Keys.TAB);
		 	   		     
		 	   		     //Thread.sleep(2000);
		 	   		     
		 	   		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		 				 
		 	   		     extraFields_PropertiesTab.click();
		 	   		     
		 	   		     //Thread.sleep(2000);
		 	   		     
		 	   		     if(extraFields_PropertiesHiddenChekbox.isSelected() && extraFields_PropertiesHiddenInGroupChekbox.isSelected())
		 	   		     {
		 		   		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		 					 
		 		   		     extraFields_PropertiesHiddenChekbox.click();
		 				     
		 				     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
		 					 
		 				     extraFields_PropertiesHiddenInGroupChekbox.click();
		 	   		     }
		 	   		  
		 	   		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		 			     
		 		   		extraFields_OkBtn.click();
		 		   		 
		 		   		System.out.println("*********************************checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab******************");
		 		   		 
		 		   		String expMessage="Field Updated Successfully";
		 				
		 		   		String actMessage=checkValidationMessageInWhM(expMessage);
		 		          
		 		   		 if(actMessage.equalsIgnoreCase(expMessage))
		 		   		 {
		 		   			 excelReader.setCellData(xlfile, "Sheet1", 685, 9, resPass);
		 		   			 return true;
		 		   		 }
		 		   		 else
		 		   		 {
		 		   			 excelReader.setCellData(xlfile, "Sheet1", 685, 9, resFail);
		 		   			 return false;
		 		   		 }
		 	   			  
		 		      }
		 			
		 			
		 			
		 			public static boolean checkCloseBtnOpenWarehouseMasterUpdateWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
				     {
						  excelReader=new ExcelReader(POJOUtility.getExcelPath());
						  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				         
				          getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountCloseBtn));
						 
				          accountCloseBtn.click();
						
				          getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
				 		 
				 		  masterCloseBtn.click();
				 		 
				 		  
			              getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
					     
					      homeMenu.click();
						
					      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
					     
					      mastersMenu.click();
					     
					      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseMenu));
					     
					      warehouseMenu.click();
					     
					      
					  	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));

						String actUnitsTitle = accountsTitle.getText();
						String expUnitsTitle = excelReader.getCellData(xlSheetName, 838, 7);

						excelReader.setCellData(xlfile, xlSheetName, 838, 8, actUnitsTitle);
						
						System.out.println("Opening Units Master From Item Menu Title Actual Value  :" + actUnitsTitle + "     Expected Value    : " + expUnitsTitle);

						if (actUnitsTitle.equalsIgnoreCase(expUnitsTitle)) 
						{
							excelReader.setCellData(xlfile, xlSheetName, 837, 9, resPass);
							return true;
						}
						else 
						{
							
							excelReader.setCellData(xlfile, xlSheetName, 837, 9, resFail);
							return false;
						}
					
							 
				     }
					
					
					
					
					@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
					private static WebElement wareHouse1stRowChkBox;
					
					@FindBy(xpath="//input[@name='chkRowCheck']")
					private static WebElement WH1RowChkBox;
					
					
					// Should Check
					public static boolean checkEditMasterUpdateWarehouseWH1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
				    {
						  excelReader=new ExcelReader(POJOUtility.getExcelPath());
						  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				         
				    
					      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse1stRowChkBox));
					      getAction().doubleClick(wareHouse1stRowChkBox).build().perform();
					      
					      
					      //Thread.sleep(3000);
					      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WH1RowChkBox));
					      WH1RowChkBox.click();
					      
					      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
							 
						  masterEditBtn.click();
							 
						  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
						 
						  nameTxt.click();

						  nameTxt.sendKeys(Keys.TAB);
						 
						 			 
						  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
						 
						  codeTxt.click();
			 
						  codeTxt.sendKeys(Keys.TAB);
						 
			              getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsCombobox));
			             
			              binsCombobox.click();
						 
			              binsCombobox.sendKeys(Keys.END);
			             
			              binsCombobox.sendKeys(Keys.SHIFT,Keys.HOME);
			             
			              //Thread.sleep(2000);
			             
			              binsCombobox.sendKeys("Bin3");
				         
				          getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
				     
				          nameTxt.click();
					             
					      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
						 
						  saveBtn.click();
						  
						  System.out.println("***********************************checkEditMasterUpdateWarehouseWH1*******************************");
						  
						  String expMessage="Updated Successfully";
							
						  String actMessage=checkValidationMessageInWhM(expMessage);
						 
						  if(actMessage.equalsIgnoreCase(expMessage))
						  {
							 excelReader.setCellData(xlfile, "Sheet1", 687, 9, resPass);
							 return true;
						  }
						  else
						  {
							 excelReader.setCellData(xlfile, "Sheet1", 687, 9, resFail);
							 return false; 
						  }
							 
							 
				     }
					
					
					@FindBy(xpath = "//*[@id='userprofile']/li/span[2]")
					private static WebElement logoutOption;


					public static boolean checkCloseBtnInWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
					{

						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
							  		 		
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsCloseBtn));
						 
						unitsCloseBtn.click();
						 
						//Thread.sleep(3000);
						 
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
							 
						boolean actlabelDashboard                 = labelDashboard.isDisplayed();
						boolean actselectDashboard                = selectDashboard.isDisplayed();
						boolean actnewAddDashBoard                = newAddDashBoard.isDisplayed();
						boolean actdashboardCustomizationSettings = dashboardCustomizationSettings.isDisplayed();
						
						boolean explabelDashboard                 = true;
						boolean expselectDashboard                = true;
						boolean expnewAddDashBoard                = true;
						boolean expdashboardCustomizationSettings = true;
						
						System.out.println("********************************************** checkCloseBtnInWarehouseMaster ******************");
					
						System.out.println("Home Page labelDashboard Value Actual                      :"+actlabelDashboard+               "  Value Expected : "+explabelDashboard);
						System.out.println("Home Page selectDashboard Value Actual                     :"+actselectDashboard+   "  Value Expected : "+expselectDashboard);
						System.out.println("Home Page newAddDashBoard Actual                           :"+actnewAddDashBoard+    "	 Value Expected : "+expnewAddDashBoard);
						System.out.println("Home Page dashboardCustomizationSettings Value Actual      :"+actdashboardCustomizationSettings+"	 Value Expected : "+expdashboardCustomizationSettings);
						
						if( actlabelDashboard==explabelDashboard  && actselectDashboard==expselectDashboard
								&& actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings)
						 {
							 excelReader.setCellData(xlfile, "Sheet1", 688, 9, resPass);
							 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
							 userNameDisplay.click();
							  
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
							 logoutOption.click();
							 return true;
						 }
						 else
						 {
							 excelReader.setCellData(xlfile, "Sheet1", 688, 9, resFail);
							 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
							 userNameDisplay.click();
							  
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
							 logoutOption.click();
							 return false;
						 }
					  }


		 			
					
					
					
					
					
					

					 
					 public static boolean checkNewButtonInWarehouseMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					 {
						excelReader = new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

						System.out.println("********************************** checkNewButtonInWarehouseMasterOptions **************************************************");

						try
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
							masterNewBtn.click();

							boolean actClickOnNewBtnErrorMessage   = checkErrorMessageIsDisplayingOrNotDisplaying();
					 		boolean expClickOnNewBtnErrorMessage   = true;
					 		
					        System.out.println("Click On New Button Is Any Error Message Value Actual : " + actClickOnNewBtnErrorMessage + " Value Expected : " + expClickOnNewBtnErrorMessage);
					 	
					    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
							boolean actMasterName                  = nameTxt.isDisplayed();
							boolean actMasterCode                  = codeTxt.isDisplayed();
							boolean actMasterBins                  = binsCombobox.isDisplayed();
							boolean actMasterPhysicalInventory     = physicalInventoryCountingFrequency.isDisplayed();
							String actGetPhysicalInventoryValue    = physicalInventoryCountingFrequency.getAttribute("value");
							
							excelReader.setCellData(xlfile, xlSheetName, 873, 8, actGetPhysicalInventoryValue);
							
							boolean actMasterWarehouseType         = warehouseType.isDisplayed();

							Select actWarehouseType                = new Select(warehouseType);
							String actGetWarehouseFirstValue       = actWarehouseType.getFirstSelectedOption().getText();

							excelReader.setCellData(xlfile, xlSheetName, 874, 8, actGetWarehouseFirstValue);
							
							boolean actMasterSaveBtn               = saveBtn.isDisplayed();
							boolean actMasterCloseBtn              = closeBtn.isDisplayed();

							boolean expMasterName                  = true;
							boolean expMasterCode                  = true;
							boolean expMasterBins                  = true;
							boolean expMasterPhysicalInventory     = true;
							String expGetPhysicalInventoryValue    = excelReader.getCellData(xlSheetName, 873, 7);
							boolean expMasterWarehouseType         = true;

							String expGetWarehouseFirstValue       = excelReader.getCellData(xlSheetName, 874, 7);

							boolean expMasterDoNotMaintain         = true;
							boolean expMasterDoNotMaintainNotCheck = false;
							boolean expMasterSaveBtn               = true;
							boolean expMasterCloseBtn              = true;


							System.out.println("Name Value Actual                        : " + actMasterName +                 " Value Expected : " + expMasterName);
							System.out.println("Code Value Actual                        : " + actMasterCode +                 " Value Expected : " + expMasterCode);
							System.out.println("Bins Value Actual                        : " + actMasterBins +                 " Value Expected : " + expMasterBins);
							System.out.println("Phys Inventory Value Actual              : " + actMasterPhysicalInventory+     " Value Expected : " + expMasterPhysicalInventory);
							System.out.println("Phys Inventory Get Value Actual          : " + actGetPhysicalInventoryValue+   " Value Expected : " + expGetPhysicalInventoryValue);
							System.out.println("Warehouse Type Value Actual              : " + actMasterWarehouseType+         " Value Expected : " + expMasterWarehouseType);
							System.out.println("Warehouse Get Value Actual               : " + actGetWarehouseFirstValue+      " Value Expected : " + expGetWarehouseFirstValue);

							System.out.println("Save Button Value Actual                 : " + actMasterSaveBtn +              " Value Expected : " + expMasterSaveBtn);
							System.out.println("Close Button Value Actual                : " + actMasterCloseBtn +             " Value Expected : " + expMasterCloseBtn);

							
							
							if (actClickOnNewBtnErrorMessage == expClickOnNewBtnErrorMessage

									&& actMasterName == expMasterName && actMasterCode == expMasterCode && actMasterBins == expMasterBins
									&& actMasterPhysicalInventory == expMasterPhysicalInventory
									&& actGetPhysicalInventoryValue.equalsIgnoreCase(expGetPhysicalInventoryValue)
									&& actMasterWarehouseType == expMasterWarehouseType
									&& actGetWarehouseFirstValue.equalsIgnoreCase(expGetWarehouseFirstValue)
									&& actMasterSaveBtn == expMasterSaveBtn && actMasterCloseBtn == expMasterCloseBtn)
						
							{
								excelReader.setCellData(xlfile, xlSheetName, 872, 9, resPass);
								return true;
							}
							else 
							{
								excelReader.setCellData(xlfile, xlSheetName, 872, 9, resFail);
								return false;
							}
					    }
						catch (Exception e) 
						  {
							  String exception =e.getMessage();
							  excelReader.setExceptionInExcel(xlfile, xlSheetName, 872, 10, exception);
							  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
							  return false;
						  }
					  }

					 
					 
					
					 public static boolean checkSaveButtonInWarehouseMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					 {
						excelReader = new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

						System.out.println("********************************** checkNewButtonInWarehouseMasterOptions **************************************************");

						try
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
							nameTxt.click();
							nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 876, 6));
							getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();
							
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
							codeTxt.click();
							codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 877, 6));
							getAction().moveToElement(codeTxt).sendKeys(Keys.TAB).perform();
							
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsCombobox));
							binsCombobox.click();
							binsCombobox.sendKeys(excelReader.getCellData(xlSheetName, 878, 6));
							
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
							
							System.out.println("Input Valid and Click On Save Button      : " + actMasterSave + "  Value Expected : "+ expMasterSave);
							
							boolean actMasterName                  = nameTxt.getText().isEmpty();
							boolean actMasterCode                  = codeTxt.getText().isEmpty();
							boolean actMasterBins                  = binsCombobox.getAttribute("value").isEmpty();
							boolean actMasterPhysicalInventory     = physicalInventoryCountingFrequency.isDisplayed();
							String actGetPhysicalInventoryValue    = physicalInventoryCountingFrequency.getAttribute("value");
							boolean actMasterWarehouseType         = warehouseType.isDisplayed();

							Select actWarehouseType                = new Select(warehouseType);
							String actGetWarehouseFirstValue       = actWarehouseType.getFirstSelectedOption().getText();

					/*		boolean actMasterDoNotMaintain         = doNotMain.isDisplayed();
							boolean actMasterDoNotMaintainNotCheck = doNotMain.isSelected();*/
							boolean actMasterSaveBtn               = saveBtn.isDisplayed();
							boolean actMasterCloseBtn              = closeBtn.isDisplayed();

							boolean expMasterName                  = true;
							boolean expMasterCode                  = true;
							boolean expMasterBins                  = true;
							boolean expMasterPhysicalInventory     = true;
							String expGetPhysicalInventoryValue    = "0";
							boolean expMasterWarehouseType         = true;

							String expGetWarehouseFirstValue       = "Normal";

					/*		boolean expMasterDoNotMaintain         = true;
							boolean expMasterDoNotMaintainNotCheck = false;*/
							boolean expMasterSaveBtn               = true;
							boolean expMasterCloseBtn              = true;
							
							System.out.println("Input Name Code and Click on Save Button : " + actMasterSave +                 " Value Expected : " + expMasterSave);
							System.out.println("Name Value Actual                        : " + actMasterName +                 " Value Expected : " + expMasterName);
							System.out.println("Code Value Actual                        : " + actMasterCode +                 " Value Expected : " + expMasterCode);
							System.out.println("Bins Value Actual                        : " + actMasterBins +                 " Value Expected : " + expMasterBins);
							System.out.println("Phys Inventory Value Actual              : " + actMasterPhysicalInventory+     " Value Expected : " + expMasterPhysicalInventory);
							System.out.println("Phys Inventory Get Value Actual          : " + actGetPhysicalInventoryValue+   " Value Expected : " + expGetPhysicalInventoryValue);
							System.out.println("Warehouse Type Value Actual              : " + actMasterWarehouseType+         " Value Expected : " + expMasterWarehouseType);
							System.out.println("Warehouse Get Value Actual               : " + actGetWarehouseFirstValue+      " Value Expected : " + expGetWarehouseFirstValue);
							/*System.out.println("Do Not Maintain Value Actual             : " + actMasterDoNotMaintain+         " Value Expected : " + expMasterDoNotMaintain);
							System.out.println("Do Not Maintain Not Select Value Actual  : " + actMasterDoNotMaintainNotCheck+ " Value Expected : " + expMasterDoNotMaintainNotCheck);*/
							System.out.println("Save Button Value Actual                 : " + actMasterSaveBtn +              " Value Expected : " + expMasterSaveBtn);
							System.out.println("Close Button Value Actual                : " + actMasterCloseBtn +             " Value Expected : " + expMasterCloseBtn);


							if (actMasterSave.equalsIgnoreCase(expMasterSave)

									&& actMasterName == expMasterName && actMasterCode == expMasterCode && actMasterBins == expMasterBins

									&& actMasterPhysicalInventory == expMasterPhysicalInventory
									&& actGetPhysicalInventoryValue.equalsIgnoreCase(expGetPhysicalInventoryValue)
									&& actMasterWarehouseType == expMasterWarehouseType
									&& actGetWarehouseFirstValue.equalsIgnoreCase(expGetWarehouseFirstValue)
						/*			&& actMasterDoNotMaintain == expMasterDoNotMaintain
									&& actMasterDoNotMaintainNotCheck == expMasterDoNotMaintainNotCheck*/
									&& actMasterSaveBtn == expMasterSaveBtn && actMasterCloseBtn == expMasterCloseBtn) 
							{
								excelReader.setCellData(xlfile, xlSheetName, 875, 9, resPass);
								return true;
							}
							else 
							{
								excelReader.setCellData(xlfile, xlSheetName, 875, 9, resFail);
								return false;
							}
					    }
						catch (Exception e) 
						  {
							  String exception =e.getMessage();
							  excelReader.setExceptionInExcel(xlfile, xlSheetName, 875, 10, exception);
							  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
							  return false;
						  }
					  }
					 
					 
					 
					 
					 @FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[10]")
					 public static List<WebElement> masterDepNameList;
					 
					 
					 public static boolean checkCloseButtonInWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					 {
						excelReader = new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

						System.out.println("************************************************** checkCloseButtonInWarehouseGroupCreationPage *******************************************************");

						try
						{
							getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
							closeBtn.click();

							boolean ClickOnCloseBtnErrorMessage   = checkErrorMessageIsDisplayingOrNotDisplaying();
					 		
					 		String actClickOnCloseBtnErrorMessage=Boolean.toString(ClickOnCloseBtnErrorMessage);
					 		String expClickOnCloseBtnErrorMessage=excelReader.getCellData(xlSheetName, 882, 7);
					 		
					 		
					 		excelReader.setCellData(xlfile, xlSheetName, 882, 8, actClickOnCloseBtnErrorMessage.toUpperCase());
					 		
					        System.out.println("Click On New Button Is Any Error Message Value Actual : " + actClickOnCloseBtnErrorMessage + " Value Expected : " + expClickOnCloseBtnErrorMessage);
					 	

					        ArrayList<String> actmasterDepNameList=new ArrayList<String>();
					 		
					 		int HeaderCount =masterDepNameList.size();
					 		
					 		System.err.println("HeaderCount   :  "+HeaderCount);
					 		
					 		for (int i = 0; i < HeaderCount; i++) 
					 		{
					 			String data=masterDepNameList.get(i).getText();
					 			actmasterDepNameList.add(data);
					 		}
					 		
					 	
					 		 String actMasterDepNameTextList=actmasterDepNameList.toString();
					 		 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 883, 7);
					 		
					 		 excelReader.setCellData(xlfile, xlSheetName, 883, 8, actMasterDepNameTextList);
					    	
					    	 System.err.println("  Actual MasterDepNameTextList : "+actMasterDepNameTextList);
					    	 System.err.println("  Expected  MasterDepNameTextList : "+expMasterDepNameTextList);
					    	 
					    	 
							if (actClickOnCloseBtnErrorMessage .equalsIgnoreCase(expClickOnCloseBtnErrorMessage)

									&& actMasterDepNameTextList.equalsIgnoreCase(expMasterDepNameTextList))
							{
								excelReader.setCellData(xlfile, xlSheetName, 881, 9, resPass);
								return true;
							}
							else
							{
								excelReader.setCellData(xlfile, xlSheetName, 881, 9, resFail);
								return false;
							}
						}
						catch (Exception e) 
						  {
							  String exception =e.getMessage();
							  excelReader.setExceptionInExcel(xlfile, xlSheetName, 881, 10, exception);
							  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
							  return false;
						  }
					  }

						// Edit Option in The Masters Fo Bin Group Master
					 
					    @FindBy(xpath="//tr[6]//td[8]//div[1]//label[1]//input[1]")
						private static WebElement unitSixthCheckBox;

					  public static boolean checkEditOptionForNewlyCreateAddGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					  {
						excelReader = new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

						System.out.println("************************************************** checkEditOptionForNewlyCreateAddGroupWarehouse *******************************************************");

					   try
					   {
					        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
					        unitFirstCheckBox.click();

							boolean ClickOnCheckBoxToSelectErrorMessage   = checkErrorMessageIsDisplayingOrNotDisplaying();
					 		
					 		
					 		String actClickOnCheckBoxToSelectErrorMessage=Boolean.toString(ClickOnCheckBoxToSelectErrorMessage);
					 		String expClickOnCheckBoxToSelectErrorMessage=excelReader.getCellData(xlSheetName, 885, 7);
					 		
					 		excelReader.setCellData(xlfile, xlSheetName, 885, 8, actClickOnCheckBoxToSelectErrorMessage.toUpperCase());
					 		
					 		
					        System.out.println("Check Check Box Is Any Error Message Value Actual : " + actClickOnCheckBoxToSelectErrorMessage + " Value Expected : " + expClickOnCheckBoxToSelectErrorMessage);
					 	
					        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
							masterEditBtn.click();

							boolean ClickOnEditBtnErrorMessage   = checkErrorMessageIsDisplayingOrNotDisplaying();
					 		
					 		String actClickOnEditBtnErrorMessage=Boolean.toString(ClickOnEditBtnErrorMessage);
					 		String expClickOnEditBtnErrorMessage=excelReader.getCellData(xlSheetName, 886, 7);
					 		
					 		excelReader.setCellData(xlfile, xlSheetName, 886, 8, actClickOnEditBtnErrorMessage.toUpperCase());
					 		
					        System.out.println("Click On Edit Button Is Any Error Message Value Actual : " + actClickOnEditBtnErrorMessage + " Value Expected : " + expClickOnEditBtnErrorMessage);
					 	
					        
					        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseType));
							String actMasterName                    = nameTxt.getAttribute("value");
							String actMasterCode                    = codeTxt.getAttribute("value");
							boolean actMasterBins                   = binsCombobox.isDisplayed();
							
							/*Select actMasterSelectedBins            = new Select(binsCombobox);
							String actMasterSelectedBinName         = actMasterSelectedBins.getFirstSelectedOption().getText();*/
							
							boolean actMasterPhysicalInventory      = physicalInventoryCountingFrequency.isDisplayed();
							String actGetPhysicalInventoryValue     = physicalInventoryCountingFrequency.getAttribute("value");
							boolean actMasterWarehouseType          = warehouseType.isDisplayed();

							Select actWarehouseType                 = new Select(warehouseType);
							String actGetWarehouseFirstValue        = actWarehouseType.getFirstSelectedOption().getText();


							excelReader.setCellData(xlfile, xlSheetName, 887, 8, actMasterName);
							excelReader.setCellData(xlfile, xlSheetName, 888, 8, actMasterCode);
							excelReader.setCellData(xlfile, xlSheetName, 889, 8, actGetPhysicalInventoryValue);
							excelReader.setCellData(xlfile, xlSheetName, 890, 8, actGetWarehouseFirstValue);
							
							boolean actMasterSaveBtn                = saveBtn.isDisplayed();
							boolean actMasterCloseBtn               = closeBtn.isDisplayed();

							String expMasterName                    = excelReader.getCellData(xlSheetName, 887, 7);
							String expMasterCode                    = excelReader.getCellData(xlSheetName, 888, 7);
							boolean expMasterBins                   = true;
							boolean expMasterPhysicalInventory      = true;
							String expGetPhysicalInventoryValue     = excelReader.getCellData(xlSheetName, 889, 7);
							boolean expMasterWarehouseType          = true;
							//String expMasterSelectedBinName         = "BG2";
							String expGetWarehouseFirstValue        = excelReader.getCellData(xlSheetName, 890, 7);

							boolean expMasterSaveBtn                = true;
							boolean expMasterCloseBtn               = true;

							System.out.println("************************************************** FieldsInGeneralDisplayAfterCreationNewWarehouse  **********************************************************************");

							System.out.println("Name Value Actual                            : " + actMasterName +                 "  Value Expected : " + expMasterName);
							System.out.println("Code Value Actual                            : " + actMasterCode +                 "  Value Expected : " + expMasterCode);
							System.out.println("Bins Value Actual                            : " + actMasterBins +                 "  Value Expected : " + expMasterBins);
							System.out.println("Phys Inventory Value Actual                  : " + actMasterPhysicalInventory+     "  Value Expected : " + expMasterPhysicalInventory);
							System.out.println("Phys Inventory Value Actual                  : " + actGetPhysicalInventoryValue+   "  Value Expected : " + expGetPhysicalInventoryValue);
							//System.out.println("Phys Inventory Value Actual                  : " + actMasterSelectedBinName+       "  Value Expected : " + expMasterSelectedBinName);
							System.out.println("Warehouse Type Value Actual                  : " + actMasterWarehouseType+         "  Value Expected : " + expMasterWarehouseType);
							
							System.out.println("Warehouse Type First Value Actual            : " + actGetWarehouseFirstValue+      "  Value Expected : " + expGetWarehouseFirstValue);

							System.out.println("Save Button Value Actual                     : " + actMasterSaveBtn +              "  Value Expected : " + expMasterSaveBtn);
							System.out.println("Close Button Value Actual                    : " + actMasterCloseBtn +             "  Value Expected : " + expMasterCloseBtn);

							if (actClickOnCheckBoxToSelectErrorMessage .equalsIgnoreCase(expClickOnCheckBoxToSelectErrorMessage)
									&& actClickOnEditBtnErrorMessage .equalsIgnoreCase( expClickOnEditBtnErrorMessage)

									&& actMasterName.equalsIgnoreCase(expMasterName) && actMasterCode == actMasterCode
									&& actMasterBins == actMasterBins

									&& actMasterPhysicalInventory == actMasterPhysicalInventory
									&& actGetPhysicalInventoryValue.equalsIgnoreCase(actGetPhysicalInventoryValue)
									&& actMasterWarehouseType == actMasterWarehouseType
									&& actGetWarehouseFirstValue.equalsIgnoreCase(actGetWarehouseFirstValue)
									&& actMasterSaveBtn == expMasterSaveBtn && actMasterCloseBtn == expMasterCloseBtn) 
							{
								
								excelReader.setCellData(xlfile, xlSheetName, 884, 9, resPass);
								return true;
							} 
							else 
							{
								
								excelReader.setCellData(xlfile, xlSheetName, 884, 9, resFail);
								return false;
							}
					    }
					   catch (Exception e) 
						  {
							  String exception =e.getMessage();
							  excelReader.setExceptionInExcel(xlfile, xlSheetName, 884, 10, exception);
							  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
							  return false;
						  }

					 }

					 public static boolean checkSaveByUpdatingNameAndCodeInWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					 {

						excelReader = new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
						System.out.println("************************************************** checkSaveByUpdatingNameAndCodeInWarehouseGroupCreationPage ***************************************");
						
					    try
					    {
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
							nameTxt.click();
							nameTxt.clear();
							nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 892, 6));
							getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();

							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
							codeTxt.click();
							codeTxt.clear();
							codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 893, 6));
							Thread.sleep(2000);
							                 
					        boolean ClickOnCheckBoxToSelectErrorMessage   = checkErrorMessageIsDisplayingOrNotDisplaying();
					 		
					 		
					 		String actClickOnCheckBoxToSelectErrorMessage=Boolean.toString(ClickOnCheckBoxToSelectErrorMessage);
					 		String expClickOnCheckBoxToSelectErrorMessage=excelReader.getCellData(xlSheetName, 894, 7);
					 		
					 		excelReader.setCellData(xlfile, xlSheetName, 894, 8, actClickOnCheckBoxToSelectErrorMessage.toUpperCase());
					 		
					 		
					        System.out.println("Check Check Box Is Any Error Message Value Actual : " + actClickOnCheckBoxToSelectErrorMessage + " Value Expected : " + expClickOnCheckBoxToSelectErrorMessage);
					 	
							getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
							saveBtn.click();

							
							
						    String exWarehouseSaveMessage = excelReader.getCellData(xlSheetName, 895, 7);
							
							//excelReader.setCellData(xlfile, xlSheetName, 895, 8, exWarehouseSaveMessage);
							
							boolean MasterSave = checkValidationMessageboolean(exWarehouseSaveMessage);
							
							
							String actMasterSave= Boolean.toString(MasterSave);
							String expMasterSave=excelReader.getCellData(xlSheetName, 896, 7);
							
							excelReader.setCellData(xlfile, xlSheetName, 896, 8, actMasterSave.toUpperCase());

							// Here message is closing fast so thats why kept in If Condition is
							// visible then click

							/*if (closeValidationConfirmationMessage.isDisplayed())
							{
								getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
								closeValidationConfirmationMessage.click();

							}*/

							System.out.println("Check Error Message Before Save                   : " + actClickOnCheckBoxToSelectErrorMessage + "  Value Expected : " + expClickOnCheckBoxToSelectErrorMessage);
							System.out.println("Update Valid Information And Click On Save Button : " + actMasterSave+                      "  Value Expected : " + expMasterSave);

							ArrayList<String> actmasterDepNameList=new ArrayList<String>();
						 		
						 	int HeaderCount =masterDepNameList.size();
						 		
						 	System.err.println("HeaderCount   :  "+HeaderCount);
						 		
						 	for (int i = 0; i < HeaderCount; i++) 
						 	{
						 		String data=masterDepNameList.get(i).getText();
						 		actmasterDepNameList.add(data);
						 	}
						 		 	
						 	 String actMasterDepNameTextList=actmasterDepNameList.toString();
						 	 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 897, 7);
						 		
						 	 excelReader.setCellData(xlfile, xlSheetName, 897, 8, actMasterDepNameTextList);
						    	
						     System.err.println("  Actual MasterDepNameTextList : "+actMasterDepNameTextList);
						     System.err.println("  Expected  MasterDepNameTextList : "+expMasterDepNameTextList);

							if (actClickOnCheckBoxToSelectErrorMessage .equalsIgnoreCase(expClickOnCheckBoxToSelectErrorMessage)
									&& actMasterSave.equalsIgnoreCase(expMasterSave)

									&& actMasterDepNameTextList.equalsIgnoreCase(expMasterDepNameTextList))
							{
								excelReader.setCellData(xlfile, xlSheetName, 891, 9, resPass);
								return true;
							}
							else
							{
								excelReader.setCellData(xlfile, xlSheetName, 891, 9, resFail);
								return false;
							}
					    }
					    catch (Exception e) 
						  {
							  String exception =e.getMessage();
							  excelReader.setExceptionInExcel(xlfile, xlSheetName, 891, 10, exception);
							  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
							  return false;
						  }

					 }

					  // Edit Option in The Masters to Check Updated Warehouse Group

					  public static boolean checkEditOptionForUpdatedGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					  {
						excelReader = new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
						System.out.println("************************************************** checkEditOptionForUpdatedGroupBins *******************************************************");
							
					    try
					    {
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
							unitFirstCheckBox.click();

							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
							masterEditBtn.click();

							String actMasterName                = nameTxt.getAttribute("value");
							String actMasterCode                = codeTxt.getAttribute("value");
							boolean actMasterBins               = binsCombobox.isDisplayed();
							boolean actMasterPhysicalInventory  = physicalInventoryCountingFrequency.isDisplayed();
							String actGetPhysicalInventoryValue = physicalInventoryCountingFrequency.getAttribute("value");
							boolean actMasterWarehouseType      = warehouseType.isDisplayed();

							Select actWarehouseType             = new Select(warehouseType);
							String actGetWarehouseFirstValue    = actWarehouseType.getFirstSelectedOption().getText();

							boolean actMasterSaveBtn            = saveBtn.isDisplayed();
							boolean actMasterCloseBtn           = closeBtn.isDisplayed();

							excelReader.setCellData(xlfile, xlSheetName, 899, 8, actMasterName);
							excelReader.setCellData(xlfile, xlSheetName, 900, 8, actMasterCode);
							excelReader.setCellData(xlfile, xlSheetName, 901, 8, actGetPhysicalInventoryValue);
							excelReader.setCellData(xlfile, xlSheetName, 902, 8, actGetWarehouseFirstValue);
							
							
							String expMasterName                = excelReader.getCellData(xlSheetName, 899, 7);
							String expMasterCode                = excelReader.getCellData(xlSheetName, 900, 7);
							boolean expMasterBins               = true;
							boolean expMasterPhysicalInventory  = true;
							String expGetPhysicalInventoryValue = excelReader.getCellData(xlSheetName, 901, 7);
							boolean expMasterWarehouseType      = true;

							String expGetWarehouseFirstValue    = excelReader.getCellData(xlSheetName, 902, 7);

							boolean expMasterSaveBtn            = true;
							boolean expMasterCloseBtn           = true;

							System.out.println("***************************************** FieldsInGeneralDisplayAfterCreationNewWarehouse  ********************************************");

							System.out.println("Name Value Actual                            : " + actMasterName +               " Value Expected : " + expMasterName);
							System.out.println("Code Value Actual                            : " + actMasterCode +               " Value Expected : " + expMasterCode);
							System.out.println("Bins Value Actual                            : " + actMasterBins +               " Value Expected : " + expMasterBins);
							System.out.println("Phys Inventory Value Actual                  : " + actMasterPhysicalInventory +  " Value Expected : " + expMasterPhysicalInventory);
							System.out.println("Phys Inventory Value Actual                  : " + actGetPhysicalInventoryValue+ " Value Expected : " + expGetPhysicalInventoryValue);
							System.out.println("Warehouse Type Value Actual                  : " + actMasterWarehouseType +      " Value Expected : " + expMasterWarehouseType);
							System.out.println("Do Not Maintain Value Actual                 : " + actGetWarehouseFirstValue+    " Value Expected : " + expGetWarehouseFirstValue);
							System.out.println("Close Button Value Actual                    : " + actMasterSaveBtn +            " Value Expected : " + expMasterSaveBtn);
							System.out.println("Close Button Value Actual                    : " + actMasterCloseBtn +           " Value Expected : " + expMasterCloseBtn);

							if (actMasterName.equalsIgnoreCase(expMasterName) && actMasterCode == actMasterCode
									&& actMasterBins == actMasterBins

									&& actMasterPhysicalInventory == actMasterPhysicalInventory
									&& actGetPhysicalInventoryValue.equalsIgnoreCase(actGetPhysicalInventoryValue)
									&& actMasterWarehouseType == actMasterWarehouseType
									&& actGetWarehouseFirstValue.equalsIgnoreCase(actGetWarehouseFirstValue)
									&& actMasterSaveBtn == expMasterSaveBtn && actMasterCloseBtn == expMasterCloseBtn) 
							{
								
								excelReader.setCellData(xlfile, xlSheetName, 898, 9, resPass);
								return true;
							} 
							else
							{
								excelReader.setCellData(xlfile, xlSheetName, 898, 9, resFail);
								return false;
							}
					    }
					    catch (Exception e) 
						  {
							  String exception =e.getMessage();
							  excelReader.setExceptionInExcel(xlfile, xlSheetName, 898, 10, exception);
							  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
							  return false;
						  }
					  }

					  public static boolean checkCloseButtonOnEditWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					  {

						excelReader = new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

						System.out.println("************************************************** checkCloseButtonBinGroupCreationPage *******************************************************");
						
						try
						{
							getWebDriverWait().until(ExpectedConditions.elementToBeClickable(editcloseBtn));
							editcloseBtn.click();

							boolean ClickOnCloseBtnErrorMessage   = checkErrorMessageIsDisplayingOrNotDisplaying();
					 		
					 		String actClickOnCloseBtnErrorMessage=Boolean.toString(ClickOnCloseBtnErrorMessage);
					 		String expClickOnCloseBtnErrorMessage=excelReader.getCellData(xlSheetName, 904, 7);
					 		
					 		excelReader.setCellData(xlfile, xlSheetName, 904, 8, actClickOnCloseBtnErrorMessage.toUpperCase());
					 		
					        System.out.println("Click On New Button Is Any Error Message Value Actual : " + actClickOnCloseBtnErrorMessage + " Value Expected : " + expClickOnCloseBtnErrorMessage);
					 	
					        ArrayList<String> actmasterDepNameList=new ArrayList<String>();
					 		
						 	int HeaderCount =masterDepNameList.size();
						 		
						 	System.err.println("HeaderCount   :  "+HeaderCount);
						 		
						 	for (int i = 0; i < HeaderCount; i++) 
						 	{
						 		String data=masterDepNameList.get(i).getText();
						 		actmasterDepNameList.add(data);
						 	}
						 	
						 	 String actMasterDepNameTextList=actmasterDepNameList.toString();
						 	 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 905, 7);
						 		
						 	 excelReader.setCellData(xlfile, xlSheetName, 905, 8, actMasterDepNameTextList);
						    	
						     System.err.println("  Actual MasterDepNameTextList : "+actMasterDepNameTextList);
						     System.err.println("  Expected  MasterDepNameTextList : "+expMasterDepNameTextList);
						     
						     
							if (actClickOnCloseBtnErrorMessage.equalsIgnoreCase(expClickOnCloseBtnErrorMessage)

									&& actMasterDepNameTextList.equalsIgnoreCase(expMasterDepNameTextList)) 
							{
								excelReader.setCellData(xlfile, xlSheetName, 903, 9, resPass);
								return true;
							}
							else
							{
								excelReader.setCellData(xlfile, xlSheetName, 903, 9, resFail);
								return false;
							}
						}
						
						catch (Exception e) 
						  {
							  String exception =e.getMessage();
							  excelReader.setExceptionInExcel(xlfile, xlSheetName, 903, 10, exception);
							  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
							  return false;
						  }
						
						}

					 
					 
					  /*public static boolean checkUnCheckingSelectWarehouseAndCheckUnSelectWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					  {
					 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
					 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

					 	System.out.println("********************************** checkUnCheckingSelectWarehouseAndCheckUnSelectWarehouse ************************************************");
					 		
					 	try
					 	{
					 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
					 		unitFirstCheckBox.click();

					 		boolean UnCheckErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
					 		
					 		String actUnCheckErrorMessage=Boolean.toString(UnCheckErrorMessage);
					 		String expUnCheckErrorMessage=excelReader.getCellData(xlSheetName, 907, 7);
					 		
					 		excelReader.setCellData(xlfile, xlSheetName, 907, 8, actUnCheckErrorMessage);
					 		
					 		
					 	    System.out.println("Click On Edit Button Is Any Error Message Value Actual : " + actUnCheckErrorMessage + " Value Expected : " + expUnCheckErrorMessage);
					 		
					 		boolean ServerErrorMessage  = checkServerErrorMessageIsNotDisplay();
					  		
					 		String actServerErrorMessage=Boolean.toString(ServerErrorMessage);
					 		String expServerErrorMessage=excelReader.getCellData(xlSheetName, 908, 7);

					 		excelReader.setCellData(xlfile, xlSheetName, 908, 8, actServerErrorMessage);
					 				
					  		System.out.println("Un Checking Bins Error Message                         : " + actServerErrorMessage +   " Value Expected : " +  expServerErrorMessage);
					 		
					 		if (actUnCheckErrorMessage.equalsIgnoreCase(expUnCheckErrorMessage)
					 				&& actServerErrorMessage.equalsIgnoreCase(expServerErrorMessage)) 
					 		{
					 			
					 			excelReader.setCellData(xlfile, xlSheetName, 906, 9, resPass);
					 			return true;
					 		}
					 		else 
					 		{
					 			excelReader.setCellData(xlfile, xlSheetName, 906, 9, resFail);
					 			return false;
					 		}
					 	}
					 	catch (Exception e) 
						  {
							  String exception =e.getMessage();
							  excelReader.setExceptionInExcel(xlfile, xlSheetName, 906, 10, exception);
							  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
							  return false;
						  }
					   }*/
					  

					  public static boolean chekDeleteWarehouseOptionForWarhouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					  {
					 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
					 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

					 	System.out.println("************************************************** chekDeleteWarehouseOptionForWarhouseMasterPage *******************************************************");
					 	
					 	try
					 	{
					 		/*if(unitFirstCheckBox.isSelected())
					 		{
					 			System.out.println("Check Box is Selected");
					 		}
					 		else
					 		{
					 			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
					 			unitFirstCheckBox.click();
					 		}*/
					 		
					 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
					 		unitFirstCheckBox.click();
					 		
					 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
					 		masterDeleteBtn.click();		

					 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
					 		System.out.println(getMsgOnDelete.getText());

					 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
					 		clickOnOkInDelete.click();	
					 		
					        String expSaveMessage = excelReader.getCellData(xlSheetName, 910, 7);
							
					        //excelReader.setCellData(xlfile, xlSheetName, 910, 8, expSaveMessage);
					        
							boolean ValidationConfirmationMessageOnDelete = checkValidationMessageboolean(expSaveMessage);
							
							
							String actValidationConfirmationMessageOnDelete=Boolean.toString(ValidationConfirmationMessageOnDelete);
						    String expValidationConfirmationMessageOnDelete = excelReader.getCellData(xlSheetName, 911, 7);
							
							 excelReader.setCellData(xlfile, xlSheetName, 911, 8, actValidationConfirmationMessageOnDelete.toUpperCase());
							 
							 
							 ArrayList<String> actmasterDepNameList=new ArrayList<String>();
								
							 int HeaderCount =masterDepNameList.size();
								
							 System.err.println("HeaderCount   :  "+HeaderCount);
								
							 for (int i = 0; i < HeaderCount; i++) 
							 {
								String data=masterDepNameList.get(i).getText();
								actmasterDepNameList.add(data);
							 }
							
							 String actMasterDepNameTextList=actmasterDepNameList.toString();
							 String expMasterDepNameTextList=excelReader.getCellData(xlSheetName, 912, 7);
								
							 excelReader.setCellData(xlfile, xlSheetName, 912, 8, actMasterDepNameTextList);
							
							 System.err.println("  Actual MasterDepNameTextList : "+actMasterDepNameTextList);
							 System.err.println("  Expected  MasterDepNameTextList : "+expMasterDepNameTextList);
					 		

					 		if (actValidationConfirmationMessageOnDelete.equalsIgnoreCase(expValidationConfirmationMessageOnDelete)
					 				&& actMasterDepNameTextList.equalsIgnoreCase(expMasterDepNameTextList)) 
					 		{
					 			excelReader.setCellData(xlfile, xlSheetName, 909, 9, resPass);
					 			return true;
					 		} 
					 		else
					 		{
					 			excelReader.setCellData(xlfile, xlSheetName, 909, 9, resFail);
					 			return false;
					 		}
					 	}
					 	catch (Exception e) 
						  {
							  String exception =e.getMessage();
							  excelReader.setExceptionInExcel(xlfile, xlSheetName, 909, 10, exception);
							  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
							  return false;
						  }
					  }
					  
					  
					  
					  
					  
					  
					  
					  
					  public static boolean checkSaveWarhouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					  {
					 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
					 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

					 	System.out.println("********************************** checkNewButtonInWarehouseMasterOptions **************************************************");

					 	try
					 	{
					 		
					 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
							masterNewBtn.click();
							
					 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
					 		nameTxt.click();
					 		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 876, 6));
					 		getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();
					 		
					 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
					 		codeTxt.click();
					 		codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 877, 6));
					 		getAction().moveToElement(codeTxt).sendKeys(Keys.TAB).perform();
					 		
					 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsCombobox));
					 		binsCombobox.click();
					 		binsCombobox.sendKeys(excelReader.getCellData(xlSheetName, 878, 6));
					 		
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
					 		
					 		
					 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
							closeBtn.click();
					 		
					 		System.out.println("Input Valid and Click On Save Button      : " + actMasterSave + "  Value Expected : "+ expMasterSave);
					 		
					 		
					 		
					 		
					 		if (actMasterSave.equalsIgnoreCase(expMasterSave)) 
					 		{
					 			excelReader.setCellData(xlfile, xlSheetName, 875, 9, resPass);
					 			return true;
					 		}
					 		else 
					 		{
					 			excelReader.setCellData(xlfile, xlSheetName, 875, 9, resFail);
					 			return false;
					 		}
					     }
					 	catch (Exception e) 
					 	  {
					 		  String exception =e.getMessage();
					 		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 875, 10, exception);
					 		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
					 		  return false;
					 	  }
					   }

					  
					  
					  
					  
					  @FindBy(xpath = "//*[@id='btnClose']")
					  private static WebElement itemCloseBtn;

					  
					  
					  
					  
					  
					  
					  
					  public static boolean checkCloseWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
					  {
					 	excelReader = new ExcelReader(POJOUtility.getExcelPath());
					 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

					 	System.out.println("********************************** checkCloseWarehouseMaster ********************************");

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

					 		Boolean displayResult=actLoadDashboard == expLoadDashboard && actSelectDashboard == expSelectDashboard
					 				&& actNewDashboard == expNewDashboard && actDashboardCustomization == expDashboardCustomization;
					 		
					 		
					 		String actDisplayResult=Boolean.toString(displayResult);
					 		String expDisplayResult=excelReader.getCellData(xlSheetName, 914, 7);
					 		
					 		excelReader.setCellData(xlfile, xlSheetName, 914, 8, actDisplayResult.toUpperCase());
					 		
					 		
					 		String actDashboardLabel = labelDashboard.getText();
							String expDashboardLabel = excelReader.getCellData(xlSheetName, 915, 7);

							excelReader.setCellData(xlfile, xlSheetName, 915, 8, actDashboardLabel);
					 		
					 		if (actDisplayResult.equalsIgnoreCase(expDisplayResult) && 
					 				actDashboardLabel.equalsIgnoreCase(expDashboardLabel)) 
					 		{
					 			excelReader.setCellData(xlfile, xlSheetName, 913, 9, resPass);
					 			return true;
					 		}
					 		else
					 		{
					 			excelReader.setCellData(xlfile, xlSheetName, 913, 9, resFail);
					 			return false;
					 		}
					    }
					    catch (Exception e) 
						  {
							  String exception =e.getMessage();
							  excelReader.setExceptionInExcel(xlfile, xlSheetName, 913, 10, exception);
							  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
							  return false;
						  }
					  }
					  

					  
					   
					   @FindBy(id = "txtPassword")
					   private static WebElement password;
					   
					   public boolean checkLogoutInWarehouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
					
					
		 			
		
		
	public SmokeWarehousePage(WebDriver driver)
	{
		
		 PageFactory.initElements(driver, this);
		
	}
	
}
