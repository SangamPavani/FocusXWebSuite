package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.utilities.POJOUtility;

public class SmokeCurrencyPage extends BaseEngine 
{
	
    //Home Menu
	
		
		// ISO CurrencyPopUp
		//---------------------------------------------------------------------------------------------------------------------
		
		@FindBy(xpath="//td[@id='ISOCurrencyCode_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		private static WebElement  ISOCurrencyCodeSettingsBtn;
		
			@FindBy(xpath="//h4[@id='ISOCurrencyCode_customize_popup_heading']")
			private static WebElement  ISOCurrencyCode_CustomizeDisplayColumnsLabel;
		
				@FindBy(xpath="//div[@id='ISOCurrencyCode_customize_popup_container']")
				private static WebElement  ISOCurrencysCodeContainerTxt;
				
				@FindBy(xpath="//div[@id='ISOCurrencyCode_customize_popup_footer']//input[1]")
				private static WebElement  ISOCurrencyCodeStanadrdfieldsBtn;
				
					@FindBy(xpath="//select[@id='ISOCurrencyCode_customize_popup_standardfields_list']")
					private static WebElement  ISOCurrencyCodeStanadrdfields_Fielddropdown;
					
					@FindBy(xpath="//input[@id='ISOCurrencyCode_customize_popup_standardfields_header']")
					private static WebElement  ISOCurrencyCodeStanadrdfields_headerTxt;
					
					@FindBy(xpath="//select[@id='ISOCurrencyCode_customize_popup_standardfields_alignment']")
					private static WebElement  ISOCurrencyCodeStanadrdfields_Allignmentdropdown;
					
					@FindBy(xpath="//input[@id='ISOCurrencyCode_customize_popup_standardfields_width']")
					private static WebElement  ISOCurrencyCodeStanadrdfields_WidthTxt;
					
					@FindBy(xpath="//div[@id='currencyMasterWidth']//input[3]")
					private static WebElement  ISOCurrencyCodeStanadrdfields_OkBtn;
					
					@FindBy(xpath="//section[@id='page_Content']//input[4]")
					private static WebElement  ISOCurrencyCodeStanadrdfields_CancelBtn;
				
				@FindBy(xpath="//div[@id='ISOCurrencyCode_search_container']//input[2]")
				private static WebElement  ISOCurrencyCodedeleteColumnBtn;
				
				@FindBy(xpath="//div[@id='currencyMasterWidth']//input[3]")
				private static WebElement  ISOCurrencyCodeOkBtn;
				
				@FindBy(xpath="//section[@id='page_Content']//input[4]")
				private static WebElement  ISOCurrencyCodeCancelBtn;
		
		
		// Control SymbolPop Up---------------------------------------------------------------------------------------------------------------------
		
		@FindBy(xpath="//td[@id='controlSymbol_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		private static WebElement  symbolSettingsBtn;
		
			@FindBy(xpath="//h4[@id='controlSymbol_customize_popup_heading']")
			private static WebElement  symbol_CustomizeDisplayColumnsLabel;
		
				@FindBy(xpath="//div[@id='controlSymbol_customize_popup_container']")
				private static WebElement  ISOCurrencysSymbolContainerTxt;
				
				@FindBy(xpath="//div[@id='controlSymbol_customize_popup_footer']//input[1]")
				private static WebElement  symbolStanadrdfieldsBtn;
				
					@FindBy(xpath="//select[@id='controlSymbol_customize_popup_standardfields_list']")
					private static WebElement  symbolStanadrdfields_Fielddropdown;
					
					@FindBy(xpath="//input[@id='controlSymbol_customize_popup_standardfields_header']")
					private static WebElement  symbolStanadrdfields_headerTxt;
					
					@FindBy(xpath="//select[@id='controlSymbol_customize_popup_standardfields_alignment']")
					private static WebElement  symbolStanadrdfields_Allignmentdropdown;
					
					@FindBy(xpath="//input[@id='controlSymbol_customize_popup_standardfields_width']")
					private static WebElement  symbolStanadrdfields_WidthTxt;
					
					@FindBy(xpath="//div[@id='currencyMasterWidth']//input[3]")
					private static WebElement  symbolStanadrdfields_OkBtn;
					
					@FindBy(xpath="//section[@id='page_Content']//input[4]")
					private static WebElement  symbolStanadrdfields_CancelBtn;
				
				@FindBy(xpath="//div[@id='controlSymbol_search_container']//input[2]")
				private static WebElement  symboldeleteColumnBtn;
				
				@FindBy(xpath="//div[@id='currencyMasterWidth']//input[3]")
				private static WebElement  symbolOkBtn;
				
				@FindBy(xpath="//section[@id='page_Content']//input[4]")
				private static WebElement  symbolCancelBtn;
					
		
		@FindBy(xpath="//input[@id='NoOfDesimals']")
		private static WebElement noOfDecimalsTxt;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/fieldset[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]")
		private static WebElement tableRow;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/fieldset[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[1]")
		private static WebElement tableCol;
		
		
		//Grid Fields------Denomination Details
		
		@FindBy(xpath="//td[@id='CurrencyMasterGrid_col_1-1']")
		private static WebElement denominationCode1;
		
		@FindBy(xpath="//input[@id='CurrencyMasterGrid_control_heading_ctrl_2']")
		private static WebElement denominationValue1;
		
		@FindBy(xpath="//td[@id='CurrencyMasterGrid_col_2-1']")
		private static WebElement denominationCode2;
		
		@FindBy(xpath="//td[@id='CurrencyMasterGrid_col_2-2']")
		private static WebElement denominationValue2 ;
		
		    //Pop Up Field******************************************************
		
		//	@FindBy(xpath="//*[@id='div_ExchangeRate']/div[2]/div/div[1]/button/preceding-sibling::h4")
		@FindBy(xpath="(//h4[@id='FullScreen_ModalTitle'])[1]")	
		private static WebElement exchangeRateDefinitionLabelInPopup;
			
			@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[1]/a[@title='Import']/i")
			private static WebElement importFromExcelIcon;
			                  
			@FindBy(xpath="(//*[@id='navbarSupportedContent2']/ul/li[2]/a/i)[2]")
			private static WebElement exchangeRateDefinitionClearIconInPopup;
			
			@FindBy(xpath="//*[@id='navbarSupportedContent2']/ul/li[3]/a/i")
			private static WebElement exchangeRateDefinitionClearIcon;
			
			
		
			
			
			
				
					@FindBy(xpath="//h4[@id='id_option_customize_popup_heading']")
					private static WebElement  baseCurrency_CustomizeDisplayColumnsLabel;
					                          
						@FindBy(xpath="//div[@id='id_option_customize_popup_container']")
						private static WebElement  baseCurrencyscodeContainerTxt;
						               
						@FindBy(xpath="//div[@id='id_option_customize_popup_footer']//input[1]")
						private static WebElement  baseCurrencyStanadrdfieldsBtn;
						
							@FindBy(xpath="//select[@id='id_option_customize_popup_standardfields_list']")
							private static WebElement  baseCurrencyStanadrdfields_Fielddropdown;
							
							@FindBy(xpath="//input[@id='id_option_customize_popup_standardfields_header']")
							private static WebElement  baseCurrencyStanadrdfields_headerTxt;
							
							@FindBy(xpath="//select[@id='id_option_customize_popup_standardfields_alignment']")
							private static WebElement  baseCurrencyStanadrdfields_Allignmentdropdown;
							
							@FindBy(xpath="//input[@id='id_option_customize_popup_standardfields_width']")
							private static WebElement  baseCurrencyStanadrdfields_WidthTxt;
							
							@FindBy(xpath="//div[@class='row']//input[3]")
							private static WebElement  baseCurrencyStanadrdfields_OkBtn;
							
							@FindBy(xpath="//section[@id='page_Content']//input[4]")
							private static WebElement  baseCurrencyStanadrdfields_CancelBtn;
						
						@FindBy(xpath="//div[@id='id_option_search_container']//input[2]")
						private static WebElement  baseCurrencydeleteColumnBtn;
						
						@FindBy(xpath="//div[@class='row']//input[3]")
						private static WebElement  baseCurrencyOkBtn;
							
							@FindBy(xpath="//section[@id='page_Content']//input[4]")
							private static WebElement  baseCurrencyCancelBtn;
			
			
			
		
		
		//Grid Fields
		
		@FindBy(xpath="//input[@id='ExchangeTable_CurrencyName']")
		private static WebElement gridcurrencyName1Txt;
		
		@FindBy(xpath="//td[@id='ExchangeTable_CurrencyName_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		private static WebElement  currencyNameSettingsBtn;
		
			//Pop Up----------------------------------------------------------------------------------------------------------------------------------------------
			@FindBy(xpath="//h4[@id='ExchangeTable_CurrencyName_customize_popup_heading']")
			private static WebElement  currencyName_CustomizeDisplayColumnsLabel;
			
				@FindBy(xpath="//div[@id='ExchangeTable_CurrencyName_customize_popup_container']")
				private static WebElement  currencyNameContainerTxt;
				
				@FindBy(xpath="//div[@id='ExchangeTable_CurrencyName_customize_popup_footer']//input[1]")
				private static WebElement  currencyNameStanadrdfieldsBtn;
				
					@FindBy(xpath="//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_list']")
					private static WebElement  currencyNameStanadrdfields_Fielddropdown;
					
					@FindBy(xpath="//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_header']")
					private static WebElement  currencyNameStanadrdfields_headerTxt;
					
					@FindBy(xpath="//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_alignment']")
					private static WebElement  currencyNameStanadrdfields_Allignmentdropdown;
					
					@FindBy(xpath="//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_width']")
					private static WebElement  currencyNameStanadrdfields_WidthTxt;
					
					@FindBy(xpath="//table[@id='ExchangeTable']//input[3]")
					private static WebElement  currencyNameStanadrdfields_OkBtn;
					
					@FindBy(xpath="//section[@id='page_Content']//input[4]")
					private static WebElement  currencyNameStanadrdfields_CancelBtn;
				
				@FindBy(xpath="//div[@id='ExchangeTable_CurrencyName_search_container']//input[2]")
				private static WebElement  currencyNamedeleteColumnBtn;
				
				@FindBy(xpath="//table[@id='ExchangeTable']//input[3]")
				private static WebElement  currencyNameOkBtn;
				
				@FindBy(xpath="//section[@id='page_Content']//input[4]")
				private static WebElement  currencyNameCancelBtn;
		
				@FindBy(xpath="//input[@id='EffectiveDate']")
				private static WebElement withEffectiveDateTxt;
						
				@FindBy(xpath="//*[@id='EffectiveDate_input_image']/span")
				private static WebElement dOne;
				
				@FindBy(xpath="//*[@id='EffectiveDate_day_today']/td/span[1]")
				private static WebElement dTwo;
				
				@FindBy(xpath="//input[@id='ExchangeTable_DefinedAs']")
				private static WebElement gridDefineAsTxt;
				
				@FindBy(xpath="//input[@id='ExchangeTable_Rate']")
				private static WebElement gridRateTxt;
				
				
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_1-2']")
		private static WebElement gridDefineAs1Txt;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_1-3']")
		private static WebElement gridRate1Txt;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_1-4']")
		private static WebElement gridDescription1Txt;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_2-1']")
		private static WebElement gridcurrencyName2Txt;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_2-2']")
		private static WebElement gridDefineAs2Txt;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_2-3']")
		private static WebElement gridRate2Txt;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_2-4']")
		private static WebElement gridDescription2Txt;
		
	
	
	
		
		//Exchange Rate Definition-------------------------------------------------------------------------------------------
		
		//Label is Same As Above  Exchange Rate Definition
		
		//Header Fields
		
		@FindBy(xpath="//i[@class='icon-font7 icon-delete']")
		private static WebElement exchangeRateDefinitionDeleteIcon;
		
		@FindBy(xpath=" //span[@id='closeExchangeRate']//i[@class='icon-font7 icon-close']")
		private static WebElement exchangeRateDefinitionCloseIcon;
		

	
		
		
		//Grid
		@FindBy(xpath="//input[@id='chkSelectAll']")
		private static WebElement toSelectAllChkBox;
		
		@FindBy(xpath="//input[@id='ExchangeTable_chk0']")
		private static WebElement row1Chkbox;
		
		@FindBy(xpath="//input[@id='//td[@id='ExchangeTable_col_1-2']")
		private static WebElement selectCurrency1;
		
		//PopUp-------------------------------------------------------------------------------------------------------------------------
		
		@FindBy(xpath="//td[@id='ExchangeTable_CurrencyName_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		private static WebElement  selectCurrencySettingsBtn;
		         
			@FindBy(xpath="//h4[@id='ExchangeTable_CurrencyName_customize_popup_heading']")
			private static WebElement  selectCurrency_CustomizeDisplayColumnsLabel;
		
				@FindBy(xpath="//div[@id='ExchangeTable_CurrencyName_customize_popup_container']")
				private static WebElement  isoCurrencysselectCurrencysCodeContainerTxt;
				
				@FindBy(xpath="//div[@id='ExchangeTable_CurrencyName_customize_popup_footer']//input[1]")
				private static WebElement  selectCurrencyStanadrdfieldsBtn;
				
					@FindBy(xpath="//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_list']")
					private static WebElement  selectCurrencyStanadrdfields_Fielddropdown;
					
					@FindBy(xpath="//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_header']")
					private static WebElement  selectCurrencyStanadrdfields_headerTxt;
					
					@FindBy(xpath="//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_alignment']")
					private static WebElement  selectCurrencyStanadrdfields_Allignmentdropdown;
					
					@FindBy(xpath="//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_width']")
					private static WebElement  selectCurrencyStanadrdfields_WidthTxt;
					
					@FindBy(xpath="//section[@id='page_Content']//input[3]")
					private static WebElement  selectCurrencyStanadrdfields_OkBtn;
					
					@FindBy(xpath="//section[@id='page_Content']//input[4]")
					private static WebElement  selectCurrencyStanadrdfields_CancelBtn;
				
				@FindBy(xpath="//div[@id='ExchangeTable_CurrencyName_search_container']//input[2]")
				private static WebElement  selectCurrencydeleteColumnBtn;
				
				@FindBy(xpath="//section[@id='page_Content']//input[3]")
				private static WebElement  selectCurrencyOkBtn;
				
				@FindBy(xpath="//section[@id='page_Content']//input[4]")
				private static WebElement  selectCurrencyCancelBtn;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_1-3']")
		private static WebElement DefineAs1Txt;
		
		
		
		@FindBy(xpath="//tbody[@id='HistoryTableBody']/tr/td[3]")
		private static WebElement valueUSD;
		
		@FindBy(xpath="//tbody[@id='HistoryTableBody']/tr/td[4]")
		private static WebElement valueAED;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_1-2']")
		private static WebElement selCurrencyOne;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_2-2']")
		private static WebElement selCurrecnyTwo;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_1-3']")
		private static WebElement defCurrecnyOne;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_2-3']")
		private static WebElement defCurrecnyTwo;
		
		
		
		//Grid Second Row-----------------------------
		@FindBy(xpath="//input[@id='ExchangeTable_chk1']")
		private static WebElement Row2Chkbox;
		                
		@FindBy(xpath="//td[@id='ExchangeTable_col_2-2']")
		private static WebElement SelectCurrency2;
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_1-3']")
		private static WebElement DefineAs2Txt;
		
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_1-0']")
		private static WebElement selectRow;
		
		@FindBy(xpath="//div[contains(text(),'Delete Row')]")
		private static WebElement selectDeleteOption;
		
		@FindBy(xpath="//span[@id='DeleteData']")
		private static WebElement exchnageRateDeleteOption;
		
		
		//Validation Messages for all Pages
		@FindBy(xpath="//div[@id='idGlobalError']")
		public static WebElement validationConfirmationMessage;
		
		@FindBy(xpath="//div[@id='idGlobalError']//td[3]")
		public static WebElement closeValidationConfirmationMessage;
		
		
		@FindBy(xpath="//*[@id='dashName']")
	    private static WebElement labelDashboard ;
		
		@FindBy(xpath="//*[@id='Select_dash']")
		private static WebElement selectDashboard ;
			
		@FindBy(xpath="//*[@id='Dashboard_AddDash']")
	    private static WebElement newAddDashBoard;
		 
	    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
        private static WebElement dashboardCustomizationSettings;
	
	  
	
	    
	    
	    private static String xlfile;
		private static String resPass = "Pass";
		private static String resFail = "Fail";
		private static ExcelReader excelReader;
		private static boolean methodReturnStatus;
		private static String xlSheetName = "SmokeMasters";
		private static boolean statusOfValue;
	    private static Alert alert;
	
		// Login Page
	
		
		private static int cSize; 
		
		
		
		
		
		
	
	    public boolean checkSignToCheckCurrencyMastersPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	    {
	      excelReader = new ExcelReader(POJOUtility.getExcelPath());
	      xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
	      System.out.println("***************** checkSignToCheckCurrencyMastersPage Method Executes.............  *********************");
	      
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
	 		 
	 		 Thread.sleep(5000);
	 		 
	 		 reLogin(unamelt, pawslt, "Automation Company");
	 		
	 		 
	 		 int actMenusCount	= menusList.size();
	 		 
	 		 ArrayList<String> actMenusArray=new ArrayList<String>();
	 		 
	 		 for (int j = 0; j < actMenusCount; j++) 
	 		 {
	 			 String data = menusList.get(j).getText();
	 			 actMenusArray.add(data);
	 		 }	
	 				
	 		 String actMenus 	=actMenusArray.toString();
	 		 String expMenus	= excelReader.getCellData(xlSheetName, 8, 7);
	 		 
	 		 System.out.println("Menus Display Value Actual        : " + actMenus);
	 		 System.out.println("Menus Display Value Expected      : " + expMenus);
	 		 
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
	 		 String actUserInfo = userNameTxt.getText();
	 		 String expUserInfo = excelReader.getCellData(xlSheetName, 9, 7);	
	 		 
	 		 System.out.println("User Name Display Value Actual    : " + actUserInfo            + " Value Expected : " + expUserInfo);
	 		 
	
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
	 		companyLogoImg.click();
	 		 
	 
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
	 		 String actGetLoginCompanyNameInformation = companyName.getText();
	 		 String actGetLoginCompanyName   = actGetLoginCompanyNameInformation.substring(0, 19);
	 		 String expGetLoginCompanyName   = excelReader.getCellData(xlSheetName, 10, 7);
	 		
	 		 System.out.println("Company Name Display Value Actual : " + actGetLoginCompanyName + " Value Expected : " + expGetLoginCompanyName);
	 		 
	 		companyLogoImg.click();
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
	 		 String actDashboardLabel        = dashboardName.getText();
	 		 String expDashboardLabel        = excelReader.getCellData(xlSheetName, 11, 7);
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 8, 8, actMenus);
	 		 excelReader.setCellData(xlfile, xlSheetName, 9, 8, actUserInfo);
	 		 excelReader.setCellData(xlfile, xlSheetName, 10, 8, actGetLoginCompanyName);
	 		 excelReader.setCellData(xlfile, xlSheetName, 11, 8, actDashboardLabel);
	 		

	 		 System.out.println("Dashboard Label Value Actual      : " + actDashboardLabel      + " Value Expected : " + expDashboardLabel);
	 		 
	 		 if (actUserInfo.equalsIgnoreCase(expUserInfo) && actGetLoginCompanyName.equalsIgnoreCase(expGetLoginCompanyName)
	 				 && actDashboardLabel.equalsIgnoreCase(expDashboardLabel)/* && actMenus.equalsIgnoreCase(expMenus)*/) 
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
	
	
		
		
	    //CURRENCY EXCHANGE RATE PAGE STARTS
	    
	   

	    public boolean checkCurrencyMenuUnderMastersMenuFromHomeMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	    {
	      excelReader = new ExcelReader(POJOUtility.getExcelPath());
	      xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	     
	      System.out.println("***************** checkCurrencyMenuUnderMastersMenuFromHomeMenu Method Executes.............    **************");
	    
	      try
	      {	
	      	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	  		homeMenu.click();

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	  		mastersMenu.click();

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMenu));
	  		currencyMenu.click();
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateHistoryMenu));
	  		
	  		int currencyMenuListCount = currencyMenuList.size();
	  		
	  		ArrayList<String> currencyMenuListArray = new ArrayList<String>();
	  		
	  		for (int i=0;i<currencyMenuListCount;i++)
	  		{
	  			String data = currencyMenuList.get(i).getText();
	  			currencyMenuListArray.add(data);
	  		}
	  		
	  		String actcurrencyMenuList = currencyMenuListArray.toString();
	  		String expcurrencyMenuList = excelReader.getCellData(xlSheetName, 155, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 155, 8, actcurrencyMenuList);
	  				
	  		System.out.println("currencyMenuList Actual   : "+actcurrencyMenuList);
	  		System.out.println("currencyMenuList Expected : "+expcurrencyMenuList);
	  		
	  		if (actcurrencyMenuList.equalsIgnoreCase(expcurrencyMenuList)) 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 154, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 154, 9, resFail);
	  			return false;
	  		}
	      }
	      catch (Exception e) 
	      {
	      	excelReader.setExceptionInExcel(xlfile, xlSheetName, 154, 10, e.getMessage());
	      	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	      	return false;
	      }
	    }


	   
	    
	    
	   // This checkValidationMessagebooleanIsEmpty Method Used in Page Class But Not To Call in Test Class
	    
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
	    
	    
	   public static boolean checkClickOnCurrencyMasterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("******************** checkClickOnCurrencyMasterMenuToDisplayCurrencyPage Method Executes.............  *********************************");

	  	try 
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMasterMenu));
	  		currencyMasterMenu.click();
	  		//Thread.sleep(2000);

	  		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	  		boolean expSummaryErrorMessage  = true;
	  		
	        System.out.println("Opening Currency Master Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	          
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMasterlabel));
	          
	  		String actCuurencyMasterLabel      = currencyMasterlabel.getText();
	  		String expCuurencyMasterLabel      = excelReader.getCellData(xlSheetName, 157, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 157, 8, actCuurencyMasterLabel);
	  		
	  		int currencyRibbonControlListCount = currencyRibbonControlList.size();
	  		
	  		ArrayList<String> currencyRibbonControlListArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<currencyRibbonControlListCount;i++)
	  		{
	  			String data = currencyRibbonControlList.get(i).getText();
	  			currencyRibbonControlListArray.add(data);
	  		}
	  		
	  		String actcurrencyRibbonControlList = currencyRibbonControlListArray.toString();
	  		String expcurrencyRibbonControlList = excelReader.getCellData(xlSheetName, 158, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 158, 8, actcurrencyRibbonControlList);
	  		
	  		int currencyDetailsListCount = currencyDetailsLableList.size();
	  		
	  		ArrayList<String> currencyDetailsListArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<currencyDetailsListCount;i++)
	  		{
	  			String data = currencyDetailsLableList.get(i).getText();
	  			currencyDetailsListArray.add(data);
	  		}
	  		
	  		String actcurrencyDetailsList = currencyDetailsListArray.toString();
	  		String expcurrencyDetailsList = "[ISO Currency Code, Coins Name, Symbol, Currency Name, No Of Decimals, Numeric Seperator]";
	  		
	  		
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 159, 8, actcurrencyDetailsList);
	  		
	  		
	  		int actCurrencyDetailsDropdwonListCount = currencyDetailsDropdownList.size();
	  		int expCurrencyDetailsDropdwonListCount = 6;
	  		
	  		int roundingOffDetailsListCount = roundingOffDetailsList.size();
	  		
	  		ArrayList<String> roundingOffDetailsListArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<roundingOffDetailsListCount;i++)
	  		{
	  			String data = roundingOffDetailsList.get(i).getText();
	  			roundingOffDetailsListArray.add(data);
	  		}
	  		
	  		String actroundingOffDetailsList = roundingOffDetailsListArray.toString();
	  		String exproundingOffDetailsList = excelReader.getCellData(xlSheetName, 160, 7);
	  		
	  		//
	  		
	  		
	  		int currencyConnectorListCount = currencyConnectorList.size();
	  		
	  		ArrayList<String> currencyConnectorListArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<currencyConnectorListCount;i++)
	  		{
	  			String data = currencyConnectorList.get(i).getText();
	  			currencyConnectorListArray.add(data);
	  		}
	  		
	  		String actcurrencyConnectorList = currencyConnectorListArray.toString();
	  		String expcurrencyConnectorList = "[Currency Connector, Currency Unit, Currency SubUnit, Connector]";
	  		
	  		System.out.println("actcurrencyConnectorList :" +actcurrencyConnectorList);
	  		System.out.println("expcurrencyConnectorList :" +expcurrencyConnectorList);
	  		
	  		/*
	  		excelReader.setCellData(xlfile, xlSheetName, 160, 8, actroundingOffDetailsList);*/
	  		
	  		String actdenominationDetailsLabel      = denominationDetailsLabel.getText();
	  		String expdenominationDetailsLabel      = excelReader.getCellData(xlSheetName, 161, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 161, 8, actdenominationDetailsLabel);
	  		
	  		int denominationDetailsGridHeaderCount = denominationDetailsGridHeader.size();
	  		
	  		ArrayList<String> denominationDetailsGridHeaderArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<denominationDetailsGridHeaderCount;i++)
	  		{
	  			String data = denominationDetailsGridHeader.get(i).getText();
	  			denominationDetailsGridHeaderArray.add(data);
	  		}
	  		
	  		String actdenominationDetailsGridHeader = denominationDetailsGridHeaderArray.toString();
	  		String expdenominationDetailsGridHeader = excelReader.getCellData(xlSheetName, 162, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 162, 8, actdenominationDetailsGridHeader);
	  		
	  		
	  		System.out.println("Currency Label Value Actual       					     : " + actCuurencyMasterLabel      + " Value Expected : " + expCuurencyMasterLabel);
	  		System.out.println("denominationDetailsLabel          					     : " + actdenominationDetailsLabel + " Value Expected : " + expdenominationDetailsLabel);
	  		System.out.println("currencyRibbonControlList Actual                         : " + actcurrencyRibbonControlList);
	  		System.out.println("currencyRibbonControlList Expected                       : " + expcurrencyRibbonControlList);
	  		System.out.println("currencyDetailsList Actual                               : " + actcurrencyDetailsList);
	  		System.out.println("currencyDetailsList Expected                             : " + expcurrencyDetailsList);
	  		System.out.println("actCurrencyDetailsDropdwonListCount Actual             	 : " + actCurrencyDetailsDropdwonListCount);
	  		System.out.println("expCurrencyDetailsDropdwonListCount Expected             : " + expCurrencyDetailsDropdwonListCount);
	  		System.out.println("roundingOffDetailsList Actual                            : " + actroundingOffDetailsList);
	  		System.out.println("roundingOffDetailsList Expected                          : " + exproundingOffDetailsList);
	          

	  		if (actCuurencyMasterLabel.equalsIgnoreCase(expCuurencyMasterLabel) /*&& actcurrencyRibbonControlList.equalsIgnoreCase(expcurrencyRibbonControlList)*/
	  				&& actcurrencyDetailsList.equalsIgnoreCase(expcurrencyDetailsList)) 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 156, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 156, 9, resFail);
	  			return false;
	  		}
	  	} 
	  	catch (Exception e) 
	    {
	      	excelReader.setExceptionInExcel(xlfile, xlSheetName, 156, 10, e.getMessage());
	      	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	      	return false;
	    }
	  }

	   
	   
	   @FindBy(xpath="//div[@id='currencyMasterWidth']/fieldset/div")
	   private static WebElement currencyDropdownSeventhRowValue ;
	   
	   @FindBy(xpath="//tbody[@id='ISOCurrencyCode_table_body']//tr//td[2]")
	   private static List<WebElement> isoCurrencyCodeComboList;
	   
	   
	   
	   
	   public static boolean checkSaveOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("******************** checkSaveOptionInCurrencyMaster Method Executes.............  *********************************");
	  	
	  	try
	  	{
	  		//Thread.sleep(4000);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
	  		ISOCurrencyCodeTxt.click();
	  		//Thread.sleep(2000);
	  		ISOCurrencyCodeTxt.sendKeys("INR");
	  		Thread.sleep(2000);
	  		ISOCurrencyCodeTxt.sendKeys(Keys.TAB);
	  		
	  		//Thread.sleep(2000);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
	  		ISOCurrencyCodeTxt.click();
	  		
	  	    		
	  		// Check The coins Code will be different as we will restore the backup

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxtInCurrency));
	  		String actISOCurrencyCode             = ISOCurrencyCodeTxt.getAttribute("value");
	  		String actCoinsNameTxt                = coinsNameTxt.getAttribute("value");
	  		String actCurrencyNameTxt             = currencyNameTxt.getAttribute("value");
	  		String actRoundOff                    = generalRoundOffTxt.getAttribute("value");

	  	    Select roundTypeOptions               = new Select(roundingTypeDropdownInCurrency);
	  		String actRoundingType                = roundTypeOptions.getFirstSelectedOption().getText();

	  		String actCurrencyMasterControlSymbol = controlSymbolDropdown.getAttribute("value");
	  		String actNoOfDecimals                = noOfDecimalsTxtInCurrency.getAttribute("value");

	  		String expISOCurrencyCode             = excelReader.getCellData(xlSheetName, 164, 7);
	  		String expCoinsNameTxt                = excelReader.getCellData(xlSheetName, 165, 7);
	  		String expCurrencyNameTxt             = excelReader.getCellData(xlSheetName, 166, 7);
	  		String expRoundOff                    = excelReader.getCellData(xlSheetName, 167, 7);
	  		String expRoundingType                = excelReader.getCellData(xlSheetName, 168, 7);
	  		String expCurrencyMasterControlSymbol = excelReader.getCellData(xlSheetName, 169, 7);
	  		String expNoOfDecimals                = excelReader.getCellData(xlSheetName, 170, 7);

	  		
	  		System.out.println("ISO Currency Value Actual                 : " + actISOCurrencyCode               + " Value Expected : " + expISOCurrencyCode);
	  		System.out.println("Coins Name Value Actual                   : " + actCoinsNameTxt                  + " Value Expected : " + expCoinsNameTxt);
	  		System.out.println("Currency Name Value Actual                : " + actCurrencyNameTxt               + " Value Expected : " + expCurrencyNameTxt);
	  	    System.out.println("Round Off Value Actual                    : " + actRoundOff                      + " Value Expected : " + expRoundOff);
	  		System.out.println("Round Type Value Actual                   : " + actRoundingType                  + " Value Expected : " + expRoundingType);
	  		System.out.println("Symbol Value Actual                       : " + actCurrencyMasterControlSymbol   + " Value Expected : " + expCurrencyMasterControlSymbol);
	  		System.out.println("No Of Decimals Value Actual               : " + actNoOfDecimals                  + " Value Expected : " + expNoOfDecimals);
	  		
	  		
	  		Thread.sleep(2000);
	  		
	  		
	  		//Save with SLL Currency Name
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
	  		ISOCurrencyCodeTxt.click();
	  		//Thread.sleep(2000);
	  		ISOCurrencyCodeTxt.sendKeys(Keys.END);
	  		ISOCurrencyCodeTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  		Thread.sleep(2000);
	  		ISOCurrencyCodeTxt.sendKeys("SLL");
	  		Thread.sleep(2000);
	  		ISOCurrencyCodeTxt.sendKeys(Keys.TAB);
	  	
	  		
	  		
	  	
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(coinsNameTxt));
	  		coinsNameTxt.sendKeys(Keys.TAB);
	  		
	  		
	  		
	  		coinsNameTxt.click();
	  		coinsNameTxt.sendKeys(Keys.HOME);
	  		coinsNameTxt.sendKeys(Keys.SHIFT, Keys.END);
	  		coinsNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 171, 6));
	 
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(coinsNameTxt));
	  		coinsNameTxt.sendKeys(Keys.TAB);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxtInCurrency));
	  		noOfDecimalsTxtInCurrency.click();
	  		noOfDecimalsTxtInCurrency.sendKeys(Keys.HOME);
	  		noOfDecimalsTxtInCurrency.sendKeys(Keys.SHIFT, Keys.END);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxtInCurrency));
	  		noOfDecimalsTxtInCurrency.sendKeys(excelReader.getCellData(xlSheetName, 164, 6));
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(noOfDecimalsTxtInCurrency));
	  		noOfDecimalsTxtInCurrency.sendKeys(Keys.TAB);

	  		boolean actAlertPresent = getIsAlertPresent();
	  		boolean expAlertPresent = true;

	  		if(getIsAlertPresent())
	  		{
	  		getWaitForAlert();

	  		getAlert().accept();
	  		}
	  		

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveIcon));
	  		saveIcon.click();

	  		String expSaveCurrency = excelReader.getCellData(xlSheetName, 171, 7);

	  		boolean actSaveDisplayMessageOkIsClicked = checkValidationMessageboolean(expSaveCurrency);
	  		boolean expSaveDisplayMessageOkIsClicked = true;
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 164, 8, actISOCurrencyCode);
	  		excelReader.setCellData(xlfile, xlSheetName, 165, 8, actCoinsNameTxt);
	  		excelReader.setCellData(xlfile, xlSheetName, 166, 8, actCurrencyNameTxt);
	  		excelReader.setCellData(xlfile, xlSheetName, 167, 8, actRoundOff);
	  		excelReader.setCellData(xlfile, xlSheetName, 168, 8, actRoundingType);
	  		excelReader.setCellData(xlfile, xlSheetName, 169, 8, actCurrencyMasterControlSymbol);
	  		excelReader.setCellData(xlfile, xlSheetName, 170, 8, actNoOfDecimals);
	  		
	  		System.out.println("ISO Currency Value Actual                 : " + actISOCurrencyCode               + " Value Expected : " + expISOCurrencyCode);
	  		System.out.println("Coins Name Value Actual                   : " + actCoinsNameTxt                  + " Value Expected : " + expCoinsNameTxt);
	  		System.out.println("Currency Name Value Actual                : " + actCurrencyNameTxt               + " Value Expected : " + expCurrencyNameTxt);
	  	    System.out.println("Round Off Value Actual                    : " + actRoundOff                      + " Value Expected : "+ expRoundOff);
	  		System.out.println("Round Type Value Actual                   : " + actRoundingType                  + " Value Expected : " + expRoundingType);
	  		System.out.println("Symbol Value Actual                       : " + actCurrencyMasterControlSymbol   + " Value Expected : " + expCurrencyMasterControlSymbol);
	  		System.out.println("No Of Decimals Value Actual               : " + actNoOfDecimals                  + " Value Expected : " + expNoOfDecimals);
	  		System.out.println("Alert Is Display on Modify Value Actual   : " + actAlertPresent                  + " Value Expected : " + expAlertPresent);
	  		System.out.println("Save Currency Message Value Actual        : " + actSaveDisplayMessageOkIsClicked + " Value Expected : " + expSaveDisplayMessageOkIsClicked);

	  		if (actISOCurrencyCode.equalsIgnoreCase(expISOCurrencyCode) && actCoinsNameTxt.equalsIgnoreCase(expCoinsNameTxt)
	  				&& actCurrencyNameTxt.equalsIgnoreCase(expCurrencyNameTxt) && actRoundOff.equalsIgnoreCase(expRoundOff)
	  				&& actRoundingType.equalsIgnoreCase(expRoundingType)
	  				&& actCurrencyMasterControlSymbol.equalsIgnoreCase(expCurrencyMasterControlSymbol)
	  				&& actNoOfDecimals.equalsIgnoreCase(expNoOfDecimals)
	  				&& actSaveDisplayMessageOkIsClicked==expSaveDisplayMessageOkIsClicked) 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 163, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 163, 9, resFail);
	  			return false;
	  		}
	  	}
	  	catch (Exception e) 
	      {
	      	excelReader.setExceptionInExcel(xlfile, xlSheetName, 163, 10, e.getMessage());
	      	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	      	return false;
	      }

	   }

	   public static boolean checkCurrencyUpdateInformationInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("******************** checkCurrencyUpdateInformationInCurrencyMaster Method Executes.............  *********************************");

	  	try
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
	  		ISOCurrencyCodeTxt.click();
	  		ISOCurrencyCodeTxt.sendKeys("s");
	  		
	  		int isoCurrencyCodeComboListCount = isoCurrencyCodeComboList.size();
	  		
	  		ArrayList<String> isoCurrencyCodeComboListArray = new ArrayList<String>();
	  		
	  		for(int i=1;i<isoCurrencyCodeComboListCount;i++)
	  		{
	  			String data=isoCurrencyCodeComboList.get(i).getText();
	  			if(data.equalsIgnoreCase("SLL"))
	  			{
	  				isoCurrencyCodeComboList.get(i).click();
	  			}
	  		}
	  	
	  		ISOCurrencyCodeTxt.sendKeys(Keys.TAB);

	  		Thread.sleep(2000);
	  		
	  		// Check The coins Code will be different as we will restore the backup

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(coinsNameTxt));
	  		String actISOCurrencyCode             = ISOCurrencyCodeTxt.getAttribute("value");
	  		String actCoinsNameTxt                = coinsNameTxt.getAttribute("value");
	  		String actCurrencyNameTxt             = currencyNameTxt.getAttribute("value");
	  		String actRoundOff                    = generalRoundOffTxt.getAttribute("value");

	  		Select roundTypeOptions               = new Select(roundingTypeDropdownInCurrency);
	  		String actRoundingType                = roundTypeOptions.getFirstSelectedOption().getText();

	  		String actCurrencyMasterControlSymbol = controlSymbolDropdown.getAttribute("value");
	  		String actNoOfDecimals                = noOfDecimalsTxtInCurrency.getAttribute("value");

	  		String expISOCurrencyCode             = excelReader.getCellData(xlSheetName, 173, 7);
	  		String expCoinsNameTxt                = excelReader.getCellData(xlSheetName, 174, 7);
	  		String expCurrencyNameTxt             = excelReader.getCellData(xlSheetName, 175, 7);
	  		String expRoundOff                    = excelReader.getCellData(xlSheetName, 176, 7);
	  		String expRoundingType                = excelReader.getCellData(xlSheetName, 177, 7);
	  		String expCurrencyMasterControlSymbol = excelReader.getCellData(xlSheetName, 178, 7);
	  		String expNoOfDecimals                = excelReader.getCellData(xlSheetName, 179, 7);

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(coinsNameTxt));
	  		coinsNameTxt.click();
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(coinsNameTxt));
	  		coinsNameTxt.sendKeys(Keys.END);
	  		coinsNameTxt.sendKeys(Keys.SHIFT, Keys.HOME);
	  		Thread.sleep(2000);
	  		coinsNameTxt.sendKeys(excelReader.getCellData(xlSheetName, 173, 7));
	  		coinsNameTxt.sendKeys(Keys.TAB);
	  		
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 173, 8, actISOCurrencyCode);
	  		excelReader.setCellData(xlfile, xlSheetName, 174, 8, actCoinsNameTxt);
	  		excelReader.setCellData(xlfile, xlSheetName, 175, 8, actCurrencyNameTxt);
	  		excelReader.setCellData(xlfile, xlSheetName, 176, 8, actRoundOff);
	  		excelReader.setCellData(xlfile, xlSheetName, 177, 8, actRoundingType);
	  		excelReader.setCellData(xlfile, xlSheetName, 178, 8, actCurrencyMasterControlSymbol);
	  		excelReader.setCellData(xlfile, xlSheetName, 179, 8, actNoOfDecimals);
	  		
	  		System.out.println("ISO Currency Value Actual                : " + actISOCurrencyCode+             " Value Expected : " + expISOCurrencyCode);
	  		System.out.println("Coins Name Value Actual                  : " + actCoinsNameTxt+                " Value Expected : " + expCoinsNameTxt);
	  		System.out.println("Currency Name Value Actual               : " + actCurrencyNameTxt+             " Value Expected : " + expCurrencyNameTxt);
	  		System.out.println("Round Off Value Actual                   : " + actRoundOff +                   " Value Expected : "+ expRoundOff);
	  		System.out.println("Round Type Value Actual                  : " + actRoundingType+                " Value Expected : " + expRoundingType);
	  		System.out.println("Symbol Value Actual                      : " + actCurrencyMasterControlSymbol+ " Value Expected : " + expCurrencyMasterControlSymbol);
	  		System.out.println("No Of Decimals Value Actual              : " + actNoOfDecimals+                " Value Expected : " + expNoOfDecimals);

	  		if (actISOCurrencyCode.equalsIgnoreCase(expISOCurrencyCode) && actCoinsNameTxt.equalsIgnoreCase(expCoinsNameTxt)
	  				&& actCurrencyNameTxt.equalsIgnoreCase(expCurrencyNameTxt) && actRoundOff.equalsIgnoreCase(expRoundOff)
	  				&& actRoundingType.equalsIgnoreCase(expRoundingType)
	  				&& actCurrencyMasterControlSymbol.equalsIgnoreCase(expCurrencyMasterControlSymbol)
	  				&& actNoOfDecimals.equalsIgnoreCase(expNoOfDecimals)) 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 172, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
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
	    
	    
	  	// Checking Exchange Rate Option in Currency Master
	   
	  

	   public static boolean checkClickOnExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {

	  	 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	 System.out.println("******************************* checkClickOnExchangeRateOptionInCurrencyMaster *************************************************");	

	  	 try
	  	 {	
	  		 Thread.sleep(3000);
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateIcon));
	  		exchangeRateIcon.click();
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionLabelInPopup));

	  		String actExchangeRateLabel   = exchangeRateDefinitionLabelInPopup.getText();
	  		String expExchangeRateLabel   = excelReader.getCellData(xlSheetName, 181, 7);
	  		
	  		int actexchangeRateDefintionRibbonControlListCount = exchangeRateDefintionRibbonControlList.size();
	  		int expexchangeRateDefintionRibbonControlListCount = 5;
	  		
	  		System.out.println("actexchangeRateDefintionRibbonControlListCount: "+actexchangeRateDefintionRibbonControlListCount);
	  		System.out.println("expexchangeRateDefintionRibbonControlListCount: "+expexchangeRateDefintionRibbonControlListCount);
	  		
	  		ArrayList<String> exchangeRateDefintionRibbonControlListArray = new ArrayList<String>();
	  		
	  		for(int i=0;i<actexchangeRateDefintionRibbonControlListCount;i++)
	  		{
	  			String data=exchangeRateDefintionRibbonControlList.get(i).getText();
	  			exchangeRateDefintionRibbonControlListArray.add(data);
	  		}
	  		
	  		String actexchangeRateDefintionRibbonControlList=exchangeRateDefintionRibbonControlListArray.toString();
	  		String expexchangeRateDefintionRibbonControlList=excelReader.getCellData(xlSheetName, 182, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 181, 8, actExchangeRateLabel);
	  		excelReader.setCellData(xlfile, xlSheetName, 182, 8, actexchangeRateDefintionRibbonControlList);

	  		System.out.println("Exchange Rate Value Actual                      : " + actExchangeRateLabel+ "  Value Expected : " + expExchangeRateLabel);
	  		System.out.println("exchangeRateDefintionRibbonControlList Actual   : "+actexchangeRateDefintionRibbonControlListCount);
	  		System.out.println("exchangeRateDefintionRibbonControlList Expected : "+expexchangeRateDefintionRibbonControlListCount);
	  		
	  		if (actExchangeRateLabel.equalsIgnoreCase(expExchangeRateLabel) 
	  				&& actexchangeRateDefintionRibbonControlListCount == expexchangeRateDefintionRibbonControlListCount) 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 180, 9, resPass);
	  			return true;
	  		}
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 180, 9, resFail);
	  			return false;
	  		}
	  		
	  	 }
	  	 catch (Exception e) 
	     {
	      	excelReader.setExceptionInExcel(xlfile, xlSheetName, 180, 10, e.getMessage());
	      	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	      	return false;
	     }
	    }

	  	public static boolean checkValuesInSavedExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  	{

	  	  excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	  System.out.println("******************************************************** checkValuesInSavedExchangeRateOptionInCurrencyMaster *****************************************************");
	  		
	  	  try
	  	  {
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		baseCurrencyTxt.click();
	  		baseCurrencyTxt.sendKeys("INR");
	  		Thread.sleep(2000);
	  		
	  		int baseCurrencyComboListCount = baseCurrencyComboList.size();
	  		
	  		/*ArrayList<String> baseCurrencyComboListArray = new ArrayList<String>();
	  		
	  		for(int i=1;i<baseCurrencyComboListCount;i++)
	  		{
	  			String data=baseCurrencyComboList.get(i).getText();
	  			if(data.equalsIgnoreCase("INR"))
	  			{
	  				baseCurrencyComboList.get(i).click();
	  			}
	  		}*/
	  	
	  		String actBaseCurrencyValue = baseCurrencyTxt.getAttribute("value");
	  		baseCurrencyTxt.sendKeys(Keys.TAB);
	  		
	  		String expBaseCurrencyValue = excelReader.getCellData(xlSheetName, 184, 7);
	  		
	  		System.out.println("Base Currency Value Actual             : " + actBaseCurrencyValue+       " Value Expected : " + expBaseCurrencyValue);

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  		withEffectiveDateTxt.click();

	  		String actWithEffectiveDate = withEffectiveDateTxt.getAttribute("value");
	  		//Thread.sleep(3000);
	  		Thread.sleep(2000);
	  		String actCurrencyNameR1C1 = exchangeRateDefinitionCurrencyNameRow1Col1.getText();
	  		String actCurrencyNameR2C1 = exchangeRateDefinitionCurrencyNameRow2Col1.getText();

	  		String actCurrencyDefinedAsR1C2 = exchangeRateDefinitionDefinedAsRow1Col2.getText();
	  		String actCurrencyDefinedAsR2C2 = exchangeRateDefinitionDefinedAsRow2Col2.getText();

	  		String actCurrencyRateR1C3 = exchangeRateDefinitionRateRow1Col3.getText();
	  		String actCurrencyRateR2C3 = exchangeRateDefinitionRateRow2Col3.getText();

	  		String actCurrencyDescriptionR1C4 = exchangeRateDefinitionDescriptionRow1Col4.getText();
	  		String actCurrencyDescriptionR2C4 = exchangeRateDefinitionDescriptionRow2Col4.getText();

	  		String expCurrencyNameR1C1 = excelReader.getCellData(xlSheetName, 185, 7);
	  		String expCurrencyNameR2C1 = excelReader.getCellData(xlSheetName, 186, 7);

	  		String expCurrencyDefinedAsR1C2 = excelReader.getCellData(xlSheetName, 187, 7);
	  		String expCurrencyDefinedAsR2C2 = excelReader.getCellData(xlSheetName, 188, 7);

	  		String expCurrencyRateR1C3 = excelReader.getCellData(xlSheetName, 189, 7);
	  		String expCurrencyRateR2C3 = excelReader.getCellData(xlSheetName, 190, 7);

	  		String expCurrencyDescriptionR1C4 = excelReader.getCellData(xlSheetName, 191, 7);
	  		String expCurrencyDescriptionR2C4 = excelReader.getCellData(xlSheetName, 192, 7);
	  		
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 184, 8, actBaseCurrencyValue);
	  		excelReader.setCellData(xlfile, xlSheetName, 185, 8, actCurrencyNameR1C1);
	  		excelReader.setCellData(xlfile, xlSheetName, 186, 8, actCurrencyNameR2C1);
	  		excelReader.setCellData(xlfile, xlSheetName, 187, 8, actCurrencyDefinedAsR1C2);
	  		excelReader.setCellData(xlfile, xlSheetName, 188, 8, actCurrencyDefinedAsR2C2);
	  		excelReader.setCellData(xlfile, xlSheetName, 189, 8, actCurrencyRateR1C3);
	  		excelReader.setCellData(xlfile, xlSheetName, 190, 8, actCurrencyRateR2C3);
	  		excelReader.setCellData(xlfile, xlSheetName, 191, 8, actCurrencyDescriptionR1C4);
	  		excelReader.setCellData(xlfile, xlSheetName, 192, 8, actCurrencyDescriptionR2C4);
	  		
	  		
	  		System.out.println("Currency Name Value Actual             : " + actCurrencyNameR1C1+        " Value Expected : " + expCurrencyNameR1C1);
	  		System.out.println("Currency Defined As Value Actual       : " + actCurrencyDefinedAsR1C2+   " Value Expected : " + expCurrencyDefinedAsR1C2);
	  		System.out.println("Currency Rate Value Actual             : " + actCurrencyRateR1C3+        " Value Expected : " + expCurrencyRateR1C3);
	  		System.out.println("Currency Description Value Actual      : " + actCurrencyDescriptionR1C4+ " Value Expected : " + expCurrencyDescriptionR1C4);
	  		System.out.println("Currency Name Value Actual             : " + actCurrencyNameR2C1+        " Value Expected : " + expCurrencyNameR2C1);
	  		System.out.println("Currency Defined As Value Actual       : " + actCurrencyDefinedAsR2C2+   " Value Expected : " + expCurrencyDefinedAsR2C2);
	  		System.out.println("Currency Rate Value Actual             : " + actCurrencyRateR2C3+        " Value Expected : " + expCurrencyRateR2C3);
	        System.out.println("Currency Description Value Actual      : " + actCurrencyDescriptionR2C4+ " Value Expected : " + expCurrencyDescriptionR2C4);

	  		if (actBaseCurrencyValue.equalsIgnoreCase(expBaseCurrencyValue)

	  				&& actCurrencyNameR1C1.equalsIgnoreCase(expCurrencyNameR1C1)
	  				&& actCurrencyDefinedAsR1C2.equalsIgnoreCase(expCurrencyDefinedAsR1C2)
	  				&& actCurrencyRateR1C3.equalsIgnoreCase(expCurrencyRateR1C3)
	  				&& actCurrencyDescriptionR1C4.equalsIgnoreCase(actCurrencyDescriptionR1C4)

	  				&& actCurrencyNameR2C1.equalsIgnoreCase(expCurrencyNameR2C1)
	  				&& actCurrencyDefinedAsR2C2.equalsIgnoreCase(expCurrencyDefinedAsR2C2)
	  				&& actCurrencyRateR2C3.equalsIgnoreCase(expCurrencyRateR2C3)
	  				&& actCurrencyDescriptionR2C4.equalsIgnoreCase(actCurrencyDescriptionR2C4))
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 183, 9, resPass);
	  			return true;
	  		}
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 183, 9, resFail);
	  			return false;
	  		}
	  	  }
	  	  catch (Exception e) 
	  	  {
	  		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 183, 10, e.getMessage());
	  		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		  return false;
	  	  }
	  	}

	  	public static boolean checkSaveExchangeRateOfCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  	{
	  		excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
	  		System.out.println("************************************************ checkSaveExchangeRateOfCurrencyMaster **********************************************");
	  		  			
	  			excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  			    	  
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  			baseCurrencyTxt.click();
	  			
	  			Thread.sleep(2000);
	  			baseCurrencyTxt.sendKeys(Keys.END);
	  			baseCurrencyTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  			Thread.sleep(2000);
	  			baseCurrencyTxt.sendKeys(excelReader.getCellData(xlSheetName, 184, 6));//inr
	  	
	  			
	  			Thread.sleep(2000);  
	  			getAction().moveToElement(baseCurrencyTxt).sendKeys(Keys.TAB).perform();
	  				
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  			withEffectiveDateTxt.click();
	  			getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();		
	  			Thread.sleep(2000);
	  			
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
	  			
	  			gridcurrencyName1Txt.click();
	  			gridcurrencyName1Txt.sendKeys(Keys.END);
	  			gridcurrencyName1Txt.sendKeys(Keys.SHIFT,Keys.HOME);
	  			
	  			Thread.sleep(2000);
	  			
	  			gridcurrencyName1Txt.sendKeys(excelReader.getCellData(xlSheetName, 185, 6));//usd
	  			Thread.sleep(2000);
	  			getAction().moveToElement(gridcurrencyName1Txt).sendKeys(Keys.TAB).perform();
	  			
	  	
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
	  			
	  			gridDefineAsTxt.click();
	  			gridDefineAsTxt.sendKeys(Keys.END);
	  			gridDefineAsTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  			
	  			gridDefineAsTxt.sendKeys(excelReader.getCellData(xlSheetName, 186, 6)); //inr
	  			Thread.sleep(3000);
	  			getAction().moveToElement(gridDefineAsTxt).sendKeys(Keys.TAB).perform();
	  			
	  				
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
	  			
	  			gridRateTxt.sendKeys(excelReader.getCellData(xlSheetName, 187, 6));  //rate
	  			getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
	  			
	  		    Thread.sleep(2000);
	  			
	  		    
	  		    
	  		    
	              //Second row data
	  			
	              
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
	  			
	  			gridcurrencyName1Txt.click();
	  			
	  			gridcurrencyName1Txt.sendKeys(excelReader.getCellData(xlSheetName, 188, 6));//AED
	  			Thread.sleep(2000);
	  			getAction().moveToElement(gridcurrencyName1Txt).sendKeys(Keys.TAB).perform();
	  			
	  	
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
	  			
	  			gridDefineAsTxt.click();
	  			
	  			gridDefineAsTxt.sendKeys(excelReader.getCellData(xlSheetName, 189, 6));  //inr
	  			Thread.sleep(2000);
	  			getAction().moveToElement(gridDefineAsTxt).sendKeys(Keys.TAB).perform();
	  			
	  				
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
	  			
	  			gridRateTxt.sendKeys(excelReader.getCellData(xlSheetName, 190, 6));
	  			Thread.sleep(2000);
	  			
	  			getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
	  		
	           	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIconInPopup));		
	           	exchangeRateDefinitionSaveIconInPopup.click();
	  			
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	  			
	  			System.out.println(validationConfirmationMessage.getText());

	  			String expSaveExchangeRate = excelReader.getCellData(xlSheetName, 194, 7);
	  			
	  			boolean actMessageOnSaveExchangeRate=checkValidationMessageboolean(expSaveExchangeRate);
	  			boolean expMessageOnSaveExchangeRate=true;
	  			
	  			String actResult = Boolean.toString(actMessageOnSaveExchangeRate);
	  			
	  			excelReader.setCellData(xlfile, xlSheetName, 194, 8, actResult.toUpperCase());
	  	
	  			System.out.println("Excange Rate Update Currency Master Value Actual : " + actMessageOnSaveExchangeRate+ " Value Expected : " + expMessageOnSaveExchangeRate);
	  	
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  			baseCurrencyTxt.click();
	  	
	  			if (actMessageOnSaveExchangeRate==expMessageOnSaveExchangeRate) 
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 193, 9, resPass);
	  				return true;
	  			} 
	  			else 
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 193, 9, resFail);
	  				return false;
	  			}
	  		
	  		
	  	 }

	  		
	  		
	  	 public static boolean checkValuesInUpdatedExchangeRateOptionInCurrencyMaster()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  	 {
	  	
	  		excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
	  		System.out.println("****************************************** checkValuesInUpdatedExchangeRateOptionInCurrencyMaster *****************************************");
	  		
	  		try
	  		{
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  			baseCurrencyTxt.click();
	  			Thread.sleep(2000);
	  			baseCurrencyTxt.sendKeys(Keys.END);
	  			baseCurrencyTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  			baseCurrencyTxt.sendKeys("INR");
	  			Thread.sleep(2000);
	  			baseCurrencyTxt.sendKeys(Keys.TAB);
	  		
	  			String actBaseCurrencyValue = baseCurrencyTxt.getAttribute("value");
	  			Thread.sleep(2000);
	  			
	  			baseCurrencyTxt.sendKeys(Keys.TAB);			
	  			Thread.sleep(2000);

	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  			withEffectiveDateTxt.click();
	  			Thread.sleep(5000);
	  			
	  			String actWithEffectiveDate = withEffectiveDateTxt.getAttribute("value");
	  			

	  			String actCurrencyNameR1C1 = exchangeRateDefinitionCurrencyNameRow1Col1.getText();
	  			String actCurrencyNameR2C1 = exchangeRateDefinitionCurrencyNameRow2Col1.getText();

	  			String actCurrencyDefinedAsR1C2 = exchangeRateDefinitionDefinedAsRow1Col2.getText();
	  			String actCurrencyDefinedAsR2C2 = exchangeRateDefinitionDefinedAsRow2Col2.getText();

	  			String actCurrencyRateR1C3 = exchangeRateDefinitionRateRow1Col3.getText();
	  			String actCurrencyRateR2C3 = exchangeRateDefinitionRateRow2Col3.getText();

	  			String actCurrencyDescriptionR1C4 = exchangeRateDefinitionDescriptionRow1Col4.getText();
	  			String actCurrencyDescriptionR2C4 = exchangeRateDefinitionDescriptionRow2Col4.getText();

	  			String expBaseCurrencyValue = excelReader.getCellData(xlSheetName, 196, 7);

	  			String expCurrencyNameR1C1 = excelReader.getCellData(xlSheetName, 197, 7);
	  			String expCurrencyNameR2C1 = excelReader.getCellData(xlSheetName, 198, 7);

	  			String expCurrencyDefinedAsR1C2 = excelReader.getCellData(xlSheetName, 199, 7);
	  			String expCurrencyDefinedAsR2C2 = excelReader.getCellData(xlSheetName, 200, 7);

	  			String expCurrencyRateR1C3 = excelReader.getCellData(xlSheetName, 201, 7);
	  			String expCurrencyRateR2C3 = excelReader.getCellData(xlSheetName, 202, 7);

	  			String expCurrencyDescriptionR1C4 = excelReader.getCellData(xlSheetName, 203, 7);
	  			String expCurrencyDescriptionR2C4 = excelReader.getCellData(xlSheetName, 204, 7);
	  			
	  			
	  			excelReader.setCellData(xlfile, xlSheetName, 196, 8, actBaseCurrencyValue);
	  			excelReader.setCellData(xlfile, xlSheetName, 197, 8, actCurrencyNameR1C1);
	  			excelReader.setCellData(xlfile, xlSheetName, 198, 8, actCurrencyNameR2C1);
	  			excelReader.setCellData(xlfile, xlSheetName, 199, 8, actCurrencyDefinedAsR1C2);
	  			excelReader.setCellData(xlfile, xlSheetName, 200, 8, actCurrencyDefinedAsR2C2);
	  			excelReader.setCellData(xlfile, xlSheetName, 201, 8, actCurrencyRateR1C3);
	  			excelReader.setCellData(xlfile, xlSheetName, 202, 8, actCurrencyRateR2C3);
	  			excelReader.setCellData(xlfile, xlSheetName, 203, 8, actCurrencyDescriptionR1C4);
	  			excelReader.setCellData(xlfile, xlSheetName, 204, 8, actCurrencyDescriptionR2C4);
	  		
	  			System.out.println("Base Currency Value Actual              : " + actBaseCurrencyValue+       " Value Expected : " + expBaseCurrencyValue);
	  			System.out.println("Currency Name Value Actual              : " + actCurrencyNameR1C1+        " Value Expected : " + expCurrencyNameR1C1);
	  			System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR1C2+   " Value Expected : " + expCurrencyDefinedAsR1C2);
	  			System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR1C3+        " Value Expected : " + expCurrencyRateR1C3);
	  			System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR1C4+ " Value Expected : " + expCurrencyDescriptionR1C4);
	  			System.out.println("Currency Name Value Actual              : " + actCurrencyNameR2C1+        " Value Expected : " + expCurrencyNameR2C1);
	  			System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR2C2+   " Value Expected : " + expCurrencyDefinedAsR2C2);
	  			System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR2C3+        " Value Expected : " + expCurrencyRateR2C3);
	  			System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR2C4+ " Value Expected : " + expCurrencyDescriptionR2C4);
	  	
	  			if (actBaseCurrencyValue.equalsIgnoreCase(expBaseCurrencyValue)
	  		
	  					&& actCurrencyNameR1C1.equalsIgnoreCase(expCurrencyNameR1C1)
	  					&& actCurrencyDefinedAsR1C2.equalsIgnoreCase(expCurrencyDefinedAsR1C2)
	  					&& actCurrencyRateR1C3.equalsIgnoreCase(expCurrencyRateR1C3)
	  					&& actCurrencyDescriptionR1C4.equalsIgnoreCase(actCurrencyDescriptionR1C4)
	  		
	  					&& actCurrencyNameR2C1.equalsIgnoreCase(expCurrencyNameR2C1)
	  					&& actCurrencyDefinedAsR2C2.equalsIgnoreCase(expCurrencyDefinedAsR2C2)
	  					&& actCurrencyRateR2C3.equalsIgnoreCase(expCurrencyRateR2C3)
	  					&& actCurrencyDescriptionR2C4.equalsIgnoreCase(actCurrencyDescriptionR2C4)) 
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 195, 9, resPass);
	  				return true;
	  			}
	  			else 
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 195, 9, resFail);
	  				return false;
	  			}
	  		}
	  		catch (Exception e) 
	  		{
	  			excelReader.setExceptionInExcel(xlfile, xlSheetName, 195, 10, e.getMessage());
	  			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  			return false;
	  		}
	  	}

	  	  public static boolean checkClickOnClearToClearValuesInExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  	  {
	  	
	  		excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
	  		System.out.println("************************************* checkClickOnClearToClearValuesInExchangeRateOptionInCurrencyMaster **********************************");
	  	
	  		try
	  		{
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionClearIconInPopup));
	  			exchangeRateDefinitionClearIconInPopup.click();
	  	
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  			baseCurrencyTxt.click();
	  	
	  			boolean actBaseCurrencyValue       = baseCurrencyTxt.getAttribute("value").isEmpty();
	  			baseCurrencyTxt.sendKeys(Keys.TAB);
	  	
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  			withEffectiveDateTxt.click();
	  	
	  			String actWithEffectiveDate        = withEffectiveDateTxt.getAttribute("value");
	  			
	  			boolean actCurrencyNameR1C1        = exchangeRateDefinitionCurrencyNameRow1Col1.getText().isEmpty();
	  			boolean actCurrencyNameR2C1        = exchangeRateDefinitionCurrencyNameRow2Col1.getText().isEmpty();
	  	
	  			boolean actCurrencyDefinedAsR1C2   = exchangeRateDefinitionDefinedAsRow1Col2.getText().isEmpty();
	  			boolean actCurrencyDefinedAsR2C2   = exchangeRateDefinitionDefinedAsRow2Col2.getText().isEmpty();
	  	
	  			String actCurrencyRateR1C33       = exchangeRateDefinitionRateRow1Col3.getText();
	  			boolean actCurrencyRateR2C3        = exchangeRateDefinitionRateRow2Col3.getText().isEmpty();
	  	
	  			boolean actCurrencyDescriptionR1C4 = exchangeRateDefinitionDescriptionRow1Col4.getText().isEmpty();
	  			boolean actCurrencyDescriptionR2C4 = exchangeRateDefinitionDescriptionRow2Col4.getText().isEmpty();
	  	
	  			boolean expBaseCurrencyValue       = true;
	  	
	  			boolean expCurrencyNameR1C1        = true;
	  			boolean expCurrencyNameR2C1        = true;
	  	
	  			boolean expCurrencyDefinedAsR1C2   = true;
	  			boolean expCurrencyDefinedAsR2C2   = true;
	  	
	  			String expCurrencyRateR1C3         = excelReader.getCellData(xlSheetName, 206, 7);
	  			boolean expCurrencyRateR2C3        = true;
	  	
	  			boolean expCurrencyDescriptionR1C4 = true;
	  			boolean expCurrencyDescriptionR2C4 = true;
	  			
	  			
	  			boolean actMethod = actBaseCurrencyValue == expBaseCurrencyValue && actCurrencyNameR1C1 == expCurrencyNameR1C1 
	  					            && actCurrencyDefinedAsR1C2 == expCurrencyDefinedAsR1C2 && actCurrencyDescriptionR1C4 == actCurrencyDescriptionR1C4
	  					            && actCurrencyNameR2C1 == expCurrencyNameR2C1 && actCurrencyDefinedAsR2C2 == expCurrencyDefinedAsR2C2
	  					            && actCurrencyRateR2C3 == expCurrencyRateR2C3 && actCurrencyDescriptionR2C4 == actCurrencyDescriptionR2C4;
	  			
	  			String actResult = Boolean.toString(actMethod);
	  			
	  			excelReader.setCellData(xlfile, xlSheetName, 205, 8, actResult.toUpperCase());
	  			
	  			excelReader.setCellData(xlfile, xlSheetName, 206, 8, actCurrencyRateR1C33);
	  			
	  			System.out.println("Base Currency Value Actual              : " + actBaseCurrencyValue       + "  Value Expected : " + expBaseCurrencyValue);
	  			System.out.println("Currency Name Value Actual              : " + actCurrencyNameR1C1        + "  Value Expected : " + expCurrencyNameR1C1);
	  			System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR1C2   + "  Value Expected : " + expCurrencyDefinedAsR1C2);
	  			System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR1C33       + "  Value Expected : " + expCurrencyRateR1C3);
	  			System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR1C4 + "  Value Expected : " + expCurrencyDescriptionR1C4);
	  			System.out.println("Currency Name Value Actual              : " + actCurrencyNameR2C1        + "  Value Expected : " + expCurrencyNameR2C1);
	  			System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR2C2   + "  Value Expected : " + expCurrencyDefinedAsR2C2);
	  			System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR2C3        + "  Value Expected : " + expCurrencyRateR2C3);
	  		    System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR2C4 + "  Value Expected : " + expCurrencyDescriptionR2C4);
	  	
	  			if (actMethod== true && actCurrencyRateR1C33.equalsIgnoreCase(expCurrencyRateR1C3)) 
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 205, 9, resPass);
	  				return true;
	  			}
	  			else
	  			{
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

	  	@FindBy(xpath = "//div[contains(text(),'Save')]")
	  	public static WebElement currencyMasterSaveBtn;
	  	
	  	// Cancel in the Exchange Rate Option
	  	public static boolean checkCancelOptionSaveExchangeRateInExchangeRateOptionInCurrencyMaster()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		
	  		System.out.println("*************************************** checkCancelOptionInExchangeRateOptionInCurrencyMaster *****************************************");
	  		
	  		try
	  		{
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionPageCloseIconInPopup));
	  			exchangeRateDefinitionPageCloseIconInPopup.click();
	  			Thread.sleep(5000);	
	  			
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
	  			String actISOCurrencyCode             = ISOCurrencyCodeTxt.getAttribute("value");
	  	
	  	        String expISOCurrencyCode             = excelReader.getCellData(xlSheetName, 208, 7);
	  	
	  		    String actMessageOnClickOnCancelAndClickOnSaveButton        = excelReader.getCellData(xlSheetName, 208, 7);
	  	
	  		    excelReader.setCellData(xlfile, xlSheetName, 207, 8, actISOCurrencyCode.toUpperCase());
	  			
	  	        System.out.println("Click On Cancel Is Any Error Message Value Actual : " + actISOCurrencyCode + " Value Expected : " + expISOCurrencyCode);
	  	     
	  			if (actISOCurrencyCode.equalsIgnoreCase(expISOCurrencyCode))
	  			{
	  				System.out.println("Pass : Cancel Button works in exhange rate");
	  				excelReader.setCellData(xlfile, xlSheetName, 207, 9, resPass);
	  				return true;
	  			}
	  			else 
	  			{
	  				System.out.println("Fail : Cancel Button works in exhange rate");
	  				excelReader.setCellData(xlfile, xlSheetName, 207, 9, resFail);
	  				return false;
	  			}
	  		}
	  		catch (Exception e) 
	  		{
	  			excelReader.setExceptionInExcel(xlfile, xlSheetName, 207, 10, e.getMessage());
	  			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  			return false;
	  		}
	  	}

	  	

	  	// Currency Master page will be display on Click on Cancel
	  	
	  	// Check Clear Option in the Currency Master page
	  	
	
	  	 public static boolean checkClickOnClearButtonToDisplayBlankInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  	 {
	  	
	  		excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
	  		System.out.println("**************************************** checkClickOnClearButtonToDisplayBlankInCurrencyMaster *******************************************");	
	  		
	  		try
	  		{
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
	  			ISOCurrencyCodeTxt.click();
	  			ISOCurrencyCodeTxt.sendKeys("s");
	  			
	  			int isoCurrencyCodeComboListCount = isoCurrencyCodeComboList.size();
	  			
	  			ArrayList<String> isoCurrencyCodeComboListArray = new ArrayList<String>();
	  			
	  			for(int i=1;i<isoCurrencyCodeComboListCount;i++)
	  			{
	  				String data=isoCurrencyCodeComboList.get(i).getText();
	  				if(data.equalsIgnoreCase("SLL"))
	  				{
	  					isoCurrencyCodeComboList.get(i).click();
	  				}
	  			}
	  		
	  			ISOCurrencyCodeTxt.sendKeys(Keys.TAB);
	  			
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearIcon));
	  			clearIcon.click();
	  	
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
	  			boolean actISOCurrencyCode             = ISOCurrencyCodeTxt.getAttribute("value").isEmpty();
	  			boolean actCoinsNameTxt                = coinsNameTxt.getAttribute("value").isEmpty();
	  			boolean actCurrencyNameTxt             = currencyNameTxt.getAttribute("value").isEmpty();
	  			boolean actRoundOff                    = generalRoundOffTxt.getAttribute("value").isEmpty();
	  			boolean actCurrencyMasterControlSymbol = controlSymbolDropdown.getAttribute("value").isEmpty();
	  			boolean actNoOfDecimals                = noOfDecimalsTxtInCurrency.getAttribute("value").isEmpty();
	  	
	  			boolean expISOCurrencyCode             = true;
	  			boolean expCoinsNameTxt                = true;
	  			boolean expCurrencyNameTxt             = true;
	  			boolean expRoundOff                    = true;
	  			boolean expCurrencyMasterControlSymbol = true;
	  			boolean expNoOfDecimals                = true;
	  			
	  			boolean actMethod = actISOCurrencyCode == expISOCurrencyCode && actCoinsNameTxt == expCoinsNameTxt
	  								&& actCurrencyNameTxt == expCurrencyNameTxt && actRoundOff == actRoundOff
	  								&& actCurrencyMasterControlSymbol == expCurrencyMasterControlSymbol
	  								&& actNoOfDecimals == expNoOfDecimals;

	  			String actResult = Boolean.toString(actMethod);

	  			excelReader.setCellData(xlfile, xlSheetName, 209, 8, actResult.toUpperCase());
	  	
	  			System.out.println("ISO Currency Value Actual     : " + actISOCurrencyCode+ "              Value Expected : " + expISOCurrencyCode);
	  			System.out.println("Coins Name Value Actual       : " + actCoinsNameTxt+ "                 Value Expected : " + expCoinsNameTxt);
	  			System.out.println("Currency Name Value Actual    : " + actCurrencyNameTxt+ "              Value Expected : " + expCurrencyNameTxt);
	  			System.out.println("Round Off Value Actual        : " + actRoundOff+ "                     Value Expected : " + actRoundOff);
	  			System.out.println("Symbol Value Actual           : " + actCurrencyMasterControlSymbol+ "  Value Expected : " + expCurrencyMasterControlSymbol);
	  			System.out.println("No Of Decimals Value Actual   : " + actNoOfDecimals+ "                 Value Expected : " + expNoOfDecimals);
	  	
	  			if (actMethod==true) 
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 209, 9, resPass);
	  				return true;
	  			}
	  			else 
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 209, 9, resFail);
	  				return false;
	  			}
	  		}
	  		catch (Exception e) 
	  		{
	  			excelReader.setExceptionInExcel(xlfile, xlSheetName, 209, 10, e.getMessage());
	  			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  			return false;
	  		}
	  	 }

	  		 
	  	 public boolean checkClickOnCancelButtonInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  	 {
	  		 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		 
	  		 System.out.println("************************************************** checkClickOnCancelButtonInCurrencyMaster  ********************************************");
	  	
	  		
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelIcon));
	  			 cancelIcon.click();
	  			 
	  			 Thread.sleep(2000);
	  				
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
	  			 String actDashboardLabel = dashboardName.getText();
	  			 String expDashboardLabel = excelReader.getCellData(xlSheetName, 211, 7);
	  			 
	  			 excelReader.setCellData(xlfile, xlSheetName, 211, 8, actDashboardLabel);
	  			 
	  			 System.out.println("Click on Close button                              :" + actDashboardLabel + "      Value Expected : " + expDashboardLabel);
	  			 
	  			 Thread.sleep(2000);
	  			 
	  			 if (actDashboardLabel.equalsIgnoreCase(expDashboardLabel)) 
	  			 {
	  				 System.out.println(" Test Pass: Close Button is working");
	  				 excelReader.setCellData(xlfile, xlSheetName, 210, 9, resPass);
	  				 return true;
	  			 }
	  			 else 
	  			 {
	  				 System.out.println(" Test Fail: Close Button is not working");
	  				 excelReader.setCellData(xlfile, xlSheetName, 210, 9, resFail);
	  				 return false;
	  			 }
	  		 
	  	 }
	  	  
	    
	    
	  	 // EXCHANGE RATE PAGE STARTS
	  	 

	  		 
	  	 public static boolean checkClickOnExchangeRateFromCurrecnyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  	 {
	  		 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
	  		 System.out.println("************************************************** checkClickOnExchangeRateFromCurrecnyMenu  ********************************************");
	  			
	  		 try 
	  		 {
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	  			 homeMenu.click();
	  	
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	  			 mastersMenu.click();
	  			 
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMenu));
	  			 currencyMenu.click();
	  			 
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateMenu));
	  			 exchangeRateMenu.click();
	  			 
	  			 Thread.sleep(2000);
	  			 
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionLabel));
	  			 
	  			 String actExchangeRateLabel   = exchangeRateDefinitionLabel.getText();
	  			 String expExchangeRateLabel   = excelReader.getCellData(xlSheetName, 214, 7);
	  			 
	  			 System.out.println("Exchange Rate Value Actual  1                    : " + actExchangeRateLabel+ "  Value Expected : " + expExchangeRateLabel);
	  			 
	  			 int exchangeRateDefintionRibbonControlListCount = ExchangeRateDefintionRibbonControlList.size();
	  			 
	  			 ArrayList<String> exchangeRateDefintionRibbonControlListArray = new ArrayList<String>();
	  			 
	  			 for(int i=0;i<exchangeRateDefintionRibbonControlListCount;i++)
	  			 {
	  				 String data=ExchangeRateDefintionRibbonControlList.get(i).getText();
	  				 exchangeRateDefintionRibbonControlListArray.add(data);
	  			 }	
	  			 
	  			 String actexchangeRateDefintionRibbonControlList=exchangeRateDefintionRibbonControlListArray.toString();
	  			 String expexchangeRateDefintionRibbonControlList=excelReader.getCellData(xlSheetName, 215, 7);
	  			 
	  			 System.out.println("exchangeRateDefintionRibbonControlList Actual   : "+actexchangeRateDefintionRibbonControlList);
	  			 System.out.println("exchangeRateDefintionRibbonControlList Expected : "+expexchangeRateDefintionRibbonControlList);
	  			 	  			 
	  			 excelReader.setCellData(xlfile, xlSheetName, 214, 8, actExchangeRateLabel);
	  			 excelReader.setCellData(xlfile, xlSheetName, 215, 8, actexchangeRateDefintionRibbonControlList);
	  			  			 
	  			 if (actExchangeRateLabel.equalsIgnoreCase(expExchangeRateLabel)
	  					 /*&& actexchangeRateDefintionRibbonControlList.equalsIgnoreCase(expexchangeRateDefintionRibbonControlList)*/) 
	  			 {
	  				 excelReader.setCellData(xlfile, xlSheetName, 213, 9, resPass);
	  				 return true;
	  			 }
	  			 else 
	  			 {
	  				 excelReader.setCellData(xlfile, xlSheetName, 213, 9, resFail);
	  				 return false;
	  			 }
	  		 } 
	  		 catch (Exception e) 
	  		 {
	  			 excelReader.setExceptionInExcel(xlfile, xlSheetName, 213, 10, e.getMessage());
	  			 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  			 return false;
	  		 }
	  	 }

	  	 
	  	 public static boolean checkValuesInSavedExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	 {
	  		 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
	  		 System.out.println("******************************************************** checkValuesInSavedExchangeRate *****************************************************");
	  	
	  		 try
	  		 {
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  			 baseCurrencyTxt.click();
	  			 baseCurrencyTxt.sendKeys("i");
	  			 
	  			 int baseCurrencyComboListCount = baseCurrencyComboList.size();
	  			 
	  			 ArrayList<String> baseCurrencyComboListArray = new ArrayList<String>();
	  			 
	  			 for(int i=1;i<baseCurrencyComboListCount;i++)
	  			 {
	  				 String data=baseCurrencyComboList.get(i).getText();
	  				 if(data.equalsIgnoreCase("INR"))
	  				 {
	  					 baseCurrencyComboList.get(i).click();
	  				 }	
	  			 }
	  			 
	  			 String actBaseCurrencyValue = baseCurrencyTxt.getAttribute("value");
	  			 baseCurrencyTxt.sendKeys(Keys.TAB);
	  			 Thread.sleep(2000);
	  			 
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  			 withEffectiveDateTxt.click();
	  			 
	  			 String actWithEffectiveDate = withEffectiveDateTxt.getAttribute("value");
	  			 //Thread.sleep(3000);
	  			 
	  			 String actCurrencyNameR1C1 = exchangeRateDefinitionCurrencyNameRow1Col1.getText();
	  			 String actCurrencyNameR2C1 = exchangeRateDefinitionCurrencyNameRow2Col1.getText();
	  			 
	  			 String actCurrencyDefinedAsR1C2 = exchangeRateDefinitionDefinedAsRow1Col2.getText();
	  			 String actCurrencyDefinedAsR2C2 = exchangeRateDefinitionDefinedAsRow2Col2.getText();
	  			 
	  			 String actCurrencyRateR1C3 = exchangeRateDefinitionRateRow1Col3.getText();
	  			 String actCurrencyRateR2C3 = exchangeRateDefinitionRateRow2Col3.getText();
	  			 
	  			 String actCurrencyDescriptionR1C4 = exchangeRateDefinitionDescriptionRow1Col4.getText();
	  			 String actCurrencyDescriptionR2C4 = exchangeRateDefinitionDescriptionRow2Col4.getText();
	  			 
	  			 String expBaseCurrencyValue = excelReader.getCellData(xlSheetName, 217, 7);
	  			 
	  			 String expCurrencyNameR1C1 = excelReader.getCellData(xlSheetName, 218, 7);
	  			 String expCurrencyNameR2C1 = excelReader.getCellData(xlSheetName, 219, 7);
	  			 
	  			 String expCurrencyDefinedAsR1C2 = excelReader.getCellData(xlSheetName, 220, 7);
	  			 String expCurrencyDefinedAsR2C2 = excelReader.getCellData(xlSheetName, 221, 7);
	  			 
	  			 String expCurrencyRateR1C3 = excelReader.getCellData(xlSheetName, 222, 7);
	  			 String expCurrencyRateR2C3 = excelReader.getCellData(xlSheetName, 223, 7);
	  			 
	  			 String expCurrencyDescriptionR1C4 = excelReader.getCellData(xlSheetName, 224, 7);
	  			 String expCurrencyDescriptionR2C4 = excelReader.getCellData(xlSheetName, 225, 7);
	  			 
	  			 
	  			 excelReader.setCellData(xlfile, xlSheetName, 217, 8, actBaseCurrencyValue);
	  			 excelReader.setCellData(xlfile, xlSheetName, 218, 8, actCurrencyNameR1C1);
	  			 excelReader.setCellData(xlfile, xlSheetName, 219, 8, actCurrencyNameR2C1);
	  			 excelReader.setCellData(xlfile, xlSheetName, 220, 8, actCurrencyDefinedAsR1C2);
	  			 excelReader.setCellData(xlfile, xlSheetName, 221, 8, actCurrencyDefinedAsR2C2);
	  			 excelReader.setCellData(xlfile, xlSheetName, 222, 8, actCurrencyRateR1C3);
	  			 excelReader.setCellData(xlfile, xlSheetName, 223, 8, actCurrencyRateR2C3);
	  			 excelReader.setCellData(xlfile, xlSheetName, 224, 8, actCurrencyDescriptionR1C4);
	  			 excelReader.setCellData(xlfile, xlSheetName, 225, 8, actCurrencyDescriptionR2C4);
	  			 
	  			 System.out.println("Base Currency Value Actual              : " + actBaseCurrencyValue+       " Value Expected : " + expBaseCurrencyValue);
	  			 System.out.println("Currency Name Value Actual              : " + actCurrencyNameR1C1+        " Value Expected : " + expCurrencyNameR1C1);
	  			 System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR1C2+   " Value Expected : " + expCurrencyDefinedAsR1C2);
	  			 System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR1C3+        " Value Expected : " + expCurrencyRateR1C3);
	  			 System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR1C4+ " Value Expected : " + expCurrencyDescriptionR1C4);
	  			 System.out.println("Currency Name Value Actual              : " + actCurrencyNameR2C1+        " Value Expected : " + expCurrencyNameR2C1);
	  			 System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR2C2+   " Value Expected : " + expCurrencyDefinedAsR2C2);
	  			 System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR2C3+        " Value Expected : " + expCurrencyRateR2C3);
	  			 System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR2C4+ " Value Expected : " + expCurrencyDescriptionR2C4);
	  			 
	  			 if (actBaseCurrencyValue.equalsIgnoreCase(expBaseCurrencyValue)
	  	
	  					&& actCurrencyNameR1C1.equalsIgnoreCase(expCurrencyNameR1C1)
	  					&& actCurrencyDefinedAsR1C2.equalsIgnoreCase(expCurrencyDefinedAsR1C2)
	  					&& actCurrencyRateR1C3.equalsIgnoreCase(expCurrencyRateR1C3)
	  					&& actCurrencyDescriptionR1C4.equalsIgnoreCase(actCurrencyDescriptionR1C4)
	  	
	  					&& actCurrencyNameR2C1.equalsIgnoreCase(expCurrencyNameR2C1)
	  					&& actCurrencyDefinedAsR2C2.equalsIgnoreCase(expCurrencyDefinedAsR2C2)
	  					&& actCurrencyRateR2C3.equalsIgnoreCase(expCurrencyRateR2C3)
	  					&& actCurrencyDescriptionR2C4.equalsIgnoreCase(actCurrencyDescriptionR2C4))
	  			{
	  				 excelReader.setCellData(xlfile, xlSheetName, 216, 9, resPass);
	  				return true;
	  			} 
	  			else
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 216, 9, resFail);
	  				return false;
	  			}
	  		 }
	  		 catch (Exception e) 
	  		 {
	  			 excelReader.setExceptionInExcel(xlfile, xlSheetName, 216, 10, e.getMessage());
	  			 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  			 return false;
	  		 } 
	  	 }
	  	
	  	  
	  	  
	  	 public static boolean checkClickOnClearToClearValuesInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  	 {
	  		 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  		 
	  		 System.out.println("***************************************** checkClickOnClearToClearValuesInExchangeRate *******************************************");
	  	
	  		 try
	  		 {
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionClearIcon));
	  			 exchangeRateDefinitionClearIcon.click();
	  			
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  			 baseCurrencyTxt.click();
	  			 
	  			 boolean actBaseCurrencyValue       = baseCurrencyTxt.getAttribute("value").isEmpty();
	  			 baseCurrencyTxt.sendKeys(Keys.TAB);
	  			 
	  			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  			 withEffectiveDateTxt.click();
	  			 
	  			 String actWithEffectiveDate        = withEffectiveDateTxt.getAttribute("value");
	  			 
	  			 boolean actCurrencyNameR1C1        = exchangeRateDefinitionCurrencyNameRow1Col1.getText().isEmpty();
	  			 boolean actCurrencyNameR2C1        = exchangeRateDefinitionCurrencyNameRow2Col1.getText().isEmpty();
	  			 
	  			 boolean actCurrencyDefinedAsR1C2   = exchangeRateDefinitionDefinedAsRow1Col2.getText().isEmpty();
	  			 boolean actCurrencyDefinedAsR2C2   = exchangeRateDefinitionDefinedAsRow2Col2.getText().isEmpty();
	  			 
	  			 String actCurrencyRateR1C33       = exchangeRateDefinitionRateRow1Col3.getText();
	  			 boolean actCurrencyRateR2C3        = exchangeRateDefinitionRateRow2Col3.getText().isEmpty();
	  			 
	  			 boolean actCurrencyDescriptionR1C4 = exchangeRateDefinitionDescriptionRow1Col4.getText().isEmpty();
	  			 boolean actCurrencyDescriptionR2C4 = exchangeRateDefinitionDescriptionRow2Col4.getText().isEmpty();
	  			 
	  			 boolean expBaseCurrencyValue       = true;
	  			 
	  			 boolean expCurrencyNameR1C1        = true;
	  			 boolean expCurrencyNameR2C1        = true;
	  			 
	  			 boolean expCurrencyDefinedAsR1C2   = true;
	  			 boolean expCurrencyDefinedAsR2C2   = true;
	  			 
	  			 String expCurrencyRateR1C3         = excelReader.getCellData(xlSheetName, 227, 7);
	  			 boolean expCurrencyRateR2C3        = true;
	  			 
	  			 boolean expCurrencyDescriptionR1C4 = true;
	  			 boolean expCurrencyDescriptionR2C4 = true;
	  			 
	  			 
	  			 boolean actMethod = actBaseCurrencyValue == expBaseCurrencyValue && actCurrencyNameR1C1 == expCurrencyNameR1C1 
	  					 && actCurrencyDefinedAsR1C2 == expCurrencyDefinedAsR1C2 && actCurrencyDescriptionR1C4 == actCurrencyDescriptionR1C4
	  					 && actCurrencyNameR2C1 == expCurrencyNameR2C1 && actCurrencyDefinedAsR2C2 == expCurrencyDefinedAsR2C2
	  					 && actCurrencyRateR2C3 == expCurrencyRateR2C3 && actCurrencyDescriptionR2C4 == actCurrencyDescriptionR2C4;
	  					
	  			 String actResult = Boolean.toString(actMethod);
	  				
	  			 excelReader.setCellData(xlfile, xlSheetName, 226, 8, actResult.toUpperCase());
	  			 
	  			 excelReader.setCellData(xlfile, xlSheetName, 227, 8, actCurrencyRateR1C33);
	  			 
	  			 System.out.println("Base Currency Value Actual              : " + actBaseCurrencyValue       + "  Value Expected : " + expBaseCurrencyValue);
	  			 System.out.println("Currency Name Value Actual              : " + actCurrencyNameR1C1        + "  Value Expected : " + expCurrencyNameR1C1);
	  			 System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR1C2   + "  Value Expected : " + expCurrencyDefinedAsR1C2);
	  			 System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR1C33       + "  Value Expected : " + expCurrencyRateR1C3);
	  			 System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR1C4 + "  Value Expected : " + expCurrencyDescriptionR1C4);
	  			 System.out.println("Currency Name Value Actual              : " + actCurrencyNameR2C1        + "  Value Expected : " + expCurrencyNameR2C1);
	  			 System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR2C2   + "  Value Expected : " + expCurrencyDefinedAsR2C2);
	  			 System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR2C3        + "  Value Expected : " + expCurrencyRateR2C3);
	  			 System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR2C4 + "  Value Expected : " + expCurrencyDescriptionR2C4);
	  			 
	  			 if (actBaseCurrencyValue == expBaseCurrencyValue && actCurrencyRateR1C33.equalsIgnoreCase(expCurrencyRateR1C3))
	  			 {
	  				 excelReader.setCellData(xlfile, xlSheetName, 226, 9, resPass);
	  				 return true;
	  			 } 
	  			 else
	  			 {
	  				 excelReader.setCellData(xlfile, xlSheetName, 226, 9, resFail);
	  				 return false;
	  			 }
	  		 }
	  		 catch (Exception e) 
	  		 {
	  			 excelReader.setExceptionInExcel(xlfile, xlSheetName, 226, 10, e.getMessage());
	  			 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  			 return false;
	  		 }  
	  	 }

	    
	  	 //Changing the USD Currency Value
	   
	  	 public static boolean checkSaveExchangeRateBaseCurrencyUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	 {
	  	
	  		excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
	  		System.out.println("************************************************ checkUpdateValuesInExchangeRateForCompanyBase **********************************************");
	  	
	  		
	  			excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  					
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  			
	  			baseCurrencyTxt.click();
	  			
	  			baseCurrencyTxt.sendKeys(excelReader.getCellData(xlSheetName, 231, 6));
	  			
	  			Thread.sleep(2000);  
	  			
	  			getAction().moveToElement(baseCurrencyTxt).sendKeys(Keys.TAB).perform();
	  			
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  			
	  			withEffectiveDateTxt.click();
	  			Thread.sleep(2000);
	  			getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
	  						
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
	  			
	  			gridcurrencyName1Txt.click();
	  			
	  			gridcurrencyName1Txt.sendKeys(excelReader.getCellData(xlSheetName, 232, 6));
	  			Thread.sleep(2000);
	  			getAction().moveToElement(gridcurrencyName1Txt).sendKeys(Keys.TAB).perform();
	  			
	  	
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
	  			
	  			gridDefineAsTxt.click();
	  			
	  			gridDefineAsTxt.sendKeys(excelReader.getCellData(xlSheetName, 233, 6));
	  			Thread.sleep(2000);
	  			getAction().moveToElement(gridDefineAsTxt).sendKeys(Keys.TAB).perform();
	  			
	  				
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
	  			
	  			gridRateTxt.sendKeys(excelReader.getCellData(xlSheetName, 234, 6));
	  			Thread.sleep(2000);
	  			getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
	  			
	  			
	  			//Second row data
	  			
	              
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
	  			gridcurrencyName1Txt.click();			
	  			gridcurrencyName1Txt.sendKeys(excelReader.getCellData(xlSheetName, 235, 6));
	  			Thread.sleep(2000);
	  			getAction().moveToElement(gridcurrencyName1Txt).sendKeys(Keys.TAB).perform();
	  			
	  	
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));			
	  			gridDefineAsTxt.click();
	  			gridDefineAsTxt.sendKeys(excelReader.getCellData(xlSheetName, 236, 6));
	  			Thread.sleep(2000);
	  			getAction().moveToElement(gridDefineAsTxt).sendKeys(Keys.TAB).perform();
	  			
	  				
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
	  			
	  			gridRateTxt.sendKeys(excelReader.getCellData(xlSheetName, 237, 6));
	  			Thread.sleep(2000);
	  			getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
	  			
	  			Thread.sleep(2000);
	           	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
	  			
	  			exchangeRateDefinitionSaveIcon.click();
	  			Thread.sleep(1000);
	  			/*
	  			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	  	

	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
	  			exchangeRateDefinitionSaveIcon.click();*/
	  	
	  			String expSaveExchangeRate = "Exchange Rate saved successfully.";
	  			
	  			String actMessageOnExchangeRate = checkValidationMessage(expSaveExchangeRate);
	  			
	  			
	  			/*boolean actMessageOnExchangeRate=checkValidationMessageboolean(expSaveExchangeRate);
	  	        boolean expMessageOnExchangeRate=true;
	  	        
	  	        String actResult = Boolean.toString(actMessageOnExchangeRate);
	  	        
	  	        excelReader.setCellData(xlfile, xlSheetName, 229, 8, actResult.toUpperCase());*/
	  			  
	  			/*System.out.println("Excange Rate Update Currency Definition Value Actual : " + actMessageOnExchangeRate+ "      Value Expected : " + expMessageOnExchangeRate);
	  	*/
	  			
	  			if (actMessageOnExchangeRate.equalsIgnoreCase(expSaveExchangeRate))
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 228, 9, resPass);
	  				return true;
	  			} 
	  			else 
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 228, 9, resFail);
	  				return false;
	  			}
	  		
	  	 }
	  	 
	  	 
	  	 public static boolean checkUSDValuesInSavedExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	 {
	  		 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
	  		 System.out.println("******************************************************** checkValuesInSavedExchangeRate *****************************************************");
	  	
	  		try
	  		{	
	  			Thread.sleep(4000);
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  			baseCurrencyTxt.click();
	  			baseCurrencyTxt.sendKeys("U");
	  			 
	  			int baseCurrencyComboListCount = baseCurrencyComboList.size();
	  			
	  			ArrayList<String> baseCurrencyComboListArray = new ArrayList<String>();
	  			
	  			for(int i=1;i<baseCurrencyComboListCount;i++)
	  			{
	  				String data=baseCurrencyComboList.get(i).getText();
	  				if(data.equalsIgnoreCase("USD"))
	  				{
	  					baseCurrencyComboList.get(i).click();
	  				}	
	  			}
	  			 
	  			String actBaseCurrencyValue = baseCurrencyTxt.getAttribute("value");
	  			baseCurrencyTxt.sendKeys(Keys.TAB);
	  			
	  			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  			withEffectiveDateTxt.click();
	  			
	  			String actWithEffectiveDate = withEffectiveDateTxt.getAttribute("value");
	  			
	  			String actCurrencyNameR1C1 = exchangeRateDefinitionCurrencyNameRow1Col1.getText();
	  			String actCurrencyNameR2C1 = exchangeRateDefinitionCurrencyNameRow2Col1.getText();
	  			
	  			String actCurrencyDefinedAsR1C2 = exchangeRateDefinitionDefinedAsRow1Col2.getText();
	  			String actCurrencyDefinedAsR2C2 = exchangeRateDefinitionDefinedAsRow2Col2.getText();
	  			
	  			String actCurrencyRateR1C3 = exchangeRateDefinitionRateRow1Col3.getText();
	  			String actCurrencyRateR2C3 = exchangeRateDefinitionRateRow2Col3.getText();
	  			
	  			String actCurrencyDescriptionR1C4 = exchangeRateDefinitionDescriptionRow1Col4.getText();
	  			String actCurrencyDescriptionR2C4 = exchangeRateDefinitionDescriptionRow2Col4.getText();
	  			
	  			String expBaseCurrencyValue = excelReader.getCellData(xlSheetName, 231, 7);
	  			
	  			String expCurrencyNameR1C1 = excelReader.getCellData(xlSheetName, 232, 7);
	  			String expCurrencyNameR2C1 = excelReader.getCellData(xlSheetName, 233, 7);
	  			
	  			String expCurrencyDefinedAsR1C2 = excelReader.getCellData(xlSheetName, 234, 7);
	  			String expCurrencyDefinedAsR2C2 = excelReader.getCellData(xlSheetName, 235, 7);
	  			
	  			String expCurrencyRateR1C3 = excelReader.getCellData(xlSheetName, 236, 7);
	  			String expCurrencyRateR2C3 = excelReader.getCellData(xlSheetName, 237, 7);
	  			
	  			String expCurrencyDescriptionR1C4 = excelReader.getCellData(xlSheetName, 238, 7);
	  			String expCurrencyDescriptionR2C4 = excelReader.getCellData(xlSheetName, 239, 7);
	  			
	  			excelReader.setCellData(xlfile, xlSheetName, 231, 8, actBaseCurrencyValue);
	  			excelReader.setCellData(xlfile, xlSheetName, 232, 8, actCurrencyNameR1C1);
	  			excelReader.setCellData(xlfile, xlSheetName, 233, 8, actCurrencyNameR2C1);
	  			excelReader.setCellData(xlfile, xlSheetName, 234, 8, actCurrencyDefinedAsR1C2);
	  			excelReader.setCellData(xlfile, xlSheetName, 235, 8, actCurrencyDefinedAsR2C2);
	  			excelReader.setCellData(xlfile, xlSheetName, 236, 8, actCurrencyRateR1C3);
	  			excelReader.setCellData(xlfile, xlSheetName, 237, 8, actCurrencyRateR2C3);
	  			excelReader.setCellData(xlfile, xlSheetName, 238, 8, actCurrencyDescriptionR1C4);
	  			excelReader.setCellData(xlfile, xlSheetName, 239, 8, actCurrencyDescriptionR2C4);
	  			
	  			System.out.println("Base Currency Value Actual              : " + actBaseCurrencyValue+       " Value Expected : " + expBaseCurrencyValue);
	  			System.out.println("Currency Name Value Actual              : " + actCurrencyNameR1C1+        " Value Expected : " + expCurrencyNameR1C1);
	  			System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR1C2+   " Value Expected : " + expCurrencyDefinedAsR1C2);
	  			System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR1C3+        " Value Expected : " + expCurrencyRateR1C3);
	  			System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR1C4+ " Value Expected : " + expCurrencyDescriptionR1C4);
	  			System.out.println("Currency Name Value Actual              : " + actCurrencyNameR2C1+        " Value Expected : " + expCurrencyNameR2C1);
	  			System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR2C2+   " Value Expected : " + expCurrencyDefinedAsR2C2);
	  			System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR2C3+        " Value Expected : " + expCurrencyRateR2C3);
	  			System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR2C4+ " Value Expected : " + expCurrencyDescriptionR2C4);
	  			
	  			if (actBaseCurrencyValue.equalsIgnoreCase(expBaseCurrencyValue)
	  					
	  					&& actCurrencyNameR1C1.equalsIgnoreCase(expCurrencyNameR1C1)
	  					&& actCurrencyDefinedAsR1C2.equalsIgnoreCase(expCurrencyDefinedAsR1C2)
	  					&& actCurrencyRateR1C3.equalsIgnoreCase(expCurrencyRateR1C3)
	  					&& actCurrencyDescriptionR1C4.equalsIgnoreCase(actCurrencyDescriptionR1C4)
	  	
	  					&& actCurrencyNameR2C1.equalsIgnoreCase(expCurrencyNameR2C1)
	  					&& actCurrencyDefinedAsR2C2.equalsIgnoreCase(expCurrencyDefinedAsR2C2)
	  					&& actCurrencyRateR2C3.equalsIgnoreCase(expCurrencyRateR2C3)
	  					&& actCurrencyDescriptionR2C4.equalsIgnoreCase(actCurrencyDescriptionR2C4))
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 230, 9, resPass);
	  				return true;
	  			} 
	  			else
	  			{
	  				excelReader.setCellData(xlfile, xlSheetName, 230, 9, resFail);
	  				return false;
	  			}
	  		}
	  		catch (Exception e) 
	  		{
	  			excelReader.setExceptionInExcel(xlfile, xlSheetName, 230, 10, e.getMessage());
	  			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  			return false;
	  		}  
	  	 }
	   
	  	
	 
	  	 @FindBy(xpath="//*[@id='ExchangeTable_body']//tr[1]")
	  	 public static WebElement ER_Select1stRow;
	  	 
	  	 @FindBy(xpath="//*[@id='id_Exchange_body_menu']/a[1]/label")
	  	 public static WebElement ER_DeleteRow;
	  	 
	  	 @FindBy(xpath="//*[@id='id_Exchange_body_menu']/a[2]/label")
	  	 public static WebElement ER_InsertRow;
	  	 
	  	 @FindBy(xpath="//*[@id='id_Exchange_body_menu']/a[3]/label")
	  	 public static WebElement ER_SelectRow;
	  	 
	  	 
	  	 
	  	 
	  	 public static boolean checkDeleteRowInUSDExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	    {
	  	  excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	  System.out.println("****************************************** checkValuesUpdatedInExchangeRateForCompanyBase *****************************************");

	  	  try
	  	  { 
	  		  getAction().contextClick(ER_Select1stRow).build().perform();
	  		 Thread.sleep(2000);
	  		 
	  		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ER_SelectRow));
	  		ER_SelectRow.click();
	  		  Thread.sleep(2000);
	  			
	  		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ER_DeleteRow));		
	  		ER_DeleteRow.click();
	  			
	  		  getWaitForAlert();
	  		 Thread.sleep(2000);
	  			
	  		  String actCompanySaveMsg=getAlert().getText();
	  		    
	  		  String getExpectedDeleteRowMsg= excelReader.getCellData(xlSheetName, 241, 7); 
	  		  
	  		  excelReader.setCellData(xlfile, xlSheetName, 241, 8, actCompanySaveMsg);
	  		    
	  		  System.out.println("Delete Row Message Value Actual          :" + actCompanySaveMsg + "      Value Expected : " + getExpectedDeleteRowMsg);
	  	
	  		  getAlert().accept();
	  		 Thread.sleep(2000);
	  		    	  
	  		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
	  		  exchangeRateDefinitionSaveIcon.click();
	  			
	  		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	  			
	  		  String expSaveExchangeRate = excelReader.getCellData(xlSheetName, 242, 7);
	  			
	  		  boolean actMessageOnExchangeRate=checkValidationMessageboolean(expSaveExchangeRate);
	  		  boolean expMessageOnExchangeRate=true;
	  		  
	  		  String actResult = Boolean.toString(actMessageOnExchangeRate);
	  		  
	  		  excelReader.setCellData(xlfile, xlSheetName, 240, 8, actResult.toUpperCase());
	  		  
	  		  System.out.println("Excange Rate Update Currency Definition Value Actual : " + actMessageOnExchangeRate+ "      Value Expected : " + expMessageOnExchangeRate);
	  		    
	  		  if(getExpectedDeleteRowMsg.equalsIgnoreCase(actCompanySaveMsg)
	  				  && actMessageOnExchangeRate==expMessageOnExchangeRate)
	  		  {
	  			  excelReader.setCellData(xlfile, xlSheetName, 240, 9, resPass);
	  			  return true;
	  		  }
	  		  else
	  		  {
	  			  excelReader.setCellData(xlfile, xlSheetName, 240, 9, resFail);
	  			  return false;
	  		  }
	  	  }
	  	  catch (Exception e) 
	  	  {
	  		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 240, 10, e.getMessage());
	  		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		  return false;
	  	  }  
	    }

	  	
	  	
	    public static boolean checkUSDUpdatedWithRowDeleteValuesInSavedExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	    {
	  	  excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	  System.out.println("******************************************************** checkUSDUpdatedWithRowDelteValuesInSavedExchangeRate *****************************************************");

	  	  try
	  	  {
	  		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		  baseCurrencyTxt.click();
	  		  baseCurrencyTxt.sendKeys("USD");
	  		  Thread.sleep(2000);
	  		  			 
	  		  baseCurrencyTxt.sendKeys(Keys.TAB);
	  		  
	  		  Thread.sleep(2000);
	  		  
	  		  String actBaseCurrencyValue = baseCurrencyTxt.getAttribute("value");

	  		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  		  withEffectiveDateTxt.click();
	  						
	  		  String actCurrencyNameR1C1         = exchangeRateDefinitionCurrencyNameRow2Col1.getText();
	  		  String actCurrencyDefinedAsR1C2    = exchangeRateDefinitionDefinedAsRow2Col2.getText();
	  		  String actCurrencyRateR1C3         = exchangeRateDefinitionRateRow2Col3.getText();
	  		  String actCurrencyDescriptionR1C4  = exchangeRateDefinitionDescriptionRow2Col4.getText();
	  		  
	  		  String expBaseCurrencyValue        = excelReader.getCellData(xlSheetName, 244, 7);
	  		  String expCurrencyNameR1C1         = excelReader.getCellData(xlSheetName, 245, 7);
	  		  String expCurrencyDefinedAsR1C2    = excelReader.getCellData(xlSheetName, 246, 7);
	  		  String expCurrencyRateR1C3         = excelReader.getCellData(xlSheetName, 247, 7);
	  		  String expCurrencyDescriptionR1C4  = excelReader.getCellData(xlSheetName, 248, 7);
	  			
	  		  excelReader.setCellData(xlfile, xlSheetName, 244, 8, actBaseCurrencyValue);
	  		  excelReader.setCellData(xlfile, xlSheetName, 245, 8, actCurrencyNameR1C1);
	  		  excelReader.setCellData(xlfile, xlSheetName, 246, 8, actCurrencyDefinedAsR1C2);
	  		  excelReader.setCellData(xlfile, xlSheetName, 247, 8, actCurrencyRateR1C3);
	  		  excelReader.setCellData(xlfile, xlSheetName, 248, 8, actCurrencyDescriptionR1C4);
	  			
	  		  System.out.println("Base Currency Value Actual              : " + actBaseCurrencyValue+       " Value Expected : " + expBaseCurrencyValue);
	  		  System.out.println("Currency Name Value Actual              : " + actCurrencyNameR1C1+        " Value Expected : " + expCurrencyNameR1C1);
	  		  System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR1C2+   " Value Expected : " + expCurrencyDefinedAsR1C2);
	  		  System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR1C3+        " Value Expected : " + expCurrencyRateR1C3);
	  		  System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR1C4+ " Value Expected : " + expCurrencyDescriptionR1C4);
	  			
	  		  if (actBaseCurrencyValue.equalsIgnoreCase(expBaseCurrencyValue)
	  				  
	  				  && actCurrencyNameR1C1.equalsIgnoreCase(expCurrencyNameR1C1)
	  				  && actCurrencyDefinedAsR1C2.equalsIgnoreCase(expCurrencyDefinedAsR1C2)
	  				  && actCurrencyRateR1C3.equalsIgnoreCase(expCurrencyRateR1C3)
	  				  && actCurrencyDescriptionR1C4.equalsIgnoreCase(actCurrencyDescriptionR1C4))
	  		  {
	  			  excelReader.setCellData(xlfile, xlSheetName, 243, 9, resPass);
	  			  return true;
	  		  } 
	  		  else
	  		  {
	  			  excelReader.setCellData(xlfile, xlSheetName, 243, 9, resFail);
	  			  return false;
	  		  }
	  	  }
	  	  catch (Exception e) 
	  	  {
	  		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 243, 10, e.getMessage());
	  		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		  return false;
	  	  }   
	    }
	    
	    
	    
	    //Here Exchange Rate Update Successfully message is display if Currency is not deleted and loading the details and saving
	    public static boolean checkDeleteOptionWithYesInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	    {
	  	
	  	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("************************* checkDeleteOptionWithYesInExchangeRate Method Is Executing.....................  **********************");

	  	try
	  	{
	  	
	  	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchnageRateDeleteOption));
	  	  exchnageRateDeleteOption.click();
	  			    	     
	  	  getWaitForAlert();
	  	  
	  	  String actCompanySaveMsg=getAlert().getText();
	  	    
	  	  String getExpectedDeleteRowMsg= excelReader.getCellData(xlSheetName, 250, 7); 
	  	  
	  	  excelReader.setCellData(xlfile, xlSheetName, 250, 8, actCompanySaveMsg);
	  	    
	  	  System.out.println("Delete Row Message Value Actual          :" + actCompanySaveMsg + "      Value Expected : " + getExpectedDeleteRowMsg);
	  		
	  	  getAlert().accept();
	  		
	  	  String expGetMessageTextFromDeleteCurrency=excelReader.getCellData(xlSheetName, 251, 7); 
	  	  
	  	  boolean actMessageOnDeleteExchangeRate=checkValidationMessageboolean(expGetMessageTextFromDeleteCurrency);
	  	  boolean expMessageOnDeleteExchangeRate=true;
	  	  
	  	  String actResult = Boolean.toString(actMessageOnDeleteExchangeRate);
	  	  
	  	  excelReader.setCellData(xlfile, xlSheetName, 249, 8, actResult.toUpperCase());

	  	  System.out.println("Currency Master Delete Option, In Alert Click on Ok button Value Actual : "+actMessageOnDeleteExchangeRate +"Value Exepected : "+ expMessageOnDeleteExchangeRate);
	  	     		
	  	  if(actMessageOnDeleteExchangeRate==expMessageOnDeleteExchangeRate)
	  	  {	
	  		excelReader.setCellData(xlfile, xlSheetName, 249, 9, resPass);
	  		return true;
	  	  }	 
	  	  else
	  	  {    
	  		 excelReader.setCellData(xlfile, xlSheetName, 249, 9, resFail);
	  		 return false;
	    	  }	    
	  	}
	  	catch (Exception e) 
	  	{
	  		String exception =e.getMessage().substring(0, 100);
	  		excelReader.setExceptionInExcel(xlfile, xlSheetName, 249, 10, exception);
	  		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	  		return false;
	  	}   
	    }
	  	
	  	
	    // Check The AED Currency is displaying or not
	    // There is Issue as of now in delete row, update the row and delete the exchange rate.....But if user delete whole exchange rate it is deleting
	   
	    @FindBy(xpath="//input[@id='ExchangeTable_CurrencyName']")
	    private static WebElement currencyNameExchangeTable;
	    
	    public static boolean checkDeletedCurrencyValuesIsDisplayInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	    {
	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("****************** checkDeletedCurrencyValuesIsDisplayInExchangeRate Method Is Executing.....................******************************");	
	  	
	  	try
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		baseCurrencyTxt.click();
	  		baseCurrencyTxt.sendKeys(Keys.SPACE);
	  		
	  		int baseCurrencyComboListCount = baseCurrencyComboList.size();
	  		
	  		ArrayList<String> baseCurrencyComboListArray = new ArrayList<String>();
	  		
	  		for(int i=1;i<baseCurrencyComboListCount;i++)
	  		{
	  			String data=baseCurrencyComboList.get(i).getText();
	  			if(data.equalsIgnoreCase("USD"))
	  			{
	  				baseCurrencyComboList.get(i).click();
	  			}		
	  		}
	  			 
	  		baseCurrencyTxt.sendKeys(Keys.TAB);

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  		withEffectiveDateTxt.click();
	  		withEffectiveDateTxt.sendKeys(Keys.TAB);
	  		
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyNameExchangeTable));
	  		
	  		System.out.println("The Currency Name must be Blank"+currencyNameExchangeTable.getAttribute("value"));
	  	
	  		
	  		boolean actCurrencyNameR1C1        = currencyNameExchangeTable.getAttribute("value").isEmpty();
	  	
	  		boolean expCurrencyNameR1C1        = true;
	  		
	  		String actResult = Boolean.toString(actCurrencyNameR1C1);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 252, 8, actResult.toUpperCase());
	  		

	  		System.out.println("Currency Name Value Actual               : " + actCurrencyNameR1C1+        " Value Expected : " + expCurrencyNameR1C1);

	  		if (actCurrencyNameR1C1 == expCurrencyNameR1C1 )
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 252, 9, resPass);
	  			return true;
	  		} 
	  		else
	  		{
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

	    
	    
	    //Save with AED with Input 
	    
	    public static boolean checkSaveAEDExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	    {
	  		
	  	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  	
	  	System.out.println("**************************** checkSaveAEDExchangeRate Method Is Executing..................... *********************");
	  	
	  	String expDeleteMessageOkIsClicked;
	  	boolean actDeleteDisplayMessageOkIsClicked;
	  	boolean expDeleteDisplayMessageOkIsClicked;
	  	
	  
	  		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  			
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		baseCurrencyTxt.click();
	  		baseCurrencyTxt.clear();
	  		baseCurrencyTxt.sendKeys(Keys.END);
	  		baseCurrencyTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  		Thread.sleep(2000);
	  		
	  		baseCurrencyTxt.sendKeys(excelReader.getCellData(xlSheetName, 254, 6));
	  		
	  		Thread.sleep(2000);  
	  		
	  		getAction().moveToElement(baseCurrencyTxt).sendKeys(Keys.TAB).perform();
	  		
	  		
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  		
	  		withEffectiveDateTxt.click();
	  		Thread.sleep(2000);
	  		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
	  		
	  		
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
	  		
	  		gridcurrencyName1Txt.click();
	  		gridcurrencyName1Txt.clear();
	  		Thread.sleep(2000);
	  		gridcurrencyName1Txt.sendKeys(Keys.END);
	  		gridcurrencyName1Txt.sendKeys(Keys.SHIFT,Keys.HOME);
	  		Thread.sleep(2000);
	  		
	  		gridcurrencyName1Txt.sendKeys(excelReader.getCellData(xlSheetName, 253, 6));
	  		Thread.sleep(2000);
	  		getAction().moveToElement(gridcurrencyName1Txt).sendKeys(Keys.TAB).perform();
	  		

	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
	  		
	  		gridDefineAsTxt.click();
	  		gridDefineAsTxt.sendKeys(Keys.END);
	  		gridDefineAsTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  		Thread.sleep(2000);
	  		
	  		
	  		gridDefineAsTxt.sendKeys(excelReader.getCellData(xlSheetName, 254, 6));
	  		Thread.sleep(2000);
	  		getAction().moveToElement(gridDefineAsTxt).sendKeys(Keys.TAB).perform();
	  		
	  			
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
	  		gridRateTxt.sendKeys(Keys.END);
	  		gridRateTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  		Thread.sleep(2000);
	  		
	  		gridRateTxt.sendKeys(excelReader.getCellData(xlSheetName, 255, 6));
	  		Thread.sleep(3000);
	  		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
	  		
	  		
	  		//Second row data
	  		
	          
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
	  		gridcurrencyName1Txt.click();	
	  		gridcurrencyName1Txt.clear();
	  		Thread.sleep(2000);
	  		gridcurrencyName1Txt.sendKeys(excelReader.getCellData(xlSheetName, 256, 6));
	  		Thread.sleep(3000);
	  		getAction().moveToElement(gridcurrencyName1Txt).sendKeys(Keys.TAB).perform();
	  		

	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));			
	  		gridDefineAsTxt.click();
	  		gridDefineAsTxt.sendKeys(excelReader.getCellData(xlSheetName, 257, 6));
	  		Thread.sleep(2000);
	  		getAction().moveToElement(gridDefineAsTxt).sendKeys(Keys.TAB).perform();
	  		
	  			
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
	  		
	  		gridRateTxt.sendKeys(excelReader.getCellData(xlSheetName, 258, 6));
	  		Thread.sleep(2000);
	  		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
	  		
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
	  		exchangeRateDefinitionSaveIcon.click();

	  		String expSaveExchangeRate = excelReader.getCellData(xlSheetName, 254, 7);
	  		
	  		boolean actMessageOnExchangeRate=checkValidationMessageboolean(expSaveExchangeRate);
	        boolean expMessageOnExchangeRate=true;
	          
	        String actResult = Boolean.toString(actMessageOnExchangeRate);
	          
	        excelReader.setCellData(xlfile, xlSheetName, 254, 8, actResult.toUpperCase());
	  		  
	  		System.out.println("Excange Rate Update Currency Definition Value Actual : " + actMessageOnExchangeRate+ "      Value Expected : " + expMessageOnExchangeRate);

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		baseCurrencyTxt.click();

	  		
	  		
	  		//Save USD currency
	  		
	  		
	  		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  				
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		
	  		baseCurrencyTxt.click();
	  		
	  		baseCurrencyTxt.sendKeys(excelReader.getCellData(xlSheetName, 231, 6));
	  		
	  		Thread.sleep(2000);  
	  		
	  		getAction().moveToElement(baseCurrencyTxt).sendKeys(Keys.TAB).perform();
	  		
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  		
	  		withEffectiveDateTxt.click();
	  		Thread.sleep(2000);
	  		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
	  					
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
	  		
	  		gridcurrencyName1Txt.click();
	  		
	  		gridcurrencyName1Txt.sendKeys(excelReader.getCellData(xlSheetName, 232, 6));
	  		Thread.sleep(2000);
	  		getAction().moveToElement(gridcurrencyName1Txt).sendKeys(Keys.TAB).perform();
	  		

	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
	  		
	  		gridDefineAsTxt.click();
	  		
	  		gridDefineAsTxt.sendKeys(excelReader.getCellData(xlSheetName, 233, 6));
	  		Thread.sleep(2000);
	  		getAction().moveToElement(gridDefineAsTxt).sendKeys(Keys.TAB).perform();
	  		
	  			
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
	  		
	  		gridRateTxt.sendKeys(excelReader.getCellData(xlSheetName, 234, 6));
	  		Thread.sleep(2000);
	  		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
	  		
	  		
	  		//Second row data
	  		
	          
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
	  		gridcurrencyName1Txt.click();			
	  		gridcurrencyName1Txt.sendKeys(excelReader.getCellData(xlSheetName, 235, 6));
	  		Thread.sleep(2000);
	  		getAction().moveToElement(gridcurrencyName1Txt).sendKeys(Keys.TAB).perform();
	  		

	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));			
	  		gridDefineAsTxt.click();
	  		gridDefineAsTxt.sendKeys(excelReader.getCellData(xlSheetName, 236, 6));
	  		Thread.sleep(2000);
	  		getAction().moveToElement(gridDefineAsTxt).sendKeys(Keys.TAB).perform();
	  		
	  			
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
	  		
	  		gridRateTxt.sendKeys(excelReader.getCellData(xlSheetName, 237, 6));
	  		Thread.sleep(2000);
	  		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
	  		
	  		Thread.sleep(2000);
	       	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
	  		
	  		exchangeRateDefinitionSaveIcon.click();
	  		
	  		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));

	  		
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
	  		exchangeRateDefinitionSaveIcon.click();

	  		String expSaveExchangeRate0 = excelReader.getCellData(xlSheetName, 229, 7);
	  		
	  		boolean actMessageOnExchangeRate0=checkValidationMessageboolean(expSaveExchangeRate0);
	        boolean expMessageOnExchangeRate0=true;
	          
	        String actResults = Boolean.toString(actMessageOnExchangeRate0);
	          
	        excelReader.setCellData(xlfile, xlSheetName, 229, 8, actResults.toUpperCase());
	  		  
	  		System.out.println("Excange Rate Update Currency Definition Value Actual : " + actMessageOnExchangeRate0 + "      Value Expected : " + expMessageOnExchangeRate0);

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		baseCurrencyTxt.click();

	  		if (actMessageOnExchangeRate==expMessageOnExchangeRate && actMessageOnExchangeRate0==expMessageOnExchangeRate0) 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 228, 9, resPass);
	  			return true;
	  		} 
	  		else 
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 228, 9, resFail);
	  			return false;
	  		}

	  	 
	    }  
	    
	    
	  	
	    public static boolean checkSavedCurrencyValuesAfterDeleteAndInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	    {
	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("******************************************** checkSavedCurrencyValuesAfterDeleteAndInput ************************************************");

	  	try
	  	{
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	  		homeMenu.click();

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	  		mastersMenu.click();
	  		 
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMenu));
	  		currencyMenu.click();
	  		 
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateMenu));
	  		exchangeRateMenu.click();
	  		
	  		Thread.sleep(2000);
	  	
	  	
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		baseCurrencyTxt.click();
	  		baseCurrencyTxt.sendKeys(Keys.SPACE);
	  		 
	  		int baseCurrencyComboListCount = baseCurrencyComboList.size();
	  		
	  		ArrayList<String> baseCurrencyComboListArray = new ArrayList<String>();
	  		
	  		for(int i=1;i<baseCurrencyComboListCount;i++)
	  		{
	  			String data=baseCurrencyComboList.get(i).getText();
	  			if(data.equalsIgnoreCase("AED"))
	  			{
	  				baseCurrencyComboList.get(i).click();
	  			}	
	  		}
	  		 
	  		
	  		baseCurrencyTxt.sendKeys(Keys.TAB);
	  		
	  		Thread.sleep(4000);
	  		
	  		String actBaseCurrencyValue = baseCurrencyTxt.getAttribute("value");
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  		withEffectiveDateTxt.click();
	  		
	  		String actWithEffectiveDate = withEffectiveDateTxt.getAttribute("value");
	  		
	  		String actCurrencyNameR1C1 = exchangeRateDefinitionCurrencyNameRow1Col1.getText();
	  		String actCurrencyNameR2C1 = exchangeRateDefinitionCurrencyNameRow2Col1.getText();
	  		
	  		String actCurrencyDefinedAsR1C2 = exchangeRateDefinitionDefinedAsRow1Col2.getText();
	  		String actCurrencyDefinedAsR2C2 = exchangeRateDefinitionDefinedAsRow2Col2.getText();
	  		
	  		String actCurrencyRateR1C3 = exchangeRateDefinitionRateRow1Col3.getText();
	  		String actCurrencyRateR2C3 = exchangeRateDefinitionRateRow2Col3.getText();
	  		
	  		String actCurrencyDescriptionR1C4 = exchangeRateDefinitionDescriptionRow1Col4.getText();
	  		String actCurrencyDescriptionR2C4 = exchangeRateDefinitionDescriptionRow2Col4.getText();
	  		
	  		String expBaseCurrencyValue = excelReader.getCellData(xlSheetName, 260, 7);
	  		
	  		String expCurrencyNameR1C1 = excelReader.getCellData(xlSheetName, 261, 7);
	  		String expCurrencyNameR2C1 = excelReader.getCellData(xlSheetName, 262, 7);
	  		
	  		String expCurrencyDefinedAsR1C2 = excelReader.getCellData(xlSheetName, 263, 7);
	  		String expCurrencyDefinedAsR2C2 = excelReader.getCellData(xlSheetName, 264, 7);
	  		
	  		String expCurrencyRateR1C3 = excelReader.getCellData(xlSheetName, 265, 7);
	  		String expCurrencyRateR2C3 = excelReader.getCellData(xlSheetName, 266, 7);
	  		
	  		String expCurrencyDescriptionR1C4 = excelReader.getCellData(xlSheetName, 267, 7);
	  		String expCurrencyDescriptionR2C4 = excelReader.getCellData(xlSheetName, 268, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 260, 8, actBaseCurrencyValue);
	  		excelReader.setCellData(xlfile, xlSheetName, 261, 8, actCurrencyNameR1C1);
	  		excelReader.setCellData(xlfile, xlSheetName, 262, 8, actCurrencyNameR2C1);
	  		excelReader.setCellData(xlfile, xlSheetName, 263, 8, actCurrencyDefinedAsR1C2);
	  		excelReader.setCellData(xlfile, xlSheetName, 264, 8, actCurrencyDefinedAsR2C2);
	  		excelReader.setCellData(xlfile, xlSheetName, 265, 8, actCurrencyRateR1C3);
	  		excelReader.setCellData(xlfile, xlSheetName, 266, 8, actCurrencyRateR2C3);
	  		excelReader.setCellData(xlfile, xlSheetName, 267, 8, actCurrencyDescriptionR1C4);
	  		excelReader.setCellData(xlfile, xlSheetName, 268, 8, actCurrencyDescriptionR2C4);
	  		
	  		System.out.println("Base Currency Value Actual              : " + actBaseCurrencyValue+       " Value Expected : " + expBaseCurrencyValue);
	  		System.out.println("Currency Name Value Actual              : " + actCurrencyNameR1C1+        " Value Expected : " + expCurrencyNameR1C1);
	  		System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR1C2+   " Value Expected : " + expCurrencyDefinedAsR1C2);
	  		System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR1C3+        " Value Expected : " + expCurrencyRateR1C3);
	  		System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR1C4+ " Value Expected : " + expCurrencyDescriptionR1C4);
	  		System.out.println("Currency Name Value Actual              : " + actCurrencyNameR2C1+        " Value Expected : " + expCurrencyNameR2C1);
	  		System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR2C2+   " Value Expected : " + expCurrencyDefinedAsR2C2);
	  		System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR2C3+        " Value Expected : " + expCurrencyRateR2C3);
	  		System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR2C4+ " Value Expected : " + expCurrencyDescriptionR2C4);
	  		
	  		if (actBaseCurrencyValue.equalsIgnoreCase(expBaseCurrencyValue)
	  				
	  				&& actCurrencyNameR1C1.equalsIgnoreCase(expCurrencyNameR1C1)
	  				&& actCurrencyDefinedAsR1C2.equalsIgnoreCase(expCurrencyDefinedAsR1C2)
	  				&& actCurrencyRateR1C3.equalsIgnoreCase(expCurrencyRateR1C3)
	  				&& actCurrencyDescriptionR1C4.equalsIgnoreCase(actCurrencyDescriptionR1C4)

	  				&& actCurrencyNameR2C1.equalsIgnoreCase(expCurrencyNameR2C1)
	  				&& actCurrencyDefinedAsR2C2.equalsIgnoreCase(expCurrencyDefinedAsR2C2)
	  				&& actCurrencyRateR2C3.equalsIgnoreCase(expCurrencyRateR2C3)
	  				&& actCurrencyDescriptionR2C4.equalsIgnoreCase(actCurrencyDescriptionR2C4))
	  		{	
	  			excelReader.setCellData(xlfile, xlSheetName, 259, 9, resPass);
	  			return true;
	  		}		 
	  		else
	  		{    
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
	    
	    
	    @FindBy(xpath = "//*[@id='divSelectSheet']/div[2]/div/div[1]/h4")
	    private static WebElement selectSheetName;
	  	
	    @FindBy(xpath = "//select[@id='ImportTable_ExternalField']")
	    private static WebElement selectTextFromComboBox;
	  	
	    @FindBy(xpath = "//div[@id='popUpdataSheetName']")
	    private static WebElement sheetNamesDisplayArea;
	  	
	    @FindBy(xpath = "//li[@class='clsSheetName']")
	    private static WebElement SmokeMasters;
	  	
	    @FindBy(xpath = "//button[@id='btnSheetOk']")
	    private static WebElement sheetOkBtn;
	  	
	    @FindBy(xpath = "//button[@id='btnSheetClose']")
	    private static WebElement sheetCloseBtn;

	  	
	  	
	   public static boolean checkClickOnImportFromExcelToDisplayImportScreenInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {
	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("************************************* checkClickOnImportFromExcelToDisplayImportScreenInExchangeRate **********************************");
	  		
	  	try
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFromExcelIcon));
	  		importFromExcelIcon.click();
	  		//Thread.sleep(5000);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFilePathTxt));

	  		boolean actImportFilePath               = importFilePathTxt.isDisplayed();
	  		boolean actImportFileBtn                = importFileBtn.isDisplayed();
	  		boolean actExchangeRateFieldsColumnName = importFileExchangeRateColumnName.isDisplayed();
	  		boolean actExternalFieldsColumnName     = importFileExternalFieldsColumnName.isDisplayed();

	  		boolean actBaseCurrrencyName            = importFileBaseCurrencyName.isDisplayed();
	  		boolean actBaseCurrrencyValue           = importFileBaseCurrencyValue.isDisplayed();

	  		boolean actEffectiveDateName            = importFileEffectiveDateName.isDisplayed();
	  		boolean actEffectiveDateValue           = importFileEffectiveDateValue.isDisplayed();

	  		boolean actDefinedCurrencyName          = importFileDefinedCurrencyName.isDisplayed();
	  		boolean actDefinedCurrencyValue         = importFileDefinedCurrencyValue.isDisplayed();

	  		boolean actRateName                     = importFileRateName.isDisplayed();
	  		boolean actRateValue                    = importFileRateValue.isDisplayed();

	  		boolean actSelectedCurrencyName         = importFileSelectedCurrencyName.isDisplayed();
	  		boolean actSelectedCurrencyValue        = importFileSelectedCurrencyValue.isDisplayed();

	  		boolean actImportDataBtn                = importDataBtn.isDisplayed();
	  		boolean actImportCloseBtn               = closeImportBtn.isDisplayed();

	  		boolean expImportFilePath               = true;
	  		boolean expImportFileBtn                = true;
	  		boolean expExchangeRateFieldsColumnName = true;
	  		boolean expExternalFieldsColumnName     = true;

	  		boolean expBaseCurrrencyName            = true;
	  		boolean expBaseCurrrencyValue           = true;

	  		boolean expEffectiveDateName            = true;
	  		boolean expEffectiveDateValue           = true;

	  		boolean expDefinedCurrencyName          = true;
	  		boolean expDefinedCurrencyValue         = true;

	  		boolean expRateName                     = true;
	  		boolean expRateValue                    = true;

	  		boolean expSelectedCurrencyName         = true;
	  		boolean expSelectedCurrencyValue        = true;

	  		boolean expImportDataBtn                = true;
	  		boolean expImportCloseBtn               = true;

	  		System.out.println("Import File Path Value Actual                      : " + actImportFilePath+               " Value Expected : " + expImportFilePath);

	  		System.out.println("Import File Button Value Actual                    : " + actImportFileBtn+                " Value Expected : " + expImportFileBtn);
	  		System.out.println("Exchange Rate Name Value Actual                    : " + actExchangeRateFieldsColumnName+ " Value Expected : " + expExchangeRateFieldsColumnName);
	  		System.out.println("External Fields Name Value Actual                  : " + actExternalFieldsColumnName+     " Value Expected : " + expExternalFieldsColumnName);
	  		System.out.println("Base Currency Name Value Actual                    : " + actBaseCurrrencyName+            " Value Expected : " + expBaseCurrrencyName);

	  		System.out.println("Base Currency Value Actual                         : " + actBaseCurrrencyValue+           " Value Expected : " + expBaseCurrrencyValue);
	  		System.out.println("Effective Date Name Value Actual                   : " + actEffectiveDateName+            " Value Expected : " + expEffectiveDateName);
	  		System.out.println("Effective Date Value Actual                        : " + actEffectiveDateValue+           " Value Expected : " + expEffectiveDateValue);
	  		System.out.println("Defined Currency Name Value Actual                 : " + actDefinedCurrencyName+          " Value Expected : " + expDefinedCurrencyName);

	  		System.out.println("Defined Currency Value Actual                      : " + actDefinedCurrencyValue+         " Value Expected : " + expDefinedCurrencyValue);
	  		System.out.println("Rate Name Value Actual                             : " + actRateName +                    " Value Expected : "+ expRateName);
	  		System.out.println("Rate Value Actual                                  : " + actRateValue+                    " Value Expected : " + expRateValue);
	        System.out.println("Selected Currency Name Value Actual                : " + actSelectedCurrencyName+         " Value Expected : " + expSelectedCurrencyName);
	  		System.out.println("Selected Currency Value Actual                     : " + actSelectedCurrencyValue+        " Value Expected : " + expSelectedCurrencyValue);

	  		System.out.println("Import Data Button Value Actual                    : " + actImportDataBtn+                " Value Expected : " + expImportDataBtn);
	        System.out.println("Import Close Button Value Actual                   : " + actImportCloseBtn+               " Value Expected : " + expImportCloseBtn);
	          
	          
	        boolean actMethod = actImportFilePath == expImportFilePath && actExchangeRateFieldsColumnName == expExchangeRateFieldsColumnName
	  							&& actExternalFieldsColumnName == expExternalFieldsColumnName && actBaseCurrrencyName == expBaseCurrrencyName
	  							&& actBaseCurrrencyValue == expBaseCurrrencyValue && actEffectiveDateName == expEffectiveDateName
	  							&& actEffectiveDateName == expEffectiveDateName && actEffectiveDateValue == expEffectiveDateValue
	  							&& actDefinedCurrencyName == expDefinedCurrencyName && actDefinedCurrencyValue == expDefinedCurrencyValue && actRateName == expRateName
	  							&& actRateValue == expRateValue && actSelectedCurrencyName == expSelectedCurrencyName && actSelectedCurrencyValue == actSelectedCurrencyValue
	  							&& actImportDataBtn == expImportDataBtn && actImportCloseBtn == expImportCloseBtn;

	        String actResult = Boolean.toString(actMethod);
	          
	        excelReader.setCellData(xlfile, xlSheetName, 269, 8, actResult.toUpperCase());
	          
	  		if (actMethod==true)
	  		{	
	  			excelReader.setCellData(xlfile, xlSheetName, 269, 9, resPass);
	  			return true;
	  		}		 
	  		else
	  		{    
	  			excelReader.setCellData(xlfile, xlSheetName, 269, 9, resFail);
	  			return false;
	  		}		  		
	  	}
	  	catch (Exception e) 
	  	{
	  		excelReader.setExceptionInExcel(xlfile, xlSheetName, 269, 10, e.getMessage());
	  		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		return false;
	  	} 
	   }

	   public static boolean checkClickOnImportDataInImportFromExcelPageOfExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("************************************* checkClickOnImportDataInImportFromExcelPageOfExchangeRate ********************************************");
	  	
	  	try
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFilePathTxt));
	  		importFilePathTxt.click();
	  		importFilePathTxt.sendKeys(Keys.TAB);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFileBtn));
	  		importFileBtn.click();
	  		
	  		Thread.sleep(5000);
	  		
	  		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\exchangeRateTwoRows.exe");

	  		Thread.sleep(5000);

	  		boolean actSelectSheetName     = selectSheetName.isDisplayed();
	  		boolean actSheetNameArea       = sheetNamesDisplayArea.isDisplayed();
	  		boolean actSmokeMasters        = SmokeMasters.isDisplayed();
	  		boolean actSheetOkBtn          = sheetOkBtn.isDisplayed();
	  		boolean actSheetCloseBtn       = sheetCloseBtn.isDisplayed();

	  		boolean expSelectSheetName     = true;
	  		boolean expSheetNameArea       = true;
	  		boolean expSmokeMasters        = true;
	  		boolean expSheetOkBtn          = true;
	  		boolean expSheetCloseBtn       = true;

	  		System.out.println("Sheet Name Value Actual                   : " + actSelectSheetName+  " Value Expected : " + expSelectSheetName);
	  		System.out.println("Sheet Name Area Value Actual              : " + actSheetNameArea+    " Value Expected : " + expSheetNameArea);
	  		System.out.println("Sheet One Value Actual                    : " + actSmokeMasters +    " Value Expected : "+ expSmokeMasters);
	  		System.out.println("Ok Button Value Actual                    : " + actSheetOkBtn+       " Value Expected : " + expSheetOkBtn);
	  		System.out.println("Close Button Value Actual                 : " + actSheetCloseBtn+    " Value Expected : " + expSheetCloseBtn);


	  		boolean actMethod = actSelectSheetName == expSelectSheetName && actSheetNameArea == expSheetNameArea && actSmokeMasters == expSmokeMasters
	  				&& actSheetOkBtn == expSheetOkBtn && actSheetCloseBtn == expSheetCloseBtn;

	  		String actResult = Boolean.toString(actMethod);

	  		excelReader.setCellData(xlfile, xlSheetName, 270, 8, actResult.toUpperCase());
	  		
	  		if (actMethod==true)
	  		{	
	  			excelReader.setCellData(xlfile, xlSheetName, 270, 9, resPass);
	  			return true;
	  		}		 
	  		else
	  		{    
	  			excelReader.setCellData(xlfile, xlSheetName, 270, 9, resFail);
	  			return false;
	  		}		  		
	  	 }
	  	catch (Exception e) 
	  	{
	  		excelReader.setExceptionInExcel(xlfile, xlSheetName, 270, 10, e.getMessage());
	  		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		return false;
	  	}  
	   }

	   
	   public static boolean checkSelectColumnsMappingInImportScreenOfExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {
	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("************************************* checkSelectColumnsMappingInImportScreenOfExchangeRate ********************************************");
	  	
	  	try
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SmokeMasters));
	  		SmokeMasters.click();

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sheetOkBtn));
	  		sheetOkBtn.click();
	  		Thread.sleep(2000);

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFilePathTxt));
	  		importFilePathTxt.click();

	  		String actFileName = importFilePathTxt.getAttribute("value");
	  		String expFileName = excelReader.getCellData(xlSheetName, 272, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 272, 8, actFileName);

	  		System.out.println("Import File Path Value Actual                   :   " + actFileName +             "  Value Expected :  "+ expFileName);

	  		if (actFileName.equalsIgnoreCase(expFileName)) 
	  		{	
	  			excelReader.setCellData(xlfile, xlSheetName, 271, 9, resPass);
	  			return true;
	  		}		 
	  		else
	  		{    
	  			excelReader.setCellData(xlfile, xlSheetName, 271, 9, resFail);
	  			return false;
	  		}		  		
	  	 }
	  	 catch (Exception e) 
	  	 {
	  		excelReader.setExceptionInExcel(xlfile, xlSheetName, 271, 10, e.getMessage());
	  		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		return false;
	  	 }  
	    }
	    
	    
	    @FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
		public static WebElement newErrorMessage;

		@FindBy(xpath = "//span[@class='icon-reject2 theme_color']")
		public static WebElement newErrorMessageCloseBtn;

		@FindBy(xpath = "//div[@class='theme_color font-6']")
		public static WebElement validationUpdatingConfirmationMessage;
		

	    public static boolean checkSelectSheetAndClickOnOkButtonInSelectSheetScreenOfExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	    {

	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("************************************* checkSelectSheetAndClickOnOkButtonInSelectSheetScreenOfExchangeRate ***************************************");
	  	
	       
	  	try
	  	{
	  		// Here i am using Second Row Selection for alternative mechanism
	  		// Selecting Effective Date
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFileEffectiveDateValue));
	  		importFileEffectiveDateValue.click();

	  		selectTextFromComboBox.sendKeys(excelReader.getCellData(xlSheetName, 273, 6));
	  		selectTextFromComboBox.sendKeys(Keys.TAB);
	  		//Thread.sleep(2000);

	  		// Selecting Defined Currency Name
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFileDefinedCurrencyValue));
	  		importFileDefinedCurrencyValue.click();

	  		selectTextFromComboBox.sendKeys(excelReader.getCellData(xlSheetName, 274, 6));
	  		selectTextFromComboBox.sendKeys(Keys.TAB);
	  		//Thread.sleep(2000);

	  		// Selecting Rate
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFileRateValue));
	  		importFileRateValue.click();

	  		selectTextFromComboBox.sendKeys(excelReader.getCellData(xlSheetName, 275, 6));
	  		selectTextFromComboBox.sendKeys(Keys.TAB);
	  		//Thread.sleep(2000);

	  		// Selecting Selected Currency
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFileSelectedCurrencyValue));
	  		importFileSelectedCurrencyValue.click();

	  		selectTextFromComboBox.sendKeys(excelReader.getCellData(xlSheetName, 276, 6));
	  		selectTextFromComboBox.sendKeys(Keys.TAB);
	  		//Thread.sleep(2000);

	  		// Selecting Base Currency Name
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFileBaseCurrencyValue));
	  		importFileBaseCurrencyValue.click();

	  		selectTextFromComboBox.sendKeys(excelReader.getCellData(xlSheetName, 277, 6));
	  		selectTextFromComboBox.sendKeys(Keys.TAB);
	  		//Thread.sleep(2000);

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importDataBtn));
	  		importDataBtn.click();
	  		//Thread.sleep(5000);

	  		String expImportCurrencyExchangeRate = excelReader.getCellData(xlSheetName, 274, 7);

	  		boolean actMessageOnSaveExchangeRate=checkValidationMessageboolean(expImportCurrencyExchangeRate);
	  		boolean expMessageOnSaveExchangeRate=true;
	  		
	  		System.out.println("Import File Path Value Actual        : " + actMessageOnSaveExchangeRate+ "  Value Expected : " + expMessageOnSaveExchangeRate);

	  		String actResult = Boolean.toString(actMessageOnSaveExchangeRate);

	  		excelReader.setCellData(xlfile, xlSheetName, 273, 8, actResult.toUpperCase());
	  		
	  		if (actMessageOnSaveExchangeRate==expMessageOnSaveExchangeRate)
	  		{	
	  			excelReader.setCellData(xlfile, xlSheetName, 273, 9, resPass);
	  			return true;
	  		}		 
	  		else
	  		{    
	  			excelReader.setCellData(xlfile, xlSheetName, 273, 9, resFail);
	  			return false;
	  		}		  		
	  	}
	  	catch (Exception e) 
	  	{
	  		excelReader.setExceptionInExcel(xlfile, xlSheetName, 273, 10, e.getMessage());
	  		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		return false;
	  	}  
	   }

	    
	   // Checking the Import Currency Values displaying the Exchange

	   @FindBy(xpath="//input[@id='ExchangeTable_DefinedAs']")
	   private static WebElement currencyDefinedAsExchangeTable;
	    
	   public static boolean checkImportedValuesFirstInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("****************************************** checkImportedValuesFirstInExchangeRate *****************************************");
	  	
	  	try
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		baseCurrencyTxt.click();
	  		baseCurrencyTxt.sendKeys(Keys.END);
	  		baseCurrencyTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	  		baseCurrencyTxt.sendKeys("i");
	  		
	  		Thread.sleep(2000);
	  		 
	  		int baseCurrencyComboListCount = baseCurrencyComboList.size();
	  		 
	  		ArrayList<String> baseCurrencyComboListArray = new ArrayList<String>();
	  		
	  		for(int i=1;i<baseCurrencyComboListCount;i++)
	  		{
	  			String data=baseCurrencyComboList.get(i).getText();
	  			if(data.equalsIgnoreCase("INR"))
	  			{
	  				baseCurrencyComboList.get(i).click();
	  			}	
	  		}
	  		 
	  		baseCurrencyTxt.sendKeys(Keys.TAB);
	  		
	  		Thread.sleep(4000);
	  		
	  		String actBaseCurrencyValue = baseCurrencyTxt.getAttribute("value");
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  		withEffectiveDateTxt.click();
	  		withEffectiveDateTxt.sendKeys("01/01");
	  		withEffectiveDateTxt.sendKeys(Keys.TAB);
	  		
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		baseCurrencyTxt.click();
	  		baseCurrencyTxt.sendKeys(Keys.TAB);
	  		
	  		String actWithEffectiveDate = withEffectiveDateTxt.getAttribute("value");
	  		Thread.sleep(2000);
	  		
	  		String actCurrencyNameR1C1 = exchangeRateDefinitionCurrencyNameRow1Col1.getText();
	  		String actCurrencyNameR2C1 = exchangeRateDefinitionCurrencyNameRow2Col1.getText();
	  		
	  		String actCurrencyDefinedAsR1C2 = exchangeRateDefinitionDefinedAsRow1Col2.getText();
	  		String actCurrencyDefinedAsR2C2 = exchangeRateDefinitionDefinedAsRow2Col2.getText();
	  		
	  		String actCurrencyRateR1C3 = exchangeRateDefinitionRateRow1Col3.getText();
	  		String actCurrencyRateR2C3 = exchangeRateDefinitionRateRow2Col3.getText();
	  		
	  		String actCurrencyDescriptionR1C4 = exchangeRateDefinitionDescriptionRow1Col4.getText();
	  		String actCurrencyDescriptionR2C4 = exchangeRateDefinitionDescriptionRow2Col4.getText();
	  		
	  		String expBaseCurrencyValue = excelReader.getCellData(xlSheetName, 279, 7);
	  		
	  		String expCurrencyNameR1C1 = excelReader.getCellData(xlSheetName, 280, 7);
	  		String expCurrencyNameR2C1 = excelReader.getCellData(xlSheetName, 281, 7);
	  		
	  		String expCurrencyDefinedAsR1C2 = excelReader.getCellData(xlSheetName, 282, 7);
	  		String expCurrencyDefinedAsR2C2 = excelReader.getCellData(xlSheetName, 283, 7);
	  		
	  		String expCurrencyRateR1C3 = excelReader.getCellData(xlSheetName, 284, 7);
	  		String expCurrencyRateR2C3 = excelReader.getCellData(xlSheetName, 285, 7);
	  		
	  		String expCurrencyDescriptionR1C4 = excelReader.getCellData(xlSheetName, 286, 7);
	  		String expCurrencyDescriptionR2C4 = excelReader.getCellData(xlSheetName, 287, 7);
	  		
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 279, 8, actBaseCurrencyValue);
	  		excelReader.setCellData(xlfile, xlSheetName, 280, 8, actCurrencyNameR1C1);
	  		excelReader.setCellData(xlfile, xlSheetName, 281, 8, actCurrencyNameR2C1);
	  		excelReader.setCellData(xlfile, xlSheetName, 282, 8, actCurrencyDefinedAsR1C2);
	  		excelReader.setCellData(xlfile, xlSheetName, 283, 8, actCurrencyDefinedAsR2C2);
	  		excelReader.setCellData(xlfile, xlSheetName, 284, 8, actCurrencyRateR1C3);
	  		excelReader.setCellData(xlfile, xlSheetName, 285, 8, actCurrencyRateR2C3);
	  		excelReader.setCellData(xlfile, xlSheetName, 286, 8, actCurrencyDescriptionR1C4);
	  		excelReader.setCellData(xlfile, xlSheetName, 287, 8, actCurrencyDescriptionR2C4);
	  		
	  		System.out.println("Base Currency Value Actual              : " + actBaseCurrencyValue+       " Value Expected : " + expBaseCurrencyValue);
	  		System.out.println("Currency Name Value Actual              : " + actCurrencyNameR1C1+        " Value Expected : " + expCurrencyNameR1C1);
	  		System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR1C2+   " Value Expected : " + expCurrencyDefinedAsR1C2);
	  		System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR1C3+        " Value Expected : " + expCurrencyRateR1C3);
	  		System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR1C4+ " Value Expected : " + expCurrencyDescriptionR1C4);
	  		System.out.println("Currency Name Value Actual              : " + actCurrencyNameR2C1+        " Value Expected : " + expCurrencyNameR2C1);
	  		System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR2C2+   " Value Expected : " + expCurrencyDefinedAsR2C2);
	  		System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR2C3+        " Value Expected : " + expCurrencyRateR2C3);
	  		System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR2C4+ " Value Expected : " + expCurrencyDescriptionR2C4);
	  		
	  		if (actBaseCurrencyValue.equalsIgnoreCase(expBaseCurrencyValue)
	  				
	  					&& actCurrencyNameR1C1.equalsIgnoreCase(expCurrencyNameR1C1)
	  					&& actCurrencyDefinedAsR1C2.equalsIgnoreCase(expCurrencyDefinedAsR1C2)
	  					&& actCurrencyRateR1C3.equalsIgnoreCase(expCurrencyRateR1C3)
	  					&& actCurrencyDescriptionR1C4.equalsIgnoreCase(actCurrencyDescriptionR1C4)

	  					&& actCurrencyNameR2C1.equalsIgnoreCase(expCurrencyNameR2C1)
	  					&& actCurrencyDefinedAsR2C2.equalsIgnoreCase(expCurrencyDefinedAsR2C2)
	  					&& actCurrencyRateR2C3.equalsIgnoreCase(expCurrencyRateR2C3)
	  					&& actCurrencyDescriptionR2C4.equalsIgnoreCase(actCurrencyDescriptionR2C4))
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 278, 9, resPass);
	  			return true;
	  		} 
	  		else
	  		{
	  			excelReader.setCellData(xlfile, xlSheetName, 278, 9, resFail);
	  			return false;
	  		}
	  	}
	  	catch (Exception e) 
	  	{
	  		String exception =e.getMessage().substring(0, 50);
	  		excelReader.setExceptionInExcel(xlfile, xlSheetName, 278, 10, exception);
	  		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		return false;
	  	} 
	   }

	    public static boolean checkImportedValuesSecondInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	    {
	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("*********************************************** checkImportedValuesSecondInExchangeRate ****************************************");

	  	try
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		baseCurrencyTxt.click();
	  		baseCurrencyTxt.sendKeys(Keys.END);
	  		baseCurrencyTxt.sendKeys(Keys.SHIFT, Keys.HOME);
	  		baseCurrencyTxt.sendKeys(Keys.SPACE);
	  		 
	  		int baseCurrencyComboListCount = baseCurrencyComboList.size();
	  		
	  		ArrayList<String> baseCurrencyComboListArray = new ArrayList<String>();
	  		
	  		for(int i=1;i<baseCurrencyComboListCount;i++)
	  		{
	  			String data=baseCurrencyComboList.get(i).getText();
	  			if(data.equalsIgnoreCase("AED"))
	  			{
	  				baseCurrencyComboList.get(i).click();
	  			}	
	  		}
	  		 
	  		
	  		baseCurrencyTxt.sendKeys(Keys.TAB);
	  		
	  		Thread.sleep(2000);
	  		
	  		String actBaseCurrencyValue = baseCurrencyTxt.getAttribute("value");
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
	  		withEffectiveDateTxt.click();
	  		withEffectiveDateTxt.sendKeys("01/01");
	  		withEffectiveDateTxt.sendKeys(Keys.TAB);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
	  		baseCurrencyTxt.click();
	  		
	  		
	  		baseCurrencyTxt.sendKeys(Keys.TAB);
	  		
	  		Thread.sleep(2990);
	  		
	  		String actWithEffectiveDate = withEffectiveDateTxt.getAttribute("value");
	  		
	  		String actCurrencyNameR1C1 = exchangeRateDefinitionCurrencyNameRow1Col1.getText();
	  		String actCurrencyNameR2C1 = exchangeRateDefinitionCurrencyNameRow2Col1.getText();
	  		
	  		String actCurrencyDefinedAsR1C2 = exchangeRateDefinitionDefinedAsRow1Col2.getText();
	  		String actCurrencyDefinedAsR2C2 = exchangeRateDefinitionDefinedAsRow2Col2.getText();
	  		
	  		String actCurrencyRateR1C3 = exchangeRateDefinitionRateRow1Col3.getText();
	  		String actCurrencyRateR2C3 = exchangeRateDefinitionRateRow2Col3.getText();
	  		
	  		String actCurrencyDescriptionR1C4 = exchangeRateDefinitionDescriptionRow1Col4.getText();
	  		String actCurrencyDescriptionR2C4 = exchangeRateDefinitionDescriptionRow2Col4.getText();
	  		
	  		String expBaseCurrencyValue = excelReader.getCellData(xlSheetName, 289, 7);
	  		
	  		String expCurrencyNameR1C1 = excelReader.getCellData(xlSheetName, 290, 7);
	  		String expCurrencyNameR2C1 = excelReader.getCellData(xlSheetName, 291, 7);
	  		
	  		String expCurrencyDefinedAsR1C2 = excelReader.getCellData(xlSheetName, 292, 7);
	  		String expCurrencyDefinedAsR2C2 = excelReader.getCellData(xlSheetName, 293, 7);
	  		
	  		String expCurrencyRateR1C3 = excelReader.getCellData(xlSheetName, 294, 7);
	  		String expCurrencyRateR2C3 = excelReader.getCellData(xlSheetName, 295, 7);
	  		
	  		String expCurrencyDescriptionR1C4 = excelReader.getCellData(xlSheetName, 296, 7);
	  		String expCurrencyDescriptionR2C4 = excelReader.getCellData(xlSheetName, 297, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 289, 8, actBaseCurrencyValue);
	  		excelReader.setCellData(xlfile, xlSheetName, 290, 8, actCurrencyNameR1C1);
	  		excelReader.setCellData(xlfile, xlSheetName, 291, 8, actCurrencyNameR2C1);
	  		excelReader.setCellData(xlfile, xlSheetName, 292, 8, actCurrencyDefinedAsR1C2);
	  		excelReader.setCellData(xlfile, xlSheetName, 293, 8, actCurrencyDefinedAsR2C2);
	  		excelReader.setCellData(xlfile, xlSheetName, 294, 8, actCurrencyRateR1C3);
	  		excelReader.setCellData(xlfile, xlSheetName, 295, 8, actCurrencyRateR2C3);
	  		excelReader.setCellData(xlfile, xlSheetName, 296, 8, actCurrencyDescriptionR1C4);
	  		excelReader.setCellData(xlfile, xlSheetName, 297, 8, actCurrencyDescriptionR2C4);
	  		
	  		System.out.println("Base Currency Value Actual              : " + actBaseCurrencyValue+       " Value Expected : " + expBaseCurrencyValue);
	  		System.out.println("Currency Name Value Actual              : " + actCurrencyNameR1C1+        " Value Expected : " + expCurrencyNameR1C1);
	  		System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR1C2+   " Value Expected : " + expCurrencyDefinedAsR1C2);
	  		System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR1C3+        " Value Expected : " + expCurrencyRateR1C3);
	  		System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR1C4+ " Value Expected : " + expCurrencyDescriptionR1C4);
	  		System.out.println("Currency Name Value Actual              : " + actCurrencyNameR2C1+        " Value Expected : " + expCurrencyNameR2C1);
	  		System.out.println("Currency Defined As Value Actual        : " + actCurrencyDefinedAsR2C2+   " Value Expected : " + expCurrencyDefinedAsR2C2);
	  		System.out.println("Currency Rate Value Actual              : " + actCurrencyRateR2C3+        " Value Expected : " + expCurrencyRateR2C3);
	  		System.out.println("Currency Description Value Actual       : " + actCurrencyDescriptionR2C4+ " Value Expected : " + expCurrencyDescriptionR2C4);
	  		
	  		if (actBaseCurrencyValue.equalsIgnoreCase(expBaseCurrencyValue)
	  				
	  				&& actCurrencyNameR1C1.equalsIgnoreCase(expCurrencyNameR1C1)
	  				&& actCurrencyDefinedAsR1C2.equalsIgnoreCase(expCurrencyDefinedAsR1C2)
	  				&& actCurrencyRateR1C3.equalsIgnoreCase(expCurrencyRateR1C3)
	  				&& actCurrencyDescriptionR1C4.equalsIgnoreCase(actCurrencyDescriptionR1C4)

	  				&& actCurrencyNameR2C1.equalsIgnoreCase(expCurrencyNameR2C1)
	  				&& actCurrencyDefinedAsR2C2.equalsIgnoreCase(expCurrencyDefinedAsR2C2)
	  				&& actCurrencyRateR2C3.equalsIgnoreCase(expCurrencyRateR2C3)
	  				&& actCurrencyDescriptionR2C4.equalsIgnoreCase(actCurrencyDescriptionR2C4))
	  		{	
	  			excelReader.setCellData(xlfile, xlSheetName, 288, 9, resPass);
	  			return true;
	  		}		 
	  		else
	  		{    
	  			excelReader.setCellData(xlfile, xlSheetName, 288, 9, resFail);
	  			return false;
	  		}		  		
	  	}
	  	catch (Exception e) 
	  	{
	  		String exception =e.getMessage().substring(0, 100);
	  		excelReader.setExceptionInExcel(xlfile, xlSheetName, 288, 10, exception);
	  		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		return false;
	  	} 
	    }

	   
	    // Check Cancel Button in the Exchange Rate

	    public static boolean checkCancelOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	    {

	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("*********************************************** checkCancelOptionInExchangeRate *********************************************************");

	  
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionPageCloseIcon));
	  		exchangeRateDefinitionPageCloseIcon.click();

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
	  		String actDashboardLabel = dashboardName.getText();
	  		String expDashboardLabel = excelReader.getCellData(xlSheetName, 299, 7);
	  		 
	  		excelReader.setCellData(xlfile, xlSheetName, 299, 8, actDashboardLabel);
	  		 
	  		System.out.println("Click on Close button                              :" + actDashboardLabel + "      Value Expected : " + expDashboardLabel);
	  		 
	  		if (actDashboardLabel.equalsIgnoreCase(expDashboardLabel)) 
	  		{
	  			System.out.println(" Test Pass: Close Button is working");
	  			excelReader.setCellData(xlfile, xlSheetName, 298, 9, resPass);
	  			return true;
	  		}
	  		else 
	  		{
	  			System.out.println(" Test Fail: Close Button is not working");
	  			excelReader.setCellData(xlfile, xlSheetName, 298, 9, resFail);
	  			return false;
	  		}
	  	
	    }
	    
	    
	    
	   // Exchange Rate History Page Starts
	   public static boolean checkClickOnExchangeRateHistoryMenuFromCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {

	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("*************************************** checkClickOnExchangeRateHistoryMenuFromCurrency *****************************************");
	  		
	  		Thread.sleep(3000);
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	  		homeMenu.click();

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	  		mastersMenu.click();

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMenu));
	  		currencyMenu.click();

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateHistoryMenu));
	  		exchangeRateHistoryMenu.click();
	  		//Thread.sleep(2000);

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateHistoryLabel));

	  		String actExchangeRateLabel       = exchangeRateHistoryLabel.getText();
	  		boolean actExchangeRateHistory    = baseCurrencyInExchangeRateHistory.isDisplayed();
	  		boolean actExchangeRateDateOption = dateOptionDropdown.isDisplayed();
	  		boolean actExchangeRateFromDate   = fromDateTxt.isDisplayed();
	  		boolean actExchangeRateToDate     = toDateTxt.isDisplayed();
	  		boolean actExchangeRateLoadBtn    = loadIcon.isDisplayed();
	  		boolean actExchangeRateClearBtn   = exchangeRateHistoryclearIcon.isDisplayed();
	  		boolean actExchangeRateTableTab   = tableTab.isDisplayed();
	  		boolean actExchangeRateGraphTab   = graphTab.isDisplayed();
	  		boolean actExchangeRateCloseBtn   = exchangeRateHistoryCloseIcon.isDisplayed();
	  		
	  		String expExchangeRateLabel       = excelReader.getCellData(xlSheetName, 302, 7);
	  		boolean expExchangeRateHistory    = true;
	  		boolean expExchangeRateDateOption = true;
	  		boolean expExchangeRateFromDate   = true;
	  		boolean expExchangeRateToDate     = true;
	  		boolean expExchangeRateLoadBtn    = true;
	  		boolean expExchangeRateClearBtn   = true;
	  		boolean expExchangeRateTableTab   = true;
	  		boolean expExchangeRateGraphTab   = true;
	  		boolean expExchangeRateCloseBtn   = true;
	  		

	  		System.out.println("Exchange Rate History Label Value Actual     : " + actExchangeRateLabel+      " Value Expected : " + expExchangeRateLabel);
	  		System.out.println("Base Currency Value Actual                   : " + actExchangeRateHistory+    " Value Expected : " + expExchangeRateHistory);
	          System.out.println("Date Dropdown Value Actual                   : " + actExchangeRateDateOption+ " Value Expected : " + expExchangeRateDateOption);
	  		System.out.println("From Date Value Actual                       : " + actExchangeRateFromDate+   " Value Expected : " + expExchangeRateFromDate);
	  		System.out.println("To Date Value Actual                         : " + actExchangeRateToDate+     " Value Expected : " + expExchangeRateToDate);
	  		System.out.println("Load Button Value Actual                     : " + actExchangeRateLoadBtn+    " Value Expected : " + expExchangeRateLoadBtn);
	          System.out.println("Clear Button Value Actual                    : " + actExchangeRateClearBtn+   " Value Expected : " + expExchangeRateClearBtn);

	  		System.out.println("Table Tab Value Actual                       : " + actExchangeRateTableTab+   " Value Expected : " + expExchangeRateTableTab);
	  		System.out.println("Rate Graph Value Actual                      : " + actExchangeRateGraphTab+   " Value Expected : " + expExchangeRateGraphTab);
	  		System.out.println("Close Button Value Actual                    : " + actExchangeRateCloseBtn+   " Value Expected : " + expExchangeRateCloseBtn);
	  		
	  		
	  		boolean actMethod = actExchangeRateHistory == expExchangeRateHistory && actExchangeRateDateOption == expExchangeRateDateOption
	  							&& actExchangeRateFromDate == expExchangeRateFromDate && actExchangeRateToDate == expExchangeRateToDate
	  							&& actExchangeRateLoadBtn == expExchangeRateLoadBtn && actExchangeRateClearBtn == expExchangeRateClearBtn
	  							&& actExchangeRateTableTab == expExchangeRateTableTab && actExchangeRateGraphTab == expExchangeRateGraphTab
	  							&& actExchangeRateGraphTab == expExchangeRateGraphTab && actExchangeRateCloseBtn == expExchangeRateCloseBtn;
	  		
	  		String actResult = Boolean.toString(actMethod);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 302, 8, actExchangeRateLabel);
	  		excelReader.setCellData(xlfile, xlSheetName, 301, 8, actResult.toUpperCase());

	  		if (actExchangeRateLabel.equalsIgnoreCase(expExchangeRateLabel) && actMethod==true)
	  		{
	  			 System.out.println(" Test Pass: Close Button is working");
	  			 excelReader.setCellData(xlfile, xlSheetName, 301, 9, resPass);
	  			 return true;
	  		 }
	  		 else 
	  		 {
	  			 System.out.println(" Test Fail: Close Button is not working");
	  			 excelReader.setCellData(xlfile, xlSheetName, 301, 9, resFail);
	  			 return false;
	  		 }
	  	
	    }

	    public static boolean checkExchangeRateHistoryClearButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	    {

	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("****************************************** checkExchangeRateHistoryClearButton **********************************************");

	  	try
	  	{
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyInExchangeRateHistory));
	  		baseCurrencyInExchangeRateHistory.click();
	  		baseCurrencyTxt.sendKeys(Keys.SPACE);
	  		
	  		int baseCurrencyComboListCount = baseCurrencyComboList.size();
	  		
	  		ArrayList<String> baseCurrencyComboListArray = new ArrayList<String>();
	  		
	  		for(int i=1;i<baseCurrencyComboListCount;i++)
	  		{
	  			String data=baseCurrencyComboList.get(i).getText();
	  			if(data.equalsIgnoreCase("INR"))
	  			{
	  				baseCurrencyComboList.get(i).click();
	  			}
	  		}
	  	
	  		baseCurrencyInExchangeRateHistory.sendKeys(Keys.TAB);
	  	

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateHistoryclearIcon));
	  		exchangeRateHistoryclearIcon.click();
	  	
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selCurrencyOne));

	  		boolean actSelectCurrencyOne     = selCurrencyOne.getText().isEmpty();
	  		boolean actSelectCurrencyTwo     = selCurrecnyTwo.getText().isEmpty();
	  		boolean actDefinedAsCurrencyOne  = defCurrecnyOne.getText().isEmpty();
	  		boolean actDefinedAsCurrencyTwo  = defCurrecnyTwo.getText().isEmpty();

	  		boolean expSelectCurrencyOne     = true;
	  		boolean expSelectCurrencyTwo     = true;
	  		boolean expDefinedAsCurrencyOne  = true;
	  		boolean expDefinedAsCurrencyTwo  = true;

	  		System.out.println("Selected Currency One Value Actual             : " + actSelectCurrencyOne+    "  Value Expected : " + expSelectCurrencyOne);
	  		System.out.println("Selected Currency Two Value Actual             : " + actSelectCurrencyTwo+    "  Value Expected : " + expSelectCurrencyTwo);
	  		System.out.println("Defined Currency One Value Actual              : " + actDefinedAsCurrencyOne+ "  Value Expected : " + expDefinedAsCurrencyOne);
	  		System.out.println("Defined Currency Two Value Actual              : " + actDefinedAsCurrencyTwo+ "  Value Expected : " + expDefinedAsCurrencyTwo);

	  		boolean actMethod = actSelectCurrencyOne == expSelectCurrencyOne && actSelectCurrencyTwo == expSelectCurrencyTwo
	  							&& actDefinedAsCurrencyOne == expDefinedAsCurrencyOne && actDefinedAsCurrencyTwo == expDefinedAsCurrencyTwo;
	  		
	  		String actResult = Boolean.toString(actMethod);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 303, 8, actResult.toUpperCase());
	  		
	  		if (actMethod==true)
	  		{
	  			 System.out.println(" Test Pass: Close Button is working");
	  			 excelReader.setCellData(xlfile, xlSheetName, 303, 9, resPass);
	  			 return true;
	  		 }
	  		 else 
	  		 {
	  			 System.out.println(" Test Fail: Close Button is not working");
	  			 excelReader.setCellData(xlfile, xlSheetName, 303, 9, resFail);
	  			 return false;
	  		 }
	  	 }
	  	 catch (Exception e) 
	  	 {
	  		 String exception =e.getMessage().substring(0, 100);
	  		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 303, 10, exception);
	  		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	  		 return false;
	  	 }
	   }

	   public static boolean checkExchangeRateHistorySelectAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("******************************************** checkExchangeRateHistorySelectAED ************************************************************");
	  		
	  	try
	  	{
	  		System.out.println("First");
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyInExchangeRateHistory));
	  		baseCurrencyInExchangeRateHistory.click();
	  		Thread.sleep(2000);
	  		baseCurrencyTxt.sendKeys(Keys.SPACE);
	  		Thread.sleep(2000);
	  		
	  		System.out.println("Second");
	  		int baseCurrencyComboListCount = baseCurrencyComboList.size();
	  		
	  		ArrayList<String> baseCurrencyComboListArray = new ArrayList<String>();
	  		
	  		for(int i=1;i<baseCurrencyComboListCount;i++)
	  		{
	  			String data=baseCurrencyComboList.get(i).getText();
	  			if(data.equalsIgnoreCase("AED"))
	  			{
	  				baseCurrencyComboList.get(i).click();
	  			}
	  		}
	  	
	  		baseCurrencyInExchangeRateHistory.sendKeys(Keys.TAB);
	  		Thread.sleep(5000);
	  		System.out.println("Three");
	  		Thread.sleep(4000);
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueUSD));
	  		

	  		String actValueAEDTOUSD        = valueUSD.getText();
	  		String actValueAEDTOINR        = valueAED.getText();
	  		String actSelectCurrencyOne    = selCurrencyOne.getText();
	  		String actSelectCurrencyTwo    = selCurrecnyTwo.getText();
	  		String actDefinedAsCurrencyOne = defCurrecnyOne.getText();
	  		String actDefinedAsCurrencyTwo = defCurrecnyTwo.getText();

	  		String expValueAEDTOUSD        = excelReader.getCellData(xlSheetName, 305, 7);
	  		String expValueAEDTOINR        = excelReader.getCellData(xlSheetName, 306, 7);
	  		String expSelectCurrencyOne    = excelReader.getCellData(xlSheetName, 307, 7);
	  		String expSelectCurrencyTwo    = excelReader.getCellData(xlSheetName, 308, 7);
	  		String expDefinedAsCurrencyOne = excelReader.getCellData(xlSheetName, 309, 7);
	  		String expDefinedAsCurrencyTwo = excelReader.getCellData(xlSheetName, 310, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 305, 8, actValueAEDTOUSD);
	  		excelReader.setCellData(xlfile, xlSheetName, 306, 8, actValueAEDTOINR);
	  		excelReader.setCellData(xlfile, xlSheetName, 307, 8, actSelectCurrencyOne);
	  		excelReader.setCellData(xlfile, xlSheetName, 308, 8, actSelectCurrencyTwo);
	  		excelReader.setCellData(xlfile, xlSheetName, 309, 8, actDefinedAsCurrencyOne);
	  		excelReader.setCellData(xlfile, xlSheetName, 310, 8, actDefinedAsCurrencyTwo);

	  		System.out.println("AED TO USD Value Actual                : " + actValueAEDTOUSD+        "  Value Expected : " + expValueAEDTOUSD);
	  		System.out.println("AED TO INR Value Actual                : " + actValueAEDTOINR+        "  Value Expected : " + expValueAEDTOINR);
	  		System.out.println("Select Currency One Value Actual       : " + actSelectCurrencyOne+    "  Value Expected : " + expSelectCurrencyOne);
	  		System.out.println("Select Currency Two Value Actual       : " + actSelectCurrencyTwo+    "  Value Expected : " + expSelectCurrencyTwo);
	  		System.out.println("Defined Currency One Value Actual      : " + actDefinedAsCurrencyOne+ "  Value Expected : " + expDefinedAsCurrencyOne);
	  		System.out.println("Defined Currency Two Value Actual      : " + actDefinedAsCurrencyTwo+ "  Value Expected : " + expDefinedAsCurrencyTwo);

	  		if (actValueAEDTOUSD.equalsIgnoreCase(expValueAEDTOUSD) && actValueAEDTOINR.equalsIgnoreCase(expValueAEDTOINR)
	  				&& actSelectCurrencyOne.equalsIgnoreCase(expSelectCurrencyOne)
	  				&& actSelectCurrencyTwo.equalsIgnoreCase(expSelectCurrencyTwo)
	  				&& actDefinedAsCurrencyOne.equalsIgnoreCase(expDefinedAsCurrencyOne)
	  				&& actDefinedAsCurrencyTwo.equalsIgnoreCase(expDefinedAsCurrencyTwo)) 
	  		{
	  			 System.out.println(" Test Pass: Close Button is working");
	  			 excelReader.setCellData(xlfile, xlSheetName, 304, 9, resPass);
	  			 return true;
	  		 }
	  		 else 
	  		 {
	  			 System.out.println(" Test Fail: Close Button is not working");
	  			 excelReader.setCellData(xlfile, xlSheetName, 304, 9, resFail);
	  			 return false;
	  		 }
	  	 }
	  	 catch (Exception e) 
	  	 {
	  		 String exception =e.getMessage().substring(0, 100);
	  		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 304, 10, exception);
	  		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		 return false;
	  	 }
	    }

	   public static boolean checkCancelOptionInExchangeRateHistory()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	   {

	  	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  	System.out.println("******************************************** checkCancelOptionInExchangeRateHistory ****************************************************");
	  	
	  	try
	  	{

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateHistoryCloseIcon));
	  		exchangeRateHistoryCloseIcon.click();
	  		//Thread.sleep(3000);

	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));

	  		boolean actLoadDashboard           = dashboardName.isDisplayed();
	  	/*	boolean actSelectDashboard         = selectDashboard.isDisplayed();*/
	  		boolean actNewDashboard            = newAddDashBoard.isDisplayed();
	  		boolean actDashboardCustomization  = dashboardCustomizationSettings.isDisplayed();

	  		boolean expLoadDashboard          = true;
	  /*		boolean expSelectDashboard        = true;*/
	  		boolean expNewDashboard           = true;
	  		boolean expDashboardCustomization = true;
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
	  		String actDashboardLabel = dashboardName.getText();
	  		String expDashboardLabel = excelReader.getCellData(xlSheetName, 312, 7);
	  		
	  		
	  		
	  		boolean actMethod = actLoadDashboard == expLoadDashboard /*&& actSelectDashboard == expSelectDashboard*/
	  							&& actNewDashboard == expNewDashboard && actDashboardCustomization == expDashboardCustomization;
	  		
	  		String actResult = Boolean.toString(actMethod);
	  		System.out.println("actMethod"+actMethod);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 311, 8, actResult.toUpperCase());
	  		excelReader.setCellData(xlfile, xlSheetName, 312, 8, actDashboardLabel);

	  		System.out.println("Load Dashbord Value Actual                          : " + actLoadDashboard+          " Value Expected : " + expLoadDashboard);
	  		/*System.out.println("Select Dashbord Value Actual                        : " + actSelectDashboard+        " Value Expected : " + expSelectDashboard);*/
	  		System.out.println("New Dashbord Value Actual                           : " + actNewDashboard+           " Value Expected : " + expNewDashboard);
	  		System.out.println("Dashbord Customization Value Actual                 : " + actDashboardCustomization+ " Value Expected : " + expDashboardCustomization);
	  		
	  		System.out.println("Load Dashbord Value Actual                          : " + actDashboardLabel+          " Value Expected : " + expDashboardLabel);

	  		if (actDashboardLabel.equalsIgnoreCase(expDashboardLabel) && actMethod==true)
	  		{
	  			System.out.println(" Test Pass: Close Button is working");
	  			excelReader.setCellData(xlfile, xlSheetName, 311, 9, resPass);
	  			return true;
	  		}
	  		else 
	  		{
	  			System.out.println(" Test Fail: Close Button is not working");
	  			excelReader.setCellData(xlfile, xlSheetName, 311, 9, resFail);
	  			return false;
	  		}
	  	}
	  	catch (Exception e) 
	  	{
	  		String exception =e.getMessage().substring(0, 100);
	  		excelReader.setExceptionInExcel(xlfile, xlSheetName, 311, 10, exception);
	  		System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	  		return false;
	  	}
	   }

	
	   
	   public boolean checkLogoutInCurrencyMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	 
	 	 try
	 	 {
 		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplayLogo));
 		  userNameDisplayLogo.click();
 		 
 		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
   	      logoutOption.click();
 		  Thread.sleep(2000);
 		  
 		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
 		  
 		  boolean actUserLoginPage              = username.isDisplayed() && username.isEnabled()
                                                  && password.isDisplayed() && password.isEnabled();
                                         
 		  boolean expUserLoginPage              = true;
 		  
 		  if(actUserLoginPage==expUserLoginPage)  
 	      {
 			System.out.println("***Test Pass: Login Successfull***");
 			excelReader.setCellData(xlfile, xlSheetName, 285, 9, resPass);
 			return true;
 		  }
 	      else
 	      {
 			System.out.println("***Test Fail: Login Not Successfull***");
 			excelReader.setCellData(xlfile, xlSheetName, 285, 9, resFail);
 			return false;
 		  }
 		}
 		catch (Exception e)
 		{
 		 	excelReader.setCellData(xlfile, xlSheetName, 285, 10, e.getMessage());	
 			return false;
 		}
	 }
	   

	   
	   
		
		
		
    public SmokeCurrencyPage(WebDriver driver)
    {
    	
   	 PageFactory.initElements(driver, this);
   	
    }
	

}

