package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class SmokeMasterAuthorizationDefinitionPage extends BaseEngine
{            
	
	//Setting Master Authorization	[Master Authorization---MasterAuthor]
		
	@FindBy(xpath="//*[@id='id_Authorization_container']/div/div/nav/div[1]/a/div/span[2]")
	public static WebElement masterAuthorLabel; 
		
	@FindBy(xpath="//input[@id='txtDoc']")
	public static WebElement masterDropdown; 	
	
		@FindBy(xpath="//li[contains(text(),'Account')]")
		public static WebElement account; 	
			
		@FindBy(xpath="//li[contains(text(),'Item')]")
		public static WebElement item; 	
			
		@FindBy(xpath="//li[contains(text(),'Department')]")
		public static WebElement department; 	
			
		@FindBy(xpath="//li[contains(text(),'Warehouse')]")
		public static WebElement warehouse; 	
			
		@FindBy(xpath="//li[contains(text(),'Cost Center')]")
		public static WebElement costCenter; 	
			
		@FindBy(xpath="//li[contains(text(),'Location')]")
		public static WebElement location; 	
			
		@FindBy(xpath="//li[contains(text(),'Region')]")
		public static WebElement region; 	
			
		@FindBy(xpath="//li[contains(text(),'Country')]")
		public static WebElement country; 	
			
		@FindBy(xpath="//li[contains(text(),'State')]")
		public static WebElement state; 	
			
		@FindBy(xpath="//li[contains(text(),'City')]")
		public static WebElement city; 	
			
		@FindBy(xpath="//li[contains(text(),'Units')]")
		public static WebElement units; 	
			
		@FindBy(xpath="//li[contains(text(),'Bins')]")
		public static WebElement bins; 	
			
		@FindBy(xpath="//li[contains(text(),'Tax Code')]")
		public static WebElement taxCode; 	
			
		@FindBy(xpath="//li[contains(text(),'Plant')]")
		public static WebElement plant; 	
			
		@FindBy(xpath="//li[contains(text(),'Supply Area')]")
		public static WebElement supplyArea; 	
			
		@FindBy(xpath="//li[contains(text(),'Maintenance Parameter')]")
		public static WebElement maintenanceParameter; 	
			
		@FindBy(xpath="//li[contains(text(),'Safety Instructions')]")
		public static WebElement safetyInstructions; 	
			
		@FindBy(xpath="//li[contains(text(),'Work Center')]")
		public static WebElement workCenter; 	
			
		@FindBy(xpath="//li[contains(text(),'Capacity')]")
		public static WebElement capacity; 	
			
		@FindBy(xpath="//li[contains(text(),'Holiday')]")
		public static WebElement holiday; 	
			
		@FindBy(xpath="//li[contains(text(),'Process')]")
		public static WebElement process; 	
			
		@FindBy(xpath="//li[contains(text(),'Qc failure reason')]")
		public static WebElement qcFailureReason; 	
			
		@FindBy(xpath="//li[contains(text(),'QC Parameters')]")
		public static WebElement qcParameters; 	
			
		@FindBy(xpath="//li[contains(text(),'Insurance')]")
		public static WebElement insurance; 	
			
		@FindBy(xpath="//li[contains(text(),'Fixed Asset')]")
		public static WebElement fixedAsset; 	
			
		@FindBy(xpath="//li[contains(text(),'Break down standard reason')]")
		public static WebElement breakDownStandardReason; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[27]")
		public static WebElement employee; 	
			
		@FindBy(xpath="//li[contains(text(),'Designation')]")
		public static WebElement designation; 	
			
		@FindBy(xpath="//li[contains(text(),'Position')]")
		public static WebElement position; 	
			
		@FindBy(xpath="//li[contains(text(),'Qualification')]")
		public static WebElement qualification; 	
			
		@FindBy(xpath="//li[contains(text(),'Specialization')]")
		public static WebElement specialization; 	
			
		@FindBy(xpath="//li[contains(text(),'Nationality')]")
		public static WebElement nationality; 	
			
		@FindBy(xpath="//li[contains(text(),'Skill Type')]")
		public static WebElement skillType; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[34]")
		public static WebElement skill; 	
			
		@FindBy(xpath="//li[contains(text(),'SourceType')]")
		public static WebElement sourceType; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[36]")
		public static WebElement source; 	
			
		@FindBy(xpath="//li[contains(text(),'RoundType')]")
		public static WebElement roundType; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[38]")
		public static WebElement grade; 	
			
		@FindBy(xpath="//li[contains(text(),'Scale')]")
		public static WebElement scale; 	
			
		@FindBy(xpath="//li[contains(text(),'Course Type')]")
		public static WebElement courseType; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[41]")
		public static WebElement course; 	
			
		@FindBy(xpath="//li[contains(text(),'Trainer')]")
		public static WebElement trainer; 	
			
		@FindBy(xpath="//li[contains(text(),'Airline Sector')]")
		public static WebElement airlineSector; 	
			
		@FindBy(xpath="//li[contains(text(),'Venue')]")
		public static WebElement venue; 	
			
		@FindBy(xpath="//li[contains(text(),'Request Types')]")
		public static WebElement requestTypes; 	
			
		@FindBy(xpath="//li[contains(text(),'Expense Claims')]")
		public static WebElement expenseClaims; 	
			
		@FindBy(xpath="//li[contains(text(),'Employee Bank')]")
		public static WebElement employeeBank; 	
			
		@FindBy(xpath="//li[contains(text(),'Travel Agent')]")
		public static WebElement travelAgent; 	
			
		@FindBy(xpath="//li[contains(text(),'Job Grade')]")
		public static WebElement jobGrade; 	
			
		@FindBy(xpath="//li[contains(text(),'Outlet')]")
		public static WebElement outlet; 	
			
		@FindBy(xpath="//li[contains(text(),'Counter')]")
		public static WebElement counter; 	
			
		@FindBy(xpath="//li[contains(text(),'Member Type')]")
		public static WebElement memberType; 	
			
		@FindBy(xpath="//li[contains(text(),'Gift Voucher Definition')]")
		public static WebElement giftVoucherDefinition; 	
			
		@FindBy(xpath="//li[contains(text(),'Category')]")
		public static WebElement category; 	
			
		@FindBy(xpath="//li[contains(text(),'Bank Card Type')]")
		public static WebElement bankCardType; 	
			
		@FindBy(xpath="//*[@id='MasterMenu']/li[56]")
		public static WebElement member; 	
			
		@FindBy(xpath="//li[contains(text(),'Discount Voucher Definition')]")
		public static WebElement discountVoucherDefinition; 	
			
		@FindBy(xpath="//li[contains(text(),'Floor')]")
		public static WebElement floor; 	
			
		@FindBy(xpath="//li[contains(text(),'Section')]")
		public static WebElement section; 	
			
		@FindBy(xpath="//li[contains(text(),'Table')]")
		public static WebElement table; 	
			
		@FindBy(xpath="//li[contains(text(),'Guest')]")
		public static WebElement guest; 	
			
		@FindBy(xpath="//li[contains(text(),'Void Remarks')]")
		public static WebElement voidRemarks; 	
			
		@FindBy(xpath="//li[contains(text(),'Member Card Definition')]")
		public static WebElement memberCardDefinition; 	
			
		@FindBy(xpath="//li[contains(text(),'Return Remarks')]")
		public static WebElement returnRemarks; 	
			
		@FindBy(xpath="//li[contains(text(),'Kitchen Display System')]")
		public static WebElement kitchenDisplaySystem; 	
			
		@FindBy(xpath="//li[contains(text(),'Delivery Time Interval')]")
		public static WebElement deliveryTimeInterval; 	
			
		@FindBy(xpath="//li[contains(text(),'E- Payment')]")
		public static WebElement ePayment; 	

		
	//Name Fields		
	@FindBy(xpath="//*[@id='ctrlAuthorizationH']")
	public static WebElement nameTxt; 	
		
	@FindBy(xpath="//*[@id='ctrlAuthorizationH_input_settings']/span")
	public static WebElement nameSettingBtn; 	

	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_heading']")
	    public static WebElement nameSettingPop_CustomizeDisplayColoumnLabel;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_container']")
	    public static WebElement nameSettingPop_sAuthorizationTxt;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[1]")
	    public static WebElement nameSettingPop_StandardFieldsBtn;
	
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_list']")
		    public static WebElement nameSettingPop_StandardFields_FiledDropdown;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_header']")
		    public static WebElement nameSettingPop_StandardFields_HeaderTxt;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_alignment']")
		    public static WebElement nameSettingPop_StandardFields_AlignmentDropdown;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_width']")
		    public static WebElement nameSettingPop_StandardFields_WidthTxt;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[3]")
			public static WebElement nameSettingPop_StandardFields_OkBtn;
			
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[4]")
			public static WebElement nameSettingPop_StandardFields_CancelBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[2]")
	    public static WebElement nameSettingPop_DeleteColoumnBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[3]")
	    public static WebElement nameSettingPop_OkBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[4]")
	    public static WebElement nameSettingPop_CancelBtn;
	
	
	@FindBy(xpath="//*[@id='chkActive']")
	public static WebElement activeChkBox;  
	
	@FindBy(xpath="//*[@id='chkAlwaysauthorizationstartsfromfirstlevel']")
	public static WebElement alwaysauthorizationstartsfromfirstlevelChkBox; 
		
	
	//Master Authorization Clear,Delete,Save,Cancel
	@FindBy(xpath="//*[@id='ulAuthBtns']/li[1]/span/i")
	public static WebElement clearbtn; 
	
	@FindBy(xpath="//*[@id='spndeleteProfile']/i")
	public static WebElement deleteBtn; 
	
	@FindBy(xpath="//*[@id='btnSaveAuthorization']/i")
	public static WebElement saveBtn; 
	
	@FindBy(xpath="//*[@id='ulAuthBtns']/li[5]/span/i")
	public static WebElement cancelBtn; 
		
	
	//Action On Initial Rejection
	@FindBy(xpath="//*[@id='ddlAuthStatus']")
	public static WebElement statusDropdown; 	
	
	@FindBy(xpath="//*[@id='chkSuspendCreditLimit']")
	public static WebElement suspendedCreditLimitChkBox;
	
	@FindBy(xpath="//*[@id='spnAddLevel']/i")
	public static WebElement addLevelBtn; 
	
	@FindBy(xpath="//*[@id='spnAddParallel']/i")
	public static WebElement addParallelBtn;    
		
	@FindBy(xpath="//i[@id='id_StartNode']")//*[@id="id_StartNode"]
	public static WebElement startPointBtn; 
	
	//After Clicking On AddLevel/Add Parallel Button The Authorization Definition POp Rises--Related Fields 
	@FindBy(xpath="//*[@id='id_report_popup_heading']")
	public static WebElement authorizationDefinitionLabel; 

		
	//Description Fields
	@FindBy(xpath="//*[@id='txtDescription']")
	public static WebElement descriptionTxt; 
		
	@FindBy(xpath="//*[@id='chkConditionNotRequired']")
	public static WebElement conditionNotRequiredChkBox; 
	
	@FindBy(xpath="//*[@id='chkCreditLimitExceeded']")
	public static WebElement creditLimitExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkBudgetExceeded']")
	public static WebElement budgetExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkNegativeCashCheck']")
	public static WebElement negativeCashCheckChkBox; 
		
	@FindBy(xpath="//*[@id='chkLineWiseAuthorization']")
	public static WebElement lineWiseAuthorizationChkBox; 
		
	@FindBy(xpath="//*[@id='chkCreditDaysExceeded']")
	public static WebElement creditDaysExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkNegativeStockCheck']")
	public static WebElement negativeStockCheckChkBox; 
		
	@FindBy(xpath="//*[@id='chkDateRange']")
	public static WebElement dateRangeChkBox; 
		
	@FindBy(xpath="//*[@id='dpFromDate']")
	public static WebElement fromDateTxt; 
		
	@FindBy(xpath="//*[@id='dpToDate']")
	public static WebElement toDateTxt; 
	
	@FindBy(xpath="//*[@id='chkTimeRange']")
	public static WebElement timeRangeChkBox;
		
	@FindBy(xpath="//*[@id='tpFromTime']")
	public static WebElement fromTimeTxt; 
		
	@FindBy(xpath="//*[@id='tpToTime']")
	public static WebElement totimeTxt; 
	
	
	//Condition Condition Fields
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[1]/select")
	public static WebElement conjunctionDropdown; 
		
	@FindBy(xpath="//tbody//input[@placeholder='Select Field']")
	public static WebElement selectFieldTxt; 

    //Selection Field  Inner Fields
	@FindBy(xpath="//ul[@class='treeview filtertreedata col-xs-12']//a[@id='5002']")
	public static WebElement sName;
	
	@FindBy(xpath="//*[@id='5003']")
	public static WebElement sCode;
	
	@FindBy(xpath="//*[@id='5004']")
	public static WebElement iAccountType;
	
	@FindBy(xpath="//*[@id='5005']")
	public static WebElement fCreditLimit;
	
	@FindBy(xpath="//*[@id='5006']")
	public static WebElement iCreditDays;
	
	@FindBy(xpath="//*[@id='300012']")
	public static WebElement iDebitCreditProposal;
	
	@FindBy(xpath="//*[@id='300013']")
	public static WebElement iDebitCreditRequired;
	
	@FindBy(xpath="//*[@id='300014']")
	public static WebElement iExchangeAdjustmentGainAC;
	
	@FindBy(xpath="//*[@id='300015']")
	public static WebElement iExchangeAdjustmentLossAC;
	
	@FindBy(xpath="//*[@id='300016']")
	public static WebElement iPrimaryAccount;
	
	@FindBy(xpath="//*[@id='300018']")
	public static WebElement iConsolidationMethod;
	
	@FindBy(xpath="//*[@id='300023']")
	public static WebElement sAddress;
	
	@FindBy(xpath="//*[@id='300024']")
	public static WebElement sDeliveryAddress;
	
	@FindBy(xpath="//*[@id='300027']")
	public static WebElement sPin;
	
	@FindBy(xpath="//*[@id='300028']")
	public static WebElement sDeliveryPin;
	
	@FindBy(xpath="//*[@id='300083']")
	public static WebElement iCity;
	
	@FindBy(xpath="//*[@id='300084']")
	public static WebElement iDeliveryCity;
	
	@FindBy(xpath="//*[@id='300249']")
	public static WebElement sEmail;
	
	@FindBy(xpath="//*[@id='300250']")
	public static WebElement bSendEmailtocustomer;
	
	@FindBy(xpath="//*[@id='302774']")
	public static WebElement fChequeDiscountLimit;
	
	@FindBy(xpath="//*[@id='302870']")
	public static WebElement fRateofinterest;
	
	@FindBy(xpath="//*[@id='302968']")
	public static WebElement iBankAC;
	
	@FindBy(xpath="//*[@id='303573']")
	public static WebElement sTelNo;
	
	@FindBy(xpath="//*[@id='303574']")
	public static WebElement sFaxNo;
	
	@FindBy(xpath="//*[@id='303785']")
	public static WebElement sPassword;
	
	@FindBy(xpath="//*[@id='303786']")
	public static WebElement bAllowCustomerPortal;
	
	@FindBy(xpath="//*[@id='303935']")
	public static WebElement sBankAccountName;
	
	@FindBy(xpath="//*[@id='303936']")
	public static WebElement sBankAccountNumber;
	
	@FindBy(xpath="//*[@id='303937']")
	public static WebElement sIFSCCode;
	
	@FindBy(xpath="//*[@id='304047']")
	public static WebElement iPaymentType;
	
	@FindBy(xpath="//*[@id='304157']")
	public static WebElement iPDCDiscountedAC;
	
	@FindBy(xpath="//*[@id='304269']")
	public static WebElement sFinanceEmail;
	
	@FindBy(xpath="//*[@id='304379']")
	public static WebElement sPortalEmail;
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[3]/select")
	public static WebElement selectOperatorDropdown; 
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[4]/select")
	public static WebElement compareWithDropdown; 
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[5]/input")
	public static WebElement valueTxt;
	
	@FindBy(xpath="//select[@id='advancefilter_SelectOptionControl_67_0']")
	public static WebElement valueDropdown;
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[6]/span")
	public static WebElement deleteRow1Btn; 
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr/td[7]/span")
	public static WebElement addRowBtn; 
		
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr[2]/td[6]/span")
	public static WebElement deleteSecondRowBtn; 
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr[2]/td[1]/select")
	public static WebElement conjunctionDropdown2; 
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr[2]/td[2]")
	public static WebElement selectFieldTxt2; 
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr[2]/td[3]/select")
	public static WebElement selectOperatorDropdown2; 
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter_']/table/tbody/tr[2]/td[4]/select")
	public static WebElement comparewithDropdown2; 
	
	@FindBy(xpath="//*[@id='67_0_AdvanceFilter']/table/tbody/tr[2]/td[5]/input")
	public static WebElement valueTxt2; 
	
	@FindBy(xpath="//*[@id='advancefilter_SelectOptionControl_67_0']")
	public static WebElement valueDropdown2; 
	
	//On Entry
	@FindBy(xpath="//select[@id='ddlStatus']")
	public static WebElement actionOnEntryStatusDropdown; 	
		
	//Authorization Mode
	@FindBy(xpath="//*[@id='chkFullAuthorization']")
	public static WebElement fullAuthorizationChkBox; 	
	
	//Undo AuthorizationOn Editing
	@FindBy(xpath="//*[@id='ddlUndoAuthEditing']")
	public static WebElement undoAuthEditingDropdown; 	
	
	

	
	@FindBy(xpath="//*[@id='ddlUserSelection']")
	public static WebElement userselectionDropdown;
	
	@FindBy(xpath="//*[@id='ddlCriteria']")
	public static WebElement criteriaDropdown;
	
	// Grid
	@FindBy(xpath="//*[@id='id_tblUserSelection_User']")
	public static WebElement userdropdown; 	
	
	@FindBy(xpath="//*[@id='id_tblUserSelection_col_1-1']")
	public static WebElement userrow1;
		
	@FindBy(xpath="//*[@id='id_tblUserSelection_col_2-1']")
	public static WebElement userrow2; 
	
	//Alert Tab Fields
		
		
	//Grid
	@FindBy(xpath="//*[@id='chkReceived']")
	public static WebElement receivedChkBox;	
		
	@FindBy(xpath="//*[@id='chkApproved']")
	public static WebElement approvedChkBox;	
		
	@FindBy(xpath="//*[@id='chkRejected']")
	public static WebElement rejectedChkBox;	
		
	@FindBy(xpath="//*[@id='chkStopped']")
	public static WebElement stoppedChkBox;	
	
	//EmailHeaderTemplate
	@FindBy(xpath="//*[@id='id_tblAlerts_control_heading_2']/div/u")
	public static WebElement emailHeaderTemplateBtn;	
	
		@FindBy(xpath="//*[@id='id_SMSTemplate']/div/nav/div/div[1]/a/div/span[2]")
		public static WebElement emailHeaderTemplate_CustomizeTemplateLabel;	
		
	//Header Fields Of Customize Template Pop
	@FindBy(xpath="//*[@id='btnNewSmsTemplate']")
	public static WebElement customizeTemplateNewBtn;	
	
	@FindBy(xpath="//*[@id='btnSaveSmsTemplate']")
	public static WebElement customizeTemplateSaveBtn;	
		
	@FindBy(xpath="//*[@id='btnCloseSMSModal']")
	public static WebElement customizeTemplateCloseBtn;	
		
	@FindBy(xpath="//*[@id='smsTemplateOptCtrl']")
	public static WebElement customizeTemplateTemplatestxt;	
		
	@FindBy(xpath="//*[@id='smsTemplateOptCtrl_input_settings']/span")
	public static WebElement customizeTemplate_TemplatesSettingBtn;	
	
	
		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_heading']")
		public static WebElement templateSettingPop_CustomizeDisplayColoumnLabel;
		         
		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_container']")
		public static WebElement templateSettingPop_sTemplateNameTxt;

		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[1]")
		public static WebElement templateSettingPop_StandardFieldsBtn;

			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_list']")
		    public static WebElement templateSettingPop_StandardFields_FiledDropdown;
		
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_header']")
		    public static WebElement templateSettingPop_StandardFields_HeaderTxt;
		
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_alignment']")
		    public static WebElement templateSettingPop_StandardFields_AlignmentDropdown;
		
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_width']")
		    public static WebElement templateSettingPop_StandardFields_WidthTxt;
		
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[3]")
			public static WebElement templateSettingPop_StandardFields_OkBtn;
			
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[4]")
			public static WebElement templateSettingPop_StandardFields_CancelBtn;

		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[2]")
		public static WebElement templateSettingPop_DeleteColoumnBtn;

		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[3]")
		public static WebElement templateSettingPop_OkBtn;

		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[4]")
		public static WebElement templateSettingPop_CancelBtn;
		
	//Email Template Tab			
	//Header Fields
	@FindBy(xpath="//u[contains(text(),'Email Template')]")
	public static WebElement emailTemplateBtn;				
				
	@FindBy(xpath="//*[@id='forHf']/span[1]/span/i[1]")
	public static WebElement emailTemplateNewBtn;	
	
	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	public static WebElement  newdropdown;
	
	@FindBy(xpath="//*[@id='forHf']/span[1]/ul/li/a[1]")
	public static WebElement  new_LayoutBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[1]/ul/li/a[2]")
	public static WebElement  new_PageBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-open']")
	public static WebElement  opendropdown;
	
	@FindBy(xpath="//*[@id='forHf']/span[2]/ul/li/a[1]")
	public static WebElement  openBtn;

	   //Pop
	    @FindBy(xpath="//*[@id='1']")
	    public static WebElement  open_Selct1Option;
	
	    @FindBy(xpath="//button[@id='btn_PopUpOk']")
		public static WebElement  openBtn_OkBtn;
		
		@FindBy(xpath="//div[@id='id_PopUp']//button[@class='Fbutton'][contains(text(),'Cancel')]")
		public static WebElement  openBtn_CancelBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[2]/ul/li/a[2]")
	public static WebElement fromXMLBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-save']")
	public static WebElement  savedropdown;

		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[1]")
		public static WebElement  emailPrintSaveBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[2]")
		public static WebElement  saveAsBtn; 
		
		@FindBy(xpath="//input[@id='id_PopuplayoutName']")
		public static WebElement  saveTxtField;
		
		@FindBy(xpath="//input[@id='id_PopuplayoutName']")
		public static WebElement  save_OkBtn;
		
		@FindBy(xpath="//*[@id='id_PopUp']/div/div/div[3]/button[2]")
		public static WebElement  save_CancekBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[3]")
		public static WebElement  saveAsImageBtn; //No Response
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[4]")
		public static WebElement  saveAsXMLBtn; // Downloads xml file
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[5]")
		public static WebElement  saveAsHTMLBtn; 

	@FindBy(xpath="//*[@id='forHf']/span[4]")
	public static WebElement  removedropdown;

		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[1]")
		public static WebElement  removeBtn;  
		
		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[2]")
		public static WebElement  removeCurrentPageBtn; 
                          
		/*//popup Error MEssage 
		@FindBy(xpath="//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[1]")
		public static WebElement  newerrorMessage;//This Is only Page.You Not Delete this Page --Message while using RemovecurrentPAgeBtn 
*/		
		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[3]")
		public static WebElement  removeControlBtn;				

	@FindBy(xpath="//*[@id='forHf']/span[5]")
	public static WebElement  pageNo;
	
	@FindBy(xpath="//*[@id='forHf']/span[6]")
	public static WebElement  controldrpdown;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[1]")
		public static WebElement  staticTextBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[2]")
		public static WebElement  bitmapBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[3]")
		public static WebElement  bodyGridBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[4]")
		public static WebElement  rectangleBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[5]")
		public static WebElement  ecllipseBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[6]")
		public static WebElement  lineBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[7]")
		public static WebElement  areaBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[8]")
		public static WebElement  tableBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[9]")
		public static WebElement  approvalHistoryBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[7]/span/i[1]")
	public static WebElement  alignmentdropdown;
		
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[1]")
		public static WebElement  leftAlignmentBtn;
					
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[2]")
		public static WebElement  rightAlignmentBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[3]")
		public static WebElement  topAlignmentBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[4]")
		public static WebElement  bottomAlignmentBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[8]")
	public static WebElement  sizedropdown;

		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[1]")
		public static WebElement  sameSizeBtn;
					
		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[2]")
		public static WebElement  sameWidthBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[3]")
		public static WebElement  sameHeightBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[9]")
	public static WebElement  printdropdown;
	
	@FindBy(xpath="//*[@id='menu-print']")
	public static WebElement  print_PrintBtn;
					
		@FindBy(xpath="//*[@id='menu-preview']	")
		public static WebElement  print_PreviewBtn;
		
		@FindBy(xpath="//*[@id='fit-button']")
		public static WebElement  preview_FitToWidthBtn;
		
		@FindBy(xpath="//*[@id='zoom-in-button']")
		public static WebElement  previewZ_ZoomInBtn;
		
		@FindBy(xpath="//*[@id='zoom-out-button']")
		public static WebElement  preview_ZoomOutBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[9]/ul/li/a[3]")
		public static WebElement  pageSetUpBtn;
		
		@FindBy(xpath="//*[@id='id_PageSetUpPreview']")
		public static WebElement  pageSetupPagePreviewField;
		
		@FindBy(xpath="//*[@id='id_PageType']")
		public static WebElement  pageSetupPaperSizedropdown;
		
		@FindBy(xpath="//*[@id='id_PaperOrientation'][@value='0']")
		public static WebElement  pageSetupPotraitRadio;
		
		@FindBy(xpath="//*[@id='id_PaperOrientation'][@value='1']")
		public static WebElement  pageSetupLandScapeRadio;
		
		@FindBy(xpath="//*[@id='id_PaperUnit'][@value='0']")
		public static WebElement  pageSetupCentimetersRadio;
		
		@FindBy(xpath="//*[@id='id_PaperUnit'][@value='1']")
		public static WebElement  pageSetupInchesRadio;
		
		@FindBy(xpath="//*[@id='id_PageSizeLeftMarginDisplay']")
		public static WebElement  pageSetupLeftTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeRightMarginDisplay']")
		public static WebElement  pageSetupRightTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeTopMarginDisplay']")
		public static WebElement  pageSetupTopTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeTopMarginDisplay']")
		public static WebElement  pageSetupBottomTxt;
		
		@FindBy(xpath="//*[@id='id_PageSetupOkBtn']")
		public static WebElement  pageSetupOkBtn;
		
		@FindBy(xpath="//*[@id='id_PageSetupCancelBtn']")
		public static WebElement  pageSetUpCancelBtn;
                  
	@FindBy(xpath="//*[@id='id_InvoiceDesingCancel']/i")
	public static WebElement  exitBtn;

    //Header Elements

	
	@FindBy(xpath="//*[@id='li_InvoicePageSetup']/a")
	public static WebElement  headerPageSetUpTab;
	
	@FindBy(xpath="//*[@id='li_InvoiceDesigner']/a")
	public static WebElement headerDesignerTab;
	
	@FindBy(xpath="//*[@id='li_InvoicePreview']/a")
	public static WebElement  headerPreviewTab;

	//Fields  
	
	@FindBy(xpath="//*[@id='LiDesignField']/a")
	public static WebElement  headerFieldsTab;
	
	@FindBy(xpath="//*[@id='LiProp']/a")
	public static WebElement  headerPropertiesTab;

	@FindBy(xpath="//span[contains(text(),'Company')]//i[@class='icon-expand icon-font8']")
	public static WebElement  fields_CompanyExpandBtn;

		@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Company Name')]")
		public static WebElement  fields_Company_CompanyName;
		
		@FindBy(xpath="//span[contains(text(),'Company Code')]")
		public static WebElement  fields_Company_CompanyCode;
		
		@FindBy(xpath="//span[contains(text(),'Accounting Date')]")
		public static WebElement  fields_Company_AccountingDate;
		
		@FindBy(xpath="//span[contains(text(),'Address1')]")
		public static WebElement  fields_Company_Address1;
		
		@FindBy(xpath="//span[contains(text(),'Address2')]")
		public static WebElement  fields_Company_Address2;
		
		@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'City')]")
		public static WebElement  fields_Company_City;
		
		@FindBy(xpath="//span[contains(text(),'Zip Code')]")
		public static WebElement  fields_Company_Zipcode;
		
		@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Country')]")
		public static WebElement  fields_Company_Country;
		
		@FindBy(xpath="//span[contains(text(),'Phone No1')]")
		public static WebElement  fields_Company_PhoneNumber1;
		
		@FindBy(xpath="//span[contains(text(),'Phone No2')]")
		public static WebElement  fields_Company_PhoneNumber2;
		
		@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Fax')]")
		public static WebElement  fields_Company_Fax;
		
		@FindBy(xpath="//span[contains(text(),'Tax Registration Number')]")
		public static WebElement  fields_Company_TaxRegestrationNumber;
		
		@FindBy(xpath="//span[contains(text(),'Excise Registration Number')]")
		public static WebElement  fields_Company_ExciseRegistrationNumber;
		
	@FindBy(xpath="//span[contains(text(),'Master Fields')]//i[@class='icon-expand icon-font8']")
	public static WebElement fields_MasterFieldsExpandBtn; 	
	                       
		@FindBy(xpath="//span[contains(text(),'sName')]")
		public static WebElement fields_sName; 	
			
		@FindBy(xpath="//span[contains(text(),'sCode')]")
		public static WebElement fields_sCode; 	
			
		@FindBy(xpath="//span[contains(text(),'iAccountType')]")
		public static WebElement fields_iAccountType; 	
			
		@FindBy(xpath="//span[contains(text(),'fCreditLimit')]")
		public static WebElement fields_fCreditLimit; 	
			
		@FindBy(xpath="//span[contains(text(),'iCreditDays')]")
		public static WebElement fields_iCreditDays; 	
			
		@FindBy(xpath="//span[contains(text(),'iDebitCreditProposal')]")
		public static WebElement fields_iDebitCreditProposal; 	
			
		@FindBy(xpath="//span[contains(text(),'iDebitCreditRequired')]")
		public static WebElement fields_iDebitCreditRequired; 	
			
		@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentGainAC')]")
		public static WebElement fields_iExchangeAdjustmentGainAC; 	
			
		@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentLossAC')]")
		public static WebElement fields_iExchangeAdjustmentLossAC; 	
			
		@FindBy(xpath="//span[contains(text(),'iPrimaryAccount')]")
		public static WebElement fields_iPrimaryAccount; 	
			
		@FindBy(xpath="//span[contains(text(),'iDefaultCurrency')]")
		public static WebElement fields_iDefaultCurrency; 	
			
		@FindBy(xpath="//span[contains(text(),'iConsolidationMethod')]")
		public static WebElement fields_iConsolidationMethod; 	
			
		@FindBy(xpath="//span[contains(text(),'iPaymentTerms')]")
		public static WebElement fields_iPaymentTerms; 	
			
		@FindBy(xpath="//span[contains(text(),'iReminderTerms')]")
		public static WebElement fields_iReminderTerms; 	
			
		@FindBy(xpath="//span[contains(text(),'iFinanceChargeTerms')]")
		public static WebElement fields_iFinanceChargeTerms; 	
			
		@FindBy(xpath="//span[contains(text(),'sAddress')]")
		public static WebElement fields_sAddress; 	
			
		@FindBy(xpath="//span[contains(text(),'sDeliveryAddress')]")
		public static WebElement fields_sDeliveryAddress; 	
			
		@FindBy(xpath="//span[contains(text(),'sPin')]")
		public static WebElement fields_sPin; 	
			
		@FindBy(xpath="//span[contains(text(),'sDeliveryPin')]")
		public static WebElement fields_sDeliveryPin; 	
			
		@FindBy(xpath="//span[contains(text(),'iCity')]")
		public static WebElement fields_iCity; 	
			
		@FindBy(xpath="//span[contains(text(),'iDeliveryCity')]")
		public static WebElement fields_iDeliveryCity; 	
			
		@FindBy(xpath="//span[contains(text(),'sEMail')]")
		public static WebElement fields_sEmail; 	
			
		@FindBy(xpath="//span[contains(text(),'bSendEmailtocustomer')]")
		public static WebElement fields_bSendEmailtocustomer; 	
			
		@FindBy(xpath="//span[contains(text(),'fChequeDiscountLimit')]")
		public static WebElement fields_fChequeDiscountLimit; 	
			
		@FindBy(xpath="//span[contains(text(),'fRateofinterest')]")
		public static WebElement fields_fRateofinterest; 	
			
		@FindBy(xpath="//span[contains(text(),'iBankAc')]")
		public static WebElement fields_iBankAc; 	
			
		@FindBy(xpath="//span[contains(text(),'sTelNo')]")
		public static WebElement fields_sTelNo; 	
			
		@FindBy(xpath="//span[contains(text(),'sFaxNo')]")
		public static WebElement fields_sFaxNo; 	
			
		@FindBy(xpath="//span[contains(text(),'sPassword')]")
		public static WebElement fields_sPassword; 	
			
		@FindBy(xpath="//span[contains(text(),'bAllowCustomerPortal')]")
		public static WebElement fields_bAllowCustomerPortal; 	
			
		@FindBy(xpath="//span[contains(text(),'sBankAccountName')]")
		public static WebElement fields_sBankAccountName; 	
			
		@FindBy(xpath="//span[contains(text(),'sBankAccountNumber')]")
		public static WebElement fields_sBankAccountNumber; 	
			
		@FindBy(xpath="//span[contains(text(),'sIFSCCode')]")
		public static WebElement fields_sIFSCCode; 	
			
		@FindBy(xpath="//span[contains(text(),'iPaymentType')]")
		public static WebElement fields_iPaymentType; 	
			
		@FindBy(xpath="//span[contains(text(),'iPDCDiscountedAC')]")
		public static WebElement fields_iPDCDiscountedAC; 	
			
		@FindBy(xpath="//span[contains(text(),'sFinanceEmail')]")
		public static WebElement fields_sFinanceEmail; 	
			
		@FindBy(xpath="//span[contains(text(),'sPortalEmail')]")
		public static WebElement fields_sPortalEmail; 	
		
		
	//UserDetails
	@FindBy(xpath="//span[contains(text(),'User details')]//i[@class='icon-expand icon-font8']")
	public static WebElement  fields_UserDetailsExpandBtn;	

		@FindBy(xpath="//li[@class='treeview active']//li[1]//a[1]//span[1]")
		public static WebElement userDetails_UserName;
		
		@FindBy(xpath="//li[@class='treeview active']//li[2]//a[1]//span[1]")
		public static WebElement userDetails_MobileNumber;
		
		@FindBy(xpath="//li[@class='treeview active']//li[3]//a[1]//span[1]")
		public static WebElement userDetails_PhoneNumber;
		
		@FindBy(xpath="//li[@class='treeview active']//li[4]//a[1]//span[1]")
		public static WebElement userDetails_EmailId;
		
		@FindBy(xpath="//li[@class='treeview active']//li[5]//a[1]//span[1]")
		public static WebElement userDetails_Signature;
		
		@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Employee')]")
		public static WebElement userDetails_Employee;
		
		@FindBy(xpath="//li[@class='treeview active']//li[7]//a[1]//span[1]")
		public static WebElement userDetails_AuthoriseUserName;
		
		@FindBy(xpath="//span[contains(text(),'Authorise User Mobile number')]")
		public static WebElement userDetails_AuthoriseUserMobileNumber;
		
		@FindBy(xpath="//span[contains(text(),'Authorise User Phone number')]")
		public static WebElement userDetails_AuthoriseUserPhoneNumber;
		
		@FindBy(xpath="//span[contains(text(),'Authorise User E-Mail Id')]")
		public static WebElement userDetails_AuthoriseUserEmailId;
		
		@FindBy(xpath="//span[contains(text(),'Authorise User Signature')]")
		public static WebElement userDetails_AuthoriseUserSignature;
		
		@FindBy(xpath="//span[contains(text(),'Authorise by')]")
		public static WebElement userDetails_AuthoriseBy;
		
		@FindBy(xpath="//span[contains(text(),'Next Authorise User name')]")
		public static WebElement userDetails_NextAuthoriseUserName;
		
		@FindBy(xpath="//span[contains(text(),'Next User Mobile number')]")
		public static WebElement userDetails_NextUserMobileNumber;
		
		@FindBy(xpath="//span[contains(text(),'Next User Phone number')]")
		public static WebElement userDetails_NextUserPhoneNumber;
		
		@FindBy(xpath="//span[contains(text(),'Next User E-Mail Id')]")
		public static WebElement userDetails_NextUserEmailId;
		
		@FindBy(xpath="//span[contains(text(),'Next User Signature')]")
		public static WebElement userDetails_NextUserSignature;
		
		@FindBy(xpath="//span[contains(text(),'Created by signature')]")
		public static WebElement userDetails_CreatedBySignature;
		               
		@FindBy(xpath="//span[contains(text(),'Modified by signature')]")
		public static WebElement userDetails_ModifiedBySignature;


  //Miscellaneous 
  @FindBy(xpath="//span[contains(text(),'Miscellaneous')]//i[@class='icon-expand icon-font8']")
  public static WebElement  fields_MiscellaneousExpandBtn;

	@FindBy(xpath="//span[contains(text(),'Login date')]")
	public static WebElement miscellaneous_Logindate;
	
	@FindBy(xpath="//span[contains(text(),'Page Number')]")
	public static WebElement miscellaneous_PageNumber;
	
	@FindBy(xpath="//span[contains(text(),'Print Date')]")
	public static WebElement miscellaneous_Printdate;
	
	@FindBy(xpath="//span[contains(text(),'Print Time')]")
	public static WebElement miscellaneous_PrintTime;
	
	@FindBy(xpath="//span[contains(text(),'Total Page')]")
	public static WebElement miscellaneous_TotalPage;
	
	@FindBy(xpath="//span[contains(text(),'S.No')]")
	public static WebElement miscellaneous_Sno;
	
	@FindBy(xpath="//span[contains(text(),'Page Type')]")
	public static WebElement miscellaneous_PageType;
	
	@FindBy(xpath="//span[contains(text(),'Ageing details')]")
	public static WebElement miscellaneous_AgeingDetails;
	
	@FindBy(xpath="//span[contains(text(),'Ageing amounts')]")
	public static WebElement miscellaneous_AgeingAmounts;
	
	@FindBy(xpath="//span[contains(text(),'Ageing headings')]")
	public static WebElement miscellaneous_AgeingHeadings;
	
	@FindBy(xpath="//span[contains(text(),'Ageing balance')]")
	public static WebElement miscellaneous_Ageingbalance;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab1')]")
	public static WebElement miscellaneous_AgeingSlab1;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab2')]")
	public static WebElement miscellaneous_AgeingSlab2;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab3')]")
	public static WebElement miscellaneous_AgeingSlab3;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab4')]")
	public static WebElement miscellaneous_AgeingSlab4;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab5')]")
	public static WebElement miscellaneous_AgeingSlab5;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab6')]")
	public static WebElement miscellaneous_AgeingSlab6;
	
	@FindBy(xpath="//span[contains(text(),'Ageing month-wise')]")
	public static WebElement miscellaneous_AgeingMonthWise;


	//'SMS template 
	@FindBy(xpath="//u[contains(text(),'SMS template')]")
	public static WebElement headerSMSTemplateBtn;					
	
	//Pop As Same Above EmailHeaderTemplate
	//Alerts
	@FindBy(xpath="//u[contains(text(),'Alerts')]")
	public static WebElement headerAlert;

	//Pop As Same Above EmailHeaderTemplate
	//Recipient
	@FindBy(xpath="//div[contains(text(),'Recipient')]")
	public static WebElement headerRecipient;					
	
	//Pop As Same Above EmailHeaderTemplate
	//Escalation
	
	
	@FindBy(xpath="//*[@id='spnAddEscalation']/i")
	public static WebElement escalationLevelAddBtn;					
		

	//First Escalation
	@FindBy(xpath="//*[@id='txtTimeLimit1']")
	public static WebElement timelimitTxt1;					
			
	@FindBy(xpath="//*[@id='ddlTimeLimit1']")
	public static WebElement dropdown1;					
			
	@FindBy(xpath="//*[@id='ddlEscalationType1']")
	public static WebElement escalationTypeDropdown1;	
	
	@FindBy(xpath="//*[@id='divEscalation1']/div[1]/div[2]/i[1]")
	public static WebElement minimize1;					
	
	@FindBy(xpath="//*[@id='divEscalation1']/div[1]/div[2]/i[2]")
	public static WebElement close1;					
		
	//Second Escalation
	@FindBy(xpath="//*[@id='txtTimeLimit2']")
	public static WebElement timelimitTxt2;					
			
	@FindBy(xpath="//*[@id='ddlTimeLimit2']")
	public static WebElement dropdown2;					
			
	@FindBy(xpath="//*[@id='ddlEscalationType2']")
	public static WebElement escalationTypeDropdown2;	
	
	@FindBy(xpath="//*[@id='divEscalation2']/div[1]/div[2]/i[1]")
	public static WebElement minimize2;					
	
	@FindBy(xpath="//*[@id='divEscalation2']/div[1]/div[2]/i[2]")
	public static WebElement close2;				



	@FindBy(xpath="//*[@id='68']/span")
	public static WebElement  transactionAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='235']/span")
	public static WebElement  pricebookAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='19']/span")
	public static WebElement  configureMastersBtn;
	
	@FindBy(xpath="//*[@id='67']/span")
	public static WebElement  masterAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='69']/span")
	public static WebElement  creditLimitAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='74']/span")
	public static WebElement  designWorkflowBtn;
	
	@FindBy(xpath="//*[@id='105']/span")
	public static WebElement  settingsWizardBtn;
	
	@FindBy(xpath="//*[@id='232']/span")
	public static WebElement  batchCodeGenerationBtn;
	
	@FindBy(xpath="//*[@id='34']/span")
	public static WebElement  mapCreditLimitBtn;
	
	@FindBy(xpath="//*[@id='257']/span")
	public static WebElement  vatTaxCodeBtn;
	
	@FindBy(xpath="//*[@id='258']/span")
	public static WebElement  customerPortalAdminBtn;
	
	@FindBy(xpath="//*[@id='3308']/span")
	public static WebElement  budgetAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='3320']/span")
	public static WebElement  paymentGatewayIntegrationBtn;

   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
	public static WebElement userNameDisplay;*/

	
	@FindBy(xpath="//input[@id='donotshow']")
	public static WebElement doNotShowCheckbox;
    
    @FindBy(xpath="//span[@class='pull-right']")
	public static WebElement closeBtnInDemoPopupScreen;
	
	
	 
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
		 

	@FindBy(xpath="//button[contains(text(),'Ok')]")
	public static WebElement loginRefreshOkBtn;
	
	
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

	@FindBy(xpath = "//*[@id='dashName']")
	public static WebElement labelDashboard;

	@FindBy(xpath="//*[@id='navigation_menu']/li/a/div/div")
	public static List<WebElement> menusList;

	public static String xlfile;
	public static String resPass="Pass";
	public static String resFail="Fail";
	public static ExcelReader excelReader;
	
	public static String xlSheetName = "SmokeMasterAuthorization";

	    // Home Menu
		@FindBy(xpath = "//*[@id='1']/div/span")
		public static WebElement homeMenu;

		//Financial Menu
		@FindBy (xpath="//span[@class='icon-financial icon-font1']")
		public static WebElement financialMenu;
		
		//Inventory Menu and Sub Menus		
		@FindBy(xpath="//div[contains(text(),'Inventory')]")
		public static WebElement  inventoryMenu; 
		
		//Fixed Assets Menu
		@FindBy (xpath="//span[@class='icon-assets icon-font1']")
		public static WebElement fixedAssetsMenu;
		
		//Production Menu
		@FindBy (xpath="//span[@class='icon-production icon-font1']")
		public static WebElement productionMenu;
		
		//Point Of Sale Menu
		@FindBy (xpath="//div[contains(text(),'Point of Sale')]")
		public static WebElement pointOfSaleMenu;
		
		//Quality Of Control Menu
		@FindBy (xpath="//span[@class='icon-quotationanalysis icon-font1']")
		public static WebElement qualityControlMenu;
		
		//Settings Menu
		public static int cSize;

	
	 public boolean checkLoginWithValidUserNameAndPasswordToCheckMasterAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {
	     excelReader = new ExcelReader(POJOUtility.getExcelPath());
	     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	   
	     System.out.println("***************** checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage Method Executes.............  *********************");
	     
		 try
		 {	 
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		   		 
	 		getDriver().navigate().refresh();
			Thread.sleep(2000);
			 
			getDriver().navigate().refresh();
			Thread.sleep(4000);
			
			
			getDriver().manage().deleteAllCookies();
			
			
	 		
	 		LoginPage lp=new LoginPage(getDriver()); 
	 		
	        String unamelt                        = excelReader.getCellData(xlSheetName, 141, 6);
	        String pawslt                         = excelReader.getCellData(xlSheetName, 142, 6);
	 		
	        LoginPage.enterUserName(unamelt);
	 		LoginPage.enterPassword(pawslt);
	 		
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
	    
	    }
	 		
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
	 		excelReader.setCellData(xlfile, xlSheetName, 141, 8, elementsIsDisplay);
	 		
	 		int actCount					         = menusList.size();
	 		ArrayList<String> actMenusArray          = new ArrayList<String>();
	 		
	 		for (int j = 0; j < actCount; j++) 
	 		{
	 			String data                          = menusList.get(j).getText();
	 			actMenusArray.add(data);
	 		}

	 		String actMenus 					     = actMenusArray.toString();
	 		String expMenus					         = excelReader.getCellData(xlSheetName, 142, 7);
	 		
	 		System.out.println("Menu Names Text Display Value Actual             : " + actMenus);
	 		System.out.println("Menus Names Text Display Value Expected          : " + expMenus);
	 		excelReader.setCellData(xlfile, xlSheetName, 142, 8, actMenus);
	 			
	 		Thread.sleep(4000);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	 		String actUserInfo                      = userNameDisplay.getText();
	 		String expUserInfo                      = excelReader.getCellData(xlSheetName, 143, 7);	
	 		excelReader.setCellData(xlfile, xlSheetName, 143, 8, actUserInfo);
	 		
	 		System.out.println("User Name Display Value Actual                   : " + actUserInfo +             " Value Expected : " + expUserInfo);
	 		
	 		
	 			
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
	 		companyLogoImg.click();
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
	 		String actGetLoginCompanyNameInformation = companyName.getText();
	 		String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 19);
	 		String expGetLoginCompanyName            = excelReader.getCellData(xlSheetName, 144, 7);
	 		excelReader.setCellData(xlfile, xlSheetName, 144, 8, actGetLoginCompanyName);
	 		companyLogoImg.click();
	 		
	 		System.out.println("Company Name Display Value Actual                : " + actGetLoginCompanyName +  " Value Expected : " + expGetLoginCompanyName);
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
	 		String actDashboardLabel                = dashboardName.getText();
	 		String expDashboardLabel                = excelReader.getCellData(xlSheetName, 145, 7);	
	 		
	 		System.out.println("Dashboard Label Value Actual                     : " + actDashboardLabel +      " Value Expected : " + expDashboardLabel);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 145, 8, actDashboardLabel);
	 		
	 		if (actUserInfo.equalsIgnoreCase(expUserInfo) && actGetLoginCompanyName.equalsIgnoreCase(expGetLoginCompanyName)
	 				&& actDashboardLabel.equalsIgnoreCase(expDashboardLabel)
	 				
	 				&& actDisplayingResult.equalsIgnoreCase("true")
	 				&& actMenus.equalsIgnoreCase(expMenus)) 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 141, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 141, 9, resFail);
	 			return false;
	 		}
	 	}
	 	catch (Exception e) 
	     {
	         excelReader.setExceptionInExcel(xlfile, xlSheetName, 141, 10, e.getMessage());
	         System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	         return false;

	     }
	   }
	   	

	public boolean 	checkOpenMasterAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		try
		{
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
			System.out.println("Setting buton is not enabled");
			serachMenuTextHomePage.click();
			serachMenuTextHomePage.sendKeys("Master Authorization");
			serachMenuTextHomePage.sendKeys(Keys.ENTER);
		
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			
		    boolean actmasterDropdown                       = masterDropdown.isDisplayed();
			boolean actnameTxt                              = nameTxt.isDisplayed();
			boolean actactiveChkBox                         = activeChkBox.isDisplayed();
			boolean actalwaysauthorstartsfirstlevelChkBox   = alwaysauthorizationstartsfromfirstlevelChkBox.isDisplayed();
			boolean actaddLevelBtn                          = addLevelBtn.isDisplayed();
			boolean actaddParallelBtn                       = addParallelBtn.isDisplayed();
			boolean actclearbtn               				= clearbtn.isDisplayed();
			boolean actsaveBtn  							= saveBtn.isDisplayed();
			boolean actcancelBtn 							= cancelBtn.isDisplayed();
			boolean actdeleteBtn			                = deleteBtn.isDisplayed();
			boolean actstatusDropdown						= statusDropdown.isDisplayed();
			boolean actsuspendedCreditLimitChkBox			= suspendedCreditLimitChkBox.isDisplayed();
			
			boolean expmasterDropdown                       = true;
			boolean expnameTxt            					= true;
			boolean expactiveChkBox                			= true;
			boolean expalwaysauthorstartsfirstlevelChkBox   = true;
			boolean expaddLevelBtn          				= true;
			boolean expaddParallelBtn              			= true;
			boolean expclearbtn               				= true;
			boolean expsaveBtn  							= true;
			boolean expcancelBtn							= true;
			boolean expdeleteBtn							= true;
			boolean expstatusDropdown						= true;
			boolean expsuspendedCreditLimitChkBox			= true;
			
			System.out.println("************************************* checkTransactionAuthorizationOptions ******************");
		
			System.out.println("Home Page masterDropdown                     :"+actmasterDropdown                      +"  Value Expected : "+expmasterDropdown);
			System.out.println("Home Page nameTxt                            :"+actnameTxt                             +"  Value Expected : "+expnameTxt);
			System.out.println("Home Page activeChkBox                       :"+actactiveChkBox                        +"  Value Expected : "+expactiveChkBox);
			System.out.println("Home Page alwaysauthorstartsfirstlevelChkBox :"+actalwaysauthorstartsfirstlevelChkBox  +"  Value Expected : "+expalwaysauthorstartsfirstlevelChkBox);
	        System.out.println("Home Page addLevelBtn                        :"+actaddLevelBtn                         +"  Value Expected : "+expaddLevelBtn);
			System.out.println("Home Page addParallelBtn                     :"+actaddParallelBtn                      +"  Value Expected : "+expaddParallelBtn);
			System.out.println("Home Page clearbtn                           :"+actclearbtn                            +"  Value Expected : "+expclearbtn);
			System.out.println("Home Page saveBtn                            :"+actsaveBtn                             +"  Value Expected : "+expsaveBtn);
			System.out.println("Home Page cancelBtn 						 :"+actcancelBtn                           +"  Value Expected : "+expcancelBtn);
			System.out.println("Home Page deleteBtn                          :"+actdeleteBtn                           +"  Value Expected : "+expdeleteBtn);
			System.out.println("Home Page statusDropdown                     :"+actstatusDropdown                      +"  Value Expected : "+expstatusDropdown);
			System.out.println("Home Page suspendedCreditLimitChkBox         :"+actsuspendedCreditLimitChkBox          +"  Value Expected : "+expsuspendedCreditLimitChkBox);
	
  		    boolean actMethod=actmasterDropdown==expmasterDropdown  && actnameTxt==expnameTxt &&
				actactiveChkBox==expactiveChkBox && actalwaysauthorstartsfirstlevelChkBox==expalwaysauthorstartsfirstlevelChkBox && 
				actaddLevelBtn==expaddLevelBtn  && actaddParallelBtn==expaddParallelBtn && 
			    actclearbtn==expclearbtn && actsaveBtn==expsaveBtn && actcancelBtn==expcancelBtn && actdeleteBtn==expdeleteBtn && 
			    actstatusDropdown==expstatusDropdown && actsuspendedCreditLimitChkBox==expsuspendedCreditLimitChkBox;
		
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 9, 7);
			excelReader.setCellData(xlfile, xlSheetName, 9, 8, actResult);
			
			if(actResult.equalsIgnoreCase(expResult))
			{
				System.out.println("Test Pass : Master Authorization is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 8, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Master Authorization is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 8, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
	     {
	         excelReader.setExceptionInExcel(xlfile, xlSheetName, 8, 10, e.getMessage());
	         System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : " + e.getMessage());
	         return false;
	     }
	}




	@FindBy(xpath="//*[@id='MasterMenu']//li")
	public static List<WebElement> mastersListInMasterAuth;

	public boolean 	checkMasterDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		String actmasterDropdown=masterDropdown.getAttribute("placeholder");
		String expmasterDropdown="Master Name";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
	
		masterDropdown.sendKeys(" ");
		
		Thread.sleep(2000);
		
		
		ArrayList<String> actvouchersListInTransactionAuth =new ArrayList<String>();
		
		int vouchersListInTransactionAuthCount =mastersListInMasterAuth.size();
		
		System.err.println("vouchersListInTransactionAuth   :  "+vouchersListInTransactionAuthCount);
		
		for (int i = 0; i < vouchersListInTransactionAuthCount; i++) 
		{
			String data=mastersListInMasterAuth.get(i).getText();
			actvouchersListInTransactionAuth.add(data);
		}
		
		
		
		String actVouchersList = actvouchersListInTransactionAuth.toString();
		String expVouchersList ="[]";
		
		System.out.println("actVouchersList: "+actVouchersList);
		
		System.out.println("expVouchersList: "+expVouchersList);
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(state));
	
		 boolean actaccount                        = account.isDisplayed();
		 boolean actitem            			   = item.isDisplayed();
		 boolean actdepartment             		   = department.isDisplayed();
		 boolean actwarehouse                      = warehouse.isDisplayed();
		 boolean actcostCenter                     = costCenter.isDisplayed();
		 boolean actlocation                       = location.isDisplayed();
		 boolean actregion                         = region.isDisplayed();
		 boolean actcountry                        = country.isDisplayed();
		 boolean actstate                          = state.isDisplayed();
		 boolean actcity                           = city.isDisplayed();
		 boolean actunits               		   = units.isDisplayed();
		 boolean actbins                 	       = bins.isDisplayed();
		 boolean acttaxCode                 	   = taxCode.isDisplayed();
		 boolean actplant                    	   = plant.isDisplayed();
		 boolean actsupplyArea                     = supplyArea.isDisplayed();
		 boolean actmaintenanceParameter           = maintenanceParameter.isDisplayed();
		 boolean actsafetyInstructions             = safetyInstructions.isDisplayed();
		 boolean actcapacity                   	   = capacity.isDisplayed();
		 boolean actworkCenter                	   = workCenter.isDisplayed();
		 boolean actholiday               		   = holiday.isDisplayed();
		 boolean actprocess                    	   = process.isDisplayed();
	     boolean actqcFailureReason                = qcFailureReason.isDisplayed();
		 boolean actqcParameters                   = qcParameters.isDisplayed();
		 boolean actinsurance 					   = insurance.isDisplayed();
		 boolean actfixedAsset            		   = fixedAsset.isDisplayed();
		 boolean actbreakDownStandardReason        = breakDownStandardReason.isDisplayed();
		 boolean actemployee                       = employee.isDisplayed();
		 boolean actdesignation                    = designation.isDisplayed();
		 boolean actposition                       = position.isDisplayed();
		 boolean actqualification                  = qualification.isDisplayed();
		 boolean actspecialization                 = specialization.isDisplayed();
		 boolean actnationality                    = nationality.isDisplayed();
		 boolean actskillType                      = skillType.isDisplayed();
		 boolean actskill                          = skill.isDisplayed();
		 boolean actsourceType                     = sourceType.isDisplayed();
		 boolean actsource                         = source.isDisplayed();
		 boolean actroundType                 	   = roundType.isDisplayed();
		 boolean actgrade                          = grade.isDisplayed();
		 boolean actscale                          = scale.isDisplayed();
		 boolean actcourseType                     = courseType.isDisplayed();
		 boolean acttrainer                        = trainer.isDisplayed();
		 boolean actairlineSector                  = airlineSector.isDisplayed();
		 boolean actvenue                          = venue.isDisplayed();
		 boolean actrequestTypes                   = requestTypes.isDisplayed();
		 boolean actexpenseClaims                  = expenseClaims.isDisplayed();
		 boolean actemployeeBank				   = employeeBank.isDisplayed();
		 boolean acttravelAgent                    = travelAgent.isDisplayed();
		 boolean actjobGrade                       = jobGrade.isDisplayed();
		 boolean actoutlet                         = outlet.isDisplayed();
		 boolean actcounter                        = counter.isDisplayed();
		 boolean actmemberType                     = memberType.isDisplayed();
		 boolean actgiftVoucherDefinition          = giftVoucherDefinition.isDisplayed();
		 boolean actcategory                       = category.isDisplayed();
		 boolean actbankCardType                   = bankCardType.isDisplayed();
		 boolean actmember                         = member.isDisplayed();
		 boolean actdiscountVoucherDef             = discountVoucherDefinition.isDisplayed();
		 boolean actfloor                          = floor.isDisplayed();
		 boolean actsection                        = section.isDisplayed();
		 boolean acttable                          = table.isDisplayed();
		 boolean actguest                          = guest.isDisplayed();
		 boolean actvoidRemarks                    = voidRemarks.isDisplayed();
		 boolean actmemberCardDefinition           = memberCardDefinition.isDisplayed();
		 boolean actreturnRemarks                  = returnRemarks.isDisplayed();
		 boolean actkitchenDisplaySystem           = kitchenDisplaySystem.isDisplayed();
		 boolean actdeliveryTimeInterval           = deliveryTimeInterval.isDisplayed();
		 boolean actePayment                       = ePayment.isDisplayed();

		 
		 
		 boolean expaccount                        = true;
		 boolean expitem            			   = true;
		 boolean expdepartment             		   = true;
		 boolean expwarehouse                      = true;
		 boolean expcostCenter                     = true;
		 boolean explocation                       = true;
		 boolean expregion                         = true;
		 boolean expcountry                        = true;
		 boolean expstate                          = true;
		 boolean expcity                		   = true;
		 boolean expunits                          = true;
		 boolean expbins                           = true;
		 boolean exptaxCode                        = true;
		 boolean expplant                          = true;
		 boolean expsupplyArea                     = true;
		 boolean expmaintenanceParameter           = true;
		 boolean expsafetyInstructions             = true;
		 boolean expcapacity                       = true;
		 boolean expworkCenter                     = true;
		 boolean expholiday                        = true;
		 boolean expprocess                        = true;
		 boolean expqcFailureReason                = true;
		 boolean expqcParameters                   = true;
		 boolean expinsurance                      = true;
		 boolean expfixedAsset            		   = true;
		 boolean expemployee               		   = true;
		 boolean expbreakDownStandardReason        = true;
		 boolean expdesignation                    = true;
		 boolean expposition                       = true;
		 boolean expqualification                  = true;
		 boolean expspecialization                 = true;
		 boolean expnationality                    = true;
		 boolean expskillType                      = true;
		 boolean expskill                          = true;
		 boolean expsourceType                     = true;
		 boolean expsource                         = true;
		 boolean exproundType                 	   = true;
		 boolean expgrade                          = true;
		 boolean expscale                          = true;
		 boolean expcourseType                     = true;
		 boolean exptrainer                        = true;
		 boolean expairlineSector                  = true;	
		 boolean expvenue                          = true;
		 boolean exprequestTypes                   = true;
		 boolean expexpenseClaims                  = true;
		 boolean expemployeeBank                   = true;
		 boolean exptravelAgent                    = true;
		 boolean expjobGrade                       = true;
		 boolean expoutlet                         = true;
		 boolean expcounter                        = true;
		 boolean expmemberType                     = true;
		 boolean expgiftVoucherDefinition          = true;
		 boolean expcategory                       = true;
		 boolean expbankCardType                   = true;
		 boolean expmember                         = true;
		 boolean expdiscountVoucherDef             = true;
		 boolean expfloor                          = true;
		 boolean expsection                        = true;
		 boolean exptable                          = true;
		 boolean expguest                          = true;
		 boolean expvoidRemarks                    = true;
		 boolean expmemberCardDefinition           = true;
		 boolean expreturnRemarks 				   = true;
		 boolean expkitchenDisplaySystem 		   = true;
		 boolean expdeliveryTimeInterval		   = true;
		 boolean expePayment 					   = true;

			
		 System.out.println("****************************** checkMasterDropdownOptions  ********************************************");
		 System.out.println("masterDropdown        : "+actmasterDropdown         +"   Value Expected  : "+expmasterDropdown);
		 System.out.println("account               :"+actaccount                 +"   Value Expected : "+expaccount);
		 System.out.println("item                  :"+actitem                    +"   Value Expected : "+expitem);
		 System.out.println("department            :"+actdepartment              +"	  Value Expected : "+expdepartment);
		 System.out.println("warehouse             :"+actwarehouse               +"	  Value Expected : "+expwarehouse);
		 System.out.println("costCenter            :"+actcostCenter              +"	  Value Expected : "+expcostCenter);
		 System.out.println("location              :"+actlocation                +"	  Value Expected : "+explocation);
		 System.out.println("region                :"+actregion                  +"	  Value Expected : "+expregion);
		 System.out.println("country               :"+actcountry                 +"	  Value Expected : "+expcountry);
		 System.out.println("state                 :"+actstate                   +"	  Value Expected : "+expstate);
		 System.out.println("city                  :"+actcity                    +"	  Value Expected : "+expcity);
		 System.out.println("units                 :"+actunits                   +"	  Value Expected : "+expunits);
		 System.out.println("bins                  :"+actbins                    +"   Value Expected : "+expbins);
		 System.out.println("taxCode               :"+acttaxCode                 +"	  Value Expected : "+exptaxCode);
		 System.out.println("plant                 :"+actplant                   +"	  Value Expected : "+expplant);
		 System.out.println("supplyArea            :"+actsupplyArea              +"	  Value Expected : "+expsupplyArea);
		 System.out.println("maintenanceParameter  :"+actmaintenanceParameter    +"	  Value Expected : "+expmaintenanceParameter);
		 System.out.println("safetyInstructions    :"+actsafetyInstructions      +"	  Value Expected : "+expsafetyInstructions);
		 System.out.println("capacity              :"+actcapacity                +"	  Value Expected : "+expcapacity);
		 System.out.println("workCenter            :"+actworkCenter              +"	  Value Expected : "+expworkCenter);
		 System.out.println("holiday               :"+actholiday                 +"	  Value Expected : "+expholiday);
		 System.out.println("process               :"+actprocess                 +"	  Value Expected : "+expprocess);
		 System.out.println("qcFailureReason       :"+actqcFailureReason         +"   Value Expected : "+expqcFailureReason);
		 System.out.println("ReasonTxt             :"+actqcParameters            +"   Value Expected : "+expqcParameters);
		 System.out.println("insurance             :"+actinsurance               +"	  Value Expected : "+expinsurance);
		 System.out.println("fixedAsset            :"+actfixedAsset              +"	  Value Expected : "+expfixedAsset);
		 System.out.println("breakDownStandReason  :"+actbreakDownStandardReason +"	  Value Expected : "+expbreakDownStandardReason);
		 System.out.println("employee              :"+actemployee                +"	  Value Expected : "+expemployee);
		 System.out.println("designation           :"+actdesignation             +"	  Value Expected : "+expdesignation);
		 System.out.println("position              :"+actposition                +"   Value Expected : "+expposition);
		 System.out.println("qualification         :"+actqualification           +"	  Value Expected : "+expqualification);
		 System.out.println("specialization        :"+actspecialization          +"	  Value Expected : "+expspecialization);
		 System.out.println("nationality           :"+actnationality             +"	  Value Expected : "+expnationality);
		 System.out.println("skillType             :"+actskillType               +"   Value Expected : "+expskillType);
		 System.out.println("skill                 :"+actskill                   +"	  Value Expected : "+expskill);
		 System.out.println("sourceType            :"+actsourceType              +"	  Value Expected : "+expsourceType);
		 System.out.println("source                :"+actsource                  +"	  Value Expected : "+expsource);
		 System.out.println("roundType             :"+actroundType               +"	  Value Expected : "+exproundType);
		 System.out.println("grade                 :"+actgrade                   +"	  Value Expected : "+expgrade);
		 System.out.println("scale                 :"+actscale                   +"	  Value Expected : "+expscale);
		 System.out.println("courseType            :"+actcourseType              +"	  Value Expected : "+expcourseType);
		 System.out.println("trainer               :"+acttrainer                 +"	  Value Expected : "+exptrainer);
		 System.out.println("airlineSector         :"+actairlineSector           +"	  Value Expected : "+expairlineSector);
		 System.out.println("venue         			:"+actvenue                  +"	  Value Expected : "+expvenue);
		 System.out.println("expenseClaims          :"+actexpenseClaims          +"	  Value Expected : "+expexpenseClaims);
		 System.out.println("employeeBank           :"+actemployeeBank           +"	  Value Expected : "+expemployeeBank);
		 System.out.println("travelAgent         	:"+acttravelAgent            +"	  Value Expected : "+exptravelAgent);
		 System.out.println("jobGrade         		:"+actjobGrade               +"	  Value Expected : "+expjobGrade);
		 System.out.println("outlet         		:"+actoutlet                 +"	  Value Expected : "+expoutlet);
		 System.out.println("counter         		:"+actcounter                +"	  Value Expected : "+expcounter);
		 System.out.println("memberType             :"+actmemberType             +"	  Value Expected : "+expmemberType);
		 System.out.println("giftVoucherDefinition  :"+actgiftVoucherDefinition  +"	  Value Expected : "+expgiftVoucherDefinition);
		 System.out.println("category               :"+actcategory               +"	  Value Expected : "+expcategory);
		 System.out.println("bankCardType           :"+actbankCardType           +"	  Value Expected : "+expbankCardType);
		 System.out.println("member                 :"+actmember                 +"	  Value Expected : "+expmember);
		 System.out.println("discountVoucherDef     :"+actdiscountVoucherDef     +"	  Value Expected : "+expdiscountVoucherDef);
		 System.out.println("floor                  :"+actfloor                  +"	  Value Expected : "+expfloor);
		 System.out.println("section                :"+actsection                +"	  Value Expected : "+expsection);
		 System.out.println("table                  :"+acttable                  +"	  Value Expected : "+exptable);
		 System.out.println("guest                  :"+actguest                  +"	  Value Expected : "+expguest);
		 System.out.println("voidRemarks            :"+actvoidRemarks            +"	  Value Expected : "+expvoidRemarks);
		 System.out.println("memberCardDefinition   :"+actmemberCardDefinition   +"	  Value Expected : "+expmemberCardDefinition);
		 System.out.println("returnRemarks          :"+actreturnRemarks          +"	  Value Expected : "+expreturnRemarks);
		 System.out.println("kitchenDisplaySystem   :"+actkitchenDisplaySystem   +"	  Value Expected : "+expkitchenDisplaySystem);
		 System.out.println("deliveryTimeInterval   :"+actdeliveryTimeInterval   +"	  Value Expected : "+expdeliveryTimeInterval);
		 System.out.println("ePayment               :"+actePayment               +"	  Value Expected : "+expePayment);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		 System.out.println("airlineSector          :"+actairlineSector          +"	  Value Expected : "+expairlineSector);
		  
		 
		 

			boolean actMethod=actmasterDropdown.equalsIgnoreCase(expmasterDropdown) && actaccount==expaccount  && actitem==expitem && actdepartment==expdepartment && actwarehouse==expwarehouse 
					 && actcostCenter==expcostCenter && actlocation==explocation && actregion==expregion && actcountry==expcountry 
				     && actstate==expstate && actcity==expcity && actunits==expunits 
					 && actbins==expbins&& acttaxCode==exptaxCode && actplant==expplant
					 && actsupplyArea==expsupplyArea && actmaintenanceParameter==expmaintenanceParameter 
					 && actsafetyInstructions==expsafetyInstructions && actcapacity==expcapacity 
					 && actworkCenter==expworkCenter && actholiday==expholiday && actqcParameters==expqcParameters && actinsurance==expinsurance
					 && actprocess==expprocess && actqcFailureReason==expqcFailureReason && actfixedAsset==expfixedAsset
					 && actbreakDownStandardReason==expbreakDownStandardReason  &&  actdesignation==expdesignation
					 && actposition==expposition && actqualification==expqualification && actspecialization==expspecialization && actnationality==expnationality 
					 &&  actskillType==expskillType && actskill==expskill && actsourceType==expsourceType && actsource==expsource
					 && actroundType==exproundType && actgrade==expgrade && actscale==expscale && actcourseType==expcourseType && acttrainer==exptrainer  
					 && actairlineSector==expairlineSector && actvenue==expvenue && actrequestTypes==exprequestTypes && actexpenseClaims==expexpenseClaims 
					 && actemployeeBank==expemployeeBank && acttravelAgent==exptravelAgent && actjobGrade==expjobGrade && actoutlet==expoutlet 
					 && actcounter==expcounter && actmemberType==expmemberType && actgiftVoucherDefinition==expgiftVoucherDefinition && actcategory==expcategory 
					 && actbankCardType==expbankCardType &&actmember==expmember && actdiscountVoucherDef==expdiscountVoucherDef && actfloor==expfloor 
					 && actsection==expsection &&  acttable==exptable && actguest==expguest && actvoidRemarks==expvoidRemarks && actmemberCardDefinition==expmemberCardDefinition 
					 && actreturnRemarks==expreturnRemarks && actkitchenDisplaySystem==expkitchenDisplaySystem && actdeliveryTimeInterval==expdeliveryTimeInterval ;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 11, 7);
			excelReader.setCellData(xlfile, xlSheetName, 11, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Master Dropdown Options Are As expected");
			excelReader.setCellData(xlfile, xlSheetName, 10, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Master Dropdown Options Are NOT As expected");
			excelReader.setCellData(xlfile, xlSheetName, 10, 9, resFail);
			return false;
		}
	}



	public boolean 	checkSaveWithoutSelectionOfMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		System.out.println("************************************checkSaveWithoutSelectionOfMaster**********************************");
		
        String expMessage="Give proper Authorization name.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 13, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 12, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Transaction Authorization is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 12, 9, resFail);
			return false;
		}
	}
	
	

	public boolean 	checkSelectingAccountinMasterDropdown() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
		String actmasterDropdown=masterDropdown.getAttribute("value");
		String expmasterDropdown=excelReader.getCellData(xlSheetName, 14, 7);
		excelReader.setCellData(xlfile, xlSheetName, 14, 8, actmasterDropdown);

		System.out.println("****************************************checkSelectingAccountinMasterDropdown*************"); 
		
		
		System.out.println("masterDropdown   : "+actmasterDropdown+" Value Expected : "+expmasterDropdown);
		
		if(actmasterDropdown.equalsIgnoreCase(expmasterDropdown))
		{
			System.out.println("Test Pass : Account is Selected");
			excelReader.setCellData(xlfile, xlSheetName, 14, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Account is Not Selected");
			excelReader.setCellData(xlfile, xlSheetName, 14, 9, resFail);
			return false;
		}
		
		
	}


	
	public boolean 	checkBannerTextNameTextBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Checking 
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
	
		String actnameTxt=nameTxt.getAttribute("placeholder");
		String expnameTxt=excelReader.getCellData(xlSheetName, 16, 7);
		excelReader.setCellData(xlfile, xlSheetName, 16, 8, actnameTxt);
		
		System.out.println("*****************************checkBannerTextNameTextBox***************");
		
		System.out.println("nameTxt   : "+actnameTxt+"  Value Expected : "+expnameTxt);
		
		if(actnameTxt.equalsIgnoreCase(expnameTxt))
		{
			System.out.println("Test Pass : Add New Authorization Flow is Displyed");
			excelReader.setCellData(xlfile, xlSheetName, 15, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Add New Authorization Flow is NOT Displyed");
			excelReader.setCellData(xlfile, xlSheetName, 15, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean 	checkSaveWithoutName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		System.out.println("********************************************checkSaveWithoutName***************************");
		

		String expValidationMsg=excelReader.getCellData(xlSheetName, 17, 7);
		
		String actValidationMsg=checkValidationMessage(expValidationMsg);
		
		excelReader.setCellData(xlfile, xlSheetName, 17, 8, actValidationMsg);
		
		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 17, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Transaction Authorization is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 17, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean 	checkActiveCheckBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(activeChkBox));
		
        boolean ActiveChkBox=activeChkBox.isSelected();
		
		String actactiveChkBox=Boolean.toString(ActiveChkBox);
		String expactiveChkBox=excelReader.getCellData(xlSheetName, 19, 7);
		excelReader.setCellData(xlfile, xlSheetName, 19, 8, actactiveChkBox);
		
		
		if(actactiveChkBox.equalsIgnoreCase(expactiveChkBox))      
		{
			System.out.println("Test Pass : Active ChkBox IS Enabled/Checked");
			excelReader.setCellData(xlfile, xlSheetName, 18, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Active ChkBox IS NOT Enabled/Checked");
			excelReader.setCellData(xlfile, xlSheetName, 18, 9, resFail);
			return false;
		}
	}
	
	
	public boolean 	checkInputNameAndClickOnSaveWithoutAuthorizationSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 21, 6));
		nameTxt.sendKeys(Keys.TAB);
	
		
		String actName,expName;
		actName=nameTxt.getAttribute("value");
		expName=excelReader.getCellData(xlSheetName, 21, 7);
		excelReader.setCellData(xlfile, xlSheetName, 21, 8, actName);
		
		System.out.println("**********************************************checkInputNameAndClickOnSaveWithoutAuthorizationSettings**********************");
		
		System.out.println("nameTxt   :"+actName +" Value Expected : "+expName);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expMessage=excelReader.getCellData(xlSheetName, 22, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 22, 8, actMessage);
		
		if(actName.equalsIgnoreCase(expName) && actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Account inputed Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 20, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Account NOT inputed Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 20, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean 	checkStartPoint() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addLevelBtn));
		 getAction().doubleClick(addLevelBtn).build().perform();
		
		
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
		 boolean actconditionTab            = conditionTab.isDisplayed();
		 boolean actuserSelectionTab        = userSelectionTab.isDisplayed();
		 boolean actalertsTab               = alertsTab.isDisplayed();
		 boolean actescalationTab           = escalationTab.isDisplayed();
		 boolean actdefinitionOkBtn         = definitionOkBtn.isDisplayed();
		 boolean actdefinitionCancelBtn     = definitionCancelBtn.isDisplayed();
		  
		 boolean expconditionTab            = true;
		 boolean expuserSelectionTab        = true;
		 boolean expalertsTab               = true;
		 boolean expescalationTab           = true;
		 boolean expdefinitionOkBtn         = true;
		 boolean expdefinitionCancelBtn     = true;
		  
		 System.out.println("***********************************************checkStartPoint****************");
		  
		 System.out.println("conditionTab            "+actconditionTab         +"  Value Expected  :"+expconditionTab);
		 System.out.println("userSelectionTab        "+actuserSelectionTab     +"  Value Expected  :"+expuserSelectionTab);
		 System.out.println("alertsTab               "+actalertsTab            +"  Value Expected  :"+expalertsTab);
		 System.out.println("escalationTab           "+actescalationTab        +"  Value Expected  :"+expescalationTab);
		 System.out.println("definitionOkBtn         "+actdefinitionOkBtn      +"  Value Expected  :"+expdefinitionOkBtn);
		 System.out.println("definitionCancelBtn     "+actdefinitionCancelBtn  +"  Value Expected  :"+expdefinitionCancelBtn);
		  
		 boolean actMethod=actconditionTab==expconditionTab && actuserSelectionTab==expuserSelectionTab &&  
				  actalertsTab==expalertsTab && actescalationTab==expescalationTab && actdefinitionOkBtn==expdefinitionOkBtn;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 24, 7);
		excelReader.setCellData(xlfile, xlSheetName, 24, 8, actResult);
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Start Point works As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Start Point NOT works As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resFail);
			return false;
		}
	}
	
	@FindBy(xpath="//*[@id='panelsStayOpen-headingOne']/div[2]/button")
	public static WebElement dateAndTimeRangeExpandBtn;
	
	public boolean 	checkConditionTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
		 conditionTab.click();
		
		 Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		 boolean actdescriptionTxt                    = descriptionTxt.isDisplayed();
		 boolean actconditionNotRequiredChkBox        = conditionNotRequiredChkBox.isDisplayed();
		 
		
		 boolean actconjunctionDropdown        		  = conjunctionDropdown.isDisplayed();
		 boolean actselectFieldTxt               	  = selectFieldTxt.isDisplayed();
		 boolean actselectOperatorDropdown            = selectOperatorDropdown.isDisplayed();
		 boolean actcompareWithDropdown               = compareWithDropdown.isDisplayed();
		 boolean actvalueTxt               			  = valueTxt.isDisplayed();
		 boolean actdeleteRow1Btn                     = deleteRow1Btn.isDisplayed();
		 boolean actaddRowBtn              			  = addRowBtn.isDisplayed();
		 boolean actactionOnEntryStatusDp             = actionOnEntryStatusDropdown.isDisplayed();
		 boolean actfullAuthorChkBox                  = fullAuthorizationChkBox.isDisplayed();
		 boolean actundoAuthEditingDropdown           = undoAuthEditingDropdown.isDisplayed();
		 
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateAndTimeRangeExpandBtn));
		 dateAndTimeRangeExpandBtn.click();
		 
		 
		 boolean actdateRangeChkBox                   = dateRangeChkBox.isDisplayed();
		 boolean acttimeRangeChkBox           		  = timeRangeChkBox.isDisplayed();
		 boolean actfromDateTxt           			  = fromDateTxt.isDisplayed();
		 boolean acttoDateTxt           			  = toDateTxt.isDisplayed();
		 boolean actfromTimeTxt            			  = fromTimeTxt.isDisplayed();
		 boolean acttotimeTxt                         = totimeTxt.isDisplayed();
			
		 boolean expdescriptionTxt                    = true;
		 boolean expconditionNotRequiredChkBox        = true;
		 boolean expdateRangeChkBox                   = true;
		 boolean exptimeRangeChkBox           		  = true;
		 boolean expfromDateTxt           			  = true;
		 boolean exptoDateTxt                         = true;
		 boolean expfromTimeTxt                       = true;
		 boolean exptotimeTxt                         = true;
		 boolean expconjunctionDropdown               = true;
		 boolean expselectFieldTxt                    = true;
		 boolean expselectOperatorDropdown            = true;
		 boolean expcompareWithDropdown               = true;
		 boolean expvalueTxt               			  = true;
		 boolean expdeleteRow1Btn   				  = true;
		 boolean expaddRowBtn              			  = true;
		 boolean expactionOnEntryStatusDp             = true;
		 boolean expfullAuthorChkBox                  = true;
		 boolean expundoAuthEditingDropdown           = true;
		 
		 System.out.println("****************************** checkConditionTabOptions  ********************************************");
		 
		 System.out.println("descriptionTxt               :"+actdescriptionTxt             +"    Value Expected : "+expdescriptionTxt);
		 System.out.println("conditionNotRequiredChkBox   :"+actconditionNotRequiredChkBox +"    Value Expected : "+expconditionNotRequiredChkBox);
		 System.out.println("dateRangeChkBox              :"+actdateRangeChkBox            +"	 Value Expected : "+expdateRangeChkBox);
		 System.out.println("timeRangeChkBox              :"+acttimeRangeChkBox            +"	 Value Expected : "+exptimeRangeChkBox);
		 System.out.println("fromDateTxt                  :"+actfromDateTxt                +"	 Value Expected : "+expfromDateTxt);
		 System.out.println("toDateTxt                    :"+acttoDateTxt                  +"	 Value Expected : "+exptoDateTxt);
		 System.out.println("fromTimeTxt                  :"+actfromTimeTxt                +"	 Value Expected : "+expfromTimeTxt);
		 System.out.println("totimeTxt                    :"+acttotimeTxt                  +"	 Value Expected : "+exptotimeTxt);
		 System.out.println("conjunctionDropdown          :"+actconjunctionDropdown        +"	 Value Expected : "+expconjunctionDropdown);
		 System.out.println("selectFieldTxt               :"+actselectFieldTxt             +"	 Value Expected : "+expselectFieldTxt);
		 System.out.println("selectOperatorDropdown       :"+actselectOperatorDropdown     +"	 Value Expected : "+expselectOperatorDropdown);
		 System.out.println("compareWithDropdown          :"+actcompareWithDropdown        +"    Value Expected : "+expcompareWithDropdown);
		 System.out.println("valueTxt                     :"+actvalueTxt                   +"	 Value Expected : "+expvalueTxt);
		 System.out.println("deleteRow1Btn                :"+actdeleteRow1Btn              +"	 Value Expected : "+expdeleteRow1Btn);
		 System.out.println("addRowBtn                    :"+actaddRowBtn                  +"	 Value Expected : "+expaddRowBtn);
		 System.out.println("actionOnEntryStatusDp        :"+actactionOnEntryStatusDp      +"	 Value Expected : "+expactionOnEntryStatusDp);
		 System.out.println("fullAuthorChkBox             :"+actfullAuthorChkBox           +"	 Value Expected : "+expfullAuthorChkBox );
		 System.out.println("undoAuthEditingDropdown      :"+actundoAuthEditingDropdown    +"	 Value Expected : "+expundoAuthEditingDropdown);
		
		 
		 boolean actMethod=actdescriptionTxt==expdescriptionTxt  && actconditionNotRequiredChkBox==expconditionNotRequiredChkBox && actdateRangeChkBox==expdateRangeChkBox
				 && acttimeRangeChkBox==exptimeRangeChkBox && actfromDateTxt==expfromDateTxt && acttoDateTxt==exptoDateTxt&& actfromTimeTxt==expfromTimeTxt 
				 && acttotimeTxt==exptotimeTxt && actconjunctionDropdown==expconjunctionDropdown && actselectFieldTxt==expselectFieldTxt 
				 && actselectOperatorDropdown==expselectOperatorDropdown && actcompareWithDropdown==expcompareWithDropdown && actvalueTxt==expvalueTxt 
				 && actdeleteRow1Btn==expdeleteRow1Btn && actaddRowBtn==expaddRowBtn && actactionOnEntryStatusDp==expactionOnEntryStatusDp 
				 && actfullAuthorChkBox==expfullAuthorChkBox && actundoAuthEditingDropdown==expundoAuthEditingDropdown;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 26, 7);
			excelReader.setCellData(xlfile, xlSheetName, 26, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Condition Tab Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 25, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Condition Tab Options Are NOT Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 25, 9, resFail);
			return false;
		}
		
	}
	
	
	
	
	public boolean 	checkUserSelectionTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
			
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userselectionDropdown));
		 boolean actuserselectionDropdown             = userselectionDropdown.isDisplayed();
		 boolean actcriteriaDropdown                  = criteriaDropdown.isDisplayed();
		 boolean actuserrow1                          = userrow1.isDisplayed();
		 boolean actuserrow2                          = userrow2.isDisplayed();
		  
		 boolean expuserselectionDropdown             = true;
		 boolean expcriteriaDropdown                  = true;
		 boolean expuserrow1                          = true;
		 boolean expuserrow2                          = true;
		  
		 System.out.println("***********************************************checkUserSelectionTabOptions****************");
		  
		 System.out.println("UserselectionDropdown    :"+actuserselectionDropdown  +"  Value Expected  :"+expuserselectionDropdown);
		 System.out.println("CriteriaDropdown         :"+actcriteriaDropdown       +"  Value Expected  :"+expcriteriaDropdown);
		 System.out.println("Userrow1                 :"+actuserrow1               +"  Value Expected  :"+expuserrow1);
		 System.out.println("userrow2                 :"+actuserrow2               +"  Value Expected  :"+expuserrow2);
		  
		 
		 boolean actMethod=actuserselectionDropdown==expuserselectionDropdown && actcriteriaDropdown==expcriteriaDropdown && 
				  actuserrow1==expuserrow1 && actuserrow2==expuserrow2;
			
			
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 28, 7);
		excelReader.setCellData(xlfile, xlSheetName, 28, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : User Selection TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 27, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : User Selection TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 27, 9, resFail);
			return false;
		}
	}
	
	
	
	
	@FindBy(xpath="//*[@id='id_tblUserSelection_User']")
	public static WebElement userDropdown;
	
	
	public boolean 	checkUserDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userselectionDropdown));
		userselectionDropdown.click();
		
		Select userq = new Select(userselectionDropdown);
		
		System.out.println("users dropdown default value: "+userq.getFirstSelectedOption());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(criteriaDropdown));
		criteriaDropdown.click();
		
		String userc=criteriaDropdown.getText();
		
		System.out.println("userc"+userc);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
		userDropdown.click();
		
		String Strlpl= userDropdown.getText();
	
		System.out.println(Strlpl);
		 
        String[] testString=Strlpl.split("\n");
        
        List<String> actlist = Arrays.asList(testString);
        
        System.out.println("********************************************checkUserDropdownOptions*************************************");
        
        System.out.println("Converting to string array"+actlist);
        
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
        
        list.add(excelReader.getCellData(xlSheetName, 30, 6));
        list.add(excelReader.getCellData(xlSheetName, 31, 6));
        list.add(excelReader.getCellData(xlSheetName, 32, 6));
        list.add(excelReader.getCellData(xlSheetName, 33, 6));
        
       
        System.out.println("list     : "+actlist +" Value Expected : "+list);  
        
		
        
       if((actlist.equals(list)) )
       {
    	   excelReader.setCellData(xlfile, xlSheetName, 29, 9, resPass);
    	   return true;
    	   
       }
       
       else
       {
    	   excelReader.setCellData(xlfile, xlSheetName, 29, 9, resFail);
    	   return false;
    	  
       }
    	
    	
    
		
	 
	}

	
	public boolean 	checkAlertsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertsTab));
		 alertsTab.click();
		
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
		 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
	     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
		 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
		 boolean actstoppedChkBox                    = stoppedChkBox.isDisplayed();
		 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
		 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
	     boolean actheaderSMSTemplate          		 = headerSMSTemplate.isDisplayed();
		 boolean actheaderAlert                      = headerAlert.isDisplayed();
		 boolean actheaderRecipient                  = headerRecipient.isDisplayed();
		 
		 boolean expreceivedChkBox                   = true;
		 boolean expapprovedChkBox                   = true;
		 boolean exprejectedChkBox                   = true;
		 boolean expstoppedChkBox                    = true;
		 boolean expemailHeaderTemplateBtn           = true;
		 boolean expemailTemplateBtn                 = true;
		 boolean expheaderSMSTemplate                = true;
		 boolean expheaderAlert                      = true;
		 boolean expheaderRecipient                  = true;
		 	
		 System.out.println("****************************** checkAlertsTabOptions  ********************************************");
		 
		 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
		 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
		 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
		 System.out.println("StoppedChkBox     			   :"+actstoppedChkBox          +"	 Value Expected : "+expstoppedChkBox);
		 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
		 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
		 System.out.println("HeaderSMSTemplate             :"+actheaderSMSTemplate      +"	 Value Expected : "+expheaderSMSTemplate);
		 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
		 System.out.println("HeaderRecipient               :"+actheaderRecipient        +"	 Value Expected : "+expheaderRecipient);
		 
		 boolean actMethod=actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
				 && actstoppedChkBox==expstoppedChkBox && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
				  && actemailTemplateBtn==expemailTemplateBtn && actheaderSMSTemplate==expheaderSMSTemplate 
			     && actheaderAlert==expheaderAlert && actheaderRecipient==expheaderRecipient;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 35, 7);
			excelReader.setCellData(xlfile, xlSheetName, 35, 8, actResult);
		 
		 
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 34, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 34, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean 	checkEscalationTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationTab));
		escalationTab.click();
		

		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationLevelAddBtn));
		boolean EscalationLevelAddBtn=escalationLevelAddBtn.isDisplayed();
		
		String actescalationLevelAddBtn=Boolean.toString(EscalationLevelAddBtn);
		String expescalationLevelAddBtn=excelReader.getCellData(xlSheetName, 37, 7);
		excelReader.setCellData(xlfile, xlSheetName, 37, 8, actescalationLevelAddBtn);
		
		System.out.println("*********************************************checkEscalationTabOptions**************************");
		
		System.out.println("escalationLevelAddBtn    :  "+actescalationLevelAddBtn+" Value Expected : "+expescalationLevelAddBtn);
		
		if(actescalationLevelAddBtn.equalsIgnoreCase(expescalationLevelAddBtn))
		{
			System.out.println("Test Pass : Escalation TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 36, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Esacalation TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 36, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean 	checkEscalationTabOptionsAfterClickingAddBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationLevelAddBtn));
		escalationLevelAddBtn.click();
		
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(timelimitTxt1));
		
        boolean actTimelimitTxt1                 = timelimitTxt1.isDisplayed();
		boolean acttimelimitDropdown1            = dropdown1.isDisplayed();
		boolean actEscalationType1               = escalationTypeDropdown1.isDisplayed();
		/*boolean actMinimize1                     = minimize1.isDisplayed();
		boolean actClose1                        = close1.isDisplayed();*/
		
		boolean expTimelimitTxt1                 = true;
		boolean exptimelimitDropdown1            = true;
		boolean expEscalationType1               = true;
		/*boolean expMinimize1                     = true;
		boolean expClose1                        = true;*/
		
		System.out.println("********************* checkEscalationTabOptionsAfterClickingAddBtn ******************");
	
		System.out.println("TimelimitTxt1                :"+actTimelimitTxt1       +"  Value Expected : "+expTimelimitTxt1);
		System.out.println("timelimitDropdown1           :"+acttimelimitDropdown1  +"  Value Expected : "+exptimelimitDropdown1);
		System.out.println("EscalationType1              :"+actEscalationType1     +"  Value Expected : "+expEscalationType1);
		/*System.out.println("Minimize1                    :"+actMinimize1           +"  Value Expected : "+expMinimize1);
        System.out.println("Close1                       :"+actClose1              +"  Value Expected : "+expClose1);*/
			
        boolean actMethod=actTimelimitTxt1==expTimelimitTxt1  && acttimelimitDropdown1==exptimelimitDropdown1 &&
				actEscalationType1==expEscalationType1; /*&& actMinimize1==expMinimize1 && 
				actClose1==expClose1;*/
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 39, 7);
		excelReader.setCellData(xlfile, xlSheetName, 39, 8, actResult);
			
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Escalation TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 38, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Esacalation TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 38, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean 	checkEscalationTypeDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationTypeDropdown1));
		escalationTypeDropdown1.click();
		
		
		
		Select s=new Select(escalationTypeDropdown1);
		int escalationTypeDropdown1=s.getOptions().size();
		
		String actescalationTypeDropdown1=Integer.toString(escalationTypeDropdown1);
		
		String expescalationTypeDropdown1=excelReader.getCellData(xlSheetName, 40, 7);
		excelReader.setCellData(xlfile, xlSheetName, 40, 8, actescalationTypeDropdown1);
		
		
		System.out.println("***************************checkEscalationTypeDropdownOptions**************************");
		System.out.println("*escalationTypeDropdown1  : "+actescalationTypeDropdown1+" Value Expected : "+expescalationTypeDropdown1);
		
		if(actescalationTypeDropdown1.equalsIgnoreCase(expescalationTypeDropdown1))
		{
			System.out.println("Test Pass : escalationTypeDropdown Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 40, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : escalationTypeDropdown Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 40, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean 	checkCancelButtonInDefinitionScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionCancelBtn));
		definitionCancelBtn.click();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
		
		boolean actmasterDropdown                       = masterDropdown.isDisplayed();
		boolean actnameTxt                              = nameTxt.isDisplayed();
		boolean actactiveChkBox                         = activeChkBox.isDisplayed();
		boolean actalwaysauthorstartsfirstlevelChkBox   = alwaysauthorizationstartsfromfirstlevelChkBox.isDisplayed();
		boolean actaddLevelBtn                          = addLevelBtn.isDisplayed();
		boolean actaddParallelBtn                       = addParallelBtn.isDisplayed();
		boolean actclearbtn               				= clearbtn.isDisplayed();
		boolean actsaveBtn  							= saveBtn.isDisplayed();
		boolean actcancelBtn 							= cancelBtn.isDisplayed();
		boolean actdeleteBtn			                = deleteBtn.isDisplayed();
		boolean actstatusDropdown						= statusDropdown.isDisplayed();
		boolean actsuspendedCreditLimitChkBox			= suspendedCreditLimitChkBox.isDisplayed();
		
		boolean expmasterDropdown                       = true;
		boolean expnameTxt            					= true;
		boolean expactiveChkBox                			= true;
		boolean expalwaysauthorstartsfirstlevelChkBox   = true;
		boolean expaddLevelBtn          				= true;
		boolean expaddParallelBtn              			= true;
		boolean expclearbtn               				= true;
		boolean expsaveBtn  							= true;
		boolean expcancelBtn							= true;
		boolean expdeleteBtn							= true;
		boolean expstatusDropdown						= true;
		boolean expsuspendedCreditLimitChkBox			= true;
		
		System.out.println("********************************************** checkCancelButtonInDefinitionScreen ******************");
	
		System.out.println("Home Page masterDropdown                     :"+actmasterDropdown                      +"  Value Expected : "+expmasterDropdown);
		System.out.println("Home Page nameTxt                            :"+actnameTxt                             +"  Value Expected : "+expnameTxt);
		System.out.println("Home Page activeChkBox                       :"+actactiveChkBox                        +"  Value Expected : "+expactiveChkBox);
		System.out.println("Home Page alwaysauthorstartsfirstlevelChkBox :"+actalwaysauthorstartsfirstlevelChkBox  +"  Value Expected : "+expalwaysauthorstartsfirstlevelChkBox);
        System.out.println("Home Page addLevelBtn                        :"+actaddLevelBtn                         +"  Value Expected : "+expaddLevelBtn);
		System.out.println("Home Page addParallelBtn                     :"+actaddParallelBtn                      +"  Value Expected : "+expaddParallelBtn);
		System.out.println("Home Page clearbtn                           :"+actclearbtn                            +"  Value Expected : "+expclearbtn);
		System.out.println("Home Page saveBtn                            :"+actsaveBtn                             +"  Value Expected : "+expsaveBtn);
		System.out.println("Home Page cancelBtn 						 :"+actcancelBtn                           +"  Value Expected : "+expcancelBtn);
		System.out.println("Home Page deleteBtn                          :"+actdeleteBtn                           +"  Value Expected : "+expdeleteBtn);
		System.out.println("Home Page statusDropdown                     :"+actstatusDropdown                      +"  Value Expected : "+expstatusDropdown);
		System.out.println("Home Page suspendedCreditLimitChkBox         :"+actsuspendedCreditLimitChkBox          +"  Value Expected : "+expsuspendedCreditLimitChkBox);
		
		
		
		boolean actMethod=actmasterDropdown==expmasterDropdown  && actnameTxt==expnameTxt &&
				actactiveChkBox==expactiveChkBox && actalwaysauthorstartsfirstlevelChkBox==expalwaysauthorstartsfirstlevelChkBox && 
				actaddLevelBtn==expaddLevelBtn  && actaddParallelBtn==expaddParallelBtn && 
			    actclearbtn==expclearbtn && actsaveBtn==expsaveBtn && actcancelBtn==expcancelBtn && actdeleteBtn==expdeleteBtn && 
			    actstatusDropdown==expstatusDropdown && actsuspendedCreditLimitChkBox==expsuspendedCreditLimitChkBox;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 42, 7);
		excelReader.setCellData(xlfile, xlSheetName, 42, 8, actResult);
			
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Cancel Option Working ");
			excelReader.setCellData(xlfile, xlSheetName, 41, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Cancel Option Not Working");
			excelReader.setCellData(xlfile, xlSheetName, 41, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean 	checkDescriptionAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		
		getAction().doubleClick(addLevelBtn).build().perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		System.out.println("****************************checkDescriptionAsMandatory************************************"); 
	
		
        String expMessage=excelReader.getCellData(xlSheetName, 44, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 44, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 43, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 43, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	public boolean 	checkConditionAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		
		descriptionTxt.sendKeys(excelReader.getCellData(xlSheetName, 45, 6));
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		System.out.println("*****************************************************checkConditionAsMandatory************************************");
		
        String expMessage="In User Selection tab select user , User selection is mandatory";
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 46, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 45, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 45, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean 	checkUserSelectionIsManadatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
		conditionNotRequiredChkBox.click();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		System.out.println("*******************************************************checkUserSelectionIsManadatory*****************************************");
		
		String expMessage=excelReader.getCellData(xlSheetName, 48, 7);
			
		String actMessage=checkValidationMessage(expMessage);
			
		excelReader.setCellData(xlfile, xlSheetName, 48, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 47, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 47, 9, resFail);
			return false;
		}
	}
	
	
	@FindBy(xpath="//*[@id='tblNodeBody']/tr[1]/td[2]/div/div/div/span/i")
	public static WebElement endpoint;
	
	
	public boolean 	checkOkButtonOnSelectingUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
		userDropdown.click();
		
		Select s=new Select(userDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlSheetName, 50, 6));
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		
		boolean actendpoint=endpoint.isDisplayed();
		boolean expendpoint=true;
		
		System.out.println("***************************************checkOkButtonOnSelectingUser*****************************");
		System.out.println("endpoint     : "+actendpoint +"  Value Expected : "+expendpoint);
		
		if(actendpoint==expendpoint)
		{
			System.out.println("Test Pass : Image Displayed In Design Area");
			excelReader.setCellData(xlfile, xlSheetName, 49, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area");
			excelReader.setCellData(xlfile, xlSheetName, 49, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	
	public boolean 	checkSavingMasterAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		System.out.println("**********************************checkSavingMasterAuthorization*****************************");
		
        String expMessage=excelReader.getCellData(xlSheetName, 52, 7);
		
		String actMessage=checkValidationMessage(expMessage);
			
		excelReader.setCellData(xlfile, xlSheetName, 52, 8, actMessage);
		
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 51, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 51, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean 	checkCancelButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
		cancelBtn.click();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
		
		boolean actdashboard=dashboardName.isDisplayed();
		boolean expdashboard=true;
			
		System.out.println("dashboard  :"+actdashboard +"  Value Expected  : "+expdashboard);
		
		if(actdashboard==expdashboard)	
		{
			System.out.println("Test Pass : Cancel Option Working ");
			excelReader.setCellData(xlfile, xlSheetName, 53, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Cancel Option Not Working");
			excelReader.setCellData(xlfile, xlSheetName, 53, 9, resFail);
			return false;
		}
	}
	
	public boolean 	checkDisplayingMastersNameInListOfMasters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is not enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Master Authorization");
		serachMenuTextHomePage.sendKeys(Keys.ENTER);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		boolean Account=account.isDisplayed();
		
		String actaccount=Boolean.toString(Account);
		String expaccount =excelReader.getCellData(xlSheetName, 55, 7);
		excelReader.setCellData(xlfile, xlSheetName, 55, 8, actaccount);
		
		System.out.println("***********************************************checkDisplayingMastersNameInListOfMasters*******");
		
		System.out.println("account       : "+actaccount+"  Value Expected : "+expaccount);
		
		if(actaccount.equalsIgnoreCase(expaccount))
		{
			System.out.println("Test Pass : Account(1) Is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 54, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Account(1) Is NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 54, 9, resFail);
			return false;
		}
	}
		
	
	
	public boolean 	checkSavedNameDisplayInNameTextBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		
		
		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 56, 6));
		
		Thread.sleep(3000);
		
		nameTxt.sendKeys(Keys.TAB);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		boolean actstartPointBtn     = startPointBtn.isDisplayed();
		boolean actendpoint          = endpoint.isDisplayed();
		
		boolean expstartPointBtn     = true;
		boolean expendpoint          = true;
		
		System.out.println("*************************************checkSavedNameDisplayInNameTextBox************************************");
		
		System.out.println("startPointBtn    :"+actstartPointBtn   +"  Value Expected : "+expstartPointBtn);
		System.out.println("endpoint         :"+actendpoint        +"  Value Expected : "+expendpoint);
		
		if(actstartPointBtn==expstartPointBtn && actendpoint==expendpoint)
		{
			System.out.println("Test Pass : Saved Data is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 56, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Saved Data is NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 56, 9, resFail);
			return false;
		}
		
	}
	


	public boolean 	checkEditMasterAuthorizationSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		Thread.sleep(3000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1Template));
		level1Template.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
		Level1editBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
        boolean actconditionTab                 = conditionTab.isDisplayed();
		boolean actuserSelectionTab             = userSelectionTab.isDisplayed();
		boolean actalertsTab                    = alertsTab.isDisplayed();
		boolean actescalationTab                = escalationTab.isDisplayed();
		
		boolean expconditionTab                 = true;
		boolean expuserSelectionTab             = true;
		boolean expalertsTab                    = true;
		boolean expescalationTab                = true;
		
		System.out.println("********************* checkEditAuthorizationSettings ******************");
	
		System.out.println("ConditionTab             :"+actconditionTab     +"  Value Expected : "+expconditionTab);
		System.out.println("UserSelectionTab         :"+actuserSelectionTab +"  Value Expected : "+expuserSelectionTab);
		System.out.println("AlertsTab                :"+actalertsTab        +"	Value Expected : "+expalertsTab);
		System.out.println("EscalationTab            :"+actescalationTab    +"	Value Expected : "+expescalationTab);
		
		boolean actMethod=actconditionTab==expconditionTab  && actuserSelectionTab==expuserSelectionTab &&
				actalertsTab==expalertsTab && actescalationTab==expescalationTab;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 58, 7);
		excelReader.setCellData(xlfile, xlSheetName, 58, 8, actResult);
			
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
			conditionNotRequiredChkBox.click();
			
			System.out.println("Test Pass : Edit Btn Opened definition Screen");
			excelReader.setCellData(xlfile, xlSheetName, 59, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Edit Btn NOT Opened definition Screen");
			excelReader.setCellData(xlfile, xlSheetName, 59, 9, resFail);
			return false;
		}
		
	}
	
	
	
	
	
	public boolean checkConditionCheckbox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
		conjunctionDropdown.click();
		conjunctionDropdown.sendKeys(excelReader.getCellData(xlSheetName, 60, 6));	
		conjunctionDropdown.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt));
		selectFieldTxt.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sName));
		sName.click();;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
		selectOperatorDropdown.click();
		selectOperatorDropdown.sendKeys(excelReader.getCellData(xlSheetName, 61, 6));		
		selectOperatorDropdown.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
		compareWithDropdown.click();
		compareWithDropdown.sendKeys(excelReader.getCellData(xlSheetName, 62, 6));		
		compareWithDropdown.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueTxt));
		valueTxt.clear();
		valueTxt.sendKeys(excelReader.getCellData(xlSheetName, 63, 6));
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actionOnEntryStatusDropdown));
		actionOnEntryStatusDropdown.click();
		
		Select s=new Select(actionOnEntryStatusDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlSheetName, 64, 6));
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fullAuthorizationChkBox));
		fullAuthorizationChkBox.click();
		
		String actconjunctionDropdown=conjunctionDropdown.getAttribute("value");
		String expconjunctionDropdown=excelReader.getCellData(xlSheetName, 60, 7);
		excelReader.setCellData(xlfile, xlSheetName, 60, 8, actconjunctionDropdown);
		
		String actselectFieldTxt=selectFieldTxt.getAttribute("value");
		String expselectFieldTxt="sName";
		
		String actselectOperatorDropdown=selectOperatorDropdown.getAttribute("value");
		String expselectOperatorDropdown=excelReader.getCellData(xlSheetName, 61, 7);
		excelReader.setCellData(xlfile, xlSheetName, 61, 8, actselectOperatorDropdown);
		
		String actcompareWithDropdown=compareWithDropdown.getAttribute("value");
		String expcompareWithDropdown=excelReader.getCellData(xlSheetName, 62, 7);
		excelReader.setCellData(xlfile, xlSheetName, 62, 8, actcompareWithDropdown);
		
		String actvalueTxt=valueTxt.getAttribute("value");
		String expvalueTxt=excelReader.getCellData(xlSheetName, 63, 7);
		excelReader.setCellData(xlfile, xlSheetName, 63, 8, actvalueTxt);
		
		System.out.println("************************************checkConditionCheckbox******************************************************************************");
		
		System.out.println("conjunctionDropdown     :"+actconjunctionDropdown        +" Value Expected  : "+expconjunctionDropdown); 
		System.out.println("selectFieldTxt          :"+actselectFieldTxt             +" Value Expected  : "+expselectFieldTxt);
		System.out.println("selectOperatorDropdown  :"+actselectOperatorDropdown     +"  Value Expected : "+expselectOperatorDropdown); 
		System.out.println("compareWithDropdown     :"+actcompareWithDropdown        +" Value Expected  : "+expcompareWithDropdown);
		System.out.println("valueTxt                :"+actvalueTxt                   +" Value Expected  : "+expvalueTxt);
		
		if(actconjunctionDropdown.equals(expconjunctionDropdown) && actselectFieldTxt.equalsIgnoreCase(expselectFieldTxt) && 
				actselectOperatorDropdown.equals(expselectOperatorDropdown)
				&& actcompareWithDropdown.equals(expcompareWithDropdown) && actvalueTxt.equalsIgnoreCase(expvalueTxt))
		{
			System.out.println("Test Pass : Data entered");
			excelReader.setCellData(xlfile, xlSheetName, 59, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Data NOT entered");
			excelReader.setCellData(xlfile, xlSheetName, 59, 9, resFail);
			return false;
		}
		
	}
	
	
	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div[1]/ul[1]/li[3]/a")
	public static WebElement alertTabInEdit;
	
	@FindBy(xpath="//u[contains(text(),'SMS template')]")
	public static WebElement headerSMSTemplate;	
	
	
	public boolean 	checkEditOnSelectAlertsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertTabInEdit));
		alertTabInEdit.click();
		
		Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
		 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
	     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
		 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
		 boolean actstoppedChkBox                    = stoppedChkBox.isDisplayed();
		 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
		 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
	     boolean actheaderSMSTemplate          		 = headerSMSTemplate.isDisplayed();
		 boolean actheaderAlert                      = headerAlert.isDisplayed();
		 boolean actheaderRecipient                  = headerRecipient.isDisplayed();
		 
		 boolean expreceivedChkBox                   = true;
		 boolean expapprovedChkBox                   = true;
		 boolean exprejectedChkBox                   = true;
		 boolean expstoppedChkBox                    = true;
		 boolean expemailHeaderTemplateBtn           = true;
		 boolean expemailTemplateBtn                 = true;
		 boolean expheaderSMSTemplate                = true;
		 boolean expheaderAlert                      = true;
		 boolean expheaderRecipient                  = true;
		 	
		 System.out.println("****************************** checkEditOnSelectAlertsTabOptions  ********************************************");
		 
		 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
		 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
		 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
		 System.out.println("StoppedChkBox     			   :"+actstoppedChkBox          +"	 Value Expected : "+expstoppedChkBox);
		 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
		 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
		 System.out.println("HeaderSMSTemplate             :"+actheaderSMSTemplate      +"	 Value Expected : "+expheaderSMSTemplate);
		 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
		 System.out.println("HeaderRecipient               :"+actheaderRecipient        +"	 Value Expected : "+expheaderRecipient);
		  	
		 boolean actMethod=actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
				 && actstoppedChkBox==expstoppedChkBox && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
				  && actemailTemplateBtn==expemailTemplateBtn && actheaderSMSTemplate==expheaderSMSTemplate 
			     && actheaderAlert==expheaderAlert && actheaderRecipient==expheaderRecipient;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 66, 7);
			excelReader.setCellData(xlfile, xlSheetName, 66, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 65, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 65, 9, resFail);
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//input[@id='smsTemplateOptCtrl']")
	public static WebElement emailTemplates;
	
	@FindBy(xpath="//i[@class='icon-open icon-font7']")
	public static WebElement companyMenu;
	
	@FindBy(xpath="//span[contains(text(),'Company Name')]")
	public static WebElement companyNameSource;
	
	@FindBy(xpath="//textarea[@id='txtTemplate']")
	public static WebElement companyNameTemplateArea;
	
	@FindBy(xpath="//span[@id='btnSaveSmsTemplate']")
	public static WebElement saveBtnInEmailTemplateHeader;
	
	@FindBy(xpath="//span[@id='btnNewSmsTemplate']")
	public static WebElement newButtonInCreateTemplate;
	
	@FindBy(xpath="//span[@id='btnCloseSMSModal']")
	public static WebElement closeButtonInCreateTemplate;
	
	
	
	public boolean checkSaveWithAllMandatoryInputs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailHeaderTemplateBtn));
		emailHeaderTemplateBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyMenu));
		emailTemplates.sendKeys(excelReader.getCellData(xlSheetName, 67, 6));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
		companyNameTemplateArea.click();
		companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 68, 6));
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
		companyNameTemplateArea.click();
		companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 69, 6));
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
		saveBtnInEmailTemplateHeader.click();
		
		System.out.println("**************************************checkSaveWithAllMandatoryInputs*******************************");
		
        String expMessage=excelReader.getCellData(xlSheetName, 70, 7);
		
		String actMessage=checkValidationMessage(expMessage);
			
		excelReader.setCellData(xlfile, xlSheetName, 70, 8, actMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeButtonInCreateTemplate));
		closeButtonInCreateTemplate.click();
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 67, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 67, 9, resFail);
			return false;
		}
	}
	
	@FindBy(xpath="//td[@id='id_tblAlerts_col_1-2']")
	public static WebElement recievedEmailHeaderTemplate;
	
	@FindBy(xpath="//select[@id='id_tblAlerts_EmailHeaderTemplate']")
	public static WebElement receivedEmailHeaderTemplateInput;
	
	
	public boolean checkCreatedEmailInEmailHedaerTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
		receivedChkBox.click();
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(recievedEmailHeaderTemplate));
		recievedEmailHeaderTemplate.click();
		
		
		//receivedEmailHeaderTemplateInput.click();
		
		//Thread.sleep(2000);
		
		
		Select s=new Select(receivedEmailHeaderTemplateInput);
		s.selectByVisibleText(excelReader.getCellData(xlSheetName, 72, 6));
		
		//receivedEmailHeaderTemplateInput.sendKeys("createEmailTemplate");
		
		Thread.sleep(2000);
		
		//receivedEmailHeaderTemplateInput.click();
		
		//Thread.sleep(2000);
		
		
		String actreceivedEmailHeaderTemplateInput=receivedEmailHeaderTemplateInput.getText();
		String expreceivedEmailHeaderTemplateInput=excelReader.getCellData(xlSheetName, 72, 7);
		excelReader.setCellData(xlfile, xlSheetName, 72, 8, actreceivedEmailHeaderTemplateInput);
		
		System.out.println("**************************************checkCreatedEmailInEmailHedaerTemplate*********************");
		
		System.out.println(" receivedEmailHeaderTemplateInput  :"+actreceivedEmailHeaderTemplateInput+"  Value Expected : "+expreceivedEmailHeaderTemplateInput);
		
		if(actreceivedEmailHeaderTemplateInput.equalsIgnoreCase(expreceivedEmailHeaderTemplateInput))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 71, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 71, 9, resFail);
			return false;
		}
	}
	
	


	@FindBy(xpath="//span[contains(text(),'Header')]//i[@class='icon-expand icon-font8']")
	public static WebElement  Finance_Purchases_HeaderExpandBtn;
	
	@FindBy(xpath="//span[contains(text(),'Header')]//i[@class='icon-collepse icon-font8']")
	public static WebElement  Finance_Purchases_HeaderMinimiseBtn;
	
	@FindBy(xpath="//span[contains(text(),'Miscellaneous')]//i[@class='icon-expand icon-font8']")
	public static WebElement MiscellaneousExpandBtn;
	
	@FindBy(xpath="//span[contains(text(),'Company')]//i[@class='icon-expand icon-font8']")
	public static WebElement CompanyExpandBtn;
	
	@FindBy(xpath="//span[contains(text(),'Company')]//i[@class='icon-collepse icon-font8']")
	public static WebElement CompanyMinimiseBtn;
	
	@FindBy(xpath="//span[contains(text(),'User details')]//i[@class='icon-expand icon-font8']")
	public static WebElement  UserDetailsExpandbtn;
	
	@FindBy(xpath="//span[contains(text(),'Body')]//i[@class='icon-expand icon-font8']")
	public static WebElement  PSS_BodyExpandBtn;
	
	@FindBy(xpath="//span[contains(text(),'Body')]//i[@class='icon-collepse icon-font8']")
	public static WebElement  PSS_BodyMinimizeBtn;

			
	@FindBy(xpath="//span[contains(text(),'Company Name')]")
	public static WebElement  Company_CompanyNamedraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Company Code')]")
	public static WebElement  Company_CompanyCodedraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Accounting Date')]")
	public static WebElement  Comapny_AccountingDateExpandbtn;
						
	@FindBy(xpath="//span[contains(text(),'Tax Registration Number')]")
	public static WebElement  Company_TaxRegistrationNumber;
	
	@FindBy(xpath="//span[contains(text(),'Excise Registration Number')]")
	public static WebElement  Company_ExciseRegistrationNumber;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	public static WebElement  Newdropdown;


	public boolean checkEmailTemplateCompanyExpandInFieldsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplateBtn));
	 	 emailTemplateBtn.click();
	
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Newdropdown));
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CompanyExpandBtn));
		 CompanyExpandBtn.click();
		
	
		 Thread.sleep(3000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_Company_CompanyName));
		 boolean actfields_Company_CompanyName                     = fields_Company_CompanyName.isDisplayed();
	     boolean actfields_Company_CompanyCode                     = fields_Company_CompanyCode.isDisplayed();
		 boolean actfields_Company_AccountingDate                  = fields_Company_AccountingDate.isDisplayed();
		 boolean actfields_Company_Address1                        = fields_Company_Address1.isDisplayed();
		 boolean actfields_Company_Address2                        = fields_Company_Address2.isDisplayed();
		 boolean actfields_Company_City                            = fields_Company_City.isDisplayed();
	     boolean actfields_Company_Zipcode				           = fields_Company_Zipcode.isDisplayed();
		 boolean actfields_Company_Country                         = fields_Company_Country.isDisplayed();
		 boolean actfields_Company_PhoneNumber1                    = fields_Company_PhoneNumber1.isDisplayed();
		 boolean actfields_Company_PhoneNumber2                    = fields_Company_PhoneNumber2.isDisplayed();
		 boolean actfields_Company_Fax                             = fields_Company_Fax.isDisplayed();
		 boolean actfields_Company_TaxRegestrationNumber           = fields_Company_TaxRegestrationNumber.isDisplayed();
		 boolean actfields_Company_ExciseRegistrationNumber        = fields_Company_ExciseRegistrationNumber.isDisplayed();
		 
		 boolean expfields_Company_CompanyName                     = true;
		 boolean expfields_Company_CompanyCode                     = true;
		 boolean expfields_Company_AccountingDate                  = true;
		 boolean expfields_Company_Address1                        = true;
		 boolean expfields_Company_Address2                        = true;
		 boolean expfields_Company_City                            = true;
		 boolean expfields_Company_Zipcode                         = true;
		 boolean expfields_Company_Country                         = true;
		 boolean expfields_Company_PhoneNumber1                    = true;
		 boolean expfields_Company_PhoneNumber2                    = true;
		 boolean expfields_Company_Fax                             = true;
		 boolean expfields_Company_TaxRegestrationNumber           = true;
		 boolean expfields_Company_ExciseRegistrationNumber        = true;
		 
			
		 System.out.println("****************************** checkEmailTemplateCompanyExpandInFieldsTabOptions  ********************************************");
		 
		 System.out.println("fields_Company_CompanyName          :"+actfields_Company_CompanyName              +"    Value Expected : "+expfields_Company_CompanyName);
		 System.out.println("fields_Company_CompanyCode          :"+actfields_Company_CompanyCode              +"    Value Expected : "+expfields_Company_CompanyCode);
		 System.out.println("fields_Company_AccountingDate       :"+actfields_Company_AccountingDate           +"	 Value Expected : "+expfields_Company_AccountingDate);
		 System.out.println("fields_Company_Address1             :"+actfields_Company_Address1                 +"	 Value Expected : "+expfields_Company_Address1);
		 System.out.println("fields_Company_Address2             :"+actfields_Company_Address2                 +"	 Value Expected : "+expfields_Company_Address2);
		 System.out.println("fields_Company_City      	         :"+actfields_Company_City                     +"	 Value Expected : "+expfields_Company_City);
		 System.out.println("fields_Company_Zipcode              :"+actfields_Company_Zipcode                  +"	 Value Expected : "+expfields_Company_Zipcode);
		 System.out.println("fields_Company_Country              :"+actfields_Company_Country                  +"	 Value Expected : "+expfields_Company_Country);
		 System.out.println("fields_Company_PhoneNumber1         :"+actfields_Company_PhoneNumber1             +"	 Value Expected : "+expfields_Company_PhoneNumber1);
		 System.out.println("fields_Company_PhoneNumber2         :"+actfields_Company_PhoneNumber2             +"	 Value Expected : "+expfields_Company_PhoneNumber2);
		 System.out.println("fields_Company_Fax                  :"+actfields_Company_Fax                      +"	 Value Expected : "+expfields_Company_Fax);
		 System.out.println("fields_Company_TaxRegNumber         :"+actfields_Company_TaxRegestrationNumber    +"	 Value Expected : "+expfields_Company_TaxRegestrationNumber);
		 System.out.println("fields_Company_ExciseRegNumber      :"+actfields_Company_ExciseRegistrationNumber +"    Value Expected : "+expfields_Company_ExciseRegistrationNumber);
		 
		 boolean actMethod=actfields_Company_CompanyName==expfields_Company_CompanyName  && actfields_Company_CompanyCode==expfields_Company_CompanyCode 
				 && actfields_Company_AccountingDate==expfields_Company_AccountingDate
				 && actfields_Company_Address1==expfields_Company_Address1  && actfields_Company_Address2==expfields_Company_Address2
				 && actfields_Company_City==expfields_Company_City && actfields_Company_Zipcode==expfields_Company_Zipcode 
			     && actfields_Company_Country==expfields_Company_Country
			     && actfields_Company_PhoneNumber1==expfields_Company_PhoneNumber1
				 && actfields_Company_PhoneNumber2==expfields_Company_PhoneNumber2
				 && actfields_Company_Fax==expfields_Company_Fax 
				 && actfields_Company_TaxRegestrationNumber==expfields_Company_TaxRegestrationNumber  
				 && actfields_Company_ExciseRegistrationNumber==expfields_Company_ExciseRegistrationNumber;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 74, 7);
			excelReader.setCellData(xlfile, xlSheetName, 74, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Fields Options Are Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CompanyMinimiseBtn));
			CompanyMinimiseBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 73, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Fields Options Are NOT Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CompanyMinimiseBtn));
			CompanyMinimiseBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 73, 9, resFail);
			return false;
		}
	}

	

	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'DocNo')]")
	public static WebElement  Finance_Purchases_Header_DocNOdraganddrop;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
	public static WebElement  Finance_Purchases_Header_DateExpandBtn;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
	public static WebElement  Finance_Purchases_Header_TimeExpandBtn;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'PurchaseAC')]")
	public static WebElement Finance_Purchases_Header_PurchaseAcExpandBtn;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'VendorAC')]")
	public static WebElement Finance_Purchases_Header_VendorACExpandBtn;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'UpdateStock')]")
	public static WebElement  Finance_Purchases_Header_UpdateStockBtn;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'RaiseReceipt')]")
	public static WebElement  Finance_Purchases_Header_RaiseReceiptBtn;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[8]/a")
	public static WebElement  Finance_Purchases_Header_WareHouseExpandBtn;
				
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[9]/a")
	public static WebElement  Finance_Purchases_Header_DepartmentExpandBtn;
				
	@FindBy(xpath="//span[contains(text(),'sNarration')]")
	public static WebElement  Finance_Purchases_Narrationdraganddrop;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Test')]")
	public static WebElement  Finance_Purchases_Testdraganddrop;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[12]/a")
	public static WebElement  Finance_Purchases_Userdraganddrop;
					
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[13]/a")
	public static WebElement  Finance_Purchases_Roledraganddrop;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'FD%')]")
	public static WebElement  Finance_Purchases_FDdragAndDrop;
	
	@FindBy(xpath="//i[@class='icon-collepse icon-font8']")
	public static WebElement  FieldsMinimizeBtn;
	

	

	
	public boolean 	checkFieldsTabMasterFieldsOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_MasterFieldsExpandBtn));
		fields_MasterFieldsExpandBtn.click();
		
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_sName));
	     boolean actfields_sName                        = fields_sName.isDisplayed();
		 boolean actfields_sCode                        = fields_sCode.isDisplayed();
		 boolean actfields_iAccountType                 = fields_iAccountType.isDisplayed();
		 boolean actfields_fCreditLimit                 = fields_fCreditLimit.isDisplayed();
		 boolean actfields_iCreditDays                  = fields_iCreditDays.isDisplayed();
		 boolean actfields_iDebitCreditProposal         = fields_iDebitCreditProposal.isDisplayed();
		 boolean actfields_iDebitCreditRequired         = fields_iDebitCreditRequired.isDisplayed();
		 boolean actfields_iExchangeAdjustmentGainAC    = fields_iExchangeAdjustmentGainAC.isDisplayed();
		 boolean actfields_iExchangeAdjustmentLossAC    = fields_iExchangeAdjustmentLossAC.isDisplayed();
		 boolean actfields_iPrimaryAccount              = fields_iPrimaryAccount.isDisplayed();
		 boolean actfields_iDefaultCurrency             = fields_iDefaultCurrency.isDisplayed();
		 boolean actfields_iConsolidationMethod         = fields_iConsolidationMethod.isDisplayed();
		 boolean actfields_iPaymentTerms                = fields_iPaymentTerms.isDisplayed();
		 boolean actfields_iReminderTerms               = fields_iReminderTerms.isDisplayed();
		 boolean actfields_iFinanceChargeTerms          = fields_iFinanceChargeTerms.isDisplayed();
		 boolean actfields_sAddress                 	= fields_sAddress.isDisplayed();
		 boolean actfields_sDeliveryAddress             = fields_sDeliveryAddress.isDisplayed();
		 boolean actfields_sDeliveryPin                 = fields_sDeliveryPin.isDisplayed();
		 boolean actfields_sPin                			= fields_sPin.isDisplayed();
		 boolean actfields_iCity               		    = fields_iCity.isDisplayed();
		 boolean actfields_iDeliveryCity                = fields_iDeliveryCity.isDisplayed();
	     boolean actfields_sEmail                       = fields_sEmail.isDisplayed();
		 boolean actfields_bSendEmailtocustomer         = fields_bSendEmailtocustomer.isDisplayed();
		 boolean actfields_fChequeDiscountLimit         = fields_fChequeDiscountLimit.isDisplayed();
		 boolean actfields_fRateofinterest              = fields_fRateofinterest.isDisplayed();
		 boolean actfields_iBankAc                      = fields_iBankAc.isDisplayed();
		 boolean actfields_sTelNo                       = fields_sTelNo.isDisplayed();
		 boolean actfields_sFaxNo                       = fields_sFaxNo.isDisplayed();
		 boolean actfields_sPassword                    = fields_sPassword.isDisplayed();
		 boolean actfields_bAllowCustomerPortal         = fields_bAllowCustomerPortal.isDisplayed();
		 
		 boolean expfields_sName                        = true;
		 boolean expfields_sCode            			= true;
		 boolean expfields_iAccountType             	= true;
		 boolean expfields_fCreditLimit                 = true;
		 boolean expfields_iCreditDays               	= true;
		 boolean expfields_iDebitCreditProposal         = true;
		 boolean expfields_iDebitCreditRequired         = true;
		 boolean expfields_iExchangeAdjustmentGainAC    = true;
		 boolean expfields_iExchangeAdjustmentLossAC    = true;
		 boolean expfields_iPrimaryAccount              = true;
		 boolean expfields_iDefaultCurrency             = true;
		 boolean expfields_iConsolidationMethod         = true;
		 boolean expfields_iPaymentTerms                = true;
		 boolean expfields_iReminderTerms               = true;
		 boolean expfields_iFinanceChargeTerms          = true;
		 boolean expfields_sAddress                     = true;
		 boolean expfields_sDeliveryAddress             = true;
		 boolean expfields_sDeliveryPin                 = true;
		 boolean expfields_sPin                         = true;
		 boolean expfields_iCity                        = true;
		 boolean expfields_iDeliveryCity                = true;
		 boolean expfields_sEmail                  		= true;
		 boolean expfields_bSendEmailtocustomer         = true;
		 boolean expfields_fChequeDiscountLimit 		= true;
		 boolean expfields_fRateofinterest            	= true;
		 boolean expfields_iBankAc                      = true;
		 boolean expfields_sTelNo                       = true;
		 boolean expfields_sFaxNo         				= true;
		 boolean expfields_sPassword               		= true;
		 boolean expfields_bAllowCustomerPortal         = true;
		 	
		 System.out.println("****************************** checkConditionTabOptions  ********************************************");
		 
		 System.out.println("Fields_sName                         :"+actfields_sName                     +"   Value Expected : "+expfields_sName);
		 System.out.println("Fields_sCode                         :"+actfields_sCode                     +"   Value Expected : "+expfields_sCode);
		 System.out.println("Fields_iAccountType                  :"+actfields_iAccountType              +"	  Value Expected : "+expfields_iAccountType);
		 System.out.println("Fields_fCreditLimit                  :"+actfields_fCreditLimit              +"	  Value Expected : "+expfields_fCreditLimit);
		 System.out.println("Fields_iCreditDays                   :"+actfields_iCreditDays               +"	  Value Expected : "+expfields_iCreditDays);
		 System.out.println("Fields_iDebitCreditProposal          :"+actfields_iDebitCreditProposal      +"	  Value Expected : "+expfields_iDebitCreditProposal);
		 System.out.println("Fields_iDebitCreditRequired          :"+actfields_iDebitCreditRequired      +"	  Value Expected : "+expfields_iDebitCreditRequired);
		 System.out.println("Fields_iExchangeAdjustmentGainAC     :"+actfields_iExchangeAdjustmentGainAC +"	  Value Expected : "+expfields_iExchangeAdjustmentGainAC);
		 System.out.println("Fields_iExchangeAdjustmentLossAC     :"+actfields_iExchangeAdjustmentLossAC +"	  Value Expected : "+expfields_iExchangeAdjustmentLossAC);
		 System.out.println("Fields_iPrimaryAccount               :"+actfields_iPrimaryAccount           +"	  Value Expected : "+expfields_iPrimaryAccount);
		 System.out.println("Fields_iDefaultCurrency              :"+actfields_iDefaultCurrency          +"	  Value Expected : "+expfields_iDefaultCurrency);
		 System.out.println("Fields_iConsolidationMethod          :"+actfields_iConsolidationMethod      +"   Value Expected : "+expfields_iConsolidationMethod);
		 System.out.println("Fields_iPaymentTerms                 :"+actfields_iPaymentTerms             +"	  Value Expected : "+expfields_iPaymentTerms);
		 System.out.println("Fields_iReminderTerms                :"+actfields_iReminderTerms            +"	  Value Expected : "+expfields_iReminderTerms);
		 System.out.println("Fields_iFinanceChargeTerms           :"+actfields_iFinanceChargeTerms       +"	  Value Expected : "+expfields_iFinanceChargeTerms);
		 System.out.println("Fields_sAddress                      :"+actfields_sAddress                  +"	  Value Expected : "+expfields_sAddress);
		 System.out.println("Fields_sDeliveryAddress              :"+actfields_sDeliveryAddress          +"	  Value Expected : "+expfields_sDeliveryAddress);
		 System.out.println("CompareWithDropdown                  :"+actfields_sDeliveryPin              +"	  Value Expected : "+expfields_sDeliveryPin);
		 System.out.println("Fields_sPin                          :"+actfields_sPin                      +"	  Value Expected : "+expfields_sPin);
		 System.out.println("Fields_iCity                         :"+actfields_iCity                     +"	  Value Expected : "+expfields_iCity);
		 System.out.println("Fields_iDeliveryCity                 :"+actfields_iDeliveryCity             +"	  Value Expected : "+expfields_iDeliveryCity);
		 System.out.println("Fields_sEmail                        :"+actfields_sEmail                    +"   Value Expected : "+expfields_sEmail);
		 System.out.println("Fields_bSendEmailtocustomer          :"+actfields_bSendEmailtocustomer      +"   Value Expected : "+expfields_bSendEmailtocustomer);
		 System.out.println("Fields_fChequeDiscountLimit          :"+actfields_fChequeDiscountLimit      +"	  Value Expected : "+expfields_fChequeDiscountLimit);
		 System.out.println("Fields_fRateofinterest               :"+actfields_fRateofinterest           +"	  Value Expected : "+expfields_fRateofinterest);
		 System.out.println("Fields_iBankAc                       :"+actfields_iBankAc                   +"	  Value Expected : "+expfields_iBankAc);
		 System.out.println("Fields_sTelNo                        :"+actfields_sTelNo                    +"	  Value Expected : "+expfields_sTelNo);
		 System.out.println("KeepUnpostedReservationChkBox        :"+actfields_sFaxNo                    +"	  Value Expected : "+expfields_sFaxNo);
		 System.out.println("Fields_sPassword                     :"+actfields_sPassword                 +"   Value Expected : "+expfields_sPassword);
		 System.out.println("Fields_bAllowCustomerPortal          :"+actfields_bAllowCustomerPortal      +"	  Value Expected : "+expfields_bAllowCustomerPortal);
		 
		 
		 boolean actMethod=actfields_sName==expfields_sName  && actfields_sCode==expfields_sCode 
				 && actfields_iAccountType==expfields_iAccountType && actfields_fCreditLimit==expfields_fCreditLimit 
				 && actfields_iCreditDays==expfields_iCreditDays && actfields_iDebitCreditProposal==expfields_iDebitCreditProposal
			     && actfields_iDebitCreditRequired==expfields_iDebitCreditRequired && actfields_iExchangeAdjustmentGainAC==expfields_iExchangeAdjustmentGainAC 
			     && actfields_iExchangeAdjustmentLossAC==expfields_iExchangeAdjustmentLossAC && actfields_iPrimaryAccount==expfields_iPrimaryAccount
			     && actfields_iDefaultCurrency==expfields_iDefaultCurrency 
				 && actfields_iConsolidationMethod==expfields_iConsolidationMethod && actfields_iPaymentTerms==expfields_iPaymentTerms 
				 && actfields_iReminderTerms==expfields_iReminderTerms&& actfields_iFinanceChargeTerms==expfields_iFinanceChargeTerms
				 && actfields_sAddress==expfields_sAddress && actfields_sDeliveryAddress==expfields_sDeliveryAddress  
				 && actfields_sDeliveryPin==expfields_sDeliveryPin && actfields_sPin==expfields_sPin && actfields_iCity==expfields_iCity 
				 && actfields_iDeliveryCity==expfields_iDeliveryCity && actfields_sEmail==expfields_sEmail && actfields_bSendEmailtocustomer==expfields_bSendEmailtocustomer  
				 && actfields_fChequeDiscountLimit==expfields_fChequeDiscountLimit && actfields_fRateofinterest==expfields_fRateofinterest 
				 && actfields_iBankAc==expfields_iBankAc && actfields_sTelNo==expfields_sTelNo && actfields_sFaxNo==expfields_sFaxNo 
				 && actfields_sPassword==expfields_sPassword && actfields_bAllowCustomerPortal==expfields_bAllowCustomerPortal;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 76, 7);
			excelReader.setCellData(xlfile, xlSheetName, 76, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Field MasterFields Options Are Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_MinimizeBtn));
			fields_MinimizeBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 75, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Field MasterFields Options Are NOT Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_MinimizeBtn));
			fields_MinimizeBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 75, 9, resFail);
			return false;
		}
	}

	///Change 
	

	public boolean 	checkFieldsTabUserDetailsOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_UserDetailsExpandBtn));
		fields_UserDetailsExpandBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDetails_UserName));
	     boolean actuserDetails_UserName                        = userDetails_UserName.isDisplayed();
		 boolean actuserDetails_MobileNumber                    = userDetails_MobileNumber.isDisplayed();
		 boolean actuserDetails_EmailId                         = userDetails_EmailId.isDisplayed();
		 boolean actuserDetails_Signature                       = userDetails_Signature.isDisplayed();
		 boolean actuserDetails_Employee                        = userDetails_Employee.isDisplayed();
		 boolean actuserDetails_AuthoriseUserName               = userDetails_AuthoriseUserName.isDisplayed();
		 boolean actuserDetails_AuthoriseUserMobileNumber       = userDetails_AuthoriseUserMobileNumber.isDisplayed();
		 boolean actuserDetails_AuthoriseUserPhoneNumber        = userDetails_AuthoriseUserPhoneNumber.isDisplayed();
		 boolean actuserDetails_AuthoriseUserEmailId            = userDetails_AuthoriseUserEmailId.isDisplayed();
		 boolean actuserDetails_AuthoriseUserSignature          = userDetails_AuthoriseUserSignature.isDisplayed();
		 boolean actuserDetails_AuthoriseBy               		= userDetails_AuthoriseBy.isDisplayed();
		 boolean actuserDetails_NextAuthoriseUserName           = userDetails_NextAuthoriseUserName.isDisplayed();
		 boolean actuserDetails_NextUserPhoneNumber             = userDetails_NextUserPhoneNumber.isDisplayed();
		 boolean actuserDetails_NextUserMobileNumber            = userDetails_NextUserMobileNumber.isDisplayed();
		 boolean actuserDetails_NextUserEmailId                 = userDetails_NextUserEmailId.isDisplayed();
		 boolean actuserDetails_NextUserSignature               = userDetails_NextUserSignature.isDisplayed();
		 boolean actuserDetails_CreatedBySignature              = userDetails_CreatedBySignature.isDisplayed();
		 boolean actuserDetails_ModifiedBySignature             = userDetails_ModifiedBySignature.isDisplayed();
		 
		 boolean expuserDetails_UserName                        = true;
		 boolean expuserDetails_MobileNumber            		= true;
		 boolean expuserDetails_EmailId             			= true;
		 boolean expuserDetails_Signature                  		= true;
		 boolean expuserDetails_Employee               			= true;
		 boolean expuserDetails_AuthoriseUserName           	= true;
		 boolean expuserDetails_AuthoriseUserMobileNumber       = true;
		 boolean expuserDetails_AuthoriseUserPhoneNumber        = true;
		 boolean expuserDetails_AuthoriseUserEmailId            = true;
		 boolean expuserDetails_AuthoriseUserSignature          = true;
		 boolean expuserDetails_AuthoriseBy                     = true;
		 boolean expuserDetails_NextAuthoriseUserName           = true;
		 boolean expuserDetails_NextUserPhoneNumber             = true;
		 boolean expuserDetails_NextUserMobileNumber            = true;
		 boolean expuserDetails_NextUserEmailId                 = true;
		 boolean expuserDetails_NextUserSignature               = true;
		 boolean expuserDetails_CreatedBySignature              = true;
		 boolean expuserDetails_ModifiedBySignature             = true;
		 	
		 System.out.println("****************************** checkFieldsTabUserDetailsOptions  ********************************************");
		 
		 System.out.println("userDetails_UserName                  :"+actuserDetails_UserName                  +"   Value Expected : "+expuserDetails_UserName);
		 System.out.println("userDetails_MobileNumber              :"+actuserDetails_MobileNumber              +"   Value Expected : "+userDetails_MobileNumber);
		 System.out.println("userDetails_EmailId                   :"+actuserDetails_EmailId                   +"	Value Expected : "+expuserDetails_EmailId);
		 System.out.println("userDetails_Signature                 :"+actuserDetails_Signature                 +"	Value Expected : "+expuserDetails_Signature);
		 System.out.println("userDetails_Employee                  :"+actuserDetails_Employee                  +"	Value Expected : "+expuserDetails_Employee);
		 System.out.println("userDetails_AuthoriseUserName         :"+actuserDetails_AuthoriseUserName         +"	Value Expected : "+expuserDetails_AuthoriseUserName);
		 System.out.println("userDetails_AuthorUserMobileNumber    :"+actuserDetails_AuthoriseUserMobileNumber +"	Value Expected : "+expuserDetails_AuthoriseUserMobileNumber);
		 System.out.println("userDetails_AuthoriseUserPhoneNumber  :"+actuserDetails_AuthoriseUserPhoneNumber  +"	Value Expected : "+expuserDetails_AuthoriseUserPhoneNumber);
		 System.out.println("userDetails_AuthoriseUserEmailId      :"+actuserDetails_AuthoriseUserEmailId      +"	Value Expected : "+expuserDetails_AuthoriseUserEmailId);
		 System.out.println("userDetails_AuthoriseUserSignature    :"+actuserDetails_AuthoriseUserSignature    +"	Value Expected : "+expuserDetails_AuthoriseUserSignature);
		 System.out.println("userDetails_AuthoriseBy               :"+actuserDetails_AuthoriseBy               +"	Value Expected : "+expuserDetails_AuthoriseBy);
		 System.out.println("userDetails_NextAuthoriseUserName     :"+actuserDetails_NextAuthoriseUserName     +"   Value Expected : "+expuserDetails_NextAuthoriseUserName);
		 System.out.println("userDetails_NextUserPhoneNumber       :"+actuserDetails_NextUserPhoneNumber       +"	Value Expected : "+expuserDetails_NextUserPhoneNumber);
		 System.out.println("userDetails_NextUserMobileNumber      :"+actuserDetails_NextUserMobileNumber      +"	Value Expected : "+expuserDetails_NextUserMobileNumber);
		 System.out.println("userDetails_NextUserEmailId           :"+actuserDetails_NextUserEmailId           +"   Value Expected : "+expuserDetails_NextUserEmailId);
		 System.out.println("userDetails_NextUserSignature         :"+actuserDetails_NextUserSignature         +"	Value Expected : "+expuserDetails_NextUserSignature);
		 System.out.println("userDetails_CreatedBySignature        :"+actuserDetails_CreatedBySignature        +"	Value Expected : "+expuserDetails_CreatedBySignature);
		 System.out.println("userDetails_ModifiedBySignature       :"+actuserDetails_ModifiedBySignature       +"   Value Expected : "+expuserDetails_ModifiedBySignature);
		  
		 
		 boolean actMethod=actuserDetails_UserName==expuserDetails_UserName  && actuserDetails_MobileNumber==expuserDetails_MobileNumber 
				 && actuserDetails_EmailId==expuserDetails_EmailId && actuserDetails_Signature==expuserDetails_Signature 
				 && actuserDetails_Employee==expuserDetails_Employee && actuserDetails_AuthoriseUserName==expuserDetails_AuthoriseUserName
			     && actuserDetails_AuthoriseUserMobileNumber==expuserDetails_AuthoriseUserMobileNumber && actuserDetails_AuthoriseUserPhoneNumber==expuserDetails_AuthoriseUserPhoneNumber 
			     && actuserDetails_AuthoriseUserEmailId==expuserDetails_AuthoriseUserEmailId
			     && actuserDetails_AuthoriseUserSignature==expuserDetails_AuthoriseUserSignature && actuserDetails_AuthoriseBy==expuserDetails_AuthoriseBy 
				 && actuserDetails_NextAuthoriseUserName==expuserDetails_NextAuthoriseUserName && actuserDetails_NextUserPhoneNumber==expuserDetails_NextUserPhoneNumber
				 && actuserDetails_NextUserMobileNumber==expuserDetails_NextUserMobileNumber 
				 && actuserDetails_NextUserEmailId==expuserDetails_NextUserEmailId && actuserDetails_NextUserSignature==expuserDetails_NextUserSignature 
				 && actuserDetails_CreatedBySignature==expuserDetails_CreatedBySignature && actuserDetails_ModifiedBySignature==expuserDetails_ModifiedBySignature;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 77, 7);
			excelReader.setCellData(xlfile, xlSheetName, 77, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Field UserDetails Options Are Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_MinimizeBtn));
			fields_MinimizeBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 77, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Field UserDdetails Options Are NOT Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_MinimizeBtn));
			fields_MinimizeBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 77, 9, resFail);
			return false;
		}
	}
	


    public boolean 	checkFieldsTabMiscellaneousOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    {
	
	
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	    Thread.sleep(3000);
	
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_MiscellaneousExpandBtn));
	    fields_MiscellaneousExpandBtn.click();
	
	    Thread.sleep(2000);
	
	    boolean actmiscellaneous_Logindate             = miscellaneous_Logindate.isDisplayed();
		boolean actmiscellaneous_PageNumber            = miscellaneous_PageNumber.isDisplayed();
		boolean actmiscellaneous_Printdate             = miscellaneous_Printdate.isDisplayed();
		boolean actmiscellaneous_PrintTime             = miscellaneous_PrintTime.isDisplayed();
		boolean actmiscellaneous_TotalPage             = miscellaneous_TotalPage.isDisplayed();
		boolean actmiscellaneous_Sno                   = miscellaneous_Sno.isDisplayed();
		boolean actmiscellaneous_PageType              = miscellaneous_PageType.isDisplayed();
		boolean actmiscellaneous_AgeingDetails         = miscellaneous_AgeingDetails.isDisplayed();
		boolean actmiscellaneous_AgeingHeadings        = miscellaneous_AgeingHeadings.isDisplayed();
		boolean actmiscellaneous_Ageingbalance         = miscellaneous_Ageingbalance.isDisplayed();
		boolean actmiscellaneous_AgeingSlab1           = miscellaneous_AgeingSlab1.isDisplayed();
		boolean actmiscellaneous_AgeingSlab2           = miscellaneous_AgeingSlab2.isDisplayed();
		boolean actmiscellaneous_AgeingSlab3           = miscellaneous_AgeingSlab3.isDisplayed();
		boolean actmiscellaneous_AgeingSlab4           = miscellaneous_AgeingSlab4.isDisplayed();
		boolean actmiscellaneous_AgeingSlab5           = miscellaneous_AgeingSlab5.isDisplayed();
		boolean actmiscellaneous_AgeingSlab6           = miscellaneous_AgeingSlab6.isDisplayed();
		boolean actmiscellaneous_AgeingMonthWise       = miscellaneous_AgeingMonthWise.isDisplayed();
		
		boolean expmiscellaneous_Logindate             = true;
		boolean expmiscellaneous_PageNumber            = true;
		boolean expmiscellaneous_Printdate             = true;
		boolean expmiscellaneous_PrintTime             = true;
		boolean expmiscellaneous_TotalPage             = true;
		boolean expmiscellaneous_Sno                   = true;
		boolean expmiscellaneous_PageType              = true;
		boolean expmiscellaneous_AgeingDetails         = true;
		boolean expmiscellaneous_AgeingHeadings        = true;
		boolean expmiscellaneous_Ageingbalance         = true;
		boolean expmiscellaneous_AgeingSlab1           = true;
		boolean expmiscellaneous_AgeingSlab2           = true;
		boolean expmiscellaneous_AgeingSlab3           = true;
		boolean expmiscellaneous_AgeingSlab4           = true;
		boolean expmiscellaneous_AgeingSlab5           = true;
		boolean expmiscellaneous_AgeingSlab6           = true;
		boolean expmiscellaneous_AgeingMonthWise       = true;
		
		System.out.println("****************************** checkToolsOptionsDepartmentMenu  ********************************************");
	
		System.out.println("miscellaneous_Logindate           :"+actmiscellaneous_Logindate       +"Value Expected : "+expmiscellaneous_Logindate);
		System.out.println("miscellaneous_PageNumber          :"+actmiscellaneous_PageNumber      +"Value Expected : "+expmiscellaneous_PageNumber);
		System.out.println("miscellaneous_Printdate           :"+actmiscellaneous_Printdate       +"Value Expected : "+expmiscellaneous_Printdate);
		System.out.println("miscellaneous_PrintTime           :"+actmiscellaneous_PrintTime       +"Value Expected : "+expmiscellaneous_PrintTime);
		System.out.println("miscellaneous_TotalPage           :"+actmiscellaneous_TotalPage       +"Value Expected : "+expmiscellaneous_TotalPage);
		System.out.println("miscellaneous_Sno                 :"+actmiscellaneous_Sno             +"Value Expected : "+expmiscellaneous_Sno);
		System.out.println("miscellaneous_PageType            :"+actmiscellaneous_PageType        +"Value Expected : "+expmiscellaneous_PageType);
		System.out.println("miscellaneous_AgeingDetails       :"+actmiscellaneous_AgeingDetails   +"Value Expected : "+expmiscellaneous_AgeingDetails);
		System.out.println("miscellaneous_AgeingHeadings      :"+actmiscellaneous_AgeingHeadings  +"Value Expected : "+expmiscellaneous_AgeingHeadings);
		System.out.println("miscellaneous_Ageingbalance       :"+actmiscellaneous_Ageingbalance   +"Value Expected : "+expmiscellaneous_Ageingbalance);
		System.out.println("miscellaneous_AgeingSlab1         :"+actmiscellaneous_AgeingSlab1     +"Value Expected : "+expmiscellaneous_AgeingSlab1);
		System.out.println("miscellaneous_AgeingSlab2         :"+actmiscellaneous_AgeingSlab2     +"Value Expected : "+expmiscellaneous_AgeingSlab2);
		System.out.println("miscellaneous_AgeingSlab3         :"+actmiscellaneous_AgeingSlab3     +"Value Expected : "+expmiscellaneous_AgeingSlab3);
		System.out.println("miscellaneous_AgeingSlab4         :"+actmiscellaneous_AgeingSlab4     +"Value Expected : "+expmiscellaneous_AgeingSlab4);
		System.out.println("miscellaneous_AgeingSlab5         :"+actmiscellaneous_AgeingSlab5     +"Value Expected : "+expmiscellaneous_AgeingSlab5);
		System.out.println("miscellaneous_AgeingSlab6         :"+actmiscellaneous_AgeingSlab6     +"Value Expected : "+expmiscellaneous_AgeingSlab6);
		System.out.println("miscellaneous_AgeingMonthWise     :"+actmiscellaneous_AgeingMonthWise +"Value Expected : "+expmiscellaneous_AgeingMonthWise);
		
		
		
		boolean actMethod=actmiscellaneous_Logindate==expmiscellaneous_Logindate  && actmiscellaneous_PageNumber==expmiscellaneous_PageNumber
				&& actmiscellaneous_Printdate==expmiscellaneous_Printdate && actmiscellaneous_PrintTime==expmiscellaneous_PrintTime
				&& actmiscellaneous_TotalPage==expmiscellaneous_TotalPage && actmiscellaneous_PageType==expmiscellaneous_PageType 
				&& actmiscellaneous_Sno==expmiscellaneous_Sno && actmiscellaneous_AgeingDetails==expmiscellaneous_AgeingDetails
				&& actmiscellaneous_AgeingDetails==expmiscellaneous_AgeingDetails && actmiscellaneous_AgeingSlab1==expmiscellaneous_AgeingSlab1
				&& actmiscellaneous_Ageingbalance==expmiscellaneous_Ageingbalance && actmiscellaneous_AgeingSlab2==expmiscellaneous_AgeingSlab2
				&& actmiscellaneous_AgeingSlab3==expmiscellaneous_AgeingSlab3 && actmiscellaneous_AgeingSlab4==expmiscellaneous_AgeingSlab4
	            && actmiscellaneous_AgeingSlab5==expmiscellaneous_AgeingSlab5 && actmiscellaneous_AgeingSlab6==expmiscellaneous_AgeingSlab6 
	            && actmiscellaneous_AgeingMonthWise==expmiscellaneous_AgeingMonthWise;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 78, 7);
		excelReader.setCellData(xlfile, xlSheetName, 78, 8, actResult);
			
		
	if(actResult.equalsIgnoreCase(expResult))
	{
		System.out.println("Test Pass : Field Miscellaneous Options Are Displayed");
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_MinimizeBtn));
		fields_MinimizeBtn.click();
		excelReader.setCellData(xlfile, xlSheetName, 78, 9, resPass);
		return true;
	}
	else
	{
		System.out.println("Test Fail : Field Miscellaneous Options Are NOT Displayed");
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_MinimizeBtn));
		fields_MinimizeBtn.click();
		
		excelReader.setCellData(xlfile, xlSheetName, 78, 9, resFail);
		return false;
	}
}





public boolean 	checkDesignAreaPrintScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	
	Thread.sleep(3000);
	
	boolean HeaderDesignerTab=headerDesignerTab.isDisplayed();
	
	String actheaderDesignerTab=Boolean.toString(HeaderDesignerTab);
	String  expheaderDesignerTab=excelReader.getCellData(xlSheetName, 79, 7);
	excelReader.setCellData(xlfile, xlSheetName, 79, 8, actheaderDesignerTab);
	
	System.out.println("**************************************checkDesignAreaPrintScreen*******************************************************");
	
	System.out.println("headerDesignerTab     : "+actheaderDesignerTab+"  Value Expected  : "+expheaderDesignerTab);
	
	if(actheaderDesignerTab.equalsIgnoreCase(expheaderDesignerTab))
	{
		System.out.println("Test Pass : Design Area is Displayed");
		excelReader.setCellData(xlfile, xlSheetName, 79, 9, resPass);
		return true;
	}
	else
	{
		System.out.println("Test Fail : Design Area is NOT Displayed");
		excelReader.setCellData(xlfile, xlSheetName, 79, 9, resFail);
		return false;
	}
  }



	
	public boolean checkFieldsDragInHeaderOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_MasterFieldsExpandBtn));
		fields_MasterFieldsExpandBtn.click();
		
		Thread.sleep(5000);
		
	    Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\print.exe");
	 
		Thread.sleep(100000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerPropertiesTab));
		headerPropertiesTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Savedropdown));
		Savedropdown.click();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedEmailTemplatePrintSaveBtn));
		receivedEmailTemplatePrintSaveBtn.click();
		
		Thread.sleep(4000);
		
		saveLayoutName.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveLayoutName));
		saveLayoutName.sendKeys(excelReader.getCellData(xlSheetName, 81, 6));
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveLayoutOkBtn));
		saveLayoutOkBtn.click();
		

		String expMessage=excelReader.getCellData(xlSheetName, 81, 7);
		
		String actMessage=checkValidationMessage(expMessage);
			
		excelReader.setCellData(xlfile, xlSheetName, 81, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 80, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 80, 9, resFail);
			return false;
		}
		
	
}	
	



@FindBy(xpath="//i[@class='icon-font6 icon-save']")
public static WebElement  Savedropdown;

	@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[1]")
	public static WebElement  PrintSaveBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[2]")
	public static WebElement  SaveAsBtn; 
	
	@FindBy(xpath="//input[@id='id_PopuplayoutName']")
	public static WebElement  SaveTxtField;
	
	@FindBy(xpath="//input[@id='id_PopuplayoutName']")
	public static WebElement  Save_OkBtn;
	
	@FindBy(xpath="//*[@id='id_PopUp']/div/div/div[3]/button[2]")
	public static WebElement  Save_CancekBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[3]")
	public static WebElement  SaveAsImageBtn; //No Response
	
	@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[4]")
	public static WebElement  SaveAsXMLBtn; // Downloads xml file
	
	@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[5]")
	public static WebElement  SaveAsHTMLBtn; 

	@FindBy(xpath="//span[@class='dropdown theme_icon-color open']//a[1]")
	public static WebElement receivedEmailTemplatePrintSaveBtn;	
	
	@FindBy(xpath="//input[@id='id_PopuplayoutName']")
	public static WebElement saveLayoutName;	
		
	@FindBy(xpath="//button[@id='btn_PopUpOk']")
	public static WebElement saveLayoutOkBtn;	
	
	@FindBy(xpath="//div[@id='id_PopUp']//button[@class='Fbutton'][contains(text(),'Cancel')]")
	public static WebElement saveLayoutCancelBtn;	
	
	@FindBy(xpath="//a[contains(text(),'Static Text')]")
	public static WebElement controlStaticText;	


	
	
	
	@FindBy(xpath="//*[@id='id_InvoiceDesingCancel']/i")
	public static WebElement  ExitBtn;	
	
	
	
	public boolean checkExitOptionInLayout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExitBtn));
		ExitBtn.click();
		
        Thread.sleep(2000);
			      
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerSMSTemplate));
        
        
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
		 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
	     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
		 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
		 boolean actstoppedChkBox                    = stoppedChkBox.isDisplayed();
		 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
		 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
	     boolean actheaderSMSTemplate          		 = headerSMSTemplate.isDisplayed();
		 boolean actheaderAlert                      = headerAlert.isDisplayed();
		 boolean actheaderRecipient                  = headerRecipient.isDisplayed();
		 
		 boolean expreceivedChkBox                   = true;
		 boolean expapprovedChkBox                   = true;
		 boolean exprejectedChkBox                   = true;
		 boolean expstoppedChkBox                    = true;
		 boolean expemailHeaderTemplateBtn           = true;
		 boolean expemailTemplateBtn                 = true;
		 boolean expheaderSMSTemplate                = true;
		 boolean expheaderAlert                      = true;
		 boolean expheaderRecipient                  = true;
		 	
		 System.out.println("******************************************* checkExitOptionInLayout  ********************************************");
		 
		 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
		 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
		 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
		 System.out.println("StoppedChkBox     			   :"+actstoppedChkBox          +"	 Value Expected : "+expstoppedChkBox);
		 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
		 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
		 System.out.println("HeaderSMSTemplate             :"+actheaderSMSTemplate      +"	 Value Expected : "+expheaderSMSTemplate);
		 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
		 System.out.println("HeaderRecipient               :"+actheaderRecipient        +"	 Value Expected : "+expheaderRecipient);
		  	
		 
		 boolean actMethod=actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
				 && actstoppedChkBox==expstoppedChkBox && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
				  && actemailTemplateBtn==expemailTemplateBtn && actheaderSMSTemplate==expheaderSMSTemplate 
			     && actheaderAlert==expheaderAlert && actheaderRecipient==expheaderRecipient;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 83, 7);
			excelReader.setCellData(xlfile, xlSheetName, 83, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 82, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 82, 9, resFail);
			return false;
		}
	}
	
	
	@FindBy(xpath="//span[@id='btnNewSmsTemplate']")
	public static WebElement smsTemplateLayoutNewBtn;	
	
	@FindBy(xpath="//span[@id='btnSaveSmsTemplate']")
	public static WebElement smsTemplateLayoutSaveBtn;	

	@FindBy(xpath="//span[@id='btnCloseSMSModal']")
	public static WebElement smsTemplateLayoutCloseBtn;	
		
	@FindBy(xpath="//span[@class='FBold theme_icon-color'][contains(text(),'Users')]")
	public static WebElement smsTemplateLayoutUsers;	
	
	@FindBy(xpath="//span[@class='FBold theme_icon-color'][contains(text(),'Company')]")
	public static WebElement smsTemplateLayoutCompany;	
	
	@FindBy(xpath="//span[contains(text(),'Body')]")
	public static WebElement smsTemplateLayoutBody;	
	
	@FindBy(xpath="//span[contains(text(),'Header')]")
	public static WebElement smsTemplateLayoutHeader;	
	
	@FindBy(xpath="//td[@id='id_tblAlerts_col_1-3']")
	public static WebElement receivedEmailTemplateClick;	
	
	@FindBy(xpath="//select[@id='id_tblAlerts_EmailTemplate']")
	public static WebElement receivedEmailTemplateInput;
	
	
	
	public boolean checkSavedEmailTemplateInEmailTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedEmailTemplateClick));
		receivedEmailTemplateClick.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(recievedEmailHeaderTemplate));
		recievedEmailHeaderTemplate.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedEmailTemplateClick));
		receivedEmailTemplateClick.click();
		
		Thread.sleep(3000);
		
		receivedEmailTemplateInput.click();
		
		Select s=new Select(receivedEmailTemplateInput);
		s.selectByVisibleText(excelReader.getCellData(xlSheetName, 85, 6));
	
	
		Thread.sleep(3000);
		
		receivedEmailTemplateInput.click();
		
		Thread.sleep(3000);
		
		
		String actreceivedEmailTemplateInput=receivedEmailTemplateInput.getText();
		
		String expreceivedEmailTemplateInput=excelReader.getCellData(xlSheetName, 85, 7);
		excelReader.setCellData(xlfile, xlSheetName, 85, 8, actreceivedEmailTemplateInput);
		
		System.out.println("******************************************************checkSavedEmailTemplateInEmailTemplate*******************************"); 
		
		
		System.out.println("receivedEmailTemplateInput     : "+actreceivedEmailTemplateInput+"   VAlue Expected : "+expreceivedEmailTemplateInput); 
		
		if(actreceivedEmailTemplateInput.equalsIgnoreCase(expreceivedEmailTemplateInput))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 84, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 84, 9, resFail);
			return false;
		}
		
	}
	
	
	
	
	@FindBy(xpath="//td[@id='id_tblAlerts_col_1-4']")
	public static WebElement receivedSMSTemplateClick;	
	
	@FindBy(xpath="//select[@id='id_tblAlerts_SMSTemplate']")
	public static WebElement smsTemplateInput;	
	
	
	public boolean checkSavedSMSTemplateInTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerSMSTemplate));
		headerSMSTemplate.click();
		
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyMenu));
		emailTemplates.sendKeys(excelReader.getCellData(xlSheetName, 87, 6));
		Thread.sleep(2000);
		emailTemplates.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
		companyNameTemplateArea.click();
		companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 88, 6));
		companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 89, 6));
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
		saveBtnInEmailTemplateHeader.click();
		
		Thread.sleep(2000);

		String expMessage=excelReader.getCellData(xlSheetName, 90, 7);
		
		String actMessage=checkValidationMessage(expMessage);
				
		excelReader.setCellData(xlfile, xlSheetName, 90, 8, actMessage);
		
		
		
		if (smsTemplateLayoutCloseBtn.isDisplayed())
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(smsTemplateLayoutCloseBtn));
			smsTemplateLayoutCloseBtn.click();
		}
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedSMSTemplateClick));
		receivedSMSTemplateClick.click();
		
		Thread.sleep(3000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(smsTemplateInput));
		smsTemplateInput.click();
		
		
		smsTemplateInput.sendKeys(excelReader.getCellData(xlSheetName, 91, 6));
		
		smsTemplateInput.click();
		
		Thread.sleep(3000);
		
		String actsmsTemplateInput=smsTemplateInput.getText();
		String expsmsTemplateInput=excelReader.getCellData(xlSheetName, 91, 7);
		excelReader.setCellData(xlfile, xlSheetName, 91, 8, actsmsTemplateInput);
		
		System.out.println("*************************************************checkSavedSMSTemplateInTemplate*********************************");
		
		System.out.println("smsTemplateInput   :  "+actsmsTemplateInput+"  Value Expected : "+expsmsTemplateInput);
		
		smsTemplateInput.sendKeys(Keys.TAB);
		
		if(actsmsTemplateInput.equalsIgnoreCase(expsmsTemplateInput))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 86, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 86, 9, resFail);
			return false;
		}
	}	
	
	
	@FindBy(xpath="//td[@id='id_tblAlerts_col_1-5']")
	public static WebElement alertsTemplateClick;	
	
	@FindBy(xpath="//select[@id='id_tblAlerts_Alerts']")
	public static WebElement alertsTemplateInput;	
	

	
	
	public boolean checkSavedAlertTemplateInTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		

        Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAlert));
		headerAlert.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplates));
		emailTemplates.sendKeys(excelReader.getCellData(xlSheetName, 93, 6));
		
		Thread.sleep(2000);
		emailTemplates.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
		companyNameTemplateArea.click();
		companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 94, 6));
		companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 95, 6));
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
		saveBtnInEmailTemplateHeader.click();
		

        String expMessage=excelReader.getCellData(xlSheetName, 96, 7);
		
		String actMessage=checkValidationMessage(expMessage);
				
		excelReader.setCellData(xlfile, xlSheetName, 96, 8, actMessage);
		
		if (smsTemplateLayoutCloseBtn.isDisplayed())
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(smsTemplateLayoutCloseBtn));
			smsTemplateLayoutCloseBtn.click();
		}
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedSMSTemplateClick));
		receivedSMSTemplateClick.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertsTemplateClick));
		alertsTemplateClick.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertsTemplateInput));
		alertsTemplateInput.click();
		
		Thread.sleep(3000);
		
		alertsTemplateInput.sendKeys(excelReader.getCellData(xlSheetName, 97, 7));
	
		Thread.sleep(3000);
		
		alertsTemplateInput.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		Select s=new Select(alertsTemplateInput);
		
		String actalertsTemplateInput=s.getFirstSelectedOption().getText();
	
		String expalertsTemplateInput=excelReader.getCellData(xlSheetName, 97, 7);
		excelReader.setCellData(xlfile, xlSheetName, 97, 8, actalertsTemplateInput);
		
		
		System.out.println("*********************************checkSavedAlertTemplateInTemplate*****************************"); 
	
		
		System.out.println("AlertsTemplateInput     : "+actalertsTemplateInput +"  Value Expected : "+expalertsTemplateInput);
	
		
		if(actalertsTemplateInput.equalsIgnoreCase(expalertsTemplateInput))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 92, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 92, 9, resFail);
			return false;
		}
	}	
	
	
	
	
	
	
	public boolean checkSaveButtonWithCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		System.out.println("********************checkSaveButtonWithCondition*******************************");
		
		boolean actendpoint=endpoint.isDisplayed();
		boolean expendpoint=true;
		
		System.out.println("Endpoint   : "+actendpoint +"  Value Expected :"+expendpoint);
		
		if(actendpoint==expendpoint)
		{
			System.out.println("Test Pass : Image Displayed In Design Area");
			excelReader.setCellData(xlfile, xlSheetName, 98, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area");
			excelReader.setCellData(xlfile, xlSheetName, 98, 9, resFail);
			return false;
		}
		
		
	}
	
	
	@FindBy(xpath="//i[@class='icon-font7 icon-save']")
	public static WebElement saveBtnAuthorization;	
	
	
	public boolean checkSaveAuthorizationWithConditionAndAlerts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
		Thread.sleep(5000);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		System.out.println("***********************************checkSaveAuthorizationWithConditionAndAlerts****************************************************"); 
		

        String expMessage=excelReader.getCellData(xlSheetName, 101, 7);
		
		String actMessage=checkValidationMessage(expMessage);
				
		excelReader.setCellData(xlfile, xlSheetName, 101, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 100, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 100, 9, resFail);
			return false;
		}
	}
	
	

	public boolean 	checkClearButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearbtn));
		clearbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
		String actmasterDropdown=masterDropdown.getAttribute("placeholder");
		String expmasterDropdown=excelReader.getCellData(xlSheetName, 104, 7);
		excelReader.setCellData(xlfile, xlSheetName, 104, 8, actmasterDropdown);
		
	    System.out.println("******************************checkClearButton********************");
		
		System.out.println("MasterDropdown    : "+actmasterDropdown+"   Value Expected : "+expmasterDropdown); 
	
		
		if( actmasterDropdown.equalsIgnoreCase(expmasterDropdown))
		{
			System.out.println("Test Pass : Master Dropdown Options Are As expected");
			excelReader.setCellData(xlfile, xlSheetName, 102, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Master Dropdown Options Are NOT As expected");
			excelReader.setCellData(xlfile, xlSheetName, 102, 9, resFail);
			return false;
		}
		
	}
	
	
	
	@FindBy(xpath="//li[contains(text(),'Warehouse')]")
	public static WebElement selectWarehouse;	
	
	
	@FindBy(xpath="//span[@id='spnAddLevel']//i[@class='icon-new icon-font7']")
	public static WebElement addLevelButton;	

	
	public boolean checkAlertMessageOnDeleteAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		masterDropdown.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
		
		Thread.sleep(3000);
		
		masterDropdown.sendKeys(excelReader.getCellData(xlSheetName, 106, 6));
				
		Thread.sleep(3000);
		
		masterDropdown.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 107, 6));
		
		Thread.sleep(3000);
		
		nameTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		addLevelButton.click();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		descriptionTxt.sendKeys(excelReader.getCellData(xlSheetName, 108, 6));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
		conditionNotRequiredChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
		userDropdown.click();
		
		userDropdown.sendKeys(excelReader.getCellData(xlSheetName, 109, 6));
		
		Thread.sleep(3000);
		
		userDropdown.sendKeys(Keys.TAB);
					
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		errorMessageCloseBtn.click();
		
		Thread.sleep(5000);
		
        nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 110, 6));
		
		Thread.sleep(3000);
		
		nameTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteBtn));
		deleteBtn.click();
					
		//Working with delete option
		getWaitForAlert();
		
		System.out.println("***********************************checkAlertMessageOnDeleteAuthorization**************************"); 
		
		String actAlert=this.getDriver().switchTo().alert().getText();
		String expAlert=excelReader.getCellData(xlSheetName, 111, 7);
		excelReader.setCellData(xlfile, xlSheetName, 111, 8, actAlert);
	

		System.out.println(" Alert Message Displayed : "+actAlert +"  Value Expected  : "+expAlert);
		
		if(actAlert.equalsIgnoreCase(expAlert))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 105, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 105, 9, resFail);
			return false;
		}
	}
	
	
	
		
	public boolean 	checkCancelInAlertDeleteOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		this.getDriver().switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		String actdata,expdata;
		
		String actnameTxt=nameTxt.getAttribute("value");
		String expnameTxt=excelReader.getCellData(xlSheetName, 113, 7);
		excelReader.setCellData(xlfile, xlSheetName, 113, 8, actnameTxt);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();

		System.out.println("****************************checkCancelInAlertDeleteOption**********"); 
		
		System.out.println("NameTxt  : "+actnameTxt +"  Value Expected : "+expnameTxt);
		
		if(actnameTxt.equalsIgnoreCase(expnameTxt))
		{
			excelReader.setCellData(xlfile, xlSheetName, 112, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 112, 9, resFail);
			return false;
		}
		
	}
	
	
	

	public boolean 	checkOkInAlertDeleteOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteBtn));
		deleteBtn.click();
		
		
		//Working with delete option
		
		getWaitForAlert();
		
		this.getDriver().switchTo().alert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 115, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		
		excelReader.setCellData(xlfile, xlSheetName, 115, 8, actMessage);
		
		String actnameTxt=nameTxt.getAttribute("placeholder");
		String expnameTxt=excelReader.getCellData(xlSheetName, 116, 7);
		excelReader.setCellData(xlfile, xlSheetName, 116, 8, actnameTxt);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();

		
		System.out.println("*************************************checkOkInAlertDeleteOption************************");
		
		System.out.println("nameTxt     : "+actnameTxt +"  Value Expected : "+expnameTxt);
		System.out.println("Message     : "+actMessage +"  Value Expected : "+expMessage);
		
		if(actnameTxt.equalsIgnoreCase(expnameTxt) && actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, xlSheetName, 114, 9, resPass);
			return true;
         		
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 114, 9, resFail);
			return false;
		}
	}
	

	
	public boolean checkCloseAndLogoutTheCompany() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		   excelReader=new ExcelReader(POJOUtility.getExcelPath());
		   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		   Thread.sleep(3000);
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
		   cancelBtn.click();
			
		   Thread.sleep(3000);
		  
		   getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		   userNameDisplay.click();

		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		   logoutOption.click();
  
			boolean verifyFiledsStatus=true;
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
			
			boolean actusername                 = username.isDisplayed();
			boolean actcompanyDropDownList      = companyDropDownList.isDisplayed();
			boolean actsignIn                   = signIn.isDisplayed();
			
			boolean expusername                 = true;
			boolean expcompanyDropDownList      = true;
			boolean expsignIn                   = true;
			
			System.out.println("*******************************************checkCloseAndLogoutTheCompany*************************");
			
			System.out.println("username              : "+actusername            +"  Value Expected : "+expusername);
			System.out.println("companyDropDownList   : "+actcompanyDropDownList +"  Value Expected : "+expcompanyDropDownList);
			System.out.println("signIn                : "+actsignIn              +"  Value Expected : "+expsignIn);
			
			boolean actMethod=actusername==expusername&& password.isDisplayed()
					&&actcompanyDropDownList==expcompanyDropDownList&& actsignIn==expsignIn;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 118, 7);
			excelReader.setCellData(xlfile, xlSheetName, 118, 8, actResult);
				
			
			if(actResult.equalsIgnoreCase(expResult))
			{
				excelReader.setCellData(xlfile, xlSheetName, 117, 9, resPass);
			    return true;
						 
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 117, 9, resFail);
				return false;
		    }
	}
	
	
		
	public boolean 	checkConditionnotRequiredascheckedandSavebuttonwithManadatoryFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();

		nameTxt.sendKeys("AuthWithNoCondition");
		nameTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		getAction().doubleClick(startPointBtn).build().perform();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
		conditionTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		
		descriptionTxt.sendKeys("AuthWithNoCondition");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
		conditionNotRequiredChkBox.click();
		
		Thread.sleep(2000);
		
		boolean actconditionNotRequiredChkBox=conditionNotRequiredChkBox.isSelected();
		boolean expconditionNotRequiredChkBox=true;
		
		System.out.println("**********************************************checkConditionnotRequiredascheckedandSavebuttonwithManadatoryFields**********");		
		System.out.println("ConditionNotRequiredChkBox      : "+actconditionNotRequiredChkBox +"  Value Expected : "+expconditionNotRequiredChkBox);
		
		if(actconditionNotRequiredChkBox==expconditionNotRequiredChkBox)
		{
			System.out.println("Test Pass : Successfully created AuthWithNoCondition");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT created AuthWithNoCondition");
			return false;
		}
		
	}
	 
		
		
	public boolean 	checkselectingInactiveintheActionofEntryStatus() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actionOnEntryStatusDropdown));
		actionOnEntryStatusDropdown.click();
		
		Select s=new Select(actionOnEntryStatusDropdown);
		s.selectByVisibleText("Inactive");
		
		String actactionOnEntryStatusDropdown=actionOnEntryStatusDropdown.getAttribute("value");
		String expactionOnEntryStatusDropdown="1";
		
		System.out.println("*****************************checkselectingInactiveintheActionofEntryStatus*************************");
		
		System.out.println("actionOnEntryStatusDropdown     : "+actactionOnEntryStatusDropdown +"  Value Expected : "+expactionOnEntryStatusDropdown);
		
		if(actactionOnEntryStatusDropdown.equals(expactionOnEntryStatusDropdown))
		{
			System.out.println("Test Pass : Selected Active Successfully");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Selected Active Successfully");
			return false;
		}
	}
		
		
		
	public boolean 	checkselectinguserFromUserSelectiontab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userdropdown));
		userdropdown.click();
		
		Select s=new Select(userdropdown);
		s.selectByVisibleText("ProductTestUser");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		
		System.out.println("*******************************checkselectinguserFromUserSelectiontab**************************");
		boolean actendpoint=endpoint.isDisplayed();
		boolean expendpoint=true;
		
		System.out.println("Endpoint   : "+actendpoint +"  Value Expected :"+expendpoint);
		
		if(actendpoint==expendpoint)
		{
			System.out.println("Test Pass : Image Displayed In Design Area");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area");
			return false;
		}
	}
	
	
	@FindBy(xpath="//div[@id='divLevel1']//div[@class='row clsDivAuthorizationName']")
	public static WebElement level1;
	
	
	
	public boolean 	checkMasterAuthorizationAreaLevel1CheckwithDescriptionNameasAuthWithNoCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1));
		
		String actdata,expdata;
		
		String actlevel1=level1.getText();
		String explevel1="AuthWithNoCondition";

		System.out.println("*************************checkMasterAuthorizationAreaLevel1CheckwithDescriptionNameasAuthWithNoCondition*******************");
		
		System.out.println("level1   : "+actlevel1 +"  Value Expected : "+explevel1);
		
		if(actlevel1.equalsIgnoreCase(explevel1))
		{
			System.out.println("Test Pass : level 1 is As Expected");
			return true;
		}
		else
		{
			System.out.println("Test Fail : level 1 is NOT As Expected");
			return false;
		}
		
	}
	
	
	public boolean 	checkSavingMasterAuthorizationAuthWithNoCondition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage="Authorization Flow saved successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		System.out.println("***************************checkSavingMasterAuthorizationAuthWithNoCondition**********************");
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			return false;
		}
	}
	
	
	
	
	public boolean 	checkMasterAuthorizationasAuthDateRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();

		nameTxt.sendKeys("AccAuthDateRange");
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(activeChkBox));
		activeChkBox.click();
		
		
		boolean actactiveChkBox=activeChkBox.isSelected();
		boolean expactiveChkBox=true;
		
		
		String actnameTxt=nameTxt.getAttribute("value");
		String expnameTxt="AccAuthDateRange";
		
		
		System.out.println("*************************checkMasterAuthorizationasAuthDateRange******************************");
		
		System.out.println("nameTxt        : "+actnameTxt       +"  Value Expected  : "+expnameTxt);
		System.out.println("activeChkBox   : "+actactiveChkBox  +"  Value Expected  : "+expactiveChkBox);
		
		if(actnameTxt.equalsIgnoreCase(expnameTxt) && actactiveChkBox==expactiveChkBox)
		{
			System.out.println("Test Pass : Successfully inputed AccAuthDateRange");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT inputed AccAuthDateRange");
			return false;
		}
	}
	

	
	public boolean 	checkStartPointAccAuthDateRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		getAction().doubleClick(startPointBtn).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
        boolean actconditionTab                 = conditionTab.isDisplayed();
		boolean actuserSelectionTab             = userSelectionTab.isDisplayed();
		boolean actalertsTab                    = alertsTab.isDisplayed();
		boolean actescalationTab                = escalationTab.isDisplayed();
		boolean actdefinitionOkBtn              = definitionOkBtn.isDisplayed();
		boolean actdefinitionCancelBtn          = definitionCancelBtn.isDisplayed();
		
		boolean expconditionTab                 = true;
		boolean expuserSelectionTab             = true;
		boolean expalertsTab                    = true;
		boolean expescalationTab                = true;
		boolean expdefinitionOkBtn              = true;
		boolean expdefinitionCancelBtn          = true;
		
		System.out.println("********************* checkStartPointAccAuthDateRange ******************");
	
		System.out.println("ConditionTab             :"+actconditionTab           +"    Value Expected : "+expconditionTab);
		System.out.println("UserSelectionTab         :"+actuserSelectionTab       +"    Value Expected : "+expuserSelectionTab);
		System.out.println("AlertsTab                :"+actalertsTab              +"	Value Expected : "+expalertsTab);
		System.out.println("EscalationTab            :"+actescalationTab          +"	Value Expected : "+expescalationTab);
		System.out.println("DefinitionOkBtn          :"+actdefinitionOkBtn        +"	Value Expected : "+expdefinitionOkBtn);
		System.out.println("DefinitionCancelBtn      :"+actdefinitionCancelBtn    +"	Value Expected : "+expdefinitionCancelBtn);
		
		if( actconditionTab==expconditionTab  && actuserSelectionTab==expuserSelectionTab &&
				actalertsTab==expalertsTab && actescalationTab==expescalationTab && actdefinitionCancelBtn==expdefinitionCancelBtn && 
				actdefinitionOkBtn==expdefinitionOkBtn)
			
		{
			System.out.println("Test Pass : Start Point works As Expected");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Start Point NOT works As Expected");
			return false;
		}
	}
	
	
	
	
	public boolean 	checkInputingAccWithDateRangeinDescription() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
		conditionTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		
		descriptionTxt.sendKeys("AccWithDateRange");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
		conditionNotRequiredChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateRangeChkBox));
		dateRangeChkBox.click();
		
		Thread.sleep(2000);
		
		
		boolean actconditionNotRequiredChkBox     = conditionNotRequiredChkBox.isSelected();
		boolean actdateRangeChkBox                = dateRangeChkBox.isSelected();
		
		boolean expconditionNotRequiredChkBox     = true;
		boolean expdateRangeChkBox                = true;
		
		
		System.out.println("***************************************checkInputingAccWithDateRangeinDescription****************************");
		
		System.out.println("conditionNotRequiredChkBox     : "+actconditionNotRequiredChkBox   +"  Value Expected  : "+expconditionNotRequiredChkBox);
		System.out.println("dateRangeChkBox                : "+actdateRangeChkBox              +"  Value Expected  : "+expdateRangeChkBox);
		
		if(actconditionNotRequiredChkBox==expconditionNotRequiredChkBox && actdateRangeChkBox==expdateRangeChkBox)
		{
			System.out.println("Test Pass : Successfully created AccWithDateRange");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT created AccWithDateRange");
			return false;
		}
		
	}
	
	
	
	public boolean 	checkselectingInActiveintheActionofEntryStatusAccWithDateRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actionOnEntryStatusDropdown));
		actionOnEntryStatusDropdown.click();
		
		Select s=new Select(actionOnEntryStatusDropdown);
		s.selectByVisibleText("Inactive");
		
		String actactionOnEntryStatusDropdown=actionOnEntryStatusDropdown.getAttribute("value");
		String expactionOnEntryStatusDropdown="1";
		
		System.out.println("****************************************checkselectingInActiveintheActionofEntryStatusAccWithDateRange********************");
		
		System.out.println("actionOnEntryStatusDropdown    : "+actactionOnEntryStatusDropdown+"  Value Expected : "+expactionOnEntryStatusDropdown);	
		
		if(actactionOnEntryStatusDropdown.equals(expactionOnEntryStatusDropdown))
			
		{
			System.out.println("Test Pass : Selected Active Successfully");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Selected Active Successfully");
			return false;
		}
	}
	
	
	public boolean 	checkselectinguserFromUserSelectiontabAccWithDateRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userdropdown));
		userdropdown.click();
		
		Select s=new Select(userdropdown);
		s.selectByVisibleText("ProductTestUser");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1));
		
		
	    String 	actlevel1=level1.getText();
	    String 	explevel1="AccWithDateRange";
	    
	    boolean actendpoint=endpoint.isDisplayed();
	    boolean expendpoint = true;
	    
	    
	    System.out.println("*************************checkselectinguserFromUserSelectiontabAccWithDateRange*******");
		
	    System.out.println("level1   : "+actlevel1     +"  Value Expected : "+explevel1);
	    System.out.println("Endpoint   : "+actendpoint +"  Value Expected : "+expendpoint);
	    
		if(actlevel1.equalsIgnoreCase(explevel1) && actendpoint==expendpoint)
		{
			System.out.println("Test Pass : Image Displayed In Design Area With Level 1");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area With Level 1");
			return false;
		}
	}
	
	
	
	
	
	public boolean 	checkSavingMasterAuthorizationAccWithDateRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		getWaitForAlert();
		getAlert().accept();
		
		String expMessage="Authorization Flow saved successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		System.out.println("*************************checkSavingMasterAuthorizationAccWithDateRange******************************");
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			return false;
		}
	}
	
	
	
	
	
	public boolean 	checkMasterAuthorizationasAuthTimeRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();

		nameTxt.sendKeys("AccAuthTimeRange");
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(activeChkBox));
		activeChkBox.click();
		
		
		String actnameTxt=nameTxt.getAttribute("value");
		String expnameTxt="AccAuthTimeRange";
		
		
		boolean actactiveChkBox=activeChkBox.isSelected();
		boolean expactiveChkBox=true;
		
		
		System.out.println("*********************************checkMasterAuthorizationasAuthTimeRange*****************************");
		
		System.out.println("NameTxt   : "+actnameTxt +"  Value Expected : "+expnameTxt);
		System.out.println("ActiveChkBox   : "+actactiveChkBox+"  Value Expected : "+expactiveChkBox);
		
		if(actnameTxt==expnameTxt && actactiveChkBox==expactiveChkBox)
		{
			System.out.println("Test Pass : Successfully inputed AccAuthTimeRange");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT inputed AccAuthTimeRange");
			return false;
		}
	}
	
	
	
	public boolean 	checkStartPointAccAuthTimeRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		getAction().doubleClick(startPointBtn).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
        boolean actconditionTab                 = conditionTab.isDisplayed();
		boolean actuserSelectionTab             = userSelectionTab.isDisplayed();
		boolean actalertsTab                    = alertsTab.isDisplayed();
		boolean actescalationTab                = escalationTab.isDisplayed();
		boolean actdefinitionOkBtn              = definitionOkBtn.isDisplayed();
		boolean actdefinitionCancelBtn          = definitionCancelBtn.isDisplayed();
		
		boolean expconditionTab                 = true;
		boolean expuserSelectionTab             = true;
		boolean expalertsTab                    = true;
		boolean expescalationTab                = true;
		boolean expdefinitionOkBtn              = true;
		boolean expdefinitionCancelBtn          = true;
		
		System.out.println("********************* checkStartPointAccAuthTimeRange ******************");
	
		System.out.println("ConditionTab             :"+actconditionTab           +"    Value Expected : "+expconditionTab);
		System.out.println("UserSelectionTab         :"+actuserSelectionTab       +"    Value Expected : "+expuserSelectionTab);
		System.out.println("AlertsTab                :"+actalertsTab              +"	Value Expected : "+expalertsTab);
		System.out.println("EscalationTab            :"+actescalationTab          +"	Value Expected : "+expescalationTab);
		System.out.println("DefinitionOkBtn          :"+actdefinitionOkBtn        +"	Value Expected : "+expdefinitionOkBtn);
		System.out.println("DefinitionCancelBtn      :"+actdefinitionCancelBtn    +"	Value Expected : "+expdefinitionCancelBtn);
		
		if( actconditionTab==expconditionTab  && actuserSelectionTab==expuserSelectionTab &&
				actalertsTab==expalertsTab && actescalationTab==expescalationTab && actdefinitionCancelBtn==expdefinitionCancelBtn && 
				actdefinitionOkBtn==expdefinitionOkBtn)
	
		{
			System.out.println("Test Pass : Start Point works As Expected");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Start Point NOT works As Expected");
			return false;
		}
	}
	
	
	
	
	public boolean 	checkInputingAccWithTimeRangeinDescription() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
		conditionTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		
		descriptionTxt.sendKeys("AccWithTimeRange");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
		conditionNotRequiredChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(timeRangeChkBox));
		timeRangeChkBox.click();
		
		Thread.sleep(2000);
		
		System.out.println("*******************************checkInputingAccWithTimeRangeinDescription*************************");
		boolean actconditionNotRequiredChkBox         = conditionNotRequiredChkBox.isSelected();
		boolean acttimeRangeChkBox                    = timeRangeChkBox.isSelected();
		
		boolean expconditionNotRequiredChkBox        = true;
		boolean exptimeRangeChkBox                   = true;
		
		System.out.println("************************************checkInputingAccWithTimeRangeinDescription****************");
		
		System.out.println("conditionNotRequiredChkBox   : "+actconditionNotRequiredChkBox   +"  Value Expected : "+expconditionNotRequiredChkBox);
		System.out.println("timeRangeChkBox              : "+acttimeRangeChkBox              +"  Value Expected : "+exptimeRangeChkBox);
		
		if(actconditionNotRequiredChkBox==expconditionNotRequiredChkBox && acttimeRangeChkBox==exptimeRangeChkBox)
		{
			System.out.println("Test Pass : Successfully created AccWithTimeRange");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT created AccWithTimeRange");
			return false;
		}
		
	}
	
	
	
	public boolean 	checkselectingInActiveintheActionofEntryStatusAccWithTimeRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actionOnEntryStatusDropdown));
		actionOnEntryStatusDropdown.click();
		
		Select s=new Select(actionOnEntryStatusDropdown);
		s.selectByVisibleText("Inactive");
		
		String actactionOnEntryStatusDropdown  = actionOnEntryStatusDropdown.getAttribute("value");
		String expactionOnEntryStatusDropdown  = "1";
		
		System.out.println("*******************************checkselectingInActiveintheActionofEntryStatusAccWithTimeRange******");
		
		System.out.println("ActionOnEntryStatusDropdown  : "+actactionOnEntryStatusDropdown +"  Value Expected : "+expactionOnEntryStatusDropdown);
		
		if(actactionOnEntryStatusDropdown==expactionOnEntryStatusDropdown)
		{
			System.out.println("Test Pass : Selected Active Successfully");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Selected Active Successfully");
			return false;
		}
	}
	
	
	public boolean 	checkselectinguserFromUserSelectiontabAccWithTimeRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userdropdown));
		userdropdown.click();
		
		Select s=new Select(userdropdown);
		s.selectByVisibleText("ProductTestUser");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1));
		
		String 	actlevel1=level1.getText();
	    String 	explevel1="AccWithTimeRange";
	    
	    boolean actendpoint=endpoint.isDisplayed();
	    boolean expendpoint = true;
	    
	    
	    System.out.println("*************************checkselectinguserFromUserSelectiontabAccWithTimeRange*******");
		
	    System.out.println("level1     : "+actlevel1     +"  Value Expected : "+explevel1);
	    System.out.println("Endpoint   : "+actendpoint   +"  Value Expected : "+expendpoint);
	    
		if(actlevel1.equalsIgnoreCase(explevel1) && actendpoint==expendpoint)
		
		{
			System.out.println("Test Pass : Image Displayed In Design Area With Level 1");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area With Level 1");
			return false;
		}
	}
	
	
	
	
	
	public boolean 	checkSavingMasterAuthorizationAccWithTimeRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		getWaitForAlert();
		getAlert().accept();
		
		
		System.out.println("************************************checkSavingMasterAuthorizationAccWithTimeRange*****************************");
		
		String expMessage="Authorization Flow saved successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			return false;
		}
	}
	
	
	public boolean checkConditionOptionsintheMasterAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();

		nameTxt.sendKeys("AccAuthConditionOnAccName");
		nameTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		getAction().doubleClick(startPointBtn).build().perform();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
		conditionTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		
		descriptionTxt.sendKeys("AccAuthConditionOnAccName");
		
		Thread.sleep(2000);
		
		boolean actconditionNotRequiredChkBox=conditionNotRequiredChkBox.isSelected();
		boolean expconditionNotRequiredChkBox=true;
		
		System.out.println("*********************************checkConditionOptionsintheMasterAuthorization**********************************");
		
		System.out.println("ConditionNotRequiredChkBox     : "+actconditionNotRequiredChkBox+"  Value Expected  : "+expconditionNotRequiredChkBox );
		
		if(actconditionNotRequiredChkBox==expconditionNotRequiredChkBox)
		{
			System.out.println("Test FAil : NOT created AccAuthConditionOnAccName");
			return false;
		}
		else
		{
			System.out.println("Test Pass : Successfully created AccAuthConditionOnAccName");
			return true;
		}
	}
	 
	
	
	public boolean checkCondtionFiledoptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
	    boolean actconjunctionDropdown                 = conjunctionDropdown.isDisplayed();
		boolean actselectFieldTxt                      = selectFieldTxt.isDisplayed();
		boolean actselectOperatorDropdown              = selectOperatorDropdown.isDisplayed();
		boolean actcompareWithDropdown                 = compareWithDropdown.isDisplayed();
		boolean actvalueTxt                            = valueTxt.isDisplayed();
		
		
		boolean expconjunctionDropdown                 = true;
		boolean expselectFieldTxt                      = true;
		boolean expselectOperatorDropdown              = true;
		boolean expcompareWithDropdown                 = true;
		boolean expvalueTxt                            = true;
		
		System.out.println("********************************************** checkCondtionFiledoptions ******************");
	
		System.out.println("ConjunctionDropdown               :"+actconjunctionDropdown    +"  Value Expected : "+expconjunctionDropdown);
		System.out.println("SelectFieldTxt                    :"+actselectFieldTxt         +"  Value Expected : "+expselectFieldTxt);
		System.out.println("SelectOperatorDropdown            :"+actselectOperatorDropdown +"  Value Expected : "+expselectOperatorDropdown);
		System.out.println("CompareWithDropdown               :"+actcompareWithDropdown    +"  Value Expected : "+expcompareWithDropdown);
		
		if( actconjunctionDropdown==expconjunctionDropdown  && actselectFieldTxt==expselectFieldTxt
				&& actselectOperatorDropdown==expselectOperatorDropdown && actcompareWithDropdown==expcompareWithDropdown && actvalueTxt==expvalueTxt)
		
		{
			System.out.println("Test Pass : Conditions Fileds Are Displayed");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Conditions Fileds Are NOT Displayed");
			return false;
		}
	}
	
	
	
	public boolean checkConjunctionFiledoptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
		conjunctionDropdown.click();
		
		Select s=new Select(conjunctionDropdown);
		int actconjunctionDropdown=s.getOptions().size();
		int expconjunctionDropdown=12;
		
		
		System.out.println("******************************checkConjunctionFiledoptions***************");
		
		System.out.println("conjunctionDropdown   : "+actconjunctionDropdown +"   Value Expected  : "+expconjunctionDropdown);
		
		if(actconjunctionDropdown==expconjunctionDropdown)
		{
			System.out.println("Test Pass : Conjunction Filed Options Are As Expected");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Conjunction Filed Options Are NOT As Expected");
			return false;
		}
			
	}
	
	
	public boolean checkSelectFiledoptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt));
		selectFieldTxt.click();
		
		 boolean actsName                           = sName.isDisplayed();
		 boolean actsCode                           = sCode.isDisplayed();
		 boolean actiAccountType                    = iAccountType.isDisplayed();
		 boolean actfCreditLimit                    = fCreditLimit.isDisplayed();
		 boolean actiCreditDays                     = iCreditDays.isDisplayed();
		 boolean actiDebitCreditProposal            = iDebitCreditProposal.isDisplayed();
		 boolean actiDebitCreditRequired            = iDebitCreditRequired.isDisplayed();
		 boolean actiExchangeAdjustmentGainAC       = iExchangeAdjustmentGainAC.isDisplayed();
		 boolean actiExchangeAdjustmentLossAC       = iExchangeAdjustmentLossAC.isDisplayed();
		 boolean actiPrimaryAccount                 = iPrimaryAccount.isDisplayed();
		 boolean actiConsolidationMethod            = iConsolidationMethod.isDisplayed();
		 boolean actsAddress                 	    = sAddress.isDisplayed();
		 boolean actsDeliveryAddress                = sDeliveryAddress.isDisplayed();
		 boolean actsPin                    		= sPin.isDisplayed();
		 boolean actsDeliveryPin                    = sDeliveryPin.isDisplayed();
		 boolean actiCity                 		    = iCity.isDisplayed();
		 boolean actiDeliveryCity                   = iDeliveryCity.isDisplayed();
		 boolean actsEmail                          = sEmail.isDisplayed();
		 boolean actbSendEmailtocustomer            = bSendEmailtocustomer.isDisplayed();
		 boolean actfChequeDiscountLimit            = fChequeDiscountLimit.isDisplayed();
		 boolean actfRateofinterest                 = fRateofinterest.isDisplayed();
	     boolean actiBankAC                  		= iBankAC.isDisplayed();
		 boolean actsTelNo                       	= sTelNo.isDisplayed();
		 boolean actsFaxNo 							= sFaxNo.isDisplayed();
		 boolean actsPassword            			= sPassword.isDisplayed();
		 boolean actbAllowCustomerPortal            = bAllowCustomerPortal.isDisplayed();
		 boolean actsBankAccountName          		= sBankAccountName.isDisplayed();
		 boolean actsBankAccountNumber         		= sBankAccountNumber.isDisplayed();
		 boolean actsIFSCCode               		= sIFSCCode.isDisplayed();
		 boolean actiPaymentType            		= iPaymentType.isDisplayed();
		 boolean actiPDCDiscountedAC    			= iPDCDiscountedAC.isDisplayed();
		 boolean actsFinanceEmail           		= sFinanceEmail.isDisplayed();
		 boolean actsPortalEmail   					= sPortalEmail.isDisplayed();
		 
		 boolean expsName                        	= true;
		 boolean expsCode           				= true;
		 boolean expiAccountType            		= true;
		 boolean expfCreditLimit                  	= true;
		 boolean expiCreditDays               		= true;
		 boolean expiDebitCreditProposal            = true;
		 boolean expiDebitCreditRequired            = true;
		 boolean expiExchangeAdjustmentGainAC       = true;
		 boolean expiExchangeAdjustmentLossAC       = true;
		 boolean expiPrimaryAccount                	= true;
		 boolean expiConsolidationMethod            = true;
		 boolean expsAddress                        = true;
		 boolean expsDeliveryAddress                = true;
		 boolean expsPin                            = true;
		 boolean expsDeliveryPin                    = true;
		 boolean expiCity                           = true;
		 boolean expiDeliveryCity                   = true;
		 boolean expsEmail                   		= true;
		 boolean expbSendEmailtocustomer            = true;
		 boolean expfChequeDiscountLimit            = true;
		 boolean expfRateofinterest                 = true;
		 boolean expiBankAC                 		= true;
		 boolean expsTelNo                          = true;
		 boolean expsFaxNo 							= true;
		 boolean expsPassword           			= true;
		 boolean expbAllowCustomerPortal            = true;
		 boolean expsBankAccountName          		= true;
		 boolean expsBankAccountNumber         		= true;
		 boolean expsIFSCCode               		= true;
		 boolean expiPaymentType            		= true;
		 boolean expiPDCDiscountedAC    			= true;
		 boolean expsFinanceEmail           		= true;
		 boolean expsPortalEmail   					= true;
			
		 System.out.println("****************************** checkSelectFiledoptions  ********************************************");
		 
		 System.out.println("sName                     :"+actsName                           +"  Value Expected : "+expsName);
		 System.out.println("sCode                     :"+actsCode                           +"  Value Expected : "+expsCode);
		 System.out.println("iAccountType              :"+actiAccountType                    +"	 Value Expected : "+expiAccountType);
		 System.out.println("fCreditLimit              :"+actfCreditLimit                    +"	 Value Expected : "+expfCreditLimit);
		 System.out.println("iCreditDays               :"+actiCreditDays                     +"	 Value Expected : "+expiCreditDays);
		 System.out.println("iDebitCreditProposal      :"+actiDebitCreditProposal            +"	 Value Expected : "+expiDebitCreditProposal);
		 System.out.println("iDebitCreditRequired      :"+actiDebitCreditRequired            +"	 Value Expected : "+expiDebitCreditRequired);
		 System.out.println("iExchangeAdjustmentGainAC :"+actiExchangeAdjustmentGainAC       +"	 Value Expected : "+expiExchangeAdjustmentGainAC);
		 System.out.println("iExchangeAdjustmentLossAC :"+actiExchangeAdjustmentLossAC       +"	 Value Expected : "+expiExchangeAdjustmentLossAC);
		 System.out.println("iPrimaryAccount           :"+actiPrimaryAccount                 +"	 Value Expected : "+expiPrimaryAccount);
		 System.out.println("iConsolidationMethod      :"+actiConsolidationMethod            +"	 Value Expected : "+expiConsolidationMethod);
		 System.out.println("sAddress                  :"+actsAddress                        +"  Value Expected : "+expsAddress);
		 System.out.println("sDeliveryAddress          :"+actsDeliveryAddress                +"	 Value Expected : "+expsDeliveryAddress);
		 System.out.println("sPin                      :"+actsPin                            +"	 Value Expected : "+expsPin);
		 System.out.println("sDeliveryPin              :"+actsDeliveryPin                    +"	 Value Expected : "+expsDeliveryPin);
		 System.out.println("iCity                     :"+actiCity                           +"	 Value Expected : "+expiCity);
		 System.out.println("iDeliveryCity             :"+actiDeliveryCity                   +"	 Value Expected : "+expiDeliveryCity);
		 System.out.println("sEmail                    :"+actsEmail                          +"	 Value Expected : "+expsEmail);
		 System.out.println("bSendEmailtocustomer      :"+actbSendEmailtocustomer            +"	 Value Expected : "+expbSendEmailtocustomer);
		 System.out.println("fChequeDiscountLimit      :"+actfChequeDiscountLimit            +"	 Value Expected : "+expfChequeDiscountLimit);
		 System.out.println("fRateofinterest           :"+actfRateofinterest                 +"	 Value Expected : "+expfRateofinterest);
		 System.out.println("iBankAC                   :"+actiBankAC                         +"  Value Expected : "+expiBankAC);
		 System.out.println("sTelNo                    :"+actsTelNo                          +"  Value Expected : "+expsTelNo);
		 System.out.println("keepUnpostedfinAccChkBox  :"+actsFaxNo                          +"	 Value Expected : "+expsFaxNo);
		 System.out.println("sPassword                 :"+actsPassword                       +"	 Value Expected : "+expsPassword);
		 System.out.println("bAllowCustomerPortal      :"+actbAllowCustomerPortal            +"	 Value Expected : "+expbAllowCustomerPortal);
		 System.out.println("sBankAccountName          :"+actsBankAccountName                +"	 Value Expected : "+expsBankAccountName);
		 System.out.println("sBankAccountNumber        :"+actsBankAccountNumber              +"	 Value Expected : "+expsBankAccountNumber);
		 System.out.println("sIFSCCode                 :"+actsIFSCCode                       +"  Value Expected : "+expsIFSCCode);
		 System.out.println("iPaymentType              :"+actiPaymentType                    +"	 Value Expected : "+expiPaymentType);
		 System.out.println("iPDCDiscountedAC          :"+actiPDCDiscountedAC                +"	 Value Expected : "+expiPDCDiscountedAC);
		 System.out.println("sFinanceEmail             :"+actsFinanceEmail                   +"	 Value Expected : "+expsFinanceEmail);
		 System.out.println("sPortalEmail              :"+actsPortalEmail                    +"  Value Expected : "+expsPortalEmail);
			
		 if(actsName==expsName  && actsCode==expsCode 
				 && actiAccountType==expiAccountType && actfCreditLimit==expfCreditLimit 
				 && actiCreditDays==expiCreditDays && actiDebitCreditProposal==expiDebitCreditProposal
			     && actiDebitCreditRequired==expiDebitCreditRequired && actiExchangeAdjustmentGainAC==expiExchangeAdjustmentGainAC 
			     && actiExchangeAdjustmentLossAC==expiExchangeAdjustmentLossAC && actiPrimaryAccount==expiPrimaryAccount && actiConsolidationMethod==expiConsolidationMethod 
				 && actsAddress==expsAddress && actsDeliveryAddress==expsDeliveryAddress && actsPin==expsPin 
				 && actsDeliveryPin==expsDeliveryPin && actiCity==expiCity && actiDeliveryCity==expiDeliveryCity && actsEmail==expsEmail 
				 && actbSendEmailtocustomer==expbSendEmailtocustomer && actfChequeDiscountLimit==expfChequeDiscountLimit && actsPassword==expsPassword
				 && actfRateofinterest==expfRateofinterest && actiBankAC==expiBankAC && actsTelNo==expsTelNo && actsFaxNo==expsFaxNo 
				 && actbAllowCustomerPortal==expbAllowCustomerPortal&& actsBankAccountName==expsBankAccountName &&  actsBankAccountNumber==expsBankAccountNumber
				 && actsIFSCCode==expsIFSCCode && actiPaymentType==expiPaymentType && actiPDCDiscountedAC==expiPDCDiscountedAC && actsFinanceEmail==expsFinanceEmail 
				 &&  actsPortalEmail==expsPortalEmail)
		
				{
			System.out.println("Test Pass : Select filed Options Are As Expected");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Select filed Options Are NOT As Expected");
			return false;
		}
	}
	
	
	
	public boolean checkSelectOperatoroptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
		selectOperatorDropdown.click();
		
		Select s=new Select(selectOperatorDropdown);
		int actselectOperatorDropdown=s.getOptions().size();
		int expselectOperatorDropdown=12;
		
		System.out.println("************************checkSelectOperatoroptions*******************");
		
		System.out.println("selectOperatorDropdown   : "+actselectOperatorDropdown +"  value Expected : "+expselectOperatorDropdown);
		
		
		if(actselectOperatorDropdown==expselectOperatorDropdown)
		{
			System.out.println("Test Pass : Select Operator Options Are As Expected");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Select Operator Options Are NOT As Expected");
			return false;
		}
		
	}
	
	
	
	public boolean checkCompareWithoptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
		compareWithDropdown.click();
		
		Select s=new Select(compareWithDropdown);
		int actcompareWithDropdown=s.getOptions().size();
		int expcompareWithDropdown=4;
		
		System.out.println("*************************************checkCompareWithoptions*****************************************");
		
		System.out.println("compareWithDropdown   : "+actcompareWithDropdown +"   Value Expeted : "+expcompareWithDropdown);
		
		if(actcompareWithDropdown==expcompareWithDropdown)
		{
			System.out.println("Test Pass : compareWithDropdown Options Are As Expected");
			return true;
		}
		else
		{
			System.out.println("Test Fail : compareWithDropdown Options Are NOT As Expected");
			return false;
		}
	}
	
	
	
	public boolean checkInputingdatainValue() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Select s=new Select(compareWithDropdown);
		s.selectByVisibleText("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueTxt));
		valueTxt.sendKeys("DATA");
		
		Thread.sleep(2000);
		
		String actvalueTxt=valueTxt.getAttribute("value");
		String expvalueTxt="DATA";
		
		System.out.println("*********************************checkInputingdatainValue********************************************");
		
		System.out.println("valueTxt      : "+actvalueTxt+"  Value Expected  : "+expvalueTxt);
		
		if(actvalueTxt.equalsIgnoreCase(expvalueTxt))
		{
			System.out.println("Test Pass : Able to Enter Data in Value");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOTAble to Enter Data in Value");
			return false;
		}
	}
	
	
	
	
	public boolean checkInputingdatainConditionField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
		conjunctionDropdown.click();
		
		Select s=new Select(conjunctionDropdown);
		s.selectByVisibleText("Where");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt));
		selectFieldTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sName));
		sName.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
		selectOperatorDropdown.click();
		
		Select s1=new Select(selectOperatorDropdown);
		s1.selectByVisibleText("Equal to");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
		compareWithDropdown.click();
		
		Select s3=new Select(compareWithDropdown);
		s3.selectByVisibleText("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueTxt));
		valueTxt.clear();
		valueTxt.sendKeys("AccAuth");
		
		Thread.sleep(2000);
		
		String actconjunctionDropdown=conjunctionDropdown.getAttribute("value");
		String expconjunctionDropdown="0";
		
		String actselectFieldTxt=selectFieldTxt.getAttribute("value");
		String expselectFieldTxt="sName";

		String actselectOperatorDropdown=selectOperatorDropdown.getAttribute("value");
		String expselectOperatorDropdown="0";
		
		String actcompareWithDropdown=compareWithDropdown.getAttribute("value");
		String expcompareWithDropdown="0";
		
		String actvalueTxt=valueTxt.getAttribute("value");
		String expvalueTxt="AccAuth";
		
		
		System.out.println("*********************************checkInputingdatainConditionField*********************************************");
		
		System.out.println("conjunctionDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("selectFieldTxt         : "+actselectFieldTxt             +"  Value Expected :"+expselectFieldTxt);
		System.out.println("selectOperatorDropdown : "+actselectOperatorDropdown     +"  Value Expected :"+expselectOperatorDropdown);
		System.out.println("compareWithDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("valueTxt               : "+actvalueTxt                   +"  Value Expected :"+expvalueTxt);
		
		if(actconjunctionDropdown.equals(expconjunctionDropdown) && actselectFieldTxt.equalsIgnoreCase(expselectFieldTxt) && actselectOperatorDropdown.equals(expselectOperatorDropdown)
				&& actcompareWithDropdown.equals(expcompareWithDropdown) && actvalueTxt.equalsIgnoreCase(expvalueTxt))
		{
			System.out.println("Test Pass : Data entered");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Data NOT entered");
			return false;
		}
		
	}
	
	
	
	public boolean 	checkselectingInActiveintheActionofEntryStatusAccAuthConditionOnAccName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actionOnEntryStatusDropdown));
		actionOnEntryStatusDropdown.click();
		
		Select s=new Select(actionOnEntryStatusDropdown);
		s.selectByVisibleText("Inactive");
		
		String actactionOnEntryStatusDropdown=actionOnEntryStatusDropdown.getAttribute("value");
		String expactionOnEntryStatusDropdown="1";
		
		System.out.println("***********************************checkselectingInActiveintheActionofEntryStatusAccAuthConditionOnAccName**********");
		
		System.out.println("ActionOnEntryStatusDropdown   : "+actactionOnEntryStatusDropdown +"  Value Expected : "+expactionOnEntryStatusDropdown);
		
		if(actactionOnEntryStatusDropdown.equals(expactionOnEntryStatusDropdown))
		{
			System.out.println("Test Pass : Selected Active Successfully");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Selected Active Successfully");
			return false;
		}
	}
	
	
	public boolean 	checkselectinguserFromUserSelectiontabAndSavingAccAuthConditionOnAccName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userdropdown));
		userdropdown.click();
		
		Select s=new Select(userdropdown);
		s.selectByVisibleText("ProductTestUser");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1));
		
		String actdata,expdata;
		String actlevel1=level1.getText();
		String explevel1="AccAuthConditionOnAccName";
		
		System.out.println("*************************************checkselectinguserFromUserSelectiontabAndSavingAccAuthConditionOnAccName************");
		
		System.out.println("level1           : "+actlevel1 +"  Value Expected : "+explevel1);
		
		if(actlevel1.equalsIgnoreCase(explevel1))
		{
			System.out.println("Test Pass : Image Displayed In Design Area With Level 1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
						
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return false;
			}
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area With Level 1");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			cancelBtn.click();
			return false;
		}
	}
	
	
	
	
	
	public boolean checkInputingNameAsAccWithConAsAccType() throws InterruptedException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("AccWithConAsAccType");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		getAction().doubleClick(startPointBtn).build().perform();
		
		
		boolean actdescriptionTxt=descriptionTxt.isDisplayed();
		boolean expdescriptionTxt=true;
		
		System.out.println("**********************checkInputingNameAsAccWithConAsAccType********************");
		
		System.out.println("descriptionTxt      : "+actdescriptionTxt +"  Value Expected : "+expdescriptionTxt);
		
		if(actdescriptionTxt==expdescriptionTxt)
		{
			System.out.println("Test Pass : Inputed AccWithConAsAccType");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Inputed AccWithConAsAccType");
			return false;
		}
		
	}
	
	
	public boolean checkInputingdatainConditionFieldAccWithConAsAccType() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.sendKeys("AccWithConAsAccType");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
		conjunctionDropdown.click();
		
		Select s=new Select(conjunctionDropdown);
		s.selectByVisibleText("Where");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt));
		selectFieldTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iAccountType));
		iAccountType.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
		selectOperatorDropdown.click();
		
		Select s1=new Select(selectOperatorDropdown);
		s1.selectByVisibleText("Equal to");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
		compareWithDropdown.click();
		
		Select s3=new Select(compareWithDropdown);
		s3.selectByVisibleText("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueDropdown));
		valueDropdown.click();
		Select s2=new Select(valueDropdown);
		s2.selectByVisibleText("Customer/Vendor");
		
		Thread.sleep(2000);
		
	
		
		String actconjunctionDropdown=conjunctionDropdown.getAttribute("value");
		String expconjunctionDropdown="0";
		
		String actselectFieldTxt=selectFieldTxt.getAttribute("value");
		String expselectFieldTxt="iAccountType";

		String actselectOperatorDropdown=selectOperatorDropdown.getAttribute("value");
		String expselectOperatorDropdown="0";
		
		String actcompareWithDropdown=compareWithDropdown.getAttribute("value");
		String expcompareWithDropdown="0";
		
		String actvalueDropdown=valueDropdown.getAttribute("value");
		String expvalueDropdown="7";
		
		
		System.out.println("*********************************checkInputingdatainConditionFieldAccWithConAsAccType*********************************************");
		
		System.out.println("conjunctionDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("selectFieldTxt         : "+actselectFieldTxt             +"  Value Expected :"+expselectFieldTxt);
		System.out.println("selectOperatorDropdown : "+actselectOperatorDropdown     +"  Value Expected :"+expselectOperatorDropdown);
		System.out.println("compareWithDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("valueDropdown          : "+actvalueDropdown              +"  Value Expected :"+expvalueDropdown);
		
		if(actconjunctionDropdown.equals(expconjunctionDropdown) && actselectFieldTxt.equalsIgnoreCase(expselectFieldTxt) && actselectOperatorDropdown.equals(expselectOperatorDropdown)
				&& actcompareWithDropdown.equals(expcompareWithDropdown) && actvalueDropdown.equalsIgnoreCase(expvalueDropdown))
		
		{
			System.out.println("Test Pass : Data entered");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Data NOT entered");
			return false;
		}
		
	}
	
	
	
	public boolean 	checkselectingInActiveintheActionofEntryStatusAccWithConAsAccType() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actionOnEntryStatusDropdown));
		actionOnEntryStatusDropdown.click();
		
		Select s=new Select(actionOnEntryStatusDropdown);
		s.selectByVisibleText("Inactive");
		
		String actactionOnEntryStatusDropdown=actionOnEntryStatusDropdown.getAttribute("value");
		String expactionOnEntryStatusDropdown="1";
		
		System.out.println("****************checkselectingInActiveintheActionofEntryStatusAccWithConAsAccType**********************************");
		
		System.out.println("actionOnEntryStatusDropdown  : "+actactionOnEntryStatusDropdown+"  Value Expected  :"+expactionOnEntryStatusDropdown);
		
		if(actactionOnEntryStatusDropdown.equals(expactionOnEntryStatusDropdown))
		{
			System.out.println("Test Pass : Selected Active Successfully");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Selected Active Successfully");
			return false;
		}
	}
	
	
	public boolean 	checkselectinguserFromUserSelectiontabAndSavingAccWithConAsAccType() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userdropdown));
		userdropdown.click();
		
		Select s=new Select(userdropdown);
		s.selectByVisibleText("ProductTestUser");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1));
		
		String 	actlevel1=level1.getText();
	    String 	explevel1="AccWithConAsAccType";
	    
	    boolean actendpoint=endpoint.isDisplayed();
	    boolean expendpoint = true;
	    
	    
	    System.out.println("*************************checkselectinguserFromUserSelectiontabAndSavingAccWithConAsAccType*******");
		
	    System.out.println("level1   : "+actlevel1     +"  Value Expected : "+explevel1);
	    System.out.println("Endpoint   : "+actendpoint +"  Value Expected : "+expendpoint);
	    
		if(actlevel1.equalsIgnoreCase(explevel1) && actendpoint==expendpoint)
		
		{
			System.out.println("Test Pass : Image Displayed In Design Area With Level 1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return false;
			}
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area With Level 1");
			return false;
		}
	}
	
	
	
	public boolean checkInputingNameAsAccWithConAsCreditLimit() throws InterruptedException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("AccWithConAsCreditLimit");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		getAction().doubleClick(startPointBtn).build().perform();
		
		boolean actdescriptionTxt=descriptionTxt.isDisplayed();
		
		boolean expdescriptionTxt=true;
		
		System.out.println("*************************checkInputingNameAsAccWithConAsCreditLimit********"); 
		
		
		System.out.println("DescriptionTxt   : "+actdescriptionTxt +"  Value Expected : "+expdescriptionTxt);
		
		if(actdescriptionTxt==expdescriptionTxt)
		{
			System.out.println("Test Pass : Inputed AccWithConAsCreditLimit");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Inputed AccWithConAsCreditLimit");
			return false;
		}
		
	}
	
	
	public boolean checkInputingdatainConditionFieldAccWithConAsCreditLimit() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.sendKeys("AccWithConAsCreditLimit");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
		conjunctionDropdown.click();
		
		Select s=new Select(conjunctionDropdown);
		s.selectByVisibleText("Where");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt));
		selectFieldTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fCreditLimit));
		fCreditLimit.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
		selectOperatorDropdown.click();
		
		Select s1=new Select(selectOperatorDropdown);
		s1.selectByVisibleText("Equal to");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
		compareWithDropdown.click();
		
		Select s3=new Select(compareWithDropdown);
		s3.selectByVisibleText("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueTxt));
		valueTxt.click();
		valueTxt.sendKeys("90000");
		
		
		String actconjunctionDropdown=conjunctionDropdown.getAttribute("value");
		String expconjunctionDropdown="0";
		
		String actselectFieldTxt=selectFieldTxt.getAttribute("value");
		String expselectFieldTxt="fCreditLimit";

		String actselectOperatorDropdown=selectOperatorDropdown.getAttribute("value");
		String expselectOperatorDropdown="0";
		
		String actcompareWithDropdown=compareWithDropdown.getAttribute("value");
		String expcompareWithDropdown="0";
		
		String actvalueTxt=valueTxt.getAttribute("value");
		String expvalueTxt="90000";
		
		
		System.out.println("*********************************checkInputingdatainConditionFieldAccWithConAsCreditLimit*********************************************");
		
		System.out.println("conjunctionDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("selectFieldTxt         : "+actselectFieldTxt             +"  Value Expected :"+expselectFieldTxt);
		System.out.println("selectOperatorDropdown : "+actselectOperatorDropdown     +"  Value Expected :"+expselectOperatorDropdown);
		System.out.println("compareWithDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("valueTxt               : "+actvalueTxt                   +"  Value Expected :"+expvalueTxt);
		
		if(actconjunctionDropdown.equals(expconjunctionDropdown) && actselectFieldTxt.equalsIgnoreCase(expselectFieldTxt) && actselectOperatorDropdown.equals(expselectOperatorDropdown)
				&& actcompareWithDropdown.equals(expcompareWithDropdown) && actvalueTxt.equalsIgnoreCase(expvalueTxt))
		{
			System.out.println("Test Pass : Data entered");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Data NOT entered");
			return false;
		}
		
	}
	
	
	
	public boolean 	checkselectingInActiveintheActionofEntryStatusAccWithConAsCreditLimit() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actionOnEntryStatusDropdown));
		actionOnEntryStatusDropdown.click();
		
		Select s=new Select(actionOnEntryStatusDropdown);
		s.selectByVisibleText("Inactive");
		
		String actactionOnEntryStatusDropdown=actionOnEntryStatusDropdown.getAttribute("value");
		String expactionOnEntryStatusDropdown="1";
		
		System.out.println("************************checkselectingInActiveintheActionofEntryStatusAccWithConAsCreditLimit*************************");
		
		System.out.println("actionOnEntryStatusDropdown  : "+actactionOnEntryStatusDropdown +"   Value Expected  :"+expactionOnEntryStatusDropdown);
		
		if(actactionOnEntryStatusDropdown.equals(expactionOnEntryStatusDropdown))
		{
			System.out.println("Test Pass : Selected Active Successfully");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Selected Active Successfully");
			return false;
		}
	}
	
	
	public boolean 	checkselectinguserFromUserSelectiontabAndSavingAccWithConAsCreditLimit() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userdropdown));
		userdropdown.click();
		
		Select s=new Select(userdropdown);
		s.selectByVisibleText("ProductTestUser");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1));
		
		String 	actlevel1=level1.getText();
	    String 	explevel1="AccWithConAsCreditLimit";
	    
	    boolean actendpoint=endpoint.isDisplayed();
	    boolean expendpoint = true;
	    
	    
	    System.out.println("*************************checkselectinguserFromUserSelectiontabAndSavingAccWithConAsCreditLimit*******");
		
	    System.out.println("level1   : "+actlevel1     +"  Value Expected : "+explevel1);
	    System.out.println("Endpoint   : "+actendpoint +"  Value Expected : "+expendpoint);
	    
		if(actlevel1.equalsIgnoreCase(explevel1) && actendpoint==expendpoint)
		{
			System.out.println("Test Pass : Image Displayed In Design Area With Level 1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return false;
			}
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area With Level 1");
			return false;
		}
	}
	
	
	
	
	public boolean checkInputingNameAsAccWithConAsCreditDays() throws InterruptedException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("AccWithConAsCreditDays");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		getAction().doubleClick(startPointBtn).build().perform();
		

		boolean actdescriptionTxt=descriptionTxt.isDisplayed();
		
		boolean expdescriptionTxt=true;
		
		System.out.println("*************************checkInputingNameAsAccWithConAsCreditDays********"); 
		
		
		System.out.println("DescriptionTxt   : "+actdescriptionTxt +"  Value Expected : "+expdescriptionTxt);
		
		if(actdescriptionTxt==expdescriptionTxt)
		
		{
			System.out.println("Test Pass : Inputed AccWithConAsCreditLimit");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Inputed AccWithConAsCreditLimit");
			return false;
		}
		
	}
	
	
	public boolean checkInputingdatainConditionFieldAccWithConAsCreditDays() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.sendKeys("AccWithConAsCreditDays");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
		conjunctionDropdown.click();
		
		Select s=new Select(conjunctionDropdown);
		s.selectByVisibleText("Where");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt));
		selectFieldTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iCreditDays));
		iCreditDays.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
		selectOperatorDropdown.click();
		
		Select s1=new Select(selectOperatorDropdown);
		s1.selectByVisibleText("Equal to");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
		compareWithDropdown.click();
		
		Select s3=new Select(compareWithDropdown);
		s3.selectByVisibleText("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueTxt));
		valueTxt.click();
		valueTxt.sendKeys("90000");
		
		String actconjunctionDropdown=conjunctionDropdown.getAttribute("value");
		String expconjunctionDropdown="0";
		
		String actselectFieldTxt=selectFieldTxt.getAttribute("value");
		String expselectFieldTxt="iCreditDays";

		String actselectOperatorDropdown=selectOperatorDropdown.getAttribute("value");
		String expselectOperatorDropdown="0";
		
		String actcompareWithDropdown=compareWithDropdown.getAttribute("value");
		String expcompareWithDropdown="0";
		
		String actvalueTxt=valueTxt.getAttribute("value");
		String expvalueTxt="90000";
		
		
		System.out.println("*********************************checkInputingdatainConditionFieldAccWithConAsCreditDays*********************************************");
		
		System.out.println("conjunctionDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("selectFieldTxt         : "+actselectFieldTxt             +"  Value Expected :"+expselectFieldTxt);
		System.out.println("selectOperatorDropdown : "+actselectOperatorDropdown     +"  Value Expected :"+expselectOperatorDropdown);
		System.out.println("compareWithDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("valueTxt               : "+actvalueTxt                   +"  Value Expected :"+expvalueTxt);
		
		if(actconjunctionDropdown.equals(expconjunctionDropdown) && actselectFieldTxt.equalsIgnoreCase(expselectFieldTxt) && actselectOperatorDropdown.equals(expselectOperatorDropdown)
				&& actcompareWithDropdown.equals(expcompareWithDropdown) && actvalueTxt.equalsIgnoreCase(expvalueTxt))
		
		{
			System.out.println("Test Pass : Data entered");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Data NOT entered");
			return false;
		}
		
	}
	
	
	
	public boolean 	checkselectingInActiveintheActionofEntryStatusAccWithConAsCreditDays() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actionOnEntryStatusDropdown));
		actionOnEntryStatusDropdown.click();
		
		Select s=new Select(actionOnEntryStatusDropdown);
		s.selectByVisibleText("Inactive");
		
		String actactionOnEntryStatusDropdown=actionOnEntryStatusDropdown.getAttribute("value");
		String expactionOnEntryStatusDropdown="1";
		
		System.out.println("*****************************checkselectingInActiveintheActionofEntryStatusAccWithConAsCreditDays**************");
		
		System.out.println("actionOnEntryStatusDropdown   : "+actactionOnEntryStatusDropdown+"  Value Expected  : "+expactionOnEntryStatusDropdown);
		
		if(actactionOnEntryStatusDropdown.equals(expactionOnEntryStatusDropdown))
		{
			System.out.println("Test Pass : Selected Active Successfully");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Selected Active Successfully");
			return false;
		}
	}
	
	
	public boolean 	checkselectinguserFromUserSelectiontabAndSavingAccWithConAsCreditDays() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userdropdown));
		userdropdown.click();
		
		Select s=new Select(userdropdown);
		s.selectByVisibleText("ProductTestUser");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1));
		
		String 	actlevel1=level1.getText();
	    String 	explevel1="AccWithConAsCreditDays";
	    
	    boolean actendpoint=endpoint.isDisplayed();
	    boolean expendpoint = true;
	    
	    
	    System.out.println("*************************checkselectinguserFromUserSelectiontabAndSavingAccWithConAsCreditDays*******");
		
	    System.out.println("level1     : "+actlevel1     +"  Value Expected : "+explevel1);
	    System.out.println("Endpoint   : "+actendpoint   +"  Value Expected : "+expendpoint);
	    
		if(actlevel1.equalsIgnoreCase(explevel1) && actendpoint==expendpoint)
		
		{
			System.out.println("Test Pass : Image Displayed In Design Area With Level 1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return false;
			}
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area With Level 1");
			return false;
		}
	}
	
	
	
	
	
	public boolean checkInputingNameAsAccAuthConWithCreditLimitRange() throws InterruptedException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("AccAuthConWithCreditLimitRange");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		getAction().doubleClick(startPointBtn).build().perform();
		
        boolean actdescriptionTxt=descriptionTxt.isDisplayed();
		
		boolean expdescriptionTxt=true;
		
		System.out.println("**********************checkInputingNameAsAccAuthConWithCreditLimitRange********"); 
		
		
		System.out.println("DescriptionTxt   : "+actdescriptionTxt +"  Value Expected : "+expdescriptionTxt);
		
		if(actdescriptionTxt==expdescriptionTxt)
		{
			System.out.println("Test Pass : Inputed AccWithConAsCreditLimit");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Inputed AccWithConAsCreditLimit");
			return false;
		}
		
	}
	
	
	public boolean checkInputingdatainConditionFieldAccAuthConWithCreditLimitRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.sendKeys("AccAuthConWithCreditLimitRange");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
		conjunctionDropdown.click();
		
		Select s=new Select(conjunctionDropdown);
		s.selectByVisibleText("Where");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt));
		selectFieldTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fCreditLimit));
		fCreditLimit.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
		selectOperatorDropdown.click();
		
		Select s1=new Select(selectOperatorDropdown);
		s1.selectByVisibleText("Greater than or equal to");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
		compareWithDropdown.click();
		
		Select s3=new Select(compareWithDropdown);
		s3.selectByVisibleText("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueTxt));
		valueTxt.click();
		valueTxt.sendKeys("100");
		
		
		String actconjunctionDropdown=conjunctionDropdown.getAttribute("value");
		String expconjunctionDropdown="0";
		
		String actselectFieldTxt=selectFieldTxt.getAttribute("value");
		String expselectFieldTxt="fCreditLimit";

		String actselectOperatorDropdown=selectOperatorDropdown.getAttribute("value");
		String expselectOperatorDropdown="5";
		
		String actcompareWithDropdown=compareWithDropdown.getAttribute("value");
		String expcompareWithDropdown="0";
		
		String actvalueTxt=valueTxt.getAttribute("value");
		String expvalueTxt="100";
		
		
		System.out.println("*********************************checkInputingdatainConditionFieldAccAuthConWithCreditLimitRange*********************************************");
		
		System.out.println("conjunctionDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("selectFieldTxt         : "+actselectFieldTxt             +"  Value Expected :"+expselectFieldTxt);
		System.out.println("selectOperatorDropdown : "+actselectOperatorDropdown     +"  Value Expected :"+expselectOperatorDropdown);
		System.out.println("compareWithDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("valueTxt               : "+actvalueTxt                   +"  Value Expected :"+expvalueTxt);
		
		if(actconjunctionDropdown.equals(expconjunctionDropdown) && actselectFieldTxt.equalsIgnoreCase(expselectFieldTxt) && actselectOperatorDropdown.equals(expselectOperatorDropdown)
				&& actcompareWithDropdown.equals(expcompareWithDropdown) && actvalueTxt.equalsIgnoreCase(expvalueTxt))
		{
			System.out.println("Test Pass : Data entered");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addRowBtn));
			addRowBtn.click();
			return true;
		}
		else
		{
			System.out.println("Test Fail : Data NOT entered");
			return false;
		}
		
	}
	

	public boolean checkInputingdatainConditionFieldTWOAccAuthConWithCreditLimitRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown2));
		conjunctionDropdown2.click();
		
		Select s=new Select(conjunctionDropdown2);
		s.selectByVisibleText("And");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt2));
		selectFieldTxt2.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fCreditLimit));
		fCreditLimit.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown2));
		selectOperatorDropdown2.click();
		
		Select s1=new Select(selectOperatorDropdown2);
		s1.selectByVisibleText("Less than or equal to");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(comparewithDropdown2));
		comparewithDropdown2.click();
		
		Select s3=new Select(comparewithDropdown2);
		s3.selectByVisibleText("value");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueTxt2));
		valueTxt2.click();
		valueTxt2.sendKeys("1000");
		
		
		Thread.sleep(2000);
		
		String actconjunctionDropdown=conjunctionDropdown2.getAttribute("value");
		String expconjunctionDropdown="2";
		
	/*	String actselectFieldTxt=selectFieldTxt.getAttribute("value");
		String expselectFieldTxt="fCreditLimit";*/

		String actselectOperatorDropdown=selectOperatorDropdown2.getAttribute("value");
		String expselectOperatorDropdown="4";
		
		String actcompareWithDropdown=comparewithDropdown2.getAttribute("value");
		String expcompareWithDropdown="0";
		
		String actvalueTxt=valueTxt2.getAttribute("value");
		String expvalueTxt="1000";
		
		
		System.out.println("******************************checkInputingdatainConditionFieldTWOAccAuthConWithCreditLimitRange*********************************************");
		
		System.out.println("conjunctionDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		/*System.out.println("selectFieldTxt         : "+actselectFieldTxt             +"  Value Expected :"+expselectFieldTxt);*/
		System.out.println("selectOperatorDropdown : "+actselectOperatorDropdown     +"  Value Expected :"+expselectOperatorDropdown);
		System.out.println("compareWithDropdown    : "+actconjunctionDropdown        +"  Value Expected :"+expconjunctionDropdown);
		System.out.println("valueTxt               : "+actvalueTxt                   +"  Value Expected :"+expvalueTxt);
		
		if(actconjunctionDropdown.equals(expconjunctionDropdown) /*&& actselectFieldTxt.equalsIgnoreCase(expselectFieldTxt)*/ && actselectOperatorDropdown.equals(expselectOperatorDropdown)
				&& actcompareWithDropdown.equals(expcompareWithDropdown) && actvalueTxt.equalsIgnoreCase(expvalueTxt))
		
		{
			System.out.println("Test Pass : Data entered");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Data NOT entered");
			return false;
		}
		
	}


	
	public boolean 	checkselectingInActiveintheActionofEntryStatusAccAuthConWithCreditLimitRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(actionOnEntryStatusDropdown));
		actionOnEntryStatusDropdown.click();
		
		Select s=new Select(actionOnEntryStatusDropdown);
		s.selectByVisibleText("Inactive");
		
		String actactionOnEntryStatusDropdown=actionOnEntryStatusDropdown.getAttribute("value");
		String expactionOnEntryStatusDropdown="1";
		
		System.out.println("****************************************checkselectingInActiveintheActionofEntryStatusAccAuthConWithCreditLimitRange*********************");
		
		System.out.println("actionOnEntryStatusDropdown   : "+actactionOnEntryStatusDropdown +"  Value Expected  : "+expactionOnEntryStatusDropdown);
		
		
		if(actactionOnEntryStatusDropdown.equals(expactionOnEntryStatusDropdown))
		{
			System.out.println("Test Pass : Selected Active Successfully");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Selected Active Successfully");
			return false;
		}
	}
	
	
	public boolean 	checkselectinguserFromUserSelectiontabAndSavingAccAuthConWithCreditLimitRange() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userdropdown));
		userdropdown.click();
		
		Select s=new Select(userdropdown);
		s.selectByVisibleText("ProductTestUser");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1));
		
		String 	actlevel1=level1.getText();
	    String 	explevel1="AccAuthConWithCreditLimitRange";
	    
	    boolean actendpoint=endpoint.isDisplayed();
	    boolean expendpoint = true;
	    
	    
	    System.out.println("*************************checkselectinguserFromUserSelectiontabAndSavingAccWithConAsCreditDays*******");
		
	    System.out.println("level1   : "+actlevel1     +"  Value Expected : "+explevel1);
	    System.out.println("Endpoint   : "+actendpoint +"  Value Expected : "+expendpoint);
	    
		if(actlevel1.equalsIgnoreCase(explevel1) && actendpoint==expendpoint)
		{
			System.out.println("Test Pass : Image Displayed In Design Area With Level 1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return false;
			}
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area With Level 1");
			return false;
		}
	}
	
	
	
	

	public boolean checkInputingNameAsAccFullAuth() throws InterruptedException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("AccFullAuth");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		getAction().doubleClick(startPointBtn).build().perform();
		
        boolean actdescriptionTxt=descriptionTxt.isDisplayed();
		boolean expdescriptionTxt=true;
		
		System.out.println("**********************checkInputingNameAsAccFullAuth********"); 
		
		
		System.out.println("DescriptionTxt   : "+actdescriptionTxt +"  Value Expected : "+expdescriptionTxt);
		
		if(actdescriptionTxt==expdescriptionTxt)
		{
			System.out.println("Test Pass : Inputed AccFullAuth");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Inputed AccFullAuth");
			return false;
		}
	}

	

	public boolean checkInputingDescriptionAsAccFullAuthAndselectConditionNotRequired() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		
		descriptionTxt.sendKeys("AccFullAuth");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
		conditionNotRequiredChkBox.click();
		
		
		boolean actconditionNotRequiredChkBox=conditionNotRequiredChkBox.isSelected();
		boolean expconditionNotRequiredChkBox=true;

		System.out.println("*******************************checkInputingDescriptionAsAccFullAuthAndselectConditionNotRequired******");
		
		System.out.println("conditionNotRequiredChkBox     : "+actconditionNotRequiredChkBox +"   Value Expected  : "+expconditionNotRequiredChkBox);
		
		if(actconditionNotRequiredChkBox==expconditionNotRequiredChkBox)
		{
			System.out.println("Test pass : Entered Description and checked contion not required");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Entered Description and checked contion not required");
			return false;
		}
	}

	
	
	public boolean checkSelectingFullAuthorization() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fullAuthorizationChkBox));
		fullAuthorizationChkBox.click();
		
		Thread.sleep(2000);
		
		boolean actfullAuthorizationChkBox=fullAuthorizationChkBox.isSelected();
		boolean expfullAuthorizationChkBox=true;

		System.out.println("*******************************checkSelectingFullAuthorization******");
		
		System.out.println("fullAuthorizationChkBox     : "+actfullAuthorizationChkBox +"   Value Expected  : "+expfullAuthorizationChkBox);
		
		if(actfullAuthorizationChkBox==expfullAuthorizationChkBox)
		
		{
			System.out.println("Test pass : checked fullAuthorizationChkBox");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT checked fullAuthorizationChkBox");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			return false;
		}
	}
	
	
	
	
	public boolean 	checkselectinguserFromUserSelectiontabAndSavingAccFullAuth() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userdropdown));
		userdropdown.click();
		
		Select s=new Select(userdropdown);
		s.selectByVisibleText("ProductTestUser");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1));
		
		String 	actlevel1=level1.getText();
	    String 	explevel1="AccFullAuth";
	    
	    boolean actendpoint=endpoint.isDisplayed();
	    boolean expendpoint = true;
	    
	    
	    System.out.println("*************************checkselectinguserFromUserSelectiontabAndSavingAccFullAuth*******");
		
	    System.out.println("level1   : "+actlevel1     +"  Value Expected : "+explevel1);
	    System.out.println("Endpoint   : "+actendpoint +"  Value Expected : "+expendpoint);
	    
		if(actlevel1.equalsIgnoreCase(explevel1) && actendpoint==expendpoint)
		
		{
			System.out.println("Test Pass : Image Displayed In Design Area With Level 1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return false;
			}
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area With Level 1");
			return false;
		}
	}
	
	
	
	
	

	public boolean checkInputingNameAsAccUndoAuthOnEditing() throws InterruptedException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("AccUndoAuthOnEditing");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		getAction().doubleClick(startPointBtn).build().perform();
		
		boolean actdescriptionTxt=descriptionTxt.isDisplayed();
		boolean expdescriptionTxt=true;
			
		System.out.println("**********************checkInputingNameAsAccUndoAuthOnEditing********"); 
			
			
		System.out.println("DescriptionTxt   : "+actdescriptionTxt +"  Value Expected : "+expdescriptionTxt);
			
		if(actdescriptionTxt==expdescriptionTxt)
		
		{
			System.out.println("Test Pass : Inputed AccUndoAuthOnEditing ");
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Inputed AccUndoAuthOnEditing ");
			return false;
		}
	}

	

	public boolean checkInputingDescriptionAsAccUndoAuthOnEditingAndselectConditionNotRequired() throws InterruptedException
	{

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		
		descriptionTxt.sendKeys("AccUndoAuthOnEditing");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
		conditionNotRequiredChkBox.click();
		
		boolean actconditionNotRequiredChkBox=conditionNotRequiredChkBox.isSelected();
		boolean expconditionNotRequiredChkBox=true;

		System.out.println("*******************************checkInputingDescriptionAsAccUndoAuthOnEditingAndselectConditionNotRequired******");
		
		System.out.println("conditionNotRequiredChkBox     : "+actconditionNotRequiredChkBox +"   Value Expected  : "+expconditionNotRequiredChkBox);
		
		if(actconditionNotRequiredChkBox==expconditionNotRequiredChkBox)
	
		{
			System.out.println("Test pass : Entered Description and checked contion not required"  );
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Entered Description and checked contion not required");
			return false;
		}
	}

	
	
	public boolean checkSelectingFullinUndoAuthorizationAccUndoAuthOnEditing() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(undoAuthEditingDropdown));
		undoAuthEditingDropdown.click();
		
		Thread.sleep(2000);
		
		Select s=new Select(undoAuthEditingDropdown);
		s.selectByVisibleText("Full");
		
		Thread.sleep(2000);
		
		String actval,expval;
		String actundoAuthEditingDropdown=undoAuthEditingDropdown.getAttribute("value");
		String expundoAuthEditingDropdown="1";
		
		
		System.out.println("****************************checkSelectingFullinUndoAuthorizationAccUndoAuthOnEditing***********************");
		
		System.out.println("UndoAuthEditingDropdown      : "+actundoAuthEditingDropdown +"  Value Expected  : "+expundoAuthEditingDropdown);
		
		if(actundoAuthEditingDropdown.endsWith(expundoAuthEditingDropdown))
		{
			System.out.println("Test pass : Selected Full in Undo Auth On Editing");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Selected Full in Undo Auth On Editing");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			return false;
		}
	}
	
	
	
	
	public boolean 	checkselectinguserFromUserSelectiontabAndSavingAccUndoAuthOnEditing() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userdropdown));
		userdropdown.click();
		
		Select s=new Select(userdropdown);
		s.selectByVisibleText("ProductTestUser");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1));
		
		String 	actlevel1=level1.getText();
	    String 	explevel1="AccUndoAuthOnEditing";
	    
	    boolean actendpoint=endpoint.isDisplayed();
	    boolean expendpoint = true;
	    
	    
	    System.out.println("*************************checkselectinguserFromUserSelectiontabAndSavingAccFullAuth*******");
		
	    System.out.println("level1   : "+actlevel1     +"  Value Expected : "+explevel1);
	    System.out.println("Endpoint   : "+actendpoint +"  Value Expected : "+expendpoint);
	    
		if(actlevel1.equalsIgnoreCase(explevel1) && actendpoint==expendpoint)
		{
			System.out.println("Test Pass : Image Displayed In Design Area With Level 1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return false;
			}
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area With Level 1");
			return false;
		}
	}
	
	@FindBy(xpath="//div[@id='divLevel1']//i[@class='icon-edit icon-font7']")
	public static WebElement Level1editBtn;
	
	
	
	public boolean 	checkEmailTemplateOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationBtn));
		masterAuthorizationBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDropdown));
			masterDropdown.sendKeys(" ");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
		account.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("AccUndoAuthOnEditing");
		nameTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(level1Template));
		level1Template.click();
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
		Level1editBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertsTab));
		alertsTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplateBtn));
		emailTemplateBtn.click();
		
		Thread.sleep(2000);
		
		boolean actnewdropdown=newdropdown.isDisplayed();
		boolean expnewdropdown=true;
		
		System.out.println("**************************checkEmailTemplateOption***********"); 
		
		System.out.println("newdropdown    : "+actnewdropdown +" Value Expected  : "+expnewdropdown);
		
		if(actnewdropdown==expnewdropdown)
		{
			System.out.println("Test Pass : email Template Opened Print Screen");
			return true;
		}
		else
		{
			System.out.println("Test Fail : email Template NOT Opened Print Screen");
			return false;
		}
		
	}
	
	
	
	public boolean 	checkFieldsAndPropertiesTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		boolean actheaderFieldsTab=headerFieldsTab.isDisplayed();
		boolean actheaderPropertiesTab=headerPropertiesTab.isDisplayed();
		
		boolean expheaderFieldsTab=true;
		boolean expheaderPropertiesTab=true;
		
		System.out.println(" ****************************************checkFieldsAndPropertiesTab*******************************");
		
		System.out.println("headerFieldsTab        : "+actheaderFieldsTab     +"  Value Expected : "+expheaderFieldsTab);
		System.out.println("headerPropertiesTab    : "+actheaderPropertiesTab +"  Value Expected : "+expheaderPropertiesTab);
		
		
		if(actheaderFieldsTab==expheaderFieldsTab  && actheaderPropertiesTab==expheaderPropertiesTab)
		{
			System.out.println("Test Pass : Fields And Properties Are Displayed");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Fields And Properties Are NOT Displayed");
			return false;
		}
	}
	
	
	
	
	public boolean 	checkFieldsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerFieldsTab));
		headerFieldsTab.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_CompanyExpandBtn));
		boolean actfields_CompanyExpandBtn              = fields_CompanyExpandBtn.isDisplayed();
		boolean actfields_MasterFieldsExpandBtn         = fields_MasterFieldsExpandBtn.isDisplayed();
		boolean actfields_UserDetailsExpandBtn          = fields_UserDetailsExpandBtn.isDisplayed();
		boolean actfields_MiscellaneousExpandBtn        = fields_MiscellaneousExpandBtn.isDisplayed();
		
		boolean expfields_CompanyExpandBtn              = true;
		boolean expfields_MasterFieldsExpandBtn         = true;
		boolean expfields_UserDetailsExpandBtn          = true;
		boolean expfields_MiscellaneousExpandBtn        = true;
		
		System.out.println("*******************************************checkSaveOptionInEmailTemplate************************************"); 
		System.out.println("Fields_CompanyExpandBtn           :"+actfields_CompanyExpandBtn        +" Value Expected  :"+expfields_CompanyExpandBtn);
		System.out.println("Fields_MasterFieldsExpandBtn      :"+actfields_MasterFieldsExpandBtn   +" Value Expected  :"+expfields_MasterFieldsExpandBtn);
		System.out.println("Fields_UserDetailsExpandBtn       :"+actfields_UserDetailsExpandBtn    +" Value Expected  :"+expfields_UserDetailsExpandBtn);
		System.out.println("Fields_MiscellaneousExpandBtn     :"+actfields_MiscellaneousExpandBtn  +" Value Expected  :"+expfields_MiscellaneousExpandBtn);
		
		if(actfields_CompanyExpandBtn==expfields_CompanyExpandBtn && actfields_MasterFieldsExpandBtn==expfields_MasterFieldsExpandBtn &&
				actfields_UserDetailsExpandBtn==expfields_UserDetailsExpandBtn  && actfields_MiscellaneousExpandBtn==expfields_MiscellaneousExpandBtn)

		{
			System.out.println("Test Pass : Field Options Are Displayed");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Field Options Are NOT Displayed");
			return false;
		}
	}
	
	@FindBy(xpath="//i[@class='icon-collepse icon-font8']")
	public static WebElement fields_MinimizeBtn;
	
	
	
	
	
	
	@FindBy(xpath="//p[contains(text(),'Company Name')]")
	public static WebElement draggedCompanyName;
	
	@FindBy(xpath="//div[@id='id_LayoutDiv_0']")
	public static WebElement designArea;
	
	
	public boolean checkMovingCompanyNameToDesignArea() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_CompanyExpandBtn));
		fields_CompanyExpandBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fields_Company_CompanyName));
		fields_Company_CompanyName.click();

		getAction().dragAndDropBy(fields_Company_CompanyName, 250, -100).build().perform();
		
		//getAction().clickAndHold(fields_Company_CompanyName).dragAndDrop(fields_Company_CompanyName, designArea).build().perform();
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedCompanyName));
		boolean actdraggedCompanyName=draggedCompanyName.isDisplayed();
		boolean expdraggedCompanyName=true;
		
		
		System.out.println("******************************checkMovingCompanyNameToDesignArea******************");
		
		System.out.println("draggedCompanyName       : "+actdraggedCompanyName +"  Value Expected : "+expdraggedCompanyName);
		
		if(actdraggedCompanyName==expdraggedCompanyName)
		{
			System.out.println("Test Pass : CompanyName Moved To Design Area");
			return true;
		}
		else
		{
			System.out.println("Test Fail : CompanyName NOT Moved To Design Area");
			return false;
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 public SmokeMasterAuthorizationDefinitionPage(WebDriver driver)
 {
	PageFactory.initElements(driver, this);	
 }
	
}
