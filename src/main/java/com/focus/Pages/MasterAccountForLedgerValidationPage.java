package com.focus.Pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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

public class MasterAccountForLedgerValidationPage extends BaseEngine {
	
	
		
	@FindBy(xpath="//*[@id='txtUsername']")
	private static WebElement username;

	@FindBy(id="txtPassword")
	private static WebElement password;

	@FindBy(id="btnSignin")
	private static WebElement signIn;

    @FindBy(id="ddlCompany")
    private static WebElement companyDropDownList;

	@FindBy(xpath="//span[@class='hidden-xs']")
	private static WebElement userNameDisplay;

	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;
	
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;

    @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
	private static WebElement logoutOption;	
     
    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
	private static WebElement noIn;
    
    @FindBy(xpath="//input[@id='donotshow']")
	private static WebElement doNotShowCheckbox;
    
    @FindBy(xpath="//span[@class='pull-right']")
	private static WebElement closeBtnInDemoPopupScreen;
    
    
	
    @FindBy(xpath="//*[@id='dashName']")
    private static WebElement labelDashboard ;
    
    private static String xlfile;
	 private static String resPass="Pass";
	 private static String resFail="Fail";
	 private static ExcelReader excelReader;
	 private static int cSize;

	
	
	
	
		//Screen afer login
		@FindBy (xpath="//*[@id='1']/div/span")
		public static WebElement homeMenu;
	
        //Masters Menu	
		@FindBy (xpath="//*[@id='1000']/span")
	    public static WebElement mastersMenu;
		
		//accounts meny
		@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
		public static WebElement accounts;
		
		@FindBy (xpath="//*[@id='txtsrch-term']")
		public static WebElement accountSearchTextArea;
		
		@FindBy (xpath="//*[@id='lblnchecked']/input")
		public static WebElement accountsFirtCheckbox;
		
		@FindBy (xpath="//table[@id='landgridData']/tbody/tr[1]/td")
		public static List<WebElement> accountsTableFirstRow1;
		
		
		@FindBy (xpath="//*[@id='rbnDisplayDebitCreditTotalForEachMonth']")
		public static WebElement displayDrOrCrTotalsForEachMonthRadioBtnInProperties;
		
		@FindBy (xpath="//*[@id='rbnrbnDisplayDebitCreditTotalForEachDay']")
		public static WebElement displayDrOrCrTotalsForEachDayRadioBtnInProperties;
		
		
		@FindBy (xpath="//*[@id='chkGenerateLedgerByCurrency']")
		public static WebElement displayLedgerByCurrencyCheckboxInProperties;
		
		
		@FindBy (xpath="//*[@id='rbnDisplayDebitCreditTotalForEachAccountUnderGroup']")
		public static WebElement displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties;
		
		
		@FindBy (xpath="//*[@id='rbnClubTranOfAllAcctsUnderGrpWhenDispInLedger']")
		public static WebElement ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties;
		
		
		@FindBy (xpath="//*[@id='btnPropOk']/i")
		public static WebElement okBtnInAccountProperties;
		
		
	
	
		//Accounts Title
		@FindBy (xpath="//span[@id='spnHeaderText']")
		public static WebElement accountsTitle;

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

		@FindBy(xpath="//*[@id='btnLedger']/i")
		public static WebElement masterLedgerBtn; 

		@FindBy(xpath="//i[@class='icon-font6 icon-financial-1']")
		public static WebElement masterManageCreditBtn; 

		@FindBy(xpath="//i[@class='icon-font6 icon-department-appropriation']")
		public static WebElement masterDepartmentAppropriationBtn; 

		@FindBy(xpath="//i[@class='icon-font6 icon-budget']")
		public static WebElement masterBudgetBtn; 

		@FindBy(xpath="//i[@class='icon-font6 icon-backtrack']")
		public static WebElement masterBackTrackBtn; 

		@FindBy(xpath="//i[@class='icon-font6 icon-transfer']")
		public static WebElement masterTranferBtn;
		
		@FindBy(xpath="//*[@id='btnLedger detail']/i")
		public static WebElement masterLedgerDetailBtn;
		
		
		
		@FindBy(xpath = "//input[@id='sName']")
		public static WebElement nameTxt;

		// Code
		@FindBy(xpath = "//input[@id='sCode']")
		public static WebElement codeTxt;

		// AccountType
		@FindBy(xpath = "//select[@id='iAccountType']")
		public static WebElement accountTypeDropdown;

		// CreditLimit
		@FindBy(xpath = "//input[@id='fCreditLimit']")
		public static WebElement creditLimitTxt;

		// CreditDays
		@FindBy(xpath = "//input[@id='iCreditDays']")
		public static WebElement creditdaysTxt;

		// ChequeDiscountLimit
		@FindBy(xpath = "//input[@id='fChequeDiscountLimit']")
		public static WebElement chequeDiscountLimitTxt;

		// Rate Of Interest
		@FindBy(xpath = "//input[@id='fRateofinterest']")
		public static WebElement rateofinterestTxt;

		// BankAccount
		@FindBy(xpath = "//input[@id='iBankAc']")
		public static WebElement bankAccountTxt;

		@FindBy(xpath = "//*[@id='iBankAc_input_image']/span")
		public static WebElement bankAccount_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iBankAc_input_settings']/span")
		public static WebElement bankAccount_SettingBtn;
		
		@FindBy(xpath = "//*[@id='btnMasterSaveClick']")
		public static WebElement saveBtn;

		@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement closeBtn;
		

		@FindBy(xpath = "//*[@id='ol_treeNavigation']/li[1]/span")
		public static WebElement accountNaviagtion;
		
		

		
		@FindBy(xpath="//i[@class='icon-close icon-font6']")
		private static WebElement  closeBtnInDocumentCustmization;
		
		// Edit option Fields
		@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
		public static WebElement editcloseBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-paste-clipboard']")
		public static WebElement pasteBtn;

		@FindBy(xpath = "//button[@id='btnMasterClone']")
		public static WebElement editcloneBtn;

		@FindBy(xpath = "//*[@id='btnMasterCopy']")
		public static WebElement copyBtn;
		

		@FindBy(xpath="//*[@id='btnNewSets']")
		public static WebElement masterNewSetBtn; 

		@FindBy(xpath="//i[@class='icon-font6 icon-modifier']")
		public static WebElement masterModifierBtn; 

		@FindBy(xpath="//*[@id='btnSetType']")
		public static WebElement masterSetTypeBtn; 

		@FindBy(xpath="//i[@class='icon-convert icon-font6']")
		public static WebElement masterUnitConversionBtn; 

		@FindBy(xpath="//i[@class='icon-font6 icon-alternate-product-1']")
		public static WebElement masterAlternateItemBtn; 

		@FindBy(xpath="//i[@class='icon-font6 icon-related-product']")
		public static WebElement masterRelatedItemBtn; 

		@FindBy(xpath="//i[@class='icon-font6 icon-stock-ledger']")
		public static WebElement masterStockLedgerBtn; 
		
		@FindBy(xpath="//*[@id='liSelectAllMasters']")
		public static WebElement masterSelectAllAccountsCheckbox; 
		
		@FindBy(xpath="//*[@id='rptheading']/div/span[2]")
		public static WebElement ledgerTitle; 
		
		@FindBy(xpath="//*[@id='rptName']")
		public static WebElement dateTextInLedgerReportScreen;
		
		@FindBy(xpath="//span[@class='icon-down-arrow icon-font8 dropdown-toggle theme_button_color']")
		public static WebElement optionsToggleBtnInLedgerReportScreen;
		
		@FindBy(xpath="//i[@class='icon-font6 icon-close']")
		public static WebElement closeBtnInLedgerReportScreen;
		
		@FindBy(xpath="//*[@id='txtSearchReport']")
		public static WebElement searchTextFieldInLedgerReportScreen;
		
		@FindBy(xpath="//*[@id='allMasterCustTabs']/li[6]/span")
		public static WebElement reportsInCustomizeMaster;
		
		
		@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div")
		public static List<WebElement> allReportsInReportsInCustomizeMaster;
		
		@FindBy(xpath="//*[@id='tabContent_Reports_MasterCust']/div[1]/div/div[1]/div[1]/span")
		public static WebElement saveBtnInReports;
		
		
		
		
		
		
		//
		@FindBy(xpath="(//div[@class='pull-right']/button)[1]")
		public static WebElement firstPageBtnInLedgerReportScreen;
		
		@FindBy(xpath="(//div[@class='pull-right']/button)[2]")
		public static WebElement previousPageBtnInLedgerReportScreen;
		
		@FindBy(xpath="(//div[@class='pull-right']/button)[4]")
		public static WebElement nextPageBtnInLedgerReportScreen;
		
		@FindBy(xpath="(//div[@class='pull-right']/button)[5]")
		public static WebElement lastPageBtnInLedgerReportScreen;
		
		@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[1]/td")
		private static List<WebElement> reportsRow1List;
		
		@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[2]/td")
		private static List<WebElement> reportsRow2List;
		
		@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[3]/td")
		private static List<WebElement> reportsRow3List;
		
		@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[4]/td")
		private static List<WebElement> reportsRow4List;
		
		@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[5]/td")
		private static List<WebElement> reportsRow5List;
		
		@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[6]/td")
		private static List<WebElement> reportsRow6List;
		
		@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[7]/td")
		private static List<WebElement> reportsRow7List;
		
		@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[8]/td")
		private static List<WebElement> reportsRow8List;
		
		
		
		
		@FindBy(xpath="//table[@class='CommonReportTable']/tbody")
		private static WebElement ledgerTable;	
		
		@FindBy(xpath="//table[@class='CommonReportTable']/tbody")
		private static WebElement customerStatementsReportTable;	
		
		
		
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
		

		public static boolean checkLoginToCheckAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		LoginPage lp=new LoginPage(getDriver()); 
		
		String unamelt="su";
				      
		String pawslt="su";
				      
		lp.enterUserName(unamelt);
				
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
				  
		lp.clickOnSignInBtn();
		
		//checkRefershPopOnlogin();
			
		//checkPopUpWindow();
        
        Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String userInfo=userNameDisplay.getText();
				    	
		System.out.println("User Info : "+userInfo);
				    	
		System.out.println("User Info Capture Text :"+userNameDisplay.getText());
				    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
				    	
		companyLogo.click();
				    	
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogo.click();
				    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
				    	
		String getDashboard=labelDashboard.getText();
	   
		System.out.println("getDashboard"+getDashboard);
		
		if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") /*&& getDashboard.equalsIgnoreCase("Graph with Active and setAsDefault")*/)
		{

			System.out.println("Test Pass : Login The Application Successfully");
			excelReader.setCellData(xlfile, "Sheet1", 7, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail : Login The Application Successfully");
			excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
			return false;

		}
	
}
		
		public static boolean checkToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
			 homeMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
					  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 masterRibbonToExpandOptions.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));	
			 
			 boolean actmasterGroupBtn    	 													=masterGroupBtn.isDisplayed();
			 boolean actmasterDeleteAllBtn    	 												=masterDeleteAllBtn.isDisplayed();
			 boolean actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity   	=masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity.isDisplayed();
			 boolean actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState    	 	  	=masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState.isDisplayed();
			 boolean actmasterAdvanceMasterImportORExportBtn    	 							=masterAdvanceMasterImportORExportBtn.isDisplayed();
			 boolean actmasterAuthorInfoBtn    	 												=masterAuthorInfoBtn.isDisplayed();
			 boolean actmasterMoveUpBtn    	 													=masterMoveUpBtn.isDisplayed();
			 boolean actmasterMoveDownBtn    	 												=masterMoveDownBtn.isDisplayed();
			 boolean actmasterSortBtn    	 													=masterSortBtn.isDisplayed();
			 boolean actmasterMassUpdateBtn    	 												=masterMassUpdateBtn.isDisplayed();
			 boolean actmasterImportFromXmlBtn    	 											=masterImportFromXmlBtn.isDisplayed();
			 boolean actmasterExportFormatToXmlBtn    	 										=masterExportFormatToXmlBtn.isDisplayed();
			 
			 boolean expmasterGroupBtn    	 													=true;
			 boolean expmasterDeleteAllBtn    	 												=true;
			 boolean expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity   	=true;
			 boolean expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState    	 	  	=true;
			 boolean expmasterAdvanceMasterImportORExportBtn    	 							=true;
			 boolean expmasterAuthorInfoBtn    	 												=true;
			 boolean expmasterMoveUpBtn    	 													=true;
			 boolean expmasterMoveDownBtn    	 												=true;
			 boolean expmasterSortBtn    	 													=true;
			 boolean expmasterMassUpdateBtn    	 												=true;
			 boolean expmasterImportFromXmlBtn    	 											=true;
			 boolean expmasterExportFormatToXmlBtn    	 										=true;
			 
			 System.out.println("**************************************checkToolsOptionsAccountsMenu********************************");
			 
			 System.out.println("masterGroupBtn                                                      : "+actmasterGroupBtn                                                      +" Value Expected : "+expmasterGroupBtn);
			 System.out.println("masterDeleteAllBtn                                                  : "+actmasterDeleteAllBtn                                                  +" Value Expected : "+expmasterDeleteAllBtn);
			 System.out.println("masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity : "+actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity +" Value Expected : "+expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity);
			 System.out.println("masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState          : "+actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState          +" Value Expected : "+expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState);
			 System.out.println("masterAdvanceMasterImportORExportBtn                                : "+actmasterAdvanceMasterImportORExportBtn                                +" Value Expected : "+expmasterAdvanceMasterImportORExportBtn);
			 System.out.println("masterAuthorInfoBtn                                                 : "+actmasterAuthorInfoBtn                                                 +" Value Expected : "+expmasterAuthorInfoBtn);
			 System.out.println("masterMoveUpBtn                                                     : "+actmasterMoveUpBtn                                                     +" Value Expected : "+expmasterMoveUpBtn);
			 System.out.println("masterMoveDownBtn                                                   : "+actmasterMoveDownBtn                                                   +" Value Expected : "+expmasterMoveDownBtn);
			 System.out.println("masterSortBtn                                                       : "+actmasterSortBtn                                                       +" Value Expected : "+expmasterSortBtn);
			 System.out.println("masterMassUpdateBtn                                                 : "+actmasterMassUpdateBtn                                                 +" Value Expected : "+expmasterMassUpdateBtn);
			 System.out.println("masterImportFromXmlBtn                                              : "+actmasterImportFromXmlBtn                                              +" Value Expected : "+expmasterImportFromXmlBtn);
			 System.out.println("masterExportFormatToXmlBtn                                          : "+actmasterExportFormatToXmlBtn                                          +" Value Expected : "+expmasterExportFormatToXmlBtn);
			 
		     
			 if(actmasterGroupBtn==expmasterGroupBtn && actmasterDeleteAllBtn==expmasterDeleteAllBtn 
					 && actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity==expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity
					 && actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState==expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState 
					 && actmasterAdvanceMasterImportORExportBtn==expmasterAdvanceMasterImportORExportBtn
					 && actmasterAuthorInfoBtn==expmasterAuthorInfoBtn && actmasterMoveUpBtn==expmasterMoveUpBtn && actmasterMoveDownBtn==expmasterMoveDownBtn
					 && actmasterSortBtn==expmasterSortBtn && actmasterMassUpdateBtn==expmasterMassUpdateBtn && actmasterImportFromXmlBtn==expmasterImportFromXmlBtn
					 && actmasterExportFormatToXmlBtn==expmasterExportFormatToXmlBtn)
			 {	
					excelReader.setCellData(xlfile, "Sheet1", 251, 9, resPass);
					return true;
			 }	 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 251, 9, resFail);
				 return false;
			 }
		
		}

		
		public static boolean checkOtherToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
		{

		
			
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 
			 masterRibbonControlNextBtn.click(); 
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterCustamizemasterBtn));	
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		     
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterTranferBtn));	
			 
			 boolean actmasterCustamizemasterBtn    	  =masterCustamizemasterBtn.isDisplayed();
			 boolean actmasterCustamizeViewBtn    	 	  =masterCustamizeViewBtn.isDisplayed();
			 boolean actmastercustamizeTreeBtn    	 	  =mastercustamizeTreeBtn.isDisplayed();
			 boolean actmasterLedgerBtn    	 		      =masterLedgerBtn.isDisplayed();
			 boolean actmasterManageCreditBtn    	 	  =masterManageCreditBtn.isDisplayed();
			 boolean actmasterDepartmentAppropriationBtn  =masterDepartmentAppropriationBtn.isDisplayed();
			// boolean actmasterBudgetBtn    	 		      =masterBudgetBtn.isDisplayed();
			 boolean actmasterBackTrackBtn    	 	      =masterBackTrackBtn.isDisplayed();
			 boolean actmasterTranferBtn    	 		  =masterTranferBtn.isDisplayed();
			 
			 boolean expmasterCustamizemasterBtn    	  =true;
			 boolean expmasterCustamizeViewBtn    	 	  =true;
			 boolean expmastercustamizeTreeBtn    	 	  =true;
			 boolean expmasterLedgerBtn    	 		      =true;
			 boolean expmasterManageCreditBtn    	 	  =true;
			 boolean expmasterDepartmentAppropriationBtn  =true;
			// boolean expmasterBudgetBtn    	 		   =true;
			 boolean expmasterBackTrackBtn    	 	      =true;
			 boolean expmasterTranferBtn    	 		  =true;
			 
			 
			 System.out.println("************************************checkOtherToolsOptionsAccountsMenu************************************");
			 
			 System.out.println("masterCustamizemasterBtn           : "+actmasterCustamizemasterBtn           +" Value Expected : "+expmasterCustamizemasterBtn);
			 System.out.println("masterCustamizeViewBtn             : "+actmasterCustamizeViewBtn             +" Value Expected : "+expmasterCustamizeViewBtn);
			 System.out.println("mastercustamizeTreeBtn             : "+actmastercustamizeTreeBtn             +" Value Expected : "+expmastercustamizeTreeBtn);
			 System.out.println("masterLedgerBtn                    : "+actmasterLedgerBtn                    +" Value Expected : "+expmasterLedgerBtn);
			 System.out.println("masterManageCreditBtn              : "+actmasterManageCreditBtn              +" Value Expected : "+expmasterManageCreditBtn);
			 System.out.println("masterDepartmentAppropriationBtn   : "+actmasterDepartmentAppropriationBtn   +" Value Expected : "+expmasterDepartmentAppropriationBtn);
			// System.out.println("masterBudgetBtn                    : "+actmasterBudgetBtn                    +" Value Expected : "+expmasterBudgetBtn);
			 System.out.println("masterBackTrackBtn                 : "+actmasterBackTrackBtn                 +" Value Expected : "+expmasterBackTrackBtn);
			 System.out.println("masterTranferBtn                   : "+actmasterTranferBtn                   +" Value Expected : "+expmasterTranferBtn);
			 
			 
			 if(actmasterCustamizemasterBtn==expmasterCustamizemasterBtn && actmasterCustamizeViewBtn==expmasterCustamizeViewBtn  
					 && actmastercustamizeTreeBtn==expmastercustamizeTreeBtn && actmasterLedgerBtn==expmasterLedgerBtn
					 && actmasterManageCreditBtn==expmasterManageCreditBtn && actmasterDepartmentAppropriationBtn==expmasterDepartmentAppropriationBtn
					 /*&& actmasterBudgetBtn==expmasterBudgetBtn*/ && actmasterBackTrackBtn==expmasterBackTrackBtn && actmasterTranferBtn==expmasterTranferBtn)
			 {	
					excelReader.setCellData(xlfile, "Sheet1", 252, 9, resPass);
					return true;
			 }	 
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 252, 9, resFail);
				 return false;
			 }
		
		}
		
		
		public static boolean checkSearchAccountClickOnLedgerInMasterRibbon() throws InterruptedException
		
		{
		
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
			 homeMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("Vendor B");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			   
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 masterRibbonToExpandOptions.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 
			 masterRibbonControlNextBtn.click(); 
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterLedgerBtn));
			 masterLedgerBtn.click();
			 
			 Thread.sleep(4000);
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1));
			
			/*Set<String> allWindows = getDriver().getWindowHandles();      
			for(String winHandle:allWindows)
			{
				String title = getDriver().switchTo().window(winHandle).getTitle();
				System.out.println("Window Title: "+title);
				Thread.sleep(5000);
				
				if(title.equalsIgnoreCase("Focus"))
				{
					
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ledgerTitle));
					 String ledgerTileText = ledgerTitle.getText();
					 System.out.println("Ledger Title: " +ledgerTileText);*/
					 
					 
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(dateTextInLedgerReportScreen));
					 
					 boolean actDateText = dateTextInLedgerReportScreen.isDisplayed();
					 boolean actOptionsToggle = optionsToggleBtnInLedgerReportScreen.isDisplayed();
					 boolean actCloseBtn = closeBtnInLedgerReportScreen.isDisplayed();
					 boolean actSearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actFirstPageBtn = firstPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actPreviousBtn = previousPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actsearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actnextPageBtn= nextPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actlastPageBtn = lastPageBtnInLedgerReportScreen.isDisplayed();
					 
					 
					 boolean expDateText = true;
					 boolean expOptionsToggle =true;
					 boolean expCloseBtn = true;
					 boolean expSearchTextField =true;
					 boolean expFirstPageBtn = true;
					 boolean expPreviousBtn = true;
					 boolean expsearchTextField = true;
					 boolean expnextPageBtn=true;
					 boolean explastPageBtn = true;
					 
					 
					 System.out.println("dateTextInLedgerReport           : "+actDateText               +" Value Expected : "+expDateText);
					 System.out.println("optionsToggleInLedgerReport      : "+actOptionsToggle          +" Value Expected : "+expOptionsToggle);
					 System.out.println("closeBtnInLedgerReport           : "+actCloseBtn               +" Value Expected : "+expCloseBtn);
					 System.out.println("serachTextFieldInLedgerReport    : "+actSearchTextField        +" Value Expected : "+expSearchTextField);
					 System.out.println("firstPageBtnInLedgerReport       : "+actFirstPageBtn           +" Value Expected : "+expFirstPageBtn);
					 System.out.println("previousPageBTnLedgerReport      : "+actPreviousBtn            +" Value Expected : "+expPreviousBtn);
					 System.out.println("nextPageBTnLedgerReport          : "+actnextPageBtn            +" Value Expected : "+expnextPageBtn);
					 System.out.println("lastPageBTnLedgerReport          : "+actlastPageBtn            +" Value Expected : "+explastPageBtn);			 
					
				/*}
				
				
			}*/
		    
			Thread.sleep(3000);
			
			 
			if(actDateText==expDateText && actOptionsToggle ==expOptionsToggle && actCloseBtn==expCloseBtn 
					&& actSearchTextField==expSearchTextField && actFirstPageBtn ==expFirstPageBtn
					&& actPreviousBtn ==expPreviousBtn &&actnextPageBtn ==expnextPageBtn && actlastPageBtn==explastPageBtn)
			{
				return true;
			}
			
			else 
			{
				return false;
			}
		}
		
		
		
		
		public static boolean checkReportDetailsInLedgerReportPageForVendorB()
		{
			
			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[Vendor B 033-002]";
			
			
			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[NDT52 : 1, STD RATE COGS ACC INV, , 21.00, 21.00, , 1.47, 1.47, , 21.00, 21.00, Indian Rupees]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsByWarehouseRow3ListArray.add(data);
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[Total, , , , 21.00, 21.00, , 1.47, 1.47, , 21.00, 21.00, ]";
			
			
			System.out.println("*********************************checkLedgerDetailsForVendorB*****************************************");
			
			System.out.println("ActualRow1List Values   " +actRow1List);
			System.out.println("ExpectedRow1List Values " +expRow1List);
			
			System.out.println("ActualRow2List Values  " +actRow2List);
			System.out.println("ExpectedRow1List Values" +expRow2List);
			
			System.out.println("ActualRow3List Values  " +actRow3List);
			System.out.println("ExpectedRow3List Values" +expRow3List);
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1)).close();
			
			
			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
					&& actRow3List.equalsIgnoreCase(expRow3List))
			{
				return true;
			} 
			else
			{
				return false;
			}
		}
		
		
		public static boolean checkLedgerIsEmptyForVendorB() throws InterruptedException
		{

			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
			 homeMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("Vendor B");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			   
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 masterRibbonToExpandOptions.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 
			 masterRibbonControlNextBtn.click(); 
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterLedgerBtn));
			 masterLedgerBtn.click();
			 
			 Thread.sleep(4000);
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1));
		 	
		 	Thread.sleep(2000);
		 	
		 	boolean actTableIsEmpty = ledgerTable.getText().isEmpty();
			boolean expTableIsEmpty = true; 
			
			if(actTableIsEmpty==expTableIsEmpty)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		public static boolean checkLedgerReportForAccountVendorA() throws InterruptedException
		{

			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
			 homeMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("Vendor A");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			   
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 masterRibbonToExpandOptions.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 
			 masterRibbonControlNextBtn.click(); 
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterLedgerBtn));
			 masterLedgerBtn.click();
			 
			 Thread.sleep(4000);
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1));
			
			/*Set<String> allWindows = getDriver().getWindowHandles();      
			for(String winHandle:allWindows)
			{
				String title = getDriver().switchTo().window(winHandle).getTitle();
				System.out.println("Window Title: "+title);
				Thread.sleep(5000);
				
				if(title.equalsIgnoreCase("Focus"))
				{
					
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ledgerTitle));
					 String ledgerTileText = ledgerTitle.getText();
					 System.out.println("Ledger Title: " +ledgerTileText);*/
					 
					 
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(dateTextInLedgerReportScreen));
					 
					 boolean actDateText = dateTextInLedgerReportScreen.isDisplayed();
					 boolean actOptionsToggle = optionsToggleBtnInLedgerReportScreen.isDisplayed();
					 boolean actCloseBtn = closeBtnInLedgerReportScreen.isDisplayed();
					 boolean actSearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actFirstPageBtn = firstPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actPreviousBtn = previousPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actsearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actnextPageBtn= nextPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actlastPageBtn = lastPageBtnInLedgerReportScreen.isDisplayed();
					 
					 
					 boolean expDateText = true;
					 boolean expOptionsToggle =true;
					 boolean expCloseBtn = true;
					 boolean expSearchTextField =true;
					 boolean expFirstPageBtn = true;
					 boolean expPreviousBtn = true;
					 boolean expsearchTextField = true;
					 boolean expnextPageBtn=true;
					 boolean explastPageBtn = true;
					 
					 
					 System.out.println("dateTextInLedgerReport           : "+actDateText               +" Value Expected : "+expDateText);
					 System.out.println("optionsToggleInLedgerReport      : "+actOptionsToggle          +" Value Expected : "+expOptionsToggle);
					 System.out.println("closeBtnInLedgerReport           : "+actCloseBtn               +" Value Expected : "+expCloseBtn);
					 System.out.println("serachTextFieldInLedgerReport    : "+actSearchTextField        +" Value Expected : "+expSearchTextField);
					 System.out.println("firstPageBtnInLedgerReport       : "+actFirstPageBtn           +" Value Expected : "+expFirstPageBtn);
					 System.out.println("previousPageBTnLedgerReport      : "+actPreviousBtn            +" Value Expected : "+expPreviousBtn);
					 System.out.println("nextPageBTnLedgerReport          : "+actnextPageBtn            +" Value Expected : "+expnextPageBtn);
					 System.out.println("lastPageBTnLedgerReport          : "+actlastPageBtn            +" Value Expected : "+explastPageBtn);			 
					
				/*}
				
				
			}*/
		    
			Thread.sleep(3000);
			
			 
			if(actDateText==expDateText && actOptionsToggle ==expOptionsToggle && actCloseBtn==expCloseBtn 
					&& actSearchTextField==expSearchTextField && actFirstPageBtn ==expFirstPageBtn
					&& actPreviousBtn ==expPreviousBtn &&actnextPageBtn ==expnextPageBtn && actlastPageBtn==explastPageBtn)
			{
				return true;
			}
			
			else 
			{
				return false;
			}
		
		}
		
		
		public static boolean checkReportDetailsInLedgerReportPageForVendorA()
		{

			
			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[Vendor A 033-001]";
			
			
			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[NDT52 : 1, STD RATE COGS ACC INV, , 21.00, 21.00, , 1.47, 1.47, , 21.00, 21.00, Indian Rupees]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsByWarehouseRow3ListArray.add(data);
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[Total, , , , 21.00, 21.00, , 1.47, 1.47, , 21.00, 21.00, ]";
			
			
			System.out.println("*********************************checkLedgerDetailsForVendorB*****************************************");
			
			System.out.println("ActualRow1List Values   " +actRow1List);
			System.out.println("ExpectedRow1List Values " +expRow1List);
			
			System.out.println("ActualRow2List Values  " +actRow2List);
			System.out.println("ExpectedRow1List Values" +expRow2List);
			
			System.out.println("ActualRow3List Values  " +actRow3List);
			System.out.println("ExpectedRow3List Values" +expRow3List);
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1)).close();
			
			
			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
					&& actRow3List.equalsIgnoreCase(expRow3List))
			{
				return true;
			} 
			else
			{
				return false;
			}
		
			
		}
	/////////////////////////	
		public static boolean checkReportsInCustomizationMaster() throws InterruptedException
		{

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
			mastersMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
			accounts.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			masterRibbonToExpandOptions.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 
			masterRibbonControlNextBtn.click(); 
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();
			masterRibbonControlNextBtn.click();

			Thread.sleep(2000);
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
			masterCustamizemasterBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsInCustomizeMaster));
			reportsInCustomizeMaster.click();
			
			Thread.sleep(2000);
			
			boolean actReportsTab = reportsInCustomizeMaster.isDisplayed();
			boolean expReportsTab = true;
			
	    	System.out.println("***********************************checkOpenCustomizeMasterInAccounts*********************************");
		    
		    System.out.println("ReportsTabIsDisplaying   : "+actReportsTab  +"  value expected  "+expReportsTab);
		  
			if(actReportsTab==expReportsTab)
			{	
				return true;
			}	 
			else
			{
				return false;
			}		
		}
		
		public static boolean checkAllReportsDisplayingInReportsTabInCustomizationMaster()
		{
			int reportsListCount = allReportsInReportsInCustomizeMaster.size();
			System.out.println("Reports Count"+reportsListCount);
			ArrayList<String> reportsListArray = new ArrayList<String>();
			for(int i=0;i<reportsListCount;i++)
			{
				String data = allReportsInReportsInCustomizeMaster.get(i).getText();
				reportsListArray.add(data);
			}
			
			String actReportList = reportsListArray.toString();
			System.out.println(actReportList);
			String expReportList ="[Master info, ABC analysis amount, Bank book, Bank reconciliation statement, Cash book, Cheque book register report,"
					+ " Comparative analysis, Customer ageing detail analysis, Customer ageing detail by due date, Customer ageing summary analysis,"
					+ " Customer bill-wise summary, Customer due date analysis, Customer listing of outstanding bills, Customer overdue analysis,"
					+ " Customer overdue summary, Customer statements, Customer summary ageing by due date, Income Expense Trend, Interest calculation,"
					+ " Ledger, Ledger detail, Monthly Sales, Peak and low balance amount, Petty cash book, Purchase register, Purchase return register,"
					+ " Purchases grouped by department, Purchases grouped by Item, Purchases grouped by vendor, Sales day book, Sales grouped by customer,"
					+ " sales grouped by department, Sales grouped by Item, Sales return register, Schedules, Sub ledger, Summary purchase register, "
					+ "Summary sales register, Top Customers, Trading account, Transactions type analysis, Vendor ageing detail analysis, "
					+ "Vendor ageing detail by due date, Vendor ageing summary analysis, Vendor bill-wise summary, Vendor due date analysis,"
					+ " Vendor listing of outstanding bills, Vendor overdue analysis, Vendor overdue summary, Vendor statements, Vendor summary ageing by due date]";
			if (actReportList.equalsIgnoreCase(expReportList))
			{
				return true;
			} 
			else
			{
				return false;
			}
		}
		
		public static boolean checkLedgerdetailcheckBoxInReports() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			int reportsListCount = allReportsInReportsInCustomizeMaster.size();
			System.out.println("Reports Count"+reportsListCount);
			ArrayList<String> reportsListArray = new ArrayList<String>();
			for(int i=0;i<reportsListCount;i++)
			{
				String data = allReportsInReportsInCustomizeMaster.get(i).getText();
				reportsListArray.add(data);
			}
			
			
			
			for (int i = 0; i < reportsListCount; i++) 
			{
				String data = allReportsInReportsInCustomizeMaster.get(i).getText();
				
				if (data.equalsIgnoreCase("Ledger detail")) 
				{
					allReportsInReportsInCustomizeMaster.get(i).click();
					break;
				} 
			}
			
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInReports));	
			saveBtnInReports.click();
			
			
			String expMessage = "Reports Attached to Master";
			String actMessage = checkValidationMessage(expMessage);
	
			

			
			if (actMessage.equalsIgnoreCase(expMessage))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public static boolean checkLogoutAndLoginAfterCustomization() throws InterruptedException
		{
			
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			userNameDisplay.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
			
			Thread.sleep(4000);
			
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
			
		    
		    String expuserInfo            ="SU";
		    String expLoginCompanyName    ="Automation Company ";
		    String expDashboard			  ="Graph with Active and setAsDefault";
		   
			
			System.out.println("***********************************checkLogoutAndLoginAfterEnablingMandatoryCheckboxInFieldsProperties*********************************");
		    
		    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
		    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
		    System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);
		   
		  
			if(userInfo.equalsIgnoreCase(expuserInfo) /*&& getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName)*/)
			{	
				return true;
			}	 
			else
			{
				return false;
			}
		 
		}
		
		
		public static boolean checkLedgerInDetailIsDisplayingInMasterRibbonControl() throws InterruptedException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
			 homeMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
					  
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 masterRibbonToExpandOptions.click();
			 
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
			 masterRibbonControlNextBtn.click();

			 
			 boolean actmasterLedgerDetailBtn    	  =masterLedgerDetailBtn.isDisplayed();
			 boolean expmasterLedgerDetailBtn    	  = true;
			 
			 System.out.println("*****************************checkLedgerDetailButtonInRibbonControl************************************");
			 
			 System.out.println("masterLedgerDetailBtn  : "+actmasterLedgerDetailBtn  +" Value Expected : "+expmasterLedgerDetailBtn);
			
			
			if(actmasterLedgerDetailBtn==expmasterLedgerDetailBtn)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		public static boolean checkLedgerDetailReportForVendorB() throws InterruptedException
		{


			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
			 homeMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("Vendor B");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			   
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 masterRibbonToExpandOptions.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 
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
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterLedgerDetailBtn));
			 masterLedgerDetailBtn.click();
			 
			 Thread.sleep(4000);
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1));
			
			/*Set<String> allWindows = getDriver().getWindowHandles();      
			for(String winHandle:allWindows)
			{
				String title = getDriver().switchTo().window(winHandle).getTitle();
				System.out.println("Window Title: "+title);
				Thread.sleep(5000);
				
				if(title.equalsIgnoreCase("Focus"))
				{
					
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ledgerTitle));
					 String ledgerTileText = ledgerTitle.getText();
					 System.out.println("Ledger Title: " +ledgerTileText);*/
					 
					 
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(dateTextInLedgerReportScreen));
					 
					 boolean actDateText = dateTextInLedgerReportScreen.isDisplayed();
					 boolean actOptionsToggle = optionsToggleBtnInLedgerReportScreen.isDisplayed();
					 boolean actCloseBtn = closeBtnInLedgerReportScreen.isDisplayed();
					 boolean actSearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actFirstPageBtn = firstPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actPreviousBtn = previousPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actsearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actnextPageBtn= nextPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actlastPageBtn = lastPageBtnInLedgerReportScreen.isDisplayed();
					 
					 
					 boolean expDateText = true;
					 boolean expOptionsToggle =true;
					 boolean expCloseBtn = true;
					 boolean expSearchTextField =true;
					 boolean expFirstPageBtn = true;
					 boolean expPreviousBtn = true;
					 boolean expsearchTextField = true;
					 boolean expnextPageBtn=true;
					 boolean explastPageBtn = true;
					 
					 
					 System.out.println("dateTextInLedgerReport           : "+actDateText               +" Value Expected : "+expDateText);
					 System.out.println("optionsToggleInLedgerReport      : "+actOptionsToggle          +" Value Expected : "+expOptionsToggle);
					 System.out.println("closeBtnInLedgerReport           : "+actCloseBtn               +" Value Expected : "+expCloseBtn);
					 System.out.println("serachTextFieldInLedgerReport    : "+actSearchTextField        +" Value Expected : "+expSearchTextField);
					 System.out.println("firstPageBtnInLedgerReport       : "+actFirstPageBtn           +" Value Expected : "+expFirstPageBtn);
					 System.out.println("previousPageBTnLedgerReport      : "+actPreviousBtn            +" Value Expected : "+expPreviousBtn);
					 System.out.println("nextPageBTnLedgerReport          : "+actnextPageBtn            +" Value Expected : "+expnextPageBtn);
					 System.out.println("lastPageBTnLedgerReport          : "+actlastPageBtn            +" Value Expected : "+explastPageBtn);			 
					
				/*}
				
				
			}*/
		    
			Thread.sleep(3000);
			
			 
			if(actDateText==expDateText && actOptionsToggle ==expOptionsToggle && actCloseBtn==expCloseBtn 
					&& actSearchTextField==expSearchTextField && actFirstPageBtn ==expFirstPageBtn
					&& actPreviousBtn ==expPreviousBtn &&actnextPageBtn ==expnextPageBtn && actlastPageBtn==explastPageBtn)
			{
				return true;
			}
			
			else 
			{
				return false;
			}
		
		
		}
		
		public static boolean CheckLedgerDetailReportDetailsForVendorB()
		{


			
			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[Vendor B 033-002]";
			
			
			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[NDT52 : 1, STD RATE COGS ACC INV, , 21.00, 21.00, , 1.47, 1.47, , 21.00, 21.00]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsByWarehouseRow3ListArray.add(data);
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[Total, , , , 21.00, 21.00, , 1.47, 1.47, , 21.00, 21.00]";
			
			
			System.out.println("*********************************checkLedgerDetailsForVendorB*****************************************");
			
			System.out.println("ActualRow1List Values   " +actRow1List);
			System.out.println("ExpectedRow1List Values " +expRow1List);
			
			System.out.println("ActualRow2List Values  " +actRow2List);
			System.out.println("ExpectedRow1List Values" +expRow2List);
			
			System.out.println("ActualRow3List Values  " +actRow3List);
			System.out.println("ExpectedRow3List Values" +expRow3List);
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1)).close();
			
			
			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
					&& actRow3List.equalsIgnoreCase(expRow3List))
			{
				return true;
			} 
			else
			{
				return false;
			}
		
			
		
		}
		
		public static boolean checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
			 masterNewBtn.click();
			 
			
			 Thread.sleep(3000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys("cust_display_dr/cr_total_for_each_month");
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys("CustCrDrTotals");
		    codeTxt.sendKeys(Keys.TAB);
	      
		    Select accountTypeDrpdwn = new Select(accountTypeDropdown);
		    
			accountTypeDrpdwn.selectByVisibleText("Customer");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();

			String expSaveAccountMessage = "Saved Successfully";	
			String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			

			System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);
			
			
			
			if(actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		public static boolean checkSavedAccountInTheAccountsList()
		{
			
			int AccountsTableRow1Count = accountsTableFirstRow1.size();
			ArrayList<String> accountsListRow1Array = new ArrayList<String>();
			for(int i=11;i<AccountsTableRow1Count;i++)
			{
				String data = accountsTableFirstRow1.get(i).getText();
				accountsListRow1Array.add(data);
			}
			String actRow1List = accountsListRow1Array.toString();
			String expRow1List = "[cust_display_dr/cr_total_for_each_month, CustCrDrTotals, Customer]";
			
			System.out.println("ActualList "+actRow1List);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));
			accountsFirtCheckbox.click();
			
			boolean actSelectedMasterSearchCheckbox = accountsFirtCheckbox.isSelected();
			boolean expSelectedMasterSearchCheckbox = true;
			
			String actResult = Boolean.toString(actSelectedMasterSearchCheckbox);
			
			

			System.out.println("Account Name Check as Checked Value Actual           :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);

			if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox && actRow1List.equalsIgnoreCase(expRow1List)) 
			{
				
				return true;
			} 
			else 
			{
				
				return false;
			}
		}
		
		public static boolean checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachMonth() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			masterPropertiesBtn.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayDrOrCrTotalsForEachMonthRadioBtnInProperties));
			displayDrOrCrTotalsForEachMonthRadioBtnInProperties.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
			masterEditBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(Keys.END);
			nameTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			nameTxt.sendKeys("cust display dr/cr totals for each month");
			nameTxt.sendKeys(Keys.TAB);
			
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage = "Updated Successfully";
			String actMessage = checkValidationMessage(expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				
				return true;
			} 
			else
			{
				return false;
			}
		}
		
			@FindBy(xpath="//*[@id='id_transaction_viewcontainer']/li[1]/a")
			private static WebElement allVouchersInHomePage;
			
			@FindBy(xpath="//div[@id='btnCustomize']//span[@class='icon-settings icon-font6']")
		    private static WebElement  customizeBtn;
			
		    @FindBy(xpath="//table[@id='id_rc_columnheadertable']/thead/tr/th/div/p")
			private static List<WebElement>  custBodyHeaderList;
		    
		    @FindBy(xpath="//*[@id='plnCustomizecolumn']/div/span[4]/a")
			private static WebElement  custRemoveBtn;
		    
		    @FindBy(xpath="//div[@class='col-sm-12 toolbar_button_text font-6'][contains(text(),'Save')]")
			private static WebElement  custSaveBtn;
			
			@FindBy(xpath="//*[@id='btnCustomizeClose']/div[1]/span")
			private static WebElement  custCancelBtn;
		
		@FindBy(xpath="//span[@class='icon-financial icon-font1']")
		private static WebElement  finacinalsMenu;
		
		@FindBy(xpath="//*[@id='558']/span")
		private static WebElement  receivableAndPayableAnalysisMenu;
		
		@FindBy(xpath="//*[@id='605']")
		private static WebElement  customerDetailMenu;
		
		
		@FindBy(xpath="//*[@id='560']")
		private static WebElement  cutomerStatementsBtn;
		
		
		@FindBy(xpath="//*[@id='reportViewControls']/ul/li/span[4]/i")
		private static WebElement  cutomerStatementsOkBtn;
		

		@FindBy(xpath="//*[@id='rptheading']/div/span[2]")
		private static WebElement  customerStaementsReportTitle;
		
		
		
		
		
		
		
		
		
		
		
		@FindBy(xpath="//input[@id='id_header_4']")
		private static WebElement  customerAccountTxt;
		
		@FindBy(xpath="//*[@id='id_header_2']")
		private static WebElement  dateText;
		 
		
		@FindBy(xpath="//*[@id='61']/span")
		private static WebElement  financialsTransactionMenu; 
		@FindBy(xpath="//a[@id='2014']//span[contains(text(),'Sales')]")
		private static WebElement  financialTransactionSalesMenu;
		
		@FindBy(xpath="//span[contains(text(),'Sales invoice VAT')]")
		private static WebElement  salesInvoiceVATVoucher;
		
		@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-new icon-font6']")//*[@id="btnNew"]/i
		private static WebElement  newBtn;
		
		@FindBy(xpath="//*[@id='btnNew']/i")
		private static WebElement  newBtnInGrp;
		
		
		@FindBy(xpath="//div[@id='id_transaction_homescreen_edit']//span[@class='icon-edit icon-font6 ImagesinArabic']")
		private static WebElement  editBtn;

		@FindBy(xpath="//span[@class='icon-print icon-font6']")
		private static WebElement  printBtn;
		
		@FindBy(xpath="//div[@id='id_transaction_homescreen_Delete']//span[@class='icon-delete icon-font6']")
		private static WebElement  voucherHomeDeleteBtn;
		
		@FindBy(xpath="//span[@class='icon-authorize icon-font6']")
		private static WebElement  authorizeBtn;
		
		@FindBy(xpath="//*[@id='id_transactionentry_mobile_toolbar']/div/div[11]")
		private static WebElement  POauthorizeBtn;
		
		
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
		
		 
		@FindBy(xpath="//input[@id='id_header_268435460']")
		private static WebElement  warehouseTxt;
		
		@FindBy(xpath="//tbody[@id='id_header_268435460_table_body']/tr/td[2]")
		private static List<WebElement> warehouseHeaderComboList;
		
		@FindBy(xpath="//tbody[@id='id_body_23_table_body']/tr/td[2]")
		private static List<WebElement> itemComboList;
		
		
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
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
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
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[20]")
		private static WebElement  select1stRow_19thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[21]")
		private static WebElement  select1stRow_20thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[22]")
		private static WebElement  select1stRow_21stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[23]")
		private static WebElement  select1stRow_22ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[24]")
		private static WebElement  select1stRow_23rdColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[25]")
		private static WebElement  select1stRow_24thColumn;
		
		
		
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
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
		private static WebElement  select2ndRow_10thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
		private static WebElement  select2ndRow_11thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
		private static WebElement  select2ndRow_12thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[14]")
		private static WebElement  select2ndRow_13thColumn;
		
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
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[20]")
		private static WebElement  select3rdRow_19thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[21]")
		private static WebElement  select3rdRow_20thColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[22]")
		private static WebElement  select3rdRow_21stColumn;
		
		
		
		@FindBy(xpath="//input[@id='id_body_23']")
		private static WebElement  enter_ItemTxt;
		
		@FindBy(xpath="//input[@id='id_body_12']")
		private static WebElement  enter_SalesAccountTxt;
		
		@FindBy(xpath="//input[@id='id_body_24']")
		private static WebElement  enter_UnitTxt;
		
		@FindBy(xpath="//input[@id='id_body_26']")
		private static WebElement  enter_Quantity;
		
		@FindBy(xpath="//input[@id='id_body_27']")
		private static WebElement  enter_Rate;
		
		@FindBy(xpath="//input[@id='id_body_28']")
		private static WebElement  enter_Gross;
		
		@FindBy(xpath="//*[@id='id_body_33554529']")
		private static WebElement  enter_Vat;
		
		@FindBy(xpath="//*[@id='id_body_33554530']")
		private static WebElement  enter_Taxable;
		
		
		
		
		
		@FindBy (xpath="//input[@id='id_body_38']")
		private static WebElement enter_RMA;
		
		@FindBy(xpath="//input[@id='id_body_13']")
		private static WebElement  enter_Batch;
		
		@FindBy(xpath="//input[@id='id_body_12']")
		private static WebElement  enter_DebitACTxt;
		
		 
		@FindBy(xpath="//input[@id='id_body_37']")
		private static WebElement enter_Expirydate;
		
		@FindBy(xpath="//input[@id='id_body_36']")
		private static WebElement enter_MfgDate;
		
		@FindBy(xpath="//input[@id='id_body_108']")
		private static WebElement enter_BatchRate;
		
		@FindBy(xpath="//input[@id='id_body_109']")
		private static WebElement enter_BatchRateValue1;
		
		@FindBy(xpath="//input[@id='id_body_110']")
		private static WebElement enter_BatchRateValue2;
		
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
		
		@FindBy(xpath="//*[@id='id_transactionentry_save']")
		private static WebElement  voucherSaveBtn;
		
		@FindBy(xpath="//div[@id='dvHomeTransClose']")  
		private static WebElement  voucherhomeCloseBtn;
		
		
		@FindBy(xpath="//input[@id='id_header_268435459']")
		private static WebElement  departmentTxt;	
		
		@FindBy(xpath="//i[@class='icon-pick icon-font5']")
		private static WebElement batchPickOnFIFOIcon;
		
		@FindBy(xpath="//label[@id='div_Ok']")
		private static WebElement batchOkIcon;

@FindBy(xpath="//tbody[@id='id_header_268435459_table_body']/tr/td[2]")
private static List<WebElement> departmentListCount;

@FindBy(xpath="//input[@id='id_header_268435470']")
private static WebElement  salesInvoiceVATPlaceOFSupply;

@FindBy(xpath="//tbody[@id='id_header_268435470_table_body']/tr/td[2]")
private static List<WebElement> placeOFSupplyList;


@FindBy(xpath="//*[@id='id_transaction_entry_detail_workflow_popup_body']/tr")
private static List<WebElement>  LinkRowCount;

 @FindBy(xpath="//*[@id='id_body_33554511']")
 private static WebElement enter_AQTxt;
 
 @FindBy(xpath="//*[@id='id_body_33554512']")
 private static WebElement enter_FQTxt;
 
 @FindBy(xpath="//*[@id='id_body_89']")
 private static WebElement enter_QuantityToRelease;

 
 @FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[4]")
 private static List<WebElement> voucherGridDocNo;

 @FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[11]")
 private static List<WebElement> voucherGridSuspendStatus;

 @FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
 private static List<WebElement> voucherGridIndexChkBox;

 @FindBy(xpath="//a[contains(text(),'Pending Sales Orders')]")
 private static WebElement  homepagePendingSalesOrders;
 
 @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[21]")
 private static WebElement  select2ndRow_20thColumn;

 @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[22]")
 private static WebElement  select2ndRow_21thColumn;
	
	
 @FindBy(xpath="//span[contains(text(),'Sales Returns')]")
 private static WebElement  salesReturnsVoucher;

 @FindBy(xpath="//ul[@id='id_transaction_viewcontainer']//li[2]")
 private static WebElement  pendingSalesInvoicesView;
	
 @FindBy(xpath="//span[contains(@class,'icon-settings icon-font1')]")
 private static WebElement settingsMenu;
 
 @FindBy(xpath="//div[contains(text(),'Sales invoice VAT')]")
 private static WebElement draggedSalesInvoicesVAT; 

@FindBy(xpath="//input[@id='id_header_268435470']")
private static WebElement  placeOFSupplyTxt;

@FindBy(xpath="//input[@id='id_header_268435471']")
private static WebElement  jurisdictionTxt;

@FindBy(xpath="//input[@id='id_body_536870916']")
private static WebElement enter_WarehouseTxt;


@FindBy(xpath="//input[@id='id_body_12']")
private static WebElement  enter_PurchaseAccountTxt;

@FindBy(xpath="//input[@id='id_body_33554496']")
private static WebElement enter_PvVat;

@FindBy(xpath="//input[@id='id_body_16777313']")
private static WebElement  enter_TaxCode;


		@FindBy(xpath="//*[@id='id_header_268435459_table_body']/tr/td[2]")
		private static List<WebElement> openingBalDepartmentList;
		
		@FindBy(xpath="//input[@id='id_body_12']")
		private static WebElement  enter_AccountTxt;
		
		@FindBy(xpath="//*[@id='id_body_12_table_body']/tr/td[2]")
		private static List<WebElement> openingBalAccountListInGrid;
		
		@FindBy(xpath="//input[@id='id_body_18']")
		private static WebElement  enter_DebitTxt;
		
		@FindBy(xpath="//input[@id='id_body_19']")
		private static WebElement  enter_CreditTxt;
		
		@FindBy(xpath="//*[@id='lblAccount']")
		private static WebElement  billRefPartyName;
		
		@FindBy(xpath="//table[@id='id_Adjustment_Grid']")
		private static WebElement billRefAdjustBillsGrid;
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr")
		private static List<WebElement> billRefAdjustBillsGridList;
		
		
		
		
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
		
		@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[13]")
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
		
		
		public static void checkDeleteLinkStatus() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
		public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			
			
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
			salesInvoiceVATVoucher.click();
			
			Thread.sleep(2000);
			
			checkDeleteLinkStatus();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			    	
			checkValidationMessage("Screen opened");
			
			    	
			    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
			    	dateText.click();
			    	dateText.sendKeys(Keys.HOME);
			    	Thread.sleep(1000);
			    	dateText.sendKeys("29/01/2021");
			    	dateText.sendKeys(Keys.TAB);
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.sendKeys("cust_display_dr/cr_totals_for_each_month");
			Thread.sleep(3000);
			customerAccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.END);
			departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			departmentTxt.sendKeys(Keys.SPACE);
				
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Dubai"))
				{
					departmentListCount.get(i).click();
					
					Thread.sleep(1000);
					
					if(getIsAlertPresent())
					{
						getAlert().accept();
					}
					
					break;
				}
			}
				
			departmentTxt.sendKeys(Keys.TAB);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
			salesInvoiceVATPlaceOFSupply.click();
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
			int placeOFSupplyListCount=placeOFSupplyList.size();
			
			System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
				
			for(int i=0 ; i < placeOFSupplyListCount ;i++)
			{
				String data=placeOFSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeOFSupplyList.get(i).click();
					
					break;
				}
			}
				
			
			Thread.sleep(2000);
			
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
			jurisdictionTxt.click();
			jurisdictionTxt.sendKeys(Keys.END);
			jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			jurisdictionTxt.sendKeys("DUBAI");
			Thread.sleep(2000);
			jurisdictionTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	    	select1stRow_1stColumn.click();
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
	    	enter_WarehouseTxt.sendKeys("Hyderabad");
	    	Thread.sleep(3000);
	    	enter_WarehouseTxt.sendKeys(Keys.TAB);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	    	enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
	    	Thread.sleep(3000);
	    	enter_ItemTxt.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
	    	select1stRow_5thColumn.click();
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
	    	select1stRow_9thColumn.click();
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
	    	enter_AQTxt.sendKeys("1");
	    	enter_AQTxt.sendKeys(Keys.TAB);
			
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
	    	enter_FQTxt.sendKeys("0");
	    	enter_FQTxt.sendKeys(Keys.TAB);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
	    	select1stRow_12thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			
			
		
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
			enter_QuantityToRelease.click();
			enter_QuantityToRelease.sendKeys(Keys.TAB);*/
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.click();*/
			enter_Rate.clear();
			enter_Rate.sendKeys("200");
			enter_Rate.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
			select1stRow_17thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
			enter_Vat.click();
			enter_Vat.sendKeys(Keys.TAB);
			
			
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
			select1stRow_18thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
			enter_Taxable.click();*/
			
			Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			 voucherSaveBtn.click();
			
			 Thread.sleep(2000);
			
			
	
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			 billRefPickIcon.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			 billRefOkBtn.click();
			 
			 String expSavingMessage1 = "Voucher saved successfully";

			 String actSavingMessage = checkValidationMessage(expSavingMessage1);
			
			if(actSavingMessage.equalsIgnoreCase(expSavingMessage1))
			{
				return true;
			}
			else
			{
				return false;
			}
		
			
		}
		
		
		public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth2() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
			dateText.click();
			dateText.sendKeys(Keys.HOME);
	    	Thread.sleep(1000);
			dateText.sendKeys("28/02/2021");
			dateText.sendKeys(Keys.TAB);
	  		
	    		    	
			
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
	customerAccountTxt.sendKeys("cust_display_dr/cr_totals_for_each_month");
	Thread.sleep(3000);
	customerAccountTxt.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.click();
	departmentTxt.sendKeys(Keys.END);
	departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	departmentTxt.sendKeys(Keys.SPACE);
		
	int departmentcount=departmentListCount.size();
	
	System.err.println(departmentcount);
		
	for(int i=0 ; i < departmentcount ;i++)
	{
		String data=departmentListCount.get(i).getText();
		
		if(data.equalsIgnoreCase("Dubai"))
		{
			departmentListCount.get(i).click();
			
			Thread.sleep(1000);
			
			if(getIsAlertPresent())
			{
				getAlert().accept();
			}
			
			break;
		}
	}
		
	departmentTxt.sendKeys(Keys.TAB);	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
	salesInvoiceVATPlaceOFSupply.click();
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
	
	
	int placeOFSupplyListCount=placeOFSupplyList.size();
	
	System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
		
	for(int i=0 ; i < placeOFSupplyListCount ;i++)
	{
		String data=placeOFSupplyList.get(i).getText();
		
		if(data.equalsIgnoreCase("Abu Dhabi"))
		{
			placeOFSupplyList.get(i).click();
			
			break;
		}
	}
		
	
	Thread.sleep(2000);
	
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
	jurisdictionTxt.click();
	jurisdictionTxt.sendKeys(Keys.END);
	jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	jurisdictionTxt.sendKeys("DUBAI");
	Thread.sleep(2000);
	jurisdictionTxt.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
	enter_WarehouseTxt.sendKeys("Hyderabad");
	Thread.sleep(3000);
	enter_WarehouseTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
	Thread.sleep(3000);
	enter_ItemTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
	select1stRow_5thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
	select1stRow_9thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
	enter_AQTxt.sendKeys("5");
	enter_AQTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
	enter_FQTxt.sendKeys("5");
	enter_FQTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
	select1stRow_12thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();
	
	

	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
	enter_QuantityToRelease.click();
	enter_QuantityToRelease.sendKeys(Keys.TAB);*/
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();*/
	enter_Rate.clear();
	enter_Rate.sendKeys("20");
	enter_Rate.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);
	
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
	select1stRow_17thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
	enter_Vat.click();
	enter_Vat.sendKeys(Keys.TAB);
	
	
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
	select1stRow_18thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
	enter_Taxable.click();*/
	
	Thread.sleep(2000);
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	 voucherSaveBtn.click();
	
	 Thread.sleep(2000);
	
	

	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	 billRefPickIcon.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
	 billRefOkBtn.click();
	 
	 String expSavingMessage1 = "Voucher saved successfully";
	 String expSavingMessage2 = " : 2";
	 String actSavingMessage = checkValidationMessage(expSavingMessage1);
	
	if(actSavingMessage.startsWith(expSavingMessage1) && actSavingMessage.endsWith(expSavingMessage2))
	{
		return true;
	}
	else
	{
		return false;
	}

		}
		
		public static boolean checkLedgerReportForCreatedCustomer() throws InterruptedException
		{



			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
			 homeMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("cust_display_dr/cr_totals_for_each_month");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			   
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 masterRibbonToExpandOptions.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 
			 masterRibbonControlNextBtn.click(); 
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterLedgerBtn));
			 masterLedgerBtn.click();
			 
			 Thread.sleep(4000);
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1));
			
			/*Set<String> allWindows = getDriver().getWindowHandles();      
			for(String winHandle:allWindows)
			{
				String title = getDriver().switchTo().window(winHandle).getTitle();
				System.out.println("Window Title: "+title);
				Thread.sleep(5000);
				
				if(title.equalsIgnoreCase("Focus"))
				{
					
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ledgerTitle));
					 String ledgerTileText = ledgerTitle.getText();
					 System.out.println("Ledger Title: " +ledgerTileText);*/
					 
					 
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(dateTextInLedgerReportScreen));
					 
					 boolean actDateText = dateTextInLedgerReportScreen.isDisplayed();
					 boolean actOptionsToggle = optionsToggleBtnInLedgerReportScreen.isDisplayed();
					 boolean actCloseBtn = closeBtnInLedgerReportScreen.isDisplayed();
					 boolean actSearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actFirstPageBtn = firstPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actPreviousBtn = previousPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actsearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actnextPageBtn= nextPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actlastPageBtn = lastPageBtnInLedgerReportScreen.isDisplayed();
					 
					 
					 boolean expDateText = true;
					 boolean expOptionsToggle =true;
					 boolean expCloseBtn = true;
					 boolean expSearchTextField =true;
					 boolean expFirstPageBtn = true;
					 boolean expPreviousBtn = true;
					 boolean expsearchTextField = true;
					 boolean expnextPageBtn=true;
					 boolean explastPageBtn = true;
					 
					 
					 System.out.println("dateTextInLedgerReport           : "+actDateText               +" Value Expected : "+expDateText);
					 System.out.println("optionsToggleInLedgerReport      : "+actOptionsToggle          +" Value Expected : "+expOptionsToggle);
					 System.out.println("closeBtnInLedgerReport           : "+actCloseBtn               +" Value Expected : "+expCloseBtn);
					 System.out.println("serachTextFieldInLedgerReport    : "+actSearchTextField        +" Value Expected : "+expSearchTextField);
					 System.out.println("firstPageBtnInLedgerReport       : "+actFirstPageBtn           +" Value Expected : "+expFirstPageBtn);
					 System.out.println("previousPageBTnLedgerReport      : "+actPreviousBtn            +" Value Expected : "+expPreviousBtn);
					 System.out.println("nextPageBTnLedgerReport          : "+actnextPageBtn            +" Value Expected : "+expnextPageBtn);
					 System.out.println("lastPageBTnLedgerReport          : "+actlastPageBtn            +" Value Expected : "+explastPageBtn);			 
					
				/*}
				
				
			}*/
		    
			Thread.sleep(3000);
			
			 
			if(actDateText==expDateText && actOptionsToggle ==expOptionsToggle && actCloseBtn==expCloseBtn 
					&& actSearchTextField==expSearchTextField && actFirstPageBtn ==expFirstPageBtn
					&& actPreviousBtn ==expPreviousBtn &&actnextPageBtn ==expnextPageBtn && actlastPageBtn==explastPageBtn)
			{
				return true;
			}
			
			else 
			{
				return false;
			}
		
		
		
		}
		public static boolean checkLedgerReportDetailsForCreatedCustomer()
		{

			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[cust_display_dr/cr_totals_for_each_month CustCrDrTotals]";
			
			
			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[January, , , , , , , , , , , ]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsByWarehouseRow3ListArray.add(data);
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[29/01/2021, NDT55 : 1, Sales - Computers, 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, Indian Rupees]";
			
			
			int reportsByWarehouseRow4ListCount = reportsRow4List.size();
			ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow4ListCount;i++)
			{
				String data = reportsRow4List.get(i).getText();
				reportsByWarehouseRow4ListArray.add(data);
			}
			String actRow4List = reportsByWarehouseRow4ListArray.toString();
			String expRow4List = "[January, , 210.00, , , 14.70, , , 210.00, , , ]";
			
			
			int reportsByWarehouseRow5ListCount = reportsRow5List.size();
			ArrayList<String> reportsByWarehouseRow5ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow5ListCount;i++)
			{
				String data = reportsRow5List.get(i).getText();
				reportsByWarehouseRow5ListArray.add(data);
			}
			String actRow5List = reportsByWarehouseRow5ListArray.toString();
			String expRow5List = "[February, , , , , , , , , , , ]";
			
			
			int reportsByWarehouseRow6ListCount = reportsRow6List.size();
			ArrayList<String> reportsByWarehouseRow6ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow6ListCount;i++)
			{
				String data = reportsRow6List.get(i).getText();
				reportsByWarehouseRow6ListArray.add(data);
			}
			String actRow6List = reportsByWarehouseRow6ListArray.toString();
			String expRow6List = "[28/02/2021, NDT55 : 2, Sales - Computers, 210.00, , 420.00, 14.70, , 29.40, 210.00, , 420.00, Indian Rupees]";
			
			
			int reportsByWarehouseRow7ListCount = reportsRow7List.size();
			ArrayList<String> reportsByWarehouseRow7ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow7ListCount;i++)
			{
				String data = reportsRow7List.get(i).getText();
				reportsByWarehouseRow7ListArray.add(data);
			}
			String actRow7List = reportsByWarehouseRow7ListArray.toString();
			String expRow7List = "[February, , 210.00, , , 14.70, , , 210.00, , , ]";
			
			
			int reportsByWarehouseRow8ListCount = reportsRow8List.size();
			ArrayList<String> reportsByWarehouseRow8ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow8ListCount;i++)
			{
				String data = reportsRow8List.get(i).getText();
				reportsByWarehouseRow8ListArray.add(data);
			}
			String actRow8List = reportsByWarehouseRow8ListArray.toString();
			String expRow8List = "[Total, , , 420.00, , 420.00, 29.40, , 29.40, 420.00, , 420.00, ]";
			
			
			
			
			System.out.println("*********************************checkLedgerDetailsForVendorB*****************************************");
			
			System.out.println("ActualRow1List Values   " +actRow1List);
			System.out.println("ExpectedRow1List Values " +expRow1List);
			
			System.out.println("ActualRow2List Values  " +actRow2List);
			System.out.println("ExpectedRow1List Values" +expRow2List);
			
			System.out.println("ActualRow3List Values  " +actRow3List);
			System.out.println("ExpectedRow3List Values" +expRow3List);
			
			
			System.out.println("ActualRow4List Values   " +actRow4List);
			System.out.println("ExpectedRow4List Values " +expRow4List);
			
			System.out.println("ActualRow5List Values  " +actRow5List);
			System.out.println("ExpectedRow5List Values" +expRow5List);
			
			System.out.println("ActualRow6List Values  " +actRow6List);
			System.out.println("ExpectedRow6List Values" +expRow6List);
			
			System.out.println("ActualRow7ist Values   " +actRow7List);
			System.out.println("ExpectedRow7List Values " +expRow7List);
			
			System.out.println("ActualRow8List Values  " +actRow8List);
			System.out.println("ExpectedRow8List Values" +expRow8List);
			
		
			
			
			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
					&& actRow3List.equalsIgnoreCase(expRow3List) &&  actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) 
					&& actRow6List.equalsIgnoreCase(expRow6List) && actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List))
			{
				return true;
			} 
			else
			{
				return false;
			}
		
			
		}
		
		
		public static boolean checkCustomerStatementsReportForCreatedCustomerAccount() throws InterruptedException
		{
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1));
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));		
			finacinalsMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));		
			 receivableAndPayableAnalysisMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));		
			 customerDetailMenu.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsBtn));		
			 cutomerStatementsBtn.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("cust_display_dr/cr_totals_for_each_month");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsOkBtn));		
			 cutomerStatementsOkBtn.click();
			 
				
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerStaementsReportTitle));		
			 String actTitle = customerStaementsReportTitle.getText();
			 String expTitle = "Customer statements of cust_display_dr/cr_totals_for_each_month CustCrDrTotals";
			 
			if (actTitle.equalsIgnoreCase(expTitle))
			{
				return true;
			}
			else
			{

			}
			return false;
		}
		
		
		public static boolean checkCustomerStatementsReportDetailsForCreatedCustomer()
		{
			
			
			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[cust_display_dr/cr_totals_for_each_month CustCrDrTotals]";
			
			
			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[NDT55:1, 29/01/2021, cust_display_dr/cr_totals_for_each_month, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, 40, Indian Rupees, 29/01/2021, CustCrDrTotals]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsByWarehouseRow3ListArray.add(data);
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[NDT55:2, 28/02/2021, cust_display_dr/cr_totals_for_each_month, 210.00, , , 210.00, 420.00, 210.00, , , 210.00, 10, Indian Rupees, 28/02/2021, CustCrDrTotals]";
			
			
			int reportsByWarehouseRow4ListCount = reportsRow4List.size();
			ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow4ListCount;i++)
			{
				String data = reportsRow4List.get(i).getText();
				reportsByWarehouseRow4ListArray.add(data);
			}
			String actRow4List = reportsByWarehouseRow4ListArray.toString();
			String expRow4List = "[Total, , , 420.00, , , 420.00, 630.00, 420.00, , , 420.00, 50, , , ]";
			System.out.println("*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");
			
			System.out.println("ActualRow1List Values   " +actRow1List);
			System.out.println("ExpectedRow1List Values " +expRow1List);
			
			System.out.println("ActualRow2List Values  " +actRow2List);
			System.out.println("ExpectedRow1List Values" +expRow2List);
			
			System.out.println("ActualRow3List Values  " +actRow3List);
			System.out.println("ExpectedRow3List Values" +expRow3List);
			
			
			System.out.println("ActualRow4List Values   " +actRow4List);
			System.out.println("ExpectedRow4List Values " +expRow4List);
			
			
			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
					&& actRow3List.equalsIgnoreCase(expRow3List) &&  actRow4List.equalsIgnoreCase(expRow4List))
			{
				return true;
			}
			else
			{
			return false;
			}
		}
		
		//2
		
		public static boolean checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachDay() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
			 masterNewBtn.click();
			 
			
			 Thread.sleep(3000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys("cust_display_dr/cr_total_for_each_day");
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys("CustCrDrTotals");
		    codeTxt.sendKeys(Keys.TAB);
	      
		    Select accountTypeDrpdwn = new Select(accountTypeDropdown);
		    
			accountTypeDrpdwn.selectByVisibleText("Customer");
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();

			String expSaveAccountMessage = "Saved Successfully";	
			String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			

			System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);
			
			
			
			if(actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		public static boolean checkSavedAccountInTheAccountsList1()
		{
			
			int AccountsTableRow1Count = accountsTableFirstRow1.size();
			ArrayList<String> accountsListRow1Array = new ArrayList<String>();
			for(int i=11;i<AccountsTableRow1Count;i++)
			{
				String data = accountsTableFirstRow1.get(i).getText();
				accountsListRow1Array.add(data);
			}
			String actRow1List = accountsListRow1Array.toString();
			String expRow1List = "[cust_display_dr/cr_total_for_each_day, CustCrDrTotals, Customer]";
			
			System.out.println("ActualList "+actRow1List);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));
			accountsFirtCheckbox.click();
			
			boolean actSelectedMasterSearchCheckbox = accountsFirtCheckbox.isSelected();
			boolean expSelectedMasterSearchCheckbox = true;
			
			String actResult = Boolean.toString(actSelectedMasterSearchCheckbox);
			
			

			System.out.println("Account Name Check as Checked Value Actual           :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);

			if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox && actRow1List.equalsIgnoreCase(expRow1List)) 
			{
				
				return true;
			} 
			else 
			{
				
				return false;
			}
		}
		
		public static boolean checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachDay() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			masterPropertiesBtn.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayDrOrCrTotalsForEachDayRadioBtnInProperties));
			displayDrOrCrTotalsForEachDayRadioBtnInProperties.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
			masterEditBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(Keys.END);
			nameTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			nameTxt.sendKeys("cust_display_dr/cr_totals_for_each_day");
			nameTxt.sendKeys(Keys.TAB);
			
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage = "Updated Successfully";
			String actMessage = checkValidationMessage(expMessage);
			
			if (true) 
			{
				
				return true;
			} 
			else
			{
				return false;
			}
		}
		
		//
		
		
		
		public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			
			
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
			salesInvoiceVATVoucher.click();
			
			Thread.sleep(2000);
			
			checkDeleteLinkStatus();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			    	
			checkValidationMessage("Screen opened");
			
			    	
			    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
			    	dateText.click();
			    	dateText.sendKeys(Keys.HOME);
			    	Thread.sleep(1000);
			    	dateText.sendKeys("29/01/2021");
			    	dateText.sendKeys(Keys.TAB);
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.sendKeys("cust_display_dr/cr_totals_for_each_day");
			Thread.sleep(3000);
			customerAccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.END);
			departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			departmentTxt.sendKeys(Keys.SPACE);
				
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Dubai"))
				{
					departmentListCount.get(i).click();
					
					Thread.sleep(1000);
					
					if(getIsAlertPresent())
					{
						getAlert().accept();
					}
					
					break;
				}
			}
				
			departmentTxt.sendKeys(Keys.TAB);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
			salesInvoiceVATPlaceOFSupply.click();
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
			int placeOFSupplyListCount=placeOFSupplyList.size();
			
			System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
				
			for(int i=0 ; i < placeOFSupplyListCount ;i++)
			{
				String data=placeOFSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeOFSupplyList.get(i).click();
					
					break;
				}
			}
				
			
			Thread.sleep(2000);
			
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
			jurisdictionTxt.click();
			jurisdictionTxt.sendKeys(Keys.END);
			jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			jurisdictionTxt.sendKeys("DUBAI");
			Thread.sleep(2000);
			jurisdictionTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	    	select1stRow_1stColumn.click();
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
	    	enter_WarehouseTxt.sendKeys("Hyderabad");
	    	Thread.sleep(3000);
	    	enter_WarehouseTxt.sendKeys(Keys.TAB);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	    	enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
	    	Thread.sleep(3000);
	    	enter_ItemTxt.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
	    	select1stRow_5thColumn.click();
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
	    	select1stRow_9thColumn.click();
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
	    	enter_AQTxt.sendKeys("1");
	    	enter_AQTxt.sendKeys(Keys.TAB);
			
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
	    	enter_FQTxt.sendKeys("");
	    	enter_FQTxt.sendKeys(Keys.TAB);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
	    	select1stRow_12thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			
			
		
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
			enter_QuantityToRelease.click();
			enter_QuantityToRelease.sendKeys(Keys.TAB);*/
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.click();*/
			enter_Rate.clear();
			enter_Rate.sendKeys("200");
			enter_Rate.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
			select1stRow_17thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
			enter_Vat.click();
			enter_Vat.sendKeys(Keys.TAB);
			
			
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
			select1stRow_18thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
			enter_Taxable.click();*/
			
			Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			 voucherSaveBtn.click();
			
			 Thread.sleep(2000);
			
			
	
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			 billRefPickIcon.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			 billRefOkBtn.click();
			 
			 String expSavingMessage1 = "Voucher saved successfully";

			 String actSavingMessage = checkValidationMessage(expSavingMessage1);
			
			if(actSavingMessage.startsWith(expSavingMessage1))
			{
				return true;
			}
			else
			{
				return false;
			}
		
			
		}
		
		public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay2() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
			dateText.click();
			dateText.sendKeys(Keys.HOME);
	    	Thread.sleep(1000);
			dateText.sendKeys("28/02/2021");
			dateText.sendKeys(Keys.TAB);
	  		
	    		    	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.sendKeys("cust_display_dr/cr_totals_for_each_day");
			Thread.sleep(3000);
			customerAccountTxt.sendKeys(Keys.TAB);
	
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.END);
			departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			departmentTxt.sendKeys(Keys.SPACE);
		
	int departmentcount=departmentListCount.size();
	
	System.err.println(departmentcount);
		
	for(int i=0 ; i < departmentcount ;i++)
	{
		String data=departmentListCount.get(i).getText();
		
		if(data.equalsIgnoreCase("Dubai"))
		{
			departmentListCount.get(i).click();
			
			Thread.sleep(1000);
			
			if(getIsAlertPresent())
			{
				getAlert().accept();
			}
			
			break;
		}
	}
		
	departmentTxt.sendKeys(Keys.TAB);	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
	salesInvoiceVATPlaceOFSupply.click();
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
	
	
	int placeOFSupplyListCount=placeOFSupplyList.size();
	
	System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
		
	for(int i=0 ; i < placeOFSupplyListCount ;i++)
	{
		String data=placeOFSupplyList.get(i).getText();
		
		if(data.equalsIgnoreCase("Abu Dhabi"))
		{
			placeOFSupplyList.get(i).click();
			
			break;
		}
	}
		
	
	Thread.sleep(2000);
	
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
	jurisdictionTxt.click();
	jurisdictionTxt.sendKeys(Keys.END);
	jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	jurisdictionTxt.sendKeys("DUBAI");
	Thread.sleep(2000);
	jurisdictionTxt.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
	enter_WarehouseTxt.sendKeys("Hyderabad");
	Thread.sleep(3000);
	enter_WarehouseTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
	Thread.sleep(3000);
	enter_ItemTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
	select1stRow_5thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
	select1stRow_9thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
	enter_AQTxt.sendKeys("1");
	enter_AQTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
	enter_FQTxt.sendKeys("0");
	enter_FQTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
	select1stRow_12thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();
	
	

	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
	enter_QuantityToRelease.click();
	enter_QuantityToRelease.sendKeys(Keys.TAB);*/
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();*/
	enter_Rate.clear();
	enter_Rate.sendKeys("200");
	enter_Rate.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);
	
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
	select1stRow_17thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
	enter_Vat.click();
	enter_Vat.sendKeys(Keys.TAB);
	
	
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
	select1stRow_18thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
	enter_Taxable.click();*/
	
	Thread.sleep(2000);
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	 voucherSaveBtn.click();
	
	 Thread.sleep(2000);
	
	

	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	 billRefPickIcon.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
	 billRefOkBtn.click();
	 
	 String expSavingMessage1 = "Voucher saved successfully";
	 String expSavingMessage2 = " : 2";
	 String actSavingMessage = checkValidationMessage(expSavingMessage1);
	
	if(actSavingMessage.startsWith(expSavingMessage1) && actSavingMessage.endsWith(expSavingMessage2))
	{
		return true;
	}
	else
	{
		return false;
	}

		}
		
	//
		
		public static boolean checkLedgerReportForCreatedCustomer2() throws InterruptedException
		{



			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
			 homeMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("cust_display_dr/cr_totals_for_each_day");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			   
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 masterRibbonToExpandOptions.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 
			 masterRibbonControlNextBtn.click(); 
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterLedgerBtn));
			 masterLedgerBtn.click();
			 
			 Thread.sleep(4000);
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1));
			
			/*Set<String> allWindows = getDriver().getWindowHandles();      
			for(String winHandle:allWindows)
			{
				String title = getDriver().switchTo().window(winHandle).getTitle();
				System.out.println("Window Title: "+title);
				Thread.sleep(5000);
				
				if(title.equalsIgnoreCase("Focus"))
				{
					
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ledgerTitle));
					 String ledgerTileText = ledgerTitle.getText();
					 System.out.println("Ledger Title: " +ledgerTileText);*/
					 
					 
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(dateTextInLedgerReportScreen));
					 
					 boolean actDateText = dateTextInLedgerReportScreen.isDisplayed();
					 boolean actOptionsToggle = optionsToggleBtnInLedgerReportScreen.isDisplayed();
					 boolean actCloseBtn = closeBtnInLedgerReportScreen.isDisplayed();
					 boolean actSearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actFirstPageBtn = firstPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actPreviousBtn = previousPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actsearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actnextPageBtn= nextPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actlastPageBtn = lastPageBtnInLedgerReportScreen.isDisplayed();
					 
					 
					 boolean expDateText = true;
					 boolean expOptionsToggle =true;
					 boolean expCloseBtn = true;
					 boolean expSearchTextField =true;
					 boolean expFirstPageBtn = true;
					 boolean expPreviousBtn = true;
					 boolean expsearchTextField = true;
					 boolean expnextPageBtn=true;
					 boolean explastPageBtn = true;
					 
					 
					 System.out.println("dateTextInLedgerReport           : "+actDateText               +" Value Expected : "+expDateText);
					 System.out.println("optionsToggleInLedgerReport      : "+actOptionsToggle          +" Value Expected : "+expOptionsToggle);
					 System.out.println("closeBtnInLedgerReport           : "+actCloseBtn               +" Value Expected : "+expCloseBtn);
					 System.out.println("serachTextFieldInLedgerReport    : "+actSearchTextField        +" Value Expected : "+expSearchTextField);
					 System.out.println("firstPageBtnInLedgerReport       : "+actFirstPageBtn           +" Value Expected : "+expFirstPageBtn);
					 System.out.println("previousPageBTnLedgerReport      : "+actPreviousBtn            +" Value Expected : "+expPreviousBtn);
					 System.out.println("nextPageBTnLedgerReport          : "+actnextPageBtn            +" Value Expected : "+expnextPageBtn);
					 System.out.println("lastPageBTnLedgerReport          : "+actlastPageBtn            +" Value Expected : "+explastPageBtn);			 
					
				/*}
				
				
			}*/
		    
			Thread.sleep(3000);
			
			 
			if(actDateText==expDateText && actOptionsToggle ==expOptionsToggle && actCloseBtn==expCloseBtn 
					&& actSearchTextField==expSearchTextField && actFirstPageBtn ==expFirstPageBtn
					&& actPreviousBtn ==expPreviousBtn &&actnextPageBtn ==expnextPageBtn && actlastPageBtn==explastPageBtn)
			{
				return true;
			}
			
			else 
			{
				return false;
			}
		
		
		
		}
		public static boolean checkLedgerReportDetailsForCreatedCustomer2()
		{

			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[cust_display_dr/cr_totals_for_each_day CustCrDrTotals]";
			
			
			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[29-01-2021, , , , , , , , , , , ]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsByWarehouseRow3ListArray.add(data);
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[29/01/2021, NDT55 : 1, Sales - Computers, 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, Indian Rupees]";
			
			
			int reportsByWarehouseRow4ListCount = reportsRow4List.size();
			ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow4ListCount;i++)
			{
				String data = reportsRow4List.get(i).getText();
				reportsByWarehouseRow4ListArray.add(data);
			}
			String actRow4List = reportsByWarehouseRow4ListArray.toString();
			String expRow4List = "[29-01-2021, , 210.00, , , 14.70, , , 210.00, , , ]";
			
			
			int reportsByWarehouseRow5ListCount = reportsRow5List.size();
			ArrayList<String> reportsByWarehouseRow5ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow5ListCount;i++)
			{
				String data = reportsRow5List.get(i).getText();
				reportsByWarehouseRow5ListArray.add(data);
			}
			String actRow5List = reportsByWarehouseRow5ListArray.toString();
			String expRow5List = "[28-02-2021, , , , , , , , , , , ]";
			
			
			int reportsByWarehouseRow6ListCount = reportsRow6List.size();
			ArrayList<String> reportsByWarehouseRow6ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow6ListCount;i++)
			{
				String data = reportsRow6List.get(i).getText();
				reportsByWarehouseRow6ListArray.add(data);
			}
			String actRow6List = reportsByWarehouseRow6ListArray.toString();
			String expRow6List = "[28/02/2021, NDT55 : 2, Sales - Computers, 210.00, , 420.00, 14.70, , 29.40, 210.00, , 420.00, Indian Rupees]";
			
			
			int reportsByWarehouseRow7ListCount = reportsRow7List.size();
			ArrayList<String> reportsByWarehouseRow7ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow7ListCount;i++)
			{
				String data = reportsRow7List.get(i).getText();
				reportsByWarehouseRow7ListArray.add(data);
			}
			String actRow7List = reportsByWarehouseRow7ListArray.toString();
			String expRow7List = "[28-02-2021, , 210.00, , , 14.70, , , 210.00, , , ]";
			
			
			int reportsByWarehouseRow8ListCount = reportsRow8List.size();
			ArrayList<String> reportsByWarehouseRow8ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow8ListCount;i++)
			{
				String data = reportsRow8List.get(i).getText();
				reportsByWarehouseRow8ListArray.add(data);
			}
			String actRow8List = reportsByWarehouseRow8ListArray.toString();
			String expRow8List = "[Total, , , 420.00, , 420.00, 29.40, , 29.40, 420.00, , 420.00, ]";
			
			
			
			
			System.out.println("*********************************checkLedgerDetailsForVendorB*****************************************");
			
			System.out.println("ActualRow1List Values   " +actRow1List);
			System.out.println("ExpectedRow1List Values " +expRow1List);
			
			System.out.println("ActualRow2List Values  " +actRow2List);
			System.out.println("ExpectedRow1List Values" +expRow2List);
			
			System.out.println("ActualRow3List Values  " +actRow3List);
			System.out.println("ExpectedRow3List Values" +expRow3List);
			
			
			System.out.println("ActualRow4List Values   " +actRow4List);
			System.out.println("ExpectedRow4List Values " +expRow4List);
			
			System.out.println("ActualRow5List Values  " +actRow5List);
			System.out.println("ExpectedRow5List Values" +expRow5List);
			
			System.out.println("ActualRow6List Values  " +actRow6List);
			System.out.println("ExpectedRow6List Values" +expRow6List);
			
			System.out.println("ActualRow7ist Values   " +actRow7List);
			System.out.println("ExpectedRow7List Values " +expRow7List);
			
			System.out.println("ActualRow8List Values  " +actRow8List);
			System.out.println("ExpectedRow8List Values" +expRow8List);
			
		

			
			
			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
					&& actRow3List.equalsIgnoreCase(expRow3List) &&  actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) 
					&& actRow6List.equalsIgnoreCase(expRow6List) && actRow7List.equalsIgnoreCase(expRow7List) && actRow8List.equalsIgnoreCase(expRow8List))
			{
				return true;
			} 
			else
			{
				return false;
			}
		
			
		}
		
		
		public static boolean checkCustomerStatementsReportForCreatedCustomerAccount2() throws InterruptedException
		{
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(0));
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));		
		 	finacinalsMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));		
			 receivableAndPayableAnalysisMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));		
			 customerDetailMenu.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsBtn));		
			 cutomerStatementsBtn.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("cust_display_dr/cr_totals_for_each_day");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsOkBtn));		
			 cutomerStatementsOkBtn.click();
			 
				
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerStaementsReportTitle));		
			 String actTitle = customerStaementsReportTitle.getText();
			 String expTitle = "Customer statements of cust_display_dr/cr_totals_for_each_day CustCrDrTotals";
			 
			if (actTitle.equalsIgnoreCase(expTitle))
			{
				return true;
			}
			else
			{

			}
			return false;
		}
		
		
		public static boolean checkCustomerStatementsReportDetailsForCreatedCustomerAccount()
		{
			
			
			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[cust_display_dr/cr_totals_for_each_day CustCrDrTotals]";
			
			
			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[NDT55:1, 29/01/2021, cust_display_dr/cr_totals_for_each_day, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, 40, Indian Rupees, 29/01/2021, CustCrDrTotals]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsByWarehouseRow3ListArray.add(data);
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[NDT55:2, 28/02/2021, cust_display_dr/cr_totals_for_each_day, 210.00, , , 210.00, 420.00, 210.00, , , 210.00, 10, Indian Rupees, 28/02/2021, CustCrDrTotals]";
			
			
			int reportsByWarehouseRow4ListCount = reportsRow4List.size();
			ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow4ListCount;i++)
			{
				String data = reportsRow4List.get(i).getText();
				reportsByWarehouseRow4ListArray.add(data);
			}
			String actRow4List = reportsByWarehouseRow4ListArray.toString();
			String expRow4List = "[Total, , , 420.00, , , 420.00, 630.00, 420.00, , , 420.00, 50, , , ]";
			System.out.println("*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");
			
			System.out.println("ActualRow1List Values   " +actRow1List);
			System.out.println("ExpectedRow1List Values " +expRow1List);
			
			System.out.println("ActualRow2List Values  " +actRow2List);
			System.out.println("ExpectedRow1List Values" +expRow2List);
			
			System.out.println("ActualRow3List Values  " +actRow3List);
			System.out.println("ExpectedRow3List Values" +expRow3List);
			
			
			System.out.println("ActualRow4List Values   " +actRow4List);
			System.out.println("ExpectedRow4List Values " +expRow4List);
			
			
			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
					&& actRow3List.equalsIgnoreCase(expRow3List) &&  actRow4List.equalsIgnoreCase(expRow4List))
			{
				return true;
			}
			else
			{
			return false;
			}
		}
		
		//display Ledger by currency property 
		
		public static boolean checkAccouncreatedWithPropertyAsDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
			 masterNewBtn.click();
			 
			
			 Thread.sleep(3000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys("cust_display_ledger_by_currency");
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys("CustLedger");
		    codeTxt.sendKeys(Keys.TAB);
	      
		    Select accountTypeDrpdwn = new Select(accountTypeDropdown);
		    
			accountTypeDrpdwn.selectByVisibleText("Customer");	
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();

			String expSaveAccountMessage = "Saved Successfully";	
			String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			

			System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);
			
			
			
			if(actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		public static boolean checkSavedAccountInTheAccountsList2()
		{
			
			int AccountsTableRow1Count = accountsTableFirstRow1.size();
			ArrayList<String> accountsListRow1Array = new ArrayList<String>();
			for(int i=11;i<AccountsTableRow1Count;i++)
			{
				String data = accountsTableFirstRow1.get(i).getText();
				accountsListRow1Array.add(data);
			}
			String actRow1List = accountsListRow1Array.toString();
			String expRow1List = "[cust_display_ledger_by_currency, CustLedger, Customer]";
			
			System.out.println("ActualList "+actRow1List);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));
			accountsFirtCheckbox.click();
			
			boolean actSelectedMasterSearchCheckbox = accountsFirtCheckbox.isSelected();
			boolean expSelectedMasterSearchCheckbox = true;
			
			String actResult = Boolean.toString(actSelectedMasterSearchCheckbox);
			
			

			System.out.println("Account Name Check as Checked Value Actual           :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);

			if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox && actRow1List.equalsIgnoreCase(expRow1List)) 
			{
				
				return true;
			} 
			else 
			{
				
				return false;
			}
		}
		
		public static boolean checkPropertiesForCreatedAccountAsDisplayLedgerByCurrency() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			masterPropertiesBtn.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayLedgerByCurrencyCheckboxInProperties));
			displayLedgerByCurrencyCheckboxInProperties.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
			masterEditBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(Keys.END);
			nameTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			nameTxt.sendKeys("cust_display_ledger_by_Currency");
			nameTxt.sendKeys(Keys.TAB);
			
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage = "Updated Successfully";
			String actMessage = checkValidationMessage(expMessage);
			
			if (actMessage.equalsIgnoreCase(expMessage)) 
			{
				
				return true;
			} 
			else
			{
				return false;
			}
		}
		
		//
		
		
		
		public static boolean checkRaiseSalesInvoivesVATForCustomerDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			
			
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
			salesInvoiceVATVoucher.click();
			
			Thread.sleep(2000);
			
			checkDeleteLinkStatus();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			    	
			checkValidationMessage("Screen opened");
			
			    	
			    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
			    	dateText.click();
			    	dateText.sendKeys(Keys.HOME);
			    	Thread.sleep(1000);
			    	dateText.sendKeys("29/01/2021");
			    	dateText.sendKeys(Keys.TAB);
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.sendKeys("cust_display_ledger_by_Currency");
			Thread.sleep(3000);
			customerAccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.END);
			departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			departmentTxt.sendKeys(Keys.SPACE);
				
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Dubai"))
				{
					departmentListCount.get(i).click();
					
					Thread.sleep(1000);
					
					if(getIsAlertPresent())
					{
						getAlert().accept();
					}
					
					break;
				}
			}
				
			departmentTxt.sendKeys(Keys.TAB);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
			salesInvoiceVATPlaceOFSupply.click();
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
			int placeOFSupplyListCount=placeOFSupplyList.size();
			
			System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
				
			for(int i=0 ; i < placeOFSupplyListCount ;i++)
			{
				String data=placeOFSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeOFSupplyList.get(i).click();
					
					break;
				}
			}
				
			
			Thread.sleep(2000);
			
			salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
			jurisdictionTxt.click();
			jurisdictionTxt.sendKeys(Keys.END);
			jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			jurisdictionTxt.sendKeys("DUBAI");
			Thread.sleep(2000);
			jurisdictionTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	    	select1stRow_1stColumn.click();
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
	    	enter_WarehouseTxt.sendKeys("Hyderabad");
	    	Thread.sleep(3000);
	    	enter_WarehouseTxt.sendKeys(Keys.TAB);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	    	enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
	    	Thread.sleep(3000);
	    	enter_ItemTxt.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
	    	select1stRow_5thColumn.click();
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
	    	select1stRow_9thColumn.click();
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
	    	enter_AQTxt.sendKeys("1");
	    	enter_AQTxt.sendKeys(Keys.TAB);
			
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
	    	enter_FQTxt.sendKeys("");
	    	enter_FQTxt.sendKeys(Keys.TAB);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
	    	select1stRow_12thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			
			
		
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
			enter_QuantityToRelease.click();
			enter_QuantityToRelease.sendKeys(Keys.TAB);*/
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.click();*/
			enter_Rate.clear();
			enter_Rate.sendKeys("200");
			enter_Rate.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
			select1stRow_17thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
			enter_Vat.click();
			enter_Vat.sendKeys(Keys.TAB);
			
			
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
			select1stRow_18thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
			enter_Taxable.click();*/
			
			Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			 voucherSaveBtn.click();
			
			 Thread.sleep(2000);
			
			
	
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			 billRefPickIcon.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			 billRefOkBtn.click();
			 
			 String expSavingMessage1 = "Voucher saved successfully";

			 String actSavingMessage = checkValidationMessage(expSavingMessage1);
			
			if(actSavingMessage.startsWith(expSavingMessage1))
			{
				return true;
			}
			else
			{
				return false;
			}
		
			
		}
		

		public static boolean checkLedgerReportForCreatedCustomer3() throws InterruptedException
		{



			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
			 homeMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("cust_display_ledger_by_Currency");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			   
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
			 masterRibbonToExpandOptions.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
			 
			 masterRibbonControlNextBtn.click(); 
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 masterRibbonControlNextBtn.click();
			 
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterLedgerBtn));
			 masterLedgerBtn.click();
			 
			 Thread.sleep(4000);
			
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(1));
			
			/*Set<String> allWindows = getDriver().getWindowHandles();      
			for(String winHandle:allWindows)
			{
				String title = getDriver().switchTo().window(winHandle).getTitle();
				System.out.println("Window Title: "+title);
				Thread.sleep(5000);
				
				if(title.equalsIgnoreCase("Focus"))
				{
					
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ledgerTitle));
					 String ledgerTileText = ledgerTitle.getText();
					 System.out.println("Ledger Title: " +ledgerTileText);*/
					 
					 
					 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(dateTextInLedgerReportScreen));
					 
					 boolean actDateText = dateTextInLedgerReportScreen.isDisplayed();
					 boolean actOptionsToggle = optionsToggleBtnInLedgerReportScreen.isDisplayed();
					 boolean actCloseBtn = closeBtnInLedgerReportScreen.isDisplayed();
					 boolean actSearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actFirstPageBtn = firstPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actPreviousBtn = previousPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actsearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
					 boolean actnextPageBtn= nextPageBtnInLedgerReportScreen.isDisplayed();
					 boolean actlastPageBtn = lastPageBtnInLedgerReportScreen.isDisplayed();
					 
					 
					 boolean expDateText = true;
					 boolean expOptionsToggle =true;
					 boolean expCloseBtn = true;
					 boolean expSearchTextField =true;
					 boolean expFirstPageBtn = true;
					 boolean expPreviousBtn = true;
					 boolean expsearchTextField = true;
					 boolean expnextPageBtn=true;
					 boolean explastPageBtn = true;
					 
					 
					 System.out.println("dateTextInLedgerReport           : "+actDateText               +" Value Expected : "+expDateText);
					 System.out.println("optionsToggleInLedgerReport      : "+actOptionsToggle          +" Value Expected : "+expOptionsToggle);
					 System.out.println("closeBtnInLedgerReport           : "+actCloseBtn               +" Value Expected : "+expCloseBtn);
					 System.out.println("serachTextFieldInLedgerReport    : "+actSearchTextField        +" Value Expected : "+expSearchTextField);
					 System.out.println("firstPageBtnInLedgerReport       : "+actFirstPageBtn           +" Value Expected : "+expFirstPageBtn);
					 System.out.println("previousPageBTnLedgerReport      : "+actPreviousBtn            +" Value Expected : "+expPreviousBtn);
					 System.out.println("nextPageBTnLedgerReport          : "+actnextPageBtn            +" Value Expected : "+expnextPageBtn);
					 System.out.println("lastPageBTnLedgerReport          : "+actlastPageBtn            +" Value Expected : "+explastPageBtn);			 
					
				/*}
				
				
			}*/
		    
			Thread.sleep(3000);
			
			 
			if(actDateText==expDateText && actOptionsToggle ==expOptionsToggle && actCloseBtn==expCloseBtn 
					&& actSearchTextField==expSearchTextField && actFirstPageBtn ==expFirstPageBtn
					&& actPreviousBtn ==expPreviousBtn &&actnextPageBtn ==expnextPageBtn && actlastPageBtn==explastPageBtn)
			{
				return true;
			}
			
			else 
			{
				return false;
			}
		
		
		
		}
		
		public static boolean checkLedgerDetailsForCustomerDisplayLedgerByCurrency()
		{


			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[cust_display_ledger_by_Currency CustLedger]";
			
			
			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=2;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[Indian Rupees, , , , , , , , , , , ]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsByWarehouseRow3ListArray.add(data);
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[29/01/2021, NDT55 : 3, Sales - Computers, 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, Indian Rupees]";
			
			
			int reportsByWarehouseRow4ListCount = reportsRow4List.size();
			ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow4ListCount;i++)
			{
				String data = reportsRow4List.get(i).getText();
				reportsByWarehouseRow4ListArray.add(data);
			}
			String actRow4List = reportsByWarehouseRow4ListArray.toString();
			String expRow4List = "[Total, , , 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, ]";
			
		
			System.out.println("*********************************checkLedgerDetailsForVendorB*****************************************");
			
			System.out.println("ActualRow1List Values   " +actRow1List);
			System.out.println("ExpectedRow1List Values " +expRow1List);
			
			System.out.println("ActualRow2List Values  " +actRow2List);
			System.out.println("ExpectedRow1List Values" +expRow2List);
			
			System.out.println("ActualRow3List Values  " +actRow3List);
			System.out.println("ExpectedRow3List Values" +expRow3List);
			
			
			System.out.println("ActualRow4List Values   " +actRow4List);
			System.out.println("ExpectedRow4List Values " +expRow4List);
		
			
			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
					&& actRow3List.equalsIgnoreCase(expRow3List) &&  actRow4List.equalsIgnoreCase(expRow4List))
			{
				return true;
			} 
			else
			{
				return false;
			}
		}
		public static boolean checkCustomerStatementsReportForCreatedCustomerAccountDisplayLedgerByCurrency() throws InterruptedException
		{
			
			ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
			
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 2;

		 	getDriver().switchTo().window(openTabs.get(0));
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));		
		 	finacinalsMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));		
			 receivableAndPayableAnalysisMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));		
			 customerDetailMenu.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsBtn));		
			 cutomerStatementsBtn.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("cust_display_ledger_by_Currency");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsOkBtn));		
			 cutomerStatementsOkBtn.click();
			 
				
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerStaementsReportTitle));		
			 String actTitle = customerStaementsReportTitle.getText();
			 String expTitle = "Customer statements of cust_display_ledger_by_Currency CustLedger";
			 
			if (actTitle.equalsIgnoreCase(expTitle))
			{
				return true;
			}
			else
			{

			}
			return false;
		}
		
		
		public static boolean checkCustomerStatementsReportDetailsForCreatedCustomerDisplayLedgerByCurrency()
		{
			
			
			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[cust_display_ledger_by_Currency CustLedger]";
			
			
			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				reportsByWarehouseRow2ListArray.add(data);
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[NDT55:3, 29/01/2021, cust_display_ledger_by_Currency, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, 40, Indian Rupees, 29/01/2021, CustLedger]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				reportsByWarehouseRow3ListArray.add(data);
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[Total, , , 210.00, , , 210.00, 210.00, 210.00, , , 210.00, 40, , , ]";
			System.out.println("*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");
			
			System.out.println("ActualRow1List Values   " +actRow1List);
			System.out.println("ExpectedRow1List Values " +expRow1List);
			
			System.out.println("ActualRow2List Values  " +actRow2List);
			System.out.println("ExpectedRow1List Values" +expRow2List);
			
			System.out.println("ActualRow3List Values  " +actRow3List);
			System.out.println("ExpectedRow3List Values" +expRow3List);
			
			
			
			if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
					&& actRow3List.equalsIgnoreCase(expRow3List))
			{
				return true;
			}
			else
			{
			return false;
			}
		}
		
		
	
	public static boolean checkGroupAccountCreateAndSelectPropertyASClubAllTransactionsOfEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		 mastersMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
		 accounts.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));		
		 masterAddGroupBtn.click();
		 
		 Thread.sleep(3000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Cust_ClubTransactionsOf_AllAccounts_Group");
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("clubTransactions");
	    codeTxt.sendKeys(Keys.TAB);
      
	    Thread.sleep(2000);
	    Select accountTypeDrpdwn = new Select(accountTypeDropdown);
	    accountTypeDrpdwn.selectByVisibleText("Customer");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));
		getAction().doubleClick(accountsFirtCheckbox).perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtnInGrp));
		newBtnInGrp.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("cust-club trans of all accts One");
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("custOne");
	    codeTxt.sendKeys(Keys.TAB);
      
	    Thread.sleep(2000);
	    accountTypeDrpdwn.selectByVisibleText("Customer");
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expSaveAccountMessage1 = "Saved Successfully";	
		String actSaveAccountMessage1 = checkValidationMessage(expSaveAccountMessage1);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("cust-club trans of all accts two");
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("custTwo");
	    codeTxt.sendKeys(Keys.TAB);
      
	    Thread.sleep(2000);
	    accountTypeDrpdwn.selectByVisibleText("Customer");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expSaveAccountMessage2 = "Saved Successfully";	
		String actSaveAccountMessage2 = checkValidationMessage(expSaveAccountMessage2);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNaviagtion));
		accountNaviagtion.click();
		
		
		
	
		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);
		
		
		if(actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsClubAllTransactionsOfEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));
		accountsFirtCheckbox.click();
		
		boolean actSelectedMasterSearchCheckbox = accountsFirtCheckbox.isSelected();
		boolean expSelectedMasterSearchCheckbox = true;
		
		String actResult = Boolean.toString(actSelectedMasterSearchCheckbox);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties));
		ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		

		System.out.println("Account Name Check as Checked Value Actual           :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);

		if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox) 
		{
			
			return true;
		} 
		else 
		{
			
			return false;
		}
	}
	
	

	public static boolean checkRaiseSalesInvoivesVATForCustomerAccountOneInGroup() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		Thread.sleep(2000);
		
		checkDeleteLinkStatus();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		
		    	
		    	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		    	dateText.click();
		    	dateText.sendKeys(Keys.HOME);
		    	Thread.sleep(1000);
		    	dateText.sendKeys("29/01/2021");
		    	dateText.sendKeys(Keys.TAB);
				*/
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("cust-club trans of all accts One");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Dubai"))
			{
				departmentListCount.get(i).click();
				
				Thread.sleep(1000);
				
				if(getIsAlertPresent())
				{
					getAlert().accept();
				}
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
		salesInvoiceVATPlaceOFSupply.click();
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
		
		
		int placeOFSupplyListCount=placeOFSupplyList.size();
		
		System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
			
		for(int i=0 ; i < placeOFSupplyListCount ;i++)
		{
			String data=placeOFSupplyList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOFSupplyList.get(i).click();
				
				break;
			}
		}
			
		
		Thread.sleep(2000);
		
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
		jurisdictionTxt.click();
		jurisdictionTxt.sendKeys(Keys.END);
		jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		jurisdictionTxt.sendKeys("DUBAI");
		Thread.sleep(2000);
		jurisdictionTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
    	select1stRow_1stColumn.click();
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
    	enter_WarehouseTxt.sendKeys("Hyderabad");
    	Thread.sleep(3000);
    	enter_WarehouseTxt.sendKeys(Keys.TAB);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
    	enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
    	Thread.sleep(3000);
    	enter_ItemTxt.sendKeys(Keys.TAB);

    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
    	select1stRow_5thColumn.click();
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
    	select1stRow_9thColumn.click();
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
    	enter_AQTxt.sendKeys("1");
    	enter_AQTxt.sendKeys(Keys.TAB);
		
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
    	enter_FQTxt.sendKeys("");
    	enter_FQTxt.sendKeys(Keys.TAB);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
    	select1stRow_12thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		
		
	
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
		enter_QuantityToRelease.click();
		enter_QuantityToRelease.sendKeys(Keys.TAB);*/
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();*/
		enter_Rate.clear();
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.click();
		enter_Vat.sendKeys(Keys.TAB);
		
		
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
		select1stRow_18thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
		enter_Taxable.click();*/
		
		Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		
		 Thread.sleep(2000);
		
		

		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 String expSavingMessage1 = "Voucher saved successfully";

		 String actSavingMessage = checkValidationMessage(expSavingMessage1);
		
		if(actSavingMessage.startsWith(expSavingMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}
	
		
	}
	
	public static boolean checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroup() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		dateText.click();
		dateText.sendKeys(Keys.HOME);
    	Thread.sleep(1000);
		dateText.sendKeys("28/02/2021");
		dateText.sendKeys(Keys.TAB);*/
  		
    		    	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("cust-club trans of all accts two");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);
	
int departmentcount=departmentListCount.size();

System.err.println(departmentcount);
	
for(int i=0 ; i < departmentcount ;i++)
{
	String data=departmentListCount.get(i).getText();
	
	if(data.equalsIgnoreCase("Dubai"))
	{
		departmentListCount.get(i).click();
		
		Thread.sleep(1000);
		
		if(getIsAlertPresent())
		{
			getAlert().accept();
		}
		
		break;
	}
}
	
departmentTxt.sendKeys(Keys.TAB);	

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
salesInvoiceVATPlaceOFSupply.click();
salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);


int placeOFSupplyListCount=placeOFSupplyList.size();

System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
	
for(int i=0 ; i < placeOFSupplyListCount ;i++)
{
	String data=placeOFSupplyList.get(i).getText();
	
	if(data.equalsIgnoreCase("Abu Dhabi"))
	{
		placeOFSupplyList.get(i).click();
		
		break;
	}
}
	

Thread.sleep(2000);

salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
jurisdictionTxt.click();
jurisdictionTxt.sendKeys(Keys.END);
jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
jurisdictionTxt.sendKeys("DUBAI");
Thread.sleep(2000);
jurisdictionTxt.sendKeys(Keys.TAB);

Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
select1stRow_1stColumn.click();
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
enter_WarehouseTxt.sendKeys("Hyderabad");
Thread.sleep(3000);
enter_WarehouseTxt.sendKeys(Keys.TAB);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
Thread.sleep(3000);
enter_ItemTxt.sendKeys(Keys.TAB);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
select1stRow_5thColumn.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
select1stRow_9thColumn.click();
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
enter_AQTxt.sendKeys("1");
enter_AQTxt.sendKeys(Keys.TAB);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
enter_FQTxt.sendKeys("0");
enter_FQTxt.sendKeys(Keys.TAB);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
select1stRow_12thColumn.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
select1stRow_14thColumn.click();



/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
enter_QuantityToRelease.click();
enter_QuantityToRelease.sendKeys(Keys.TAB);*/

/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
enter_Rate.click();*/
enter_Rate.clear();
enter_Rate.sendKeys("200");
enter_Rate.sendKeys(Keys.TAB);


getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
enter_Gross.click();
enter_Gross.sendKeys(Keys.TAB);




getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
select1stRow_17thColumn.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
enter_Vat.click();
enter_Vat.sendKeys(Keys.TAB);



/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
select1stRow_18thColumn.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
enter_Taxable.click();*/

Thread.sleep(2000);

 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
 voucherSaveBtn.click();

 Thread.sleep(2000);



 
 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
 billRefPickIcon.click();
 
 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
 billRefOkBtn.click();
 
 String expSavingMessage1 = "Voucher saved successfully";
 String expSavingMessage2 = " : 2";
 String actSavingMessage = checkValidationMessage(expSavingMessage1);

if(actSavingMessage.startsWith(expSavingMessage1) && actSavingMessage.endsWith(expSavingMessage2))
{
	return true;
}
else
{
	return false;
}

	}
	
	
	public static boolean checkCustomerStatementsReportForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup() throws InterruptedException
	{
		
		
	 	
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));		
	 	finacinalsMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));		
		 receivableAndPayableAnalysisMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));		
		 customerDetailMenu.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsBtn));		
		 cutomerStatementsBtn.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
		 accountSearchTextArea.sendKeys("Cust_ClubTransactionsOf_AllAccounts_Group");
		 accountSearchTextArea.sendKeys(Keys.ENTER);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
		 accountsFirtCheckbox.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsOkBtn));		
		 cutomerStatementsOkBtn.click();
		 
			
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerStaementsReportTitle));		
		 String actTitle = customerStaementsReportTitle.getText();
		 String expTitle = "Customer statements of Cust_ClubTransactionsOf_AllAccounts_Group clubTransactions";
		 
		if (true)
		{
			return true;
		}
		else
		{

		}
		return false;
	}
	
	
	public static boolean checkCustomerStatementsReportDetailsForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup()
	{
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[Cust_ClubTransactionsOf_AllAccounts_Group clubTransactions]";
		
		
		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=3;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[cust-club trans of all accts One, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, 40, Indian Rupees, 10/03/2021, custOne]";
		
		
		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for(int i=3;i<reportsByWarehouseRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsByWarehouseRow3ListArray.add(data);
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[cust-club trans of all accts two, 210.00, , , 210.00, 420.00, 210.00, , , 210.00, 10, Indian Rupees, 10/03/2021, custTwo]";
		
		
		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsByWarehouseRow4ListArray.add(data);
		}
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[Total, , , 420.00, , , 420.00, 630.00, 420.00, , , 420.00, 50, , , ]";
		
		System.out.println("*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");
		
		System.out.println("ActualRow1List Values   " +actRow1List);
		System.out.println("ExpectedRow1List Values " +expRow1List);
		
		System.out.println("ActualRow2List Values  " +actRow2List);
		System.out.println("ExpectedRow1List Values" +expRow2List);
		
		System.out.println("ActualRow3List Values  " +actRow3List);
		System.out.println("ExpectedRow3List Values" +expRow3List);
		
		
		System.out.println("ActualRow4List Values   " +actRow4List);
		System.out.println("ExpectedRow4List Values " +expRow4List);
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actRow3List.equalsIgnoreCase(expRow3List) &&  actRow4List.equalsIgnoreCase(expRow4List))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	
//Group account properties for Display debit and credit totals under group
	
	
	public static boolean checkGroupAccountCreateAndSelectPropertyASDisplayDrOrCrTotalForEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		 mastersMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
		 accounts.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));		
		 masterAddGroupBtn.click();
		 
		 Thread.sleep(3000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Cust_Display Debit/Credit totals for each Account under group");
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("DrCrTotals");
	    codeTxt.sendKeys(Keys.TAB);
      
	    Thread.sleep(2000);
	    Select accountTypeDrpdwn = new Select(accountTypeDropdown);
	    accountTypeDrpdwn.selectByVisibleText("Customer");
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));
		getAction().doubleClick(accountsFirtCheckbox).perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtnInGrp));
		newBtnInGrp.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Cust-display cr dr total each account one");
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("customerOne");
	    codeTxt.sendKeys(Keys.TAB);
      
	    Thread.sleep(2000);
	    accountTypeDrpdwn.selectByVisibleText("Customer");
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expSaveAccountMessage1 = "Saved Successfully";	
		String actSaveAccountMessage1 = checkValidationMessage(expSaveAccountMessage1);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("Cust-display cr dr total each account two");
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("customerTwo");
	    codeTxt.sendKeys(Keys.TAB);
      
	    Thread.sleep(2000);
		
		
	    
		accountTypeDrpdwn.selectByVisibleText("Customer");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expSaveAccountMessage2 = "Saved Successfully";	
		String actSaveAccountMessage2 = checkValidationMessage(expSaveAccountMessage2);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNaviagtion));
		accountNaviagtion.click();
		
		
		
	
		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);
		
		
		if(actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsDisplayDrOrCrTotalForEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));
		accountsFirtCheckbox.click();
		
		boolean actSelectedMasterSearchCheckbox = accountsFirtCheckbox.isSelected();
		boolean expSelectedMasterSearchCheckbox = true;
		
		String actResult = Boolean.toString(actSelectedMasterSearchCheckbox);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties));
		displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		

		System.out.println("Account Name Check as Checked Value Actual           :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);

		if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox) 
		{
			
			return true;
		} 
		else 
		{
			
			return false;
		}
	}
	
	

	public static boolean checkRaiseSalesInvoivesVATForCustomerAccountOneInGroupForDrOrCrTotlas() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		Thread.sleep(2000);
		
		checkDeleteLinkStatus();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		
		    	
		    	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		    	dateText.click();
		    	dateText.sendKeys(Keys.HOME);
		    	Thread.sleep(1000);
		    	dateText.sendKeys("29/01/2021");
		    	dateText.sendKeys(Keys.TAB);
				*/
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Cust-display cr dr total each account one");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Dubai"))
			{
				departmentListCount.get(i).click();
				
				Thread.sleep(1000);
				
				if(getIsAlertPresent())
				{
					getAlert().accept();
				}
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
		salesInvoiceVATPlaceOFSupply.click();
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
		
		
		int placeOFSupplyListCount=placeOFSupplyList.size();
		
		System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
			
		for(int i=0 ; i < placeOFSupplyListCount ;i++)
		{
			String data=placeOFSupplyList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOFSupplyList.get(i).click();
				
				break;
			}
		}
			
		
		Thread.sleep(2000);
		
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
		jurisdictionTxt.click();
		jurisdictionTxt.sendKeys(Keys.END);
		jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		jurisdictionTxt.sendKeys("DUBAI");
		Thread.sleep(2000);
		jurisdictionTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
    	select1stRow_1stColumn.click();
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
    	enter_WarehouseTxt.sendKeys("Hyderabad");
    	Thread.sleep(3000);
    	enter_WarehouseTxt.sendKeys(Keys.TAB);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
    	enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
    	Thread.sleep(3000);
    	enter_ItemTxt.sendKeys(Keys.TAB);

    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
    	select1stRow_5thColumn.click();
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
    	select1stRow_9thColumn.click();
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
    	enter_AQTxt.sendKeys("1");
    	enter_AQTxt.sendKeys(Keys.TAB);
		
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
    	enter_FQTxt.sendKeys("");
    	enter_FQTxt.sendKeys(Keys.TAB);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
    	select1stRow_12thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		
		
	
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
		enter_QuantityToRelease.click();
		enter_QuantityToRelease.sendKeys(Keys.TAB);*/
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();*/
		enter_Rate.clear();
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.click();
		enter_Vat.sendKeys(Keys.TAB);
		
		
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
		select1stRow_18thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
		enter_Taxable.click();*/
		
		Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		
		 Thread.sleep(2000);
		
		

		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 String expSavingMessage1 = "Voucher saved successfully";

		 String actSavingMessage = checkValidationMessage(expSavingMessage1);
		
		if(actSavingMessage.startsWith(expSavingMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}
	
		
	}
	
	public static boolean checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroupForDrOrCrTotlas() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		dateText.click();
		dateText.sendKeys(Keys.HOME);
    	Thread.sleep(1000);
		dateText.sendKeys("28/02/2021");
		dateText.sendKeys(Keys.TAB);*/
  		
    		    	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Cust-display cr dr total each account two");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);
	
int departmentcount=departmentListCount.size();

System.err.println(departmentcount);
	
for(int i=0 ; i < departmentcount ;i++)
{
	String data=departmentListCount.get(i).getText();
	
	if(data.equalsIgnoreCase("Dubai"))
	{
		departmentListCount.get(i).click();
		
		Thread.sleep(1000);
		
		if(getIsAlertPresent())
		{
			getAlert().accept();
		}
		
		break;
	}
}
	
departmentTxt.sendKeys(Keys.TAB);	

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
salesInvoiceVATPlaceOFSupply.click();
salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);


int placeOFSupplyListCount=placeOFSupplyList.size();

System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
	
for(int i=0 ; i < placeOFSupplyListCount ;i++)
{
	String data=placeOFSupplyList.get(i).getText();
	
	if(data.equalsIgnoreCase("Abu Dhabi"))
	{
		placeOFSupplyList.get(i).click();
		
		break;
	}
}
	

Thread.sleep(2000);

salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
jurisdictionTxt.click();
jurisdictionTxt.sendKeys(Keys.END);
jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
jurisdictionTxt.sendKeys("DUBAI");
Thread.sleep(2000);
jurisdictionTxt.sendKeys(Keys.TAB);

Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
select1stRow_1stColumn.click();
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
enter_WarehouseTxt.sendKeys("Hyderabad");
Thread.sleep(3000);
enter_WarehouseTxt.sendKeys(Keys.TAB);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
Thread.sleep(3000);
enter_ItemTxt.sendKeys(Keys.TAB);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
select1stRow_5thColumn.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
select1stRow_9thColumn.click();
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
enter_AQTxt.sendKeys("1");
enter_AQTxt.sendKeys(Keys.TAB);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
enter_FQTxt.sendKeys("0");
enter_FQTxt.sendKeys(Keys.TAB);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
select1stRow_12thColumn.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
select1stRow_14thColumn.click();



/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
enter_QuantityToRelease.click();
enter_QuantityToRelease.sendKeys(Keys.TAB);*/

/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
enter_Rate.click();*/
enter_Rate.clear();
enter_Rate.sendKeys("200");
enter_Rate.sendKeys(Keys.TAB);


getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
enter_Gross.click();
enter_Gross.sendKeys(Keys.TAB);




getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
select1stRow_17thColumn.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
enter_Vat.click();
enter_Vat.sendKeys(Keys.TAB);



/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
select1stRow_18thColumn.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
enter_Taxable.click();*/

Thread.sleep(2000);

 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
 voucherSaveBtn.click();

 Thread.sleep(2000);



 
 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
 billRefPickIcon.click();
 
 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
 billRefOkBtn.click();
 
 String expSavingMessage1 = "Voucher saved successfully";
 String expSavingMessage2 = " : 2";
 String actSavingMessage = checkValidationMessage(expSavingMessage1);

if(actSavingMessage.startsWith(expSavingMessage1) && actSavingMessage.endsWith(expSavingMessage2))
{
	return true;
}
else
{
	return false;
}

}
	
	
	public static boolean checkCustomerStatementsReportForGroupAccountDisplayDrOrCrTotalsForEachAccountUnderGroup() throws InterruptedException
	{
		
		
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));		
	 	finacinalsMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));		
		 receivableAndPayableAnalysisMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));		
		 customerDetailMenu.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsBtn));		
		 cutomerStatementsBtn.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
		 accountSearchTextArea.sendKeys("Cust_Display Debit/Credit totals for each Account under group");
		 accountSearchTextArea.sendKeys(Keys.ENTER);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
		 accountsFirtCheckbox.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsOkBtn));		
		 cutomerStatementsOkBtn.click();
		 
			
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerStaementsReportTitle));		
		 String actTitle = customerStaementsReportTitle.getText();
		 String expTitle = "Customer statements of Cust_ClubTransactionsOf_AllAccounts_Group clubTransactions";
		 
		if (true)
		{
			return true;
		}
		else
		{

		}
		return false;
	}
	
	
	public static boolean checkCustomerStatementsReportDetailsForGroupAccountDisplayDrOrCrTotalsForEachAccountUnderGroup()
	{
		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[Cust_Display Debit/Credit totals for each Account under group]";
		
		
		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=3;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[cust-club trans of all accts One, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, 40, Indian Rupees, 10/03/2021, custOne]";
		
		
		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for(int i=3;i<reportsByWarehouseRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsByWarehouseRow3ListArray.add(data);
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[cust-club trans of all accts two, 210.00, , , 210.00, 420.00, 210.00, , , 210.00, 10, Indian Rupees, 10/03/2021, custTwo]";
		
		
		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			reportsByWarehouseRow4ListArray.add(data);
		}
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[Total, , , 420.00, , , 420.00, 630.00, 420.00, , , 420.00, 50, , , ]";
		
		System.out.println("*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");
		
		System.out.println("ActualRow1List Values   " +actRow1List);
		System.out.println("ExpectedRow1List Values " +expRow1List);
		
		System.out.println("ActualRow2List Values  " +actRow2List);
		System.out.println("ExpectedRow1List Values" +expRow2List);
		
		System.out.println("ActualRow3List Values  " +actRow3List);
		System.out.println("ExpectedRow3List Values" +expRow3List);
		
		
		System.out.println("ActualRow4List Values   " +actRow4List);
		System.out.println("ExpectedRow4List Values " +expRow4List);
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actRow3List.equalsIgnoreCase(expRow3List) &&  actRow4List.equalsIgnoreCase(expRow4List))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	

	
	
	//status as active in account properties
	
	public static boolean checkAccouncreatedWithPropertAsStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		 mastersMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
		 accounts.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
		 masterNewBtn.click();
		 
		
		 Thread.sleep(3000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("cust_display_when_StatusIsActive");
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("CustActive");
	    codeTxt.sendKeys(Keys.TAB);
      
	    Select accountTypeDrpdwn = new Select(accountTypeDropdown);
	    
		accountTypeDrpdwn.selectByVisibleText("Customer");	
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		

		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);
		
		
		
		if(actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean checkSavedAccountInTheAccountsListCustStatusActive()
	{
		
		int AccountsTableRow1Count = accountsTableFirstRow1.size();
		ArrayList<String> accountsListRow1Array = new ArrayList<String>();
		for(int i=11;i<AccountsTableRow1Count;i++)
		{
			String data = accountsTableFirstRow1.get(i).getText();
			accountsListRow1Array.add(data);
		}
		String actRow1List = accountsListRow1Array.toString();
		String expRow1List = "[CustActive, Customer]";
		
		System.out.println("ActualList "+actRow1List);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));
		accountsFirtCheckbox.click();
		
		boolean actSelectedMasterSearchCheckbox = accountsFirtCheckbox.isSelected();
		boolean expSelectedMasterSearchCheckbox = true;
		
		String actResult = Boolean.toString(actSelectedMasterSearchCheckbox);
		
		

		System.out.println("Account Name Check as Checked Value Actual           :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);

		if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox && actRow1List.equalsIgnoreCase(expRow1List)) 
		{
			
			return true;
		} 
		else 
		{
			
			return false;
		}
	}
	
	
	@FindBy(xpath="//*[@id='ddlStatus']")
	private static WebElement statusDropDownInAcoountProperties;
	
	public static boolean checkPropertiesForCreatedAccountAsDisplayWhenStatusIsActive() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		Thread.sleep(2000);
		
		Select statusDropdown = new Select(statusDropDownInAcoountProperties);
	    
		statusDropdown.selectByVisibleText("Active");	
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		masterEditBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys(Keys.END);
		nameTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		nameTxt.sendKeys("cust_Display_when_StatusIsActive");
		nameTxt.sendKeys(Keys.TAB);
		
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage = "Updated Successfully";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	//sales inv
	public static boolean checkRaiseSalesIvoiceForCustomerAccountCustDisplayWhenStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		Thread.sleep(2000);
		
		checkDeleteLinkStatus();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		
		    	
		    	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		    	dateText.click();
		    	dateText.sendKeys(Keys.HOME);
		    	Thread.sleep(1000);
		    	dateText.sendKeys("29/01/2021");
		    	dateText.sendKeys(Keys.TAB);
				*/
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("cust_Display_when_StatusIsActive");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Dubai"))
			{
				departmentListCount.get(i).click();
				
				Thread.sleep(1000);
				
				if(getIsAlertPresent())
				{
					getAlert().accept();
				}
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
		salesInvoiceVATPlaceOFSupply.click();
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
		
		
		int placeOFSupplyListCount=placeOFSupplyList.size();
		
		System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
			
		for(int i=0 ; i < placeOFSupplyListCount ;i++)
		{
			String data=placeOFSupplyList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOFSupplyList.get(i).click();
				
				break;
			}
		}
			
		
		Thread.sleep(2000);
		
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
		jurisdictionTxt.click();
		jurisdictionTxt.sendKeys(Keys.END);
		jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		jurisdictionTxt.sendKeys("DUBAI");
		Thread.sleep(2000);
		jurisdictionTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
    	select1stRow_1stColumn.click();
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
    	enter_WarehouseTxt.sendKeys("Hyderabad");
    	Thread.sleep(3000);
    	enter_WarehouseTxt.sendKeys(Keys.TAB);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
    	enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
    	Thread.sleep(3000);
    	enter_ItemTxt.sendKeys(Keys.TAB);

    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
    	select1stRow_5thColumn.click();
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
    	select1stRow_9thColumn.click();
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
    	enter_AQTxt.sendKeys("1");
    	enter_AQTxt.sendKeys(Keys.TAB);
		
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
    	enter_FQTxt.sendKeys("");
    	enter_FQTxt.sendKeys(Keys.TAB);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
    	select1stRow_12thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		
		
	
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
		enter_QuantityToRelease.click();
		enter_QuantityToRelease.sendKeys(Keys.TAB);*/
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();*/
		enter_Rate.clear();
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.click();
		enter_Vat.sendKeys(Keys.TAB);
		
		
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
		select1stRow_18thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
		enter_Taxable.click();*/
		
		Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		
		 Thread.sleep(2000);
		
		

		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 String expSavingMessage1 = "Voucher saved successfully";

		 String actSavingMessage = checkValidationMessage(expSavingMessage1);
		
		if(actSavingMessage.startsWith(expSavingMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}
	
		
	
	}
	
	
	
	public static boolean checkCustomerStatementsReportForCustDisplayWhenStatusIsActive() throws InterruptedException
	{
		
		
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));		
	 	finacinalsMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));		
		 receivableAndPayableAnalysisMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));		
		 customerDetailMenu.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsBtn));		
		 cutomerStatementsBtn.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
		 accountSearchTextArea.sendKeys("cust_Display_when_StatusIsActive");
		 accountSearchTextArea.sendKeys(Keys.ENTER);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
		 accountsFirtCheckbox.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsOkBtn));		
		 cutomerStatementsOkBtn.click();
		 
			
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerStaementsReportTitle));		
		 String actTitle = customerStaementsReportTitle.getText();
		 String expTitle = "Customer statements of cust_Display_when_StatusIsActive CustActive";
		 
		if (actTitle.equalsIgnoreCase(expTitle))
		{
			return true;
		}
		else
		{

		}
		return false;
	}
	
	
	public static boolean checkCustomerStatementsReportDeatilsForCustDisplayWhenStatusIsActive()
	{

		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_Display_when_StatusIsActive CustActive]";
		
		
		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=3;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[cust_Display_when_StatusIsActive, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, 40, Indian Rupees, 12/03/2021, custActive]";
		
		
		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsByWarehouseRow3ListArray.add(data);
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[Total, , , 210.00, , , 210.00, 210.00, 210.00, , , 210.00, 0, , , ]";
		
		
		
		
		System.out.println("*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");
		
		System.out.println("ActualRow1List Values   " +actRow1List);
		System.out.println("ExpectedRow1List Values " +expRow1List);
		
		System.out.println("ActualRow2List Values  " +actRow2List);
		System.out.println("ExpectedRow1List Values" +expRow2List);
		
		System.out.println("ActualRow3List Values  " +actRow3List);
		System.out.println("ExpectedRow3List Values" +expRow3List);
		
		
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actRow3List.equalsIgnoreCase(expRow3List))
		{
			return true;
		}
		else
		{
		return false;
		}
	
	}
	//
	public static boolean checkSearchAccountCustomerStausAsActiveClickOnLedgerInMasterRibbon() throws InterruptedException
	
	{
	
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
		 homeMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		 mastersMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
		 accounts.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
		 accountSearchTextArea.sendKeys("cust_Display_when_StatusIsActive");
		 accountSearchTextArea.sendKeys(Keys.ENTER);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
		 accountsFirtCheckbox.click();
		   
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 masterRibbonToExpandOptions.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
		 
		 masterRibbonControlNextBtn.click(); 
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterLedgerBtn));
		 masterLedgerBtn.click();
		 
		 Thread.sleep(4000);
		
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(1));
		
		/*Set<String> allWindows = getDriver().getWindowHandles();      
		for(String winHandle:allWindows)
		{
			String title = getDriver().switchTo().window(winHandle).getTitle();
			System.out.println("Window Title: "+title);
			Thread.sleep(5000);
			
			if(title.equalsIgnoreCase("Focus"))
			{
				
				 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ledgerTitle));
				 String ledgerTileText = ledgerTitle.getText();
				 System.out.println("Ledger Title: " +ledgerTileText);*/
				 
				 
				 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(dateTextInLedgerReportScreen));
				 
				 boolean actDateText = dateTextInLedgerReportScreen.isDisplayed();
				 boolean actOptionsToggle = optionsToggleBtnInLedgerReportScreen.isDisplayed();
				 boolean actCloseBtn = closeBtnInLedgerReportScreen.isDisplayed();
				 boolean actSearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
				 boolean actFirstPageBtn = firstPageBtnInLedgerReportScreen.isDisplayed();
				 boolean actPreviousBtn = previousPageBtnInLedgerReportScreen.isDisplayed();
				 boolean actsearchTextField = searchTextFieldInLedgerReportScreen.isDisplayed();
				 boolean actnextPageBtn= nextPageBtnInLedgerReportScreen.isDisplayed();
				 boolean actlastPageBtn = lastPageBtnInLedgerReportScreen.isDisplayed();
				 
				 
				 boolean expDateText = true;
				 boolean expOptionsToggle =true;
				 boolean expCloseBtn = true;
				 boolean expSearchTextField =true;
				 boolean expFirstPageBtn = true;
				 boolean expPreviousBtn = true;
				 boolean expsearchTextField = true;
				 boolean expnextPageBtn=true;
				 boolean explastPageBtn = true;
				 
				 
				 System.out.println("dateTextInLedgerReport           : "+actDateText               +" Value Expected : "+expDateText);
				 System.out.println("optionsToggleInLedgerReport      : "+actOptionsToggle          +" Value Expected : "+expOptionsToggle);
				 System.out.println("closeBtnInLedgerReport           : "+actCloseBtn               +" Value Expected : "+expCloseBtn);
				 System.out.println("serachTextFieldInLedgerReport    : "+actSearchTextField        +" Value Expected : "+expSearchTextField);
				 System.out.println("firstPageBtnInLedgerReport       : "+actFirstPageBtn           +" Value Expected : "+expFirstPageBtn);
				 System.out.println("previousPageBTnLedgerReport      : "+actPreviousBtn            +" Value Expected : "+expPreviousBtn);
				 System.out.println("nextPageBTnLedgerReport          : "+actnextPageBtn            +" Value Expected : "+expnextPageBtn);
				 System.out.println("lastPageBTnLedgerReport          : "+actlastPageBtn            +" Value Expected : "+explastPageBtn);			 
				
			/*}
			
			
		}*/
	    
		Thread.sleep(3000);
		
		 
		if(actDateText==expDateText && actOptionsToggle ==expOptionsToggle && actCloseBtn==expCloseBtn 
				&& actSearchTextField==expSearchTextField && actFirstPageBtn ==expFirstPageBtn
				&& actPreviousBtn ==expPreviousBtn &&actnextPageBtn ==expnextPageBtn && actlastPageBtn==explastPageBtn)
		{
			return true;
		}
		
		else 
		{
			return false;
		}
	}
	
	
	
	
	public static boolean checkReportDetailsInLedgerReportPageForCustomerAccountStatusAsActive()
	{
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_Display_when_StatusIsActive CustActive]";
		
		
		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=3;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[Sales - Computers, 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, Indian Rupees]";
		
		
		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsByWarehouseRow3ListArray.add(data);
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[Total, , , 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, ]";
		
		
		System.out.println("*********************************checkLedgerDetailsForVendorB*****************************************");
		
		System.out.println("ActualRow1List Values   " +actRow1List);
		System.out.println("ExpectedRow1List Values " +expRow1List);
		
		System.out.println("ActualRow2List Values  " +actRow2List);
		System.out.println("ExpectedRow1List Values" +expRow2List);
		
		System.out.println("ActualRow3List Values  " +actRow3List);
		System.out.println("ExpectedRow3List Values" +expRow3List);
		
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(1)).close();
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actRow3List.equalsIgnoreCase(expRow3List))
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	//
	public static boolean checkChangeAccountPropertyFromActiveToInActive() throws InterruptedException
	{
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(0));
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		 mastersMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
		 accounts.click();
		 
		 Thread.sleep(4000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
		 accountsFirtCheckbox.click();
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			masterPropertiesBtn.click();
			Thread.sleep(2000);
			
			Select statusDropdown = new Select(statusDropDownInAcoountProperties);
		    
			statusDropdown.selectByVisibleText("In Active");	
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();
			 
			if (true) 
			{
				return true;
			} 
			else
			{
				return false;
			}
		 
	}
	
	public static boolean  checkLogoutAndLoginToCheckCustomerStatementsReports() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		userNameDisplay.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(4000);
		
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
		
	    
	    String expuserInfo            ="SU";
	    String expLoginCompanyName    ="Automation Company ";
	    String expDashboard			  ="Graph with Active and setAsDefault";
	   
		
		System.out.println("***********************************checkLogoutAndLoginAfterEnablingMandatoryCheckboxInFieldsProperties*********************************");
	    
	    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
	    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
	    System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);
	   
	  
		if(userInfo.equalsIgnoreCase(expuserInfo) /*&& getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName)*/)
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	}
	
	
	
	
	public static boolean checkCustomerStatementsReportisEmpty() throws InterruptedException
	{
			
			
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));		
		 	finacinalsMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));		
			 receivableAndPayableAnalysisMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));		
			 customerDetailMenu.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsBtn));		
			 cutomerStatementsBtn.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
			 accountSearchTextArea.sendKeys("cust_Display_when_StatusIsActive");
			 accountSearchTextArea.sendKeys(Keys.ENTER);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
			 accountsFirtCheckbox.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsOkBtn));		
			 cutomerStatementsOkBtn.click();
			 
				
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerStaementsReportTitle));		
			 String actTitle = customerStaementsReportTitle.getText();
			 String expTitle = "Customer statements of cust_Display_when_StatusIsActive CustActive";
			 
			 
			 	boolean actTableIsEmpty = customerStatementsReportTable.getText().isEmpty();
				boolean expTableIsEmpty = true; 
			 
			 
			 
			 
			 
			if (actTitle.equalsIgnoreCase(expTitle) && actTableIsEmpty == expTableIsEmpty)
			{
				return true;
			}
			else
			{

			}
			return false;
			
	}
	
	
	public static boolean checkLedgerIsEmptyForCustomerAccountStatusAsInActive() throws InterruptedException
	{

		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));		
		 homeMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		 mastersMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
		 accounts.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
		 accountSearchTextArea.sendKeys("cust_Display_when_StatusIsActive");
		 accountSearchTextArea.sendKeys(Keys.ENTER);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
		 accountsFirtCheckbox.click();
		   
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 masterRibbonToExpandOptions.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
		 
		 masterRibbonControlNextBtn.click(); 
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 masterRibbonControlNextBtn.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterLedgerBtn));
		 masterLedgerBtn.click();
		 
		 Thread.sleep(4000);
		
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());
		
		int actOpenWindowsCount = getDriver().getWindowHandles().size();
		int expOpenWindowsCount = 2;

	 	getDriver().switchTo().window(openTabs.get(1));
	 	
	 	Thread.sleep(2000);
	 	
	 	boolean actTableIsEmpty = ledgerTable.getText().isEmpty();
		boolean expTableIsEmpty = true; 
		
		if(actTableIsEmpty==expTableIsEmpty)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*//Acoount properties when the status is inactive
	

	public static boolean checkAccouncreatedWithPropertAsStatusIsInActive() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		 mastersMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
		 accounts.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
		 masterNewBtn.click();
		 
		
		 Thread.sleep(3000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys("cust_display_when_StatusIsInActive");
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("CustInActive");
	    codeTxt.sendKeys(Keys.TAB);
      
	    Select accountTypeDrpdwn = new Select(accountTypeDropdown);
	    
		accountTypeDrpdwn.selectByVisibleText("Customer");	
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expSaveAccountMessage = "Saved Successfully";	
		String actSaveAccountMessage = checkValidationMessage(expSaveAccountMessage);
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		

		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);
		
		
		
		if(actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean checkSavedAccountInTheAccountsListCustStatusInActive()
	{
		
		int AccountsTableRow1Count = accountsTableFirstRow1.size();
		ArrayList<String> accountsListRow1Array = new ArrayList<String>();
		for(int i=11;i<AccountsTableRow1Count;i++)
		{
			String data = accountsTableFirstRow1.get(i).getText();
			accountsListRow1Array.add(data);
		}
		String actRow1List = accountsListRow1Array.toString();
		String expRow1List = "[CustInActive, Customer]";
		
		System.out.println("ActualList "+actRow1List);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));
		accountsFirtCheckbox.click();
		
		boolean actSelectedMasterSearchCheckbox = accountsFirtCheckbox.isSelected();
		boolean expSelectedMasterSearchCheckbox = true;
		
		String actResult = Boolean.toString(actSelectedMasterSearchCheckbox);
		
		

		System.out.println("Account Name Check as Checked Value Actual           :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);

		if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox && actRow1List.equalsIgnoreCase(expRow1List)) 
		{
			
			return true;
		} 
		else 
		{
			
			return false;
		}
	}
	
	
	
	
	public static boolean checkPropertiesForCreatedAccountAsDisplayWhenStatusIsInActive() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		Thread.sleep(2000);
		
		Select statusDropdown = new Select(statusDropDownInAcoountProperties);
	    
		statusDropdown.selectByVisibleText("In Active");	
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		masterEditBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys(Keys.END);
		nameTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		nameTxt.sendKeys("Cust_display_when_StatusInActive");
		nameTxt.sendKeys(Keys.TAB);

        
    
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage = "Updated Successfully";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	//sales inv
	public static boolean checkRaiseSalesIvoiceForCustomerAccountCustDisplayWhenStatusIsInActive() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		Thread.sleep(2000);
		
		checkDeleteLinkStatus();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		
		    	
		    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		    	dateText.click();
		    	dateText.sendKeys(Keys.HOME);
		    	Thread.sleep(1000);
		    	dateText.sendKeys("29/01/2021");
		    	dateText.sendKeys(Keys.TAB);
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Cust_display_when_StatusInActive");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.END);
		departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("Dubai"))
			{
				departmentListCount.get(i).click();
				
				Thread.sleep(1000);
				
				if(getIsAlertPresent())
				{
					getAlert().accept();
				}
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
		salesInvoiceVATPlaceOFSupply.click();
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);
		
		
		int placeOFSupplyListCount=placeOFSupplyList.size();
		
		System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);
			
		for(int i=0 ; i < placeOFSupplyListCount ;i++)
		{
			String data=placeOFSupplyList.get(i).getText();
			
			if(data.equalsIgnoreCase("Abu Dhabi"))
			{
				placeOFSupplyList.get(i).click();
				
				break;
			}
		}
			
		
		Thread.sleep(2000);
		
		salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
		jurisdictionTxt.click();
		jurisdictionTxt.sendKeys(Keys.END);
		jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		jurisdictionTxt.sendKeys("DUBAI");
		Thread.sleep(2000);
		jurisdictionTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
    	select1stRow_1stColumn.click();
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
    	enter_WarehouseTxt.sendKeys("Hyderabad");
    	Thread.sleep(3000);
    	enter_WarehouseTxt.sendKeys(Keys.TAB);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
    	enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
    	Thread.sleep(3000);
    	enter_ItemTxt.sendKeys(Keys.TAB);

    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
    	select1stRow_5thColumn.click();
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
    	select1stRow_9thColumn.click();
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
    	enter_AQTxt.sendKeys("1");
    	enter_AQTxt.sendKeys(Keys.TAB);
		
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
    	enter_FQTxt.sendKeys("");
    	enter_FQTxt.sendKeys(Keys.TAB);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
    	select1stRow_12thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityToRelease));
		enter_QuantityToRelease.click();
		enter_QuantityToRelease.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.click();
		enter_Vat.sendKeys(Keys.TAB);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
		select1stRow_18thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
		enter_Taxable.click();
		
		Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		
		 Thread.sleep(2000);
		
		

		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 String expSavingMessage1 = "Voucher saved successfully";

		 String actSavingMessage = checkValidationMessage(expSavingMessage1);
		
		if(actSavingMessage.startsWith(expSavingMessage1))
		{
			return true;
		}
		else
		{
			return false;
		}
	
		
	
	}
	
	
	
	public static boolean checkCustomerStatementsReportForCustDisplayWhenStatusIsInActive() throws InterruptedException
	{
		
		
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));		
	 	finacinalsMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));		
		 receivableAndPayableAnalysisMenu.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));		
		 customerDetailMenu.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsBtn));		
		 cutomerStatementsBtn.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSearchTextArea));		
		 accountSearchTextArea.sendKeys("        cust_display_when_StatusInActive");
		 accountSearchTextArea.sendKeys(Keys.ENTER);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsFirtCheckbox));		
		 accountsFirtCheckbox.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cutomerStatementsOkBtn));		
		 cutomerStatementsOkBtn.click();
		 
			
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerStaementsReportTitle));		
		 String actTitle = customerStaementsReportTitle.getText();
		 String expTitle = "Customer statements of cust_Display_when_StatusIsInActive CustInActive";
		 
		if (actTitle.equalsIgnoreCase(expTitle))
		{
			return true;
		}
		else
		{

		}
		return false;
	}
	
	
	public static boolean checkCustomerStatementsReportDeatilsForCustDisplayWhenStatusIsInActive()
	{

		
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_Display_when_StatusIsInActive CustInActive]";
		
		
		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=3;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[cust_Display_when_StatusIsInActive, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, 40, Indian Rupees, 12/03/2021, custInActive]";
		
		
		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			reportsByWarehouseRow3ListArray.add(data);
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[Total, , , 210.00, , , 210.00, 210.00, 210.00, , , 210.00, 0, , , ]";
		
		
		
		
		System.out.println("*********************************checkCustomerStatementsReportDetailsForCreatedCustomer*****************************************");
		
		System.out.println("ActualRow1List Values   " +actRow1List);
		System.out.println("ExpectedRow1List Values " +expRow1List);
		
		System.out.println("ActualRow2List Values  " +actRow2List);
		System.out.println("ExpectedRow1List Values" +expRow2List);
		
		System.out.println("ActualRow3List Values  " +actRow3List);
		System.out.println("ExpectedRow3List Values" +expRow3List);
		
		
		
		
		if (actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
				&& actRow3List.equalsIgnoreCase(expRow3List))
		{
			return true;
		}
		else
		{
		return false;
		}
	
	}*/
	
	
	
		
public MasterAccountForLedgerValidationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}