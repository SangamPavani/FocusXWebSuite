package com.focus.Pages;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sound.midi.SysexMessage;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;
import com.sun.tools.xjc.model.SymbolSpace;




public class SmokeAcctsCustomizationPage extends BaseEngine
{

	// Login Page
	@FindBy(xpath = "//*[@id='txtUsername']")
	private static WebElement username;
	
	    // Home Menu
		@FindBy(xpath = "//*[@id='1']/div/span")
		public static WebElement homeMenu;

		//Financial Menu
		@FindBy (xpath="//span[@class='icon-financial icon-font1']")
		private static WebElement financialMenu;
		

	    //Inventory Menu and Sub Menus		
		@FindBy(xpath="//div[contains(text(),'Inventory')]")
		private static WebElement  inventoryMenu; 
		
		//Fixed Assets Menu
		@FindBy (xpath="//span[@class='icon-assets icon-font1']")
		private static WebElement fixedAssetsMenu;
		
		//Production Menu
		@FindBy (xpath="//span[@class='icon-production icon-font1']")
		private static WebElement productionMenu;
		
		//Point Of Sale Menu
		@FindBy (xpath="//div[contains(text(),'Point of Sale')]")
		private static WebElement pointOfSaleMenu;
		
		//Quality Of Control Menu
		@FindBy (xpath="//span[@class='icon-quotationanalysis icon-font1']")
		private static WebElement qualityControlMenu;
		
		//Settings Menu
		@FindBy (xpath="//span[@class='icon-settings icon-font1']")
		private static WebElement SettingsMenu;
		
		
		
		 @FindBy(xpath="//*[@id='toggle_ribbon']")
		 public static WebElement masterRibbonToExpandOptions;
		 
		 @FindBy(xpath="//a[@class='lSNext']")
		 public static WebElement masterRibbonControlNextBtn;
		 
		 @FindBy(xpath="//i[@class='icon-font6 icon-custamize']")
		 public static WebElement masterCustamizemasterBtn;
			
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

						@FindBy(xpath="//div[@id='mainTab_0']//tr[3]//td[4]")
						private static WebElement accountCustomizeAccountType;

						@FindBy(xpath="//div[@id='mainTab_0']//tr[4]//td[4]")
						private static WebElement accountCustomizeCreditLimit;

						@FindBy(xpath="//div[@id='mainTab_0']//tr[5]//td[4]")
						private static WebElement accountCustomizeCreditDays;				
					
					@FindBy(xpath="//div[@id='tabId_1']//span[@class='font-5'][contains(text(),'Header Details')]")
					private static WebElement generalHeaderDetailsTab;
							
						@FindBy(xpath="//div[@id='tabId_1']//tbody[contains(@class,'ui-sortable')]//tr[1]//td[4]")
						private static WebElement accountCustomizeChequeDiscountLimit;

						@FindBy(xpath="//div[@id='HeaderDetails_0']//tr[2]//td[4]")
						private static WebElement accountCustomizeRateOfInterest;

						@FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[3]/td[4]")
						private static WebElement accountCustomizeBankAc;

						@FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[4]/td[4]")
						private static WebElement accountCustomizePDCDiscountedAccount;
						
						@FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/div[1]/span")
						private static WebElement accountHeaderMoveFiledBtn;

						@FindBy(xpath="//div[contains(text(),'Preview')]")
						private static WebElement accountHeaderPreview;
						
						@FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
						private static WebElement accountSaveBtn;
									     
						@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[1]/span")
						private static WebElement accountAddBtn;
												     
						@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[1]/span")
						private static WebElement accountCloseBtn;
		
				@FindBy(xpath="//span[@class='Flabel theme_icon-color'][contains(text(),'Settings')]")
				private static WebElement settingOption;

						@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul/li[1]/a")
						private static WebElement settingsHeaderDetailsTab;
						
								  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[1]/td[1]/i[1]")
								  private static WebElement accountSettingsHeaderEditFirstRowBtn;
								                  
								  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[2]/td[1]/i[1]")
								  private static WebElement accountSettingsHeaderEditSecondRowBtn;
						
								  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[3]/td[1]/i[1]")
								  private static WebElement accountSettingsHeaderEditThirdRowBtn;
						
								  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[4]/td[1]/i[1]")
								  private static WebElement accountSettingsHeaderEditFourthRowBtn;
						
								  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[5]/td[1]/i[1]")
								  private static WebElement accountSettingsHeaderEditFifthRowBtn;
						
								  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[6]/td[1]/i[1]")
								  private static WebElement accountSettingsHeaderEditSixthRowBtn;
						
								  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[7]/td[1]/i[1]")
								  private static WebElement accountSettingsHeaderEditSeventhRowBtn;
						
								  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[8]/td[1]/i[1]")
								  private static WebElement accountSettingsHeaderEditEighthRowBtn;
								  
								  @FindBy(xpath="//div[contains(text(),'Move Field')]")
								  private static WebElement accountSettingsHeaderMoveFiledBtn;

								  @FindBy(xpath="//div[contains(text(),'Preview')]")
								  private static WebElement accountSettingsHeaderPreview;
								  						
								  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
								  private static WebElement accountSettingsSaveBtn;
								  									    
								  @FindBy(xpath="//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
								  private static WebElement accountSettingsAddBtn;						

								  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
								  private static WebElement accountSettingsCloseBtn;							  
						
							@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul/li[2]/a")
							private static WebElement settingsBodyDetailsTab;
							
				                @FindBy(xpath="//div[@id='BodyDetails_1']//div[@class='scrollable tbl-emptyfields-mastercust']")
				                private static WebElement settingsBodyDetailsEmptyTab;
				

				@FindBy(xpath="//span[@class='Flabel theme_icon-color'][contains(text(),'Details')]")
				private static WebElement accountMasterFieldDetailsOption;
				
					
					@FindBy(xpath="//div[3]/ul/li/a/span")
			        private static WebElement detailsHeaderDetailsTab;
								
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr/td[4]")
						  private static WebElement detailsHeaderAddress;
						                  
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[2]/td[4]")
						  private static WebElement detailsHeaderCity;
				
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[3]/td[4]")
						  private static WebElement detailsHeaderPin;
				
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[4]/td[4]")
						  private static WebElement detailsHeaderDeliveryAddress;
				
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[5]/td[4]")
						  private static WebElement detailsHeaderCityOne;
				
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[6]/td[4]")
						  private static WebElement detailsHeaderPinOne;
				
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[7]/td[4]")
						  private static WebElement detailsHeaderSendEmailToCustomer;
				
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[8]/td[4]")
						  private static WebElement detailsHeaderAllowCustomerPortal;
						  
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[9]/td[4]")
						  private static WebElement detailsHeaderEmail;

						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[10]/td[4]")
						  private static WebElement detailsHeaderPassword;
						  						
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[11]/td[4]")
						  private static WebElement detailsHeaderTelNo;
						  									    
						  @FindBy(xpath="//div[3]/div/div/div/div/table/tbody/tr[12]/td[4]")
						  private static WebElement detailsHeaderFaxNo;						

						  @FindBy(xpath="//tr[13]/td[4]")
						  private static WebElement detailsHeaderBankAccountName;

						  @FindBy(xpath="//tr[14]/td[4]")
						  private static WebElement detailsHeaderBankAccountNumber;

						  @FindBy(xpath="//tr[15]/td[4]")
						  private static WebElement detailsHeaderIFSCCode;

						  @FindBy(xpath="//tr[16]/td[4]")
						  private static WebElement detailsHeaderPaymentType;

						  @FindBy(xpath="//tr[17]/td[4]")
						  private static WebElement detailsHeaderFinanceEmail;							  
				
	                      @FindBy(xpath="//div[@id='tabContent_Fields_MasterCust']//tr[18]//td[4]")
						  private static WebElement detailsHeaderPortalEmail;	

	                      @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
						  private static WebElement detailsHeaderBankSaveBtn;

						  @FindBy(xpath="//div[contains(text(),'Move Field')]")
						  private static WebElement detailsHeaderMoveFieldBtn;

						  @FindBy(xpath="//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
						  private static WebElement detailsHeaderAddBtn;

						  @FindBy(xpath="//div[contains(text(),'Preview')]")
						  private static WebElement detailsHeaderPreviewBtn;

						  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
						  private static WebElement detailsHeaderCloseBtn;							  

				@FindBy(xpath="//div[3]/ul/li[2]/a/span")
				private static WebElement detailsBodyDetailsTab;
				
				        @FindBy(xpath="//div[@id='BodyDetails_2']//div[@class='scrollable tbl-emptyfields-mastercust']")
				        private static WebElement detailsBodyDetailsEmptyTab;
				
				@FindBy(xpath="//*[@id='masterFields_list']/li[4]/span")
				private static WebElement accountMasterFieldPrintLayoutOption;
			
						  @FindBy(xpath="//div[4]/ul/li/a/span")
						  private static WebElement printlayoutHeaderDetailsTab;
						                  
						    @FindBy(xpath="//div[@id='HeaderDetails_3']//div[@class='scrollable tbl-emptyfields-mastercust']")
						    private static WebElement printLayoutHeaderDetailsEmpty;
				
						  @FindBy(xpath="//div[4]/ul/li[2]/a/span")
						  private static WebElement printLayouBodyDetailsTab;
				
						      @FindBy(xpath="//div[4]/div/div[2]/div/div/table/tbody/tr/td[4]")
						      private static WebElement printlayoutBodyVoucherType;
				
				    	      @FindBy(xpath="//div[4]/div/div[2]/div/div/table/tbody/tr[2]/td[4]")
						      private static WebElement printLayoutBodyPrintlayout;
				
						  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
						  private static WebElement printLayoutSaveBtn;
				
						  @FindBy(xpath="//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
						  private static WebElement printLayoutAddBtn;
				
						  @FindBy(xpath="//div[contains(text(),'Preview')]")
						  private static WebElement printLayoutPreviewBtn;
						  
						  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
						  private static WebElement printLayoutCloseBtn;
		
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
				
				@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
				private static WebElement  accountReports_SaveBtn;
				
				@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
				private static WebElement  accountReports_CloseBtn;
				
						@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[1]/label/input")
						private static WebElement  reports_AdvancedbudgetReportChkBox;
						
						@FindBy(xpath="//div[@id='AllReportsDiv_MasterCust']//div[1]//label[1]")
						private static WebElement  reports_MasterInfoChkBox;
									
						@FindBy(xpath="//div[@class='col-xs-12 col-sm-8 col-md-8 col-lg-9 padding0']//div[2]//label[1]")
						private static WebElement  reports_ABCAnalysisAmountChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[3]//label[1]")
						private static WebElement  reports_BankBookChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[4]//label[1]")
						private static WebElement  reports_BankreconciliationstatementChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[5]//label[1]")
						private static WebElement  reports_CashBookChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[6]//label[1]")
						private static WebElement  reports_ComparativeAnalysisChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[7]//label[1]")
						private static WebElement  reports_CustomerAgeingDetailsAnalysisChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[8]//label[1]")
						private static WebElement  reports_CustomerageingdetailbyduedateChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[9]//label[1]")
						private static WebElement  reports_CustomerageingsummaryanalysisChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[10]//label[1]")
						private static WebElement  reports_CustomerbillwisesummaryChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[11]//label[1]")
						private static WebElement  reports_CustomerduedateanalysisChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[12]//label[1]")
						private static WebElement  reports_CustomerlistingofoutstandingbillsChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[13]//label[1]")
						private static WebElement  reports_CustomeroverdueanalysisChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[14]//label[1]")
						private static WebElement  reports_CustomeroverduesummaryChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[15]//label[1]")
						private static WebElement  reports_CustomerstatementsChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[16]//label[1]")
						private static WebElement  reports_CustomersummaryageingbyduedateChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[17]//label[1]")
						private static WebElement  reports_IncomeExpenseTrendChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[18]//label[1]")
						private static WebElement  reports_InterestcalculationChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[19]//label[1]")
						private static WebElement  reports_LedgerChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[20]//label[1]")
						private static WebElement  reports_LedgerdetailChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[21]//label[1]")
						private static WebElement  reports_MonthlySalesChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[22]//label[1]")
						private static WebElement  reports_PeakandlowbalanceamountChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[23]//label[1]")
						private static WebElement  reports_PettycashbookChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[24]//label[1]")
						private static WebElement  reports_PurchaseregisterChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[25]//label[1]")
						private static WebElement  reports_PurchasereturnregisterChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[26]//label[1]")
						private static WebElement  reports_PurchasesgroupedbydepartmentChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[27]//label[1]")
						private static WebElement  reports_PurchasesgroupedbyItemChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[28]//label[1]")
						private static WebElement  reports_PurchasesgroupedbyvendorChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[29]//label[1]")
						private static WebElement  reports_SalesdaybookChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[30]//label[1]")
						private static WebElement  reports_SalesgroupedbycustomerChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[31]//label[1]")
						private static WebElement  reports_salesgroupedbydepartmentrChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[32]//label[1]")
						private static WebElement  reports_SalesgroupedbyItemChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[33]//label[1]")
						private static WebElement  reports_SalesreturnregisterChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[34]//label[1]")
						private static WebElement  reports_SchedulesChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[35]//label[1]")
						private static WebElement  reports_SubledgerChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[36]//label[1]")
						private static WebElement  reports_SummarypurchaseregisterChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[37]//label[1]")
						private static WebElement  reports_SummarysalesregisterChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[38]//label[1]")
						private static WebElement  reports_TopCustomersChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[39]//label[1]")
						private static WebElement  reports_TradingaccountrChkBox;
						
						@FindBy(xpath="//div[40]//label[1]")
						private static WebElement  reports_TransactionstypeanalysisChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[41]//label[1]")
						private static WebElement  reports_VendorageingdetailanalysisChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[42]//label[1]")
						private static WebElement  reports_VendorageingdetailbyduedateChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[43]//label[1]")
						private static WebElement  reports_VendorageingsummaryanalysisChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[44]//label[1]")
						private static WebElement  reports_VendorbillwisesummaryChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[45]//label[1]")
						private static WebElement  reports_VendorduedateanalysisChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[46]//label[1]")
						private static WebElement  reports_VendorlistingofoutstandingbillsChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[47]//label[1]")
						private static WebElement  reports_VendoroverdueanalysisChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[48]//label[1]")
						private static WebElement  reports_VendoroverduesummaryChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[49]//label[1]")
						private static WebElement  reports_VendorstatementsChkBox;
						
						@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[50]//label[1]")
						private static WebElement  reports_VendorsummaryageingbyduedateChkBox;
					
						
				@FindBy(xpath="//*[@id='masterFields_list']/li[5]/span")
				private static WebElement accountMasterFieldVATSettingsOption;
				
						@FindBy(xpath="//div[5]/div/div/div/div/table/tbody/tr/td[4]")
						private static WebElement placeOfSupply;
						
						@FindBy(xpath="//div[5]/div/div/div/div/table/tbody/tr[2]/td[4]")
						private static WebElement grn;
						
						@FindBy(xpath="//div[5]/div/div/div/div/table/tbody/tr[3]/td[4]")
						private static WebElement reverseOfChange;
						
						
					@FindBy(xpath="//div[5]/ul/li[2]/a/span")
					private static WebElement accountMasterFieldVATSettingsBody;
					
					  @FindBy(xpath="//*[@id='BodyDetails_4']/div/div")
					  private static WebElement accountMasterFieldVATSettingsBodyEmptyFields;
					
			
	                    //Create Tabs
						
						@FindBy(xpath="//button[@id='btnCreateTab_MCust']")
						private static WebElement createTab;  
							
							@FindBy(xpath="//a[contains(text(),'Tree Tab')]")
							private static WebElement createTabTreeTab; 

								@FindBy(xpath="//input[@id='txtNewTreeTabCaption']")
								private static WebElement  treeTabCaptionTxt;
								
								@FindBy(xpath="//input[@id='txtNewTreeTabName']")
								private static WebElement  treeTabTabNameTxt;
								
								@FindBy(xpath="//input[@id='fOption_tab_masterName']")
								private static WebElement  treeTabNewMastertxt;
								
								@FindBy(xpath="//*[@id='fOption_tab_masterName_input_image']/span")
								private static WebElement  treeTabNewMasterdropdown;
								
								@FindBy(xpath="//*[@id='fOption_tab_masterName_input_settings']/span")
								private static WebElement  treeTab_NewMasterSettingsBtn;
		
								@FindBy(xpath="//input[@id='txtNewTreeTabFieldCaption']")
								private static WebElement  treeTab_FieldCaptiontxt;
								
								@FindBy(xpath="//input[@id='txtNewTreeTabFieldName']")
								private static WebElement  treeTab_FieldNameTxt;
								
								@FindBy(xpath="//input[@id='bIsTreeHiddenTab']")
								private static WebElement  treeTab_HiddenChkBox;
							
										@FindBy(xpath="//div[@id='fOption_tab_masterName_customize_popup_container']")
										private static WebElement  treeTab_NewMaster_ContainerTxt;
										
										@FindBy(xpath="//div[@id='fOption_tab_masterName_customize_popup_footer']//input[1]")
										private static WebElement  treeTab_NewMaster_StanadrdfieldsBtn;
										
												@FindBy(xpath="//select[@id='fOption_tab_masterName_customize_popup_standardfields_list']")
												private static WebElement treeTab_NewMaster_Stanadrdfields_Fielddropdown;
												
												@FindBy(xpath="//input[@id='fOption_tab_masterName_customize_popup_standardfields_header']")
												private static WebElement  treeTab_NewMaster_Stanadrdfields_headerTxt;
												
												@FindBy(xpath="//select[@id='fOption_tab_masterName_customize_popup_standardfields_alignment']")
												private static WebElement  treeTab_NewMaster_Stanadrdfields_Allignmentdropdown;
												
												@FindBy(xpath="//input[@id='fOption_tab_masterName_customize_popup_standardfields_width']")
												private static WebElement  treeTab_NewMaster_Stanadrdfields_WidthTxt;
												
												@FindBy(xpath="//div[@id='divSecondsub']//input[3]")
												private static WebElement  treeTab_NewMaster_Stanadrdfields_OkBtn;
												
												@FindBy(xpath="//div[@id='divSecondsub']//input[4]")
												private static WebElement  treeTab_NewMaster_Stanadrdfields_CancelBtn;
										
										@FindBy(xpath="//div[@id='fOption_tab_masterName_search_container']//input[2]")
										private static WebElement  treeTab_NewMaster_deleteColumnBtn;
										
										@FindBy(xpath="//div[@id='divSecondsub']//input[3]")
										private static WebElement  treeTab_NewMaster_OkBtn;
										
										@FindBy(xpath="//div[@id='divSecondsub']//input[4]")
										private static WebElement  treeTab_NewMaster_CancelBtn;
							
								@FindBy(xpath="//*[@id='MCustomize_CreateTreeTab_Modal']/div/div/div[3]/button[1]")
								private static WebElement  treeTab_OkBtn;

								@FindBy(xpath="//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
								private static WebElement  treeTab_UpdateOkBtn;
								
								@FindBy(xpath="//*[@id='MCustomize_CreateTreeTab_Modal']/div/div/div[3]/button[2]")
								private static WebElement  treeTab_CancelBtn;
								
							@FindBy(xpath="//a[contains(text(),'Document Tab')]")
							private static WebElement createTab_DocumentTab;  

							            @FindBy(xpath="//input[@id='txtNewDocTabCaption']")
							            private static WebElement documentTab_TabCaption;  
							
										@FindBy(xpath="//input[@id='txtNewDocTabName']")
										private static WebElement documentTab_TabName;  
										
										@FindBy(xpath="//input[@id='bIsDocHiddenTab']")
										private static WebElement documentTab_HiddenChkbox;  
										
										@FindBy(xpath="//div[@id='MCustomize_CreateDocTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
										private static WebElement documentTab_OkBtn;  
										
										@FindBy(xpath="//div[@id='MCustomize_CreateDocTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Cancel')]")
										private static WebElement documentTab_CancelBtn; 
										
										@FindBy(xpath="//label[@id='lblNameError_DocTab']")
										private static WebElement customizeMasterCreateTabDocumentTabMessage; 
									
									        @FindBy(xpath="//span[contains(text(),'Document Tab')]")
									        private static WebElement customizeMasterCreateDocumentTabNewlyCreate; 
										
											@FindBy(xpath="//div[7]/ul/li/a/span")
											private static WebElement customizeMasterCreateDocumentTabNewlyHeaderDetails; 	
														
											@FindBy(xpath="//div[@id='HeaderDetails_6']//div[@class='scrollable tbl-emptyfields-mastercust']")
											private static WebElement customizeMasterCreateDocumentTabNewlyBlankInHeaderDetails;
											
											@FindBy(xpath="//div[7]/ul/li[2]/a/span")
											private static WebElement customizeMasterCreateDocumentTabNewlyBodyDetails; 			
											
											@FindBy(xpath="//div[7]/div/div[2]/div/div/table/tbody/tr/td[4]")
											private static WebElement customizeMasterCreateDocumentTabFieldName; 
											
											@FindBy(xpath="//div[7]/div/div[2]/div/div/table/tbody/tr[2]/td[4]")
											private static WebElement customizeMasterCreateDocumentTabDocument; 
											
											@FindBy(xpath="//div[7]/div/div[2]/div/div/table/tbody/tr[3]/td[4]")
											private static WebElement customizeMasterCreateDocumentTabCreatedDate; 
											
											@FindBy(xpath="//div[7]/div/div[2]/div/div/table/tbody/tr[4]/td[4]")
											private static WebElement customizeMasterCreateDocumentTabLastModified; 
											
											@FindBy(xpath="//div[7]/div/div[2]/div/div/table/tbody/tr[5]/td[4]")
											private static WebElement customizeMasterCreateDocumentFileSize; 
											
							@FindBy(xpath="//*[@id='masterCustomizingTabList']/div[2]/div/ul/li[3]/a")
							private static WebElement createTab_CreateTab;  

								@FindBy(xpath="//div[@id='MCustomize_CreateDocTab_Modal']//h4[@class='modal-title'][contains(text(),'Tab Details')]")
								private static WebElement createTab_TabDetailsLabel;  
				                                                  
								@FindBy(xpath="//input[@id='txtNewTabCaption']")
								private static WebElement createTab_TabCaptionTxt;  
				                                                   
								@FindBy(xpath="//input[@id='txtNewTabName']")
								private static WebElement createTab_TabNameTxt;  
								
								@FindBy(xpath="//input[@id='bIsHiddenTab']")
								private static WebElement createTab_PopHiddenChkbox;  
								
								@FindBy(xpath="//*[@id='MCustomize_CreateTab_Modal']/div/div/div[3]/button[1]")
								private static WebElement createTab_PopOkBtn;  
								
								@FindBy(xpath="//*[@id='MCustomize_CreateTab_Modal']/div/div/div[3]/button[2]")
								private static WebElement createTab_PopCancelBtn; 

								@FindBy(xpath="//label[@id='lblNameError_NewTab']")
								private static WebElement customizeMasterCreateTabCreateTabMessage;  
								
								
	                       //Newly Created Create Tab  

								@FindBy(xpath="//*[@id='masterFields_list']/li[5]/span")
								private static WebElement customizeMasterCreateCreateTabNewlyCreateTabCaption; 	
								
								              
								@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/ul/li[1]")
								private static WebElement customizeMasterCreateCreateTabHeaderDetails; 	
								
								@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div/div[1]/div/div")
								private static WebElement customizeMasterCreateCreateTabBlankHeaderDetails; 	
								
								@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/ul/li[2]/a/span")
								private static WebElement customizeMasterCreateCreateTabBodyDetails; 	
								
								@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div/div[2]/div/div")
								private static WebElement customizeMasterCreateCreateTabBlankBodyDetails; 
								
								@FindBy(xpath="//*[@id='all_TabsField']/div[6]/div[1]/div[2]")
								private static WebElement customizeMasterCreateCreateTabNewlyCreateTabSaveButton; 	
								
								@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
								private static WebElement customizeMasterCreateCreateTabAddButton; 	
								
								@FindBy(xpath="//*[@id='all_TabsField']/div[6]/div[4]/div[2]")
								private static WebElement customizeMasterCreateCreateTabPreviewButton; 	
								
								@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
								private static WebElement customizeMasterCreateCreateTabCloseButton; 	

					@FindBy(xpath="//button[@id='btnDeleteTab_MCust']")
					private static WebElement tabs_DeleteBtn; 
			
			@FindBy(xpath="//label[@id='lblNameError_TreeTab']")
			private static WebElement customizeMasterCreateTabsMessage; 		
			
			@FindBy(xpath="//label[@id='lblMasterNameError_TreeTab']")
			private static WebElement customizeMasterCreateTabsMasterNameMessage; 	
		
			@FindBy(xpath="//span[contains(text(),'Tree Tab')]")
			private static WebElement customizeMasterCreateTreeTabNewlyCreate; 	
			
			@FindBy(xpath="//input[@id='txtEditTabCaption']")
			private static WebElement customizeMasterCreateTreeTabNewlyCreateTabCaption; 	
			
			@FindBy(xpath="//div[@id='MCustomize_EditTab_Modal']//label[@class='col-sm-12 col-xs-12 col-md-5 col-lg-5 form-control-static Flabel'][contains(text(),'Hidden')]")
			private static WebElement customizeMasterCreateTreeTabNewlyCreateHidden; 	
			
			@FindBy(xpath="//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
			private static WebElement customizeMasterCreateTreeTabNewlyCreateOkButton; 	
			
			@FindBy(xpath="//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Cancel')]")
			private static WebElement customizeMasterCreateTreeTabNewlyCreateCancelButton; 	
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[1]/a[1]/span[1]")
			private static WebElement customizeMasterCreateTreeTabNewlyHeaderDetails; 	
			
			//               
			@FindBy(xpath="//div[@id='HeaderDetails_4']//div[@class='scrollable tbl-emptyfields-mastercust']")
			private static WebElement customizeMasterCreateTreeTabNewlyBlankInHeaderDetails; 	
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[2]/a[1]/span[1]")
			private static WebElement customizeMasterCreateTreeTabNewlyBodyDetails; 	
			
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
			private static WebElement customizeMasterCreateTreeTabNewlyFieldInBodyDetails; 	
			
			@FindBy(xpath="//span[contains(text(),'Tree Tab Delete')]")
			private static WebElement  CustomizeCreateTreeTab;
			
			@FindBy(xpath="//span[contains(text(),'Tab Delete')]")
			private static WebElement  CustomizeCreateTab;
			
			@FindBy(xpath="//*[@id='lblWarnMessage_TabModal']")
			private static WebElement  CustomizeDeleteTabMessage;

			@FindBy(xpath="//div[@id='MCustomize_DeleteTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Yes')]")
			private static WebElement  CustomizeDeleteTabMessageYesBtn;

			@FindBy(xpath="//div[@id='MCustomize_DeleteTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'No')]")
			private static WebElement  CustomizeDeleteTabMessageNoBtn;
			
			
			    //Master Customization Extra Fields Creation On Click Add button

			     @FindBy(xpath="//input[@id='ExtraField_FieldCaption']")
			     private static WebElement extraFields_FieldDetailsTab;   
			     
			     @FindBy(xpath="//span[contains(text(),'Field Details')]")
			     private static WebElement extraFields_ClickOnFieldDetailsTab; 

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
				     
				     @FindBy(xpath="//*[@id='ExtraField_RegularExpression']")
				     private static WebElement extraFields_FieldDetailsRegularExpressionText;  
				     
				     @FindBy(xpath=" //*[@id='btnLoad_RExp']")
				     private static WebElement extraFields_RegularExperssionLoadExpansionBtn;
			
				     
			     @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
				 private static WebElement extraFields_PropertiesTab;		     
							     
					@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
					private static WebElement extraFields_PropertiesTabPartOfDeliveryAddressChekbox;
					
					@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
					private static WebElement extraFields_PropertiesPartOfBillingAddressChekbox;
					
					@FindBy(xpath="//input[@id='FieldsDetails_IsMandatory']")
					private static WebElement extraFields_PropertiesMandatoryChekbox;
					
					@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
					private static WebElement extraFields_PropertiesAllowAsParameterChekbox;
					
					@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
					private static WebElement extraFields_PropertiesHiddenChekbox;
					
					@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
					private static WebElement extraFields_PropertiesHiddenInGroupChekbox;
					
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

				@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
				private static WebElement  extraFields_FormattingTab;
			        
			        @FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
					private static WebElement extraFields_FormattingColumnSpan ;
			        
			        @FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
					private static WebElement extraFields_FormattingRowSpan ;
			        
			        @FindBy(xpath="//*[@id='CharacterCasing']")
					private static WebElement extraFields_FormattingCharacterCasingDropdown ;
			        
			        @FindBy(xpath="//*[@id='TextAlign']")
					private static WebElement extraFields_FormattingTextAlignDropdown ;
			        
			        @FindBy(xpath="//*[@id='FieldsDetails_Font']")
					private static WebElement extraFields_FormattingFieldsDetailsFont ;
			        
			        @FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
			        private static WebElement extraFields_FormattingBackColor ;
			        
			        @FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
					private static WebElement extraFields_FormattingFieldsDetailsFont_Btn ;
				       
				        //Elements are used for font edit option pop in field details and rules 
				        
				        @FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
						private static WebElement FontAreialDropdown ;
				        
				        @FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
						private static WebElement fontStyleDropdown ;
				        
				        @FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
						private static WebElement fontWeightDropdown ;

				        @FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
						private static WebElement fontSizeDropdown ;
				        
				        @FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
						private static WebElement foreColourDropdown ;
				        
				        @FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
						private static WebElement backColorDropdown ;
				        
				        @FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
						private static WebElement baselineChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
						private static WebElement overLineChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
						private static WebElement strikeThroughChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
						private static WebElement underlineChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
						private static WebElement enableFontChekbox ;
				        
				        @FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
						private static WebElement frontPriveiw ;
				        
				        @FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
						private static WebElement frontSaveBtn ;
				        
				        @FindBy(xpath="//*[@id='myFontControl_IF_Close']")
						private static WebElement frontCloseBtn ;		        
					   
				 @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
				 private static WebElement extraFields_RulesTab ;
						                   
				    @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
					private static WebElement extraFields_RulesSaveBtn ;
			                  
			        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
					private static WebElement extraFields_RulesNewBtn ;
			        
			        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
					private static WebElement extraFields_RulesDeleteBtn ;
			        
			        @FindBy(xpath="//div[@id='newRuleTab_div_FieldRules']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
					private static WebElement extraFields_RulesCloseBtn ;
			        
		            @FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
				    private static WebElement extraFields_RulesClickHereAddRuleButtonBtn ;
		        
			        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
					private static WebElement extraFields_RuleNameDropdown ;
			        
			        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
					private static WebElement extraFields_RuleNameSetingBtn ;      
				       	        
		        @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a/span")
		        private static WebElement extraFields_ExternalModulesTab;			     
			         
			        @FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
			        private static WebElement extraFields_ExternalModulesOnEventDropdown;	

			        @FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
			        private static WebElement extraFields_ExternalModulesButtonCaption;

			        @FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
			        private static WebElement extraFields_ExternalModules_ModuleTypeBtn;

			        @FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
			        private static WebElement extraFields_ExternalModules_ModuleNameDropdown;

			        @FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
			        private static WebElement extraFields_ExternalModulesClassNameDropdown;

			        @FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
			        private static WebElement extraFields_ExternalModulesFuctionalNameDropdown;

			        @FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
			        private static WebElement extraFields_ExternalModulesAvabileInDropdown;        
			        
			        @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
				    private static WebElement extraFields_ExternalModulesForMatFieldDeatailsOkBtn ;
				        
				    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
				    private static WebElement extraFields_externalModulesForMatFieldDeatailsCanceBtn ;
					        
				 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")
				 private static WebElement extraFields_OkBtn;
				    
				 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]")
				 private static WebElement extraFields_CloseBtn;
				 
		 @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div/div[1]/div/div/table/tbody/tr/td[4]")
		 private static WebElement extraFields_CreatedByUserInHeaderDetailsTab;
				 
		 @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div/div[1]/div/div/table/tbody/tr/td[1]/i[1]")
		 private static WebElement extraFields_EditOptionInHeaderDetailsTab;
		 
		 @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div/div[1]/div/div/table/tbody/tr/td[1]/i[2]")
		 private static WebElement extraFields_DeleteOptionInHeaderDetailsTab;
		 
		 @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div/div[1]/div/div/table/tbody/tr[2]/td[1]/i[2]")
		 private static WebElement extraFields_SecondDeleteOptionInHeaderDetailsTab;
		 
		 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[2]/div[2]")
		 private static WebElement extraFields_MoveFieldOption;
		 
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
			private static WebElement extraFields_MoveFieldTabName;
			 
			@FindBy(xpath="//div[@id='tableType_div']//div[1]//label[1]")
			private static WebElement extraFields_MoveFieldHeader;
			 
			@FindBy(xpath="//div[@id='rdbBodyDiv_MoveField_Modal']//label[1]")
			private static WebElement extraFields_MoveFieldBody;
			 
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[3]/button[1]")
			private static WebElement extraFields_MoveFieldOkButton;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[3]/button[2]")
			private static WebElement extraFields_MoveFieldCancelButton;
			 
			 
		    //Settings Tab Move Field
			 
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/i[1]")
			private static WebElement extraFields_SettingsTab_MoveField;
		 
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
			private static WebElement extraFields_SettingsTab_First;
		 
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[2]")
			private static WebElement extraFields_SettingsTab_FirstDelete;
		 
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/i[2]")
			private static WebElement extraFields_SettingsTab_MoveFieldOptsDelete;
	  	 
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")
			private static WebElement extraFields_SettingsTab_DeleteMessage;
	  	 
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[3]/button[2]")
			private static WebElement extraFields_SettingsTab_DeleteMessageNoOption;
	  	
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[3]/button[1]")
			private static WebElement extraFields_SettingsTab_DeleteMessageYesOption;
	 
	  	    @FindBy(xpath="//a[@class='icon-font7 theme_color-inverse']")
		    private static WebElement extraFields_GeneralTab;
	  	 
	  	    @FindBy(xpath="//a[contains(text(),'Settings')]")
			private static WebElement extraFields_SettingsTab;
	  	
	  	    @FindBy(xpath="//a[contains(text(),'Details')]")
			private static WebElement extraFields_DetailsTab;
	  	
	  	    @FindBy(xpath="//a[contains(text(),'Print Layout')]")
			private static WebElement extraFields_PrintLayout;
	  	
	  	    @FindBy(xpath="//li[5]/div/div/a")
			private static WebElement extraFields_TreeTabUpdate;
	  	
	  	    @FindBy(xpath="//a[@class='icon-font7 theme_color'][contains(text(),'Document Tab')]")
		    private static WebElement extraFields_DocumentTab;
	  	  
	  	    @FindBy(xpath="//a[@class='icon-font7 theme_color'][contains(text(),'Create Tab')]")
		 	private static WebElement extraFields_CreateTab;
	  	
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[4]/div[2]")
			private static WebElement extraFields_PreviewTab;
	  	
	     	@FindBy(xpath="//input[@id='sFileName1']")
			private static WebElement extraFields_PreviewTab_DocumentTab_FileName;
	  	
	  	    @FindBy(xpath="//input[@id='biDocument1']")
			private static WebElement extraFields_PreviewTab_DocumentTab_Document;
	  	
	     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[1]")
			private static WebElement extraFields_PreviewTab_DocumentTab_UploadDocument;
	  	
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[2]")
			private static WebElement extraFields_PreviewTab_DocumentTab_SaveDocument;
	  	
	     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[3]")
			private static WebElement extraFields_PreviewTab_DocumentTab_DeleteDocument;
	  	
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
			private static WebElement extraFields_PreviewTab_DocumentTab_CreateDate;
	  	
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/input[1]")
			private static WebElement extraFields_PreviewTab_DocumentTab_FileSize;
	  	
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
			private static WebElement extraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate;
	  	
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/ul[1]/li[2]/button[2]/i[1]")
			private static WebElement extraFields_PreviewTab_SaveBtn;
	  	
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/ul[1]/li[2]/button[5]")
			private static WebElement extraFields_PreviewTab_CloseBtn;
	  	
	  	    @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td[8]/div[1]/label/input")
			private static WebElement selectVendorB;
	  	
	  	    @FindBy(xpath="//input[@id='iPDCDiscountedAC']")
			private static WebElement pdcDicountAccount;
	 	
	  	    @FindBy(xpath="//input[@id='uploadBtnbiDocument1']")
			private static WebElement addGroupDocumentTab_UploadDocument;
	  	
	  	    @FindBy(xpath="//tr[1]//td[5]//div[1]//div[1]//div[2]")
			private static WebElement addGroupDocumentTab_SaveDocument;
	  	
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[3]/i[1]")
			private static WebElement addGroupDocumentTab_DeleteDocument;
	  	 	
	  	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
			private static WebElement addGroupCreateCreateTab_ExtraFieldUpdate;
	  	
			@FindBy(xpath="//td[contains(@class,'tdName padding0')][contains(text(),'Vendor Group')]")
			public static WebElement accountGroupCreation;
					               
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
			private static WebElement accSelect;
	  	
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
			public static WebElement accSelectBySingleClick;
		
			@FindBy(xpath="//span[contains(text(),'Vendor Group')]")
			public static WebElement clickOnAccountGroupToDisplayTitle;
					
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[4]/span[1]")
			public static WebElement clickOnAccountGroup;		
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
			public static WebElement getCpationOfGroup;
				
			@FindBy(xpath="//label[@class='msgInfo']")
			public static WebElement clickOnEmptyGroup;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/ul[6]/li[1]/ul[3]/li[1]/ul[1]/li[1]/a[2]")
			public static WebElement selectVendorGroupCheckbox;
			
			@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[8]/div[1]/label/input")
			public static WebElement selectVendorGroup;
				
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[9]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]")
			public static WebElement getMsgOnDelete;
			
			@FindBy(xpath="//button[@id='btnOkForDelete']")
			public static WebElement clickOnOkInDelete;
			
			@FindBy(xpath="//button[@id='btnCancelForDelete']")
			public static WebElement clickOnCancelInDelete;
			
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[4]/span[1]")
			public static WebElement clickOnVendorGroup;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
			public static WebElement getVendorGroupName;
			
			@FindBy(xpath="//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']//i[@class='icon-font6 icon-close']")
			public static WebElement closeAccountCreationScreen;
		
			@FindBy(xpath="//input[@id='chkRetainSelection']")
			public static WebElement accountMasterRetain;
			
			@FindBy(xpath="//input[@id='liSelectAllMasters']")
			public static WebElement accountMasterSelect;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
			public static WebElement accountFirstCheckBox;
			                
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/label[1]/input[1]")
			public static WebElement accountSecondCheckBox;
			
			@FindBy(xpath="//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']")
			public static WebElement closeAccMasterCreationScreen;
			
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/button[5]/i[1]")
			public static WebElement closeMaster;
			
			
			//Dash board Page
			
			@FindBy(xpath="//*[@id='Select_dash']")
			private static WebElement selectDashboard ;
				
			@FindBy(xpath="//*[@id='Dashboard_AddDash']")
		    private static WebElement newAddDashBoard;
			 
		    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
	        private static WebElement dashboardCustomizationSettings;
		
			
		   
		    //Properties Page
		   
		    @FindBy(xpath="//span[contains(text(),'Account Properties')]")
		    public static WebElement accountPropertiesLabel;
		     
			@FindBy(xpath="//input[@id='rbnNormal']")
			public static WebElement normalRadioBtn;

			@FindBy(xpath="//input[@id='rbnDisplayDebitCreditTotalForEachAccountUnderGroup']")
			private static WebElement  displayDebitCreditTotalForEachAccountUnderGroup;
			
			@FindBy(xpath="//input[@id='rbnClubTranOfAllAcctsUnderGrpWhenDispInLedger']")
			private static WebElement  ClubTheTransactionsofAllTheAccountsUnderGroup;
								
			@FindBy(xpath="//input[@id='rbnShowSummaryOfAccount']")
			private static WebElement showSummaryOfTheAccountRadioBtn ;	
			
			@FindBy(xpath="//input[@id='chkSuspendCreditLimit']")
			private static WebElement suspendCreditLimitChkbox ;
									
			@FindBy(xpath="//input[@id='rbnDisplayDebitCreditTotalForEachMonth']")
			private static WebElement  displayDebitCreditTotalForEachMonthRadioBtn;
								
			@FindBy(xpath="//input[@id='rbnrbnDisplayDebitCreditTotalForEachDay']")
			private static WebElement  displayDebitCreditTotalForEachDayRadioBtn;
			
			@FindBy(xpath="//input[@id='rbnNone']")
			public static WebElement  noneRadioBtn;
			
			@FindBy(xpath="//input[@id='rbnConsolidateWhenBothAccountsAreSame']")
			public static WebElement consolidateWhenBothAccountsAreSameRadioBtn ;
			
			@FindBy(xpath="//input[@id='rbnConsolidateAlways']")
			public static WebElement consolidateAlwaysRadioBtn ;
			
			@FindBy(xpath="//select[@id='ddlStatus']")
			public static WebElement  statusDropdown;
			
			@FindBy(xpath="//input[@id='chkDoNotRestrictSelectionEvenIfRightsNotAllotted']")
			public static WebElement  doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox;
			
			@FindBy(xpath="//input[@id='chkAllowOtherCompaniesToViewRecords']")
			public static WebElement allowOtherCompaniesToViewRecordsCheckbox;
			
			@FindBy(xpath="//input[@id='chkGenerateLedgerByCurrency']")
			public static WebElement generateLedgerByCurrencyCheckbox;
			
			@FindBy(xpath="//input[@id='chkSendSmsEmailWhereverAcDebitedCredited']")
			public static WebElement sendSmsEmailWhereverAcDebitedCreditedCheckbox;
			
			@FindBy(xpath="//span[@id='btnPropOk']")
			public static WebElement properties_okBtn;
			
			@FindBy(xpath="//*[@id='divMasterProperty']/ul/li/span[2]")
			public static WebElement  properties_cancelBtn;
		     
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[5]/span[1]")
			public static WebElement  customizeTabWithTreeTabUpdate;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[6]/span[1]")
			public static WebElement  customizeTabWithDocumentTab;
			
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[7]/span[1]")
			public static WebElement  customizeTabWithCreateTreeTab;
			
		    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
			private static WebElement noIn;
		    
		    
			
			
			
			@FindBy (xpath="//*[@id='1107']/span")
			private static WebElement warehouse;
				    
			@FindBy(xpath="//*[@id='dashName']")
			private static WebElement dashboard;
			
			
			@FindBy(xpath="//div[@id='chartdiv0']")
			public static WebElement dashboardGraph;
						
			@FindBy(xpath="//span[@id='btnPropOk']")
			public static WebElement dashboardLedger;
			
			@FindBy(xpath="//span[@id='btnPropOk']")
			public static WebElement dashboardInfoPanel;

			
			
			//Logout and Login Screen

			@FindBy(id="txtPassword")
			private static WebElement password;

			@FindBy(id="btnSignin")
			private static WebElement signIn;

		    @FindBy(id="ddlCompany")
		    private static WebElement companyDropDownList;


		    @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
	        private static WebElement logoutOption;


		
		//User Name Display
	    @FindBy(xpath="//span[@class='hidden-xs']")
		private static WebElement userNameDisplay;

	    
	   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
		private static WebElement userNameDisplay;*/
				
		
		@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
		private static WebElement companyName;

		@FindBy(xpath="//*[@id='companyLogo']")
		private static WebElement companyLogo;
		
		//Dash board Page
		@FindBy(xpath="//*[@id='dashName']")
	    private static WebElement labelDashboard ;
		
		
		
		
		
		private static String xlfile;
		private static String resPass="Pass";
		private static String resFail="Fail";
		private static ExcelReader excelReader;
		
		private static String xlSheetName = "SmokeVouchers";
		
		private static boolean Status;
		
	 public boolean checkSignToCheckAccountsMasterCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		   
		try
		{  
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	    	 
			LoginPage lp                          = new LoginPage(getDriver());
	      
	        String unamelt                        = excelReader.getCellData(xlSheetName, 7, 6);
	        String pawslt                         = excelReader.getCellData(xlSheetName, 8, 6);
			
			LoginPage.enterUserName(unamelt);
			LoginPage.enterPassword(pawslt);
			
			LoginPage.clickOnSignInBtn();
				
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			
			boolean actHomeMenuIsDisplay           = homeMenu.isDisplayed();
			boolean actFinancialMenuIsDisplay      = financialMenu.isDisplayed();
			boolean actInventoryMenuIsDisplay      = inventoryMenu.isDisplayed();
			boolean actFixedAssetsMenuIsDisplay    = fixedAssetsMenu.isDisplayed();
			boolean actProductionMenuIsDisplay     = productionMenu.isDisplayed();
			boolean actPointOfSaleMenuIsDisplay    = pointOfSaleMenu.isDisplayed();
			boolean actQualityControlMenuIsDisplay = qualityControlMenu.isDisplayed();
			boolean actSettingsMenuIsDisplay       = SettingsMenu.isDisplayed();
			
			boolean expHomeMenuIsDisplay           = true;
			boolean expFinancialMenuIsDisplay      = true;
			boolean expInventoryMenuIsDisplay      = true;
			boolean expFixedAssetsMenuIsDisplay    = true;
			boolean expProductionMenuIsDisplay     = true;
			boolean expPointOfSaleMenuIsDisplay    = true;
			boolean expQualityControlMenuIsDisplay = true;
			boolean expSettingsMenuIsDisplay       = true;
			
			System.out.println("Home Menu Display Value Actual            : " + actHomeMenuIsDisplay +           " Value Expected : " + expHomeMenuIsDisplay);
			System.out.println("Financial Menu Display Value Actual       : " + actFinancialMenuIsDisplay +      " Value Expected : " + expFinancialMenuIsDisplay);
			System.out.println("Inventory Menu Display Value Actual       : " + actInventoryMenuIsDisplay +      " Value Expected : " + expInventoryMenuIsDisplay);
			System.out.println("Fixed Assets Menu Display Value Actual    : " + actFixedAssetsMenuIsDisplay +    " Value Expected : " + expFixedAssetsMenuIsDisplay);
			System.out.println("Production Menu Display Value Actual      : " + actProductionMenuIsDisplay +     " Value Expected : " + expProductionMenuIsDisplay);
			System.out.println("Point Of Sale Menu Display Value Actual   : " + actPointOfSaleMenuIsDisplay +    " Value Expected : " + expPointOfSaleMenuIsDisplay);
			System.out.println("Quality Control Menu Display Value Actual : " + actQualityControlMenuIsDisplay + " Value Expected : " + expQualityControlMenuIsDisplay);
			System.out.println("Settings Menu Display Value Actual        : " + actSettingsMenuIsDisplay +       " Value Expected : " + expSettingsMenuIsDisplay);
		
			boolean actMethod = actHomeMenuIsDisplay==actHomeMenuIsDisplay && actFinancialMenuIsDisplay==actFinancialMenuIsDisplay
					&& actInventoryMenuIsDisplay==actInventoryMenuIsDisplay && actFixedAssetsMenuIsDisplay==actFixedAssetsMenuIsDisplay
					&& actProductionMenuIsDisplay==actProductionMenuIsDisplay && actPointOfSaleMenuIsDisplay==actPointOfSaleMenuIsDisplay
					&& actQualityControlMenuIsDisplay==actQualityControlMenuIsDisplay && actSettingsMenuIsDisplay==actSettingsMenuIsDisplay;

			String actDisplayingResult =Boolean.toString(actMethod);
			String elementsIsDisplay = actDisplayingResult.toUpperCase();
			excelReader.setCellData(xlfile, xlSheetName, 7, 8, elementsIsDisplay);
			
			int actCount					         = menusList.size();
			ArrayList<String> actMenusArray          = new ArrayList<String>();
			
			for (int i = 0; i < actCount; i++) 
			{
				String data                          = menusList.get(i).getText();
				actMenusArray.add(data);
			}

			String actMenus 					     = actMenusArray.toString();
			String expMenus					         = excelReader.getCellData(xlSheetName, 8, 7);
			
			System.out.println("Menu Names Text Display Value Actual             : " + actMenus);
			System.out.println("Menus Names Text Display Value Expected          : " + expMenus);
			excelReader.setCellData(xlfile, xlSheetName, 8, 8, actMenus);
				
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			String actUserInfo                      = userNameDisplay.getText();
			String expUserInfo                      = excelReader.getCellData(xlSheetName, 9, 7);	
			excelReader.setCellData(xlfile, xlSheetName, 9, 8, actUserInfo);
			
			System.out.println("User Name Display Value Actual                   : " + actUserInfo +             " Value Expected : " + expUserInfo);
			
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
			companyLogo.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
			String actGetLoginCompanyNameInformation = companyName.getText();
			String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 19);
			String expGetLoginCompanyName            = excelReader.getCellData(xlSheetName, 10, 7);
			excelReader.setCellData(xlfile, xlSheetName, 10, 8, actGetLoginCompanyName);
			companyLogo.click();
			
			System.out.println("Company Name Display Value Actual                : " + actGetLoginCompanyName +  " Value Expected : " + expGetLoginCompanyName);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
			String actDashboardLabel                = labelDashboard.getText();
			String expDashboardLabel                = excelReader.getCellData(xlSheetName, 11, 7);	
			
			System.out.println("Dashboard Label Value Actual                     : " + actDashboardLabel +      " Value Expected : " + expDashboardLabel);
			
			excelReader.setCellData(xlfile, xlSheetName, 11, 8, actDashboardLabel);
			
			if (actUserInfo.equalsIgnoreCase(expUserInfo) && actGetLoginCompanyName.equalsIgnoreCase(expGetLoginCompanyName)
					&& actDashboardLabel.equalsIgnoreCase(expDashboardLabel)
					
					&& actDisplayingResult.equalsIgnoreCase("true")
					&& actMenus.equalsIgnoreCase(expMenus)) 
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
	
    //Masters Menu	
	@FindBy (xpath="//*[@id='1000']/span")
    public static WebElement mastersMenu;
	
    //Accounts 
	@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
	public static WebElement accounts;
 
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
	
	
	
	
	//Checking Menus Till Customization Mater
	public boolean checkClickOnHomeMenuToDisplaySubMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	   {
	     excelReader = new ExcelReader(POJOUtility.getExcelPath());
	     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	     
	     System.out.println("*****************   checkClickOnHomeMenuToDisplaySubMenu Method Executes.............    *************************");
	   
	     try
	     {
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	    	homeMenu.click();
			
			int actMenusCount					    = homeMenuList.size();
			 
			ArrayList<String> actMenusArray=new ArrayList<String>();
			 
			for (int i = 0; i < actMenusCount; i++) 
			{
				String data = homeMenuList.get(i).getText();
				actMenusArray.add(data);
			}	
					
			String actMenus 	=actMenusArray.toString();
			String expMenus		= "[Company, Security, Masters, Data Management, Utilities]";
			
			//excelReader.setCellData(xlfile, xlSheetName, 13, 8, actMenus);
			
			System.out.println("Home Menu Display Value Actual      : " + actMenus);
			System.out.println("Home Menu Display Value Expected   : " + expMenus);
			
			if(actMenus.equalsIgnoreCase(expMenus)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 12, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 12, 9, resFail);
				return false;
			}
	     }
	     catch (Exception e) 
	     {
	         excelReader.setExceptionInExcel(xlfile, xlSheetName, 12, 10, e.getMessage());
	         System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	         return false;
	     }
	   }
	   
	   
	   public boolean checkClickOnMastersMenuToDisplaySubMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	   {
	     excelReader = new ExcelReader(POJOUtility.getExcelPath());
	     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	   
	     System.out.println("******************** checkClickOnMastersMenuToDisplaySubMenu Method Executes.............   *****************************");
	  
	     try
	     {
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu)); 
	    	mastersMenu.click();
			
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouse));
			
			int actMenusCount	= mastersMenuList.size();
			 
			ArrayList<String> actMenusArray=new ArrayList<String>();
			 
			for (int i = 0; i < actMenusCount; i++) 
			{
				String data = mastersMenuList.get(i).getText();
				actMenusArray.add(data);
			}	
					
			String actMenus =actMenusArray.toString();
			String expMenus = "[Account, Currency, Item, Schemes, MRP, QC, Maintainance, Point of Sale, Payroll, Department, Warehouse, Cost Center, Location, Region, Country, State, City, Bins, Insurance, Fixed Assets, Tax Code]";
			
			//excelReader.setCellData(xlfile, xlSheetName, 15, 8, actMenus);
			
			System.out.println("Master Menu Display Value Actual    : " + actMenus);
			System.out.println("Master Menu  Display Value Expected : " + expMenus);
			
			if(actMenus.equalsIgnoreCase(expMenus)) 
			{ 
				excelReader.setCellData(xlfile, xlSheetName, 14, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 14, 9, resFail);
				return false;
			}
	     }
	     catch (Exception e) 
	     {
	         excelReader.setExceptionInExcel(xlfile, xlSheetName, 14, 10, e.getMessage());
	         System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	         return false;
	     }  
	   }
	  
	 
	   // This CheckValidationMessageIsEmpty Method Used in Page Class But Not To Call in Test Class
	   
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
	   
		   
		   
	   @FindBy(xpath = "//span[@id='spnHeaderText']")
	   public static WebElement accountsTitle;
	   
	   public boolean checkClickOnAccountsFromMastersSubMeu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		   excelReader = new ExcelReader(POJOUtility.getExcelPath());
		   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		   System.out.println("********************* checkAccountsMastersPageOnClickOnAccountsMenuFromMastersMenu Method Executes.............   *****************************");
		
		   try
		   {
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
			   accounts.click();
			
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));
					
			   //boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			   //boolean expSummaryErrorMessage  = true;
			   String actAccountsTitle         = accountsTitle.getText();
			   String expAccountsTitle         = "Account";
			   
			   excelReader.setCellData(xlfile, xlSheetName, 17, 8, actAccountsTitle);
					
			   //System.out.println("Opening Accounts Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
			   System.out.println("Accounts Masters Title Display Value Actual        : " + actAccountsTitle       + " Value Expected : " + expAccountsTitle);
			   
			   if (actAccountsTitle.equalsIgnoreCase(expAccountsTitle) /*&& actSummaryErrorMessage==expSummaryErrorMessage*/) 
			   {
				   excelReader.setCellData(xlfile, xlSheetName, 16, 9, resPass);
				   return true;
			   } 
			   else 
			   {
				   excelReader.setCellData(xlfile, xlSheetName, 16, 9, resFail);
				   return false;
			   }
		   }
		   catch (Exception e) 
		   {
			   excelReader.setExceptionInExcel(xlfile, xlSheetName, 16, 10, e.getMessage());
			   System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			   return false;
		   } 
	   }
		 

	   @FindBy(xpath = "//i[@class='icon-font6 icon-new']")
	   public static WebElement masterNewBtn;
	
	   
	   public static boolean checkMainOptionsAvailabilityInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		   excelReader=new ExcelReader(POJOUtility.getExcelPath());
		   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				 
		   System.out.println("************ checkMainOptionsAvailabilityInAccountMastersPageOnClickOnAccountsFromMastersMenu Method Executes............ **********************");
		
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
			   String expMenus = "[Delete, , New, Close, Edit, Properties, Add Group, Clone]";
			   
			   //excelReader.setCellData(xlfile, xlSheetName, 19, 8, actMenus);
		
			   System.out.println("Account Ribbon Control Display Value Actual    : " + actMenus);
			   System.out.println("Account Ribbon Control  Display Value Expected : " + expMenus);
			   
			   if (actMenus.equalsIgnoreCase(expMenus))
			   {
				   excelReader.setCellData(xlfile, xlSheetName, 18, 9, resPass);
				   return true;
			   } 
			   else 
			   {
				   excelReader.setCellData(xlfile, xlSheetName, 18, 9, resFail);
				   return false;
			   }
		   }
		   catch (Exception e) 
		   {
			   excelReader.setExceptionInExcel(xlfile, xlSheetName, 18, 10, e.getMessage());
			   System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			   return false;
		   } 
	   }
		 
	   
	  @FindBy(xpath = "//i[@class='icon-font6 icon-group']")
	  public static WebElement masterGroupBtn;  
	  
	  public static boolean checkToolsOptionsAvailabilityInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("*********** checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInAccountMastersPage Method Executes............*******************");

		 try
		 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));
			masterRibbonToExpandOptions.click();

			//boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			//boolean expSummaryErrorMessage  = true;
			
	        //System.out.println("Click On Ribbon Expand Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));

			int ribbonControlExpandListCount =ribbonControlExpandList.size();
			
			System.err.println("ribbonControlExpandList : "+ribbonControlExpandListCount);
			
			ArrayList<String> actribbonControlExpandList=new ArrayList<String>();
			
			for(int i=0;i<ribbonControlExpandListCount;i++)
			{
				String data=ribbonControlExpandList.get(i).getText();
				actribbonControlExpandList.add(data);
			}
			
			String actToggleList =actribbonControlExpandList.toString();
			String expToggleList ="[Group, Delete All, Close Account, Open Close Account, Advance Master Import/Export, Auth Info, Move Up, Move Down, Sort, Mass Update, Export Format To XML, Customize Master, , , , , , , , , ]";
			
			//excelReader.setCellData(xlfile, xlSheetName, 21, 8, actToggleList);

			System.out.println("ToggleList Actual   : " + actToggleList);
			System.out.println("ToggleList Expected : " + expToggleList);
			
			if (actToggleList.equalsIgnoreCase(expToggleList))
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
		 catch (Exception e) 
		 {
	
			 excelReader.setExceptionInExcel(xlfile, xlSheetName, 20, 10, e.getMessage());
			 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			 return false;
		 } 	
	   }
	  
	  
	    @FindBy(xpath = "//i[@class='icon-font6 icon-transfer']")
	    public static WebElement masterTranferBtn;

	  
	  public static boolean checkOtherToolsOptionsAvailabilityInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("********* checkOtherToolsOptionsAvailabilityInAccountMastersPageOnClickRibbonControlNextButton Method Executes............  *******************");

		 try
		 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
			masterRibbonControlNextBtn.click();
			
			//boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			//boolean expSummaryErrorMessage  = true;
			
	        //System.out.println("Click On Ribbon Control Next Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
		
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTranferBtn));

			int ribbonControlExpandListCount =ribbonControlExpandList.size();
			
			System.err.println("ribbonControlExpandList : "+ribbonControlExpandListCount);
			
			ArrayList<String> actribbonControlExpandList=new ArrayList<String>();
			
			for(int i=0;i<ribbonControlExpandListCount;i++)
			{
				String data=ribbonControlExpandList.get(i).getText();
				System.err.println(data);
				actribbonControlExpandList.add(data);
			}
			
			String actOtherTools =actribbonControlExpandList.toString();
			String expOtherTools ="[, , , , , , , , , , Export Format To XML, Customize Master, Customize View, Customize Tree, Ledger, Delinquency Management, Department Appropriation, Budget, Back Track, Transfer, Print]";
			
			//excelReader.setCellData(xlfile, xlSheetName, 23, 8, actToggleList);

			System.out.println("Other Tools Actual   : " + actOtherTools);
			System.out.println("Other Tools Expected : " + expOtherTools);
			
			if (actOtherTools.equalsIgnoreCase(expOtherTools))
			{
				excelReader.setCellData(xlfile, xlSheetName, 22, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 22, 9, resFail);
				return false;
			}
		 }
		 catch (Exception e) 
		 {
			 excelReader.setExceptionInExcel(xlfile, xlSheetName, 22, 10, e.getMessage());
			 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			 return false;
		 } 
	   }
		

	
	
	
	
	
	
	
	
	
	public static boolean checkCustomizeMasterOptionInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	  try
	  {
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		 masterCustamizemasterBtn.click();
		 
	     
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minusBtn));
		 minusBtn.click();
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(plusBtn));
			 
		 boolean actMasterCustFidsTab = plusBtn.isDisplayed() && masterFieldsOption.isDisplayed() 
		                                    && accountMasterFieldsUniqueConstraintsOption.isDisplayed() && RulesOption.isDisplayed()
		                                    && rules_ExternalModules.isDisplayed() && itemInfoPanelCustomizationTab.isDisplayed() 
		                                    && accountReportsTab.isDisplayed();
		 
		 boolean expMasterCustFieldsTab = true;
		 
		 System.out.println("Account Master Customization Fields Value Actual                : " + actMasterCustFidsTab +  " Value Expected : " + expMasterCustFieldsTab);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(plusBtn));
		 plusBtn.click();
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingOption));
		 boolean actMasterCustHeaderFields=generalTab.isDisplayed() && settingOption.isDisplayed()&& accountMasterFieldDetailsOption.isDisplayed() && 
				 accountMasterFieldPrintLayoutOption.isDisplayed() /*&& accountMasterFieldVATSettingsOption.isDisplayed()*/;
		 
		 boolean expMasterCustHeaderFields=true;
		 
		 
		 System.out.println("Account Master Customization Header Fields Display Value Actual    : " + actMasterCustHeaderFields +  " Value Expected : " + expMasterCustHeaderFields);
		 	 
		 boolean actMasterCustTabOptions=generalMainTab.isDisplayed() && generalHeaderDetailsTab.isDisplayed() 
		                                    && accountSaveBtn.isDisplayed() && accountHeaderPreview.isDisplayed() && accountCloseBtn.isDisplayed();
		 
		 boolean expMasterCustTabOptions=true;
		 
		 System.out.println("Account Master Customization Tabs Display Value Actual    : " + actMasterCustTabOptions +  " Value Expected : " + expMasterCustTabOptions);
		 
		 
		 if(actMasterCustFidsTab==expMasterCustFieldsTab && actMasterCustHeaderFields==expMasterCustHeaderFields && actMasterCustTabOptions==expMasterCustTabOptions)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resFail);
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
	

	
	
	
	
	
	public static boolean checkGeneralTabOptionMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
     try
     {
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));
		 generalTab.click();
		 	 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTab));
		 generalMainTab.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountCustomizeName));
		 	 
		 boolean actGenTag =accountCustomizeName.isDisplayed() && accountCustomizeCode.isDisplayed() 
				           && accountCustomizeAccountType.isDisplayed() && accountCustomizeCreditLimit.isDisplayed() && accountCustomizeCreditDays.isDisplayed();
		 
		 boolean expGenTag=true;
		 
		 System.out.println("Account Master Customization Fields General Tab Value Actual    : " + actGenTag +  " Value Expected : " + expGenTag);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalHeaderDetailsTab));	 
		 generalHeaderDetailsTab.click();
				 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountCustomizeChequeDiscountLimit));
		 
		 boolean actGenHeaderTab =accountCustomizeChequeDiscountLimit.isDisplayed() && accountCustomizeRateOfInterest.isDisplayed() && 
		                           accountCustomizeBankAc.isDisplayed() && accountCustomizePDCDiscountedAccount.isDisplayed() &&
		                           accountHeaderMoveFiledBtn.isDisplayed() && accountHeaderPreview.isDisplayed() &&
		                           accountSaveBtn.isDisplayed() && accountAddBtn.isDisplayed() && accountCloseBtn.isDisplayed();
		 
		 boolean expGenHeaderTab=true;
		 
		 System.out.println("Account Master Customization Fields General Header Tab Value Actual    : " + actGenHeaderTab +  " Value Expected : " + expGenHeaderTab);			 
		 
		 if(actGenTag==expGenTag && actGenHeaderTab==expGenHeaderTab)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resFail);
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
 
	
	
	
	
	public static boolean checkSettingsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	  try
	  {
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingOption));
		 settingOption.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsHeaderDetailsTab));
		 
		 boolean actGeneralSetTab =settingsHeaderDetailsTab.isDisplayed() && settingsBodyDetailsTab.isDisplayed() && accountSettingsHeaderMoveFiledBtn.isDisplayed() 
									 && accountSettingsHeaderPreview.isDisplayed() && accountSettingsSaveBtn.isDisplayed() 
									 && accountSettingsAddBtn.isDisplayed() && accountSettingsCloseBtn.isDisplayed()
									 && accountSettingsHeaderEditFirstRowBtn.isDisplayed() && accountSettingsHeaderEditSecondRowBtn.isDisplayed() &&
				    				 accountSettingsHeaderEditThirdRowBtn.isDisplayed() && accountSettingsHeaderEditFourthRowBtn.isDisplayed() && 
				    				 accountSettingsHeaderEditFifthRowBtn.isDisplayed() && accountSettingsHeaderEditSixthRowBtn.isDisplayed() &&
				    				 accountSettingsHeaderEditSeventhRowBtn.isDisplayed() && accountSettingsHeaderEditEighthRowBtn.isDisplayed();
		 
		 boolean expGeneralSetTab=true;
		 
		 System.out.println("Account Master Customization Fields Setting Tab Value Actual    : " + actGeneralSetTab +  " Value Expected : " + expGeneralSetTab);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsBodyDetailsTab));
         settingsBodyDetailsTab.click();
         
        
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsBodyDetailsEmptyTab));
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsBodyDetailsEmptyTab));
         
         boolean actGenSetBody=settingsBodyDetailsEmptyTab.isDisplayed();
         
         boolean expGenSetBody=true;
         
         System.out.println("Account Master Customization Fields Setting Body Tab Value Actual    : " + actGenSetBody +  " Value Expected : " + expGenSetBody);
         
         if(actGeneralSetTab==expGeneralSetTab && actGenSetBody==expGenSetBody)
         { 
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resFail);
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
	
	
	
	
	
	
	
	public static boolean checkDetailsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	  try
	  {
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterFieldDetailsOption));
		 accountMasterFieldDetailsOption.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(detailsHeaderDetailsTab));
		 
		 boolean actGeneralSetTab =detailsHeaderDetailsTab.isDisplayed() && detailsBodyDetailsTab.isDisplayed() && detailsHeaderBankSaveBtn.isDisplayed() 
				 && detailsHeaderMoveFieldBtn.isDisplayed() && detailsHeaderAddBtn.isDisplayed() 
				 && detailsHeaderPreviewBtn.isDisplayed() && detailsHeaderCloseBtn.isDisplayed();
		 
		 boolean expGeneralSetTab=true;
		 
		 System.out.println("Account Master Customization Fields Details Tab Value Actual    : " + actGeneralSetTab +  " Value Expected : " + expGeneralSetTab);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(detailsBodyDetailsTab));
		 detailsBodyDetailsTab.click();
         
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(detailsBodyDetailsEmptyTab));
         
         boolean actGenSetBody=detailsBodyDetailsEmptyTab.isDisplayed();
         
         boolean expGenSetBody=true;
         
         System.out.println("Account Master Customization Fields Details Body Tab Value Actual    : " + actGenSetBody +  " Value Expected : " + expGenSetBody);
         
         if(actGeneralSetTab==expGeneralSetTab && actGenSetBody==expGenSetBody)
         { 
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resFail);
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
	
	
	public static boolean checkPrintLayoutTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	  try
	  {
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterFieldPrintLayoutOption));
		 accountMasterFieldPrintLayoutOption.click();
		 
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printlayoutHeaderDetailsTab));
		 
		 boolean actGeneralSetTab =printlayoutHeaderDetailsTab.isDisplayed() && printLayouBodyDetailsTab.isDisplayed()
				                  && printLayoutHeaderDetailsEmpty.isDisplayed();
		 
		 boolean expGeneralSetTab=true;
		 
		 System.out.println("Account Master Customization Fields Details Tab Value Actual    : " + actGeneralSetTab +  " Value Expected : " + expGeneralSetTab);
		 
		 
		 
		 
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printLayouBodyDetailsTab));
		 printLayouBodyDetailsTab.click();
		 
	
           
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printlayoutBodyVoucherType));
         
         boolean actGenSetBody=printlayoutBodyVoucherType.isDisplayed() && printlayoutBodyVoucherType.isDisplayed() &&
    			 printLayoutSaveBtn.isDisplayed() && printLayoutAddBtn.isDisplayed() &&
    			 printLayoutPreviewBtn.isDisplayed() && printLayoutCloseBtn.isDisplayed();
         
         boolean expGenSetBody=true;
         
         System.out.println("Account Master Customization Fields Details Body Tab Value Actual    : " + actGenSetBody +  " Value Expected : " + expGenSetBody);
         
         if(actGeneralSetTab==expGeneralSetTab && actGenSetBody==expGenSetBody)
         { 
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resFail);
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
	
	public static boolean checkVATSettingsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	  try
	  {
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterFieldVATSettingsOption));
		 accountMasterFieldVATSettingsOption.click();
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOfSupply));
		 
		 boolean actGeneralSetTab =placeOfSupply.isDisplayed() && grn.isDisplayed() && reverseOfChange.isDisplayed();
		 
		 boolean expGeneralSetTab=true;
		 
		 System.out.println("Account Master Customization Fields Details Tab Value Actual    : " + actGeneralSetTab +  " Value Expected : " + expGeneralSetTab);
				 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterFieldVATSettingsBody));
		 accountMasterFieldVATSettingsBody.click();
            
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterFieldVATSettingsBodyEmptyFields));
         
         boolean actGenSetBody=accountMasterFieldVATSettingsBodyEmptyFields.isDisplayed();
         
         boolean expGenSetBody=true;
         
         System.out.println("Account Master Customization Fields Details Body Tab Value Actual    : " + actGenSetBody +  " Value Expected : " + expGenSetBody);
         
         if(actGeneralSetTab==expGeneralSetTab && actGenSetBody==expGenSetBody)
         { 
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 280, 9, resFail);
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
	
	
	
	
	
	public static boolean checkUniqueContraintCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	 try
	 {
		 
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterFieldsUniqueConstraintsOption));
		  accountMasterFieldsUniqueConstraintsOption.click();
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UniqueConstraintsAddBtn));
          
          boolean actuc=UniqueConstraintsAddBtn.isDisplayed() && UniqueConstraintsDeleteBtn.isDisplayed() &&
 				 UniqueConstraintsCloseBtn.isDisplayed() && ConstraintNameTxt.isDisplayed() &&
 				 UniqueConstraints_TabsDropdown.isDisplayed() &&
 				 accountUniqueConstraints_Main_NameChekbox.isDisplayed() && accountUniqueConstraints_Main_CodeChekbox.isDisplayed() &&
 				 accountUniqueConstraints_Main_AccountTypeCheckbox.isDisplayed() && accountUniqueConstraints_Main_CreditLimitCheckBox.isDisplayed() &&
 				 accountUniqueConstraints_Main_CreditDays.isDisplayed() && UniqueConstraints_HeaderExpansionBtn.isDisplayed() &&
 				 UniqueConstraints_BodyExpansionBtn.isDisplayed();
          
          boolean expuc=true;
          
          System.out.println("Account Master Customization Unique Constraints Tab Value Actual    : " + actuc +  " Value Expected : " + expuc);
          
          getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UniqueConstraints_HeaderExpansionBtn));
 		  UniqueConstraints_HeaderExpansionBtn.click();

 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UniqueConstraints_Header_RateOfInterestChekbox));
 		 
 		 boolean actucoptions=UniqueConstraints_Header_ChequeDiscountLimitChekbox.isDisplayed() && UniqueConstraints_Header_RateOfInterestChekbox.isDisplayed() &&
 				 UniqueConstraintsCloseBtn.isDisplayed() && UniqueConstraints_Header_PDCDiscountedChekbox.isDisplayed();
 		  
 		  boolean expucoptions=true;
 		  
 		 System.out.println("Account Master Customization Unique Constraints Options Tab Value Actual    : " + actucoptions +  " Value Expected : " + expucoptions);
          
		  if(actuc==expuc && actucoptions==expucoptions)
		  {
			 excelReader.setCellData(xlfile, "Sheet1", 294, 9, resPass);
			 return true;
		  }
		  else
		  {
			 excelReader.setCellData(xlfile, "Sheet1", 294, 9, resFail);
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
	
	
	
	
	
	public static boolean checkRulesInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	   excelReader=new ExcelReader(POJOUtility.getExcelPath());
	   xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
	   try
	   {
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RulesOption)); 
		 RulesOption.click();

		 Thread.sleep(4000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRules_SaveBtn));
		 
		 
         boolean actRules = accountRules_SaveBtn.isDisplayed() && accountRules_NewBtn.isDisplayed()  &&
   			  accountRules_DeleteBtn.isDisplayed()   && accountRules_CloseBtn.isDisplayed()  &&
   			  Rules_RuleNameText.isDisplayed() && Rules_CreatingGroupChekbox.isSelected() &&
   			  Rules_NewRecordChekbox.isSelected() && Rules_EditChekbox.isSelected() &&
   			  Rules_LoadChekbox.isSelected() && Rules_BeforeSaveChekbox.isDisplayed() &&
   			  Rules_OnLeaveChekbox.isSelected() && Rules_BeforeDeleteChekbox.isDisplayed() &&
   			  Rules_OnEnterChekbox.isDisplayed();
         
         boolean expRules = true;
		 
         System.out.println("Account Master Customization Rules Options Tab Value Actual    : " + actRules +  " Value Expected : " + expRules);
                 
		 if(actRules==expRules)
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 296, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 296, 9, resFail);
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
	
	
	
	
	
	
	public static boolean checkExternalModulesInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	  try
	  {
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rules_ExternalModules)); 
		 rules_ExternalModules.click();
	 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rules_ExternalModulesOnEventDropdown));
	     
	     boolean actExternalModules =rules_ExternalModulesOnEventDropdown.isDisplayed() && rules_ExternalModulesButtonCaption.isDisplayed()  &&
				 rules_ExternalModules_ModuleTypeBtn.isDisplayed() && rules_ExternalModules_ModuleNameDropdown.isDisplayed() &&
				 rules_ExternalModulesClassNameDropdown.isDisplayed() && rules_ExternalModulesUpdateBtn.isDisplayed();
	     
	     boolean expExternalModules =true;
	     
	     System.out.println("Account Master Customization Rules Options Tab Value Actual    : " + actExternalModules +  " Value Expected : " + expExternalModules);
		 
		 if(actExternalModules==expExternalModules)
		 {
			 
			 excelReader.setCellData(xlfile, "Sheet1", 297, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 297, 9, resFail);
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
	
	
	
	
	
	
	
	
	public static boolean checkInfoPanelInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
		 try
		 {
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemInfoPanelCustomizationTab));
			 itemInfoPanelCustomizationTab.click(); 
			 	 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iteminfoPanelCust_AddBtn));
			 
			 boolean actInfopanel =iteminfoPanelCust_AddBtn.isDisplayed() && infoPanelCust_DeleteBtn.isDisplayed()  &&
					 infoPanelCust_CloseBtn.isDisplayed()  && infoPanelCustCreditHistory.isDisplayed()  &&
					 infoPanelCustAgeingAnalysis.isDisplayed() && infoPanelCustAgeingAnalysisBase.isDisplayed() &&
					 infoPanelCustAgeingAnalysisLocal.isDisplayed() && infoPanelAuthorization.isDisplayed();
			 
			 boolean expInfopanel =true;
			 
		     System.out.println("Account Master Customization Info Panel Options Tab Value Actual    : " + actInfopanel +  " Value Expected : " + expInfopanel);
			 
			 if(actInfopanel==expInfopanel)
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 298, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 298, 9, resFail);
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
	
	
	public static boolean checkReportsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
		 try
		 {
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountReportsTab));
			 accountReportsTab.click(); 
			 	 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reports_ComparativeAnalysisChkBox));
			 
			 boolean actReportsOption =accountReports_SaveBtn.isDisplayed() && accountReports_CloseBtn.isDisplayed() &&
					 reports_MasterInfoChkBox.isDisplayed() && reports_ABCAnalysisAmountChkBox.isDisplayed() &&
					 reports_BankBookChkBox.isDisplayed() && reports_BankreconciliationstatementChkBox.isDisplayed() &&
					 reports_CashBookChkBox.isDisplayed() && reports_ComparativeAnalysisChkBox.isDisplayed() && 
					 reports_CustomerAgeingDetailsAnalysisChkBox.isDisplayed() && reports_CustomerageingdetailbyduedateChkBox.isDisplayed() &&
					 reports_CustomerageingsummaryanalysisChkBox.isDisplayed() && reports_CustomerbillwisesummaryChkBox.isDisplayed() &&
					 reports_CustomerduedateanalysisChkBox.isDisplayed() && reports_CustomerlistingofoutstandingbillsChkBox.isDisplayed() &&
					 reports_CustomeroverdueanalysisChkBox.isDisplayed() && reports_CustomeroverduesummaryChkBox.isDisplayed() &&
					 reports_CustomerstatementsChkBox.isDisplayed() && reports_CustomersummaryageingbyduedateChkBox.isDisplayed() &&
					 reports_IncomeExpenseTrendChkBox.isDisplayed() && reports_InterestcalculationChkBox.isDisplayed() && 
					 reports_LedgerChkBox.isDisplayed() && reports_LedgerdetailChkBox.isDisplayed() &&
					 reports_MonthlySalesChkBox.isDisplayed() && reports_PeakandlowbalanceamountChkBox.isDisplayed() &&
					 reports_PettycashbookChkBox.isDisplayed() && reports_PurchaseregisterChkBox.isDisplayed() &&
					 reports_PurchasereturnregisterChkBox.isDisplayed() && reports_PurchasesgroupedbydepartmentChkBox.isDisplayed() &&
					 reports_PurchasesgroupedbyItemChkBox.isDisplayed() && reports_PurchasesgroupedbyvendorChkBox.isDisplayed() &&
					 reports_SalesdaybookChkBox.isDisplayed() && reports_SalesgroupedbycustomerChkBox.isDisplayed() &&
					 reports_salesgroupedbydepartmentrChkBox.isDisplayed() && reports_SalesgroupedbyItemChkBox.isDisplayed() &&
					 reports_SalesreturnregisterChkBox.isDisplayed() && reports_SchedulesChkBox.isDisplayed() &&
					 reports_SubledgerChkBox.isDisplayed() && reports_SummarysalesregisterChkBox.isDisplayed() &&
					 reports_TopCustomersChkBox.isDisplayed() && reports_TradingaccountrChkBox.isDisplayed() &&
					 reports_TransactionstypeanalysisChkBox.isDisplayed() && reports_VendorageingdetailanalysisChkBox.isDisplayed() &&
					 reports_VendorageingdetailbyduedateChkBox.isDisplayed() && reports_VendorageingsummaryanalysisChkBox.isDisplayed() &&
					 reports_VendorbillwisesummaryChkBox.isDisplayed() && reports_VendorduedateanalysisChkBox.isDisplayed() &&
					 reports_VendorlistingofoutstandingbillsChkBox.isDisplayed()  && reports_VendoroverdueanalysisChkBox.isDisplayed() &&
					 reports_VendoroverduesummaryChkBox.isDisplayed() && reports_VendorstatementsChkBox.isDisplayed() &&
					 reports_VendorsummaryageingbyduedateChkBox.isDisplayed();
			 
			 boolean expReportsOption =true;
			 
		     System.out.println("Account Master Customization Info Panel Options Tab Value Actual    : " + actReportsOption +  " Value Expected : " + expReportsOption);
			 
			 if(actReportsOption==expReportsOption)
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 298, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 298, 9, resFail);
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
	
	  public static boolean checkCreateTabAndDeleteOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	    try
	    {
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsOption));
	         masterFieldsOption.click();
	   		         
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));
	         
	         boolean actCreateTabs = createTab.isDisplayed() && tabs_DeleteBtn.isDisplayed();
	         boolean expCreateTabs = true;
	         	         
	         System.out.println("Account Master Customization Create and Delete Options Tab Value Actual    : " + actCreateTabs +  " Value Expected : " + expCreateTabs);
	         
	   		 if(actCreateTabs==expCreateTabs)
	   		 {	 
	   			 excelReader.setCellData(xlfile, "Sheet1", 301, 9, resPass);
	   			 return true;
	   		 }
	   		 else
	   		 {
	   			 excelReader.setCellData(xlfile, "Sheet1", 301, 9, resFail);
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
	    
	    
	    
	  public static boolean checkCreateTabsOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

   		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
   		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	   	 
   		 try
   		 {
   			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));
	         createTab.click();
	         
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabTreeTab));
	         
	         boolean actCreateTab =createTabTreeTab.isDisplayed() && createTab_DocumentTab.isDisplayed() && createTab_CreateTab.isDisplayed();
	         
	         boolean expCreateTab =true;
	         
	         System.out.println("Account Master Create Tab Options Tab Value Actual    : " + actCreateTab +  " Value Expected : " + expCreateTab);
	   		 
	   		 if(actCreateTab==expCreateTab)
	   		 {	 
	   			 excelReader.setCellData(xlfile, "Sheet1", 301, 9, resPass);
	   			 return true;
	   		 }
	   		 else
	   		 {
	   			 excelReader.setCellData(xlfile, "Sheet1", 301, 9, resFail);
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
	    
	  
	  
	  public static boolean checkCreateTreeTabsOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

   		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
   		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	   	 
   		 try
   		 {
   			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabTreeTab));
   			createTabTreeTab.click();
	         
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabTabNameTxt));
	         
	         boolean actCreateTreeTab =treeTabCaptionTxt.isDisplayed() && treeTabTabNameTxt.isDisplayed() && treeTabNewMastertxt.isDisplayed() && treeTabNewMasterdropdown.isDisplayed() &&
	    				treeTab_NewMasterSettingsBtn.isDisplayed() && treeTab_FieldCaptiontxt.isDisplayed() && treeTab_FieldNameTxt.isDisplayed() && 
	       				treeTab_HiddenChkBox.isDisplayed() && treeTab_OkBtn.isDisplayed() && treeTab_CancelBtn.isDisplayed();
	         
	         boolean expCreateTreeTab =true;
	         
	         System.out.println("Account Master Create Tree Tab Options Tab Value Actual    : " + actCreateTreeTab +  " Value Expected : " + expCreateTreeTab);
	   		 
	   		 if(actCreateTreeTab==expCreateTreeTab)
	   		 {	 
	   			 excelReader.setCellData(xlfile, "Sheet1", 301, 9, resPass);
	   			 return true;
	   		 }
	   		 else
	   		 {
	   			 excelReader.setCellData(xlfile, "Sheet1", 301, 9, resFail);
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
	  
	  
	  
	  @FindBy(xpath="//div[@id='idGlobalError']")
	  public static WebElement validationConfirmationMessage;
	  
	  @FindBy(xpath="//div[@id='idGlobalError']//td[3]")
	  public static WebElement closeValidationConfirmationMessage;


	  

	  @FindBy(xpath="//div[@class='theme_color font-6']")
	  public static WebElement validationUpdatingConfirmationMessage;


	  public static boolean checkOkCheckForCreateTreeTabWithInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 try
		 {
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabCaptionTxt));
			 treeTabCaptionTxt.click();
	   		 treeTabCaptionTxt.sendKeys("Tree Tab");
	   		 treeTabCaptionTxt.sendKeys(Keys.TAB);
	  		
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabTabNameTxt));
			 treeTabTabNameTxt.click();
			 treeTabTabNameTxt.sendKeys("Tree Tab");		 
	   	     treeTabTabNameTxt.sendKeys(Keys.TAB);
	   	     Thread.sleep(3000);
	   	     
	   	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabNewMastertxt));
	   	     treeTabNewMastertxt.click();
			 treeTabNewMastertxt.sendKeys("Account"); 	
			 Thread.sleep(2000);
		   	 getAction().moveToElement(treeTabNewMastertxt).sendKeys(Keys.TAB).perform();
		   	 		   	 
		   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_FieldCaptiontxt)); 
	   		 treeTab_FieldCaptiontxt.sendKeys("Tree Tab");	
	   		 treeTab_FieldCaptiontxt.sendKeys(Keys.TAB);	   		 
		   	 
	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_OkBtn));
	   		 treeTab_OkBtn.click();		 
	   		 
	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	   
	   		 String actGetSaveMsg = validationConfirmationMessage.getText();
	   		 String expGetSaveMsg = "Tab Added Successfully";
	   		
	   		 System.out.println("Account Master Create Tree Tab Save Msg Value Actual    : " + actGetSaveMsg +  " Value Expected : " + expGetSaveMsg);
	   		 
	   		 
	   		 boolean actCreateTreeTabDisplay =customizeMasterCreateTreeTabNewlyCreate.isDisplayed();
	   		 boolean expCreateTreeTabDisplay =true;
	   	 
	   		 System.out.println("Account Master Create Tree Tab Options Tab Value Actual    : " + actCreateTreeTabDisplay +  " Value Expected : " + expCreateTreeTabDisplay);
	   		 
	   		 if(actGetSaveMsg.equalsIgnoreCase(expGetSaveMsg) && actCreateTreeTabDisplay==expCreateTreeTabDisplay)
	   		 {
	   			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
	   			 closeValidationConfirmationMessage.click();
	   			 excelReader.setCellData(xlfile, "Sheet1", 307, 9, resPass);
	   			 return true;
	   		 }
	   		 else
	   		 {
	   			 closeValidationConfirmationMessage.click();
	   			 excelReader.setCellData(xlfile, "Sheet1", 307, 9, resFail);
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

	  
	  
	  
	  
	  
	  
	  public static boolean checkOkEditPopUpForNewCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
  		    			 
	     try
	     {
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreate));
			 getAction().doubleClick(customizeMasterCreateTreeTabNewlyCreate).perform();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreateTabCaption));
			 customizeMasterCreateTreeTabNewlyCreateTabCaption.click();
			 customizeMasterCreateTreeTabNewlyCreateTabCaption.clear(); 	
			 customizeMasterCreateTreeTabNewlyCreateTabCaption.sendKeys("Tree Tab Update");	
	  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_UpdateOkBtn));	 
	   	     treeTab_UpdateOkBtn.click();
	   	     	   	     
	   	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationUpdatingConfirmationMessage));
	   	     	   	     
	   	     String actCreateTreeTabUpdateMsg=validationConfirmationMessage.getText();
	   	     String expCreateTreeTabUpdateMsg="Tab Caption Updated Successfully.";
	   	  
	   	     System.out.println("Account Master Create Tree Tab Update Msg Value Actual    : " + actCreateTreeTabUpdateMsg +  " Value Expected : " + expCreateTreeTabUpdateMsg);
	   	   
	   	     boolean actCreateUpdateTreeTab =customizeMasterCreateTreeTabNewlyCreate.isDisplayed();
	   	     boolean expCreateUpdateTreeTab =true;
	   	     
	   	     System.out.println("Account Master Create Tree Tab Update Msg Value Actual    : " + actCreateUpdateTreeTab +  " Value Expected : " + expCreateUpdateTreeTab);
	   	     
	   		 if(actCreateTreeTabUpdateMsg.equalsIgnoreCase(expCreateTreeTabUpdateMsg))
	   		 {
	   			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
	   			 closeValidationConfirmationMessage.click();
	   			 excelReader.setCellData(xlfile, "Sheet1", 311, 9, resPass);
	   			 return true;
	   		 }
	   		 else
	   		 {
	   			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
	   			 closeValidationConfirmationMessage.click();
	   			 excelReader.setCellData(xlfile, "Sheet1", 311, 9, resFail);
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
	  
	
	  
	  public static boolean checkHeaderDetailsTabWithBlankAndBodyDetailsTabForCreateTreeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
      {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
  		 
		 try
		 {
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreate));
		     customizeMasterCreateTreeTabNewlyCreate.click();
				 
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyHeaderDetails));
			 
			 boolean actCreateTreeTabHeaderDetails=customizeMasterCreateTreeTabNewlyHeaderDetails.isDisplayed() && customizeMasterCreateTreeTabNewlyBlankInHeaderDetails.isDisplayed();
			 boolean expCreateTreeTabHeaderDetails=true;
			 
			 System.out.println("Account Master Create Tree Tab Header Value Actual    : " + actCreateTreeTabHeaderDetails +  " Value Expected : " + expCreateTreeTabHeaderDetails); 
	         getWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyBodyDetails));
			 customizeMasterCreateTreeTabNewlyBodyDetails.click();
					 
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyFieldInBodyDetails));
			 
			 boolean actCreateTreeTabBodyDetails = customizeMasterCreateTreeTabNewlyFieldInBodyDetails.isDisplayed();
			 boolean expCreateTreeTabBodyDetails = true;
			 
			 System.out.println("Account Master Create Tree Tab Body Value Actual    : " + actCreateTreeTabBodyDetails +  " Value Expected : " + expCreateTreeTabBodyDetails);
			 
			 if(actCreateTreeTabHeaderDetails==expCreateTreeTabHeaderDetails && actCreateTreeTabBodyDetails==expCreateTreeTabBodyDetails)
			 { 
				 excelReader.setCellData(xlfile, "Sheet1", 312, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 312, 9, resFail);
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
	  
	  
	  
	  public static boolean checkConfirmmationMessageOnDeleteTabOptionForCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		
		 try
		 { 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));
			 createTab.click();
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabTreeTab));
			 createTabTreeTab.click();
			       			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabCaptionTxt));
			 treeTabCaptionTxt.click();
		     treeTabCaptionTxt.sendKeys("Tree Tab Delete");
		     treeTabCaptionTxt.sendKeys(Keys.TAB);
		      
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabTabNameTxt));
		     getAction().moveToElement(treeTabTabNameTxt).sendKeys(Keys.TAB).perform();
		    
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabNewMastertxt));
			 treeTabNewMastertxt.click();
	   		 treeTabNewMastertxt.sendKeys("Account");
	   		 Thread.sleep(2000);
	   		 getAction().moveToElement(treeTabNewMastertxt).sendKeys(Keys.TAB).perform();
	   		 Thread.sleep(2000);
	   		 
	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_FieldCaptiontxt));   		 
	   		 treeTab_FieldCaptiontxt.sendKeys("Tree Tab Delete");	
	   		
	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_OkBtn));
	   		 treeTab_OkBtn.click();
	   		 	   		 
	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage)); 		
	   		 closeValidationConfirmationMessage.click();
	   		
	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeCreateTreeTab));	   		 
	   		 CustomizeCreateTreeTab.click();
	   		
	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tabs_DeleteBtn));	   		
	   		 tabs_DeleteBtn.click();
	   		 
	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeDeleteTabMessage));
	   		 
	   		 String actAlertMessageOnDeleteCreateTreeTab=CustomizeDeleteTabMessage.getText();
	   		 String expAlertMessageOnDeleteCreateTreeTab="Are you sure that you want to delete the selected tab and Fields associated with this ?";
	   		 
			 System.out.println("Account Master Create Tree Tab Header Value Actual    : " + actAlertMessageOnDeleteCreateTreeTab +  " Value Expected : " + expAlertMessageOnDeleteCreateTreeTab);
			 
	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeDeleteTabMessageYesBtn));
	   		 CustomizeDeleteTabMessageYesBtn.click();
	   		
	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	   		 
	   		 String actConfirmationMessage=validationConfirmationMessage.getText();
	   		 String expConfirmationMessage="Tab Deleted Successfully";
	   		 
	   		System.out.println("Account Master Create Tree Tab Header Value Actual    : " + actConfirmationMessage +  " Value Expected : " + expConfirmationMessage);
	   		 
			 if(actAlertMessageOnDeleteCreateTreeTab.equalsIgnoreCase(expAlertMessageOnDeleteCreateTreeTab) 
					 && actConfirmationMessage.equalsIgnoreCase(expConfirmationMessage))
			 {
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
	   			 closeValidationConfirmationMessage.click();
				 excelReader.setCellData(xlfile, "Sheet1", 316, 9, resPass);
				 return true;
			 }
			 else
			 {
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
	   			 closeValidationConfirmationMessage.click();
				 excelReader.setCellData(xlfile, "Sheet1", 316, 9, resFail);
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
	  
	  
	  public static boolean checkCreateDocumentTabOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 try
		 {
		 
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));  
	         createTab.click(); 
	         
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_DocumentTab));
	         createTab_DocumentTab.click();
	        
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentTab_TabCaption));
	         
	         boolean actCreateDocumentFields =documentTab_TabCaption.isDisplayed() && documentTab_TabName.isDisplayed() && 
	        		                          documentTab_HiddenChkbox.isDisplayed() && documentTab_OkBtn.isDisplayed() && 
	        		                          documentTab_CancelBtn.isDisplayed();
	         boolean expCreateDocumentFields =true;
	         
	         System.out.println("Account Master Create Tree Tab Header Value Actual    : " + actCreateDocumentFields +  " Value Expected : " + expCreateDocumentFields);
	                 
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentTab_TabCaption));
	         documentTab_TabCaption.click();
	         documentTab_TabCaption.sendKeys("Document Tab");	
	         documentTab_TabCaption.sendKeys(Keys.TAB);
	         
	         
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentTab_OkBtn));	 
    		 documentTab_OkBtn.click();
    		 
    		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
    
    		 System.out.println("validationConfirmationMessage"+validationConfirmationMessage.getText());
    		 
    		 String actCreateDocumentTabSaveMsg =validationConfirmationMessage.getText();
    		 String expCreateDocumentTabSaveMsg ="Tab Added Successfully";
    	 
    		 System.out.println("Account Master Create Tree Tab Header Value Actual    : " + actCreateDocumentTabSaveMsg +  " Value Expected : " + expCreateDocumentTabSaveMsg);
    		 
    		 if(actCreateDocumentFields==expCreateDocumentFields && actCreateDocumentTabSaveMsg.equalsIgnoreCase(expCreateDocumentTabSaveMsg))
    		 {
    			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
    			 closeValidationConfirmationMessage.click();
    			 excelReader.setCellData(xlfile, "Sheet1", 319, 9, resPass);
    			 return true;
    		 }
    		 else
    		 {    
    			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
    			 closeValidationConfirmationMessage.click();
    			 excelReader.setCellData(xlfile, "Sheet1", 319, 9, resFail);
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
	     
	  
	  
	  
	  
	  public static boolean checkHeaderTabAndBodyTabInCreateDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
		 try
		 {
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateDocumentTabNewlyCreate)); 
		     customizeMasterCreateDocumentTabNewlyCreate.click();
		     
		     
			
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateDocumentTabNewlyHeaderDetails));
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateDocumentTabNewlyBlankInHeaderDetails));
		     
			 boolean actHeaderFieldsInDocumentTab = customizeMasterCreateDocumentTabNewlyHeaderDetails.isDisplayed() && 
					                                customizeMasterCreateDocumentTabNewlyBlankInHeaderDetails.isDisplayed();
			 boolean expHeaderFieldsInDocumentTab = true;
			 
			 System.out.println("Account Master Create Tree Tab Header Value Actual    : " + actHeaderFieldsInDocumentTab +  " Value Expected : " + expHeaderFieldsInDocumentTab);
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateDocumentTabNewlyBodyDetails));
			 customizeMasterCreateDocumentTabNewlyBodyDetails.click();
			 
			 boolean actBodyFieldsInDocumentTab = customizeMasterCreateDocumentTabFieldName.isDisplayed() && customizeMasterCreateDocumentTabDocument.isDisplayed() &&
												  customizeMasterCreateDocumentTabCreatedDate.isDisplayed() && customizeMasterCreateDocumentTabLastModified.isDisplayed() &&
												  customizeMasterCreateDocumentFileSize.isDisplayed();
			 boolean expBodyFieldsInDocumentTab = true;
			
			 System.out.println("Account Master Create Tree Tab Header Value Actual    : " + actBodyFieldsInDocumentTab +  " Value Expected : " + expBodyFieldsInDocumentTab);
			 
			 if(actHeaderFieldsInDocumentTab==expHeaderFieldsInDocumentTab && actBodyFieldsInDocumentTab==expBodyFieldsInDocumentTab) 
			 {				 
				 excelReader.setCellData(xlfile, "Sheet1", 320, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 320, 9, resFail);
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
	     
	     
	  
	  
	  
	  public static boolean checkCreateDocumentTabCreationWithExistingDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	    try
	    {	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab)); 
	        createTab.click();
	     
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_DocumentTab));
	        createTab_DocumentTab.click();
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	  		    			 
	        String actValidationMessage =validationConfirmationMessage.getText();
	        String expValidationMessage ="Only one document tab is allowed per master";
	        
	        System.out.println("Account Master Create Tree Tab Header Value Actual    : " + actValidationMessage +  " Value Expected : " + expValidationMessage);
	   	 
	   		if(actValidationMessage.equalsIgnoreCase(expValidationMessage))
	   		{
	   			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
	   			 closeValidationConfirmationMessage.click();
	   			 excelReader.setCellData(xlfile, "Sheet1", 322, 9, resPass);
	   			 return true;
	   		}
	   		else
	   		{
	   			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
	   			 closeValidationConfirmationMessage.click();
	   			 excelReader.setCellData(xlfile, "Sheet1", 322, 9, resFail);
	   			 return false;
	   		}  	
	    }
	    catch(Exception e)
	    {
 	        excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
 	        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
 	        return false;
 	     }   
	 }
	     
	
	  public static boolean checkCreateCreateTabOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 try
		 {
	         //getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));   
	         //createTab.click();
		 	 
	         //Thread.sleep(2000);
	         
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_CreateTab));
	         createTab_CreateTab.click();
	                               
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_TabCaptionTxt));
	         
	         boolean actCreateTabFields =createTab_TabCaptionTxt.isDisplayed() && createTab_TabNameTxt.isDisplayed() && createTab_PopHiddenChkbox.isDisplayed() && 
					 createTab_PopOkBtn.isDisplayed() && createTab_PopCancelBtn.isDisplayed();
	         
	         boolean expCreateTabFields =true;
	         
	         System.out.println("Account Master Create Tab Value Actual    : " + actCreateTabFields +  " Value Expected : " + expCreateTabFields);
	         
			 if(actCreateTabFields==expCreateTabFields)
			 {	 
				 excelReader.setCellData(xlfile, "Sheet1", 323, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 323, 9, resFail);
					 return false;
			 }
		 }
		 catch(Exception e)
		 {
	 	        excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
	 	        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 	        return false;
	 	 }   		  
	  }
	  
	  
	  public static boolean checkOkButtonWithAllInputInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
		 try
		 {
		 
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_TabCaptionTxt));
	         createTab_TabCaptionTxt.sendKeys("Create Tab");
	         getAction().moveToElement(createTab_TabCaptionTxt).sendKeys(Keys.TAB).perform();

	         String getTabName=createTab_TabNameTxt.getText();
    
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_PopOkBtn));         
	         createTab_PopOkBtn.click();         
	         			 
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	         
	         getWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	         String actCreateTabSaveMsg =validationConfirmationMessage.getText();
	         String expCreateTabSaveMsg ="Tab Added Successfully";
	         
	         System.out.println("Account Master Create Tab Value Actual    : " + actCreateTabSaveMsg +  " Value Expected : " + expCreateTabSaveMsg);
	  	   
      
	         getWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabNewlyCreateTabCaption));	 
	         boolean actCreateTabDisplay =customizeMasterCreateCreateTabNewlyCreateTabCaption.isDisplayed();
	         boolean expCreateTabDisplay =true;
	        
	         System.out.println("Account Master Create Tab Value Actual    : " + actCreateTabDisplay +  " Value Expected : " + expCreateTabDisplay);
	   	 
		   		if(actCreateTabSaveMsg.equalsIgnoreCase(expCreateTabSaveMsg) && actCreateTabDisplay==expCreateTabDisplay)
		   		{
		   			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
		   			 closeValidationConfirmationMessage.click();
		   			 excelReader.setCellData(xlfile, "Sheet1", 325, 9, resPass);
		   			 return true;
		   		}
		   		else
		   		{
		   			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
		   			 closeValidationConfirmationMessage.click();
		   			 excelReader.setCellData(xlfile, "Sheet1", 325, 9, resFail);
		   			 return false;
		   		}
		  }
		  catch(Exception e)
		  {
	 	        excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
	 	        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 	        return false;
	 	  }  
	   			  
	  }
	     

	  
	  
	  
	  public static boolean checkHeaderBodyDetailsTabInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	   	  try
	   	  {
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabNewlyCreateTabCaption));
             customizeMasterCreateCreateTabNewlyCreateTabCaption.click();
                         
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
 	   	 
             boolean actCreateTabHeaderFields =customizeMasterCreateCreateTabHeaderDetails.isDisplayed() &&
						            		    customizeMasterCreateCreateTabBlankHeaderDetails.isDisplayed() &&
							 	   				customizeMasterCreateCreateTabNewlyCreateTabSaveButton.isDisplayed() &&
							 	   			    customizeMasterCreateCreateTabAddButton.isDisplayed() &&
							 	   		        customizeMasterCreateCreateTabPreviewButton.isDisplayed() &&
							 	   	            customizeMasterCreateCreateTabCloseButton.isDisplayed();
             boolean expCreateTabHeaderFields =true;
             
             System.out.println("Account Master Create Tab Value Actual    : " + actCreateTabHeaderFields +  " Value Expected : " + expCreateTabHeaderFields);
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabBodyDetails));
             customizeMasterCreateCreateTabBodyDetails.click();
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabBlankBodyDetails));
             
             boolean actCreateTabBodyFields =customizeMasterCreateCreateTabBodyDetails.isDisplayed() && customizeMasterCreateCreateTabBlankBodyDetails.isDisplayed();
             boolean expCreateTabBodyFields =true;
             
             System.out.println("Account Master Create Tab Value Actual    : " + actCreateTabBodyFields +  " Value Expected : " + expCreateTabBodyFields);
                      
 	   		 if(actCreateTabHeaderFields==expCreateTabHeaderFields && actCreateTabBodyFields==expCreateTabBodyFields)
 	   		 { 	   			 
 	   			 excelReader.setCellData(xlfile, "Sheet1", 327, 9, resPass);
 	   			 return true;
 	   		 }
 	   		 else
 	   		 {	 	   			 
 	   			 excelReader.setCellData(xlfile, "Sheet1", 327, 9, resFail);
 	   			 return false;
 	   		 }
	   	   }
	   	   catch(Exception e)
		   {
	 	        excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
	 	        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	 	        return false;
	 	   }  
	      }
	     
	     
	     
	     
	  public static boolean checkAddOptionInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	      		    			 
   		 try
   		 {
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
             customizeMasterCreateCreateTabHeaderDetails.click();
            
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabAddButton));
             customizeMasterCreateCreateTabAddButton.click();
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
            
             boolean actCreateTabTabs =extraFields_FieldDetailsTab.isDisplayed() && extraFields_PropertiesTab.isDisplayed() 
            		                        && extraFields_FormattingTab.isDisplayed() && extraFields_RulesTab.isDisplayed() 
            		                        && extraFields_ExternalModulesTab.isDisplayed();
             boolean expCreatetTabTabs =true;
                         
             System.out.println("Account Master Create Tab Tabs Value Actual    : " + actCreateTabTabs +  " Value Expected : " + expCreatetTabTabs);
                        	 	   
             boolean actCreateTabFields =extraFields_FieldDetailsCaption.isDisplayed() && extraFields_FieldDetailsName.isDisplayed() &&
						      	   	     extraFields_FieldDetailsDatTypeDropdown.isDisplayed()  && extraFields_FieldDetailsDefaultValue.isDisplayed() &&
						     	   		 extraFields_FieldDetailsBannerText.isDisplayed()  && extraFields_FieldDetails_MaxSize.isDisplayed() &&
						     	   		 extraFields_FieldDetailsControlTypeDropdown.isDisplayed() && extraFields_FieldDetailsToolTipText.isDisplayed() &&
						     	   		 extraFields_FieldDetailsRegularExpressionText.isDisplayed() && extraFields_RegularExperssionLoadExpansionBtn.isDisplayed();
             
             boolean expCreateTabFields =true;
             
             System.out.println("Account Master Create Tab Fields Tab Value Actual    : " + actCreateTabFields +  " Value Expected : " + expCreateTabFields);
	             
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
    		 
             extraFields_FieldDetailsCaption.sendKeys("Extra Field One");
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
             extraFields_PropertiesTab.click();
                          
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTabPartOfDeliveryAddressChekbox));
             
 	   		 boolean actCreateTabProperties =extraFields_PropertiesTabPartOfDeliveryAddressChekbox.isDisplayed() && 
							 	   				extraFields_PropertiesPartOfBillingAddressChekbox.isDisplayed() &&
							 	   			    extraFields_PropertiesMandatoryChekbox.isDisplayed()  && 
								 	   			extraFields_PropertiesAllowAsParameterChekbox.isDisplayed() &&
								 	   		    extraFields_PropertiesHiddenChekbox.isDisplayed()  && 
								 	   		    extraFields_PropertiesSpellCheckChekbox.isDisplayed() &&
								 	   		    extraFields_PropertiesMandatoryInGroupChekbox.isDisplayed() && 
								 	   		    extraFields_PropertiesAuditTrialChekbox.isDisplayed() &&
								 	   		    extraFields_PropertiesNotAvailableForReportsChekbox.isDisplayed() && 
								 	   		    extraFields_PropertiesMergeFieldChekbox.isDisplayed() &&
								 	   		    extraFields_PropertiesMassUpdateChekbox.isDisplayed() &&
								 	   		    extraFields_PropertiesIncludeInQuickCreateChekbox.isDisplayed() &&
								 	   		    extraFields_PropertiesCannotBeExportedChekbox.isDisplayed() &&
								 	   	        extraFields_PropertiesCannotBeImportedChekbox.isDisplayed() &&
								 	   	        extraFields_PropertiesCopyFromParentChekbox.isDisplayed() &&
							 	   	            extraFields_PropertiesReadOnlyChekbox.isDisplayed() &&
							 	   	            extraFields_PropertiesInformationFieldChekbox.isDisplayed() &&
							 	   	            extraFields_PropertiesIsMandatoryInRevisionChekbox.isDisplayed() &&
							 	   	            extraFields_PropertiesAvailableinCustomerPortalChekbox.isDisplayed() &&
							 	   	            extraFields_PropertiesEditableinCustomerPortalChekbox.isDisplayed() &&
							 	   	            extraFields_PropertiesBehaviourDropdown.isDisplayed();
 	   		 
 	   		 boolean expCreateTabProperties =true;
 	   		 
 	   	     System.out.println("Account Master Create Tab Properties Tab Value Actual    : " + actCreateTabProperties +  " Value Expected : " + expCreateTabProperties);
             
 	   	  
 	   	      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FormattingTab));
              extraFields_FormattingTab.click();
             
              getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FormattingColumnSpan));
             
 	   		  boolean actFormattingTab =extraFields_FormattingColumnSpan.isDisplayed() && 
					 	   				extraFields_FormattingRowSpan.isDisplayed()  &&
					 	   			    extraFields_FormattingCharacterCasingDropdown.isDisplayed() &&
					 	   			    extraFields_FormattingTextAlignDropdown.isDisplayed()  && 
					 	   			    extraFields_FormattingFieldsDetailsFont.isDisplayed() &&
					 	   			    extraFields_FormattingBackColor.isDisplayed() && 
					 	   			    extraFields_FormattingFieldsDetailsFont_Btn.isDisplayed();
 	   		 
 	   		 boolean expFormattingTab =true;
 	   		 
 	   	     System.out.println("Account Master Create Tab Formtting Tab Value Actual    : " + actFormattingTab +  " Value Expected : " + expFormattingTab);
					 	   		 
 	   	  
 	   	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesTab));
             extraFields_RulesTab.click();

             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesClickHereAddRuleButtonBtn));
           
             boolean actRulesTab =extraFields_RulesClickHereAddRuleButtonBtn.isDisplayed();
             boolean expRulesTab =true;
           
             System.out.println("Account Master Create Tab Rules Tab Value Actual    : " + actRulesTab +  " Value Expected : " + expRulesTab);
             
           
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesClickHereAddRuleButtonBtn)); 
             extraFields_RulesClickHereAddRuleButtonBtn.click();

             getWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RuleNameDropdown));
          
             boolean actRuleOptions =extraFields_RuleNameDropdown.isDisplayed() && extraFields_RuleNameSetingBtn.isDisplayed() &&
					   			     extraFields_RulesSaveBtn.isDisplayed() && extraFields_RulesNewBtn.isDisplayed() &&
					   			     extraFields_RulesDeleteBtn.isDisplayed()  && extraFields_RulesCloseBtn.isDisplayed();
				           
             boolean expRuleOptions =true;
           
             System.out.println("Account Master Create Tab Rules Tab Value Actual    : " + actRuleOptions +  " Value Expected : " + expRuleOptions);
           
           
           
             getWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ExternalModulesTab));       
             extraFields_ExternalModulesTab.click();

             getWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ExternalModulesOnEventDropdown));
          
	   	     boolean actExternalModules =extraFields_ExternalModulesOnEventDropdown.isDisplayed() && 
		   				extraFields_ExternalModulesButtonCaption.isDisplayed() &&
		   				extraFields_ExternalModules_ModuleTypeBtn.isDisplayed() && 
		   				extraFields_ExternalModules_ModuleNameDropdown.isDisplayed() &&
		   				extraFields_ExternalModulesClassNameDropdown.isDisplayed()  && 
		   				extraFields_ExternalModulesFuctionalNameDropdown.isDisplayed() &&
		   				extraFields_ExternalModulesAvabileInDropdown.isDisplayed();
	   		 
	   		 boolean expExternalModules =true;
	   			 
	   		 System.out.println("Account Master Create Tab External Modules Value Actual    : " + actExternalModules +  " Value Expected : " + expExternalModules);
           
             if(actCreateTabTabs==expCreatetTabTabs && actCreateTabFields==expCreateTabFields && actCreateTabProperties==expCreateTabProperties
            		 && actRulesTab==expRulesTab && actRuleOptions==expRuleOptions && actExternalModules==expExternalModules)
 	   		 { 	   			 
 	   			 excelReader.setCellData(xlfile, "Sheet1", 327, 9, resPass);
 	   			 return true;
 	   		 }
 	   		 else
 	   		 {	 	   			 
 	   			 excelReader.setCellData(xlfile, "Sheet1", 327, 9, resFail);
 	   			 return false;
 	   		 }
   		 }
   		 catch(Exception e)
	     {
 	        excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
 	        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
 	        return false;
 	     } 
	   }
	  
	  
	  
	  public static boolean checkCloseOptionInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	      		    			  
		 try
		 {
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CloseBtn));		
             extraFields_CloseBtn.click();
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
     	   	                  
             boolean actCloseBtnClickInCreateTab =customizeMasterCreateCreateTabHeaderDetails.isDisplayed() && 
								 	   				 customizeMasterCreateCreateTabBlankHeaderDetails.isDisplayed() &&
								 	   				 customizeMasterCreateCreateTabNewlyCreateTabSaveButton.isDisplayed() &&
								 	   			     customizeMasterCreateCreateTabAddButton.isDisplayed() &&
								 	   		         customizeMasterCreateCreateTabPreviewButton.isDisplayed() &&
								 	   	             customizeMasterCreateCreateTabCloseButton.isDisplayed();								             
             boolean expCloseBtnClickInCreateTab = true;
             
             System.out.println("Account Master Create Tab External Modules Value Actual    : " + actCloseBtnClickInCreateTab +  " Value Expected : " + expCloseBtnClickInCreateTab);
             
             if(actCloseBtnClickInCreateTab==expCloseBtnClickInCreateTab)
 	   		 { 	   			 
 	   			 excelReader.setCellData(xlfile, "Sheet1", 327, 9, resPass);
 	   			 return true;
 	   		 }
 	   		 else
 	   		 {	 	   			 
 	   			 excelReader.setCellData(xlfile, "Sheet1", 327, 9, resFail);
 	   			 return false;
 	   		 }
   		 }
   		 catch(Exception e)
	     {
 	        excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
 	        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
 	        return false;
	     }
		 
	   			  
	   }
	  
	  
	  
	  

	  
	  public static boolean checkAddOptionToCreateExtraFieldInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	   		
		 try
		 {
	             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabAddButton)); 
	             customizeMasterCreateCreateTabAddButton.click();
	      		    				             
	             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));			 
	             extraFields_FieldDetailsCaption.sendKeys("Extra Field One");
	            	          
	             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));	    		 
	             extraFields_OkBtn.click();
	             	           
	             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	             
	             String actCreateTabFieldSave =validationConfirmationMessage.getText();
	             String expCreateTabFieldSave ="Field Added Successfully.";
	             
	             System.out.println("Account Master Create Tab Save Value Actual    : " + actCreateTabFieldSave +  " Value Expected : " + expCreateTabFieldSave);
	                          
	             
	             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
	   		     closeValidationConfirmationMessage.click();
	             
	             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));			 
	   			 customizeMasterCreateCreateTabHeaderDetails.click();
	   			 
	   		     boolean actExtraFieldCreateDisplay =extraFields_CreatedByUserInHeaderDetailsTab.isDisplayed();
	   		     boolean expExtraFieldCreateDisplay =true;
	            
	   		     System.out.println("Account Master Create Tab Extra Field Value Actual    : " + actExtraFieldCreateDisplay +  " Value Expected : " + expExtraFieldCreateDisplay);
	             
	 	   		 if(actCreateTabFieldSave.equalsIgnoreCase(expCreateTabFieldSave) && actExtraFieldCreateDisplay==expExtraFieldCreateDisplay)
	 	   		 { 
	 	   			 excelReader.setCellData(xlfile, "Sheet1", 338, 9, resPass);
	 	   			 return true;
	 	   		 }
	 	   		 else
	 	   		 {
	 	   			 excelReader.setCellData(xlfile, "Sheet1", 338, 9, resFail);
	 	   			 return false;
	 	   		 }
		 }
		 catch(Exception e)
	     {
	        excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
	        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	        return false;
	     }
	   			  
	    }
	     

	  
	  
	  public static boolean checkEditToUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 

		 try
		 {		 
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
   			 customizeMasterCreateCreateTabHeaderDetails.click();
   				  
   			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_EditOptionInHeaderDetailsTab));
   			 extraFields_EditOptionInHeaderDetailsTab.click();
   			 
   			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));			 
   			 extraFields_FieldDetailsCaption.click();
   		
   			 boolean actFieldsInCreateTab =extraFields_FieldDetailsTab.isDisplayed() && extraFields_PropertiesTab.isDisplayed() 
							 	   				&& extraFields_FormattingTab.isDisplayed() && extraFields_RulesTab.isDisplayed() 
							 	   				&& extraFields_ExternalModulesTab.isDisplayed();
   			 boolean expFieldsInCreateTab =true;
   			 
   			 System.out.println("Account Master Create Tab Edit Save Value Actual    : " + actFieldsInCreateTab +  " Value Expected : " + expFieldsInCreateTab);
   			 
   		 	 String actGetCaption =extraFields_FieldDetailsCaption.getAttribute("Value");
   		 	 String expGetCaption ="Extra Field One";
   		 	 
   		 	 System.out.println("Account Master Create Ta Caption Value Actual    : " + actGetCaption +  " Value Expected : " + expGetCaption);
   		 	 
   		 	 
   		 	 
   		 	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));	 
  			 extraFields_FieldDetailsCaption.click();
  			 extraFields_FieldDetailsCaption.clear();
  		     extraFields_FieldDetailsCaption.sendKeys("Extra Field Update On");
  		     
  		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
	   		 extraFields_OkBtn.click();

	   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	            		 	 
   		 	 String actExtraFieldUpdateMsg =validationConfirmationMessage.getText();
   		 	 String expExtraFieldUpdateMsg ="Field Updated Successfully";
   		 	  
   		 	 System.out.println("Account Master Create Tab Update Value Actual    : " + actExtraFieldUpdateMsg +  " Value Expected : " + expExtraFieldUpdateMsg);
   		 	 
   		 	 Thread.sleep(2000);
   		 	 
   		 	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
             customizeMasterCreateCreateTabHeaderDetails.click();
  			 
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_EditOptionInHeaderDetailsTab));
  			 extraFields_EditOptionInHeaderDetailsTab.click();
  			 
  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
  			 extraFields_FieldDetailsCaption.click();
  			
  			 String actGetCaptionUpdate =extraFields_FieldDetailsCaption.getAttribute("Value");
  			 String expGetCaptionUpdate ="Extra Field Update On";
  			 
  			 System.out.println("Account Master Create Tab Update Edit Value Actual    : " + actGetCaptionUpdate +  " Value Expected : " + expGetCaptionUpdate);
   		 	 		
  			 
  			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CloseBtn));
			 extraFields_CloseBtn.click();
			 
   			 if(actFieldsInCreateTab==expFieldsInCreateTab && actGetCaption.equalsIgnoreCase(expGetCaption)
   					 && actExtraFieldUpdateMsg.equalsIgnoreCase(expExtraFieldUpdateMsg) && actGetCaptionUpdate.equalsIgnoreCase(expGetCaptionUpdate))
   			 { 	   			 
 	   			 excelReader.setCellData(xlfile, "Sheet1", 340, 9, resPass);
 	   			 return true;
 	   		 }
 	   		 else
 	   		 {	 	   			 
 	   			 excelReader.setCellData(xlfile, "Sheet1", 340, 9, resFail);
 	   			 return false;
 	   		 }
		 }
		 catch(Exception e)
	     {
	        excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
	        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	        return false;
	     }
	  }
	     
	  

	  @FindBy(xpath="//*[@id='lblWarnMessage_FieldModal']")
	  private static WebElement extraFields_DeleteMessage;
	  
	  @FindBy(xpath="//*[@id='MCustomize_DeleteField_Modal']/div/div/div[3]/button[1]")
	  private static WebElement extraFields_DeleteMessageClickOnYes;
	  
	  public static boolean checkCreateExtraFieldToDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	    
		 try
		 {
			 
			 
			 
	         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabAddButton));       
             customizeMasterCreateCreateTabAddButton.click();
                        			
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
             extraFields_FieldDetailsCaption.sendKeys("Exra Field Two");
             
             Thread.sleep(2000);
                 
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));	 
             extraFields_OkBtn.click();
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
              
             String actSaveMsgOnCreateField =validationConfirmationMessage.getText();
             String expSaveMsgOnCreateField ="Field Added Successfully.";
             
             
             
             Thread.sleep(9000);
             
             System.out.println("Account Master Create Tab New Save Value Actual    : " + actSaveMsgOnCreateField +  " Value Expected : " + expSaveMsgOnCreateField);
            
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SecondDeleteOptionInHeaderDetailsTab));
             extraFields_SecondDeleteOptionInHeaderDetailsTab.click();
             
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_DeleteMessage));
             String actDeleteMsg =extraFields_DeleteMessage.getText();
             String expDeleteMsg ="Are you sure that you want to delete selected Field ?";
             
             System.out.println("Account Master Create Tab Delete Value Actual    : " + actDeleteMsg +  " Value Expected : " + expDeleteMsg);
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_DeleteMessageClickOnYes));
             extraFields_DeleteMessageClickOnYes.click();       
             
             //Thread.sleep(5000);
             
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
             
             String actGetConfirmationMsg =validationConfirmationMessage.getText();
             String expGetConfirmtionMsg ="Field deleted Successfully";
             
             System.out.println("Account Master Create Tab Confirmation Msg Value Actual    : " + actGetConfirmationMsg +  " Value Expected : " + expGetConfirmtionMsg);
             
 	   		 if(actSaveMsgOnCreateField.equalsIgnoreCase(expSaveMsgOnCreateField) && actDeleteMsg.equalsIgnoreCase(expDeleteMsg)
 	   				 && actGetConfirmationMsg.equalsIgnoreCase(expGetConfirmtionMsg))
 	   		 {
 	   		     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
   		         closeValidationConfirmationMessage.click();
 	   			 excelReader.setCellData(xlfile, "Sheet1", 343, 9, resPass);
 	   			 return true;
 	   		 }
 	   		 else
 	   		 {
 	   		     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
   		         closeValidationConfirmationMessage.click();
 	   			 excelReader.setCellData(xlfile, "Sheet1", 343, 9, resFail);
 	   			 return false;
 	   		 }
		 }
   		 catch(Exception e)
	     {
	        excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
	        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	        return false;
	     }		  
	 }
	  
	  
	  

	  
	 /* @FindBy(xpath="//*[@id='iTreeId']")
	  public static WebElement masterTreeIdDropdown; 

	  @FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/button/span")
	  public static WebElement masterTreeIDToggleBtn; 
	  
	  @FindBy(xpath="//select[@id='iTreeViewId']")
	  public static WebElement masterTreeViewIDDropdown; 
	  
	  @FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/button/span")
	  public static WebElement masterTreeViewIDToggleBtn;
	  
	  @FindBy(xpath="//*[@id='oncheckaccorderan']")
		public static WebElement masterOptionToHideAccountsGroupTree; /////To hide TreeId and TreeViewId Elements From HomeScreen
*/
		@FindBy(xpath="//*[@id='18']/a[1]")
		private static WebElement accountAssestsGroup;
		
		@FindBy(xpath="//*[@id='17']/a[2]")
		private static WebElement accountFixedAssestsGroup;
		
		@FindBy(xpath="//*[@id='23']/a[2]")
		private static WebElement accountCurrentAssetsGroup;

		@FindBy(xpath="//*[@id='8']/a[2]")
		private static WebElement accountCAshAndBankGroup;
		
		@FindBy(xpath="//*[@id='13']/a[2]")
		private static WebElement accountInventoriesGroup;
		
		@FindBy(xpath="//*[@id='22']/a[2]")
		private static WebElement accountAccountsReceivableGroup;
		
		@FindBy(xpath="//*[@id='72']/a[2]")
		private static WebElement accountInvestmentsGroup;
		
		@FindBy(xpath="//*[@id='25']/a[2]")
		private static WebElement accountExpensesGroup;
		
		@FindBy(xpath="//*[@id='24']/a[2]")
		private static WebElement accountDirectExpensesGroup;
		
		@FindBy(xpath="//*[@id='73']/a[2]")
		private static WebElement accountIndirectExpensesGroup;
		
		@FindBy(xpath="//*[@id='54']/a[2]")
		private static WebElement accountAdministrativeExpensesGroup;
		
		@FindBy(xpath="//*[@id='60']/a[2]")
		private static WebElement accountEmployeeBenefitsGroup;
		
		@FindBy(xpath="//*[@id='64']/a[2]")
		private static WebElement accountFinancialChargesGroup;
		
		@FindBy(xpath="//*[@id='69']/a[2]")
		private static WebElement accountGainAndLossGroup;
		
		@FindBy(xpath="//*[@id='26']/a[2]")
		private static WebElement accountControlAccountsGroup;
		
		@FindBy(xpath="//*[@id='29']/a[2]")
		private static WebElement accountRevenueGroup;

		@FindBy(xpath="//*[@id='28']/a[2]")
		private static WebElement accountSalesGroup;
		
		@FindBy(xpath="//*[@id='33']/a[2]")
		private static WebElement accountEqitiesGroup;
		
		@FindBy(xpath="//*[@id='32']/a[2]")
		private static WebElement accountCapitalGroup;
		
		@FindBy(xpath="//*[@id='39']/a[2]")
		private static WebElement accountLiabilitiesGroup;
		
		@FindBy(xpath="//*[@id='38']/a[2]")
		private static WebElement accountLoanAndBorrowingGroup;
		
		@FindBy(xpath="//*[@id='37']/a[2]")
		private static WebElement accountLoansGroup;
		
		@FindBy(xpath="//*[@id='42']/a[2]")
		private static WebElement accountAccruedLiabilitiesGroup;
		
		@FindBy(xpath="//*[@id='45']/a[2]")
		private static WebElement accountTradePayableGroup;
		
		@FindBy(xpath="//*[@id='48']/a[2]")
		private static WebElement accountProvisionsGroup;

	  
		@FindBy(xpath="//*[@id='txtsrch-term']")
		public static WebElement masterSearchTxt; 

		@FindBy(xpath="//*[@id='btnSearchAcc1']/i")
		public static WebElement masterSearchBtn; 
		
		@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
		public static WebElement mastercmbMasterTxt; 

		@FindBy(xpath="//*[@id='cmbUserTypeMaster_input_image']/span")
		public static WebElement masterCmbMasterExpansionBtn; 
		
		@FindBy(xpath="//*[@id='cmbUserTypeMaster_input_settings']/span")
		public static WebElement masterCumMasterSettingBtn; 
	  
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
		

		
		 public static boolean checkCreateTabEditOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		    			 
		     try
		     {
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabNewlyCreateTabCaption));
				 getAction().doubleClick(customizeMasterCreateCreateTabNewlyCreateTabCaption).perform();
				 
				 Thread.sleep(2000);
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreateTabCaption));
				 customizeMasterCreateTreeTabNewlyCreateTabCaption.click();
				 customizeMasterCreateTreeTabNewlyCreateTabCaption.clear(); 	
				 customizeMasterCreateTreeTabNewlyCreateTabCaption.sendKeys("Create Tab Update");	
				 Thread.sleep(2000);
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_UpdateOkBtn));	 
		   	     treeTab_UpdateOkBtn.click();
				 
		   	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationUpdatingConfirmationMessage));
		   	     
		   	     String actCreateTreeTabUpdateMsg=validationConfirmationMessage.getText();
		   	     String expCreateTreeTabUpdateMsg="Tab Caption Updated Successfully.";
		   	     
		   	    System.out.println("Account Master Create Tree Tab Update Msg Value Actual    : " + actCreateTreeTabUpdateMsg +  " Value Expected : " + expCreateTreeTabUpdateMsg);
		   	     
		   	  
		   	    if(closeValidationConfirmationMessage.isDisplayed())
		   	    {
		   	    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
		   			closeValidationConfirmationMessage.click();
			   	  	    	
		   	    }		   	     
		   	  
		   	     boolean actCreateUpdateTreeTab =customizeMasterCreateCreateTabNewlyCreateTabCaption.isDisplayed();
		   	     boolean expCreateUpdateTreeTab =true;
		   	     
		   	     System.out.println("Account Master Create Tree Tab Update Msg Value Actual    : " + actCreateUpdateTreeTab +  " Value Expected : " + expCreateUpdateTreeTab);
		   	     
		   		 if(actCreateTreeTabUpdateMsg.equalsIgnoreCase(expCreateTreeTabUpdateMsg))
		   		 { 
		   			 excelReader.setCellData(xlfile, "Sheet1", 311, 9, resPass);
		   			 return true;
		   		 }
		   		 else
		   		 {
		   			 excelReader.setCellData(xlfile, "Sheet1", 311, 9, resFail);
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
		  
	
		 
		 public static boolean checkConfirmmationMessageOnDeleteTabOptionForCreateTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		
			 try
			 { 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));
				 createTab.click();
				
		         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_CreateTab));
		         createTab_CreateTab.click();
				       			 
		         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_TabCaptionTxt));
		         createTab_TabCaptionTxt.sendKeys("Tab Delete");
		         getAction().moveToElement(createTab_TabCaptionTxt).sendKeys(Keys.TAB).perform();

		         String getTabName=createTab_TabNameTxt.getText();
	    
		         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_PopOkBtn));         
		         createTab_PopOkBtn.click();  
		   		 
		   		 Thread.sleep(4000);
		   		 	   		 
		   		 if(closeValidationConfirmationMessage.isDisplayed())
		   		 {
		   			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage)); 		
			   		 closeValidationConfirmationMessage.click();
		   		 }
		   		 
		   		 
		   		
		   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeCreateTab));	   		 
		   		 CustomizeCreateTab.click();
		   		
		   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tabs_DeleteBtn));	   		
		   		 tabs_DeleteBtn.click();
		   		 
		   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeDeleteTabMessage));
		   		 
		   		 String actAlertMessageOnDeleteCreateTreeTab=CustomizeDeleteTabMessage.getText();
		   		 String expAlertMessageOnDeleteCreateTreeTab="Are you sure that you want to delete the selected tab and Fields associated with this ?";
		   		 
				 System.out.println("Account Master Create Tree Tab Header Value Actual    : " + actAlertMessageOnDeleteCreateTreeTab +  " Value Expected : " + expAlertMessageOnDeleteCreateTreeTab);
				 
		   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeDeleteTabMessageYesBtn));
		   		 CustomizeDeleteTabMessageYesBtn.click();
		   		
		   		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
		   		 
		   		 String actConfirmationMessage=validationConfirmationMessage.getText();
		   		 String expConfirmationMessage="Tab Deleted Successfully";
		   		 
		   		System.out.println("Account Master Create Tree Tab Header Value Actual    : " + actConfirmationMessage +  " Value Expected : " + expConfirmationMessage);
		   		 
				 if(actAlertMessageOnDeleteCreateTreeTab.equalsIgnoreCase(expAlertMessageOnDeleteCreateTreeTab) 
						 && actConfirmationMessage.equalsIgnoreCase(expConfirmationMessage))
				 {
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
		   			 closeValidationConfirmationMessage.click();
					 excelReader.setCellData(xlfile, "Sheet1", 316, 9, resPass);
					 return true;
				 }
				 else
				 {
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
		   			 closeValidationConfirmationMessage.click();
					 excelReader.setCellData(xlfile, "Sheet1", 316, 9, resFail);
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
		 
		 
		 
		   
			@FindBy(xpath = "//*[@id='iTreeId']")
			public static WebElement masterTreeIdDropdown;

			@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/button/span")
			public static WebElement masterTreeIDToggleBtn;

			@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[1]/a")
			public static WebElement masterTreeIDToggle_CreateTreeBtn;
			
			// TreeViewID Elements
			@FindBy(xpath = "//select[@id='iTreeViewId']")
			public static WebElement masterTreeViewIDDropdown;

			@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/button/span")
			public static WebElement masterTreeViewIDToggleBtn;

			@FindBy(xpath = "//*[@id='oncheckaccorderan']")
			public static WebElement masterOptionToHideAccountsGroupTree; 
	  
	  public static boolean checkCloseBtnCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
			  excelReader=new ExcelReader(POJOUtility.getExcelPath());
			  xlfile="E:\\FocusSmoke\\FocusAI\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	         
	          getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountCloseBtn));
			 
	          accountCloseBtn.click();
			
	          getWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));
	         
	          if(masterTreeIdDropdown.isDisplayed() && 
	 				 masterTreeIDToggleBtn.isDisplayed() && masterTreeViewIDDropdown.isDisplayed() &&
	 				 masterTreeViewIDToggleBtn.isDisplayed() && masterOptionToHideAccountsGroupTree.isDisplayed() && accountAssestsGroup.isDisplayed() && 
	 				 accountFixedAssestsGroup.isDisplayed() && accountCurrentAssetsGroup.isDisplayed() &&
	 				 accountCAshAndBankGroup.isDisplayed() && accountInventoriesGroup.isDisplayed()&&
	 				 accountAccountsReceivableGroup.isDisplayed() && accountInvestmentsGroup.isDisplayed() &&
	 				 accountExpensesGroup.isDisplayed() && accountDirectExpensesGroup.isDisplayed() &&
	 				 accountIndirectExpensesGroup.isDisplayed() && accountAdministrativeExpensesGroup.isDisplayed() &&
	 				 accountEmployeeBenefitsGroup.isDisplayed() && accountFinancialChargesGroup.isDisplayed() &&
	 				 accountGainAndLossGroup.isDisplayed() && accountControlAccountsGroup.isDisplayed() &&
	 				 accountRevenueGroup.isDisplayed() && accountSalesGroup.isDisplayed() && 
	 				 accountEqitiesGroup.isDisplayed() && accountCapitalGroup.isDisplayed() &&
	 				 accountLiabilitiesGroup.isDisplayed() && accountLoanAndBorrowingGroup.isDisplayed() &&
	 				 accountLoansGroup.isDisplayed() && accountAccruedLiabilitiesGroup.isDisplayed() &&
	 				 accountTradePayableGroup.isDisplayed() && accountProvisionsGroup.isDisplayed() && masterSearchTxt.isDisplayed() &&
	 				 masterSearchBtn.isDisplayed() &&
	 				 mastercmbMasterTxt.isDisplayed() &&
	 				 masterCmbMasterExpansionBtn.isDisplayed() &&
	 				 masterCumMasterSettingBtn.isDisplayed() &&
	 				 masterMoveTheSelectionToNextBookMarkBtn.isDisplayed() &&
	 				 masterMoveTheSelectionToPrevoiusBookmarkBtn.isDisplayed() &&
	 				 masterShowAllRecordsBtn.isDisplayed() &&
	 				 masterShowAllUnauthorisedRecords.isDisplayed() &&
	 				 masterShowAllClosedRecordsBtn.isDisplayed() &&
	 				 masterAutoAdjustColoumnsBtn.isDisplayed() &&
	 				 masterRetainSelectionCheckBox.isDisplayed() &&
	 				 masterSideBarBtn.isDisplayed())
	 		 {	
	 				excelReader.setCellData(xlfile, "Sheet1", 370, 9, resPass);
	 				return true;
	 		 }	 
	 		 else
	 		 {
	 			 excelReader.setCellData(xlfile, "Sheet1", 370, 9, resFail);
	 			 return false;
	 		 }
	     }
	     
	  
	  
	  
	  


	  @FindBy(xpath = "//i[@class='icon-font6 icon-close']")
	  public static WebElement masterCloseBtn;
			   
	  public boolean checkClickOnCloseButtonInAccountMasterToCloseAccountsPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
		System.out.println("******************************** checkClickOnCloseButtonInAccountMasterToCloseAccountsPage Method Executes.....  ******************************");
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
			masterCloseBtn.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
			String actDashboardLabel = labelDashboard.getText();
			String expDashboardLabel = "Dashboard";
			
			//excelReader.setCellData(xlfile, xlSheetName, 152, 8, actDashboardLabel);

			System.out.println("Click Close button In Accounts Master Value Actual  : " + actDashboardLabel+ "      Value Expected : " + expDashboardLabel);

			if (actDashboardLabel.equalsIgnoreCase(expDashboardLabel)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 151, 9, resPass);
				System.out.println(" Test Pass: Close Button is working");
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 151, 9, resFail);
				System.out.println(" Test Fail: Close Button is not working");
				return false;
			}
		 }		
		catch (Exception e) 
	    {
	    	String exception =e.getMessage().substring(0, 100);
	    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 151, 10, e.getMessage());
	    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	    	return false;
	    }
	  }
	  

	  
	/*  @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
		private static WebElement logoutOption;

		@FindBy(xpath="//*[@id='txtUsername']")
		private static WebElement username;

		@FindBy(id="txtPassword")
		private static WebElement password;
		
	    @FindBy(id="ddlCompany")
	    private static WebElement companyDropDownList;

		@FindBy(id="btnSignin")
		private static WebElement signIn;*/
		
		
			
			public boolean checkCloseAndLogoutTheCompanyInAcctsCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
					
				  Thread.sleep(3000);
				  
				  getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
				  userNameDisplay.click();
	 
				  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
				  logoutOption.click();
		  
					boolean verifyFiledsStatus=true;
					
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
					
					getWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		  			
			      	boolean actusername			      = username.isDisplayed();
			      	boolean actpassword	 	          = password.isDisplayed();
			        boolean actcompanyDropDownList    = companyDropDownList.isDisplayed();
			      	boolean actsignIn				  = signIn.isDisplayed();
			      	
			      	boolean expusername			      = true;
			      	boolean exppassword			      = true;
			      	boolean expcompanyDropDownList    = true;
			      	boolean expsignIn				  = true;
			  		 
			      	System.out.println("************************************* checkCloseAndLogoutTheCompanyInAcctsCustomization  *********************************");
			      	
			      	System.out.println("Username             : " + actusername            + " Value Expected : " + expusername);
			      	System.out.println("Password             : " + actpassword            + " Value Expected : " + exppassword);
			      	System.out.println("CompanyDropDownList  : " + actcompanyDropDownList + " Value Expected : " + expcompanyDropDownList);
			      	System.out.println("SignIn               : " + actsignIn              + " Value Expected : " + expsignIn);
			      	
			      	
			      	boolean actMethod=actusername==expusername && actpassword==exppassword && 
			      			actcompanyDropDownList==expcompanyDropDownList && actsignIn==expsignIn;
					
					
					String actResult=Boolean.toString(actMethod);
					String expResult="true";
					//excelReader.setCellData(xlfile, xlSheetName, 161, 8, actResult);
					
					System.out.println("Logout Screen Options Value Actual         : " + actResult            + " Value Expected : " + expResult);
					
					if(actResult.equalsIgnoreCase(expResult))
					{
						excelReader.setCellData(xlfile, xlSheetName, 160, 9, resPass);
					    return true;			 
					}
					else
					{
						excelReader.setCellData(xlfile, xlSheetName, 160, 9, resFail);
						return false;
				    }
			}
			  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	public SmokeAcctsCustomizationPage(WebDriver driver)
	{
	    PageFactory.initElements(driver, this);	
	}
		
	
	
}
