package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class JVVATPage extends BaseEngine
{

	@FindBy(xpath="//a[@id='2001']//span[contains(text(),'Cash and Bank')]")
	private static WebElement  cashAndBankMenu; 
	
	@FindBy(xpath="//a[@id='2002']//span[contains(text(),'Receipts')]")
	private static WebElement  receiptsVoucher;
		
	@FindBy(xpath="//a[@id='2003']//span[contains(text(),'Payments')]")
	private static WebElement  paymentsVoucher;
	
	
	@FindBy(xpath="//span[contains(text(),'Payments VAT')]")
	private static WebElement  paymentsVATVoucher;
	
	@FindBy(xpath="//span[contains(text(),'Receipts VAT')]")
	private static WebElement  recepitsVATVoucher;
	
	@FindBy(xpath="//span[contains(text(),'JV VAT View')]")
	private static WebElement  JVVATViewVoucher;
	
	
	
	
	
	//WEB ELEMENTS
	@FindBy(xpath="//*[@id='61']/span")
	private static WebElement  financialsTransactionMenu;

	
	

	
   @FindBy(xpath="//a[@class='transaction_viewname_anchor font-5']")
	private static WebElement  pendingBillsBtn;
	
	@FindBy(xpath="//tr[@id='trRender_1']//td//input")
	private static WebElement  pendingBillsGridRow1Chkbox;
	
	@FindBy(xpath="//tr[@id='trRender_2']//td//input")
	private static WebElement  pendingBillsGridRow2Chkbox;
	
	@FindBy(xpath="//tr[@id='trRender_3']//td//input")
	private static WebElement  pendingBillsGridRow3Chkbox;	
   
 
	

	
   
   @FindBy(xpath="//li[@id='navigationtab2']//span[contains(text(),'Miscellaneous')]")
   private static WebElement settingMiscellaneousTab;
                  
   @FindBy(xpath="//select[@id='misc_CurrencyAddCurrencyIn']")
   private static WebElement miscAddCurrencyDropdown;

   @FindBy(xpath="//input[@id='misc_currencyInputExchangeRate']")
   private static WebElement miscInputExchangeRateChkbox;

   @FindBy(xpath="//input[@id='misc_currencyInputLocalExchangeRate']")
   private static WebElement miscInputLocalExchangeRateChkbox;

   @FindBy(xpath="//select[@id='misc_arapDueDate']")
   private static WebElement miscDueDateDropdown;

   
   
   @FindBy(xpath="//span[@id='updateButton']")
   private static WebElement settingUpdateIcon;

   @FindBy(xpath="//i[@class='icon-close icon-font6']")
   private static WebElement settingCloseIcon;


   @FindBy(xpath="//label[contains(text(),'Copy Document')]")
   private static WebElement CopyDocumentBtn;
   
   @FindBy(xpath="//label[contains(text(),'Copy to Clipboard')]")
   private static WebElement copytoClipboardBtn;
   
   @FindBy(xpath="//label[contains(text(),'Paste from Clipboard')]")
   private static WebElement pastefromClipboardBtn;
   
   @FindBy(xpath="//label[contains(text(),'Raise a Cheque Return')]")
   private static WebElement raiseaChequeReturnBtn;
   
   @FindBy(xpath="//label[contains(text(),'Add To Stock')]")
   private static WebElement addToStockBtn;
   
   @FindBy(xpath="//label[contains(text(),'Posting details')]")
   private static WebElement postingDetailsBtn;
   
   @FindBy(xpath="//label[contains(text(),'Reverse Entry')]")
   private static WebElement reversEntryBtn;
   
   @FindBy(xpath="//label[contains(text(),'Export to XML')]")
   private static WebElement exporttoXMLBtn;
   
   @FindBy(xpath="//label[contains(text(),'Setting')]")
   private static WebElement settingBtn;
   
   @FindBy(xpath="//label[contains(text(),'Calculator')]")
   private static WebElement calculatorBtn;
   
   @FindBy(xpath="//label[contains(text(),'Auto Load')]")
   private static WebElement autoLoadBtn;

   

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
	@FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[1]/a")
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
  
  /* @FindBy(xpath="//span[@id='reportRefresh']")
   private static WebElement  refreshBtn;*/
  
   
   @FindBy(xpath="//span[@id='transhomeRefresh']")
   private static WebElement  refreshBtn;
  
   
   
 
   
   
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
	
	@FindBy(xpath="//input[@id='id_header_268435470']")
	private static WebElement  PDRVATPlaceOfSupplyTXt;
	
	
	
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
	
	@FindBy(xpath="//input[@id='id_header_67108927']")
	private static WebElement  paymentsVAT_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108920']")
	private static WebElement  recepitsVAT_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108921']")
	private static WebElement  recepitsVAT_ChequeNoTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108920']")
	private static WebElement  JVVAT_NarrationTxt;
	
	
	
	
	
	@FindBy(xpath="//input[@id='id_header_67108871']")
	private static WebElement  pettyCash_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108874']")
	private static WebElement  postDatedReceipts_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108968']")
	private static WebElement  PDRVAT_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108965']")
	private static WebElement  PDPVAT_NarrationTxt;
	
	
	@FindBy(xpath="//input[@id='id_header_268435471']")
	private static WebElement  PDPVAT_JuridictionTxt;
	
	@FindBy(xpath="//input[@id='id_header_268435470']")
	private static WebElement  PDRVAT_JuridictionTxt;
	
	
	
	
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
	
	@FindBy(xpath="//input[@id='id_header_67108960']")
	private static WebElement  debitNotes_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108911']")
	private static WebElement  debitNotesLineWise_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108893']")
	private static WebElement  creditNotes_NarrationTxt;
	
	
	@FindBy(xpath="//input[@id='id_header_67108962']")
	private static WebElement creditNotesVatNarrationTxt;
	
	
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
	
	@FindBy(xpath="//*[@id='id_header_67108923']")
	private static WebElement  openingStocksNEW_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108908']")
	private static WebElement  materialRequisition_NarrationTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108866']")
	private static WebElement  receipts_ChequeNoTxt;
	
	@FindBy(xpath="//input[@id='id_header_67108869']")
	private static WebElement  payments_ChequeNoTxt;
	
	
	@FindBy(xpath="//input[@id='id_header_67108930']")
	private static WebElement  paymentsVAT_ChequeNoTxt;
	
	
	
	
	
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
	
	@FindBy(xpath="//input[@id='id_body_16777306']")
	private static WebElement  enterpayVATTaxCode;
	
	@FindBy(xpath="//*[@id='id_body_16777304']")
	private static WebElement  enterReceiptsVATTaxCode;
	
	@FindBy(xpath="//input[@id='id_body_16777320']")
	private static WebElement  enterJVVATTaxCode;
	
	@FindBy(xpath="//input[@id='id_body_16777340']")
	private static WebElement  enterDebitVATTaxCode;
	               
	@FindBy(xpath="//input[@id='id_body_16777342']")
	private static WebElement  enterCreditVATTaxCode;
	
	
	
	
	
	@FindBy(xpath="//input[@id='id_body_16777346']")
	private static WebElement  enterTaxcode;
	
	@FindBy(xpath="//input[@id='id_body_16777344']")
	private static WebElement  enterPVPVATTaxcode;
	
	
	
	
	
	
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
			
			
		/*@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='w']")
		private static WebElement  workFlowBtn;
		                   
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//a[contains(text(),'New Workflow')]")
			private static WebElement  newWorkFlowOption;
					
		@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='d']")
		private static WebElement  otherDashlets;
					
			@FindBy(xpath="//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='id_Dashlet4']//a")
			private static WebElement  documentInfo;
*/
	/*@FindBy(xpath="//span[contains(@class,'icon-left-and-right-panel-icon icon-font6 no_padding_left_right')]")
	private static WebElement  infoSideBarMinimizeExpandBtn;	*/	
			
	@FindBy(xpath="//span[@class='icon-left-and-right-panel-icon icon-font6 no_padding_left_right']")
	private static WebElement  infoSideBarExpandBtn;


	// Footer Section
	@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
	private static WebElement  netLabel;
	
	@FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	private static WebElement  netAmount;

	@FindBy(xpath="//*[@id='id_transactionentry_summary_static']/div/div[1]")
	private static WebElement  footerAmtLabel;
	
	@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_16']")
	private static WebElement  footerAmount;
	
	
	
	
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
					
				@FindBy(xpath="//*[@id='2012']/span")
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
				
				@FindBy(xpath="//a[@id='2049']//span[contains(text(),'Opening Stocks New')]")
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
	@FindBy(xpath="/html/body/section/div[2]/header/nav/div/ul/li[6]/a/span")
	private static WebElement userNameDisplay;

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
	
	/*private static String xlSheetName = "SmokeVouchers";*/
	
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
	
	@FindBy(xpath = "//ul[@id='navigation_menu']/li[2]/ul/li/a/span")
	private static List<WebElement> financialsMenusList;

	@FindBy(xpath="//*[@id='62']/span")
	private static WebElement  financialsCreditManagementMenu; 

	@FindBy(xpath="//*[@id='81']/span")
    private static WebElement  financialsReportsMenu; 
    
	@FindBy(xpath="//*[@id='60']/div")
	private static WebElement  financialsMenu; 
	
	@FindBy(xpath="//*[@id='530']/span")
	private static WebElement  financialsFinalAccountsMenu; 
	 
	@FindBy(xpath="//*[@id='558']/span")
    private static WebElement  financialsReceivableAndPayableAnalysisMenu;
	    
	@FindBy(xpath="//*[@id='3301']/span")
	private static WebElement  financialsBudgetMenu;
	
	@FindBy(xpath="//*[@id='3311']/span")
	private static WebElement  financialsOnlinePaymentsMenu;
	
	
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;
	
	
	 @FindBy(id="ddlCompany")
	 private static WebElement companyDropDownList;
	 
	 
	 
	

		public boolean checkLoginToFinancialVouchers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			LoginPage lp=new LoginPage(getDriver()); 
			
			String unamelt="su";
					      
			String pawslt="su";
					      
			lp.enterUserName(unamelt);
			
			Thread.sleep(2000);
					
			lp.enterPassword(pawslt);
			
			
	        Thread.sleep(2000);
			
			lp.clickOnSignInBtn();
			
			//checkRefershPopOnlogin();
					        
			//checkPopUpWindow();

			Thread.sleep(5000);
					           	
			String userInfo=userNameDisplay.getText();
					    	
			System.out.println("User Info : "+userInfo);
					    	
			System.out.println("User Info Capture Text :"+userNameDisplay.getText());
					    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
					    	
			companyLogo.click();
					    	
			String getCompanyTxt=companyName.getText();
			String getLoginCompanyName=getCompanyTxt.substring(0, 19);
			System.out.println("company name :"+ getLoginCompanyName);
			companyLogo.click();
					    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
					    	
			String getDashboard=dashboard.getText();
		   
			System.out.println("getDashboard"+getDashboard);
			
			if(userInfo.equalsIgnoreCase("SU"))
			{

				System.out.println("Test Pass : Transaction Authorization is Displayed");
				return true;
				
			}
			else
			{
				System.out.println("Test Fail : Transaction Authorization is Displayed");
				return false;

			}
		
		}
		
		 @FindBy(xpath="//*[@id='2023']/span")
		private static WebElement  finTransJournalsMenu;
			
	 
		public boolean checkNavigationToJVVATVocher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
	   	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		  
	       System.err.println(" Entered   ************************");
			
			Thread.sleep(4000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finTransJournalsMenu));
			finTransJournalsMenu.click();
			
			/*getWebDriverWait().until(ExpectedConditions.elementToBeClickable(recepitsVATVoucher));
			recepitsVATVoucher.click();*/
					
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(JVVATViewVoucher));
			
			boolean JVVATViewVoucherMenu=JVVATViewVoucher.isDisplayed();
			
			String actJVVATViewVoucherMenu=Boolean.toString(JVVATViewVoucherMenu);
			
			String  expJVVATViewVoucherMenu=excelReader.getCellData("SmokeJVVATView", 7, 7);
			                                              
			excelReader.setCellData(xlfile, "SmokeJVVATView", 7, 8, actJVVATViewVoucherMenu.toUpperCase());
					
			
			
			System.out.println("Opening payments Voucher New Actual :"+actJVVATViewVoucherMenu +"  Value Expected :"+expJVVATViewVoucherMenu);
			
			
			if(actJVVATViewVoucherMenu.equalsIgnoreCase(expJVVATViewVoucherMenu))
			{
				System.out.println("Test Pass :  SmokeJVVATView Voucher Menu Label Menu   Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 6, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail :  SmokeJVVATView Voucher Menu Not   Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 6, 9, resFail);
				return false;
			}
			}
			



		public boolean checkJVVATViewVoucherHomeScreenOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(JVVATViewVoucher));
			JVVATViewVoucher.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		
			boolean actHomePageNewBtn         =newBtn.isDisplayed();
			boolean actHomePageEditBtn        =editBtn.isDisplayed();
			boolean actHomePagePrintBtn       =printBtn.isDisplayed();
			boolean actHomePageDeleteBtn      =deleteBtn.isDisplayed();
			boolean actHomePageSuspendBtn     =suspendBtn.isDisplayed();
			boolean actHomePageExportXMLBtn   =exportToXMLBtn.isDisplayed();
			boolean actHomePageSettingsBtn    =settingsBtn.isDisplayed();
			boolean actHomePageCloseBtn       =homeCloseBtn.isDisplayed();
			boolean actHomePageGridCheckBox   =grid_HeaderChkBox.isDisplayed();
			boolean actHomePageSortingBtn     =sortingBtn.isDisplayed();
			boolean actHomePageCreateViewBn   =createViewBtn.isDisplayed();
			boolean actHomePageCustomizeBtn   =customizeBtn.isDisplayed();
			boolean actHomePageFilterBtn      =filterBtn.isDisplayed();
			boolean actHomePageRefreshBtn     =refreshBtn.isDisplayed();
			boolean actHomePageOptionsBtn     =optionsBtn.isDisplayed();
			boolean actHomePageExportBtn      =exportBtn.isDisplayed();
			
			boolean expHomePageNewBtn         =true;
			boolean expHomePageEditBtn        =true;
			boolean expHomePagePrintBtn       =true;
			boolean expHomePageDeleteBtn      =true;
			boolean expHomePageSuspendBtn     =true;
			boolean expHomePageRejectBtn      =true;
			boolean expHomePageExportXMLBtn   =true;
			boolean expHomePageSettingsBtn    =true;
			boolean expHomePageCloseBtn       =true;
			boolean expHomePageGridCheckBox   =true;
			boolean expHomePageSortingBtn     =true;
			boolean expHomePageCreateViewBn   =true;
			boolean expHomePageCustomizeBtn   =true;
			boolean expHomePageFilterBtn      =true;
			boolean expHomePageRefreshBtn     =true;
			boolean expHomePageOptionsBtn     =true;
			boolean expHomePageExportBtn      =true;
			
			System.out.println("************************checkJVVATViewVoucherHomeScreenOptions********************************");
			System.out.println("******************************JVVATViewVoucher New Home Page Options  ********************************************");
			System.out.println("Home Page New Btn Value Actual           :"+actHomePageNewBtn+         "     Value Expected : "+expHomePageNewBtn);
			System.out.println("Home Page Edit Btn Value Actual          :"+actHomePageEditBtn+        "     Value Expected : "+expHomePageEditBtn);
			System.out.println("Home Page Print Btn Value Actual         :"+actHomePagePrintBtn+       "	 Value Expected : "+expHomePagePrintBtn);
			System.out.println("Home Page Delete Btn Value Actual        :"+actHomePageDeleteBtn+      "	 Value Expected : "+expHomePageDeleteBtn);
			System.out.println("Home Page Suspend Btn Value Actual       :"+actHomePageSuspendBtn+     "	 Value Expected : "+expHomePageSuspendBtn);
			System.out.println("Home Page Export XML Btn Value Actual    :"+actHomePageExportXMLBtn+   "	 Value Expected : "+expHomePageExportXMLBtn);
			System.out.println("Home Page Settings Btn Value Actual      :"+actHomePageSettingsBtn+    "	 Value Expected : "+expHomePageSettingsBtn);
			System.out.println("Home Page Close Btn Value Actual         :"+actHomePageCloseBtn+       "	 Value Expected : "+expHomePageCloseBtn);
			System.out.println("Home Page Grid check Value Actual        :"+actHomePageGridCheckBox+   "	 Value Expected : "+expHomePageGridCheckBox);
			System.out.println("Home Page Sorting Btn Value Actual       :"+actHomePageSortingBtn+     "	 Value Expected : "+expHomePageSortingBtn);
			System.out.println("Home Page Create View Btn Value Actual   :"+actHomePageCreateViewBn+   "	 Value Expected : "+expHomePageCreateViewBn);
			System.out.println("Home Page Customize Btn Value Actual     :"+actHomePageCustomizeBtn+   "	 Value Expected : "+expHomePageCustomizeBtn);
			System.out.println("Home Page Filter check Value Actual      :"+actHomePageFilterBtn+      "	 Value Expected : "+expHomePageFilterBtn);
			System.out.println("Home Page Refesh Btn Value Actual        :"+actHomePageRefreshBtn+     "	 Value Expected : "+expHomePageRefreshBtn);
			System.out.println("Home Page Options Btn Value Actual       :"+actHomePageOptionsBtn+     "	 Value Expected : "+expHomePageOptionsBtn);
			System.out.println("Home Page Export Btn Value Actual        :"+actHomePageExportBtn+      "	 Value Expected : "+expHomePageExportBtn);
			
			
			
			boolean actMethod=actHomePageNewBtn==expHomePageNewBtn  && actHomePageEditBtn==expHomePageEditBtn && actHomePagePrintBtn==expHomePagePrintBtn
					&& actHomePageDeleteBtn==expHomePageDeleteBtn  && actHomePageSuspendBtn==expHomePageSuspendBtn 
				    && actHomePageExportXMLBtn==expHomePageExportXMLBtn
					&& actHomePageSettingsBtn==expHomePageSettingsBtn && actHomePageCloseBtn==expHomePageCloseBtn && actHomePageGridCheckBox==expHomePageGridCheckBox
					&& actHomePageSortingBtn==expHomePageSortingBtn && actHomePageCreateViewBn==expHomePageCreateViewBn && actHomePageCustomizeBtn==expHomePageCustomizeBtn
					&& actHomePageFilterBtn==expHomePageFilterBtn && actHomePageRefreshBtn==expHomePageRefreshBtn && actHomePageOptionsBtn==expHomePageOptionsBtn
					&& actHomePageExportBtn==expHomePageExportBtn;
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData("SmokeJVVATView", 9, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 9, 8, actResult.toUpperCase());
			
			System.out.println(" Display Result : "+actResult +" Value Expected : "+expResult);
			
			if(actResult.equalsIgnoreCase(expResult))
			{
				System.out.println("Test Pass : HomeScreen Options Are Displayed");
			    excelReader.setCellData(xlfile, "SmokeJVVATView", 8, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : HomeScreen Options Are NOT Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 8, 9, resFail);
				return false;
			}
			}
			catch (Exception e) 
			  {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 8, 10, exception);
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
				  return false;
			  }
			}
			
		
		public boolean checkJVVATViewNewHomePageNewOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				Thread.sleep(2000);
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
				newBtn.click();
				
				checkUserFriendlyMessage();
				
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(freeFlowBtn));
				
				boolean PaymentsFreeFlowBtn=freeFlowBtn.isDisplayed();
				
				String actPaymentsFreeFlowBtn=Boolean.toString(PaymentsFreeFlowBtn);
				String expPaymentsFreeFlowBtn=excelReader.getCellData("SmokeJVVATView", 13, 7);
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 13, 8, actPaymentsFreeFlowBtn.toUpperCase());
						
				System.out.println("Payments  Voucher Free Flow Option Value Actual :"+actPaymentsFreeFlowBtn+"  Value Expected :"+expPaymentsFreeFlowBtn);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(freeFlowBtn));
				
				if(actPaymentsFreeFlowBtn.equalsIgnoreCase(expPaymentsFreeFlowBtn) )
				{
					System.out.println("Test Pass : entry Page  Displayed");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 12, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : entry Page NOT Displayed");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 12, 9, resFail);
					return false;
				}
				}
				
			
				
		
		
		 public boolean checkJVVATViewNewEntryPageRibbonControl() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
				try
				{
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(freeFlowBtn));
				
				boolean actEntryPageJumpToHeaderSectionBtn= jumpToHeaderSectionBtn.isDisplayed();
				boolean actEntryPageJumpToBodySectionBtn  = jumpToBodySectionBtn.isDisplayed();
				boolean actEntryPageJumpToFooterBtn       = jumpToFooterBtn.isDisplayed();
				boolean actEntryPageNewBtn                = new_newBtn.isDisplayed();
				boolean actEntryPageSaveBtn               = saveBtn.isDisplayed();
				boolean actEntryPagePreviousBtn           = previousBtn.isDisplayed();
				boolean actEntryPageNextBtn               = nextBtn.isDisplayed();
				boolean actEntryPagePrintBtn              = new_PrintBtn.isDisplayed();
				boolean actEntryPageSuspendBtn            = new_SuspendBtn.isDisplayed();
				boolean actEntryPageCloseBtn              = new_CloseBtn.isDisplayed();
				boolean actEntryPageToggleBtn             = toggleBtn.isDisplayed();

				
				boolean expEntryPageJumpToHeaderSectionBtn= true;
				boolean expEntryPageJumpToBodySectionBtn  = true;
				boolean expEntryPageJumpToFooterBtn       = true;
				boolean expEntryPageNewBtn	              = true;
				boolean expEntryPageSaveBtn               = true;
				boolean expEntryPagePreviousBtn           = true;
				boolean expEntryPageNextBtn               = true;
				boolean expEntryPagePrintBtn              = true;
				boolean expEntryPageSuspendBtn            = true;
				boolean expEntryPageCloseBtn              = true;
				boolean expEntryPageToggleBtn             = true;

				
				
				System.out.println("************************************* JVVATView  New Entry Page Ribbon Control Options  ********************************************");
				
				System.out.println("Entry Page RC Jump to Header Value Actual:"+actEntryPageJumpToHeaderSectionBtn+"  Value Expected : "+expEntryPageJumpToHeaderSectionBtn);
				System.out.println("Entry Page RC Jump To Body Value Actual  :"+actEntryPageJumpToBodySectionBtn+"    Value Expected : "+expEntryPageJumpToBodySectionBtn);
				System.out.println("Entry Page RC Jump To Footer Value Actual:"+actEntryPageJumpToFooterBtn+"         Value Expected : "+expEntryPageJumpToFooterBtn);
				System.out.println("Entry Page RC New Btn Value Actual       :"+actEntryPageNewBtn+"                  Value Expected : "+expEntryPageNewBtn);
				System.out.println("Entry Page RC Save Btn Value Actual      :"+actEntryPageSaveBtn+"                 Value Expected : "+expEntryPageSaveBtn);
				System.out.println("Entry Page RC Previous Btn Value Actual  :"+actEntryPagePreviousBtn+"             Value Expected : "+expEntryPagePreviousBtn);
				System.out.println("Entry Page RC Next Btn Value Actual      :"+actEntryPageNextBtn+"                 Value Expected : "+expEntryPageNextBtn);
				System.out.println("Entry Page RC Print Btn Value Actual     :"+actEntryPagePrintBtn+"                Value Expected : "+expEntryPagePrintBtn);
				System.out.println("Entry Page RC Suspend Btn Value Actual   :"+actEntryPageSuspendBtn+"              Value Expected : "+expEntryPageSuspendBtn);
				System.out.println("Entry Page RC Close Btn Value Actual     :"+actEntryPageCloseBtn+"                Value Expected : "+expEntryPageCloseBtn);
				System.out.println("Entry Page RC Toggle Btn Value Actual    :"+actEntryPageToggleBtn+"               Value Expected : "+expEntryPageToggleBtn);
				
				
				boolean actMethod=actEntryPageJumpToHeaderSectionBtn==expEntryPageJumpToHeaderSectionBtn && actEntryPageJumpToBodySectionBtn==expEntryPageJumpToBodySectionBtn 
						&& actEntryPageJumpToFooterBtn==expEntryPageJumpToFooterBtn && actEntryPageJumpToFooterBtn==expEntryPageJumpToFooterBtn
						&& actEntryPageNewBtn==expEntryPageNewBtn && actEntryPageSaveBtn==expEntryPageSaveBtn && actEntryPagePreviousBtn==expEntryPagePreviousBtn
						&& actEntryPageNextBtn==expEntryPageNextBtn && actEntryPagePrintBtn==expEntryPagePrintBtn &&actEntryPageSuspendBtn==expEntryPageSuspendBtn 
						&& actEntryPageCloseBtn==expEntryPageCloseBtn && actEntryPageToggleBtn==expEntryPageToggleBtn ;
				
				String actDisplay=Boolean.toString(actMethod);
				String expDisplay=excelReader.getCellData("SmokeJVVATView", 15, 7);
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 15, 8, actDisplay.toUpperCase());
				
				
				if(actDisplay.equalsIgnoreCase(expDisplay))
				{
					System.out.println("Test Pass : Entry Page Options Are Displayed");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 14, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Entry Page NOT Displayed");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 14, 9, resFail);
					return false;
				}
				}
				catch (Exception e) 
				  {
					  String exception =e.getMessage();
					  excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 14, 10, exception);
					  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
					  return false;
				  }
			}
			
			
		 

			public boolean checkJVVATViewHomePageOptionsUndertoggleBtn() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				try
				{
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
		    	toggleBtn.click();
		    	
		        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(CopyDocumentBtn));
				
				
				boolean actCopyDocumentBtn                =CopyDocumentBtn.isDisplayed();
				boolean actcopytoClipboardBtn             =copytoClipboardBtn.isDisplayed();
				boolean actpastefromClipboardBtn          =pastefromClipboardBtn.isDisplayed();
				boolean actraiseaChequeReturnBtn          =addToStockOption.isDisplayed();
				boolean actpostingDetailsBtn              =postingDetailsBtn.isDisplayed();
				boolean actreversEntryBtn                 =reversEntryBtn.isDisplayed();
				boolean actexporttoXMLBtn                 =exporttoXMLBtn.isDisplayed();
				boolean actsettingBtn                     =settingBtn.isDisplayed();
				boolean actcalculatorBtn                  =calculatorBtn.isDisplayed();
				boolean actautoLoadBtn                    =autoLoadBtn.isDisplayed();

				
				boolean expCopyDocumentBtn            =true;
				boolean expcopytoClipboardBtn         =true;
				boolean exppastefromClipboardBtn      =true;
				boolean expraiseaChequeReturnBtn	  =true;
				boolean exppostingDetailsBtn          =true;
				boolean expreversEntryBtn             =true;
				boolean expexporttoXMLBtn             =true;
				boolean expsettingBtn                 =true;
				boolean expcalculatorBtn              =true;
				boolean expautoLoadBtn                =true;

				
				
				System.out.println("************************************* check Options Under toggle Btn in JVVATView ********************************************");
				System.out.println("Entry Page RC Jump to Header Value Actual:"+actCopyDocumentBtn+"       Value Expected : "+expCopyDocumentBtn);
				System.out.println("Entry Page RC Jump To Body Value Actual  :"+actcopytoClipboardBtn+"    Value Expected : "+expcopytoClipboardBtn);
				System.out.println("Entry Page RC Jump To Footer Value Actual:"+actpastefromClipboardBtn+" Value Expected : "+exppastefromClipboardBtn);
				System.out.println("Entry Page RC New Btn Value Actual       :"+actraiseaChequeReturnBtn+" Value Expected : "+expraiseaChequeReturnBtn);
				System.out.println("Entry Page RC Previous Btn Value Actual  :"+actpostingDetailsBtn+"     Value Expected : "+actpostingDetailsBtn);
				System.out.println("Entry Page RC Next Btn Value Actual      :"+actreversEntryBtn+"        Value Expected : "+expreversEntryBtn);
				System.out.println("Entry Page RC Print Btn Value Actual     :"+actexporttoXMLBtn+"        Value Expected : "+expexporttoXMLBtn);
				System.out.println("Entry Page RC Suspend Btn Value Actual   :"+actsettingBtn+"            Value Expected : "+expsettingBtn);
				System.out.println("Entry Page RC Close Btn Value Actual     :"+actcalculatorBtn+"         Value Expected : "+expcalculatorBtn);
				System.out.println("Entry Page RC Toggle Btn Value Actual    :"+actautoLoadBtn+"           Value Expected : "+expautoLoadBtn);
				
				
				boolean actMethod=actCopyDocumentBtn==expCopyDocumentBtn && actcopytoClipboardBtn==expcopytoClipboardBtn 
						&& actpastefromClipboardBtn==exppastefromClipboardBtn && actraiseaChequeReturnBtn==expraiseaChequeReturnBtn
						&& actpostingDetailsBtn==exppostingDetailsBtn && actreversEntryBtn==expreversEntryBtn
						&& actexporttoXMLBtn==expexporttoXMLBtn && actsettingBtn==expsettingBtn &&actcalculatorBtn==expcalculatorBtn 
						&& actautoLoadBtn==expautoLoadBtn ;
				
				String actResult=Boolean.toString(actMethod);
				String expResult=excelReader.getCellData("SmokeJVVATView", 17, 7);
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 17, 8, actResult.toUpperCase());

				
				if( actResult.equalsIgnoreCase(expResult))
				{
					System.out.println("Test Pass : Entry Page toggle  Options Are Displayed");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 16, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail : Entry Page  toggle  NOT Displayed");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 16, 9, resFail);
					return false;
				}
				}
				catch (Exception e) 
				  {
					  String exception =e.getMessage();
					  excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 16, 10, exception);
					  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
					  return false;
				  }
			}

			
			@FindBy(xpath="//*[@id='doc_TagsTable_body']/tr/td[2]")
			private static List<WebElement>  masterList;
			

			@FindBy(xpath="//*[@id='doc_TagsTable_body']/tr/td[1]")
			private static List<WebElement>  masterIndexList;
			
			
			@FindBy(xpath="//div[contains(text(),'Delete Row')]")
			private static WebElement  deleterowBtn;	

		
	   public boolean  checkCustomizationOptionInJVVATView() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
	   	
	       	excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	   	
	   	
			try
			{
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingBtn));
			settingBtn.click();

			Thread.sleep(2000);
			
			 int masterListCount  = masterList.size();
		    	
		     System.err.println("masterList   : "+masterListCount);
		        
		     ArrayList<String> actmasterList  = new ArrayList<String>();
		    	
		     for (int i = 0; i < masterListCount; i++) 
		    {
		    		String data		  = masterList.get(i).getText();
		    		
		    		if (data.equalsIgnoreCase("Warehouse")) 
		    		{
		    			masterIndexList.get(i).click();
		    			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleterowBtn));
		         		deleterowBtn.click();
					}
				}
		    	
		    	
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingMiscellaneousTab));
			settingMiscellaneousTab.click();
			
			Thread.sleep(4000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(miscAddCurrencyDropdown));
		    Select Currency=new Select(miscAddCurrencyDropdown);
		    Currency.selectByVisibleText("Header");
		   
		    Thread.sleep(2000);
		    
		    
		    if (miscInputExchangeRateChkbox.isSelected()==false && miscInputLocalExchangeRateChkbox.isSelected()==false)
		    {
		    	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(miscInputExchangeRateChkbox));
		         miscInputExchangeRateChkbox.click();
		 	
		 	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(miscInputLocalExchangeRateChkbox));
		 	    miscInputLocalExchangeRateChkbox.click();
			}
		    
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(miscDueDateDropdown));
		    Select Date=new Select(miscDueDateDropdown);
		    Date.selectByVisibleText("Header");
		   
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingUpdateIcon));
		    settingUpdateIcon.click();
		    

		    String expupdateMessage=excelReader.getCellData("SmokeJVVATView", 19, 7);
			
			String validationMessage=checkValidationMessage(expupdateMessage);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 19, 8, validationMessage);

		    
			if(validationMessage.equalsIgnoreCase(expupdateMessage))
			{
				System.out.println("****Test Pass : Data Updated Successfully*********");
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 18, 9, resPass);
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingCloseIcon));
				settingCloseIcon.click();
				return true;
			}
			else
			{
				System.out.println("****Test Fail : Data  Not Updated Successfully*********");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 18, 9, resFail);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingCloseIcon));
				settingCloseIcon.click();
				return false;
			}
			}
			catch (Exception e) 
			  {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 18, 10, exception);
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
				  return false;
			  }
			
		}

			
	   @FindBy(xpath="//input[@id='id_header_4']")
	   private static WebElement newCashBankAccountTxt;
		
	   @FindBy(xpath="//input[@id='id_header_6']")
	   private static WebElement  voucherHeaderDueDate;

	   @FindBy(xpath="//input[@id='id_header_10']")
	   private static WebElement  voucherHeaderCurrency;

	   @FindBy(xpath="//input[@id='id_header_145']")
	   private static WebElement  voucherHeaderLocalExchangeRate;		    
			    
			    
      public boolean checkJVVATViewNewEntryPageHeaderFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
	 		
	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		
	 		try
	 		{
	 		
	 	    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	 		newBtn.click();
	 		
	         checkUserFriendlyMessage();
	 		
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	 				
	 		boolean actEntryPageHeaderFieldsDocNumber     =documentNumberTxt.isDisplayed();
	 		boolean actEntryPageHeaderFieldsDate          =dateTxt.isDisplayed();
	 		boolean actEntryPageHeaderFieldsDueDate       =voucherHeaderDueDate.isDisplayed();
	 		boolean actEntryPageHeaderFieldsCurrency      =voucherHeaderCurrency.isDisplayed();
	 		boolean actEntryPageHeaderFieldsdepartment    =departmentTxt.isDisplayed();
	 		boolean actEntryPageHeaderFieldsLocalExeRate  =voucherHeaderLocalExchangeRate.isDisplayed();
	 		boolean actEntryPageHeaderFieldsNarration     =JVVAT_NarrationTxt.isDisplayed();
	 		boolean actPDPVAT_JuridictionTxt              =PDPVAT_JuridictionTxt.isDisplayed();
	 		boolean actPDRVATPlaceOfSupplyTXt             =PDRVATPlaceOfSupplyTXt.isDisplayed();
	 		
	 	
	 		
	 		boolean expEntryPageHeaderFieldsDocNumber      =true;
	 		boolean expEntryPageHeaderFieldsDate           =true;
	 		boolean expEntryPageHeaderFieldsDueDate        =true; 
	 		boolean expEntryPageHeaderFieldsCurrency       =true;
	 		boolean expEntryPageHeaderFieldsdepartment     =true;
	 		boolean expEntryPageHeaderFieldsLocalExeRate   =true;
	 		boolean expEntryPageHeaderFieldsNarration      =true;
	 		boolean expPDPVAT_JuridictionTxt               =true;
	 		boolean expPDRVATPlaceOfSupplyTXt              =true;
	 		
	 		System.out.println("************************************* checkJVVATNewEntryPageHeaderFields  ********************************************");
	 		
	 		System.out.println("Entry Page DocNumber Actual:                "+actEntryPageHeaderFieldsDocNumber     +"Value Expected : "+expEntryPageHeaderFieldsDocNumber);
	 		System.out.println("Entry Page HeaderFieldsDate Actual          :"+actEntryPageHeaderFieldsDate         +"Value Expected : "+expEntryPageHeaderFieldsDate);
	 		System.out.println("Entry Page HeaderFieldsDueDate Actual       :"+actEntryPageHeaderFieldsDueDate      +"Value Expected : "+expEntryPageHeaderFieldsDueDate);
	 		System.out.println("Entry Page HeaderFieldsCurrency Actual      :"+actEntryPageHeaderFieldsCurrency     +"Value Expected : "+expEntryPageHeaderFieldsCurrency);
	 		System.out.println("Entry Page HeaderFieldsdepartment Actual    :"+actEntryPageHeaderFieldsdepartment   +"Value Expected : "+expEntryPageHeaderFieldsdepartment);
	 		System.out.println("Entry Page HeaderFieldsLocalExeRate Actual  :"+actEntryPageHeaderFieldsLocalExeRate +"Value Expected : "+expEntryPageHeaderFieldsLocalExeRate);
	 		System.out.println("Entry Page HeaderFields Narration Actual    :"+actEntryPageHeaderFieldsNarration    +"Value Expected : "+expEntryPageHeaderFieldsNarration);
	 		System.out.println("Entry Page PDPVAT_JuridictionTxt:       "+actPDPVAT_JuridictionTxt       +"Value Expected : "+expPDPVAT_JuridictionTxt);
	 		System.out.println("Entry Page PDRVATPlaceOfSupplyTXt:       "+actPDRVATPlaceOfSupplyTXt       +"Value Expected : "+expPDRVATPlaceOfSupplyTXt);
	 		
	 		
	 		boolean actMethod=actEntryPageHeaderFieldsDocNumber==expEntryPageHeaderFieldsDocNumber && actEntryPageHeaderFieldsDate==expEntryPageHeaderFieldsDate 
	 				&& actEntryPageHeaderFieldsNarration==expEntryPageHeaderFieldsNarration &&  
	 				actEntryPageHeaderFieldsCurrency==expEntryPageHeaderFieldsCurrency && actEntryPageHeaderFieldsdepartment==expEntryPageHeaderFieldsdepartment &&
	 				actEntryPageHeaderFieldsLocalExeRate==expEntryPageHeaderFieldsLocalExeRate && actEntryPageHeaderFieldsDueDate==expEntryPageHeaderFieldsDueDate && 
	 				actPDPVAT_JuridictionTxt==expPDPVAT_JuridictionTxt && 
	 				actPDRVATPlaceOfSupplyTXt==expPDRVATPlaceOfSupplyTXt;
	 		
	 		String actResult=Boolean.toString(actMethod);
	 		String expResult=excelReader.getCellData("SmokeJVVATView", 21, 7);
	 		
	 		excelReader.setCellData(xlfile, "SmokeJVVATView", 21, 8, actResult.toUpperCase());

	 		
	 		if(actResult.equalsIgnoreCase(expResult))
	 		{
	 			System.out.println("Test Pass : entry Page Header Options Are Displayed");
	 		excelReader.setCellData(xlfile, "SmokeJVVATView", 20, 9, resPass);
	 			return true;
	 		}
	 		else
	 		{
	 			System.out.println("Test Fail : entry Page NOT Displayed");
	 	    	excelReader.setCellData(xlfile, "SmokeJVVATView", 20, 9, resFail);
	 			return false;
	 		}
	 		}
	 		catch (Exception e) 
	 		  {
	 			  String exception =e.getMessage();
	 			  excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 20, 10, exception);
	 			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 			  return false;
	 		  }
	 	}
			 	

  @FindBy(xpath="//div[contains(text(),'Amount')]")
  private static WebElement vocBodyAmountTxt;

  @FindBy(xpath="//div[contains(text(),'Remarks')]")
  private static WebElement vocBodyRemarksTxt;
      
   	@FindBy(xpath="//div[contains(text(),'Account')]")
   	private static WebElement vocBodyAccTxt;
   	
   	@FindBy(xpath="//div[contains(text(),'Debit')]")
   	private static WebElement vocBodyDebitTxt;
   	
   	@FindBy(xpath="//div[contains(text(),'Credit')]")
   	private static WebElement vocBodyCreditTxt;

   	@FindBy(xpath="//div[contains(text(),'Reference')]")
   	private static WebElement vocBodyReferenceTxt; 	
	   
	    
   	@FindBy(xpath="//div[contains(text(),'Tax Code')]")
	private static WebElement vocbodyTaxCodeTxt;
		
		
	@FindBy(xpath="//div[contains(text(),'VAT')]")
	private static WebElement vocbodyVATTxt;
		
   	
		public boolean checkJVVATViewEntryPageBodyFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 	{
	 		
	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		
	 		try
	 		
	 		{
	 		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));		
	 		
	 		boolean actEntryPageBodyAccountTxt       =vocBodyDebitTxt.isDisplayed();
	 		boolean actEntryPageBodyCreditTxt        =vocBodyCreditTxt.isDisplayed();
	 		boolean actEntryPageBodyAmount           =vocBodyAmountTxt.isDisplayed();
	 		boolean actEntryPageBodyReferenceTxt     =vocBodyReferenceTxt.isDisplayed();
	 		boolean actEntryPageBodyTaxcode          =vocbodyTaxCodeTxt.isDisplayed();
	 		boolean actEntryPageBodyVAT              =vocbodyVATTxt.isDisplayed();
	 		boolean actEntryPageBodyFieldsAccount    =select1stRow_1stColumn.isDisplayed();
	 		boolean actEntryPageBodyFieldsAmount     =select1stRow_2ndColumn.isDisplayed();
	 		boolean actEntryPageBodyFieldsReference  =select1stRow_3rdColumn.isDisplayed();
	 		boolean actEntryPageBodyFieldsRemarks    =select1stRow_4thColumn.isDisplayed();
	 		
	 		boolean expEntryPageBodyAccountTxt      =true;
	 		boolean expEntryPageBodyCreditTxt       =true;
	 		boolean expEntryPageBodyAmount          =true;
	 		boolean expEntryPageBodyReferenceTxt    =true;
	 		boolean expEntryPageBodyFieldsAccount   =true;
	 		boolean expEntryPageBodyFieldsAmount    =true;
	 		boolean expEntryPageBodyFieldsreference =true;
	 		boolean expEntryPageBodyFieldsRemarks   =true;
           boolean expEntryPageBodyTaxcode         =true;
           boolean expEntryPageBodyVAT             =true;    
	 		
	 		
	 		
	 		System.out.println("************************************* checkJVVATViewNewEntryPageBodyFields  ********************************************");
	 		
	 		System.out.println("Entry Page Body Fields Debit A/C Txt Actual  : "+actEntryPageBodyAccountTxt+"      Value Expected : "+expEntryPageBodyAccountTxt);
	 		System.out.println("Entry Page Body Fields Credit A/C Txt Actual  : "+actEntryPageBodyCreditTxt+"      Value Expected : "+expEntryPageBodyCreditTxt);
	 		System.out.println("Entry Page Body FieldsAmount  Txt Actual :    "+actEntryPageBodyAmount+"         Value Expected : "+expEntryPageBodyAmount);
	 		System.out.println("Entry Page Body Fields Ref Txt Actual   :    "+actEntryPageBodyReferenceTxt+"    Value Expected : "+expEntryPageBodyReferenceTxt);
	 		System.out.println("Entry Page Body Fields Account  Actual :     "+actEntryPageBodyFieldsAccount+"   Value Expected : "+expEntryPageBodyFieldsAccount);
	 		System.out.println("Entry Page Body Fields Debit   Actual :      "+actEntryPageBodyFieldsAmount+"    Value Expected : "+expEntryPageBodyFieldsAmount);
	 		System.out.println("Entry Page Body Fields Credit   Actual :     "+actEntryPageBodyFieldsReference+" Value Expected : "+expEntryPageBodyFieldsreference);
	 		System.out.println("Entry Page Body Fields Ref  Actual :         "+actEntryPageBodyFieldsRemarks+    "Value Expected : "+expEntryPageBodyFieldsRemarks);
	 		
	 		
	 		boolean actMethod=actEntryPageBodyAccountTxt==expEntryPageBodyAccountTxt && actEntryPageBodyAmount==expEntryPageBodyAmount 
	 				&& actEntryPageBodyReferenceTxt==expEntryPageBodyReferenceTxt  
	 				&& actEntryPageBodyFieldsAccount==expEntryPageBodyFieldsAccount &&actEntryPageBodyFieldsAmount==expEntryPageBodyFieldsAmount  && 
	 				actEntryPageBodyFieldsReference==expEntryPageBodyFieldsreference && actEntryPageBodyFieldsRemarks==expEntryPageBodyFieldsRemarks && 
	 				 actEntryPageBodyCreditTxt==expEntryPageBodyCreditTxt;
	 		
	 		String actResult=Boolean.toString(actMethod);
	 		String expResult=excelReader.getCellData("SmokeJVVATView", 22, 7);
	 		
	 		excelReader.setCellData(xlfile, "SmokeJVVATView", 22, 8, actResult.toUpperCase());
	 		
	 		System.err.println("Result : "+actResult+" Value Expected : "+expResult);
	 		
	 		if(actResult.equalsIgnoreCase(expResult))
	 		{
	 			System.out.println("Test Pass : entry Page Body Options Are Displayed");
	 			excelReader.setCellData(xlfile, "SmokeJVVATView", 22, 9, resPass);
	 			return true;
	 		}
	 		else
	 		{
	 			System.out.println("Test Fail : entry Page NOT Displayed");
	 			excelReader.setCellData(xlfile, "SmokeJVVATView", 22, 9, resFail);
	 			return false;
	 		}
	 		}
	 		catch (Exception e) 
	 		  {
	 			  String exception =e.getMessage();
	 			  excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 22, 10, exception);
	 			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 			  return false;
	 		  }
	 	}
			 	       


			 	
			 	
			 	
   public boolean checkJVVATViewEntryPageFooterFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	 		
	 		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		
		
	        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(footerAmtLabel));
	 		
	 		boolean actEntryPageFooterFieldsNetLabel  =footerAmtLabel.isDisplayed();
	 		boolean actEntryPageFooterFieldsNetAmount =footerAmount.isDisplayed();

	 		boolean expEntryPageFooterFieldsNetLabel  =true;
	 		boolean expEntryPageFooterFieldsNetAmount =true;

	 		System.out.println("***************************** checkJVVATViewEntryPageFooterFields  ***************************************************");
	 		System.out.println("Entry Page Footer Fields Net Label Value Actual  : "+actEntryPageFooterFieldsNetLabel+"   Value Expected : "+expEntryPageFooterFieldsNetLabel);
	 		System.out.println("Entry Page Footer Fields Net Amount Value Actual : "+actEntryPageFooterFieldsNetAmount+"  Value Expected : "+expEntryPageFooterFieldsNetAmount);

	 		boolean actMethod=actEntryPageFooterFieldsNetLabel==expEntryPageFooterFieldsNetLabel && 
	 				actEntryPageFooterFieldsNetAmount==expEntryPageFooterFieldsNetAmount;
	 				
	 		String actResult=Boolean.toString(actMethod);
	 		String expResult=excelReader.getCellData("SmokeJVVATView", 23, 7);
	 		
	 		excelReader.setCellData(xlfile, "SmokeJVVATView", 23, 8, actResult.toUpperCase());
	 				
	 		if(actResult.equalsIgnoreCase(expResult))
	 		{
	 			System.out.println("Test Pass : entry Page Footer Options Are Displayed");
	 			excelReader.setCellData(xlfile, "SmokeJVVATView", 22, 9, resPass);
	 			return true;
	 		}
	 		else
	 		{
	 			System.out.println("Test Fail : entry Page NOT Displayed");
	 			excelReader.setCellData(xlfile, "SmokeReceiptsVAT", 22, 9, resFail);
	 			return false;
	 		}
	 		}
	 		
			 	
			
		public boolean checkJVVATViewEntryPageDocumentNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			documentNumberTxt.click();
			
			String actEntryPageGetDocumentNumberValue  =documentNumberTxt.getAttribute("value");

			String expEntryPageGetDocumentNumberValue  =excelReader.getCellData("SmokeJVVATView", 24, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 29, 8, actEntryPageGetDocumentNumberValue.toUpperCase());


			System.out.println("*************************************** checkJVVATViewEntryPageDocumentNumber ****************************************************");
			System.out.println("Entry Page Document Number Value Actual  : "+actEntryPageGetDocumentNumberValue+"   Value Expected : "+expEntryPageGetDocumentNumberValue);

			
			if(actEntryPageGetDocumentNumberValue.equalsIgnoreCase(expEntryPageGetDocumentNumberValue))
			{
				System.out.println("Test Pass : Document No is 1");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 24, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Doc Number is Not Shown ");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 24, 9, resFail);
				return false;
			}
			}
			catch (Exception e) 
			  {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 24, 10, exception);
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
				  return false;
			  }
		}

		
		@FindBy(xpath="//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
		private static WebElement  customizeCloseBtn;
		
		


		public boolean checkJVVATViewVoucherNewEntryPageInfoSideBarCustomizeBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoSideBarCustomizeBtn));
			
			infoSideBarCustomizeBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeSearchTxt));

			boolean actInfoCustomizationSearchTxt        = customizeSearchTxt.isDisplayed();
			boolean actInfoCustomizationSearchBtn        = customizeSearchBtn.isDisplayed();
			boolean actInfoCustomizationCloseBtn         = customizeCloseBtn.isDisplayed();
			boolean actInfoCustomizationSaveBtn          = customizeSaveBtn.isDisplayed();
			boolean actInfoCustomizationCancelBtn        = customizeCancelBtn.isDisplayed();
			boolean actInfoCustomizationGraphBtn         = graphBtn.isDisplayed();
			boolean actInfoCustomizationReportBtn        = reportBtn.isDisplayed();
			boolean actInfoCustomizationInfopanelBtn     = infoPanelBtn.isDisplayed();
			boolean actInfoCustomizationWorkFlowBtn      = workFlowBtn.isDisplayed();
			boolean actInfoCustomizationOtherDashletsBtn = otherDashlets.isDisplayed();

			boolean expInfoCustomizationSearchTxt        = true;
			boolean expInfoCustomizationSearchBtn        = true;
			boolean expInfoCustomizationCloseBtn         = true;
			boolean expInfoCustomizationSaveBtn          = true;
			boolean expInfoCustomizationCancelBtn        = true;
			boolean expInfoCustomizationGraphBtn         = true;
			boolean expInfoCustomizationReportBtn        = true;
			boolean expInfoCustomizationInfopanelBtn     = true;
			boolean expInfoCustomizationWorkFlowBtn      = true;
			boolean expInfoCustomizationOtherDashletsBtn = true;

			
			System.out.println("***************************************** checkJVVATVoucherNewEntryPageInfoSideBarCustomizeBtn  ***************************************************");
			
			System.out.println("Entry Page Info Panel Search Txt Value Actual : "+actInfoCustomizationSearchTxt        +" Value Expected : "+expInfoCustomizationSearchTxt);
			System.out.println("Entry Page Info Panel Search Btn Value Actual : "+actInfoCustomizationSearchBtn        +" Value Expected : "+expInfoCustomizationSearchBtn);
			System.out.println("Entry Page Info Panel Close Btn Value Actual  : "+actInfoCustomizationCloseBtn         +" Value Expected : "+expInfoCustomizationCloseBtn);
			System.out.println("Entry Page Info Panel Save Btn Value Actual   : "+actInfoCustomizationSaveBtn          +" Value Expected : "+expInfoCustomizationSaveBtn);
			System.out.println("Entry Page Info Panel Cancel Value Actual     : "+actInfoCustomizationCancelBtn        +" Value Expected : "+expInfoCustomizationCancelBtn);
			System.out.println("Entry Page Info Panel Graph Value Actual      : "+actInfoCustomizationGraphBtn         +" Value Expected : "+expInfoCustomizationGraphBtn);
			System.out.println("Entry Page Info Panel Report Value Actual     : "+actInfoCustomizationReportBtn        +" Value Expected : "+expInfoCustomizationReportBtn);
			System.out.println("Entry Page Info Panel Value Actual            : "+actInfoCustomizationInfopanelBtn     +" Value Expected : "+expInfoCustomizationInfopanelBtn);
			System.out.println("Entry Page Info Panel WorkFlow Btn Actual     : "+actInfoCustomizationWorkFlowBtn      +" Value Expected : "+expInfoCustomizationWorkFlowBtn);
			System.out.println("Entry Page Info Panel Dashlet Btn Actual      : "+actInfoCustomizationOtherDashletsBtn +" Value Expected : "+expInfoCustomizationOtherDashletsBtn);
			
			
			boolean actDisplay=actInfoCustomizationSearchTxt==expInfoCustomizationSearchTxt && actInfoCustomizationSearchBtn==expInfoCustomizationSearchBtn && actInfoCustomizationCloseBtn==expInfoCustomizationCloseBtn 
					&& actInfoCustomizationSaveBtn==expInfoCustomizationSaveBtn && actInfoCustomizationGraphBtn==expInfoCustomizationGraphBtn
					&& actInfoCustomizationReportBtn==expInfoCustomizationReportBtn && actInfoCustomizationInfopanelBtn==expInfoCustomizationInfopanelBtn  
					&& actInfoCustomizationWorkFlowBtn==expInfoCustomizationWorkFlowBtn && actInfoCustomizationOtherDashletsBtn==expInfoCustomizationOtherDashletsBtn;
			
			String actResult=Boolean.toString(actDisplay);
			String expResult=excelReader.getCellData("SmokeJVVATView", 26, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 26, 8, actResult);
			
			if(actDisplay==true)
			{
				System.out.println("Test Pass : entry Page Footer Options Are Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 26, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : entry Page NOT Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 26, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checJVVATViewVoucherEntryPageInfoSideBarGraphOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(graphBtn));
			
			graphBtn.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGraphOption));
		
			boolean actGraphOption       =newGraphOption.isDisplayed();
			
			String actNewGraphOption=Boolean.toString(actGraphOption);
			String expNewGraphOptions=excelReader.getCellData("SmokeJVVATView", 28, 7);
			
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 28, 8, actNewGraphOption.toUpperCase());
			
			
			System.out.println("***************************************** checkJVVATViewVoucherNewEntryPageInfoSideBarGraphOption  *****************************************");
			System.out.println("Entry Page Open Info Side Graph Value Actual  : "+actNewGraphOption               +" Value Expected : "+expNewGraphOptions);
			
			if(actNewGraphOption.equalsIgnoreCase(expNewGraphOptions))
			{
				System.out.println("Test Pass : Graph Options Are Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 27, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Graph Options NOT Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 27, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkJVVATViewVoucherEntryPageInfoSideBarReportOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportBtn));
			
			reportBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReportOption));
			
			boolean NewReportOption       =newReportOption.isDisplayed();
			
			String actNewReportOption=Boolean.toString(NewReportOption);
			String expNewReportOption=excelReader.getCellData("SmokeJVVATView", 30, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 30, 8, actNewReportOption.toUpperCase());
			
			
			System.out.println("***************************************** checkJVVATViewVoucherNewEntryPageInfoSideBarReportOption  *****************************************");
			System.out.println("Entry Page Open Info Side Report Value Actual  : "+actNewReportOption               +" Value Expected : "+expNewReportOption);
			
			
			if(actNewReportOption.equalsIgnoreCase(expNewReportOption))
			{
				System.out.println("Test Pass : Reports Options Are Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 29, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Reports Option  NOT Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 29, 9, resFail);
				return false;
			}
			}
			
		
		
		
		public boolean checkJVVATViewVoucherNewEntryPageInfoSideBarInfoPanelOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelBtn));
			
			infoPanelBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newInfoPanelOption));
			
			boolean NewInfoPanelOption       =newInfoPanelOption.isDisplayed();
			
			String actNewInfoPanelOption=Boolean.toString(NewInfoPanelOption);
			String expNewInfoPanelOption=excelReader.getCellData("SmokeJVVATView", 32, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 32, 8, actNewInfoPanelOption.toUpperCase());
			
		
			System.out.println("***************************************** checkJVVATViewVoucherNewEntryPageInfoSideBarInfoPanelOption  *****************************************");
			System.out.println("Entry Page Open Info Side Info Panel Value Actual  : "+actNewInfoPanelOption               +" Value Expected : "+expNewInfoPanelOption);
			
			
			
			if(actNewInfoPanelOption.equalsIgnoreCase(expNewInfoPanelOption))
			{
				System.out.println("Test Pass :Info Side Pannel Options Are Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 31, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Info Side Pannel  NOT Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 31, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 31, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   	 	return false;
		}
			
		}
		
		
		
		public boolean checkJVVATViewVoucherNewEntryPageInfoSideBarWorkFlowOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workFlowBtn));
			
			workFlowBtn.click();
			
			Thread.sleep(4000);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newWorkFlowOption));
			
			boolean NewWorkFlowOption       =newWorkFlowOption.isDisplayed();
			
			String actNewWorkFlowOption=Boolean.toString(NewWorkFlowOption);
			
			String expNewWorkFlowOption=excelReader.getCellData("SmokeJVVATView", 34, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 34, 8, actNewWorkFlowOption.toUpperCase());
			
		
			System.out.println("***************************************** checkJVVATViewNewEntryPageInfoSideBarWorkFlowOption  *****************************************");
			System.out.println("Entry Page Open Info Side Workflow Value Actual  : "+actNewWorkFlowOption               +" Value Expected : "+expNewWorkFlowOption);
			
			
			if(actNewWorkFlowOption.equalsIgnoreCase(expNewWorkFlowOption))
			{
				System.out.println("Test Pass : entry Page Footer Options Are Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 33, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : entry Page NOT Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 33, 9, resFail);
				return false;
			}
			}
			catch (Exception e) 
			{
				String exception =e.getMessage();
				excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 33, 10, exception);
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		   	 	return false;
			}
		}
		
		

		public boolean checkJVVATViewVoucherNewEntryPageInfoSideBarOtherDashletsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(otherDashlets));
			
			otherDashlets.click();
			
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentInfo));
			
			boolean DocumentInfoInOtherDashletsOption       =documentInfo.isDisplayed();
			
			String actDocumentInfoInOtherDashletsOption=Boolean.toString(DocumentInfoInOtherDashletsOption);
			String expDocumentInfoInOtherDashletsOption=excelReader.getCellData("SmokeJVVATView", 36, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 36, 8, actDocumentInfoInOtherDashletsOption);
		
			System.out.println("***************************************** checkJVVATViewNewEntryPageInfoSideBarOtherDashletsOption  *****************************************");
			System.out.println("Entry Page Open Info Side Other Dashlets Value Actual  : "+actDocumentInfoInOtherDashletsOption               +" Value Expected : "+expDocumentInfoInOtherDashletsOption);

			

			if(actDocumentInfoInOtherDashletsOption.equalsIgnoreCase(expDocumentInfoInOtherDashletsOption))
			{
				System.out.println("Test Pass : entry Page Footer Options Are Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 35, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : entry Page NOT Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 35, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 35, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   	 	return false;
		}
		}
		
		@FindBy(xpath="//ul[@id='searchedLiTrans']//label[contains(@class,'theme_icon-color')][contains(text(),'Document Info')]")
		private static WebElement  searchDocumentInfo;
		
		public boolean checkJVVATViewVoucherNewEntryPageInfoSideBarSearch() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeSearchTxt));
			
			customizeSearchTxt.click();
			
		    customizeSearchTxt.sendKeys(excelReader.getCellData("SmokeJVVATView", 38, 6));
		  
		    customizeSearchTxt.sendKeys(Keys.TAB);
		   
		    Thread.sleep(2000);
		     
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchDocumentInfo));
			
			boolean SearchDocumentInfo       =searchDocumentInfo.isDisplayed();
			
			String actSearchDocumentInfo=Boolean.toString(SearchDocumentInfo);
			String expSearchDocumentInfo=excelReader.getCellData("SmokeJVVATView", 39, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 39, 8, actSearchDocumentInfo.toUpperCase());
			
		
			System.out.println("************************************checkJVVATViewNewEntryPageInfoSideBarSearch****************************************");
			
			System.out.println("Entry Page Open Info Side Search Info Value Actual  : "+actSearchDocumentInfo               +" Value Expected : "+expSearchDocumentInfo);

			
			if(actSearchDocumentInfo.equalsIgnoreCase(expSearchDocumentInfo))
			{
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 37, 9, resPass);
				return true;
			}
			else
			{
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 37, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 37, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   	 	return false;
		}
		}
		
		
		@FindBy(xpath="//div[@id='dashlate0']")
		private static WebElement  addCreateDashlet;
		
		@FindBy(xpath="//div[@id='DBdashlate0']")
		private static WebElement  dashletI;
		
		@FindBy(xpath="//input[@id='id_footer_134217745']")
		private static WebElement  footerRDField;
		
		
		public boolean checkJVVATViewVoucherNewInfoPanelDashlet() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				
			Thread.sleep(4000);
			
			Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\infoPanels.exe");
						
			
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addCreateDashlet));
			
			boolean AddCreateDashlet       =addCreateDashlet.isDisplayed();
			
			String actAddCreateDashlet=Boolean.toString(AddCreateDashlet);
			String expAddCreateDashlet=excelReader.getCellData("SmokeJVVATView", 40, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 40, 8, actAddCreateDashlet.toUpperCase());
			
		
			System.out.println("***************************************** checkJVVATViewNewInfoPanelDashlet  *****************************************");
			System.out.println("Entry Page Open Info Side Add Create Dashlet Value Actual  : "+actAddCreateDashlet               +" Value Expected : "+expAddCreateDashlet);

			if(actAddCreateDashlet.equalsIgnoreCase(expAddCreateDashlet))
			{
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 40, 9, resPass);
				return true;
			}
			else
			{
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 40, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 40, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   	 	return false;
		}
		}

		
		public boolean checkJVVATViewVoucherNewSaveInfoPanelDashlet() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeSaveBtn));
			customizeSaveBtn.click();
				
			String expSaveInfoPanelMessage       =excelReader.getCellData("SmokeJVVATView", 42, 7);
			
			String dashBoradSaveMessage=checkValidationMessage(expSaveInfoPanelMessage);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 42, 8, expSaveInfoPanelMessage);
			
			System.out.println("***************************************** checkJVVATViewNewSaveInfoPanelDashlet  *****************************************");
			System.out.println("Entry Page Open Info Side New Save Value Actual  : "+dashBoradSaveMessage+" Value Expected : "+"TRUE");	
			
			if(dashBoradSaveMessage.equalsIgnoreCase(expSaveInfoPanelMessage))
			{
				System.out.println("Test Pass : Error Message Is As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoSideBarExpandBtn));
				infoSideBarExpandBtn.click();
				excelReader.setCellData(xlfile, "SmokeJVVATView", 41, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Error Message Is NOT As Expected");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoSideBarExpandBtn));
				infoSideBarExpandBtn.click();
				excelReader.setCellData(xlfile, "SmokeJVVATView", 41, 9, resFail);
				return false;
			}	
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 41, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   	 	return false;
		}
		}
		
		@FindBy(xpath="//select[@id='id_header_2_month']")
		private static WebElement monthDropDwn;
		
		@FindBy(xpath="//select[@id='id_header_2_year']")
		private static WebElement yearDropDwn;
		
		@FindBy(xpath="//tr[@id='id_header_2_day_grid']")
		private static WebElement calDates;	
		
		public boolean checkSmokeJVVATViewNewDateFieldLessThanCompanyAccountingDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			documentNumberTxt.click();
		
			documentNumberTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
			dateTxt.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt_CalenderBtn));
	        dateTxt_CalenderBtn.click();
			
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(monthDropDwn));
	        Select mon=new Select(monthDropDwn);
	        mon.selectByVisibleText("December");
	        
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(yearDropDwn));
	        Select yr=new Select(yearDropDwn);
	        
	        String selectedyear=yr.getFirstSelectedOption().getText();
	        int i=Integer.parseInt(selectedyear);
	        
	        System.err.println("INTEGER YEAR : "+i);
	        
	        int getyear=i-1;
	        
	        String stringyear=Integer.toString(getyear);
	        
	        yr.selectByVisibleText(stringyear);
	        
	        
	        String date="1";
	        
	         java.util.List<WebElement> columns=calDates.findElements(By.tagName("td"));  
	                
		     for (WebElement cell : columns)
		     {
		        if (cell.getText().equals(date))
		        {
		           cell.click();
		           break;
		        }
		     }
	        
	        
			String expSaveDateValidationMessage       = excelReader.getCellData("SmokeJVVATView", 44, 7);
			
			String dateValidationMessage=checkValidationMessage(expSaveDateValidationMessage);
			excelReader.setCellData(xlfile, "SmokeJVVATView", 44, 8, dateValidationMessage);
			
			
			/*getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
			dateTxt.click();
			
			
			String actVoucherAccDate=dateTxt.getAttribute("value");
			String expVoucherAccdate=excelReader.getCellData("SmokeReceiptsVAT", 45, 7);
			
			excelReader.setCellData(xlfile, "SmokeReceiptsVAT", 45, 7, expVoucherAccdate);
			
			excelReader.setCellData(xlfile, "SmokeReceiptsVAT", 45, 8, actVoucherAccDate);*/
			
			
			System.out.println("*********************************************** checkJVVATViewNewDateFieldLessThanCompanyAccountingDate  ********************************************");
			System.out.println("Entry Page Change to Voucher Date To Less Than Accounting Date Value Actual  : "+dateValidationMessage+" Value Expected : "+"TRUE");	
			/*System.out.println("Entry Page Accounting Date Value Actual  : "+actVoucherAccDate+" Value Expected : "+expVoucherAccdate);*/
			
			
			if(dateValidationMessage.equalsIgnoreCase(expSaveDateValidationMessage))
			{
				System.out.println("Test Pass : Error Message Is As Expected");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 43, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Error Message Is NOT As Expected");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 43, 9, resFail);
				return false;
			}
			}
		
		
		
		public boolean checkNewOptioninEntryPageinJVVATView() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_newBtn));
				new_newBtn.click();
				
				getWaitForAlert();
				
				getFluentWebDriverWait().until(ExpectedConditions.alertIsPresent());
				
				String actAlertMessageOnClickOnNewBtn=getDriver().switchTo().alert().getText();
				String expAlertMessageOnClickOnNewBtn=excelReader.getCellData("SmokeJVVATView", 47, 7);
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 47, 8, actAlertMessageOnClickOnNewBtn);
				
				
				getDriver().switchTo().alert().accept();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				String actGetDocumentNumberInputAfterClickOnNewBtn=documentNumberTxt.getAttribute("value");
				String expGetDocumentNumberInputAfterClickOnNewBtn=excelReader.getCellData("SmokeJVVATView", 49, 7);
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 49, 8, actGetDocumentNumberInputAfterClickOnNewBtn);
				
				System.out.println("*********************************************** checkJVVATViewNewVouchersEntryPageNew  ********************************************");
				//System.out.println("Entry Page Save with Vendor Input Value Actual  : "+actGetDocumentNumberInputs                 +" Value Expected : "+expGetDocumentNumberInputs);	
				System.out.println("Entry Page Save with Vendor Input Value Actual  : "+actAlertMessageOnClickOnNewBtn             +" Value Expected : "+expAlertMessageOnClickOnNewBtn);
				System.out.println("Entry Page Save with Vendor Input Value Actual  : "+actGetDocumentNumberInputAfterClickOnNewBtn+" Value Expected : "+expGetDocumentNumberInputAfterClickOnNewBtn);
				
				
				if( actAlertMessageOnClickOnNewBtn.equalsIgnoreCase(expAlertMessageOnClickOnNewBtn) 
						&& actGetDocumentNumberInputAfterClickOnNewBtn.equalsIgnoreCase(expGetDocumentNumberInputAfterClickOnNewBtn))
				{
					System.out.println("Test Pass : New Option in Entry Page ");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 46, 9, resPass);
					return true;
				}
				else
				{
					System.out.println("Test Fail :New Option in Entry Page ");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 46, 9, resFail);
					return false;
			}
		}
			catch (Exception e) 
			{
				String exception =e.getMessage();
				excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 46, 10, exception);
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		   	 	return false;
			}
			}

			
			
		


		public boolean checkJVVATViewSaveWithoutMandatoryFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
				
		    Thread.sleep(2000);
				
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
	        String expMessageClickonSave=excelReader.getCellData("SmokeJVVATView", 51, 7);
			
			String validationMessage=checkValidationMessage(expMessageClickonSave);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 51, 8, validationMessage);


			if(validationMessage.equalsIgnoreCase(expMessageClickonSave))
			{
				System.out.println("Test Pass : Error Message Displayed");
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 50, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail :  Error Message Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 50, 9, resFail);
				
				return false;
			}
			}
			catch (Exception e) 
			{
				String exception =e.getMessage();
				excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 50, 10, exception);
				System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		   	 	return false;
			}
			
		}

		
		
		  @FindBy(xpath="//tbody[@id='id_header_10_table_data_body']/tr/td")
		  private static List<WebElement> currencyListCount;	  
		
	 
	 
		public boolean checkCurrencyOptioninSmokeJVVATView() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			voucherHeaderCurrency.sendKeys(Keys.SPACE);	
			
			ArrayList<String>  actvoucherHeaderCurrency= new ArrayList<String>(); 
			
	        int count=currencyListCount.size();
			
			System.err.println(count);
			
			for(int i=0 ; i < count ;i++)
			{
				String data=currencyListCount.get(i).getText();
				System.err.println("IN FOR LOOP : "+data);
				actvoucherHeaderCurrency.add(data);
				
			}
			
			System.err.println(actvoucherHeaderCurrency);
			
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			String actCurrencyList=actvoucherHeaderCurrency.toString();
			
			String expCurrencyList=excelReader.getCellData("SmokeJVVATView", 53, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 53, 8, actCurrencyList);
			
			if(actCurrencyList.equalsIgnoreCase(expCurrencyList))
			{
				excelReader.setCellData(xlfile, "SmokeJVVATView", 52, 9, resPass);
				return true;
			}
			else
			{
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 52, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 52, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   	 	return false;
		}
	}
		
		@FindBy(xpath="//tbody[@id='id_header_268435459_table_data_body']/tr")
	    private static List<WebElement> departmentListCount;
		
		
		public boolean checkJVVATViewVoucherVATDepartment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.SPACE);
			
			WebElement options=departmentTxt;
			
			ArrayList<String> actDepartmentList= new ArrayList<String>(); 
		
			int count=departmentListCount.size();
			
			System.err.println(count);
			
			for(int i=0 ; i < count ;i++)
			{
				String data=departmentListCount.get(i).getText();
				System.err.println("IN FOR LOOP : "+data);
				actDepartmentList.add(data);
				
			}
			
			System.err.println(actDepartmentList);
			
			
			System.out.println("actDepartmentList"+actDepartmentList);
			
			
			String actDepartmentValue=actDepartmentList.toString();
			String expDepartmentValue=excelReader.getCellData("SmokeJVVATView", 55, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 55, 8, actDepartmentValue);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			System.out.println("********************************************* checkJVVATViewDepartment  ********************************************************");
			System.out.println("Entry Page Department Masters Value Actual  : "+actDepartmentValue     +"     Value Expected : "+expDepartmentValue);
		   
		   if(actDepartmentValue.equalsIgnoreCase(expDepartmentValue))
			{
				System.out.println("Test Pass : Department Options Displayed ");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 54, 9, resPass);
				return true;
			}
			else
			{
				
				excelReader.setCellData(xlfile, "SmokeJVVATView", 54, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 54, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   	 	return false;
		}
		
		}
		
		@FindBy(xpath="//input[@id='id_header_11']")
		private static WebElement  voucherHeaderExchangeRate;


		public boolean checkJVVATViewWithCurrencyINRInputAndExcgRate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			
             Thread.sleep(2000);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();;
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			
			voucherHeaderCurrency.sendKeys(Keys.SPACE);
			
			int currencycount=currencyListCount.size();
			
			System.err.println(currencycount);
				
			for(int i=0 ; i < currencycount ;i++)
			{
				String data=currencyListCount.get(i).getText();
				
				if(data.equalsIgnoreCase(excelReader.getCellData("SmokeJVVATView", 57, 6)))
				{
					currencyListCount.get(i).click();
					
					break;
				}
			}
				
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			 Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME,Keys.BACK_SPACE);
			departmentTxt.sendKeys(Keys.SPACE);
			Thread.sleep(2000);
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase(excelReader.getCellData("SmokeJVVATView", 58, 6)))
				{
					departmentListCount.get(i).click();
					break;
				}
			}
				
			Thread.sleep(1000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			
			
			
			voucherHeaderExchangeRate.click();
			
			
			String actExchangeRate=voucherHeaderExchangeRate.getAttribute("value");
			String expExchangeRate=excelReader.getCellData("SmokeJVVATView", 59, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 59, 8, actExchangeRate);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderLocalExchangeRate));
			String actLocalExchangeRate=voucherHeaderLocalExchangeRate.getAttribute("value");
			String expLocalExchangeRate=excelReader.getCellData("SmokeJVVATView", 60, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 60, 8, actLocalExchangeRate);
			
			

			System.out.println("*********************************************** checkJVVATViewNewWithCurrencyInputAndExcgRate  ********************************************");
			System.out.println("Entry Page Exchange Rate Value Actual  : "+actExchangeRate  +" Value Expected : "+expExchangeRate);
			System.out.println("Entry Page LocalExchange Rate Value Actual  : "+actLocalExchangeRate  +" Value Expected : "+expLocalExchangeRate);
			
			
			if (actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocalExchangeRate.equalsIgnoreCase(expLocalExchangeRate))
			{
				excelReader.setCellData(xlfile, "SmokeJVVATView", 56, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "SmokeJVVATView", 56, 9, resFail);
				return false;
			}	
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, "SmokeJVVATView", 56, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   	 	return false;
		}
			
		}
		

		

		public boolean checkJVVATViewWithCurrencyUSDInputAndExcgRate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			
		    Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();;
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			
			voucherHeaderCurrency.sendKeys(Keys.SPACE);
			
			int currencycount=currencyListCount.size();
			
			System.err.println(currencycount);
				
			for(int i=0 ; i < currencycount ;i++)
			{
				String data=currencyListCount.get(i).getText();
				
				if(data.equalsIgnoreCase(excelReader.getCellData("SmokeJVVATView", 62, 6)))
				{
					currencyListCount.get(i).click();
					
					break;
				}
			}
				
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			 Thread.sleep(2000);
			voucherHeaderExchangeRate.click();
			
			String actExchangeRate=voucherHeaderExchangeRate.getAttribute("value");
			String expExchangeRate=excelReader.getCellData("SmokeJVVATView", 63, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 63, 8, actExchangeRate);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderLocalExchangeRate));
			String actLocalExchangeRate=voucherHeaderLocalExchangeRate.getAttribute("value");
			String expLocalExchangeRate=excelReader.getCellData("SmokeJVVATView", 64, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 64, 8, actLocalExchangeRate);
			
			

			System.out.println("**************************checkJVVATViewWithCurrencyUSDInputAndExcgRate*********************************");
			
			System.out.println("Entry Page Exchange Rate Value Actual  : "+actExchangeRate  +" Value Expected : "+expExchangeRate);
			System.out.println("Entry Page LocalExchange Rate Value Actual  : "+actLocalExchangeRate  +" Value Expected : "+expLocalExchangeRate);
			
			
			if (actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocalExchangeRate.equalsIgnoreCase(expLocalExchangeRate))
			{
				excelReader.setCellData(xlfile, "SmokeReceiptsVAT", 61, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "SmokeReceiptsVAT", 61, 9, resFail);
				return false;
			}	
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, "SmokeReceiptsVAT", 61, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   	 	return false;
		}
			
		}
			
		
		
		
		
		public boolean checkJVVATViewWithCurrencyAEDInputAndExcgRate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			try
			{
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();;
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			
			voucherHeaderCurrency.sendKeys(Keys.SPACE);
			
			int currencycount=currencyListCount.size();
			
			System.err.println(currencycount);
				
			for(int i=0 ; i < currencycount ;i++)
			{
				String data=currencyListCount.get(i).getText();
				
				if(data.equalsIgnoreCase(excelReader.getCellData("SmokeJVVATView", 66, 6)))
				{
					currencyListCount.get(i).click();
					
					break;
				}
			}
				
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			 Thread.sleep(2000);
			voucherHeaderExchangeRate.click();
			
			String actExchangeRate=voucherHeaderExchangeRate.getAttribute("value");
			String expExchangeRate=excelReader.getCellData("SmokeJVVATView", 67, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 67, 8, actExchangeRate);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderLocalExchangeRate));
			String actLocalExchangeRate=voucherHeaderLocalExchangeRate.getAttribute("value");
			String expLocalExchangeRate=excelReader.getCellData("SmokeJVVATView", 68, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 68, 8, actLocalExchangeRate);
			


			System.out.println("**************************checkJVVATViewWithCurrencyAEDInputAndExcgRate*********************************");
			
			System.out.println("Entry Page Exchange Rate Value Actual  : "+actExchangeRate  +" Value Expected : "+expExchangeRate);
			System.out.println("Entry Page LocalExchange Rate Value Actual  : "+actLocalExchangeRate  +" Value Expected : "+expLocalExchangeRate);
			
			
			if (actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocalExchangeRate.equalsIgnoreCase(expLocalExchangeRate))
			{
				excelReader.setCellData(xlfile, "SmokeReceiptsVAT", 65, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "SmokeReceiptsVAT", 65, 9, resFail);
				return false;
			}	
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, "SmokeReceiptsVAT", 65, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   	 	return false;
		}
			
		}
				
		
		
		@FindBy(xpath="//*[@id='id_header_6_input_image']/span")
		private static WebElement  dueDateCalenderIcon;
		
		@FindBy(xpath="//*[@id='id_header_6_day_today']/td/span[1]")
		private static WebElement  todaysDatePicker;
		
		
		
		public boolean checkJVVATViewVoucherSaveWithHeaderFieldsInput() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(2000);
				
				
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
	        String expClickonSaveMessage=excelReader.getCellData("SmokeJVVATView", 69, 7);
			
			String validationMessage=checkValidationMessage(expClickonSaveMessage);
			
			excelReader.setCellData(xlfile, "SmokeReceiptsVAT", 69, 8, validationMessage);

			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dueDateCalenderIcon));
			dueDateCalenderIcon.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(todaysDatePicker));
			todaysDatePicker.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
	        String expClickonSaveMessage1=excelReader.getCellData("SmokeJVVATView", 70, 7);
			
			String validationMessage1=checkValidationMessage(expClickonSaveMessage1);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 70, 8, validationMessage1);

		    
			if(validationMessage.equalsIgnoreCase(expClickonSaveMessage) && 
					validationMessage1.equalsIgnoreCase(expClickonSaveMessage1))

			
			{
				System.out.println("Test Pass : Error Message Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 69, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Error Message is Dispalyed ");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 69, 9, resFail);
				
				return false;
			}
			}
			
		@FindBy(xpath="//*[@id='id_body_12_table_data_body']/tr")
		private static List<WebElement> bodyAccountListInGrid;
		
		               
		@FindBy(xpath="//*[@id='id_body_39_table_data_body']/tr")
		private static List<WebElement> bodyCreditAccountListInGrid;
		
		
		
		public boolean checkPartyAccountsCannotBeAdjustedWithEachOtherInSmokeJVVATView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys("Vendor");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
			int accountCount=bodyAccountListInGrid.size();
			
			System.err.println(accountCount);
				
			for(int i=0 ; i < accountCount ;i++)
			{
				String data=bodyAccountListInGrid.get(i).getText();
				
				
				if(data.equalsIgnoreCase(excelReader.getCellData("SmokeReceiptsVAT", 73, 6)))
				{
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
					bodyAccountListInGrid.get(i).click();
					
					break;
				}
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
			enter_AccountTxt.sendKeys(Keys.TAB);

			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditACTxt));
			enter_CreditACTxt.click();
			
			enter_CreditACTxt.sendKeys("customer");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyCreditAccountListInGrid));
			int account1Count=bodyCreditAccountListInGrid.size();
			
			System.err.println(accountCount);
				
			for(int i=0 ; i < account1Count ;i++)
			{
				String data=bodyCreditAccountListInGrid.get(i).getText();
				
				
				if(data.equalsIgnoreCase(excelReader.getCellData("SmokeReceiptsVAT", 72, 6)))
				{
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
					bodyCreditAccountListInGrid.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditACTxt));	
			enter_CreditACTxt.sendKeys(Keys.TAB);
			
			String expClickonSaveMessage1=excelReader.getCellData("SmokeJVVATView", 74, 7);
				
			String validationMessage1=checkValidationMessage(expClickonSaveMessage1);
				
			excelReader.setCellData(xlfile, "SmokeReceiptsVAT", 74, 8, validationMessage1);
			
			if(validationMessage1.equalsIgnoreCase(expClickonSaveMessage1))
			
			{
				System.out.println("Test Pass : Error Message Displayed");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 71, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Error Message is Dispalyed ");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 71, 9, resFail);
				
				return false;
			}
			}
			
		

		public boolean checkEnteringDataIntoBodyGridIneJVVATView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			Thread.sleep(2000);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();;
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			
			voucherHeaderCurrency.sendKeys(Keys.SPACE);
			
			int currencycount=currencyListCount.size();
			
			System.err.println(currencycount);
				
			for(int i=0 ; i < currencycount ;i++)
			{
				String data=currencyListCount.get(i).getText();
				
				if(data.equalsIgnoreCase(excelReader.getCellData("SmokeJVVATView", 77, 6)))
				{
					currencyListCount.get(i).click();
					
					break;
				}
			}
				
			voucherHeaderCurrency.sendKeys(Keys.TAB);
	    	
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVATPlaceOfSupplyTXt));
	        PDRVATPlaceOfSupplyTXt.click();
	        
	        PDRVATPlaceOfSupplyTXt.sendKeys(Keys.END);
	    	PDRVATPlaceOfSupplyTXt.sendKeys(Keys.SHIFT,Keys.HOME);
	    	
	    	PDRVATPlaceOfSupplyTXt.sendKeys(excelReader.getCellData("SmokeJVVATView", 76, 6));
	    	
	    	Thread.sleep(2000);
	    	PDRVATPlaceOfSupplyTXt.sendKeys(Keys.TAB);
	    	
	    	
			
	    	Thread.sleep(2000);
	    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	        departmentTxt.click();
	        departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	        departmentTxt.sendKeys(Keys.SPACE);
		
	           
	        WebElement options=departmentTxt;
			
	        int departmentListCountCount=departmentListCount.size();
			
			 for (int i = 0; i < departmentListCountCount; i++) 
		 	 {
				String data=departmentListCount.get(i).getText();
				
				if (data.equalsIgnoreCase(excelReader.getCellData("SmokeJVVATView", 78, 6)))
				{
					departmentListCount.get(i).click();
					break;
				}
		 	 }
	        
			 departmentTxt.sendKeys(Keys.TAB);
	    	
			//First Row
				

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_2ndColumn));
		    select1stRow_2ndColumn.click();
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditACTxt));
			enter_CreditACTxt.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditACTxt));
			enter_CreditACTxt.click();
			
			enter_CreditACTxt.sendKeys("bank");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyCreditAccountListInGrid));
			int account1Count=bodyCreditAccountListInGrid.size();
			
			System.err.println(account1Count);
				
			for(int i=0 ; i < account1Count ;i++)
			{
				String data=bodyCreditAccountListInGrid.get(i).getText();
				
				System.err.println("DATA  : "+data);
				if(data.equalsIgnoreCase(excelReader.getCellData("SmokeReceiptsVAT", 79, 6)))
				{
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyCreditAccountListInGrid));
					bodyCreditAccountListInGrid.get(i).click();
					
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditACTxt));	
			enter_CreditACTxt.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterJVVATTaxCode));	
			enterJVVATTaxCode.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			Thread.sleep(1000);
			enter_Amount.sendKeys(excelReader.getCellData("SmokeJVVATView", 81, 6));
			Thread.sleep(1000);
			enter_Amount.sendKeys(Keys.TAB);
				
			String actDebitAccount=select1stRow_1stColumn.getText();
			String expDebitAccount=excelReader.getCellData("SmokeJVVATView", 79, 7);
			excelReader.setCellData(xlfile, "SmokeJVVATView", 79, 8, actDebitAccount);
				
			String actCreditAccount=select1stRow_2ndColumn.getText();
			String expCreditAccount=excelReader.getCellData("SmokeJVVATView", 80, 7);
			excelReader.setCellData(xlfile, "SmokeJVVATView", 80, 8, actCreditAccount);
			
	
			System.out.println(" Entry Page Debit Account      : "+ actDebitAccount +" Value Expected : "+expDebitAccount  );
			System.out.println(" Entry Page Credit Account      : "+ actCreditAccount +" Value Expected : "+expCreditAccount  );
			
			if(actDebitAccount.equalsIgnoreCase(expDebitAccount) &&
					actCreditAccount.equalsIgnoreCase(expCreditAccount))
			{
					System.err.println(" Data Entered Successfully");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 75, 9, resPass);
					return true;
			}
			else
			{
					System.err.println(" Data NOt  Entered Successfully");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 75, 9, resFail);
					return false;
			}
		}
						


		public boolean checkEnteringDataIntoBodySecondRowJVVATView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
				    	
			//Second Row
				

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		    select2ndRow_1stColumn.click();
			 
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys("Customer");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
			int accountCount=bodyAccountListInGrid.size();
			
			System.err.println(accountCount);
				
			for(int i=0 ; i < accountCount ;i++)
			{
				String data=bodyAccountListInGrid.get(i).getText();
				
				
				if(data.equalsIgnoreCase(excelReader.getCellData("SmokeReceiptsVAT", 83, 6)))
				{
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
					bodyAccountListInGrid.get(i).click();
					
					break;
				}
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
			enter_AccountTxt.sendKeys(Keys.TAB);

		    
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_2ndColumn));
		    select2ndRow_2ndColumn.click();
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditACTxt));
			enter_CreditACTxt.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditACTxt));
			enter_CreditACTxt.click();
			
			enter_CreditACTxt.sendKeys("bank");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyCreditAccountListInGrid));
			int account1Count=bodyCreditAccountListInGrid.size();
			
			System.err.println(account1Count);
				
			for(int i=0 ; i < account1Count ;i++)
			{
				String data=bodyCreditAccountListInGrid.get(i).getText();
				
				System.err.println("DATA  : "+data);
				if(data.equalsIgnoreCase(excelReader.getCellData("SmokeReceiptsVAT", 84, 6)))
				{
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyCreditAccountListInGrid));
					bodyCreditAccountListInGrid.get(i).click();
					
					break;
				}
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditACTxt));	
			enter_CreditACTxt.sendKeys(Keys.TAB);
	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterJVVATTaxCode));	
			enterJVVATTaxCode.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			Thread.sleep(1000);
			enter_Amount.sendKeys(excelReader.getCellData("SmokeJVVATView", 85, 6));
			Thread.sleep(1000);
			enter_Amount.sendKeys(Keys.TAB);
				
			String actDebitAccount=select2ndRow_1stColumn.getText();
			String expDebitAccount=excelReader.getCellData("SmokeJVVATView", 83, 7);
			excelReader.setCellData(xlfile, "SmokeJVVATView", 83, 8, actDebitAccount);
				
			String actCreditAccount=select2ndRow_2ndColumn.getText();
			String expCreditAccount=excelReader.getCellData("SmokeJVVATView", 84, 7);
			excelReader.setCellData(xlfile, "SmokeJVVATView", 84, 8, actCreditAccount);
			
			
			String actAmount=select2ndRow_4thColumn.getText();
			String expAmount=excelReader.getCellData("SmokeJVVATView", 85, 7);
			excelReader.setCellData(xlfile, "SmokeJVVATView", 85, 8, actAmount);
			
			
			
			
			
	
			System.out.println(" Entry Page 2nd Debit Account      : "+ actDebitAccount +" Value Expected : "+expDebitAccount  );
			System.out.println(" Entry Page 2nd Credit Account      : "+ actCreditAccount +" Value Expected : "+expCreditAccount  );
			System.out.println(" Entry Page 3rd Credit Account      : "+ actAmount +" Value Expected : "+expAmount);
			
			
			if(actDebitAccount.equalsIgnoreCase(expDebitAccount) &&
					actCreditAccount.equalsIgnoreCase(expCreditAccount) && actAmount.equalsIgnoreCase(expAmount))
			{
					System.err.println(" Data Entered Successfully");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 82, 9, resPass);
					return true;
			}
			else
			{
					System.err.println(" Data NOt  Entered Successfully");
					excelReader.setCellData(xlfile, "SmokeJVVATView", 82, 9, resFail);
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
		
		/*@FindBy(xpath="//tbody[@id='id_Adjustment_Grid_body']//td[13]")
		private static WebElement  billRefGridFirstRowAdjustmentAmtTxt;		
		*/             
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[13]")
		private static WebElement  billRefGridFirstRowAdjustmentAmtTxt;		
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[13]")
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
		
		
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr")
		private static List<WebElement> billRefAdjustBillsGrid;
			
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

		@FindBy(xpath="//*[@id='lblAccount']")//*[@id="lblAccount"]
		private static WebElement  billRefPartyName;
		
		 
		   
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[3]")
		private static List<WebElement>  billwiseAdjustBillsDocList;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[13]")
		private static List<WebElement>  billwiseAdjustBillsAdjustColumn;
			
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[2]/input")
		private static List<WebElement>  billwiseAdjustBillsChkBoxList;
		
		
		
		
		public boolean checkBillwiseScreenInJVVATWithAdjustAmountForVendorA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(2000);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridVendorRow1));
			billRefGridVendorRow1.click();
			
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
			
			String actPartyName = billRefPartyName.getText();
			String expPartyName = excelReader.getCellData("SmokeJVVATView", 87, 7);
			excelReader.setCellData(xlfile, "SmokeJVVATView", 87, 8, actPartyName);
			 
			System.out.println("***************************checkBillwiseScreenInJVVATWithAdjustAmountForVendorA**************************");
			 
			System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
	       
			int Adjustbills=billRefAdjustBillsGrid.size();
			
			String actAdjustbills=Integer.toString(Adjustbills);
			
			String expAdjustbills=excelReader.getCellData("SmokeJVVATView", 88, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 88, 8, actAdjustbills);
			 
			System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
			
			
			int billwiseAdjustBillsDocListcount=billwiseAdjustBillsDocList.size();
  	        
  	        Set<String> actbillwiseAdjustBillsDocList  = new HashSet<String>();
  			
  			for (int i = 0; i < billwiseAdjustBillsDocListcount; i++) 
  			{
  				String data		                              = billwiseAdjustBillsDocList.get(i).getText();
  				actbillwiseAdjustBillsDocList.add(data);
  				
  				
  				System.err.println("Data  :."+data+".");
				   
				if (data.equalsIgnoreCase("NDT44:1")) 
				{
					
					billwiseAdjustBillsChkBoxList.get(i).click();
					
					System.err.println(" Selecting Voucher-------------  NDT44:1");
					
					break;
				}
  			}
  			
  			String actDocumentNumberText=actbillwiseAdjustBillsDocList.toString();
  			
  			String expDocumentNumberText=excelReader.getCellData("SmokeJVVATView", 90, 7);
  			excelReader.setCellData(xlfile, "SmokeJVVATView", 90, 8, actDocumentNumberText);
  			
  			
  	        System.out.println("actDocumentNumberText   : "+actDocumentNumberText);
  	        System.out.println("expDocumentNumberText   : "+expDocumentNumberText);
  			
			String expBillNewReference                      =excelReader.getCellData("SmokeJVVATView", 89, 7);
			String expBillTransactionCurrency               =excelReader.getCellData("SmokeJVVATView", 91, 7);
			String expBillBaseCurrency                      =excelReader.getCellData("SmokeJVVATView", 92, 7);
			String expBillLocalCurrency                     =excelReader.getCellData("SmokeJVVATView", 93, 7);
			String expBillBalanceNewRefAmount               =excelReader.getCellData("SmokeJVVATView", 94, 7);
			
	        String expbillRefAdjustAmountInTransCurency         =excelReader.getCellData("SmokeJVVATView", 95, 7);
	        String expbillRefBalanceAmountAdjustInTrnasCurrency =excelReader.getCellData("SmokeJVVATView", 96, 7);
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	        String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
			String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
			String actBillBaseCurrency                           = billRefBaseCurrency.getText();
			String actBillLocalCurrency                          = localCurrencyDhs.getText();
			String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
	        String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
	        String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
	        
	        
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 89, 8, actBillNewReference);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 91, 8, actBillTransactionCurrency);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 92, 8, actBillBaseCurrency);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 93, 8, actBillLocalCurrency);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 94, 8, actBillBalanceNewRefAmount);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 95, 8, actbillRefAdjustAmountInTransCurency);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 96, 8, actbillRefBalanceAmountAdjustInTrnasCurrency);
	        
	        
	        JavascriptExecutor js = (JavascriptExecutor) getDriver();
	 	    js.executeScript("arguments[0].scrollIntoView();", gridAdjustmentAmtRow1);
	        
	        
	 	    
	 	    Thread.sleep(2000);
	 	    

	        String expBillNewReferencePick                          = excelReader.getCellData("SmokeJVVATView", 98, 7);
	 		String expBillTransactionCurrencyPick                   = excelReader.getCellData("SmokeJVVATView", 99, 7);
	 		String expBillBaseCurrencyPick                          = excelReader.getCellData("SmokeJVVATView", 100, 7);
	 		String expBillLocalCurrencyPick                         = excelReader.getCellData("SmokeJVVATView", 101, 7);
	 		String expBillBalanceNewRefAmountPick                   = excelReader.getCellData("SmokeJVVATView", 102, 7);
	 	    String expbillRefAdjustAmountInTransCurencyPick          = excelReader.getCellData("SmokeJVVATView", 103, 7);
	        String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = excelReader.getCellData("SmokeJVVATView", 104, 7);
	 
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	      
	        String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
	 		String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
	 		String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
	 		String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
	 		String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
	 		String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
		    String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
	    	
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 98, 8, actBillNewReferencePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 99, 8, actBillTransactionCurrencyPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 100, 8, actBillBaseCurrencyPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 101, 8, actBillLocalCurrencyPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 102, 8, actBillBalanceNewRefAmountPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 103, 8, actbillRefAdjustAmountInTransCurencyPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 104, 8, actbillRefBalanceAmountAdjustInTrnasCurrencyPick);
	       

	 	    
	        
	        String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
	        String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
	 		String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();
	        String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
	        String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();
	 		
	        String actasOnEntryDateTransAmtPick              = asOnEntryDateTransAmt.getText();
	        String actasOnEntryDateBaseConcersationRatePick  = asOnEntryDateBaseConcersationRate.getText();
	        String actasOnEntryDateBaseAmountPick            = asOnEntryDateBaseAmount.getText();
	        String actasOnEntryDateLocConversationRatePick   = asOnEntryDateLocConversationRate.getText();
	        String actasOnEntryDateAmtPick                   = asOnEntryDateAmt.getText();
	 	
	        String actbalOnAdjstDateTransAmtPick             = balOnAdjstDateTransAmt.getText();
	        String actbalOnAdjstDateBasrConversionRatePick   = balOnAdjstDateBasrConversionRate.getText();
	        String actbalOnAdjstDateBaseAmountPick           = balOnAdjstDateBaseAmount.getText();
	        String actbalOnAdjstDateLocalConversionRatePick  = balOnAdjstDateLocalConversionRate.getText();
	        String actbalOnAdjstDateAmtPick                  = balOnAdjstDateAmt.getText();
	 		
	        String actadjustmentsAmount1Pick                 = adjustmentsAmount1.getText();
	        String actadjustmentsAmount2Pick                 = adjustmentsAmount2.getText();
	        String actadjustmentsAmount3Pick                 = adjustmentsAmount3.getText();
	        String actadjustmentsAmount4Pick                 = adjustmentsAmount4.getText();
	        
	        String actexchangeGainLossForBaseCurrencyPick    = exchangeGainLossForBaseCurrency.getText();	
	        String actexchangeGainLossForLocalCurrencyPick   = exchangeGainLossForLocalCurrency.getText();
	 	
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 106, 8, actbreakUpDetailsAccountPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 107, 8, actbreakUpDetailsItemPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 108, 8, actbreakUpDetailsDepartmentPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 109, 8, actconversationRateBaseCurrencyRatePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 110, 8, actconversationRateLocalCurrencyRatePick);
	        
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 111, 8, actasOnEntryDateTransAmtPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 112, 8, actasOnEntryDateBaseConcersationRatePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 113, 8, actasOnEntryDateBaseAmountPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 114, 8, actasOnEntryDateLocConversationRatePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 115, 8, actasOnEntryDateAmtPick);
	        
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 116, 8, actbalOnAdjstDateTransAmtPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 117, 8, actbalOnAdjstDateBasrConversionRatePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 118, 8, actbalOnAdjstDateBaseAmountPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 119, 8, actbalOnAdjstDateLocalConversionRatePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 120, 8, actbalOnAdjstDateAmtPick);
	        
	        
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 121, 8, actadjustmentsAmount1Pick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 122, 8, actadjustmentsAmount2Pick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 123, 8, actadjustmentsAmount3Pick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 124, 8, actadjustmentsAmount4Pick);
	        
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 125, 8, actexchangeGainLossForBaseCurrencyPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 126, 8, actexchangeGainLossForLocalCurrencyPick);
	        
	        
	        String expbreakUpDetailsAccountPick             =excelReader.getCellData("SmokeJVVATView", 106, 7);
	        String expbreakUpDetailsItemPick                =excelReader.getCellData("SmokeJVVATView", 107, 7);;
	 		String expbreakUpDetailsDepartmentPick          =excelReader.getCellData("SmokeJVVATView", 108, 7);
	        String expconversationRateBaseCurrencyRatePick  =excelReader.getCellData("SmokeJVVATView", 109, 7);
	        String expconversationRateLocalCurrencyRatePick =excelReader.getCellData("SmokeJVVATView", 110, 7);
	 		
	        String expasOnEntryDateTransAmtPick             =excelReader.getCellData("SmokeJVVATView", 111, 7);
	        String expasOnEntryDateBaseConcersationRatePick =excelReader.getCellData("SmokeJVVATView", 112, 7);
	        String expasOnEntryDateBaseAmountPick           =excelReader.getCellData("SmokeJVVATView", 113, 7);
	        String expasOnEntryDateLocConversationRatePick  =excelReader.getCellData("SmokeJVVATView", 114, 7);
	        String expasOnEntryDateAmtPick                  =excelReader.getCellData("SmokeJVVATView", 115, 7);
	 		
	        String expbalOnAdjstDateTransAmtPick            =excelReader.getCellData("SmokeJVVATView", 116, 7);
	        String expbalOnAdjstDateBasrConversionRatePick  =excelReader.getCellData("SmokeJVVATView", 117, 7);
	        String expbalOnAdjstDateBaseAmountPick          =excelReader.getCellData("SmokeJVVATView", 118, 7);
	        String expbalOnAdjstDateLocalConversionRatePick =excelReader.getCellData("SmokeJVVATView", 119, 7);
	        String expbalOnAdjstDateAmtPick                 =excelReader.getCellData("SmokeJVVATView", 120, 7);
	 	
	        String expadjustmentsAmount1Pick                =excelReader.getCellData("SmokeJVVATView", 121, 7);
	        String expadjustmentsAmount2Pick                =excelReader.getCellData("SmokeJVVATView", 122, 7);
	        String expadjustmentsAmount3Pick                =excelReader.getCellData("SmokeJVVATView", 123, 7);
	        String expadjustmentsAmount4Pick                =excelReader.getCellData("SmokeJVVATView", 124, 7);
	 		
	        String expexchangeGainLossForBaseCurrencyPick   =excelReader.getCellData("SmokeJVVATView", 125, 7);	
	        String expexchangeGainLossForLocalCurrencyPick  =excelReader.getCellData("SmokeJVVATView", 126, 7);

	        
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
	        String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
	        String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
	        String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
	        
	         
	        String expgridOrginalAmtRow1      =excelReader.getCellData("SmokeJVVATView", 127, 7);
	        String expgridBalanceAmtRow1      =excelReader.getCellData("SmokeJVVATView", 128, 7);
	        String expgridAdjustmentAmtRow1   =excelReader.getCellData("SmokeJVVATView", 129, 7);
	       
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 127, 8, actgridOrginalAmtRow1);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 128, 8, actgridBalanceAmtRow1);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 129, 8, actgridAdjustmentAmtRow1);
	       
	        
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	 		billRefPickIcon.click();
	   
	        System.out.println("*********************************************************************************************************");

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
	        System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick+            " " +"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
	        System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick +        "  " +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
	        System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick+ "  " +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
	        System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick+ " " + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
	        System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick  + "       " + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
	        System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick + "       " +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
	        System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick          + "       " +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
	        System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick + "       " +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
	        System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick+ "       " + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);
	        
	        System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick + "       " +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
	        System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick+ "       " +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
	        System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick + "       " +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
	        System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick + "       " +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
	        System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick + "       " +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);
	        
	        System.out.println("actadjustmentsAmount1Pick :   "+ actadjustmentsAmount1Pick+ "       " +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
	        System.out.println("actadjustmentsAmount2PickPick :"+ actadjustmentsAmount2Pick + "       " +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
	        System.out.println("actadjustmentsAmount3PickPick :"+ actadjustmentsAmount3Pick+ "       " + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
	        System.out.println("actadjustmentsAmount4PickPick :"+ actadjustmentsAmount4Pick + "       " +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);
	        
	        System.out.println("actexchangeGainLossForBaseCurrencyPick : "+ actexchangeGainLossForBaseCurrencyPick + "       " +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
	        System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick+ "       " +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);

	        System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
	        System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);

		        
	        
	       System.out.println("actgridOrginalAmtRow1     :" +actgridOrginalAmtRow1     +" Value Expected  :" +"expgridOrginalAmtRow1   :" +expgridOrginalAmtRow1);
	       System.out.println("actgridBalanceAmtRow1     :" +actgridBalanceAmtRow1     +" Value Expected  :" +"expgridBalanceAmtRow1   :" +expgridBalanceAmtRow1);
	       System.out.println("actgridAdjustmentAmtRow1  :" +actgridAdjustmentAmtRow1  +" Value Expected  :" +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
	       
	     
	       if(actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
 				actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
 				actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
 			     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
 				actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
 		        
        		
 		        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
				actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
				actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick) && actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
				actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
				actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
				actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
				actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
				actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
				actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick) && 
				actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
				actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
				actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
				actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
				actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick) && actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
				actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) &&
				
				 actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
			     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1))
		        
			{
				System.err.println(" Pick Option With New Refernce  Amount");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 86, 9, resPass);
				return true;
			}
			else
			{
				System.err.println(" Pick Option Fails With Adjustment Amount ");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 86, 9, resFail);
				return false;
			}
			}


		
		public boolean checkBillwiseScreenInJVVATWithAdjustAmountForCustomerA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			String docno=documentNumberTxt.getAttribute("value");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridVendorRow2));
			billRefGridVendorRow2.click();
			
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
			
			String actPartyName = billRefPartyName.getText();
			String expPartyName = excelReader.getCellData("SmokeJVVATView", 134, 7);
			excelReader.setCellData(xlfile, "SmokeJVVATView", 134, 8, actPartyName);
			 
			System.out.println("***************************checkBillwiseScreenInJVVATWithAdjustAmountForCustomerA**************************");
			 
			System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
	       
			int Adjustbills=billRefAdjustBillsGrid.size();
			
			String actAdjustbills=Integer.toString(Adjustbills);
			
			String expAdjustbills=excelReader.getCellData("SmokeJVVATView", 135, 7);
			
			excelReader.setCellData(xlfile, "SmokeJVVATView", 135, 8, actAdjustbills);
			 
			System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
			
			
			int billwiseAdjustBillsDocListcount=billwiseAdjustBillsDocList.size();
  	        
  	        HashSet<String> actbillwiseAdjustBillsDocList  = new HashSet<String>();
  			
  			for (int i = 0; i < billwiseAdjustBillsDocListcount; i++) 
  			{
  				String data		                              = billwiseAdjustBillsDocList.get(i).getText();
  				actbillwiseAdjustBillsDocList.add(data);
  				
  				
  				System.err.println("Data  :."+data+".");
				   
				if (data.equalsIgnoreCase("SalRet:2")) 
				{
					
					billwiseAdjustBillsChkBoxList.get(i).click();
					
					System.err.println(" Selecting Voucher-------------  SalRet:2");
					
					break;
				}
  			}
  			
  			String actDocumentNumberText=actbillwiseAdjustBillsDocList.toString();
  			
  			String expDocumentNumberText=excelReader.getCellData("SmokeJVVATView", 137, 7);
  			excelReader.setCellData(xlfile, "SmokeJVVATView", 137, 8, actDocumentNumberText);
  			
  			
  	        System.out.println("actDocumentNumberText   : "+actDocumentNumberText);
  	        System.out.println("expDocumentNumberText   : "+expDocumentNumberText);
  			
			String expBillNewReference                      =excelReader.getCellData("SmokeJVVATView", 136, 7);
			String expBillTransactionCurrency               =excelReader.getCellData("SmokeJVVATView", 138, 7);
			String expBillBaseCurrency                      =excelReader.getCellData("SmokeJVVATView", 139, 7);
			String expBillLocalCurrency                     =excelReader.getCellData("SmokeJVVATView", 140, 7);
			String expBillBalanceNewRefAmount               =excelReader.getCellData("SmokeJVVATView", 141, 7);
			
	        String expbillRefAdjustAmountInTransCurency         =excelReader.getCellData("SmokeJVVATView", 142, 7);
	        String expbillRefBalanceAmountAdjustInTrnasCurrency =excelReader.getCellData("SmokeJVVATView", 143, 7);
	        

	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	        String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
			String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
			String actBillBaseCurrency                           = billRefBaseCurrency.getText();
			String actBillLocalCurrency                          = localCurrencyDhs.getText();
			String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
	        String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
	        String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
	        
	        
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 136, 8, actBillNewReference);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 138, 8, actBillTransactionCurrency);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 139, 8, actBillBaseCurrency);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 140, 8, actBillLocalCurrency);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 141, 8, actBillBalanceNewRefAmount);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 142, 8, actbillRefAdjustAmountInTransCurency);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 143, 8, actbillRefBalanceAmountAdjustInTrnasCurrency);
	        
	        
	        JavascriptExecutor js = (JavascriptExecutor) getDriver();
	 	    js.executeScript("arguments[0].scrollIntoView();", gridAdjustmentAmtRow1);
	        
	        
	 	    
	 	    Thread.sleep(2000);
	 	    

	        String expBillNewReferencePick                          = excelReader.getCellData("SmokeJVVATView", 145, 7);
	 		String expBillTransactionCurrencyPick                   = excelReader.getCellData("SmokeJVVATView", 146, 7);
	 		String expBillBaseCurrencyPick                          = excelReader.getCellData("SmokeJVVATView", 147, 7);
	 		String expBillLocalCurrencyPick                         = excelReader.getCellData("SmokeJVVATView", 148, 7);
	 		String expBillBalanceNewRefAmountPick                   = excelReader.getCellData("SmokeJVVATView", 149, 7);
	 	    String expbillRefAdjustAmountInTransCurencyPick          = excelReader.getCellData("SmokeJVVATView", 150, 7);
	        String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = excelReader.getCellData("SmokeJVVATView", 151, 7);
	 
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	      
	        String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
	 		String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
	 		String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
	 		String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
	 		String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
	 		String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
		    String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
	    	
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 145, 8, actBillNewReferencePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 146, 8, actBillTransactionCurrencyPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 147, 8, actBillBaseCurrencyPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 148, 8, actBillLocalCurrencyPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 149, 8, actBillBalanceNewRefAmountPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 150, 8, actbillRefAdjustAmountInTransCurencyPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 151, 8, actbillRefBalanceAmountAdjustInTrnasCurrencyPick);
	       
	        String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
	        String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
	 		String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();
	        String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
	        String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();
	 		
	        String actasOnEntryDateTransAmtPick              = asOnEntryDateTransAmt.getText();
	        String actasOnEntryDateBaseConcersationRatePick  = asOnEntryDateBaseConcersationRate.getText();
	        String actasOnEntryDateBaseAmountPick            = asOnEntryDateBaseAmount.getText();
	        String actasOnEntryDateLocConversationRatePick   = asOnEntryDateLocConversationRate.getText();
	        String actasOnEntryDateAmtPick                   = asOnEntryDateAmt.getText();
	 	
	        String actbalOnAdjstDateTransAmtPick             = balOnAdjstDateTransAmt.getText();
	        String actbalOnAdjstDateBasrConversionRatePick   = balOnAdjstDateBasrConversionRate.getText();
	        String actbalOnAdjstDateBaseAmountPick           = balOnAdjstDateBaseAmount.getText();
	        String actbalOnAdjstDateLocalConversionRatePick  = balOnAdjstDateLocalConversionRate.getText();
	        String actbalOnAdjstDateAmtPick                  = balOnAdjstDateAmt.getText();
	 		
	        String actadjustmentsAmount1Pick                 = adjustmentsAmount1.getText();
	        String actadjustmentsAmount2Pick                 = adjustmentsAmount2.getText();
	        String actadjustmentsAmount3Pick                 = adjustmentsAmount3.getText();
	        String actadjustmentsAmount4Pick                 = adjustmentsAmount4.getText();
	        
	        String actexchangeGainLossForBaseCurrencyPick    = exchangeGainLossForBaseCurrency.getText();	
	        String actexchangeGainLossForLocalCurrencyPick   = exchangeGainLossForLocalCurrency.getText();
	 	
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 153, 8, actbreakUpDetailsAccountPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 154, 8, actbreakUpDetailsDepartmentPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 155, 8, actconversationRateBaseCurrencyRatePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 156, 8, actconversationRateLocalCurrencyRatePick);
	        
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 157, 8, actasOnEntryDateTransAmtPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 158, 8, actasOnEntryDateBaseConcersationRatePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 159, 8, actasOnEntryDateBaseAmountPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 160, 8, actasOnEntryDateLocConversationRatePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 161, 8, actasOnEntryDateAmtPick);
	        
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 162, 8, actbalOnAdjstDateTransAmtPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 163, 8, actbalOnAdjstDateBasrConversionRatePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 164, 8, actbalOnAdjstDateBaseAmountPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 165, 8, actbalOnAdjstDateLocalConversionRatePick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 166, 8, actbalOnAdjstDateAmtPick);
	        
	        
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 167, 8, actadjustmentsAmount1Pick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 168, 8, actadjustmentsAmount2Pick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 169, 8, actadjustmentsAmount3Pick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 170, 8, actadjustmentsAmount4Pick);
	        
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 171, 8, actexchangeGainLossForBaseCurrencyPick);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 172, 8, actexchangeGainLossForLocalCurrencyPick);
	        
	        
	        String expbreakUpDetailsAccountPick             =excelReader.getCellData("SmokeJVVATView", 153, 7);
	 		String expbreakUpDetailsDepartmentPick          =excelReader.getCellData("SmokeJVVATView", 154, 7);
	        String expconversationRateBaseCurrencyRatePick  =excelReader.getCellData("SmokeJVVATView", 155, 7);
	        String expconversationRateLocalCurrencyRatePick =excelReader.getCellData("SmokeJVVATView", 156, 7);
	 		
	        String expasOnEntryDateTransAmtPick             =excelReader.getCellData("SmokeJVVATView", 157, 7);
	        String expasOnEntryDateBaseConcersationRatePick =excelReader.getCellData("SmokeJVVATView", 158, 7);
	        String expasOnEntryDateBaseAmountPick           =excelReader.getCellData("SmokeJVVATView", 159, 7);
	        String expasOnEntryDateLocConversationRatePick  =excelReader.getCellData("SmokeJVVATView", 160, 7);
	        String expasOnEntryDateAmtPick                  =excelReader.getCellData("SmokeJVVATView", 161, 7);
	 		
	        String expbalOnAdjstDateTransAmtPick            =excelReader.getCellData("SmokeJVVATView", 162, 7);
	        String expbalOnAdjstDateBasrConversionRatePick  =excelReader.getCellData("SmokeJVVATView", 163, 7);
	        String expbalOnAdjstDateBaseAmountPick          =excelReader.getCellData("SmokeJVVATView", 164, 7);
	        String expbalOnAdjstDateLocalConversionRatePick =excelReader.getCellData("SmokeJVVATView", 165, 7);
	        String expbalOnAdjstDateAmtPick                 =excelReader.getCellData("SmokeJVVATView", 166, 7);
	 	
	        String expadjustmentsAmount1Pick                =excelReader.getCellData("SmokeJVVATView", 167, 7);
	        String expadjustmentsAmount2Pick                =excelReader.getCellData("SmokeJVVATView", 168, 7);
	        String expadjustmentsAmount3Pick                =excelReader.getCellData("SmokeJVVATView", 169, 7);
	        String expadjustmentsAmount4Pick                =excelReader.getCellData("SmokeJVVATView", 170, 7);
	 		
	        String expexchangeGainLossForBaseCurrencyPick   =excelReader.getCellData("SmokeJVVATView", 171, 7);	
	        String expexchangeGainLossForLocalCurrencyPick  =excelReader.getCellData("SmokeJVVATView", 172, 7);

	        
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
	        String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
	        String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
	        String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
	        
	         
	        String expgridOrginalAmtRow1      =excelReader.getCellData("SmokeJVVATView", 173, 7);
	        String expgridBalanceAmtRow1      =excelReader.getCellData("SmokeJVVATView", 174, 7);
	        String expgridAdjustmentAmtRow1   =excelReader.getCellData("SmokeJVVATView", 175, 7);
	       
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 173, 8, actgridOrginalAmtRow1);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 174, 8, actgridBalanceAmtRow1);
	        excelReader.setCellData(xlfile, "SmokeJVVATView", 175, 8, actgridAdjustmentAmtRow1);
	       
	       
	       
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	 		billRefPickIcon.click();
	   
            Thread.sleep(2000);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			 
			
			
	        boolean savingVoucher=checkVoucherSavingMessage(docno);
	        
	        
	        System.out.println("savingVoucher  :  "+savingVoucher +"Value Expected   "+ " TRUE");
		        
	 		
	        System.out.println("*********************************************************************************************************");

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
	        System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick+            " " +"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
	        System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick +        "  " +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
	        System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick+ "  " +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
	        System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick+ " " + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
	        System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick  + "       " + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
	        System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick + "       " +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
	        System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick          + "       " +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
	        System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick + "       " +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
	        System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick+ "       " + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);
	        
	        System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick + "       " +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
	        System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick+ "       " +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
	        System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick + "       " +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
	        System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick + "       " +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
	        System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick + "       " +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);
	        
	        System.out.println("actadjustmentsAmount1Pick :   "+ actadjustmentsAmount1Pick+ "       " +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
	        System.out.println("actadjustmentsAmount2PickPick :"+ actadjustmentsAmount2Pick + "       " +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
	        System.out.println("actadjustmentsAmount3PickPick :"+ actadjustmentsAmount3Pick+ "       " + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
	        System.out.println("actadjustmentsAmount4PickPick :"+ actadjustmentsAmount4Pick + "       " +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);
	        
	        System.out.println("actexchangeGainLossForBaseCurrencyPick : "+ actexchangeGainLossForBaseCurrencyPick + "       " +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
	        System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick+ "       " +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);

	        System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
	        System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);

		        
	        
	       System.out.println("actgridOrginalAmtRow1     :" +actgridOrginalAmtRow1     +" Value Expected  :" +"expgridOrginalAmtRow1   :" +expgridOrginalAmtRow1);
	       System.out.println("actgridBalanceAmtRow1     :" +actgridBalanceAmtRow1     +" Value Expected  :" +"expgridBalanceAmtRow1   :" +expgridBalanceAmtRow1);
	       System.out.println("actgridAdjustmentAmtRow1  :" +actgridAdjustmentAmtRow1  +" Value Expected  :" +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
	       
	       if(actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
 				actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
 				actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
 			     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
 				actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
 		        
        		
 		        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
				actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
				actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick) && actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
				actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
				actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
				actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
				actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
				actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
				actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick) && 
				actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
				actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
				actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
				actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
				actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick) && actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
				actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) &&
				
				 actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
			     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) )
		        
			{
				System.err.println(" Pick Option With New Refernce  Amount");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 133, 9, resPass);
				return true;
			}
			else
			{
				System.err.println(" Pick Option Fails With Adjustment Amount ");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 133, 9, resFail);
				return false;
			}
			}
		
		
		
		
		

		
		public boolean checkSavedVoucherInJVVATView()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		    previousBtn.click();
			
		    boolean loading=checkLoadingMessage();
		    
		    
		    Thread.sleep(2000);
		    
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String actDocno             = documentNumberTxt.getAttribute("value");
			String actVouDate           = dateTxt.getAttribute("value");
			String actDueDate           = voucherHeaderDueDate.getAttribute("value");
			String actDepartment        = departmentTxt.getAttribute("value");
			String actCurrency          = voucherHeaderCurrency.getAttribute("value");
			String actLocalExchangeRate = voucherHeaderLocalExchangeRate.getAttribute("value");
			String actPlaceOfSupply     = PDRVATPlaceOfSupplyTXt.getAttribute("value");
					
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expDate=df.format(date);
		    
		    System.out.println("expDate   :"+expDate);
			
		     excelReader.setCellData(xlfile, "SmokeJVVATView", 177, 8, actDocno);
		     excelReader.setCellData(xlfile, "SmokeJVVATView", 178, 7, actVouDate);
		     excelReader.setCellData(xlfile, "SmokeJVVATView", 179, 7, actDueDate);
		     excelReader.setCellData(xlfile, "SmokeJVVATView", 178, 8, actVouDate);
		     excelReader.setCellData(xlfile, "SmokeJVVATView", 179, 8, actDueDate);
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 180, 8, actDepartment);
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 181, 8, actCurrency);
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 182, 8, actLocalExchangeRate);
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 183, 8, actPlaceOfSupply);
			
			
			String expDocno              = excelReader.getCellData("SmokeJVVATView", 177, 7);
		    String expDepartment         = excelReader.getCellData("SmokeJVVATView", 180, 7);
			String expCurrency           = excelReader.getCellData("SmokeJVVATView", 181, 7);
			String expLocalExchangeRate  = excelReader.getCellData("SmokeJVVATView", 182, 7);
			String expPlaceOfSupply      = excelReader.getCellData("SmokeJVVATView", 183, 7);
			
			
			
			
			String actAccountR1           = select1stRow_1stColumn.getText();
			String actCreditAccountR1     = select1stRow_2ndColumn.getText();
			String actTaxcodeR1           = select1stRow_3rdColumn.getText();
			String actAmountR1            = select1stRow_4thColumn.getText();
			String actrefR1               = select1stRow_5thColumn.getText();
			
			String actAccountR2           = select2ndRow_1stColumn.getText();
			String actCreditAccountR2     = select2ndRow_2ndColumn.getText();
			String actTaxcodeR2           = select2ndRow_3rdColumn.getText();
			String actAmountR2            = select2ndRow_4thColumn.getText();
			  
		   
			String expAccountR1          = excelReader.getCellData("SmokeJVVATView", 184, 7);
			String expCreditAccountR1    = excelReader.getCellData("SmokeJVVATView", 185, 7);
			String expTaxcodeR1          = excelReader.getCellData("SmokeJVVATView", 186, 7);
			String expAmountR1           = excelReader.getCellData("SmokeJVVATView", 187, 7);
			String exprefR1              = excelReader.getCellData("SmokeJVVATView", 188, 7);
			 
			
			String expAccountR2          = excelReader.getCellData("SmokeJVVATView", 189, 7);
			String expCreditAccountR2    = excelReader.getCellData("SmokeJVVATView", 190, 7);
			String expTaxcodeR2          = excelReader.getCellData("SmokeJVVATView", 191, 7);
			String expAmountR2           = excelReader.getCellData("SmokeJVVATView", 192, 7);
			 
			
			
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 184, 8, actAccountR1);
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 185, 8, actCreditAccountR1);
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 186, 8, actTaxcodeR1);
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 187, 8, actAmountR1);
			 
			 
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 189, 8, actAccountR2);
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 190, 8, actCreditAccountR2);
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 191, 8, actTaxcodeR2);
			 excelReader.setCellData(xlfile, "SmokeJVVATView", 192, 8, actAmountR2);
			  
		  
			
			String actFooterAmt   =footerAmount.getText();
			String expFooterAmt   =excelReader.getCellData("SmokeJVVATView", 194, 7);
		
			excelReader.setCellData(xlfile, "SmokeJVVATView", 194, 8, actFooterAmt);

			
			System.out.println("Entry Page Document Number    "+actDocno       +"  value Expected  "+expDocno);
			System.out.println("Entry Page Voucher Date       "+actVouDate     +"  value Expected  "+expDate);
			System.out.println("Entry Page Currecy            "+actCurrency    +"  value Expected  "+expCurrency);
			System.out.println("Entry Page Department         "+actDepartment  +"  value Expected  "+expDepartment);
			System.out.println("Entry Page Local Exchange     "+actLocalExchangeRate  +"  value Expected  "+expLocalExchangeRate);
			
			System.out.println("Entry Page Account            "+actAccountR1     +"  value Expected  "+expAccountR1);
			System.out.println("Entry Page Credit Acc         "+actCreditAccountR1     +"  value Expected  "+expCreditAccountR1);
			System.out.println("Entry Page Taxcode            "+actTaxcodeR1     +"  value Expected  "+expTaxcodeR1);
			System.out.println("Entry Page Amount             "+actAmountR1      +"  value Expected  "+expAmountR1);
			System.out.println("Entry Page Reference          "+actrefR1         +"  value Expected  "+exprefR1);
			
			System.out.println("Entry Page Account            "+actAccountR2     +"  value Expected  "+expAccountR2);
			System.out.println("Entry Page Credit Acc         "+actCreditAccountR2     +"  value Expected  "+expCreditAccountR2);
			System.out.println("Entry Page Taxcode            "+actTaxcodeR2     +"  value Expected  "+expTaxcodeR2);
			System.out.println("Entry Page Amount             "+actAmountR2      +"  value Expected  "+expAmountR2);
			
			System.out.println("Entry Page Place Of Supply    "+actPlaceOfSupply  +"  value Expected  "+expPlaceOfSupply);
			System.out.println("Entry Page Footer  Amount     "+actFooterAmt   +"  Value Expected  "+expFooterAmt);
			
			
			if ( actDocno.equalsIgnoreCase(expDocno) && actVouDate.equalsIgnoreCase(expDate) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					 actCurrency.startsWith(expCurrency) && actLocalExchangeRate.equalsIgnoreCase(expLocalExchangeRate) && 
					  actDueDate.equalsIgnoreCase(actDueDate) &&actCreditAccountR1.equalsIgnoreCase(expCreditAccountR1) && 
					  actCreditAccountR2.equalsIgnoreCase(expCreditAccountR2) && 
						
					 
					actAccountR1.equalsIgnoreCase(expAccountR1) && actAmountR1.equalsIgnoreCase(expAmountR1) && actTaxcodeR1.equalsIgnoreCase(expTaxcodeR1) && 
					
					actAccountR2.equalsIgnoreCase(expAccountR2) &&actAmountR2.equalsIgnoreCase(expAmountR2) && actTaxcodeR2.equalsIgnoreCase(expTaxcodeR2) && 
					
					
					actFooterAmt.equalsIgnoreCase(expFooterAmt) && actPlaceOfSupply.equalsIgnoreCase(expPlaceOfSupply))
			
			{
				System.out.println(" Test Pass: Values are Expected in JVVAT View Entry Page");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 176, 9, resPass);
				return true;
			}
			else
			{
				System.err.println(" Test Fail:  Values are Expected in JVVAT View Entry Page");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 176, 9, resFail);
				return false;
			}
		}
	
	

		
	    
   public boolean checkCopyAndPasteToClipBoardAndSavingInJVVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
        toggleBtn.click();
        
        
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copytoClipboardBtn));
        copytoClipboardBtn.click();
		
        Thread.sleep(2000);
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nextBtn));
        nextBtn.click();
        
        Thread.sleep(2000);
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
        toggleBtn.click();
        
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteFromClipBoardOption));
        pasteFromClipBoardOption.click();
		
		
        String exppasteMessage=excelReader.getCellData("SmokeJVVATView", 195, 7);
		
		String validationMessage1=checkValidationMessage(exppasteMessage);
			
		excelReader.setCellData(xlfile, "SmokeJVVATView", 195, 8, validationMessage1);
        
        
        Thread.sleep(2000);
		
        String docno=documentNumberTxt.getAttribute("value");
        
		 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String actDocno             = documentNumberTxt.getAttribute("value");
		String actVouDate           = dateTxt.getAttribute("value");
		String actDueDate           = voucherHeaderDueDate.getAttribute("value");
		String actDepartment        = departmentTxt.getAttribute("value");
		String actCurrency          = voucherHeaderCurrency.getAttribute("value");
		String actLocalExchangeRate = voucherHeaderLocalExchangeRate.getAttribute("value");
		String actPlaceOfSupply     = PDRVATPlaceOfSupplyTXt.getAttribute("value");
				
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	    Date date=new Date();
	    String expDate=df.format(date);
	    
	    System.out.println("expDate   :"+expDate);
		
	     excelReader.setCellData(xlfile, "SmokeJVVATView", 196, 8, actDocno);
	     excelReader.setCellData(xlfile, "SmokeJVVATView", 197, 7, actVouDate);
	     excelReader.setCellData(xlfile, "SmokeJVVATView", 198, 7, actDueDate);
	     excelReader.setCellData(xlfile, "SmokeJVVATView", 197, 8, actVouDate);
	     excelReader.setCellData(xlfile, "SmokeJVVATView", 198, 8, actDueDate);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 199, 8, actDepartment);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 200, 8, actCurrency);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 201, 8, actLocalExchangeRate);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 202, 8, actPlaceOfSupply);
		
		
		String expDocno              = excelReader.getCellData("SmokeJVVATView", 196, 7);
	    String expDepartment         = excelReader.getCellData("SmokeJVVATView", 199, 7);
		String expCurrency           = excelReader.getCellData("SmokeJVVATView", 200, 7);
		String expLocalExchangeRate  = excelReader.getCellData("SmokeJVVATView", 201, 7);
		String expPlaceOfSupply      = excelReader.getCellData("SmokeJVVATView", 202, 7);
		
		String actAccountR1           = select1stRow_1stColumn.getText();
		String actCreditAccountR1     = select1stRow_2ndColumn.getText();
		String actTaxcodeR1           = select1stRow_3rdColumn.getText();
		String actAmountR1            = select1stRow_4thColumn.getText();
		String actrefR1               = select1stRow_5thColumn.getText();
		
		String actAccountR2           = select2ndRow_1stColumn.getText();
		String actCreditAccountR2     = select2ndRow_2ndColumn.getText();
		String actTaxcodeR2           = select2ndRow_3rdColumn.getText();
		String actAmountR2            = select2ndRow_4thColumn.getText();
		String actrefR2               = select2ndRow_5thColumn.getText();
		  
	   
		String expAccountR1          = excelReader.getCellData("SmokeJVVATView", 203, 7);
		String expCreditAccountR1    = excelReader.getCellData("SmokeJVVATView", 204, 7);
		String expTaxcodeR1          = excelReader.getCellData("SmokeJVVATView", 205, 7);
		String expAmountR1           = excelReader.getCellData("SmokeJVVATView", 206, 7);
		String exprefR1              = excelReader.getCellData("SmokeJVVATView", 207, 7);
		 
		
		String expAccountR2          = excelReader.getCellData("SmokeJVVATView", 208, 7);
		String expCreditAccountR2    = excelReader.getCellData("SmokeJVVATView", 209, 7);
		String expTaxcodeR2          = excelReader.getCellData("SmokeJVVATView", 210, 7);
		String expAmountR2           = excelReader.getCellData("SmokeJVVATView", 211, 7);
		String exprefR2              = excelReader.getCellData("SmokeJVVATView", 212, 7);
		 
		
		
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 203, 8, actAccountR1);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 204, 8, actCreditAccountR1);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 205, 8, actTaxcodeR1);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 206, 8, actAmountR1);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 207, 8, actrefR1);
		 
		 
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 208, 8, actAccountR2);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 209, 8, actCreditAccountR2);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 210, 8, actTaxcodeR2);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 211, 8, actAmountR2);
		 excelReader.setCellData(xlfile, "SmokeJVVATView", 212, 8, actrefR2);
		  
	  
		
		String actFooterAmt   =footerAmount.getText();
		String expFooterAmt   =excelReader.getCellData("SmokeJVVATView", 213, 7);
	
		excelReader.setCellData(xlfile, "SmokeJVVATView", 213, 8, actFooterAmt);

		
		System.out.println("************************************88checkCopyAndPasteToClipBoardAndSavingInJVVAT****************");
		
		
		System.out.println("Entry Page Document Number    "+actDocno       +"  value Expected  "+expDocno);
		System.out.println("Entry Page Voucher Date       "+actVouDate     +"  value Expected  "+expDate);
		System.out.println("Entry Page Currecy            "+actCurrency    +"  value Expected  "+expCurrency);
		System.out.println("Entry Page Department         "+actDepartment  +"  value Expected  "+expDepartment);
		System.out.println("Entry Page Local Exchange     "+actLocalExchangeRate  +"  value Expected  "+expLocalExchangeRate);
		
		System.out.println("Entry Page Account            "+actAccountR1     +"  value Expected  "+expAccountR1);
		System.out.println("Entry Page Credit Acc         "+actCreditAccountR1     +"  value Expected  "+expCreditAccountR1);
		System.out.println("Entry Page Taxcode            "+actTaxcodeR1     +"  value Expected  "+expTaxcodeR1);
		System.out.println("Entry Page Amount             "+actAmountR1      +"  value Expected  "+expAmountR1);
		
		
		System.out.println("Entry Page Account            "+actAccountR2     +"  value Expected  "+expAccountR2);
		System.out.println("Entry Page Credit Acc         "+actCreditAccountR2     +"  value Expected  "+expCreditAccountR2);
		System.out.println("Entry Page Taxcode            "+actTaxcodeR2     +"  value Expected  "+expTaxcodeR2);
		System.out.println("Entry Page Amount             "+actAmountR2      +"  value Expected  "+expAmountR2);
	
		
		System.out.println("Entry Page Place Of Supply    "+actPlaceOfSupply  +"  value Expected  "+expPlaceOfSupply);
		System.out.println("Entry Page Footer  Amount     "+actFooterAmt   +"  Value Expected  "+expFooterAmt);

		
    	
    	
		//First Row
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstRowIndex));
		firstRowIndex.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteRowBtn));
		deleteRowBtn.click();
		 
		 	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));	
		saveBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		
		String actPartyName = billRefPartyName.getText();
		String expPartyName = excelReader.getCellData("SmokeJVVATView", 214, 7);
		excelReader.setCellData(xlfile, "SmokeJVVATView", 214, 8, actPartyName);
		 
		
		 
		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
       
		int Adjustbills=billRefAdjustBillsGrid.size();
		
		String actAdjustbills=Integer.toString(Adjustbills);
		
		String expAdjustbills=excelReader.getCellData("SmokeJVVATView", 215, 7);
		
		excelReader.setCellData(xlfile, "SmokeJVVATView", 215, 8, actAdjustbills);
		 
		System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
		
		
		int billwiseAdjustBillsDocListcount=billwiseAdjustBillsDocList.size();
        
        HashSet<String> actbillwiseAdjustBillsDocList  = new HashSet<String>();
		
		for (int i = 0; i < billwiseAdjustBillsDocListcount; i++) 
		{
			String data		                              = billwiseAdjustBillsDocList.get(i).getText();
			actbillwiseAdjustBillsDocList.add(data);
		}
		
		String actDocumentNumberText=actbillwiseAdjustBillsDocList.toString();
		
		String expDocumentNumberText=excelReader.getCellData("SmokeJVVATView", 216, 7);
		excelReader.setCellData(xlfile, "SmokeJVVATView", 216, 8, actDocumentNumberText);
		
		
        System.out.println("actDocumentNumberText   : "+actDocumentNumberText);
        System.out.println("expDocumentNumberText   : "+expDocumentNumberText);
		
  	     
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
        String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
        String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
        String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
        
         
        String expgridOrginalAmtRow1      =excelReader.getCellData("SmokeJVVATView", 217, 7);
        String expgridBalanceAmtRow1      =excelReader.getCellData("SmokeJVVATView", 218, 7);
        String expgridAdjustmentAmtRow1   =excelReader.getCellData("SmokeJVVATView", 219, 7);
       
        excelReader.setCellData(xlfile, "SmokeJVVATView", 217, 8, actgridOrginalAmtRow1);
        excelReader.setCellData(xlfile, "SmokeJVVATView", 218, 8, actgridBalanceAmtRow1);
        excelReader.setCellData(xlfile, "SmokeJVVATView", 219, 8, actgridAdjustmentAmtRow1);
        
			
  	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
  	    billRefNewReferenceTxt.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		 
		
		
        boolean savingVoucher=checkVoucherSavingMessage(docno);
        
        
        System.out.println("savingVoucher  :  "+savingVoucher +"Value Expected   "+ " TRUE");
	        
		 
		 
		if(actPartyName.equalsIgnoreCase(expPartyName) && actAdjustbills.equalsIgnoreCase(expAdjustbills) && 
			actDocumentNumberText.equalsIgnoreCase(expDocumentNumberText) && savingVoucher==true && 
				
			  actDocno.equalsIgnoreCase(expDocno) && actVouDate.equalsIgnoreCase(expDate) &&actDepartment.equalsIgnoreCase(expDepartment) && 
			  actCurrency.startsWith(expCurrency) && actLocalExchangeRate.equalsIgnoreCase(expLocalExchangeRate) && 
			  actDueDate.equalsIgnoreCase(actDueDate) &&actCreditAccountR1.equalsIgnoreCase(expCreditAccountR1) && 
			  actCreditAccountR2.equalsIgnoreCase(expCreditAccountR2) && actAccountR1.equalsIgnoreCase(expAccountR1) && 
			  actAmountR1.equalsIgnoreCase(expAmountR1) && actTaxcodeR1.equalsIgnoreCase(expTaxcodeR1) && 
              actAccountR2.equalsIgnoreCase(expAccountR2) &&actAmountR2.equalsIgnoreCase(expAmountR2) && actTaxcodeR2.equalsIgnoreCase(expTaxcodeR2) && 
              actFooterAmt.equalsIgnoreCase(expFooterAmt) && actPlaceOfSupply.equalsIgnoreCase(expPlaceOfSupply))
		{
				System.err.println(" Voucher Saved  Successfully With paste to clipboard");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 195, 9, resPass);
				return true;
			}
			else
			{
				System.err.println(" Voucher NOt   Saved  Successfully With paste to clipboard");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 195, 9, resFail);
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
	
	@FindBy(xpath="//tr[@id='tr_copydoc_voucher_2']//td//input")
	private static WebElement cd_SecoundChkBox;
	
	
	
	
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





	public boolean checkCopyDocumentAndSavingInJVVATView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
        toggleBtn.click();
       
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyDocumentOption));
        copyDocumentOption.click();
		
       
		Thread.sleep(2000);
		
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
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FirstChkBox));
		cd_FirstChkBox.click();
		
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_OkBtn));
		cd_OkBtn.click();
		
		
		System.out.println("******************************checkCopyDocumentAndSavingInJVVAT*********************************");
		
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
		
		
		
		boolean displayMethod=actcd_vouchertypeTxt==expcd_vouchertypeTxt && actcd_searchOnDropdown1==expcd_searchOnDropdown1
				&& actcd_searchOnDropdown2==expcd_searchOnDropdown2 && actcd_searchTxt==expcd_searchTxt
				&& actcd_refreshBtn==expcd_refreshBtn && actcd_filterBtn==expcd_filterBtn
				&& actcd_HeaderChkBox==expcd_HeaderChkBox && actcd_FirstChkBox==expcd_FirstChkBox
				&& actcd_clubsimilarTransChkBox==expcd_clubsimilarTransChkBox && actcd_SelectallBtn==expcd_SelectallBtn
				&& actcd_firstBtn==expcd_firstBtn && actcd_PreviousBtn==expcd_PreviousBtn
				&& actcd_PageNo==expcd_PageNo && actcd_nextBtn==expcd_nextBtn
				&& actcd_LastBtn==expcd_LastBtn && actcd_OkBtn==expcd_OkBtn && actcd_CancelBtn==expcd_CancelBtn;
		
		
		String actDisplayResult=Boolean.toString(displayMethod);
		String expDisplayResult=excelReader.getCellData("SmokeJVVATView", 220, 7);

		excelReader.setCellData(xlfile, "SmokeJVVATView", 220, 8, actDisplayResult);

         Thread.sleep(2000); 
      
 	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
 		String actDocno             = documentNumberTxt.getAttribute("value");
 		String actVouDate           = dateTxt.getAttribute("value");
 		String actDueDate           = voucherHeaderDueDate.getAttribute("value");
 		String actDepartment        = departmentTxt.getAttribute("value");
 		String actCurrency          = voucherHeaderCurrency.getAttribute("value");
 		String actLocalExchangeRate = voucherHeaderLocalExchangeRate.getAttribute("value");
 		String actPlaceOfSupply     = PDRVATPlaceOfSupplyTXt.getAttribute("value");
 				
 		
 		String docno=documentNumberTxt.getAttribute("value");
 		
 		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
 	    Date date=new Date();
 	    String expDate=df.format(date);
 	    
 	    System.out.println("expDate   :"+expDate);
 		
 	     excelReader.setCellData(xlfile, "SmokeJVVATView", 221, 8, actDocno);
 	     excelReader.setCellData(xlfile, "SmokeJVVATView", 222, 7, actVouDate);
 	     excelReader.setCellData(xlfile, "SmokeJVVATView", 223, 7, actDueDate);
 	     excelReader.setCellData(xlfile, "SmokeJVVATView", 222, 8, actVouDate);
 	     excelReader.setCellData(xlfile, "SmokeJVVATView", 223, 8, actDueDate);
 		 excelReader.setCellData(xlfile, "SmokeJVVATView", 224, 8, actDepartment);
 		 excelReader.setCellData(xlfile, "SmokeJVVATView", 225, 8, actCurrency);
 		 excelReader.setCellData(xlfile, "SmokeJVVATView", 226, 8, actLocalExchangeRate);
 		 excelReader.setCellData(xlfile, "SmokeJVVATView", 227, 8, actPlaceOfSupply);
 		
 		
 		String expDocno              = excelReader.getCellData("SmokeJVVATView", 221, 7);
 	    String expDepartment         = excelReader.getCellData("SmokeJVVATView", 224, 7);
 		String expCurrency           = excelReader.getCellData("SmokeJVVATView", 225, 7);
 		String expLocalExchangeRate  = excelReader.getCellData("SmokeJVVATView", 226, 7);
 		String expPlaceOfSupply      = excelReader.getCellData("SmokeJVVATView", 227, 7);
 		
 		String actAccountR1           = select1stRow_1stColumn.getText();
 		String actCreditAccountR1     = select1stRow_2ndColumn.getText();
 		String actTaxcodeR1           = select1stRow_3rdColumn.getText();
 		String actAmountR1            = select1stRow_4thColumn.getText();
 		String actrefR1               = select1stRow_5thColumn.getText();
 		
 		String expAccountR1          = excelReader.getCellData("SmokeJVVATView", 228, 7);
 		String expCreditAccountR1    = excelReader.getCellData("SmokeJVVATView", 229, 7);
 		String expTaxcodeR1          = excelReader.getCellData("SmokeJVVATView", 230, 7);
 		String expAmountR1           = excelReader.getCellData("SmokeJVVATView", 231, 7);
 		
 		 
 		
 		 excelReader.setCellData(xlfile, "SmokeJVVATView", 228, 8, actAccountR1);
 		 excelReader.setCellData(xlfile, "SmokeJVVATView", 229, 8, actCreditAccountR1);
 		 excelReader.setCellData(xlfile, "SmokeJVVATView", 230, 8, actTaxcodeR1);
 		 excelReader.setCellData(xlfile, "SmokeJVVATView", 231, 8, actAmountR1);
 		
 		 
 		 
 		String actFooterAmt   =footerAmount.getText();
 		String expFooterAmt   =excelReader.getCellData("SmokeJVVATView", 232, 7);
 	
 		excelReader.setCellData(xlfile, "SmokeJVVATView", 232, 8, actFooterAmt);

 		
 		
 		System.out.println("Entry Page Document Number    "+actDocno       +"  value Expected  "+expDocno);
 		System.out.println("Entry Page Voucher Date       "+actVouDate     +"  value Expected  "+expDate);
 		System.out.println("Entry Page Currecy            "+actCurrency    +"  value Expected  "+expCurrency);
 		System.out.println("Entry Page Department         "+actDepartment  +"  value Expected  "+expDepartment);
 		System.out.println("Entry Page Local Exchange     "+actLocalExchangeRate  +"  value Expected  "+expLocalExchangeRate);
 		
 		System.out.println("Entry Page Account            "+actAccountR1     +"  value Expected  "+expAccountR1);
 		System.out.println("Entry Page Credit Acc         "+actCreditAccountR1     +"  value Expected  "+expCreditAccountR1);
 		System.out.println("Entry Page Taxcode            "+actTaxcodeR1     +"  value Expected  "+expTaxcodeR1);
 		System.out.println("Entry Page Amount             "+actAmountR1      +"  value Expected  "+expAmountR1);
 		
 		System.out.println("Entry Page Place Of Supply    "+actPlaceOfSupply  +"  value Expected  "+expPlaceOfSupply);
 		System.out.println("Entry Page Footer  Amount     "+actFooterAmt   +"  Value Expected  "+expFooterAmt);

 		
 		Thread.sleep(2000);
 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));	
		saveBtn.click();
		
		Thread.sleep(2000);
		    
 	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();
			
		Thread.sleep(2000);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
			
		Thread.sleep(2000);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		 
		
		
       boolean savingVoucher=checkVoucherSavingMessage(docno);
       
       
       System.out.println("savingVoucher  :  "+savingVoucher +"Value Expected   "+ " TRUE");
	        
       
       
		if( savingVoucher==true && actDisplayResult.equalsIgnoreCase(expDisplayResult))
		{
				System.err.println(" Voucher Saved  Successfully With Copy Document");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 220, 9, resPass);
				return true;
		}
		else
		{
			System.err.println(" Voucher NOt   Saved  Successfully With Copy Document");
			excelReader.setCellData(xlfile, "SmokeJVVATView", 220, 9, resFail);
			return false;
		}
	}
			

		

	


	public boolean checkSuspendedOptionInReceiptsJVVATView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
        dateTxt.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
        voucherHeaderCurrency.click();
		
        Thread.sleep(2000);
        
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
        previousBtn.click();
        
        
        boolean loading=checkLoadingMessage();
        
        
        Thread.sleep(2000);	
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_SuspendBtn));
        new_SuspendBtn.click();
        
        
		
		String expValidationMessage=excelReader.getCellData("SmokeJVVATView", 234, 7);
		
		String actValidationMessage=errorMessage.getText();
					
		excelReader.setCellData(xlfile, "SmokeJVVATView", 234, 8, actValidationMessage);

	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		errorMessageCloseBtn.click();
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(suspendStatusRow1));
		
		String actSuspendStatusR1=suspendStatusRow1.getText();
		
		String expSuspendStatusR1=excelReader.getCellData("SmokeJVVATView", 233, 7);
		
		excelReader.setCellData(xlfile, "SmokeJVVATView", 233, 8, actSuspendStatusR1);

		System.out.println(" Suspended Status : "+actSuspendStatusR1  +" Value Expected  : "+expSuspendStatusR1 );
        
		if ( actSuspendStatusR1.equalsIgnoreCase(expSuspendStatusR1)) 
		{
				System.err.println(" Voucher Suspended   Successfully ");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 233, 9, resPass);
				return true;
		}
		else
		{
			System.err.println(" Voucher NOt   Suspended   Successfully ");
			excelReader.setCellData(xlfile, "SmokeJVVATView", 233, 9, resFail);
			return false;
		}
	}
	


	public boolean checkDeleteOptionInJVVATViewHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
        Thread.sleep(2000);	
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
        grid_ChkBox1.click();
        
        Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteBtn));
        deleteBtn.click();
        
        
        Thread.sleep(2000);
        
		getWaitForAlert();
		
		getAlert().accept();
		
		String expValidationMessage=excelReader.getCellData("SmokeJVVATView", 236, 7);
		
		String actValidationMessage=checkValidationMessage(expValidationMessage);
					
		excelReader.setCellData(xlfile, "SmokeJVVATView", 236, 8, actValidationMessage);

		System.out.println("Delete Voucher Validation Message   : "+actValidationMessage+"  Value Expected : "+expValidationMessage);
	    
		
		if (actValidationMessage.endsWith(expValidationMessage)) 
		
		{
				System.err.println(" Voucher Deleted Successfully ");
				excelReader.setCellData(xlfile, "SmokeJVVATView", 235, 9, resPass);
				return true;
		}
		else
		{
			System.err.println("  Voucher  Not Deleted Successfully");
			excelReader.setCellData(xlfile, "SmokeJVVATView", 235, 9, resFail);
			return false;
		}
	}
	
	
	public boolean checkConsumedAdjustmentBillInBillwiseScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
        Thread.sleep(2000);	
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
        newBtn.click();
        
        Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
        toggleBtn.click();
        
		
        Thread.sleep(2000);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyDocumentOption));
        copyDocumentOption.click();
              
        Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_SecoundChkBox));
		cd_SecoundChkBox.click();
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_OkBtn));
		cd_OkBtn.click();
		
        Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		 
		Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridVendorRow1));
		billRefGridVendorRow1.click();
		
		
		Thread.sleep(2000);
		 
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		
		String actPartyName = billRefPartyName.getText();
		String expPartyName = excelReader.getCellData("SmokeJVVATView", 238, 7);
		excelReader.setCellData(xlfile, "SmokeJVVATView", 238, 8, actPartyName);
		 
		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
       
		int Adjustbills=billRefAdjustBillsGrid.size();
		
		String actAdjustbills=Integer.toString(Adjustbills);
		
		String expAdjustbills=excelReader.getCellData("SmokeJVVATView", 239, 7);
		
		excelReader.setCellData(xlfile, "SmokeJVVATView", 239, 8, actAdjustbills);
		 
		System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
		
		
		int billwiseAdjustBillsDocListcount=billwiseAdjustBillsDocList.size();
        
        HashSet<String> actbillwiseAdjustBillsDocList  = new HashSet<String>();
		
		for (int i = 0; i < billwiseAdjustBillsDocListcount; i++) 
		{
			String data		                              = billwiseAdjustBillsDocList.get(i).getText();
			actbillwiseAdjustBillsDocList.add(data);
		}
		
		String actDocumentNumberText=actbillwiseAdjustBillsDocList.toString();
		
		String expDocumentNumberText=excelReader.getCellData("SmokeJVVATView", 240, 7);
		excelReader.setCellData(xlfile, "SmokeJVVATView", 240, 8, actDocumentNumberText);
		
		
        System.out.println("actDocumentNumberText   : "+actDocumentNumberText);
        System.out.println("expDocumentNumberText   : "+expDocumentNumberText);
		
        Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridVendorRow2));
		billRefGridVendorRow2.click();
		
		
		Thread.sleep(2000);
		 
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		
		String actPartyName1 = billRefPartyName.getText();
		String expPartyName1 = excelReader.getCellData("SmokeJVVATView", 241, 7);
		excelReader.setCellData(xlfile, "SmokeJVVATView", 241, 8, actPartyName1);
		 
		
		 
		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName1 + "  Value Expected  " + expPartyName1);
       
		int Adjustbills1=billRefAdjustBillsGrid.size();
		
		String actAdjustbills1=Integer.toString(Adjustbills);
		
		String expAdjustbills1=excelReader.getCellData("SmokeJVVATView", 242, 7);
		
		excelReader.setCellData(xlfile, "SmokeJVVATView", 242, 8, actAdjustbills1);
		 
		System.err.println("actAdjustbills : "+actAdjustbills1 +" Value Expected  : "+expAdjustbills1);
		
		
		int billwiseAdjustBillsDocListcount1=billwiseAdjustBillsDocList.size();
        
        HashSet<String> actbillwiseAdjustBillsDocList1  = new HashSet<String>();
		
		for (int i = 0; i < billwiseAdjustBillsDocListcount1; i++) 
		{
			String data		                              = billwiseAdjustBillsDocList.get(i).getText();
			actbillwiseAdjustBillsDocList1.add(data);
		}
		
		String actDocumentNumberText1=actbillwiseAdjustBillsDocList1.toString();
		
		String expDocumentNumberText1=excelReader.getCellData("SmokeJVVATView", 243, 7);
		excelReader.setCellData(xlfile, "SmokeJVVATView", 243, 8, actDocumentNumberText1);
		
		
        System.out.println("actDocumentNumberText1   : "+actDocumentNumberText1);
        System.out.println("expDocumentNumberText1   : "+expDocumentNumberText1);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefcancel));
		billRefcancel.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
        
		
		getWaitForAlert();
		
		
		getAlert().accept();
		
        
        
     if (actDocumentNumberText1.equalsIgnoreCase(expDocumentNumberText1) && actAdjustbills1.equalsIgnoreCase(expAdjustbills1) && 
        		actPartyName1.equalsIgnoreCase(expPartyName1) && 
        		
        		actDocumentNumberText.equalsIgnoreCase(expDocumentNumberText) && actAdjustbills.equalsIgnoreCase(expAdjustbills) && 
        		actPartyName.equalsIgnoreCase(expPartyName)) 
      {
			System.err.println("Displayed Expected Adjust Bills in Bill Wise Screen  ");
			excelReader.setCellData(xlfile, "SmokeJVVATView", 237, 9, resPass);
			return true;
	  }
	 else
	 {
		System.err.println(" Not  Displayed Expected Adjust Bills in Bill Wise Screen ");
		excelReader.setCellData(xlfile, "SmokeJVVATView", 237, 9, resFail);
		return false;
	  }
        
	}

	
	
	
	
	
	
	
	
	

	  public JVVATPage(WebDriver driver)
	  {
	    PageFactory.initElements(driver, this);	
	  }
	

	
	
}
