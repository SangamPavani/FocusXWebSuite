package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.focus.base.BaseEngine;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;

public class MasterCurrencyPage extends BaseEngine 
{
	
    //Home Menu
	@FindBy (xpath="//*[@id='1']/div/span")
    public static WebElement homeMenu;
	
      //Masters Menu	
	  @FindBy (xpath="//*[@id='1000']/span")
	  public static WebElement mastersMenu;
	
        //Currency Menu
		@FindBy(xpath="//a[@id='220']//span[contains(text(),'Currency')]")
		private static WebElement currencyMenu;
		
		@FindBy(xpath="//span[contains(text(),'Currency Master')]")
		private static WebElement currencyMasterMenu;
		
		@FindBy(xpath="//a[@id='71']//span[contains(text(),'Exchange Rate')]")
		private static WebElement exchangeRateMenu;
		
		@FindBy(xpath="//span[contains(text(),'Exchange Rate History')]")
		private static WebElement exchangeRateHistoryMenu;
		
		@FindBy(xpath="//span[@class='navText']//span[contains(text(),'Currency Master')]")
		private static WebElement currencyMasterlabel;
		
		@FindBy(xpath="//*[@id='ISOCurrencyCode']")
		private static WebElement ISOCurrencyCodeTxt;
		
		
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
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/fieldset[1]/div[1]/div[2]/div[2]/input[1]")
		private static WebElement coinsNameTxt;
		
		@FindBy(xpath="//input[@id='currencyName']")
		private static WebElement currencyNameTxt;
		
		@FindBy(xpath="//input[@id='GeneralRoundOff']")
		private static WebElement generalRoundOffTxt;
		
		@FindBy(xpath="//select[@id='RoundingType']")
		private static WebElement roundingTypeDropdown;
		
		@FindBy(xpath="//input[@id='CurrencyUnit']")
		private static WebElement currencyUnitTxt;
		
		@FindBy(xpath="//input[@id='CurrencySubUnit']")
		private static WebElement currencySubUnitTxt;
		
		@FindBy(xpath="//input[@id='connector']")
		private static WebElement connectorTxt;
		
		@FindBy(xpath="//input[@id='controlSymbol']")
		private static WebElement controlSymbolDropdown;
		
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
		
			@FindBy(xpath="//span[contains(text(),'Exchange Rate Definition')]")
			private static WebElement exchangeRateDefinitionLabel;
			
			@FindBy(xpath="//i[@class='icon-font7 icon-import-from-excel']")
			private static WebElement importFromExcelIcon;
			                  
			@FindBy(xpath="//i[@class='icon-font7 icon-clear']")
			private static WebElement exchangeRateDefinitionClearIcon;
			
			@FindBy(xpath="//i[@class='icon-font7 icon-save']")
			private static WebElement exchangeRateDefinitionSaveIcon;
			                    
			@FindBy(xpath="//span[@id='btnCurrencyMasterCancel']//i[@class='icon-font7 icon-close']")
			private static WebElement exchangeRateDefinitionPopCloseIcon;
			
			@FindBy(xpath="//span[@id='closeExchangeRate']")
			private static WebElement exchangeRateDefinitionPageCloseIcon;
			
			
			@FindBy(xpath="//input[@id='id_option']")
			private static WebElement baseCurrencyTxt;
				
				@FindBy(xpath="//td[@id='id_option_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
				private static WebElement  baseCurrencySettingsBtn;
				
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
				
				@FindBy(xpath="//td[@id='EffectiveDate_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
				private static WebElement withEffectiveDateCalendarBtn;
				
				@FindBy(xpath="//select[@id='EffectiveDate_year']")
				private static WebElement withEffectiveDateYearDropDown;
				
				@FindBy(xpath="//select[@id='EffectiveDate_month']")
				private static WebElement withEffectiveDateMonthDropDown;
						
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
		
	@FindBy(xpath="//span[@id='exchange_currency']")
	private static WebElement exchangeRateIcon;
		
	@FindBy(xpath="//span[@id='clear_Currency']")
	private static WebElement clearIcon;
	
	@FindBy(xpath="//span[@id='btnSave']")
	private static WebElement saveIcon;
	
	@FindBy(xpath="//span[@id='btnClose']")
	private static WebElement cancelIcon;
	
	
	
		
		
		
		//Exchange Rate Definition-------------------------------------------------------------------------------------------
		
		//Label is Same As Above  Exchange Rate Definition
		
		//Header Fields
		
		@FindBy(xpath="//i[@class='icon-font7 icon-delete']")
		private static WebElement exchangeRateDefinitionDeleteIcon;
		
		@FindBy(xpath=" //span[@id='closeExchangeRate']//i[@class='icon-font7 icon-close']")
		private static WebElement exchangeRateDefinitionCloseIcon;
		

		
		///Exchange Rate History
		
		@FindBy(xpath="//div[@class='navText']//span[contains(text(),'Exchange Rate History')]")
		private static WebElement exchangeRateHistoryLabel;
		
		@FindBy(xpath="//input[@id='id_option']")
		private static WebElement baseCurrencyInExchangeRateHistory;
		
		@FindBy(xpath="//*[@id='DateOption']")
		private static WebElement dateOptionDropdown;
		
		@FindBy(xpath="//*[@id='FromDate']")
		private static WebElement fromDateTxt;
		
		@FindBy(xpath="//*[@id='ToDate']")
		private static WebElement toDateTxt ;
		
		@FindBy(xpath="//i[@class='icon-font7 icon-refresh']")
		private static WebElement loadIcon;
		
		@FindBy(xpath="//i[@class='icon-font7 icon-clear']")
		private static WebElement exchangeRateHistoryclearIcon;
		
		
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
		
		
		
		@FindBy(xpath="//tbody[@id='HistoryTableBody']/tr[2]/td[3]")
		private static WebElement valueUSD;
		
		@FindBy(xpath="//tbody[@id='HistoryTableBody']/tr[2]/td[4]")
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
		
		@FindBy(xpath="//i[@class='icon-font6 icon-close']")
		private static WebElement exchangeRateHistoryCloseIcon;
		
		@FindBy(xpath="//span[contains(text(),'Graph')]")
		private static WebElement graphTab;
		
		@FindBy(xpath="//span[@class='font-5'][contains(text(),'Table')]")
		private static WebElement tableTab;
		
		
		@FindBy(xpath="//td[@id='ExchangeTable_col_1-0']")
		private static WebElement selectRow;
		
		@FindBy(xpath="//div[contains(text(),'Delete Row')]")
		private static WebElement selectDeleteOption;
		
		@FindBy(xpath="//span[@id='DeleteData']")
		private static WebElement exchnageRateDeleteOption;
		
		
		//Validation Messages for all Pages
		/*@FindBy(xpath="//div[@id='idGlobalError']")
		public static WebElement validationConfirmationMessage;
		
		@FindBy(xpath="//div[@id='idGlobalError']//td[3]")
		public static WebElement closeValidationConfirmationMessage;*/
		
		
		@FindBy(xpath="//div[@class='theme_color font-6']")
		public static WebElement errorMessage;
		
		@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
		public static WebElement errorMessageCloseBtn;
		
		
		@FindBy(xpath="//*[@id='dashName']")
	    private static WebElement labelDashboard ;
		
		@FindBy(xpath="//*[@id='Select_dash']")
		private static WebElement selectDashboard ;
			
		@FindBy(xpath="//*[@id='Dashboard_AddDash']")
	    private static WebElement newAddDashBoard;
		 
	    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
        private static WebElement dashboardCustomizationSettings;
	
	  
	
		//User Name Display
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
			
		
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	private static WebElement loginRefreshOkBtn;
	
	
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
	    
	    
	private static String xlfile;
	private static String resPass="Pass";
	private static String resFail="Fail";
	private static ExcelReader excelReader;
	private static Alert alert;
	
	@FindBy(id = "ddlCompany")
	private static WebElement companyDropDownList;
	
	private static int cSize; 

	public boolean checkLoginToCheckCurrency() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
        LoginPage lp=new LoginPage(getDriver()); 
		
		String unamelt="su";
				      
		String pawslt="su";
			
		Thread.sleep(2000);
		
		lp.enterUserName(unamelt);
				
		lp.enterPassword(pawslt);
				  
		 Thread.sleep(2000);
		 
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
	     
	    /* Select s = new Select(companyDropDownList);
	     int size=s.getOptions().size();
	     
	     System.err.println("SIZE : "+size);
	     
	     for(int i=0;i<size;i++)
	     {
	    	 String data;
	    	 
	    	 data=s.getOptions().get(i).getText();
	    	 
	    	 System.err.println("DATA : "+data);
	    	 
	    	 if(data.contains("Automation Company : 29/04/2020 [060]"))
	    	 {
	    		 
	    		 s.selectByVisibleText(data);
	    		 
	    		 break;
	    	 }
	     }*/
	     
	     
	     
	     lp.clickOnSignInBtn();
		
	//	checkRefershPopOnlogin();
				        
		//checkPopUpWindow();
		
         Thread.sleep(5000);
         
         
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
				    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
				    	
		String getDashboard=labelDashboard.getText();
	   
		System.out.println("getDashboard"+getDashboard);
		
		if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ")/* && getDashboard.equalsIgnoreCase("Graph with Active and setAsDefault")*/)
		{

			System.out.println("Test Pass : Transaction Authorization is Displayed");
			excelReader.setCellData(xlfile, "Sheet6", 7, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail : Transaction Authorization is Displayed");
			excelReader.setCellData(xlfile, "Sheet6", 7, 9, resFail);
			return false;

		}
	
	}
	
	
	
		
		
	public static boolean checkOpenCurrencyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		Thread.sleep(3000);
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		     
		homeMenu.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		     
		mastersMenu.click();
		     
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMenu));
		     
		currencyMenu.click();
	         
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMasterMenu));
		     
		currencyMasterMenu.click();
		    	  
            
            
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMasterlabel));		
		     
		String actcurrencyMasterlabel=currencyMasterlabel.getText();
		String expcurrencyMasterlabel="Currency Master";
		    
		System.out.println("***********checkOpenCurrencyMenu**********************************************");
		    
		System.out.println("  currencyMasterlabel           "+actcurrencyMasterlabel +" Value Excepted  "+expcurrencyMasterlabel);
		    
		if(actcurrencyMasterlabel.equalsIgnoreCase(expcurrencyMasterlabel))
		{	
			//excelReader.setCellData(xlfile, "Sheet1", 437, 9, resPass);
			return true;
		}	 
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 437, 9, resFail);
			return false;
		}
			
 	}
	
		
	public static boolean checkFieldsInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
			
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
		     
		boolean actISOCurrencyCodeTxt         = ISOCurrencyCodeTxt.isDisplayed();
		boolean actcoinsNameTxt               = coinsNameTxt.isDisplayed();
		boolean actcurrencyNameTxt            =currencyNameTxt.isDisplayed();
		boolean actgeneralRoundOffTxt         =generalRoundOffTxt.isDisplayed();
		boolean actroundingTypeDropdown       =roundingTypeDropdown.isDisplayed();
		boolean actcontrolSymbolDropdown      =controlSymbolDropdown.isDisplayed();
		boolean actnoOfDecimalsTxt            =noOfDecimalsTxt.isDisplayed();
		boolean actexchangeRateIcon           =exchangeRateIcon.isDisplayed();
	    boolean actclearIcon                  =clearIcon.isDisplayed();
		boolean actsaveIcon                   =saveIcon.isDisplayed();
		boolean actcancelIcon                 =cancelIcon.isDisplayed();
		
		boolean expISOCurrencyCodeTxt         =true;
		boolean expcoinsNameTxt               =true;
		boolean expcurrencyNameTxt            =true;
		boolean expgeneralRoundOffTxt         =true;
		boolean exproundingTypeDropdown       =true;
		boolean expcontrolSymbolDropdown      =true;
		boolean expnoOfDecimalsTxt            =true;
		boolean expexchangeRateIcon           =true;
		boolean expclearIcon                  =true;
		boolean expsaveIcon                   =true;
		boolean expcancelIcon                 =true;
		
		
		System.out.println("****************************** checkFieldsInCurrencyMaster ********************************************");
		System.out.println("Home Page ISOCurrencyCodeTxt Value Actual           :"+actISOCurrencyCodeTxt+   "     Value Expected : "+expISOCurrencyCodeTxt);
		System.out.println("Home Page coinsNameTxt Value Actual                 :"+actcoinsNameTxt+         "     Value Expected : "+expcoinsNameTxt);
		System.out.println("Home Page currencyNameTxt Value Actual              :"+actcurrencyNameTxt+      "	 Value Expected : "+expcurrencyNameTxt);
		System.out.println("Home Page generalRoundOffTxt Value Actual           :"+actgeneralRoundOffTxt+   "	 Value Expected : "+expgeneralRoundOffTxt);
		System.out.println("Home Page roundingTypeDropdown Value Actual         :"+actroundingTypeDropdown+ "	 Value Expected : "+exproundingTypeDropdown);
		System.out.println("Home Page controlSymbolDropdown Value Actual        :"+actcontrolSymbolDropdown+"	 Value Expected : "+expcontrolSymbolDropdown);
		System.out.println("Home Page noOfDecimalsTxt Value Actual              :"+actnoOfDecimalsTxt+      "	 Value Expected : "+expnoOfDecimalsTxt);
		System.out.println("Home Page exchangeRateIcon Value Actual             :"+actexchangeRateIcon+     "	 Value Expected : "+expexchangeRateIcon);
		System.out.println("Home Page clearIcon Value Actual                    :"+actclearIcon+            "	 Value Expected : "+expclearIcon);
		System.out.println("Home Page saveIcon Value Actual                     :"+actsaveIcon+             "	 Value Expected : "+expsaveIcon);
		System.out.println("Home Page cancelIcon Value Actual                   :"+actcancelIcon+           "	 Value Expected : "+expcancelIcon);
		
		if(actISOCurrencyCodeTxt==expISOCurrencyCodeTxt  && actcoinsNameTxt==expcoinsNameTxt && actcurrencyNameTxt==expcurrencyNameTxt
				&& actgeneralRoundOffTxt==expgeneralRoundOffTxt&& actroundingTypeDropdown==exproundingTypeDropdown
			    && actcontrolSymbolDropdown==expcontrolSymbolDropdown
				&& actnoOfDecimalsTxt==expnoOfDecimalsTxt&& actexchangeRateIcon==expexchangeRateIcon&& actclearIcon==expclearIcon
				&& actsaveIcon==expsaveIcon&& actcancelIcon==expcancelIcon)

		 {	
				excelReader.setCellData(xlfile, "Sheet1", 438, 9, resPass);
				return true;
		  }	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 438, 9, resFail);
			 return false;
		}
     }

	
	public static boolean checkSaveWithBlankInputInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
			
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveIcon));
			
		saveIcon.click();
			
		System.out.println("*************************************checkSaveWithBlankInputInCurrencyMaster**********************************");
		
		String expMessage="Enter mandatory field";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		 {	
			excelReader.setCellData(xlfile, "Sheet1", 439, 9, resPass);
			return true;
		  }	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 439, 9, resFail);
			 return false;
		}
		
     }
		
		
	public static boolean checkSaveISOCurrencyCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
			
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
		
		ISOCurrencyCodeTxt.click();
		
		ISOCurrencyCodeTxt.sendKeys("SLL");
		
		Thread.sleep(3000);  
		
		ISOCurrencyCodeTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(coinsNameTxt));
		coinsNameTxt.click();
		
		coinsNameTxt.sendKeys("SLL");
		
		getAction().moveToElement(coinsNameTxt).sendKeys(Keys.TAB).perform();		
				    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveIcon));
	
		saveIcon.click();
	  
		System.out.println("*********************checkSaveISOCurrencyCode******************************************");
		
		String expMessage="Data saved successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 440, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 440, 9, resFail);
			 return false;
		}
		
     }
	
	
		
		
	public static boolean checkExchangeRateTitleOnClickOnExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
			
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			    	  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateIcon));
		exchangeRateIcon.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionLabel));
			
		String actexchangeRateDefinitionLabel=exchangeRateDefinitionLabel.getText();
		String expexchangeRateDefinitionLabel="Exchange Rate Definition";
		
		System.out.println("***************checkExchangeRateTitleOnClickOnExchangeRateOptionInCurrencyMaster********************");
		
		System.out.println("exchangeRateDefinitionLabel    :"+actexchangeRateDefinitionLabel +" Value Excepted  :"+expexchangeRateDefinitionLabel);
		
		if(actexchangeRateDefinitionLabel.equalsIgnoreCase(expexchangeRateDefinitionLabel))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 441, 9, resPass);
			return true;
		}	 
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 441, 9, resFail);
			return false;
		}
	}
	
		
		
	public static boolean checkExchangeRateFieldsOnClickOnExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFromExcelIcon));
		
		
		boolean actimportFromExcelIcon                    = importFromExcelIcon.isDisplayed();
		boolean actexchangeRateDefinitionClearIcon        = exchangeRateDefinitionClearIcon.isDisplayed();
		boolean actexchangeRateDefinitionSaveIcon         = exchangeRateDefinitionSaveIcon.isDisplayed();
		boolean actexchangeRateDefinitionPopCloseIcon     = exchangeRateDefinitionPopCloseIcon.isDisplayed();
		
		
		boolean expimportFromExcelIcon                   = true;
		boolean expexchangeRateDefinitionClearIcon       = true;
		boolean expexchangeRateDefinitionSaveIcon        = true;
		boolean expexchangeRateDefinitionPopCloseIcon    = true;
		
		System.out.println("********************* checkExchangeRateFieldsOnClickOnExchangeRateOptionInCurrencyMaster ******************");
	
		System.out.println("Home Page importFromExcelIcon Value Actual                   :"+actimportFromExcelIcon+               "  Value Expected : "+expimportFromExcelIcon);
		System.out.println("Home Page exchangeRateDefinitionClearIcon Value Actual       :"+actexchangeRateDefinitionClearIcon+   "  Value Expected : "+expexchangeRateDefinitionClearIcon);
		System.out.println("Home Page exchangeRateDefinitionSaveIconValue Actual         :"+actexchangeRateDefinitionSaveIcon+    "	 Value Expected : "+expexchangeRateDefinitionSaveIcon);
		System.out.println("Home PageexchangeRateDefinitionPopCloseIconValue Actual      :"+actexchangeRateDefinitionPopCloseIcon+"	 Value Expected : "+expexchangeRateDefinitionPopCloseIcon);
		
		if( actimportFromExcelIcon==expimportFromExcelIcon  && actexchangeRateDefinitionClearIcon==expexchangeRateDefinitionClearIcon 
				&& actexchangeRateDefinitionSaveIcon==expexchangeRateDefinitionSaveIcon && actexchangeRateDefinitionPopCloseIcon==expexchangeRateDefinitionPopCloseIcon )
		
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 442, 9, resPass);
				return true;
		  }	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 442, 9, resFail);
			 return false;
		}
		
     }

		
		
	public static boolean checkSaveWithBlankInputInExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("**********************checkSaveWithBlankInputInExchangeRateOptionInCurrencyMaster**********************");
		
		String expMessage="Currency cannot be blank.";
		
		String actMessage=checkValidationMessage(expMessage);
	     
		if(actMessage.equalsIgnoreCase(expMessage))
		 {	
			excelReader.setCellData(xlfile, "Sheet1", 443, 9, resPass);
			return true;
		  }	 
		else
		{    
	        
	         excelReader.setCellData(xlfile, "Sheet1", 443, 9, resFail);
			 
			 return false;
		}
		
     }
	
		
	@FindBy(xpath="//*[@id='id_option_table_data_body']/tr/td")
    private static List<WebElement> baseCurrencyListCount;
	
	
	@FindBy(xpath="//*[@id='ExchangeTable_CurrencyName_table_data_body']/tr/td")
    private static List<WebElement> currencyNameListCount;
	
	@FindBy(xpath="//*[@id='ExchangeTable_DefinedAs_table_data_body']/tr/td")
    private static List<WebElement> definedAsListCount;
		
		
		
	public static boolean checkSaveInExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		
		baseCurrencyTxt.click();
		
		baseCurrencyTxt.sendKeys("i");
		
		int baseCurrencyCount=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount);
			
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
			
			System.err.println(data);
			
			if(data.equalsIgnoreCase("INR"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
		
        gridcurrencyName1Txt.click();
		
        gridcurrencyName1Txt.sendKeys("u");
		
		int gridcurrencyNameCount=currencyNameListCount.size();
			
		System.err.println(gridcurrencyNameCount);
			
		for(int i=0 ; i < gridcurrencyNameCount ;i++)
		{
			String data=currencyNameListCount.get(i).getText();
			
			System.err.println(data);
			
			if(data.equalsIgnoreCase("USD"))
			{
				currencyNameListCount.get(i).click();
					
				break;
			}
		}	
				
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
		
		
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
			
		gridDefineAsTxt.click();
			
		gridDefineAsTxt.sendKeys("i");
			
		int gridDefinedAsCount=definedAsListCount.size();
				
		System.err.println(gridDefinedAsCount);
				
		for(int i=0 ; i < gridDefinedAsCount ;i++)
		{
			String data=definedAsListCount.get(i).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("INR"))
			{
				definedAsListCount.get(i).click();
						
				break;
			}
		}	
					
		gridDefineAsTxt.sendKeys(Keys.TAB);
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		gridRateTxt.sendKeys("70");
		gridRateTxt.sendKeys(Keys.TAB);
		
     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("***************checkSaveInExchangeRateOptionInCurrencyMaster***************");
		
		
		String expMessage="Exchange Rate saved successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
	     
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
		    Thread.sleep(3000);
		    
			excelReader.setCellData(xlfile, "Sheet1", 444, 9, resPass);
			return true;
		}	 
		else
		{    
	         Thread.sleep(3000);
	         excelReader.setCellData(xlfile, "Sheet1", 444, 9, resFail);
			 
			 return false;
		}	     
	}
	
		
		
	public static boolean checkUpdateExchangeRateOfCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		
		baseCurrencyTxt.click();
		
		baseCurrencyTxt.sendKeys("i");
		
		int baseCurrencyCount=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount);
			
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
				
			if(data.equalsIgnoreCase("INR"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
		
		gridcurrencyName1Txt.click();
		
		System.out.println(gridcurrencyName1Txt.getText());
		
		Thread.sleep(2000);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		
		System.out.println("**************************checkUpdateExchangeRateOfCurrencyMaster**********************");
		
		String expMessage="Exchange Rate updated successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
			
			baseCurrencyTxt.click();
			excelReader.setCellData(xlfile, "Sheet1", 445, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 445, 9, resFail);
			 return false;
		}	     
	}

		
	public static boolean checkClearOptionInExchangeRateOfCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		
		baseCurrencyTxt.click();
		
		baseCurrencyTxt.sendKeys("i");
		
		int baseCurrencyCount=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount);
			
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
				
			if(data.equalsIgnoreCase("INR"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
		
		gridcurrencyName1Txt.click();
		
		Thread.sleep(3000);
		
		System.out.println(gridcurrencyName1Txt.getText());
		
	     
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionClearIcon));
		
		exchangeRateDefinitionClearIcon.click();
		
		Thread.sleep(2000);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("*********************checkClearOptionInExchangeRateOfCurrencyMaster*************************");
		
		String expMessage="Currency cannot be blank.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		 {	
			excelReader.setCellData(xlfile, "Sheet1", 446, 9, resPass);
			return true;
		  }	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 446, 9, resFail);
			 return false;
		}
	}

		
		
		
	public static boolean checkCancelButtonInExchangeRateOfCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionPopCloseIcon));
		
		exchangeRateDefinitionPopCloseIcon.click();
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
	     
		boolean actISOCurrencyCodeTxt         = ISOCurrencyCodeTxt.isDisplayed();
		boolean actcoinsNameTxt               = coinsNameTxt.isDisplayed();
		boolean actcurrencyNameTxt            =currencyNameTxt.isDisplayed();
		boolean actgeneralRoundOffTxt         =generalRoundOffTxt.isDisplayed();
		boolean actroundingTypeDropdown       =roundingTypeDropdown.isDisplayed();
		boolean actcontrolSymbolDropdown      =controlSymbolDropdown.isDisplayed();
		boolean actnoOfDecimalsTxt            =noOfDecimalsTxt.isDisplayed();
		boolean actexchangeRateIcon           =exchangeRateIcon.isDisplayed();
		boolean actclearIcon                  =clearIcon.isDisplayed();
		boolean actsaveIcon                   =saveIcon.isDisplayed();
		boolean actcancelIcon                 =cancelIcon.isDisplayed();
		
		boolean expISOCurrencyCodeTxt         =true;
		boolean expcoinsNameTxt               =true;
		boolean expcurrencyNameTxt            =true;
		boolean expgeneralRoundOffTxt         =true;
		boolean exproundingTypeDropdown       =true;
		boolean expcontrolSymbolDropdown      =true;
		boolean expnoOfDecimalsTxt            =true;
		boolean expexchangeRateIcon           =true;
		boolean expclearIcon                  =true;
		boolean expsaveIcon                   =true;
		boolean expcancelIcon                 =true;
		
		System.out.println("****************************** checkCancelButtonInExchangeRateOfCurrencyMaster********************************************");
		
		System.out.println("Home Page ISOCurrencyCodeTxt Value Actual           :"+actISOCurrencyCodeTxt+   "     Value Expected : "+expISOCurrencyCodeTxt);
		System.out.println("Home Page coinsNameTxt Value Actual                 :"+actcoinsNameTxt+         "     Value Expected : "+expcoinsNameTxt);
		System.out.println("Home Page currencyNameTxt Value Actual              :"+actcurrencyNameTxt+      "	 Value Expected : "+expcurrencyNameTxt);
		System.out.println("Home Page generalRoundOffTxt Value Actual           :"+actgeneralRoundOffTxt+   "	 Value Expected : "+expgeneralRoundOffTxt);
		System.out.println("Home Page roundingTypeDropdown Value Actual         :"+actroundingTypeDropdown+ "	 Value Expected : "+exproundingTypeDropdown);
		System.out.println("Home Page controlSymbolDropdown Value Actual        :"+actcontrolSymbolDropdown+"	 Value Expected : "+expcontrolSymbolDropdown);
		System.out.println("Home Page noOfDecimalsTxt Value Actual              :"+actnoOfDecimalsTxt+      "	 Value Expected : "+expnoOfDecimalsTxt);
		System.out.println("Home Page exchangeRateIcon Value Actual             :"+actexchangeRateIcon+     "	 Value Expected : "+expexchangeRateIcon);
		System.out.println("Home Page clearIcon Value Actual                    :"+actclearIcon+            "	 Value Expected : "+expclearIcon);
		System.out.println("Home Page saveIcon Value Actual                     :"+actsaveIcon+             "	 Value Expected : "+expsaveIcon);
		System.out.println("Home Page cancelIcon Value Actual                   :"+actcancelIcon+           "	 Value Expected : "+expcancelIcon);
		
		if(actISOCurrencyCodeTxt==expISOCurrencyCodeTxt  && actcoinsNameTxt==expcoinsNameTxt && actcurrencyNameTxt==expcurrencyNameTxt
				&& actgeneralRoundOffTxt==expgeneralRoundOffTxt&& actroundingTypeDropdown==exproundingTypeDropdown
			    && actcontrolSymbolDropdown==expcontrolSymbolDropdown
				&& actnoOfDecimalsTxt==expnoOfDecimalsTxt&& actexchangeRateIcon==expexchangeRateIcon&& actclearIcon==expclearIcon
				&& actsaveIcon==expsaveIcon&& actcancelIcon==expcancelIcon)
		{	
			excelReader.setCellData(xlfile, "Sheet1", 447, 9, resPass);
			return true;
	    } 	 
	    else
	    {
			 excelReader.setCellData(xlfile, "Sheet1", 447, 9, resFail);
			 return false;
		}
		
     }
	
	
	
	public static boolean checkClearOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
		   
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ISOCurrencyCodeTxt));
		
		ISOCurrencyCodeTxt.click();
		
		ISOCurrencyCodeTxt.sendKeys("SAR");
		Thread.sleep(3000);  
		
		getAction().moveToElement(ISOCurrencyCodeTxt).sendKeys(Keys.TAB).perform();
			    
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearIcon));
		
        clearIcon.click();
        
    	Thread.sleep(3000);
    	
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveIcon));
        
		saveIcon.click();
		
		System.out.println("********************checkClearOptionInCurrencyMaster*****************************");
		
		
		String expMessage="Enter mandatory field";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		 {	
			excelReader.setCellData(xlfile, "Sheet1", 448, 9, resPass);
			return true;
		  }	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 448, 9, resFail);
			 return false;
		}
		
	}
	


		
		
	public static boolean checkCancelOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelIcon));
		cancelIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
		
		boolean actlabelDashboard                 = labelDashboard.isDisplayed();
		boolean actselectDashboard                = selectDashboard.isDisplayed();
		boolean actnewAddDashBoard                = newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings = dashboardCustomizationSettings.isDisplayed();
		
		
		boolean explabelDashboard                 = true;
		boolean expselectDashboard                = true;
		boolean expnewAddDashBoard                = true;
		boolean expdashboardCustomizationSettings = true;
		
		System.out.println("********************* checkCancelOptionInCurrencyMaster ******************");
	
		System.out.println("Home Page labelDashboard Value Actual                      :"+actlabelDashboard+               "  Value Expected : "+explabelDashboard);
		System.out.println("Home Page selectDashboard Value Actual                     :"+actselectDashboard+   "  Value Expected : "+expselectDashboard);
		System.out.println("Home Page newAddDashBoard Actual                           :"+actnewAddDashBoard+    "	 Value Expected : "+expnewAddDashBoard);
		System.out.println("Home Page dashboardCustomizationSettings Value Actual      :"+actdashboardCustomizationSettings+"	 Value Expected : "+expdashboardCustomizationSettings);
		
		if( actlabelDashboard==explabelDashboard  && actselectDashboard==expselectDashboard
				&& actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings)
		
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 449, 9, resPass);
				return true;
		  }	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 449, 9, resFail);
			 return false;
		}
		
     }
	
		
		
		
		
		//Exchange Rate Page
		
		
	public static boolean checkOpenExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	     
	    homeMenu.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	     
	    mastersMenu.click();
	     
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMenu));
	     
        currencyMenu.click();
         
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateMenu));
	     
        exchangeRateMenu.click();
        
        Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionLabel));
		
		String actexchangeRateDefinitionLabel=exchangeRateDefinitionLabel.getText();
		String expexchangeRateDefinitionLabel="Exchange Rate Definition";
		
		System.out.println("*********************************checkOpenExchangeRate************************************");
		
		System.out.println("     exchangeRateDefinitionLabel  : "+actexchangeRateDefinitionLabel +" Value Excepted  "+expexchangeRateDefinitionLabel);
		
		if(actexchangeRateDefinitionLabel.equalsIgnoreCase(expexchangeRateDefinitionLabel))
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 450, 9, resPass);
				return true;
		  }	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 450, 9, resFail);
			 return false;
		}
     }
	
		
		
	public static boolean checkExchangeRateMenuFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importFromExcelIcon));
		
		boolean actimportFromExcelIcon                     = importFromExcelIcon.isDisplayed();
		boolean actexchangeRateDefinitionClearIcon         = exchangeRateDefinitionClearIcon.isDisplayed();
		boolean actexchangeRateDefinitionSaveIcon          = exchangeRateDefinitionSaveIcon.isDisplayed();
		boolean actexchangeRateDefinitionPageCloseIcon     = exchangeRateDefinitionPageCloseIcon.isDisplayed();
		boolean actexchnageRateDeleteOption                = exchnageRateDeleteOption.isDisplayed();
		
		boolean expimportFromExcelIcon                     = true;
		boolean expexchangeRateDefinitionClearIcon         = true;
		boolean expexchangeRateDefinitionSaveIcon          = true;
		boolean expexchangeRateDefinitionPageCloseIcon     = true;
		boolean expexchnageRateDeleteOption                = true ;
		
		System.out.println("********************* checkExchangeRateMenuFields************************************");
	
		System.out.println("Home Page importFromExcelIcon Value Actual                     :"+actimportFromExcelIcon+                "  Value Expected : "+expimportFromExcelIcon);
		System.out.println("Home Page exchangeRateDefinitionClearIcon Value Actual         :"+actexchangeRateDefinitionClearIcon+    "  Value Expected : "+expexchangeRateDefinitionClearIcon);
		System.out.println("Home Page exchangeRateDefinitionSaveIcon Actual                :"+actexchangeRateDefinitionSaveIcon+     "	Value Expected : "+expexchangeRateDefinitionSaveIcon);
		System.out.println("Home Page exchangeRateDefinitionPageCloseIcon Value Actual     :"+actexchangeRateDefinitionPageCloseIcon+"	Value Expected : "+expexchangeRateDefinitionPageCloseIcon);
		System.out.println("Home page exchnageRateDeleteOption Value Actual                :"+actexchnageRateDeleteOption+           "  Value Expected : "+expexchnageRateDeleteOption);
		
		if( actimportFromExcelIcon==expimportFromExcelIcon && actexchangeRateDefinitionClearIcon==expexchangeRateDefinitionClearIcon
				&& actexchangeRateDefinitionSaveIcon==expexchangeRateDefinitionSaveIcon && actexchangeRateDefinitionPageCloseIcon==expexchangeRateDefinitionPageCloseIcon && 
				actexchnageRateDeleteOption==expexchnageRateDeleteOption)
		
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 451, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 451, 9, resFail);
			 return false;
		 }
	
      }
	
	
	public static boolean checkSaveButtonWithoutInputMandatoryFieldsInCurrencyExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("****************************checkSaveButtonWithoutInputMandatoryFieldsInCurrencyExchangeRate****************************");
		
		String expMessage="Currency cannot be blank.";
		
		String actMessage=checkValidationMessage(expMessage);
	     
		if(actMessage.equalsIgnoreCase(expMessage))
		 {	
			excelReader.setCellData(xlfile, "Sheet1", 452, 9, resPass);
			return true;
		  }	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 452, 9, resFail);
			 return false;
		}
		
     }
	
	
	public static boolean checkCurrencyExchnageRateSavedInformationDisplayExchnageRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		
		baseCurrencyTxt.click();
		
		baseCurrencyTxt.sendKeys("i");
		
		int baseCurrencyCount=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount);
			
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
				
			if(data.equalsIgnoreCase("INR"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
		
		gridcurrencyName1Txt.click();
		
		
		System.out.println(gridcurrencyName1Txt.getText());
		
	     
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("**************************checkCurrencyExchnageRateSavedInformationDisplayExchnageRate**********************");
		
		String expMessage="Exchange Rate updated successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
	     
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
			
			excelReader.setCellData(xlfile, "Sheet1", 453, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 453, 9, resFail);
			 return false;
		}	     
		
     }
		
		
		
		
		
		
	public static boolean checkSaveExchangeRateUSDCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		
		baseCurrencyTxt.click();
		
		baseCurrencyTxt.sendKeys("U");
		
		int baseCurrencyCount=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount);
			
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
				
			if(data.equalsIgnoreCase("USD"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
			
        gridcurrencyName1Txt.click();
			
        gridcurrencyName1Txt.sendKeys("i");
			
		int gridcurrencyNameCount=currencyNameListCount.size();
				
		System.err.println(gridcurrencyNameCount);
				
		for(int i=0 ; i < gridcurrencyNameCount ;i++)
		{
			String data=currencyNameListCount.get(i).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("INR"))
			{
				currencyNameListCount.get(i).click();
						
				break;
			}
		}	
					
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
			
	    gridDefineAsTxt.click();
				
		gridDefineAsTxt.sendKeys("U");
				
 		int gridDefinedAsCount=definedAsListCount.size();
					
		System.err.println(gridDefinedAsCount);
					
		for(int i=0 ; i < gridDefinedAsCount ;i++)
		{
			String data=definedAsListCount.get(i).getText();
					
			System.err.println(data);
					
			if(data.equalsIgnoreCase("USD"))
			{
					definedAsListCount.get(i).click();
							
					break;
				}
			}	
						
		gridDefineAsTxt.sendKeys(Keys.TAB);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("0.01");
	
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
		
		
		//Second row data
		
        
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
			
        gridcurrencyName1Txt.click();
			
        gridcurrencyName1Txt.sendKeys("A");
			
		int gridcurrencyNameCount1=currencyNameListCount.size();
			
		System.err.println(gridcurrencyNameCount1);
				
		for(int i=0 ; i < gridcurrencyNameCount1 ;i++)
		{
			String data=currencyNameListCount.get(i).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("AED"))
			{
				currencyNameListCount.get(i).click();
						
				break;
			}
		}	
					
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
			
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
			
    	gridDefineAsTxt.click();
			
		gridDefineAsTxt.sendKeys("U");
				
		int gridDefinedAsCount1=definedAsListCount.size();
					
		System.err.println(gridDefinedAsCount1);
					
		for(int i=0 ; i < gridDefinedAsCount ;i++)
		{
			String data=definedAsListCount.get(i).getText();
					
			System.err.println(data);
					
			if(data.equalsIgnoreCase("USD"))
			{
				definedAsListCount.get(i).click();
							
				break;
				}
			}	
						
		gridDefineAsTxt.sendKeys(Keys.TAB);
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("0.23");
		Thread.sleep(3000);
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
		
		Thread.sleep(3000);
     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("*********************************checkSaveExchangeRateUSDCurrency************************************");
		
		String expMessage="Exchange Rate saved successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
	     
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 454, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 454, 9, resFail);
			 return false;
		}	     
	}
		
	public static boolean checkUpdateExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		
		baseCurrencyTxt.click();
		
		baseCurrencyTxt.sendKeys("i");
		
		int baseCurrencyCount=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount);
			
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
				
			if(data.equalsIgnoreCase("INR"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
		
		
		getAction().moveToElement(gridcurrencyName1Txt).sendKeys(Keys.TAB).perform();
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
		
		
		getAction().moveToElement(gridDefineAsTxt).sendKeys(Keys.TAB).perform();
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
	
		
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
		
		
		
		//Second row data
		
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
		
        gridcurrencyName1Txt.click();
		
        gridcurrencyName1Txt.sendKeys("A");
		
		int gridcurrencyNameCount=currencyNameListCount.size();
			
		System.err.println(gridcurrencyNameCount);
			
		for(int i=0 ; i < gridcurrencyNameCount ;i++)
		{
			String data=currencyNameListCount.get(i).getText();
			
			System.err.println(data);
			
			if(data.equalsIgnoreCase("AED"))
			{
				currencyNameListCount.get(i).click();
					
				break;
			}
		}	
				
		gridcurrencyName1Txt.sendKeys(Keys.TAB);

		

	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
			
	  gridDefineAsTxt.click();
			
	  gridDefineAsTxt.sendKeys("i");
			
	  int gridDefinedAsCount=definedAsListCount.size();
				
      System.err.println(gridDefinedAsCount);
				
      for(int i=0 ; i < gridDefinedAsCount ;i++)
		{
			String data=definedAsListCount.get(i).getText();
			
			System.err.println(data);
			
		if(data.equalsIgnoreCase("INR"))
		{
			definedAsListCount.get(i).click();
					
			break;
		}
	   }	
					
		gridDefineAsTxt.sendKeys(Keys.TAB);
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("14");
		
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
		
	
     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("*************************checkUpdateExchangeRate*************************");
		
		String expMessage="Exchange Rate updated successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
	     
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 455, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 455, 9, resFail);
			 return false;
		}	     
	}
	
	
	
		
	public static boolean checkSaveAEDExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		
		baseCurrencyTxt.click();
		
		baseCurrencyTxt.sendKeys("A");
		
		int baseCurrencyCount=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount);
			
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
				
			if(data.equalsIgnoreCase("AED"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
			
		gridcurrencyName1Txt.click();
			
		gridcurrencyName1Txt.sendKeys("i");
			
		int gridcurrencyNameCount=currencyNameListCount.size();
				
		System.err.println(gridcurrencyNameCount);
				
		for(int i=0 ; i < gridcurrencyNameCount ;i++)
		{
			String data=currencyNameListCount.get(i).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("INR"))
			{
				currencyNameListCount.get(i).click();
						
				break;
			}
		}	
					
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
				
		gridDefineAsTxt.click();
				
		gridDefineAsTxt.sendKeys("A");
				
		int gridDefinedAsCount=definedAsListCount.size();
					
		System.err.println(gridDefinedAsCount);
					
		for(int i=0 ; i < gridDefinedAsCount ;i++)
		{
			String data=definedAsListCount.get(i).getText();
					
			System.err.println(data);
					
			if(data.equalsIgnoreCase("AED"))
			{
				definedAsListCount.get(i).click();
							
				break;
			}
		}	
						
		gridDefineAsTxt.sendKeys(Keys.TAB);
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("0.07");
		
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
		
		
		//Second row data
		
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
			
        gridcurrencyName1Txt.click();
			
        gridcurrencyName1Txt.sendKeys("u");
			
		int gridcurrencyNameCount1=currencyNameListCount.size();
				
		System.err.println(gridcurrencyNameCount1);
				
		for(int i=0 ; i < gridcurrencyNameCount1 ;i++)
		{
			String data=currencyNameListCount.get(i).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("USD"))
			{
				currencyNameListCount.get(i).click();
						
				break;
			}
		}	
					
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
				
		gridDefineAsTxt.click();
				
		gridDefineAsTxt.sendKeys("A");
				
		int gridDefinedAsCount1=definedAsListCount.size();
					
		System.err.println(gridDefinedAsCount1);
					
		for(int i=0 ; i < gridDefinedAsCount1 ;i++)
		{
			String data=definedAsListCount.get(i).getText();
					
			System.err.println(data);
					
			if(data.equalsIgnoreCase("AED"))
			{
					definedAsListCount.get(i).click();
							
					break;
				}
			}	
						
		gridDefineAsTxt.sendKeys(Keys.TAB);
			

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("4.28");
		 
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
		
		Thread.sleep(2000);
		
     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("********************************checkSaveAEDExchangeRate**********************");
		
		String expMessage="Exchange Rate saved successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 456, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 456, 9, resFail);
			 return false;
		}	     
	}
	
		
	public static boolean checkClearOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
			
		baseCurrencyTxt.click();
			
		baseCurrencyTxt.sendKeys("A");
			
		int baseCurrencyCount=baseCurrencyListCount.size();
				
		System.err.println(baseCurrencyCount);
				
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
					
			if(data.equalsIgnoreCase("AED"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
					
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
		
		gridcurrencyName1Txt.click();
		
		
		System.out.println(gridcurrencyName1Txt.getText());
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionClearIcon));
		
		exchangeRateDefinitionClearIcon.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("**************************checkClearOptionInExchangeRate****************************");
		
		String expMessage="Currency cannot be blank.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		 {	
			excelReader.setCellData(xlfile, "Sheet1", 457, 9, resPass);
			return true;
		  }	 
		else
		{    
			excelReader.setCellData(xlfile, "Sheet1", 457, 9, resFail);
			return false;
		}
	}

	
	
	public static boolean checkRowDeleteFieldInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
			
		baseCurrencyTxt.click();
			
		baseCurrencyTxt.sendKeys("s");
			
		int baseCurrencyCount=baseCurrencyListCount.size();
				
		System.err.println(baseCurrencyCount);
				
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
					
			if(data.equalsIgnoreCase("SGD"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
					
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();			
		

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
		
        gridcurrencyName1Txt.click();
		
        gridcurrencyName1Txt.sendKeys("I");
		
		int gridcurrencyNameCount=currencyNameListCount.size();
			
		System.err.println(gridcurrencyNameCount);
			
		for(int i=0 ; i < gridcurrencyNameCount ;i++)
		{
			String data=currencyNameListCount.get(i).getText();
			
			System.err.println(data);
			
			if(data.equalsIgnoreCase("INR"))
			{
				currencyNameListCount.get(i).click();
					
				break;
			}
		}	
				
		gridcurrencyName1Txt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
		
	    gridDefineAsTxt.click();
			
		gridDefineAsTxt.sendKeys("S");
			
		int gridDefinedAsCount=definedAsListCount.size();
				
		System.err.println(gridDefinedAsCount);
				
		for(int i=0 ; i < gridDefinedAsCount ;i++)
		{
			String data=definedAsListCount.get(i).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("SGD"))
			{
				definedAsListCount.get(i).click();
						
				break;
			}
		}	
					
		gridDefineAsTxt.sendKeys(Keys.TAB);
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("20");
		
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
			
     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();			
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		
        errorMessageCloseBtn.click();
		
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		
		baseCurrencyTxt.click();
		
		baseCurrencyTxt.sendKeys("S");
		
		int baseCurrencyCount1=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount1);
			
		for(int i=0 ; i < baseCurrencyCount1 ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
			
			System.err.println(data);
			
			if(data.equalsIgnoreCase("SGD"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		  
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRow));
		
		selectRow.click();	
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectDeleteOption));
			
		
		boolean actselectDeleteOption=selectDeleteOption.isDisplayed();
		boolean expselectDeleteOption=true;
		
		System.out.println("*****************************checkRowDeleteFieldInExchangeRate*********************");
		
		System.err.println("selectDeleteOption    "+actselectDeleteOption  +" Value Excepted  :"+expselectDeleteOption);
		
		if(actselectDeleteOption==expselectDeleteOption)
		{	

			excelReader.setCellData(xlfile, "Sheet1", 458, 9, resPass);
			return true;
		}	 
		else
		{   
			 excelReader.setCellData(xlfile, "Sheet1", 458, 9, resFail);
			 return false;
		}	     
	}
	
	
	
	public static boolean checkRowDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
		
		
		String getExpectedDeleteRowMsg="Are you sure that you want to delete this row?";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectDeleteOption));
		
		selectDeleteOption.click();
		

		 MasterCurrencyPage.getDriver().switchTo().alert();
	     
	     String actCompanySaveMsg=MasterCurrencyPage.getDriver().switchTo().alert().getText();
	     
	     
	     System.out.println("*****************************checkRowDeleteOptionInExchangeRate******************************");
	     
	     
	     System.out.println("Company message is displaying as "+ getExpectedDeleteRowMsg);
	     
	     System.out.println("Company message is displaying as "+ actCompanySaveMsg);
	     
	     if(getExpectedDeleteRowMsg.equalsIgnoreCase(actCompanySaveMsg))
	     {
	    	
	    	 //LoginPageCompanyCreationPage.getAlert().accept();
	    	 excelReader.setCellData(xlfile, "Sheet1", 459, 9, resPass);
	    	 return true;
	     }
	     else
	     {
	    	 excelReader.setCellData(xlfile, "Sheet1", 459, 9, resFail);
	    	 return false;
	     }
		
		
		
	}
	
	
	
	public static boolean checkNoRowDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		getDriver().switchTo().alert().dismiss();
		
		Thread.sleep(2000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("********************************checkNoRowDeleteOptionInExchangeRate**************************************");
		
		
		String expMessage="Exchange Rate updated successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 460, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 460, 9, resFail);
			 return false;
		}	    
		
		
		
	}
	
	
	
	public static boolean checkYesRowDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		    	  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionClearIcon));
		
		exchangeRateDefinitionClearIcon.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
			
		baseCurrencyTxt.click();
			
		baseCurrencyTxt.sendKeys("S");
			
		int baseCurrencyCount=baseCurrencyListCount.size();
				
		System.err.println(baseCurrencyCount);
				
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
					
			if(data.equalsIgnoreCase("SGD"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
					
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRow));
		
		selectRow.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectDeleteOption));
		
		selectDeleteOption.click();
		
		
		MasterCurrencyPage.getDriver().switchTo().alert();

		getDriver().switchTo().alert().accept();
		
		    	  
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("***************************checkYesRowDeleteOptionInExchangeRate***********************************");
		
		String expMessage="enter proper body data";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 461, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 461, 9, resFail);
			 return false;
		}	    
		
		
		
	}
	
	
	
	public static boolean checkDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	  
		String getExpectedDeleteRowMsg="Are you sure that you want to delete all rows";
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionClearIcon));
			
		exchangeRateDefinitionClearIcon.click();
			
		Thread.sleep(3000);
			
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
				
		baseCurrencyTxt.click();
				
		baseCurrencyTxt.sendKeys("S");
				
		int baseCurrencyCount=baseCurrencyListCount.size();
					
		System.err.println(baseCurrencyCount);
					
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
						
			if(data.equalsIgnoreCase("SGD"))
			{
				baseCurrencyListCount.get(i).click();
						
				break;
			}
		}	
						
		baseCurrencyTxt.sendKeys(Keys.TAB);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchnageRateDeleteOption));
		
		exchnageRateDeleteOption.click();
		
		 getWaitForAlert();
		
		 MasterCurrencyPage.getDriver().switchTo().alert();
	     
	     String actCompanySaveMsg=MasterCurrencyPage.getDriver().switchTo().alert().getText();
	     
	     System.out.println("*******************************checkDeleteOptionInExchangeRate********************************");
	     
	     System.out.println("Company message is displaying as "+ actCompanySaveMsg);
	     
	     if(getExpectedDeleteRowMsg.equalsIgnoreCase(actCompanySaveMsg))
	     {
	    	 excelReader.setCellData(xlfile, "Sheet1", 462, 9, resPass);
	    	 return true;
	     }
	     else
	     {
	    	 excelReader.setCellData(xlfile, "Sheet1", 462, 9, resFail);
	    	 return false;
	     }
		
		
		
	}
	
	
	
	public static boolean checkNoOptionForDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getWaitForAlert();
		
		
		getDriver().switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		    	  
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		System.out.println("*******************************checkNoOptionForDeleteOptionInExchangeRate***********************************");
		
		String expMessage="Exchange Rate updated successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 463, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 463, 9, resFail);
			 return false;
		}	    
		
		
		
	}
	
	
	

	
	public static boolean checkYesOptionForDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionClearIcon));
		
		exchangeRateDefinitionClearIcon.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
			
		baseCurrencyTxt.click();
			
		baseCurrencyTxt.sendKeys("S");
			
		int baseCurrencyCount=baseCurrencyListCount.size();
				
		System.err.println(baseCurrencyCount);
				
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
					
			if(data.equalsIgnoreCase("SGD"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
					
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchnageRateDeleteOption));
		
		exchnageRateDeleteOption.click();
		
		MasterCurrencyPage.getDriver().switchTo().alert();

		getDriver().switchTo().alert().accept();
		
		System.out.println("*********************************checkYesOptionForDeleteOptionInExchangeRate**************************");
		 
	    String expMessage="Exchange Rate deleted successfully.";
		
	    String actMessage=checkValidationMessage(expMessage);
		
	   
	    
		if(actMessage.equalsIgnoreCase(expMessage) )
		{	
			excelReader.setCellData(xlfile, "Sheet1", 464, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 464, 9, resFail);
			 return false;
		}	    
	
	}
	
	
	@FindBy(xpath="//tr[@id='EffectiveDate_day_grid']")
	private static WebElement calDates;	
	
	public static boolean checkOpenExchangeRateOnCompanyAccountingDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		 
		baseCurrencyTxt.click();
			
		baseCurrencyTxt.sendKeys("U");
		
		int baseCurrencyCount=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount);
			
		for(int i=0 ; i < baseCurrencyCount ;i++)
		{
			String data=baseCurrencyListCount.get(i).getText();
				
			if(data.equalsIgnoreCase("USD"))
			{
				baseCurrencyListCount.get(i).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateCalendarBtn));
		withEffectiveDateCalendarBtn.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateMonthDropDown));
        Select mon=new Select(withEffectiveDateMonthDropDown);
        mon.selectByVisibleText("December");
        
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateYearDropDown));
        Select yr=new Select(withEffectiveDateYearDropDown);
        
        String selectedyear=yr.getFirstSelectedOption().getText();
        int i=Integer.parseInt(selectedyear);
        
        System.err.println("INTEGER YEAR : "+i);
        
        String stringyear=Integer.toString(i-1);
        
        yr.selectByVisibleText(stringyear);
        
        
        String date="31";
        
         java.util.List<WebElement> columns=calDates.findElements(By.tagName("td"));  
                
	     for (WebElement cell : columns)
	     {
	        if (cell.getText().equals(date))
	        {
	           cell.click();
	           break;
	        }
	     }

		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
			
        gridcurrencyName1Txt.click();
			
        gridcurrencyName1Txt.sendKeys("i");
			
		int gridcurrencyNameCount=currencyNameListCount.size();
				
		System.err.println(gridcurrencyNameCount);
				
		for(int i1=0 ; i1 < gridcurrencyNameCount ;i1++)
		{
			String data=currencyNameListCount.get(i1).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("INR"))
			{
				currencyNameListCount.get(i1).click();
						
				break;
			}
		}	
					
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
			
	    gridDefineAsTxt.click();
				
		gridDefineAsTxt.sendKeys("U");
				
 		int gridDefinedAsCount=definedAsListCount.size();
					
		System.err.println(gridDefinedAsCount);
					
		for(int i1=0 ; i1 < gridDefinedAsCount ;i1++)
		{
			String data=definedAsListCount.get(i1).getText();
					
			System.err.println(data);
					
			if(data.equalsIgnoreCase("USD"))
			{
					definedAsListCount.get(i1).click();
							
					break;
				}
			}	
						
		gridDefineAsTxt.sendKeys(Keys.TAB);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("0.02");
	
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
		
			
		//Second row data
		
        
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
			
        gridcurrencyName1Txt.click();
			
        gridcurrencyName1Txt.sendKeys("A");
			
		int gridcurrencyNameCount1=currencyNameListCount.size();
			
		System.err.println(gridcurrencyNameCount1);
				
		for(int i1=0 ; i1 < gridcurrencyNameCount1 ;i1++)
		{
			String data=currencyNameListCount.get(i1).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("AED"))
			{
				currencyNameListCount.get(i1).click();
						
				break;
			}
		}	
					
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
			
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
			
    	gridDefineAsTxt.click();
			
		gridDefineAsTxt.sendKeys("U");
				
		int gridDefinedAsCount1=definedAsListCount.size();
					
		System.err.println(gridDefinedAsCount1);
					
		for(int i1=0 ; i1 < gridDefinedAsCount ;i1++)
		{
			String data=definedAsListCount.get(i1).getText();
					
			System.err.println(data);
					
			if(data.equalsIgnoreCase("USD"))
			{
				definedAsListCount.get(i1).click();
							
				break;
				}
			}	
						
		gridDefineAsTxt.sendKeys(Keys.TAB);
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("0.18");
		Thread.sleep(3000);
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
		
		Thread.sleep(3000);
     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		errorMessageCloseBtn.click();
		
		// INR
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		
		baseCurrencyTxt.click();
		
		baseCurrencyTxt.sendKeys("i");
		
		int baseCurrencyCount1=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount1);
			
		for(int i1=0 ; i1 < baseCurrencyCount1 ;i1++)
		{
			String data=baseCurrencyListCount.get(i1).getText();
				
			if(data.equalsIgnoreCase("INR"))
			{
				baseCurrencyListCount.get(i1).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateCalendarBtn));
		withEffectiveDateCalendarBtn.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateMonthDropDown));
        Select mon1=new Select(withEffectiveDateMonthDropDown);
        mon1.selectByVisibleText("December");
        
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateYearDropDown));
        Select yr1=new Select(withEffectiveDateYearDropDown);
        
        String selectedyear1=yr1.getFirstSelectedOption().getText();
        int i1=Integer.parseInt(selectedyear1);
        
        System.err.println("INTEGER YEAR : "+i1);
        
        String stringyear1=Integer.toString(i1-1);
        
        yr.selectByVisibleText(stringyear1);
        
        
        String date1="31";
        
         java.util.List<WebElement> columns1=calDates.findElements(By.tagName("td"));  
                
	     for (WebElement cell : columns1)
	     {
	        if (cell.getText().equals(date1))
	        {
	           cell.click();
	           break;
	        }
	     }

		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
			
        gridcurrencyName1Txt.click();
			
        gridcurrencyName1Txt.sendKeys("u");
			
		int gridcurrencyNameCount2=currencyNameListCount.size();
				
		System.err.println(gridcurrencyNameCount2);
				
		for(int i11=0 ; i11 < gridcurrencyNameCount2 ;i11++)
		{
			String data=currencyNameListCount.get(i11).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("USD"))
			{
				currencyNameListCount.get(i11).click();
						
				break;
			}
		}	
					
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
			
	    gridDefineAsTxt.click();
				
		gridDefineAsTxt.sendKeys("i");
				
 		int gridDefinedAsCount3=definedAsListCount.size();
					
		System.err.println(gridDefinedAsCount3);
					
		for(int i11=0 ; i11 < gridDefinedAsCount3 ;i11++)
		{
			String data=definedAsListCount.get(i11).getText();
					
			System.err.println(data);
					
			if(data.equalsIgnoreCase("INR"))
			{
					definedAsListCount.get(i11).click();
							
					break;
				}
			}	
						
		gridDefineAsTxt.sendKeys(Keys.TAB);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("50");
	
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
			
			
		//Second row data
		
        
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
			
        gridcurrencyName1Txt.click();
			
        gridcurrencyName1Txt.sendKeys("A");
			
		int gridcurrencyNameCount4=currencyNameListCount.size();
			
		System.err.println(gridcurrencyNameCount4);
				
		for(int i11=0 ; i11 < gridcurrencyNameCount4 ;i11++)
		{
			String data=currencyNameListCount.get(i11).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("AED"))
			{
				currencyNameListCount.get(i11).click();
						
				break;
			}
		}	
					
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
			
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
			
    	gridDefineAsTxt.click();
			
		gridDefineAsTxt.sendKeys("i");
				
		int gridDefinedAsCount5=definedAsListCount.size();
					
		System.err.println(gridDefinedAsCount5);
					
		for(int i11=0 ; i11 < gridDefinedAsCount5 ;i11++)
		{
			String data=definedAsListCount.get(i11).getText();
					
			System.err.println(data);
					
			if(data.equalsIgnoreCase("INR"))
			{
				definedAsListCount.get(i11).click();
							
				break;
				}
			}	
						
		gridDefineAsTxt.sendKeys(Keys.TAB);
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("9");
		Thread.sleep(3000);
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
		
		Thread.sleep(3000);
     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		errorMessageCloseBtn.click();
		
		// AED
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyTxt));
		
		baseCurrencyTxt.click();
		
		baseCurrencyTxt.sendKeys("a");
		
		int baseCurrencyCount3=baseCurrencyListCount.size();
			
		System.err.println(baseCurrencyCount3);
			
		for(int i11=0 ; i11 < baseCurrencyCount3 ;i11++)
		{
			String data=baseCurrencyListCount.get(i11).getText();
				
			if(data.equalsIgnoreCase("AED"))
			{
				baseCurrencyListCount.get(i11).click();
					
				break;
			}
		}	
				
		baseCurrencyTxt.sendKeys(Keys.TAB);
		
		
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateTxt));
		
		withEffectiveDateTxt.click();
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateCalendarBtn));
		withEffectiveDateCalendarBtn.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateMonthDropDown));
        Select mon2=new Select(withEffectiveDateMonthDropDown);
        mon2.selectByVisibleText("December");
        
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(withEffectiveDateYearDropDown));
        Select yr2=new Select(withEffectiveDateYearDropDown);
        
        String selectedyear2=yr2.getFirstSelectedOption().getText();
        int i2=Integer.parseInt(selectedyear2);
        
        System.err.println("INTEGER YEAR : "+i2);
        
        String stringyear2=Integer.toString(i2-1);
        
        yr.selectByVisibleText(stringyear2);
        
        
        String date2="31";
        
         java.util.List<WebElement> columns2=calDates.findElements(By.tagName("td"));  
                
	     for (WebElement cell : columns2)
	     {
	        if (cell.getText().equals(date2))
	        {
	           cell.click();
	           break;
	        }
	     }

		
		getAction().moveToElement(withEffectiveDateTxt).sendKeys(Keys.TAB).perform();
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
			
        gridcurrencyName1Txt.click();
			
        gridcurrencyName1Txt.sendKeys("u");
			
		int gridcurrencyNameCount6=currencyNameListCount.size();
				
		System.err.println(gridcurrencyNameCount6);
				
		for(int i11=0 ; i11 < gridcurrencyNameCount6 ;i11++)
		{
			String data=currencyNameListCount.get(i11).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("USD"))
			{
				currencyNameListCount.get(i11).click();
						
				break;
			}
		}	
					
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
			
	    gridDefineAsTxt.click();
				
		gridDefineAsTxt.sendKeys("a");
				
 		int gridDefinedAsCount7=definedAsListCount.size();
					
		System.err.println(gridDefinedAsCount7);
					
		for(int i11=0 ; i11 < gridDefinedAsCount7 ;i11++)
		{
			String data=definedAsListCount.get(i11).getText();
					
			System.err.println(data);
					
			if(data.equalsIgnoreCase("AED"))
			{
					definedAsListCount.get(i11).click();
							
					break;
				}
			}	
						
		gridDefineAsTxt.sendKeys(Keys.TAB);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("5.55");
	
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
			
			
		//Second row data
		
        
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridcurrencyName1Txt));
			
        gridcurrencyName1Txt.click();
			
        gridcurrencyName1Txt.sendKeys("i");
			
		int gridcurrencyNameCount8=currencyNameListCount.size();
			
		System.err.println(gridcurrencyNameCount8);
				
		for(int i11=0 ; i11 < gridcurrencyNameCount8 ;i11++)
		{
			String data=currencyNameListCount.get(i11).getText();
				
			System.err.println(data);
				
			if(data.equalsIgnoreCase("INR"))
			{
				currencyNameListCount.get(i11).click();
						
				break;
			}
		}	
					
		gridcurrencyName1Txt.sendKeys(Keys.TAB);
			
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridDefineAsTxt));
			
    	gridDefineAsTxt.click();
			
		gridDefineAsTxt.sendKeys("a");
				
		int gridDefinedAsCount9=definedAsListCount.size();
					
		System.err.println(gridDefinedAsCount9);
					
		for(int i11=0 ; i11 < gridDefinedAsCount9 ;i11++)
		{
			String data=definedAsListCount.get(i11).getText();
					
			System.err.println(data);
					
			if(data.equalsIgnoreCase("AED"))
			{
				definedAsListCount.get(i11).click();
							
				break;
				}
			}	
						
		gridDefineAsTxt.sendKeys(Keys.TAB);
		
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridRateTxt));
		
		gridRateTxt.sendKeys("0.11");
		Thread.sleep(3000);
		getAction().moveToElement(gridRateTxt).sendKeys(Keys.TAB).perform();
		
		Thread.sleep(3000);
     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionSaveIcon));
		
		exchangeRateDefinitionSaveIcon.click();
		
		
		String expMessage="Exchange Rate saved successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
		     
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
				excelReader.setCellData(xlfile, "Sheet1", 450, 9, resPass);
				return true;
		}	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 450, 9, resFail);
			 return false;
		}
     }
	
	
	
	public static boolean checkCancelOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateDefinitionPageCloseIcon));
	     
		exchangeRateDefinitionPageCloseIcon.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
	     
		
		boolean actlabelDashboard                 = labelDashboard.isDisplayed();
		boolean actselectDashboard                = selectDashboard.isDisplayed();
		boolean actnewAddDashBoard                = newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings = dashboardCustomizationSettings.isDisplayed();
		
		
		boolean explabelDashboard                 = true;
		boolean expselectDashboard                = true;
		boolean expnewAddDashBoard                = true;
		boolean expdashboardCustomizationSettings = true;
		
		System.out.println("************************************ checkCancelOptionInExchangeRate ******************");
	
		System.out.println("Home Page labelDashboard Value Actual                      :"+actlabelDashboard+               "  Value Expected : "+explabelDashboard);
		System.out.println("Home Page selectDashboard Value Actual                     :"+actselectDashboard+   "  Value Expected : "+expselectDashboard);
		System.out.println("Home Page newAddDashBoard Actual                           :"+actnewAddDashBoard+    "	 Value Expected : "+expnewAddDashBoard);
		System.out.println("Home Page dashboardCustomizationSettings Value Actual      :"+actdashboardCustomizationSettings+"	 Value Expected : "+expdashboardCustomizationSettings);
		
		if( actlabelDashboard==explabelDashboard  && actselectDashboard==expselectDashboard
				&& actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings)
		
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 465, 9, resPass);
				return true;
		  }	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 465, 9, resFail);
			 return false;
		}
     }
	
	
	
	// Exchange History
	
	public static boolean checkOpenExchangeRateHistory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	     
	    homeMenu.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	     
	    mastersMenu.click();
	     
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMenu));
	     
        currencyMenu.click();
         
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateHistoryMenu));
	     
        exchangeRateHistoryMenu.click();
        
        Thread.sleep(2000);  
        
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateHistoryLabel));
		
		
		String actexchangeRateHistoryLabel=exchangeRateHistoryLabel.getText();
		String expexchangeRateHistoryLabel="Exchange Rate History";
		
		System.out.println(" **********************checkOpenExchangeRateHistory************************");
		
		System.out.println("checkOpenExchangeRateHistory "+actexchangeRateHistoryLabel +" Value Excepted  "+expexchangeRateHistoryLabel);
		
		if(actexchangeRateHistoryLabel.equalsIgnoreCase(expexchangeRateHistoryLabel))
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 466, 9, resPass);
				return true;
		  }	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 466, 9, resFail);
			 return false;
		}
     }

	
	
	public static boolean checkExchangeRateHistoryMenuFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	 		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyInExchangeRateHistory));
		
		
		boolean actbaseCurrencyInExchangeRateHistory     = baseCurrencyInExchangeRateHistory.isDisplayed();
		boolean actdateOptionDropdown                    = dateOptionDropdown.isDisplayed();
		boolean actfromDateTxt                           = fromDateTxt.isDisplayed();
		boolean acttoDateTxt                             = toDateTxt.isDisplayed();
		boolean actloadIcon                              = loadIcon.isDisplayed();
		boolean actexchangeRateHistoryclearIcon          = exchangeRateHistoryclearIcon.isDisplayed();
		boolean acttableTab                              = tableTab.isDisplayed();
		boolean actgraphTab                              = graphTab.isDisplayed();
		boolean actexchangeRateHistoryCloseIcon          = exchangeRateHistoryCloseIcon.isDisplayed();
		
		
		boolean expbaseCurrencyInExchangeRateHistory     = true;
		boolean expdateOptionDropdown                    = true;
		boolean expfromDateTxt                           = true;
		boolean exptoDateTxt                             = true;
		boolean exploadIcon                              = true;
		boolean expexchangeRateHistoryclearIcon          = true;
		boolean exptableTab                              = true;
		boolean expgraphTab                              = true;
		boolean expexchangeRateHistoryCloseIcon          = true;
	
		
		System.out.println("****************************** checkExchangeRateHistoryMenuFields ********************************************");
	
		System.out.println("Home Page baseCurrencyInExchangeRateHistory Value Actual   :"+actbaseCurrencyInExchangeRateHistory+"     Value Expected : "+expbaseCurrencyInExchangeRateHistory);
		System.out.println("Home Page dateOptionDropdown Value Actual                  :"+actdateOptionDropdown+               "     Value Expected : "+expdateOptionDropdown);
		System.out.println("Home Page fromDateTxt Value Actual                         :"+actfromDateTxt+                      "	 Value Expected : "+expfromDateTxt);
		System.out.println("Home Page toDateTxt Value Actual                           :"+acttoDateTxt+                        "	 Value Expected : "+exptoDateTxt);
		System.out.println("Home Page loadIcon Value Actual                            :"+actloadIcon+                         "	 Value Expected : "+exploadIcon);
		System.out.println("Home Page exchangeRateHistoryclearIcon Value Actual        :"+actexchangeRateHistoryclearIcon+     "	 Value Expected : "+expexchangeRateHistoryclearIcon);
		System.out.println("Home Page tableTab Value Actual                            :"+acttableTab+                         "	 Value Expected : "+exptableTab);
		System.out.println("Home Page graphTab Value Actual                            :"+actgraphTab+                         "	 Value Expected : "+expgraphTab);
		System.out.println("Home Page exchangeRateHistoryCloseIcon Value Actual        :"+actexchangeRateHistoryCloseIcon+     "	 Value Expected : "+expexchangeRateHistoryCloseIcon);
		
		if( actbaseCurrencyInExchangeRateHistory==expbaseCurrencyInExchangeRateHistory&& actdateOptionDropdown==expdateOptionDropdown
				&& actfromDateTxt==expfromDateTxt && acttoDateTxt==exptoDateTxt && actloadIcon==exploadIcon
			    && acttableTab==exptableTab && actgraphTab==expgraphTab
				&& actexchangeRateHistoryclearIcon==expexchangeRateHistoryclearIcon && actexchangeRateHistoryCloseIcon==expexchangeRateHistoryCloseIcon)
		
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 467, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 467, 9, resFail);
			 return false;
		 }
	
      }
	
	public static boolean checkExchangeRateHistoryLoadButtonWithoutBaseCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadIcon));
		
		loadIcon.click();
		
		System.out.println("***************************checkExchangeRateHistoryLoadButtonWithoutBaseCurrency*******************************");
		
		String expMessage="Select the Base Currency";
		
		String actMessage=checkValidationMessage(expMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 468, 9, resPass);
			return true;
		}	 
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 468, 9, resFail);
			 return false;
		}	    
		
		
		
	
      }
	
	
	
	public static boolean checkExchangeRateHistorySelectINR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyInExchangeRateHistory));
		
		
		
		baseCurrencyInExchangeRateHistory.sendKeys("INR");
		
		Thread.sleep(3000);
		
		baseCurrencyInExchangeRateHistory.sendKeys(Keys.TAB);
		
		System.out.println(defCurrecnyOne.getText());
		
		System.out.println(defCurrecnyTwo.getText());
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueUSD));
		
		String actValueUSD                  = valueUSD.getText();
		String actValueAED                  = valueAED.getText();
		String actselCurrencyOne            = selCurrencyOne.getText();
		String actselCurrecnyTwo            = selCurrecnyTwo.getText();
		String actdefCurrecnyOne            = defCurrecnyOne.getText();
		String actdefCurrecnyTwo            = defCurrecnyTwo.getText();
		
		String expValueUSD                  = "70.0000000000";
		String expValueAED                  = "14.0000000000";
		String expselCurrencyOne            = "USD";
		String expselCurrecnyTwo            = "AED";
		String expdefCurrecnyOne            = "INR";
		String expdefCurrecnyTwo            = "INR";
		
		System.out.println("********************************checkExchangeRateHistorySelectINR***********************************");
		
		System.out.println("valueUSD            "+actValueUSD       +"Value Excepted   :"+expValueUSD);
		System.out.println("ValueAED            "+actValueAED       +"Value Excepted   :"+expValueAED);
		System.out.println("selCurrencyOne      "+actselCurrencyOne +"Value Excepted   :"+expselCurrencyOne);
		System.out.println("selCurrecnyTwo      "+actselCurrecnyTwo +"Value Excepted   :"+expselCurrecnyTwo);
		System.out.println("defCurrecnyOne      "+actdefCurrecnyOne +"Value Excepted   :"+expdefCurrecnyOne);
		System.out.println("defCurrecnyTwo      "+actdefCurrecnyTwo +"Value Excepted   :"+expdefCurrecnyTwo);
		
		
		if (actValueUSD.equalsIgnoreCase(expValueUSD)&& actValueAED.equalsIgnoreCase(expValueAED) && 
				actselCurrencyOne.equalsIgnoreCase(expselCurrencyOne) && actselCurrecnyTwo.equalsIgnoreCase(expselCurrecnyTwo) && 
				actdefCurrecnyOne.equalsIgnoreCase(expdefCurrecnyOne) && actdefCurrecnyTwo.equalsIgnoreCase(expdefCurrecnyTwo))
		
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 469, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 469, 9, resFail);
			 return false;
		 }
	
      }
	
	
	
	
	public static boolean checkExchangeRateHistoryClearButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateHistoryclearIcon));
		
		exchangeRateHistoryclearIcon.click();
		
		System.out.println(defCurrecnyOne.getText());
		
		System.out.println(defCurrecnyTwo.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selCurrencyOne));
		
		boolean actselCurrencyOne               = selCurrencyOne.getText().isEmpty();
		boolean actselCurrecnyTwo               = selCurrecnyTwo.getText().isEmpty();
		boolean actdefCurrecnyOne               = defCurrecnyOne.getText().isEmpty();
		boolean actdefCurrecnyTwo               = defCurrecnyTwo.getText().isEmpty();
		
		
		boolean expselCurrencyOne               = true;
		boolean expselCurrecnyTwo               = true;
		boolean expdefCurrecnyOne               = true;
		boolean expdefCurrecnyTwo               = true;
		
		System.out.println("****************************************Cancel Option In Currency Master ******************");
	
		System.out.println("Home Page selCurrencyOne Value Actual      :"+actselCurrencyOne+    "  Value Expected : "+expselCurrencyOne);
		System.out.println("Home Page selCurrecnyTwo Value Actual      :"+actselCurrecnyTwo+    "  Value Expected : "+expselCurrecnyTwo);
		System.out.println("Home Page defCurrecnyOne Actual            :"+actdefCurrecnyOne+    "	Value Expected : "+expdefCurrecnyOne);
		System.out.println("Home Page defCurrecnyTwo Value Actual      :"+actdefCurrecnyTwo+    "	Value Expected : "+expdefCurrecnyTwo);
		
		if( actselCurrencyOne==expselCurrencyOne  && actselCurrecnyTwo==expselCurrecnyTwo
				&& actdefCurrecnyOne==expdefCurrecnyOne&& actdefCurrecnyTwo==expdefCurrecnyTwo)
	
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 470, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 470, 9, resFail);
			 return false;
		 }
	
      }
	
	public static boolean checkExchangeRateHistorySelectAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    	 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyInExchangeRateHistory));
		
		
		baseCurrencyInExchangeRateHistory.sendKeys("AED");
		
		Thread.sleep(2000);  
		
		baseCurrencyInExchangeRateHistory.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defCurrecnyOne));
		System.out.println(defCurrecnyOne.getText());
		
		System.out.println(defCurrecnyTwo.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueUSD));
		
		String actValueUSD        = valueUSD.getText();
		String actValueAED        = valueAED.getText();
		String actselCurrencyOne  = selCurrencyOne.getText();
		String actselCurrecnyTwo  = selCurrecnyTwo.getText();
		String actdefCurrecnyOne  = defCurrecnyOne.getText();
		String actdefCurrecnyTwo  = defCurrecnyTwo.getText();
		
		String expValueUSD        = "0.0700000000";
		String expValueAED        = "4.2800000000";
		String expselCurrencyOne  = "INR";
		String expselCurrecnyTwo  = "USD";
		String expdefCurrecnyOne  = "AED";
		String expdefCurrecnyTwo  = "AED";
		
		
        System.out.println("**************************************checkExchangeRateHistorySelectAED***********************************");
		
		System.out.println("valueUSD            "+actValueUSD       +"Value Excepted   :"+expValueUSD);
		System.out.println("ValueAED            "+actValueAED       +"Value Excepted   :"+expValueAED);
		System.out.println("selCurrencyOne      "+actselCurrencyOne +"Value Excepted   :"+expselCurrencyOne);
		System.out.println("selCurrecnyTwo      "+actselCurrecnyTwo +"Value Excepted   :"+expselCurrecnyTwo);
		System.out.println("defCurrecnyOne      "+actdefCurrecnyOne +"Value Excepted   :"+expdefCurrecnyOne);
		System.out.println("defCurrecnyTwo      "+actdefCurrecnyTwo +"Value Excepted   :"+expdefCurrecnyTwo);
		
		
		
		if (actValueUSD.equalsIgnoreCase(expValueUSD)&& actValueAED.equalsIgnoreCase(expValueAED) && 
				actselCurrencyOne.equalsIgnoreCase(expselCurrencyOne) && actselCurrecnyTwo.equalsIgnoreCase(expselCurrecnyTwo) && 
				actdefCurrecnyOne.equalsIgnoreCase(expdefCurrecnyOne) && actdefCurrecnyTwo.equalsIgnoreCase(expdefCurrecnyTwo))
		
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 471, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 471, 9, resFail);
			 return false;
		 }
	
      }
	
	
	
	public static boolean checkExchangeRateHistorySelectUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		    	 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateHistoryclearIcon));
		
		exchangeRateHistoryclearIcon.click();
		
		
		Thread.sleep(5000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseCurrencyInExchangeRateHistory));
		
		
		baseCurrencyInExchangeRateHistory.sendKeys("USD");
		Thread.sleep(2000);  
		baseCurrencyInExchangeRateHistory.sendKeys(Keys.TAB);
		Thread.sleep(2000); 
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadIcon));
			
	    loadIcon.click();
	    
	    Thread.sleep(2000); 
	    
		System.out.println(defCurrecnyOne.getText());
		
		System.out.println(defCurrecnyTwo.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(valueUSD));
		
		
		String actValueUSD                = valueUSD.getText();
		String actValueAED                = valueAED.getText();
		String actselCurrencyOne          = selCurrencyOne.getText();
		String actselCurrecnyTwo          = selCurrecnyTwo.getText();
		String actdefCurrecnyOne          = defCurrecnyOne.getText();
		String actdefCurrecnyTwo          = defCurrecnyTwo.getText();
		
		String expValueUSD                = "0.0100000000";
		String expValueAED                = "0.2300000000";
		String expselCurrencyOne          = "INR";
		String expselCurrecnyTwo          = "AED";
		String expdefCurrecnyOne          = "USD";
		String expdefCurrecnyTwo          = "USD";
		
		
	    System.out.println("****************************checkExchangeRateHistorySelectUSD***********************************");
		
		System.out.println("valueUSD            "+actValueUSD       +"Value Excepted   :"+expValueUSD);
		System.out.println("ValueAED            "+actValueAED       +"Value Excepted   :"+expValueAED);
		System.out.println("selCurrencyOne      "+actselCurrencyOne +"Value Excepted   :"+expselCurrencyOne);
		System.out.println("selCurrecnyTwo      "+actselCurrecnyTwo +"Value Excepted   :"+expselCurrecnyTwo);
		System.out.println("defCurrecnyOne      "+actdefCurrecnyOne +"Value Excepted   :"+expdefCurrecnyOne);
		System.out.println("defCurrecnyTwo      "+actdefCurrecnyTwo +"Value Excepted   :"+expdefCurrecnyTwo);
			
		
		
		if (actValueUSD.equalsIgnoreCase(expValueUSD)&& actValueAED.equalsIgnoreCase(expValueAED) && 
				actselCurrencyOne.equalsIgnoreCase(expselCurrencyOne) && actselCurrecnyTwo.equalsIgnoreCase(expselCurrecnyTwo) && 
				actdefCurrecnyOne.equalsIgnoreCase(expdefCurrecnyOne) && actdefCurrecnyTwo.equalsIgnoreCase(expdefCurrecnyTwo))
		
		
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 472, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 472, 9, resFail);
			 return false;
		 }
	
      }
	
	  @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
      private static WebElement logoutOption;
	
	
	public static boolean checkCancelOptionInExchangeRateHistory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeRateHistoryCloseIcon));
	     
		exchangeRateHistoryCloseIcon.click();
	
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
	     
		boolean actlabelDashboard                 = labelDashboard.isDisplayed();
		boolean actselectDashboard                = selectDashboard.isDisplayed();
		boolean actnewAddDashBoard                = newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings = dashboardCustomizationSettings.isDisplayed();
		
		
		boolean explabelDashboard                 = true;
		boolean expselectDashboard                = true;
		boolean expnewAddDashBoard                = true;
		boolean expdashboardCustomizationSettings = true;
		
		System.out.println("*************************************** checkCancelOptionInExchangeRateHistory******************");
	
		System.out.println("Home Page labelDashboard Value Actual                      :"+actlabelDashboard+     "  Value Expected : "+explabelDashboard);
		System.out.println("Home Page selectDashboard Value Actual                     :"+actselectDashboard+    "  Value Expected : "+expselectDashboard);
		System.out.println("Home Page newAddDashBoard Actual                           :"+actnewAddDashBoard+    "	 Value Expected : "+expnewAddDashBoard);
		System.out.println("Home Page dashboardCustomizationSettings Value Actual      :"+actdashboardCustomizationSettings+"	Value Expected : "+expdashboardCustomizationSettings);
		
		if( actlabelDashboard==explabelDashboard  && actselectDashboard==expselectDashboard
				&& actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings)
		
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 473, 9, resPass);
				
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
				userNameDisplay.click();
				  
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			    logoutOption.click();
			    
				return true;
		  }	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 473, 9, resFail);
			 
	    	 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		     userNameDisplay.click();
				  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			 logoutOption.click();
			 return false;
		}
     }
	
	
	
		
		
    public MasterCurrencyPage(WebDriver driver)
    {
    	
   	 PageFactory.initElements(driver, this);
   	
    }
	

}

