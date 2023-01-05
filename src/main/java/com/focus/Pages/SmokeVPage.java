package com.focus.Pages;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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

public class SmokeVPage extends BaseEngine
{
	//Vouchers Home Page Ribbon Control
	@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
	private static WebElement  newBtn;
	
	@FindBy(xpath="//div[@id='id_transaction_homescreen_edit']//span[@class='icon-edit icon-font6 ImagesinArabic']")
	private static WebElement  editBtn;

	@FindBy(xpath="//span[@class='icon-print icon-font6']")
	private static WebElement  printBtn;
	
	@FindBy(xpath="//div[@id='id_transaction_homescreen_Delete']//span[@class='icon-delete icon-font6']")
	private static WebElement  deleteBtn;
	
	@FindBy(xpath="//span[@class='icon-authorize icon-font6']")
	private static WebElement  authorizeBtn;
	
	@FindBy(xpath="//span[@class='icon-suspend icon-font6']")
	private static WebElement  suspendBtn;
	
	@FindBy(xpath="//span[@class='icon-reject2 icon-font6']")
	private static WebElement  rejectBtn;
	
	@FindBy(xpath="//span[@class='icon-cheque icon-font6']")
	private static WebElement  chequeReturnBtn;
	
	@FindBy(xpath="//span[@class='icon-printbarcode icon-font6']")
	private static WebElement  printBarCodeBtn;
	
	@FindBy(xpath="//span[@class='icon-convert icon-font6']")
	private static WebElement  convertBtn;
	
	@FindBy(xpath="//span[@class='icon-export icon-font6']")
	private static WebElement  exportToXMLBtn;  
		
	@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-settings icon-font6']")
	private static WebElement  settingsBtn;
	
	@FindBy(xpath="//div[@id='dvHomeTransClose']//span[@class='icon-close icon-font6']")  
	private static WebElement  homeCloseBtn;
			
	//Vouchers Home Page Options
	@FindBy(xpath="//a[@class='transaction_viewname_anchor theme_color-inverse font-5']")
	private static WebElement  allVouchersOption;
	
	@FindBy(xpath="//a[@class='transaction_viewname_anchor font-5']")
	private static WebElement  pendingBillsOption;
	
	@FindBy(xpath="//input[@id='SelectDefaultView']")
	private static WebElement  selectDefaultViewChkBox;
		
	@FindBy(xpath="//span[@class='icon-sorting icon-font6 toolbar_button_image theme_button_color dropdown-toggle']")
	private static WebElement  sortingBtn;
	
    @FindBy(xpath="//div[@id='btnCreateView']//span[@class='icon-new icon-font6']")
    private static WebElement  createViewBtn;

    @FindBy(xpath="//div[@id='btnCustomize']//span[@class='icon-settings icon-font6']")
    private static WebElement  customizeBtn;
   
    @FindBy(xpath="//span[@class='icon-filter icon-font6']")
    private static WebElement  filterBtn;
   
    @FindBy(xpath="//*[@id='transhomeRefresh']")
    private static WebElement  refreshBtn;
   
    @FindBy(xpath="//*[@id='transhomeRefresh']")
    private static WebElement  refreshBtnInPVVAT;
    
    @FindBy(xpath="//i[@class='icon-font6 icon-export']")
    private static WebElement  exportBtn;
   
	// Options Button  (Display Option)	
    @FindBy(xpath="//span[@id='transOptions']")
    private static WebElement  optionsBtn;
   
    @FindBy(xpath="//a[contains(text(),'Auto Adjust Width')]")
    private static WebElement  autoAdjustWidthBtn;
   
    @FindBy(xpath="//a[contains(text(),'Fit To Screen')]")
    private static WebElement  fitToScreenBtn;
   
    @FindBy(xpath="//a[contains(text(),'Normal')]")
    private static WebElement  normalBtn;
   
				
	//Voucher Home Page Grid Header Columns
	@FindBy(xpath="//input[@id='HeaderChkBox']")
	private static WebElement  grid_HeaderChkBox;	
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[3]")
	private static WebElement  grid_Header_Date;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[4]")
	private static WebElement  grid_Header_VoucherNumber;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[5]")
	private static WebElement  grid_Header_CreatedBy;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[6]")
	private static WebElement  grid_Header_ModifiedBy;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[7]")
	private static WebElement  grid_Header_CreatedDate;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[8]")
	private static WebElement  grid_Header_ModifiedDate;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[9]")
	private static WebElement  grid_Header_CreatedTime;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[10]")
	private static WebElement  grid_Header_ModifiedTime;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[11]")
	private static WebElement  grid_Header_Suspended;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[12]")
	private static WebElement  grid_Header_Cancelled;
	
	@FindBy(xpath="//*[@id='tblHeadTransRenderRow']/th[13]")
	private static WebElement  grid_Header_AuthorizationStatus;
	
	
	//Grid Voucher DetailsBtn
	@FindBy(xpath="//tr[@id='trRender_1']//i[@class='icon-info icon-font7']")
	private static WebElement  grid_VoucherDetailsBtn1;
	
	@FindBy(xpath="//tr[@id='trRender_2']//i[@class='icon-info icon-font7']")
	private static WebElement  grid_VoucherDetailsBtn2;
	
	
	//Grid CheckBox 1 And 2
	
	@FindBy(xpath="//tr[@id='trRender_1']//td//input")
	private static WebElement  grid_ChkBox1;
	
	@FindBy(xpath="//tr[@id='trRender_2']//td//input")
	private static WebElement  grid_ChkBox2;
	
	@FindBy(xpath="//tr[@id='trRender_3']//td//input")
	private static WebElement  grid_ChkBox3;
	
	@FindBy(xpath="//tr[@id='trRender_4']//td//input")
	private static WebElement  grid_ChkBox4;
	
	
	// Vouchers Home Page Footer
	@FindBy(xpath="//div[@id='tblFooterReportRender']//input[@id='txtSearch']")
	private static WebElement  searchField;
							
	@FindBy(xpath="//button[@id='frstPage']")
	private static WebElement  firstPageBtn;

	@FindBy(xpath="//button[@id='id_previousPage']")
	private static WebElement  previousPageBtn;

	@FindBy(xpath="//button[@id='id_pagenumber']")
	private static WebElement  currentPageNo;

	@FindBy(xpath="//button[@id='id_nextPage']")
	private static WebElement  nextPageBtn;

	@FindBy(xpath="//button[@id='lstPage']")
	private static WebElement  lastPageBtn;
	
	
	
	//Vouchers Entry Page Ribbon Control Options
	@FindBy(xpath="//span[@class='icon-scroll icon-font6']")
	private static WebElement  freeFlowBtn;
	
	@FindBy(xpath="//span[@class='icon-header icon-font6']")
	private static WebElement  jumpToHeaderSectionBtn;
	
	@FindBy(xpath="//span[@class='icon-panel icon-font6']")
	private static WebElement  jumpToBodySectionBtn;
	
	@FindBy(xpath="//span[@class='icon-footer icon-font6']")
	private static WebElement  jumpToFooterBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_new']")
	private static WebElement  new_newBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_save']/div[2]")
	private static WebElement  saveBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_previous']")
	private static WebElement  previousBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_next']")
	private static WebElement  nextBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_print']")
	private static WebElement  new_PrintBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_suspend']")
	private static WebElement  new_SuspendBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_close']")
	private static WebElement  new_CloseBtn;
	
	@FindBy(xpath="//div[@id='id_transactionentry_delete']//span[contains(@class,'icon-delete icon-font6')]")
	private static WebElement  new_DeleteBtn;
	
	@FindBy(xpath="//span[@class='icon-menu icon-font4']")
	private static WebElement  toggleBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_copydocument']")
	private static WebElement  copyDocumentOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_copytoclipboard']")
	private static WebElement  copyToClipBoardOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_pastefromclipboard']")
	private static WebElement  pasteFromClipBoardOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_raisechequereturn']")
	private static WebElement  raiseCheckReturnOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_addtostock']")
	private static WebElement  addToStockOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_markconvert']")
	private static WebElement  markConvertedOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_bominput']")
	private static WebElement  bOMinputOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_autoallocate']")
	private static WebElement  autoAllocateOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_reverseentry']")
	private static WebElement  reverseEntryOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_printbarcode']")
	private static WebElement  printBarCodeOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_postingdetails']")
	private static WebElement  postingDetailsOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_exporttoxml']")
	private static WebElement  exportToXMLOption;
	
	@FindBy(xpath="//*[@id='id_transactionentry_settings']")
	private static WebElement  settingsOption;
	
	
	
	//Voucher Entry Page Header Fields
	@FindBy(xpath="//input[@id='id_header_1']")
	private static WebElement  documentNumberTxt;
	
	@FindBy(xpath="//*[@id='id_header_1_input_image']/span")
	private static WebElement  documentNumberdropdown_ExpansionBtn;
	
	@FindBy(xpath="//input[@id='id_header_2']")
	private static WebElement  dateTxt;
	
	@FindBy(xpath="//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	private static WebElement  dateTxt_CalenderBtn;
	
	@FindBy(xpath="//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
	private static WebElement  calender_TodayBtn;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  caskBankAccountTxt;
	
	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	private static WebElement  caskBankAccount_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  cashBankAccount_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
		private static WebElement  cashBankAccount_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
		private static WebElement  cashBankAccount_Settings_StandardFieldsBtn;
								
					@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
					private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_Fielddropdown;
														
					@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
					private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_HeaderTxt;
													
					@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
					private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
														
					@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
					private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_WidthTxt;
														
					@FindBy(xpath="//div[@class='panel']//input[3]")
					private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_OkBtn;
														
					@FindBy(xpath="//div[@class='panel']//input[4]")
					private static WebElement  cashBankAccount_Settings_StandardFieldsBtn_CancelBtn;
								
								
		@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
		private static WebElement  cashBankAccount_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[@class='panel']//input[3]")
		private static WebElement  cashBankAccount_Settings_OkBtn;
						
		@FindBy(xpath="//div[@class='panel']//input[4]")
		private static WebElement  cashBankAccount_Settings_CancelBtn;
			
	@FindBy(xpath="//input[@id='id_header_268435459']")
	private static WebElement  departmentTxt;
	
	@FindBy(xpath="//*[@id='id_header_268435459_input_image']/span")
	private static WebElement  department_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_268435459_input_settings']/span")
	private static WebElement  department_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_268435459_customize_popup_container']")
		private static WebElement  department_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_268435459_customize_popup_footer']//input[1]")
		private static WebElement  department_Settings_StandardFieldsBtn;
						
			@FindBy(xpath="//select[@id='id_header_268435459_customize_popup_standardfields_list']")
			private static WebElement  department_Settings_StandardFieldsBtn_Fielddropdown;
												
			@FindBy(xpath="//input[@id='id_header_268435459_customize_popup_standardfields_header']")
			private static WebElement  department_Settings_StandardFieldsBtn_HeaderTxt;
											
			@FindBy(xpath="//select[@id='id_header_268435459_customize_popup_standardfields_alignment']")
			private static WebElement  department_Settings_StandardFieldsBtn_Alignmentdropdown;
												
			@FindBy(xpath="//input[@id='id_header_268435459_customize_popup_standardfields_width']")
			private static WebElement  department_Settings_StandardFieldsBtn_WidthTxt;
												
			@FindBy(xpath="//div[@class='panel']//input[3]")
			private static WebElement  department_Settings_StandardFieldsBtn_OkBtn;
												
			@FindBy(xpath="//div[@class='panel']//input[4]")
			private static WebElement  department_Settings_StandardFieldsBtn_CancelBtn;
						
								
		@FindBy(xpath="//div[@id='id_header_268435459_search_container']//input[2]")
		private static WebElement  department_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[@class='panel']//input[3]")
		private static WebElement  department_Settings_OkBtn;
						
		@FindBy(xpath="//div[@class='panel']//input[4]")
		private static WebElement  department_Settings_CancelBtn;

	@FindBy(xpath="//*[@id='id_header_6']")
	private static WebElement  maturityDateTxt;
	
	@FindBy(xpath="//*[@id='id_header_6_input_image']/span']")
	private static WebElement  maturityDateTxt_CalenderBtn;
	
	@FindBy(xpath="//input[@id='id_header_3']")
	private static WebElement  purchaseAccountTxt;
	
	@FindBy(xpath="//*[@id='id_header_3_input_image']/span")
	private static WebElement  purchaseAccount_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_3_input_settings']/span")
	private static WebElement  purchaseAccount_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_3_customize_popup_container']")
		private static WebElement  purchaseAccount_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_3_customize_popup_footer']//input[1]")
		private static WebElement  purchaseAccount_Settings_StandardFieldsBtn;
						
			@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_list']")
			private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_Fielddropdown;
												
			@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_header']")
			private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_HeaderTxt;
											
			@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_alignment']")
			private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
												
			@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_width']")
			private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_WidthTxt;
												
			@FindBy(xpath="//div[@class='panel']//input[3]")
			private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_OkBtn;
												
			@FindBy(xpath="//div[@class='panel']//input[4]")
			private static WebElement  purchaseAccount_Settings_StandardFieldsBtn_CancelBtn;
								
								
		@FindBy(xpath="//div[@id='id_header_3_search_container']//input[2]")
		private static WebElement  purchaseAccount_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[@class='panel']//input[3]")
		private static WebElement  purchaseAccount_Settings_OkBtn;
						
		@FindBy(xpath="//div[@class='panel']//input[4]")
		private static WebElement  purchaseAccount_Settings_CancelBtn;


@FindBy(xpath="//input[@id='id_header_4']")
private static WebElement  vendorAccountTxt;

@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
private static WebElement  vendorAccount_ExpansionBtn;

@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
private static WebElement  vendorAccount_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
		private static WebElement  vendorAccount_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
		private static WebElement  vendorAccount_Settings_StandardFieldsBtn;
								
					@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
					private static WebElement  vendorAccount_Settings_StandardFieldsBtn_Fielddropdown;
														
					@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
					private static WebElement  vendorAccount_Settings_StandardFieldsBtn_HeaderTxt;
													
					@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
					private static WebElement  vendorAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
														
					@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
					private static WebElement  vendorAccount_Settings_StandardFieldsBtn_WidthTxt;
														
					@FindBy(xpath="//div[@class='panel']//input[3]")
					private static WebElement  vendorAccount_Settings_StandardFieldsBtn_OkBtn;
														
					@FindBy(xpath="//div[@class='panel']//input[4]")
					private static WebElement  vendorAccount_Settings_StandardFieldsBtn_CancelBtn;
								
								
		@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
		private static WebElement  vendorAccount_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[@class='panel']//input[3]")
		private static WebElement  vendorAccount_Settings_OkBtn;
						
		@FindBy(xpath="//div[@class='panel']//input[4]")
		private static WebElement  vendorAccount_Settings_CancelBtn;

@FindBy(xpath="//input[@id='id_header_3']")
private static WebElement  salesAccountTxt;

@FindBy(xpath="//*[@id='id_header_3_input_image']/span")
private static WebElement  salesAccount_ExpansionBtn;

@FindBy(xpath="//*[@id='id_header_3_input_settings']/span")
private static WebElement  salesAccount_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_3_customize_popup_container']")
		private static WebElement  salesAccount_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_3_customize_popup_footer']//input[1]")
		private static WebElement  salesAccount_Settings_StandardFieldsBtn;
								
					@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_list']")
					private static WebElement  salesAccount_Settings_StandardFieldsBtn_Fielddropdown;
														
					@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_header']")
					private static WebElement  salesAccount_Settings_StandardFieldsBtn_HeaderTxt;
													
					@FindBy(xpath="//select[@id='id_header_3_customize_popup_standardfields_alignment']")
					private static WebElement  salesAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
														
					@FindBy(xpath="//input[@id='id_header_3_customize_popup_standardfields_width']")
					private static WebElement  salesAccount_Settings_StandardFieldsBtn_WidthTxt;
														
					@FindBy(xpath="//div[@class='panel']//input[3]")
					private static WebElement  salesAccount_Settings_StandardFieldsBtn_OkBtn;
														
					@FindBy(xpath="//div[@class='panel']//input[4]")
					private static WebElement  salesAccount_Settings_StandardFieldsBtn_CancelBtn;
								
								
		@FindBy(xpath="//div[@id='id_header_3_search_container']//input[2]")
		private static WebElement  salesAccount_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[@class='panel']//input[3]")
		private static WebElement  salesAccount_Settings_OkBtn;
						
		@FindBy(xpath="//div[@class='panel']//input[4]")
		private static WebElement  salesAccount_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  customerAccountTxt;
	
	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	private static WebElement  customerAccount_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  customerAccount_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
		private static WebElement  customerAccount_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
		private static WebElement  customerAccount_Settings_StandardFieldsBtn;
								
					@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
					private static WebElement  customerAccount_Settings_StandardFieldsBtn_Fielddropdown;
														
					@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
					private static WebElement  customerAccount_Settings_StandardFieldsBtn_HeaderTxt;
													
					@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
					private static WebElement  customerAccount_Settings_StandardFieldsBtn_Alignmentdropdown;
														
					@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
					private static WebElement  customerAccount_Settings_StandardFieldsBtn_WidthTxt;
														
					@FindBy(xpath="//div[@class='panel']//input[3]")
					private static WebElement  customerAccount_Settings_StandardFieldsBtn_OkBtn;
														
					@FindBy(xpath="//div[@class='panel']//input[4]")
					private static WebElement  customerAccount_Settings_StandardFieldsBtn_CancelBtn;
								
								
		@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
		private static WebElement  customerAccount_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[@class='panel']//input[3]")
		private static WebElement  customerAccount_Settings_OkBtn;
						
		@FindBy(xpath="//div[@class='panel']//input[4]")
		private static WebElement  customerAccount_Settings_CancelBtn;
	
	@FindBy(xpath="//input[@id='id_header_12']")
	private static WebElement  accountTxt;
	
	@FindBy(xpath="//*[@id='id_header_12_input_image']/span")
	private static WebElement  account_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_4_input_settings']/span")
	private static WebElement  account_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_4_customize_popup_container']")
		private static WebElement  account_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_4_customize_popup_footer']//input[1]")
		private static WebElement  account_Settings_StandardFieldsBtn;
								
			@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_list']")
			private static WebElement  account_Settings_StandardFieldsBtn_Fielddropdown;
												
			@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_header']")
			private static WebElement  account_Settings_StandardFieldsBtn_HeaderTxt;
											
			@FindBy(xpath="//select[@id='id_header_4_customize_popup_standardfields_alignment']")
			private static WebElement  account_Settings_StandardFieldsBtn_Alignmentdropdown;
												
			@FindBy(xpath="//input[@id='id_header_4_customize_popup_standardfields_width']")
			private static WebElement  account_Settings_StandardFieldsBtn_WidthTxt;
												
			@FindBy(xpath="//div[@class='panel']//input[3]")
			private static WebElement  account_Settings_StandardFieldsBtn_OkBtn;
												
			@FindBy(xpath="//div[@class='panel']//input[4]")
			private static WebElement  account_Settings_StandardFieldsBtn_CancelBtn;
								
								
		@FindBy(xpath="//div[@id='id_header_4_search_container']//input[2]")
		private static WebElement  account_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[@class='panel']//input[3]")
		private static WebElement  account_Settings_OkBtn;
						
		@FindBy(xpath="//div[@class='panel']//input[4]")
		private static WebElement  account_Settings_CancelBtn;
	
	@FindBy(xpath="//input[@id='id_header_31']")
	private static WebElement  issuesReceiptsTxt;
	
	@FindBy(xpath="//input[@id='id_header_268435460']")
	private static WebElement  wareHouseTxt;
	
	@FindBy(xpath="//*[@id='id_header_268435460_input_image']/span")
	private static WebElement  wareHouse_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_header_268435460_input_settings']/span")
	private static WebElement  wareHouse_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_268435460_customize_popup_container']")
		private static WebElement  wareHouse_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_268435460_customize_popup_footer']//input[1]")
		private static WebElement  wareHouse_Settings_StandardFieldsBtn;
								
			@FindBy(xpath="//select[@id='id_header_268435460_customize_popup_standardfields_list']")
			private static WebElement  wareHouse_Settings_StandardFieldsBtn_Fielddropdown;
												
			@FindBy(xpath="//input[@id='id_header_268435460_customize_popup_standardfields_header']")
			private static WebElement  wareHouse_Settings_StandardFieldsBtn_HeaderTxt;
											
			@FindBy(xpath="//select[@id='id_header_268435460_customize_popup_standardfields_alignment']")
			private static WebElement  wareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;
												
			@FindBy(xpath="//input[@id='id_header_268435460_customize_popup_standardfields_width']")
			private static WebElement  wareHouse_Settings_StandardFieldsBtn_WidthTxt;
												
			@FindBy(xpath="//div[@class='panel']//input[3]")
			private static WebElement  wareHouse_Settings_StandardFieldsBtn_OkBtn;
												
			@FindBy(xpath="//div[@class='panel']//input[4]")
			private static WebElement  wareHouse_Settings_StandardFieldsBtn_CancelBtn;
								
		@FindBy(xpath="//div[@id='id_header_268435460_search_container']//input[2]")
		private static WebElement  wareHouse_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[@class='panel']//input[3]")
		private static WebElement  wareHouse_Settings_OkBtn;
						
		@FindBy(xpath="//div[@class='panel']//input[4]")
		private static WebElement  wareHouse_Settings_CancelBtn;
	
	@FindBy(xpath="//span[contains(text(),'sName')]")
	private static WebElement  customize_sName;
	
	@FindBy(xpath="//span[@class='vcenter'][contains(text(),'Code')]")
	private static WebElement  customize_sCode;
	
	@FindBy(xpath="//span[contains(text(),'Alias')]")
	private static WebElement  customize_Alias;
	
	@FindBy(xpath="//span[@class='vcenter'][contains(text(),'Group')]")
	private static WebElement  customize_bGroup;
	
	@FindBy(xpath="//span[contains(@class,'vcenter')][contains(text(),'Balance')]")
	private static WebElement  customize_Balance;
	
	@FindBy(xpath="//input[@id='id_header_67108920']")
	private static WebElement  appropriateBasedOndropdown;
	
	@FindBy(xpath="//input[@id='id_header_67108921']")
	private static WebElement  additionalValueTxt;
	
	@FindBy(xpath="//input[@id='id_header_21']")
	private static WebElement  raiseReceiptsChkBox;
	
	@FindBy(xpath="//input[@id='id_header_67108865']")
	private static WebElement  receipts_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108868']")
	private static WebElement  payments_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108871']")
	private static WebElement  pettyCash_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108874']")
	private static WebElement  postDatedReceipts_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108865']")
	private static WebElement  postDatedPayments_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108880']")
	private static WebElement  purchaseVouchers_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108881']")
	private static WebElement  purchaseReturns_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108884']")
	private static WebElement  salesInvoice_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108886']")
	private static WebElement  salesOrder_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108928']")
	private static WebElement  salesInvoiceNewNarrationTxt;
	
	
	@FindBy(xpath="//input[@id='id_header_67108885']")
	private static WebElement  salesReturns_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108913']")
	private static WebElement  cashSales_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108914']")
	private static WebElement  hirePurchaseSales_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108890']")
	private static WebElement  journalEntries_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108916']")
	private static WebElement  forexJV_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108910']")
	private static WebElement  interDepartmentalJV_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108888']")
	private static WebElement  nonStandardJournalEntries_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108892']")
	private static WebElement  debitNotes_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108911']")
	private static WebElement  debitNotesLineWise_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108893']")
	private static WebElement  creditNotes_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108912']")
	private static WebElement  creditNotesLineWisePayroll_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108894']")
	private static WebElement  openingBalance_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108891']")
	private static WebElement  fixedAssetDepreciationVoucher_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108909']")
	private static WebElement  requestForQuote_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108903']")
	private static WebElement  purchasesQuotations_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108882']")
	private static WebElement  purchasesOrders_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108882']")
	private static WebElement  materialReceiptsNotes_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108904']")
	private static WebElement  salesQuotationss_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108887']")
	private static WebElement  deliveryNotes_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108917']")
	private static WebElement  posSales_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108918']")
	private static WebElement  productionOrder_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108886']")
	private static WebElement  salesOrders_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108895']")
	private static WebElement  shortagesinStock_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108896']")
	private static WebElement  excessesinStocks_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108897']")
	private static WebElement  stockTransfers_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108898']")
	private static WebElement  openingStocks_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108941']")
	private static WebElement  openingStocksNEW_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108908']")
	private static WebElement  materialRequisition_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108866']")
	private static WebElement  receipts_ChequeNoTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108869']")
	private static WebElement  payments_ChequeNoTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108872']")
	private static WebElement  pettyCash_ChequeNoTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108875']")
	private static WebElement  postDatedReceipts_ChequeNoTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108878']")
	private static WebElement  postDatedPayments_ChequeNoTxt;



	//Voucher Entry Page Body Fields
	
	@FindBy(xpath="//input[@id='id_body_536870916']")
	private static WebElement  pvWareHouseTxt;
	
	@FindBy(xpath="//td[@id='id_body_536870916_input_image']//span[@class='icon-down-arrow optioncontrol_arrow_margin']")
	private static WebElement  pvWareHouse_ExpansionBtn;
	
	@FindBy(xpath="//td[@id='id_body_536870916_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement  pvWareHouse_SettingsBtn;

		@FindBy(xpath="//div[@id='id_body_536870916_customize_popup_container']")
		private static WebElement  pvWareHouse_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_body_536870916_customize_popup_footer']//input[1]")
		private static WebElement  pvWareHouse_Settings_StandardFieldsBtn;
								
			@FindBy(xpath="//select[@id='id_body_536870916_customize_popup_standardfields_list']")
			private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_Fielddropdown;
												
			@FindBy(xpath="//input[@id='id_body_536870916_customize_popup_standardfields_header']")
			private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_HeaderTxt;
											
			@FindBy(xpath="//select[@id='id_body_536870916_customize_popup_standardfields_alignment']")
			private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;
												
			@FindBy(xpath="//input[@id='id_body_536870916_customize_popup_standardfields_width']")
			private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_WidthTxt;
												
			@FindBy(xpath="//div[@class='panel']//input[3]")
			private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_OkBtn;
												
			@FindBy(xpath="//div[@class='panel']//input[4]")
			private static WebElement  pvWareHouse_Settings_StandardFieldsBtn_CancelBtn;
								
		@FindBy(xpath="//div[@id='id_body_536870916_search_container']//input[2]")
		private static WebElement  pvWareHouse_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[@class='panel']//input[3]")
		private static WebElement  pvWareHouse_Settings_OkBtn;
						
		@FindBy(xpath="//div[@class='panel']//input[4]")
		private static WebElement  pvWareHouse_Settings_CancelBtn;
	
	// Grid Elements
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement  grid_Header_Account;
	
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement  grid_Header_Item;
	
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement  grid_Header_DebitAC;
	
	@FindBy(xpath="//th[@id='id_transaction_entry_detail_table_control_heading_2']")
	private static WebElement  grid_Header_CreditAC;



	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[1]")
	private static WebElement  firstRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[1]")
	private static WebElement  secondRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[1]")
	private static WebElement  thirdRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[1]")
	private static WebElement  fourthRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[1]")
	private static WebElement  fifthRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[1]")
	private static WebElement  sixthRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[1]")
	private static WebElement  seventhRowIndex;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[1]")
	private static WebElement  eigthRowIndex;
	
	@FindBy(xpath="//span[@class='icon-delete icon-font8']")
	private static WebElement  deleteRowBtn;
	
	@FindBy(xpath="//span[@class='icon-insertrow icon-font8']")
	private static WebElement  insertRowBtn;
	
	@FindBy(xpath="//span[@class='icon-selectall icon-font8']")
	private static WebElement  selectRowBtn;
	
	@FindBy(xpath="//span[@class='icon-unselectall1 icon-font8']")
	private static WebElement  unSelectRowBtn;
	
	@FindBy(xpath="//span[@class='icon-clone icon-font8']")
	private static WebElement  duplicateRowBtn;

	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
	private static WebElement  select1stRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
	private static WebElement  select1stRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	private static WebElement  select1stRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	private static WebElement  select1stRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	private static WebElement  select1stRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	private static WebElement  select1stRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	private static WebElement  select1stRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	private static WebElement  select1stRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
	private static WebElement  select1stRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
	private static WebElement  select1stRow_10thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
	private static WebElement  select1stRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
	private static WebElement  select1stRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
	private static WebElement  select1stRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
	private static WebElement  select1stRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
	private static WebElement  select1stRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
	private static WebElement  select1stRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[18]")
	private static WebElement  select1stRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[19]")
	private static WebElement  select1stRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
	private static WebElement  select2ndRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
	private static WebElement  select2ndRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
	private static WebElement  select2ndRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
	private static WebElement  select2ndRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
	private static WebElement  select2ndRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
	private static WebElement  select2ndRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
	private static WebElement  select2ndRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
	private static WebElement  select2ndRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]")
	private static WebElement  select2ndRow_9thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
	private static WebElement  select2ndRow_11thColumn;

	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
	private static WebElement  select2ndRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
	private static WebElement  select2ndRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[15]")
	private static WebElement  select2ndRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]")
	private static WebElement  select2ndRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]")
	private static WebElement  select2ndRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[18]")
	private static WebElement  select2ndRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[19]")
	private static WebElement  select2ndRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[20]")
	private static WebElement  select2ndRow_19thColumn;

	
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
	private static WebElement  select3rdRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
	private static WebElement  select3rdRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
	private static WebElement  select3rdRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[5]")
	private static WebElement  select3rdRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]")
	private static WebElement  select3rdRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[7]")
	private static WebElement  select3rdRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
	private static WebElement  select3rdRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
	private static WebElement  select3rdRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]")
	private static WebElement  select3rdRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[11]")
	private static WebElement  select3rdRow_10thColumn;

    @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[12]")
	private static WebElement  select3rdRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[13]")
	private static WebElement  select3rdRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[14]")
	private static WebElement  select3rdRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[15]")
	private static WebElement  select3rdRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[16]")
	private static WebElement  select3rdRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[17]")
	private static WebElement  select3rdRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[18]")
	private static WebElement  select3rdRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[19]")
	private static WebElement  select3rdRow_18thColumn;




	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[2]")
	private static WebElement  select4thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[3]")
	private static WebElement  select4thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[4]")
	private static WebElement  select4thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[5]")
	private static WebElement  select4thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[6]")
	private static WebElement  select4thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[7]")
	private static WebElement  select4thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]")
	private static WebElement  select4thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[9]")
	private static WebElement  select4thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[10]")
	private static WebElement  select4thRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[11]")
	private static WebElement  select4thRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[12]")
	private static WebElement  select4thRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[13]")
	private static WebElement  select4thRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[14]")
	private static WebElement  select4thRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[15]")
	private static WebElement  select4thRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[16]")
	private static WebElement  select4thRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[17]")
	private static WebElement  select4thRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[18]")
	private static WebElement  select4thRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[19]")
	private static WebElement  select4thRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[20]")
	private static WebElement  select4thRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[21]")
	private static WebElement  select4thRow_20thColumn;



	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[2]")
	private static WebElement  select5thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[3]")
	private static WebElement  select5thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[4]")
	private static WebElement  select5thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[5]")
	private static WebElement  select5thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[6]")
	private static WebElement  select5thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[7]")
	private static WebElement  select5thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
	private static WebElement  select5thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
	private static WebElement  select5thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[10]")
	private static WebElement  select5thRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[11]")
	private static WebElement  select5thRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[12]")
	private static WebElement  select5thRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[13]")
	private static WebElement  select5thRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[14]")
	private static WebElement  select5thRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[15]")
	private static WebElement  select5thRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[16]")
	private static WebElement  select5thRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[17]")
	private static WebElement  select5thRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[18]")
	private static WebElement  select5thRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[19]")
	private static WebElement  select5thRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[20]")
	private static WebElement  select5thRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[21]")
	private static WebElement  select5thRow_20thColumn;




	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[2]")
	private static WebElement  select6thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[3]")
	private static WebElement  select6thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[4]")
	private static WebElement  select6thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[5]")
	private static WebElement  select6thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[6]")
	private static WebElement  select6thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[7]")
	private static WebElement  select6thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
	private static WebElement  select6thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
	private static WebElement  select6thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[10]")
	private static WebElement  select6thRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[11]")
	private static WebElement  select6thRow_10thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[12]")
	private static WebElement  select6thRow_11thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[13]")
	private static WebElement  select6thRow_12thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[14]")
	private static WebElement  select6thRow_13thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[15]")
	private static WebElement  select6thRow_14thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[16]")
	private static WebElement  select6thRow_15thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[17]")
	private static WebElement  select6thRow_16thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[18]")
	private static WebElement  select6thRow_17thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[19]")
	private static WebElement  select6thRow_18thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[20]")
	private static WebElement  select6thRow_19thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[21]")
	private static WebElement  select6thRow_20thColumn;


	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[2]")
	private static WebElement  select7thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[3]")
	private static WebElement  select7thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[4]")
	private static WebElement  select7thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[5]")
	private static WebElement  select7thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[6]")
	private static WebElement  select7thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[7]")
	private static WebElement  select7thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[8]")
	private static WebElement  select7thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[9]")
	private static WebElement  select7thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[10]")
	private static WebElement  select7thRow_9thColumn;



	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[2]")
	private static WebElement  select8thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[3]")
	private static WebElement  select8thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[4]")
	private static WebElement  select8thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[5]")
	private static WebElement  select8thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[6]")
	private static WebElement  select8thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[7]")
	private static WebElement  select8thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[8]")
	private static WebElement  select8thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[9]")
	private static WebElement  select8thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[10]")
	private static WebElement  select8thRow_9thColumn;


	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[2]")
	private static WebElement  select9thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[3]")
	private static WebElement  select9thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[4]")
	private static WebElement  select9thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[5]")
	private static WebElement  select9thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[6]")
	private static WebElement  select9thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[7]")
	private static WebElement  select9thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[8]")
	private static WebElement  select9thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[9]")
	private static WebElement  select9thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[10]")
	private static WebElement  select9thRow_9thColumn;



	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[2]")
	private static WebElement  select10thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[3]")
	private static WebElement  select10thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[4]")
	private static WebElement  select10thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[5]")
	private static WebElement  select10thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[6]")
	private static WebElement  select10thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[7]")
	private static WebElement  select10thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[8]")
	private static WebElement  select10thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[9]")
	private static WebElement  select10thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[10]")
	private static WebElement  select10thRow_9thColumn;


	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[2]")
	private static WebElement  select11thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[3]")
	private static WebElement  select11thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[4]")
	private static WebElement  select11thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[5]")
	private static WebElement  select11thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[6]")
	private static WebElement  select11thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[7]")
	private static WebElement  select11thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[8]")
	private static WebElement  select11thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[9]")
	private static WebElement  select11thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[10]")
	private static WebElement  select11thRow_9thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[2]")
	private static WebElement  select12thRow_1stColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[3]")
	private static WebElement  select12thRow_2ndColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[4]")
	private static WebElement  select12thRow_3rdColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[5]")
	private static WebElement  select12thRow_4thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[6]")
	private static WebElement  select12thRow_5thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[7]")
	private static WebElement  select12thRow_6thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[8]")
	private static WebElement  select12thRow_7thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[9]")
	private static WebElement  select12thRow_8thColumn;
	
	@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[10]")
	private static WebElement  select12thRow_9thColumn;

	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_AccountTxt;
	
	@FindBy(xpath="//*[@id='id_body_12_input_image']/span")
	private static WebElement  enter_Account_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_12_input_settings']/span")
	private static WebElement  enter_Account_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_12_customize_popup_container']")
		private static WebElement  enter_Account_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_12_customize_popup_footer']//input[1]")
		private static WebElement  enter_Account_Settings_StandardFieldsBtn;
								
					@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_list']")
					private static WebElement  enter_Account_Settings_StandardFieldsBtn_Fielddropdown;
														
					@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_header']")
					private static WebElement  enter_Account_Settings_StandardFieldsBtn_HeaderTxt;
													
					@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_alignment']")
					private static WebElement  enter_Account_Settings_StandardFieldsBtn_Alignmentdropdown;
														
					@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_width']")
					private static WebElement  enter_Account_Settings_StandardFieldsBtn_WidthTxt;
														
					@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
					private static WebElement  enter_Account_Settings_StandardFieldsBtn_OkBtn;
														
					@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
					private static WebElement  enter_Account_Settings_StandardFieldsBtn_CancelBtn;
								
		@FindBy(xpath="//div[@id='id_header_12_search_container']//input[2]")
		private static WebElement  enter_Account_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
		private static WebElement  enter_Account_Settings_OkBtn;
						
		@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
		private static WebElement  enter_Account_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_body_16']")
	private static WebElement  enter_Amount;
	
	@FindBy(xpath="//textarea[@id='id_body_16777219']")
	private static WebElement  enter_Receipts_Remarks;
	
	@FindBy(xpath="//textarea[@id='id_body_16777222']")
	private static WebElement  enter_Payments_Remarks;
	
	@FindBy(xpath="//textarea[@id='id_body_16777225']")
	private static WebElement  enter_PettyCash_Remarks;
	
	@FindBy(xpath="//textarea[@id='id_body_16777228']")
	private static WebElement  enter_PostDatedReceipts_Remarks;
	
	@FindBy(xpath="//textarea[@id='id_body_16777231']")
	private static WebElement  enter_PostDatedPaymentss_Remarks;
	
	@FindBy(xpath="//input[@id='id_body_23']")
	private static WebElement  enter_ItemTxt;
	
	@FindBy(xpath="//*[@id='id_body_23_input_image']/span")
	private static WebElement  item_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_23_input_settings']/span")
	private static WebElement  item_SettingsBtn;

		@FindBy(xpath="//div[@id='id_body_23_customize_popup_container']")
		private static WebElement  item_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_body_23_customize_popup_footer']//input[1]")
		private static WebElement  item_Settings_StandardFieldsBtn;
								
			@FindBy(xpath="//select[@id='id_body_23_customize_popup_standardfields_list']")
			private static WebElement  item_Settings_StandardFieldsBtn_Fielddropdown;
												
			@FindBy(xpath="//input[@id='id_body_23_customize_popup_standardfields_header']")
			private static WebElement  item_Settings_StandardFieldsBtn_HeaderTxt;
											
			@FindBy(xpath="//select[@id='id_body_23_customize_popup_standardfields_alignment']")
			private static WebElement  item_Settings_StandardFieldsBtn_Alignmentdropdown;
												
			@FindBy(xpath="//input[@id='id_body_23_customize_popup_standardfields_width']")
			private static WebElement  item_Settings_StandardFieldsBtn_WidthTxt;
												
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			private static WebElement  item_Settings_StandardFieldsBtn_OkBtn;
												
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			private static WebElement  item_Settings_StandardFieldsBtn_CancelBtn;
								
		@FindBy(xpath="//div[@id='id_body_23_search_container']//input[2]")
		private static WebElement  item_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
		private static WebElement  item_Settings_OkBtn;
						
		@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
		private static WebElement  item_Settings_CancelBtn;

	@FindBy(xpath="//*[@id='id_body_24']")
	private static WebElement  enter_UnitTxt;
	
	@FindBy(xpath="//*[@id='id_body_24_input_image']/span")
	private static WebElement  unit_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_24_input_settings']/span")
	private static WebElement  unit_SettingsBtn;

		@FindBy(xpath="//div[@id='id_body_24_customize_popup_container']")
		private static WebElement  unit_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_body_24_customize_popup_footer']//input[1]")
		private static WebElement  unit_Settings_StandardFieldsBtn;
								
			@FindBy(xpath="//select[@id='id_body_24_customize_popup_standardfields_list']")
			private static WebElement  unit_Settings_StandardFieldsBtn_Fielddropdown;
												
			@FindBy(xpath="//input[@id='id_body_24_customize_popup_standardfields_header']")
			private static WebElement  unit_Settings_StandardFieldsBtn_HeaderTxt;
											
			@FindBy(xpath="//select[@id='id_body_24_customize_popup_standardfields_alignment']")
			private static WebElement  unit_Settings_StandardFieldsBtn_Alignmentdropdown;
												
			@FindBy(xpath="//input[@id='id_body_24_customize_popup_standardfields_width']")
			private static WebElement  unit_Settings_StandardFieldsBtn_WidthTxt;
												
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			private static WebElement  unit_Settings_StandardFieldsBtn_OkBtn;
												
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			private static WebElement  unit_Settings_StandardFieldsBtn_CancelBtn;
								
		@FindBy(xpath="//div[@id='id_body_24_search_container']//input[2]")
		private static WebElement  unit_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
		private static WebElement  unit_Settings_OkBtn;
						
		@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
		private static WebElement  unit_Settings_CancelBtn;

			
	@FindBy(xpath="//input[@id='id_body_26']")
	private static WebElement  enter_Quantity;
	
	@FindBy(xpath="//input[@id='id_body_27']")
	private static WebElement  enter_Rate;
	
	@FindBy(xpath="//*[@id='id_body_28']")
	private static WebElement  enter_Gross;
	
	@FindBy(xpath="//input[@id='id_body_13']")
	private static WebElement  enter_Batch;
	
	@FindBy(xpath="//input[@id='id_body_12']")
	private static WebElement  enter_DebitACTxt;
	
	@FindBy(xpath="//*[@id='id_body_12_input_image']/span")
	private static WebElement  enter_DebitAC_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_12_input_settings']/span")
	private static WebElement  enter_DebitAC_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_12_customize_popup_container']")
		private static WebElement  enter_DebitAC_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_12_customize_popup_footer']//input[1]")
		private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn;
								
			@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_list']")
			private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_Fielddropdown;
												
			@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_header']")
			private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_HeaderTxt;
											
			@FindBy(xpath="//select[@id='id_header_12_customize_popup_standardfields_alignment']")
			private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_Alignmentdropdown;
												
			@FindBy(xpath="//input[@id='id_header_12_customize_popup_standardfields_width']")
			private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_WidthTxt;
												
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_OkBtn;
												
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			private static WebElement  enter_DebitAC_Settings_StandardFieldsBtn_CancelBtn;
								
		@FindBy(xpath="//div[@id='id_header_12_search_container']//input[2]")
		private static WebElement  enter_DebitAC_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
		private static WebElement  enter_DebitAC_Settings_OkBtn;
						
		@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
		private static WebElement  enter_DebitAC_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_body_39']")
	private static WebElement  enter_CreditACTxt;
	
	@FindBy(xpath="//*[@id='id_body_39_input_image']/span")
	private static WebElement  enter_CreditAC_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_39_input_settings']/span")
	private static WebElement  enter_CreditAC_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_39_customize_popup_container']")
		private static WebElement  enter_CreditAC_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_39_customize_popup_footer']//input[1]")
		private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn;
								
			@FindBy(xpath="//select[@id='id_header_39_customize_popup_standardfields_list']")
			private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_Fielddropdown;
												
			@FindBy(xpath="//input[@id='id_header_39_customize_popup_standardfields_header']")
			private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_HeaderTxt;
											
			@FindBy(xpath="//select[@id='id_header_39_customize_popup_standardfields_alignment']")
			private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_Alignmentdropdown;
												
			@FindBy(xpath="//input[@id='id_header_39_customize_popup_standardfields_width']")
			private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_WidthTxt;
												
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_OkBtn;
												
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			private static WebElement  enter_CreditAC_Settings_StandardFieldsBtn_CancelBtn;
								
		@FindBy(xpath="//div[@id='id_header_39_search_container']//input[2]")
		private static WebElement  enter_CreditAC_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
		private static WebElement  enter_CreditAC_Settings_OkBtn;
						
		@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
		private static WebElement  enter_CreditAC_Settings_CancelBtn;

	@FindBy(xpath="//input[@id='id_body_18']")
	private static WebElement  enter_DebitTxt;
	
	@FindBy(xpath="//input[@id='id_body_19']")
	private static WebElement  enter_CreditTxt;
	
	@FindBy(xpath="//textarea[@id='id_body_16777241']")
	private static WebElement  enter_NonStandardJournalEntries_RemarksTxt;
	
	@FindBy(xpath="//input[@id='id_body_87']")
	private static WebElement  enter_Warehouse2Txt;
	
	@FindBy(xpath="//*[@id='id_body_87_input_image']/span")
	private static WebElement  enter_Warehouse2_ExpansionBtn;
	
	@FindBy(xpath="//*[@id='id_body_87_input_settings']/span")
	private static WebElement  enter_Warehouse2_SettingsBtn;

		@FindBy(xpath="//div[@id='id_header_87_customize_popup_container']")
		private static WebElement  enter_WareHouse2_Settings_Container;
								
		@FindBy(xpath="//div[@id='id_header_87_customize_popup_footer']//input[1]")
		private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn;
								
			@FindBy(xpath="//select[@id='id_header_87_customize_popup_standardfields_list']")
			private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_Fielddropdown;
												
			@FindBy(xpath="//input[@id='id_header_87_customize_popup_standardfields_header']")
			private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_HeaderTxt;
											
			@FindBy(xpath="//select[@id='id_header_87_customize_popup_standardfields_alignment']")
			private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_Alignmentdropdown;
												
			@FindBy(xpath="//input[@id='id_header_87_customize_popup_standardfields_width']")
			private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_WidthTxt;
												
			@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
			private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_OkBtn;
												
			@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
			private static WebElement  enter_WareHouse2_Settings_StandardFieldsBtn_CancelBtn;
								
		@FindBy(xpath="//div[@id='id_header_87_search_container']//input[2]")
		private static WebElement  enter_WareHouse2_Settings_DeleteColumnBtn;
								
		@FindBy(xpath="//div[contains(@class,'panel')]//input[3]")
		private static WebElement  enter_WareHouse2_Settings_OkBtn;
						
		@FindBy(xpath="//div[contains(@class,'panel')]//input[4]")
		private static WebElement  enter_WareHouse2_Settings_CancelBtn;


	// Right Panel InfoSide Bar	
	@FindBy(xpath="//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
	private static WebElement  infoSideBarCustomizeBtn;

	@FindBy(xpath="//*[@id='id_transactionentry_infopanel_container']/div[1]/div[3]/span")
	private static WebElement  infoSideBarMinimizeExpandBtn;
		
		@FindBy(xpath="//li[@id='Trans_Dash_Save']//span[text()='Save']")
		private static WebElement  customizeSaveBtn;
		
		@FindBy(xpath="//span[@class='noWrap clsBlueColor'][contains(text(),'Cancel')]")
		private static WebElement  customizeCancelBtn;
		
		@FindBy(xpath="//input[@id='searchBoxTrans']")
		private static WebElement  customizeSearchTxt;
					
		@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@class='icon-search searchicon']")
		private static WebElement  customizeSearchBtn;
					
		@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='g']")
		private static WebElement  graphBtn;
					
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='Newgraph']")
			private static WebElement  newGraphOption;
				
		@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='r']")
		private static WebElement  reportBtn;
			
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewReport']")
			private static WebElement  newReportOption;
					
		@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='i']")
		private static WebElement  infoPanelBtn;
					
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewInfopanel']")
			private static WebElement  newInfoPanelOption;
			
		@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='w']")
		private static WebElement  workFlowBtn;
						
				@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewWorkflow']")
				private static WebElement  newWorkFlowOption;
						
		@FindBy(xpath="//a[@id='DocumentInfoOption']")
		private static WebElement  otherDashlets;
						
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//label[contains(@class,'theme_icon-color')][contains(text(),'Document Info')]")
			private static WebElement  documentInfo;

	/*@FindBy(xpath="//span[contains(@class,'icon-left-and-right-panel-icon icon-font6 no_padding_left_right')]")
	private static WebElement  infoSideBarMinimizeExpandBtn;	*/	
			
	@FindBy(xpath="//span[@class='icon-left-and-right-panel-icon icon-font6 no_padding_left_right']")
	private static WebElement  infoSideBarExpandBtn;


	// Footer Section
	@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
	private static WebElement  netLabel;
	
	@FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	private static WebElement  netAmount;


	
	//Navigation of Voucher Menus
	
	// Financial Menu and Sub Menus
	@FindBy(xpath="//span[@class='icon-financial icon-font1']")
	private static WebElement  finacinalsMenu;
	
		@FindBy(xpath="//a[@id='61']//span[contains(text(),'Transactions')]")
		private static WebElement  transactionsExpandBtn;
			
			@FindBy(xpath="//a[@id='2007']//span[contains(text(),'Purchases')]")
			private static WebElement  purchasesExpandBtn;
			
			@FindBy(xpath="//span[contains(text(),'Purchases Vouchers')]")
			private static WebElement  purchaseVouchersBtn;
			
    //Inventory Menu and Sub Menus		
	@FindBy(xpath="//div[contains(text(),'Inventory')]")
	private static WebElement  inventoryMenu; 
	
		@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
		private static WebElement  inventoryTransactionsMenu; 
			
			@FindBy(xpath="//*[@id='139']/span")
			private static WebElement  inventoryTransactionsPurchasesMenu; 
		
				@FindBy(xpath="//*[@id='2010']/span")
				private static WebElement  requestForQuoteVoucher;
				
				@FindBy(xpath="//*[@id='2011']/span")
				private static WebElement  purchasesQuotationsVoucher;
					
				@FindBy(xpath="//a[@id='2012']//span[contains(text(),'Purchases Orders')]")
				private static WebElement  purchasesOrdersVoucher;
			
				@FindBy(xpath="//*[@id='2013']/span")
				private static WebElement  materialReceiptNotesVoucher;
					
			@FindBy(xpath="//*[@id='140']/span")
			private static WebElement  inventoyTransactionsSalesMenu; 
				
				@FindBy(xpath="//*[@id='2018']/span")
				private static WebElement  salesQuotationsVoucher;
				
				@FindBy(xpath="//*[@id='2019']/span")
				private static WebElement  deliveryNotesVoucher;
				
				@FindBy(xpath="//*[@id='2022']/span")
				private static WebElement  posSalesVoucher;
				
				@FindBy(xpath="//*[@id='2045']/span")
				private static WebElement  productionOrdersVoucher;
				
				@FindBy(xpath="//*[@id='2017']/span")
				private static WebElement  salesOrdersVoucher;
							
			@FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
			private static WebElement  inventoryTransactionsStocksMenu; 
				
				@FindBy(xpath="//*[@id='2034']/span")
				private static WebElement  shortagesInStockVoucher;
				
				@FindBy(xpath="//*[@id='2035']/span")
				private static WebElement  excessesInStocksVoucher;
					
				@FindBy(xpath="//*[@id='2036']/span")
				private static WebElement  stockTransfersVoucher;
				
				@FindBy(xpath="//a[@id='2037']//span[contains(text(),'Opening Stocks')]")
				private static WebElement  openingStocksVoucher;
				
				@FindBy(xpath="//a[@id='2061']//span[contains(text(),'Opening Stock New')]")
				private static WebElement  openingStocksNewVoucher;
				
				@FindBy(xpath="//*[@id='2038']/span")
				private static WebElement  materialRequisitionVoucher;
						
				@FindBy(xpath="//*[@id='2049']/span")
				private static WebElement  stockAdjustmentVoucher;
					
			@FindBy(xpath="//*[@id='164']/span")
			private static WebElement  holdAndUnholdStockVoucher;
			
			@FindBy(xpath="//*[@id='93']/span")
			private static WebElement  stockReconciliation;
			
			@FindBy(xpath="//*[@id='99']/span")
			private static WebElement  stockAllocation;
		
			
    //Validation and Confirmation messages
	@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;
	 
	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;
	
	//Dash board Page
	@FindBy(xpath="//*[@id='dashName']")
    private static WebElement labelDashboard ;
	
	@FindBy(xpath="//*[@id='Select_dash']")
	private static WebElement selectDashboard ;
		
	@FindBy(xpath="//*[@id='Dashboard_AddDash']")
    private static WebElement newAddDashBoard;
	 
    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
    private static WebElement dashboardCustomizationSettings;
			
		   
		    
    //Vouchers Settings Options
	@FindBy(xpath="//span[@id='updateButton']")
	private static WebElement  updateBtn;
	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement  settings_closeBtn;
					
		//Documents Tab
		@FindBy(xpath="//div[@class='font-5 theme_background-color-inverse theme_color-inverse']")
		private static WebElement  documentsTab;
		
		@FindBy(xpath="//li[@id='navigationtab1']")
		private static WebElement  documentsTabForMaterialReceiptNotes;
		
		@FindBy(xpath="//span[@id='DocumentLoadMasterPopupBtn']")
		private static WebElement  loadMastersBtn;
			
			@FindBy(xpath="//select[@id='doc_voucherDropDown']")
			private static WebElement  loadmasterDropDown;
			
			@FindBy(xpath="//button[@id='btnSelectDependMaster']")
			private static WebElement  selectAllBtn;
			
			@FindBy(xpath="//button[contains(text(),'Reset')]")
			private static WebElement  resetBtn;
			
			@FindBy(xpath="//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
			private static WebElement  okBtn;
			
			@FindBy(xpath="//*[@id='editScreen_CustomizeButtons']/span[1]")
			private static WebElement  deleteTagBtn;
			
			@FindBy(xpath="//span[@id='DocumentAddGroupPopupBtn']")
			private static WebElement  addGroupBtn;
			
				@FindBy(xpath="//input[@id='doc_GroupName']")
				private static WebElement  groupNameTXt;
				
				@FindBy(xpath="//button[contains(text(),'Add')]")
				private static WebElement  addBtn;
				
				@FindBy(xpath="//div[@class='col-xs-12 form-group']//button[@id='btnCancel']")
				private static WebElement  cancelBtn;

			@FindBy(xpath="//div[@id='voucherTabContent']//span[2]")
			private static WebElement  deletegroupBtn;
			
			@FindBy(xpath="//input[@id='doc_title']")
			private static WebElement  titleTxt;
			
			@FindBy(xpath="//input[@id='doc_baseDocument']")
			private static WebElement  baseDocumentTxt;
			
			@FindBy(xpath="//input[@id='txtbox_doc_Accountdepandency']")
			private static WebElement  accountDependencyTxt;
			
				@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentGainAC')]")
				private static WebElement  iExchangeAdjustmentGainACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iExchangeAdjustmentLossAC')]")
				private static WebElement  iExchangeAdjustmentLossACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iPrimaryAccount')]")
				private static WebElement  iPrimaryAccountChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCity')]")
				private static WebElement  iCityChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iDeliveryCity')]")
				private static WebElement  iDeliverycityChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iBankAc')]")
				private static WebElement  iBankACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iPDCDiscountedAC')]")
				private static WebElement  iPDCDiscountedACChkBox;
						
			@FindBy(xpath="//input[@id='txtbox_doc_Productdepandency']")
			private static WebElement  itemDependencyTxt;
			
				@FindBy(xpath="//span[contains(text(),'Outlet__')]")
				private static WebElement  outletChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCostofShortageStockAC')]")
				private static WebElement  iCostofShortageStockACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCostofExcessStockAC')]")
				private static WebElement  iCostofExcessStockACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCostofSaleReturnAC')]")
				private static WebElement  iCostofSaleReturnACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iPurchaseVarianceAC')]")
				private static WebElement  iPurchaseVarianceACChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iDefaultBaseUnit')]")
				private static WebElement  iDefaultBaseUnitChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iDefaultSalesUnit')]")
				private static WebElement  iDefaultSalesUnitChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iDefaultPurchaseUnit')]")
				private static WebElement  iDefaultPurchaseUnitChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCostOfIssueAccount')]")
				private static WebElement  iCostOfIssueAccountChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iStocksAccount')]")
				private static WebElement  iStocksAccountChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iSalesAccount')]")
				private static WebElement  iSalesAccountChkBox;
				
				@FindBy(xpath="//li[12]//div[1]//label[1]//span[1]")
				private static WebElement  otherdetails1Box;
				
				@FindBy(xpath="//li[13]//div[1]//label[1]//span[1]")
				private static WebElement  replenishment1ChkBox;
				
				@FindBy(xpath="//span[contains(text(),'Reorder__')]")
				private static WebElement  reorderChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iCategory')]")
				private static WebElement  iCategoryChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iWIPAccount')]")
				private static WebElement  iWIPAccountChkBox;
				
				@FindBy(xpath="//span[contains(text(),'Classification__')]")
				private static WebElement  classificationChkBox;
				
				@FindBy(xpath="//li[18]//div[1]//label[1]//span[1]")
				private static WebElement  repelenishment2ChkBox;
				
				@FindBy(xpath="//li[19]//div[1]//label[1]//span[1]")
				private static WebElement  otherDetails2ChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iBin')]")
				private static WebElement  iBinChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iAlternateCategory')]")
				private static WebElement  iAlternateCategoryChkBox;
				
				@FindBy(xpath="//span[contains(text(),'iTaxCode')]")
				private static WebElement  iTaxCodeChkBox;
			
			@FindBy(xpath="//select[@id='doc_Accountdepandency_Filter']")
			private static WebElement  accountfilterDropdown;
			
			@FindBy(xpath="//select[@id='doc_Itemdepandency_Filter']")
			private static WebElement  itemfilterDropdown;
			
			
			// Documents Tab Grid Elements
			
		    // first row 
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_1-0']")
			private static WebElement  firstrow;
			
			@FindBy(xpath="//div[contains(text(),'Delete Row')]")
			private static WebElement  doc_deleterowBtn;
			
			@FindBy(xpath="//div[contains(text(),'Insert Row')]")
			private static WebElement  doc_insertRowBtn;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_1-1']")
			private static WebElement  masters1;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_1-2']")
			private static WebElement  position1;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_1-3']")
			private static WebElement  showDependency1;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_1-4']")
			private static WebElement  group1;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_1-5']")
			private static WebElement  filter1;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_1-6']")
			private static WebElement  mandatory1;
			
			
			// Second Row // Delete and Insert row are same
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_2-0']")
			private static WebElement  secondRow;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_2-1']")
			private static WebElement  masters2;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_2-2']")
			private static WebElement  position2;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_2-3']")
			private static WebElement  showDependency2;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_2-4']")
			private static WebElement  group2;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_2-5']")
			private static WebElement  filter2;
			
			@FindBy(xpath="//td[@id='doc_TagsTable_col_2-6']")
			private static WebElement  mandatory2;
			
			// After clicking // Properties Changes which are same for all rows
			
			@FindBy(xpath="//select[@id='doc_TagsTableMasterDropDown']")
			private static WebElement  masterDropDown;
			
			@FindBy(xpath="//select[@id='doc_TagsPositionDropDown']")
			private static WebElement  positionDropdown;
			
			@FindBy(xpath="//input[@id='txtbox_doc_TagsDepedencyDropDown']")
			private static WebElement  showDependencyDropdown;
			
			@FindBy(xpath="//input[@id='doc_TagsGroupTxtbox']")
			private static WebElement  groupTxt;
			
			@FindBy(xpath="//select[@id='docFilter']")
			private static WebElement  filterDropdown;
			
			@FindBy(xpath="//select[@id='doc_MandatoryDropDown']")
			private static WebElement  mandatoryDropDown;
			
		    
	
			
	 //Views Tab
	@FindBy(xpath="//span[@class='icon-views'")
	private static WebElement  viewsTab;
		
	//Export Fields 
	@FindBy(xpath="//span[contains(text(),'Export Fields')]")
	private static WebElement exportFieldsTab;
		
	//Triggers
	@FindBy(xpath="//span[@class='icon-trigger icon-font7']")
	private static WebElement  triggersTab;	
		
	//Document Numbering
	@FindBy(xpath="//span[contains(text(),'Document Numbering')]")
	private static WebElement  documentNumberingTab;
		
	//Hire Purchase	
	@FindBy(xpath="//span[contains(text(),'Hire Purchase')]")
	private static WebElement hirePurchasetab;
		
	//Reports Tab	
	@FindBy(xpath="//span[@class='icon-text70 icon-font7']")
	private static WebElement  reportsTab;	
	
	//Schemes
	@FindBy(xpath="//span[contains(text(),'Schemes')]")
	private static WebElement schemestab;	
	
	
	// Bin Inward Elements
	
		@FindBy (xpath="//input[@id='id_bins_totalquantity']")
		private static WebElement binTotalQty;
		
		@FindBy (xpath="//div[@class='modal-body']//div[4]")
		private static WebElement binBaseUOM;
		
		@FindBy (xpath="//input[@id='srch_bin']")
		private static WebElement binSearchTxt;
		
		@FindBy (xpath="//i[@class='icon-search']")
		private static WebElement binSearchBtn; 
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-0']")
		private static WebElement  binselect1stRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-1']")
		private static WebElement  binselect1stRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-3']")
		private static WebElement  binselect1stRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-5']")
		private static WebElement  binselect1stRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-6']")
		private static WebElement  binselect1stRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-7']")
		private static WebElement  binselect1stRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-8']")
		private static WebElement  binselect1stRow_7thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_1-12']")
		private static WebElement  binselect1stRow_8thColumn;
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-0']")
		private static WebElement  binselect2ndRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-1']")
		private static WebElement  binselect2ndRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-3']")
		private static WebElement  binselect2ndRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-5']")
		private static WebElement  binselect2ndRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-6']")
		private static WebElement  binselect2ndRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-7']")
		private static WebElement  binselect2ndRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-8']")
		private static WebElement  binselect2ndRow_7thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_2-12']")
		private static WebElement  binselect2ndRow_8thColumn;
		
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-0']")
		private static WebElement  binselect3rdRow_1stColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-1']")
		private static WebElement  binselect3rdRow_2ndColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-3']")
		private static WebElement  binselect3rdRow_3rdColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-5']")
		private static WebElement  binselect3rdRow_4thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-6']")
		private static WebElement  binselect3rdRow_5thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-7']")
		private static WebElement  binselect3rdRow_6thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-8']")
		private static WebElement  binselect3rdRow_7thColumn;
		
		@FindBy(xpath="//td[@id='id_transaction_bins_grid_col_3-12']")
		private static WebElement  binselect3rdRow_8thColumn;
		
		
		@FindBy(xpath="//span[@class='icon-sum']")
		private static WebElement  binRowSum;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[2]")
		private static WebElement  binRowSum_2ndColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[4]")
		private static WebElement  binSelect4htRow_3rdColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[6]")
		private static WebElement  binRowSum_4thColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[7]")
		private static WebElement  binRowSum_5thColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[8]")
		private static WebElement  binRowSum_6thColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[9]")
		private static WebElement  binRowSum_7thColumn;
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[12]")
		private static WebElement  binRowSum_8thColumn;
		
		
		@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[13]")
		private static WebElement  binSumInward;
		
		
		
		@FindBy (xpath="//input[@id='id_bins_balance']")
		private static WebElement binBalanceTxt;
		
		@FindBy (xpath="//div[@id='id_btnalternatecategorycheck']//div[@class='toolbar_button_image']")
		private static WebElement binAlternateCategoryCheckBtn;
		
		@FindBy (xpath="//div[@id='id_btnautoallocate']//div[@class='toolbar_button_image']")
		private static WebElement binAutoAllocateBtn;
		
		@FindBy (xpath="//span[@class='icon-pick icon-font4']")
		private static WebElement binPickBtn; 
		
		@FindBy (xpath="//div[@id='id_btnautoallocategroup']//div[@class='toolbar_button_image']")
		private static WebElement binAutoAllocateWithinGroupBtn;
		
		@FindBy (xpath="//div[@id='id_bins_ok']//span[@class='icon-ok icon-font6']")
		private static WebElement binOkBtn;
		
		@FindBy (xpath="//div[@class='col-xs-9 pull-right']//span[@class='icon-close icon-font6']")
		private static WebElement binCancelBtn;

		
		// RMA POpup Window
		@FindBy (xpath="//div[@id='Modal_Header']/div[1]")
		private static WebElement rmaScreenTitle;
		
		@FindBy (xpath="//input[@id='txtSerialNo']")
		private static WebElement rmaSerialNumberTxtField;

		@FindBy (xpath="//input[@id='txtQuantity']")
		private static WebElement rmaQuantityTxtField;
		
		@FindBy (xpath="//div[@id='img_add']/span")
		private static WebElement rmaAddBtn;
			
		@FindBy (xpath="//div[@id='Modal_Search_Body']/div[3]/label")
		private static WebElement rmaNumberofItemsLabel;
		
		@FindBy (xpath="//th[@id='RMA_Table_control_heading_1']/div")
		private static WebElement rmaTableHeadingRMA;
		
		@FindBy (xpath="//th[@id='RMA_Table_control_heading_2']/div")
		private static WebElement rmaTableHeadingDocumentNo;
		
		@FindBy (xpath="//th[@id='RMA_Table_control_heading_3']/div")
		private static WebElement rmaTableHeadingDocumentDate;
		
		@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[1]/label")
		private static WebElement rmaClearBtn;
		
		@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[2]/label")
		private static WebElement rmaOkBtn;
		
		@FindBy (xpath="//div[@id='RMAModel_Bottom']/div[3]/label")
		private static WebElement rmaCancelBtn;
		
		@FindBy (xpath="//div[@id='Modal_Header']/div[2]/span/i")
		private static WebElement rmaCloseBtn;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_1-1']")
		private static WebElement rmaTableRow1Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_2-1']")
		private static WebElement rmaTableRow2Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_3-1']")
		private static WebElement rmaTableRow3Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_4-1']")
		private static WebElement rmaTableRow4Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_5-1']")
		private static WebElement rmaTableRow5Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_6-1']")
		private static WebElement rmaTableRow6Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_7-1']")
		private static WebElement rmaTableRow7Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_8-1']")
		private static WebElement rmaTableRow8Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_9-1']")
		private static WebElement rmaTableRow9Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_10-1']")
		private static WebElement rmaTableRow10Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_11-1']")
		private static WebElement rmaTableRow11Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_12-1']")
		private static WebElement rmaTableRow12Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_13-1']")
		private static WebElement rmaTableRow13Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_14-1']")
		private static WebElement rmaTableRow14Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_15-1']")
		private static WebElement rmaTableRow15Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_16-1']")
		private static WebElement rmaTableRow16Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_17-1']")
		private static WebElement rmaTableRow17Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_18-1']")
		private static WebElement rmaTableRow18Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_19-1']")
		private static WebElement rmaTableRow19Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_20-1']")
		private static WebElement rmaTableRow20Column1;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_1-2']")
		private static WebElement rmaTableRow1Column2;
		
		@FindBy (xpath="//td[@id='RMA_Table_col_1-3']")
		private static WebElement rmaTableRow1Column3;
		
		@FindBy (xpath="//td[@id='id_body_38_input_image']/img")
		private static WebElement rmaExpansionBtn;
		
		
		//----------------------------------------------------------------------------------------------------------    
	    // Edit Screen Tab     
				    
	    @FindBy(xpath="//span[contains(text(),'Edit Screen')]")
	   	private static WebElement  editScreenTab; 
		
		@FindBy(xpath="//i[@class='icon-add icon-font7']")
		private static WebElement editScreenaddBtn;

		@FindBy(xpath="//a[contains(text(),'Field Details')]")
		private static WebElement editScreenFieldDetailsTab;
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Caption']")
		private static WebElement  editScreenCaptionTxt;

		@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_DataType']")
		private static WebElement  editScreenCaptionDataTypeDropdown;
		
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_DefaultValue']")
		private static WebElement editScreenDefaultValueTxt;
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_noofDecimals']")
		private static WebElement editScreenNoOfDecimalsDropdown;
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_toolTip']")
		private static WebElement editScreenToolTipTxt;
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_bannerText']")
		private static WebElement editScreenBannerTextTxt;
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_MinValue']")
		private static WebElement editScreenMinimunValueTxt;
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_MaxValue']")
		private static WebElement editScreenMaximunValueTxt;
	   
		@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_behaviour']")
		private static WebElement editScreenAddFieldsBehaviourDropdown;
		
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Formula_textbox']")
		private static WebElement  editScreenAddBehaviourformulaTxt;
		
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Formula_Ok']")
		private static WebElement  editScreenAddBehaviourFormulaokBtn;
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_textbox']")
		private static WebElement editScreenPreloadTxt;
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_textbox']")
		private static WebElement editScreenRestrictformulaTxt;
	   
		@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_RoundOff']")
		private static WebElement editScreenRoundOffsDropdown;
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RoundOffTo']")
		private static WebElement editScreenRoundOffToTxt;
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RestrictMsg']")
		private static WebElement editScreenRestrictMessageTxt;
	   
		@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_AddToNet']")
		private static WebElement editScreenAddToNetDropdown;
	   
		@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_AddToStock']")
		private static WebElement editScreenAddToStockDropDown;

		@FindBy(xpath="//select[@id='editScreen_FieldsCustomization_Position']")
		private static WebElement editScreenpositionDropdown;  
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_Columnwidth']")
		private static WebElement editScreenColumnWidthTxt;  
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkValinBaseCurency']")
		private static WebElement editScreenValueInBaseCurrencyChkBox;  
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkValinBaseCurency']")
		private static WebElement editScreenHideFromSummaryChkBox;  
	   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkPostToAcc']")
		private static WebElement editScreenPostToAccountChkBox;  
	 
		@FindBy(xpath="//input[@id='acc1-1']")
		private static WebElement editScreenAccount1Radio;  
				   
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc1']")
		private static WebElement editScreenAccount1Txt;  
	   
		@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc1_input_image']/span")
		private static WebElement editScreenAccount1ExpandBtn;  
	   
		@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc1_input_settings']/span")
		private static WebElement editScreenAccount1SettingsBtn;  
				   
		    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_container']")
			private static WebElement editScreenAccount1Container;  
		    
		    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_footer']//input[1]")
			private static WebElement editScreenAccount1StandardFiledsBtn;  
							    
			    @FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_list']")
				private static WebElement editScreenAccount1StandardFiledsDropdown;  
			    
			    @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_header']")
				private static WebElement editScreenAccount1StandardFiledsHeaderTxt;  
			    
			    @FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_alignment']")
				private static WebElement editScreenAccount1StandardFiledsAllignmentDropdown; 
			    
			    @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc1_customize_popup_standardfields_width']")
				private static WebElement editScreenAccount1StandardFiledsWidthTxt;  
			    
			    @FindBy(xpath="//section[@id='page_Content']//input[3]")
				private static WebElement editScreenAccount1StandardFiledsokBtn;  
			    
			    @FindBy(xpath="//section[@id='page_Content']//input[4]")
				private static WebElement editScreenAccount1StandardFiledscancelBtn;  
							    
		    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc1_search_container']//input[2]")
			private static WebElement editScreenAccount1deleteColumnBtn;
		    
		    @FindBy(xpath="//section[@id='page_Content']//input[3]")
		   	private static WebElement editScreenAccount1okBtn;  
		       
		    @FindBy(xpath="//section[@id='page_Content']//input[4]")
		   	private static WebElement editScreenAccount1cancelBtn;
				
		@FindBy(xpath="//input[@id='acc2-2']")
		private static WebElement editScreenAccount2Radio;  
		    
		@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc2']")
		private static WebElement editScreenAccount2Txt;  
		    
		@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc2_input_image']/span")
		private static WebElement editScreenAccount2ExpandBtn;
	  
	    @FindBy(xpath="//*[@id='editScreen_FieldsCustomization_defaultAcc2_input_settings']/span")
	  	private static WebElement editScreenAccount2SettingsBtn;  
				      
		    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_container']")
			private static WebElement editScreenAccount2Container;  
		    
		    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_footer']//input[1]")
			private static WebElement editScreenAccount2StandardFiledsBtn;  
				  			    
			    @FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_list']")
				private static WebElement editScreenAccount2StandardFiledsDropdown;  
			    
			    @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_header']")
				private static WebElement editScreenAccount2StandardFiledsHeaderTxt;  
			    
			    @FindBy(xpath="//select[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_alignment']")
				private static WebElement editScreenAccount2StandardFiledsAllignmentDropdown; 
			    
			    @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_defaultAcc2_customize_popup_standardfields_width']")
				private static WebElement editScreenAccount2StandardFiledsWidthTxt;  
			    
			    @FindBy(xpath="//section[@id='page_Content']//input[3]")
				private static WebElement editScreenAccount2StandardFiledsokBtn;  
			    
			    @FindBy(xpath="//section[@id='page_Content']//input[4]")
				private static WebElement editScreenAccount2StandardFiledscancelBtn;  
				  			    
		    @FindBy(xpath="//div[@id='editScreen_FieldsCustomization_defaultAcc2_search_container']//input[2]")
			private static WebElement editScreenAccount2deleteColumnBtn;
		    
		    @FindBy(xpath="//section[@id='page_Content']//input[3]")
		   	private static WebElement editScreenAccount2okBtn;  
		       
		       @FindBy(xpath="//section[@id='page_Content']//input[4]")
		   	private static WebElement editScreenAccount2cancelBtn;
	   
	   @FindBy(xpath="//input[@id='acc1-3']")
	   private static WebElement editScreenAccount1VariableRadio; 
	  
	   @FindBy(xpath="//input[@id='Account_1Var']")
	   private static WebElement editScreenAccount1VariableTxt;
	   
	   @FindBy(xpath="//input[@id='acc2-4']")
	   private static WebElement editScreenAccount2VariableRadio; 
	  
	   @FindBy(xpath="//input[@id='Account_2Var']")
	   private static WebElement editScreenAccount2VariableTxt;
	   
	   @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_RegularExpr']")
	   private static WebElement editScreenRegularExpTxt; 
	   
	   @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_ErrorMsg']")
	   private static WebElement editScreenerrorMessageTxt; 

	 // properties  
	   
	  @FindBy(xpath="//a[contains(text(),'Properties')]")
	  private static WebElement editScreenPropertiesTab;  
	     
	  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkAuditTrail']")
	  private static WebElement editScreenauditTrailChkBox;  
	     
	  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkCantExprt']")
	  private static WebElement editScreencantExportChkBox;  
	  
	  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkCantImprt']")
	  private static WebElement editScreencantImportChkbox; 
	     
	  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkHidden']")
	  private static WebElement editScreenhiddenChkbox;  
	  
	  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkMandatory']")
	  private static WebElement editScreenmandatorychkBox; 
	     
	  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkNotAvailForReports']")
	  private static WebElement editScreennotAvailableForReportsChkBox;  
	     
	  @FindBy(xpath="//input[@id='editScreen_FieldsCustomization_chkReadOnly']")
	  private static WebElement editScreenreadOnlyChkBox;  
	 
	     
	  @FindBy(xpath="//span[contains(text(),'Apply')]")
	  private static WebElement editScreenApplyBtn;  
	     
	  @FindBy(xpath="//span[@id='editScreen_FieldsCustomization_Close']")
	  private static WebElement editScreencloseBtn;  
	  

	 
	  @FindBy(xpath="//a[@href='#editScreen_FieldsCustomization_ExternalModules']")
	  private static WebElement editScreenExternalModulesTab; 
				
		// External Module Tab is named As EFES And ELV For Each Screen (ReceiptsEFES,ReceiptsELV )
	    // External Functions(External Fields) Changes From Screen to Screen
	
		// Formatting Tab
				  
	    @FindBy(xpath="//*[@id='editScreen_FieldsCustomization_tabs']/li[3]/a")
	    private static WebElement editScreenformattingTab;

		@FindBy(xpath="//*[@id='fontFamily_editScreen_FieldsCustomization_FontCtrl']")
	    private static WebElement editScreenFontFamilyDropdown;
		
	    @FindBy(xpath="//*[@id='fontStyle_editScreen_FieldsCustomization_FontCtrl']")
	    private static WebElement editScreenFontStyleDropdown;

	    @FindBy(xpath="//*[@id='fontWeight_editScreen_FieldsCustomization_FontCtrl']")
	    private static WebElement editScreenFontWeightDropdown;

		@FindBy(xpath="//*[@id='fontSizes_editScreen_FieldsCustomization_FontCtrl']")
		private static WebElement editScreenFontSizeDropdown;
		
		@FindBy(xpath="//*[@id='fontForeColor_editScreen_FieldsCustomization_FontCtrl']")
		private static WebElement editScreenForeColourDropdown;
		
		@FindBy(xpath="//*[@id='fontBackColor_editScreen_FieldsCustomization_FontCtrl']")
		private static WebElement editScreenBackColourDropdown;
		
		@FindBy(xpath="//*[@id='chkBaseline_editScreen_FieldsCustomization_FontCtrl']")
		private static WebElement editScreenBaseLineCheckbox;
		
		@FindBy(xpath="//*[@id='chkOverLine_editScreen_FieldsCustomization_FontCtrl']")
		private static WebElement editScreenOverLineCheckbox;
		
		@FindBy(xpath="//*[@id='chkStrikeThrough_editScreen_FieldsCustomization_FontCtrl']")
		private static WebElement EditScreenStrikeThroughCheckbox;
		
		@FindBy(xpath="//*[@id='chkUnderline_editScreen_FieldsCustomization_FontCtrl']")
		private static WebElement editScreenUnderlineCheckbox;
		
		@FindBy(xpath="//*[@id='previewfont_editScreen_FieldsCustomization_FontCtrl']")
		private static WebElement editScreenFontPreviewTxt;
		
		@FindBy(xpath="//*[@id='editScreen_FieldsCustomization_Formatting_chkenableFont']")
		private static WebElement editScreenenableFontChkbox;
				
		  @FindBy(xpath="//i[@class='icon-copyfields icon-font7']")
		  private static WebElement editScreenLoadFieldsBtn;  
		     
		  @FindBy(xpath="//select[@id='editScreen_voucherDropDown']")
		  private static WebElement editScreenLoadFieldsDropdown;  
		     
		  @FindBy(xpath="//*[@id='editScreen_copyFieldsDiv']/div[3]/button[1]")
		  private static WebElement editScreenselectAllBtn;  
		  
		  @FindBy(xpath="//div[@id='editScreen_copyFieldsDiv']//button[@class='Fbutton pull-right'][contains(text(),'Ok')]")
		  private static WebElement editScreenokBtn;  
		     
		  @FindBy(xpath="//input[@id='searchlayout2']")
		  private static WebElement editScreenSearchTxt;  
		     
		  @FindBy(xpath="//button[@id='btnEditScreenPrev']")
		  private static WebElement editScreenPreviousBtn;  
		     
		  @FindBy(xpath="//button[@id='btnEditScreenNext']")
		  private static WebElement editScreenNextBtn;  
		  
		  @FindBy(xpath="//*[@id='editScreen_tabContent']/label")
			private static WebElement editScreenRatePreloadLabel;
		  
		  @FindBy(xpath="//select[@id='cmbBehaviour']")
		  private static WebElement editScreenBehaviourDropdown;
		  
		  @FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_textbox']")
		  private static WebElement editScreenQuantityPreloadedTxt;
		  	  
		  @FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_formulaText']")
		  private static WebElement  formulaTxt;
			
		  @FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_expandedFormula']")
		  private static WebElement  expandeFormula;
					
	     // Grid Elements 
		@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_1-2']//span[@class='icon-collepse icon-font8']")
		private static WebElement  editScreenTransactionExpandBtn;
				
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_2-2']")
			private static WebElement  editScreenQuantity;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_2-3']")
			private static WebElement  editScreenqty;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_3-2']")
			private static WebElement  editScreenRate;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_3-3']")
			private static WebElement  editScreenrt;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_4-2']")
			private static WebElement  editScreenAlternateQty;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_4-3']")
			private static WebElement  editScreenqtya;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_5-2']")
			private static WebElement  editScreengrossAmount;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_5-3']")
			private static WebElement  editScreengr;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_6-2']")
			private static WebElement  editScreenStockValue;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_6-3']")
			private static WebElement  editScreenstkv;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_7-2']")
			private static WebElement  editScreenAccount;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_7-3']")
			private static WebElement  EditScreenacc;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_8-2']")
			private static WebElement  editScreenAccount2;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_8-3']")
			private static WebElement  editScreenacc2;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_9-2']")
			private static WebElement  editScreenExchangeRate;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_9-3']")
			private static WebElement  editScreenexrt;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_10-2']")
			private static WebElement  editScreenqtyinBaseUnit;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_10-3']")
			private static WebElement  editScreenqtyb;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_11-2']")
			private static WebElement  editScreenCurrency;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_11-3']")
			private static WebElement  editScreencrn;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_12-2']")
			private static WebElement  editScreenValueOfThetagMasterIDofTheTag;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_12-3']")
			private static WebElement  editScreentgval;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_13-2']")
			private static WebElement  editScreenNetAmount;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_13-3']")
			private static WebElement  EditScreennet;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_14-2']")
			private static WebElement  editScreenNetAmountInOriginalCurrency;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_14-3']")
			private static WebElement  editScreenneto;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_15-2']")
			private static WebElement  editScreenTotalQuantity;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_15-3']")
			private static WebElement  editScreentqty;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_16-2']")
			private static WebElement  editScreenTotalGross;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_16-3']")
			private static WebElement  editScreentgr;
							
		@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_17-2']//span[@class='icon-expand icon-font8']")
		private static WebElement  screenFiledExpandBtn;
				
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_18-2']")
			private static WebElement  mrnQtyInput;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_18-3']")
			private static WebElement  sb1;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_19-2']")
			private static WebElement  mrnQtyCalculatedValue;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_19-3']")
			private static WebElement  sbo1;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_20-2']")
			private static WebElement  qtyBalancedInput;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_20-3']")
			private static WebElement  sb2;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_21-2']")
			private static WebElement  qtyCalculatedValue;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_21-3']")
			private static WebElement  sbO2;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_22-2']")
			private static WebElement  averagerateInput;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_22-3']")
			private static WebElement  sb3;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_23-2']")
			private static WebElement  avreageRateCalculatedValue;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_23-3']")
			private static WebElement  sbO3;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_24-2']")
			private static WebElement  addValueInput;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_24-3']")
			private static WebElement  sb4;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_25-2']")
			private static WebElement  addValueInputCalculatedValue;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_25-3']")
			private static WebElement  sbO4;
				
		@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_26-2']//span[@class='icon-collepse icon-font8']")
		private static WebElement  layoutFieldExpandBtn;
		
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_27-2']")
			private static WebElement  appropriateBasedOnInput;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_27-3']")
			private static WebElement  lh0;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_28-2']")
			private static WebElement  additionalValueInput;
			
			@FindBy(xpath="//td[@id='formulaGrideditScreen_qtyPreLoaded_col_28-3']")
			private static WebElement  lh1;
							
	    //Grid Completed
		
		@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_availableVariables']")
		private static WebElement  editScreenqtyFormulaSearchTxt;
		
		@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_PlusOpt']")
		private static WebElement  editScreenqtyPlusBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'-')]")
		private static WebElement  editScreenqtyMinusBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded']//button[3]")
		private static WebElement  editScreenqtyDivideBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'*')]")
		private static WebElement  editScreenqtyMultiplyBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded']//button[5]")
		private static WebElement  editScreenqtyBrackets1Btn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded']//button[6]")
		private static WebElement  editScreenqtyBrackets2Btn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'~')]")
		private static WebElement  editScreenqtyTildeBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'&')]")
		private static WebElement  editScreenqtyAndBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'%')]")
		private static WebElement  editScreenqtyPercentBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//div[@id='operationButtons']//button[@class='btn btn-link'][contains(text(),']')]")
		private static WebElement  editScreenqtySquarebracketBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'|')]")
		private static WebElement  editScreenqtyVerticalBarBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'\')]")
		private static WebElement  editScreenqtyBackSlashBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'<')]")
		private static WebElement  editScreenqtyLessThanbtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'>')]")
		private static WebElement  editScreenqtyGreaterThanBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'=')]")
		private static WebElement  editScreenqtyExclamationBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'=')]")
		private static WebElement  editScreenqtyEqualBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'?:')]")
		private static WebElement  editScreenqtyQuestionBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'^')]")
		private static WebElement  editScreenqtyCaretBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'DateDiff()')]")
		private static WebElement  editScreenqtyDateDiffBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Cond()')]")
		private static WebElement  editScreenqtyCondBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Min()')]")
		private static WebElement  editScreenqtyMinBtn;
		
		@FindBy(xpath="//div[@id='editScreen_qtyPreLoaded_formulaDiv']//button[@class='btn btn-link'][contains(text(),'Max()')]")
		private static WebElement  editScreenqtyMaxBtn;
		
		@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Ok']")
		private static WebElement  editScreenqtyConditionokBtn;
		
		@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Cancel']")
		private static WebElement  editScreenqtyConditioncancelBtn;
				
				
		@FindBy(xpath="//*[@id='editScreen_qtyFormula_textbox']")
		private static WebElement  editScreenformulaTxt;
		
		
		// CustomizeGrid
		
		@FindBy(xpath="//i[@class='icon-custamize icon-font7']")
		private static WebElement editScreencustomizeGridBtn;  
		  
		@FindBy(xpath="//span[contains(text(),'Apportion')")
		private static WebElement editScreenApportionBtn;
		     
		@FindBy(xpath="//span[contains(text(),'Audit Trial')]")
		private static WebElement editScreenAuditTrialBtn;  
		    
		@FindBy(xpath="//span[contains(text(),'Back color')]")
		private static WebElement editScreenbackColorBtn;  
		     
		@FindBy(xpath="//span[contains(text(),'Banner text')]")
		private static WebElement editScreenbannerTextBtn;  
		 
		  @FindBy(xpath="//span[contains(text(),'Cannot be exported')]")
		  private static WebElement editScreencannotBeExportedBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Cannot be imported')]")
		  private static WebElement editScreencannotBeImportedBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Column Span')]")
		  private static WebElement editScreencolumnSpanBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Copy from Parent')]")
		  private static WebElement editScreencopyFromParentBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'DataType')]")
		  private static WebElement editScreendataTypeBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Default Value')]")
		  private static WebElement editScreenDefaultValueBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Error message')]")
		  private static WebElement editScreenerrorMessageBtn;  
		 
		  @FindBy(xpath="//span[contains(text(),'External module attached')]")
		  private static WebElement editScreenExternalModuleAttachedBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Field Order')]")
		  private static WebElement editScreenFilterOrderBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Font')]")
		  private static WebElement editScreenFontBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Group Name')]")
		  private static WebElement editScreengroupNameBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Hide left panel')]")
		  private static WebElement editScreenHideLeftPanelBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Information Field')]")
		  private static WebElement editScreenInformationFieldBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Mandatory')]")
		  private static WebElement editScreenMandatoryBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Mass Update')]")
		  private static WebElement editScreenMassupdateBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Maximum Value')]")
		  private static WebElement editScreenMaximumValueBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Merge Field')]")
		  private static WebElement editScreenMergerFieldBtn;  
		  
		  @FindBy(xpath="//span[contains(text(),'Minimum Value')]")
		  private static WebElement editScreenMinimumValueBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'No Of Decimals')]")
		  private static WebElement editScreenNoOfDecimalsBtn;  
		  
		  @FindBy(xpath="//span[contains(text(),'Not available for reports')]")
		  private static WebElement editScreenNotAvailableForReportsBtn; 
		     
		  @FindBy(xpath="//span[contains(text(),'Read Only')]")
		  private static WebElement editScreenReadOnlyBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Regular expression')]")
		  private static WebElement editScreenRegularExpressionBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Restrict formula')]")
		  private static WebElement editScreenRestrictFormulaBtn;  
		  
		  @FindBy(xpath="//span[contains(text(),'Restrict Message')]")
		  private static WebElement editScreenRestrictMessageBtn;  
		  
		  @FindBy(xpath="//span[contains(text(),'Round Offs')]")
		  private static WebElement editScreenRoundsOffsBtn;  
		
		  @FindBy(xpath="//span[contains(text(),'Row Span')]")
		  private static WebElement editScreenRowSpanBtn; 
		     
		  @FindBy(xpath="//span[contains(text(),'Rule Attached')]")
		  private static WebElement editScreenRuleAttachedBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Tooltip')]")
		  private static WebElement editScreenToolTipBtn;  
		     
		  @FindBy(xpath="//span[contains(text(),'Variable name')]")
		  private static WebElement editScreenVariableNameBtn;  
		 
		  
		  
		  
		
		 // Body Tab 
		  
		  @FindBy(xpath="//a[contains(text(),'Body')]")
		  private static WebElement  editScreenBodyTab; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_1 _1']//span[@id='editIcon']")
		  private static WebElement  editScreenBody1stRowEditBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_1 _1']//span[@id='deleteIcon']")
		  private static WebElement  editScreenBody1stRowDeleteBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_2 _1']//span[@id='editIcon']")
		  private static WebElement  editScreenBody2ndRowEditBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_2 _1']//span[@id='deleteIcon']")
		  private static WebElement  editScreenBody2ndRowDeleteBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_3 _1']//span[@id='editIcon']")
		  private static WebElement  editScreenBody3rdRowEditBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_3 _1']//span[@id='deleteIcon']")
		  private static WebElement  editScreenBody3rdRowDeleteBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_4 _1']//span[@id='editIcon']")
		  private static WebElement  editScreenBody4thRowEditBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_4 _1']//span[@id='deleteIcon']")
		  private static WebElement  editScreenBody4thRowDeleteBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_5 _1']//span[@id='editIcon']")
		  private static WebElement  editScreenBody5thRowEditBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_5 _1']//span[@id='deleteIcon']")
		  private static WebElement  editScreenBody5thRowDeleteBtn;
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_6 _1']//span[@id='editIcon']")
		  private static WebElement  editScreenBody6thRowEditBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_bodyrow_6 _1']//span[@id='deleteIcon']")
		  private static WebElement  editScreenBody6thRowDeleteBtn;
		  
		  @FindBy(xpath="//div[@id='editScreen_body']//button[@class='icon-up-arrow Fbutton']")
		  private static WebElement  editScreenBodyUpArrowBtn; 
		
		  @FindBy(xpath="//div[@id='editScreen_body']//button[@class='icon-down-arrow Fbutton']")
		  private static WebElement  editScreenBodyDownArrowBtn;
						
		  // Footer Tab
		  
		  @FindBy(xpath="//a[contains(text(),'Footer')]")
		  private static WebElement  editScreenFooterTab;  
		  
		  @FindBy(xpath="//td[@id='editScreen_footerrow_1 _1']//span[@id='editIcon']")
		  private static WebElement  editScreenFooter1stRowEditBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_footerrow_1 _1']//span[@id='deleteIcon']")
		  private static WebElement  editScreenFooter1stRowDeleteBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_footerrow_2 _1']//span[@id='editIcon']")
		  private static WebElement  editScreenFooter2ndRowEditBtn; 
		  
		  @FindBy(xpath="//td[@id='editScreen_footerrow_2 _1']//span[@id='deleteIcon']")
		  private static WebElement  editScreenFooter2ndRowDeleteBtn; 
		  
		  @FindBy(xpath="//div[@id='editScreen_footer']//button[@class='icon-up-arrow Fbutton']")
		  private static WebElement  editScreenFooterUpArrowBtn; 
		
		  @FindBy(xpath="//div[@id='editScreen_footer']//button[@class='icon-down-arrow Fbutton']")
		  private static WebElement  editScreenFooterDownArrowBtn; 
		  
		  	@FindBy(xpath="//label[contains(text(),'Quantity preloaded')]")
			private static WebElement qtyPreloadedLabel;
			
			@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_textbox']")
			private static WebElement qtyPreloadedTxt;
			
			@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_formulaText']")
			private static WebElement qtyPreloadedformulaTxt;
			
			@FindBy(xpath="//input[@id='editScreen_qtyPreLoaded_availableVariables']")
			private static WebElement qtyPreloadedFormulaSearchTxt;
			
			@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Ok']")
			private static WebElement qtyPreloadedFormulaokBtn;
			
			@FindBy(xpath="//button[@id='editScreen_qtyPreLoaded_Cancel']")
			private static WebElement qtyPreloadedFormulacancelBtn;


			@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[1]/label/span")
			private static WebElement editScreenLoadFields1stChkBox;
			
			@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[2]/label/span")
			private static WebElement editScreenLoadFields2ndChkBox;
			
			@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[3]/label/span")
			private static WebElement editScreenLoadFields3rdChkBox;
			
			@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[4]/label/span")
			private static WebElement editScreenLoadFields4thChkBox;
			
			@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[5]/label/span")
			private static WebElement editScreenLoadFields5hChkBox;
			
			@FindBy(xpath="//*[@id='editScreen_copyFieldsOptFields']/div[6]/label/span")
			private static WebElement editScreenLoadFields6thChkBox;
			
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_formulaText']")
			private static WebElement  preloadformulaTxt;
			
			@FindBy(xpath="//input[@id='editScreen_FieldsCustomization_PreLoad_availableVariables']")
			private static WebElement  preloadFormulaSearchTxt;
			
			@FindBy(xpath="//button[@id='editScreen_FieldsCustomization_PreLoad_Ok']")
			private static WebElement  preloadFormulaokBtn;
				
			@FindBy(xpath="//button[@id='editScreen_FieldsCustomization_PreLoad_Cancel']")
			private static WebElement  preloadFormulacancelBtn;
			
			
			@FindBy(xpath="//td[@id='editScreen_footerrow_1 _3']")
			private static WebElement  editScreenFooter1stRowCaption;
			
			@FindBy(xpath="//td[@id='editScreen_footerrow_1 _3']")
			private static WebElement  editScreenFooter2ndRowCaption;
			
			@FindBy(xpath="//td[@id='editScreen_bodyrow_1 _3']")
			private static WebElement  editScreenbody1stRowCaption;
			
			@FindBy(xpath="//td[@id='editScreen_bodyrow_2 _3']")
			private static WebElement  editScreenbody2ndRowCaption;
			
			@FindBy(xpath="//td[@id='editScreen_bodyrow_3 _3']")
			private static WebElement  editScreenbody3rdRowCaption;
			
			@FindBy(xpath="//td[@id='editScreen_bodyrow_4 _3']")
			private static WebElement  editScreenbody4thRowCaption;
			
			@FindBy(xpath="//td[@id='editScreen_bodyrow_5 _3']")
			private static WebElement  editScreenbody5thRowCaption;
			
			
			
			// Add To Stock Status
			
			@FindBy(xpath="//td[@id='editScreen_bodyrow_1 _14']")
			private static WebElement  editScreenbody1stRowAddtoStock;
			
			@FindBy(xpath="//td[@id='editScreen_bodyrow_2 _14']")
			private static WebElement  editScreenbody2ndRowAddtoStock;
			
			@FindBy(xpath="//td[@id='editScreen_bodyrow_3 _14']")
			private static WebElement  editScreenbody3rdRowAddtoStock;
			
			@FindBy(xpath="//td[@id='editScreen_bodyrow_4 _14']")
			private static WebElement  editScreenbody4thRowAddtoStock;
			
			@FindBy(xpath="//td[@id='editScreen_bodyrow_5 _14']")
			private static WebElement  editScreenbody5thRowAddtoStock;			
			
		// Suspend Status Of Entry Page
		@FindBy(xpath="//tr[1]//td[11]")
		private static WebElement suspendStatusRow1;
	
	//User Name Display

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
    
    @FindBy(xpath="//input[@id='donotshow']")
	private static WebElement doNotShowCheckbox;
    
    @FindBy(xpath="//span[@class='pull-right']")
	private static WebElement closeBtnInDemoPopupScreen;
    
    
    // Inentory Menu 
    
    @FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
    private static WebElement  invTransactionsMenu; 
    
    @FindBy(xpath="//a[@id='139']//span[contains(text(),'Purchases')]")
    private static WebElement  invTransPurchasesMenu; 
    
    @FindBy(xpath="//a[@id='140']//span[contains(text(),'Sales')]")
    private static WebElement  invTransSalesMenu; 
    
    @FindBy(xpath="//a[@id='2033']//span[contains(text(),'Stocks')]")
    private static WebElement  invTransStocksMenu; 
    
    @FindBy(xpath="//a[@id='200']//span[contains(text(),'Reports')]")
	private static WebElement  inventoryReportsMenu; 
    
	@FindBy(xpath="//span[contains(text(),'Order Management')]")
	private static WebElement  orderManagementMenu; 
	
	
	@FindBy(xpath="//div[@id='dvHomeTransClose']//span[@class='icon-close icon-font6']")  
	private static WebElement  voucherhomeCloseBtn;
	
	
	
	
	// Home Menu
	@FindBy(xpath = "//*[@id='1']/div/span")
	public static WebElement homeMenu;

	//Financial Menu
	@FindBy (xpath="//span[@class='icon-financial icon-font1']")
	private static WebElement financialMenu;
	
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
	
	
	// Login Page
	@FindBy(xpath = "//*[@id='txtUsername']")
	private static WebElement username;
	

		
	private static String xlfile;
	private static String resPass="Pass";
	private static String resFail="Fail";
	private static ExcelReader excelReader;
	
	private static String xlSheetName = "SmokeVouchers";
	
	private static boolean Status;

	private String expOsVoucherGrossR4;
	
	

  public boolean checkLoadingMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
		String actVoucherLoadingMessage=errorMessage.getText();
		String expVoucherLoadingMessage="Voucher loaded successfully";
		
		System.out.println("VoucherLoadingMessage  : " + actVoucherLoadingMessage + " Value Expected : " + expVoucherLoadingMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		errorMessageCloseBtn.click();

		if(actVoucherLoadingMessage.startsWith(expVoucherLoadingMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	catch(Exception e)
	{
		System.err.println("UNABLE TO COMPARE");
		return false;
	}
  }
	
	
	
	
  public boolean checkVoucherSavingMessage(String docno) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
		String actErrorMessage=errorMessage.getText();
		String expErrorMessage="Voucher saved successfully";
		String expErrorMessage1=": "+docno;
		
		System.out.println("SavingMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage+" "+expErrorMessage1);
		
		if(actErrorMessage.startsWith(expErrorMessage) && actErrorMessage.endsWith(expErrorMessage1))
		{
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();
				
				return  true;
			}
			catch(Exception ee)
			{
				return true;
			}	
		}
		else
		{
			return false;
		}	
	}
	catch(Exception e)
	{
		System.err.println("UNABLE TO COMPARE");
		return false;
	}
  }
	
	
	
  public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
		

  public static void checkUserFriendlyMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
		String actErrorMessage=errorMessage.getText();
		
		System.out.println("Open Page then Message Display  :  " + actErrorMessage);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		errorMessageCloseBtn.click();
		
		/*try
		{	
			System.out.println("In Try Block Validation Message  :  " + actErrorMessage);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();
		}
		catch(Exception ee)
		{
			System.out.println("In Catch Block Validation Message  :  " + actErrorMessage);	
		}*/
	}
	catch(Exception e)
	{
		System.err.println("Error Message NOT Found or NOT Clickable");
		System.err.println(e.getMessage());
		
		String Exception=e.getMessage();
	}
  }
	
	
	
	
  public boolean checkEntryPageDeleteMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
	String actErrorMessage=errorMessage.getText();
	String expErrorMessage="Voucher deleted Successfully";
	
	System.out.println("DeletingMessage  :  " + actErrorMessage + " Value Expected : " + expErrorMessage);
	
	if(actErrorMessage.equalsIgnoreCase(expErrorMessage))
	{
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();
			
			return  true;
		}
		catch(Exception ee)
		{
			return true;
		}
	}
	else
	{
		return false;
	}
  }

	
	
	
		 
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
	
		 Thread.sleep(4000);
	}
			 


	@FindBy(xpath="//button[contains(text(),'Ok')]")
	private static WebElement loginRefreshOkBtn;
	
	public static void checkRefreshPopOnlogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		try 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginRefreshOkBtn));
			loginRefreshOkBtn.click();
		} 
		catch (Exception e)
		{
			System.err.println("Exception : "+e.getMessage());
			System.err.println("NO ALERT POP UP DISPLAYED");
		}
		
		Thread.sleep(4000);
	}

	
	@FindBy(xpath = "//ul[@id='navigation_menu']/li/a/div/div")
	private static List<WebElement> menusList;
	
	@FindBy(xpath = "//ul[@id='navigation_menu']/li[3]/ul/li/a/span")
	private static List<WebElement> inventoryMenusList;
	
	@FindBy(xpath = "//ul[@id='navigation_menu']/li[3]/ul/li[1]/ul/li/a/span")
	private static List<WebElement> inventoryTransactionsMenusList;
	
	@FindBy(xpath = "//ul[@id='navigation_menu']/li[3]/ul/li[1]/ul/li[3]/ul/li/a/span")
	private static List<WebElement> inventoryTransactionsStocksMenusList;
	
	@FindBy(xpath = "//*[@id='dv_TranHomeHeading']/nav/div[2]/div/div/div[2]")
	private static List<WebElement> openingStocksNewToolBarButtons;
	

	
	
  public boolean checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
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
		 String exception =e.getMessage().substring(0, 50);
        excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
        return false;
    }
 }
	

 public static boolean checkInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
		

    	int count										  = inventoryMenusList.size();
    	
    	ArrayList<String> actList  = new ArrayList<String>();
    	
    	for (int i = 0; i < count; i++) 
    	{
    		String data		                              = inventoryMenusList.get(i).getText();
    		actList.add(data);
		}
    	
    	String actInventoryMenusList					  = actList.toString();
    	String expInventoryMenusList					  = excelReader.getCellData(xlSheetName, 13, 7);
    	
    	System.out.println("Inventories Menu Names Display Text Actual Values      :  " + actInventoryMenusList);
    	System.out.println("Inventories Menu Names Display Text Expected Values    :  " + expInventoryMenusList);
    	
    	excelReader.setCellData(xlfile, xlSheetName, 13, 8, actInventoryMenusList);
    	
		if( actInventoryMenusList.equalsIgnoreCase(expInventoryMenusList))
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
		String exception =e.getMessage().substring(0, 50);
        excelReader.setExceptionInExcel(xlfile, xlSheetName, 12, 10, e.getMessage());
        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
        return false;
    }
 }
	
	

 public static boolean checkTransactionMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 {
  excelReader=new ExcelReader(POJOUtility.getExcelPath());
  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
  try
  {	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	invTransactionsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAllocation));

	int count											   =inventoryTransactionsMenusList.size();
	
	ArrayList<String> actmenus = new ArrayList<String>();
	
	for (int i = 0; i < count; i++) 
	{
		String data=inventoryTransactionsMenusList.get(i).getText();
		
		actmenus.add(data);
	}
	    
	String actInventoryTransactionsMenus=actmenus.toString();
	String expInventoryTransactionsMenus=excelReader.getCellData(xlSheetName, 15, 7);
		 
	System.out.println("actInventoryTransactionsMenus   : " + actInventoryTransactionsMenus);
	System.out.println("expInventoryTransactionsMenus   : " + expInventoryTransactionsMenus);
	
	excelReader.setCellData(xlfile, xlSheetName, 15, 8, actInventoryTransactionsMenus);
	
	if(actInventoryTransactionsMenus.equalsIgnoreCase(expInventoryTransactionsMenus))
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
	  String exception =e.getMessage().substring(0, 50);
      excelReader.setExceptionInExcel(xlfile, xlSheetName, 14, 10, e.getMessage());
      System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
      return false;
  }
 }
	

	
	
	
 public static boolean checkStocksMenuInTransactionMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 {
   excelReader=new ExcelReader(POJOUtility.getExcelPath());
   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
   try
   {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
		invTransStocksMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialRequisitionVoucher));
		
		int count									    = inventoryTransactionsStocksMenusList.size();
		
		ArrayList<String> actmenus = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data                                = inventoryTransactionsStocksMenusList.get(i).getText();
			actmenus.add(data);
		}
		    
		String actinventoryTransactionsStocksMenusList = actmenus.toString();
		String expinventoryTransactionsStocksMenusList = excelReader.getCellData(xlSheetName, 17, 7);
		
		System.out.println("actinventoryTransactionsStocksMenusList   : " + actinventoryTransactionsStocksMenusList);
		System.out.println("expinventoryTransactionsStocksMenusList   : " + expinventoryTransactionsStocksMenusList);
		
		excelReader.setCellData(xlfile, xlSheetName, 17, 8, actinventoryTransactionsStocksMenusList);	
		
		if( actinventoryTransactionsStocksMenusList.equalsIgnoreCase(expinventoryTransactionsStocksMenusList))
		
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
			
	

	
  public boolean checkOpeningStocksNewVoucherDisplayHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksNewVoucher));
		openingStocksNewVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	
		
		int count				                 = openingStocksNewToolBarButtons.size();
		
		ArrayList<String> actbuttons             = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data                          = openingStocksNewToolBarButtons.get(i).getText();
			actbuttons.add(data);
		}
		    
		String actopeningStocksNewToolBarButtons = actbuttons.toString();
		String expopeningStocksNewToolBarButtons = excelReader.getCellData(xlSheetName, 19, 7);
	
		System.out.println("actopeningStocksNewToolBarButtons  : " + actopeningStocksNewToolBarButtons);
		System.out.println("expopeningStocksNewToolBarButtons  : " + expopeningStocksNewToolBarButtons);
		
		excelReader.setCellData(xlfile, xlSheetName, 19, 8, actopeningStocksNewToolBarButtons);	
		
		String actsetAsDefaultView		=	setAsDefaultView.getText();
		String expsetAsDefaultView		=	excelReader.getCellData(xlSheetName, 20, 7);
		excelReader.setCellData(xlfile, xlSheetName, 20, 8, actsetAsDefaultView);
		
		
		//Ribbon Control Icons
        int count1		= headingOptions.size();
		
		ArrayList<String> headingButtons = new ArrayList<String>();
		
		for (int i = 1; i < count1; i++) 
		{
			String data=headingOptions.get(i).getAttribute("title");
			
			headingButtons.add(data);
		}
		
		String actHeadingButtons = headingButtons.toString();
		String expHeadingButtons = excelReader.getCellData(xlSheetName, 21, 7);
		excelReader.setCellData(xlfile, xlSheetName, 21, 8, actHeadingButtons);
		
		
		System.out.println("actopeningStocksNewHeadingButtons  : " + actHeadingButtons);
		System.out.println("expopeningStocksNewHeadingButtons  : " + expHeadingButtons);
		
		//Home Page Column Headings
        int headerTxtCount		= headerTxtList.size();
		
		ArrayList<String> headerTxt = new ArrayList<String>();
		
		for (int i = 2; i < headerTxtCount; i++) 
		{
			String data=headerTxtList.get(i).getText();
			headerTxt.add(data);
		}
		
		String actHeaderTxt = headerTxt.toString();
		String expHeaderTxt = excelReader.getCellData(xlSheetName, 22, 7);
		excelReader.setCellData(xlfile, xlSheetName, 22, 8, actHeaderTxt);
		
		
		System.out.println("actopeningStocksNewHomePageColumnsButtons  : " + actHeaderTxt);
		System.out.println("expopeningStocksNewHomePageColumnsButtons  : " + expHeaderTxt);
		
		if(actopeningStocksNewToolBarButtons.equalsIgnoreCase(expopeningStocksNewToolBarButtons)
				&& actHeadingButtons.equalsIgnoreCase(expHeadingButtons)
				&& actHeaderTxt.equalsIgnoreCase(expHeaderTxt))
		{
			System.out.println("Test Pass : HomeScreen Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 18, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : HomeScreen Options Are NOT Displayed");
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
	

  @FindBy(xpath="//*[@id='txtViewName']")
  private static WebElement  viewNameTxtInCreateView;
  
  @FindBy(xpath="//*[@id='cmbDataSet']")
  private static WebElement  dataSetInCreateView;
  
  @FindBy(xpath="//*[@id='cmbViewType']")
  private static WebElement  viewTypeInCreateView;

  @FindBy(xpath="//*[@id='cmbAuthorization']")
  private static WebElement  authorizationInCreateView;

  @FindBy(xpath="//*[@id='cmbCheckStatus']")
  private static WebElement  checkSatusInCreateView;
  
  @FindBy(xpath="//*[@id='cmbQC']")
  private static WebElement  qcInCreateView;
  
  @FindBy(xpath="//*[@id='Suspendstatus']")
  private static WebElement  suspendStatusInCreateView;
  
  @FindBy(xpath="//*[@id='idFilterCustomizeIcon']")
  private static WebElement  filterOptionInCreateView;
  
  @FindBy(xpath="//*[@id='a']")
  private static WebElement  advanvefilterOptionInCreateView;
  
  @FindBy(xpath="//*[@id='dvCreateEditView']/div/div/div[3]/div/button[1]")
  private static WebElement  saveOptionInCreateView;
  
  @FindBy(xpath="//*[@id='dvCreateEditView']/div/div/div[3]/div/button[2]")
  private static WebElement  closeOptionInCreateView;
  
  @FindBy(xpath="//*[@id='dv_TranHomeHeading']/div[2]/div/div[1]/label")
  private static WebElement setAsDefaultView;
 
  @FindBy(xpath="//*[@id='dv_TranHomeHeading']/div[2]/div/div")
  private static List<WebElement> headingOptions;
 
  @FindBy(xpath="//*[@id='tblHeadTransRender']/tr/th")
  private static List<WebElement> headerTxtList;
  
  @FindBy(xpath="//*[@id='cmbDataSet']/option")
  private static WebElement datasetGetText;
  
  @FindBy(xpath="//*[@id='cmbViewType']/option[1]")
  private static WebElement viewTypeGetText;
  
  @FindBy(xpath="//*[@id='cmbCheckStatus']/option[1]")
  private static WebElement checkStatusGetText;
  
  @FindBy(xpath="//*[@id='Suspendstatus']/option[1]")
  private static WebElement suspendStatusGetText;

  @FindBy(xpath="//*[@id='cmbAuthorization']/option[1]")
  private static WebElement authorizationGetText;
  
  @FindBy(xpath="//*[@id='cmbQC']/option[1]")
  private static WebElement qcGetText;
  
  @FindBy(xpath="//*[@id='txtViewName']")
  private static WebElement viewNameGetText;
  
  
  public boolean checkOpeningStocksNewVoucherCreateViewOptionInHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewBtn));
		createViewBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(qcInCreateView));
	
		boolean actViewTxt              = viewNameTxtInCreateView.isDisplayed();
		boolean actDataSet              = dataSetInCreateView.isDisplayed();
		boolean actViewType             = viewTypeInCreateView.isDisplayed();
		boolean actAuthorization        = authorizationInCreateView.isDisplayed();
		boolean actCheckStatus          = checkSatusInCreateView.isDisplayed();
		boolean actQC                   = qcInCreateView.isDisplayed();
		boolean actSuspendStatus        = suspendStatusInCreateView.isDisplayed();
		boolean actFilterOption         = filterOptionInCreateView.isDisplayed();
		boolean actAdvanceFilter        = advanvefilterOptionInCreateView.isDisplayed();
		boolean actSaveOption           = saveOptionInCreateView.isDisplayed();
		boolean actCloseOption          = closeOptionInCreateView.isDisplayed();
		
		boolean expViewTxt              = true;
		boolean expDataSet              = true;
		boolean expViewType             = true;
		boolean expAuthorization        = true;
		boolean expCheckStatus          = true;
		boolean expQC                   = true;
		boolean expSuspendStatus        = true;
		boolean expFilterOption         = true;
		boolean expAdvanceFilter        = true;
		boolean expSaveOption           = true;
		boolean expCloseOption          = true;
		
		boolean actMethod = actViewTxt==expViewTxt  && actDataSet==expDataSet && actViewType==expViewType && actAuthorization==expAuthorization
							&& actCheckStatus==expCheckStatus && actQC==expQC && actSuspendStatus==expSuspendStatus 
							&& actFilterOption==expFilterOption && actAdvanceFilter==expAdvanceFilter && actSaveOption==expSaveOption && actCloseOption==expCloseOption;
		
		String actResult = Boolean.toString(actMethod);
		
		excelReader.setCellData(xlfile, xlSheetName, 24, 8, actResult.toUpperCase());
		
		
		System.out.println("View Text Box Value Actual       : " + actViewTxt       +     "  Value Expected : " + expViewTxt);
		System.out.println("Data Set Value Actual            : " + actDataSet       +     "  Value Expected : " + expDataSet);
		System.out.println("View Type Value Actual           : " + actViewType      +     "	 Value Expected : " + expViewType);
		System.out.println("Authorization Value Actual       : " + actAuthorization +     "  Value Expected : " + expAuthorization);
		System.out.println("Check Status Value Actual        : " + actCheckStatus   +     "	 Value Expected : " + expCheckStatus);
		System.out.println("QC Value Actual                  : " + actQC            +     "	 Value Expected : " + expQC);
		System.out.println("Suspend Value Actual             : " + actSuspendStatus +     "	 Value Expected : " + expSuspendStatus);
		System.out.println("Filter Value Actual              : " + actFilterOption  +     "	 Value Expected : " + expFilterOption);
		System.out.println("Advance Filter Value Actual      : " + actAdvanceFilter +     "	 Value Expected : " + expAdvanceFilter);
		System.out.println("Save Option Value Actual         : " + actSaveOption    +     "	 Value Expected : " + expSaveOption);
		System.out.println("Close Option Value Actual        : " + actCloseOption   +     "	 Value Expected : " + actCloseOption);
		
		System.out.println("Test"+ datasetGetText.getText());
		System.out.println("Test"+ viewTypeGetText.getText());
		System.out.println("Test"+ checkStatusGetText.getText());
		System.out.println("Test"+ suspendStatusGetText.getText());
		System.out.println("Test"+ authorizationGetText.getText());
		System.out.println("Test"+ qcGetText.getText());
	
		if(actMethod==true)
		{
			System.out.println("Test Pass : HomeScreen Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : HomeScreen Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
	{
		excelReader.setExceptionInExcel(xlfile, xlSheetName, 23, 10, e.getMessage());
		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		return false;
	}
  }
  

  
  
  @FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[2]/a")
  private static WebElement createViewNameDisplayInHomePage;
  
  
  public boolean checkSaveInCreateViewOfHomePageOfOpeningStocksNew() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	    try
	    {	
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewNameTxtInCreateView));
	     viewNameTxtInCreateView.click();
	     
	     viewNameTxtInCreateView.sendKeys(excelReader.getCellData(xlSheetName, 25, 6));
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveOptionInCreateView));
	     saveOptionInCreateView.click();
	     
	     String expSaveViewMessage = excelReader.getCellData(xlSheetName, 26, 7);
			
		 String actSaveViewMessage = checkValidationMessage(expSaveViewMessage);
			
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameDisplayInHomePage));
		 
		 String actcreateViewNameDisplayInHomePage = createViewNameDisplayInHomePage.getText();
		 String expcreateViewNameDisplayInHomePage = excelReader.getCellData(xlSheetName, 27, 7);
		 
		 
		 excelReader.setCellData(xlfile, xlSheetName, 26, 8, actSaveViewMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 27, 8, actcreateViewNameDisplayInHomePage);
		 
		 
		 System.out.println("View Display In Home page Value Actual    : " + actcreateViewNameDisplayInHomePage   +     "	 Value Expected : " + expcreateViewNameDisplayInHomePage);
		
		 if(actSaveViewMessage.equalsIgnoreCase(expSaveViewMessage) && actcreateViewNameDisplayInHomePage.equalsIgnoreCase(expcreateViewNameDisplayInHomePage) )
		 {
			System.out.println("Test Pass : View Saved Successfully");
			
			excelReader.setCellData(xlfile, xlSheetName, 25, 9, resPass);
			return true;
		 }
		 else
		 {
			System.out.println("Test Fail : View NOT Saved Successfully");
			
			excelReader.setCellData(xlfile, xlSheetName, 25, 9, resFail);
			return false;
		 } 
	    }
	    catch (Exception e) 
		{

			excelReader.setExceptionInExcel(xlfile, xlSheetName, 25, 10, e.getMessage());
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			return false;
		}
	 }
  
  
  
 
  @FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[3]/a")
  private static WebElement createViewNameToDeleteDisplayInHomePage;
  
  @FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li")
  private static List<WebElement> countOfCreateView;
  
  @FindBy(xpath="//*[@id='btnDeleteview']/div/span")
  private static WebElement deleteViewButton;
  
  
  public boolean checkDeleteCreateViewOfHomePageOfOpeningStocksNew() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
    try
    {
    	
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewBtn));
   	 createViewBtn.click();
   			
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewNameTxtInCreateView));
     viewNameTxtInCreateView.click();
     
     viewNameTxtInCreateView.sendKeys(excelReader.getCellData(xlSheetName, 28, 6));
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveOptionInCreateView));
     saveOptionInCreateView.click();
     
     String expSaveViewMessage =excelReader.getCellData(xlSheetName, 29, 7);
		
	 String actSaveViewMessage = checkValidationMessage(expSaveViewMessage);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameDisplayInHomePage));
	 
	 String actcreateViewNameDisplayInHomePage = createViewNameToDeleteDisplayInHomePage.getText();
	 String expcreateViewNameDisplayInHomePage = excelReader.getCellData(xlSheetName, 30, 7);
	 
	 System.out.println("View Display In Home page Value Actual    : " + actcreateViewNameDisplayInHomePage   +     "	 Value Expected : " + expcreateViewNameDisplayInHomePage);
	 
	 Thread.sleep(2000);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameToDeleteDisplayInHomePage));
	 createViewNameToDeleteDisplayInHomePage.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteViewButton));
	 deleteViewButton.click();
	 
	 getWaitForAlert();
	 
	 String actAlertMessageOnDeleteView = getAlert().getText();
	 String expAlertMessageOnDeleteView = excelReader.getCellData(xlSheetName, 31, 7);
	 
	 System.out.println("View Display In Home page Value Actual    : " + actAlertMessageOnDeleteView   +     "	 Value Expected : " + expAlertMessageOnDeleteView);
	 
	 getAlert().accept();
	 
	 String expDeleteViewMessage =excelReader.getCellData(xlSheetName, 32, 7);
		
	 String actDeleteViewMessage = checkValidationMessage(expDeleteViewMessage);
	
	 int Count=countOfCreateView.size();
	 
	 String actCount=Integer.toString(Count);
		
	 String expCount = excelReader.getCellData(xlSheetName, 33, 7);
	 
	 
	 System.out.println("Count In Home page Value Actual    : " + actCount   +     "	 Value Expected : " + expCount);
	 
	 
	 excelReader.setCellData(xlfile, xlSheetName, 29, 8, actSaveViewMessage);
	 excelReader.setCellData(xlfile, xlSheetName, 30, 8, actcreateViewNameDisplayInHomePage);
	 excelReader.setCellData(xlfile, xlSheetName, 31, 8, actAlertMessageOnDeleteView);
	 excelReader.setCellData(xlfile, xlSheetName, 32, 8, actDeleteViewMessage);
	 excelReader.setCellData(xlfile, xlSheetName, 33, 8, actCount);
	 
	 
	 if(actSaveViewMessage.equalsIgnoreCase(expSaveViewMessage) && actcreateViewNameDisplayInHomePage.equalsIgnoreCase(expcreateViewNameDisplayInHomePage)
			 && actAlertMessageOnDeleteView.equalsIgnoreCase(expAlertMessageOnDeleteView) && actCount.equalsIgnoreCase(expCount))
	 {
		System.out.println("Test Pass : View Saved Successfully");
		
		excelReader.setCellData(xlfile, xlSheetName, 28, 9, resPass);
		return true;
	 }
	 else
	 {
		System.out.println("Test Fail : View NOT Saved Successfully");
		
		excelReader.setCellData(xlfile, xlSheetName, 28, 9, resFail);
		return false;
	 } 
    }
    catch (Exception e) 
	{
		excelReader.setExceptionInExcel(xlfile, xlSheetName, 28, 10, e.getMessage());
		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		return false;
	}
 }
  
  
  @FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[2]/a")
  private static WebElement createViewNameToEditInHomePage;
 
  @FindBy(xpath="//*[@id='btnEditView']/div/span")
  private static WebElement editViewOptionInHomePage;
 
  
  public boolean checkEditCreateViewOfHomePageOfOpeningStocksNew() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
    try
    {
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameToEditInHomePage));
        createViewNameToEditInHomePage.click();
   		
        
        Thread.sleep(2000);
        //Home Page Column Headings
        
        int headerTxtCount		= headerTxtList.size();
		
		ArrayList<String> headerTxt = new ArrayList<String>();
		
		for (int i = 2; i < headerTxtCount; i++) 
		{
			String data=headerTxtList.get(i).getText();
			headerTxt.add(data);
		}
		
		String actHeaderTxt = headerTxt.toString();
		String expHeaderTxt = excelReader.getCellData(xlSheetName, 35, 7);
		excelReader.setCellData(xlfile, xlSheetName, 35, 8, actHeaderTxt);
	
		System.out.println("actopeningStocksNewHomePageColumnsButtons  : " + actHeaderTxt);
		System.out.println("expopeningStocksNewHomePageColumnsButtons  : " + expHeaderTxt);
	
		//Click on Edit option

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editViewOptionInHomePage));
		 editViewOptionInHomePage.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewTypeInCreateView));
	
	     boolean actViewTxt              = viewNameTxtInCreateView.isDisplayed();
		 boolean actDataSet              = dataSetInCreateView.isDisplayed();
		 boolean actViewType             = viewTypeInCreateView.isDisplayed();
		 boolean actAuthorization        = authorizationInCreateView.isDisplayed();
		 boolean actCheckStatus          = checkSatusInCreateView.isDisplayed();
		 boolean actQC                   = qcInCreateView.isDisplayed();
		 boolean actSuspendStatus        = suspendStatusInCreateView.isDisplayed();
		 boolean actFilterOption         = filterOptionInCreateView.isDisplayed();
		 boolean actAdvanceFilter        = advanvefilterOptionInCreateView.isDisplayed();
		 boolean actSaveOption           = saveOptionInCreateView.isDisplayed();
		 boolean actCloseOption          = closeOptionInCreateView.isDisplayed();
		
		 boolean expViewTxt              = true;
		 boolean expDataSet              = true;
		 boolean expViewType             = true;
		 boolean expAuthorization        = true;
		 boolean expCheckStatus          = true;
		 boolean expQC                   = true;
		 boolean expSuspendStatus        = true;
		 boolean expFilterOption         = true;
		 boolean expAdvanceFilter        = true;
		 boolean expSaveOption           = true;
		 boolean expCloseOption          = true;
		 
		 System.out.println("View Text Box Value Actual       : " + actViewTxt       +     "  Value Expected : " + expViewTxt);
		 System.out.println("Data Set Value Actual            : " + actDataSet       +     "  Value Expected : " + expDataSet);
		 System.out.println("View Type Value Actual           : " + actViewType      +     "  Value Expected : " + expViewType);
		 System.out.println("Authorization Value Actual       : " + actAuthorization +     "  Value Expected : " + expAuthorization);
		 System.out.println("Check Status Value Actual        : " + actCheckStatus   +     "  Value Expected : " + expCheckStatus);
		 System.out.println("QC Value Actual                  : " + actQC            +     "  Value Expected : " + expQC);
		 System.out.println("Suspend Value Actual             : " + actSuspendStatus +     "  Value Expected : " + expSuspendStatus);
		 System.out.println("Filter Value Actual              : " + actFilterOption  +     "  Value Expected : " + expFilterOption);
		 System.out.println("Advance Filter Value Actual      : " + actAdvanceFilter +     "  Value Expected : " + expAdvanceFilter);
		 System.out.println("Save Option Value Actual         : " + actSaveOption    +     "  Value Expected : " + expSaveOption);
		 System.out.println("Close Option Value Actual        : " + actCloseOption   +     "  Value Expected : " + expCloseOption);
		
		 String actdatasetGetText       = datasetGetText.getText();
		 String actviewTypeGetText      = viewTypeGetText.getText();
		 String actcheckStatusGetText   = checkStatusGetText.getText();
		 String actsuspendTypeGetText   = suspendStatusGetText.getText();
		 String actauthorizationGetText = authorizationGetText.getText();
		 String actqcGetText            = qcGetText.getText();
		 String actGetViewName          = viewNameGetText.getAttribute("value");
		
		 String expdatasetGetText       = excelReader.getCellData(xlSheetName, 36, 7);
		 String expviewTypeGetText      = excelReader.getCellData(xlSheetName, 37, 7);
		 String expcheckStatusGetText   = excelReader.getCellData(xlSheetName, 38, 7);
		 String expsuspendTypeGetText   = excelReader.getCellData(xlSheetName, 39, 7);
		 String expauthorizationGetText = excelReader.getCellData(xlSheetName, 40, 7);
		 String expqcGetText            = excelReader.getCellData(xlSheetName, 41, 7);
		 String expGetViewName          = excelReader.getCellData(xlSheetName, 42, 7);
		 
		 excelReader.setCellData(xlfile, xlSheetName, 36, 8, actdatasetGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 37, 8, actviewTypeGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 38, 8, actcheckStatusGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 39, 8, actsuspendTypeGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 40, 8, actauthorizationGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 41, 8, actqcGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 42, 8, actGetViewName);
		 
		 
		 System.out.println("Data Set Value Actual        : " + actdatasetGetText  +      "  Value Expected : " + expdatasetGetText);
		 System.out.println("View Type Value Actual       : " + actviewTypeGetText  +     "  Value Expected : " + expviewTypeGetText);
		 System.out.println("Check Status Value Actual    : " + actcheckStatusGetText +   "  Value Expected : " + expcheckStatusGetText);
		 System.out.println("Suspend Value Actual         : " + actsuspendTypeGetText +   "  Value Expected : " + expsuspendTypeGetText);
		 System.out.println("Authorization Value Actual   : " + actauthorizationGetText + "  Value Expected : " + expauthorizationGetText);
		 System.out.println("QC Value Actual              : " + actqcGetText            + "  Value Expected : " + expqcGetText);
		 System.out.println("View Name Value Actual       : " + actGetViewName +          "  Value Expected : " + expGetViewName);

		 
		 Thread.sleep(2000);
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewNameTxtInCreateView));
	     viewNameTxtInCreateView.click();
	     viewNameTxtInCreateView.sendKeys(Keys.END);
	     viewNameTxtInCreateView.sendKeys(Keys.SHIFT,Keys.HOME);
	     viewNameTxtInCreateView.sendKeys(excelReader.getCellData(xlSheetName, 34, 6));
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendStatusInCreateView));
	     suspendStatusInCreateView.sendKeys(excelReader.getCellData(xlSheetName, 35, 6));
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveOptionInCreateView));
	     saveOptionInCreateView.click();
	     
	     String expSaveViewMessage =excelReader.getCellData(xlSheetName, 43, 7);
			
		 String actSaveViewMessage = checkValidationMessage(expSaveViewMessage);
		 
		 System.out.println("Save View In Home page Value Actual    : " + actSaveViewMessage   +     "	 Value Expected : " + expSaveViewMessage);
		 
		 excelReader.setCellData(xlfile, xlSheetName, 43, 8, actSaveViewMessage);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameDisplayInHomePage));
		 
		 String actcreateViewNameDisplayInHomePage = createViewNameToEditInHomePage.getText();
		 String expcreateViewNameDisplayInHomePage = excelReader.getCellData(xlSheetName, 44, 7);
		 
		 System.out.println("View Display In Home page Value Actual    : " + actcreateViewNameDisplayInHomePage   +     "	 Value Expected : " + expcreateViewNameDisplayInHomePage);
		 
		 excelReader.setCellData(xlfile, xlSheetName, 44, 8, actcreateViewNameDisplayInHomePage);
		 
		 boolean actMethod = actViewTxt==expViewTxt &&    actDataSet==expDataSet && actViewType==expViewType && actAuthorization==expAuthorization
							&& actCheckStatus==expCheckStatus && actQC==expQC && actSuspendStatus==expSuspendStatus 
							&& actFilterOption==expFilterOption && actAdvanceFilter==expAdvanceFilter && actSaveOption==expSaveOption && actCloseOption==expCloseOption;
			
		 String actResult = Boolean.toString(actMethod);
		 
		 excelReader.setCellData(xlfile, xlSheetName, 34, 8, actResult.toUpperCase());
		 
		 if(actHeaderTxt.equalsIgnoreCase(expHeaderTxt) && actMethod==true
				
				&& actdatasetGetText.equalsIgnoreCase(expdatasetGetText) && actviewTypeGetText.equalsIgnoreCase(expviewTypeGetText)
				&& actcheckStatusGetText.equalsIgnoreCase(expcheckStatusGetText) && actsuspendTypeGetText.equalsIgnoreCase(expsuspendTypeGetText)
				&& actauthorizationGetText.equalsIgnoreCase(expauthorizationGetText) && actqcGetText.equalsIgnoreCase(expqcGetText)
				&& actGetViewName.equalsIgnoreCase(expGetViewName)
				
				&& actSaveViewMessage.equalsIgnoreCase(expSaveViewMessage) && actcreateViewNameDisplayInHomePage.equalsIgnoreCase(expcreateViewNameDisplayInHomePage))
		  {
			System.out.println("Test Pass : View Saved Successfully");
			
			excelReader.setCellData(xlfile, xlSheetName, 34, 9, resPass);
			return true;
		  }
		  else
		  {
			System.out.println("Test Fail : View NOT Saved Successfully");
			
			excelReader.setCellData(xlfile, xlSheetName, 34, 9, resFail);
			return false;
		  } 
    }
    catch (Exception e) 
	{
		String exception =e.getMessage().substring(0, 50);
		excelReader.setExceptionInExcel(xlfile, xlSheetName, 34, 10, e.getMessage());
		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		return false;
	}
  }
  
  
  
  public boolean checkOpeningStocksNewVoucherHomePageNewOptionOnClickDisplayEntryPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
    try
    {
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	 newBtn.click();
	
	 checkUserFriendlyMessage();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(freeFlowBtn));
	 
	 boolean actOpeningStocksNewVouherFreeFlowBtn=freeFlowBtn.isDisplayed();
	 boolean expOpeningStocksNewVouherFreeFlowBtn=true;
			
	 System.out.println("Opening Stocks Voucher Free Flow Option Value Actual : " + actOpeningStocksNewVouherFreeFlowBtn+ "  Value Expected : " + expOpeningStocksNewVouherFreeFlowBtn);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoSideBarMinimizeExpandBtn));
	 infoSideBarMinimizeExpandBtn.click();
	 
	 boolean actMethod = actOpeningStocksNewVouherFreeFlowBtn==expOpeningStocksNewVouherFreeFlowBtn;
	 
	 String actResult = Boolean.toString(actMethod);
	 
	 excelReader.setCellData(xlfile, xlSheetName, 45, 8, actResult.toUpperCase());
	  
	 if(actOpeningStocksNewVouherFreeFlowBtn==expOpeningStocksNewVouherFreeFlowBtn )
	 {
		System.out.println("Test Pass : entry Page  Displayed");
		excelReader.setCellData(xlfile, xlSheetName, 45, 9, resPass);
		return true;
	 } 
	 else
	 {
		System.out.println("Test Fail : entry Page NOT Displayed");
		excelReader.setCellData(xlfile, xlSheetName, 45, 9, resFail);
		return false;
	 } 
    }
    catch (Exception e) 
	{
		excelReader.setExceptionInExcel(xlfile, xlSheetName, 45, 10, e.getMessage());
		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		return false;
	}
 }
	
  
	
 public boolean checkOpeningStocksNewVoucherEntryPageRibbonControl() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(freeFlowBtn));
		
		boolean actEntryPageJumpToHeaderSectionBtn = jumpToHeaderSectionBtn.isDisplayed();
		boolean actEntryPageJumpToBodySectionBtn   = jumpToBodySectionBtn.isDisplayed();
		boolean actEntryPageJumpToFooterBtn        = jumpToFooterBtn.isDisplayed();
		boolean actEntryPageNewBtn                 = new_newBtn.isDisplayed();
		boolean actEntryPageSaveBtn                = saveBtn.isDisplayed();
		boolean actEntryPagePreviousBtn            = previousBtn.isDisplayed();
		boolean actEntryPageNextBtn                = nextBtn.isDisplayed();
		boolean actEntryPagePrintBtn               = new_PrintBtn.isDisplayed();
		boolean actEntryPageSuspendBtn             = new_SuspendBtn.isDisplayed();
		boolean actEntryPageCloseBtn               = new_CloseBtn.isDisplayed();
		boolean actEntryPageToggleBtn              = toggleBtn.isDisplayed();

		boolean expEntryPageJumpToHeaderSectionBtn = true;
		boolean expEntryPageJumpToBodySectionBtn   = true;
		boolean expEntryPageJumpToFooterBtn        = true;
		boolean expEntryPageNewBtn	               = true;
		boolean expEntryPageSaveBtn                = true;
		boolean expEntryPagePreviousBtn            = true;
		boolean expEntryPageNextBtn                = true;
		boolean expEntryPagePrintBtn               = true;
		boolean expEntryPageSuspendBtn             = true;
		boolean expEntryPageCloseBtn               = true;
		boolean expEntryPageToggleBtn              = true;
		
		boolean actMethod = actEntryPageJumpToHeaderSectionBtn==expEntryPageJumpToHeaderSectionBtn && actEntryPageJumpToBodySectionBtn==expEntryPageJumpToBodySectionBtn 
							&& actEntryPageJumpToFooterBtn==expEntryPageJumpToFooterBtn && actEntryPageJumpToFooterBtn==expEntryPageJumpToFooterBtn
							&& actEntryPageNewBtn==expEntryPageNewBtn && actEntryPageSaveBtn==expEntryPageSaveBtn && actEntryPagePreviousBtn==expEntryPagePreviousBtn
							&& actEntryPageNextBtn==expEntryPageNextBtn && actEntryPagePrintBtn==expEntryPagePrintBtn &&actEntryPageSuspendBtn==expEntryPageSuspendBtn 
							&& actEntryPageCloseBtn==expEntryPageCloseBtn && actEntryPageToggleBtn==expEntryPageToggleBtn ;
		
		String actResult = Boolean.toString(actMethod);
		
		excelReader.setCellData(xlfile, xlSheetName, 46, 8, actResult.toUpperCase());
		
		
		//System.out.println("************************************* Opening Stocks New Entry Page Ribbon Control Options  ********************************************");
		
		System.out.println("Jump to Header Value Actual : " + actEntryPageJumpToHeaderSectionBtn+ " Value Expected : " + expEntryPageJumpToHeaderSectionBtn);
		System.out.println("Jump To Body Value Actual   : " + actEntryPageJumpToBodySectionBtn+   " Value Expected : " + expEntryPageJumpToBodySectionBtn);
		System.out.println("Jump To Footer Value Actual : " + actEntryPageJumpToFooterBtn+        " Value Expected : " + expEntryPageJumpToFooterBtn);
		System.out.println("New Btn Value Actual        : " + actEntryPageNewBtn+                 " Value Expected : " + expEntryPageNewBtn);
		System.out.println("Save Btn Value Actual       : " + actEntryPageSaveBtn+                " Value Expected : " + expEntryPageSaveBtn);
		System.out.println("Previous Btn Value Actual   : " + actEntryPagePreviousBtn+            " Value Expected : " + expEntryPagePreviousBtn);
		System.out.println("Next Btn Value Actual       : " + actEntryPageNextBtn+                " Value Expected : " + expEntryPageNextBtn);
		System.out.println("Print Btn Value Actual      : " + actEntryPagePrintBtn+               " Value Expected : " + expEntryPagePrintBtn);
		System.out.println("Suspend Btn Value Actual    : " + actEntryPageSuspendBtn+             " Value Expected : " + expEntryPageSuspendBtn);
		System.out.println("Close Btn Value Actual      : " + actEntryPageCloseBtn+               " Value Expected : " + expEntryPageCloseBtn);
		System.out.println("Toggle Btn Value Actual     : " + actEntryPageToggleBtn+              " Value Expected : " + expEntryPageToggleBtn);
	
		if(actMethod==true)
		{
			System.out.println("Test Pass : Entry Page Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 46, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Entry Page NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 46, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
	{
		excelReader.setExceptionInExcel(xlfile, xlSheetName, 46, 10, e.getMessage());
		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		return false;
	}
 }
	
	
	
 @FindBy(xpath="//*[@id='id_transactionentry_header1_section']/div/div/div/label")
 private static List<WebElement> voucherHeaderList;
 
	
 public boolean checkOpeningStocksNewEntryPageHeaderFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 {
		
  excelReader=new ExcelReader(POJOUtility.getExcelPath());
  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
  try
  {
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	  
	  int voucherHeaderListCount = voucherHeaderList.size();
	  
	  ArrayList<String> voucherHeaderListArray = new ArrayList<String>();
	  
	  for(int i=1;i<voucherHeaderListCount;i++)
	  {
		  String data = voucherHeaderList.get(i).getText();
		  voucherHeaderListArray.add(data);
	  }
			
	  String actvoucherHeaderList=voucherHeaderListArray.toString();
	  
	  String expvoucherHeaderList=excelReader.getCellData(xlSheetName, 48, 7);
	  
	  excelReader.setCellData(xlfile, xlSheetName, 48, 8, actvoucherHeaderList);
	  
	  System.out.println("voucherHeaderList Actual   : " + actvoucherHeaderList);
	  System.out.println("voucherHeaderList Expected : " + expvoucherHeaderList);
	  
	
	if(actvoucherHeaderList.equalsIgnoreCase(expvoucherHeaderList))
	{
		System.out.println("Test Pass : entry Page Header Options Are Displayed");
		excelReader.setCellData(xlfile, xlSheetName, 47, 9, resPass);
		return true;
	}
	else
	{
		System.out.println("Test Fail : entry Page NOT Displayed");
		excelReader.setCellData(xlfile, xlSheetName, 47, 9, resFail);
		return false;
	}
  }	
  catch (Exception e) 
  {
	  excelReader.setExceptionInExcel(xlfile, xlSheetName, 47, 10, e.getMessage());
	  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  return false;
  }
}
	
	
 @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_row_heading']/th/div[1]")
 private static List<WebElement> voucherBodyGridHeaderList;
	
	
  public boolean checkOpeningStocksNewEntryPageBodyFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));		
		
		
		int voucherBodyGridHeaderListCount = voucherBodyGridHeaderList.size();
		  
		ArrayList<String> voucherBodyGridHeaderListArray = new ArrayList<String>();
		  
		for(int i=0;i<voucherBodyGridHeaderListCount;i++)
		{
			String data = voucherBodyGridHeaderList.get(i).getText();
			voucherBodyGridHeaderListArray.add(data);
		}	
		
		String actvoucherBodyGridHeaderList=voucherBodyGridHeaderListArray.toString();
		
		String expvoucherBodyGridHeaderList=excelReader.getCellData(xlSheetName, 50, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 50, 8, actvoucherBodyGridHeaderList);
		
		boolean actEntryPageBodyFieldsItem  = select1stRow_1stColumn.isDisplayed();
		boolean actEntryPageBodyFieldsUnits = select1stRow_2ndColumn.isDisplayed();
		boolean actEntryPageBodyFieldsQty   = select1stRow_3rdColumn.isDisplayed();
		boolean actEntryPageBodyFieldsRate  = select1stRow_4thColumn.isDisplayed();
		boolean actEntryPageBodyFieldsGross = select1stRow_5thColumn.isDisplayed();
		
		boolean expEntryPageBodyFieldsItem  = true;
		boolean expEntryPageBodyFieldsUnits = true;
		boolean expEntryPageBodyFieldsQty   = true;
		boolean expEntryPageBodyFieldsRate  = true;
		boolean expEntryPageBodyFieldsGross = true;
		
		
		boolean actMethod = actEntryPageBodyFieldsItem==expEntryPageBodyFieldsItem && actEntryPageBodyFieldsUnits==expEntryPageBodyFieldsUnits 
							&& actEntryPageBodyFieldsQty==expEntryPageBodyFieldsQty && actEntryPageBodyFieldsRate==expEntryPageBodyFieldsRate 
							&& actEntryPageBodyFieldsGross==expEntryPageBodyFieldsGross;

		String actResult = Boolean.toString(actMethod);

		excelReader.setCellData(xlfile, xlSheetName, 49, 8, actResult.toUpperCase());
		
		
		//System.out.println("************************************* checkOpeningStocksNewEntryPageBodyFields  ********************************************");
		System.out.println("Item Value Actual            : " + actEntryPageBodyFieldsItem+ "    Value Expected : " + expEntryPageBodyFieldsItem);
		System.out.println("Units Value Actual           : " + actEntryPageBodyFieldsUnits+ "   Value Expected : " + expEntryPageBodyFieldsUnits);
		System.out.println("Qty Value Actual             : " + actEntryPageBodyFieldsQty+ "     Value Expected : " + expEntryPageBodyFieldsQty);
		System.out.println("Rate Value Actual            : " + actEntryPageBodyFieldsRate+ "    Value Expected : " + expEntryPageBodyFieldsRate);	
		System.out.println("Gross Value Actual           : " + actEntryPageBodyFieldsGross+ "   Value Expected : " + expEntryPageBodyFieldsGross);	
		System.out.println("actvoucherBodyGridHeaderList : " + actvoucherBodyGridHeaderList);
		System.out.println("expvoucherBodyGridHeaderList : " + expvoucherBodyGridHeaderList);
		
		if(actMethod==true && actvoucherBodyGridHeaderList.equalsIgnoreCase(expvoucherBodyGridHeaderList))
		{
			System.out.println("Test Pass : entry Page Body Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 49, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : entry Page NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 49, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
	{
		excelReader.setExceptionInExcel(xlfile, xlSheetName, 49, 10, e.getMessage());
		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		return false;
	}
  }
	
	
	
	
	public boolean checkOpeningStocksNewEntryPageFooterFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	  try
	  {
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(netLabel));
		
		boolean actEntryPageFooterFieldsNetLabel  = netLabel.isDisplayed();
		boolean actEntryPageFooterFieldsNetAmount = netAmount.isDisplayed();

		boolean expEntryPageFooterFieldsNetLabel  = true;
		boolean expEntryPageFooterFieldsNetAmount = true;
		
		boolean actMethod = actEntryPageFooterFieldsNetLabel==expEntryPageFooterFieldsNetLabel && actEntryPageFooterFieldsNetAmount==expEntryPageFooterFieldsNetAmount;

		String actResult = Boolean.toString(actMethod);

		excelReader.setCellData(xlfile, xlSheetName, 51, 8, actResult.toUpperCase());
		
		System.out.println("Entry Page Footer Fields Net Label Value Actual  : "+actEntryPageFooterFieldsNetLabel+"   Value Expected : "+expEntryPageFooterFieldsNetLabel);
		System.out.println("Entry Page Footer Fields Net Amount Value Actual : "+actEntryPageFooterFieldsNetAmount+"  Value Expected : "+expEntryPageFooterFieldsNetAmount);
		
		if(actMethod==true)
		{
			System.out.println("Test Pass : entry Page Footer Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 51, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : entry Page NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 51, 9, resFail);
			return false;
		}
	  }
	  catch (Exception e) 
	  {
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 51, 10, e.getMessage());
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		  return false;
	  }
	}
	

	
	
	 @FindBy(xpath="//input[@id='id_body_37']")
	  private static WebElement enter_Expirydate;

	  public boolean checkBatchItemRowQtyRateGrossBatchInOpeningStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			documentNumberTxt.click();
			documentNumberTxt.sendKeys(Keys.TAB);
			
			String actDocNumberBeforeNewClick     = documentNumberTxt.getAttribute("value");
			String expDocNumberBeforeNewClick     = "1";
			
			System.out.println("Entry Page Save With Input Of Batch Value Actual  : " + actDocNumberBeforeNewClick + "  Value Expected   : " + expDocNumberBeforeNewClick);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.click();
			wareHouseTxt.sendKeys("HYDERABAD");
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		    wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();		
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("BATCH BR ITEM");
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.ENTER);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.click();
			enter_UnitTxt.sendKeys(Keys.TAB);
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
			select1stRow_3rdColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.click();
			enter_Quantity.clear();
			enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 82, 6));
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.click();
			enter_Rate.clear();
			enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 83, 6));
			enter_Rate.sendKeys(Keys.TAB);			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
			enter_Batch.click();
			enter_Batch.clear();
			enter_Batch.sendKeys(excelReader.getCellData(xlSheetName, 84, 6));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
			enter_Expirydate.click();
			enter_Expirydate.sendKeys(Keys.TAB);
			
			String actUnitsColumnValue  = select1stRow_2ndColumn.getText();
			String expUnitsColumnValue  = "Dozs";
				
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
			String actQtyR1         = select1stRow_3rdColumn.getText();
			String actRateR1        = select1stRow_4thColumn.getText();
			String actGrossR1       = select1stRow_5thColumn.getText();
			String actBatchR1       = select1stRow_6thColumn.getText();
			
			String expQtyR1         = excelReader.getCellData(xlSheetName, 86, 7);
			String expRateR1        = excelReader.getCellData(xlSheetName, 87, 7);
			String expGrossR1       = excelReader.getCellData(xlSheetName, 88, 7);
			String expBatchR1       = excelReader.getCellData(xlSheetName, 89, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 86, 8, actQtyR1);
			excelReader.setCellData(xlfile, xlSheetName, 87, 8, actRateR1);
			excelReader.setCellData(xlfile, xlSheetName, 88, 8, actGrossR1);
			excelReader.setCellData(xlfile, xlSheetName, 89, 8, actBatchR1);
			
			
			System.out.println("Select Item Units Column Value Actual  : " + actUnitsColumnValue   + " Value Expected   : " + expUnitsColumnValue);

			System.out.println("Qty Row 1 Value Actual                 : " + actQtyR1              + " Value Expected   : " + expQtyR1);
			System.out.println("Rate Row 1 Value Actual                : " + actRateR1             + " Value Expected   : " + expRateR1);
			System.out.println("Gross Row 1 Value Actual               : " + actGrossR1            + " Value Expected   : " + expGrossR1);
			System.out.println("Batch Row 1 Value Actual               : " + actBatchR1            + " Value Expected   : " + expBatchR1);
		
			if(actUnitsColumnValue.equalsIgnoreCase(expUnitsColumnValue)  && actQtyR1.equalsIgnoreCase(expQtyR1) && actRateR1.equalsIgnoreCase(expRateR1)
					&& actGrossR1.equalsIgnoreCase(expGrossR1) && actBatchR1.equalsIgnoreCase(expBatchR1))
			{
				System.out.println("Test Pass : Error Message Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 82, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test fail : Error Message NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 82, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
	    {
			excelReader.setExceptionInExcel(xlfile, xlSheetName, 82, 10, e.getMessage());
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	   	 	return false;
	    }
	  }
	  

	 	  
	  
	  @FindBy(xpath="//*[@id='id_transaction_bins_grid_body']/tr/td")
	  private static List<WebElement> binInwardGridList;

	  public boolean checkBinItemQtyRateGrossBinInOpeningStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	    try
	    {
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
			select2ndRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("FIFO COGS ITEM");
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.ENTER);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.click();
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			String actUnitsColumnSelectingBinsProduct = select2ndRow_2ndColumn.getText();
			String expUnitsColumnSelectingBinsProduct = excelReader.getCellData(xlSheetName, 91, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 91, 8, actUnitsColumnSelectingBinsProduct);
			
			System.out.println("Units Column Value is display On Select       : " + actUnitsColumnSelectingBinsProduct +  "  Value Expected : " + expUnitsColumnSelectingBinsProduct);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.click();
			enter_Quantity.clear();
			enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 91, 6));
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.click();
			enter_Rate.clear();
			enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 92, 6));
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
			select2ndRow_5thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
			
			boolean actBinSearch            = binSearchTxt.isDisplayed();
			boolean actBinSearchTxt         = binSearchTxt.isDisplayed();
			boolean actBinSearchBtn         = binSearchBtn.isDisplayed();
			boolean actBinAutoAllocateBtn   = binAutoAllocateBtn.isDisplayed();
			boolean actBinPickBtn           = binPickBtn.isDisplayed();
			boolean actBinCancelBtn         = binCancelBtn.isDisplayed();
			
			boolean expBinSearch            = true;
			boolean expBinSearchTxt         = true;
			boolean expBinSearchBtn         = true;
			boolean expBinAutoAllocateBtn   = true;
			boolean expBinPickBtn           = true;
			boolean expBinCancelBtn         = true;
			
			System.out.println("Entry Page Bin Search Value Actual  : " + actBinSearch + "    Value Expected   : " + expBinSearch);
			
			
			String actBinTotalQty           = binTotalQty.getAttribute("value");
			String actBinBaseUom            = binBaseUOM.getText();
			String actBinBalanceQty         = binBalanceTxt.getAttribute("value");
			
			excelReader.setCellData(xlfile, xlSheetName, 95, 8, actBinTotalQty);
			excelReader.setCellData(xlfile, xlSheetName, 96, 8, actBinBaseUom);
			excelReader.setCellData(xlfile, xlSheetName, 97, 8, actBinBalanceQty);
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
			
			
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList=excelReader.getCellData(xlSheetName, 94, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 94, 8, actbinInwardGridList);
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		
			boolean actMethod = actBinSearch==expBinSearch && actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
					            && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
			
			String actResult = Boolean.toString(actMethod);
			
			excelReader.setCellData(xlfile, xlSheetName, 90, 8, actResult.toUpperCase());
		
			String expBinTotalQty           = excelReader.getCellData(xlSheetName, 95, 7);
			String expBinBaseUom            = excelReader.getCellData(xlSheetName, 96, 7);
			String expBinBalanceQty         = excelReader.getCellData(xlSheetName, 97, 7);
					
			System.out.println("Bin Total Qty Value Actual              :  " +actBinTotalQty +           " Value Expected : " + expBinTotalQty);
			System.out.println("Bin Base Uom Value Actual               :  " +actBinBaseUom +            " Value Expected : " + expBinBaseUom);
			System.out.println("Bin Balance Txt Value Actual            :  " +actBinBalanceQty +         " Value Expected : " + expBinBalanceQty);
				
			System.out.println("Bin Search Value Actual                 :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
			System.out.println("Bin Search Btn Value Actual             :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
			System.out.println("Bin Auto Allocate Btn Value Actual      :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
			System.out.println("Bin Pick Btn Value Actual               :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
			System.out.println("Bin Cancel Btn Value Actual             :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
								
			if(actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && actBinTotalQty.equalsIgnoreCase(expBinTotalQty)
					&& actBinBaseUom.endsWith(expBinBaseUom) && actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty))
			{
				System.out.println("Test Pass : Bin Popup Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 90, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Bin Popup NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 90, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
	    {
			excelReader.setExceptionInExcel(xlfile, xlSheetName, 90, 10, e.getMessage());
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	   	 	return false;
	    }	
	 }


	  
	  
	  public boolean checkSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOkInOSVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
			
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_1stColumn));
			getAction().doubleClick(binselect2ndRow_1stColumn).build().perform();
						
			String actBinTotalQty           = binTotalQty.getAttribute("value");
			String actBinBaseUom            = binBaseUOM.getText();
			String actBinBalanceQty         = binBalanceTxt.getAttribute("value");	
			String actBinSum                = binSumInward.getText();
		
			String expBinTotalQty           = excelReader.getCellData(xlSheetName, 100, 7);
			String expBinBaseUom            = excelReader.getCellData(xlSheetName, 101, 7);
			String expBinBalanceQty         = excelReader.getCellData(xlSheetName, 102, 7);
			String expBinSum                = excelReader.getCellData(xlSheetName, 103, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 100, 8, actBinTotalQty);
			excelReader.setCellData(xlfile, xlSheetName, 101, 8, actBinBaseUom);
			excelReader.setCellData(xlfile, xlSheetName, 102, 8, actBinBalanceQty);
			excelReader.setCellData(xlfile, xlSheetName, 103, 8, actBinSum);
						
			boolean actBinSearchTxt         = binSearchTxt.isDisplayed();
			boolean actBinSearchBtn         = binSearchBtn.isDisplayed();
			boolean actBinAutoAllocateBtn   = binAutoAllocateBtn.isDisplayed();
			boolean actBinPickBtn           = binPickBtn.isDisplayed();
			boolean actBinCancelBtn         = binCancelBtn.isDisplayed();
			boolean actBinOkBtn             = binOkBtn.isEnabled();
			
			boolean expBinSearchTxt         = true;
			boolean expBinSearchBtn         = true;
			boolean expBinAlternateCategory = true;
			boolean expBinAutoAllocateBtn   = true;
			boolean expBinPickBtn           = true;
			boolean expBinCancelBtn         = true;
			boolean expBinOkBtn             = true;
			
			int binInwardGridListCount = binInwardGridList.size();
			
			ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			
			for(int i=0;i<binInwardGridListCount;i++)
			{
				String data = binInwardGridList.get(i).getText();
				binInwardGridListArray.add(data);
			}
						
			String actbinInwardGridList=binInwardGridListArray.toString();
			
			String expbinInwardGridList=excelReader.getCellData(xlSheetName, 99, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 99, 8, actbinInwardGridList);
			
			System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
						
			boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
					            && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
			
			String actResult = Boolean.toString(actMethod);
			
			excelReader.setCellData(xlfile, xlSheetName, 98, 8, actResult.toUpperCase());
		
			System.out.println("Bin Search Value Actual                     :  " + actBinSearchTxt       +         " Value Expected : " + expBinSearchTxt);
			System.out.println("Bin Search Btn Value Actual                 :  " + actBinSearchBtn       +         " Value Expected : " + expBinSearchBtn);
			System.out.println("Bin Auto Allocate Btn Value Actual          :  " + actBinAutoAllocateBtn +         " Value Expected : " + expBinAutoAllocateBtn);
			System.out.println("Bin Pick Btn Value Actual                   :  " + actBinPickBtn         +         " Value Expected : " + expBinPickBtn);
			System.out.println("Bin Cancel Btn Value Actual                 :  " + actBinCancelBtn       +         " Value Expected : " + expBinCancelBtn);
			System.out.println("Bin Ok Button                               :  " + actBinOkBtn           +         " Value Expected : " + expBinOkBtn);	
			System.out.println("Bin Total Qty Value Actual                  :  " + actBinTotalQty        +         " Value Expected : " + expBinTotalQty);
			System.out.println("Bin Sum of To Be Allocated Qty Value Actual :  " + actBinSum             +         " Value Expected : " + expBinSum);
			System.out.println("Bin Base Uom Value Actual            	    :  " + actBinBaseUom         +         " Value Expected : " + expBinBaseUom);
			System.out.println("Bin Balance Txt Value Actual          		:  " + actBinBalanceQty      +         " Value Expected : " + expBinBalanceQty);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
			binOkBtn.click();
			
			String actBinName      = excelReader.getCellData(xlSheetName, 104, 7);
			String expBinName      = select2ndRow_7thColumn.getText();
			
			excelReader.setCellData(xlfile, xlSheetName, 104, 8, actBinName);
			
			System.out.println("Bin Column in Voucher Value Actual          : " + actBinName +              " Value Exepected  : " + expBinName);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
					
			if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
					
					&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
					&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)
					
					&& actBinSum.equalsIgnoreCase(expBinSum)
					
					&& select2ndRow_7thColumn.getText().equalsIgnoreCase(actBinName))
				
			{
				System.out.println("Selected Bin And Ok Btn Not Enabled");
				excelReader.setCellData(xlfile, xlSheetName, 98, 9, resPass);
				return true;
				
			}
			else
			{
				System.out.println("Not Selected Bin And Ok Btn Not Enabled");
				excelReader.setCellData(xlfile, xlSheetName, 98, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
	    {
			excelReader.setExceptionInExcel(xlfile, xlSheetName, 98, 10, e.getMessage());
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	   	 	return false;
	    }	
	  }
		

	  


	  
	  
	  @FindBy(xpath="//tbody[@id='id_body_23_table_data_body']/tr/td")
	  private static List<WebElement> itemListCount;
	  
	  @FindBy (xpath="//input[@id='RM_RMANO']")
	  private static WebElement rma_EnterRMA;
	  
	  @FindBy(xpath="//input[@id='id_body_38']")
	  private static WebElement  enter_RMA;
	  
	  
	  public boolean checkRMAPopUpScreenbyInputRMAItemInThirdRowInOSVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {			
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
			select3rdRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys("WA COGS ITEM");
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.ENTER);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			String actUnitsColumnSelectingRMAProduct = select3rdRow_2ndColumn.getText();
			String expUnitsColumnSelectingRMAProduct = excelReader.getCellData(xlSheetName, 170, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 170, 8, actUnitsColumnSelectingRMAProduct);
			
			System.out.println("Units Column Value is display On Select       : " + actUnitsColumnSelectingRMAProduct +  "  Value Expected : " + expUnitsColumnSelectingRMAProduct);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_3rdColumn));
			select3rdRow_3rdColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.click();
			enter_Quantity.clear();
			enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 174, 6));
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.click();
			enter_Rate.clear();
			enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 175, 6));
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));
			
			boolean actRmaSerialNumberTxtField     = rmaSerialNumberTxtField.isDisplayed();
			boolean actRmaQuantityTxtField         = rmaQuantityTxtField.isDisplayed();
			boolean actRmaAddBtn                   = rmaAddBtn.isDisplayed();
			boolean actRmaNumberofItemsLabel       = rmaNumberofItemsLabel.isDisplayed();
			boolean actRmaTableHeadingRMA          = rmaTableHeadingRMA.isDisplayed();
			boolean actRmaTableHeadingDocumentNo   = rmaTableHeadingDocumentNo.isDisplayed();
			boolean actRmaTableHeadingDocumentDate = rmaTableHeadingDocumentDate.isDisplayed();
			boolean actRmaClearBtn                 = rmaClearBtn.isDisplayed();
			boolean actRmaOkBtn                    = rmaOkBtn.isDisplayed();
			boolean actRmaCancelBtn                = rmaCancelBtn.isDisplayed();
			boolean actRmaCloseBtn                 = rmaCloseBtn.isDisplayed();
			
			boolean exprmaSerialNumberTxtField     = true;
			boolean exprmaQuantityTxtField         = true;
			boolean exprmaAddBtn                   = true;
			boolean exprmaNumberofItemsLabel       = true;
			boolean exprmaTableHeadingRMA          = true;
			boolean exprmaTableHeadingDocumentNo   = true;
			boolean exprmaTableHeadingDocumentDate = true;
			boolean exprmaClearBtn                 = true;
			boolean exprmaOkBtn                    = true;
			boolean exprmaCancelBtn                = true;
			boolean exprmaCloseBtn                 = true;
			
			boolean actMethod = actRmaSerialNumberTxtField==exprmaSerialNumberTxtField && actRmaQuantityTxtField==exprmaQuantityTxtField  && actRmaAddBtn==exprmaAddBtn
								&& actRmaNumberofItemsLabel==exprmaNumberofItemsLabel && actRmaNumberofItemsLabel==exprmaTableHeadingRMA
								&& actRmaTableHeadingDocumentNo==exprmaTableHeadingDocumentNo && actRmaTableHeadingDocumentDate==exprmaTableHeadingDocumentDate
								&& actRmaClearBtn==exprmaClearBtn && actRmaOkBtn==exprmaOkBtn && actRmaCancelBtn==exprmaCancelBtn && actRmaCloseBtn==exprmaCloseBtn;
			
			String actResult = Boolean.toString(actMethod);
			
			excelReader.setCellData(xlfile, xlSheetName, 174, 8, actResult.toUpperCase());
				
			System.out.println("Rma Serial Number Text Field 	   : " + actRmaSerialNumberTxtField	    +   "  Value Expected : " + exprmaSerialNumberTxtField);
			System.out.println("Rma Qty Field              	 	   : " + actRmaQuantityTxtField		    +   "  Value Expected : " + exprmaQuantityTxtField);
			System.out.println("Rma Add Button 					   : " + actRmaAddBtn				    +   "  Value Expected : " + exprmaAddBtn);
			System.out.println("Rma Number Of Items 			   : " + actRmaNumberofItemsLabel	    +   "  Value Expected : " + exprmaNumberofItemsLabel);
			System.out.println("Rma Table heading Rma  			   : " + actRmaTableHeadingRMA		    +   "  Value Expected : " + exprmaTableHeadingRMA);
			System.out.println("Rma Table Heading Document Number  : " + actRmaTableHeadingDocumentNo   +   "  Value Expected : " + exprmaTableHeadingDocumentNo);
			System.out.println("Rma Table Heading Document Date    : " + actRmaTableHeadingDocumentDate +   "  Value Expected : " + exprmaTableHeadingDocumentDate);
			System.out.println("Rma Clear Button                   : " + actRmaClearBtn				    +   "  Value Expected : " + exprmaClearBtn);
			System.out.println("Rma Ok Button                      : " + actRmaOkBtn					+   "  Value Expected : " + exprmaOkBtn);
			System.out.println("Rma Cancel Button                  : " + actRmaCancelBtn				+   "  Value Expected : " + exprmaCancelBtn);
			System.out.println("Rma Close Button  				   : " + actRmaCloseBtn				    +   "  Value Expected : " + exprmaCloseBtn);
			
			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
			rmaSerialNumberTxtField.click();
			rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 199, 6));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
			rmaAddBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
			rmaSerialNumberTxtField.click();
			rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 200, 6));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
			rmaAddBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
			rmaSerialNumberTxtField.click();
			rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 201, 6));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
			rmaAddBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow1Column1));
			String actRmavalueR1=rma_EnterRMA.getAttribute("value");
			String expRmavalueR1=excelReader.getCellData(xlSheetName, 200, 7);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow2Column1));
			String actRmavalueR2=rmaTableRow2Column1.getText();
			String expRmavalueR2=excelReader.getCellData(xlSheetName, 201, 7);
			
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow3Column1));
			String actRmavalueR3=rmaTableRow3Column1.getText();
			String expRmavalueR3=excelReader.getCellData(xlSheetName, 202, 7);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow4Column1));
			String actRmavalueR4=rmaTableRow4Column1.getText();
			String expRmavalueR4=excelReader.getCellData(xlSheetName, 203, 7);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow5Column1));
			String actRmavalueR5=rmaTableRow5Column1.getText();
			String expRmavalueR5=excelReader.getCellData(xlSheetName, 204, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 200, 8, actRmavalueR1);
			excelReader.setCellData(xlfile, xlSheetName, 201, 8, actRmavalueR2);
			excelReader.setCellData(xlfile, xlSheetName, 202, 8, actRmavalueR3);
			excelReader.setCellData(xlfile, xlSheetName, 203, 8, actRmavalueR4);
			excelReader.setCellData(xlfile, xlSheetName, 204, 8, actRmavalueR5);
			
			System.out.println("************************************* checkInputingDifferentSerialNumbers  *********************************");
			System.out.println("Rma value Row 1 In Rma Pop Up Different Serial No : "+actRmavalueR1+"  Value Expected : "+expRmavalueR1);
			System.out.println("Rma value Row 2 In Rma Pop Up Different Serial No : "+actRmavalueR2+"  Value Expected : "+expRmavalueR2);
			System.out.println("Rma value Row 3 In Rma Pop Up Different Serial No : "+actRmavalueR3+"  Value Expected : "+expRmavalueR3);
			System.out.println("Rma value Row 4 In Rma Pop Up Different Serial No : "+actRmavalueR4+"  Value Expected : "+expRmavalueR4);
			System.out.println("Rma value Row 5 In Rma Pop Up Different Serial No : "+actRmavalueR5+"  Value Expected : "+expRmavalueR5);		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
			rmaOkBtn.click();
			
			
			String actGetRMANosInVoucher =enter_RMA.getAttribute("value");
			String expGetRMANosInVoucher ="R1,R2,M1,M2,A1,A2,A3,A4,A5,A6";
			
			System.out.println("Rma value Row 3 In Rma Pop Up Different Serial No : "+actGetRMANosInVoucher+"  Value Expected : "+expGetRMANosInVoucher);
			
			System.out.println(enter_RMA.getAttribute("value"));
			System.out.println(enter_RMA.getText());
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
			enter_RMA.sendKeys(Keys.TAB);
			
			
			if((actRmavalueR1.equalsIgnoreCase(expRmavalueR1) && actRmavalueR2.equalsIgnoreCase(expRmavalueR2)
					&& actRmavalueR3.equalsIgnoreCase(expRmavalueR3) && actRmavalueR4.equalsIgnoreCase(expRmavalueR4)
					&& actRmavalueR5.equalsIgnoreCase(expRmavalueR5) 
					
					&& actMethod==true)
					
					&& actGetRMANosInVoucher.equalsIgnoreCase(expGetRMANosInVoucher))
			{
				System.out.println("***Test Pass: RMA Popup Screen Appeared with all the Options***");
				excelReader.setCellData(xlfile, xlSheetName, 174, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("***Test Fail: RMA Popup Screen NOT Appeared with all the Options***");
				excelReader.setCellData(xlfile, xlSheetName, 174, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
	    {
			excelReader.setExceptionInExcel(xlfile, xlSheetName, 98, 10, e.getMessage());
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	   	 	return false;
	    }
	}		

	  
	  


	  
	  public boolean checkOpeningStocksNewAddingStockItemInFourthRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
			
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
			
		 try
	 	 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
			enter_ItemTxt.sendKeys(Keys.SPACE);
			
			int itemcount=itemListCount.size();
			
			System.err.println(itemcount);
				
			for(int i=0 ; i < itemcount ;i++)
			{
				String data=itemListCount.get(i).getText();
				
				if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 219, 6)))
				{
					itemListCount.get(i).click();
					
					break;
				}
			}
				
			enter_ItemTxt.sendKeys(Keys.TAB);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
			enter_UnitTxt.sendKeys(Keys.TAB);
			
			String actdata            = select4thRow_2ndColumn.getText();
			String expdata            = excelReader.getCellData(xlSheetName, 220, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 220, 8, actdata);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
			enter_Quantity.click();
			enter_Quantity.clear();
			enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 220, 6));
			enter_Quantity.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.click();
			enter_Rate.clear();
			enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 221, 6));
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_3rdColumn));
			String act1            = select4thRow_3rdColumn.getText();
			String act2            = select4thRow_4thColumn.getText();
			String act3            = select4thRow_5thColumn.getText();
		
			String exp1,exp2,exp3,exp4;
			
			exp1                   = excelReader.getCellData(xlSheetName, 221, 7);
			exp2                   = excelReader.getCellData(xlSheetName, 222, 7);
			exp3                   = excelReader.getCellData(xlSheetName, 223, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 221, 8, act1);
			excelReader.setCellData(xlfile, xlSheetName, 222, 8, act2);
			excelReader.setCellData(xlfile, xlSheetName, 223, 8, act3);
		
			if(actdata.equalsIgnoreCase(expdata) && act1.equalsIgnoreCase(exp1) && act2.equalsIgnoreCase(exp2)
					&& act3.equalsIgnoreCase(exp3))
			{
				System.out.println("Test Pass : Data Entered in Fourth Row");
				excelReader.setCellData(xlfile, xlSheetName, 219, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Data NOT Entered in Fourth Row");
				excelReader.setCellData(xlfile, xlSheetName, 219, 9, resFail);
				return false;
			}		
		}
		catch (Exception e) 
		{
			excelReader.setExceptionInExcel(xlfile, xlSheetName, 219, 10, e.getMessage());
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			return false;
		} 
	  }

	  
	  
	  


	  
	  
	  
	  
	  
	  public boolean checkOpeningStocksNewVoucherSave() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
      {
			
		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
			
		  try
		  {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	        String docno=documentNumberTxt.getAttribute("value");
			
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			boolean actVoucherSaveMessageWithDocumentNo  = checkVoucherSavingMessage(docno);
			boolean expVoucherSaveMessageWithDocumentNo  = true;
			
			boolean actMethod = actVoucherSaveMessageWithDocumentNo==expVoucherSaveMessageWithDocumentNo; 
			
			String actResult = Boolean.toString(actMethod);
			
			excelReader.setCellData(xlfile, xlSheetName, 224, 8, actResult.toUpperCase());
			
			System.out.println("Voucher Saving Message With Document No :  " + actVoucherSaveMessageWithDocumentNo + " Value Expected : "+ expVoucherSaveMessageWithDocumentNo);
			
			if(actMethod==true)
			{
				System.out.println("Test Pass : Voucher Saved Successfully");
							
				excelReader.setCellData(xlfile, xlSheetName, 224, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Voucher NOT Saved Successfully");
						
				excelReader.setCellData(xlfile, xlSheetName, 224, 9, resFail);
				return false;
			}
		  }
		  catch (Exception e) 
		  {
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 224, 10, e.getMessage());
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			  return false;
		  } 
		}
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	     //Editing the Opening Stocks New Voucher

	  
  	    @FindBy(xpath="//span[@class='col-xs-6 icon-expand icon-font6 no_padding_left_right theme_color-inverse']")
		private static WebElement  new_footerExpandBtn;
	  

	    @FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_26']")
		private static WebElement  QtyAmount;

	    
	    @FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_28']")
		private static WebElement  GrossAmount;

	    @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr/td")
		  private static List<WebElement> voucherGridBodyList;

	  
		public boolean checkOpeningStocksNewSavedVoucherOnClickPreviousInEntryPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
		
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
				previousBtn.click();
				
				boolean loading=checkLoadingMessage();
				
				System.out.println("VoucherLoadingMessage  : "+loading +" Value Expected : "+"TRUE");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				documentNumberTxt.click();
				
				String actdocNumber,expdocNumber;
				
				actdocNumber=documentNumberTxt.getAttribute("value");
				expdocNumber=excelReader.getCellData(xlSheetName, 226, 7);
				
				System.out.println("Opening stocks Voucher Doucmnet No  : " + actdocNumber + " Value Expected : " + expdocNumber);
				
				excelReader.setCellData(xlfile, xlSheetName, 226, 8, actdocNumber);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
				wareHouseTxt.click();
		
				String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
				String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 227, 7);
				
				System.out.println("Opening stocks Voucher Warehouse  : " + actOsVoucherWarehouse + " Value Expected : " + expOsVoucherWarehouse);
				
				excelReader.setCellData(xlfile, xlSheetName, 227, 8, actOsVoucherWarehouse);
								
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_footerExpandBtn));
				new_footerExpandBtn.click();
				
				String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
				
				String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
		
				expOsVoucherFooterQty="21.00";
				expOsVoucherFooterGross="302.00";
				expOsVoucherFooterNet="302.00";
							
				System.out.println(netAmount.getText());
				System.out.println(QtyAmount.getText());
				System.out.println(GrossAmount.getText());
			
				actOsVoucherFooterQty=QtyAmount.getText();
				actOsVoucherFooterGross=GrossAmount.getText();
				actOsVoucherFooterNet=netAmount.getText();
				
				excelReader.setCellData(xlfile, xlSheetName, 229, 8, actOsVoucherFooterQty);
				excelReader.setCellData(xlfile, xlSheetName, 230, 8, actOsVoucherFooterGross);
				excelReader.setCellData(xlfile, xlSheetName, 231, 8, actOsVoucherFooterNet);
				
				int voucherGridBodyListCount = voucherGridBodyList.size();
				 
				 ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
				 
				 for(int i=0;i<voucherGridBodyListCount;i++)
				 {
					 if(i==8)
					 {
						 String data ="Expiry Date";
						 voucherGridBodyListArray.add(data);
					 }
					 else
					 {
						 String data = voucherGridBodyList.get(i).getText();
						 voucherGridBodyListArray.add(data);
					 }
				 }
				 
				 
				 String actvoucherGridBodyList=voucherGridBodyListArray.toString();
				 
				 String expvoucherGridBodyList="[1, BATCH BR ITEM, Dozs, 5.00, 9.00, 45.00, OSHYDBR1, , Expiry Date, , 2, FIFO COGS ITEM, Dozs, 1.00, 12.00, 12.00, , Bin4, , , 3, WA COGS ITEM, Pcs, 10.00, 20.00, 200.00, , , , A1,A2,A3,A4,A5,A6,M1,M2,R1,R2, 4, STD RATE COGS ITEM, Dozs, 5.00, 9.00, 45.00, , , , , 5, , , , , , , , , ]";
				 
				 excelReader.setCellData(xlfile, xlSheetName, 228, 8, actvoucherGridBodyList);
				 
				 System.out.println("voucherGridBodyList Actual   : " + actvoucherGridBodyList);
				 System.out.println("voucherGridBodyList Expected : " + expvoucherGridBodyList);
			
				 System.out.println("osdocNumber value actual                :  " + actdocNumber            + " value expected  " + expdocNumber);		         
		         System.out.println("osVoucherWarehouse value actual         :  " + actOsVoucherWarehouse   + " value expected  " + expOsVoucherWarehouse);
		         System.out.println("osVoucherFooterQty value actual         :  " + actOsVoucherFooterQty   + " value expected  " + expOsVoucherFooterQty);
		         System.out.println("osVoucherFooterGross value actual       :  " + actOsVoucherFooterGross + " value expected  " + expOsVoucherFooterGross);
		         System.out.println("osVoucherFooterNet value actual         :  " + actOsVoucherFooterNet   + " value expected  " + expOsVoucherFooterNet);
					
				if(actdocNumber.equalsIgnoreCase(expdocNumber)
						&& actOsVoucherWarehouse.equalsIgnoreCase(expOsVoucherWarehouse)
						
						&& actOsVoucherFooterQty.equalsIgnoreCase(expOsVoucherFooterQty) && actOsVoucherFooterGross.equalsIgnoreCase(expOsVoucherFooterGross) 
						&& actOsVoucherFooterNet.equalsIgnoreCase(expOsVoucherFooterNet) && actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
				{
					System.out.println("Test Pass : Saved Data is As Expected");
				
					excelReader.setCellData(xlfile, xlSheetName, 225, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Saved Data is NOT As Expected");
					
					excelReader.setCellData(xlfile, xlSheetName, 225, 9, resFail);
					return false;
				
				}
			}
			catch (Exception e) 
			{
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 225, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				return false;
			}
		}	
		

		

		  public boolean checkOpeningStocksNewVoucherOnClickCloseBtnInEntryPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
				new_CloseBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			
				boolean actHomePageNewBtnIsDisplayed = newBtn.isDisplayed();
				boolean actHomePageEditBtn           = editBtn.isDisplayed();		
				boolean actHomePagePrintBtn          = printBtn.isDisplayed();
				boolean actHomePageDeleteBtn         = deleteBtn.isDisplayed();
				boolean actHomePageSuspendBtn        = suspendBtn.isDisplayed();
				boolean actHomePagePrintBarcodeBtn   = printBarCodeBtn.isDisplayed();
				boolean actHomePageExportXMLBtn      = exportToXMLBtn.isDisplayed();
				boolean actHomePageSettingsBtn       = settingsBtn.isDisplayed();
				boolean actHomePageCloseBtn          = homeCloseBtn.isDisplayed();
				boolean actHomePageGridCheckBox      = grid_HeaderChkBox.isDisplayed();
				boolean actHomePageSortingBtn        = sortingBtn.isDisplayed();
				boolean actHomePageCreateViewBn      = createViewBtn.isDisplayed();
				boolean actHomePageCustomizeBtn      = customizeBtn.isDisplayed();
				boolean actHomePageFilterBtn         = filterBtn.isDisplayed();
				boolean actHomePageRefreshBtn        = refreshBtn.isDisplayed();
				boolean actHomePageOptionsBtn        = optionsBtn.isDisplayed();
				boolean actHomePageExportBtn         = exportBtn.isDisplayed();
				
				boolean expHomePageNewBtnIsDisplayed = true;	
				boolean expHomePageEditBtn           = true;
				boolean expHomePagePrintBtn          = true;
				boolean expHomePageDeleteBtn         = true;
				boolean expHomePageSuspendBtn        = true;
				boolean expHomePagePrintBarcodeBtn   = true;
				boolean expHomePageExportXMLBtn      = true;
				boolean expHomePageSettingsBtn       = true;
				boolean expHomePageCloseBtn          = true;
				boolean expHomePageGridCheckBox      = true;
				boolean expHomePageSortingBtn        = true;
				boolean expHomePageCreateViewBn      = true;
				boolean expHomePageCustomizeBtn      = true;
				boolean expHomePageFilterBtn         = true;
				boolean expHomePageRefreshBtn        = true;
				boolean expHomePageOptionsBtn        = true;
				boolean expHomePageExportBtn         = true;
				
				System.out.println("Home Page New Btn Value Actual           : " + actHomePageNewBtnIsDisplayed+ "  Value Expected : " + expHomePageNewBtnIsDisplayed);
				System.out.println("Home Page Edit Btn Value Actual          : " + actHomePageEditBtn+           "  Value Expected : " + expHomePageEditBtn);
				System.out.println("Home Page Print Btn Value Actual         : " + actHomePagePrintBtn+          "	Value Expected : " + expHomePagePrintBtn);
				System.out.println("Home Page Delete Btn Value Actual        : " + actHomePageDeleteBtn+         "	Value Expected : " + expHomePageDeleteBtn);
				System.out.println("Home Page Suspend Btn Value Actual       : " + actHomePageSuspendBtn+        "	Value Expected : " + expHomePageSuspendBtn);
				System.out.println("Home Page Print Barcode Btn Value Actual : " + actHomePagePrintBarcodeBtn+   "	Value Expected : " + expHomePagePrintBarcodeBtn);
				System.out.println("Home Page Export XML Btn Value Actual    : " + actHomePageExportXMLBtn+      "	Value Expected : " + expHomePageExportXMLBtn);
				System.out.println("Home Page Settings Btn Value Actual      : " + actHomePageSettingsBtn+       "	Value Expected : " + expHomePageSettingsBtn);
				System.out.println("Home Page Close Btn Value Actual         : " + actHomePageCloseBtn+          "	Value Expected : " + expHomePageCloseBtn);
				System.out.println("Home Page Grid check Value Actual        : " + actHomePageGridCheckBox+      "	Value Expected : " + expHomePageGridCheckBox);
				System.out.println("Home Page Sorting Btn Value Actual       : " + actHomePageSortingBtn+        "	Value Expected : " + expHomePageSortingBtn);
				System.out.println("Home Page Create View Btn Value Actual   : " + actHomePageCreateViewBn+      "	Value Expected : " + expHomePageCreateViewBn);
				System.out.println("Home Page Customize Btn Value Actual     : " + actHomePageCustomizeBtn+      "	Value Expected : " + expHomePageCustomizeBtn);
				System.out.println("Home Page Filter check Value Actual      : " + actHomePageFilterBtn+         "	Value Expected : " + expHomePageFilterBtn);
				System.out.println("Home Page Refesh Btn Value Actual        : " + actHomePageRefreshBtn+        "	Value Expected : " + expHomePageRefreshBtn);
				System.out.println("Home Page Options Btn Value Actual       : " + actHomePageOptionsBtn+        "	Value Expected : " + expHomePageOptionsBtn);
				System.out.println("Home Page Export Btn Value Actual        : " + actHomePageExportBtn+         "  Value Expected : " + expHomePageExportBtn);
				
				int count				                 = openingStocksNewToolBarButtons.size();
				
				ArrayList<String> actbuttons             = new ArrayList<String>();
				
				for (int i = 0; i < count; i++) 
				{
					String data                          = openingStocksNewToolBarButtons.get(i).getText();
					actbuttons.add(data);
				}
				    
				String actopeningStocksNewToolBarButtons = actbuttons.toString();
				String expopeningStocksNewToolBarButtons = excelReader.getCellData(xlSheetName, 233, 7);
			
				System.out.println("actopeningStocksNewToolBarButtons  : " + actopeningStocksNewToolBarButtons);
				System.out.println("expopeningStocksNewToolBarButtons  : " + expopeningStocksNewToolBarButtons);
				
				excelReader.setCellData(xlfile, xlSheetName, 233, 8, actopeningStocksNewToolBarButtons);	
				
				String actsetAsDefaultView		=	setAsDefaultView.getText();
				String expsetAsDefaultView		=	excelReader.getCellData(xlSheetName, 234, 7);
				excelReader.setCellData(xlfile, xlSheetName, 234, 8, actsetAsDefaultView);
				
				
				//Ribbon Control Icons
		        int count1		= headingOptions.size();
				
				ArrayList<String> headingButtons = new ArrayList<String>();
				
				for (int i = 1; i < count1; i++) 
				{
					String data=headingOptions.get(i).getAttribute("title");
					
					headingButtons.add(data);
				}
				
				String actHeadingButtons = headingButtons.toString();
				String expHeadingButtons = excelReader.getCellData(xlSheetName, 235, 7);
				excelReader.setCellData(xlfile, xlSheetName, 235, 8, actHeadingButtons);
				
				
				System.out.println("actopeningStocksNewHeadingButtons  : " + actHeadingButtons);
				System.out.println("expopeningStocksNewHeadingButtons  : " + expHeadingButtons);
				
				//Home Page Column Headings
		        int headerTxtCount		= headerTxtList.size();
				
				ArrayList<String> headerTxt = new ArrayList<String>();
				
				for (int i = 2; i < headerTxtCount; i++) 
				{
					String data=headerTxtList.get(i).getText();
					headerTxt.add(data);
				}
				
				String actHeaderTxt = headerTxt.toString();
				String expHeaderTxt = excelReader.getCellData(xlSheetName, 236, 7);
				excelReader.setCellData(xlfile, xlSheetName, 236, 8, actHeaderTxt);
				
				
				System.out.println("actopeningStocksNewHomePageColumnsButtons  : " + actHeaderTxt);
				System.out.println("expopeningStocksNewHomePageColumnsButtons  : " + expHeaderTxt);
				
				if(actHomePageNewBtnIsDisplayed==expHomePageNewBtnIsDisplayed  && actHomePageEditBtn==expHomePageEditBtn && actHomePagePrintBtn==expHomePagePrintBtn
						&& actHomePageDeleteBtn==expHomePageDeleteBtn  && actHomePageSuspendBtn==expHomePageSuspendBtn 
					    && actHomePagePrintBarcodeBtn==expHomePagePrintBarcodeBtn && actHomePageExportXMLBtn==expHomePageExportXMLBtn
						&& actHomePageSettingsBtn==expHomePageSettingsBtn && actHomePageCloseBtn==expHomePageCloseBtn && actHomePageGridCheckBox==expHomePageGridCheckBox
						&& actHomePageSortingBtn==expHomePageSortingBtn && actHomePageCreateViewBn==expHomePageCreateViewBn && actHomePageCustomizeBtn==expHomePageCustomizeBtn
						&& actHomePageFilterBtn==expHomePageFilterBtn && actHomePageRefreshBtn==expHomePageRefreshBtn && actHomePageOptionsBtn==expHomePageOptionsBtn
						&& actHomePageExportBtn==expHomePageExportBtn  
						&& actopeningStocksNewToolBarButtons.equalsIgnoreCase(expopeningStocksNewToolBarButtons)
						&& actHeadingButtons.equalsIgnoreCase(expHeadingButtons)
						&& actHeaderTxt.equalsIgnoreCase(expHeaderTxt))
				{
					System.out.println("Test Pass : HomeScreen Options Are Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 232, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : HomeScreen Options Are NOT Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 232, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
			{
				
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 232, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				return false;
			}
		  }
			
		  
			@FindBy(xpath="//tbody[@id='RMA_Table_body']/tr/td[2]")
		    private static List<WebElement> rmaInwardPopRmaNoList;
			
			@FindBy(xpath="//*[@id='row_1']/td[2]")
			private static WebElement ItemFirstRowBalance;
		  
		  public boolean checkOpeningStocksNewVoucherOnClickEditButtonInHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
		    excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
			
			try
			{
			
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
				grid_ChkBox1.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editBtn));
				editBtn.click();
				
				boolean loading=checkLoadingMessage();
				
				System.out.println("VoucherLoadingMessage  : "+loading +" Value Expected : "+"TRUE");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				documentNumberTxt.click();
				
				String actdocNumber,expdocNumber;
				
				actdocNumber=documentNumberTxt.getAttribute("value");
				expdocNumber=excelReader.getCellData(xlSheetName, 238, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 238, 8, actdocNumber);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
				wareHouseTxt.click();
		
				String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
				String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 239, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 239, 8, actOsVoucherWarehouse);
						
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_footerExpandBtn));
				new_footerExpandBtn.click();
			
				String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
							
				String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
				
				expOsVoucherFooterQty="21.00";
				expOsVoucherFooterGross="302.00";
				expOsVoucherFooterNet="302.00";
				
				System.out.println(netAmount.getText());
				System.out.println(QtyAmount.getText());
				System.out.println(GrossAmount.getText());
						
				actOsVoucherFooterQty=QtyAmount.getText();
				actOsVoucherFooterGross=GrossAmount.getText();
				actOsVoucherFooterNet=netAmount.getText();
				
				excelReader.setCellData(xlfile, xlSheetName, 241, 8, actOsVoucherFooterQty);
				excelReader.setCellData(xlfile, xlSheetName, 242, 8, actOsVoucherFooterGross);
				excelReader.setCellData(xlfile, xlSheetName, 243, 8, actOsVoucherFooterNet);
				
				int voucherGridBodyListCount = voucherGridBodyList.size();
				 
				 ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
				 
				 for(int i=0;i<voucherGridBodyListCount;i++)
				 {
					 if(i==8)
					 {
						 String data ="Expiry Date";
						 voucherGridBodyListArray.add(data);
					 }
					 else
					 {
						 String data = voucherGridBodyList.get(i).getText();
						 voucherGridBodyListArray.add(data);
					 }
				 }
				 
				 String actvoucherGridBodyList=voucherGridBodyListArray.toString();
				 
				 String expvoucherGridBodyList="[1, BATCH BR ITEM, Dozs, 5.00, 9.00, 45.00, OSHYDBR1, , Expiry Date, , 2, FIFO COGS ITEM, Dozs, 1.00, 12.00, 12.00, , Bin4, , , 3, WA COGS ITEM, Pcs, 10.00, 20.00, 200.00, , , , A1,A2,A3,A4,A5,A6,M1,M2,R1,R2, 4, STD RATE COGS ITEM, Dozs, 5.00, 9.00, 45.00, , , , , 5, , , , , , , , , ]";
				 
				 excelReader.setCellData(xlfile, xlSheetName, 240, 8, actvoucherGridBodyList);
				 
				 System.out.println("voucherGridBodyList Actual   : " + actvoucherGridBodyList);
				 System.out.println("voucherGridBodyList Expected : " + expvoucherGridBodyList);
			
				
				 System.out.println("osdocNumber                 :  " + actdocNumber  +"   " + expdocNumber);
		        
		         
		         System.out.println("osVoucherWarehouse          :  " + actOsVoucherWarehouse +"     " + expOsVoucherWarehouse);
		         System.out.println("osVoucherFooterQty          :  " + actOsVoucherFooterQty  +"   " + expOsVoucherFooterQty);
		         System.out.println("osVoucherFooterGross        :  " + actOsVoucherFooterGross +"   " + expOsVoucherFooterGross);
		         System.out.println("osVoucherFooterNet          :  " + actOsVoucherFooterNet +"   " + expOsVoucherFooterNet);
			
				
				if(actdocNumber.equalsIgnoreCase(expdocNumber)
						&& actOsVoucherWarehouse.equalsIgnoreCase(expOsVoucherWarehouse)
						
						&& actOsVoucherFooterQty.equalsIgnoreCase(expOsVoucherFooterQty) && actOsVoucherFooterGross.equalsIgnoreCase(expOsVoucherFooterGross) 
						&& actOsVoucherFooterNet.equalsIgnoreCase(expOsVoucherFooterNet) && actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
				{
					System.out.println("Test Pass : Saved Data is As Expected");
				
					excelReader.setCellData(xlfile, xlSheetName, 237, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Saved Data is NOT As Expected");
					
					excelReader.setCellData(xlfile, xlSheetName, 237, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
			{
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 237, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				return false;
			}
			
		}	
			
		  
		  
		  
		  
		  //----------------------------------------------------------  Test the Editing Voucher ------------------------------------------------------------------------
		  
		  
		  
		  public boolean checkEditOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		    try
		    {	
		       	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
				select1stRow_3rdColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.click();
				enter_Quantity.clear();
				enter_Quantity.sendKeys("1");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.click();
				enter_Rate.clear();
				enter_Rate.sendKeys("10");
				enter_Rate.sendKeys(Keys.TAB);			
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
				enter_Batch.click();
				enter_Batch.clear();
				enter_Batch.sendKeys("OSHYDBRCOGS");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
				select1stRow_8thColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
				enter_Expirydate.click();
				enter_Expirydate.sendKeys(Keys.TAB);
				
				String actUnitsColumnValue  = select1stRow_2ndColumn.getText();
				String expUnitsColumnValue  = "Dozs";
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
				String actQtyR1         = select1stRow_3rdColumn.getText();
				String actRateR1        = select1stRow_4thColumn.getText();
				String actGrossR1       = select1stRow_5thColumn.getText();
				String actBatchR1       = select1stRow_6thColumn.getText();
				
				String expQtyR1         = "1.00";
				String expRateR1        = "10.00";
				String expGrossR1       = "10.00";
				String expBatchR1       = "OSHYDBRCOGS";
				
				excelReader.setCellData(xlfile, xlSheetName, 86, 8, actQtyR1);
				excelReader.setCellData(xlfile, xlSheetName, 87, 8, actRateR1);
				excelReader.setCellData(xlfile, xlSheetName, 88, 8, actGrossR1);
				excelReader.setCellData(xlfile, xlSheetName, 89, 8, actBatchR1);
				
				//System.out.println("Update Batch Item Batch Column should be blank Value Actual : " + actBatchR1UpdateValue + " Value Expected   : " + expBatchR1UpdateValue);
				System.out.println("Select Item Units Column Value Actual  : " + actUnitsColumnValue   + " Value Expected   : " + expUnitsColumnValue);

				System.out.println("Qty Row 1 Value Actual                 : " + actQtyR1              + " Value Expected   : " + expQtyR1);
				System.out.println("Rate Row 1 Value Actual                : " + actRateR1             + " Value Expected   : " + expRateR1);
				System.out.println("Gross Row 1 Value Actual               : " + actGrossR1            + " Value Expected   : " + expGrossR1);
				System.out.println("Batch Row 1 Value Actual               : " + actBatchR1            + " Value Expected   : " + expBatchR1);
			
				if(actUnitsColumnValue.equalsIgnoreCase(expUnitsColumnValue)  && actQtyR1.equalsIgnoreCase(expQtyR1) && actRateR1.equalsIgnoreCase(expRateR1)
						&& actGrossR1.equalsIgnoreCase(expGrossR1) && actBatchR1.equalsIgnoreCase(expBatchR1))		   
				{
				System.out.println("Test Pass : Bin Popup Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 244, 9, resPass);
				return true;
				}
				else
				{
					System.out.println("Test Fail : Bin Popup NOT Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 244, 9, resFail);
					return false;
				}
		    }
		    catch (Exception e) 
			{
				
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 244, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				return false;
			}
		 }
			


		  @FindBy(xpath="//input[@id='id_transaction_bins_grid_control_heading_ctrl_12']")
		  private static WebElement enter_ToBeAllocateTxt;
		  
		  
		  public boolean checkEditOpeningStocksNewVoucherInputBinFifoBinPopupOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_3rdColumn));
				select2ndRow_3rdColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.click();
				enter_Quantity.clear();
				enter_Quantity.sendKeys("2");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.click();
				enter_Rate.clear();
				enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 248, 6));
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.click();
				enter_Gross.sendKeys(Keys.TAB);
						
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
				
				boolean actBinSearch            = binSearchTxt.isDisplayed();
				boolean actBinSearchTxt         = binSearchTxt.isDisplayed();
				boolean actBinSearchBtn         = binSearchBtn.isDisplayed();
				boolean actBinAutoAllocateBtn   = binAutoAllocateBtn.isDisplayed();
				boolean actBinPickBtn           = binPickBtn.isDisplayed();
				boolean actBinCancelBtn         = binCancelBtn.isDisplayed();
				
				boolean expBinSearch            = true;
				boolean expBinSearchTxt         = true;
				boolean expBinSearchBtn         = true;
				boolean expBinAutoAllocateBtn   = true;
				boolean expBinPickBtn           = true;
				boolean expBinCancelBtn         = true;
				
				System.out.println("Entry Page Bin Search Value Actual  : " + actBinSearch + "    Value Expected   : " + expBinSearch);
				
				String actBinTotalQty           = binTotalQty.getAttribute("value");
				String actBinBaseUom            = binBaseUOM.getText();
				String actBinBalanceQty         = binBalanceTxt.getAttribute("value");
				
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
								
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList=excelReader.getCellData(xlSheetName, 248, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 248, 8, actbinInwardGridList);
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
							
				boolean actMethod = actBinSearch==expBinSearch && actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
						            && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
				
				String actResult = Boolean.toString(actMethod);
				
				excelReader.setCellData(xlfile, xlSheetName, 247, 8, actResult.toUpperCase());
					      
				String expBinTotalQty           = "24.00";
				String expBinBaseUom            = "Pcs";
				String expBinBalanceQty         = "24.00";
				
				excelReader.setCellData(xlfile, xlSheetName, 249, 8, actBinTotalQty);
				excelReader.setCellData(xlfile, xlSheetName, 250, 8, actBinBaseUom);
				excelReader.setCellData(xlfile, xlSheetName, 251, 8, actBinBalanceQty);
								       
				System.out.println("Bin Total Qty Value Actual              :  " +actBinTotalQty +           " Value Expected : " + expBinTotalQty);
				System.out.println("Bin Base Uom Value Actual               :  " +actBinBaseUom +            " Value Expected : " + expBinBaseUom);
				System.out.println("Bin Balance Txt Value Actual            :  " +actBinBalanceQty +         " Value Expected : " + expBinBalanceQty);
							
				System.out.println("Bin Search Value Actual                 :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
				System.out.println("Bin Search Btn Value Actual             :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
				System.out.println("Bin Auto Allocate Btn Value Actual      :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
				System.out.println("Bin Pick Btn Value Actual               :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
				System.out.println("Bin Cancel Btn Value Actual             :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
						
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
				binselect3rdRow_8thColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ToBeAllocateTxt));
				enter_ToBeAllocateTxt.sendKeys("24");
				enter_ToBeAllocateTxt.sendKeys(Keys.TAB);				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				String actBinName      =  select2ndRow_7thColumn.getText();
				String expBinName      = "Bin5";
			
				excelReader.setCellData(xlfile, xlSheetName, 104, 8, actBinName);
				
				System.out.println("Bin Column in Voucher Value Actual          : " + actBinName +              " Value Exepected  : " + expBinName);
				
				if(actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && actBinTotalQty.equalsIgnoreCase(expBinTotalQty)
						&& actBinBaseUom.endsWith(expBinBaseUom) && actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty) && actBinName.equalsIgnoreCase(expBinName))
				{
					System.out.println("Test Pass : Bin Popup options Are As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 247, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 247, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
			{
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 247, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				return false;
			}
		  }

	  
		  
		  
		  
		  
		  
		  public boolean checkEditRMAItemToDisplayRMAScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
			
			try
			{
								
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_3rdColumn));
				select3rdRow_3rdColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.click();
				enter_Quantity.clear();
				enter_Quantity.sendKeys("12");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.click();
				enter_Rate.clear();
				enter_Rate.sendKeys("10");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
				enter_RMA.sendKeys(Keys.SPACE);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));
				
				boolean actRmaSerialNumberTxtField     = rmaSerialNumberTxtField.isDisplayed();
				boolean actRmaQuantityTxtField         = rmaQuantityTxtField.isDisplayed();
				boolean actRmaAddBtn                   = rmaAddBtn.isDisplayed();
				boolean actRmaNumberofItemsLabel       = rmaNumberofItemsLabel.isDisplayed();
				boolean actRmaTableHeadingRMA          = rmaTableHeadingRMA.isDisplayed();
				boolean actRmaTableHeadingDocumentNo   = rmaTableHeadingDocumentNo.isDisplayed();
				boolean actRmaTableHeadingDocumentDate = rmaTableHeadingDocumentDate.isDisplayed();
				boolean actRmaClearBtn                 = rmaClearBtn.isDisplayed();
				boolean actRmaOkBtn                    = rmaOkBtn.isDisplayed();
				boolean actRmaCancelBtn                = rmaCancelBtn.isDisplayed();
				boolean actRmaCloseBtn                 = rmaCloseBtn.isDisplayed();
				
				boolean exprmaSerialNumberTxtField     = true;
				boolean exprmaQuantityTxtField         = true;
				boolean exprmaAddBtn                   = true;
				boolean exprmaNumberofItemsLabel       = true;
				boolean exprmaTableHeadingRMA          = true;
				boolean exprmaTableHeadingDocumentNo   = true;
				boolean exprmaTableHeadingDocumentDate = true;
				boolean exprmaClearBtn                 = true;
				boolean exprmaOkBtn                    = true;
				boolean exprmaCancelBtn                = true;
				boolean exprmaCloseBtn                 = true;

				System.out.println("Rma Serial Number Text Field 	   : " + actRmaSerialNumberTxtField	    +   "  Value Expected : " + exprmaSerialNumberTxtField);
				System.out.println("Rma Qty Field              	 	   : " + actRmaQuantityTxtField		    +   "  Value Expected : " + exprmaQuantityTxtField);
				System.out.println("Rma Add Button 					   : " + actRmaAddBtn				    +   "  Value Expected : " + exprmaAddBtn);
				System.out.println("Rma Number Of Items 			   : " + actRmaNumberofItemsLabel	    +   "  Value Expected : " + exprmaNumberofItemsLabel);
				System.out.println("Rma Table heading Rma  			   : " + actRmaTableHeadingRMA		    +   "  Value Expected : " + exprmaTableHeadingRMA);
				System.out.println("Rma Table Heading Document Number  : " + actRmaTableHeadingDocumentNo   +   "  Value Expected : " + exprmaTableHeadingDocumentNo);
				System.out.println("Rma Table Heading Document Date    : " + actRmaTableHeadingDocumentDate +   "  Value Expected : " + exprmaTableHeadingDocumentDate);
				System.out.println("Rma Clear Button                   : " + actRmaClearBtn				    +   "  Value Expected : " + exprmaClearBtn);
				System.out.println("Rma Ok Button                      : " + actRmaOkBtn					+   "  Value Expected : " + exprmaOkBtn);
				System.out.println("Rma Cancel Button                  : " + actRmaCancelBtn				+   "  Value Expected : " + exprmaCancelBtn);
				System.out.println("Rma Close Button  				   : " + actRmaCloseBtn				    +   "  Value Expected : " + exprmaCloseBtn);
				
				
				
				boolean actMethod = actRmaSerialNumberTxtField==exprmaSerialNumberTxtField && actRmaQuantityTxtField==exprmaQuantityTxtField  && actRmaAddBtn==exprmaAddBtn
									&& actRmaNumberofItemsLabel==exprmaNumberofItemsLabel && actRmaNumberofItemsLabel==exprmaTableHeadingRMA
									&& actRmaTableHeadingDocumentNo==exprmaTableHeadingDocumentNo && actRmaTableHeadingDocumentDate==exprmaTableHeadingDocumentDate
									&& actRmaClearBtn==exprmaClearBtn && actRmaOkBtn==exprmaOkBtn && actRmaCancelBtn==exprmaCancelBtn && actRmaCloseBtn==exprmaCloseBtn;
				
				String actResult = Boolean.toString(actMethod);
				
				excelReader.setCellData(xlfile, xlSheetName, 174, 8, actResult.toUpperCase());
					
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaClearBtn));
				rmaClearBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow1Column1));
				boolean actRmavalueR1=rmaTableRow1Column1.getText().isEmpty();
			    boolean expRmavalueR1=true;
			    
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow4Column1));
				boolean actRmavalueR4=rmaTableRow4Column1.getText().isEmpty();
				boolean expRmavalueR4=true;
				
				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
				rmaSerialNumberTxtField.click();
				rmaSerialNumberTxtField.sendKeys("HYD@1");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
				rmaAddBtn.click();
				
				Thread.sleep(2000);
				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow2Column1));
				String actRmavalueR3=rmaTableRow2Column1.getText();
				String expRmavalueR3="HYD@2";
									
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow12Column1));
				String actRmavalueR12=rmaTableRow12Column1.getText();
				String expRmavalueR12="HYD@12";
						
				System.out.println("************************************* checkInputingDifferentSerialNumbers  *********************************");
				System.out.println("Rma value Row 1 In Rma Pop Up Different Serial No : "+actRmavalueR1+"  Value Expected : "+expRmavalueR1);
				System.out.println("Rma value Row 2 In Rma Pop Up Different Serial No : "+actRmavalueR4+"  Value Expected : "+expRmavalueR4);
				
				System.out.println("Rma value Row 4 In Rma Pop Up Different Serial No : "+actRmavalueR3+"  Value Expected : "+expRmavalueR3);
				System.out.println("Rma value Row 4 In Rma Pop Up Different Serial No : "+actRmavalueR12+"  Value Expected : "+expRmavalueR12);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
				rmaOkBtn.click();
				
				
				String actGetRMANosInVoucher =enter_RMA.getAttribute("value");
				String expGetRMANosInVoucher ="HYD@1,HYD@2,HYD@3,HYD@4,HYD@5,HYD@6,HYD@7,HYD@8,HYD@9,HYD@10,HYD@11,HYD@12";
				
				System.out.println("Rma value Row 3 In Rma Pop Up Different Serial No : "+actGetRMANosInVoucher+"  Value Expected : "+expGetRMANosInVoucher);
				
				System.out.println(enter_RMA.getAttribute("value"));
				System.out.println(enter_RMA.getText());
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
				enter_RMA.sendKeys(Keys.TAB);
				
				if((actRmavalueR1==expRmavalueR1 
						&& actRmavalueR3.equalsIgnoreCase(expRmavalueR3) && actRmavalueR4==expRmavalueR4
						&& actRmavalueR12.equalsIgnoreCase(expRmavalueR12) 
						
						&& actMethod==true)
						
						&& actGetRMANosInVoucher.equalsIgnoreCase(expGetRMANosInVoucher))
				{
					System.out.println("***Test Pass: RMA Popup Screen Appeared with all the Options***");
					excelReader.setCellData(xlfile, xlSheetName, 174, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("***Test Fail: RMA Popup Screen NOT Appeared with all the Options***");
					excelReader.setCellData(xlfile, xlSheetName, 174, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 98, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }
		}		

		  

		  public boolean checkEditingTheItemWithStockTypeItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
			 try
		 	 {
				
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_3rdColumn));
			    select4thRow_3rdColumn.click();
			   		    
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.click();
				enter_Quantity.clear();
				enter_Quantity.sendKeys("1");
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.click();
				enter_Rate.clear();
				enter_Rate.sendKeys("12");
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_3rdColumn));
				String act1            = select4thRow_3rdColumn.getText();
				String act2            = select4thRow_4thColumn.getText();
				String act3            = select4thRow_5thColumn.getText();
			
				String exp1,exp2,exp3,exp4;
				
				exp1                   = "1.00";
				exp2                   = "12.00";
				exp3                   = "12.00";
				
				excelReader.setCellData(xlfile, xlSheetName, 221, 8, act1);
				excelReader.setCellData(xlfile, xlSheetName, 222, 8, act2);
				excelReader.setCellData(xlfile, xlSheetName, 223, 8, act3);
				
				System.out.println("Stock Item Qty Value Actual   : " + act1 + "  Value Expected : " + exp1);
				System.out.println("Stock Item Rate Value Actual  : " + act2 + "  Value Expected : " + exp2);				
				System.out.println("Stock Item Gross Value Actual : " + act3 + "  Value Expected : " + exp3);
							
			
				if(act1.equalsIgnoreCase(exp1) && act2.equalsIgnoreCase(exp2)
						&& act3.equalsIgnoreCase(exp3))
				{
					System.out.println("Test Pass : Data Entered in Fourth Row");
					excelReader.setCellData(xlfile, xlSheetName, 219, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Data NOT Entered in Fourth Row");
					excelReader.setCellData(xlfile, xlSheetName, 219, 9, resFail);
					return false;
				}		
			}
			catch (Exception e) 
			{
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 219, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				return false;
			} 
		  }

		  
		  
		  


		  
		  
		  
		  
		  
		  public boolean checkSaveButtonWithUpdatingBatchBinRMAAndStockItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	      {
				
			  excelReader=new ExcelReader(POJOUtility.getExcelPath());
			  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
			  try
			  {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		        String docno=documentNumberTxt.getAttribute("value");
				
		        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				boolean actVoucherSaveMessageWithDocumentNo  = checkVoucherSavingMessage(docno);
				boolean expVoucherSaveMessageWithDocumentNo  = true;
				
				boolean actMethod = actVoucherSaveMessageWithDocumentNo==expVoucherSaveMessageWithDocumentNo; 
				
				String actResult = Boolean.toString(actMethod);
				
				excelReader.setCellData(xlfile, xlSheetName, 224, 8, actResult.toUpperCase());
				
				System.out.println("Voucher Saving Message With Document No :  " + actVoucherSaveMessageWithDocumentNo + " Value Expected : "+ expVoucherSaveMessageWithDocumentNo);
				
				if(actMethod==true)
				{
					System.out.println("Test Pass : Voucher Saved Successfully");
								
					excelReader.setCellData(xlfile, xlSheetName, 224, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Voucher NOT Saved Successfully");
							
					excelReader.setCellData(xlfile, xlSheetName, 224, 9, resFail);
					return false;
				}
			  }
			  catch (Exception e) 
			  {
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 224, 10, e.getMessage());
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  return false;
			  } 
			}
			  
		  
		  
		  
		  
		  
		  
		  
			  
		     //Editing the Opening Stocks New Voucher
		  
			public boolean checkOpeningStocksSaveByUpdateValues() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
			
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
					previousBtn.click();
					
					boolean loading=checkLoadingMessage();
					
					System.out.println("VoucherLoadingMessage  : "+loading +" Value Expected : "+"TRUE");
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
					documentNumberTxt.click();
					
					String actdocNumber,expdocNumber;
					
					actdocNumber=documentNumberTxt.getAttribute("value");
					expdocNumber=excelReader.getCellData(xlSheetName, 226, 7);
					
					System.out.println("Opening stocks Voucher Doucmnet No  : " + actdocNumber + " Value Expected : " + expdocNumber);
					
					excelReader.setCellData(xlfile, xlSheetName, 226, 8, actdocNumber);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
					wareHouseTxt.click();
			
					String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
					String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 227, 7);
					
					System.out.println("Opening stocks Voucher Warehouse  : " + actOsVoucherWarehouse + " Value Expected : " + expOsVoucherWarehouse);
					
					excelReader.setCellData(xlfile, xlSheetName, 227, 8, actOsVoucherWarehouse);
									
					Thread.sleep(2000);
					
					if(netAmount.isDisplayed()==false)
					{
				
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_footerExpandBtn));
						new_footerExpandBtn.click();
					
						
					}
					
					
					String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
					
					String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
			
					expOsVoucherFooterQty="16.00";
					expOsVoucherFooterGross="166.00";
					expOsVoucherFooterNet="166.00";
								
					System.out.println(netAmount.getText());
					System.out.println(QtyAmount.getText());
					System.out.println(GrossAmount.getText());
				
					actOsVoucherFooterQty=QtyAmount.getText();
					actOsVoucherFooterGross=GrossAmount.getText();
					actOsVoucherFooterNet=netAmount.getText();
					
					excelReader.setCellData(xlfile, xlSheetName, 229, 8, actOsVoucherFooterQty);
					excelReader.setCellData(xlfile, xlSheetName, 230, 8, actOsVoucherFooterGross);
					excelReader.setCellData(xlfile, xlSheetName, 231, 8, actOsVoucherFooterNet);
					
					int voucherGridBodyListCount = voucherGridBodyList.size();
					 
					 ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
					 
					 for(int i=0;i<voucherGridBodyListCount;i++)
					 {
						 if(i==8)
						 {
							 String data ="Expiry Date";
							 voucherGridBodyListArray.add(data);
						 }
						 else
						 {
							 String data = voucherGridBodyList.get(i).getText();
							 voucherGridBodyListArray.add(data);
						 }
					 }
					 
					 
					 String actvoucherGridBodyList=voucherGridBodyListArray.toString();
					 
					 String expvoucherGridBodyList="[1, BATCH BR ITEM, Dozs, 1.00, 10.00, 10.00, OSHYDBRCOGS, , Expiry Date, , 2, FIFO COGS ITEM, Dozs, 2.00, 12.00, 24.00, , Bin5, , , 3, WA COGS ITEM, Pcs, 12.00, 10.00, 120.00, , , , HYD@1,HYD@2,HYD@3,HYD@4,HYD@5,HYD@6,HYD@7,HYD@8,HYD@9,HYD@10,HYD@11,HYD@12, 4, STD RATE COGS ITEM, Dozs, 1.00, 12.00, 12.00, , , , , 5, , , , , , , , , ]";
					 
					 excelReader.setCellData(xlfile, xlSheetName, 228, 8, actvoucherGridBodyList);
					 
					 System.out.println("voucherGridBodyList Actual   : " + actvoucherGridBodyList);
					 System.out.println("voucherGridBodyList Expected : " + expvoucherGridBodyList);
				
					 System.out.println("osdocNumber value actual                :  " + actdocNumber            + " value expected  " + expdocNumber);		         
			         System.out.println("osVoucherWarehouse value actual         :  " + actOsVoucherWarehouse   + " value expected  " + expOsVoucherWarehouse);
			         System.out.println("osVoucherFooterQty value actual         :  " + actOsVoucherFooterQty   + " value expected  " + expOsVoucherFooterQty);
			         System.out.println("osVoucherFooterGross value actual       :  " + actOsVoucherFooterGross + " value expected  " + expOsVoucherFooterGross);
			         System.out.println("osVoucherFooterNet value actual         :  " + actOsVoucherFooterNet   + " value expected  " + expOsVoucherFooterNet);
						
					if(actdocNumber.equalsIgnoreCase(expdocNumber)
							&& actOsVoucherWarehouse.equalsIgnoreCase(expOsVoucherWarehouse)
							
							&& actOsVoucherFooterQty.equalsIgnoreCase(expOsVoucherFooterQty) && actOsVoucherFooterGross.equalsIgnoreCase(expOsVoucherFooterGross) 
							&& actOsVoucherFooterNet.equalsIgnoreCase(expOsVoucherFooterNet) && actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
					{
						System.out.println("Test Pass : Saved Data is As Expected");
					
						excelReader.setCellData(xlfile, xlSheetName, 225, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Saved Data is NOT As Expected");
						
						excelReader.setCellData(xlfile, xlSheetName, 225, 9, resFail);
						return false;
					
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 225, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			}	
			

		  
			  @FindBy(xpath="//label[contains(text(),'Copy Document')]")
	          private static WebElement CopyDocumentBtn;
	 
			  @FindBy(xpath="//label[contains(text(),'Copy to Clipboard')]")
			  private static WebElement copytoClipboardBtn;
			 
			  @FindBy(xpath="//label[contains(text(),'Paste from Clipboard')]")
			  private static WebElement pastefromClipboardBtn;
					 
			  @FindBy(xpath="//label[contains(text(),'Posting details')]")
			  private static WebElement postingDetailsBtn;
						 
			  @FindBy(xpath="//label[contains(text(),'Export to XML')]")
			  private static WebElement exporttoXMLBtn;
			 
			  @FindBy(xpath="//label[contains(text(),'Setting')]")
			  private static WebElement settingBtn;
			 
			  @FindBy(xpath="//label[contains(text(),'Calculator')]")
			  private static WebElement calculatorBtn;
			 
			  @FindBy(xpath="//label[contains(text(),'Auto Load')]")
			  private static WebElement autoLoadBtn;
			  
			  public boolean checkOpeningStocksEntryPageOptionsUnderToggleBtn() throws EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
			    	toggleBtn.click();
			    	
			        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoLoadBtn));
					
					boolean actCopyDocumentBtn                =CopyDocumentBtn.isDisplayed();
					boolean actcopytoClipboardBtn             =copytoClipboardBtn.isDisplayed();
					boolean actpastefromClipboardBtn          =pastefromClipboardBtn.isDisplayed();
					boolean actpostingDetailsBtn              =postingDetailsBtn.isDisplayed();
					boolean actexporttoXMLBtn                 =exporttoXMLBtn.isDisplayed();
					boolean actsettingBtn                     =settingBtn.isDisplayed();
					boolean actcalculatorBtn                  =calculatorBtn.isDisplayed();
					boolean actautoLoadBtn                    =autoLoadBtn.isDisplayed();

					
					boolean expCopyDocumentBtn            =true;
					boolean expcopytoClipboardBtn         =true;
					boolean exppastefromClipboardBtn      =true;
					boolean exppostingDetailsBtn          =true;
					boolean expreversEntryBtn             =true;
					boolean expexporttoXMLBtn             =true;
					boolean expsettingBtn                 =true;
					boolean expcalculatorBtn              =true;
					boolean expautoLoadBtn                =true;

					
					System.out.println("*************************************checkOpeningBalanceEntryPageOptionsUnderToggleBtn ********************************************");
					System.out.println("Entry Page RC Copy Document Value Actual:     "+actCopyDocumentBtn+"         Value Expected : "+expCopyDocumentBtn);
					System.out.println("Entry Page RC copy to ClipboardValue Actual    :"+actcopytoClipboardBtn+"    Value Expected : "+expcopytoClipboardBtn);
					System.out.println("Entry Page RC pastefromClipboard Value Actual  :"+actpastefromClipboardBtn+" Value Expected : "+exppastefromClipboardBtn);
					System.out.println("Entry Page RC postingDetails Value Actual      :"+actpostingDetailsBtn+"     Value Expected : "+actpostingDetailsBtn);
					System.out.println("Entry Page RC export to XML Value Actual       :"+actexporttoXMLBtn+"        Value Expected : "+expexporttoXMLBtn);
					System.out.println("Entry Page RC  setting  Value Actual           :"+actsettingBtn+"            Value Expected : "+expsettingBtn);
					System.out.println("Entry Page RC calculator  Value Actual         :"+actcalculatorBtn+"         Value Expected : "+expcalculatorBtn);
					System.out.println("Entry Page RC auto Load Value Actual           :"+actautoLoadBtn+"           Value Expected : "+expautoLoadBtn);
					
					
					boolean actMethod=actCopyDocumentBtn==expCopyDocumentBtn && actcopytoClipboardBtn==expcopytoClipboardBtn 
							&& actpastefromClipboardBtn==exppastefromClipboardBtn && actpostingDetailsBtn==exppostingDetailsBtn 
							&& actexporttoXMLBtn==expexporttoXMLBtn && actsettingBtn==expsettingBtn &&actcalculatorBtn==expcalculatorBtn 
							&& actautoLoadBtn==expautoLoadBtn;
					
					String actResult=Boolean.toString(actMethod);
					String expResult=excelReader.getCellData(xlSheetName, 1038, 7);
			 		
			 		excelReader.setCellData(xlfile, xlSheetName, 1038, 8, actResult.toUpperCase());
					
					
					if( actMethod==true )
					{
						System.out.println("Test Pass : Entry Page toggle  Options Are Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 1037, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Entry Page  toggle  NOT Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 1037, 9, resFail);
						return false;
					}
					}
					catch (Exception e) 
					  {
						  String exception =e.getMessage();
						  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1037, 10, exception);
						  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
						  return false;
					  }
					
				}

		
			
 
			
				public boolean checVoucherInfoByPasteFromOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copytoClipboardBtn));
				  		copytoClipboardBtn.click();
				  		
				  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nextBtn));
				  		nextBtn.click();
				  		
				  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
				  		toggleBtn.click();
				  		
				  		
				  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pastefromClipboardBtn));
				  		pastefromClipboardBtn.click();
				  						  		
				  		String expValidationMessage=excelReader.getCellData(xlSheetName, 1162, 7);
				  		
				  		String actValidationMessage=checkValidationMessage(expValidationMessage);
				  		excelReader.setCellData(xlfile, xlSheetName, 1162, 8, actValidationMessage);			 				  	
						
						System.out.println("VoucherLoadingMessage  : " + actValidationMessage + " Value Expected : " + expValidationMessage);
		
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
						documentNumberTxt.click();
						
						String actdocNumber,expdocNumber;
						
						actdocNumber=documentNumberTxt.getAttribute("value");
						expdocNumber="2";
						
						System.out.println("Opening stocks Voucher Doucmnet No  : " + actdocNumber + " Value Expected : " + expdocNumber);
						
						excelReader.setCellData(xlfile, xlSheetName, 226, 8, actdocNumber);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
						wareHouseTxt.click();
				
						String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
						String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 227, 7);
						
						System.out.println("Opening stocks Voucher Warehouse  : " + actOsVoucherWarehouse + " Value Expected : " + expOsVoucherWarehouse);
						
						excelReader.setCellData(xlfile, xlSheetName, 227, 8, actOsVoucherWarehouse);
																	
						int voucherGridBodyListCount = voucherGridBodyList.size();
						 
						 ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
						 
						 for(int i=0;i<voucherGridBodyListCount;i++)
						 {
							 if(i==8)
							 {
								 String data ="Expiry Date";
								 voucherGridBodyListArray.add(data);
							 }
							 else
							 {
								 String data = voucherGridBodyList.get(i).getText();
								 voucherGridBodyListArray.add(data);
							 }
						 }
						 
						 
						 String actvoucherGridBodyList=voucherGridBodyListArray.toString();
						 
						 String expvoucherGridBodyList="[1, BATCH BR ITEM, Dozs, 1.00, 10.00, 10.00, , , Expiry Date, , 2, FIFO COGS ITEM, Dozs, 2.00, 12.00, 24.00, , , , , 3, WA COGS ITEM, Pcs, 12.00, 10.00, 120.00, , , , , 4, STD RATE COGS ITEM, Dozs, 1.00, 12.00, 12.00, , , , , 5, , , , , , , , , ]";
						 
						 excelReader.setCellData(xlfile, xlSheetName, 228, 8, actvoucherGridBodyList);
						 
						 System.out.println("voucherGridBodyList Actual   : " + actvoucherGridBodyList);
						 System.out.println("voucherGridBodyList Expected : " + expvoucherGridBodyList);
					
							String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
							
							String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
					
							expOsVoucherFooterQty="16.00";
							expOsVoucherFooterGross="166.00";
							expOsVoucherFooterNet="166.00";
										
							System.out.println(netAmount.getText());
							System.out.println(QtyAmount.getText());
							System.out.println(GrossAmount.getText());
						
							actOsVoucherFooterQty=QtyAmount.getText();
							actOsVoucherFooterGross=GrossAmount.getText();
							actOsVoucherFooterNet=netAmount.getText();
							
							excelReader.setCellData(xlfile, xlSheetName, 229, 8, actOsVoucherFooterQty);
							excelReader.setCellData(xlfile, xlSheetName, 230, 8, actOsVoucherFooterGross);
							excelReader.setCellData(xlfile, xlSheetName, 231, 8, actOsVoucherFooterNet);
							
						 
						 
						 System.out.println("osVoucherFooterQty value actual         :  " + actOsVoucherFooterQty   + " value expected  " + expOsVoucherFooterQty);
				         System.out.println("osVoucherFooterGross value actual       :  " + actOsVoucherFooterGross + " value expected  " + expOsVoucherFooterGross);
				         System.out.println("osVoucherFooterNet value actual         :  " + actOsVoucherFooterNet   + " value expected  " + expOsVoucherFooterNet);
							
						if(actdocNumber.equalsIgnoreCase(expdocNumber)
								&& actOsVoucherWarehouse.equalsIgnoreCase(expOsVoucherWarehouse)
								
								&& actOsVoucherFooterQty.equalsIgnoreCase(expOsVoucherFooterQty) && actOsVoucherFooterGross.equalsIgnoreCase(expOsVoucherFooterGross) 
								&& actOsVoucherFooterNet.equalsIgnoreCase(expOsVoucherFooterNet) && actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
						{
							System.out.println("Test Pass : Saved Data is As Expected");
						
							excelReader.setCellData(xlfile, xlSheetName, 225, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : Saved Data is NOT As Expected");
							
							excelReader.setCellData(xlfile, xlSheetName, 225, 9, resFail);
							return false;
						
						}
					}
					catch (Exception e) 
					{
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 225, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}	

  
				


				
	

				  public boolean checkUpdateValueOfBatchBinRmaStockInCopyAndPasteOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				  {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
				    try
				    {	
				       	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
				       	select1stRow_5thColumn.click();															
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
						enter_Batch.click();
						enter_Batch.clear();
						enter_Batch.sendKeys("OSHYDBTODELETE");
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
						select1stRow_8thColumn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
						enter_Expirydate.click();
						enter_Expirydate.sendKeys(Keys.TAB);
						
						String actUnitsColumnValue  = select1stRow_2ndColumn.getText();
						String expUnitsColumnValue  = "Dozs";
							
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
						String actQtyR1         = select1stRow_3rdColumn.getText();
						String actRateR1        = select1stRow_4thColumn.getText();
						String actGrossR1       = select1stRow_5thColumn.getText();
						String actBatchR1       = select1stRow_6thColumn.getText();
						
						String expQtyR1         = "1.00";
						String expRateR1        = "10.00";
						String expGrossR1       = "10.00";
						String expBatchR1       = "OSHYDBTODELETE";
						
						excelReader.setCellData(xlfile, xlSheetName, 86, 8, actQtyR1);
						excelReader.setCellData(xlfile, xlSheetName, 87, 8, actRateR1);
						excelReader.setCellData(xlfile, xlSheetName, 88, 8, actGrossR1);
						excelReader.setCellData(xlfile, xlSheetName, 89, 8, actBatchR1);
						
						
						System.out.println("Select Item Units Column Value Actual  : " + actUnitsColumnValue   + " Value Expected   : " + expUnitsColumnValue);

						System.out.println("Qty Row 1 Value Actual                 : " + actQtyR1              + " Value Expected   : " + expQtyR1);
						System.out.println("Rate Row 1 Value Actual                : " + actRateR1             + " Value Expected   : " + expRateR1);
						System.out.println("Gross Row 1 Value Actual               : " + actGrossR1            + " Value Expected   : " + expGrossR1);
						System.out.println("Batch Row 1 Value Actual               : " + actBatchR1            + " Value Expected   : " + expBatchR1);
					
							   
						

		
				  
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
						select2ndRow_5thColumn.click();
											
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.click();
						enter_Gross.sendKeys(Keys.TAB);
								
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
						
						boolean actBinSearch            = binSearchTxt.isDisplayed();
						boolean actBinSearchTxt         = binSearchTxt.isDisplayed();
						boolean actBinSearchBtn         = binSearchBtn.isDisplayed();
						boolean actBinAutoAllocateBtn   = binAutoAllocateBtn.isDisplayed();
						boolean actBinPickBtn           = binPickBtn.isDisplayed();
						boolean actBinCancelBtn         = binCancelBtn.isDisplayed();
						
						boolean expBinSearch            = true;
						boolean expBinSearchTxt         = true;
						boolean expBinSearchBtn         = true;
						boolean expBinAutoAllocateBtn   = true;
						boolean expBinPickBtn           = true;
						boolean expBinCancelBtn         = true;
						
						System.out.println("Entry Page Bin Search Value Actual  : " + actBinSearch + "    Value Expected   : " + expBinSearch);
						
						String actBinTotalQty           = binTotalQty.getAttribute("value");
						String actBinBaseUom            = binBaseUOM.getText();
						String actBinBalanceQty         = binBalanceTxt.getAttribute("value");
						
						int binInwardGridListCount = binInwardGridList.size();
						
						ArrayList<String> binInwardGridListArray = new ArrayList<String>();
						
						for(int i=0;i<binInwardGridListCount;i++)
						{
							String data = binInwardGridList.get(i).getText();
							binInwardGridListArray.add(data);
						}
										
						String actbinInwardGridList=binInwardGridListArray.toString();
						
						String expbinInwardGridList=excelReader.getCellData(xlSheetName, 248, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 248, 8, actbinInwardGridList);
						
						System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
						System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
									
						boolean actMethod = actBinSearch==expBinSearch && actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
								            && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
						
						String actResult = Boolean.toString(actMethod);
						
						excelReader.setCellData(xlfile, xlSheetName, 247, 8, actResult.toUpperCase());
							      
						String expBinTotalQty           = "24.00";
						String expBinBaseUom            = "Pcs";
						String expBinBalanceQty         = "24.00";
						
						excelReader.setCellData(xlfile, xlSheetName, 249, 8, actBinTotalQty);
						excelReader.setCellData(xlfile, xlSheetName, 250, 8, actBinBaseUom);
						excelReader.setCellData(xlfile, xlSheetName, 251, 8, actBinBalanceQty);
										       
						System.out.println("Bin Total Qty Value Actual              :  " +actBinTotalQty +           " Value Expected : " + expBinTotalQty);
						System.out.println("Bin Base Uom Value Actual               :  " +actBinBaseUom +            " Value Expected : " + expBinBaseUom);
						System.out.println("Bin Balance Txt Value Actual            :  " +actBinBalanceQty +         " Value Expected : " + expBinBalanceQty);
									
						System.out.println("Bin Search Value Actual                 :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
						System.out.println("Bin Search Btn Value Actual             :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
						System.out.println("Bin Auto Allocate Btn Value Actual      :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
						System.out.println("Bin Pick Btn Value Actual               :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
						System.out.println("Bin Cancel Btn Value Actual             :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
								
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
						binselect3rdRow_8thColumn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ToBeAllocateTxt));
						enter_ToBeAllocateTxt.sendKeys("24");
						enter_ToBeAllocateTxt.sendKeys(Keys.TAB);				
												
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
						binOkBtn.click();
						
						String actBinName      =  select2ndRow_7thColumn.getText();
						String expBinName      = "Bin5";
					
						excelReader.setCellData(xlfile, xlSheetName, 104, 8, actBinName);
						
						System.out.println("Bin Column in Voucher Value Actual          : " + actBinName +              " Value Exepected  : " + expBinName);
									  						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
						select3rdRow_5thColumn.click();
								
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
						enter_RMA.sendKeys(Keys.SPACE);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));
						
						boolean actRmaSerialNumberTxtField     = rmaSerialNumberTxtField.isDisplayed();
						boolean actRmaQuantityTxtField         = rmaQuantityTxtField.isDisplayed();
						boolean actRmaAddBtn                   = rmaAddBtn.isDisplayed();
						boolean actRmaNumberofItemsLabel       = rmaNumberofItemsLabel.isDisplayed();
						boolean actRmaTableHeadingRMA          = rmaTableHeadingRMA.isDisplayed();
						boolean actRmaTableHeadingDocumentNo   = rmaTableHeadingDocumentNo.isDisplayed();
						boolean actRmaTableHeadingDocumentDate = rmaTableHeadingDocumentDate.isDisplayed();
						boolean actRmaClearBtn                 = rmaClearBtn.isDisplayed();
						boolean actRmaOkBtn                    = rmaOkBtn.isDisplayed();
						boolean actRmaCancelBtn                = rmaCancelBtn.isDisplayed();
						boolean actRmaCloseBtn                 = rmaCloseBtn.isDisplayed();
						
						boolean exprmaSerialNumberTxtField     = true;
						boolean exprmaQuantityTxtField         = true;
						boolean exprmaAddBtn                   = true;
						boolean exprmaNumberofItemsLabel       = true;
						boolean exprmaTableHeadingRMA          = true;
						boolean exprmaTableHeadingDocumentNo   = true;
						boolean exprmaTableHeadingDocumentDate = true;
						boolean exprmaClearBtn                 = true;
						boolean exprmaOkBtn                    = true;
						boolean exprmaCancelBtn                = true;
						boolean exprmaCloseBtn                 = true;

						System.out.println("Rma Serial Number Text Field 	   : " + actRmaSerialNumberTxtField	    +   "  Value Expected : " + exprmaSerialNumberTxtField);
						System.out.println("Rma Qty Field              	 	   : " + actRmaQuantityTxtField		    +   "  Value Expected : " + exprmaQuantityTxtField);
						System.out.println("Rma Add Button 					   : " + actRmaAddBtn				    +   "  Value Expected : " + exprmaAddBtn);
						System.out.println("Rma Number Of Items 			   : " + actRmaNumberofItemsLabel	    +   "  Value Expected : " + exprmaNumberofItemsLabel);
						System.out.println("Rma Table heading Rma  			   : " + actRmaTableHeadingRMA		    +   "  Value Expected : " + exprmaTableHeadingRMA);
						System.out.println("Rma Table Heading Document Number  : " + actRmaTableHeadingDocumentNo   +   "  Value Expected : " + exprmaTableHeadingDocumentNo);
						System.out.println("Rma Table Heading Document Date    : " + actRmaTableHeadingDocumentDate +   "  Value Expected : " + exprmaTableHeadingDocumentDate);
						System.out.println("Rma Clear Button                   : " + actRmaClearBtn				    +   "  Value Expected : " + exprmaClearBtn);
						System.out.println("Rma Ok Button                      : " + actRmaOkBtn					+   "  Value Expected : " + exprmaOkBtn);
						System.out.println("Rma Cancel Button                  : " + actRmaCancelBtn				+   "  Value Expected : " + exprmaCancelBtn);
						System.out.println("Rma Close Button  				   : " + actRmaCloseBtn				    +   "  Value Expected : " + exprmaCloseBtn);
						
						
						
						boolean actM = actRmaSerialNumberTxtField==exprmaSerialNumberTxtField && actRmaQuantityTxtField==exprmaQuantityTxtField  && actRmaAddBtn==exprmaAddBtn
											&& actRmaNumberofItemsLabel==exprmaNumberofItemsLabel && actRmaNumberofItemsLabel==exprmaTableHeadingRMA
											&& actRmaTableHeadingDocumentNo==exprmaTableHeadingDocumentNo && actRmaTableHeadingDocumentDate==exprmaTableHeadingDocumentDate
											&& actRmaClearBtn==exprmaClearBtn && actRmaOkBtn==exprmaOkBtn && actRmaCancelBtn==exprmaCancelBtn && actRmaCloseBtn==exprmaCloseBtn;
						
						String actRes = Boolean.toString(actMethod);
						
						excelReader.setCellData(xlfile, xlSheetName, 174, 8, actResult.toUpperCase());
							
						
						
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow1Column1));
						boolean actRmavalueR1=rmaTableRow1Column1.getText().isEmpty();
					    boolean expRmavalueR1=true;
					    
					    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow4Column1));
						boolean actRmavalueR4=rmaTableRow4Column1.getText().isEmpty();
						boolean expRmavalueR4=true;
						
						Thread.sleep(2000);

						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
						rmaSerialNumberTxtField.click();
						rmaSerialNumberTxtField.sendKeys("HYDT@1");
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
						rmaAddBtn.click();
						
						Thread.sleep(2000);
						
						
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow2Column1));
						String actRmavalueR3=rmaTableRow2Column1.getText();
						String expRmavalueR3="HYDT@2";
											
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow12Column1));
						String actRmavalueR12=rmaTableRow12Column1.getText();
						String expRmavalueR12="HYDT@12";
								
						System.out.println("************************************* checkInputingDifferentSerialNumbers  *********************************");
						System.out.println("Rma value Row 1 In Rma Pop Up Different Serial No : "+actRmavalueR1+"  Value Expected : "+expRmavalueR1);
						System.out.println("Rma value Row 2 In Rma Pop Up Different Serial No : "+actRmavalueR4+"  Value Expected : "+expRmavalueR4);
						
						System.out.println("Rma value Row 4 In Rma Pop Up Different Serial No : "+actRmavalueR3+"  Value Expected : "+expRmavalueR3);
						System.out.println("Rma value Row 4 In Rma Pop Up Different Serial No : "+actRmavalueR12+"  Value Expected : "+expRmavalueR12);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
						rmaOkBtn.click();
						
						
						String actGetRMANosInVoucher =enter_RMA.getAttribute("value");
						String expGetRMANosInVoucher ="HYDT@1,HYDT@2,HYDT@3,HYDT@4,HYDT@5,HYDT@6,HYDT@7,HYDT@8,HYDT@9,HYDT@10,HYDT@11,HYDT@12";
						
						System.out.println("Rma value Row 3 In Rma Pop Up Different Serial No : "+actGetRMANosInVoucher+"  Value Expected : "+expGetRMANosInVoucher);
						
						System.out.println(enter_RMA.getAttribute("value"));
						System.out.println(enter_RMA.getText());
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
						enter_RMA.sendKeys(Keys.TAB);
						
						

						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_5thColumn));
						select4thRow_5thColumn.click();
					   		    
						
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.sendKeys(Keys.TAB);

						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_3rdColumn));
						String act1            = select4thRow_3rdColumn.getText();
						String act2            = select4thRow_4thColumn.getText();
						String act3            = select4thRow_5thColumn.getText();
					
						String exp1,exp2,exp3,exp4;
						
						exp1                   = "1.00";
						exp2                   = "12.00";
						exp3                   = "12.00";
						
						excelReader.setCellData(xlfile, xlSheetName, 221, 8, act1);
						excelReader.setCellData(xlfile, xlSheetName, 222, 8, act2);
						excelReader.setCellData(xlfile, xlSheetName, 223, 8, act3);
						
						System.out.println("Stock Item Qty Value Actual   : " + act1 + "  Value Expected : " + exp1);
						System.out.println("Stock Item Rate Value Actual  : " + act2 + "  Value Expected : " + exp2);				
						System.out.println("Stock Item Gross Value Actual : " + act3 + "  Value Expected : " + exp3);
									

						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				        String docno=documentNumberTxt.getAttribute("value");
						
				        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
						saveBtn.click();
						
						boolean actVoucherSaveMessageWithDocumentNo  = checkVoucherSavingMessage(docno);
						boolean expVoucherSaveMessageWithDocumentNo  = true;
						
						boolean actMethods = actVoucherSaveMessageWithDocumentNo==expVoucherSaveMessageWithDocumentNo; 
						
						String actResults = Boolean.toString(actMethods);
						
						excelReader.setCellData(xlfile, xlSheetName, 224, 8, actResult.toUpperCase());
						
						System.out.println("Voucher Saving Message With Document No :  " + actVoucherSaveMessageWithDocumentNo + " Value Expected : "+ expVoucherSaveMessageWithDocumentNo);
						
						if(actMethod==true 
								
								&& actM==true
								
								
								&& act1.equalsIgnoreCase(exp1) && act2.equalsIgnoreCase(exp2)
								&& act3.equalsIgnoreCase(exp3)
								
								&& actMethods== true
								
								&& actVoucherSaveMessageWithDocumentNo==expVoucherSaveMessageWithDocumentNo)
						{
							System.out.println("Test Pass : Voucher Saved Successfully");
										
							excelReader.setCellData(xlfile, xlSheetName, 224, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : Voucher NOT Saved Successfully");
									
							excelReader.setCellData(xlfile, xlSheetName, 224, 9, resFail);
							return false;
						}
					  }
					  catch (Exception e) 
					  {
						  excelReader.setExceptionInExcel(xlfile, xlSheetName, 224, 10, e.getMessage());
						  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						  return false;
					  } 
					}

				
					public boolean checkOpeningStocksSaveByCopyAndPasteOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
					{
						
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
						try
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
							previousBtn.click();
							
							boolean loading=checkLoadingMessage();
							
							System.out.println("VoucherLoadingMessage  : "+loading +" Value Expected : "+"TRUE");
							
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
							documentNumberTxt.click();
							
							String actdocNumber,expdocNumber;
							
							actdocNumber=documentNumberTxt.getAttribute("value");
							expdocNumber="2";
							
							System.out.println("Opening stocks Voucher Doucmnet No  : " + actdocNumber + " Value Expected : " + expdocNumber);
							
							excelReader.setCellData(xlfile, xlSheetName, 226, 8, actdocNumber);
							
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
							wareHouseTxt.click();
					
							String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
							String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 227, 7);
							
							System.out.println("Opening stocks Voucher Warehouse  : " + actOsVoucherWarehouse + " Value Expected : " + expOsVoucherWarehouse);
							
							excelReader.setCellData(xlfile, xlSheetName, 227, 8, actOsVoucherWarehouse);
											
							Thread.sleep(2000);
							
							if(netAmount.isDisplayed()==false)
							{
						
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_footerExpandBtn));
								new_footerExpandBtn.click();
							
								
							}
							
							
							String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
							
							String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
					
							expOsVoucherFooterQty="16.00";
							expOsVoucherFooterGross="166.00";
							expOsVoucherFooterNet="166.00";
										
							System.out.println(netAmount.getText());
							System.out.println(QtyAmount.getText());
							System.out.println(GrossAmount.getText());
						
							actOsVoucherFooterQty=QtyAmount.getText();
							actOsVoucherFooterGross=GrossAmount.getText();
							actOsVoucherFooterNet=netAmount.getText();
							
							excelReader.setCellData(xlfile, xlSheetName, 229, 8, actOsVoucherFooterQty);
							excelReader.setCellData(xlfile, xlSheetName, 230, 8, actOsVoucherFooterGross);
							excelReader.setCellData(xlfile, xlSheetName, 231, 8, actOsVoucherFooterNet);
							
							int voucherGridBodyListCount = voucherGridBodyList.size();
							 
							 ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
							 
							 for(int i=0;i<voucherGridBodyListCount;i++)
							 {
								 if(i==8)
								 {
									 String data ="Expiry Date";
									 voucherGridBodyListArray.add(data);
								 }
								 else
								 {
									 String data = voucherGridBodyList.get(i).getText();
									 voucherGridBodyListArray.add(data);
								 }
							 }
							 
							 
							 String actvoucherGridBodyList=voucherGridBodyListArray.toString();
							 
							 String expvoucherGridBodyList="[1, BATCH BR ITEM, Dozs, 1.00, 10.00, 10.00, OSHYDBTODELETE, , Expiry Date, , 2, FIFO COGS ITEM, Dozs, 2.00, 12.00, 24.00, , Bin5, , , 3, WA COGS ITEM, Pcs, 12.00, 10.00, 120.00, , , , HYDT@1,HYDT@2,HYDT@3,HYDT@4,HYDT@5,HYDT@6,HYDT@7,HYDT@8,HYDT@9,HYDT@10,HYDT@11,HYDT@12, 4, STD RATE COGS ITEM, Dozs, 1.00, 12.00, 12.00, , , , , 5, , , , , , , , , ]";
							 
							 excelReader.setCellData(xlfile, xlSheetName, 228, 8, actvoucherGridBodyList);
							 
							 System.out.println("voucherGridBodyList Actual   : " + actvoucherGridBodyList);
							 System.out.println("voucherGridBodyList Expected : " + expvoucherGridBodyList);
						
							 System.out.println("osdocNumber value actual                :  " + actdocNumber            + " value expected  " + expdocNumber);		         
					         System.out.println("osVoucherWarehouse value actual         :  " + actOsVoucherWarehouse   + " value expected  " + expOsVoucherWarehouse);
					         System.out.println("osVoucherFooterQty value actual         :  " + actOsVoucherFooterQty   + " value expected  " + expOsVoucherFooterQty);
					         System.out.println("osVoucherFooterGross value actual       :  " + actOsVoucherFooterGross + " value expected  " + expOsVoucherFooterGross);
					         System.out.println("osVoucherFooterNet value actual         :  " + actOsVoucherFooterNet   + " value expected  " + expOsVoucherFooterNet);
								
							if(actdocNumber.equalsIgnoreCase(expdocNumber)
									&& actOsVoucherWarehouse.equalsIgnoreCase(expOsVoucherWarehouse)
									
									&& actOsVoucherFooterQty.equalsIgnoreCase(expOsVoucherFooterQty) && actOsVoucherFooterGross.equalsIgnoreCase(expOsVoucherFooterGross) 
									&& actOsVoucherFooterNet.equalsIgnoreCase(expOsVoucherFooterNet) && actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
							{
								System.out.println("Test Pass : Saved Data is As Expected");
							
								excelReader.setCellData(xlfile, xlSheetName, 225, 9, resPass);
								return true;
							}
							else
							{
								System.out.println("Test Fail : Saved Data is NOT As Expected");
								
								excelReader.setCellData(xlfile, xlSheetName, 225, 9, resFail);
								return false;
							
							}
						}
						catch (Exception e) 
						{
							excelReader.setExceptionInExcel(xlfile, xlSheetName, 225, 10, e.getMessage());
							System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
							return false;
						}
					}	
					

			
				
					  public boolean checkDeleteOptionFromEntryPageinOpeningStocksNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
					   {
						   excelReader=new ExcelReader(POJOUtility.getExcelPath());
						   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
							
						  
						 try
						 {
						
						  // boolean loading=checkLoadingMessage();
						   
						   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DeleteBtn));
						   new_DeleteBtn.click();
						   
						   getWaitForAlert();
							
						   String actAlertMessage=getAlert().getText();
							
						   String expAlertMessage=excelReader.getCellData(xlSheetName, 1200, 7);
					 		
				           excelReader.setCellData(xlfile, xlSheetName, 1200, 8, actAlertMessage);
						   
						   
							System.out.println("Alert Message on Deleteing the Voucher :  "+actAlertMessage +"  "+expAlertMessage);
							
							getAlert().accept();
							
							boolean deleteMessage=checkEntryPageDeleteMessage();
							
							System.out.println("DeleteMesssage  : "+deleteMessage+" Value Expected : "+"TRUE");
						
							String actDisplayDeleteMesssage=Boolean.toString(deleteMessage);
							String expDisplayDeleteMesssage=excelReader.getCellData(xlSheetName, 1201, 7);
					 		
				             excelReader.setCellData(xlfile, xlSheetName, 1201, 8, actDisplayDeleteMesssage.toUpperCase());
							
							
							if(actAlertMessage.contains(expAlertMessage) && deleteMessage==true)
							{
								System.out.println("Test Pass : Deleted Voucher");
								
								excelReader.setCellData(xlfile, xlSheetName, 1199, 9, resPass);
								return true;
							}
							else
							{
								System.out.println("Test Fail : NOT Deleted Voucher");
								
								excelReader.setCellData(xlfile, xlSheetName, 1199, 9, resFail);
								return false;
							}
						   }
						   catch (Exception e) 
							  {
						
								  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1199, 10, e.getMessage());
								  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
								  return false;
							  }
							   
					   }
					   
					  
					  

						public boolean checkSuspendVoucherInfoByPasteFromOptionI() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
						{
							
							excelReader=new ExcelReader(POJOUtility.getExcelPath());
							xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
						
							try
							{
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
								previousBtn.click();
								 
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
						    	toggleBtn.click();
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copytoClipboardBtn));
						  		copytoClipboardBtn.click();
						  		
						  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nextBtn));
						  		nextBtn.click();
						  		
						  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
						  		toggleBtn.click();
						  								  		
						  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pastefromClipboardBtn));
						  		pastefromClipboardBtn.click();
						  						  		
						  		String expValidationMessage=excelReader.getCellData(xlSheetName, 1162, 7);
						  		
						  		String actValidationMessage=checkValidationMessage(expValidationMessage);
						  		excelReader.setCellData(xlfile, xlSheetName, 1162, 8, actValidationMessage);			 				  	
								
								System.out.println("VoucherLoadingMessage  : " + actValidationMessage + " Value Expected : " + expValidationMessage);
				
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
								documentNumberTxt.click();
								
								String actdocNumber,expdocNumber;
								
								actdocNumber=documentNumberTxt.getAttribute("value");
								expdocNumber="2";
								
								System.out.println("Opening stocks Voucher Doucmnet No  : " + actdocNumber + " Value Expected : " + expdocNumber);
								
								excelReader.setCellData(xlfile, xlSheetName, 226, 8, actdocNumber);
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
								wareHouseTxt.click();
						
								String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
								String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 227, 7);
								
								System.out.println("Opening stocks Voucher Warehouse  : " + actOsVoucherWarehouse + " Value Expected : " + expOsVoucherWarehouse);
								
								excelReader.setCellData(xlfile, xlSheetName, 227, 8, actOsVoucherWarehouse);
												
															
								int voucherGridBodyListCount = voucherGridBodyList.size();
								 
								 ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
								 
								 for(int i=0;i<voucherGridBodyListCount;i++)
								 {
									 if(i==8)
									 {
										 String data ="Expiry Date";
										 voucherGridBodyListArray.add(data);
									 }
									 else
									 {
										 String data = voucherGridBodyList.get(i).getText();
										 voucherGridBodyListArray.add(data);
									 }
								 }
								 
								 
								 String actvoucherGridBodyList=voucherGridBodyListArray.toString();
								 
								 String expvoucherGridBodyList="[1, BATCH BR ITEM, Dozs, 1.00, 10.00, 10.00, , , Expiry Date, , 2, FIFO COGS ITEM, Dozs, 2.00, 12.00, 24.00, , , , , 3, WA COGS ITEM, Pcs, 12.00, 10.00, 120.00, , , , , 4, STD RATE COGS ITEM, Dozs, 1.00, 12.00, 12.00, , , , , 5, , , , , , , , , ]";
								 
								 excelReader.setCellData(xlfile, xlSheetName, 228, 8, actvoucherGridBodyList);
								 
								 System.out.println("voucherGridBodyList Actual   : " + actvoucherGridBodyList);
								 System.out.println("voucherGridBodyList Expected : " + expvoucherGridBodyList);
							
									String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
									
									String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
							
									expOsVoucherFooterQty="16.00";
									expOsVoucherFooterGross="166.00";
									expOsVoucherFooterNet="166.00";
												
									System.out.println(netAmount.getText());
									System.out.println(QtyAmount.getText());
									System.out.println(GrossAmount.getText());
								
									actOsVoucherFooterQty=QtyAmount.getText();
									actOsVoucherFooterGross=GrossAmount.getText();
									actOsVoucherFooterNet=netAmount.getText();
									
									excelReader.setCellData(xlfile, xlSheetName, 229, 8, actOsVoucherFooterQty);
									excelReader.setCellData(xlfile, xlSheetName, 230, 8, actOsVoucherFooterGross);
									excelReader.setCellData(xlfile, xlSheetName, 231, 8, actOsVoucherFooterNet);
									
								 
								 
								 System.out.println("osVoucherFooterQty value actual         :  " + actOsVoucherFooterQty   + " value expected  " + expOsVoucherFooterQty);
						         System.out.println("osVoucherFooterGross value actual       :  " + actOsVoucherFooterGross + " value expected  " + expOsVoucherFooterGross);
						         System.out.println("osVoucherFooterNet value actual         :  " + actOsVoucherFooterNet   + " value expected  " + expOsVoucherFooterNet);
									
								if(actdocNumber.equalsIgnoreCase(expdocNumber)
										&& actOsVoucherWarehouse.equalsIgnoreCase(expOsVoucherWarehouse)
										
										&& actOsVoucherFooterQty.equalsIgnoreCase(expOsVoucherFooterQty) && actOsVoucherFooterGross.equalsIgnoreCase(expOsVoucherFooterGross) 
										&& actOsVoucherFooterNet.equalsIgnoreCase(expOsVoucherFooterNet) && actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
								{
									System.out.println("Test Pass : Saved Data is As Expected");
								
									excelReader.setCellData(xlfile, xlSheetName, 225, 9, resPass);
									return true;
								}
								else
								{
									System.out.println("Test Fail : Saved Data is NOT As Expected");
									
									excelReader.setCellData(xlfile, xlSheetName, 225, 9, resFail);
									return false;
								
								}
							}
							catch (Exception e) 
							{
								excelReader.setExceptionInExcel(xlfile, xlSheetName, 225, 10, e.getMessage());
								System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
								return false;
							}
						}	

				  
						
						
						 @FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[4]")
						 private static WebElement openingStocksNewHomeRow1VoucherNo;
						 
						 @FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[5]")
						 private static WebElement openingStocksNewHomeRow1CreatedBy;
						 
						 @FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[6]")
						 private static WebElement openingStocksNewHomeRow1ModifiedBy;
						 
						 @FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[11]")
						 private static WebElement openingStocksNewHomeRow1SuspendStatus;
						 
						 @FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr[1]/td[12]")
						 private static WebElement openingStocksNewHomeRow1AuthorizationStatus;
						
						 @FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr")
						 private static List<WebElement> openingStocksNewHomePageTableRowsCount;
						
						public boolean checkSuspendOptionInOpeningStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
						{
							
							excelReader=new ExcelReader(POJOUtility.getExcelPath());
							xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
								
							try
							{
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
						       	select1stRow_5thColumn.click();															
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
								enter_Gross.sendKeys(Keys.TAB);
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
								enter_Batch.click();
								enter_Batch.clear();
								enter_Batch.sendKeys("OSNCSUSPEND");
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
								select1stRow_8thColumn.click();
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
								enter_Expirydate.click();
								enter_Expirydate.sendKeys(Keys.TAB);
								
								/*String actUnitsColumnValue  = select1stRow_2ndColumn.getText();
								String expUnitsColumnValue  = "Dozs";
									
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
								String actQtyR1         = select1stRow_3rdColumn.getText();
								String actRateR1        = select1stRow_4thColumn.getText();
								String actGrossR1       = select1stRow_5thColumn.getText();
								String actBatchR1       = select1stRow_6thColumn.getText();
								
								String expQtyR1         = "1.00";
								String expRateR1        = "10.00";
								String expGrossR1       = "10.00";
								String expBatchR1       = "OSNCSUSPEND";
								
								excelReader.setCellData(xlfile, xlSheetName, 86, 8, actQtyR1);
								excelReader.setCellData(xlfile, xlSheetName, 87, 8, actRateR1);
								excelReader.setCellData(xlfile, xlSheetName, 88, 8, actGrossR1);
								excelReader.setCellData(xlfile, xlSheetName, 89, 8, actBatchR1);
								*/
								
								/*System.out.println("Select Item Units Column Value Actual  : " + actUnitsColumnValue   + " Value Expected   : " + expUnitsColumnValue);

								System.out.println("Qty Row 1 Value Actual                 : " + actQtyR1              + " Value Expected   : " + expQtyR1);
								System.out.println("Rate Row 1 Value Actual                : " + actRateR1             + " Value Expected   : " + expRateR1);
								System.out.println("Gross Row 1 Value Actual               : " + actGrossR1            + " Value Expected   : " + expGrossR1);
								System.out.println("Batch Row 1 Value Actual               : " + actBatchR1            + " Value Expected   : " + expBatchR1);
							
*/									   
								

				
						  
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
								select2ndRow_5thColumn.click();
													
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
								enter_Gross.click();
								enter_Gross.sendKeys(Keys.TAB);
										
								/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
								
								boolean actBinSearch            = binSearchTxt.isDisplayed();
								boolean actBinSearchTxt         = binSearchTxt.isDisplayed();
								boolean actBinSearchBtn         = binSearchBtn.isDisplayed();
								boolean actBinAutoAllocateBtn   = binAutoAllocateBtn.isDisplayed();
								boolean actBinPickBtn           = binPickBtn.isDisplayed();
								boolean actBinCancelBtn         = binCancelBtn.isDisplayed();
								
								boolean expBinSearch            = true;
								boolean expBinSearchTxt         = true;
								boolean expBinSearchBtn         = true;
								boolean expBinAutoAllocateBtn   = true;
								boolean expBinPickBtn           = true;
								boolean expBinCancelBtn         = true;
								
								System.out.println("Entry Page Bin Search Value Actual  : " + actBinSearch + "    Value Expected   : " + expBinSearch);
								
								String actBinTotalQty           = binTotalQty.getAttribute("value");
								String actBinBaseUom            = binBaseUOM.getText();
								String actBinBalanceQty         = binBalanceTxt.getAttribute("value");
								
								String expBinTotalQty           = "24.00";
								String expBinBaseUom            = "Pcs";
								String expBinBalanceQty         = "24.00";
								
								excelReader.setCellData(xlfile, xlSheetName, 249, 8, actBinTotalQty);
								excelReader.setCellData(xlfile, xlSheetName, 250, 8, actBinBaseUom);
								excelReader.setCellData(xlfile, xlSheetName, 251, 8, actBinBalanceQty);
												       
								System.out.println("Bin Total Qty Value Actual              :  " +actBinTotalQty +           " Value Expected : " + expBinTotalQty);
								System.out.println("Bin Base Uom Value Actual               :  " +actBinBaseUom +            " Value Expected : " + expBinBaseUom);
								System.out.println("Bin Balance Txt Value Actual            :  " +actBinBalanceQty +         " Value Expected : " + expBinBalanceQty);
							
								
								
								int binInwardGridListCount = binInwardGridList.size();
								
								ArrayList<String> binInwardGridListArray = new ArrayList<String>();
								
								for(int i=0;i<binInwardGridListCount;i++)
								{
									String data = binInwardGridList.get(i).getText();
									binInwardGridListArray.add(data);
								}
												
								String actbinInwardGridList=binInwardGridListArray.toString();
								
								String expbinInwardGridList="[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 24.00, , 98.00, 24.00, 74.00, 74.00, , , , 0.00, , , , ]";
								
								excelReader.setCellData(xlfile, xlSheetName, 248, 8, actbinInwardGridList);
								
								System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
								System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
											
								boolean actMethod = actBinSearch==expBinSearch && actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
										            && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
								
								String actResult = Boolean.toString(actMethod);
								
								excelReader.setCellData(xlfile, xlSheetName, 247, 8, actResult.toUpperCase());
									      
											
								System.out.println("Bin Search Value Actual                 :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
								System.out.println("Bin Search Btn Value Actual             :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
								System.out.println("Bin Auto Allocate Btn Value Actual      :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
								System.out.println("Bin Pick Btn Value Actual               :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
								System.out.println("Bin Cancel Btn Value Actual             :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
							*/			
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
								binselect3rdRow_8thColumn.click();
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ToBeAllocateTxt));
								enter_ToBeAllocateTxt.sendKeys("24");
								enter_ToBeAllocateTxt.sendKeys(Keys.TAB);				
														
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
								binOkBtn.click();
								
							/*	String actBinName      =  select2ndRow_7thColumn.getText();
								String expBinName      = "Bin5";
							
								excelReader.setCellData(xlfile, xlSheetName, 104, 8, actBinName);
								
								System.out.println("Bin Column in Voucher Value Actual          : " + actBinName +              " Value Exepected  : " + expBinName);
							*/				  						
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
								select3rdRow_5thColumn.click();
										
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
								enter_Gross.sendKeys(Keys.TAB);
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
								enter_RMA.sendKeys(Keys.SPACE);
								
/*								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaScreenTitle));
								
								boolean actRmaSerialNumberTxtField     = rmaSerialNumberTxtField.isDisplayed();
								boolean actRmaQuantityTxtField         = rmaQuantityTxtField.isDisplayed();
								boolean actRmaAddBtn                   = rmaAddBtn.isDisplayed();
								boolean actRmaNumberofItemsLabel       = rmaNumberofItemsLabel.isDisplayed();
								boolean actRmaTableHeadingRMA          = rmaTableHeadingRMA.isDisplayed();
								boolean actRmaTableHeadingDocumentNo   = rmaTableHeadingDocumentNo.isDisplayed();
								boolean actRmaTableHeadingDocumentDate = rmaTableHeadingDocumentDate.isDisplayed();
								boolean actRmaClearBtn                 = rmaClearBtn.isDisplayed();
								boolean actRmaOkBtn                    = rmaOkBtn.isDisplayed();
								boolean actRmaCancelBtn                = rmaCancelBtn.isDisplayed();
								boolean actRmaCloseBtn                 = rmaCloseBtn.isDisplayed();
								
								boolean exprmaSerialNumberTxtField     = true;
								boolean exprmaQuantityTxtField         = true;
								boolean exprmaAddBtn                   = true;
								boolean exprmaNumberofItemsLabel       = true;
								boolean exprmaTableHeadingRMA          = true;
								boolean exprmaTableHeadingDocumentNo   = true;
								boolean exprmaTableHeadingDocumentDate = true;
								boolean exprmaClearBtn                 = true;
								boolean exprmaOkBtn                    = true;
								boolean exprmaCancelBtn                = true;
								boolean exprmaCloseBtn                 = true;

								System.out.println("Rma Serial Number Text Field 	   : " + actRmaSerialNumberTxtField	    +   "  Value Expected : " + exprmaSerialNumberTxtField);
								System.out.println("Rma Qty Field              	 	   : " + actRmaQuantityTxtField		    +   "  Value Expected : " + exprmaQuantityTxtField);
								System.out.println("Rma Add Button 					   : " + actRmaAddBtn				    +   "  Value Expected : " + exprmaAddBtn);
								System.out.println("Rma Number Of Items 			   : " + actRmaNumberofItemsLabel	    +   "  Value Expected : " + exprmaNumberofItemsLabel);
								System.out.println("Rma Table heading Rma  			   : " + actRmaTableHeadingRMA		    +   "  Value Expected : " + exprmaTableHeadingRMA);
								System.out.println("Rma Table Heading Document Number  : " + actRmaTableHeadingDocumentNo   +   "  Value Expected : " + exprmaTableHeadingDocumentNo);
								System.out.println("Rma Table Heading Document Date    : " + actRmaTableHeadingDocumentDate +   "  Value Expected : " + exprmaTableHeadingDocumentDate);
								System.out.println("Rma Clear Button                   : " + actRmaClearBtn				    +   "  Value Expected : " + exprmaClearBtn);
								System.out.println("Rma Ok Button                      : " + actRmaOkBtn					+   "  Value Expected : " + exprmaOkBtn);
								System.out.println("Rma Cancel Button                  : " + actRmaCancelBtn				+   "  Value Expected : " + exprmaCancelBtn);
								System.out.println("Rma Close Button  				   : " + actRmaCloseBtn				    +   "  Value Expected : " + exprmaCloseBtn);
								
								
								
								boolean actM = actRmaSerialNumberTxtField==exprmaSerialNumberTxtField && actRmaQuantityTxtField==exprmaQuantityTxtField  && actRmaAddBtn==exprmaAddBtn
													&& actRmaNumberofItemsLabel==exprmaNumberofItemsLabel && actRmaNumberofItemsLabel==exprmaTableHeadingRMA
													&& actRmaTableHeadingDocumentNo==exprmaTableHeadingDocumentNo && actRmaTableHeadingDocumentDate==exprmaTableHeadingDocumentDate
													&& actRmaClearBtn==exprmaClearBtn && actRmaOkBtn==exprmaOkBtn && actRmaCancelBtn==exprmaCancelBtn && actRmaCloseBtn==exprmaCloseBtn;
								
								String actRes = Boolean.toString(actMethod);
								
								excelReader.setCellData(xlfile, xlSheetName, 174, 8, actResult.toUpperCase());
									
*/								
								
							
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
								rmaSerialNumberTxtField.click();
								rmaSerialNumberTxtField.sendKeys("HYDS@1");
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
								rmaAddBtn.click();
								
								Thread.sleep(2000);
								
								
						/*		
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow2Column1));
								String actRmavalueR3=rmaTableRow2Column1.getText();
								String expRmavalueR3="HYDS@2";
													
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow12Column1));
								String actRmavalueR12=rmaTableRow12Column1.getText();
								String expRmavalueR12="HYDS@12";
										
								
								System.out.println("Rma value Row 4 In Rma Pop Up Different Serial No : "+actRmavalueR3+"  Value Expected : "+expRmavalueR3);
								System.out.println("Rma value Row 4 In Rma Pop Up Different Serial No : "+actRmavalueR12+"  Value Expected : "+expRmavalueR12);
*/								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
								rmaOkBtn.click();
								
								
							/*	String actGetRMANosInVoucher =enter_RMA.getAttribute("value");
								String expGetRMANosInVoucher ="HYDS@1,HYDS@2,HYDS@3,HYDS@4,HYDS@5,HYDS@6,HYDS@7,HYDS@8,HYDS@9,HYDS@10,HYDS@11,HYDS@12";
								
								System.out.println("Rma value Row 3 In Rma Pop Up Different Serial No : "+actGetRMANosInVoucher+"  Value Expected : "+expGetRMANosInVoucher);
								
								System.out.println(enter_RMA.getAttribute("value"));
								System.out.println(enter_RMA.getText());
							*/	
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
								enter_RMA.sendKeys(Keys.TAB);
								
								

								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_5thColumn));
								select4thRow_5thColumn.click();
							   		    
								
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
								enter_Gross.sendKeys(Keys.TAB);

							/*	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_3rdColumn));
								String act1            = select4thRow_3rdColumn.getText();
								String act2            = select4thRow_4thColumn.getText();
								String act3            = select4thRow_5thColumn.getText();
							
								String exp1,exp2,exp3,exp4;
								
								exp1                   = "1.00";
								exp2                   = "12.00";
								exp3                   = "12.00";
								
								excelReader.setCellData(xlfile, xlSheetName, 221, 8, act1);
								excelReader.setCellData(xlfile, xlSheetName, 222, 8, act2);
								excelReader.setCellData(xlfile, xlSheetName, 223, 8, act3);
								
								System.out.println("Stock Item Qty Value Actual   : " + act1 + "  Value Expected : " + exp1);
								System.out.println("Stock Item Rate Value Actual  : " + act2 + "  Value Expected : " + exp2);				
								System.out.println("Stock Item Gross Value Actual : " + act3 + "  Value Expected : " + exp3);
											
*/
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
						        String docno=documentNumberTxt.getAttribute("value");
								
						        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
								saveBtn.click();
								
								boolean actVoucherSaveMessageWithDocumentNo  = checkVoucherSavingMessage(docno);
								boolean expVoucherSaveMessageWithDocumentNo  = true;
								
												
								System.out.println("Voucher Saving Message With Document No :  " + actVoucherSaveMessageWithDocumentNo + " Value Expected : "+ expVoucherSaveMessageWithDocumentNo);

								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
								previousBtn.click();
								
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
						        String docn=documentNumberTxt.getAttribute("value");
								
						        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_SuspendBtn));
								new_SuspendBtn.click();
							
						     	
								boolean savingMessage=checkVoucherSavingMessage(docn);
								
								System.out.println("Suspend SavingMessage  :  " + savingMessage + " Value Expected : " + " TRUE ");
								
								
								
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
								new_CloseBtn.click();
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendStatusRow1));
								String actSuspendStatusR1=suspendStatusRow1.getText();
								
								String expSuspendStatusR1=excelReader.getCellData(xlSheetName, 432, 7);
								
								excelReader.setCellData(xlfile, xlSheetName, 432, 8, actSuspendStatusR1);

								System.out.println("Suspend Status in Home Page Value Actual  :  " + actSuspendStatusR1 + " Value Expected : " + expSuspendStatusR1);
								
								
								
								//Home Page Column Headings
						        int headerTxtCount		= headerTxtList.size();
								
								ArrayList<String> headerTxt = new ArrayList<String>();
								
								for (int i = 2; i < headerTxtCount; i++) 
								{
									String data=headerTxtList.get(i).getText();
									headerTxt.add(data);
								}
								
								String actHeaderTxt = headerTxt.toString();
								String expHeaderTxt = excelReader.getCellData(xlSheetName, 433, 7);
								excelReader.setCellData(xlfile, xlSheetName, 433, 8, actHeaderTxt);
								
								System.out.println("actopeningStocksNewHomePageColumnsButtons  : " + actHeaderTxt);
								System.out.println("expopeningStocksNewHomePageColumnsButtons  : " + expHeaderTxt);
								
								System.out.println("Count Of Header Columns in Home Page Value Actual    :  " + actHeaderTxt );
								System.out.println("Count Of Header Columns in Home Page Value Expected  :  " + expHeaderTxt );
										
								String actHomePageVoucherNo     = openingStocksNewHomeRow1VoucherNo.getText();
								String actHomePageCreatedBy     = openingStocksNewHomeRow1CreatedBy.getText();
								String actHomePageModifiedBy    = openingStocksNewHomeRow1ModifiedBy.getText();
								String actHomePageSuspendBy     = openingStocksNewHomeRow1SuspendStatus.getText();
								String actHomePageAuthorizedBy  = openingStocksNewHomeRow1AuthorizationStatus.getText();
								
								String expHomePageVoucherNo     = excelReader.getCellData(xlSheetName, 434, 7);
								String expHomePageCreatedBy     = excelReader.getCellData(xlSheetName, 435, 7);
								String expHomePageModifiedBy    = excelReader.getCellData(xlSheetName, 436, 7);
								String expHomePageSuspendBy     = excelReader.getCellData(xlSheetName, 437, 7);
								String expHomePageAuthorizeBy   = excelReader.getCellData(xlSheetName, 438, 7);
								
								excelReader.setCellData(xlfile, xlSheetName, 434, 8, actHomePageVoucherNo);
								excelReader.setCellData(xlfile, xlSheetName, 435, 8, actHomePageCreatedBy);
								excelReader.setCellData(xlfile, xlSheetName, 436, 8, actHomePageModifiedBy);
								excelReader.setCellData(xlfile, xlSheetName, 437, 8, actHomePageSuspendBy);
								excelReader.setCellData(xlfile, xlSheetName, 438, 8, actHomePageAuthorizedBy);
								
								System.out.println("Voucher No in Home Page Value Actual   :  " + actHomePageVoucherNo+    " Value Expected : " + expHomePageVoucherNo);
								System.out.println("Created By in Home Page Value Actual   :  " + actHomePageCreatedBy+    " Value Expected : " + expHomePageCreatedBy);
								System.out.println("Modified By in Home Page Value Actual  :  " + actHomePageModifiedBy+   " Value Expected : " + expHomePageModifiedBy);
								System.out.println("Suspend By in Home Page Value Actual   :  " + actHomePageSuspendBy+    " Value Expected : " + expHomePageSuspendBy);
								System.out.println("Authorize By in Home Page Value Actual :  " + actHomePageAuthorizedBy+ " Value Expected : " + expHomePageAuthorizeBy);
								
								int actopeningStocksNewHomePageTableRowsCount = openingStocksNewHomePageTableRowsCount.size();
								
								String actRowCountInHomePage = Integer.toString(actopeningStocksNewHomePageTableRowsCount);
								String expRowCountInHomePage = excelReader.getCellData(xlSheetName, 439, 7);
								
								excelReader.setCellData(xlfile, xlSheetName, 439, 8, actRowCountInHomePage);
								
								System.out.println("Row Count in Home Page Value Actual  :  " + actRowCountInHomePage + " Value Expected : " + expRowCountInHomePage);
											
							
								 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameDisplayInHomePage));
								 
								 String actcreateViewNameDisplayInHomePage = createViewNameToEditInHomePage.getText();
								 String expcreateViewNameDisplayInHomePage = excelReader.getCellData(xlSheetName, 440, 7);
									
								excelReader.setCellData(xlfile, xlSheetName, 440, 8, actcreateViewNameDisplayInHomePage);
								 
								 System.out.println("View Display In Home page Value Actual    : " + actcreateViewNameDisplayInHomePage   +     "	 Value Expected : " + expcreateViewNameDisplayInHomePage);
								 
								
								if(actSuspendStatusR1.equalsIgnoreCase(expSuspendStatusR1) && actHeaderTxt.equalsIgnoreCase(expHeaderTxt)
										&& actRowCountInHomePage.equalsIgnoreCase(expRowCountInHomePage)&& actcreateViewNameDisplayInHomePage.equalsIgnoreCase(expcreateViewNameDisplayInHomePage))
								{
									System.out.println("Test Pass : Suspended Succesfully");
												
									excelReader.setCellData(xlfile, xlSheetName, 431, 9, resPass);
									return true;
								}
								else
								{
									System.out.println("Test Fail : NOT Suspended Succesfully");
					
									excelReader.setCellData(xlfile, xlSheetName, 431, 9, resFail);
									return false;
								}
							}
							catch (Exception e) 
							{
								String exception =e.getMessage().substring(0, 50);
								excelReader.setExceptionInExcel(xlfile, xlSheetName, 431, 10, e.getMessage());
								System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
								return false;
							}
						}
						

						
						
						public boolean checkOpeningStocksNewVoucherClickOnSuspendView() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
						{
							excelReader=new ExcelReader(POJOUtility.getExcelPath());
							xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
								
							try
							{
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameToEditInHomePage));
								createViewNameToEditInHomePage.click();
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
							
								boolean actHomePageNewBtnIsDisplayed = newBtn.isDisplayed();
								boolean actHomePageEditBtn           = editBtn.isDisplayed();		
								boolean actHomePagePrintBtn          = printBtn.isDisplayed();
								boolean actHomePageDeleteBtn         = deleteBtn.isDisplayed();
								boolean actHomePageSuspendBtn        = suspendBtn.isDisplayed();
								boolean actHomePagePrintBarcodeBtn   = printBarCodeBtn.isDisplayed();
								boolean actHomePageExportXMLBtn      = exportToXMLBtn.isDisplayed();
								boolean actHomePageSettingsBtn       = settingsBtn.isDisplayed();
								boolean actHomePageCloseBtn          = homeCloseBtn.isDisplayed();
								boolean actHomePageGridCheckBox      = grid_HeaderChkBox.isDisplayed();
								boolean actHomePageSortingBtn        = sortingBtn.isDisplayed();
								boolean actHomePageCreateViewBn      = createViewBtn.isDisplayed();
								boolean actHomePageCustomizeBtn      = customizeBtn.isDisplayed();
								boolean actHomePageFilterBtn         = filterBtn.isDisplayed();
								boolean actHomePageRefreshBtn        = refreshBtn.isDisplayed();
								boolean actHomePageOptionsBtn        = optionsBtn.isDisplayed();
								boolean actHomePageExportBtn         = exportBtn.isDisplayed();
								
								boolean expHomePageNewBtnIsDisplayed = true;	
								boolean expHomePageEditBtn           = true;
								boolean expHomePagePrintBtn          = true;
								boolean expHomePageDeleteBtn         = true;
								boolean expHomePageSuspendBtn        = true;
								boolean expHomePagePrintBarcodeBtn   = true;
								boolean expHomePageExportXMLBtn      = true;
								boolean expHomePageSettingsBtn       = true;
								boolean expHomePageCloseBtn          = true;
								boolean expHomePageGridCheckBox      = true;
								boolean expHomePageSortingBtn        = true;
								boolean expHomePageCreateViewBn      = true;
								boolean expHomePageCustomizeBtn      = true;
								boolean expHomePageFilterBtn         = true;
								boolean expHomePageRefreshBtn        = false;
								boolean expHomePageOptionsBtn        = true;
								boolean expHomePageExportBtn         = true;
								
								System.out.println("Home Page New Btn Value Actual           : " + actHomePageNewBtnIsDisplayed+ "  Value Expected : " + expHomePageNewBtnIsDisplayed);
								System.out.println("Home Page Edit Btn Value Actual          : " + actHomePageEditBtn+           "  Value Expected : " + expHomePageEditBtn);
								System.out.println("Home Page Print Btn Value Actual         : " + actHomePagePrintBtn+          "	Value Expected : " + expHomePagePrintBtn);
								System.out.println("Home Page Delete Btn Value Actual        : " + actHomePageDeleteBtn+         "	Value Expected : " + expHomePageDeleteBtn);
								System.out.println("Home Page Suspend Btn Value Actual       : " + actHomePageSuspendBtn+        "	Value Expected : " + expHomePageSuspendBtn);
								System.out.println("Home Page Print Barcode Btn Value Actual : " + actHomePagePrintBarcodeBtn+   "	Value Expected : " + expHomePagePrintBarcodeBtn);
								System.out.println("Home Page Export XML Btn Value Actual    : " + actHomePageExportXMLBtn+      "	Value Expected : " + expHomePageExportXMLBtn);
								System.out.println("Home Page Settings Btn Value Actual      : " + actHomePageSettingsBtn+       "	Value Expected : " + expHomePageSettingsBtn);
								System.out.println("Home Page Close Btn Value Actual         : " + actHomePageCloseBtn+          "	Value Expected : " + expHomePageCloseBtn);
								System.out.println("Home Page Grid check Value Actual        : " + actHomePageGridCheckBox+      "	Value Expected : " + expHomePageGridCheckBox);
								System.out.println("Home Page Sorting Btn Value Actual       : " + actHomePageSortingBtn+        "	Value Expected : " + expHomePageSortingBtn);
								System.out.println("Home Page Create View Btn Value Actual   : " + actHomePageCreateViewBn+      "	Value Expected : " + expHomePageCreateViewBn);
								System.out.println("Home Page Customize Btn Value Actual     : " + actHomePageCustomizeBtn+      "	Value Expected : " + expHomePageCustomizeBtn);
								System.out.println("Home Page Filter check Value Actual      : " + actHomePageFilterBtn+         "	Value Expected : " + expHomePageFilterBtn);
								System.out.println("Home Page Refesh Btn Value Actual        : " + actHomePageRefreshBtn+        "	Value Expected : " + expHomePageRefreshBtn);
								System.out.println("Home Page Options Btn Value Actual       : " + actHomePageOptionsBtn+        "	Value Expected : " + expHomePageOptionsBtn);
								System.out.println("Home Page Export Btn Value Actual        : " + actHomePageExportBtn+         "  Value Expected : " + expHomePageExportBtn);
								
								int count				                 = openingStocksNewToolBarButtons.size();
								
								ArrayList<String> actbuttons             = new ArrayList<String>();
								
								for (int i = 0; i < count; i++) 
								{
									String data                          = openingStocksNewToolBarButtons.get(i).getText();
									actbuttons.add(data);
								}
								    
								String actopeningStocksNewToolBarButtons = actbuttons.toString();
								String expopeningStocksNewToolBarButtons = excelReader.getCellData(xlSheetName, 1259, 7);
						 		
				                excelReader.setCellData(xlfile, xlSheetName, 1259, 8, actopeningStocksNewToolBarButtons); 
							
								System.out.println("actopeningStocksNewToolBarButtons  : " + actopeningStocksNewToolBarButtons);
								System.out.println("expopeningStocksNewToolBarButtons  : " + expopeningStocksNewToolBarButtons);
								
								excelReader.setCellData(xlfile, "Sheet7", 17, 8, actopeningStocksNewToolBarButtons);	
								
								String actsetAsDefaultView		=	setAsDefaultView.getText();
								String expsetAsDefaultView		=	excelReader.getCellData(xlSheetName, 1260, 7);
						 		
				                excelReader.setCellData(xlfile, xlSheetName, 1260, 8, actsetAsDefaultView); 
								
								
								//Ribbon Control Icons
						        int count1		= headingOptions.size();
								
								ArrayList<String> headingButtons = new ArrayList<String>();
								
								for (int i = 1; i < count1; i++) 
								{
									String data=headingOptions.get(i).getAttribute("title");
									
									headingButtons.add(data);
								}
								
								String actHeadingButtons = headingButtons.toString();
								String expHeadingButtons = excelReader.getCellData(xlSheetName, 1261, 7);
						 		
				                excelReader.setCellData(xlfile, xlSheetName, 1261, 8, actHeadingButtons); 
								
								
								System.out.println("actopeningStocksNewHeadingButtons  : " + actHeadingButtons);
								System.out.println("expopeningStocksNewHeadingButtons  : " + expHeadingButtons);
								
								//Home Page Column Headings
						        int headerTxtCount		= headerTxtList.size();
								
								ArrayList<String> headerTxt = new ArrayList<String>();
								
								for (int i = 2; i < headerTxtCount; i++) 
								{
									String data=headerTxtList.get(i).getText();
									headerTxt.add(data);
								}
								
								String actHeaderTxt = headerTxt.toString();
								String expHeaderTxt = "[New,   Edit  , Print, Delete, Suspend, , Print barcode, Export to XML, Setting, Close]";
						 		
				                excelReader.setCellData(xlfile, xlSheetName, 1262, 8, actHeaderTxt);
								
								
								System.out.println("actopeningStocksNewHomePageColumnsButtons  : " + actHeaderTxt);
								System.out.println("expopeningStocksNewHomePageColumnsButtons  : " + expHeaderTxt);
								
								
								System.out.println("Count Of Header Columns in Suspend View Home Page Value Actual  :  " + actHeaderTxt + " Value Expected : " + expHeaderTxt);
								
								String actHomePageVoucherNo     = openingStocksNewHomeRow1VoucherNo.getText();
								String actHomePageCreatedBy     = openingStocksNewHomeRow1CreatedBy.getText();
								String actHomePageModifiedBy    = openingStocksNewHomeRow1ModifiedBy.getText();
								String actHomePageSuspendBy     = openingStocksNewHomeRow1SuspendStatus.getText();
								String actHomePageAuthorizedBy  = openingStocksNewHomeRow1AuthorizationStatus.getText();
								
								String expHomePageVoucherNo     = "2";
								String expHomePageCreatedBy     = "SU";
								String expHomePageModifiedBy    = "SU";
								String expHomePageSuspendBy     = "True";
								String expHomePageAuthorizeBy   = "Authorized";
								
								System.out.println("Voucher No in Home Page Value Actual   :  " + actHomePageVoucherNo+    " Value Expected : " + expHomePageVoucherNo);
								System.out.println("Created By in Home Page Value Actual   :  " + actHomePageCreatedBy+    " Value Expected : " + expHomePageCreatedBy);
								System.out.println("Modified By in Home Page Value Actual  :  " + actHomePageModifiedBy+   " Value Expected : " + expHomePageModifiedBy);
								System.out.println("Suspend By in Home Page Value Actual   :  " + actHomePageSuspendBy+    " Value Expected : " + expHomePageSuspendBy);
								System.out.println("Authorize By in Home Page Value Actual :  " + actHomePageAuthorizedBy+ " Value Expected : " + expHomePageAuthorizeBy);
								
								int actRowCountInHomePage = openingStocksNewHomePageTableRowsCount.size();
								int expRowCountInHomePage = 1;
								
								System.out.println("Row Count in Suspend View Home Page Value Actual  :  " + actRowCountInHomePage + " Value Expected : " + expRowCountInHomePage);
														
								if(actHomePageNewBtnIsDisplayed==expHomePageNewBtnIsDisplayed  && actHomePageEditBtn==expHomePageEditBtn && actHomePagePrintBtn==expHomePagePrintBtn
										&& actHomePageDeleteBtn==expHomePageDeleteBtn  && actHomePageSuspendBtn==expHomePageSuspendBtn 
									    && actHomePagePrintBarcodeBtn==expHomePagePrintBarcodeBtn && actHomePageExportXMLBtn==expHomePageExportXMLBtn
										&& actHomePageSettingsBtn==expHomePageSettingsBtn && actHomePageCloseBtn==expHomePageCloseBtn && actHomePageGridCheckBox==expHomePageGridCheckBox
										&& actHomePageSortingBtn==expHomePageSortingBtn && actHomePageCreateViewBn==expHomePageCreateViewBn && actHomePageCustomizeBtn==expHomePageCustomizeBtn
										&& actHomePageFilterBtn==expHomePageFilterBtn && actHomePageRefreshBtn==expHomePageRefreshBtn && actHomePageOptionsBtn==expHomePageOptionsBtn
										&& actHomePageExportBtn==expHomePageExportBtn  
										&& actopeningStocksNewToolBarButtons.equalsIgnoreCase(expopeningStocksNewToolBarButtons)
										&& actHeadingButtons.equalsIgnoreCase(expHeadingButtons)
										&& actHeaderTxt.equalsIgnoreCase(expHeaderTxt))
								{
									System.out.println("Test Pass :Suspended Vouchers  Are Displayed");
									excelReader.setCellData(xlfile, xlSheetName, 1258, 9, resPass);
									return true;
								}
								else
								{
									System.out.println("Test Fail : Suspended Vouchers Are NOT Displayed");
									excelReader.setCellData(xlfile, xlSheetName, 1258, 9, resFail);
									return false;
								}
							}
							 
							catch (Exception e) 
							  {
								  String exception =e.getMessage();
								  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1258, 10, exception);
								  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
								  return false;
							  }
							    }
						
					
				
				
				
						
				
						public boolean checkOpeningStocksNewVoucherCloseButtonInHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
						{
							
							excelReader=new ExcelReader(POJOUtility.getExcelPath());
							xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
							
							try
							{
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
								voucherhomeCloseBtn.click();
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
								String actUserInfo = userNameDisplay.getText();
								String expUserInfo = excelReader.getCellData(xlSheetName, 453, 7);
								
								excelReader.setCellData(xlfile, xlSheetName, 453, 8, actUserInfo);
								
								System.out.println("User Name Display Value Actual                   : " + actUserInfo +             " Value Expected : " + expUserInfo);
					
								Thread.sleep(2000);
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
								companyLogo.click();
								
						        //Thread.sleep(2000);
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
								String actGetLoginCompanyNameInformation = companyName.getText();
								String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 19);
								String expGetLoginCompanyName            = excelReader.getCellData(xlSheetName, 454, 7);
								companyLogo.click();
								
								excelReader.setCellData(xlfile, xlSheetName, 454, 8, actGetLoginCompanyName);
								
								System.out.println("Company Name Display Value Actual                : " + actGetLoginCompanyName +  " Value Expected : " + expGetLoginCompanyName);
								
								getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
								
								boolean actlabelDashboard=labelDashboard.isDisplayed();
								boolean actselectDashboard=selectDashboard.isDisplayed();
								boolean actnewAddDashBoard=newAddDashBoard.isDisplayed();
								boolean actdashboardCustomizationSettings=dashboardCustomizationSettings.isDisplayed();
								
								boolean explabelDashboard=true;
								boolean expselectDashboard=true;
								boolean expnewAddDashBoard=true;
								boolean expdashboardCustomizationSettings=true;
								
								System.out.println("labelDashboard  : "+actlabelDashboard+" "+explabelDashboard);
								System.out.println("selectDashboard  : "+actselectDashboard+" "+expselectDashboard);
								System.out.println("newAddDashBoard  : "+actnewAddDashBoard+" "+expnewAddDashBoard);
								System.out.println("dashboardCustomizationSettings  : "+actdashboardCustomizationSettings+" "+expdashboardCustomizationSettings);
								
								boolean actMethod = actlabelDashboard==explabelDashboard && actselectDashboard==expselectDashboard && actnewAddDashBoard==expnewAddDashBoard
													&& actdashboardCustomizationSettings==expdashboardCustomizationSettings;
								
								String actResult = Boolean.toString(actMethod);
								
								excelReader.setCellData(xlfile, xlSheetName, 452, 8, actResult.toUpperCase());
								
								if(actUserInfo.equalsIgnoreCase(expUserInfo) && actGetLoginCompanyName.equalsIgnoreCase(expGetLoginCompanyName) && actMethod==true)
								{
									System.out.println("test pass : Document History Pop Displayed");
									excelReader.setCellData(xlfile, xlSheetName, 452, 9, resPass);
									return true;
								}
								else
								{
									System.out.println("test Fail : Document History Pop NOT Displayed");
									excelReader.setCellData(xlfile, xlSheetName, 452, 9, resFail);
									return false;
								}
							}
							catch (Exception e) 
							{
								excelReader.setExceptionInExcel(xlfile, xlSheetName, 452, 10, e.getMessage());
								System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
								return false;
							}
						}
						
		
						
	// Opening Balance Voucher
						
						
	//Financials Menu // Opening Balance Voucher Page
	   
	@FindBy(xpath="//*[@id='60']/div")
	private static WebElement  financialsMenu; 
	
		@FindBy(xpath="//*[@id='61']/span")
		private static WebElement  financialsTransactionMenu; 		
	
			@FindBy(xpath="//*[@id='2001']/span")
			private static WebElement  cashAndBankMenu; 
			
	     		@FindBy(xpath="//*[@id='2002']/span")
				private static WebElement  receiptsVoucher;
				
				@FindBy(xpath="//*[@id='2003']/span")
				private static WebElement  paymentsVoucher;
				
				@FindBy(xpath="//*[@id='2004']/span")
				private static WebElement  pettyVoucher;
				
				@FindBy(xpath="//*[@id='2005']/span")
				private static WebElement  postDatedReceiptsVoucher;
							
				@FindBy(xpath="//*[@id='2006']/span")
				private static WebElement  postDatedPaymentsVoucher;
				
				@FindBy(xpath="//*[@id='108']/span")
				private static WebElement  defineChequeSeries;
				
				@FindBy(xpath="//*[@id='109']/span")
				private static WebElement  cancelCheque;				
	
			@FindBy(xpath="//*[@id='2007']/span")
			private static WebElement  financialsTransactionsPurchaseMenu; 
			
				@FindBy(xpath="//*[@id='2008']/span")
				private static WebElement  purchaseVoucher;
				
				@FindBy(xpath="//*[@id='2009']/span")
				private static WebElement  purchaseReturnsVoucher;
										
			@FindBy(xpath="//*[@id='2014']/span")
			private static WebElement  financialsTransactionsSalesMenu;
				
				@FindBy(xpath="//*[@id='2015']/span")
				private static WebElement  salesInvoicesVoucher;
				
				@FindBy(xpath="//*[@id='2016']/span")
				private static WebElement  salesReturnsVoucher;
				
				@FindBy(xpath="//*[@id='2020']/span")
				private static WebElement  cashSales;
						
				@FindBy(xpath="//*[@id='2021']/span")
				private static WebElement  hirePurchaseSales;
			
			@FindBy(xpath="//*[@id='2023']/span")
			private static WebElement  financialsTransactionsJournalsMenu;
			
			    @FindBy(xpath="//*[@id='2032']/span")
				private static WebElement  journalsEntriesVoucher;
				
				@FindBy(xpath="//*[@id='2025']/span")
				private static WebElement  forexJVVoucher;
				
				@FindBy(xpath="//*[@id='2029']/span")
				private static WebElement  interdepartmentaljvVoucher;
				
				@FindBy(xpath="//*[@id='2024']/span")
				private static WebElement  oldJouranlEntriesVoucher;
				
				@FindBy(xpath="//*[@id='2026']/span")
				private static WebElement  debitNotesVoucher;
				
				@FindBy(xpath="//*[@id='2030']/span")
				private static WebElement  debitNotesLinewiseVoucher;
				
				@FindBy(xpath="//*[@id='2027']/span")
				private static WebElement  creditNotesVoucher;
				
				@FindBy(xpath="//*[@id='2031']/span")
				private static WebElement  creditNotesLinewiseVoucher;
				
				@FindBy(xpath="//*[@id='2028']/span")
				private static WebElement  openingBalancesVoucher;
				
				@FindBy(xpath="//*[@id='2046']/span")
				private static WebElement  fixedAssetsDepreciationVoucher;
			
			@FindBy(xpath="//*[@id='219']/span")
			private static WebElement  financialsTransactionsAutoPostingsMenu;
			
				@FindBy(xpath="//*[@id='77']/span")
				private static WebElement  recurringJournalVoucher;
				
				@FindBy(xpath="//*[@id='79']/span")
				private static WebElement  postRecurringJournal;
				
				@FindBy(xpath="//*[@id='92']/span")
				private static WebElement  recurringJournalTemplate;
				
				@FindBy(xpath="//*[@id='91']/span")
				private static WebElement  postInterest;
				
				@FindBy(xpath="//*[@id='90']/span")
				private static WebElement  convertMaturedPDCs;
				
				@FindBy(xpath="//*[@id='161']/span")
				private static WebElement assignPDCLimit;
				
				@FindBy(xpath="//*[@id='166']/span")
				private static WebElement  stockReplenishment;
	
		@FindBy(xpath="//*[@id='62']/span")
		private static WebElement  financialsCreditManagementMenu; 
		
			@FindBy(xpath="//*[@id='63']/span")
			private static WebElement  paymentTerms;
			
			@FindBy(xpath="//*[@id='64']/span")
			private static WebElement  financeTerms;
			
			@FindBy(xpath="//*[@id='65']/span")
			private static WebElement  reminderTerms;		
			
			@FindBy(xpath="//*[@id='89']/span")
			private static WebElement  sendReminder;
			
			@FindBy(xpath="//*[@id='217']/span")
			private static WebElement  delinquency;
			
				@FindBy(xpath="//*[@id='73']/span")
				private static WebElement  questionnarie;
				
				@FindBy(xpath="//*[@id='218']/span")
				private static WebElement  delinquencyMgmt;
				
			@FindBy(xpath="//*[@id='35']/span")
			private static WebElement  creidtApproval;
			
	    @FindBy(xpath="//*[@id='81']/span")
	    private static WebElement  financialsReportsMenu; 	
	    
	    @FindBy(xpath="//*[@id='530']/span")
	    private static WebElement  financialsFinalAccountsMenu; 

		@FindBy(xpath="//*[@id='558']/span")
		private static WebElement  financialsReceivableAndPayableAnalysisMenu; 
		
		@FindBy(xpath="//*[@id='3301']/span")
		private static WebElement  financialsBudgetMenu; 
		
		@FindBy(xpath="//*[@id='3311']/span")
		private static WebElement  financialsOnlinePaymentsMenu;   
		
		@FindBy(xpath = "//ul[@id='navigation_menu']/li[2]/ul/li/a/span")
		private static List<WebElement> financialsMenusList;
	
					
	public static boolean checkFinancialsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	  try
	  {
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		
		boolean actFinancialsTransactionsMenuIsDisplay      = financialsTransactionMenu.isDisplayed();
    	boolean actFinancialsCreditManagementMenuIsDisplay  = financialsCreditManagementMenu.isDisplayed(); 	
    	boolean actFinancialsReportsMenuIsDisplay           = financialsReportsMenu.isDisplayed();
    	boolean actFinancialsFinalAccountsMenuIsDisplay     = financialsFinalAccountsMenu.isDisplayed();
    	boolean actFinancialsReceivablePayableMenuIsDisplay = financialsReceivableAndPayableAnalysisMenu.isDisplayed();
    	boolean actFinancialsBudgetMenuIsDisplay            = financialsBudgetMenu.isDisplayed();
    	boolean actFinancialsOnlinePaymentMenuIsDisplay     = financialsOnlinePaymentsMenu.isDisplayed();
    		    	
		boolean expFinancialsTransactionsMenuIsDisplay      = true;
    	boolean expFinancialsCreditManagementMenuIsDisplay  = true; 	
    	boolean expFinancialsReportsMenuIsDisplay           = true;
    	boolean expFinancialsFinalAccountsMenuIsDisplay     = true;
    	boolean expFinancialsReceivablePayableMenuIsDisplay = true;
    	boolean expFinancialsBudgetMenuIsDisplay            = true;
    	boolean expFinancialsOnlinePaymentMenuIsDisplay     = true;
    	    	
    	System.out.println("FinancialsTransactionsMenuDisplay     : " + actFinancialsTransactionsMenuIsDisplay   +    "  Value Expected  " + expFinancialsTransactionsMenuIsDisplay);	
    	System.out.println("FinancialsCreditManagementMenuDisplay : " + actFinancialsCreditManagementMenuIsDisplay  + "  Value Expected  " + expFinancialsCreditManagementMenuIsDisplay); 	
    	System.out.println("FinancialsReportsMenuDisplay          : " + actFinancialsReportsMenuIsDisplay   +         "  Value Expected  " + expFinancialsReportsMenuIsDisplay);	   
     	System.out.println("FinancialsFinalAccountsMenuDisplay    : " + actFinancialsReportsMenuIsDisplay  +          "  Value Expected  " + expFinancialsFinalAccountsMenuIsDisplay); 	
    	System.out.println("FinancialsReportsMenuDisplay          : " + actFinancialsReceivablePayableMenuIsDisplay + "  Value Expected  " + expFinancialsReceivablePayableMenuIsDisplay);
      	System.out.println("FinancialsCreditManagementMenuDisplay : " + actFinancialsBudgetMenuIsDisplay  +           "  Value Expected  " + expFinancialsBudgetMenuIsDisplay); 	
    	System.out.println("FinancialsReportsMenuDisplay          : " + actFinancialsOnlinePaymentMenuIsDisplay   +   "  Value Expected  " + expFinancialsOnlinePaymentMenuIsDisplay);
   		     	
   
    	int count										  = financialsMenusList.size();
    	
    	ArrayList<String> actList  = new ArrayList<String>();
    	
    	for (int i = 0; i < count; i++) 
    	{
    		String data		                              = financialsMenusList.get(i).getText();
    		actList.add(data);
		}
    	
    	String actFinancialsMenusList					  = actList.toString();
    	String expFinancialsMenusList					  = excelReader.getCellData(xlSheetName, 1000, 7);
			    	
    	System.out.println("Financials Menu Names Display Text Actual Values      :  " + actFinancialsMenusList);
    	System.out.println("Financials Menu Names Display Text Expected Values    :  " + expFinancialsMenusList);
    	
    	excelReader.setCellData(xlfile, xlSheetName, 1000, 8, actFinancialsMenusList);
    	
		if(actFinancialsTransactionsMenuIsDisplay==expFinancialsTransactionsMenuIsDisplay  
				&& actFinancialsCreditManagementMenuIsDisplay==expFinancialsCreditManagementMenuIsDisplay
				&& actFinancialsReportsMenuIsDisplay==expFinancialsReportsMenuIsDisplay 
				&& actFinancialsFinalAccountsMenuIsDisplay==expFinancialsFinalAccountsMenuIsDisplay
				&& actFinancialsReceivablePayableMenuIsDisplay==expFinancialsReceivablePayableMenuIsDisplay
				&& actFinancialsBudgetMenuIsDisplay==expFinancialsBudgetMenuIsDisplay
				&& actFinancialsOnlinePaymentMenuIsDisplay==expFinancialsOnlinePaymentMenuIsDisplay
				&& actFinancialsMenusList.equalsIgnoreCase(expFinancialsMenusList))
		{
			excelReader.setCellData(xlfile, xlSheetName, 999, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 999, 9, resFail);
			return false;
		}
	}	
	catch (Exception e) 
	{
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 999, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	}	
  }

		
	@FindBy(xpath="//*[@id='2067']/span")
	private static WebElement  nonjvVatVoucher;
	
	@FindBy(xpath="//span[contains(text(),'Debit Notes VAT')]")
	private static WebElement  debitNotesVatVoucher;
	
	@FindBy(xpath="//span[contains(text(),'Credit Notes VAT')]")
	private static WebElement  creditNotesVatVoucher;
	 
	@FindBy(xpath="//ul[@id='navigation_menu']/li[2]/ul/li[1]/ul/li[4]/ul/li/a/span")
	private static List<WebElement> financialsTransactionsJournalsMenus;
 
 
   public static boolean checkFinancialsMenuTransactionsMenuJournalsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsJournalsMenu));
		financialsTransactionsJournalsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalancesVoucher));
			
		boolean actJournalsEntriesVoucherIsDisplay         = journalsEntriesVoucher.isDisplayed();
    	boolean actForexJVVoucherIsDisplay                 = forexJVVoucher.isDisplayed(); 	
    	boolean actInterdepartmentalJVVoucherIsDisplay     = interdepartmentaljvVoucher.isDisplayed();
    	boolean actOldJournalEntriesVoucherIsDisplay       = oldJouranlEntriesVoucher.isDisplayed();
    	boolean actDebitNotesVoucherIsDisplay              = debitNotesVoucher.isDisplayed();
    	boolean actDebitNotesLineWiseVoucherIsDisplay      = debitNotesLinewiseVoucher.isDisplayed();
    	boolean actCreditNotesLineWiseVoucherIsDisplay     = creditNotesLinewiseVoucher.isDisplayed();
    	
     	boolean actDebitNotesVatVoucherIsDisplay           = debitNotesVatVoucher.isDisplayed();
    	boolean actCreditNotesVatVoucherIsDisplay          = creditNotesVatVoucher.isDisplayed();
    	
    	boolean actOpeningBalanceVoucherIsDisplay          = openingBalancesVoucher.isDisplayed();
    	boolean actFixedAssetsDepreciationVoucherIsDisplay = fixedAssetsDepreciationVoucher.isDisplayed();
    	
    		
		boolean expJournalsEntriesVoucherIsDisplay         = true;
    	boolean expForexJVVoucherIsDisplay                 = true; 	
    	boolean expInterdepartmentalJVVoucherIsDisplay     = true;
    	boolean expOldJournalEntriesVoucherIsDisplay       = true;
    	boolean expDebitNotesVoucherIsDisplay              = true;
    	boolean expDebitNotesLineWiseVoucherIsDisplay      = true;
    	boolean expCreditNotesLineWiseVoucherIsDisplay     = true;
    	
    	boolean expJVVatVoucherIsDisplay                   = true;
    	boolean expNonJvVatVoucherIsDisplay                = true;
    	boolean expDebitNotesVatVoucherIsDisplay           = true;
    	boolean expCreditNotesVatVoucherIsDisplay          = true;
    	
    	boolean expOpeningBalanceVoucherIsDisplay          = true;
    	boolean expFixedAssetsDepreciationVoucherIsDisplay = true;
    	    	
    	System.out.println("JournalsEntriesVoucherIsDisplay         : " + actJournalsEntriesVoucherIsDisplay   +           "  Value Expected  " + expJournalsEntriesVoucherIsDisplay);	
    	System.out.println("ForexJVVoucherIsDisplay                 : " + actForexJVVoucherIsDisplay  +                    "  Value Expected  " + expForexJVVoucherIsDisplay); 	
    	System.out.println("InterdepartmentalJVVoucherIsDisplay     : " + actInterdepartmentalJVVoucherIsDisplay   +       "  Value Expected  " + expInterdepartmentalJVVoucherIsDisplay);	   
     	System.out.println("OldJournalEntriesVoucherIsDisplay       : " + actOldJournalEntriesVoucherIsDisplay  +          "  Value Expected  " + expOldJournalEntriesVoucherIsDisplay); 	
    	System.out.println("DebitNotesVoucherIsDisplay              : " + actDebitNotesVoucherIsDisplay +                  "  Value Expected  " + expDebitNotesVoucherIsDisplay);
      	System.out.println("DebitNotesLineWiseVoucherIsDisplay      : " + actDebitNotesLineWiseVoucherIsDisplay  +         "  Value Expected  " + expDebitNotesLineWiseVoucherIsDisplay); 	
    	System.out.println("CreditNotesLineWiseVoucherIsDisplay     : " + actCreditNotesLineWiseVoucherIsDisplay   +       "  Value Expected  " + expCreditNotesLineWiseVoucherIsDisplay);
    	//System.out.println("JVVatVouchersIsDisplay                  : " + actJVVatVoucherIsDisplay   +                     "  Value Expected  " + expJVVatVoucherIsDisplay);
    	//System.out.println("NonJVVatVoucherIsDisplay                : " + actNonJvVatVoucherIsDisplay   +                  "  Value Expected  " + expNonJvVatVoucherIsDisplay);
    	System.out.println("DebitNotesVatVoucherIsDisplay           : " + actDebitNotesVatVoucherIsDisplay   +             "  Value Expected  " + expDebitNotesVatVoucherIsDisplay);
    	System.out.println("CreditNotesVatVoucherIsDisplay          : " + actCreditNotesVatVoucherIsDisplay   +            "  Value Expected  " + expCreditNotesVatVoucherIsDisplay);
    	System.out.println("OpeningBalanceVoucherIsDisplay          : " + actOpeningBalanceVoucherIsDisplay   +            "  Value Expected  " + expOpeningBalanceVoucherIsDisplay);		   		
    	System.out.println("FixedAssetsDepreciationVoucherIsDisplay : " + actFixedAssetsDepreciationVoucherIsDisplay +     "  Value Expected  " + actFixedAssetsDepreciationVoucherIsDisplay);
   	
		
		int actJournalsMenusCount				= financialsTransactionsJournalsMenus.size();
		int expJournalsMenusCount				= 14;
		
		System.out.println("JournalsMenusCount  : " + actJournalsMenusCount + "  value expected  " + expJournalsMenusCount);
		
		ArrayList financialTransactionsJournalsList = new ArrayList<String>();
		
		for (int j = 0; j < actJournalsMenusCount; j++) 
		{
			String data = financialsTransactionsJournalsMenus.get(j).getText();
			financialTransactionsJournalsList.add(data);
		}
		
		String actFinancialTransactionsJournalsList = financialTransactionsJournalsList.toString();
		String expFinancialTransactionsJournalsList = excelReader.getCellData(xlSheetName, 1004, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 1004, 8, actFinancialTransactionsJournalsList);
		
		System.out.println(actFinancialTransactionsJournalsList);
		System.out.println(expFinancialTransactionsJournalsList);
		
		if (actJournalsMenusCount==expJournalsMenusCount && actFinancialTransactionsJournalsList.equalsIgnoreCase(expFinancialTransactionsJournalsList)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 1003, 9, resPass);
			return true;
		}
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 1003, 9, resFail);
			return false;
		}
	}	
	catch (Exception e) 
	{
	   String exception =e.getMessage();
	   excelReader.setExceptionInExcel(xlfile, xlSheetName, 1003, 10, exception);
	   System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   return false;
	}
  }

	
	
	 @FindBy(xpath="//ul[@id='navigation_menu']/li[2]/ul/li[1]/ul/li/a/span")
	 private static List<WebElement> financialsTransactionsMenus;

	 
	 
	 
   public static boolean checkTransactionsMenuInFinanceMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	try
	{	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		
		boolean actFinancialsCashAndBankMenuIsDisplay   = cashAndBankMenu.isDisplayed();
    	boolean actFinancialsPurchaseMenuIsDisplay      = financialsTransactionsPurchaseMenu.isDisplayed(); 	
    	boolean actFinancialsSalesIsDisplay             = financialsTransactionsSalesMenu.isDisplayed();
    	boolean actFinancialsJournalsMenuIsDisplay      = financialsTransactionsJournalsMenu.isDisplayed();
    	boolean actFinancialsAutoPostingMenuIsDisplay   = financialsTransactionsAutoPostingsMenu.isDisplayed();
   
    		    	
		boolean expFinancialsCashAndBankMenuIsDisplay   = true;
    	boolean expFinancialsPurchaseMenuIsDisplay      = true; 	
    	boolean expFinancialsSalesIsDisplay             = true;
    	boolean expFinancialsJournalsMenuIsDisplay      = true;
    	boolean expFinancialsAutoPostingMenuIsDisplay   = true;
    	    	    	
    	System.out.println("FinancialsCashAndBankMenuDisplay  : " + actFinancialsCashAndBankMenuIsDisplay   +  "  Value Expected  " + expFinancialsCashAndBankMenuIsDisplay);	
    	System.out.println("FinancialsPurchaseMenuDisplay     : " + actFinancialsPurchaseMenuIsDisplay  +      "  Value Expected  " + expFinancialsPurchaseMenuIsDisplay); 	
    	System.out.println("FinancialsSalesMenuDisplay        : " + actFinancialsSalesIsDisplay   +            "  Value Expected  " + expFinancialsSalesIsDisplay);	   
     	System.out.println("FinancialsJournalsMenuDisplay     : " + actFinancialsJournalsMenuIsDisplay  +      "  Value Expected  " + expFinancialsJournalsMenuIsDisplay); 	
    	System.out.println("FinancialsAutoPostingMenuDisplay  : " + actFinancialsAutoPostingMenuIsDisplay +    "  Value Expected  " + expFinancialsAutoPostingMenuIsDisplay);
     	     		   
    	
    	int actTransactionsMenusCount			=financialsTransactionsMenus.size();
		int expTransactionsMenusCount			=5;
		
		System.out.println("FinanceTransactionsMenusCount Value Actual  : "+actTransactionsMenusCount+"  Value Expected  "+expTransactionsMenusCount); 	
    	
    	int count							   = financialsMenusList.size();
    	
    	ArrayList financialTransactionsList = new ArrayList<String>();
		
		for (int i = 0; i < actTransactionsMenusCount; i++) 
		{
			String data = financialsTransactionsMenus.get(i).getText();
			
			financialTransactionsList.add(data);
		}
		
		String actFinancialTransactionsList = financialTransactionsList.toString();
		String expFinancialTransactionsList = excelReader.getCellData(xlSheetName, 1002, 7);;
		
		excelReader.setCellData(xlfile, xlSheetName, 1002, 8, actFinancialTransactionsList);
		
		
		System.out.println(actFinancialTransactionsList);
		System.out.println(expFinancialTransactionsList);
		
		if(actFinancialsCashAndBankMenuIsDisplay==expFinancialsCashAndBankMenuIsDisplay  
				&& actFinancialsPurchaseMenuIsDisplay==expFinancialsPurchaseMenuIsDisplay
				&& actFinancialsSalesIsDisplay==expFinancialsSalesIsDisplay 
				&& actFinancialsJournalsMenuIsDisplay==expFinancialsJournalsMenuIsDisplay
				&& actFinancialsAutoPostingMenuIsDisplay==expFinancialsAutoPostingMenuIsDisplay
				&& actTransactionsMenusCount==expTransactionsMenusCount && actFinancialTransactionsList.equalsIgnoreCase(expFinancialTransactionsList))
		{
			excelReader.setCellData(xlfile, xlSheetName, 1001, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 1001, 9, resFail);
			return false;
		}
	}	
	catch (Exception e) 
	{
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1001, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	}
   }


	
   public boolean checkOpeningBalanceVoucherDisplayHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {		
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	try
	{	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalancesVoucher));
		openingBalancesVoucher.click();
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		
		boolean actHomePageNewBtnIsDisplayed = newBtn.isDisplayed();
		boolean actHomePageEditBtn           = editBtn.isDisplayed();		
		boolean actHomePagePrintBtn          = printBtn.isDisplayed();
		boolean actHomePageDeleteBtn         = deleteBtn.isDisplayed();
		boolean actHomePageSuspendBtn        = suspendBtn.isDisplayed();
		boolean actHomePageExportXMLBtn      = exportToXMLBtn.isDisplayed();
		boolean actHomePageSettingsBtn       = settingsBtn.isDisplayed();
		boolean actHomePageCloseBtn          = homeCloseBtn.isDisplayed();
		boolean actHomePageGridCheckBox      = grid_HeaderChkBox.isDisplayed();
		boolean actHomePageSortingBtn        = sortingBtn.isDisplayed();
		boolean actHomePageCreateViewBn      = createViewBtn.isDisplayed();
		boolean actHomePageCustomizeBtn      = customizeBtn.isDisplayed();
		boolean actHomePageFilterBtn         = filterBtn.isDisplayed();
		boolean actHomePageRefreshBtn        = refreshBtn.isDisplayed();
		boolean actHomePageOptionsBtn        = optionsBtn.isDisplayed();
		boolean actHomePageExportBtn         = exportBtn.isDisplayed();
		
		boolean expHomePageNewBtnIsDisplayed = true;	
		boolean expHomePageEditBtn           = true;
		boolean expHomePagePrintBtn          = true;
		boolean expHomePageDeleteBtn         = true;
		boolean expHomePageSuspendBtn        = true;
		boolean expHomePageExportXMLBtn      = true;
		boolean expHomePageSettingsBtn       = true;
		boolean expHomePageCloseBtn          = true;
		boolean expHomePageGridCheckBox      = true;
		boolean expHomePageSortingBtn        = true;
		boolean expHomePageCreateViewBn      = true;
		boolean expHomePageCustomizeBtn      = true;
		boolean expHomePageFilterBtn         = true;
		boolean expHomePageRefreshBtn        = true;
		boolean expHomePageOptionsBtn        = true;
		boolean expHomePageExportBtn         = true;
		
		System.out.println("Home Page New Btn Value Actual           : " + actHomePageNewBtnIsDisplayed+ "  Value Expected : " + expHomePageNewBtnIsDisplayed);
		System.out.println("Home Page Edit Btn Value Actual          : " + actHomePageEditBtn+           "  Value Expected : " + expHomePageEditBtn);
		System.out.println("Home Page Print Btn Value Actual         : " + actHomePagePrintBtn+          "	Value Expected : " + expHomePagePrintBtn);
		System.out.println("Home Page Delete Btn Value Actual        : " + actHomePageDeleteBtn+         "	Value Expected : " + expHomePageDeleteBtn);
		System.out.println("Home Page Suspend Btn Value Actual       : " + actHomePageSuspendBtn+        "	Value Expected : " + expHomePageSuspendBtn);
		
		System.out.println("Home Page Export XML Btn Value Actual    : " + actHomePageExportXMLBtn+      "	Value Expected : " + expHomePageExportXMLBtn);
		System.out.println("Home Page Settings Btn Value Actual      : " + actHomePageSettingsBtn+       "	Value Expected : " + expHomePageSettingsBtn);
		System.out.println("Home Page Close Btn Value Actual         : " + actHomePageCloseBtn+          "	Value Expected : " + expHomePageCloseBtn);
		System.out.println("Home Page Grid check Value Actual        : " + actHomePageGridCheckBox+      "	Value Expected : " + expHomePageGridCheckBox);
		System.out.println("Home Page Sorting Btn Value Actual       : " + actHomePageSortingBtn+        "	Value Expected : " + expHomePageSortingBtn);
		System.out.println("Home Page Create View Btn Value Actual   : " + actHomePageCreateViewBn+      "	Value Expected : " + expHomePageCreateViewBn);
		System.out.println("Home Page Customize Btn Value Actual     : " + actHomePageCustomizeBtn+      "	Value Expected : " + expHomePageCustomizeBtn);
		System.out.println("Home Page Filter check Value Actual      : " + actHomePageFilterBtn+         "	Value Expected : " + expHomePageFilterBtn);
		System.out.println("Home Page Refesh Btn Value Actual        : " + actHomePageRefreshBtn+        "	Value Expected : " + expHomePageRefreshBtn);
		System.out.println("Home Page Options Btn Value Actual       : " + actHomePageOptionsBtn+        "	Value Expected : " + expHomePageOptionsBtn);
		System.out.println("Home Page Export Btn Value Actual        : " + actHomePageExportBtn+         "  Value Expected : " + expHomePageExportBtn);
		
		int count				                 = openingStocksNewToolBarButtons.size();
		
		ArrayList<String> actbuttons             = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data                          = openingStocksNewToolBarButtons.get(i).getText();
			actbuttons.add(data);
		}
		    	
		String actopeningStocksNewToolBarButtons = actbuttons.toString();
		String expopeningStocksNewToolBarButtons =  excelReader.getCellData(xlSheetName, 1006, 7);
	
		excelReader.setCellData(xlfile, xlSheetName, 1006, 8, actopeningStocksNewToolBarButtons);
		
		System.out.println("actopeningStocksNewToolBarButtons  : " + actopeningStocksNewToolBarButtons);
		System.out.println("expopeningStocksNewToolBarButtons  : " + expopeningStocksNewToolBarButtons);
		
		String actsetAsDefaultView		=	setAsDefaultView.getText();
		String expsetAsDefaultView		=	excelReader.getCellData(xlSheetName, 1007, 7);
		excelReader.setCellData(xlfile, xlSheetName, 1007, 8, actsetAsDefaultView);
		
		
		//Ribbon Control Icons
        int count1		= headingOptions.size();
		
		ArrayList<String> headingButtons = new ArrayList<String>();
		
		for (int i = 1; i < count1; i++) 
		{
			String data=headingOptions.get(i).getAttribute("title");
			
			headingButtons.add(data);
		}
		
		String actHeadingButtons = headingButtons.toString();
		String expHeadingButtons = excelReader.getCellData(xlSheetName, 1008, 7);
		excelReader.setCellData(xlfile, xlSheetName, 1008, 8, actHeadingButtons);
		
		
		System.out.println("actopeningStocksNewHeadingButtons  : " + actHeadingButtons);
		System.out.println("expopeningStocksNewHeadingButtons  : " + expHeadingButtons);
		
		//Home Page Column Headings
        int headerTxtCount		= headerTxtList.size();
		
		ArrayList<String> headerTxt = new ArrayList<String>();
		
		for (int i = 2; i < headerTxtCount; i++) 
		{
			String data=headerTxtList.get(i).getText();
			headerTxt.add(data);
		}
		
		String actHeaderTxt = headerTxt.toString();
		String expHeaderTxt = excelReader.getCellData(xlSheetName, 1009, 7);
		excelReader.setCellData(xlfile, xlSheetName, 1009, 8, actHeaderTxt);
		
		
		System.out.println("actopeningStocksNewHomePageColumnsButtons  : " + actHeaderTxt);
		System.out.println("expopeningStocksNewHomePageColumnsButtons  : " + expHeaderTxt);
		
		if(actHomePageNewBtnIsDisplayed==expHomePageNewBtnIsDisplayed  && actHomePageEditBtn==expHomePageEditBtn && actHomePagePrintBtn==expHomePagePrintBtn
				&& actHomePageDeleteBtn==expHomePageDeleteBtn  && actHomePageSuspendBtn==expHomePageSuspendBtn 
			    && actHomePageExportXMLBtn==expHomePageExportXMLBtn
				&& actHomePageSettingsBtn==expHomePageSettingsBtn && actHomePageCloseBtn==expHomePageCloseBtn && actHomePageGridCheckBox==expHomePageGridCheckBox
				&& actHomePageSortingBtn==expHomePageSortingBtn && actHomePageCreateViewBn==expHomePageCreateViewBn && actHomePageCustomizeBtn==expHomePageCustomizeBtn
				&& actHomePageFilterBtn==expHomePageFilterBtn && actHomePageRefreshBtn==expHomePageRefreshBtn && actHomePageOptionsBtn==expHomePageOptionsBtn
				&& actHomePageExportBtn==expHomePageExportBtn  
				&& actopeningStocksNewToolBarButtons.equalsIgnoreCase(expopeningStocksNewToolBarButtons)
				&& actHeadingButtons.equalsIgnoreCase(expHeadingButtons)
				&& actHeaderTxt.equalsIgnoreCase(expHeaderTxt))
		{
			System.out.println("Test Pass : HomeScreen Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 1005, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : HomeScreen Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 1005, 9, resFail);
			return false;
		}
	 }
     catch (Exception e) 
     {
	   String exception =e.getMessage();
	   excelReader.setExceptionInExcel(xlfile, xlSheetName, 1005, 10, exception);
	   System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   return false;
     }
    }

	 
  public boolean checkSaveInCreateViewOfHomePageOfOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
    excelReader=new ExcelReader(POJOUtility.getExcelPath());
    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
    try
    {	  	
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewBtn));
   	 createViewBtn.click();
    	
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewNameTxtInCreateView));
     viewNameTxtInCreateView.click();
     
     viewNameTxtInCreateView.sendKeys(excelReader.getCellData(xlSheetName, 1011, 6));
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveOptionInCreateView));
     saveOptionInCreateView.click();
     
     String expSaveViewMessage = excelReader.getCellData(xlSheetName, 1012, 7);
		
	 String actSaveViewMessage = checkValidationMessage(expSaveViewMessage);
	 
	 excelReader.setCellData(xlfile, xlSheetName, 1012, 8, actSaveViewMessage);
		
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameDisplayInHomePage));
	 
	 String actcreateViewNameDisplayInHomePage = createViewNameDisplayInHomePage.getText();
	 String expcreateViewNameDisplayInHomePage = excelReader.getCellData(xlSheetName, 1013, 7);	 
	 
	 excelReader.setCellData(xlfile, xlSheetName, 1013, 8, actcreateViewNameDisplayInHomePage);
	 
	 System.out.println("View Display In Home page Value Actual    : " + actcreateViewNameDisplayInHomePage   +     "	 Value Expected : " + expcreateViewNameDisplayInHomePage);
	
	 if(actSaveViewMessage.equalsIgnoreCase(expSaveViewMessage) && actcreateViewNameDisplayInHomePage.equalsIgnoreCase(expcreateViewNameDisplayInHomePage) )
	 {
		System.out.println("Test Pass : View Saved Successfully");		
		excelReader.setCellData(xlfile, xlSheetName, 1010, 9, resPass);
		return true;
	 }
	 else
	 {
		System.out.println("Test Fail : View NOT Saved Successfully");
	    excelReader.setCellData(xlfile, xlSheetName, 1010, 9, resFail);
		return false;
	 } 
   }
   catch (Exception e) 
   {
	  String exception =e.getMessage();
	  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1010, 10, exception);
	  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
      return false;
	}
   }
	  
 
	  

	  
	  public boolean checkDeleteCreateViewOfHomePageOfOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	    try
	    {
	    	
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewBtn));
	   	 createViewBtn.click();
	   			
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewNameTxtInCreateView));
	     viewNameTxtInCreateView.click();
	     
	     viewNameTxtInCreateView.sendKeys(excelReader.getCellData(xlSheetName, 1015, 6));
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveOptionInCreateView));
	     saveOptionInCreateView.click();
	     
	     String expSaveViewMessage =excelReader.getCellData(xlSheetName, 1016, 7);
			
		 String actSaveViewMessage = checkValidationMessage(expSaveViewMessage);
		 
		 excelReader.setCellData(xlfile, xlSheetName, 1016, 8, actSaveViewMessage);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameDisplayInHomePage));
		 
		 String actcreateViewNameDisplayInHomePage = createViewNameToDeleteDisplayInHomePage.getText();
		 String expcreateViewNameDisplayInHomePage = excelReader.getCellData(xlSheetName, 1017, 7);
		 excelReader.setCellData(xlfile, xlSheetName, 1017, 8, actcreateViewNameDisplayInHomePage);
		 
		 
		 System.out.println("View Display In Home page Value Actual    : " + actcreateViewNameDisplayInHomePage   +     "	 Value Expected : " + expcreateViewNameDisplayInHomePage);
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameToDeleteDisplayInHomePage));
		 createViewNameToDeleteDisplayInHomePage.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteViewButton));
		 deleteViewButton.click();
		 
		 getWaitForAlert();
		 
		 String actAlertMessageOnDeleteView = getAlert().getText();
		 String expAlertMessageOnDeleteView = excelReader.getCellData(xlSheetName, 1018, 7);
		 excelReader.setCellData(xlfile, xlSheetName, 1018, 8, actAlertMessageOnDeleteView);
		 
		 System.out.println("View Display In Home page Value Actual    : " + actAlertMessageOnDeleteView   +     "	 Value Expected : " + expAlertMessageOnDeleteView);
		 
		 getAlert().accept();
		 
		 String expDeleteViewMessage =excelReader.getCellData(xlSheetName, 1019, 7);
			
		 String actDeleteViewMessage = checkValidationMessage(expDeleteViewMessage);
		
		 excelReader.setCellData(xlfile, xlSheetName, 1019, 8, actDeleteViewMessage);
		 
		 int actCount=countOfCreateView.size();
		 int expCount=2;
		 
		 System.out.println("Count In Home page Value Actual    : " + actCount   +     "	 Value Expected : " + expCount);
		 
		 if(actSaveViewMessage.equalsIgnoreCase(expSaveViewMessage) && actcreateViewNameDisplayInHomePage.equalsIgnoreCase(expcreateViewNameDisplayInHomePage)
				 && actAlertMessageOnDeleteView.equalsIgnoreCase(expAlertMessageOnDeleteView) && actCount==expCount)
		 {
			System.out.println("Test Pass : View Saved Successfully");
			
			excelReader.setCellData(xlfile, xlSheetName, 1014, 9, resPass);
			return true;
		 }
		 else
		 {
			System.out.println("Test Fail : View NOT Saved Successfully");
			
			excelReader.setCellData(xlfile, xlSheetName, 1014, 9, resFail);
			return false;
		 } 
	   }
	    catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1014, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }
	  

	 
	  
  public boolean checkEditCreateViewOfHomePageOfOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
    try
    {	
 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameToEditInHomePage));
        createViewNameToEditInHomePage.click();
       		   	
        //Home Page Column Headings
        Thread.sleep(4000);
     
        
        int headerTxtCount		= headerTxtList.size();
		
		ArrayList<String> headerTxt = new ArrayList<String>();
		
		for (int i = 2; i < headerTxtCount; i++) 
		{
			String data=headerTxtList.get(i).getText();
			headerTxt.add(data);
		}
		
		String actHeaderTxt = headerTxt.toString();
		String expHeaderTxt = excelReader.getCellData(xlSheetName, 1021, 7);
        excelReader.setCellData(xlfile, xlSheetName, 1021, 8, actHeaderTxt);
	
		System.out.println("actopeningStocksNewHomePageColumnsButtons  : " + actHeaderTxt);
		System.out.println("expopeningStocksNewHomePageColumnsButtons  : " + expHeaderTxt);
	
		//Click on Edit option

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editViewOptionInHomePage));
		 editViewOptionInHomePage.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewTypeInCreateView));
	
	     boolean actViewTxt              = viewNameTxtInCreateView.isDisplayed();
		 boolean actDataSet              = dataSetInCreateView.isDisplayed();
		 boolean actViewType             = viewTypeInCreateView.isDisplayed();
		 boolean actAuthorization        = authorizationInCreateView.isDisplayed();
		 boolean actCheckStatus          = checkSatusInCreateView.isDisplayed();
		 boolean actQC                   = qcInCreateView.isDisplayed();
		 boolean actSuspendStatus        = suspendStatusInCreateView.isDisplayed();
		 boolean actFilterOption         = filterOptionInCreateView.isDisplayed();
		 boolean actAdvanceFilter        = advanvefilterOptionInCreateView.isDisplayed();
		 boolean actSaveOption           = saveOptionInCreateView.isDisplayed();
		 boolean actCloseOption          = closeOptionInCreateView.isDisplayed();
		
		 boolean expViewTxt              = true;
		 boolean expDataSet              = true;
		 boolean expViewType             = true;
		 boolean expAuthorization        = true;
		 boolean expCheckStatus          = true;
		 boolean expQC                   = true;
		 boolean expSuspendStatus        = true;
		 boolean expFilterOption         = true;
		 boolean expAdvanceFilter        = true;
		 boolean expSaveOption           = true;
		 boolean expCloseOption          = true;
		 
		 System.out.println("View Text Box Value Actual       : " + actViewTxt       +     "  Value Expected : " + expViewTxt);
		 System.out.println("Data Set Value Actual            : " + actDataSet       +     "  Value Expected : " + expDataSet);
		 System.out.println("View Type Value Actual           : " + actViewType      +     "  Value Expected : " + expViewType);
		 System.out.println("Authorization Value Actual       : " + actAuthorization +     "  Value Expected : " + expAuthorization);
		 System.out.println("Check Status Value Actual        : " + actCheckStatus   +     "  Value Expected : " + expCheckStatus);
		 System.out.println("QC Value Actual                  : " + actQC            +     "  Value Expected : " + expQC);
		 System.out.println("Suspend Value Actual             : " + actSuspendStatus +     "  Value Expected : " + expSuspendStatus);
		 System.out.println("Filter Value Actual              : " + actFilterOption  +     "  Value Expected : " + expFilterOption);
		 System.out.println("Advance Filter Value Actual      : " + actAdvanceFilter +     "  Value Expected : " + expAdvanceFilter);
		 System.out.println("Save Option Value Actual         : " + actSaveOption    +     "  Value Expected : " + expSaveOption);
		 System.out.println("Close Option Value Actual        : " + actCloseOption   +     "  Value Expected : " + expCloseOption);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(datasetGetText));
		 String actdatasetGetText       = datasetGetText.getText();
		 String actviewTypeGetText      = viewTypeGetText.getText();
		 String actcheckStatusGetText   = checkStatusGetText.getText();
		 String actsuspendTypeGetText   = suspendStatusGetText.getText();
		 String actauthorizationGetText = authorizationGetText.getText();
		 String actqcGetText            = qcGetText.getText();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewNameGetText));
		 String actGetViewName          = viewNameGetText.getAttribute("value");
		
		 excelReader.setCellData(xlfile, xlSheetName, 1022, 8, actdatasetGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 1023, 8, actviewTypeGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 1024, 8, actcheckStatusGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 1025, 8, actsuspendTypeGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 1026, 8, actauthorizationGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 1027, 8, actqcGetText);
		 excelReader.setCellData(xlfile, xlSheetName, 1028, 8, actGetViewName);
		 
		 String expdatasetGetText       = excelReader.getCellData(xlSheetName, 1022, 7);
		 String expviewTypeGetText      = excelReader.getCellData(xlSheetName, 1023, 7);
		 String expcheckStatusGetText   = excelReader.getCellData(xlSheetName, 1024, 7);
		 String expsuspendTypeGetText   = excelReader.getCellData(xlSheetName, 1025, 7);
		 String expauthorizationGetText = excelReader.getCellData(xlSheetName, 1026, 7);
		 String expqcGetText            = excelReader.getCellData(xlSheetName, 1027, 7);
		 String expGetViewName          = excelReader.getCellData(xlSheetName, 1028, 7);
		 
		 System.out.println("Data Set Value Actual        : " + actdatasetGetText  +      "  Value Expected : " + expdatasetGetText);
		 System.out.println("View Type Value Actual       : " + actviewTypeGetText  +     "  Value Expected : " + expviewTypeGetText);
		 System.out.println("Check Status Value Actual    : " + actcheckStatusGetText +   "  Value Expected : " + expcheckStatusGetText);
		 System.out.println("Suspend Value Actual         : " + actsuspendTypeGetText +   "  Value Expected : " + expsuspendTypeGetText);
		 System.out.println("Authorization Value Actual   : " + actauthorizationGetText + "  Value Expected : " + expauthorizationGetText);
		 System.out.println("QC Value Actual              : " + actqcGetText            + "  Value Expected : " + expqcGetText);
		 System.out.println("View Name Value Actual       : " + actGetViewName +          "  Value Expected : " + expGetViewName);

	
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewNameTxtInCreateView));
	     viewNameTxtInCreateView.click();
	     viewNameTxtInCreateView.sendKeys(Keys.END);
	     viewNameTxtInCreateView.sendKeys(Keys.SHIFT,Keys.HOME);
	     viewNameTxtInCreateView.sendKeys(excelReader.getCellData(xlSheetName, 1029, 6));
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendStatusInCreateView));
	     suspendStatusInCreateView.sendKeys(excelReader.getCellData(xlSheetName, 1030, 6));
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveOptionInCreateView));
	     saveOptionInCreateView.click();
	     
	     String expSaveViewMessage =excelReader.getCellData(xlSheetName, 1031, 7);
			
		 String actSaveViewMessage = checkValidationMessage(expSaveViewMessage);
		 
		 excelReader.setCellData(xlfile, xlSheetName, 1031, 8, actSaveViewMessage);
		 
		 System.out.println("Save View In Home page Value Actual    : " + actSaveViewMessage   +     "	 Value Expected : " + expSaveViewMessage);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameDisplayInHomePage));
		 
		 String actcreateViewNameDisplayInHomePage = createViewNameToEditInHomePage.getText();
		 String expcreateViewNameDisplayInHomePage = excelReader.getCellData(xlSheetName, 1032, 7);
		 
		 excelReader.setCellData(xlfile, xlSheetName, 1032, 8, actcreateViewNameDisplayInHomePage);
		 
		 
		 System.out.println("View Display In Home page Value Actual    : " + actcreateViewNameDisplayInHomePage   +     "	 Value Expected : " + expcreateViewNameDisplayInHomePage);
		 
			
		 if(actHeaderTxt.equalsIgnoreCase(expHeaderTxt) && actViewTxt==expViewTxt &&    actDataSet==expDataSet && actViewType==expViewType && actAuthorization==expAuthorization
				&& actCheckStatus==expCheckStatus && actQC==expQC && actSuspendStatus==expSuspendStatus 
				&& actFilterOption==expFilterOption && actAdvanceFilter==expAdvanceFilter && actSaveOption==expSaveOption && actCloseOption==expCloseOption
				
				&& actdatasetGetText.equalsIgnoreCase(expdatasetGetText) && actviewTypeGetText.equalsIgnoreCase(expviewTypeGetText)
				&& actcheckStatusGetText.equalsIgnoreCase(expcheckStatusGetText) && actsuspendTypeGetText.equalsIgnoreCase(expsuspendTypeGetText)
				&& actauthorizationGetText.equalsIgnoreCase(expauthorizationGetText) && actqcGetText.equalsIgnoreCase(expqcGetText)
				&& actGetViewName.equalsIgnoreCase(expGetViewName)
				
				&& actSaveViewMessage.equalsIgnoreCase(expSaveViewMessage) && actcreateViewNameDisplayInHomePage.equalsIgnoreCase(expcreateViewNameDisplayInHomePage))
		  {
			System.out.println("Test Pass : View Saved Successfully");
			
			excelReader.setCellData(xlfile, xlSheetName, 1020, 9, resPass);
			return true;
		  }
		  else
		  {
			System.out.println("Test Fail : View NOT Saved Successfully");
			
			excelReader.setCellData(xlfile, xlSheetName, 1020, 9, resFail);
			return false;
		  } 
	    }
        catch (Exception e) 
	    {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1020, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	    }
      } 
   
	  
	  
	  public boolean checkOpeningBalanceVoucherHomePageNewOptionOnClickDisplayEntryPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	    try
	    {
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		 newBtn.click();
		
		 checkUserFriendlyMessage();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(freeFlowBtn));
		 
		 boolean   OpeningStocksNewVouherFreeFlowBtn=freeFlowBtn.isDisplayed();
		 
		 String actOpeningStocksNewVouherFreeFlowBtn=Boolean.toString(OpeningStocksNewVouherFreeFlowBtn);
		 String  expOpeningStocksNewVouherFreeFlowBtn=excelReader.getCellData(xlSheetName, 1034, 7);
				
		 excelReader.setCellData(xlfile, xlSheetName, 1034, 8, actOpeningStocksNewVouherFreeFlowBtn.toUpperCase());
		 
		 System.out.println("Opening Stocks Voucher Free Flow Option Value Actual : " + actOpeningStocksNewVouherFreeFlowBtn+ "  Value Expected : " + expOpeningStocksNewVouherFreeFlowBtn);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoSideBarMinimizeExpandBtn));
		 infoSideBarMinimizeExpandBtn.click();
		  
		 if(actOpeningStocksNewVouherFreeFlowBtn.equalsIgnoreCase(expOpeningStocksNewVouherFreeFlowBtn) )
		 {
			System.out.println("Test Pass : entry Page  Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 1033, 9, resPass);
			return true;
		 } 
		 else
		 {
			System.out.println("Test Fail : entry Page NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 1033, 9, resFail);
			return false;
		 } 
	   }


     catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1033, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }

	

	  public boolean checkOpeningBalanceVoucherEntryPageRibbonControl() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
	 	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
	 	try
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(freeFlowBtn));
	 		
	 		boolean actEntryPageJumpToHeaderSectionBtn = jumpToHeaderSectionBtn.isDisplayed();
	 		boolean actEntryPageJumpToBodySectionBtn   = jumpToBodySectionBtn.isDisplayed();
	 		boolean actEntryPageJumpToFooterBtn        = jumpToFooterBtn.isDisplayed();
	 		boolean actEntryPageNewBtn                 = new_newBtn.isDisplayed();
	 		boolean actEntryPageSaveBtn                = saveBtn.isDisplayed();
	 		boolean actEntryPagePreviousBtn            = previousBtn.isDisplayed();
	 		boolean actEntryPageNextBtn                = nextBtn.isDisplayed();
	 		boolean actEntryPagePrintBtn               = new_PrintBtn.isDisplayed();
	 		boolean actEntryPageSuspendBtn             = new_SuspendBtn.isDisplayed();
	 		boolean actEntryPageCloseBtn               = new_CloseBtn.isDisplayed();
	 		boolean actEntryPageToggleBtn              = toggleBtn.isDisplayed();

	 		boolean expEntryPageJumpToHeaderSectionBtn = true;
	 		boolean expEntryPageJumpToBodySectionBtn   = true;
	 		boolean expEntryPageJumpToFooterBtn        = true;
	 		boolean expEntryPageNewBtn	               = true;
	 		boolean expEntryPageSaveBtn                = true;
	 		boolean expEntryPagePreviousBtn            = true;
	 		boolean expEntryPageNextBtn                = true;
	 		boolean expEntryPagePrintBtn               = true;
	 		boolean expEntryPageSuspendBtn             = true;
	 		boolean expEntryPageCloseBtn               = true;
	 		boolean expEntryPageToggleBtn              = true;
	 		
	 		System.out.println("************************************* Opening Balance New Entry Page Ribbon Control Options  ********************************************");
	 		
	 		System.out.println("Jump to Header Value Actual : " + actEntryPageJumpToHeaderSectionBtn+ " Value Expected : " + expEntryPageJumpToHeaderSectionBtn);
	 		System.out.println("Jump To Body Value Actual   : " + actEntryPageJumpToBodySectionBtn+   " Value Expected : " + expEntryPageJumpToBodySectionBtn);
	 		System.out.println("Jump To Footer Value Actual : " + actEntryPageJumpToFooterBtn+        " Value Expected : " + expEntryPageJumpToFooterBtn);
	 		System.out.println("New Btn Value Actual        : " + actEntryPageNewBtn+                 " Value Expected : " + expEntryPageNewBtn);
	 		System.out.println("Save Btn Value Actual       : " + actEntryPageSaveBtn+                " Value Expected : " + expEntryPageSaveBtn);
	 		System.out.println("Previous Btn Value Actual   : " + actEntryPagePreviousBtn+            " Value Expected : " + expEntryPagePreviousBtn);
	 		System.out.println("Next Btn Value Actual       : " + actEntryPageNextBtn+                " Value Expected : " + expEntryPageNextBtn);
	 		System.out.println("Print Btn Value Actual      : " + actEntryPagePrintBtn+               " Value Expected : " + expEntryPagePrintBtn);
	 		System.out.println("Suspend Btn Value Actual    : " + actEntryPageSuspendBtn+             " Value Expected : " + expEntryPageSuspendBtn);
	 		System.out.println("Close Btn Value Actual      : " + actEntryPageCloseBtn+               " Value Expected : " + expEntryPageCloseBtn);
	 		System.out.println("Toggle Btn Value Actual     : " + actEntryPageToggleBtn+              " Value Expected : " + expEntryPageToggleBtn);
	 	
	 		
	 		boolean actMethod=actEntryPageJumpToHeaderSectionBtn==expEntryPageJumpToHeaderSectionBtn && actEntryPageJumpToBodySectionBtn==expEntryPageJumpToBodySectionBtn 
	 				&& actEntryPageJumpToFooterBtn==expEntryPageJumpToFooterBtn && actEntryPageJumpToFooterBtn==expEntryPageJumpToFooterBtn
	 				&& actEntryPageNewBtn==expEntryPageNewBtn && actEntryPageSaveBtn==expEntryPageSaveBtn && actEntryPagePreviousBtn==expEntryPagePreviousBtn
	 				&& actEntryPageNextBtn==expEntryPageNextBtn && actEntryPagePrintBtn==expEntryPagePrintBtn &&actEntryPageSuspendBtn==expEntryPageSuspendBtn 
	 				&& actEntryPageCloseBtn==expEntryPageCloseBtn && actEntryPageToggleBtn==expEntryPageToggleBtn ;
	 		
	 		
	 		
	 		String actResult=Boolean.toString(actMethod);
	 		String expResult=excelReader.getCellData(xlSheetName, 1036, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 1036, 8, actResult.toUpperCase());
	 		
	 		
	 		
	 		if(actMethod==true)
	 		{
	 			System.out.println("Test Pass : Entry Page Options Are Displayed");
	 			excelReader.setCellData(xlfile, xlSheetName, 1035, 9, resPass);
	 			return true;
	 		}
	 		else
	 		{
	 			System.out.println("Test Fail : Entry Page NOT Displayed");
	 			excelReader.setCellData(xlfile, xlSheetName, 1035, 9, resFail);
	 			return false;
	 		}
	 	}
	 	
	 	catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1035, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	 	
	  public boolean checkOpeningBalanceEntryPageOptionsUnderToggleBtn() throws EncryptedDocumentException, InvalidFormatException, IOException
	  {
			
	   excelReader=new ExcelReader(POJOUtility.getExcelPath());
	   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	   try
	   {
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
    	toggleBtn.click();
    	
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoLoadBtn));
		
		boolean actCopyDocumentBtn                =CopyDocumentBtn.isDisplayed();
		boolean actcopytoClipboardBtn             =copytoClipboardBtn.isDisplayed();
		boolean actpastefromClipboardBtn          =pastefromClipboardBtn.isDisplayed();
		boolean actpostingDetailsBtn              =postingDetailsBtn.isDisplayed();
		boolean actexporttoXMLBtn                 =exporttoXMLBtn.isDisplayed();
		boolean actsettingBtn                     =settingBtn.isDisplayed();
		boolean actcalculatorBtn                  =calculatorBtn.isDisplayed();
		boolean actautoLoadBtn                    =autoLoadBtn.isDisplayed();

		
		boolean expCopyDocumentBtn            =true;
		boolean expcopytoClipboardBtn         =true;
		boolean exppastefromClipboardBtn      =true;
		boolean exppostingDetailsBtn          =true;
		boolean expreversEntryBtn             =true;
		boolean expexporttoXMLBtn             =true;
		boolean expsettingBtn                 =true;
		boolean expcalculatorBtn              =true;
		boolean expautoLoadBtn                =true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
    	toggleBtn.click();

		
		System.out.println("*************************************checkOpeningBalanceEntryPageOptionsUnderToggleBtn ********************************************");
		System.out.println("Entry Page RC Copy Document Value Actual:     "+actCopyDocumentBtn+"         Value Expected : "+expCopyDocumentBtn);
		System.out.println("Entry Page RC copy to ClipboardValue Actual    :"+actcopytoClipboardBtn+"    Value Expected : "+expcopytoClipboardBtn);
		System.out.println("Entry Page RC pastefromClipboard Value Actual  :"+actpastefromClipboardBtn+" Value Expected : "+exppastefromClipboardBtn);
		System.out.println("Entry Page RC postingDetails Value Actual      :"+actpostingDetailsBtn+"     Value Expected : "+actpostingDetailsBtn);
		System.out.println("Entry Page RC export to XML Value Actual       :"+actexporttoXMLBtn+"        Value Expected : "+expexporttoXMLBtn);
		System.out.println("Entry Page RC  setting  Value Actual           :"+actsettingBtn+"            Value Expected : "+expsettingBtn);
		System.out.println("Entry Page RC calculator  Value Actual         :"+actcalculatorBtn+"         Value Expected : "+expcalculatorBtn);
		System.out.println("Entry Page RC auto Load Value Actual           :"+actautoLoadBtn+"           Value Expected : "+expautoLoadBtn);
		
		
		boolean actMethod=actCopyDocumentBtn==expCopyDocumentBtn && actcopytoClipboardBtn==expcopytoClipboardBtn 
				&& actpastefromClipboardBtn==exppastefromClipboardBtn && actpostingDetailsBtn==exppostingDetailsBtn 
				&& actexporttoXMLBtn==expexporttoXMLBtn && actsettingBtn==expsettingBtn &&actcalculatorBtn==expcalculatorBtn 
				&& actautoLoadBtn==expautoLoadBtn;
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 1038, 7);
 		
 		excelReader.setCellData(xlfile, xlSheetName, 1038, 8, actResult.toUpperCase());
		
		
		if( actMethod==true )
		{
			System.out.println("Test Pass : Entry Page toggle  Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 1037, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Entry Page  toggle  NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 1037, 9, resFail);
			return false;
		}
	 }
	 catch (Exception e) 
	 {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1037, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	 }		
   }

	 	

	  
	  
	  
	  
	  @FindBy(xpath="//input[@id='id_header_10']")
	  private static WebElement  voucherHeaderCurrency;

	  @FindBy(xpath="//input[@id='id_header_145']")
	  private static WebElement  voucherHeaderLocalExchangeRate;	

		@FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_16']")
		private static WebElement vocJEFooterAmount;

		@FindBy(xpath="//input[@id='id_header_11']")
		private static WebElement  voucherHeaderExchangeRate;

		
		  
	public boolean checkOpeningBalanceVoucherEntryPageHeaderFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	 		
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	
	 try
	 {   
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		
		boolean actEntryPageHeaderFieldsDocNumber     = documentNumberTxt.isDisplayed();
		boolean actEntryPageHeaderFieldsDate          = dateTxt.isDisplayed();
		boolean actEntryPageHeaderFieldsCurrency      = voucherHeaderCurrency.isDisplayed();
		boolean actEntryPageHeaderFieldsExchangeRate  = voucherHeaderExchangeRate.isDisplayed();
		boolean actEntryPageHeaderFieldsdepartment    = departmentTxt.isDisplayed();
		boolean actEntryPageHeaderFieldsLocalExeRate  = voucherHeaderLocalExchangeRate.isDisplayed();
		boolean actEntryPageHeaderFieldsNarration     = openingBalance_NarrationTxt.isDisplayed();
		
		
		boolean expEntryPageHeaderFieldsDocNumber    = true;
		boolean expEntryPageHeaderFieldsDate         = true;
		boolean expEntryPageHeaderFieldsCurrency     = true;
		boolean expEntryPageHeaderFieldsdepartment   = true;
		boolean expEntryPageHeaderFieldsLocalExeRate = true;
		boolean expEntryPageHeaderFieldsNarration    = true;
		
		
		System.out.println("Entry Page DocNumber Actual:                      "+actEntryPageHeaderFieldsDocNumber+"      Value Expected : "+expEntryPageHeaderFieldsDocNumber);
		System.out.println("Entry Page EntryPageHeaderFieldsDate Actual        :"+actEntryPageHeaderFieldsDate+"         Value Expected : "+expEntryPageHeaderFieldsDate);
		System.out.println("Entry Page EntryPageHeaderFieldsCurrency Actual    :"+actEntryPageHeaderFieldsCurrency+"     Value Expected : "+expEntryPageHeaderFieldsCurrency);
		System.out.println("Entry Page EntryPageHeaderFieldsdepartment Actual  :"+actEntryPageHeaderFieldsdepartment+"   Value Expected : "+expEntryPageHeaderFieldsdepartment);
		System.out.println("Entry Page EntryPageHeaderFieldsLocalExeRate Actual:"+actEntryPageHeaderFieldsLocalExeRate+" Value Expected : "+expEntryPageHeaderFieldsLocalExeRate);
		System.out.println("Entry Page RC Jump To Footer Value Actual:          "+actEntryPageHeaderFieldsNarration+"    Value Expected : "+expEntryPageHeaderFieldsNarration);

		
		boolean actMethod=actEntryPageHeaderFieldsDocNumber==expEntryPageHeaderFieldsDocNumber && actEntryPageHeaderFieldsDate==expEntryPageHeaderFieldsDate 
				&& actEntryPageHeaderFieldsNarration==expEntryPageHeaderFieldsNarration && 
				actEntryPageHeaderFieldsCurrency==expEntryPageHeaderFieldsCurrency && actEntryPageHeaderFieldsdepartment==expEntryPageHeaderFieldsdepartment &&
				actEntryPageHeaderFieldsLocalExeRate==expEntryPageHeaderFieldsLocalExeRate;
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 1043, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 1043, 8, actResult.toUpperCase());

		
		if(actMethod==true)
		{
			System.out.println("Test Pass : entry Page Header Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 1042, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : entry Page NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 1042, 9, resFail);
			return false;
		}
	  } 	
    catch (Exception e) 
	  {
		
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1042, 10, e.getMessage());
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		  return false;
	  }
	 }
			 		 	
		
		@FindBy(xpath="//div[contains(text(),'Account')]")
		private static WebElement vocBodyAccTxt;
		
		@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_18']")
		private static WebElement vocBodyDebitTxt;
		
		@FindBy(xpath="//div[contains(text(),'Credit')]")
		private static WebElement vocBodyCreditTxt;

		@FindBy(xpath="//div[contains(text(),'Reference')]")
		private static WebElement vocBodyReferenceTxt; 	
		
		@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_18']")
		private static WebElement vocFooterdebitAmount;
		
		@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_19']")
		private static WebElement vocFooterCreditAmount;
		
		
		
   public boolean checkOpeningBalanceVoucherEntryPageBodyFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
 	excelReader=new ExcelReader(POJOUtility.getExcelPath());
 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 	
 	try
 	{
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));		
	
		boolean actEntryPageBodyAccTxt            = vocBodyAccTxt.isDisplayed();
		boolean actEntryPageBodyDebitTxt          = vocBodyDebitTxt.isDisplayed();
		boolean actEntryPageBodyCreditTxt         = vocBodyCreditTxt.isDisplayed();
		boolean actEntryPageBodyReferenceTxt      = vocBodyReferenceTxt.isDisplayed();
		boolean actEntryPageBodyFieldsAccount     = select1stRow_1stColumn.isDisplayed();
		boolean actEntryPageBodyFieldsDebit       = select1stRow_2ndColumn.isDisplayed();
		boolean actEntryPageBodyFieldscredit      = select1stRow_3rdColumn.isDisplayed();
		boolean actEntryPageBodyFieldsReference   = select1stRow_4thColumn.isDisplayed();
					
		boolean expEntryPageBodyAccTxt            = true;
		boolean expEntryPageBodyDebitTxt          = true;
		boolean expEntryPageBodyCreditTxt         = true;
		boolean expEntryPageBodyReferenceTxt      = true;
		boolean expEntryPageBodyFieldsAccount     = true;
		boolean expEntryPageBodyFieldsDebit       = true;
		boolean expEntryPageBodyFieldscredit      = true;
		boolean expEntryPageBodyFieldsReference   = true;

		System.out.println("************************************* checkOpeningBalanceNewEntryPageBodyFields  ********************************************");
		
		System.out.println("Entry Page Body Fields Account Txt Actual  : " + actEntryPageBodyAccTxt+          " Value Expected : " + expEntryPageBodyAccTxt);
		System.out.println("Entry Page Body Fields Debit Txt Actual    : " + actEntryPageBodyDebitTxt+        " Value Expected : " + expEntryPageBodyDebitTxt);
		System.out.println("Entry Page Body Fields Credit Txt Actual   : " + actEntryPageBodyCreditTxt+       " Value Expected : " + expEntryPageBodyCreditTxt);
		System.out.println("Entry Page Body Fields Ref Txt Actual      : " + actEntryPageBodyReferenceTxt+    " Value Expected : " + expEntryPageBodyReferenceTxt);	
		System.out.println("Entry Page Body Fields Account  Actual     : " + actEntryPageBodyFieldsAccount+   " Value Expected : " + expEntryPageBodyFieldsAccount);
		System.out.println("Entry Page Body Fields Debit   Actual      : " + actEntryPageBodyFieldsDebit+     " Value Expected : " + expEntryPageBodyFieldsDebit);
		System.out.println("Entry Page Body Fields Credit   Actual     : " + actEntryPageBodyFieldscredit+    " Value Expected : " + expEntryPageBodyFieldscredit);
		System.out.println("Entry Page Body Fields Ref  Actual         : " + actEntryPageBodyFieldsReference+ " Value Expected : " + expEntryPageBodyFieldsReference);
		
		
		
		boolean actMethod=actEntryPageBodyAccTxt==expEntryPageBodyAccTxt && actEntryPageBodyDebitTxt==expEntryPageBodyDebitTxt 
				&& actEntryPageBodyCreditTxt==expEntryPageBodyCreditTxt && actEntryPageBodyReferenceTxt==expEntryPageBodyReferenceTxt 
				&& actEntryPageBodyFieldsAccount==expEntryPageBodyFieldsAccount &&actEntryPageBodyFieldsDebit==expEntryPageBodyFieldsDebit  && 
				actEntryPageBodyFieldscredit==expEntryPageBodyFieldscredit && actEntryPageBodyFieldsReference==expEntryPageBodyFieldsReference;
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 1045, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 1045, 8, actResult.toUpperCase());
		
		
		
		if(actMethod==true)
		{
			excelReader.setCellData(xlfile, xlSheetName, 1044, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 1044, 9, resFail);
			return false;
		}
	  } 	
    catch (Exception e) 
	  {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1044, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	  }
	 }
	 	
			 	
			 	
			 	
public boolean checkOpeningBalanceVoucherEntryPageFooterFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
  excelReader=new ExcelReader(POJOUtility.getExcelPath());
  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
  try
  {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vocFooterdebitAmount));
	
	boolean EntryPagevocFooterdebitAmount  =vocFooterdebitAmount.isDisplayed();
	String actEntryPagevocFooterdebitAmount=Boolean.toString(EntryPagevocFooterdebitAmount);
	
	excelReader.setCellData(xlfile, xlSheetName, 1047, 8, actEntryPagevocFooterdebitAmount.toUpperCase());
	
	boolean EntryPageFooterCreditAmount    =vocFooterCreditAmount.isDisplayed();
    String actEntryPageFooterCreditAmount=Boolean.toString(EntryPageFooterCreditAmount);
	
    excelReader.setCellData(xlfile, xlSheetName, 1048, 8, actEntryPageFooterCreditAmount.toUpperCase());
	
	String  expEntryPagevocFooterdebitAmount  =excelReader.getCellData(xlSheetName, 1047, 7);
	String  expEntryPageFooterCreditAmount    = excelReader.getCellData(xlSheetName, 1048, 7);

	System.out.println("*********************************** checkOpeningBalanceNewEntryPageFooterFields  ***************************************************");
	System.out.println("Entry Page Footer Fields Debit Amt Value Actual   : " + actEntryPagevocFooterdebitAmount + "   Value Expected : " + expEntryPagevocFooterdebitAmount);
	System.out.println("Entry Page Footer Fields Credit Amt  Value Actual : " + actEntryPageFooterCreditAmount   + "  Value Expected  : " + expEntryPageFooterCreditAmount);

	
	
	if(actEntryPagevocFooterdebitAmount.equalsIgnoreCase(expEntryPagevocFooterdebitAmount) && 
			actEntryPageFooterCreditAmount.equalsIgnoreCase(expEntryPageFooterCreditAmount))
	{
		excelReader.setCellData(xlfile, xlSheetName, 1046, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, xlSheetName, 1046, 9, resFail);
		return false;
	}
  } 	
catch (Exception e) 
  {
	  String exception =e.getMessage();
	  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1046, 10, exception);
	  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	  return false;
  }
 }
 	


 public boolean checkOpeningBalanceVoucherDocumentNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 {
  excelReader=new ExcelReader(POJOUtility.getExcelPath());
  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
  try
  {
	
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
 		documentNumberTxt.click();
 		
 		String  actEntryPageGetDocumentNumberValue   = documentNumberTxt.getAttribute("value");
		String actCurrency                           = voucherHeaderCurrency.getAttribute("value");
		boolean  Department                          = departmentTxt.getText().isEmpty();
		String actDepartment                        =  Boolean.toString(Department);
		String actExchangeRate                       = voucherHeaderExchangeRate.getAttribute("value");
		String actLocalExchangeRate                  = voucherHeaderLocalExchangeRate.getAttribute("value");
		
		
		excelReader.setCellData(xlfile, xlSheetName, 1050, 8, actEntryPageGetDocumentNumberValue);
		excelReader.setCellData(xlfile, xlSheetName, 1051, 8, actCurrency);
		excelReader.setCellData(xlfile, xlSheetName, 1052, 8, actDepartment.toUpperCase());
		excelReader.setCellData(xlfile, xlSheetName, 1053, 8, actExchangeRate);
		excelReader.setCellData(xlfile, xlSheetName, 1054, 8, actLocalExchangeRate);
		
		
		String expEntryPageGetDocumentNumberValue    = excelReader.getCellData(xlSheetName, 1050, 7);
		String expCurrency                           = excelReader.getCellData(xlSheetName, 1051, 7);
		String  expDepartment                        = excelReader.getCellData(xlSheetName, 1052, 7);
		String expExchangeRate                       = excelReader.getCellData(xlSheetName, 1053, 7);
		String expLocalExchangeRate                  = excelReader.getCellData(xlSheetName, 1054, 7);
		
		
		System.out.println("EntryPage DocumentNumberValue             : "+actEntryPageGetDocumentNumberValue +" Value Expected : "+expEntryPageGetDocumentNumberValue);
		System.out.println("EntryPage voucherHeaderCurrency           : "+actCurrency                        +" Value Expected : "+expCurrency);
		System.out.println("EntryPage departmentTxt                   : "+actDepartment                      +" Value Expected : "+expDepartment);
		System.out.println("EntryPage voucherHeaderExchangeRate       : "+actExchangeRate                    +" Value Expected : "+expExchangeRate);
		System.out.println("EntryPage voucherHeaderLocalExchangeRate  : "+actLocalExchangeRate               +" Value Expected : "+expLocalExchangeRate);
		
		
		
		if (actEntryPageGetDocumentNumberValue.equalsIgnoreCase(expEntryPageGetDocumentNumberValue) && 
				actCurrency.equalsIgnoreCase(expCurrency) && actDepartment.equalsIgnoreCase(expDepartment) && actExchangeRate.equalsIgnoreCase(expExchangeRate) && 
				actLocalExchangeRate.equalsIgnoreCase(expLocalExchangeRate))
		{
			excelReader.setCellData(xlfile, xlSheetName, 1049, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 1049, 9, resFail);
			return false;
		}
	  } 	
    catch (Exception e) 
	{
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1049, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	 }
   }
			 	

 
 
   @FindBy(xpath="//tbody[@id='id_header_10_table_data_body']/tr/td")
   private static List<WebElement> currencyListCount;	  
	  
   public boolean checkCurrencyInOpeningBalanceVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	try
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();
		
		voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
		
		voucherHeaderCurrency.sendKeys(Keys.SPACE);
		
		int currencycount=currencyListCount.size();
		
		System.err.println(currencycount);
			
		for(int i=0 ; i < currencycount ;i++)
		{
			
			String data=currencyListCount.get(i).getText();
			
			System.out.println("DATA  :"+data);
			
			if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1059, 6)))
			{
				currencyListCount.get(i).click();
				
				break;
			}
		}
			
		voucherHeaderCurrency.sendKeys(Keys.TAB);

		
		//Need to modifying 
		
		
		Thread.sleep(2000);
		
		
      voucherHeaderCurrency.sendKeys(Keys.TAB);
           
      voucherHeaderExchangeRate.click();
           
      String actExchangeRate=voucherHeaderExchangeRate.getAttribute("value");
      String expExchangeRate=excelReader.getCellData(xlSheetName, 1060, 7);               
           
      excelReader.setCellData(xlfile, xlSheetName, 1060, 8, actExchangeRate);
           
      System.out.println("voucherHeaderExchangeRate : " + actExchangeRate + " Value Expected : " + expExchangeRate);
           
           
      if (actExchangeRate.equalsIgnoreCase(expExchangeRate) )
        {
                   System.out.println("Test Pass : Exchange Rate Is Updated ");
                   excelReader.setCellData(xlfile, xlSheetName, 1059, 9, resPass);
                   return true;
           	}
           else
           {
          	 System.out.println("Test Fail :  Exchange Rate Is  NOt Updated ");
          	 excelReader.setCellData(xlfile, xlSheetName, 1059, 9, resFail);
                       return false;
           }        

	    }
	    catch (Exception e) 
	    {
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1059, 10, e.getMessage());
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			  return false;
		 }
	  }
	  
	@FindBy(xpath="//*[@id='id_header_10_table_data_body']/tr")
	private static List<WebElement> openingBalCurrencyList;
	    
   public boolean checkExchangeRateWithCurrencyAEDInOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
           
    excelReader=new ExcelReader(POJOUtility.getExcelPath());
    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
   
    try
    {
   
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
       voucherHeaderCurrency.click();
       voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
       voucherHeaderCurrency.sendKeys(Keys.SPACE);
	
	     int openingBalCurrencyListCount=openingBalCurrencyList.size();
		
		 for (int i = 0; i < openingBalCurrencyListCount; i++) 
	 	 {
			String data=openingBalCurrencyList.get(i).getText();
			
			if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1061, 6)))
			{
				openingBalCurrencyList.get(i).click();
				break;
			}
	 	 }
       
       voucherHeaderCurrency.sendKeys(Keys.TAB);
       
       voucherHeaderExchangeRate.click();
       
       String actExchangeRate=voucherHeaderExchangeRate.getAttribute("value");
       String expExchangeRate=excelReader.getCellData(xlSheetName, 1062, 7);               
       
       excelReader.setCellData(xlfile, xlSheetName, 1062, 8, actExchangeRate);
       
       System.out.println("voucherHeaderExchangeRate : "+actExchangeRate+" Value Expected : "+expExchangeRate);
                    
       if (actExchangeRate.equalsIgnoreCase(expExchangeRate) )
       {
           System.out.println("Test Pass : Exchange Rate Is Updated ");
           excelReader.setCellData(xlfile, xlSheetName, 1061, 9, resPass);
           return true;
       }
       else
       {
           System.out.println("Test Fail :  Exchange Rate Is  NOt Updated ");
           excelReader.setCellData(xlfile, xlSheetName, 1061, 9, resFail);
           return false;
       }    
   }
   catch (Exception e) 
   {
	  String exception =e.getMessage();
	  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1061, 10, exception);
	  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	  return false;
   }
 }
  
	  
	  
   @FindBy(xpath="//*[@id='id_header_268435459_table_data_body']/tr/td")
   private static List<WebElement> openingBalDepartmentList;

   public boolean checkExchangeRateAndLocalExchangeReateWithCurrencyAEDInOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
   {
      
    excelReader=new ExcelReader(POJOUtility.getExcelPath());
    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
      
    try
    {    
      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
      departmentTxt.click();
      departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
      departmentTxt.sendKeys(Keys.SPACE);
      
      WebElement options=departmentTxt;
		
      int OpeningBalDepartmentListCount=openingBalDepartmentList.size();
            
      String actOpeningBalDepartmentListCount=Integer.toString(OpeningBalDepartmentListCount);
      
      String  expOpeningBalDepartmentListCount=excelReader.getCellData(xlSheetName, 1066, 7);
      
      excelReader.setCellData(xlfile, xlSheetName, 1066, 8, actOpeningBalDepartmentListCount);
      
		ArrayList<String> actDepartmentList= new ArrayList<String>(); 
	
		actDepartmentList.add("AMERICA");
	    
		actDepartmentList.add("DepartmentST");
	    
		actDepartmentList.add("DUBAI");
		
		actDepartmentList.add("INDIA");
	   
		actDepartmentList.add("SINGPORE"); 
		
		actDepartmentList.add("WALES");
	    
		ArrayList<String> expDepartmentList = new ArrayList<String>(); 

		int count=openingBalDepartmentList.size();
		
		System.err.println(count);
		
		for(int i=0 ; i < count ;i++)
		{
			String data=openingBalDepartmentList.get(i).getText();
			System.err.println("IN FOR LOOP : "+data);
			expDepartmentList.add(data);			
		}
		
		System.err.println(expDepartmentList);
				
		System.out.println("actDepartmentList"+actDepartmentList);
		
		System.out.println("expDepartmentList"+expDepartmentList);
		
		boolean DepartmentValue=actDepartmentList.equals(expDepartmentList);
			
		String actDepartmentValue=Boolean.toString(DepartmentValue);
		
		String  expDepartmentValue=excelReader.getCellData(xlSheetName, 1067, 7);
     	
		excelReader.setCellData(xlfile, xlSheetName, 1067, 8, actDepartmentValue);
	
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
        departmentTxt.click();
        departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
        departmentTxt.sendKeys(Keys.SPACE);
			
		 for (int i = 0; i < OpeningBalDepartmentListCount; i++) 
	 	 {
			String data=openingBalDepartmentList.get(i).getText();
			
			if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1068, 6)))
			{
				openingBalDepartmentList.get(i).click();
				break;
			}
	 	 }
      
		 Thread.sleep(2000);
		 
		 departmentTxt.sendKeys(Keys.TAB);
 
		 Thread.sleep(2000);
      
      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
      voucherHeaderCurrency.click();
      voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
      voucherHeaderCurrency.sendKeys(Keys.SPACE);
	
	     int openingBalCurrencyListCount=openingBalCurrencyList.size();
		
		 for (int i = 0; i < openingBalCurrencyListCount; i++) 
	 	 {
			String data=openingBalCurrencyList.get(i).getText();
			
			if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1069, 6)))
			{
				openingBalCurrencyList.get(i).click();
				break;
			}
	 	 }
      
      voucherHeaderCurrency.sendKeys(Keys.TAB);
           
      String actExchangeRate=voucherHeaderExchangeRate.getAttribute("value");
      String expExchangeRate=excelReader.getCellData(xlSheetName, 1070, 7);
		
      excelReader.setCellData(xlfile, xlSheetName, 1070, 8, actExchangeRate);
      
      String actLocExchangeRate=voucherHeaderLocalExchangeRate.getAttribute("value");
      String expLocExchangeRate=excelReader.getCellData(xlSheetName, 1071, 7);
		
      excelReader.setCellData(xlfile, xlSheetName, 1071, 8, expLocExchangeRate);
      
      
      System.out.println("voucherHeaderExchangeRate      : "+actExchangeRate    +" Value Expected : "+expExchangeRate);
      System.out.println("voucherHeaderLocalExchangeRate : "+actLocExchangeRate +" Value Expected : "+expLocExchangeRate);
      
      if (actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate))
         {
                      System.out.println("Test Pass : Exchange Rate Is Updated ");
                      excelReader.setCellData(xlfile, xlSheetName, 1065, 9, resPass);
                      return true;
          }
          else
          {
                  System.out.println("Test Fail :  Exchange Rate Is  NOt Updated ");
                  excelReader.setCellData(xlfile, xlSheetName, 1065, 9, resFail);
                  return false;
          } 
      }
      catch (Exception e) 
	  {
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1065, 10, e.getMessage());
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		  return false;
	  }
    }

   
   public boolean checkExchangeRateAndLocalExchangeReateWithCurrencyUSDInOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
       excelReader=new ExcelReader(POJOUtility.getExcelPath());
       xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
          
       try 
       {
          getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
          voucherHeaderCurrency.click();
          voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
          voucherHeaderCurrency.sendKeys(Keys.SPACE);
		
		     int openingBalCurrencyListCount=openingBalCurrencyList.size();
			
			 for (int i = 0; i < openingBalCurrencyListCount; i++) 
		 	 {
				String data=openingBalCurrencyList.get(i).getText();
				
				if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1073, 6)))
				{
					openingBalCurrencyList.get(i).click();
					break;
				}
		 	 }
          
          voucherHeaderCurrency.sendKeys(Keys.TAB);
          
          String actExchangeRate=voucherHeaderExchangeRate.getAttribute("value");
          String expExchangeRate=excelReader.getCellData(xlSheetName, 1074, 7);
          
          excelReader.setCellData(xlfile, xlSheetName, 1074, 8, actExchangeRate);
          
          String actLocExchangeRate=voucherHeaderLocalExchangeRate.getAttribute("value");
          String expLocExchangeRate=excelReader.getCellData(xlSheetName, 1075, 7);
         
          excelReader.setCellData(xlfile, xlSheetName, 1075, 8, actLocExchangeRate);
          
          System.out.println("voucherHeaderExchangeRate      : "+actExchangeRate+" Value Expected : "+expExchangeRate);
          System.out.println("voucherHeaderLocalExchangeRate : "+actLocExchangeRate+" Value Expected : "+expLocExchangeRate);
          
          if (actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) )
          {
               System.out.println("Test Pass : Exchange Rate Is Updated ");
               excelReader.setCellData(xlfile, xlSheetName, 1072, 9, resPass);
               return true;
          }
          else
          {
                  System.out.println("Test Fail :  Exchange Rate Is  NOt Updated ");
                  excelReader.setCellData(xlfile, xlSheetName, 1072, 9, resFail);
                  return false;
          }  
      }
      catch (Exception e) 
	    {
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1072, 10, e.getMessage());
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		  return false;
	    }
	 }
          
  

	 public boolean checkExchangeRateAndLocalExchangeRateWithCurrencyINRInOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
          excelReader=new ExcelReader(POJOUtility.getExcelPath());
          xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
          
          try
          {
          	
          getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
          voucherHeaderCurrency.click();
          voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
          voucherHeaderCurrency.sendKeys(Keys.SPACE);
		
		     int openingBalCurrencyListCount=openingBalCurrencyList.size();
			
			 for (int i = 0; i < openingBalCurrencyListCount; i++) 
		 	 {
				String data=openingBalCurrencyList.get(i).getText();
				
				if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1077, 6)))
				{
					openingBalCurrencyList.get(i).click();
					break;
				}
		 	 }
          
          voucherHeaderCurrency.sendKeys(Keys.TAB);
          
          String actExchangeRate=voucherHeaderExchangeRate.getAttribute("value");
          String expExchangeRate=excelReader.getCellData(xlSheetName, 1078, 7);
          
          excelReader.setCellData(xlfile, xlSheetName, 1078, 8, actExchangeRate);
          

          String actLocExchangeRate=voucherHeaderLocalExchangeRate.getAttribute("value");
          String expLocExchangeRate=excelReader.getCellData(xlSheetName, 1079, 7);
         
          excelReader.setCellData(xlfile, xlSheetName, 1079, 8, actLocExchangeRate);
          
          System.out.println("voucherHeaderExchangeRate      : "+actExchangeRate+" Value Expected : "+expExchangeRate);
          System.out.println("voucherHeaderLocalExchangeRate : "+actLocExchangeRate+" Value Expected : "+expLocExchangeRate);   
          
          if (actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) )
          {
                  System.out.println("Test Pass : Exchange Rate Is Updated ");
                  excelReader.setCellData(xlfile, xlSheetName, 1076, 9, resPass);
                  return true;
           }
           else
           {
                  System.out.println("Test Fail :  Exchange Rate Is  NOt Updated ");
                  excelReader.setCellData(xlfile, xlSheetName, 1076, 9, resFail);
                  return false;
           }  
          }
          
          catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1076, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
		   
  }
	  
		  
		 
	        //Bill Reference Screen 	
		

			@FindBy(xpath="//input[@id='txtNewReference']")
			private static WebElement  billRefNewReferenceTxt;
			
			@FindBy(xpath="//input[@id='txtOnAccount']")
			private static WebElement  billRefTxtOnAccount;		
				
			@FindBy(xpath="//input[@id='Searchtxt']")
			private static WebElement  billRefSearchTxt;		
			
			@FindBy(xpath="//select[@id='cbmShowBillForAdjustment']")
			private static WebElement  billRefNewReferenceDropdown;		
			
			@FindBy(xpath="//select[@id='cbmShowBills']")
			private static WebElement  billRefShowBillsDropdown;		
			
			@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_11']//div[contains(text(),'Due Date')]")
			private static WebElement  billRefGridHeaderDueDate;		
			
			@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_16']//div[contains(text(),'Currency')]")
			private static WebElement  billRefGridHeaderCurrency;		
			
			@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_21']//div[contains(text(),'Original Amt')]")
			private static WebElement  billRefGridHeaderOrginalAmt;		
			
			@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_23']//div[contains(text(),'Balance Amount')]")
			private static WebElement  billRefGridHeaderBalanceAmt;		
			
			@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_33']//div[contains(text(),'Adjustment Amount')]")
			private static WebElement  billRefGridHeaderAdjustmentAmt;		
			
			@FindBy(xpath="//div[contains(text(),'Native Currency')]")
			private static WebElement  billRefGridHeaderNativeCurrency;		
			
			@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_41']//div[contains(text(),'Narration')]")
			private static WebElement  billRefGridHeaderNarration;		
			
			@FindBy(xpath="//th[@id='id_Adjustment_Grid_control_heading_50']//div[contains(text(),'Previous Adjustment Amount')]")
			private static WebElement  billRefGridHeaderPreviosAdjustmentAmt;		
			
			@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_1-0']")
			private static WebElement  billRefGridFirstRow;	
			
			@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_1-1']//input")
			private static WebElement  billRefGridFirstRowChkbox;		
			
			@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_2-1']//input")
			private static WebElement  billRefGridSecondRowChkbox;		
			
			@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_3-1']//input")
			private static WebElement  billRefGridThirdRowChkbox;		
			
			@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_1-33']")
			private static WebElement  billRefGridFirstRowAdjustmentAmtTxt;		
			
			@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_2-33']")
			private static WebElement  billRefGridSecondRowAdjustmentAmtTxt;		
			
			@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_3-33']")
			private static WebElement  billRefGridThirdRowAdjustmentAmtTxt;		
			
			@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_1-41']")
			private static WebElement  billRefGridFirstNarrationTxt;		
			
			@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_2-41']")
			private static WebElement  billRefGridSecondNarrationTxt;		
			
			@FindBy(xpath="//td[@id='id_Adjustment_Grid_col_3-41']")
			private static WebElement  billRefGridThirdNarrationTxt;		
			
			@FindBy(xpath="//input[@id='id_Narration']")
			private static WebElement  narrationToWrite;		
			
			@FindBy(xpath="//input[@id='id_limit']")
			private static WebElement  adjustAmtToWrite;		
			
			@FindBy(xpath="//div[@class='col-xs-6 navbar-header']//div[@class='navText']")
			private static WebElement  billRefPaymentsBillReferenceLabel;		
			
			@FindBy(xpath="//div[@class='col-sm-12 col-md-3']//input[@class='Fbutton']")
			private static WebElement  billRefAdjustOnFIFOBtn;		
			
			@FindBy(xpath="//span[@id='btnPick']")
			private static WebElement  billRefPickIcon;		
			
			@FindBy(xpath="//span[@id='btnOk']")
			private static WebElement  billRefOkBtn;		
			
			@FindBy(xpath="//span[@id='btnCancel']")
			private static WebElement  billRefcancel;		
			
			@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
			private static WebElement  billRefSummatyValueNet;		
			
			@FindBy(xpath="//td[@id='AccountAmount_col_1-1']")
			private static WebElement  billRefGridVendorRow1;	
			
			@FindBy(xpath="//td[@id='AccountAmount_col_1-2']")
			private static WebElement  billRefGridVendorAmtRow1;	
			
			@FindBy(xpath="//td[@id='AccountAmount_col_2-1']")
			private static WebElement  billRefGridVendorRow2;	
			
			@FindBy(xpath="//td[@id='AccountAmount_col_2-2']")
			private static WebElement  billRefGridVendorAmtRow2;	
			
			@FindBy(xpath="//td[@id='AccountAmount_col_3-1']")
			private static WebElement  billRefGridVendorRow3;
			
			@FindBy(xpath="//label[@id='tbNewRefAmountAdjValue']")
			private static WebElement amtAdjustedAgainstNewREfinOtherVouchers;
					
			@FindBy(xpath="//label[@id='tbAmountToAdjustInTransCurrencyValue']")
			private static WebElement transactionCurency;
			
			@FindBy(xpath="//label[@id='tbAmountToAdjustInBaseCurrencyValue']")
			private static WebElement baseCurrency;
			
			@FindBy(xpath="//label[@id='tbAmountToAdjustInLocalCurrencyValue']")
			private static WebElement localCurrencyDhs;
			
			@FindBy(xpath="//label[@id='tbNewRefBalAmountValue']")
			private static WebElement balanceNewReferenceAmt;
			
			@FindBy(xpath="//li[@id='id_li_Adjustment_Tab_BreakUpByTag']//span[@class='font-5'][contains(text(),'Break Up by Tag')]")
			private static WebElement breakUpByTagTab;
			
			@FindBy(xpath="//span[@class='font-5'][contains(text(),'Adjustment')]")
			private static WebElement adjustmentTab;
			
			@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-9']")
			private static WebElement breakUpByTagDueDate;
			
			@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-10']")
			private static WebElement breakUpByTagDepartment;
			
			@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-18']")
			private static WebElement breakUpByTagBaseCurrency;
			
			@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-17']")
			private static WebElement breakUpByTagBillCurrency;
			
			@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-20']")
			private static WebElement breakUpByTagBaseConversionRate;
				
			@FindBy(xpath="//td[@id='id_BreakUpByTag_Grid_col_1-21']")
			private static WebElement breakUpByTagBaseLocalCurrency;
			
			@FindBy(xpath="//label[@id='txtblkAmountadjusted']")
			private static WebElement  billRefAdjustAmountInTransCurency;
			
			@FindBy(xpath="//label[@id='txtblkAmounttobeadjust']")
			private static WebElement  billRefBalanceAmountAdjustInTrnasCurrency;
			
			@FindBy(xpath="//label[@id='id_BillWise_IP_LocalConversionRateValue']")
			private static WebElement  billRefInfoBarLocalCurrencyRate;
			
			
			@FindBy(xpath="//label[@id='tbAmountToAdjustInTransCurrencyValue']")
			private static WebElement billRefTransactionCurency;
			
			@FindBy(xpath="//label[@id='tbAmountToAdjustInBaseCurrencyValue']")
			private static WebElement billRefBaseCurrency;
			

			@FindBy(xpath="//label[@id='id_BillWise_IP_AccountName']")
			private static WebElement breakUpDetailsAccount;
			
			@FindBy(xpath="//label[@id='id_BillWise_IP_ProductName']")
			private static WebElement breakUpDetailsItem;
			
			@FindBy(xpath="//label[@id='id_BillWise_IP_TagName']")
			private static WebElement breakUpDetailsDepartment;
			
			@FindBy(xpath="//label[@id='id_BillWise_IP_BaseCurrencyValue']")
			private static WebElement conversationRateBaseCurrencyRate;
			
			@FindBy(xpath="//label[@id='id_BillWise_IP_LocalConversionRateValue']")
			private static WebElement conversationRateLocalCurrencyRate;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAEDTranAmountValue']")
			private static WebElement asOnEntryDateTransAmt;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAEDBaseConversionValue']")
			private static WebElement asOnEntryDateBaseConcersationRate;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAEDBaseAmountValue']")
			private static WebElement asOnEntryDateBaseAmount;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAEDLocalConversionValue']")
			private static WebElement asOnEntryDateLocConversationRate;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAEDLocalAmountValue']")
			private static WebElement asOnEntryDateAmt;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAADTranAmountValue']")
			private static WebElement balOnAdjstDateTransAmt;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAADBaseConversionValue']")
			private static WebElement  balOnAdjstDateBasrConversionRate;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAADBaseAmountValue']")
			private static WebElement  balOnAdjstDateBaseAmount;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAADLocalConversionValue']")
			private static WebElement  balOnAdjstDateLocalConversionRate;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAADLocalAmountValue']")
			private static WebElement  balOnAdjstDateAmt;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAdjTranAmountValue']")
			private static WebElement adjustmentsAmount1;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAdjBaseAmountValue']")
			private static WebElement adjustmentsAmount2;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblAdjLocalAmountValue']")
			private static WebElement adjustmentsAmount3;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblNativeCurrencyValue']")
			private static WebElement adjustmentsAmount4;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblExDiffTranAmountValue']")
			private static WebElement exchangeGainLossForBaseCurrency;
			
			@FindBy(xpath="//label[@id='id_infoPanel_lblExDiffLocalAmountValue']")
			private static WebElement exchangeGainLossForLocalCurrency;
			
			
			
			@FindBy(xpath="//input[@id='id_limit']")
			private static WebElement gridEnterAdjustAmtRow1;
			
			//Billreference Body Grid Elements
			
          
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[8]")
			private static WebElement gridOrginalAmtRow1;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[8]")
			private static WebElement gridOrginalAmtRow2;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[8]")
			private static WebElement gridOrginalAmtRow3;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[8]")
			private static WebElement gridOrginalAmtRow4;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[8]")
			private static WebElement gridOrginalAmtRow5;
			
			
			
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[10]")
			private static WebElement gridBalanceAmtRow1;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[10]")
			private static WebElement gridBalanceAmtRow2;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[10]")
			private static WebElement gridBalanceAmtRow3;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[10]")
			private static WebElement gridBalanceAmtRow4;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[10]")
			private static WebElement gridBalanceAmtRow5;
			
			
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[13]")
			private static WebElement gridAdjustmentAmtRow1;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[13]")
			private static WebElement gridAdjustmentAmtRow2;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[13]")
			private static WebElement gridAdjustmentAmtRow3;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[13]")
			private static WebElement gridAdjustmentAmtRow4;

			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[13]")
			private static WebElement gridAdjustmentAmtRow5;
			
			
			
			@FindBy(xpath="//table[@id='id_Adjustment_Grid']")
			private static WebElement billRefAdjustBillsGrid;
				
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[3]")
			private static WebElement billRefAdjustBillsRow1DocNo;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[2]/td[3]")
			private static WebElement billRefAdjustBillsRow2DocNo;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[3]/td[3]")
			private static WebElement billRefAdjustBillsRow3DocNo;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[4]/td[3]")
			private static WebElement billRefAdjustBillsRow4DocNo;
			
			@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[5]/td[3]")
			private static WebElement billRefAdjustBillsRow5DocNo;
			
			
				
			@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr/td[2]")
			private static WebElement InfoSideBarDocRow1;

			@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr/td[3]")
			private static WebElement InfoSideBarAmtRow1;

			@FindBy(xpath="//tbody[@id='InfPnlAdjGrd_body']//td[4]")
			private static WebElement InfoSideBarBaseAmtRow1;

			// Row 2
			
			@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[2]/td[2]")
			private static WebElement InfoSideBarDocRow2;

			@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[2]/td[3]")
			private static WebElement InfoSideBarAmtRow2;

			@FindBy(xpath="//tbody[@id='InfPnlAdjGrd_body']//tr[2]//td[4]")
			private static WebElement InfoSideBarBaseAmtRow2;

			// Row 3
			
			@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[3]/td[2]")
			private static WebElement InfoSideBarDocRow3;

			@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[3]/td[3]")
			private static WebElement InfoSideBarAmtRow3;

			@FindBy(xpath="//tbody[@id='InfPnlAdjGrd_body']//tr[3]//td[4]")
			private static WebElement InfoSideBarBaseAmtRow3;
			  
			
			// Row 4 
			
			@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[4]/td[2]")
			private static WebElement InfoSideBarDocRow4;

			@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[4]/td[3]")
			private static WebElement InfoSideBarAmtRow4;

			@FindBy(xpath="//tbody[@id='InfPnlAdjGrd_body']//tr[4]//td[4]")
			private static WebElement InfoSideBarBaseAmtRow4;
			
			// row 5
			
			@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[5]/td[2]")
			private static WebElement InfoSideBarDocRow5;

			@FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr[5]/td[3]")
			private static WebElement InfoSideBarAmtRow5;

			@FindBy(xpath="//tbody[@id='InfPnlAdjGrd_body']//tr[5]//td[4]")
			private static WebElement InfoSideBarBaseAmtRow5;
			
			

		
			  
			@FindBy(xpath="//*[@id='id_body_12_table_data_body']/tr")
			private static List<WebElement> openingBalAccountListInGrid;
			
			@FindBy(xpath="//input[@id='id_body_19']")
			private static WebElement  enter_OBCreditACTxt;

			@FindBy(xpath="//*[@id='lblAccount']")
			private static WebElement  billRefPartyName;
			
		  
  public boolean checkSavingVoucherWithCustomerACurrencyINRDepartmentINDIALessThanAccountinDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
     try
     {	    
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
	voucherHeaderCurrency.sendKeys(Keys.BACK_SPACE);
	
	int currencycount=currencyListCount.size();
	
	System.err.println(currencycount);
		
	for(int i=0 ; i < currencycount ;i++)
	{
		String data=currencyListCount.get(i).getText();
		
		System.err.println(data);
		
		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1081, 6)))
		{
			currencyListCount.get(i).click();
			
			break;
		}
	}
		
	voucherHeaderCurrency.sendKeys(Keys.TAB);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.click();
	departmentTxt.sendKeys(Keys.END);
	departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	departmentTxt.sendKeys(Keys.SPACE);
		
	int departmentcount=openingBalDepartmentList.size();
	
	System.err.println(departmentcount);
		
	for(int i=0 ; i < departmentcount ;i++)
	{
		String data=openingBalDepartmentList.get(i).getText();
		
		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1082, 6)))
		{
			openingBalDepartmentList.get(i).click();
			
			break;
		}
	}
		
	departmentTxt.sendKeys(Keys.TAB);

	
	//First Row
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
	enter_AccountTxt.click();
	enter_AccountTxt.sendKeys("W");
	
	
	getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(openingBalAccountListInGrid));
	int accountCount=openingBalAccountListInGrid.size();
	
	System.err.println(accountCount);
		
	for(int i=0 ; i < accountCount ;i++)
	{
		String data=openingBalAccountListInGrid.get(i).getText();
		Thread.sleep(2000);
		
		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1083, 6)))
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(openingBalAccountListInGrid));
			openingBalAccountListInGrid.get(i).click();
			
			break;
		}
	}
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
	enter_AccountTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));
	enter_DebitTxt.sendKeys(excelReader.getCellData(xlSheetName, 1084, 6));
	enter_DebitTxt.sendKeys(Keys.TAB);
	
	enter_OBCreditACTxt.sendKeys(Keys.TAB);
	
	
	
	//Second Row
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
	select2ndRow_1stColumn.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
	enter_AccountTxt.click();
	enter_AccountTxt.sendKeys("F");
	
	//int accountCount=openingBalAccountListInGrid.size();
	
	System.err.println(accountCount);
		
	for(int i=0 ; i < accountCount ;i++)
	{
		String data=openingBalAccountListInGrid.get(i).getText();
		
		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1085, 6)))
		{
			openingBalAccountListInGrid.get(i).click();
			
			break;
		}
	}
	
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
	enter_AccountTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));
	enter_DebitTxt.sendKeys(excelReader.getCellData(xlSheetName, 1086, 6));
    enter_DebitTxt.sendKeys(Keys.TAB);
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_OBCreditACTxt));
	enter_OBCreditACTxt.sendKeys(Keys.TAB);
	
	
	
	//Third Row

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
	select3rdRow_1stColumn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
	enter_AccountTxt.click();
	enter_AccountTxt.sendKeys("BR");
	
	System.err.println(accountCount);
		
	for(int i=0 ; i < accountCount ;i++)
	{
		String data=openingBalAccountListInGrid.get(i).getText();
		
		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1087, 6)))
		{
			openingBalAccountListInGrid.get(i).click();
			
			break;
		}
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
	enter_AccountTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));
	enter_DebitTxt.sendKeys(excelReader.getCellData(xlSheetName, 1088, 6));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));			
	enter_DebitTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_OBCreditACTxt));
	enter_OBCreditACTxt.sendKeys(Keys.TAB);
	
	
	
	
	//Fourth Row
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_1stColumn));
	select4thRow_1stColumn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
	enter_AccountTxt.click();
	enter_AccountTxt.sendKeys("ST");
	
	System.err.println(accountCount);
		
	for(int i=0 ; i < accountCount ;i++)
	{
	
		String data=openingBalAccountListInGrid.get(i).getText();
		
		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1089, 6)))
		{
			openingBalAccountListInGrid.get(i).click();
			
			break;
		}
	}
	
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
	enter_AccountTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));	
	enter_DebitTxt.sendKeys(excelReader.getCellData(xlSheetName, 1090, 6));
	enter_DebitTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_OBCreditACTxt));
	enter_OBCreditACTxt.sendKeys(Keys.TAB);

	
    //Fifth Row
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select5thRow_1stColumn));
	select5thRow_1stColumn.click();
	Thread.sleep(2000);
	
	
	enter_AccountTxt.click();
	enter_AccountTxt.sendKeys("Customer B");
	
	System.err.println(accountCount);
		
	for(int i=0 ; i < accountCount ;i++)
	{
	
		String data=openingBalAccountListInGrid.get(i).getText();
		
		if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1091, 6)))
		{
			openingBalAccountListInGrid.get(i).click();
			
			break;
		}
	}
	
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
	enter_AccountTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));	
	enter_DebitTxt.sendKeys(Keys.TAB);
			
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_OBCreditACTxt));
	enter_OBCreditACTxt.sendKeys(excelReader.getCellData(xlSheetName, 1092, 6));
			
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_OBCreditACTxt));
	enter_OBCreditACTxt.sendKeys(Keys.TAB);
	
		
	//Information Before Save
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	 
	String docno=documentNumberTxt.getAttribute("value");
	
	String actFooterCreditAmt=vocFooterCreditAmount.getText();
	String expFooterCreditAmt=excelReader.getCellData(xlSheetName, 1093, 7);
		
	excelReader.setCellData(xlfile, xlSheetName, 1093, 8, actFooterCreditAmt);
	
	 
	String actFooterDebitAmt=vocFooterdebitAmount.getText();
	String expFooterDebitAmt=excelReader.getCellData(xlSheetName, 1094, 7);
		
	excelReader.setCellData(xlfile, xlSheetName, 1094, 8, actFooterDebitAmt);
	 
	
	System.out.println("Entry PAge Footer Credit Amount "  +actFooterCreditAmt +"  Value Expected  "+expFooterCreditAmt);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	
	
	String actPartyName = billRefPartyName.getText();
	String expPartyName = excelReader.getCellData(xlSheetName, 1095, 7);
	
	 excelReader.setCellData(xlfile, xlSheetName, 1095, 8, actPartyName);
	
	System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
	
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefAdjustBillsGrid));
		
	String actAdjustbills=billRefAdjustBillsGrid.getAttribute("data-totalrows");
	String expAdjustbills="0";
	
	String expBillNewReference                      =excelReader.getCellData(xlSheetName, 1096, 7);
	String expBillTransactionCurrency               =excelReader.getCellData(xlSheetName, 1097, 7);
	String expBillBaseCurrency                      =excelReader.getCellData(xlSheetName, 1098, 7);
	String expBillLocalCurrency                     =excelReader.getCellData(xlSheetName, 1099, 7);
	String expBillBalanceNewRefAmount               =excelReader.getCellData(xlSheetName, 1100, 7);
	
    String expbillRefAdjustAmountInTransCurency         =excelReader.getCellData(xlSheetName, 1101, 7);
    String expbillRefBalanceAmountAdjustInTrnasCurrency =excelReader.getCellData(xlSheetName, 1102, 7);
    

    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
    String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
	String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
	String actBillBaseCurrency                           = billRefBaseCurrency.getText();
	String actBillLocalCurrency                          = localCurrencyDhs.getText();
	String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
    String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
    String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
    
        
    excelReader.setCellData(xlfile, xlSheetName, 1096, 8, actBillNewReference);
    excelReader.setCellData(xlfile, xlSheetName, 1097, 8, actBillTransactionCurrency);
    excelReader.setCellData(xlfile, xlSheetName, 1098, 8, actBillBaseCurrency);
    excelReader.setCellData(xlfile, xlSheetName, 1099, 8, actBillLocalCurrency);
    excelReader.setCellData(xlfile, xlSheetName, 1100, 8, actBillBalanceNewRefAmount);
    excelReader.setCellData(xlfile, xlSheetName, 1101, 8, actbillRefAdjustAmountInTransCurency);
    excelReader.setCellData(xlfile, xlSheetName, 1102, 8, actbillRefBalanceAmountAdjustInTrnasCurrency);
        
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	billRefNewReferenceTxt.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	billRefPickIcon.click();
	
    String expBillNewReferencePick                          = excelReader.getCellData(xlSheetName, 1104, 7);
	String expBillTransactionCurrencyPick                   = excelReader.getCellData(xlSheetName, 1105, 7);
	String expBillBaseCurrencyPick                          = excelReader.getCellData(xlSheetName, 1106, 7);
	String expBillLocalCurrencyPick                         = excelReader.getCellData(xlSheetName, 1107, 7);
	String expBillBalanceNewRefAmountPick                   = excelReader.getCellData(xlSheetName, 1108, 7);
    String expbillRefAdjustAmountInTransCurencyPick          = excelReader.getCellData(xlSheetName, 1109, 7);
    String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = excelReader.getCellData(xlSheetName, 1110, 7);
 
    String expconversationRateBaseCurrencyRatePick = excelReader.getCellData(xlSheetName, 1111, 7);
    String expconversationRateLocalCurrencyRatePick = excelReader.getCellData(xlSheetName, 1112, 7);
 		
 
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
      
    String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
	String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
	String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
	String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
	String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
	String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
    String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
	
    String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
    String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();
	
	
    excelReader.setCellData(xlfile, xlSheetName, 1104, 8, actBillNewReferencePick);
    excelReader.setCellData(xlfile, xlSheetName, 1105, 8, actBillTransactionCurrencyPick);
    excelReader.setCellData(xlfile, xlSheetName, 1106, 8, actBillBaseCurrencyPick);
    excelReader.setCellData(xlfile, xlSheetName, 1107, 8, actBillLocalCurrencyPick);
    excelReader.setCellData(xlfile, xlSheetName, 1108, 8, actBillBalanceNewRefAmountPick);
    excelReader.setCellData(xlfile, xlSheetName, 1109, 8, actbillRefAdjustAmountInTransCurencyPick);
    excelReader.setCellData(xlfile, xlSheetName, 1110, 8, actbillRefBalanceAmountAdjustInTrnasCurrencyPick);
    excelReader.setCellData(xlfile, xlSheetName, 1111, 8, actconversationRateBaseCurrencyRatePick); 
    excelReader.setCellData(xlfile, xlSheetName, 1112, 8, actconversationRateLocalCurrencyRatePick);
  
   
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
    billRefOkBtn.click();
    
    
    boolean savingVoucher=checkVoucherSavingMessage(docno);
    
    System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expDate :"+expAdjustbills);
    System.out.println("actBillNewReference :             "+ actBillNewReference +"                    "+ "expBillNewReference :"+expBillNewReference);
    System.out.println("actBillTransactionCurrency       :"+ actBillTransactionCurrency + "            " + "expBillTransactionCurrency :"+expBillTransactionCurrency);
    System.out.println("actBillBaseCurrency :             "+ actBillBaseCurrency + "                   " +"expBillBaseCurrency :"+expBillBaseCurrency);
    System.out.println("actBillLocalCurrency :            "+ actBillLocalCurrency+ "                   " +"expBillLocalCurrency :"+expBillLocalCurrency);
    System.out.println("actBillBalanceNewRefAmount :      "+ actBillBalanceNewRefAmount + "            " + "expBillBalanceNewRefAmount :"+expBillBalanceNewRefAmount);
    System.out.println("actbillRefAdjustAmountInTransCurency :"+ actbillRefAdjustAmountInTransCurency+ "       " +"expbillRefAdjustAmountInTransCurency :"+expbillRefAdjustAmountInTransCurency);
    System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrency :"+ actbillRefBalanceAmountAdjustInTrnasCurrency + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrency :"+expbillRefBalanceAmountAdjustInTrnasCurrency);

   //////Pick
    
    System.out.println("actBillNewReferencePick :              "+ actBillNewReferencePick +"                "+ "expBillNewReferencePick :"+expBillNewReferencePick);
    System.out.println("actBillTransactionCurrencyPick :       "+ actBillTransactionCurrencyPick + "        " + "expBillTransactionCurrencyPick :"+expBillTransactionCurrencyPick);
    System.out.println("actBillBaseCurrencyPick :              "+ actBillBaseCurrencyPick + "               " + "expBillBaseCurrencyPick :"+expBillBaseCurrencyPick);
    System.out.println("actBillLocalCurrencyPick :             "+ actBillLocalCurrency+ "                   " +"expBillLocalCurrencyPick :"+expBillLocalCurrency);
    System.out.println("actBillBalanceNewRefAmountPick :       "+ actBillBalanceNewRefAmountPick +          " " + "expBillBalanceNewRefAmountPick :"+expBillBalanceNewRefAmountPick);
    System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick+  "  " +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
    System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick+ " " + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
    System.out.println(" Voucher Saving Status                  "+savingVoucher +"                     "+"True");
    
    
    
    if (actPartyName.equalsIgnoreCase(expPartyName) && actAdjustbills.equalsIgnoreCase(expAdjustbills) && savingVoucher==true && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
			actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
			actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
		     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
			actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) && 
	        
    		
	        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
			actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
			actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick) &&
			actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
			actFooterCreditAmt.equalsIgnoreCase(expFooterCreditAmt))
    {
    	
    	System.out.println("*********Opening Balance INR Adjusting Sales invoice of INR Entry partial*********************");
        System.out.println(" Test Pass: Voucher SAved Successfully and Unsuspended Voucher is Dispalying in Billwise Screen ");
        excelReader.setCellData(xlfile, xlSheetName, 1080, 9, resPass);
        return true;
    }
    else
	{	
		excelReader.setCellData(xlfile, xlSheetName, 1080, 9, resFail);
		
		return false;
	}
  }
    catch (Exception e) 
	{
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1080, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	}
   }


  public boolean checkPreviousButtonInOpeningBalanceSavedVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			

		try
		{
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		    previousBtn.click();
		    
	        boolean loading=checkLoadingMessage();
	  		
	  		System.out.println("VoucherLoadingMessage  : "+loading+" Value Expected : "+"TRUE");
	    	
	  		String actDocno               = documentNumberTxt.getAttribute("value");
	        String actCurrency            = voucherHeaderCurrency.getAttribute("value");
			String actDepartment          = departmentTxt.getAttribute("value");
	        String actExchangeRate        = voucherHeaderExchangeRate.getAttribute("value");
	        String actLocExchangeRate     = voucherHeaderLocalExchangeRate.getAttribute("value");
			
			String actR1Account           = select1stRow_1stColumn.getText();
			String actR2Account           = select2ndRow_1stColumn.getText();
			String actR3Account           = select3rdRow_1stColumn.getText();
			String actR4Account           = select4thRow_1stColumn.getText();
			String actR5Account           = select5thRow_1stColumn.getText();
			
			String actR1Debit             = select1stRow_2ndColumn.getText();
			String actR2Debit             = select2ndRow_2ndColumn.getText();
			String actR3Debit             = select3rdRow_2ndColumn.getText();
			String actR4Debit             = select4thRow_2ndColumn.getText();
			String actR5Credit            = select5thRow_3rdColumn.getText();
	        String actR5Ref               = select5thRow_4thColumn.getText();
	        
	    	String actFooterCreditAmt    =vocFooterCreditAmount.getText();
	    	String actVoucherDebitAmt   = vocFooterdebitAmount.getText();
	    	
	    	 excelReader.setCellData(xlfile, xlSheetName, 1114, 8, actDocno);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1115, 8, actCurrency);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1116, 8, actDepartment);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1117, 8, actExchangeRate);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1118, 8, actLocExchangeRate);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1119, 8, actR1Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1120, 8, actR1Debit);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1121, 8, actR2Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1122, 8, actR2Debit);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1123, 8, actR3Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1124, 8, actR3Debit);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1125, 8, actR4Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1126, 8, actR4Debit); 
	    	 excelReader.setCellData(xlfile, xlSheetName, 1127, 8, actR5Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1128, 8, actR5Credit);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1129, 8, actR5Ref);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1130, 8, actFooterCreditAmt);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1131, 8, actVoucherDebitAmt);
	    	 
			
			String expDocno               = excelReader.getCellData(xlSheetName, 1114, 7);
		    String expCurrency            = excelReader.getCellData(xlSheetName, 1115, 7);
			String expDepartment          = excelReader.getCellData(xlSheetName, 1116, 7);
	        String expExchangeRate        = excelReader.getCellData(xlSheetName, 1117, 7);
	        String expLocExchangeRate     = excelReader.getCellData(xlSheetName, 1118, 7);

			String expR1Account           = excelReader.getCellData(xlSheetName, 1119, 7);
			String expR1Debit             = excelReader.getCellData(xlSheetName, 1120, 7);
			
			String expR2Account           = excelReader.getCellData(xlSheetName, 1121, 7);
			String expR2Debit             = excelReader.getCellData(xlSheetName, 1122, 7);
			
			String expR3Account           = excelReader.getCellData(xlSheetName, 1123, 7);
			String expR3Debit             = excelReader.getCellData(xlSheetName, 1124, 7);
			
			String expR4Account           = excelReader.getCellData(xlSheetName, 1125, 7);
			String expR4Debit             = excelReader.getCellData(xlSheetName, 1126, 7);
			
			String expR5Account           = excelReader.getCellData(xlSheetName, 1127, 7);
			String expR5Credit            = excelReader.getCellData(xlSheetName, 1128, 7);
			String expR5Ref               = excelReader.getCellData(xlSheetName, 1129, 7);
			
			String expFooterCreditAmt     = excelReader.getCellData(xlSheetName, 1130, 7);
	        String expVoucherDebitAmt     = excelReader.getCellData(xlSheetName, 1131, 7);

	        System.out.println("*******************************checkPreviousButtonInOpeningBalanceSavedVoucher**************************");

			System.out.println("Entry Page Document Number    "+actDocno           +"  value Expected  "+expDocno);
			System.out.println("Entry Page Currency           "+actCurrency        +"  value Expected  "+expCurrency);
			System.out.println("Entry Page Department         "+actDepartment      +"  value Expected  "+expDepartment);
			System.out.println("Entry Page Exchange Rate      "+actExchangeRate    +"  value Expected  "+expExchangeRate);
			System.out.println("Entry Page Department         "+actLocExchangeRate +"  value Expected  "+expLocExchangeRate);

			System.out.println("Entry Page R1Account          "+actR1Account       +"  value Expected  "+expR1Account);
			System.out.println("Entry Page R2Account          "+actR2Account       +"  value Expected  "+expR2Account);
			System.out.println("Entry Page R3Account          "+actR3Account       +"  value Expected  "+expR3Account);
			System.out.println("Entry Page R4Account          "+actR4Account       +"  value Expected  "+expR4Account);
			System.out.println("Entry Page R5Account          "+actR5Account       +"  value Expected  "+expR5Account);
			System.out.println("Entry Page R1Debit            "+actR1Debit         +"  value Expected  "+expR1Debit);
			System.out.println("Entry Page R2Debit            "+actR2Debit         +"  value Expected  "+expR2Debit);
			System.out.println("Entry Page R3Debit            "+actR3Debit         +"  value Expected  "+expR3Debit);
			System.out.println("Entry Page R4Debit            "+actR4Debit         +"  value Expected  "+expR4Debit);
			System.out.println("Entry Page R5Credit           "+actR5Credit        +"  value Expected  "+expR5Credit);
			System.out.println("Entry Page R5Ref              "+actR5Ref           +"  value Expected  "+expR5Ref);
			
			System.out.println("Entry Page Debit Amount       "+actVoucherDebitAmt +"  value Expected  "+expVoucherDebitAmt);
			System.out.println("Entry Page Credit Amount      "+actFooterCreditAmt +"  value Expected  "+expFooterCreditAmt);
			
			
			
			if (actDocno.equalsIgnoreCase(expDocno) && actCurrency.equalsIgnoreCase(expCurrency) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) && 
					
					actR1Account.equalsIgnoreCase(expR1Account) && actR1Debit.equalsIgnoreCase(expR1Debit) && 
					
					actR2Account.equalsIgnoreCase(expR2Account) && actR2Debit.equalsIgnoreCase(expR2Debit) && 
					actR3Account.equalsIgnoreCase(expR3Account) && actR3Debit.equalsIgnoreCase(expR3Debit) && 
					actR4Account.equalsIgnoreCase(expR4Account) && actR4Debit.equalsIgnoreCase(expR4Debit) && 
					
					actR5Account.equalsIgnoreCase(expR5Account) && actR5Credit.equalsIgnoreCase(expR5Credit) && 
					actR5Ref.equalsIgnoreCase(expR5Ref))
			{
				
				System.out.println(" Test Pass: Data Saved Successfully ");
				excelReader.setCellData(xlfile, xlSheetName, 1113, 9, resPass);
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Data  not Saved Successfully ");
				excelReader.setCellData(xlfile, xlSheetName, 1113, 9, resFail);
				return false;
			}
		}
		 catch (Exception e) 
		  {
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1113, 10, e.getMessage());
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			  return false;
		  }
		   }
		
		  
		  
		  
		  
	  // Delete Row In Billwise Row entry
	 
	   public boolean checkOpeningBalanceVoucherEditPreviousToDeleteRowBin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
		
		 try
		 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fifthRowIndex));
			fifthRowIndex.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
			deleteRowBtn.click();
			
			
			boolean actColumnR5C1GetText=select5thRow_1stColumn.getText().isEmpty();
			System.out.println("actColumnR5C1GetText  :  "+actColumnR5C1GetText);
			boolean expColumnR5C1GetText  = true;
			
			boolean actColumnR5C2GetText=select5thRow_2ndColumn.getText().isEmpty();
			System.out.println("actColumnR5C2GetText  :  "+actColumnR5C2GetText);
			boolean expColumnR5C2GetText  = true;
			
			boolean actColumnR5C3GetText=select5thRow_3rdColumn.getText().isEmpty();
			System.out.println("actColumnR5C3GetText  :  "+actColumnR5C3GetText);
			boolean expColumnR5C3GetText  = true;
			
			System.out.println("Bin Column after Delete Row Value Actual     :  " + actColumnR5C1GetText +   " Value Expected : " + expColumnR5C1GetText);
			System.out.println("Bin Column after Delete Row Value Actual     :  " + actColumnR5C2GetText +   " Value Expected : " + expColumnR5C2GetText);
			System.out.println("Bin Column after Delete Row Value Actual     :  " + actColumnR5C3GetText +   " Value Expected : " + expColumnR5C3GetText);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
			fourthRowIndex.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
			deleteRowBtn.click();
			
			
			boolean actColumnR4C1GetText=select4thRow_1stColumn.getText().isEmpty();
			System.out.println("actColumnR4C1GetText  :  "+actColumnR4C1GetText);
			boolean expColumnR4C1GetText  = true;
			
			boolean actColumnR4C2GetText=select4thRow_2ndColumn.getText().isEmpty();
			System.out.println("actColumnR5C2GetText  :  "+actColumnR4C2GetText);
			boolean expColumnR4C2GetText  = true;
			
			boolean actColumnR4C3GetText=select4thRow_3rdColumn.getText().isEmpty();
			System.out.println("actColumnR4C3GetText  :  "+actColumnR4C3GetText);
			boolean expColumnR4C3GetText  = true;
			
			System.out.println("Bin Column after Delete Row Value Actual     :  " + actColumnR4C1GetText +   " Value Expected : " + expColumnR4C1GetText);
			System.out.println("Bin Column after Delete Row Value Actual     :  " + actColumnR4C2GetText +   " Value Expected : " + expColumnR4C2GetText);
			System.out.println("Bin Column after Delete Row Value Actual     :  " + actColumnR4C3GetText +   " Value Expected : " + expColumnR4C3GetText);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
			fourthRowIndex.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(insertRowBtn));
			insertRowBtn.click();
			
			boolean actColumnR1GetText=select4thRow_1stColumn.getText().isEmpty();
			System.out.println("actColumnR1GetText  :  "+actColumnR1GetText);
			boolean expColumnR1GetText = true; 
			
			boolean actColumnR2GetText=select4thRow_2ndColumn.getText().isEmpty();
			System.out.println("actColumnR2GetText  :  "+actColumnR2GetText);
			boolean expColumnR2GetText = true;
			
			boolean actColumnR3GetText=select4thRow_3rdColumn.getText().isEmpty();
			System.out.println("actColumnR3GetText  :  "+actColumnR3GetText);
			boolean expColumnR3GetText = true;
			
			System.out.println("Bin Column after Delete Row Value Actual     :  " + actColumnR1GetText +   " Value Expected : " + expColumnR1GetText);
			System.out.println("Bin Column after Delete Row Value Actual     :  " + actColumnR2GetText +   " Value Expected : " + expColumnR2GetText);
			System.out.println("Bin Column after Delete Row Value Actual     :  " + actColumnR3GetText +   " Value Expected : " + expColumnR3GetText);
			
			
			boolean actMethod=actColumnR5C1GetText==expColumnR5C1GetText && actColumnR5C2GetText==expColumnR5C2GetText && actColumnR5C3GetText==expColumnR5C3GetText
					 && actColumnR4C1GetText==expColumnR4C1GetText && actColumnR4C2GetText==expColumnR4C2GetText && actColumnR4C3GetText==expColumnR4C3GetText
					&& actColumnR1GetText==expColumnR1GetText && actColumnR2GetText==expColumnR2GetText && actColumnR3GetText==expColumnR3GetText;
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 1133, 7);
			
			 excelReader.setCellData(xlfile, xlSheetName, 1133, 8, actResult.toUpperCase());
			
			
			if(actMethod==true)
			{
				System.out.println("Test Pass  deleted row Working  ");
				excelReader.setCellData(xlfile, xlSheetName, 1132, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail Not Deleted Row");
				excelReader.setCellData(xlfile, xlSheetName, 1132, 9, resFail);
				return false;
			}
		  }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1132, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
		   }
		  
	   
	   @FindBy(xpath = "//div[@id='idGlobalError']//div[1]//table[1]//tbody[1]//tr[1]//td[3]//span[1]")
	   public static WebElement errorMessage2CloseBtn;
		
		  
	   public boolean checkOpeningBalanceVoucherEditPreviousUpdateRowAndSave() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
		
		 try
		 {
			 
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_1stColumn));
				select4thRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
								
				enter_AccountTxt.click();
				enter_AccountTxt.sendKeys(Keys.SPACE);
				
				//Fourth Row
			    int accountCount=openingBalAccountListInGrid.size();
				System.err.println(accountCount);	
				
				for(int i=0 ; i < accountCount ;i++)
				{
				
					String data=openingBalAccountListInGrid.get(i).getText();
					
					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1135, 6)))
					{
						openingBalAccountListInGrid.get(i).click();
						
						break;
					}
				}
				
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
				enter_AccountTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));	
				enter_DebitTxt.sendKeys(Keys.TAB);
						
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_OBCreditACTxt));
				enter_OBCreditACTxt.sendKeys(excelReader.getCellData(xlSheetName, 1136, 6));
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select5thRow_1stColumn));
				select5thRow_1stColumn.click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
				enter_AccountTxt.click();
				enter_AccountTxt.sendKeys("ST");
				
				System.err.println(accountCount);
					
				for(int i=0 ; i < accountCount ;i++)
				{
				
					String data=openingBalAccountListInGrid.get(i).getText();
					
					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1137, 6)))
					{
						openingBalAccountListInGrid.get(i).click();
						
						break;
					}
				}
				
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
				enter_AccountTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));	
				enter_DebitTxt.sendKeys(excelReader.getCellData(xlSheetName, 1138, 6));
				enter_DebitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_OBCreditACTxt));
				enter_OBCreditACTxt.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select6thRow_1stColumn));
				select6thRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
								
				enter_AccountTxt.click();
				enter_AccountTxt.sendKeys(Keys.SPACE);
				
				//Sixth Row
			    int accountCount2=openingBalAccountListInGrid.size();
				System.err.println(accountCount2);	
				
				for(int i=0 ; i < accountCount2 ;i++)
				{
				
					String data=openingBalAccountListInGrid.get(i).getText();
					
					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1139, 6)))
					{
						openingBalAccountListInGrid.get(i).click();
						
						break;
					}
				}
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
				enter_AccountTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));	
				enter_DebitTxt.sendKeys(Keys.TAB);
						
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_OBCreditACTxt));
				enter_OBCreditACTxt.sendKeys(excelReader.getCellData(xlSheetName, 1140, 6));
				
				
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				 
				String docno=documentNumberTxt.getAttribute("value");
				
				System.err.println("docno :  "+docno);
				
				String actFooterCreditAmt=vocFooterCreditAmount.getText();
				String expFooterCreditAmt=excelReader.getCellData(xlSheetName, 1141, 7);
					
				 excelReader.setCellData(xlfile, xlSheetName, 1141, 8, actFooterCreditAmt);
				
				System.out.println("Entry PAge Footer Credit Amount "  +actFooterCreditAmt +"  Value Expected  "+expFooterCreditAmt);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				
				String actPartyName = billRefPartyName.getText();
				String expPartyName = excelReader.getCellData(xlSheetName, 1142, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 1142, 8, actPartyName);
				
				System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
				
				
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefAdjustBillsGrid));
					
				String actAdjustbills=billRefAdjustBillsGrid.getAttribute("data-totalrows");
				String expAdjustbills="0";
				
				String expBillNewReference                      =excelReader.getCellData(xlSheetName, 1143, 7);
				String expBillTransactionCurrency               =excelReader.getCellData(xlSheetName, 1144, 7);
				String expBillBaseCurrency                      =excelReader.getCellData(xlSheetName, 1145, 7);
				String expBillLocalCurrency                     =excelReader.getCellData(xlSheetName, 1146, 7);
				String expBillBalanceNewRefAmount               =excelReader.getCellData(xlSheetName, 1147, 7);
				
		        String expbillRefAdjustAmountInTransCurency         =excelReader.getCellData(xlSheetName, 1148, 7);
		        String expbillRefBalanceAmountAdjustInTrnasCurrency =excelReader.getCellData(xlSheetName, 1149, 7);
		        

		        
		        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		        String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
				String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
				String actBillBaseCurrency                           = billRefBaseCurrency.getText();
				String actBillLocalCurrency                          = localCurrencyDhs.getText();
				String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
		        String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
		        String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
		        
		        
		        excelReader.setCellData(xlfile, xlSheetName, 1143, 8, actBillNewReference);
		        excelReader.setCellData(xlfile, xlSheetName, 1144, 8, actBillTransactionCurrency);
		        excelReader.setCellData(xlfile, xlSheetName, 1145, 8, actBillBaseCurrency);
		        excelReader.setCellData(xlfile, xlSheetName, 1146, 8, actBillLocalCurrency);
		        excelReader.setCellData(xlfile, xlSheetName, 1147, 8, actBillBalanceNewRefAmount);
		        excelReader.setCellData(xlfile, xlSheetName, 1148, 8, actbillRefAdjustAmountInTransCurency);
		        excelReader.setCellData(xlfile, xlSheetName, 1149, 8, actbillRefBalanceAmountAdjustInTrnasCurrency);
		        
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		 		billRefNewReferenceTxt.click();
		 		
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 		billRefPickIcon.click();
		    	
		        String expBillNewReferencePick                          = excelReader.getCellData(xlSheetName, 1151, 7);
		 		String expBillTransactionCurrencyPick                   = excelReader.getCellData(xlSheetName, 1152, 7);
		 		String expBillBaseCurrencyPick                          = excelReader.getCellData(xlSheetName, 1153, 7);
		 		String expBillLocalCurrencyPick                         = excelReader.getCellData(xlSheetName, 1154, 7);
		 		String expBillBalanceNewRefAmountPick                   = excelReader.getCellData(xlSheetName, 1155, 7);
		 	    String expbillRefAdjustAmountInTransCurencyPick          = excelReader.getCellData(xlSheetName,1156, 7);
		        String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = excelReader.getCellData(xlSheetName, 1157, 7);
		 
		        String expconversationRateBaseCurrencyRatePick = excelReader.getCellData(xlSheetName, 1158, 7);
		        String expconversationRateLocalCurrencyRatePick = excelReader.getCellData(xlSheetName, 1159, 7);
		 		
		 
		        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		      
		        String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
		 		String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
		 		String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
		 		String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
		 		String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
		 		String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
			    String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
		 		
		 	    String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
		        String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();
		 		
		    	
		        excelReader.setCellData(xlfile, xlSheetName, 1151, 8, actBillNewReferencePick);
		        excelReader.setCellData(xlfile, xlSheetName, 1152, 8, actBillTransactionCurrencyPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1153, 8, actBillBaseCurrencyPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1154, 8, actBillLocalCurrencyPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1155, 8, actBillBalanceNewRefAmountPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1156, 8, actbillRefAdjustAmountInTransCurencyPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1157, 8, actbillRefBalanceAmountAdjustInTrnasCurrencyPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1158, 8, actconversationRateBaseCurrencyRatePick); 
		        excelReader.setCellData(xlfile, xlSheetName, 1159, 8, actconversationRateLocalCurrencyRatePick);
				
				
		        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		        billRefOkBtn.click();
		        
		        
		        Thread.sleep(2000);
		        //To Validate Cash Negative Message 
			    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
				String actErrrorMessage = errorMessage.getText();
				String expErrorMessage =excelReader.getCellData(xlSheetName, 1160, 7);
		 		
              excelReader.setCellData(xlfile, xlSheetName, 1160, 8, actErrrorMessage);
				
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage2CloseBtn));
				errorMessage2CloseBtn.click();
		        
		        boolean savingVoucher=checkVoucherSavingMessage(docno);
		        
		        System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expDate :"+expAdjustbills);
		        System.out.println("actBillNewReference :             "+ actBillNewReference +"                    "+ "expBillNewReference :"+expBillNewReference);
		        System.out.println("actBillTransactionCurrency       :"+ actBillTransactionCurrency + "            " + "expBillTransactionCurrency :"+expBillTransactionCurrency);
		        System.out.println("actBillBaseCurrency :             "+ actBillBaseCurrency + "                   " +"expBillBaseCurrency :"+expBillBaseCurrency);
		        System.out.println("actBillLocalCurrency :            "+ actBillLocalCurrency+ "                   " +"expBillLocalCurrency :"+expBillLocalCurrency);
		        System.out.println("actBillBalanceNewRefAmount :      "+ actBillBalanceNewRefAmount + "            " + "expBillBalanceNewRefAmount :"+expBillBalanceNewRefAmount);
		       
		        System.out.println("actbillRefAdjustAmountInTransCurency :"+ actbillRefAdjustAmountInTransCurency+ "       " +"expbillRefAdjustAmountInTransCurency :"+expbillRefAdjustAmountInTransCurency);
		        System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrency :"+ actbillRefBalanceAmountAdjustInTrnasCurrency + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrency :"+expbillRefBalanceAmountAdjustInTrnasCurrency);

		         
		       //////Pick
		        
		        System.out.println("actBillNewReferencePick :              "+ actBillNewReferencePick +"              "+ "expBillNewReferencePick :"+expBillNewReferencePick);
		        System.out.println("actBillTransactionCurrencyPick :       "+ actBillTransactionCurrencyPick + "     " + "expBillTransactionCurrencyPick :"+expBillTransactionCurrencyPick);
		        System.out.println("actBillBaseCurrencyPick :              "+ actBillBaseCurrencyPick + "            " + "expBillBaseCurrencyPick :"+expBillBaseCurrencyPick);
		        System.out.println("actBillLocalCurrencyPick :             "+ actBillLocalCurrency+ "                " +"expBillLocalCurrencyPick :"+expBillLocalCurrency);
		        System.out.println("actBillBalanceNewRefAmountPick :       "+ actBillBalanceNewRefAmountPick +        " " + "expBillBalanceNewRefAmountPick :"+expBillBalanceNewRefAmountPick);
		        System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick+ "  " +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
		        System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick+ " " + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
		       	      
		        
		        System.out.println(" Voucher Saving Status             "+savingVoucher +"                     "+"True");
		        System.out.println(" Voucher Saving Message :          "+actErrrorMessage+"                    "+expErrorMessage);
		        
		        
		        if (actPartyName.equalsIgnoreCase(expPartyName) && actAdjustbills.equalsIgnoreCase(expAdjustbills) && savingVoucher==true && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
		 				actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
		 				actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
		 			     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
		 				actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) && 
		 		        
		        		
		 		        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
						actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
						actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick) &&
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
						actFooterCreditAmt.equalsIgnoreCase(expFooterCreditAmt)&& actErrrorMessage.equalsIgnoreCase(expErrorMessage))
		     
			{
				System.out.println("Test Pass  deleted row Working  ");
				excelReader.setCellData(xlfile, xlSheetName, 1134, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail Not Deleted Row");
				excelReader.setCellData(xlfile, xlSheetName, 1134, 9, resFail);
				return false;
			}
		  }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1134, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
		   }
		  
		  
		 
	   
	   public boolean checkCopyandPasteToClipboardInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		   
		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		  try 
		  {

		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		    previousBtn.click();
		    
	        boolean loading=checkLoadingMessage();
	  		
	  		System.out.println("VoucherLoadingMessage  : "+loading+" Value Expected : "+"TRUE");
		   
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
	  		toggleBtn.click();
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copytoClipboardBtn));
	  		copytoClipboardBtn.click();
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nextBtn));
	  		nextBtn.click();
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
	  		toggleBtn.click();
	  		
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pastefromClipboardBtn));
	  		pastefromClipboardBtn.click();
	  						  		
	  		String expValidationMessage=excelReader.getCellData(xlSheetName, 1162, 7);
	  		
	  		String actValidationMessage=checkValidationMessage(expValidationMessage);
	  		excelReader.setCellData(xlfile, xlSheetName, 1162, 8, actValidationMessage);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sixthRowIndex));
			sixthRowIndex.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
			deleteRowBtn.click();
	  						  		
			boolean actColumnR6C1GetText=select6thRow_1stColumn.getText().isEmpty();
			System.out.println("actColumnR6C1GetText  :  "+actColumnR6C1GetText);
			boolean expColumnR6C1GetText  = true;

			
			String actDocno               = documentNumberTxt.getAttribute("value");
	        String actCurrency            = voucherHeaderCurrency.getAttribute("value");
			String actDepartment          = departmentTxt.getAttribute("value");
	        String actExchangeRate        = voucherHeaderExchangeRate.getAttribute("value");
	        String actLocExchangeRate     = voucherHeaderLocalExchangeRate.getAttribute("value");
			
			String actR1Account           = select1stRow_1stColumn.getText();
			String actR2Account           = select2ndRow_1stColumn.getText();
			String actR3Account           = select3rdRow_1stColumn.getText();
			String actR4Account           = select4thRow_1stColumn.getText();
			String actR5Account           = select5thRow_1stColumn.getText();
			
			String actR1Debit             = select1stRow_2ndColumn.getText();
			String actR2Debit             = select2ndRow_2ndColumn.getText();
			String actR3Debit             = select3rdRow_2ndColumn.getText();
			String actR4Credit            = select4thRow_3rdColumn.getText();
			String actR5Debit             = select5thRow_2ndColumn.getText();
	       
	        
	    	String actFooterCreditAmt    =vocFooterCreditAmount.getText();
	    	String actVoucherDebitAmt   = vocFooterdebitAmount.getText();
	    	
	    	 excelReader.setCellData(xlfile, xlSheetName, 1163, 8, actDocno);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1164, 8, actCurrency);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1165, 8, actDepartment);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1166, 8, actExchangeRate);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1167, 8, actLocExchangeRate);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1168, 8, actR1Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1169, 8, actR1Debit);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1170, 8, actR2Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1171, 8, actR2Debit);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1172, 8, actR3Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1173, 8, actR3Debit);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1174, 8, actR4Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1175, 8, actR4Credit); 
	    	 excelReader.setCellData(xlfile, xlSheetName, 1176, 8, actR5Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1177, 8, actR5Debit);
	    	 
	    	 excelReader.setCellData(xlfile, xlSheetName, 1178, 8, actFooterCreditAmt);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1179, 8, actVoucherDebitAmt);
	    	 
			
			String expDocno               = excelReader.getCellData(xlSheetName, 1163, 7);
		    String expCurrency            = excelReader.getCellData(xlSheetName, 1164, 7);
			String expDepartment          = excelReader.getCellData(xlSheetName, 1165, 7);
	        String expExchangeRate        = excelReader.getCellData(xlSheetName, 1166, 7);
	        String expLocExchangeRate     = excelReader.getCellData(xlSheetName, 1167, 7);

			String expR1Account           = excelReader.getCellData(xlSheetName, 1168, 7);
			String expR1Debit             = excelReader.getCellData(xlSheetName, 1169, 7);
			
			String expR2Account           = excelReader.getCellData(xlSheetName, 1170, 7);
			String expR2Debit             = excelReader.getCellData(xlSheetName, 1171, 7);
			
			String expR3Account           = excelReader.getCellData(xlSheetName, 1172, 7);
			String expR3Debit             = excelReader.getCellData(xlSheetName, 1173, 7);
			
			String expR4Account           = excelReader.getCellData(xlSheetName, 1174, 7);
			String expR4Credit             = excelReader.getCellData(xlSheetName, 1175, 7);
			
			String expR5Account           = excelReader.getCellData(xlSheetName, 1176, 7);
			String expR5Debit             = excelReader.getCellData(xlSheetName, 1177, 7);
			
			String expFooterCreditAmt     = excelReader.getCellData(xlSheetName, 1178, 7);
	        String expVoucherDebitAmt     = excelReader.getCellData(xlSheetName, 1179, 7);
		


			System.out.println("Entry Page Document Number    "+actDocno           +"  value Expected  "+expDocno);
			System.out.println("Entry Page Currency           "+actCurrency        +"  value Expected  "+expCurrency);
			System.out.println("Entry Page Department         "+actDepartment      +"  value Expected  "+expDepartment);
			System.out.println("Entry Page Exchange Rate      "+actExchangeRate    +"  value Expected  "+expExchangeRate);
			System.out.println("Entry Page Department         "+actLocExchangeRate +"  value Expected  "+expLocExchangeRate);

			System.out.println("Entry Page R1Account          "+actR1Account       +"  value Expected  "+expR1Account);
			System.out.println("Entry Page R2Account          "+actR2Account       +"  value Expected  "+expR2Account);
			System.out.println("Entry Page R3Account          "+actR3Account       +"  value Expected  "+expR3Account);
			System.out.println("Entry Page R4Account          "+actR4Account       +"  value Expected  "+expR4Account);
			System.out.println("Entry Page R5Account          "+actR5Account       +"  value Expected  "+expR5Account);
			
			System.out.println("Entry Page R1Debit            "+actR1Debit         +"  value Expected  "+expR1Debit);
			System.out.println("Entry Page R2Debit            "+actR2Debit         +"  value Expected  "+expR2Debit);
			System.out.println("Entry Page R3Debit            "+actR3Debit         +"  value Expected  "+expR3Debit);
			System.out.println("Entry Page R4Debit            "+actR4Credit         +"  value Expected  "+expR4Credit);
			System.out.println("Entry Page R5Credit           "+actR5Debit        +"  value Expected  "+expR5Debit);
			
			System.out.println("Entry Page Debit Amount       "+actVoucherDebitAmt +"  value Expected  "+expVoucherDebitAmt);
			System.out.println("Entry Page Credit Amount      "+actFooterCreditAmt +"  value Expected  "+expFooterCreditAmt);
			System.out.println("Delete Row  After Copy From Clipboard : "+actColumnR6C1GetText+"  value Expected  "+expColumnR6C1GetText);
			System.out.println("ValidationMessage                     : "+actValidationMessage +"  value Expected  "+expValidationMessage);
			
			
			if (loading==true && actDocno.equalsIgnoreCase(expDocno) && actCurrency.equalsIgnoreCase(expCurrency) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) && 
					
					actR1Account.equalsIgnoreCase(expR1Account) && actR1Debit.equalsIgnoreCase(expR1Debit) && 
					
					actR2Account.equalsIgnoreCase(expR2Account) && actR2Debit.equalsIgnoreCase(expR2Debit) && 
					actR3Account.equalsIgnoreCase(expR3Account) && actR3Debit.equalsIgnoreCase(expR3Debit) && 
					actR4Account.equalsIgnoreCase(expR4Account) && actR4Credit.equalsIgnoreCase(expR4Credit) && 
					
					actR5Account.equalsIgnoreCase(expR5Account) && actR5Debit.equalsIgnoreCase(expR5Debit) && 
					
					actFooterCreditAmt.equalsIgnoreCase(expFooterCreditAmt) && 
					
					actVoucherDebitAmt.equalsIgnoreCase(expVoucherDebitAmt) && actColumnR6C1GetText==expColumnR6C1GetText)
			{
				
				System.out.println(" Test Pass: Data Saved Successfully ");
				excelReader.setCellData(xlfile, xlSheetName, 1161, 9, resPass);
				return true;
			}
			else 
			{
				System.out.println(" Test Pass: Data Saved Successfully ");
				excelReader.setCellData(xlfile, xlSheetName, 1161, 9, resFail);
				return false;
			}
	   }
	   catch (Exception e) 
	   {
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1057, 10, e.getMessage());
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		  return false;
	    }
	}

	   
	   
	   
	   public boolean checkSavingOpeningBalanceVoucherAfterCopyToClipBoard() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	   {
		   
		   excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		   
		   try
		   {
		   
			String docno=documentNumberTxt.getAttribute("value");
			
			System.err.println("docno :  "+docno);
		   
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		    saveBtn.click();
		   
		    
		    String actPartyName = billRefPartyName.getText();
			String expPartyName = excelReader.getCellData(xlSheetName, 1181, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 1181, 8, actPartyName);
			
			System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
			
			
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefAdjustBillsGrid));
				
			String actAdjustbills=billRefAdjustBillsGrid.getAttribute("data-totalrows");
			String expAdjustbills="0";
			
			String expBillNewReference                      =excelReader.getCellData(xlSheetName, 1182, 7);
			String expBillTransactionCurrency               =excelReader.getCellData(xlSheetName, 1183, 7);
			String expBillBaseCurrency                      =excelReader.getCellData(xlSheetName, 1184, 7);
			String expBillLocalCurrency                     =excelReader.getCellData(xlSheetName, 1185, 7);
			String expBillBalanceNewRefAmount               =excelReader.getCellData(xlSheetName, 1186, 7);
			
	        String expbillRefAdjustAmountInTransCurency         =excelReader.getCellData(xlSheetName, 1187, 7);
	        String expbillRefBalanceAmountAdjustInTrnasCurrency =excelReader.getCellData(xlSheetName, 1188, 7);
	        

	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	        String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
			String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
			String actBillBaseCurrency                           = billRefBaseCurrency.getText();
			String actBillLocalCurrency                          = localCurrencyDhs.getText();
			String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
	        String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
	        String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
	        
	        
	        excelReader.setCellData(xlfile, xlSheetName, 1182, 8, actBillNewReference);
	        excelReader.setCellData(xlfile, xlSheetName, 1183, 8, actBillTransactionCurrency);
	        excelReader.setCellData(xlfile, xlSheetName, 1184, 8, actBillBaseCurrency);
	        excelReader.setCellData(xlfile, xlSheetName, 1185, 8, actBillLocalCurrency);
	        excelReader.setCellData(xlfile, xlSheetName, 1186, 8, actBillBalanceNewRefAmount);
	        excelReader.setCellData(xlfile, xlSheetName, 1187, 8, actbillRefAdjustAmountInTransCurency);
	        excelReader.setCellData(xlfile, xlSheetName, 1188, 8, actbillRefBalanceAmountAdjustInTrnasCurrency);
	        
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	 		billRefNewReferenceTxt.click();
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	 		billRefPickIcon.click();
	    	
	        String expBillNewReferencePick                          = excelReader.getCellData(xlSheetName, 1151, 7);
	 		String expBillTransactionCurrencyPick                   = excelReader.getCellData(xlSheetName, 1152, 7);
	 		String expBillBaseCurrencyPick                          = excelReader.getCellData(xlSheetName, 1153, 7);
	 		String expBillLocalCurrencyPick                         = excelReader.getCellData(xlSheetName, 1154, 7);
	 		String expBillBalanceNewRefAmountPick                   = excelReader.getCellData(xlSheetName, 1155, 7);
	 	    String expbillRefAdjustAmountInTransCurencyPick          = excelReader.getCellData(xlSheetName,1156, 7);
	        String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = excelReader.getCellData(xlSheetName, 1157, 7);
	 
	        String expconversationRateBaseCurrencyRatePick = excelReader.getCellData(xlSheetName, 1158, 7);
	        String expconversationRateLocalCurrencyRatePick = excelReader.getCellData(xlSheetName, 1159, 7);
	 		
	 
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	      
	        String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
	 		String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
	 		String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
	 		String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
	 		String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
	 		String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
		    String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
	 		
	 	    String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
	        String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();
	 		
	    	
	        excelReader.setCellData(xlfile, xlSheetName, 1190, 8, actBillNewReferencePick);
	        excelReader.setCellData(xlfile, xlSheetName, 1191, 8, actBillTransactionCurrencyPick);
	        excelReader.setCellData(xlfile, xlSheetName, 1192, 8, actBillBaseCurrencyPick);
	        excelReader.setCellData(xlfile, xlSheetName, 1193, 8, actBillLocalCurrencyPick);
	        excelReader.setCellData(xlfile, xlSheetName, 1194, 8, actBillBalanceNewRefAmountPick);
	        excelReader.setCellData(xlfile, xlSheetName, 1195, 8, actbillRefAdjustAmountInTransCurencyPick);
	        excelReader.setCellData(xlfile, xlSheetName, 1196, 8, actbillRefBalanceAmountAdjustInTrnasCurrencyPick);
	        excelReader.setCellData(xlfile, xlSheetName, 1197, 8, actconversationRateBaseCurrencyRatePick); 
	        excelReader.setCellData(xlfile, xlSheetName, 1198, 8, actconversationRateLocalCurrencyRatePick);
		    
		    
		    
		  
	       
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
	        billRefOkBtn.click();
	        
	        boolean savingVoucher=checkVoucherSavingMessage(docno);
	        
	        System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expDate :"+expAdjustbills);
	        System.out.println("actBillNewReference :             "+ actBillNewReference +"                    "+ "expBillNewReference :"+expBillNewReference);
	        System.out.println("actBillTransactionCurrency       :"+ actBillTransactionCurrency + "            " + "expBillTransactionCurrency :"+expBillTransactionCurrency);
	        System.out.println("actBillBaseCurrency :             "+ actBillBaseCurrency + "                   " +"expBillBaseCurrency :"+expBillBaseCurrency);
	        System.out.println("actBillLocalCurrency :            "+ actBillLocalCurrency+ "                   " +"expBillLocalCurrency :"+expBillLocalCurrency);
	        System.out.println("actBillBalanceNewRefAmount :      "+ actBillBalanceNewRefAmount + "            " + "expBillBalanceNewRefAmount :"+expBillBalanceNewRefAmount);
	       
	        System.out.println("actbillRefAdjustAmountInTransCurency :"+ actbillRefAdjustAmountInTransCurency+ "       " +"expbillRefAdjustAmountInTransCurency :"+expbillRefAdjustAmountInTransCurency);
	        System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrency :"+ actbillRefBalanceAmountAdjustInTrnasCurrency + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrency :"+expbillRefBalanceAmountAdjustInTrnasCurrency);

	         
	       //////Pick
	        
	        System.out.println("actBillNewReferencePick :              "+ actBillNewReferencePick +"              "+ "expBillNewReferencePick :"+expBillNewReferencePick);
	        System.out.println("actBillTransactionCurrencyPick :       "+ actBillTransactionCurrencyPick + "     " + "expBillTransactionCurrencyPick :"+expBillTransactionCurrencyPick);
	        System.out.println("actBillBaseCurrencyPick :              "+ actBillBaseCurrencyPick + "            " + "expBillBaseCurrencyPick :"+expBillBaseCurrencyPick);
	        System.out.println("actBillLocalCurrencyPick :             "+ actBillLocalCurrency+ "                " +"expBillLocalCurrencyPick :"+expBillLocalCurrency);
	        System.out.println("actBillBalanceNewRefAmountPick :       "+ actBillBalanceNewRefAmountPick +        " " + "expBillBalanceNewRefAmountPick :"+expBillBalanceNewRefAmountPick);
	        System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick+ "  " +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
	        System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick+ " " + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
	       	      
	        
	        System.out.println(" Voucher Saving Status             "+savingVoucher +"                     "+"True");
	     
	        
	        
	        if (actPartyName.equalsIgnoreCase(expPartyName) && actAdjustbills.equalsIgnoreCase(expAdjustbills) && savingVoucher==true && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
	 				actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
	 				actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
	 			     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
	 				actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) && 
	 		        
	        		
	 		        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
					actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
					actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick) &&
					actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick))
	     
		     {
			
	        	excelReader.setCellData(xlfile, xlSheetName, 1180, 9, resPass);
			    return true;
		     }
		    else
	    	{
			
		    	excelReader.setCellData(xlfile, xlSheetName, 1180, 9, resFail);
			    return false;
		    }
	       }
		   catch (Exception e) 
			  {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1180, 10, exception);
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  return false;
			  }
	   }
		   
	   public boolean checkDeleteOptionFromEntryPageinOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		   excelReader=new ExcelReader(POJOUtility.getExcelPath());
		   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		  
		   try
		   {
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		   previousBtn.click();
		   
		   boolean loading=checkLoadingMessage();
		   
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DeleteBtn));
		   new_DeleteBtn.click();
		   
		   getWaitForAlert();
			
		   String actAlertMessage=getAlert().getText();
			
		   String expAlertMessage=excelReader.getCellData(xlSheetName, 1200, 7);
	 		
         excelReader.setCellData(xlfile, xlSheetName, 1200, 8, actAlertMessage);
		   
		   
			System.out.println("Alert Message on Deleteing the Voucher :  "+actAlertMessage +"  "+expAlertMessage);
			
			getAlert().accept();
			
			boolean deleteMessage=checkEntryPageDeleteMessage();
			
			System.out.println("DeleteMesssage  : "+deleteMessage+" Value Expected : "+"TRUE");
		
			String actDisplayDeleteMesssage=Boolean.toString(deleteMessage);
			String expDisplayDeleteMesssage=excelReader.getCellData(xlSheetName, 1201, 7);
	 		
           excelReader.setCellData(xlfile, xlSheetName, 1201, 8, actDisplayDeleteMesssage.toUpperCase());
			
			
			if(actAlertMessage.contains(expAlertMessage) && deleteMessage==true)
			{
				System.out.println("Test Pass : Deleted Voucher");
				
				excelReader.setCellData(xlfile, xlSheetName, 1199, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Deleted Voucher");
				
				excelReader.setCellData(xlfile, xlSheetName, 1199, 9, resFail);
				return false;
			}
		   }
		   catch (Exception e) 
			  {
		
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1199, 10, e.getMessage());
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  return false;
			  }
			   
	   }
	   
	   

		public boolean checkOpeningBalanceNewCopyDocumentOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String actdocNumber=documentNumberTxt.getAttribute("value");
			String expdocNumber="2";
			
			System.out.println("documnet Number : "+actdocNumber+""+expdocNumber);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
			toggleBtn.click();
			
			boolean Copydocument=copyDocumentOption.isDisplayed();
			
			String actCopydocument=Boolean.toString(Copydocument);
			String expCopydocument=excelReader.getCellData(xlSheetName, 1203, 7);
	 		
			
          excelReader.setCellData(xlfile, xlSheetName, 1203, 8, actCopydocument.toUpperCase());
			
			System.out.println("Copy Document Option : "+actCopydocument+""+expCopydocument);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyDocumentOption));
			
			if(actdocNumber.equalsIgnoreCase(expdocNumber) && actCopydocument.equalsIgnoreCase(expCopydocument))
			{
				System.out.println("Test Pass : Copy Document Option Displayed");
				
				excelReader.setCellData(xlfile, xlSheetName, 1202, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Copy Document Option NOT Displayed");
				
				excelReader.setCellData(xlfile, xlSheetName, 1202, 9, resFail);
				return false;
			}
			}
			catch (Exception e) 
			  {
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1202, 10, e.getMessage());
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  return false;
			  }
	}
		
		
			

		
		
		// Copy document Screen Elements
		
		@FindBy(xpath="//input[@id='optCopyDocType']")
		private static WebElement cd_vouchertypeTxt;
		
		@FindBy(xpath="//select[@id='id_searchoncolumns']")
		private static WebElement cd_searchOnDropdown1;
		
		@FindBy(xpath="//div[@id='id_transaction_entry_container_others']//div[5]//select[1]")
		private static WebElement cd_searchOnDropdown2;
		
		@FindBy(xpath="//input[@id='srch_doc']")
		private static WebElement cd_searchTxt;
		
		@FindBy(xpath="//input[@id='id_transaction_entry_copydocument_refresh']")
		private static WebElement cd_refreshBtn;
		
		@FindBy(xpath="//input[@id='id_transaction_entry_copydocument_filter_togglebutton']")
		private static WebElement cd_filterBtn;
		
		@FindBy(xpath="//input[@id='copydoc_HeaderChkBox']")
		private static WebElement cd_HeaderChkBox;
		
		@FindBy(xpath="//tr[@id='tr_copydoc_voucher_1']//td//input")
		private static WebElement cd_FirstChkBox;
		
		@FindBy(xpath="//input[@id='id_chkclubsimilartxn']")
		private static WebElement cd_clubsimilarTransChkBox;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid1_buttonsrow']/div[3]/input")
		private static WebElement cd_SelectallBtn;
		
		@FindBy(xpath="//button[@id='btn_firstPage']")
		private static WebElement cd_firstBtn;
		
		@FindBy(xpath="//button[@id='btn_previousPage']")
		private static WebElement cd_PreviousBtn;
		
		@FindBy(xpath="//button[@id='input_pagenumber']")
		private static WebElement cd_PageNo;
		
		@FindBy(xpath="//button[@id='btn_nextPage']")
		private static WebElement cd_nextBtn; 
		
		@FindBy(xpath="//button[@id='btn_lastPage']")
		private static WebElement cd_LastBtn;
		
		@FindBy(xpath="//input[@id='id_transaction_copydoc_ok']")
		private static WebElement cd_OkBtn;
		
		@FindBy(xpath="//input[@id='id_transaction_copydoc_cancel']")
		private static WebElement cd_CancelBtn;
		
		
		// Gird 
		// row 1
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[1]")
		private static WebElement cd_IndexRow1;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[2]")
		private static WebElement cd_R1C2;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[3]")
		private static WebElement cd_R1C3;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[4]")
		private static WebElement cd_R1C4;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[5]")
		private static WebElement cd_R1C5;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[6]")
		private static WebElement cd_R1C6;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[7]")
		private static WebElement cd_R1C7;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[8]")
		private static WebElement cd_R1C8;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[9]")
		private static WebElement cd_R1C9;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[10]")
		private static WebElement cd_R1C10;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[11]")
		private static WebElement cd_R1C11;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[12]")
		private static WebElement cd_R1C12;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[13]")
		private static WebElement cd_R1C13;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[14]")
		private static WebElement cd_R1C14;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[15]")
		private static WebElement cd_R1C15;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[16]")
		private static WebElement cd_R1C16;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_1']/td[17]")
		private static WebElement cd_R1C17;
		
		
		// row 2
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[1]")
		private static WebElement cd_IndexRow2;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[2]")
		private static WebElement cd_R2C2;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[3]")
		private static WebElement cd_R2C3;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[4]")
		private static WebElement cd_R2C4;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[5]")
		private static WebElement cd_R2C5;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[6]")
		private static WebElement cd_R2C6;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[7]")
		private static WebElement cd_R2C7;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[8]")
		private static WebElement cd_R2C8;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[9]")
		private static WebElement cd_R2C9;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[10]")
		private static WebElement cd_R2C10;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[11]")
		private static WebElement cd_R2C11;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[12]")
		private static WebElement cd_R2C12;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[13]")
		private static WebElement cd_R2C13;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[14]")
		private static WebElement cd_R2C14;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[15]")
		private static WebElement cd_R2C15;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[16]")
		private static WebElement cd_R2C16;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_2']/td[17]")
		private static WebElement cd_R2C17;

		// row 3
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[1]")
		private static WebElement cd_IndexRow3;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[2]")
		private static WebElement cd_R3C2;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[3]")
		private static WebElement cd_R3C3;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[4]")
		private static WebElement cd_R3C4;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[5]")
		private static WebElement cd_R3C5;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[6]")
		private static WebElement cd_R3C6;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[7]")
		private static WebElement cd_R3C7;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[8]")
		private static WebElement cd_R3C8;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[9]")
		private static WebElement cd_R3C9;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[10]")
		private static WebElement cd_R3C10;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[11]")
		private static WebElement cd_R3C11;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[12]")
		private static WebElement cd_R3C12;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[13]")
		private static WebElement cd_R3C13;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[14]")
		private static WebElement cd_R3C14;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[15]")
		private static WebElement cd_R3C15;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[16]")
		private static WebElement cd_R3C16;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_3']/td[17]")
		private static WebElement cd_R3C17;
		
		
		// row 4		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[1]")
		private static WebElement cd_IndexRow4;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[2]")
		private static WebElement cd_R4C2;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[3]")
		private static WebElement cd_R4C3;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[4]")
		private static WebElement cd_R4C4;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[5]")
		private static WebElement cd_R4C5;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[6]")
		private static WebElement cd_R4C6;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[7]")
		private static WebElement cd_R4C7;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[8]")
		private static WebElement cd_R4C8;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[9]")
		private static WebElement cd_R4C9;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[10]")
		private static WebElement cd_R4C10;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[11]")
		private static WebElement cd_R4C11;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[12]")
		private static WebElement cd_R4C12;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[13]")
		private static WebElement cd_R4C13;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[14]")
		private static WebElement cd_R4C14;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[15]")
		private static WebElement cd_R4C15;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[16]")
		private static WebElement cd_R4C16;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[17]")
		private static WebElement cd_R4C17;
		
		
		// row 5
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[1]")
		private static WebElement cd_IndexRow5;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[2]")
		private static WebElement cd_R5C2;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[3]")
		private static WebElement cd_R5C3;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[4]")
		private static WebElement cd_R5C4;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[5]")
		private static WebElement cd_R5C5;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[6]")
		private static WebElement cd_R5C6;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[7]")
		private static WebElement cd_R5C7;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[8]")
		private static WebElement cd_R5C8;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[9]")
		private static WebElement cd_R5C9;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[10]")
		private static WebElement cd_R5C10;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[11]")
		private static WebElement cd_R5C11;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[12]")
		private static WebElement cd_R5C12;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[13]")
		private static WebElement cd_R5C13;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[14]")
		private static WebElement cd_R5C14;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_5']/td[15]")
		private static WebElement cd_R5C15;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[16]")
		private static WebElement cd_R5C16;
		
		@FindBy(xpath="//*[@id='id_copydoc_grid2_tr_4']/td[17]")
		private static WebElement cd_R5C17;

		
		public boolean checkOpeningBalanceNewCopyDocumentScreenOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyDocumentOption));
			copyDocumentOption.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_vouchertypeTxt));
			
			boolean actcd_vouchertypeTxt=cd_vouchertypeTxt.isDisplayed();
			boolean actcd_searchOnDropdown1=cd_searchOnDropdown1.isDisplayed();
			boolean actcd_searchOnDropdown2=cd_searchOnDropdown2.isDisplayed();
			boolean actcd_searchTxt=cd_searchTxt.isDisplayed();
			boolean actcd_refreshBtn=cd_refreshBtn.isDisplayed();
			boolean actcd_filterBtn=cd_filterBtn.isDisplayed();
			boolean actcd_HeaderChkBox=cd_HeaderChkBox.isDisplayed();
			boolean actcd_FirstChkBox=cd_FirstChkBox.isDisplayed();
			boolean actcd_clubsimilarTransChkBox=cd_clubsimilarTransChkBox.isDisplayed();
			boolean actcd_SelectallBtn=cd_SelectallBtn.isDisplayed();
			boolean actcd_firstBtn=cd_firstBtn.isDisplayed();
			boolean actcd_PreviousBtn=cd_PreviousBtn.isDisplayed();
			boolean actcd_PageNo=cd_PageNo.isDisplayed();
			boolean actcd_nextBtn=cd_nextBtn.isDisplayed();
			boolean actcd_LastBtn=cd_LastBtn.isDisplayed();
			boolean actcd_OkBtn=cd_OkBtn.isDisplayed();
			boolean actcd_CancelBtn=cd_CancelBtn.isDisplayed();
			
			
			boolean expcd_vouchertypeTxt=true;
			boolean expcd_searchOnDropdown1=true;
			boolean expcd_searchOnDropdown2=true;
			boolean expcd_searchTxt=true;
			boolean expcd_refreshBtn=true;
			boolean expcd_filterBtn=true;
			boolean expcd_HeaderChkBox=true;
			boolean expcd_FirstChkBox=true;
			boolean expcd_clubsimilarTransChkBox=true;
			boolean expcd_SelectallBtn=true;
			boolean expcd_firstBtn=true;
			boolean expcd_PreviousBtn=true;
			boolean expcd_PageNo=true;
			boolean expcd_nextBtn=true;
			boolean expcd_LastBtn=true;
			boolean expcd_OkBtn=true;
			boolean expcd_CancelBtn=true;
			
			System.out.println("Copy Document Voucher type Value Actual               : " + actcd_vouchertypeTxt+         " Value Expected  : " + expcd_vouchertypeTxt);
			System.out.println("Copy Document Search dropdown 1 Value Actual          : " + actcd_searchOnDropdown1+      " Value Expected  : " + expcd_searchOnDropdown1);
			System.out.println("Copy Document Search dropdown 2 Value Actual          : " + actcd_searchOnDropdown2+      " Value Expected  : " + expcd_searchOnDropdown2);
			System.out.println("Copy Document Search text Value Actual                : " + actcd_searchTxt+              " Value Expected  : " + expcd_searchTxt);
			System.out.println("Copy Document Refresh Value Actual                    : " + actcd_refreshBtn+             " Value Expected  : " + expcd_refreshBtn);
			System.out.println("Copy Document Filter Value Actual                     : " + actcd_filterBtn+              " Value Expected  : " + expcd_filterBtn);
			System.out.println("Copy Document Header Chk box Value Actual             : " + actcd_HeaderChkBox+           " Value Expected  : " + expcd_HeaderChkBox);
			System.out.println("Copy Document First Chk Box Value Actual              : " + actcd_FirstChkBox+            " Value Expected  : " + expcd_FirstChkBox);
			System.out.println("Copy Document Club Similar Trans Chk Box Value Actual : " + actcd_clubsimilarTransChkBox+ " Value Expected  : " + expcd_clubsimilarTransChkBox);
			System.out.println("Copy Document Select All Value Actual                 : " + actcd_SelectallBtn+           " Value Expected  : " + expcd_SelectallBtn);
			System.out.println("Copy Document first Button Value Actual               : " + actcd_firstBtn+               " Value Expected  : " + expcd_firstBtn);
			System.out.println("Copy Document Previous Button Value Actual            : " + actcd_PreviousBtn+            " Value Expected  : " + expcd_PreviousBtn);
			System.out.println("Copy Document Page No Value Actual                    : " + actcd_PageNo+                 " Value Expected  : " + expcd_PageNo);
			System.out.println("Copy Document Next Button Value Actual                : " + actcd_nextBtn+                " Value Expected  : " + expcd_nextBtn);
			System.out.println("Copy Document last Button Value Actual                : " + actcd_LastBtn+                " Value Expected  : " + expcd_LastBtn);
			System.out.println("Copy Document Ok Button Value Actual                  : " + actcd_OkBtn+                  " Value Expected  : " + expcd_OkBtn);
			System.out.println("Copy Document cancel Button Value Actual              : " + actcd_CancelBtn+              " Value Expected  : " + expcd_CancelBtn);
			
			
			
			boolean actMethod=actcd_vouchertypeTxt==expcd_vouchertypeTxt && actcd_searchOnDropdown1==expcd_searchOnDropdown1
					&& actcd_searchOnDropdown2==expcd_searchOnDropdown2 && actcd_searchTxt==expcd_searchTxt
					&& actcd_refreshBtn==expcd_refreshBtn && actcd_filterBtn==expcd_filterBtn
					&& actcd_HeaderChkBox==expcd_HeaderChkBox && actcd_FirstChkBox==expcd_FirstChkBox
					&& actcd_clubsimilarTransChkBox==expcd_clubsimilarTransChkBox && actcd_SelectallBtn==expcd_SelectallBtn
					&& actcd_firstBtn==expcd_firstBtn && actcd_PreviousBtn==expcd_PreviousBtn
					&& actcd_PageNo==expcd_PageNo && actcd_nextBtn==expcd_nextBtn
					&& actcd_LastBtn==expcd_LastBtn && actcd_OkBtn==expcd_OkBtn && actcd_CancelBtn==expcd_CancelBtn;
			
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 1205, 7);
	 		
          excelReader.setCellData(xlfile, xlSheetName, 1205, 8, actResult.toUpperCase());
			
			if(actMethod==true)
			{
				System.out.println("Test Pass : Copy Document Options Are As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 1204, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Copy Document Options Are NOT As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 1204, 9, resFail);
				return false;
			}
			}
			catch (Exception e) 
			  {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1204, 10, exception);
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
				  return false;
			  }
			   }

			
	   
	   
	   
	   
		public boolean checkOpeningBalanceFirstRowCheckboxInCopyDocumentInOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			try 
			{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FirstChkBox));
			cd_FirstChkBox.click();
			
			String actCopyDocAccR1=cd_R1C2.getText();
			String actCopyDocDebitR1=cd_R1C3.getText();
			
			
			String actCopyDocAccR2=cd_R2C2.getText();
			String actCopyDocDebitR2=cd_R2C3.getText();
			
			
			String actCopyDocAccR3=cd_R3C2.getText();
			String actCopyDocDebitR3=cd_R3C3.getText();
			
			
			String actCopyDocAccR4=cd_R4C2.getText();
			boolean actCopyDocDebitR4=cd_R4C3.getText().isEmpty();
			String actCopyDocCreditR4=cd_R4C4.getText();
			
			
			String actCopyDocAccR5=cd_R5C2.getText();
			String actCopyDocDebitR5=cd_R5C3.getText();
			
			
			excelReader.setCellData(xlfile, xlSheetName, 1207, 8, actCopyDocAccR1);
			excelReader.setCellData(xlfile, xlSheetName, 1208, 8, actCopyDocDebitR1);
			excelReader.setCellData(xlfile, xlSheetName, 1209, 8, actCopyDocAccR2);
			excelReader.setCellData(xlfile, xlSheetName, 1210, 8, actCopyDocDebitR2);
			excelReader.setCellData(xlfile, xlSheetName, 1211, 8, actCopyDocAccR3);
			excelReader.setCellData(xlfile, xlSheetName, 1212, 8, actCopyDocDebitR3);
			excelReader.setCellData(xlfile, xlSheetName, 1213, 8, actCopyDocAccR4);
			excelReader.setCellData(xlfile, xlSheetName, 1214, 8, actCopyDocCreditR4);
			excelReader.setCellData(xlfile, xlSheetName, 1215, 8, actCopyDocAccR5);
			excelReader.setCellData(xlfile, xlSheetName, 1216, 8, actCopyDocDebitR5);
	
			
			// expected values
			String expCopyDocAccR1    =excelReader.getCellData(xlSheetName, 1207, 7);
			String expCopyDocDebitR1=excelReader.getCellData(xlSheetName, 1208, 7);
			
			
			String expCopyDocAccR2=excelReader.getCellData(xlSheetName, 1209, 7);
			String expCopyDocDebitR2=excelReader.getCellData(xlSheetName, 1210, 7);
			
			
			String expCopyDocAccR3=excelReader.getCellData(xlSheetName, 1211, 7);
			String expCopyDocDebitR3=excelReader.getCellData(xlSheetName, 1212, 7);
			
			String expCopyDocAccR4=excelReader.getCellData(xlSheetName, 1213, 7);
			boolean expCopyDocDebitR4=true;
			String expCopyDocCreditR4=excelReader.getCellData(xlSheetName, 1214, 7);
	
			
			String expCopyDocAccR5=excelReader.getCellData(xlSheetName, 1215, 7);
			String expCopyDocDebitR5=excelReader.getCellData(xlSheetName, 1216, 7);
			
			
			System.out.println("Copy Doc ACC Row 1 Value Actual      : " + actCopyDocAccR1   +  " Value Expected : " + expCopyDocAccR1);
			System.out.println("Copy Doc Debit Row 1  Value Actual   : " + actCopyDocDebitR1 +  " Value Expected : " + expCopyDocDebitR1);
			
			System.out.println("Copy Doc ACC Row 2 Value Actual      : " + actCopyDocAccR2   +  " Value Expected : " + expCopyDocAccR2);
			System.out.println("Copy Doc Debit Row 2 Value Actual    : " + actCopyDocDebitR2 +  " Value Expected : " + expCopyDocDebitR2);
			
			System.out.println("Copy Doc ACC Row 3 Value Actual      : " + actCopyDocAccR3   +  " Value Expected : " + expCopyDocAccR3);
			System.out.println("Copy Doc Debit Row 3 Value Actual    : " + actCopyDocDebitR3 +  " Value Expected : " + expCopyDocDebitR3);
			
			System.out.println("Copy Doc ACC Row 4 Value Actual      : " + actCopyDocAccR4   +  " Value Expected : " + expCopyDocAccR4);
			System.out.println("Copy Doc Debit Row 4 Value Actual    : " + actCopyDocDebitR4 +  " Value Expected : " + expCopyDocDebitR4);
			System.out.println("Copy Doc Credit Row 4 Value Actual   : " + actCopyDocCreditR4+  " Value Expected : " + expCopyDocCreditR4);
			
			System.out.println("Copy Doc Item Row 5 Value Actual     : " + actCopyDocAccR5   +  " Value Expected : " + expCopyDocAccR5);
			System.out.println("Copy Doc Debit Row 5 Value Actual    : " + actCopyDocDebitR5 +  " Value Expected : " + expCopyDocDebitR5);
			
			
			
			if(actCopyDocAccR1.equalsIgnoreCase(expCopyDocAccR1) && actCopyDocDebitR1.equalsIgnoreCase(expCopyDocDebitR1)
					
					&& actCopyDocAccR2.equalsIgnoreCase(expCopyDocAccR2) && actCopyDocDebitR2.equalsIgnoreCase(expCopyDocDebitR2)
					
					&& actCopyDocAccR3.equalsIgnoreCase(expCopyDocAccR3) && actCopyDocDebitR3.equalsIgnoreCase(expCopyDocDebitR3)
					
					&& actCopyDocAccR4.equalsIgnoreCase(expCopyDocAccR4) && actCopyDocDebitR4==expCopyDocDebitR4
					
					&& actCopyDocCreditR4.equalsIgnoreCase(expCopyDocCreditR4)
					
					&& actCopyDocAccR5.equalsIgnoreCase(expCopyDocAccR5) && actCopyDocDebitR5.equalsIgnoreCase(expCopyDocDebitR5))
			{
			
				excelReader.setCellData(xlfile, xlSheetName, 1206, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Copy Document Options Are NOT As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 1206, 9, resFail);
				return false;
			}
			}
			
			  catch (Exception e) 
			  {
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1206, 10, e.getMessage());
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  return false;
			  }
			   }

		
		
		public boolean checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_OkBtn));
			cd_OkBtn.click();
			
          Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			documentNumberTxt.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sixthRowIndex));
			sixthRowIndex.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
			deleteRowBtn.click();
			
			String actDocno               = documentNumberTxt.getAttribute("value");
	        String actCurrency            = voucherHeaderCurrency.getAttribute("value");
			String actDepartment          = departmentTxt.getAttribute("value");
	        String actExchangeRate        = voucherHeaderExchangeRate.getAttribute("value");
	        String actLocExchangeRate     = voucherHeaderLocalExchangeRate.getAttribute("value");
			
			String actR1Account           = select1stRow_1stColumn.getText();
			String actR2Account           = select2ndRow_1stColumn.getText();
			String actR3Account           = select3rdRow_1stColumn.getText();
			String actR4Account           = select4thRow_1stColumn.getText();
			String actR5Account           = select5thRow_1stColumn.getText();
			
			String actR1Debit             = select1stRow_2ndColumn.getText();
			String actR2Debit             = select2ndRow_2ndColumn.getText();
			String actR3Debit             = select3rdRow_2ndColumn.getText();
			String actR4Credit            = select4thRow_3rdColumn.getText();
			String actR5Debit             = select5thRow_2ndColumn.getText();
	       
	        
	    	String actFooterCreditAmt    =vocFooterCreditAmount.getText();
	    	String actVoucherDebitAmt   = vocFooterdebitAmount.getText();
	    	
	    	 excelReader.setCellData(xlfile, xlSheetName, 1218, 8, actDocno);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1219, 8, actCurrency);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1220, 8, actDepartment);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1221, 8, actExchangeRate);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1222, 8, actLocExchangeRate);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1223, 8, actR1Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1224, 8, actR1Debit);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1225, 8, actR2Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1226, 8, actR2Debit);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1227, 8, actR3Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1228, 8, actR3Debit);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1229, 8, actR4Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1230, 8, actR4Credit); 
	    	 excelReader.setCellData(xlfile, xlSheetName, 1231, 8, actR5Account);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1232, 8, actR5Debit);
	    	 
	    	 excelReader.setCellData(xlfile, xlSheetName, 1233, 8, actFooterCreditAmt);
	    	 excelReader.setCellData(xlfile, xlSheetName, 1234, 8, actVoucherDebitAmt);
	    	 
			
			String expDocno               = excelReader.getCellData(xlSheetName, 1218, 7);
		    String expCurrency            = excelReader.getCellData(xlSheetName, 1219, 7);
			String expDepartment          = excelReader.getCellData(xlSheetName, 1220, 7);
	        String expExchangeRate        = excelReader.getCellData(xlSheetName, 1221, 7);
	        String expLocExchangeRate     = excelReader.getCellData(xlSheetName, 1222, 7);

			String expR1Account           = excelReader.getCellData(xlSheetName, 1223, 7);
			String expR1Debit             = excelReader.getCellData(xlSheetName, 1224, 7);
			
			String expR2Account           = excelReader.getCellData(xlSheetName, 1225, 7);
			String expR2Debit             = excelReader.getCellData(xlSheetName, 1226, 7);
			
			String expR3Account           = excelReader.getCellData(xlSheetName, 1227, 7);
			String expR3Debit             = excelReader.getCellData(xlSheetName, 1228, 7);
			
			String expR4Account           = excelReader.getCellData(xlSheetName, 1229, 7);
			String expR4Credit             = excelReader.getCellData(xlSheetName, 1230, 7);
			
			String expR5Account           = excelReader.getCellData(xlSheetName, 1231, 7);
			String expR5Debit             = excelReader.getCellData(xlSheetName, 1232, 7);
			
			String expFooterCreditAmt     = excelReader.getCellData(xlSheetName, 1233, 7);
	        String expVoucherDebitAmt     = excelReader.getCellData(xlSheetName, 1234, 7);
		
			
			System.out.println("Entry Page Document Number    "+actDocno           +"  value Expected  "+expDocno);
			System.out.println("Entry Page Currency           "+actCurrency        +"  value Expected  "+expCurrency);
			System.out.println("Entry Page Department         "+actDepartment      +"  value Expected  "+expDepartment);
			System.out.println("Entry Page Exchange Rate      "+actExchangeRate    +"  value Expected  "+expExchangeRate);
			System.out.println("Entry Page Department         "+actLocExchangeRate +"  value Expected  "+expLocExchangeRate);
			System.out.println("Entry Page R1Account          "+actR1Account       +"  value Expected  "+expR1Account);
			System.out.println("Entry Page R2Account          "+actR2Account       +"  value Expected  "+expR2Account);
			System.out.println("Entry Page R3Account          "+actR3Account       +"  value Expected  "+expR3Account);
			System.out.println("Entry Page R4Account          "+actR4Account       +"  value Expected  "+expR4Account);
			System.out.println("Entry Page R5Account          "+actR5Account       +"  value Expected  "+expR5Account);
			System.out.println("Entry Page R1Debit            "+actR1Debit         +"  value Expected  "+expR1Debit);
			System.out.println("Entry Page R2Debit            "+actR2Debit         +"  value Expected  "+expR2Debit);
			System.out.println("Entry Page R3Debit            "+actR3Debit         +"  value Expected  "+expR3Debit);
			System.out.println("Entry Page R4Debit            "+actR4Credit        +"  value Expected  "+expR4Credit);
			System.out.println("Entry Page R5Credit           "+actR5Debit         +"  value Expected  "+expR5Debit);
			System.out.println("Entry Page Debit Amount       "+actVoucherDebitAmt +"  value Expected  "+expVoucherDebitAmt);
			System.out.println("Entry Page Credit Amount      "+actFooterCreditAmt +"  value Expected  "+expFooterCreditAmt);
			
			
			if ( actDocno.equalsIgnoreCase(expDocno) && actCurrency.equalsIgnoreCase(expCurrency) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) && 
					
					actR1Account.equalsIgnoreCase(expR1Account) && actR1Debit.equalsIgnoreCase(expR1Debit) && 
					
					actR2Account.equalsIgnoreCase(expR2Account) && actR2Debit.equalsIgnoreCase(expR2Debit) && 
					actR3Account.equalsIgnoreCase(expR3Account) && actR3Debit.equalsIgnoreCase(expR3Debit) && 
					actR4Account.equalsIgnoreCase(expR4Account) && actR4Credit.equalsIgnoreCase(expR4Credit) && 
					
					actR5Account.equalsIgnoreCase(expR5Account) && actR5Debit.equalsIgnoreCase(expR5Debit) && 
					
					actFooterCreditAmt.equalsIgnoreCase(expFooterCreditAmt) && 
					
					actVoucherDebitAmt.equalsIgnoreCase(expVoucherDebitAmt))
			{
				
				System.out.println(" Test Pass: Data Saved Successfully ");
				excelReader.setCellData(xlfile, xlSheetName, 1217, 9, resPass);
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Data  Not Saved Successfully ");
				excelReader.setCellData(xlfile, xlSheetName, 1217, 9, resFail);
				return false;
			}
			
			}
			  catch (Exception e) 
			  {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1217, 10, exception);
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
				  return false;
			  }
			   

		}
		
		
		
		 public boolean checkSavingOpeningBalanceVoucherAfterCopyDocument() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		   {
			   
			   excelReader=new ExcelReader(POJOUtility.getExcelPath());
			   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			   
			   try
			   {
			   
				String docno=documentNumberTxt.getAttribute("value");
				
				System.err.println("docno :  "+docno);
			   
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			    saveBtn.click();
			   
			    
			    
			    String actPartyName = billRefPartyName.getText();
				String expPartyName = excelReader.getCellData(xlSheetName, 1236, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 1236, 8, actPartyName);
				
				System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
				
				
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefAdjustBillsGrid));
					
				String actAdjustbills=billRefAdjustBillsGrid.getAttribute("data-totalrows");
				String expAdjustbills="0";
				
				String expBillNewReference                      =excelReader.getCellData(xlSheetName, 1237, 7);
				String expBillTransactionCurrency               =excelReader.getCellData(xlSheetName, 1238, 7);
				String expBillBaseCurrency                      =excelReader.getCellData(xlSheetName, 1239, 7);
				String expBillLocalCurrency                     =excelReader.getCellData(xlSheetName, 1240, 7);
				String expBillBalanceNewRefAmount               =excelReader.getCellData(xlSheetName, 1241, 7);
				
		        String expbillRefAdjustAmountInTransCurency         =excelReader.getCellData(xlSheetName, 1242, 7);
		        String expbillRefBalanceAmountAdjustInTrnasCurrency =excelReader.getCellData(xlSheetName, 1243, 7);
		        

		        
		        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		        String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
				String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
				String actBillBaseCurrency                           = billRefBaseCurrency.getText();
				String actBillLocalCurrency                          = localCurrencyDhs.getText();
				String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
		        String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
		        String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
		        
		        
		        excelReader.setCellData(xlfile, xlSheetName, 1237, 8, actBillNewReference);
		        excelReader.setCellData(xlfile, xlSheetName, 1238, 8, actBillTransactionCurrency);
		        excelReader.setCellData(xlfile, xlSheetName, 1239, 8, actBillBaseCurrency);
		        excelReader.setCellData(xlfile, xlSheetName, 1240, 8, actBillLocalCurrency);
		        excelReader.setCellData(xlfile, xlSheetName, 1241, 8, actBillBalanceNewRefAmount);
		        excelReader.setCellData(xlfile, xlSheetName, 1242, 8, actbillRefAdjustAmountInTransCurency);
		        excelReader.setCellData(xlfile, xlSheetName, 1243, 8, actbillRefBalanceAmountAdjustInTrnasCurrency);
		        
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		 		billRefNewReferenceTxt.click();
		 		
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 		billRefPickIcon.click();
		    	
		        String expBillNewReferencePick                          = excelReader.getCellData(xlSheetName, 1245, 7);
		 		String expBillTransactionCurrencyPick                   = excelReader.getCellData(xlSheetName, 1246, 7);
		 		String expBillBaseCurrencyPick                          = excelReader.getCellData(xlSheetName, 1247, 7);
		 		String expBillLocalCurrencyPick                         = excelReader.getCellData(xlSheetName, 1248, 7);
		 		String expBillBalanceNewRefAmountPick                   = excelReader.getCellData(xlSheetName, 1249, 7);
		 	    String expbillRefAdjustAmountInTransCurencyPick          = excelReader.getCellData(xlSheetName,1250, 7);
		        String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = excelReader.getCellData(xlSheetName, 1251, 7);
		 
		        String expconversationRateBaseCurrencyRatePick = excelReader.getCellData(xlSheetName, 1252, 7);
		        String expconversationRateLocalCurrencyRatePick = excelReader.getCellData(xlSheetName, 1253, 7);
		 		
		 
		        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		      
		        String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
		 		String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
		 		String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
		 		String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
		 		String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
		 		String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
			    String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
		 		
		 	    String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
		        String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();
		 		
		    	
		        excelReader.setCellData(xlfile, xlSheetName, 1245, 8, actBillNewReferencePick);
		        excelReader.setCellData(xlfile, xlSheetName, 1246, 8, actBillTransactionCurrencyPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1247, 8, actBillBaseCurrencyPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1248, 8, actBillLocalCurrencyPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1249, 8, actBillBalanceNewRefAmountPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1250, 8, actbillRefAdjustAmountInTransCurencyPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1251, 8, actbillRefBalanceAmountAdjustInTrnasCurrencyPick);
		        excelReader.setCellData(xlfile, xlSheetName, 1252, 8, actconversationRateBaseCurrencyRatePick); 
		        excelReader.setCellData(xlfile, xlSheetName, 1253, 8, actconversationRateLocalCurrencyRatePick);
			    
			    
			   /* ssds
			    
			    String actPartyName = billRefPartyName.getText();
				String expPartyName = "Customer B (122-002)";
				
				System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
				
				
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefAdjustBillsGrid));
					
				String actAdjustbills=billRefAdjustBillsGrid.getAttribute("data-totalrows");
				String expAdjustbills="0";
				
				String expBillNewReference                          = "0.00";
				String expBillTransactionCurrency                   = "400.00";
				String expBillBaseCurrency                          = "400.00";
				String expBillLocalCurrency                         = "28.00";
				String expBillBalanceNewRefAmount                   = "0.00";
		        String expbillRefAdjustAmountInTransCurency         = "0.00";
		        String expbillRefBalanceAmountAdjustInTrnasCurrency = "400.00";
		        

		        
		        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		        String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
				String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
				String actBillBaseCurrency                           = billRefBaseCurrency.getText();
				String actBillLocalCurrency                          = localCurrencyDhs.getText();
				String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
		        String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
		        String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
		        
		        
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		 		billRefNewReferenceTxt.click();
		         
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 		billRefPickIcon.click();
		        
		        String expBillNewReferencePick                  = "400.00";
		 		String expBillTransactionCurrencyPick           = "400.00";
		 		String expBillBaseCurrencyPick                  = "400.00";
		 		String expBillLocalCurrencyPick                 = "28.00";
		 		String expBillBalanceNewRefAmountPick           = "400.00";
		        String expconversationRateBaseCurrencyRatePick  = "1";
		        String expconversationRateLocalCurrencyRatePick = "0.07";
		 		
		 
		        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		      
		        String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
		 		String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
		 		String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
		 		String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
		 		String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
		 	    String actconversationRateBaseCurrencyRatePick           = conversationRateBaseCurrencyRate.getText();
		        String actconversationRateLocalCurrencyRatePick          = conversationRateLocalCurrencyRate.getText();
		        String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
		        String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();*/
		      
		       
		        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		        billRefOkBtn.click();
		        
		        boolean savingVoucher=checkVoucherSavingMessage(docno);
		        
		        System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expDate :"+expAdjustbills);
		        System.out.println("actBillNewReference :             "+ actBillNewReference +"                    "+ "expBillNewReference :"+expBillNewReference);
		        System.out.println("actBillTransactionCurrency       :"+ actBillTransactionCurrency + "            " + "expBillTransactionCurrency :"+expBillTransactionCurrency);
		        System.out.println("actBillBaseCurrency :             "+ actBillBaseCurrency + "                   " +"expBillBaseCurrency :"+expBillBaseCurrency);
		        System.out.println("actBillLocalCurrency :            "+ actBillLocalCurrency+ "                   " +"expBillLocalCurrency :"+expBillLocalCurrency);
		        System.out.println("actBillBalanceNewRefAmount :      "+ actBillBalanceNewRefAmount + "            " + "expBillBalanceNewRefAmount :"+expBillBalanceNewRefAmount);
		       
		        System.out.println("actbillRefAdjustAmountInTransCurency         :"+ actbillRefAdjustAmountInTransCurency+ "       " +"expbillRefAdjustAmountInTransCurency :"+expbillRefAdjustAmountInTransCurency);
		        System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrency :"+ actbillRefBalanceAmountAdjustInTrnasCurrency + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrency :"+expbillRefBalanceAmountAdjustInTrnasCurrency);

		         
		       //////Pick
		        
		        System.out.println("actBillNewReferencePick :              "+ actBillNewReferencePick +"              "+ "expBillNewReferencePick :"+expBillNewReferencePick);
		        System.out.println("actBillTransactionCurrencyPick :       "+ actBillTransactionCurrencyPick + "     " + "expBillTransactionCurrencyPick :"+expBillTransactionCurrencyPick);
		        System.out.println("actBillBaseCurrencyPick :              "+ actBillBaseCurrencyPick + "            " + "expBillBaseCurrencyPick :"+expBillBaseCurrencyPick);
		        System.out.println("actBillLocalCurrencyPick :             "+ actBillLocalCurrency+ "                " +"expBillLocalCurrencyPick :"+expBillLocalCurrency);
		        System.out.println("actBillBalanceNewRefAmountPick :       "+ actBillBalanceNewRefAmountPick +        " " + "expBillBalanceNewRefAmountPick :"+expBillBalanceNewRefAmountPick);
		        System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick+ "  " +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
		        System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick+ " " + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
		        System.out.println(" Voucher Saving Status                 "+savingVoucher +"                     "+"True");
		     
		        
		        
		        if (actPartyName.equalsIgnoreCase(expPartyName) && actAdjustbills.equalsIgnoreCase(expAdjustbills) && savingVoucher==true && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
		 				actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
		 				actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
		 			     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
		 				actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) && 
		 		        
		        		
		 		        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
						actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
						actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick) &&
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick))
		     
			{
				
		        	excelReader.setCellData(xlfile, xlSheetName, 1235, 9, resPass);
				    return true;
			}
			else
			{
				
				excelReader.setCellData(xlfile, xlSheetName, 1235, 9, resFail);
				return false;
			}
		  }
			   catch (Exception e) 
				  {
					  String exception =e.getMessage();
					  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1235, 10, exception);
					  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
					  return false;
				  }
				   }
		  
		
		public boolean checksuspendedOptionInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			   
			   try
			   {
				   
				   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
				   previousBtn.click(); 
				   
				   
				   boolean loading=checkLoadingMessage();
				   
				   Thread.sleep(1000);
				   
				   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				   
				   String docno=documentNumberTxt.getAttribute("value");
				   
				   String actdocno=documentNumberTxt.getAttribute("value");
				   String expDocno=excelReader.getCellData(xlSheetName, 1255, 7);
			 		
				 		   
				   System.out.println("Previous Button Click  :  " + actdocno + " Value Expected : " + expDocno);
				   
				   excelReader.setCellData(xlfile, xlSheetName, 1255, 8, actdocno);
				   
				   
				   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_SuspendBtn));
				   new_SuspendBtn.click();
					
					boolean savingMessage=checkVoucherSavingMessage(docno);
					
					String actSuspendingStatus=Boolean.toString(savingMessage);
					String expSavingStatus =excelReader.getCellData(xlSheetName, 1256, 7);
			 		
					excelReader.setCellData(xlfile, xlSheetName, 1256, 8, actSuspendingStatus.toUpperCase());
							
					
					System.out.println("SavingMessage  :  " + savingMessage + " Value Expected : " + " TRUE ");
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
					new_CloseBtn.click();
					
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendStatusRow1));
					String actSuspendStatusR1=suspendStatusRow1.getText();
					
					String expSuspendStatusR1=excelReader.getCellData(xlSheetName, 1257, 7);
			 		
					excelReader.setCellData(xlfile, xlSheetName, 1257, 8, expSuspendStatusR1.toUpperCase());
					
					System.out.println("Suspend Status in Home Page Value Actual  :  " + actSuspendStatusR1 + " Value Expected : " + expSuspendStatusR1);
					
					
				   if (savingMessage==true && actSuspendStatusR1.equalsIgnoreCase(expSuspendStatusR1) && loading==true)
				   {
					   excelReader.setCellData(xlfile, xlSheetName, 1254, 9, resPass);
			 			
			 			return true;
			 		}
			 		else
			 		{	
			 			excelReader.setCellData(xlfile, xlSheetName, 1254, 9, resFail);
			 			
			 			return false;
			 		}
			      }
		      catch (Exception e) 
			  {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1254, 10, exception);
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
				  return false;
			  }
			   }
		
		
		
		public boolean checkOpeningBalanceNewVoucherClickOnSuspendView() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createViewNameToEditInHomePage));
				createViewNameToEditInHomePage.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			
				boolean actHomePageNewBtnIsDisplayed = newBtn.isDisplayed();
				boolean actHomePageEditBtn           = editBtn.isDisplayed();		
				boolean actHomePagePrintBtn          = printBtn.isDisplayed();
				boolean actHomePageDeleteBtn         = deleteBtn.isDisplayed();
				boolean actHomePageSuspendBtn        = suspendBtn.isDisplayed();
				//boolean actHomePagePrintBarcodeBtn   = printBarCodeBtn.isDisplayed();
				boolean actHomePageExportXMLBtn      = exportToXMLBtn.isDisplayed();
				boolean actHomePageSettingsBtn       = settingsBtn.isDisplayed();
				boolean actHomePageCloseBtn          = homeCloseBtn.isDisplayed();
				boolean actHomePageGridCheckBox      = grid_HeaderChkBox.isDisplayed();
				boolean actHomePageSortingBtn        = sortingBtn.isDisplayed();
				boolean actHomePageCreateViewBn      = createViewBtn.isDisplayed();
				boolean actHomePageCustomizeBtn      = customizeBtn.isDisplayed();
				boolean actHomePageFilterBtn         = filterBtn.isDisplayed();
				boolean actHomePageRefreshBtn        = refreshBtn.isDisplayed();
				boolean actHomePageOptionsBtn        = optionsBtn.isDisplayed();
				boolean actHomePageExportBtn         = exportBtn.isDisplayed();
				
				boolean expHomePageNewBtnIsDisplayed = true;	
				boolean expHomePageEditBtn           = true;
				boolean expHomePagePrintBtn          = true;
				boolean expHomePageDeleteBtn         = true;
				boolean expHomePageSuspendBtn        = true;
				//boolean expHomePagePrintBarcodeBtn   = true;
				boolean expHomePageExportXMLBtn      = true;
				boolean expHomePageSettingsBtn       = true;
				boolean expHomePageCloseBtn          = true;
				boolean expHomePageGridCheckBox      = true;
				boolean expHomePageSortingBtn        = true;
				boolean expHomePageCreateViewBn      = true;
				boolean expHomePageCustomizeBtn      = true;
				boolean expHomePageFilterBtn         = true;
				boolean expHomePageRefreshBtn        = false;
				boolean expHomePageOptionsBtn        = true;
				boolean expHomePageExportBtn         = true;
				
				System.out.println("Home Page New Btn Value Actual           : " + actHomePageNewBtnIsDisplayed+ "  Value Expected : " + expHomePageNewBtnIsDisplayed);
				System.out.println("Home Page Edit Btn Value Actual          : " + actHomePageEditBtn+           "  Value Expected : " + expHomePageEditBtn);
				System.out.println("Home Page Print Btn Value Actual         : " + actHomePagePrintBtn+          "	Value Expected : " + expHomePagePrintBtn);
				System.out.println("Home Page Delete Btn Value Actual        : " + actHomePageDeleteBtn+         "	Value Expected : " + expHomePageDeleteBtn);
				System.out.println("Home Page Suspend Btn Value Actual       : " + actHomePageSuspendBtn+        "	Value Expected : " + expHomePageSuspendBtn);
				//System.out.println("Home Page Print Barcode Btn Value Actual : " + actHomePagePrintBarcodeBtn+   "	Value Expected : " + expHomePagePrintBarcodeBtn);
				System.out.println("Home Page Export XML Btn Value Actual    : " + actHomePageExportXMLBtn+      "	Value Expected : " + expHomePageExportXMLBtn);
				System.out.println("Home Page Settings Btn Value Actual      : " + actHomePageSettingsBtn+       "	Value Expected : " + expHomePageSettingsBtn);
				System.out.println("Home Page Close Btn Value Actual         : " + actHomePageCloseBtn+          "	Value Expected : " + expHomePageCloseBtn);
				System.out.println("Home Page Grid check Value Actual        : " + actHomePageGridCheckBox+      "	Value Expected : " + expHomePageGridCheckBox);
				System.out.println("Home Page Sorting Btn Value Actual       : " + actHomePageSortingBtn+        "	Value Expected : " + expHomePageSortingBtn);
				System.out.println("Home Page Create View Btn Value Actual   : " + actHomePageCreateViewBn+      "	Value Expected : " + expHomePageCreateViewBn);
				System.out.println("Home Page Customize Btn Value Actual     : " + actHomePageCustomizeBtn+      "	Value Expected : " + expHomePageCustomizeBtn);
				System.out.println("Home Page Filter check Value Actual      : " + actHomePageFilterBtn+         "	Value Expected : " + expHomePageFilterBtn);
				System.out.println("Home Page Refesh Btn Value Actual        : " + actHomePageRefreshBtn+        "	Value Expected : " + expHomePageRefreshBtn);
				System.out.println("Home Page Options Btn Value Actual       : " + actHomePageOptionsBtn+        "	Value Expected : " + expHomePageOptionsBtn);
				System.out.println("Home Page Export Btn Value Actual        : " + actHomePageExportBtn+         "  Value Expected : " + expHomePageExportBtn);
				
				int count				                 = openingStocksNewToolBarButtons.size();
				
				ArrayList<String> actbuttons             = new ArrayList<String>();
				
				for (int i = 0; i < count; i++) 
				{
					String data                          = openingStocksNewToolBarButtons.get(i).getText();
					actbuttons.add(data);
				}
				    
				String actopeningStocksNewToolBarButtons = actbuttons.toString();
				String expopeningStocksNewToolBarButtons = excelReader.getCellData(xlSheetName, 1259, 7);
		 		
              excelReader.setCellData(xlfile, xlSheetName, 1259, 8, actopeningStocksNewToolBarButtons); 
			
				System.out.println("actopeningStocksNewToolBarButtons  : " + actopeningStocksNewToolBarButtons);
				System.out.println("expopeningStocksNewToolBarButtons  : " + expopeningStocksNewToolBarButtons);
				
				excelReader.setCellData(xlfile, "Sheet7", 17, 8, actopeningStocksNewToolBarButtons);	
				
				String actsetAsDefaultView		=	setAsDefaultView.getText();
				String expsetAsDefaultView		=	excelReader.getCellData(xlSheetName, 1260, 7);
		 		
              excelReader.setCellData(xlfile, xlSheetName, 1260, 8, actsetAsDefaultView); 
				
				
				//Ribbon Control Icons
		        int count1		= headingOptions.size();
				
				ArrayList<String> headingButtons = new ArrayList<String>();
				
				for (int i = 1; i < count1; i++) 
				{
					String data=headingOptions.get(i).getAttribute("title");
					
					headingButtons.add(data);
				}
				
				String actHeadingButtons = headingButtons.toString();
				String expHeadingButtons = excelReader.getCellData(xlSheetName, 1261, 7);
		 		
              excelReader.setCellData(xlfile, xlSheetName, 1261, 8, actHeadingButtons); 
				
				
				System.out.println("actopeningStocksNewHeadingButtons  : " + actHeadingButtons);
				System.out.println("expopeningStocksNewHeadingButtons  : " + expHeadingButtons);
				
				//Home Page Column Headings
		        int headerTxtCount		= headerTxtList.size();
				
				ArrayList<String> headerTxt = new ArrayList<String>();
				
				for (int i = 2; i < headerTxtCount; i++) 
				{
					String data=headerTxtList.get(i).getText();
					headerTxt.add(data);
				}
				
				String actHeaderTxt = headerTxt.toString();
				String expHeaderTxt = excelReader.getCellData(xlSheetName, 1262, 7);
		 		
              excelReader.setCellData(xlfile, xlSheetName, 1262, 8, actHeaderTxt);
				
				
				System.out.println("actopeningStocksNewHomePageColumnsButtons  : " + actHeaderTxt);
				System.out.println("expopeningStocksNewHomePageColumnsButtons  : " + expHeaderTxt);
				
				
				System.out.println("Count Of Header Columns in Suspend View Home Page Value Actual  :  " + actHeaderTxt + " Value Expected : " + expHeaderTxt);
				
				String actHomePageVoucherNo     = openingStocksNewHomeRow1VoucherNo.getText();
				String actHomePageCreatedBy     = openingStocksNewHomeRow1CreatedBy.getText();
				String actHomePageModifiedBy    = openingStocksNewHomeRow1ModifiedBy.getText();
				String actHomePageSuspendBy     = openingStocksNewHomeRow1SuspendStatus.getText();
				String actHomePageAuthorizedBy  = openingStocksNewHomeRow1AuthorizationStatus.getText();
				
				String expHomePageVoucherNo     = "2";
				String expHomePageCreatedBy     = "SU";
				String expHomePageModifiedBy    = "SU";
				String expHomePageSuspendBy     = "True";
				String expHomePageAuthorizeBy   = "Authorized";
				
				System.out.println("Voucher No in Home Page Value Actual   :  " + actHomePageVoucherNo+    " Value Expected : " + expHomePageVoucherNo);
				System.out.println("Created By in Home Page Value Actual   :  " + actHomePageCreatedBy+    " Value Expected : " + expHomePageCreatedBy);
				System.out.println("Modified By in Home Page Value Actual  :  " + actHomePageModifiedBy+   " Value Expected : " + expHomePageModifiedBy);
				System.out.println("Suspend By in Home Page Value Actual   :  " + actHomePageSuspendBy+    " Value Expected : " + expHomePageSuspendBy);
				System.out.println("Authorize By in Home Page Value Actual :  " + actHomePageAuthorizedBy+ " Value Expected : " + expHomePageAuthorizeBy);
				
				int actRowCountInHomePage = openingStocksNewHomePageTableRowsCount.size();
				int expRowCountInHomePage = 1;
				
				System.out.println("Row Count in Suspend View Home Page Value Actual  :  " + actRowCountInHomePage + " Value Expected : " + expRowCountInHomePage);
										
				if(actHomePageNewBtnIsDisplayed==expHomePageNewBtnIsDisplayed  && actHomePageEditBtn==expHomePageEditBtn && actHomePagePrintBtn==expHomePagePrintBtn
						&& actHomePageDeleteBtn==expHomePageDeleteBtn  && actHomePageSuspendBtn==expHomePageSuspendBtn 
					    /*&& actHomePagePrintBarcodeBtn==expHomePagePrintBarcodeBtn*/ && actHomePageExportXMLBtn==expHomePageExportXMLBtn
						&& actHomePageSettingsBtn==expHomePageSettingsBtn && actHomePageCloseBtn==expHomePageCloseBtn && actHomePageGridCheckBox==expHomePageGridCheckBox
						&& actHomePageSortingBtn==expHomePageSortingBtn && actHomePageCreateViewBn==expHomePageCreateViewBn && actHomePageCustomizeBtn==expHomePageCustomizeBtn
						&& actHomePageFilterBtn==expHomePageFilterBtn && actHomePageRefreshBtn==expHomePageRefreshBtn && actHomePageOptionsBtn==expHomePageOptionsBtn
						&& actHomePageExportBtn==expHomePageExportBtn  
						&& actopeningStocksNewToolBarButtons.equalsIgnoreCase(expopeningStocksNewToolBarButtons)
						&& actHeadingButtons.equalsIgnoreCase(expHeadingButtons)
						&& actHeaderTxt.equalsIgnoreCase(expHeaderTxt))
				{
					System.out.println("Test Pass :Suspended Vouchers  Are Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 1258, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Suspended Vouchers Are NOT Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 1258, 9, resFail);
					return false;
				}
			}
			 catch (Exception e) 
			  {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1258, 10, exception);
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
				  return false;
			  }
			   }
		
		
		@FindBy(xpath="//*[@id='id_rc_columnheadertable']/thead/tr/th")
		private static List<WebElement>  custBodyHeaderList;
		
		@FindBy(xpath="//*[@id='fields_tab']/input")
		private static WebElement  custFieldTab;
		
		@FindBy(xpath="//*[@id='id_rc_search_inputbox']")
		private static WebElement  custSearchTxt;
		
		@FindBy(xpath="//*[@id='id_rc_searchnumeric']/i")
		private static WebElement  custSearchNumericButton;
		
		@FindBy(xpath="//*[@id='id_rc_searchtext']/input")
		private static WebElement  custSearchStringItems;
		
		@FindBy(xpath="//div[contains(text(),'Formatting by Row')]")
		private static WebElement  custFormattingbyRowBtn;
		
		@FindBy(xpath="//div[contains(text(),'Delete layout')]")
		private static WebElement  custDeleteLayoutBtn;
		
		@FindBy(xpath="//div[contains(text(),'Import')]")
		private static WebElement  custImportBtn;
		
		@FindBy(xpath="//div[@class='col-sm-12 toolbar_button_text font-6'][contains(text(),'Export')]")
		private static WebElement  custExportBtn;
		
		@FindBy(xpath="//div[@class='col-sm-12 toolbar_button_text font-6'][contains(text(),'Save')]")
		private static WebElement  custSaveBtn;
		
		@FindBy(xpath="//*[@id='btnCustomizeClose']/div[1]/span")
		private static WebElement  custCancelBtn;
		
		@FindBy(xpath="//input[@id='layoutName']")
		private static WebElement  custLayoutNameTxt;
		
		@FindBy(xpath="//input[@id='chkDefault']")
		private static WebElement  custDefaultChkBox;
		
		@FindBy(xpath="//input[@id='totalWidth']")
		private static WebElement  custTotalWidthTxt;
		
		@FindBy(xpath="//input[@id='chkLandscape']")
		private static WebElement  custLandscapeChkBox;
		
		
		  @FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[1]/a")
		  private static WebElement allVouchersInHomePage;
		
		public boolean checkOpeningBalanceVoucherCustomizationOption() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			try
			{
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(allVouchersInHomePage));
				allVouchersInHomePage.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeBtn));
				customizeBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custFieldTab));
				 boolean actcustFieldTab                   = custFieldTab.isDisplayed();
				 boolean actcustSearchTxt                  = custSearchTxt.isDisplayed();
				 boolean actcustSearchNumericButton        = custSearchNumericButton.isDisplayed();
				 boolean actcustSearchStringItems           = custSearchStringItems.isDisplayed();
				 boolean actcustDeleteLayoutBtn            = custDeleteLayoutBtn.isDisplayed();
				 boolean actcustImportBtn                  = custImportBtn.isDisplayed();
				 boolean actcustSaveBtn                    = custSaveBtn.isDisplayed();
				 boolean actcustCancelBtn                  = custCancelBtn.isDisplayed();
				 boolean actcustLayoutNameTxt              = custLayoutNameTxt.isDisplayed();
				 boolean actcustDefaultChkBox              = custDefaultChkBox.isDisplayed();
				 boolean actcustTotalWidthTxt              = custTotalWidthTxt.isDisplayed();
				 boolean actcustLandscapeChkBox            = custLandscapeChkBox.isDisplayed();
				 
				 boolean  expcustFieldTab                  = true;
				 boolean expcustSearchTxt                  = true;
				 boolean expcustSearchNumericButton        = true;
				 boolean expcustSearchStringItems		   = true;
				 boolean expcustDeleteLayoutBtn            = true;
				 boolean expcustImportBtn				   = true;
				 boolean expcustSaveBtn 				   = true;
				 boolean expcustCancelBtn				   = true;
				 boolean expcustLayoutNameTxt			   = true;
				 boolean expcustDefaultChkBox			   = true;
				 boolean expcustTotalWidthTxt			   = true;
				 boolean expcustLandscapeChkBox			   = true;
				 
				 System.out.println("*************************checkNavigateToOpenigBalanceCustomizeOption*****");
				 
				 System.out.println("custFieldTab              : "+actcustFieldTab            +" "+expcustFieldTab);
				 System.out.println("custSearchTxt             : "+actcustSearchTxt           +" "+expcustSearchTxt);
				 System.out.println("custSearchNumericButton   : "+actcustSearchNumericButton +" "+expcustSearchNumericButton);
				 System.out.println("custSearchStringItems      : "+actcustSearchStringItems    +" "+expcustSearchStringItems);
				 System.out.println("custDeleteLayoutBtn       : "+actcustDeleteLayoutBtn     +" "+expcustDeleteLayoutBtn);
				 System.out.println("custImportBtn             : "+actcustImportBtn           +" "+expcustImportBtn);
				 System.out.println("custSaveBtn               : "+actcustSaveBtn             +" "+expcustSaveBtn);
				 System.out.println("custCancelBtn             : "+actcustCancelBtn           +" "+expcustCancelBtn);
				 System.out.println("custLayoutNameTxt         : "+actcustLayoutNameTxt       +" "+expcustLayoutNameTxt);
				 System.out.println("custDefaultChkBox         : "+actcustDefaultChkBox       +" "+expcustDefaultChkBox);
				 System.out.println("custTotalWidthTxt         : "+actcustTotalWidthTxt       +" "+expcustTotalWidthTxt);
				 System.out.println("custLandscapeChkBox       : "+actcustLandscapeChkBox     +" "+expcustLandscapeChkBox);
				 
				 
			    ArrayList<String>actcustBodyHeaderList=new ArrayList<String>();
					
				int custBodyHeaderListCount=custBodyHeaderList.size();
				
				String actcustBodyHeaderListCount=Integer.toString(custBodyHeaderListCount);
				String expCustBodyHeaderListCount=excelReader.getCellData(xlSheetName, 1264, 7);
		 		
              excelReader.setCellData(xlfile, xlSheetName, 1264, 8, actcustBodyHeaderListCount); 
				
				
			
					
				System.out.println(" custBodyHeaderListCount  :  "+actcustBodyHeaderListCount);
					
				for (int i = 0; i < custBodyHeaderListCount; i++)
				{
					String data=custBodyHeaderList.get(i).getText();
					actcustBodyHeaderList.add(data);
				}
					
				String actcustBodyHeader=actcustBodyHeaderList.toString();
				String expcustBodyHeader=excelReader.getCellData(xlSheetName, 1265, 7);
		 		
              excelReader.setCellData(xlfile, xlSheetName, 1265, 8, actcustBodyHeader); 
					
				System.err.println("  Actual custBodyHeaderList : "+actcustBodyHeader);
				System.err.println("  Expected  custBodyHeaderList : "+expcustBodyHeader);
					
				 
				if (actcustFieldTab==expcustFieldTab && actcustSearchTxt==expcustSearchTxt && 
						 actcustSearchNumericButton==expcustSearchNumericButton && actcustSearchStringItems==expcustSearchStringItems && 
						 actcustDeleteLayoutBtn==expcustDeleteLayoutBtn && 
						 actcustImportBtn==expcustImportBtn && actcustSaveBtn==expcustSaveBtn && actcustCancelBtn==expcustCancelBtn&& 
						 actcustLayoutNameTxt==expcustLayoutNameTxt && actcustDefaultChkBox==expcustDefaultChkBox && 
						 actcustTotalWidthTxt==expcustTotalWidthTxt &&actcustLandscapeChkBox==expcustLandscapeChkBox && 
						 actcustBodyHeader.equalsIgnoreCase(expcustBodyHeader)&& actcustBodyHeaderListCount.equalsIgnoreCase(expCustBodyHeaderListCount)) 
				 {
					excelReader.setCellData(xlfile, xlSheetName, 1263, 9, resPass);
					 return true;
				 }
				else
		 		{	
		 			excelReader.setCellData(xlfile, xlSheetName, 1263, 9, resFail);
		 			
		 			return false;
		 		}
		      }
	      catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1263, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
		   }
		
		 @FindBy(xpath="//*[@id='id_rc_complete_tree_container']/div/ul/li")
		 private static List<WebElement>  custLeftPannelList;
		
		
		 public boolean checkOpeningBalanceCustomizeLeftPannelElementsDisplayed() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
			 
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			 
			 try
			 {
			 
			 
	            ArrayList<String>actcustLeftPannelList=new ArrayList<String>();
				
				int CustLeftPannelListCount=custLeftPannelList.size();
				
				String actCustLeftPannelListCount=Integer.toString(CustLeftPannelListCount);
				String expCustBodyHeaderListCount=excelReader.getCellData(xlSheetName, 1267, 7);
		 		
              excelReader.setCellData(xlfile, xlSheetName, 1267, 8, actCustLeftPannelListCount); 
				
				System.out.println(" custLeftPannelListCount  :  "+actCustLeftPannelListCount);
				
				for (int i = 0; i < CustLeftPannelListCount; i++)
				{
					String data=custLeftPannelList.get(i).getText();
					actcustLeftPannelList.add(data);
				}
				
				String actcustLeftPannel =  actcustLeftPannelList.toString();
				String expcustLeftPannel = excelReader.getCellData(xlSheetName, 1268, 7);
		 		
              excelReader.setCellData(xlfile, xlSheetName, 1268, 8, actcustLeftPannel); 
				
				System.out.println("*******************checkOpeningBalanceCustomizeLeftPannelElementsDisplayed****************************");
				
				System.err.println("  Actual custLeftPannelList    : "+actcustLeftPannel);
				System.err.println("  Expected  custLeftPannelList : "+expcustLeftPannel);
				
				
				if (actcustLeftPannel.equalsIgnoreCase(expcustLeftPannel) && 
						actCustLeftPannelListCount.equalsIgnoreCase(expCustBodyHeaderListCount))
				{
                  excelReader.setCellData(xlfile, xlSheetName, 1266, 9, resPass);
		 			
		 			return true;
		 		}
		 		else
		 		{	
		 			excelReader.setCellData(xlfile, xlSheetName, 1266, 9, resFail);
		 			
		 			return false;
		 		}
		      }
	      catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1266, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
			}
   
   
		 
		 @FindBy(xpath="//*[@id='id_Default_spanPlus']")
		 private static WebElement  custLeftPannelDefaultExpandBtn;
		 
		 @FindBy(xpath="//*[@id='id_prog_spanPlus']")
		 private static WebElement  custLeftPannelProgExpandBtn;
			
		 @FindBy(xpath="//*[@id='id_Trans_spanPlus']")
		 private static WebElement  custLeftPannelTransExpandBtn;
			
		 @FindBy(xpath="//*[@id='id_rc_complete_tree_container']/div[1]/ul/li/ul/li/ul/li/span")
		 private static List<WebElement>  custLeftPannelInnerFieldList;
		
		 @FindBy(xpath="//*[@id='ReportSpecific']/li")
		 private static List<WebElement>  custLeftPannelDefaultFieldInnerFieldList;	
		 
		
		 @FindBy(xpath="//*[@id='ProgFileds']/li")
		 private static List<WebElement>  custLeftPannelProgFiledsInnerFieldList;	
		 
		
		 
		 
		 
		public boolean checkCustomizeLeftPannelInnerFieldsInOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			
				ArrayList<String>custLeftPannelTransInnerFieldList=new ArrayList<String>();
				
				ArrayList<String>custLeftPannelDefaultInnerFieldList=new ArrayList<String>();
				
				ArrayList<String>custLeftPannelProgInnerFieldList=new ArrayList<String>();
				
					
				int actCustLeftPannelListCount=custLeftPannelList.size();
				int expCustLeftPannelListCount=3;
					
				System.out.println("********************************checkCustomizeLeftPannelInnerFieldsInOpeningBalance*****************************");
				
				System.out.println(" custLeftPannelListCount  :  "+actCustLeftPannelListCount);
				
					
				for (int i = 0; i < actCustLeftPannelListCount; i++)
				{
					String data=custLeftPannelList.get(i).getText();
						
					System.err.println("Left Pannel Fileds : "+data);
						
					if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 1270, 6))) 
					{
						custLeftPannelTransExpandBtn.click();
							
						int actcustLeftPannelInnerFieldListCount=custLeftPannelInnerFieldList.size();
						int expcustLeftPannelInnerFieldListCount=2;
						
							
						System.out.println("Transactions Inner Fields Count :  "+actcustLeftPannelInnerFieldListCount+" "+expcustLeftPannelInnerFieldListCount);
							
						for (int j = 0; j < actcustLeftPannelInnerFieldListCount; j++) 
						{
							String InnerFields=custLeftPannelInnerFieldList.get(j).getText();
								
							System.out.println("Transaction InnerFields "+InnerFields);
								
							custLeftPannelTransInnerFieldList.add(InnerFields);
						}
					}
						
					if (data.contains("Default Fields")) 
					{
						custLeftPannelDefaultExpandBtn.click();
						
						int actcustLeftPannelDefaultFieldInnerFieldList=custLeftPannelDefaultFieldInnerFieldList.size();
						int expcustLeftPannelDefaultFieldInnerFieldList=11;
							
						System.out.println("DefaultFields Inner Fields Count :  "+actcustLeftPannelDefaultFieldInnerFieldList+" "+expcustLeftPannelDefaultFieldInnerFieldList);
						
						for (int k = 0; k < actcustLeftPannelDefaultFieldInnerFieldList; k++) 
						{
							String InnerFields=custLeftPannelDefaultFieldInnerFieldList.get(k).getText();
								
							System.out.println("DefaultFields InnerFields "+InnerFields);
								
							custLeftPannelDefaultInnerFieldList.add(InnerFields);
						}
					}
						
					if (data.contains("Programmable Field")) 
					{
						custLeftPannelProgExpandBtn.click();
							
						int actcustLeftPannelProgFiledsInnerFieldList=custLeftPannelProgFiledsInnerFieldList.size();
						int expcustLeftPannelProgFiledsInnerFieldList=1;
									
						System.out.println("Programmable Field Inner Fields Count :  "+actcustLeftPannelProgFiledsInnerFieldList+" "+expcustLeftPannelProgFiledsInnerFieldList);
							
						for (int m = 0; m < actcustLeftPannelProgFiledsInnerFieldList; m++) 
						{
							String InnerFields=custLeftPannelProgFiledsInnerFieldList.get(m).getText();
								
							System.out.println("Programmable Field InnerFields "+InnerFields);
								
							custLeftPannelProgInnerFieldList.add(InnerFields);
								
						}
						
					}
				}
					
				System.err.println("custLeftPannelTransInnerFieldList :"+custLeftPannelTransInnerFieldList);
				System.err.println("custLeftPannelDefaultInnerFieldList :"+custLeftPannelDefaultInnerFieldList);
				System.err.println("custLeftPannelProgInnerFieldList :"+custLeftPannelProgInnerFieldList);
					
				String actcustLeftPannelTransInnerFieldList=custLeftPannelTransInnerFieldList.toString();
				String actcustLeftPannelDefaultInnerFieldList=custLeftPannelDefaultInnerFieldList.toString();
				String actcustLeftPannelProgInnerFieldList=custLeftPannelProgInnerFieldList.toString();
					
				excelReader.setCellData(xlfile, xlSheetName, 1270, 8, actcustLeftPannelTransInnerFieldList);
				excelReader.setCellData(xlfile, xlSheetName, 1271, 8, actcustLeftPannelDefaultInnerFieldList);
				excelReader.setCellData(xlfile, xlSheetName, 1272, 8, actcustLeftPannelProgInnerFieldList);
				
				
				String expcustLeftPannelTransInnerFieldList=excelReader.getCellData(xlSheetName, 1270, 7);
				String expcustLeftPannelDefaultInnerFieldList=excelReader.getCellData(xlSheetName, 1271, 7);
				String expcustLeftPannelProgInnerFieldList=excelReader.getCellData(xlSheetName, 1272, 7);
					
				if (actcustLeftPannelTransInnerFieldList.equalsIgnoreCase(expcustLeftPannelTransInnerFieldList) && 
						actcustLeftPannelDefaultInnerFieldList.equalsIgnoreCase(expcustLeftPannelDefaultInnerFieldList) && 
						actcustLeftPannelProgInnerFieldList.equalsIgnoreCase(expcustLeftPannelProgInnerFieldList) && 
						actCustLeftPannelListCount==expCustLeftPannelListCount ) 
				{
					
                    excelReader.setCellData(xlfile, xlSheetName, 1269, 9, resPass);
		 			
		 			return true;
		 		}
		 		else
		 		{	
		 			excelReader.setCellData(xlfile, xlSheetName, 1269, 9, resFail);
		 			
		 			return false;
		 		}
		      }
	      catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1269, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
		   }
			
			
		
		 @FindBy(xpath="//*[@id='id_rc_columnheadertable']/thead/tr/th[4]")
		 private static WebElement  modifiedHeaderTab;
		
		 @FindBy(xpath="//*[@id='id_rc_columnheadertable']/thead/tr/th[13]")
		 private static WebElement  warehouseCodeHeaderTxt;
		 
		 
		 @FindBy(xpath="//input[@id='HidethisColumn']")
		 private static WebElement  hideThisColumnChkbox;	
		 
		 @FindBy(xpath="//*[@id='tblHeadTransRender']/tr/th")
		 private static List<WebElement>  homePageBodyHeaderList;	
		 
		
		
	 public boolean checkHidingFieldCustomization() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			  
		  try
			  {
			
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custCancelBtn));
				custCancelBtn.click();
				
				
				Thread.sleep(2000);
				
				int homePageBodyHeaderListCountBeforeHide=homePageBodyHeaderList.size();
				
				String acthomePageBodyHeaderListCountBeforeHide=Integer.toString(homePageBodyHeaderListCountBeforeHide);
				String exphomePageBodyHeaderListCountBeforeHide=excelReader.getCellData(xlSheetName, 1274, 7);
		 		
                excelReader.setCellData(xlfile, xlSheetName, 1274, 8, acthomePageBodyHeaderListCountBeforeHide);
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeBtn));
				customizeBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(modifiedHeaderTab));
				modifiedHeaderTab.click();
						
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(hideThisColumnChkbox));
				hideThisColumnChkbox.click();
						
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(hideThisColumnChkbox));
				boolean  actHideThisColumnChkbox=hideThisColumnChkbox.isSelected();
				boolean  expHideThisColumnChkbox=true;
				
				String actClickOnChkbox=Boolean.toString(actHideThisColumnChkbox);
				String expClickOnChkbox=excelReader.getCellData(xlSheetName, 1275, 7);
		 		
                excelReader.setCellData(xlfile, xlSheetName, 1275, 8, actClickOnChkbox.toUpperCase());
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
				custSaveBtn.click();
				
				String expMessage  = excelReader.getCellData(xlSheetName, 1276, 7);
				String actSaveMessage = checkValidationMessage(expMessage);
				
				excelReader.setCellData(xlfile, xlSheetName, 1276, 8, actSaveMessage);
				
				
				Thread.sleep(2000);
				
				int homePageBodyHeaderListCountAfterHiding=homePageBodyHeaderList.size();
				
				String acthomePageBodyHeaderListCountAfterHiding=Integer.toString(homePageBodyHeaderListCountAfterHiding);
				String exphomePageBodyHeaderListCountAfterHiding=excelReader.getCellData(xlSheetName, 1277, 7);
		 		
                excelReader.setCellData(xlfile, xlSheetName, 1277, 8, acthomePageBodyHeaderListCountAfterHiding);
				
				System.out.println("*****************************************checkHidingFieldCustomization************************************");
				
				System.out.println(" homePageBodyHeaderListCountBeforeHide :  "+acthomePageBodyHeaderListCountBeforeHide+" Value Expected : "+exphomePageBodyHeaderListCountBeforeHide);
				System.out.println(" homePageBodyHeaderListCountAfterHide  :  "+acthomePageBodyHeaderListCountAfterHiding+" Value Expected : "+exphomePageBodyHeaderListCountAfterHiding);
				System.out.println(" Save Message                          :  "+actSaveMessage                           +" Value Expected : "+expMessage);
				
				if (acthomePageBodyHeaderListCountBeforeHide.equalsIgnoreCase(exphomePageBodyHeaderListCountBeforeHide) && 
						acthomePageBodyHeaderListCountAfterHiding.equalsIgnoreCase(exphomePageBodyHeaderListCountAfterHiding) && 
						actSaveMessage.equalsIgnoreCase(expMessage))
				{
					
					System.out.println(" Test Pass :  Hiding column " );
					excelReader.setCellData(xlfile, xlSheetName, 1273, 9, resPass);
					return true;
				}
				else
				{
					excelReader.setCellData(xlfile, xlSheetName, 1273, 9, resFail);
	                return false;
				}
			  }
	      
		      catch (Exception e) 
			  {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1273, 10, exception);
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
				  return false;
			  }
		   }
			
			
			 @FindBy(xpath="//span[contains(text(),'Extra Fields')]")
			 private static WebElement  custTransExtraFieldExpandBtn;
			
			 @FindBy(xpath="//li[@id='rd_customization_tree3258']//span[contains(text(),'Warehouse')]")
			 private static WebElement  warehouseExpandBtn;
			
		
			 
			 @FindBy(xpath="//*[@id='rd_customization_tree3259']")
			 private static WebElement  warehouseName;
			
			 @FindBy(xpath="//li[@id='rd_customization_tree3260']")
			 private static WebElement  warehouseCode;
			
			 @FindBy(xpath="//input[@id='ColumnHeading']")
			 private static WebElement  columnHeadingTxt;
			
			 
			 @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/div[1]/ul/li/ul/li/ul/li[2]/ul/li[1]/span/span")
			 private static WebElement  cusDepartmentExpandBtn;
			 
			  @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/div[1]/ul/li/ul/li/ul/li[2]/ul/li[1]/ul/li[1]")
			 private static WebElement  cusDepName;
			 
			 @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/div[1]/ul/li/ul/li/ul/li[2]/ul/li[1]/ul/li[2]")
			 private static WebElement  cusDepCode;
			 
			/* @FindBy(xpath="//li[@id='rd_customization_tree104']//span[contains(text(),'Department')]")
			 private static WebElement  cusDepartmentExpandBtn;
					 
			 @FindBy(xpath="//li[@id='rd_customization_tree105']")
			 private static WebElement  cusDepName;
			 
			 @FindBy(xpath="//li[@id='rd_customization_tree106']")
			 private static WebElement  cusDepCode;*/
			 
			 @FindBy(xpath="//*[@id='id_rc_columnheadertable']/thead/tr[1]/th/div/p")
			 private static List<WebElement> cusGridHeaderList;
			 
			
			public boolean checkAddingExtraFieldInCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
		        try
		        {
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeBtn));
				customizeBtn.click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custLeftPannelTransExpandBtn));
				custLeftPannelTransExpandBtn.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custTransExtraFieldExpandBtn));
				custTransExtraFieldExpandBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusDepartmentExpandBtn));
				cusDepartmentExpandBtn.click();
				
				Thread.sleep(4000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusDepName));
				
				getAction().doubleClick(cusDepName).build().perform();
				
				int cusGridHeaderListCount = cusGridHeaderList.size();
				
				for(int i=1;i<cusGridHeaderListCount;i++)
				{
					String data = cusGridHeaderList.get(i).getText();
					
					if(data.equalsIgnoreCase("Department Name"))
					{
						cusGridHeaderList.get(i).click();
					}
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(columnHeadingTxt));
				String actcolumnHeadingNameTxt=columnHeadingTxt.getAttribute("value");
				String expcolumnHeadingNameTxt=excelReader.getCellData(xlSheetName, 1279, 7);
		 		
               excelReader.setCellData(xlfile, xlSheetName, 1279, 8, actcolumnHeadingNameTxt);
					
				getAction().doubleClick(cusDepCode).build().perform();
				
				int cusGridHeaderListCount2 = cusGridHeaderList.size();
				
				for(int i=1;i<cusGridHeaderListCount2;i++)
				{
					String data = cusGridHeaderList.get(i).getText();
					
					if(data.equalsIgnoreCase("Department Code"))
					{
						cusGridHeaderList.get(i).click();
					}
				}
				
				Thread.sleep(2000);
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(columnHeadingTxt));
				String actcolumnHeadingCodeTxt=columnHeadingTxt.getAttribute("value");
				String expcolumnHeadingCodeTxt=excelReader.getCellData(xlSheetName, 1280, 7);
		 		
	            excelReader.setCellData(xlfile, xlSheetName, 1280, 8, actcolumnHeadingCodeTxt);
					
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
				custSaveBtn.click();
				
				String expMessage = excelReader.getCellData(xlSheetName, 1281, 7);
				String actSaveMessage = checkValidationMessage(expMessage);
				
				excelReader.setCellData(xlfile, xlSheetName, 1281, 8, actSaveMessage);
				Thread.sleep(2000);
				
				int homePageBodyHeaderListCount=homePageBodyHeaderList.size();
				
				String acthomePageBodyHeaderListCount=Integer.toString(homePageBodyHeaderListCount);
				String exphomePageBodyHeaderListCount=excelReader.getCellData(xlSheetName, 1282, 7);
		 		
	            excelReader.setCellData(xlfile, xlSheetName, 1282, 8, acthomePageBodyHeaderListCount);
				
				
				System.out.println("***********************************checkAddingExtraFieldInCustomization********************************");
				
				System.out.println(" homePageBodyHeaderListCountAfterHide  :  "+acthomePageBodyHeaderListCount+" Value Expected : "+exphomePageBodyHeaderListCount);
				System.out.println(" ColumnHeadingTxt                      :  "+actcolumnHeadingNameTxt       +" Value Expected : "+expcolumnHeadingNameTxt);
				System.out.println(" ColumnHeadingTxt                      :  "+actcolumnHeadingCodeTxt       +" Value Expected : "+expcolumnHeadingCodeTxt);
				System.out.println(" Save Message                          :  "+actSaveMessage                +" Value Expected : "+expMessage);
				
				if (actcolumnHeadingNameTxt.equalsIgnoreCase(expcolumnHeadingNameTxt) && actcolumnHeadingCodeTxt.equalsIgnoreCase(expcolumnHeadingCodeTxt) && 
						actSaveMessage.equalsIgnoreCase(expMessage) && acthomePageBodyHeaderListCount.equalsIgnoreCase(exphomePageBodyHeaderListCount)) 
				{
					System.out.println(" Test Pass:  Extra Filed Added Successfully ");
				    excelReader.setCellData(xlfile, xlSheetName, 1278, 9, resPass);
					return true;
					
				}
				else 
				{
					System.out.println(" Test Pass:  Extra Filed Not Added Successfully ");
					excelReader.setCellData(xlfile, xlSheetName, 1278, 9, resFail);
	                 return false;
				}
		        }
		        catch (Exception e)
		        {
		        	String exception=e.getMessage();
		        	excelReader.setExceptionInExcel(xlfile, xlSheetName, 1278, 10, exception);
		        	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		        	return false;
		        }
				
			}
			
			 @FindBy(xpath="//a[contains(text(),'Remove Column')]")
			 private static WebElement  custExtraFieldRemoveBtn;
			
			
			
			public boolean checkDeleteExtraFieldFromHomePageBodyHeader() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
	            try
	            {
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeBtn));
				customizeBtn.click();
				
		        ArrayList<String>actcustBodyHeaderList=new ArrayList<String>();
				
				int actcustBodyHeaderListCount=custBodyHeaderList.size();
				
				
				for (int i = 0; i < actcustBodyHeaderListCount; i++)
				{
					String data=custBodyHeaderList.get(i).getText();
					
					if (data.contains(excelReader.getCellData(xlSheetName, 1284, 6))) 
					{
						custBodyHeaderList.get(i).click();
						
					}
				}
			
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custExtraFieldRemoveBtn));
				custExtraFieldRemoveBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
				custSaveBtn.click();
				
				String expMessage = excelReader.getCellData(xlSheetName, 1285, 7);
				String  actSaveMessage = checkValidationMessage(expMessage);
				
				excelReader.setCellData(xlfile, xlSheetName, 1285, 8, actSaveMessage);
				
				
				Thread.sleep(2000);
				
				int homePageBodyHeaderListCount=homePageBodyHeaderList.size();
				
				String acthomePageBodyHeaderListCount=Integer.toString(homePageBodyHeaderListCount);
				String exphomePageBodyHeaderListCount=excelReader.getCellData(xlSheetName, 1286, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 1286, 8, acthomePageBodyHeaderListCount);
				
				
		        System.out.println("*********************************checkDeleteExtraFieldFromHomePageBodyHeader***********************");
				System.out.println(" HomePageBodyHeaderList       :  "+acthomePageBodyHeaderListCount +" Value Expected : "+exphomePageBodyHeaderListCount);
				System.out.println(" Save Message                 :  "+actSaveMessage                 +" Value Expected : "+expMessage);
				
				if (actSaveMessage.equalsIgnoreCase(expMessage) && acthomePageBodyHeaderListCount.equalsIgnoreCase(exphomePageBodyHeaderListCount)) 
				{
					
					System.out.println(" Test Pass:    Extra Field Removed Successfully" );
					excelReader.setCellData(xlfile, xlSheetName, 1283, 9, resPass);
					return true;
				}
				else 
				{
					System.out.println(" Test Fail:    Extra Field Removed Successfully");
					excelReader.setCellData(xlfile, xlSheetName, 1283, 9, resFail);
					return false;
				}
	            }
	            catch (Exception e) 
	  		   {
	  			  String exception =e.getMessage();
	  			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 1283, 10, exception);
	  			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	  			  return false;

	  		   }
			}
   
   
   
			
			
	
			
			
		
			
			
			
			public boolean checkOpeningBalanceVoucherCloseButtonInHomePage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherhomeCloseBtn));
					voucherhomeCloseBtn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
					String actUserInfo = userNameDisplay.getText();
					String expUserInfo = excelReader.getCellData(xlSheetName, 453, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 453, 8, actUserInfo);
					
					System.out.println("User Name Display Value Actual                   : " + actUserInfo +             " Value Expected : " + expUserInfo);
		
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
					companyLogo.click();
					
			        //Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
					String actGetLoginCompanyNameInformation = companyName.getText();
					String actGetLoginCompanyName            = actGetLoginCompanyNameInformation.substring(0, 19);
					String expGetLoginCompanyName            = excelReader.getCellData(xlSheetName, 454, 7);
					companyLogo.click();
					
					excelReader.setCellData(xlfile, xlSheetName, 454, 8, actGetLoginCompanyName);
					
					System.out.println("Company Name Display Value Actual                : " + actGetLoginCompanyName +  " Value Expected : " + expGetLoginCompanyName);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
					
					boolean actlabelDashboard=labelDashboard.isDisplayed();
					boolean actselectDashboard=selectDashboard.isDisplayed();
					boolean actnewAddDashBoard=newAddDashBoard.isDisplayed();
					boolean actdashboardCustomizationSettings=dashboardCustomizationSettings.isDisplayed();
					
					boolean explabelDashboard=true;
					boolean expselectDashboard=true;
					boolean expnewAddDashBoard=true;
					boolean expdashboardCustomizationSettings=true;
					
					System.out.println("labelDashboard  : "+actlabelDashboard+" "+explabelDashboard);
					System.out.println("selectDashboard  : "+actselectDashboard+" "+expselectDashboard);
					System.out.println("newAddDashBoard  : "+actnewAddDashBoard+" "+expnewAddDashBoard);
					System.out.println("dashboardCustomizationSettings  : "+actdashboardCustomizationSettings+" "+expdashboardCustomizationSettings);
					
					boolean actMethod = actlabelDashboard==explabelDashboard && actselectDashboard==expselectDashboard && actnewAddDashBoard==expnewAddDashBoard
										&& actdashboardCustomizationSettings==expdashboardCustomizationSettings;
					
					String actResult = Boolean.toString(actMethod);
					
					excelReader.setCellData(xlfile, xlSheetName, 452, 8, actResult.toUpperCase());
					
					if(actUserInfo.equalsIgnoreCase(expUserInfo) && actGetLoginCompanyName.equalsIgnoreCase(expGetLoginCompanyName) && actMethod==true)
					{
						System.out.println("test pass : Document History Pop Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 452, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("test Fail : Document History Pop NOT Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 452, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 452, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			}
			

			
		  
  public SmokeVPage(WebDriver driver)
  {
    PageFactory.initElements(driver, this);	
  }
		
	
}
