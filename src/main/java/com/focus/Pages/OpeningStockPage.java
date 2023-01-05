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

public class OpeningStockPage extends BaseEngine
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

		@FindBy(xpath="//input[@id='id_body_24']")
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
		
		@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[2]/div[1]/div/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]/div/table/tbody/tr[1]/td[14]/input")
		private static WebElement  enter_Discount;
		
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
			
			@FindBy (xpath="//button[contains(text(),'Search')]")
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
			
			
			/*@FindBy(xpath="//tfoot[@id='id_transaction_bins_grid_foot']//td[13]")
			private static WebElement  binSumInward;*/
			
			
			
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
			
			/*@FindBy (xpath="//div[@id='img_add']/span")
			private static WebElement rmaAddBtn;*/
			
			@FindBy (xpath="//div[@id='img_add']//span")
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
		
		@FindBy(xpath="//*[@id='3001']/span")
		private static WebElement  productionTransactionsMenu; 

			@FindBy(xpath="//*[@id='206']/span")
			private static WebElement  billofMaterial; 
		
			@FindBy(xpath="//*[@id='2040']/span")
			private static WebElement  issuestoProduction; 
			
			@FindBy(xpath="//*[@id='2047']/span")
			private static WebElement  jobOrder; 
		
		//Point Of Sale Menu
		@FindBy (xpath="//div[contains(text(),'Point of Sale')]")
		private static WebElement pointOfSaleMenu;
		
		//Quality Of Control Menu
		@FindBy (xpath="//span[@class='icon-quotationanalysis icon-font1']")
		private static WebElement qualityControlMenu;
		
		//Settings Menu
		@FindBy (xpath="//span[@class='icon-settings icon-font1']")
		private static WebElement SettingsMenu;

		private static String xlfile;
		private static String resPass="Pass";
		private static String resFail="Fail";
		private static ExcelReader excelReader;
		
		private static String xlSheetName = "SmokeVouchers";
		
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
		
		// Login Page
		@FindBy(xpath = "//*[@id='txtUsername']")
		private static WebElement username;
		
		private static boolean Status;
		
		@FindBy(id="ddlCompany")
		private static WebElement companyDropDownList;
		 
		private static int cSize; 
		
		
	    @FindBy(xpath="//table[@id='id_rc_columnheadertable']/thead/tr/th/div/p")
		private static List<WebElement>  custBodyHeaderList;
	    
	    @FindBy(xpath="//*[@id='plnCustomizecolumn']/div/span[4]/a")
		private static WebElement  custRemoveBtn;
	    
	    @FindBy(xpath="//div[@class='col-sm-12 toolbar_button_text font-6'][contains(text(),'Save')]")
		private static WebElement  custSaveBtn;
		
		@FindBy(xpath="//*[@id='btnCustomizeClose']/div[1]/span")
		private static WebElement  custCancelBtn;
		
		public static void checkDeleteLinkStatus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeBtn));
			customizeBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(custSaveBtn));
			
			int custBodyHeaderListCount = custBodyHeaderList.size();
			
			for (int i = 0; i < custBodyHeaderListCount; i++)
			{
				String data = custBodyHeaderList.get(i).getText();
				
				System.out.println(i+" "+data);
				
				/*int temp=i+1;
				
				JavascriptExecutor js = (JavascriptExecutor) getDriver();
				js.executeScript("arguments[0].scrollIntoView();",custBodyHeaderList.get(temp));*/
				
				if (data.equalsIgnoreCase("Link status")) 
				{
					custBodyHeaderList.get(i).click();
					
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custRemoveBtn));
					custRemoveBtn.click();
					
					Thread.sleep(1000);
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custSaveBtn));
			custSaveBtn.click();
			
			String expMessage  = "Data saved successfully";
			String actSaveMessage = checkValidationMessage(expMessage);
		}
		
	    public boolean checkSignInToCheckOpeningStocksVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	    {
		  excelReader = new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		   
		  try
		  {  
			  
			  getDriver().navigate().refresh();
		 		 Thread.sleep(1999);
		 		 
		 		 getDriver().navigate().refresh();
		 		 Thread.sleep(1999);
		 		 
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		    	 
				LoginPage lp                          = new LoginPage(getDriver());
		      
		        String unamelt                        = excelReader.getCellData(xlSheetName, 7, 6);
		        String pawslt                         = excelReader.getCellData(xlSheetName, 8, 6);
				
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
				
				for (int j = 0; j < actCount; j++) 
				{
					String data                          = menusList.get(j).getText();
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
		        System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
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
				String expinventoryTransactionsStocksMenusList = "[Shortages in Stock, Excesses in Stocks, Stock Transfers, Opening Stocks, Material Requisition, Excesses in Stocks New]";
				
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
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocksVoucher));
				openingStocksVoucher.click();
				
				Thread.sleep(2000);
				checkDeleteLinkStatus();
				Thread.sleep(2000);
	
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
			

		   public boolean checkOpeningStocksNewVoucherDocumentNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		   {
			  excelReader=new ExcelReader(POJOUtility.getExcelPath());
			  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			  try
			  {
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				documentNumberTxt.click();
				
				String actEntryPageGetDocumentNumberValue  = documentNumberTxt.getAttribute("value");
				String expEntryPageGetDocumentNumberValue  = excelReader.getCellData(xlSheetName, 53, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 53, 8, actEntryPageGetDocumentNumberValue);

				System.out.println("Document Number Value Actual  : " + actEntryPageGetDocumentNumberValue + "   Value Expected : " + expEntryPageGetDocumentNumberValue);
			
				if(actEntryPageGetDocumentNumberValue.equalsIgnoreCase(expEntryPageGetDocumentNumberValue))
				{
					System.out.println("Test Pass : Document No is 1");
					excelReader.setCellData(xlfile, xlSheetName, 52, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : entry Page NOT Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 52, 9, resFail);
					return false;
				}
			  }
			  catch (Exception e) 
			  {
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 52, 10, e.getMessage());
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  return false;
			  }
		   }
			
			
			
		  public boolean checkOpeningStocksNewVoucherDateIsDisable() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  { 
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt_CalenderBtn));
				dateTxt_CalenderBtn.click();
					
				boolean actEntryPageGetDatePickerValue  = calender_TodayBtn.isDisplayed();

				boolean expEntryPageGetDatePickerValue  = true;
				
				boolean actMethod = actEntryPageGetDatePickerValue==expEntryPageGetDatePickerValue;

				String actResult = Boolean.toString(actMethod);

				excelReader.setCellData(xlfile, xlSheetName, 54, 8, actResult.toUpperCase());

				System.out.println("Entry Page Date Calender Value Actual  : " + actEntryPageGetDatePickerValue + "  Value Expected : " + expEntryPageGetDatePickerValue);
					
				Thread.sleep(3000);
				
				if(actMethod==true)
				{
					System.out.println("Test Pass : Calender Opened");
					excelReader.setCellData(xlfile, xlSheetName, 54, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Pass : Date is 08/26/2019");
					excelReader.setCellData(xlfile, xlSheetName, 54, 9, resFail);
					return false;
				}
			
			}
			catch (Exception e) 
			{
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 54, 10, e.getMessage());
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  return false;
			}	
		  }
			
			
			
		  public boolean checkOpeningStocksNewSaveWithoutMandatoryFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		     try
		     {	
		    	 
		    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
		 		wareHouseTxt.click();
		    	 
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
				
				String actGetWarehouseValidationMessage    = errorMessage.getText();
				String expGetWarehouseValidationMessageOne = excelReader.getCellData(xlSheetName, 56, 7);
				String expGetWarehouseValidationMessageTwo = excelReader.getCellData(xlSheetName, 57, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 56, 8, actGetWarehouseValidationMessage);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();
				
				System.out.println("Entry Page voucher Mandatory Validation Value Actual  : " + actGetWarehouseValidationMessage + "  Value Expected : " + expGetWarehouseValidationMessageOne+expGetWarehouseValidationMessageTwo);
				
				if(actGetWarehouseValidationMessage.startsWith(expGetWarehouseValidationMessageOne) && actGetWarehouseValidationMessage.endsWith(expGetWarehouseValidationMessageTwo))
				{
					excelReader.setCellData(xlfile, xlSheetName, 55, 9, resPass);
					return true;
				}
				else
				{	
					excelReader.setCellData(xlfile, xlSheetName, 55, 9, resFail);
					return false;
				}
		     }
		     catch (Exception e) 
		     {
		    	 excelReader.setExceptionInExcel(xlfile, xlSheetName, 55, 10, e.getMessage());
		    	 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		    	 return false;
		     }	
		  }
		  
		  
			
		  @FindBy(xpath="//tbody[@id='id_header_268435460_table_body']/tr/td[2]")
		  private static List<WebElement> wareHouseListCount;
			
			
		  public boolean checkOpeningStocksNewWareHouseOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
				wareHouseTxt.click();
				
				wareHouseTxt.sendKeys(Keys.SPACE);
				
				int wareHouseListCountCount = wareHouseListCount.size();
				
				ArrayList<String> wareHouseListCountArray = new ArrayList<String>();
				
				for(int i=0;i<wareHouseListCountCount;i++)
				{
					String data=wareHouseListCount.get(i).getText();
					wareHouseListCountArray.add(data);
				}
					
				String actwareHouseListCount=wareHouseListCountArray.toString();
				
				String expwareHouseListCount ="[HYDERABAD, MUMBAI, SECUNDERABAD, WH1]";
				
				excelReader.setCellData(xlfile, xlSheetName, 59, 8, actwareHouseListCount);
				
				System.out.println("wareHouseListCount Actual   : " + actwareHouseListCount);
				System.out.println("wareHouseListCount Expected : " + expwareHouseListCount);
				
				
			    if(actwareHouseListCount.equalsIgnoreCase(expwareHouseListCount))
				{
					System.out.println("Test Pass : Error Message Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 58, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Pass : Date is 08/26/2019");
					excelReader.setCellData(xlfile, xlSheetName, 58, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 58, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
		  public boolean checkOpeningStocksNewWarehouseCustomize() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {		
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_SettingsBtn));
				wareHouse_SettingsBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_Container));
				
				boolean actEntryPageWarehouseCMBSettings               = wareHouse_Settings_Container.isDisplayed();
				boolean actEntryPageWarehouseCMBSettingsStandardField  = wareHouse_Settings_StandardFieldsBtn.isDisplayed();
				boolean actEntryPageWarehouseCMBSettingsDelete         = wareHouse_Settings_DeleteColumnBtn.isDisplayed();
				boolean actEntryPageWarehouseCMBSettingsOk             = wareHouse_Settings_OkBtn.isDisplayed();
				boolean actEntryPageWarehouseCMBSettingsCancel         = wareHouse_Settings_CancelBtn.isDisplayed();
				
				boolean expEntryPageWarehouseCMBSettings              = true;
				boolean expEntryPageWarehouseCMBSettingsStandardField = true;
				boolean expEntryPageWarehouseCMBSettingsDelete        = true;
				boolean expEntryPageWarehouseCMBSettingsOk            = true;
				boolean expEntryPageWarehouseCMBSettingsCancel        = true;
				
				
				boolean actMethod = actEntryPageWarehouseCMBSettings==expEntryPageWarehouseCMBSettings && actEntryPageWarehouseCMBSettingsStandardField==expEntryPageWarehouseCMBSettingsStandardField 
									&& actEntryPageWarehouseCMBSettingsDelete==expEntryPageWarehouseCMBSettingsDelete && actEntryPageWarehouseCMBSettingsOk==expEntryPageWarehouseCMBSettingsOk 
									&& actEntryPageWarehouseCMBSettingsCancel==expEntryPageWarehouseCMBSettingsCancel;

				String actResult = Boolean.toString(actMethod);

				excelReader.setCellData(xlfile, xlSheetName, 60, 8, actResult.toUpperCase());
			
				System.out.println("Warehouse Settings Value Actual                : " + actEntryPageWarehouseCMBSettings+              " Value Expected : "+expEntryPageWarehouseCMBSettings);
				System.out.println("Warehouse Settings Standard Field Value Actual : " + actEntryPageWarehouseCMBSettingsStandardField+ " Value Expected : "+expEntryPageWarehouseCMBSettingsStandardField);
				System.out.println("Warehouse Settings Delete Value Actual         : " + actEntryPageWarehouseCMBSettingsDelete+        " Value Expected : "+expEntryPageWarehouseCMBSettingsDelete);
				System.out.println("Warehouse Settings Ok Value Actual             : " + actEntryPageWarehouseCMBSettingsOk+            " Value Expected : "+expEntryPageWarehouseCMBSettingsOk);	
				System.out.println("Warehouse Settings Cancel Value Actual         : " + actEntryPageWarehouseCMBSettingsCancel+        " Value Expected : "+expEntryPageWarehouseCMBSettingsCancel);		
				
				if(actMethod==true)
				{
					System.out.println("Test Pass : Customize Pop Up Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 60, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Pass : Date is 08/26/2019");
					excelReader.setCellData(xlfile, xlSheetName, 60, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 60, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
		  public boolean checkOpeningStocksNewWarehouseCustomizeStandardFieldOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  { 
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_StandardFieldsBtn));
				wareHouse_Settings_StandardFieldsBtn.click();
				
				boolean actEntryPageWarehouseStdFieldsDD          = wareHouse_Settings_StandardFieldsBtn_Fielddropdown.isDisplayed();
				boolean actEntryPageWarehouseStdHeaderTxt         = wareHouse_Settings_StandardFieldsBtn_HeaderTxt.isDisplayed();
				boolean actEntryPageWarehouseStdAlignmentDD       = wareHouse_Settings_StandardFieldsBtn_Alignmentdropdown.isDisplayed();
				boolean actEntryPageWarehouseStdWidthTxt          = wareHouse_Settings_StandardFieldsBtn_WidthTxt.isDisplayed();
				boolean actEntryPageWarehouseStdOkButton          = wareHouse_Settings_StandardFieldsBtn_OkBtn.isDisplayed();
				boolean actEntryPageWarehouseStdCancelBtn         = wareHouse_Settings_StandardFieldsBtn_CancelBtn.isDisplayed();
				
				boolean expEntryPageWarehouseStdFieldsDD          = true;
				boolean expEntryPageWarehouseStdHeaderTxt         = true;
				boolean expEntryPageWarehouseStdAlignmentDD       = true;
				boolean expEntryPageWarehouseStdWidthTxt          = true;
				boolean expEntryPageWarehouseStdOkButton          = true;
				boolean expEntryPageWarehouseStdCancelBtn         = true;
				
				boolean actMethod = actEntryPageWarehouseStdFieldsDD==expEntryPageWarehouseStdFieldsDD && actEntryPageWarehouseStdHeaderTxt==expEntryPageWarehouseStdHeaderTxt
									&& actEntryPageWarehouseStdAlignmentDD==expEntryPageWarehouseStdAlignmentDD && actEntryPageWarehouseStdWidthTxt==expEntryPageWarehouseStdWidthTxt
									&& actEntryPageWarehouseStdOkButton==expEntryPageWarehouseStdOkButton && actEntryPageWarehouseStdCancelBtn==expEntryPageWarehouseStdCancelBtn;

				String actResult = Boolean.toString(actMethod);

				excelReader.setCellData(xlfile, xlSheetName, 61, 8, actResult.toUpperCase());
				
				System.out.println("Warehouse StdFieldsDD Value Actual        : " + actEntryPageWarehouseStdFieldsDD +    " Value Expected : " + expEntryPageWarehouseStdFieldsDD);
				System.out.println("Warehouse StdFieldsText Value Actual      : " + actEntryPageWarehouseStdHeaderTxt +   " Value Expected : " + expEntryPageWarehouseStdHeaderTxt);
				System.out.println("Warehouse StdFieldsAlignment Value Actual : " + actEntryPageWarehouseStdAlignmentDD + " Value Expected : " + expEntryPageWarehouseStdAlignmentDD);
				System.out.println("Warehouse StdFieldsWidth Value Actual     : " + actEntryPageWarehouseStdWidthTxt +    " Value Expected : " + expEntryPageWarehouseStdWidthTxt);	
				System.out.println("Warehouse StdFieldsOK Value Actual        : " + actEntryPageWarehouseStdOkButton +    " Value Expected : " + expEntryPageWarehouseStdOkButton);	
				System.out.println("Warehouse StdFieldsCancel Value Actual    : " + actEntryPageWarehouseStdCancelBtn +   " Value Expected : " + expEntryPageWarehouseStdCancelBtn);
				
				if(actMethod==true)
				{
					System.out.println("Test Pass : Standard Field Options Are Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 61, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Pass : Date is 08/26/2019");
					excelReader.setCellData(xlfile, xlSheetName, 61, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 61, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
		  public boolean checkOpeningStocksNewWarehouseCustomizeOnSelectingCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_StandardFieldsBtn_Fielddropdown));
				wareHouse_Settings_StandardFieldsBtn_Fielddropdown.click();
				
				Select s=new Select(wareHouse_Settings_StandardFieldsBtn_Fielddropdown);
				s.selectByVisibleText(excelReader.getCellData(xlSheetName, 62, 6));
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_StandardFieldsBtn_OkBtn));
				wareHouse_Settings_StandardFieldsBtn_OkBtn.click();
				
				boolean actWarehouseCustomizeName  = customize_sName.isDisplayed();
				boolean actWarehouseCustomizeCode  = customize_sCode.isDisplayed();
				
				boolean expWarehouseCustomizeName  = true;
				boolean expWarehouseCustomizeCode  = true;
				
				boolean actMethod =actWarehouseCustomizeName==expWarehouseCustomizeName && actWarehouseCustomizeCode==expWarehouseCustomizeCode;

				String actResult = Boolean.toString(actMethod);

				excelReader.setCellData(xlfile, xlSheetName, 62, 8, actResult.toUpperCase());
				
				System.out.println("Warehouse Customize Name Value Actual  : " + actWarehouseCustomizeName + "  Value Expected : " + expWarehouseCustomizeName);
				System.out.println("Warehouse Customize Code Value Actual  : " + actWarehouseCustomizeCode + "  Value Expected : " + expWarehouseCustomizeCode);
				
				if(actMethod==true)
				{
					System.out.println("Test Pass : Code Selected");
					excelReader.setCellData(xlfile, xlSheetName, 62, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Pass : Date is 08/26/2019");
					excelReader.setCellData(xlfile, xlSheetName, 62, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 62, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			

		  @FindBy (xpath="//*[@id='id_header_268435460_customize_popup_container']/div")
		  public static List<WebElement> osHeaderWarehouseSettingsCustomizeCount;	

		  public boolean checkOpeningStocksNewWarehouseCustomizeDeleteColumn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			try
			{	
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_StandardFieldsBtn));
				wareHouse_Settings_StandardFieldsBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_StandardFieldsBtn_Fielddropdown));
				wareHouse_Settings_StandardFieldsBtn_Fielddropdown.click();
				
				Select s=new Select(wareHouse_Settings_StandardFieldsBtn_Fielddropdown);
				s.selectByVisibleText(excelReader.getCellData(xlSheetName, 63, 6));
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_StandardFieldsBtn_OkBtn));
				wareHouse_Settings_StandardFieldsBtn_OkBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_StandardFieldsBtn));
				wareHouse_Settings_StandardFieldsBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_StandardFieldsBtn_Fielddropdown));
				wareHouse_Settings_StandardFieldsBtn_Fielddropdown.click();
				
				s.selectByVisibleText(excelReader.getCellData(xlSheetName, 64, 6));
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_StandardFieldsBtn_OkBtn));
				wareHouse_Settings_StandardFieldsBtn_OkBtn.click();		
				
				boolean actWarehouseCustomizeName  = customize_sName.isDisplayed();
				boolean actWarehouseCustomizeCode  = customize_sCode.isDisplayed();
				boolean actWarehouseCustomizeAlias = customize_Alias.isDisplayed();
				boolean actWarehouseCustomizeGroup = customize_bGroup.isDisplayed();
				
				boolean expWarehouseCustomizeName  = true;
				boolean expWarehouseCustomizeCode  = true;
				boolean expWarehouseCustomizeAlias = true;
				boolean expWarehouseCustomizeGroup = true;
			
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customize_bGroup));
				customize_bGroup.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_DeleteColumnBtn));
				wareHouse_Settings_DeleteColumnBtn.click();
				
				int Count      = osHeaderWarehouseSettingsCustomizeCount.size();
				
				String actWarehouseCustomizeCount=Integer.toString(Count);
				
				String expWarehouseCustomizeCount = excelReader.getCellData(xlSheetName, 64, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 64, 8, actWarehouseCustomizeCount);
				
				boolean actMethod = actWarehouseCustomizeName==expWarehouseCustomizeName && actWarehouseCustomizeCode==expWarehouseCustomizeCode 
									&& actWarehouseCustomizeAlias==expWarehouseCustomizeAlias && actWarehouseCustomizeGroup==expWarehouseCustomizeGroup;
				
				String actResult = Boolean.toString(actMethod);
				
				excelReader.setCellData(xlfile, xlSheetName, 63, 8, actResult.toUpperCase());
				
				
				System.out.println("Name Value Actual           : " + actWarehouseCustomizeName +  " Value Expected : " + expWarehouseCustomizeName);
				System.out.println("Code Value Actual           : " + actWarehouseCustomizeCode +  " Value Expected : " + expWarehouseCustomizeCode);
				System.out.println("Allias Value Actual         : " + actWarehouseCustomizeAlias + " Value Expected : " + expWarehouseCustomizeAlias);
				System.out.println("Group Value Actual          : " + actWarehouseCustomizeGroup + " Value Expected : " + expWarehouseCustomizeGroup);
				System.out.println("Field Count on Delete Group : " + actWarehouseCustomizeCount + " Value Expected : " + expWarehouseCustomizeCount);

				if(actMethod==true && actWarehouseCustomizeCount.equalsIgnoreCase(expWarehouseCustomizeCount))
				{
					System.out.println("Test Fail : Group NOT Deleted");
					excelReader.setCellData(xlfile, xlSheetName, 63, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Pass : Date is 08/26/2019");
					excelReader.setCellData(xlfile, xlSheetName, 63, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 63, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
			
		  @FindBy (xpath="//td[@id='id_header_1_input_image']//span[@class='optioncontrol_arrow_margin icon-down-arrow']")
		  public static WebElement documentNumberArrow;	

		  @FindBy (xpath="//*[@id='id_transaction_entry_container']/div/div[1]/nav/div[1]/a/div/span[2]")
		  public static WebElement getText;	

		  public boolean checkOpeningStocksNewWarehouseCustomizationCancel() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			boolean res = false;
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouse_Settings_CancelBtn));
				wareHouse_Settings_CancelBtn.click();
				
				if(wareHouse_Settings_StandardFieldsBtn.isDisplayed())
				{
					res=false;
					String result = Boolean.toString(res);
					excelReader.setCellData(xlfile, xlSheetName, 65, 8, result.toUpperCase());
					
					System.out.println("Test Fail : Customize Screen Displaying");
					excelReader.setCellData(xlfile, xlSheetName, 65, 9, resFail);
							
					return false;
				}
				else
				{
					
					res=true;
					String result = Boolean.toString(res);
					excelReader.setCellData(xlfile, xlSheetName, 65, 8, result.toUpperCase());
					
					System.out.println("Test Pass : Customize Screen NOT Displaying ");
					excelReader.setCellData(xlfile, xlSheetName, 65, 9, resPass);
					return true;
				}
			}
			catch(Exception e)
			{
				res=true;
				String result = Boolean.toString(res);
				excelReader.setCellData(xlfile, xlSheetName, 65, 8, result.toUpperCase());
				
				System.out.println("Test Pass : Customize Screen NOT Displaying");
				excelReader.setCellData(xlfile, xlSheetName, 65, 9, resPass);
				return true;
			}
		  }
		  
		  
		  

		  public boolean checkOpeningStocksNewItemCustomize() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		    try
		    {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item_SettingsBtn));
				item_SettingsBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item_Settings_Container));
				
				boolean actItemCustomizeSettings          = item_Settings_Container.isDisplayed();
				boolean actItemCustomizeStandardFieldBtn  = item_Settings_StandardFieldsBtn.isDisplayed();
				boolean actItemCustomizeDeleteBtn         = item_Settings_DeleteColumnBtn.isDisplayed();
				boolean actItemCustomizeOkBtn             = item_Settings_OkBtn.isDisplayed();
				boolean actItemCustomizeCancelBtn         = item_Settings_CancelBtn.isDisplayed();
				
				boolean expItemCustomizeSettings          = true;
				boolean expItemCustomizeStandardFieldBtn  = true;
				boolean expItemCustomizeDeleteBtn         = true;
				boolean expItemCustomizeOkBtn             = true;
				boolean expItemCustomizeCancelBtn         = true;
				
				boolean actMethod = actItemCustomizeSettings==expItemCustomizeSettings && actItemCustomizeStandardFieldBtn==expItemCustomizeStandardFieldBtn 
									&& actItemCustomizeDeleteBtn==expItemCustomizeDeleteBtn && actItemCustomizeOkBtn==expItemCustomizeOkBtn
									&& actItemCustomizeCancelBtn==expItemCustomizeCancelBtn;

				String actResult = Boolean.toString(actMethod);

				excelReader.setCellData(xlfile, xlSheetName, 66, 8, actResult.toUpperCase());
				
				System.out.println("Settings Value Actual       : " + actItemCustomizeSettings +         "  Value Expected : " + expItemCustomizeSettings);
				System.out.println("Standard Field Value Actual : " + actItemCustomizeStandardFieldBtn + "  Value Expected : " + expItemCustomizeStandardFieldBtn);
				System.out.println("Delete Value Actual         : " + actItemCustomizeDeleteBtn +        "  Value Expected : " + expItemCustomizeDeleteBtn);
				System.out.println("Ok Value Actual             : " + actItemCustomizeOkBtn +            "  Value Expected : " + expItemCustomizeOkBtn);
				System.out.println("Cancel Value Actual         : " + actItemCustomizeCancelBtn +        "  Value Expected : " + expItemCustomizeCancelBtn);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item_Settings_Container));
				
				if(actMethod==true)
				{
					System.out.println("Test Pass : Customize Pop Up Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 66, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Customize Pop Up NOT Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 66, 9, resFail);
					return false;
				}
		    }
		    catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 66, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
		  public boolean checkOpeningStocksNewItemCustomizationStandardFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item_Settings_StandardFieldsBtn));
				item_Settings_StandardFieldsBtn.click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item_Settings_StandardFieldsBtn_Fielddropdown));
				boolean actItemCustomizeFieldDropdown     = item_Settings_StandardFieldsBtn_Fielddropdown.isDisplayed();
				boolean actItemCustomizeHeaderTxt         = item_Settings_StandardFieldsBtn_HeaderTxt.isDisplayed();
				boolean actItemCustomizeAlignmentBtn      = item_Settings_StandardFieldsBtn_Alignmentdropdown.isDisplayed();
				boolean actItemCustomizeWidth             = item_Settings_StandardFieldsBtn_WidthTxt.isDisplayed();
				boolean actItemCustomizeOkBtn             = item_Settings_StandardFieldsBtn_OkBtn.isDisplayed();
				boolean actItemCustomizeCancelBtn         = item_Settings_StandardFieldsBtn_CancelBtn.isDisplayed();
				
				boolean expItemCustomizeFieldDropdown     = true;
				boolean expItemCustomizeHeaderTxt         = true;
				boolean expItemCustomizeAlignmentBtn      = true;
				boolean expItemCustomizeWidth             = true;
				boolean expItemCustomizeOkBtn             = true;
				boolean expItemCustomizeCancelBtn         = true;
				
				boolean actMethod = actItemCustomizeFieldDropdown==expItemCustomizeFieldDropdown && actItemCustomizeHeaderTxt==expItemCustomizeHeaderTxt
									&& actItemCustomizeAlignmentBtn==expItemCustomizeAlignmentBtn && actItemCustomizeWidth==expItemCustomizeWidth
									&& actItemCustomizeOkBtn==expItemCustomizeOkBtn && actItemCustomizeCancelBtn==expItemCustomizeCancelBtn;

				String actResult = Boolean.toString(actMethod);

				excelReader.setCellData(xlfile, xlSheetName, 67, 8, actResult.toUpperCase());
			
				System.out.println("Item Customize fieldDropdown Value Actual  : " + actItemCustomizeFieldDropdown + " Value Expected : "+expItemCustomizeFieldDropdown);
				System.out.println("Item Customize Header Value Actual         : " + actItemCustomizeHeaderTxt +     " Value Expected : "+expItemCustomizeHeaderTxt);
				System.out.println("Item Customize Alignment Value Actual      : " + actItemCustomizeAlignmentBtn +  " Value Expected : "+expItemCustomizeAlignmentBtn);
				System.out.println("Item Customize Width Value Actual          : " + actItemCustomizeWidth +         " Value Expected : "+expItemCustomizeWidth);
				System.out.println("Item Customize OK Value Actual             : " + actItemCustomizeOkBtn +         " Value Expected : "+expItemCustomizeOkBtn);
				System.out.println("Item Customize Cancel Value Actual         : " + actItemCustomizeCancelBtn +     " Value Expected : "+expItemCustomizeCancelBtn);
				
				if(actMethod==true)
				{
					System.out.println("Test Pass : Standard Field Options Are Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 67, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Customize Pop Up NOT Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 67, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {		
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 67, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }		
		  }
		  
		  
			
		  public boolean checkOpeningStocksNewItemCustomizationAddBalanceColumn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item_Settings_StandardFieldsBtn_Fielddropdown));
				item_Settings_StandardFieldsBtn_Fielddropdown.click();
				
				Select s=new Select(item_Settings_StandardFieldsBtn_Fielddropdown);
				s.selectByVisibleText(excelReader.getCellData(xlSheetName, 68, 6));
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item_Settings_StandardFieldsBtn_OkBtn));
				item_Settings_StandardFieldsBtn_OkBtn.click();
						
				boolean actItemCustomizeFieldName       = customize_sName.isDisplayed();
				boolean actItemCustomizeFieldBalance    = customize_Balance.isDisplayed();
				
				boolean expItemCustomizeFieldName       = true;
				boolean expItemCustomizeFieldBalance    = true;
				
				boolean actMethod = actItemCustomizeFieldName==expItemCustomizeFieldName && actItemCustomizeFieldBalance==expItemCustomizeFieldBalance;

				String actResult = Boolean.toString(actMethod);

				excelReader.setCellData(xlfile, xlSheetName, 68, 8, actResult.toUpperCase());
				

				System.out.println("Name Value Actual      : " + actItemCustomizeFieldName    + " Value Expected        : " + expItemCustomizeFieldName);
				System.out.println("Balance Value Actual   : " + actItemCustomizeFieldBalance + " Value Expected        : " + expItemCustomizeFieldBalance);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item_Settings_OkBtn));
				item_Settings_OkBtn.click();
			
				if(actMethod==true)
				{
					System.out.println("Test Pass : Balance Selected");
					excelReader.setCellData(xlfile, xlSheetName, 68, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Customize Pop Up NOT Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 68, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 68, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
		  
		  
		 
		  public boolean checkOpeningStocksNewSaveWithoutInputOfBodyRowsColumns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			    saveBtn.click();
			    	    
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));	 
			    
			    String expOnSaveMessageWithoutMandatory = excelReader.getCellData(xlSheetName, 70, 7);
			    
			    String actOnSaveMessageWithoutMandatory= checkValidationMessage(expOnSaveMessageWithoutMandatory);
			    
			    excelReader.setCellData(xlfile, xlSheetName, 70, 8, actOnSaveMessageWithoutMandatory);
				
				System.out.println("Entry Page Save Without Input Value Actual : " + actOnSaveMessageWithoutMandatory + " Value Expected : " + expOnSaveMessageWithoutMandatory);
				
			    if (actOnSaveMessageWithoutMandatory.equalsIgnoreCase(expOnSaveMessageWithoutMandatory))
			    {
			        excelReader.setCellData(xlfile, xlSheetName, 69, 9, resPass);
			        return true;
			    } 
			    else 
			    {
			      excelReader.setCellData(xlfile, xlSheetName, 69, 9, resFail);
		          return false;
			    }
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 69, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		 }
			
			
			
		  public boolean checkOpeningStocksNewVouchersEntryPageNew() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				documentNumberTxt.click();
				documentNumberTxt.clear();
				documentNumberTxt.sendKeys(excelReader.getCellData(xlSheetName, 71, 6));
				documentNumberTxt.sendKeys(Keys.TAB);
				
				String actDocNumberBeforeNewClick     = documentNumberTxt.getAttribute("value");
				String expDocNumberBeforeNewClick     = excelReader.getCellData(xlSheetName, 72, 7);
						
				System.out.println("Test Pass : Entered 2 in DOC NO");
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
				wareHouseTxt.sendKeys("Hyderabad");
				Thread.sleep(3000);
				wareHouseTxt.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_newBtn));
				new_newBtn.click();
				
				getWaitForAlert();
				
				String actAlertMessageBeforeNewClick   = getAlert().getText();
				String expAlertMessageBeforeNewClick0  = excelReader.getCellData(xlSheetName, 73, 7);
				String expAlertMessageBeforeNewClick1  = excelReader.getCellData(xlSheetName, 74, 7);
				
				getAlert().accept();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				String actDocNumberAfterNewClick       = documentNumberTxt.getAttribute("value");
				String expDocNumberAfterNewClick       = excelReader.getCellData(xlSheetName, 75, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 72, 8, actDocNumberBeforeNewClick);
				excelReader.setCellData(xlfile, xlSheetName, 73, 8, actAlertMessageBeforeNewClick);
				excelReader.setCellData(xlfile, xlSheetName, 75, 8, actDocNumberAfterNewClick);
				
				
				System.out.println("Entry Page Save on Click New Value Actual  : " + actAlertMessageBeforeNewClick + " Value Expected   : " + expAlertMessageBeforeNewClick0+expAlertMessageBeforeNewClick1);
						
				if(actDocNumberBeforeNewClick.equalsIgnoreCase(expDocNumberBeforeNewClick) && actAlertMessageBeforeNewClick.startsWith(expAlertMessageBeforeNewClick0) 
						&& actAlertMessageBeforeNewClick.endsWith(expAlertMessageBeforeNewClick1) && actDocNumberAfterNewClick.equalsIgnoreCase(expDocNumberAfterNewClick))
				{	
					System.out.println("Test Pass : DOC NO is 1");
					excelReader.setCellData(xlfile, xlSheetName, 71, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Customize Pop Up NOT Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 71, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 71, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			

			
		  @FindBy(xpath="//tbody[@id='id_body_23_table_body']/tr/td[2]")
		  private static List<WebElement> itemListCount;
			
		  public boolean checkOpeningStocksNewBodyRowsItemColumn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
				wareHouseTxt.sendKeys(Keys.SPACE);
					
				int warehousecount=wareHouseListCount.size();
				
				System.err.println(warehousecount);
					
				for(int i=0 ; i < warehousecount ;i++)
				{
					String data=wareHouseListCount.get(i).getText();
					
					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 76, 6)))
					{
						wareHouseListCount.get(i).click();
						break;
					}
				}
				
				wareHouseTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();		
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemListCounts = itemListCount.size();
				
				ArrayList<String> itemListCountArray = new ArrayList<String>();
				
				for(int i=0;i<itemListCounts;i++)
				{
					String data=itemListCount.get(i).getText();
					itemListCountArray.add(data);
				}
					
				String actitemListCount=itemListCountArray.toString();
				
				String expitemListCount ="[BATCH BIN FINISHED GOODS ITEM, BATCH BIN WITH NO RESERVATION ITEM, BATCH BIN WITH NO STOCK UPDATE ITEM, BATCH BR ITEM, BATCH FIFO ITEM, BATCH IGNORE EXP LIFO ITEM, BATCH WA ITEM, BIN FINISHED GOODS ITEM, BIN RAW MATERIAL ITEM, BR COGS ITEM, FIFO COGS ITEM, RMA BATCH ITEM, RMA FITEM, RMA RITEM, STD RATE COGS ITEM, STOCK ITEM, WA COGS ITEM]";
				
				excelReader.setCellData(xlfile, xlSheetName, 77, 8, actitemListCount);
				
				System.out.println("itemListCount Actual   : " + actitemListCount);
				System.out.println("itemListCount Expected : " + expitemListCount);
				
				if(actitemListCount.equalsIgnoreCase(expitemListCount))
				{
					System.out.println("Test Pass : Unit Field Displayed with Dozens");
					excelReader.setCellData(xlfile, xlSheetName, 76, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Unit Field NOT Displayed with Dozens");
					excelReader.setCellData(xlfile, xlSheetName, 76, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 76, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
			
		  public boolean checkOpeningStocksNewVoucherBodyRowUnitsColumn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			try
			{
			    int itemcount=itemListCount.size();
				
				System.err.println(itemcount);
					
				for(int i=0 ; i < itemcount ;i++)
				{
					String data=itemListCount.get(i).getText();
					
					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 78, 6)))
					{
						itemListCount.get(i).click();
						
						break;
					}
				}
					
				enter_ItemTxt.sendKeys(Keys.TAB);	
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.click();
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				String actUnitsColumnValue  = select1stRow_2ndColumn.getText();
				String expUnitsColumnValue  = excelReader.getCellData(xlSheetName, 79, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 79, 8, actUnitsColumnValue);
			
				System.out.println("Select Item Units Column Value Actual  : " + actUnitsColumnValue + "    Value Expected   : " + expUnitsColumnValue);
			
				if(actUnitsColumnValue.equalsIgnoreCase(expUnitsColumnValue))
				{
					System.out.println("Test Pass : Unit Field Displayed with Dozens");
					excelReader.setCellData(xlfile, xlSheetName, 78, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Unit Field NOT Displayed with Dozens");
					excelReader.setCellData(xlfile, xlSheetName, 78, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
			{
		    
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 78, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
		  public boolean checkOpeningStocksNewSaveVoucherWithoutBatch() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
					
			    String expSaveMessageWithOutBatch=excelReader.getCellData(xlSheetName, 81, 7);
				
				String validationMessage=checkValidationMessage(expSaveMessageWithOutBatch);

				excelReader.setCellData(xlfile, xlSheetName, 81, 8, validationMessage);
				
				System.out.println("Click On Save Without Input Of Batch Value Actual  : " + validationMessage + "  Value Expected   : " + "TRUE");

				if(validationMessage.equalsIgnoreCase(expSaveMessageWithOutBatch))
				{
					System.out.println("Test Pass : Error Message Is As Expected");
					
					excelReader.setCellData(xlfile, xlSheetName, 80, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Error Message Is NOT As Expected");
					
					excelReader.setCellData(xlfile, xlSheetName, 80, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				String exception =e.getMessage().substring(0, 50);
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 80, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
			
			
		  public boolean checkOpeningStocksNewSaveDataWithoutExpiryDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
				select2ndRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				String expSaveMessageWithOutBatchExpiry=excelReader.getCellData(xlSheetName, 83, 7);
				
				String validationMessage=checkValidationMessage(expSaveMessageWithOutBatchExpiry);
				
				excelReader.setCellData(xlfile, xlSheetName, 83, 8, validationMessage);
				
						
				System.out.println("Entry Page Save With Input Of Batch Value Actual  : " + validationMessage + "  Value Expected   : " + "TRUE");
			
			
				if(validationMessage.equalsIgnoreCase(expSaveMessageWithOutBatchExpiry))
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

		  
		  @FindBy(xpath="//input[@id='id_body_37']")
		  private static WebElement enter_Expirydate;

		  public boolean checkOpeningStocksNewVoucherBRItemInputBodyDataInFirstRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		    try
		    {
		    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
				select1stRow_8thColumn.click();
				
				Calendar calendar = Calendar.getInstance();
				
			    calendar.add(Calendar.DATE, 2);
			
			    Date date = calendar.getTime();
			
			    DateFormat dfr = new SimpleDateFormat("dd/MM/yyyy");
			    
			    System.out.println(dfr.format(date).toString());
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
				enter_Expirydate.click();
				enter_Expirydate.sendKeys(Keys.END);
				enter_Expirydate.sendKeys(Keys.SHIFT,Keys.HOME);
				enter_Expirydate.sendKeys(dfr.format(date).toString());
				enter_Expirydate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
				String actQtyR1         = select1stRow_3rdColumn.getText();
				String actRateR1        = select1stRow_4thColumn.getText();
				String actGrossR1       = select1stRow_5thColumn.getText();
				String actBatchR1       = select1stRow_6thColumn.getText();
				
				String expQtyR1         = excelReader.getCellData(xlSheetName, 86, 7);
				String expRateR1        = "9.00";
				String expGrossR1       = excelReader.getCellData(xlSheetName, 88, 7);
				String expBatchR1       = excelReader.getCellData(xlSheetName, 89, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 86, 8, actQtyR1);
				excelReader.setCellData(xlfile, xlSheetName, 87, 8, actRateR1);
				excelReader.setCellData(xlfile, xlSheetName, 88, 8, actGrossR1);
				excelReader.setCellData(xlfile, xlSheetName, 89, 8, actBatchR1);

				System.out.println("Qty Row 1 Value Actual    : " + actQtyR1     +       " Value Expected   : " + expQtyR1);
				System.out.println("Rate Row 1 Value Actual   : " + actRateR1    +       " Value Expected   : " + expRateR1);
				System.out.println("Gross Row 1 Value Actual  : " + actGrossR1   +       " Value Expected   : " + expGrossR1);
				System.out.println("Batch Row 1 Value Actual  : " + actBatchR1   +       " Value Expected   : " + expBatchR1);
				
				
				if(actQtyR1.equalsIgnoreCase(expQtyR1) && actRateR1.equalsIgnoreCase(expRateR1) && actGrossR1.equalsIgnoreCase(expGrossR1)
						&& actBatchR1.equalsIgnoreCase(expBatchR1))
				{
					System.out.println("Test Pass : Data Entered in First Row");
					excelReader.setCellData(xlfile, xlSheetName, 85, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Data NOT Entered in First Row");
					excelReader.setCellData(xlfile, xlSheetName, 85, 9, resFail);
					return false;
				}
		    }
		    catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 85, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			


		  
		  
		  public boolean checkOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		    try
		    {
		    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
				select2ndRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemcount = itemListCount.size();
				
				System.err.println(itemcount);
					
				for(int i=0 ; i < itemcount ;i++)
				{
					String data = itemListCount.get(i).getText();
					
					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 90, 6)))
					{
						itemListCount.get(i).click();
						break;
					}
			    }
			
		        enter_ItemTxt.sendKeys(Keys.TAB);	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
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
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				String expSaveMessageWithOutBatchExpiry=excelReader.getCellData(xlSheetName, 92, 7);
				
				String validationMessage=checkValidationMessage(expSaveMessageWithOutBatchExpiry);
				
				excelReader.setCellData(xlfile, xlSheetName, 92, 8, validationMessage);
						
				System.out.println("Entry Page Save With Input Of Batch Value Actual  : " + validationMessage + "  Value Expected   : " + "TRUE");
			
				if(actUnitsColumnSelectingBinsProduct.equalsIgnoreCase(expUnitsColumnSelectingBinsProduct) &&  expSaveMessageWithOutBatchExpiry.equalsIgnoreCase(validationMessage))
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
		  
		  
		  
		  @FindBy(xpath="//*[@id='id_transaction_bins_grid_body']/tr/td")
		  private static List<WebElement> binInwardGridList;
			
		  public boolean checkOpeningStocksNewVoucherInputBinFifoBinPopupOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
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
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
				binSearchBtn.click();
				
				Thread.sleep(2000);
				
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
				
				String actBinTotalQty           = binTotalQty.getAttribute("value");
				String actBinBaseUom            = binBaseUOM.getText();
				////[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]         = binBalanceTxt.getAttribute("value");
				

				excelReader.setCellData(xlfile, xlSheetName, 95, 8, actBinTotalQty);
				excelReader.setCellData(xlfile, xlSheetName, 96, 8, actBinBaseUom);
				//excelReader.setCellData(xlfile, xlSheetName, 97, 8, actBinBalanceQty);
			
				String expBinTotalQty           = excelReader.getCellData(xlSheetName, 95, 7);
				String expBinBaseUom            = excelReader.getCellData(xlSheetName, 96, 7);
				////String expBinBalanceQty         = excelReader.getCellData(xlSheetName, 97, 7);
						
				System.out.println("Bin Total Qty Value Actual              :  " +actBinTotalQty +           " Value Expected : " + expBinTotalQty);
				System.out.println("Bin Base Uom Value Actual               :  " +actBinBaseUom +            " Value Expected : " + expBinBaseUom);
				////System.out.println("Bin Balance Txt Value Actual            :  " +actBinBalanceQty +         " Value Expected : " + expBinBalanceQty);
					
				System.out.println("Bin Search Value Actual                 :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
				System.out.println("Bin Search Btn Value Actual             :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
				System.out.println("Bin Auto Allocate Btn Value Actual      :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
				System.out.println("Bin Pick Btn Value Actual               :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
				System.out.println("Bin Cancel Btn Value Actual             :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
									
				if(actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && actBinTotalQty.equalsIgnoreCase(expBinTotalQty)
						&& actBinBaseUom.endsWith(expBinBaseUom) /*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/)
				{
					System.out.println("Test Pass : Bin Popup options Are As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 93, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 93, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 93, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
			
			
			
		  // Not Updating Total Sum
		  public boolean checkSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_1stColumn));
				getAction().doubleClick(binselect2ndRow_1stColumn).build().perform();
				
				
				
				String actBinTotalQty           = binTotalQty.getAttribute("value");
				String actBinBaseUom            = binBaseUOM.getText();
				//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]         = binBalanceTxt.getAttribute("value");	
				//String actBinSum                = binSumInward.getText();
			
				String expBinTotalQty           = excelReader.getCellData(xlSheetName, 100, 7);
				String expBinBaseUom            = excelReader.getCellData(xlSheetName, 101, 7);
				//String expBinBalanceQty         = excelReader.getCellData(xlSheetName, 102, 7);
				String expBinSum                = excelReader.getCellData(xlSheetName, 103, 7);
				
				
				excelReader.setCellData(xlfile, xlSheetName, 100, 8, actBinTotalQty);
				excelReader.setCellData(xlfile, xlSheetName, 101, 8, actBinBaseUom);
				//excelReader.setCellData(xlfile, xlSheetName, 102, 8, actBinBalanceQty);
				//excelReader.setCellData(xlfile, xlSheetName, 103, 8, actBinSum);
				
					
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
				//System.out.println("Bin Sum of To Be Allocated Qty Value Actual :  " + actBinSum             +         " Value Expected : " + expBinSum);
				System.out.println("Bin Base Uom Value Actual            	    :  " + actBinBaseUom         +         " Value Expected : " + expBinBaseUom);
				//System.out.println("Bin Balance Txt Value Actual          		:  " + actBinBalanceQty      +         " Value Expected : " + expBinBalanceQty);
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				String actBinName      = excelReader.getCellData(xlSheetName, 104, 7);
				String expBinName      = select2ndRow_7thColumn.getText();
				
				excelReader.setCellData(xlfile, xlSheetName, 104, 8, actBinName);
				
				System.out.println("Bin Column in Voucher Value Actual          : " + actBinName +              " Value Exepected  : " + expBinName);
			
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
						
				if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
						
						&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
						/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
						
						/*&& actBinSum.equalsIgnoreCase(expBinSum)*/
						
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
			
			
			
			
		  public boolean checkOpeningStocksAddingDataInThirdRowForBinCheking() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
					
					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 105, 6)))
					{
						itemListCount.get(i).click();
						
						break;
					}
				}
					
				enter_ItemTxt.sendKeys(Keys.TAB);	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.click();
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.click();
				enter_Quantity.clear();
				enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 106, 6));
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.click();
				enter_Rate.clear();
				enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 107, 6));
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
				
				boolean actBinSearchTxt             = binSearchTxt.isDisplayed();
				boolean actBinSearchBtn             = binSearchBtn.isDisplayed();
				boolean actBinAutoAllocateBtn       = binAutoAllocateBtn.isDisplayed();
				boolean actBinPickBtn               = binPickBtn.isDisplayed();
				boolean actBinCancelBtn             = binCancelBtn.isDisplayed();
				boolean actBinOkBtn                 = binOkBtn.isEnabled();
				
				boolean expBinSearchTxt             = true;
				boolean expBinSearchBtn             = true;
				boolean expBinAlternateCategory     = true;
				boolean expBinAutoAllocateBtn       = true;
				boolean expBinPickBtn               = true;
				boolean expBinCancelBtn             = true;
				boolean expBinOkBtn                 = true;
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
				binSearchBtn.click();
				
				Thread.sleep(2000);
				

				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList=excelReader.getCellData(xlSheetName, 106, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 106, 8, actbinInwardGridList);
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
				
				String actBinTotalQty               = binTotalQty.getAttribute("value");
				String actBinBaseUom                = binBaseUOM.getText();
				////String actbinBalanceTxt = binBalanceTxt.getAttribute("value");
		        //String actBinSum                    = binSumInward.getText();

				String expBinTotalQty               = excelReader.getCellData(xlSheetName, 107, 7);
				String expBinBaseUom                = excelReader.getCellData(xlSheetName, 108, 7);
				////String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 109, 7);
				String expBinSum                    = excelReader.getCellData(xlSheetName, 110, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 107, 8, actBinTotalQty);
				excelReader.setCellData(xlfile, xlSheetName, 108, 8, actBinBaseUom);
				//excelReader.setCellData(xlfile, xlSheetName, 109, 8, actBinBalanceQty);
				//excelReader.setCellData(xlfile, xlSheetName, 110, 8, actBinSum);
				
				
				boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
						            && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
				
				String actResult = Boolean.toString(actMethod);
				
				excelReader.setCellData(xlfile, xlSheetName, 105, 8, actResult.toUpperCase());

			
				System.out.println("Bin Total Qty Value Actual                 :  " +actBinTotalQty +"  			Value Expected : "+expBinTotalQty);
				System.out.println("Bin Base Uom Value Actual                  :  " +actBinBaseUom +"  				Value Expected : "+expBinBaseUom);
				////System.out.println("Bin Balance Txt Value Actual               :  " +actBinBalanceQty +"  		    Value Expected : "+expBinBalanceQty);
				//System.out.println("Bin Total Sum Value Actual                 :  " + actBinSum +"                  Value Expected : " + expBinSum);
				System.out.println("Bin Search Value Actual                    :  " + actBinSearchTxt +"            Value Expected : " + expBinSearchTxt);
				System.out.println("Bin Search Btn Value Actual                :  " + actBinSearchBtn +"            Value Expected : " + expBinSearchBtn);
				System.out.println("Bin Auto Allocate Btn Value Actual         :  " + actBinAutoAllocateBtn +"      Value Expected : " + expBinAutoAllocateBtn);
				System.out.println("Bin Pick Btn Value Actual                  :  " + actBinPickBtn +"              Value Expected : " + expBinPickBtn);
				System.out.println("Bin Cancel Btn Value Actual                :  " + actBinCancelBtn +"            Value Expected : " + expBinCancelBtn);
				System.out.println("Bin Ok Btn Value Actual                    :  " + actBinOkBtn +"                Value Expected : " + expBinOkBtn);
				
							
				if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
						
						&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
						/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
						
						/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
				{
					
					System.out.println("Test Pass : Bin Popup options Are As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 105, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 105, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 105, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
		  
		  
			
		  public boolean checkOpeningStocksAddingBinInThridRowAutoAllocateInBin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{	
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
				binAutoAllocateBtn.click();
					
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
				
				boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
			                        && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;

				String actResult = Boolean.toString(actMethod);

				excelReader.setCellData(xlfile, xlSheetName, 111, 8, actResult.toUpperCase());
					
				System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
				System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
				System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
				System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
				System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
				System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
				
				int binInwardGridListCount = binInwardGridList.size();
				
				ArrayList<String> binInwardGridListArray = new ArrayList<String>();
				
				for(int i=0;i<binInwardGridListCount;i++)
				{
					String data = binInwardGridList.get(i).getText();
					binInwardGridListArray.add(data);
				}
				
				
				String actbinInwardGridList=binInwardGridListArray.toString();
				
				String expbinInwardGridList=excelReader.getCellData(xlSheetName, 112, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 112, 8, actbinInwardGridList);
				
				System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
				System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
				

				
				String actBinTotalQty           = binTotalQty.getAttribute("value");
				String actBinBaseUom            = binBaseUOM.getText();
				//String actbinBalanceTxt  = binBalanceTxt.getAttribute("value");
				//String actBinSum                = binSumInward.getText();
			
				
				String expBinTotalQty           = excelReader.getCellData(xlSheetName, 113, 7);
				String expBinBaseUom            = excelReader.getCellData(xlSheetName, 114, 7);
				//String expBinBalanceQty         = excelReader.getCellData(xlSheetName, 115, 7);
				String expBinSum                = excelReader.getCellData(xlSheetName, 116, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 113, 8, actBinTotalQty);
				excelReader.setCellData(xlfile, xlSheetName, 114, 8, actBinBaseUom);
				//excelReader.setCellData(xlfile, xlSheetName, 115, 8, actBinBalanceQty);
				//excelReader.setCellData(xlfile, xlSheetName, 116, 8, actBinSum);
				
				
				
				
				System.out.println("Bin Total Qty Value Actual                 :  " + actBinTotalQty +         "  Value Expected : " + expBinTotalQty);
				System.out.println("Bin Base Uom  Value Actual                 :  " + actBinBaseUom +          "  Value Expected : " + expBinBaseUom);
				//System.out.println("Bin Balance Value Actual                   :  " + actBinBalanceQty +       "  Value Expected : " + expBinBalanceQty);
				//System.out.println("Bin Total Sum Value Actual                 :  " + actBinSum +             "  Value Expected :  " + expBinSum);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				String actBinNameDisplayInVoucherBinColumn = select3rdRow_7thColumn.getText();
				String expBinNameDisplayInVoucherBinColumn = excelReader.getCellData(xlSheetName, 117, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 117, 8, actBinNameDisplayInVoucherBinColumn);
				
				System.out.println("Bin Column in Voucher Value Actual : " + actBinNameDisplayInVoucherBinColumn +  " Value Expected : " + expBinNameDisplayInVoucherBinColumn);
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_7thColumn));
						
				if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
						
						&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
						/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
						
						/*&& actBinSum.equalsIgnoreCase(expBinSum)*/
						
						&& actBinNameDisplayInVoucherBinColumn.equalsIgnoreCase(expBinNameDisplayInVoucherBinColumn))
				{
					System.out.println("Selected Bin And Ok Btn Not Enabled");
					excelReader.setCellData(xlfile, xlSheetName, 111, 9, resPass);
					return true;
				
				}
				else
				{
					System.out.println("Not Selected Bin And Ok Btn Not Enabled");
					excelReader.setCellData(xlfile, xlSheetName, 111, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 111, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   	 	return false;
		    }	
		  }
			
			
			
			
			
		  public boolean checkOpeningStocksNewAddingDataInFourthRowForBinCheking() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			try
			{
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemcount   =  itemListCount.size();
				
				System.err.println(itemcount);
					
				for(int i=0 ; i < itemcount ;i++)
				{
					String data = itemListCount.get(i).getText();
					
					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 118, 6)))
					{
						itemListCount.get(i).click();		
						break;
					}
				}
					
				enter_ItemTxt.sendKeys(Keys.TAB);	
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.click();
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.click();
				enter_Quantity.clear();
				enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 119, 6));
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.click();
				enter_Rate.clear();
				enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 120, 6));
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
				
				boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
				boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
				boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
				boolean actBinPickBtn                  = binPickBtn.isDisplayed();
				boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
				boolean actBinOkBtn                    = binOkBtn.isEnabled();
						
				boolean expBinSearchTxt                = true;
				boolean expBinSearchBtn                = true;
				boolean expBinAlternateCategory        = true;
				boolean expBinAutoAllocateBtn          = true;
				boolean expBinPickBtn                  = true;
				boolean expBinCancelBtn                = true;
				boolean expBinOkBtn                    = true;
					
				System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
				System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
				System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
				System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
				System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
				System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
			
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
				binSearchBtn.click();
				
				Thread.sleep(2000);
				
				 int binInwardGridListCount = binInwardGridList.size();
		         
		         ArrayList<String> binInwardGridListArray = new ArrayList<String>();
		         
		         for(int i=0;i<binInwardGridListCount;i++)
		         {
		                 String data = binInwardGridList.get(i).getText();
		                 binInwardGridListArray.add(data);
		         }
		         
		         
		         String actbinInwardGridList=binInwardGridListArray.toString();
		         
		         String expbinInwardGridList=excelReader.getCellData(xlSheetName, 119, 7);
		         
		         excelReader.setCellData(xlfile, xlSheetName, 119, 8, actbinInwardGridList);
		         
		         System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
		         System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		         
		         
		         
		         boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
		                             && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
		         
		         String actResult = Boolean.toString(actMethod);
		         
		         excelReader.setCellData(xlfile, xlSheetName, 118, 8, actResult.toUpperCase());

				
				String actBinTotalQty         = binTotalQty.getAttribute("value");
				String actBinBaseUom          = binBaseUOM.getText();
				//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]       = binBalanceTxt.getAttribute("value");
				//String actBinSum              = binSumInward.getText();

			
				String expBinTotalQty         = excelReader.getCellData(xlSheetName, 120, 7);
				String expBinBaseUom          = excelReader.getCellData(xlSheetName, 121, 7);
				//String expBinBalanceQty       = excelReader.getCellData(xlSheetName, 122, 7);
				String expBinSum              = excelReader.getCellData(xlSheetName, 123, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 120, 8, actBinTotalQty);
		        excelReader.setCellData(xlfile, xlSheetName, 121, 8, actBinBaseUom);
		        //excelReader.setCellData(xlfile, xlSheetName, 122, 8, actBinBalanceQty);
		        //excelReader.setCellData(xlfile, xlSheetName, 123, 8, actBinSum);

			
				
				System.out.println("Bin Total Qty               :  " +actBinTotalQty +            "  Value Expected : "  + expBinTotalQty);
				System.out.println("Bin Base Uom                :  " +actBinBaseUom +             "  Value Expected : "  + expBinBaseUom);
				//System.out.println("Bin Balance Txt             :  " +actBinBalanceQty +          "  Value Expected : "  + expBinBalanceQty);
				
				////System.out.println("Bin Total To Be Adjusted    :  " + actBinSum +"   " + expBinSum);
						
				if(actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
						
						&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
						/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
						
						/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
				{
					
					System.out.println("Test Pass : Bin Popup options Are As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 118, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 118, 9, resFail);
					return false;
				}
			}
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 118, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				return false;
		    }   	 
		  }
			
		  
			
		  @FindBy(xpath="//input[@id='id_transaction_bins_grid_control_heading_ctrl_12']")
		  private static WebElement enter_ToBeAllocateTxt;
			
		  public boolean checkOpeningStocksNewVoucherByInputBinColumnManuallyInBinScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
				binselect2ndRow_8thColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ToBeAllocateTxt));
				enter_ToBeAllocateTxt.sendKeys(excelReader.getCellData(xlSheetName, 124, 6));
				enter_ToBeAllocateTxt.sendKeys(Keys.TAB);
				
				boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
				boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
				boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
				boolean actBinPickBtn                  = binPickBtn.isDisplayed();
				boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
				boolean actBinOkBtn                    = binOkBtn.isEnabled();
						
				boolean expBinSearchTxt                = true;
				boolean expBinSearchBtn                = true;
				boolean expBinAlternateCategory        = true;
				boolean expBinAutoAllocateBtn          = true;
				boolean expBinPickBtn                  = true;
				boolean expBinCancelBtn                = true;
				boolean expBinOkBtn                    = true;
					
				System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
				System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
				System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
				System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
				System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
				System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
				
				
				String actBinTotalQty                   = binTotalQty.getAttribute("value");
				String actBinBaseUom                    = binBaseUOM.getText();
				//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]                 = binBalanceTxt.getAttribute("value");
				//String actBinSum                        = binSumInward.getText();
			
				 String expBinTotalQty               = excelReader.getCellData(xlSheetName, 126, 7);
		         String expBinBaseUom                = excelReader.getCellData(xlSheetName, 127, 7);
		         //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 128, 7);
		         String expBinSum                    = excelReader.getCellData(xlSheetName, 129, 7);
		         
		         excelReader.setCellData(xlfile, xlSheetName, 126, 8, actBinTotalQty);
		         excelReader.setCellData(xlfile, xlSheetName, 127, 8, actBinBaseUom);
		         //excelReader.setCellData(xlfile, xlSheetName, 128, 8, actBinBalanceQty);
		         //excelReader.setCellData(xlfile, xlSheetName, 129, 8, actBinSum);
		         
		         int binInwardGridListCount = binInwardGridList.size();
		         
		         ArrayList<String> binInwardGridListArray = new ArrayList<String>();
		         
		         for(int i=0;i<binInwardGridListCount;i++)
		         {
		                 String data = binInwardGridList.get(i).getText();
		                 binInwardGridListArray.add(data);
		         }
		         
		         
		         String actbinInwardGridList=binInwardGridListArray.toString();
		         
		         String expbinInwardGridList=excelReader.getCellData(xlSheetName, 125, 7);
		         
		         excelReader.setCellData(xlfile, xlSheetName, 125, 8, actbinInwardGridList);
		         
		         System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
		         System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		         
		         
		         
		         boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn  
		                             && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
		         
		         String actResult = Boolean.toString(actMethod);
		         
		         excelReader.setCellData(xlfile, xlSheetName, 124, 8, actResult.toUpperCase());
			
				System.out.println("Bin Total Qty               :  " +actBinTotalQty +            "  Value Expected : "  + expBinTotalQty);
				System.out.println("Bin Base Uom                :  " +actBinBaseUom +             "  Value Expected : "  + expBinBaseUom);
				//System.out.println("Bin Balance Txt             :  " +actBinBalanceQty +          "  Value Expected : "  + expBinBalanceQty);
				//System.out.println("Bin Total To Be Adjusted    :  " + actBinSum +                "  Value Expected : "  + expBinSum);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
				binOkBtn.click();
				
				String actBinName=excelReader.getCellData(xlSheetName, 130, 7);
				
				System.out.println("Bin Column in Voucher : "+ actBinName +  "    "+select3rdRow_7thColumn.getText());
				
				excelReader.setCellData(xlfile, xlSheetName, 130, 8, select3rdRow_7thColumn.getText());
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_7thColumn));
				
				if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
						
						&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
						/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
						
						/*&& actBinSum.equalsIgnoreCase(expBinSum)*/
						
						&& select4thRow_7thColumn.getText().equalsIgnoreCase(actBinName))
					
				{
					System.out.println("Selected Bin And Ok Btn Not Enabled");
					excelReader.setCellData(xlfile, xlSheetName, 124, 9, resPass);
					return true;
				
				}
				else
				{
					System.out.println("Not Selected Bin And Ok Btn Not Enabled");
					excelReader.setCellData(xlfile, xlSheetName, 124, 9, resFail);
					return false;
				}
			  }
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 124, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				return false;
		    } 
		  }
				

		  
		  @FindBy(xpath="//input[@id='id_body_85']")
		  private static WebElement  enter_Bin;
				
		  public boolean checkOpeningStocksNewBinValuesForPreviousRowBinAfterAllocatingCurrentBinRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_7thColumn));
				select4thRow_7thColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Bin));
				enter_Bin.sendKeys(Keys.SPACE);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));		
				
				boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
				boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
				//boolean actBinAlternateCategory        = binAlternateCategoryCheckBtn.isDisplayed();
				boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
				boolean actBinPickBtn                  = binPickBtn.isDisplayed();
				boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
				boolean actBinOkBtn                    = binOkBtn.isEnabled();
						
				boolean expBinSearchTxt                = true;
				boolean expBinSearchBtn                = true;
				boolean expBinAlternateCategory        = true;
				boolean expBinAutoAllocateBtn          = true;
				boolean expBinPickBtn                  = true;
				boolean expBinCancelBtn                = true;
				boolean expBinOkBtn                    = true;
					
				System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
				System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
				System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
				System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
				System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
				System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
			
				
				String actBinTotalQty                  = binTotalQty.getAttribute("value");
				String actBinBaseUom                   = binBaseUOM.getText();
				//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]                = binBalanceTxt.getAttribute("value");
				//String actBinSum                       = binSumInward.getText();
				
				 String expBinTotalQty                 = excelReader.getCellData(xlSheetName, 133, 7);
		         String expBinBaseUom                  = excelReader.getCellData(xlSheetName, 134, 7);
		         //String expBinBalanceQty               = excelReader.getCellData(xlSheetName, 135, 7);
		         String expBinSum                      = excelReader.getCellData(xlSheetName, 136, 7);
		         
		         excelReader.setCellData(xlfile, xlSheetName, 133, 8, actBinTotalQty);
		         excelReader.setCellData(xlfile, xlSheetName, 134, 8, actBinBaseUom);
		         //excelReader.setCellData(xlfile, xlSheetName, 135, 8, actBinBalanceQty);
		         //excelReader.setCellData(xlfile, xlSheetName, 136, 8, actBinSum);
		         
		         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
		         binSearchBtn.click();
		         
		         Thread.sleep(2000);
		         
		         int binInwardGridListCount = binInwardGridList.size();
		         
		         ArrayList<String> binInwardGridListArray = new ArrayList<String>();
		         
		         for(int i=0;i<binInwardGridListCount;i++)
		         {
		                 String data = binInwardGridList.get(i).getText();
		                 binInwardGridListArray.add(data);
		         }
		         
		         
		         String actbinInwardGridList=binInwardGridListArray.toString();
		         
		         String expbinInwardGridList=excelReader.getCellData(xlSheetName, 132, 7);
		         
		         excelReader.setCellData(xlfile, xlSheetName, 132, 8, actbinInwardGridList);
		         
		         System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
		         System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		         
		         boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
		                               && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
		         
		         String actResult = Boolean.toString(actMethod);
		         
		         excelReader.setCellData(xlfile, xlSheetName, 131, 8, actResult.toUpperCase());
				
				
				 System.out.println("Bin Total Qty               :  " + actBinTotalQty +            "  Value Expected : "  + expBinTotalQty);
				 System.out.println("Bin Base Uom                :  " + actBinBaseUom +             "  Value Expected : "  + expBinBaseUom);
				 //System.out.println("Bin Balance Txt             :  " + actBinBalanceQty +          "  Value Expected : "  + expBinBalanceQty);
				
				 //System.out.println("Bin Total To Be Adjusted    :  " + actBinSum  +                "  Value Expected : "  + expBinSum);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
				binCancelBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_9thColumn));
				select4thRow_9thColumn.click();
				
				String actBinName                    = select4thRow_7thColumn.getText();
			    String expBinName                    = excelReader.getCellData(xlSheetName, 137, 7);
			    
			    excelReader.setCellData(xlfile, xlSheetName, 137, 8, actBinName); 
			    	
				System.out.println("Bin Column in Voucher       : " + actBinName +                "  Value Expected : " + expBinName);
			
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_7thColumn));
						
				if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
						
						&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
						/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
						
						/*&& actBinSum.equalsIgnoreCase(expBinSum)*/
						
						&& actBinName.equalsIgnoreCase(expBinName))	
				{
					System.out.println("Selected Bin And Ok Btn Not Enabled");
					excelReader.setCellData(xlfile, xlSheetName, 131, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Not Selected Bin And Ok Btn Not Enabled");
					excelReader.setCellData(xlfile, xlSheetName, 131, 9, resFail);
					return false;
				}	
			  }
			catch (Exception e) 
		    {
				excelReader.setExceptionInExcel(xlfile, xlSheetName, 131, 10, e.getMessage());
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				return false;
		    } 
			}
			

		   // Delete row For Bin Validation
		   public boolean checkOpeningStocksNewDeleteRowBin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		   {
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
			
			 try
			 {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
				fourthRowIndex.click();
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
				deleteRowBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
				thirdRowIndex.click();
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
				deleteRowBtn.click();
				
				String actBinColumnR3GetText=select3rdRow_7thColumn.getText();
				System.out.println("actBinColumnR3GetText  :  "+actBinColumnR3GetText);
				
				boolean actBinColumnAfterDeleteRow=select3rdRow_7thColumn.getText().isEmpty();
				boolean expBonColumnAfterDeleteRow=true;
				
				String actResult = Boolean.toString(actBinColumnAfterDeleteRow);
				
				excelReader.setCellData(xlfile, xlSheetName, 138, 8, actResult.toUpperCase());

				System.out.println("Bin Column after Delete Row Value Actual     :  " + actBinColumnAfterDeleteRow +   " Value Expected : " + expBonColumnAfterDeleteRow);
					
				if(actBinColumnAfterDeleteRow==expBonColumnAfterDeleteRow)
				{
					System.out.println("Test Pass  deleted row Working  ");
					excelReader.setCellData(xlfile, xlSheetName, 138, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail Not Deleted Row");
					excelReader.setCellData(xlfile, xlSheetName, 138, 9, resPass);
					return false;
				}
			  }
			 catch (Exception e) 
			 {
				 excelReader.setExceptionInExcel(xlfile, xlSheetName, 138, 10, e.getMessage());
				 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				 return false;
			 } 
			}
			
		   
			public boolean checkOpeningStocksNewBinQuantityAfterAlocatingAndDeleting() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
			  excelReader=new ExcelReader(POJOUtility.getExcelPath());
			  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
			  try
			  {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
				select3rdRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemcount=itemListCount.size();
				
				System.err.println(itemcount);
					
				for(int i=0 ; i < itemcount ;i++)
				{
					String data=itemListCount.get(i).getText();
					
					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 139, 6)))
					{
						itemListCount.get(i).click();
						break;
					}
				}
					
				enter_ItemTxt.sendKeys(Keys.TAB);	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.click();
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.click();
				enter_Quantity.clear();
				enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 140, 6));
				enter_Quantity.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
				enter_Rate.click();
				enter_Rate.clear();
				enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 141, 6));
				enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

				boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
				boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
				boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
				boolean actBinPickBtn                  = binPickBtn.isDisplayed();
				boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
				boolean actBinOkBtn                    = binOkBtn.isEnabled();
						
				boolean expBinSearchTxt                = true;
				boolean expBinSearchBtn                = true;
				boolean expBinAutoAllocateBtn          = true;
				boolean expBinPickBtn                  = true;
				boolean expBinCancelBtn                = true;
				boolean expBinOkBtn                    = true;
					
				System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
				System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
				System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
				System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
				System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
				System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
				
			

		        
		        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
				binSearchBtn.click();
				
				Thread.sleep(2000);
				
		        int binInwardGridListCount = binInwardGridList.size();
		        
		        ArrayList<String> binInwardGridListArray = new ArrayList<String>();
		        
		        for(int i=0;i<binInwardGridListCount;i++)
		        {
		                String data = binInwardGridList.get(i).getText();
		                binInwardGridListArray.add(data);
		        }
		        
		        
		        String actbinInwardGridList=binInwardGridListArray.toString();
		        
		        String expbinInwardGridList=excelReader.getCellData(xlSheetName, 140, 7);
		        
		        excelReader.setCellData(xlfile, xlSheetName, 140, 8, actbinInwardGridList);
		        
		        System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
		        System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		        
		        boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
		                            && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
		        
		        String actResult = Boolean.toString(actMethod);
		        
		        excelReader.setCellData(xlfile, xlSheetName, 139, 8, actResult.toUpperCase());
		        
		        String actBinTotalQty             = binTotalQty.getAttribute("value");
				String actBinBaseUom              = binBaseUOM.getText();
				//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]           = binBalanceTxt.getAttribute("value");
				//String actBinSum                  = binSumInward.getText();
				
				String expBinTotalQty               = excelReader.getCellData(xlSheetName, 141, 7);
		        String expBinBaseUom                = excelReader.getCellData(xlSheetName, 142, 7);
		        //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 143, 7);
		        String expBinSum                    = excelReader.getCellData(xlSheetName, 144, 7);
		        
		        excelReader.setCellData(xlfile, xlSheetName, 141, 8, actBinTotalQty);
		        excelReader.setCellData(xlfile, xlSheetName, 142, 8, actBinBaseUom);
		        //excelReader.setCellData(xlfile, xlSheetName, 143, 8, actBinBalanceQty);
		        //excelReader.setCellData(xlfile, xlSheetName, 144, 8, actBinSum);
				
				System.out.println("Bin Total Qty               :  " +actBinTotalQty +            "  Value Expected : "  + expBinTotalQty);
				System.out.println("Bin Base Uom                :  " +actBinBaseUom +             "  Value Expected : "  + expBinBaseUom);
				//System.out.println("Bin Balance Txt             :  " +actBinBalanceQty +          "  Value Expected : "  + expBinBalanceQty);
				
				//System.out.println("Bin Total To Be Adjusted    :  " + actBinSum +                "  Value Expected : "  + expBinSum);
						
				if(actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
						
						&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
						/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
						
						/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
				{
					
					System.out.println("Test Pass : Bin Popup options Are As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 139, 9, resPass);
					
					return true;
				}
				else
				{
					System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 139, 9, resFail);
					
					return false;
				}
			  }
			  catch (Exception e) 
			  {
				  	excelReader.setExceptionInExcel(xlfile, xlSheetName, 139, 10, e.getMessage());
				  	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  	return false;
			  }  
		  }
			
			  public boolean checkOpeningStocksNewVoucherWithInputingAllocateQtyMoreThanAvailableQty() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
				 try
				 {
					 Thread.sleep(2000);
						
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
					 binselect2ndRow_8thColumn.click();
					 
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ToBeAllocateTxt));
					 enter_ToBeAllocateTxt.sendKeys(excelReader.getCellData(xlSheetName, 145, 6));
					 enter_ToBeAllocateTxt.sendKeys(Keys.TAB);
					 
					 int binInwardGridListCount = binInwardGridList.size();
				        
					 ArrayList<String> binInwardGridListArray = new ArrayList<String>();
					 
					 for(int i=0;i<binInwardGridListCount;i++)
					 {
						 String data = binInwardGridList.get(i).getText();
						 binInwardGridListArray.add(data);
					 }	
				        	
				        
					 String actbinInwardGridList=binInwardGridListArray.toString();
					 
					 String expbinInwardGridList=excelReader.getCellData(xlSheetName, 146, 7);
					 
					 excelReader.setCellData(xlfile, xlSheetName, 146, 8, actbinInwardGridList);
					 
					 System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
					 System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
					 	
					 
					 if(actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList))
					 {
						 System.out.println("Test Pass : Bin Popup options Are As Expected");
						 excelReader.setCellData(xlfile, xlSheetName, 145, 9, resPass);
						 
						 return true;
					 }
					 else
					 {
						 System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
						 excelReader.setCellData(xlfile, xlSheetName, 145, 9, resFail);
						
						 return false;
					 }
				 }
				 catch (Exception e) 
				 {			 
					 excelReader.setExceptionInExcel(xlfile, xlSheetName, 145, 10, e.getMessage());
					 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					 return false;
				 } 
			  }
			  
			  
			  
			  
			  public boolean checkOpeningStocksNewVoucherWithInputingThroughAllocateQty() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
				 try
				 {
					 Thread.sleep(2000);
						
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
					 binAutoAllocateBtn.click();
					 
					 int binInwardGridListCount = binInwardGridList.size();
				        
					 ArrayList<String> binInwardGridListArray = new ArrayList<String>();
					 
					 for(int i=0;i<binInwardGridListCount;i++)
					 {
						 String data = binInwardGridList.get(i).getText();
						 binInwardGridListArray.add(data);
					 }	
				        	
				        
					 String actbinInwardGridList=binInwardGridListArray.toString();
					 
					 String expbinInwardGridList=excelReader.getCellData(xlSheetName, 148, 7);
					 
					 excelReader.setCellData(xlfile, xlSheetName, 148, 8, actbinInwardGridList);
					 
					 System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
					 System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
					 
					 if(actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList))
					 {
						 System.out.println("Test Pass : Bin Popup options Are As Expected");
						 excelReader.setCellData(xlfile, xlSheetName, 147, 9, resPass);
						 
						 Status=true;
						 return true;
					 }
					 else
					 {
						 System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
						 excelReader.setCellData(xlfile, xlSheetName, 147, 9, resFail);
						
						 Status=false;
						 return false;
					 }
				 }
				 catch (Exception e) 
				 {
					 excelReader.setExceptionInExcel(xlfile, xlSheetName, 147, 10, e.getMessage());
					 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					 return false;
				 } 
			  }
			  
			  
			  @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr/td")
			  private static List<WebElement> voucherGridBodyList;
			  
		  public boolean checkOpeningStocksNewVoucherBinAutoAllocationForBinSplittingInThirdRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		  
			
			
			try
			{
				System.err.println(" Status  : "+Status);
				
				if(Status==true)
				{
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
					 binOkBtn.click();
					 
					 Thread.sleep(2000);
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_9thColumn));
					 select4thRow_9thColumn.click();
					
					 
					 int voucherGridBodyListCount = voucherGridBodyList.size();
					 
					 ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
					 
					 for(int i=10;i<voucherGridBodyListCount;i++)
					 {
						 String data = voucherGridBodyList.get(i).getText();
						 voucherGridBodyListArray.add(data);
					 }
					 
					 String actvoucherGridBodyList=voucherGridBodyListArray.toString();
					 
					 String expvoucherGridBodyList=excelReader.getCellData(xlSheetName, 150, 7);
					 
					 excelReader.setCellData(xlfile, xlSheetName, 150, 8, actvoucherGridBodyList);
					 
					 System.out.println("voucherGridBodyList Actual   : " + actvoucherGridBodyList);
					 System.out.println("voucherGridBodyList Expected : " + expvoucherGridBodyList);
				 
					 if(actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
					 {
						 System.out.println("Auto Allocate Spiltted Bin ");
						 
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
						 fourthRowIndex.click();
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
						 deleteRowBtn.click();
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
						 thirdRowIndex.click();
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
						 deleteRowBtn.click();
						 excelReader.setCellData(xlfile, xlSheetName, 149, 9, resPass);
						 return true;
					 }
					 else
					 {
						 System.out.println("Auto Allocate Did not Spilt Bin ");
						 
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
						 binCancelBtn.click();
						 
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_9thColumn));
						 select3rdRow_9thColumn.click();
						 
						 Thread.sleep(2000);
						 
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
						 fourthRowIndex.click();
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
						 deleteRowBtn.click();
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
						 thirdRowIndex.click();
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
						 deleteRowBtn.click();
						 
						 excelReader.setCellData(xlfile, xlSheetName, 149, 9, resFail);
						 
						 return false;
					 }
				}
				else
				{
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
					 binCancelBtn.click();
					 
					 Thread.sleep(2000);
					 
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_9thColumn));
					 select3rdRow_9thColumn.click();
						
					 Thread.sleep(2000);
					 
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
					 fourthRowIndex.click();
						
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
					 deleteRowBtn.click();
						
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
					 thirdRowIndex.click();
						
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
					 deleteRowBtn.click();
					 
					 System.out.println("Auto Allocate Did not Spilt Bin ");
					 excelReader.setCellData(xlfile, xlSheetName, 149, 9, resFail);
					return false;
				}
			}
			 catch (Exception e) 
			 {
				 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
				 binCancelBtn.click();*/
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_9thColumn));
				 select3rdRow_9thColumn.click();
					
				 Thread.sleep(2000);
				 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
				 fourthRowIndex.click();
					
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
				 deleteRowBtn.click();
					
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
				 thirdRowIndex.click();
					
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
				 deleteRowBtn.click();
				
				 excelReader.setExceptionInExcel(xlfile, xlSheetName, 149, 10, e.getMessage());
				 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				 return false;
			 } 
		  }
		  
		  
		  public boolean checkOpeningStocksNewVoucherBinWithManualInputQtyInBinPopForBinSplittingInThirdRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		
			
				try
				{	
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_9thColumn));
					select2ndRow_9thColumn.click();
					
					Thread.sleep(2000);

					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
					enter_ItemTxt.sendKeys(Keys.SPACE);
					
					int itemcount=itemListCount.size();
					
					System.err.println(itemcount);
						
					for(int i=0 ; i < itemcount ;i++)
					{
						String data=itemListCount.get(i).getText();
						
						if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 151, 6)))
						{
							itemListCount.get(i).click();
							
							break;
						}
					}
						
					enter_ItemTxt.sendKeys(Keys.TAB);	
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
					enter_UnitTxt.click();
					enter_UnitTxt.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 152, 6));
					
					enter_Quantity.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 153, 6));
					
					enter_Rate.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					enter_Gross.sendKeys(Keys.TAB);
							
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
					
					boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
					boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
					boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
					boolean actBinPickBtn                  = binPickBtn.isDisplayed();
					boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
					boolean actBinOkBtn                    = binOkBtn.isEnabled();
							
					boolean expBinSearchTxt                = true;
					boolean expBinSearchBtn                = true;
					boolean expBinAutoAllocateBtn          = true;
					boolean expBinPickBtn                  = true;
					boolean expBinCancelBtn                = true;
					boolean expBinOkBtn                    = true;
						
					System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
					
					
					String actBinTotalQty=binTotalQty.getAttribute("value");
					String actBinBaseUom=binBaseUOM.getText();
					//String actbinBalanceTxt =binBalanceTxt.getAttribute("value");
					
					
					//String actBinSum=binSumInward.getText();
					
					
					String expBinTotalQty               = excelReader.getCellData(xlSheetName, 153, 7);
		            String expBinBaseUom                = excelReader.getCellData(xlSheetName, 154, 7);
		            //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 155, 7);
		            String expBinSum                    = excelReader.getCellData(xlSheetName, 156, 7);
		            
		            excelReader.setCellData(xlfile, xlSheetName, 153, 8, actBinTotalQty);
		            excelReader.setCellData(xlfile, xlSheetName, 154, 8, actBinBaseUom);
		            //excelReader.setCellData(xlfile, xlSheetName, 155, 8, actBinBalanceQty);
		           // excelReader.setCellData(xlfile, xlSheetName, 156, 8, actBinSum);
					
		            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					binSearchBtn.click();
					
					Thread.sleep(2000);
					
					int binInwardGridListCount = binInwardGridList.size();
		            
		            ArrayList<String> binInwardGridListArray = new ArrayList<String>();
		            
		            for(int i=0;i<binInwardGridListCount;i++)
		            {
		                    String data = binInwardGridList.get(i).getText();
		                    binInwardGridListArray.add(data);
		            }
		            
		            
		            String actbinInwardGridList=binInwardGridListArray.toString();
		            
		            String expbinInwardGridList=excelReader.getCellData(xlSheetName, 152, 7);
		            
		            excelReader.setCellData(xlfile, xlSheetName, 152, 8, actbinInwardGridList);
		            
		            System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
		            System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		            
		            
		            boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
		                                        && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
		            
		            String actResult = Boolean.toString(actMethod);
		            
		            excelReader.setCellData(xlfile, xlSheetName, 151, 8, actResult.toUpperCase());

					System.out.println("Bin Total Qty              :  " + actBinTotalQty   + "  " + expBinTotalQty);
					System.out.println("Bin Base Uom               :  " + actBinBaseUom    + "  " + expBinBaseUom);
					//System.out.println("Bin Balance Txt            :  " + actBinBalanceQty + "  " + expBinBalanceQty);
					//System.out.println("Bin Total Sum              :  " + actBinSum        + "   " + expBinSum);
								
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
					binAutoAllocateBtn.click();	
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
					binselect2ndRow_8thColumn.click();
					
					enter_ToBeAllocateTxt.sendKeys(excelReader.getCellData(xlSheetName, 154, 6));
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
					binselect3rdRow_8thColumn.click();
					
					enter_ToBeAllocateTxt.sendKeys(excelReader.getCellData(xlSheetName, 155, 6));
					
					enter_ToBeAllocateTxt.sendKeys(Keys.TAB);
					

					
					String actBinToBeAlloctionValueOnClickOnAutoAllocate2R = binselect2ndRow_8thColumn.getText();
					String actBinToBeAlloctionValueOnClickOnAutoAllocate3R = binselect3rdRow_8thColumn.getText();
						
					String expBinToBeAlloctionValueOnClickOnAutoAllocate2R = excelReader.getCellData(xlSheetName, 157, 7);
					String expBinToBeAlloctionValueOnClickOnAutoAllocate3R = excelReader.getCellData(xlSheetName, 158, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 157, 8, actBinToBeAlloctionValueOnClickOnAutoAllocate2R);
					excelReader.setCellData(xlfile, xlSheetName, 158, 8, actBinToBeAlloctionValueOnClickOnAutoAllocate3R);
					
					System.out.println("Row 2 To Be Allocated Value Actual :  " + actBinToBeAlloctionValueOnClickOnAutoAllocate2R + " Value Actual : " + expBinToBeAlloctionValueOnClickOnAutoAllocate2R);
					System.out.println("Row 3 To Be Allocated Value Actual  : " + actBinToBeAlloctionValueOnClickOnAutoAllocate3R + " Value Actual : " + expBinToBeAlloctionValueOnClickOnAutoAllocate3R);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
					binOkBtn.click();	
					
					if(actMethod== true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
							
							&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
							/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
							
							/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
					{
						excelReader.setCellData(xlfile, xlSheetName, 151, 9, resPass);
						System.out.println("Manual Spilt Bin ");
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, xlSheetName, 151, 9, resFail);
						System.out.println("Manual Did not Spilt Bin ");
						return false;
					}
				}
				 catch (Exception e) 
				 {
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
					 binCancelBtn.click();	
						
					 excelReader.setExceptionInExcel(xlfile, xlSheetName, 151, 10, e.getMessage());
					 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					 return false;
				 } 
		  	}

		  

		  public boolean checkOpeningStocksNewVoucherConsumeFullCapacityInFifthRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		
			
				try
				{	
					Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select5thRow_1stColumn));
					select5thRow_1stColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
					enter_ItemTxt.sendKeys(Keys.SPACE);
					
					int itemcount=itemListCount.size();
					
					System.err.println(itemcount);
						
					for(int i=0 ; i < itemcount ;i++)
					{
						String data=itemListCount.get(i).getText();
						
						if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 159, 6)))
						{
							itemListCount.get(i).click();
							
							break;
						}
					}
						
					enter_ItemTxt.sendKeys(Keys.TAB);	
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
					enter_UnitTxt.sendKeys(Keys.END);
					enter_UnitTxt.sendKeys(Keys.SHIFT,Keys.HOME);
					enter_UnitTxt.sendKeys(Keys.BACK_SPACE);
					Thread.sleep(2000);
					enter_UnitTxt.sendKeys(excelReader.getCellData(xlSheetName, 160, 6));
					Thread.sleep(2000);
					enter_UnitTxt.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 161, 6));
					
					enter_Quantity.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 162, 6));
					
					enter_Rate.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					enter_Gross.sendKeys(Keys.TAB);
							
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
					
					boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
					boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
					boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
					boolean actBinPickBtn                  = binPickBtn.isDisplayed();
					boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
					boolean actBinOkBtn                    = binOkBtn.isEnabled();
							
					boolean expBinSearchTxt                = true;
					boolean expBinSearchBtn                = true;
					boolean expBinAlternateCategory        = true;
					boolean expBinAutoAllocateBtn          = true;
					boolean expBinPickBtn                  = true;
					boolean expBinCancelBtn                = true;
					boolean expBinOkBtn                    = true;
						
					System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
					
					
					String expBinGroupNameR1="BG1";
					
					String expBinNameR2="Bin5";
					String expBinStockR2="0.00";
					String expBinCapacityR2="98.00";
					String expBinLoadR2="90.00";
					String expBinFreeSpaceR2="8.00";
					String expBinFreeQtyR2="8.00";
					String expBinToBeAllocatedR2="0.00";
					
				
					
					String actBinTotalQty=binTotalQty.getAttribute("value");
					String actBinBaseUom=binBaseUOM.getText();
					//String actbinBalanceTxt =binBalanceTxt.getAttribute("value");
					//String actBinSum=binSumInward.getText();
					
					 String expBinTotalQty               = excelReader.getCellData(xlSheetName, 161, 7);
		             String expBinBaseUom                = excelReader.getCellData(xlSheetName, 162, 7);
		             //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 163, 7);
		             String expBinSum                    = excelReader.getCellData(xlSheetName, 164, 7);
		             
		             excelReader.setCellData(xlfile, xlSheetName, 161, 8, actBinTotalQty);
		             excelReader.setCellData(xlfile, xlSheetName, 162, 8, actBinBaseUom);
		             //excelReader.setCellData(xlfile, xlSheetName, 163, 8, actBinBalanceQty);
		             //excelReader.setCellData(xlfile, xlSheetName, 164, 8, actBinSum);

		             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					 binSearchBtn.click();
					 
					 Thread.sleep(2000);
					
					 int binInwardGridListCount = binInwardGridList.size();
		             
		             ArrayList<String> binInwardGridListArray = new ArrayList<String>();
		             
		             for(int i=0;i<binInwardGridListCount;i++)
		             {
		                     String data = binInwardGridList.get(i).getText();
		                     binInwardGridListArray.add(data);
		             }
		             
		             
		             String actbinInwardGridList=binInwardGridListArray.toString();
		             
		             String expbinInwardGridList=excelReader.getCellData(xlSheetName, 160, 7);
		             
		             excelReader.setCellData(xlfile, xlSheetName, 160, 8, actbinInwardGridList);
		             
		             System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
		             System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		             
		             
		             boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
		                                       && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
		             
		             String actResult = Boolean.toString(actMethod);
		             
		             excelReader.setCellData(xlfile, xlSheetName, 159, 8, actResult.toUpperCase());

					
					
					
					System.out.println("Bin Total Qty              :  " +actBinTotalQty +"  "+expBinTotalQty);
					System.out.println("Bin Base Uom               :  " +actBinBaseUom +"  "+expBinBaseUom);
					//System.out.println("Bin Balance Txt            :  " +actBinBalanceQty +"  "+expBinBalanceQty);
					
					//System.out.println("Bin Total Sum :  " + actBinSum +"   " + expBinSum);
								
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
					binAutoAllocateBtn.click();	
					
					ArrayList<String> binInwardGridListArrayAA = new ArrayList<String>();
					
					for(int i=0;i<binInwardGridListCount;i++)
		            {
		                    String data = binInwardGridList.get(i).getText();
		                    binInwardGridListArrayAA.add(data);
		            }
		            
		            
		            String actbinInwardGridListAA=binInwardGridListArrayAA.toString();
		            
		            String expbinInwardGridListAA=excelReader.getCellData(xlSheetName, 165, 7);
		            
		            excelReader.setCellData(xlfile, xlSheetName, 165, 8, actbinInwardGridListAA);
		            
		            System.out.println("ActbinInwardGridList AA : " + actbinInwardGridListAA);
		            System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
					
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
					binOkBtn.click();	
					
					if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && actbinInwardGridListAA.equalsIgnoreCase(expbinInwardGridListAA)
							
							&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
							/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
							
							/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
					{
						excelReader.setCellData(xlfile, xlSheetName, 159, 9, resPass);
						System.out.println("Manual Spilt Bin ");
						return true;
					}
					else
					{
						
						excelReader.setCellData(xlfile, xlSheetName, 159, 9, resFail);
						System.out.println("Manual Did not Spilt Bin ");
						return false;
					}
				}
				 catch (Exception e) 
				 {
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
					 binCancelBtn.click();	
						
					 String exception =e.getMessage().substring(0, 50);
					 excelReader.setExceptionInExcel(xlfile, xlSheetName, 151, 10, e.getMessage());
					 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					 return false;
				 } 
		  	}

		  

		  @FindBy(xpath="//*[@id='id_transaction_bins_grid_body']/tr")
		  private static List<WebElement> binPopUpRowCount;

		  public boolean checkOpeningStocksNewVoucherBinPopUpValuesAfterFullQtyConsumeinPreviousRows() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
						
						if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 166, 6)))
						{
							itemListCount.get(i).click();
							
							break;
						}
					}
						
					enter_ItemTxt.sendKeys(Keys.TAB);	
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
					enter_UnitTxt.click();
					enter_UnitTxt.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 167, 6));
					
					enter_Quantity.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 168, 6));
					
					enter_Rate.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					enter_Gross.sendKeys(Keys.TAB);
							
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
					
					boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
					boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
					boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
					boolean actBinPickBtn                  = binPickBtn.isDisplayed();
					boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
					boolean actBinOkBtn                    = binOkBtn.isEnabled();
							
					boolean expBinSearchTxt                = true;
					boolean expBinSearchBtn                = true;
					boolean expBinAutoAllocateBtn          = true;
					boolean expBinPickBtn                  = true;
					boolean expBinCancelBtn                = true;
					boolean expBinOkBtn                    = true;
						
					System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
					
					boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn && actBinAutoAllocateBtn==expBinAutoAllocateBtn
										&& actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn && actBinOkBtn==expBinOkBtn;
					
					String actResult = Boolean.toString(actMethod);
					
					excelReader.setCellData(xlfile, xlSheetName, 166, 8, actResult.toUpperCase());
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					binSearchBtn.click();
					
					Thread.sleep(2000);
					
					int count = binPopUpRowCount.size();
					
					String actbinPopUpRowCount = Integer.toString(count);
					
					String expbinPopUpRowCount = excelReader.getCellData(xlSheetName, 167, 7);
					
					System.out.println("binPopUpRowCount  Actual : "+actbinPopUpRowCount + " Value Expected : " + expbinPopUpRowCount);
					
					excelReader.setCellData(xlfile, xlSheetName, 167, 8, actbinPopUpRowCount);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
					binCancelBtn.click();	
					
					Thread.sleep(2000);
					
					for(int i=1;i<=4;i++)
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
						thirdRowIndex.click();	
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
						deleteRowBtn.click();	
					}
					
					if(actMethod==true && actbinPopUpRowCount.equalsIgnoreCase(expbinPopUpRowCount))
					{
						excelReader.setCellData(xlfile, xlSheetName, 166, 9, resPass);
						System.out.println("Manual Spilt Bin ");
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, xlSheetName, 166, 9, resFail);
						System.out.println("Manual Did not Spilt Bin ");
						return false;
					}
				}
				catch (Exception e) 
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
					binCancelBtn.click();	
					
					for(int i=1;i<=4;i++)
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
						thirdRowIndex.click();	
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
						deleteRowBtn.click();	
					}	
					
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 166, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
		  }

		  
			
		  public boolean checkOpeningStocksNewVoucherWithRMAUnitsAndMandatoryMessageInThirdRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
			
			try
			{
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_9thColumn));
				select2ndRow_9thColumn.click();
					
				Thread.sleep(2000);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
				enter_ItemTxt.click();
				enter_ItemTxt.sendKeys(Keys.END);
				enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
				enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
				enter_ItemTxt.sendKeys(Keys.SPACE);
				
				int itemcount = itemListCount.size();
				
				System.err.println(itemcount);
					
				for(int i=0 ; i < itemcount ;i++)
				{
					String data = itemListCount.get(i).getText();
					
					if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 169, 6)))
					{
						itemListCount.get(i).click();
						break;
					}
				}
					
				enter_ItemTxt.sendKeys(Keys.TAB);	
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				String actUnitsColumnSelectingRMAProduct = select3rdRow_2ndColumn.getText();
				String expUnitsColumnSelectingRMAProduct = excelReader.getCellData(xlSheetName, 170, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 170, 8, actUnitsColumnSelectingRMAProduct);
				
				System.out.println("Units Column Value is display On Select       : " + actUnitsColumnSelectingRMAProduct +  "  Value Expected : " + expUnitsColumnSelectingRMAProduct);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				String expValidationMessage=excelReader.getCellData(xlSheetName, 171, 7);
				
				String actValidationMessage=checkValidationMessage(expValidationMessage);
				
				excelReader.setCellData(xlfile, xlSheetName, 171, 8, actValidationMessage);
				
				System.out.println("Units Column Value is display On Select       : " + actValidationMessage +  "  Value Expected : " + expValidationMessage);
				
				if(actUnitsColumnSelectingRMAProduct.equalsIgnoreCase(expUnitsColumnSelectingRMAProduct)
					 &&	actValidationMessage.equalsIgnoreCase(expValidationMessage))
				{
					System.out.println("Test Pass : error Message Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 169, 9, resPass);	
					return true;
				}
				else
				{
					System.out.println("Test Fail : error Message Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 169, 9, resFail);
					return false;
				}
			  }
			 catch (Exception e) 
			 {
				 
				 excelReader.setExceptionInExcel(xlfile, xlSheetName, 169, 10, e.getMessage());
				 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				 return false;
			 } 
			}
			
		  
			
		  
		  
		  @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
		  private static WebElement  clickOnUnits;
		  
		  
		  public boolean checkOpeningStocksNewVoucherRmaWithZeroQuantity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
				
			 try
			 {
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnUnits));
				clickOnUnits.click();
				enter_UnitTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
				enter_Quantity.click();
				enter_Quantity.clear();
				enter_Quantity.sendKeys(Keys.TAB);
						
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		        enter_Rate.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
				enter_Gross.sendKeys(Keys.TAB);
				
				String expValidationMessage     = excelReader.getCellData(xlSheetName, 173, 7);
				
				String actValidationMessage     = checkValidationMessage(expValidationMessage);
				
				excelReader.setCellData(xlfile, xlSheetName, 173, 8, actValidationMessage);
				
				System.out.println("Message On Save Rma With Zero Qty     :  " + actValidationMessage +" Value Expected : " + expValidationMessage);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaCancelBtn));
				rmaCancelBtn.click();
					
				if(actValidationMessage.equalsIgnoreCase(expValidationMessage))
				{
					System.out.println("Test Pass : error Message Displayed");		
					excelReader.setCellData(xlfile, xlSheetName, 172, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : error Message Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 172, 9, resFail);
					return false;
				}
			 }
			 catch (Exception e) 
			 {
				 excelReader.setExceptionInExcel(xlfile, xlSheetName, 172, 10, e.getMessage());
				 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				 return false;
			 } 
			}

		  
		  
		    public boolean checkRMAPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
					
					if(actMethod==true)
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
					
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 174, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
			}
			
		  
		    public boolean checkAddButtonInRmaPageWithSelectingSerialNumbers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
					rmaAddBtn.click();
					
					getWaitForAlert();
					
					String actAlert=getAlert().getText();
					String expAlert=excelReader.getCellData(xlSheetName, 177, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 177, 8, actAlert);
					
					System.out.println("************************************* checkAddButtonInRmaWithEmptyInputs  *********************************");
					
					System.out.println("Alert On Clicking Add With Empty Inputs   : "+actAlert	   +"  Value Expected : "+expAlert);
					
					if(actAlert.equalsIgnoreCase(expAlert))
					{
						System.out.println("Test Pass : alert Dipalyed");
						excelReader.setCellData(xlfile, xlSheetName, 176, 9, resPass);
						getAlert().accept();
						return true;
					}
					else
					{
						System.out.println("Test Fail : Alert Not Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 176, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 176, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
			}
		    
		    
		    public boolean checkOKButtonInRmaPageWithoutSelectingSerialNumbers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
					rmaOkBtn.click();
					
					getWaitForAlert();
					
					String actAlert=getAlert().getText();
					
					String expAlert=excelReader.getCellData(xlSheetName, 179, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 179, 8, actAlert);
				
			        System.out.println("Test Pass : alert Dipalyed");
					
					getAlert().accept();
						
					getWaitForAlert();
					
					String actAlert1=getAlert().getText();
					
					String expAlert1=excelReader.getCellData(xlSheetName, 180, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 180, 8, actAlert1);
					
					System.out.println("************************************* checkOKButtonInRmaWithEmptyInputs  *********************************");
					
					System.out.println("Alert On Clicking Ok With Empty Inputs   : "+actAlert	   +"  Value Expected : "+expAlert);
					
			        System.out.println("************************************* checkOKButtonInRmaWithEmptyInputs  *********************************");
					
					System.out.println("Alert On Clicking Ok With Empty Inputs   : "+actAlert1	   +"  Value Expected : "+expAlert1);
					
			
					if(actAlert.equalsIgnoreCase(expAlert) && actAlert1.equalsIgnoreCase(expAlert1))
					{
					
						System.out.println("Alert Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 178, 9, resPass);
						getAlert().accept();
						
						return true;
					}
					else
					{
						System.out.println("Test Fail : Alert Not Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 178, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 178, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
				
			}
		    
		    
		    public boolean checkCancelButtonInRmaPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaCancelBtn));
				rmaCancelBtn.click();
				
				try
				{
					if(rmaSerialNumberTxtField.isDisplayed())
					{
						System.out.println("test Fail : rma Cancel Is not Working");
						excelReader.setCellData(xlfile, xlSheetName, 181, 9, resFail);
						return false;
					}
					else
					{
						System.out.println("test  Pass : rma Cancel Is Working");
						excelReader.setCellData(xlfile, xlSheetName, 181, 9, resPass);
						return true;
					}
				}
				catch(Exception e)
				{
					System.out.println("test  Pass : rma Cancel Is Working");
					excelReader.setCellData(xlfile, xlSheetName, 181, 9, resPass);
					return true;
				}
			}
		    

		    @FindBy (xpath="//input[@id='RM_RMANO']")
			private static WebElement rma_EnterRMA;

		    @FindBy (xpath="//td[@id='RMA_Table_col_1-4']//i[@class='icon-clear icon-font']")
		    private static WebElement rmaTableRow1ClearBtn;
		    
		    @FindBy(xpath="//*[@id='RMA_Table_body']/tr/td[2]")
		    private static List<WebElement> rmapopupBodyGrid;
		    
		    public boolean checkRmaPageWithSelectingPartialSerialNumberLessThanInputedQtyInVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
					select3rdRow_5thColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					enter_Gross.click();
					enter_Gross.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
					rmaSerialNumberTxtField.click();
					rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 182, 6));
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
					rmaAddBtn.click();
					
					int rmapopupBodyGridCount = rmapopupBodyGrid.size();
					
					ArrayList<String> rmapopupBodyGridArray = new ArrayList<String>();
					
					for(int i=0;i<rmapopupBodyGridCount;i++)
					{
						String data = rmapopupBodyGrid.get(i).getText();
						rmapopupBodyGridArray.add(data);
					}
					
					
					System.err.println("rmapopupBodyGrid : "+ rmapopupBodyGridArray);
							
					// Actual
					String  actRmaRow1=rma_EnterRMA.getAttribute("value");
					String 	actRmaRow2=rmaTableRow2Column1.getText();
					String 	actRmaRow3=rmaTableRow3Column1.getText();
					
					// Expected
					String  expRmaRow1=excelReader.getCellData(xlSheetName, 183, 7);
					String 	expRmaRow2=excelReader.getCellData(xlSheetName, 184, 7);
					String 	expRmaRow3=excelReader.getCellData(xlSheetName, 185, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 183, 8, actRmaRow1);
					excelReader.setCellData(xlfile, xlSheetName, 184, 8, actRmaRow2);
					excelReader.setCellData(xlfile, xlSheetName, 185, 8, actRmaRow3);
					
					System.out.println("************************************* checkRmaWithSerialNumbersNotCompletely  *********************************");
					
					System.out.println("Rma Row 1 Serial Number   : "+actRmaRow1	   +"  Value Expected : "+expRmaRow1);
					System.out.println("Rma Row 2 Serial Number   : "+actRmaRow2	   +"  Value Expected : "+expRmaRow2);
					System.out.println("Rma Row 3 Serial Number   : "+actRmaRow3	   +"  Value Expected : "+expRmaRow3);
					
					if(actRmaRow1.equalsIgnoreCase(expRmaRow1) && actRmaRow2.equalsIgnoreCase(expRmaRow2)
							&& actRmaRow3.equalsIgnoreCase(expRmaRow3))
					{
						System.out.println("Test Pass : 3 Rows Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 182, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : 3 Rows NOT Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 182, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 182, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
			}
		    
		    
		    public boolean checkOkButtonInRmaPageWithSelectionOfPartialSerialNumbers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
					rmaOkBtn.click();
					
					getWaitForAlert();
					
					String actAlert=getAlert().getText();
					String expAlert=excelReader.getCellData(xlSheetName, 187, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 187, 8, actAlert);
					
					System.out.println("************************************* checkOkButtonRmaWithSerialNumbersNotCompletely  *********************************");
					
					System.out.println("Alert On Clicking Ok With Empty Inputs   : "+actAlert	   +"  Value Expected : "+expAlert);
					
					getAlert().accept();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_3rdColumn));
					String actVoucherQtyR3=select3rdRow_3rdColumn.getText();
					String expVoucherQtyR3=excelReader.getCellData(xlSheetName, 188, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 188, 8, actVoucherQtyR3);
							
					System.out.println("Third Row Voucher Qty On Ok Button In Alert   : "+actVoucherQtyR3	   +"  Value Expected : "+expVoucherQtyR3);
					
					if(actAlert.equalsIgnoreCase(expAlert) && actVoucherQtyR3.equalsIgnoreCase(expVoucherQtyR3))
					{
						System.out.println("Test Pass : Alert Dipaled And Clicked On Ok");
						excelReader.setCellData(xlfile, xlSheetName, 186, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Alert Not Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 186, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 186, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
			}
			
		    
		    public boolean checkClearButtonInRmaRowSerialNumberRmaPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
						
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_3rdColumn));
					select3rdRow_3rdColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.sendKeys("5");
					enter_Quantity.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_9thColumn));
					select3rdRow_9thColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
					enter_RMA.sendKeys(Keys.SPACE);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow1ClearBtn));
					rmaTableRow1ClearBtn.click();
					
					boolean actRmavalueR1=rmaTableRow1Column1.getText().isEmpty();
					
					boolean expRmavalueR1=true;
					
					String actResult = Boolean.toString(actRmavalueR1);
					
					excelReader.setCellData(xlfile, xlSheetName, 189, 8, actResult.toUpperCase());
					
					System.out.println("************************************* checkClearButtoninRmaGrid  *********************************");
					System.out.println("Rma value In Rma Pop Up on Row Clear Button : "+actRmavalueR1+"  Value Expected : "+expRmavalueR1);
					
					if(actRmavalueR1==expRmavalueR1)
					{
						System.out.println("Test Fail : Clear Button Not Working");
						excelReader.setCellData(xlfile, xlSheetName, 189, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Pass : Clear Button Working");
						excelReader.setCellData(xlfile, xlSheetName, 189, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 189, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
			}
			
		    
		    public boolean checkClearButtonInRmaPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaClearBtn));
					rmaClearBtn.click();
					
					boolean actRmavalueR2=rmaTableRow2Column1.getText().isEmpty();
					
					boolean expRmavalueR2=true;
					
					boolean actRmavalueR3=rmaTableRow3Column1.getText().isEmpty();
					
					boolean expRmavalueR3=true;
					
					boolean actMethod = actRmavalueR2==expRmavalueR2 && actRmavalueR3==expRmavalueR3;
					
					String actResult = Boolean.toString(actMethod);
					
					excelReader.setCellData(xlfile, xlSheetName, 190, 8, actResult.toUpperCase());
					
					System.out.println("************************************* checkClearButtoninRma  *********************************");
					System.out.println("Rma value Row 2 In Rma Pop Up on Clear Button : "+actRmavalueR2+"  Value Expected : "+expRmavalueR2);
					System.out.println("Rma value Row 3 In Rma Pop Up on Clear Button : "+actRmavalueR3+"  Value Expected : "+expRmavalueR3);
					
					if(actMethod==true)
					{
						System.out.println("Test Pass : Clear Button Working");
						excelReader.setCellData(xlfile, xlSheetName, 190, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Clear Button Not Working");
						excelReader.setCellData(xlfile, xlSheetName, 190, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 190, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
				
			}
			
		    
		    public boolean checkInputTheDuplicateSerialNumbersIsAllowingInRmaPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
					rmaSerialNumberTxtField.click();
					rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 191, 6));
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
					rmaAddBtn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow1Column1));
					String actRmavalueR1=rma_EnterRMA.getAttribute("value");
					String expRmavalueR1=excelReader.getCellData(xlSheetName, 192, 7);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow2Column1));
					String actRmavalueR2=rmaTableRow2Column1.getText();
					String expRmavalueR2=excelReader.getCellData(xlSheetName, 193, 7);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
					rmaSerialNumberTxtField.click();
					rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 192, 6));
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
					rmaAddBtn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow3Column1));
					String actRmavalueR3=rmaTableRow3Column1.getText();
					String expRmavalueR3=excelReader.getCellData(xlSheetName, 194, 7);
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow4Column1));
					String actRmavalueR4=rmaTableRow4Column1.getText();
					String expRmavalueR4=excelReader.getCellData(xlSheetName, 195, 7);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
					rmaSerialNumberTxtField.click();
					rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 193, 6));
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
					rmaAddBtn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow5Column1));
					String actRmavalueR5=rmaTableRow5Column1.getText();
					String expRmavalueR5=excelReader.getCellData(xlSheetName, 196, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 192, 8, actRmavalueR1);
					excelReader.setCellData(xlfile, xlSheetName, 193, 8, actRmavalueR2);
					excelReader.setCellData(xlfile, xlSheetName, 194, 8, actRmavalueR3);
					excelReader.setCellData(xlfile, xlSheetName, 195, 8, actRmavalueR4);
					excelReader.setCellData(xlfile, xlSheetName, 196, 8, actRmavalueR5);
					
					System.out.println("************************************* checkInputingDuplicateSerialNumbers  *********************************");
					System.out.println("Rma value Row 1 In Rma Pop Up Duplicate Serial No : "+actRmavalueR1+"  Value Expected : "+expRmavalueR1);
					System.out.println("Rma value Row 2 In Rma Pop Up Duplicate Serial No : "+actRmavalueR2+"  Value Expected : "+expRmavalueR2);
					System.out.println("Rma value Row 3 In Rma Pop Up Duplicate Serial No : "+actRmavalueR3+"  Value Expected : "+expRmavalueR3);
					System.out.println("Rma value Row 4 In Rma Pop Up Duplicate Serial No : "+actRmavalueR4+"  Value Expected : "+expRmavalueR4);
					System.out.println("Rma value Row 5 In Rma Pop Up Duplicate Serial No : "+actRmavalueR5+"  Value Expected : "+expRmavalueR5);
					
					if(actRmavalueR1.equalsIgnoreCase(expRmavalueR1) && actRmavalueR2.equalsIgnoreCase(expRmavalueR2)
							&& actRmavalueR3.equalsIgnoreCase(expRmavalueR3) && actRmavalueR4.equalsIgnoreCase(expRmavalueR4)
							&& actRmavalueR5.equalsIgnoreCase(expRmavalueR5))
					{
						System.out.println("Test Pass : Duplicate data  Not Allowing");
						excelReader.setCellData(xlfile, xlSheetName, 191, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Duplicate data  Allowing");
						excelReader.setCellData(xlfile, xlSheetName, 191, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 191, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
			}
			
		    
		    public boolean checkInputSerialNumbersIsAllowingGreaterThanInputVoucherQuantity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
					rmaSerialNumberTxtField.click();
					rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 197, 6));
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
					rmaAddBtn.click();
					
					getWaitForAlert();
					
					String actAlert=getAlert().getText();
					String expAlert=excelReader.getCellData(xlSheetName, 198, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 198, 8, actAlert);
					
					System.out.println("************************************* checkInputingSerialNumbersGreaterthanQuantity  *********************************");
					
					System.out.println("Alert On Input Serial No Greater Than Qty   : "+actAlert	   +"  Value Expected : "+expAlert);
					
					getAlert().accept();
				
				
					if(actAlert.equalsIgnoreCase(expAlert))
					{
						System.out.println("Test Pass : Alert Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 197, 9, resPass);
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaClearBtn));
						rmaClearBtn.click();
						return true;
					}
					else
					{
						System.out.println("Test Fail : Alert NOT Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 197, 9, resFail);
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaClearBtn));
						rmaClearBtn.click();
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 197, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
			}
			
		    
		    
		    
		    public boolean checkInputingDifferentSerialNumbers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
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
					
					if(actRmavalueR1.equalsIgnoreCase(expRmavalueR1) && actRmavalueR2.equalsIgnoreCase(expRmavalueR2)
							&& actRmavalueR3.equalsIgnoreCase(expRmavalueR3) && actRmavalueR4.equalsIgnoreCase(expRmavalueR4)
							&& actRmavalueR5.equalsIgnoreCase(expRmavalueR5))
					{
						System.out.println("Test Pass : Allowing Different Serial numbers");
						excelReader.setCellData(xlfile, xlSheetName, 199, 9, resPass);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
						rmaOkBtn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
						enter_RMA.sendKeys(Keys.TAB);
						
						return true;
					}
					else
					{
						System.out.println("Test Fail : NOT Allowing Different Serial numbers");
						excelReader.setCellData(xlfile, xlSheetName, 199, 9, resFail);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
						rmaOkBtn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
						enter_RMA.sendKeys(Keys.TAB);
						
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 199, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
			}
			
		    
		    public boolean checkNewItemWithSameSerialNos()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
						
						if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 205, 6)))
						{
							itemListCount.get(i).click();
							
							break;
						}
					}
						
					enter_ItemTxt.sendKeys(Keys.TAB);	
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_3rdColumn));
					select4thRow_3rdColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 206, 6));
					enter_Quantity.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 207, 6));
					enter_Rate.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_9thColumn));
					select4thRow_9thColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
					rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 208, 6));
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
					rmaAddBtn.click();
					
					
					getWaitForAlert();
					String actAlert=getAlert().getText();
					String expAlert=excelReader.getCellData(xlSheetName, 206, 7);
					
					/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
					rmaOkBtn.click();*/
						
					
					
					excelReader.setCellData(xlfile, xlSheetName, 206, 8, actAlert);
					
					System.out.println("************************************* checkNewItemWithSameSerialNos  *********************************");
					System.out.println("Alert On Inputing Same Serial no : "+actAlert+"  Value Expected : "+expAlert);
					
					if (actAlert.equalsIgnoreCase(expAlert)) 
					{
						System.out.println("***Test Pass: NOT allowing Duplicates***");
						excelReader.setCellData(xlfile, xlSheetName, 205, 9, resPass);
						
						getAlert().accept();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
						rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 209, 6));
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
						rmaAddBtn.click();
						
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
						rmaOkBtn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
						enter_RMA.sendKeys(Keys.TAB);
						
						Thread.sleep(2000);
							
					     return true;
					}
					else
					{
						System.out.println("***Test Fail: allowing Duplicates***");
						excelReader.setCellData(xlfile, xlSheetName, 205, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 205, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
			}
		    
		    public boolean checkSavingVoucherByChangingVoucherQuantitySerialNumbersSame() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{	
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_3rdColumn));
					select4thRow_3rdColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 210, 6));
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
					saveBtn.click();
					
				
					String expErrorMessage=excelReader.getCellData(xlSheetName, 211, 7);
					
					String validationMessage=checkValidationMessage(expErrorMessage);
					excelReader.setCellData(xlfile, xlSheetName, 211, 8, validationMessage);
					
					System.out.println("************************************* checkSavingVoucherByChangingQuantity  *********************************");
					
					System.out.println("Message On Saving Rma With Changing Qty     :  " + validationMessage +" Value Expected : " + "TRUE");
					
					
					if (validationMessage.equalsIgnoreCase(expErrorMessage)) 
					{
						System.out.println("***Test Pass: Error Message RMA numbers and quantity do not match is Displaying***");
						excelReader.setCellData(xlfile, xlSheetName, 210, 9, resPass);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
						fourthRowIndex.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
						deleteRowBtn.click();
						
						return true;
					}
					else
					{
						System.out.println("***Test Fail: Error Message RMA numbers and quantity do not match is NOT Displaying***");
						excelReader.setCellData(xlfile, xlSheetName, 210, 9, resFail);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
						fourthRowIndex.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
						deleteRowBtn.click();
						
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 210, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
				
			}
		    
		    

		    public boolean checkInputingSerialNumbers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_9thColumn));
					select3rdRow_9thColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
					enter_RMA.sendKeys(Keys.SPACE);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaClearBtn));
					rmaClearBtn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
					rmaSerialNumberTxtField.click();
					rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 212, 6));
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
					rmaAddBtn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow1Column1));
					String actRmavalueR1=rma_EnterRMA.getAttribute("value");
					String expRmavalueR1=excelReader.getCellData(xlSheetName, 213, 7);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow2Column1));
					String actRmavalueR2=rmaTableRow2Column1.getText();
					String expRmavalueR2=excelReader.getCellData(xlSheetName, 214, 7);
								
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow3Column1));
					String actRmavalueR3=rmaTableRow3Column1.getText();
					String expRmavalueR3=excelReader.getCellData(xlSheetName, 215, 7);
							
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow4Column1));
					String actRmavalueR4=rmaTableRow4Column1.getText();
					String expRmavalueR4=excelReader.getCellData(xlSheetName, 216, 7);
							
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow5Column1));
					String actRmavalueR5=rmaTableRow5Column1.getText();
					String expRmavalueR5=excelReader.getCellData(xlSheetName, 217, 7);
					
					System.out.println("************************************* checkInputingSerialNumbers  *********************************");
					
					System.out.println("Rma value Row 1 In Rma Pop Up  : " + actRmavalueR1 + "  Value Expected : " + expRmavalueR1);
					System.out.println("Rma value Row 2 In Rma Pop Up  : " + actRmavalueR2 + "  Value Expected : " + expRmavalueR2);
					System.out.println("Rma value Row 3 In Rma Pop Up  : " + actRmavalueR3 + "  Value Expected : " + expRmavalueR3);
					System.out.println("Rma value Row 4 In Rma Pop Up  : " + actRmavalueR4 + "  Value Expected : " + expRmavalueR4);
					System.out.println("Rma value Row 5 In Rma Pop Up  : " + actRmavalueR5 + "  Value Expected : " + expRmavalueR5);
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
					rmaOkBtn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
					enter_RMA.sendKeys(Keys.TAB);
						
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_9thColumn));
					String actRMATxt=select3rdRow_9thColumn.getText();
					
					String expRMATxt=excelReader.getCellData(xlSheetName, 218, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 213, 8, actRmavalueR1);
					excelReader.setCellData(xlfile, xlSheetName, 214, 8, actRmavalueR2);
					excelReader.setCellData(xlfile, xlSheetName, 215, 8, actRmavalueR3);
					excelReader.setCellData(xlfile, xlSheetName, 216, 8, actRmavalueR4);
					excelReader.setCellData(xlfile, xlSheetName, 217, 8, actRmavalueR5);
					excelReader.setCellData(xlfile, xlSheetName, 218, 8, actRMATxt);
					
					
					if(actRmavalueR1.equalsIgnoreCase(expRmavalueR1) && actRmavalueR2.equalsIgnoreCase(expRmavalueR2)
							&& actRmavalueR3.equalsIgnoreCase(expRmavalueR3) && actRmavalueR4.equalsIgnoreCase(expRmavalueR4)
							&& actRmavalueR5.equalsIgnoreCase(expRmavalueR5)
							
							&& actRMATxt.equalsIgnoreCase(expRMATxt))
					{
						System.out.println("Test Pass : Allowing Different Serial numbers");
						excelReader.setCellData(xlfile, xlSheetName, 212, 9, resPass);
					
						return true;
					}
					else
					{
						System.out.println("Test Fail : NOT Allowing Different Serial numbers");
						excelReader.setCellData(xlfile, xlSheetName, 212, 9, resFail);
						
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 212, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 
			}
			
		    
		    
		 
			@FindBy(xpath="//input[@id='id_body_38']")
			private static WebElement  enter_RMA;

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
				exp2                   = "9.00";
				exp3                   = excelReader.getCellData(xlSheetName, 223, 7);
				
				excelReader.setCellData(xlfile, xlSheetName, 221, 8, act1);
				excelReader.setCellData(xlfile, xlSheetName, 222, 8, act2);
				excelReader.setCellData(xlfile, xlSheetName, 223, 8, act3);
				
				System.out.println("data : "+actdata+" Value Expected : "+expdata);
				
				System.out.println("act1 : "+act1+" Value Expected : "+exp1);
				System.out.println("act2 : "+act2+" Value Expected : "+exp2);
				System.out.println("act3 : "+act3+" Value Expected : "+exp3);
				
				
			
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
			
			@FindBy(xpath="//div[@id='dvHomeTransClose']//span[@class='icon-close icon-font6']")  
			private static WebElement  voucherhomeCloseBtn;
			
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
			
			
			@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_26']")
			private static WebElement  QtyAmount;
			
			@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_28']")
			private static WebElement  GrossAmount;
			
			@FindBy(xpath="//span[@class='col-xs-6 icon-expand icon-font6 no_padding_left_right theme_color-inverse']")
			private static WebElement  new_footerExpandBtn;

			
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

					if(actVoucherLoadingMessage.contains(expVoucherLoadingMessage))
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
			
			
			//Editing the Opening Stocks New Voucher

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
					
					excelReader.setCellData(xlfile, xlSheetName, 226, 8, actdocNumber);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
					wareHouseTxt.click();
			
					String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
					String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 227, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 227, 8, actOsVoucherWarehouse);
									
					Thread.sleep(2000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_footerExpandBtn));
					new_footerExpandBtn.click();
					
					String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
					
					String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
			
					expOsVoucherFooterQty=excelReader.getCellData(xlSheetName, 229, 7);
					expOsVoucherFooterGross=excelReader.getCellData(xlSheetName, 230, 7);
					expOsVoucherFooterNet=excelReader.getCellData(xlSheetName, 231, 7);
								
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
					 
					 String expvoucherGridBodyList=excelReader.getCellData(xlSheetName, 228, 7);
					 
					 excelReader.setCellData(xlfile, xlSheetName, 228, 8, actvoucherGridBodyList);
					 
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
					Thread.sleep(2000);
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
					
					expOsVoucherFooterQty=excelReader.getCellData(xlSheetName, 241, 7);
					expOsVoucherFooterGross=excelReader.getCellData(xlSheetName, 242, 7);
					expOsVoucherFooterNet=excelReader.getCellData(xlSheetName, 243, 7);
					
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
					 
					 String expvoucherGridBodyList=excelReader.getCellData(xlSheetName, 240, 7);
					 
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
			    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
					select2ndRow_1stColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
					enter_ItemTxt.click();
					enter_ItemTxt.sendKeys(Keys.HOME);
					enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.END);
					enter_ItemTxt.sendKeys(Keys.SPACE);
					
					int itemcount = itemListCount.size();
					
					System.err.println(itemcount);
						
					for(int i=0 ; i < itemcount ;i++)
					{
						String data = itemListCount.get(i).getText();
						
						if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 244, 6)))
						{
							itemListCount.get(i).click();
							break;
						}
				    }
				
			        enter_ItemTxt.sendKeys(Keys.TAB);	
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
					enter_UnitTxt.sendKeys(Keys.TAB);
					
					String actUnitsColumnSelectingBinsProduct = select2ndRow_2ndColumn.getText();
					String expUnitsColumnSelectingBinsProduct = excelReader.getCellData(xlSheetName, 245, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 245, 8, actUnitsColumnSelectingBinsProduct);
					
					System.out.println("Units Column Value is display On Select       : " + actUnitsColumnSelectingBinsProduct +  "  Value Expected : " + expUnitsColumnSelectingBinsProduct);
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.click();
					enter_Quantity.clear();
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 245, 6));
					enter_Quantity.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					enter_Rate.click();
					enter_Rate.clear();
					enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 246, 6));
					enter_Rate.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
					saveBtn.click();
					
					String expSaveMessageWithOutBatchExpiry=excelReader.getCellData(xlSheetName, 246, 7);
					
					String validationMessage=checkValidationMessage(expSaveMessageWithOutBatchExpiry);
					
					excelReader.setCellData(xlfile, xlSheetName, 246, 8, validationMessage);
							
					System.out.println("Entry Page Save With Input Of Batch Value Actual  : " + validationMessage + "  Value Expected   : " + "TRUE");
				
					if(actUnitsColumnSelectingBinsProduct.equalsIgnoreCase(expUnitsColumnSelectingBinsProduct) &&  expSaveMessageWithOutBatchExpiry.equalsIgnoreCase(validationMessage))
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
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 247, 6));
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
					//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]         = binBalanceTxt.getAttribute("value");
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					binSearchBtn.click();
					
					Thread.sleep(2000);
					
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
					
					
			      
					String expBinTotalQty           = excelReader.getCellData(xlSheetName, 249, 7);
					String expBinBaseUom            = excelReader.getCellData(xlSheetName, 250, 7);
					//String expBinBalanceQty         = excelReader.getCellData(xlSheetName, 251, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 249, 8, actBinTotalQty);
					excelReader.setCellData(xlfile, xlSheetName, 250, 8, actBinBaseUom);
					//excelReader.setCellData(xlfile, xlSheetName, 251, 8, actBinBalanceQty);
							
			       
					System.out.println("Bin Total Qty Value Actual              :  " +actBinTotalQty +           " Value Expected : " + expBinTotalQty);
					System.out.println("Bin Base Uom Value Actual               :  " +actBinBaseUom +            " Value Expected : " + expBinBaseUom);
					//System.out.println("Bin Balance Txt Value Actual            :  " +actBinBalanceQty +         " Value Expected : " + expBinBalanceQty);
					
					
				
					System.out.println("Bin Search Value Actual                 :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual             :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					System.out.println("Bin Auto Allocate Btn Value Actual      :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual               :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual             :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
										
					if(actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && actBinTotalQty.equalsIgnoreCase(expBinTotalQty)
							&& actBinBaseUom.endsWith(expBinBaseUom) /*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/)
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
				
				
				
				
			  // Not Updating Total Sum
			  public boolean checkEditVoucherSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_1stColumn));
					getAction().doubleClick(binselect2ndRow_1stColumn).build().perform();
					
					String actBinTotalQty           = binTotalQty.getAttribute("value");
					String actBinBaseUom            = binBaseUOM.getText();
					//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]         = binBalanceTxt.getAttribute("value");
					
					//String actBinSum                = binSumInward.getText();
					String expBinTotalQty           = excelReader.getCellData(xlSheetName, 254, 7);
					String expBinBaseUom            = excelReader.getCellData(xlSheetName, 255, 7);
					//String expBinBalanceQty         = excelReader.getCellData(xlSheetName, 256, 7);
					String expBinSum                = excelReader.getCellData(xlSheetName, 257, 7);
					
					
					excelReader.setCellData(xlfile, xlSheetName, 254, 8, actBinTotalQty);
					excelReader.setCellData(xlfile, xlSheetName, 255, 8, actBinBaseUom);
					//excelReader.setCellData(xlfile, xlSheetName, 256, 8, actBinBalanceQty);
					//excelReader.setCellData(xlfile, xlSheetName, 257, 8, actBinSum);
					
						
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
					
					String expbinInwardGridList=excelReader.getCellData(xlSheetName, 253, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 253, 8, actbinInwardGridList);
					
					System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
					System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
					
					
					boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
							            && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
					
					String actResult = Boolean.toString(actMethod);
					
					excelReader.setCellData(xlfile, xlSheetName, 252, 8, actResult.toUpperCase());
				
					System.out.println("Bin Search Value Actual                    :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual                :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					System.out.println("Bin Auto Allocate Btn Value Actual         :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual                  :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual                :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					System.out.println("Bin Ok Button                              :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
					
					
					System.out.println("Bin Total Qty Value Actual                  :  " + actBinTotalQty +         " Value Expected : " + expBinTotalQty);
					//System.out.println("Bin Sum of To Be Allocated Qty Value Actual :  " + actBinSum       +        " Value Expected : " + expBinSum);
						
					System.out.println("Bin Base Uom Value Actual            	    :  " + actBinBaseUom +          " Value Expected : " + expBinBaseUom);
					//System.out.println("Bin Balance Txt Value Actual          		:  " + actBinBalanceQty +       " Value Expected : " + expBinBalanceQty);
						
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
					binOkBtn.click();
					
					String actBinName      = excelReader.getCellData(xlSheetName, 258, 7);
					String expBinName      = select2ndRow_7thColumn.getText();
					
					excelReader.setCellData(xlfile, xlSheetName, 258, 8, actBinName);
					
					System.out.println("Bin Column in Voucher Value Actual          : " + actBinName +              " Value Exepected  : " + expBinName);
					
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
							
					if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
							
							&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
							/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
							
							/*&& actBinSum.equalsIgnoreCase(expBinSum)*/
							
							&& select2ndRow_7thColumn.getText().equalsIgnoreCase(actBinName))
						
					{
						System.out.println("Selected Bin And Ok Btn Not Enabled");
						excelReader.setCellData(xlfile, xlSheetName, 252, 9, resPass);
						return true;
						
					}
					else
					{
						System.out.println("Not Selected Bin And Ok Btn Not Enabled");
						excelReader.setCellData(xlfile, xlSheetName, 252, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 252, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			  }
				
				
				
				
			  public boolean checkEditOpeningStocksAddingDataInThirdRowForBinCheking() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

				try
				{
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
					enter_ItemTxt.click();
					enter_ItemTxt.sendKeys(Keys.HOME);
					enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.END);
					enter_ItemTxt.sendKeys(Keys.SPACE);
					
					int itemcount=itemListCount.size();
					
					System.err.println(itemcount);
						
					for(int i=0 ; i < itemcount ;i++)
					{
						String data=itemListCount.get(i).getText();
						
						if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 259, 6)))
						{
							itemListCount.get(i).click();
							
							break;
						}
					}
						
					enter_ItemTxt.sendKeys(Keys.TAB);	
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
					enter_UnitTxt.click();
					enter_UnitTxt.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.click();
					enter_Quantity.clear();
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 260, 6));
					enter_Quantity.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					enter_Rate.click();
					enter_Rate.clear();
					enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 261, 6));
					enter_Rate.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					enter_Gross.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
					
					boolean actBinSearchTxt             = binSearchTxt.isDisplayed();
					boolean actBinSearchBtn             = binSearchBtn.isDisplayed();
					boolean actBinAutoAllocateBtn       = binAutoAllocateBtn.isDisplayed();
					boolean actBinPickBtn               = binPickBtn.isDisplayed();
					boolean actBinCancelBtn             = binCancelBtn.isDisplayed();
					boolean actBinOkBtn                 = binOkBtn.isEnabled();
					
					boolean expBinSearchTxt             = true;
					boolean expBinSearchBtn             = true;
					boolean expBinAlternateCategory     = true;
					boolean expBinAutoAllocateBtn       = true;
					boolean expBinPickBtn               = true;
					boolean expBinCancelBtn             = true;
					boolean expBinOkBtn                 = true;
					
					
			   
					
					String actBinTotalQty               = binTotalQty.getAttribute("value");
					String actBinBaseUom                = binBaseUOM.getText();
					//String actbinBalanceTxt = binBalanceTxt.getAttribute("value");
			        //String actBinSum                    = binSumInward.getText();
					
					
					

					String expBinTotalQty               = excelReader.getCellData(xlSheetName, 261, 7);
					String expBinBaseUom                = excelReader.getCellData(xlSheetName, 262, 7);
					//String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 263, 7);
					String expBinSum                    = excelReader.getCellData(xlSheetName, 264, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 261, 8, actBinTotalQty);
					excelReader.setCellData(xlfile, xlSheetName, 262, 8, actBinBaseUom);
					//excelReader.setCellData(xlfile, xlSheetName, 263, 8, actBinBalanceQty);
					//excelReader.setCellData(xlfile, xlSheetName, 264, 8, actBinSum);
					
				  
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					binSearchBtn.click();
					
					Thread.sleep(2000);
					

					
					
					int binInwardGridListCount = binInwardGridList.size();
					
					ArrayList<String> binInwardGridListArray = new ArrayList<String>();
					
					for(int i=0;i<binInwardGridListCount;i++)
					{
						String data = binInwardGridList.get(i).getText();
						binInwardGridListArray.add(data);
					}
					
					
					String actbinInwardGridList=binInwardGridListArray.toString();
					
					String expbinInwardGridList=excelReader.getCellData(xlSheetName, 260, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 260, 8, actbinInwardGridList);
					
					System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
					System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
					
					
					boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn  
							            && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
					
					String actResult = Boolean.toString(actMethod);
					
					excelReader.setCellData(xlfile, xlSheetName, 259, 8, actResult.toUpperCase());

				
					System.out.println("Bin Total Qty Value Actual                 :  " +actBinTotalQty +"  			Value Expected : "+expBinTotalQty);
					System.out.println("Bin Base Uom Value Actual                  :  " +actBinBaseUom +"  				Value Expected : "+expBinBaseUom);
					//System.out.println("Bin Balance Txt Value Actual               :  " +actBinBalanceQty +"  		    Value Expected : "+expBinBalanceQty);
					//System.out.println("Bin Total Sum Value Actual                 :  " + actBinSum +"                  Value Expected : " + expBinSum);
					
					System.out.println("Bin Search Value Actual                    :  " + actBinSearchTxt +"            Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual                :  " + actBinSearchBtn +"            Value Expected : " + expBinSearchBtn);
					
					System.out.println("Bin Auto Allocate Btn Value Actual         :  " + actBinAutoAllocateBtn +"      Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual                  :  " + actBinPickBtn +"              Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual                :  " + actBinCancelBtn +"            Value Expected : " + expBinCancelBtn);
					System.out.println("Bin Ok Btn Value Actual                    :  " + actBinOkBtn +"                Value Expected : " + expBinOkBtn);
					
								
					if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
							
							&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
							/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
							
							/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
					{
						
						System.out.println("Test Pass : Bin Popup options Are As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 259, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 259, 9, resFail);
						return false;
					}
				  }
				catch (Exception e) 
				{
					
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 259, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			  }
				
				
			  public boolean checkEditOpeningStocksAddingBinInThridRowAutoAllocateInBin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{	
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
					binAutoAllocateBtn.click();
						
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
					
					boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
				            && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;

					String actResult = Boolean.toString(actMethod);

					excelReader.setCellData(xlfile, xlSheetName, 265, 8, actResult.toUpperCase());
						
					System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
					
					int binInwardGridListCount = binInwardGridList.size();
					
					ArrayList<String> binInwardGridListArray = new ArrayList<String>();
					
					for(int i=0;i<binInwardGridListCount;i++)
					{
						String data = binInwardGridList.get(i).getText();
						binInwardGridListArray.add(data);
					}
					
					
					String actbinInwardGridList=binInwardGridListArray.toString();
					
					String expbinInwardGridList=excelReader.getCellData(xlSheetName, 266, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 266, 8, actbinInwardGridList);
					
					System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
					System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
					
					
					String actBinTotalQty           = binTotalQty.getAttribute("value");
					String actBinBaseUom            = binBaseUOM.getText();
					//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]         = binBalanceTxt.getAttribute("value");
					//String actBinSum                = binSumInward.getText();
					
					
				
					
					String expBinTotalQty           = excelReader.getCellData(xlSheetName, 267, 7);
					String expBinBaseUom            = excelReader.getCellData(xlSheetName, 268, 7);
					//String expBinBalanceQty         = excelReader.getCellData(xlSheetName, 269, 7);
					String expBinSum                = excelReader.getCellData(xlSheetName, 270, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 267, 8, actBinTotalQty);
					excelReader.setCellData(xlfile, xlSheetName, 268, 8, actBinBaseUom);
					//excelReader.setCellData(xlfile, xlSheetName, 269, 8, actBinBalanceQty);
					//excelReader.setCellData(xlfile, xlSheetName, 270, 8, actBinSum);
					
					
			
					
					System.out.println("Bin Total Qty Value Actual                 :  " + actBinTotalQty +         "  Value Expected : " + expBinTotalQty);
					System.out.println("Bin Base Uom  Value Actual                 :  " + actBinBaseUom +          "  Value Expected : " + expBinBaseUom);
					//System.out.println("Bin Balance Value Actual                   :  " + actBinBalanceQty +       "  Value Expected : " + expBinBalanceQty);
					//System.out.println("Bin Total Sum Value Actual                 :  " + actBinSum +             "  Value Expected :  " + expBinSum);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
					binOkBtn.click();
					
					String actBinNameDisplayInVoucherBinColumn = select3rdRow_7thColumn.getText();
					String expBinNameDisplayInVoucherBinColumn = excelReader.getCellData(xlSheetName, 271, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 271, 8, actBinNameDisplayInVoucherBinColumn);
					
					System.out.println("Bin Column in Voucher Value Actual : " + actBinNameDisplayInVoucherBinColumn +  " Value Expected : " + expBinNameDisplayInVoucherBinColumn);
						
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_7thColumn));
							
					if(actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
							
							&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
							/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
							
							/*&& actBinSum.equalsIgnoreCase(expBinSum)*/
							
							&& actBinNameDisplayInVoucherBinColumn.equalsIgnoreCase(expBinNameDisplayInVoucherBinColumn))
					{
						System.out.println("Selected Bin And Ok Btn Not Enabled");
						excelReader.setCellData(xlfile, xlSheetName, 265, 9, resPass);
						return true;
					
					}
					else
					{
						System.out.println("Not Selected Bin And Ok Btn Not Enabled");
						excelReader.setCellData(xlfile, xlSheetName, 265, 9, resFail);
						return false;
					}
				  }
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 265, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			  }
				
				
				
				
				
			  public boolean checkEditOpeningStocksNewAddingDataInFourthRowForBinCheking() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {		
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

				try
				{
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
					enter_ItemTxt.click();
					enter_ItemTxt.sendKeys(Keys.HOME);
					enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.END);
					enter_ItemTxt.sendKeys(Keys.SPACE);
					
					int itemcount   =  itemListCount.size();
					
					System.err.println(itemcount);
						
					for(int i=0 ; i < itemcount ;i++)
					{
						String data = itemListCount.get(i).getText();
						
						if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 272, 6)))
						{
							itemListCount.get(i).click();		
							break;
						}
					}
						
					enter_ItemTxt.sendKeys(Keys.TAB);	
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
					enter_UnitTxt.click();
					enter_UnitTxt.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.click();
					enter_Quantity.clear();
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 273, 6));
					enter_Quantity.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					enter_Rate.click();
					enter_Rate.clear();
					enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 274, 6));
					enter_Rate.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					enter_Gross.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
					
					boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
					boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
					
					boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
					boolean actBinPickBtn                  = binPickBtn.isDisplayed();
					boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
					boolean actBinOkBtn                    = binOkBtn.isEnabled();
							
					boolean expBinSearchTxt                = true;
					boolean expBinSearchBtn                = true;
					boolean expBinAlternateCategory        = true;
					boolean expBinAutoAllocateBtn          = true;
					boolean expBinPickBtn                  = true;
					boolean expBinCancelBtn                = true;
					boolean expBinOkBtn                    = true;
						
					System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					
					System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					binSearchBtn.click();
					
					Thread.sleep(2000);
			     
					
					 int binInwardGridListCount = binInwardGridList.size();
			         
			         ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			         
			         for(int i=0;i<binInwardGridListCount;i++)
			         {
			                 String data = binInwardGridList.get(i).getText();
			                 binInwardGridListArray.add(data);
			         }
			         
			         
			         String actbinInwardGridList=binInwardGridListArray.toString();
			         
			         String expbinInwardGridList=excelReader.getCellData(xlSheetName, 273, 7);
			         
			         excelReader.setCellData(xlfile, xlSheetName, 273, 8, actbinInwardGridList);
			         
			         System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			         System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			         
			         
			         boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
			                                     && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
			         
			         String actResult = Boolean.toString(actMethod);
			         
			         excelReader.setCellData(xlfile, xlSheetName, 272, 8, actResult.toUpperCase());

					
					String actBinTotalQty         = binTotalQty.getAttribute("value");
					String actBinBaseUom          = binBaseUOM.getText();
					//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]       = binBalanceTxt.getAttribute("value");
					//String actBinSum              = binSumInward.getText();
						

				
					String expBinTotalQty         = excelReader.getCellData(xlSheetName, 274, 7);
					String expBinBaseUom          = excelReader.getCellData(xlSheetName, 275, 7);
					//String expBinBalanceQty       = excelReader.getCellData(xlSheetName, 276, 7);
					String expBinSum              = excelReader.getCellData(xlSheetName, 277, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 274, 8, actBinTotalQty);
			        excelReader.setCellData(xlfile, xlSheetName, 275, 8, actBinBaseUom);
			        //excelReader.setCellData(xlfile, xlSheetName, 276, 8, actBinBalanceQty);
			        //excelReader.setCellData(xlfile, xlSheetName, 277, 8, actBinSum);

							
					
					
					System.out.println("Bin Total Qty               :  " +actBinTotalQty +            "  Value Expected : "  + expBinTotalQty);
					System.out.println("Bin Base Uom                :  " +actBinBaseUom +             "  Value Expected : "  + expBinBaseUom);
					//System.out.println("Bin Balance Txt             :  " +actBinBalanceQty +          "  Value Expected : "  + expBinBalanceQty);
					
					//System.out.println("Bin Total To Be Adjusted    :  " + actBinSum +"   " + expBinSum);
							
					if(
							actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
							
							&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
							/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
							
							/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
					{
						
						System.out.println("Test Pass : Bin Popup options Are As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 272, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 272, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 272, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			  }
				
			 
			  
			  public boolean checkEditOpeningStocksNewVoucherByInputBinColumnManuallyInBinScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
					binselect2ndRow_8thColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ToBeAllocateTxt));
					enter_ToBeAllocateTxt.sendKeys(excelReader.getCellData(xlSheetName, 278, 6));
					enter_ToBeAllocateTxt.sendKeys(Keys.TAB);
					
					boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
					boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
					
					boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
					boolean actBinPickBtn                  = binPickBtn.isDisplayed();
					boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
					boolean actBinOkBtn                    = binOkBtn.isEnabled();
							
					boolean expBinSearchTxt                = true;
					boolean expBinSearchBtn                = true;
					
					boolean expBinAutoAllocateBtn          = true;
					boolean expBinPickBtn                  = true;
					boolean expBinCancelBtn                = true;
					boolean expBinOkBtn                    = true;
						
					System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					
					System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
					
					

			        
					
					String actBinTotalQty                   = binTotalQty.getAttribute("value");
					String actBinBaseUom                    = binBaseUOM.getText();
					//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]                 = binBalanceTxt.getAttribute("value");
					//String actBinSum                        = binSumInward.getText();
					
					
					
					
					
					 String expBinTotalQty               = excelReader.getCellData(xlSheetName, 280, 7);
			         String expBinBaseUom                = excelReader.getCellData(xlSheetName, 281, 7);
			         //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 282, 7);
			         String expBinSum                    = excelReader.getCellData(xlSheetName, 283, 7);
			         
			         excelReader.setCellData(xlfile, xlSheetName, 280, 8, actBinTotalQty);
			         excelReader.setCellData(xlfile, xlSheetName, 281, 8, actBinBaseUom);
			         //excelReader.setCellData(xlfile, xlSheetName, 282, 8, actBinBalanceQty);
			         //excelReader.setCellData(xlfile, xlSheetName, 283, 8, actBinSum);
			         
			         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					 binSearchBtn.click();
					 
					 Thread.sleep(2000);
			         
			         int binInwardGridListCount = binInwardGridList.size();
			         
			         ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			         
			         for(int i=0;i<binInwardGridListCount;i++)
			         {
			                 String data = binInwardGridList.get(i).getText();
			                 binInwardGridListArray.add(data);
			         }
			         
			         
			         String actbinInwardGridList=binInwardGridListArray.toString();
			         
			         String expbinInwardGridList=excelReader.getCellData(xlSheetName, 279, 7);
			         
			         excelReader.setCellData(xlfile, xlSheetName, 279, 8, actbinInwardGridList);
			         
			         System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			         System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			         
			         
			         boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
			                                   
			                                     && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
			         
			         String actResult = Boolean.toString(actMethod);
			         
			         excelReader.setCellData(xlfile, xlSheetName, 278, 8, actResult.toUpperCase());

			         

				
					System.out.println("Bin Total Qty               :  " +actBinTotalQty +            "  Value Expected : "  + expBinTotalQty);
					System.out.println("Bin Base Uom                :  " +actBinBaseUom +             "  Value Expected : "  + expBinBaseUom);
					//System.out.println("Bin Balance Txt             :  " +actBinBalanceQty +          "  Value Expected : "  + expBinBalanceQty);
					//System.out.println("Bin Total To Be Adjusted    :  " + actBinSum +                "  Value Expected : " + expBinSum);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
					binOkBtn.click();
					
					String actBinName=excelReader.getCellData(xlSheetName, 284, 7);
					
					System.out.println("Bin Column in Voucher : "+ actBinName +  "    "+select3rdRow_7thColumn.getText());
					
					excelReader.setCellData(xlfile, xlSheetName, 284, 8, select3rdRow_7thColumn.getText());
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_7thColumn));
							
					if(actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
							
							&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
							/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
							
							/*&& actBinSum.equalsIgnoreCase(expBinSum)*/
							
							&& select4thRow_7thColumn.getText().equalsIgnoreCase(actBinName))
						
					{
						System.out.println("Selected Bin And Ok Btn Not Enabled");
						excelReader.setCellData(xlfile, xlSheetName, 278, 9, resPass);
						return true;
					
					}
					else
					{
						System.out.println("Not Selected Bin And Ok Btn Not Enabled");
						excelReader.setCellData(xlfile, xlSheetName, 278, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					String exception =e.getMessage().substring(0, 50);
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 278, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			  }
				
					
			  public boolean checkEditOpeningStocksNewBinValuesForPreviousRowBinAfterAllocatingCurrentBinRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_7thColumn));
					select4thRow_7thColumn.click();
					
					
					Thread.sleep(5000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Bin));
					enter_Bin.sendKeys(Keys.SPACE);
					Thread.sleep(5000);
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));		
					
					boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
					boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
					boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
					boolean actBinPickBtn                  = binPickBtn.isDisplayed();
					boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
					boolean actBinOkBtn                    = binOkBtn.isEnabled();
							
					boolean expBinSearchTxt                = true;
					boolean expBinSearchBtn                = true;
					boolean expBinAutoAllocateBtn          = true;
					boolean expBinPickBtn                  = true;
					boolean expBinCancelBtn                = true;
					boolean expBinOkBtn                    = true;
						
					System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
					
				
					
					String actBinTotalQty                  = binTotalQty.getAttribute("value");
					String actBinBaseUom                   = binBaseUOM.getText();
					//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]                = binBalanceTxt.getAttribute("value");
					//String actBinSum                       = binSumInward.getText();
					
					 String expBinTotalQty               = excelReader.getCellData(xlSheetName, 287, 7);
			         String expBinBaseUom                = excelReader.getCellData(xlSheetName, 288, 7);
			         //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 289, 7);
			         String expBinSum                    = excelReader.getCellData(xlSheetName, 290, 7);
			         
			         excelReader.setCellData(xlfile, xlSheetName, 287, 8, actBinTotalQty);
			         excelReader.setCellData(xlfile, xlSheetName, 288, 8, actBinBaseUom);
			         //excelReader.setCellData(xlfile, xlSheetName, 289, 8, actBinBalanceQty);
			         //excelReader.setCellData(xlfile, xlSheetName, 290, 8, actBinSum);
			         
			         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					 binSearchBtn.click();
					 
					 Thread.sleep(2000);
			         
			         int binInwardGridListCount = binInwardGridList.size();
			         
			         ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			         
			         for(int i=0;i<binInwardGridListCount;i++)
			         {
			                 String data = binInwardGridList.get(i).getText();
			                 binInwardGridListArray.add(data);
			         }
			         
			         
			         String actbinInwardGridList=binInwardGridListArray.toString();
			         
			         String expbinInwardGridList=excelReader.getCellData(xlSheetName, 286, 7);
			         
			         excelReader.setCellData(xlfile, xlSheetName, 286, 8, actbinInwardGridList);
			         
			         System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			         System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			         
			         
			         boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn
			                                     && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
			         
			         String actResult = Boolean.toString(actMethod);
			         
			         excelReader.setCellData(xlfile, xlSheetName, 285, 8, actResult.toUpperCase());
					
					
					
					
					System.out.println("Bin Total Qty               :  " + actBinTotalQty +            "  Value Expected : "  + expBinTotalQty);
					System.out.println("Bin Base Uom                :  " + actBinBaseUom +             "  Value Expected : "  + expBinBaseUom);
					//System.out.println("Bin Balance Txt             :  " + actBinBalanceQty +          "  Value Expected : "  + expBinBalanceQty);
					
					//System.out.println("Bin Total To Be Adjusted    :  " + actBinSum  +                "  Value Expected : "  + expBinSum);
					
					Thread.sleep(1000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
					binCancelBtn.click();
					
					Thread.sleep(1000);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_9thColumn));
					select4thRow_9thColumn.click();
					
					String actBinName                    = select4thRow_7thColumn.getText();
				    String expBinName                    = excelReader.getCellData(xlSheetName, 291, 7);
				    
				    excelReader.setCellData(xlfile, xlSheetName, 291, 8, actBinName); 
				    	
					System.out.println("Bin Column in Voucher       : " + actBinName +                "  Value Expected : " + expBinName);
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_7thColumn));
							
					if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
							
							&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
							/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
							
							/*&& actBinSum.equalsIgnoreCase(expBinSum)*/
							
							&& actBinName.equalsIgnoreCase(expBinName))	
					{
						System.out.println("Selected Bin And Ok Btn Not Enabled");
						excelReader.setCellData(xlfile, xlSheetName, 285, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Not Selected Bin And Ok Btn Not Enabled");
						excelReader.setCellData(xlfile, xlSheetName, 285, 9, resFail);
						return false;
					}	
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 285, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			  }
				

			   // Delete row For Bin Validation
			   public boolean checkEditOpeningStocksNewDeleteRowBin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			   {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
				 try
				 {
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
					 fourthRowIndex.click();
							
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
					 deleteRowBtn.click();
					 
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
					 thirdRowIndex.click();
					 
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
					 deleteRowBtn.click();
					 
					 String actBinColumnR3GetText=select3rdRow_7thColumn.getText();
					 System.out.println("actBinColumnR3GetText  :  "+actBinColumnR3GetText);
					 
					 boolean actBinColumnAfterDeleteRow=select3rdRow_7thColumn.getText().isEmpty();
					 boolean expBonColumnAfterDeleteRow=true;
					 
					 String actResult = Boolean.toString(actBinColumnAfterDeleteRow);
					 
					 excelReader.setCellData(xlfile, xlSheetName, 292, 8, actResult.toUpperCase());
					 
					 System.out.println("Bin Column after Delete Row Value Actual     :  " + actBinColumnAfterDeleteRow +   " Value Expected : " + expBonColumnAfterDeleteRow);
					 
					 if(actBinColumnAfterDeleteRow==expBonColumnAfterDeleteRow)
					 {	
						 System.out.println("Test Pass  deleted row Working  ");
						 excelReader.setCellData(xlfile, xlSheetName, 292, 9, resPass);
						 return true;
					 }
					 else
					 {
						 System.out.println("Test Fail Not Deleted Row");
						 excelReader.setCellData(xlfile, xlSheetName, 292, 9, resPass);
						 return false;
					 }
				 }
				 catch (Exception e) 
				 {
					 excelReader.setExceptionInExcel(xlfile, xlSheetName, 292, 10, e.getMessage());
					 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					 return false;
				 }
			   }
				
			   
				public boolean checkEditOpeningStocksNewBinQuantityAfterAlocatingAndDeleting() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
				  excelReader=new ExcelReader(POJOUtility.getExcelPath());
				  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
				  try
				  {
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
					  select3rdRow_1stColumn.click();
						
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
					  enter_ItemTxt.sendKeys(Keys.SPACE);
						
					  int itemcount=itemListCount.size();
						
					  System.err.println(itemcount);
							
					  for(int i=0 ; i < itemcount ;i++)
					  {
						  String data=itemListCount.get(i).getText();
							
						  if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 293, 6)))
						  {
							  itemListCount.get(i).click();
							  break;
						  }
					  }
							
					  enter_ItemTxt.sendKeys(Keys.TAB);	
						
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
					  enter_UnitTxt.click();
					  enter_UnitTxt.sendKeys(Keys.TAB);
						
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					  enter_Quantity.click();
					  enter_Quantity.clear();
					  enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 294, 6));
					  enter_Quantity.sendKeys(Keys.TAB);
						
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					  enter_Rate.click();
					  enter_Rate.clear();
					  enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 295, 6));
					  enter_Rate.sendKeys(Keys.TAB);
						
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					  enter_Gross.sendKeys(Keys.TAB);
						
					  Thread.sleep(5000);
					  
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

					  boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
					  boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
					  boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
					  boolean actBinPickBtn                  = binPickBtn.isDisplayed();
					  boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
					  boolean actBinOkBtn                    = binOkBtn.isEnabled();
					  
					  boolean expBinSearchTxt                = true;
					  boolean expBinSearchBtn                = true;
					  boolean expBinAutoAllocateBtn          = true;
					  boolean expBinPickBtn                  = true;
					  boolean expBinCancelBtn                = true;
					  boolean expBinOkBtn                    = true;
					  
					  System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					  System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					  System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					  System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					  System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					  System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
						
					  String actBinTotalQty             = binTotalQty.getAttribute("value");
					  String actBinBaseUom              = binBaseUOM.getText();
					  //[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]           = binBalanceTxt.getAttribute("value");
					  //String actBinSum                  = binSumInward.getText();
						
					  String expBinTotalQty               = excelReader.getCellData(xlSheetName, 295, 7);
					  String expBinBaseUom                = excelReader.getCellData(xlSheetName, 296, 7);
					  //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 297, 7);
					  String expBinSum                    = excelReader.getCellData(xlSheetName, 298, 7);
				        
					  excelReader.setCellData(xlfile, xlSheetName, 295, 8, actBinTotalQty);
					  excelReader.setCellData(xlfile, xlSheetName, 296, 8, actBinBaseUom);
					  //excelReader.setCellData(xlfile, xlSheetName, 297, 8, actBinBalanceQty);
					  //excelReader.setCellData(xlfile, xlSheetName, 298, 8, actBinSum);
					  
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					  binSearchBtn.click();
					  
					  Thread.sleep(2000);
					  
					  int binInwardGridListCount = binInwardGridList.size();
					  
					  ArrayList<String> binInwardGridListArray = new ArrayList<String>();
					  
					  for(int i=0;i<binInwardGridListCount;i++)
					  {
						  String data = binInwardGridList.get(i).getText();
						  binInwardGridListArray.add(data);
					  }	
				        	
				        
					  String actbinInwardGridList=binInwardGridListArray.toString();
					  
					  String expbinInwardGridList=excelReader.getCellData(xlSheetName, 294, 7);
					  
					  excelReader.setCellData(xlfile, xlSheetName, 294, 8, actbinInwardGridList);
					  
					  System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
					  System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
					  
					  boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
							  && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
				        	
					  String actResult = Boolean.toString(actMethod);
				        
					  excelReader.setCellData(xlfile, xlSheetName, 293, 8, actResult.toUpperCase());
					  
				
						
					  System.out.println("Bin Total Qty               :  " +actBinTotalQty +            "  Value Expected : "  + expBinTotalQty);
					  System.out.println("Bin Base Uom                :  " +actBinBaseUom +             "  Value Expected : "  + expBinBaseUom);
					  //System.out.println("Bin Balance Txt             :  " +actBinBalanceQty +          "  Value Expected : "  + expBinBalanceQty);
						
					  //System.out.println("Bin Total To Be Adjusted    :  " + actBinSum +                "  Value Expected : "  + expBinSum);
								
					  if(actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
								
								&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
								/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
								
								/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
					{
						
						System.out.println("Test Pass : Bin Popup options Are As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 293, 9, resPass);
						
						return true;
					}
					else
					{
						System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 293, 9, resFail);
						
						return false;
					}
				  }
				  catch (Exception e) 
				  {
					  excelReader.setExceptionInExcel(xlfile, xlSheetName, 293, 10, e.getMessage());
					  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					  return false;
				  }
			  }
				
				  public boolean checkEditOpeningStocksNewVoucherWithInputingAllocateQtyMoreThanAvailableQty() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				  {
						
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
					 try
					 {
						 Thread.sleep(2000);
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
						 binselect2ndRow_8thColumn.click();
						 
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ToBeAllocateTxt));
						 enter_ToBeAllocateTxt.sendKeys(excelReader.getCellData(xlSheetName, 299, 6));
						 enter_ToBeAllocateTxt.sendKeys(Keys.TAB);
						 
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
						 String actbinselect2ndRow_8thColumn = binselect2ndRow_8thColumn.getText();
						 String expbinselect2ndRow_8thColumn = excelReader.getCellData(xlSheetName, 300, 7);
						 
						 excelReader.setCellData(xlfile, xlSheetName, 300, 8, actbinselect2ndRow_8thColumn);
						 
						 System.out.println("binselect2ndRow_8thColumn Value Actual   : " + actbinselect2ndRow_8thColumn + " Value Expected : " + expbinselect2ndRow_8thColumn);
								 
						 if(actbinselect2ndRow_8thColumn.equalsIgnoreCase(expbinselect2ndRow_8thColumn))
						 {
							 System.out.println("Test Pass : Bin Popup options Are As Expected");
							 excelReader.setCellData(xlfile, xlSheetName, 299, 9, resPass);
							 
							 return true;
						 }
						 else
						 {
							 System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
							 excelReader.setCellData(xlfile, xlSheetName, 299, 9, resFail);
							
							 return false;
						 }
					 }
					 catch (Exception e) 
					 {
						 excelReader.setExceptionInExcel(xlfile, xlSheetName, 299, 10, e.getMessage());
						 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						 return false;
					 }
				  }
				  
				  
				  
				  public boolean checkEditOpeningStocksNewVoucherWithInputingThroughAllocateQty() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				  {
						
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
					 try
					 {
						 Thread.sleep(2000);
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
						 binAutoAllocateBtn.click();
						 
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
						 String actbinselect2ndRow_8thColumn2 = binselect2ndRow_8thColumn.getText();
						 String expbinselect2ndRow_8thColumn2 = excelReader.getCellData(xlSheetName, 302, 7);
						 
						 excelReader.setCellData(xlfile, xlSheetName, 302, 8, actbinselect2ndRow_8thColumn2);
						 
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
						 String actbinselect3rdRow_8thColumn = binselect3rdRow_8thColumn.getText();
						 String expbinselect3rdRow_8thColumn = excelReader.getCellData(xlSheetName, 303, 7);
						 
						 excelReader.setCellData(xlfile, xlSheetName, 303, 8, actbinselect3rdRow_8thColumn);
						 
						 System.out.println("binselect2ndRow_8thColumn2 Value Actual   : " + actbinselect2ndRow_8thColumn2 + " Value Expected : " + expbinselect2ndRow_8thColumn2);
						 System.out.println("binselect3rdRow_8thColumn Value Actual    : " + actbinselect3rdRow_8thColumn  + " Value Expected : " + expbinselect3rdRow_8thColumn);
						 
						 
						 if(actbinselect2ndRow_8thColumn2.equalsIgnoreCase(expbinselect2ndRow_8thColumn2)
								 && actbinselect3rdRow_8thColumn.equalsIgnoreCase(expbinselect3rdRow_8thColumn))
						 {
							 System.out.println("Test Pass : Bin Popup options Are As Expected");
							 excelReader.setCellData(xlfile, xlSheetName, 301, 9, resPass);
							 
							 Status=true;
							 return true;
						 }
						 else
						 {
							 System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
							 excelReader.setCellData(xlfile, xlSheetName, 301, 9, resFail);
							
							 Status=false;
							 return false;
						 }
					 }
					 catch (Exception e) 
					 {				 
						 excelReader.setExceptionInExcel(xlfile, xlSheetName, 301, 10, e.getMessage());
						 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						 return false;
					 }
				  }
				  
				  
			  public boolean checkEditOpeningStocksNewVoucherBinAutoAllocationForBinSplittingInThirdRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		  
				
				
				try
				{
					System.err.println("STATUS : "+Status);
					if(Status==true)
					{
						System.err.println("STATUS : "+Status);
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
						 binOkBtn.click();
						 System.err.println("STATUS : "+Status);
						 Thread.sleep(2000);
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_9thColumn));
						 select4thRow_9thColumn.click();
						 
						 
						 
						int voucherGridBodyListCount = voucherGridBodyList.size();
						 
						 ArrayList<String> voucherGridBodyListArray = new ArrayList<String>();
						 
						 for(int i=10;i<voucherGridBodyListCount;i++)
						 {
							 String data = voucherGridBodyList.get(i).getText();
							 voucherGridBodyListArray.add(data);
						 }
						 
						 String actvoucherGridBodyList=voucherGridBodyListArray.toString();
						 
						 String expvoucherGridBodyList=excelReader.getCellData(xlSheetName, 305, 7);
						 
						 excelReader.setCellData(xlfile, xlSheetName, 305, 8, actvoucherGridBodyList);
						 
						 System.out.println("voucherGridBodyList Actual   : " + actvoucherGridBodyList);
						 System.out.println("voucherGridBodyList Expected : " + expvoucherGridBodyList);
					 
						 if( actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
						 {
							 System.out.println("Auto Allocate Spiltted Bin ");
							 
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
							 fourthRowIndex.click();
								
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
							 deleteRowBtn.click();
								
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
							 thirdRowIndex.click();
								
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
							 deleteRowBtn.click();
							 excelReader.setCellData(xlfile, xlSheetName, 304, 9, resPass);
							 return true;
						 }
						 else
						 {
							 System.out.println("Auto Allocate Did not Spilt Bin ");
							 
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
							 binCancelBtn.click();
							 
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_9thColumn));
							 select3rdRow_9thColumn.click();
							 
							 Thread.sleep(2000);
							 
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
							 fourthRowIndex.click();
								
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
							 deleteRowBtn.click();
								
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
							 thirdRowIndex.click();
								
							 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
							 deleteRowBtn.click();
							 
							 excelReader.setCellData(xlfile, xlSheetName, 304, 9, resFail);
							 
							 return false;
						 }
					}
					else
					{
					 
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
						 fourthRowIndex.click();
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
						 deleteRowBtn.click();
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
						 thirdRowIndex.click();
							
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
						 deleteRowBtn.click();
						 
						System.out.println("Auto Allocate Did not Spilt Bin ");
						excelReader.setCellData(xlfile, xlSheetName, 304, 9, resFail);
						return false;
					}
				}
				catch (Exception e)
				{
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fourthRowIndex));
					fourthRowIndex.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
					deleteRowBtn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
					thirdRowIndex.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
					deleteRowBtn.click();
					
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 304, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					
					return false;
				}
			  }
			  
			  
			  public boolean checkEditOpeningStocksNewVoucherBinWithManualInputQtyInBinPopForBinSplittingInThirdRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		
				
					try
					{	
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_9thColumn));
						select2ndRow_9thColumn.click();
						
						Thread.sleep(2000);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
						enter_ItemTxt.sendKeys(Keys.SPACE);
						
						int itemcount=itemListCount.size();
						
						System.err.println(itemcount);
							
						for(int i=0 ; i < itemcount ;i++)
						{
							String data=itemListCount.get(i).getText();
							
							if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 306, 6)))
							{
								itemListCount.get(i).click();
								
								break;
							}
						}
							
						enter_ItemTxt.sendKeys(Keys.TAB);	
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
						enter_UnitTxt.click();
						enter_UnitTxt.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
						enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 307, 6));
						
						enter_Quantity.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
						enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 308, 6));
						
						enter_Rate.sendKeys(Keys.TAB);
						
						Thread.sleep(3000);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.sendKeys(Keys.TAB);
						
						
						
						/*try
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Bin));
							enter_Bin.sendKeys(Keys.SPACE);
						}*/
						/*catch(Exception ee)
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
						}*/
								
						Thread.sleep(3000);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
						
						boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
						boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
						boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
						boolean actBinPickBtn                  = binPickBtn.isDisplayed();
						boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
						boolean actBinOkBtn                    = binOkBtn.isEnabled();
								
						boolean expBinSearchTxt                = true;
						boolean expBinSearchBtn                = true;
						boolean expBinAutoAllocateBtn          = true;
						boolean expBinPickBtn                  = true;
						boolean expBinCancelBtn                = true;
						boolean expBinOkBtn                    = true;
							
						System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
						System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
						System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
						System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
						System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
						System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
									
						String actBinTotalQty=binTotalQty.getAttribute("value");
						String actBinBaseUom=binBaseUOM.getText();
						//String actbinBalanceTxt =binBalanceTxt.getAttribute("value");
						
						
						//String actBinSum=binSumInward.getText();
						
						
						String expBinTotalQty               = excelReader.getCellData(xlSheetName, 308, 7);
			            String expBinBaseUom                = excelReader.getCellData(xlSheetName, 309, 7);
			            //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 310, 7);
			            String expBinSum                    = excelReader.getCellData(xlSheetName, 311, 7);
			            
			            excelReader.setCellData(xlfile, xlSheetName, 308, 8, actBinTotalQty);
			            excelReader.setCellData(xlfile, xlSheetName, 309, 8, actBinBaseUom);
			            //excelReader.setCellData(xlfile, xlSheetName, 310, 8, actBinBalanceQty);
			            //excelReader.setCellData(xlfile, xlSheetName, 311, 8, actBinSum);
			            
			            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
						binSearchBtn.click();
						
						Thread.sleep(2000);
						
						
						int binInwardGridListCount = binInwardGridList.size();
						
						System.out.println("The Count of BininwardCount : " + binInwardGridListCount );
			            
			            ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			            
			            for(int i=0;i<binInwardGridListCount;i++)
			            {
			                    String data = binInwardGridList.get(i).getText();
			                    binInwardGridListArray.add(data);
			            }
			            
			            
			            String actbinInwardGridList=binInwardGridListArray.toString();
			            
			            String expbinInwardGridList=excelReader.getCellData(xlSheetName, 307, 7);
			            
			            excelReader.setCellData(xlfile, xlSheetName, 307, 8, actbinInwardGridList);
			            
			            System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			            System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			            
			            
			            
			            boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
			                                        && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
			            
			            String actResult = Boolean.toString(actMethod);
			            
			            excelReader.setCellData(xlfile, xlSheetName, 306, 8, actResult.toUpperCase());
						
						System.out.println("Bin Total Qty              :  " +actBinTotalQty +"  "+expBinTotalQty);
						System.out.println("Bin Base Uom               :  " +actBinBaseUom +"  "+expBinBaseUom);
						//System.out.println("Bin Balance Txt            :  " +actBinBalanceQty +"  "+expBinBalanceQty);
						
						//System.out.println("Bin Total Sum :  " + actBinSum +"   " + expBinSum);
						Thread.sleep(2000);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
						binAutoAllocateBtn.click();	
						
						Thread.sleep(2000);
						
						String actBinToBeAlloctionValueOnClickOnAutoAllocate2R = binselect2ndRow_8thColumn.getText();
						String actBinToBeAlloctionValueOnClickOnAutoAllocate3R = binselect3rdRow_8thColumn.getText();
							
						String expBinToBeAlloctionValueOnClickOnAutoAllocate2R = excelReader.getCellData(xlSheetName, 312, 7);
						String expBinToBeAlloctionValueOnClickOnAutoAllocate3R = excelReader.getCellData(xlSheetName, 313, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 312, 8, actBinToBeAlloctionValueOnClickOnAutoAllocate2R);
						excelReader.setCellData(xlfile, xlSheetName, 313, 8, actBinToBeAlloctionValueOnClickOnAutoAllocate3R);
						
						System.out.println("Row 2 To Be Allocated Value Actual :  " + actBinToBeAlloctionValueOnClickOnAutoAllocate2R + " Value Actual : " + expBinToBeAlloctionValueOnClickOnAutoAllocate2R);
						System.out.println("Row 3 To Be Allocated Value Actual  : " + actBinToBeAlloctionValueOnClickOnAutoAllocate3R + " Value Actual : " + expBinToBeAlloctionValueOnClickOnAutoAllocate3R);
						
						
						
						if(	actMethod== true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
								
								&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
								/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
								
								/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
						{
							Thread.sleep(5000);
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
							binOkBtn.click();	
							excelReader.setCellData(xlfile, xlSheetName, 306, 9, resPass);
							System.out.println("Manual Spilt Bin ");
							return true;
						}
						else
						{
							Thread.sleep(5000);
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
							binCancelBtn.click();
							excelReader.setCellData(xlfile, xlSheetName, 306, 9, resFail);
							System.out.println("Manual Did not Spilt Bin ");
							return false;
						}
					}
					catch (Exception e) 
					{
						
						Thread.sleep(5000);
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
						binCancelBtn.click();
						
						Thread.sleep(2000);
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_9thColumn));
						select2ndRow_9thColumn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_9thColumn));
						select3rdRow_9thColumn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_9thColumn));
						select4thRow_9thColumn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select5thRow_9thColumn));
						select5thRow_9thColumn.click();
						
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 306, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
			  	}

			  

			  public boolean checkEditOpeningStocksNewVoucherConsumeFullCapacityInFifthRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		
				
					try
					{	
						Thread.sleep(2000);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select5thRow_1stColumn));
						select5thRow_1stColumn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
						enter_ItemTxt.sendKeys(Keys.SPACE);
						
						int itemcount=itemListCount.size();
						
						System.err.println(itemcount);
							
						for(int i=0 ; i < itemcount ;i++)
						{
							String data=itemListCount.get(i).getText();
							
							if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 314, 6)))
							{
								itemListCount.get(i).click();
								
								break;
							}
						}
							
						enter_ItemTxt.sendKeys(Keys.TAB);	
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
						enter_UnitTxt.sendKeys(Keys.END);
						enter_UnitTxt.sendKeys(Keys.SHIFT,Keys.HOME);
						enter_UnitTxt.sendKeys(Keys.BACK_SPACE);
						Thread.sleep(2000);
						enter_UnitTxt.sendKeys(excelReader.getCellData(xlSheetName, 315, 6));
						Thread.sleep(2000);
						enter_UnitTxt.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
						enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 316, 6));
						
						enter_Quantity.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
						enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 317, 6));
						
						enter_Rate.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.sendKeys(Keys.TAB);
						
						/*try
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Bin));
							enter_Bin.sendKeys(Keys.SPACE);
						}
						catch(Exception ee)
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
						}*/
								
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
						
						boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
						boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
						boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
						boolean actBinPickBtn                  = binPickBtn.isDisplayed();
						boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
						boolean actBinOkBtn                    = binOkBtn.isEnabled();
								
						boolean expBinSearchTxt                = true;
						boolean expBinSearchBtn                = true;
						boolean expBinAutoAllocateBtn          = true;
						boolean expBinPickBtn                  = true;
						boolean expBinCancelBtn                = true;
						boolean expBinOkBtn                    = true;
							
						System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
						System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
						System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
						System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
						System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
						System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
						
						
						String expBinGroupNameR1="BG1";
						
						String expBinNameR2="Bin5";
						String expBinStockR2="0.00";
						String expBinCapacityR2="98.00";
						String expBinLoadR2="90.00";
						String expBinFreeSpaceR2="8.00";
						String expBinFreeQtyR2="8.00";
						String expBinToBeAllocatedR2="0.00";
						
						
						String actBinTotalQty=binTotalQty.getAttribute("value");
						String actBinBaseUom=binBaseUOM.getText();
						//String actbinBalanceTxt =binBalanceTxt.getAttribute("value");
						//String actBinSum=binSumInward.getText();
						
						 String expBinTotalQty               = excelReader.getCellData(xlSheetName, 316, 7);
			             String expBinBaseUom                = excelReader.getCellData(xlSheetName, 317, 7);
			             //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 318, 7);
			             String expBinSum                    = excelReader.getCellData(xlSheetName, 319, 7);
			             
			             excelReader.setCellData(xlfile, xlSheetName, 316, 8, actBinTotalQty);
			             excelReader.setCellData(xlfile, xlSheetName, 317, 8, actBinBaseUom);
			             //excelReader.setCellData(xlfile, xlSheetName, 318, 8, actBinBalanceQty);
			             //excelReader.setCellData(xlfile, xlSheetName, 319, 8, actBinSum);
			             
			             getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					 	 binSearchBtn.click();

					 	Thread.sleep(2000);
						
						 int binInwardGridListCount = binInwardGridList.size();
			             
			             ArrayList<String> binInwardGridListArray = new ArrayList<String>();
			             
			             for(int i=0;i<binInwardGridListCount;i++)
			             {
			                     String data = binInwardGridList.get(i).getText();
			                     binInwardGridListArray.add(data);
			             }
			             
			             
			             String actbinInwardGridList=binInwardGridListArray.toString();
			             
			             String expbinInwardGridList=excelReader.getCellData(xlSheetName, 315, 7);
			             
			             excelReader.setCellData(xlfile, xlSheetName, 315, 8, actbinInwardGridList);
			             
			             System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
			             System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
			             
			             
			             boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
			                                         && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
			             
			             String actResult = Boolean.toString(actMethod);
			             
			             excelReader.setCellData(xlfile, xlSheetName, 314, 8, actResult.toUpperCase());

						
						
						
						System.out.println("Bin Total Qty              :  " +actBinTotalQty +"  "+expBinTotalQty);
						System.out.println("Bin Base Uom               :  " +actBinBaseUom +"  "+expBinBaseUom);
						//System.out.println("Bin Balance Txt            :  " +actBinBalanceQty +"  "+expBinBalanceQty);
						
						//System.out.println("Bin Total Sum :  " + actBinSum +"   " + expBinSum);
									
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
						binAutoAllocateBtn.click();	
						
						ArrayList<String> binInwardGridListArrayAA = new ArrayList<String>();
						
						for(int i=0;i<binInwardGridListCount;i++)
			            {
			                    String data = binInwardGridList.get(i).getText();
			                    binInwardGridListArrayAA.add(data);
			            }
			            
			            
			            String actbinInwardGridListAA=binInwardGridListArrayAA.toString();
			            
			            String expbinInwardGridListAA=excelReader.getCellData(xlSheetName, 320, 7);
			            
			            excelReader.setCellData(xlfile, xlSheetName, 320, 8, actbinInwardGridListAA);
			            
			            System.out.println("ActbinInwardGridList AA : " + actbinInwardGridListAA);
			            System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
						
						
						
						if(	actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList) && actbinInwardGridListAA.equalsIgnoreCase(expbinInwardGridListAA)
								
								&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
								/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
								
								/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
							binOkBtn.click();	
							
							excelReader.setCellData(xlfile, xlSheetName, 314, 9, resPass);
							System.out.println("Manual Spilt Bin ");
							return true;
						}
						else
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
							 binCancelBtn.click();	
							excelReader.setCellData(xlfile, xlSheetName, 314, 9, resFail);
							System.out.println("Manual Did not Spilt Bin ");
							return false;
						}
					}
					 catch (Exception e) 
					 {
						 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
						 binCancelBtn.click();	
							
						
						 excelReader.setExceptionInExcel(xlfile, xlSheetName, 314, 10, e.getMessage());
						 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						 return false;
					 } 
			  	}


			  public boolean checkEditOpeningStocksNewVoucherBinPopUpValuesAfterFullQtyConsumeinPreviousRows() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
							
							if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 321, 6)))
							{
								itemListCount.get(i).click();
								
								break;
							}
						}
							
						enter_ItemTxt.sendKeys(Keys.TAB);	
						
						Thread.sleep(2000);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
						enter_UnitTxt.click();
						Thread.sleep(2000);
						enter_UnitTxt.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
						enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 322, 6));
						
						enter_Quantity.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
						enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 323, 6));
						
						enter_Rate.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.sendKeys(Keys.TAB);
						
						/*try
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Bin));
							enter_Bin.sendKeys(Keys.SPACE);
						}
						catch(Exception ee)
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
						}*/
								
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
						
						boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
						boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
						boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
						boolean actBinPickBtn                  = binPickBtn.isDisplayed();
						boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
						boolean actBinOkBtn                    = binOkBtn.isEnabled();
								
						boolean expBinSearchTxt                = true;
						boolean expBinSearchBtn                = true;
						boolean expBinAlternateCategory        = true;
						boolean expBinAutoAllocateBtn          = true;
						boolean expBinPickBtn                  = true;
						boolean expBinCancelBtn                = true;
						boolean expBinOkBtn                    = true;
							
						System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
						System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
						System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
						System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
						System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
						System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
						
						boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn
											&& actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn
											&& actBinOkBtn==expBinOkBtn;
						
						String actResult = Boolean.toString(actMethod);
						
						excelReader.setCellData(xlfile, xlSheetName, 321, 8, actResult.toUpperCase());
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
						binSearchBtn.click();
						
						Thread.sleep(2000);
						
						
						int count = binPopUpRowCount.size();
						
						String actbinPopUpRowCount = Integer.toString(count);
						
						String expbinPopUpRowCount = excelReader.getCellData(xlSheetName, 322, 7);
						
						System.out.println("binPopUpRowCount  Actual : "+actbinPopUpRowCount + " Value Expected : " + expbinPopUpRowCount);
						
						excelReader.setCellData(xlfile, xlSheetName, 322, 8, actbinPopUpRowCount);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
						binCancelBtn.click();	
						
						Thread.sleep(2000);
						
						for(int i=1;i<=4;i++)
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
							thirdRowIndex.click();	
							
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
							deleteRowBtn.click();	
						}
						
						if(actMethod==true && actbinPopUpRowCount.equalsIgnoreCase(expbinPopUpRowCount))
						{
							excelReader.setCellData(xlfile, xlSheetName, 321, 9, resPass);
							System.out.println("Manual Spilt Bin ");
							return true;
						}
						else
						{
							excelReader.setCellData(xlfile, xlSheetName, 321, 9, resFail);
							System.out.println("Manual Did not Spilt Bin ");
							return false;
						}
					}
					catch (Exception e) 
					{
						/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binCancelBtn));
						binCancelBtn.click();	
						
						for(int i=1;i<=4;i++)
						{
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(thirdRowIndex));
							thirdRowIndex.click();	
							
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
							deleteRowBtn.click();	
						}	*/
						
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 321, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					} 	
			  	}

			  
			  
			  
			  
			  
			  
			//-----------------------------------------------------------  Test the Editing Voucher ---------------------------------------------------------------------------
			  
			  
			  
			  
		    //Revert Changes
		    @FindBy(xpath="//label[contains(text(),'Revert changes')]")
			private static WebElement  revertChanges;

			  
			public boolean checkOpeningStocksNewVoucherAlertAndOKButtonInRevertChanges() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
					toggleBtn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(revertChanges));
					revertChanges.click();
				
					getWaitForAlert();
					
					String actAlert=getAlert().getText();
					String expAlert1=excelReader.getCellData(xlSheetName, 325, 7);
					String expAlert2=excelReader.getCellData(xlSheetName, 326, 7);
					
					System.out.println("Alert On Revert Changes :  "+actAlert +"  "+expAlert1+""+expAlert2);
					
					excelReader.setCellData(xlfile, xlSheetName, 325, 8, actAlert);
					
					System.out.println("Test Pass : Alert Displayed");
					
					getAlert().accept();
					
					boolean loading=checkLoadingMessage();
					
					System.out.println("VoucherLoadingMessage  : "+loading+" Value Expected : "+"TRUE");
					
					
					if(actAlert.startsWith(expAlert1) && actAlert.endsWith(expAlert2))
					{
						excelReader.setCellData(xlfile, xlSheetName, 324, 9, resPass);
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, xlSheetName, 324, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 324, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				} 	
			 }
			
			  
			
			  public boolean checkOpeningStocksNewVoucherOnClickOnRevertChanges() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
					try
					{
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
					documentNumberTxt.click();
					
					String actdocNumber,expdocNumber;
					
					actdocNumber=documentNumberTxt.getAttribute("value");
					expdocNumber=excelReader.getCellData(xlSheetName, 328, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 328, 8, actdocNumber);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
					wareHouseTxt.click();
			
					String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
					String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 329, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 329, 8, actOsVoucherWarehouse);
							
					String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
					
					String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
			
				
					
					
					expOsVoucherFooterQty=excelReader.getCellData(xlSheetName, 331, 7);
					expOsVoucherFooterGross=excelReader.getCellData(xlSheetName, 332, 7);
					expOsVoucherFooterNet=excelReader.getCellData(xlSheetName, 333, 7);
				
					System.out.println(netAmount.getText());
					System.out.println(QtyAmount.getText());
					System.out.println(GrossAmount.getText());
					
					actOsVoucherFooterQty=QtyAmount.getText();
					actOsVoucherFooterGross=GrossAmount.getText();
					actOsVoucherFooterNet=netAmount.getText();
					
					excelReader.setCellData(xlfile, xlSheetName, 331, 8, actOsVoucherFooterQty);
					excelReader.setCellData(xlfile, xlSheetName, 332, 8, actOsVoucherFooterGross);
					excelReader.setCellData(xlfile, xlSheetName, 333, 8, actOsVoucherFooterNet);
					
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
					 
					 String expvoucherGridBodyList=excelReader.getCellData(xlSheetName, 330, 7);
					 
					 excelReader.setCellData(xlfile, xlSheetName, 330, 8, actvoucherGridBodyList);
					 
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
					
						excelReader.setCellData(xlfile, xlSheetName, 327, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Saved Data is NOT As Expected");
						
						excelReader.setCellData(xlfile, xlSheetName, 327, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 327, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			  }	
				
			 
			  
			  public boolean checkOpeningStocksNewVoucherEditByUpdatingBRCOGSAndNoBatchInFirstRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
				try
				{		
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
					select1stRow_1stColumn.click();
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
					enter_ItemTxt.sendKeys(Keys.END);
					enter_ItemTxt.sendKeys(Keys.LEFT_SHIFT,Keys.HOME);
					enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
					enter_ItemTxt.sendKeys(Keys.SPACE);
					
					int itemcount=itemListCount.size();
					
					System.err.println(itemcount);
						
					for(int i=0 ; i < itemcount ;i++)
					{
						String data=itemListCount.get(i).getText();
						
						if(data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 334, 6)))
						{
							itemListCount.get(i).click();
							
							break;
						}
					}
						
					enter_ItemTxt.sendKeys(Keys.TAB);	
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_UnitTxt));
					enter_UnitTxt.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 335, 6));
					enter_Quantity.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 336, 6));
					enter_Rate.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					enter_Gross.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
					saveBtn.click();
						
				    String expSaveMessageWithOutBatch=excelReader.getCellData(xlSheetName, 335, 7);
					
					String validationMessage=checkValidationMessage(expSaveMessageWithOutBatch);
					
					excelReader.setCellData(xlfile, xlSheetName, 335, 8, validationMessage);

					System.out.println("Click On Save Without Input Of Batch Value Actual  : " + validationMessage + "  Value Expected   : " + "TRUE");

					if(validationMessage.equalsIgnoreCase(expSaveMessageWithOutBatch))
					{
						
						System.out.println("Test Pass : Error Message Is As Expected");
						
						excelReader.setCellData(xlfile, xlSheetName, 334, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Error Message Is NOT As Expected");
						
						excelReader.setCellData(xlfile, xlSheetName, 334, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 334, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}	
			  }
				
				
				
			  public boolean checkOpeningStocksNewEditAndUpdateBatchNoWithoutExpiryDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
					select1stRow_6thColumn.click();
							
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
					enter_Batch.click();
					enter_Batch.clear();
					enter_Batch.sendKeys(excelReader.getCellData(xlSheetName, 337, 6));
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
					select2ndRow_1stColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
					saveBtn.click();
					
					String expSaveMessageWithOutBatchExpiry=excelReader.getCellData(xlSheetName, 338, 7);
					
					String validationMessage=checkValidationMessage(expSaveMessageWithOutBatchExpiry);
					
					excelReader.setCellData(xlfile, xlSheetName, 338, 8, validationMessage);
							
					System.out.println("Entry Page Save With Input Of Batch Value Actual  : " + validationMessage + "  Value Expected   : " + "TRUE");
				
				
					if(validationMessage.equalsIgnoreCase(expSaveMessageWithOutBatchExpiry))
					{
						System.out.println("Test Pass : Error Message Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 337, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test fail : Error Message NOT Displayed");
						excelReader.setCellData(xlfile, xlSheetName, 337, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 337, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			  }

			 
			  public boolean checkOpeningStocksNewVoucherEditByUpdateExpiryDateInFirstRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			    try
			    {

			    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
					select1stRow_8thColumn.click();
					
					Calendar calendar = Calendar.getInstance();
					
				    calendar.add(Calendar.DATE, 2);
				
				    Date date = calendar.getTime();
				
				    DateFormat dfr = new SimpleDateFormat("dd/MM/yyyy");
				    
				    System.out.println(dfr.format(date).toString());
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
					enter_Expirydate.click();
					enter_Expirydate.sendKeys(Keys.END);
					enter_Expirydate.sendKeys(Keys.SHIFT,Keys.HOME);
					enter_Expirydate.sendKeys(dfr.format(date).toString());
					enter_Expirydate.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
					String actQtyR1         = select1stRow_3rdColumn.getText();
					String actRateR1        = select1stRow_4thColumn.getText();
					String actGrossR1       = select1stRow_5thColumn.getText();
					String actBatchR1       = select1stRow_6thColumn.getText();
					
					String expQtyR1         = excelReader.getCellData(xlSheetName, 340, 7);
					String expRateR1        = "10.00";//excelReader.getCellData(xlSheetName, 341, 7);
					String expGrossR1       = excelReader.getCellData(xlSheetName, 342, 7);
					String expBatchR1       = excelReader.getCellData(xlSheetName, 343, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 340, 8, actQtyR1);
					excelReader.setCellData(xlfile, xlSheetName, 341, 8, actRateR1);
					excelReader.setCellData(xlfile, xlSheetName, 342, 8, actGrossR1);
					excelReader.setCellData(xlfile, xlSheetName, 343, 8, actBatchR1);

					System.out.println("Qty Row 1 Value Actual    : " + actQtyR1     +       " Value Expected   : " + expQtyR1);
					System.out.println("Rate Row 1 Value Actual   : " + actRateR1    +       " Value Expected   : " + expRateR1);
					System.out.println("Gross Row 1 Value Actual  : " + actGrossR1   +       " Value Expected   : " + expGrossR1);
					System.out.println("Batch Row 1 Value Actual  : " + actBatchR1   +       " Value Expected   : " + expBatchR1);
					
					
					if(actQtyR1.equalsIgnoreCase(expQtyR1) && actRateR1.equalsIgnoreCase(expRateR1) && actGrossR1.equalsIgnoreCase(expGrossR1)
							&& actBatchR1.equalsIgnoreCase(expBatchR1))
					{
						System.out.println("Test Pass : Data Entered in First Row");
						excelReader.setCellData(xlfile, xlSheetName, 339, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Data NOT Entered in First Row");
						excelReader.setCellData(xlfile, xlSheetName, 339, 9, resFail);
						return false;
					}
			    }
			    catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 339, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}		
			  }
			  
			  
			  
			  public boolean checkEditAndUpdateBinBySelectingOtherBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_4thColumn));
			    	select2ndRow_4thColumn.click();
							
			    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					enter_Rate.click();
					enter_Rate.clear();
					enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 344, 6));
					enter_Rate.sendKeys(Keys.TAB);
			    	    	
			    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					enter_Gross.click();
					enter_Gross.sendKeys(Keys.TAB);
							
					enter_Bin.sendKeys(Keys.SPACE);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					binSearchBtn.click();
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));
					
					boolean actBinSearch = binSearchTxt.isDisplayed();
					boolean expBinSearch = true;
					
					System.out.println("Entry Page Bin Search Value Actual  : " + actBinSearch + "    Value Expected   : " + expBinSearch);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
					binselect2ndRow_8thColumn.click();
					enter_ToBeAllocateTxt.sendKeys(Keys.HOME);
					enter_ToBeAllocateTxt.sendKeys(Keys.SHIFT,Keys.END);
					enter_ToBeAllocateTxt.sendKeys(Keys.SPACE);
				
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_1stColumn));
					getAction().doubleClick(binselect3rdRow_1stColumn).build().perform();
					
					
					String actBinTotalQty           = binTotalQty.getAttribute("value");
					String actBinBaseUom            = binBaseUOM.getText();
					//[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]         = binBalanceTxt.getAttribute("value");
					
					//String actBinSum                = binSumInward.getText();
				
						
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
					
					 String expBinTotalQty               = excelReader.getCellData(xlSheetName, 346, 7);
		             String expBinBaseUom                = excelReader.getCellData(xlSheetName, 347, 7);
		             //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 348, 7);
		             String expBinSum                    = excelReader.getCellData(xlSheetName, 349, 7);
		             
		             excelReader.setCellData(xlfile, xlSheetName, 346, 8, actBinTotalQty);
		             excelReader.setCellData(xlfile, xlSheetName, 347, 8, actBinBaseUom);
		             //excelReader.setCellData(xlfile, xlSheetName, 348, 8, actBinBalanceQty);
		             //excelReader.setCellData(xlfile, xlSheetName, 349, 8, actBinSum);
		             
					 
					 Thread.sleep(2000);

					
					 int binInwardGridListCount = binInwardGridList.size();
		             
		             ArrayList<String> binInwardGridListArray = new ArrayList<String>();
		             
		             for(int i=0;i<binInwardGridListCount;i++)
		             {
		                     String data = binInwardGridList.get(i).getText();
		                     binInwardGridListArray.add(data);
		             }
		             
		             
		             String actbinInwardGridList=binInwardGridListArray.toString();
		             
		             String expbinInwardGridList=excelReader.getCellData(xlSheetName, 345, 7);
		             
		             excelReader.setCellData(xlfile, xlSheetName, 345, 8, actbinInwardGridList);
		             
		             System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
		             System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
		             
		             
		             boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
		                                         && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
		             
		             String actResult = Boolean.toString(actMethod);
		             
		             excelReader.setCellData(xlfile, xlSheetName, 344, 8, actResult.toUpperCase());
				
					System.out.println("Bin Search Value Actual                    :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					System.out.println("Bin Search Btn Value Actual                :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					
					System.out.println("Bin Auto Allocate Btn Value Actual         :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					System.out.println("Bin Pick Btn Value Actual                  :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					System.out.println("Bin Cancel Btn Value Actual                :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					System.out.println("Bin Ok Button                              :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
			
					
					System.out.println("Bin Total Qty Value Actual                  :  " + actBinTotalQty +         " Value Expected : " + expBinTotalQty);
					//System.out.println("Bin Sum of To Be Allocated Qty Value Actual :  " + actBinSum       +        " Value Expected : " + expBinSum);
						
					System.out.println("Bin Base Uom Value Actual            	    :  " + actBinBaseUom +          " Value Expected : " + expBinBaseUom);
					//System.out.println("Bin Balance Txt Value Actual          		:  " + actBinBalanceQty +       " Value Expected : " + expBinBalanceQty);
						
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
					binOkBtn.click();
					
					String actBinName      = excelReader.getCellData(xlSheetName, 350, 7);
					String expBinName      = select2ndRow_7thColumn.getText();
					
					excelReader.setCellData(xlfile, xlSheetName, 350, 8, actBinName);
					
					System.out.println("Bin Column in Voucher Value Actual          : " + actBinName +              " Value Exepected  : " + expBinName);
					
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_7thColumn));
							
					if(actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
							&& actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn
							
							&& actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
							
							&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
							/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
							
							/*&& actBinSum.equalsIgnoreCase(expBinSum)*/
							
							&& select2ndRow_7thColumn.getText().equalsIgnoreCase(actBinName))
						
					{
						System.out.println("Selected Bin And Ok Btn Not Enabled");
						excelReader.setCellData(xlfile, xlSheetName, 344, 9, resPass);
						return true;
						
					}
					else
					{
						System.out.println("Not Selected Bin And Ok Btn Not Enabled");
						excelReader.setCellData(xlfile, xlSheetName, 344, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 344, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			  }
			  
			  
			

			  //RMA Checking in voucher 
			  
			  public boolean checkEditOpeningStocksNewVoucherRMAItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
						enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 351, 6));
						enter_Quantity.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
						enter_Rate.click();
						enter_Rate.clear();
						enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 352, 6));
						enter_Rate.sendKeys(Keys.TAB);
						
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
						saveBtn.click();
						
						String expValidationMessage=excelReader.getCellData(xlSheetName, 352,7);
			
						String actValidationMessage=checkValidationMessage(expValidationMessage);
						
						excelReader.setCellData(xlfile, xlSheetName, 352, 8, actValidationMessage);
						
						System.out.println("Units Column Value is display On Select       : " + actValidationMessage +  "  Value Expected : " + expValidationMessage);
						
						if(actValidationMessage.equalsIgnoreCase(expValidationMessage))
						{
							System.out.println("***Test Pass: RMA Popup Screen Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 351, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("***Test Fail: RMA Popup Screen NOT Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 351, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 351, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
			  
			  
			  
			  public boolean checkEditOpeningStocksNewVoucherRMAPopUpOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			  {	
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
						select3rdRow_5thColumn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
						enter_RMA.sendKeys(Keys.SPACE);
						
						int rmaInwardPopRmaNoListCount = rmaInwardPopRmaNoList.size();
						
						System.err.println("rmaInwardPopRmaNoList  : "+rmaInwardPopRmaNoListCount);
						
						ArrayList<String> rmaInwardPopRmaNoListArray = new ArrayList<String>();
						
						for(int i=0;i<rmaInwardPopRmaNoListCount;i++)
						{
							String data=rmaInwardPopRmaNoList.get(i).getAttribute("data-value");
							rmaInwardPopRmaNoListArray.add(data);
						}
						
						System.err.println("rmaInwardPopRmaNoListArray : "+rmaInwardPopRmaNoListArray);
						
						String actrmaInwardPopRmaNoList = rmaInwardPopRmaNoListArray.toString();
						String exprmaInwardPopRmaNoList = excelReader.getCellData(xlSheetName, 354, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 354, 8, actrmaInwardPopRmaNoList);
						
						
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
						
						excelReader.setCellData(xlfile, xlSheetName, 353, 8, actResult.toUpperCase());
							
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
									
						if(actMethod==true  && actrmaInwardPopRmaNoList.equalsIgnoreCase(exprmaInwardPopRmaNoList))
						{
							System.out.println("***Test Pass: RMA Popup Screen Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 353, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("***Test Fail: RMA Popup Screen NOT Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 353, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 353, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
			  
			  
			  
			  public boolean checkEditOpeningStocksNewVoucherRMAAddButtonOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			  {	
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
					
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
						rmaAddBtn.click();
						
						getWaitForAlert();
						
						String actAlert=getAlert().getText();
						String expAlert=excelReader.getCellData(xlSheetName, 356, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 356, 8, actAlert);
						
						System.out.println("Alert On Clicking Add With Empty Inputs   : "+actAlert	   +"  Value Expected : "+expAlert);
						
						getAlert().accept();
						
						if(actAlert.equalsIgnoreCase(expAlert))
						{
							System.out.println("***Test Pass: RMA Popup Screen Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 355, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("***Test Fail: RMA Popup Screen NOT Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 355, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						String exception =e.getMessage().substring(0, 50);
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 355, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
			  
			  

			  public boolean checkEditOpeningStocksNewVoucherRMAOkButtonOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			  {	
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
						rmaOkBtn.click();
						
						getWaitForAlert();
						
						String actAlertOnOK=getAlert().getText();
						
						String expAlertOnOK=excelReader.getCellData(xlSheetName, 358, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 358, 8, actAlertOnOK);
					
				        System.out.println("Test Pass : alert Dipalyed : " + actAlertOnOK               + " Value Expected : " + expAlertOnOK);
						
						getAlert().dismiss();
						
						if(actAlertOnOK.equalsIgnoreCase(expAlertOnOK))
						{
							System.out.println("***Test Pass: RMA Popup Screen Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 357, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("***Test Fail: RMA Popup Screen NOT Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 357, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 357, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
			  

			  public boolean checkEditOpeningStocksNewVoucherRMAClearButtonOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			  {	
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
						
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaTableRow1ClearBtn));
						rmaTableRow1ClearBtn.click();
					
						boolean actRmavalueR1=rmaTableRow1Column1.getText().isEmpty();
						
						boolean expRmavalueR1=true;
			
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaClearBtn));
						rmaClearBtn.click();
						
						boolean actRmavalueR2=rmaTableRow2Column1.getText().isEmpty();
						
						boolean expRmavalueR2=true;
						
						boolean actRmavalueR3=rmaTableRow3Column1.getText().isEmpty();
						
						boolean expRmavalueR3=true;
						
						boolean actRmavalueR4=rmaTableRow4Column1.getText().isEmpty();
						
						boolean expRmavalueR4=true;
						
						boolean actRmavalueR5=rmaTableRow5Column1.getText().isEmpty();
						
						boolean expRmavalueR5=true;
						
						boolean actMethod = actRmavalueR1==expRmavalueR1 && actRmavalueR2==expRmavalueR2 && actRmavalueR3==expRmavalueR3
											&& actRmavalueR4==expRmavalueR4 && actRmavalueR5==expRmavalueR5;
						
						String actResult = Boolean.toString(actMethod);
						
						excelReader.setCellData(xlfile, xlSheetName, 359, 8, actResult.toUpperCase());
						
						System.out.println("RmavalueR1 Value Actual : " +actRmavalueR1 + " Value Expected : " + expRmavalueR1 );
						System.out.println("RmavalueR2 Value Actual : " +actRmavalueR2 + " Value Expected : " + expRmavalueR2 );
						System.out.println("RmavalueR3 Value Actual : " +actRmavalueR3 + " Value Expected : " + expRmavalueR3 );
						System.out.println("RmavalueR4 Value Actual : " +actRmavalueR4 + " Value Expected : " + expRmavalueR4 );
						System.out.println("RmavalueR5 Value Actual : " +actRmavalueR5 + " Value Expected : " + expRmavalueR5 );
						
						if(actMethod==true)
						{
							System.out.println("***Test Pass: RMA Popup Screen Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 359, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("***Test Fail: RMA Popup Screen NOT Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 359, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 359, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
			  
			  
			  
			  public boolean checkEditOpeningStocksNewVoucherAddingNewSerialNumbersOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			  {	
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
						rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 360, 6));
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
						rmaAddBtn.click();
								
						String  actRmaRow1=rma_EnterRMA.getAttribute("value");
						String  expRmaRow1=excelReader.getCellData(xlSheetName, 361, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 361, 8, actRmaRow1);
						
						
						int rmaInwardPopRmaNoListCount = rmaInwardPopRmaNoList.size();
						
						System.err.println("rmaInwardPopRmaNoList  : "+rmaInwardPopRmaNoListCount);
						
						ArrayList<String> rmaInwardPopRmaNoListArray = new ArrayList<String>();
						
						for(int i=1;i<rmaInwardPopRmaNoListCount;i++)
						{
							String data=rmaInwardPopRmaNoList.get(i).getAttribute("data-value");
							rmaInwardPopRmaNoListArray.add(data);
						}
						
						System.err.println("rmaInwardPopRmaNoListArray : "+rmaInwardPopRmaNoListArray);
						
						String actrmaInwardPopRmaNoList = rmaInwardPopRmaNoListArray.toString();
						String exprmaInwardPopRmaNoList = excelReader.getCellData(xlSheetName, 362, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 362, 8, actrmaInwardPopRmaNoList);
						
						System.out.println("rmaInwardPopRmaNoList  Value Actual  : " + actrmaInwardPopRmaNoList + " Value Expected : " + exprmaInwardPopRmaNoList);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
						rmaOkBtn.click();
						
						
						if(actRmaRow1.equalsIgnoreCase(expRmaRow1) && actrmaInwardPopRmaNoList.equalsIgnoreCase(exprmaInwardPopRmaNoList))
						{
							System.out.println("***Test Pass: RMA Popup Screen Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 360, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("***Test Fail: RMA Popup Screen NOT Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 360, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						String exception =e.getMessage().substring(0, 50);
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 360, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
			  

				
			  public boolean checkEditOpeningStocksNewStockItemInFourthRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_3rdColumn));
					select4thRow_3rdColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
					enter_Quantity.sendKeys(excelReader.getCellData(xlSheetName, 363, 6));
					enter_Quantity.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
					enter_Rate.click();
					enter_Rate.clear();
					enter_Rate.sendKeys(excelReader.getCellData(xlSheetName, 364, 6));
					enter_Rate.sendKeys(Keys.TAB);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					enter_Gross.sendKeys(Keys.TAB);

					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select4thRow_3rdColumn));
					String act1            = select4thRow_3rdColumn.getText();
					String act2            = select4thRow_4thColumn.getText();
					String act3            = select4thRow_5thColumn.getText();
				
					String exp1,exp2,exp3,exp4;
					
					exp1                   = excelReader.getCellData(xlSheetName, 364, 7);
					exp2                   = excelReader.getCellData(xlSheetName, 365, 7);
					exp3                   = excelReader.getCellData(xlSheetName, 366, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 364, 8, act1);
					excelReader.setCellData(xlfile, xlSheetName, 365, 8, act1);
					excelReader.setCellData(xlfile, xlSheetName, 366, 8, act1);
				
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			        String docno=documentNumberTxt.getAttribute("value");
					
			        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
					saveBtn.click();
					
					boolean actVoucherSaveMessageWithDocumentNo  = checkVoucherSavingMessage(docno);
					boolean expVoucherSaveMessageWithDocumentNo  = true;
					
					String actResult = Boolean.toString(actVoucherSaveMessageWithDocumentNo);
					
					excelReader.setCellData(xlfile, xlSheetName, 363, 8, actResult.toUpperCase());
					
					System.out.println("Voucher Saving Message With Document No :  " + actVoucherSaveMessageWithDocumentNo + " Value Expected : "+ expVoucherSaveMessageWithDocumentNo);
					
					if(act1.equalsIgnoreCase(exp1) && act2.equalsIgnoreCase(exp2)
							&& act3.equalsIgnoreCase(exp3) && actVoucherSaveMessageWithDocumentNo==expVoucherSaveMessageWithDocumentNo)
					{
						System.out.println("Test Pass : Voucher Saved Successfully");
										
						excelReader.setCellData(xlfile, xlSheetName, 363, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Voucher NOT Saved Successfully");
									
						excelReader.setCellData(xlfile, xlSheetName, 363, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					String exception =e.getMessage().substring(0, 50);
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 363, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
					                         
			  }
			  

			  
			  public boolean checkOpeningStocksNewUpdateVoucherOnClickPreviousInEntryPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
						previousBtn.click();
						
						boolean loading=checkLoadingMessage();
						
						System.out.println("VoucherLoadingMessage  : " + loading + " Value Expected : " + "TRUE");
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
						documentNumberTxt.click();
						
						String actdocNumber,expdocNumber;
						
						actdocNumber=documentNumberTxt.getAttribute("value");
						expdocNumber=excelReader.getCellData(xlSheetName, 368, 7);
						
						System.out.println("Document Number  : " + actdocNumber + " Value Expected : " + expdocNumber);
						
						excelReader.setCellData(xlfile, xlSheetName, 368, 8, actdocNumber);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_footerExpandBtn));
						new_footerExpandBtn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
						wareHouseTxt.click();
				
						String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
						String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 369, 7);
						
						System.out.println("Warehouse : " + actOsVoucherWarehouse + " Value Expected : " + expOsVoucherWarehouse);
						
						excelReader.setCellData(xlfile, xlSheetName, 369, 8, actOsVoucherWarehouse);
							
						String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
						
						String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
						
						actOsVoucherFooterQty=QtyAmount.getText();
						actOsVoucherFooterGross=GrossAmount.getText();
						actOsVoucherFooterNet=netAmount.getText();
						
						
						expOsVoucherFooterQty=excelReader.getCellData(xlSheetName, 371, 7);
						expOsVoucherFooterGross=excelReader.getCellData(xlSheetName, 372, 7);
						expOsVoucherFooterNet=excelReader.getCellData(xlSheetName, 373, 7);		
						
						System.out.println("Warehouse : " + actOsVoucherFooterQty +   " Value Expected : " + expOsVoucherFooterQty);
						System.out.println("Warehouse : " + actOsVoucherFooterGross + " Value Expected : " + expOsVoucherFooterGross);
						System.out.println("Warehouse : " + actOsVoucherFooterNet +   " Value Expected : " + expOsVoucherFooterNet);
						
						excelReader.setCellData(xlfile, xlSheetName, 371, 8, actOsVoucherFooterQty);
						excelReader.setCellData(xlfile, xlSheetName, 372, 8, actOsVoucherFooterGross);
						excelReader.setCellData(xlfile, xlSheetName, 373, 8, actOsVoucherFooterNet);
						
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
						 String expvoucherGridBodyList=excelReader.getCellData(xlSheetName, 370, 7);
						 
						 excelReader.setCellData(xlfile, xlSheetName, 370, 8, actvoucherGridBodyList);
						 
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
						
							excelReader.setCellData(xlfile, xlSheetName, 367, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : Saved Data is NOT As Expected");
							
							excelReader.setCellData(xlfile, xlSheetName, 367, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 367, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}	
			  
			  
			  
			  public boolean checkOpeningStocksNewVoucherCopyAndPasteFromClipBoardOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
						toggleBtn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyToClipBoardOption));
						copyToClipBoardOption.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_newBtn));
						new_newBtn.click();
					
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
						toggleBtn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardOption));
						pasteFromClipBoardOption.click();
						
						checkUserFriendlyMessage();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
						documentNumberTxt.click();
						
						String actdocNumber,expdocNumber;
						
						actdocNumber=documentNumberTxt.getAttribute("value");
						expdocNumber=excelReader.getCellData(xlSheetName, 375, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 375, 8, actdocNumber);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
						wareHouseTxt.click();
				
						String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
						String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 376, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 376, 8, actOsVoucherWarehouse);
								
						
						
						String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
						
				
						String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
				
					
						
						expOsVoucherFooterQty=excelReader.getCellData(xlSheetName, 378, 7);
						expOsVoucherFooterGross=excelReader.getCellData(xlSheetName, 379, 7);
						expOsVoucherFooterNet=excelReader.getCellData(xlSheetName, 380, 7);
							
						
						System.out.println(netAmount.getText());
						System.out.println(QtyAmount.getText());
						System.out.println(GrossAmount.getText());
						
					
						actOsVoucherFooterQty=QtyAmount.getText();
						actOsVoucherFooterGross=GrossAmount.getText();
						actOsVoucherFooterNet=netAmount.getText();
						
						excelReader.setCellData(xlfile, xlSheetName, 378, 8, actOsVoucherFooterQty);
						excelReader.setCellData(xlfile, xlSheetName, 379, 8, actOsVoucherFooterGross);
						excelReader.setCellData(xlfile, xlSheetName, 380, 8, actOsVoucherFooterNet);
						
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
						 
						 String expvoucherGridBodyList=excelReader.getCellData(xlSheetName, 377, 7);
						 
						 excelReader.setCellData(xlfile, xlSheetName, 377, 8, actvoucherGridBodyList);
						 
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
							System.out.println("Test Pass : Copy And Paste From ClipBoard Working");
							excelReader.setCellData(xlfile, xlSheetName, 374, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : Copy And Paste From ClipBoard NOT Working");
							excelReader.setCellData(xlfile, xlSheetName, 374, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 374, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
			  
			  
			  
			  public boolean checkOpeningStocksNewVoucherInputBatchAndBinPopupOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
					select1stRow_6thColumn.click();
					
		            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
					enter_Batch.click();
					enter_Batch.clear();
					enter_Batch.sendKeys(excelReader.getCellData(xlSheetName, 381, 6));
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
					select1stRow_8thColumn.click();
					
					Calendar calendar = Calendar.getInstance();
					
				    calendar.add(Calendar.DATE, 2);
				
				    Date date = calendar.getTime();
				
				    DateFormat dfr = new SimpleDateFormat("dd/MM/yyyy");
				    
				    System.out.println(dfr.format(date).toString());
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
					enter_Expirydate.click();
					enter_Expirydate.sendKeys(Keys.END);
					enter_Expirydate.sendKeys(Keys.SHIFT,Keys.HOME);
					enter_Expirydate.sendKeys(dfr.format(date).toString());
					enter_Expirydate.sendKeys(Keys.TAB);
					
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_5thColumn));
					select2ndRow_5thColumn.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
					enter_Gross.click();
					enter_Gross.sendKeys(Keys.TAB);
							
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchTxt));

					  boolean actBinSearchTxt                = binSearchTxt.isDisplayed();
					  boolean actBinSearchBtn                = binSearchBtn.isDisplayed();
					 
					  boolean actBinAutoAllocateBtn          = binAutoAllocateBtn.isDisplayed();
					  boolean actBinPickBtn                  = binPickBtn.isDisplayed();
					  boolean actBinCancelBtn                = binCancelBtn.isDisplayed();
					  boolean actBinOkBtn                    = binOkBtn.isEnabled();
					  
					  boolean expBinSearchTxt                = true;
					  boolean expBinSearchBtn                = true;
					  boolean expBinAlternateCategory        = true;
					  boolean expBinAutoAllocateBtn          = true;
					  boolean expBinPickBtn                  = true;
					  boolean expBinCancelBtn                = true;
					  boolean expBinOkBtn                    = true;
					  
					  System.out.println("Bin Search Value Actual                :  " + actBinSearchTxt +         " Value Expected : " + expBinSearchTxt);
					  System.out.println("Bin Search Btn Value Actual            :  " + actBinSearchBtn +         " Value Expected : " + expBinSearchBtn);
					  System.out.println("Bin Auto Allocate Btn Value Actual     :  " + actBinAutoAllocateBtn +   " Value Expected : " + expBinAutoAllocateBtn);
					  System.out.println("Bin Pick Btn Value Actual              :  " + actBinPickBtn +           " Value Expected : " + expBinPickBtn);
					  System.out.println("Bin Cancel Btn Value Actual            :  " + actBinCancelBtn +         " Value Expected : " + expBinCancelBtn);
					  System.out.println("Bin Ok Btn Value Actual                :  " + actBinOkBtn +             " Value Expected : " + expBinOkBtn);
						
						
					  String actBinTotalQty             = binTotalQty.getAttribute("value");
					  String actBinBaseUom              = binBaseUOM.getText();
					  //[, BG1, , 0.00, , 0.00, 0.00, 0.00, 0.00, , , , 0.00, , , , , , Bin4, , 0.00, , 90.00, 0.00, 90.00, 90.00, , , , 0.00, , , , , , Bin5, , 0.00, , 98.00, 0.00, 98.00, 98.00, , , , 0.00, , , , ]           = binBalanceTxt.getAttribute("value");
					  //String actBinSum                  = binSumInward.getText();
					
						
						
					  String expBinTotalQty               = excelReader.getCellData(xlSheetName, 383, 7);
					  String expBinBaseUom                = excelReader.getCellData(xlSheetName, 384, 7);
					  //String expBinBalanceQty             = excelReader.getCellData(xlSheetName, 385, 7);
					  String expBinSum                    = excelReader.getCellData(xlSheetName, 386, 7);
				        
					  excelReader.setCellData(xlfile, xlSheetName, 383, 8, actBinTotalQty);
					  excelReader.setCellData(xlfile, xlSheetName, 384, 8, actBinBaseUom);
					 //excelReader.setCellData(xlfile, xlSheetName, 385, 8, actBinBalanceQty);
					  //excelReader.setCellData(xlfile, xlSheetName, 386, 8, actBinSum);
					  
					  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
					binSearchBtn.click();
					
					Thread.sleep(2000);
					  
					  int binInwardGridListCount = binInwardGridList.size();
					  
					  ArrayList<String> binInwardGridListArray = new ArrayList<String>();
					  
					  for(int i=0;i<binInwardGridListCount;i++)
					  {
						  String data = binInwardGridList.get(i).getText();
						  binInwardGridListArray.add(data);
					  }	
				        	
				        
					  String actbinInwardGridList=binInwardGridListArray.toString();
					  
					  String expbinInwardGridList=excelReader.getCellData(xlSheetName, 382, 7);
					  
					  excelReader.setCellData(xlfile, xlSheetName, 382, 8, actbinInwardGridList);
					  
					  System.out.println("ActbinInwardGridList : " + actbinInwardGridList);
					  System.out.println("ExpbinInwardGridList : " + expbinInwardGridList);
					  
					  boolean actMethod = actBinSearchTxt==expBinSearchTxt && actBinSearchBtn==expBinSearchBtn 
							  && actBinAutoAllocateBtn==expBinAutoAllocateBtn && actBinPickBtn==expBinPickBtn && actBinCancelBtn==expBinCancelBtn;
				        	
					  String actResult = Boolean.toString(actMethod);
				        
					  excelReader.setCellData(xlfile, xlSheetName, 381, 8, actResult.toUpperCase());
					  

						
					  System.out.println("Bin Total Qty               :  " +actBinTotalQty +            "  Value Expected : "  + expBinTotalQty);
					  System.out.println("Bin Base Uom                :  " +actBinBaseUom +             "  Value Expected : "  + expBinBaseUom);
					  ////System.out.println("Bin Balance Txt             :  " +actBinBalanceQty +          "  Value Expected : "  + expBinBalanceQty);
						
					  //System.out.println("Bin Total To Be Adjusted    :  " + actBinSum +                "  Value Expected : "  + expBinSum);
								
					  if(actMethod==true && actbinInwardGridList.equalsIgnoreCase(expbinInwardGridList)
								
								&& actBinTotalQty.equalsIgnoreCase(expBinTotalQty) && actBinBaseUom.equalsIgnoreCase(expBinBaseUom) 
								/*&& actBinBalanceQty.equalsIgnoreCase(expBinBalanceQty)*/
								
								/*&& actBinSum.equalsIgnoreCase(expBinSum)*/)
					{
						System.out.println("Test Pass : Bin Popup options Are As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 381, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 381, 9, resFail);
						return false;
					}
				}
				catch (Exception e) 
				{
					excelReader.setExceptionInExcel(xlfile, xlSheetName, 381, 10, e.getMessage());
					System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					return false;
				}
			  }
				
				
			  public boolean checkOpeningStocksNewVoucherCopyAndPasteThroughAllocateQtyInBinPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
				 try
				 {
					 
						
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binAutoAllocateBtn));
					 binAutoAllocateBtn.click();
					 
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_8thColumn));
					 String actbinselect2ndRow_8thColumn = binselect2ndRow_8thColumn.getText();
					 String expbinselect2ndRow_8thColumn = excelReader.getCellData(xlSheetName, 388, 7);
					 
					 excelReader.setCellData(xlfile, xlSheetName, 388, 8, actbinselect2ndRow_8thColumn);
					 
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect3rdRow_8thColumn));
					 String actbinselect3rdRow_8thColumn = binselect3rdRow_8thColumn.getText();
					 String expbinselect3rdRow_8thColumn = excelReader.getCellData(xlSheetName, 389, 7);
					 
					 excelReader.setCellData(xlfile, xlSheetName, 389, 8, actbinselect3rdRow_8thColumn);
					 
					 System.out.println("binselect2ndRow_8thColumn Value Actual   : " + actbinselect2ndRow_8thColumn  + " Value Expected : " + expbinselect2ndRow_8thColumn);
					 System.out.println("binselect3rdRow_8thColumn Value Actual   : " + actbinselect3rdRow_8thColumn  + " Value Expected : " + expbinselect3rdRow_8thColumn);
					  
					 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
					 binOkBtn.click();
						
					String actBinName      = select2ndRow_7thColumn.getText();
					String expBinName      = excelReader.getCellData(xlSheetName, 390, 7);
					
					excelReader.setCellData(xlfile, xlSheetName, 390, 8, actBinName);
					
					System.out.println("Bin Column in Voucher Value Actual          : " + actBinName +              " Value Exepected  : " + expBinName);
					 
					 
					 if(actbinselect2ndRow_8thColumn.equalsIgnoreCase(expbinselect2ndRow_8thColumn)
							 && actbinselect3rdRow_8thColumn.equalsIgnoreCase(expbinselect3rdRow_8thColumn))
					 {
						 System.out.println("Test Pass : Bin Popup options Are As Expected");
						 excelReader.setCellData(xlfile, xlSheetName, 387, 9, resPass);
						 
						
						 return true;
					 }
					 else
					 {
						 System.out.println("Test Fail : Bin Popup options Are NOT As Expected");
						 excelReader.setCellData(xlfile, xlSheetName, 387, 9, resFail);
						
						
						 return false;
					 }
				 }
				 catch (Exception e) 
				 {
					 excelReader.setExceptionInExcel(xlfile, xlSheetName, 387, 10, e.getMessage());
					 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					 return false;
				 }
			  }
			  
			  
			  
			  public boolean checkOpeningStocksNewSaveInputRMAPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
				{	
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
					
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_5thColumn));
						select3rdRow_5thColumn.click();
				
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.click();
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
						rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 391, 6));
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
						rmaAddBtn.click();
								
						// Actual
						String  actRmaRow1=rma_EnterRMA.getAttribute("value");
						String 	actRmaRow2=rmaTableRow2Column1.getText();
						String 	actRmaRow3=rmaTableRow3Column1.getText();
						
						// Expected
						String  expRmaRow1=excelReader.getCellData(xlSheetName, 392, 7);
						String 	expRmaRow2=excelReader.getCellData(xlSheetName, 393, 7);
						String 	expRmaRow3=excelReader.getCellData(xlSheetName, 394, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 392, 8, actRmaRow1);
						excelReader.setCellData(xlfile, xlSheetName, 393, 8, actRmaRow2);
						excelReader.setCellData(xlfile, xlSheetName, 394, 8, actRmaRow3);
						
						System.out.println("************************************* checkRmaWithSerialNumbersNotCompletely *********************************");
						
						System.out.println("Rma Row 1 Serial Number   : "+actRmaRow1	   +"  Value Expected : "+expRmaRow1);
						System.out.println("Rma Row 2 Serial Number   : "+actRmaRow2	   +"  Value Expected : "+expRmaRow2);
						System.out.println("Rma Row 3 Serial Number   : "+actRmaRow3	   +"  Value Expected : "+expRmaRow3);
						
						if(actRmaSerialNumberTxtField==exprmaSerialNumberTxtField && actRmaQuantityTxtField==exprmaQuantityTxtField  && actRmaAddBtn==exprmaAddBtn
								&& actRmaNumberofItemsLabel==exprmaNumberofItemsLabel && actRmaNumberofItemsLabel==exprmaTableHeadingRMA
								&& actRmaTableHeadingDocumentNo==exprmaTableHeadingDocumentNo && actRmaTableHeadingDocumentDate==exprmaTableHeadingDocumentDate
								&& actRmaClearBtn==exprmaClearBtn && actRmaOkBtn==exprmaOkBtn && actRmaCancelBtn==exprmaCancelBtn && actRmaCloseBtn==exprmaCloseBtn)
						{
							System.out.println("***Test Pass: RMA Popup Screen Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 391, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("***Test Fail: RMA Popup Screen NOT Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 391, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						String exception =e.getMessage().substring(0, 50);
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 391, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}

			  
			  public boolean checkOpeningStocksNewOkButtonRMAPopupScreenBatchBinAndRmaColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		     {	
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
					
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
						rmaOkBtn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
						enter_RMA.sendKeys(Keys.TAB);
						
						String actOsVoucherBatchR1=select1stRow_6thColumn.getText();
						String expOsVoucherBatchR1=excelReader.getCellData(xlSheetName, 396, 7);
			
						String actOsVoucherBinR2=select2ndRow_7thColumn.getText();
						String expOsVoucherBinR2=excelReader.getCellData(xlSheetName, 397, 7);
			
						String actOsVoucherRMAR3=select3rdRow_9thColumn.getText();
						String expOsVoucherRMAR3=excelReader.getCellData(xlSheetName, 398, 7);	
							
						System.out.println("Rma Serial Number Text Field 	   : " + actOsVoucherBatchR1	    +   "  Value Expected : " + expOsVoucherBatchR1);
						System.out.println("Rma Qty Field              	 	   : " + actOsVoucherBinR2		    +   "  Value Expected : " + expOsVoucherBinR2);
						System.out.println("Rma Add Button 					   : " + actOsVoucherRMAR3		    +   "  Value Expected : " + expOsVoucherRMAR3);
			
						excelReader.setCellData(xlfile, xlSheetName, 396, 8, actOsVoucherBatchR1);
						excelReader.setCellData(xlfile, xlSheetName, 397, 8, actOsVoucherBinR2);
						excelReader.setCellData(xlfile, xlSheetName, 398, 8, actOsVoucherRMAR3);
								
						if(actOsVoucherBatchR1.equalsIgnoreCase(expOsVoucherBatchR1) && actOsVoucherBinR2.equalsIgnoreCase(expOsVoucherBinR2)
								&& actOsVoucherRMAR3.equalsIgnoreCase(expOsVoucherRMAR3))
						{
							System.out.println("***Test Pass: RMA Popup Screen Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 395, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("***Test Fail: RMA Popup Screen NOT Appeared with all the Options***");
							excelReader.setCellData(xlfile, xlSheetName, 395, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 395, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
			  
			  
			  
			  
			  
			  public boolean checkOpeningStocksNewVoucherSaveThroughCopyDocument() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
					
					String actResult = Boolean.toString(actVoucherSaveMessageWithDocumentNo);
					
					excelReader.setCellData(xlfile, xlSheetName, 399, 8, actResult.toUpperCase());
					
					System.out.println("Voucher Saving Message With Document No :  " + actVoucherSaveMessageWithDocumentNo + " Value Expected : "+ expVoucherSaveMessageWithDocumentNo);
					
					if(actVoucherSaveMessageWithDocumentNo==expVoucherSaveMessageWithDocumentNo)
					{
						System.out.println("Test Pass : Voucher Saved Successfully");

						
						excelReader.setCellData(xlfile, xlSheetName, 399, 9, resPass);
						return true;
					}
					else
					{
						System.out.println("Test Fail : Voucher NOT Saved Successfully");
					

						
						excelReader.setCellData(xlfile, xlSheetName, 399, 9, resFail);
						return false;
					}
				  }
				  catch (Exception e) 
				  {
			
					  excelReader.setExceptionInExcel(xlfile, xlSheetName, 399, 10, e.getMessage());
					  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
					  return false;
				  }                        
				}
			  
			  
			  public boolean checkOpeningStocksNewSaveVoucherThroughCopyAndPasteFromVClipboardOnClickPreviousInEntryPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			  {
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
						previousBtn.click();
						
						boolean loading=checkLoadingMessage();
						
						System.out.println("VoucherLoadingMessage  : "+loading +" Value Expected : "+"true");
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
						documentNumberTxt.click();
						
						String actdocNumber,expdocNumber;
						
						actdocNumber=documentNumberTxt.getAttribute("value");
						expdocNumber=excelReader.getCellData(xlSheetName, 401, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 401, 8, actdocNumber);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
						wareHouseTxt.click();
				
						String actOsVoucherWarehouse=wareHouseTxt.getAttribute("value");
						String expOsVoucherWarehouse=excelReader.getCellData(xlSheetName, 402, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 402, 8, actOsVoucherWarehouse);
								
						
						
						
						String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
						
				
						
						
						String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;
				
					
						
						
						expOsVoucherFooterQty=excelReader.getCellData(xlSheetName, 404, 7);
						expOsVoucherFooterGross=excelReader.getCellData(xlSheetName, 405, 7);
						expOsVoucherFooterNet=excelReader.getCellData(xlSheetName, 406, 7);
						
						
						
						
						
						System.out.println(netAmount.getText());
						System.out.println(QtyAmount.getText());
						System.out.println(GrossAmount.getText());
						
						
						
						
						actOsVoucherFooterQty=QtyAmount.getText();
						actOsVoucherFooterGross=GrossAmount.getText();
						actOsVoucherFooterNet=netAmount.getText();
						
						excelReader.setCellData(xlfile, xlSheetName, 404, 8, actOsVoucherFooterQty);
						excelReader.setCellData(xlfile, xlSheetName, 405, 8, actOsVoucherFooterGross);
						excelReader.setCellData(xlfile, xlSheetName, 406, 8, actOsVoucherFooterNet);
						
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
						 
						 String expvoucherGridBodyList=excelReader.getCellData(xlSheetName, 403, 7);
						 
						 excelReader.setCellData(xlfile, xlSheetName, 403, 8, actvoucherGridBodyList);
						 
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
						
							excelReader.setCellData(xlfile, xlSheetName, 400, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : Saved Data is NOT As Expected");
							
							excelReader.setCellData(xlfile, xlSheetName, 400, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 400, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}  
				}	
			  
			  
			  
			  public boolean checkOpeningStocksNewVoucherToDeleteOnClickOkButtonInAlertMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					
					
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_DeleteBtn));
						new_DeleteBtn.click();
						
						getWaitForAlert();
						
						String actAlertMessage=getAlert().getText();
						
						String expAlertMessage=excelReader.getCellData(xlSheetName, 408, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 408, 8, actAlertMessage);
					
						System.out.println("Alert Message on Deleteing the Voucher :  "+actAlertMessage +"  "+expAlertMessage);
						
						getAlert().accept();
						
						boolean deleteMessage=checkEntryPageDeleteMessage();
						
						System.out.println("DeleteMesssage  : "+deleteMessage+" Value Expected : "+"TRUE");
					
					
						if(actAlertMessage.contains(expAlertMessage) && deleteMessage==true)
						{
							System.out.println("Test Pass : Deleted Voucher");
							
							excelReader.setCellData(xlfile, xlSheetName, 407, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : NOT Deleted Voucher");
							
							excelReader.setCellData(xlfile, xlSheetName, 407, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 407, 10, e.getMessage());
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
				

				public boolean checkOpeningStocksNewCopyDocumentOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
						String actdocNumber=documentNumberTxt.getAttribute("value");
						String expdocNumber=excelReader.getCellData(xlSheetName, 410, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 410, 8, actdocNumber);
						
						System.out.println("documnet Number : "+actdocNumber+""+expdocNumber);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
						toggleBtn.click();
						
						boolean actCopydocument=copyDocumentOption.isDisplayed();
						
						boolean expCopydocument=true;
						
						String actResult = Boolean.toString(actCopydocument);
						
						excelReader.setCellData(xlfile, xlSheetName, 409, 8, actResult.toUpperCase());
						
						System.out.println("Copy Document Option : "+actCopydocument+""+expCopydocument);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyDocumentOption));
						
						if(actdocNumber.equalsIgnoreCase(expdocNumber) && actCopydocument==expCopydocument)
						{
							System.out.println("Test Pass : Copy Document Option Displayed");
							
							excelReader.setCellData(xlfile, xlSheetName, 409, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : Copy Document Option NOT Displayed");
							
							excelReader.setCellData(xlfile, xlSheetName, 409, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						String exception =e.getMessage().substring(0, 50);
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 409, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
					


				public boolean checkOpeningStocksNewCopyDocumentScreenOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
						
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_vouchertypeTxt));
						
						boolean actMethod = actcd_vouchertypeTxt==expcd_vouchertypeTxt && actcd_searchOnDropdown1==expcd_searchOnDropdown1
											&& actcd_searchOnDropdown2==expcd_searchOnDropdown2 && actcd_searchTxt==expcd_searchTxt
											&& actcd_refreshBtn==expcd_refreshBtn && actcd_filterBtn==expcd_filterBtn
											&& actcd_HeaderChkBox==expcd_HeaderChkBox && actcd_FirstChkBox==expcd_FirstChkBox
											&& actcd_clubsimilarTransChkBox==expcd_clubsimilarTransChkBox && actcd_SelectallBtn==expcd_SelectallBtn
											&& actcd_firstBtn==expcd_firstBtn && actcd_PreviousBtn==expcd_PreviousBtn
											&& actcd_PageNo==expcd_PageNo && actcd_nextBtn==expcd_nextBtn
											&& actcd_LastBtn==expcd_LastBtn && actcd_OkBtn==expcd_OkBtn && actcd_CancelBtn==expcd_CancelBtn;
						
						String actResult = Boolean.toString(actMethod);
						
						excelReader.setCellData(xlfile, xlSheetName, 411, 8, actResult.toUpperCase());
						
						if(actMethod==true)
						{
							System.out.println("Test Pass : Copy Document Options Are As Expected");
							excelReader.setCellData(xlfile, xlSheetName, 411, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : Copy Document Options Are NOT As Expected");
							excelReader.setCellData(xlfile, xlSheetName, 411, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						String exception =e.getMessage().substring(0, 50);
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 411, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}

					
				@FindBy(xpath="//*[@id='id_copydoc_grid2_tbody']/tr/td")
				private static List<WebElement> cd_tableList;
				
				public boolean checkOpeningStocksNewFirstRowCheckboxInCopyDocument() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FirstChkBox));
						cd_FirstChkBox.click();
						
						/*String actCopyDocItemR1=cd_R1C2.getText();
						String actCopyDocUnitR1=cd_R1C3.getText();
						String actCopyDocQtyR1=cd_R1C4.getText();
						String actCopyDocRateR1=cd_R1C5.getText();
						String actCopyDocGrossR1=cd_R1C6.getText();
						String actCopyDocBatchR1=cd_R1C7.getText();
						
						String actCopyDocItemR2=cd_R2C2.getText();
						String actCopyDocUnitR2=cd_R2C3.getText();
						String actCopyDocQtyR2=cd_R2C4.getText();
						String actCopyDocRateR2=cd_R2C5.getText();
						String actCopyDocGrossR2=cd_R2C6.getText();
						String actCopyDocBinR2=cd_R1C8.getText();
						
						String actCopyDocItemR3=cd_R3C2.getText();
						String actCopyDocUnitR3=cd_R3C3.getText();
						String actCopyDocQtyR3=cd_R3C4.getText();
						String actCopyDocRateR3=cd_R3C5.getText();
						String actCopyDocGrossR3=cd_R3C6.getText();
						String actCopyDocRMAR3=cd_R3C10.getText();
						
						String actCopyDocItemR4=cd_R4C2.getText();
						String actCopyDocUnitR4=cd_R4C3.getText();
						String actCopyDocQtyR4=cd_R4C4.getText();
						String actCopyDocRateR4=cd_R4C5.getText();
						String actCopyDocGrossR4=cd_R4C6.getText();
						String actCopyDocBatchR4=cd_R4C7.getText();
						
						// expected values
						String expCopyDocItemR1="BR COGS ITEM";
						String expCopyDocUnitR1="Dozs";
						String expCopyDocQtyR1="10.00";
						String expCopyDocRateR1="10.00";
						String expCopyDocGrossR1="100.00";
						String expCopyDocBatchR1="OSH_COGS1";
						
						String expCopyDocItemR2="FIFO COGS ITEM";
						String expCopyDocUnitR2="Dozs";
						String expCopyDocQtyR2="1.00";
						String expCopyDocRateR2="100.00";
						String expCopyDocGrossR2="100.00";
						String expCopyDocBinR2="Bin5";
						
						String expCopyDocItemR3="WA COGS ITEM";
						String expCopyDocUnitR3="Pcs";
						String expCopyDocQtyR3="10.00";
						String expCopyDocRateR3="10.00";
						String expCopyDocGrossR3="100.00";
						String expCopyDocRMAR3="HYD_OS@Rma1,HYD_OS@Rma2,HYD_OS@Rma3,HYD_OS@Rma4,HYD_OS@Rma5,HYD_OS@Rma6,HYD_OS@Rma7,HYD_OS@Rma8,HYD_OS@Rma9,HYD_OS@Rma10";
						
						String expCopyDocItemR4="STD RATE COGS ITEM";
						String expCopyDocUnitR4="Dozs";
						String expCopyDocQtyR4="10.00";
						String expCopyDocRateR4="10.00";
						String expCopyDocGrossR4="100.00";
					
						
						System.out.println("Copy Doc Item Row 1 Value Actual      : " + actCopyDocItemR1 +  " Value Expected : " + expCopyDocItemR1);
						System.out.println("Copy Doc Unit Row 1  Value Actual     : " + actCopyDocUnitR1 +  " Value Expected : " + expCopyDocUnitR1);
						System.out.println("Copy Doc Qty Row 1  Value Actual      : " + actCopyDocQtyR1 +   " Value Expected : " + expCopyDocQtyR1);
						System.out.println("Copy Doc Rate Row 1 Value Actual      : " + actCopyDocRateR1 +  " Value Expected : " + expCopyDocRateR1);
						System.out.println("Copy Doc Gross Row 1 Value Actual     : " + actCopyDocGrossR1 + " Value Expected : " + expCopyDocGrossR1);
						System.out.println("Copy Doc Batch Row 1 Value Actual     : " + actCopyDocBatchR1 + " Value Expected : " + expCopyDocBatchR1);
					 	
						System.out.println("Copy Doc Item Row 2 Value Actual      : " + actCopyDocItemR2 +  " Value Expected : " + expCopyDocItemR2);
						System.out.println("Copy Doc Unit Row 2 Value Actual      : " + actCopyDocUnitR2 +  " Value Expected : " + expCopyDocUnitR2);
						System.out.println("Copy Doc Qty Row 2 Value Actual       : " + actCopyDocQtyR2 +   " Value Expected : " + expCopyDocQtyR2);
						System.out.println("Copy Doc Rate Row 2 Value Actual      : " + actCopyDocRateR2 +  " Value Expected : " + expCopyDocRateR2);
						System.out.println("Copy Doc Gross Row 2 Value Actual     : " + actCopyDocGrossR2 + " Value Expected : " + expCopyDocGrossR2);
						System.out.println("Copy Doc Bin Row 2 Value Actual       : " + actCopyDocBinR2 +   " Value Expected : " + expCopyDocBinR2);
						
						System.out.println("Copy Doc Item Row 3 Value Actual      : " + actCopyDocItemR3 +  " Value Expected : " + expCopyDocItemR3);
						System.out.println("Copy Doc Unit Row 3 Value Actual      : " + actCopyDocUnitR3 +  " Value Expected : " + expCopyDocUnitR3);
						System.out.println("Copy Doc Qty Row 3 Value Actual       : " + actCopyDocQtyR3 +   " Value Expected : " + expCopyDocQtyR3);
						System.out.println("Copy Doc Rate Row 3 Value Actual      : " + actCopyDocRateR3 +  " Value Expected : " + expCopyDocRateR3);
						System.out.println("Copy Doc Gross Row 3 Value Actual     : " + actCopyDocGrossR3 + " Value Expected : " + expCopyDocGrossR3);
						System.out.println("Copy Doc RMA Row 3 Value Actual       : " + actCopyDocRMAR3 +   " Value Expected : " + expCopyDocRMAR3);
						
						System.out.println("Copy Doc Item Row 4 Value Actual      : " + actCopyDocItemR4 +  " Value Expected : " + expCopyDocItemR4);
						System.out.println("Copy Doc Unit Row 4 Value Actual      : " + actCopyDocUnitR4 +  " Value Expected : " + expCopyDocUnitR4);
						System.out.println("Copy Doc Qty Row 4 Value Actual       : " + actCopyDocQtyR4 +   " Value Expected : " + expCopyDocQtyR4);
						System.out.println("Copy Doc Rate Row 4 Value Actual      : " + actCopyDocRateR4 +  " Value Expected : " + expCopyDocRateR4);
						System.out.println("Copy Doc Gross Row 4  Value Actual    : " + actCopyDocGrossR4 + " Value Expected : " + expCopyDocGrossR4);*/
						
						int cd_tableListCount = cd_tableList.size();
						
						ArrayList<String> cd_tableListArray = new ArrayList<String>();
						
						for(int i=0;i<cd_tableListCount;i++)
						{
							if(i==8)
							{
								String data ="Expiry Date";
								cd_tableListArray.add(data);
							}
							else
							{
								String data = cd_tableList.get(i).getText();
								cd_tableListArray.add(data);
							}
						}
						
						String actcd_tableList = cd_tableListArray.toString();
						
						String expcd_tableList = "[1, , BR COGS ITEM, Dozs, 10, 10, 100, OSH_COGS1, Expiry Date, 24-2-2021, , 2, , FIFO COGS ITEM, Dozs, 1, 100, 100, , Bin5, , , 3, , WA COGS ITEM, Pcs, 10, 10, 100, , , , HYD_OS@Rma1,HYD_OS@Rma2,HYD_OS@Rma3,HYD_OS@Rma4,HYD_OS@Rma5,HYD_OS@Rma6,HYD_OS@Rma7,HYD_OS@Rma8,HYD_OS@Rma9,HYD_OS@Rma10, 4, , STD RATE COGS ITEM, Dozs, 10, 10, 100, , , , ]";			
						excelReader.setCellData(xlfile, xlSheetName, 413, 8, actcd_tableList);
						
						System.out.println("actcd_tableList : " + actcd_tableList);
						System.out.println("expcd_tableList : " + expcd_tableList);
						
						
						if(actcd_tableList.equalsIgnoreCase(expcd_tableList))
						{
							
						
							excelReader.setCellData(xlfile, xlSheetName, 412, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : Copy Document Options Are NOT As Expected");
							excelReader.setCellData(xlfile, xlSheetName, 412, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						String exception =e.getMessage().substring(0, 50);
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 412, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}

				
				
				public boolean checkLoadingVoucherInformationFromCopyDocumentOnClickOnOk() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_OkBtn));
						cd_OkBtn.click();
						
			            Thread.sleep(4000);
						
			            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
						documentNumberTxt.click();
						
						String actdocNumber,expdocNumber;
						
						actdocNumber  = documentNumberTxt.getAttribute("value");
						expdocNumber  = excelReader.getCellData(xlSheetName, 415, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 415, 8, actdocNumber);
						
					    System.out.println("Voucher Document Number Value Actual    :  " + actdocNumber  +  " Value Expected :  " + expdocNumber);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
						wareHouseTxt.click();
				
						String actOsVoucherWarehouse = wareHouseTxt.getAttribute("value");
						String expOsVoucherWarehouse = excelReader.getCellData(xlSheetName, 416, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 416, 8, actOsVoucherWarehouse);
										
						System.out.println("Voucher Warehouse Value Actual    :  " + actOsVoucherWarehouse  +  " Value Expected :  " + expOsVoucherWarehouse);
						
						Thread.sleep(4000);
						
						String actOsVoucherFooterQty,actOsVoucherFooterGross,actOsVoucherFooterNet;
						
						String expOsVoucherFooterQty,expOsVoucherFooterGross,expOsVoucherFooterNet;

						expOsVoucherFooterQty   = "31.00";
						expOsVoucherFooterGross = "400.00";
						expOsVoucherFooterNet   = "400.00";
					
						actOsVoucherFooterQty   = QtyAmount.getText();
						actOsVoucherFooterGross = GrossAmount.getText();
						actOsVoucherFooterNet   = netAmount.getText();
						
				        System.out.println("osVoucherFooterQty Value Actual    :  " + actOsVoucherFooterQty  +  " Value Expected :  " + expOsVoucherFooterQty);
				        System.out.println("osVoucherFooterGross Value Actual  :  " + actOsVoucherFooterGross + " Value Expected :  " + expOsVoucherFooterGross);
				        System.out.println("osVoucherFooterNet Value Actual    :  " + actOsVoucherFooterNet +   " Value Expected :  " + expOsVoucherFooterNet);
										
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
						 
						 String expvoucherGridBodyList=excelReader.getCellData(xlSheetName, 417, 7);
						 
						 excelReader.setCellData(xlfile, xlSheetName, 417, 8, actvoucherGridBodyList);
						 
						 System.out.println("voucherGridBodyList Actual   : " + actvoucherGridBodyList);
						 System.out.println("voucherGridBodyList Expected : " + expvoucherGridBodyList);
							
						if(actdocNumber.equalsIgnoreCase(expdocNumber)
								&& actOsVoucherWarehouse.equalsIgnoreCase(expOsVoucherWarehouse)
								
								&& actOsVoucherFooterQty.equalsIgnoreCase(expOsVoucherFooterQty) && actOsVoucherFooterGross.equalsIgnoreCase(expOsVoucherFooterGross) 
								&& actOsVoucherFooterNet.equalsIgnoreCase(expOsVoucherFooterNet) && actvoucherGridBodyList.equalsIgnoreCase(expvoucherGridBodyList))
						{
							System.out.println("Test Pass : Saved Data is As Expected");
							
							excelReader.setCellData(xlfile, xlSheetName, 414, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : Saved Data is NOT As Expected");
							
							excelReader.setCellData(xlfile, xlSheetName, 414, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						String exception =e.getMessage().substring(0, 50);
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 414, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
				
				// create a method of copy document after issue resolves 

				public boolean checkSavingVoucherByCopyDocumentWithMandatoryCheck() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
					
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
						saveBtn.click();
						
						String expBATCHErrorMessage=excelReader.getCellData(xlSheetName, 422, 7);
						
						String validationMessageBatch=checkValidationMessage(expBATCHErrorMessage);
						
						excelReader.setCellData(xlfile, xlSheetName, 422, 8, validationMessageBatch);
			
						System.out.println("Message On Saving Voucher Copy Document without Input Of Batch :  "+validationMessageBatch +"  "+"TRUE");
			
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
						select1stRow_6thColumn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
						enter_Batch.click();
						enter_Batch.sendKeys(excelReader.getCellData(xlSheetName, 421, 6));
						enter_Batch.sendKeys(Keys.TAB);
						
						Calendar calendar = Calendar.getInstance();
						
					    calendar.add(Calendar.DATE, 2);
					
					    Date date = calendar.getTime();
					
					    DateFormat dfr = new SimpleDateFormat("dd/MM/yyyy");
					    
					    System.out.println(dfr.format(date).toString());
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
						enter_Expirydate.click();
						enter_Expirydate.sendKeys(Keys.END);
						enter_Expirydate.sendKeys(Keys.SHIFT,Keys.HOME);
						enter_Expirydate.sendKeys(dfr.format(date).toString());
						enter_Expirydate.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
						saveBtn.click();
			
						String expBINErrorMessage=excelReader.getCellData(xlSheetName, 423, 7);
						
						String validationMessageBin=checkValidationMessage(expBINErrorMessage);
						
						excelReader.setCellData(xlfile, xlSheetName, 423, 8, validationMessageBin);
			
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
						select2ndRow_5thColumn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binSearchBtn));
						binSearchBtn.click();
						
						Thread.sleep(2000);
			
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binselect2ndRow_1stColumn));
						getAction().doubleClick(binselect2ndRow_1stColumn).build().perform();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binOkBtn));
						binOkBtn.click();
						
						Thread.sleep(2000);
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
						saveBtn.click();
						
						String expRMAErrorMessage=excelReader.getCellData(xlSheetName, 424, 7);
						
						String validationMesssageRma=checkValidationMessage(expRMAErrorMessage);
						
						excelReader.setCellData(xlfile, xlSheetName, 424, 8, validationMesssageRma);
			
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
						select3rdRow_5thColumn.click();;
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
						enter_Gross.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaSerialNumberTxtField));
						rmaSerialNumberTxtField.click();
						rmaSerialNumberTxtField.sendKeys(excelReader.getCellData(xlSheetName, 422, 6));
						rmaSerialNumberTxtField.sendKeys(Keys.TAB);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaAddBtn));
						rmaAddBtn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rmaOkBtn));
						rmaOkBtn.click();
						
						Thread.sleep(2000);
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RMA));
						enter_RMA.click();
						enter_RMA.sendKeys(Keys.TAB);
						
						/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
						select4thRow_6thColumn.click();;
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
						enter_Batch.click();
						enter_Batch.sendKeys("OSHBR");
						enter_Batch.sendKeys(Keys.TAB);*/
			
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				        String docno=documentNumberTxt.getAttribute("value");
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
						saveBtn.click();
						
						boolean savingMessage=checkVoucherSavingMessage(docno);
						
						String actResult = Boolean.toString(savingMessage);
						
						excelReader.setCellData(xlfile, xlSheetName, 421, 8, actResult.toUpperCase());
						
						System.out.println("SavingMessage  :  "+savingMessage +" Value Expected : "+"TRUE");
									
						if(validationMessageBatch.equalsIgnoreCase(expBATCHErrorMessage) && validationMessageBin.equalsIgnoreCase(expBINErrorMessage) && 
							validationMesssageRma.equalsIgnoreCase(expRMAErrorMessage) && savingMessage==true)
						{
							System.out.println("Test Pass : Error Message Is As Expected");
			
							excelReader.setCellData(xlfile, xlSheetName, 421, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : Error Message Is NOT As Expected");
			
							excelReader.setCellData(xlfile, xlSheetName, 421, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						String exception =e.getMessage().substring(0, 50);
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 421, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				
					
				}
				
				
				
				
				public boolean checkOpeningStocksNewVoucherRevertChangeOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
					try
					{
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
						previousBtn.click();
					
						boolean loading=checkLoadingMessage();
						
						System.out.println("VoucherLoadingMessage Value Actual  : " + loading + " Value Expected : " + " TRUE ");
									
						
						Thread.sleep(2000);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocks_NarrationTxt));
						openingStocks_NarrationTxt.click();
						
						openingStocks_NarrationTxt.sendKeys(excelReader.getCellData(xlSheetName, 425, 6));
						openingStocks_NarrationTxt.sendKeys(Keys.TAB);
						
						String actNarrationText=openingStocks_NarrationTxt.getAttribute("value");
						String expNarrationText=excelReader.getCellData(xlSheetName, 426, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 426, 8, actNarrationText);
						
						System.out.println("Narration Text  :  "+actNarrationText +"  "+expNarrationText);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
						toggleBtn.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(revertChanges));
						revertChanges.click();
									
						getWaitForAlert();
						
						boolean alertPresent=getIsAlertPresent();
						
				
						if(actNarrationText.equalsIgnoreCase(expNarrationText) && alertPresent==true)		
						{
							
							
							String actAlert=getAlert().getText();
							String expAlert1=excelReader.getCellData(xlSheetName, 427, 7);
							
							String expAlert2=excelReader.getCellData(xlSheetName, 428, 7);
							
							excelReader.setCellData(xlfile, xlSheetName, 427, 8, actAlert);
							
							System.out.println("Alert On Revert Changes  :  "+actAlert +"  "+expAlert1+""+expAlert2);
							
							System.out.println("Test Pass : Alert Displayed");
							excelReader.setCellData(xlfile, xlSheetName, 425, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test fail : Alert NOT Displayed");
							excelReader.setCellData(xlfile, xlSheetName, 425, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						String exception =e.getMessage().substring(0, 50);
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 425, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
						return false;
					}
				}
				
						
				
				public boolean checkOKButtonOnRevertChanges() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					try
					{
						
						System.out.println("Test Pass : Alert Displayed");
						
						getAlert().accept();
						
						boolean loading=checkLoadingMessage();
						
						System.out.println("VoucherLoadingMessage  : "+loading+" Value Expected : "+"TRUE");
					
						Thread.sleep(2000);
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingStocks_NarrationTxt));
						openingStocks_NarrationTxt.click();
						
						String actNarrationText=openingStocks_NarrationTxt.getAttribute("value");
						String expNarrationText=excelReader.getCellData(xlSheetName, 430, 7);
						
						System.out.println("Narration Text After Revert Change :  "+actNarrationText +"  "+expNarrationText);
						
						if(actNarrationText.equalsIgnoreCase(expNarrationText))
						{
							System.out.println("Test Fail : revert Changes NOT Working As expected");
							excelReader.setCellData(xlfile, xlSheetName, 429, 9, resFail);
							return false;
						}
						else
						{
							System.out.println("Test pass : revert Changes Working As expected");
							excelReader.setCellData(xlfile, xlSheetName, 429, 9, resPass);
							return true;
						}
					}
					catch (Exception e) 
					{
						String exception =e.getMessage().substring(0, 50);
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 429, 10, e.getMessage());
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
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				        String docno=documentNumberTxt.getAttribute("value");
						
				        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_SuspendBtn));
						new_SuspendBtn.click();
						
						boolean savingMessage=checkVoucherSavingMessage(docno);
						
						System.out.println("SavingMessage  :  " + savingMessage + " Value Expected : " + " TRUE ");
						
						
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
						
						boolean actMethod = actHomePageNewBtnIsDisplayed==expHomePageNewBtnIsDisplayed  && actHomePageEditBtn==expHomePageEditBtn && actHomePagePrintBtn==expHomePagePrintBtn
											&& actHomePageDeleteBtn==expHomePageDeleteBtn  && actHomePageSuspendBtn==expHomePageSuspendBtn 
											&& actHomePagePrintBarcodeBtn==expHomePagePrintBarcodeBtn && actHomePageExportXMLBtn==expHomePageExportXMLBtn
											&& actHomePageSettingsBtn==expHomePageSettingsBtn && actHomePageCloseBtn==expHomePageCloseBtn && actHomePageGridCheckBox==expHomePageGridCheckBox
											&& actHomePageSortingBtn==expHomePageSortingBtn && actHomePageCreateViewBn==expHomePageCreateViewBn && actHomePageCustomizeBtn==expHomePageCustomizeBtn
											&& actHomePageFilterBtn==expHomePageFilterBtn && actHomePageRefreshBtn==expHomePageRefreshBtn && actHomePageOptionsBtn==expHomePageOptionsBtn
											&& actHomePageExportBtn==expHomePageExportBtn  ;
						
						String actResult = Boolean.toString(actMethod);
						
						excelReader.setCellData(xlfile, xlSheetName, 441, 8, actResult.toUpperCase());
						
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
						String expopeningStocksNewToolBarButtons = excelReader.getCellData(xlSheetName, 442, 7);
					
						System.out.println("actopeningStocksNewToolBarButtons  : " + actopeningStocksNewToolBarButtons);
						System.out.println("expopeningStocksNewToolBarButtons  : " + expopeningStocksNewToolBarButtons);
						
						excelReader.setCellData(xlfile, xlSheetName, 442, 8, actopeningStocksNewToolBarButtons);	
						
						String actsetAsDefaultView		=	setAsDefaultView.getText();
						String expsetAsDefaultView		=	excelReader.getCellData(xlSheetName, 443, 7);
						excelReader.setCellData(xlfile, xlSheetName, 443, 8, actsetAsDefaultView);
						
						
						//Ribbon Control Icons
				        int count1		= headingOptions.size();
						
						ArrayList<String> headingButtons = new ArrayList<String>();
						
						for (int i = 1; i < count1; i++) 
						{
							String data=headingOptions.get(i).getAttribute("title");
							
							headingButtons.add(data);
						}
						
						String actHeadingButtons = headingButtons.toString();
						String expHeadingButtons = excelReader.getCellData(xlSheetName, 444, 7);
						excelReader.setCellData(xlfile, xlSheetName, 444, 8, actHeadingButtons);
						
						
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
						String expHeaderTxt = excelReader.getCellData(xlSheetName, 445, 7);
						excelReader.setCellData(xlfile, xlSheetName, 445, 8, actHeaderTxt);
						
						
						System.out.println("actopeningStocksNewHomePageColumnsButtons  : " + actHeaderTxt);
						System.out.println("expopeningStocksNewHomePageColumnsButtons  : " + expHeaderTxt);
						
						
						System.out.println("Count Of Header Columns in Suspend View Home Page Value Actual  :  " + actHeaderTxt + " Value Expected : " + expHeaderTxt);
						
						String actHomePageVoucherNo     = openingStocksNewHomeRow1VoucherNo.getText();
						String actHomePageCreatedBy     = openingStocksNewHomeRow1CreatedBy.getText();
						String actHomePageModifiedBy    = openingStocksNewHomeRow1ModifiedBy.getText();
						String actHomePageSuspendBy     = openingStocksNewHomeRow1SuspendStatus.getText();
						String actHomePageAuthorizedBy  = openingStocksNewHomeRow1AuthorizationStatus.getText();
						
						String expHomePageVoucherNo     = excelReader.getCellData(xlSheetName, 446, 7);
						String expHomePageCreatedBy     = excelReader.getCellData(xlSheetName, 447, 7);
						String expHomePageModifiedBy    = excelReader.getCellData(xlSheetName, 448, 7);
						String expHomePageSuspendBy     = excelReader.getCellData(xlSheetName, 449, 7);
						String expHomePageAuthorizeBy   = excelReader.getCellData(xlSheetName, 450, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 446, 8, actHomePageVoucherNo);
						excelReader.setCellData(xlfile, xlSheetName, 447, 8, actHomePageCreatedBy);
						excelReader.setCellData(xlfile, xlSheetName, 448, 8, actHomePageModifiedBy);
						excelReader.setCellData(xlfile, xlSheetName, 449, 8, actHomePageSuspendBy);
						excelReader.setCellData(xlfile, xlSheetName, 450, 8, actHomePageAuthorizedBy);
						
						System.out.println("Voucher No in Home Page Value Actual   :  " + actHomePageVoucherNo+    " Value Expected : " + expHomePageVoucherNo);
						System.out.println("Created By in Home Page Value Actual   :  " + actHomePageCreatedBy+    " Value Expected : " + expHomePageCreatedBy);
						System.out.println("Modified By in Home Page Value Actual  :  " + actHomePageModifiedBy+   " Value Expected : " + expHomePageModifiedBy);
						System.out.println("Suspend By in Home Page Value Actual   :  " + actHomePageSuspendBy+    " Value Expected : " + expHomePageSuspendBy);
						System.out.println("Authorize By in Home Page Value Actual :  " + actHomePageAuthorizedBy+ " Value Expected : " + expHomePageAuthorizeBy);
						
						int actopeningStocksNewHomePageTableRowsCount = openingStocksNewHomePageTableRowsCount.size();
						
						String actRowCountInHomePage = Integer.toString(actopeningStocksNewHomePageTableRowsCount);
						String expRowCountInHomePage = excelReader.getCellData(xlSheetName, 451, 7);
						
						excelReader.setCellData(xlfile, xlSheetName, 451, 8, actRowCountInHomePage);	
									
						System.out.println("Row Count in Suspend View Home Page Value Actual  :  " + actRowCountInHomePage + " Value Expected : " + expRowCountInHomePage);
												
						if(actMethod==true && actopeningStocksNewToolBarButtons.equalsIgnoreCase(expopeningStocksNewToolBarButtons)
								&& actHeadingButtons.equalsIgnoreCase(expHeadingButtons)
								&& actHeaderTxt.equalsIgnoreCase(expHeaderTxt))
						{
							System.out.println("Test Pass : HomeScreen Options Are Displayed");
							excelReader.setCellData(xlfile, xlSheetName, 441, 9, resPass);
							return true;
						}
						else
						{
							System.out.println("Test Fail : HomeScreen Options Are NOT Displayed");
							excelReader.setCellData(xlfile, xlSheetName, 441, 9, resFail);
							return false;
						}
					}
					catch (Exception e) 
					{
						excelReader.setExceptionInExcel(xlfile, xlSheetName, 441, 10, e.getMessage());
						System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
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
						
						Thread.sleep(3000);
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
						userNameDisplay.click();
						
						getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
						logoutOption.click();
						
						Thread.sleep(3000);
						
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
				
				@FindBy(xpath="//*[@id='userprofile']/li/span[2]")
				 private static WebElement logoutOption;	

				
				  public OpeningStockPage(WebDriver driver)
				  {
				    PageFactory.initElements(driver, this);	
				  }





}
