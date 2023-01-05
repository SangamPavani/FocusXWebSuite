package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.stringtemplate.v4.compiler.CodeGenerator.conditional_return;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.JSConsole;

public class FAReportsPage extends BaseEngine

{

	@FindBy(xpath="//*[@id='dashName']")
    private static WebElement labelDashboard ;
	// FA REPORTS
	
	
		@FindBy(xpath="//*[@id='60']//div[contains(text(),'Financials')]")
		private static WebElement  financialsMenu;
		
		@FindBy(xpath="//*[@id='81']/span")
		private static WebElement  financialsReportsMenu; 
		    
		@FindBy(xpath="//*[@id='500']/span")
		private static WebElement  ledger;
		
		@FindBy(xpath="//*[@id='658']/span")
		private static WebElement  ledgerDetail;
					
		@FindBy(xpath="//*[@id='501']/span")
		private static WebElement  subLedger;
		
		@FindBy(xpath="//*[@id='82']/span")
		private static WebElement  cashAndBankBooksMenu;
		
		@FindBy(xpath="//*[@id='510']/span")
		private static WebElement  cashBookReport;
		
		@FindBy(xpath="//*[@id='511']/span")
		private static WebElement  bankBookReport;
		
		@FindBy(xpath="//*[@id='512']/span")
		private static WebElement  pettyCashBokReport;
		
		@FindBy(xpath="//*[@id='513']/span")
		private static WebElement  dayBookReport;
		
		@FindBy(xpath="//*[@id='83']/span")
		private static WebElement  bankReconciliationReport;
		
		@FindBy(xpath="//*[@id='84']/span")
		private static WebElement  bankReconciliationImport;
		
		@FindBy(xpath="//*[@id='85']/span")
		private static WebElement  customerVendorReconciliation;

		@FindBy(xpath="//*[@id='537']/span")
		private static WebElement  bankReconciliationStatement;
			
		@FindBy(xpath="//*[@id='162']/span")
		private static WebElement chequeDiscountingMenu;
				
		@FindBy(xpath="//*[@id='502']/span")
		private static WebElement  salesReportsMenu;
		
		@FindBy(xpath="//*[@id='503']/span")
		private static WebElement  salesRegisterReport;

		@FindBy(xpath="//*[@id='504']/span")
		private static WebElement  salesReturnRegisterReport;
		
		@FindBy(xpath="//*[@id='505']/span")
		private static WebElement summarySalesBookReport;
		
		@FindBy(xpath="//*[@id='628']/span")
		private static WebElement monthlySalesBookReport;
		
		@FindBy(xpath="//*[@id='629']/span")
		private static WebElement  topCustomersListReport;
				
		@FindBy(xpath="//*[@id='506']/span")
		private static WebElement  purchaseReportsMenu;
				
		@FindBy(xpath="//*[@id='507']/span")
		private static WebElement  purchaseRegisterReport;
		
		@FindBy(xpath="//*[@id='508']/span")
		private static WebElement  purchaseReturnRegisteReport;
		
		@FindBy(xpath="//*[@id='509']/span")
		private static WebElement  summaryPurchaseBookReport;
							
		@FindBy(xpath="//*[@id='514']/span")
		private static WebElement  registersReportMenu;
				
		@FindBy(xpath="//*[@id='516']/span")
		private static WebElement  openingBalanceRegisterReport;
		
		@FindBy(xpath="//*[@id='515']/span")
		private static WebElement journalEntriesRegisterReport;
		
		@FindBy(xpath="//span[contains(text(),'Credit Note Register')]")
		private static WebElement creditNoteRegisterReport;
		
		@FindBy(xpath="//*[@id='610']/span")
		private static WebElement  debitNoteRegisterReport;
		
		@FindBy(xpath="//*[@id='598']/span")
		private static WebElement  receiptsRegisterReport;
		
		@FindBy(xpath="//*[@id='599']/span")
		private static WebElement  paymentRegisterReport;
		
		@FindBy(xpath="//*[@id='518']/span")
		private static WebElement  pdcReceiptsRegisterReport;
		
		@FindBy(xpath="//*[@id='519']/span")
		private static WebElement pdcPaymentsRegisterReport;
		
		@FindBy(xpath="//*[@id='517']/span")
		private static WebElement  entryJournalRegisterReport;
		
		@FindBy(xpath="//span[contains(text(),'Entry journal detail report')]")
		private static WebElement  entryJournalDetailReport;
		
							
		@FindBy(xpath="//*[@id='523']/span")
		private static WebElement  salesAndPurchasesReportMenu;
				
		@FindBy(xpath="//*[@id='524']/span")
		private static WebElement  salesGroupedByCustomerReport;
		
		@FindBy(xpath="//*[@id='525']/span")
		private static WebElement  salesGroupedByProductReport;
		
		@FindBy(xpath="//*[@id='526']/span")
		private static WebElement  salesGroupedByDepartmentReport;
		
		@FindBy(xpath="//*[@id='527']/span")
		private static WebElement  purchasesGroupedByVendorReport;
		
		@FindBy(xpath="//*[@id='528']/span")
		private static WebElement  purchasesGroupedByProductReport;
		
		@FindBy(xpath="//*[@id='529']/span")
		private static WebElement  purchasesGroupedByDepartmentReport;		
				
		@FindBy(xpath="//*[@id='568']/span")
		private static WebElement  MiscellaneousAnalysisReportMenu;
				
		@FindBy(xpath="//*[@id='569']/span")
		private static WebElement  peakAndLowBalancesReport;
		
		@FindBy(xpath="//*[@id='570']/span")
		private static WebElement  comprativeAnalysisReport;
		
		@FindBy(xpath="//*[@id='571']/span")
		private static WebElement  transactionsTypeAnalysisReport;
		
		@FindBy(xpath="//*[@id='572']/span")
		private static WebElement  abcAnalysisReport;
		
		@FindBy(xpath="//*[@id='597']/span")
		private static WebElement  interestCalculationReport;

		@FindBy(xpath="//*[@id='536']/span")
		private static WebElement  mastersInformationMenu;
				
	 	@FindBy(xpath="//*[@id='538']/span")
		private static WebElement  masterInfoMenu;
		
		@FindBy(xpath="//*[@id='144']/span")
		private static WebElement  productLabelMenu;
		
		@FindBy(xpath="//*[@id='573']/span")
		private static WebElement  unitConversionMenu;
			
		@FindBy(xpath="//*[@id='147']/span")
		private static WebElement  skidDefinitionMenu;
									
		@FindBy(xpath="//*[@id='520']/span")
		private static WebElement  auditTrailMenu;
				
		@FindBy(xpath="//*[@id='521']/span")
		private static WebElement  auditTrailtransactionsReport;
		
		@FindBy(xpath="//*[@id='522']/span")
		private static WebElement  aAuditTrailloginsReport;
				
		@FindBy(xpath="//*[@id='204']/span")
		private static WebElement  accountQuery;
		
		@FindBy(xpath="//span[contains(text(),'Transaction authorization report')]")
		private static WebElement  transactionAuthorizationReport;
		
		
		
		
		@FindBy(xpath="//*[@id='711']//span[contains(text(),'Master authorization report')]")
		private static WebElement  masterAuthorizationReport;
		
		
		
		
		@FindBy(xpath="//div[@id='spnhiererchy']//select[@id='iTreeId']")
		private static WebElement sl_Dropdown1;
		
		@FindBy(xpath="//div[@id='spnhiererchy']//select[@id='iTreeViewId']")
		private static WebElement sl_Dropdown2;
		
		@FindBy(xpath="//label[@id='oncheckaccorderan']")
		private static WebElement sl_oncheckBtn;
		
		@FindBy(xpath="//input[@id='txtsrch-term']")
		private static WebElement sl_SearhItemTxt;
		
		@FindBy(xpath="//i[contains(@class,'icon-search theme_color-inverse')]")
		private static WebElement sl_SearchBtn;
		
		@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
		private static WebElement sl_MasterTypeTxt;
		
		@FindBy(xpath="//span[contains(@class,'icon-font6 icon-external-module theme_icon-color')]")
		private static WebElement sl_AutoAdjustColumnsBtn;
		
		@FindBy(xpath="//a[contains(@class,'clsMasterName')][contains(text(),'ITEMS GROUP')]")
		private static WebElement sl_ItemGroupsBtn;
		
		@FindBy(xpath="//input[@id='liSelectAllMasters']")
		private static WebElement sl_HeaderSelectChkBox;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-schedule')]")
		private static WebElement sl_ScheduleBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-custamize')]")
		private static WebElement sl_CustomizeBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-filter')]")
		private static WebElement sl_FilterBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-ok')]")
		private static WebElement sl_OkBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-close')]")
		private static WebElement sl_CloseBtn;
		
		@FindBy(xpath="//select[@id='DateOptions_']")
		private static WebElement sl_DateOptionDropdown;
		
		@FindBy(xpath="//input[@id='id_starting_date_']")
		private static WebElement sl_StartDateTxt;
		
		@FindBy(xpath="//td[@id='id_starting_date__input_image']//span[contains(@class,'icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow')]")
		private static WebElement sl_StartDateCalanderBtn;
		
		@FindBy(xpath="//input[@id='id_ending_date_']")
		private static WebElement sl_EndDateTxt;
		
		@FindBy(xpath="//td[@id='id_ending_date__input_image']//span[contains(@class,'icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow')]")
		private static WebElement sl_EndDateCalanderBtn;
		
		@FindBy(xpath="//input[@id='RITCheckbox__3']")
		private static WebElement sl_IncludeServiceTypeItemChkBox;
		
		@FindBy(xpath="//select[@id='RITLayout_']")
		private static WebElement sl_LayoutDropdown;
		
		@FindBy(xpath="//select[@id='RITOutput_']")
		private static WebElement sl_OutputDropdown;
		
		@FindBy(xpath="//input[@id='selectAllMasters_']")
		private static WebElement sl_SelectAllItemsChkBox;
		
		@FindBy(xpath="//div[contains(@class,'first')]//input[contains(@class,'btn btn-xs Fbutton')]")
		private static WebElement sl_FirstBtn;
		
		@FindBy(xpath="//div[contains(@class,'prev')]//input[contains(@class,'btn btn-xs Fbutton')]")
		private static WebElement sl_PreviousBtn;
		
		@FindBy(xpath="//input[@id='btn1']")
		private static WebElement sl_PageBtn;
		
		@FindBy(xpath="//div[contains(@class,'next')]//input[contains(@class,'btn btn-xs Fbutton')]")
		private static WebElement sl_NextBtn;
		
		@FindBy(xpath="//div[contains(@class,'End')]//input[contains(@class,'btn btn-xs Fbutton')]")
		private static WebElement sl_EndBtn;
		
		@FindBy(xpath="//tr[1]//td[8]//div[1]//label[1]")
		private static WebElement sl_1stRowChkBox;
		
		@FindBy(xpath="//tr[2]//td[8]//div[1]//label[1]")
		private static WebElement sl_2ndRowChkBox;
		
		////////

		@FindBy(xpath="//i[contains(@class,'theme_button_color dropdown-toggle')]")
		private static WebElement report_sortingBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-refresh')]")
		private static WebElement report_RefreshBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-print')]")
		private static WebElement report_PrintBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-export')]")
		private static WebElement report_ExportBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-graph ImagesinArabic')]")
		private static WebElement report_GraphBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-backtrack')]")
		private static WebElement report_BackTrackBtn;
				
		@FindBy(xpath="//span[@id='reportCustomize_']//i[contains(@class,'icon-font6 icon-custamize')]")
		private static WebElement report_ReportCustomizeBtn;
				
		@FindBy(xpath="//span[@id='filterIcon_']//i[contains(@class,'icon-font6 icon-filter')]")
		private static WebElement report_FilterBtn;
		
		@FindBy(xpath="//span[@id='idFilterCustomizeIcon']")
		private static WebElement  report_FilterCustomizeBtn;
		
		@FindBy(xpath="//span[@id='a']")
		private static WebElement  report_Filter_FilterBtn;
		
		@FindBy(xpath="//*[@id='551_0_AdvanceFilter']/table/tbody/tr/td[1]/select")
		private static WebElement  reportsAdvanced_WhereDropDown;
		
		@FindBy(xpath="//tbody//input[@placeholder='Select Field']")
		private static WebElement  reportsAdvanced_SelectFielddropdown;
		
		@FindBy(xpath="//table/tbody/tr/td[3]/select")
		private static WebElement  reportsAdvanced_SelectOperatorDropDown;
		
		@FindBy(xpath="//table/tbody/tr/td[4]/select")
		private static WebElement  reportsAdvanced_ComparewithDropDown;
		
		@FindBy(xpath="//table/tbody/tr/td[5]/input")
		private static WebElement  reportsAdvanced_ValueTxt;
		
		@FindBy(xpath="//input[@id='advancefilter_master_551_0']")
		private static WebElement  reportsAdvanced_EnterValue;
		
		@FindBy(xpath="//table/tbody/tr/td[7]/span")
		private static WebElement  reportsAdvanced_AddIconBtn;
		
		@FindBy(xpath="//table/tbody/tr/td[6]/span")
		private static WebElement  reportsAdvanced_DeleteIcon1Btn;
		
		@FindBy(xpath="//table/tbody/tr[2]/td[6]/span")
		private static WebElement  reportsAdvanced__DeleteIcon2Btn;
		
		@FindBy(xpath="//div[@id='filterTree_551_0_AdvanceFilter']//a[@id='536870916']")
		private static WebElement  reports_AdvancedFilter_SelectField_WH_ExpandBtn;
		
		@FindBy(xpath="//div[@id='filterTree_551_0_AdvanceFilter']//a[@id='5058']")
		private static WebElement  reports_AdvancedFilter_SelectField_WH_NameBtn;
		
		@FindBy(xpath="//input[@id='chkSaveFilter']")
		private static WebElement  report_FilterSaveFilterPermanentlyChkBox;
		
		@FindBy(xpath="//span[@id='filterRefresh']")
		private static WebElement  report_Filter_RefreshBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon icon-ok')]")
		private static WebElement  report_FilterOkBtn;
		
		@FindBy(xpath="//i[contains(@class,'icon icon-close')]")
		private static WebElement  report_FilterCancelBtn;
				
		@FindBy(xpath="//div[@id='dvfilter_']//span[contains(@class,'icon-down-arrow icon-font8 dropdown-toggle theme_button_color')]")
		private static WebElement report_FilterDownBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-analyze')]")
		private static WebElement report_AnalyzeBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-cross-reference')]")
		private static WebElement report_CrossReferenceBtn;
				
		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-options')]")
		private static WebElement report_OptionsBtn;
				
		@FindBy(xpath="//div[@id='dvoptions_']//span[contains(@class,'icon-down-arrow icon-font8 dropdown-toggle theme_button_color')]")
		private static WebElement report_OptionsDownBtn;
				
		@FindBy(xpath="//span[@id='reportClose_']//i[contains(@class,'icon-font6 icon-close')]")
		private static WebElement report_CloseBtn;
				
		@FindBy(xpath="//button[@id='frstPage_']")
		private static WebElement report_FirstBtn;
				
		@FindBy(xpath="//button[@id='prvPage_']")
		private static WebElement report_PreviousBtn;
				
		@FindBy(xpath="//button[@id='pgnumber_']")
		private static WebElement report_PageNoBtn;
				
		@FindBy(xpath="/html/body/section/div[2]/div/section[1]/section[2]/div[1]/div[3]/div[2]/button[4]")
		private static WebElement report_NextBtn;
				
		@FindBy(xpath="//button[@id='lstPage_']")
		private static WebElement report_LastBtn;
		
		@FindBy(xpath="//input[@id='txtSearchReport']")
		private static WebElement report_SearchTxt;
		
		
		
		@FindBy(xpath="//*[@id='trRender_1']/td[1]")
		private static WebElement sl_1stRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_1']/td[2]")
		private static WebElement sl_1stRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[3]")
		private static WebElement sl_1stRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[4]")
		private static WebElement sl_1stRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[5]")
		private static WebElement sl_1stRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[6]")
		private static WebElement sl_1stRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[7]")
		private static WebElement sl_1stRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[8]")
		private static WebElement sl_1stRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[9]")
		private static WebElement sl_1stRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[10]")
		private static WebElement sl_1stRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[11]")
		private static WebElement sl_1stRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[12]")
		private static WebElement sl_1stRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[13]")
		private static WebElement sl_1stRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[14]")
		private static WebElement sl_1stRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[15]")
		private static WebElement sl_1stRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[16]")
		private static WebElement sl_1stRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[17]")
		private static WebElement sl_1stRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[18]")
		private static WebElement sl_1stRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[19]")
		private static WebElement sl_1stRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[20]")
		private static WebElement sl_1stRow20thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[21]")
		private static WebElement sl_1stRow21thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[22]")
		private static WebElement sl_1stRow22thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[23]")
		private static WebElement sl_1stRow23thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[24]")
		private static WebElement sl_1stRow24thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[25]")
		private static WebElement sl_1stRow25thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[26]")
		private static WebElement sl_1stRow26thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[27]")
		private static WebElement sl_1stRow27thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[28]")
		private static WebElement sl_1stRow28thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[29]")
		private static WebElement sl_1stRow29thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[30]")
		private static WebElement sl_1stRow30thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[31]")
		private static WebElement sl_1stRow31thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[32]")
		private static WebElement sl_1stRow32thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[33]")
		private static WebElement sl_1stRow33thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[34]")
		private static WebElement sl_1stRow34thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[35]")
		private static WebElement sl_1stRow35thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[36]")
		private static WebElement sl_1stRow36thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[37]")
		private static WebElement sl_1stRow37thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[38]")
		private static WebElement sl_1stRow38thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[39]")
		private static WebElement sl_1stRow39thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[40]")
		private static WebElement sl_1stRow40thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[41]")
		private static WebElement sl_1stRow41thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[42]")
		private static WebElement sl_1stRow42thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[43]")
		private static WebElement sl_1stRow43thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[44]")
		private static WebElement sl_1stRow44thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[45]")
		private static WebElement sl_1stRow45thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[46]")
		private static WebElement sl_1stRow46thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[47]")
		private static WebElement sl_1stRow47thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[48]")
		private static WebElement sl_1stRow48thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[49]")
		private static WebElement sl_1stRow49thCol;
		
		@FindBy(xpath="//*[@id='trRender_1']/td[50]")
		private static WebElement sl_1stRow50thCol;
		
		
		@FindBy(xpath="//*[@id='trRender_2']/td[1]")
		private static WebElement sl_2ndRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_2']/td[2]")
		private static WebElement sl_2ndRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[3]")
		private static WebElement sl_2ndRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[4]")
		private static WebElement sl_2ndRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[5]")
		private static WebElement sl_2ndRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[6]")
		private static WebElement sl_2ndRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[7]")
		private static WebElement sl_2ndRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[8]")
		private static WebElement sl_2ndRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[9]")
		private static WebElement sl_2ndRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[10]")
		private static WebElement sl_2ndRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[11]")
		private static WebElement sl_2ndRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[12]")
		private static WebElement sl_2ndRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[13]")
		private static WebElement sl_2ndRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[14]")
		private static WebElement sl_2ndRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[15]")
		private static WebElement sl_2ndRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[16]")
		private static WebElement sl_2ndRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[17]")
		private static WebElement sl_2ndRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[18]")
		private static WebElement sl_2ndRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[19]")
		private static WebElement sl_2ndRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[20]")
		private static WebElement sl_2ndRow20thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[21]")
		private static WebElement sl_2ndRow21thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[22]")
		private static WebElement sl_2ndRow22thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[23]")
		private static WebElement sl_2ndRow23thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[24]")
		private static WebElement sl_2ndRow24thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[25]")
		private static WebElement sl_2ndRow25thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[26]")
		private static WebElement sl_2ndRow26thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[27]")
		private static WebElement sl_2ndRow27thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[28]")
		private static WebElement sl_2ndRow28thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[29]")
		private static WebElement sl_2ndRow29thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[30]")
		private static WebElement sl_2ndRow30thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[31]")
		private static WebElement sl_2ndRow31thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[32]")
		private static WebElement sl_2ndRow32thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[33]")
		private static WebElement sl_2ndRow33thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[34]")
		private static WebElement sl_2ndRow34thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[35]")
		private static WebElement sl_2ndRow35thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[36]")
		private static WebElement sl_2ndRow36thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[37]")
		private static WebElement sl_2ndRow37thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[38]")
		private static WebElement sl_2ndRow38thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[39]")
		private static WebElement sl_2ndRow39thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[40]")
		private static WebElement sl_2ndRow40thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[41]")
		private static WebElement sl_2ndRow41thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[42]")
		private static WebElement sl_2ndRow42thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[43]")
		private static WebElement sl_2ndRow43thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[44]")
		private static WebElement sl_2ndRow44thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[45]")
		private static WebElement sl_2ndRow45thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[46]")
		private static WebElement sl_2ndRow46thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[47]")
		private static WebElement sl_2ndRow47thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[48]")
		private static WebElement sl_2ndRow48thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[49]")
		private static WebElement sl_2ndRow49thCol;
		
		@FindBy(xpath="//*[@id='trRender_2']/td[50]")
		private static WebElement sl_2ndRow50thCol;
		
		
		
		
		
		@FindBy(xpath="//*[@id='trRender_3']/td[1]")
		private static WebElement sl_3rdRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_3']/td[2]")
		private static WebElement sl_3rdRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[3]")
		private static WebElement sl_3rdRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[4]")
		private static WebElement sl_3rdRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[5]")
		private static WebElement sl_3rdRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[6]")
		private static WebElement sl_3rdRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[7]")
		private static WebElement sl_3rdRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[8]")
		private static WebElement sl_3rdRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[9]")
		private static WebElement sl_3rdRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[10]")
		private static WebElement sl_3rdRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[11]")
		private static WebElement sl_3rdRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[12]")
		private static WebElement sl_3rdRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[13]")
		private static WebElement sl_3rdRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[14]")
		private static WebElement sl_3rdRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[15]")
		private static WebElement sl_3rdRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[16]")
		private static WebElement sl_3rdRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[17]")
		private static WebElement sl_3rdRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[18]")
		private static WebElement sl_3rdRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[19]")
		private static WebElement sl_3rdRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[20]")
		private static WebElement sl_3rdRow20thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[21]")
		private static WebElement sl_3rdRow21thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[22]")
		private static WebElement sl_3rdRow22thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[23]")
		private static WebElement sl_3rdRow23thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[24]")
		private static WebElement sl_3rdRow24thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[25]")
		private static WebElement sl_3rdRow25thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[26]")
		private static WebElement sl_3rdRow26thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[27]")
		private static WebElement sl_3rdRow27thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[28]")
		private static WebElement sl_3rdRow28thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[29]")
		private static WebElement sl_3rdRow29thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[30]")
		private static WebElement sl_3rdRow30thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[31]")
		private static WebElement sl_3rdRow31thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[32]")
		private static WebElement sl_3rdRow32thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[33]")
		private static WebElement sl_3rdRow33thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[34]")
		private static WebElement sl_3rdRow34thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[35]")
		private static WebElement sl_3rdRow35thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[36]")
		private static WebElement sl_3rdRow36thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[37]")
		private static WebElement sl_3rdRow37thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[38]")
		private static WebElement sl_3rdRow38thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[39]")
		private static WebElement sl_3rdRow39thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[40]")
		private static WebElement sl_3rdRow40thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[41]")
		private static WebElement sl_3rdRow41thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[42]")
		private static WebElement sl_3rdRow42thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[43]")
		private static WebElement sl_3rdRow43thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[44]")
		private static WebElement sl_3rdRow44thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[45]")
		private static WebElement sl_3rdRow45thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[46]")
		private static WebElement sl_3rdRow46thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[47]")
		private static WebElement sl_3rdRow47thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[48]")
		private static WebElement sl_3rdRow48thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[49]")
		private static WebElement sl_3rdRow49thCol;
		
		@FindBy(xpath="//*[@id='trRender_3']/td[50]")
		private static WebElement sl_3rdRow50thCol;
		
		
		
		
		
		
		
		
		@FindBy(xpath="//*[@id='trRender_4']/td[1]")
		private static WebElement sl_4thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_4']/td[2]")
		private static WebElement sl_4thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[3]")
		private static WebElement sl_4thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[4]")
		private static WebElement sl_4thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[5]")
		private static WebElement sl_4thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[6]")
		private static WebElement sl_4thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[7]")
		private static WebElement sl_4thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[8]")
		private static WebElement sl_4thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[9]")
		private static WebElement sl_4thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[10]")
		private static WebElement sl_4thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[11]")
		private static WebElement sl_4thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[12]")
		private static WebElement sl_4thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[13]")
		private static WebElement sl_4thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[14]")
		private static WebElement sl_4thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[15]")
		private static WebElement sl_4thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[16]")
		private static WebElement sl_4thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[17]")
		private static WebElement sl_4thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[18]")
		private static WebElement sl_4thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[19]")
		private static WebElement sl_4thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[20]")
		private static WebElement sl_4thRow20thCol;
		

		@FindBy(xpath="//*[@id='trRender_4']/td[21]")
		private static WebElement sl_4thRow21thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[22]")
		private static WebElement sl_4thRow22thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[23]")
		private static WebElement sl_4thRow23thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[24]")
		private static WebElement sl_4thRow24thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[25]")
		private static WebElement sl_4thRow25thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[26]")
		private static WebElement sl_4thRow26thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[27]")
		private static WebElement sl_4thRow27thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[28]")
		private static WebElement sl_4thRow28thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[29]")
		private static WebElement sl_4thRow29thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[30]")
		private static WebElement sl_4thRow30thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[31]")
		private static WebElement sl_4thRow31thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[32]")
		private static WebElement sl_4thRow32thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[33]")
		private static WebElement sl_4thRow33thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[34]")
		private static WebElement sl_4thRow34thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[35]")
		private static WebElement sl_4thRow35thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[36]")
		private static WebElement sl_4thRow36thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[37]")
		private static WebElement sl_4thRow37thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[38]")
		private static WebElement sl_4thRow38thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[39]")
		private static WebElement sl_4thRow39thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[40]")
		private static WebElement sl_4thRow40thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[41]")
		private static WebElement sl_4thRow41thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[42]")
		private static WebElement sl_4thRow42thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[43]")
		private static WebElement sl_4thRow43thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[44]")
		private static WebElement sl_4thRow44thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[45]")
		private static WebElement sl_4thRow45thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[46]")
		private static WebElement sl_4thRow46thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[47]")
		private static WebElement sl_4thRow47thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[48]")
		private static WebElement sl_4thRow48thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[49]")
		private static WebElement sl_4thRow49thCol;
		
		@FindBy(xpath="//*[@id='trRender_4']/td[50]")
		private static WebElement sl_4thRow50thCol;
		
		

		
		
		
		
		
		@FindBy(xpath="//*[@id='trRender_5']/td[1]")
		private static WebElement sl_5thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_5']/td[2]")
		private static WebElement sl_5thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[3]")
		private static WebElement sl_5thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[4]")
		private static WebElement sl_5thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[5]")
		private static WebElement sl_5thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[6]")
		private static WebElement sl_5thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[7]")
		private static WebElement sl_5thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[8]")
		private static WebElement sl_5thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[9]")
		private static WebElement sl_5thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[10]")
		private static WebElement sl_5thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[11]")
		private static WebElement sl_5thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[12]")
		private static WebElement sl_5thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[13]")
		private static WebElement sl_5thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[14]")
		private static WebElement sl_5thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[15]")
		private static WebElement sl_5thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[16]")
		private static WebElement sl_5thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[17]")
		private static WebElement sl_5thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[18]")
		private static WebElement sl_5thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[19]")
		private static WebElement sl_5thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[20]")
		private static WebElement sl_5thRow20thCol;
		

		@FindBy(xpath="//*[@id='trRender_5']/td[21]")
		private static WebElement sl_5thRow21thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[22]")
		private static WebElement sl_5thRow22thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[23]")
		private static WebElement sl_5thRow23thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[24]")
		private static WebElement sl_5thRow24thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[25]")
		private static WebElement sl_5thRow25thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[26]")
		private static WebElement sl_5thRow26thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[27]")
		private static WebElement sl_5thRow27thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[28]")
		private static WebElement sl_5thRow28thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[29]")
		private static WebElement sl_5thRow29thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[30]")
		private static WebElement sl_5thRow30thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[31]")
		private static WebElement sl_5thRow31thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[32]")
		private static WebElement sl_5thRow32thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[33]")
		private static WebElement sl_5thRow33thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[34]")
		private static WebElement sl_5thRow34thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[35]")
		private static WebElement sl_5thRow35thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[36]")
		private static WebElement sl_5thRow36thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[37]")
		private static WebElement sl_5thRow37thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[38]")
		private static WebElement sl_5thRow38thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[39]")
		private static WebElement sl_5thRow39thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[40]")
		private static WebElement sl_5thRow40thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[41]")
		private static WebElement sl_5thRow41thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[42]")
		private static WebElement sl_5thRow42thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[43]")
		private static WebElement sl_5thRow43thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[44]")
		private static WebElement sl_5thRow44thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[45]")
		private static WebElement sl_5thRow45thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[46]")
		private static WebElement sl_5thRow46thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[47]")
		private static WebElement sl_5thRow47thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[48]")
		private static WebElement sl_5thRow48thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[49]")
		private static WebElement sl_5thRow49thCol;
		
		@FindBy(xpath="//*[@id='trRender_5']/td[50]")
		private static WebElement sl_5thRow50thCol;
		
		
		
		

		
		@FindBy(xpath="//*[@id='trRender_6']/td[1]")
		private static WebElement sl_6thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_6']/td[2]")
		private static WebElement sl_6thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[3]")
		private static WebElement sl_6thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[4]")
		private static WebElement sl_6thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[5]")
		private static WebElement sl_6thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[6]")
		private static WebElement sl_6thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[7]")
		private static WebElement sl_6thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[8]")
		private static WebElement sl_6thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[9]")
		private static WebElement sl_6thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[10]")
		private static WebElement sl_6thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[11]")
		private static WebElement sl_6thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[12]")
		private static WebElement sl_6thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[13]")
		private static WebElement sl_6thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[14]")
		private static WebElement sl_6thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[15]")
		private static WebElement sl_6thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[16]")
		private static WebElement sl_6thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[17]")
		private static WebElement sl_6thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[18]")
		private static WebElement sl_6thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[19]")
		private static WebElement sl_6thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[20]")
		private static WebElement sl_6thRow20thCol;
		

		@FindBy(xpath="//*[@id='trRender_6']/td[21]")
		private static WebElement sl_6thRow21thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[22]")
		private static WebElement sl_6thRow22thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[23]")
		private static WebElement sl_6thRow23thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[24]")
		private static WebElement sl_6thRow24thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[25]")
		private static WebElement sl_6thRow25thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[26]")
		private static WebElement sl_6thRow26thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[27]")
		private static WebElement sl_6thRow27thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[28]")
		private static WebElement sl_6thRow28thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[29]")
		private static WebElement sl_6thRow29thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[30]")
		private static WebElement sl_6thRow30thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[31]")
		private static WebElement sl_6thRow31thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[32]")
		private static WebElement sl_6thRow32thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[33]")
		private static WebElement sl_6thRow33thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[34]")
		private static WebElement sl_6thRow34thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[35]")
		private static WebElement sl_6thRow35thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[36]")
		private static WebElement sl_6thRow36thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[37]")
		private static WebElement sl_6thRow37thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[38]")
		private static WebElement sl_6thRow38thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[39]")
		private static WebElement sl_6thRow39thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[40]")
		private static WebElement sl_6thRow40thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[41]")
		private static WebElement sl_6thRow41thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[42]")
		private static WebElement sl_6thRow42thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[43]")
		private static WebElement sl_6thRow43thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[44]")
		private static WebElement sl_6thRow44thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[45]")
		private static WebElement sl_6thRow45thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[46]")
		private static WebElement sl_6thRow46thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[47]")
		private static WebElement sl_6thRow47thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[48]")
		private static WebElement sl_6thRow48thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[49]")
		private static WebElement sl_6thRow49thCol;
		
		@FindBy(xpath="//*[@id='trRender_6']/td[50]")
		private static WebElement sl_6thRow50thCol;
		
		
		
		
		
		
		
		
		@FindBy(xpath="//*[@id='trRender_7']/td[1]")
		private static WebElement sl_7thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_7']/td[2]")
		private static WebElement sl_7thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[3]")
		private static WebElement sl_7thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[4]")
		private static WebElement sl_7thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[5]")
		private static WebElement sl_7thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[6]")
		private static WebElement sl_7thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[7]")
		private static WebElement sl_7thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[8]")
		private static WebElement sl_7thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[9]")
		private static WebElement sl_7thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[10]")
		private static WebElement sl_7thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[11]")
		private static WebElement sl_7thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[12]")
		private static WebElement sl_7thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[13]")
		private static WebElement sl_7thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[14]")
		private static WebElement sl_7thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[15]")
		private static WebElement sl_7thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[16]")
		private static WebElement sl_7thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[17]")
		private static WebElement sl_7thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[18]")
		private static WebElement sl_7thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[19]")
		private static WebElement sl_7thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_7']/td[20]")
		private static WebElement sl_7thRow20thCol;
		
		
		@FindBy(xpath="//*[@id='trRender_8']/td[1]")
		private static WebElement sl_8thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_8']/td[2]")
		private static WebElement sl_8thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[3]")
		private static WebElement sl_8thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[4]")
		private static WebElement sl_8thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[5]")
		private static WebElement sl_8thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[6]")
		private static WebElement sl_8thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[7]")
		private static WebElement sl_8thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[8]")
		private static WebElement sl_8thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[9]")
		private static WebElement sl_8thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[10]")
		private static WebElement sl_8thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[11]")
		private static WebElement sl_8thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[12]")
		private static WebElement sl_8thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[13]")
		private static WebElement sl_8thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[14]")
		private static WebElement sl_8thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[15]")
		private static WebElement sl_8thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[16]")
		private static WebElement sl_8thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[17]")
		private static WebElement sl_8thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[18]")
		private static WebElement sl_8thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[19]")
		private static WebElement sl_8thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_8']/td[20]")
		private static WebElement sl_8thRow20thCol;
		
		
		
		@FindBy(xpath="//*[@id='trRender_9']/td[1]")
		private static WebElement sl_9thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_9']/td[2]")
		private static WebElement sl_9thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[3]")
		private static WebElement sl_9thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[4]")
		private static WebElement sl_9thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[5]")
		private static WebElement sl_9thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[6]")
		private static WebElement sl_9thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[7]")
		private static WebElement sl_9thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[8]")
		private static WebElement sl_9thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[9]")
		private static WebElement sl_9thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[10]")
		private static WebElement sl_9thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[11]")
		private static WebElement sl_9thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[12]")
		private static WebElement sl_9thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[13]")
		private static WebElement sl_9thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[14]")
		private static WebElement sl_9thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[15]")
		private static WebElement sl_9thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[16]")
		private static WebElement sl_9thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[17]")
		private static WebElement sl_9thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[18]")
		private static WebElement sl_9thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[19]")
		private static WebElement sl_9thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_9']/td[20]")
		private static WebElement sl_9thRow20thCol;
		
		
		
		@FindBy(xpath="//*[@id='trRender_10']/td[1]")
		private static WebElement sl_10thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_10']/td[2]")
		private static WebElement sl_10thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[3]")
		private static WebElement sl_10thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[4]")
		private static WebElement sl_10thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[5]")
		private static WebElement sl_10thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[6]")
		private static WebElement sl_10thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[7]")
		private static WebElement sl_10thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[8]")
		private static WebElement sl_10thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[9]")
		private static WebElement sl_10thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[10]")
		private static WebElement sl_10thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[11]")
		private static WebElement sl_10thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[12]")
		private static WebElement sl_10thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[13]")
		private static WebElement sl_10thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[14]")
		private static WebElement sl_10thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[15]")
		private static WebElement sl_10thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[16]")
		private static WebElement sl_10thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[17]")
		private static WebElement sl_10thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[18]")
		private static WebElement sl_10thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[19]")
		private static WebElement sl_10thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_10']/td[20]")
		private static WebElement sl_10thRow20thCol;
		
		
		@FindBy(xpath="//*[@id='trRender_11']/td[1]")
		private static WebElement sl_11thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_11']/td[2]")
		private static WebElement sl_11thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[3]")
		private static WebElement sl_11thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[4]")
		private static WebElement sl_11thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[5]")
		private static WebElement sl_11thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[6]")
		private static WebElement sl_11thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[7]")
		private static WebElement sl_11thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[8]")
		private static WebElement sl_11thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[9]")
		private static WebElement sl_11thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[10]")
		private static WebElement sl_11thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[11]")
		private static WebElement sl_11thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[12]")
		private static WebElement sl_11thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[13]")
		private static WebElement sl_11thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[14]")
		private static WebElement sl_11thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[15]")
		private static WebElement sl_11thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[16]")
		private static WebElement sl_11thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[17]")
		private static WebElement sl_11thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[18]")
		private static WebElement sl_11thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[19]")
		private static WebElement sl_11thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_11']/td[20]")
		private static WebElement sl_11thRow20thCol;
		
		
		@FindBy(xpath="//*[@id='trRender_12']/td[1]")
		private static WebElement sl_12thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_12']/td[2]")
		private static WebElement sl_12thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[3]")
		private static WebElement sl_12thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[4]")
		private static WebElement sl_12thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[5]")
		private static WebElement sl_12thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[6]")
		private static WebElement sl_12thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[7]")
		private static WebElement sl_12thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[8]")
		private static WebElement sl_12thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[9]")
		private static WebElement sl_12thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[10]")
		private static WebElement sl_12thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[11]")
		private static WebElement sl_12thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[12]")
		private static WebElement sl_12thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[13]")
		private static WebElement sl_12thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[14]")
		private static WebElement sl_12thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[15]")
		private static WebElement sl_12thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[16]")
		private static WebElement sl_12thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[17]")
		private static WebElement sl_12thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[18]")
		private static WebElement sl_12thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[19]")
		private static WebElement sl_12thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_12']/td[20]")
		private static WebElement sl_12thRow20thCol;
		
		
		
		@FindBy(xpath="//*[@id='trRender_13']/td[1]")
		private static WebElement sl_13thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_13']/td[2]")
		private static WebElement sl_13thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[3]")
		private static WebElement sl_13thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[4]")
		private static WebElement sl_13thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[5]")
		private static WebElement sl_13thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[6]")
		private static WebElement sl_13thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[7]")
		private static WebElement sl_13thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[8]")
		private static WebElement sl_13thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[9]")
		private static WebElement sl_13thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[10]")
		private static WebElement sl_13thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[11]")
		private static WebElement sl_13thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[12]")
		private static WebElement sl_13thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[13]")
		private static WebElement sl_13thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[14]")
		private static WebElement sl_13thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[15]")
		private static WebElement sl_13thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[16]")
		private static WebElement sl_13thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[17]")
		private static WebElement sl_13thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[18]")
		private static WebElement sl_13thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[19]")
		private static WebElement sl_13thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_13']/td[20]")
		private static WebElement sl_13thRow20thCol;
		
		
		
		@FindBy(xpath="//*[@id='trRender_14']/td[1]")
		private static WebElement sl_14thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_14']/td[2]")
		private static WebElement sl_14thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[3]")
		private static WebElement sl_14thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[4]")
		private static WebElement sl_14thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[5]")
		private static WebElement sl_14thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[6]")
		private static WebElement sl_14thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[7]")
		private static WebElement sl_14thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[8]")
		private static WebElement sl_14thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[9]")
		private static WebElement sl_14thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[10]")
		private static WebElement sl_14thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[11]")
		private static WebElement sl_14thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[12]")
		private static WebElement sl_14thRow12thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[13]")
		private static WebElement sl_14thRow13thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[14]")
		private static WebElement sl_14thRow14thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[15]")
		private static WebElement sl_14thRow15thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[16]")
		private static WebElement sl_14thRow16thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[17]")
		private static WebElement sl_14thRow17thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[18]")
		private static WebElement sl_14thRow18thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[19]")
		private static WebElement sl_14thRow19thCol;
		
		@FindBy(xpath="//*[@id='trRender_14']/td[20]")
		private static WebElement sl_14thRow20thCol;
		
		
		
		@FindBy(xpath="//*[@id='trRender_15']/td[1]")
		private static WebElement sl_15thRow1stCol;
				
		@FindBy(xpath="//*[@id='trRender_15']/td[2]")
		private static WebElement sl_15thRow2ndCol;
		
		@FindBy(xpath="//*[@id='trRender_15']/td[3]")
		private static WebElement sl_15thRow3rdCol;
		
		@FindBy(xpath="//*[@id='trRender_15']/td[4]")
		private static WebElement sl_15thRow4thCol;
		
		@FindBy(xpath="//*[@id='trRender_15']/td[5]")
		private static WebElement sl_15thRow5thCol;
		
		@FindBy(xpath="//*[@id='trRender_15']/td[6]")
		private static WebElement sl_15thRow6thCol;
		
		@FindBy(xpath="//*[@id='trRender_15']/td[7]")
		private static WebElement sl_15thRow7thCol;
		
		@FindBy(xpath="//*[@id='trRender_15']/td[8]")
		private static WebElement sl_15thRow8thCol;
		
		@FindBy(xpath="//*[@id='trRender_15']/td[9]")
		private static WebElement sl_15thRow9thCol;
		
		@FindBy(xpath="//*[@id='trRender_15']/td[10]")
		private static WebElement sl_15thRow10thCol;
		
		@FindBy(xpath="//*[@id='trRender_15']/td[11]")
		private static WebElement sl_15thRow11thCol;
		
		@FindBy(xpath="//*[@id='trRender_15']/td[12]")
		private static WebElement sl_15thRow12thCol;
		

		private static String xlSheetName = "SmokeFAReports";
		private int bankRecRow1ListCount;
	
	

		@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li/a/span")
		private static List<WebElement> financialReportList;
	
		
@FindBy(xpath="//div[@id='idGlobalError']")
public static WebElement validationConfirmationMessage;

@FindBy(xpath="//tbody[@id='LandingGridBody']/tr")
private static List<WebElement> stockLedgerHometableRowCount;

@FindBy(xpath="//*[@id='tblBodyReportRender']/tr/td[3]")
private static List<WebElement> reportVocGridList;


@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[1]/td")
private static List<WebElement> report1stRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[2]/td")
private static List<WebElement> report2ndRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[3]/td")
private static List<WebElement> report3rdRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[4]/td")
private static List<WebElement> report4thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[5]/td")
private static List<WebElement> report5thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[6]/td")
private static List<WebElement> report6thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[7]/td")
private static List<WebElement> report7thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[8]/td")
private static List<WebElement> report8thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[9]/td")
private static List<WebElement> report9thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[10]/td")
private static List<WebElement> report10thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[11]/td")
private static List<WebElement> report11thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[12]/td")
private static List<WebElement> report12thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[13]/td")
private static List<WebElement> report13thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[14]/td")
private static List<WebElement> report14thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[15]/td")
private static List<WebElement> report15thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[16]/td")
private static List<WebElement> report16thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[17]/td")
private static List<WebElement> report17thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[18]/td")
private static List<WebElement> report18thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[19]/td")
private static List<WebElement> report19thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[20]/td")
private static List<WebElement> report20thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[21]/td")
private static List<WebElement> report21thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[22]/td")
private static List<WebElement> report22thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[23]/td")
private static List<WebElement> report23thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[24]/td")
private static List<WebElement> report24thRowList;

@FindBy(xpath="//tbody[@id='tblBodyReportRender']/tr[25]/td")
private static List<WebElement> report25thRowList;

//Validation and Confirmation messages
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


@FindBy(id="ddlCompany")
private static WebElement companyDropDownList;


private static int cSize; 

public boolean checkLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	LoginPage lp=new LoginPage(getDriver()); 
	
	String unamelt="su";
			      
	String pawslt="su";
			      
	lp.enterUserName(unamelt);
	
	Thread.sleep(2000);
			
	lp.enterPassword(pawslt);
	
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
    Thread.sleep(2000);
	
	lp.clickOnSignInBtn();
	
	//checkRefershPopOnlogin();
			        
	//checkPopUpWindow();

	Thread.sleep(5000);
	if(userNameDisplay.isDisplayed()==true)
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

@FindBy(xpath="//span[@class='hidden-xs']")
private static WebElement userNameDisplay;
		
	public boolean checkFinanacialLedgerReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
	
        int rowcount=stockLedgerHometableRowCount.size();
		
		System.out.println(rowcount);
		
		for (int i = 1; i <= rowcount; i++) 
		{
			WebElement name=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[12]"));
			
			String actname=name.getText();
			
			System.out.println(actname);
			
			if(actname.equalsIgnoreCase("BR COGS ACC INV") )
			{
				
				WebElement index=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[8]/div/label/input"));
				index.click();
				
				break;
			}

		}
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BR COGS ACC INV BR COGS ACC INV, , , , , , , , , , , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[, Opening balance, 100.00, , 100.00, 11.00, , 11.00, 100.00, , 100.00, ]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT48 : SU/AME/TEXT1, Vendor B, 200.00, , 300.00, 14.00, , 25.00, 200.00, , 300.00, Indian Rupees]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT48 : SU/AME/TEXT1, Vendor B, 300.00, , 600.00, 21.00, , 46.00, 300.00, , 600.00, Indian Rupees]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT48 : SU/AME/TEXT1, Vendor B, 400.00, , 1,000.00, 28.00, , 74.00, 400.00, , 1,000.00, Indian Rupees]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT50 : 1, COGS POSTING ACC, , 50.00, 950.00, , 3.50, 70.50, , 50.00, 950.00, Indian Rupees]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT50 : 4, COGS POSTING ACC, , 42.00, 908.00, , 2.94, 67.56, , 42.00, 908.00, Indian Rupees]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=2;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[NDT50 : 5, COGS POSTING ACC, , 25.00, 883.00, , 1.75, 65.81, , 25.00, 883.00, Indian Rupees]";
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=2;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[SalRet : 2, SR COGS POSTING ACC, 17.50, , 900.50, 1.23, , 67.04, 17.50, , 900.50, Indian Rupees]";
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=2;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[NDT50 : 7, COGS POSTING ACC, , 1.75, 898.75, , 0.12, 66.91, , 1.75, 898.75, Indian Rupees]";
		
		
		int report11thRowListCount = report11thRowList.size();
		ArrayList<String> report11thRowListArray = new ArrayList<String>();
		for(int i=2;i<report11thRowListCount;i++)
		{
			String data = report11thRowList.get(i).getText();
			report11thRowListArray.add(data);
		}
		String actRow11List = report11thRowListArray.toString();
		String expRow11List = "[PurRet : 2, Vendor A, , 315.00, 583.75, , 22.05, 44.86, , 315.00, 583.75, Indian Rupees]";
		
		int report12thRowListCount = report12thRowList.size();
		ArrayList<String> report12thRowListArray = new ArrayList<String>();
		for(int i=2;i<report12thRowListCount;i++)
		{
			String data = report12thRowList.get(i).getText();
			report12thRowListArray.add(data);
		}
		String actRow12List = report12thRowListArray.toString();
		String expRow12List = "[ShoStk : 1, SHORTAGE COGS POSTING ACC, , 5.00, 578.75, , 5.00, 39.86, , 5.00, 578.75, Indian Rupees]";
		
		
		int report13thRowListCount = report13thRowList.size();
		ArrayList<String> report13thRowListArray = new ArrayList<String>();
		for(int i=2;i<report13thRowListCount;i++)
		{
			String data = report13thRowList.get(i).getText();
			report13thRowListArray.add(data);
		}
		String actRow13List = report13thRowListArray.toString();
		String expRow13List = "[, , 1,017.50, 438.75, 578.75, 75.23, 35.36, 39.86, 1,017.50, 438.75, 578.75, ]";
		
		System.out.println("************************************checkLedgerReport********************************************");
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow11List  : "+actRow11List);
		System.out.println("expRow11List  : "+expRow11List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow12List  : "+actRow12List);
		System.out.println("expRow12List  : "+expRow12List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow13List  : "+actRow13List);
		System.out.println("expRow13List  : "+expRow13List);
		System.out.println("*********************************************************************");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) &&
				actRow11List.equalsIgnoreCase(expRow11List) &&
				actRow12List.equalsIgnoreCase(expRow12List) &&
				actRow13List.equalsIgnoreCase(expRow13List) )
		{
			System.out.println("Test Pass : Reports Are as Expected ");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Report Are NOT as Expected ");
			return false;
		}
	}
	
	@FindBy(xpath="//input[@id='RITCheckbox__2']")
	private static WebElement movedAccOnlyChkBox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__2']")
	private static WebElement showallConsildateAmtChkbox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__2']")
	private static WebElement includePurchaseReturnChkbox;
	
	
	@FindBy(xpath="//input[@id='RITCheckbox__3']")
	private static WebElement printAccIndexChkbox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__9']")
	private static WebElement freshPageAccChkbox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__11']")
	private static WebElement printAsStatementAccChkbox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__6']")
	private static WebElement displayUnReliziedchkbox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__4']")
	private static WebElement ignoreConvertedPDCChkbox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__7']")
	private static WebElement displayedMaturedPDCChkbox;
	
	
	
	public boolean checkLedgerReportWithAllCheckBoxesEnable() throws InterruptedException
	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(movedAccOnlyChkBox));
		movedAccOnlyChkBox.click();
		
		printAccIndexChkbox.click();
		
		freshPageAccChkbox.click();
		
		printAsStatementAccChkbox.click();
		
		displayUnReliziedchkbox.click();
		
		ignoreConvertedPDCChkbox.click();
		
		displayedMaturedPDCChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
        
        String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
        String expvalidationConfirmationMessage = "true";
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BR COGS ACC INV BR COGS ACC INV, , , , , , , , , , , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT48 : SU/IND/TEXT2, Vendor B, 10.00, , 10.00, 0.70, , 0.70, 10.00, , 10.00, Indian Rupees]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT48 : SU/IND/TEXT2, Vendor B, 20.00, , 30.00, 1.40, , 2.10, 20.00, , 30.00, Indian Rupees]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[ExeStk : 2, EXCESS COGS POSTING ACC, 5.00, , 35.00, 5.00, , 7.10, 5.00, , 35.00, Indian Rupees]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT50 : 1, COGS POSTING ACC, , 8.75, 26.25, , 0.61, 6.49, , 8.75, 26.25, Indian Rupees]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT50 : 7, COGS POSTING ACC, , 10.00, 16.25, , 0.70, 5.79, , 10.00, 16.25, Indian Rupees]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[, , 35.00, 18.75, 16.25, 7.10, 1.31, 5.79, 35.00, 18.75, 16.25, ]";
		
		
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		if(actRow1List.equalsIgnoreCase(expRow1List) && actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) )
		{
			System.out.println("Test Pass : Reports Are as Expected ");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Report Are NOT as Expected ");
			return false;
		}
	}

		
		
	
	
	public boolean checkLedgerDetailsreport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledgerDetail));
		ledgerDetail.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
	
		
		
        int rowcount=stockLedgerHometableRowCount.size();
		
		System.out.println(rowcount);
		
		for (int i = 1; i <= rowcount; i++) 
		{
			WebElement name=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[12]"));
			
			String actname=name.getText();
			
			System.out.println(actname);
			
			if(actname.equalsIgnoreCase("FIFO COGS ACC INV") )
			{
				
				WebElement index=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[8]/div/label/input"));
				index.click();
				
				break;
			}

		}
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[FIFO COGS ACC INV FIFO COGS ACC INV, , , , , , , , , , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[, Opening balance, 100.00, , 100.00, 11.00, , 11.00, 100.00, , 100.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[ExeStk : 2, EXCESS COGS POSTING ACC, 8.62, , 108.62, 8.62, , 19.62, 8.62, , 108.62]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT48 : SU/AME/TEXT1, Vendor B, 20.00, , 128.62, 1.40, , 21.02, 20.00, , 128.62]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT48 : SU/AME/TEXT1, Vendor B, 20.00, , 148.62, 1.40, , 22.42, 20.00, , 148.62]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT48 : SU/AME/TEXT1, Vendor B, 22.50, , 171.12, 1.58, , 24.00, 22.50, , 171.12]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT50 : 1, COGS POSTING ACC, , 33.33, 137.79, , 2.33, 21.66, , 33.33, 137.79]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=2;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[NDT50 : 4, COGS POSTING ACC, , 66.67, 71.12, , 4.67, 17.00, , 66.67, 71.12]";
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=2;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[NDT50 : 5, COGS POSTING ACC, , 6.94, 64.18, , 0.49, 16.51, , 6.94, 64.18]";
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=2;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[NDT50 : 7, COGS POSTING ACC, , 2.87, 61.31, , 0.20, 16.31, , 2.87, 61.31]";
		
		
		int report11thRowListCount = report11thRowList.size();
		ArrayList<String> report11thRowListArray = new ArrayList<String>();
		for(int i=2;i<report11thRowListCount;i++)
		{
			String data = report11thRowList.get(i).getText();
			report11thRowListArray.add(data);
		}
		String actRow11List = report11thRowListArray.toString();
		String expRow11List = "[PurRet : 2, Vendor A, , 25.87, 35.44, , 1.81, 14.50, , 25.87, 35.44]";
		
		int report12thRowListCount = report12thRowList.size();
		ArrayList<String> report12thRowListArray = new ArrayList<String>();
		for(int i=2;i<report12thRowListCount;i++)
		{
			String data = report12thRowList.get(i).getText();
			report12thRowListArray.add(data);
		}
		String actRow12List = report12thRowListArray.toString();
		String expRow12List = "[SalRet : 2, SR COGS POSTING ACC, 33.32, , 68.76, 2.33, , 16.83, 33.32, , 68.76]";
		
		
		int report13thRowListCount = report13thRowList.size();
		ArrayList<String> report13thRowListArray = new ArrayList<String>();
		for(int i=2;i<report13thRowListCount;i++)
		{
			String data = report13thRowList.get(i).getText();
			report13thRowListArray.add(data);
		}
		String actRow13List = report13thRowListArray.toString();
		String expRow13List = "[ShoStk : 1, SHORTAGE COGS POSTING ACC, , 8.22, 60.54, , 8.22, 8.61, , 8.22, 60.54]";
		
		
		int report14thRowListCount = report14thRowList.size();
		ArrayList<String> report14thRowListArray = new ArrayList<String>();
		for(int i=2;i<report13thRowListCount;i++)
		{
			String data = report14thRowList.get(i).getText();
			report14thRowListArray.add(data);
		}
		String actRow14List = report14thRowListArray.toString();
		String expRow14List = "[, , 204.44, 143.90, 60.54, 26.33, 17.72, 8.61, 204.44, 143.90, 60.54]";
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow11List  : "+actRow11List);
		System.out.println("expRow11List  : "+expRow11List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow12List  : "+actRow12List);
		System.out.println("expRow12List  : "+expRow12List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow13List  : "+actRow13List);
		System.out.println("expRow13List  : "+expRow13List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow14List  : "+actRow14List);
		System.out.println("expRow14List  : "+expRow14List);
		System.out.println("*********************************************************************");
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) &&
				actRow11List.equalsIgnoreCase(expRow11List) &&
				actRow12List.equalsIgnoreCase(expRow12List) &&
				actRow13List.equalsIgnoreCase(expRow13List) &&
				actRow14List.equalsIgnoreCase(expRow14List) )
		{
			System.out.println("Test Pass : Reports Are as Expected ");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Report Are NOT as Expected ");
			return false;
		}
	
	}
		
		
	public boolean checkLedgerDetailreportWithAllCheckBoxesEnable() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayUnReliziedchkbox));
		displayUnReliziedchkbox.click();
		
		movedAccOnlyChkBox.click();
		
		printAccIndexChkbox.click();
		
		printAsStatementAccChkbox.click();
		
		freshPageAccChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
        boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[FIFO COGS ACC INV FIFO COGS ACC INV, , , , , , , , , , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[ExeStk : 2, EXCESS COGS POSTING ACC, 6.67, , 6.67, 6.67, , 6.67, 6.67, , 6.67]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT48 : SU/IND/TEXT4, Vendor B, 10.00, , 16.67, 0.70, , 7.37, 10.00, , 16.67]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT48 : SU/IND/TEXT4, Vendor B, 10.00, , 26.67, 0.70, , 8.07, 10.00, , 26.67]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT48 : SU/IND/TEXT4, Vendor B, 10.00, , 36.67, 0.70, , 8.77, 10.00, , 36.67]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT50 : 4, COGS POSTING ACC, , 3.33, 33.34, , 0.23, 8.54, , 3.33, 33.34]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT50 : 7, COGS POSTING ACC, , 5.00, 28.34, , 0.35, 8.19, , 5.00, 28.34]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=2;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[, , 36.67, 8.33, 28.34, 8.77, 0.58, 8.19, 36.67, 8.33, 28.34]";
		
		
		/*int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=2;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[, , 41.71, 8.33, 33.38, 9.12, 0.58, 8.54, 41.71, 8.33, 33.38]";
		*/
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List))
		{
			System.out.println("Test Pass : Reports Are as Expected ");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Report Are NOT as Expected ");
			return false;
		}
		
		
	}
		
		
	@FindBy(xpath="//span[@id='print_report_']")
	private static WebElement sl_ReportPrintBtn;
	
		
	public boolean checkLedgerDetailReportPrintOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
		sl_ReportPrintBtn.click();
		
		Thread.sleep(3000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	Thread.sleep(2000);
	 	
	 	getDriver().switchTo().window(openTabs.get(1)).close();
	 	
	 	Thread.sleep(2000);
	 	getDriver().switchTo().window(openTabs.get(0));
		
		System.out.println("openTabs"+openTabs);
		System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
		
		Thread.sleep(1000);
		
		if(actOpenWindowsCount==expOpenWindowsCount)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}


	@FindBy(xpath="//input[@id='MasterGroup__101']")
	private static WebElement reportaccountTxt;
	
	@FindBy(xpath="//*[@id='MasterGroup__101_table_data_body']/tr/td")
	private static List<WebElement> reportaccountTxtList;
	
	@FindBy(xpath="//select[@id='RITCombobox__1']")
	private static WebElement includePdcDropDown;
	
	@FindBy(xpath="//select[@id='RITCombobox__5']")
	private static WebElement sortingDropDown;
	
	@FindBy(xpath="//select[@id='RITCombobox__10']")
	private static WebElement includeNonAuthorizedDataDropDown;
	
	@FindBy(xpath="//input[@id='RITCheckbox__6']")
	private static WebElement displayUnRealizedLossorGainChkBox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__4']")
	private static WebElement ignoreConvertedPdcChkBox;
	
	
	public boolean checkSubledgerReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(subLedger));
		subLedger.click();
		
		Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println(" Validation MEssage on Opening Report Actual : "+actvalidationConfirmationMessage);
		System.out.println(" Validation MEssage on Opening Report Expctd : "+expvalidationConfirmationMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys("B");
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ACC INV"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayUnRealizedLossorGainChkBox));
		displayUnRealizedLossorGainChkBox.click();
		
		ignoreConvertedPdcChkBox.click();
		
		displayedMaturedPDCChkbox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage2 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage2 = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage2 ="true";
		
		System.out.println(" Validation MEssage on Opening Report : "+actvalidationConfirmationMessage2);
		System.out.println(" Validation MEssage on Opening Report : "+expvalidationConfirmationMessage2);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BR COGS ACC INV BR COGS ACC INV, , , , , , , , , , , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[, Opening balance, 100.00, , 100.00, 11.00, , 11.00, 100.00, , 100.00, ]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT48 : SU/AME/TEXT1, Vendor B, 400.00, , 500.00, 28.00, , 39.00, 400.00, , 500.00, Indian Rupees]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT48 : SU/AME/TEXT1, Vendor B, 300.00, , 800.00, 21.00, , 60.00, 300.00, , 800.00, Indian Rupees]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT48 : SU/AME/TEXT1, Vendor B, 200.00, , 1,000.00, 14.00, , 74.00, 200.00, , 1,000.00, Indian Rupees]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT50 : 1, COGS POSTING ACC, , 50.00, 950.00, , 3.50, 70.50, , 50.00, 950.00, Indian Rupees]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT50 : 4, COGS POSTING ACC, , 42.00, 908.00, , 2.94, 67.56, , 42.00, 908.00, Indian Rupees]";
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=2;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[NDT50 : 5, COGS POSTING ACC, , 25.00, 883.00, , 1.75, 65.81, , 25.00, 883.00, Indian Rupees]";
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=2;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[SalRet : 2, SR COGS POSTING ACC, 17.50, , 900.50, 1.23, , 67.04, 17.50, , 900.50, Indian Rupees]";
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=2;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[NDT50 : 7, COGS POSTING ACC, , 1.75, 898.75, , 0.12, 66.91, , 1.75, 898.75, Indian Rupees]";
		
		
		int report11thRowListCount = report11thRowList.size();
		ArrayList<String> report11thRowListArray = new ArrayList<String>();
		for(int i=2;i<report11thRowListCount;i++)
		{
			String data = report11thRowList.get(i).getText();
			report11thRowListArray.add(data);
		}
		String actRow11List = report11thRowListArray.toString();
		String expRow11List = "[PurRet : 2, Vendor A, , 315.00, 583.75, , 22.05, 44.86, , 315.00, 583.75, Indian Rupees]";
		
		int report12thRowListCount = report12thRowList.size();
		ArrayList<String> report12thRowListArray = new ArrayList<String>();
		for(int i=2;i<report12thRowListCount;i++)
		{
			String data = report12thRowList.get(i).getText();
			report12thRowListArray.add(data);
		}
		String actRow12List = report12thRowListArray.toString();
		String expRow12List = "[ShoStk : 1, SHORTAGE COGS POSTING ACC, , 5.00, 578.75, , 5.00, 39.86, , 5.00, 578.75, Indian Rupees]";
		
		
		int report13thRowListCount = report13thRowList.size();
		ArrayList<String> report13thRowListArray = new ArrayList<String>();
		for(int i=2;i<report13thRowListCount;i++)
		{
			String data = report13thRowList.get(i).getText();
			report13thRowListArray.add(data);
		}
		String actRow13List = report13thRowListArray.toString();
		String expRow13List = "[, , 1,017.50, 438.75, 578.75, 75.23, 35.36, 39.86, 1,017.50, 438.75, 578.75, ]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
			
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow11List  : "+actRow11List);
		System.out.println("expRow11List  : "+expRow11List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow12List  : "+actRow12List);
		System.out.println("expRow12List  : "+expRow12List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow13List  : "+actRow13List);
		System.out.println("expRow13List  : "+expRow13List);
		System.out.println("*********************************************************************");
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) &&
				actRow11List.equalsIgnoreCase(expRow11List) &&
				actRow12List.equalsIgnoreCase(expRow12List) &&
				actRow13List.equalsIgnoreCase(expRow13List)  )
		{
			System.out.println("Test Pass : Reports Are as Expected ");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Report Are NOT as Expected ");
			return false;
		}
		
		
	}

		
	@FindBy(xpath="//span[@id='id_Trans_spanPlus']")
	private static WebElement cusTransExpandBtn;
	
	
	@FindBy(xpath="//*[@id='rd_customization_tree2']/span/span/i")
	private static WebElement cusTransExtraFieldExpandBtn;
	
	
	@FindBy(xpath="//*[@id='rd_customization_tree2_29']/span/span/i")
	private static WebElement cusTransExtraFieldWarehouseExpandBtn;
	
	@FindBy(xpath="//span[@id='id_Default_spanPlus']")
	private static WebElement cusDefaultExpansionBtn;
	
	@FindBy(xpath="//*[@id='TCol3']")
	private static WebElement particularBtn;
	
	
	
	@FindBy(xpath="//li[@id='rd_customization_tree2_29_0']")
	private static WebElement warehouseName;
	
	@FindBy(xpath="//*[@id='plnReportCustomize']/nav/div/div[2]/ul/li/div[7]")
	private static WebElement cusSaveBtn;
	
	
	@FindBy(xpath="//*[@id='plnReportCustomize']/nav/div/div[2]/ul/li/div[4]")
	private static WebElement cuDeleteLayoutBtn;
	
	
	
		public boolean checkCustomizationInSubLedgerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			
			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
			report_ReportCustomizeBtn.click();
			
			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusTransExpandBtn));
			cusTransExpandBtn.click();
			
			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusTransExtraFieldExpandBtn));
			cusTransExtraFieldExpandBtn.click();
			
			
			Thread.sleep(1500);
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("arguments[0].scrollIntoView();", cusTransExtraFieldWarehouseExpandBtn);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusTransExtraFieldWarehouseExpandBtn));
			cusTransExtraFieldWarehouseExpandBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseName));
			getAction().doubleClick(warehouseName).build().perform();
			
			Thread.sleep(1500);
			
			js.executeScript("arguments[0].scrollIntoView();", cusSaveBtn);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
			cusSaveBtn.click();
			
			String expMessage = "Data saved successfully";
		    
		    String actMessage = checkValidationMessage(expMessage);
			
			Thread.sleep(2000);

	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
			
			int reportsRow1ListCount = report1stRowList.size();
			ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsRow1ListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				reportsRow1ListArray.add(data);
			}
			String actRow1List = reportsRow1ListArray.toString();
			String expRow1List = "[BR COGS ACC INV BR COGS ACC INV, , , , , , , , , , , , , ]";
			
			
			int report2ndRowListCount = report2ndRowList.size();
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			for(int i=2;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
			}
			String actRow2List = report2ndRowListArray.toString();
			String expRow2List = "[NDT48 : SU/IND/TEXT2, Vendor B, 10.00, , 10.00, 0.70, , 0.70, 10.00, , 10.00, Indian Rupees, HYDERABAD]";
			
			
			int report3rdRowListCount = report3rdRowList.size();
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			for(int i=2;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdRowListArray.add(data);
			}
			String actRow3List = report3rdRowListArray.toString();
			String expRow3List = "[NDT48 : SU/IND/TEXT2, Vendor B, 20.00, , 30.00, 1.40, , 2.10, 20.00, , 30.00, Indian Rupees, HYDERABAD]";
			
			
			int report4thRowListCount = report4thRowList.size();
			ArrayList<String> report4thRowListArray = new ArrayList<String>();
			for(int i=2;i<report4thRowListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				report4thRowListArray.add(data);
			}
			String actRow4List = report4thRowListArray.toString();
			String expRow4List = "[ExeStk : 2, EXCESS COGS POSTING ACC, 5.00, , 35.00, 5.00, , 7.10, 5.00, , 35.00, Indian Rupees, HYDERABAD]";

			int report5thRowListCount = report5thRowList.size();
			ArrayList<String> report5thRowListArray = new ArrayList<String>();
			for(int i=2;i<report5thRowListCount;i++)
			{
				String data = report5thRowList.get(i).getText();
				report5thRowListArray.add(data);
			}
			String actRow5List = report5thRowListArray.toString();
			String expRow5List = "[NDT50 : 1, COGS POSTING ACC, , 8.75, 26.25, , 0.61, 6.49, , 8.75, 26.25, Indian Rupees, HYDERABAD]";

			int report6thRowListCount = report6thRowList.size();
			ArrayList<String> report6thRowListArray = new ArrayList<String>();
			for(int i=2;i<report6thRowListCount;i++)
			{
				String data = report6thRowList.get(i).getText();
				report6thRowListArray.add(data);
			}
			String actRow6List = report6thRowListArray.toString();
			String expRow6List = "[NDT50 : 7, COGS POSTING ACC, , 10.00, 16.25, , 0.70, 5.79, , 10.00, 16.25, Indian Rupees, SECUNDERABAD]";
			
			int report7thRowListCount = report7thRowList.size();
			ArrayList<String> report7thRowListArray = new ArrayList<String>();
			for(int i=2;i<report7thRowListCount;i++)
			{
				String data = report7thRowList.get(i).getText();
				report7thRowListArray.add(data);
			}
			String actRow7List = report7thRowListArray.toString();
			String expRow7List = "[, , 35.00, 18.75, 16.25, 7.10, 1.31, 5.79, 35.00, 18.75, 16.25, , ]";
			
			/*
			int report8thRowListCount = report8thRowList.size();
			ArrayList<String> report8thRowListArray = new ArrayList<String>();
			for(int i=2;i<report8thRowListCount;i++)
			{
				String data = report8thRowList.get(i).getText();
				report8thRowListArray.add(data);
			}
			String actRow8List = report8thRowListArray.toString();
			String expRow8List = "[, , 44.96, 18.75, 26.21, 7.80, 1.31, 6.48, 44.96, 18.75, 26.21, , ]";
			*/
			
			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
			report_ReportCustomizeBtn.click();
			
			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
			cuDeleteLayoutBtn.click();
			
			getWaitForAlert();
			getAlert().accept();
			
			String expDeleteMessage = "Layout Deleted Successfully";
		    
		    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
		    
		    Thread.sleep(1000);
		    
		    int reportsHeaderListCount = reportsHeaderList.size();
			ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
			for(int i=0;i<reportsHeaderListCount;i++)
			{
				String data = reportsHeaderList.get(i).getText();
				reportsHeaderListArray.add(data);
			}
			String actHeaderList = reportsHeaderListArray.toString();
			String expHeaderList = "[, Date, Voucher, Account, Transaction, Local, Base, Currency, Debit, Credit, Balance, Dr (local), Cr (local), Balance (local), Dr (base), Cr (base), Balance (base)]";
		    
		    System.out.println(" Header List Actual    : "+actHeaderList);
		    System.out.println("  Header List expected :  "+expHeaderList);
			
			
			System.out.println("************************************checkCustomizationInSubLedgerReport********************************************");
			
			System.out.println("actRow1List  : "+actRow1List);
			System.out.println("expRow1List  : "+expRow1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow2List  : "+actRow2List);
			System.out.println("expRow2List  : "+expRow2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow3List  : "+actRow3List);
			System.out.println("expRow3List  : "+expRow3List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow4List  : "+actRow4List);
			System.out.println("expRow4List  : "+expRow4List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow5List  : "+actRow5List);
			System.out.println("expRow5List  : "+expRow5List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow6List  : "+actRow6List);
			System.out.println("expRow6List  : "+expRow6List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow7List  : "+actRow7List);
			System.out.println("expRow7List  : "+expRow7List);
			System.out.println("*********************************************************************");
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			
			
			if(actRow1List.equalsIgnoreCase(expRow1List) &&
					actRow2List.equalsIgnoreCase(expRow2List) &&
					actRow3List.equalsIgnoreCase(expRow3List) &&
					actRow4List.equalsIgnoreCase(expRow4List) &&
					actRow5List.equalsIgnoreCase(expRow5List) &&
					actRow6List.equalsIgnoreCase(expRow6List) &&
					actRow7List.equalsIgnoreCase(expRow7List) &&
					actMessage.equalsIgnoreCase(expMessage) && 
					actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage))
			{
				System.out.println("Test Pass : Customization in Sub Ledger  ");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Customization in Sub Ledger  ");
				return false;
			}
		}

			
		@FindBy(xpath="//*[@id='tblRDRender']/thead/tr/th")
		private static List<WebElement> reportsHeaderList;
		    
			
			@FindBy(xpath="//*[@id='tblBodyReportRender']")
			private static WebElement reportsbody;
			
		public boolean checkCashAndBankReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
			cashAndBankBooksMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashBookReport));
			cashBookReport.click();
			
			Thread.sleep(2000);
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
			reportaccountTxt.click();
			reportaccountTxt.sendKeys(Keys.SPACE);
			
			int reportaccountTxtListCount = reportaccountTxtList.size();
			
			for(int i=0;i<reportaccountTxtListCount;i++)
			{
				String data = reportaccountTxtList.get(i).getText();
				
				if(data.equalsIgnoreCase("Cash"))
				{
					reportaccountTxtList.get(i).click();
				}
			}
			
			reportaccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
		
			Thread.sleep(1500);
           // int reportVocGridListCount = reportVocGridList.size();
			
			
			//String actreportVocGridListCount=Integer.toString(reportVocGridListCount);
			//String expreportVocGridListCount="0";
			
			//System.err.println("reportVocGridListCount   : "+actreportVocGridListCount);
			
			boolean actResult = reportsbody.getText().isEmpty();
			boolean expResult = true;
			
			if (/*actreportVocGridListCount.equalsIgnoreCase(expreportVocGridListCount)*/ actResult==expResult) 
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(1000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				Thread.sleep(1000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		
		
		
		public boolean checkBankBookReport() throws InterruptedException
		{
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
			cashAndBankBooksMenu.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bankBookReport));
			bankBookReport.click();
			
			Thread.sleep(2000);
			
             boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
			reportaccountTxt.click();
			reportaccountTxt.sendKeys(Keys.SPACE);
			
			int reportaccountTxtListCount = reportaccountTxtList.size();
			
			for(int i=0;i<reportaccountTxtListCount;i++)
			{
				String data = reportaccountTxtList.get(i).getText();
				
				if(data.equalsIgnoreCase("HDFC"))
				{
					reportaccountTxtList.get(i).click();
				}
			}
			
			reportaccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(showallConsildateAmtChkbox));
			showallConsildateAmtChkbox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			Thread.sleep(2000);
			
			boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
			String expvalidationConfirmationMessage1 = "true";
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
			
			int reportsRow1ListCount = report1stRowList.size();
			ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
			for(int i=2;i<reportsRow1ListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				reportsRow1ListArray.add(data);
			}
			String actRow1List = reportsRow1ListArray.toString();
			String expRow1List = "[Pmt : 3, Bank, 5.00, , 5.00, , 5.00, ]";
			
			
			int report2ndRowListCount = report2ndRowList.size();
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			for(int i=2;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
			}
			String actRow2List = report2ndRowListArray.toString();
			String expRow2List = "[Rct : 4, Bank, , 5.00, , 5.00, , 5.00]";
			
			
			int report3rdRowListCount = report3rdRowList.size();
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			for(int i=2;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdRowListArray.add(data);
			}
			String actRow3List = report3rdRowListArray.toString();
			String expRow3List = "[NDT46 : 4, Customer C, 5.00, , 5.00, , 0.35, ]";
			
			
			int report4thRowListCount = report4thRowList.size();
			ArrayList<String> report4thRowListArray = new ArrayList<String>();
			for(int i=2;i<report4thRowListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				report4thRowListArray.add(data);
			}
			String actRow4List = report4thRowListArray.toString();
			String expRow4List = "[NDT47 : 3, Vendor B, , 5.24, , 5.24, , 0.37]";

			int report5thRowListCount = report5thRowList.size();
			ArrayList<String> report5thRowListArray = new ArrayList<String>();
			for(int i=2;i<report5thRowListCount;i++)
			{
				String data = report5thRowList.get(i).getText();
				report5thRowListArray.add(data);
			}
			String actRow5List = report5thRowListArray.toString();
			String expRow5List = "[Total, , 10.00, 10.24, 10.00, 10.24, 5.35, 5.37]";
			
			int report6thRowListCount = report6thRowList.size();
			ArrayList<String> report6thRowListArray = new ArrayList<String>();
			for(int i=2;i<report5thRowListCount;i++)
			{
				String data = report6thRowList.get(i).getText();
				report6thRowListArray.add(data);
			}
			String actRow6List = report6thRowListArray.toString();
			String expRow6List = "[Closing balance, , , 0.24, , 0.24, , 0.02]";
			
			
			
			System.out.println("************************************checkBankBookReport********************************************");
			
			System.out.println("actRow1List  : "+actRow1List);
			System.out.println("expRow1List  : "+expRow1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow2List  : "+actRow2List);
			System.out.println("expRow2List  : "+expRow2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow3List  : "+actRow3List);
			System.out.println("expRow3List  : "+expRow3List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow4List  : "+actRow4List);
			System.out.println("expRow4List  : "+expRow4List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow5List  : "+actRow5List);
			System.out.println("expRow5List  : "+expRow5List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow6List  : "+actRow6List);
			System.out.println("expRow6List  : "+expRow6List);
			System.out.println("*********************************************************************");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			
			if(actRow1List.equalsIgnoreCase(expRow1List) &&
					actRow2List.equalsIgnoreCase(expRow2List) &&
					actRow3List.equalsIgnoreCase(expRow3List) &&
					actRow4List.equalsIgnoreCase(expRow4List) &&
					actRow5List.equalsIgnoreCase(expRow5List) && 
					actRow6List.equalsIgnoreCase(expRow6List) && 
					actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
					actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
			{
				System.out.println("Test Pass : Reports Are as Expected ");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Report Are NOT as Expected ");
				return false;
			}
			
			
		}

	
		public boolean checkPrintOptionInBankReport() throws InterruptedException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
			sl_ReportPrintBtn.click();
			
			Thread.sleep(3000);
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(0));
		 	
		 	Thread.sleep(1500);
		 	
		 	getDriver().switchTo().window(openTabs.get(1)).close();
		 	
		 	getDriver().switchTo().window(openTabs.get(0));
			
			System.out.println("***************************checkPrintOptionInBankReport*********************************");
			
			System.out.println("openTabs"+openTabs);
			System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
			
			
			if(actOpenWindowsCount==expOpenWindowsCount)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(1000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(1000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
			
		}
	
	
	
		public boolean checkPettyCashBookReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			//Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
			cashAndBankBooksMenu.click();
			
			//Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pettyCashBokReport));
			pettyCashBokReport.click();
	
            boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";

			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			

			//Thread.sleep(2000);
	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
			reportaccountTxt.click();
			reportaccountTxt.sendKeys(Keys.SPACE);
			
			int reportaccountTxtListCount = reportaccountTxtList.size();
			
			for(int i=0;i<reportaccountTxtListCount;i++)
			{
				String data = reportaccountTxtList.get(i).getText();
				
				if(data.equalsIgnoreCase("cash"))
				{
					reportaccountTxtList.get(i).click();
				}
			}
			
			reportaccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(showallConsildateAmtChkbox));
			showallConsildateAmtChkbox.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			   
			 boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
				
			String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
			String expvalidationConfirmationMessage1 = "true";

			System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
				
			
			boolean actResult = reportsbody.getText().isEmpty();
			boolean expResult = true;
			
			if (actResult==expResult) 
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		


		
		@FindBy(xpath="//input[@id='RITCheckbox__1']")
		private static WebElement clubCashSalesForTheDayChkBox;
		
	
		
		public boolean checkDayBookReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
			cashAndBankBooksMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dayBookReport));
			dayBookReport.click();
			
			//Thread.sleep(2000);
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";


			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clubCashSalesForTheDayChkBox));
			clubCashSalesForTheDayChkBox.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			//Thread.sleep(2000);
			boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
			String expvalidationConfirmationMessage1 ="true";
			
			System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
			report_FilterBtn.click();
			
			//Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
			report_FilterCustomizeBtn.click();
			
			//Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
			filterAccountExpandBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
			if (filterAccNameChkbox.isSelected()==false)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
				filterAccNameChkbox.click();
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
			filter_FilterOkButton.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterDefaultAccTxt));
			enterDefaultAccTxt.click();
			enterDefaultAccTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			enterDefaultAccTxt.sendKeys(Keys.SPACE);
			enterDefaultAccTxt.sendKeys("BR COGS ACC INV");
			
			Thread.sleep(2000);
			
			enterDefaultAccTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
			filterOkButton.click();
			
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
			
			int reportsRow1ListCount = report1stRowList.size();
			ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsRow1ListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				reportsRow1ListArray.add(data);
			}
			String actRow1List = reportsRow1ListArray.toString();
			String expRow1List = "[, Opening balance, , , , , 100.00, , 100.00, , 100.00, , 11.00, ]";
			
			
			int report2ndRowListCount = report2ndRowList.size();
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			for(int i=1;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
			}
			String actRow2List = report2ndRowListArray.toString();
			String expRow2List = "[Sub Total, , , , , , 100.00, , 100.00, , 100.00, , 11.00, ]";
			
			
			int report3rdRowListCount = report3rdRowList.size();
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			for(int i=2;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdRowListArray.add(data);
			}
			String actRow3List = report3rdRowListArray.toString();
			String expRow3List = "[, , , , , , , , , , , , ]";
			
			
			int report4thRowListCount = report4thRowList.size();
			ArrayList<String> report4thRowListArray = new ArrayList<String>();
			for(int i=1;i<report4thRowListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				report4thRowListArray.add(data);
			}
			String actRow4List = report4thRowListArray.toString();
			String expRow4List = "[OpeBal : 1, Opening Balances Control A/C, , , , , , 100.00, 100.00, , 100.00, , 11.00, ]";

			int report5thRowListCount = report5thRowList.size();
			ArrayList<String> report5thRowListArray = new ArrayList<String>();
			for(int i=1;i<report5thRowListCount;i++)
			{
				String data = report5thRowList.get(i).getText();
				report5thRowListArray.add(data);
			}
			String actRow5List = report5thRowListArray.toString();
			String expRow5List = "[Sub Total, , , , , , , 100.00, 100.00, , 100.00, , 11.00, ]";

			int report6thRowListCount = report6thRowList.size();
			ArrayList<String> report6thRowListArray = new ArrayList<String>();
			for(int i=2;i<report6thRowListCount;i++)
			{
				String data = report6thRowList.get(i).getText();
				report6thRowListArray.add(data);
			}
			String actRow6List = report6thRowListArray.toString();
			String expRow6List = "[, , , , , , , , , , , , ]";
			
			int report7thRowListCount = report7thRowList.size();
			ArrayList<String> report7thRowListArray = new ArrayList<String>();
			for(int i=1;i<report7thRowListCount;i++)
			{
				String data = report7thRowList.get(i).getText();
				report7thRowListArray.add(data);
			}
			String actRow7List = report7thRowListArray.toString();
			String expRow7List = "[NDT48 : SU/AME/TEXT1, BR COGS ACC INV, , , , , 945.00, , , 945.00, , 945.00, , 66.15]";
			
			
			int report8thRowListCount = report8thRowList.size();
			ArrayList<String> report8thRowListArray = new ArrayList<String>();
			for(int i=1;i<report8thRowListCount;i++)
			{
				String data = report8thRowList.get(i).getText();
				report8thRowListArray.add(data);
			}
			String actRow8List = report8thRowListArray.toString();
			String expRow8List = "[NDT48 : SU/AME/TEXT1, Vendor B, , , , , , 900.00, 900.00, , 900.00, , 63.00, ]";
			
			
			int report9thRowListCount = report9thRowList.size();
			ArrayList<String> report9thRowListArray = new ArrayList<String>();
			for(int i=1;i<report9thRowListCount;i++)
			{
				String data = report9thRowList.get(i).getText();
				report9thRowListArray.add(data);
			}
			String actRow9List = report9thRowListArray.toString();
			String expRow9List = "[NDT50 : 1, BR COGS ACC INV, , , , , , 50.00, 50.00, , 50.00, , 3.50, ]";
			
			
			int report10thRowListCount = report10thRowList.size();
			ArrayList<String> report10thRowListArray = new ArrayList<String>();
			for(int i=1;i<report10thRowListCount;i++)
			{
				String data = report10thRowList.get(i).getText();
				report10thRowListArray.add(data);
			}
			String actRow10List = report10thRowListArray.toString();
			String expRow10List = "[NDT50 : 1, COGS POSTING ACC, , , , , 50.00, , , 50.00, , 50.00, , 3.50]";
			
			
			int report11thRowListCount = report11thRowList.size();
			ArrayList<String> report11thRowListArray = new ArrayList<String>();
			for(int i=1;i<report11thRowListCount;i++)
			{
				String data = report11thRowList.get(i).getText();
				report11thRowListArray.add(data);
			}
			String actRow11List = report11thRowListArray.toString();
			String expRow11List = "[NDT50 : 4, BR COGS ACC INV, , , , , , 42.00, 42.00, , 42.00, , 2.94, ]";
			
			int report12thRowListCount = report12thRowList.size();
			ArrayList<String> report12thRowListArray = new ArrayList<String>();
			for(int i=1;i<report12thRowListCount;i++)
			{
				String data = report12thRowList.get(i).getText();
				report12thRowListArray.add(data);
			}
			String actRow12List = report12thRowListArray.toString();
			String expRow12List = "[NDT50 : 4, COGS POSTING ACC, , , , , 42.00, , , 42.00, , 42.00, , 2.94]";
			
			int report13thRowListCount = report13thRowList.size();
			ArrayList<String> report13thRowListArray = new ArrayList<String>();
			for(int i=1;i<report13thRowListCount;i++)
			{
				String data = report13thRowList.get(i).getText();
				report13thRowListArray.add(data);
			}
			String actRow13List = report13thRowListArray.toString();
			String expRow13List = "[NDT50 : 5, BR COGS ACC INV, , , , , , 25.00, 25.00, , 25.00, , 1.75, ]";
			
			int report14thRowListCount = report14thRowList.size();
			ArrayList<String> report14thRowListArray = new ArrayList<String>();
			for(int i=1;i<report12thRowListCount;i++)
			{
				String data = report14thRowList.get(i).getText();
				report14thRowListArray.add(data);
			}
			String actRow14List = report14thRowListArray.toString();
			String expRow14List = "[NDT50 : 5, COGS POSTING ACC, , , , , 25.00, , , 25.00, , 25.00, , 1.75]";
			
			int report15thRowListCount = report15thRowList.size();
			ArrayList<String> report15thRowListArray = new ArrayList<String>();
			for(int i=1;i<report15thRowListCount;i++)
			{
				String data = report15thRowList.get(i).getText();
				report15thRowListArray.add(data);
			}
			String actRow15List = report15thRowListArray.toString();
			String expRow15List = "[SalRet : 2, BR COGS ACC INV, , , , , 17.50, , , 17.50, , 17.50, , 1.23]";
			
			int report16thRowListCount = report16thRowList.size();
			ArrayList<String> report16thRowListArray = new ArrayList<String>();
			for(int i=1;i<report16thRowListCount;i++)
			{
				String data = report16thRowList.get(i).getText();
				report16thRowListArray.add(data);
			}
			String actRow16List = report16thRowListArray.toString();
			String expRow16List = "[SalRet : 2, SR COGS POSTING ACC, , , , , , 17.50, 17.50, , 17.50, , 1.23, ]";
			
			
			int report17thRowListCount = report17thRowList.size();
			ArrayList<String> report17thRowListArray = new ArrayList<String>();
			for(int i=1;i<report17thRowListCount;i++)
			{
				String data = report17thRowList.get(i).getText();
				report17thRowListArray.add(data);
			}
			String actRow17List = report17thRowListArray.toString();
			String expRow17List = "[NDT50 : 7, BR COGS ACC INV, , , , , , 1.75, 1.75, , 1.75, , 0.12, ]";
			
			
			
			int report18thRowListCount = report18thRowList.size();
			ArrayList<String> report18thRowListArray = new ArrayList<String>();
			for(int i=1;i<report18thRowListCount;i++)
			{
				String data = report18thRowList.get(i).getText();
				report18thRowListArray.add(data);
			}
			String actRow18List = report18thRowListArray.toString();
			String expRow18List = "[NDT50 : 7, COGS POSTING ACC, , , , , 1.75, , , 1.75, , 1.75, , 0.12]";
			
			
			
			int report19thRowListCount = report19thRowList.size();
			ArrayList<String> report19thRowListArray = new ArrayList<String>();
			for(int i=1;i<report19thRowListCount;i++)
			{
				String data = report19thRowList.get(i).getText();
				report19thRowListArray.add(data);
			}
			String actRow19List = report19thRowListArray.toString();
			String expRow19List = "[PurRet : 2, BR COGS ACC INV, , , , , , 300.00, 300.00, , 300.00, , 21.00, ]";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_NextBtn));
			report_NextBtn.click();
			Thread.sleep(2500);
			
			int reportsP2Row1ListCount = report1stRowList.size();
			ArrayList<String> reportsP2Row1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsP2Row1ListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				reportsP2Row1ListArray.add(data);
			}
			String actP2Row1List = reportsP2Row1ListArray.toString();
			String expP2Row1List = "[PurRet : 2, Vendor A, , , , , 315.00, , , 315.00, , 315.00, , 22.05]";
			
			
			int report2ndP2RowListCount = report2ndRowList.size();
			ArrayList<String> report2ndP2RowListArray = new ArrayList<String>();
			for(int i=1;i<report2ndP2RowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndP2RowListArray.add(data);
			}
			String actP2Row2List = report2ndP2RowListArray.toString();
			String expP2Row2List = "[ShoStk : 1, BR COGS ACC INV, , , , , , 5.00, 5.00, , 5.00, , 5.00, ]";
			
			
			int report3rdP2RowListCount = report3rdRowList.size();
			ArrayList<String> report3rdP2RowListArray = new ArrayList<String>();
			for(int i=1;i<report3rdP2RowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdP2RowListArray.add(data);
			}
			String actP2Row3List = report3rdP2RowListArray.toString();
			String expP2Row3List = "[ShoStk : 1, SHORTAGE COGS POSTING ACC, , , , , 5.00, , , 5.00, , 5.00, , 5.00]";
			
			
			int report4thP2RowListCount = report4thRowList.size();
			ArrayList<String> report4thP2RowListArray = new ArrayList<String>();
			for(int i=1;i<report4thP2RowListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				report4thP2RowListArray.add(data);
			}
			String actP2Row4List = report4thP2RowListArray.toString();
			String expP2Row4List = "[Sub Total, , , , , , 1,401.25, 1,341.25, 1,341.25, 1,401.25, 1,341.25, 1,401.25, 98.54, 102.74]";

			int report5thP2RowListCount = report5thRowList.size();
			ArrayList<String> report5thP2RowListArray = new ArrayList<String>();
			for(int i=1;i<report5thP2RowListCount;i++)
			{
				String data = report5thRowList.get(i).getText();
				report5thP2RowListArray.add(data);
			}
			String actP2Row5List = report5thP2RowListArray.toString();
			String expP2Row5List = "[Grand Total, , , , , , 1,501.25, 1,441.25, 1,541.25, 1,401.25, 1,541.25, 1,401.25, 120.54, 102.74]";
			
			System.out.println("actRow1List  : "+actRow1List);
			System.out.println("expRow1List  : "+expRow1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow2List  : "+actRow2List);
			System.out.println("expRow2List  : "+expRow2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow3List  : "+actRow3List);
			System.out.println("expRow3List  : "+expRow3List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow4List  : "+actRow4List);
			System.out.println("expRow4List  : "+expRow4List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow5List  : "+actRow5List);
			System.out.println("expRow5List  : "+expRow5List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow6List  : "+actRow6List);
			System.out.println("expRow6List  : "+expRow6List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow7List  : "+actRow7List);
			System.out.println("expRow7List  : "+expRow7List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow8List  : "+actRow8List);
			System.out.println("expRow8List  : "+expRow8List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow9List  : "+actRow9List);
			System.out.println("expRow9List  : "+expRow9List);
			
			System.out.println("*********************************************************************");
			
			System.out.println("actRow10List  : "+actRow10List);
			System.out.println("expRow10List  : "+expRow10List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow11List  : "+actRow11List);
			System.out.println("expRow11List  : "+expRow11List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow12List  : "+actRow12List);
			System.out.println("expRow12List  : "+expRow12List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow13List  : "+actRow13List);
			System.out.println("expRow13List  : "+expRow13List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow14List  : "+actRow14List);
			System.out.println("expRow14List  : "+expRow14List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow15List  : "+actRow15List);
			System.out.println("expRow15List  : "+expRow15List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow16List  : "+actRow16List);
			System.out.println("expRow16List  : "+expRow16List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow17List  : "+actRow17List);
			System.out.println("expRow17List  : "+expRow17List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow18List  : "+actRow18List);
			System.out.println("expRow18List  : "+expRow18List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow19List  : "+actRow19List);
			System.out.println("expRow19List  : "+expRow19List);
			System.out.println("*********************************************************************");
			

			System.out.println("actP2Row1List  : "+actP2Row1List);
			System.out.println("expP2Row1List  : "+expP2Row1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actP2Row2List  : "+actP2Row2List);
			System.out.println("expP2Row2List  : "+expP2Row2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actP2Row3List  : "+actP2Row3List);
			System.out.println("expP2Row3List  : "+expP2Row3List);
			System.out.println("*********************************************************************");
					
			System.out.println("actP2Row4List  : "+actP2Row4List);
			System.out.println("expP2Row4List  : "+expP2Row4List);
			System.out.println("*********************************************************************");
					
			System.out.println("actP2Row5List  : "+actP2Row5List);
			System.out.println("expP2Row5List  : "+expP2Row5List);
			System.out.println("*********************************************************************");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			
			if(actRow1List.equalsIgnoreCase(expRow1List) && 
					actRow2List.equalsIgnoreCase(expRow2List) &&
					actRow3List.equalsIgnoreCase(expRow3List) &&
					actRow4List.equalsIgnoreCase(expRow4List) &&
					actRow5List.equalsIgnoreCase(expRow5List) &&
					actRow6List.equalsIgnoreCase(expRow6List) &&
					actRow7List.equalsIgnoreCase(expRow7List) &&
					actRow8List.equalsIgnoreCase(expRow8List) &&
					actRow9List.equalsIgnoreCase(expRow9List) &&
					actRow10List.equalsIgnoreCase(expRow10List) &&
					actRow11List.equalsIgnoreCase(expRow11List) &&
					actRow12List.equalsIgnoreCase(expRow12List) &&
					actRow13List.equalsIgnoreCase(expRow13List) &&
					actRow14List.equalsIgnoreCase(expRow14List) &&
					actRow15List.equalsIgnoreCase(expRow15List) &&
					actRow16List.equalsIgnoreCase(expRow16List) &&
					actRow17List.equalsIgnoreCase(expRow17List) &&
					actRow18List.equalsIgnoreCase(expRow18List) &&
					actRow19List.equalsIgnoreCase(expRow19List) &&
					actP2Row1List.equalsIgnoreCase(expP2Row1List) && 
					actP2Row2List.equalsIgnoreCase(expP2Row2List) &&
					actP2Row3List.equalsIgnoreCase(expP2Row3List) &&
					actP2Row4List.equalsIgnoreCase(expP2Row4List) &&
					actP2Row5List.equalsIgnoreCase(expP2Row5List))
			{
				System.out.println("Test Pass : Reports Are as Expected ");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Report Are NOT as Expected ");
				
				return false;
			}
		}


	
	
	
		@FindBy(xpath="//a[contains(text(),'Account')]//i[@class='icon-expand icon-font7']")
		private static WebElement filterAccountExpandBtn;
		
		@FindBy(xpath="//input[@id='5002']")
		private static WebElement  filterAccNameChkbox;
		
		@FindBy(xpath="//button[@class='Fbutton'][contains(text(),'Ok')]")
		private static WebElement  filter_FilterOkButton;
		                  
		@FindBy(xpath="//*[@id='FOption_513_0_DefaultFilter_0']")
		private static WebElement  enterDefaultAccTxt;
		
		
		@FindBy(xpath="//input[@id='FOption_659_0_DefaultFilter_0']")
		private static WebElement  enterVATDefaultAccTxt;
		
		
		@FindBy(xpath="//i[@class='icon icon-ok']")
		private static WebElement  filterOkButton;
		
	

		// Bank Reconciliation
		
		
		
		@FindBy(xpath="//li[@id='btnSaveDisableImmediate']//div[@class='toolbar_button_image']")
		private static WebElement saveBtn;
		
		@FindBy(xpath="//div[contains(text(),'Backtrack')]")
		private static WebElement backTrackBtn;
		
		@FindBy(xpath="//div[contains(text(),'Customize')]")
		private static WebElement customizeBtn;
		
		@FindBy(xpath="//div[contains(text(),'Cancel')]")
		private static WebElement cancelBtn;
		
		@FindBy(xpath="//input[@id='OptCtrlBank']")
		private static WebElement reportbankTxt;
		
		@FindBy(xpath="//*[@id='OptCtrlBank_table_data_body']/tr")
		private static List<WebElement> reportbankList;
		
		
		
		
		@FindBy(xpath="//select[@id='sortOrder']")
		private static WebElement sortOrderDropDown;
		
		@FindBy(xpath="//select[@id='selectStatus']")
		private static WebElement selectStatusDropDown;
		
		@FindBy(xpath="//select[@id='DatePeriod']")
		private static WebElement datePeriodDropDown;
		
		@FindBy(xpath="//input[@id='chkShow']")
		private static WebElement showConsolidatedAmountsForBankDeposits;
		
		@FindBy(xpath="//select[@id='SelectDebit']")
		private static WebElement selectDrCrDropDown;
		
		@FindBy(xpath="//div[@id='btnAdvFilterText']")
		private static WebElement advanceFilterBtn;
		
		@FindBy(xpath="//span[@id='btnClear']")
		private static WebElement clearBtn;
		
		@FindBy(xpath="//span[@id='btnLoad']")
		private static WebElement LoadBtn;
		
		@FindBy(xpath="//button[@id='btnPendingBills']")
		private static WebElement pendingBillsBtn;
		
		@FindBy(xpath="//button[@id='btnRaiseReceipt']")
		private static WebElement raiseReceiptsBtn;
		
		@FindBy(xpath="//button[@id='btnRaisePayment']")
		private static WebElement raisePaymentsBtn;
		
		
		@FindBy(xpath="//thead[@id='BRTable_head']/tr/th/div")
		private static List<WebElement> reporttableHeadeList;
		

		@FindBy(xpath="//*[@id='BRTable_body']/tr[1]/td")
		private static List<WebElement> bankRecRow1List  ; 
		
		@FindBy(xpath="//*[@id='BRTable_body']/tr[2]/td")
		private static List<WebElement> bankRecRow2List  ; 
		
		@FindBy(xpath="//*[@id='BRTable_body']/tr[3]/td")
		private static List<WebElement> bankRecRow3List  ; 
		
		@FindBy(xpath="//*[@id='BRTable_body']/tr[4]/td")
		private static List<WebElement> bankRecRow4List  ; 
		
		@FindBy(xpath="//*[@id='BRTable_body']/tr[5]/td")
		private static List<WebElement> bankRecRow5List  ; 
		
		@FindBy(xpath="//*[@id='BRTable_body']/tr/td[7]")
		private static List<WebElement> bankRecRow6List  ; 
		
		@FindBy(xpath="//*[@id='BRTable_body']/tr/td[8]")
		private static List<WebElement> bankRecRow7List  ; 
		
		@FindBy(xpath="//*[@id='BRTable_body']/tr/td[9]")
		private static List<WebElement> bankRecRow8List  ; 
		
		@FindBy(xpath="//label[@id='bookBal']")
		private static WebElement  bankRecBookBal; 
		
		@FindBy(xpath="//label[@id='outDebits']")
		private static WebElement  bankRecOutDebits; 
		
		@FindBy(xpath="//label[@id='outCredits']")
		private static WebElement  bankRecOutCredits; 
		
		@FindBy(xpath="//label[@id='clearedBal']")
		private static WebElement  bankRecClearedBal; 
		
		@FindBy(xpath="//label[@id='OpeningBalance']")
		private static WebElement  bankRecOpenBal; 
		
		@FindBy(xpath="//label[@id='debitCounts']")
		private static WebElement  bankRecDebitCounts; 
		
		@FindBy(xpath="//label[@id='creditCounts']")
		private static WebElement  bankRecCreditCounts; 
		
		@FindBy(xpath="//input[@id='bankBal']")
		private static WebElement  bankRecBankBal; 
		
		@FindBy(xpath="//label[@id='diff']")
		private static WebElement  bankRecDif; 
		
		@FindBy(xpath="//*[@id='OptCtrlBank_table_data_body']/tr")
		private static List<WebElement>  bankList; 
		

		
		
		
		public boolean checkBankReconciliationReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
			cashAndBankBooksMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bankReconciliationReport));
			bankReconciliationReport.click();
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);

            Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportbankTxt));
			reportbankTxt.click();
			reportbankTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			reportbankTxt.sendKeys(Keys.SPACE);
			
			int bankListCount=bankList.size();
			for (int i = 0; i < bankListCount; i++)
			{
			
				String data=bankList.get(i).getText();
				if (data.equalsIgnoreCase("HDFC")) 
				{
					bankList.get(i).click();
				}
			}
			
			reportbankTxt.sendKeys(Keys.TAB);

			Thread.sleep(1500);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LoadBtn));
			LoadBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bankRecBookBal));
            int bankRecRow1ListCount = bankRecRow1List.size();
			
			ArrayList<String> bankRecRow1ListArray = new ArrayList<String>();
			
			for(int i=0;i<bankRecRow1ListCount;i++)
			{
				String data = bankRecRow1List.get(i).getText();
				if (i==2)
				{
					data="Date Field";
				}
				if (i==4)
				{
					data="Date Field";
				}
				bankRecRow1ListArray.add(data);
				
			}
			
			String actbankRecRow1List = bankRecRow1ListArray.toString();
			String expbankRecRow1List = "[1, Pending, Date Field, Pmt:3, Date Field, 5.00, 0.00, PDPVAT3, Payments, , , ]";
			
			System.out.println("actbankRecRow1List : "+actbankRecRow1List);
			System.out.println("expbankRecRow1List : "+expbankRecRow1List);
			
            int bankRecRow2ListCount = bankRecRow2List.size();
			
			ArrayList<String> bankRecRow2ListArray = new ArrayList<String>();
			
			for(int i=0;i<bankRecRow2ListCount;i++)
			{
				String data = bankRecRow2List.get(i).getText();
				if (i==2)
				{
					data="Date Field";
				}
				if (i==4)
				{
					data="Date Field";
				}
				bankRecRow2ListArray.add(data);
				
			}
			
			String actbankRecRow2List = bankRecRow2ListArray.toString();
			String expbankRecRow2List = "[2, Pending, Date Field, NDT46:4, Date Field, 5.00, 0.00, PDRVAT4, PDR VAT, , , ]";
			
			System.out.println("actbankRecRow2List : "+actbankRecRow2List);
			System.out.println("expbankRecRow2List : "+expbankRecRow2List);
			
		    String actBookBal=bankRecBookBal.getText();
		    String expBookBal="0.24 Cr";

			String actbankRecOutDebits=bankRecOutDebits.getText();
		    String expbankRecOutDebits="10.00 Dr";
		
			String actbankRecOutCredits=bankRecOutCredits.getText();
		    String expbankRecOutCredits="10.24 Cr";
		
			String actbankRecClearedBal=bankRecClearedBal.getText();
		    String expbankRecClearedBal="0.00";
		
			String actbankRecOpenBal=bankRecOpenBal.getText();
		    String expbankRecOpenBal="0.00";
			

			String actbankRecDebitCounts=bankRecDebitCounts.getText();
		    String expbankRecDebitCounts="2";
			
			String actbankRecCreditCounts=bankRecCreditCounts.getText();
		    String expbankRecCreditCounts="0";
		    
			String actbankRecBankBal=bankRecBankBal.getAttribute("value");
		    String expbankRecBankBal="0.0000";
			
			
			System.out.println("**********************************checkBankReconciliationReport*****************************************");
			   System.out.println("BookBal             : "+actBookBal             +" Value Expected  : "+expBookBal);
	       System.out.println("bankRecOutDebits    : "+actbankRecOutDebits    +" Value Expected  : "+expbankRecOutDebits);
	       System.out.println("bankRecOutCredits   : "+actbankRecOutCredits   +" Value Expected  : "+expbankRecOutCredits);
	       System.out.println("bankRecClearedBal   : "+actbankRecClearedBal   +" Value Expected  : "+expbankRecClearedBal);
	       System.out.println("Opening Bal         : "+actbankRecOpenBal      +" Value Expected  : "+expbankRecOpenBal);
	       System.out.println("bankRecDebitCounts  : "+actbankRecDebitCounts  +" Value Expected  : "+expbankRecDebitCounts);
	       System.out.println("bankRecCreditCounts : "+actbankRecCreditCounts +" Value Expected  : "+expbankRecCreditCounts);
	       System.out.println("bankRecBankBal      : "+actbankRecBankBal      +" Value Expected  : "+expbankRecBankBal);
		    
	       
	       cancelBtn.click();
			
			if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
					actbankRecRow1List.equalsIgnoreCase(expbankRecRow1List) &&
					actbankRecRow2List.equalsIgnoreCase(expbankRecRow2List) &&  
					actBookBal.equalsIgnoreCase(expBookBal) && 
					actbankRecOutDebits.equalsIgnoreCase(expbankRecOutDebits) && actbankRecOutCredits.equalsIgnoreCase(expbankRecOutCredits) && 
					actbankRecClearedBal.equalsIgnoreCase(expbankRecClearedBal) && actbankRecDebitCounts.equalsIgnoreCase(expbankRecDebitCounts) && 
					actbankRecCreditCounts.equalsIgnoreCase(expbankRecCreditCounts) && actbankRecBankBal.equalsIgnoreCase(expbankRecBankBal)) 
			{
				System.out.println(" Test Pass: Value are Expected ");
				
				return true;
				
			} 
			else 
			{
				System.out.println(" Test Fail: Value are Expected ");
				
				return false;
			}
			
		}
		
		

		public boolean checkBankReconciliationImportOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
			cashAndBankBooksMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bankReconciliationImport));
			bankReconciliationImport.click();
			
			Thread.sleep(2000);
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage ="true";
			
			if(actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
			{
				return true;
			}
			else
			{
				return false;
			}
		}


		// CustomerVendorReconciliation
		
		
		public boolean checkCustomerVendorReconciliationReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
			cashAndBankBooksMenu.click();
			
			//Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerVendorReconciliation));
			customerVendorReconciliation.click();
			
			//Thread.sleep(2000);
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";


			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportbankTxt));
			reportbankTxt.click();
			reportbankTxt.sendKeys(Keys.SPACE);

			int reportbankListCount=reportbankList.size();
			for (int i = 0; i < reportbankListCount; i++) 
			{
			String data=reportbankList.get(i).getText();
			
				if (data.equalsIgnoreCase("Vendor B")) 
				{
					reportbankList.get(i).click();
				}
			}
			reportbankTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LoadBtn));
			LoadBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bankRecBookBal));
            int bankRecRow1ListCount = bankRecRow1List.size();
			
			ArrayList<String> bankRecRow1ListArray = new ArrayList<String>();
			
			for(int i=0;i<bankRecRow1ListCount;i++)
			{
				String data = bankRecRow1List.get(i).getText();
				if (i==2)
				{
					data="Date Field";
				}
				if (i==4)
				{
					data="Date Field";
				}
				bankRecRow1ListArray.add(data);
				
			}
			
			String actbankRecRow1List = bankRecRow1ListArray.toString();
			String expbankRecRow1List = "[1, Pending, Date Field, NDT51:1, Date Field, 10.00, 0.00, , Debit Notes VAT, , , ]";
			
			System.out.println("actbankRecRow1List : "+actbankRecRow1List);
			System.out.println("expbankRecRow1List : "+expbankRecRow1List);
			
            int bankRecRow2ListCount = bankRecRow2List.size();
			
			ArrayList<String> bankRecRow2ListArray = new ArrayList<String>();
			
			for(int i=0;i<bankRecRow2ListCount;i++)
			{
				String data = bankRecRow2List.get(i).getText();
				if (i==2)
				{
					data="Date Field";
				}
				if (i==4)
				{
					data="Date Field";
				}
				bankRecRow2ListArray.add(data);
			}
			String actbankRecRow2List = bankRecRow2ListArray.toString();
			String expbankRecRow2List = "[2, Pending, Date Field, NDT45:1, Date Field, 100.00, 0.00, , Payments VAT, , , ]";
			
			System.out.println("actbankRecRow2List : "+actbankRecRow2List);
			System.out.println("expbankRecRow2List : "+expbankRecRow2List);

			if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
					actbankRecRow1List.equalsIgnoreCase(expbankRecRow1List) && 
					actbankRecRow2List.equalsIgnoreCase(expbankRecRow2List))
			{
				System.out.println(" Test Pass: Values as Expected ");

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return true;
				
			} 
			else 
			{
				System.out.println(" Test Fail: Values as Expected ");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
				cancelBtn.click();
				return false;
			}
		}
		
		
		
// Bank reconciliation statement

		@FindBy(xpath="//input[@id='RITCheckbox__1']")
		private static WebElement brsshowConsolidatedAmountsChkBox;
		
		@FindBy(xpath="//input[@id='RITCheckbox__2']")
		private static WebElement brsIncludePdcChkBox;
		
		
		public boolean checkBankReconciliationStatementReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
			cashAndBankBooksMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bankReconciliationStatement));
			bankReconciliationStatement.click();
			
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
			reportaccountTxt.click();
			reportaccountTxt.sendKeys(Keys.SPACE);
			
			int reportaccountTxtListCount = reportaccountTxtList.size();
			
			for(int i=0;i<reportaccountTxtListCount;i++)
			{
				String data = reportaccountTxtList.get(i).getText();
				
				if(data.equalsIgnoreCase("HDFC"))
				{
					reportaccountTxtList.get(i).click();
				}
			}
			
			reportaccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(brsIncludePdcChkBox));
			brsIncludePdcChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(brsshowConsolidatedAmountsChkBox));
			brsshowConsolidatedAmountsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
            boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
			String expvalidationConfirmationMessage1 = "true";
			
			System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
			
			int reportsRow1ListCount = report1stRowList.size();
			ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsRow1ListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				reportsRow1ListArray.add(data);
			}
			String actRow1List = reportsRow1ListArray.toString();
			String expRow1List = "[, , Balance as per Books, , 0.24, , , , 0.24, , , , 0.02, , ]";
			
			
			int report2ndRowListCount = report2ndRowList.size();
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			for(int i=2;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
			}
			String actRow2List = report2ndRowListArray.toString();
			String expRow2List = "[NDT46 : 4, , 5.00, , 5.00, 5.24, 5.00, , 5.00, 5.24, 0.35, , 0.35, 0.37]";
			
			
			int report3rdRowListCount = report3rdRowList.size();
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			for(int i=2;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdRowListArray.add(data);
			}
			String actRow3List = report3rdRowListArray.toString();
			String expRow3List = "[NDT47 : 3, , , 5.24, 0.24, , , 5.24, 0.24, , , 0.37, 0.02, ]";
			
			
			int report4thRowListCount = report4thRowList.size();
			ArrayList<String> report4thRowListArray = new ArrayList<String>();
			for(int i=2;i<report4thRowListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				report4thRowListArray.add(data);
			}
			String actRow4List = report4thRowListArray.toString();
			String expRow4List = "[Pmt : 3, , 5.00, , 4.76, 5.00, 5.00, , 4.76, 5.00, 5.00, , 4.98, 5.00]";

			int report5thRowListCount = report5thRowList.size();
			ArrayList<String> report5thRowListArray = new ArrayList<String>();
			for(int i=2;i<report5thRowListCount;i++)
			{
				String data = report5thRowList.get(i).getText();
				report5thRowListArray.add(data);
			}
			String actRow5List = report5thRowListArray.toString();
			String expRow5List = "[, Balance as per Bank, , 5.00, , , , 5.00, , , , 5.00, , ]";
			
			int report6thRowListCount = report6thRowList.size();
			ArrayList<String> report6thRowListArray = new ArrayList<String>();
			for(int i=2;i<report6thRowListCount;i++)
			{
				String data = report6thRowList.get(i).getText();
				report6thRowListArray.add(data);
			}
			String actRow6List = report6thRowListArray.toString();
			String expRow6List = "[, , 10.00, 5.24, 9.52, 10.24, 10.00, 5.24, 9.52, 10.24, 5.35, 0.37, 5.32, 5.37]";
			
			System.out.println("********************************************************************");
			
			System.out.println("actRow1List  : "+actRow1List);
			System.out.println("expRow1List  : "+expRow1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow2List  : "+actRow2List);
			System.out.println("expRow2List  : "+expRow2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow3List  : "+actRow3List);
			System.out.println("expRow3List  : "+expRow3List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow4List  : "+actRow4List);
			System.out.println("expRow4List  : "+expRow4List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow5List  : "+actRow5List);
			System.out.println("expRow5List  : "+expRow5List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow6List  : "+actRow6List);
			System.out.println("expRow6List  : "+expRow6List);
			System.out.println("*********************************************************************");
					
			if(actRow1List.equalsIgnoreCase(expRow1List) &&
					actRow2List.equalsIgnoreCase(expRow2List) &&
					actRow3List.equalsIgnoreCase(expRow3List) &&
					actRow4List.equalsIgnoreCase(expRow4List) &&
					actRow5List.equalsIgnoreCase(expRow5List) && 
					actRow6List.equalsIgnoreCase(expRow6List) && 
					actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
					actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
			{
				System.out.println("Test Pass : Reports Are as Expected ");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Report Are NOT as Expected ");
				return false;
			}
			
			
		}

			
		public boolean checkPrintOptionBankReconciliationStatementReport() throws InterruptedException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
			sl_ReportPrintBtn.click();
			
            boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
			Thread.sleep(3000);
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(0));
		 	
		 	Thread.sleep(1000);
		 	
		 	getDriver().switchTo().window(openTabs.get(1)).close();
		 	
		 	Thread.sleep(1000);
		 	getDriver().switchTo().window(openTabs.get(0));
			
			
			System.out.println("openTabs"+openTabs);
			System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
			
			//Thread.sleep(1000);
			
			if(actOpenWindowsCount==expOpenWindowsCount && 
					actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}

		
		
		
		// Cheque Discounting
		
		
		

		@FindBy(xpath="//input[@id='optnCtrlCheqDisBank']")
		private static WebElement bankAccountTxt;
		
		@FindBy(xpath="//input[@id='optctrlCheqDisCustomer']")
		private static WebElement customerAccountTxt;
		
		@FindBy(xpath="//input[@id='DepositingBank']")
		private static WebElement discountingBankTxt;
		
		@FindBy(xpath="//i[@class='icon-reset icon-font6']")
		private static WebElement cd_LoadBtn;
		
		@FindBy(xpath="//input[@id='txtMarginPercentageId']")
		private static WebElement cd_MarginTxt;
		
		@FindBy(xpath="//input[@id='btnDepositingBank']")
		private static WebElement cd_ApplyBtn;
		
		@FindBy(xpath="//i[@class='icon-clear icon-font6']")
		private static WebElement cd_clearBtn;
		
		@FindBy(xpath="//span[@id='btnSave']//i[@class='icon-save icon-font6']")
		private static WebElement cd_saveBtn;
		
		@FindBy(xpath="//span[@id='btnClose']")
		private static WebElement cd_CloseBtn;
		
		
		@FindBy(xpath="//thead[@id='ChequeDiscountingTable_head']/tr/th/div")
		private static List<WebElement> cd_tableHeadeList;
		
		


		@FindBy(xpath="//td[@id='ChequeDiscountingTable_col_1-2']")
		private static WebElement  disCustomerRow1; 
		
		@FindBy(xpath="//td[@id='ChequeDiscountingTable_col_1-3']")
		private static WebElement  disVoucherRow1; 
		
		@FindBy(xpath="//td[@id='ChequeDiscountingTable_col_1-4']")
		private static WebElement  disMaturityDateRow1; 
		
		@FindBy(xpath="//td[@id='ChequeDiscountingTable_col_1-5']")
		private static WebElement  disChequeNumberRow1; 
		
		@FindBy(xpath="//td[@id='ChequeDiscountingTable_col_1-6']")
		private static WebElement  disAmountRow1; 
		
		@FindBy(xpath="//td[@id='ChequeDiscountingTable_col_1-7']")
		private static WebElement  disDiscountlimitRow1; 
		
		@FindBy(xpath="//td[@id='ChequeDiscountingTable_col_1-8']")
		private static WebElement  disDiscountAmtRow1; 
		
		@FindBy(xpath="//td[@id='ChequeDiscountingTable_col_1-9']")
		private static WebElement  disBankRow1; 
		
		@FindBy(xpath="//td[@id='ChequeDiscountingTable_col_1-10']")
		private static WebElement  disMarginRow1; 
		
		@FindBy(xpath="//td[@id='ChequeDiscountingTable_col_1-11']")
		private static WebElement  disPostOnDateRow1; 
	
		
		@FindBy(xpath="//*[@id='optnCtrlCheqDisBank_table_data_body']/tr")
		private static List<WebElement>  chequeDisList; 
		
		@FindBy(xpath="//*[@id='ChequeDiscountingTable_body']/tr[1]/td")
		private static List<WebElement>  chequeDisBodyGridList; 
		
		@FindBy(xpath="//*[@id='ChequeDiscountingTable_body']")
		private static WebElement  chequeDisBodyGrid; 
		
		
		
		public boolean checkChequeDiscountingReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
			cashAndBankBooksMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(chequeDiscountingMenu));
			chequeDiscountingMenu.click();
			
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";

			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
            Thread.sleep(2000);
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bankAccountTxt));
			bankAccountTxt.click();
			bankAccountTxt.sendKeys(Keys.SPACE);
			int chequeDisListCount=chequeDisList.size();
			
			for (int i = 0; i < chequeDisListCount; i++) 
			{
			
				String data=chequeDisList.get(i).getText();
				if (data.equalsIgnoreCase("HDFC"))
				{
				
					chequeDisList.get(i).click();
				}
				
			}
			bankAccountTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
				
				
			int chequeDisBodyGridListCount=chequeDisBodyGridList.size();
			
			ArrayList<String >chequeDisBodyGridListArray=new ArrayList<String>();
			
			for (int i = 0; i < chequeDisBodyGridListCount; i++) 
			{
			
				String data=chequeDisBodyGridList.get(i).getText();
				
				/*if (i==4)
				{
					data="Date Field";
				}
				
				if (i==11)
				{
					data="Date Field";
				}*/
				chequeDisBodyGridListArray.add(data);
				
			}
			
			String actchequeDisBodyGridList=chequeDisBodyGridListArray.toString();
			String expchequeDisBodyGridList="[, , , , , , , , , , , , ]";
			
			System.out.println(" Actual chequeDisBodyGridList : "+actchequeDisBodyGridList);
			System.out.println(" Exp chequeDisBodyGridList    : "+expchequeDisBodyGridList);

			if (actchequeDisBodyGridList.equalsIgnoreCase(expchequeDisBodyGridList) && 
					actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
			{
				System.out.println(" Test Pass: Displayed AS EXPECTED ");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_CloseBtn));
				cd_CloseBtn.click();
				return true;
				
			}
			else
			{
				System.out.println(" Test Fail: Displayed AS EXPECTED ");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_CloseBtn));
				cd_CloseBtn.click();
				return false;
			}
		}
	
	
	
		@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[5]/ul/li/a/span")
		private static List<WebElement> salesReportList;
		
		public boolean checkSalesRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
			salesReportsMenu.click();
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesRegisterReport));
			salesRegisterReport.click();
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
			reportaccountTxt.click();
			reportaccountTxt.sendKeys(Keys.SPACE);
			
			int reportaccountTxtListCount = reportaccountTxtList.size();
			
			for(int i=0;i<reportaccountTxtListCount;i++)
			{
				String data = reportaccountTxtList.get(i).getText();
				
				if(data.equalsIgnoreCase("Sales - Computers"))
				{
					reportaccountTxtList.get(i).click();
				}
			}
			
			reportaccountTxt.sendKeys(Keys.TAB);
			
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayMonthlyTotalChkBox));
			displayMonthlyTotalChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includeSalesReturnsVoucherChkBox));
			includeSalesReturnsVoucherChkBox.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
            boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
			String expvalidationConfirmationMessage1 = "true";
			
			System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
			
			int reportsRow1ListCount = report1stRowList.size();
			ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
			for(int i=2;i<reportsRow1ListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				reportsRow1ListArray.add(data);
			}
			String actRow1List = reportsRow1ListArray.toString();
			String expRow1List = "[NDT50 : 1, WA COGS ITEM, 30.00, 3.00]";
			
			
			int report2ndRowListCount = report2ndRowList.size();
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			for(int i=2;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
			}
			String actRow2List = report2ndRowListArray.toString();
			String expRow2List = "[NDT50 : 1, FIFO COGS ITEM, 40.00, 4.00]";
			
			
			int report3rdRowListCount = report3rdRowList.size();
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			for(int i=2;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdRowListArray.add(data);
			}
			String actRow3List = report3rdRowListArray.toString();
			String expRow3List = "[NDT50 : 1, BR COGS ITEM, 60.00, 60.00]";
			
			
			int report4thRowListCount = report4thRowList.size();
			ArrayList<String> report4thRowListArray = new ArrayList<String>();
			for(int i=2;i<report4thRowListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				report4thRowListArray.add(data);
			}
			String actRow4List = report4thRowListArray.toString();
			String expRow4List = "[NDT50 : 1, STD RATE COGS ITEM, 60.00, 60.00]";

			int report5thRowListCount = report5thRowList.size();
			ArrayList<String> report5thRowListArray = new ArrayList<String>();
			for(int i=2;i<report5thRowListCount;i++)
			{
				String data = report5thRowList.get(i).getText();
				report5thRowListArray.add(data);
			}
			String actRow5List = report5thRowListArray.toString();
			String expRow5List = "[SalRet : 2, WA COGS ITEM, 40.00, 4.00]";

			int report6thRowListCount = report6thRowList.size();
			ArrayList<String> report6thRowListArray = new ArrayList<String>();
			for(int i=2;i<report6thRowListCount;i++)
			{
				String data = report6thRowList.get(i).getText();
				report6thRowListArray.add(data);
			}
			String actRow6List = report6thRowListArray.toString();
			String expRow6List = "[SalRet : 2, FIFO COGS ITEM, 40.00, 4.00]";
			
			int report7thRowListCount = report7thRowList.size();
			ArrayList<String> report7thRowListArray = new ArrayList<String>();
			for(int i=2;i<report7thRowListCount;i++)
			{
				String data = report7thRowList.get(i).getText();
				report7thRowListArray.add(data);
			}
			String actRow7List = report7thRowListArray.toString();
			String expRow7List = "[SalRet : 2, BR COGS ITEM, 100.00, 10.00]";
			
			
			int report8thRowListCount = report8thRowList.size();
			ArrayList<String> report8thRowListArray = new ArrayList<String>();
			for(int i=2;i<report8thRowListCount;i++)
			{
				String data = report8thRowList.get(i).getText();
				report8thRowListArray.add(data);
			}
			String actRow8List = report8thRowListArray.toString();
			String expRow8List = "[SalRet : 2, STD RATE COGS ITEM, 40.00, 4.00]";
			
			
			int report9thRowListCount = report9thRowList.size();
			ArrayList<String> report9thRowListArray = new ArrayList<String>();
			for(int i=2;i<report9thRowListCount;i++)
			{
				String data = report9thRowList.get(i).getText();
				report9thRowListArray.add(data);
			}
			String actRow9List = report9thRowListArray.toString();
			String expRow9List = "[NDT50 : 4, WA COGS ITEM, 70.00, 7.00]";
			
			int report10thRowListCount = report10thRowList.size();
			ArrayList<String> report10thRowListArray = new ArrayList<String>();
			for(int i=2;i<report10thRowListCount;i++)
			{
				String data = report10thRowList.get(i).getText();
				report10thRowListArray.add(data);
			}
			String actRow10List = report10thRowListArray.toString();
			String expRow10List = "[NDT50 : 4, FIFO COGS ITEM, 80.00, 8.00]";
			
			int report11thRowListCount = report11thRowList.size();
			ArrayList<String> report11thRowListArray = new ArrayList<String>();
			for(int i=2;i<report11thRowListCount;i++)
			{
				String data = report11thRowList.get(i).getText();
				report11thRowListArray.add(data);
			}
			String actRow11List = report11thRowListArray.toString();
			String expRow11List = "[NDT50 : 4, BR COGS ITEM, 240.00, 24.00]";
			
			int report12thRowListCount = report12thRowList.size();
			ArrayList<String> report12thRowListArray = new ArrayList<String>();
			for(int i=2;i<report12thRowListCount;i++)
			{
				String data = report12thRowList.get(i).getText();
				report12thRowListArray.add(data);
			}
			String actRow12List = report12thRowListArray.toString();
			String expRow12List = "[NDT50 : 4, STD RATE COGS ITEM, 100.00, 10.00]";
			
			int report13thRowListCount = report13thRowList.size();
			ArrayList<String> report13thRowListArray = new ArrayList<String>();
			for(int i=2;i<report13thRowListCount;i++)
			{
				String data = report13thRowList.get(i).getText();
				report13thRowListArray.add(data);
			}
			String actRow13List = report13thRowListArray.toString();
			String expRow13List = "[NDT50 : 5, WA COGS ITEM, 30.00, 3.00]";
			
			int report14thRowListCount = report14thRowList.size();
			ArrayList<String> report14thRowListArray = new ArrayList<String>();
			for(int i=2;i<report12thRowListCount;i++)
			{
				String data = report14thRowList.get(i).getText();
				report14thRowListArray.add(data);
			}
			String actRow14List = report14thRowListArray.toString();
			String expRow14List = "[NDT50 : 5, FIFO COGS ITEM, 30.00, 3.00]";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_NextBtn));
			report_NextBtn.click();
			Thread.sleep(2500);
			
			int reportsP2Row1ListCount = report1stRowList.size();
			ArrayList<String> reportsP2Row1ListArray = new ArrayList<String>();
			for(int i=2;i<reportsP2Row1ListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				reportsP2Row1ListArray.add(data);
			}
			String actP2Row1List = reportsP2Row1ListArray.toString();
			String expP2Row1List = "[NDT50 : 5, BR COGS ITEM, 300.00, 30.00]";
			
			
			int report2ndP2RowListCount = report2ndRowList.size();
			ArrayList<String> report2ndP2RowListArray = new ArrayList<String>();
			for(int i=2;i<report2ndP2RowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndP2RowListArray.add(data);
			}
			String actP2Row2List = report2ndP2RowListArray.toString();
			String expP2Row2List = "[NDT50 : 5, STD RATE COGS ITEM, 160.00, 16.00]";
			
			
			int report3rdP2RowListCount = report3rdRowList.size();
			ArrayList<String> report3rdP2RowListArray = new ArrayList<String>();
			for(int i=2;i<report3rdP2RowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdP2RowListArray.add(data);
			}
			String actP2Row3List = report3rdP2RowListArray.toString();
			String expP2Row3List = "[NDT50 : 7, WA COGS ITEM, 10.00, 1.00]";
			
			
			int report4thP2RowListCount = report4thRowList.size();
			ArrayList<String> report4thP2RowListArray = new ArrayList<String>();
			for(int i=2;i<report4thP2RowListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				report4thP2RowListArray.add(data);
			}
			String actP2Row4List = report4thP2RowListArray.toString();
			String expP2Row4List = "[NDT50 : 7, FIFO COGS ITEM, 10.00, 1.00]";

			int report5thP2RowListCount = report5thRowList.size();
			ArrayList<String> report5thP2RowListArray = new ArrayList<String>();
			for(int i=2;i<report5thP2RowListCount;i++)
			{
				String data = report5thRowList.get(i).getText();
				report5thP2RowListArray.add(data);
			}
			String actP2Row5List = report5thP2RowListArray.toString();
			String expP2Row5List = "[NDT50 : 7, BR COGS ITEM, 10.00, 1.00]";
			
			int report6thP2RowListCount = report6thRowList.size();
			ArrayList<String> report6thP2RowListArray = new ArrayList<String>();
			for(int i=2;i<report6thP2RowListCount;i++)
			{
				String data = report6thRowList.get(i).getText();
				report6thP2RowListArray.add(data);
			}
			String actP2Row6List = report6thP2RowListArray.toString();
			String expP2Row6List = "[NDT50 : 7, STD RATE COGS ITEM, 10.00, 1.00]";
			
			int report7thP2RowListCount = report7thRowList.size();
			ArrayList<String> report7thP2RowListArray = new ArrayList<String>();
			for(int i=1;i<report7thP2RowListCount;i++)
			{
				String data = report7thRowList.get(i).getText();
				report7thP2RowListArray.add(data);
			}
			String actP2Row7List = report7thP2RowListArray.toString();
			String expP2Row7List = "[, December total, , 1,020.00, 210.00]";
			
			int report8thP2RowListCount = report8thRowList.size();
			ArrayList<String> report8thP2RowListArray = new ArrayList<String>();
			for(int i=1;i<report5thP2RowListCount;i++)
			{
				String data = report8thRowList.get(i).getText();
				report8thP2RowListArray.add(data);
			}
			String actP2Row8List = report8thP2RowListArray.toString();
			String expP2Row8List = "[Grand Total, , , 1,020.00, 210.00]";
			
			System.out.println("actRow1List  : "+actRow1List);
			System.out.println("expRow1List  : "+expRow1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow2List  : "+actRow2List);
			System.out.println("expRow2List  : "+expRow2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow3List  : "+actRow3List);
			System.out.println("expRow3List  : "+expRow3List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow4List  : "+actRow4List);
			System.out.println("expRow4List  : "+expRow4List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow5List  : "+actRow5List);
			System.out.println("expRow5List  : "+expRow5List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow6List  : "+actRow6List);
			System.out.println("expRow6List  : "+expRow6List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow7List  : "+actRow7List);
			System.out.println("expRow7List  : "+expRow7List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow8List  : "+actRow8List);
			System.out.println("expRow8List  : "+expRow8List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow9List  : "+actRow9List);
			System.out.println("expRow9List  : "+expRow9List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow10List  : "+actRow10List);
			System.out.println("expRow10List  : "+expRow10List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow11List  : "+actRow11List);
			System.out.println("expRow11List  : "+expRow11List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow12List  : "+actRow12List);
			System.out.println("expRow12List  : "+expRow12List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow13List  : "+actRow13List);
			System.out.println("expRow13List  : "+expRow13List);
			System.out.println("*********************************************************************");
			
			System.out.println("actRow14List  : "+actRow14List);
			System.out.println("expRow14List  : "+expRow14List);
			System.out.println("*********************************************************************");
			
			
			System.out.println("actP2Row1List  : "+actP2Row1List);
			System.out.println("expP2Row1List  : "+expP2Row1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actP2Row2List  : "+actP2Row2List);
			System.out.println("expP2Row2List  : "+expP2Row2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actP2Row3List  : "+actP2Row3List);
			System.out.println("expP2Row3List  : "+expP2Row3List);
			System.out.println("*********************************************************************");
					
			System.out.println("actP2Row4List  : "+actP2Row4List);
			System.out.println("expP2Row4List  : "+expP2Row4List);
			System.out.println("*********************************************************************");
					
			System.out.println("actP2Row5List  : "+actP2Row5List);
			System.out.println("expP2Row5List  : "+expP2Row5List);
			System.out.println("*********************************************************************");
			
			System.out.println("actP2Row6List  : "+actP2Row6List);
			System.out.println("expP2Row6List  : "+expP2Row6List);
			System.out.println("*********************************************************************");
			
			System.out.println("actP2Row7List  : "+actP2Row7List);
			System.out.println("expP2Row7List  : "+expP2Row7List);
			System.out.println("*********************************************************************");
			
			System.out.println("actP2Row8List  : "+actP2Row8List);
			System.out.println("expP2Row8List  : "+expP2Row8List);
			System.out.println("*********************************************************************");
			
			if(actRow1List.equalsIgnoreCase(expRow1List) && 
					actRow2List.equalsIgnoreCase(expRow2List) &&
					actRow3List.equalsIgnoreCase(expRow3List) &&
					actRow4List.equalsIgnoreCase(expRow4List) &&
					actRow5List.equalsIgnoreCase(expRow5List) &&
					actRow6List.equalsIgnoreCase(expRow6List) &&
					actRow7List.equalsIgnoreCase(expRow7List) &&
					actRow8List.equalsIgnoreCase(expRow8List) &&
					actRow9List.equalsIgnoreCase(expRow9List) &&
					actRow10List.equalsIgnoreCase(expRow10List) &&
					actRow11List.equalsIgnoreCase(expRow11List) &&
					actRow12List.equalsIgnoreCase(expRow12List) &&
					actRow13List.equalsIgnoreCase(expRow13List) &&
					actRow14List.equalsIgnoreCase(expRow14List) &&
					actP2Row1List.equalsIgnoreCase(expP2Row1List) && 
					actP2Row2List.equalsIgnoreCase(expP2Row2List) &&
					actP2Row3List.equalsIgnoreCase(expP2Row3List) &&
					actP2Row4List.equalsIgnoreCase(expP2Row4List) &&
					actP2Row5List.equalsIgnoreCase(expP2Row5List) &&
					actP2Row6List.equalsIgnoreCase(expP2Row6List) &&
					actP2Row7List.equalsIgnoreCase(expP2Row7List) &&
					actP2Row8List.equalsIgnoreCase(expP2Row8List) &&actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
					actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
			{
				System.out.println("Test Pass : Reports Are as Expected ");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Report Are NOT as Expected ");
				return false;
			}
		}

		@FindBy(xpath="//a[contains(text(),'Item')]//i[@class='icon-expand icon-font7']")
		private static WebElement filteRITEMExpandBtn;
		
		@FindBy(xpath="//*[@id='FilterFields_209_0']/li[3]/a")
		private static WebElement filterSalesItemExpandBtn;
		
		@FindBy(xpath="//input[@id='5021']")
		private static WebElement  filterItemNameChkbox;
		
		@FindBy(xpath="//input[@id='FOption_503_0_DefaultFilter_0']")
		private static WebElement  enterDefaultItemTxt;
	
		@FindBy(xpath="//input[@id='FOption_517_0_DefaultFilter_0']")
		private static WebElement  enterJEDefaultItemTxt;
		
		@FindBy(xpath="//input[@id='FOption_569_0_DefaultFilter_0']")
		private static WebElement  filterEnterPeakAndLowTxt;
		
		@FindBy(xpath="//input[@id='FOption_538_0_DefaultFilter_0']")
		private static WebElement  filterMasterInfoTxt;
		
		
		
		@FindBy(xpath="//input[@id='FOption_674_0_DefaultFilter_0']")
		private static WebElement  enterJEDefaultAccTxt;
		
		@FindBy(xpath="//input[@id='FOption_677_0_DefaultFilter_0']")
		private static WebElement  enterVATSalesDefaultItemTxt;
		
		@FindBy(xpath="//input[@id='FOption_209_0_DefaultFilter_0']")
		private static WebElement  enterVATDefaultItemTxt;
		
		@FindBy(xpath="//input[@id='RITCheckbox__1']")
		private static WebElement displayMonthlyTotalChkBox;
		
		@FindBy(xpath="//input[@id='RITCheckbox__1']")
		private static WebElement yearWiseComparsionChkbox;
		
		@FindBy(xpath="//span[contains(text(),'Include Sales Return voucher')]")
		private static WebElement includeSalesReturnsVoucherChkBox;
		
		

public boolean checkSalesRegisterCustomizationAndReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filteRITEMExpandBtn));
		filteRITEMExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterItemNameChkbox));
		if (filterItemNameChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterItemNameChkbox));
			filterItemNameChkbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterDefaultItemTxt));
		enterDefaultItemTxt.click();
		enterDefaultItemTxt.sendKeys("BR COGS ITEM");
		
		Thread.sleep(2000);
		
		enterDefaultItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT50 : 1, BR COGS ITEM, 100.00, 10.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT50 : 7, BR COGS ITEM, 120.00, 12.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			if (i==2) 
			{
			
				data="MonthField";
			}
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[MonthField, , 220.00, 22.00]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			
			
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[, , 220.00, 22.00]";
		
		System.out.println("****************************checkSalesRegisterCustomizationAndReport*******************************************");
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) )
		{
			System.out.println("Test Pass : Reports Are as Expected ");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			System.out.println("Test Fail : Report Are NOT as Expected ");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}

				
		public boolean checkSalesReturnRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
			salesReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReturnRegisterReport));
			salesReturnRegisterReport.click();
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
			//Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
			reportaccountTxt.click();
			reportaccountTxt.sendKeys(Keys.SPACE);
			int reportaccountTxtListCount = reportaccountTxtList.size();
			
			for(int i=0;i<reportaccountTxtListCount;i++)
			{
				String data = reportaccountTxtList.get(i).getText();
				
				if(data.equalsIgnoreCase("Sales - Computers"))
				{
					reportaccountTxtList.get(i).click();
				}
			}
			
			reportaccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
			
			int reportsRow1ListCount = report1stRowList.size();
			ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
			for(int i=2;i<reportsRow1ListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				reportsRow1ListArray.add(data);
			}
			String actRow1List = reportsRow1ListArray.toString();
			String expRow1List = "[SalRet : 2, Customer A, WA COGS ITEM, 4.00, 10.00, 40.00]";
			
			int report2ndRowListCount = report2ndRowList.size();
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			for(int i=2;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
			}
			String actRow2List = report2ndRowListArray.toString();
			String expRow2List = "[SalRet : 2, Customer A, FIFO COGS ITEM, 4.00, 10.00, 40.00]";
			
			
			int report3rdRowListCount = report3rdRowList.size();
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			for(int i=2;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdRowListArray.add(data);
			}
			String actRow3List = report3rdRowListArray.toString();
			String expRow3List = "[SalRet : 2, Customer A, BR COGS ITEM, 10.00, 10.00, 100.00]";
			
			
			int report4thRowListCount = report4thRowList.size();
			ArrayList<String> report4thRowListArray = new ArrayList<String>();
			for(int i=2;i<report4thRowListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				report4thRowListArray.add(data);
			}
			String actRow4List = report4thRowListArray.toString();
			String expRow4List = "[SalRet : 2, Customer A, STD RATE COGS ITEM, 4.00, 10.00, 40.00]";

			int report5thRowListCount = report5thRowList.size();
			ArrayList<String> report5thRowListArray = new ArrayList<String>();
			for(int i=2;i<report5thRowListCount;i++)
			{
				String data = report5thRowList.get(i).getText();
				report5thRowListArray.add(data);
			}
			String actRow5List = report5thRowListArray.toString();
			String expRow5List = "[, , , 22.00, 40.00, 220.00]";
			
			System.out.println("actRow1List  : "+actRow1List);
			System.out.println("expRow1List  : "+expRow1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow2List  : "+actRow2List);
			System.out.println("expRow2List  : "+expRow2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow3List  : "+actRow3List);
			System.out.println("expRow3List  : "+expRow3List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow4List  : "+actRow4List);
			System.out.println("expRow4List  : "+expRow4List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow5List  : "+actRow5List);
			System.out.println("expRow5List  : "+expRow5List);
			System.out.println("*********************************************************************");
			
			if(actRow1List.equalsIgnoreCase(expRow1List) &&
					actRow2List.equalsIgnoreCase(expRow2List) &&
					actRow3List.equalsIgnoreCase(expRow3List) &&
					actRow4List.equalsIgnoreCase(expRow4List) &&
					actRow5List.equalsIgnoreCase(expRow5List) )
			{
				System.out.println("Test Pass : Reports Are as Expected ");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Report Are NOT as Expected ");
				return false;
			}
		}

			
			
		public boolean checkPrintOptionSalesReturnRegisterReport() throws InterruptedException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
			sl_ReportPrintBtn.click();
			
			
            boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
			
			Thread.sleep(2000);
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(0));
		 	
		 	Thread.sleep(2000);
		 	
		 	getDriver().switchTo().window(openTabs.get(1)).close();
		 	
		 	getDriver().switchTo().window(openTabs.get(0));
			
			
			System.out.println("openTabs"+openTabs);
			System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
			
			
			if(actOpenWindowsCount==expOpenWindowsCount && 
					actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}

		

		public boolean checkSummarySalesBookReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
			salesReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(summarySalesBookReport));
			summarySalesBookReport.click();
			
            boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
			reportaccountTxt.click();
			reportaccountTxt.sendKeys(Keys.SPACE);
			
			int reportaccountTxtListCount = reportaccountTxtList.size();
			
			for(int i=0;i<reportaccountTxtListCount;i++)
			{
				String data = reportaccountTxtList.get(i).getText();
				
				if(data.equalsIgnoreCase("Sales - Computers"))
				{
					reportaccountTxtList.get(i).click();
				}
			}
			reportaccountTxt.sendKeys(Keys.TAB);

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(brsIncludePdcChkBox));
			brsIncludePdcChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(brsshowConsolidatedAmountsChkBox));
			brsshowConsolidatedAmountsChkBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();


			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
			
			int reportsRow1ListCount = report1stRowList.size();
			ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
			for(int i=2;i<reportsRow1ListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				reportsRow1ListArray.add(data);
			}
			String actRow1List = reportsRow1ListArray.toString();
			String expRow1List = "[NDT50 : 1, Customer Update, 190.00]";
			
			
			int report2ndRowListCount = report2ndRowList.size();
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			for(int i=2;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
			}
			String actRow2List = report2ndRowListArray.toString();
			String expRow2List = "[NDT50 : 4, Customer A, 490.00]";
			
			
			int report3rdRowListCount = report3rdRowList.size();
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			for(int i=2;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdRowListArray.add(data);
			}
			String actRow3List = report3rdRowListArray.toString();
			String expRow3List = "[NDT50 : 5, Customer A, 520.00]";
			
			
			int report4thRowListCount = report4thRowList.size();
			ArrayList<String> report4thRowListArray = new ArrayList<String>();
			for(int i=2;i<report4thRowListCount;i++)
			{
				String data = report4thRowList.get(i).getText();
				report4thRowListArray.add(data);
			}
			String actRow4List = report4thRowListArray.toString();
			String expRow4List = "[SalRet : 2, Customer A, 220.00]";

			int report5thRowListCount = report5thRowList.size();
			ArrayList<String> report5thRowListArray = new ArrayList<String>();
			for(int i=2;i<report5thRowListCount;i++)
			{
				String data = report5thRowList.get(i).getText();
				report5thRowListArray.add(data);
			}
			String actRow5List = report5thRowListArray.toString();
			String expRow5List = "[NDT50 : 7, Customer A, 40.00]";

			int report6thRowListCount = report6thRowList.size();
			ArrayList<String> report6thRowListArray = new ArrayList<String>();
			for(int i=2;i<report6thRowListCount;i++)
			{
				String data = report6thRowList.get(i).getText();
				if (i==2)
				{
				
					data="MonthField";
				}
				report6thRowListArray.add(data);
			}
			String actRow6List = report6thRowListArray.toString();
			String expRow6List = "[MonthField, , 1,020.00]";
			
			int report7thRowListCount = report7thRowList.size();
			ArrayList<String> report7thRowListArray = new ArrayList<String>();
			for(int i=2;i<report7thRowListCount;i++)
			{
				String data = report7thRowList.get(i).getText();
				report7thRowListArray.add(data);
			}
			String actRow7List = report7thRowListArray.toString();
			String expRow7List = "[, , 1,020.00]";
			
			System.out.println("actRow1List  : "+actRow1List);
			System.out.println("expRow1List  : "+expRow1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow2List  : "+actRow2List);
			System.out.println("expRow2List  : "+expRow2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow3List  : "+actRow3List);
			System.out.println("expRow3List  : "+expRow3List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow4List  : "+actRow4List);
			System.out.println("expRow4List  : "+expRow4List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow5List  : "+actRow5List);
			System.out.println("expRow5List  : "+expRow5List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow6List  : "+actRow6List);
			System.out.println("expRow6List  : "+expRow6List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow7List  : "+actRow7List);
			System.out.println("expRow7List  : "+expRow7List);
			System.out.println("*********************************************************************");
					
			
			if(actRow1List.equalsIgnoreCase(expRow1List) &&
					actRow2List.equalsIgnoreCase(expRow2List) &&
					actRow3List.equalsIgnoreCase(expRow3List) &&
					actRow4List.equalsIgnoreCase(expRow4List) &&
					actRow5List.equalsIgnoreCase(expRow5List) &&
					actRow6List.equalsIgnoreCase(expRow6List) &&
					actRow7List.equalsIgnoreCase(expRow7List)  )
			{
				System.out.println("Test Pass : Reports Are as Expected ");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Report Are NOT as Expected ");
				return false;
			}
			
		}

			
		
		
		public boolean checkPrintOptionSummarySalesBookReport() throws InterruptedException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
			sl_ReportPrintBtn.click();
			
			
            boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
			
			Thread.sleep(2000);
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(0));
		 	
		 	Thread.sleep(2000);
		 	
		 	getDriver().switchTo().window(openTabs.get(1)).close();
		 	
		 	Thread.sleep(1000);
		 	getDriver().switchTo().window(openTabs.get(0));
			
			
			System.out.println("openTabs"+openTabs);
			System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
			
			
			if(actOpenWindowsCount==expOpenWindowsCount && 
					actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}

		// Monthly Sales Book
		
		
				@FindBy(xpath="//input[@id='RITNumber__1']")
				private static WebElement topCustomerTxt;
				
				
	public boolean checkMonthlySalesBookReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
			salesReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(monthlySalesBookReport));
			monthlySalesBookReport.click();
			
			//Thread.sleep(2000);
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
			reportaccountTxt.click();
			reportaccountTxt.sendKeys(Keys.SPACE);
			int reportaccountTxtListCount = reportaccountTxtList.size();
			
			for(int i=0;i<reportaccountTxtListCount;i++)
			{
				String data = reportaccountTxtList.get(i).getText();
				
				if(data.equalsIgnoreCase("Sales - Computers"))
				{
					reportaccountTxtList.get(i).click();
				}
			}
			
			reportaccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
			
			int reportsRow1ListCount = report1stRowList.size();
			ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsRow1ListCount;i++)
			{
				String data = report1stRowList.get(i).getText();
				if (i==1) 
				{
				
					data="MonthField";
				}
				reportsRow1ListArray.add(data);
			}
			String actRow1List = reportsRow1ListArray.toString();
			String expRow1List = "[MonthField, 1,240.00]";
			
			
			int report2ndRowListCount = report2ndRowList.size();
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			for(int i=1;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
			}
			String actRow2List = report2ndRowListArray.toString();
			String expRow2List = "[Grand Total, 1,240.00]";
			
	
			
			System.out.println("actRow1List  : "+actRow1List);
			System.out.println("expRow1List  : "+expRow1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow2List  : "+actRow2List);
			System.out.println("expRow2List  : "+expRow2List);
			System.out.println("*********************************************************************");
			
			if(actRow1List.equalsIgnoreCase(expRow1List) &&
					actRow2List.equalsIgnoreCase(expRow2List))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
	
		
				
	// Top Customer List
	
	
	public boolean checkTopCustomerListReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(topCustomersListReport));
		topCustomersListReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage ="true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("Sales - Computers"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Customer A, 830.00, 830.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Customer Update, 190.00, 193.00]";
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Grand Total, 1,020.00, 1,023.00]";
		

		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&  actRow3List.equalsIgnoreCase(expRow3List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			return true;
		}
		else
		{
			
			return false;
		}
	}


	public boolean checkPrintOptionTopCustomerListReport() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
		sl_ReportPrintBtn.click();
		
		
        boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		Thread.sleep(2000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	Thread.sleep(2000);
	 	
	 	getDriver().switchTo().window(openTabs.get(1)).close();
	 	
	 	getDriver().switchTo().window(openTabs.get(0));
		
		
		System.out.println("openTabs"+openTabs);
		System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
		
		
		if(actOpenWindowsCount==expOpenWindowsCount && 
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
		
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[6]/ul/li/a/span")
	private static List<WebElement> purchaseReportList;
	
	public boolean checkPurchaseRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReportsMenu));
		purchaseReportsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseRegisterReport));
		purchaseRegisterReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ACC INV"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayMonthlyTotalChkBox));
		displayMonthlyTotalChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includePurchaseReturnChkbox));
		includePurchaseReturnChkbox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT48 : SU/AME/TEXT1, Vendor B, 200.00, BR COGS ITEM, 10.00, 20.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT48 : SU/AME/TEXT1, Vendor B, 400.00, BR COGS ITEM, 10.00, 40.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=4;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[300.00, BR COGS ITEM, 10.00, 30.00]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[PurRet : 2, Vendor A, 300.00, BR COGS ITEM, 10.00, 30.00]";
		
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			if(i==2)
			{
				data = "Month Field";
			}
			
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[Month Field, , 600.00, , 20.00, 120.00]";
		
		
		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[, , 600.00, , 20.00, 120.00]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public boolean checkPrintOptionPurchaseRegisterReport() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
		sl_ReportPrintBtn.click();
		
		
        boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		Thread.sleep(2000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	Thread.sleep(2000);
	 	
	 	getDriver().switchTo().window(openTabs.get(1)).close();
	 	
	 	getDriver().switchTo().window(openTabs.get(0));
		
		
		System.out.println("openTabs"+openTabs);
		System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
		
		
		if(actOpenWindowsCount==expOpenWindowsCount && 
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}

	
	
	// Purchase Return Register
	
	
	
	

	public boolean checkPurchaseReturnRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReportsMenu));
		purchaseReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReturnRegisteReport));
		purchaseReturnRegisteReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ACC INV"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[PurRet : 2, Vendor A, BR COGS ITEM, 10.00, 30.00, 300.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[, , , 10.00, 30.00, 300.00]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		} 
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	
	// Summary Purchase Register
	
	 public boolean checkSummaryPurchaseBookReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReportsMenu));
		purchaseReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(summaryPurchaseBookReport));
		summaryPurchaseBookReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ACC INV"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(brsIncludePdcChkBox));
		brsIncludePdcChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(brsshowConsolidatedAmountsChkBox));
		brsshowConsolidatedAmountsChkBox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[PurRet : 2, Vendor A, 300.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT48 : SU/AME/TEXT1, Vendor B, 900.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=3;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[, 600.00]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[, , 600.00]";
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List)  && 
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	 
	public boolean checkPrintOptionSummaryPurchaseBookReport() throws InterruptedException
	{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
			sl_ReportPrintBtn.click();
			
			
	        boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
			
			
			Thread.sleep(3000);
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(0));
		 	
		 	Thread.sleep(2000);
		 	
		 	getDriver().switchTo().window(openTabs.get(1)).close();
		 	
		 	getDriver().switchTo().window(openTabs.get(0));
			
			
			System.out.println("openTabs"+openTabs);
			System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
			
			
			if(actOpenWindowsCount==expOpenWindowsCount && 
					actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
			

	 @FindBy(xpath="//a[@id='207']//span[contains(text(),'VAT')]")
		private static WebElement vatReportMenu;
		
		
		@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[7]/ul/li/a/span")
		private static List<WebElement> vatReportList;
		

		@FindBy(xpath="//span[contains(text(),'Purchase Account Report')]")
		private static WebElement purchaseAccountReport;
		
		@FindBy(xpath="//span[contains(text(),'VAT detailed report')]")
		private static WebElement vatDetailedReport;
		
		@FindBy(xpath="//span[contains(text(),'Sales Account Report')]")
		private static WebElement salesAccountReport;
		
		@FindBy(xpath="//span[contains(text(),'Sales by Customer Report')]")
		private static WebElement salesByCustomerReport;
		
		@FindBy(xpath="//span[contains(text(),'VAT summary report')]")
		private static WebElement vatSummaryReport;
		
		@FindBy(xpath="//span[contains(text(),'VAT audit file')]")
		private static WebElement vatAuditFileReport;
		
		@FindBy(xpath="//span[contains(text(),'VAT return report')]")
		private static WebElement vatReturnReport;
		
		@FindBy(xpath="//span[contains(text(),'Sales advance VAT report')]")
		private static WebElement salesAdvanceVatReport;
		
		
		@FindBy(xpath="//select[@id='RITCombobox__1']")
		private static WebElement transactionTypeDropDown;
		
		@FindBy(xpath="//span[contains(text(),'Include Purchases Return voucher')]")
		private static WebElement includePurchaseSReturnsVoucherChkBox;
		
		
		
	public boolean checkVatPurchaseAccountReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatReportMenu));
		vatReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseAccountReport));
		purchaseAccountReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includePurchaseReturnChkbox));
		includePurchaseReturnChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
        boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT48:SU/AME/TEXT1, , 20.00, 1.00, , , , , , , , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT48:SU/AME/TEXT1, , 20.00, 1.00, , , , , , , , , ]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT48:SU/AME/TEXT1, , 400.00, 20.00, , , , , , , , , ]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT48:SU/AME/TEXT1, , 300.00, 15.00, , , , , , , , , ]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT48:SU/AME/TEXT1, , 200.00, 10.00, , , , , , , , , ]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT48:SU/AME/TEXT1, 20.00, , , , , , , , , , , ]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT48:SU/AME/TEXT1, 22.50, , , , , , , , , , , ]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=2;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[NDT48:SU/AME/TEXT1, 20.00, , , , , , , , , , , ]";
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=2;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[NDT48:SU/AME/TEXT1, , 400.00, 20.00, , , , , , , , , ]";
		
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=2;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[NDT48:SU/AME/TEXT1, , 300.00, 15.00, , , , , , , , , ]";
		
		
		int report11thRowListCount = report11thRowList.size();
		ArrayList<String> report11thRowListArray = new ArrayList<String>();
		for(int i=2;i<report11thRowListCount;i++)
		{
			String data = report11thRowList.get(i).getText();
			report11thRowListArray.add(data);
		}
		String actRow11List = report11thRowListArray.toString();
		String expRow11List = "[NDT48:SU/AME/TEXT1, , 200.00, 10.00, , , , , , , , , ]";
		
		int report12thRowListCount = report12thRowList.size();
		ArrayList<String> report12thRowListArray = new ArrayList<String>();
		for(int i=2;i<report12thRowListCount;i++)
		{
			String data = report12thRowList.get(i).getText();
			report12thRowListArray.add(data);
		}
		String actRow12List = report12thRowListArray.toString();
		String expRow12List = "[NDT48:SU/AME/TEXT1, , 40.00, 2.00, , , , , , , , , ]";
		
		int report13thRowListCount = report13thRowList.size();
		ArrayList<String> report13thRowListArray = new ArrayList<String>();
		for(int i=1;i<report13thRowListCount;i++)
		{
			String data = report13thRowList.get(i).getText();
			report13thRowListArray.add(data);
		}
		String actRow13List = report13thRowListArray.toString();
		String expRow13List = "[Grand Total, , 62.50, 1,880.00, 94.00, , , , , , , , , ]";
		
		System.out.println("*********************************************************************");
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow11List  : "+actRow11List);
		System.out.println("expRow11List  : "+expRow11List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow12List  : "+actRow12List);
		System.out.println("expRow12List  : "+expRow12List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow13List  : "+actRow13List);
		System.out.println("expRow13List  : "+expRow13List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List)
				&& actRow10List.equalsIgnoreCase(expRow10List) && actRow11List.equalsIgnoreCase(expRow11List) 
				&& actRow12List.equalsIgnoreCase(expRow12List) && actRow13List.equalsIgnoreCase(expRow13List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			return true;
		}
		else
		{
			
			return false;
		}
	}

	
	public boolean checkCustomizeOptionInVatPurchaseAccountReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
		report_ReportCustomizeBtn.click();
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusTransExpandBtn));
		cusTransExpandBtn.click();
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusTransExtraFieldExpandBtn));
		cusTransExtraFieldExpandBtn.click();
		
		
		Thread.sleep(1500);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", cusTransExtraFieldWarehouseExpandBtn);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusTransExtraFieldWarehouseExpandBtn));
		cusTransExtraFieldWarehouseExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseName));
		getAction().doubleClick(warehouseName).build().perform();
		
		Thread.sleep(1500);
		
		js.executeScript("arguments[0].scrollIntoView();", cusSaveBtn);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
		cusSaveBtn.click();
		
		String expMessage = "Data saved successfully";
	    
	    String actMessage = checkValidationMessage(expMessage);
		
	    
        Thread.sleep(2000);
	    
	    int reportsHeaderListCount1 = reportsHeaderList.size();
		ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
		for(int i=0;i<reportsHeaderListCount1;i++)
		{
			String data = reportsHeaderList.get(i).getText();
			reportsHeaderListArray1.add(data);
		}
		String actHeaderList1 = reportsHeaderListArray1.toString();
		String expHeaderList1 = "[, Date, Voucher, Exempted, Purchase 5%, Tax 5%, Purchase 1%, Purchase 2%, Purchase 4%, Purchase 12.5%, Purchase 13.5%, Purchase 14%, Purchase 14.5%, Purchase 15%, Purchase 20%, Warehouse Name]";
	    
	    System.out.println(" Header List Actual    : "+actHeaderList1);
	    System.out.println("  Header List expected : "+expHeaderList1);
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
		report_ReportCustomizeBtn.click();
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
		cuDeleteLayoutBtn.click();
		
		getWaitForAlert();
		getAlert().accept();
		
		String expDeleteMessage = "Layout Deleted Successfully";
	    
	    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
	    
	    Thread.sleep(2000);
	    
	    int reportsHeaderListCount = reportsHeaderList.size();
		ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
		for(int i=0;i<reportsHeaderListCount;i++)
		{
			String data = reportsHeaderList.get(i).getText();
			reportsHeaderListArray.add(data);
		}
		String actHeaderList = reportsHeaderListArray.toString();
		String expHeaderList = "[, Date, Voucher, Exempted, Purchase 5%, Tax 5%, Purchase 1%, Purchase 2%, Purchase 4%, Purchase 12.5%, Purchase 13.5%, Purchase 14%, Purchase 14.5%, Purchase 15%, Purchase 20%]";
	    
	    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
	    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
		
		
		if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
				actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	 
	 
	
	
	// Vat Detailed Report
	
			@FindBy(xpath="//span[contains(text(),'Local amount based on filter')]")
			private static WebElement localAmountBasedOnFilterChkBox;
			
   public boolean checkVatDetailedReportReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatReportMenu));
		vatReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatDetailedReport));
		vatDetailedReport.click();
		
		//Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage ="true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(localAmountBasedOnFilterChkBox));
		localAmountBasedOnFilterChkBox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
		filterAccountExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		if (filterAccNameChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
			filterAccNameChkbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterVATDefaultAccTxt));
		enterVATDefaultAccTxt.click();
		enterVATDefaultAccTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		enterVATDefaultAccTxt.sendKeys(Keys.SPACE);
		enterVATDefaultAccTxt.sendKeys("HDFC");
		Thread.sleep(2000);
		
		enterVATDefaultAccTxt.sendKeys(Keys.TAB);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();
		
		Thread.sleep(4000);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[1.b Standard rated supplies in Dubai, , , , , , , , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT47 : 3, HDFC, Vendor B, 5.00, 4.76, 5.00, 0.24, , 5.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Sub Total, , , , 5.00, 4.76, 5.00, 0.24, , 5.00]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[7. Adjustments to goods imported into the UAE, , , , , , , , , ]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT46 : 4, HDFC, Customer C, 5.00, , 5.00, , , 5.00]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[, , , 5.00, , 5.00, , , 5.00]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[, , , , 4.76, 10.00, 0.24, , ]";
		
				
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List)
				&& actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List)
				&& actRow7List.equalsIgnoreCase(expRow7List))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			
			return false;
		}
	}
	

	public boolean checkSalesAccountReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatReportMenu));
		vatReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountReport));
		salesAccountReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includePurchaseReturnChkbox));
		includePurchaseReturnChkbox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
	 
		Thread.sleep(2000);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT50:1, 40.00, , , , , , , , , , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT50:1, , 60.00, 3.00, , , , , , , , , ]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT50:1, , 60.00, 3.00, , , , , , , , , ]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT50:1, , 30.00, 1.50, , , , , , , , , ]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT50:4, 80.00, , , , , , , , , , , ]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT50:4, 240.00, , , , , , , , , , , ]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT50:4, 100.00, , , , , , , , , , , ]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=2;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[NDT50:4, 70.00, , , , , , , , , , , ]";
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=2;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[NDT50:5, 300.00, , , , , , , , , , , ]";
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=2;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[NDT50:5, 160.00, , , , , , , , , , , ]";
		
		
		int report11thRowListCount = report11thRowList.size();
		ArrayList<String> report11thRowListArray = new ArrayList<String>();
		for(int i=2;i<report11thRowListCount;i++)
		{
			String data = report11thRowList.get(i).getText();
			report11thRowListArray.add(data);
		}
		String actRow11List = report11thRowListArray.toString();
		String expRow11List = "[NDT50:5, 30.00, , , , , , , , , , , ]";
		
		int report12thRowListCount = report12thRowList.size();
		ArrayList<String> report12thRowListArray = new ArrayList<String>();
		for(int i=2;i<report12thRowListCount;i++)
		{
			String data = report12thRowList.get(i).getText();
			report12thRowListArray.add(data);
		}
		String actRow12List = report12thRowListArray.toString();
		String expRow12List = "[NDT50:5, 30.00, , , , , , , , , , , ]";
		
		int report13thRowListCount = report13thRowList.size();
		ArrayList<String> report13thRowListArray = new ArrayList<String>();
		for(int i=2;i<report13thRowListCount;i++)
		{
			String data = report13thRowList.get(i).getText();
			report13thRowListArray.add(data);
		}
		String actRow13List = report13thRowListArray.toString();
		String expRow13List = "[NDT50:7, 10.00, , , , , , , , , , , ]";
		
		int report14thRowListCount = report14thRowList.size();
		ArrayList<String> report14thRowListArray = new ArrayList<String>();
		for(int i=2;i<report14thRowListCount;i++)
		{
			String data = report14thRowList.get(i).getText();
			report14thRowListArray.add(data);
		}
		String actRow14List = report14thRowListArray.toString();
		String expRow14List = "[NDT50:7, 10.00, , , , , , , , , , , ]";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_NextBtn));
		report_NextBtn.click();
		Thread.sleep(2500);
		
		int reportsP2Row1ListCount = report1stRowList.size();
		ArrayList<String> reportsP2Row1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsP2Row1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsP2Row1ListArray.add(data);
		}
		String actP2Row1List = reportsP2Row1ListArray.toString();
		String expP2Row1List = "[NDT50:7, 10.00, , , , , , , , , , , ]";
		
		
		int report2ndP2RowListCount = report2ndRowList.size();
		ArrayList<String> report2ndP2RowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndP2RowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndP2RowListArray.add(data);
		}
		String actP2Row2List = report2ndP2RowListArray.toString();
		String expP2Row2List = "[NDT50:7, 10.00, , , , , , , , , , , ]";
		
		
		int report3rdP2RowListCount = report3rdRowList.size();
		ArrayList<String> report3rdP2RowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdP2RowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdP2RowListArray.add(data);
		}
		String actP2Row3List = report3rdP2RowListArray.toString();
		String expP2Row3List = "[, 1,090.00, 150.00, 7.50, , , , , , , , , ]";
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow11List  : "+actRow11List);
		System.out.println("expRow11List  : "+expRow11List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow12List  : "+actRow12List);
		System.out.println("expRow12List  : "+expRow12List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow13List  : "+actRow13List);
		System.out.println("expRow13List  : "+expRow13List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow14List  : "+actRow14List);
		System.out.println("expRow14List  : "+expRow14List);
		System.out.println("*********************************************************************");
		
		
		System.out.println("actP2Row1List  : "+actP2Row1List);
		System.out.println("expP2Row1List  : "+expP2Row1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actP2Row2List  : "+actP2Row2List);
		System.out.println("expP2Row2List  : "+expP2Row2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actP2Row3List  : "+actP2Row3List);
		System.out.println("expP2Row3List  : "+expP2Row3List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) && 
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) &&
				actRow11List.equalsIgnoreCase(expRow11List) &&
				actRow12List.equalsIgnoreCase(expRow12List) &&
				actRow13List.equalsIgnoreCase(expRow13List) &&
				actRow14List.equalsIgnoreCase(expRow14List) &&
				actP2Row1List.equalsIgnoreCase(expP2Row1List) && 
				actP2Row2List.equalsIgnoreCase(expP2Row2List) &&
				actP2Row3List.equalsIgnoreCase(expP2Row3List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			System.out.println("Test Pass : Reports Are as Expected ");
			return true;
		}
		else
		{
			System.out.println("Test Fail : Report Are NOT as Expected ");
			return false;
		}
	}
	
	// Sales By Customer Report
	
	@FindBy(xpath="//select[@id='RITCombobox__2']")
	private static WebElement voucherTypeDropDown;
	
	@FindBy(xpath="//select[@id='RITCombobox__3']")
	private static WebElement selectDealersDropDown;

	public boolean checkSalesByCustomerReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatReportMenu));
		vatReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesByCustomerReport));
		salesByCustomerReport.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 ="true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Sales - Computers, 16, , , 16, , , 16, , , 16, , 16, , , 16, , , 16, ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Grand Total, 16, , , 16, , , 16, , , 16, , 16, , , 16, , , 16, ]";
		

		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List)  && 
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

		

	// Vat Summary Report
	
	
	@FindBy(xpath="//span[@class='icon-filter icon-font7']")
	private static WebElement vat_filterBtn;
	
	@FindBy(xpath="//span[@class='icon-ok icon-font7']")
	private static WebElement vat_OkBtn;
	
	@FindBy(xpath="//span[@class='icon-close icon-font7']")
	private static WebElement vat_CloseBtn;
	               
	@FindBy(xpath="//select[@id='ddlVATHomeRepDateOpt']")
	private static WebElement vat_DateOptionDropdown;
	
	@FindBy(xpath="//input[@id='VATHomeReport_StartDate']")
	private static WebElement vat_StartDateTxt;
	
	@FindBy(xpath="//td[@id='VATHomeReport_StartDate_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	private static WebElement vat_StartDateCalanderBtn;
	
	@FindBy(xpath="//input[@id='VATHomeReport_EndDate']")
	private static WebElement vat_EndDateTxt;
	
	@FindBy(xpath="//td[@id='VATHomeReport_EndDate_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	private static WebElement vat_EndDateCalanderBtn;
	
	@FindBy(xpath="//select[@id='ddlVATHomeRepOutPut']")
	private static WebElement vat_OutputDropdown;
	
	
	public boolean checkVatSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatReportMenu));
		vatReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatSummaryReport));
		vatSummaryReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_DateOptionDropdown));
		vat_DateOptionDropdown.click();
		Select s=new Select(vat_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_OkBtn));
		vat_OkBtn.click();

		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage1 ="true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		int vatSummaryListCount = vatSummaryList.size();
		ArrayList<String> vatSummaryListArray = new ArrayList<String>();
		for(int i=1;i<vatSummaryListCount;i++)
		{
			String data = vatSummaryList.get(i).getText();
			vatSummaryListArray.add(data);
		}
		String actvatSummaryList = vatSummaryListArray.toString();
		String expvatSummaryList = "[Sales UAE, ABU DHABI, 0.00, 0.00, 0.00, 2, , AJMAN, 0.00, 0.00, 0.00, 3, , DUBAI, 1,075.50, 0.00, 7.50, 4, , FUJAIRAH, 0.00, 0.00, 0.00, 5, , RAS AL-KHAIMAH, 0.00, 0.00, 0.00, 6, , SHARJAH, 0.00, 0.00, 0.00, 7, , UMM AL-QUWAIN, 0.00, 0.00, 0.00, 8, , TOTAL UAE, 1,075.50, 0.00, 7.50, 9, Sales GCC, , 0.00, 0.00, 0.00, 10, Zero Rate Sales, , 160.00, 0.00, 0.00, 11, Exempt Sales, , 0.00, 0.00, 0.00, 12, Sales Export, , 0.00, 0.00, 0.00, 13, , Total Sales, 1,235.50, 0.00, 7.50, 1, Purchase UAE, ABU DHABI, 1,880.00, 0.00, 94.00, 2, , AJMAN, 0.00, 0.00, 0.00, 3, , DUBAI, 0.00, 0.00, 0.00, 4, , FUJAIRAH, 0.00, 0.00, 0.00, 5, , RAS AL-KHAIMAH, 0.00, 0.00, 0.00, 6, , SHARJAH, 0.00, 0.00, 0.00, 7, , UMM AL-QUWAIN, 0.00, 0.00, 0.00, 8, , TOTAL UAE, 1,880.00, 0.00, 94.00, 9, Purchase GCC, , 0.00, 0.00, 0.00, 10, Zero Rate Purchase, , 62.50, 0.00, 0.00, 11, Exempt Purchase, , 0.00, 0.00, 0.00, 12, RCM Import, , 0.00, 0.00, 0.00, 13, , Total Purchase, 1,942.50, 0.00, 94.00]";
		
		System.out.println("actvatSummaryList : "+actvatSummaryList);
		System.out.println("expvatSummaryList : "+expvatSummaryList);
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) && 
				actvatSummaryList.equalsIgnoreCase(expvatSummaryList))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatSummaryExistBtn));
			vatSummaryExistBtn.click();
				
			return true;
		}
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatSummaryExistBtn));
			vatSummaryExistBtn.click();
				
			return false;
		}
		
	}
		

	
	@FindBy(xpath="//*[@id='tblsummary']/tr/td")
	private static List<WebElement> vatSummaryList;
	
	@FindBy(xpath="//div[@id='myNavbarVATSummaryRep']//span[@class='icon-close icon-font7']")
	private static WebElement vatSummaryExistBtn;
	
	@FindBy(xpath="//table[@id='tblCompanyInfo']//td[9]")
	private static WebElement  periodEndsTxt; 
	
	@FindBy(xpath="//table[@id='tblCompanyInfo']//td[9]")
	private static WebElement  FAFCrestionDateTxt; 
	
	@FindBy(xpath="//*[@id='tblCompanyInfo']/tbody/tr/td[11]")
	private static WebElement productVersionTxt ; 
	
	@FindBy(xpath="//*[@id='tblPurListing']/tbody/tr/td[1]")
	private static List<WebElement> purchaseSupplierName ; 
	
	@FindBy(xpath="//*[@id='tblPurListing']/tbody/tr/td[4]")
	private static List<WebElement> purchaseInvoiceNoList ; 
	
	@FindBy(xpath="//*[@id='tblPurListing']/tbody/tr/td[7]")
	private static List<WebElement> purchaseProductDescList ; 
	
	@FindBy(xpath="//*[@id='tblPurListing']/tbody/tr/td[8]")
	private static List<WebElement> purchaseValueAED ; 
	
	@FindBy(xpath="//*[@id='tblPurListing']/tbody/tr/td[9]")
	private static List<WebElement> purchaseVATVAlueAED ; 
	
	@FindBy(xpath="//*[@id='tblPurListing']/tbody/tr/td[10]")
	private static List<WebElement> purchaseTAxcode ; 
	
	
	@FindBy(xpath="//*[@id='VATAuditFileBody']/div[2]/div/div[3]/label[4]")
	private static WebElement  purchaseTransCountTotal; 
	
	@FindBy(xpath="//*[@id='VATAuditFileBody']/div[2]/div/div[3]/label[3]")
	private static WebElement  purchaseVatTotalAED;
	
	@FindBy(xpath="//*[@id='VATAuditFileBody']/div[2]/div/div[3]/label[2]")
	private static WebElement  purchaseTotalAED;
	
	
	
	//Sales Grid
	
	
	
	
	
	@FindBy(xpath="//*[@id='tblSupplySalListing']/tbody/tr/td[1]")
	private static List<WebElement> CustomerNameList ; 
	
	@FindBy(xpath="//*[@id='tblSupplySalListing']/tbody/tr/td[4]")
	private static List<WebElement> salesInvoiceNoList ; 
	
	@FindBy(xpath="//*[@id='tblSupplySalListing']/tbody/tr/td[6]")
	private static List<WebElement> salesProductDescList ; 
	
	@FindBy(xpath="//*[@id='tblSupplySalListing']/tbody/tr/td[7]")
	private static List<WebElement> salesSupplyValueAED ; 
	
	@FindBy(xpath="//*[@id='tblSupplySalListing']/tbody/tr/td[8]")
	private static List<WebElement> salesVatValueAED ; 
	
	@FindBy(xpath="//*[@id='tblSupplySalListing']/tbody/tr/td[9]")
	private static List<WebElement> salesTaxcode ; 
	
	
	@FindBy(xpath="//*[@id='VATAuditFileBody']/div[3]/div/div[3]/label[4]")
	private static WebElement  salesTransCountTotal; 
	
	@FindBy(xpath="//*[@id='VATAuditFileBody']/div[3]/div/div[3]/label[3]")
	private static WebElement  salesVatTotalAED;
	
	@FindBy(xpath="//*[@id='VATAuditFileBody']/div[3]/div/div[3]/label[2]")
	private static WebElement  salesTotalAED;
	
	
	//Ledger
	
	
	@FindBy(xpath="//*[@id='tblGeneralLedger']/tbody/tr/td[2]")
	private static List<WebElement> ledgerAccountIDList ; 

	@FindBy(xpath="//*[@id='tblGeneralLedger']/tbody/tr/td[3]")
	private static List<WebElement> ledgerAccountNameList ; 

	@FindBy(xpath="//*[@id='tblGeneralLedger']/tbody/tr/td[4]")
	private static List<WebElement> ledgerTransDescList ; 
	
	@FindBy(xpath="//*[@id='tblGeneralLedger']/tbody/tr/td[5]")
	private static List<WebElement> ledgerNameList ;

	@FindBy(xpath="//*[@id='tblGeneralLedger']/tbody/tr/td[7]")
	private static List<WebElement> ledgeSourceDocIDList ;
	
	@FindBy(xpath="//*[@id='tblGeneralLedger']/tbody/tr/td[8]")
	private static List<WebElement> ledgeSourceTypeList ;
	
	@FindBy(xpath="//*[@id='tblGeneralLedger']/tbody/tr/td[9]")
	private static List<WebElement> ledgeDebitList ;
	
	@FindBy(xpath="//*[@id='tblGeneralLedger']/tbody/tr/td[10]")
	private static List<WebElement> ledgeCreditList ;
	
	@FindBy(xpath="//*[@id='tblGeneralLedger']/tbody/tr/td[11]")
	private static List<WebElement> ledgeBalList ;
	
	
	@FindBy(xpath="//*[@id='VATAuditFileBody']/div[4]/div/div[3]/label[5]")
	private static WebElement  GLTCurrency; 
	
	@FindBy(xpath="//*[@id='VATAuditFileBody']/div[4]/div/div[3]/label[4]")
	private static WebElement  TransCountTotal; 
	
	@FindBy(xpath="//*[@id='VATAuditFileBody']/div[4]/div/div[3]/label[3]")
	private static WebElement  totalcredit;
	
	@FindBy(xpath="//*[@id='VATAuditFileBody']/div[4]/div/div[3]/label[2]")
	private static WebElement  totalDebit;


	
	public boolean checkVatAuditFileReportOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatReportMenu));
		vatReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatAuditFileReport));
		vatAuditFileReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage =  "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_DateOptionDropdown));
		vat_DateOptionDropdown.click();
		Select s=new Select(vat_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_OkBtn));
		vat_OkBtn.click();
		
		Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(periodEndsTxt));

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date=new Date();
		
        String actperiodEndsTxt=periodEndsTxt.getText();
    	String expperiodEndsTxt=dateFormat.format(date);
        
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FAFCrestionDateTxt));

        String actFAFCrestionDateTxt=FAFCrestionDateTxt.getText();
    	String expFAFCrestionDateTxt=dateFormat.format(date);
		
    	
    	System.out.println("periodEndsTxt        : "+actperiodEndsTxt +" Value Expected : "+expperiodEndsTxt);
    	
    	System.out.println("FAFCrestionDateTxt   : "+actFAFCrestionDateTxt +" Value Expected : "+expFAFCrestionDateTxt);
    	
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FAFCrestionDateTxt));

        String actproductVersionTxt=productVersionTxt.getText();
    	String expproductVersionTxt="Focus9";
		
		//Supplier 
		
        int purchaseSupplierNameCount = purchaseSupplierName.size();
		
		ArrayList<String> purchaseSupplierNameArray = new ArrayList<String>();
		
		for(int i=0;i<purchaseSupplierNameCount;i++)
		{
			String data = purchaseSupplierName.get(i).getText();
			purchaseSupplierNameArray.add(data);
		}
		
		String actpurchaseSupplierName = purchaseSupplierNameArray.toString();
		String exppurchaseSupplierName = "[Vendor B, Vendor B, Vendor B, Vendor B, Vendor B, Vendor B, Vendor B, Vendor B, Vendor B, Vendor B, Vendor B, Vendor B]";
		
		
		//Invoice 
		

        int purchaseInvoiceNoListCount = purchaseInvoiceNoList.size();
		
		ArrayList<String> purchaseInvoiceNoListArray = new ArrayList<String>();
		
		for(int i=0;i<purchaseInvoiceNoListCount;i++)
		{
			String data = purchaseInvoiceNoList.get(i).getText();
			purchaseInvoiceNoListArray.add(data);
		}
		
		String actpurchaseInvoiceNoList = purchaseInvoiceNoListArray.toString();
		String exppurchaseInvoiceNoList = "[NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1]";
		
		
		
		//Product Description
		
		int purchaseProductDescListCount = purchaseProductDescList.size();
			
		ArrayList<String> purchaseProductDescListArray = new ArrayList<String>();
		
		for(int i=0;i<purchaseProductDescListCount;i++)
		{
			String data = purchaseProductDescList.get(i).getText();
			purchaseProductDescListArray.add(data);
		}
		
		String actpurchaseProductDescList = purchaseInvoiceNoListArray.toString();
		String exppurchaseProductDescList = "[NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1]";
		
		
		//purchaseValueAED
		
		int purchaseValueAEDCount = purchaseValueAED.size();
		
		ArrayList<String> purchaseValueAEDArray = new ArrayList<String>();
		
		for(int i=0;i<purchaseProductDescListCount;i++)
		{
			String data = purchaseValueAED.get(i).getText();
			purchaseValueAEDArray.add(data);
		}
		
		String actpurchaseValueAED = purchaseValueAEDArray.toString();
		String exppurchaseValueAED = "[40.00, 200.00, 200.00, 20.00, 300.00, 400.00, 20.00, 400.00, 20.00, 300.00, 20.00, 22.50]";
		
		
		//purchaseVATVAlueAED
		
		
        int purchaseVATVAlueAEDCount = purchaseVATVAlueAED.size();
		
		ArrayList<String> purchaseVATVAlueAEDArray = new ArrayList<String>();
		
		for(int i=0;i<purchaseVATVAlueAEDCount;i++)
		{
			String data = purchaseVATVAlueAED.get(i).getText();
			purchaseVATVAlueAEDArray.add(data);
		}
		
		String actpurchaseVATVAlueAED = purchaseVATVAlueAEDArray.toString();
		String exppurchaseVATVAlueAED = "[2.00, 10.00, 10.00, 1.00, 15.00, 20.00, 0.00, 20.00, 1.00, 15.00, 0.00, 0.00]";
		
		
		//purchaseTAxcode
		
       int purchaseTAxcodeCount = purchaseTAxcode.size();
		
		ArrayList<String> purchaseTAxcodeArray = new ArrayList<String>();
		
		for(int i=0;i<purchaseTAxcodeCount;i++)
		{
			String data = purchaseTAxcode.get(i).getText();
			purchaseTAxcodeArray.add(data);
		}
		
		String actpurchaseTAxcode = purchaseTAxcodeArray.toString();
		String exppurchaseTAxcode = "[SR-REC, SR-REC, SR-REC, SR-REC, SR-REC, SR-REC, ZR, SR-REC, SR-REC, SR-REC, ZR, ZR]";
		
		
		
		String actpurchaseTransCountTotal=purchaseTransCountTotal.getText();
		String exppurchaseTransCountTotal= "1.00";
		
		System.out.println("purchaseTransCountTotal   : "+actpurchaseTransCountTotal);
		
		String actpurchaseVatTotalAED=purchaseVatTotalAED.getText();
		String exppurchaseVatTotalAED= "94.00";
		
		String actpurchaseTotalAED=purchaseTotalAED.getText();
		String exppurchaseTotalAED= "1,942.50";
		
		
       //Sales
		
         //CUSTOMER LIST 
		
        int CustomerNameListCount = CustomerNameList.size();
		
		ArrayList<String> CustomerNameListArray = new ArrayList<String>();
		
		for(int i=0;i<CustomerNameListCount;i++)
		{
			String data = CustomerNameList.get(i).getText();
			CustomerNameListArray.add(data);
		}
		
		String actCustomerNameList = CustomerNameListArray.toString();
		String expCustomerNameList = "[Customer Update, Customer Update, Customer Update, Customer Update, Customer A, Customer A, Customer A, Customer A, Customer A, Customer A, Customer A, Customer A, Customer A, Customer A, Customer A, Customer A]";
		
		
		// Sales Invoice 
		

        int salesInvoiceNoListCount = salesInvoiceNoList.size();
		
		ArrayList<String> salesInvoiceNoListArray = new ArrayList<String>();
		
		for(int i=0;i<salesInvoiceNoListCount;i++)
		{
			String data = salesInvoiceNoList.get(i).getText();
			salesInvoiceNoListArray.add(data);
		}
		
		String actsalesInvoiceNoList = salesInvoiceNoListArray.toString();
		String expsalesInvoiceNoList = "[NDT50 : 1, NDT50 : 1, NDT50 : 1, NDT50 : 1, NDT50 : 4, NDT50 : 4, NDT50 : 4, NDT50 : 4, NDT50 : 5, NDT50 : 5, NDT50 : 5, NDT50 : 5, NDT50 : 7, NDT50 : 7, NDT50 : 7, NDT50 : 7]";
		
		
		
		//Sales Product Description
		
		int salesProductDescListCount = salesProductDescList.size();
			
		ArrayList<String> salesProductDescListArray = new ArrayList<String>();
		
		for(int i=0;i<salesProductDescListCount;i++)
		{
			String data = salesProductDescList.get(i).getText();
			salesProductDescListArray.add(data);
		}
		
		String actsalesProductDescList = salesProductDescListArray.toString();
		String expsalesProductDescList = "[WA COGS ITEM, STD RATE COGS ITEM, FIFO COGS ITEM, BR COGS ITEM, FIFO COGS ITEM, BR COGS ITEM, STD RATE COGS ITEM, WA COGS ITEM, WA COGS ITEM, FIFO COGS ITEM, BR COGS ITEM, STD RATE COGS ITEM, WA COGS ITEM, FIFO COGS ITEM, BR COGS ITEM, STD RATE COGS ITEM]";
		
		
		//Sales Value AED
		
		int salesSupplyValueAEDCount = salesSupplyValueAED.size();
		
		ArrayList<String> salesSupplyValueAEDArray = new ArrayList<String>();
		
		for(int i=0;i<salesSupplyValueAEDCount;i++)
		{
			String data = salesSupplyValueAED.get(i).getText();
			salesSupplyValueAEDArray.add(data);
		}
		
		String actsalesSupplyValueAED = salesSupplyValueAEDArray.toString();
		String expsalesSupplyValueAED = "[30.00, 55.50, 40.00, 60.00, 80.00, 240.00, 100.00, 70.00, 30.00, 30.00, 300.00, 160.00, 10.00, 10.00, 10.00, 10.00]";
		
		//Sales TAxcode
		
       int salesTaxcodeCount = salesTaxcode.size();
		
		ArrayList<String> salesTaxcodeArray = new ArrayList<String>();
		
		for(int i=0;i<salesTaxcodeCount;i++)
		{
			String data = salesTaxcode.get(i).getText();
			salesTaxcodeArray.add(data);
		}
		
		String actsalesTaxcode = salesTaxcodeArray.toString();
		String expsalesTaxcode = "[SR, SR, ZR, SR, ZR, SR, SR, SR, SR, ZR, SR, SR, SR, ZR, SR, SR]";
		
		
		
		String actSalesTransCountTotal=salesTransCountTotal.getText();
		String expSalesTransCountTotal= "4.00";
		
		System.out.println("actSalesTransCountTotal   : "+actSalesTransCountTotal);
		
		String actsalesVatTotalAED=salesVatTotalAED.getText();
		String expsalesVatTotalAED= "7.50";
		
		String actsalesTotalAED=salesTotalAED.getText();
		String expsalesTotalAED= "1,235.50";
		
		
		//Ledger
		
        int ledgerAccountIDListCount = ledgerAccountIDList.size();
		
		ArrayList<String> ledgerAccountIDListArray = new ArrayList<String>();
		
		for(int i=0;i<ledgerAccountIDListCount;i++)
		{
			String data = ledgerAccountIDList.get(i).getText();
			ledgerAccountIDListArray.add(data);
		}
		
		String actledgerAccountIDList =ledgerAccountIDListArray.toString();
		String expledgerAccountIDList = "[121-001, VAT ADVANCE SALE, VAT OUTPUT, 033-001, 033-002, 121-001, 122-001, 121-001, VAT ADVANCE PURCHASE, VAT INPUT, 033-001, 033-002, 121-001, 122-002, 121-001, VAT ADVANCE PURCHASE, VAT INPUT, 033-001, 121-001, 122-001, VAT INPUT, 121-001, 122-002, VAT INPUT, 122-003, HDFC, 121-001, 122-001, VAT INPUT, HDFC, VAT INPUT, 033-002, BR COGS ACC INV, FIFO COGS ACC INV, PURCHASE VARIANCE, STD RATE COGS ACC INV, VAT INPUT, 033-002, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, CUpdate, FIFO COGS ACC INV, 071-001, STD RATE COGS ACC INV, VAT OUTPUT, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, 122-001, FIFO COGS ACC INV, 071-001, STD RATE COGS ACC INV, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, 122-001, FIFO COGS ACC INV, 071-001, STD RATE COGS ACC INV, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, 122-001, FIFO COGS ACC INV, 071-001, STD RATE COGS ACC INV, WA COGS ACC INV, 121-001, 033-002, 121-001, 033-002, 121-001, 122-001, 033-001, 121-001, 122-001]";
		
		System.out.println("ledgerAccountIDList  "+actledgerAccountIDList);
		System.out.println("ledgerAccountIDList  "+expledgerAccountIDList);
		
		
		
		//ledgerAccountNameList
        int ledgerAccountNameListCount = ledgerAccountNameList.size();
		
		ArrayList<String> ledgerAccountNameListArray = new ArrayList<String>();
		
		for(int i=0;i<ledgerAccountNameListCount;i++)
		{
			String data = ledgerAccountNameList.get(i).getText();
			ledgerAccountNameListArray.add(data);
		}
		
		String actledgerAccountNameList = ledgerAccountNameListArray.toString();
		String expledgerAccountNameList = "[Bank, VAT ADVANCE SALE, VAT OUTPUT, Vendor A, Vendor B, Bank, Customer A, Bank, VAT ADVANCE PURCHASE, VAT INPUT, Vendor A, Vendor B, Bank, Customer B, Bank, VAT ADVANCE PURCHASE, VAT INPUT, Vendor A, Bank, Customer A, VAT INPUT, Bank, Customer B, VAT INPUT, Customer C, HDFC, Bank, Customer A, VAT INPUT, HDFC, VAT INPUT, Vendor B, BR COGS ACC INV, FIFO COGS ACC INV, PURCHASE VARIANCE, STD RATE COGS ACC INV, VAT INPUT, Vendor B, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, Customer Update, FIFO COGS ACC INV, Sales - Computers, STD RATE COGS ACC INV, VAT OUTPUT, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, Customer A, FIFO COGS ACC INV, Sales - Computers, STD RATE COGS ACC INV, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, Customer A, FIFO COGS ACC INV, Sales - Computers, STD RATE COGS ACC INV, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, Customer A, FIFO COGS ACC INV, Sales - Computers, STD RATE COGS ACC INV, WA COGS ACC INV, Bank, Vendor B, Bank, Vendor B, Bank, Customer A, Vendor A, Bank, Customer A]";
		
		System.out.println("ledgerAccountNameList  "+actledgerAccountNameList);
		System.out.println("ledgerAccountNameList  "+expledgerAccountNameList);
		
		//ledgerTransDescList
        int ledgerTransDescListCount = ledgerTransDescList.size();
		
		ArrayList<String> ledgerTransDescListArray = new ArrayList<String>();
		
		for(int i=0;i<ledgerTransDescListCount;i++)
		{
			String data = ledgerTransDescList.get(i).getText();
			ledgerTransDescListArray.add(data);
		}
		
		String actledgerTransDescList = ledgerTransDescListArray.toString();
		String expledgerTransDescList = "[Receipts VAT, Receipts VAT, Receipts VAT, Receipts VAT, Receipts VAT, Receipts VAT, Receipts VAT, Payments VAT, Payments VAT, Payments VAT, Payments VAT, Payments VAT, Payments VAT, Payments VAT, Payments VAT, Payments VAT, Payments VAT, Payments VAT, PDR VAT, PDR VAT, PDR VAT, PDR VAT, PDR VAT, PDR VAT, PDR VAT, PDR VAT, PDP VAT, PDP VAT, PDP VAT, PDP VAT, PDP VAT, PDP VAT, Purchase Voucher VAT, Purchase Voucher VAT, Purchase Voucher VAT, Purchase Voucher VAT, Purchase Voucher VAT, Purchase Voucher VAT, Purchase Voucher VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Sales invoice VAT, Debit Notes VAT, Debit Notes VAT, Credit Notes VAT, Credit Notes VAT, JV VAT View, JV VAT View, JV VAT View, JV VAT View, JV VAT View]";
		
		System.out.println("ledgerTransDescList  "+actledgerTransDescList);
		System.out.println("ledgerTransDescList  "+expledgerTransDescList);
		
		
		
		//ledgerNameList
        int ledgerNameListCount = ledgerNameList.size();
		
		ArrayList<String> ledgerNameListArray = new ArrayList<String>();
		
		for(int i=0;i<ledgerNameListCount;i++)
		{
			String data = ledgerNameList.get(i).getText();
			ledgerNameListArray.add(data);
		}
		
		String actledgerNameList = ledgerNameListArray.toString();
		String expledgerNameList = "[Bank, VAT ADVANCE SALE, VAT OUTPUT, Vendor A, Vendor B, Bank, Customer A, Bank, VAT ADVANCE PURCHASE, VAT INPUT, Vendor A, Vendor B, Bank, Customer B, Bank, VAT ADVANCE PURCHASE, VAT INPUT, Vendor A, Bank, Customer A, VAT INPUT, Bank, Customer B, VAT INPUT, Customer C, HDFC, Bank, Customer A, VAT INPUT, HDFC, VAT INPUT, Vendor B, BR COGS ACC INV, FIFO COGS ACC INV, PURCHASE VARIANCE, STD RATE COGS ACC INV, VAT INPUT, Vendor B, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, Customer Update, FIFO COGS ACC INV, Sales - Computers, STD RATE COGS ACC INV, VAT OUTPUT, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, Customer A, FIFO COGS ACC INV, Sales - Computers, STD RATE COGS ACC INV, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, Customer A, FIFO COGS ACC INV, Sales - Computers, STD RATE COGS ACC INV, WA COGS ACC INV, BR COGS ACC INV, COGS POSTING ACC, Customer A, FIFO COGS ACC INV, Sales - Computers, STD RATE COGS ACC INV, WA COGS ACC INV, Bank, Vendor B, Bank, Vendor B, Bank, Customer A, Vendor A, Bank, Customer A]";
		
		System.out.println("ledgerNameList  "+actledgerNameList);
		System.out.println("ledgerNameList  "+expledgerNameList);
		
		
		
		//ledgeDebitList
		
       int ledgeDebitListCount = ledgeDebitList.size();
		
		ArrayList<String> ledgeDebitListArray = new ArrayList<String>();
		
		for(int i=0;i<ledgeDebitListCount;i++)
		{
			String data = ledgeDebitList.get(i).getText();
			ledgeDebitListArray.add(data);
		}
		
		String actledgeDebitList = ledgeDebitListArray.toString();
		String expledgeDebitList = "[-100.00, -2.38, 0.00, 0.00, 0.00, -50.00, 0.00, 0.00, 0.00, -9.52, -100.00, -100.00, 0.00, -5.00, 0.00, 0.00, -4.76, -100.00, -5.24, 0.00, 0.00, -5.24, 0.00, 0.00, 0.00, -5.00, 0.00, -5.00, -0.24, 0.00, -0.24, -5.00, -900.00, -62.50, 0.00, -360.00, -94.00, 0.00, -900.00, 0.00, -761.71, -193.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, -391.55, -490.00, 0.00, 0.00, 0.00, 0.00, 0.00, -270.32, -520.00, 0.00, 0.00, 0.00, 0.00, 0.00, -40.75, -40.00, 0.00, 0.00, 0.00, 0.00, 0.00, -10.00, -10.00, 0.00, 0.00, -5.00, -50.00, 0.00, -5.00]";
		
		System.out.println("ledgeDebitList  "+actledgeDebitList);
		System.out.println("ledgeDebitList  "+expledgeDebitList);
		
		
		
		
		//ledgeCreditList
		
       int ledgeCreditListCount = ledgeCreditList.size();
		
		ArrayList<String> ledgeCreditListArray = new ArrayList<String>();
		
		for(int i=0;i<ledgeCreditListCount;i++)
		{
			String data = ledgeCreditList.get(i).getText();
			ledgeCreditListArray.add(data);
		}
		
		String actledgeCreditList = ledgeCreditListArray.toString();
		String expledgeCreditList = "[0.00, 0.00, 2.38, 50.00, 50.00, 0.00, 50.00, 200.00, 9.52, 0.00, 0.00, 0.00, 5.00, 0.00, 100.00, 4.76, 0.00, 0.00, 0.00, 5.00, 0.24, 0.00, 5.00, 0.24, 5.00, 0.00, 5.24, 0.00, 0.00, 5.24, 0.00, 0.00, 0.00, 0.00, 280.00, 0.00, 0.00, 2,036.50, 0.00, 50.00, 0.00, 0.00, 33.33, 185.50, 600.00, 7.50, 78.38, 42.00, 0.00, 0.00, 66.67, 490.00, 100.00, 182.88, 25.00, 0.00, 0.00, 6.94, 520.00, 160.00, 78.38, 1.75, 0.00, 0.00, 2.87, 40.00, 10.00, 26.13, 10.00, 0.00, 0.00, 10.00, 55.00, 0.00, 0.00, 5.00, 0.00]";
		
		System.out.println("ledgeCreditList  "+actledgeCreditList);
		System.out.println("ledgeCreditList  "+expledgeCreditList);
		
		
		

		//ledgeBalList
		
       int ledgeBalListCount = ledgeCreditList.size();
		
		ArrayList<String> ledgeBalListArray = new ArrayList<String>();
		
		for(int i=0;i<ledgeBalListCount;i++)
		{
			String data = ledgeBalList.get(i).getText();
			ledgeBalListArray.add(data);
		}
		
		String actledgeBalList = ledgeBalListArray.toString();
		String expledgeBalList = "[-100.00, -2.38, 2.38, 50.00, 50.00, -50.00, 50.00, 200.00, 9.52, -9.52, -100.00, -100.00, 5.00, -5.00, 100.00, 4.76, -4.76, -100.00, -5.24, 5.00, 0.24, -5.24, 5.00, 0.24, 5.00, -5.00, 5.24, -5.00, -0.24, 5.24, -0.24, -5.00, -900.00, -62.50, 280.00, -360.00, -94.00, 2,036.50, -900.00, 50.00, -761.71, -193.00, 33.33, 185.50, 600.00, 7.50, 78.38, 42.00, -391.55, -490.00, 66.67, 490.00, 100.00, 182.88, 25.00, -270.32, -520.00, 6.94, 520.00, 160.00, 78.38, 1.75, -40.75, -40.00, 2.87, 40.00, 10.00, 26.13, 10.00, -10.00, -10.00, 10.00, 55.00, -5.00, -50.00, 5.00, -5.00]";
		
		System.out.println("ledgeBalList  "+actledgeBalList);
		System.out.println("ledgeBalList  "+expledgeBalList);
		
		
		
		//GLTCurrency
		

		String actGLTCurrency=GLTCurrency.getText();
		String expGLTCurrency= "AED";
		
		System.out.println("GLTCurrency   : "+actGLTCurrency +" Value Expected  : "+expGLTCurrency);
		
		//TransCountTotal
		
		String actTransCountTotal=TransCountTotal.getText();
		String expTransCountTotal= "19.00";
		
		System.out.println("TransCountTotal   : "+actTransCountTotal +" Value Expected  : "+expTransCountTotal);
		
		//totalcredit
		
		String acttotalcredit=totalcredit.getText();
		String exptotalcredit= "5,601.45";
		
		System.out.println("totalcredit   : "+acttotalcredit +" Value Expected  : "+exptotalcredit);
		
		
		System.out.println("**************************************CheckVatAuditFileReport****************");
		
    	System.out.println("periodEndsTxt           : "+actperiodEndsTxt          +" Value Expected : "+expperiodEndsTxt);
    	System.out.println("FAFCrestionDateTxt      : "+actFAFCrestionDateTxt     +" Value Expected : "+expFAFCrestionDateTxt);
    	
    	System.out.println("actproductVersionTxt : "+actproductVersionTxt);
    	System.out.println("expproductVersionTxt : "+expproductVersionTxt);
    	
    	
    	System.out.println("actpurchaseSupplierName : "+actpurchaseSupplierName);
    	System.out.println("exppurchaseSupplierName : "+exppurchaseSupplierName);
    	
    	System.out.println("actpurchaseInvoiceNoList : "+actpurchaseInvoiceNoList);
    	System.out.println("exppurchaseInvoiceNoList : "+exppurchaseInvoiceNoList);
    	
    	System.out.println("actpurchaseProductDescList : "+actpurchaseProductDescList);
    	System.out.println("exppurchaseProductDescList : "+exppurchaseProductDescList);
    	
    	System.out.println("actpurchaseValueAED : "+actpurchaseValueAED);
    	System.out.println("exppurchaseValueAED : "+exppurchaseValueAED);
    	
    	System.out.println("actpurchaseVATVAlueAED : "+actpurchaseVATVAlueAED);
    	System.out.println("exppurchaseVATVAlueAED : "+exppurchaseVATVAlueAED);
    	
    	System.out.println("actpurchaseTAxcode : "+actpurchaseTAxcode);
    	System.out.println("exppurchaseTAxcode : "+exppurchaseTAxcode);
    	
    	System.out.println("actpurchaseTransCountTotal : "+actpurchaseTransCountTotal);
    	System.out.println("exppurchaseTransCountTotal : "+exppurchaseTransCountTotal);
    	
    	System.out.println("actpurchaseVatTotalAED : "+actpurchaseVatTotalAED);
    	System.out.println("exppurchaseVatTotalAED : "+exppurchaseVatTotalAED);
    	
    	System.out.println("actpurchaseTotalAED : "+actpurchaseTotalAED);
    	System.out.println("exppurchaseTotalAED : "+exppurchaseTotalAED);
    	
    	System.out.println("actCustomerNameList : "+actCustomerNameList);
    	System.out.println("expCustomerNameList : "+expCustomerNameList);
    	
    	System.out.println("actsalesInvoiceNoList : "+actsalesInvoiceNoList);
    	System.out.println("expsalesInvoiceNoList : "+expsalesInvoiceNoList);
    	
    	System.out.println("actsalesProductDescList : "+actsalesProductDescList);
    	System.out.println("expsalesProductDescList : "+expsalesProductDescList);
    	
    	System.out.println("actsalesSupplyValueAED : "+actsalesSupplyValueAED);
    	System.out.println("expsalesSupplyValueAED : "+expsalesSupplyValueAED);
    	
    	System.out.println("actsalesTaxcode : "+actsalesTaxcode);
    	System.out.println("expsalesTaxcode : "+expsalesTaxcode);
    	
    	System.out.println("actsalesTransCountTotal : "+actSalesTransCountTotal);
    	System.out.println("expsalesTransCountTotal : "+expSalesTransCountTotal);
    	
    	System.out.println("actsalesVatTotalAED : "+actsalesVatTotalAED);
    	System.out.println("expsalesVatTotalAED : "+expsalesVatTotalAED);
    	
    	System.out.println("actsalesTotalAED : "+actsalesTotalAED);
    	System.out.println("expsalesTotalAED : "+expsalesTotalAED);
    	
    	if (actpurchaseSupplierName.equalsIgnoreCase(exppurchaseSupplierName) && actperiodEndsTxt.equalsIgnoreCase(expperiodEndsTxt) && 
    			actFAFCrestionDateTxt.equalsIgnoreCase(expFAFCrestionDateTxt) && actproductVersionTxt.equalsIgnoreCase(expproductVersionTxt) && 
    			actpurchaseInvoiceNoList.equalsIgnoreCase(exppurchaseInvoiceNoList) && actpurchaseProductDescList.equalsIgnoreCase(exppurchaseProductDescList)
    			 && actpurchaseValueAED.equalsIgnoreCase(exppurchaseValueAED) && actpurchaseVATVAlueAED.equalsIgnoreCase(exppurchaseVATVAlueAED) &&
    			 actpurchaseTAxcode.equalsIgnoreCase(exppurchaseTAxcode) && actpurchaseTransCountTotal.equalsIgnoreCase(exppurchaseTransCountTotal) && 
    			 actpurchaseVatTotalAED.equalsIgnoreCase(exppurchaseVatTotalAED) && actpurchaseTotalAED.equalsIgnoreCase(exppurchaseTotalAED) && 
    			 
    			
    			actsalesInvoiceNoList.equalsIgnoreCase(expsalesInvoiceNoList) && actCustomerNameList.equalsIgnoreCase(expCustomerNameList) && 
    			actsalesProductDescList.equalsIgnoreCase(expsalesProductDescList) &&  actsalesTaxcode.equalsIgnoreCase(expsalesTaxcode) &&
    			actSalesTransCountTotal.equalsIgnoreCase(expSalesTransCountTotal) &&  actsalesVatTotalAED.equalsIgnoreCase(expsalesVatTotalAED) && 
    			actsalesTotalAED.equalsIgnoreCase(expsalesTotalAED) && 
    			
    			
    			actledgerAccountIDList.equalsIgnoreCase(expledgerAccountIDList) && actledgerAccountNameList.equalsIgnoreCase(expledgerAccountNameList) && 
    			actledgerTransDescList.equalsIgnoreCase(expledgerTransDescList) && actledgerNameList.equalsIgnoreCase(expledgerNameList) && 
    			actledgeDebitList.equalsIgnoreCase(expledgeDebitList) && actledgeCreditList.equalsIgnoreCase(expledgeCreditList) && 
    			
    			
    			actGLTCurrency.equalsIgnoreCase(expGLTCurrency) && actTransCountTotal.equalsIgnoreCase(expTransCountTotal) && 
    			acttotalcredit.equalsIgnoreCase(exptotalcredit))
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_ExitBtn));
			vat_ExitBtn.click();
			return true;
		}
    	else 
    	{
    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_ExitBtn));
			vat_ExitBtn.click();
            return false;
		}
	}
		

	@FindBy(xpath="//div[contains(text(),'Exit')]")
	private static WebElement vat_ExitBtn;

	@FindBy(xpath="//*[@id='VATMonthlyReturnRepKSABody']//tr/td")
	private static List<WebElement>  vatMonthlyreturnReportList; 
	
	
	public boolean checkVatReturnReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatReportMenu));
		vatReportMenu.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatReturnReport));
		vatReturnReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_DateOptionDropdown));
		vat_DateOptionDropdown.click();
		Select s=new Select(vat_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_OkBtn));
		vat_OkBtn.click();
		
        boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
		Thread.sleep(2000);
		
		//vatMonthlyreturnReportList
		
       int vatMonthlyreturnReportListCount = vatMonthlyreturnReportList.size();
		
		ArrayList<String> vatMonthlyreturnReportListArray = new ArrayList<String>();
		
		for(int i=0;i<vatMonthlyreturnReportListCount;i++)
		{
			String data = vatMonthlyreturnReportList.get(i).getText();
			vatMonthlyreturnReportListArray.add(data);
		}
		
		String actvatMonthlyreturnReportList = vatMonthlyreturnReportListArray.toString();
		
		String expvatMonthlyreturnReportList = "[1, Standard rated sales (15%), 292.86, 0.00, 14.64, 1.1, Sales subject to VAT (5%), , , , 2, Sales to customers in VAT implementing GCC countries, , , , 3, Zero rated domestic sales, 160.00, 0.00, 0.00, 4, Exports, , , , 5, Exempt sales, , , , 6, Total sales, 452.86, 0.00, 14.64, 7, Standard rated domestic purchases (15%), 2,071.72, 0.00, 108.28, 7.1, Standard rated domestic purchases (5%), , , , 8, Import subject to VAT paid at customs (15%), , , , 8.1, Import subject to VAT paid at customs (5%), , , , 9, Import subject to VAT accounted for through reverse change machenism (15%), , , , 9.1, Import subject to VAT accounted for through reverse change machenism (5%), , , , 10, Zero rated purchases, , , , 11, Exempt purchases, , , , 12, Total purchases, 2,071.72, 0.00, 108.28, 13, Total VAT due for current period, -93.64, 14, Correction from previous period (Between SAR +/- 5,000), , 15, VAT credit carried forward from previous period(s), , , Net VAT due (or claim), N]";
		
		System.out.println("vatMonthlyreturnReportList  "+actvatMonthlyreturnReportList);
		System.out.println("vatMonthlyreturnReportList  "+expvatMonthlyreturnReportList);
	
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) &&
				actvatMonthlyreturnReportList.equalsIgnoreCase(expvatMonthlyreturnReportList))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_BackBtn));
			vat_BackBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_CloseBtn));
			vat_CloseBtn.click();
			return true;
		}
		else 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_BackBtn));
		    vat_BackBtn.click();
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vat_CloseBtn));
			vat_CloseBtn.click();
			return false;
		}
	}

	@FindBy(xpath="//div[contains(text(),'Back')]")
	private static WebElement vat_BackBtn;
	
	

	public boolean checkSalesAdvanceVatReportOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatReportMenu));
		vatReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAdvanceVatReport));
		salesAdvanceVatReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filteRITEMExpandBtn));
		filteRITEMExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterItemNameChkbox));
		if (filterItemNameChkbox.isSelected()==false)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterItemNameChkbox));
			filterItemNameChkbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterVATSalesDefaultItemTxt));
		enterVATSalesDefaultItemTxt.click();
		enterVATSalesDefaultItemTxt.sendKeys("BR COGS ITEM");
		Thread.sleep(2000);
		
		enterVATSalesDefaultItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();

        Thread.sleep(2000);
		
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT48:SU/AME/TEXT1, DateField, 210.00, , 210.00, , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT48:SU/AME/TEXT1, DateField, 315.00, , 315.00, , , ]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT48:SU/AME/TEXT1, DateField, 420.00, , 420.00, , , ]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT50:1, DateField, 63.00, , 63.00, , , ]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT50:4, DateField, 240.00, , 240.00, , , ]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT50:5, DateField, 300.00, , 300.00, , , ]";
		
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=1;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[SalRet:2, DateField, , , 220.00, , , ]";
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=1;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[NDT50:7, DateField, 10.00, , 10.00, , , ]";
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=1;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[PurRet:2, DateField, , , 300.00, , , ]";
		
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=1;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[Grand Total, , 332.00, , 252.00, , , ]";
		
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
				
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
	}

	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[8]/ul/li/a/span")
	private static List<WebElement> registerList;
	
	public boolean checkOpeningBalanceRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalanceRegisterReport));
		openingBalanceRegisterReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[OpeBal : 1, Cash, , 400.00, , 400.00, , 44.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[OpeBal : 1, Customer B, , 400.00, , 400.00, , 44.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[OpeBal : 1, BR COGS ACC INV, 100.00, , 100.00, , 11.00, ]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[OpeBal : 1, FIFO COGS ACC INV, 100.00, , 100.00, , 11.00, ]";
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[OpeBal : 1, WA COGS ACC INV, 100.00, , 100.00, , 11.00, ]";
		
		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[OpeBal : 1, STD RATE COGS ACC INV, 100.00, , 100.00, , 11.00, ]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[, , 400.00, 800.00, 400.00, 800.00, 44.00, 88.00]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
		
		
	
	public boolean checkJournalEntriesRegisterOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(journalEntriesRegisterReport));
		journalEntriesRegisterReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
        boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	

		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT55 : 1, Vendor A, , 50.00, , 50.00, , 3.50]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT55 : 1, Customer A, , 5.00, , 5.00, , 0.35]";
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT55 : 2, Customer A, , 5.00, , 5.00, , 0.35]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[Grand Total, , , , 60.00, , 60.00, , 4.20]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
		

	public boolean checkCreditNoteRegisterOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditNoteRegisterReport));
		creditNoteRegisterReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
        boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT52 : 1, Bank, 10.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Grand Total, , , 10.00]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	public boolean checkDebitNoteRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNoteRegisterReport));
		debitNoteRegisterReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
        boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT51 : 1, Bank, 10.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Grand Total, , , 10.00]";
		
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	

	public boolean checkReceiptRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsRegisterReport));
		receiptsRegisterReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
        boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT44 : 1, Vendor A, 50.00, , 50.00, , 3.50, ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT44 : 1, Vendor B, 50.00, , 50.00, , 3.50, ]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT44 : 1, VAT OUTPUT, 2.38, , 2.38, , 0.17, ]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT44 : 2, Customer A, 50.00, , 50.00, , 3.50, ]";
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[Rct : 2, Customer A, 10.00, , 10.00, , 10.00, ]";
		
		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[Rct : 4, HDFC, 5.00, , 5.00, , 5.00, ]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[, , 167.38, , 167.38, , 25.67, ]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	
	
	public boolean checkPaymentRegisterOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentRegisterReport));
		paymentRegisterReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT45 : 1, Vendor B, , 100.00, , 100.00, , 7.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT45 : 1, Vendor A, , 100.00, , 100.00, , 7.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT45 : 1, VAT INPUT, , 4.76, , 4.76, , 0.33]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT45 : 1, VAT INPUT, , 4.76, , 4.76, , 0.33]";
		
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT45 : 3, Customer B, , 5.00, , 5.00, , 0.35]";
		
		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT45 : 4, Vendor A, , 100.00, , 100.00, , 7.00]";
		
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT45 : 4, VAT INPUT, , 4.76, , 4.76, , 0.33]";
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=2;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[Pmt : 2, Customer B, , 5.00, , 5.00, , 5.00]";
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=2;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[Pmt : 3, HDFC, , 5.00, , 5.00, , 5.00]";
		
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=1;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[Grand Total, , , , 329.28, , 329.28, , 32.35]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
		
	}
	
	@FindBy(xpath="//select[@id='RITCombobox__3']")
	private static WebElement considerDatesBasedOnDropDown;
	
	public boolean checkPdcReceiptsRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcReceiptsRegisterReport));
		pdcReceiptsRegisterReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(brsIncludePdcChkBox));
		brsIncludePdcChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			if (i==6)
			{
			   data="date Field";	
			}
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT46 : 1, Bank, Customer A, 5.00, date Field]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			
			if (i==6)
			{
			   data="date Field";	
			}
			
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT46 : 2, Bank, Customer A, 10.00, date Field]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			if (i==6)
			{
			   data="date Field";	
			}
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT46 : 3, Bank, Customer B, 5.00, date Field]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			if (i==6)
			{
			   data="date Field";	
			}
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT46 : 3, Bank, VAT INPUT, 0.24, date Field]";
		
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			if (i==6)
			{
			   data="date Field";	
			}
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT46 : 1, Bank, VAT INPUT, 0.24, date Field]";
		
		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			if (i==6)
			{
			   data="date Field";	
			}
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT46 : 4, HDFC, Customer C, 5.00, date Field]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			if (i==6)
			{
			   data="date Field";	
			}
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT46 : 2, Bank, VAT INPUT, 0.48, date Field]";
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=2;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[, , , 25.96, ]";
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
		
	}
		
		

	public boolean checkPdcPaymentsRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcPaymentsRegisterReport));
		pdcPaymentsRegisterReport.click();
		
		//Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(brsIncludePdcChkBox));
		brsIncludePdcChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
        int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			if (i==6)
			{
			   data="date Field";	
			}
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT47 : 2, Bank, Customer B, 5.00, date Field]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			
			if (i==6)
			{
			   data="date Field";	
			}
			
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT47 : 3, HDFC, VAT INPUT, 0.24, date Field]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			if (i==6)
			{
			   data="date Field";	
			}
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT47 : 1, Bank, Customer A, 5.00, date Field]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			if (i==6)
			{
			   data="date Field";	
			}
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT47 : 3, HDFC, Vendor B, 5.00, date Field]";
		
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			if (i==6)
			{
			   data="date Field";	
			}
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT47 : 1, Bank, VAT INPUT, 0.24, date Field]";
		
		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[Grand Total, , , , 15.48, ]";
		
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}

	
	
	
	
	
	public boolean checkEntryJournalRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(entryJournalRegisterReport));
		entryJournalRegisterReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filteRITEMExpandBtn));
		filteRITEMExpandBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterItemNameChkbox));
		if (filterItemNameChkbox.isSelected()==false)
		{
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterItemNameChkbox));
			filterItemNameChkbox.click();
			
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterJEDefaultItemTxt));
		enterJEDefaultItemTxt.click();
		enterJEDefaultItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		enterJEDefaultItemTxt.sendKeys(Keys.SPACE);
		enterJEDefaultItemTxt.sendKeys("WA COGS ITEM");
		
		Thread.sleep(2000);
		
		enterJEDefaultItemTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();

		Thread.sleep(2000);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT50 : 1, Customer Update, 31.50, , 31.50, CUpdate, 31.50, , 31.50, 2.21, , 2.21]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT50 : 1, Sales - Computers, , 30.00, 1.50, 071-001, , 30.00, 1.50, , 2.10, 0.11]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT50 : 4, Customer A, 70.00, , 71.50, 122-001, 70.00, , 71.50, 4.90, , 5.01]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[NDT50 : 4, Sales - Computers, , 70.00, 1.50, 071-001, , 70.00, 1.50, , 4.90, 0.11]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT50 : 5, Customer A, 30.00, , 31.50, 122-001, 30.00, , 31.50, 2.10, , 2.21]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=2;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT50 : 5, Sales - Computers, , 30.00, 1.50, 071-001, , 30.00, 1.50, , 2.10, 0.11]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=2;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT50 : 7, Sales - Computers, , 10.00, 8.50, 071-001, , 10.00, 8.50, , 0.70, 0.60]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=2;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[NDT50 : 7, Customer A, 10.00, , 1.50, 122-001, 10.00, , 1.50, 0.70, , 0.11]";
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=2;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[PurRet : 2, Vendor A, 300.00, , 301.50, 033-001, 300.00, , 301.50, 21.00, , 21.11]";
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=2;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[PurRet : 2, WA COGS ACC INV, , 261.20, 40.30, WA COGS ACC INV, , 261.20, 40.30, , 18.28, 2.82]";
		
		
		int report11thRowListCount = report11thRowList.size();
		ArrayList<String> report11thRowListArray = new ArrayList<String>();
		for(int i=2;i<report11thRowListCount;i++)
		{
			String data = report11thRowList.get(i).getText();
			report11thRowListArray.add(data);
		}
		String actRow11List = report11thRowListArray.toString();
		String expRow11List = "[NDT48 : SU/AME/TEXT1, WA COGS ACC INV, 400.00, , 440.30, WA COGS ACC INV, 400.00, , 440.30, 28.00, , 30.82]";
		
		int report12thRowListCount = report12thRowList.size();
		ArrayList<String> report12thRowListArray = new ArrayList<String>();
		for(int i=2;i<report12thRowListCount;i++)
		{
			String data = report12thRowList.get(i).getText();
			report12thRowListArray.add(data);
		}
		String actRow12List = report12thRowListArray.toString();
		String expRow12List = "[NDT48 : SU/AME/TEXT1, Vendor B, , 210.00, 230.30, 033-002, , 210.00, 230.30, , 14.70, 16.12]";
		
		int report13thRowListCount = report13thRowList.size();
		ArrayList<String> report13thRowListArray = new ArrayList<String>();
		for(int i=2;i<report13thRowListCount;i++)
		{
			String data = report13thRowList.get(i).getText();
			report13thRowListArray.add(data);
		}
		String actRow13List = report13thRowListArray.toString();
		String expRow13List = "[NDT48 : SU/AME/TEXT1, Vendor B, , 315.00, 84.70, 033-002, , 315.00, 84.70, , 22.05, 5.93]";
		
		int report14thRowListCount = report14thRowList.size();
		ArrayList<String> report14thRowListArray = new ArrayList<String>();
		for(int i=2;i<report14thRowListCount;i++)
		{
			String data = report14thRowList.get(i).getText();
			report14thRowListArray.add(data);
		}
		String actRow14List = report14thRowListArray.toString();
		String expRow14List = "[NDT48 : SU/AME/TEXT1, Vendor B, , 420.00, 504.70, 033-002, , 420.00, 504.70, , 29.40, 35.33]";
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_NextBtn));
		report_NextBtn.click();
		Thread.sleep(2500);
		
		int reportsP2Row1ListCount = report1stRowList.size();
		ArrayList<String> reportsP2Row1ListArray = new ArrayList<String>();
		for(int i=2;i<reportsP2Row1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsP2Row1ListArray.add(data);
		}
		String actP2Row1List = reportsP2Row1ListArray.toString();
		String expP2Row1List = "[NDT48 : SU/AME/TEXT1, WA COGS ACC INV, 300.00, , 204.70, WA COGS ACC INV, 300.00, , 204.70, 21.00, , 14.33]";
		
		
		int report2ndP2RowListCount = report2ndRowList.size();
		ArrayList<String> report2ndP2RowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndP2RowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndP2RowListArray.add(data);
		}
		String actP2Row2List = report2ndP2RowListArray.toString();
		String expP2Row2List = "[NDT48 : SU/AME/TEXT1, WA COGS ACC INV, 200.00, , 4.70, WA COGS ACC INV, 200.00, , 4.70, 14.00, , 0.33]";
		
		int report3rdP2RowListCount = report3rdRowList.size();
		ArrayList<String> report3rdP2RowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdP2RowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdP2RowListArray.add(data);
		}
		String actP2Row3List = report3rdP2RowListArray.toString();
		String expP2Row3List = "[, , 1,341.50, 1,346.20, 345.60, , 1,341.50, 1,346.20, 345.60, 93.91, 94.23, 24.19]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow11List  : "+actRow11List);
		System.out.println("expRow11List  : "+expRow11List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow12List  : "+actRow12List);
		System.out.println("expRow12List  : "+expRow12List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow13List  : "+actRow13List);
		System.out.println("expRow13List  : "+expRow13List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow14List  : "+actRow14List);
		System.out.println("expRow14List  : "+expRow14List);
		System.out.println("*********************************************************************");
		
		System.out.println("actP2Row1List  : "+actP2Row1List);
		System.out.println("expP2Row1List  : "+expP2Row1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actP2Row2List  : "+actP2Row2List);
		System.out.println("expP2Row2List  : "+expP2Row2List);
		System.out.println("*********************************************************************");
		
		System.out.println("actP2Row3List  : "+actP2Row3List);
		System.out.println("expP2Row3List  : "+expP2Row3List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) && 
				actRow10List.equalsIgnoreCase(expRow10List) &&
				actRow11List.equalsIgnoreCase(expRow11List) &&
				actRow12List.equalsIgnoreCase(expRow12List) &&
				actRow13List.equalsIgnoreCase(expRow13List) &&
				actRow14List.equalsIgnoreCase(expRow14List) &&
				actP2Row1List.equalsIgnoreCase(expP2Row1List) &&
				actP2Row2List.equalsIgnoreCase(expP2Row2List) &&
				actP2Row3List.equalsIgnoreCase(expP2Row3List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}


	public boolean checkEntryJournalDetailReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
		registersReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(entryJournalDetailReport));
		entryJournalDetailReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
		filterAccountExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		if (filterAccNameChkbox.isSelected()==false)
		{
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
			filterAccNameChkbox.click();
			
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterJEDefaultAccTxt));
		enterJEDefaultAccTxt.click();
		enterJEDefaultAccTxt.sendKeys("vendor a");
		
		Thread.sleep(2000);
		
		enterJEDefaultAccTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();
	
		Thread.sleep(2000);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			if(i==2)
			{
				data= "Date Field";
			}
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT45 : 1, Date Field, Vendor A, , 100.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			if(i==2)
			{
				data= "Date Field";
			}
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT45 : 4, Date Field, Vendor A, , 100.00]";
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			if(i==2)
			{
				data= "Date Field";
			}
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[PurRet : 2, Date Field, Vendor A, , 300.00]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			if(i==2)
			{
				data= "Date Field";
			}
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[PurRet : 2, Date Field, Vendor A, , 22.50]";
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			if(i==2)
			{
				data= "Date Field";
			}
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[PurRet : 2, Date Field, Vendor A, , 300.00]";
		
		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			if(i==2)
			{
				data= "Date Field";
			}
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[PurRet : 2, Date Field, Vendor A, , 20.00]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=1;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			if(i==2)
			{
				data= "Date Field";
			}
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT44 : 1, Date Field, , Vendor A, 50.00]";
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=1;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			if(i==2)
			{
				data= "Date Field";
			}
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[NDT55 : 1, Date Field, Vendor A, , 50.00]";
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=1;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[Grand Total, , , , 842.50]";
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
				
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
		
		
		
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[9]/ul/li/a/span")
	private static List<WebElement> salesAndPurchasesAnalysisReportList;
	
	public boolean checksalesGroupedByCustomerReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesGroupedByCustomerReport));
		salesGroupedByCustomerReport.click();
		
		//Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("Sales - Computers"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includePurchaseReturnChkbox));
		includePurchaseReturnChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Customer A, BR COGS ITEM, 45.00, 450.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Customer A, FIFO COGS ITEM, 8.00, 80.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Customer A, STD RATE COGS ITEM, 23.00, 230.00]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[Customer A, WA COGS ITEM, 7.00, 70.00]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[, , 83.00, 830.00]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[Customer Update, BR COGS ITEM, 60.00, 60.00]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=1;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[Customer Update, FIFO COGS ITEM, 4.00, 40.00]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=1;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[Customer Update, STD RATE COGS ITEM, 60.00, 60.00]";
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=1;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[Customer Update, WA COGS ITEM, 3.00, 30.00]";
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=1;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[, , 127.00, 190.00]";
		
		
		int report11thRowListCount = report11thRowList.size();
		ArrayList<String> report11thRowListArray = new ArrayList<String>();
		for(int i=1;i<report11thRowListCount;i++)
		{
			String data = report11thRowList.get(i).getText();
			report11thRowListArray.add(data);
		}
		String actRow11List = report11thRowListArray.toString();
		String expRow11List = "[Grand Total, , 210.00, 1,020.00]";
		
		
		

		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow11List  : "+actRow11List);
		System.out.println("expRow11List  : "+expRow11List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) &&
				actRow11List.equalsIgnoreCase(expRow11List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}

		
	
	
	public boolean checkSalesGroupedByProductReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesGroupedByProductReport));
		salesGroupedByProductReport.click();
		
		//Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("Sales - Computers"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includePurchaseReturnChkbox));
		includePurchaseReturnChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
        
        int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BR COGS ITEM, Customer A, 45.00, 450.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[BR COGS ITEM, Customer Update, 60.00, 60.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[, , 105.00, 510.00]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[FIFO COGS ITEM, Customer A, 8.00, 80.00]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[FIFO COGS ITEM, Customer Update, 4.00, 40.00]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[, , 12.00, 120.00]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=1;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[STD RATE COGS ITEM, Customer A, 23.00, 230.00]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=1;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[STD RATE COGS ITEM, Customer Update, 60.00, 60.00]";
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=1;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[, , 83.00, 290.00]";
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=1;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[WA COGS ITEM, Customer A, 7.00, 70.00]";
		
		
		int report11thRowListCount = report11thRowList.size();
		ArrayList<String> report11thRowListArray = new ArrayList<String>();
		for(int i=1;i<report11thRowListCount;i++)
		{
			String data = report11thRowList.get(i).getText();
			report11thRowListArray.add(data);
		}
		String actRow11List = report11thRowListArray.toString();
		String expRow11List = "[WA COGS ITEM, Customer Update, 3.00, 30.00]";
		
		int report12thRowListCount = report12thRowList.size();
		ArrayList<String> report12thRowListArray = new ArrayList<String>();
		for(int i=1;i<report12thRowListCount;i++)
		{
			String data = report12thRowList.get(i).getText();
			report12thRowListArray.add(data);
		}
		String actRow12List = report12thRowListArray.toString();
		String expRow12List = "[, , 10.00, 100.00]";
		
		int report13thRowListCount = report13thRowList.size();
		ArrayList<String> report13thRowListArray = new ArrayList<String>();
		for(int i=1;i<report13thRowListCount;i++)
		{
			String data = report13thRowList.get(i).getText();
			report13thRowListArray.add(data);
		}
		String actRow13List = report13thRowListArray.toString();
		String expRow13List = "[Grand Total, , 210.00, 1,020.00]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow11List  : "+actRow11List);
		System.out.println("expRow11List  : "+expRow11List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow12List  : "+actRow12List);
		System.out.println("expRow12List  : "+expRow12List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow13List  : "+actRow13List);
		System.out.println("expRow13List  : "+expRow13List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) &&
				actRow11List.equalsIgnoreCase(expRow11List) &&
				actRow12List.equalsIgnoreCase(expRow12List) &&
				actRow13List.equalsIgnoreCase(expRow13List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}

	
	public boolean checkSalesGroupedByDepartmentReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesGroupedByDepartmentReport));
		salesGroupedByDepartmentReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("Sales - Computers"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includePurchaseReturnChkbox));
		includePurchaseReturnChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
        int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[DUBAI, WA COGS ITEM, 10.00, 100.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[DUBAI, FIFO COGS ITEM, 12.00, 120.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[DUBAI, STD RATE COGS ITEM, 83.00, 290.00]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[DUBAI, BR COGS ITEM, 105.00, 510.00]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[, , 210.00, 1,020.00]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[Grand Total, , 210.00, 1,020.00]";
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		if(actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}

	
	
	public boolean checkPurchasesGroupedByVendorOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesGroupedByVendorReport));
		purchasesGroupedByVendorReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ACC INV"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includePurchaseReturnChkbox));
		includePurchaseReturnChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
        int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Vendor A, BR COGS ITEM, 10.00, 300.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[, , 10.00, 300.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Vendor B, BR COGS ITEM, 30.00, 900.00]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[, , 30.00, 900.00]";
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[Grand Total, , 20.00, 600.00]";

		

		System.out.println("*********************************************************************");
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);		
		System.out.println("*********************************************************************");
		
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}


	
	@FindBy(xpath="//input[@id='txtUsername']")
	private static WebElement userName;
	
	
	
	// Purchases Grouped by Product
	
	
	public boolean checkPurchasesGroupedByProductReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesGroupedByProductReport));
		purchasesGroupedByProductReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ACC INV"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includePurchaseReturnChkbox));
		includePurchaseReturnChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
        int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BR COGS ITEM, Vendor A, 10.00, 300.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[BR COGS ITEM, Vendor B, 30.00, 900.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[, , 20.00, 600.00]";
		

		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[Grand Total, , 20.00, 600.00]";
		
		System.out.println("*********************************************************************");
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);		
		System.out.println("*********************************************************************");
		
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}



	public boolean checkPurchasesGroupedByDepartmentReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
		salesAndPurchasesReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesGroupedByDepartmentReport));
		purchasesGroupedByDepartmentReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportaccountTxt));
		reportaccountTxt.click();
		reportaccountTxt.sendKeys(Keys.SPACE);
		
		int reportaccountTxtListCount = reportaccountTxtList.size();
		
		for(int i=0;i<reportaccountTxtListCount;i++)
		{
			String data = reportaccountTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("BR COGS ACC INV"))
			{
				reportaccountTxtList.get(i).click();
			}
		}
		
		reportaccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includePurchaseReturnChkbox));
		includePurchaseReturnChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		

		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);

		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
        int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[AMERICA, BR COGS ITEM, 30.00, 900.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[, , 30.00, 900.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[DUBAI, BR COGS ITEM, 10.00, 300.00]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[, , 10.00, 300.00]";
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[Grand Total, , 20.00, 600.00]";

		

		System.out.println("*********************************************************************");
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);		
		System.out.println("*********************************************************************");
		
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
	}

	
	public boolean checkCustomisationOptionINPurchasesGroupedByDepartmentReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
		report_ReportCustomizeBtn.click();
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusDefaultExpansionBtn));
		cusDefaultExpansionBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(particularBtn));
		getAction().doubleClick(particularBtn).build().perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
		cusSaveBtn.click();
		
		String expMessage = "Data saved successfully";
	    
	    String actMessage = checkValidationMessage(expMessage);
		
	    
        Thread.sleep(2000);
	    
	    int reportsHeaderListCount1 = reportsHeaderList.size();
		ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
		for(int i=0;i<reportsHeaderListCount1;i++)
		{
			String data = reportsHeaderList.get(i).getText();
			reportsHeaderListArray1.add(data);
		}
		String actHeaderList1 = reportsHeaderListArray1.toString();
		String expHeaderList1 = "[, Particulars, Item, Quantity, Value, Particulars]";
	    
	    System.out.println(" Header List Actual    : "+actHeaderList1);
	    System.out.println("  Header List expected : "+expHeaderList1);
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
		report_ReportCustomizeBtn.click();
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
		cuDeleteLayoutBtn.click();
		
		getWaitForAlert();
		getAlert().accept();
		
		String expDeleteMessage = "Layout Deleted Successfully";
	    
	    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
	    
	    Thread.sleep(2000);
	    
	    int reportsHeaderListCount = reportsHeaderList.size();
		ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
		for(int i=0;i<reportsHeaderListCount;i++)
		{
			String data = reportsHeaderList.get(i).getText();
			reportsHeaderListArray.add(data);
		}
		String actHeaderList = reportsHeaderListArray.toString();
		String expHeaderList = "[, Particulars, Item, Quantity, Value]";
	    
	    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
	    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
		
		
		if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
				actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
		
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[10]/ul/li/a/span")
	private static List<WebElement> miscellaneousAnalysisReportList;
	
	public boolean checkMiscellaneousAnalysispeakAndLowBalancesReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(peakAndLowBalancesReport));
		peakAndLowBalancesReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(yearWiseComparsionChkbox));
		yearWiseComparsionChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
		filterAccountExpandBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		if (filterAccNameChkbox.isSelected()==false)
		{
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
			filterAccNameChkbox.click();
			
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterEnterPeakAndLowTxt));
		filterEnterPeakAndLowTxt.click();
		filterEnterPeakAndLowTxt.sendKeys("vendor b");
		
		Thread.sleep(2000);
		
		filterEnterPeakAndLowTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
        int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			if (i==2) 
			{
				data="dateFiled";
			}
			if (i==4) 
			{
				data="dateFiled";
			}
			if (i==6) 
			{
				data="dateFiled";
			}
			if (i==8) 
			{
				data="dateFiled";
			}
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Bank, dateFiled, , dateFiled, 50.00, dateFiled, , dateFiled, 100.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			if (i==2) 
			{
				data="dateFiled";
			}
			if (i==4) 
			{
				data="dateFiled";
			}
			if (i==6) 
			{
				data="dateFiled";
			}
			if (i==8) 
			{
				data="dateFiled";
			}
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[HDFC, dateFiled, , dateFiled, , dateFiled, 5.00, dateFiled, 5.00]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			if (i==2) 
			{
				data="dateFiled";
			}
			if (i==4) 
			{
				data="dateFiled";
			}
			if (i==6) 
			{
				data="dateFiled";
			}
			if (i==8) 
			{
				data="dateFiled";
			}
			
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Vendor B, dateFiled, , dateFiled, 10.00, dateFiled, , dateFiled, 400.00]";
		

		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[Grand Total, , , , 60.00, , 5.00, , 505.00]";
		
		
		System.out.println("*********************************************************************");
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);		
		System.out.println("*********************************************************************");
		
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
	}

		

	public boolean checkComprativeAnalysisOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		/*
		
		
		Thread.sleep(2000);*/
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(comprativeAnalysisReport));
		comprativeAnalysisReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		

        int rowcount=stockLedgerHometableRowCount.size();
		
		System.out.println(rowcount);
		
		for (int i = 1; i <= rowcount; i++) 
		{
			WebElement name=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[12]"));
			
			String actname=name.getText();
			
			System.out.println(actname);
			
			if(actname.equalsIgnoreCase("HDFC") )
			{
				//Thread.sleep(2000);
				WebElement index=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[8]/div/label/input"));
				index.click();
				
				break;
			}

		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(yearWiseComparsionChkbox));
		yearWiseComparsionChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsHeaderListCount = reportsHeaderList.size();
		ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
		for(int i=1;i<reportsHeaderListCount;i++)
		{
			String data = reportsHeaderList.get(i).getText();
			if (i==3) 
			{
				data="CurrentYear";	
			}
			reportsHeaderListArray.add(data);
		}
		String actHeaderList = reportsHeaderListArray.toString();
		String expHeaderList = "[Particulars, Total, CurrentYear, January, February, March, April, May, June, July, August, September, October, November, December]";
	    
	    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
	    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
		
	    Thread.sleep(2000);
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[HDFC, 0.24, , , , , , , , , , , , 0.24]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Grand Total, 0.24, , , , , , , , , , , , 0.24]";

	    
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		
	    if(actHeaderList.equalsIgnoreCase(expHeaderList) && actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				 && actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
	}
		

	public boolean checkTransactionsTypeAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsTypeAnalysisReport));
		transactionsTypeAnalysisReport.click();
		
		//Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		

        int rowcount=stockLedgerHometableRowCount.size();
		
		System.out.println(rowcount);
		
		for (int i = 1; i <= rowcount; i++) 
		{
			WebElement name=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[12]"));
			
			String actname=name.getText();
			
			System.out.println(actname);
			
			if(actname.equalsIgnoreCase("HDFC") )
			{
				//Thread.sleep(2000);
				WebElement index=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[8]/div/label/input"));
				index.click();
				
				break;
			}

		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(2000);
		
		int reportsHeaderListCount = reportsHeaderList.size();
		ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
		for(int i=0;i<reportsHeaderListCount;i++)
		{
			String data = reportsHeaderList.get(i).getText();
			reportsHeaderListArray.add(data);
		}
		String actHeaderList = reportsHeaderListArray.toString();
		String expHeaderList = "[, Particulars, Total Amount, Opening Balances, Opening Balances New, Purchases Vouchers, Purchase Voucher VAT, Stock revaluation, Stock adjustment, Sales Returns, Sales Invoices, Cash Sales, POS Sales, Sales invoice N, Sales invoice VAT, Non-Standard Journal Entries, Inter-Departmental JV, Debit Notes (Linewise), Credit Notes (Linewise)/Payroll, Fixed Asset Depreciation Voucher, Debit Notes, Debit Notes VAT, Credit Notes, Payroll Postings, Credit Notes VAT, Receipts, Receipts VAT, Payments, Payments VAT, Petty-Cash Expenses Group, Post-Dated Receipts, PDR VAT, Purchases Returns, Post-Dated Payments, PDP VAT, Forex JV, Journal Entries, JV VAT View]";
	    
	    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
	    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
		
	    
	    Thread.sleep(2000);
	    
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[HDFC, 0.24, , , , , , , , , , , , , , , , , , , , , , , 5.00, , 5.00, , , , 5.00, , , 5.24, , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Grand Total, 0.24, , , , , , , , , , , , , , , , , , , , , , , 5.00, , 5.00, , , , 5.00, , , 5.24, , , ]";

	    
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		
	    if(actHeaderList.equalsIgnoreCase(expHeaderList) && actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List)
				 && actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}

			
	
	
	public boolean checkAbcAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(abcAnalysisReport));
		abcAnalysisReport.click();
		
		//Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
				
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[COGS POSTING ACC, 1,543.90, 30.99]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Vendor A, 842.50, 16.91]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Customer A, 780.00, 15.66]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[WA COGS ACC INV, 635.05, 12.75]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[BR COGS ACC INV, 578.75, 11.62]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[SHORTAGE COGS POSTING ACC, 236.98, 4.76]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=1;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[Customer Update, 193.00, 3.87]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=1;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[VAT INPUT, 108.28, 2.17]";
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=1;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[FIFO COGS ACC INV, 60.54, 1.22]";
		
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=1;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[VAT ADVANCE SALE, 2.38, 0.05]";
		
		int report11thRowListCount = report11thRowList.size();
		ArrayList<String> report11thRowListArray = new ArrayList<String>();
		for(int i=1;i<report10thRowListCount;i++)
		{
			String data = report11thRowList.get(i).getText();
			report11thRowListArray.add(data);
		}
		String actRow11List = report11thRowListArray.toString();
		String expRow11List = "[Grand Total, 4,981.38, 100.00]";
		
		
		System.out.println("*********************************************************************");
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow11List  : "+actRow11List);
		System.out.println("expRow11List  : "+expRow11List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) && 
				actRow9List.equalsIgnoreCase(expRow9List) && 
				actRow10List.equalsIgnoreCase(expRow10List) && 
				actRow11List.equalsIgnoreCase(expRow11List) && 
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			return true;
		}
		else
		{
			
			return false;
		}
	}

	@FindBy(xpath="//span[@id='reportSort_']")
	private static WebElement reportSortingBtn;	
	
		
	@FindBy(xpath="//*[@id='reportRenderControls']/ul/li/ul/li[1]")
	private static WebElement sortingAscendingBtn;	
	
	@FindBy(xpath="//*[@id='reportRenderControls']/ul/li/ul/li[2]")
	private static WebElement sortingDecendingBtn;	
		
	
	public boolean checkSortingOptionInAbcAnalysisReport() throws InterruptedException
	{
		
		Thread.sleep(2000);
		int reportsHeaderListCount=reportsHeaderList.size();
		
		for (int i = 0; i < reportsHeaderListCount; i++) 
		{
		
			String data=reportsHeaderList.get(i).getText();
			if (data.equalsIgnoreCase("balance"))
			{
				reportsHeaderList.get(i).click();
				
			}
		}
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportSortingBtn));
		reportSortingBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sortingDecendingBtn));
		if (sortingDecendingBtn.isDisplayed()==true)
		{
			sortingDecendingBtn.click();
			
		}
		
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[BR COGS ACC INV, 16.25, 0.66]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[VAT INPUT, 19.71, 0.80]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[FIFO COGS ACC INV, 28.34, 1.15]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[Bank, 30.00, 1.22]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[WA COGS ACC INV, 188.84, 7.70]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[COGS POSTING ACC, 363.42, 14.81]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=1;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[Customer A, 514.00, 20.94]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=1;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[STD RATE COGS ACC INV, 600.00, 24.45]";
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=1;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[Vendor B, 693.50, 28.26]";
		
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=1;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[Grand Total, 2,454.06, 100.00]";
		
		
		System.out.println("*********************************************************************");
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List)
				&& actRow10List.equalsIgnoreCase(expRow10List) &&  
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
		
		
	@FindBy(xpath="//*[@id='tblBodyReportRender']/tr/td[2]")
	private static List<WebElement> report1stColList;
	
	@FindBy(xpath="//*[@id='tblBodyReportRender']/tr/td[3]")
	private static List<WebElement> report2ndColList;
	
	@FindBy(xpath="//*[@id='tblBodyReportRender']/tr/td[4]")
	private static List<WebElement> report3rdColList;
	
	@FindBy(xpath="//*[@id='tblBodyReportRender']/tr/td[5]")
	private static List<WebElement> report4thColList;
	
	@FindBy(xpath="//*[@id='tblBodyReportRender']/tr/td[6]")
	private static List<WebElement> report5thColList;
	
	public boolean checkInterestCalculationReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		/*
		
		
		//Thread.sleep(2000);
*/		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
		MiscellaneousAnalysisReportMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(interestCalculationReport));
		interestCalculationReport.click();
		
		//Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
				
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportVocGridListCount = report1stColList.size();
		ArrayList<String> reportVocGridListArray = new ArrayList<String>();
		for(int i=0;i<reportVocGridListCount;i++)
		{
			String data = report1stColList.get(i).getText();
			reportVocGridListArray.add(data);
		}
		String actreportVocGridList = reportVocGridListArray.toString();
		String expreportVocGridList = "[HDFC, Cash, Bank, Customer A, Customer B, Customer C, Customer Update, Opening Balances Control A/C, Sales - Computers, Vendor A, Vendor B, COGS POSTING ACC, BR COGS ACC INV, FIFO COGS ACC INV]";

		int reportACCGridListCount = report2ndColList.size();
		ArrayList<String> reportACCGridListArray = new ArrayList<String>();
		for(int i=0;i<reportACCGridListCount;i++)
		{
			String data = report2ndColList.get(i).getText();
			reportACCGridListArray.add(data);
		}
		String actreportACCGridList = reportACCGridListArray.toString();
		String expreportACCGridList = "[, 68.07, 0.31, 1.17, 68.07, 0.01, 0.28, 68.07, 1.50, 1.24, 2.92, 2.28, 17.72, 16.96]";

		System.out.println("************************************checkInterestCalculationReport***************************************");
		
		System.out.println("Particulars List  : "+actreportVocGridList);
		System.out.println("Particulars List  : "+expreportVocGridList);
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("Percentage  : "+actreportACCGridList);
		System.out.println("Percentage  : "+expreportACCGridList);
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		
		if( actreportVocGridList.equalsIgnoreCase(expreportVocGridList) && actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
		

	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[11]/ul/li/a/span")
	private static List<WebElement> mastersInformationReportList;
	
	public boolean checkMastersInformationMenuReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
		mastersInformationMenu.click();
		
		//Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterInfoMenu));
		masterInfoMenu.click();
		
	
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
				
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
		filterAccountExpandBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		if (filterAccNameChkbox.isSelected()==false)
		{
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
			filterAccNameChkbox.click();
			
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterMasterInfoTxt));
		filterMasterInfoTxt.click();
		filterMasterInfoTxt.sendKeys("HDFC");
		
		Thread.sleep(2000);
		
		filterMasterInfoTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
        int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			if (i==4) 
			{
				data="dateFiled";
			}
			if (i==6) 
			{
				data="dateFiled";
			}
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[HDFC, HDFC, SU, dateFiled, SU, dateFiled]";
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		

		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) && 
				actRow1List.equalsIgnoreCase(expRow1List)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	
	
	public boolean checkProductLabelReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
		mastersInformationMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(productLabelMenu));
		productLabelMenu.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
		
		boolean actdocumentTxt    					=documentTxt.isDisplayed();
		boolean actlayoutTxt						=layoutTxt.isDisplayed();
		boolean actdocumentRadioBtn					=documentRadioBtn.isDisplayed();
		boolean actitemRadioBtn					    =itemRadioBtn.isDisplayed();
		
		boolean actpl_previewBtn     = pl_previewBtn.isDisplayed();
		boolean actpl_printBtn       = pl_printBtn.isDisplayed();
		boolean actpl_CloseBtn       = pl_CloseBtn.isDisplayed();
		
		
		// Expected
		
		boolean expdocumentTxt    					=true;
		boolean explayoutTxt						=true;
		boolean expdocumentRadioBtn					=true;
		boolean expitemRadioBtn					    =true;
		
		boolean exppl_previewBtn     = true;
		boolean exppl_printBtn       = true;
		boolean exppl_CloseBtn       = true;
		
		System.out.println("************************************checkProductLabelOptions******************************************");
		
		System.out.println("documentTxt     		 	:   "+actdocumentTxt			+" Value Expected : "+expdocumentTxt);
		System.out.println("layoutTxt     		 		:   "+actlayoutTxt				+" Value Expected : "+explayoutTxt);
		System.out.println("documentRadioBtn     		:   "+actdocumentRadioBtn		+" Value Expected : "+expdocumentRadioBtn);
		System.out.println("itemRadioBtn     		 	:   "+actitemRadioBtn			+" Value Expected : "+expitemRadioBtn);
		
		System.out.println("pl_previewBtn     		 	:   "+actpl_previewBtn			+" Value Expected : "+exppl_previewBtn);
		System.out.println("pl_printBtn     		 	:   "+actpl_printBtn			+" Value Expected : "+exppl_printBtn);
		System.out.println("pl_CloseBtn     		 	:   "+actpl_CloseBtn			+" Value Expected : "+exppl_CloseBtn);
		
		
		
		boolean actMethod=actdocumentTxt==expdocumentTxt && actlayoutTxt==explayoutTxt && actdocumentRadioBtn==expdocumentRadioBtn && actitemRadioBtn==expitemRadioBtn
				&& actpl_previewBtn==exppl_previewBtn && actpl_printBtn==exppl_printBtn && actpl_CloseBtn==exppl_CloseBtn;
		
		String actResult=Boolean.toString(actMethod);
		String expResult="true";
		
		if(actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && actResult.equalsIgnoreCase(expResult))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pl_CloseBtn));
			pl_CloseBtn.click();
			
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pl_CloseBtn));
			pl_CloseBtn.click();
			return false;
		}
	}
	
	@FindBy(xpath="//input[@id='opt_DocumentTypeID']")
	private static WebElement documentTxt;
	
	@FindBy(xpath="//input[@id='opt_LayoutID']")
	private static WebElement layoutTxt;
	
	@FindBy(xpath="//input[@id='idrdDocument']")
	private static WebElement documentRadioBtn;
	
	@FindBy(xpath="//input[@id='idrdProduct']")
	private static WebElement itemRadioBtn;
	
	@FindBy(xpath="//i[@class='icon-add-preview icon-font6']")
	private static WebElement pl_previewBtn;
	
	@FindBy(xpath="//i[@class='icon-print icon-font6']")
	private static WebElement pl_printBtn;
	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement pl_CloseBtn;
	
	
	public boolean checkUnitConversionReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
		mastersInformationMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitConversionMenu));
		unitConversionMenu.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_SelectAllItemsChkBox));
		sl_SelectAllItemsChkBox.click();
		
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
				
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		  
		boolean actResult = reportsbody.getText().isEmpty();
		boolean expResult = true;
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) &&
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) && 
				actResult==expResult) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	

	// Skid Definition
	
	
	@FindBy(xpath="//input[@id='skidId']")
	private static WebElement skid;
	
	@FindBy(xpath="//input[@id='txtprefix']")
	private static WebElement prefixTxt;
	
	@FindBy(xpath="//input[@id='txtStartingNumber']")
	private static WebElement startingNoTxt;
	
	@FindBy(xpath="//input[@id='chkSkid']")
	private static WebElement enableReprintChkBox;
	
	@FindBy(xpath="//input[@id='txtQuantity']")
	private static WebElement quantityTxt;
	
	@FindBy(xpath="//span[@class='icon-analyze icon-font6']")
	private static WebElement sd_PreviewBtn;
	
	@FindBy(xpath="//span[@class='icon-print icon-font6']")
	private static WebElement sd_PrintBtn;
	
	@FindBy(xpath="//span[@class='icon-close']")
	private static WebElement sd_CloseBtn;
	
	public boolean checkSkidDefinitionReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
		mastersInformationMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(skidDefinitionMenu));
		skidDefinitionMenu.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(skid));
		boolean actskid    				  = skid.isDisplayed();
		boolean actprefixTxt			  = prefixTxt.isDisplayed();
		boolean actstartingNoTxt		  = startingNoTxt.isDisplayed();
		boolean actenableReprintChkBox	  = enableReprintChkBox.isDisplayed();
		boolean actquantityTxt            = quantityTxt.isDisplayed();
		boolean actsd_PreviewBtn          = sd_PreviewBtn.isDisplayed();
		boolean actsd_printBtn            = sd_PrintBtn.isDisplayed();
		boolean actsd_CloseBtn            = sd_CloseBtn.isDisplayed();
		
		
		// Expected
		
		boolean expskid    				  = true;
		boolean expprefixTxt		  	  = true;
		boolean expstartingNoTxt		  = true;
		boolean expenableReprintChkBox	  = true;
		boolean expquantityTxt            = true;
		boolean expsd_PreviewBtn          = true;
		boolean expsd_printBtn            = true;
		boolean expsd_CloseBtn            = true;
		
		System.out.println("************************************checkSkidDefinitionOptions******************************************");
		
		System.out.println("skid     		 	      :   "+actskid			      +" Value Expected : "+expskid);
		System.out.println("prefixTxt     		 	  :   "+actprefixTxt		  +" Value Expected : "+expprefixTxt);
		System.out.println("startingNoTxt     		  :   "+actstartingNoTxt	  +" Value Expected : "+expstartingNoTxt);
		System.out.println("enableReprintChkBox       :   "+actenableReprintChkBox+" Value Expected : "+expenableReprintChkBox);
		System.out.println("quantityTxt     		  :   "+actquantityTxt		  +" Value Expected : "+expquantityTxt);
		System.out.println("sd_PreviewBtn     		  :   "+actsd_PreviewBtn	  +" Value Expected : "+expsd_PreviewBtn);
		System.out.println("sd_printBtn     		  :   "+actsd_printBtn		  +" Value Expected : "+expsd_printBtn);
		System.out.println("sd_CloseBtn     		  :   "+actsd_CloseBtn		  +" Value Expected : "+expsd_CloseBtn);
		
		
		
		boolean actMethod=actskid==expskid && actprefixTxt==expprefixTxt && actstartingNoTxt==expstartingNoTxt && actenableReprintChkBox==expenableReprintChkBox
				&& actquantityTxt==expquantityTxt && actsd_PreviewBtn==expsd_PreviewBtn && actsd_printBtn==expsd_printBtn && actsd_CloseBtn==expsd_CloseBtn;
		
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult="true";

		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sd_CloseBtn));
		sd_CloseBtn.click();
		
		if(actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && actResult.equalsIgnoreCase(expResult))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[12]/ul/li/a/span")
	private static List<WebElement> auditTrailList;
	
	@FindBy(xpath="//span[contains(text(),'Excluded eleted transactions')]")
	private static WebElement excludedElectedTransactionsChkBox;
	
	@FindBy(xpath="//span[contains(text(),'Exclude modified transactions')]")
	private static WebElement excludeModifiedTransactionsChkBox;
	
	@FindBy(xpath="//span[contains(text(),'Include manual closed link')]")
	private static WebElement includeManualClosedLinkChkBox;
	
	@FindBy(xpath="//select[@id='RITCombobox__5']")
	private static WebElement displayOrderDropDown;
	
	@FindBy(xpath="//input[@id='RITTable__0']")
	private static WebElement reportVoucherTxt;
	
	@FindBy(xpath="//*[@id='RITTable__0_table_data_body']/tr/td")
	private static List<WebElement> reportVoucherTxtList;
	
	public boolean checkAuditTrailTransactionsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailMenu));
		auditTrailMenu.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailtransactionsReport));
		auditTrailtransactionsReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportVoucherTxt));
		reportVoucherTxt.click();
		reportVoucherTxt.sendKeys(Keys.SPACE);
		
		int reportVoucherTxtListCount = reportVoucherTxtList.size();
		
		for(int i=0;i<reportVoucherTxtListCount;i++)
		{
			String data = reportVoucherTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("Opening Balances"))
			{
				reportVoucherTxtList.get(i).click();
			}
		}
		
		reportVoucherTxt.sendKeys(Keys.TAB);
		
		//Checkbox Id are Same Name is diff
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(movedAccOnlyChkBox));
		movedAccOnlyChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ignoreConvertedPDCChkbox));
		ignoreConvertedPDCChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clubCashSalesForTheDayChkBox));
		clubCashSalesForTheDayChkBox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_IncludeServiceTypeItemChkBox));
		sl_IncludeServiceTypeItemChkBox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			if (i==2) 
			{
			data="datafield";	
			}
			if (i==3) 
			{
			data="datafield";	
			}
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[OpeBal : 1, datafield, datafield, Opening Balances Control A/C, 400.00, Unchecked, New, , SU, ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			if (i==2) 
			{
			data="datafield";	
			}
			if (i==3) 
			{
			data="datafield";	
			}
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[OpeBal : 1, datafield, datafield, Opening Balances Control A/C, 100.00, Unchecked, New, , SU, ]";
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			if (i==2) 
			{
			data="datafield";	
			}
			if (i==3) 
			{
			data="datafield";	
			}
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[OpeBal : 2, datafield, datafield, Opening Balances Control A/C, 400.00, Unchecked, New, , SU, ]";
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			if (i==2) 
			{
			data="datafield";	
			}
			if (i==3) 
			{
			data="datafield";	
			}
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[OpeBal : 2, datafield, datafield, Opening Balances Control A/C, 100.00, Unchecked, New, , SU, ]";
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=2;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[, , , 600.00, , , , , ]";
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List) && 
				actRow5List.equalsIgnoreCase(expRow5List) && 
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	

	public boolean checkAuditTrailLoginsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailMenu));
		auditTrailMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(aAuditTrailloginsReport));
		aAuditTrailloginsReport.click();
		
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportUsersTxt));
		reportUsersTxt.click();
		reportUsersTxt.sendKeys(Keys.SPACE);
		
		int reportUsersTxtListCount = reportUsersTxtList.size();
		
		for(int i=0;i<reportUsersTxtListCount;i++)
		{
			String data = reportUsersTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("UserAllOptionsST"))
			{
				reportUsersTxtList.get(i).click();
			}
		}
		
		reportUsersTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
		Thread.sleep(2000);
		
		int reportsRow1ListCount = report1stColList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=0;i<reportsRow1ListCount;i++)
		{
			String data = report1stColList.get(i).getText();
			reportsRow1ListArray.add(data);
			
		}
		String actreportsRow1List = reportsRow1ListArray.toString();
		String expreportsRow1List ="[Revise Budget Details, Define Budget, Material Requisition, Purchases Orders]";
		
		System.out.println("actreportsRow1List   :"+actreportsRow1List);
		System.out.println("expreportsRow1List   :"+expreportsRow1List);
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) && 
				actreportsRow1List.equalsIgnoreCase(expreportsRow1List)) 
			
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(1000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(1000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
		


		
	@FindBy(xpath="//input[@id='RITTable__0']")
	private static WebElement reportUsersTxt;
	
	@FindBy(xpath="//*[@id='RITTable__0_table_data_body']/tr/td")
	private static List<WebElement> reportUsersTxtList;
	
		
	
	
	// Account Query
	
			@FindBy(xpath="//input[@id='accountQuery']")
			private static WebElement accountQueryTxt;
			
			@FindBy(xpath="//button[@class='btn btn-default btn-sm']")
			private static WebElement getAccountDetailsBtn;
			
			@FindBy(xpath="//label[contains(text(),'Opening Balance :')]")
			private static WebElement aq_OpeningBalanceLable;
			
			@FindBy(xpath="//label[contains(text(),'Credit :')]")
			private static WebElement aq_CreditLable;
			
			@FindBy(xpath="//label[contains(text(),'Debit :')]")
			private static WebElement aq_DebitLable;
			
			@FindBy(xpath="//div[5]//label[1]")
			private static WebElement aq_BalanceLable;
			
			@FindBy(xpath="//table[@id='creditTransTable']//th[contains(text(),'Date')]")
			private static WebElement ltc_Date;
			
			@FindBy(xpath="//table[@id='creditTransTable']//th[contains(text(),'Voucher')]")
			private static WebElement ltc_Vocuher;
			
			@FindBy(xpath="//table[@id='creditTransTable']//th[contains(text(),'Account')]")
			private static WebElement ltc_Account;
			
			@FindBy(xpath="//th[contains(text(),'Credit')]")
			private static WebElement ltc_Credit;
			
			@FindBy(xpath="//table[@id='debitTransTable']//th[contains(text(),'Date')]")
			private static WebElement ltd_Date;
			
			@FindBy(xpath="//table[@id='debitTransTable']//th[contains(text(),'Voucher')]")
			private static WebElement ltd_Vocuher;
			
			@FindBy(xpath="//table[@id='debitTransTable']//th[contains(text(),'Account')]")
			private static WebElement ltd_Account;
			
			@FindBy(xpath="//th[contains(text(),'Debit')]")
			private static WebElement ltd_Dedit;
			
			@FindBy(xpath="//span[@class='icon-panel icon-font7 pull-right']")
			private static WebElement deptWiseBalnceExpandBtn;
			
			@FindBy(xpath="//i[@class='icon-clear icon-font6']")
			private static WebElement aq_ClearBtn;
			
			@FindBy(xpath="//i[@class='icon-close icon-font6']")
			private static WebElement aq_CloseBtn;
			
			@FindBy(xpath="//span[@id='openingBal']")
			private static WebElement  AQ_OpnBal;
			
			@FindBy(xpath="//span[@id='credit']")
			private static WebElement  AQ_Credit;
			
			@FindBy(xpath="//span[@id='debit']")
			private static WebElement  AQ_Debit;
			
			@FindBy(xpath="//span[@id='balance']")
			private static WebElement  AQ_Balance;
			
			@FindBy(xpath="//*[@id='creditTransTable']/tbody/tr/td[2]")
			private static List<WebElement>  AQ_CreditTransVouList;
			
			@FindBy(xpath="//*[@id='creditTransTable']/tbody/tr/td[3]")
			private static List<WebElement>  AQ_CreditTransAccountList;
			
			@FindBy(xpath="//*[@id='creditTransTable']/tbody/tr/td[4]")
			private static List<WebElement>  AQ_CreditTransCreditList;
			
			
			@FindBy(xpath="//*[@id='debitTransTable']/tbody/tr/td[2]")
			private static List<WebElement>  AQ_DebitTransVouList;
			
			@FindBy(xpath="//*[@id='debitTransTable']/tbody/tr/td[3]")
			private static List<WebElement>  AQ_DebitTransAccountList;
			
			@FindBy(xpath="//*[@id='debitTransTable']/tbody/tr/td[4]")
			private static List<WebElement>  AQ_DebitTransDebitList;
			
			@FindBy(xpath="//*[@id='tagWiseTransData']/tbody/tr/td")
			private static List<WebElement>  AQ_DepartmentList;
			
			

			

	public boolean checkAccountQueryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountQuery));
			accountQuery.click();
			
			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
			String expvalidationConfirmationMessage = "true";
			
			
			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
				
			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountQueryTxt));
			accountQueryTxt.click();
			accountQueryTxt.sendKeys("BR COGS ACC INV");
			Thread.sleep(1500);
			
			accountQueryTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(1500);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getAccountDetailsBtn));
			getAccountDetailsBtn.click();
			
			boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
			
			String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
			String expvalidationConfirmationMessage1 = "true";
			
			System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
			
			
			Thread.sleep(2500);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AQ_OpnBal));
			String actAQ_OpnBal				        =AQ_OpnBal.getText();
			String actAQ_Credit		                =AQ_Credit.getText();
			String actAQ_Debit				        =AQ_Debit.getText();
			String actAQ_Balance			        =AQ_Balance.getText();
			
			String expAQ_OpnBal				        ="100.00 Dr";
			String expAQ_Credit		                ="438.75";
			String expAQ_Debit				        ="917.50";
			String expAQ_Balance			        ="578.75 Dr";
			
			System.out.println("************************************checkAccountQueryOfBRCOGSACCINVAccount*************************************");
			
			System.out.println("AQ_OpnBal     		 :   "+actAQ_OpnBal			+" Value Expected : "+expAQ_OpnBal);
			System.out.println("AQ_Credit            :   "+actAQ_Credit			+" Value Expected : "+expAQ_Credit);
			System.out.println("AQ_Debit     		 :   "+actAQ_Debit			+" Value Expected : "+expAQ_Debit);
			System.out.println("AQ_Balance     	     :   "+actAQ_Balance		+" Value Expected : "+expAQ_Balance);
			
           int AQ_CreditTransVouListCount = AQ_CreditTransVouList.size();
			
			ArrayList<String> AQ_CreditTransVouListArray = new ArrayList<String>();
			
			for(int i=0;i<AQ_CreditTransVouListCount;i++)
			{
				String data = AQ_CreditTransVouList.get(i).getText();
				AQ_CreditTransVouListArray.add(data);
			}
			
			String actAQ_CreditTransVouList = AQ_CreditTransVouListArray.toString();
			String expAQ_CreditTransVouList = "[PurRet : 1, PurRet : 2, NDT50 : 1, NDT50 : 4, NDT50 : 5, NDT50 : 7]";
			
			
			System.out.println("actAQ_CreditTransVouList  :"+actAQ_CreditTransVouList);
			System.out.println("ExpAQ_CreditTransVouList  :"+expAQ_CreditTransVouList);
			
			
			//AQ_CreditTransAccountList
			
           int AQ_CreditTransAccountListCount = AQ_CreditTransAccountList.size();
			
			ArrayList<String> AQ_CreditTransAccountListArray = new ArrayList<String>();
			
			for(int i=0;i<AQ_CreditTransAccountListCount;i++)
			{
				String data = AQ_CreditTransAccountList.get(i).getText();
				AQ_CreditTransAccountListArray.add(data);
			}
			
			String actAQ_CreditTransAccountList = AQ_CreditTransAccountListArray.toString();
			String expAQ_CreditTransAccountList ="[Vendor A, Vendor A, COGS POSTING ACC, COGS POSTING ACC, COGS POSTING ACC, COGS POSTING ACC]";
			
			
			System.out.println("catAQ_CreditTransAccountList  :"+actAQ_CreditTransAccountList);
			System.out.println("expAQ_CreditTransAccountList  :"+expAQ_CreditTransAccountList);
			
			//AQ_CreditTransCreditList
			
           int AQ_CreditTransCreditListCount = AQ_CreditTransCreditList.size();
			
			ArrayList<String> AQ_CreditTransCreditListArray = new ArrayList<String>();
			
			for(int i=0;i<AQ_CreditTransCreditListCount;i++)
			{
				String data = AQ_CreditTransCreditList.get(i).getText();
				AQ_CreditTransCreditListArray.add(data);
			}
			
			String actAQ_CreditTransCreditList = AQ_CreditTransCreditListArray.toString();
			String expAQ_CreditTransCreditList = "[315.00, 315.00, 50.00, 42.00, 25.00, 1.75]";
			
			
			System.out.println("actAQ_CreditTransCreditList  :"+actAQ_CreditTransCreditList);
			System.out.println("expAQ_CreditTransCreditList  :"+expAQ_CreditTransCreditList);
		
			

			//AQ_DebitTransVouList
			
           int AQ_DebitTransVouListCount = AQ_DebitTransVouList.size();
			
			ArrayList<String> AQ_DebitTransVouListArray = new ArrayList<String>();
			
			for(int i=0;i<AQ_DebitTransVouListCount;i++)
			{
				String data = AQ_DebitTransVouList.get(i).getText();
				AQ_DebitTransVouListArray.add(data);
			}
			
			String actAQ_DebitTransVouList = AQ_DebitTransVouListArray.toString();
			String expAQ_DebitTransVouList = "[SalRet : 2, NDT48 : SU/AME/TEXT2, NDT48 : SU/AME/TEXT2, NDT48 : SU/AME/TEXT2, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, NDT48 : SU/AME/TEXT1, OpeBal : 2, OpeBal : 1]";
			
			
			System.out.println("actAQ_DebitTransVouList  :"+actAQ_DebitTransVouList);
			System.out.println("expAQ_DebitTransVouList  :"+expAQ_DebitTransVouList);
		


			//AQ_DebitTransAccountList
			
           int AQ_DebitTransAccountListCount = AQ_DebitTransAccountList.size();
			
			ArrayList<String> AQ_DebitTransAccountListArray = new ArrayList<String>();
			
			for(int i=0;i<AQ_DebitTransAccountListCount;i++)
			{
				String data = AQ_DebitTransAccountList.get(i).getText();
				AQ_DebitTransAccountListArray.add(data);
			}
			
			String actAQ_DebitTransAccountList = AQ_DebitTransAccountListArray.toString();
			String expAQ_DebitTransAccountList = "[SR COGS POSTING ACC, Vendor B, Vendor B, Vendor B, Vendor B, Vendor B, Vendor B, Opening Balances Control A/C, Opening Balances Control A/C]";
			
			
			System.out.println("actAQ_DebitTransAccountList  :"+actAQ_DebitTransAccountList);
			System.out.println("expAQ_DebitTransAccountList  :"+expAQ_DebitTransAccountList);
		

			//AQ_DebitTransDebitList
			
           int AQ_DebitTransDebitListCount = AQ_DebitTransDebitList.size();
			
			ArrayList<String> AQ_DebitTransDebitListArray = new ArrayList<String>();
			
			for(int i=0;i<AQ_DebitTransDebitListCount;i++)
			{
				String data = AQ_DebitTransDebitList.get(i).getText();
				AQ_DebitTransDebitListArray.add(data);
			}
			
			String actAQ_DebitTransDebitList = AQ_DebitTransDebitListArray.toString();
			String expAQ_DebitTransDebitList = "[17.50, 100.00, 100.00, 100.00, 400.00, 300.00, 200.00, 100.00, 100.00]";
			
			
			System.out.println("actAQ_DebitTransDebitList  :"+actAQ_DebitTransDebitList);
			System.out.println("expAQ_DebitTransDebitList  :"+expAQ_DebitTransDebitList);
		
			
			
			// WareHouse Table
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deptWiseBalnceExpandBtn));
			deptWiseBalnceExpandBtn.click();
			
			Thread.sleep(2000);
			
			getAction().sendKeys(Keys.CONTROL,Keys.END).build().perform();
			
			//AQ_DepartmentList
			
           int AQ_DepartmentListCount = AQ_DepartmentList.size();
			
			ArrayList<String> AQ_DepartmentListArray = new ArrayList<String>();
			
			for(int i=0;i<AQ_DepartmentListCount;i++)
			{
				String data = AQ_DepartmentList.get(i).getText();
				AQ_DepartmentListArray.add(data);
			}
			
			String actAQ_DepartmentList = AQ_DepartmentListArray.toString();
			String expAQ_DepartmentList = "[1, , 5.00 Cr, 2, INDIA, 100.00 Dr, 3, AMERICA, 900.00 Dr, 4, DUBAI, 416.25 Cr, 5, 578.75 Dr]";
			
			
			System.out.println("actAQ_DepartmentList  :"+actAQ_DepartmentList);
			System.out.println("expAQ_DepartmentList  :"+expAQ_DepartmentList);
		
			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(aq_CloseBtn));
			aq_CloseBtn.click();
			
			if(actAQ_OpnBal.equalsIgnoreCase(expAQ_OpnBal) && actAQ_Credit.equalsIgnoreCase(expAQ_Credit)
					&& actAQ_Debit.equalsIgnoreCase(expAQ_Debit) && actAQ_Balance.equalsIgnoreCase(expAQ_Balance) && 
					actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) &&
					actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) &&
					actAQ_CreditTransVouList.equalsIgnoreCase(expAQ_CreditTransVouList) && actAQ_CreditTransAccountList.equalsIgnoreCase(expAQ_CreditTransAccountList) && 
					actAQ_CreditTransCreditList.equalsIgnoreCase(expAQ_CreditTransCreditList) && actAQ_DebitTransVouList.equalsIgnoreCase(expAQ_DebitTransVouList) &&
					actAQ_DebitTransAccountList.equalsIgnoreCase(expAQ_DebitTransAccountList)&& actAQ_DebitTransDebitList.equalsIgnoreCase(expAQ_DebitTransDebitList) && 
					actAQ_DepartmentList.equalsIgnoreCase(expAQ_DepartmentList))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		

	
	public boolean checkTransactionAuthorizationReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionAuthorizationReport));
		transactionAuthorizationReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		//Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportVoucherTxt));
		reportVoucherTxt.click();
		reportVoucherTxt.sendKeys(Keys.SPACE);
		
		int reportVoucherTxtListCount = reportVoucherTxtList.size();
		
		for(int i=0;i<reportVoucherTxtListCount;i++)
		{
			String data = reportVoucherTxtList.get(i).getText();
			
			if(data.equalsIgnoreCase("Purchase Voucher VAT"))
			{
				reportVoucherTxtList.get(i).click();
			}
		}
		
		reportVoucherTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		Thread.sleep(2000);
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		
		boolean actResult = reportsbody.getText().isEmpty();
		boolean expResult = true;
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) &&
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) && 
				actResult==expResult) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
		


	public boolean checkMasterAuthorizationReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAuthorizationReport));
		masterAuthorizationReport.click();
		
		boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		//Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		Thread.sleep(2000);
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Test Master, Test Master, UserAllOptionsST, , , ]";
		
		System.out.println("actRow1List : "+actRow1List);
		System.out.println("expRow1List : "+expRow1List);
		
		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) &&
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) && 
				actRow1List.equalsIgnoreCase(expRow1List)) 
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}
	
	
	
	
	//Final Accounts
	@FindBy(xpath="//*[@id='530']/span")
    private static WebElement  financialsFinalAccountsMenu;
	
	@FindBy(xpath="//*[@id='531']/span")
	private static WebElement trialBalanceReport;
			
	@FindBy(xpath="//*[@id='532']/span")
	private static WebElement profitandLossReport;
	
	@FindBy(xpath="//*[@id='533']/span")
	private static WebElement  tradingAccountReport;
	
	@FindBy(xpath="//*[@id='534']/span")
	private static WebElement  tradingandProfitAndLossReport;
	
	@FindBy(xpath="//*[@id='535']/span")
	private static WebElement  balanceSheetReport;				
	
	@FindBy(xpath="//*[@id='592']/span")
	private static WebElement  finalAccountSchedulesReport;
	
	@FindBy(xpath="//*[@id='593']/span")
	private static WebElement  fundFlowReport;
	
	@FindBy(xpath="//*[@id='594']/span")
	private static WebElement  cashFlowReport;
	
	@FindBy(xpath="//*[@id='252']/span")
	private static WebElement  cashFlowCalendarReport;
	
	@FindBy(xpath="//*[@id='595']/span")
	private static WebElement  cashFlowAnalysisReport;
	
	@FindBy(xpath="//*[@id='632']/span")
	private static WebElement  advanceCashFlowReport;
	
	@FindBy(xpath="//*[@id='630']/span")
	private static WebElement  incomeExpenseTrendsReport;
	
	@FindBy(xpath="//*[@id='655']/span")
	private static WebElement  receivablePayableReport;
	
	@FindBy(xpath="//input[@id='RITCheckbox__5']")
	private static WebElement  report5chkbox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__9']")
	private static WebElement  report9chkbox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__10']")
	private static WebElement  report10chkbox;
	
	
	
	@FindBy(xpath="//input[@id='RITCheckbox__11']")
	private static WebElement  report11chkbox;
	
	@FindBy(xpath="//input[@id='RITCheckbox__8']")
	private static WebElement  report8chkbox;
	
	@FindBy(xpath="//input[@id='FOption_531_0_DefaultFilter_0']")
	private static WebElement trailBalFilterAccTxt;
	
	@FindBy(xpath="//input[@id='FOption_533_0_DefaultFilter_0']")
	private static WebElement tradingAccFilterAccTxt;
	
	@FindBy(xpath="//input[@id='FOption_534_0_DefaultFilter_0']")
	private static WebElement tradingAccProfitAndLossCusAccTxt;
	
	@FindBy(xpath="//input[@id='FOption_535_0_DefaultFilter_0']")
	private static WebElement balSheetCusAccTxt;
	
	
	
	
	
	
	public boolean checkTrailBalanceReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(trialBalanceReport));
		trialBalanceReport.click();
	
		
        boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report5chkbox));
		report5chkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report9chkbox));
		report9chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report11chkbox));
		report11chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report8chkbox));
		report8chkbox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		
        boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
	
		
        Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
		filterAccountExpandBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		if (filterAccNameChkbox.isSelected()==false)
		{
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
			filterAccNameChkbox.click();
			
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(trailBalFilterAccTxt));
		trailBalFilterAccTxt.click();
		trailBalFilterAccTxt.sendKeys("HDFC");
		
		Thread.sleep(2000);
		
		trailBalFilterAccTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[HDFC, HDFC, HDFC, , 0.24, , , , 0.24, 10.00, 10.24, , 0.24, , , , 0.24, 10.00, 10.24, , 0.02, , , , 0.02, 5.35, 5.37, , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Grand Total, , , , 0.24, , , , 0.24, 10.00, 10.24, , 0.24, , , , 0.24, 10.00, 10.24, , 0.02, , , , 0.02, 5.35, 5.37, , , ]";
		

		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) && 
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	
		{
			return true;
		}
		else
		{
			
			return false;
		}
	}
	
	public boolean checkTrailBalanceReportPrintOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
		sl_ReportPrintBtn.click();
		
		Thread.sleep(3000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	Thread.sleep(2000);
	 	
	 	getDriver().switchTo().window(openTabs.get(1)).close();
	 	
	 	getDriver().switchTo().window(openTabs.get(0));
		
		System.out.println("openTabs"+openTabs);
		System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
		
		Thread.sleep(1000);
		
		if(actOpenWindowsCount==expOpenWindowsCount)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}

	
	
	public boolean checkProfitAndLossReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		//Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		//Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(profitandLossReport));
		profitandLossReport.click();
	
        boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report5chkbox));
		report5chkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report9chkbox));
		report9chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report10chkbox));
		report10chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
			
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
			
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report9chkbox));
		if (report9chkbox.isSelected()==true) 
		{
			report9chkbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report5chkbox));
		if (report5chkbox.isSelected()==true) 
		{
			report5chkbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report10chkbox));
		if (report10chkbox.isSelected()==true) 
		{
			report10chkbox.click();
		}
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage2 =validationConfirmationMessage.getText().isEmpty();
			
		String actvalidationConfirmationMessage2 = Boolean.toString(novalidationConfirmationMessage2);
		String expvalidationConfirmationMessage2 = "true";
		
		System.out.println("validationConfirmationMessage2 : "+actvalidationConfirmationMessage2+" Value Expected : "+expvalidationConfirmationMessage2);
			
		Thread.sleep(2000);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[REVENUE, 007, REVENUE, , 1,015.50, , , , 1,015.50, 220.00, 1,235.50, , 1,015.50, , , , 1,015.50, 220.00, 1,235.50, , 71.09, , , , 71.09, 15.40, 86.49, , 63.44, 63.44, 14.98]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[SALES, 071, SALES, , 1,015.50, , , , 1,015.50, 220.00, 1,235.50, , 1,015.50, , , , 1,015.50, 220.00, 1,235.50, , 71.09, , , , 71.09, 15.40, 86.49, , 63.44, 63.44, 14.98]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Sales - Computers, 071-001, Sales - Computers, , 1,015.50, , , , 1,015.50, 220.00, 1,235.50, , 1,015.50, , , , 1,015.50, 220.00, 1,235.50, , 71.09, , , , 71.09, 15.40, 86.49, , 63.44, 63.44, 14.98]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[COGS POSTING ACC, COGS POSTING ACC, COGS POSTING ACC, 1,543.90, , , , 1,543.90, , 1,543.90, , 1,543.90, , , , 1,543.90, , 1,543.90, , 108.07, , , , 108.07, , 108.07, , , 86.69, 86.69, 100.00]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[SR COGS POSTING ACC, SR COGS POSTING ACC, SR COGS POSTING ACC, , 195.34, , , , 195.34, , 195.34, , 195.34, , , , 195.34, , 195.34, , 13.67, , , , 13.67, , 13.67, , 12.20, 12.20, 2.88]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[SHORTAGE COGS POSTING ACC, SHORTAGE COGS POSTING ACC, SHORTAGE COGS POSTING ACC, 236.98, , , , 236.98, , 236.98, , 236.98, , , , 236.98, , 236.98, , , , , , , , , , , 13.31, 13.31, ]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=1;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[EXCESS COGS POSTING ACC, EXCESS COGS POSTING ACC, EXCESS COGS POSTING ACC, , 389.88, , , , 389.88, , 389.88, , 389.88, , , , 389.88, , 389.88, , 389.88, , , , 389.88, , 389.88, , 24.36, 24.36, 82.14]";
		
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=1;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[Loss for the period, , , , 180.16, , , , 180.16, , 180.16, , 180.16, , , , 180.16, , 180.16, 366.57, , , , 366.57, , 366.57, , , , , ]";
		
		
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=1;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[Grand Total, , , 1,780.88, 1,780.88, , , 1,780.88, 1,780.88, 2,000.88, 2,000.88, 1,780.88, 1,780.88, , , 1,780.88, 1,780.88, 2,000.88, 2,000.88, 474.64, 474.64, , , 474.64, 474.64, 490.04, 490.04, , , , ]";
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) &&
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) &&
				actvalidationConfirmationMessage2.equalsIgnoreCase(expvalidationConfirmationMessage2) )
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

		
		
	public boolean checkProfitAndLossPrintOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
		sl_ReportPrintBtn.click();
		
		Thread.sleep(3000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	Thread.sleep(2000);
	 	
	 	getDriver().switchTo().window(openTabs.get(1)).close();
	 	
	 	getDriver().switchTo().window(openTabs.get(0));
		
		System.out.println("openTabs"+openTabs);
		System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
		
		Thread.sleep(1000);
		
		if(actOpenWindowsCount==expOpenWindowsCount)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}


	
	public boolean checkTradingAccountOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradingAccountReport));
		tradingAccountReport.click();
	
		
       boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
		sl_HeaderSelectChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report9chkbox));
		report9chkbox.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
				
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
	    Thread.sleep(2000);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[COGS POSTING ACC, COGS POSTING ACC, COGS POSTING ACC, 1,543.90, , , , 1,543.90, , 1,543.90, , 1,543.90, , , , 1,543.90, , 1,543.90, , 108.07, , , , 108.07, , 108.07, , 86.69, 86.69, 100.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[SR COGS POSTING ACC, SR COGS POSTING ACC, SR COGS POSTING ACC, , 195.34, , , , 195.34, , 195.34, , 195.34, , , , 195.34, , 195.34, , 13.67, , , , 13.67, , 13.67, 33.38, 33.38, 3.39]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[SHORTAGE COGS POSTING ACC, SHORTAGE COGS POSTING ACC, SHORTAGE COGS POSTING ACC, 236.98, , , , 236.98, , 236.98, , 236.98, , , , 236.98, , 236.98, , , , , , , , , , 13.31, 13.31, ]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[EXCESS COGS POSTING ACC, EXCESS COGS POSTING ACC, EXCESS COGS POSTING ACC, , 389.88, , , , 389.88, , 389.88, , 389.88, , , , 389.88, , 389.88, , 389.88, , , , 389.88, , 389.88, 66.62, 66.62, 96.61]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[Gross loss, , , , 1,195.66, , , , 1,195.66, , 1,195.66, , 1,195.66, , , , 1,195.66, , 1,195.66, 295.48, , , , 295.48, , 295.48, , , , ]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[Grand Total, , , 1,780.88, 1,780.88, , , 1,780.88, 1,780.88, 1,780.88, 1,780.88, 1,780.88, 1,780.88, , , 1,780.88, 1,780.88, 1,780.88, 1,780.88, 403.55, 403.55, , , 403.55, 403.55, 403.55, 403.55, , , ]";
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) && 
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) &&
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

		
	public boolean checkFilterOptionInTradingAccount() throws InterruptedException
	{
		
		   Thread.sleep(1500);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
			report_FilterBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
			report_FilterCustomizeBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
			filterAccountExpandBtn.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
			if (filterAccNameChkbox.isSelected()==false)
			{
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
				filterAccNameChkbox.click();
				
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
			filter_FilterOkButton.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradingAccFilterAccTxt));
			tradingAccFilterAccTxt.click();
			tradingAccFilterAccTxt.sendKeys("SR COGS POSTING ACC");
			
			Thread.sleep(2000);
			
			tradingAccFilterAccTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
			filterOkButton.click();

			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow2ndCol));
		
			String actsl_1stRow2ndCol=sl_1stRow2ndCol.getText();
			String expsl_1stRow2ndCol="COGS POSTING ACC";
	
			System.out.println("actsl_1stRow2ndCol  :"+actsl_1stRow2ndCol);
			System.out.println("expsl_1stRow2ndCol  :"+expsl_1stRow2ndCol);
			
			if (actsl_1stRow2ndCol.equalsIgnoreCase(expsl_1stRow2ndCol)) 
			{
				System.err.println(" Test Pass: Filter Option is Working");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return true;
			}
			else
			{
				System.err.println(" Test Fail: Filter Option is Working");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
				report_CloseBtn.click();
				//Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
				sl_CloseBtn.click();
				return false;
			}
		}
	
	
	
	public boolean checkTradingAndProfitAndLossReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradingandProfitAndLossReport));
		tradingandProfitAndLossReport.click();
		

       boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
	    Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report5chkbox));
		report5chkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report9chkbox));
		report9chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report10chkbox));
		report10chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
			
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
			

        Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
		filterAccountExpandBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		if (filterAccNameChkbox.isSelected()==false)
		{
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
			filterAccNameChkbox.click();
			
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradingAccProfitAndLossCusAccTxt));
		tradingAccProfitAndLossCusAccTxt.click();
		tradingAccProfitAndLossCusAccTxt.sendKeys("EXCESS COGS POSTING ACC");
		
		Thread.sleep(2000);
		
		tradingAccProfitAndLossCusAccTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[EXCESS COGS POSTING ACC, EXCESS COGS POSTING ACC, EXCESS COGS POSTING ACC, , 389.88, , , , 389.88, , 389.88, , 389.88, , , , 389.88, , 389.88, , 389.88, , , , 389.88, , 389.88, , 100.00, 100.00, 100.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Profit for the period, , , 389.88, , , , 389.88, , 389.88, , 389.88, , , , 389.88, , 389.88, , 389.88, , , , 389.88, , 389.88, , , , , ]";
		

		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Grand Total, , , 389.88, 389.88, , , 389.88, 389.88, 389.88, 389.88, 389.88, 389.88, , , 389.88, 389.88, 389.88, 389.88, 389.88, 389.88, , , 389.88, 389.88, 389.88, 389.88, , , , ]";
		

		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	
		{
			return true;
		}
		else
		{
			
			return false;
		}
	}

		
		
	
	
	
	
	
	public boolean checkPrintOptionIncheckTradingAndProfitAndLossReport() throws InterruptedException
	{

		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
		sl_ReportPrintBtn.click();
		
		Thread.sleep(3000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	Thread.sleep(2000);
	 	
	 	getDriver().switchTo().window(openTabs.get(1)).close();
	 	
	 	getDriver().switchTo().window(openTabs.get(0));
		
		System.out.println("openTabs"+openTabs);
		System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
		
		//Thread.sleep(1000);
		
		if(actOpenWindowsCount==expOpenWindowsCount)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	
		
	}
	
	public boolean checkBalanceSheetOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(balanceSheetReport));
		balanceSheetReport.click();
	
		 boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
			
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report5chkbox));
		report5chkbox.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report9chkbox));
		report9chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report10chkbox));
		report10chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
		
		boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
			
		String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
		String expvalidationConfirmationMessage1 = "true";
		
		System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
		
        Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
		filterAccountExpandBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		if (filterAccNameChkbox.isSelected()==false)
		{
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
			filterAccNameChkbox.click();
			
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(balSheetCusAccTxt));
		balSheetCusAccTxt.click();
		balSheetCusAccTxt.sendKeys("HDFC");
		
		Thread.sleep(2000);
		
		balSheetCusAccTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[HDFC, HDFC, HDFC, , 0.24, , , , 0.24, 10.00, 10.24, , 0.24, , , , 0.24, 10.00, 10.24, , 0.02, , , , 0.02, 5.35, 5.37, , 100.00, 100.00, 100.00]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Loss for the period, , , 5.71, , , , 5.71, , 5.71, , 5.71, , , , 5.71, , 5.71, , 11.56, , , , 11.56, , 11.56, , , , , ]";
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "";
		
		

		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
						return false;
		}
	}


	@FindBy(xpath="//*[@id='id_rc_complete_tree_container']/div[2]/ul/li/span")
	private static WebElement defaultExpandBtn;
	
	@FindBy(xpath="//span[contains(text(),'Particulars')]")
	private static WebElement cusParticularBtn;
	
	@FindBy(xpath="//*[@id='TCol1']/span")
	private static WebElement cusAccField;
	
	
	
	public boolean checkCustomizationAndPrintOptionInBalanceSheetReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
		report_ReportCustomizeBtn.click();
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
		defaultExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
		getAction().doubleClick(cusParticularBtn).build().perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
		cusSaveBtn.click();
		
		String expMessage = "Data saved successfully";
	    
	    String actMessage = checkValidationMessage(expMessage);
		
	    
        Thread.sleep(2000);
	    
	    int reportsHeaderListCount1 = reportsHeaderList.size();
		ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
		for(int i=0;i<reportsHeaderListCount1;i++)
		{
			String data = reportsHeaderList.get(i).getText();
			reportsHeaderListArray1.add(data);
		}
		String actHeaderList1 = reportsHeaderListArray1.toString();
		String expHeaderList1 = "[, Particulars, Code, Alias, Base, Transaction, Local, Budget, Base, Transaction, Local, Particulars, Debit, Credit, Dr (Op bal), Cr (Op bal), Dr (YTD), Cr (YTD), Debits for the period, Credits for the period, Debit (orig), Credit (orig), Dr (Op bal orig), Cr (Op bal orig), Dr (YTD orig), Cr (YTD orig), Debits for the period, Credits for the period, Debit (local), Credit (local), Dr (Op bal local), Cr (Op bal local), Dr (YTD local), Cr (YTD local), Debits for the period, Credits for the period, Percentage, Percentage (orig), Percentage (local)]";
	    
	    System.out.println(" Header List Actual    : "+actHeaderList1);
	    System.out.println("  Header List expected : "+expHeaderList1);
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
		report_ReportCustomizeBtn.click();
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
		cuDeleteLayoutBtn.click();
		
		getWaitForAlert();
		getAlert().accept();
		
		String expDeleteMessage = "Layout Deleted Successfully";
	    
	    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
	    
	    Thread.sleep(2000);
	    
	    int reportsHeaderListCount = reportsHeaderList.size();
		ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
		for(int i=0;i<reportsHeaderListCount;i++)
		{
			String data = reportsHeaderList.get(i).getText();
			reportsHeaderListArray.add(data);
		}
		String actHeaderList = reportsHeaderListArray.toString();
		String expHeaderList = "[, Particulars, Code, Alias, Base, Transaction, Local, Budget, Base, Transaction, Local, Debit, Credit, Dr (Op bal), Cr (Op bal), Dr (YTD), Cr (YTD), Debits for the period, Credits for the period, Debit (orig), Credit (orig), Dr (Op bal orig), Cr (Op bal orig), Dr (YTD orig), Cr (YTD orig), Debits for the period, Credits for the period, Debit (local), Credit (local), Dr (Op bal local), Cr (Op bal local), Dr (YTD local), Cr (YTD local), Debits for the period, Credits for the period, Percentage, Percentage (orig), Percentage (local)]";
	    
	    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
	    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
		
	    Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
		sl_ReportPrintBtn.click();
		
		Thread.sleep(3000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	Thread.sleep(2000);
	 	
	 	getDriver().switchTo().window(openTabs.get(1)).close();
	 	
	 	getDriver().switchTo().window(openTabs.get(0));
		
		System.out.println("openTabs"+openTabs);
		System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
		
		//Thread.sleep(1000);

		if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
				actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
				actOpenWindowsCount==expOpenWindowsCount)
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getDriver().switchTo().window(openTabs.get(1)).close();
			return false;
		}
		
	}
			
	
	public boolean checkFinalAccountsSchedulesReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
		financialsFinalAccountsMenu.click();
		
		//Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finalAccountSchedulesReport));
		finalAccountSchedulesReport.click();
		

	
	 boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report5chkbox));
	report5chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	sl_HeaderSelectChkBox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finalaAccScheduleAccTxt));
	finalaAccScheduleAccTxt.click();
	finalaAccScheduleAccTxt.sendKeys("HDFC");
	
	Thread.sleep(2000);
	
	finalaAccScheduleAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_2ndRow2ndCol));
	String actsl_2ndRow2ndCol=sl_2ndRow2ndCol.getText();
	String expsl_2ndRow2ndCol="Grand Total";
	
	System.out.println("actsl_2ndRow2ndCol  : "+actsl_2ndRow2ndCol);
	System.out.println("expsl_2ndRow2ndCol  : "+expsl_2ndRow2ndCol);
	System.out.println("*********************************************************************");
	
	
	if(actsl_2ndRow2ndCol.equalsIgnoreCase(expsl_2ndRow2ndCol) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))

	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
}


	
@FindBy(xpath="//input[@id='FOption_592_0_DefaultFilter_0']")
private static WebElement finalaAccScheduleAccTxt;
	


public boolean checkCustomizationAndPrintOptionInFinalAccSchedule() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Particulars, Code, Alias, Base, Transaction, Local, Base, Transaction, Local, Particulars, Debit, Credit, Dr (Op bal), Cr (Op bal), Dr (YTD), Cr (YTD), Debits for the period, Credits for the period, Debit (orig), Credit (orig), Dr (Op bal orig), Cr (Op bal orig), Dr (YTD orig), Cr (YTD orig), Debits for the period, Credits for the period, Debit (local), Credit (local), Dr (Op bal local), Cr (Op bal local), Dr (YTD local), Cr (YTD local), Debits for the period, Credits for the period, Percentage, Percentage (orig), Percentage (local)]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Particulars, Code, Alias, Base, Transaction, Local, Base, Transaction, Local, Debit, Credit, Dr (Op bal), Cr (Op bal), Dr (YTD), Cr (YTD), Debits for the period, Credits for the period, Debit (orig), Credit (orig), Dr (Op bal orig), Cr (Op bal orig), Dr (YTD orig), Cr (YTD orig), Debits for the period, Credits for the period, Debit (local), Credit (local), Dr (Op bal local), Cr (Op bal local), Dr (YTD local), Cr (YTD local), Debits for the period, Credits for the period, Percentage, Percentage (orig), Percentage (local)]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		
		return true;
	}
	else
	{
		getDriver().switchTo().window(openTabs.get(1)).close();
		return false;
	}
	
}
		


public boolean checkFundFlowReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
	financialsFinalAccountsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fundFlowReport));
	fundFlowReport.click();

	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report5chkbox));
	report5chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report9chkbox));
	report9chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report10chkbox));
	report10chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fundFlowCUsAccTxt));
	fundFlowCUsAccTxt.click();
	fundFlowCUsAccTxt.sendKeys("HDFC");
	
	Thread.sleep(2000);
	
	fundFlowCUsAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[HDFC, HDFC, HDFC, , 0.24, , , , 0.24, 10.00, 10.24, , 0.24, , , , 0.24, 10.00, 10.24, , 0.02, , , , 0.02, 5.35, 5.37, 100.00, 100.00, 100.00]";
	
	
	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Grand Total, , , , 0.24, , , , 0.24, 10.00, 10.24, , 0.24, , , , 0.24, 10.00, 10.24, , 0.02, , , , 0.02, 5.35, 5.37, , , ]";
	

	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))

	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
}



@FindBy(xpath="//input[@id='FOption_593_0_DefaultFilter_0']")
private static WebElement fundFlowCUsAccTxt;
    

public boolean checkCustomizationAndPrintOptionInunfFlowReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Particulars, Code, Alias, Base, Transaction, Local, Base, Transaction, Local, Particulars, Debit, Credit, Dr (Op bal), Cr (Op bal), Dr (YTD), Cr (YTD), Debits for the period, Credits for the period, Debit (orig), Credit (orig), Dr (Op bal orig), Cr (Op bal orig), Dr (YTD orig), Cr (YTD orig), Debits for the period, Credits for the period, Debit (local), Credit (local), Dr (Op bal local), Cr (Op bal local), Dr (YTD local), Cr (YTD local), Debits for the period, Credits for the period, Percentage, Percentage (orig), Percentage (local)]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Particulars, Code, Alias, Base, Transaction, Local, Base, Transaction, Local, Debit, Credit, Dr (Op bal), Cr (Op bal), Dr (YTD), Cr (YTD), Debits for the period, Credits for the period, Debit (orig), Credit (orig), Dr (Op bal orig), Cr (Op bal orig), Dr (YTD orig), Cr (YTD orig), Debits for the period, Credits for the period, Debit (local), Credit (local), Dr (Op bal local), Cr (Op bal local), Dr (YTD local), Cr (YTD local), Debits for the period, Credits for the period, Percentage, Percentage (orig), Percentage (local)]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
	
}
		


public boolean checkCashFlowReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
	financialsFinalAccountsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashFlowReport));
	cashFlowReport.click();

	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report5chkbox));
	report5chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashFlowCusAccTxt));
	cashFlowCusAccTxt.click();
	cashFlowCusAccTxt.sendKeys("Cash");
	
	Thread.sleep(2000);
	
	cashFlowCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Cash, 121-002, Cash, , , , 400.00, , 400.00, , , , , , 400.00, , 400.00, , , , , , 44.00, , 44.00, , , , , ]";
	

	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
			
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))

	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		
		return false;
	}
}


@FindBy(xpath="//input[@id='FOption_594_0_DefaultFilter_0']")
private static WebElement cashFlowCusAccTxt;
;

public boolean checkCustomizationAndPrintOptionInCashFlowReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Particulars, Code, Alias, Base, Transaction, Local, Base, Transaction, Local, Particulars, Debit, Credit, Dr (Op bal), Cr (Op bal), Dr (YTD), Cr (YTD), Debits for the period, Credits for the period, Debit (orig), Credit (orig), Dr (Op bal orig), Cr (Op bal orig), Dr (YTD orig), Cr (YTD orig), Debits for the period, Credits for the period, Debit (local), Credit (local), Dr (Op bal local), Cr (Op bal local), Dr (YTD local), Cr (YTD local), Debits for the period, Credits for the period, Percentage, Percentage (orig), Percentage (local)]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Particulars, Code, Alias, Base, Transaction, Local, Base, Transaction, Local, Debit, Credit, Dr (Op bal), Cr (Op bal), Dr (YTD), Cr (YTD), Debits for the period, Credits for the period, Debit (orig), Credit (orig), Dr (Op bal orig), Cr (Op bal orig), Dr (YTD orig), Cr (YTD orig), Debits for the period, Credits for the period, Debit (local), Credit (local), Dr (Op bal local), Cr (Op bal local), Dr (YTD local), Cr (YTD local), Debits for the period, Credits for the period, Percentage, Percentage (orig), Percentage (local)]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
	
}
		


public boolean checkCashFlowCalender() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
	financialsFinalAccountsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashFlowCalendarReport));
	cashFlowCalendarReport.click();

	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
				
	if(actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))

	{
		return true;
	}
	else
	{
		
		return false;
	}
}


		

public boolean checkCashFLowAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
	financialsFinalAccountsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashFlowAnalysisReport));
	cashFlowAnalysisReport.click();

	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report5chkbox));
	report5chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashFlowAnalysisCusAccTxt));
	cashFlowAnalysisCusAccTxt.click();
	cashFlowAnalysisCusAccTxt.sendKeys("HDFC");
	
	Thread.sleep(2000);
	
	cashFlowAnalysisCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	System.out.println(" FIlter Done");
	
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[HDFC, HDFC, HDFC, , 0.24, , , , 0.24, 10.00, 10.24, , 0.24, , , , 0.24, 10.00, 10.24, , 0.02, , , , 0.02, 5.35, 5.37, 100.00, 100.00, 100.00]";
	
	
	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Grand Total, , , , 0.24, , , , 0.24, 10.00, 10.24, , 0.24, , , , 0.24, 10.00, 10.24, , 0.02, , , , 0.02, 5.35, 5.37, , , ]";
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))

	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
}


@FindBy(xpath="//input[@id='FOption_595_0_DefaultFilter_0']")
private static WebElement cashFlowAnalysisCusAccTxt;
;

public boolean checkCustomizationAndPrintOptionInCashFlowAnalysis() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Particulars, Code, Alias, Base, Transaction, Local, Base, Transaction, Local, Particulars, Debit, Credit, Dr (Op bal), Cr (Op bal), Dr (YTD), Cr (YTD), Debits for the period, Credits for the period, Debit (orig), Credit (orig), Dr (Op bal orig), Cr (Op bal orig), Dr (YTD orig), Cr (YTD orig), Debits for the period, Credits for the period, Debit (local), Credit (local), Dr (Op bal local), Cr (Op bal local), Dr (YTD local), Cr (YTD local), Debits for the period, Credits for the period, Percentage, Percentage (orig), Percentage (local)]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Particulars, Code, Alias, Base, Transaction, Local, Base, Transaction, Local, Debit, Credit, Dr (Op bal), Cr (Op bal), Dr (YTD), Cr (YTD), Debits for the period, Credits for the period, Debit (orig), Credit (orig), Dr (Op bal orig), Cr (Op bal orig), Dr (YTD orig), Cr (YTD orig), Debits for the period, Credits for the period, Debit (local), Credit (local), Dr (Op bal local), Cr (Op bal local), Dr (YTD local), Cr (YTD local), Debits for the period, Credits for the period, Percentage, Percentage (orig), Percentage (local)]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
	
}
		
	
public boolean checkAdvanceCashFLowReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
	financialsFinalAccountsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(advanceCashFlowReport));
	advanceCashFlowReport.click();

	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Net Income, 180.16]";
	
	
	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Begining Cash Balance, 400.00]";
	
	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		report3rdRowListArray.add(data);
	}
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[Total Change in Cash, 180.16]";
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		report4thRowListArray.add(data);
	}
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[Ending Cash Balance, 580.16]";

	

	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actRow4List.equalsIgnoreCase(expRow4List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))

	{
		return true;
	}
	else
	{
		
		return false;
	}
}

	
@FindBy(xpath="//a[@id='33']")
private static WebElement budgetPlanningReport;


public boolean checkBudgetPlanningReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	//Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
	financialsFinalAccountsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(budgetPlanningReport));
	budgetPlanningReport.click();

	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	if(actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage))

	{
		
		return true;
	}
	else
	{
		
		return false;
	}
}

	
public boolean checkIncomeExpenseTrendReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
	financialsFinalAccountsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(incomeExpenseTrendsReport));
	incomeExpenseTrendsReport.click();

	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	sl_HeaderSelectChkBox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		if (i==1) 
		{
		data="CurrentMonth";	
		}
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[CurrentMonth, 1,056.85, 483.42]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Grand Total, 1,056.85, 483.42]";
	

	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
			
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))

	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
}


public boolean checkReceavibleAndPayableReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
	financialsFinalAccountsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivablePayableReport));
	receivablePayableReport.click();

	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report8chkbox));
	report8chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(recAndPayCusAccTxt));
	recAndPayCusAccTxt.click();
	recAndPayCusAccTxt.sendKeys("Vendor A");
	
	Thread.sleep(2000);
	
	recAndPayCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Vendor A, 033-001, Vendor A, 842.50, , , , 842.50, , 892.50, 50.00, 842.50, , , , 842.50, , 892.50, 50.00, 58.98, , , , 58.98, , 62.48, 3.50]";
	
	
	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=2;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[, , , 842.50, , , , 842.50, , 842.50, , 842.50, , , , 842.50, , 842.50, , 58.98, , , , 58.98, , 58.98]";
	
	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=2;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		report3rdRowListArray.add(data);
	}
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[, , 842.50, , , , 842.50, , 892.50, 50.00, 842.50, , , , 842.50, , 892.50, 50.00, 58.98, , , , 58.98, , 62.48, 3.50]";
	
	
 
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
		
			
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))

	{
		return true;
	}
	else
	{
		
		return false;
	}
}


@FindBy(xpath="//input[@id='FOption_655_0_DefaultFilter_0']")
private static WebElement recAndPayCusAccTxt;


public boolean checkCustomizationAndPrintOptionInRecevibleAndPayableReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Particulars, Code, Alias, Base, Transaction, Local, Particulars, Receivable, Payable, Receivable (Op bal), Payable (Op bal), Receivable (YTD), Payable (YTD), Receivable for the period, Payable for the period, Receivable (orig), Payable (orig), Receivable (Op bal orig), Payable (Op bal orig), Receivable (YTD orig), Payable (YTD orig), Receivable for the period, Payable for the period, Receivable (local), Payable (local), Receivable (Op bal local), Payable (Op bal local), Receivable (YTD local), Payable (YTD local), Receivable for the period, Payable for the period]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Particulars, Code, Alias, Base, Transaction, Local, Receivable, Payable, Receivable (Op bal), Payable (Op bal), Receivable (YTD), Payable (YTD), Receivable for the period, Payable for the period, Receivable (orig), Payable (orig), Receivable (Op bal orig), Payable (Op bal orig), Receivable (YTD orig), Payable (YTD orig), Receivable for the period, Payable for the period, Receivable (local), Payable (local), Receivable (Op bal local), Payable (Op bal local), Receivable (YTD local), Payable (YTD local), Receivable for the period, Payable for the period]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
	
}

	
// Receivable and Payable Analysis Reports Starts from Here
	

@FindBy(xpath="//a[@id='558']//span[contains(text(),'Receivable and Payable Analysis')]")
private static WebElement  receivableAndPayableAnalysisMenu;

@FindBy(xpath="//a[@id='605']//span[contains(text(),'Customer Detail')]")
private static WebElement  customerDetailMenu;

@FindBy(xpath="//span[contains(text(),'Customer Summary')]")
private static WebElement  customerSummaryMenu;

@FindBy(xpath="//a[@id='606']//span[contains(text(),'Vendor Detail')]")
private static WebElement  vendorDetailMenu;

@FindBy(xpath="//a[@id='608']//span[contains(text(),'Vendor Summary')]")
private static WebElement  vendorSummaryMenu;

@FindBy(xpath="//a[@id='75']//span[contains(text(),'Letter of Credit')]")
private static WebElement  letterOfCreditReport;

@FindBy(xpath="//span[contains(text(),'Release Letter of Credit')]")
private static WebElement  releaseLetterOfCreditReport;



@FindBy(xpath="//span[contains(text(),'Customer Listing of Outstanding Bills')]")
private static WebElement  customerDetailsCustomerListingOfOutstandingBillsReport;

@FindBy(xpath="//span[contains(text(),'Customer Statements')]")
private static WebElement  customerDetailsCustomerStatementsReport;

@FindBy(xpath="//span[contains(text(),'Customer Due Date Analysis')]")
private static WebElement  customerDetailsCustomerDueDateAnalysisReport;

@FindBy(xpath="//a[@id='563']//span[contains(text(),'Ageing Details')]")
private static WebElement  customerDetailsCustomerAgeingDetailsReport;

@FindBy(xpath="//span[contains(text(),'Customer Detail Ageing by Due Date')]")
private static WebElement  customerDetailsCustomerDetailAgeingByDueDateReport;

@FindBy(xpath="//a[@id='566']//span[contains(text(),'Overdue Analysis')]")
private static WebElement  customerDetailsCustomerOverdueAnalysisReport;



@FindBy(xpath="//span[contains(text(),'Customer Ageing Summary')]")
private static WebElement  customerSummaryCustomerAgeingSummaryReport;

@FindBy(xpath="//a[@id='565']//span[contains(text(),'Summary Ageing by Due Date')]")
private static WebElement  customerSummaryAgeingByDueDateReport;

@FindBy(xpath="//a[@id='567']//span[contains(text(),'Overdue Summary')]")
private static WebElement  customerSummaryCustomerOverDueSummeryReport;

@FindBy(xpath="//span[contains(text(),'Customer bill-wise summary')]")
private static WebElement  customerSummaryCustomerBillWiseSummeryReport;



@FindBy(xpath="//span[contains(text(),'Vendor Listing of Outstanding Bills')]")
private static WebElement  vendorDetailsVendorListingOfOutstandingBillsReport;

@FindBy(xpath="//span[contains(text(),'Vendor Statements')]")
private static WebElement  vendorDetailsVendorStatementsReport;

@FindBy(xpath="//span[contains(text(),'Vendor Due Date Analysis')]")
private static WebElement  vendorDetailsVendorDueDateAnalysisReport;

@FindBy(xpath="//span[contains(text(),'Vendor Ageing Details')]")
private static WebElement  vendorDetailsVendorAgeingDetailsReport;

@FindBy(xpath="//span[contains(text(),'Vendor Detail Ageing by Due Date')]")
private static WebElement  vendorDetailsVendorDetailsAgeingByDueDateReport;

@FindBy(xpath="//span[contains(text(),'Vendor Overdue Analysis')]")
private static WebElement  vendorDetailsVendorOverdueAnalysisReport;



@FindBy(xpath="//span[contains(text(),'Vendor Ageing Summary')]")
private static WebElement  vendorSummeryVendorAgeingSummaryReport;

@FindBy(xpath="//span[contains(text(),'Vendor Summary Ageing by Due Date')]")
private static WebElement  vendorSummeryVendorSummaryAgeingByDueDateReport;

@FindBy(xpath="//span[contains(text(),'Vendor Overdue Summary')]")
private static WebElement  vendorSummeryVendorOverdueSummaryReport;

@FindBy(xpath="//span[contains(text(),'Vendor bill-wise summary')]")
private static WebElement  vendorSummeryVendorBillWiseSummaryReport;



	
public boolean checkCustomerListingOfOutstandingBillsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
	customerDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerListingOfOutstandingBillsReport));
	customerDetailsCustomerListingOfOutstandingBillsReport.click();
	
	
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	sl_HeaderSelectChkBox.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report21chkbox));
	report21chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
	
    
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[OpeBal:1, DateField, Customer B, 400.00, 395.00, 395.00, DateField, 395.00, 400.00, 395.00, 395.00, 44.00, 43.65, 43.65, 122-002]";
	
	
	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[NDT50:1, DateField, Customer Update, 193.00, 193.00, 202.00, DateField, 193.00, 193.00, 193.00, 202.00, 13.51, 13.51, 30.14, CUpdate]";
	
	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		report3rdRowListArray.add(data);
	}
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[NDT50:4, DateField, Customer A, 490.00, 440.00, 238.00, DateField, 440.00, 490.00, 440.00, 238.00, 34.30, 30.80, 0.66, 122-001]";
	
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		report4thRowListArray.add(data);
	}
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[NDT50:5, DateField, Customer A, 520.00, 520.00, 758.00, DateField, 520.00, 520.00, 520.00, 758.00, 36.40, 36.40, 37.06, 122-001]";
	
	
	int report5thRowListCount = report5thRowList.size();
	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	for(int i=1;i<report5thRowListCount;i++)
	{
		String data = report5thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		report5thRowListArray.add(data);
	}
	String actRow5List = report5thRowListArray.toString();
	String expRow5List = "[SalRet:2, DateField, Customer A, 220.00, 215.00, 543.00, DateField, 215.00, 220.00, 215.00, 543.00, 15.40, 15.05, 22.01, 122-001]";
	
	int report6thRowListCount = report6thRowList.size();
	ArrayList<String> report6thRowListArray = new ArrayList<String>();
	for(int i=1;i<report6thRowListCount;i++)
	{
		String data = report6thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		report6thRowListArray.add(data);
	}
	String actRow6List = report6thRowListArray.toString();
	String expRow6List = "[NDT50:7, DateField, Customer A, 40.00, 40.00, 583.00, DateField, 40.00, 40.00, 40.00, 583.00, 2.80, 2.80, 24.81, 122-001]";
	
	int report7thRowListCount = report7thRowList.size();
	ArrayList<String> report7thRowListArray = new ArrayList<String>();
	for(int i=1;i<report7thRowListCount;i++)
	{
		String data = report7thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		report7thRowListArray.add(data);
	}
	String actRow7List = report7thRowListArray.toString();
	String expRow7List = "[NDT55:2, DateField, Customer A, 5.00, 5.00, 588.00, DateField, 5.00, 5.00, 5.00, 588.00, 0.35, 0.35, 25.16, 122-001]";
	
	int report8thRowListCount = report8thRowList.size();
	ArrayList<String> report8thRowListArray = new ArrayList<String>();
	for(int i=1;i<report8thRowListCount;i++)
	{
		String data = report8thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		report8thRowListArray.add(data);
	}
	String actRow8List = report8thRowListArray.toString();
	String expRow8List = "[NDT46:1, DateField, Customer A, 5.00, 5.00, 583.00, DateField, 5.00, 5.00, 5.00, 583.00, 0.35, 0.35, 24.81, 122-001]";
	
	int report9thRowListCount = report9thRowList.size();
	ArrayList<String> report9thRowListArray = new ArrayList<String>();
	for(int i=1;i<report9thRowListCount;i++)
	{
		String data = report9thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		report9thRowListArray.add(data);
	}
	String actRow9List = report9thRowListArray.toString();
	String expRow9List = "[Rct:2, DateField, Customer A, 10.00, 10.00, 573.00, DateField, 10.00, 10.00, 10.00, 573.00, 0.70, 0.70, 24.11, 122-001]";
	
	int report10thRowListCount = report10thRowList.size();
	ArrayList<String> report10thRowListArray = new ArrayList<String>();
	for(int i=1;i<report10thRowListCount;i++)
	{
		String data = report10thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		report10thRowListArray.add(data);
	}
	String actRow10List = report10thRowListArray.toString();
	String expRow10List = "[NDT46:4, DateField, Customer C, 5.00, 5.00, 568.00, DateField, 5.00, 5.00, 5.00, 568.00, 0.35, 0.35, 23.76, 122-003]";
	
	int report11thRowListCount = report11thRowList.size();
	ArrayList<String> report11thRowListArray = new ArrayList<String>();
	for(int i=1;i<report11thRowListCount;i++)
	{
		String data = report11thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==7) 
		{
		data="DateField";	
		}
		report11thRowListArray.add(data);
	}
	String actRow11List = report11thRowListArray.toString();
	String expRow11List = "[NDT47:1, DateField, Customer A, 5.00, 5.00, 573.00, DateField, 5.00, 5.00, 5.00, 573.00, 0.35, 0.35, 24.11, 122-001]";
	
	

	int report12thRowListCount = report12thRowList.size();
	ArrayList<String> report12thRowListArray = new ArrayList<String>();
	for(int i=1;i<report12thRowListCount;i++)
	{
		String data = report12thRowList.get(i).getText();
		report12thRowListArray.add(data);
	}
	String actRow12List = report12thRowListArray.toString();
	String expRow12List = "[Grand Total, , , 613.00, 573.00, 4,410.00, , 573.00, 613.00, 573.00, 4,410.00, 26.91, 24.11, 132.70, ]";

	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow5List  : "+actRow5List);
	System.out.println("expRow5List  : "+expRow5List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow6List  : "+actRow6List);
	System.out.println("expRow6List  : "+expRow6List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow7List  : "+actRow7List);
	System.out.println("expRow7List  : "+expRow7List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow8List  : "+actRow8List);
	System.out.println("expRow8List  : "+expRow8List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow9List  : "+actRow9List);
	System.out.println("expRow9List  : "+expRow9List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow10List  : "+actRow10List);
	System.out.println("expRow10List  : "+expRow10List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow11List  : "+actRow11List);
	System.out.println("expRow11List  : "+expRow11List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow12List  : "+actRow12List);
	System.out.println("expRow12List  : "+expRow12List);
	System.out.println("*********************************************************************");
	
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actRow4List.equalsIgnoreCase(expRow4List) &&
			actRow5List.equalsIgnoreCase(expRow5List) &&
			actRow6List.equalsIgnoreCase(expRow6List) &&
			actRow7List.equalsIgnoreCase(expRow7List) &&
			actRow8List.equalsIgnoreCase(expRow8List) &&
			actRow9List.equalsIgnoreCase(expRow9List) &&
			actRow10List.equalsIgnoreCase(expRow10List) &&
			actRow11List.equalsIgnoreCase(expRow11List) &&
			actRow12List.equalsIgnoreCase(expRow12List) )
	{
		return true;
	}
	else
	{
		return false;
	}
}

	public boolean CheckFilterAndPrintOptionnInCustomerListingOfOutstandingBillsReport() throws InterruptedException
	{
		
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
		sl_ReportPrintBtn.click();
		
		Thread.sleep(3000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	Thread.sleep(2000);
	 	
	 	getDriver().switchTo().window(openTabs.get(1)).close();
	 	
	 	getDriver().switchTo().window(openTabs.get(0));
		
		System.out.println("openTabs"+openTabs);
		System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);

		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
		report_FilterBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
		report_FilterCustomizeBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
		filterAccountExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		if (filterAccNameChkbox.isSelected()==false)
		{
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
			filterAccNameChkbox.click();
			
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
		filter_FilterOkButton.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusOutStandingBillsCusAccTxt));
		cusOutStandingBillsCusAccTxt.click();
		cusOutStandingBillsCusAccTxt.sendKeys("Customer B");
		
		Thread.sleep(2000);
		
		cusOutStandingBillsCusAccTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
		filterOkButton.click();

		Thread.sleep(2000);
		  
	    int reportVocGridListCount = reportVocGridList.size();
		
		String actreportVocGridListCount=Integer.toString(reportVocGridListCount);
		String expreportVocGridListCount="0";
		
		System.err.println("reportVocGridListCount      : "+actreportVocGridListCount);
		System.err.println("expreportVocGridListCount   : "+expreportVocGridListCount);

		if(actOpenWindowsCount==expOpenWindowsCount && actreportVocGridListCount.equalsIgnoreCase(expreportVocGridListCount))
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return true;
		}
		else
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
			report_CloseBtn.click();
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
			sl_CloseBtn.click();
			return false;
		}
	}


@FindBy(xpath="//input[@id='FOption_559_0_DefaultFilter_0']")
private static WebElement  cusOutStandingBillsCusAccTxt;


@FindBy(xpath="//input[@id='FOption_560_0_DefaultFilter_0']")
private static WebElement  cusStatementCusAccTxt;

@FindBy(xpath="//input[@id='FOption_561_0_DefaultFilter_0']")
private static WebElement  custDuDateAnalysisCusAccTxt;

@FindBy(xpath="//input[@id='FOption_563_0_DefaultFilter_0']")
private static WebElement  custAgeingDetailsAnalysisCusAccTxt;

@FindBy(xpath="//input[@id='FOption_564_0_DefaultFilter_0']")
private static WebElement  custAgeingDetailsDueDateCusAccTxt;

@FindBy(xpath="//input[@id='FOption_566_0_DefaultFilter_0']")
private static WebElement  custOverDueDateCusAccTxt;


@FindBy(xpath="//input[@id='FOption_541_0_DefaultFilter_0']")
private static WebElement  venListingOutstandBillCusAccTxt;


@FindBy(xpath="//input[@id='FOption_542_0_DefaultFilter_0']")
private static WebElement  vendorStatementCusAccTxt;


@FindBy(xpath="//input[@id='FOption_543_0_DefaultFilter_0']")
private static WebElement  vendorDueDateCusAccTxt;

@FindBy(xpath="//input[@id='FOption_545_0_DefaultFilter_0']")
private static WebElement  vendorAgeingDetailAnalysisCusAccTxt;


@FindBy(xpath="//input[@id='FOption_546_0_DefaultFilter_0']")
private static WebElement  vendorAgeingDetailByDueDateCusAccTxt;

@FindBy(xpath="//input[@id='FOption_548_0_DefaultFilter_0']")
private static WebElement  vendorOverDueCusAccTxt;

@FindBy(xpath="//input[@id='FOption_544_0_DefaultFilter_0']")
private static WebElement  vendorAheingSummaryAnalysisCusAccTxt;

@FindBy(xpath="//input[@id='FOption_547_0_DefaultFilter_0']")
private static WebElement  vendorAgeingSummaryByDueDateCusAccTxt;

@FindBy(xpath="//input[@id='FOption_549_0_DefaultFilter_0']")
private static WebElement  vendorSummeryOverDueCusAccTxt;

@FindBy(xpath="//input[@id='FOption_634_0_DefaultFilter_0']")
private static WebElement  vendorSummeryBillwiseCusAccTxt;






@FindBy(xpath="//input[@id='RITCheckbox__7']")
private static WebElement  report7chkbox;

@FindBy(xpath="//input[@id='RITCheckbox__15']")
private static WebElement  report15chkbox;

@FindBy(xpath="//input[@id='RITCheckbox__16']")
private static WebElement  report16chkbox;

@FindBy(xpath="//input[@id='RITCheckbox__21']")
private static WebElement  report21chkbox;

@FindBy(xpath="//input[@id='RITCheckbox__17']")
private static WebElement  report17chkbox;

@FindBy(xpath="//input[@id='RITCheckbox__18']")
private static WebElement  report18chkbox;



public boolean checkCustomerStatementReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
	customerDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
	customerDetailsCustomerStatementsReport.click();
	
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("CUSTOMER A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Customer A 122-001, , , , , , , , , , , , , , , ]";
	
	
	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[NDT50:4, DateField, Customer A, 490.00, , , 440.00, 440.00, 490.00, , , 440.00, 2, Indian Rupees, DateField, 122-001]";
	
	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report3rdRowListArray.add(data);
	}
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[NDT44:2, DateField, Customer A, , 50.00, , , 440.00, , 50.00, , , 2, Indian Rupees, DateField, 122-001]";
	
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report4thRowListArray.add(data);
	}
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[NDT50:5, DateField, Customer A, 520.00, , , 520.00, 960.00, 520.00, , , 520.00, 2, Indian Rupees, DateField, 122-001]";

	int report5thRowListCount = report5thRowList.size();
	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	for(int i=1;i<report5thRowListCount;i++)
	{
		String data = report5thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report5thRowListArray.add(data);
	}
	String actRow5List = report5thRowListArray.toString();
	String expRow5List = "[SalRet:2, DateField, Customer A, 220.00, , , 215.00, 745.00, 220.00, , , 215.00, 9, Indian Rupees, DateField, 122-001]";

	int report6thRowListCount = report6thRowList.size();
	ArrayList<String> report6thRowListArray = new ArrayList<String>();
	for(int i=1;i<report6thRowListCount;i++)
	{
		String data = report6thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report6thRowListArray.add(data);
	}
	String actRow6List = report6thRowListArray.toString();
	String expRow6List = "[NDT55:1, DateField, Customer A, , 5.00, , , 745.00, , 5.00, , , 9, Indian Rupees, DateField, 122-001]";
	
	int report7thRowListCount = report7thRowList.size();
	ArrayList<String> report7thRowListArray = new ArrayList<String>();
	for(int i=1;i<report7thRowListCount;i++)
	{
		String data = report7thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report7thRowListArray.add(data);
	}
	String actRow7List = report7thRowListArray.toString();
	String expRow7List = "[NDT50:7, DateField, Customer A, 40.00, , , 40.00, 785.00, 40.00, , , 40.00, 2, Indian Rupees, DateField, 122-001]";
	
	int report8thRowListCount = report8thRowList.size();
	ArrayList<String> report8thRowListArray = new ArrayList<String>();
	for(int i=1;i<report8thRowListCount;i++)
	{
		String data = report8thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report8thRowListArray.add(data);
	}
	String actRow8List = report8thRowListArray.toString();
	String expRow8List = "[NDT55:2, DateField, Customer A, 5.00, , , 5.00, 790.00, 5.00, , , 5.00, 2, Indian Rupees, DateField, 122-001]";
	
	int report9thRowListCount = report9thRowList.size();
	ArrayList<String> report9thRowListArray = new ArrayList<String>();
	for(int i=1;i<report9thRowListCount;i++)
	{
		String data = report9thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report9thRowListArray.add(data);
	}
	String actRow9List = report9thRowListArray.toString();
	String expRow9List = "[NDT46:1, DateField, Customer A, 5.00, , , 5.00, 785.00, 5.00, , , 5.00, 2, Indian Rupees, DateField, 122-001]";
	
	int report10thRowListCount = report10thRowList.size();
	ArrayList<String> report10thRowListArray = new ArrayList<String>();
	for(int i=1;i<report10thRowListCount;i++)
	{
		String data = report10thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report10thRowListArray.add(data);
	}
	String actRow10List = report10thRowListArray.toString();
	String expRow10List = "[Rct:2, DateField, Customer A, 10.00, , , 10.00, 775.00, 10.00, , , 10.00, 0, Indian Rupees, DateField, 122-001]";
	
	int report11thRowListCount = report11thRowList.size();
	ArrayList<String> report11thRowListArray = new ArrayList<String>();
	for(int i=1;i<report11thRowListCount;i++)
	{
		String data = report11thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report11thRowListArray.add(data);
	}
	String actRow11List = report11thRowListArray.toString();
	String expRow11List = "[NDT47:1, DateField, Customer A, 5.00, , , 5.00, 780.00, 5.00, , , 5.00, 2, Indian Rupees, DateField, 122-001]";
	
	
	int report12thRowListCount = report12thRowList.size();
	ArrayList<String> report12thRowListArray = new ArrayList<String>();
	for(int i=1;i<report12thRowListCount;i++)
	{
		String data = report12thRowList.get(i).getText();
		
		report12thRowListArray.add(data);
	}
	String actRow12List = report12thRowListArray.toString();
	String expRow12List = "[Total, , , 825.00, 45.00, , 780.00, 7,245.00, 825.00, 45.00, , 780.00, 32, , , ]";
	
	
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow5List  : "+actRow5List);
	System.out.println("expRow5List  : "+expRow5List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow6List  : "+actRow6List);
	System.out.println("expRow6List  : "+expRow6List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow7List  : "+actRow7List);
	System.out.println("expRow7List  : "+expRow7List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow8List  : "+actRow8List);
	System.out.println("expRow8List  : "+expRow8List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow9List  : "+actRow9List);
	System.out.println("expRow9List  : "+expRow9List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow10List  : "+actRow10List);
	System.out.println("expRow10List  : "+expRow10List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow11List  : "+actRow11List);
	System.out.println("expRow11List  : "+expRow11List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow12List  : "+actRow12List);
	System.out.println("expRow12List  : "+expRow12List);
	System.out.println("*********************************************************************");
	
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actRow4List.equalsIgnoreCase(expRow4List) &&
			actRow5List.equalsIgnoreCase(expRow5List) &&
			actRow6List.equalsIgnoreCase(expRow6List) &&
			actRow7List.equalsIgnoreCase(expRow7List) &&
			actRow8List.equalsIgnoreCase(expRow8List) &&
			actRow9List.equalsIgnoreCase(expRow9List) &&
			actRow10List.equalsIgnoreCase(expRow10List) &&
			actRow11List.equalsIgnoreCase(expRow11List) &&
			actRow12List.equalsIgnoreCase(expRow12List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}


public boolean CheckFilterAndPrintOptionnInCustomerStatements() throws InterruptedException
{
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);

	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusStatementCusAccTxt));
	cusStatementCusAccTxt.click();
	cusStatementCusAccTxt.sendKeys("Customer B");
	
	Thread.sleep(2000);
	
	cusStatementCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);
	  
    int reportVocGridListCount = reportVocGridList.size();
	
	String actreportVocGridListCount=Integer.toString(reportVocGridListCount);
	String expreportVocGridListCount="3";
	
	System.err.println("reportVocGridListCount      : "+actreportVocGridListCount);
	System.err.println("expreportVocGridListCount   : "+expreportVocGridListCount);

	if(actOpenWindowsCount==expOpenWindowsCount && actreportVocGridListCount.equalsIgnoreCase(expreportVocGridListCount))
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
}

	

public boolean checkCustomerDueDateAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
	customerDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerDueDateAnalysisReport));
	customerDetailsCustomerDueDateAnalysisReport.click();
	
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("CUSTOMER A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report21chkbox));
	report21chkbox.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Customer A 122-001, , , , , , , , , , , , , , , ]";
	
	
	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[NDT50:4, DateField, Customer A, 490.00, , , 440.00, 440.00, 490.00, , , 440.00, 2, Indian Rupees, DateField, 122-001]";
	
	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report3rdRowListArray.add(data);
	}
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[NDT44:2, DateField, Customer A, , 50.00, , , 440.00, , 50.00, , , 2, Indian Rupees, DateField, 122-001]";
	
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report4thRowListArray.add(data);
	}
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[NDT50:5, DateField, Customer A, 520.00, , , 520.00, 960.00, 520.00, , , 520.00, 2, Indian Rupees, DateField, 122-001]";

	int report5thRowListCount = report5thRowList.size();
	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	for(int i=1;i<report5thRowListCount;i++)
	{
		String data = report5thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report5thRowListArray.add(data);
	}
	String actRow5List = report5thRowListArray.toString();
	String expRow5List = "[SalRet:2, DateField, Customer A, 220.00, , , 215.00, 745.00, 220.00, , , 215.00, 9, Indian Rupees, DateField, 122-001]";

	int report6thRowListCount = report6thRowList.size();
	ArrayList<String> report6thRowListArray = new ArrayList<String>();
	for(int i=1;i<report6thRowListCount;i++)
	{
		String data = report6thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report6thRowListArray.add(data);
	}
	String actRow6List = report6thRowListArray.toString();
	String expRow6List = "[NDT55:1, DateField, Customer A, , 5.00, , , 745.00, , 5.00, , , 9, Indian Rupees, DateField, 122-001]";
	
	int report7thRowListCount = report7thRowList.size();
	ArrayList<String> report7thRowListArray = new ArrayList<String>();
	for(int i=1;i<report7thRowListCount;i++)
	{
		String data = report7thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report7thRowListArray.add(data);
	}
	String actRow7List = report7thRowListArray.toString();
	String expRow7List = "[NDT50:7, DateField, Customer A, 40.00, , , 40.00, 785.00, 40.00, , , 40.00, 2, Indian Rupees, DateField, 122-001]";
	
	int report8thRowListCount = report8thRowList.size();
	ArrayList<String> report8thRowListArray = new ArrayList<String>();
	for(int i=1;i<report8thRowListCount;i++)
	{
		String data = report8thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report8thRowListArray.add(data);
	}
	String actRow8List = report8thRowListArray.toString();
	String expRow8List = "[NDT55:2, DateField, Customer A, 5.00, , , 5.00, 790.00, 5.00, , , 5.00, 2, Indian Rupees, DateField, 122-001]";
	
	int report9thRowListCount = report9thRowList.size();
	ArrayList<String> report9thRowListArray = new ArrayList<String>();
	for(int i=1;i<report9thRowListCount;i++)
	{
		String data = report9thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report9thRowListArray.add(data);
	}
	String actRow9List = report9thRowListArray.toString();
	String expRow9List = "[NDT46:1, DateField, Customer A, 5.00, , , 5.00, 785.00, 5.00, , , 5.00, 2, Indian Rupees, DateField, 122-001]";
	
	int report10thRowListCount = report10thRowList.size();
	ArrayList<String> report10thRowListArray = new ArrayList<String>();
	for(int i=1;i<report10thRowListCount;i++)
	{
		String data = report10thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report10thRowListArray.add(data);
	}
	String actRow10List = report10thRowListArray.toString();
	String expRow10List = "[Rct:2, DateField, Customer A, 10.00, , , 10.00, 775.00, 10.00, , , 10.00, 0, Indian Rupees, DateField, 122-001]";
	
	int report11thRowListCount = report11thRowList.size();
	ArrayList<String> report11thRowListArray = new ArrayList<String>();
	for(int i=1;i<report11thRowListCount;i++)
	{
		String data = report11thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==15) 
		{
		data="DateField";	
		}
		report11thRowListArray.add(data);
	}
	String actRow11List = report11thRowListArray.toString();
	String expRow11List = "[NDT47:1, DateField, Customer A, 5.00, , , 5.00, 780.00, 5.00, , , 5.00, 2, Indian Rupees, DateField, 122-001]";
	
	
	int report12thRowListCount = report12thRowList.size();
	ArrayList<String> report12thRowListArray = new ArrayList<String>();
	for(int i=1;i<report12thRowListCount;i++)
	{
		String data = report12thRowList.get(i).getText();
		
		report12thRowListArray.add(data);
	}
	String actRow12List = report12thRowListArray.toString();
	String expRow12List = "[Total, , , 825.00, 45.00, , 780.00, 7,245.00, 825.00, 45.00, , 780.00, 32, , , ]";
	
	
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow5List  : "+actRow5List);
	System.out.println("expRow5List  : "+expRow5List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow6List  : "+actRow6List);
	System.out.println("expRow6List  : "+expRow6List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow7List  : "+actRow7List);
	System.out.println("expRow7List  : "+expRow7List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow8List  : "+actRow8List);
	System.out.println("expRow8List  : "+expRow8List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow9List  : "+actRow9List);
	System.out.println("expRow9List  : "+expRow9List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow10List  : "+actRow10List);
	System.out.println("expRow10List  : "+expRow10List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow11List  : "+actRow11List);
	System.out.println("expRow11List  : "+expRow11List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow12List  : "+actRow12List);
	System.out.println("expRow12List  : "+expRow12List);
	System.out.println("*********************************************************************");
	
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actRow4List.equalsIgnoreCase(expRow4List) &&
			actRow5List.equalsIgnoreCase(expRow5List) &&
			actRow6List.equalsIgnoreCase(expRow6List) &&
			actRow7List.equalsIgnoreCase(expRow7List) &&
			actRow8List.equalsIgnoreCase(expRow8List) &&
			actRow9List.equalsIgnoreCase(expRow9List) &&
			actRow10List.equalsIgnoreCase(expRow10List) &&
			actRow11List.equalsIgnoreCase(expRow11List) &&
			actRow12List.equalsIgnoreCase(expRow12List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}


public boolean CheckFilterAndPrintOptionnInCustomerDueDateAnalysis() throws InterruptedException
{
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);

	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custDuDateAnalysisCusAccTxt));
	custDuDateAnalysisCusAccTxt.click();
	custDuDateAnalysisCusAccTxt.sendKeys("Customer B");
	
	Thread.sleep(2000);
	
	custDuDateAnalysisCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);
	  
    int reportVocGridListCount = reportVocGridList.size();
	
	String actreportVocGridListCount=Integer.toString(reportVocGridListCount);
	String expreportVocGridListCount="3";
	
	System.err.println("reportVocGridListCount      : "+actreportVocGridListCount);
	System.err.println("expreportVocGridListCount   : "+expreportVocGridListCount);

	if(actOpenWindowsCount==expOpenWindowsCount && actreportVocGridListCount.equalsIgnoreCase(expreportVocGridListCount))
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
}



public boolean checkCustomerAgeingDetailsAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
	customerDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerAgeingDetailsReport));
	customerDetailsCustomerAgeingDetailsReport.click();
	
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("CUSTOMER A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
	report15chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
	
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Customer A 122-001, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT50:4, DateField, Customer A, 490.00, 440.00, 440.00, 2, 490.00, 440.00, , , , , , , , , , , , 440.00, 440.00, , , , , , , , , , , , 440.00, 440.00, , , , , , , , , , , , 30.80, 30.80, , , , 09-12-2020, 122-001]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[NDT50:5, DateField, Customer A, 520.00, 520.00, 960.00, 2, 520.00, 520.00, , , , , , , , , , , , 520.00, 520.00, , , , , , , , , , , , 520.00, 520.00, , , , , , , , , , , , 36.40, 36.40, , , , 09-12-2020, 122-001]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[SalRet:2, DateField, Customer A, 220.00, 215.00, 745.00, 9, 220.00, 215.00, , , , , , , , , , , , 215.00, 215.00, , , , , , , , , , , , 215.00, 215.00, , , , , , , , , , , , 15.05, 15.05, , , , 02-12-2020, 122-001]";

		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[NDT50:7, DateField, Customer A, 40.00, 40.00, 785.00, 2, 40.00, 40.00, , , , , , , , , , , , 40.00, 40.00, , , , , , , , , , , , 40.00, 40.00, , , , , , , , , , , , 2.80, 2.80, , , , 09-12-2020, 122-001]";

		int report6thRowListCount = report6thRowList.size();
		ArrayList<String> report6thRowListArray = new ArrayList<String>();
		for(int i=1;i<report6thRowListCount;i++)
		{
			String data = report6thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report6thRowListArray.add(data);
		}
		String actRow6List = report6thRowListArray.toString();
		String expRow6List = "[NDT55:2, DateField, Customer A, 5.00, 5.00, 790.00, 2, 5.00, 5.00, , , , , , , , , , , , 5.00, 5.00, , , , , , , , , , , , 5.00, 5.00, , , , , , , , , , , , 0.35, 0.35, , , , 09-12-2020, 122-001]";
		
		int report7thRowListCount = report7thRowList.size();
		ArrayList<String> report7thRowListArray = new ArrayList<String>();
		for(int i=1;i<report7thRowListCount;i++)
		{
			String data = report7thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report7thRowListArray.add(data);
		}
		String actRow7List = report7thRowListArray.toString();
		String expRow7List = "[NDT46:1, DateField, Customer A, 5.00, 5.00, 785.00, 2, 5.00, 5.00, , , , , , , , , , , , 5.00, 5.00, , , , , , , , , , , , 5.00, 5.00, , , , , , , , , , , , 0.35, 0.35, , , , 09-12-2020, 122-001]";
		
		int report8thRowListCount = report8thRowList.size();
		ArrayList<String> report8thRowListArray = new ArrayList<String>();
		for(int i=1;i<report8thRowListCount;i++)
		{
			String data = report8thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report8thRowListArray.add(data);
		}
		String actRow8List = report8thRowListArray.toString();
		String expRow8List = "[Rct:2, DateField, Customer A, 10.00, 10.00, 775.00, 0, 10.00, 10.00, , , , , , , , , , , , 10.00, 10.00, , , , , , , , , , , , 10.00, 10.00, , , , , , , , , , , , 0.70, 0.70, , , , 28-12-2020, 122-001]";
		
		int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
		for(int i=1;i<report9thRowListCount;i++)
		{
			String data = report9thRowList.get(i).getText();
			if (i==2) 
			{
			data="DateField";	
			}
			report9thRowListArray.add(data);
		}
		String actRow9List = report9thRowListArray.toString();
		String expRow9List = "[NDT47:1, DateField, Customer A, 5.00, 5.00, 780.00, 2, 5.00, 5.00, , , , , , , , , , , , 5.00, 5.00, , , , , , , , , , , , 5.00, 5.00, , , , , , , , , , , , 0.35, 0.35, , , , 09-12-2020, 122-001]";
		
		int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
		for(int i=1;i<report10thRowListCount;i++)
		{
			String data = report10thRowList.get(i).getText();
			
			report10thRowListArray.add(data);
		}
		String actRow10List = report10thRowListArray.toString();
		String expRow10List = "[Total, , , 825.00, 780.00, 6,060.00, 21, 825.00, 780.00, , , , , , , , , , , , 780.00, 780.00, , , , , , , , , , , , 780.00, 780.00, , , , , , , , , , , , 54.60, 54.60, , , , , ]";
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow4List  : "+actRow4List);
		System.out.println("expRow4List  : "+expRow4List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow5List  : "+actRow5List);
		System.out.println("expRow5List  : "+expRow5List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow6List  : "+actRow6List);
		System.out.println("expRow6List  : "+expRow6List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow7List  : "+actRow7List);
		System.out.println("expRow7List  : "+expRow7List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow8List  : "+actRow8List);
		System.out.println("expRow8List  : "+expRow8List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow9List  : "+actRow9List);
		System.out.println("expRow9List  : "+expRow9List);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow10List  : "+actRow10List);
		System.out.println("expRow10List  : "+expRow10List);
		System.out.println("*********************************************************************");
		
		
		
		if(actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) &&
				actRow4List.equalsIgnoreCase(expRow4List) &&
				actRow5List.equalsIgnoreCase(expRow5List) &&
				actRow6List.equalsIgnoreCase(expRow6List) &&
				actRow7List.equalsIgnoreCase(expRow7List) &&
				actRow8List.equalsIgnoreCase(expRow8List) &&
				actRow9List.equalsIgnoreCase(expRow9List) &&
				actRow10List.equalsIgnoreCase(expRow10List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckFilterAndPrintOptionnInCustomerAgeingDetailsAnalysis() throws InterruptedException
{
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);

	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custAgeingDetailsAnalysisCusAccTxt));
	custAgeingDetailsAnalysisCusAccTxt.click();
	custAgeingDetailsAnalysisCusAccTxt.sendKeys("Customer B");
	
	Thread.sleep(2000);
	
	custAgeingDetailsAnalysisCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);
	  
    int reportVocGridListCount = reportVocGridList.size();
	
	String actreportVocGridListCount=Integer.toString(reportVocGridListCount);
	String expreportVocGridListCount="3";
	
	System.err.println("reportVocGridListCount      : "+actreportVocGridListCount);
	System.err.println("expreportVocGridListCount   : "+expreportVocGridListCount);

	if(actOpenWindowsCount==expOpenWindowsCount && actreportVocGridListCount.equalsIgnoreCase(expreportVocGridListCount))
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
}



public boolean checkCustomerAgeingDetailsByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
	customerDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerDetailAgeingByDueDateReport));
	customerDetailsCustomerDetailAgeingByDueDateReport.click();
	
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("CUSTOMER A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
	report15chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(2500);
    	
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Customer A 122-001, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ]";
	
	
	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==37) 
		{
		data="DateField";	
		}
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[NDT50:4, DateField, Customer A, 490.00, 440.00, 440.00, 5, 490.00, 440.00, , 440.00, , , , , , , , , , , , , , 440.00, , , 440.00, , , , , , , , , DateField, ]";
	
	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==37) 
		{
		data="DateField";	
		}
		report3rdRowListArray.add(data);
	}
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[NDT50:5, DateField, Customer A, 520.00, 520.00, 960.00, 5, 520.00, 520.00, , 520.00, , , , , , , , , , , , , , 520.00, , , 520.00, , , , , , , , , DateField, ]";
	
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==37) 
		{
		data="DateField";	
		}
		report4thRowListArray.add(data);
	}
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[SalRet:2, DateField, Customer A, 220.00, 215.00, 745.00, 12, 220.00, 215.00, , 215.00, , , , , , , , , , , , , , 215.00, , , 215.00, , , , , , , , , DateField, ]";

	int report5thRowListCount = report5thRowList.size();
	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	for(int i=1;i<report5thRowListCount;i++)
	{
		String data = report5thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==37) 
		{
		data="DateField";	
		}
		report5thRowListArray.add(data);
	}
	String actRow5List = report5thRowListArray.toString();
	String expRow5List = "[NDT50:7, DateField, Customer A, 40.00, 40.00, 785.00, 5, 40.00, 40.00, , 40.00, , , , , , , , , , , , , , 40.00, , , 40.00, , , , , , , , , DateField, ]";

	int report6thRowListCount = report6thRowList.size();
	ArrayList<String> report6thRowListArray = new ArrayList<String>();
	for(int i=1;i<report6thRowListCount;i++)
	{
		String data = report6thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==37) 
		{
		data="DateField";	
		}
		report6thRowListArray.add(data);
	}
	String actRow6List = report6thRowListArray.toString();
	String expRow6List = "[NDT55:2, DateField, Customer A, 5.00, 5.00, 790.00, 5, 5.00, 5.00, , 5.00, , , , , , , , , , , , , , 5.00, , , 5.00, , , , , , , , , DateField, ]";
	
	int report7thRowListCount = report7thRowList.size();
	ArrayList<String> report7thRowListArray = new ArrayList<String>();
	for(int i=1;i<report7thRowListCount;i++)
	{
		String data = report7thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==37) 
		{
		data="DateField";	
		}
		report7thRowListArray.add(data);
	}
	String actRow7List = report7thRowListArray.toString();
	String expRow7List = "[NDT46:1, DateField, Customer A, 5.00, 5.00, 785.00, 5, 5.00, 5.00, , 5.00, , , , , , , , , , , , , , 5.00, , , 5.00, , , , , , , , , DateField, ]";
	
	
	int report8thRowListCount = report8thRowList.size();
	ArrayList<String> report8thRowListArray = new ArrayList<String>();
	for(int i=1;i<report8thRowListCount;i++)
	{
		String data = report8thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==37) 
		{
		data="DateField";	
		}
		report8thRowListArray.add(data);
	}
	String actRow8List = report8thRowListArray.toString();
	String expRow8List = "[NDT47:1, DateField, Customer A, 5.00, 5.00, 790.00, 5, 5.00, 5.00, , 5.00, , , , , , , , , , , , , , 5.00, , , 5.00, , , , , , , , , DateField, ]";
	
	int report9thRowListCount = report9thRowList.size();
	ArrayList<String> report9thRowListArray = new ArrayList<String>();
	for(int i=1;i<report9thRowListCount;i++)
	{
		String data = report9thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		if (i==37) 
		{
		data="DateField";	
		}
		report9thRowListArray.add(data);
	}
	String actRow9List = report9thRowListArray.toString();
	String expRow9List = "[Total, DateField, , 835.00, 790.00, 5,295.00, 42, 835.00, 790.00, , 790.00, , , , , , , , , , , , , , 790.00, , , 790.00, , , , , , , , , DateField, 0]";
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow5List  : "+actRow5List);
	System.out.println("expRow5List  : "+expRow5List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow6List  : "+actRow6List);
	System.out.println("expRow6List  : "+expRow6List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow7List  : "+actRow7List);
	System.out.println("expRow7List  : "+expRow7List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow8List  : "+actRow8List);
	System.out.println("expRow8List  : "+expRow8List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow9List  : "+actRow9List);
	System.out.println("expRow9List  : "+expRow9List);
	System.out.println("*********************************************************************");
			
	
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actRow4List.equalsIgnoreCase(expRow4List) &&
			actRow5List.equalsIgnoreCase(expRow5List) &&
			actRow6List.equalsIgnoreCase(expRow6List) &&
			actRow7List.equalsIgnoreCase(expRow7List) &&
			actRow8List.equalsIgnoreCase(expRow8List) &&
			actRow9List.equalsIgnoreCase(expRow9List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckFilterAndPrintOptionnInCustomerAgeingDetailsDueDate() throws InterruptedException
{
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);

	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custAgeingDetailsDueDateCusAccTxt));
	custAgeingDetailsDueDateCusAccTxt.click();
	custAgeingDetailsDueDateCusAccTxt.sendKeys("Customer B");
	

	Thread.sleep(2000);
	
	custAgeingDetailsDueDateCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);
	  
    int reportVocGridListCount = reportVocGridList.size();
	
	String actreportVocGridListCount=Integer.toString(reportVocGridListCount);
	String expreportVocGridListCount="3";
	
	System.err.println("reportVocGridListCount      : "+actreportVocGridListCount);
	System.err.println("expreportVocGridListCount   : "+expreportVocGridListCount);

	if(actOpenWindowsCount==expOpenWindowsCount && actreportVocGridListCount.equalsIgnoreCase(expreportVocGridListCount))
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
}







public boolean checkCustomerOverDueAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
	customerDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerOverdueAnalysisReport));
	customerDetailsCustomerOverdueAnalysisReport.click();
	
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("CUSTOMER A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();

	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(2500);
    	
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Customer A 122-001, , , , , , , , , , , , , , , , , ]";
	
	
	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[SalRet:2, DateField, Customer A, 220.00, 215.00, 7, 215.00, , 215.00, , , , , , , , 215.00, 122-001]";
	
	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		
		report3rdRowListArray.add(data);
	}
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[NDT50:5, DateField, Customer A, 520.00, 520.00, 5, 305.00, , 520.00, , , , , , , , 520.00, 122-001]";
	
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		report4thRowListArray.add(data);
	}
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[NDT50:7, DateField, Customer A, 40.00, 40.00, 5, 345.00, , 40.00, , , , , , , , 40.00, 122-001]";

	int report5thRowListCount = report5thRowList.size();
	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	for(int i=1;i<report5thRowListCount;i++)
	{
		String data = report5thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		report5thRowListArray.add(data);
	}
	String actRow5List = report5thRowListArray.toString();
	String expRow5List = "[NDT55:2, DateField, Customer A, 5.00, 5.00, 5, 350.00, , 5.00, , , , , , , , 5.00, 122-001]";

	int report6thRowListCount = report6thRowList.size();
	ArrayList<String> report6thRowListArray = new ArrayList<String>();
	for(int i=1;i<report6thRowListCount;i++)
	{
		String data = report6thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		report6thRowListArray.add(data);
	}
	String actRow6List = report6thRowListArray.toString();
	String expRow6List = "[NDT46:1, DateField, Customer A, 5.00, 5.00, 5, 345.00, , 5.00, , , , , , , , 5.00, 122-001]";
	
	int report7thRowListCount = report7thRowList.size();
	ArrayList<String> report7thRowListArray = new ArrayList<String>();
	for(int i=1;i<report7thRowListCount;i++)
	{
		String data = report7thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		report7thRowListArray.add(data);
	}
	String actRow7List = report7thRowListArray.toString();
	String expRow7List = "[NDT47:1, DateField, Customer A, 5.00, 5.00, 5, 350.00, , 5.00, , , , , , , , 5.00, 122-001]";
	
	int report8thRowListCount = report8thRowList.size();
	ArrayList<String> report8thRowListArray = new ArrayList<String>();
	for(int i=1;i<report8thRowListCount;i++)
	{
		String data = report8thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		report8thRowListArray.add(data);
	}
	String actRow8List = report8thRowListArray.toString();
	String expRow8List = "[NDT50:4, DateField, Customer A, 490.00, 440.00, 0, 790.00, , 440.00, , , , , , , , 440.00, 122-001]";
	
	int report9thRowListCount = report9thRowList.size();
	ArrayList<String> report9thRowListArray = new ArrayList<String>();
	for(int i=1;i<report9thRowListCount;i++)
	{
		String data = report9thRowList.get(i).getText();
		if (i==2) 
		{
		data="DateField";	
		}
		report9thRowListArray.add(data);
	}
	String actRow9List = report9thRowListArray.toString();
	String expRow9List = "[Rct:2, DateField, Customer A, 10.00, 10.00, 0, 780.00, 10.00, , , , , , , , , 10.00, 122-001]";
	
	int report10thRowListCount = report10thRowList.size();
	ArrayList<String> report10thRowListArray = new ArrayList<String>();
	for(int i=1;i<report10thRowListCount;i++)
	{
		String data = report10thRowList.get(i).getText();
		report10thRowListArray.add(data);
	}
	String actRow10List = report10thRowListArray.toString();
	String expRow10List = "[Total, , , 825.00, 780.00, 32, 3,050.00, 10.00, 790.00, , , , , , , , 780.00, ]";
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow5List  : "+actRow5List);
	System.out.println("expRow5List  : "+expRow5List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow6List  : "+actRow6List);
	System.out.println("expRow6List  : "+expRow6List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow7List  : "+actRow7List);
	System.out.println("expRow7List  : "+expRow7List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow8List  : "+actRow8List);
	System.out.println("expRow8List  : "+expRow8List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow9List  : "+actRow9List);
	System.out.println("expRow9List  : "+expRow9List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow10List  : "+actRow10List);
	System.out.println("expRow10List  : "+expRow10List);
	System.out.println("*********************************************************************");
			
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actRow4List.equalsIgnoreCase(expRow4List) &&
			actRow5List.equalsIgnoreCase(expRow5List) &&
			actRow6List.equalsIgnoreCase(expRow6List) &&
			actRow7List.equalsIgnoreCase(expRow7List) &&
			actRow8List.equalsIgnoreCase(expRow8List) &&
			actRow9List.equalsIgnoreCase(expRow9List) &&
			actRow10List.equalsIgnoreCase(expRow10List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckFilterAndPrintOptionnInCustomerOverDueAnalysis() throws InterruptedException
{
	
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(2000);
	
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);

	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(custOverDueDateCusAccTxt));
	custOverDueDateCusAccTxt.click();
	custOverDueDateCusAccTxt.sendKeys("Customer B");
	Thread.sleep(2000);
	
	custOverDueDateCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);
	  
    int reportVocGridListCount = reportVocGridList.size();
	
	String actreportVocGridListCount=Integer.toString(reportVocGridListCount);
	String expreportVocGridListCount="0";
	
	System.err.println("reportVocGridListCount      : "+actreportVocGridListCount);
	System.err.println("expreportVocGridListCount   : "+expreportVocGridListCount);

	if(actOpenWindowsCount==expOpenWindowsCount && actreportVocGridListCount.equalsIgnoreCase(expreportVocGridListCount))
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
}

@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[11]")
private static List<WebElement> stockLedgerHometableItemNamesList;

@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[8]/div/label/input")
private static List<WebElement> stockLedgerHometableItemChkboxList;



public boolean checkcustomerSummaryCustomerAgeingSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
	customerSummaryMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryCustomerAgeingSummaryReport));
	customerSummaryCustomerAgeingSummaryReport.click();
	
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("CUSTOMER A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
	report15chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
    	
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Customer A, 780.00, 780.00, , , 780.00, , , , , , , , , , , , 780.00, 780.00, , , , , , , , , , , , 780.00, 780.00, , , , , , , , , , , , 57.75, 57.75, , , , , , , 780.00, 780.00, , , 780.00, 57.75, 57.75, , , 57.75, , , , , 122-001]";
	
	
	int reportsRow2ListCount = report2ndRowList.size();
	ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow2ListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		reportsRow2ListArray.add(data);
	}
	String actRow2List = reportsRow2ListArray.toString();
	String expRow2List = "[Grand Total, 780.00, 780.00, , , 780.00, , , , , , , , , , , , 780.00, 780.00, , , , , , , , , , , , 780.00, 780.00, , , , , , , , , , , , 57.75, 57.75, , , , , , , 780.00, 780.00, , , 780.00, 57.75, 57.75, , , 57.75, , , , , ]";
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
		
	if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && 
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnIncustomerSummaryCustomerAgeingSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusAccField));
	getAction().doubleClick(cusAccField).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Account, Balance Amount, Ledger Balance Amount, On Account Amount, Unadjusted Amount, Net Amount, Base, Transaction, Local, PDC Amount, PDC Base Amount, PDC Local Amount, Other Base, Other Transaction, Other Local, Balance Transaction Amount, Ledger Balance Transaction Amount, OnAccount Transaction Amount, Unadjusted Transaction Amount, Net Amount Transaction, Balance Local Amount, Ledger Balance Local Amount, OnAccount Local Amount, Unadjusted Local Amount, Net Amount Local, FutureAdjustments Base Amount, FutureAdjustments Tran Amount, FutureAdjustments Local Amount, ForexExchange Base Amount, Account Code, Account, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-360 Days, >360 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-360 Days, >360 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-360 Days, >360 Days, Total amount]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Account, Balance Amount, Ledger Balance Amount, On Account Amount, Unadjusted Amount, Net Amount, Base, Transaction, Local, PDC Amount, PDC Base Amount, PDC Local Amount, Others Base, Others Transaction, Others Local, Balance Transaction Amount, Ledger Balance Transaction Amount, OnAccount Transaction Amount, Unadjusted Transaction Amount, Net Amount Transaction, Balance Local Amount, Ledger Balance Local Amount, OnAccount Local Amount, Unadjusted Local Amount, Net Amount Local, FutureAdjustments Base Amount, FutureAdjustments Tran Amount, FutureAdjustments Local Amount, ForexExchange Base Amount, Account Code, Oct, Sep, Aug, Jul, Jun, May, Apr, Mar, Feb, Jan, Dec, Nov, Total amount, Oct, Sep, Aug, Jul, Jun, May, Apr, Mar, Feb, Jan, Dec, Nov, Total amount, Oct, Sep, Aug, Jul, Jun, May, Apr, Mar, Feb, Jan, Dec, Nov, Total amount]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		
		return true;
	}
	else
	{
		
		return false;
	}

}




public boolean checkcustomerSummaryAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
	customerSummaryMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryAgeingByDueDateReport));
	customerSummaryAgeingByDueDateReport.click();
	
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("CUSTOMER A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
	report15chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
    	
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Customer A, 790.00, 790.00, , , 790.00, , , , , , , , , , , , 790.00, 790.00, , , , , , , , , , , , 790.00, 790.00, , , , , , , , , , , , 58.45, 58.45, , , , , , , 790.00, 790.00, , , 790.00, 58.45, 58.45, , , 58.45, , , , , 122-001]";
	
	int reportsRow2ListCount = report2ndRowList.size();
	ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow2ListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		reportsRow2ListArray.add(data);
	}
	String actRow2List = reportsRow2ListArray.toString();
	String expRow2List = "[Grand Total, 790.00, 790.00, , , 790.00, , , , , , , , , , , , 790.00, 790.00, , , , , , , , , , , , 790.00, 790.00, , , , , , , , , , , , 58.45, 58.45, , , , , , , 790.00, 790.00, , , 790.00, 58.45, 58.45, , , 58.45, , , , , ]";
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
		
	if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnIncustomerSummaryAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusAccField));
	getAction().doubleClick(cusAccField).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Account, Balance Amount, Ledger Balance Amount, On Account Amount, Unadjusted Amount, Net Amount, Base, Transaction, Local, PDC Amount, PDC Base Amount, PDC Local Amount, Other Base, Other Transaction, Other Local, Balance Transaction Amount, Ledger Balance Transaction Amount, OnAccount Transaction Amount, Unadjusted Transaction Amount, Net Amount Transaction, Balance Local Amount, Ledger Balance Local Amount, OnAccount Local Amount, Unadjusted Local Amount, Net Amount Local, FutureAdjustments Base Amount, FutureAdjustments Tran Amount, FutureAdjustments Local Amount, ForexExchange Base Amount, Account Code, Account, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-360 Days, >360 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-360 Days, >360 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-360 Days, >360 Days, Total amount]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Account, Balance Amount, Ledger Balance Amount, On Account Amount, Unadjusted Amount, Net Amount, Base, Transaction, Local, PDC Amount, PDC Base Amount, PDC Local Amount, Others Base, Others Transaction, Others Local, Balance Transaction Amount, Ledger Balance Transaction Amount, OnAccount Transaction Amount, Unadjusted Transaction Amount, Net Amount Transaction, Balance Local Amount, Ledger Balance Local Amount, OnAccount Local Amount, Unadjusted Local Amount, Net Amount Local, FutureAdjustments Base Amount, FutureAdjustments Tran Amount, FutureAdjustments Local Amount, ForexExchange Base Amount, Account Code, Oct, Sep, Aug, Jul, Jun, May, Apr, Mar, Feb, Jan, Dec, Nov, Total amount, Oct, Sep, Aug, Jul, Jun, May, Apr, Mar, Feb, Jan, Dec, Nov, Total amount, Oct, Sep, Aug, Jul, Jun, May, Apr, Mar, Feb, Jan, Dec, Nov, Total amount]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}

}





public boolean checkcustomerSummaryCustomerOverDueSummeryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
	customerSummaryMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryCustomerOverDueSummeryReport));
	customerSummaryCustomerOverDueSummeryReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("CUSTOMER A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
    	
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Customer A, 825.00, 780.00, 10.00, 790.00, , , , , , , , , 780.00, , 555.00, 555.00, 122-001]";
	
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Grand Total, 825.00, 780.00, 10.00, 790.00, , , , , , , , , 780.00, , 555.00, 555.00, ]";
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
		
	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnIncustomerSummaryCustomerOverDueSummeryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusAccField));
	getAction().doubleClick(cusAccField).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Account, Invoice Amount, Balance Amount, Undue Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Future Adjusted Amount, Net Amount, ForexExchangeAmount, Unadjusted Amount, Unadjusted Base Amount, Account Code, Account]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Account, Invoice Amount, Balance Amount, Undue Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Future Adjusted Amount, Net Amount, ForexExchangeAmount, Unadjusted Amount, Unadjusted Base Amount, Account Code]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}

}




public boolean checkcustomerSummaryCustomerBillWiseSummeryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
	customerSummaryMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryCustomerBillWiseSummeryReport));
	customerSummaryCustomerBillWiseSummeryReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("CUSTOMER A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report21chkbox));
	report21chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
    	
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Customer A, 1,010.00, 230.00, 122-001]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Grand Total, 1,010.00, 230.00, ]";
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
		
	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnIncustomerSummaryCustomerBillWiseSummeryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Particulars, Receivable Amount, Payable Amount, Account Code, Particulars]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Particulars, Receivable Amount, Payable Amount, Account Code]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	Thread.sleep(1000);
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}

}


@FindBy(xpath="//select[@id='RITCombobox__2']")
private static WebElement osr_includeBillsDropdown;

@FindBy(xpath="//*[@id='45']/a[2]")
private static WebElement tradePayable;



public boolean checkVendorListingOfOutstandingBillsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
	vendorDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorListingOfOutstandingBillsReport));
	vendorDetailsVendorListingOfOutstandingBillsReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradePayable));
	tradePayable.click();
	
	Thread.sleep(2000);
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("VENDOR A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report21chkbox));
	report21chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	

	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    Thread.sleep(1500);
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==7) 
		{
		data="dateField";	
		}
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[NDT45:1, dateField, Vendor A, 100.00, 100.00, 100.00, dateField, 100.00, 100.00, 100.00, 100.00, 7.00, 7.00, 7.00, 033-001]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==7) 
		{
		data="dateField";	
		}
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[NDT45:4, dateField, Vendor A, 100.00, 100.00, 200.00, dateField, 100.00, 100.00, 100.00, 200.00, 7.00, 7.00, 14.00, 033-001]";
	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==7) 
		{
		data="dateField";	
		}
		report3rdRowListArray.add(data);
	}
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[PurRet:2, dateField, Vendor A, 642.50, 642.50, 842.50, dateField, 642.50, 642.50, 642.50, 842.50, 44.98, 44.98, 58.98, 033-001]";
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		report4thRowListArray.add(data);
	}
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[Grand Total, , , 842.50, 842.50, 1,142.50, , 842.50, 842.50, 842.50, 1,142.50, 58.98, 58.98, 79.98, ]";

	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
		
		
	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&actRow4List.equalsIgnoreCase(expRow4List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnInVendorListingOfOutstandingBillsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Voucher, Date, Particulars, Invoice Amount, Balance Amount, Cumulative Balance, Due Date, Net Amount, Invoice Tran Amount, Balance Tran Amount, Cumulative Tran Balance, Invoice Local Amount, Balance Local Amount, Cumulative Local Balance, Account Code, Particulars]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Voucher, Date, Particulars, Invoice Amount, Balance Amount, Cumulative Balance, Due Date, Net Amount, Invoice Tran Amount, Balance Tran Amount, Cumulative Tran Balance, Invoice Local Amount, Balance Local Amount, Cumulative Local Balance, Account Code]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		return true;
	}
	else
	{
		return false;
	}

}


public boolean checkFilterOptionInVendorListingOfOutstandingBillsReport() throws InterruptedException
{
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(venListingOutstandBillCusAccTxt));
	venListingOutstandBillCusAccTxt.click();
	venListingOutstandBillCusAccTxt.sendKeys("Vendor a");
	Thread.sleep(2000);
	
	venListingOutstandBillCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);

	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==7) 
		{
		data="dateField";	
		}
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[OpeBal:1, dateField, Vendor A, 1,500.00, 1,500.00, 1,500.00, dateField, 1,500.00, 30.00, 30.00, 30.00, 166.50, 166.50, 166.50, 033-001]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Grand Total, , , 1,500.00, 1,500.00, 1,500.00, , 1,500.00, 30.00, 30.00, 30.00, 166.50, 166.50, 166.50, ]";

	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List))
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
		report_CloseBtn.click();
		//Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_CloseBtn));
		sl_CloseBtn.click();
		return false;
	}
}

	


public boolean checkvendorDetailsVendorStatementsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
{
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
	vendorDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorStatementsReport));
	vendorDetailsVendorStatementsReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradePayable));
	tradePayable.click();
	
	Thread.sleep(2000);
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("VENDOR B"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	

	Thread.sleep(2000);

	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Vendor B 033-002, , , , , , , , , , , , , , , ]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report2ndRowListArray.add(data);
	}
	
	    String s1 = sl_2ndRow3rdCol.getText(); 
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
	    String s2 = f.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s1);
	    System.out.println("CurrentDate String : "+s2);
	    
	    Date AccountingDate = f.parse(s1);
	    Date PresentDate = f.parse(s2);

	    Calendar day1 = Calendar.getInstance();
	    Calendar day2 = Calendar.getInstance(); 
	    day1.setTime(AccountingDate);
	    day2.setTime(PresentDate);

	    int daysBetween = day2.get(Calendar.DAY_OF_YEAR) - day1.get(Calendar.DAY_OF_YEAR);      


	System.err.println(daysBetween);
	
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[NDT48:SU/AME/TEXT1, dateField, Vendor B, 2,036.50, , , 2,026.50, 2,026.50, 2,036.50, , , 2,026.50, "+daysBetween+", Indian Rupees, dateField, 033-002]";

	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report3rdRowListArray.add(data);
	}
	
	    String s3 = sl_3rdRow3rdCol.getText(); 
		Calendar cal1=Calendar.getInstance();
		SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
	    String s4 = f1.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s3);
	    System.out.println("CurrentDate String : "+s4);
	    
	    Date AccountingDate1 = f1.parse(s3); 
	    Date PresentDate1 = f1.parse(s4);


	    Calendar day3 = Calendar.getInstance();
	    Calendar day4 = Calendar.getInstance(); 
	    day3.setTime(AccountingDate);
	    day4.setTime(PresentDate);

	    int daysBetween1 = day4.get(Calendar.DAY_OF_YEAR) - day3.get(Calendar.DAY_OF_YEAR);      


	System.err.println(daysBetween1);
	
	
	
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[NDT51:1, dateField, Vendor B, , 10.00, , , 2,026.50, , 10.00, , , "+daysBetween1+", Indian Rupees, dateField, 033-002]";
	
	
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report4thRowListArray.add(data);
	}
	
	    String s5 = sl_4thRow3rdCol.getText(); 
		Calendar cal2=Calendar.getInstance();
		SimpleDateFormat f2 = new SimpleDateFormat("dd-MM-yyyy");
	    String s6 = f2.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s5);
	    System.out.println("CurrentDate String : "+s6);
	    
	    Date AccountingDate2 = f2.parse(s5); 
	    Date PresentDate2 = f2.parse(s6);


	    Calendar day5 = Calendar.getInstance();
	    Calendar day6 = Calendar.getInstance(); 
	    day5.setTime(AccountingDate);
	    day6.setTime(PresentDate);

	    int daysBetween2 = day6.get(Calendar.DAY_OF_YEAR) - day5.get(Calendar.DAY_OF_YEAR);      


	System.err.println(daysBetween2);
	
	
	
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[NDT45:1, dateField, Vendor B, 100.00, , , 50.00, 1,976.50, 100.00, , , 50.00, "+daysBetween2+", Indian Rupees, dateField, 033-002]";
	
	
	
	int report5thRowListCount = report5thRowList.size();
	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	for(int i=1;i<report5thRowListCount;i++)
	{
		String data = report5thRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report5thRowListArray.add(data);
	}
	
	    String s7 = sl_5thRow3rdCol.getText(); 
		Calendar cal3=Calendar.getInstance();
		SimpleDateFormat f3 = new SimpleDateFormat("dd-MM-yyyy");
	    String s8 = f3.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s7);
	    System.out.println("CurrentDate String : "+s8);
	    
	    Date AccountingDate3 = f3.parse(s7); 
	    Date PresentDate3 = f3.parse(s8);


	    Calendar day7 = Calendar.getInstance();
	    Calendar day8 = Calendar.getInstance(); 
	    day7.setTime(AccountingDate);
	    day8.setTime(PresentDate);

	    int daysBetween3 = day8.get(Calendar.DAY_OF_YEAR) - day7.get(Calendar.DAY_OF_YEAR);      


	System.err.println(daysBetween3);
	
	
	
	String actRow5List = report5thRowListArray.toString();
	String expRow5List = "[NDT44:1, dateField, Vendor B, , 50.00, , , 1,976.50, , 50.00, , , "+daysBetween3+", Indian Rupees, dateField, 033-002]";
	
	
	
	int report6thRowListCount = report6thRowList.size();
	ArrayList<String> report6thRowListArray = new ArrayList<String>();
	for(int i=1;i<report6thRowListCount;i++)
	{
		String data = report6thRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report6thRowListArray.add(data);
	}
	
	    String s9 = sl_6thRow3rdCol.getText(); 
		Calendar cal4=Calendar.getInstance();
		SimpleDateFormat f4 = new SimpleDateFormat("dd-MM-yyyy");
	    String s10 = f4.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s9);
	    System.out.println("CurrentDate String : "+s10);
	    
	    Date AccountingDate4 = f4.parse(s9); 
	    Date PresentDate4 = f4.parse(s10);


	    Calendar day9 = Calendar.getInstance();
	    Calendar day10 = Calendar.getInstance(); 
	    day9.setTime(AccountingDate);
	    day10.setTime(PresentDate);

	    int daysBetweenplus = day10.get(Calendar.DAY_OF_YEAR) - day9.get(Calendar.DAY_OF_YEAR);      
	   
	    int daysBetween4 = daysBetweenplus+5;
	    
	System.err.println(daysBetween4);
	
	
	
	String actRow6List = report6thRowListArray.toString();
	String expRow6List = "[NDT52:1, dateField, Vendor B, 10.00, , , 10.00, 1,986.50, 10.00, , , 10.00, "+daysBetween4+", Indian Rupees, dateField, 033-002]";
	
	
	
	
	int report7thRowListCount = report7thRowList.size();
	ArrayList<String> report7thRowListArray = new ArrayList<String>();
	for(int i=1;i<report7thRowListCount;i++)
	{
		String data = report7thRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report7thRowListArray.add(data);
	}
	
	    String s11 = sl_7thRow3rdCol.getText(); 
		Calendar cal5=Calendar.getInstance();
		SimpleDateFormat f5 = new SimpleDateFormat("dd-MM-yyyy");
	    String s12 = f4.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s11);
	    System.out.println("CurrentDate String : "+s12);
	    
	    Date AccountingDate5 = f5.parse(s11); 
	    Date PresentDate5 = f5.parse(s12);


	    Calendar day11 = Calendar.getInstance();
	    Calendar day12 = Calendar.getInstance(); 
	    day11.setTime(AccountingDate);
	    day12.setTime(PresentDate);

	    int daysBetweenplus1 = day12.get(Calendar.DAY_OF_YEAR) - day11.get(Calendar.DAY_OF_YEAR);      

	    int daysBetween5 = daysBetweenplus1+2;
	    
	System.err.println(daysBetween5);
	
	
	String actRow7List = report7thRowListArray.toString();
	String expRow7List = "[NDT47:3, dateField, Vendor B, 5.00, , , 5.00, 1,981.50, 5.00, , , 5.00, "+daysBetween5+", Indian Rupees, dateField, 033-002]";
	
	
	
	
	int report8thRowListCount = report8thRowList.size();
	ArrayList<String> report8thRowListArray = new ArrayList<String>();
	for(int i=2;i<report8thRowListCount;i++)
	{
		String data = report8thRowList.get(i).getText();
		report8thRowListArray.add(data);
	}
	
	int TotalDays = daysBetween+daysBetween1+daysBetween2+daysBetween3+daysBetween4+daysBetween5;
	
	String actRow8List = report8thRowListArray.toString();
	String expRow8List = "[, , 1,941.50, 40.00, , 1,981.50, 11,974.00, 1,941.50, 40.00, , 1,981.50, "+TotalDays+", , , ]";
	
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow5List  : "+actRow5List);
	System.out.println("expRow5List  : "+expRow5List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow6List  : "+actRow6List);
	System.out.println("expRow6List  : "+expRow6List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow7List  : "+actRow7List);
	System.out.println("expRow7List  : "+expRow7List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow8List  : "+actRow8List);
	System.out.println("expRow8List  : "+expRow8List);
	System.out.println("*********************************************************************");
	
	
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actRow4List.equalsIgnoreCase(expRow4List) &&
			actRow5List.equalsIgnoreCase(expRow5List) &&
			actRow6List.equalsIgnoreCase(expRow6List) &&
			actRow7List.equalsIgnoreCase(expRow7List) &&
			actRow8List.equalsIgnoreCase(expRow8List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnInvendorDetailsVendorStatementsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Voucher, Date, Particulars, Invoice Amount, Adjustment, Unadjusted, Balance, Cumulative Balance, Transaction, Delay in payment, Currency, Due Date, Account Code, Particulars, Invoice Amount, Adjustment, Unadjusted, Balance]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Voucher, Date, Particulars, Invoice Amount, Adjustment, Unadjusted, Balance, Cumulative Balance, Transaction, Delay in payment, Currency, Due Date, Account Code, Invoice Amount, Adjustment, Unadjusted, Balance]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		return true;
	}
	else
	{
		return false;
	}

}





public boolean checkvendorDetailsVendorDueDateAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
{
	/*
	
	
	
	//Thread.sleep(2000);
*/	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
	vendorDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorDueDateAnalysisReport));
	vendorDetailsVendorDueDateAnalysisReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradePayable));
	tradePayable.click();
	
	Thread.sleep(2000);
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("VENDOR B"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report21chkbox));
	report21chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
    
	Thread.sleep(2000);

	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Vendor B 033-002, , , , , , , , , , , , , , , ]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report2ndRowListArray.add(data);
	}
	
	    String s1 = sl_2ndRow3rdCol.getText(); 
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
	    String s2 = f.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s1);
	    System.out.println("CurrentDate String : "+s2);
	    
	    Date AccountingDate = f.parse(s1);
	    Date PresentDate = f.parse(s2);

	    Calendar day1 = Calendar.getInstance();
	    Calendar day2 = Calendar.getInstance(); 
	    day1.setTime(AccountingDate);
	    day2.setTime(PresentDate);

	    int daysBetween = day2.get(Calendar.DAY_OF_YEAR) - day1.get(Calendar.DAY_OF_YEAR);      


	System.err.println(daysBetween);
	
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[NDT48:SU/AME/TEXT1, dateField, Vendor B, 2,036.50, , , 2,026.50, 2,026.50, 2,036.50, , , 2,026.50, "+daysBetween+", Indian Rupees, dateField, 033-002]";

	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report3rdRowListArray.add(data);
	}
	
	    String s3 = sl_3rdRow3rdCol.getText(); 
		Calendar cal1=Calendar.getInstance();
		SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
	    String s4 = f1.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s3);
	    System.out.println("CurrentDate String : "+s4);
	    
	    Date AccountingDate1 = f1.parse(s3); 
	    Date PresentDate1 = f1.parse(s4);


	    Calendar day3 = Calendar.getInstance();
	    Calendar day4 = Calendar.getInstance(); 
	    day3.setTime(AccountingDate);
	    day4.setTime(PresentDate);

	    int daysBetween1 = day4.get(Calendar.DAY_OF_YEAR) - day3.get(Calendar.DAY_OF_YEAR);      


	System.err.println(daysBetween1);
	
	
	
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[NDT51:1, dateField, Vendor B, , 10.00, , , 2,026.50, , 10.00, , , "+daysBetween1+", Indian Rupees, dateField, 033-002]";
	
	
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report4thRowListArray.add(data);
	}
	
	    String s5 = sl_4thRow3rdCol.getText(); 
		Calendar cal2=Calendar.getInstance();
		SimpleDateFormat f2 = new SimpleDateFormat("dd-MM-yyyy");
	    String s6 = f2.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s5);
	    System.out.println("CurrentDate String : "+s6);
	    
	    Date AccountingDate2 = f2.parse(s5); 
	    Date PresentDate2 = f2.parse(s6);


	    Calendar day5 = Calendar.getInstance();
	    Calendar day6 = Calendar.getInstance(); 
	    day5.setTime(AccountingDate);
	    day6.setTime(PresentDate);

	    int daysBetween2 = day6.get(Calendar.DAY_OF_YEAR) - day5.get(Calendar.DAY_OF_YEAR);      


	System.err.println(daysBetween2);
	
	
	
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[NDT45:1, dateField, Vendor B, 100.00, , , 50.00, 1,976.50, 100.00, , , 50.00, "+daysBetween2+", Indian Rupees, dateField, 033-002]";
	
	
	
	int report5thRowListCount = report5thRowList.size();
	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	for(int i=1;i<report5thRowListCount;i++)
	{
		String data = report5thRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report5thRowListArray.add(data);
	}
	
	    String s7 = sl_5thRow3rdCol.getText(); 
		Calendar cal3=Calendar.getInstance();
		SimpleDateFormat f3 = new SimpleDateFormat("dd-MM-yyyy");
	    String s8 = f3.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s7);
	    System.out.println("CurrentDate String : "+s8);
	    
	    Date AccountingDate3 = f3.parse(s7); 
	    Date PresentDate3 = f3.parse(s8);


	    Calendar day7 = Calendar.getInstance();
	    Calendar day8 = Calendar.getInstance(); 
	    day7.setTime(AccountingDate);
	    day8.setTime(PresentDate);

	    int daysBetween3 = day8.get(Calendar.DAY_OF_YEAR) - day7.get(Calendar.DAY_OF_YEAR);      


	System.err.println(daysBetween3);
	
	
	
	String actRow5List = report5thRowListArray.toString();
	String expRow5List = "[NDT44:1, dateField, Vendor B, , 50.00, , , 1,976.50, , 50.00, , , "+daysBetween3+", Indian Rupees, dateField, 033-002]";
	
	
	
	int report6thRowListCount = report6thRowList.size();
	ArrayList<String> report6thRowListArray = new ArrayList<String>();
	for(int i=1;i<report6thRowListCount;i++)
	{
		String data = report6thRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report6thRowListArray.add(data);
	}
	
	    String s9 = sl_6thRow3rdCol.getText(); 
		Calendar cal4=Calendar.getInstance();
		SimpleDateFormat f4 = new SimpleDateFormat("dd-MM-yyyy");
	    String s10 = f4.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s9);
	    System.out.println("CurrentDate String : "+s10);
	    
	    Date AccountingDate4 = f4.parse(s9); 
	    Date PresentDate4 = f4.parse(s10);


	    Calendar day9 = Calendar.getInstance();
	    Calendar day10 = Calendar.getInstance(); 
	    day9.setTime(AccountingDate);
	    day10.setTime(PresentDate);

	    int daysBetweenplus = day10.get(Calendar.DAY_OF_YEAR) - day9.get(Calendar.DAY_OF_YEAR);      
	   
	    int daysBetween4 = daysBetweenplus+5;
	    
	System.err.println(daysBetween4);
	
	
	
	String actRow6List = report6thRowListArray.toString();
	String expRow6List = "[NDT52:1, dateField, Vendor B, 10.00, , , 10.00, 1,986.50, 10.00, , , 10.00, "+daysBetween4+", Indian Rupees, dateField, 033-002]";
	
	
	
	
	int report7thRowListCount = report7thRowList.size();
	ArrayList<String> report7thRowListArray = new ArrayList<String>();
	for(int i=1;i<report7thRowListCount;i++)
	{
		String data = report7thRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==15) 
		{
		data="dateField";	
		}
		report7thRowListArray.add(data);
	}
	
	    String s11 = sl_7thRow3rdCol.getText(); 
		Calendar cal5=Calendar.getInstance();
		SimpleDateFormat f5 = new SimpleDateFormat("dd-MM-yyyy");
	    String s12 = f4.format(cal.getTime());
	    
	    System.out.println("AccountingDate String : "+s11);
	    System.out.println("CurrentDate String : "+s12);
	    
	    Date AccountingDate5 = f5.parse(s11); 
	    Date PresentDate5 = f5.parse(s12);


	    Calendar day11 = Calendar.getInstance();
	    Calendar day12 = Calendar.getInstance(); 
	    day11.setTime(AccountingDate);
	    day12.setTime(PresentDate);

	    int daysBetweenplus1 = day12.get(Calendar.DAY_OF_YEAR) - day11.get(Calendar.DAY_OF_YEAR);      

	    int daysBetween5 = daysBetweenplus1+2;
	    
	System.err.println(daysBetween5);
	
	
	String actRow7List = report7thRowListArray.toString();
	String expRow7List = "[NDT47:3, dateField, Vendor B, 5.00, , , 5.00, 1,981.50, 5.00, , , 5.00, "+daysBetween5+", Indian Rupees, dateField, 033-002]";
	
	
	
	
	int report8thRowListCount = report8thRowList.size();
	ArrayList<String> report8thRowListArray = new ArrayList<String>();
	for(int i=2;i<report8thRowListCount;i++)
	{
		String data = report8thRowList.get(i).getText();
		report8thRowListArray.add(data);
	}
	
	int TotalDays = daysBetween+daysBetween1+daysBetween2+daysBetween3+daysBetween4+daysBetween5;
	
	String actRow8List = report8thRowListArray.toString();
	String expRow8List = "[, , 1,941.50, 40.00, , 1,981.50, 11,974.00, 1,941.50, 40.00, , 1,981.50, "+TotalDays+", , , ]";
	
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow5List  : "+actRow5List);
	System.out.println("expRow5List  : "+expRow5List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow6List  : "+actRow6List);
	System.out.println("expRow6List  : "+expRow6List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow7List  : "+actRow7List);
	System.out.println("expRow7List  : "+expRow7List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow8List  : "+actRow8List);
	System.out.println("expRow8List  : "+expRow8List);
	System.out.println("*********************************************************************");
	
	
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actRow4List.equalsIgnoreCase(expRow4List) &&
			actRow5List.equalsIgnoreCase(expRow5List) &&
			actRow6List.equalsIgnoreCase(expRow6List) &&
			actRow7List.equalsIgnoreCase(expRow7List) &&
			actRow8List.equalsIgnoreCase(expRow8List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnInvendorDetailsVendorDueDateAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Voucher, Date, Particulars, Invoice Amount, Adjustment, Unadjusted, Balance, Cumulative Balance, Transaction, Delay in payment, Currency, Due Date, Account Code, Particulars, Invoice Amount, Adjustment, Unadjusted, Balance]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Voucher, Date, Particulars, Invoice Amount, Adjustment, Unadjusted, Balance, Cumulative Balance, Transaction, Delay in payment, Currency, Due Date, Account Code, Invoice Amount, Adjustment, Unadjusted, Balance]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		return true;
	}
	else
	{
		return false;
	}

}


public boolean checkVendorDetailsVendorAgeingDetailsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
	vendorDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorAgeingDetailsReport));
	vendorDetailsVendorAgeingDetailsReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradePayable));
	tradePayable.click();
	
	Thread.sleep(2000);
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("VENDOR A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
	report15chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report17chkbox));
	report17chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report18chkbox));
	report18chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	

	Thread.sleep(2000);

	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Vendor A 033-001, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==52) 
		{
		data="dateField";	
		}
		report2ndRowListArray.add(data);
	}
	
	String s1 = sl_2ndRow3rdCol.getText(); 
	Calendar cal=Calendar.getInstance();
	SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
    String s2 = f.format(cal.getTime());
    
    System.out.println("AccountingDate String : "+s1);
    System.out.println("CurrentDate String : "+s2);
    
    Date AccountingDate = f.parse(s1); 
    Date PresentDate = f.parse(s2);


    Calendar day1 = Calendar.getInstance();
    Calendar day2 = Calendar.getInstance(); 
    day1.setTime(AccountingDate);
    day2.setTime(PresentDate);

    int daysBetween = day2.get(Calendar.DAY_OF_YEAR) - day1.get(Calendar.DAY_OF_YEAR);      


    System.err.println(daysBetween);
	
	
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[NDT45:1, dateField, Vendor A, 100.00, 100.00, 100.00, "+daysBetween+", 100.00, 100.00, , , , , , , , , , , , 100.00, 100.00, , , , , , , , , , , , 100.00, 100.00, , , , , , , , , , , , 7.00, 7.00, , , , dateField, 033-001]";

	
	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==52) 
		{
		data="dateField";	
		}
		report3rdRowListArray.add(data);
	}
	
	String s3 = sl_3rdRow3rdCol.getText(); 
	Calendar cal1=Calendar.getInstance();
	SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
    String s4 = f.format(cal.getTime());
    
    System.out.println("AccountingDate String : "+s3);
    System.out.println("CurrentDate String : "+s4);
    
    Date AccountingDate1 = f.parse(s3); 
    Date PresentDate1 = f.parse(s4);


    Calendar day3 = Calendar.getInstance();
    Calendar day4 = Calendar.getInstance(); 
    day3.setTime(AccountingDate1);
    day4.setTime(PresentDate1);

    int daysBetween1 = day4.get(Calendar.DAY_OF_YEAR) - day3.get(Calendar.DAY_OF_YEAR);      


    System.err.println(daysBetween1);
	
	
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[NDT45:4, dateField, Vendor A, 100.00, 100.00, 200.00, "+daysBetween1+", 100.00, 100.00, , , , , , , , , , , , 100.00, 100.00, , , , , , , , , , , , 100.00, 100.00, , , , , , , , , , , , 7.00, 7.00, , , , dateField, 033-001]";
	
	
	
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==52) 
		{
		data="dateField";	
		}
		report4thRowListArray.add(data);
	}
	
	String s5 = sl_4thRow3rdCol.getText(); 
	Calendar cal2=Calendar.getInstance();
	SimpleDateFormat f2 = new SimpleDateFormat("dd-MM-yyyy");
    String s6 = f.format(cal.getTime());
    
    System.out.println("AccountingDate String : "+s5);
    System.out.println("CurrentDate String : "+s4);
    
    Date AccountingDate2 = f.parse(s5); 
    Date PresentDate2 = f.parse(s6);


    Calendar day5 = Calendar.getInstance();
    Calendar day6 = Calendar.getInstance(); 
    day5.setTime(AccountingDate2);
    day6.setTime(PresentDate2);

    int daysBetweenplus = day6.get(Calendar.DAY_OF_YEAR) - day5.get(Calendar.DAY_OF_YEAR);      

    int daysBetween2 = daysBetweenplus+7;
    
    System.err.println(daysBetween2);
	
	
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[PurRet:2, dateField, Vendor A, 642.50, 642.50, 842.50, "+daysBetween2+", 642.50, 642.50, , , , , , , , , , , , 642.50, 642.50, , , , , , , , , , , , 642.50, 642.50, , , , , , , , , , , , 44.98, 44.98, , , , dateField, 033-001]";
	
	
	
	int report5thRowListCount = report5thRowList.size();
	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	for(int i=1;i<report5thRowListCount;i++)
	{
		String data = report5thRowList.get(i).getText();
		report5thRowListArray.add(data);
	}
	
	int TotalDays = daysBetween+daysBetween1+daysBetween2;
	
	String actRow5List = report5thRowListArray.toString();
	String expRow5List = "[Total, , , 842.50, 842.50, 1,142.50, "+TotalDays+", 842.50, 842.50, , , , , , , , , , , , 842.50, 842.50, , , , , , , , , , , , 842.50, 842.50, , , , , , , , , , , , 58.98, 58.98, , , , , ]";
	
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow5List  : "+actRow5List);
	System.out.println("expRow5List  : "+expRow5List);
	System.out.println("*********************************************************************");
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actRow4List.equalsIgnoreCase(expRow4List) &&
			actRow5List.equalsIgnoreCase(expRow5List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnInVendorDetailsVendorAgeingDetailsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Voucher, Date, Particulars, Invoice Amount, Balance Amount, Cumulative Balance, Delay in payment, Transaction, Base, Transaction, Local, Due Date, Account Code, Particulars, Invoice Amount, Balance Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total Invoice Amt, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total Amount]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Voucher, Date, Particulars, Invoice Amount, Balance Amount, Cumulative Balance, Delay in payment, Transaction, Base, Transaction, Local, Due Date, Account Code, Invoice Amount, Balance Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total Invoice Amt, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total Amount]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		return true;
	}
	else
	{
		return false;
	}

}




public boolean checkVendorDetailsVendorDetailsAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
	vendorDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorDetailsAgeingByDueDateReport));
	vendorDetailsVendorDetailsAgeingByDueDateReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tradePayable));
	tradePayable.click();
	
	Thread.sleep(2000);
	
	int rowcount=stockLedgerHometableRowCount.size();
	
	System.out.println(rowcount);
	
	for (int i = 0; i < rowcount; i++) 
	{
		String actName = stockLedgerHometableItemNamesList.get(i).getText();
		
		System.out.println(actName);
		
		if(actName.equalsIgnoreCase("VENDOR A"))
		{
			stockLedgerHometableItemChkboxList.get(i).click();
			break;
		}
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
	report15chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
	Thread.sleep(2000);

	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Vendor A 033-001, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==37) 
		{
		data="dateField";	
		}
		report2ndRowListArray.add(data);
	}
	
	String s1 = sl_2ndRow3rdCol.getText(); 
	Calendar cal=Calendar.getInstance();
	SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
    String s2 = f.format(cal.getTime());
    
    System.out.println("AccountingDate String : "+s1);
    System.out.println("CurrentDate String : "+s2);
    
    Date AccountingDate = f.parse(s1); 
    Date PresentDate = f.parse(s2);


    Calendar day1 = Calendar.getInstance();
    Calendar day2 = Calendar.getInstance(); 
    day1.setTime(AccountingDate);
    day2.setTime(PresentDate);

    int daysBetween = day2.get(Calendar.DAY_OF_YEAR) - day1.get(Calendar.DAY_OF_YEAR);      


    System.err.println(daysBetween);
	
	
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[NDT45:1, dateField, Vendor A, 100.00, 100.00, 100.00, "+daysBetween+", 100.00, 100.00, , 100.00, , , , , , , , , , , , , , 100.00, , , 100.00, , , , , , , , , dateField, ]";

	
	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=1;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==37) 
		{
		data="dateField";	
		}
		report3rdRowListArray.add(data);
	}
	
	String s3 = sl_3rdRow3rdCol.getText(); 
	Calendar cal1=Calendar.getInstance();
	SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
    String s4 = f.format(cal.getTime());
    
    System.out.println("AccountingDate String : "+s3);
    System.out.println("CurrentDate String : "+s4);
    
    Date AccountingDate1 = f.parse(s3); 
    Date PresentDate1 = f.parse(s4);


    Calendar day3 = Calendar.getInstance();
    Calendar day4 = Calendar.getInstance(); 
    day3.setTime(AccountingDate1);
    day4.setTime(PresentDate1);

    int daysBetween1 = day4.get(Calendar.DAY_OF_YEAR) - day3.get(Calendar.DAY_OF_YEAR);      


    System.err.println(daysBetween1);
	
	
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[NDT45:4, dateField, Vendor A, 100.00, 100.00, 200.00, "+daysBetween1+", 100.00, 100.00, , 100.00, , , , , , , , , , , , , , 100.00, , , 100.00, , , , , , , , , dateField, ]";
	
	
	int report4thRowListCount = report4thRowList.size();
	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	for(int i=1;i<report4thRowListCount;i++)
	{
		String data = report4thRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		if (i==37) 
		{
		data="dateField";	
		}
		report4thRowListArray.add(data);
	}
	
	String s5 = sl_4thRow3rdCol.getText(); 
	Calendar cal2=Calendar.getInstance();
	SimpleDateFormat f2 = new SimpleDateFormat("dd-MM-yyyy");
    String s6 = f.format(cal.getTime());
    
    System.out.println("AccountingDate String : "+s5);
    System.out.println("CurrentDate String : "+s4);
    
    Date AccountingDate2 = f.parse(s5); 
    Date PresentDate2 = f.parse(s6);


    Calendar day5 = Calendar.getInstance();
    Calendar day6 = Calendar.getInstance(); 
    day5.setTime(AccountingDate2);
    day6.setTime(PresentDate2);

    int daysBetweenplus = day6.get(Calendar.DAY_OF_YEAR) - day5.get(Calendar.DAY_OF_YEAR);      

    int daysBetween2 = daysBetweenplus+7;
    
    System.err.println(daysBetween2);
	
	
	String actRow4List = report4thRowListArray.toString();
	String expRow4List = "[PurRet:2, dateField, Vendor A, 642.50, 642.50, 842.50, "+daysBetween2+", 642.50, 642.50, , 642.50, , , , , , , , , , , , , , 642.50, , , 642.50, , , , , , , , , dateField, ]";

	
	int report5thRowListCount = report5thRowList.size();
	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	for(int i=1;i<report5thRowListCount;i++)
	{
		String data = report5thRowList.get(i).getText();
		report5thRowListArray.add(data);
	}
	
	int TotalDays = daysBetween+daysBetween1+daysBetween2;
	
	String actRow5List = report5thRowListArray.toString();
	String expRow5List = "[Total, , , 842.50, 842.50, 1,142.50, "+TotalDays+", 842.50, 842.50, , 842.50, , , , , , , , , , , , , , 842.50, , , 842.50, , , , , , , , , , 0]";
	
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow5List  : "+actRow5List);
	System.out.println("expRow5List  : "+expRow5List);
	System.out.println("*********************************************************************");
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&
			actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actRow4List.equalsIgnoreCase(expRow4List) &&
			actRow5List.equalsIgnoreCase(expRow5List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnInvendorDetailsVendorDetailsAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Voucher, Due date, Particulars, Invoice Amount, Balance Amount, Cumulative Balance, Delay in payment, Transaction, Base, Transaction, Local, Due Date, Account Code, Particulars, Invoice Amount, Balance Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-360 Days, >360 Days, Total Invoice Amt, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-360 Days, >360 Days, Total Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-360 Days, >360 Days, Total Amount]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Voucher, Due date, Particulars, Invoice Amount, Balance Amount, Cumulative Balance, Delay in payment, Transaction, Base, Transaction, Local, Base, Transaction, Local, Due Date, Account Code, Invoice Amount, Balance Amount, Oct, Sep, Aug, Jul, Jun, May, Apr, Mar, Feb, Jan, Dec, Nov, Total amount, Oct, Sep, Aug, Jul, Jun, May, Apr, Mar, Feb, Jan, Dec, Nov, Total amount, Oct, Sep, Aug, Jul, Jun, May, Apr, Mar, Feb, Jan, Dec, Nov, Total amount, Others Base, Others Transaction, Others Local]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		return true;
	}
	else
	{
		return false;
	}

}




public boolean checkVendorDetailsVendorOverdueAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
{
	
	
	
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
	vendorDetailMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailsVendorOverdueAnalysisReport));
	vendorDetailsVendorOverdueAnalysisReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	sl_HeaderSelectChkBox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorOverDueCusAccTxt));
	vendorOverDueCusAccTxt.click();
	vendorOverDueCusAccTxt.sendKeys("Vendor a");
	Thread.sleep(2000);
	
	vendorOverDueCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);

	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Vendor A 033-001, , , , , , , , , , , , , , , , , ]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		if (i==2) 
		{
		data="dateField";	
		}
		
		report2ndRowListArray.add(data);
	
	}
	
	String s1 = sl_2ndRow3rdCol.getText(); 
	Calendar cal=Calendar.getInstance();
	SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    String s2 = f.format(cal.getTime());
    
    System.out.println("AccountingDate String : "+s1);
    System.out.println("CurrentDate String : "+s2);
    
    Date AccountingDate = f.parse(s1); 
    Date PresentDate = f.parse(s2);


    Calendar day1 = Calendar.getInstance();
    Calendar day2 = Calendar.getInstance(); 
    day1.setTime(AccountingDate);
    day2.setTime(PresentDate);

    int daysBetween = day2.get(Calendar.DAY_OF_YEAR) - day1.get(Calendar.DAY_OF_YEAR);      


    System.err.println(daysBetween);
	
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[OpeBal:1, dateField, Vendor A, 1,500.00, 1,500.00, "+daysBetween+", 1,500.00, , , , , , , , , 1,500.00, 1,500.00, 033-001]";

	
	int report3rdRowListCount = report3rdRowList.size();
	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	for(int i=2;i<report3rdRowListCount;i++)
	{
		String data = report3rdRowList.get(i).getText();
		report3rdRowListArray.add(data);
	}
	String actRow3List = report3rdRowListArray.toString();
	String expRow3List = "[, , 1,500.00, 1,500.00, "+daysBetween+", 1,500.00, , , , , , , , , 1,500.00, 1,500.00, ]";
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) &&
			actRow3List.equalsIgnoreCase(expRow3List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnInVendorDetailsVendorOverdueAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Voucher, Due date, Particulars, Invoice Amount, Balance Amount, Delay in payment, Cumulative Balance, Base, Account Code, Particulars, UnDue Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total Amount]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Voucher, Due date, Particulars, Invoice Amount, Balance Amount, Delay in payment, Cumulative Balance, Base, Account Code, UnDue Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total Amount]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		return true;
	}
	else
	{
		return false;
	}

}


	


//Vendor Summary  

public boolean checkVendorSummeryVendorAgeingSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
	vendorSummaryMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummeryVendorAgeingSummaryReport));
	vendorSummeryVendorAgeingSummaryReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	sl_HeaderSelectChkBox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
	report15chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
	report_CloseBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	if (report7chkbox.isSelected()==true &&report15chkbox.isSelected()==true &&report16chkbox.isSelected()==true )
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
		report7chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
		report15chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
		report16chkbox.click();
		
			
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAheingSummaryAnalysisCusAccTxt));
	vendorAheingSummaryAnalysisCusAccTxt.click();
	vendorAheingSummaryAnalysisCusAccTxt.sendKeys("Vendor a");
	Thread.sleep(2000);
	
	vendorAheingSummaryAnalysisCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);

	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Vendor A, 1,500.00, 1,500.00, , , 1,500.00, , , , , , , , 1,500.00, 1,500.00, , , , , , , , 30.00, 30.00, , , , , , , , 166.50, 166.50, , , , , , , 30.00, 30.00, , , 30.00, 166.50, 166.50, , , 166.50, , , , , 033-001]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Grand Total, 1,500.00, 1,500.00, , , 1,500.00, , , , , , , , 1,500.00, 1,500.00, , , , , , , , 30.00, 30.00, , , , , , , , 166.50, 166.50, , , , , , , 30.00, 30.00, , , 30.00, 166.50, 166.50, , , 166.50, , , , , ]";

	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnInVendorSummeryVendorAgeingSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusAccField));
	getAction().doubleClick(cusAccField).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Account, Balance Amount, Ledger Balance Amount, On Account Amount, Unadjusted Amount, Net Amount, Base, Transaction, Local, PDC Amount, PDC Base Amount, PDC Local Amount, Other Base, Other Transaction, Other Local, Balance Transaction Amount, Ledger Balance Transaction Amount, OnAccount Transaction Amount, Unadjusted Transaction Amount, Net Amount Transaction, Balance Local Amount, Ledger Balance Local Amount, OnAccount Local Amount, Unadjusted Local Amount, Net Amount Local, FutureAdjustments Base Amount, FutureAdjustments Tran Amount, FutureAdjustments Local Amount, ForexExchange Base Amount, Account Code, Account, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Account, Balance Amount, Ledger Balance Amount, On Account Amount, Unadjusted Amount, Net Amount, Base, Transaction, Local, PDC Amount, PDC Base Amount, PDC Local Amount, Other Base, Other Transaction, Other Local, Balance Transaction Amount, Ledger Balance Transaction Amount, OnAccount Transaction Amount, Unadjusted Transaction Amount, Net Amount Transaction, Balance Local Amount, Ledger Balance Local Amount, OnAccount Local Amount, Unadjusted Local Amount, Net Amount Local, FutureAdjustments Base Amount, FutureAdjustments Tran Amount, FutureAdjustments Local Amount, ForexExchange Base Amount, Account Code, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		return true;
	}
	else
	{
		return false;
	}

}




public boolean checkVendorSummeryVendorSummaryAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
	vendorSummaryMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummeryVendorSummaryAgeingByDueDateReport));
	vendorSummeryVendorSummaryAgeingByDueDateReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	sl_HeaderSelectChkBox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
	report15chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
	report_CloseBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	if (report7chkbox.isSelected()==true &&report15chkbox.isSelected()==true &&report16chkbox.isSelected()==true )
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
		report7chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
		report15chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
		report16chkbox.click();
		
			
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAgeingSummaryByDueDateCusAccTxt));
	vendorAgeingSummaryByDueDateCusAccTxt.click();
	vendorAgeingSummaryByDueDateCusAccTxt.sendKeys("Vendor a");
	Thread.sleep(2000);
	
	vendorAgeingSummaryByDueDateCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);

	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Vendor A, 1,500.00, 1,500.00, , , 1,500.00, , , , , , , , 1,500.00, 1,500.00, , , , , , , , 30.00, 30.00, , , , , , , , 166.50, 166.50, , , , , , , 30.00, 30.00, , , 30.00, 166.50, 166.50, , , 166.50, , , , , 033-001]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Grand Total, 1,500.00, 1,500.00, , , 1,500.00, , , , , , , , 1,500.00, 1,500.00, , , , , , , , 30.00, 30.00, , , , , , , , 166.50, 166.50, , , , , , , 30.00, 30.00, , , 30.00, 166.50, 166.50, , , 166.50, , , , , ]";

	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnInVendorSummeryVendorSummaryAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusAccField));
	getAction().doubleClick(cusAccField).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Account, Balance Amount, Ledger Balance Amount, On Account Amount, Unadjusted Amount, Net Amount, Base, Transaction, Local, PDC Amount, PDC Base Amount, PDC Local Amount, Other Base, Other Transaction, Other Local, Balance Transaction Amount, Ledger Balance Transaction Amount, OnAccount Transaction Amount, Unadjusted Transaction Amount, Net Amount Transaction, Balance Local Amount, Ledger Balance Local Amount, OnAccount Local Amount, Unadjusted Local Amount, Net Amount Local, FutureAdjustments Base Amount, FutureAdjustments Tran Amount, FutureAdjustments Local Amount, ForexExchange Base Amount, Account Code, Account, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Account, Balance Amount, Ledger Balance Amount, On Account Amount, Unadjusted Amount, Net Amount, Base, Transaction, Local, PDC Amount, PDC Base Amount, PDC Local Amount, Other Base, Other Transaction, Other Local, Balance Transaction Amount, Ledger Balance Transaction Amount, OnAccount Transaction Amount, Unadjusted Transaction Amount, Net Amount Transaction, Balance Local Amount, Ledger Balance Local Amount, OnAccount Local Amount, Unadjusted Local Amount, Net Amount Local, FutureAdjustments Base Amount, FutureAdjustments Tran Amount, FutureAdjustments Local Amount, ForexExchange Base Amount, Account Code, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Total amount]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	//Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		return true;
	}
	else
	{
		return false;
	}

}





public boolean checkVendorSummeryVendorOverdueSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	
	
	
	//Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
	vendorSummaryMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummeryVendorOverdueSummaryReport));
	vendorSummeryVendorOverdueSummaryReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	sl_HeaderSelectChkBox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	report7chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	report16chkbox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
	report_CloseBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	if (report7chkbox.isSelected()==true &&report16chkbox.isSelected()==true )
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
		report7chkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
		report16chkbox.click();
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummeryOverDueCusAccTxt));
	vendorSummeryOverDueCusAccTxt.click();
	vendorSummeryOverDueCusAccTxt.sendKeys("Vendor a");
	Thread.sleep(2000);
	
	vendorSummeryOverDueCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);

	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Vendor A, 1,500.00, 1,500.00, , , , , , , , , 1,500.00, , 1,500.00, , , , 033-001]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Grand Total, 1,500.00, 1,500.00, , , , , , , , , 1,500.00, , 1,500.00, , , , ]";

	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnInVendorSummeryVendorOverdueSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusAccField));
	getAction().doubleClick(cusAccField).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Account, Invoice Amount, Balance Amount, Undue Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Future Adjusted Amount, Net Amount, ForexExchangeAmount, Unadjusted Amount, Unadjusted Base Amount, Account Code, Account]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Account, Invoice Amount, Balance Amount, Undue Amount, 0-30 Days, 31-60 Days, 61-90 Days, 91-120 Days, 121-150 Days, 151-180 Days, 181-210 Days, > 210 Days, Future Adjusted Amount, Net Amount, ForexExchangeAmount, Unadjusted Amount, Unadjusted Base Amount, Account Code]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		return true;
	}
	else
	{
		return false;
	}

}




public boolean checkVendorSummeryVendorBillWiseSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
	receivableAndPayableAnalysisMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
	vendorSummaryMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummeryVendorBillWiseSummaryReport));
	vendorSummeryVendorBillWiseSummaryReport.click();
	
	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	
	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	String expvalidationConfirmationMessage = "true";
	
	System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	Select s=new Select(sl_DateOptionDropdown);
	s.selectByValue("1");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	sl_HeaderSelectChkBox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report21chkbox));
	report21chkbox.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	sl_OkBtn.click();
	
	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
		
	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	String expvalidationConfirmationMessage1 = "true";
	
	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	report_FilterBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterCustomizeBtn));
	report_FilterCustomizeBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccountExpandBtn));
	filterAccountExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
	if (filterAccNameChkbox.isSelected()==false)
	{
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterAccNameChkbox));
		filterAccNameChkbox.click();
		
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filter_FilterOkButton));
	filter_FilterOkButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummeryBillwiseCusAccTxt));
	vendorSummeryBillwiseCusAccTxt.click();
	vendorSummeryBillwiseCusAccTxt.sendKeys("Vendor a");
	Thread.sleep(2000);
	
	
	
	vendorSummeryBillwiseCusAccTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	filterOkButton.click();

	Thread.sleep(2000);

	int reportsRow1ListCount = report1stRowList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = report1stRowList.get(i).getText();
		
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[Vendor A, , 1,500.00, 033-001]";
	

	int report2ndRowListCount = report2ndRowList.size();
	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	for(int i=1;i<report2ndRowListCount;i++)
	{
		String data = report2ndRowList.get(i).getText();
		report2ndRowListArray.add(data);
	}
	String actRow2List = report2ndRowListArray.toString();
	String expRow2List = "[Grand Total, , 1,500.00, ]";

	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
	
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) &&
			actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
			actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
	{
		System.out.println("Test Pass : Reports Are as Expected ");
		return true;
	}
	else
	{
		System.out.println("Test Fail : Report Are NOT as Expected ");
		return false;
	}
}

public boolean CheckPrintAndCustomiseOptionnInVendorSummeryVendorBillwiseSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultExpandBtn));
	defaultExpandBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusParticularBtn));
	getAction().doubleClick(cusParticularBtn).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cusSaveBtn));
	cusSaveBtn.click();
	
	String expMessage = "Data saved successfully";
    
    String actMessage = checkValidationMessage(expMessage);
	
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount1 = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray1 = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount1;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray1.add(data);
	}
	String actHeaderList1 = reportsHeaderListArray1.toString();
	String expHeaderList1 = "[, Particulars, Receivable Amount, Payable Amount, Account Code, Particulars]";
    
    System.out.println(" Header List Actual    : "+actHeaderList1);
    System.out.println("  Header List expected : "+expHeaderList1);
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_ReportCustomizeBtn));
	report_ReportCustomizeBtn.click();
	
	Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cuDeleteLayoutBtn));
	cuDeleteLayoutBtn.click();
	
	getWaitForAlert();
	getAlert().accept();
	
	String expDeleteMessage = "Layout Deleted Successfully";
    
    String actDeleteMessage = checkValidationMessage(expDeleteMessage);
    
    Thread.sleep(2000);
    
    int reportsHeaderListCount = reportsHeaderList.size();
	ArrayList<String> reportsHeaderListArray = new ArrayList<String>();
	for(int i=0;i<reportsHeaderListCount;i++)
	{
		String data = reportsHeaderList.get(i).getText();
		reportsHeaderListArray.add(data);
	}
	String actHeaderList = reportsHeaderListArray.toString();
	String expHeaderList = "[, Particulars, Receivable Amount, Payable Amount, Account Code]";
    
    System.out.println(" Header List Actual After Deleted    : "+actHeaderList);
    System.out.println(" Header List expected After Deleted  : "+expHeaderList);
	
    Thread.sleep(1500);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_ReportPrintBtn));
	sl_ReportPrintBtn.click();
	
	Thread.sleep(3000);
	ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
	
	int actOpenWindowsCount = getDriver().getWindowHandles().size();
	int expOpenWindowsCount = 2;

 	getDriver().switchTo().window(openTabs.get(0));
 	
 	Thread.sleep(2000);
 	
 	getDriver().switchTo().window(openTabs.get(1)).close();
 	
 	getDriver().switchTo().window(openTabs.get(0));
	
	System.out.println("openTabs"+openTabs);
	System.out.println("Open Tabs Count : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
	
	Thread.sleep(1000);

	if(actMessage.equalsIgnoreCase(expMessage) && actHeaderList1.equalsIgnoreCase(expHeaderList1) && 
			actHeaderList.equalsIgnoreCase(expHeaderList) && actDeleteMessage.equalsIgnoreCase(expDeleteMessage) &&
			actOpenWindowsCount==expOpenWindowsCount)
	{
		return true;
	}
	else
	{
		return false;
	}

}















	
	
	
public FAReportsPage(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
	
}

}

		
	