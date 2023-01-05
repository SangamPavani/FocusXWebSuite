package com.focus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.testautomationguru.utility.PDFUtil;

public class VoucherPrintPage extends BaseEngine {


	@FindBy(xpath="//*[@id='btnTransHomePrint']")
	private static WebElement  Print;
	
	
				@FindBy(xpath="//*[@id='opt_LayoutID']")
				private static WebElement  LayoutNameTxt;
				
				@FindBy(xpath="//*[@id='opt_LayoutID_input_image']/span")
				private static WebElement  LayoutName_ExpansionBtn;
				
				@FindBy(xpath="//*[@id='opt_LayoutID_input_settings']/span")
				private static WebElement  LayoutName_SettingsBtn;
				
							@FindBy(xpath="//*[@id='opt_LayoutID_customize_popup_container']")
							private static WebElement  LayoutName_Settings_Container;
							
							@FindBy(xpath="//*[@id='opt_LayoutID_customize_popup_footer']/div/div/input[1]")
							private static WebElement  LayoutName_Settings_StandardFieldsBtn;
							
										@FindBy(xpath="//*[@id='opt_LayoutID_customize_popup_standardfields_list']")
										private static WebElement  LayoutName_Settings_StandardFields_Filed_dropdown;
										
										@FindBy(xpath="//*[@id='opt_LayoutID_customize_popup_standardfields_header']")
										private static WebElement  LayoutName_Settings_StandardFields_HeaderTxt;
										
										@FindBy(xpath="//*[@id='opt_LayoutID_customize_popup_standardfields_alignment']")
										private static WebElement  LayoutName_Settings_StandardFields_Allignment_dropdown;
										
										@FindBy(xpath="//*[@id='opt_LayoutID_customize_popup_standardfields_width']")
										private static WebElement  LayoutName_Settings_StandardFields_WidthTxt;
										
										@FindBy(xpath="//div[@id='id_popup_container']//input[3]")
										private static WebElement  LayoutName_Settings_StandardFields_OkBtn;
										
										@FindBy(xpath="//div[@id='id_popup_container']//input[4]")
										private static WebElement  LayoutName_Settings_StandardFields_CancelBtn;
										
							@FindBy(xpath="//*[@id='opt_LayoutID_customize_popup_footer']/div/div/input[2]")
							private static WebElement  LayoutName_Settings_DeletecolumnBtn;
							
							@FindBy(xpath="//div[@id='id_popup_container']//input[3]")
							private static WebElement  LayoutName_Settings_OkBtn;
							
							@FindBy(xpath="//div[@id='id_popup_container']//input[4]")
							private static WebElement  LayoutName_Settings_CancelBtn;
							
						
	
				@FindBy(xpath="//*[@id='dvCreateViewMain']/div[1]/div[2]/span[1]")
				private static WebElement  LayoutName_CreatelayoutBtn;
				
							@FindBy(xpath="//i[@class='icon-font6 icon-new']")
							private static WebElement  Newdropdown;
							
										@FindBy(xpath="//*[@id='forHf']/span[1]/ul/li/a[1]")
										private static WebElement  New_LayoutBtn;
										
										@FindBy(xpath="//*[@id='forHf']/span[1]/ul/li/a[2]")
										private static WebElement  New_PageBtn;
										
							@FindBy(xpath="//i[@class='icon-font6 icon-open']")
							private static WebElement  Opendropdown;
							
										@FindBy(xpath="//*[@id='forHf']/span[2]/ul/li/a[1]")
										private static WebElement  OpenBtn;
										
													@FindBy(xpath="//*[@id='3']")
													private static WebElement  OpenBtn_First;
													
													@FindBy(xpath="//*[@id='7']")
													private static WebElement  OpenBtn_Second;
													
													@FindBy(xpath="//button[@id='btn_PopUpOk']")
													private static WebElement  OpenBtn_OkBtn;
													
													@FindBy(xpath="//*[@id='id_PopUp']/div/div/div[3]/button[2]")
													private static WebElement  OpenBtn_CancelBtn;
										
										@FindBy(xpath="//*[@id='forHf']/span[2]/ul/li/a[2]")
										private static WebElement FromXMLBtn;
							
							@FindBy(xpath="//i[@class='icon-font6 icon-save']")
							private static WebElement  Savedropdown;
							
										@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[1]")
										private static WebElement  SaveBtn;
										
													@FindBy(xpath="//input[@id='id_PopuplayoutName']")
													private static WebElement  SaveTxtField;
													
													@FindBy(xpath="//*[@id='btn_PopUpOk']")
													private static WebElement  Save_OkBtn;
													
													@FindBy(xpath="//*[@id='id_PopUp']/div/div/div[3]/button[2]")
													private static WebElement  Save_CancekBtn;
										
										@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[2]")
										private static WebElement  SaveAsBtn; //Clicking popup is same as savebtn popup
										
										@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[3]")
										private static WebElement  SaveAsImageBtn; //No Response
										
										@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[4]")
										private static WebElement  SaveAsXMLBtn; // Downloads xml file
										
										@FindBy(xpath="//*[@id='forHf']/span[23]/ul/li/a[5]")
										private static WebElement  SaveAsHTMLBtn; // Showing Error
										
							@FindBy(xpath="//*[@id='forHf']/span[4]")
							private static WebElement  Removedropdown;
										
										@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[1]")
										private static WebElement  RemoveBtn; //Raises popup
													
										@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[2]")
										private static WebElement  RemoveCurrentPageBtn; //Raises popup
													
										@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[3]")
										private static WebElement  RemoveControlBtn;				
										
							@FindBy(xpath="//*[@id='forHf']/span[5]")
							private static WebElement  PageNo;
							
							@FindBy(xpath="//*[@id='forHf']/span[6]")
							private static WebElement  Controldrpdown;
										
										@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[1]")
										private static WebElement  StaticTextBtn;
													
										@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[2]")
										private static WebElement  BitmapBtn;
													
										@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[3]")
										private static WebElement  BodyGridBtn;	
										
										@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[4]")
										private static WebElement  RectangleBtn;	
										
										@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[5]")
										private static WebElement  EcllipseBtn;	
										
										@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[6]")
										private static WebElement  LineBtn;	
										
										@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[7]")
										private static WebElement  AreaBtn;
										
										@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[8]")
										private static WebElement  TableBtn;	
										
							@FindBy(xpath="//*[@id='forHf']/span[7]")
							private static WebElement  Alignmentdropdown;
													
										@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[1]")
										private static WebElement  LeftAlignmentBtn;
																
										@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[2]")
										private static WebElement  RightAlignmentBtn;
										
										@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[3]")
										private static WebElement  TopAlignmentBtn;	
										
										@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[4]")
										private static WebElement  BottomAlignmentBtn;
										
							@FindBy(xpath="//*[@id='forHf']/span[8]")
							private static WebElement  Sizedropdown;
										
										@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[1]")
										private static WebElement  SameSizeBtn;
																
										@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[2]")
										private static WebElement  SameWidthBtn;
										
										@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[3]")
										private static WebElement  SameHeightBtn;
										
							@FindBy(xpath="//*[@id='forHf']/span[9]")
							private static WebElement  Printdropdown;
													
										@FindBy(xpath="//*[@id='forHf']/span[9]/ul/li/a[1]")
										private static WebElement  Print_PrintBtn;
																			
										@FindBy(xpath="//*[@id='forHf']/span[9]/ul/li/a[2]")
										private static WebElement  Print_PreviewBtn;
										
													@FindBy(xpath="//*[@id='fit-button']")
													private static WebElement  Preview_FitToWidthBtn;
													
													@FindBy(xpath="//*[@id='zoom-in-button']")
													private static WebElement  Preview_ZoomInBtn;
													
													@FindBy(xpath="//*[@id='zoom-out-button']")
													private static WebElement  Preview_ZoomOutBtn;
													
										@FindBy(xpath="//*[@id='forHf']/span[9]/ul/li/a[3]")
										private static WebElement  PageSetUpBtn;
										
													@FindBy(xpath="//*[@id='id_PageSetUpPreview']")
													private static WebElement  PageSetupPagePreviewField;
													
													@FindBy(xpath="//*[@id='id_PageType']")
													private static WebElement  PageSetupPaperSizedropdown;
													
													@FindBy(xpath="//*[@id='id_PaperOrientation'][@value='0']")
													private static WebElement  PageSetupPotraitRadio;
													
													@FindBy(xpath="//*[@id='id_PaperOrientation'][@value='1']")
													private static WebElement  PageSetupLandScapeRadio;
													
													@FindBy(xpath="//*[@id='id_PaperUnit'][@value='0']")
													private static WebElement  PageSetupCentimetersRadio;
													
													@FindBy(xpath="//*[@id='id_PaperUnit'][@value='1']")
													private static WebElement  PageSetupInchesRadio;
													
													@FindBy(xpath="//*[@id='id_PageSizeLeftMarginDisplay']")
													private static WebElement  PageSetupLeftTxt;
													
													@FindBy(xpath="//*[@id='id_PageSizeRightMarginDisplay']")
													private static WebElement  PageSetupRightTxt;
													
													@FindBy(xpath="//*[@id='id_PageSizeTopMarginDisplay']")
													private static WebElement  PageSetupTopTxt;
													
													@FindBy(xpath="//*[@id='id_PageSizeTopMarginDisplay']")
													private static WebElement  PageSetupBottomTxt;
													
													@FindBy(xpath="//*[@id='id_PageSetupOkBtn']")
													private static WebElement  PageSetupOkBtn;
													
													@FindBy(xpath="//*[@id='id_PageSetupCancelBtn']")
													private static WebElement  PageSetUpCancelBtn;

							@FindBy(xpath="//*[@id='id_InvoiceDesingCancel']")
							private static WebElement  ExitBtn;	
		
		@FindBy(xpath="//li[@id='li_InvoicePageSetup']")
		private static WebElement  pagesetupTab;	
		
		@FindBy(xpath="//li[@id='li_InvoiceDesigner']")
		private static WebElement  designerTab;	
		
		@FindBy(xpath="//li[@id='li_InvoicePreview']")
		private static WebElement  previewTab;	
							
				
							// Fields  
							
							@FindBy(xpath="//*[@id='LiDesignField']")
							private static WebElement  FieldsTab;
						
				// Receipts /  payments / Petty cash Fields
				// named as RPP
							
							// RPP Header

							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
							private static WebElement  RPP_HeaderExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
										private static WebElement  RPP_Header_DocNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
										private static WebElement  RPP_Header_DateExpandBtn;
										
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
													private static WebElement  RPP_Datedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
													private static WebElement  RPP_Date_Yeardraganddrop;
													
													@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
													private static WebElement  RPP_Date_Monthdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
													private static WebElement  RPP_Date_DayOfYeardraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
													private static WebElement  RPP_Date_Daydraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
													private static WebElement  RPP_Date_Weekdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
													private static WebElement  RPP_Date_WeekDaydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
										private static WebElement  RPP_Header_TimeExpandBtn;
										
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
													private static WebElement  RPP_Time_Timedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
													private static WebElement  RPP_Time_Hourdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
													private static WebElement  RPP_Time_Minutedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
													private static WebElement RPP_Time_Seconddraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
										private static WebElement RPP_Header_CashBankACExpandBtn;
										
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
													private static WebElement  RPP_CashBankAC_Namedraganddrop;
																
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
													private static WebElement  RPP_CashBankAC_Codedraganddrop;
																
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
													private static WebElement  RPP_CashBankAC_Aliasdraganddrop;
																
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
													private static WebElement  RPP_CashBankAC_Accounttypedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
													private static WebElement  RPP_CashBankAC_Addressdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
													private static WebElement  RPP_CashBankAC_AllowCustomerPortaldraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
													private static WebElement  RPP_CashBankAC_BanckACdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
													private static WebElement  RPP_CashBankAC_BankACcodedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
													private static WebElement  RPP_CashBankAC_BankAccountNamedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
													private static WebElement  RPP_CashBankAC_BankAccountNumberdraganddrop;
												
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
													private static WebElement  RPP_CashBankAC_ChequeDiscountLimitdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
													private static WebElement  RPP_CashBankAC_City1draganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
													private static WebElement  RPP_CashBankAC_CityCode1draganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
													private static WebElement  RPP_CashBankAC_City2draganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
													private static WebElement  RPP_CashBankAC_CityCode2draganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
													private static WebElement  RPP_CashBankAC_ConsolidationMethoddraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
													private static WebElement  RPP_CashBankAC_CreditDaysdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
													private static WebElement  RPP_CashBankAC_CreditLimitdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
													private static WebElement  RPP_CashBankAC_DebitCreditProposaldraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
													private static WebElement  RPP_CashBankAC_DebitCreditRequireddraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
													private static WebElement  RPP_CashBankAC_DefaultCurrencydraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
													private static WebElement  RPP_CashBankAC_DeliveryAddressdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
													private static WebElement  RPP_CashBankAC_Emaildraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
													private static WebElement  RPP_CashBankAC_ExchangeAdjustGainACdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
													private static WebElement  RPP_CashBankAC_ExchangeAdjustGainACcodedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
													private static WebElement  RPP_CashBankAC_ExchangeAdjustLossACdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
													private static WebElement  RPP_CashBankAC_ExchangeAdjustLossACcodedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
													private static WebElement  RPP_CashBankAC_FaxNodraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
													private static WebElement  RPP_CashBankAC_FinanceChargeTermsdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
													private static WebElement  RPP_CashBankAC_FinanaceEmaildraganddrop;
											
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
													private static WebElement  RPP_CashBankAC_IFSCcodedraganddrop;
												
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
													private static WebElement  RPP_CashBankAC_Passworddraganddrop;
											
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
													private static WebElement  RPP_CashBankAC_PaymentTermsdraganddrop;
												
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
													private static WebElement  RPP_CashBankAC_PaymentTypedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
													private static WebElement  RPP_CashBankAC_PDCdiscountedACdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
													private static WebElement  RPP_CashBankAC_PDCdiscountedACcodedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
													private static WebElement  RPP_CashBankAC_Pin1draganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
													private static WebElement  RPP_CashBankAC_Pin2draganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
													private static WebElement  RPP_CashBankAC_PortalEmaildraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
													private static WebElement  RPP_CashBankAC_PrimaryAccountdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
													private static WebElement  RPP_CashBankAC_PrimanryAccountCodedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
													private static WebElement  RPP_CashBankAC_RateOFInterestdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
													private static WebElement  RPP_CashBankAC_ReminderTermsdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
													private static WebElement  RPP_CashBankAC_SendEmaialToCustomerdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
													private static WebElement  RPP_CashBankAC_TelNodraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
													private static WebElement  RPP_CashBankAC_GropupLevel1draganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
													private static WebElement  RPP_CashBankAC_GroupLevel1Codedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
													private static WebElement  RPP_CashBankAC_GroupLevel2draganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
													private static WebElement  RPP_CashBankAC_GroupLevel2Codedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
													private static WebElement  RPP_CashBankAC_GroupLevel3draganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
													private static WebElement  RPP_CashBankAC_GroupLevel3Codedraganddrop;
													
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
										private static WebElement  RPP_Header_DepartmentExpandBtn;
										
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[1]/a")
													private static WebElement  RPP_Department_Namedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[2]/a")
													private static WebElement  RPP_Department_Codedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[3]/a")
													private static WebElement  RPP_Department_Aliasdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[4]/a")
													private static WebElement  RPP_Department_Currencydraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[5]/a")
													private static WebElement  RPP_Department_GroupLevel1draganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[6]/a")
													private static WebElement  RPP_Department_GroupLevel1Codedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
										private static WebElement  RPP_Narrationdraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
										private static WebElement  RPP_ChequeNodraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
										private static WebElement  RPP_CreatedBydraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
										private static WebElement  RPP_Header_CreatedDateExpandBtn;	
										
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[1]/a")
													private static WebElement  RPP_CreatedDate_CreatedDatedraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[2]/a")
													private static WebElement  RPP_CreatedDate_Yeardraganddrop;
												
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[3]/a")
													private static WebElement  RPP_CreatedDate_Monthdraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[4]/a")
													private static WebElement  RPP_CreatedDate_DayofYeardraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[5]/a")
													private static WebElement  RPP_CreatedDate_Daydraganddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[6]/a")
													private static WebElement  RPP_CreatedDate_Weekdraganddrop;
												
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[7]/a")
													private static WebElement  RPP_CreatedDate_WeekDaydraganddrop;
										
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
									private static WebElement  RPP_Header_CreatedTimeExpandBtn;
									
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[1]/a")
													private static WebElement  RPP_CreatedTime_CreatedTimedrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[2]/a")
													private static WebElement  RPP_CreatedTime_Hourdrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[3]/a")
													private static WebElement  RPP_CreatedTime_Minutedrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[4]/a")
													private static WebElement  RPP_CreatedTime_Seconddrapanddrop;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
									private static WebElement  RPP_Header_ModifiedBydrapanddrop;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
									private static WebElement  RPP_Header_ModifiedDateExpandBtn;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[1]/a")
													private static WebElement  RPP_ModifiedDate_ModifiedDatedrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[2]/a")
													private static WebElement  RPP_ModifiedDate_Yeardrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[3]/a")
													private static WebElement  RPP_ModifiedDate_monthdrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[4]/a")
													private static WebElement  RPP_ModifiedDate_DayofYeardrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[5]/a")
													private static WebElement  RPP_ModifiedDate_Daydrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[6]/a")
													private static WebElement  RPP_ModifiedDate_Weekdrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[7]/a")
													private static WebElement  RPP_ModifiedDate_WeekDaydrapanddrop;
																
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
							    	private static WebElement  RPP_Header_ModifiedTimeExpandBtn;
																	
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[1]/a")
													private static WebElement  RPP_ModifiedTime_ModifiedTimedrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[2]/a")
													private static WebElement  RPP_ModifiedTime_Hourdrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[3]/a")
													private static WebElement  RPP_ModifiedTime_Minutedrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[4]/a")
													private static WebElement  RPP_ModifiedTime_Seconddrapanddrop;
											
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
									private static WebElement  RPP_Header_PrintCountdrapanddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
									private static WebElement  RPP_Header_RevisionNumberdrapanddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
									private static WebElement  RPP_Header_AuthorizeStatusdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/a")
							    	private static WebElement  RPP_Header_AuthorizeDateExpandBn;
																	
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[1]/a")
													private static WebElement  RPP_AuthorizeDate_AuthorizeDatedrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[2]/a")
													private static WebElement  RPP_AuthorizeDate_Yeardrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[3]/a")
													private static WebElement  RPP_AuthorizeDate_Monthdrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[4]/a")
													private static WebElement  RPP_AuthorizeDate_DayofYeardrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[5]/a")
													private static WebElement  RPP_AuthorizedDate_Daydrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[6]/a")
													private static WebElement  RPP_AuthorizeDate_Weekdrapanddrop;
													
													@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[7]/a")
													private static WebElement  RPP_AuthorizeDate_WeekDaydrapanddrop;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[18]/a")
									private static WebElement  RPP_Header_EMailCountdrapanddrop;
											
							////// CashAndBank ****Body****		
								
						
						@FindBy(xpath="//span[contains(text(),'Body')]//i[@class='icon-expand icon-font8']")
						private static WebElement  CashAndbank_BodyExpandbtn;

									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a")
									private static WebElement  CashAndbank_Body_AccountExpandBtn;
									
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[1]/a")
												private static WebElement  CashAndbank_Account_Namedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[2]/a")
												private static WebElement  CashAndbank_Account_Codedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[3]/a")
												private static WebElement  CashAndbank_Account_Aliasdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[4]/a")
												private static WebElement  CashAndbank_Account_AccountTypedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[5]/a")
												private static WebElement  CashAndbank_Account_Addressdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[6]/a")
												private static WebElement  CashAndbank_Account_AllowCustomerProposaldraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[7]/a")
												private static WebElement  CashAndbank_Account_BankACdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[8]/a")
												private static WebElement  CashAndbank_Account_BankACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[9]/a")
												private static WebElement  CashAndbank_Account_BankAccountNamedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[10]/a")
												private static WebElement  CashAndbank_Account_BankAccountNumberdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[11]/a")
												private static WebElement  CashAndbank_Account_ChequeDiscountLimitdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[12]/a")
												private static WebElement  CashAndbank_Account_City1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[13]/a")
												private static WebElement  CashAndbank_Account_CityCode1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[14]/a")
												private static WebElement  CashAndbank_Account_City2draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[15]/a")
												private static WebElement  CashAndbank_Account_CityCode2draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[16]/a")
												private static WebElement  CashAndbank_Account_ConsolidationMethoddraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[17]/a")
												private static WebElement  CashAndbank_Account_CreditDaysdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[18]/a")
												private static WebElement  CashAndbank_Account_CreditLimitdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[19]/a")
												private static WebElement  CashAndbank_Account_DebitCreditProposaldraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[20]/a")
												private static WebElement  CashAndbank_Account_DebitCreditRequireddraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[21]/a")
												private static WebElement  CashAndbank_Account_DefaultCurrencydraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[22]/a")
												private static WebElement  CashAndbank_Account_Deliveryaddressdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[23]/a")
												private static WebElement  CashAndbank_Account_EMaildraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[24]/a")
												private static WebElement  CashAndbank_Account_ExchangeAdjustmentGainACdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[25]/a")
												private static WebElement  CashAndbank_Account_ExchangeAdjustmentGainACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[26]/a")
												private static WebElement  CashAndbank_Account_ExchangeAdjustmentLossACdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[27]/a")
												private static WebElement  CashAndbank_Account_ExchangeAdjustmentLossACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[28]/a")
												private static WebElement  CashAndbank_Account_FaxNodraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[29]/a")
												private static WebElement  CashAndbank_Account_FinanceChargeTermsdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[30]/a")
												private static WebElement  CashAndbank_Account_FinanceEmaildraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[31]/a")
												private static WebElement  CashAndbank_Account_IFSCcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[32]/a")
												private static WebElement  CashAndbank_Account_Passworddraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[33]/a")
												private static WebElement  CashAndbank_Account_PaymentTermsdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[34]/a")
												private static WebElement  CashAndbank_Account_PaymentTypedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[35]/a")
												private static WebElement  CashAndbank_Account_PDCdiscountedACdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[36]/a")
												private static WebElement  CashAndbank_Account_PDCdiscountedACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[37]/a")
												private static WebElement  CashAndbank_Account_Pin1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[38]/a")
												private static WebElement  CashAndbank_Account_Pin2draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[39]/a")
												private static WebElement  CashAndbank_Account_PortalEmaildraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[40]/a")
												private static WebElement  CashAndbank_Account_PrimaryAccountdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[41]/a")
												private static WebElement  CashAndbank_Account_PrimaryAccountCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[42]/a")
												private static WebElement  CashAndbank_Account_RateOfInterestdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[43]/a")
												private static WebElement  CashAndbank_Account_ReminderTermsdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[44]/a")
												private static WebElement  CashAndbank_Account_SendEmailToCustomerdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[45]/a")
												private static WebElement  CashAndbank_Account_TelNodraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[46]/a")
												private static WebElement  CashAndbank_Account_GroupLevel1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[47]/a")
												private static WebElement  CashAndbank_Account_GroupLevel1Codedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[48]/a")
												private static WebElement  CashAndbank_Account_GroupLevel2draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[49]/a")
												private static WebElement  CashAndbank_Account_GroupLevel2Codedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[50]/a")
												private static WebElement  CashAndbank_Account_GroupLevel3draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[51]/a")
												private static WebElement  CashAndbank_Account_GroupLevel3Codedraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
									private static WebElement  CashAndbank_Body_Amountdraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
									private static WebElement  CashAndbank_Body_Referencedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a")
									private static WebElement  CashAndbank_Body_Remarksdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a")
									private static WebElement  CashAndbank_Body_Netdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[6]/a")
									private static WebElement  CashAndbank_Body_NetBaseCurrencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[7]/a")
									private static WebElement  CashAndbank_Body_NetLocalCurrencydraganddrop;

						
						// ****User Details ***
									
									
						@FindBy(xpath="//span[contains(text(),'User details')]//i[@class='icon-expand icon-font8']")
						private static WebElement  UserDetailsExpandbtn;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/a")
									private static WebElement  UserDetails_UserNamedraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[2]/a")
									private static WebElement  UserDetails_MobileNumberdraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[3]/a")
									private static WebElement  UserDetails_PhoneNumberdraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[4]/a")
									private static WebElement  UserDetails_EmailIddraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[5]/a")
									private static WebElement  UserDetails_Signaturedraganddrop;	
									
									@FindBy(xpath="//span[contains(text(),'Employee')]//i[@class='icon-expand icon-font8']")
									private static WebElement  UserDetails_EmployeeExpandBtn;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[7]/a")
									private static WebElement  UserDetails_AuthoriseUserNamedraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[8]/a")
									private static WebElement  UserDetails_AuthoriseUserMobileNumberdraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[9]/a")
									private static WebElement  UserDetails_AuthoriseUserPhoneNumberdraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[10]/a")
									private static WebElement  UserDetails_AuthoriseUserEmailIddraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[11]/a")
									private static WebElement  UserDetails_AuthoriseUserSignaturedraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[12]/a")
									private static WebElement  UserDetails_AuthoriseBydraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[13]/a")
									private static WebElement  UserDetails_NextUserNamedraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[14]/a")
									private static WebElement  UserDetails_NextUserMobileNumberdraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[15]/a")
									private static WebElement  UserDetails_NextUserPhoneNumberdraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[16]/a")
									private static WebElement  UserDetails_NextUserEmailIddraganddrop;	
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[17]/a")
									private static WebElement  UserDetails_NextUserSignaturedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[18]/a")
									private static WebElement  UserDetails_CreatedBySignaturedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[19]/a")
									private static WebElement  UserDetails_ModifiedBySignaturedraganddrop;
								
																			
						
						// **** Miscellaneous ***			
											
						@FindBy(xpath="//span[contains(text(),'Miscellaneous')]//i[@class='icon-expand icon-font8']")
						private static WebElement MiscellaneousExpandBtn;

									@FindBy(xpath="//span[contains(text(),'Login name')]")
									private static WebElement  Miscellaneous_LoginNamedraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Page number')]")
									private static WebElement  Miscellaneous_PageNumberdraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Print date')]")
									private static WebElement  Miscellaneous_PrintDatedraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Print time')]")
									private static WebElement  Miscellaneous_PrintTimedraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Total page')]")
									private static WebElement  Miscellaneous_TotalPagedraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Sr no')]")
									private static WebElement  Miscellaneous_SrNodraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Page type')]")
									private static WebElement  Miscellaneous_PageTypedraganddrop;
												
									@FindBy(xpath="//span[contains(text(),'Ageing month-wise')]")
									private static WebElement  Miscellaneous_AgeingMonthWisedraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Ageing balance')]")
									private static WebElement  Miscellaneous_AgeingBalancedraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Ageing slab1')]")
									private static WebElement  Miscellaneous_AgeingSlab1draganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Ageing slab2')]")
									private static WebElement  Miscellaneous_AgeingSlab2draganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Ageing slab3')]")
									private static WebElement  Miscellaneous_AgeingSlab3draganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Ageing slab4')]")
									private static WebElement  Miscellaneous_AgeingSlab4draganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Ageing slab5')]")
									private static WebElement  Miscellaneous_AgeingSlab5draganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Ageing slab6')]")
									private static WebElement  Miscellaneous_AgeingSlab6draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[16]/a")
									private static WebElement  Miscellaneous_AgeingSlab7draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[17]/a")
									private static WebElement  Miscellaneous_LastSlabdraganddrop;
									
				// ****Company ***			
									
						@FindBy(xpath="//span[contains(text(),'Company')]//i[@class='icon-expand icon-font8']")
						private static WebElement CompanyExpandBtn;
									
									@FindBy(xpath="//span[contains(text(),'Company Logo')]")
									private static WebElement  Company_CompanyLogodraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Company Name')]")
									private static WebElement  Company_CompanyNamedraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'Accounting Date')]//i[@class='icon-expand icon-font8']")
									private static WebElement  Comapny_AccountingDateExpandbtn;
									
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[3]/ul/li[1]/a")
												private static WebElement  AccountingDate_AccountingDatedraganddrop;
									
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[3]/ul/li[2]/a")
												private static WebElement  AccountingDate_Yeardraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[3]/ul/li[3]/a")
												private static WebElement  AccountingDate_Monthdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[3]/ul/li[4]/a")
												private static WebElement  AccountingDate_DayOfYeardraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[3]/ul/li[5]/a")
												private static WebElement  AccountingDate_Daydraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[3]/ul/li[6]/a")
												private static WebElement  AccountingDate_Weekdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[3]/ul/li[7]/a")
												private static WebElement  AccountingDate_WeekDaydraganddrop;
												
									@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Country')]")
									private static WebElement  Company_Countrydraganddrop;
									
									@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Currency')]")
									private static WebElement  Company_Currencydraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'DefaultLang')]")
									private static WebElement  Company_DefaultLangdraganddrop;
									
									@FindBy(xpath="//span[contains(text(),'SupportedLang')]")
									private static WebElement  Company_SupportedLangdraganddrop;
			
			
			
					@FindBy(xpath="//*[@id='LiProp']")
					private static WebElement   PropertiesTab;				
		// *** Print_***LayoutName_**Createlayout_*****Properties
			// Properties are Dynamic So Can be Modified while Executing					
								
												
							
										
					//****Print_LayoutName***_Createlayout****_MaxMinbutton
										
							@FindBy(xpath="//*[@id='LiFieldDivList'")
							private static WebElement RightPanelMaxMinIcon;
						
						/////////////////////////						
				
				@FindBy(xpath="//*[@id='dvCreateViewMain']/div[1]/div[2]/span[2]")
				private static WebElement  LayoutName_Editlayout;
				
				// Edit layout in-detailed ..... 
				// Same as Create Layout
				
				
		/////////// Document set 		
				
				@FindBy(xpath="//*[@id='opt_DocSetID']")
				private static WebElement  DocumentSet;
				
				@FindBy(xpath="//*[@id='opt_DocSetID_input_image']/span")
				private static WebElement DocumentSet_ExpandBtn;
				
				@FindBy(xpath="//*[@id='opt_DocSetID_input_settings']/span")
				private static WebElement DocumentSet_SettingsBtn;
				
							@FindBy(xpath="//*[@id='opt_DocSetID_customize_popup_container']")
							private static WebElement  DocumentSet_Settings_Container;
							
							@FindBy(xpath="//*[@id='opt_DocSetID_customize_popup_footer']/div/div/input[1]")
							private static WebElement  DocumentSet_Settings_StandardFieldsBtn;
				
										@FindBy(xpath="//*[@id='opt_DocSetID_customize_popup_standardfields_list']")
										private static WebElement  DocumentSet_Settings_StandardFields_Filedsdropdown;
										
										@FindBy(xpath="//*[@id='opt_DocSetID_customize_popup_standardfields_header']")
										private static WebElement  DocumentSet_Settings_StandardFields_HeaderTxt;
										
										@FindBy(xpath="//*[@id='opt_DocSetID_customize_popup_standardfields_alignment']")
										private static WebElement  DocumentSet_Settings_StandardFields_Allignmentdropdown;
										
										@FindBy(xpath="//*[@id='opt_DocSetID_customize_popup_standardfields_width']")
										private static WebElement  DocumentSet_Settings_StandardFields_WidthTcxt;
										
										@FindBy(xpath="//div[@id='id_popup_container']//input[3]")
										private static WebElement  DocumentSet_Settings_StandardFields_OkBtn;
										
										@FindBy(xpath="//div[@id='id_popup_container']//input[4]")
										private static WebElement  DocumentSet_Settings_StandardFields_CancelBtn;
										
							@FindBy(xpath="//*[@id='opt_DocSetID_customize_popup_footer']/div/div/input[2]")
							private static WebElement  DocumentSet_Settings_DeletecolumnBtn;
							
							@FindBy(xpath="//div[@id='id_popup_container']//input[3]")
							private static WebElement  DocumentSet_Settings_OkBtn;
							
							@FindBy(xpath="//div[@id='id_popup_container']//input[4]")
							private static WebElement  DocumentSett_Settings_CancelBtn;
	
				
				
				@FindBy(xpath="//*[@id='dvCreateViewMain']/div[2]/div[2]/span[1]")
				private static WebElement  DocumentSet_CreatelayoutBtn;
				
							@FindBy(xpath="//*[@id='myNavbar']/ul/li/span[1]")
							private static WebElement  DocumentSet_Createlayout_SaveBtn;
							
							@FindBy(xpath="//*[@id='deleteBtn']")
							private static WebElement  DocumentSet_Createlayout_DeleteBtn;
							
							@FindBy(xpath="//*[@id='myNavbar']/ul/li/span[3]")
							private static WebElement  DocumentSet_Createlayout_ResetBtn;
							
							@FindBy(xpath="//*[@id='myNavbar']/ul/li/span[4]")
							private static WebElement  DocumentSet_Createlayout_CancelBtn;
							
							@FindBy(xpath="//*[@id='txtDocSetName']")
							private static WebElement  DocumentSetTxt;
							
							@FindBy(xpath="//*[@id='BrowseId']")
							private static WebElement  DocumentSetBrowseBtn;
							
										@FindBy(xpath="//*[@id='btnPrint']")
										private static WebElement  Browse_OkBtn;
										
										@FindBy(xpath="//*[@id='footer']/button[2]")
										private static WebElement  Browse_CancelBtn;
							
							@FindBy(xpath="//*[@id='chkId']")
							private static WebElement  EjectPaperAfterEachFormatPrintChkBox;
				
							
							//// Grid Items
							
				// First Row
							
							
							@FindBy(xpath="//*[@id='Test_col_1-2']")
							private static WebElement  Grid_Filter1row;
							
							@FindBy(xpath="//*[@id='btnFilterId']")
							private static WebElement  Filter1row_FilterEdit;
							
							@FindBy(xpath="//*[@id='idFilterCustomizeIcon']")
							private static WebElement  Filter1row_FilterEdit_CustomizeIcon;
							
										@FindBy(xpath="//*[@id='1']")
										private static WebElement  Customize_DocNo;
										
										@FindBy(xpath="//*[@id='2']")
										private static WebElement  Customize_Date;
										
										@FindBy(xpath="//*[@id='80']")
										private static WebElement   Customize_Time;
										
										@FindBy(xpath="//*[@id='161']")
										private static WebElement  Customize_AuthorizeRemarks;
										
										@FindBy(xpath="//*[@id='164']")
										private static WebElement  Customize_AuthorizeDate;
										
										@FindBy(xpath="//*[@id='67408869']")
										private static WebElement  Customize_SChequeNo;
																												
										@FindBy(xpath="//*[@id='83']")
										private static WebElement  Customize_Reference;
										
										@FindBy(xpath="//*[@id='17077222']")
										private static WebElement  Customize_sRemarks;
										
										@FindBy(xpath="//*[@id='73']")
										private static WebElement  Customize_EntryUser;
										
										@FindBy(xpath="//*[@id='78']")
										private static WebElement  Customize_ModifiedUser;
										
										@FindBy(xpath="//*[@id='95']")
										private static WebElement  Customize_AuthorizationStatus;
										
										@FindBy(xpath="//*[@id='116']")
										private static WebElement  Customize_PrintCount;
										
										@FindBy(xpath="//*[@id='166']")
										private static WebElement  Customize_EMailCount;
																			
										@FindBy(xpath="//*[@id='FilterFieldCust_0_2']/div/div[3]/button[1]")
										private static WebElement  Customize_OkBtn;
										
										@FindBy(xpath="//*[@id='FilterFieldCust_0_2']/div/div[3]/button[2]")
										private static WebElement  Customize_CancekBtn;
							
							@FindBy(xpath="//*[@id='a']")
							private static WebElement  Filter1row_FilterEdit_FilterIcon;
							
							// First ROW
														
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr/td[1]/select")
										private static WebElement Wheredropdown1;
										
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr/td[2]/input")
										private static WebElement  SelectField1;
										
													@FindBy(xpath="//*[@id='1']")
													private static WebElement  SelectField1_DocNo;
													
													@FindBy(xpath="//*[@id='2']")
													private static WebElement SelectField1_Date;
													
													@FindBy(xpath="//*[@id='80']")
													private static WebElement  SelectField1_Time;
													
													@FindBy(xpath="//*[@id='4']")
													private static WebElement  SelectField1_CashBankAC;
													
													@FindBy(xpath="//*[@id='153']")
													private static WebElement  SelectField1_AuthorizeBy;
													
													@FindBy(xpath="//*[@id='161']")
													private static WebElement  SelectField1_AuthorizeRemarks;
													
													@FindBy(xpath="//*[@id='164']")
													private static WebElement  SelectField1_AuthorizeDate;
													
													@FindBy(xpath="//*[@id='268435459']")
													private static WebElement  SelectField1_Department;
													
													@FindBy(xpath="//*[@id='67408868']")
													private static WebElement  SelectField1_sNarration;
													
													@FindBy(xpath="//*[@id='67408869']")
													private static WebElement  SelectField1_sChequeNo;
													
													@FindBy(xpath="//*[@id='12']")
													private static WebElement  SelectField1_Acccount;
													
													@FindBy(xpath="//*[@id='16']")
													private static WebElement  SelectField1_Amount;
													
													@FindBy(xpath="//*[@id='27']")
													private static WebElement  SelectField1_Rate;
													
													@FindBy(xpath="//*[@id='28']")
													private static WebElement  SelectField1_Gross;
													
													@FindBy(xpath="//*[@id='83']")
													private static WebElement  SelectField1_Reference;
													
													@FindBy(xpath="//*[@id='17077222']")
													private static WebElement  SelectField1_Remarks;
													
													@FindBy(xpath="//*[@id='31']")
													private static WebElement  SelectField1_IssueReceipts;
													
													@FindBy(xpath="//*[@id='86']")
													private static WebElement  SelectField1_InVTag;
													
													@FindBy(xpath="//*[@id='87']")
													private static WebElement  SelectField1_INVTag2;
													
													@FindBy(xpath="//*[@id='73']")
													private static WebElement  SelectField1_EntryUser;
													
													@FindBy(xpath="//*[@id='78']")
													private static WebElement  SelectField1_ModifiedUser;
													
													@FindBy(xpath="//*[@id='95']")
													private static WebElement  SelectField1_AuthorizationStatus;
													
													@FindBy(xpath="//*[@id='116']")
													private static WebElement  SelectField1_PrintCount;
													
													@FindBy(xpath="//*[@id='166']")
													private static WebElement  SelectField1_EmailCount;
													
													@FindBy(xpath="//*[@id='3']")
													private static WebElement  SelectField1_PurchaseAC;
													
													@FindBy(xpath="//*[@id='4']")
													private static WebElement  SelectField1_VendorAC;
													
													@FindBy(xpath="//*[@id='3']")
													private static WebElement  SelectField1_SalesAC;
													
													@FindBy(xpath="//*[@id='4']")
													private static WebElement  SelectField1_CustomerAC;
													
													@FindBy(xpath="//*[@id='12']")
													private static WebElement  SelectField1_DRAccount;
													
													@FindBy(xpath="//*[@id='18']")
													private static WebElement  SelectField1_debit;
													
													@FindBy(xpath="//*[@id='19']")
													private static WebElement  SelectField1_Credit;
													
													@FindBy(xpath="//*[@id='39']")
													private static WebElement  SelectField1_CRAccount;
													
													@FindBy(xpath="//*[@id='20']")
													private static WebElement  SelectField1_UpdateStock;
													
													@FindBy(xpath="//*[@id='21']")
													private static WebElement  SelectField1_RaiseReceipt;
													
													@FindBy(xpath="//*[@id='23']")
													private static WebElement  SelectField1_Item;
													
													@FindBy(xpath="//*[@id='26']")
													private static WebElement  SelectField1_Quantity;
													
													@FindBy(xpath="//*[@id='67413346']")
													private static WebElement  SelectField1_AppropriateOn;
													
													@FindBy(xpath="//*[@id='67413347']")
													private static WebElement  SelectField1_AdditionalValue;
													
													@FindBy(xpath="//*[@id='33858916']")
													private static WebElement  SelectField1_MRNqty;
													
													@FindBy(xpath="//*[@id='33858917']")
													private static WebElement  SelectField1_QtyBalance;
													
													@FindBy(xpath="//*[@id='33858918']")
													private static WebElement  SelectField1_AverageRate;
													
													@FindBy(xpath="//*[@id='33858919']")
													private static WebElement  SelectField1_AddValue;
													
													
													
													
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr/td[3]/select")
										private static WebElement  SelectOperatordropdown1;
										
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr/td[4]/select")
										private static WebElement  CompareWithdropdown1;
							
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr/td[5]/input")
										private static WebElement  Value1;
																																	
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr/td[6]/span")
										private static WebElement  DeleteIcon1;
										
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr/td[7]/span")
										private static WebElement  AddIcon1;
										
										@FindBy(xpath="//*[@id='btnSetFilterVal']")
										private static WebElement  FilterIcon_OkBtn;
										
										@FindBy(xpath="//*[@id='dv_DocSetFilter']/div/div/div[3]/div/button[2]")
										private static WebElement  FilterIcon_CancelBtn;
										
										/// Second Row
				
				
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr[2]/td[1]/select")
										private static WebElement  Wheredropdown2;
										
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr[2]/td[2]/input")
										private static WebElement  SelectField2;
										
													@FindBy(xpath="//*[@id='1']")
													private static WebElement  SelectField2_DocNo;
													
													@FindBy(xpath="//*[@id='2']")
													private static WebElement SelectField2_Date;
													
													@FindBy(xpath="//*[@id='80']")
													private static WebElement  SelectField2_Time;
													
													@FindBy(xpath="//*[@id='4']")
													private static WebElement  SelectField2_CashBankAC;
													
													@FindBy(xpath="//*[@id='153']")
													private static WebElement  SelectField2_AuthorizeBy;
													
													@FindBy(xpath="//*[@id='161']")
													private static WebElement  SelectField2_AuthorizeRemarks;
													
													@FindBy(xpath="//*[@id='164']")
													private static WebElement  SelectField2_AuthorizeDate;
													
													@FindBy(xpath="//*[@id='268435459']")
													private static WebElement  SelectField2_Department;
													
													@FindBy(xpath="//*[@id='67408868']")
													private static WebElement  SelectField2_sNarration;
													
													@FindBy(xpath="//*[@id='67408869']")
													private static WebElement  SelectField2_sChequeNo;
													
													@FindBy(xpath="//*[@id='12']")
													private static WebElement  SelectField2_Acccount;
													
													@FindBy(xpath="//*[@id='16']")
													private static WebElement  SelectField2_Amount;
													
													@FindBy(xpath="//*[@id='27']")
													private static WebElement  SelectField2_Rate;
													
													@FindBy(xpath="//*[@id='28']")
													private static WebElement  SelectField2_Gross;
													
													@FindBy(xpath="//*[@id='83']")
													private static WebElement  SelectField2_Reference;
													
													@FindBy(xpath="//*[@id='17077222']")
													private static WebElement  SelectField2_Remarks;
													
													@FindBy(xpath="//*[@id='31']")
													private static WebElement  SelectField2_IssueReceipts;
													
													@FindBy(xpath="//*[@id='86']")
													private static WebElement  SelectField2_InVTag;
													
													@FindBy(xpath="//*[@id='87']")
													private static WebElement  SelectField2_INVTag2;
													
													@FindBy(xpath="//*[@id='73']")
													private static WebElement  SelectField2_EntryUser;
													
													@FindBy(xpath="//*[@id='78']")
													private static WebElement  SelectField2_ModifiedUser;
													
													@FindBy(xpath="//*[@id='95']")
													private static WebElement  SelectField2_AuthorizationStatus;
													
													@FindBy(xpath="//*[@id='116']")
													private static WebElement  SelectField2_PrintCount;
													
													@FindBy(xpath="//*[@id='166']")
													private static WebElement  SelectField2_EmailCount;
													
													@FindBy(xpath="//*[@id='3']")
													private static WebElement  SelectField2_PurchaseAC;
													
													@FindBy(xpath="//*[@id='4']")
													private static WebElement  SelectField2_VendorAC;
													
													@FindBy(xpath="//*[@id='3']")
													private static WebElement  SelectField2_SalesAC;
													
													@FindBy(xpath="//*[@id='4']")
													private static WebElement  SelectField2_CustomerAC;
													
													@FindBy(xpath="//*[@id='12']")
													private static WebElement  SelectField2_DRAccount;
													
													@FindBy(xpath="//*[@id='18']")
													private static WebElement  SelectField2_debit;
													
													@FindBy(xpath="//*[@id='19']")
													private static WebElement  SelectField2_Credit;
													
													@FindBy(xpath="//*[@id='39']")
													private static WebElement  SelectField2_CRAccount;
													
													@FindBy(xpath="//*[@id='20']")
													private static WebElement  SelectField2_UpdateStock;
													
													@FindBy(xpath="//*[@id='21']")
													private static WebElement  SelectField2_RaiseReceipt;
													
													@FindBy(xpath="//*[@id='23']")
													private static WebElement  SelectField2_Item;
													
													@FindBy(xpath="//*[@id='26']")
													private static WebElement  SelectField2_Quantity;
													
													@FindBy(xpath="//*[@id='67413346']")
													private static WebElement  SelectField2_AppropriateOn;
													
													@FindBy(xpath="//*[@id='67413347']")
													private static WebElement  SelectField2_AdditionalValue;
													
													@FindBy(xpath="//*[@id='33858916']")
													private static WebElement  SelectField2_MRNqty;
													
													@FindBy(xpath="//*[@id='33858917']")
													private static WebElement  SelectField2_QtyBalance;
													
													@FindBy(xpath="//*[@id='33858918']")
													private static WebElement  SelectField2_AverageRate;
													
													@FindBy(xpath="//*[@id='33858919']")
													private static WebElement  SelectField2_AddValue;
														
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr[2]/td[3]/select")
										private static WebElement  SelectOperatordropdown2;
													
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr[2]/td[4]/select")
										private static WebElement  CompareWithdropdown2;
										
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr[2]/td[5]/input")
										private static WebElement  Value2;
																																				
										@FindBy(xpath="//*[@id='0_2_AdvanceFilter']/table/tbody/tr[2]/td[6]/span")
										private static WebElement  DeleteIcon2;
													
				
				@FindBy(xpath="//*[@id='dvCreateViewMain']/div[2]/div[2]/span[2]")
				private static WebElement  DocumentSet_Editlayout;
				
				// edit layout in-detailed 
				// Same as Create Layout 
				
				
				@FindBy(xpath="//*[@id='cmd_LayoutOptions']")
				private static WebElement  LayoutOptionsdropdown;
				
				@FindBy(xpath="//*[@id='btnPreview']")
				private static WebElement  PreviewBtn;
				
				@FindBy(xpath="//*[@id='btnPrint']")
				private static WebElement  PrintBtn;
				
				@FindBy(xpath="//*[@id='id_transaction_voucherprint']/div/div/div[3]/div/button[4]")
				private static WebElement  CloseBtn;	
	
	
	
//---------------------------------------------------------------------------------------------
				
				
	// Cash And Bank ***** Payments			
				
		// Same as Receipts SO Above named AS RPP header......Body as CashandBank body
				//userdetails,miscellanious,company is same 	
				
//---------------------------------------------------------------------------------------------
				
				
	// Cash And Bank ***** PettyCash			
							
		// Same as Receipts SO Above named AS RPP header......Body as CashandBank body
			//userdetails,miscellanious,company is same 				
				
				
				
//-----------------------------------------------------------------------------------------------				
				
	// Cash And Bank ***** Post Dated Receipts			
		// header is uncommon named as Post	header	
				//Body as CashandBank body
				//userdetails,miscellanious,company is same

			@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
			private static WebElement  Post_HeaderExpandBtn;
			
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
						private static WebElement  Post_Header_DocNOdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
						private static WebElement  Post_Header_DateExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
									private static WebElement  Post_Datedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
									private static WebElement  Post_Date_Yeardraganddrop;
									
									@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
									private static WebElement  Post_Date_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
									private static WebElement  Post_Date_DayOfYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
									private static WebElement  Post_Date_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
									private static WebElement  Post_Date_Weekdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
									private static WebElement  Post_Date_WeekDaydraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
						private static WebElement  Post_Header_TimeExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
									private static WebElement  Post_Time_Timedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
									private static WebElement  Post_Time_Hourdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
									private static WebElement  Post_Time_Minutedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
									private static WebElement Post_Time_Seconddraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
						private static WebElement Post_Header_CashBankACExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
									private static WebElement  Post_CashBankAC_Namedraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
									private static WebElement  Post_CashBankAC_Codedraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
									private static WebElement  Post_CashBankAC_Aliasdraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
									private static WebElement  Post_CashBankAC_Accounttypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
									private static WebElement  Post_CashBankAC_Addressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
									private static WebElement  Post_CashBankAC_AllowCustomerPortaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
									private static WebElement  Post_CashBankAC_BanckACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
									private static WebElement  Post_CashBankAC_BankACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
									private static WebElement  Post_CashBankAC_BankAccountNamedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
									private static WebElement  Post_CashBankAC_BankAccountNumberdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
									private static WebElement  Post_CashBankAC_ChequeDiscountLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
									private static WebElement  Post_CashBankAC_City1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
									private static WebElement  Post_CashBankAC_CityCode1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
									private static WebElement  Post_CashBankAC_City2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
									private static WebElement  Post_CashBankAC_CityCode2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
									private static WebElement  Post_CashBankAC_ConsolidationMethoddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
									private static WebElement  Post_CashBankAC_CreditDaysdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
									private static WebElement  Post_CashBankAC_CreditLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
									private static WebElement  Post_CashBankAC_DebitCreditProposaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
									private static WebElement  Post_CashBankAC_DebitCreditRequireddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
									private static WebElement  Post_CashBankAC_DefaultCurrencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
									private static WebElement  Post_CashBankAC_DeliveryAddressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
									private static WebElement  Post_CashBankAC_Emaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
									private static WebElement  Post_CashBankAC_ExchangeAdjustGainACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
									private static WebElement  Post_CashBankAC_ExchangeAdjustGainACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
									private static WebElement  Post_CashBankAC_ExchangeAdjustLossACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
									private static WebElement  Post_CashBankAC_ExchangeAdjustLossACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
									private static WebElement  Post_CashBankAC_FaxNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
									private static WebElement  Post_CashBankAC_FinanceChargeTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
									private static WebElement  Post_CashBankAC_FinanaceEmaildraganddrop;
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
									private static WebElement  Post_CashBankAC_IFSCcodedraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
									private static WebElement  Post_CashBankAC_Passworddraganddrop;
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
									private static WebElement  Post_CashBankAC_PaymentTermsdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
									private static WebElement  Post_CashBankAC_PaymentTypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
									private static WebElement  Post_CashBankAC_PDCdiscountedACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
									private static WebElement  Post_CashBankAC_PDCdiscountedACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
									private static WebElement  Post_CashBankAC_Pin1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
									private static WebElement  Post_CashBankAC_Pin2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
									private static WebElement  Post_CashBankAC_PortalEmaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
									private static WebElement  Post_CashBankAC_PrimaryAccountdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
									private static WebElement  Post_CashBankAC_PrimanryAccountCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
									private static WebElement  Post_CashBankAC_RateOFInterestdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
									private static WebElement  Post_CashBankAC_ReminderTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
									private static WebElement  Post_CashBankAC_SendEmaialToCustomerdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
									private static WebElement  Post_CashBankAC_TelNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
									private static WebElement  Post_CashBankAC_GropupLevel1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
									private static WebElement  Post_CashBankAC_GroupLevel1Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
									private static WebElement  Post_CashBankAC_GroupLevel2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
									private static WebElement  Post_CashBankAC_GroupLevel2Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
									private static WebElement  Post_CashBankAC_GroupLevel3draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
									private static WebElement  Post_CashBankAC_GroupLevel3Codedraganddrop;
									
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
						private static WebElement Post_Header_MaturityDateExpandBtn;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[1]/a")
									private static WebElement  Post_MaturityDate_MaturityDatedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[2]/a")
									private static WebElement  Post_MaturityDate_Yeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[3]/a")
									private static WebElement  Post_MaturityDate_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[4]/a")
									private static WebElement  Post_MaturityDate_DayOfYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[5]/a")
									private static WebElement  Post_MaturityDate_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[6]/a")
									private static WebElement  Post_MaturityDate_Weekdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[7]/a")
									private static WebElement  Post_MaturityDate_WeekDaydraganddrop;
						
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
						private static WebElement  Post_Narrationdraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
						private static WebElement  Post_ChequeNodraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
						private static WebElement  Post_CreatedBydraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
						private static WebElement  Post_Header_CreatedDateExpandBtn;	
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[1]/a")
									private static WebElement  Post_CreatedDate_CreatedDatedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[2]/a")
									private static WebElement  Post_CreatedDate_Yeardraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[3]/a")
									private static WebElement  Post_CreatedDate_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[4]/a")
									private static WebElement  Post_CreatedDate_DayofYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[5]/a")
									private static WebElement  Post_CreatedDate_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[6]/a")
									private static WebElement  Post_CreatedDate_Weekdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[7]/a")
									private static WebElement  Post_CreatedDate_WeekDaydraganddrop;
						
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
					private static WebElement  Post_Header_CreatedTimeExpandBtn;
					
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[1]/a")
									private static WebElement  Post_CreatedTime_CreatedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[2]/a")
									private static WebElement  Post_CreatedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[3]/a")
									private static WebElement  Post_CreatedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[4]/a")
									private static WebElement  Post_CreatedTime_Seconddrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
					private static WebElement  Post_Header_ModifiedBydrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
					private static WebElement  Post_Header_ModifiedDateExpandBtn;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[1]/a")
									private static WebElement  Post_ModifiedDate_ModifiedDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[2]/a")
									private static WebElement  Post_ModifiedDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[3]/a")
									private static WebElement  Post_ModifiedDate_monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[4]/a")
									private static WebElement  Post_ModifiedDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[5]/a")
									private static WebElement  Post_ModifiedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[6]/a")
									private static WebElement  Post_ModifiedDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[7]/a")
									private static WebElement  Post_ModifiedDate_WeekDaydrapanddrop;
												
			
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
			    	private static WebElement  Post_Header_ModifiedTimeExpandBtn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[1]/a")
									private static WebElement  Post_ModifiedTime_ModifiedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[2]/a")
									private static WebElement  Post_ModifiedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[3]/a")
									private static WebElement  Post_ModifiedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[4]/a")
									private static WebElement  Post_ModifiedTime_Seconddrapanddrop;
							
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
					private static WebElement  Post_Header_PrintCountdrapanddrop;	
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
					private static WebElement  Post_Header_RevisionNumberdrapanddrop;	
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
					private static WebElement  Post_Header_AuthorizeStatusdrapanddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/a")
			    	private static WebElement  Post_Header_AuthorizeDateExpandBn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[1]/a")
									private static WebElement  Post_AuthorizeDate_AuthorizeDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[2]/a")
									private static WebElement  Post_AuthorizeDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[3]/a")
									private static WebElement  Post_AuthorizeDate_Monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[4]/a")
									private static WebElement  Post_AuthorizeDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[5]/a")
									private static WebElement  Post_AuthorizedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[6]/a")
									private static WebElement  Post_AuthorizeDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/ul/li[7]/a")
									private static WebElement  Post_AuthorizeDate_WeekDaydrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[18]/a")
					private static WebElement  Post_Header_EMailCountdrapanddrop;
			
			
//-----------------------------------------------------------------------------------------------------------------------				
		
				
	// Finance transaction Purchase ** Purchase Vouchers
					
		// Header named as Finance_purchases_Header  (Common for Finance ***Purchase Vouchers and Purchase Returns)
				// Body named  as PSS_Body    (Common for Finance Purchse, Finance Sales, Inventory Purchase, Inventory Sales And Stock)
											// Stock transfer and Stock Adjustment are different name convention changed For those elememnts
			// 	userdetails,miscellanious,company is same


			// Finance_Purchases Header

			@FindBy(xpath="//span[contains(text(),'Header')]")
			private static WebElement  Finance_Purchases_HeaderExpandBtn;
			
						//@FindBy(xpath="//span[contains(text(),'DocNo')]")
						//private static WebElement  Finance_Purchases_Header_DocNOdraganddrop;
						
						@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Date')]//i[@class='icon-expand icon-font8']")
						private static WebElement  Finance_Purchases_Header_DateExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
									private static WebElement  Finance_Purchases_Datedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
									private static WebElement  Finance_Purchases_Date_Yeardraganddrop;
									
									@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
									private static WebElement  Finance_Purchases_Date_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
									private static WebElement  Finance_Purchases_Date_DayOfYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
									private static WebElement  Finance_Purchases_Date_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
									private static WebElement  Finance_Purchases_Date_Weekdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
									private static WebElement  Finance_Purchases_Date_WeekDaydraganddrop;
						
						@FindBy(xpath="//span[contains(text(),'Time')]//i[@class='icon-expand icon-font8']")
						private static WebElement  Finance_Purchases_Header_TimeExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
									private static WebElement  Finance_Purchases_Time_Timedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
									private static WebElement  Finance_Purchases_Time_Hourdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
									private static WebElement  Finance_Purchases_Time_Minutedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
									private static WebElement Finance_Purchases_Time_Seconddraganddrop;
									
						@FindBy(xpath="//span[contains(text(),'PurchaseAC')]//i[@class='icon-expand icon-font8']")
						private static WebElement Finance_Purchases_Header_PurchaseAcExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_Namedraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_Codedraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_Aliasdraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_Accounttypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_Addressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_AllowCustomerPortaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_BanckACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_BankACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_BankAccountNamedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_BankAccountNumberdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_ChequeDiscountLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_City1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_CityCode1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_City2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_CityCode2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_ConsolidationMethoddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_CreditDaysdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_CreditLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_DebitCreditProposaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_DebitCreditRequireddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_DefaultCurrencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_DeliveryAddressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_Emaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_ExchangeAdjustGainACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_ExchangeAdjustGainACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_ExchangeAdjustLossACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_ExchangeAdjustLossACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_FaxNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_FinanceChargeTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_FinanaceEmaildraganddrop;
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_IFSCcodedraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_Passworddraganddrop;
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_PaymentTermsdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_PaymentTypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_PDCdiscountedACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_PDCdiscountedACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_Pin1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_Pin2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_PortalEmaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_PrimaryAccountdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_PrimanryAccountCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_RateOFInterestdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_ReminderTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_SendEmaialToCustomerdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_TelNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_GropupLevel1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_GroupLevel1Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_GroupLevel2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_GroupLevel2Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_GroupLevel3draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
									private static WebElement  Finance_Purchases_PurchaseAc_GroupLevel3Codedraganddrop;
									
					
						
						@FindBy(xpath="//span[contains(text(),'VendorAC')]//i[@class='icon-expand icon-font8']")
						private static WebElement Finance_Purchases_Header_VendorACExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[1]/a")
									private static WebElement  Finance_Purchases_VendorAC_Namedraganddrop;
											
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[2]/a")
									private static WebElement  Finance_Purchases_VendorAC_Codedraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[3]/a")
									private static WebElement  Finance_Purchases_VendorAC_Aliasdraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[4]/a")
									private static WebElement  Finance_Purchases_VendorAC_Accounttypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[5]/a")
									private static WebElement  Finance_Purchases_VendorAC_Addressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[6]/a")
									private static WebElement  Finance_Purchases_VendorAC_AllowCustomerPortaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[7]/a")
									private static WebElement  Finance_Purchases_VendorAC_BanckACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[8]/a")
									private static WebElement  Finance_Purchases_VendorAC_BankACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[9]/a")
									private static WebElement  Finance_Purchases_VendorAC_BankAccountNamedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[10]/a")
									private static WebElement  Finance_Purchases_VendorAC_BankAccountNumberdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[11]/a")
									private static WebElement  Finance_Purchases_VendorAC_ChequeDiscountLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[12]/a")
									private static WebElement  Finance_Purchases_VendorAC_City1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[13]/a")
									private static WebElement  Finance_Purchases_VendorAC_CityCode1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[14]/a")
									private static WebElement  Finance_Purchases_VendorAC_City2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[15]/a")
									private static WebElement  Finance_Purchases_VendorAC_CityCode2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[16]/a")
									private static WebElement  Finance_Purchases_VendorAC_ConsolidationMethoddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[17]/a")
									private static WebElement  Finance_Purchases_VendorAC_CreditDaysdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[18]/a")
									private static WebElement  Finance_Purchases_VendorAC_CreditLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[19]/a")
									private static WebElement  Finance_Purchases_VendorAC_DebitCreditProposaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[20]/a")
									private static WebElement  Finance_Purchases_VendorAC_DebitCreditRequireddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[21]/a")
									private static WebElement  Finance_Purchases_VendorAC_DefaultCurrencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[22]/a")
									private static WebElement  Finance_Purchases_VendorAC_DeliveryAddressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[23]/a")
									private static WebElement  Finance_Purchases_VendorAC_Emaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[24]/a")
									private static WebElement  Finance_Purchases_VendorAC_ExchangeAdjustGainACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[25]/a")
									private static WebElement  Finance_Purchases_VendorAC_ExchangeAdjustGainACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[26]/a")
									private static WebElement  Finance_Purchases_VendorAC_ExchangeAdjustLossACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[27]/a")
									private static WebElement  Finance_Purchases_VendorAC_ExchangeAdjustLossACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[28]/a")
									private static WebElement  Finance_Purchases_VendorAC_FaxNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[29]/a")
									private static WebElement  Finance_Purchases_VendorAC_FinanceChargeTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[30]/a")
									private static WebElement  Finance_Purchases_VendorAC_FinanaceEmaildraganddrop;
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[31]/a")
									private static WebElement  Finance_Purchases_VendorAC_IFSCcodedraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[32]/a")
									private static WebElement  Finance_Purchases_VendorAC_Passworddraganddrop;
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[33]/a")
									private static WebElement  Finance_Purchases_VendorAC_PaymentTermsdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[34]/a")
									private static WebElement  Finance_Purchases_VendorAC_PaymentTypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[35]/a")
									private static WebElement  Finance_Purchases_VendorAC_PDCdiscountedACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[36]/a")
									private static WebElement  Finance_Purchases_VendorAC_PDCdiscountedACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[37]/a")
									private static WebElement  Finance_Purchases_VendorAC_Pin1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[38]/a")
									private static WebElement  Finance_Purchases_VendorAC_Pin2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[39]/a")
									private static WebElement  Finance_Purchases_VendorAC_PortalEmaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[40]/a")
									private static WebElement  Finance_Purchases_VendorAC_PrimaryAccountdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[41]/a")
									private static WebElement  Finance_Purchases_VendorAC_PrimanryAccountCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[42]/a")
									private static WebElement  Finance_Purchases_VendorAC_RateOFInterestdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[43]/a")
									private static WebElement  Finance_Purchases_VendorAC_ReminderTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[44]/a")
									private static WebElement  Finance_Purchases_VendorAC_SendEmaialToCustomerdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[45]/a")
									private static WebElement  Finance_Purchases_VendorAC_TelNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[46]/a")
									private static WebElement  Finance_Purchases_VendorAC_GropupLevel1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[47]/a")
									private static WebElement  Finance_Purchases_VendorAC_GroupLevel1Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[48]/a")
									private static WebElement  Finance_Purchases_VendorAC_GroupLevel2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[49]/a")
									private static WebElement  Finance_Purchases_VendorAC_GroupLevel2Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[50]/a")
									private static WebElement  Finance_Purchases_VendorAC_GroupLevel3draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[51]/a")
									private static WebElement  Finance_Purchases_VendorAC_GroupLevel3Codedraganddrop;
									
						@FindBy(xpath="//span[contains(text(),'UpdateStock')]")
						private static WebElement  Finance_Purchases_Header_UpdateStockBtn;
						
						@FindBy(xpath="//span[contains(text(),'RaiseReceipt')]")
						private static WebElement  Finance_Purchases_Header_RaiseReceiptBtn;
						
						@FindBy(xpath="//span[contains(text(),'Warehouse')]//i[@class='icon-expand icon-font8']")
						private static WebElement  Finance_Purchases_Header_WareHouseExpandBtn;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
						private static WebElement  Finance_Purchases_Header_DepartmentExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[1]/a")
									private static WebElement  Finance_Purchases_Department_Namedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[2]/a")
									private static WebElement  Finance_Purchases_Department_Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[3]/a")
									private static WebElement  Finance_Purchases_Department_Aliasdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[4]/a")
									private static WebElement  Finance_Purchases_Department_Currencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[5]/a")
									private static WebElement  Finance_Purchases_Department_GroupLevel1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[6]/a")
									private static WebElement  Finance_Purchases_Department_GroupLevel1Codedraganddrop;
									
						@FindBy(xpath="//span[contains(text(),'Narration')]")
						private static WebElement  Finance_Purchases_Narrationdraganddrop;
						
						@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Test')]")
						private static WebElement  Finance_Purchases_Testdraganddrop;
						
						@FindBy(xpath="//span[contains(text(),'Formula')]")
						private static WebElement  Finance_Purchases_Formuladraganddrop;
						
						@FindBy(xpath="//span[contains(text(),'FD%')]")
						private static WebElement  Finance_Purchases_FDdraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
						private static WebElement  Finance_Purchases_ChequeNodraganddrop;
									
						@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Created by')]")
						private static WebElement  Finance_Purchases_CreatedBydraganddrop;
									
						@FindBy(xpath="//span[contains(text(),'Created date')]//i[@class='icon-expand icon-font8']")
						private static WebElement  Finance_Purchases_Header_CreatedDateExpandBtn;	
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[1]/a")
									private static WebElement  Finance_Purchases_CreatedDate_CreatedDatedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[2]/a")
									private static WebElement  Finance_Purchases_CreatedDate_Yeardraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[3]/a")
									private static WebElement  Finance_Purchases_CreatedDate_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[4]/a")
									private static WebElement  Finance_Purchases_CreatedDate_DayofYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[5]/a")
									private static WebElement  Finance_Purchases_CreatedDate_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[6]/a")
									private static WebElement  Finance_Purchases_CreatedDate_Weekdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[7]/a")
									private static WebElement  Finance_Purchases_CreatedDate_WeekDaydraganddrop;
						
					
					@FindBy(xpath="//span[contains(text(),'Created time')]//i[@class='icon-expand icon-font8']")
					private static WebElement  Finance_Purchases_Header_CreatedTimeExpandBtn;
					
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[1]/a")
									private static WebElement  Finance_Purchases_CreatedTime_CreatedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[2]/a")
									private static WebElement  Finance_Purchases_CreatedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[3]/a")
									private static WebElement  Finance_Purchases_CreatedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[4]/a")
									private static WebElement  Finance_Purchases_CreatedTime_Seconddrapanddrop;
									
					@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Modified by')]")
					private static WebElement  Finance_Purchases_Header_ModifiedBydrapanddrop;
									
					@FindBy(xpath="//span[contains(text(),'Modified date')]//i[@class='icon-expand icon-font8']")
					private static WebElement  Finance_Purchases_Header_ModifiedDateExpandBtn;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[1]/a")
									private static WebElement  Finance_Purchases_ModifiedDate_ModifiedDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[2]/a")
									private static WebElement  Finance_Purchases_ModifiedDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[3]/a")
									private static WebElement  Finance_Purchases_ModifiedDate_monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[4]/a")
									private static WebElement  Finance_Purchases_ModifiedDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[5]/a")
									private static WebElement  Finance_Purchases_ModifiedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[6]/a")
									private static WebElement  Finance_Purchases_ModifiedDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[7]/a")
									private static WebElement  Finance_Purchases_ModifiedDate_WeekDaydrapanddrop;
												
			
					@FindBy(xpath="//span[contains(text(),'Modified time')]//i[@class='icon-expand icon-font8']")
			    	private static WebElement  Finance_Purchases_Header_ModifiedTimeExpandBtn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[1]/a")
									private static WebElement  Finance_Purchases_ModifiedTime_ModifiedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[2]/a")
									private static WebElement  Finance_Purchases_ModifiedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[3]/a")
									private static WebElement  Finance_Purchases_ModifiedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[4]/a")
									private static WebElement  Finance_Purchases_ModifiedTime_Seconddrapanddrop;
							
									
					@FindBy(xpath="//span[contains(text(),'Print count')]")
					private static WebElement  Finance_Purchases_Header_PrintCountdrapanddrop;	
					
					@FindBy(xpath="//span[contains(text(),'Revision number')]")
					private static WebElement  Finance_Purchases_Header_RevisionNumberdrapanddrop;	
					
					@FindBy(xpath="//span[contains(text(),'Authorize status')]")
					private static WebElement  Finance_Purchases_Header_AuthorizeStatusdrapanddrop;
					
					@FindBy(xpath="//span[contains(text(),'Authorize date')]//i[@class='icon-expand icon-font8']")
			    	private static WebElement  Finance_Purchases_Header_AuthorizeDateExpandBn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[1]/a")
									private static WebElement  Finance_Purchases_AuthorizeDate_AuthorizeDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[2]/a")
									private static WebElement  Finance_Purchases_AuthorizeDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[3]/a")
									private static WebElement  Finance_Purchases_AuthorizeDate_Monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[4]/a")
									private static WebElement  Finance_Purchases_AuthorizeDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[5]/a")
									private static WebElement  Finance_Purchases_AuthorizedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[6]/a")
									private static WebElement  Finance_Purchases_AuthorizeDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[7]/a")
									private static WebElement  Finance_Purchases_AuthorizeDate_WeekDaydrapanddrop;
									
					@FindBy(xpath="//span[contains(text(),'Email count')]")
					private static WebElement  Finance_Purchases_Header_EMailCountdrapanddrop;
	
			@FindBy(xpath="//i[@class='icon-collepse icon-font8']")
			private static WebElement  FieldsMinimizeBtn;
			
		////// Finance_Purchases ****Body****
		// Named as PSS_Body {Common for Finance purchase,sales***Inventory Purchase,sales,stocks}
	
			@FindBy(xpath="//span[contains(text(),'Body')]//i[@class='icon-expand icon-font8']")
			private static WebElement  PSS_BodyExpandbtn;

						@FindBy(xpath="//span[contains(text(),'Item')]//i[@class='icon-expand icon-font8']")
						private static WebElement  PSS_Body_ItemtExpansion;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[1]/a")
									private static WebElement  PSS_Item_Namedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[2]/a")
									private static WebElement  PSS_Item_Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[3]/a")
									private static WebElement  PSS_Item_Budgetdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[4]/a")
									private static WebElement  PSS_Item_Aliasdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[5]/a")
									private static WebElement  PSS_Item_ABCcodeCarryingCostdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[6]/a")
									private static WebElement  PSS_Item_ABCcodeMargindraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[7]/a")
									private static WebElement  PSS_Item_ABCcodeRevenuedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[8]/a")
									private static WebElement  PSS_Item_ABCcodeValuedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[9]/a")
									private static WebElement  PSS_Item_AlternateCategorydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[10]/a")
									private static WebElement  PSS_Item_AlternateCategoryCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[11]/a")
									private static WebElement  PSS_Item_BarCode1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[12]/a")
									private static WebElement  PSS_Item_BarCode2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[13]/a")
									private static WebElement  PSS_Item_BarCode3draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[14]/a")
									private static WebElement  PSS_Item_Bindraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[15]/a")
									private static WebElement  PSS_Item_BinCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[16]/a")
									private static WebElement  PSS_Item_BinCapacitydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[17]/a")
									private static WebElement  PSS_Item_BOMdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[18]/a")
									private static WebElement  PSS_Item_Categorydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[19]/a")
									private static WebElement  PSS_Item_CategoryCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[20]/a")
									private static WebElement  PSS_Item_CBMdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[21]/a")
									private static WebElement  PSS_CostOfExcessStockACItem_draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[22]/a")
									private static WebElement  PSS_Item_CostOfExcessStockACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[23]/a")
									private static WebElement  PSS_Item_CostOfIssueAccountdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[24]/a")
									private static WebElement  PSS_Item_CostOfIssueAccountCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[25]/a")
									private static WebElement  PSS_Item_CostOfSalesReturnACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[26]/a")
									private static WebElement  PSS_Item_CostOfSalesReturnACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[27]/a")
									private static WebElement  PSS_Item_CostOfShortageStockACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[28]/a")
									private static WebElement  PSS_Item_CostOfShortageStockACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[29]/a")
									private static WebElement  PSS_Item_DefaultBaseUnitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[30]/a")
									private static WebElement  PSS_Item_DefaultBaseUnitCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[31]/a")
									private static WebElement  PSS_Item_DefaultPurchaseUnitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[32]/a")
									private static WebElement  PSS_Item_DefaultPurchaseUnitcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[33]/a")
									private static WebElement  PSS_Item_DefaultReplenishmentdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[34]/a")
									private static WebElement  PSS_Item_DefaultSalesUnitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[35]/a")
									private static WebElement  PSS_Item_DefaultSalesUnitcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[36]/a")
									private static WebElement  PSS_Item_Descriptiondraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[37]/a")
									private static WebElement  PSS_Item_DontShowProductsExpiringInDaysdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[38]/a")
									private static WebElement  PSS_Item_Flushingdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[39]/a")
									private static WebElement  PSS_Item_Heightdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[40]/a")
									private static WebElement  PSS_Item_IndirectCostdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[41]/a")
									private static WebElement  PSS_Item_ItemMakedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[42]/a")
									private static WebElement  PSS_Item_ItemTypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[43]/a")
									private static WebElement  PSS_Item_Lengthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[44]/a")
									private static WebElement  PSS_Item_ManufacturePolicydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[45]/a")
									private static WebElement  PSS_Item_OverHeadCostdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[46]/a")
									private static WebElement  PSS_Item_PackingBOMdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[47]/a")
									private static WebElement  PSS_Item_PerishableItemdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[48]/a")
									private static WebElement  PSS_Item_Printerdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[49]/a")
									private static WebElement  PSS_Item_Profitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[50]/a")
									private static WebElement  PSS_Item_PurchaseVarianceACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[51]/a")
									private static WebElement  PSS_Item_PurchaseVarianceACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[52]/a")
									private static WebElement  PSS_Item_ReorderLeveldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[53]/a")
									private static WebElement  PSS_Item_SalesAccountdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[54]/a")
									private static WebElement  PSS_Item_SalesAccountCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[55]/a")
									private static WebElement  PSS_Item_StandardCostdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[56]/a")
									private static WebElement  PSS_Item_StocksAccountdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[57]/a")
									private static WebElement  PSS_Item_StocksAccountCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[58]/a")
								    private static WebElement  PSS_Item_TaxCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[59]/a")
								    private static WebElement  PSS_Item_TaxCodecodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[60]/a")
									private static WebElement  PSS_Item_ValuationMethoddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[61]/a")
									private static WebElement  PSS_Item_Weightdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[62]/a")
									private static WebElement  PSS_Item_Widthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[63]/a")
									private static WebElement  PSS_Item_WIPaccountdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[64]/a")
									private static WebElement  PSS_Item_WIPaccountCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[65]/a")
									private static WebElement  PSS_Item_GroupLevel1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[66]/a")
									private static WebElement  PSS_Item_GroupLevel1Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[67]/a")
									private static WebElement  PSS_Item_Buyingratedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[68]/a")
									private static WebElement  PSS_Item_BuyingVAl1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[69]/a")
									private static WebElement  PSS_Item_BuyingVal2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[70]/a")
									private static WebElement  PSS_Item_BuyingVal3draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[71]/a")
									private static WebElement  PSS_Item_BuyingVal4draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[72]/a")
									private static WebElement  PSS_Item_BuyingVal5draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[73]/a")
									private static WebElement  PSS_Item_BuyingVal6draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[74]/a")
									private static WebElement  PSS_Item_BuyingVal7draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[75]/a")
									private static WebElement  PSS_Item_BuyingVal8draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[76]/a")
									private static WebElement  PSS_Item_BuyingVal9draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[77]/a")
									private static WebElement  PSS_Item_BuyingVal10draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[78]/a")
									private static WebElement  PSS_Item_BuyingVal11draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[79]/a")
									private static WebElement  PSS_Item_BuyingVal12draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[80]/a")
									private static WebElement  PSS_Item_BuyingVal13draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[81]/a")
									private static WebElement  PSS_Item_SellingRatedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[82]/a")
									private static WebElement  PSS_Item_SellingVal1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[83]/a")
									private static WebElement  PSS_Item_SellingVal2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[84]/a")
									private static WebElement  PSS_Item_SellingVal3draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[85]/a")
									private static WebElement  PSS_Item_SellingVal4draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[86]/a")
									private static WebElement  PSS_Item_SellingVal5draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[87]/a")
									private static WebElement  PSS_Item_SellingVal6draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[88]/a")
									private static WebElement  PSS_Item_SellingVal7draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[89]/a")
									private static WebElement  PSS_Item_SellingVal8draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[90]/a")
									private static WebElement  PSS_Item_SellingVal9draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[91]/a")
									private static WebElement  PSS_Item_SellingVal10draganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[92]/a")
									private static WebElement  PSS_Item_SellingVal11draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[93]/a")
									private static WebElement  PSS_Item_SellingVal12draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[94]/a")
									private static WebElement  PSS_Item_SellingVal13draganddrop;
									
						
						@FindBy(xpath="//span[contains(text(),'Unit')]//i[@class='icon-expand icon-font8']")
						private static WebElement  PSS_Body_UnitExpandBtn;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
						private static WebElement  PSS_Body_RDdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a")
						private static WebElement  PSS_Body_AvgRate0draganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a")
						private static WebElement  PSS_Body_Quantitydraganddrop;
								
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[6]/a")
						private static WebElement  PSS_Body_LPurchaseOrdersdraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[7]/a")
						private static WebElement  PSS_Body_Ratedraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[8]/a")
						private static WebElement  PSS_Body_Grossdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[9]/a")
						private static WebElement  PSS_Body_Batchdraganddrop;
						
						@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Bins')]")
						private static WebElement  PSS_Body_BinsExpandBtn;
						
						@FindBy(xpath="//span[contains(text(),'ExpDate')]")
						private static WebElement  PSS_Body_ExpDatedraganddrop;
						
						@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'RMA')]")
						private static WebElement  PSS_Body_RMAdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[13]/a")
						private static WebElement  PSS_Body_Netdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[14]/a")
						private static WebElement  PSS_Body_NetBaseCurrencydraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[15]/a")
						private static WebElement  PSS_Body_NetLocalCurrencydraganddrop;
						
						@FindBy(xpath="//span[contains(text(),'RD Value')]")
						private static WebElement  PSS_Body_RDValuedraganddrop;
						
						@FindBy(xpath="//span[contains(text(),'Avg Rate(O) Value')]")
						private static WebElement  PSS_Body_AvgRate0Valuedraganddrop;

						
						
//------------------------------------------------------------------------------------------------------------------------------------------				

						
// Finance transaction Purchases*** Purchase returns
						
				// Header is same as purchase vouchers named as {Finance_Purchases_Header}
				// body named as PSS_Body
				// userdetails,miscellanious,company is same
				
//--------------------------------------------------------------------------------------------------------------------------------------------				
			
				
// Finance Transaction sales***Sales Invoice
				
				// Header named As Finance_Sales (Common for Sales invoice,Sales returns,cash sales,Pos Sales)
				// Body named as PSS_Body
				// userdetails,miscellanious,company is same		
				
				
				
				// Finance_Sales Header

				@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
				private static WebElement  Finance_Sales_HeaderExpandBtn;
				
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
							private static WebElement  Finance_Sales_Header_DocNOdraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
							private static WebElement  Finance_Sales_Header_DateExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
										private static WebElement  Finance_Sales_Datedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
										private static WebElement  Finance_Sales_Date_Yeardraganddrop;
										
										@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
										private static WebElement  Finance_Sales_Date_Monthdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
										private static WebElement  Finance_Sales_Date_DayOfYeardraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
										private static WebElement  Finance_Sales_Date_Daydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
										private static WebElement  Finance_Sales_Date_Weekdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
										private static WebElement  Finance_Sales_Date_WeekDaydraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
							private static WebElement  Finance_Sales_Header_TimeExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
										private static WebElement  Finance_Sales_Time_Timedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
										private static WebElement  Finance_Sales_Time_Hourdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
										private static WebElement  Finance_Sales_Time_Minutedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
										private static WebElement Finance_Sales_Time_Seconddraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
							private static WebElement Finance_Sales_Header_SalesACExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
										private static WebElement  Finance_Sales_SalesAC_Namedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
										private static WebElement  Finance_Sales_SalesAC_Codedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
										private static WebElement  Finance_Sales_SalesAC_Aliasdraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
										private static WebElement  Finance_Sales_SalesAC_Accounttypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
										private static WebElement  Finance_Sales_SalesAC_Addressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
										private static WebElement  Finance_Sales_SalesAC_AllowCustomerPortaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
										private static WebElement  Finance_Sales_SalesAC_BanckACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
										private static WebElement  Finance_Sales_SalesAC_BankACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
										private static WebElement  Finance_Sales_SalesAC_BankAccountNamedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
										private static WebElement  Finance_Sales_SalesAC_BankAccountNumberdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
										private static WebElement  Finance_Sales_SalesAC_ChequeDiscountLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
										private static WebElement  Finance_Sales_SalesAC_City1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
										private static WebElement  Finance_Sales_SalesAC_CityCode1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
										private static WebElement  Finance_Sales_SalesAC_City2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
										private static WebElement  Finance_Sales_SalesAC_CityCode2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
										private static WebElement  Finance_Sales_SalesAC_ConsolidationMethoddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
										private static WebElement  Finance_Sales_SalesAC_CreditDaysdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
										private static WebElement  Finance_Sales_SalesAC_CreditLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
										private static WebElement  Finance_Sales_SalesAC_DebitCreditProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
										private static WebElement  Finance_Sales_SalesAC_DebitCreditRequireddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
										private static WebElement  Finance_Sales_SalesAC_DefaultCurrencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
										private static WebElement  Finance_Sales_SalesAC_DeliveryAddressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
										private static WebElement  Finance_Sales_SalesAC_Emaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
										private static WebElement  Finance_Sales_SalesAC_ExchangeAdjustGainACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
										private static WebElement  Finance_Sales_SalesAC_ExchangeAdjustGainACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
										private static WebElement  Finance_Sales_SalesAC_ExchangeAdjustLossACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
										private static WebElement  Finance_Sales_SalesAC_ExchangeAdjustLossACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
										private static WebElement  Finance_Sales_SalesAC_FaxNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
										private static WebElement  Finance_Sales_SalesAC_FinanceChargeTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
										private static WebElement  Finance_Sales_SalesAC_FinanaceEmaildraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
										private static WebElement  Finance_Sales_SalesAC_IFSCcodedraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
										private static WebElement  Finance_Sales_SalesAC_Passworddraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
										private static WebElement  Finance_Sales_SalesAC_PaymentTermsdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
										private static WebElement  Finance_Sales_SalesAC_PaymentTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
										private static WebElement  Finance_Sales_SalesAC_PDCdiscountedACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
										private static WebElement  Finance_Sales_SalesAC_PDCdiscountedACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
										private static WebElement  Finance_Sales_SalesAC_Pin1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
										private static WebElement  Finance_Sales_SalesAC_Pin2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
										private static WebElement  Finance_Sales_SalesAC_PortalEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
										private static WebElement  Finance_Sales_SalesAC_PrimaryAccountdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
										private static WebElement  Finance_Sales_SalesAC_PrimanryAccountCodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
										private static WebElement  Finance_Sales_SalesAC_RateOFInterestdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
										private static WebElement  Finance_Sales_SalesAC_ReminderTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
										private static WebElement  Finance_Sales_SalesAC_SendEmaialToCustomerdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
										private static WebElement  Finance_Sales_SalesAC_TelNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
										private static WebElement  Finance_Sales_SalesAC_GropupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
										private static WebElement  Finance_Sales_SalesAC_GroupLevel1Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
										private static WebElement  Finance_Sales_SalesAC_GroupLevel2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
										private static WebElement  Finance_Sales_SalesAC_GroupLevel2Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
										private static WebElement  Finance_Sales_SalesAC_GroupLevel3draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
										private static WebElement  Finance_Sales_SalesAC_GroupLevel3Codedraganddrop;
										
						
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
							private static WebElement Finance_Sales_Header_CustomerACExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[1]/a")
										private static WebElement  Finance_Sales_CustomerAC_Namedraganddrop;
												
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[2]/a")
										private static WebElement  Finance_Sales_CustomerAC_Codedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[3]/a")
										private static WebElement  Finance_Sales_CustomerAC_Aliasdraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[4]/a")
										private static WebElement  Finance_Sales_CustomerAC_Accounttypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[5]/a")
										private static WebElement  Finance_Sales_CustomerAC_Addressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[6]/a")
										private static WebElement  Finance_Sales_CustomerAC_AllowCustomerPortaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[7]/a")
										private static WebElement  Finance_Sales_CustomerAC_BanckACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[8]/a")
										private static WebElement  Finance_Sales_CustomerAC_BankACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[9]/a")
										private static WebElement  Finance_Sales_CustomerAC_BankAccountNamedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[10]/a")
										private static WebElement  Finance_Sales_CustomerAC_BankAccountNumberdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[11]/a")
										private static WebElement  Finance_Sales_CustomerAC_ChequeDiscountLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[12]/a")
										private static WebElement  Finance_Sales_CustomerAC_City1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[13]/a")
										private static WebElement  Finance_Sales_CustomerAC_CityCode1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[14]/a")
										private static WebElement  Finance_Sales_CustomerAC_City2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[15]/a")
										private static WebElement  Finance_Sales_CustomerAC_CityCode2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[16]/a")
										private static WebElement  Finance_Sales_CustomerAC_ConsolidationMethoddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[17]/a")
										private static WebElement  Finance_Sales_CustomerAC_CreditDaysdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[18]/a")
										private static WebElement  Finance_Sales_CustomerAC_CreditLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[19]/a")
										private static WebElement  Finance_Sales_CustomerAC_DebitCreditProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[20]/a")
										private static WebElement  Finance_Sales_CustomerAC_DebitCreditRequireddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[21]/a")
										private static WebElement  Finance_Sales_CustomerAC_DefaultCurrencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[22]/a")
										private static WebElement  Finance_Sales_CustomerAC_DeliveryAddressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[23]/a")
										private static WebElement  Finance_Sales_CustomerAC_Emaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[24]/a")
										private static WebElement  Finance_Sales_CustomerAC_ExchangeAdjustGainACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[25]/a")
										private static WebElement  Finance_Sales_CustomerAC_ExchangeAdjustGainACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[26]/a")
										private static WebElement  Finance_Sales_CustomerAC_ExchangeAdjustLossACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[27]/a")
										private static WebElement  Finance_Sales_CustomerAC_ExchangeAdjustLossACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[28]/a")
										private static WebElement  Finance_Sales_CustomerAC_FaxNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[29]/a")
										private static WebElement  Finance_Sales_CustomerAC_FinanceChargeTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[30]/a")
										private static WebElement  Finance_Sales_CustomerAC_FinanaceEmaildraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[31]/a")
										private static WebElement  Finance_Sales_CustomerAC_IFSCcodedraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[32]/a")
										private static WebElement  Finance_Sales_CustomerAC_Passworddraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[33]/a")
										private static WebElement  Finance_Sales_CustomerAC_PaymentTermsdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[34]/a")
										private static WebElement  Finance_Sales_CustomerAC_PaymentTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[35]/a")
										private static WebElement  Finance_Sales_CustomerAC_PDCdiscountedACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[36]/a")
										private static WebElement  Finance_Sales_CustomerAC_PDCdiscountedACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[37]/a")
										private static WebElement  Finance_Sales_CustomerAC_Pin1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[38]/a")
										private static WebElement  Finance_Sales_CustomerAC_Pin2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[39]/a")
										private static WebElement  Finance_Sales_CustomerAC_PortalEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[40]/a")
										private static WebElement  Finance_Sales_CustomerAC_PrimaryAccountdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[41]/a")
										private static WebElement  Finance_Sales_CustomerAC_PrimanryAccountCodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[42]/a")
										private static WebElement  Finance_Sales_CustomerAC_RateOFInterestdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[43]/a")
										private static WebElement  Finance_Sales_CustomerAC_ReminderTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[44]/a")
										private static WebElement  Finance_Sales_CustomerAC_SendEmaialToCustomerdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[45]/a")
										private static WebElement  Finance_Sales_CustomerAC_TelNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[46]/a")
										private static WebElement  Finance_Sales_CustomerAC_GropupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[47]/a")
										private static WebElement  Finance_Sales_CustomerAC_GroupLevel1Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[48]/a")
										private static WebElement  Finance_Sales_CustomerAC_GroupLevel2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[49]/a")
										private static WebElement  Finance_Sales_CustomerAC_GroupLevel2Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[50]/a")
										private static WebElement  Finance_Sales_CustomerAC_GroupLevel3draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[51]/a")
										private static WebElement  Finance_Sales_CustomerAC_GroupLevel3Codedraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
							private static WebElement  Finance_Sales_Header_UpdateStockBtn;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
							private static WebElement  Finance_Sales_Header_RaiseReceiptBtn;
										
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
							private static WebElement  Finance_Sales_Header_DepartmentExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[1]/a")
										private static WebElement  Finance_Sales_Department_Namedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[2]/a")
										private static WebElement  Finance_Sales_Department_Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[3]/a")
										private static WebElement  Finance_Sales_Department_Aliasdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[4]/a")
										private static WebElement  Finance_Sales_Department_Currencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[5]/a")
										private static WebElement  Finance_Sales_Department_GroupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[6]/a")
										private static WebElement  Finance_Sales_Department_GroupLevel1Codedraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
							private static WebElement  Finance_Sales_Narrationdraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
							private static WebElement  Finance_Sales_ChequeNodraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
							private static WebElement  Finance_Sales_CreatedBydraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
							private static WebElement  Finance_Sales_Header_CreatedDateExpandBtn;	
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[1]/a")
										private static WebElement  Finance_Sales_CreatedDate_CreatedDatedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[2]/a")
										private static WebElement  Finance_Sales_CreatedDate_Yeardraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[3]/a")
										private static WebElement  Finance_Sales_CreatedDate_Monthdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[4]/a")
										private static WebElement  Finance_Sales_CreatedDate_DayofYeardraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[5]/a")
										private static WebElement  Finance_Sales_CreatedDate_Daydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[6]/a")
										private static WebElement  Finance_Sales_CreatedDate_Weekdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[7]/a")
										private static WebElement  Finance_Sales_CreatedDate_WeekDaydraganddrop;
							
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
						private static WebElement  Finance_Sales_Header_CreatedTimeExpandBtn;
						
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[1]/a")
										private static WebElement  Finance_Sales_CreatedTime_CreatedTimedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[2]/a")
										private static WebElement  Finance_Sales_CreatedTime_Hourdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[3]/a")
										private static WebElement  Finance_Sales_CreatedTime_Minutedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[4]/a")
										private static WebElement  Finance_Sales_CreatedTime_Seconddrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
						private static WebElement  Finance_Sales_Header_ModifiedBydrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
						private static WebElement  Finance_Sales_Header_ModifiedDateExpandBtn;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[1]/a")
										private static WebElement  Finance_Sales_ModifiedDate_ModifiedDatedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[2]/a")
										private static WebElement  Finance_Sales_ModifiedDate_Yeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[3]/a")
										private static WebElement  Finance_Sales_ModifiedDate_monthdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[4]/a")
										private static WebElement  Finance_Sales_ModifiedDate_DayofYeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[5]/a")
										private static WebElement  Finance_Sales_ModifiedDate_Daydrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[6]/a")
										private static WebElement  Finance_Sales_ModifiedDate_Weekdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[7]/a")
										private static WebElement  Finance_Sales_ModifiedDate_WeekDaydrapanddrop;
													
				
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
				    	private static WebElement  Finance_Sales_Header_ModifiedTimeExpandBtn;
														
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[1]/a")
										private static WebElement  Finance_Sales_ModifiedTime_ModifiedTimedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[2]/a")
										private static WebElement  Finance_Sales_ModifiedTime_Hourdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[3]/a")
										private static WebElement  Finance_Sales_ModifiedTime_Minutedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[4]/a")
										private static WebElement  Finance_Sales_ModifiedTime_Seconddrapanddrop;
								
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
						private static WebElement  Finance_Sales_Header_PrintCountdrapanddrop;	
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/a")
						private static WebElement  Finance_Sales_Header_RevisionNumberdrapanddrop;	
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[18]/a")
						private static WebElement  Finance_Sales_Header_AuthorizeStatusdrapanddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[19]/a")
				    	private static WebElement  Finance_Sales_Header_AuthorizeDateExpandBn;
														
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[19]/ul/li[1]/a")
										private static WebElement  Finance_Sales_AuthorizeDate_AuthorizeDatedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[19]/ul/li[2]/a")
										private static WebElement  Finance_Sales_AuthorizeDate_Yeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[19]/ul/li[3]/a")
										private static WebElement  Finance_Sales_AuthorizeDate_Monthdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[19]/ul/li[4]/a")
										private static WebElement  Finance_Sales_AuthorizeDate_DayofYeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[19]/ul/li[5]/a")
										private static WebElement  Finance_Sales_AuthorizedDate_Daydrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[19]/ul/li[6]/a")
										private static WebElement  Finance_Sales_AuthorizeDate_Weekdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[19]/ul/li[7]/a")
										private static WebElement  Finance_Sales_AuthorizeDate_WeekDaydrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/a")
						private static WebElement  Finance_Sales_Header_EMailCountdrapanddrop;

//----------------------------------------------------------------------------------------------------------------------------------------------
						
	// Finance Transaction sales***Sales Returns
						
				// Header Same as Sales Invoice *** named As {Finance_Sales} **(Common for Sales invoice,Sales returns,cash sales,Pos Sales)
				// Body named as PSS_Body
				// userdetails,miscellanious,company is same 		

						
//------------------------------------------------------------------------------------------------------------------------------------------			
				
	// Finance Transaction sales***Cash Sales
						
				// Header Same as Sales Invoice *** named As {Finance_Sales} **(Common for Sales invoice,Sales returns,cash sales,Pos Sales)
				// Body named as PSS_Body
				// userdetails,miscellanious,company is same 
						
						
//------/////////////////////////////////////////////////////////////////////////////////////////////////////////-------------------------------------------------------		
	///////////////////////////////////////////////////////////////////////////
						
// Finance Transaction sales***Hire Purchase Sales
						
				// Header Same as Inventory_Sales
				// Body named as PSS_Body
				// userdetails,miscellanious,company is same
						
/////////////////////////////////////////////////////////////////////////////////////		
						
						
//----------------------------------------------------------------------------------------------------------------------------------------------------							
	// Finance Transaction Journals*** Journal Entries

				// Header named as  Journals_Header  {Common for Inter,nonstandard.debitline,creditline,opening.fixed}
				// Body  named as  JournalEntries_Body		
                // userdetails,miscellanious,company is same
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
		private static WebElement  Journals_HeaderExpandBtn;
			
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
						private static WebElement  Journals_Header_DocNodraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
						private static WebElement  Journals_Header_DateExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
									private static WebElement  Journals_Datedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
									private static WebElement  Journals_Date_Yeardraganddrop;
									
									@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
									private static WebElement  Journals_Date_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
									private static WebElement  Journals_Date_DayOfYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
									private static WebElement  Journals_Date_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
									private static WebElement  Journals_Date_Weekdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
									private static WebElement  Journals_Date_WeekDaydraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
						private static WebElement  Journals_Header_TimeExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
									private static WebElement  Journals_Time_Timedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
									private static WebElement  Journals_Time_Hourdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
									private static WebElement  Journals_Time_Minutedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
									private static WebElement Journals_Time_Seconddraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
						private static WebElement  Journals_Header_DepartmentExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
									private static WebElement  Journals_Department_Namedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
									private static WebElement  Journals_Department_Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
									private static WebElement  Journals_Department_Aliasdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
									private static WebElement  Journals_Department_Currencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
									private static WebElement  Journals_Department_GroupLevel1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
									private static WebElement  Journals_Department_GroupLevel1Codedraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
						private static WebElement  Journals_Narrationdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
						private static WebElement  Journals_CreatedBydraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
						private static WebElement  Journals_Header_CreatedDateExpandBtn;	
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[1]/a")
									private static WebElement  Journals_CreatedDate_CreatedDatedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[2]/a")
									private static WebElement  Journals_CreatedDate_Yeardraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[3]/a")
									private static WebElement  Journals_CreatedDate_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[4]/a")
									private static WebElement  Journals_CreatedDate_DayofYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[5]/a")
									private static WebElement  Journals_CreatedDate_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[6]/a")
									private static WebElement  Journals_CreatedDate_Weekdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[7]/a")
									private static WebElement  Journals_CreatedDate_WeekDaydraganddrop;
						
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
					private static WebElement  Journals_Header_CreatedTimeExpandBtn;
					
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[1]/a")
									private static WebElement  Journals_CreatedTime_CreatedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[2]/a")
									private static WebElement  Journals_CreatedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[3]/a")
									private static WebElement  Journals_CreatedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[4]/a")
									private static WebElement  Journals_CreatedTime_Seconddrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
					private static WebElement  Journals_Header_ModifiedBydrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
					private static WebElement  Journals_Header_ModifiedDateExpandBtn;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[1]/a")
									private static WebElement  Journals_ModifiedDate_ModifiedDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[2]/a")
									private static WebElement  Journals_ModifiedDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[3]/a")
									private static WebElement  Journals_ModifiedDate_monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[4]/a")
									private static WebElement  Journals_ModifiedDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[5]/a")
									private static WebElement  Journals_ModifiedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[6]/a")
									private static WebElement  Journals_ModifiedDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[7]/a")
									private static WebElement  Journals_ModifiedDate_WeekDaydrapanddrop;
												
			
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
			    	private static WebElement  Journals_Header_ModifiedTimeExpandBtn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[1]/a")
									private static WebElement  Journals_ModifiedTime_ModifiedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[2]/a")
									private static WebElement  Journals_ModifiedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[3]/a")
									private static WebElement  Journals_ModifiedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[4]/a")
									private static WebElement  Journals_ModifiedTime_Seconddrapanddrop;
							
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
					private static WebElement  Journals_Header_PrintCountdrapanddrop;	
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
					private static WebElement  Journals_Header_RevisionNumberdrapanddrop;	
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
					private static WebElement  Journals_Header_AuthorizeStatusdrapanddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
			    	private static WebElement  Journals_Header_AuthorizeDateExpandBn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[1]/a")
									private static WebElement  Journals_AuthorizeDate_AuthorizeDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[2]/a")
									private static WebElement  Journals_AuthorizeDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[3]/a")
									private static WebElement  Journals_AuthorizeDate_Monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[4]/a")
									private static WebElement  Journals_AuthorizeDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[5]/a")
									private static WebElement  Journals_AuthorizedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[6]/a")
									private static WebElement  Journals_AuthorizeDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[7]/a")
									private static WebElement  Journals_AuthorizeDate_WeekDaydrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
					private static WebElement  Journals_Header_EMailCountdrapanddrop;
					

	// Journals_Body
			
			@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/a")
			private static WebElement  JournalEntriesE_BodyExpandbtn;

							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a")
							private static WebElement  JournalEntries_Body_DRAccountExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[1]/a")
										private static WebElement  JournalEntries_DRAccount_Namedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[2]/a")
										private static WebElement  JournalEntries_DRAccount_Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[3]/a")
										private static WebElement  JournalEntries_DRAccount_Aliasdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[4]/a")
										private static WebElement  JournalEntries_DRAccount_AccountTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[5]/a")
										private static WebElement  JournalEntries_DRAccount_Addressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[6]/a")
										private static WebElement  JournalEntries_DRAccount_AllowCustomerProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[7]/a")
										private static WebElement  JournalEntries_DRAccount_BankACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[8]/a")
										private static WebElement  JournalEntries_DRAccount_BankACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[9]/a")
										private static WebElement  JournalEntries_DRAccount_BankAccountNamedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[10]/a")
										private static WebElement  JournalEntries_DRAccount_BankAccountNumberdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[11]/a")
										private static WebElement  JournalEntries_DRAccount_ChequeDiscountLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[12]/a")
										private static WebElement  JournalEntries_DRAccount_City1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[13]/a")
										private static WebElement  JournalEntries_DRAccount_CityCode1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[14]/a")
										private static WebElement  JournalEntries_DRAccount_City2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[15]/a")
										private static WebElement  JournalEntries_DRAccount_CityCode2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[16]/a")
										private static WebElement  JournalEntries_DRAccount_ConsolidationMethoddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[17]/a")
										private static WebElement  JournalEntries_DRAccount_CreditDaysdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[18]/a")
										private static WebElement  JournalEntries_DRAccount_CreditLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[19]/a")
										private static WebElement  JournalEntries_DRAccount_DebitCreditProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[20]/a")
										private static WebElement  JournalEntries_DRAccount_DebitCreditRequireddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[21]/a")
										private static WebElement  JournalEntries_DRAccount_DefaultCurrencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[22]/a")
										private static WebElement  JournalEntries_DRAccount_Deliveryaddressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[23]/a")
										private static WebElement  JournalEntries_DRAccount_EMaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[24]/a")
										private static WebElement  JournalEntries_DRAccount_ExchangeAdjustmentGainACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[25]/a")
										private static WebElement  JournalEntries_DRAccount_ExchangeAdjustmentGainACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[26]/a")
										private static WebElement  JournalEntries_DRAccount_ExchangeAdjustmentLossACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[27]/a")
										private static WebElement  JournalEntries_DRAccount_ExchangeAdjustmentLossACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[28]/a")
										private static WebElement  JournalEntries_DRAccount_FaxNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[29]/a")
										private static WebElement  JournalEntries_DRAccount_FinanceChargeTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[30]/a")
										private static WebElement  JournalEntries_DRAccount_FinanceEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[31]/a")
										private static WebElement  JournalEntries_DRAccount_IFSCcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[32]/a")
										private static WebElement  JournalEntries_DRAccount_Passworddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[33]/a")
										private static WebElement  JournalEntries_DRAccount_PaymentTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[34]/a")
										private static WebElement  JournalEntries_DRAccount_PaymentTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[35]/a")
										private static WebElement  JournalEntries_DRAccount_PDCdiscountedACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[36]/a")
										private static WebElement  JournalEntries_DRAccount_PDCdiscountedACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[37]/a")
										private static WebElement  JournalEntries_DRAccount_Pin1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[38]/a")
										private static WebElement  JournalEntries_DRAccount_Pin2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[39]/a")
										private static WebElement  JournalEntries_DRAccount_PortalEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[40]/a")
										private static WebElement  JournalEntries_DRAccount_PrimaryAccountdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[41]/a")
										private static WebElement  JournalEntries_DRAccount_PrimaryAccountCodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[42]/a")
										private static WebElement  JournalEntries_DRAccount_RateOfInterestdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[43]/a")
										private static WebElement  JournalEntries_DRAccount_ReminderTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[44]/a")
										private static WebElement  JournalEntries_DRAccount_SendEmailToCustomerdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[45]/a")
										private static WebElement  JournalEntries_DRAccount_TelNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[46]/a")
										private static WebElement  JournalEntries_DRAccount_GroupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[47]/a")
										private static WebElement  JournalEntries_DRAccount_GroupLevel1Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[48]/a")
										private static WebElement  JournalEntries_DRAccount_GroupLevel2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[49]/a")
										private static WebElement  JournalEntries_DRAccount_GroupLevel2Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[50]/a")
										private static WebElement  JournalEntries_DRAccount_GroupLevel3draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[51]/a")
										private static WebElement  JournalEntries_DRAccount_GroupLevel3Codedraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
							private static WebElement  JournalEntries_Body_CRAccountExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[1]/a")
										private static WebElement  JournalEntries_CRAccount_Namedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[2]/a")
										private static WebElement  JournalEntries_CRAccount_Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[3]/a")
										private static WebElement  JournalEntries_CRAccount_Aliasdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[4]/a")
										private static WebElement  JournalEntries_CRAccount_AccountTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[5]/a")
										private static WebElement  JournalEntries_CRAccount_Addressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[6]/a")
										private static WebElement  JournalEntries_CRAccount_AllowCustomerProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[7]/a")
										private static WebElement  JournalEntries_CRAccount_BankACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[8]/a")
										private static WebElement  JournalEntries_CRAccount_BankACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[9]/a")
										private static WebElement  JournalEntries_CRAccount_BankAccountNamedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[10]/a")
										private static WebElement  JournalEntries_CRAccount_BankAccountNumberdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[11]/a")
										private static WebElement  JournalEntries_CRAccount_ChequeDiscountLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[12]/a")
										private static WebElement  JournalEntries_CRAccount_City1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[13]/a")
										private static WebElement  JournalEntries_CRAccount_CityCode1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[14]/a")
										private static WebElement  JournalEntries_CRAccount_City2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[15]/a")
										private static WebElement  JournalEntries_CRAccount_CityCode2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[16]/a")
										private static WebElement  JournalEntries_CRAccount_ConsolidationMethoddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[17]/a")
										private static WebElement  JournalEntries_CRAccount_CreditDaysdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[18]/a")
										private static WebElement  JournalEntries_CRAccount_CreditLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[19]/a")
										private static WebElement  JournalEntries_CRAccount_DebitCreditProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[20]/a")
										private static WebElement  JournalEntries_CRAccount_DebitCreditRequireddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[21]/a")
										private static WebElement  JournalEntries_CRAccount_DefaultCurrencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[22]/a")
										private static WebElement  JournalEntries_CRAccount_Deliveryaddressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[23]/a")
										private static WebElement  JournalEntries_CRAccount_EMaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[24]/a")
										private static WebElement  JournalEntries_CRAccount_ExchangeAdjustmentGainACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[25]/a")
										private static WebElement  JournalEntries_CRAccount_ExchangeAdjustmentGainACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[26]/a")
										private static WebElement  JournalEntries_CRAccount_ExchangeAdjustmentLossACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[27]/a")
										private static WebElement  JournalEntries_CRAccount_ExchangeAdjustmentLossACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[28]/a")
										private static WebElement  JournalEntries_CRAccount_FaxNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[29]/a")
										private static WebElement  JournalEntries_CRAccount_FinanceChargeTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[30]/a")
										private static WebElement  JournalEntries_CRAccount_FinanceEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[31]/a")
										private static WebElement  JournalEntries_CRAccount_IFSCcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[32]/a")
										private static WebElement  JournalEntries_CRAccount_Passworddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[33]/a")
										private static WebElement  JournalEntries_CRAccount_PaymentTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[34]/a")
										private static WebElement  JournalEntries_CRAccount_PaymentTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[35]/a")
										private static WebElement  JournalEntries_CRAccount_PDCdiscountedACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[36]/a")
										private static WebElement  JournalEntries_CRAccount_PDCdiscountedACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[37]/a")
										private static WebElement  JournalEntries_CRAccount_Pin1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[38]/a")
										private static WebElement  JournalEntries_CRAccount_Pin2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[39]/a")
										private static WebElement  JournalEntries_CRAccount_PortalEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[40]/a")
										private static WebElement  JournalEntries_CRAccount_PrimaryAccountdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[41]/a")
										private static WebElement  JournalEntries_CRAccount_PrimaryAccountCodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[42]/a")
										private static WebElement  JournalEntries_CRAccount_RateOfInterestdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[43]/a")
										private static WebElement  JournalEntries_CRAccount_ReminderTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[44]/a")
										private static WebElement  JournalEntries_CRAccount_SendEmailToCustomerdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[45]/a")
										private static WebElement  JournalEntries_CRAccount_TelNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[46]/a")
										private static WebElement  JournalEntries_CRAccount_GroupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[47]/a")
										private static WebElement  JournalEntries_CRAccount_GroupLevel1Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[48]/a")
										private static WebElement  JournalEntries_CRAccount_GroupLevel2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[49]/a")
										private static WebElement  JournalEntries_CRAccount_GroupLevel2Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[50]/a")
										private static WebElement  JournalEntries_CRAccount_GroupLevel3draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[51]/a")
										private static WebElement  JournalEntries_CRAccount_GroupLevel3Codedraganddrop;
								
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
							private static WebElement  JournalEntries_Body_Amountdraganddrop;	
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a")
							private static WebElement  JournalEntries_Body_Referencedraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a")
							private static WebElement  JournalEntries_Body_Netdraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[6]/a")
							private static WebElement  JournalEntries_Body_NetBaseCurrencydraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[7]/a")
							private static WebElement  JournalEntries_Body_NetLocalCurrencydraganddrop;
				
				
//-------------------------------------------------------------------------------------------------------------------------------------------------						
						
	// Finance Transaction Journals*** ForexJV
				// Header named as ForexJV_Header
				// Body named as  ForexJV_Body				
				//userdetails,miscellanious,company is same
								
								
			// ForexJV_Header
			@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
			private static WebElement  ForexJV_HeaderExpandBtn;
				
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
							private static WebElement  ForexJV_Header_DocNodraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
							private static WebElement  ForexJV_Header_DateExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
										private static WebElement  ForexJV_Datedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
										private static WebElement  ForexJV_Date_Yeardraganddrop;
										
										@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
										private static WebElement  ForexJV_Date_Monthdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
										private static WebElement  ForexJV_Date_DayOfYeardraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
										private static WebElement  ForexJV_Date_Daydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
										private static WebElement  ForexJV_Date_Weekdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
										private static WebElement  ForexJV_Date_WeekDaydraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
							private static WebElement  ForexJV_Header_TimeExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
										private static WebElement  ForexJV_Time_Timedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
										private static WebElement  ForexJV_Time_Hourdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
										private static WebElement  ForexJV_Time_Minutedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
										private static WebElement ForexJV_Time_Seconddraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
							private static WebElement ForexJV_Header_AccountExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
										private static WebElement  Account_Namedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
										private static WebElement  Account_Codedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
										private static WebElement  Account_Aliasdraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
										private static WebElement  Account_Accounttypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
										private static WebElement  Account_Addressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
										private static WebElement  Account_AllowCustomerPortaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
										private static WebElement  Account_BanckACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
										private static WebElement  Account_BankACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
										private static WebElement  Account_BankAccountNamedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
										private static WebElement  Account_BankAccountNumberdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
										private static WebElement  Account_ChequeDiscountLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
										private static WebElement  Account_City1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
										private static WebElement  Account_CityCode1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
										private static WebElement  Account_City2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
										private static WebElement  Account_CityCode2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
										private static WebElement  Account_ConsolidationMethoddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
										private static WebElement  Account_CreditDaysdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
										private static WebElement  Account_CreditLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
										private static WebElement  Account_DebitCreditProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
										private static WebElement  Account_DebitCreditRequireddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
										private static WebElement  Account_DefaultCurrencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
										private static WebElement  Account_DeliveryAddressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
										private static WebElement  Account_Emaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
										private static WebElement  Account_ExchangeAdjustGainACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
										private static WebElement  Account_ExchangeAdjustGainACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
										private static WebElement  Account_ExchangeAdjustLossACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
										private static WebElement  Account_ExchangeAdjustLossACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
										private static WebElement  Account_FaxNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
										private static WebElement  Account_FinanceChargeTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
										private static WebElement  Account_FinanaceEmaildraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
										private static WebElement  Account_IFSCcodedraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
										private static WebElement  Account_Passworddraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
										private static WebElement  Account_PaymentTermsdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
										private static WebElement  Account_PaymentTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
										private static WebElement  Account_PDCdiscountedACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
										private static WebElement  Account_PDCdiscountedACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
										private static WebElement  Account_Pin1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
										private static WebElement  Account_Pin2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
										private static WebElement  Account_PortalEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
										private static WebElement  Account_PrimaryAccountdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
										private static WebElement  Account_PrimanryAccountCodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
										private static WebElement  Account_RateOFInterestdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
										private static WebElement  Account_ReminderTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
										private static WebElement  Account_SendEmaialToCustomerdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
										private static WebElement  Account_TelNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
										private static WebElement  Account_GropupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
										private static WebElement  Account_GroupLevel1Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
										private static WebElement  Account_GroupLevel2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
										private static WebElement  Account_GroupLevel2Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
										private static WebElement  Account_GroupLevel3draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
										private static WebElement  Account_GroupLevel3Codedraganddrop;
										
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
						private static WebElement  ForexJV_Header_DepartmentExpandBtn;		
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[1]/a")
										private static WebElement  ForexJV_Department_Namedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[2]/a")
										private static WebElement  ForexJV_Department_Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[3]/a")
										private static WebElement  ForexJV_Department_Aliasdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[4]/a")
										private static WebElement  ForexJV_Department_Currencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[5]/a")
										private static WebElement  ForexJV_Department_GroupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[6]/a")
										private static WebElement  ForexJV_Department_GroupLevel1Codedraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
							private static WebElement  ForexJV_Narrationdraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
							private static WebElement  ForexJV_CreatedBydraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
							private static WebElement  ForexJV_Header_CreatedDateExpandBtn;	
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[1]/a")
										private static WebElement  ForexJV_CreatedDate_CreatedDatedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[2]/a")
										private static WebElement  ForexJV_CreatedDate_Yeardraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[3]/a")
										private static WebElement  ForexJV_CreatedDate_Monthdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[4]/a")
										private static WebElement  ForexJV_CreatedDate_DayofYeardraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[5]/a")
										private static WebElement  ForexJV_CreatedDate_Daydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[6]/a")
										private static WebElement  ForexJV_CreatedDate_Weekdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[7]/a")
										private static WebElement  ForexJV_CreatedDate_WeekDaydraganddrop;
							
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
						private static WebElement  ForexJV_Header_CreatedTimeExpandBtn;
						
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[1]/a")
										private static WebElement  ForexJV_CreatedTime_CreatedTimedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[2]/a")
										private static WebElement  ForexJV_CreatedTime_Hourdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[3]/a")
										private static WebElement  ForexJV_CreatedTime_Minutedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[4]/a")
										private static WebElement  ForexJV_CreatedTime_Seconddrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
						private static WebElement  ForexJV_Header_ModifiedBydrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
						private static WebElement  ForexJV_Header_ModifiedDateExpandBtn;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[1]/a")
										private static WebElement  ForexJV_ModifiedDate_ModifiedDatedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[2]/a")
										private static WebElement  ForexJV_ModifiedDate_Yeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[3]/a")
										private static WebElement  ForexJV_ModifiedDate_monthdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[4]/a")
										private static WebElement  ForexJV_ModifiedDate_DayofYeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[5]/a")
										private static WebElement  ForexJV_ModifiedDate_Daydrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[6]/a")
										private static WebElement  ForexJV_ModifiedDate_Weekdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[7]/a")
										private static WebElement  ForexJV_ModifiedDate_WeekDaydrapanddrop;
													
				
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
				    	private static WebElement  ForexJV_Header_ModifiedTimeExpandBtn;
														
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[1]/a")
										private static WebElement  ForexJV_ModifiedTime_ModifiedTimedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[2]/a")
										private static WebElement  ForexJV_ModifiedTime_Hourdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[3]/a")
										private static WebElement  ForexJV_ModifiedTime_Minutedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[4]/a")
										private static WebElement  ForexJV_ModifiedTime_Seconddrapanddrop;
								
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
						private static WebElement  ForexJV_Header_PrintCountdrapanddrop;	
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
						private static WebElement  ForexJV_Header_RevisionNumberdrapanddrop;	
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
						private static WebElement  ForexJV_Header_AuthorizeStatusdrapanddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
				    	private static WebElement  ForexJV_Header_AuthorizeDateExpandBn;
														
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[1]/a")
										private static WebElement  ForexJV_AuthorizeDate_AuthorizeDatedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[2]/a")
										private static WebElement  ForexJV_AuthorizeDate_Yeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[3]/a")
										private static WebElement  ForexJV_AuthorizeDate_Monthdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[4]/a")
										private static WebElement  ForexJV_AuthorizeDate_DayofYeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[5]/a")
										private static WebElement  ForexJV_AuthorizedDate_Daydrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[6]/a")
										private static WebElement  ForexJV_AuthorizeDate_Weekdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[7]/a")
										private static WebElement  ForexJV_AuthorizeDate_WeekDaydrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/a")
						private static WebElement  ForexJV_Header_EMailCountdrapanddrop;
							
						
	// ForexJV_Body
						
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/a")
		private static WebElement  ForexJV_BodyExpandbtn;

					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a")
					private static WebElement  ForexJV_Body_Account22ExpandBtn;
					
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[1]/a")
								private static WebElement  ForexJV_Account2_Namedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[2]/a")
								private static WebElement  ForexJV_Account2_Codedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[3]/a")
								private static WebElement  ForexJV_Account2_Aliasdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[4]/a")
								private static WebElement  ForexJV_Account2_AccountTypedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[5]/a")
								private static WebElement  ForexJV_Account2_Addressdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[6]/a")
								private static WebElement  ForexJV_Account2_AllowCustomerProposaldraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[7]/a")
								private static WebElement  ForexJV_Account2_BankACdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[8]/a")
								private static WebElement  ForexJV_Account2_BankACcodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[9]/a")
								private static WebElement  ForexJV_Account2_BankAccountNamedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[10]/a")
								private static WebElement  ForexJV_Account2_BankAccountNumberdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[11]/a")
								private static WebElement  ForexJV_Account2_ChequeDiscountLimitdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[12]/a")
								private static WebElement  ForexJV_Account2_City1draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[13]/a")
								private static WebElement  ForexJV_Account2_CityCode1draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[14]/a")
								private static WebElement  ForexJV_Account2_City2draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[15]/a")
								private static WebElement  ForexJV_Account2_CityCode2draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[16]/a")
								private static WebElement  ForexJV_Account2_ConsolidationMethoddraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[17]/a")
								private static WebElement  ForexJV_Account2_CreditDaysdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[18]/a")
								private static WebElement  ForexJV_Account2_CreditLimitdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[19]/a")
								private static WebElement  ForexJV_Account2_DebitCreditProposaldraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[20]/a")
								private static WebElement  ForexJV_Account2_DebitCreditRequireddraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[21]/a")
								private static WebElement  ForexJV_Account2_DefaultCurrencydraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[22]/a")
								private static WebElement  ForexJV_Account2_Deliveryaddressdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[23]/a")
								private static WebElement  ForexJV_Account2_EMaildraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[24]/a")
								private static WebElement  ForexJV_Account2_ExchangeAdjustmentGainACdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[25]/a")
								private static WebElement  ForexJV_Account2_ExchangeAdjustmentGainACcodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[26]/a")
								private static WebElement  ForexJV_Account2_ExchangeAdjustmentLossACdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[27]/a")
								private static WebElement  ForexJV_Account2_ExchangeAdjustmentLossACcodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[28]/a")
								private static WebElement  ForexJV_Account2_FaxNodraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[29]/a")
								private static WebElement  ForexJV_Account2_FinanceChargeTermsdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[30]/a")
								private static WebElement  ForexJV_Account2_FinanceEmaildraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[31]/a")
								private static WebElement  ForexJV_Account2_IFSCcodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[32]/a")
								private static WebElement  ForexJV_Account2_Passworddraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[33]/a")
								private static WebElement  ForexJV_Account2_PaymentTermsdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[34]/a")
								private static WebElement  ForexJV_Account2_PaymentTypedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[35]/a")
								private static WebElement  ForexJV_Account2_PDCdiscountedACdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[36]/a")
								private static WebElement  ForexJV_Account2_PDCdiscountedACcodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[37]/a")
								private static WebElement  ForexJV_Account2_Pin1draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[38]/a")
								private static WebElement  ForexJV_Account2_Pin2draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[39]/a")
								private static WebElement  ForexJV_Account2_PortalEmaildraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[40]/a")
								private static WebElement  ForexJV_Account2_PrimaryAccountdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[41]/a")
								private static WebElement  ForexJV_Account2_PrimaryAccountCodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[42]/a")
								private static WebElement  ForexJV_Account2_RateOfInterestdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[43]/a")
								private static WebElement  ForexJV_Account2_ReminderTermsdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[44]/a")
								private static WebElement  ForexJV_Account2_SendEmailToCustomerdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[45]/a")
								private static WebElement  ForexJV_Account2_TelNodraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[46]/a")
								private static WebElement  ForexJV_Account2_GroupLevel1draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[47]/a")
								private static WebElement  ForexJV_Account2_GroupLevel1Codedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[48]/a")
								private static WebElement  ForexJV_Account2_GroupLevel2draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[49]/a")
								private static WebElement  ForexJV_Account2_GroupLevel2Codedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[50]/a")
								private static WebElement  ForexJV_Account2_GroupLevel3draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[51]/a")
								private static WebElement  ForexJV_Account2_GroupLevel3Codedraganddrop;
								
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
					private static WebElement  ForexJV_Body_Debitdraganddrop;
								
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
					private static WebElement  ForexJV_Body_Creditdraganddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a")
					private static WebElement  ForexJV_Body_Referencedraganddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a")
					private static WebElement  ForexJV_Body_Netdraganddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[6]/a")
					private static WebElement  ForexJV_Body_NetBaseCurrencydraganddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[7]/a")
					private static WebElement  ForexJV_Body_NetLocalCurrencydraganddrop;
					
		
//-------------------------------------------------------------------------------------------------------------------------------------------------						
					
// Finance Transaction Journals*** InterDepartmentalJV
			// Header named as Journal_Header   (Same As Journal entries) 
			// Body same as Journals_Body				
			//userdetails,miscellanious,company is same					
						
		
			// Journals_Body
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/a")
		private static WebElement  Journals_BodyExpandbtn;

					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a")
					private static WebElement  Journals_Body_AccountExpandBtn;
					
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[1]/a")
								private static WebElement  Journals_Account_Namedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[2]/a")
								private static WebElement  Journals_Account_Codedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[3]/a")
								private static WebElement  Journals_Account_Aliasdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[4]/a")
								private static WebElement  Journals_Account_AccountTypedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[5]/a")
								private static WebElement  Journals_Account_Addressdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[6]/a")
								private static WebElement  Journals_Account_AllowCustomerProposaldraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[7]/a")
								private static WebElement  Journals_Account_BankACdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[8]/a")
								private static WebElement  Journals_Account_BankACcodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[9]/a")
								private static WebElement  Journals_Account_BankAccountNamedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[10]/a")
								private static WebElement  Journals_Account_BankAccountNumberdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[11]/a")
								private static WebElement  Journals_Account_ChequeDiscountLimitdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[12]/a")
								private static WebElement  Journals_Account_City1draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[13]/a")
								private static WebElement  Journals_Account_CityCode1draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[14]/a")
								private static WebElement  Journals_Account_City2draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[15]/a")
								private static WebElement  Journals_Account_CityCode2draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[16]/a")
								private static WebElement  Journals_Account_ConsolidationMethoddraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[17]/a")
								private static WebElement  Journals_Account_CreditDaysdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[18]/a")
								private static WebElement  Journals_Account_CreditLimitdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[19]/a")
								private static WebElement  Journals_Account_DebitCreditProposaldraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[20]/a")
								private static WebElement  Journals_Account_DebitCreditRequireddraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[21]/a")
								private static WebElement  Journals_Account_DefaultCurrencydraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[22]/a")
								private static WebElement  Journals_Account_Deliveryaddressdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[23]/a")
								private static WebElement  Journals_Account_EMaildraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[24]/a")
								private static WebElement  Journals_Account_ExchangeAdjustmentGainACdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[25]/a")
								private static WebElement  Journals_Account_ExchangeAdjustmentGainACcodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[26]/a")
								private static WebElement  Journals_Account_ExchangeAdjustmentLossACdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[27]/a")
								private static WebElement  Journals_Account_ExchangeAdjustmentLossACcodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[28]/a")
								private static WebElement  Journals_Account_FaxNodraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[29]/a")
								private static WebElement  Journals_Account_FinanceChargeTermsdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[30]/a")
								private static WebElement  Journals_Account_FinanceEmaildraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[31]/a")
								private static WebElement  Journals_Account_IFSCcodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[32]/a")
								private static WebElement  Journals_Account_Passworddraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[33]/a")
								private static WebElement  Journals_Account_PaymentTermsdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[34]/a")
								private static WebElement  Journals_Account_PaymentTypedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[35]/a")
								private static WebElement  Journals_Account_PDCdiscountedACdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[36]/a")
								private static WebElement  Journals_Account_PDCdiscountedACcodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[37]/a")
								private static WebElement  Journals_Account_Pin1draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[38]/a")
								private static WebElement  Journals_Account_Pin2draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[39]/a")
								private static WebElement  Journals_Account_PortalEmaildraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[40]/a")
								private static WebElement  Journals_Account_PrimaryAccountdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[41]/a")
								private static WebElement  Journals_Account_PrimaryAccountCodedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[42]/a")
								private static WebElement  Journals_Account_RateOfInterestdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[43]/a")
								private static WebElement  Journals_Account_ReminderTermsdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[44]/a")
								private static WebElement  Journals_Account_SendEmailToCustomerdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[45]/a")
								private static WebElement  Journals_Account_TelNodraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[46]/a")
								private static WebElement  Journals_Account_GroupLevel1draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[47]/a")
								private static WebElement  Journals_Account_GroupLevel1Codedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[48]/a")
								private static WebElement  Journals_Account_GroupLevel2draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[49]/a")
								private static WebElement  Journals_Account_GroupLevel2Codedraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[50]/a")
								private static WebElement  Journals_Account_GroupLevel3draganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[51]/a")
								private static WebElement  Journals_Account_GroupLevel3Codedraganddrop;
								
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
					private static WebElement  Journals_Body_Debitdraganddrop;
								
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
					private static WebElement  Journals_Body_Creditdraganddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a")
					private static WebElement  Journals_Body_Referencedraganddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a")
					private static WebElement  Journals_Body_Netdraganddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[6]/a")
					private static WebElement  Journals_Body_NetBaseCurrencydraganddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[7]/a")
					private static WebElement  Journals_Body_NetLocalCurrencydraganddrop;
						
//-------------------------------------------------------------------------------------------------------------------------------------------------						
				
	// Finance Transaction Journals*** NonStandardJournalEntries
					// Header named as Journal_Header   (Same As Journal entries) 
					// Body named as  NonStandardJournal_Body				
					//userdetails,miscellanious,company is same						

			// NonStandardJournal_Body
			@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/a")
			private static WebElement  NonStandardJournal_BodyExpandbtn;

						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a")
						private static WebElement  NonStandardJournal_Body_AccountExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[1]/a")
									private static WebElement  NonStandardJournal_Account_Namedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[2]/a")
									private static WebElement  NonStandardJournal_Account_Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[3]/a")
									private static WebElement  NonStandardJournal_Account_Aliasdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[4]/a")
									private static WebElement  NonStandardJournal_Account_AccountTypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[5]/a")
									private static WebElement  NonStandardJournal_Account_Addressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[6]/a")
									private static WebElement  NonStandardJournal_Account_AllowCustomerProposaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[7]/a")
									private static WebElement  NonStandardJournal_Account_BankACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[8]/a")
									private static WebElement  NonStandardJournal_Account_BankACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[9]/a")
									private static WebElement  NonStandardJournal_Account_BankAccountNamedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[10]/a")
									private static WebElement  NonStandardJournal_Account_BankAccountNumberdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[11]/a")
									private static WebElement  NonStandardJournal_Account_ChequeDiscountLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[12]/a")
									private static WebElement  NonStandardJournal_Account_City1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[13]/a")
									private static WebElement  NonStandardJournal_Account_CityCode1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[14]/a")
									private static WebElement  NonStandardJournal_Account_City2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[15]/a")
									private static WebElement  NonStandardJournal_Account_CityCode2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[16]/a")
									private static WebElement  NonStandardJournal_Account_ConsolidationMethoddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[17]/a")
									private static WebElement  NonStandardJournal_Account_CreditDaysdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[18]/a")
									private static WebElement  NonStandardJournal_Account_CreditLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[19]/a")
									private static WebElement  NonStandardJournal_Account_DebitCreditProposaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[20]/a")
									private static WebElement  NonStandardJournal_Account_DebitCreditRequireddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[21]/a")
									private static WebElement  NonStandardJournal_Account_DefaultCurrencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[22]/a")
									private static WebElement  NonStandardJournal_Account_Deliveryaddressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[23]/a")
									private static WebElement  NonStandardJournal_Account_EMaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[24]/a")
									private static WebElement  NonStandardJournal_Account_ExchangeAdjustmentGainACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[25]/a")
									private static WebElement  NonStandardJournal_Account_ExchangeAdjustmentGainACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[26]/a")
									private static WebElement  NonStandardJournal_Account_ExchangeAdjustmentLossACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[27]/a")
									private static WebElement  NonStandardJournal_Account_ExchangeAdjustmentLossACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[28]/a")
									private static WebElement  NonStandardJournal_Account_FaxNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[29]/a")
									private static WebElement  NonStandardJournal_Account_FinanceChargeTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[30]/a")
									private static WebElement  NonStandardJournal_Account_FinanceEmaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[31]/a")
									private static WebElement  NonStandardJournal_Account_IFSCcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[32]/a")
									private static WebElement  NonStandardJournal_Account_Passworddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[33]/a")
									private static WebElement  NonStandardJournal_Account_PaymentTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[34]/a")
									private static WebElement  NonStandardJournal_Account_PaymentTypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[35]/a")
									private static WebElement  NonStandardJournal_Account_PDCdiscountedACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[36]/a")
									private static WebElement  NonStandardJournal_Account_PDCdiscountedACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[37]/a")
									private static WebElement  NonStandardJournal_Account_Pin1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[38]/a")
									private static WebElement  NonStandardJournal_Account_Pin2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[39]/a")
									private static WebElement  NonStandardJournal_Account_PortalEmaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[40]/a")
									private static WebElement  NonStandardJournal_Account_PrimaryAccountdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[41]/a")
									private static WebElement  NonStandardJournal_Account_PrimaryAccountCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[42]/a")
									private static WebElement  NonStandardJournal_Account_RateOfInterestdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[43]/a")
									private static WebElement  NonStandardJournal_Account_ReminderTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[44]/a")
									private static WebElement  NonStandardJournal_Account_SendEmailToCustomerdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[45]/a")
									private static WebElement  NonStandardJournal_Account_TelNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[46]/a")
									private static WebElement  NonStandardJournal_Account_GroupLevel1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[47]/a")
									private static WebElement  NonStandardJournal_Account_GroupLevel1Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[48]/a")
									private static WebElement  NonStandardJournal_Account_GroupLevel2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[49]/a")
									private static WebElement  NonStandardJournal_Account_GroupLevel2Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[50]/a")
									private static WebElement  NonStandardJournal_Account_GroupLevel3draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[51]/a")
									private static WebElement  NonStandardJournal_Account_GroupLevel3Codedraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
						private static WebElement  NonStandardJournal_Body_Debitdraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
						private static WebElement  NonStandardJournal_Body_Creditdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a")
						private static WebElement  NonStandardJournal_Body_Referencedraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a")
						private static WebElement  NonStandardJournal_Body_Remarksraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[6]/a")
						private static WebElement  NonStandardJournal_Body_Netdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[7]/a")
						private static WebElement  NonStandardJournal_Body_NetBaseCurrencydraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[8]/a")
						private static WebElement  NonStandardJournal_Body_NetLocalCurrencydraganddrop;
				
//-------------------------------------------------------------------------------------------------------------------------------------------------						
				
	// Finance Transaction Journals*** DebitNotes
					// Header named as DebitNotes_Header   
					// Body named as  DebitNotes_Body				
					//userdetails,miscellanious,company is same				
			
			

			//DebitNotes_Header
			
			@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
			private static WebElement  DebitNotes_HeaderExpandBtn;
				
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
							private static WebElement  DebitNotes_Header_DocNodraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
							private static WebElement  DebitNotes_Header_DateExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
										private static WebElement  DebitNotes_Datedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
										private static WebElement  DebitNotes_Date_Yeardraganddrop;
										
										@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
										private static WebElement  DebitNotes_Date_Monthdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
										private static WebElement  DebitNotes_Date_DayOfYeardraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
										private static WebElement  DebitNotes_Date_Daydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
										private static WebElement  DebitNotes_Date_Weekdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
										private static WebElement  DebitNotes_Date_WeekDaydraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
							private static WebElement  DebitNotes_Header_TimeExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
										private static WebElement  DebitNotes_Time_Timedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
										private static WebElement  DebitNotes_Time_Hourdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
										private static WebElement  DebitNotes_Time_Minutedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
										private static WebElement DebitNotes_Time_Seconddraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
							private static WebElement DebitNotes_Header_DRAccountExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
										private static WebElement  DRAccount_Namedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
										private static WebElement  DRAccount_Codedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
										private static WebElement  DRAccount_Aliasdraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
										private static WebElement  DRAccount_Accounttypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
										private static WebElement  DRAccount_Addressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
										private static WebElement  DRAccount_AllowCustomerPortaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
										private static WebElement  DRAccount_BanckACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
										private static WebElement  DRAccount_BankACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
										private static WebElement  DRAccount_BankAccountNamedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
										private static WebElement  DRAccount_BankAccountNumberdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
										private static WebElement  DRAccount_ChequeDiscountLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
										private static WebElement  DRAccount_City1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
										private static WebElement  DRAccount_CityCode1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
										private static WebElement  DRAccount_City2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
										private static WebElement  DRAccount_CityCode2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
										private static WebElement  DRAccount_ConsolidationMethoddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
										private static WebElement  DRAccount_CreditDaysdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
										private static WebElement  DRAccount_CreditLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
										private static WebElement  DRAccount_DebitCreditProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
										private static WebElement  DRAccount_DebitCreditRequireddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
										private static WebElement  DRAccount_DefaultCurrencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
										private static WebElement  DRAccount_DeliveryAddressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
										private static WebElement  DRAccount_Emaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
										private static WebElement  DRAccount_ExchangeAdjustGainACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
										private static WebElement  DRAccount_ExchangeAdjustGainACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
										private static WebElement  DRAccount_ExchangeAdjustLossACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
										private static WebElement  DRAccount_ExchangeAdjustLossACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
										private static WebElement  DRAccount_FaxNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
										private static WebElement  DRAccount_FinanceChargeTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
										private static WebElement  DRAccount_FinanaceEmaildraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
										private static WebElement  DRAccount_IFSCcodedraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
										private static WebElement  DRAccount_Passworddraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
										private static WebElement  DRAccount_PaymentTermsdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
										private static WebElement  DRAccount_PaymentTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
										private static WebElement  DRAccount_PDCdiscountedACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
										private static WebElement  DRAccount_PDCdiscountedACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
										private static WebElement  DRAccount_Pin1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
										private static WebElement  DRAccount_Pin2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
										private static WebElement  DRAccount_PortalEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
										private static WebElement  DRAccount_PrimaryAccountdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
										private static WebElement  DRAccount_PrimanryAccountCodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
										private static WebElement  DRAccount_RateOFInterestdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
										private static WebElement  DRAccount_ReminderTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
										private static WebElement  DRAccount_SendEmaialToCustomerdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
										private static WebElement  DRAccount_TelNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
										private static WebElement  DRAccount_GropupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
										private static WebElement  DRAccount_GroupLevel1Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
										private static WebElement  DRAccount_GroupLevel2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
										private static WebElement  DRAccount_GroupLevel2Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
										private static WebElement  DRAccount_GroupLevel3draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
										private static WebElement  DRAccount_GroupLevel3Codedraganddrop;
										
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
						private static WebElement  DebitNotes_Header_DepartmentExpandBtn;		
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[1]/a")
										private static WebElement  DebitNotes_Department_Namedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[2]/a")
										private static WebElement  DebitNotes_Department_Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[3]/a")
										private static WebElement  DebitNotes_Department_Aliasdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[4]/a")
										private static WebElement  DebitNotes_Department_Currencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[5]/a")
										private static WebElement  DebitNotes_Department_GroupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[6]/a")
										private static WebElement  DebitNotes_Department_GroupLevel1Codedraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
							private static WebElement  DebitNotes_Narrationdraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
							private static WebElement  DebitNotes_CreatedBydraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
							private static WebElement  DebitNotes_Header_CreatedDateExpandBtn;	
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[1]/a")
										private static WebElement  DebitNotes_CreatedDate_CreatedDatedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[2]/a")
										private static WebElement  DebitNotes_CreatedDate_Yeardraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[3]/a")
										private static WebElement  DebitNotes_CreatedDate_Monthdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[4]/a")
										private static WebElement  DebitNotes_CreatedDate_DayofYeardraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[5]/a")
										private static WebElement  DebitNotes_CreatedDate_Daydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[6]/a")
										private static WebElement  DebitNotes_CreatedDate_Weekdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[7]/a")
										private static WebElement  DebitNotes_CreatedDate_WeekDaydraganddrop;
							
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
						private static WebElement  DebitNotes_Header_CreatedTimeExpandBtn;
						
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[1]/a")
										private static WebElement  DebitNotes_CreatedTime_CreatedTimedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[2]/a")
										private static WebElement  DebitNotes_CreatedTime_Hourdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[3]/a")
										private static WebElement  DebitNotes_CreatedTime_Minutedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[4]/a")
										private static WebElement  DebitNotes_CreatedTime_Seconddrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
						private static WebElement  DebitNotes_Header_ModifiedBydrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
						private static WebElement  DebitNotes_Header_ModifiedDateExpandBtn;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[1]/a")
										private static WebElement  DebitNotes_ModifiedDate_ModifiedDatedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[2]/a")
										private static WebElement  DebitNotes_ModifiedDate_Yeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[3]/a")
										private static WebElement  DebitNotes_ModifiedDate_monthdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[4]/a")
										private static WebElement  DebitNotes_ModifiedDate_DayofYeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[5]/a")
										private static WebElement  DebitNotes_ModifiedDate_Daydrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[6]/a")
										private static WebElement  DebitNotes_ModifiedDate_Weekdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[7]/a")
										private static WebElement  DebitNotes_ModifiedDate_WeekDaydrapanddrop;
													
				
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
				    	private static WebElement  DebitNotes_Header_ModifiedTimeExpandBtn;
														
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[1]/a")
										private static WebElement  DebitNotes_ModifiedTime_ModifiedTimedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[2]/a")
										private static WebElement  DebitNotes_ModifiedTime_Hourdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[3]/a")
										private static WebElement  DebitNotes_ModifiedTime_Minutedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[4]/a")
										private static WebElement  DebitNotes_ModifiedTime_Seconddrapanddrop;
								
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
						private static WebElement  DebitNotes_Header_PrintCountdrapanddrop;	
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
						private static WebElement  DebitNotes_Header_RevisionNumberdrapanddrop;	
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
						private static WebElement  DebitNotes_Header_AuthorizeStatusdrapanddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
				    	private static WebElement  DebitNotes_Header_AuthorizeDateExpandBn;
														
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[1]/a")
										private static WebElement  DebitNotes_AuthorizeDate_AuthorizeDatedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[2]/a")
										private static WebElement  DebitNotes_AuthorizeDate_Yeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[3]/a")
										private static WebElement  DebitNotes_AuthorizeDate_Monthdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[4]/a")
										private static WebElement  DebitNotes_AuthorizeDate_DayofYeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[5]/a")
										private static WebElement  DebitNotes_AuthorizedDate_Daydrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[6]/a")
										private static WebElement  DebitNotes_AuthorizeDate_Weekdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[7]/a")
										private static WebElement  DebitNotes_AuthorizeDate_WeekDaydrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/a")
						private static WebElement  DebitNotes_Header_EMailCountdrapanddrop;
						
						
		// DebitNotes_Body
			
			  
				@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/a")
				private static WebElement  DebitNotes_BodyExpandbtn;

							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a")
							private static WebElement  DebitNotes_Body_Account22ExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[1]/a")
										private static WebElement  DebitNotes_Account2_Namedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[2]/a")
										private static WebElement  DebitNotes_Account2_Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[3]/a")
										private static WebElement  DebitNotes_Account2_Aliasdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[4]/a")
										private static WebElement  DebitNotes_Account2_AccountTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[5]/a")
										private static WebElement  DebitNotes_Account2_Addressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[6]/a")
										private static WebElement  DebitNotes_Account2_AllowCustomerProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[7]/a")
										private static WebElement  DebitNotes_Account2_BankACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[8]/a")
										private static WebElement  DebitNotes_Account2_BankACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[9]/a")
										private static WebElement  DebitNotes_Account2_BankAccountNamedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[10]/a")
										private static WebElement  DebitNotes_Account2_BankAccountNumberdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[11]/a")
										private static WebElement  DebitNotes_Account2_ChequeDiscountLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[12]/a")
										private static WebElement  DebitNotes_Account2_City1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[13]/a")
										private static WebElement  DebitNotes_Account2_CityCode1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[14]/a")
										private static WebElement  DebitNotes_Account2_City2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[15]/a")
										private static WebElement  DebitNotes_Account2_CityCode2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[16]/a")
										private static WebElement  DebitNotes_Account2_ConsolidationMethoddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[17]/a")
										private static WebElement  DebitNotes_Account2_CreditDaysdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[18]/a")
										private static WebElement  DebitNotes_Account2_CreditLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[19]/a")
										private static WebElement  DebitNotes_Account2_DebitCreditProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[20]/a")
										private static WebElement  DebitNotes_Account2_DebitCreditRequireddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[21]/a")
										private static WebElement  DebitNotes_Account2_DefaultCurrencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[22]/a")
										private static WebElement  DebitNotes_Account2_Deliveryaddressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[23]/a")
										private static WebElement  DebitNotes_Account2_EMaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[24]/a")
										private static WebElement  DebitNotes_Account2_ExchangeAdjustmentGainACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[25]/a")
										private static WebElement  DebitNotes_Account2_ExchangeAdjustmentGainACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[26]/a")
										private static WebElement  DebitNotes_Account2_ExchangeAdjustmentLossACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[27]/a")
										private static WebElement  DebitNotes_Account2_ExchangeAdjustmentLossACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[28]/a")
										private static WebElement  DebitNotes_Account2_FaxNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[29]/a")
										private static WebElement  DebitNotes_Account2_FinanceChargeTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[30]/a")
										private static WebElement  DebitNotes_Account2_FinanceEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[31]/a")
										private static WebElement  DebitNotes_Account2_IFSCcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[32]/a")
										private static WebElement  DebitNotes_Account2_Passworddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[33]/a")
										private static WebElement  DebitNotes_Account2_PaymentTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[34]/a")
										private static WebElement  DebitNotes_Account2_PaymentTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[35]/a")
										private static WebElement  DebitNotes_Account2_PDCdiscountedACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[36]/a")
										private static WebElement  DebitNotes_Account2_PDCdiscountedACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[37]/a")
										private static WebElement  DebitNotes_Account2_Pin1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[38]/a")
										private static WebElement  DebitNotes_Account2_Pin2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[39]/a")
										private static WebElement  DebitNotes_Account2_PortalEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[40]/a")
										private static WebElement  DebitNotes_Account2_PrimaryAccountdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[41]/a")
										private static WebElement  DebitNotes_Account2_PrimaryAccountCodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[42]/a")
										private static WebElement  DebitNotes_Account2_RateOfInterestdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[43]/a")
										private static WebElement  DebitNotes_Account2_ReminderTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[44]/a")
										private static WebElement  DebitNotes_Account2_SendEmailToCustomerdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[45]/a")
										private static WebElement  DebitNotes_Account2_TelNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[46]/a")
										private static WebElement  DebitNotes_Account2_GroupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[47]/a")
										private static WebElement  DebitNotes_Account2_GroupLevel1Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[48]/a")
										private static WebElement  DebitNotes_Account2_GroupLevel2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[49]/a")
										private static WebElement  DebitNotes_Account2_GroupLevel2Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[50]/a")
										private static WebElement  DebitNotes_Account2_GroupLevel3draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[51]/a")
										private static WebElement  DebitNotes_Account2_GroupLevel3Codedraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
							private static WebElement  DebitNotes_Body_Amountdraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
							private static WebElement  DebitNotes_Body_Netdraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a")
							private static WebElement  DebitNotes_Body_NetBaseCurrencydraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a")
							private static WebElement  DebitNotes_Body_NetLocalCurrencydraganddrop;
				
			
//-------------------------------------------------------------------------------------------------------------------------------------------------						
							
		// Finance Transaction Journals*** DebitNoteslineWise
							// Header same as  Journals_Header    
							// Body same as  Journals_Body			
							//userdetails,miscellanious,company is same			

//-------------------------------------------------------------------------------------------------------------------------------------------------						

		// Finance Transaction Journals*** CreditNotes
						// Header named as CreditNotes_Header   
						// Body  named as  CreditNotes_Body				
						//userdetails,miscellanious,company is same				
				
				

				//CreditNotes_Header
				
				@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
				private static WebElement  CreditNotes_HeaderExpandBtn;
					
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
								private static WebElement  CreditNotes_Header_DocNodraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
								private static WebElement  CreditNotes_Header_DateExpandBtn;
								
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
											private static WebElement  CreditNotes_Datedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
											private static WebElement  CreditNotes_Date_Yeardraganddrop;
											
											@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
											private static WebElement  CreditNotes_Date_Monthdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
											private static WebElement  CreditNotes_Date_DayOfYeardraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
											private static WebElement  CreditNotes_Date_Daydraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
											private static WebElement  CreditNotes_Date_Weekdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
											private static WebElement  CreditNotes_Date_WeekDaydraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
								private static WebElement  CreditNotes_Header_TimeExpandBtn;
								
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
											private static WebElement  CreditNotes_Time_Timedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
											private static WebElement  CreditNotes_Time_Hourdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
											private static WebElement  CreditNotes_Time_Minutedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
											private static WebElement CreditNotes_Time_Seconddraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
								private static WebElement CreditNotes_Header_CRAccountExpandBtn;
								
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
											private static WebElement  CRAccount_Namedraganddrop;
														
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
											private static WebElement  CRAccount_Codedraganddrop;
														
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
											private static WebElement  CRAccount_Aliasdraganddrop;
														
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
											private static WebElement  CRAccount_Accounttypedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
											private static WebElement  CRAccount_Addressdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
											private static WebElement  CRAccount_AllowCustomerPortaldraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
											private static WebElement  CRAccount_BanckACdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
											private static WebElement  CRAccount_BankACcodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
											private static WebElement  CRAccount_BankAccountNamedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
											private static WebElement  CRAccount_BankAccountNumberdraganddrop;
										
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
											private static WebElement  CRAccount_ChequeDiscountLimitdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
											private static WebElement  CRAccount_City1draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
											private static WebElement  CRAccount_CityCode1draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
											private static WebElement  CRAccount_City2draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
											private static WebElement  CRAccount_CityCode2draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
											private static WebElement  CRAccount_ConsolidationMethoddraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
											private static WebElement  CRAccount_CreditDaysdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
											private static WebElement  CRAccount_CreditLimitdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
											private static WebElement  CRAccount_DebitCreditProposaldraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
											private static WebElement  CRAccount_DebitCreditRequireddraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
											private static WebElement  CRAccount_DefaultCurrencydraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
											private static WebElement  CRAccount_DeliveryAddressdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
											private static WebElement  CRAccount_Emaildraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
											private static WebElement  CRAccount_ExchangeAdjustGainACdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
											private static WebElement  CRAccount_ExchangeAdjustGainACcodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
											private static WebElement  CRAccount_ExchangeAdjustLossACdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
											private static WebElement  CRAccount_ExchangeAdjustLossACcodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
											private static WebElement  CRAccount_FaxNodraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
											private static WebElement  CRAccount_FinanceChargeTermsdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
											private static WebElement  CRAccount_FinanaceEmaildraganddrop;
									
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
											private static WebElement  CRAccount_IFSCcodedraganddrop;
										
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
											private static WebElement  CRAccount_Passworddraganddrop;
									
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
											private static WebElement  CRAccount_PaymentTermsdraganddrop;
										
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
											private static WebElement  CRAccount_PaymentTypedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
											private static WebElement  CRAccount_PDCdiscountedACdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
											private static WebElement  CRAccount_PDCdiscountedACcodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
											private static WebElement  CRAccount_Pin1draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
											private static WebElement  CRAccount_Pin2draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
											private static WebElement  CRAccount_PortalEmaildraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
											private static WebElement  CRAccount_PrimaryAccountdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
											private static WebElement  CRAccount_PrimanryAccountCodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
											private static WebElement  CRAccount_RateOFInterestdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
											private static WebElement  CRAccount_ReminderTermsdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
											private static WebElement  CRAccount_SendEmaialToCustomerdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
											private static WebElement  CRAccount_TelNodraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
											private static WebElement  CRAccount_GropupLevel1draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
											private static WebElement  CRAccount_GroupLevel1Codedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
											private static WebElement  CRAccount_GroupLevel2draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
											private static WebElement  CRAccount_GroupLevel2Codedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
											private static WebElement  CRAccount_GroupLevel3draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
											private static WebElement  CRAccount_GroupLevel3Codedraganddrop;
											
											
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
							private static WebElement  CreditNotes_Header_DepartmentExpandBtn;		
								
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[1]/a")
											private static WebElement  CreditNotes_Department_Namedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[2]/a")
											private static WebElement  CreditNotes_Department_Codedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[3]/a")
											private static WebElement  CreditNotes_Department_Aliasdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[4]/a")
											private static WebElement  CreditNotes_Department_Currencydraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[5]/a")
											private static WebElement  CreditNotes_Department_GroupLevel1draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[6]/a")
											private static WebElement  CreditNotes_Department_GroupLevel1Codedraganddrop;
											
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
								private static WebElement  CreditNotes_Narrationdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
								private static WebElement  CreditNotes_CreatedBydraganddrop;
											
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
								private static WebElement  CreditNotes_Header_CreatedDateExpandBtn;	
								
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[1]/a")
											private static WebElement  CreditNotes_CreatedDate_CreatedDatedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[2]/a")
											private static WebElement  CreditNotes_CreatedDate_Yeardraganddrop;
										
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[3]/a")
											private static WebElement  CreditNotes_CreatedDate_Monthdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[4]/a")
											private static WebElement  CreditNotes_CreatedDate_DayofYeardraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[5]/a")
											private static WebElement  CreditNotes_CreatedDate_Daydraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[6]/a")
											private static WebElement  CreditNotes_CreatedDate_Weekdraganddrop;
										
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[7]/a")
											private static WebElement  CreditNotes_CreatedDate_WeekDaydraganddrop;
								
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
							private static WebElement  CreditNotes_Header_CreatedTimeExpandBtn;
							
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[1]/a")
											private static WebElement  CreditNotes_CreatedTime_CreatedTimedrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[2]/a")
											private static WebElement  CreditNotes_CreatedTime_Hourdrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[3]/a")
											private static WebElement  CreditNotes_CreatedTime_Minutedrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[4]/a")
											private static WebElement  CreditNotes_CreatedTime_Seconddrapanddrop;
											
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
							private static WebElement  CreditNotes_Header_ModifiedBydrapanddrop;
											
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
							private static WebElement  CreditNotes_Header_ModifiedDateExpandBtn;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[1]/a")
											private static WebElement  CreditNotes_ModifiedDate_ModifiedDatedrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[2]/a")
											private static WebElement  CreditNotes_ModifiedDate_Yeardrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[3]/a")
											private static WebElement  CreditNotes_ModifiedDate_monthdrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[4]/a")
											private static WebElement  CreditNotes_ModifiedDate_DayofYeardrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[5]/a")
											private static WebElement  CreditNotes_ModifiedDate_Daydrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[6]/a")
											private static WebElement  CreditNotes_ModifiedDate_Weekdrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[7]/a")
											private static WebElement  CreditNotes_ModifiedDate_WeekDaydrapanddrop;
														
					
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
					    	private static WebElement  CreditNotes_Header_ModifiedTimeExpandBtn;
															
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[1]/a")
											private static WebElement  CreditNotes_ModifiedTime_ModifiedTimedrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[2]/a")
											private static WebElement  CreditNotes_ModifiedTime_Hourdrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[3]/a")
											private static WebElement  CreditNotes_ModifiedTime_Minutedrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[4]/a")
											private static WebElement  CreditNotes_ModifiedTime_Seconddrapanddrop;
									
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
							private static WebElement  CreditNotes_Header_PrintCountdrapanddrop;	
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
							private static WebElement  CreditNotes_Header_RevisionNumberdrapanddrop;	
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
							private static WebElement  CreditNotes_Header_AuthorizeStatusdrapanddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
					    	private static WebElement  CreditNotes_Header_AuthorizeDateExpandBn;
															
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[1]/a")
											private static WebElement  CreditNotes_AuthorizeDate_AuthorizeDatedrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[2]/a")
											private static WebElement  CreditNotes_AuthorizeDate_Yeardrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[3]/a")
											private static WebElement  CreditNotes_AuthorizeDate_Monthdrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[4]/a")
											private static WebElement  CreditNotes_AuthorizeDate_DayofYeardrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[5]/a")
											private static WebElement  CreditNotes_AuthorizedDate_Daydrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[6]/a")
											private static WebElement  CreditNotes_AuthorizeDate_Weekdrapanddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[7]/a")
											private static WebElement  CreditNotes_AuthorizeDate_WeekDaydrapanddrop;
											
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/a")
							private static WebElement  CreditNotes_Header_EMailCountdrapanddrop;
							
							
			// CreditNotes_Body
				
				  
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/a")
					private static WebElement  CreditNotes_BodyExpandbtn;

								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a")
								private static WebElement  CreditNotes_Body_Account22ExpandBtn;
								
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[1]/a")
											private static WebElement  CreditNotes_Account2_Namedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[2]/a")
											private static WebElement  CreditNotes_Account2_Codedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[3]/a")
											private static WebElement  CreditNotes_Account2_Aliasdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[4]/a")
											private static WebElement  CreditNotes_Account2_AccountTypedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[5]/a")
											private static WebElement  CreditNotes_Account2_Addressdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[6]/a")
											private static WebElement  CreditNotes_Account2_AllowCustomerProposaldraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[7]/a")
											private static WebElement  CreditNotes_Account2_BankACdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[8]/a")
											private static WebElement  CreditNotes_Account2_BankACcodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[9]/a")
											private static WebElement  CreditNotes_Account2_BankAccountNamedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[10]/a")
											private static WebElement  CreditNotes_Account2_BankAccountNumberdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[11]/a")
											private static WebElement  CreditNotes_Account2_ChequeDiscountLimitdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[12]/a")
											private static WebElement  CreditNotes_Account2_City1draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[13]/a")
											private static WebElement  CreditNotes_Account2_CityCode1draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[14]/a")
											private static WebElement  CreditNotes_Account2_City2draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[15]/a")
											private static WebElement  CreditNotes_Account2_CityCode2draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[16]/a")
											private static WebElement  CreditNotes_Account2_ConsolidationMethoddraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[17]/a")
											private static WebElement  CreditNotes_Account2_CreditDaysdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[18]/a")
											private static WebElement  CreditNotes_Account2_CreditLimitdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[19]/a")
											private static WebElement  CreditNotes_Account2_DebitCreditProposaldraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[20]/a")
											private static WebElement  CreditNotes_Account2_DebitCreditRequireddraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[21]/a")
											private static WebElement  CreditNotes_Account2_DefaultCurrencydraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[22]/a")
											private static WebElement  CreditNotes_Account2_Deliveryaddressdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[23]/a")
											private static WebElement  CreditNotes_Account2_EMaildraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[24]/a")
											private static WebElement  CreditNotes_Account2_ExchangeAdjustmentGainACdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[25]/a")
											private static WebElement  CreditNotes_Account2_ExchangeAdjustmentGainACcodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[26]/a")
											private static WebElement  CreditNotes_Account2_ExchangeAdjustmentLossACdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[27]/a")
											private static WebElement  CreditNotes_Account2_ExchangeAdjustmentLossACcodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[28]/a")
											private static WebElement  CreditNotes_Account2_FaxNodraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[29]/a")
											private static WebElement  CreditNotes_Account2_FinanceChargeTermsdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[30]/a")
											private static WebElement  CreditNotes_Account2_FinanceEmaildraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[31]/a")
											private static WebElement  CreditNotes_Account2_IFSCcodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[32]/a")
											private static WebElement  CreditNotes_Account2_Passworddraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[33]/a")
											private static WebElement  CreditNotes_Account2_PaymentTermsdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[34]/a")
											private static WebElement  CreditNotes_Account2_PaymentTypedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[35]/a")
											private static WebElement  CreditNotes_Account2_PDCdiscountedACdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[36]/a")
											private static WebElement  CreditNotes_Account2_PDCdiscountedACcodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[37]/a")
											private static WebElement  CreditNotes_Account2_Pin1draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[38]/a")
											private static WebElement  CreditNotes_Account2_Pin2draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[39]/a")
											private static WebElement  CreditNotes_Account2_PortalEmaildraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[40]/a")
											private static WebElement  CreditNotes_Account2_PrimaryAccountdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[41]/a")
											private static WebElement  CreditNotes_Account2_PrimaryAccountCodedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[42]/a")
											private static WebElement  CreditNotes_Account2_RateOfInterestdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[43]/a")
											private static WebElement  CreditNotes_Account2_ReminderTermsdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[44]/a")
											private static WebElement  CreditNotes_Account2_SendEmailToCustomerdraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[45]/a")
											private static WebElement  CreditNotes_Account2_TelNodraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[46]/a")
											private static WebElement  CreditNotes_Account2_GroupLevel1draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[47]/a")
											private static WebElement  CreditNotes_Account2_GroupLevel1Codedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[48]/a")
											private static WebElement  CreditNotes_Account2_GroupLevel2draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[49]/a")
											private static WebElement  CreditNotes_Account2_GroupLevel2Codedraganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[50]/a")
											private static WebElement  CreditNotes_Account2_GroupLevel3draganddrop;
											
											@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[51]/a")
											private static WebElement  CreditNotes_Account2_GroupLevel3Codedraganddrop;
											
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
								private static WebElement  CreditNotes_Body_Amountdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
								private static WebElement  CreditNotes_Body_Netdraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a")
								private static WebElement  CreditNotes_Body_NetBaseCurrencydraganddrop;
								
								@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a")
								private static WebElement  CreditNotes_Body_NetLocalCurrencydraganddrop;
								
								
//-------------------------------------------------------------------------------------------------------------------------------------------------						
															
		// Finance Transaction Journals*** CreditNoteslineWise
							// Header same as Journals_Header    
							// Body same as  Journals_Body			
							//userdetails,miscellanious,company is same			
			


//-------------------------------------------------------------------------------------------------------------------------------------------------						
				
// Finance Transaction Journals*** OpeningBalances
				// Header same as  Journals_Header    
				// Body same as  Journals_Body			
				//userdetails,miscellanious,company is same			
			


//-------------------------------------------------------------------------------------------------------------------------------------------------						
				
// Finance Transaction Journals*** FixedAssetDeprecationVoucher
				// Header same as Journals_Header    
				// Body same as Journals_Body			
				//userdetails,miscellanious,company is same			
			
			
//////////////////////////////////////////////////////////////////////////////////////////-------------------------------------------------------------------------------------------			
			
/*FINANCE COMPLETED
	INVENTORY STARTS
	
	THERE ARE COMMON SHARED PROPERTIES..READ THE PAGE SARTING COMMENTED LINE TO GET IDEA */
								
/////////////////////////////////////////////////////////////////////////////////////////////--------------------------------			
								
//--------------------------------------------------------------------------------------------------------------------------------------------
								
	// Inventory Transaction Purchase*** Request for Quote
					// Header  named as Inventory_Purchases
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same				

		//Inventory_Purchases_Header
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
		private static WebElement  Inventory_Purchases_HeaderExpandBtn;
			
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
						private static WebElement  Inventory_Purchases_Header_DocNodraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
						private static WebElement  Inventory_Purchases_Header_DateExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
									private static WebElement  Inventory_Purchases_Datedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
									private static WebElement  Inventory_Purchases_Date_Yeardraganddrop;
									
									@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
									private static WebElement  Inventory_Purchases_Date_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
									private static WebElement  Inventory_Purchases_Date_DayOfYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
									private static WebElement  Inventory_Purchases_Date_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
									private static WebElement  Inventory_Purchases_Date_Weekdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
									private static WebElement  Inventory_Purchases_Date_WeekDaydraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
						private static WebElement  Inventory_Purchases_Header_TimeExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
									private static WebElement  Inventory_Purchases_Time_Timedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
									private static WebElement  Inventory_Purchases_Time_Hourdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
									private static WebElement  Inventory_Purchases_Time_Minutedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
									private static WebElement Inventory_Purchases_Time_Seconddraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
						private static WebElement Inventory_Purchases_Header_VendorACExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
									private static WebElement  VendorAC_Namedraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
									private static WebElement  VendorAC_Codedraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
									private static WebElement  VendorAC_Aliasdraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
									private static WebElement  VendorAC_Accounttypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
									private static WebElement  VendorAC_Addressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
									private static WebElement  VendorAC_AllowCustomerPortaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
									private static WebElement  VendorAC_BanckACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
									private static WebElement  VendorAC_BankACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
									private static WebElement  VendorAC_BankAccountNamedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
									private static WebElement  VendorAC_BankAccountNumberdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
									private static WebElement  VendorAC_ChequeDiscountLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
									private static WebElement  VendorAC_City1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
									private static WebElement  VendorAC_CityCode1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
									private static WebElement  VendorAC_City2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
									private static WebElement  VendorAC_CityCode2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
									private static WebElement  VendorAC_ConsolidationMethoddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
									private static WebElement  VendorAC_CreditDaysdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
									private static WebElement  VendorAC_CreditLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
									private static WebElement  VendorAC_DebitCreditProposaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
									private static WebElement  VendorAC_DebitCreditRequireddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
									private static WebElement  VendorAC_DefaultCurrencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
									private static WebElement  VendorAC_DeliveryAddressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
									private static WebElement  VendorAC_Emaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
									private static WebElement  VendorAC_ExchangeAdjustGainACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
									private static WebElement  VendorAC_ExchangeAdjustGainACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
									private static WebElement  VendorAC_ExchangeAdjustLossACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
									private static WebElement  VendorAC_ExchangeAdjustLossACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
									private static WebElement  VendorAC_FaxNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
									private static WebElement  VendorAC_FinanceChargeTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
									private static WebElement  VendorAC_FinanaceEmaildraganddrop;
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
									private static WebElement  VendorAC_IFSCcodedraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
									private static WebElement  VendorAC_Passworddraganddrop;
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
									private static WebElement  VendorAC_PaymentTermsdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
									private static WebElement  VendorAC_PaymentTypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
									private static WebElement  VendorAC_PDCdiscountedACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
									private static WebElement  VendorAC_PDCdiscountedACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
									private static WebElement  VendorAC_Pin1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
									private static WebElement  VendorAC_Pin2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
									private static WebElement  VendorAC_PortalEmaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
									private static WebElement  VendorAC_PrimaryAccountdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
									private static WebElement  VendorAC_PrimanryAccountCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
									private static WebElement  VendorAC_RateOFInterestdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
									private static WebElement  VendorAC_ReminderTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
									private static WebElement  VendorAC_SendEmaialToCustomerdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
									private static WebElement  VendorAC_TelNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
									private static WebElement  VendorAC_GropupLevel1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
									private static WebElement  VendorAC_GroupLevel1Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
									private static WebElement  VendorAC_GroupLevel2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
									private static WebElement  VendorAC_GroupLevel2Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
									private static WebElement  VendorAC_GroupLevel3draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
									private static WebElement  VendorAC_GroupLevel3Codedraganddrop;
					
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
						private static WebElement  Inventory_Purchases_Narrationdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
						private static WebElement  Inventory_Purchases_CreatedBydraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
						private static WebElement  Inventory_Purchases_Header_CreatedDateExpandBtn;	
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[1]/a")
									private static WebElement  Inventory_Purchases_CreatedDate_CreatedDatedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[2]/a")
									private static WebElement  Inventory_Purchases_CreatedDate_Yeardraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[3]/a")
									private static WebElement  Inventory_Purchases_CreatedDate_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[4]/a")
									private static WebElement  Inventory_Purchases_CreatedDate_DayofYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[5]/a")
									private static WebElement  Inventory_Purchases_CreatedDate_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[6]/a")
									private static WebElement  Inventory_Purchases_CreatedDate_Weekdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[7]/a")
									private static WebElement  Inventory_Purchases_CreatedDate_WeekDaydraganddrop;
						
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
					private static WebElement  Inventory_Purchases_Header_CreatedTimeExpandBtn;
					
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[1]/a")
									private static WebElement  Inventory_Purchases_CreatedTime_CreatedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[2]/a")
									private static WebElement  Inventory_Purchases_CreatedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[3]/a")
									private static WebElement  Inventory_Purchases_CreatedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[4]/a")
									private static WebElement  Inventory_Purchases_CreatedTime_Seconddrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
					private static WebElement  Inventory_Purchases_Header_ModifiedBydrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
					private static WebElement  Inventory_Purchases_Header_ModifiedDateExpandBtn;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[1]/a")
									private static WebElement  Inventory_Purchases_ModifiedDate_ModifiedDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[2]/a")
									private static WebElement  Inventory_Purchases_ModifiedDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[3]/a")
									private static WebElement  Inventory_Purchases_ModifiedDate_monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[4]/a")
									private static WebElement  Inventory_Purchases_ModifiedDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[5]/a")
									private static WebElement  Inventory_Purchases_ModifiedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[6]/a")
									private static WebElement  Inventory_Purchases_ModifiedDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[7]/a")
									private static WebElement  Inventory_Purchases_ModifiedDate_WeekDaydrapanddrop;
												
			
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
			    	private static WebElement  Inventory_Purchases_Header_ModifiedTimeExpandBtn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[1]/a")
									private static WebElement  Inventory_Purchases_ModifiedTime_ModifiedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[2]/a")
									private static WebElement  Inventory_Purchases_ModifiedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[3]/a")
									private static WebElement  Inventory_Purchases_ModifiedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[4]/a")
									private static WebElement  Inventory_Purchases_ModifiedTime_Seconddrapanddrop;
							
								
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
					private static WebElement  Inventory_Purchases_Header_PrintCountdrapanddrop;	
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
					private static WebElement  Inventory_Purchases_Header_RevisionNumberdrapanddrop;	
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
					private static WebElement  Inventory_Purchases_Header_AuthorizeStatusdrapanddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
			    	private static WebElement  Inventory_Purchases_Header_AuthorizeDateExpandBn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[1]/a")
									private static WebElement  Inventory_Purchases_AuthorizeDate_AuthorizeDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[2]/a")
									private static WebElement  Inventory_Purchases_AuthorizeDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[3]/a")
									private static WebElement  Inventory_Purchases_AuthorizeDate_Monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[4]/a")
									private static WebElement  Inventory_Purchases_AuthorizeDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[5]/a")
									private static WebElement  Inventory_Purchases_AuthorizedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[6]/a")
									private static WebElement  Inventory_Purchases_AuthorizeDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[7]/a")
									private static WebElement  Inventory_Purchases_AuthorizeDate_WeekDaydrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
					private static WebElement  Inventory_Purchases_Header_EMailCountdrapanddrop;
	
//--------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Purchase*** Purchases Quotations
					// Header  named as Inventory_Purchases
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same	

//--------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Purchase*** purchases orders
					// Header  named as Inventory_Purchases
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same	
			

//--------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Purchase*** Material Receipt Notes
					// Header  named as Inventory_Purchases
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same	

//--------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Sales*** Sales Quotations
					// Header  named as Inventory_Sales
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same	
		
		
		//Inventory_Sales_Header
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
		private static WebElement  Inventory_Sales_HeaderExpandBtn;
			
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
						private static WebElement  Inventory_Sales_Header_DocNodraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
						private static WebElement  Inventory_Sales_Header_DateExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
									private static WebElement  Inventory_Sales_Datedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
									private static WebElement  Inventory_Sales_Date_Yeardraganddrop;
									
									@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
									private static WebElement  Inventory_Sales_Date_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
									private static WebElement  Inventory_Sales_Date_DayOfYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
									private static WebElement  Inventory_Sales_Date_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
									private static WebElement  Inventory_Sales_Date_Weekdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
									private static WebElement  Inventory_Sales_Date_WeekDaydraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
						private static WebElement  Inventory_Sales_Header_TimeExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
									private static WebElement  Inventory_Sales_Time_Timedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
									private static WebElement  Inventory_Sales_Time_Hourdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
									private static WebElement  Inventory_Sales_Time_Minutedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
									private static WebElement Inventory_Sales_Time_Seconddraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
						private static WebElement Inventory_Sales_Header_CustomerAcExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
									private static WebElement  CustomerAc_Namedraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
									private static WebElement  CustomerAc_Codedraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
									private static WebElement  CustomerAc_Aliasdraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
									private static WebElement  CustomerAc_Accounttypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
									private static WebElement  CustomerAc_Addressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
									private static WebElement  CustomerAc_AllowCustomerPortaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
									private static WebElement  CustomerAc_BanckACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
									private static WebElement  CustomerAc_BankACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
									private static WebElement  CustomerAc_BankAccountNamedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
									private static WebElement  CustomerAc_BankAccountNumberdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
									private static WebElement  CustomerAc_ChequeDiscountLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
									private static WebElement  CustomerAc_City1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
									private static WebElement  CustomerAc_CityCode1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
									private static WebElement  CustomerAc_City2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
									private static WebElement  CustomerAc_CityCode2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
									private static WebElement  CustomerAc_ConsolidationMethoddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
									private static WebElement  CustomerAc_CreditDaysdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
									private static WebElement  CustomerAc_CreditLimitdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
									private static WebElement  CustomerAc_DebitCreditProposaldraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
									private static WebElement  CustomerAc_DebitCreditRequireddraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
									private static WebElement  CustomerAc_DefaultCurrencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
									private static WebElement  CustomerAc_DeliveryAddressdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
									private static WebElement  CustomerAc_Emaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
									private static WebElement  CustomerAc_ExchangeAdjustGainACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
									private static WebElement  CustomerAc_ExchangeAdjustGainACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
									private static WebElement  CustomerAc_ExchangeAdjustLossACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
									private static WebElement  CustomerAc_ExchangeAdjustLossACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
									private static WebElement  CustomerAc_FaxNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
									private static WebElement  CustomerAc_FinanceChargeTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
									private static WebElement  CustomerAc_FinanaceEmaildraganddrop;
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
									private static WebElement  CustomerAc_IFSCcodedraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
									private static WebElement  CustomerAc_Passworddraganddrop;
							
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
									private static WebElement  CustomerAc_PaymentTermsdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
									private static WebElement  CustomerAc_PaymentTypedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
									private static WebElement  CustomerAc_PDCdiscountedACdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
									private static WebElement  CustomerAc_PDCdiscountedACcodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
									private static WebElement  CustomerAc_Pin1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
									private static WebElement  CustomerAc_Pin2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
									private static WebElement  CustomerAc_PortalEmaildraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
									private static WebElement  CustomerAc_PrimaryAccountdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
									private static WebElement  CustomerAc_PrimanryAccountCodedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
									private static WebElement  CustomerAc_RateOFInterestdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
									private static WebElement  CustomerAc_ReminderTermsdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
									private static WebElement  CustomerAc_SendEmaialToCustomerdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
									private static WebElement  CustomerAc_TelNodraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
									private static WebElement  CustomerAc_GropupLevel1draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
									private static WebElement  CustomerAc_GroupLevel1Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
									private static WebElement  CustomerAc_GroupLevel2draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
									private static WebElement  CustomerAc_GroupLevel2Codedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
									private static WebElement  CustomerAc_GroupLevel3draganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
									private static WebElement  CustomerAc_GroupLevel3Codedraganddrop;
					
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
						private static WebElement  Inventory_Sales_Narrationdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
						private static WebElement  Inventory_Sales_CreatedBydraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
						private static WebElement  Inventory_Sales_Header_CreatedDateExpandBtn;	
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[1]/a")
									private static WebElement  Inventory_Sales_CreatedDate_CreatedDatedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[2]/a")
									private static WebElement  Inventory_Sales_CreatedDate_Yeardraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[3]/a")
									private static WebElement  Inventory_Sales_CreatedDate_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[4]/a")
									private static WebElement  Inventory_Sales_CreatedDate_DayofYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[5]/a")
									private static WebElement  Inventory_Sales_CreatedDate_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[6]/a")
									private static WebElement  Inventory_Sales_CreatedDate_Weekdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[7]/a")
									private static WebElement  Inventory_Sales_CreatedDate_WeekDaydraganddrop;
						
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
					private static WebElement  Inventory_Sales_Header_CreatedTimeExpandBtn;
					
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[1]/a")
									private static WebElement  Inventory_Sales_CreatedTime_CreatedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[2]/a")
									private static WebElement  Inventory_Sales_CreatedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[3]/a")
									private static WebElement  Inventory_Sales_CreatedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[4]/a")
									private static WebElement  Inventory_Sales_CreatedTime_Seconddrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
					private static WebElement  Inventory_Sales_Header_ModifiedBydrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
					private static WebElement  Inventory_Sales_Header_ModifiedDateExpandBtn;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[1]/a")
									private static WebElement  Inventory_Sales_ModifiedDate_ModifiedDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[2]/a")
									private static WebElement  Inventory_Sales_ModifiedDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[3]/a")
									private static WebElement  Inventory_Sales_ModifiedDate_monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[4]/a")
									private static WebElement  Inventory_Sales_ModifiedDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[5]/a")
									private static WebElement  Inventory_Sales_ModifiedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[6]/a")
									private static WebElement  Inventory_Sales_ModifiedDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[7]/a")
									private static WebElement  Inventory_Sales_ModifiedDate_WeekDaydrapanddrop;
												
			
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
			    	private static WebElement  Inventory_Sales_Header_ModifiedTimeExpandBtn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[1]/a")
									private static WebElement  Inventory_Sales_ModifiedTime_ModifiedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[2]/a")
									private static WebElement  Inventory_Sales_ModifiedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[3]/a")
									private static WebElement  Inventory_Sales_ModifiedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[4]/a")
									private static WebElement  Inventory_Sales_ModifiedTime_Seconddrapanddrop;
							
								
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
					private static WebElement  Inventory_Sales_Header_PrintCountdrapanddrop;	
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
					private static WebElement  Inventory_Sales_Header_RevisionNumberdrapanddrop;	
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
					private static WebElement  Inventory_Sales_Header_AuthorizeStatusdrapanddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
			    	private static WebElement  Inventory_Sales_Header_AuthorizeDateExpandBn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[1]/a")
									private static WebElement  Inventory_Sales_AuthorizeDate_AuthorizeDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[2]/a")
									private static WebElement  Inventory_Sales_AuthorizeDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[3]/a")
									private static WebElement  Inventory_Sales_AuthorizeDate_Monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[4]/a")
									private static WebElement  Inventory_Sales_AuthorizeDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[5]/a")
									private static WebElement  Inventory_Sales_AuthorizedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[6]/a")
									private static WebElement  Inventory_Sales_AuthorizeDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[7]/a")
									private static WebElement  Inventory_Sales_AuthorizeDate_WeekDaydrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
					private static WebElement  Inventory_Sales_Header_EMailCountdrapanddrop;
	
//--------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Sales*** Delivery Notes
					// Header  same as Inventory_Sales
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same	
					
					
//------------------///////////////////////////////////////////////////////////////////////////--------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////
					
	// Inventory Transaction Sales*** Pos Sales
					// Header  same as Finance_Sales
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same	
					
/////////////////////////////////////////////////////////////////////////////					
					
//////////////////////////////////////////////////////////////////////////////////////////////	
					
//-----------------------------------------------------------------------------------------------------------------------------------------------
					
	// Inventory Transaction Sales*** Production Orders
					// Header  same as Inventory_Sales
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same					

//-----------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Sales*** Sales Orders
					// Header  same as Inventory_Sales
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same	


//-----------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Stocks*** Shortage in Stocks
					// Header  named as Stocks_Header   {Common for excess in stocks, opening stocks, material requisition} 
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same				
					
	
		//Stocks_Header
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
		private static WebElement  Stocks_HeaderExpandBtn;
			
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
						private static WebElement  Stocks_Header_DocNodraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
						private static WebElement  Stocks_Header_DateExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
									private static WebElement  Stocks_Datedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
									private static WebElement  Stocks_Date_Yeardraganddrop;
									
									@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
									private static WebElement  Stocks_Date_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
									private static WebElement  Stocks_Date_DayOfYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
									private static WebElement  Stocks_Date_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
									private static WebElement  Stocks_Date_Weekdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
									private static WebElement  Stocks_Date_WeekDaydraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
						private static WebElement  Stocks_Header_TimeExpandBtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
									private static WebElement  Stocks_Time_Timedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
									private static WebElement  Stocks_Time_Hourdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
									private static WebElement  Stocks_Time_Minutedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
									private static WebElement Stocks_Time_Seconddraganddrop;
					
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
						private static WebElement  Stocks_Narrationdraganddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
						private static WebElement  Stocks_CreatedBydraganddrop;
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
						private static WebElement  Stocks_Header_CreatedDateExpandBtn;	
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/ul/li[1]/a")
									private static WebElement  Stocks_CreatedDate_CreatedDatedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/ul/li[2]/a")
									private static WebElement  Stocks_CreatedDate_Yeardraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/ul/li[3]/a")
									private static WebElement  Stocks_CreatedDate_Monthdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/ul/li[4]/a")
									private static WebElement  Stocks_CreatedDate_DayofYeardraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/ul/li[5]/a")
									private static WebElement  Stocks_CreatedDate_Daydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/ul/li[6]/a")
									private static WebElement  Stocks_CreatedDate_Weekdraganddrop;
								
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/ul/li[7]/a")
									private static WebElement  Stocks_CreatedDate_WeekDaydraganddrop;
						
				
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
					private static WebElement  Stocks_Header_CreatedTimeExpandBtn;
					
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[1]/a")
									private static WebElement  Stocks_CreatedTime_CreatedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[2]/a")
									private static WebElement  Stocks_CreatedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[3]/a")
									private static WebElement  Stocks_CreatedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/ul/li[4]/a")
									private static WebElement  Stocks_CreatedTime_Seconddrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
					private static WebElement  Stocks_Header_ModifiedBydrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
					private static WebElement  Stocks_Header_ModifiedDateExpandBtn;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[1]/a")
									private static WebElement  Stocks_ModifiedDate_ModifiedDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[2]/a")
									private static WebElement  Stocks_ModifiedDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[3]/a")
									private static WebElement  Stocks_ModifiedDate_monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[4]/a")
									private static WebElement  Stocks_ModifiedDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[5]/a")
									private static WebElement  Stocks_ModifiedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[6]/a")
									private static WebElement  Stocks_ModifiedDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[7]/a")
									private static WebElement  Stocks_ModifiedDate_WeekDaydrapanddrop;
												
			
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
			    	private static WebElement  Stocks_Header_ModifiedTimeExpandBtn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[1]/a")
									private static WebElement  Stocks_ModifiedTime_ModifiedTimedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[2]/a")
									private static WebElement  Stocks_ModifiedTime_Hourdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[3]/a")
									private static WebElement  Stocks_ModifiedTime_Minutedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/ul/li[4]/a")
									private static WebElement  Stocks_ModifiedTime_Seconddrapanddrop;
							
								
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
					private static WebElement  Stocks_Header_PrintCountdrapanddrop;	
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
					private static WebElement  Stocks_Header_RevisionNumberdrapanddrop;	
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
					private static WebElement  Stocks_Header_AuthorizeStatusdrapanddrop;
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
			    	private static WebElement  Stocks_Header_AuthorizeDateExpandBn;
													
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[1]/a")
									private static WebElement  Stocks_AuthorizeDate_AuthorizeDatedrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[2]/a")
									private static WebElement  Stocks_AuthorizeDate_Yeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[3]/a")
									private static WebElement  Stocks_AuthorizeDate_Monthdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[4]/a")
									private static WebElement  Stocks_AuthorizeDate_DayofYeardrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[5]/a")
									private static WebElement  Stocks_AuthorizedDate_Daydrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[6]/a")
									private static WebElement  Stocks_AuthorizeDate_Weekdrapanddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/ul/li[7]/a")
									private static WebElement  Stocks_AuthorizeDate_WeekDaydrapanddrop;
									
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
					private static WebElement  Stocks_Header_EMailCountdrapanddrop;
					

//-----------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Stocks*** Excess in Stocks
					// Header  same as Stocks_Header
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same	

//-----------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Stocks*** Stock Transfer
					// Header  same as StockTransfer_Header
					// Body  same as  StockTransfer_Body
					//userdetails,miscellanious,company is same
	
			//StockTransfer_Header
			
			@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
			private static WebElement  StockTransfer_HeaderExpandBtn;
				
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
							private static WebElement  StockTransfer_Header_DocNodraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
							private static WebElement  StockTransfer_Header_DateExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
										private static WebElement  StockTransfer_Datedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
										private static WebElement  StockTransfer_Date_Yeardraganddrop;
										
										@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
										private static WebElement  StockTransfer_Date_Monthdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
										private static WebElement  StockTransfer_Date_DayOfYeardraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
										private static WebElement  StockTransfer_Date_Daydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
										private static WebElement  StockTransfer_Date_Weekdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
										private static WebElement  StockTransfer_Date_WeekDaydraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
							private static WebElement  StockTransfer_Header_TimeExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
										private static WebElement  StockTransfer_Time_Timedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
										private static WebElement  StockTransfer_Time_Hourdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
										private static WebElement  StockTransfer_Time_Minutedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
										private static WebElement StockTransfer_Time_Seconddraganddrop;
						
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
							private static WebElement  StockTransfer_IssueTypedraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
							private static WebElement  StockTransfer_Header_WarehouseExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[1]/a")
										private static WebElement  StockTransfer_Warehouse_Namedropdown;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[2]/a")
										private static WebElement  StockTransfer_Warehouse_Codedropdown;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[3]/a")
										private static WebElement  StockTransfer_Warehouse_Aliasdropdown;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[4]/a")
										private static WebElement  StockTransfer_Warehouse_Binsdropdown;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[5]/a")
										private static WebElement  StockTransfer_Warehouse_BinsCodedropdown;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[6]/a")
										private static WebElement  StockTransfer_Warehouse_DoNotMaintainBindropdown;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[7]/a")
										private static WebElement  StockTransfer_Warehouse_PhysInventoryCountingFrequencydropdown;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[8]/a")
										private static WebElement  StockTransfer_Warehouse_Warehousetyoedropdown;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[9]/a")
										private static WebElement  StockTransfer_Warehouse_GroupLevel1dropdown;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[10]/a")
										private static WebElement  StockTransfer_Warehouse_GroupLevel1Codedropdown;
										
										

							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
							private static WebElement  StockTransfer_Narrationdraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
							private static WebElement  StockTransfer_CreatedBydraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
							private static WebElement  StockTransfer_Header_CreatedDateExpandBtn;	
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[1]/a")
										private static WebElement  StockTransfer_CreatedDate_CreatedDatedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[2]/a")
										private static WebElement  StockTransfer_CreatedDate_Yeardraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[3]/a")
										private static WebElement  StockTransfer_CreatedDate_Monthdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[4]/a")
										private static WebElement  StockTransfer_CreatedDate_DayofYeardraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[5]/a")
										private static WebElement  StockTransfer_CreatedDate_Daydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[6]/a")
										private static WebElement  StockTransfer_CreatedDate_Weekdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[7]/a")
										private static WebElement  StockTransfer_CreatedDate_WeekDaydraganddrop;
							
					
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
						private static WebElement  StockTransfer_Header_CreatedTimeExpandBtn;
						
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[1]/a")
										private static WebElement  StockTransfer_CreatedTime_CreatedTimedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[2]/a")
										private static WebElement  StockTransfer_CreatedTime_Hourdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[3]/a")
										private static WebElement  StockTransfer_CreatedTime_Minutedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/ul/li[4]/a")
										private static WebElement  StockTransfer_CreatedTime_Seconddrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
						private static WebElement  StockTransfer_Header_ModifiedBydrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
						private static WebElement  StockTransfer_Header_ModifiedDateExpandBtn;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[1]/a")
										private static WebElement  StockTransfer_ModifiedDate_ModifiedDatedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[2]/a")
										private static WebElement  StockTransfer_ModifiedDate_Yeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[3]/a")
										private static WebElement  StockTransfer_ModifiedDate_monthdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[4]/a")
										private static WebElement  StockTransfer_ModifiedDate_DayofYeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[5]/a")
										private static WebElement  StockTransfer_ModifiedDate_Daydrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[6]/a")
										private static WebElement  StockTransfer_ModifiedDate_Weekdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/ul/li[7]/a")
										private static WebElement  StockTransfer_ModifiedDate_WeekDaydrapanddrop;
													
				
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
				    	private static WebElement  StockTransfer_Header_ModifiedTimeExpandBtn;
														
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[1]/a")
										private static WebElement  StockTransfer_ModifiedTime_ModifiedTimedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[2]/a")
										private static WebElement  StockTransfer_ModifiedTime_Hourdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[3]/a")
										private static WebElement  StockTransfer_ModifiedTime_Minutedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[4]/a")
										private static WebElement  StockTransfer_ModifiedTime_Seconddrapanddrop;
								
									
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
						private static WebElement  StockTransfer_Header_PrintCountdrapanddrop;	
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
						private static WebElement  StockTransfer_Header_RevisionNumberdrapanddrop;	
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
						private static WebElement  StockTransfer_Header_AuthorizeStatusdrapanddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
				    	private static WebElement  StockTransfer_Header_AuthorizeDateExpandBn;
														
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[1]/a")
										private static WebElement  StockTransfer_AuthorizeDate_AuthorizeDatedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[2]/a")
										private static WebElement  StockTransfer_AuthorizeDate_Yeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[3]/a")
										private static WebElement  StockTransfer_AuthorizeDate_Monthdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[4]/a")
										private static WebElement  StockTransfer_AuthorizeDate_DayofYeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[5]/a")
										private static WebElement  StockTransfer_AuthorizedDate_Daydrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[6]/a")
										private static WebElement  StockTransfer_AuthorizeDate_Weekdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[7]/a")
										private static WebElement  StockTransfer_AuthorizeDate_WeekDaydrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/a")
						private static WebElement  StockTransfer_Header_EMailCountdrapanddrop;
						
					
						
				// StockTransfer_Body
					
					@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/a")
						private static WebElement  StockTransfer_BodyExpandbtn;
						
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
									private static WebElement  StockTransfer_Body_WareHouse2ExpandBtn;
									
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/ul/li[1]/a")
												private static WebElement  StockTransfer_WareHouse2_Namedropdown;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/ul/li[2]/a")
												private static WebElement  StockTransfer_WareHouse2_Codedropdown;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/ul/li[3]/a")
												private static WebElement  StockTransfer_WareHouse2_Aliasdropdown;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/ul/li[4]/a")
												private static WebElement  StockTransfer_WareHouse2_Binsdropdown;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/ul/li[5]/a")
												private static WebElement  StockTransfer_WareHouse2_BinsCodedropdown;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/ul/li[6]/a")
												private static WebElement  StockTransfer_WareHouse2_DoNotMaintainBindropdown;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/ul/li[7]/a")
												private static WebElement  StockTransfer_WareHouse2_PhysInventoryCountingFrequencydropdown;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/ul/li[8]/a")
												private static WebElement  StockTransfer_WareHouse2_Warehousetyoedropdown;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/ul/li[9]/a")
												private static WebElement  StockTransfer_WareHouse2_GroupLevel1dropdown;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/ul/li[10]/a")
												private static WebElement  StockTransfer_WareHouse2_GroupLevel1Codedropdown;
									

									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
									private static WebElement  StockTransfer_Body_ItemtExpansion;
									
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[1]/a")
												private static WebElement  StockTransfer_Item_Namedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[2]/a")
												private static WebElement  StockTransfer_Item_Codedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[3]/a")
												private static WebElement  StockTransfer_Item_Budgetdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[4]/a")
												private static WebElement  StockTransfer_Item_Aliasdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[5]/a")
												private static WebElement  StockTransfer_Item_ABCcodeCarryingCostdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[6]/a")
												private static WebElement  StockTransfer_Item_ABCcodeMargindraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[7]/a")
												private static WebElement  StockTransfer_Item_ABCcodeRevenuedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[8]/a")
												private static WebElement  StockTransfer_Item_ABCcodeValuedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[9]/a")
												private static WebElement  StockTransfer_Item_AlternateCategorydraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[10]/a")
												private static WebElement  StockTransfer_Item_AlternateCategoryCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[11]/a")
												private static WebElement  StockTransfer_Item_BarCode1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[12]/a")
												private static WebElement  StockTransfer_Item_BarCode2draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[13]/a")
												private static WebElement  StockTransfer_Item_BarCode3draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[14]/a")
												private static WebElement  StockTransfer_Item_Bindraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[15]/a")
												private static WebElement  StockTransfer_Item_BinCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[16]/a")
												private static WebElement  StockTransfer_Item_BinCapacitydraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[17]/a")
												private static WebElement  StockTransfer_Item_BOMdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[18]/a")
												private static WebElement  StockTransfer_Item_Categorydraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[19]/a")
												private static WebElement  StockTransfer_Item_CategoryCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[20]/a")
												private static WebElement  StockTransfer_Item_CBMdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[21]/a")
												private static WebElement  StockTransfer_CostOfExcessStockACItem_draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[22]/a")
												private static WebElement  StockTransfer_Item_CostOfExcessStockACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[23]/a")
												private static WebElement  StockTransfer_Item_CostOfIssueAccountdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[24]/a")
												private static WebElement  StockTransfer_Item_CostOfIssueAccountCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[25]/a")
												private static WebElement  StockTransfer_Item_CostOfSalesReturnACdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[26]/a")
												private static WebElement  StockTransfer_Item_CostOfSalesReturnACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[27]/a")
												private static WebElement  StockTransfer_Item_CostOfShortageStockACdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[28]/a")
												private static WebElement  StockTransfer_Item_CostOfShortageStockACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[29]/a")
												private static WebElement  StockTransfer_Item_DefaultBaseUnitdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[30]/a")
												private static WebElement  StockTransfer_Item_DefaultBaseUnitCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[31]/a")
												private static WebElement  StockTransfer_Item_DefaultPurchaseUnitdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[32]/a")
												private static WebElement  StockTransfer_Item_DefaultPurchaseUnitcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[33]/a")
												private static WebElement  StockTransfer_Item_DefaultReplenishmentdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[34]/a")
												private static WebElement  StockTransfer_Item_DefaultSalesUnitdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[35]/a")
												private static WebElement  StockTransfer_Item_DefaultSalesUnitcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[36]/a")
												private static WebElement  StockTransfer_Item_Descriptiondraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[37]/a")
												private static WebElement  StockTransfer_Item_DontShowProductsExpiringInDaysdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[38]/a")
												private static WebElement  StockTransfer_Item_Flushingdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[39]/a")
												private static WebElement  StockTransfer_Item_Heightdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[40]/a")
												private static WebElement  StockTransfer_Item_IndirectCostdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[41]/a")
												private static WebElement  StockTransfer_Item_ItemMakedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[42]/a")
												private static WebElement  StockTransfer_Item_ItemTypedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[43]/a")
												private static WebElement  StockTransfer_Item_Lengthdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[44]/a")
												private static WebElement  StockTransfer_Item_ManufacturePolicydraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[45]/a")
												private static WebElement  StockTransfer_Item_OverHeadCostdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[46]/a")
												private static WebElement  StockTransfer_Item_PackingBOMdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[47]/a")
												private static WebElement  StockTransfer_Item_PerishableItemdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[48]/a")
												private static WebElement  StockTransfer_Item_Printerdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[49]/a")
												private static WebElement  StockTransfer_Item_Profitdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[50]/a")
												private static WebElement  StockTransfer_Item_PurchaseVarianceACdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[51]/a")
												private static WebElement  StockTransfer_Item_PurchaseVarianceACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[52]/a")
												private static WebElement  StockTransfer_Item_ReorderLeveldraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[53]/a")
												private static WebElement  StockTransfer_Item_SalesAccountdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[54]/a")
												private static WebElement  StockTransfer_Item_SalesAccountCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[55]/a")
												private static WebElement  StockTransfer_Item_StandardCostdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[56]/a")
												private static WebElement  StockTransfer_Item_StocksAccountdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[57]/a")
												private static WebElement  StockTransfer_Item_StocksAccountCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[58]/a")
											    private static WebElement  StockTransfer_Item_TaxCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[59]/a")
											    private static WebElement  StockTransfer_Item_TaxCodecodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[60]/a")
												private static WebElement  StockTransfer_Item_ValuationMethoddraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[61]/a")
												private static WebElement  StockTransfer_Item_Weightdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[62]/a")
												private static WebElement  StockTransfer_Item_Widthdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[63]/a")
												private static WebElement  StockTransfer_Item_WIPaccountdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[64]/a")
												private static WebElement  StockTransfer_Item_WIPaccountCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[65]/a")
												private static WebElement  StockTransfer_Item_GroupLevel1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[66]/a")
												private static WebElement  StockTransfer_Item_GroupLevel1Codedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[67]/a")
												private static WebElement  StockTransfer_Item_Buyingratedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[68]/a")
												private static WebElement  StockTransfer_Item_BuyingVAl1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[69]/a")
												private static WebElement  StockTransfer_Item_BuyingVal2draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[70]/a")
												private static WebElement  StockTransfer_Item_BuyingVal3draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[71]/a")
												private static WebElement  StockTransfer_Item_BuyingVal4draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[72]/a")
												private static WebElement  StockTransfer_Item_BuyingVal5draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[73]/a")
												private static WebElement  StockTransfer_Item_BuyingVal6draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[74]/a")
												private static WebElement  StockTransfer_Item_BuyingVal7draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[75]/a")
												private static WebElement  StockTransfer_Item_BuyingVal8draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[76]/a")
												private static WebElement  StockTransfer_Item_BuyingVal9draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[77]/a")
												private static WebElement  StockTransfer_Item_BuyingVal10draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[78]/a")
												private static WebElement  StockTransfer_Item_BuyingVal11draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[79]/a")
												private static WebElement  StockTransfer_Item_BuyingVal12draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[80]/a")
												private static WebElement  StockTransfer_Item_BuyingVal13draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[81]/a")
												private static WebElement  StockTransfer_Item_SellingRatedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[82]/a")
												private static WebElement  StockTransfer_Item_SellingVal1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[83]/a")
												private static WebElement  StockTransfer_Item_SellingVal2draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[84]/a")
												private static WebElement  StockTransfer_Item_SellingVal3draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[85]/a")
												private static WebElement  StockTransfer_Item_SellingVal4draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[86]/a")
												private static WebElement  StockTransfer_Item_SellingVal5draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[87]/a")
												private static WebElement  StockTransfer_Item_SellingVal6draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[88]/a")
												private static WebElement  StockTransfer_Item_SellingVal7draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[89]/a")
												private static WebElement  StockTransfer_Item_SellingVal8draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[90]/a")
												private static WebElement  StockTransfer_Item_SellingVal9draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[91]/a")
												private static WebElement  StockTransfer_Item_SellingVal10draganddrop;
											
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[92]/a")
												private static WebElement  StockTransfer_Item_SellingVal11draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[93]/a")
												private static WebElement  StockTransfer_Item_SellingVal12draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/ul/li[94]/a")
												private static WebElement  StockTransfer_Item_SellingVal13draganddrop;
												
											
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
									private static WebElement  StockTransfer_Body_Quantitydraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a")
									private static WebElement  StockTransfer_Body_Ratedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a")
									private static WebElement  StockTransfer_Body_Grossdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[6]/a")
									private static WebElement  StockTransfer_Body_Netdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[7]/a")
									private static WebElement  StockTransfer_Body_NetBaseCurrencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[8]/a")
									private static WebElement  StockTransfer_Body_NetLocalCurrencydraganddrop;


//-----------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Stocks*** Opening Stocks
					// Header  same as Stocks_Header
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same	


//-----------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Stocks*** Material Requisition
					// Header  same as Stocks_Header
					// Body  same as  PSS_Body
					//userdetails,miscellanious,company is same	

//-----------------------------------------------------------------------------------------------------------------------------------------------

	// Inventory Transaction Stocks*** Stock Adjustment
					// Header  same as StockAdjustment_Header
					// Body  same as  StockAdjustment_Body
					//userdetails,miscellanious,company is same	
				
				// StockAdjustment Header

				@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
				private static WebElement  StockAdjustment_HeaderExpandBtn;
				
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a")
							private static WebElement  StockAdjustment_Header_DocNOdraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/a")
							private static WebElement  StockAdjustment_Header_DateExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[1]/a")
										private static WebElement  StockAdjustment_Datedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[2]/a")
										private static WebElement  StockAdjustment_Date_Yeardraganddrop;
										
										@FindBy(xpath="///*[@id='InvoiceDesignField']/ul/li[1]/ul/li[2]/ul/li[3]/a")
										private static WebElement  StockAdjustment_Date_Monthdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[4]/a")
										private static WebElement  StockAdjustment_Date_DayOfYeardraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[5]/a")
										private static WebElement  StockAdjustment_Date_Daydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[6]/a")
										private static WebElement  StockAdjustment_Date_Weekdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]/ul/li[7]/a")
										private static WebElement  StockAdjustment_Date_WeekDaydraganddrop;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
							private static WebElement  StockAdjustment_Header_TimeExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[1]/a")
										private static WebElement  StockAdjustment_Time_Timedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[2]/a")
										private static WebElement  StockAdjustment_Time_Hourdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[3]/a")
										private static WebElement  StockAdjustment_Time_Minutedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/ul/li[4]/a")
										private static WebElement StockAdjustment_Time_Seconddraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a")
							private static WebElement StockAdjustment_Header_PurchaseAcExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
										private static WebElement  StockAdjustment_PurchaseAc_Namedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
										private static WebElement  StockAdjustment_PurchaseAc_Codedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
										private static WebElement  StockAdjustment_PurchaseAc_Aliasdraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
										private static WebElement  StockAdjustment_PurchaseAc_Accounttypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
										private static WebElement  StockAdjustment_PurchaseAc_Addressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
										private static WebElement  StockAdjustment_PurchaseAc_AllowCustomerPortaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
										private static WebElement  StockAdjustment_PurchaseAc_BanckACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
										private static WebElement  StockAdjustment_PurchaseAc_BankACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
										private static WebElement  StockAdjustment_PurchaseAc_BankAccountNamedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
										private static WebElement  StockAdjustment_PurchaseAc_BankAccountNumberdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
										private static WebElement  StockAdjustment_PurchaseAc_ChequeDiscountLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
										private static WebElement  StockAdjustment_PurchaseAc_City1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
										private static WebElement  StockAdjustment_PurchaseAc_CityCode1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
										private static WebElement  StockAdjustment_PurchaseAc_City2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
										private static WebElement  StockAdjustment_PurchaseAc_CityCode2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
										private static WebElement  StockAdjustment_PurchaseAc_ConsolidationMethoddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
										private static WebElement  StockAdjustment_PurchaseAc_CreditDaysdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
										private static WebElement  StockAdjustment_PurchaseAc_CreditLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
										private static WebElement  StockAdjustment_PurchaseAc_DebitCreditProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
										private static WebElement  StockAdjustment_PurchaseAc_DebitCreditRequireddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
										private static WebElement  StockAdjustment_PurchaseAc_DefaultCurrencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
										private static WebElement  StockAdjustment_PurchaseAc_DeliveryAddressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
										private static WebElement  StockAdjustment_PurchaseAc_Emaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
										private static WebElement  StockAdjustment_PurchaseAc_ExchangeAdjustGainACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
										private static WebElement  StockAdjustment_PurchaseAc_ExchangeAdjustGainACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
										private static WebElement  StockAdjustment_PurchaseAc_ExchangeAdjustLossACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
										private static WebElement  StockAdjustment_PurchaseAc_ExchangeAdjustLossACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
										private static WebElement  StockAdjustment_PurchaseAc_FaxNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
										private static WebElement  StockAdjustment_PurchaseAc_FinanceChargeTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
										private static WebElement  StockAdjustment_PurchaseAc_FinanaceEmaildraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
										private static WebElement  StockAdjustment_PurchaseAc_IFSCcodedraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
										private static WebElement  StockAdjustment_PurchaseAc_Passworddraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
										private static WebElement  StockAdjustment_PurchaseAc_PaymentTermsdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
										private static WebElement  StockAdjustment_PurchaseAc_PaymentTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
										private static WebElement  StockAdjustment_PurchaseAc_PDCdiscountedACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
										private static WebElement  StockAdjustment_PurchaseAc_PDCdiscountedACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
										private static WebElement  StockAdjustment_PurchaseAc_Pin1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
										private static WebElement  StockAdjustment_PurchaseAc_Pin2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
										private static WebElement  StockAdjustment_PurchaseAc_PortalEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
										private static WebElement  StockAdjustment_PurchaseAc_PrimaryAccountdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
										private static WebElement  StockAdjustment_PurchaseAc_PrimanryAccountCodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
										private static WebElement  StockAdjustment_PurchaseAc_RateOFInterestdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
										private static WebElement  StockAdjustment_PurchaseAc_ReminderTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
										private static WebElement  StockAdjustment_PurchaseAc_SendEmaialToCustomerdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
										private static WebElement  StockAdjustment_PurchaseAc_TelNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
										private static WebElement  StockAdjustment_PurchaseAc_GropupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
										private static WebElement  StockAdjustment_PurchaseAc_GroupLevel1Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
										private static WebElement  StockAdjustment_PurchaseAc_GroupLevel2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
										private static WebElement  StockAdjustment_PurchaseAc_GroupLevel2Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
										private static WebElement  StockAdjustment_PurchaseAc_GroupLevel3draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
										private static WebElement  StockAdjustment_PurchaseAc_GroupLevel3Codedraganddrop;
										
						
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/a")
							private static WebElement StockAdjustment_Header_VendorACExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[1]/a")
										private static WebElement  StockAdjustment_VendorAC_Namedraganddrop;
												
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[2]/a")
										private static WebElement  StockAdjustment_VendorAC_Codedraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[3]/a")
										private static WebElement  StockAdjustment_VendorAC_Aliasdraganddrop;
													
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[4]/a")
										private static WebElement  StockAdjustment_VendorAC_Accounttypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[5]/a")
										private static WebElement  StockAdjustment_VendorAC_Addressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[6]/a")
										private static WebElement  StockAdjustment_VendorAC_AllowCustomerPortaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[7]/a")
										private static WebElement  StockAdjustment_VendorAC_BanckACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[8]/a")
										private static WebElement  StockAdjustment_VendorAC_BankACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[9]/a")
										private static WebElement  StockAdjustment_VendorAC_BankAccountNamedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[10]/a")
										private static WebElement  StockAdjustment_VendorAC_BankAccountNumberdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[11]/a")
										private static WebElement  StockAdjustment_VendorAC_ChequeDiscountLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[12]/a")
										private static WebElement  StockAdjustment_VendorAC_City1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[13]/a")
										private static WebElement  StockAdjustment_VendorAC_CityCode1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[14]/a")
										private static WebElement  StockAdjustment_VendorAC_City2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[15]/a")
										private static WebElement  StockAdjustment_VendorAC_CityCode2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[16]/a")
										private static WebElement  StockAdjustment_VendorAC_ConsolidationMethoddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[17]/a")
										private static WebElement  StockAdjustment_VendorAC_CreditDaysdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[18]/a")
										private static WebElement  StockAdjustment_VendorAC_CreditLimitdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[19]/a")
										private static WebElement  StockAdjustment_VendorAC_DebitCreditProposaldraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[20]/a")
										private static WebElement  StockAdjustment_VendorAC_DebitCreditRequireddraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[21]/a")
										private static WebElement  StockAdjustment_VendorAC_DefaultCurrencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[22]/a")
										private static WebElement  StockAdjustment_VendorAC_DeliveryAddressdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[23]/a")
										private static WebElement  StockAdjustment_VendorAC_Emaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[24]/a")
										private static WebElement  StockAdjustment_VendorAC_ExchangeAdjustGainACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[25]/a")
										private static WebElement  StockAdjustment_VendorAC_ExchangeAdjustGainACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[26]/a")
										private static WebElement  StockAdjustment_VendorAC_ExchangeAdjustLossACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[27]/a")
										private static WebElement  StockAdjustment_VendorAC_ExchangeAdjustLossACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[28]/a")
										private static WebElement  StockAdjustment_VendorAC_FaxNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[29]/a")
										private static WebElement  StockAdjustment_VendorAC_FinanceChargeTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[30]/a")
										private static WebElement  StockAdjustment_VendorAC_FinanaceEmaildraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[31]/a")
										private static WebElement  StockAdjustment_VendorAC_IFSCcodedraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[32]/a")
										private static WebElement  StockAdjustment_VendorAC_Passworddraganddrop;
								
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[33]/a")
										private static WebElement  StockAdjustment_VendorAC_PaymentTermsdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[34]/a")
										private static WebElement  StockAdjustment_VendorAC_PaymentTypedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[35]/a")
										private static WebElement  StockAdjustment_VendorAC_PDCdiscountedACdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[36]/a")
										private static WebElement  StockAdjustment_VendorAC_PDCdiscountedACcodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[37]/a")
										private static WebElement  StockAdjustment_VendorAC_Pin1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[38]/a")
										private static WebElement  StockAdjustment_VendorAC_Pin2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[39]/a")
										private static WebElement  StockAdjustment_VendorAC_PortalEmaildraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[40]/a")
										private static WebElement  StockAdjustment_VendorAC_PrimaryAccountdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[41]/a")
										private static WebElement  StockAdjustment_VendorAC_PrimanryAccountCodedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[42]/a")
										private static WebElement  StockAdjustment_VendorAC_RateOFInterestdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[43]/a")
										private static WebElement  StockAdjustment_VendorAC_ReminderTermsdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[44]/a")
										private static WebElement  StockAdjustment_VendorAC_SendEmaialToCustomerdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[45]/a")
										private static WebElement  StockAdjustment_VendorAC_TelNodraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[46]/a")
										private static WebElement  StockAdjustment_VendorAC_GropupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[47]/a")
										private static WebElement  StockAdjustment_VendorAC_GroupLevel1Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[48]/a")
										private static WebElement  StockAdjustment_VendorAC_GroupLevel2draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[49]/a")
										private static WebElement  StockAdjustment_VendorAC_GroupLevel2Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[50]/a")
										private static WebElement  StockAdjustment_VendorAC_GroupLevel3draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]/ul/li[51]/a")
										private static WebElement  StockAdjustment_VendorAC_GroupLevel3Codedraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]/a")
							private static WebElement  StockAdjustment_Header_UpdateStockBtn;
							
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]/a")
							private static WebElement  StockAdjustment_Header_RaiseReceiptBtn;
										
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/a")
							private static WebElement  StockAdjustment_Header_DepartmentExpandBtn;
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[1]/a")
										private static WebElement  StockAdjustment_Department_Namedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[2]/a")
										private static WebElement  StockAdjustment_Department_Codedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[3]/a")
										private static WebElement  StockAdjustment_Department_Aliasdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[4]/a")
										private static WebElement  StockAdjustment_Department_Currencydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[5]/a")
										private static WebElement  StockAdjustment_Department_GroupLevel1draganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]/ul/li[6]/a")
										private static WebElement  StockAdjustment_Department_GroupLevel1Codedraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]/a")
							private static WebElement  StockAdjustment_AppropriateBasedOndraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]/a")
							private static WebElement  StockAdjustment_AdditionalValuedraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]/a")
							private static WebElement  StockAdjustment_CreatedBydraganddrop;
										
							@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/a")
							private static WebElement  StockAdjustment_Header_CreatedDateExpandBtn;	
							
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[1]/a")
										private static WebElement  StockAdjustment_CreatedDate_CreatedDatedraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[2]/a")
										private static WebElement  StockAdjustment_CreatedDate_Yeardraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[3]/a")
										private static WebElement  StockAdjustment_CreatedDate_Monthdraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[4]/a")
										private static WebElement  StockAdjustment_CreatedDate_DayofYeardraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[5]/a")
										private static WebElement  StockAdjustment_CreatedDate_Daydraganddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[6]/a")
										private static WebElement  StockAdjustment_CreatedDate_Weekdraganddrop;
									
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]/ul/li[7]/a")
										private static WebElement  StockAdjustment_CreatedDate_WeekDaydraganddrop;
							
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/a")
						private static WebElement  StockAdjustment_Header_CreatedTimeExpandBtn;
						
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[1]/a")
										private static WebElement  StockAdjustment_CreatedTime_CreatedTimedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[2]/a")
										private static WebElement  StockAdjustment_CreatedTime_Hourdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[3]/a")
										private static WebElement  StockAdjustment_CreatedTime_Minutedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]/ul/li[4]/a")
										private static WebElement  StockAdjustment_CreatedTime_Seconddrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[14]/a")
						private static WebElement  StockAdjustment_Header_ModifiedBydrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/a")
						private static WebElement  StockAdjustment_Header_ModifiedDateExpandBtn;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[1]/a")
										private static WebElement  StockAdjustment_ModifiedDate_ModifiedDatedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[2]/a")
										private static WebElement  StockAdjustment_ModifiedDate_Yeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[3]/a")
										private static WebElement  StockAdjustment_ModifiedDate_monthdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[4]/a")
										private static WebElement  StockAdjustment_ModifiedDate_DayofYeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[5]/a")
										private static WebElement  StockAdjustment_ModifiedDate_Daydrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[6]/a")
										private static WebElement  StockAdjustment_ModifiedDate_Weekdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[15]/ul/li[7]/a")
										private static WebElement  StockAdjustment_ModifiedDate_WeekDaydrapanddrop;
													
				
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/a")
				    	private static WebElement  StockAdjustment_Header_ModifiedTimeExpandBtn;
														
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[1]/a")
										private static WebElement  StockAdjustment_ModifiedTime_ModifiedTimedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[2]/a")
										private static WebElement  StockAdjustment_ModifiedTime_Hourdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[3]/a")
										private static WebElement  StockAdjustment_ModifiedTime_Minutedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[16]/ul/li[4]/a")
										private static WebElement  StockAdjustment_ModifiedTime_Seconddrapanddrop;
								
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[17]/a")
						private static WebElement  StockAdjustment_Header_PrintCountdrapanddrop;	
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[18]/a")
						private static WebElement  StockAdjustment_Header_RevisionNumberdrapanddrop;	
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[19]/a")
						private static WebElement  StockAdjustment_Header_AuthorizeStatusdrapanddrop;
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/a")
				    	private static WebElement  StockAdjustment_Header_AuthorizeDateExpandBn;
														
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[1]/a")
										private static WebElement  StockAdjustment_AuthorizeDate_AuthorizeDatedrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[2]/a")
										private static WebElement  StockAdjustment_AuthorizeDate_Yeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[3]/a")
										private static WebElement  StockAdjustment_AuthorizeDate_Monthdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[4]/a")
										private static WebElement  StockAdjustment_AuthorizeDate_DayofYeardrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[5]/a")
										private static WebElement  StockAdjustment_AuthorizedDate_Daydrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[6]/a")
										private static WebElement  StockAdjustment_AuthorizeDate_Weekdrapanddrop;
										
										@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[20]/ul/li[7]/a")
										private static WebElement  StockAdjustment_AuthorizeDate_WeekDaydrapanddrop;
										
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[21]/a")
						private static WebElement  StockAdjustment_Header_EMailCountdrapanddrop;
						
						
				// StockAdjustment_Body
						
						@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/a")
						private static WebElement  StockAdjustment_BodyExpandbtn;

									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a")
									private static WebElement  StockAdjustment_Body_ItemtExpansion;
									
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[1]/a")
												private static WebElement  StockAdjustment_Item_Namedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[2]/a")
												private static WebElement  StockAdjustment_Item_Codedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[3]/a")
												private static WebElement  StockAdjustment_Item_Budgetdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[4]/a")
												private static WebElement  StockAdjustment_Item_Aliasdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[5]/a")
												private static WebElement  StockAdjustment_Item_ABCcodeCarryingCostdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[6]/a")
												private static WebElement  StockAdjustment_Item_ABCcodeMargindraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[7]/a")
												private static WebElement  StockAdjustment_Item_ABCcodeRevenuedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[8]/a")
												private static WebElement  StockAdjustment_Item_ABCcodeValuedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[9]/a")
												private static WebElement  StockAdjustment_Item_AlternateCategorydraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[10]/a")
												private static WebElement  StockAdjustment_Item_AlternateCategoryCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[11]/a")
												private static WebElement  StockAdjustment_Item_BarCode1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[12]/a")
												private static WebElement  StockAdjustment_Item_BarCode2draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[13]/a")
												private static WebElement  StockAdjustment_Item_BarCode3draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[14]/a")
												private static WebElement  StockAdjustment_Item_Bindraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[15]/a")
												private static WebElement  StockAdjustment_Item_BinCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[16]/a")
												private static WebElement  StockAdjustment_Item_BinCapacitydraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[17]/a")
												private static WebElement  StockAdjustment_Item_BOMdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[18]/a")
												private static WebElement  StockAdjustment_Item_Categorydraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[19]/a")
												private static WebElement  StockAdjustment_Item_CategoryCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[20]/a")
												private static WebElement  StockAdjustment_Item_CBMdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[21]/a")
												private static WebElement  StockAdjustment_CostOfExcessStockACItem_draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[22]/a")
												private static WebElement  StockAdjustment_Item_CostOfExcessStockACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[23]/a")
												private static WebElement  StockAdjustment_Item_CostOfIssueAccountdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[24]/a")
												private static WebElement  StockAdjustment_Item_CostOfIssueAccountCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[25]/a")
												private static WebElement  StockAdjustment_Item_CostOfSalesReturnACdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[26]/a")
												private static WebElement  StockAdjustment_Item_CostOfSalesReturnACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[27]/a")
												private static WebElement  StockAdjustment_Item_CostOfShortageStockACdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[28]/a")
												private static WebElement  StockAdjustment_Item_CostOfShortageStockACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[29]/a")
												private static WebElement  StockAdjustment_Item_DefaultBaseUnitdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[30]/a")
												private static WebElement  StockAdjustment_Item_DefaultBaseUnitCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[31]/a")
												private static WebElement  StockAdjustment_Item_DefaultPurchaseUnitdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[32]/a")
												private static WebElement  StockAdjustment_Item_DefaultPurchaseUnitcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[33]/a")
												private static WebElement  StockAdjustment_Item_DefaultReplenishmentdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[34]/a")
												private static WebElement  StockAdjustment_Item_DefaultSalesUnitdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[35]/a")
												private static WebElement  StockAdjustment_Item_DefaultSalesUnitcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[36]/a")
												private static WebElement  StockAdjustment_Item_Descriptiondraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[37]/a")
												private static WebElement  StockAdjustment_Item_DontShowProductsExpiringInDaysdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[38]/a")
												private static WebElement  StockAdjustment_Item_Flushingdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[39]/a")
												private static WebElement  StockAdjustment_Item_Heightdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[40]/a")
												private static WebElement  StockAdjustment_Item_IndirectCostdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[41]/a")
												private static WebElement  StockAdjustment_Item_ItemMakedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[42]/a")
												private static WebElement  StockAdjustment_Item_ItemTypedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[43]/a")
												private static WebElement  StockAdjustment_Item_Lengthdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[44]/a")
												private static WebElement  StockAdjustment_Item_ManufacturePolicydraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[45]/a")
												private static WebElement  StockAdjustment_Item_OverHeadCostdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[46]/a")
												private static WebElement  StockAdjustment_Item_PackingBOMdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[47]/a")
												private static WebElement  StockAdjustment_Item_PerishableItemdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[48]/a")
												private static WebElement  StockAdjustment_Item_Printerdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[49]/a")
												private static WebElement  StockAdjustment_Item_Profitdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[50]/a")
												private static WebElement  StockAdjustment_Item_PurchaseVarianceACdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[51]/a")
												private static WebElement  StockAdjustment_Item_PurchaseVarianceACcodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[52]/a")
												private static WebElement  StockAdjustment_Item_ReorderLeveldraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[53]/a")
												private static WebElement  StockAdjustment_Item_SalesAccountdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[54]/a")
												private static WebElement  StockAdjustment_Item_SalesAccountCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[55]/a")
												private static WebElement  StockAdjustment_Item_StandardCostdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[56]/a")
												private static WebElement  StockAdjustment_Item_StocksAccountdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[57]/a")
												private static WebElement  StockAdjustment_Item_StocksAccountCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[58]/a")
											    private static WebElement  StockAdjustment_Item_TaxCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[59]/a")
											    private static WebElement  StockAdjustment_Item_TaxCodecodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[60]/a")
												private static WebElement  StockAdjustment_Item_ValuationMethoddraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[61]/a")
												private static WebElement  StockAdjustment_Item_Weightdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[62]/a")
												private static WebElement  StockAdjustment_Item_Widthdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[63]/a")
												private static WebElement  StockAdjustment_Item_WIPaccountdraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[64]/a")
												private static WebElement  StockAdjustment_Item_WIPaccountCodedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[65]/a")
												private static WebElement  StockAdjustment_Item_GroupLevel1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[66]/a")
												private static WebElement  StockAdjustment_Item_GroupLevel1Codedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[67]/a")
												private static WebElement  StockAdjustment_Item_Buyingratedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[68]/a")
												private static WebElement  StockAdjustment_Item_BuyingVAl1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[69]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal2draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[70]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal3draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[71]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal4draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[72]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal5draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[73]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal6draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[74]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal7draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[75]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal8draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[76]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal9draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[77]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal10draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[78]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal11draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[79]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal12draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[80]/a")
												private static WebElement  StockAdjustment_Item_BuyingVal13draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[81]/a")
												private static WebElement  StockAdjustment_Item_SellingRatedraganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[82]/a")
												private static WebElement  StockAdjustment_Item_SellingVal1draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[83]/a")
												private static WebElement  StockAdjustment_Item_SellingVal2draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[84]/a")
												private static WebElement  StockAdjustment_Item_SellingVal3draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[85]/a")
												private static WebElement  StockAdjustment_Item_SellingVal4draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[86]/a")
												private static WebElement  StockAdjustment_Item_SellingVal5draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[87]/a")
												private static WebElement  StockAdjustment_Item_SellingVal6draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[88]/a")
												private static WebElement  StockAdjustment_Item_SellingVal7draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[89]/a")
												private static WebElement  StockAdjustment_Item_SellingVal8draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[90]/a")
												private static WebElement  StockAdjustment_Item_SellingVal9draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[91]/a")
												private static WebElement  StockAdjustment_Item_SellingVal10draganddrop;
											
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[92]/a")
												private static WebElement  StockAdjustment_Item_SellingVal11draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[93]/a")
												private static WebElement  StockAdjustment_Item_SellingVal12draganddrop;
												
												@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/ul/li[94]/a")
												private static WebElement  StockAdjustment_Item_SellingVal13draganddrop;
											
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
									private static WebElement  StockAdjustment_Body_Quantitydraganddrop;
												
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
									private static WebElement  StockAdjustment_Body_Ratedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a")
									private static WebElement  StockAdjustment_Body_MRNqtydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a")
									private static WebElement  StockAdjustment_Body_Grossdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[6]/a")
									private static WebElement  StockAdjustment_Body_QtyBalancedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[7]/a")
									private static WebElement  StockAdjustment_Body_AverageRatedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[8]/a")
									private static WebElement  StockAdjustment_Body_AddValuedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[9]/a")
									private static WebElement  StockAdjustment_Body_Netdraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[10]/a")
									private static WebElement  StockAdjustment_Body_NetBaseCurrencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[11]/a")
									private static WebElement  StockAdjustment_Body_NetLocalCurrencydraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[12]/a")
									private static WebElement  StockAdjustment_Body_MNRqtyvaluedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[13]/a")
									private static WebElement  StockAdjustment_Body_QtyBalanceValuedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[14]/a")
									private static WebElement  StockAdjustment_Body_AveragerateValuedraganddrop;
									
									@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[15]/a")
									private static WebElement  StockAdjustment_Body_AddValueValuedraganddrop;
						
									
									
									
	
	@FindBy(xpath="//*[@id='60']/div/div")
	private static WebElement  finacinalsMenu;
	
	@FindBy(xpath="//a[@id='61']//span[contains(text(),'Transactions')]")
	private static WebElement  transactionsExpandBtn;
	
	@FindBy(xpath="//a[@id='2007']//span[contains(text(),'Purchases')]")
	private static WebElement  purchasesExpandBtn;
	
	@FindBy(xpath="//*[@id='2062']/span")
	private static WebElement  purchaseVouchersvatBtn;
	
	@FindBy(xpath="//*[@id='txtUsername']")
	private static WebElement username;

	@FindBy(id="txtPassword")
	private static WebElement password;

	@FindBy(id="btnSignin")
	private static WebElement signIn;

    @FindBy(id="ddlCompany")
    private static WebElement companyDropDownList;

	/*@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/header[1]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]")
	private static WebElement userNameDisplay;*/

	@FindBy(xpath="//span[@class='hidden-xs']")
	private static WebElement userNameDisplay;
	
	
	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;

    @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
    private static WebElement logoutOption;
	
    
    @FindBy(xpath="//input[@id='donotshow']")
	private static WebElement doNotShowCheckbox;
    
    @FindBy(xpath="//span[@class='pull-right']")
	private static WebElement closeBtnInDemoPopupScreen;
    	
    
    private static int cSize;
			
    
    
  		@FindBy(xpath="//*[@id='dashName']")
  		private static WebElement dashboard;
									
									
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////						
				
	public static boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(getDriver()); 
			
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	    username.click();
	    Thread.sleep(2000);
		username.clear();
	    Thread.sleep(2000);
	    username.sendKeys(unamelt);
	    getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
		password.click();
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pawslt);
	    
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

	    lp.clickOnSignInBtn();
	    
	    //checkRefershPopOnlogin();
	    
	    //checkPopUpWindow();
	    
	    Thread.sleep(8000);
	          
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	   	userNameDisplay.click();
	           	
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
		
		System.out.println(getDashboard);

	/*	boolean actdashboardGraph     =dashboardGraph.isDisplayed();
		boolean actdashboardLedger    =dashboardLedger.isDisplayed();
		boolean actdashboardInfoPanel =dashboardInfoPanel.isDisplayed();*/
		
	    
	    String expuserInfo            ="SU";
	    String expLoginCompanyName    ="Automation Company ";
	    String expDashboard			  ="Graph with Active and setAsDefault";
	   
		
		System.out.println("***********************************checkLogin*********************************");
	    
	    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
	    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
	    System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);
	   
	  
		if(userInfo.equalsIgnoreCase(expuserInfo) && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	 }
				
	

	@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;
	
	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;
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
	
	public boolean checkPrintOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(1000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsExpandBtn));
		transactionsExpandBtn.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesExpandBtn));
		purchasesExpandBtn.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersvatBtn));
		purchaseVouchersvatBtn.click();
		
		Thread.sleep(2000);
		
		if(Print.isDisplayed())
		{
			System.out.println("Test Pass : Print Option is Displayed");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Print Option is NOT Displayed");
			return false;
		}
		
		
	}
									
									
									
									
		
	public boolean checkPrintScreenOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Print));
		Print.click();
		
		Thread.sleep(2000);
		
		if(LayoutNameTxt.isDisplayed() && LayoutName_CreatelayoutBtn.isDisplayed() && LayoutName_Editlayout.isDisplayed()
				&& DocumentSet.isDisplayed() && DocumentSet_CreatelayoutBtn.isDisplayed() && DocumentSet_Editlayout.isDisplayed()
				&& LayoutOptionsdropdown.isDisplayed() && PreviewBtn.isDisplayed() && PrintBtn.isDisplayed() && CloseBtn.isDisplayed())
		{
			System.out.println("Test Pass : Print screen Options Are Displayed");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Print screen Options Are NOT Displayed");
			return false;
		}
	}
									
									
									
									
	public boolean checkLayoutOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(LayoutOptionsdropdown));
		LayoutOptionsdropdown.click();
		Select s=new Select(LayoutOptionsdropdown);
		int actval=s.getOptions().size();
		
		System.out.println(actval);
		int expval=5;   // to pdf and to Xps is not Displaying
		
		Thread.sleep(2000);
		
		if(actval==expval)
		{
			System.out.println("Test Pass : LayoutOptionsdropdown Options Are Displayed");
			return true;
		}
		else
		{
			System.out.println("Test Fail : LayoutOptionsdropdown Options Are NOT Displayed");
			return false;
		}
	}
									
									
									
	public boolean checkInvoiceDesignOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{							
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(LayoutName_CreatelayoutBtn));
		LayoutName_CreatelayoutBtn.click();
		
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Newdropdown));
		
		if(Newdropdown.isDisplayed() && Opendropdown.isDisplayed() && Savedropdown.isDisplayed() && Removedropdown.isDisplayed()
				&& PageNo.isDisplayed() && Controldrpdown.isDisplayed() && Alignmentdropdown.isDisplayed() && Sizedropdown.isDisplayed()
				&& Printdropdown.isDisplayed() && ExitBtn.isDisplayed() && pagesetupTab.isDisplayed() && designerTab.isDisplayed() 
				&& previewTab.isDisplayed() && FieldsTab.isDisplayed() && PropertiesTab.isDisplayed() )
		{
			System.out.println("Test Pass : Invoice design options Are Displayed");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Invoice design options Are NOT Displayed");
			return false;
		}
	}
									
									
		
	
	public boolean checkFieldsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsTab));
		FieldsTab.click();
		
		if(Finance_Purchases_HeaderExpandBtn.isDisplayed() && PSS_BodyExpandbtn.isDisplayed() && UserDetailsExpandbtn.isDisplayed() 
				&& MiscellaneousExpandBtn.isDisplayed() && CompanyExpandBtn.isDisplayed())
		{
			System.out.println("Test Pass : Fields Options Are Displayed");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Fields Options Are NOT Displayed");
			return false;
		}
	}
									
		
	
	
	public boolean checkHeaderOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Finance_Purchases_HeaderExpandBtn));
		Finance_Purchases_HeaderExpandBtn.click();
		
		Thread.sleep(2000);
		
		if(Finance_Purchases_Header_DocNOdraganddrop.isDisplayed() && Finance_Purchases_Header_DateExpandBtn.isDisplayed()
				&& Finance_Purchases_Header_TimeExpandBtn.isDisplayed() && Finance_Purchases_Header_PurchaseAcExpandBtn.isDisplayed()
				&& Finance_Purchases_Header_VendorACExpandBtn.isDisplayed() && Finance_Purchases_Header_UpdateStockBtn.isDisplayed()
				&& Finance_Purchases_Header_RaiseReceiptBtn.isDisplayed() && Finance_Purchases_Header_WareHouseExpandBtn.isDisplayed()
				&& Finance_Purchases_Narrationdraganddrop.isDisplayed() && Finance_Purchases_Testdraganddrop.isDisplayed()
				&& Finance_Purchases_Formuladraganddrop.isDisplayed() && Finance_Purchases_FDdraganddrop.isDisplayed()
				&& Finance_Purchases_CreatedBydraganddrop.isDisplayed() && Finance_Purchases_Header_CreatedDateExpandBtn.isDisplayed()
				&& Finance_Purchases_Header_CreatedTimeExpandBtn.isDisplayed() && Finance_Purchases_Header_ModifiedBydrapanddrop.isDisplayed()
				&& Finance_Purchases_Header_ModifiedTimeExpandBtn.isDisplayed() && Finance_Purchases_Header_ModifiedDateExpandBtn.isDisplayed()
				&& Finance_Purchases_Header_PrintCountdrapanddrop.isDisplayed() && Finance_Purchases_Header_RevisionNumberdrapanddrop.isDisplayed()
				&& Finance_Purchases_Header_AuthorizeStatusdrapanddrop.isDisplayed() && Finance_Purchases_Header_AuthorizeDateExpandBn.isDisplayed()
				&& Finance_Purchases_Header_EMailCountdrapanddrop.isDisplayed())
		{
			System.out.println("Test Pass : Header Options Are Displayed");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
			FieldsMinimizeBtn.click();
			return true;
		}
		else
		{
			System.out.println("Test Fail : Header Options Are NOT Displayed");
			return false;
		}
	}	
		
		
		
		
	public boolean checkBodyOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PSS_BodyExpandbtn));
		PSS_BodyExpandbtn.click();
		
		Thread.sleep(2000);
		
		if(PSS_Body_ItemtExpansion.isDisplayed() && PSS_Body_UnitExpandBtn.isDisplayed() && PSS_Body_RDdraganddrop.isDisplayed() 
				&& PSS_Body_AvgRate0draganddrop.isDisplayed() && PSS_Body_Quantitydraganddrop.isDisplayed() && PSS_Body_LPurchaseOrdersdraganddrop.isDisplayed()
				&& PSS_Body_Ratedraganddrop.isDisplayed() && PSS_Body_Grossdraganddrop.isDisplayed() && PSS_Body_Batchdraganddrop.isDisplayed()
				&& PSS_Body_BinsExpandBtn.isDisplayed() && PSS_Body_ExpDatedraganddrop.isDisplayed() && PSS_Body_RMAdraganddrop.isDisplayed()
				&& PSS_Body_Netdraganddrop.isDisplayed() && PSS_Body_NetBaseCurrencydraganddrop.isDisplayed() && PSS_Body_NetLocalCurrencydraganddrop.isDisplayed()
				&& PSS_Body_RDValuedraganddrop.isDisplayed() && PSS_Body_AvgRate0Valuedraganddrop.isDisplayed())
		{
			System.out.println("Test Pass : body Options Are Displayed");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
			FieldsMinimizeBtn.click();
			return true;
		}
		else
		{
			System.out.println("Test Fail : body Options Are NOT Displayed");
			return false;
		}
	}	
			
		
		
	public boolean checkUserDetailsOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(UserDetailsExpandbtn));
		UserDetailsExpandbtn.click();
		
		Thread.sleep(2000);
		
		if(UserDetails_UserNamedraganddrop.isDisplayed() && UserDetails_MobileNumberdraganddrop.isDisplayed() && UserDetails_PhoneNumberdraganddrop.isDisplayed()
				&& UserDetails_EmailIddraganddrop.isDisplayed() && UserDetails_Signaturedraganddrop.isDisplayed() && UserDetails_EmployeeExpandBtn.isDisplayed()
				&& UserDetails_AuthoriseUserNamedraganddrop.isDisplayed() && UserDetails_AuthoriseUserMobileNumberdraganddrop.isDisplayed()
				&& UserDetails_AuthoriseUserPhoneNumberdraganddrop.isDisplayed() && UserDetails_AuthoriseUserEmailIddraganddrop.isDisplayed()
				&& UserDetails_AuthoriseUserSignaturedraganddrop.isDisplayed() && UserDetails_AuthoriseBydraganddrop.isDisplayed()
				&& UserDetails_NextUserNamedraganddrop.isDisplayed() && UserDetails_NextUserMobileNumberdraganddrop.isDisplayed()
				&& UserDetails_NextUserPhoneNumberdraganddrop.isDisplayed() && UserDetails_NextUserEmailIddraganddrop.isDisplayed() 
				&& UserDetails_NextUserEmailIddraganddrop.isDisplayed() && UserDetails_NextUserSignaturedraganddrop.isDisplayed()
				&& UserDetails_CreatedBySignaturedraganddrop.isDisplayed() && UserDetails_ModifiedBySignaturedraganddrop.isDisplayed())
				
		{
			System.out.println("Test Pass : Userdetails Options Are Displayed");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
			FieldsMinimizeBtn.click();
			return true;
		}
		else
		{
			System.out.println("Test Fail : Userdetails Options Are NOT Displayed");
			return false;
		}
	}	
		
		
		
		
		
	public boolean checkMiscellaneousOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousExpandBtn));
		MiscellaneousExpandBtn.click();
		
		Thread.sleep(2000);
		
		if(Miscellaneous_LoginNamedraganddrop.isDisplayed() && Miscellaneous_PageNumberdraganddrop.isDisplayed() && Miscellaneous_PrintDatedraganddrop.isDisplayed()
				&& Miscellaneous_PrintTimedraganddrop.isDisplayed() && Miscellaneous_TotalPagedraganddrop.isDisplayed() && Miscellaneous_SrNodraganddrop.isDisplayed()
				&& Miscellaneous_PageTypedraganddrop.isDisplayed() && Miscellaneous_AgeingMonthWisedraganddrop.isDisplayed()
				&& Miscellaneous_AgeingBalancedraganddrop.isDisplayed() && Miscellaneous_AgeingSlab1draganddrop.isDisplayed()
				&& Miscellaneous_AgeingSlab2draganddrop.isDisplayed() && Miscellaneous_AgeingSlab3draganddrop.isDisplayed()
				&& Miscellaneous_AgeingSlab4draganddrop.isDisplayed() && Miscellaneous_AgeingSlab5draganddrop.isDisplayed() 
				&& Miscellaneous_AgeingSlab6draganddrop.isDisplayed() && Miscellaneous_AgeingSlab7draganddrop.isDisplayed()
				&& Miscellaneous_LastSlabdraganddrop.isDisplayed())
				
		{
			System.out.println("Test Pass : Miscellaneous Options Are Displayed");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
			FieldsMinimizeBtn.click();
			return true;
		}
		else
		{
			System.out.println("Test Fail : Miscellaneous Options Are NOT Displayed");
			return false;
		}
	}	
		
		
		
		
	public boolean checkCompanyOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(3000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(CompanyExpandBtn));
		CompanyExpandBtn.click();
		
		Thread.sleep(2000);
		
		if(Company_CompanyLogodraganddrop.isDisplayed() && Company_CompanyNamedraganddrop.isDisplayed() && Comapny_AccountingDateExpandbtn.isDisplayed()
				&& Company_Countrydraganddrop.isDisplayed() && Company_Currencydraganddrop.isDisplayed() && Company_DefaultLangdraganddrop.isDisplayed()
				&& Company_SupportedLangdraganddrop.isDisplayed())
				
		{
			System.out.println("Test Pass : Company Options Are Displayed");
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
			FieldsMinimizeBtn.click();
			return true;
		}
		else
		{
			System.out.println("Test Fail : Company Options Are NOT Displayed");
			return false;
		}
	}		
		
		
	
	@FindBy(xpath="//span[contains(text(),'DocNo')]")
	private static WebElement  Finance_Purchases_Header_DocNOdraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Header')]")
	private static WebElement  clickonHeader;
	
	@FindBy(xpath="//div[@id='dvCreateViewMain']/div/div[2]/span/i")
	private static WebElement headerPlus;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]/a/span/text()")
	private static WebElement clickOnDoc;
	
	@FindBy(xpath="//div[@id='InvoiceDesignFields']/ul/li/ul/li/a/span")
	private static WebElement docNo;
	
	@FindBy(xpath="//*[@id='id_LayoutDiv_0")
	private static WebElement docNoo;
	
	@FindBy(xpath="//div[@id='StaticText_0_2002']//p[contains(text(),'DocNo')]")
	private static WebElement draggedDocNo;
	
		
	public boolean checkDraggingFieldsToDesignArea() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickonHeader));
		clickonHeader.click();
	
		//getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnDoc));
		//clickOnDoc.click();
		
		Thread.sleep(5000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(docNo));
		docNo.click();
		
		Thread.sleep(5000);
		
		getAction().dragAndDropBy(docNo, 100, 25);
		
		Thread.sleep(5000);
		
		if(draggedDocNo.isDisplayed())
		{
			System.out.println("Test Pass : DocNo Dragged");
			return true;
		}
		else
		{
			System.out.println("Test Fai : DocNo NOt Dragged");
			return false;
		}
	}
		
	public static boolean checkDragandDropHeaderFiledsIntoLayout() throws InterruptedException, IOException
	{
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickonHeader));
		clickonHeader.click();
		
		
		
		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\PurchasesVatPrint1.exe");
		 
		Thread.sleep(100000);
		
		if(true)
		{
			return true;
		}
		
		
		else{
			return false;
		}
	}
	
	
		
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/a/span")
	private static WebElement  clickOnBody;
	
	@FindBy(xpath="//*[@id='id_PopuplayoutName']")
	private static WebElement  layoutNameTextField;
	
	@FindBy(xpath="//*[@id='id_layoutName']")
	private static WebElement  SavedlayoutNameTitle;
	
		public static boolean checkDragandDropBodyFiledsIntoLayout() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
		{
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickonHeader));
			clickonHeader.click();
			Thread.sleep(2000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnBody));
			clickOnBody.click();
			Thread.sleep(2000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Finance_Purchases_Header_WareHouseExpandBtn));
			Finance_Purchases_Header_WareHouseExpandBtn.click();
			
			Thread.sleep(5000);
			Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\PurchasesBodyPrint.exe");
			 
			Thread.sleep(100000);
			Thread.sleep(50000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Savedropdown));
			Savedropdown.click();
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			SaveBtn.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(layoutNameTextField));
			layoutNameTextField.sendKeys("PurchasesVoucherVatPrint");
			
			Thread.sleep(1000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Save_OkBtn));
			Save_OkBtn.click();
			
			String expMessage = "Layout saved successfully";
			String actMessage = checkValidationMessage(expMessage);
			
			Thread.sleep(2000);
			
			String actTitle = SavedlayoutNameTitle.getText();
			String expTitle ="[PurchasesVoucherVatPrint]";
			
		
			if(actMessage.equalsIgnoreCase(expMessage) && actTitle.equalsIgnoreCase(expTitle))
			{
				return true;
			}
			else{
				return false;
			}
		}
		
		
		@FindBy(xpath="//*[@id='BodyColumn_2000_0']")
		private static WebElement warehouseTxtField;
		
		@FindBy(xpath="//*[@id='BodyColumn_2000_1']")
		private static WebElement itemTxtField;
		
		@FindBy(xpath="//*[@id='BodyColumn_2000_2']")
		private static WebElement taxCodeTxtField;
		
		@FindBy(xpath="//*[@id='BodyColumn_2000_3']")
		private static WebElement purchaseAccountTxtfiled;
		
		@FindBy(xpath="//*[@id='BodyColumn_2000_4']")
		private static WebElement unitTxtField;
		
		@FindBy(xpath="//*[@id='BodyColumn_2000_5']")
		private static WebElement quantityTxtField;
		
		@FindBy(xpath="//*[@id='BodyColumn_2000_6']")
		private static WebElement rateTxtField;
		
		@FindBy(xpath="//*[@id='BodyColumn_2000_7']")
		private static WebElement grossTxtField;
		
		@FindBy(xpath="//*[@id='BodyColumn_2000_8']")
		private static WebElement vatTxtField;
		
		
		@FindBy(xpath="/html/body/ul/li[5]/span")
		private static WebElement PropertiesBtn;
		
		@FindBy(xpath="//*[@id='FTextBox_13_2000']")
		private static WebElement widthTxt;
		
		
		@FindBy(xpath="//*[@id='FTextBox_17_2000']")
		private static WebElement widthTxt2;
		
		@FindBy(xpath="//*[@id='Combobox_2_2000']")
		private static WebElement Txtalignment;
		
		
		public static boolean checkChangeFieldPropertiesInLyout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{

			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatTxtField));
			getAction().contextClick(vatTxtField).build().perform();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(3000);
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(widthTxt2));
			getAction().doubleClick(widthTxt2).build().perform();
			widthTxt2.sendKeys("60");
			
			

			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(grossTxtField));
			getAction().contextClick(grossTxtField).build().perform();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(3000);
			
		
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(widthTxt2));
			getAction().doubleClick(widthTxt2).build().perform();
			widthTxt2.sendKeys("60");
			
		
			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateTxtField));
			getAction().contextClick(rateTxtField).build().perform();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(3000);
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(widthTxt2));
			getAction().doubleClick(widthTxt2).build().perform();
			widthTxt2.sendKeys("60");
			
			
			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(quantityTxtField));
			getAction().contextClick(quantityTxtField).build().perform();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(3000);
			
		
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(widthTxt2));
			getAction().doubleClick(widthTxt2).build().perform();
			widthTxt2.sendKeys("60");
			
			//////////////
			
			
			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountTxtfiled));
			getAction().contextClick(purchaseAccountTxtfiled).build().perform();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(4000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(widthTxt));
			getAction().doubleClick(widthTxt).build().perform();
			widthTxt.sendKeys("120");
			
			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemTxtField));
			getAction().contextClick(itemTxtField).build().perform();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(widthTxt));
			getAction().doubleClick(widthTxt).build().perform();
			widthTxt.sendKeys("120");
			
			Thread.sleep(3000);
					
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseTxtField));
			getAction().contextClick(warehouseTxtField).build().perform();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(widthTxt));
			getAction().doubleClick(widthTxt).build().perform();
			widthTxt.sendKeys("90");
			
			

			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatTxtField));
			getAction().contextClick(vatTxtField).build().perform();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(2000);
			
			
			Select sc= new Select(Txtalignment);
			sc.selectByVisibleText("Left");
			
			
			
			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(grossTxtField));
			getAction().contextClick(grossTxtField).build().perform();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(2000);
	
			sc.selectByVisibleText("Left");

			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateTxtField));
			getAction().contextClick(rateTxtField).build().perform();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(2000);
	
			sc.selectByVisibleText("Left");
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(quantityTxtField));
			getAction().contextClick(quantityTxtField).build().perform();
			
			Thread.sleep(4000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
			PropertiesBtn.click();
			
			Thread.sleep(2000);
		
			sc.selectByVisibleText("Left");
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Savedropdown));
			Savedropdown.click();
			Thread.sleep(2000);
		
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			SaveBtn.click();
			
			
			String expMessage = "Layout saved successfully";
			String actMessage = checkValidationMessage(expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				return true;
				
			} else
			{
				
				return false;

			}
				
		}
		
		@FindBy(xpath="//tr[@id='trRender_1']//td//input")
		 private static WebElement  grid_ChkBox1;

		@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[5]")
			private static List<WebElement> grid_VoucherNoList;

		@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
			private static List<WebElement> grid_CheckBoxList;

		@FindBy(xpath="//span[@class='icon-print icon-font6']")
		private static WebElement  printBtn;

		@FindBy(xpath="//*[@id='btnPrint']")
		private static WebElement footerPrintBtn;
		
		public boolean checkPrintPdfOfPurchaseVoucherVAT() throws Exception, EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
		{
			File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\PurchaseVoucherVATPrint.pdf");
			
			if(Efile.exists())
			{
				Efile.delete();
			}
			
			Thread.sleep(4000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExitBtn));
			ExitBtn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));
			
			int count = grid_VoucherNoList.size();
            
            for (int i = 0; i < count; i++) 
            {
                String VoucherNo = grid_VoucherNoList.get(i).getText();
                
                if (VoucherNo.equalsIgnoreCase("SU/DUB/TEXT1")) 
                {
                	if (grid_CheckBoxList.get(i).isSelected()==false) 
                	{
                		grid_CheckBoxList.get(i).click();
                        break;
					}
                }
            }      
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printBtn));
			printBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LayoutNameTxt));
			LayoutNameTxt.click();
			LayoutNameTxt.sendKeys(Keys.END);
			LayoutNameTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			Thread.sleep(2000);
			LayoutNameTxt.sendKeys("PurchasesVoucherVatPrint");
			Thread.sleep(2000);
			LayoutNameTxt.sendKeys(Keys.TAB);
			Thread.sleep(2000);
			
			
			Select s = new Select(LayoutOptionsdropdown);
			s.selectByValue("3");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(footerPrintBtn));
			footerPrintBtn.click();
			
			Thread.sleep(5000);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(2000);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(2000);
				
			Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\SavingPrintPDFInPurchaseVoucher.exe");
			
			Thread.sleep(5000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(2000);
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
				
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 3;
			
			System.out.println("Number of Windows  : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
			
			Thread.sleep(1000);

		 	getDriver().switchTo().window(openTabs.get(2)).close();
		 	Thread.sleep(1000);
		 	getDriver().switchTo().window(openTabs.get(1)).close();
		 	Thread.sleep(1000);
		 	getDriver().switchTo().window(openTabs.get(0));
		 	
		 	
		 	String actPDF = getBaseDir()+"\\autoIt\\ExportFiles\\PurchasesVoucherVatPrint.pdf";
			String expPDF = getBaseDir()+"\\autoIt\\ImportFiles\\PurchasesVoucherVatPrint.pdf";
			
			PDFUtil pdfutil = new PDFUtil();
			
			boolean result = pdfutil.compare(actPDF, expPDF);
			
			String actData = pdfutil.getText(actPDF);
			String expData = pdfutil.getText(expPDF);
			
			System.err.println(actData);
			System.err.println(expData);
			
			System.out.println("Compared Result  : "+result);
			
			if (actData.equalsIgnoreCase(expData)) 
			{
				return true;
			}
			else
			{
				return false;
			}
}
		
		
		@FindBy(xpath="//*[@id='BodyGrid_0_2000']")
		private static WebElement bodyGrid ;
		
		
		@FindBy(xpath="//*[@id='FTextBox_25_2000']")
		private static WebElement bodyGridTopTextFiled;
		
		public static boolean checkSavingPurchasesVatDesignLayout() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			Thread.sleep(1000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsExpandBtn));
			transactionsExpandBtn.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesExpandBtn));
			purchasesExpandBtn.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersvatBtn));
			purchaseVouchersvatBtn.click();
			
			Thread.sleep(2000);

			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Print));
			Print.click();
			
			Thread.sleep(2000);

			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(LayoutName_CreatelayoutBtn));
			LayoutName_CreatelayoutBtn.click();
			
			Thread.sleep(3000);
			

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickonHeader));
			clickonHeader.click();
			
			
			
			Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\PurchasesVatPrint1.exe");
			 
			Thread.sleep(100000);
			

				Thread.sleep(3000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickonHeader));
				clickonHeader.click();
				Thread.sleep(2000);
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnBody));
				clickOnBody.click();
				Thread.sleep(2000);
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Finance_Purchases_Header_WareHouseExpandBtn));
				Finance_Purchases_Header_WareHouseExpandBtn.click();
				
				Thread.sleep(5000);
				Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\PurchasesBodyPrint.exe");
				 
				Thread.sleep(100000);
				Thread.sleep(50000);
				
				
				Thread.sleep(3000);
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(bodyGrid));
				getAction().contextClick(bodyGrid).build().perform();
				
				Thread.sleep(2000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesBtn));
				PropertiesBtn.click();
				
				Thread.sleep(3000);
				
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(bodyGridTopTextFiled));
				getAction().doubleClick(bodyGridTopTextFiled).build().perform();
				bodyGridTopTextFiled.sendKeys("220");
				
				
				Thread.sleep(3000);
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Savedropdown));
				Savedropdown.click();
				Thread.sleep(2000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
				SaveBtn.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(layoutNameTextField));
				layoutNameTextField.sendKeys("PurchasesVoucherDesignLayout");
				
				Thread.sleep(1000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Save_OkBtn));
				Save_OkBtn.click();
				
				String expMessage = "Layout saved successfully";
				String actMessage = checkValidationMessage(expMessage);
				
			
				Thread.sleep(4000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExitBtn));
				ExitBtn.click();
				
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Print));
				Print.click();
				
				Thread.sleep(2000);
				
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(layoutTab));
				layoutTab.click();
				Thread.sleep(2000);
				
				ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 
				
				int count=designLayoutList.size();

				System.err.println(count);
				
				for(int i=0 ; i < count ;i++)
				{
					String data=designLayoutList.get(i).getText();
					
					if (data.equalsIgnoreCase("PurchasesVoucherDesignLayout")) 
					{
						designLayoutList.get(i).click();
						break;
					}
				}
				Thread.sleep(2000);
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(LayoutName_Editlayout));
				LayoutName_Editlayout.click();
				
				
				
				String actTitle = SavedlayoutNameTitle.getText();
				String expTitle ="[PurchasesVoucherDesignLayout]";

				
				
				if (actMessage.equalsIgnoreCase(expMessage) && actTitle.equalsIgnoreCase(expTitle) )
				{
					return true;
					
				} 
				else
				{
					return false;
				}
			
		}
		
		@FindBy(xpath="//*[@id='opt_LayoutID_input_image']/span")
		private static WebElement layoutTab;
		
		
		@FindBy(xpath="//tbody[@id='opt_LayoutID_table_body']/tr/td[2]")
		private static List<WebElement> designLayoutList;
		

		public static boolean checkEditingLayoutByAddingFields() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
		{
			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsExpandBtn));
			transactionsExpandBtn.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesExpandBtn));
			purchasesExpandBtn.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersvatBtn));
			purchaseVouchersvatBtn.click();
			
			Thread.sleep(2000);

			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Print));
			Print.click();
			
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(layoutTab));
			layoutTab.click();
			Thread.sleep(2000);
			
			ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 
			
			int count=designLayoutList.size();

			System.err.println(count);
			
			for(int i=0 ; i < count ;i++)
			{
				String data=designLayoutList.get(i).getText();
				
				if (data.equalsIgnoreCase("PurchasesVoucherDesignLayout")) 
				{
					designLayoutList.get(i).click();
					break;
				}
			}
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(LayoutName_Editlayout));
			LayoutName_Editlayout.click();
			
			Thread.sleep(3000);
			
			
			Thread.sleep(5000);
			Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\EditLayout.exe");
			 
			Thread.sleep(100000);
			
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Savedropdown));
			Savedropdown.click();
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
			SaveBtn.click();
			
			String expMessage = "Layout saved successfully";
			String actMessage = checkValidationMessage(expMessage);
			
			
			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				
				return true;
				
			} else {
				return false;

			}
			
		}

		@FindBy(xpath="//*[@id='StaticText_0_2017']")
		private static WebElement exchangeRateFiled;
		
		@FindBy(xpath="//*[@id='StaticText_0_2019']")
		private static WebElement locexchangeRateFiled;
		
		
		@FindBy(xpath="//*[@id='BodyColumn_2000_9']")
		private static WebElement discountFiledInbody;
		
	
		public static boolean checkUpdatedLayoutAndDeleteTheLayout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{

			Thread.sleep(3000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsExpandBtn));
			transactionsExpandBtn.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesExpandBtn));
			purchasesExpandBtn.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersvatBtn));
			purchaseVouchersvatBtn.click();
			
			Thread.sleep(2000);

			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Print));
			Print.click();
			
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(layoutTab));
			layoutTab.click();
			Thread.sleep(2000);
			
			ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 
			
			int count=designLayoutList.size();

			System.err.println(count);
			
			for(int i=0 ; i < count ;i++)
			{
				String data=designLayoutList.get(i).getText();
				
				if (data.equalsIgnoreCase("PurchasesVoucherDesignLayout")) 
				{
					designLayoutList.get(i).click();
					break;
				}
			}
			
		
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(LayoutName_Editlayout));
			LayoutName_Editlayout.click();
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateFiled));
			boolean actExchangeField = exchangeRateFiled.isDisplayed();
			boolean expExchangeField = true;
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(locexchangeRateFiled));
			boolean actlocExchangeField = locexchangeRateFiled.isDisplayed();
			boolean explocExchangeField = true;
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(discountFiledInbody));
			boolean actDiscountField = discountFiledInbody.isDisplayed();
			boolean expDiscountField = true;
			
			
			Thread.sleep(3000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(Removedropdown));
			Removedropdown.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(RemoveBtn));
			RemoveBtn.click();
			

			getWaitForAlert();
			
			getAlert().accept();
			
			String expMessage = "Layout Deleted Successfully";
			String actMessage = checkValidationMessage(expMessage);
			
			System.out.println("ExchangeField 	  : " + actExchangeField + " 	 Value Expected : " + expExchangeField);
			System.out.println("locExchangeField  : " + actlocExchangeField + "  Value Expected : " + explocExchangeField);
			System.out.println("DiscountField  : " + actDiscountField + "  Value Expected : " + expDiscountField);
			
			if (actExchangeField == expExchangeField && actlocExchangeField == explocExchangeField 
					&& actDiscountField == expDiscountField && actMessage.equalsIgnoreCase(expMessage))  
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
	public VoucherPrintPage(WebDriver driver)
	{
		
		 PageFactory.initElements(driver, this);
		
	}
	
															
	
}
