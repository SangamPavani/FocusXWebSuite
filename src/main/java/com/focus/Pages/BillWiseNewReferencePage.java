package com.focus.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.xerces.impl.dv.ValidatedInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class BillWiseNewReferencePage extends BaseEngine
{
	
	
	@FindBy(xpath="//span[@class='hidden-xs']")
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
	   

		@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;

		@FindBy(xpath = "//i[@class='icon-font7 icon-import-from-excel']")
		private static WebElement importFromExcelIcon;
		
	@FindBy(id="ddlCompany")
	private static WebElement companyDropDownList;

	@FindBy(xpath="//*[@id='107']") 
	private static WebElement editCompanyMenu;

	@FindBy(xpath="//input[@id='CreatedDate']")
	private static WebElement accountingDate;
				
	@FindBy(xpath="//body/section[@id='mainDiv']/div[@id='id_focus8_wrapper_default']/div[1]/section[1]/form[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[3]/div[1]/span[1]")
	private static WebElement okButtonInCreateCompany;

	//Company Menu
	@FindBy (xpath="//*[@id='2']/span")
	private static WebElement companyMenu;

	
	@FindBy(xpath="//*[@id='60']/div")
	private static WebElement  financialsMenu;
	
	
	@FindBy(xpath="//*[@id='61']/span")
	private static WebElement  financialsTransactionMenu;
	
	@FindBy(xpath="//a[@id='2014']//span[contains(text(),'Sales')]")
	private static WebElement  financialTransactionSalesMenu;
	
	
	@FindBy(xpath="//*[@id='2083']/span")
	private static WebElement  financialTransactionSalesNewReference;
	
	
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
	
	
	@FindBy(xpath="//input[@id='id_header_1']")
	private static WebElement  documentNumberTxt;
	
	@FindBy(xpath="//input[@id='id_header_3']")
	private static WebElement  salesAccountTxt;
	
	
	@FindBy(xpath="//*[@id='id_header_4']")
	private static WebElement  customerAccountTxt;
	
	
	@FindBy(xpath="//input[@id='id_header_268435459']")
	private static WebElement  departmentTxt;
	
	
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

	
	
	@FindBy(xpath="//input[@id='id_body_536870916']")
	private static WebElement enter_WarehouseTxt;
	
	@FindBy(xpath="//*[@id='id_body_23']")
	private static WebElement enter_ItemTxt;
	
	
	
	
	@FindBy(xpath="//input[@id='id_body_26']")
	private static WebElement  enter_Quantity;

	@FindBy(xpath="//input[@id='id_body_27']")
	private static WebElement  enter_Rate;

	@FindBy(xpath="//*[@id='id_body_28']")
	private static WebElement  enter_Gross;
	
	@FindBy(xpath="//input[@id='id_body_33554543']")
	private static WebElement enter_AQTxt;

	@FindBy(xpath="//input[@id='id_body_33554544']")
	private static WebElement enter_FQTxt;
	
	@FindBy(xpath="//tbody[@id='id_header_268435459_table_body']/tr/td[2]")
	private static List<WebElement> departmentListCount;


	@FindBy(xpath="//tbody[@id='id_header_10_table_body']/tr/td[2]")
	private static List<WebElement> currencyListCount;
	

	@FindBy(xpath="//*[@id='id_header_3_input_image']/span")
	private static WebElement salesAccountOpenToggle;
	

	
	@FindBy(xpath="//tbody[@id='id_header_3_table_body']//tr//td[2]")
	private static List<WebElement> salesAccountsList;
	
	@FindBy(xpath="//*[@id='id_header_4_input_image']/span")
	private static WebElement customerAccountOpenToggle;
	
	@FindBy(xpath="//tbody[@id='id_header_4_table_body']//tr//td[2]")
	private static  List<WebElement> customerAccountsList;
	

	 @FindBy(xpath="//input[@id='id_header_6']")
	   private static WebElement  voucherHeaderDueDate;

	   @FindBy(xpath="//input[@id='id_header_10']")
	   private static WebElement  voucherHeaderCurrency;

	   @FindBy(xpath="//input[@id='id_header_145']")
	   private static WebElement  voucherHeaderLocalExchangeRate;	
	   
	   
	   
	   @FindBy(xpath="//*[@id='id_transactionentry_save']")
	   private static WebElement  voucherSaveBtn;

	   @FindBy(xpath="//div[@id='dvHomeTransClose']")  
	   private static WebElement  voucherhomeCloseBtn;
		  
	   
	   
	   @FindBy(xpath="//div[@class='theme_color font-6']")
		public static WebElement errorMessage;
		 
		@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
		public static WebElement errorMessageCloseBtn;
		
		
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

		
		
		public boolean checkLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		 getDriver().navigate().refresh();
		 Thread.sleep(1999);
		 
		 getDriver().navigate().refresh();
		 Thread.sleep(1999);

		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";
				      
		String pawslt="su";
				      
		lp.enterUserName(unamelt);

		Thread.sleep(2000);
				
		lp.enterPassword(pawslt);

		String compname="BillWise";

		 Select oSelect = new Select(companyDropDownList);
		 
		 List <WebElement> elementCount = oSelect.getOptions();

		 int cqSize = elementCount.size();
		 
		 System.out.println("CompanyDropdownList Count :"+cqSize);

		    int i;
		  
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

		Thread.sleep(2000);
				           	
		String userInfo=userNameDisplay.getText();
				    	
		System.out.println("User Info : "+userInfo);
				    	
		System.out.println("User Info Capture Text :"+userNameDisplay.getText());
				    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
				    	
		companyLogo.click();
				    	
		if(userInfo.equalsIgnoreCase("SU"))
		{

			System.out.println("Test Pass :Logined to Billwise Company");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :Logined to Billwise Company");
				return false;

			}
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
	   
	   
		@FindBy(xpath = "//*[@id='1']/div/span")
		public static WebElement homeMenu;
	   
	    @FindBy (xpath="//*[@id='25']/span")
	    private static WebElement dataMangementMenu;
	   

		@FindBy (xpath="//*[@id='26']/span")
		private static WebElement backup;
			
		@FindBy (xpath="//*[@id='27']/span")
		private static WebElement restore;
		
		@FindBy (xpath="//*[@id='111']/span")
		private static WebElement reindex;
		
		@FindBy (xpath="//*[@id='115']/span")
		private static WebElement eraseAll;
			
		@FindBy (xpath="//input[@id='idEraseTransaction']")
		private static WebElement eraseTranscationsRadio;
		
		@FindBy (xpath="//span[contains(text(),'Ok')]")
		private static WebElement eraseAllOkBtn;
	   
	   
	   public boolean checkErasingAllData() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		   Thread.sleep(4000);
		     
		     
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
			dataMangementMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
			eraseAll.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
			eraseTranscationsRadio.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
			eraseAllOkBtn.click();
				
			if(getIsAlertPresent())
			{
				getWaitForAlert();
				
				getAlert().accept();
			}
			
			String expValidationMsg="Data deleted successfully";
			
			String actValidationMsg=checkValidationMessage(expValidationMsg);
	     
			
			if (actValidationMsg.equalsIgnoreCase(expValidationMsg)) 
			{
				System.out.println(" Test Pass: Dara Erased Successfully ");
				return true;
				
			} 
			else
			{
				System.out.println(" Test FAIL: Dara Erased Successfully ");
				return false;
			
			}
	   }
	   
	   
	   public boolean checkSavingSalesINvoiceNewRef() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {

	   
	   Thread.sleep(3000);


	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	   financialsMenu.click();
	   			
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
	   financialsTransactionMenu.click();
	   			
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
	   financialTransactionSalesMenu.click();
	   		
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesNewReference));
	   financialTransactionSalesNewReference.click();

	   Thread.sleep(2000);;
	  
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	   newBtn.click();
	   
	  checkValidationMessage("Screen Opened");
	   
	   
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAccountOpenToggle));
	  salesAccountOpenToggle.click();
	  
	   int salesAccountcount=salesAccountsList.size();

	   System.err.println(salesAccountcount);
	   	
	   for(int i=0 ; i < salesAccountcount ;i++)
	   {
	   	String data=salesAccountsList.get(i).getText();
	   	
	   	if(data.equalsIgnoreCase("Sales - Computers"))
	   	{
	   		salesAccountsList.get(i).click();
	   		
	   		break;
	   	}
	   }
	   
	   salesAccountTxt.sendKeys(Keys.TAB);
	   
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountOpenToggle));
	   customerAccountOpenToggle.click();
	   
	   int customerAccountCount =customerAccountsList.size();

	   System.err.println(customerAccountCount);
	   	
	   for(int i=0 ; i < customerAccountCount ;i++)
	   {
	   	String data=customerAccountsList.get(i).getText();
	   	
	   	if(data.equalsIgnoreCase("Customer A"))
	   	{
	   		customerAccountsList.get(i).click();
	   		
	   		break;
	   	}
	   }
	   
	   customerAccountTxt.sendKeys(Keys.TAB);
	   
	   int currencycount=currencyListCount.size();

	   System.err.println(currencycount);
	   	
	   for(int i=0 ; i < currencycount ;i++)
	   {
	   	String data=currencyListCount.get(i).getText();
	   	
	   	if(data.equalsIgnoreCase("INR"))
	   	{
	   		currencyListCount.get(i).click();
	   		
	   		break;
	   	}
	   }
	   	
	   voucherHeaderCurrency.sendKeys(Keys.TAB);

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
			
			if(data.equalsIgnoreCase("DUBAI"))
			{
				departmentListCount.get(i).click();
				break;
			}
		}
			
		
		
		Thread.sleep(1000);
		
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		 select1stRow_1stColumn.click();
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		 enter_WarehouseTxt.click();
		 enter_WarehouseTxt.sendKeys("Hyderabad");
		 Thread.sleep(2000);
		 enter_WarehouseTxt.sendKeys(Keys.TAB);
		 
		
		 enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
		 Thread.sleep(2000);
		 enter_ItemTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_6thColumn));
		 select1stRow_6thColumn.click();
		 
		 
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		 enter_FQTxt.click();
		 enter_FQTxt.clear();
		 enter_FQTxt.sendKeys("2");
		 enter_FQTxt.sendKeys(Keys.TAB);
		 
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		 select1stRow_11thColumn.click();
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		 enter_Rate.click();
		 enter_Rate.clear();
		 Thread.sleep(1000);
		 enter_Rate.sendKeys("10");
		 enter_Rate.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();

		 String expMessage = "This Transaction will make the Stock Negative";
		 String actMessage = checkValidationMessage(expMessage);
		 
		 String expMessage1 = "Voucher saved successfully";
		 String actMessage1 = checkValidationMessage(expMessage1);
	
		 if (actMessage.equalsIgnoreCase(expMessage) && 
				 actMessage1.equalsIgnoreCase(expMessage)) 
		 {
			 return true;
			
		} 
		 else 
		 {
			return false;
		}
	   }
	   

	   @FindBy(xpath="//table[@id='id_rc_columnheadertable']/thead/tr/th/div/p")
	  private static List<WebElement>  custBodyHeaderList;

	  @FindBy(xpath="//*[@id='plnCustomizecolumn']/div/span[4]/a")
	  private static WebElement  custRemoveBtn;

	  @FindBy(xpath="//div[@class='col-sm-12 toolbar_button_text font-6'][contains(text(),'Save')]")
	  private static WebElement  custSaveBtn;

	  @FindBy(xpath="//*[@id='btnCustomizeClose']/div[1]/span")
	  private static WebElement  custCancelBtn;
	   
	  @FindBy(xpath="//div[@id='btnCustomize']//span[@class='icon-settings icon-font6']")
	   private static WebElement  customizeBtn;
	   
	  @FindBy(xpath="//a[@class='transaction_viewname_anchor font-5']")
	  private static WebElement  pendingBillsBtn;

	  @FindBy(xpath="//tr[@id='trRender_1']//td//input")
	  private static WebElement  pendingBillsGridRow1Chkbox;

	  @FindBy(xpath="//tr[@id='trRender_2']//td//input")
	  private static WebElement  pendingBillsGridRow2Chkbox;

	  @FindBy(xpath="//tr[@id='trRender_3']//td//input")
	  	private static WebElement  pendingBillsGridRow3Chkbox;	
	     
	   
	   
	  @FindBy(xpath="//*[@id='tblBodyTransRender']/tr")
	  private static List<WebElement>  voucherBodyGridRowCountList;

	  @FindBy(xpath="//*[@id='id_header_4_table_body']/tr")
	  private static List<WebElement>  cashAndBAnkAccountList;
	 
	   @FindBy(xpath="//input[@id='id_header_4']")
	   private static WebElement newCashBankAccountTxt;
	   
	   @FindBy(xpath="//input[@id='id_body_16777330']")
	   private static WebElement  enterReceiptsVATTaxCode;

	   @FindBy(xpath="//input[@id='id_header_268435470']")
	   private static WebElement  placeofSupplyTxt;

	   

	   @FindBy(xpath="//input[@id='id_header_268435471']")
	   private static WebElement  jurisdictionTxt;
	   
	   @FindBy(xpath="//input[@id='id_body_12']")
	   private static WebElement  enter_AccountTxt;
	   
	   @FindBy(xpath="//input[@id='id_body_16']")
	   private static WebElement  enter_AmountTxt;
	   
	   @FindBy(xpath="//tbody[@id='id_header_268435470_table_body']/tr/td[2]")
	   private static List<WebElement>  placeofSupplyList;


	   @FindBy(xpath="//tbody[@id='id_header_268435471_table_body']/tr/td[2]")
	   private static List<WebElement>  jurisdictionList;
	 
		  
	   @FindBy(xpath="//table[@id='id_TranTable']/tbody")//table[@id='id_TranTable']/tbody
	   private static WebElement  voucherBodyGridRowCount;
		
		@FindBy(xpath="//*[@id='id_body_12_table_body']/tr")
	private static List<WebElement> bodyAccountListInGrid;

	               
	@FindBy(xpath="//*[@id='id_body_39_table_body']/tr")
	private static List<WebElement> bodyCreditAccountListInGrid;

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
	   
	   @FindBy(xpath="//*[@id='lblAccount']")//*[@id="lblAccount"]
	   private static WebElement  billRefPartyName;


@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr")
private static List<WebElement> billRefAdjustBillsGrid;
		
	   @FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr")
	   private static List<WebElement> billRefAdjustBillsGridList;

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


	   @FindBy(xpath="//td[@id='AccountAmount_col_4-1']")
	   private static WebElement  billRefGridVendorRow4;





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

	   @FindBy(xpath="//*[@id='InfPnlAdjGrd_body']/tr/td")
	   private static List<WebElement>  baseAmtList;

	   @FindBy(xpath="//input[@id='id_limit']")
	   private static WebElement gridEnterAdjustAmtRow1;
	   
	   

	   @FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[2]/input")
	   private static WebElement gridCheckbox;
	 

	   

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



public static boolean checkVoucherSavingMessage(String docno) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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

	   public boolean checkReceiptsVATForSalesNewReferencewithAdjustedAmount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		   Thread.sleep(2000);
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		    financialsMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
			cashAndBankMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(recepitsVATVoucher));
			recepitsVATVoucher.click();
			
			Thread.sleep(2000);
			
			checkDeleteLinkStatus();
			
			Thread.sleep(2000);
					
			
			Thread.sleep(2000);

			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkUserFriendlyMessage();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		   newCashBankAccountTxt.click();
			
			newCashBankAccountTxt.sendKeys(Keys.SPACE);
			
			
		   int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();

		   System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);
		   
		for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		{
			String data		  = cashAndBAnkAccountList.get(i).getText();
			
			if(data.equalsIgnoreCase("Bank"))
				{
				cashAndBAnkAccountList.get(i).click();
					
					break;
				}
			}

		newCashBankAccountTxt.sendKeys(Keys.TAB);

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
				
				if(data.equalsIgnoreCase("DUBAI"))
				{
					departmentListCount.get(i).click();
					break;
				}
			}
				
			Thread.sleep(1000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeofSupplyTxt));
			placeofSupplyTxt.click();
			placeofSupplyTxt.sendKeys(Keys.SPACE);
			
		   int placeOfSupplyListCount=placeofSupplyList.size();
			
			System.err.println(placeOfSupplyListCount);
				
			for(int i=0 ; i < placeOfSupplyListCount ;i++)
			{
				String data=placeofSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeofSupplyList.get(i).click();
					
					break;
				}
			}
				
			placeofSupplyTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
			jurisdictionTxt.click();
			jurisdictionTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			jurisdictionTxt.sendKeys(Keys.SPACE);
			
		   int jurisdictionListCount=jurisdictionList.size();
			
			System.err.println(jurisdictionListCount);
				
			for(int i=0 ; i < jurisdictionListCount ;i++)
			{
				String data=jurisdictionList.get(i).getText();
				
				if(data.equalsIgnoreCase("DUBAI"))
			{
				jurisdictionList.get(i).click();
				
				break;
			}
		}
			
		jurisdictionTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer A");


		getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
		int accountCount=bodyAccountListInGrid.size();

		System.err.println(accountCount);
			
		for(int i=0 ; i < accountCount ;i++)
		{
			String data=bodyAccountListInGrid.get(i).getText();
			
			
			if(data.equalsIgnoreCase("Customer A"))
			{
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
				bodyAccountListInGrid.get(i).click();
				
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
		enter_AccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterReceiptsVATTaxCode));	
		enterReceiptsVATTaxCode.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AmountTxt));
		enter_AmountTxt.sendKeys("10");
		enter_AmountTxt.sendKeys(Keys.TAB);
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
		voucherSaveBtn.click();
		
		String expMessage = "Vocher Saved Successfully";
		String actMessage = checkValidationMessage(expMessage);

		
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));

		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Customer A (122-001)";
		 
		 
		System.out.println("Bill wise Screen Customer Name "  + actPartyName + "  Value Expected  " + expPartyName);
		  
		int Adjustbills=billRefAdjustBillsGridList.size();

		String actAdjustbills=Integer.toString(Adjustbills);

		/*String expAdjustbills="";
		 
		System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);*/
				
		    
		     

		System.err.println("actAdjustbills : "+actAdjustbills);/*+" Value Expected  : "+expAdjustbills*/;

		String expBillNewReference                      = "0.00";
		String expBillTransactionCurrency               = "10.00";
		String expBillBaseCurrency                      = "10.00";
		String expBillLocalCurrency                     = "0.70";
		String expBillBalanceNewRefAmount              = "0.00";

		String expbillRefAdjustAmountInTransCurency         = "0.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrency = "10.00";



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
		String actBillBaseCurrency                           = billRefBaseCurrency.getText();
		String actBillLocalCurrency                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


		String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
		String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


		String expconversationRateBaseCurrencyRatePick  = "1";
		String expconversationRateLocalCurrencyRatePick = "0.07";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridAdjustmentAmtRow1));
		gridAdjustmentAmtRow1.click();

		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();


		


		   
		System.out.println("********************************Bill Reference Screen Values after pick *************************************************************************");

		/*System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);*/
		System.out.println("actBillNewReference :             "+ actBillNewReference +"                    "+ "expBillNewReference :"+expBillNewReference);
		System.out.println("actBillTransactionCurrency       :"+ actBillTransactionCurrency + "            " + "expBillTransactionCurrency :"+expBillTransactionCurrency);
		System.out.println("actBillBaseCurrency :             "+ actBillBaseCurrency + "                   " +"expBillBaseCurrency :"+expBillBaseCurrency);
		System.out.println("actBillLocalCurrency :            "+ actBillLocalCurrency+ "                   " +"expBillLocalCurrency :"+expBillLocalCurrency);
		System.out.println("actBillBalanceNewRefAmount :      "+ actBillBalanceNewRefAmount + "            " + "expBillBalanceNewRefAmount :"+expBillBalanceNewRefAmount);
		   
		System.out.println("actbillRefAdjustAmountInTransCurency         :"+ actbillRefAdjustAmountInTransCurency+ "       " +"expbillRefAdjustAmountInTransCurency :"+expbillRefAdjustAmountInTransCurency);
		System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrency :"+ actbillRefBalanceAmountAdjustInTrnasCurrency + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrency :"+expbillRefBalanceAmountAdjustInTrnasCurrency);

		   
		 


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
		String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
		String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
		String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
		String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();



		String expgridOrginalAmtRow1      ="20.00";
		String expgridBalanceAmtRow1      ="20.00";
		String expgridAdjustmentAmtRow1   ="10.00";
		String expgridAdjustmentBillsRow1DocNo  = "NDT76:1";

		System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
		System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
		System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
		System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);

		
		String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
    	String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
    	String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

    
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

    	String expbreakUpDetailsAccountPick             ="071-001";
    	String expbreakUpDetailsDepartmentPick          ="DUBAI";
    		
    	String expasOnEntryDateTransAmtPick             ="20.00";
    	String expasOnEntryDateBaseConcersationRatePick ="1";
    	String expasOnEntryDateBaseAmountPick           ="20.00";
    	String expasOnEntryDateLocConversationRatePick  ="0.07";
    	String expasOnEntryDateAmtPick                  ="1.40";
    		
    	String expbalOnAdjstDateTransAmtPick            ="20.00";
    	String expbalOnAdjstDateBasrConversionRatePick  ="1";
    	String expbalOnAdjstDateBaseAmountPick          ="20.00";
    	String expbalOnAdjstDateLocalConversionRatePick ="0.07";
    	String expbalOnAdjstDateAmtPick                 ="1.40";

    	String expadjustmentsAmount1Pick                ="0.00";
    	String expadjustmentsAmount2Pick                ="0.00";
    	String expadjustmentsAmount3Pick                ="0.00";
    	String expadjustmentsAmount4Pick                ="0.00";
    		
    	String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
    	String expexchangeGainLossForLocalCurrencyPick  ="0.00";

   

    	System.out.println(" Right SIde Elements *****************************************************************************");

    	System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
    	System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
    	System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+actasOnEntryDateBaseConcersationRatePick);
    	System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
    	System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
    	System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
    	System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
    	System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
    	System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

    	System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
    	System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
    	System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
    	System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
    	System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

    	System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
    	System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
    	System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
    	System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

    	System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
    	System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);

		
		
		
		
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		boolean savingVoucher=checkVoucherSavingMessage(docno);
		
		    if ( actPartyName.equalsIgnoreCase(expPartyName)    && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
					actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
					actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
				     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
					actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) && 
					actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
					
					actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
				     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo) &&
				     
				     actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
						actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
						actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
						actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
						actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
						actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick)&&
						actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
						actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
						actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
						actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
						actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick))
			        
			        
				{
					System.err.println("Recepits VAT Voucher Saved With New Reference  ");
					return true;
				}
				else
				{
					System.err.println("Recepits VAT Voucher Saved With New Reference  ");
					return false;
				}
		
	   }
	   
	   @FindBy(xpath="//*[@id='id_transactionentry_previous']/div[1]/span")
	   private static WebElement previousBtn;
	   
	   
	   public static boolean checkLoadingMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
	  	
	  	
	   @FindBy(xpath="//input[@id='id_header_2']")
	   private static WebElement  dateTxt;
	   
	   
	   @FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	   private static WebElement  recepitsFooterAmt;
	   
	   public static boolean checkSavedReceiptsVATVoucherWithSalesNewReference() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		   Thread.sleep(30000);
		   
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		    previousBtn.click();
			
		    boolean loading=checkLoadingMessage();
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String actDocno             = documentNumberTxt.getAttribute("value");
			String actVouDate           = dateTxt.getAttribute("value");
			String actDepartment        = departmentTxt.getAttribute("value");
			String actPlaceOfSupply     = placeofSupplyTxt.getAttribute("value");
			
			
			String actCashAndBankAccount=newCashBankAccountTxt.getAttribute("value");
					
					
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
		    
		    System.out.println("expadjustBills   :"+expadjustBills);
			
		     
			
			String expDocno              = "1";
		    String expDepartment         = "Dubai";
			String expPlaceOfSupply      = "Abu Dhabi";
		
			String expCashAndBankAccount = "Bank";
			
			
			
			
			String actAccountR1           = select1stRow_1stColumn.getText();
			String actTaxcodeR1           = select1stRow_2ndColumn.getText();
			String actAmountR1            = select1stRow_3rdColumn.getText();
			String actrefR1               = select1stRow_4thColumn.getText();
			
		   
			String expAccountR1          = "Customer A";
			String expTaxcodeR1          = "Std Rate";
			String expAmountR1           = "10.00";
			String exprefR1              = "NDT76:1 ";
			 

			
			String actFooterAmt   =recepitsFooterAmt.getText();
			String expFooterAmt   ="10.00";

			
			System.out.println("Entry Page Document Number    "+actDocno       +"  value Expected  "+expDocno);
			System.out.println("Entry Page Voucher Date       "+actVouDate     +"  value Expected  "+expadjustBills);
			
			System.out.println("Entry Page Department         "+actDepartment  +"  value Expected  "+expDepartment);
			System.out.println("Entry Page CashAndBankAccount "+actCashAndBankAccount  +"  value Expected  "+expCashAndBankAccount);
			
			
			System.out.println("Entry Page Account            "+actAccountR1     +"  value Expected  "+expAccountR1);
			System.out.println("Entry Page Taxcode            "+actTaxcodeR1     +"  value Expected  "+expTaxcodeR1);
			System.out.println("Entry Page Amount             "+actAmountR1      +"  value Expected  "+expAmountR1);
			System.out.println("Entry Page Reference          "+actrefR1         +"  value Expected  "+exprefR1);
			
			
			
			System.out.println("Entry Page Place Of Supply    "+actPlaceOfSupply  +"  value Expected  "+expPlaceOfSupply);
			System.out.println("Entry Page Footer  Amount     "+actFooterAmt   +"  Value Expected  "+expFooterAmt);
			
			
			if ( actDocno.equalsIgnoreCase(expDocno) && actVouDate.equalsIgnoreCase(expadjustBills) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					 actCashAndBankAccount.equalsIgnoreCase(expCashAndBankAccount) && 
					 
					actAccountR1.equalsIgnoreCase(expAccountR1) && actAmountR1.equalsIgnoreCase(expAmountR1) && actTaxcodeR1.equalsIgnoreCase(expTaxcodeR1) && 
					actrefR1.startsWith(exprefR1)&& 
					
					actFooterAmt.equalsIgnoreCase(expFooterAmt) && actPlaceOfSupply.equalsIgnoreCase(expPlaceOfSupply))
			
			{
				System.out.println(" Test Pass: Data Displayed As Exepcted  ");
				return true;
			}
			else
			{
				System.err.println(" Test Fail: Data Displayed As Exepcted ");
				return false;
			} 
		   
	   }
	   
	   public static boolean checkReceiptsVATForSalesNewReferencewithGridCheckbox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {

			  
			  
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		    financialsMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
			cashAndBankMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(recepitsVATVoucher));
			recepitsVATVoucher.click();
			
			Thread.sleep(2000);
			
			checkDeleteLinkStatus();
			
			Thread.sleep(2000);
					
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();

			Thread.sleep(1999);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		    newCashBankAccountTxt.click();
			newCashBankAccountTxt.sendKeys(Keys.SPACE);
			
		   int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();

		   System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);
		   
		  for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		  {
			String data		  = cashAndBAnkAccountList.get(i).getText();
			
			if(data.equalsIgnoreCase("Bank"))
				{
				cashAndBAnkAccountList.get(i).click();
					
					break;
				}
			}

		   newCashBankAccountTxt.sendKeys(Keys.TAB);

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
				
				if(data.equalsIgnoreCase("DUBAI"))
				{
					departmentListCount.get(i).click();
					break;
				}
			}
				
			Thread.sleep(1000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeofSupplyTxt));
			placeofSupplyTxt.click();
			placeofSupplyTxt.sendKeys(Keys.SPACE);
			
		   int placeOfSupplyListCount=placeofSupplyList.size();
			
			System.err.println(placeOfSupplyListCount);
				
			for(int i=0 ; i < placeOfSupplyListCount ;i++)
			{
				String data=placeofSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeofSupplyList.get(i).click();
					
					break;
				}
			}
				
			placeofSupplyTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
			jurisdictionTxt.click();
			jurisdictionTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			jurisdictionTxt.sendKeys(Keys.SPACE);
			
		   int jurisdictionListCount=jurisdictionList.size();
			
			System.err.println(jurisdictionListCount);
				
			for(int i=0 ; i < jurisdictionListCount ;i++)
			{
				String data=jurisdictionList.get(i).getText();
				
				if(data.equalsIgnoreCase("DUBAI"))
			{
				jurisdictionList.get(i).click();
				
				break;
			}
		}
			
		jurisdictionTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer");


		getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
		int accountCount=bodyAccountListInGrid.size();

		System.err.println(accountCount);
			
		for(int i=0 ; i < accountCount ;i++)
		{
			String data=bodyAccountListInGrid.get(i).getText();
			
			
			if(data.equalsIgnoreCase("Customer A"))
			{
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
				bodyAccountListInGrid.get(i).click();
				
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
		enter_AccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterReceiptsVATTaxCode));	
		enterReceiptsVATTaxCode.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.clear();
		enter_Amount.sendKeys("5");
		enter_Amount.sendKeys(Keys.TAB);
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
		voucherSaveBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));

		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Customer A (122-001)";
		 
		 
		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
		  
		int Adjustbills=billRefAdjustBillsGridList.size();

		String actAdjustbills=Integer.toString(Adjustbills);

		String expAdjustbills="1";
		 
		System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
				
		    

		System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);

		String expBillNewReference                      = "0.00";
		String expBillTransactionCurrency               = "5.00";
		String expBillBaseCurrency                      = "5.00";
		String expBillLocalCurrency                     = "0.35";
		String expBillBalanceNewRefAmount              = "0.00";

		String expbillRefAdjustAmountInTransCurency         = "0.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrency = "5.00";



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
		String actBillBaseCurrency                           = billRefBaseCurrency.getText();
		String actBillLocalCurrency                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


		String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
		String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


		String expconversationRateBaseCurrencyRatePick  = "1";
		String expconversationRateLocalCurrencyRatePick = "0.07";


		

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridCheckbox));
		gridCheckbox.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();


		String expBillNewReferencePick                          = "0.00";
		String expBillTransactionCurrencyPick                   = "5";
		String expBillBaseCurrencyPick                          = "5"; 
		String expBillLocalCurrencyPick                         = "0.35";
		String expBillBalanceNewRefAmountPick                   = "0.00";

		String expbillRefAdjustAmountInTransCurencyPick         = "5.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = "0.00";
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		      
		String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
		String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
		String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


		   
		System.out.println("*********************************************************************************************************");

		System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);
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

		System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
		System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
		String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
		String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
		String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
		String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();

		String expgridOrginalAmtRow1      ="20.00";
		String expgridBalanceAmtRow1      ="10.00";
		String expgridAdjustmentAmtRow1   ="5.00";
		String expgridAdjustmentBillsRow1DocNo  = "NDT76:1";

		System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
		System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
		System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
		System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);



		String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
		String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
		String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

			
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

		String expbreakUpDetailsAccountPick             ="071-001";
		/*String expbreakUpDetailsItemPick                ="STD RATE COGS ITEM"; */    
		String expbreakUpDetailsDepartmentPick          ="DUBAI";
			
		String expasOnEntryDateTransAmtPick             ="20.00";
		String expasOnEntryDateBaseConcersationRatePick ="1";
		String expasOnEntryDateBaseAmountPick           ="20.00";
		String expasOnEntryDateLocConversationRatePick  ="0.07";
		String expasOnEntryDateAmtPick                  ="1.40";
			
		String expbalOnAdjstDateTransAmtPick            ="10.00";
		String expbalOnAdjstDateBasrConversionRatePick  ="1";
		String expbalOnAdjstDateBaseAmountPick          ="10.00";
		String expbalOnAdjstDateLocalConversionRatePick ="0.07";
		String expbalOnAdjstDateAmtPick                 ="0.70";

		String expadjustmentsAmount1Pick                ="5.00";
		String expadjustmentsAmount2Pick                ="5.00";
		String expadjustmentsAmount3Pick                ="0.35";
		String expadjustmentsAmount4Pick                ="5.00";
			
		String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
		String expexchangeGainLossForLocalCurrencyPick  ="0.00";


		int baseAmtListCount=baseAmtList.size();
    	
    	ArrayList<String >baseAmtListArray=new ArrayList<>();
    	for (int i = 0; i < baseAmtListCount; i++) 
    	{
    		String data=baseAmtList.get(i).getText();
    		baseAmtListArray.add(data);
    	}
    	
    	String actbaseAmtList=baseAmtListArray.toString();
    	String expbaseAmtList="[, NDT57:1 (Y0), 10, 10, , NDT57:2 (Y0), 5, 5]";
    	
    	System.out.println(" baseAmtList Actual : "+actbaseAmtList);
    	System.out.println(" baseAmtList Exp    : "+expbaseAmtList);
    	
		
		
		System.out.println(" Right SIde Elements *****************************************************************************");

		System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
		System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
		System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
		System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
		System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
		System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
		System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
		System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
		System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

		System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
		System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
		System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
		System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
		System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

		System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
		System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
		System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
		System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

		System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
		System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		boolean savingVoucher=checkVoucherSavingMessage(docno);


		    
		    if (   actPartyName.equalsIgnoreCase(expPartyName)  && actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
					actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
					actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
				     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
					actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
			        
		    		
			        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
					actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
					actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick)  && 
					actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
					actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
					actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) && 
					actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
				     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo)&& 
				     
				     actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
						actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
						actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
						actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
						actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
						actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick)&&
						actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
						actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
						actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
						actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
						actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick))
			        
				{
					System.err.println("Recepits VAT Voucher Saved With Semi Adjustment  ");
					return true;
				}
				else
				{
					System.err.println("Recepits VAT Voucher Saved With Semi Adjustment ");
					return false;
				}
	  
	  }
	   
	   
	   public static boolean checkSavedReceiptVatForSalesNewReferenceWithGridCheckbox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		   Thread.sleep(30000);
		   
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
		    previousBtn.click();
			
		    boolean loading=checkLoadingMessage();
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String actDocno             = documentNumberTxt.getAttribute("value");
			String actVouDate           = dateTxt.getAttribute("value");
			String actDepartment        = departmentTxt.getAttribute("value");
			String actPlaceOfSupply     = placeofSupplyTxt.getAttribute("value");
			
			
			String actCashAndBankAccount=newCashBankAccountTxt.getAttribute("value");
					
					
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
		    
		    System.out.println("expadjustBills   :"+expadjustBills);
			
		     
			
			String expDocno              = "2";
		    String expDepartment         = "Dubai";
			String expPlaceOfSupply      = "Abu Dhabi";
		
			String expCashAndBankAccount = "Bank";
			
			
			
			
			String actAccountR1           = select1stRow_1stColumn.getText();
			String actTaxcodeR1           = select1stRow_2ndColumn.getText();
			String actAmountR1            = select1stRow_3rdColumn.getText();
			String actrefR1               = select1stRow_4thColumn.getText();
			
		   
			String expAccountR1          = "Customer A";
			String expTaxcodeR1          = "Std Rate";
			String expAmountR1           = "5.00";
			String exprefR1              = "NDT76:1 ";
			 

			
			String actFooterAmt   =recepitsFooterAmt.getText();
			String expFooterAmt   ="5.00";

			
			System.out.println("Entry Page Document Number    "+actDocno       +"  value Expected  "+expDocno);
			System.out.println("Entry Page Voucher Date       "+actVouDate     +"  value Expected  "+expadjustBills);
			
			System.out.println("Entry Page Department         "+actDepartment  +"  value Expected  "+expDepartment);
			System.out.println("Entry Page CashAndBankAccount "+actCashAndBankAccount  +"  value Expected  "+expCashAndBankAccount);
			
			
			System.out.println("Entry Page Account            "+actAccountR1     +"  value Expected  "+expAccountR1);
			System.out.println("Entry Page Taxcode            "+actTaxcodeR1     +"  value Expected  "+expTaxcodeR1);
			System.out.println("Entry Page Amount             "+actAmountR1      +"  value Expected  "+expAmountR1);
			System.out.println("Entry Page Reference          "+actrefR1         +"  value Expected  "+exprefR1);
			
			
			
			System.out.println("Entry Page Place Of Supply    "+actPlaceOfSupply  +"  value Expected  "+expPlaceOfSupply);
			System.out.println("Entry Page Footer  Amount     "+actFooterAmt   +"  Value Expected  "+expFooterAmt);
			
			
			if ( actDocno.equalsIgnoreCase(expDocno) && actVouDate.equalsIgnoreCase(expadjustBills) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					 actCashAndBankAccount.equalsIgnoreCase(expCashAndBankAccount) && 
					 
					actAccountR1.equalsIgnoreCase(expAccountR1) && actAmountR1.equalsIgnoreCase(expAmountR1) && actTaxcodeR1.equalsIgnoreCase(expTaxcodeR1) && 
					actrefR1.startsWith(exprefR1)&& 
					
					actFooterAmt.equalsIgnoreCase(expFooterAmt) && actPlaceOfSupply.equalsIgnoreCase(expPlaceOfSupply))
			
			{
				System.out.println(" Test Pass: Data Displayed As Exepcted  ");
				return true;
			}
			else
			{
				System.err.println(" Test Fail: Data Displayed As Exepcted ");
				return false;
			} 
		   
	   }
	   
	   @FindBy(xpath="//*[@id='2061']/span")
	   private static WebElement salesReturnsVATBtn;
	   
	   
	   
	   @FindBy(xpath="//*[@id='id_header_268435460']")
	   private static WebElement wareHouseTxt;
	 
	   
	   @FindBy(xpath="//*[@id='id_header_268435459']")
	   private static WebElement departMentTxt;
	
	   
	   @FindBy(xpath="//*[@id='id_header_268435470']")
	   private static WebElement placeOfSupplyTxt;
	   
	   
	   @FindBy(xpath="//*[@id='id_header_268435471']")
	   private static WebElement jurisdictionTxtt;
	 
	   
	   @FindBy(xpath="//*[@id='id_header_4_table_body']/tr/td[2]")
	   private static List<WebElement> customerAccountList;
	   
	   
	   @FindBy(xpath="//*[@id='id_body_23']")
	   private static WebElement enter_itemTxt;
	 
	   
	   @FindBy(xpath="//*[@id='id_body_24']")
	   private static WebElement enter_unitsTxt;
	   
	   
	   @FindBy(xpath="//*[@id='id_body_26']")
	   private static WebElement enter_QuantityTxt;
	   
	   
	   @FindBy(xpath="//*[@id='id_body_27']")
	   private static WebElement enter_RateTxt;
	 //*[@id="id_body_27"]
	   
	   @FindBy(xpath="//*[@id='id_body_28']")
	   private static WebElement enter_GrossTxt;
	   
	   
	   @FindBy(xpath="//*[@id='id_body_12']")
	   private static WebElement enter_salesAccount;
	 //*[@id="id_body_12"]
	 
	   
	   

	   
	   public static boolean checkSalesReturnsVATForSalesNewReference() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		   Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
			financialTransactionSalesMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReturnsVATBtn));
			salesReturnsVATBtn.click();
			
			Thread.sleep(2000);
			
			checkDeleteLinkStatus();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountOpenToggle));
			customerAccountOpenToggle.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(customerAccountList));
			int accountCount=customerAccountList.size();

			System.err.println(accountCount);
				
			for(int i=0 ; i < accountCount ;i++)
			{
				String data=customerAccountList.get(i).getText();
				
				
				if(data.equalsIgnoreCase("Customer A"))
				{
					getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(customerAccountList));
					customerAccountList.get(i).click();
					
					break;
				}
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(wareHouseTxt));
			wareHouseTxt.sendKeys("Hyderabad");
			Thread.sleep(2000);
			wareHouseTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departMentTxt));
			departMentTxt.sendKeys("Dubai");
			Thread.sleep(2000);
			departMentTxt.sendKeys(Keys.TAB);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOfSupplyTxt));
			placeOfSupplyTxt.sendKeys("Abu Dhabi");
			Thread.sleep(2000);
			placeOfSupplyTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxtt));
			jurisdictionTxtt.sendKeys("Dubai");
			Thread.sleep(2000);
			jurisdictionTxtt.sendKeys(Keys.TAB);
			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_itemTxt));
			enter_itemTxt.click();
			enter_itemTxt.sendKeys("STD RATE COGS ITEM");
			Thread.sleep(2000);
			enter_itemTxt.sendKeys(Keys.TAB);
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_salesAccount));
			enter_salesAccount.click();
			enter_salesAccount.sendKeys(Keys.TAB);*/
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
			select1stRow_4thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_unitsTxt));
			enter_unitsTxt.click();
			enter_unitsTxt.sendKeys(Keys.TAB);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_QuantityTxt));
			enter_QuantityTxt.click();
			enter_QuantityTxt.clear();
			enter_QuantityTxt.sendKeys("1");
			enter_QuantityTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_RateTxt));
			enter_RateTxt.click();
			enter_RateTxt.clear();
			enter_RateTxt.sendKeys("5");
			enter_RateTxt.sendKeys(Keys.TAB);
			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
			voucherSaveBtn.click();
			
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));

			String actPartyName = billRefPartyName.getText();
			String expPartyName = "Customer A (122-001)";
			 
			 
			System.out.println("Bill wise Screen Customer Name "  + actPartyName + "  Value Expected  " + expPartyName);
			  
			int Adjustbills=billRefAdjustBillsGridList.size();

			String actAdjustbills=Integer.toString(Adjustbills);

			/*String expAdjustbills="";
			 
			System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);*/
					
			    
			     

			System.err.println("actAdjustbills : "+actAdjustbills);/*+" Value Expected  : "+expAdjustbills*/;

			String expBillNewReference                      = "0.00";
			String expBillTransactionCurrency               = "5.00";
			String expBillBaseCurrency                      = "5.00";
			String expBillLocalCurrency                     = "0.35";
			String expBillBalanceNewRefAmount              = "0.00";

			String expbillRefAdjustAmountInTransCurency         = "0.00";
			String expbillRefBalanceAmountAdjustInTrnasCurrency = "5.00";



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
			String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
			String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
			String actBillBaseCurrency                           = billRefBaseCurrency.getText();
			String actBillLocalCurrency                          = localCurrencyDhs.getText();
			String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
			String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
			String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


			String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
			String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


			String expconversationRateBaseCurrencyRatePick  = "1";
			String expconversationRateLocalCurrencyRatePick = "0.07";


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridCheckbox));
			gridCheckbox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();

			
			
			
			
			System.out.println("*********************************************************************************************************");

			/*System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);*/
			System.out.println("actBillNewReference :             "+ actBillNewReference +"                    "+ "expBillNewReference :"+expBillNewReference);
			System.out.println("actBillTransactionCurrency       :"+ actBillTransactionCurrency + "            " + "expBillTransactionCurrency :"+expBillTransactionCurrency);
			System.out.println("actBillBaseCurrency :             "+ actBillBaseCurrency + "                   " +"expBillBaseCurrency :"+expBillBaseCurrency);
			System.out.println("actBillLocalCurrency :            "+ actBillLocalCurrency+ "                   " +"expBillLocalCurrency :"+expBillLocalCurrency);
			System.out.println("actBillBalanceNewRefAmount :      "+ actBillBalanceNewRefAmount + "            " + "expBillBalanceNewRefAmount :"+expBillBalanceNewRefAmount);
			   
			System.out.println("actbillRefAdjustAmountInTransCurency         :"+ actbillRefAdjustAmountInTransCurency+ "       " +"expbillRefAdjustAmountInTransCurency :"+expbillRefAdjustAmountInTransCurency);
			System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrency :"+ actbillRefBalanceAmountAdjustInTrnasCurrency + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrency :"+expbillRefBalanceAmountAdjustInTrnasCurrency);
	  
	   

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
			String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
			String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
			String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
			String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();



			String expgridOrginalAmtRow1      ="20.00";
			String expgridBalanceAmtRow1      ="5.00";
			String expgridAdjustmentAmtRow1   ="5.00";
			String expgridAdjustmentBillsRow1DocNo  = "NDT76:1";

			System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
			System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
			System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
			System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);



			

	    	String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
	    	String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
	    	String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

	    
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

	    	String expbreakUpDetailsAccountPick             ="071-001";
	    	String expbreakUpDetailsDepartmentPick          ="DUBAI";
	    		
	    	String expasOnEntryDateTransAmtPick             ="20.00";
	    	String expasOnEntryDateBaseConcersationRatePick ="1";
	    	String expasOnEntryDateBaseAmountPick           ="20.00";
	    	String expasOnEntryDateLocConversationRatePick  ="0.07";
	    	String expasOnEntryDateAmtPick                  ="1.40";
	    		
	    	String expbalOnAdjstDateTransAmtPick            ="10.00";
	    	String expbalOnAdjstDateBasrConversionRatePick  ="1";
	    	String expbalOnAdjstDateBaseAmountPick          ="10.00";
	    	String expbalOnAdjstDateLocalConversionRatePick ="0.07";
	    	String expbalOnAdjstDateAmtPick                 ="0.70";

	    	String expadjustmentsAmount1Pick                ="5.00";
	    	String expadjustmentsAmount2Pick                ="5.00";
	    	String expadjustmentsAmount3Pick                ="0.35";
	    	String expadjustmentsAmount4Pick                ="5.00";
	    		
	    	String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
	    	String expexchangeGainLossForLocalCurrencyPick  ="0.00";

	    	
	    	int baseAmtListCount=baseAmtList.size();
	    	
	    	ArrayList<String >baseAmtListArray=new ArrayList<>();
	    	for (int i = 0; i < baseAmtListCount; i++) 
	    	{
	    		String data=baseAmtList.get(i).getText();
	    		baseAmtListArray.add(data);
	    	}
	    	
	    	String actbaseAmtList=baseAmtListArray.toString();
	    	String expbaseAmtList="[1, NDT57:1 (Y0), 10, 10]";
	    	
	    	System.out.println(" baseAmtList Actual : "+actbaseAmtList);
	    	System.out.println(" baseAmtList Exp    : "+expbaseAmtList);

	    	System.out.println(" Right SIde Elements *****************************************************************************");

	    	System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
	    	System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
	    	System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+actasOnEntryDateBaseConcersationRatePick);
	    	System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
	    	System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
	    	System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
	    	System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
	    	System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
	    	System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

	    	System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
	    	System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
	    	System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
	    	System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
	    	System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

	    	System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
	    	System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
	    	System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
	    	System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

	    	System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
	    	System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);

			
		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		
			
			    if (   actPartyName.equalsIgnoreCase(expPartyName) /* && actAdjustbills.equalsIgnoreCase(expAdjustbills)*/  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
						actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
						actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
					     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
						actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
				        
			    		
				      /*  actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
						actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
						actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick)*/ 
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
						/*actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
						actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick)*/ 
						actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
					     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo))
				        
				        
					{
						System.err.println("Recepits VAT Voucher Saved With New Reference  ");
						return true;
					}
					else
					{
						System.err.println("Recepits VAT Voucher Saved With New Reference  ");
						return false;
					}
	   
	   
	   
	   
	   }
   
	   
	   @FindBy(xpath="//*[@id='id_body_12_table_body']/tr")
	   private static List<WebElement> openingBalAccountListInGrid;
	   
	   @FindBy(xpath="//*[@id='2023']/span")
	   private static WebElement  financialsTransactionsJournalsMenu;
	   
	   @FindBy(xpath="//*[@id='id_header_268435459_table_body']/tr/td[2]")
	   private static List<WebElement> openingBalDepartmentList;

	   @FindBy(xpath="//*[@id='id_transactionentry_save']")
	   private static WebElement openingBalancesSaveBtn;

	   @FindBy(xpath="//*[@id='2084']/span")
	   private static WebElement  openingBalancesNewReferenceBtn;
	   
	   
	   
	   @FindBy(xpath="//input[@id='id_header_11']")
	   private static WebElement  voucherHeaderExchangeRate;

	   @FindBy(xpath="//input[@id='id_body_18']")
	   private static WebElement  enter_DebitTxt;

	   @FindBy(xpath="//input[@id='id_body_19']")
	   private static WebElement  enter_CreditTxt;
	 
	   
	   
	   @FindBy(xpath="//*[@id='id_body_16777386']")
	   private static WebElement  enter_Remarks;
	   
	 
	   
	   @FindBy(xpath="//*[@id='id_transactionentry_footer_panel_summary_value_16']")
	   private static WebElement footerAmountInJournalEntriesvchr;
	   
	   @FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_18']")
	   private static WebElement vocFooterdebitAmount;

	   @FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_19']")
	   private static WebElement vocFooterCreditAmount;
	   
	   

	   public static boolean checkSavingOpeningBalancesNewReference() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {

			Thread.sleep(5000);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsJournalsMenu));
			financialsTransactionsJournalsMenu.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalancesNewReferenceBtn));
			openingBalancesNewReferenceBtn.click();
			
			Thread.sleep(2000);
			checkDeleteLinkStatus();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			 
			String docno=documentNumberTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();
			
			voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
			
			voucherHeaderCurrency.sendKeys(Keys.SPACE);
			
			int currencycount=currencyListCount.size();
			
			System.err.println(currencycount);
				
			for(int i=0 ; i < currencycount ;i++)
			{
				String data=currencyListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("INR"))
				{
					currencyListCount.get(i).click();
					
					break;
				}
			}
				
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.SPACE);
			 
			int OpeningBalDepartmentListCount=openingBalDepartmentList.size();
			
			for (int i = 0; i < OpeningBalDepartmentListCount; i++) 
			{
				String data=openingBalDepartmentList.get(i).getText();
				
				if (data.equalsIgnoreCase("Dubai"))
				{
					openingBalDepartmentList.get(i).click();
					
					break;
				}
		 	 }
		   
			 departmentTxt.sendKeys(Keys.TAB);
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			 select1stRow_1stColumn.click();
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			 enter_AccountTxt.click();
			 enter_AccountTxt.sendKeys("Customer");
			 
			 int accountCount=openingBalAccountListInGrid.size();
				
			System.err.println(accountCount);
				
			for(int i=0 ; i < accountCount ;i++)
			{
				String data=openingBalAccountListInGrid.get(i).getText();
				
				if(data.equalsIgnoreCase("Customer New Reference"))
				{
					openingBalAccountListInGrid.get(i).click();
					
					break;
				}
			}
			
			enter_AccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));
			enter_DebitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditTxt));
			enter_CreditTxt.sendKeys("20");
			enter_CreditTxt.sendKeys(Keys.TAB);
			
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalancesSaveBtn));
			openingBalancesSaveBtn.click();
			
			String expMessage1 = "Voucher saved successfully";
			String expMessgae2 =": 1";
			String actMessage = checkValidationMessage(expMessage1);
			
			if (actMessage.contains(expMessage1)) {
				
				return true;
			} 
			else
			{
				return false;
			}
			
	   }
	
	   
	   public boolean checkPreviousButtonInOpeningBalanceSavedVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {

	   	    Thread.sleep(2000);
	   	
	   	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
	   	    previousBtn.click();
	   	    
	           boolean loading=checkLoadingMessage();
	     		
	     		System.out.println("VoucherLoadingMessage  : "+loading+" Value Expected : "+"true");
	       	
	     		String actDocno               = documentNumberTxt.getAttribute("value");
	           String actCurrency            = voucherHeaderCurrency.getAttribute("value");
	   		   String actDepartment          = departmentTxt.getAttribute("value");
	           String actExchangeRate        = voucherHeaderExchangeRate.getAttribute("value");
	           String actLocExchangeRate     = voucherHeaderLocalExchangeRate.getAttribute("value");
	           
	           String actR1Account           = select1stRow_1stColumn.getText();
	           String actR1Credit             = select1stRow_3rdColumn.getText();
	           String actR1Reference         = select1stRow_4thColumn.getText();
	           
	           
	           String actFooterCreditAmt    =vocFooterCreditAmount.getText();
	           String actVoucherDebitAmt   = vocFooterdebitAmount.getText();
	           
	           
	    
	           String expDocno               = "1";
	   	    String expCurrency            = "INR";
	   		String expDepartment          = "DUBAI";
	           String expExchangeRate        = "1.0000000000";
	           String expLocExchangeRate     = "0.1100000000";

	   		String expR1Account           = "Customer New Reference";
	   		String expR1Credit            ="20.00";
	   		String expR1Reference         = "New Reference";
	   		
	   		
	   		String expFooterCreditAmt     = "20.00";
	           String expVoucherDebitAmt     = "0.00";
	           
	           
	       	System.out.println("Entry Page Document Number    "+actDocno           +"  value Expected  "+expDocno);
			System.out.println("Entry Page Currency           "+actCurrency        +"  value Expected  "+expCurrency);
			System.out.println("Entry Page Department         "+actDepartment      +"  value Expected  "+expDepartment);
			System.out.println("Entry Page Exchange Rate      "+actExchangeRate    +"  value Expected  "+expExchangeRate);
			System.out.println("Entry Page Department         "+actLocExchangeRate +"  value Expected  "+expLocExchangeRate);

			System.out.println("Entry Page R1Account          "+actR1Account       +"  value Expected  "+expR1Account);
				
			
			System.out.println("Entry Page Debit Amount       "+actVoucherDebitAmt +"  value Expected  "+expVoucherDebitAmt);
			System.out.println("Entry Page Credit Amount      "+actFooterCreditAmt +"  value Expected  "+expFooterCreditAmt);
			
			
			
			if (actDocno.equalsIgnoreCase(expDocno) && actCurrency.equalsIgnoreCase(expCurrency) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) && 
					
					actR1Account.equalsIgnoreCase(expR1Account) && actR1Credit.equalsIgnoreCase(expR1Credit) && 
					
					
					actFooterCreditAmt.equalsIgnoreCase(expFooterCreditAmt) && actR1Reference.equalsIgnoreCase(expR1Reference))
			{
				
				System.out.println(" Test Pass: Data Saved Successfully ");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Data  not Saved Successfully ");
				return false;
			}
	           
	   }
	   
	   @FindBy(xpath="//*[@id='2023']/span")
	   private static WebElement  finTransJournalsMenu;
	   	
	   @FindBy(xpath="//input[@id='id_body_16777336']")
	   private static WebElement  jvvatTaxcode;


	   @FindBy(xpath="//*[@id='id_header_6_input_image']/span")
	   private static WebElement  dueDateCalenderIcon;

	   @FindBy(xpath="//*[@id='id_header_6_day_today']/td/span[1]")
	   private static WebElement  todaysDatePicker;

	   @FindBy(xpath="//*[@id='2032']/span")
	   private static WebElement  journalEntriesBtn;
	   
	   //*[@id="id_body_39"]
	   
	   @FindBy(xpath="//*[@id='id_body_12']")
	   private static WebElement  enter_DebitAccountTxt;
	 
	   @FindBy(xpath="//*[@id='id_body_39']")
	   private static WebElement  enter_CreditAccountTxt;
	   
	   
	   @FindBy(xpath="//*[@id='id_body_16']")
	   private static WebElement  enter_Amount;

@FindBy(xpath="//*[@id='id_transactionentry_save']/div[2]")
private static WebElement  saveBtn;

	   
	 //*[@id="2032"]/span
	   
	   public static boolean checkSavingJournalEntriesVoucherAdjustingInOpeningBalancesNewRef() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {

			
			 System.err.println(" Entered   ************************");
				
				Thread.sleep(4000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
				financialsMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
				financialsTransactionMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finTransJournalsMenu));
				finTransJournalsMenu.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(journalEntriesBtn));
				journalEntriesBtn.click();
				
				Thread.sleep(2999);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
				newBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
				voucherHeaderCurrency.click();;
				voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);
				
				voucherHeaderCurrency.sendKeys(Keys.SPACE);
				
				int currencycount=currencyListCount.size();
				
				System.err.println("Currency count: "+currencycount);
					
				for(int i=0 ; i < currencycount ;i++)
				{
					String data=currencyListCount.get(i).getText();
					
					if(data.equalsIgnoreCase("INR"))
						
					{
						currencyListCount.get(i).click();
						
						break;
					}
				}
					
				voucherHeaderCurrency.sendKeys(Keys.TAB);
				
				 Thread.sleep(2000);

				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dueDateCalenderIcon));
				dueDateCalenderIcon.click();
				
				Thread.sleep(2000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(todaysDatePicker));
				todaysDatePicker.click();
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
				departmentTxt.click();
				departmentTxt.sendKeys(Keys.SHIFT,Keys.HOME,Keys.BACK_SPACE);
				departmentTxt.sendKeys(Keys.SPACE);
				Thread.sleep(2000);
				int departmentcount=departmentListCount.size();
				
				System.err.println("DepartMent Count: "+departmentcount);
					
				for(int i=0 ; i < departmentcount ;i++)
				{
					String data=departmentListCount.get(i).getText();
					
					if(data.equalsIgnoreCase("Dubai"))
					{
						departmentListCount.get(i).click();
						break;
					}
				}
					
				Thread.sleep(1000);
				
				departmentTxt.sendKeys(Keys.TAB);
				
				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitAccountTxt));
				enter_DebitAccountTxt.click();
				enter_DebitAccountTxt.sendKeys("Customer New Reference");
				Thread.sleep(2000);
				enter_DebitAccountTxt.sendKeys(Keys.TAB);
				
				
				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditAccountTxt));
				enter_CreditAccountTxt.click();
				enter_CreditAccountTxt.sendKeys("Bank");
				Thread.sleep(2000);
				enter_CreditAccountTxt.sendKeys(Keys.TAB);
				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
				enter_Amount.click();
				enter_Amount.clear();
				enter_Amount.sendKeys("05");
				enter_Amount.sendKeys(Keys.TAB);
				
/*				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
				String docno=documentNumberTxt.getAttribute("value");
*/				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
				
				String actPartyName = billRefPartyName.getText();
				String expPartyName ="Customer New Reference (Customer New Reference)";
				 
				 
				System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
		       
				int Adjustbills=billRefAdjustBillsGrid.size();
				
				String actAdjustbills=Integer.toString(Adjustbills);
				
				String expAdjustbills="1";
				

				String expBillNewReference                      = "0.00";
				String expBillTransactionCurrency               = "5.00";
				String expBillBaseCurrency                      = "5.00";
				String expBillLocalCurrency                     = "0.35";
				String expBillBalanceNewRefAmount              = "0.00";

				String expbillRefAdjustAmountInTransCurency         = "0.00";
				String expbillRefBalanceAmountAdjustInTrnasCurrency = "5.00";



				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
				String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
				String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
				String actBillBaseCurrency                           = billRefBaseCurrency.getText();
				String actBillLocalCurrency                          = localCurrencyDhs.getText();
				String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
				String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
				String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


				String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
				String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


				String expconversationRateBaseCurrencyRatePick  = "1";
				String expconversationRateLocalCurrencyRatePick = "0.07";


				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
				billRefGridFirstRowAdjustmentAmtTxt.click();
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
				billRefPickIcon.click();

				Thread.sleep(2000);

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
				billRefGridFirstRowAdjustmentAmtTxt.click();
					
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
				billRefPickIcon.click();


				String expBillNewReferencePick                          = "0.00";
				String expBillTransactionCurrencyPick                   = "5";
				String expBillBaseCurrencyPick                          = "5"; 
				String expBillLocalCurrencyPick                         = "0.35";
				String expBillBalanceNewRefAmountPick                   = "0.00";

				String expbillRefAdjustAmountInTransCurencyPick         = "5.00";
				String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = "0.00";
				 
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
				      
				String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
				String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
				String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
				String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
				String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
				String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
				String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


				   
				System.out.println("*********************************************************************************************************");

				System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);
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

				System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
				System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);


				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
				String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
				String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
				String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
				String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();

				String expgridOrginalAmtRow1      ="20.00";
				String expgridBalanceAmtRow1      ="20.00";
				String expgridAdjustmentAmtRow1   ="5.00";
				String expgridAdjustmentBillsRow1DocNo  = "NDT77:1";

				System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
				System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
				System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
				System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);



				String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
				String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
				String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

					
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

				String expbreakUpDetailsAccountPick             ="OBC";
				String expbreakUpDetailsDepartmentPick          ="DUBAI";
					
				String expasOnEntryDateTransAmtPick             ="20.00";
				String expasOnEntryDateBaseConcersationRatePick ="1";
				String expasOnEntryDateBaseAmountPick           ="20.00";
				String expasOnEntryDateLocConversationRatePick  ="0.07";
				String expasOnEntryDateAmtPick                  ="1.40";
					
				String expbalOnAdjstDateTransAmtPick            ="20.00";
				String expbalOnAdjstDateBasrConversionRatePick  ="1";
				String expbalOnAdjstDateBaseAmountPick          ="20.00";
				String expbalOnAdjstDateLocalConversionRatePick ="0.07";
				String expbalOnAdjstDateAmtPick                 ="1.40";

				String expadjustmentsAmount1Pick                ="5.00";
				String expadjustmentsAmount2Pick                ="5.00";
				String expadjustmentsAmount3Pick                ="0.35";
				String expadjustmentsAmount4Pick                ="5.00";
					
				String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
				String expexchangeGainLossForLocalCurrencyPick  ="0.00";


				System.out.println(" Right SIde Elements *****************************************************************************");

				System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
				System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
				System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
				System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
				System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
				System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
				System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
				System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
				System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

				System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
				System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
				System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
				System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
				System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

				System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
				System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
				System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
				System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

				System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
				System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);



				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
				billRefOkBtn.click();

				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

			/*	boolean savingVoucher=checkVoucherSavingMessage(docno);*/

				String expMessage1 = "Vocher Saved Successfully";
				String expMessage2 = ": 1";
				String actMessage = checkValidationMessage(expMessage1);

				    
				    if (   actPartyName.equalsIgnoreCase(expPartyName)  && actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
							actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
							actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
						     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
							actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
					        
				    		
					        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
							actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
							actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick)  && 
							actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
							actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
							actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) && 
							actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
						     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo)&& 
						     
						     actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
								actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
								actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
								actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
								actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
								actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
								actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick)&&
								actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
								actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
								actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
								actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
								actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick))
					        
						{
							System.err.println("Recepits VAT Voucher Saved With Semi Adjustment  ");
							return true;
						}
						else
						{
							System.err.println("Recepits VAT Voucher Saved With Semi Adjustment ");
							return false;
						}
				
	   }
	   
	   
	   public static boolean checkSavedJournalEntriesVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	   {
		   Thread.sleep(2000);
		   	
	   	   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
	   	   	previousBtn.click();
	   	    
	           boolean loading=checkLoadingMessage();
	     		
	     		System.out.println("VoucherLoadingMessage  : "+loading+" Value Expected : "+"true");
	       	
	     	   String actDocno               = documentNumberTxt.getAttribute("value");
	           String actCurrency            = voucherHeaderCurrency.getAttribute("value");
	   		   String actDepartment          = departmentTxt.getAttribute("value");
	           String actExchangeRate        = voucherHeaderExchangeRate.getAttribute("value");
	           String actLocExchangeRate     = voucherHeaderLocalExchangeRate.getAttribute("value");
	           
	           String actR1DebitAccount           = select1stRow_1stColumn.getText();
	           String actR1Amount           = select1stRow_3rdColumn.getText();
	           String actR1CreditAccount           = select1stRow_2ndColumn.getText();							
	           String actR1Reference         = select1stRow_4thColumn.getText();
	           
	           
	         
	           String actFooterAmount   = footerAmountInJournalEntriesvchr.getText();
	           String expFooterAmount   = "5.00";
	           
	           DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	           Date date=new Date();
	           String expadjustBills=df.format(date);
	           
	           System.out.println("expadjustBills   :"+expadjustBills);
	       	
	           DateFormat df1 = new SimpleDateFormat("dd MMM yyyy");
	           
	    
	           String expDocno               = "1";
	   	       String expCurrency            = "INR";
	   		   String expDepartment          = "DUBAI";
	           String expExchangeRate        = "1.0000000000";
	           String expLocExchangeRate     = "0.0700000000";

	   		String expR1DebitAccount         = "Customer New Reference";
	   		String expR1CreditAccount        = "Bank";
	   		String expR1Reference            = "NDT77:1 : 03 Apr 2021";
	   		String expR1Amount               = "5.00";
	   		
	   		
	           
	       	System.out.println("Entry Page Document Number    "+actDocno           +"  value Expected  "+expDocno);
			System.out.println("Entry Page Currency           "+actCurrency        +"  value Expected  "+expCurrency);
			System.out.println("Entry Page Department         "+actDepartment      +"  value Expected  "+expDepartment);
			System.out.println("Entry Page Exchange Rate      "+actExchangeRate    +"  value Expected  "+expExchangeRate);
			System.out.println("Entry Page LocalExchangeRate  "+actLocExchangeRate +"  value Expected  "+expLocExchangeRate);

			System.out.println("Entry Page R1Amount          "+actR1Amount       +"  value Expected  "+expR1Amount);
			System.out.println("Entry Page R1DebitAccount          "+actR1DebitAccount       +"  value Expected  "+expR1DebitAccount);
			System.out.println("Entry Page R1CreditAccount          "+actR1CreditAccount       +"  value Expected  "+expR1CreditAccount);
			System.out.println("Entry Page R1Reference          "+actR1Reference       +"  value Expected  "+expR1Reference);
			

				
			
			
			
			if (actDocno.equalsIgnoreCase(expDocno) && actCurrency.equalsIgnoreCase(expCurrency) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) && 
					
					actR1Amount.equalsIgnoreCase(expR1Amount) && actR1CreditAccount.equalsIgnoreCase(expR1CreditAccount) && 
					
					actR1DebitAccount.equalsIgnoreCase(expR1DebitAccount)  && actFooterAmount.equalsIgnoreCase(expFooterAmount) && 
					
					actR1Reference.equalsIgnoreCase(expR1Reference))
			{
				
				System.out.println(" Test Pass: Data Saved Successfully ");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Data  not Saved Successfully ");
				return false;
			}
	   }
	   
	   
	   @FindBy(xpath="//*[@id='2085']/span")
	   private static WebElement jvNewReferenceBtn;
	   
	   
	   public static boolean checkSavingJVNewReferenceVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		   Thread.sleep(4000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finTransJournalsMenu));
			finTransJournalsMenu.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jvNewReferenceBtn));
			jvNewReferenceBtn.click();
			
			
			Thread.sleep(2000);
			
			checkDeleteLinkStatus();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			
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
				
				if(data.equalsIgnoreCase("INR"))
					
				{
					currencyListCount.get(i).click();
					
					break;
				}
			}
				
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			 Thread.sleep(2000);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dueDateCalenderIcon));
			dueDateCalenderIcon.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(todaysDatePicker));
			todaysDatePicker.click();
			
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
				
				if(data.equalsIgnoreCase("Dubai"))
				{
					departmentListCount.get(i).click();
					break;
				}
			}
				
			Thread.sleep(1000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
	
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitAccountTxt));
			enter_DebitAccountTxt.click();
			enter_DebitAccountTxt.sendKeys("Vendor New Reference");
			Thread.sleep(2000);
			enter_DebitAccountTxt.sendKeys(Keys.TAB);
			
			
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditAccountTxt));
			enter_CreditAccountTxt.click();
			enter_CreditAccountTxt.sendKeys("Bank");
			Thread.sleep(2000);
			enter_CreditAccountTxt.sendKeys(Keys.TAB);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			enter_Amount.click();
			enter_Amount.clear();
			enter_Amount.sendKeys("10");
			enter_Amount.sendKeys(Keys.TAB);
			
/*				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			String docno=documentNumberTxt.getAttribute("value");
*/				
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			

			String expMessage1 = "Voucher saved successfully";
			String expMessgae2 =": 1";
			String actMessage = checkValidationMessage(expMessage1);
			
			if (actMessage.contains(expMessage1)) {
				
				return true;
			} 
			else
			{
				return false;
			}
	
	   }
	   
	   
	   public static boolean checkSavedJVNewReferenceVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	   {
		   Thread.sleep(2000);
		   	
	   	   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
	   	   	previousBtn.click();
	   	    
	           boolean loading=checkLoadingMessage();
	     		
	     		System.out.println("VoucherLoadingMessage  : "+loading+" Value Expected : "+"true");
	       	
	     		String actDocno               = documentNumberTxt.getAttribute("value");
	           String actCurrency            = voucherHeaderCurrency.getAttribute("value");
	   		   String actDepartment          = departmentTxt.getAttribute("value");
	           String actExchangeRate        = voucherHeaderExchangeRate.getAttribute("value");
	           String actLocExchangeRate     = voucherHeaderLocalExchangeRate.getAttribute("value");
	           
	           String actR1DebitAccount           = select1stRow_1stColumn.getText();
	           String actR1Amount           = select1stRow_3rdColumn.getText();
	           String actR1CreditAccount           = select1stRow_2ndColumn.getText();							
	           String actR1Reference         = select1stRow_4thColumn.getText();
	           
	           
	         
	           String actFooterAmount   = footerAmountInJournalEntriesvchr.getText();
	           String expFooterAmount   = "10.00";
	           
	    
	           String expDocno               = "1";
	   	    String expCurrency            = "INR";
	   		String expDepartment          = "DUBAI";
	           String expExchangeRate        = "1.0000000000";
	           String expLocExchangeRate     = "0.0700000000";

	   		String expR1DebitAccount           = "Vendor New Reference";
	   		String expR1CreditAccount           ="Bank";
	   		String expR1Reference         = "New Reference";
	   		String expR1Amount            ="10.00";
	   		
	   		
	           
	       	System.out.println("Entry Page Document Number    "+actDocno           +"  value Expected  "+expDocno);
			System.out.println("Entry Page Currency           "+actCurrency        +"  value Expected  "+expCurrency);
			System.out.println("Entry Page Department         "+actDepartment      +"  value Expected  "+expDepartment);
			System.out.println("Entry Page Exchange Rate      "+actExchangeRate    +"  value Expected  "+expExchangeRate);
			System.out.println("Entry Page LocalExchangeRate  "+actLocExchangeRate +"  value Expected  "+expLocExchangeRate);

			System.out.println("Entry Page R1Amount          "+actR1Amount       +"  value Expected  "+expR1Amount);
			System.out.println("Entry Page R1DebitAccount          "+actR1DebitAccount       +"  value Expected  "+expR1DebitAccount);
			System.out.println("Entry Page R1CreditAccount          "+actR1CreditAccount       +"  value Expected  "+expR1CreditAccount);
			System.out.println("Entry Page R1Reference          "+actR1Reference       +"  value Expected  "+expR1Reference);
	
			
			if (actDocno.equalsIgnoreCase(expDocno) && actCurrency.equalsIgnoreCase(expCurrency) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) && 
					
					actR1Amount.equalsIgnoreCase(expR1Amount) && actR1CreditAccount.equalsIgnoreCase(expR1CreditAccount) && 
					
					actR1DebitAccount.equalsIgnoreCase(expR1DebitAccount)  && actFooterAmount.equalsIgnoreCase(expFooterAmount) && 
					
					actR1Reference.equalsIgnoreCase(expR1Reference))
			{
				
				System.out.println(" Test Pass: Data Saved Successfully ");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Data  not Saved Successfully ");
				return false;
			}
	   }
	   
	   
	   
		@FindBy(xpath="//a[@id='2007']//span[contains(text(),'Purchases')]")
		private static WebElement  purchasesExpandBtn;
		
		@FindBy(xpath="//*[@id='2057']/span")
		private static WebElement  purchasesVoucherVATBtn;
		
		
		
		@FindBy(xpath="//input[@id='id_header_4']")
		private static WebElement  vendorAccountTxt;
		
		
		
		@FindBy(xpath="//input[@id='id_header_268435470']")
		private static WebElement purchaseVoucherVATPlaceOFSupply;
		
		@FindBy(xpath="//tbody[@id='id_header_268435470_table_body']/tr/td[2]")
		private static List<WebElement>  placeOFSupplyList;
		
		
		
		@FindBy(xpath="//input[@id='id_body_536870916']")
		private static WebElement  pvWareHouseTxt;
		
		@FindBy(xpath="//input[@id='id_body_23']")
		private static WebElement  enter_ItemTxtt;
		
		@FindBy(xpath="//*[@id='id_body_12']")
		private static WebElement  enter_PurchaseAccountTxt;
		
		@FindBy(xpath="//*[@id='id_body_24']")
		private static WebElement  enter_UnitTxt;
		
		
		@FindBy(xpath="//input[@id='id_body_33554522']")
		private static WebElement enter_PvTaxable;

		@FindBy(xpath="//input[@id='id_body_12']")
		private static WebElement  enter_PurchaseAccountTxtt;

		@FindBy(xpath="//input[@id='id_body_33554521']")
		private static WebElement enter_PvVat;

@FindBy(xpath="//input[@id='id_body_16777323']")
private static WebElement  enter_TaxCode;
		
	   public static boolean checkSavingPurchasesVoucherAdjustingInJVNewReference() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		   financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesExpandBtn));
			purchasesExpandBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVoucherVATBtn));
			purchasesVoucherVATBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			    	
			checkValidationMessage("Screen opened");
			
			    	
			    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.sendKeys("Vendor New Reference");
			Thread.sleep(3000);
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			
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
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherVATPlaceOFSupply));
			purchaseVoucherVATPlaceOFSupply.click();
			purchaseVoucherVATPlaceOFSupply.sendKeys(Keys.END);
			purchaseVoucherVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			purchaseVoucherVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
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
			
			purchaseVoucherVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxtt));
			jurisdictionTxtt.click();
			jurisdictionTxtt.sendKeys(Keys.END);
			jurisdictionTxtt.sendKeys(Keys.SHIFT,Keys.HOME);
			jurisdictionTxtt.sendKeys("DUBAI");
			Thread.sleep(2000);
			jurisdictionTxtt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	    	select1stRow_1stColumn.click();
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
	    	pvWareHouseTxt.sendKeys("Hyderabad");
	    	Thread.sleep(3000);
	    	pvWareHouseTxt.sendKeys(Keys.TAB);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	    	enter_ItemTxtt.sendKeys("STD RATE COGS ITEM");
	    	Thread.sleep(3000);
	    	enter_ItemTxtt.sendKeys(Keys.TAB);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_TaxCode));
	    	enter_TaxCode.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxtt));
	    	enter_PurchaseAccountTxtt.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
	    	select1stRow_9thColumn.click();
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
	    	enter_Quantity.click();
	    	enter_Quantity.clear();
	    	enter_Quantity.sendKeys("1");


	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
	    	select1stRow_11thColumn.click();
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	    	enter_Rate.click();
	    	enter_Rate.clear();
	    	enter_Rate.sendKeys("05");
	    	enter_Rate.sendKeys(Keys.TAB);
	    					
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	    	enter_Gross.click();
	    	enter_Gross.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	    	select1stRow_14thColumn.click();

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
	    	enter_PvVat.click();

	    	enter_PvVat.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
	    	enter_PvTaxable.click();
	    	enter_PvTaxable.sendKeys(Keys.TAB);

	    	String docno=documentNumberTxt.getAttribute("value");

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	    	voucherSaveBtn.click();


	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
	    	String actPartyName = billRefPartyName.getText();
	    	String expPartyName = "Vendor New Reference (Vendor New Reference)";

	    	 
	    	System.out.println("Bill wise Screen vendor Name "  + actPartyName + "  Value Expected  " + expPartyName);
	    	   
	    	int Adjustbills=billRefAdjustBillsGrid.size();

	    	String actAdjustbills=Integer.toString(Adjustbills);

	    	String expAdjustbills="1";

	    	 
	    	System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);

	    	String expBillNewReference                      = "0.00";
	    	String expBillTransactionCurrency               = "5.25";
	    	String expBillBaseCurrency                      = "5.25";
	    	String expBillLocalCurrency                     = "0.37";
	    	String expBillBalanceNewRefAmount              = "0.00";

	    	String expbillRefAdjustAmountInTransCurency         = "0.00";
	    	String expbillRefBalanceAmountAdjustInTrnasCurrency = "5.25";



	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	    	String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
	    	String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
	    	String actBillBaseCurrency                           = billRefBaseCurrency.getText();
	    	String actBillLocalCurrency                          = localCurrencyDhs.getText();
	    	String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
	    	String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
	    	String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


	    	String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
	    	String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


	    	String expconversationRateBaseCurrencyRatePick  = "1";
	    	String expconversationRateLocalCurrencyRatePick = "0.07";



	    		
	    	//To update in Adjsut Amount in Right side Pannel
	    		
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
			billRefGridFirstRowAdjustmentAmtTxt.click();
	    		
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	    	billRefPickIcon.click();

	    	//To Adjustment
	    	
	    	Thread.sleep(1999);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
			billRefGridFirstRowAdjustmentAmtTxt.click();
	    		
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	    	billRefPickIcon.click();
	    	
	    	String expBillNewReferencePick                          = "0.00";
			String expBillTransactionCurrencyPick                   = "5.25";
			String expBillBaseCurrencyPick                          = "5.25"; 
			String expBillLocalCurrencyPick                         = "0.37";
			String expBillBalanceNewRefAmountPick                   = "0.00";

			String expbillRefAdjustAmountInTransCurencyPick         = "5.25";
			String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = "0.00";
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
			      
			String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
			String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
			String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
			String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
			String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
			String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
			String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


			   
			System.out.println("*********************************************************************************************************");

			System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);
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

			System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
			System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
			String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
			String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
			String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
			String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();

			String expgridOrginalAmtRow1      ="10.00";
			String expgridBalanceAmtRow1      ="10.00";
			String expgridAdjustmentAmtRow1   ="5.25";
			String expgridAdjustmentBillsRow1DocNo  = "NDT78:1";

			System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
			System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
			System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
			System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);



			String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
			String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
			String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

				
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

			String expbreakUpDetailsAccountPick             ="121-001";
			String expbreakUpDetailsDepartmentPick          ="DUBAI";
				
			String expasOnEntryDateTransAmtPick             ="10.00";
			String expasOnEntryDateBaseConcersationRatePick ="1";
			String expasOnEntryDateBaseAmountPick           ="10.00";
			String expasOnEntryDateLocConversationRatePick  ="0.07";
			String expasOnEntryDateAmtPick                  ="0.70";
				
			String expbalOnAdjstDateTransAmtPick            ="10.00";
			String expbalOnAdjstDateBasrConversionRatePick  ="1";
			String expbalOnAdjstDateBaseAmountPick          ="10.00";
			String expbalOnAdjstDateLocalConversionRatePick ="0.07";
			String expbalOnAdjstDateAmtPick                 ="0.70";

			String expadjustmentsAmount1Pick                ="5.25";
			String expadjustmentsAmount2Pick                ="5.25";
			String expadjustmentsAmount3Pick                ="0.37";
			String expadjustmentsAmount4Pick                ="5.25";
				
			String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
			String expexchangeGainLossForLocalCurrencyPick  ="0.00";


			System.out.println(" Right SIde Elements *****************************************************************************");

			System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
			System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
			System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
			System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
			System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
			System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
			System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
			System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
			System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

			System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
			System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
			System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
			System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
			System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

			System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
			System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
			System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
			System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

			System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
			System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		/*	boolean savingVoucher=checkVoucherSavingMessage(docno);*/

			String expMessage1 = "Vocher Saved Successfully";
			String expMessage2 = ": 1";
			String actMessage = checkValidationMessage(expMessage1);

			    
			    if (   actPartyName.equalsIgnoreCase(expPartyName)  && actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
						actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
						actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
					     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
						actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
				        
			    		
				        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
						actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
						actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick)  && 
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
						actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
						actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) && 
						actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
					     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo)&& 
					     
					     actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
							actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
							actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
							actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
							actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
							actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
							actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick)&&
							actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
							actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
							actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
							actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
							actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick))
				        
					
	    		{
	    			System.err.println(" Purchase VAT Saved With Adjustment Amount ");
	    			return true;
	    		}
	    		else
	    		{
	    			System.err.println("Purchase VAT Saved With Adjustment Amount ");
	    			return false;
	    		}

	   }
	   
	   
	   @FindBy(xpath="//*[@id='2026']/span")
	   private static WebElement debitNotesBtn;
	   
	   
	   @FindBy(xpath="//*[@id='id_header_4']")
	   private static WebElement debitNotesAccountTxt;
	   
	   
	   @FindBy(xpath="//*[@id='id_header_268435459']")
	   private static WebElement debitNotesDepartMentTxt;
	   
	   @FindBy(xpath="//*[@id='id_body_12']")
	   private static WebElement enter_Account;
	   
	   @FindBy(xpath="//*[@id='id_body_16']")
	   private static WebElement enter_AmountTxtt;
	   
	   
	   
	   public static boolean checkSavingDebitNotesVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
			Thread.sleep(2000);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsJournalsMenu));
			financialsTransactionsJournalsMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNotesBtn));
			debitNotesBtn.click();
			
			Thread.sleep(2000);
			checkDeleteLinkStatus();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			
			checkValidationMessage("Screen opened");
			
			Thread.sleep(3000);
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNotesAccountTxt));
			debitNotesAccountTxt.sendKeys("Bank");
			Thread.sleep(2000);
			debitNotesAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNotesDepartMentTxt));
			debitNotesDepartMentTxt.sendKeys("Dubai");
			Thread.sleep(2000);
			debitNotesDepartMentTxt.sendKeys(Keys.TAB);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Account));
			enter_Account.sendKeys("Vendor New Reference");		
			Thread.sleep(2000);
			enter_Account.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AmountTxtt));
			enter_AmountTxtt.click();
			enter_AmountTxtt.clear();
			enter_AmountTxtt.sendKeys("4.75");	
			enter_AmountTxtt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			
			

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
	    	String actPartyName = billRefPartyName.getText();
	    	String expPartyName = "Vendor New Reference (Vendor New Reference)";

	    	 
	    	System.out.println("Bill wise Screen vendor Name "  + actPartyName + "  Value Expected  " + expPartyName);
	    	   
	    	int Adjustbills=billRefAdjustBillsGrid.size();

	    	String actAdjustbills=Integer.toString(Adjustbills);

	    	String expAdjustbills="1";

	    	 
	    	System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);

	    	String expBillNewReference                      = "0.00";
	    	String expBillTransactionCurrency               = "4.75";
	    	String expBillBaseCurrency                      = "4.75";
	    	String expBillLocalCurrency                     = "0.33";
	    	String expBillBalanceNewRefAmount              = "0.00";

	    	String expbillRefAdjustAmountInTransCurency         = "0.00";
	    	String expbillRefBalanceAmountAdjustInTrnasCurrency = "4.75";



	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	    	String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
	    	String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
	    	String actBillBaseCurrency                           = billRefBaseCurrency.getText();
	    	String actBillLocalCurrency                          = localCurrencyDhs.getText();
	    	String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
	    	String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
	    	String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


	    	String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
	    	String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


	    	String expconversationRateBaseCurrencyRatePick  = "1";
	    	String expconversationRateLocalCurrencyRatePick = "0.0700000000";



	    		
	    	//To update in Adjsut Amount in Right side Pannel
	    		
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
			billRefGridFirstRowAdjustmentAmtTxt.click();
	    		
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	    	billRefPickIcon.click();

	    	//To Adjustment
	    	
	    	
	    	String expBillNewReferencePick                          = "0.00";
			String expBillTransactionCurrencyPick                   = "4.75";
			String expBillBaseCurrencyPick                          = "4.75"; 
			String expBillLocalCurrencyPick                         = "0.33";
			String expBillBalanceNewRefAmountPick                   = "0.00";

			String expbillRefAdjustAmountInTransCurencyPick         = "4.75";
			String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = "0.00";
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
			      
			String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
			String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
			String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
			String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
			String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
			String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
			String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


			   
			System.out.println("*********************************************************************************************************");

			System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);
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

			System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
			System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
			String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
			String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
			String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
			String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();

			String expgridOrginalAmtRow1      ="10.00";
			String expgridBalanceAmtRow1      ="4.75";
			String expgridAdjustmentAmtRow1   ="4.75";
			String expgridAdjustmentBillsRow1DocNo  = "NDT78:1";

			System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
			System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
			System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
			System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);



			String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
			String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
			String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

				
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

			String expbreakUpDetailsAccountPick             ="121-001";
			String expbreakUpDetailsDepartmentPick          ="DUBAI";
				
			String expasOnEntryDateTransAmtPick             ="10.00";
			String expasOnEntryDateBaseConcersationRatePick ="1";
			String expasOnEntryDateBaseAmountPick           ="10.00";
			String expasOnEntryDateLocConversationRatePick  ="0.07";
			String expasOnEntryDateAmtPick                  ="0.70";
				
			String expbalOnAdjstDateTransAmtPick            ="4.75";
			String expbalOnAdjstDateBasrConversionRatePick  ="1";
			String expbalOnAdjstDateBaseAmountPick          ="4.75";
			String expbalOnAdjstDateLocalConversionRatePick ="0.07";
			String expbalOnAdjstDateAmtPick                 ="0.33";

			String expadjustmentsAmount1Pick                ="0.00";
			String expadjustmentsAmount2Pick                ="0.00";
			String expadjustmentsAmount3Pick                ="0.00";
			String expadjustmentsAmount4Pick                ="0.00";
				
			String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
			String expexchangeGainLossForLocalCurrencyPick  ="0.00";
			
			
			
			int baseAmtListCount=baseAmtList.size();
	    	
	    	ArrayList<String >baseAmtListArray=new ArrayList<>();
	    	for (int i = 0; i < baseAmtListCount; i++) 
	    	{
	    		String data=baseAmtList.get(i).getText();
	    		baseAmtListArray.add(data);
	    	}
	    	
	    	String actbaseAmtList=baseAmtListArray.toString();
	    	String expbaseAmtList="[, NDT57:1 (Y0), 5.25, 5.25]";
	    	
	    	System.out.println(" baseAmtList Actual : "+actbaseAmtList);
	    	System.out.println(" baseAmtList Exp    : "+expbaseAmtList);
			


			System.out.println(" Right SIde Elements *****************************************************************************");

			System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
			System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
			System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
			System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
			System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
			System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
			System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
			System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
			System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

			System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
			System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
			System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
			System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
			System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

			System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
			System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
			System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
			System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

			System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
			System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		/*	boolean savingVoucher=checkVoucherSavingMessage(docno);*/

			String expMessage1 = "Vocher Saved Successfully";
			String expMessage2 = ": 1";
			String actMessage = checkValidationMessage(expMessage1);

			    
			    if (actPartyName.equalsIgnoreCase(expPartyName)  && actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
						actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
						actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
					     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
						actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
				        
			    		
				        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
						actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
						actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick)  && 
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
						actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
						actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) && 
						actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
					     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo)&& 
					     
					     actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
							actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
							actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
							actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
							actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
							actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
							actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick)&&
							actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
							actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
							actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
							actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
							actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick))
				        
					
	    		{
	    			System.err.println(" Debit Notes Saved With Adjustment Amount ");
	    			return true;
	    		}
	    		else
	    		{
	    			System.err.println("Debit Notes Saved With Adjustment Amount ");
	    			return false;
	    		}
	   }
	   
	   
	   @FindBy(xpath="//*[@id='2086']/span")
	   private static WebElement PDPNewReferenceBtn ;
	   
	   @FindBy(xpath="//input[@id='id_header_268435470']")
	   private static WebElement  PDRVATPlaceOfSupplyTXt;
	   
	   @FindBy(xpath="//*[@id='id_body_12_table_body']/tr/td[2]")
	   private static List<WebElement> accountListCount;
	   
	   
	   @FindBy(xpath="//input[@id='id_body_16777344']")
	   private static WebElement  enterPVPVATTaxcode;

	   
	   public static boolean checkSavingPDPNewReferenceVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
			cashAndBankMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDPNewReferenceBtn));
			PDPNewReferenceBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
				
				
			checkUserFriendlyMessage();
			
		    
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		    newCashBankAccountTxt.click();
			
			newCashBankAccountTxt.sendKeys(Keys.SPACE);
			
		    int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();
			
		    System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);
		    
			for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
			{
				String data		  = cashAndBAnkAccountList.get(i).getText();
				
				if(data.equalsIgnoreCase("Bank"))
				{
					cashAndBAnkAccountList.get(i).click();
					
					break;
				}
			}
			
			newCashBankAccountTxt.sendKeys(Keys.TAB);
			

			
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			
			departmentTxt.sendKeys(Keys.SPACE);
			
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Dubai"))
				{
					departmentListCount.get(i).click();
					
					break;
				}
			}
				
			 Thread.sleep(2000);
			departmentTxt.sendKeys(Keys.TAB);
			
			
		

		    Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys(Keys.SPACE);
			enter_AccountTxt.sendKeys("Vendor");
			Thread.sleep(2000);
			int accountCount=accountListCount.size();
			
			System.err.println(accountCount);
				
			for(int i=0 ; i < accountCount ;i++)
			{
				String data=accountListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Vendor B"))
				{
					accountListCount.get(i).click();
					
					break;
				}
			}
			Thread.sleep(2000);
			enter_AccountTxt.sendKeys(Keys.TAB);
				
				
				
				
				enter_Amount.click();
				enter_Amount.clear();
				enter_Amount.sendKeys("10");
				enter_Amount.sendKeys(Keys.TAB);
			
				
			    Thread.sleep(2000);
			    
			    
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				Thread.sleep(2000);
			
				String expMessage1 = "Voucher saved successfully";
				String expMessgae2 =": 1";
				String actMessage = checkValidationMessage(expMessage1);
				
				if (actMessage.contains(expMessage1)) {
					
					return true;
				} 
				else
				{
					return false;
				}    
	   }
	   
	   
	   @FindBy(xpath="//*[@id='id_header_4']")
	   private static WebElement  voucherHeaderCashORBank;
	   
	   public static boolean checkSavedPDPNewReferenceVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	   {
		   
		   
		   Thread.sleep(3000);
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
	   	    previousBtn.click();
	   	    
	          checkValidationMessage("Voucher loaded successfully");
	     		
	          Thread.sleep(3000);
	     		
	       	
	     		String actDocno               = documentNumberTxt.getAttribute("value");
	       	    String actCashOrBank 		 =	voucherHeaderCashORBank.getAttribute("value");
	           String actCurrency            = voucherHeaderCurrency.getAttribute("value");
	   		   String actDepartment          = departmentTxt.getAttribute("value");
	           String actExchangeRate        = voucherHeaderExchangeRate.getAttribute("value");
	           String actLocExchangeRate     = voucherHeaderLocalExchangeRate.getAttribute("value");
	           
	           
	           
	           
	           String actR1Account           = select1stRow_1stColumn.getText();
	           String actR1Amount             = select1stRow_2ndColumn.getText();
	           String actR1Reference         = select1stRow_3rdColumn.getText();
	           
	           
	         
	           
	           
	    
	           String expDocno               = "1";
	           String expCashORBank          ="Bank";
	   	    String expCurrency            = "INR";
	   		String expDepartment          = "DUBAI";
	           String expExchangeRate        = "1.0000000000";
	           String expLocExchangeRate     = "0.0700000000";

	   		String expR1Account           = "Vendor B";
	   		String expR1Amount           ="10.00";
	   		String expR1Reference         = "New Reference";
	   		
	   		
	   		
	           
	       	System.out.println("Entry Page Document Number    "+actDocno           +"  value Expected  "+expDocno);
	       	System.out.println("Entry Page cash Or Bank     "+actCashOrBank           +"  value Expected  "+expCashORBank);
			System.out.println("Entry Page Currency           "+actCurrency        +"  value Expected  "+expCurrency);
			System.out.println("Entry Page Department         "+actDepartment      +"  value Expected  "+expDepartment);
			System.out.println("Entry Page Exchange Rate      "+actExchangeRate    +"  value Expected  "+expExchangeRate);
			System.out.println("Entry Page Department         "+actLocExchangeRate +"  value Expected  "+expLocExchangeRate);

			System.out.println("Entry Page R1Account          "+actR1Account       +"  value Expected  "+expR1Account);
				
			
			
			
			
			
			if (actDocno.equalsIgnoreCase(expDocno) && actCashOrBank.equalsIgnoreCase(expCashORBank)   && actCurrency.equalsIgnoreCase(expCurrency) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) && 
					
					actR1Account.equalsIgnoreCase(expR1Account) && actR1Amount.equalsIgnoreCase(expR1Amount)  && actR1Reference.equalsIgnoreCase(expR1Reference))
			{
				
				System.out.println(" Test Pass: Data Saved Successfully ");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Data  not Saved Successfully ");
				return false;
			}
	           
	   }
	   
	   
	   public static boolean checkSavingPvVATAdjustingInPDPNewReference() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	   {
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		   financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesExpandBtn));
			purchasesExpandBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVoucherVATBtn));
			purchasesVoucherVATBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			    	
			checkValidationMessage("Screen opened");
			
			    	
			    	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
			vendorAccountTxt.sendKeys("Vendor B");
			Thread.sleep(3000);
			vendorAccountTxt.sendKeys(Keys.TAB);
			
			
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
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherVATPlaceOFSupply));
			purchaseVoucherVATPlaceOFSupply.click();
			purchaseVoucherVATPlaceOFSupply.sendKeys(Keys.END);
			purchaseVoucherVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
			purchaseVoucherVATPlaceOFSupply.sendKeys(Keys.SPACE);
			
			
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
			
			purchaseVoucherVATPlaceOFSupply.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxtt));
			jurisdictionTxtt.click();
			jurisdictionTxtt.sendKeys(Keys.END);
			jurisdictionTxtt.sendKeys(Keys.SHIFT,Keys.HOME);
			jurisdictionTxtt.sendKeys("DUBAI");
			Thread.sleep(2000);
			jurisdictionTxtt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	    	select1stRow_1stColumn.click();
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
	    	pvWareHouseTxt.sendKeys("Hyderabad");
	    	Thread.sleep(3000);
	    	pvWareHouseTxt.sendKeys(Keys.TAB);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	    	enter_ItemTxtt.sendKeys("STD RATE COGS ITEM");
	    	Thread.sleep(3000);
	    	enter_ItemTxtt.sendKeys(Keys.TAB);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_TaxCode));
	    	enter_TaxCode.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxtt));
	    	enter_PurchaseAccountTxtt.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
	    	select1stRow_9thColumn.click();
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
	    	enter_Quantity.click();
	    	enter_Quantity.clear();
	    	enter_Quantity.sendKeys("1");


	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
	    	select1stRow_11thColumn.click();
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	    	enter_Rate.click();
	    	enter_Rate.clear();
	    	enter_Rate.sendKeys("05");
	    	enter_Rate.sendKeys(Keys.TAB);
	    					
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	    	enter_Gross.click();
	    	enter_Gross.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	    	select1stRow_14thColumn.click();

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
	    	enter_PvVat.click();

	    	enter_PvVat.sendKeys(Keys.TAB);

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
	    	enter_PvTaxable.click();
	    	enter_PvTaxable.sendKeys(Keys.TAB);

	    	String docno=documentNumberTxt.getAttribute("value");

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	    	voucherSaveBtn.click();


	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
	    	String actPartyName = billRefPartyName.getText();
	    	String expPartyName = "Vendor B (033-002)";

	    	 
	    	System.out.println("Bill wise Screen vendor Name "  + actPartyName + "  Value Expected  " + expPartyName);
	    	   
	    	int Adjustbills=billRefAdjustBillsGrid.size();

	    	String actAdjustbills=Integer.toString(Adjustbills);

	    	String expAdjustbills="1";

	    	 
	    	System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);

	    	String expBillNewReference                      = "0.00";
	    	String expBillTransactionCurrency               = "5.25";
	    	String expBillBaseCurrency                      = "5.25";
	    	String expBillLocalCurrency                     = "0.37";
	    	String expBillBalanceNewRefAmount              = "0.00";

	    	String expbillRefAdjustAmountInTransCurency         = "0.00";
	    	String expbillRefBalanceAmountAdjustInTrnasCurrency = "5.25";



	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	    	String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
	    	String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
	    	String actBillBaseCurrency                           = billRefBaseCurrency.getText();
	    	String actBillLocalCurrency                          = localCurrencyDhs.getText();
	    	String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
	    	String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
	    	String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


	    	String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
	    	String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


	    	String expconversationRateBaseCurrencyRatePick  = "1";
	    	String expconversationRateLocalCurrencyRatePick = "0.07";



	    		
	    	//To update in Adjsut Amount in Right side Pannel
	    		
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
			billRefGridFirstRowAdjustmentAmtTxt.click();
	    		
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	    	billRefPickIcon.click();
	    	Thread.sleep(2000);
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
			billRefGridFirstRowAdjustmentAmtTxt.click();
	    		
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	    	billRefPickIcon.click();
	    	
	    	//To Adjustment
	    	
	    	
	    	String expBillNewReferencePick                          = "0.00";
			String expBillTransactionCurrencyPick                   = "5.25";
			String expBillBaseCurrencyPick                          = "5.25"; 
			String expBillLocalCurrencyPick                         = "0.37";
			String expBillBalanceNewRefAmountPick                   = "0.00";

			String expbillRefAdjustAmountInTransCurencyPick         = "5.25";
			String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = "0.00";
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
			      
			String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
			String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
			String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
			String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
			String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
			String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
			String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


			   
			System.out.println("*********************************************************************************************************");

			System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);
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

			System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
			System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
			String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
			String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
			String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
			String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();

			String expgridOrginalAmtRow1      ="10.00";
			String expgridBalanceAmtRow1      ="10.00";
			String expgridAdjustmentAmtRow1   ="5.25";
			String expgridAdjustmentBillsRow1DocNo  = "NDT79:1";

			System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
			System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
			System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
			System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);



			String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
			String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
			String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

				
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
				
			
			Thread.sleep(3000);
			String actadjustmentsAmount1Pick                 = adjustmentsAmount1.getText();
			String actadjustmentsAmount2Pick                 = adjustmentsAmount2.getText();
			String actadjustmentsAmount3Pick                 = adjustmentsAmount3.getText();
			String actadjustmentsAmount4Pick                 = adjustmentsAmount4.getText();

			String actexchangeGainLossForBaseCurrencyPick    = exchangeGainLossForBaseCurrency.getText();	
			String actexchangeGainLossForLocalCurrencyPick   = exchangeGainLossForLocalCurrency.getText();

			String expbreakUpDetailsAccountPick             ="121-001";
			String expbreakUpDetailsDepartmentPick          ="DUBAI";
				
			String expasOnEntryDateTransAmtPick             ="10.00";
			String expasOnEntryDateBaseConcersationRatePick ="1";
			String expasOnEntryDateBaseAmountPick           ="10.00";
			String expasOnEntryDateLocConversationRatePick  ="0.07";
			String expasOnEntryDateAmtPick                  ="0.70";
				
			String expbalOnAdjstDateTransAmtPick            ="10.00";
			String expbalOnAdjstDateBasrConversionRatePick  ="1";
			String expbalOnAdjstDateBaseAmountPick          ="10.00";
			String expbalOnAdjstDateLocalConversionRatePick ="0.07";
			String expbalOnAdjstDateAmtPick                 ="0.70";

			String expadjustmentsAmount1Pick                ="5.25";
			String expadjustmentsAmount2Pick                ="5.25";
			String expadjustmentsAmount3Pick                ="0.37";
			String expadjustmentsAmount4Pick                ="5.25";
				
			String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
			String expexchangeGainLossForLocalCurrencyPick  ="0.00";


			System.out.println(" Right SIde Elements *****************************************************************************");

			System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
			System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
			System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
			System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
			System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
			System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
			System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
			System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
			System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

			System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
			System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
			System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
			System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
			System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

			System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
			System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
			System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
			System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

			System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
			System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		/*	boolean savingVoucher=checkVoucherSavingMessage(docno);*/

			String expMessage1 = "Voucher Saved Successfully";
			String expMessage2 = ": 1";
			String actMessage = checkValidationMessage(expMessage1);

			    
			    if (   actPartyName.equalsIgnoreCase(expPartyName)  && actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
						actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
						actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
					     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
						actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
				        
			    		
				        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
						actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
						actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick)  && 
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
						actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
						actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) && 
						actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
					     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo)&& 
					     
					     actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
							actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
							actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
							actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
							actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
							actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
							actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick)&&
							actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
							actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
							actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
							actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
							actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick))
				        
					
	    		{
	    			System.err.println(" Purchase VAT Saved With Adjustment Amount ");
	    			return true;
	    		}
	    		else
	    		{
	    			System.err.println("Purchase VAT Saved With Adjustment Amount ");
	    			return false;
	    		}

	   }
	   
	   
	   @FindBy(xpath="//*[@id='2087']/span")
	   private static WebElement PDRNewReferenceBtn;
	   
	   public static boolean checkSavingPDRNewReferenceVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	   {
		   Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
			cashAndBankMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRNewReferenceBtn));
			PDRNewReferenceBtn.click();
			
			Thread.sleep(2000);
			
			checkDeleteLinkStatus();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
				
				
			checkUserFriendlyMessage();
			
		    
			Thread.sleep(2000);
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		    newCashBankAccountTxt.click();
			
			newCashBankAccountTxt.sendKeys(Keys.SPACE);
			
		    int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();
			
		    System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);
		    
			for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
			{
				String data		  = cashAndBAnkAccountList.get(i).getText();
				
				if(data.equalsIgnoreCase("Bank"))
				{
					cashAndBAnkAccountList.get(i).click();
					
					break;
				}
			}
			
			newCashBankAccountTxt.sendKeys(Keys.TAB);
			

			
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			
			departmentTxt.sendKeys(Keys.SPACE);
			
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Dubai"))
				{
					departmentListCount.get(i).click();
					
					break;
				}
			}
				
			 Thread.sleep(2000);
			departmentTxt.sendKeys(Keys.TAB);
			
	
		    Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys(Keys.SPACE);
			enter_AccountTxt.sendKeys("Vendor");
			Thread.sleep(2000);
			int accountCount=accountListCount.size();
			
			System.err.println(accountCount);
				
			for(int i=0 ; i < accountCount ;i++)
			{
				String data=accountListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Vendor Full Adjustment"))
				{
					accountListCount.get(i).click();
					
					break;
				}
			}
			Thread.sleep(2000);
			enter_AccountTxt.sendKeys(Keys.TAB);
				
						
				enter_Amount.click();
				enter_Amount.clear();
				enter_Amount.sendKeys("10");
				enter_Amount.sendKeys(Keys.TAB);
			
				
			    Thread.sleep(2000);
			    
			    
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				Thread.sleep(2000);
			
				String expMessage1 = "Voucher saved successfully";
				String expMessgae2 =": 1";
				String actMessage = checkValidationMessage(expMessage1);
				
				if (actMessage.contains(expMessage1)) {
					
					return true;
				} 
				else
				{
					return false;
				}    
			
	   }
	   
	   public static boolean checkSavedPDRNewReferenceVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	   {
		   
		   
		   Thread.sleep(3000);
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
	   	    previousBtn.click();
	   	    
	          checkValidationMessage("Voucher loaded successfully");
	     		
	          Thread.sleep(3000);
	     		
	       	
	     		String actDocno               = documentNumberTxt.getAttribute("value");
	       	    String actCashOrBank 		 =	voucherHeaderCashORBank.getAttribute("value");
	           String actCurrency            = voucherHeaderCurrency.getAttribute("value");
	   		   String actDepartment          = departmentTxt.getAttribute("value");
	           String actExchangeRate        = voucherHeaderExchangeRate.getAttribute("value");
	           String actLocExchangeRate     = voucherHeaderLocalExchangeRate.getAttribute("value");
	           
	           
	           
	           
	           String actR1Account           = select1stRow_1stColumn.getText();
	           String actR1Amount             = select1stRow_2ndColumn.getText();
	           String actR1Reference         = select1stRow_3rdColumn.getText();
	           
	           
	         
	           
	           
	    
	           String expDocno               = "1";
	           String expCashORBank          ="Bank";
	   	    String expCurrency            = "INR";
	   		String expDepartment          = "DUBAI";
	           String expExchangeRate        = "1.0000000000";
	           String expLocExchangeRate     = "0.0700000000";

	   		String expR1Account           = "Vendor Full Adjustment";
	   		String expR1Amount           ="10.00";
	   		String expR1Reference         = "New Reference";
	   		
	   		
	   		
	           
	       	System.out.println("Entry Page Document Number    "+actDocno           +"  value Expected  "+expDocno);
	       	System.out.println("Entry Page cash Or Bank     "+actCashOrBank           +"  value Expected  "+expCashORBank);
			System.out.println("Entry Page Currency           "+actCurrency        +"  value Expected  "+expCurrency);
			System.out.println("Entry Page Department         "+actDepartment      +"  value Expected  "+expDepartment);
			System.out.println("Entry Page Exchange Rate      "+actExchangeRate    +"  value Expected  "+expExchangeRate);
			System.out.println("Entry Page Department         "+actLocExchangeRate +"  value Expected  "+expLocExchangeRate);

			System.out.println("Entry Page R1Account          "+actR1Account       +"  value Expected  "+expR1Account);
				
			
			
			
			
			
			if (actDocno.equalsIgnoreCase(expDocno) && actCashOrBank.equalsIgnoreCase(expCashORBank)   && actCurrency.equalsIgnoreCase(expCurrency) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) && 
					
					actR1Account.equalsIgnoreCase(expR1Account) && actR1Amount.equalsIgnoreCase(expR1Amount)  && actR1Reference.equalsIgnoreCase(expR1Reference))
			{
				
				System.out.println(" Test Pass: Data Saved Successfully ");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Data  not Saved Successfully ");
				return false;
			}
	           
	   }
	   
	  public static boolean checkSavingDebitNotesVoucherWithAdjustingInPDRNewReference() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	  {
		  Thread.sleep(2000);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsJournalsMenu));
			financialsTransactionsJournalsMenu.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNotesBtn));
			debitNotesBtn.click();
			
			Thread.sleep(3000);
			
			checkDeleteLinkStatus();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			
			checkValidationMessage("Screen opened");
			
			Thread.sleep(3000);
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNotesAccountTxt));
			debitNotesAccountTxt.sendKeys("Vendor Full Adjustment");
			Thread.sleep(2000);
			debitNotesAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNotesDepartMentTxt));
			debitNotesDepartMentTxt.sendKeys("Dubai");
			Thread.sleep(2000);
			debitNotesDepartMentTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Account));
			enter_Account.sendKeys("Bank");		
			Thread.sleep(2000);
			enter_Account.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AmountTxtt));
			enter_AmountTxtt.click();
			enter_AmountTxtt.clear();
			enter_AmountTxtt.sendKeys("10");	
			enter_AmountTxtt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			Thread.sleep(2000);
			
			
			

	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
	    	String actPartyName = billRefPartyName.getText();
	    	String expPartyName = "Vendor Full Adjustment (Vendor Full Adjustment)";

	    	 
	    	System.out.println("Bill wise Screen vendor Name "  + actPartyName + "  Value Expected  " + expPartyName);
	    	   
	    	int Adjustbills=billRefAdjustBillsGrid.size();

	    	String actAdjustbills=Integer.toString(Adjustbills);

	    	String expAdjustbills="1";

	    	 
	    	System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);

	    	String expBillNewReference                      = "0.00";
	    	String expBillTransactionCurrency               = "10.00";
	    	String expBillBaseCurrency                      = "10.00";
	    	String expBillLocalCurrency                     = "0.70";
	    	String expBillBalanceNewRefAmount              = "0.00";

	    	String expbillRefAdjustAmountInTransCurency         = "0.00";
	    	String expbillRefBalanceAmountAdjustInTrnasCurrency = "10.00";



	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	    	String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
	    	String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
	    	String actBillBaseCurrency                           = billRefBaseCurrency.getText();
	    	String actBillLocalCurrency                          = localCurrencyDhs.getText();
	    	String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
	    	String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
	    	String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


	    	String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
	    	String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


	    	String expconversationRateBaseCurrencyRatePick  = "1";
	    	String expconversationRateLocalCurrencyRatePick = "0.0700000000";



	    		
	    	//To update in Adjsut Amount in Right side Pannel
	    		
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
			billRefGridFirstRowAdjustmentAmtTxt.click();
	    		
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	    	billRefPickIcon.click();

	    	//To Adjustment
	    	
	    	
	    	String expBillNewReferencePick                          = "0.00";
			String expBillTransactionCurrencyPick                   = "10";
			String expBillBaseCurrencyPick                          = "10"; 
			String expBillLocalCurrencyPick                         = "0.70";
			String expBillBalanceNewRefAmountPick                   = "0.00";

			String expbillRefAdjustAmountInTransCurencyPick         = "10.00";
			String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = "0.00";
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
			      
			String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
			String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
			String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
			String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
			String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
			String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
			String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


			   
			System.out.println("*********************************************************************************************************");

			System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);
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

			System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
			System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);


			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
			String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
			String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
			String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
			String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();

			String expgridOrginalAmtRow1      ="10.00";
			String expgridBalanceAmtRow1      ="10.00";
			String expgridAdjustmentAmtRow1   ="10.00";
			String expgridAdjustmentBillsRow1DocNo  = "NDT80:1";

			System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
			System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
			System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
			System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);



			String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
			String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
			String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

				
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

			String expbreakUpDetailsAccountPick             ="121-001";
			String expbreakUpDetailsDepartmentPick          ="DUBAI";
				
			String expasOnEntryDateTransAmtPick             ="10.00";
			String expasOnEntryDateBaseConcersationRatePick ="1";
			String expasOnEntryDateBaseAmountPick           ="10.00";
			String expasOnEntryDateLocConversationRatePick  ="0.07";
			String expasOnEntryDateAmtPick                  ="0.70";
				
			String expbalOnAdjstDateTransAmtPick            ="10.00";
			String expbalOnAdjstDateBasrConversionRatePick  ="1";
			String expbalOnAdjstDateBaseAmountPick          ="10.00";
			String expbalOnAdjstDateLocalConversionRatePick ="0.07";
			String expbalOnAdjstDateAmtPick                 ="0.70";

			String expadjustmentsAmount1Pick                ="0.00";
			String expadjustmentsAmount2Pick                ="0.00";
			String expadjustmentsAmount3Pick                ="0.00";
			String expadjustmentsAmount4Pick                ="0.00";
				
			String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
			String expexchangeGainLossForLocalCurrencyPick  ="0.00";
			
			
			/*
			int baseAmtListCount=baseAmtList.size();
	    	
	    	ArrayList<String >baseAmtListArray=new ArrayList<>();
	    	for (int i = 0; i < baseAmtListCount; i++) 
	    	{
	    		String data=baseAmtList.get(i).getText();
	    		baseAmtListArray.add(data);
	    	}
	    	
	    	String actbaseAmtList=baseAmtListArray.toString();
	    	String expbaseAmtList="[, NDT57:1 (Y0), 5.25, 5.25]";
	    	
	    	System.out.println(" baseAmtList Actual : "+actbaseAmtList);
	    	System.out.println(" baseAmtList Exp    : "+expbaseAmtList);*/
			


			System.out.println(" Right SIde Elements *****************************************************************************");

			System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
			System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
			System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
			System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
			System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
			System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
			System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
			System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
			System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

			System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
			System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
			System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
			System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
			System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

			System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
			System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
			System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
			System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

			System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
			System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);



			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		/*	boolean savingVoucher=checkVoucherSavingMessage(docno);*/

			String expMessage1 = "Vocher Saved Successfully";
			String expMessage2 = ": 1";
			String actMessage = checkValidationMessage(expMessage1);

			    
			    if (actPartyName.equalsIgnoreCase(expPartyName)  && actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
						actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
						actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
					     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
						actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
				        
			    		
				        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
						actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
						actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick)  && 
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
						actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
						actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) && 
						actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
					     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo)&& 
					     
					     actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
							actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
							actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
							actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
							actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
							actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
							actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick)&&
							actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
							actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
							actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
							actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
							actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick))
				        
					
	    		{
	    			System.err.println(" Debit Notes Saved With Adjustment Amount ");
	    			return true;
	    		}
	    		else
	    		{
	    			System.err.println("Debit Notes Saved With Adjustment Amount ");
	    			return false;
	    		}
	  }
	  
	  
	  public static boolean checkAmountAdjustingGridInBillReferenceScrren() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		  Thread.sleep(2000);

				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
				financialsMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
				financialsTransactionMenu.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsJournalsMenu));
				financialsTransactionsJournalsMenu.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNotesBtn));
				debitNotesBtn.click();
				
				Thread.sleep(3000);
				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
				newBtn.click();
				
				
				checkValidationMessage("Screen opened");
				
				Thread.sleep(3000);
		
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNotesAccountTxt));
				debitNotesAccountTxt.sendKeys("Vendor Full Adjustment");
				Thread.sleep(2000);
				debitNotesAccountTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitNotesDepartMentTxt));
				debitNotesDepartMentTxt.sendKeys("Dubai");
				Thread.sleep(2000);
				debitNotesDepartMentTxt.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
				select1stRow_1stColumn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Account));
				enter_Account.sendKeys("Bank");		
				Thread.sleep(2000);
				enter_Account.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AmountTxtt));
				enter_AmountTxtt.click();
				enter_AmountTxtt.clear();
				enter_AmountTxtt.sendKeys("10");	
				enter_AmountTxtt.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				Thread.sleep(2000);
				
		
		    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		    	String actPartyName = billRefPartyName.getText();
		    	String expPartyName = "Vendor Full Adjustment (Vendor Full Adjustment)";

		    	 
		    	System.out.println("Bill wise Screen vendor Name "  + actPartyName + "  Value Expected  " + expPartyName);
		    	   
		    	int Adjustbills=billRefAdjustBillsGrid.size();

		    	System.out.println("Adjustbills  :  "+Adjustbills+"");
		    	
		    	String actAdjustbills=Integer.toString(Adjustbills);

		    	String expAdjustbills="0";
		    	
		    	Thread.sleep(2000);
		    	 
		    	System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);

		    	if (actAdjustbills.equalsIgnoreCase(expAdjustbills) )
		    	{
		    		System.out.println(" Test PasS: Vouchers not displyed after  Total Consumed ");
		    		return true;
					
				} 
		    	else 
		    	{
		    		System.out.println(" Test Fail: Vouchers not displyed after  Total Consumed ");
					return false;
				}
	  }
	  
	  @FindBy(xpath="//*[@id='2088']/span")
	  private static WebElement pettyCashNewRefrenceBtn;
	  
	  
	  public static boolean checkSavingPettyCashNewReference() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	  {
		  Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
			cashAndBankMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pettyCashNewRefrenceBtn));
			pettyCashNewRefrenceBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
				
				
			checkUserFriendlyMessage();
			
		    
			Thread.sleep(2000);
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		    newCashBankAccountTxt.click();
			
			newCashBankAccountTxt.sendKeys(Keys.SPACE);
			
		    int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();
			
		    System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);
		    
			for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
			{
				String data		  = cashAndBAnkAccountList.get(i).getText();
				
				if(data.equalsIgnoreCase("Bank"))
				{
					cashAndBAnkAccountList.get(i).click();
					
					break;
				}
			}
			
			newCashBankAccountTxt.sendKeys(Keys.TAB);
			

			
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			
			departmentTxt.sendKeys(Keys.SPACE);
			
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Dubai"))
				{
					departmentListCount.get(i).click();
					
					break;
				}
			}
				
			 Thread.sleep(2000);
			departmentTxt.sendKeys(Keys.TAB);
		
		    Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			select1stRow_1stColumn.click();
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys(Keys.SPACE);
			enter_AccountTxt.sendKeys("Vendor");
			Thread.sleep(2000);
			int accountCount=accountListCount.size();
			
			System.err.println(accountCount);
				
			for(int i=0 ; i < accountCount ;i++)
			{
				String data=accountListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("Vendor Semi Adjustment"))
				{
					accountListCount.get(i).click();
					
					break;
				}
			}
			Thread.sleep(2000);
			enter_AccountTxt.sendKeys(Keys.TAB);
				
				
				
				
				enter_Amount.click();
				enter_Amount.clear();
				enter_Amount.sendKeys("10");
				enter_Amount.sendKeys(Keys.TAB);
			
				
			    Thread.sleep(2000);
			    
			    
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				Thread.sleep(2000);
			
				String expMessage1 = "Voucher saved successfully";
				String expMessgae2 =": 1";
				String actMessage = checkValidationMessage(expMessage1);
				
				if (actMessage.contains(expMessage1)) {
					
					return true;
				} 
				else
				{
					return false;
				}    
	  }
	   
	  public static boolean checkSavedPettyCashNewReferenceVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	  {
		  Thread.sleep(3000);
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
	   	    previousBtn.click();
	   	    
	          checkValidationMessage("Voucher loaded successfully");
	     		
	          Thread.sleep(3000);
	     		
	       	
	     		String actDocno               = documentNumberTxt.getAttribute("value");
	       	    String actCashOrBank 		 =	voucherHeaderCashORBank.getAttribute("value");
	           String actCurrency            = voucherHeaderCurrency.getAttribute("value");
	   		   String actDepartment          = departmentTxt.getAttribute("value");
	           String actExchangeRate        = voucherHeaderExchangeRate.getAttribute("value");
	           String actLocExchangeRate     = voucherHeaderLocalExchangeRate.getAttribute("value");
	           
	           
	           
	           
	           String actR1Account           = select1stRow_1stColumn.getText();
	           String actR1Amount             = select1stRow_2ndColumn.getText();
	           String actR1Reference         = select1stRow_3rdColumn.getText();
	           
	           
	         
	         
	           String expDocno               = "1";
	           String expCashORBank          ="Bank";
	   	    String expCurrency            = "INR";
	   		String expDepartment          = "DUBAI";
	           String expExchangeRate        = "1.0000000000";
	           String expLocExchangeRate     = "0.0700000000";

	   		String expR1Account           = "Vendor Semi Adjustment";
	   		String expR1Amount           ="10.00";
	   		String expR1Reference         = "New Reference";
	   		
	   		
	   		
	           
	       	System.out.println("Entry Page Document Number    "+actDocno           +"  value Expected  "+expDocno);
	       	System.out.println("Entry Page cash Or Bank     "+actCashOrBank           +"  value Expected  "+expCashORBank);
			System.out.println("Entry Page Currency           "+actCurrency        +"  value Expected  "+expCurrency);
			System.out.println("Entry Page Department         "+actDepartment      +"  value Expected  "+expDepartment);
			System.out.println("Entry Page Exchange Rate      "+actExchangeRate    +"  value Expected  "+expExchangeRate);
			System.out.println("Entry Page Department         "+actLocExchangeRate +"  value Expected  "+expLocExchangeRate);

			System.out.println("Entry Page R1Account          "+actR1Account       +"  value Expected  "+expR1Account);
				
			
			
			
			
			
			if (actDocno.equalsIgnoreCase(expDocno) && actCashOrBank.equalsIgnoreCase(expCashORBank)   && actCurrency.equalsIgnoreCase(expCurrency) &&actDepartment.equalsIgnoreCase(expDepartment) && 
					
					actExchangeRate.equalsIgnoreCase(expExchangeRate) && actLocExchangeRate.equalsIgnoreCase(expLocExchangeRate) && 
					
					actR1Account.equalsIgnoreCase(expR1Account) && actR1Amount.equalsIgnoreCase(expR1Amount)  && actR1Reference.equalsIgnoreCase(expR1Reference))
			{
				
				System.out.println(" Test Pass: Data Saved Successfully ");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Data  not Saved Successfully ");
				return false;
			}
	  }
	  
	  public static boolean checkSavingReceiptsVatWithAdjustingInPettyCashNewReference() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	  {
		  
		  
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		    financialsMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
			cashAndBankMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(recepitsVATVoucher));
			recepitsVATVoucher.click();
			
			Thread.sleep(2000);
			
			checkDeleteLinkStatus();
			
			Thread.sleep(2000);
					
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();

			Thread.sleep(1999);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		    newCashBankAccountTxt.click();
			newCashBankAccountTxt.sendKeys(Keys.SPACE);
			
		   int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();

		   System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);
		   
		  for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		  {
			String data		  = cashAndBAnkAccountList.get(i).getText();
			
			if(data.equalsIgnoreCase("Bank"))
				{
				cashAndBAnkAccountList.get(i).click();
					
					break;
				}
			}

		   newCashBankAccountTxt.sendKeys(Keys.TAB);

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
				
				if(data.equalsIgnoreCase("DUBAI"))
				{
					departmentListCount.get(i).click();
					break;
				}
			}
				
			Thread.sleep(1000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeofSupplyTxt));
			placeofSupplyTxt.click();
			placeofSupplyTxt.sendKeys(Keys.SPACE);
			
		   int placeOfSupplyListCount=placeofSupplyList.size();
			
			System.err.println(placeOfSupplyListCount);
				
			for(int i=0 ; i < placeOfSupplyListCount ;i++)
			{
				String data=placeofSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeofSupplyList.get(i).click();
					
					break;
				}
			}
				
			placeofSupplyTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
			jurisdictionTxt.click();
			jurisdictionTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			jurisdictionTxt.sendKeys(Keys.SPACE);
			
		   int jurisdictionListCount=jurisdictionList.size();
			
			System.err.println(jurisdictionListCount);
				
			for(int i=0 ; i < jurisdictionListCount ;i++)
			{
				String data=jurisdictionList.get(i).getText();
				
				if(data.equalsIgnoreCase("DUBAI"))
			{
				jurisdictionList.get(i).click();
				
				break;
			}
		}
			
		jurisdictionTxt.sendKeys(Keys.TAB);

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
			
			
			if(data.equalsIgnoreCase("Vendor Semi Adjustment"))
			{
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
				bodyAccountListInGrid.get(i).click();
				
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
		enter_AccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterReceiptsVATTaxCode));	
		enterReceiptsVATTaxCode.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys("5");
		enter_Amount.sendKeys(Keys.TAB);
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
		voucherSaveBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));

		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Vendor Semi Adjustment (Vendor Semi Adjustment)";
		 
		 
		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
		  
		int Adjustbills=billRefAdjustBillsGridList.size();

		String actAdjustbills=Integer.toString(Adjustbills);

		String expAdjustbills="1";
		 
		System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
				
		    

		System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);

		String expBillNewReference                      = "0.00";
		String expBillTransactionCurrency               = "5.00";
		String expBillBaseCurrency                      = "5.00";
		String expBillLocalCurrency                     = "0.35";
		String expBillBalanceNewRefAmount              = "0.00";

		String expbillRefAdjustAmountInTransCurency         = "0.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrency = "5.00";



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
		String actBillBaseCurrency                           = billRefBaseCurrency.getText();
		String actBillLocalCurrency                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


		String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
		String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


		String expconversationRateBaseCurrencyRatePick  = "1";
		String expconversationRateLocalCurrencyRatePick = "0.07";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
		billRefGridFirstRowAdjustmentAmtTxt.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
		billRefGridFirstRowAdjustmentAmtTxt.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();


		String expBillNewReferencePick                          = "0.00";
		String expBillTransactionCurrencyPick                   = "5";
		String expBillBaseCurrencyPick                          = "5"; 
		String expBillLocalCurrencyPick                         = "0.35";
		String expBillBalanceNewRefAmountPick                   = "0.00";

		String expbillRefAdjustAmountInTransCurencyPick         = "5.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = "0.00";
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		      
		String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
		String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
		String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


		   
		System.out.println("*********************************************************************************************************");

		System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);
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

		System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
		System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
		String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
		String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
		String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
		String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();

		String expgridOrginalAmtRow1      ="10.00";
		String expgridBalanceAmtRow1      ="10.00";
		String expgridAdjustmentAmtRow1   ="5.00";
		String expgridAdjustmentBillsRow1DocNo  = "NDT81:1";

		System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
		System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
		System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
		System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);



		String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
		String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
		String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

			
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

		String expbreakUpDetailsAccountPick             ="121-001";
		/*String expbreakUpDetailsItemPick                ="STD RATE COGS ITEM"; */    
		String expbreakUpDetailsDepartmentPick          ="DUBAI";
			
		String expasOnEntryDateTransAmtPick             ="10.00";
		String expasOnEntryDateBaseConcersationRatePick ="1";
		String expasOnEntryDateBaseAmountPick           ="10.00";
		String expasOnEntryDateLocConversationRatePick  ="0.07";
		String expasOnEntryDateAmtPick                  ="0.70";
			
		String expbalOnAdjstDateTransAmtPick            ="10.00";
		String expbalOnAdjstDateBasrConversionRatePick  ="1";
		String expbalOnAdjstDateBaseAmountPick          ="10.00";
		String expbalOnAdjstDateLocalConversionRatePick ="0.07";
		String expbalOnAdjstDateAmtPick                 ="0.70";

		String expadjustmentsAmount1Pick                ="5.00";
		String expadjustmentsAmount2Pick                ="5.00";
		String expadjustmentsAmount3Pick                ="0.35";
		String expadjustmentsAmount4Pick                ="5.00";
			
		String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
		String expexchangeGainLossForLocalCurrencyPick  ="0.00";


		System.out.println(" Right SIde Elements *****************************************************************************");

		System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
		System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
		System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
		System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
		System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
		System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
		System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
		System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
		System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

		System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
		System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
		System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
		System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
		System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

		System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
		System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
		System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
		System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

		System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
		System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		

		boolean savingVoucher=checkVoucherSavingMessage(docno);


		    
		    if (   actPartyName.equalsIgnoreCase(expPartyName)  && actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
					actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
					actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
				     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
					actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
			        
		    		
			        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
					actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
					actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick)  && 
					actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
					actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
					actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) && 
					actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
				     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo)&& 
				     
				     actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
						actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
						actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
						actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
						actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
						actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick)&&
						actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
						actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
						actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
						actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
						actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick))
			        
				{
					System.err.println("Recepits VAT Voucher Saved With Semi Adjustment  ");
					return true;
				}
				else
				{
					System.err.println("Recepits VAT Voucher Saved With Semi Adjustment ");
					return false;
				}

	  }
	  
	  
	  
	  @FindBy(xpath="//*[@id='2089']/span")
	  private static WebElement nonJVNewReferenceBtn;
	  
	  


@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
private static WebElement  select2ndRow_1stColumn;

@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
private static WebElement  select2ndRow_2ndColumn;

@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
private static WebElement  select2ndRow_3rdColumn;

@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
private static WebElement  select2ndRow_4thColumn;
	  
	  public static boolean checkSavingNonJVNewReferenceVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {


			Thread.sleep(2000);

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsJournalsMenu));
			financialsTransactionsJournalsMenu.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nonJVNewReferenceBtn));
			nonJVNewReferenceBtn.click();
			
			Thread.sleep(2000);
			checkDeleteLinkStatus();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			checkValidationMessage("Screen opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			 
			String docno=documentNumberTxt.getAttribute("value");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.SPACE);
			 
			int OpeningBalDepartmentListCount=openingBalDepartmentList.size();
			
			for (int i = 0; i < OpeningBalDepartmentListCount; i++) 
			{
				String data=openingBalDepartmentList.get(i).getText();
				
				if (data.equalsIgnoreCase("Dubai"))
				{
					openingBalDepartmentList.get(i).click();
					
					break;
				}
		 	 }
		   
			 departmentTxt.sendKeys(Keys.TAB);
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
			 select1stRow_1stColumn.click();
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			 enter_AccountTxt.click();
			 enter_AccountTxt.sendKeys("Customer");
			 
			 int accountCount=openingBalAccountListInGrid.size();
				
			System.err.println(accountCount);
				
			for(int i=0 ; i < accountCount ;i++)
			{
				String data=openingBalAccountListInGrid.get(i).getText();
				
				if(data.equalsIgnoreCase("Customer Semi Adjustment"))
				{
					openingBalAccountListInGrid.get(i).click();
					
					break;
				}
			}
			
			enter_AccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));
			enter_DebitTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditTxt));
			enter_CreditTxt.sendKeys("10");
			enter_CreditTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Remarks));
			enter_Remarks.click();
			enter_Remarks.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
			 select2ndRow_1stColumn.click();
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			 enter_AccountTxt.click();
			 enter_AccountTxt.sendKeys("Customer");
			 
			
				
			System.err.println(accountCount);
				
			for(int i=0 ; i < accountCount ;i++)
			{
				String data=openingBalAccountListInGrid.get(i).getText();
				
				if(data.equalsIgnoreCase("Customer Semi Adjustment"))
				{
					openingBalAccountListInGrid.get(i).click();
					
					break;
				}
			}
			
			enter_AccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_DebitTxt));
			enter_DebitTxt.sendKeys("10");
			enter_DebitTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_CreditTxt));
			enter_CreditTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalancesSaveBtn));
			openingBalancesSaveBtn.click();
			
			String expMessage1 = "Voucher saved successfully";
			String expMessgae2 =": 1";
			String actMessage = checkValidationMessage(expMessage1);
			
			if (actMessage.contains(expMessage1)) {
				
				return true;
			} 
			else
			{
				return false;
			}
	  }
	  
	  public static boolean checkSavedNonJVNewReferenceVoucher() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	  {
		  Thread.sleep(2000);
		   	
	   	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previousBtn));
	   	    previousBtn.click();
	   	    
	           boolean loading=checkLoadingMessage();
	     		
	     		System.out.println("VoucherLoadingMessage  : "+loading+" Value Expected : "+"true");
	       	
	     		String actDocno               = documentNumberTxt.getAttribute("value");
	   		   String actDepartment          = departmentTxt.getAttribute("value");
	          
	           String actR1Account           = select1stRow_1stColumn.getText();
	           String actR1Credit             = select1stRow_3rdColumn.getText();
	           String actR1Reference         = select1stRow_4thColumn.getText();
	           
	           
	           String actR2Account           = select2ndRow_1stColumn.getText();
	           String actR2Debit             = select2ndRow_2ndColumn.getText();
	           String actR2Reference         = select2ndRow_4thColumn.getText();
	           
	           
	           
	           
	           String actFooterCreditAmt    =vocFooterCreditAmount.getText();
	           String actVoucherDebitAmt   = vocFooterdebitAmount.getText();
	           
	           
	    
	           String expDocno               = "1";
	   	    String expCurrency            = "INR";
	   		String expDepartment          = "DUBAI";
	           String expExchangeRate        = "1.0000000000";
	           String expLocExchangeRate     = "0.1100000000";

	   		String expR1Account           = "Customer Semi Adjustment";
	   		String expR1Credit            ="10.00";
	   		String expR1Reference         = "New Reference";
	   		
	   		
	   		String expR2Account           = "Customer Semi Adjustment";
	   		String expR2Debit            ="10.00";
	   		String expR2Reference         = "New Reference";
	   		
	   		
	   		String expFooterCreditAmt     = "10.00";
	           String expVoucherDebitAmt     = "10.00";
	           
	           
	       	System.out.println("Entry Page Document Number    "+actDocno           +"  value Expected  "+expDocno);
			System.out.println("Entry Page Department         "+actDepartment      +"  value Expected  "+expDepartment);
		

			System.out.println("Entry Page R1Account          "+actR1Account       +"  value Expected  "+expR1Account);
			System.out.println("Entry Page R1Account          "+actR1Credit       +"  value Expected  "+expR1Credit);
			System.out.println("Entry Page R1Account          "+actR1Reference       +"  value Expected  "+expR1Reference);
				
			
			
			System.out.println("Entry Page R1Account          "+actR2Account       +"  value Expected  "+expR1Account);
			System.out.println("Entry Page R1Account          "+actR2Debit     +"  value Expected  "+expR2Debit);
			System.out.println("Entry Page R1Account          "+actR2Reference       +"  value Expected  "+expR2Reference);
			
			System.out.println("Entry Page Debit Amount       "+actVoucherDebitAmt +"  value Expected  "+expVoucherDebitAmt);
			System.out.println("Entry Page Credit Amount      "+actFooterCreditAmt +"  value Expected  "+expFooterCreditAmt);
			
			
			
			if (actDocno.equalsIgnoreCase(expDocno)&& actDepartment.equalsIgnoreCase(expDepartment) && 
					
					
					actR1Account.equalsIgnoreCase(expR1Account) && actR1Credit.equalsIgnoreCase(expR1Credit) && actR1Reference.equalsIgnoreCase(expR1Reference)
					&& actR2Account.equalsIgnoreCase(expR2Account) && actR2Debit.equalsIgnoreCase(expR2Debit) && actR2Reference.equalsIgnoreCase(expR2Reference) &&
					
					
					actFooterCreditAmt.equalsIgnoreCase(expFooterCreditAmt) && actVoucherDebitAmt.equalsIgnoreCase(expVoucherDebitAmt) )
			{
				
				System.out.println(" Test Pass: Data Saved Successfully ");
				return true;
			}
			else 
			{
				System.out.println(" Test Fail: Data  not Saved Successfully ");
				return false;
			}
	  }
	  
	  
	  

@FindBy(xpath="//input[@id='id_body_16777332']")
private static WebElement  enterpayVATTaxCode;

	  public static boolean checkSavingPaymentsVatAdjustingInNonJvNewReference() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {

			
		System.err.println(" Entered   ************************");

		Thread.sleep(3000);

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();
			
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentsVATVoucher));
		paymentsVATVoucher.click();
			
		Thread.sleep(2000);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
			
		Thread.sleep(2000);
			
		Thread.sleep(2000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		documentNumberTxt.click();

		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		newCashBankAccountTxt.click();

		newCashBankAccountTxt.sendKeys(Keys.SPACE);


		int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();
		  
		System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);

		for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		{
			String data		  = cashAndBAnkAccountList.get(i).getText();
			
			if(data.equalsIgnoreCase("bank"))
			{
				cashAndBAnkAccountList.get(i).click();
				
				break;
			}
		}

		newCashBankAccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();;
		voucherHeaderCurrency.sendKeys(Keys.SHIFT,Keys.HOME);

		voucherHeaderCurrency.sendKeys(Keys.SPACE);

		int currencycount=currencyListCount.size();

		System.err.println(currencycount);
			
		for(int i=0 ; i < currencycount ;i++)
		{
			String data=currencyListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("INR"))
			{
				currencyListCount.get(i).click();
				
				break;
			}
		}
			
		voucherHeaderCurrency.sendKeys(Keys.TAB);

		Thread.sleep(2000);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDRVATPlaceOfSupplyTXt));
		PDRVATPlaceOfSupplyTXt.click();

		PDRVATPlaceOfSupplyTXt.sendKeys("Abu Dhabi");

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
			
			if (data.equalsIgnoreCase("Dubai"))
			{
				departmentListCount.get(i).click();
				break;
			}
		 }

		 departmentTxt.sendKeys(Keys.TAB);

		 
		//First Row

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer Semi Adjustment");


		getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
		int accountCount=bodyAccountListInGrid.size();

		System.err.println(accountCount);
			
		for(int i=0 ; i < accountCount ;i++)
		{
			String data=bodyAccountListInGrid.get(i).getText();
			
			
			if(data.equalsIgnoreCase("Customer Semi Adjustment"))
			{
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
				bodyAccountListInGrid.get(i).click();
				
				break;
			}
		}



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
		enter_AccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterpayVATTaxCode));	
		Thread.sleep(1999);
		enterpayVATTaxCode.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_Amount.sendKeys("05");
		Thread.sleep(1999);
		enter_Amount.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		String docno=documentNumberTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Customer Semi Adjustment (Customer Semi Adjustment)";

		 
		System.out.println("Bill wise Screen Cutomer Name :"+ actPartyName + ":Value Expected  :" + expPartyName);
		   
		int Adjustbills=billRefAdjustBillsGrid.size();

		String actAdjustbills=Integer.toString(Adjustbills);

		String expAdjustbills="1";

		 
		System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);

		String expBillNewReference                      = "0.00";
		String expBillTransactionCurrency               = "5.00";
		String expBillBaseCurrency                      = "5.00";
		String expBillLocalCurrency                     = "0.35";
		String expBillBalanceNewRefAmount              = "0.00";

		String expbillRefAdjustAmountInTransCurency         = "0.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrency = "5.00";



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
		String actBillBaseCurrency                           = billRefBaseCurrency.getText();
		String actBillLocalCurrency                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


		String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
		String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


		String expconversationRateBaseCurrencyRatePick  = "1";
		String expconversationRateLocalCurrencyRatePick = "0.07";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
		billRefGridFirstRowAdjustmentAmtTxt.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
		billRefGridFirstRowAdjustmentAmtTxt.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
		String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
		String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
		String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
		String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();



		String expgridOrginalAmtRow1      ="10.00";
		String expgridBalanceAmtRow1      ="10.00";
		String expgridAdjustmentAmtRow1   ="5.00";
		String expgridAdjustmentBillsRow1DocNo  = "NDT82:1";

		System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
		System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
		System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
		System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);




		String expBillNewReferencePick                          = "0.00";
		String expBillTransactionCurrencyPick                   = "5";
		String expBillBaseCurrencyPick                          = "5"; 
		String expBillLocalCurrencyPick                         = "0.35";
		String expBillBalanceNewRefAmountPick                   = "0.00";
		String expbillRefAdjustAmountInTransCurencyPick         = "5.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = "0.00";
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		      
		String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
		String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
		String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
		
		
		String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
		String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
		String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

			
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

		String expbreakUpDetailsAccountPick             ="JEC";
		/*String expbreakUpDetailsItemPick                ="STD RATE COGS ITEM"; */    
		String expbreakUpDetailsDepartmentPick          ="DUBAI";
			
		String expasOnEntryDateTransAmtPick             ="10.00";
		String expasOnEntryDateBaseConcersationRatePick ="1";
		String expasOnEntryDateBaseAmountPick           ="10.00";
		String expasOnEntryDateLocConversationRatePick  ="0.07";
		String expasOnEntryDateAmtPick                  ="0.70";
			
		String expbalOnAdjstDateTransAmtPick            ="10.00";
		String expbalOnAdjstDateBasrConversionRatePick  ="1";
		String expbalOnAdjstDateBaseAmountPick          ="10.00";
		String expbalOnAdjstDateLocalConversionRatePick ="0.07";
		String expbalOnAdjstDateAmtPick                 ="0.70";

		String expadjustmentsAmount1Pick                ="5.00";
		String expadjustmentsAmount2Pick                ="5.00";
		String expadjustmentsAmount3Pick                ="0.35";
		String expadjustmentsAmount4Pick                ="5.00";
			
		String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
		String expexchangeGainLossForLocalCurrencyPick  ="0.00";
		
		
	
		   
		System.out.println("*********************************************************************************************************");

		System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);
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
		System.out.println("actBillLocalCurrencyPick :             "+ actBillLocalCurrencyPick+ "                " +"expBillLocalCurrencyPick :"+expBillLocalCurrencyPick);
		System.out.println("actBillBalanceNewRefAmountPick :       "+ actBillBalanceNewRefAmountPick +        " " + "expBillBalanceNewRefAmountPick :"+expBillBalanceNewRefAmountPick);
		System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick+ "  " +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
		System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick+ " " + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);

		System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
		System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);

		

		System.out.println(" Right SIde Elements *****************************************************************************");

		System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
		System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
		System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
		System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
		System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
		System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
		System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
		System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
		System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

		System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
		System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
		System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
		System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
		System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

		System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
		System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
		System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
		System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

		System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
		System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);


		

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		boolean savingVoucher=checkVoucherSavingMessage(docno);



		if (    actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
				actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
				actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
			     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
				actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
		        
				
		        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
				actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
				actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick)  && 
				actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
				actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
				actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) && 
				
				 actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
			     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo)
			     
				
			        && actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
			 		actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
			 		actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)
			 		&& actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && 
			 		actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
			 		actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) &&  actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
			 		actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && 
			 		actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick) && actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && 
			 		actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && 
			 		actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) && 
			 		actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) && 
			 		actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick)
				
				
				
				
				
				
				
				
				)
			        
				{
					System.err.println(" Test Pass: Payemnst VAT Saved With Adjustment Amount ");
					return true;
				}
				else
				{
					System.err.println("Test FAIl: Payemnst VAT Saved With Adjustment Amount ");
					return false;
				}

			

	  }
	  
	  
	  public static boolean checkSavingReceiptsVatWithAdjsutingInNonJVNewReference() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	  {

		  
		  
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		    financialsMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
			cashAndBankMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(recepitsVATVoucher));
			recepitsVATVoucher.click();
			
			Thread.sleep(2000);
			
			checkDeleteLinkStatus();
			
			Thread.sleep(2000);
					
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();

			Thread.sleep(1999);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		    newCashBankAccountTxt.click();
			newCashBankAccountTxt.sendKeys(Keys.SPACE);
			
		   int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();

		   System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);
		   
		  for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		  {
			String data		  = cashAndBAnkAccountList.get(i).getText();
			
			if(data.equalsIgnoreCase("Bank"))
				{
				cashAndBAnkAccountList.get(i).click();
					
					break;
				}
			}

		   newCashBankAccountTxt.sendKeys(Keys.TAB);

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
				
				if(data.equalsIgnoreCase("DUBAI"))
				{
					departmentListCount.get(i).click();
					break;
				}
			}
				
			Thread.sleep(1000);
			
			departmentTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeofSupplyTxt));
			placeofSupplyTxt.click();
			placeofSupplyTxt.sendKeys(Keys.SPACE);
			
		   int placeOfSupplyListCount=placeofSupplyList.size();
			
			System.err.println(placeOfSupplyListCount);
				
			for(int i=0 ; i < placeOfSupplyListCount ;i++)
			{
				String data=placeofSupplyList.get(i).getText();
				
				if(data.equalsIgnoreCase("Abu Dhabi"))
				{
					placeofSupplyList.get(i).click();
					
					break;
				}
			}
				
			placeofSupplyTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
			jurisdictionTxt.click();
			jurisdictionTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
			jurisdictionTxt.sendKeys(Keys.SPACE);
			
		   int jurisdictionListCount=jurisdictionList.size();
			
			System.err.println(jurisdictionListCount);
				
			for(int i=0 ; i < jurisdictionListCount ;i++)
			{
				String data=jurisdictionList.get(i).getText();
				
				if(data.equalsIgnoreCase("DUBAI"))
			{
				jurisdictionList.get(i).click();
				
				break;
			}
		}
			
		jurisdictionTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
		enter_AccountTxt.click();
		enter_AccountTxt.sendKeys("Customer");


		getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
		int accountCount=bodyAccountListInGrid.size();

		System.err.println(accountCount);
			
		for(int i=0 ; i < accountCount ;i++)
		{
			String data=bodyAccountListInGrid.get(i).getText();
			
			
			if(data.equalsIgnoreCase("Customer Semi Adjustment"))
			{
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOfAllElements(bodyAccountListInGrid));
				bodyAccountListInGrid.get(i).click();
				
				break;
			}
		}

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));	
		enter_AccountTxt.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enterReceiptsVATTaxCode));	
		enterReceiptsVATTaxCode.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
		enter_Amount.clear();
		enter_Amount.sendKeys("5");
		enter_Amount.sendKeys(Keys.TAB);
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		String docno=documentNumberTxt.getAttribute("value");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
		voucherSaveBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));

		String actPartyName = billRefPartyName.getText();
		String expPartyName = "Customer Semi Adjustment (Customer Semi Adjustment)";
		 
		 
		System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
		  
		int Adjustbills=billRefAdjustBillsGridList.size();

		String actAdjustbills=Integer.toString(Adjustbills);

		String expAdjustbills="1";
		 
		System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
				
		    

		System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);

		String expBillNewReference                      = "0.00";
		String expBillTransactionCurrency               = "5.00";
		String expBillBaseCurrency                      = "5.00";
		String expBillLocalCurrency                     = "0.35";
		String expBillBalanceNewRefAmount              = "0.00";

		String expbillRefAdjustAmountInTransCurency         = "0.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrency = "5.00";



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
		String actBillBaseCurrency                           = billRefBaseCurrency.getText();
		String actBillLocalCurrency                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


		String actconversationRateBaseCurrencyRatePick   = conversationRateBaseCurrencyRate.getText();
		String actconversationRateLocalCurrencyRatePick  = conversationRateLocalCurrencyRate.getText();


		String expconversationRateBaseCurrencyRatePick  = "1";
		String expconversationRateLocalCurrencyRatePick = "0.07";


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
		billRefGridFirstRowAdjustmentAmtTxt.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
		billRefGridFirstRowAdjustmentAmtTxt.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();


		String expBillNewReferencePick                          = "0.00";
		String expBillTransactionCurrencyPick                   = "5";
		String expBillBaseCurrencyPick                          = "5"; 
		String expBillLocalCurrencyPick                         = "0.35";
		String expBillBalanceNewRefAmountPick                   = "0.00";

		String expbillRefAdjustAmountInTransCurencyPick         = "5.00";
		String expbillRefBalanceAmountAdjustInTrnasCurrencyPick = "0.00";
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		      
		String actBillNewReferencePick                           = billRefNewReferenceTxt.getAttribute("value");
		String actBillTransactionCurrencyPick                    = billRefTransactionCurency.getText();
		String actBillBaseCurrencyPick                           = billRefBaseCurrency.getText();
		String actBillLocalCurrencyPick                          = localCurrencyDhs.getText();
		String actBillBalanceNewRefAmountPick                    = balanceNewReferenceAmt.getText();
		String actbillRefAdjustAmountInTransCurencyPick          = billRefAdjustAmountInTransCurency.getText();
		String actbillRefBalanceAmountAdjustInTrnasCurrencyPick  = billRefBalanceAmountAdjustInTrnasCurrency.getText();


		   
		System.out.println("*********************************************************************************************************");

		System.out.println("Bill reference Adjustment Bills  :"+ actAdjustbills+"                          "+ "expadjustBills :"+expAdjustbills);
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

		System.out.println("actbillRefAdjustAmountInTransCurencyPick :       "+ actbillRefAdjustAmountInTransCurencyPick+ "       " +"expbillRefAdjustAmountInTransCurencyPick :"+expbillRefAdjustAmountInTransCurencyPick);
		System.out.println("actbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+ actbillRefBalanceAmountAdjustInTrnasCurrencyPick + "       " +"expbillRefBalanceAmountAdjustInTrnasCurrencyPick :"+expbillRefBalanceAmountAdjustInTrnasCurrencyPick);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridOrginalAmtRow1));
		String actgridOrginalAmtRow1     = gridOrginalAmtRow1.getText();
		String actgridBalanceAmtRow1     = gridBalanceAmtRow1.getText();
		String actgridAdjustmentAmtRow1  = gridAdjustmentAmtRow1.getText();
		String actgridAdjustmentBillsRow1DocNo  = billRefAdjustBillsRow1DocNo.getText();

		String expgridOrginalAmtRow1      ="10.00";
		String expgridBalanceAmtRow1      ="10.00";
		String expgridAdjustmentAmtRow1   ="5.00";
		String expgridAdjustmentBillsRow1DocNo  = "NDT82:1";

		System.out.println("actgridOrginalAmtRow1    :" +actgridOrginalAmtRow1 +"       " +"expgridOrginalAmtRow1 :" +expgridOrginalAmtRow1);
		System.out.println("actgridBalanceAmtRow1    :" +actgridBalanceAmtRow1 +"       " +"expgridBalanceAmtRow1 :" +expgridBalanceAmtRow1);
		System.out.println("actgridAdjustmentAmtRow1 :" +actgridAdjustmentAmtRow1 +"    " +"expgridAdjustmentAmtRow1:" +expgridAdjustmentAmtRow1);
		System.out.println("actgridAdjustmentBillsRow1DocNo    :" +actgridAdjustmentBillsRow1DocNo +"       " +"expgridOrginalAmtRow1 :" +expgridAdjustmentBillsRow1DocNo);



		String actbreakUpDetailsAccountPick              = breakUpDetailsAccount.getText();
		String actbreakUpDetailsItemPick                 = breakUpDetailsItem.getText(); 
		String actbreakUpDetailsDepartmentPick           = breakUpDetailsDepartment.getText();

			
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

		String expbreakUpDetailsAccountPick             ="JEC";
		/*String expbreakUpDetailsItemPick                ="STD RATE COGS ITEM"; */    
		String expbreakUpDetailsDepartmentPick          ="DUBAI";
			
		String expasOnEntryDateTransAmtPick             ="10.00";
		String expasOnEntryDateBaseConcersationRatePick ="1";
		String expasOnEntryDateBaseAmountPick           ="10.00";
		String expasOnEntryDateLocConversationRatePick  ="0.07";
		String expasOnEntryDateAmtPick                  ="0.70";
			
		String expbalOnAdjstDateTransAmtPick            ="10.00";
		String expbalOnAdjstDateBasrConversionRatePick  ="1";
		String expbalOnAdjstDateBaseAmountPick          ="10.00";
		String expbalOnAdjstDateLocalConversionRatePick ="0.07";
		String expbalOnAdjstDateAmtPick                 ="0.70";

		String expadjustmentsAmount1Pick                ="5.00";
		String expadjustmentsAmount2Pick                ="5.00";
		String expadjustmentsAmount3Pick                ="0.35";
		String expadjustmentsAmount4Pick                ="5.00";
			
		String expexchangeGainLossForBaseCurrencyPick   ="0.00";	
		String expexchangeGainLossForLocalCurrencyPick  ="0.00";


		System.out.println(" Right SIde Elements *****************************************************************************");

		System.out.println("actbreakUpDetailsAccountPick :         "+ actbreakUpDetailsAccountPick             +" Value Expected  : "+"expbreakUpDetailsAccountPick :"+expbreakUpDetailsAccountPick);
		System.out.println("actbreakUpDetailsDepartmentPick :      "+ actbreakUpDetailsDepartmentPick          +" Value Expected  :" +"expbreakUpDetailsDepartmentPick :"+expbreakUpDetailsDepartmentPick);
		System.out.println("actconversationRateBaseCurrRatePick:   "+ actconversationRateBaseCurrencyRatePick  +" Value Expected  :" +"expconversationRateBaseCurrencyRatePick :"+expconversationRateBaseCurrencyRatePick);
		System.out.println("actconversationRateLocalCurRatePick :  "+ actconversationRateLocalCurrencyRatePick +" Value Expected  :" + "expconversationRateLocalCurrencyRatePick :"+expconversationRateLocalCurrencyRatePick);
		System.out.println("actasOnEntryDateTransAmtPick :         "+ actasOnEntryDateTransAmtPick             +" Value Expected  :" + "expasOnEntryDateTransAmtPick :"+expasOnEntryDateTransAmtPick);
		System.out.println("actOnEntryDateBaseConcersationRatePick :"+ actasOnEntryDateBaseConcersationRatePick+" Value Expected  :" +"expasOnEntryDateBaseConcersationRatePick :"+expasOnEntryDateBaseConcersationRatePick);
		System.out.println("actasOnEntryDateBaseAmountPick :       "+ actasOnEntryDateBaseAmountPick           +" Value Expected  :" +"expasOnEntryDateBaseAmountPick :"+expasOnEntryDateBaseAmountPick);
		System.out.println("actasOnEntryDateLocConverRatePick :    "+ actasOnEntryDateLocConversationRatePick  +" Value Expected  :" +"expasOnEntryDateLocConversationRatePick :"+expasOnEntryDateLocConversationRatePick);
		System.out.println("actasOnEntryDateAmtPick :              "+ actasOnEntryDateAmtPick                  +" Value Expected  :" + "expasOnEntryDateAmtPick :"+expasOnEntryDateAmtPick);

		System.out.println("actbalOnAdjstDateTransAmtPick :         "+ actbalOnAdjstDateTransAmtPick            +" Value Expected  :" +"expbalOnAdjstDateTransAmtPick :"+expbalOnAdjstDateTransAmtPick);
		System.out.println("actbalOnAdjstDateBasrConversionRatePick :"+ actbalOnAdjstDateBasrConversionRatePick +" Value Expected  :" +"expbalOnAdjstDateBasrConversionRatePick :"+expbalOnAdjstDateBasrConversionRatePick);
		System.out.println("actbalOnAdjstDateBaseAmountPick :        "+ actbalOnAdjstDateBaseAmountPick         +" Value Expected  :" +"expbalOnAdjstDateBaseAmountPick :"+expbalOnAdjstDateBaseAmountPick);
		System.out.println("actbalOnAdjstDateLocalConversionRatePick:"+ actbalOnAdjstDateLocalConversionRatePick+" Value Expected  :" +"expbalOnAdjstDateLocalConversionRatePick :"+expbalOnAdjstDateLocalConversionRatePick);
		System.out.println("actbalOnAdjstDateAmtPick                 :"+ actbalOnAdjstDateAmtPick               +" Value Expected  :" +"expbalOnAdjstDateAmtPick :"+expbalOnAdjstDateAmtPick);

		System.out.println("actadjustmentsAmount1Pick :             "+ actadjustmentsAmount1Pick   +" Value Expected  :" +"expadjustmentsAmount1Pick:"+expadjustmentsAmount1Pick);
		System.out.println("actadjustmentsAmount2Pick               :"+ actadjustmentsAmount2Pick  +" Value Expected  :" +"expadjustmentsAmount2PickPick :"+expadjustmentsAmount2Pick);
		System.out.println("actadjustmentsAmount3Pick               :"+ actadjustmentsAmount3Pick  +" Value Expected  :" + "expadjustmentsAmount3Pick:"+expadjustmentsAmount3Pick);
		System.out.println("actadjustmentsAmount4Pick               :"+ actadjustmentsAmount4Pick  +" Value Expected  :" +"expadjustmentsAmount4Pick :"+expadjustmentsAmount4Pick);

		System.out.println("actexchangeGainLossForBaseCurrencyPick  : "+ actexchangeGainLossForBaseCurrencyPick +" Value Expected  :" +"expexchangeGainLossForBaseCurrencyPick :"+expexchangeGainLossForBaseCurrencyPick);
		System.out.println("actexchangeGainLossForLocalCurrencyPick :"+ actexchangeGainLossForLocalCurrencyPick +" Value Expected  :" +"expexchangeGainLossForLocalCurrencyPick :"+expexchangeGainLossForLocalCurrencyPick);



		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

		boolean savingVoucher=checkVoucherSavingMessage(docno);


		    
		    if (   actPartyName.equalsIgnoreCase(expPartyName)  && actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
					actBillBaseCurrency.equalsIgnoreCase(expBillBaseCurrency) && actBillLocalCurrency.equalsIgnoreCase(expBillLocalCurrency) && 
					actBillBalanceNewRefAmount.equalsIgnoreCase(expBillBalanceNewRefAmount) && 
				     actbillRefAdjustAmountInTransCurency.equalsIgnoreCase(expbillRefAdjustAmountInTransCurency) &&
					actbillRefBalanceAmountAdjustInTrnasCurrency.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrency) &&   
			        
		    		
			        actBillNewReferencePick.equalsIgnoreCase(expBillNewReferencePick) && actBillTransactionCurrencyPick.equalsIgnoreCase(expBillTransactionCurrencyPick) && 
					actBillBaseCurrencyPick.equalsIgnoreCase(expBillBaseCurrencyPick) && actBillLocalCurrencyPick.equalsIgnoreCase(expBillLocalCurrencyPick) && 
					actBillBalanceNewRefAmountPick.equalsIgnoreCase(expBillBalanceNewRefAmountPick)  && 
					actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
					actbillRefAdjustAmountInTransCurencyPick.equalsIgnoreCase(expbillRefAdjustAmountInTransCurencyPick) &&
					actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick) && 
					actgridAdjustmentAmtRow1.equalsIgnoreCase(expgridAdjustmentAmtRow1) &&  actgridOrginalAmtRow1.equalsIgnoreCase(expgridOrginalAmtRow1) && 
				     actgridBalanceAmtRow1.equalsIgnoreCase(expgridBalanceAmtRow1) && actgridAdjustmentBillsRow1DocNo.equalsIgnoreCase(expgridAdjustmentBillsRow1DocNo)&& 
				     
				     actbreakUpDetailsAccountPick.equalsIgnoreCase(expbreakUpDetailsAccountPick) && 
						actbreakUpDetailsDepartmentPick.equalsIgnoreCase(expbreakUpDetailsDepartmentPick) && 
						actconversationRateBaseCurrencyRatePick.equalsIgnoreCase(expconversationRateBaseCurrencyRatePick) && actconversationRateLocalCurrencyRatePick.equalsIgnoreCase(expconversationRateLocalCurrencyRatePick) && 
						actasOnEntryDateTransAmtPick.equalsIgnoreCase(expasOnEntryDateTransAmtPick) && actasOnEntryDateBaseConcersationRatePick.equalsIgnoreCase(expasOnEntryDateBaseConcersationRatePick)&& 
						actasOnEntryDateBaseAmountPick.equalsIgnoreCase(expasOnEntryDateBaseAmountPick) && actasOnEntryDateLocConversationRatePick.equalsIgnoreCase(expasOnEntryDateLocConversationRatePick) && 
						actasOnEntryDateAmtPick.equalsIgnoreCase(expasOnEntryDateAmtPick) && actbalOnAdjstDateTransAmtPick.equalsIgnoreCase(expbalOnAdjstDateTransAmtPick) && 
						actbalOnAdjstDateBasrConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateBasrConversionRatePick) && actbalOnAdjstDateBaseAmountPick.equalsIgnoreCase(expbalOnAdjstDateBaseAmountPick)&&
						actbalOnAdjstDateLocalConversionRatePick.equalsIgnoreCase(expbalOnAdjstDateLocalConversionRatePick) && actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && 
						actbalOnAdjstDateAmtPick.equalsIgnoreCase(expbalOnAdjstDateAmtPick) && actadjustmentsAmount2Pick.equalsIgnoreCase(expadjustmentsAmount2Pick) && 
						actadjustmentsAmount1Pick.equalsIgnoreCase(expadjustmentsAmount1Pick) && actadjustmentsAmount3Pick.equalsIgnoreCase(expadjustmentsAmount3Pick) &&
						actadjustmentsAmount4Pick.equalsIgnoreCase(expadjustmentsAmount4Pick) && actexchangeGainLossForBaseCurrencyPick.equalsIgnoreCase(expexchangeGainLossForBaseCurrencyPick) &&
						actexchangeGainLossForLocalCurrencyPick.equalsIgnoreCase(expexchangeGainLossForLocalCurrencyPick))
			        
				{
					System.err.println("Recepits VAT Voucher Saved With Semi Adjustment  ");
					return true;
				}
				else
				{
					System.err.println("Recepits VAT Voucher Saved With Semi Adjustment ");
					return false;
				}
	  
	  }
	  
	  
	  
	 
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

	  		@FindBy(xpath="//span[@id='reportSort']")
	  		private static WebElement report_sortingBtn;
	  				
	  		@FindBy(xpath="//span[@id='reportRefresh']")
	  		private static WebElement report_RefreshBtn;
	  				
	  		@FindBy(xpath="//span[@id='print_report_']")
	  		private static WebElement report_PrintBtn;
	  				
	  		@FindBy(xpath="//*[@id='reportRenderControls']/ul/li/span[4]")
	  		private static WebElement report_ExportBtn;
	  		
	  		/*@FindBy(xpath="//i[contains(@class,'theme_button_color dropdown-toggle')]")
	  		private static WebElement report_sortingBtn;
	  				
	  		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-refresh')]")
	  		private static WebElement report_RefreshBtn;
	  				
	  		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-print')]")
	  		private static WebElement report_PrintBtn;
	  				
	  		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-export')]")
	  		private static WebElement report_ExportBtn;*/
	  				
	  		/*@FindBy(xpath="//i[contains(@class,'icon-font6 icon-graph ImagesinArabic')]")
	  		private static WebElement report_GraphBtn;*/
	  		
	  		@FindBy(xpath="//span[@id='GraphIcon']")
	  		private static WebElement report_GraphBtn;
	  				
	  		@FindBy(xpath="//i[contains(@class,'icon-font6 icon-backtrack')]")
	  		private static WebElement report_BackTrackBtn;
	  				
	  		/*@FindBy(xpath="//span[@id='reportCustomize_']//i[contains(@class,'icon-font6 icon-custamize')]")
	  		private static WebElement report_ReportCustomizeBtn;*/
	  		
	  		@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[7]")
	  		private static WebElement report_ReportCustomizeBtn;
	  		
	  		/*@FindBy(xpath="//span[@id='filterIcon_']//i[contains(@class,'icon-font6 icon-filter')]")
	  		private static WebElement report_FilterBtn;*/
	  		
	  		@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[8]")
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
	  		
	  		@FindBy(xpath="//tbody/tr[1]/td[6]/span[1]")
	  		private static WebElement  report_Filter_RefreshConditionBtn;
	  		
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
	  				
	  		/*@FindBy(xpath="//span[@id='reportClose_']//i[contains(@class,'icon-font6 icon-close')]")
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
	  		private static WebElement report_LastBtn;*/
	  		
	  		@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[12]")
	  		private static WebElement report_CloseBtn;
	  		
	  		@FindBy (xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[13]")
	  		private static WebElement reportWithLevel_CloseBtn;
	  				
	  		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]/button[1]")
	  		private static WebElement report_FirstBtn;
	  				
	  		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]/button[2]")
	  		private static WebElement report_PreviousBtn;
	  				
	  		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]/button[3]")
	  		private static WebElement report_PageNoBtn;
	  				
	  		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]/button[4]")
	  		private static WebElement report_NextBtn;
	  				
	  		@FindBy(xpath="//div[@id='tblFooterReportRender']/div[2]/button[5]")
	  		private static WebElement report_LastBtn;
	  		
	  		@FindBy(xpath="//input[@id='txtSearchReport']")
	  		private static WebElement report_SearchTxt;
	  		
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[1]")
	  		private static WebElement sl_1stRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_0']/td[2]")
	  		private static WebElement sl_1stRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[3]")
	  		private static WebElement sl_1stRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[4]")
	  		private static WebElement sl_1stRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[5]")
	  		private static WebElement sl_1stRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[6]")
	  		private static WebElement sl_1stRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[7]")
	  		private static WebElement sl_1stRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[8]")
	  		private static WebElement sl_1stRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[9]")
	  		private static WebElement sl_1stRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[10]")
	  		private static WebElement sl_1stRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[11]")
	  		private static WebElement sl_1stRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[12]")
	  		private static WebElement sl_1stRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[13]")
	  		private static WebElement sl_1stRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[14]")
	  		private static WebElement sl_1stRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[15]")
	  		private static WebElement sl_1stRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[16]")
	  		private static WebElement sl_1stRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[17]")
	  		private static WebElement sl_1stRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[18]")
	  		private static WebElement sl_1stRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[19]")
	  		private static WebElement sl_1stRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[20]")
	  		private static WebElement sl_1stRow20thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[21]")
	  		private static WebElement sl_1stRow21thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[22]")
	  		private static WebElement sl_1stRow22thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[23]")
	  		private static WebElement sl_1stRow23thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[24]")
	  		private static WebElement sl_1stRow24thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[25]")
	  		private static WebElement sl_1stRow25thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[26]")
	  		private static WebElement sl_1stRow26thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[27]")
	  		private static WebElement sl_1stRow27thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[28]")
	  		private static WebElement sl_1stRow28thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[29]")
	  		private static WebElement sl_1stRow29thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[30]")
	  		private static WebElement sl_1stRow30thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[31]")
	  		private static WebElement sl_1stRow31thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[32]")
	  		private static WebElement sl_1stRow32thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[33]")
	  		private static WebElement sl_1stRow33thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[34]")
	  		private static WebElement sl_1stRow34thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[35]")
	  		private static WebElement sl_1stRow35thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[36]")
	  		private static WebElement sl_1stRow36thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[37]")
	  		private static WebElement sl_1stRow37thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[38]")
	  		private static WebElement sl_1stRow38thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[39]")
	  		private static WebElement sl_1stRow39thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[40]")
	  		private static WebElement sl_1stRow40thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[41]")
	  		private static WebElement sl_1stRow41thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[42]")
	  		private static WebElement sl_1stRow42thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[43]")
	  		private static WebElement sl_1stRow43thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[44]")
	  		private static WebElement sl_1stRow44thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[45]")
	  		private static WebElement sl_1stRow45thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[46]")
	  		private static WebElement sl_1stRow46thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[47]")
	  		private static WebElement sl_1stRow47thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[48]")
	  		private static WebElement sl_1stRow48thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[49]")
	  		private static WebElement sl_1stRow49thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_0']/td[50]")
	  		private static WebElement sl_1stRow50thCol;
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[1]")
	  		private static WebElement sl_2ndRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_1']/td[2]")
	  		private static WebElement sl_2ndRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[3]")
	  		private static WebElement sl_2ndRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[4]")
	  		private static WebElement sl_2ndRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[5]")
	  		private static WebElement sl_2ndRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[6]")
	  		private static WebElement sl_2ndRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[7]")
	  		private static WebElement sl_2ndRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[8]")
	  		private static WebElement sl_2ndRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[9]")
	  		private static WebElement sl_2ndRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[10]")
	  		private static WebElement sl_2ndRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[11]")
	  		private static WebElement sl_2ndRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[12]")
	  		private static WebElement sl_2ndRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[13]")
	  		private static WebElement sl_2ndRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[14]")
	  		private static WebElement sl_2ndRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[15]")
	  		private static WebElement sl_2ndRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[16]")
	  		private static WebElement sl_2ndRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[17]")
	  		private static WebElement sl_2ndRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[18]")
	  		private static WebElement sl_2ndRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[19]")
	  		private static WebElement sl_2ndRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[20]")
	  		private static WebElement sl_2ndRow20thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[21]")
	  		private static WebElement sl_2ndRow21thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[22]")
	  		private static WebElement sl_2ndRow22thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[23]")
	  		private static WebElement sl_2ndRow23thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[24]")
	  		private static WebElement sl_2ndRow24thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[25]")
	  		private static WebElement sl_2ndRow25thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[26]")
	  		private static WebElement sl_2ndRow26thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[27]")
	  		private static WebElement sl_2ndRow27thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[28]")
	  		private static WebElement sl_2ndRow28thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[29]")
	  		private static WebElement sl_2ndRow29thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[30]")
	  		private static WebElement sl_2ndRow30thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[31]")
	  		private static WebElement sl_2ndRow31thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[32]")
	  		private static WebElement sl_2ndRow32thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[33]")
	  		private static WebElement sl_2ndRow33thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[34]")
	  		private static WebElement sl_2ndRow34thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[35]")
	  		private static WebElement sl_2ndRow35thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[36]")
	  		private static WebElement sl_2ndRow36thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[37]")
	  		private static WebElement sl_2ndRow37thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[38]")
	  		private static WebElement sl_2ndRow38thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[39]")
	  		private static WebElement sl_2ndRow39thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[40]")
	  		private static WebElement sl_2ndRow40thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[41]")
	  		private static WebElement sl_2ndRow41thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[42]")
	  		private static WebElement sl_2ndRow42thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[43]")
	  		private static WebElement sl_2ndRow43thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[44]")
	  		private static WebElement sl_2ndRow44thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[45]")
	  		private static WebElement sl_2ndRow45thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[46]")
	  		private static WebElement sl_2ndRow46thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[47]")
	  		private static WebElement sl_2ndRow47thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[48]")
	  		private static WebElement sl_2ndRow48thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[49]")
	  		private static WebElement sl_2ndRow49thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_1']/td[50]")
	  		private static WebElement sl_2ndRow50thCol;
	  		
	  		
	  		
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[1]")
	  		private static WebElement sl_3rdRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_2']/td[2]")
	  		private static WebElement sl_3rdRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[3]")
	  		private static WebElement sl_3rdRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[4]")
	  		private static WebElement sl_3rdRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[5]")
	  		private static WebElement sl_3rdRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[6]")
	  		private static WebElement sl_3rdRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[7]")
	  		private static WebElement sl_3rdRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[8]")
	  		private static WebElement sl_3rdRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[9]")
	  		private static WebElement sl_3rdRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[10]")
	  		private static WebElement sl_3rdRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[11]")
	  		private static WebElement sl_3rdRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[12]")
	  		private static WebElement sl_3rdRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[13]")
	  		private static WebElement sl_3rdRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[14]")
	  		private static WebElement sl_3rdRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[15]")
	  		private static WebElement sl_3rdRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[16]")
	  		private static WebElement sl_3rdRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[17]")
	  		private static WebElement sl_3rdRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[18]")
	  		private static WebElement sl_3rdRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[19]")
	  		private static WebElement sl_3rdRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[20]")
	  		private static WebElement sl_3rdRow20thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[21]")
	  		private static WebElement sl_3rdRow21thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[22]")
	  		private static WebElement sl_3rdRow22thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[23]")
	  		private static WebElement sl_3rdRow23thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[24]")
	  		private static WebElement sl_3rdRow24thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[25]")
	  		private static WebElement sl_3rdRow25thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[26]")
	  		private static WebElement sl_3rdRow26thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[27]")
	  		private static WebElement sl_3rdRow27thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[28]")
	  		private static WebElement sl_3rdRow28thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[29]")
	  		private static WebElement sl_3rdRow29thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[30]")
	  		private static WebElement sl_3rdRow30thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[31]")
	  		private static WebElement sl_3rdRow31thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[32]")
	  		private static WebElement sl_3rdRow32thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[33]")
	  		private static WebElement sl_3rdRow33thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[34]")
	  		private static WebElement sl_3rdRow34thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[35]")
	  		private static WebElement sl_3rdRow35thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[36]")
	  		private static WebElement sl_3rdRow36thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[37]")
	  		private static WebElement sl_3rdRow37thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[38]")
	  		private static WebElement sl_3rdRow38thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[39]")
	  		private static WebElement sl_3rdRow39thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[40]")
	  		private static WebElement sl_3rdRow40thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[41]")
	  		private static WebElement sl_3rdRow41thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[42]")
	  		private static WebElement sl_3rdRow42thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[43]")
	  		private static WebElement sl_3rdRow43thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[44]")
	  		private static WebElement sl_3rdRow44thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[45]")
	  		private static WebElement sl_3rdRow45thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[46]")
	  		private static WebElement sl_3rdRow46thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[47]")
	  		private static WebElement sl_3rdRow47thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[48]")
	  		private static WebElement sl_3rdRow48thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[49]")
	  		private static WebElement sl_3rdRow49thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_2']/td[50]")
	  		private static WebElement sl_3rdRow50thCol;
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[1]")
	  		private static WebElement sl_4thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_3']/td[2]")
	  		private static WebElement sl_4thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[3]")
	  		private static WebElement sl_4thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[4]")
	  		private static WebElement sl_4thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[5]")
	  		private static WebElement sl_4thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[6]")
	  		private static WebElement sl_4thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[7]")
	  		private static WebElement sl_4thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[8]")
	  		private static WebElement sl_4thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[9]")
	  		private static WebElement sl_4thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[10]")
	  		private static WebElement sl_4thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[11]")
	  		private static WebElement sl_4thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[12]")
	  		private static WebElement sl_4thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[13]")
	  		private static WebElement sl_4thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[14]")
	  		private static WebElement sl_4thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[15]")
	  		private static WebElement sl_4thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[16]")
	  		private static WebElement sl_4thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[17]")
	  		private static WebElement sl_4thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[18]")
	  		private static WebElement sl_4thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[19]")
	  		private static WebElement sl_4thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[20]")
	  		private static WebElement sl_4thRow20thCol;
	  		

	  		@FindBy(xpath="//*[@id='trRender_3']/td[21]")
	  		private static WebElement sl_4thRow21thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[22]")
	  		private static WebElement sl_4thRow22thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[23]")
	  		private static WebElement sl_4thRow23thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[24]")
	  		private static WebElement sl_4thRow24thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[25]")
	  		private static WebElement sl_4thRow25thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[26]")
	  		private static WebElement sl_4thRow26thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[27]")
	  		private static WebElement sl_4thRow27thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[28]")
	  		private static WebElement sl_4thRow28thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[29]")
	  		private static WebElement sl_4thRow29thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[30]")
	  		private static WebElement sl_4thRow30thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[31]")
	  		private static WebElement sl_4thRow31thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[32]")
	  		private static WebElement sl_4thRow32thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[33]")
	  		private static WebElement sl_4thRow33thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[34]")
	  		private static WebElement sl_4thRow34thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[35]")
	  		private static WebElement sl_4thRow35thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[36]")
	  		private static WebElement sl_4thRow36thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[37]")
	  		private static WebElement sl_4thRow37thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[38]")
	  		private static WebElement sl_4thRow38thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[39]")
	  		private static WebElement sl_4thRow39thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[40]")
	  		private static WebElement sl_4thRow40thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[41]")
	  		private static WebElement sl_4thRow41thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[42]")
	  		private static WebElement sl_4thRow42thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[43]")
	  		private static WebElement sl_4thRow43thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[44]")
	  		private static WebElement sl_4thRow44thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[45]")
	  		private static WebElement sl_4thRow45thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[46]")
	  		private static WebElement sl_4thRow46thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[47]")
	  		private static WebElement sl_4thRow47thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[48]")
	  		private static WebElement sl_4thRow48thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[49]")
	  		private static WebElement sl_4thRow49thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_3']/td[50]")
	  		private static WebElement sl_4thRow50thCol;
	  		
	  		

	  		
	  		
	  		
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[1]")
	  		private static WebElement sl_5thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_4']/td[2]")
	  		private static WebElement sl_5thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[3]")
	  		private static WebElement sl_5thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[4]")
	  		private static WebElement sl_5thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[5]")
	  		private static WebElement sl_5thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[6]")
	  		private static WebElement sl_5thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[7]")
	  		private static WebElement sl_5thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[8]")
	  		private static WebElement sl_5thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[9]")
	  		private static WebElement sl_5thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[10]")
	  		private static WebElement sl_5thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[11]")
	  		private static WebElement sl_5thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[12]")
	  		private static WebElement sl_5thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[13]")
	  		private static WebElement sl_5thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[14]")
	  		private static WebElement sl_5thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[15]")
	  		private static WebElement sl_5thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[16]")
	  		private static WebElement sl_5thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[17]")
	  		private static WebElement sl_5thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[18]")
	  		private static WebElement sl_5thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[19]")
	  		private static WebElement sl_5thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[20]")
	  		private static WebElement sl_5thRow20thCol;
	  		

	  		@FindBy(xpath="//*[@id='trRender_4']/td[21]")
	  		private static WebElement sl_5thRow21thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[22]")
	  		private static WebElement sl_5thRow22thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[23]")
	  		private static WebElement sl_5thRow23thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[24]")
	  		private static WebElement sl_5thRow24thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[25]")
	  		private static WebElement sl_5thRow25thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[26]")
	  		private static WebElement sl_5thRow26thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[27]")
	  		private static WebElement sl_5thRow27thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[28]")
	  		private static WebElement sl_5thRow28thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[29]")
	  		private static WebElement sl_5thRow29thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[30]")
	  		private static WebElement sl_5thRow30thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[31]")
	  		private static WebElement sl_5thRow31thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[32]")
	  		private static WebElement sl_5thRow32thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[33]")
	  		private static WebElement sl_5thRow33thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[34]")
	  		private static WebElement sl_5thRow34thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[35]")
	  		private static WebElement sl_5thRow35thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[36]")
	  		private static WebElement sl_5thRow36thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[37]")
	  		private static WebElement sl_5thRow37thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[38]")
	  		private static WebElement sl_5thRow38thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[39]")
	  		private static WebElement sl_5thRow39thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[40]")
	  		private static WebElement sl_5thRow40thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[41]")
	  		private static WebElement sl_5thRow41thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[42]")
	  		private static WebElement sl_5thRow42thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[43]")
	  		private static WebElement sl_5thRow43thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[44]")
	  		private static WebElement sl_5thRow44thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[45]")
	  		private static WebElement sl_5thRow45thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[46]")
	  		private static WebElement sl_5thRow46thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[47]")
	  		private static WebElement sl_5thRow47thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[48]")
	  		private static WebElement sl_5thRow48thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[49]")
	  		private static WebElement sl_5thRow49thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_4']/td[50]")
	  		private static WebElement sl_5thRow50thCol;
	  		
	  		
	  		
	  		

	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[1]")
	  		private static WebElement sl_6thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_5']/td[2]")
	  		private static WebElement sl_6thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[3]")
	  		private static WebElement sl_6thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[4]")
	  		private static WebElement sl_6thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[5]")
	  		private static WebElement sl_6thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[6]")
	  		private static WebElement sl_6thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[7]")
	  		private static WebElement sl_6thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[8]")
	  		private static WebElement sl_6thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[9]")
	  		private static WebElement sl_6thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[10]")
	  		private static WebElement sl_6thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[11]")
	  		private static WebElement sl_6thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[12]")
	  		private static WebElement sl_6thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[13]")
	  		private static WebElement sl_6thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[14]")
	  		private static WebElement sl_6thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[15]")
	  		private static WebElement sl_6thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[16]")
	  		private static WebElement sl_6thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[17]")
	  		private static WebElement sl_6thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[18]")
	  		private static WebElement sl_6thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[19]")
	  		private static WebElement sl_6thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[20]")
	  		private static WebElement sl_6thRow20thCol;
	  		

	  		@FindBy(xpath="//*[@id='trRender_5']/td[21]")
	  		private static WebElement sl_6thRow21thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[22]")
	  		private static WebElement sl_6thRow22thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[23]")
	  		private static WebElement sl_6thRow23thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[24]")
	  		private static WebElement sl_6thRow24thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[25]")
	  		private static WebElement sl_6thRow25thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[26]")
	  		private static WebElement sl_6thRow26thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[27]")
	  		private static WebElement sl_6thRow27thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[28]")
	  		private static WebElement sl_6thRow28thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[29]")
	  		private static WebElement sl_6thRow29thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[30]")
	  		private static WebElement sl_6thRow30thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[31]")
	  		private static WebElement sl_6thRow31thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[32]")
	  		private static WebElement sl_6thRow32thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[33]")
	  		private static WebElement sl_6thRow33thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[34]")
	  		private static WebElement sl_6thRow34thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[35]")
	  		private static WebElement sl_6thRow35thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[36]")
	  		private static WebElement sl_6thRow36thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[37]")
	  		private static WebElement sl_6thRow37thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[38]")
	  		private static WebElement sl_6thRow38thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[39]")
	  		private static WebElement sl_6thRow39thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[40]")
	  		private static WebElement sl_6thRow40thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[41]")
	  		private static WebElement sl_6thRow41thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[42]")
	  		private static WebElement sl_6thRow42thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[43]")
	  		private static WebElement sl_6thRow43thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[44]")
	  		private static WebElement sl_6thRow44thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[45]")
	  		private static WebElement sl_6thRow45thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[46]")
	  		private static WebElement sl_6thRow46thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[47]")
	  		private static WebElement sl_6thRow47thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[48]")
	  		private static WebElement sl_6thRow48thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[49]")
	  		private static WebElement sl_6thRow49thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_5']/td[50]")
	  		private static WebElement sl_6thRow50thCol;
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[1]")
	  		private static WebElement sl_7thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_6']/td[2]")
	  		private static WebElement sl_7thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[3]")
	  		private static WebElement sl_7thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[4]")
	  		private static WebElement sl_7thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[5]")
	  		private static WebElement sl_7thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[6]")
	  		private static WebElement sl_7thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[7]")
	  		private static WebElement sl_7thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[8]")
	  		private static WebElement sl_7thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[9]")
	  		private static WebElement sl_7thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[10]")
	  		private static WebElement sl_7thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[11]")
	  		private static WebElement sl_7thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[12]")
	  		private static WebElement sl_7thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[13]")
	  		private static WebElement sl_7thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[14]")
	  		private static WebElement sl_7thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[15]")
	  		private static WebElement sl_7thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[16]")
	  		private static WebElement sl_7thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[17]")
	  		private static WebElement sl_7thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[18]")
	  		private static WebElement sl_7thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[19]")
	  		private static WebElement sl_7thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_6']/td[20]")
	  		private static WebElement sl_7thRow20thCol;
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[1]")
	  		private static WebElement sl_8thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_7']/td[2]")
	  		private static WebElement sl_8thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[3]")
	  		private static WebElement sl_8thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[4]")
	  		private static WebElement sl_8thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[5]")
	  		private static WebElement sl_8thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[6]")
	  		private static WebElement sl_8thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[7]")
	  		private static WebElement sl_8thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[8]")
	  		private static WebElement sl_8thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[9]")
	  		private static WebElement sl_8thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[10]")
	  		private static WebElement sl_8thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[11]")
	  		private static WebElement sl_8thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[12]")
	  		private static WebElement sl_8thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[13]")
	  		private static WebElement sl_8thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[14]")
	  		private static WebElement sl_8thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[15]")
	  		private static WebElement sl_8thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[16]")
	  		private static WebElement sl_8thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[17]")
	  		private static WebElement sl_8thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[18]")
	  		private static WebElement sl_8thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[19]")
	  		private static WebElement sl_8thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_7']/td[20]")
	  		private static WebElement sl_8thRow20thCol;
	  		
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[1]")
	  		private static WebElement sl_9thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_8']/td[2]")
	  		private static WebElement sl_9thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[3]")
	  		private static WebElement sl_9thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[4]")
	  		private static WebElement sl_9thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[5]")
	  		private static WebElement sl_9thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[6]")
	  		private static WebElement sl_9thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[7]")
	  		private static WebElement sl_9thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[8]")
	  		private static WebElement sl_9thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[9]")
	  		private static WebElement sl_9thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[10]")
	  		private static WebElement sl_9thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[11]")
	  		private static WebElement sl_9thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[12]")
	  		private static WebElement sl_9thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[13]")
	  		private static WebElement sl_9thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[14]")
	  		private static WebElement sl_9thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[15]")
	  		private static WebElement sl_9thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[16]")
	  		private static WebElement sl_9thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[17]")
	  		private static WebElement sl_9thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[18]")
	  		private static WebElement sl_9thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[19]")
	  		private static WebElement sl_9thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_8']/td[20]")
	  		private static WebElement sl_9thRow20thCol;
	  		
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[1]")
	  		private static WebElement sl_10thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_9']/td[2]")
	  		private static WebElement sl_10thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[3]")
	  		private static WebElement sl_10thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[4]")
	  		private static WebElement sl_10thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[5]")
	  		private static WebElement sl_10thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[6]")
	  		private static WebElement sl_10thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[7]")
	  		private static WebElement sl_10thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[8]")
	  		private static WebElement sl_10thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[9]")
	  		private static WebElement sl_10thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[10]")
	  		private static WebElement sl_10thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[11]")
	  		private static WebElement sl_10thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[12]")
	  		private static WebElement sl_10thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[13]")
	  		private static WebElement sl_10thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[14]")
	  		private static WebElement sl_10thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[15]")
	  		private static WebElement sl_10thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[16]")
	  		private static WebElement sl_10thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[17]")
	  		private static WebElement sl_10thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[18]")
	  		private static WebElement sl_10thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[19]")
	  		private static WebElement sl_10thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_9']/td[20]")
	  		private static WebElement sl_10thRow20thCol;
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[1]")
	  		private static WebElement sl_11thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_10']/td[2]")
	  		private static WebElement sl_11thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[3]")
	  		private static WebElement sl_11thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[4]")
	  		private static WebElement sl_11thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[5]")
	  		private static WebElement sl_11thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[6]")
	  		private static WebElement sl_11thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[7]")
	  		private static WebElement sl_11thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[8]")
	  		private static WebElement sl_11thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[9]")
	  		private static WebElement sl_11thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[10]")
	  		private static WebElement sl_11thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[11]")
	  		private static WebElement sl_11thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[12]")
	  		private static WebElement sl_11thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[13]")
	  		private static WebElement sl_11thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[14]")
	  		private static WebElement sl_11thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[15]")
	  		private static WebElement sl_11thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[16]")
	  		private static WebElement sl_11thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[17]")
	  		private static WebElement sl_11thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[18]")
	  		private static WebElement sl_11thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[19]")
	  		private static WebElement sl_11thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_10']/td[20]")
	  		private static WebElement sl_11thRow20thCol;
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[1]")
	  		private static WebElement sl_12thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_11']/td[2]")
	  		private static WebElement sl_12thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[3]")
	  		private static WebElement sl_12thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[4]")
	  		private static WebElement sl_12thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[5]")
	  		private static WebElement sl_12thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[6]")
	  		private static WebElement sl_12thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[7]")
	  		private static WebElement sl_12thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[8]")
	  		private static WebElement sl_12thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[9]")
	  		private static WebElement sl_12thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[10]")
	  		private static WebElement sl_12thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[11]")
	  		private static WebElement sl_12thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[12]")
	  		private static WebElement sl_12thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[13]")
	  		private static WebElement sl_12thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[14]")
	  		private static WebElement sl_12thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[15]")
	  		private static WebElement sl_12thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[16]")
	  		private static WebElement sl_12thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[17]")
	  		private static WebElement sl_12thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[18]")
	  		private static WebElement sl_12thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[19]")
	  		private static WebElement sl_12thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_11']/td[20]")
	  		private static WebElement sl_12thRow20thCol;
	  		
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[1]")
	  		private static WebElement sl_13thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_12']/td[2]")
	  		private static WebElement sl_13thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[3]")
	  		private static WebElement sl_13thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[4]")
	  		private static WebElement sl_13thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[5]")
	  		private static WebElement sl_13thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[6]")
	  		private static WebElement sl_13thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[7]")
	  		private static WebElement sl_13thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[8]")
	  		private static WebElement sl_13thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[9]")
	  		private static WebElement sl_13thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[10]")
	  		private static WebElement sl_13thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[11]")
	  		private static WebElement sl_13thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[12]")
	  		private static WebElement sl_13thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[13]")
	  		private static WebElement sl_13thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[14]")
	  		private static WebElement sl_13thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[15]")
	  		private static WebElement sl_13thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[16]")
	  		private static WebElement sl_13thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[17]")
	  		private static WebElement sl_13thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[18]")
	  		private static WebElement sl_13thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[19]")
	  		private static WebElement sl_13thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_12']/td[20]")
	  		private static WebElement sl_13thRow20thCol;
	  		
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[1]")
	  		private static WebElement sl_14thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_13']/td[2]")
	  		private static WebElement sl_14thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[3]")
	  		private static WebElement sl_14thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[4]")
	  		private static WebElement sl_14thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[5]")
	  		private static WebElement sl_14thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[6]")
	  		private static WebElement sl_14thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[7]")
	  		private static WebElement sl_14thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[8]")
	  		private static WebElement sl_14thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[9]")
	  		private static WebElement sl_14thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[10]")
	  		private static WebElement sl_14thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[11]")
	  		private static WebElement sl_14thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[12]")
	  		private static WebElement sl_14thRow12thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[13]")
	  		private static WebElement sl_14thRow13thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[14]")
	  		private static WebElement sl_14thRow14thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[15]")
	  		private static WebElement sl_14thRow15thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[16]")
	  		private static WebElement sl_14thRow16thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[17]")
	  		private static WebElement sl_14thRow17thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[18]")
	  		private static WebElement sl_14thRow18thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[19]")
	  		private static WebElement sl_14thRow19thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_13']/td[20]")
	  		private static WebElement sl_14thRow20thCol;
	  		
	  		
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[1]")
	  		private static WebElement sl_15thRow1stCol;
	  				
	  		@FindBy(xpath="//*[@id='trRender_14']/td[2]")
	  		private static WebElement sl_15thRow2ndCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[3]")
	  		private static WebElement sl_15thRow3rdCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[4]")
	  		private static WebElement sl_15thRow4thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[5]")
	  		private static WebElement sl_15thRow5thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[6]")
	  		private static WebElement sl_15thRow6thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[7]")
	  		private static WebElement sl_15thRow7thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[8]")
	  		private static WebElement sl_15thRow8thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[9]")
	  		private static WebElement sl_15thRow9thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[10]")
	  		private static WebElement sl_15thRow10thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[11]")
	  		private static WebElement sl_15thRow11thCol;
	  		
	  		@FindBy(xpath="//*[@id='trRender_14']/td[12]")
	  		private static WebElement sl_15thRow12thCol;
	  		

	  		private static String xlSheetName = "SmokeFAReports";
	  		private int bankRecRow1ListCount;
	  	
	  	

	  		@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li/a/span")
	  		private static List<WebElement> financialReportList;
	  	
	  		
	  @FindBy(xpath="//div[@id='idGlobalError']")
	  public static WebElement validationConfirmationMessage;

	  @FindBy(xpath="//tbody[@id='LandingGridBody']/tr")
	  private static List<WebElement> stockLedgerHometableRowCount;

	  @FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[3]")
	  private static List<WebElement> reportVocGridList;


	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[1]/td")
	  private static List<WebElement> report1stRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[2]/td")
	  private static List<WebElement> report2ndRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[3]/td")
	  private static List<WebElement> report3rdRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[4]/td")
	  private static List<WebElement> report4thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[5]/td")
	  private static List<WebElement> report5thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[6]/td")
	  private static List<WebElement> report6thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[7]/td")
	  private static List<WebElement> report7thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[8]/td")
	  private static List<WebElement> report8thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[9]/td")
	  private static List<WebElement> report9thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[10]/td")
	  private static List<WebElement> report10thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[11]/td")
	  private static List<WebElement> report11thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[12]/td")
	  private static List<WebElement> report12thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[13]/td")
	  private static List<WebElement> report13thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[14]/td")
	  private static List<WebElement> report14thRowList;

	  @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr[15]/td")
	  private static List<WebElement> report15thRowList;

	  		
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
	  		
	  		Thread.sleep(3000);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	  		sl_DateOptionDropdown.click();
	  		Select s=new Select(sl_DateOptionDropdown);
	  		s.selectByValue("1");
	  		
	  		Thread.sleep(2000);
	  	
	          int rowcount=stockLedgerHometableRowCount.size();
	  		
	  		System.out.println(rowcount);
	  		
	  		for (int i = 1; i <= rowcount; i++) 
	  		{
	  			WebElement name=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[12]"));
	  			
	  			String actname=name.getText();
	  			
	  			System.out.println(actname);
	  			
	  			if(actname.equalsIgnoreCase("Customer New Reference") )
	  			{
	  				
	  				WebElement index=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[8]/div/label/input"));
	  				index.click();
	  				
	  				break;
	  			}

	  		}
	  		Thread.sleep(2000);
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	  		sl_OkBtn.click();
	  	
	  		Thread.sleep(2000);
	  		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));*/
	  		
	  		int reportsRow1ListCount = report1stRowList.size();
	  		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  		for(int i=1;i<reportsRow1ListCount;i++)
	  		{
	  			String data = report1stRowList.get(i).getText();
	  			reportsRow1ListArray.add(data);
	  		}
	  		String actRow1List = reportsRow1ListArray.toString();
	  		String expRow1List = "[Customer New Reference Customer New Reference]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[, Opening Balance, , 20.00, 20.00, , 2.20, 2.20, , 20.00, 20.00, ]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[NJv : 1, Bank, 5.00, , 15.00, 0.35, , 1.85, 5.00, , 15.00, Indian Rupees]";
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[, , 5.00, 20.00, 15.00, 0.35, 2.20, 1.85, 5.00, 20.00, 15.00, ]";

	  		/*int report5thRowListCount = report5thRowList.size();
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
	  		
	  		
	  		int report8thRowListCount = report8thRowList.size();
	  		ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report8thRowListCount;i++)
	  		{
	  			String data = report8thRowList.get(i).getText();
	  			report8thRowListArray.add(data);
	  		}
	  		String actRow8List = report8thRowListArray.toString();
	  		String expRow8List = "[, , 44.96, 18.75, 26.21, 7.80, 1.31, 6.48, 44.96, 18.75, 26.21, ]";
	  		*/
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
	  				
	  		/*System.out.println("actRow5List  : "+actRow5List);
	  		System.out.println("expRow5List  : "+expRow5List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow6List  : "+actRow6List);
	  		System.out.println("expRow6List  : "+expRow6List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow7List  : "+actRow7List);
	  		System.out.println("expRow7List  : "+expRow7List);
	  		System.out.println("*********************************************************************");*/
	  				
	  		/*System.out.println("actRow8List  : "+actRow8List);
	  		System.out.println("expRow8List  : "+expRow8List);
	  		System.out.println("*********************************************************************");
	  		*/
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
	  		report_CloseBtn.click();
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List) &&
	  				actRow4List.equalsIgnoreCase(expRow4List)/* &&
	  				actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List) &&
	  				actRow7List.equalsIgnoreCase(expRow7List) &&
	  				actRow8List.equalsIgnoreCase(expRow8List) */)
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
	  	
	  	
	  	
	  	
	  	/*@FindBy(xpath="//span[@id='BackTrackIcon_']")
	  	private static WebElement reportBackTractIcon;*/
	  	
	  	@FindBy (xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[6]")
	  	private static WebElement reportBackTractIcon;
	  	
	 

	  	@FindBy(xpath="//input[@id='id_header_4']")
	  	private static WebElement  headerCustomerAccountTxt;
	  
	  		
	  
	  		
	  	

	   @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td")
	   private static List<WebElement> voucherRow1List;
	   
	   @FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td")
	   private static List<WebElement> voucherRow2List;
	   
	   
	   
	   
	   
	   @FindBy(xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr/td")
	   private static List<WebElement> reportBodyList;
	   
	  	
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
	  			
	  			if(actname.equalsIgnoreCase("Customer Semi Adjustment") )
	  			{
	  				
	  				WebElement index=getDriver().findElement(By.xpath("//tbody[@id='LandingGridBody']/tr["+i+"]/td[8]/div/label/input"));
	  				index.click();
	  				
	  				break;
	  			}

	  		}
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	  		sl_OkBtn.click();
	  	
	  		
	  		Thread.sleep(3000);
	  		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));*/
	  		
	  		
	  		int reportBodyListCount = reportBodyList.size();
	  		HashSet<String> actreportBodyListArray = new HashSet<String>();
	  		for(int i=1;i<reportBodyListCount;i++)
	  		{
	  			if (i!=2 && i!=3 && i!=15 && i!=16 && i!=28 && i!=29 && i!=41 && i!=42 && i!=54 && i!=55 && i!=67 && i!=68 && i!=80) 
	  			{
	  				String data = reportBodyList.get(i).getText();
	  				actreportBodyListArray.add(data);
	  				System.out.println(i+". "+data);
	  			}
	  		}
	  		
	  		
	  		/*Calendar cal=Calendar.getInstance();
	  		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	  		String currentDate = df.format(cal.getTime());*/
	  		
	  		
	  		String actString = actreportBodyListArray.toString();
	  		
	  		String expString = "[, Journal Entries Control A/C, 5.00, 0.70, 15.00, Bank, NDT58 : 1, 10.00, Customer Semi Adjustment Customer Semi Adjustment, NDT57 : 4, 1.05, 0.35, NDT82 : 1]";
	  		
	  		System.out.println(actString);
	  		System.out.println(expString);
	  		
	  		/*int reportsRow1ListCount = report1stRowList.size();
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
	  		String expRow3List = "[NDT57 : SU/IND/TEXT4, Vendor B, 10.00, , 16.67, 0.70, , 7.37, 10.00, , 16.67]";
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[NDT57 : SU/IND/TEXT4, Vendor B, 10.00, , 26.67, 0.70, , 8.07, 10.00, , 26.67]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[NDT57 : SU/IND/TEXT4, Vendor B, 10.00, , 36.67, 0.70, , 8.77, 10.00, , 36.67]";

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
	  		String expRow8List = "[, , 36.67, 8.33, 28.34, 8.77, 0.58, 8.19, 36.67, 8.33, 28.34]";*/
	  		
	  		/*
	  		int report9thRowListCount = report9thRowList.size();
	  		ArrayList<String> report9thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report9thRowListCount;i++)
	  		{
	  			String data = report9thRowList.get(i).getText();
	  			report9thRowListArray.add(data);
	  		}
	  		String actRow9List = report9thRowListArray.toString();
	  		String expRow9List = "[, , 41.71, 8.33, 33.38, 9.12, 0.58, 8.54, 41.71, 8.33, 33.38]";
	  		*/
	  		
	  		/*System.out.println("actRow1List  : "+actRow1List);
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
	  		System.out.println("*********************************************************************");*/
	  		
	  	
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
	  		report_CloseBtn.click();
	  		
	  		if(/*actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List) &&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List) &&
	  				actRow7List.equalsIgnoreCase(expRow7List) &&
	  				actRow8List.equalsIgnoreCase(expRow8List) */   actString.equalsIgnoreCase(expString))
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
	  		
	 
	  		
	  	/*@FindBy(xpath="//span[@id='print_report_']")
	  	private static WebElement sl_ReportPrintBtn;*/
	  	
	  	@FindBy (xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[3]")
	  	private static WebElement sl_ReportPrintBtn;
	  	

	  
	  	@FindBy(xpath="//input[@id='MasterGroup__101']")
	  	private static WebElement reportaccountTxt;
	  	
	  	@FindBy(xpath="//*[@id='MasterGroup__101_table_body']/tr/td[2]")
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
	  		reportaccountTxt.sendKeys("C");
	  		
	  		int reportaccountTxtListCount = reportaccountTxtList.size();
	  		
	  		for(int i=0;i<reportaccountTxtListCount;i++)
	  		{
	  			String data = reportaccountTxtList.get(i).getText();
	  			
	  			if(data.equalsIgnoreCase("Customer A"))
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
	  		String expRow1List = "[Customer A 122-001]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[NDT76 : 1, Sales - Computers, 20.00, , 20.00, 1.40, , 1.40, 20.00, , 20.00, Indian Rupees]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[NDT57 : 1, Bank, , 10.00, 10.00, , 0.70, 0.70, , 10.00, 10.00, Indian Rupees]";
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[NDT57 : 2, Bank, , 5.00, 5.00, , 0.35, 0.35, , 5.00, 5.00, Indian Rupees]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[NDT56 : 1, Sales - Computers, , 5.00, , , 0.35, , , 5.00, , Indian Rupees]";

	  		int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[, , 20.00, 20.00, , 1.40, 1.40, , 20.00, 20.00, , ]";
	  		
	  		/*int report7thRowListCount = report7thRowList.size();
	  		ArrayList<String> report7thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report7thRowListCount;i++)
	  		{
	  			String data = report7thRowList.get(i).getText();
	  			report7thRowListArray.add(data);
	  		}
	  		String actRow7List = report7thRowListArray.toString();
	  		String expRow7List = "[, , 35.00, 18.75, 16.25, 7.10, 1.31, 5.79, 35.00, 18.75, 16.25, ]";*/
	  		
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
	  				
	  		/*System.out.println("actRow7List  : "+actRow7List);
	  		System.out.println("expRow7List  : "+expRow7List);*/
	  		System.out.println("*********************************************************************");
	  				
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List) &&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List) 
	  				/*actRow7List.equalsIgnoreCase(expRow7List)*/ )
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
	  	
	  	@FindBy(xpath="//div[@id='btnCustomizeClose']")
	  	private static WebElement  osr_customizeCloseBtn;
	  	
	  		
	  		
	  		@FindBy(xpath="(//div[@id='dvReportDetails']/div/table/thead)[1]/tr/th")
	  		private static List<WebElement> reportsHeaderList;
	  		
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
	  				
	  				if(data.equalsIgnoreCase("Bank"))
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
	  			String expRow1List = "[NJv : 1, Customer New Reference, , 5.00, 5.00, , 5.00, 5.00, , 0.35, 0.35]";
	  			
	  			
	  			int report2ndRowListCount = report2ndRowList.size();
	  			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report2ndRowListCount;i++)
	  			{
	  				String data = report2ndRowList.get(i).getText();
	  				report2ndRowListArray.add(data);
	  			}
	  			String actRow2List = report2ndRowListArray.toString();
	  			String expRow2List = "[NDT57 : 1, Customer A, 10.00, , 5.00, 10.00, , 5.00, 0.70, , 0.35]";
	  			
	  			
	  			int report3rdRowListCount = report3rdRowList.size();
	  			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report3rdRowListCount;i++)
	  			{
	  				String data = report3rdRowList.get(i).getText();
	  				report3rdRowListArray.add(data);
	  			}
	  			String actRow3List = report3rdRowListArray.toString();
	  			String expRow3List = "[NDT57 : 2, Customer A, 5.00, , 10.00, 5.00, , 10.00, 0.35, , 0.70]";
	  			
	  			
	  			int report4thRowListCount = report4thRowList.size();
	  			ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report4thRowListCount;i++)
	  			{
	  				String data = report4thRowList.get(i).getText();
	  				report4thRowListArray.add(data);
	  			}
	  			String actRow4List = report4thRowListArray.toString();
	  			String expRow4List = "[NDT57 : 3, Vendor Semi Adjustment, 5.00, , 15.00, 5.00, , 15.00, 0.35, , 1.05]";

	  			int report5thRowListCount = report5thRowList.size();
	  			ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report5thRowListCount;i++)
	  			{
	  				String data = report5thRowList.get(i).getText();
	  				report5thRowListArray.add(data);
	  			}
	  			String actRow5List = report5thRowListArray.toString();
	  			String expRow5List = "[NDT57 : 4, Customer Semi Adjustment, 5.00, , 20.00, 5.00, , 20.00, 0.35, , 1.40]";
	  			
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
	  			
	  		
	  			
	  			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	  			
	  			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	  			String expvalidationConfirmationMessage = "true";


	  			System.out.println("validationConfirmationMessage : "+actvalidationConfirmationMessage+" Value Expected : "+expvalidationConfirmationMessage);

	  			
	  			Thread.sleep(2000);
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
	  			enterDefaultAccTxt.sendKeys("Vendor Full Adjustment");
	  			
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
	  			String expRow1List = "[FIFO COGS ACC INV FIFO COGS ACC INV]";
	  			
	  			
	  			int report2ndRowListCount = report2ndRowList.size();
	  			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report2ndRowListCount;i++)
	  			{
	  				String data = report2ndRowList.get(i).getText();
	  				report2ndRowListArray.add(data);
	  			}
	  			String actRow2List = report2ndRowListArray.toString();
	  			String expRow2List = "[DebNts : 2, Bank, , , , 10.00, , , 10.00, , 10.00, , 0.70, ]";
	  			
	  			
	  			int report3rdRowListCount = report3rdRowList.size();
	  			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report3rdRowListCount;i++)
	  			{
	  				String data = report3rdRowList.get(i).getText();
	  				report3rdRowListArray.add(data);
	  			}
	  			String actRow3List = report3rdRowListArray.toString();
	  			String expRow3List = "[DebNts : 2, Vendor Full Adjustment, , , , , 10.00, , , 10.00, , 10.00, , 0.70]";
	  			
	  			
	  			int report4thRowListCount = report4thRowList.size();
	  			ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report4thRowListCount;i++)
	  			{
	  				String data = report4thRowList.get(i).getText();
	  				report4thRowListArray.add(data);
	  			}
	  			String actRow4List = report4thRowListArray.toString();
	  			String expRow4List = "[Grand Total, , , , , 10.00, 10.00, , 10.00, 10.00, 10.00, 10.00, 0.70, 0.70]";

	  			/*int report5thRowListCount = report5thRowList.size();
	  			ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report5thRowListCount;i++)
	  			{
	  				String data = report5thRowList.get(i).getText();
	  				report5thRowListArray.add(data);
	  			}
	  			String actRow5List = report5thRowListArray.toString();
	  			String expRow5List = "[ExeStk : 2, EXCESS COGS POSTING ACC, , , , , , 5.00, 5.00, , 5.00, , 5.00, ]";

	  			int report6thRowListCount = report6thRowList.size();
	  			ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report6thRowListCount;i++)
	  			{
	  				String data = report6thRowList.get(i).getText();
	  				report6thRowListArray.add(data);
	  			}
	  			String actRow6List = report6thRowListArray.toString();
	  			String expRow6List = "[NDT50 : 1, BR COGS ACC INV, , , , , , 8.75, 8.75, , 8.75, , 0.61, ]";
	  			
	  			int report7thRowListCount = report7thRowList.size();
	  			ArrayList<String> report7thRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report7thRowListCount;i++)
	  			{
	  				String data = report7thRowList.get(i).getText();
	  				report7thRowListArray.add(data);
	  			}
	  			String actRow7List = report7thRowListArray.toString();
	  			String expRow7List = "[NDT50 : 1, COGS POSTING ACC, , , , , 8.75, , , 8.75, , 8.75, , 0.61]";
	  			
	  			
	  			int report8thRowListCount = report8thRowList.size();
	  			ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report8thRowListCount;i++)
	  			{
	  				String data = report8thRowList.get(i).getText();
	  				report8thRowListArray.add(data);
	  			}
	  			String actRow8List = report8thRowListArray.toString();
	  			String expRow8List = "[NDT50 : 7, BR COGS ACC INV, , , , , , 10.00, 10.00, , 10.00, , 0.70, ]";
	  			
	  			
	  			int report9thRowListCount = report9thRowList.size();
	  			ArrayList<String> report9thRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report9thRowListCount;i++)
	  			{
	  				String data = report9thRowList.get(i).getText();
	  				report9thRowListArray.add(data);
	  			}
	  			String actRow9List = report9thRowListArray.toString();
	  			String expRow9List = "[NDT50 : 7, COGS POSTING ACC, , , , , 10.00, , , 10.00, , 10.00, , 0.70]";
	  			
	  			
	  			int report10thRowListCount = report10thRowList.size();
	  			ArrayList<String> report10thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report10thRowListCount;i++)
	  			{
	  				String data = report10thRowList.get(i).getText();
	  				report10thRowListArray.add(data);
	  			}
	  			String actRow10List = report10thRowListArray.toString();
	  			String expRow10List = "[, , , , , 55.25, 53.75, 53.75, 55.25, 53.75, 55.25, 8.41, 8.52]";
	  			
	  			
	  			int report11thRowListCount = report11thRowList.size();
	  			ArrayList<String> report11thRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report11thRowListCount;i++)
	  			{
	  				String data = report11thRowList.get(i).getText();
	  				report11thRowListArray.add(data);
	  			}
	  			String actRow11List = report11thRowListArray.toString();
	  			String expRow11List = "[SalRet : 1, SR COGS POSTING ACC, , , , , , 9.96, 9.96, , 9.96, , 0.70, ]";
	  			
	  			int report12thRowListCount = report12thRowList.size();
	  			ArrayList<String> report12thRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report12thRowListCount;i++)
	  			{
	  				String data = report12thRowList.get(i).getText();
	  				report12thRowListArray.add(data);
	  			}
	  			String actRow12List = report12thRowListArray.toString();
	  			String expRow12List = "[Grand Total, , , , , , 65.21, 63.71, 63.71, 65.21, 63.71, 65.21, 9.11, 9.21]";
	  			*/
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
	  					
	  			/*System.out.println("actRow5List  : "+actRow5List);
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
	  			System.out.println("expRow10List  : "+expRow10List);*/
	  			System.out.println("*********************************************************************");
	  			
	  			
	  			
	  			if(actRow2List.equalsIgnoreCase(expRow2List) &&
	  					actRow3List.equalsIgnoreCase(expRow3List) &&
	  					actRow4List.equalsIgnoreCase(expRow4List)/* &&
	  					actRow5List.equalsIgnoreCase(expRow5List) &&
	  					actRow6List.equalsIgnoreCase(expRow6List) &&
	  					actRow7List.equalsIgnoreCase(expRow7List) &&
	  					actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List)
	  					&& actRow10List.equalsIgnoreCase(expRow10List)*/)
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
	  		
	  		
	  		
	  	
	  		
	  		@FindBy(xpath="//div[contains(text(),'Backtrack')]")
	  		private static WebElement backTrackBtn;
	  		
	  		
	  		
	  		@FindBy(xpath="//div[contains(text(),'Cancel')]")
	  		private static WebElement cancelBtn;
	  		
	  		@FindBy(xpath="//input[@id='OptCtrlBank']")
	  		private static WebElement reportbankTxt;
	  		
	  		@FindBy(xpath="//*[@id='OptCtrlBank_table_body']/tr/td[2]")
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
	  		
	  		@FindBy(xpath="//*[@id='OptCtrlBank_table_body']/tr/td[2]")
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
	  				if (data.equalsIgnoreCase("Bank")) 
	  				{
	  					bankList.get(i).click();
	  				}
	  			}
	  			
	  			reportbankTxt.sendKeys(Keys.TAB);

	  			Thread.sleep(1500);
	  			
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
	  			String expbankRecRow1List = "[1, Pending, Date Field, DebNts:1, Date Field, 4.75, 0.00, , Debit Notes, , , ]";
	  			
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
	  			String expbankRecRow2List = "[2, Pending, Date Field, NDT57:1, Date Field, 10.00, 0.00, , Receipts VAT, , , ]";
	  			
	  			System.out.println("actbankRecRow2List : "+actbankRecRow2List);
	  			System.out.println("expbankRecRow2List : "+expbankRecRow2List);
	  			
	  		    String actBookBal=bankRecBookBal.getText();
	  		    String expBookBal="10.25 Cr";

	  			String actbankRecOutDebits=bankRecOutDebits.getText();
	  		    String expbankRecOutDebits="29.75 Dr";
	  		
	  			String actbankRecOutCredits=bankRecOutCredits.getText();
	  		    String expbankRecOutCredits="40.00 Cr";
	  		
	  			String actbankRecClearedBal=bankRecClearedBal.getText();
	  		    String expbankRecClearedBal="0.00";
	  		
	  			String actbankRecOpenBal=bankRecOpenBal.getText();
	  		    String expbankRecOpenBal="0.00";
	  			

	  			String actbankRecDebitCounts=bankRecDebitCounts.getText();
	  		    String expbankRecDebitCounts="5";
	  			
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
	  			
	  			Thread.sleep(3000);
	  			
	  			boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	  			
	  			String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	  			String expvalidationConfirmationMessage ="true";
	  			
	  			getDriver().navigate().refresh();
	  			
	  			Thread.sleep(2000);
	  			
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
	  			Thread.sleep(3000);
	  			
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
	  			
	  				if (data.equalsIgnoreCase("Vendor Semi Adjustment")) 
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
	  			String expbankRecRow1List = "[1, Pending, Date Field, NDT81:1, Date Field, 10.00, 0.00, , PettyCash New Reference, , , ]";
	  			
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
	  			String expbankRecRow2List = "[2, , Date Field, , Date Field, , , , , , , ]";
	  			
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
	  				
	  				if(data.equalsIgnoreCase("Bank"))
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
	  			String expRow1List = "[, , Balance as per Books, , 10.25, , , , 10.25, , , , 0.72, , ]";
	  			
	  			
	  			int report2ndRowListCount = report2ndRowList.size();
	  			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report2ndRowListCount;i++)
	  			{
	  				String data = report2ndRowList.get(i).getText();
	  				report2ndRowListArray.add(data);
	  			}
	  			String actRow2List = report2ndRowListArray.toString();
	  			String expRow2List = "[NDT57 : 1, , 10.00, , 10.00, 20.25, 10.00, , 10.00, 20.25, 0.70, , 0.70, 1.42]";
	  			
	  			
	  			int report3rdRowListCount = report3rdRowList.size();
	  			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report3rdRowListCount;i++)
	  			{
	  				String data = report3rdRowList.get(i).getText();
	  				report3rdRowListArray.add(data);
	  			}
	  			String actRow3List = report3rdRowListArray.toString();
	  			String expRow3List = "[NDT57 : 2, , 5.00, , 15.00, 25.25, 5.00, , 15.00, 25.25, 0.35, , 1.05, 1.77]";
	  			
	  			
	  			int report4thRowListCount = report4thRowList.size();
	  			ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report4thRowListCount;i++)
	  			{
	  				String data = report4thRowList.get(i).getText();
	  				report4thRowListArray.add(data);
	  			}
	  			String actRow4List = report4thRowListArray.toString();
	  			String expRow4List = "[NJv : 1, , , 5.00, 10.00, 20.25, , 5.00, 10.00, 20.25, , 0.35, 0.70, 1.42]";

	  			int report5thRowListCount = report5thRowList.size();
	  			ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report5thRowListCount;i++)
	  			{
	  				String data = report5thRowList.get(i).getText();
	  				report5thRowListArray.add(data);
	  			}
	  			String actRow5List = report5thRowListArray.toString();
	  			String expRow5List = "[NDT78 : 1, , , 10.00, , 10.25, , 10.00, , 10.25, , 0.70, , 0.72]";
	  			
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

	  		// Cheque Discounting
	  		
	  		
	  		

	  		@FindBy(xpath="//input[@id='optnCtrlCheqDisBank']")
	  		private static WebElement bankAccountTxt;
	  		
	  		
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
	  	
	  		
	  		@FindBy(xpath="//*[@id='optnCtrlCheqDisBank_table_body']/tr/td[2]")
	  		private static List<WebElement>  chequeDisList; 
	  		
	  		@FindBy(xpath="//*[@id='ChequeDiscountingTable_body']/tr[1]/td")
	  		private static List<WebElement>  chequeDisBodyGridList; 
	  		
	  		
	  		
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
	  				if (data.equalsIgnoreCase("Bank"))
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
	  				
	  				if (i==4)
	  				{
	  					data="Date Field";
	  				}
	  				
	  				if (i==11)
	  				{
	  					data="Date Field";
	  				}
	  				chequeDisBodyGridListArray.add(data);
	  				
	  			}
	  			
	  			String actchequeDisBodyGridList=chequeDisBodyGridListArray.toString();
	  			String expchequeDisBodyGridList="[, , , , Date Field, , , , , , , Date Field, ]";
	  			
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

	  			int reportBodyListCount = reportBodyList.size();
	  			HashSet<String> reportBodyListArray = new HashSet<String>();
	  			for(int i=1;i<reportBodyListCount;i++)
	  			{
	  				if (i!=1 && i!=6 && i!=7 && i!=12 && i!=13 && i!=18 && i!=19 && i!=24 && i!=25 && i!=30 && i!=31 && i!=37 && i!=42 && i!=43 && i!=48 && i!=49 && i!=54 && i!=56 && i!=60) 
	  				{
	  					String data = reportBodyList.get(i).getText();
	  					reportBodyListArray.add(data);
	  					System.out.println(i+". "+data);
	  				}
	  			}
	  			
	  			/*Calendar cal=Calendar.getInstance();
	  			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	  			String currentDate = df.format(cal.getTime());*/
	  			
	  			String actreportBodyList = reportBodyListArray.toString();
	  			
	  			String expreportBodyList = "[NDT76 : 1, April total, , STD RATE COGS ITEM, 5.00, 15.00, NDT56 : 1, 20.00, 2.00, 1.00]";
	  			
	  			System.out.println(actreportBodyList);
	  			
	  			System.out.println(expreportBodyList);
	  			
	  			
	  			/*int reportsRow1ListCount = report1stRowList.size();
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
	  			String expRow2List = "[SalRet : 1, STD RATE COGS ITEM, 120.00, 12.00]";
	  			
	  			
	  			int report3rdRowListCount = report3rdRowList.size();
	  			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report3rdRowListCount;i++)
	  			{
	  				String data = report3rdRowList.get(i).getText();
	  				report3rdRowListArray.add(data);
	  			}
	  			String actRow3List = report3rdRowListArray.toString();
	  			String expRow3List = "[NDT50 : 4, FIFO COGS ITEM, 60.00, 6.00]";
	  			
	  			
	  			int report4thRowListCount = report4thRowList.size();
	  			ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report4thRowListCount;i++)
	  			{
	  				String data = report4thRowList.get(i).getText();
	  				report4thRowListArray.add(data);
	  			}
	  			String actRow4List = report4thRowListArray.toString();
	  			String expRow4List = "[NDT50 : 5, WA COGS ITEM, 30.00, 3.00]";

	  			int report5thRowListCount = report5thRowList.size();
	  			ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report5thRowListCount;i++)
	  			{
	  				String data = report5thRowList.get(i).getText();
	  				report5thRowListArray.add(data);
	  			}
	  			String actRow5List = report5thRowListArray.toString();
	  			String expRow5List = "[NDT50 : 6, STD RATE COGS ITEM, 120.00, 12.00]";

	  			int report6thRowListCount = report6thRowList.size();
	  			ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report6thRowListCount;i++)
	  			{
	  				String data = report6thRowList.get(i).getText();
	  				report6thRowListArray.add(data);
	  			}
	  			String actRow6List = report6thRowListArray.toString();
	  			String expRow6List = "[NDT50 : 7, STD RATE COGS ITEM, 120.00, 12.00]";
	  			
	  			int report7thRowListCount = report7thRowList.size();
	  			ArrayList<String> report7thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report7thRowListCount;i++)
	  			{
	  				String data = report7thRowList.get(i).getText();
	  				report7thRowListArray.add(data);
	  			}
	  			String actRow7List = report7thRowListArray.toString();
	  			String expRow7List = "[NDT50 : 7, WA COGS ITEM, 100.00, 10.00]";
	  			
	  			
	  			int report8thRowListCount = report8thRowList.size();
	  			ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report8thRowListCount;i++)
	  			{
	  				String data = report8thRowList.get(i).getText();
	  				report8thRowListArray.add(data);
	  			}
	  			String actRow8List = report8thRowListArray.toString();
	  			String expRow8List = "[NDT50 : 7, FIFO COGS ITEM, 90.00, 9.00]";
	  			
	  			
	  			int report9thRowListCount = report9thRowList.size();
	  			ArrayList<String> report9thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report9thRowListCount;i++)
	  			{
	  				String data = report9thRowList.get(i).getText();
	  				report9thRowListArray.add(data);
	  			}
	  			String actRow9List = report9thRowListArray.toString();
	  			String expRow9List = "[NDT50 : 7, BR COGS ITEM, 120.00, 12.00]";
	  			
	  			int report10thRowListCount = report10thRowList.size();
	  			ArrayList<String> report10thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report10thRowListCount;i++)
	  			{
	  				String data = report10thRowList.get(i).getText();
	  				if (i==2) 
	  				{
	  				data="MonthField";	
	  				}
	  				report10thRowListArray.add(data);
	  			}
	  			String actRow10List = report10thRowListArray.toString();
	  			String expRow10List = "[MonthField, , 620.00, 62.00]";
	  			
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
	  			System.out.println("*********************************************************************");*/
	  			
	  			if(/*actRow1List.equalsIgnoreCase(expRow1List) &&
	  					actRow2List.equalsIgnoreCase(expRow2List) &&
	  					actRow3List.equalsIgnoreCase(expRow3List) &&
	  					actRow4List.equalsIgnoreCase(expRow4List) &&
	  					actRow5List.equalsIgnoreCase(expRow5List) &&
	  					actRow6List.equalsIgnoreCase(expRow6List) &&
	  					actRow7List.equalsIgnoreCase(expRow7List) &&
	  					actRow8List.equalsIgnoreCase(expRow8List) && 
	  					actRow9List.equalsIgnoreCase(expRow9List) &&
	  					actRow10List.equalsIgnoreCase(expRow10List) &&*/  actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
	  					actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1)
	  					&& actreportBodyList.equalsIgnoreCase(expreportBodyList))
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
	  			String expRow1List = "[NDT56 : 1, Customer A, STD RATE COGS ITEM, 1.00, 5.00, 5.00]";
	  			
	  			int report2ndRowListCount = report2ndRowList.size();
	  			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report2ndRowListCount;i++)
	  			{
	  				String data = report2ndRowList.get(i).getText();
	  				report2ndRowListArray.add(data);
	  			}
	  			String actRow2List = report2ndRowListArray.toString();
	  			String expRow2List = "[, , , 1.00, 5.00, 5.00]";
	  			
	  			
	  			/*int report3rdRowListCount = report3rdRowList.size();
	  			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report3rdRowListCount;i++)
	  			{
	  				String data = report3rdRowList.get(i).getText();
	  				report3rdRowListArray.add(data);
	  			}
	  			String actRow3List = report3rdRowListArray.toString();
	  			String expRow3List = "[SalRet : 1, Customer A, BR COGS ITEM, 12.00, 10.00, 120.00]";
	  			
	  			
	  			int report4thRowListCount = report4thRowList.size();
	  			ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report4thRowListCount;i++)
	  			{
	  				String data = report4thRowList.get(i).getText();
	  				report4thRowListArray.add(data);
	  			}
	  			String actRow4List = report4thRowListArray.toString();
	  			String expRow4List = "[SalRet : 1, Customer A, STD RATE COGS ITEM, 12.00, 10.00, 120.00]";

	  			int report5thRowListCount = report5thRowList.size();
	  			ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report5thRowListCount;i++)
	  			{
	  				String data = report5thRowList.get(i).getText();
	  				report5thRowListArray.add(data);
	  			}
	  			String actRow5List = report5thRowListArray.toString();
	  			String expRow5List = "[, , , 43.00, 40.00, 430.00]";
	 		*/
	  			System.out.println("actRow1List  : "+actRow1List);
	  			System.out.println("expRow1List  : "+expRow1List);
	  			System.out.println("*********************************************************************");
	  					
	  			System.out.println("actRow2List  : "+actRow2List);
	  			System.out.println("expRow2List  : "+expRow2List);
	  			System.out.println("*********************************************************************");
	  			/*		
	  			System.out.println("actRow3List  : "+actRow3List);
	  			System.out.println("expRow3List  : "+expRow3List);
	  			System.out.println("*********************************************************************");
	  					
	  			System.out.println("actRow4List  : "+actRow4List);
	  			System.out.println("expRow4List  : "+expRow4List);
	  			System.out.println("*********************************************************************");
	  					
	  			System.out.println("actRow5List  : "+actRow5List);
	  			System.out.println("expRow5List  : "+expRow5List);
	  			System.out.println("*********************************************************************");*/
	  			
	  			if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  					actRow2List.equalsIgnoreCase(expRow2List)/* &&
	  					actRow3List.equalsIgnoreCase(expRow3List) &&
	  					actRow4List.equalsIgnoreCase(expRow4List) &&
	  					actRow5List.equalsIgnoreCase(expRow5List) */)
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
	  			String expRow1List = "[NDT76 : 1, Customer A, 20.00]";
	  			
	  			
	  			int report2ndRowListCount = report2ndRowList.size();
	  			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report2ndRowListCount;i++)
	  			{
	  				String data = report2ndRowList.get(i).getText();
	  				report2ndRowListArray.add(data);
	  			}
	  			String actRow2List = report2ndRowListArray.toString();
	  			String expRow2List = "[NDT56 : 1, Customer A, 5.00]";
	  			
	  			
	  			int report3rdRowListCount = report3rdRowList.size();
	  			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report3rdRowListCount;i++)
	  			{
	  				String data = report3rdRowList.get(i).getText();
	  				report3rdRowListArray.add(data);
	  			}
	  			String actRow3List = report3rdRowListArray.toString();
	  			String expRow3List = "[April total, , 15.00]";
	  			
	  			
	  			/*int report4thRowListCount = report4thRowList.size();
	  			ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report4thRowListCount;i++)
	  			{
	  				String data = report4thRowList.get(i).getText();
	  				report4thRowListArray.add(data);
	  			}
	  			String actRow4List = report4thRowListArray.toString();
	  			String expRow4List = "[NDT50 : 6, Customer A, 120.00]";

	  			int report5thRowListCount = report5thRowList.size();
	  			ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report5thRowListCount;i++)
	  			{
	  				String data = report5thRowList.get(i).getText();
	  				report5thRowListArray.add(data);
	  			}
	  			String actRow5List = report5thRowListArray.toString();
	  			String expRow5List = "[NDT50 : 7, Customer A, 430.00]";

	  			int report6thRowListCount = report6thRowList.size();
	  			ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report6thRowListCount;i++)
	  			{
	  				String data = report6thRowList.get(i).getText();
	  				report6thRowListArray.add(data);
	  			}
	  			String actRow6List = report6thRowListArray.toString();
	  			String expRow6List = "[SalRet : 1, Customer A, 120.00]";
	  			
	  			int report7thRowListCount = report7thRowList.size();
	  			ArrayList<String> report7thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report7thRowListCount;i++)
	  			{
	  				String data = report7thRowList.get(i).getText();
	  				if (i==2)
	  				{
	  				
	  					data="MonthField";
	  				}
	  				report7thRowListArray.add(data);
	  			}
	  			String actRow7List = report7thRowListArray.toString();
	  			String expRow7List = "[MonthField, , 620.00]";
	  			
	  			int report8thRowListCount = report8thRowList.size();
	  			ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  			for(int i=2;i<report8thRowListCount;i++)
	  			{
	  				String data = report8thRowList.get(i).getText();
	  				report8thRowListArray.add(data);
	  			}
	  			String actRow8List = report8thRowListArray.toString();
	  			String expRow8List = "[, , 620.00]";*/
	  			
	  			
	  			System.out.println("actRow1List  : "+actRow1List);
	  			System.out.println("expRow1List  : "+expRow1List);
	  			System.out.println("*********************************************************************");
	  					
	  			System.out.println("actRow2List  : "+actRow2List);
	  			System.out.println("expRow2List  : "+expRow2List);
	  			System.out.println("*********************************************************************");
	  					
	  			System.out.println("actRow3List  : "+actRow3List);
	  			System.out.println("expRow3List  : "+expRow3List);
	  			System.out.println("*********************************************************************");
	  					
	  		/*	System.out.println("actRow4List  : "+actRow4List);
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
	  			System.out.println("*********************************************************************");*/
	  			
	  			
	  			
	  			if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  					actRow2List.equalsIgnoreCase(expRow2List) &&
	  					actRow3List.equalsIgnoreCase(expRow3List)/* &&
	  					actRow4List.equalsIgnoreCase(expRow4List) &&
	  					actRow5List.equalsIgnoreCase(expRow5List) &&
	  					actRow6List.equalsIgnoreCase(expRow6List) &&
	  					actRow7List.equalsIgnoreCase(expRow7List) &&
	  					actRow8List.equalsIgnoreCase(expRow8List) */)
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
	  			String expRow1List = "[MonthField, 20.00]";
	  			
	  			
	  			int report2ndRowListCount = report2ndRowList.size();
	  			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  			for(int i=1;i<report2ndRowListCount;i++)
	  			{
	  				String data = report2ndRowList.get(i).getText();
	  				report2ndRowListArray.add(data);
	  			}
	  			String actRow2List = report2ndRowListArray.toString();
	  			String expRow2List = "[Grand Total, 20.00]";
	  			
	  	
	  			
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
	  		String expRow1List = "[Customer A, 15.00, 15.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Grand Total, 15.00, 15.00]";
	  		

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


	  	
	  	@FindBy (xpath="//*[@id='tblreportRenderRowDetails']/tbody/tr/td")
	  	private static List<WebElement> reportBackTrackList;
	  	
	  	@FindBy (xpath="//tbody/tr[@id='trRenderMonthlyDay_2']/td[3]")
	  	private static WebElement reportBackTrackDebitCol;
	  	
	  	@FindBy (xpath="//tbody/tr[@id='trRenderMonthlyDay_2']/td[2]")
	  	private static WebElement reportBackTrackCreditCol;
	  	
	  	
	  	
	  	@FindBy (xpath="//*[@id='trRenderMonthlyDayVoucher_3']/td[2]")
	  	private static WebElement reportBackTrackPage2CreditCol;
	  	
	  	@FindBy (xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr/td[2]")
	  	private static List<WebElement> reportTableColumn1RowsList;
	  	

	  		
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
	  			
	  			if(data.equalsIgnoreCase("STD RATE COGS ACC INV"))
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
	  		String expRow1List = "[NDT52 : 1, Vendor New Reference, 5.00, STD RATE COGS ITEM, 1.00, 5.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[NDT52 : 2, Vendor B, 5.00, STD RATE COGS ITEM, 1.00, 5.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=4;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[10.00, , 2.00, 10.00]";
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[, , 10.00, , 2.00, 10.00]";
	  		
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
	  			return true;
	  		}
	  		else
	  		{
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
	  			
	  			if(data.equalsIgnoreCase("STD RATE COGS ACC INV"))
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
	  		
	  		boolean actReportTable = reportsTable.getText().isEmpty();
	  		boolean expReportTable = true;
	  		
	  		System.out.println(actReportTable);
	  		System.out.println(expReportTable);
	  		
	  		
	  		if (actReportTable==expReportTable) 
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
	  			
	  			if(data.equalsIgnoreCase("STD RATE COGS ACC INV"))
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
	  		String expRow1List = "[NDT52 : 1, Vendor New Reference, 5.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=3;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Vendor B, 5.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[April total, , 10.00]";
	  		
	  		
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
	  				actRow3List.equalsIgnoreCase(expRow3List)  && 
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
	  		
	  		
	  		Thread.sleep(3000);
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
	  		String expRow1List = "[NDT52:1, , 5.00, 0.25, , , , , , , , , ]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[NDT52:2, , 5.00, 0.25, , , , , , , , , ]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Grand Total, , , 10.00, 0.50, , , , , , , , , ]";
	  		
	  		
	  		/*int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[NDT57:SU/IND/TEXT3, , 20.00, 1.00, , , , , , , , , ]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[NDT57:SU/IND/TEXT3, , 10.00, 0.50, , , , , , , , , ]";

	  		int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[NDT57:SU/IND/TEXT4, , 10.00, 0.50, , , , , , , , , ]";
	  		
	  		int report7thRowListCount = report7thRowList.size();
	  		ArrayList<String> report7thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report7thRowListCount;i++)
	  		{
	  			String data = report7thRowList.get(i).getText();
	  			report7thRowListArray.add(data);
	  		}
	  		String actRow7List = report7thRowListArray.toString();
	  		String expRow7List = "[NDT57:SU/IND/TEXT4, , 10.00, 0.50, , , , , , , , , ]";
	  		
	  		
	  		int report8thRowListCount = report8thRowList.size();
	  		ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report8thRowListCount;i++)
	  		{
	  			String data = report8thRowList.get(i).getText();
	  			report8thRowListArray.add(data);
	  		}
	  		String actRow8List = report8thRowListArray.toString();
	  		String expRow8List = "[NDT57:SU/IND/TEXT4, , 10.00, 0.50, , , , , , , , , ]";
	  		
	  		
	  		int report9thRowListCount = report9thRowList.size();
	  		ArrayList<String> report9thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report9thRowListCount;i++)
	  		{
	  			String data = report9thRowList.get(i).getText();
	  			report9thRowListArray.add(data);
	  		}
	  		String actRow9List = report9thRowListArray.toString();
	  		String expRow9List = "[NDT57:SU/IND/TEXT5, , 100.00, 5.00, , , , , , , , , ]";
	  		
	  		
	  		int report10thRowListCount = report10thRowList.size();
	  		ArrayList<String> report10thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report10thRowListCount;i++)
	  		{
	  			String data = report10thRowList.get(i).getText();
	  			report10thRowListArray.add(data);
	  		}
	  		String actRow10List = report10thRowListArray.toString();
	  		String expRow10List = "[NDT57:SU/IND/TEXT5, , 120.00, 6.00, , , , , , , , , ]";
	  		
	  		
	  		int report11thRowListCount = report11thRowList.size();
	  		ArrayList<String> report11thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report11thRowListCount;i++)
	  		{
	  			String data = report11thRowList.get(i).getText();
	  			report11thRowListArray.add(data);
	  		}
	  		String actRow11List = report11thRowListArray.toString();
	  		String expRow11List = "[Grand Total, , , 370.00, 18.50, , , , , , , , , ]";*/
	  		
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
	  				
	  		/*System.out.println("actRow4List  : "+actRow4List);
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
	  		*/
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List) /*&&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List) &&
	  				actRow7List.equalsIgnoreCase(expRow7List) &&
	  				actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List)
	  				&& actRow10List.equalsIgnoreCase(expRow10List)&& actRow11List.equalsIgnoreCase(expRow11List)*/ && 
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
	  		
	  		Thread.sleep(2000);
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
	  		enterVATDefaultAccTxt.sendKeys("Bank");
	  		Thread.sleep(2000);
	  		
	  		enterVATDefaultAccTxt.sendKeys(Keys.TAB);
	  	
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
	  		String expRow1List = "[Purchases]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[NDT57 : 1, Bank, Customer A, 10.00, , 15.00, , , 10.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[NDT57 : 4, Bank, Customer Semi Adjustment, 5.00, , 15.00, , , 5.00]";
	  		
	  		////////////////////
	  		
	  		
	  		int reportsRow4thListCount = report4thRowList.size();
	  		ArrayList<String> reportsRow4thListArray = new ArrayList<String>();
	  		for(int i=2;i<reportsRow4thListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			reportsRow4thListArray.add(data);
	  		}
	  		String actRow4List = reportsRow4thListArray.toString();
	  		String expRow4List = "[Purchases]";
	  		
	  		
	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[NDT57 : 1, Bank, Customer A, 10.00, , 15.00, , , 10.00]";
	  		
	  		
	  		int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[NDT57 : 2, Bank, Customer A, 5.00, , 15.00, , , 5.00]";
	  		
	  		int report7thRowListCount = report7thRowList.size();
	  		ArrayList<String> report7thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report7thRowListCount;i++)
	  		{
	  			String data = report7thRowList.get(i).getText();
	  			report7thRowListArray.add(data);
	  		}
	  		String actRow7List = report7thRowListArray.toString();
	  		String expRow7List = "[Grand Total, , , , 20.00, , 75.00, , , 20.00]";
	  		
	  				
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
	  				actRow3List.equalsIgnoreCase(expRow3List)
	  				&& actRow4List.equalsIgnoreCase(expRow4List) && actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List) && actRow7List.equalsIgnoreCase(expRow7List))
	  		{
	  			return true;
	  		}
	  		else
	  		{
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
	  		Thread.sleep(3000);
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
	  		String expRow1List = "[NDT56:1, 5.00, , , , , , , , , , , ]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[, 5.00, , , , , , , , , , , ]";
	  		
	  		
	  		/*int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[NDT50:5, 30.00, , , , , , , , , , , ]";
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[NDT50:6, 120.00, , , , , , , , , , , ]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[NDT50:7, 120.00, , , , , , , , , , , ]";

	  		int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[NDT50:7, 90.00, , , , , , , , , , , ]";
	  		
	  		int report7thRowListCount = report7thRowList.size();
	  		ArrayList<String> report7thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report7thRowListCount;i++)
	  		{
	  			String data = report7thRowList.get(i).getText();
	  			report7thRowListArray.add(data);
	  		}
	  		String actRow7List = report7thRowListArray.toString();
	  		String expRow7List = "[NDT50:7, 120.00, , , , , , , , , , , ]";
	  		
	  		
	  		int report8thRowListCount = report8thRowList.size();
	  		ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report8thRowListCount;i++)
	  		{
	  			String data = report8thRowList.get(i).getText();
	  			report8thRowListArray.add(data);
	  		}
	  		String actRow8List = report8thRowListArray.toString();
	  		String expRow8List = "[NDT50:7, 100.00, , , , , , , , , , , ]";
	  		
	  		
	  		int report9thRowListCount = report9thRowList.size();
	  		ArrayList<String> report9thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report9thRowListCount;i++)
	  		{
	  			String data = report9thRowList.get(i).getText();
	  			report9thRowListArray.add(data);
	  		}
	  		String actRow9List = report9thRowListArray.toString();
	  		String expRow9List = "[, 740.00, , , , , , , , , , , ]";
	  		*/
	  		System.out.println("actRow1List  : "+actRow1List);
	  		System.out.println("expRow1List  : "+expRow1List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow2List  : "+actRow2List);
	  		System.out.println("expRow2List  : "+expRow2List);
	  		System.out.println("*********************************************************************");
	  				
	  		/*System.out.println("actRow3List  : "+actRow3List);
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
	  		System.out.println("expRow9List  : "+expRow9List);*/
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List)/* &&
	  				actRow3List.equalsIgnoreCase(expRow3List) &&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List) &&
	  				actRow7List.equalsIgnoreCase(expRow7List) &&
	  				actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List)*/ && 
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
	  		
	  		Thread.sleep(2000);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	  		sl_DateOptionDropdown.click();
	  		Select s=new Select(sl_DateOptionDropdown);
	  		s.selectByValue("1");
	  		
	  		
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherTypeDropDown));
	  		voucherTypeDropDown.click();
	  		Select s1=new Select(voucherTypeDropDown);
	  		s1.selectByValue("1");
	  		
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
	  		String expRow1List = "[STD RATE COGS ACC INV, 2, , , 2, , , 2, , , 2, 10.50, 2, , , 2, , , 2, ]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Grand Total, 2, , , 2, , , 2, , , 2, 10.50, 2, , , 2, , , 2, ]";
	  		

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
	  		
	  		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
	  				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1))
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
	  		String exppurchaseSupplierName = " [Vendor New Reference, Vendor B]";
	  		
	  		
	  		//Invoice 
	  		

	          int purchaseInvoiceNoListCount = purchaseInvoiceNoList.size();
	  		
	  		ArrayList<String> purchaseInvoiceNoListArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<purchaseInvoiceNoListCount;i++)
	  		{
	  			String data = purchaseInvoiceNoList.get(i).getText();
	  			purchaseInvoiceNoListArray.add(data);
	  		}
	  		
	  		String actpurchaseInvoiceNoList = purchaseInvoiceNoListArray.toString();
	  		String exppurchaseInvoiceNoList = "[NDT52 : 1, NDT52 : 2]";
	  		
	  		
	  		
	  		//Product Description
	  		
	  		int purchaseProductDescListCount = purchaseProductDescList.size();
	  			
	  		ArrayList<String> purchaseProductDescListArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<purchaseProductDescListCount;i++)
	  		{
	  			String data = purchaseProductDescList.get(i).getText();
	  			purchaseProductDescListArray.add(data);
	  		}
	  		
	  		String actpurchaseProductDescList = purchaseInvoiceNoListArray.toString();
	  		String exppurchaseProductDescList = "[NDT52 : 1, NDT52 : 2]";
	  		
	  		
	  		//purchaseValueAED
	  		
	  		int purchaseValueAEDCount = purchaseValueAED.size();
	  		
	  		ArrayList<String> purchaseValueAEDArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<purchaseProductDescListCount;i++)
	  		{
	  			String data = purchaseValueAED.get(i).getText();
	  			purchaseValueAEDArray.add(data);
	  		}
	  		
	  		String actpurchaseValueAED = purchaseValueAEDArray.toString();
	  		String exppurchaseValueAED = "[5.00, 5.00]";
	  		
	  		
	  		//purchaseVATVAlueAED
	  		
	  		
	          int purchaseVATVAlueAEDCount = purchaseVATVAlueAED.size();
	  		
	  		ArrayList<String> purchaseVATVAlueAEDArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<purchaseVATVAlueAEDCount;i++)
	  		{
	  			String data = purchaseVATVAlueAED.get(i).getText();
	  			purchaseVATVAlueAEDArray.add(data);
	  		}
	  		
	  		String actpurchaseVATVAlueAED = purchaseVATVAlueAEDArray.toString();
	  		String exppurchaseVATVAlueAED = "[0.25, 0.25]";
	  		
	  		
	  		//purchaseTAxcode
	  		
	         int purchaseTAxcodeCount = purchaseTAxcode.size();
	  		
	  		ArrayList<String> purchaseTAxcodeArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<purchaseTAxcodeCount;i++)
	  		{
	  			String data = purchaseTAxcode.get(i).getText();
	  			purchaseTAxcodeArray.add(data);
	  		}
	  		
	  		String actpurchaseTAxcode = purchaseTAxcodeArray.toString();
	  		String exppurchaseTAxcode = "[SR-REC, SR-REC]";
	  		
	  		
	  		
	  		String actpurchaseTransCountTotal=purchaseTransCountTotal.getText();
	  		String exppurchaseTransCountTotal= "2.00";
	  		
	  		System.out.println("purchaseTransCountTotal   : "+actpurchaseTransCountTotal);
	  		
	  		String actpurchaseVatTotalAED=purchaseVatTotalAED.getText();
	  		String exppurchaseVatTotalAED= "0.50";
	  		
	  		String actpurchaseTotalAED=purchaseTotalAED.getText();
	  		String exppurchaseTotalAED= "10.00";
	  		
	  		
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
	  		String expCustomerNameList = "[Customer A]";
	  		
	  		
	  		// Sales Invoice 
	  		

	          int salesInvoiceNoListCount = salesInvoiceNoList.size();
	  		
	  		ArrayList<String> salesInvoiceNoListArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<salesInvoiceNoListCount;i++)
	  		{
	  			String data = salesInvoiceNoList.get(i).getText();
	  			salesInvoiceNoListArray.add(data);
	  		}
	  		
	  		String actsalesInvoiceNoList = salesInvoiceNoListArray.toString();
	  		String expsalesInvoiceNoList = "[NDT56 : 1]";
	  		
	  		
	  		
	  		//Sales Product Description
	  		
	  		int salesProductDescListCount = salesProductDescList.size();
	  			
	  		ArrayList<String> salesProductDescListArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<salesProductDescListCount;i++)
	  		{
	  			String data = salesProductDescList.get(i).getText();
	  			salesProductDescListArray.add(data);
	  		}
	  		
	  		String actsalesProductDescList = salesProductDescListArray.toString();
	  		String expsalesProductDescList = "[STD RATE COGS ITEM]";
	  		
	  		
	  		//Sales Value AED
	  		
	  		int salesSupplyValueAEDCount = salesSupplyValueAED.size();
	  		
	  		ArrayList<String> salesSupplyValueAEDArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<salesSupplyValueAEDCount;i++)
	  		{
	  			String data = salesSupplyValueAED.get(i).getText();
	  			salesSupplyValueAEDArray.add(data);
	  		}
	  		
	  		String actsalesSupplyValueAED = salesSupplyValueAEDArray.toString();
	  		String expsalesSupplyValueAED = "[-5.00]";
	  		
	  		//Sales TAxcode
	  		
	         int salesTaxcodeCount = salesTaxcode.size();
	  		
	  		ArrayList<String> salesTaxcodeArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<salesTaxcodeCount;i++)
	  		{
	  			String data = salesTaxcode.get(i).getText();
	  			salesTaxcodeArray.add(data);
	  		}
	  		
	  		String actsalesTaxcode = salesTaxcodeArray.toString();
	  		String expsalesTaxcode = "[SR]";
	  		
	  		
	  		
	  		String actSalesTransCountTotal=salesTransCountTotal.getText();
	  		String expSalesTransCountTotal= "1.00";
	  		
	  		System.out.println("actSalesTransCountTotal   : "+actSalesTransCountTotal);
	  		
	  		String actsalesVatTotalAED=salesVatTotalAED.getText();
	  		String expsalesVatTotalAED= "0.00";
	  		
	  		String actsalesTotalAED=salesTotalAED.getText();
	  		String expsalesTotalAED= "-5.00";
	  		
	  		
	  		//Ledger
	  		
	          int ledgerAccountIDListCount = ledgerAccountIDList.size();
	  		
	  		ArrayList<String> ledgerAccountIDListArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<ledgerAccountIDListCount;i++)
	  		{
	  			String data = ledgerAccountIDList.get(i).getText();
	  			ledgerAccountIDListArray.add(data);
	  		}
	  		
	  		String actledgerAccountIDList =ledgerAccountIDListArray.toString();
	  		String expledgerAccountIDList = "[PURCHASE VARIANCE, STD RATE COGS ACC INV, VAT INPUT, Vendor New Reference, PURCHASE VARIANCE, STD RATE COGS ACC INV, VAT INPUT, 033-002, 122-001, 071-001, SR COGS POSTING ACC, STD RATE COGS ACC INV, 121-001, 122-001, 121-001, 122-001, 121-001, Vendor Semi Adjustment, 121-001, Customer Semi Adjustment, 121-001, Customer Semi Adjustment]";
	  		
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
	  		String expledgerAccountNameList = "[PURCHASE VARIANCE, STD RATE COGS ACC INV, VAT INPUT, Vendor New Reference, PURCHASE VARIANCE, STD RATE COGS ACC INV, VAT INPUT, Vendor B, Customer A, Sales - Computers, SR COGS POSTING ACC, STD RATE COGS ACC INV, Bank, Customer A, Bank, Customer A, Bank, Vendor Semi Adjustment, Bank, Customer Semi Adjustment, Bank, Customer Semi Adjustment]";
	  		
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
	  		String expledgerTransDescList = "[Purchases Voucher VAT, Purchases Voucher VAT, Purchases Voucher VAT, Purchases Voucher VAT, Purchases Voucher VAT, Purchases Voucher VAT, Purchases Voucher VAT, Purchases Voucher VAT, Sales Returns VAT, Sales Returns VAT, Sales Returns VAT, Sales Returns VAT, Receipts VAT, Receipts VAT, Receipts VAT, Receipts VAT, Receipts VAT, Receipts VAT, Receipts VAT, Receipts VAT, Payments VAT, Payments VAT]";
	  		
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
	  		String expledgerNameList = "[PURCHASE VARIANCE, STD RATE COGS ACC INV, VAT INPUT, Vendor New Reference, PURCHASE VARIANCE, STD RATE COGS ACC INV, VAT INPUT, Vendor B, Customer A, Sales - Computers, SR COGS POSTING ACC, STD RATE COGS ACC INV, Bank, Customer A, Bank, Customer A, Bank, Vendor Semi Adjustment, Bank, Customer Semi Adjustment, Bank, Customer Semi Adjustment]";
	  		
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
	  		String expledgeDebitList = "[0.00, -120.00, -0.25, 0.00, 0.00, -120.00, -0.25, 0.00, 0.00, -5.00, 0.00, -120.00, -10.00, 0.00, -5.00, 0.00, -5.00, 0.00, -5.00, 0.00, 0.00, -5.00]";
	  		
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
	  		String expledgeCreditList = "[115.00, 0.00, 0.00, 5.25, 115.00, 0.00, 0.00, 5.25, 5.00, 0.00, 120.00, 0.00, 0.00, 10.00, 0.00, 5.00, 0.00, 5.00, 0.00, 5.00, 5.00, 0.00]";
	  		
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
	  		String expledgeBalList = " [115.00, -120.00, -0.25, 5.25, 115.00, -120.00, -0.25, 5.25, 5.00, -5.00, 120.00, -120.00, -10.00, 10.00, -5.00, 5.00, -5.00, 5.00, -5.00, 5.00, 5.00, -5.00]";
	  		
	  		System.out.println("ledgeBalList  "+actledgeBalList);
	  		System.out.println("ledgeBalList  "+expledgeBalList);
	  		
	  		
	  		
	  		//GLTCurrency
	  		

	  		String actGLTCurrency=GLTCurrency.getText();
	  		String expGLTCurrency= "AED";
	  		
	  		System.out.println("GLTCurrency   : "+actGLTCurrency +" Value Expected  : "+expGLTCurrency);
	  		
	  		//TransCountTotal
	  		
	  		String actTransCountTotal=TransCountTotal.getText();
	  		String expTransCountTotal= "8.00";
	  		
	  		System.out.println("TransCountTotal   : "+actTransCountTotal +" Value Expected  : "+expTransCountTotal);
	  		
	  		//totalcredit
	  		
	  		String acttotalcredit=totalcredit.getText();
	  		String exptotalcredit= "395.50";
	  		
	  		System.out.println("totalcredit   : "+acttotalcredit +" Value Expected  : "+exptotalcredit);
	  		
	  		
	  		System.out.println("**************************************CheckVatAuditFileReport****************");
	  		
	      	System.out.println("periodEndsTxt           : "+actperiodEndsTxt          +" Value Expected : "+expperiodEndsTxt);
	      	System.out.println("FAFCrestionDateTxt      : "+actFAFCrestionDateTxt     +" Value Expected : "+expFAFCrestionDateTxt);
	      	System.out.println("productVersionTxt       : "+actproductVersionTxt      +" Value Expected : "+expproductVersionTxt);
	      	System.out.println("purchaseSupplierName    : "+actpurchaseSupplierName   +" Value Expected : "+exppurchaseSupplierName);
	      	System.out.println("purchaseInvoiceNoList   : "+actpurchaseInvoiceNoList  +" Value Expected : "+exppurchaseInvoiceNoList);
	      	System.out.println("purchaseProductDescList : "+actpurchaseProductDescList+" Value Expected : "+exppurchaseProductDescList);
	      	System.out.println("purchaseValueAED        : "+actpurchaseValueAED       +" Value Expected : "+exppurchaseValueAED);
	      	System.out.println("purchaseVATVAlueAED     : "+actpurchaseVATVAlueAED    +" Value Expected : "+exppurchaseVATVAlueAED);
	      	System.out.println("purchaseTAxcode         : "+actpurchaseTAxcode        +" Value Expected : "+exppurchaseTAxcode);
	      	System.out.println("purchaseTransCountTotal : "+actpurchaseTransCountTotal+" Value Expected : "+exppurchaseTransCountTotal);
	      	System.out.println("purchaseVatTotalAED     : "+actpurchaseVatTotalAED    +" Value Expected : "+exppurchaseVatTotalAED);
	      	System.out.println("purchaseVatTotalAED     : "+actpurchaseVatTotalAED    +" Value Expected : "+exppurchaseVatTotalAED);
	      	System.out.println("purchaseTotalAED        : "+actpurchaseTotalAED       +" Value Expected : "+exppurchaseTotalAED);
	      	
	      	
	      	System.out.println("CustomerNameList        : "+actCustomerNameList       +" Value Expected : "+expCustomerNameList);
	      	System.out.println("salesInvoiceNoList      : "+actsalesInvoiceNoList     +" Value Expected : "+expsalesInvoiceNoList);
	      	System.out.println("salesProductDescList    : "+actsalesProductDescList   +" Value Expected : "+expsalesProductDescList);
	      	System.out.println("salesSupplyValueAED     : "+actsalesSupplyValueAED           +" Value Expected : "+expsalesSupplyValueAED);
	      	System.out.println("salesTaxcode            : "+actsalesTaxcode           +" Value Expected : "+expsalesTaxcode);
	      	System.out.println("salesTransCountTotal    : "+actSalesTransCountTotal   +" Value Expected : "+expSalesTransCountTotal);
	      	System.out.println("salesVatTotalAED        : "+actsalesVatTotalAED       +" Value Expected : "+expsalesVatTotalAED);
	      	System.out.println("salesTotalAED           : "+actsalesTotalAED          +" Value Expected : "+expsalesTotalAED);
	      	
	      	
	      	
	      	if (/*actpurchaseSupplierName.equalsIgnoreCase(exppurchaseSupplierName) && */actperiodEndsTxt.equalsIgnoreCase(expperiodEndsTxt) && 
	      			actFAFCrestionDateTxt.equalsIgnoreCase(expFAFCrestionDateTxt) && actproductVersionTxt.equalsIgnoreCase(expproductVersionTxt) &&
	      			 actpurchaseValueAED.equalsIgnoreCase(exppurchaseValueAED) && actpurchaseVATVAlueAED.equalsIgnoreCase(exppurchaseVATVAlueAED) &&
	      			 actpurchaseTAxcode.equalsIgnoreCase(exppurchaseTAxcode) && actpurchaseTransCountTotal.equalsIgnoreCase(exppurchaseTransCountTotal) && 
	      			 actpurchaseVatTotalAED.equalsIgnoreCase(exppurchaseVatTotalAED) && actpurchaseTotalAED.equalsIgnoreCase(exppurchaseTotalAED) && 
	      			 
	      			
	      			actSalesTransCountTotal.equalsIgnoreCase(expSalesTransCountTotal) &&  actsalesVatTotalAED.equalsIgnoreCase(expsalesVatTotalAED) && 
	      			actsalesTotalAED.equalsIgnoreCase(expsalesTotalAED) && actGLTCurrency.equalsIgnoreCase(expGLTCurrency) && actTransCountTotal.equalsIgnoreCase(expTransCountTotal) && 
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
	  		
	  		String expvatMonthlyreturnReportList = "[1, Standard rated sales (15%), 0.00, 0.00, 0.00, 1.1, Sales subject to VAT (5%), , , , 2, Sales to customers in VAT implementing GCC countries, , , , 3, Zero rated domestic sales, , , , 4, Exports, , , , 5, Exempt sales, , , , 6, Total sales, 0.00, 0.00, 0.00, 7, Standard rated domestic purchases (15%), 10.00, 0.00, 0.50, 7.1, Standard rated domestic purchases (5%), , , , 8, Import subject to VAT paid at customs (15%), , , , 8.1, Import subject to VAT paid at customs (5%), , , , 9, Import subject to VAT accounted for through reverse change machenism (15%), , , , 9.1, Import subject to VAT accounted for through reverse change machenism (5%), , , , 10, Zero rated purchases, , , , 11, Exempt purchases, , , , 12, Total purchases, 10.00, 0.00, 0.50, 13, Total VAT due for current period, -0.50, 14, Correction from previous period (Between SAR +/- 5,000), , 15, VAT credit carried forward from previous period(s), , , Net VAT due (or claim), N]";
	  		
	  		System.out.println("vatMonthlyreturnReportList  "+actvatMonthlyreturnReportList);
	  		System.out.println("vatMonthlyreturnReportList  "+expvatMonthlyreturnReportList);
	  	
	  		if (actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
	  				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1) && actvatMonthlyreturnReportList.equalsIgnoreCase(expvatMonthlyreturnReportList) )
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
	  		enterVATSalesDefaultItemTxt.sendKeys("STD RATE COGS ITEM");
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
	  		String expRow1List = "[NDT76:1, DateField, , , 20.00, , , ]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=3;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[10.50, , 10.50, , , ]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=3;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[100.00, , 100.00, , , ]";
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=3;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[120.00, , 120.00, , , ]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=3;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[188.50, , 188.50, , , ]";

	  		/*int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=3;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[194.50, , 235.50, , , ]";
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
	  		String expRow1List = "[NDT77 : 1, Customer New Reference, , 20.00, , 20.00, , 2.20]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[, , , 20.00, , 20.00, , 2.20]";
	  		
	  		
	  		/*int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[, , 1,000.00, 1,500.00, 20.00, 30.00, 111.00, 166.50]";
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[, , 1,000.00, 1,500.00, 20.00, 30.00, 111.00, 166.50]";
	  		
	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[, , 1,000.00, 1,500.00, 20.00, 30.00, 111.00, 166.50]";
	  		*/
	  		
	  		System.out.println("actRow1List  : "+actRow1List);
	  		System.out.println("expRow1List  : "+expRow1List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow2List  : "+actRow2List);
	  		System.out.println("expRow2List  : "+expRow2List);
	  		System.out.println("*********************************************************************");
	  				
	  		/*System.out.println("actRow3List  : "+actRow3List);
	  		System.out.println("expRow3List  : "+expRow3List);
	  		System.out.println("*********************************************************************");
	  		
	  		System.out.println("actRow4List  : "+actRow4List);
	  		System.out.println("expRow4List  : "+expRow4List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow5List  : "+actRow5List);
	  		System.out.println("expRow5List  : "+expRow5List);
	  		System.out.println("*********************************************************************");
	  		
	  		*/
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List)/* &&
	  				actRow3List.equalsIgnoreCase(expRow3List) &&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) */&&
	  				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
	  				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
	  		{
	  			
	  			return true;
	  		}
	  		else
	  		{
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
	  		String expRow1List = "[NDT55 : 1, Vendor B, , 31.50, , 31.50, , 2.21]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Grand Total, , , , 31.50, , 31.50, , 2.21]";
	  		
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
	  			
	  			return true;
	  		}
	  		else
	  		{
	  			
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
	  		String expRow1List = "[NDT52 : 1, Bank, 50.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Grand Total, , , 50.00]";
	  		
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
	  			
	  			return true;
	  		}
	  		else
	  		{
	  			
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
	  		String expRow1List = "[DebNts : 1, Vendor New Reference, 4.75]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[DebNts : 2, Bank, 10.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Grand Total, , , 14.75]";
	  		
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
	  				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
	  		{
	  			
	  			return true;
	  		}
	  		else
	  		{
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
	  		
	  		Thread.sleep(3000);
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
	  		String expRow1List = "[NDT57 : 1, Customer A, 10.00, , 10.00, , 0.70, ]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[NDT57 : 2, Customer A, 5.00, , 5.00, , 0.35, ]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[NDT57 : 3, Vendor Semi Adjustment, 5.00, , 5.00, , 0.35, ]";
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[NDT57 : 4, Customer Semi Adjustment, 5.00, , 5.00, , 0.35, ]";
	  		
	  		
	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[Grand Total, , , 25.00, , 25.00, , 1.75, ]";
	  		
	  		
	  		
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
	  				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
	  				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
	  		{
	  			
	  			return true;
	  		}
	  		else
	  		{
	  			
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
	  		String expRow1List = "[NDT58 : 1, Customer Semi Adjustment, , 5.00, , 5.00, , 0.35]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Grand Total, , , , 5.00, , 5.00, , 0.35]";
	  		
	  		/*
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Pmt : 1, Customer A, , 6.00, , 6.00, , 6.00]";
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[Pmt : 2, Bank, , 6.00, , 6.00, , 6.00]";
	  		
	  		
	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[, , , 75.00, , 75.00, , 16.41]";
	  		*/
	  		
	  		System.out.println("actRow1List  : "+actRow1List);
	  		System.out.println("expRow1List  : "+expRow1List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow2List  : "+actRow2List);
	  		System.out.println("expRow2List  : "+expRow2List);
	  		System.out.println("*********************************************************************");
	  				
	  		/*System.out.println("actRow3List  : "+actRow3List);
	  		System.out.println("expRow3List  : "+expRow3List);
	  		System.out.println("*********************************************************************");
	  		System.out.println("actRow4List  : "+actRow4List);
	  		System.out.println("expRow4List  : "+expRow4List);
	  		System.out.println("*********************************************************************");
	  		
	  		System.out.println("actRow5List  : "+actRow5List);
	  		System.out.println("expRow5List  : "+expRow5List);
	  		System.out.println("*********************************************************************");
	  		*/
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List)/* &&
	  				actRow3List.equalsIgnoreCase(expRow3List) &&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) */&&
	  				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
	  				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
	  		{
	  			
	  			return true;
	  		}
	  		else
	  		{
	  			
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
	  		
	  		Thread.sleep(2000);
	  		
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
	  		String expRow1List = "[NDT80 : 1, Bank, Vendor Full Adjustment, 10.00, date Field]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			
	  			if (i==6)
	  			{
	  			   data="date Field";	
	  			}
	  			
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Grand Total, , , , 10.00, date Field]";
	  		
	  		
	  		/*int report3rdRowListCount = report3rdRowList.size();
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
	  		String expRow3List = "[NDT46 : 1, Bank, VAT INPUT, 0.29, date Field]";
	  		
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
	  		String expRow4List = "[NDT46 : 2, HDFC, Customer A, 6.00, date Field]";
	  		
	  		
	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[, , , 12.58, ]";*/
	  		
	  		
	  		System.out.println("actRow1List  : "+actRow1List);
	  		System.out.println("expRow1List  : "+expRow1List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow2List  : "+actRow2List);
	  		System.out.println("expRow2List  : "+expRow2List);
	  		System.out.println("*********************************************************************");
	  				
	  		/*System.out.println("actRow3List  : "+actRow3List);
	  		System.out.println("expRow3List  : "+expRow3List);
	  		System.out.println("*********************************************************************");
	  		System.out.println("actRow4List  : "+actRow4List);
	  		System.out.println("expRow4List  : "+expRow4List);
	  		System.out.println("*********************************************************************");
	  		
	  		System.out.println("actRow5List  : "+actRow5List);
	  		System.out.println("expRow5List  : "+expRow5List);
	  		System.out.println("*********************************************************************");
	  		*/
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&/*
	  				actRow3List.equalsIgnoreCase(expRow3List) &&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List)*/ 
	  				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
	  				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
	  		{
	  			
	  			return true;
	  		}
	  		else
	  		{
	  			
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
	  		String expRow1List = "[NDT79 : 1, Bank, Vendor B, 10.00, date Field]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			
	  			if (i==6)
	  			{
	  			   data="date Field";	
	  			}
	  			
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Grand Total, , , , 10.00, date Field]";
	  		
	  		
	  		/*int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[, , , 12.00, ]";
	  		
	  		*/
	  		
	  		System.out.println("actRow1List  : "+actRow1List);
	  		System.out.println("expRow1List  : "+expRow1List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow2List  : "+actRow2List);
	  		System.out.println("expRow2List  : "+expRow2List);
	  		System.out.println("*********************************************************************");
	  				
	  		/*System.out.println("actRow3List  : "+actRow3List);
	  		System.out.println("expRow3List  : "+expRow3List);
	  		System.out.println("*********************************************************************");
	  		*/
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List)/* &&
	  				actRow3List.equalsIgnoreCase(expRow3List) */&&
	  				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
	  				actvalidationConfirmationMessage1.equalsIgnoreCase(actvalidationConfirmationMessage1))
	  		{
	  			
	  			return true;
	  		}
	  		else
	  		{
	  			
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
	  		
	  		
	  		Thread.sleep(3000);
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	  		sl_DateOptionDropdown.click();
	  		Select s=new Select(sl_DateOptionDropdown);
	  		s.selectByValue("1");
	  		
	  		Thread.sleep(2000);
	  		
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
	  		enterJEDefaultItemTxt.sendKeys("STD RATE COGS ITEM");
	  		
	  		Thread.sleep(2000);
	  		
	  		enterJEDefaultItemTxt.sendKeys(Keys.TAB);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	  		filterOkButton.click();

	  		Thread.sleep(2000);
	  		
	          getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));

	  		int reportBodyListCount = reportBodyList.size();
	  		HashSet<String> reportBodyListArray = new HashSet<String>();
	  		for(int i=1;i<reportBodyListCount;i++)
	  		{
	  			if (i!=1 && i!=14 && i!=15 && i!=28 && i!=29 && i!=42 && i!=43 && i!=56 && i!=57 && i!=70 && i!=71 && i!=84 && i!=85 && i!=98 && i!=99 && i!=112) 
	  			{
	  				String data = reportBodyList.get(i).getText();
	  				reportBodyListArray.add(data);
	  				System.out.println(i+". "+data);
	  			}
	  		}
	  		
	  		/*Calendar cal=Calendar.getInstance();
	  		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	  		String currentDate = df.format(cal.getTime());*/
	  		
	  		String actreportBodyList = reportBodyListArray.toString();
	  		
	  		String expreportBodyList = "[, 35.50, 7.67, 5.00, 1,351.50, 5.25, NDT56 : 1, Sales - Computers, Vendor New Reference, 18.55, Customer A, 1.40, NDT52 : 1, 114.75, NDT52 : 2, 109.50, 94.61, 2.49, 229.50, Grand Total, 8.03, 033-002, 071-001, 14.67, 20.00, 8.40, 120.00, 16.42, 122-001, Vendor B, 234.50, NDT76 : 1, 0.37, STD RATE COGS ACC INV, 0.35, 265.00, 16.07, 209.50]";
	  		
	  		System.out.println(actreportBodyList);
	  		
	  		System.out.println(expreportBodyList);
	  		
	  		/*int reportsRow1ListCount = report1stRowList.size();
	  		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  		for(int i=2;i<reportsRow1ListCount;i++)
	  		{
	  			String data = report1stRowList.get(i).getText();
	  			reportsRow1ListArray.add(data);
	  		}
	  		String actRow1List = reportsRow1ListArray.toString();
	  		String expRow1List = "[NDT50 : 5, Sales - Computers, , 30.00, 30.00, 071-001, , 30.00, 30.00, , 2.10, 2.10]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[NDT50 : 5, Customer A, 30.00, , , 122-001, 30.00, , , 2.10, , ]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[NDT50 : 7, Customer A, 100.00, , 100.00, 122-001, 100.00, , 100.00, 7.00, , 7.00]";
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[NDT50 : 7, Sales - Computers, , 100.00, , 071-001, , 100.00, , , 7.00, ]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[NDT57 : SU/IND/TEXT5, Vendor B, , 126.00, 126.00, 033-002, , 126.00, 126.00, , 8.82, 8.82]";

	  		int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[NDT57 : SU/IND/TEXT5, WA COGS ACC INV, 100.00, , 26.00, WA COGS ACC INV, 100.00, , 26.00, 7.00, , 1.82]";
	  		
	  		int report7thRowListCount = report7thRowList.size();
	  		ArrayList<String> report7thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report7thRowListCount;i++)
	  		{
	  			String data = report7thRowList.get(i).getText();
	  			report7thRowListArray.add(data);
	  		}
	  		String actRow7List = report7thRowListArray.toString();
	  		String expRow7List = "[NDT57 : SU/IND/TEXT5, Vendor B, , 105.00, 131.00, 033-002, , 105.00, 131.00, , 7.35, 9.17]";
	  		
	  		
	  		int report8thRowListCount = report8thRowList.size();
	  		ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report8thRowListCount;i++)
	  		{
	  			String data = report8thRowList.get(i).getText();
	  			report8thRowListArray.add(data);
	  		}
	  		String actRow8List = report8thRowListArray.toString();
	  		String expRow8List = "[NDT57 : SU/IND/TEXT5, WA COGS ACC INV, 120.00, , 11.00, WA COGS ACC INV, 120.00, , 11.00, 8.40, , 0.77]";
	  		
	  		
	  		int report9thRowListCount = report9thRowList.size();
	  		ArrayList<String> report9thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report9thRowListCount;i++)
	  		{
	  			String data = report9thRowList.get(i).getText();
	  			report9thRowListArray.add(data);
	  		}
	  		String actRow9List = report9thRowListArray.toString();
	  		String expRow9List = "[Grand Total, , , 350.00, 361.00, 224.00, , 350.00, 361.00, 224.00, 24.50, 25.27, 15.68]";
	  		
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
	  		System.out.println("expRow9List  : "+expRow9List);*/
	  		
	  		if(/*actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List) &&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List) &&
	  				actRow7List.equalsIgnoreCase(expRow7List) &&
	  				actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List) && */
	  				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage) && 
	  				actvalidationConfirmationMessage1.equalsIgnoreCase(expvalidationConfirmationMessage1)
	  				&& actreportBodyList.equalsIgnoreCase(expreportBodyList))
	  		{
	  			
	  			return true;
	  		}
	  		else
	  		{
	  			
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
	  		enterJEDefaultAccTxt.sendKeys("Vendor B");
	  		
	  		Thread.sleep(2000);
	  		
	  		enterJEDefaultAccTxt.sendKeys(Keys.TAB);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	  		filterOkButton.click();
	  	
	  		Thread.sleep(2000);
	  		
	          getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	  		
	  		int reportsRow1ListCount = report1stRowList.size();
	  		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  		for(int i=4;i<reportsRow1ListCount;i++)
	  		{
	  			String data = report1stRowList.get(i).getText();
	  			reportsRow1ListArray.add(data);
	  		}
	  		String actRow1List = reportsRow1ListArray.toString();
	  		String expRow1List = "[Vendor B, 5.25]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Grand Total, , , , 5.25]";
	  		
	  		
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
	  			
	  			return true;
	  		}
	  		else
	  		{
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
	  		String expRow1List = "[Customer A, STD RATE COGS ITEM, 1.00, 15.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[, , 1.00, 15.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Grand Total, , 1.00, 15.00]";
	  		
	  		
	  		/*int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[Customer A, WA COGS ITEM, 13.00, 130.00]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[, , 62.00, 620.00]";

	  		int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[Grand Total, , 62.00, 620.00]";
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
	  				
	  		/*System.out.println("actRow4List  : "+actRow4List);
	  		System.out.println("expRow4List  : "+expRow4List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow5List  : "+actRow5List);
	  		System.out.println("expRow5List  : "+expRow5List);
	  		System.out.println("*********************************************************************");
	  		
	  		System.out.println("actRow6List  : "+actRow6List);
	  		System.out.println("expRow6List  : "+expRow6List);
	  		System.out.println("*********************************************************************");
	  		*/
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List) /*&&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List)*/ &&
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

	  	
	  	public boolean checkSalesGroupedByCustomerReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
	  		String expRow1List = "[Customer A, BR COGS ITEM, 22.00, 220.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Customer A, FIFO COGS ITEM, 15.00, 150.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Customer A, STD RATE COGS ITEM, 12.00, 120.00]";
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[Customer A, WA COGS ITEM, 13.00, 130.00]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[, , 62.00, 620.00]";

	  		int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[Grand Total, , 62.00, 620.00]";
	  		
	  		
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

	  	

	  	
	  	
	  	public boolean checkSalesGroupedByProductReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  	{
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
	  		String expRow1List = "[STD RATE COGS ITEM, Customer A, 1.00, 15.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[, , 1.00, 15.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Grand Total, , 1.00, 15.00]";
	  		
	  		
	  		/*int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[, , 15.00, 150.00]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[STD RATE COGS ITEM, Customer A, 12.00, 120.00]";

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
	  		String expRow7List = "[WA COGS ITEM, Customer A, 13.00, 130.00]";
	  		
	  		
	  		int report8thRowListCount = report8thRowList.size();
	  		ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report8thRowListCount;i++)
	  		{
	  			String data = report8thRowList.get(i).getText();
	  			report8thRowListArray.add(data);
	  		}
	  		String actRow8List = report8thRowListArray.toString();
	  		String expRow8List = "[, , 13.00, 130.00]";
	  		
	  		
	  		int report9thRowListCount = report9thRowList.size();
	  		ArrayList<String> report9thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report9thRowListCount;i++)
	  		{
	  			String data = report9thRowList.get(i).getText();
	  			report9thRowListArray.add(data);
	  		}
	  		String actRow9List = report9thRowListArray.toString();
	  		String expRow9List = "[Grand Total, , 62.00, 620.00]";*/
	  		
	  		System.out.println("actRow1List  : "+actRow1List);
	  		System.out.println("expRow1List  : "+expRow1List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow2List  : "+actRow2List);
	  		System.out.println("expRow2List  : "+expRow2List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow3List  : "+actRow3List);
	  		System.out.println("expRow3List  : "+expRow3List);
	  		System.out.println("*********************************************************************");
	  				
	  		/*System.out.println("actRow4List  : "+actRow4List);
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
	  		System.out.println("expRow9List  : "+expRow9List);*/
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List) /*&&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List) &&
	  				actRow7List.equalsIgnoreCase(expRow7List) &&
	  				actRow8List.equalsIgnoreCase(expRow8List) && actRow9List.equalsIgnoreCase(expRow9List)*/ && 
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

	  	
	  	public boolean checkSalesGroupedByDepartmentReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  	{
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
	  		
	  		
	  		Thread.sleep(3000);
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
	  		String expRow1List = "[DUBAI, STD RATE COGS ITEM, 1.00, 15.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[, , 1.00, 15.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Grand Total, , 1.00, 15.00]";
	  		
	  		
	  		/*int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[DUBAI, STD RATE COGS ITEM, 12.00, 120.00]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[, , 62.00, 620.00]";

	  		int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[Grand Total, , 62.00, 620.00]";
	  		System.out.println("*********************************************************************");
	  		
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
	  				
	  		/*System.out.println("actRow4List  : "+actRow4List);
	  		System.out.println("expRow4List  : "+expRow4List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow5List  : "+actRow5List);
	  		System.out.println("expRow5List  : "+expRow5List);
	  		System.out.println("*********************************************************************");
	  				
	  		System.out.println("actRow6List  : "+actRow6List);
	  		System.out.println("expRow6List  : "+expRow6List);
	  		System.out.println("*********************************************************************");*/
	  		
	  		if(actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List) /*&&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List)*/ &&
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
	  			
	  			if(data.equalsIgnoreCase("STD RATE COGS ACC INV"))
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
	  		String expRow1List = "[Vendor B, STD RATE COGS ITEM, 1.00, 5.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[, , 1.00, 5.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Vendor New Reference, STD RATE COGS ITEM, 1.00, 5.00]";
	  		
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[, , 1.00, 5.00]";
	  		
	  		
	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[Grand Total, , 2.00, 10.00]";
	  		

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


	  	
	  	
	  	@FindBy(xpath="//input[@id='txtUsername']")
	  	private static WebElement userName;
	  	
	  	
	  	
	  	// Purchases Grouped by Product
	  	
	  	
	  	public boolean checkPurchasesGroupedByProductReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  	{
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
	  			
	  			if(data.equalsIgnoreCase("STD RATE COGS ACC INV"))
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
	  		String expRow1List = "[STD RATE COGS ITEM, Vendor B, 1.00, 5.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[STD RATE COGS ITEM, Vendor New Reference, 1.00, 5.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[, , 2.00, 10.00]";
	  		

	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> reportRow4thListArray = new ArrayList<String>();
	  		for(int i=1;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			reportRow4thListArray.add(data);
	  		}
	  		String actRow4List = reportRow4thListArray.toString();
	  		String expRow4List = "[Grand Total, , 2.00, 10.00]";
	  		
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
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List) &&
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
	  			
	  			if(data.equalsIgnoreCase("STD RATE COGS ACC INV"))
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
	  		String expRow1List = "[DUBAI, STD RATE COGS ITEM, 2.00, 10.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[, , 2.00, 10.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Grand Total, , 2.00, 10.00]";
	  		
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

	  	
	
	  		
	  	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[10]/ul/li/a/span")
	  	private static List<WebElement> miscellaneousAnalysisReportList;
	  	
	 
	  
	  	@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[1]")
	  	private static WebElement reportSortingBtn;	
	  	
	  		
	  	@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/ul/li[1]")
	  	private static WebElement sortingAscendingBtn;	
	  	
	  	@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/ul/li[2]")
	  	private static WebElement sortingDecendingBtn;	
	  		
	     
	  	
	  	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[2]")
	  	private static List<WebElement> report1stColList;
	  	
	  	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[3]")
	  	private static List<WebElement> report2ndColList;
	  	
	  	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[4]")
	  	private static List<WebElement> report3rdColList;
	  	
	  	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[5]")
	  	private static List<WebElement> report4thColList;
	  	
	  	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr/td[6]")
	  	private static List<WebElement> report5thColList;
	  	
	  
	  	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[11]/ul/li/a/span")
	  	private static List<WebElement> mastersInformationReportList;
	  	
	  
	  	
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
	  	
	  	@FindBy(xpath="//*[@id='RITTable__0_table_body']/tr/td[2]")
	  	private static List<WebElement> reportVoucherTxtList;
	  	
	  		
	  	@FindBy(xpath="//input[@id='RITTable__0']")
	  	private static WebElement reportUsersTxt;
	  	
	  	@FindBy(xpath="//*[@id='RITTable__0_table_body']/tr/td[2]")
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
	  	
	  	@FindBy(xpath="//input[@id='RITCheckbox__12']")
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
	  		trailBalFilterAccTxt.sendKeys("Bank");
	  		
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
	  		String expRow1List = "[Bank, 121-001, Bank, , 10.25, , , , 10.25, 29.75, 40.00, , 10.25, , , , 10.25, 29.75, 40.00, , 0.72, , , , 0.72, 2.08, 2.80, , , ]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Grand Total, , , , 10.25, , , , 10.25, 29.75, 40.00, , 10.25, , , , 10.25, 29.75, 40.00, , 0.72, , , , 0.72, 2.08, 2.80, , , ]";
	  		

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
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportWithLevel_CloseBtn));
	  		reportWithLevel_CloseBtn.click();
	  		
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
	  		String expRow1List = "[REVENUE, 007, REVENUE, , 15.00, , , , 15.00, 5.00, 20.00, , 15.00, , , , 15.00, 5.00, 20.00, , 1.05, , , , 1.05, 0.35, 1.40, , 11.11, 11.11, 11.11]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[071, SALES, , 15.00, , , , 15.00, 5.00, 20.00, , 15.00, , , , 15.00, 5.00, 20.00, , 1.05, , , , 1.05, 0.35, 1.40, , 11.11, 11.11, 11.11]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[071-001, Sales - Computers, , 15.00, , , , 15.00, 5.00, 20.00, , 15.00, , , , 15.00, 5.00, 20.00, , 1.05, , , , 1.05, 0.35, 1.40, , 11.11, 11.11, 11.11]";
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[COGS POSTING ACC, COGS POSTING ACC, 20.00, , , , 20.00, , 20.00, , 20.00, , , , 20.00, , 20.00, , 1.40, , , , 1.40, , 1.40, , , 100.00, 100.00, 100.00]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[SR COGS POSTING ACC, SR COGS POSTING ACC, , 120.00, , , , 120.00, , 120.00, , 120.00, , , , 120.00, , 120.00, , 8.40, , , , 8.40, , 8.40, , 88.89, 88.89, 88.89]";

	  		int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[, , 115.00, , , , 115.00, , 115.00, , 115.00, , , , 115.00, , 115.00, , 8.05, , , , 8.05, , 8.05, , , , , ]";
	  		
	  		int report7thRowListCount = report7thRowList.size();
	  		ArrayList<String> report7thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report7thRowListCount;i++)
	  		{
	  			String data = report7thRowList.get(i).getText();
	  			report7thRowListArray.add(data);
	  		}
	  		String actRow7List = report7thRowListArray.toString();
	  		String expRow7List = "[, , 135.00, 135.00, , , 135.00, 135.00, 140.00, 140.00, 135.00, 135.00, , , 135.00, 135.00, 140.00, 140.00, 9.45, 9.45, , , 9.45, 9.45, 9.80, 9.80, , , , ]";
	  		
	  		
	  		/*int report8thRowListCount = report8thRowList.size();
	  		ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report8thRowListCount;i++)
	  		{
	  			String data = report8thRowList.get(i).getText();
	  			report8thRowListArray.add(data);
	  		}
	  		String actRow8List = report8thRowListArray.toString();
	  		String expRow8List = "[, , 936.85, 936.85, , , 936.85, 936.85, 1,056.85, 1,056.85, 936.85, 936.85, , , 936.85, 936.85, 1,056.85, 1,056.85, 248.65, 248.65, , , 248.65, 248.65, 257.05, 257.05, , , , ]";*/
	  		
	  		
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
	  				
	  		/*System.out.println("actRow8List  : "+actRow8List);
	  		System.out.println("expRow8List  : "+expRow8List);
	  		System.out.println("*********************************************************************");*/
	  		
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) &&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List) &&
	  				actRow4List.equalsIgnoreCase(expRow4List) &&
	  				actRow5List.equalsIgnoreCase(expRow5List) &&
	  				actRow6List.equalsIgnoreCase(expRow6List) &&
	  				actRow7List.equalsIgnoreCase(expRow7List)/* &&
	  				actRow8List.equalsIgnoreCase(expRow8List) */&& 
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
	  			
	  			return true;
	  		}
	  		else
	  		{
	  			
	  			return false;
	  		}
	  	}

	 	  	public boolean checkTradingAccountOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  	{
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
	  		String expRow1List = "[COGS POSTING ACC, COGS POSTING ACC, COGS POSTING ACC, 20.00, , , , 20.00, , 20.00, , 20.00, , , , 20.00, , 20.00, , 1.40, , , , 1.40, , 1.40, , 100.00, 100.00, 100.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[SR COGS POSTING ACC, SR COGS POSTING ACC, , 120.00, , , , 120.00, , 120.00, , 120.00, , , , 120.00, , 120.00, , 8.40, , , , 8.40, , 8.40, 100.00, 100.00, 100.00]";
	  		
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[SHORTAGE COGS POSTING ACC, SHORTAGE COGS POSTING ACC, , , , , , , , , , , , , , , , , , , , , , , , , , , ]";
	  		
	  		
	  		int report4thRowListCount = report4thRowList.size();
	  		ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  		for(int i=2;i<report4thRowListCount;i++)
	  		{
	  			String data = report4thRowList.get(i).getText();
	  			report4thRowListArray.add(data);
	  		}
	  		String actRow4List = report4thRowListArray.toString();
	  		String expRow4List = "[EXCESS COGS POSTING ACC, EXCESS COGS POSTING ACC, , , , , , , , , , , , , , , , , , , , , , , , , , , ]";

	  		int report5thRowListCount = report5thRowList.size();
	  		ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report5thRowListCount;i++)
	  		{
	  			String data = report5thRowList.get(i).getText();
	  			report5thRowListArray.add(data);
	  		}
	  		String actRow5List = report5thRowListArray.toString();
	  		String expRow5List = "[Gross profit, , , 100.00, , , , 100.00, , 100.00, , 100.00, , , , 100.00, , 100.00, , 7.00, , , , 7.00, , 7.00, , , , ]";

	  		int report6thRowListCount = report6thRowList.size();
	  		ArrayList<String> report6thRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report6thRowListCount;i++)
	  		{
	  			String data = report6thRowList.get(i).getText();
	  			report6thRowListArray.add(data);
	  		}
	  		String actRow6List = report6thRowListArray.toString();
	  		String expRow6List = "[Grand Total, , , 120.00, 120.00, , , 120.00, 120.00, 120.00, 120.00, 120.00, 120.00, , , 120.00, 120.00, 120.00, 120.00, 8.40, 8.40, , , 8.40, 8.40, 8.40, 8.40, , , ]";
	  		
	  		
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
	  				
	  				return true;
	  			}
	  			else
	  			{
	  				
	  				return false;
	  			}
	  		}
	  	
	  	
	
	  	public boolean checkTradingAndProfitAndLossReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  	{
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
	  		tradingAccProfitAndLossCusAccTxt.sendKeys("Sales - Computers");
	  		
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
	  		String expRow1List = "[Sales - Computers, 071-001, Sales - Computers, , 15.00, , , , 15.00, 5.00, 20.00, , 15.00, , , , 15.00, 5.00, 20.00, , 1.05, , , , 1.05, 0.35, 1.40, , , , ]";
	  		
	  		
	  		/*int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Loss for the period, , , , (363.42), , , , (363.42), , (363.42), , (363.42), , , , (363.42), , (363.42), , (25.4394), , , , (25.4394), , (25.4394), , , , ]";
	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Grand Total, , , 363.42, 363.42, , , 363.42, 363.42, 363.42, 363.42, 363.42, 363.42, , , 363.42, 363.42, 363.42, 363.42, 25.44, 25.44, , , 25.44, 25.44, 25.44, 25.44, , , , ]";
	  		
*/
	  		System.out.println("actRow1List  : "+actRow1List);
	  		System.out.println("expRow1List  : "+expRow1List);
	  		System.out.println("*********************************************************************");
	  				
	  		/*System.out.println("actRow2List  : "+actRow2List);
	  		System.out.println("expRow2List  : "+expRow2List);
	  		System.out.println("*********************************************************************");
	  		
	  		System.out.println("actRow3List  : "+actRow3List);
	  		System.out.println("expRow3List  : "+expRow3List);
	  		System.out.println("*********************************************************************");*/
	  		
	  		if(actRow1List.equalsIgnoreCase(expRow1List) /*&&
	  				actRow2List.equalsIgnoreCase(expRow2List) &&
	  				actRow3List.equalsIgnoreCase(expRow3List)*/ &&
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

	  		
	 
	  	public boolean checkBalanceSheetOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  	{
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
	  		balSheetCusAccTxt.sendKeys("Customer New Reference");
	  		
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
	  		String expRow1List = "[Customer New Reference, Customer New Reference, Customer New Reference, , 15.00, , , , 15.00, 5.00, 20.00, , 15.00, , , , 15.00, 5.00, 20.00, , 1.85, , , , 1.85, 0.35, 2.20, , 100.00, 100.00, 100.00]";
	  		
	  		
	  		int report2ndRowListCount = report2ndRowList.size();
	  		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report2ndRowListCount;i++)
	  		{
	  			String data = report2ndRowList.get(i).getText();
	  			report2ndRowListArray.add(data);
	  		}
	  		String actRow2List = report2ndRowListArray.toString();
	  		String expRow2List = "[Loss for the period, , , 15.00, , , , 15.00, , 15.00, , 15.00, , , , 15.00, , 15.00, , 1.85, , , , 1.85, , 1.85, , , , , ]";
	  		

	  		
	  		int report3rdRowListCount = report3rdRowList.size();
	  		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  		for(int i=1;i<report3rdRowListCount;i++)
	  		{
	  			String data = report3rdRowList.get(i).getText();
	  			report3rdRowListArray.add(data);
	  		}
	  		String actRow3List = report3rdRowListArray.toString();
	  		String expRow3List = "[Grand Total, , , 15.00, 15.00, , , 15.00, 15.00, 20.00, 20.00, 15.00, 15.00, , , 15.00, 15.00, 20.00, 20.00, 1.85, 1.85, , , 1.85, 1.85, 2.20, 2.20, , , , ]";
	  		
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
	  				actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List)  &&
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


	  	@FindBy(xpath="//*[@id='id_rc_complete_tree_container']/div[2]/ul/li/span")
	  	private static WebElement defaultExpandBtn;
	  	
	  	@FindBy(xpath="//span[contains(text(),'Particulars')]")
	  	private static WebElement cusParticularBtn;
	  	
	  	@FindBy(xpath="//*[@id='TCol1']/span")
	  	private static WebElement cusAccField;
	  	
	  	
	

	  	
	  	
	  	@FindBy (xpath="//div[@id='id_focus_msgbox_main']")
	  	private static WebElement ServerErrorPopup;
	  	
	  	@FindBy (xpath="//div[@id='id_focus_msgbox_title']/div[2]/span")
	  	private static WebElement ServerErrorPopupCloseBtn;
	  	
	  	@FindBy (xpath="//*[@id='id_focus_msgbox_detail']/span/h2/i")
	  	private static WebElement ServerErrorPopupTxt;
	  	
	  	
	  	
	  	public boolean checkFinalAccountsSchedulesReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	  		financialsMenu.click();
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
	  		financialsFinalAccountsMenu.click();
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finalAccountSchedulesReport));
	  		finalAccountSchedulesReport.click();
	  		
	  		Thread.sleep(2000);
	  	
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
	  	
	  	Thread.sleep(2000);
	  	
	  	/*if (ServerErrorPopup.isDisplayed()==true) 
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ServerErrorPopupTxt));
	  		String ServerMessage = ServerErrorPopupTxt.getText();
	  		
	  		System.err.println("Server Error isDisplaying as : "+ServerMessage);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ServerErrorPopupCloseBtn));
	  		ServerErrorPopupCloseBtn.click();
	  		
	  		getDriver().navigate().refresh();
	  		
	  		Thread.sleep(3000);
	  		
	  		return false;
	  	}
	  	else
	  	{*/
	  	
	  	boolean novalidationConfirmationMessage1 =validationConfirmationMessage.getText().isEmpty();
	  		
	  	String actvalidationConfirmationMessage1 = Boolean.toString(novalidationConfirmationMessage1);
	  	String expvalidationConfirmationMessage1 = "true";
	  	
	  	System.out.println("validationConfirmationMessage1 : "+actvalidationConfirmationMessage1+" Value Expected : "+expvalidationConfirmationMessage1);
	  	
	      Thread.sleep(1500);
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
	  	report_FilterBtn.click();
	  	
	  	Thread.sleep(3000);
	  	
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
	  	finalaAccScheduleAccTxt.sendKeys("Bank");
	  	
	  	Thread.sleep(2000);
	  	
	  	finalaAccScheduleAccTxt.sendKeys(Keys.TAB);
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	  	filterOkButton.click();

	  	Thread.sleep(2000);

	  	int count = report1stRowList.size();
	  	ArrayList<String> actRow1Array = new ArrayList<String>();
	  	for(int i=0;i<count;i++)
	  	{
	  		String data = report1stRowList.get(i).getText();
	  		actRow1Array.add(data);
	  	}
	  	String actRow1List = actRow1Array.toString();
	  	String expRow1List = "[1, Round off Exchange gain/ loss, RoundoffExgainloss, Round off Exchange gain / loss, , , , , , , , , , , , , , , , , , , , , , , , , , , ]";
	      
	      System.out.println("Actual Report Row 1 List    : "+actRow1List);
	      System.out.println("Expected Report Row 1 List  : "+expRow1List);
	  	
	      
	      
	  	ArrayList<String> actRow2Array = new ArrayList<String>();
	  	for(int i=0;i<count;i++)
	  	{
	  		String data = report2ndRowList.get(i).getText();
	  		actRow2Array.add(data);
	  	}
	  	String actRow2List = actRow2Array.toString();
	  	String expRow2List = "[2, Vendor New Reference, Vendor New Reference, Vendor New Reference, , , , , , , 10.00, 10.00, , , , , , , 10.00, 10.00, , , , , , , 0.70, 0.70, , , ]";
	      
	      System.out.println("Actual Report Row 2 List    : "+actRow2List);
	      System.out.println("Expected Report Row 2 List  : "+expRow2List);
	      
	      
	      ArrayList<String> actRow3Array = new ArrayList<String>();
		  	for(int i=0;i<count;i++)
		  	{
		  		String data = report3rdRowList.get(i).getText();
		  		actRow3Array.add(data);
		  	}
		  	String actRow3List = actRow3Array.toString();
		  	String expRow3List = "[3, Vendor Semi Adjustment, Vendor Semi Adjustment, Vendor Semi Adjustment, 5.00, , , , 5.00, , 10.00, 5.00, 5.00, , , , 5.00, , 10.00, 5.00, 0.35, , , , 0.35, , 0.70, 0.35, 1.20, 1.20, 1.14]";
		      
		      System.out.println("Actual Report Row 2 List    : "+actRow3List);
		      System.out.println("Expected Report Row 2 List  : "+expRow3List);
		      
		      ArrayList<String> actRow4Array = new ArrayList<String>();
			  	for(int i=0;i<count;i++)
			  	{
			  		String data = report4thRowList.get(i).getText();
			  		actRow4Array.add(data);
			  	}
			  	String actRow4List = actRow4Array.toString();
			  	String expRow4List = "[4, Vendor Full Adjustment, Vendor Full Adjustment, Vendor Full Adjustment, 10.00, , , , 10.00, , 10.00, , 10.00, , , , 10.00, , 10.00, , 0.70, , , , 0.70, , 0.70, , 2.41, 2.41, 2.28]";
			      
			      System.out.println("Actual Report Row 2 List    : "+actRow4List);
			      System.out.println("Expected Report Row 2 List  : "+expRow4List);
			      
			      ArrayList<String> actRow5Array = new ArrayList<String>();
				  	for(int i=0;i<count;i++)
				  	{
				  		String data = report5thRowList.get(i).getText();
				  		actRow5Array.add(data);
				  	}
				  	String actRow5List = actRow5Array.toString();
				  	String expRow5List = "[5, Customer New Reference, Customer New Reference, Customer New Reference, , 15.00, , , , 15.00, 5.00, 20.00, , 15.00, , , , 15.00, 5.00, 20.00, , 1.85, , , , 1.85, 0.35, 2.20, 3.52, 3.52, 6.04]";
				      
				      System.out.println("Actual Report Row 2 List    : "+actRow5List);
				      System.out.println("Expected Report Row 2 List  : "+expRow5List);
				      
				      ArrayList<String> actRow6Array = new ArrayList<String>();
					  	for(int i=0;i<count;i++)
					  	{
					  		String data = report6thRowList.get(i).getText();
					  		actRow6Array.add(data);
					  	}
					  	String actRow6List = actRow6Array.toString();
					  	String expRow6List = "[6, Customer Full Adjustment, Customer Full Adjustment, Customer Full Adjustment, , , , , , , , , , , , , , , , , , , , , , , , , , , ]";
					      
					      System.out.println("Actual Report Row 2 List    : "+actRow6List);
					      System.out.println("Expected Report Row 2 List  : "+expRow6List);
					      
					      ArrayList<String> actRow7thArray = new ArrayList<String>();
						  	for(int i=0;i<count;i++)
						  	{
						  		String data = report7thRowList.get(i).getText();
						  		actRow7thArray.add(data);
						  	}
						  	String actRow7List = actRow7thArray.toString();
						  	String expRow7List = "[7, Customer Semi Adjustment, Customer Semi Adjustment, Customer Semi Adjustment, , , , , , , 15.00, 15.00, , , , , , , 15.00, 15.00, , , , , , , 1.05, 1.05, , , ]";
						      
						      System.out.println("Actual Report Row 2 List    : "+actRow7List);
						      System.out.println("Expected Report Row 2 List  : "+expRow7List);
						      
	      System.out.println("*********************************************************************");
	  	
	  	if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && 
	  			actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List) &&
	  			actRow5List.equalsIgnoreCase(expRow5List) && actRow6List.equalsIgnoreCase(expRow6List) && 
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


	  	
	  @FindBy(xpath="//input[@id='FOption_592_0_DefaultFilter_0']")
	  private static WebElement finalaAccScheduleAccTxt;
	  	


	


	  public boolean checkFundFlowReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
	  	fundFlowCUsAccTxt.sendKeys("Bank");
	  	
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
	  	String expRow1List = "[Bank, 121-001, Bank, , 10.25, , , , 10.25, 29.75, 40.00, , 10.25, , , , 10.25, 29.75, 40.00, , 0.72, , , , 0.72, 2.08, 2.80, , , ]";
	  	
	  	
	  /*	int report2ndRowListCount = report2ndRowList.size();
	  	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report2ndRowListCount;i++)
	  	{
	  		String data = report2ndRowList.get(i).getText();
	  		report2ndRowListArray.add(data);
	  	}
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[Loss for the period, , , (-5.71), , , , (-5.71), , (-5.71), , (-5.71), , , , (-5.71), , (-5.71), , (-11.5597), , , , (-11.5597), , (-11.5597), , , , ]";*/
	  	

	  	System.out.println("actRow1List  : "+actRow1List);
	  	System.out.println("expRow1List  : "+expRow1List);
	  	System.out.println("*********************************************************************");
	  			
	  /*	System.out.println("actRow2List  : "+actRow2List);
	  	System.out.println("expRow2List  : "+expRow2List);
	  	System.out.println("*********************************************************************");*/
	  	
	  	if(actRow1List.equalsIgnoreCase(expRow1List)/* &&
	  			actRow2List.equalsIgnoreCase(expRow2List) */&&
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



	  @FindBy(xpath="//input[@id='FOption_593_0_DefaultFilter_0']")
	  private static WebElement fundFlowCUsAccTxt;
	      

	  @FindBy(xpath="//input[@id='FOption_594_0_DefaultFilter_0']")
	  private static WebElement cashFlowCusAccTxt;
	  ;



	  @FindBy(xpath="//input[@id='FOption_595_0_DefaultFilter_0']")
	  private static WebElement cashFlowAnalysisCusAccTxt;
	  ;

	
	  	
	  @FindBy(xpath="//a[@id='33']")
	  private static WebElement budgetPlanningReport;


	  public boolean checkBudgetPlanningReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
	  	Thread.sleep(2000);
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	  	financialsMenu.click();
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
	  	financialsFinalAccountsMenu.click();
	  	
	  	Thread.sleep(2000);
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(incomeExpenseTrendsReport));
	  	incomeExpenseTrendsReport.click();

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
	  	String expRow1List = "[CurrentMonth, 140.00, 25.00]";
	  	

	  	int report2ndRowListCount = report2ndRowList.size();
	  	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report2ndRowListCount;i++)
	  	{
	  		String data = report2ndRowList.get(i).getText();
	  		report2ndRowListArray.add(data);
	  	}
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[Grand Total, 140.00, 25.00]";
	  	

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
	  	recAndPayCusAccTxt.sendKeys("Vendor Semi Adjustment");
	  	
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
	  	String expRow1List = "[Vendor Semi Adjustment, Vendor Semi Adjustment, Vendor Semi Adjustment, 5.00, , , , 5.00, , 10.00, 5.00, 5.00, , , , 5.00, , 10.00, 5.00, 0.35, , , , 0.35, , 0.70, 0.35]";
	  	
	  	
	  	int report2ndRowListCount = report2ndRowList.size();
	  	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report2ndRowListCount;i++)
	  	{
	  		String data = report2ndRowList.get(i).getText();
	  		report2ndRowListArray.add(data);
	  	}
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[Loss for the period, , , , (5), , , , (5), , (5), , (5), , , , (5), , (5), , , , , , , , ]";
	  	
	  	
	  	int report3rdRowListCount = report3rdRowList.size();
	  	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report3rdRowListCount;i++)
	  	{
	  		String data = report3rdRowList.get(i).getText();
	  		report3rdRowListArray.add(data);
	  	}
	  	String actRow3List = report3rdRowListArray.toString();
	  	String expRow3List = "[Grand Total, , , 5.00, , , , 5.00, , 10.00, 5.00, 5.00, , , , 5.00, , 10.00, 5.00, 0.35, , , , 0.35, , 0.70, 0.35]";
	  	
	  	

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
	  	String expRow1List = "[NDT77:1, DateField, Customer New Reference, 20.00, 15.00, 15.00, DateField, 15.00, 20.00, 15.00, 15.00, 2.20, 1.85, 1.85, Customer New Reference]";
	  	
	  	
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
	  	String expRow2List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, 5.00, 20.00, DateField, 5.00, 10.00, 5.00, 20.00, 0.70, 0.35, 2.20, Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow3List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, 5.00, 15.00, DateField, 5.00, 10.00, 5.00, 15.00, 0.70, 0.35, 1.85, Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow4List = "[Grand Total, DateField, , 20.00, 15.00, , DateField, 15.00, 20.00, 15.00, 50.00, 2.20, 1.85, 5.90, ]";

	  	/*int report5thRowListCount = report5thRowList.size();
	  	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report5thRowListCount;i++)
	  	{
	  		String data = report5thRowList.get(i).getText();
	  		report5thRowListArray.add(data);
	  	}
	  	String actRow5List = report5thRowListArray.toString();
	  	String expRow5List = "[Grand Total, , , 640.00, 640.00, 1,000.00, , 640.00, 640.00, 640.00, 1,000.00, 44.80, 44.80, 70.00, ]";

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
	  			
	  /*	System.out.println("actRow5List  : "+actRow5List);
	  	System.out.println("expRow5List  : "+expRow5List);
	  	System.out.println("*********************************************************************");
	  			*/
	  	if (actRow1List.equalsIgnoreCase(expRow1List) &&
	  			actRow2List.equalsIgnoreCase(expRow2List) &&
	  			actRow3List.equalsIgnoreCase(expRow3List) &&
	  			actRow4List.equalsIgnoreCase(expRow4List) ) 
	  	{
	  		return true;
	  	}
	  	else
	  	{
	  		return false;
	  	}
	  }

	  

	  	@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody")
	  	private static WebElement reportsTable;
	  	
	  	@FindBy (xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[6]")
	  	private static WebElement sl_BackTrackBtn;
	  	
	  	@FindBy (xpath="(//div[@id='dvReportDetails']/div/table/tbody)[1]/tr/td[3]")
	  	private static List<WebElement> reportTableColumn2RowsList;
	  	
	  	
	  	@FindBy (xpath="//div[@id='dvReportRenderBacktracking']/div[1]/div[1]/div[2]/table/tbody/tr/td")
	  	private static List<WebElement> backTrackItemDetailsMonthsTableList;
	  	
	  	@FindBy (xpath="//div[@id='dvReportRenderBacktracking']/div[1]/div[1]/div[2]/table")
	  	private static WebElement backTrackItemDetailsMonthsTable;
	  	
	  	@FindBy (xpath="//div[@id='dvReportRenderBacktracking']/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[1]")
	  	private static WebElement backTrackItemDetailsMonths1stRow1stCol;
	  	
	  	@FindBy (xpath="//div[@id='dvReportRenderBacktracking']/div[1]/div[1]/div[2]/table/tbody/tr[2]/td[1]")
	  	private static WebElement backTrackItemDetailsMonths2ndRow1stCol;
	  	
	  	
	  	@FindBy (xpath="//div[@id='dvReportRenderBacktracking']/div[2]/div[1]/div[2]/table/tbody/tr/td")
	  	private static List<WebElement> backTrackItemDetailsDaysTableList;
	  	
	  	@FindBy (xpath="//div[@id='dvReportRenderBacktracking']/div[2]/div[1]/div[2]/table")
	  	private static WebElement backTrackItemDetailsDaysTable;
	  	
	  	@FindBy (xpath="//div[@id='dvReportRenderBacktracking']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[1]")
	  	private static WebElement backTrackItemDetailsDays1stRow1stCol;
	  	
	  	
	  	
	  	@FindBy (xpath="//div[@id='dvReportRenderBacktracking']/div[3]/div[1]/div[2]/table/tbody/tr/td")
	  	private static List<WebElement> backTrackItemDetailsVouchersTableList;
	  	
	  	@FindBy (xpath="//div[@id='dvReportRenderBacktracking']/div[3]/div[1]/div[2]/table")
	  	private static WebElement backTrackItemDetailsVouchersTable;
	  	
	  	@FindBy (xpath="//div[@id='dvReportRenderBacktracking']/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[1]")
	  	private static WebElement backTrackItemDetailsVouchers1stRow1stCol;
	  	
	  	
	  	
	  	//Voucher Entry Page Header Fields
	  			
	  			
	  			@FindBy(xpath="//*[@id='id_header_1_input_image']/span")
	  			private static WebElement  documentNumberdropdown_ExpansionBtn;
	  			
	  			
	  			
	  			@FindBy(xpath="//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	  			private static WebElement  dateTxt_CalenderBtn;
	  			
	  			@FindBy(xpath="//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
	  			private static WebElement  calender_TodayBtn;
	  			
	  			
	  			@FindBy(xpath="//input[@id='id_header_4']")
	  			private static WebElement  vcustomerAccountTxt;
	  			 
	  			@FindBy(xpath="//input[@id='id_header_268435460']")
	  			private static WebElement  warehouseTxt;
	  			
	  			@FindBy(xpath="//tbody[@id='id_header_268435460_table_body']/tr/td[2]")
	  			private static List<WebElement> warehouseHeaderComboList;
	  			
	  			@FindBy(xpath="//tbody[@id='id_body_23_table_body']/tr/td[2]")
	  			private static List<WebElement> itemComboList;
	  			
	  			
	  			
	  			
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
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	  	sl_HeaderSelectChkBox.click();
	  	
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
	  	String expRow1List = "[Customer Semi Adjustment Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow2List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, , , 5.00, 5.00, 10.00, , , 5.00, 0, Indian Rupees, DateField, Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow3List = "[NDT58:1, DateField, Customer Semi Adjustment, , 5.00, , , 5.00, , 5.00, , , 0, Indian Rupees, DateField, Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow4List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, , , 5.00, , 10.00, , , 5.00, 0, Indian Rupees, DateField, Customer Semi Adjustment]";

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
	  	String expRow5List = "[NDT57:4, DateField, Customer Semi Adjustment, , 5.00, , , , , 5.00, , , 0, Indian Rupees, DateField, Customer Semi Adjustment]";

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
	  	String expRow6List = "[Sub Total, DateField, , , , , , 10.00, , , , , 0, , DateField, ]";
	  	
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
	  	String expRow7List = "[Customer New Reference Customer New Reference]";
	  	
	  	
	  	int report8thRowListCount = report8thRowList.size();
	  	ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report8thRowListCount;i++)
	  	{
	  		String data = report8thRowList.get(i).getText();
	  		
	  		report8thRowListArray.add(data);
	  	}
	  	String actRow8List = report8thRowListArray.toString();
	  	String expRow8List = "[NDT77:1, 31/12/2019, Customer New Reference, 20.00, , , 15.00, 15.00, 20.00, , , 15.00, 477, Indian Rupees, 31/12/2019, Customer New Reference]";
	  	
	  	
	  	int report9thRowListCount = report9thRowList.size();
	  	ArrayList<String> report9thRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report9thRowListCount;i++)
	  	{
	  		String data = report9thRowList.get(i).getText();
	  		report9thRowListArray.add(data);
	  	}
	  	String actRow9List = report9thRowListArray.toString();
	  	String expRow9List = "[NJv:1, 21/04/2021, Customer New Reference, , 5.00, , , 15.00, , 5.00, , , 477, Indian Rupees, 21/04/2021, Customer New Reference]";
	  	
	  	
	  	int report10thRowListCount = report10thRowList.size();
	  	ArrayList<String> report10thRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report10thRowListCount;i++)
	  	{
	  		String data = report10thRowList.get(i).getText();
	  		report10thRowListArray.add(data);
	  	}
	  	String actRow10List = report10thRowListArray.toString();
	  	String expRow10List = "[Sub Total, , , 20.00, 5.00, , 15.00, 30.00, 20.00, 5.00, , 15.00, 954, , , ]";
	  	
	  	
	  	int report11thRowListCount = report11thRowList.size();
	  	ArrayList<String> report11thRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report11thRowListCount;i++)
	  	{
	  		String data = report11thRowList.get(i).getText();
	  		report11thRowListArray.add(data);
	  	}
	  	String actRow11List = report11thRowListArray.toString();
	  	String expRow11List = "[Grand Total, , , 20.00, 5.00, , 15.00, 40.00, 20.00, 5.00, , 15.00, 954, , , ]";
	  	
	  	
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
	  	
		
	  	System.out.println("actRow10List  : "+actRow10List);
	  	System.out.println("expRow10List  : "+expRow10List);
	  	System.out.println("*********************************************************************");
	  	
	  	System.out.println("actRow11List  : "+actRow11List);
	  	System.out.println("expRow11List  : "+expRow11List);
	  	
	  	
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
	  		System.out.println("Test Pass : Reports Are as Expected ");
	  		return true;
	  	}
	  	else
	  	{
	  		System.out.println("Test Fail : Report Are NOT as Expected ");
	  		return false;
	  	}
	  }


	  public boolean checkCustomerDueDateAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	  	sl_HeaderSelectChkBox.click();
	  	
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
	  	String expRow1List = "[Customer Semi Adjustment Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow2List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, , , 5.00, 5.00, 10.00, , , 5.00, 0, Indian Rupees, DateField, Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow3List = "[NDT58:1, DateField, Customer Semi Adjustment, , 5.00, , , 5.00, , 5.00, , , 0, Indian Rupees, DateField, Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow4List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, , , 5.00, , 10.00, , , 5.00, 0, Indian Rupees, DateField, Customer Semi Adjustment]";

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
	  	String expRow5List = "[NDT57:4, DateField, Customer Semi Adjustment, , 5.00, , , , , 5.00, , , 0, Indian Rupees, DateField, Customer Semi Adjustment]";

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
	  	String expRow6List = "[Sub Total, DateField, , , , , , 10.00, , , , , 0, , DateField, ]";
	  	
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
	  	String expRow7List = "[Customer New Reference Customer New Reference]";
	  	
	  	
	  	
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
	  	String expRow8List = "[NDT77:1, DateField, Customer New Reference, 20.00, , , 15.00, 15.00, 20.00, , , 15.00, 477, Indian Rupees, DateField, Customer New Reference]";

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
	  	String expRow9List = "[NJv:1, DateField, Customer New Reference, , 5.00, , , 15.00, , 5.00, , , 477, Indian Rupees, DateField, Customer New Reference]";

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
	  	String expRow10List = "[Sub Total, DateField, , 20.00, 5.00, , 15.00, 30.00, 20.00, 5.00, , 15.00, 954, , DateField, ]";
	  	
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
	  	String expRow11List = "[Grand Total, DateField, , 20.00, 5.00, , 15.00, 40.00, 20.00, 5.00, , 15.00, 954, , DateField, ]";
	  	
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
	  		System.out.println("Test Pass : Reports Are as Expected ");
	  		return true;
	  	}
	  	else
	  	{
	  		System.out.println("Test Fail : Report Are NOT as Expected ");
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
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	  	sl_HeaderSelectChkBox.click();
	  	
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
	  	
	      Thread.sleep(1500);
	      
	      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
	      report_CloseBtn.click();
	      
	      if(report7chkbox.isSelected()==true)
	      {
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	  	report7chkbox.click();
	      }
	      
	      if(report16chkbox.isSelected()==true)
	      {
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	  	report16chkbox.click();

	      }
	      if(report15chkbox.isSelected()==true)
	      {
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report15chkbox));
	  	report15chkbox.click();

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
	  	String expRow1List = "[Customer Semi Adjustment Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow2List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, 5.00, 5.00, 0, 10.00, 5.00, 5.00, , , , , , , , 5.00, 5.00, , , , , , , , 5.00, 0.35, , , , , , , , 0.35, DateField, Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow3List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, 5.00, , 0, 10.00, 5.00, 5.00, , , , , , , , 5.00, 5.00, , , , , , , , 5.00, 0.35, , , , , , , , 0.35, DateField, Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow4List = "[Sub Total, DateField, , , , 5.00, 0, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , DateField, ]";

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
	  	String expRow5List = "[Customer New Reference Customer New Reference]";

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
	  	String expRow6List = "[NDT77:1, DateField, Customer New Reference, 20.00, 15.00, 15.00, 477, 20.00, 15.00, , , , , , , , 15.00, 15.00, , , , , , , , 15.00, 15.00, , , , , , , , 1.85, 1.85, DateField, Customer New Reference]";
	  	
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
	  	String expRow7List = "[Sub Total, DateField, , 20.00, 15.00, 15.00, 477, 20.00, 15.00, , , , , , , , 15.00, 15.00, , , , , , , , 15.00, 15.00, , , , , , , , 1.85, 1.85, DateField, ]";
	  	
	  	int report8thRowListCount = report8thRowList.size();
	  	ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report8thRowListCount;i++)
	  	{
	  		String data = report8thRowList.get(i).getText();
	  		
	  		report8thRowListArray.add(data);
	  	}
	  	String actRow8List = report8thRowListArray.toString();
	  	String expRow8List = "[Grand Total, , , 20.00, 15.00, 10.00, 477, 20.00, 15.00, , , , , , , , 15.00, 15.00, , , , , , , , 15.00, 15.00, , , , , , , , 1.85, 1.85, , ]";
	  	
	  	
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

	

	  public boolean checkCustomerAgeingDetailsByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	  	sl_HeaderSelectChkBox.click();
	  	
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
	  	String expRow1List = "[Customer Semi Adjustment Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow2List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, 5.00, 5.00, 0, 10.00, 5.00, , 5.00, , , , , 5.00, , , , , , , , , , , , 5.00, , , , , 0.35, , , , DateField, 0.0000000000]";
	  	
	  	
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
	  	String expRow3List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, 5.00, , 0, 10.00, 5.00, , 5.00, , , , , 5.00, , , , , , , , , , , , 5.00, , , , , 0.35, , , , DateField, 0.0000000000]";
	  	
	  	
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
	  	String expRow4List = "[Sub Total, DateField, , , , 5.00, 0, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , DateField, 0]";

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
	  	String expRow5List = "[Customer New Reference Customer New Reference]";

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
	  	String expRow6List = "[NDT77:1, DateField, Customer New Reference, 20.00, 15.00, 15.00, 477, 20.00, 15.00, , 15.00, , , , , , , , , , , , , , , , , 15.00, , , , , , , , , DateField, 0.0000000000]";
	  	
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
	  	String expRow7List = "[Sub Total, DateField, , 20.00, 15.00, 15.00, 477, 20.00, 15.00, , 15.00, , , , , , , , , , , , , , , , , 15.00, , , , , , , , , DateField, 0]";
	  	
	  	
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
	  	String expRow8List = "[Grand Total, DateField, , 20.00, 15.00, 20.00, 477, 20.00, 15.00, , 15.00, , , , , , , , , , , , , , , , , 15.00, , , , , , , , , , 0]";
	  	
	  	
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
	  	String expRow1List = "[Customer Semi Adjustment Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow2List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, 5.00, 0, 5.00, 5.00, , , , , , , , , 5.00, Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow3List = "[NDT82:1, DateField, Customer Semi Adjustment, 10.00, 5.00, 0, , 5.00, , , , , , , , , 5.00, Customer Semi Adjustment]";
	  	
	  	
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
	  	String expRow4List = "[Sub Total, DateField, , , , 0, 5.00, , , , , , , , , , , ]";

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
	  	String expRow5List = "[Customer New Reference Customer New Reference]";

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
	  	String expRow6List = "[NDT77:1, DateField, Customer New Reference, 20.00, 15.00, 477, 15.00, , , , , , , , , 15.00, 15.00, Customer New Reference]";
	  	
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
	  	String expRow7List = "[Sub Total, DateField, , 20.00, 15.00, 477, 15.00, , , , , , , , , 15.00, 15.00, ]";
	  	
	  	
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
	  	String expRow8List = "[Sub Total, DateField, , 20.00, 15.00, 477, 15.00, , , , , , , , , 15.00, 15.00, ]";
	  	
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
	  	String expRow1List = "[Customer New Reference, 15.00, 15.00, , , 15.00, , , , , , , , , , , , , 15.00, , , , , , , , , , , , , 15.00, , , , , , , , , , , , , 2.20, , , , 15.00, 15.00, 2.20, 15.00, 15.00, , , 15.00, 2.20, 2.20, , , 2.20, , , , , Customer New Reference]";
	  	
	  	System.out.println("actRow1List  : "+actRow1List);
	  	System.out.println("expRow1List  : "+expRow1List);
	  	System.out.println("*********************************************************************");
	  	
	  		
	  	if(actRow1List.equalsIgnoreCase(expRow1List) &&
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

	 
	  public boolean checkcustomerSummaryAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
	  	String expRow1List = "[Customer New Reference, 15.00, 15.00, , , 15.00, , , , , , , , , , , , , 15.00, , , , , , , , , , , , , 15.00, , , , , , , , , , , , , 2.20, , , , 15.00, 15.00, 2.20, 15.00, 15.00, , , 15.00, 2.20, 2.20, , , 2.20, , , , , Customer New Reference]";
	  	
	  	System.out.println("actRow1List  : "+actRow1List);
	  	System.out.println("expRow1List  : "+expRow1List);
	  	System.out.println("*********************************************************************");
	  	
	  	Calendar cal=Calendar.getInstance();
	  	DateFormat df = new SimpleDateFormat("MMM");
	  	String CurMon = df.format(cal.getTime());
	  	
	  	cal.add(Calendar.MONTH, 1);
	  	
	  	String nxtMon = df.format(cal.getTime());
	  	
	  	System.err.println(CurMon);
	  	System.err.println(nxtMon);
	  		
	  	if(actRow1List.equalsIgnoreCase(expRow1List) &&
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

	 
	  public boolean checkcustomerSummaryCustomerOverDueSummeryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
	  	
	      Thread.sleep(2500);
	      	
	  	
	      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	  	
	  	int reportsRow1ListCount = report1stRowList.size();
	  	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  	for(int i=1;i<4;i++)
	  	{
	  		String data = report1stRowList.get(i).getText();
	  		
	  		reportsRow1ListArray.add(data);
	  	}
	  	String actRow1List = reportsRow1ListArray.toString();
	  	String expRow1List = "[Customer New Reference, 20.00, 15.00]";
	  	
	  	

	  	/*int report2ndRowListCount = report2ndRowList.size();
	  	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  	for(int i=1;i<4;i++)
	  	{
	  		String data = report2ndRowList.get(i).getText();
	  		
	  		
	  		report2ndRowListArray.add(data);
	  	}
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[Grand Total, 514.00, 514.00]";
	  	*/
	  	System.out.println("actRow1List  : "+actRow1List);
	  	System.out.println("expRow1List  : "+expRow1List);
	  	System.out.println("*********************************************************************");
	  	
	  /*	System.out.println("actRow2List  : "+actRow2List);
	  	System.out.println("expRow2List  : "+expRow2List);
	  	System.out.println("*********************************************************************");*/
	  	
	  		
	  	if(actRow1List.equalsIgnoreCase(expRow1List)/* &&actRow2List.equalsIgnoreCase(expRow2List)*/ &&
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

	 

	  public boolean checkcustomerSummaryCustomerBillWiseSummeryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
	  	String expRow1List = "[Customer Semi Adjustment, 5.00, 5.00, Customer Semi Adjustment]";
	  	

	  	int report2ndRowListCount = report2ndRowList.size();
	  	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report2ndRowListCount;i++)
	  	{
	  		String data = report2ndRowList.get(i).getText();
	  		
	  		report2ndRowListArray.add(data);
	  	}
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[Customer New Reference, , 15.00, Customer New Reference]";
	  	
	  	int report3rdRowListCount = report3rdRowList.size();
	  	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report3rdRowListCount;i++)
	  	{
	  		String data = report3rdRowList.get(i).getText();
	  		
	  		report3rdRowListArray.add(data);
	  	}
	  	String actRow3List = report3rdRowListArray.toString();
	  	String expRow3List = "[Grand Total, 5.00, 20.00, ]";
	  	
	  	System.out.println("actRow1List  : "+actRow1List);
	  	System.out.println("expRow1List  : "+expRow1List);
	  	System.out.println("*********************************************************************");
	  	
	  	System.out.println("actRow2List  : "+actRow2List);
	  	System.out.println("expRow2List  : "+expRow2List);
	  	System.out.println("*********************************************************************");
	  	
	  		
	  	
	  	System.out.println("actRow3List  : "+actRow3List);
	  	System.out.println("expRow3List  : "+expRow3List);
	  	System.out.println("*********************************************************************");
	  	
	  	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) &&
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

	  @FindBy(xpath="//select[@id='RITCombobox__2']")
	  private static WebElement osr_includeBillsDropdown;



	  public boolean checkVendorListingOfOutstandingBillsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
	  		data="dateField";	
	  		}
	  		if (i==7) 
	  		{
	  		data="dateField";	
	  		}
	  		reportsRow1ListArray.add(data);
	  	}
	  	String actRow1List = reportsRow1ListArray.toString();
	  	String expRow1List = "[NDT81:1, dateField, Vendor Semi Adjustment, 10.00, 5.00, 5.00, dateField, 5.00, 10.00, 5.00, 5.00, 0.70, 0.35, 0.35, Vendor Semi Adjustment]";
	  	

	  	int report2ndRowListCount = report2ndRowList.size();
	  	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report2ndRowListCount;i++)
	  	{
	  		/*String data = report2ndRowList.get(i).getText();
	  		if (i==2) 
	  		{
	  		data="dateField";	
	  		}
	  		if (i==7) 
	  		{
	  		data="dateField";	
	  		}*/
	  		
	  		String data = report2ndRowList.get(i).getText();
	  		report2ndRowListArray.add(data);
	  	}
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[Grand Total, , , 10.00, 5.00, , , 5.00, 10.00, 5.00, 5.00, 0.70, 0.35, 0.35, ]";
	  	
	  	/*int report3rdRowListCount = report3rdRowList.size();
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
	  	String expRow3List = "[NDT57:SU/IND/TEXT4, dateField, Vendor B, 31.50, 25.50, 561.30, dateField, 25.50, 31.50, 25.50, 36.21, 2.21, 1.79, 57.34, 033-002]";
	  	
	  	int report4thRowListCount = report4thRowList.size();
	  	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report4thRowListCount;i++)
	  	{
	  		String data = report4thRowList.get(i).getText();
	  		if (i==2) 
	  		{
	  		data="dateField";	
	  		}
	  		if (i==7) 
	  		{
	  		data="dateField";	
	  		}
	  		report4thRowListArray.add(data);
	  	}
	  	String actRow4List = report4thRowListArray.toString();
	  	String expRow4List = "[NDT57:SU/IND/TEXT5, dateField, Vendor B, 231.00, 231.00, 792.30, dateField, 231.00, 231.00, 231.00, 267.21, 16.17, 16.17, 73.51, 033-002]";
*/
	  	
	  	System.out.println("actRow1List  : "+actRow1List);
	  	System.out.println("expRow1List  : "+expRow1List);
	  	System.out.println("*********************************************************************");
	  	
	  	System.out.println("actRow2List  : "+actRow2List);
	  	System.out.println("expRow2List  : "+expRow2List);
	  	System.out.println("*********************************************************************");
	  	
	  	/*System.out.println("actRow3List  : "+actRow3List);
	  	System.out.println("expRow3List  : "+expRow3List);
	  	System.out.println("*********************************************************************");
	  			
	  	System.out.println("actRow4List  : "+actRow4List);
	  	System.out.println("expRow4List  : "+expRow4List);
	  	System.out.println("*********************************************************************");
	  		*/
	  		
	  	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) &&
	  			/*actRow3List.equalsIgnoreCase(expRow3List) &&actRow4List.equalsIgnoreCase(expRow4List) &&*/
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
	  	
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	  	sl_HeaderSelectChkBox.click();
	  	
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report16chkbox));
	  	report16chkbox.click();
	  	
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
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorStatementCusAccTxt));
	  	vendorStatementCusAccTxt.click();
	  	vendorStatementCusAccTxt.sendKeys("Vendor New Reference");
	  	Thread.sleep(2000);
	  	
	  	vendorStatementCusAccTxt.sendKeys(Keys.TAB);
	  	
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
	  	String expRow1List = "[Vendor New Reference Vendor New Reference]";
	  	

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
	  	String expRow2List = "[NDT78:1, dateField, Vendor New Reference, 10.00, , , , , 10.00, , , , 0, Indian Rupees, dateField, Vendor New Reference]";

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
	  	
	  	
	  	String actRow3List = report3rdRowListArray.toString();
	  	String expRow3List ="[DebNts:1, dateField, Vendor New Reference, , 4.75, , , , , 4.75, , , 0, Indian Rupees, dateField, Vendor New Reference]";
	  	
	  	int report4thRowListCount = report4thRowList.size();
	  	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  	for(int i=2;i<report4thRowListCount;i++)
	  	{
	  		String data = report4thRowList.get(i).getText();
	  		report4thRowListArray.add(data);
	  	}
	  	String actRow4List = report4thRowListArray.toString();
	  	String expRow4List = "[21/04/2021, Vendor New Reference, , 5.25, , , , , 5.25, , , 0, Indian Rupees, 21/04/2021, Vendor New Reference]";
	  	
	  	
	  	int report5thRowListCount = report5thRowList.size();
	  	ArrayList<String> report5thRowListArray = new ArrayList<String>();
	  	for(int i=2;i<report5thRowListCount;i++)
	  	{
	  		String data = report5thRowList.get(i).getText();
	  		report5thRowListArray.add(data);
	  	}
	  	String actRow5List = report5thRowListArray.toString();
	  	String expRow5List = "[, , 10.00, 10.00, , , , 10.00, 10.00, , , 0, , , ]";
	  	
	  	/*//6
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
	  	
	  	
	  	String actRow6List = report6thRowListArray.toString();
	  	String expRow6List = "[, , 1,500.00, , , 1,500.00, 1,500.00, 30.00, , , 30.00, "+daysBetween+", , , ]";
	  	//7
	  	
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
	  	
	  	String actRow7List = report6thRowListArray.toString();
	  	String expRow7List = "[, , 1,500.00, , , 1,500.00, 1,500.00, 30.00, , , 30.00, "+daysBetween+", , , ]";
	  	//8
	  	
	  	int report8thRowListCount = report8thRowList.size();
	  	ArrayList<String> report8thRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report8thRowListCount;i++)
	  	{
	  		String data = report8thRowList.get(i).getText();
	  		if (i==2) 
	  		{
	  		data="dateField";	
	  		}
	  		if (i==15) 
	  		{
	  		data="dateField";	
	  		}
	  		report8thRowListArray.add(data);
	  	}
	  	
	  	String actRow8List = report6thRowListArray.toString();
	  	String expRow8List = "[, , 1,500.00, , , 1,500.00, 1,500.00, 30.00, , , 30.00, "+daysBetween+", , , ]";
	  	
	  	int report9thRowListCount = report9thRowList.size();
		ArrayList<String> report9thRowListArray = new ArrayList<String>();
	  	for(int i=2;i<report9thRowListCount;i++)
	  	{
	  		String data = report9thRowList.get(i).getText();
	  		report9thRowListArray.add(data);
	  	}
	  	String actRow9List = report9thRowListArray.toString();
	  	String expRow9List = "[, , 1,500.00, , , 1,500.00, 1,500.00, 30.00, , , 30.00, "+daysBetween+", , , ]";
	  	
	  	
	  	int report10thRowListCount = report10thRowList.size();
		ArrayList<String> report10thRowListArray = new ArrayList<String>();
	  	for(int i=2;i<report10thRowListCount;i++)
	  	{
	  		String data = report10thRowList.get(i).getText();
	  		report10thRowListArray.add(data);
	  	}
	  	String actRow10List = report10thRowListArray.toString();
	  	String expRow10List = "[, , 1,500.00, , , 1,500.00, 1,500.00, 30.00, , , 30.00, "+daysBetween+", , , ]";
	  	
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
	  	
	  /*	System.out.println("actRow6List  : "+actRow6List);
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
	  	*/
	  	
	  	if(actRow1List.equalsIgnoreCase(expRow1List) &&actRow2List.equalsIgnoreCase(expRow2List) &&
	  			actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List) &&actRow5List.equalsIgnoreCase(expRow5List) &&
	  			/*actRow6List.equalsIgnoreCase(expRow6List) && actRow7List.equalsIgnoreCase(expRow7List) &&actRow8List.equalsIgnoreCase(expRow8List) &&
	  			actRow9List.equalsIgnoreCase(expRow9List) && actRow10List.equalsIgnoreCase(expRow10List) &&*/ 
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


	  public boolean checkvendorDetailsVendorDueDateAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
	  {
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
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
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDueDateCusAccTxt));
	  	vendorDueDateCusAccTxt.click();
	  	vendorDueDateCusAccTxt.sendKeys("Vendor Semi Adjustment");
	  	Thread.sleep(2000);
	  	
	  	vendorDueDateCusAccTxt.sendKeys(Keys.TAB);
	  	
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
	  	String expRow1List = "[Vendor Semi Adjustment Vendor Semi Adjustment]";
	  	

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
	  	String expRow2List = "[NDT81:1, dateField, Vendor Semi Adjustment, 10.00, , , 5.00, 5.00, 10.00, , , 5.00, 0, Indian Rupees, dateField, Vendor Semi Adjustment]";

	  	
	  	
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
	  	

	  	String actRow3List = report3rdRowListArray.toString();
	  	String expRow3List = "[NDT57:3, dateField, Vendor Semi Adjustment, , 5.00, , , 5.00, , 5.00, , , 0, Indian Rupees, dateField, Vendor Semi Adjustment]";

	  	
	  	
	  	int report4thRowListCount = report4thRowList.size();
	  	ArrayList<String> report4thRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report4thRowListCount;i++)
	  	{
	  		String data = report4thRowList.get(i).getText();
	  		report4thRowListArray.add(data);
	  	}
	  	String actRow4List = report4thRowListArray.toString();
	  	String expRow4List = "[Grand Total, , , 10.00, 5.00, , 5.00, 10.00, 10.00, 5.00, , 5.00, 0, , , ]";
	  	
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
	  			actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List) &&
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

	
	  public boolean checkVendorDetailsVendorAgeingDetailsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
	  {
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
	  	
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_HeaderSelectChkBox));
	  	sl_HeaderSelectChkBox.click();
	  	
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
	  	
	  	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_CloseBtn));
	  	report_CloseBtn.click();
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report7chkbox));
	  	if (report7chkbox.isSelected()==true &&report15chkbox.isSelected()==true &&report16chkbox.isSelected()==true &&
	  			report17chkbox.isSelected()==true  && report18chkbox.isSelected()==true)
	  	{
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
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAgeingDetailAnalysisCusAccTxt));
	  	vendorAgeingDetailAnalysisCusAccTxt.click();
	  	vendorAgeingDetailAnalysisCusAccTxt.sendKeys("Vendor Full Adjustment");
	  	Thread.sleep(2000);
	  	
	  	vendorAgeingDetailAnalysisCusAccTxt.sendKeys(Keys.TAB);
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	  	filterOkButton.click();

	  	if (sl_OkBtn.isDisplayed()==true) 
	  	{
	  		sl_OkBtn.click();
	  	}
	  	
	  	
	  	Thread.sleep(2000);
*/
	  	int reportsRow1ListCount = report1stRowList.size();
	  	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  	for(int i=1;i<reportsRow1ListCount;i++)
	  	{
	  		String data = report1stRowList.get(i).getText();
	  		
	  		reportsRow1ListArray.add(data);
	  	}
	  	String actRow1List = reportsRow1ListArray.toString();
	  	String expRow1List = "[Vendor Semi Adjustment Vendor Semi Adjustment]";
	  	

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
	  	String expRow2List = "[NDT81:1, dateField, Vendor Semi Adjustment, 10.00, 5.00, 5.00, 0, 10.00, 5.00, , , , , , , , , , , , 5.00, 5.00, , , , , , , , , , , , 5.00, 5.00, , dateField, , , , , , , , , , 0.35, 0.35, , , , 21/04/2021, Vendor Semi Adjustment]";

	  	
	  	int report3rdRowListCount = report3rdRowList.size();
	  	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report3rdRowListCount;i++)
	  	{
	  		String data = report3rdRowList.get(i).getText();
	  		report3rdRowListArray.add(data);
	  	}
	  	String actRow3List = report3rdRowListArray.toString();
	  	String expRow3List = "[Grand Total, , , 10.00, 5.00, 5.00, 0, 10.00, 5.00, , , , , , , , , , , , 5.00, 5.00, , , , , , , , , , , , 5.00, 5.00, , , , , , , , , , , , 0.35, 0.35, , , , , ]";
	  	
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

	 
	  public boolean checkVendorDetailsVendorDetailsAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
	  {
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
	  	
	  	Thread.sleep(2000);
	  	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
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
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAgeingDetailByDueDateCusAccTxt));
	  	vendorAgeingDetailByDueDateCusAccTxt.click();
	  	vendorAgeingDetailByDueDateCusAccTxt.sendKeys("Vendor a");
	  	Thread.sleep(2000);
	  	
	  	vendorAgeingDetailByDueDateCusAccTxt.sendKeys(Keys.TAB);
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(filterOkButton));
	  	filterOkButton.click();

	  	Thread.sleep(2000);*/

	  	int reportsRow1ListCount = report1stRowList.size();
	  	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  	for(int i=1;i<reportsRow1ListCount;i++)
	  	{
	  		String data = report1stRowList.get(i).getText();
	  		
	  		reportsRow1ListArray.add(data);
	  	}
	  	String actRow1List = reportsRow1ListArray.toString();
	  	String expRow1List = "[Vendor Semi Adjustment Vendor Semi Adjustment]";
	  	
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
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[NDT81:1, dateField, Vendor Semi Adjustment, 10.00, 5.00, 5.00, 0, 10.00, 5.00, , 5.00, , , , , 5.00, , , , , , , , , , , , 5.00, , , , , 0.35, , , , dateField, 0.0000000000]";

	  	
	  	int report3rdRowListCount = report3rdRowList.size();
	  	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report3rdRowListCount;i++)
	  	{
	  		String data = report3rdRowList.get(i).getText();
	  		report3rdRowListArray.add(data);
	  	}
	  	
	  	
	  	String actRow3List = report3rdRowListArray.toString();
	  	String expRow3List = "[, , 10.00, 5.00, 5.00, 0, 10.00, 5.00, , 5.00, , , , , 5.00, , , , , , , , , , , , 5.00, , , , , 0.35, , , , , 0]";
	  	
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
	  	
	  /*	Thread.sleep(2000);
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
*/
	  	int reportsRow1ListCount = report1stRowList.size();
	  	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  	for(int i=1;i<reportsRow1ListCount;i++)
	  	{
	  		String data = report1stRowList.get(i).getText();
	  		
	  		reportsRow1ListArray.add(data);
	  	}
	  	String actRow1List = reportsRow1ListArray.toString();
	  	String expRow1List = "[Vendor Semi Adjustment Vendor Semi Adjustment]";
	  	

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
	  	String expRow2List = "[NDT81:1, dateField, Vendor Semi Adjustment, 10.00, 5.00, 0, 5.00, 5.00, , , , , , , , , 5.00, Vendor Semi Adjustment]";

	  	
	  	int report3rdRowListCount = report3rdRowList.size();
	  	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report3rdRowListCount;i++)
	  	{
	  		String data = report3rdRowList.get(i).getText();
	  		report3rdRowListArray.add(data);
	  	}
	  	String actRow3List = report3rdRowListArray.toString();
	  	String expRow3List = "[Grand Total, , , 10.00, 5.00, 0, 5.00, 5.00, , , , , , , , , 5.00, ]";
	  	
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
	  	
	  	/*Thread.sleep(2000);
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

	  	Thread.sleep(2000);*/

	  	int reportsRow1ListCount = report1stRowList.size();
	  	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  	for(int i=1;i<reportsRow1ListCount;i++)
	  	{
	  		String data = report1stRowList.get(i).getText();
	  		
	  		reportsRow1ListArray.add(data);
	  	}
	  	String actRow1List = reportsRow1ListArray.toString();
	  	String expRow1List = "[Vendor Semi Adjustment, 5.00, 5.00, , , 5.00, 5.00, , , , , , , , 5.00, 5.00, , , , , , , , 5.00, 0.35, , , , , , , , 0.35, , , , , , , 5.00, 5.00, , , 5.00, 0.35, 0.70, , , 0.35, , , , , Vendor Semi Adjustment]";
	  	

	  	int report2ndRowListCount = report2ndRowList.size();
	  	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report2ndRowListCount;i++)
	  	{
	  		String data = report2ndRowList.get(i).getText();
	  		report2ndRowListArray.add(data);
	  	}
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[Grand Total, 5.00, 5.00, , , 5.00, 5.00, , , , , , , , 5.00, 5.00, , , , , , , , 5.00, 0.35, , , , , , , , 0.35, , , , , , , 5.00, 5.00, , , 5.00, 0.35, 0.70, , , 0.35, , , , , ]";

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

	 
	  public boolean checkVendorSummeryVendorSummaryAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
	  	
	  	Thread.sleep(3000);
	  	
	  /*	Thread.sleep(2000);
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

	  	Thread.sleep(3000);
*/
	  	int reportsRow1ListCount = report1stRowList.size();
	  	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  	for(int i=1;i<reportsRow1ListCount;i++)
	  	{
	  		String data = report1stRowList.get(i).getText();
	  		
	  		reportsRow1ListArray.add(data);
	  	}
	  	String actRow1List = reportsRow1ListArray.toString();
	  	String expRow1List = "[Vendor Semi Adjustment, 5.00, 5.00, , , 5.00, 5.00, , , , , , , , 5.00, 5.00, , , , , , , , 5.00, 0.35, , , , , , , , 0.35, , , , , , , 5.00, 5.00, , , 5.00, 0.35, 0.70, , , 0.35, , , , , Vendor Semi Adjustment]";
	  	

	  	int report2ndRowListCount = report2ndRowList.size();
	  	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report2ndRowListCount;i++)
	  	{
	  		String data = report2ndRowList.get(i).getText();
	  		report2ndRowListArray.add(data);
	  	}
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[Grand Total, 5.00, 5.00, , , 5.00, 5.00, , , , , , , , 5.00, 5.00, , , , , , , , 5.00, 0.35, , , , , , , , 0.35, , , , , , , 5.00, 5.00, , , 5.00, 0.35, 0.70, , , 0.35, , , , , ]";

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

	 
	  public boolean checkVendorSummeryVendorOverdueSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
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
	  	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
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
	  	filterOkButton.click();*/

	  	Thread.sleep(4000);

	  	int reportsRow1ListCount = report1stRowList.size();
	  	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  	for(int i=1;i<reportsRow1ListCount;i++)
	  	{
	  		String data = report1stRowList.get(i).getText();
	  		
	  		reportsRow1ListArray.add(data);
	  	}
	  	String actRow1List = reportsRow1ListArray.toString();
	  	String expRow1List = "[Vendor Semi Adjustment, 10.00, 5.00, 5.00, , , , , , , , , , 5.00, , , , Vendor Semi Adjustment]";
	  	
	       
	  	int report2ndRowListCount = report2ndRowList.size();
	  	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report2ndRowListCount;i++)
	  	{
	  		String data = report2ndRowList.get(i).getText();
	  		report2ndRowListArray.add(data);
	  	}
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[Grand Total, 10.00, 5.00, 5.00, , , , , , , , , , 5.00, , , , ]";

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
	  	
	  	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(report_FilterBtn));
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
*/
	  	int reportsRow1ListCount = report1stRowList.size();
	  	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	  	for(int i=1;i<reportsRow1ListCount;i++)
	  	{
	  		String data = report1stRowList.get(i).getText();
	  		
	  		reportsRow1ListArray.add(data);
	  	}
	  	String actRow1List = reportsRow1ListArray.toString();
	  	String expRow1List = "[Vendor Semi Adjustment, 5.00, , Vendor Semi Adjustment]";
	  	

	  	int report2ndRowListCount = report2ndRowList.size();
	  	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
	  	for(int i=1;i<report2ndRowListCount;i++)
	  	{
	  		String data = report2ndRowList.get(i).getText();
	  		report2ndRowListArray.add(data);
	  	}
	  	String actRow2List = report2ndRowListArray.toString();
	  	String expRow2List = "[Grand Total, 5.00, , ]";

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
	  
	  @FindBy(xpath="//*[@id='REPORTRENDERNEWControls']/ul/li/span[9]")
		private static WebElement sl_AnalysisBtn;


	  public boolean checkSavingReportThroughAnalysisInLedgerReport() throws InterruptedException, IOException
	  {
	  	
	  	getDriver().navigate().refresh();
	  	
	  	Thread.sleep(1999);
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	  	financialsMenu.click();
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
	  	financialsReportsMenu.click();
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
	  	ledger.click();
	  	
	  	boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
	  	
	  	String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
	  	String expvalidationConfirmationMessage = "true";
	  	
	  	Thread.sleep(3000);
	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
	  	sl_DateOptionDropdown.click();
	  	Select s=new Select(sl_DateOptionDropdown);
	  	s.selectByValue("1");
	  	
	  	Thread.sleep(2000);

	     
	  	
	  	sl_SelectAllItemsChkBox.click();
	  	
	  	Thread.sleep(2000);
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
	  	sl_OkBtn.click();

	  	Thread.sleep(2000);

	  	
	  	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_AnalysisBtn));
	  	sl_AnalysisBtn.click();
	  	
	  	Thread.sleep(2999);
	  	//Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\Ledger.exe");
	  	Thread.sleep(15000);

	  	
	  	//sl_LA_saveBtn.click();
	  	
	  	return true;
	  	
	  }


  
	
		 public BillWiseNewReferencePage(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
			 
		 }
		 
		 
		 

}