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


public class MasterWarehousePage extends BaseEngine
{
	  
		
			 //Department Menu	
			
		 
				//Department Title
				@FindBy (xpath="//span[@id='spnHeaderText']")
				public static WebElement accountsTitle;
				
				@FindBy (xpath="//div[@class='navText']//span[contains(text(),'Unit Conversion')]")
				public static WebElement unitsConversionTitle;		
			    
			    //Master Main Header Fields		
				

				@FindBy(xpath="//label[@class='msgInfo']")
				public static WebElement clickOnEmptyGroup;
				

			//Master Left panel//TreeID//Elements

					
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
				
											
				//Header Elements of Master MainLanding
				

	            @FindBy(xpath="//a[contains(text(),'Search on')]")
				public static WebElement masterSearchTxtBtn_SearchOnBtn; 								

				@FindBy(xpath="//a[contains(text(),'Advance Search')]")
				public static WebElement masterSearchTxtBtn_AdvanceSearchBtn; 
				
				 

				@FindBy(xpath="//*[@id='cmbUserTypeMaster_input_image']/span")
				public static WebElement masterCmbMasterExpansionBtn; 
				
				
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
			   
		      
		 
				
		    @FindBy(xpath="//div[@id='divTreeMenu']")
			private static WebElement treeWarehouseDisplay;
		    
		    @FindBy(xpath="//td[@class='text-center']")
			private static WebElement warehouseInMainPageEmpty;
		    
			
			@FindBy(xpath="//*[@id='iBins']")
			private static WebElement binsCombobox;
		

			@FindBy(xpath="//*[@id='bDontMaintainBin']")
			private static WebElement doNotMain;
			
			
			
		    //Edit option Fields				
			@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
			public static WebElement editcloseBtn;
			
			
			@FindBy(xpath="//button[@id='btnMasterClone']")
			public static WebElement editcloneBtn;
			
			@FindBy(xpath="//*[@id='btnMasterCopy']")
			public static WebElement copyBtn;
		    
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
			
			
			
//Master Customization
			
			

			
				
				
					
					
						@FindBy(xpath="//div[@id='mainTab_0']//tbody//tr[1]//td[4]")
						private static WebElement accountCustomizeName;
	
						@FindBy(xpath="//div[@id='mainTab_0']//tr[2]//td[4]")
						private static WebElement accountCustomizeCode;

					
						
						
						

						
									     
						@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[1]/span")
						private static WebElement accountAddBtn;
												     
						
						
						@FindBy(xpath="//*[@id='ExtraField_Tabs']/li[2]/a")
						 private static WebElement extraFields_PropertiesTab;		     
									     
							@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
							private static WebElement extraFields_PropertiesTabPartOfDeliveryAddressChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
							private static WebElement extraFields_PropertiesPartOfBillingAddressChekbox;
							
							@FindBy(xpath="//input[@id='FieldsDetails_IsMandatory']")
							private static WebElement extraFields_PropertiesMandatoryChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
							private static WebElement extraFields_PropertiesAllowAsParameterChekbox;
							
							
							
							
							
							@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
							private static WebElement extraFields_PropertiesSpellCheckChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
							private static WebElement extraFields_PropertiesMandatoryInGroupChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
							private static WebElement extraFields_PropertiesAuditTrialChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
							private static WebElement extraFields_PropertiesNotAvailableForReportsChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
							private static WebElement extraFields_PropertiesMergeFieldChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
							private static WebElement extraFields_PropertiesMassUpdateChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
							private static WebElement extraFields_PropertiesIncludeInQuickCreateChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
							private static WebElement extraFields_PropertiesCannotBeExportedChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
							private static WebElement extraFields_PropertiesCannotBeImportedChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
							private static WebElement extraFields_PropertiesCopyFromParentChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
							private static WebElement extraFields_PropertiesReadOnlyChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
							private static WebElement extraFields_PropertiesInformationFieldChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
							private static WebElement extraFields_PropertiesIsMandatoryInRevisionChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
							private static WebElement extraFields_PropertiesAvailableinCustomerPortalChekbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
							private static WebElement extraFields_PropertiesEditableinCustomerPortalChekbox;
							
							@FindBy(xpath="//*[@id='Behaviour']")
							private static WebElement extraFields_PropertiesBehaviourDropdown;   
						

					   
						
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
						   
					  
							
					    
					     

					     
					     
					     
					     
					   
						 
						    //Dash board Page
							
						
						    
							 
		public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			 //Thread.sleep(5000);
		        
		        try 
		        {
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
					doNotShowCheckbox.click();
					
					//Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDemoPopupScreen));
					closeBtnInDemoPopupScreen.click(); 
					
					System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");
					
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


		 public static boolean checkOpenWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
			
				Thread.sleep(7000);
				
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

		
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		     
		     homeMenu.click();
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		     
		     mastersMenu.click();
		     
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseMenu));
		     
		     warehouseMenu.click();
		    	  
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));		
		     
			 if((userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ")))
			 {	
					excelReader.setCellData(xlfile, "Sheet1", 635, 9, resPass);
					return true;
			 }	 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 635, 9, resFail);
				 return false;
			 }
		  }
		 
		 
		 public static boolean checkMainOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
			
			System.out.println("********************* checkMainOptionsWarehouseMenu ******************");
		
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
					excelReader.setCellData(xlfile, "Sheet1", 636, 9, resPass);
					return true;
			 }	 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 636, 9, resFail);
				 return false;
			 }
		
	     }

	 
		 public static boolean checkToolsOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
		
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 
			masterRibbonToExpandOptions.click();
			Thread.sleep(2000);
			 
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
			
			System.out.println("****************************** checkToolsOptionsWarehouseMenu  ********************************************");
		
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
				excelReader.setCellData(xlfile, "Sheet1", 637, 9, resPass);
				return true;
		  }	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 637, 9, resFail);
			 return false;
		}
		
		}
		 
		  
		 public static boolean checkOtherToolsOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	

			 boolean actCustomizemasterBtn=masterCustamizemasterBtn.isDisplayed();
			/* boolean actCustomizeviewBtn=masterCustamizeViewBtn.isDisplayed();*/
			 boolean actCustomizetreeBtn=mastercustamizeTreeBtn.isDisplayed();
			 
			 boolean expCustomizemasterBtn=true;
			/* boolean expCustomizeviewBtn=true;*/
			 boolean expCustomizetreeBtn=true;

			 System.out.println("********************************************checkOtherToolsOptionsWarehouseMenu***************************************");
			 
			 System.out.println("Customize master Button:  "+actCustomizemasterBtn+"  "+expCustomizemasterBtn);
			/* System.out.println("Customize view Button:  "+actCustomizeviewBtn+"  "+expCustomizeviewBtn);*/
			 System.out.println("Customize tree Button:  "+actCustomizetreeBtn+"  "+expCustomizetreeBtn);

			 if(actCustomizemasterBtn==expCustomizemasterBtn /*&& actCustomizeviewBtn==expCustomizeviewBtn*/ &&
				actCustomizetreeBtn==expCustomizetreeBtn)
			 
			 {	
					excelReader.setCellData(xlfile, "Sheet1", 638, 9, resPass);
					return true;
			 }	 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 638, 9, resFail);
					 return false;
			 }
			
	     }

		 public static boolean checkTreeViewOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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

			 System.out.println("********************************************checkTreeViewOptionsWarehouseMenu***************************************");
			 
			 System.out.println("masterTreeIdDropdown:               "+actmasterTreeIdDropdown                +" "+expmasterTreeIdDropdown);
			 System.out.println("masterTreeIDToggleBtn:              "+actmasterTreeIDToggleBtn               +" "+expmasterTreeIDToggleBtn);
			 System.out.println("masterTreeViewIDDropdown:           "+actmasterTreeViewIDDropdown            +" "+expmasterTreeViewIDDropdown);
			 System.out.println("masterTreeViewIDToggleBtn           "+actmasterTreeViewIDToggleBtn           +" "+expmasterTreeViewIDToggleBtn);
			 System.out.println("masterOptionToHideAccountsGroupTree "+actmasterOptionToHideAccountsGroupTree +" "+expmasterOptionToHideAccountsGroupTree);

			 
			 if(actmasterTreeIdDropdown==expmasterTreeIdDropdown && actmasterTreeIDToggleBtn==expmasterTreeIDToggleBtn &&
				actmasterTreeViewIDDropdown==expmasterTreeViewIDDropdown && actmasterTreeViewIDToggleBtn==expmasterTreeViewIDToggleBtn && 
				actmasterOptionToHideAccountsGroupTree==expmasterOptionToHideAccountsGroupTree)
			 {	
					excelReader.setCellData(xlfile, "Sheet1", 639, 9, resPass);
					return true;
			 }	 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 639, 9, resFail);
				 return false;
			 }
		
	    }
		 
		 
		 public static boolean checkCreateTreeToggleOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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

			 System.out.println("********************************************checkCreateTreeToggleOptionsWarehouseMenu***************************************");
			 
			 System.out.println("masterTreeIDToggle_CreateTreeBtn:        "+actmasterTreeIDToggle_CreateTreeBtn   +" "+expmasterTreeIDToggle_CreateTreeBtn);
			 System.out.println("masterTreeIDToggle_EditBtn:              "+actmasterTreeIDToggle_EditBtn         +" "+expmasterTreeIDToggle_EditBtn);
			 System.out.println("masterTreeIDToggle_DeleteBtn:            "+actmasterTreeIDToggle_DeleteBtn       +" "+expmasterTreeIDToggle_DeleteBtn);
			 System.out.println("masterTreeIDToggle_setDefaultBtn         "+actmasterTreeIDToggle_setDefaultBtn   +" "+expmasterTreeIDToggle_setDefaultBtn);
			 
			 if(actmasterTreeIDToggle_CreateTreeBtn==expmasterTreeIDToggle_CreateTreeBtn && actmasterTreeIDToggle_EditBtn==expmasterTreeIDToggle_EditBtn &&
				actmasterTreeIDToggle_DeleteBtn==expmasterTreeIDToggle_DeleteBtn && actmasterTreeIDToggle_setDefaultBtn==expmasterTreeIDToggle_setDefaultBtn)
			 
			 {	
					excelReader.setCellData(xlfile, "Sheet1", 640, 9, resPass);
					return true;
			 }	 
			 else
			 {
				  excelReader.setCellData(xlfile, "Sheet1", 640, 9, resFail);
				  return false;
			 }
			
	     }

			 
		 public static boolean checkCreateViewToggleOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIDToggleBtn));	
			 masterTreeViewIDToggleBtn.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIdCreateViewBtn));	
			 
			 boolean actmasterTreeViewIdCreateViewBtn=masterTreeViewIdCreateViewBtn.isDisplayed();
			 boolean expmasterTreeViewIdCreateViewBtn=true;
			 
			 System.out.println("********************************************checkCreateViewToggleOptionsWarehouseMenu***********************************");
			 System.out.println("masterTreeViewIdCreateViewBtn    "+actmasterTreeViewIdCreateViewBtn +"   "+expmasterTreeViewIdCreateViewBtn);
			 
			 if(actmasterTreeViewIdCreateViewBtn==expmasterTreeViewIdCreateViewBtn)
			 {	
					excelReader.setCellData(xlfile, "Sheet1", 641, 9, resPass);
					return true;
			 }	 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 641, 9, resFail);
				 return false;
			 }
			
	    }

		 public static boolean checkHideAccountGroupsOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {

		     excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));	
			 masterOptionToHideAccountsGroupTree.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeWarehouseDisplay));	
			 
			 boolean acttreeWarehouseDisplay=treeWarehouseDisplay.isDisplayed();
			 boolean exptreeWarehouseDisplay=true;
			 
			 
			 System.out.println("************************************************checkHideAccountGroupsOptionsWarehouseMenu******************");
			 
			 System.out.println("treeWarehouseDisplay          "+acttreeWarehouseDisplay +" Value Expected :"+exptreeWarehouseDisplay);
			 
			 if(acttreeWarehouseDisplay==exptreeWarehouseDisplay)
			 {	
					excelReader.setCellData(xlfile, "Sheet1", 642, 9, resPass);
					return true;
			 }	 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 642, 9, resFail);
				 return false;
			 }
		
	    }
	    
		 
		public static boolean checkMainPageHeaderFieldsOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
			
			System.out.println("****************************** checkMainPageHeaderFieldsOptionsWarehouseMenu ********************************************");
		
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
				excelReader.setCellData(xlfile, "Sheet1", 643, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 643, 9, resFail);
			 return false;
		 }
		
	  }

			

		 
		/*public static boolean checkSearchOptionsInMainPageHeaderFieldsOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));	
			 
			 masterSearchBtn.click();
			 
			 boolean actmasterSearchTxtBtn_SearchOnBtn      =masterSearchTxtBtn_SearchOnBtn.isDisplayed();
			 boolean actmasterSearchTxtBtn_AdvanceSearchBtn =masterSearchTxtBtn_AdvanceSearchBtn.isDisplayed();
			 
			 boolean expmasterSearchTxtBtn_SearchOnBtn      =true;
			 boolean expmasterSearchTxtBtn_AdvanceSearchBtn =true;
			 
			 
			 System.out.println("*******************************************checkSearchOptionsInMainPageHeaderFieldsOptionsWarehouseMenu************************");
			 
			 System.out.println("masterSearchTxtBtn_SearchOnBtn    "+actmasterSearchTxtBtn_SearchOnBtn+"   "+expmasterSearchTxtBtn_SearchOnBtn);
			 System.out.println("masterSearchTxtBtn_AdvanceSearchBtn "+actmasterSearchTxtBtn_AdvanceSearchBtn +"   "+expmasterSearchTxtBtn_AdvanceSearchBtn);
			 
			 if(actmasterSearchTxtBtn_SearchOnBtn==expmasterSearchTxtBtn_SearchOnBtn &&
				 actmasterSearchTxtBtn_AdvanceSearchBtn==expmasterSearchTxtBtn_AdvanceSearchBtn)
			 
			 {	
				 excelReader.setCellData(xlfile, "Sheet1", 644, 9, resPass);
				 return true;
			 }	 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 644, 9, resFail);
				 return false;
			 }
		
	    }
			*/	
		public static boolean checkNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				
			 masterNewBtn.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			  boolean actnameTxt             =nameTxt.isDisplayed();
			  boolean actcodeTxt             =codeTxt.isDisplayed();
			  boolean actphyInvCountFreq     =physicalInventoryCountingFrequency.isDisplayed();
			  boolean actwarehouseType       =warehouseType.isDisplayed();
			  boolean actSaveBtn             =SaveBtn.isDisplayed();
			  boolean actcloseBtn            =closeBtn.isDisplayed();
				
			  boolean expnameTxt             =true;
			  boolean expcodeTxt             =true;
			  boolean expphyInvCountFreq     =true;
			  boolean expwarehouseType       =true;
			  boolean expSaveBtn             =true;
			  boolean expcloseBtn            =true;
				
				
			  System.out.println("******************************checkNewButton  ********************************************");
				
			  System.out.println("Name Txt Value Actual            :"+actnameTxt +           "  Value Expected : "+expnameTxt);
			  System.out.println("Code Txt Value Actual            :"+actcodeTxt+            "  Value Expected : "+expcodeTxt);
			  System.out.println("actphyInvCountFreq Value Actual  :"+actphyInvCountFreq+    "  Value Expected : "+expphyInvCountFreq);
			  System.out.println("warehouseType Value Actual       :"+actwarehouseType  +    "  Value Expected : "+expwarehouseType);
			  System.out.println("Save Btn Value Actual            :"+actSaveBtn+            "	Value Expected : "+expSaveBtn);
			  System.out.println("CloseBtn Value Actual            :"+actcloseBtn+           "	Value Expected : "+expcloseBtn);
				
			  if( actnameTxt==expnameTxt  && actcodeTxt==expcodeTxt 
					  && actphyInvCountFreq==expphyInvCountFreq && actwarehouseType==expwarehouseType 
					  && actSaveBtn==expSaveBtn&& actcloseBtn==expcloseBtn)
			 
			 {
				 
				 excelReader.setCellData(xlfile, "Sheet1", 645, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 645, 9, resFail);
					 return false;
			 }
	      }

		 
		 
	 
		
		
		
		
		public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("*************************************checkSaveButtonWithoutInputNameMandatoryFieldsInNew******************");
			 
			 String expMessage="In Tab :General ---> Name Field is Required";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 646, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 646, 9, resFail);
				 return false;
			 }
	      }
				
				
		public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.click();
			 
			 nameTxt.sendKeys("WH");
			 
			  //Thread.sleep(2000);
		
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("***********************************checkSaveButtonWithoutInputCodeMandatoryFieldsInNew************************");
			 
			 String expMessage="In Tab :General ---> Code Field is Required";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 647, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 647, 9, resFail);
				 return false;
			 }
	      }
		
		// Error Message may not Capture
		public static boolean checkSaveButtonWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				 
		     codeTxt.sendKeys("WH");
		         
	         //Thread.sleep(3000);
	         
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("*******************************checkSaveButtonWithInputingMandatoryFields********");
			 
			 String expMessage="Saved Successfully";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 648, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 648, 9, resFail);
				 return false;
			 }
	      }
		
		
		
		
		
				
				
		public static boolean checkWarehouseCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 		   		 
	  		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			
			 nameTxt.click();

			  boolean actnameTxt             = nameTxt.isDisplayed();
			  boolean actcodeTxt             = codeTxt.isDisplayed();
			  boolean actphyInvCountFreq     = physicalInventoryCountingFrequency.isDisplayed();
			  boolean actwarehouseType       = warehouseType.isDisplayed();
			  boolean actSaveBtn             = SaveBtn.isDisplayed();
			  boolean actcloseBtn            = closeBtn.isDisplayed();
				
			  boolean expnameTxt             = true;
			  boolean expcodeTxt             = true;
			  boolean expphyInvCountFreq     = true;
			  boolean expwarehouseType       = true;
			  boolean expSaveBtn             = true;
			  boolean expcloseBtn            = true;
				
				
			  System.out.println("******************************checkNewButton  ********************************************");
				
			  System.out.println("Name Txt Value Actual            :"+actnameTxt +           "  Value Expected : "+expnameTxt);
			  System.out.println("Code Txt Value Actual            :"+actcodeTxt+            "  Value Expected : "+expcodeTxt);
			  System.out.println("actphyInvCountFreq Value Actual  :"+actphyInvCountFreq+    "  Value Expected : "+expphyInvCountFreq);
			  System.out.println("warehouseType Value Actual       :"+actwarehouseType  +    "  Value Expected : "+expwarehouseType);
			  System.out.println("Save Btn Value Actual            :"+actSaveBtn+            "	Value Expected : "+expSaveBtn);
			  System.out.println("CloseBtn Value Actual            :"+actcloseBtn+           "	Value Expected : "+expcloseBtn);
				
			  if( actnameTxt==expnameTxt  && actcodeTxt==expcodeTxt 
					  && actphyInvCountFreq==expphyInvCountFreq && actwarehouseType==expwarehouseType 
					  && actSaveBtn==expSaveBtn&& actcloseBtn==expcloseBtn)
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 649, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 649, 9, resFail);
					 return false;
			 }
	      }
						
		public static boolean checkNewlyCreatedWarehouseDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			 
			 closeBtn.click();
			 
			/* //Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
			 
			 String  actaccountNewCreationName=accountNewCreationName.getText();
			 String  expaccountNewCreationName="WH";*/
			 
			 Thread.sleep(3000);
			 
			 int warehouseCount = warehouseNameList.size();
				boolean warehouse=false;

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WH"))     
			 			{
			 				warehouse = true;
			 				break;
			 			}
			 		}
			 
			 
			 System.out.println("*********************************checkNewlyCreatedWarehouseDisplayInGrid******");
			 
			 
//			 System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);
			 
			 if(warehouse == true)
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 650, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 650, 9, resFail);
				 return false;
			 }
	      }

		
		public static boolean checkEditOptionForNewlyCreatedWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			 
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
			 
			 unitFirstCheckBox.click();*/
			 
			 Thread.sleep(3000);
			 int warehouseCount= warehouseNameList.size();
				

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WH"))     
			 			{
			 				warehouseCheckboxList.get(i).click();
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
			 String  expnameTxt="WH";
			 
			 System.out.println("*************************************checkEditOptionForNewlyCreatedWarehouse***********************");
			 
			 System.out.println("nameTxt                 "+actnameTxt +" Value Expected  "+expnameTxt);
			 
			 
			 if(actnameTxt.equalsIgnoreCase(expnameTxt))
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 651, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 651, 9, resFail);
				 return false;
			 }
	      }
		
		
		
		public static boolean checkUpateForNewlyCreateWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 		 	 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.click();
			 
			 nameTxt.clear();
			 
			 nameTxt.sendKeys("SECUNDERABAD");
			 
		    
			 nameTxt.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			 
			 codeTxt.click();
			 
			 codeTxt.clear();
			 
			 codeTxt.sendKeys("SECUNDERABAD");
			 
			 codeTxt.sendKeys(Keys.TAB);
			 
			 /*//Thread.sleep(3000);	
			 
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsCombobox));
			 
             binsCombobox.click();
			 
             binsCombobox.sendKeys("Bin Update");*/
             
            
	         
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	     
	         nameTxt.click();
	         
	         //Thread.sleep(2000);
	         
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 String expMessage="Updated Successfully";
				
			 String actMessage=checkValidationMessage(expMessage);

			 System.out.println("***************************************checkUpateForNewlyCreateWarehouse************************");
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 652, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 652, 9, resFail);
				 return false;
			 }
	      }

				
		
		
		public static boolean checkUpdatedMasterWarehouseDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
			 
			 String  actaccountNewCreationName=accountNewCreationName.getText();
			 String  expaccountNewCreationName="SECUNDERABAD";*/
			 
			 Thread.sleep(3000);
			 
			 int warehouseCount = warehouseNameList.size();
				boolean warehouse=false;

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("SECUNDERABAD"))     
			 			{
			 				warehouse = true;
			 				break;
			 			}
			 		}
			 
			 
			 
			 System.out.println("*********************************checkUpdatedMasterWarehouseDisplayInGrid******");
			 
			 
			/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
			 
			 if(warehouse == true)
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 653, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 653, 9, resFail);
				 return false;
			 }
	      }
		
		
		

		
		
		public static boolean checkCloneButtonAndSaveInWarehouseMasterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
			 
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
			 
			 unitFirstCheckBox.click();*/
			 
			 Thread.sleep(3000);
			 int warehouseCount= warehouseNameList.size();
				

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("SECUNDERABAD"))     
			 			{
			 				warehouseCheckboxList.get(i).click();
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
			 
			 //Thread.sleep(3000);

			 nameTxt.sendKeys("HYDERABAD");
			 
			 nameTxt.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			 
			 codeTxt.sendKeys("HYDERABAD");
			 
			 codeTxt.sendKeys(Keys.TAB);
			 
             //Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("************************************checkCloneButtonAndSaveInWarehouseMasterCreation****************************");
			 
			 String expMessage="Saved Successfully";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 654, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 654, 9, resFail);
				 return false;
			 }
	      }
		
		public static boolean checkWarehouseDisplayInUnitsSavingWithCloneMasterCreationOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			
			 
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 

			 String  actaccountNewCreationName=accountNewCreationName.getText();
			 String  expaccountNewCreationName="HYDERABAD";*/
			 
			 
			 Thread.sleep(3000);
			 
			 int warehouseCount = warehouseNameList.size();
				boolean warehouse=false;

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("HYDERABAD"))     
			 			{
			 				warehouse = true;
			 				break;
			 			}
			 		}
			 
		
			 System.out.println("*********************************checkWarehouseDisplayInUnitsSavingWithCloneMasterCreationOptions******");
			 
			 
			/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
			 
			 if(warehouse == true)
		
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 655, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 655, 9, resFail);
				 return false;
			 }
	      }

		
		
		
		
		
		public static boolean checkCloneButtonAndSaveInWarehoueMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
			 
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
			 
			 unitFirstCheckBox.click();*/
			 
			 
			 Thread.sleep(3000);
			 int warehouseCount= warehouseNameList.size();
				

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("HYDERABAD"))     
			 			{
			 				warehouseCheckboxList.get(i).click();
			 				break;
			 			}
			 		}
			 
			 

			 //Copy and Clone is checked at once
			 
			 //First Copy is selected then the Clone 
								  		 
			 
			 //Thread.sleep(3000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloneBtn));
				
			 masterCloneBtn.click();
				  		 
			 //Thread.sleep(3000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.click();

			 nameTxt.sendKeys("MUMBAI");
			 

			 nameTxt.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			 
			 codeTxt.sendKeys("MUMBAI");
			 
			 codeTxt.sendKeys(Keys.TAB);
			 
			 
			 //here we are doing copy option
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyBtn));
				
			 copyBtn.click();
			 
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.click();
			 
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("************************************checkCloneButtonAndSaveInWarehoueMasterOptions***********************");
			 
			 
			 String expMessage="Saved Successfully";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 656, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 656, 9, resFail);
				 return false;
			 }
	      }
		
		
			
			
			
		public static boolean checkUnitDisplayInUnitsSavingWithCloneMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			
			 
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 

			 String  actaccountNewCreationName=accountNewCreationName.getText();
			 String  expaccountNewCreationName="MUMBAI";*/
			 
			 
			 
			 
			 Thread.sleep(3000);
			 
			 int warehouseCount = warehouseNameList.size();
				boolean warehouse=false;

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("MUMBAI"))     
			 			{
			 				warehouse = true;
			 				break;
			 			}
			 		}
			 
			 
			 System.out.println("*********************************checkUnitDisplayInUnitsSavingWithCloneMasterOptions******");
			 
			 
			/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
			 
			 if(warehouse == true)
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 657, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 657, 9, resFail);
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
			
			 //Thread.sleep(3000);
			 
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.click();
			 
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("***********************************checkCopyOptionByPasteOptionWithNewButton****************************");
			 
			 String expMessage="Code Is Unique";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 658, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 658, 9, resFail);
				 return false;
			 }
	      }
		
		
		
		public static boolean checkSaveWarehouseUsingCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.click();
			 
			 nameTxt.clear();

			 nameTxt.sendKeys("WHTOINACTIVE");
			 
			 //Thread.sleep(3000);
			 
			 getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();
			 Thread.sleep(1000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			 
			 codeTxt.click();
			 
			 codeTxt.clear();
			 
			 codeTxt.sendKeys("WHTOINACTIVE");
			 
			 //Thread.sleep(3000);
			 
			 getAction().moveToElement(codeTxt).sendKeys(Keys.TAB).perform();

	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.click();
			 
			 //Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();

			 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.click();*/
			 
			 System.out.println("************************************************checkSaveWarehouseUsingCopyAndPaste**************************************");
			 
			 String expMessage="Saved Successfully";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 659, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 659, 9, resFail);
				 return false;
			 }
	      }
		
		
		
		
		
		public static boolean checkWarehouseDisplaySavingWithCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			 
			 closeBtn.click();
			 
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 

			 String  actaccountNewCreationName=accountNewCreationName.getText();
			 String  expaccountNewCreationName="WHTOINACTIVE";*/
			 
			 
			 
			 Thread.sleep(3000);
			 
			 int warehouseCount = warehouseNameList.size();
				boolean warehouse=false;

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WHTOINACTIVE"))     
			 			{
			 				warehouse = true;
			 				break;
			 			}
			 		}
			 
			 
			 System.out.println("*********************************checkWarehouseDisplaySavingWithCopyAndPaste******");
			 
			 
			/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
			 
			 if(warehouse == true)
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 660, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 660, 9, resFail);
				 return false;
			 }
	      }
		
		

			
					
		public static boolean checkWarehouseMasterProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 		 		 
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
			 
			 unitFirstCheckBox.click();*/
			 
			 
			 Thread.sleep(3000);
			 int warehouseCount= warehouseNameList.size();
				

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WHTOINACTIVE"))     
			 			{
			 				warehouseCheckboxList.get(i).click();
			 				break;
			 			}
			 		}

			 		 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			 
			 masterPropertiesBtn.click();
			 
			 //Thread.sleep(3000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehousePropertiesLabel));
			 boolean actwarehousePropertiesLabel                                 = warehousePropertiesLabel.isDisplayed();
			 boolean actstatusDropdown                                         = statusDropdown.isDisplayed();
			 boolean actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox  = doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox.isDisplayed();
			 boolean actallowOtherCompaniesToViewRecordsCheckbox               = allowOtherCompaniesToViewRecordsCheckbox.isDisplayed();
			
			 boolean expwarehousePropertiesLabel                                 = true;
			 boolean expstatusDropdown                                         = true;
			 boolean expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox  = true;
			 boolean expallowOtherCompaniesToViewRecordsCheckbox               = true;
			
			 System.out.println("  ******************************************checkWarehouseMasterProperties************************************");
			 
			 System.out.println("warehousePropertiesLabel                                "+actwarehousePropertiesLabel        +" Value Excepted  "+expwarehousePropertiesLabel);
			 System.out.println("statusDropdown                                        "+actstatusDropdown              +"Value Excepted   "+expstatusDropdown);
			 System.out.println("doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox "+actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox      +"Value Excepted   "+expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox);
			 System.out.println("allowOtherCompaniesToViewRecordsCheckbox              "+actallowOtherCompaniesToViewRecordsCheckbox +"Value Excepted   "+expallowOtherCompaniesToViewRecordsCheckbox);
			 
			 
			 if(actwarehousePropertiesLabel==expwarehousePropertiesLabel && actstatusDropdown==expstatusDropdown &&
					 actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox==expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox && 
					 actallowOtherCompaniesToViewRecordsCheckbox==expallowOtherCompaniesToViewRecordsCheckbox  )
			 {
		
				 excelReader.setCellData(xlfile, "Sheet1", 661, 9, resPass);
				 return true;
			 }
			 else
			 {
		
				 excelReader.setCellData(xlfile, "Sheet1", 661, 9, resFail);
				 return false;
			 }
					 
	      }
		
			

		public static boolean checkInActiveBySelectingOkButtonInPropertiesOptionForWrehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(statusDropdown));
			 
	        statusDropdown.click();
	        
	        //Thread.sleep(2000);
	        
	        statusDropdown.sendKeys("Inactive");
	        
	        //Thread.sleep(2000);
	        
	        statusDropdown.sendKeys(Keys.TAB);
			 

	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(properties_okBtn));
			 
	         properties_okBtn.click();
	        
	        //Thread.sleep(3000);
			 
			 
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
			 

			 String  actaccountNewCreationName=accountNewCreationName.getText();
			 String  expaccountNewCreationName="WHTOINACTIVE";*/
	         
	         Thread.sleep(3000);
			 
			 int warehouseCount = warehouseNameList.size();
				boolean warehouse=false;

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WHTOINACTIVE"))     
			 			{
			 				warehouse = true;
			 				break;
			 			}
			 		}
	         
	         
			 
			 System.out.println("*********************************checkInActiveBySelectingOkButtonInPropertiesOptionForWrehouse******");
			 
			 
			/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
			 
			 if(warehouse == true)
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 662, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 662, 9, resFail);
				 return false;
			 }
	      }
		

		@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div/label/input")
		public static List<WebElement> checkboxListInMasters;
		
		
		
		public static boolean checkCreateNewWarehouseForDeleteOptionValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			
		 masterNewBtn.click();

		 //Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 nameTxt.clear();

		 nameTxt.sendKeys("WHTODELETE");
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.click();
		 
		 codeTxt.clear();
		 
		 codeTxt.sendKeys("WHTODELETE");
		 
		 codeTxt.sendKeys(Keys.TAB);
		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("*********************************************checkCreateNewWarehouseForDeleteOptionValidationMessage***************************");
		 
		 String expMessage="In Tab :General ---> Name Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 Thread.sleep(1000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			 
		 closeBtn.click();
			 
		 //Thread.sleep(3000);
		 
		 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterSelect));
		  
		 accountMasterSelect.click();
		 
		 //Thread.sleep(3000);
		  
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
			 
		 unitFirstCheckBox.click();
			 */
		 
		 
		 Thread.sleep(3000);
		 int warehouseCount= warehouseNameList.size();
			

		 ArrayList<String> warehouseList = new ArrayList<String>();

		 		for (int i = 0; i < warehouseCount; i++)
		 		{
		 			 String data = warehouseNameList.get(i).getText();
		 			warehouseList.add(data);
		 			if(data.equalsIgnoreCase("WHTODELETE"))     
		 			{
		 				warehouseCheckboxList.get(i).click();
		 				break;
		 			}
		 		}

	
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
	     
	     masterDeleteBtn.click();
	     
	     //Thread.sleep(2000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
	     
         String actgetMsgOnDelete=getMsgOnDelete.getText();
	     
	     String expgetMsgOnDelete="Would you like to delete this selected master";
	     
	     System.out.println("getMsgOnDelete                  "+actgetMsgOnDelete +" Value Excepted  :"+expgetMsgOnDelete);
	     
	     
		 if(actgetMsgOnDelete.equalsIgnoreCase(expgetMsgOnDelete))
		 {

			 excelReader.setCellData(xlfile, "Sheet1", 663, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 663, 9, resFail);
			 return false;
		 }
	    }
		
		
		

	public static boolean checkOkInDeleteValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
	    
	     clickOnOkInDelete.click();
	     
	     System.out.println("*************************************checkOkInDeleteValidationMessage*******************************");
	     
	     String expMessage="Record Deleted Successfully.";
			
	     String actMessage=checkValidationMessage(expMessage);
	     
	     if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 664, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 664, 9, resFail);
			 return false;
		 }	 
	}
			
	public static boolean checkDeleteWarehouseDisplayBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="WHTOINACTIVE";*/
		 
		 
		 
		 Thread.sleep(3000);
		 
		 int warehouseCount = warehouseNameList.size();
			boolean warehouse=false;

		 ArrayList<String> warehouseList = new ArrayList<String>();

		 		for (int i = 0; i < warehouseCount; i++)
		 		{
		 			 String data = warehouseNameList.get(i).getText();
		 			warehouseList.add(data);
		 			if(data.equalsIgnoreCase("WHTOINACTIVE"))     
		 			{
		 				warehouse = true;
		 				break;
		 			}
		 		}


		 
		 
		 
		 System.out.println("*********************************checkDeleteWarehouseDisplayBeforeCustomization******");
		 
		 
		/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
		 
		 if(warehouse == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 665, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 665, 9, resFail);
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
			 
			  boolean actnameTxt             = nameTxt.isDisplayed();
			  boolean actcodeTxt             = codeTxt.isDisplayed();
			  boolean actphyInvCountFreq     = physicalInventoryCountingFrequency.isDisplayed();
			  boolean actwarehouseType       = warehouseType.isDisplayed();
			  boolean actSaveBtn             = SaveBtn.isDisplayed();
			  boolean actcloseBtn            = closeBtn.isDisplayed();
				
			  boolean expnameTxt             = true;
			  boolean expcodeTxt             = true;
			  boolean expphyInvCountFreq     = true;
			  boolean expwarehouseType       = true;
			  boolean expSaveBtn             = true;
			  boolean expcloseBtn            = true;
				
				
			  System.out.println("******************************checkAddGroupButton  ********************************************");
				
			  System.out.println("Name Txt Value Actual            :"+actnameTxt +           "  Value Expected : "+expnameTxt);
			  System.out.println("Code Txt Value Actual            :"+actcodeTxt+            "  Value Expected : "+expcodeTxt);
			  System.out.println("actphyInvCountFreq Value Actual  :"+actphyInvCountFreq+    "  Value Expected : "+expphyInvCountFreq);
			  System.out.println("warehouseType Value Actual       :"+actwarehouseType  +    "  Value Expected : "+expwarehouseType);
			  System.out.println("Save Btn Value Actual            :"+actSaveBtn+            "	Value Expected : "+expSaveBtn);
			  System.out.println("CloseBtn Value Actual            :"+actcloseBtn+           "	Value Expected : "+expcloseBtn);
				
			  if( actnameTxt==expnameTxt  && actcodeTxt==expcodeTxt 
					  && actphyInvCountFreq==expphyInvCountFreq && actwarehouseType==expwarehouseType 
					  && actSaveBtn==expSaveBtn&& actcloseBtn==expcloseBtn)
			 
			 	 {
					 
					 excelReader.setCellData(xlfile, "Sheet1", 666, 9, resPass);
					 return true;
				 }
				 else
				 {
					 excelReader.setCellData(xlfile, "Sheet1", 666, 9, resFail);
						 return false;
				 }
	    }
		
		
		
		public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				 
			 //Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("*************************************checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption*****");
			 
			 String expMessage="In Tab :General ---> Name Field is Required";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 667, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 667, 9, resFail);
				 return false;
			 }
	    }
		
		
		public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(nameTxt));
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.sendKeys("WH");
			 
			 nameTxt.sendKeys(Keys.TAB);
			 
			 //Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("***********************************************checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption********************");
			 
			 String expMessage="In Tab :General ---> Code Field is Required";
				
			 String actMessage=checkValidationMessage(expMessage);
			 		 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 668, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 668, 9, resFail);
				 return false;
			 }
	    }
		
		
		// Error Message May not Capture
		public static boolean checkSaveButtonInAddGroupWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			 
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			 
	         codeTxt.click();
	       
	         codeTxt.sendKeys("WH");
	      
	         codeTxt.sendKeys(Keys.TAB);
	         
	         //Thread.sleep(2000);
	       
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("*****************************************checkSaveButtonInAddGroupWithInputingMandatoryFields*************************");
			 
			 String expMessage="Saved Successfully";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 669, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 669, 9, resFail);
				 return false;
			 }
	    }
		
		
		
		public static boolean checkWarehouseAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 		 

			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.click();
			 
			  boolean actnameTxt             = nameTxt.isDisplayed();
			  boolean actcodeTxt             = codeTxt.isDisplayed();
			  boolean actphyInvCountFreq     = physicalInventoryCountingFrequency.isDisplayed();
			  boolean actwarehouseType       = warehouseType.isDisplayed();
			  boolean actSaveBtn             = SaveBtn.isDisplayed();
			  boolean actcloseBtn            = closeBtn.isDisplayed();
				
			  boolean expnameTxt             = true;
			  boolean expcodeTxt             = true;
			  boolean expphyInvCountFreq     = true;
			  boolean expwarehouseType       = true;
			  boolean expSaveBtn             = true;
			  boolean expcloseBtn            = true;
				
				
			  System.out.println("******************************checkWarehouseAddGroupCreationScreenAfterSaving  ********************************************");
				
			  System.out.println("Name Txt Value Actual            :"+actnameTxt +           "  Value Expected : "+expnameTxt);
			  System.out.println("Code Txt Value Actual            :"+actcodeTxt+            "  Value Expected : "+expcodeTxt);
			  System.out.println("actphyInvCountFreq Value Actual  :"+actphyInvCountFreq+    "  Value Expected : "+expphyInvCountFreq);
			  System.out.println("warehouseType Value Actual       :"+actwarehouseType  +    "  Value Expected : "+expwarehouseType);
			  System.out.println("Save Btn Value Actual            :"+actSaveBtn+            "	Value Expected : "+expSaveBtn);
			  System.out.println("CloseBtn Value Actual            :"+actcloseBtn+           "	Value Expected : "+expcloseBtn);
				
			  if( actnameTxt==expnameTxt  && actcodeTxt==expcodeTxt 
					  && actphyInvCountFreq==expphyInvCountFreq && actwarehouseType==expwarehouseType 
					  && actSaveBtn==expSaveBtn&& actcloseBtn==expcloseBtn)
			 {
					 
					 excelReader.setCellData(xlfile, "Sheet1", 670, 9, resPass);
					 return true;
				 }
				 else
				 {
					 excelReader.setCellData(xlfile, "Sheet1", 670, 9, resFail);
						 return false;
				 }
	    }
		
		
		
		public static boolean checkWarehouseAddGroupNewCreateDisplayInWarehouseGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			 
			 closeBtn.click();
			 
			 /*String  actaccountNewCreationName=accountNewCreationName.getText();
			 String  expaccountNewCreationName="WH";*/
			 
			 
			 Thread.sleep(3000);
			 
			 int warehouseCount = warehouseNameList.size();
				boolean warehouse=false;

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WH"))     
			 			{
			 				warehouse = true;
			 				break;
			 			}
			 		}


			 
			 
			 
			 System.out.println("*********************************checkWarehouseAddGroupNewCreateDisplayInWarehouseGrid******");
			 
			 
			/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
			 
			 if(warehouse == true)
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 671, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 671, 9, resFail);
				 return false;
			 }
	    }
		

		public static boolean checkEditOptionForNewlyCreateAddGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 
	        /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
			 
			 unitFirstCheckBox.click();*/
			 
			 Thread.sleep(3000);
			 int warehouseCount= warehouseNameList.size();
				

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WH"))     
			 			{
			 				warehouseCheckboxList.get(i).click();
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
			 String  expnameTxt="WH";
			 
			 System.out.println("*************************************checkEditOptionForNewlyCreateAddGroupWarehouse***********************");
			 
			 System.out.println("nameTxt                 "+actnameTxt +" Value Expected  "+expnameTxt);
			 
			 if(actnameTxt.equalsIgnoreCase(expnameTxt))
			 
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 672, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 672, 9, resFail);
				 return false;
			 }
	    }
		
		
		public static boolean checkUpateForNewlyCreateAddGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 		 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 
			 nameTxt.click();
			
			 nameTxt.clear();

			 nameTxt.sendKeys("WHG");
			 
			 nameTxt.sendKeys(Keys.TAB);
			 
			 //Thread.sleep(3000);
			
			 codeTxt.click();
			 
			 codeTxt.clear();

			 codeTxt.sendKeys("WHG");

             codeTxt.sendKeys(Keys.TAB);
			 
             //Thread.sleep(2000);
             
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("*********************************checkUpateForNewlyCreateAddGroupWarehouse********************");
			 
			 String expMessage="Updated Successfully";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 673, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 673, 9, resFail);
				 return false;
			 }
	    }

		
		public static boolean checkUpdatedWarehouseGroupDisplayInWarehouseGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
			 String  actaccountNewCreationName=accountNewCreationName.getText();
			 String  expaccountNewCreationName="WHG";*/
			 
			 
			 Thread.sleep(3000);
			 
			 int warehouseCount = warehouseNameList.size();
				boolean warehouse=false;

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WHG"))     
			 			{
			 				warehouse = true;
			 				break;
			 			}
			 		}
			 
			 
			 
			 System.out.println("*********************************checkUpdatedWarehouseGroupDisplayInWarehouseGrid******");
			 
			 
			/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
			 
			 if(warehouse == true)
			
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 674, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 674, 9, resFail);
				 return false;
			 }
	    }
		
		
		
		
		
		public static boolean checkClickOnGroupToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 
	      /*  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
			 
			 unitFirstCheckBox.click();
			 		 
			 getAction().doubleClick(unitFirstCheckBox).perform();*/
			 
			 Thread.sleep(3000);
			 int warehouseCount= warehouseNameList.size();
				

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WHG"))     
			 			{
			 				WebElement checkBox = warehouseCheckboxList.get(i);
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
			 
			 String expaccountGroupTitleDisplay="WHG";
			 String expclickOnEmptyGroup="No record found";
			 
			 System.out.println("**************************************************checkClickOnGroupToDisplayEmpty*********************************");
			 
			 System.out.println("accountGroupTitleDisplay      "+actaccountGroupTitleDisplay +" Value Expected  :"+expaccountGroupTitleDisplay);
			 System.out.println("clickOnEmptyGroup             "+actclickOnEmptyGroup        +" Value Expected  :"+expclickOnEmptyGroup);
			 
			 if(actaccountGroupTitleDisplay.equalsIgnoreCase(expaccountGroupTitleDisplay) && 
					 actclickOnEmptyGroup.equalsIgnoreCase(expclickOnEmptyGroup))
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 675, 9, resPass);
				 return true;
			 }
			 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 675, 9, resFail);
				 return false;
			 }
	    }
		
		
		

		public static boolean checkSaveWarehouseInWarehouseGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				
			 masterNewBtn.click();

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			 		 
			 nameTxt.sendKeys("WH1");
			 
			 //Thread.sleep(3000);
			 
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			 
	         codeTxt.sendKeys("WH1");
	         
	         //Thread.sleep(3000);
	       
	         codeTxt.sendKeys(Keys.TAB);
	       
	         //Thread.sleep(2000);     
	       
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			 SaveBtn.click();
			 
			 System.out.println("********************************************checkSaveWarehouseInWarehouseGroup****************************");
			 
			 String expMessage="Saved Successfully";
				
			 String actMessage=checkValidationMessage(expMessage);
			 
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 676, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 676, 9, resFail);
				 return false;
			 }
	    }
		
		
		
		
		
		
		
		public static boolean checkCloseOptionInWarehouseCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			 
			 closeBtn.click();
			 
			 //Thread.sleep(3000);
			 
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
			 String  actaccountNewCreationName=accountNewCreationName.getText();
			 String  expaccountNewCreationName="WH1";*/
			 
			 Thread.sleep(3000);
			 
			 int warehouseCount = warehouseNameList.size();
				boolean warehouse=false;

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WH1"))     
			 			{
			 				warehouse = true;
			 				break;
			 			}
			 		}
			 
			 
			 
			 
			 
			 
			 System.out.println("*********************************checkCloseOptionInWarehouseCreation******");
			 
			 
			/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
			 
			 if(warehouse == true)
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 677, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 677, 9, resFail);
				 return false;
			 }
	    }
		
		
		public static boolean checkWarehouseFirstLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsFirstLevelMastersDisplay));
			 
			 binsFirstLevelMastersDisplay.click();
			 
			/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
			 String  actaccountNewCreationName=accountNewCreationName.getText();
			 String  expaccountNewCreationName="WHG";*/
			 
			 
			 Thread.sleep(3000);
			 
			 int warehouseCount = warehouseNameList.size();
				boolean warehouse=false;

			 ArrayList<String> warehouseList = new ArrayList<String>();

			 		for (int i = 0; i < warehouseCount; i++)
			 		{
			 			 String data = warehouseNameList.get(i).getText();
			 			warehouseList.add(data);
			 			if(data.equalsIgnoreCase("WHG"))     
			 			{
			 				warehouse = true;
			 				break;
			 			}
			 		}
			 
			 
			 
			 System.out.println("*********************************checkWarehouseFirstLevel******");
			 
			 
			/* System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);*/
			 
			 if(warehouse == true)
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 678, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 678, 9, resFail);
				 return false;
		     }
			 
	    }
		
		
		public static boolean checkCloseWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsCloseBtn));
			 
			unitsCloseBtn.click();
			 
			//Thread.sleep(3000);
			 
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
				 
		    boolean actlabelDashboard                 = dashboardName.isDisplayed();
			/*boolean actselectDashboard                = selectDashboard.isDisplayed();*/
			boolean actnewAddDashBoard                = newAddDashBoard.isDisplayed();
			boolean actdashboardCustomizationSettings = dashboardCustomizationSettings.isDisplayed();
			
			
			boolean explabelDashboard                 = true;
			boolean expselectDashboard                = true;
			boolean expnewAddDashBoard                = true;
			boolean expdashboardCustomizationSettings = true;
			
			System.out.println("********************************************** checkCloseWarehouseMaster ******************");
		
			System.out.println("Home Page labelDashboard Value Actual                      :"+actlabelDashboard+               "  Value Expected : "+explabelDashboard);
			/*System.out.println("Home Page selectDashboard Value Actual                     :"+actselectDashboard+   "  Value Expected : "+expselectDashboard);*/
			System.out.println("Home Page newAddDashBoard Actual                           :"+actnewAddDashBoard+    "	 Value Expected : "+expnewAddDashBoard);
			System.out.println("Home Page dashboardCustomizationSettings Value Actual      :"+actdashboardCustomizationSettings+"	 Value Expected : "+expdashboardCustomizationSettings);
			
			if( actlabelDashboard==explabelDashboard /* && actselectDashboard==expselectDashboard*/
					&& actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings)
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 679, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 679, 9, resFail);
			 return false;
		 }
	  }
		

         //Warehouse Customization editing the Bin Type as All Group Data
		
		public static boolean checkCustomizeMasterTabOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 		 
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 
		     masterRibbonToExpandOptions.click();
		     	     
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
			/* boolean actitemInfoPanelCustomizationTab           = itemInfoPanelCustomizationTab.isDisplayed();*/
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
			/* System.out.println("itemInfoPanelCustomizationTab    "+actitemInfoPanelCustomizationTab +" Value Excepted   :"+expitemInfoPanelCustomizationTab);*/
			 System.out.println("accountReportsTab                "+actaccountReportsTab             +" Value Excepted   :"+expaccountReportsTab);
			 
			 if (actplusBtn==expplusBtn && actmasterFieldsOption==expmasterFieldsOption && actaccUniqueConstraintsOption==expaccUniqueConstraintsOption && 
					 actRulesOption==expRulesOption && actrules_ExternalModules==exprules_ExternalModules /*&& actitemInfoPanelCustomizationTab==expitemInfoPanelCustomizationTab */&& 
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
         	/*boolean actextraFields_FieldDetailsInCludeGroups   	         =extraFields_FieldDetailsInCludeGroups.isDisplayed();
         */
         	
         	boolean expextraFields_FieldDetailsCaption   				=true;
         	boolean expextraFields_FieldDetailsName   					=true;
         	boolean expextraFields_FieldDetailsDatTypeDropdown   		=true;
         	boolean expextraFields_FieldDetailsBannerText   			=true;
         	boolean expextraFields_FieldDetails_MaxSize   				=true;
         	boolean expextraFields_FieldDetailsControlTypeDropdown   	=true;
         	boolean expextraFields_FieldDetailsToolTipText   			=true;
         	/*boolean expextraFields_FieldDetailsInCludeGroups   	        =true;*/
         	
         	
         	System.out.println("************************checkFieldsDetailsTabInCreateCreateTabDisplayInCustomizeTab********************************");
         	
         	System.out.println("extraFields_FieldDetailsCaption                : "+actextraFields_FieldDetailsCaption               +" Value Expected : "+expextraFields_FieldDetailsCaption);
         	System.out.println("extraFields_FieldDetailsName                   : "+actextraFields_FieldDetailsName                  +" Value Expected : "+expextraFields_FieldDetailsName);
         	System.out.println("extraFields_FieldDetailsDatTypeDropdown        : "+actextraFields_FieldDetailsDatTypeDropdown       +" Value Expected : "+expextraFields_FieldDetailsDatTypeDropdown);
         	System.out.println("extraFields_FieldDetailsBannerText             : "+actextraFields_FieldDetailsBannerText            +" Value Expected : "+expextraFields_FieldDetailsBannerText);
         	System.out.println("extraFields_FieldDetails_MaxSize               : "+actextraFields_FieldDetails_MaxSize              +" Value Expected : "+expextraFields_FieldDetails_MaxSize);
         	System.out.println("extraFields_FieldDetailsControlTypeDropdown    : "+actextraFields_FieldDetailsControlTypeDropdown   +" Value Expected : "+expextraFields_FieldDetailsControlTypeDropdown);
         	System.out.println("extraFields_FieldDetailsToolTipText            : "+actextraFields_FieldDetailsToolTipText           +" Value Expected : "+expextraFields_FieldDetailsToolTipText);
         	/*System.out.println("extraFields_FieldDetailsInCludeGroups          : "+actextraFields_FieldDetailsInCludeGroups         +" Value Expected : "+expextraFields_FieldDetailsInCludeGroups);
         	*/
                  
         	if(actextraFields_FieldDetailsCaption==expextraFields_FieldDetailsCaption && actextraFields_FieldDetailsName==expextraFields_FieldDetailsName
         			&& actextraFields_FieldDetailsDatTypeDropdown==expextraFields_FieldDetailsDatTypeDropdown
         			&& actextraFields_FieldDetailsBannerText==expextraFields_FieldDetailsBannerText
         			&& actextraFields_FieldDetails_MaxSize==expextraFields_FieldDetails_MaxSize
         			&& actextraFields_FieldDetailsControlTypeDropdown==expextraFields_FieldDetailsControlTypeDropdown
         			&& actextraFields_FieldDetailsToolTipText==expextraFields_FieldDetailsToolTipText
         			/*&& actextraFields_FieldDetailsInCludeGroups==expextraFields_FieldDetailsInCludeGroups*/)
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
		
		
		public static boolean checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	     {
   			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
   			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
   			
   			 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsInCludeGroups));
   			 
   			 extraFields_FieldDetailsInCludeGroups.click();
   			   			
   			 extraFields_FieldDetailsInCludeGroups.sendKeys("All Data");
   			
   			 extraFields_FieldDetailsInCludeGroups.sendKeys(Keys.TAB);*/
   		     
   		     //Thread.sleep(2000);
   		     
   		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			 
   		     extraFields_PropertiesTab.click();
   		     
   		     //Thread.sleep(2000);1
   		     
   		     if(extraFields_PropertiesHiddenChekboxSelected.isSelected() && extraFields_PropertiesHiddenInGroupChekboxSelected.isSelected())
   		    {
	   		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				 
	   		     extraFields_PropertiesHiddenChekbox.click();
			     
			     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				 
			     extraFields_PropertiesHiddenInGroupChekbox.click();
   		     }
   		  
   		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		     
	   		extraFields_OkBtn.click();
	   	 
	   		String expMessage="Field Updated Successfully";
			
	   		String actMessage=checkValidationMessage(expMessage);
	          
	   		Thread.sleep(2000);
	   		
	   		closeBtnInCreateTabCustomizeMasetrWarehouse.click();
	   		 Thread.sleep(2000);
	   		System.out.println("*********************************checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab******************");
	   		
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
	 		  
	 		  //Thread.sleep(3000);
	 		  
              getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		     
		      homeMenu.click();
			
		      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		     
		      mastersMenu.click();
		     
		      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseMenu));
		     
		      warehouseMenu.click();
		     
		      //Thread.sleep(3000);
		    	  
		     /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFourthRow));
		      
		      selectFourthRow.click();*/
		      
		      int accountsCount = warehouseNameList.size();
				 boolean trailAccount = false;

				 ArrayList<String> accountslist = new ArrayList<String>();

				 		for (int i = 0; i < accountsCount; i++)
				 		{
				 			 String data = warehouseNameList.get(i).getText();
				 			accountslist.add(data);
				 			if(data.equalsIgnoreCase("HYDERABAD"))     
				 			{
				 				warehouseCheckboxList.get(i).click();
				 				break;
				 			}
				 		}
  
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
             
              //Thread.sleep(2000);
			 
              binsCombobox.sendKeys(Keys.SHIFT,Keys.HOME);
             
              binsCombobox.sendKeys("BG1");
		         
	          //Thread.sleep(3000);   
	             
	          getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	     
	          nameTxt.click();
		         
		      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			  SaveBtn.click();
			 
			  System.out.println("*********************************checkCloseBtnOpenWarehouseMasterUpdateWarehouse********************");
			  
			  String expMessage="Updated Successfully";
				
			  String actMessage=checkValidationMessage(expMessage);
			  
			 if(actMessage.equalsIgnoreCase(expMessage))
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 686, 9, resPass);
				 return true;
			 }
			 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 686, 9, resFail);
				 return false;

				 
			 }
				 
				 
	     }
		
		
		public static boolean checkEditMasterUpdateWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	    {
			  excelReader=new ExcelReader(POJOUtility.getExcelPath());
			  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	         
	    
			  //Thread.sleep(3000);
			  
		   /*   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFifthRow));
		      
		      selectFifthRow.click();*/
			  
			  int accountsCount = warehouseNameList.size();
				 boolean trailAccount = false;

				 ArrayList<String> accountslist = new ArrayList<String>();

				 		for (int i = 0; i < accountsCount; i++)
				 		{
				 			 String data = warehouseNameList.get(i).getText();
				 			accountslist.add(data);
				 			if(data.equalsIgnoreCase("SECUNDERABAD"))     
				 			{
				 				warehouseCheckboxList.get(i).click();
				 				break;
				 			}
				 		}
		      
		      //Thread.sleep(2000);
		      
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
             
              binsCombobox.sendKeys("BG2");
	         
	          getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	     
	          nameTxt.click();
		             
		      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			  SaveBtn.click();
			  
			  System.out.println("*************************************checkEditMasDterUpdateWarehouse********************");
			  
			  String expMessage="Updated Successfully";
				
			  String actMessage=checkValidationMessage(expMessage);
			 
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

		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		private static WebElement wareHouse1stRowChkBox;
		
		@FindBy(xpath="//input[@name='chkRowCheck']")
		private static WebElement WH1RowChkBox;
		
		
		// Should Check
		public static boolean checkEditMasterUpdateWarehouseWH1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	    {
			  excelReader=new ExcelReader(POJOUtility.getExcelPath());
			  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	         
	    /*
		      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse1stRowChkBox));
		      getAction().doubleClick(wareHouse1stRowChkBox).build().perform();
		      
		      
		      //Thread.sleep(3000);
		      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WH1RowChkBox));
		      WH1RowChkBox.click();*/
			  
			  
			  
			  Thread.sleep(3000);
				 int warehouseCount= warehouseNameList.size();
					

				 ArrayList<String> warehouseList = new ArrayList<String>();

				 		for (int i = 0; i < warehouseCount; i++)
				 		{
				 			 String data = warehouseNameList.get(i).getText();
				 			warehouseList.add(data);
				 			if(data.equalsIgnoreCase("EURO"))     
				 			{
				 				WebElement checkbox = warehouseCheckboxList.get(i);
				 				 getAction().doubleClick(checkbox).build().perform();
				 				break;
				 			}
				 		}

			  
			  
		      
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
	          Thread.sleep(2000);
		      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			 
			  SaveBtn.click();
			  
			  System.out.println("***********************************checkEditMasterUpdateWarehouseWH1*******************************");
			  
			  String expMessage="Updated Successfully";
				
			  String actMessage=checkValidationMessage(expMessage);
			 
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
		

		public static boolean checkCloseBtnInWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  		 		
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsCloseBtn));
			 
			unitsCloseBtn.click();
			 
			//Thread.sleep(3000);
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
				 
			boolean actlabelDashboard                 = dashboardName.isDisplayed();
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
				 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplayLogo));
				 userNameDisplayLogo.click();
				  
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
				 logoutOption.click();
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 688, 9, resFail);
				 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplayLogo));
				 userNameDisplayLogo.click();
				  
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
				 logoutOption.click();
				 return false;
			 }
		  }

		
		
	public MasterWarehousePage(WebDriver driver)
	{
		
		 PageFactory.initElements(driver, this);
		
	}
	
}
