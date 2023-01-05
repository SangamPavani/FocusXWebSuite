

package com.focus.Pages;

import java.io.File;
import java.io.IOException;
import com.focus.base.BaseEngine;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;


public class SmokePricebookPage extends BaseEngine 
{	
	@FindBy(xpath="//*[@id='1']/div/div")
	private static WebElement  homeMenu;   

	@FindBy(xpath="//*[@id='1000']/span")
	private static WebElement  homeMasterMenu;

	@FindBy(xpath="//*[@id='221']/span")
	private static WebElement  homeMasterItemMenu;
	
	@FindBy(xpath="//*[@id='80']/span")
	private static WebElement  homeMasterItem_buyerPriceBookMenu;
	
	@FindBy(xpath="//*[@id='ctrlOptionProPriceBookH']")
	private static WebElement buyerPriceBook_PriceBook;
	
	@FindBy(xpath="//*[@id='ctrlOptionProPriceBookH_input_settings']/span")
	private static WebElement buyerPriceBook_PriceBookSettingBtn;

	@FindBy(xpath="//*[@id='txtAbbreviation']")
	private static WebElement buyerPriceBook_AbbreviationBtn;
	
	@FindBy(xpath="//*[@id='PriceBookContainer']/div[2]/nav/div/div[1]/a/div/span[2]")
	private static WebElement buyerPriceBookLabel;
	
	@FindBy(xpath="//*[@id='btnClear']")
	private static WebElement buyerPriceBookClearBtn;
	
	@FindBy(xpath="//*[@id='btnPaste']")
	private static WebElement buyerPriceBookPasteBtn;
	
	@FindBy(xpath="//*[@id='btnCopy']")
	private static WebElement buyerPriceBookCopyBtn;
	
	@FindBy(xpath="//*[@id='btnSelectAll']")
	private static WebElement buyerPriceBookSelectAllBtn;
	
	@FindBy(xpath="//*[@id='btnClose']")
	private static WebElement buyerPriceBookCloseBtn;
	
	@FindBy(xpath="//*[@id='btnSave']")
	private static WebElement buyerPriceBookSaveBtn;
	
	@FindBy(xpath="//span[@id='btnClose']")
	private static WebElement buyerPriceBookCloseAfterImport;
	
	
	@FindBy(xpath="//*[@id='btnDelete']")
	private static WebElement buyerPriceBookDeleteBtn;
	
	@FindBy(xpath="//*[@id='StartingDateH']")
	private static WebElement buyerPriceBookStaringDate;
	
	@FindBy(xpath="//*[@id='EndingDateH']")
	private static WebElement buyerPriceBookENdingDate;

	@FindBy(xpath="//*[@id='InActive']")
	private static WebElement buyerPriceBookInActiveCheckBox;
	
	@FindBy(xpath="//*[@id='FilterProduct']")
	private static WebElement buyerPriceBookFilter_Item;
	
	@FindBy(xpath="//*[@id='FilterCurrency']")
	private static WebElement buyerPriceBookFilter_Currency;
	
	@FindBy(xpath="//*[@id='FilterCustomer']")
	private static WebElement buyerPriceBookFilter_Customer;
	
	@FindBy(xpath="//*[@id='FilterDepartment']")
	private static WebElement buyerPriceBookFilter_Department;
	
	@FindBy(xpath="//*[@id='btnFilterClear']")
	private static WebElement buyerPriceBookFilter_ClearBtn;
	
	@FindBy(xpath="//*[@id='btnFilter']")
	private static WebElement buyerPriceBookFilter_FilterBtn;
	
	@FindBy(xpath="//*[@id='btnLoad']")
	private static WebElement buyerPriceBookFilter_FilterAndLoadBtn;
	
	@FindBy(xpath="//*[@id='btnAdvExcelImport']")
	private static WebElement buyerPriceBook_AdvanceExcelImportBtn;
	
	@FindBy(xpath="//*[@id='btnPBPrintRateHistory']")
	private static WebElement buyerPriceBook_PrintRateHistoryBtn;
	
	@FindBy(xpath="//*[@id='btnPBExportToXML']")
	private static WebElement buyerPriceBook_ExportToXmlBtn;
	
	@FindBy(xpath="//span[contains(text(),'Import From XML')]")
	private static WebElement buyerPriceBook_ImportFromXmlBtn;
	
	@FindBy(xpath="//form[@id='formLoadDataXML']//button[@id='btnExporttoExcel']")
	private static WebElement buyerPriceBook_ExportToExcel;
	
	@FindBy(xpath="//button[@id='btnPBImportFromExcel']")
	private static WebElement buyerPriceBook_ImportFromExcel;
	
	@FindBy(xpath="//button[@id='btnViewPrice']")
	private static WebElement buyerPriceBook_ViewPrice;
	
	@FindBy(xpath="//button[@id='btnUpdatePriceList']")
	private static WebElement buyerPriceBook_UpdatePriceList;
	
	@FindBy(xpath="//*[@id='toggleDropDown']/i")
	private static WebElement buyerPriceBook_CustamizeSettingBtn;
	
	@FindBy(xpath="//*[@id='chkDateRange']")
	private static WebElement buyerPriceBook_CustamizeDateRangeCheckBox;
	
	@FindBy(xpath="//*[@id='chkCustomer']")
	private static WebElement buyerPriceBook_CustomizeVendorCheckBox;
	
	@FindBy(xpath="//*[@id='ddlMenu']/li[3]/label")
	private static WebElement buyerPriceBook_WarehouseCheckBox;

	@FindBy(xpath="//*[@id='chkQtyRange']")
	private static WebElement buyerPriceBook_QualityRangeCheckBox;
	
	@FindBy(xpath="//*[@id='chkCurrency']")
	private static WebElement buyerPriceBook_CurrencyCheckBox;
	
	@FindBy(xpath="//*[@id='chkUnit']")
	private static WebElement buyerPriceBook_UnitCheckBox;
	
	//Dash board Page
	@FindBy(xpath="//*[@id='dashName']")
    private static WebElement labelDashboard ;
	
	@FindBy(xpath="//*[@id='Select_dash']")
	private static WebElement selectDashboard ;
		
	@FindBy(xpath="//*[@id='Dashboard_AddDash']")
    private static WebElement newAddDashBoard;
	 
    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
    private static WebElement dashboardCustomizationSettings;
    
    
    
		
    //Logout and Login Screen
	
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

    
   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
	private static WebElement userNameDisplay;*/

	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;

    @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
	private static WebElement logoutOption;	 
	 
    
    
    
    
	 @FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_1']//div[contains(text(),'Item')]")
	 private static WebElement  gridItemColoumn;

	 
	 
	 @FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
	 public static WebElement newErrorMessage;

	 @FindBy(xpath = "//span[contains(text(),'Seller Price Book')]")
	 private static WebElement sellerPriceBookMenu;
	 
	 
		@FindBy(xpath = "//span[@class='icon-reject2 theme_color']")
		public static WebElement newErrorMessageCloseBtn;

		@FindBy(xpath = "//i[@id='ToggleFilter']")
		private static WebElement beforeClickOnToggle;

		@FindBy(xpath = "//i[@id='TogglePBTable']")
		private static WebElement afterClickOnToggle;

		@FindBy(xpath = "//div[contains(text(),'Starting date')]")
		private static WebElement startingdate;

		@FindBy(xpath = "//div[contains(text(),'Ending date')]")
		private static WebElement endingdate;

		@FindBy(xpath = "//th[@id='PriceBookWebGrid_control_heading_6']//div[contains(text(),'Vendor')]")
		private static WebElement vendor;

		@FindBy(xpath = "//th[@id='PriceBookWebGrid_control_heading_6']//div[contains(text(),'Customer')]")
		private static WebElement customer;

		@FindBy(xpath = "//th[@id='PriceBookWebGrid_control_heading_7']//div[contains(text(),'Currency')]")
		private static WebElement currencyPriceBook;

		@FindBy(xpath = "//div[contains(text(),'Min Qty')]")
		private static WebElement minQty;

		@FindBy(xpath = "//div[contains(text(),'Max Qty')]")
		private static WebElement maxQty;

		@FindBy(xpath = "//div[contains(text(),'Unit')]")
		private static WebElement unit;

		@FindBy(xpath = "//th[@id='PriceBookWebGrid_control_heading_11']//div[contains(text(),'Rate')]")
		private static WebElement rate;

		@FindBy(xpath = "//th[@id='PriceBookWebGrid_control_heading_12']//div[contains(text(),'Po')]")
		private static WebElement po;

		@FindBy(xpath = "//div[contains(text(),'So')]")
		private static WebElement so;

		@FindBy(xpath = "//th[@id='PriceBookWebGrid_control_heading_13']//div[contains(text(),'St')]")
		private static WebElement st;

		@FindBy(xpath = "//div[contains(text(),'Pt')]")
		private static WebElement pt;

		@FindBy(xpath = "//div[contains(text(),'Val 3')]")
		private static WebElement Val3;

		@FindBy(xpath = "//div[contains(text(),'Val 4')]")
		private static WebElement Val4;

		@FindBy(xpath = "//div[contains(text(),'Val 5')]")
		private static WebElement Val5;

		@FindBy(xpath = "//div[contains(text(),'Val 6')]")
		private static WebElement Val6;

		@FindBy(xpath = "//div[contains(text(),'Val 7')]")
		private static WebElement Val7;

		@FindBy(xpath = "//div[contains(text(),'Val 8')]")
		private static WebElement Val8;

		@FindBy(xpath = "//div[contains(text(),'Val 9')]")
		private static WebElement Val9;

		@FindBy(xpath = "//div[contains(text(),'Val 10')]")
		private static WebElement Val10;

		@FindBy(xpath = "//div[contains(text(),'Val 11')]")
		private static WebElement Val1;

		@FindBy(xpath = "//div[contains(text(),'Val 12')]")
		private static WebElement Val12;

		@FindBy(xpath = "//div[contains(text(),'Val 13')]")
		private static WebElement Val13;

		// Grid Options display
		// First Row
		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-1']")
		private static WebElement itemFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-3']")
		private static WebElement wareHouseFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-4']")
		private static WebElement satrtingDateFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-5']")
		private static WebElement endingDateFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-6']")
		private static WebElement vendorFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-7']")
		private static WebElement currencyFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-8']")
		private static WebElement minQtyFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-9']")
		private static WebElement maxQtyFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-10']")
		private static WebElement unitFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-11']")
		private static WebElement rateFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-12']")
		private static WebElement PoFirstCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_1-13']")
		private static WebElement PtFirstCellSelect;

		// Second Row
		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-1']")
		private static WebElement itemSecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-3']")
		private static WebElement wareHouseSecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-4']")
		private static WebElement satrtingDateSecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-5']")
		private static WebElement endingDateSecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-6']")
		private static WebElement vendorSecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-7']")
		private static WebElement currencySecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-8']")
		private static WebElement minQtySecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-9']")
		private static WebElement maxQtySecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-10']")
		private static WebElement unitSecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-11']")
		private static WebElement rateSecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-12']")
		private static WebElement PoSecondCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_2-13']")
		private static WebElement PtSecondCellSelect;

		// Third Row
		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-1']")
		private static WebElement itemThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-3']")
		private static WebElement wareHouseThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-4']")
		private static WebElement satrtingDateThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-5']")
		private static WebElement endingDateThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-6']")
		private static WebElement vendorThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-7']")
		private static WebElement currencyThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-8']")
		private static WebElement minQtyThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-9']")
		private static WebElement maxQtyThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-10']")
		private static WebElement unitThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-11']")
		private static WebElement rateThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-12']")
		private static WebElement PoThirdCellSelect;

		@FindBy(xpath = "//td[@id='PriceBookWebGrid_col_3-13']")
		private static WebElement PtThirdCellSelect;

		// To get Value From Cell
		@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_2']")
		private static WebElement itemValuePriceBook;

		@FindBy(xpath = "//*[@id='PriceBookWebGrid_option_3']")
		private static WebElement wareHouseValue;

		@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_StartingDate']")
		private static WebElement startingDateValue;
		                 
		@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_EndingDate']")
		private static WebElement endingDateValue;

		@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_1']")
		private static WebElement vendorValue;

		@FindBy(xpath = "//input[@id='Currency_option']")
		private static WebElement currencyOptionValue;

		@FindBy(xpath = "//input[@id='PriceBookWebGrid_minqty']")
		private static WebElement minQtyValue;

		@FindBy(xpath = "//input[@id='PriceBookWebGrid_maxqty']")
		private static WebElement maxQtyValue;

		@FindBy(xpath = "//input[@id='PriceBookWebGrid_option_11']")
		private static WebElement unitValuePriceBook;

		@FindBy(xpath = "//input[@id='PriceBookWebGrid_val0']")
		private static WebElement rateValue;

		@FindBy(xpath = "//input[@id='PriceBookWebGrid_val1']")
		private static WebElement PoValue;

		@FindBy(xpath = "//input[@id='PriceBookWebGrid_val2']")
		private static WebElement PtValue;

		@FindBy(xpath = "//div[contains(text(),'So')]")
		private static WebElement gridSoColumn;

		@FindBy(xpath = "//th[@id='PriceBookWebGrid_control_heading_13']//div[@class='no-select'][contains(text(),'St')]")
		private static WebElement gridStColumn;
		
		@FindBy(xpath = "//*[@id='PriceBookWebGrid_head']/tr/th/div[1]")
		private static List<WebElement> bodyGridHeaderList;
	 
		@FindBy(xpath = "//th[@id='PriceBookWebGrid_control_heading_3']//div[1]")
		private static WebElement gridWareHouseColoumn;

	 @FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_11']//div[contains(text(),'Rate')]")
	 private static WebElement  gridRateColoumn;

	 @FindBy(xpath="//th[@id='PriceBookWebGrid_control_heading_12']//div[contains(text(),'Po')]")
	 private static WebElement  gridPoColoumn;
	 
	 @FindBy(xpath="//div[contains(text(),'Pt')]")
	 private static WebElement  gridPtColoumn;

	 @FindBy(xpath="//*[@id='navigation_menu']/li/a/div/div")
	 private static List<WebElement> menusList;
	 
	 
	 //Masters Menu	
	 @FindBy (xpath="//*[@id='1000']/span")
	 private static WebElement mastersMenu;
	 
	// Items Menu
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]")
	public static WebElement itemsMenu;
	
	@FindBy(xpath = "//*[@id='80']/span")
	private static WebElement buyerPriceBookMenu;
	 
     private static String xlfile;
	 private static String resPass = "Pass";
	 private static String resFail = "Fail";
	 private static ExcelReader excelReader;
	 private static boolean methodReturnStatus;
	 private static String xlSheetName = "SmokeMasters";
	 private static boolean statusOfValue;
     private static Alert alert;
    
    
    
    
    
     public static boolean checkSignToCheckPricebookMastersPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
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

    
     
  
     
   public boolean checkClickOnBuyerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
   {
    excelReader = new ExcelReader(POJOUtility.getExcelPath());
    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

    System.out.println("*************************************************** checkClickOnBuyerPriceBook *****************************************************************");

    try
    {
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    	homeMenu.click();

    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    	mastersMenu.click();

    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemsMenu));
    	itemsMenu.click();

    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookMenu));
    	buyerPriceBookMenu.click();
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookSaveBtn));
    	boolean actBuyerPriceBook                         = buyerPriceBook_PriceBook.isDisplayed();
    	boolean actBuyerPriceBookAbbreviation             = buyerPriceBook_AbbreviationBtn.isDisplayed();
    	boolean actBuyerPriceBookLabel                    = buyerPriceBookLabel.isDisplayed();
    	boolean actBuyerPriceBookClearBtn                 = buyerPriceBookClearBtn.isDisplayed();
    	boolean actBuyerPriceBookPasteBtn                 = buyerPriceBookPasteBtn.isDisplayed();
    	boolean actBuyerPriceBookCopyBtn                  = buyerPriceBookCopyBtn.isDisplayed();
    	boolean actBuyerPriceBookSelectAllBtn             = buyerPriceBookSelectAllBtn.isDisplayed();
    	boolean actBuyerPriceBookCloseBtn                 = buyerPriceBookCloseBtn.isDisplayed();
    	boolean actBuyerPriceBookSaveBtn                  = buyerPriceBookSaveBtn.isDisplayed();
    	boolean actBuyerPriceBookDeleteBtn                = buyerPriceBookDeleteBtn.isDisplayed();
    	boolean actBuyerPriceBookStartingDate             = buyerPriceBookStaringDate.isDisplayed();
    	boolean actBuyerPriceBookEndingDate               = buyerPriceBookENdingDate.isDisplayed();
    	boolean actBuyerPriceBookInActiveCheckbox         = buyerPriceBookInActiveCheckBox.isDisplayed();
    	boolean actBuyerPriceBookFilterItem               = buyerPriceBookFilter_Item.isDisplayed();
    	boolean actBuyerPriceBookFilterCurrency           = buyerPriceBookFilter_Currency.isDisplayed();
    	boolean actBuyerPriceBookFilterCustomer           = buyerPriceBookFilter_Customer.isDisplayed();
    	boolean actBuyerPriceBookFilterDepartment         = buyerPriceBookFilter_Department.isDisplayed();
    	boolean actBuyerPriceBookFilterClearBtn           = buyerPriceBookFilter_ClearBtn.isDisplayed();
    	boolean actBuyerPriceBookFilterBtn                = buyerPriceBookFilter_FilterBtn.isDisplayed();
    	boolean actBuyerPriceBookLoadBtn                  = buyerPriceBookFilter_FilterAndLoadBtn.isDisplayed();
    	boolean actBuyerPriceBookAdvanceExportImportExcel = buyerPriceBook_AdvanceExcelImportBtn.isDisplayed();
    	boolean actBuyerPriceBookHistory                  = buyerPriceBook_PrintRateHistoryBtn.isDisplayed();
    	boolean actBuyerPriceBookExportXML                = buyerPriceBook_ExportToXmlBtn.isDisplayed();
    	boolean actBuyerPriceBookImportFromXML            = buyerPriceBook_ImportFromXmlBtn.isDisplayed();
    	boolean actBuyerPriceBookExportExcel              = buyerPriceBook_ExportToExcel.isDisplayed();
    	boolean actBuyerPriceBookImportFromExcel          = buyerPriceBook_ImportFromExcel.isDisplayed();
    	boolean actBuyerPriceBookViewPrice                = buyerPriceBook_ViewPrice.isDisplayed();
    	boolean actBuyerPriceBookUpdatePriceList          = buyerPriceBook_UpdatePriceList.isDisplayed();
    	boolean actBuyerPriceBookGridItem                 = gridItemColoumn.isDisplayed();
    	boolean actBuyerPriceBookRateColumn               = gridRateColoumn.isDisplayed();
    	/*boolean actBuyerPriceBookGridPOColoumn            = gridPoColoumn.isDisplayed();
    	boolean actBuyerPriceBookPTColumn                 = gridPtColoumn.isDisplayed();*/

    	boolean expBuyerPriceBook                         = true;
    	boolean expBuyerPriceBookAbbreviation             = true;
    	boolean expBuyerPriceBookLabel                    = true;
    	boolean expBuyerPriceBookClearBtn                 = true;
    	boolean expBuyerPriceBookPasteBtn                 = true;
    	boolean expBuyerPriceBookCopyBtn                  = true;
    	boolean expBuyerPriceBookSelectAllBtn             = true;
    	boolean expBuyerPriceBookCloseBtn                 = true;
    	boolean expBuyerPriceBookSaveBtn                  = true;
    	boolean expBuyerPriceBookDeleteBtn                = true;
    	boolean expBuyerPriceBookStartingDate 			  = true;
    	boolean expBuyerPriceBookEndingDate 			  = true;
    	boolean expBuyerPriceBookInActiveCheckbox 		  = true;
    	boolean expBuyerPriceBookFilterItem               = true;
    	boolean expBuyerPriceBookFilterCurrency 		  = true;
    	boolean expBuyerPriceBookFilterCustomer 		  = true;
    	boolean expBuyerPriceBookFilterDepartment 		  = true;
    	boolean expBuyerPriceBookFilterClearBtn 		  = true;
    	boolean expBuyerPriceBookFilterBtn 			      = true;
    	boolean expBuyerPriceBookLoadBtn 				  = true;
    	boolean expBuyerPriceBookAdvanceExportImportExcel = true;
    	boolean expBuyerPriceBookHistory                  = true;
    	boolean expBuyerPriceBookExportXML                = true;
    	boolean expBuyerPriceBookImportFromXML            = true;
    	boolean expBuyerPriceBookExportExcel              = true;
    	boolean expBuyerPriceBookImportFromExcel          = true;
    	boolean expBuyerPriceBookViewPrice                = true;
    	boolean expBuyerPriceBookUpdatePriceList          = true;
    	boolean expBuyerPriceBookGridItem                 = true;
    	boolean expBuyerPriceBookRateColumn               = true;
    	/*boolean expBuyerPriceBookGridPOColoumn            = true;
    	boolean expBuyerPriceBookPTColumn                 = true;*/

    	System.out.println("Buyer Price Book Value Actual              : " + actBuyerPriceBook +                        " Value Expected : "+ expBuyerPriceBook);
    	System.out.println("Buyer Price Book Abbreviation Value Actual : " + actBuyerPriceBookAbbreviation+             " Value Expected : " + expBuyerPriceBookAbbreviation);
    	System.out.println("Buyer Price Book Label Value Actual        : " + actBuyerPriceBookLabel+                    " Value Expected : " + expBuyerPriceBookLabel);
    	System.out.println("Clear Button Value Actual                  : " + actBuyerPriceBookClearBtn+                 " Value Expected : " + expBuyerPriceBookClearBtn);
    	System.out.println("Paste Button Value Actual                  : " + actBuyerPriceBookPasteBtn+                 " Value Expected : " + expBuyerPriceBookPasteBtn);
    	System.out.println("Copy Button Value Actual                   : " + actBuyerPriceBookCopyBtn+                  " Value Expected : " + expBuyerPriceBookCopyBtn);
    	System.out.println("Select All Button Value Actual             : " + actBuyerPriceBookSelectAllBtn+             " Value Expected : " + expBuyerPriceBookSelectAllBtn);
    	System.out.println("Close Button Value Actual                  : " + actBuyerPriceBookCloseBtn+                 " Value Expected : " + expBuyerPriceBookCloseBtn);
    	System.out.println("Save Button Value Actual                   : " + actBuyerPriceBookSaveBtn+                  " Value Expected : " + expBuyerPriceBookSaveBtn);
    	System.out.println("Delete Button Value Actual                 : " + actBuyerPriceBookDeleteBtn+                " Value Expected : " + expBuyerPriceBookDeleteBtn);
    	System.out.println("Starting Date Value Actual                 : " + actBuyerPriceBookStartingDate+             " Value Expected : " + expBuyerPriceBookStartingDate);
    	System.out.println("Ending Date Value Actual                   : " + actBuyerPriceBookEndingDate+               " Value Expected : " + expBuyerPriceBookEndingDate);
    	System.out.println("In Active Value Actual                     : " + actBuyerPriceBookInActiveCheckbox+         " Value Expected : " + expBuyerPriceBookInActiveCheckbox);
        System.out.println("Filter Item Value Actual                   : " + actBuyerPriceBookFilterItem+               " Value Expected : " + expBuyerPriceBookFilterItem);
    	System.out.println("Filter Currency Value Actual               : " + actBuyerPriceBookFilterCurrency+           " Value Expected : " + expBuyerPriceBookFilterCurrency);
    	System.out.println("Filter Customer Value Actual               : " + actBuyerPriceBookFilterCustomer+           " Value Expected : " + expBuyerPriceBookFilterCustomer);
    	System.out.println("Filter Department Value Actual             : " + actBuyerPriceBookFilterDepartment+         " Value Expected : " + expBuyerPriceBookFilterDepartment);
    	System.out.println("Filter Clear Button Value Actual           : " + actBuyerPriceBookFilterClearBtn+           " Value Expected : " + expBuyerPriceBookFilterClearBtn);
    	System.out.println("Filter Button Value Actual                 : " + actBuyerPriceBookFilterBtn+                " Value Expected : " + expBuyerPriceBookFilterBtn);
    	System.out.println("Load Button Value Actual                   : " + actBuyerPriceBookLoadBtn+                  " Value Expected : " + expBuyerPriceBookLoadBtn);
    	System.out.println("Advance Import and Export Value Actual     : " + actBuyerPriceBookAdvanceExportImportExcel+ " Value Expected : " + expBuyerPriceBookAdvanceExportImportExcel);
    	System.out.println("History Value Actual                       : " + actBuyerPriceBookHistory+                  " Value Expected : " + expBuyerPriceBookHistory);
    	System.out.println("Export XML Value Actual                    : " + actBuyerPriceBookExportXML+                " Value Expected : " + expBuyerPriceBookExportXML);
    	System.out.println("Import XML Value Actual                    : " + actBuyerPriceBookImportFromXML+            " Value Expected : " + expBuyerPriceBookImportFromXML);
    	System.out.println("Export Excel Value Actual                  : " + actBuyerPriceBookExportExcel+              " Value Expected : " + expBuyerPriceBookExportExcel);
    	System.out.println("Import from Excel Value Actual             : " + actBuyerPriceBookImportFromExcel+          " Value Expected : " + expBuyerPriceBookImportFromExcel);
    	System.out.println("View Price Button Value Actual             : " + actBuyerPriceBookViewPrice+                " Value Expected : " + expBuyerPriceBookViewPrice);
    	System.out.println("Buyer Price Book Value Actual              : " + actBuyerPriceBookUpdatePriceList+          " Value Expected : " + expBuyerPriceBookUpdatePriceList);
    	System.out.println("Buyer Price Book Abbreviation Value Actual : " + actBuyerPriceBookGridItem+                 " Value Expected : " + expBuyerPriceBookGridItem);
    	System.out.println("Buyer Price Book Label Value Actual        : " + actBuyerPriceBookRateColumn+               " Value Expected : " + expBuyerPriceBookRateColumn);
    /*	System.out.println("Clear Button Value Actual                  : " + actBuyerPriceBookGridPOColoumn+            " Value Expected : " + expBuyerPriceBookGridPOColoumn);
    	System.out.println("Buyer Price Book Value Actual              : " + actBuyerPriceBookPTColumn+                 " Value Expected : " + expBuyerPriceBookPTColumn);
    */
    	
    	
    	boolean TestResult=actBuyerPriceBook == expBuyerPriceBook && actBuyerPriceBookAbbreviation == expBuyerPriceBookAbbreviation
    						&& actBuyerPriceBookLabel == expBuyerPriceBookLabel
    						&& actBuyerPriceBookClearBtn == expBuyerPriceBookClearBtn
    						&& actBuyerPriceBookPasteBtn == expBuyerPriceBookPasteBtn
    						&& actBuyerPriceBookCopyBtn == expBuyerPriceBookCopyBtn
    						&& actBuyerPriceBookSelectAllBtn == expBuyerPriceBookSelectAllBtn
    						&& actBuyerPriceBookCloseBtn == expBuyerPriceBookCloseBtn
    						&& actBuyerPriceBookSaveBtn == expBuyerPriceBookSaveBtn
    						&& actBuyerPriceBookDeleteBtn == expBuyerPriceBookDeleteBtn
    						&& actBuyerPriceBookStartingDate == expBuyerPriceBookStartingDate
    						&& actBuyerPriceBookEndingDate == expBuyerPriceBookEndingDate
    						&& actBuyerPriceBookInActiveCheckbox == expBuyerPriceBookInActiveCheckbox
    						&& actBuyerPriceBookFilterItem == expBuyerPriceBookFilterItem
    						&& actBuyerPriceBookFilterCurrency == expBuyerPriceBookFilterCurrency
    						&& actBuyerPriceBookFilterCustomer == expBuyerPriceBookFilterCustomer
    						&& actBuyerPriceBookFilterDepartment == expBuyerPriceBookFilterDepartment
    						&& actBuyerPriceBookFilterClearBtn == expBuyerPriceBookFilterClearBtn
    						&& actBuyerPriceBookFilterBtn == expBuyerPriceBookFilterBtn
    						&& actBuyerPriceBookLoadBtn == expBuyerPriceBookLoadBtn
    						&& actBuyerPriceBookAdvanceExportImportExcel == expBuyerPriceBookAdvanceExportImportExcel
    						&& actBuyerPriceBookHistory == expBuyerPriceBookHistory
    						&& actBuyerPriceBookExportXML == expBuyerPriceBookExportXML
    						&& actBuyerPriceBookImportFromXML == expBuyerPriceBookImportFromXML
    						&& actBuyerPriceBookExportExcel == expBuyerPriceBookExportExcel
    						&& actBuyerPriceBookImportFromExcel == expBuyerPriceBookImportFromExcel
    						&& actBuyerPriceBookViewPrice == expBuyerPriceBookViewPrice
    						&& actBuyerPriceBookUpdatePriceList == expBuyerPriceBookUpdatePriceList
    						&& actBuyerPriceBookGridItem == expBuyerPriceBookGridItem
    						&& actBuyerPriceBookRateColumn == expBuyerPriceBookRateColumn;
    	
    	
    	String actBuyerHomePageBody=Boolean.toString(TestResult);
    	String expBuyerHomePageBody=excelReader.getCellData(xlSheetName, 578, 7);
    	
    	
    	excelReader.setCellData(xlfile, xlSheetName, 578, 8, actBuyerHomePageBody.toUpperCase());
    	
    	
    	if (actBuyerHomePageBody.equalsIgnoreCase(expBuyerHomePageBody)) 
    	{
    		excelReader.setCellData(xlfile, xlSheetName, 575, 9, resPass);
    		return true;
    	}
    	else 
    	{
    		excelReader.setCellData(xlfile, xlSheetName, 575, 9, resFail);
    		return false;
    	}
      }
    	   catch (Exception e) 
    	   {
    	   String exception =e.getMessage();
    	   excelReader.setExceptionInExcel(xlfile, xlSheetName, 575, 10, exception);
    	   System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
    	   return false;
    	   }
        
      }

    
    
    
	
   @FindBy (xpath="//*[@id='ddlMenu']/li")
   public static List<WebElement> itemBuyerPriceBookCustomizationList;
   
	public boolean checkClickOnCustomizationSettingsOptionInBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
	
	 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 System.out.println("************************************* checkClickOnCustomizationSettingsOptionInBuyerPriceBook ***************************************");
	 
	 try
	 {
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_PriceBook));
	   buyerPriceBook_PriceBook.click();
	   buyerPriceBook_PriceBook.sendKeys(excelReader.getCellData(xlSheetName, 580, 6));
	   Thread.sleep(2000);
	   buyerPriceBook_PriceBook.sendKeys(Keys.TAB);
	
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeSettingBtn));
	   buyerPriceBook_CustamizeSettingBtn.click();
		   
	   ArrayList<String> actitemBuyerPriceBookCustomizationList=new ArrayList<String>();
		
	   int itemBuyerPriceBookCustomizationCount =itemBuyerPriceBookCustomizationList.size();
		 		
	   System.err.println("itemBuyerPriceBookCustomizationCount   :  "+itemBuyerPriceBookCustomizationCount);
		 		
       for (int i = 0; i < itemBuyerPriceBookCustomizationCount; i++) 
	   {
		  String data=itemBuyerPriceBookCustomizationList.get(i).getText();
		  actitemBuyerPriceBookCustomizationList.add(data);
	   }
	 		
	   String actitemBuyerPriceBookCustomization=actitemBuyerPriceBookCustomizationList.toString();
	   String expitemBuyerPriceBookCustomization=excelReader.getCellData(xlSheetName, 581, 7);
			 		
	   excelReader.setCellData(xlfile, xlSheetName, 581, 8, actitemBuyerPriceBookCustomization);
			    	
	   System.err.println("Actual  itemBuyerPriceBookCustomization  : " + actitemBuyerPriceBookCustomization);
	   System.err.println("Expected itemBuyerPriceBookCustomization : " + expitemBuyerPriceBookCustomization);
	  
	   boolean actDateRangeCheckBox = buyerPriceBook_CustamizeDateRangeCheckBox.isDisplayed();
	   boolean actVendorCheckBox    = buyerPriceBook_CustomizeVendorCheckBox.isDisplayed();
	   boolean actWarehouseCheckBox = buyerPriceBook_WarehouseCheckBox.isDisplayed();
	   boolean actQtyRangeCheckbox  = buyerPriceBook_QualityRangeCheckBox.isDisplayed();
	   boolean actCurrencyCheckBox  = buyerPriceBook_CurrencyCheckBox.isDisplayed();
	   boolean actUnitCheckBox      = buyerPriceBook_UnitCheckBox.isDisplayed();
	
	   boolean expDateRangeCheckBox = true;
	   boolean expVendorCheckBox    = true;
	   boolean expWarehouseCheckBox = true;
	   boolean expQtyRangeCheckbox  = true;
	   boolean expCurrencyCheckBox  = true;
	   boolean expUnitCheckBox      = true;
	
	   System.out.println("Buyer Price Book Value Actual              : " + actDateRangeCheckBox+  " Value Expected : " + expDateRangeCheckBox);
	   System.out.println("Buyer Price Book Abbreviation Value Actual : " + actVendorCheckBox +    " Value Expected : " + expVendorCheckBox);
	   System.out.println("Buyer Price Book Label Value Actual        : " + actWarehouseCheckBox+  " Value Expected : " + expWarehouseCheckBox);
	   System.out.println("Clear Button Value Actual                  : " + actQtyRangeCheckbox +  " Value Expected : " + expQtyRangeCheckbox);
	   System.out.println("Paste Button Value Actual                  : " + actCurrencyCheckBox +  " Value Expected : " + expCurrencyCheckBox);
	   System.out.println("Copy Button Value Actual                   : " + actUnitCheckBox +      " Value Expected : " + expUnitCheckBox);
			
	   boolean TestResult=actDateRangeCheckBox == expDateRangeCheckBox && actVendorCheckBox == expVendorCheckBox
								&& actWarehouseCheckBox == expWarehouseCheckBox && actQtyRangeCheckbox == expQtyRangeCheckbox
								&& actCurrencyCheckBox == expCurrencyCheckBox && actUnitCheckBox == expUnitCheckBox;
				
	   String actCustomizationCheckBoxesDisplayed=Boolean.toString(TestResult);
	   String expCustomizationCheckBoxesDisplayed=excelReader.getCellData(xlSheetName, 582, 7);
		
	   excelReader.setCellData(xlfile, xlSheetName, 582, 8, actCustomizationCheckBoxesDisplayed.toUpperCase());
			
	   if (actitemBuyerPriceBookCustomization.equalsIgnoreCase(expitemBuyerPriceBookCustomization) && 
				actCustomizationCheckBoxesDisplayed.equalsIgnoreCase(expCustomizationCheckBoxesDisplayed)) 
	   {
			excelReader.setCellData(xlfile, xlSheetName, 579, 9, resPass);
			return true;
	   }
	   else
	   {
			excelReader.setCellData(xlfile, xlSheetName, 579, 9, resPass);
			return false;
	   }
	 }
     catch (Exception e) 
     {
      String exception =e.getMessage();
      excelReader.setExceptionInExcel(xlfile, xlSheetName, 579, 10, exception);
      System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
      return false;
     }
    }	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//a[@id='16']//div[@class='form-group theme_button_color']")
	private static WebElement  settingsmenuBtn;
	
	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	private static WebElement  configureTransactionBtn;
	
	@FindBy(xpath = "//div[@class='theme_color font-6']")
	public static WebElement validationUpdatingConfirmationMessage;

	@FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[3]/span")
	public static WebElement closeValidationConfirmationMessage;
	
	@FindBy(xpath="//select[@id='SellingRate']")
	private static WebElement  sellingsRateDropdown;
	
	@FindBy(xpath="//select[@id='BuyingRates']")
	private static WebElement  buyingRatesdropdown;
	
	@FindBy(xpath="//span[@id='updateButton']")
	private static WebElement  updateBtn;
	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement  closeBtn;

	 
	public boolean checkCustomizeColumnsInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	 {
	   excelReader = new ExcelReader(POJOUtility.getExcelPath());
	   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	   System.out.println("********************************************** checkCustomizeColumnsInGrid  ******************************************************");

	   try
	   {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeDateRangeCheckBox));
			buyerPriceBook_CustamizeDateRangeCheckBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustomizeVendorCheckBox));
			buyerPriceBook_CustomizeVendorCheckBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_WarehouseCheckBox));
			buyerPriceBook_WarehouseCheckBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_QualityRangeCheckBox));
			buyerPriceBook_QualityRangeCheckBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CurrencyCheckBox));
			buyerPriceBook_CurrencyCheckBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_UnitCheckBox));
			buyerPriceBook_UnitCheckBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeSettingBtn));
			buyerPriceBook_CustamizeSettingBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(beforeClickOnToggle));
			beforeClickOnToggle.click();
			
			
			Thread.sleep(2000);
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridWareHouseColoumn));
			boolean actGridItemColumn         = gridItemColoumn.isDisplayed();
			boolean actGridWarehouseColumn    = gridWareHouseColoumn.isDisplayed();
			boolean actGridStartingDateColumn = startingdate.isDisplayed();
			boolean actGridEndingDateColumn   = endingdate.isDisplayed();
			boolean actGridVendorColumn       = vendor.isDisplayed();
			boolean actGridCurrencyColumn     = currencyPriceBook.isDisplayed();

			boolean expGridItemColumn         = true;
			boolean expGridWarehouseColumn    = true;
			boolean expGridStartingDateColumn = true;
			boolean expGridEndingDateColumn   = true;
			boolean expGridVendorColumn       = true;
			boolean expGridCurrencyColumn     = true;

			System.out.println("Grid Item Column Value Actual               : " + actGridItemColumn +        " Value Expected : " + expGridItemColumn);
			System.out.println("Grid Warehouse Column Value Actual          : " + actGridWarehouseColumn+    " Value Expected : " + expGridWarehouseColumn);
			System.out.println("Grid Starting Date Column Value Actual      : " + actGridStartingDateColumn+ " Value Expected : " + expGridStartingDateColumn);
			System.out.println("Grid Ending Date Column Value Actual        : " + actGridEndingDateColumn+   " Value Expected : " + expGridEndingDateColumn);
			System.out.println("Grid Vendor Column Value Actual             : " + actGridVendorColumn+       " Value Expected : " + expGridVendorColumn);
			System.out.println("Grid Currency Columnn Value Actual          : " + actGridCurrencyColumn+     " Value Expected : " + expGridCurrencyColumn);

		
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCellSelect));
			itemFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemValuePriceBook));
			itemValuePriceBook.click();
			itemValuePriceBook.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseValue));
			wareHouseValue.click();
			wareHouseValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(satrtingDateFirstCellSelect));
			satrtingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startingDateValue));
			startingDateValue.click();
			startingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateFirstCellSelect));
			endingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateValue));
			endingDateValue.click();
			endingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorFirstCellSelect));
			vendorFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
			vendorValue.click();
			vendorValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorFirstCellSelect));
			vendorFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
			vendorValue.click();
			vendorValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyFirstCellSelect));
			currencyFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyOptionValue));
			currencyOptionValue.click();
			currencyOptionValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyFirstCellSelect));
			minQtyFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyValue));
			minQtyValue.click();
			minQtyValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyFirstCellSelect));
			maxQtyFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyValue));
			maxQtyValue.click();
			maxQtyValue.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rate));
			boolean actGridMinQtyColumn = minQty.isDisplayed();
			boolean actGridMaxQtyColumn = maxQty.isDisplayed();
			boolean actGridUnitColumn   = unit.isDisplayed();
			boolean actGridRateColumn   = rate.isDisplayed();
			/*boolean actGridPOColumn     = po.isDisplayed();
			boolean actGridPTColumn     = pt.isDisplayed();*/

			boolean expGridMinQtyColumn = true;
			boolean expGridMaxQtyColumn = true;
			boolean expGridUnitColumn   = true;
			boolean expGridRateColumn   = true;
			/*boolean expGridPOColumn     = true;
			boolean expGridPTColumn     = true;*/

			System.out.println("Grid Min Qty Column Value Actual              : " + actGridMinQtyColumn+ " Value Expected : " + expGridMinQtyColumn);
			System.out.println("Grid Max Qty Column Value Actual              : " + actGridMaxQtyColumn+ " Value Expected : " + expGridMaxQtyColumn);
			System.out.println("Grid Unit Column Value Actual                 : " + actGridUnitColumn+   " Value Expected : " + expGridUnitColumn);
			System.out.println("Grid Rate Column Value Actual                 : " + actGridRateColumn+   " Value Expected : " + expGridRateColumn);
			/*System.out.println("Grid PO Column Value Actual                   : " + actGridPOColumn +    " Value Expected : "+ expGridPOColumn);
			System.out.println("Grid PT Column Value Actual                   : " + actGridPTColumn +    " Value Expected : "+ expGridPTColumn);
	*/
			
			
			boolean testResult=actGridItemColumn == expGridItemColumn && actGridWarehouseColumn == actGridWarehouseColumn
								&& actGridStartingDateColumn == actGridStartingDateColumn
								&& actGridEndingDateColumn == actGridEndingDateColumn && actGridVendorColumn == actGridVendorColumn
								&& actGridCurrencyColumn == actGridCurrencyColumn
				
								&& actGridMinQtyColumn == expGridMinQtyColumn && actGridMaxQtyColumn == expGridMaxQtyColumn
								&& actGridUnitColumn == expGridUnitColumn && actGridRateColumn == expGridRateColumn
								/*&& actGridPOColumn == expGridPOColumn && actGridPTColumn == expGridPTColumn*/;
			
			
			String actBuyerPriceBook=Boolean.toString(testResult);
			String expBuyerPriceBook= excelReader.getCellData(xlSheetName, 585, 7);
			
			
			excelReader.setCellData(xlfile, xlSheetName, 585, 8, actBuyerPriceBook);
			
			if (actBuyerPriceBook.equalsIgnoreCase(expBuyerPriceBook) )	
			{
				excelReader.setCellData(xlfile, xlSheetName, 583, 9, resPass);
				return true;
			}
			else
			{excelReader.setCellData(xlfile, xlSheetName, 583, 9, resPass);
				return false;
			}
	   }
	   catch (Exception e) 
	   {
	    String exception =e.getMessage();
	    excelReader.setExceptionInExcel(xlfile, xlSheetName, 583, 10, exception);
	    System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	    return false;
	   }
	 }

	 
	  public boolean checkSaveBuyerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************************** checkSaveBuyerPriceBook  ******************************************************");
			
	    try
	    {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCellSelect));
			itemFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemValuePriceBook));
			itemValuePriceBook.click();
			itemValuePriceBook.sendKeys(excelReader.getCellData(xlSheetName, 587, 6));
	        Thread.sleep(2000);

	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseFirstCellSelect));
			wareHouseFirstCellSelect.click();
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseValue));
			wareHouseValue.click();
			wareHouseValue.sendKeys(excelReader.getCellData(xlSheetName, 588, 6));
			Thread.sleep(2000);*/
			wareHouseValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(satrtingDateFirstCellSelect));
			satrtingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startingDateValue));
			startingDateValue.click();
			startingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateFirstCellSelect));
			endingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateValue));
			endingDateValue.click();
			endingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorFirstCellSelect));
			vendorFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
			vendorValue.click();
			/*vendorValue.sendKeys(excelReader.getCellData(xlSheetName, 589, 6));
			Thread.sleep(2000);*/
			vendorValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyFirstCellSelect));
			currencyFirstCellSelect.click();

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyOptionValue));
			currencyOptionValue.click();
			currencyOptionValue.sendKeys(excelReader.getCellData(xlSheetName, 590, 6));
			Thread.sleep(2000);
			currencyOptionValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyFirstCellSelect));
			minQtyFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyValue));
			minQtyValue.click();
			minQtyValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyFirstCellSelect));
			maxQtyFirstCellSelect.click();

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyValue));
			maxQtyValue.click();
			maxQtyValue.sendKeys(Keys.TAB);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateFirstCellSelect));
			rateFirstCellSelect.click();

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateValue));
			rateValue.sendKeys(excelReader.getCellData(xlSheetName, 591, 6));
			Thread.sleep(2000);
			rateValue.sendKeys(Keys.TAB);

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PoValue));
			PoValue.sendKeys(excelReader.getCellData(xlSheetName, 592, 6));
			PoValue.sendKeys(Keys.TAB);
	*/
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookSaveBtn));
			buyerPriceBookSaveBtn.click();
			
	        String expSaveMessage = excelReader.getCellData(xlSheetName, 593, 7);
			
			boolean actSaveAccountMessage = checkValidationMessageboolean(expSaveMessage);
			boolean expSaveAccountMessage = true;

			String actSavingStatus= Boolean.toString(actSaveAccountMessage);
			String expSavingStatus=excelReader.getCellData(xlSheetName, 594, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 594, 8, actSavingStatus.toUpperCase());
			
			System.out.println("Actual Saving Status  : "+actSavingStatus);
			System.out.println(" Expected Saving Status  : "+expSavingStatus);
			

			if (actSavingStatus.equalsIgnoreCase(expSavingStatus) ) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 586, 9, resPass);
				return true;
			} 
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 586, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
		  {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 586, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
		  }
	 }

	 public boolean checkEditBuyerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {

		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************************** checkEditBuyerPriceBook  ******************************************************");
			
	    try
	    {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(afterClickOnToggle));
			afterClickOnToggle.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_PriceBook));
			buyerPriceBook_PriceBook.click();
			buyerPriceBook_PriceBook.sendKeys(excelReader.getCellData(xlSheetName, 596, 6));
			Thread.sleep(2000);
			buyerPriceBook_PriceBook.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_AbbreviationBtn));
			buyerPriceBook_AbbreviationBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_PriceBook));
			String actPriceBookName = buyerPriceBook_PriceBook.getAttribute("value");
			String expPriceBookName = excelReader.getCellData(xlSheetName, 597, 7);

			excelReader.setCellData(xlfile, xlSheetName, 597, 8, actPriceBookName);
			
			System.out.println("Edit Buyer Price Book Check Price Book Name  : " + actPriceBookName + "  Value Expected : "+ expPriceBookName);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookFilter_FilterAndLoadBtn));
			buyerPriceBookFilter_FilterAndLoadBtn.click();
			Thread.sleep(4000);	
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorFirstCellSelect));
			String actItemFirstCell      = itemFirstCellSelect.getText();
		/*	String actWarehouseFirstCell = wareHouseFirstCellSelect.getText();
			String actVendorFirstCell    = vendorFirstCellSelect.getText();
		*/	String actCurrencyFirstCell  = currencyFirstCellSelect.getText();
			String actRateFirstCell      = rateFirstCellSelect.getText();
			/*String actPOFirstCell        = PoFirstCellSelect.getText();*/

			
			String expItemFirstCell      = excelReader.getCellData(xlSheetName, 598, 7);
		/*	String expWarehouseFirstCell = excelReader.getCellData(xlSheetName, 599, 7);
			String expVendorFirstCell    = excelReader.getCellData(xlSheetName, 600, 7);
		*/	String expCurrencyFirstCell  = excelReader.getCellData(xlSheetName, 601, 7);
			String expRateFirstCell      = excelReader.getCellData(xlSheetName, 602, 7);
			/*String expPOFirstCell        = excelReader.getCellData(xlSheetName, 603, 7);*/
			
			excelReader.setCellData(xlfile, xlSheetName, 598, 8, actItemFirstCell);
		/*	excelReader.setCellData(xlfile, xlSheetName, 599, 8, actWarehouseFirstCell);
			excelReader.setCellData(xlfile, xlSheetName, 600, 8, actVendorFirstCell);
		*/	excelReader.setCellData(xlfile, xlSheetName, 601, 8, actCurrencyFirstCell);
			excelReader.setCellData(xlfile, xlSheetName, 602, 8, actRateFirstCell);/*
			excelReader.setCellData(xlfile, xlSheetName, 603, 8, actPOFirstCell);

			System.out.println("Edit Buyer Price Book check Item            : " + actItemFirstCell +     " Value Expected : "+ expItemFirstCell);
		/*	System.out.println("Edit Buyer Price Book check Warehouse       : " + actWarehouseFirstCell+ " Value Expected : " + expWarehouseFirstCell);
			System.out.println("Edit Buyer Price Book check Vendor          : " + actVendorFirstCell +   " Value Expected : "+ expVendorFirstCell);
		*/	System.out.println("Edit Buyer Price Book check Currency        : " + actCurrencyFirstCell + " Value Expected : " + expCurrencyFirstCell);
			System.out.println("Edit Buyer Price Book check Rate            : " + actRateFirstCell +     " Value Expected : "+ expRateFirstCell);
			/*System.out.println("Edit Buyer Price Book check PO              : " + actPOFirstCell +       " Value Expected : "+ expPOFirstCell);*/

			if (actPriceBookName.equalsIgnoreCase(expPriceBookName)

					&& actItemFirstCell.equalsIgnoreCase(expItemFirstCell)
		/*			&& actWarehouseFirstCell.equalsIgnoreCase(expWarehouseFirstCell)
					&& actVendorFirstCell.equalsIgnoreCase(expVendorFirstCell)
		*/			&& actCurrencyFirstCell.equalsIgnoreCase(expCurrencyFirstCell)
					&& actRateFirstCell.equalsIgnoreCase(expRateFirstCell)) 
			{
				System.out.println("Pass: Edit Buyer PriceBook");
				excelReader.setCellData(xlfile, xlSheetName, 595, 9, resPass);
				return true;
			}
			else 
			{
				System.out.println("Fail: Edit Buyer PriceBook");
				excelReader.setCellData(xlfile, xlSheetName, 595, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
	    {
	    String exception =e.getMessage();
	    excelReader.setExceptionInExcel(xlfile, xlSheetName, 595, 10, exception);
	    System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	    return false;
	    }
	  }


	 
	  @FindBy(xpath = "//input[@id='PriceBookWebGrid_option_11']")
	  private static WebElement buyerPriceBookUnit;

	  public boolean checkUpdateBuyerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {

	   excelReader = new ExcelReader(POJOUtility.getExcelPath());
	   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	   System.out.println("********************************************** checkUpdateBuyerPriceBook  ******************************************************");
			
	   try
	   {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSecondCellSelect));
		itemSecondCellSelect.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemValuePriceBook));
		itemValuePriceBook.click();
		
		itemValuePriceBook.sendKeys(excelReader.getCellData(xlSheetName, 605, 6));
		Thread.sleep(2000);
		itemValuePriceBook.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseSecondCellSelect));
		wareHouseSecondCellSelect.click();
		/*wareHouseValue.sendKeys(excelReader.getCellData(xlSheetName, 606, 6));
		Thread.sleep(2000);*/
		wareHouseValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(satrtingDateSecondCellSelect));
		satrtingDateSecondCellSelect.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startingDateValue));
		startingDateValue.click();
		startingDateValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateSecondCellSelect));
		endingDateSecondCellSelect.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateValue));
		endingDateValue.click();
		endingDateValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSecondCellSelect));
		vendorSecondCellSelect.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
		vendorValue.click();
		Thread.sleep(3000);
		/*vendorValue.sendKeys(excelReader.getCellData(xlSheetName, 607, 6));
		Thread.sleep(2000);*/
		vendorValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyOptionValue));
		currencyOptionValue.click();
		currencyOptionValue.sendKeys(excelReader.getCellData(xlSheetName, 608, 6));
		Thread.sleep(2000);
		currencyOptionValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyValue));
		minQtyValue.click();
		minQtyValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyValue));
		maxQtyValue.click();
		maxQtyValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookUnit));
		buyerPriceBookUnit.click();
		buyerPriceBookUnit.sendKeys(Keys.END);
		buyerPriceBookUnit.sendKeys(Keys.SHIFT,Keys.HOME);
		buyerPriceBookUnit.sendKeys(excelReader.getCellData(xlSheetName, 609, 6));
		Thread.sleep(2000);
		buyerPriceBookUnit.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateValue));
		rateValue.sendKeys(excelReader.getCellData(xlSheetName, 610, 6));
		Thread.sleep(2000);
		rateValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PoValue));
		PoValue.sendKeys(excelReader.getCellData(xlSheetName, 611, 6));
		Thread.sleep(2000);
		PoValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookSaveBtn));
		buyerPriceBookSaveBtn.click();
		
		String expSaveMessage = excelReader.getCellData(xlSheetName, 612, 7);
		
		//excelReader.setCellData(xlfile, xlSheetName, 612, 8, expSaveMessage);//To Get Actual Saving Message 
		
		boolean actSaveAccountMessage = checkValidationMessageboolean(expSaveMessage);
		boolean expSaveAccountMessage = true;

		String actUpdatingSavingStatus= Boolean.toString(actSaveAccountMessage);
		String expUpdatingSavingStatus=excelReader.getCellData(xlSheetName, 613, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 613, 8, actUpdatingSavingStatus.toUpperCase());
		
		System.out.println("Actual Updating Saving Status  : "+actUpdatingSavingStatus);
		System.out.println(" Expected  Updating Saving Status  : "+expUpdatingSavingStatus);
		
		
		if (actUpdatingSavingStatus.equalsIgnoreCase(expUpdatingSavingStatus)) 
		{
			System.out.println("Pass: Update Buyer PriceBook and Saved Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 604, 9, resPass);
			return true;
		} 
		else
		{
			System.out.println("Fail:   Update Buyer PriceBook and Saved Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 604, 9, resFail);
			return false;
		}
	   }
	   catch (Exception e) 
	   {
	   String exception =e.getMessage();
	   excelReader.setExceptionInExcel(xlfile, xlSheetName, 604, 10, exception);
	   System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	   return false;
	   }
	 }

	 public boolean checkUpdatePricebookInEditPricebook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {

	  excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  System.out.println("********************************************** checkUpdatePricebookInEditPricebook  ******************************************************");
			
	  try
	  {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_PriceBook));
		buyerPriceBook_PriceBook.click();
		buyerPriceBook_PriceBook.sendKeys(excelReader.getCellData(xlSheetName, 615, 6));
		Thread.sleep(2000);
		buyerPriceBook_PriceBook.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_AbbreviationBtn));
		buyerPriceBook_AbbreviationBtn.click();
		Thread.sleep(2000);

		String actPriceBookName       = buyerPriceBook_PriceBook.getAttribute("value");
		String expPriceBookName       = excelReader.getCellData(xlSheetName, 616, 7);

		excelReader.setCellData(xlfile, xlSheetName, 616, 8, actPriceBookName);
		
		System.out.println("Edit Buyer Price Book Check Price Book Name  : " + actPriceBookName + "  Value Expected : " + expPriceBookName);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookFilter_FilterAndLoadBtn));
		buyerPriceBookFilter_FilterAndLoadBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCellSelect));
		String actItemFirstCell       = itemFirstCellSelect.getText();
		/*String actWarehouseFirstCell  = wareHouseFirstCellSelect.getText();
		String actVendorFirstCell     = vendorFirstCellSelect.getText();
		*/
		String actCurrencyFirstCell   = currencyFirstCellSelect.getText();
		String actRateFirstCell       = rateFirstCellSelect.getText();
		/*String actPOFirstCell         = PoFirstCellSelect.getText();*/

		excelReader.setCellData(xlfile, xlSheetName, 618, 8, actItemFirstCell);
		/*excelReader.setCellData(xlfile, xlSheetName, 619, 8, actWarehouseFirstCell);
		excelReader.setCellData(xlfile, xlSheetName, 620, 8, actVendorFirstCell);
		*/excelReader.setCellData(xlfile, xlSheetName, 621, 8, actCurrencyFirstCell);
		excelReader.setCellData(xlfile, xlSheetName, 622, 8, actRateFirstCell);
		/*excelReader.setCellData(xlfile, xlSheetName, 623, 8, actPOFirstCell);*/
		
		
		String actItemSecondCell      = itemSecondCellSelect.getText();
		/*String actWarehouseSecondCell = wareHouseSecondCellSelect.getText();
		String actVendorSecondCell    = vendorSecondCellSelect.getText();
		*/
		String actx                   = unitSecondCellSelect.getText();
		String actCurrencySecondCell  = currencySecondCellSelect.getText();
		String actRateSecondCell      = rateSecondCellSelect.getText();
		/*String actPOSecondCell        = PoSecondCellSelect.getText();*/

		
		excelReader.setCellData(xlfile, xlSheetName, 625, 8, actItemSecondCell);
		/*excelReader.setCellData(xlfile, xlSheetName, 626, 8, actWarehouseSecondCell);
		excelReader.setCellData(xlfile, xlSheetName, 627, 8, actVendorSecondCell);
		*/excelReader.setCellData(xlfile, xlSheetName, 628, 8, actx);
		excelReader.setCellData(xlfile, xlSheetName, 629, 8, actCurrencySecondCell);
		excelReader.setCellData(xlfile, xlSheetName, 630, 8, actRateSecondCell);
		/*excelReader.setCellData(xlfile, xlSheetName, 631, 8, actPOSecondCell);*/
		
		
		String expItemFirstCell       = excelReader.getCellData(xlSheetName, 618, 7);
		/*String expWarehouseFirstCell  = excelReader.getCellData(xlSheetName, 619, 7);
		String expVendorFirstCell     = excelReader.getCellData(xlSheetName, 620, 7);*/
		String expCurrencyFirstCell   = excelReader.getCellData(xlSheetName, 621, 7);
		String expRateFirstCell       = excelReader.getCellData(xlSheetName, 622, 7);
		/*String expPOFirstCell         = excelReader.getCellData(xlSheetName, 623, 7);*/

		String expItemSecondCell      = excelReader.getCellData(xlSheetName, 625, 7);
		/*String expWarehouseSecondCell = excelReader.getCellData(xlSheetName, 626, 7);
		String expVendorSecondCell    = excelReader.getCellData(xlSheetName, 627, 7);*/
		String expx                   = excelReader.getCellData(xlSheetName, 628, 7);
		String expCurrencySecondCell  = excelReader.getCellData(xlSheetName, 629, 7);
		String expRateSecondCell      = excelReader.getCellData(xlSheetName, 630, 7);
		/*String expPOSecondCell        = excelReader.getCellData(xlSheetName, 631, 7);*/

		System.out.println("Edit Buyer Price Book check Item            : " + actItemFirstCell +      " Value Expected : " + expItemFirstCell);
		/*System.out.println("Edit Buyer Price Book check Warehouse       : " + actWarehouseFirstCell+  " Value Expected : " + expWarehouseFirstCell);
		System.out.println("Edit Buyer Price Book check Vendor          : " + actVendorFirstCell +    " Value Expected : "+ expVendorFirstCell); 
		*/
		System.out.println("Edit Buyer Price Book check Currency        : " + actCurrencyFirstCell+   " Value Expected : " + expCurrencyFirstCell);
		System.out.println("Edit Buyer Price Book check Rate            : " + actRateFirstCell +      " Value Expected : "+ expRateFirstCell);
		/*System.out.println("Edit Buyer Price Book check PO              : " + actPOFirstCell +        " Value Expected : "+ expPOFirstCell);*/

		System.out.println("Edit Buyer Price Book check Item            : " + actItemSecondCell +     " Value Expected : "+ expItemSecondCell);
		/*System.out.println("Edit Buyer Price Book check Warehouse       : " + actWarehouseSecondCell+ " Value Expected : " + expWarehouseSecondCell);
		System.out.println("Edit Buyer Price Book check Vendor          : " + actVendorSecondCell+    " Value Expected : " + expVendorSecondCell);
		*/
		System.out.println("Edit Buyer Price Book check X               : " + actx +                  " Value Expected : " + expx);
		System.out.println("Edit Buyer Price Book check Currency        : " + actCurrencySecondCell+  " Value Expected : " + expCurrencySecondCell);
		System.out.println("Edit Buyer Price Book check Rate            : " + actRateSecondCell +     " Value Expected : "+ expRateSecondCell);
		/*System.out.println("Edit Buyer Price Book check PO              : " + actPOSecondCell +       " Value Expected : "+ expPOSecondCell);*/

		if (actPriceBookName.equalsIgnoreCase(expPriceBookName)

				&& actItemFirstCell.equalsIgnoreCase(expItemFirstCell)
				&& actCurrencyFirstCell.equalsIgnoreCase(expCurrencyFirstCell)
				&& actRateFirstCell.equalsIgnoreCase(expRateFirstCell)
				

				&& actItemSecondCell.equalsIgnoreCase(expItemSecondCell)
				&& actCurrencySecondCell.equalsIgnoreCase(expCurrencySecondCell) && actx.equalsIgnoreCase(expx)
				&& actRateSecondCell.equalsIgnoreCase(expRateSecondCell)) 
		{
			System.out.println("Pass: Edit Buyer PriceBook");
			excelReader.setCellData(xlfile, xlSheetName, 614, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println("Fail: Edit Buyer PriceBook");
			excelReader.setCellData(xlfile, xlSheetName, 614, 9, resFail);
			return false;
		}
	  }
		  catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 614, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }

		
	 public boolean checkClickOnYesOptionInDeleteSavedCopyAndPaste() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {

	  excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  System.out.println("********************************************** checkClickOnYesOptionInDeleteSavedCopyAndPaste  *******************************************");
		
	  try
	  {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookDeleteBtn));
			buyerPriceBookDeleteBtn.click();

			getWaitForAlert();
			
			getAlert().accept();

			
	       String expSaveMessage = excelReader.getCellData(xlSheetName, 633, 7);
			
	        //excelReader.setCellData(xlfile, xlSheetName, 1408, 8, expSaveMessage);
	       
			boolean actDeleteMessage = checkValidationMessageboolean(expSaveMessage);
			boolean expDeleteAccountMessage = true;

			String actDeleteStatus= Boolean.toString(actDeleteMessage);
			String expDeleteStatus=excelReader.getCellData(xlSheetName, 634, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 634, 8, actDeleteStatus.toUpperCase());
			
			System.out.println("Actual Delete Status  : "+actDeleteStatus);
			System.out.println(" Expected Delete Status  : "+expDeleteStatus);
			
			if (actDeleteStatus.equalsIgnoreCase(expDeleteStatus))
			{
				System.out.println("Pass: Yes Button in Delete option ");
				excelReader.setCellData(xlfile, xlSheetName, 632, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Fail: Yes Button in Delete option ");
				excelReader.setCellData(xlfile, xlSheetName, 632, 9, resPass);
				return false;
			}
	    }
	    catch (Exception e) 
	    {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 632, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	    }
	  }

	 
	 
	 public boolean checkSaveOptionBuyerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************************** checkSaveBuyerPriceBook  ******************************************************");
			
	   try
	   {
		   
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_PriceBook));
		    buyerPriceBook_PriceBook.click();
		    buyerPriceBook_PriceBook.sendKeys(excelReader.getCellData(xlSheetName, 580, 6));
		    Thread.sleep(2000);
		    buyerPriceBook_PriceBook.sendKeys(Keys.TAB);
		    
		    
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeSettingBtn));
		    buyerPriceBook_CustamizeSettingBtn.click();
		    Thread.sleep(2000);
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeDateRangeCheckBox));
			buyerPriceBook_CustamizeDateRangeCheckBox.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustomizeVendorCheckBox));
			buyerPriceBook_CustomizeVendorCheckBox.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_WarehouseCheckBox));
			buyerPriceBook_WarehouseCheckBox.click();
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_QualityRangeCheckBox));
			buyerPriceBook_QualityRangeCheckBox.click();
			
	        // This is getting checked so thats why commenting 
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CurrencyCheckBox));
			buyerPriceBook_CurrencyCheckBox.click();
			*/

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_UnitCheckBox));
			buyerPriceBook_UnitCheckBox.click();
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeSettingBtn));
			buyerPriceBook_CustamizeSettingBtn.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(beforeClickOnToggle));
			beforeClickOnToggle.click();
			
			
		
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCellSelect));
			itemFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemValuePriceBook));
			itemValuePriceBook.click();
			itemValuePriceBook.sendKeys(excelReader.getCellData(xlSheetName, 587, 6));
	        Thread.sleep(2000);
	        itemValuePriceBook.sendKeys(Keys.TAB);
	        
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseFirstCellSelect));
			wareHouseFirstCellSelect.click();
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseValue));
			wareHouseValue.click();
			wareHouseValue.sendKeys(excelReader.getCellData(xlSheetName, 588, 6));
			Thread.sleep(2000);*/
			wareHouseValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(satrtingDateFirstCellSelect));
			satrtingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startingDateValue));
			startingDateValue.click();
			startingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateFirstCellSelect));
			endingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateValue));
			endingDateValue.click();
			endingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorFirstCellSelect));
			vendorFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
			vendorValue.click();
			/*vendorValue.sendKeys(excelReader.getCellData(xlSheetName, 589, 6));
			Thread.sleep(2000);*/
			vendorValue.sendKeys(Keys.TAB);

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyFirstCellSelect));
			currencyFirstCellSelect.click();
	*/
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyOptionValue));
			currencyOptionValue.click();
			currencyOptionValue.sendKeys(excelReader.getCellData(xlSheetName, 590, 6));
			Thread.sleep(2000);
			currencyOptionValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyFirstCellSelect));
			minQtyFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyValue));
			minQtyValue.click();
			Thread.sleep(2000);
			minQtyValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyFirstCellSelect));
			maxQtyFirstCellSelect.click();
			Thread.sleep(2000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyValue));
			maxQtyValue.click();
			maxQtyValue.sendKeys(Keys.TAB);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateFirstCellSelect));
			rateFirstCellSelect.click();
			Thread.sleep(2000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateValue));
			rateValue.sendKeys(excelReader.getCellData(xlSheetName, 591, 6));
			Thread.sleep(2000);
			rateValue.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSecondCellSelect));
			itemSecondCellSelect.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemValuePriceBook));
			itemValuePriceBook.click();
			
			itemValuePriceBook.sendKeys(excelReader.getCellData(xlSheetName, 605, 6));
			Thread.sleep(2000);
			itemValuePriceBook.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseSecondCellSelect));
			wareHouseSecondCellSelect.click();
			/*wareHouseValue.sendKeys(excelReader.getCellData(xlSheetName, 606, 6));
			Thread.sleep(2000);*/
			wareHouseValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(satrtingDateSecondCellSelect));
			satrtingDateSecondCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startingDateValue));
			startingDateValue.click();
			startingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateSecondCellSelect));
			endingDateSecondCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateValue));
			endingDateValue.click();
			endingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSecondCellSelect));
			vendorSecondCellSelect.click();

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
			vendorValue.click();
			Thread.sleep(3000);
			vendorValue.sendKeys(excelReader.getCellData(xlSheetName, 607, 6));
			Thread.sleep(2000);*/
			vendorValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyOptionValue));
			currencyOptionValue.click();
			currencyOptionValue.sendKeys(excelReader.getCellData(xlSheetName, 608, 6));
			Thread.sleep(2000);
			currencyOptionValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyValue));
			minQtyValue.click();
			minQtyValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyValue));
			maxQtyValue.click();
			maxQtyValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookUnit));
			buyerPriceBookUnit.click();
			buyerPriceBookUnit.sendKeys(Keys.END);
			buyerPriceBookUnit.sendKeys(Keys.SHIFT,Keys.HOME);
			buyerPriceBookUnit.sendKeys(excelReader.getCellData(xlSheetName, 609, 6));
			Thread.sleep(2000);
			buyerPriceBookUnit.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateValue));
			rateValue.sendKeys(excelReader.getCellData(xlSheetName, 610, 6));
			Thread.sleep(2000);
			rateValue.sendKeys(Keys.TAB);

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PoValue));
			PoValue.sendKeys(excelReader.getCellData(xlSheetName, 592, 6));
			PoValue.sendKeys(Keys.TAB);
	*/
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookSaveBtn));
			buyerPriceBookSaveBtn.click();
			
	       String expSaveMessage = excelReader.getCellData(xlSheetName, 593, 7);
			
			boolean actSaveAccountMessage = checkValidationMessageboolean(expSaveMessage);
			boolean expSaveAccountMessage = true;

			String actSavingStatus= Boolean.toString(actSaveAccountMessage);
			String expSavingStatus=excelReader.getCellData(xlSheetName, 594, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 594, 8, actSavingStatus.toUpperCase());
			
			System.out.println("Actual Saving Status  : "+actSavingStatus);
			System.out.println(" Expected Saving Status  : "+expSavingStatus);
			

			if (actSavingStatus.equalsIgnoreCase(expSavingStatus) ) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 586, 9, resPass);
				return true;
			} 
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 586, 9, resFail);
				return false;
			}
	   }
	   catch (Exception e) 
	   {
	     String exception =e.getMessage();
	     excelReader.setExceptionInExcel(xlfile, xlSheetName, 586, 10, exception);
	     System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	     return false;
	  }
	}

	 

	 public boolean checkClickOnCloseButtonInBuyingRates() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {

		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************************** checkClickOnCloseButtonInBuyingRates  ******************************************************");
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookCloseBtn));
			buyerPriceBookCloseBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));

			String actDashboardLabel = labelDashboard.getText();
			String expDashboardLabel = excelReader.getCellData(xlSheetName, 635, 7);

			excelReader.setCellData(xlfile, xlSheetName, 635, 8, actDashboardLabel);
			
			System.out.println("Close Button  : " + actDashboardLabel + "  Value Expected : " + expDashboardLabel);

			if (actDashboardLabel.equalsIgnoreCase(expDashboardLabel)) 
			{
				System.out.println("Test Pass : Transaction Authorization is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 635, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Test Fail : Transaction Authorization is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 635, 9, resFail);
				return false;

			}
		 }
		 catch (Exception e) 
		 {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 635, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		 }
		}
	 
	 
	 
	 
	 
	 //SELLER PRICE BOOK
	 
	 @FindBy(xpath = "//*[@id='myNavbar']/ul/li")
	 public static List<WebElement> sellerHomePageHeaderList;

	 @FindBy(xpath = "//*[@id='formLoadDataXML']/button")
	 public static List<WebElement> sellerHomePageFooterList;
	 

	 public boolean checkClickOnSellerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {
	   excelReader = new ExcelReader(POJOUtility.getExcelPath());
	   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	   System.out.println("*************************************************** checkClickOnSellerPriceBook *****************************************************************");

	   try
	   {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
			mastersMenu.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemsMenu));
			itemsMenu.click();
		
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(sellerPriceBookMenu));
			sellerPriceBookMenu.click();
			
			Thread.sleep(2000);
				
			ArrayList<String> actsellerHomePageHeaderList=new ArrayList<String>();
			
			int sellerHomePageHeaderCount =sellerHomePageHeaderList.size();
			
			System.err.println("sellerHomePageHeaderCount   :  "+sellerHomePageHeaderCount);
			
			for (int i = 0; i < sellerHomePageHeaderCount; i++) 
			{
				String data=sellerHomePageHeaderList.get(i).getText();
				actsellerHomePageHeaderList.add(data);
			}
					 		
			String actsellerHomePageHeader=actsellerHomePageHeaderList.toString();
			String expsellerHomePageHeader=excelReader.getCellData(xlSheetName, 638, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 638, 8, actsellerHomePageHeader);
			
			System.err.println("  Actual  sellerHomePageHeader : "+actsellerHomePageHeader);
			System.err.println("  Expected  sellerHomePageHeader : "+expsellerHomePageHeader);
				
			    	
			ArrayList<String> actsellerHomePageFooterList=new ArrayList<String>();
				
			int sellerHomePageFooterCount =sellerHomePageFooterList.size();
			
			System.err.println("sellerHomePageFooterCount   :  "+sellerHomePageFooterCount);
			
			for (int i = 0; i < sellerHomePageFooterCount; i++) 
			{
				String data=sellerHomePageFooterList.get(i).getText();
				actsellerHomePageFooterList.add(data);
			}
					 		
			String actsellerHomePageFooter=actsellerHomePageFooterList.toString();
			String expsellerHomePageFooter=excelReader.getCellData(xlSheetName, 639, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 639, 8, actsellerHomePageFooter);
			
			System.err.println("  Actual  sellerHomePageFooter : "+actsellerHomePageFooter);
			System.err.println("  Expected  sellerHomePageFooter : "+expsellerHomePageFooter);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookSaveBtn));
			boolean actBuyerPriceBook                         = buyerPriceBook_PriceBook.isDisplayed();
			boolean actBuyerPriceBookAbbreviation             = buyerPriceBook_AbbreviationBtn.isDisplayed();
			boolean actBuyerPriceBookLabel                    = buyerPriceBookLabel.isDisplayed();
			boolean actBuyerPriceBookClearBtn                 = buyerPriceBookClearBtn.isDisplayed();
			boolean actBuyerPriceBookPasteBtn                 = buyerPriceBookPasteBtn.isDisplayed();
			boolean actBuyerPriceBookCopyBtn                  = buyerPriceBookCopyBtn.isDisplayed();
			boolean actBuyerPriceBookSelectAllBtn             = buyerPriceBookSelectAllBtn.isDisplayed();
			boolean actBuyerPriceBookCloseBtn                 = buyerPriceBookCloseBtn.isDisplayed();
			boolean actBuyerPriceBookSaveBtn                  = buyerPriceBookSaveBtn.isDisplayed();
			boolean actBuyerPriceBookDeleteBtn                = buyerPriceBookDeleteBtn.isDisplayed();
			boolean actBuyerPriceBookStartingDate             = buyerPriceBookStaringDate.isDisplayed();
			boolean actBuyerPriceBookEndingDate               = buyerPriceBookENdingDate.isDisplayed();
			boolean actBuyerPriceBookInActiveCheckbox         = buyerPriceBookInActiveCheckBox.isDisplayed();
			boolean actBuyerPriceBookFilterItem               = buyerPriceBookFilter_Item.isDisplayed();
			boolean actBuyerPriceBookFilterCurrency           = buyerPriceBookFilter_Currency.isDisplayed();
			boolean actBuyerPriceBookFilterCustomer           = buyerPriceBookFilter_Customer.isDisplayed();
			boolean actBuyerPriceBookFilterDepartment         = buyerPriceBookFilter_Department.isDisplayed();
			boolean actBuyerPriceBookFilterClearBtn           = buyerPriceBookFilter_ClearBtn.isDisplayed();
			boolean actBuyerPriceBookFilterBtn                = buyerPriceBookFilter_FilterBtn.isDisplayed();
			boolean actBuyerPriceBookLoadBtn                  = buyerPriceBookFilter_FilterAndLoadBtn.isDisplayed();
			boolean actBuyerPriceBookAdvanceExportImportExcel = buyerPriceBook_AdvanceExcelImportBtn.isDisplayed();
			boolean actBuyerPriceBookHistory                  = buyerPriceBook_PrintRateHistoryBtn.isDisplayed();
			boolean actBuyerPriceBookExportXML                = buyerPriceBook_ExportToXmlBtn.isDisplayed();
			boolean actBuyerPriceBookImportFromXML            = buyerPriceBook_ImportFromXmlBtn.isDisplayed();
			boolean actBuyerPriceBookExportExcel              = buyerPriceBook_ExportToExcel.isDisplayed();
			boolean actBuyerPriceBookImportFromExcel          = buyerPriceBook_ImportFromExcel.isDisplayed();
			boolean actBuyerPriceBookViewPrice                = buyerPriceBook_ViewPrice.isDisplayed();
			boolean actBuyerPriceBookUpdatePriceList          = buyerPriceBook_UpdatePriceList.isDisplayed();
			boolean actBuyerPriceBookGridItem                 = gridItemColoumn.isDisplayed();
			boolean actBuyerPriceBookRateColumn               = gridRateColoumn.isDisplayed();
		/*	boolean actBuyerPriceBookGridSOColoumn            = gridSoColumn.isDisplayed();
			boolean actBuyerPriceBookSTColumn                 = gridStColumn.isDisplayed();
		*/
			boolean expBuyerPriceBook                         = true;
			boolean expBuyerPriceBookAbbreviation             = true;
			boolean expBuyerPriceBookLabel                    = true;
			boolean expBuyerPriceBookClearBtn                 = true;
			boolean expBuyerPriceBookPasteBtn                 = true;
			boolean expBuyerPriceBookCopyBtn                  = true;
			boolean expBuyerPriceBookSelectAllBtn             = true;
			boolean expBuyerPriceBookCloseBtn                 = true;
			boolean expBuyerPriceBookSaveBtn                  = true;
			boolean expBuyerPriceBookDeleteBtn                = true;
			boolean expBuyerPriceBookStartingDate 			  = true;
			boolean expBuyerPriceBookEndingDate 			  = true;
			boolean expBuyerPriceBookInActiveCheckbox 		  = true;
			boolean expBuyerPriceBookFilterItem               = true;
			boolean expBuyerPriceBookFilterCurrency 		  = true;
			boolean expBuyerPriceBookFilterCustomer 		  = true;
			boolean expBuyerPriceBookFilterDepartment 		  = true;
			boolean expBuyerPriceBookFilterClearBtn 		  = true;
			boolean expBuyerPriceBookFilterBtn 			      = true;
			boolean expBuyerPriceBookLoadBtn 				  = true;
			boolean expBuyerPriceBookAdvanceExportImportExcel = true;
			boolean expBuyerPriceBookHistory                  = true;
			boolean expBuyerPriceBookExportXML                = true;
			boolean expBuyerPriceBookImportFromXML            = true;
			boolean expBuyerPriceBookExportExcel              = true;
			boolean expBuyerPriceBookImportFromExcel          = true;
			boolean expBuyerPriceBookViewPrice                = true;
			boolean expBuyerPriceBookUpdatePriceList          = true;
			boolean expBuyerPriceBookGridItem                 = true;
			boolean expBuyerPriceBookRateColumn               = true;
			/*boolean expBuyerPriceBookGridPOColoumn            = true;
			boolean expBuyerPriceBookPTColumn                 = true;
		*/
			System.out.println("Buyer Price Book Value Actual              : " + actBuyerPriceBook +                        " Value Expected : "+ expBuyerPriceBook);
			System.out.println("Buyer Price Book Abbreviation Value Actual : " + actBuyerPriceBookAbbreviation+             " Value Expected : " + expBuyerPriceBookAbbreviation);
			System.out.println("Buyer Price Book Label Value Actual        : " + actBuyerPriceBookLabel+                    " Value Expected : " + expBuyerPriceBookLabel);
			System.out.println("Clear Button Value Actual                  : " + actBuyerPriceBookClearBtn+                 " Value Expected : " + expBuyerPriceBookClearBtn);
			System.out.println("Paste Button Value Actual                  : " + actBuyerPriceBookPasteBtn+                 " Value Expected : " + expBuyerPriceBookPasteBtn);
			System.out.println("Copy Button Value Actual                   : " + actBuyerPriceBookCopyBtn+                  " Value Expected : " + expBuyerPriceBookCopyBtn);
			System.out.println("Select All Button Value Actual             : " + actBuyerPriceBookSelectAllBtn+             " Value Expected : " + expBuyerPriceBookSelectAllBtn);
			System.out.println("Close Button Value Actual                  : " + actBuyerPriceBookCloseBtn+                 " Value Expected : " + expBuyerPriceBookCloseBtn);
			System.out.println("Save Button Value Actual                   : " + actBuyerPriceBookSaveBtn+                  " Value Expected : " + expBuyerPriceBookSaveBtn);
			System.out.println("Delete Button Value Actual                 : " + actBuyerPriceBookDeleteBtn+                " Value Expected : " + expBuyerPriceBookDeleteBtn);
			System.out.println("Starting Date Value Actual                 : " + actBuyerPriceBookStartingDate+             " Value Expected : " + expBuyerPriceBookStartingDate);
			System.out.println("Ending Date Value Actual                   : " + actBuyerPriceBookEndingDate+               " Value Expected : " + expBuyerPriceBookEndingDate);
			System.out.println("In Active Value Actual                     : " + actBuyerPriceBookInActiveCheckbox+         " Value Expected : " + expBuyerPriceBookInActiveCheckbox);
		    System.out.println("Filter Item Value Actual                   : " + actBuyerPriceBookFilterItem+               " Value Expected : " + expBuyerPriceBookFilterItem);
			System.out.println("Filter Currency Value Actual               : " + actBuyerPriceBookFilterCurrency+           " Value Expected : " + expBuyerPriceBookFilterCurrency);
			System.out.println("Filter Customer Value Actual               : " + actBuyerPriceBookFilterCustomer+           " Value Expected : " + expBuyerPriceBookFilterCustomer);
			System.out.println("Filter Department Value Actual             : " + actBuyerPriceBookFilterDepartment+         " Value Expected : " + expBuyerPriceBookFilterDepartment);
			System.out.println("Filter Clear Button Value Actual           : " + actBuyerPriceBookFilterClearBtn+           " Value Expected : " + expBuyerPriceBookFilterClearBtn);
			System.out.println("Filter Button Value Actual                 : " + actBuyerPriceBookFilterBtn+                " Value Expected : " + expBuyerPriceBookFilterBtn);
			System.out.println("Load Button Value Actual                   : " + actBuyerPriceBookLoadBtn+                  " Value Expected : " + expBuyerPriceBookLoadBtn);
			System.out.println("Advance Import and Export Value Actual     : " + actBuyerPriceBookAdvanceExportImportExcel+ " Value Expected : " + expBuyerPriceBookAdvanceExportImportExcel);
			System.out.println("History Value Actual                       : " + actBuyerPriceBookHistory+                  " Value Expected : " + expBuyerPriceBookHistory);
			System.out.println("Export XML Value Actual                    : " + actBuyerPriceBookExportXML+                " Value Expected : " + expBuyerPriceBookExportXML);
			System.out.println("Import XML Value Actual                    : " + actBuyerPriceBookImportFromXML+            " Value Expected : " + expBuyerPriceBookImportFromXML);
			System.out.println("Export Excel Value Actual                  : " + actBuyerPriceBookExportExcel+              " Value Expected : " + expBuyerPriceBookExportExcel);
			System.out.println("Import from Excel Value Actual             : " + actBuyerPriceBookImportFromExcel+          " Value Expected : " + expBuyerPriceBookImportFromExcel);
			System.out.println("View Price Button Value Actual             : " + actBuyerPriceBookViewPrice+                " Value Expected : " + expBuyerPriceBookViewPrice);
			System.out.println("Buyer Price Book Value Actual              : " + actBuyerPriceBookUpdatePriceList+          " Value Expected : " + expBuyerPriceBookUpdatePriceList);
			System.out.println("Buyer Price Book Abbreviation Value Actual : " + actBuyerPriceBookGridItem+                 " Value Expected : " + expBuyerPriceBookGridItem);
			System.out.println("Buyer Price Book Label Value Actual        : " + actBuyerPriceBookRateColumn+               " Value Expected : " + expBuyerPriceBookRateColumn);
			/*System.out.println("Clear Button Value Actual                  : " + actBuyerPriceBookGridSOColoumn+            " Value Expected : " + expBuyerPriceBookGridPOColoumn);
			System.out.println("Buyer Price Book Value Actual              : " + actBuyerPriceBookSTColumn+                 " Value Expected : " + expBuyerPriceBookPTColumn);
		*/
			boolean SellerHomeDisplayFileds=actBuyerPriceBook == expBuyerPriceBook && actBuyerPriceBookAbbreviation == expBuyerPriceBookAbbreviation
								&& actBuyerPriceBookLabel == expBuyerPriceBookLabel
								&& actBuyerPriceBookClearBtn == expBuyerPriceBookClearBtn
								&& actBuyerPriceBookPasteBtn == expBuyerPriceBookPasteBtn
								&& actBuyerPriceBookCopyBtn == expBuyerPriceBookCopyBtn
								&& actBuyerPriceBookSelectAllBtn == expBuyerPriceBookSelectAllBtn
								&& actBuyerPriceBookCloseBtn == expBuyerPriceBookCloseBtn
								&& actBuyerPriceBookSaveBtn == expBuyerPriceBookSaveBtn
								&& actBuyerPriceBookDeleteBtn == expBuyerPriceBookDeleteBtn
								&& actBuyerPriceBookStartingDate == expBuyerPriceBookStartingDate
								&& actBuyerPriceBookEndingDate == expBuyerPriceBookEndingDate
								&& actBuyerPriceBookInActiveCheckbox == expBuyerPriceBookInActiveCheckbox
								&& actBuyerPriceBookFilterItem == expBuyerPriceBookFilterItem
								&& actBuyerPriceBookFilterCurrency == expBuyerPriceBookFilterCurrency
								&& actBuyerPriceBookFilterCustomer == expBuyerPriceBookFilterCustomer
								&& actBuyerPriceBookFilterDepartment == expBuyerPriceBookFilterDepartment
								&& actBuyerPriceBookFilterClearBtn == expBuyerPriceBookFilterClearBtn
								&& actBuyerPriceBookFilterBtn == expBuyerPriceBookFilterBtn
								&& actBuyerPriceBookLoadBtn == expBuyerPriceBookLoadBtn
								&& actBuyerPriceBookAdvanceExportImportExcel == expBuyerPriceBookAdvanceExportImportExcel
								&& actBuyerPriceBookHistory == expBuyerPriceBookHistory
								&& actBuyerPriceBookExportXML == expBuyerPriceBookExportXML
								&& actBuyerPriceBookImportFromXML == expBuyerPriceBookImportFromXML
								&& actBuyerPriceBookExportExcel == expBuyerPriceBookExportExcel
								&& actBuyerPriceBookImportFromExcel == expBuyerPriceBookImportFromExcel
								&& actBuyerPriceBookViewPrice == expBuyerPriceBookViewPrice
								&& actBuyerPriceBookUpdatePriceList == expBuyerPriceBookUpdatePriceList
								&& actBuyerPriceBookGridItem == expBuyerPriceBookGridItem
								&& actBuyerPriceBookRateColumn == expBuyerPriceBookRateColumn;
								/*&& actBuyerPriceBookGridSOColoumn == expBuyerPriceBookGridPOColoumn
								&& actBuyerPriceBookSTColumn == expBuyerPriceBookPTColumn;*/
			
			
			String actSellerHomePage=Boolean.toString(SellerHomeDisplayFileds);
			String expSellerHomePage=excelReader.getCellData(xlSheetName, 640, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 640, 8, actSellerHomePage);
			
			if (actSellerHomePage.equalsIgnoreCase(expSellerHomePage) && 
					actsellerHomePageFooter.equalsIgnoreCase(expsellerHomePageFooter) && 
					actsellerHomePageHeader.equalsIgnoreCase(expsellerHomePageHeader)) 
			{
				System.out.println("Pass: Dispalyed Buyer Price Book Screen");
				excelReader.setCellData(xlfile, xlSheetName, 637, 9, resPass);
				return true;
			}
			else 
			{
				System.out.println("Fail: Dispalyed Buyer Price Book Screen");
				excelReader.setCellData(xlfile, xlSheetName, 637, 9, resFail);
				return false;
			}
	   }
	   catch (Exception e) 
	   {
		   String exception =e.getMessage();
		   excelReader.setExceptionInExcel(xlfile, xlSheetName, 637, 10, exception);
		   System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		   return false;
	   }	
	}

	 
	 
	 public boolean checkClickOnCustomizationSettingsOptionInSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	 {

	  excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  System.out.println("************************************* checkClickOnCustomizationSettingsOptionInSellerPriceBook ***************************************");
	  
	  try
	  {
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_PriceBook));
		    buyerPriceBook_PriceBook.click();
		    buyerPriceBook_PriceBook.sendKeys(excelReader.getCellData(xlSheetName, 642, 6));
		    Thread.sleep(2000);
		    buyerPriceBook_PriceBook.sendKeys(Keys.TAB);
		
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeSettingBtn));
		    buyerPriceBook_CustamizeSettingBtn.click();
		
		    
		     ArrayList<String> actitemBuyerPriceBookCustomizationList=new ArrayList<String>();
			
			int itemBuyerPriceBookCustomizationCount =itemBuyerPriceBookCustomizationList.size();
			 		
			System.err.println("itemBuyerPriceBookCustomizationCount   :  "+itemBuyerPriceBookCustomizationCount);
			 		
		     for (int i = 0; i < itemBuyerPriceBookCustomizationCount; i++) 
			 {
				String data=itemBuyerPriceBookCustomizationList.get(i).getText();
				actitemBuyerPriceBookCustomizationList.add(data);
			 }
			 		
			String actitemSellerPriceBookCustomization=actitemBuyerPriceBookCustomizationList.toString();
			String expitemSellerPriceBookCustomization=excelReader.getCellData(xlSheetName, 643, 7);
				 		
			excelReader.setCellData(xlfile, xlSheetName, 643, 8, actitemSellerPriceBookCustomization);
				    	
		    System.err.println("  Actual  itemSellerPriceBookCustomization : "+actitemSellerPriceBookCustomization);
		    System.err.println("  Expected itemSellerPriceBookCustomization : "+expitemSellerPriceBookCustomization);
		    
		    
			boolean actDateRangeCheckBox = buyerPriceBook_CustamizeDateRangeCheckBox.isDisplayed();
			boolean actVendorCheckBox    = buyerPriceBook_CustomizeVendorCheckBox.isDisplayed();
			boolean actWarehouseCheckBox = buyerPriceBook_WarehouseCheckBox.isDisplayed();
			boolean actQtyRangeCheckbox  = buyerPriceBook_QualityRangeCheckBox.isDisplayed();
			boolean actCurrencyCheckBox  = buyerPriceBook_CurrencyCheckBox.isDisplayed();
			boolean actUnitCheckBox      = buyerPriceBook_UnitCheckBox.isDisplayed();
		
			boolean expDateRangeCheckBox = true;
			boolean expVendorCheckBox    = true;
			boolean expWarehouseCheckBox = true;
			boolean expQtyRangeCheckbox  = true;
			boolean expCurrencyCheckBox  = true;
			boolean expUnitCheckBox      = true;
		
			System.out.println("Buyer Price Book Value Actual              : " + actDateRangeCheckBox+  " Value Expected : " + expDateRangeCheckBox);
			System.out.println("Buyer Price Book Abbreviation Value Actual : " + actVendorCheckBox +    " Value Expected : " + expVendorCheckBox);
			System.out.println("Buyer Price Book Label Value Actual        : " + actWarehouseCheckBox+  " Value Expected : " + expWarehouseCheckBox);
			System.out.println("Clear Button Value Actual                  : " + actQtyRangeCheckbox +  " Value Expected : " + expQtyRangeCheckbox);
			System.out.println("Paste Button Value Actual                  : " + actCurrencyCheckBox +  " Value Expected : " + expCurrencyCheckBox);
			System.out.println("Copy Button Value Actual                   : " + actUnitCheckBox +      " Value Expected : " + expUnitCheckBox);
		
			if (actDateRangeCheckBox == expDateRangeCheckBox && actVendorCheckBox == expVendorCheckBox
					&& actWarehouseCheckBox == expWarehouseCheckBox && actQtyRangeCheckbox == expQtyRangeCheckbox
					&& actCurrencyCheckBox == expCurrencyCheckBox && actUnitCheckBox == expUnitCheckBox && 
					actitemSellerPriceBookCustomization.equalsIgnoreCase(expitemSellerPriceBookCustomization)) 
			{
				System.out.println("Pass: Customize Screen Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 641, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Fail: Customize Screen Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 641, 9, resFail);
				return false;
			}
	  }
	  catch (Exception e) 
	  {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 641, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	  }
	 }

		@FindBy(xpath = "//th[@id='PriceBookWebGrid_control_heading_6']//div[@class='no-select'][contains(text(),'Customer')]")
		private static WebElement gridCustomizeCustomerCheckbox;

	 public boolean checkSellerPriceBookCustomizeColumnsInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	 {
	   excelReader = new ExcelReader(POJOUtility.getExcelPath());
	   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	   System.out.println("********************************************** checkSellerPriceBookCustomizeColumnsInGrid  ******************************************************");

	   try
	   {
		   Thread.sleep(1000);
		   
		    
	        if(buyerPriceBook_CustamizeDateRangeCheckBox.isSelected())
	        {
	        	System.out.println("The Elements are checked");
	        }
	        else
	        {
	        	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeDateRangeCheckBox));
	    		buyerPriceBook_CustamizeDateRangeCheckBox.click();

	    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustomizeVendorCheckBox));
	    		buyerPriceBook_CustomizeVendorCheckBox.click();

	    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_WarehouseCheckBox));
	    		buyerPriceBook_WarehouseCheckBox.click();

	    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_QualityRangeCheckBox));
	    		buyerPriceBook_QualityRangeCheckBox.click();

	    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CurrencyCheckBox));
	    		buyerPriceBook_CurrencyCheckBox.click();

	    		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_UnitCheckBox));
	    		buyerPriceBook_UnitCheckBox.click();

	        }
	        	
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeSettingBtn));
			buyerPriceBook_CustamizeSettingBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(beforeClickOnToggle));
			beforeClickOnToggle.click();
		    Thread.sleep(3000);
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridWareHouseColoumn));
			boolean actGridItemColumn         = gridItemColoumn.isDisplayed();
			boolean actGridWarehouseColumn    = gridWareHouseColoumn.isDisplayed();
			boolean actGridStartingDateColumn = startingdate.isDisplayed();
			boolean actGridEndingDateColumn   = endingdate.isDisplayed();
			boolean actGridVendorColumn       = customer.isDisplayed();
			boolean actGridCurrencyColumn     = currencyPriceBook.isDisplayed();

			boolean expGridItemColumn         = true;
			boolean expGridWarehouseColumn    = true;
			boolean expGridStartingDateColumn = true;
			boolean expGridEndingDateColumn   = true;
			boolean expGridVendorColumn       = true;
			boolean expGridCurrencyColumn     = true;

			System.out.println("Grid Item Column Value Actual               : " + actGridItemColumn +        " Value Expected : " + expGridItemColumn);
			System.out.println("Grid Warehouse Column Value Actual          : " + actGridWarehouseColumn+    " Value Expected : " + expGridWarehouseColumn);
			System.out.println("Grid Starting Date Column Value Actual      : " + actGridStartingDateColumn+ " Value Expected : " + expGridStartingDateColumn);
			System.out.println("Grid Ending Date Column Value Actual        : " + actGridEndingDateColumn+   " Value Expected : " + expGridEndingDateColumn);
			System.out.println("Grid Vendor Column Value Actual             : " + actGridVendorColumn+       " Value Expected : " + expGridVendorColumn);
			System.out.println("Grid Currency Columnn Value Actual          : " + actGridCurrencyColumn+     " Value Expected : " + expGridCurrencyColumn);

			
			
	       ArrayList<String> actbodyGridHeaderList=new ArrayList<String>();
			
			int bodyGridHeaderCount=bodyGridHeaderList.size();
			
			System.err.println(" Body Grid Header Count : "+bodyGridHeaderCount);
			
			
			for (int i = 1; i < bodyGridHeaderCount; i++) 
			{
				
				String data=bodyGridHeaderList.get(i).getText();
				
				actbodyGridHeaderList.add(data);
			
			}
			
			String actbodyGridHeader=actbodyGridHeaderList.toString();
			String expbodyGridHeader=excelReader.getCellData(xlSheetName, 645, 7);
				 		
			excelReader.setCellData(xlfile, xlSheetName, 645, 8, actbodyGridHeader);
				    	
		    System.err.println("  Actual  bodyGridHeader : "+actbodyGridHeader);
		    System.err.println("  Expected bodyGridHeader : "+expbodyGridHeader);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCellSelect));
			itemFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemValuePriceBook));
			itemValuePriceBook.click();
			itemValuePriceBook.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseValue));
			wareHouseValue.click();
			wareHouseValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(satrtingDateFirstCellSelect));
			satrtingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startingDateValue));
			startingDateValue.click();
			startingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateFirstCellSelect));
			endingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateValue));
			endingDateValue.click();
			endingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorFirstCellSelect));
			vendorFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
			vendorValue.click();
			vendorValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorFirstCellSelect));
			vendorFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
			vendorValue.click();
			vendorValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyFirstCellSelect));
			currencyFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyOptionValue));
			currencyOptionValue.click();
			currencyOptionValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyFirstCellSelect));
			minQtyFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyValue));
			minQtyValue.click();
			minQtyValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyFirstCellSelect));
			maxQtyFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyValue));
			maxQtyValue.click();
			maxQtyValue.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rate));
			boolean actGridMinQtyColumn = minQty.isDisplayed();
			boolean actGridMaxQtyColumn = maxQty.isDisplayed();
			boolean actGridUnitColumn   = unit.isDisplayed();
			boolean actGridRateColumn   = rate.isDisplayed();
			/*boolean actGridPOColumn     = gridSoColumn.isDisplayed();
			boolean actGridPTColumn     = gridStColumn.isDisplayed();*/

			boolean expGridMinQtyColumn = true;
			boolean expGridMaxQtyColumn = true;
			boolean expGridUnitColumn   = true;
			boolean expGridRateColumn   = true;
			/*boolean expGridPOColumn     = true;
			boolean expGridPTColumn     = true;*/

			System.out.println("Grid Min Qty Column Value Actual              : " + actGridMinQtyColumn+ " Value Expected : " + expGridMinQtyColumn);
			System.out.println("Grid Max Qty Column Value Actual              : " + actGridMaxQtyColumn+ " Value Expected : " + expGridMaxQtyColumn);
			System.out.println("Grid Unit Column Value Actual                 : " + actGridUnitColumn+   " Value Expected : " + expGridUnitColumn);
			System.out.println("Grid Rate Column Value Actual                 : " + actGridRateColumn+   " Value Expected : " + expGridRateColumn);
			/*System.out.println("Grid PO Column Value Actual                   : " + actGridPOColumn +    " Value Expected : "+ expGridPOColumn);
			System.out.println("Grid PT Column Value Actual                   : " + actGridPTColumn +    " Value Expected : "+ expGridPTColumn);
	*/
			
			boolean sellerHomePageBodyFiledsDisplay=actGridItemColumn == expGridItemColumn && actGridWarehouseColumn == actGridWarehouseColumn
														&& actGridStartingDateColumn == actGridStartingDateColumn
														&& actGridEndingDateColumn == actGridEndingDateColumn && actGridVendorColumn == actGridVendorColumn
														&& actGridCurrencyColumn == actGridCurrencyColumn
										
														&& actGridMinQtyColumn == expGridMinQtyColumn && actGridMaxQtyColumn == expGridMaxQtyColumn
														&& actGridUnitColumn == expGridUnitColumn && actGridRateColumn == expGridRateColumn
														/*&& actGridPOColumn == expGridPOColumn && actGridPTColumn == expGridPTColumn*/;
			
			
			String actSellerHomeBodyGrid=Boolean.toString(sellerHomePageBodyFiledsDisplay);
			String expSellerHomeBodyGrid=excelReader.getCellData(xlSheetName, 646, 7);
	 		
			excelReader.setCellData(xlfile, xlSheetName, 646, 8, actSellerHomeBodyGrid);
			    	
			System.err.println("  Actual  SellerHomeBodyGrid : "+actSellerHomeBodyGrid);
			System.err.println("  Expected SellerHomeBodyGrid : "+expSellerHomeBodyGrid);
					
			
			if (actSellerHomeBodyGrid.equalsIgnoreCase(expSellerHomeBodyGrid) && actbodyGridHeader.equalsIgnoreCase(expbodyGridHeader))
			{
				System.out.println("Pass: Customize Screen Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 644, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Fail: Customize Screen Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 644, 9, resFail);
				return false;
			}
	   }
	   catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 644, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }

	  public boolean checkSaveSellerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************************** checkSaveSellerPriceBook  ******************************************************");
			
	    try
	    {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCellSelect));
			itemFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemValuePriceBook));
			itemValuePriceBook.click();
			itemValuePriceBook.sendKeys(excelReader.getCellData(xlSheetName, 648, 6));
	        Thread.sleep(2000);

	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseFirstCellSelect));
			wareHouseFirstCellSelect.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseValue));
			wareHouseValue.click();
			wareHouseValue.sendKeys(excelReader.getCellData(xlSheetName, 649, 6));
			Thread.sleep(2000);
			wareHouseValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(satrtingDateFirstCellSelect));
			satrtingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startingDateValue));
			startingDateValue.click();
			startingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateFirstCellSelect));
			endingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateValue));
			endingDateValue.click();
			endingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorFirstCellSelect));
			vendorFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
			vendorValue.click();
			vendorValue.sendKeys(excelReader.getCellData(xlSheetName, 650, 6));
			Thread.sleep(2000);
			vendorValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyFirstCellSelect));
			currencyFirstCellSelect.click();

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyOptionValue));
			currencyOptionValue.click();
			currencyOptionValue.sendKeys(excelReader.getCellData(xlSheetName, 651, 6));
			Thread.sleep(2000);
			currencyOptionValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyFirstCellSelect));
			minQtyFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyValue));
			minQtyValue.click();
			minQtyValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyFirstCellSelect));
			maxQtyFirstCellSelect.click();

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyValue));
			maxQtyValue.click();
			maxQtyValue.sendKeys(Keys.TAB);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateFirstCellSelect));
			rateFirstCellSelect.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateValue));
			rateValue.sendKeys(excelReader.getCellData(xlSheetName, 652, 6));
			Thread.sleep(2000);
			rateValue.sendKeys(Keys.TAB);

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PoValue));
			PoValue.sendKeys(excelReader.getCellData(xlSheetName, 653, 6));
			PoValue.sendKeys(Keys.TAB);*/

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookSaveBtn));
			buyerPriceBookSaveBtn.click();

			
	        String expSaveMessage = excelReader.getCellData(xlSheetName, 654, 7);
			
	        //excelReader.setCellData(xlfile, xlSheetName, 1430, 8, expSaveMessage);
	        
			boolean actSaveAccountMessage = checkValidationMessageboolean(expSaveMessage);
			boolean expSaveAccountMessage = true;

			String actSavingStatus= Boolean.toString(actSaveAccountMessage);
			String expSavingStatus=excelReader.getCellData(xlSheetName, 655, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 655, 8, actSavingStatus);
			
			System.out.println("Actual Saving Status  : "+actSavingStatus);
			System.out.println(" Expected Saving Status  : "+expSavingStatus);
			
			if (actSavingStatus.equalsIgnoreCase(expSavingStatus)) 
			{
				System.out.println("Pass: Input data in to warehouse And Selecting Products in Cumbobox and Saved Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 647, 9, resPass);
				return true;
			} 
			else
			{
				System.out.println("Fail:  Input data in to warehouse And Selecting Products in Cumbobox and Saved Successfully");
				excelReader.setCellData(xlfile, xlSheetName, 647, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 647, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }
	  

	 public boolean checkEditSellerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {

		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************************** checkEditSellerPriceBook  ******************************************************");
			
	    try
	    {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(afterClickOnToggle));
			afterClickOnToggle.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_PriceBook));
			buyerPriceBook_PriceBook.click();
			buyerPriceBook_PriceBook.sendKeys(excelReader.getCellData(xlSheetName, 657, 6));
			Thread.sleep(2000);
			buyerPriceBook_PriceBook.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_AbbreviationBtn));
			buyerPriceBook_AbbreviationBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_PriceBook));
			String actPriceBookName = buyerPriceBook_PriceBook.getAttribute("value");
			String expPriceBookName = excelReader.getCellData(xlSheetName, 658, 7);

			excelReader.setCellData(xlfile, xlSheetName, 658, 8, actPriceBookName);
			
			System.out.println("Edit Buyer Price Book Check Price Book Name  : " + actPriceBookName + "  Value Expected : "+ expPriceBookName);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookFilter_FilterAndLoadBtn));
			buyerPriceBookFilter_FilterAndLoadBtn.click();
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorFirstCellSelect));
			String actItemFirstCell      = itemFirstCellSelect.getText();
			String actWarehouseFirstCell = wareHouseFirstCellSelect.getText();
			String actVendorFirstCell    = vendorFirstCellSelect.getText();
			String actCurrencyFirstCell  = currencyFirstCellSelect.getText();
			String actRateFirstCell      = rateFirstCellSelect.getText();
			//String actPOFirstCell        = PoFirstCellSelect.getText();
			
			String expItemFirstCell      = excelReader.getCellData(xlSheetName, 659, 7);
			String expWarehouseFirstCell = excelReader.getCellData(xlSheetName, 660, 7);
			String expVendorFirstCell    = excelReader.getCellData(xlSheetName, 661, 7);
			String expCurrencyFirstCell  = excelReader.getCellData(xlSheetName, 662, 7);
			String expRateFirstCell      = excelReader.getCellData(xlSheetName, 663, 7);
			String expPOFirstCell        = excelReader.getCellData(xlSheetName, 664, 7);

			excelReader.setCellData(xlfile, xlSheetName, 659, 8, actItemFirstCell);
			excelReader.setCellData(xlfile, xlSheetName, 660, 8, actWarehouseFirstCell);
			excelReader.setCellData(xlfile, xlSheetName, 661, 8, actVendorFirstCell);
			excelReader.setCellData(xlfile, xlSheetName, 662, 8, actCurrencyFirstCell);
			excelReader.setCellData(xlfile, xlSheetName, 663, 8, actRateFirstCell);
			//excelReader.setCellData(xlfile, xlSheetName, 664, 8, actPOFirstCell);
			
			System.out.println("Edit Buyer Price Book check Item            : " + actItemFirstCell +     " Value Expected : "+ expItemFirstCell);
			System.out.println("Edit Buyer Price Book check Warehouse       : " + actWarehouseFirstCell+ " Value Expected : " + expWarehouseFirstCell);
			System.out.println("Edit Buyer Price Book check Vendor          : " + actVendorFirstCell +   " Value Expected : "+ expVendorFirstCell);
			System.out.println("Edit Buyer Price Book check Currency        : " + actCurrencyFirstCell + " Value Expected : " + expCurrencyFirstCell);
			System.out.println("Edit Buyer Price Book check Rate            : " + actRateFirstCell +     " Value Expected : "+ expRateFirstCell);
			//System.out.println("Edit Buyer Price Book check PO              : " + actPOFirstCell +       " Value Expected : "+ expPOFirstCell);

			if (actPriceBookName.equalsIgnoreCase(expPriceBookName)
					&& actItemFirstCell.equalsIgnoreCase(expItemFirstCell)
					&& actWarehouseFirstCell.equalsIgnoreCase(expWarehouseFirstCell)
					&& actVendorFirstCell.equalsIgnoreCase(expVendorFirstCell)
					&& actCurrencyFirstCell.equalsIgnoreCase(expCurrencyFirstCell)
					&& actRateFirstCell.equalsIgnoreCase(expRateFirstCell)
					//&& actPOFirstCell.equalsIgnoreCase(expPOFirstCell)
					) 
			{
				System.out.println("Pass: Edit Buyer PriceBook");
				excelReader.setCellData(xlfile, xlSheetName, 656, 9, resPass);
				return true;
			}
			else 
			{
				System.out.println("Fail: Edit Buyer PriceBook");
				excelReader.setCellData(xlfile, xlSheetName, 656, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 656, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }



	  public boolean checkUpdateSellerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {

	   excelReader = new ExcelReader(POJOUtility.getExcelPath());
	   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	   System.out.println("********************************************** checkUpdateSellerPriceBook  ******************************************************");
			
	   try
	   {
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSecondCellSelect));
		itemSecondCellSelect.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemValuePriceBook));
		itemValuePriceBook.click();
		Thread.sleep(3000);
		itemValuePriceBook.sendKeys(excelReader.getCellData(xlSheetName, 666, 6));
		Thread.sleep(2000);
		itemValuePriceBook.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseSecondCellSelect));
		wareHouseSecondCellSelect.click();
		wareHouseValue.sendKeys(excelReader.getCellData(xlSheetName, 667, 6));
		Thread.sleep(2000);
		wareHouseValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(satrtingDateSecondCellSelect));
		satrtingDateSecondCellSelect.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startingDateValue));
		startingDateValue.click();
		startingDateValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateSecondCellSelect));
		endingDateSecondCellSelect.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateValue));
		endingDateValue.click();
		endingDateValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSecondCellSelect));
		vendorSecondCellSelect.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
		vendorValue.click();
		Thread.sleep(3000);
		vendorValue.sendKeys(excelReader.getCellData(xlSheetName, 668, 6));
		Thread.sleep(2000);
		vendorValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyOptionValue));
		currencyOptionValue.click();
		currencyOptionValue.sendKeys(excelReader.getCellData(xlSheetName, 669, 6));
		Thread.sleep(2000);
		currencyOptionValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyValue));
		minQtyValue.click();
		minQtyValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyValue));
		maxQtyValue.click();
		maxQtyValue.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookUnit));
		buyerPriceBookUnit.click();
		buyerPriceBookUnit.sendKeys(Keys.END);
		buyerPriceBookUnit.sendKeys(Keys.SHIFT,Keys.HOME);
		buyerPriceBookUnit.sendKeys(excelReader.getCellData(xlSheetName, 670, 6));
		Thread.sleep(2000);
		buyerPriceBookUnit.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateValue));
		rateValue.sendKeys(excelReader.getCellData(xlSheetName, 671, 6));
		Thread.sleep(2000);
		rateValue.sendKeys(Keys.TAB);

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PoValue));
		PoValue.sendKeys(excelReader.getCellData(xlSheetName, 672, 6));
		Thread.sleep(2000);
		PoValue.sendKeys(Keys.TAB);*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookSaveBtn));
		buyerPriceBookSaveBtn.click();
		
		String expSaveMessage = excelReader.getCellData(xlSheetName, 673, 7);
			
	    // excelReader.setCellData(xlfile, xlSheetName, 1449, 8, expSaveMessage);
	     
		boolean actSaveAccountMessage = checkValidationMessageboolean(expSaveMessage);
		boolean expSaveAccountMessage = true;

		String actSavingStatusUpdating= Boolean.toString(actSaveAccountMessage);
		String expSavingStatusUpdating=excelReader.getCellData(xlSheetName, 674, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 674, 8, actSavingStatusUpdating.toUpperCase());
		
		System.out.println("Actual Saving Status Updating  : "+actSavingStatusUpdating);
		System.out.println(" Expected Saving Status Updating : "+expSavingStatusUpdating);
		
		if (actSavingStatusUpdating.equalsIgnoreCase(expSavingStatusUpdating)) 
		{
			System.out.println("Pass: Update Buyer PriceBook and Saved Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 665, 9, resPass);
			return true;
		} 
		else
		{
			System.out.println("Fail:   Update Buyer PriceBook and Saved Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 665, 9, resFail);
			return false;
		}
	   }
	   catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 665, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }

	 public boolean checkUpdateSellerPricebookInEditPricebook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {

	  excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  System.out.println("********************************************** checkUpdatePricebookInEditPricebook  ******************************************************");
			
	  try
	  {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_PriceBook));
		buyerPriceBook_PriceBook.click();
		buyerPriceBook_PriceBook.sendKeys(excelReader.getCellData(xlSheetName, 676, 6));
		Thread.sleep(2000);
		buyerPriceBook_PriceBook.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_AbbreviationBtn));
		buyerPriceBook_AbbreviationBtn.click();
		Thread.sleep(2000);

		String actPriceBookName       = buyerPriceBook_PriceBook.getAttribute("value");
		String expPriceBookName       = excelReader.getCellData(xlSheetName, 677, 7);

		excelReader.setCellData(xlfile, xlSheetName, 677, 8, actPriceBookName);
		
		System.out.println("Edit Buyer Price Book Check Price Book Name  : " + actPriceBookName + "  Value Expected : " + expPriceBookName);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookFilter_FilterAndLoadBtn));
		buyerPriceBookFilter_FilterAndLoadBtn.click();
		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PoFirstCellSelect));
		String actItemFirstCell       = itemFirstCellSelect.getText();
		String actWarehouseFirstCell  = wareHouseFirstCellSelect.getText();
		String actVendorFirstCell     = vendorFirstCellSelect.getText();
		String actCurrencyFirstCell   = currencyFirstCellSelect.getText();
		String actRateFirstCell       = rateFirstCellSelect.getText();
		//tring actPOFirstCell         = PoFirstCellSelect.getText();

		excelReader.setCellData(xlfile, xlSheetName, 679, 8, actItemFirstCell);
		excelReader.setCellData(xlfile, xlSheetName, 680, 8, actWarehouseFirstCell);
		excelReader.setCellData(xlfile, xlSheetName, 681, 8, actVendorFirstCell);
		excelReader.setCellData(xlfile, xlSheetName, 682, 8, actCurrencyFirstCell);
		excelReader.setCellData(xlfile, xlSheetName, 683, 8, actRateFirstCell);
		//excelReader.setCellData(xlfile, xlSheetName, 684, 8, actPOFirstCell);
		
		
		String actItemSecondCell      = itemSecondCellSelect.getText();
		String actWarehouseSecondCell = wareHouseSecondCellSelect.getText();
		String actVendorSecondCell    = vendorSecondCellSelect.getText();
		String actx                   = unitSecondCellSelect.getText();
		String actCurrencySecondCell  = currencySecondCellSelect.getText();
		String actRateSecondCell      = rateSecondCellSelect.getText();
		//String actPOSecondCell        = PoSecondCellSelect.getText();
		
		excelReader.setCellData(xlfile, xlSheetName, 686, 8, actItemSecondCell);
		excelReader.setCellData(xlfile, xlSheetName, 687, 8, actWarehouseSecondCell);
		excelReader.setCellData(xlfile, xlSheetName, 688, 8, actVendorSecondCell);
		excelReader.setCellData(xlfile, xlSheetName, 689, 8, actx);
		excelReader.setCellData(xlfile, xlSheetName, 690, 8, actCurrencySecondCell);
		excelReader.setCellData(xlfile, xlSheetName, 691, 8, actRateSecondCell);
		//excelReader.setCellData(xlfile, xlSheetName, 692, 8, actPOSecondCell);
		
		
		String expItemFirstCell       = excelReader.getCellData(xlSheetName, 679, 7);
		String expWarehouseFirstCell  = excelReader.getCellData(xlSheetName, 680, 7);
		String expVendorFirstCell     = excelReader.getCellData(xlSheetName, 681, 7);
		String expCurrencyFirstCell   = excelReader.getCellData(xlSheetName, 682, 7);
		String expRateFirstCell       = excelReader.getCellData(xlSheetName, 683, 7);
		//String expPOFirstCell         = excelReader.getCellData(xlSheetName, 684, 7);

		String expItemSecondCell      = excelReader.getCellData(xlSheetName, 686, 7);
		String expWarehouseSecondCell = excelReader.getCellData(xlSheetName, 687, 7);
		String expVendorSecondCell    = excelReader.getCellData(xlSheetName, 688, 7);
		String expx                   = excelReader.getCellData(xlSheetName, 689, 7);
		String expCurrencySecondCell  = excelReader.getCellData(xlSheetName, 690, 7);
		String expRateSecondCell      = excelReader.getCellData(xlSheetName, 691, 7);
		//String expPOSecondCell        = excelReader.getCellData(xlSheetName, 692, 7);
		

		System.out.println("Edit Seller Price Book check Item            : " + actItemFirstCell +      " Value Expected : " + expItemFirstCell);
		System.out.println("Edit Seller Price Book check Warehouse       : " + actWarehouseFirstCell+  " Value Expected : " + expWarehouseFirstCell);
		System.out.println("Edit Seller Price Book check Vendor          : " + actVendorFirstCell +    " Value Expected : "+ expVendorFirstCell); 
		System.out.println("Edit Seller Price Book check Currency        : " + actCurrencyFirstCell+   " Value Expected : " + expCurrencyFirstCell);
		System.out.println("Edit Seller Price Book check Rate            : " + actRateFirstCell +      " Value Expected : "+ expRateFirstCell);
		//System.out.println("Edit Seller Price Book check PO              : " + actPOFirstCell +        " Value Expected : "+ expPOFirstCell);

		System.out.println("Edit Seller Price Book check Item            : " + actItemSecondCell +     " Value Expected : "+ expItemSecondCell);
		System.out.println("Edit Seller Price Book check Warehouse       : " + actWarehouseSecondCell+ " Value Expected : " + expWarehouseSecondCell);
		System.out.println("Edit Seller Price Book check Vendor          : " + actVendorSecondCell+    " Value Expected : " + expVendorSecondCell);
		System.out.println("Edit Seller Price Book check Vendor          : " + actx +                  " Value Expected : " + expx);
		System.out.println("Edit Seller Price Book check Currency        : " + actCurrencySecondCell+  " Value Expected : " + expCurrencySecondCell);
		System.out.println("Edit Seller Price Book check Rate            : " + actRateSecondCell +     " Value Expected : "+ expRateSecondCell);
		//System.out.println("Edit Seller Price Book check PO              : " + actPOSecondCell +       " Value Expected : "+ expPOSecondCell);

		if (actPriceBookName.equalsIgnoreCase(expPriceBookName)

				&& actItemFirstCell.equalsIgnoreCase(expItemFirstCell)
				&& actWarehouseFirstCell.equalsIgnoreCase(expWarehouseFirstCell)
				&& actVendorFirstCell.equalsIgnoreCase(expVendorFirstCell)
				&& actCurrencyFirstCell.equalsIgnoreCase(expCurrencyFirstCell)
				&& actRateFirstCell.equalsIgnoreCase(expRateFirstCell)
				/*&& actPOFirstCell.equalsIgnoreCase(expPOFirstCell)*/

				&& actItemSecondCell.equalsIgnoreCase(expItemSecondCell)
				&& actWarehouseSecondCell.equalsIgnoreCase(expWarehouseSecondCell)
				&& actVendorSecondCell.equalsIgnoreCase(expVendorSecondCell)
				&& actCurrencySecondCell.equalsIgnoreCase(expCurrencySecondCell) && actx.equalsIgnoreCase(expx)
				&& actRateSecondCell.equalsIgnoreCase(expRateSecondCell)
				/*&& actPOSecondCell.equalsIgnoreCase(expPOSecondCell)*/) 
		{
			System.out.println("Pass: Edit Buyer PriceBook");
			excelReader.setCellData(xlfile, xlSheetName, 675, 9, resPass);
			return true;
		}
		else 
		{
			System.out.println("Fail: Edit Buyer PriceBook");
			excelReader.setCellData(xlfile, xlSheetName, 675, 9, resFail);
			return false;
		}
	  }
	  catch (Exception e) 
	  {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 675, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	  }
	 }

		
	 public boolean checkClickOnYesOptionInDeleteSavedCopyAndPasteInSellerPriceBookPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {

	  excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  System.out.println("********************************************** checkClickOnYesOptionInDeleteSavedCopyAndPasteInSellerPriceBookPage  *******************************************");
		
	  try
	  {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookDeleteBtn));
			buyerPriceBookDeleteBtn.click();

			getWaitForAlert();
			
			getDriver().switchTo().alert().accept();

			String expSaveMessage = excelReader.getCellData(xlSheetName, 694, 7);
				
		    //excelReader.setCellData(xlfile, xlSheetName, 694, 8, expSaveMessage);
	       
			boolean actDeleteMessage = checkValidationMessageboolean(expSaveMessage);
			boolean expDeleteAccountMessage = true;

			String actDeleteStatus= Boolean.toString(actDeleteMessage);
			String expDeleteStatus=excelReader.getCellData(xlSheetName, 695, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 695, 8, actDeleteStatus.toUpperCase());
			
			System.out.println("Actual Delete Status  : "+actDeleteStatus);
			System.out.println(" Expected Delete Status  : "+expDeleteStatus);
		
			if (actDeleteStatus.equalsIgnoreCase(expDeleteStatus))
			{
				System.out.println("Pass: Yes Button in Delete option ");
				excelReader.setCellData(xlfile, xlSheetName, 693, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Fail: Yes Button in Delete option ");
				excelReader.setCellData(xlfile, xlSheetName, 693, 9, resFail);
				return false;
			}
	    }
	  catch (Exception e) 
	  {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 693, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	  }
	  }


	 
	 public boolean checkSaveOptionSellerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************************** checkSaveSellerPriceBook  ******************************************************");
			
	   try
	   {
		   
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_PriceBook));
		    buyerPriceBook_PriceBook.click();
		    buyerPriceBook_PriceBook.sendKeys(excelReader.getCellData(xlSheetName, 580, 6));
		    Thread.sleep(2000);
		    buyerPriceBook_PriceBook.sendKeys(Keys.TAB);
		    
		    
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeSettingBtn));
		    buyerPriceBook_CustamizeSettingBtn.click();
		    Thread.sleep(2000);
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeDateRangeCheckBox));
			buyerPriceBook_CustamizeDateRangeCheckBox.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustomizeVendorCheckBox));
			buyerPriceBook_CustomizeVendorCheckBox.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_WarehouseCheckBox));
			buyerPriceBook_WarehouseCheckBox.click();
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_QualityRangeCheckBox));
			buyerPriceBook_QualityRangeCheckBox.click();
			
	        // This is getting checked so thats why commenting 
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CurrencyCheckBox));
			buyerPriceBook_CurrencyCheckBox.click();
			*/

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_UnitCheckBox));
			buyerPriceBook_UnitCheckBox.click();
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBook_CustamizeSettingBtn));
			buyerPriceBook_CustamizeSettingBtn.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(beforeClickOnToggle));
			beforeClickOnToggle.click();
			
			
		
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCellSelect));
			itemFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemValuePriceBook));
			itemValuePriceBook.click();
			itemValuePriceBook.sendKeys(excelReader.getCellData(xlSheetName, 587, 6));
	        Thread.sleep(2000);
	        itemValuePriceBook.sendKeys(Keys.TAB);
	        
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseFirstCellSelect));
			wareHouseFirstCellSelect.click();
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseValue));
			wareHouseValue.click();
			wareHouseValue.sendKeys(excelReader.getCellData(xlSheetName, 588, 6));
			Thread.sleep(2000);*/
			wareHouseValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(satrtingDateFirstCellSelect));
			satrtingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startingDateValue));
			startingDateValue.click();
			startingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateFirstCellSelect));
			endingDateFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateValue));
			endingDateValue.click();
			endingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorFirstCellSelect));
			vendorFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
			vendorValue.click();
			vendorValue.sendKeys("Customer B");
			Thread.sleep(2000);
			vendorValue.sendKeys(Keys.TAB);

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyFirstCellSelect));
			currencyFirstCellSelect.click();
	*/
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyOptionValue));
			currencyOptionValue.click();
			currencyOptionValue.sendKeys(excelReader.getCellData(xlSheetName, 590, 6));
			Thread.sleep(2000);
			currencyOptionValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyFirstCellSelect));
			minQtyFirstCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyValue));
			minQtyValue.click();
			Thread.sleep(2000);
			minQtyValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyFirstCellSelect));
			maxQtyFirstCellSelect.click();
			Thread.sleep(2000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyValue));
			maxQtyValue.click();
			maxQtyValue.sendKeys(Keys.TAB);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateFirstCellSelect));
			rateFirstCellSelect.click();
			Thread.sleep(2000);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateValue));
			rateValue.sendKeys(excelReader.getCellData(xlSheetName, 591, 6));
			Thread.sleep(2000);
			rateValue.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemSecondCellSelect));
			itemSecondCellSelect.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemValuePriceBook));
			itemValuePriceBook.click();
			
			itemValuePriceBook.sendKeys(excelReader.getCellData(xlSheetName, 605, 6));
			Thread.sleep(2000);
			itemValuePriceBook.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseSecondCellSelect));
			wareHouseSecondCellSelect.click();
			/*wareHouseValue.sendKeys(excelReader.getCellData(xlSheetName, 606, 6));
			Thread.sleep(2000);*/
			wareHouseValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(satrtingDateSecondCellSelect));
			satrtingDateSecondCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startingDateValue));
			startingDateValue.click();
			startingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateSecondCellSelect));
			endingDateSecondCellSelect.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(endingDateValue));
			endingDateValue.click();
			endingDateValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSecondCellSelect));
			vendorSecondCellSelect.click();

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorValue));
			vendorValue.click();
			Thread.sleep(3000);
			vendorValue.sendKeys(excelReader.getCellData(xlSheetName, 607, 6));
			Thread.sleep(2000);*/
			vendorValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyOptionValue));
			currencyOptionValue.click();
			currencyOptionValue.sendKeys(excelReader.getCellData(xlSheetName, 608, 6));
			Thread.sleep(2000);
			currencyOptionValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minQtyValue));
			minQtyValue.click();
			minQtyValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maxQtyValue));
			maxQtyValue.click();
			maxQtyValue.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookUnit));
			buyerPriceBookUnit.click();
			buyerPriceBookUnit.sendKeys(Keys.END);
			buyerPriceBookUnit.sendKeys(Keys.SHIFT,Keys.HOME);
			buyerPriceBookUnit.sendKeys(excelReader.getCellData(xlSheetName, 609, 6));
			Thread.sleep(2000);
			buyerPriceBookUnit.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateValue));
			rateValue.sendKeys(excelReader.getCellData(xlSheetName, 610, 6));
			Thread.sleep(2000);
			rateValue.sendKeys(Keys.TAB);

			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PoValue));
			PoValue.sendKeys(excelReader.getCellData(xlSheetName, 592, 6));
			PoValue.sendKeys(Keys.TAB);
	*/
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookSaveBtn));
			buyerPriceBookSaveBtn.click();
			
	       String expSaveMessage = excelReader.getCellData(xlSheetName, 593, 7);
			
			boolean actSaveAccountMessage = checkValidationMessageboolean(expSaveMessage);
			boolean expSaveAccountMessage = true;

			String actSavingStatus= Boolean.toString(actSaveAccountMessage);
			String expSavingStatus=excelReader.getCellData(xlSheetName, 594, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 594, 8, actSavingStatus.toUpperCase());
			
			System.out.println("Actual Saving Status  : "+actSavingStatus);
			System.out.println(" Expected Saving Status  : "+expSavingStatus);
			

			if (actSavingStatus.equalsIgnoreCase(expSavingStatus) ) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 586, 9, resPass);
				return true;
			} 
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 586, 9, resFail);
				return false;
			}
	   }
	   catch (Exception e) 
		  {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 586, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
		  }
	}
	 
	 
	 public boolean checkClickOnCloseButtonInSellingRates() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {

		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************************** checkClickOnCloseButtonInSellingRates  ******************************************************");
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(buyerPriceBookCloseBtn));
			buyerPriceBookCloseBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));

			String actDashboardLabel = labelDashboard.getText();
			String expDashboardLabel = excelReader.getCellData(xlSheetName, 696, 7);

			excelReader.setCellData(xlfile, xlSheetName, 696, 8, actDashboardLabel);
			
			
			System.out.println("Close Button  : " + actDashboardLabel + "  Value Expected : " + expDashboardLabel);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			userNameDisplay.click();
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
			  
			Thread.sleep(2000);

			if (actDashboardLabel.equalsIgnoreCase(expDashboardLabel)) 
			{
				System.out.println("Test Pass : Transaction Authorization is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 696, 9, resPass);
				return true;
			} 
			else 
			{
				System.out.println("Test Fail : Transaction Authorization is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 696, 9, resFail);
				return false;

			}
		 }
		catch (Exception e) 
		{
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 696, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		 }
	 }


	 
	 
	
	public SmokePricebookPage(WebDriver driver)
    {
    	
   	 PageFactory.initElements(driver, this);
   	
    }
	
	
	
}
