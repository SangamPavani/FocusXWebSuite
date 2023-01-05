package com.focus.Pages;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

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

public class AccountPropertiesPage extends BaseEngine {

	
	
	
	 //Home Menu
		@FindBy (xpath="//*[@id='1']/div/span")
	    public static WebElement homeMenu;
		
	        //Masters Menu	
			@FindBy (xpath="//*[@id='1000']/span")
		    public static WebElement mastersMenu;
			
			    //Accounts 
				@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
				public static WebElement accounts;
				
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
			
					@FindBy(xpath="//i[@class='icon-font6 icon-stock-ledger']")
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
					
					
					@FindBy(xpath="//input[@id='sName']")
					public static WebElement nameTxt;
					
					
					//Code
					@FindBy(xpath="//input[@id='sCode']")
					public static WebElement codeTxt;
					
				    //AccountType	
					@FindBy(xpath="//select[@id='iAccountType']")
					public static WebElement accountTypeDropdown;
					
					
					//CreditLimit
					@FindBy(xpath="//input[@id='fCreditLimit']")
					public static WebElement creditLimitTxt;

					//CreditDays
					@FindBy(xpath="//input[@id='iCreditDays']")
					public static WebElement creditdaysTxt;
					
					
					//ChequeDiscountLimit
					@FindBy(xpath="//input[@id='fChequeDiscountLimit']")
					public static WebElement chequeDiscountLimitTxt;
					
					
					//Rate Of Interest
					@FindBy(xpath="//input[@id='fRateofinterest']")
					public static WebElement rateofinterestTxt;
					
					
					//BankAccount
					@FindBy(xpath="//input[@id='iBankAc']")
					public static WebElement bankAccountTxt;
					
					@FindBy(xpath="//*[@id='iBankAc_input_image']/span")
					public static WebElement bankAccount_ExpansionBtn;
					
					@FindBy(xpath="//*[@id='iBankAc_input_settings']/span")
					public static WebElement bankAccount_SettingBtn;

					
				//Setting Elements 
					
					//DebitCreditProposal
					@FindBy(xpath="//select[@id='iDebitCreditProposal']")
					public static WebElement debitCreditProposalDropdown;
					
					
					//DebitCreditRequired
					@FindBy(xpath="//select[@id='iDebitCreditRequired']")
					public static WebElement debitCreditRequiredDropdown;
					
					
					//ExchangeAdjustmentGainAC
					@FindBy(xpath="//input[@id='iExchangeAdjustmentGainAC']")
					public static WebElement exchangeAdjustmentGainACTxt;
					
					@FindBy(xpath="//*[@id='iExchangeAdjustmentGainAC_input_image']/span")
					public static WebElement exchangeAdjustmentGainAC_ExpansionBtn;
					
					@FindBy(xpath="//*[@id='iExchangeAdjustmentGainAC_input_settings']/span")
					public static WebElement exchangeAdjustmentGainAC_SettingBtn;
					
					
					//ExchangeAdjustmentLossAC
					@FindBy(xpath="//input[@id='iExchangeAdjustmentLossAC']")
					public static WebElement exchangeAdjustmentLossACTxt;
					
					@FindBy(xpath="//*[@id='iExchangeAdjustmentLossAC_input_image']/span")
					public static WebElement exchangeAdjustmentLossAC_ExpansionBtn;
					
					@FindBy(xpath="//*[@id='iExchangeAdjustmentLossAC_input_settings']/span")
					public static WebElement exchangeAdjustmentLossAC_SettingBtn;
					
					
					///PrimaryAccount
					@FindBy(xpath="//input[@id='iPrimaryAccount']")
					public static WebElement primaryAccountTxt;
					
					@FindBy(xpath="//*[@id='iPrimaryAccount_input_image']/span")
					public static WebElement primaryAccount_ExpansionBtn;
					
					@FindBy(xpath="//*[@id='iPrimaryAccount_input_settings']/span")
					public static WebElement primaryAccount_SettingBtn;
					
					
					////DefaultCurrency
					@FindBy(xpath="//input[@id='iDefaultCurrency']")
					public static WebElement defaultCurrencyTxt;
					
					@FindBy(xpath="//*[@id='iDefaultCurrency_input_image']/span")
					public static WebElement defaultCurrency_ExpansionBtn;
					
					@FindBy(xpath="//*[@id='iDefaultCurrency_input_settings']/span")
					public static WebElement defaultCurrency_SettingBtn;
					
					
					
					///ConsolidationMethod
					@FindBy(xpath="//select[@id='iConsolidationMethod']")
					public static WebElement consolidationMethodDropdown;
					
					
					///PaymentTerms
					@FindBy(xpath="//input[@id='iPaymentTerms']")
					public static WebElement paymentTermstxt;
					
					@FindBy(xpath="//*[@id='iPaymentTerms_input_image']/span")
					public static WebElement paymentTerms_ExpansionBtn;
					
					@FindBy(xpath="//*[@id='iPaymentTerms_input_settings']/span")
					public static WebElement paymentTerms_SettingBtn;
					
					
					//ReminderTerms
					@FindBy(xpath="//input[@id='iReminderTerms']")
					public static WebElement reminderTermsTxt;
					
					@FindBy(xpath="//*[@id='iReminderTerms_input_image']/span")
					public static WebElement reminderTerms_ExpansionBtn;
					
					@FindBy(xpath="//*[@id='iReminderTerms_input_settings']/span")
					public static WebElement reminderTerms_SettingBtn;
					
					
					///FinanceChargeTerms
					@FindBy(xpath="//*[@id='iFinanceChargeTerms']")
					public static WebElement financeChargeTermsTxt;
					
					@FindBy(xpath="//*[@id='iFinanceChargeTerms_input_image']/span")
					public static WebElement financeChargeTerms_Expansion;
					
					@FindBy(xpath="//*[@id='iFinanceChargeTerms_input_settings']/span")
					public static WebElement financeChargeTerms_SettingBtn;
				
					
					//Details Elements


					//Address
					@FindBy(xpath="//textarea[@id='sAddress']")
					public static WebElement addressTxt;
					
					
					//City
					@FindBy(xpath="//input[@id='iCity']")
					public static WebElement cityTxt;
					
					@FindBy(xpath="//*[@id='iCity_input_image']/span")
					public static WebElement city_ExpansionBtn;
					
					@FindBy(xpath="//*[@id='iCity_input_settings']/span")
					public static WebElement city_SettingBtn;
				
					//DeliveryAddress
					@FindBy(xpath="//textarea[@id='sDeliveryAddress']")
					public static WebElement deliveryAddressTxt;
					
					//Pin
					@FindBy(xpath="//input[@id='sPin']")
					public static WebElement pinTxt;
					
					
					//City2 DeliveryCity (City As Second TextBox)
					@FindBy(xpath="//input[@id='iDeliveryCity']")
					public static WebElement city2Text;
					
					@FindBy(xpath="//*[@id='iDeliveryCity_input_image']/span")
					public static WebElement city2_ExpansionBtn;
					
					@FindBy(xpath="//*[@id='iDeliveryCity_input_settings']/span")
					public static WebElement city2_SettingBtn;
					
					
					
					////Pin---->Delivery pin***()Second Pin TxtBox
					@FindBy(xpath="//input[@id='sDeliveryPin']")
					public static WebElement pin2Txt;
					
					
					//Send Email
					@FindBy(xpath="//input[@id='bSendEmailtocustomer']")
					public static WebElement sendEmailCheckBox;
					
					//AllowCustomerPortal
					@FindBy(xpath="//input[@id='bAllowCustomerPortal']")
					public static WebElement allowCustomerPortalCheckBox;
					
					//SendEmail
					@FindBy(xpath="//input[@id='sEMail']")
					public static WebElement sendEmailTxt;
					
					//Password
					@FindBy(xpath="//input[@id='sPassword']")
					public static WebElement passwordTxt;
					
					///TelphoneNumber
					@FindBy(xpath="//input[@id='sTelNo']")
					public static WebElement telphoneNumberTxt;
					
					//FaxNo
					@FindBy(xpath="//input[@id='sFaxNo']")
					public static WebElement faxNoTxt;
					
					
					//PortalEmail
					@FindBy(xpath="//input[@id='sPortalEmail']")
					public static WebElement portalEmailTxt;
					
					
					/////Print Layout Elements	
					//Voucher Type
					@FindBy(xpath="//label[contains(text(),'Voucher Type')]")
					public static WebElement gridVoucherTypeTxt;
					
					@FindBy(xpath="//*[@id='iVoucherType_input_image']/span")
					public static WebElement gridVoucher_ExpansionBtn;
					
					@FindBy(xpath="//*[@id='iVoucherType_input_settings']/span")
					public static WebElement gridVoucher_SettingBtn;

					
					///////Print layout
					@FindBy(xpath="//label[contains(text(),'Print Layout')]")
					public static WebElement gridPrintLayoutTxt;

					@FindBy(xpath="//*[@id='iPrintLayout_input_image']/span")
					public static WebElement gridPrintLayout_ExpansionBtn;

					@FindBy(xpath="//*[@id='iPrintLayout_input_settings']/span")
					public static WebElement gridPrintLayout_SettingBtn;
					
					
					@FindBy(xpath="//*[@id='btnDelete']/i")
					public static WebElement deleteBtn;
					
					/*@FindBy(xpath="//div[@id='idGlobalError']")
					public static WebElement validationConfirmationMessage;*/

					@FindBy(xpath="//div[@class='theme_color font-6']")
					public static WebElement errorMessage;
					
					@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
					public static WebElement errorMessageCloseBtn;
					
					/*@FindBy(xpath="//div[@id='idGlobalError']//td[3]")
					public static WebElement closeValidationConfirmationMessage;*/
					
					@FindBy(xpath="//*[@id='LandingGridBody']/tr[1]/td[11]")
					public static WebElement accountCreation;
					
					@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
					public static WebElement accountNewCreationName;
					
					@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
					public static WebElement accountNewCreationNameOfLane;               
					
					@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
					public static WebElement accountFirstCheckBoxToSelection;

					@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[5]/span[1]")
					public static WebElement accountGroupTitleDisplay;
					
					
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

					//Restore Screen Options
					@FindBy(xpath="//div[contains(text(),'Restore Company')]")
					private static WebElement restoreCompanyBtnOfLoginPage;
					
					@FindBy(xpath="//input[@id='txtRestoreFile']")
					private static WebElement restoreInputTxt;
					
					@FindBy(xpath="//button[@class='btn Fbutton']")
					private static WebElement restoreBrowseBtn;
					
					//User Name and password in Credentials
					@FindBy(xpath="//*[@id='txtAdminUsername']")
					private static WebElement adminName;
					
					@FindBy(xpath="//*[@id='txtAdminPassword']")
					private static WebElement adminPassword;
					
					@FindBy(xpath="/html/body/section/div[8]/div/div/div[4]/button[1]")
					private static WebElement loginButton;
					
					@FindBy(xpath="/html/body/section/div[8]/div/div/div[4]/button[2]")
					private static WebElement cancelButton;
					
					 @FindBy(xpath="//i[@class='icon-restore-1 icon-font4']")
						private static WebElement  loginPageRestoreBtn;
					
					 public static boolean checkRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
						{
							/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
							homeMenu.click();
							
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
							dataMangementMenu.click();
							
							getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restore));
							restore.click();
							*/
							
							getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginPageRestoreBtn));
							loginPageRestoreBtn.click();
							
							getWebDriverWait().until(ExpectedConditions.elementToBeClickable(adminName));
							adminPassword.sendKeys("focus");
							
							getWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginButton));
							loginButton.click();
							
							Thread.sleep(2000);
							
					        boolean actRestoreCompanyBtnOfLoginPage  =restoreCompanyBtnOfLoginPage.isDisplayed();
					        boolean actRestoreInputTxt               =restoreInputTxt.isDisplayed();
					        boolean actRestoreBrowseBtn              =restoreBrowseBtn.isDisplayed();
					        
					        boolean expRestoreCompanyBtnOfLoginPage  =true;
					        boolean expRestoreInputTxt               =true;
					        boolean expRestoreBrowseBtn              =true;
							
					        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreBrowseBtn));
							restoreBrowseBtn.click();
							
							Thread.sleep(3000);
						     
						     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\SanityRestore.exe");
						     
						     Thread.sleep(3000);
						     
						     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(restoreCompanyBtnOfLoginPage));
							 restoreCompanyBtnOfLoginPage.click();
						     
					    	 getWaitForAlert();
					    	 String actAlertTxt = getAlert().getText();
					    	 getAlert().accept();
					 		 
					 		 System.err.println(actAlertTxt);
					 		 
					 		String expAlertTxt = "Restore company code : 2B0";
						    	 
						    Thread.sleep(3000);
						    
							if(actAlertTxt.equalsIgnoreCase(expAlertTxt))
							{
								return true;
							}
							else
							{
								return false;
							}
					     }
					 
					 private static int cSize;

				public static boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
				{
					
					Thread.sleep(3000);
					LoginPage lp=new LoginPage(getDriver()); 
						
				    String unamelt="su";
				  
				    String pawslt="su";
				    
				    
				    getDriver().navigate().refresh();
				    Thread.sleep(3000);
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
				    
					String compname="Account Properties And Customization";
					
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
				    String expLoginCompanyName    ="Account Properties And Customization ";
				    String expDashboard			  ="Graph with Active and setAsDefault";
				   
					
					System.out.println("***********************************checkLogin*********************************");
				    
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
					

					public static boolean checkLogoutAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
						String compname="Account Properties And Customization";
						
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
						
					    
					    String expuserInfo            ="SU";
					    String expLoginCompanyName    ="Automation Company ";
					    String expDashboard			  ="Graph with Active and setAsDefault";
					   
						
						System.out.println("***********************************checkLogin*********************************");
					    
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
					
					
					
					
					
				@FindBy(xpath="//button[contains(text(),'Ok')]")
				private static WebElement loginRefreshOkBtn;
				
				@FindBy(xpath="//*[@id='btnMasterSaveClick']")
				public static WebElement saveBtn;

				@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
				public static WebElement closeBtn;

			    //Edit option Fields
				
				@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
				public static WebElement editcloseBtn;
				
				@FindBy(xpath="//i[@class='icon-font6 icon-paste-clipboard']")
				public static WebElement pasteBtn;
				
				@FindBy(xpath="//button[@id='btnMasterClone']")
				public static WebElement editcloneBtn;
				
				@FindBy(xpath="//*[@id='btnMasterCopy']")
				public static WebElement copyBtn;

				
				@FindBy(xpath = "//div[@id='idGlobalError']")
			public static WebElement validationConfirmationMessage;

			@FindBy(xpath = "//div[@class='theme_color font-6']")
			public static WebElement validationUpdatingConfirmationMessage;

			@FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
			public static WebElement newErrorMessage;

			@FindBy(xpath = "//span[@class='icon-reject2 theme_color']")
			public static WebElement newErrorMessageCloseBtn;

			@FindBy(xpath="//*[@id='LandingGridBody']/tr")
			  private static List<WebElement> masterGridBodyRowCount;
			  
			@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]//input")
			private static List<WebElement> masterGridBodyChkbox;

			  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[11]")
			  private static List<WebElement> masterGridBodyName;
			  
			  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
			  private static List<WebElement> masterGridBodyCode;
			  
			  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[13]")
			  private static List<WebElement> masterGridBodyAccountType;
				
			  
			  @FindBy(xpath="//*[@id='60']/div")
				private static WebElement  financialsMenu;
				
				@FindBy(xpath="//*[@id='61']/span")
				private static WebElement  financialsTransactionMenu; 
				
				@FindBy(xpath="//*[@id='2007']/span")
			  	private static WebElement  financialsTransactionsPurchaseMenu; 
				
				@FindBy(xpath="//span[contains(text(),'Purchases Voucher VAT')]")
				private static WebElement  purchaseVouchersVat;
				
				@FindBy(xpath="//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
				private static WebElement  newBtn;
				
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
				
				


				@FindBy(xpath="//*[@id='2008']/span")
				private static WebElement  purchaseVoucher;
				
				@FindBy(xpath="//*[@id='2009']/span")
				private static WebElement  purchaseReturnsVoucher;
				
				@FindBy(xpath="//*[@id='2050']/span")
				private static WebElement  purchaseVoucherN;

				
				
				@FindBy(xpath="//input[@id='id_header_4']")
				private static WebElement  vendorAccountTxt;

				@FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td[2]")
				private static List<WebElement> vendorAccountComboList;
				
				@FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td[2]")
				private static List<WebElement> customerAccountComboList;
				
				@FindBy(xpath="//tbody[@id='id_header_10_table_body']/tr/td[2]")
				private static List<WebElement> currencyComboList;
				
				@FindBy(xpath="//tbody[@id='id_header_268435459_table_body']/tr/td[2]")
				private static List<WebElement> departmentComboList;
				
				@FindBy(xpath="//tbody[@id='id_body_536870916_table_body']/tr/td[2]")
				private static List<WebElement> warehouseBodyComboList;
				
				@FindBy(xpath="//tbody[@id='id_header_86_table_body']/tr/td[2]")
				private static List<WebElement> st_warehouse1HeaderComboList;
				
				@FindBy(xpath="//tbody[@id='id_body_87_table_body']/tr/td[2]")
				private static List<WebElement> st_warehouse2BodyComboList;
				
				@FindBy(xpath="//input[@id='id_body_536870916']")
			    private static WebElement enter_WarehouseTxt;
				
				@FindBy(xpath="//*[@id='id_body_536870916_table_body']/tr")
			    private static List<WebElement> pvvGridWarehouseList;
				
			    @FindBy(xpath="//*[@id='id_body_23_table_body']/tr")
			    private static List<WebElement> pvvGridItemList;
			    
			    @FindBy(xpath="//input[@id='id_body_33554522']")
				private static WebElement enter_PvTaxable;
				
				@FindBy(xpath="//tbody[@id='id_body_16777307_table_body']/tr/td[2]")
				private static List<WebElement> pvvGridTaxCodeList;
				
				@FindBy(xpath="//input[@id='id_body_16777323']")
				private static WebElement enter_PvTaxCode;
				
				@FindBy(xpath="//input[@id='id_body_33554490']")
				private static WebElement enter_PVDiscount;
				
				@FindBy(xpath="//span[@id='btnPick']")
				private static WebElement pickBtn;
				
				@FindBy(xpath="//input[@id='txtNewReference']")
				private static WebElement newReferenceTxt;
				
				@FindBy(xpath="//span[@id='btnOk']")
				private static WebElement Bill_OkBtn;
				
				@FindBy(xpath="//input[@id='id_header_4']")
				private static WebElement  purchaseAccountTxt;
				
				@FindBy(xpath="//tbody[@id='id_header_4_table_body']/tr/td[2]")
				private static List<WebElement> vendorAccountListCount; 
				
				@FindBy(xpath="//input[@id='id_header_6']")
				private static WebElement  voucherHeaderDueDate;
				
				@FindBy(xpath="//td[@id='id_header_6_input_image']/span")
				private static WebElement  voucherHeaderDueDateCalenderBtn;
				
				@FindBy(xpath="//tr[@id='id_header_6_day_today']/td/span[1]")
				private static WebElement  voucherHeaderDueDateCalenderTodayBtn;
				
				@FindBy(xpath="//input[@id='id_header_10']")
				private static WebElement  voucherHeaderCurrency;
				
				@FindBy(xpath="//tbody[@id='id_header_10_table_body']/tr/td[2]")
				private static List<WebElement> currencyListCount;	
				
				@FindBy(xpath="//input[@id='id_header_268435459']")
				private static WebElement  departmentTxt;
				
				@FindBy(xpath="//*[@id='id_header_268435459_table_body']/tr/td[2]")
				private static List<WebElement> openingBalDepartmentList;
				
				@FindBy(xpath="//input[@id='id_body_12']")
				private static WebElement  enter_AccountTxt;
				
				@FindBy(xpath="//*[@id='id_body_12_table_body']/tr")
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
				
				@FindBy(xpath="//tbody[@id='id_header_268435459_table_body']/tr/td[2]")
			    private static List<WebElement> departmentListCount;
				
				@FindBy(xpath="//input[@id='id_header_268435470']")
				private static WebElement  placeOFSupplyTxt;
				
				@FindBy(xpath="//input[@id='id_header_268435471']")
				private static WebElement  jurisdictionTxt;
				
				
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
				
				@FindBy(xpath="//input[@id='id_body_16777323']")
				private static WebElement  enter_TaxCode;
				
				@FindBy(xpath="//input[@id='id_body_12']")
				private static WebElement  enter_PurchaseAccountTxt;
				
				@FindBy(xpath="//input[@id='id_body_33554521']")
				private static WebElement enter_PvVat;
				
				@FindBy(xpath="//*[@id='id_transactionentry_save']")
				private static WebElement  voucherSaveBtn;
				
				@FindBy(xpath="//div[@id='dvHomeTransClose']")  
				private static WebElement  voucherhomeCloseBtn;
			
				@FindBy(xpath="//*[@id='81']/span")
				private static WebElement  financialsReportsMenu; 
				    
				@FindBy(xpath="//*[@id='500']/span")
				private static WebElement  ledger;
				
				@FindBy(xpath="//select[@id='DateOptions_']")
				private static WebElement sl_DateOptionDropdown;
				
				@FindBy(xpath="//tbody[@id='LandingGridBody']/tr")
				private static List<WebElement> stockLedgerHometableRowCount;
				
				@FindBy(xpath="//i[contains(@class,'icon-font6 icon-ok')]")
				private static WebElement sl_OkBtn;
				
				@FindBy(xpath="//i[contains(@class,'icon-font6 icon-close')]")
				private static WebElement sl_CloseBtn;
				
				@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[12]")
				private static WebElement report_CloseBtn;
				
				@FindBy(xpath="//input[@id='selectAllMasters_']")
				private static WebElement sl_SelectAllItemsChkBox;
				
				@FindBy(xpath="//div[@id='REPORTRENDERNEWControls']/ul/li/span[8]")
				private static WebElement report_FilterBtn;
				
				@FindBy(xpath="//span[@id='idFilterCustomizeIcon']")
				private static WebElement  report_FilterCustomizeBtn;
				
				@FindBy(xpath="//a[contains(text(),'Account')]//i[@class='icon-expand icon-font7']")
				private static WebElement filterAccountExpandBtn;
				
				
				@FindBy (xpath="//ul[@id='FilterFields_500_0']/ul[1]/li/div/label")
				private static List<WebElement> filterAccountsList;
				
				@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody")
			    private static WebElement ledgerTable;
				
				 // Reports Table Row List  
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
				
				@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[9]/td")
				private static List<WebElement> reportsRow9List;
				
				@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[10]/td")
				private static List<WebElement> reportsRow10List;
				
				@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[11]/td")
				private static List<WebElement> reportsRow11List;
				
				@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[12]/td")
				private static List<WebElement> reportsRow12List;
				
				@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[13]/td")
				private static List<WebElement> reportsRow13List;
				
				@FindBy(xpath="//table[@class='CommonReportTable']/tbody/tr[14]/td")
				private static List<WebElement> reportsRow14List;
				
				
				

	
	public static boolean checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		 mastersMenu.click();
		
		 Thread.sleep(2000);
		 
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
	
	
	
	
	public static boolean checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachMonth() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		int count = masterGridBodyName.size();
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
			
			if (data.equalsIgnoreCase("cust_display_dr/cr_total_for_each_month")) 
			{
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayDrOrCrTotalsForEachMonthRadioBtnInProperties));
		displayDrOrCrTotalsForEachMonthRadioBtnInProperties.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayDrOrCrTotalsForEachMonthRadioBtnInProperties));
		
		boolean actPropertyIsSelected = displayDrOrCrTotalsForEachMonthRadioBtnInProperties.isSelected();
		boolean expPropertyIsSelected = true;
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		
		Thread.sleep(2000);
		
		System.out.println("Property isSelected : "+actPropertyIsSelected+"  Value Expected  "+expPropertyIsSelected);
		
		if (actPropertyIsSelected==expPropertyIsSelected) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	
	
	
	@FindBy(xpath="//*[@id='id_header_2']")
	private static WebElement  dateText;
	
	
	
	public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();
		
		Thread.sleep(2000);
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
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
		customerAccountTxt.sendKeys("cust_display_dr/cr_total_for_each_month");
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
			
			if(data.equalsIgnoreCase("India"))
			{
				departmentListCount.get(i).click();
				
				Thread.sleep(1000);
				
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
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
		Thread.sleep(3000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys("1");
		Thread.sleep(1000);
		enter_AQTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
		select1stRow_12thColumn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 String expMessgaeTr = "This Transaction will make the Stock Negative";
		 String actMessageTr = checkValidationMessage(expMessgaeTr);
		 
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

	
	
	
	
	
	
	
	public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth2() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		dateText.click();
		dateText.sendKeys(Keys.HOME);
		Thread.sleep(1000);
		dateText.sendKeys("28/02/2021");
		dateText.sendKeys(Keys.TAB);
			
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("cust_display_dr/cr_total_for_each_month");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

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

			if(data.equalsIgnoreCase("India"))
			{
				departmentListCount.get(i).click();
		
				Thread.sleep(1000);

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
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
		Thread.sleep(3000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		Thread.sleep(1000);
		enter_AQTxt.sendKeys("1");
		enter_AQTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys("1");
		enter_FQTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
		select1stRow_12thColumn.click();
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("20");
		Thread.sleep(1000);
		enter_Rate.sendKeys(Keys.TAB);
	
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
	
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
	
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		 
		 String expMessgaeTr = "This Transaction will make the Stock Negative.";
		 String actMessageTr = checkValidationMessage(expMessgaeTr);
	
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
	
	

	@FindBy(xpath="//*[@id='txtsrch-term']")
	public static WebElement masterSearchTxt; 
	
	
	
	
	
	public static boolean checkLedgerReportForCreatedCustomer() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("cust_display_dr/cr_total_for_each_month");
		masterSearchTxt.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);

		int rowcount=stockLedgerHometableRowCount.size();
		
		System.out.println(rowcount);
		
		for (int i = 0; i < rowcount; i++) 
		{
			String actName = stockLedgerHometableItemNamesList.get(i).getText();
			
			System.out.println(actName);
			
			if(actName.equalsIgnoreCase("cust_display_dr/cr_total_for_each_month"))
			{
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_display_dr/cr_total_for_each_month CustCrDrTotals]";
		
		
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
		String expRow6List = "[28/02/2021, NDT55 : 2, Sales - Computers, 42.00, , 252.00, 2.94, , 17.64, 42.00, , 252.00, Indian Rupees]";
		
		
		int reportsByWarehouseRow7ListCount = reportsRow7List.size();
		ArrayList<String> reportsByWarehouseRow7ListArray = new ArrayList<String>();
		for(int i=2;i<reportsByWarehouseRow7ListCount;i++)
		{
			String data = reportsRow7List.get(i).getText();
			reportsByWarehouseRow7ListArray.add(data);
		}
		String actRow7List = reportsByWarehouseRow7ListArray.toString();
		String expRow7List = "[February, , 42.00, , , 2.94, , , 42.00, , , ]";
		
		
		int reportsByWarehouseRow8ListCount = reportsRow8List.size();
		ArrayList<String> reportsByWarehouseRow8ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow8ListCount;i++)
		{
			String data = reportsRow8List.get(i).getText();
			reportsByWarehouseRow8ListArray.add(data);
		}
		String actRow8List = reportsByWarehouseRow8ListArray.toString();
		String expRow8List = "[Total, , , 252.00, , 252.00, 17.64, , 17.64, 252.00, , 252.00, ]";
		
		
		System.out.println("*********************************checkLedgerReportForCreatedCustomer*****************************************");
		
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
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));		
		finacinalsMenu.click();
		
		Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));		
		 receivableAndPayableAnalysisMenu.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));		
		 customerDetailMenu.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));		
		 customerDetailsCustomerStatementsReport.click();
		 
		 Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
			masterSearchTxt.click();
			masterSearchTxt.sendKeys("cust_display_dr/cr_total_for_each_month");
			masterSearchTxt.sendKeys(Keys.ENTER);
			
			Thread.sleep(3000);
	
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("cust_display_dr/cr_total_for_each_month"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			Thread.sleep(2000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
		
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
			int reportsByWarehouseRow1ListCount = reportsRow1List.size();
			ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
			{
				String data = reportsRow1List.get(i).getText();
				reportsByWarehouseRow1ListArray.add(data);
			}
			String actRow1List = reportsByWarehouseRow1ListArray.toString();
			String expRow1List = "[cust_display_dr/cr_total_for_each_month CustCrDrTotals]";
			
			
			int reportsByWarehouseRow2ListCount = reportsRow2List.size();
			ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow2ListCount;i++)
			{
				String data = reportsRow2List.get(i).getText();
				if (i==13) 
				{
					reportsByWarehouseRow2ListArray.add("Delay In Payment");
				} 
				else 
				{
					reportsByWarehouseRow2ListArray.add(data);
				}
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[NDT55:1, 29/01/2021, cust_display_dr/cr_total_for_each_month, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay In Payment, Indian Rupees, 29/01/2021, CustCrDrTotals]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				if (i==13) 
				{
					reportsByWarehouseRow3ListArray.add("Delay In Payment");
				} 
				else 
				{
					reportsByWarehouseRow3ListArray.add(data);
				}
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[NDT55:2, 28/02/2021, cust_display_dr/cr_total_for_each_month, 42.00, , , 42.00, 252.00, 42.00, , , 42.00, Delay In Payment, Indian Rupees, 28/02/2021, CustCrDrTotals]";
			
			
			int reportsByWarehouseRow4ListCount = reportsRow4List.size();
			ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow4ListCount;i++)
			{
				String data = reportsRow4List.get(i).getText();
				if (i==13) 
				{
					reportsByWarehouseRow4ListArray.add("Delay In Payment");
				} 
				else 
				{
					reportsByWarehouseRow4ListArray.add(data);
				}
			}
			String actRow4List = reportsByWarehouseRow4ListArray.toString();
			String expRow4List = "[Total, , , 252.00, , , 252.00, 462.00, 252.00, , , 252.00, Delay In Payment, , , ]";
			
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

	
	
	
	
	// Display Debit / Credit totals for each day	
	
	public static boolean checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachDay() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
		 mastersMenu.click();
		 
		 Thread.sleep(2000);
		 
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
		codeTxt.sendKeys("CustCrDrTotalsDay");
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
	
	
	
	
	
	public static boolean checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachDay() throws InterruptedException
	{
		int count = masterGridBodyName.size();
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
			
			if (data.equalsIgnoreCase("cust_display_dr/cr_total_for_each_day")) 
			{
				masterGridBodyChkbox.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayDrOrCrTotalsForEachDayRadioBtnInProperties));
		displayDrOrCrTotalsForEachDayRadioBtnInProperties.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayDrOrCrTotalsForEachDayRadioBtnInProperties));
		
		boolean actPropertyIsSelected = displayDrOrCrTotalsForEachDayRadioBtnInProperties.isSelected();
		boolean expPropertyIsSelected = true;
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		
		Thread.sleep(2000);
		
		System.out.println("Property isSelected : "+actPropertyIsSelected+"  Value Expected  "+expPropertyIsSelected);
		
		if (actPropertyIsSelected==expPropertyIsSelected) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	
	
	
	
	public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
		finacinalsMenu.click();
		
		Thread.sleep(2000);
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();
		
		Thread.sleep(2000);
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();
		
		Thread.sleep(2000);
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
    	dateText.click();
    	dateText.sendKeys(Keys.HOME);
    	Thread.sleep(1000);
    	dateText.sendKeys("29/01/2021");
    	dateText.sendKeys(Keys.TAB);
				
    	Thread.sleep(2000);
    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("cust_display_dr/cr_total_for_each_day");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
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
			
			if(data.equalsIgnoreCase("India"))
			{
				departmentListCount.get(i).click();
				
				Thread.sleep(1000);

				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);	
		
		Thread.sleep(2000);
		
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
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
		Thread.sleep(3000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys("1");
		enter_AQTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
		select1stRow_12thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		
		 Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 String expTransactionmsg="This Transaction will make the Stock Negative.";
		 String actTransactionmsg =checkValidationMessage(expTransactionmsg);
		 							
		 
		 String expSavingMessage1 = "Voucher saved successfully";
		 String expSavingMessage2 = " : 3";
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
	
	
	
	
	public static boolean checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay2() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateText));
		dateText.click();
		dateText.sendKeys(Keys.HOME);
		Thread.sleep(1000);
		dateText.sendKeys("28/02/2021");
		dateText.sendKeys(Keys.TAB);
			
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("cust_display_dr/cr_total_for_each_day");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);
	
		Thread.sleep(2000);
	
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
			
			if(data.equalsIgnoreCase("India"))
			{
				departmentListCount.get(i).click();
				
				Thread.sleep(1000);
				
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
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
	Thread.sleep(3000);
	enter_ItemTxt.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
	select1stRow_5thColumn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
	select1stRow_8thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
	enter_AQTxt.sendKeys("1");
	enter_AQTxt.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
	enter_FQTxt.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
	select1stRow_12thColumn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.sendKeys("200");
	enter_Rate.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
	select1stRow_17thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
	enter_Vat.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	voucherSaveBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
	billRefPickIcon.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
	billRefOkBtn.click();
	
	 String expTransactionmsg="This Transaction will make the Stock Negative.";
	 String actTransactionmsg =checkValidationMessage(expTransactionmsg);
	
	String expSavingMessage1 = "Voucher saved successfully";
	String expSavingMessage2 = " : 4";
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
	

	
	
	
	
	public static boolean checkLedgerReportForCreatedCustomer2() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
		financialsReportsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
		ledger.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.click();
		masterSearchTxt.sendKeys("cust_display_dr/cr_total_for_each_day");
		masterSearchTxt.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);

		int rowcount=stockLedgerHometableRowCount.size();
		
		System.out.println(rowcount);
		
		for (int i = 0; i < rowcount; i++) 
		{
			String actName = stockLedgerHometableItemNamesList.get(i).getText();
			
			System.out.println(actName);
			
			if(actName.equalsIgnoreCase("cust_display_dr/cr_total_for_each_day"))
			{
				stockLedgerHometableItemChkboxList.get(i).click();
				break;
			}
		}
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_display_dr/cr_total_for_each_day CustCrDrTotalsDay]";
		
		
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
		String expRow3List = "[29/01/2021, NDT55 : 3, Sales - Computers, 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, Indian Rupees]";
		
		
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
		String expRow6List = "[28/02/2021, NDT55 : 4, Sales - Computers, 210.00, , 420.00, 14.70, , 29.40, 210.00, , 420.00, Indian Rupees]";
		
		
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
		
		
		System.out.println("*********************************checkLedgerReportForCreatedCustomer2*****************************************");
		
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
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));		
		finacinalsMenu.click();
		
		Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));		
		 receivableAndPayableAnalysisMenu.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));		
		 customerDetailMenu.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));		
		 customerDetailsCustomerStatementsReport.click();
		 
		 Thread.sleep(3000);
		 
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
			masterSearchTxt.click();
			masterSearchTxt.sendKeys("cust_display_dr/cr_total_for_each_day");
			masterSearchTxt.sendKeys(Keys.ENTER);
			
			Thread.sleep(3000);
	
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("cust_display_dr/cr_total_for_each_day"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			Thread.sleep(2000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
		
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[cust_display_dr/cr_total_for_each_day CustCrDrTotalsDay]";
		
		
		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			if (i==13) 
			{
				reportsByWarehouseRow2ListArray.add("Delay In Payment");
			} 
			else 
			{
				reportsByWarehouseRow2ListArray.add(data);
			}
		}
		
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[NDT55:3, 29/01/2021, cust_display_dr/cr_total_for_each_day, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay In Payment, Indian Rupees, 29/01/2021, CustCrDrTotalsDay]";
		
		
		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			if (i==13) 
			{
				reportsByWarehouseRow3ListArray.add("Delay In Payment");
			} 
			else 
			{
				reportsByWarehouseRow3ListArray.add(data);
			}
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[NDT55:4, 28/02/2021, cust_display_dr/cr_total_for_each_day, 210.00, , , 210.00, 420.00, 210.00, , , 210.00, Delay In Payment, Indian Rupees, 28/02/2021, CustCrDrTotalsDay]";
		
		
		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			if (i==13) 
			{
				reportsByWarehouseRow4ListArray.add("Delay In Payment");
			} 
			else 
			{
				reportsByWarehouseRow4ListArray.add(data);
			}
		}
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[Total, , , 420.00, , , 420.00, 630.00, 420.00, , , 420.00, Delay In Payment, , , ]";
		
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
	
	
	
	
	
	
	
	
	
	// Master Account Properties
	
	public static boolean checkCreatingAccountForDisplayUnRealizeGainOrLossInLedger() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	    nameTxt.sendKeys("Display_Un-Realize_GainOrLoss_In_Ledger");
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("DisplayUnRealizeGainOrLossInLedger");
	    
		Thread.sleep(2000);
		
		Select accountTypeDrpdwn = new Select(accountTypeDropdown);
	    
		accountTypeDrpdwn.selectByVisibleText("Customer");
		
	    System.out.println("***********************************checkCreatingAccountForDisplayUnRealizeGainOrLossInLedger*********************************");
	    
  	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		 
		String expMessage = "Saved Successfully";
		
		String actMessage = checkValidationMessage(expMessage);
    	
		if(actMessage.equalsIgnoreCase(expMessage))
		{	
			return true;
		}	 
		else
		{
			return false;
		}
     }
	
	
	
	
	@FindBy(xpath="(//span[@id='ctxProperties'])[2]")
	private static WebElement selectAccountPropertiesBtn;
	
	
	
	@FindBy (xpath="//*[@id='rbnDisplayDebitCreditTotalForEachMonth']")
	public static WebElement displayDrOrCrTotalsForEachMonthRadioBtnInProperties;
	
	@FindBy (xpath="//*[@id='rbnrbnDisplayDebitCreditTotalForEachDay']")
	public static WebElement displayDrOrCrTotalsForEachDayRadioBtnInProperties;
	
	
	@FindBy (xpath="//input[@id='chkDisplayUnRealizeGainLossInLedger']")
	public static WebElement displayUnRealizeGainLossInLedgerChkbox;
	
	@FindBy (xpath="//*[@id='btnPropOk']/i")
	public static WebElement okBtnInAccountProperties;
	
	
	public static boolean checkMasterAccountEnablingDisplayUnRealizeGainOrLossInLedgerChkboxInProperties() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		Thread.sleep(3000);
		
		int count = masterGridBodyName.size();
		
		ArrayList<String> AccountNames = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
			
			if (data.equalsIgnoreCase("Display_Un-Realize_GainOrLoss_In_Ledger")) 
			{
				getAction().contextClick(masterGridBodyChkbox.get(i)).build().perform();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAccountPropertiesBtn));
		selectAccountPropertiesBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayUnRealizeGainLossInLedgerChkbox));
		displayUnRealizeGainLossInLedgerChkbox.click();
		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			AccountNames.add(data);
			
			if (data.equalsIgnoreCase("Display_Un-Realize_GainOrLoss_In_Ledger")) 
			{
				getAction().contextClick(masterGridBodyChkbox.get(i)).build().perform();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAccountPropertiesBtn));
		selectAccountPropertiesBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayUnRealizeGainLossInLedgerChkbox));
		
		boolean actdisplayUnRealizeGainLossInLedgerChkbox = displayUnRealizeGainLossInLedgerChkbox.isSelected();
		boolean expdisplayUnRealizeGainLossInLedgerChkbox = true;
		
		System.out.println("***********************************checkMasterAccountEnablingDisplayUnRealizeGainOrLossInLedgerChkboxInProperties*********************************");
		
		System.out.println("displayUnRealizeGainLossInLedgerChkbox  : "+actdisplayUnRealizeGainLossInLedgerChkbox+"  Value Expected  "+expdisplayUnRealizeGainLossInLedgerChkbox);
				
		if(actdisplayUnRealizeGainLossInLedgerChkbox==expdisplayUnRealizeGainLossInLedgerChkbox)
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	 }
	
	
	
	
	
	
	
    @FindBy(xpath="//span[@id='btnPick']")
    private static WebElement  billRefPickIcon;  
	
    @FindBy(xpath="//span[@id='btnOk']")
    private static WebElement  billRefOkBtn;                
    
    @FindBy(xpath="//span[@id='btnCancel']")
    private static WebElement  billRefcancel;                
    
    @FindBy(xpath="//*[@id='id_body_33554511']")
    private static WebElement enter_AQTxt;

    @FindBy(xpath="//*[@id='id_body_33554512']")
    private static WebElement enter_FQTxt;


  
    
    @FindBy(xpath="//*[@id='id_body_33554529']")
    private static WebElement  enter_Vat;
    
    @FindBy(xpath="//*[@id='id_body_33554530']")
    private static WebElement  enter_Taxable;
    


   
    @FindBy(xpath="//input[@id='id_header_268435470']")
    private static WebElement  salesInvoiceVATPlaceOFSupply;

    @FindBy(xpath="//tbody[@id='id_header_268435470_table_body']/tr/td[2]")
    private static List<WebElement> placeOFSupplyList;

    @FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement  customerAccountTxt;

    @FindBy(xpath="//span[@class='icon-financial icon-font1']")
	private static WebElement  finacinalsMenu;
	

    @FindBy(xpath="//a[@id='2014']//span[contains(text(),'Sales')]")
	private static WebElement  financialTransactionSalesMenu;

    @FindBy(xpath="//span[contains(text(),'Sales invoice VAT')]")
	private static WebElement  salesInvoiceVATVoucher;
	
    @FindBy(xpath="//input[@id='id_header_11']")
	private static WebElement  voucherHeaderExchangeRate;
    
	
	public static boolean checkSavingSalesInvoivesVATWithCustomerAccountAsDisplayUnRealizeGainLossInLedger() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
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
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("Display_Un-Realize_GainOrLoss_In_Ledger");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.click();
		voucherHeaderCurrency.sendKeys(Keys.END);
		voucherHeaderCurrency.sendKeys(Keys.SHIFT, Keys.HOME);
		Thread.sleep(2000);
		voucherHeaderCurrency.sendKeys("AED");
		Thread.sleep(3000);
		voucherHeaderCurrency.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderExchangeRate));
		voucherHeaderExchangeRate.click();
		voucherHeaderExchangeRate.sendKeys(Keys.END);
		voucherHeaderExchangeRate.sendKeys(Keys.SHIFT, Keys.HOME);
		voucherHeaderExchangeRate.sendKeys("0.050");
		voucherHeaderExchangeRate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.sendKeys(Keys.SPACE);
			
		int departmentcount=departmentListCount.size();
		
		System.err.println(departmentcount);
			
		for(int i=0 ; i < departmentcount ;i++)
		{
			String data=departmentListCount.get(i).getText();
			
			if(data.equalsIgnoreCase("INDIA"))
			{
				departmentListCount.get(i).click();
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
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys("1");
		enter_AQTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		select1stRow_11thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.click();
		enter_Vat.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
		select1stRow_18thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
		enter_Taxable.click();
		
		Thread.sleep(2000);*/
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();
		
		 Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 String expTransactionmsg="This Transaction will make the Stock Negative.";
		 String actTransactionmsg =checkValidationMessage(expTransactionmsg);
		 
		 String expSavingMessage1 = "Voucher saved successfully";
		 String expSavingMessage2 = " : 5";
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
	
	
	
	
	
	@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[2]/input")
	private static List<WebElement> grid_CheckBoxList;
	
	@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td[4]")
	private static List<WebElement> grid_VoucherNoList;
	
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
	
	
	@FindBy(xpath="//*[@id='id_header_4_table_body']/tr/td[2]")
	private static List<WebElement>  cashAndBAnkAccountList;
	
	@FindBy(xpath="//input[@id='id_header_4']")
	private static WebElement newCashBankAccountTxt;
	
  
	@FindBy(xpath="//*[@id='id_body_12_table_body']/tr/td[2]")
	private static List<WebElement> bodyAccountListInGrid;
	
	               
	@FindBy(xpath="//*[@id='id_body_39_table_body']/tr/td[2]")
	private static List<WebElement> bodyCreditAccountListInGrid;
	
	
	@FindBy(xpath="//input[@id='id_body_16777307']")
	private static WebElement  enterpayVATTaxCode;
	
	@FindBy(xpath="//input[@id='id_body_16']")
	private static WebElement  enter_Amount;
	
	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr")
	private static List<WebElement> billRefAdjustBillsList;
	

	@FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[13]")
	private static WebElement gridAdjustmentAmtRow1;
	
	
	
	
	@FindBy(xpath="//label[@id='id_BillWise_IP_AccountName']")
	private static WebElement breakUpDetailsAccount;
	
	@FindBy(xpath="//label[@id='id_BillWise_IP_ProductName']")
	private static WebElement breakUpDetailsItem;
	
	@FindBy(xpath="//label[@id='id_BillWise_IP_TagName']")
	private static WebElement breakUpDetailsDepartment;
	
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
	
	
	 @FindBy(xpath="//*[@id='id_body_16777305']")
	 private static WebElement  enterReceiptsVATTaxCode;
	
	 @FindBy(xpath="//input[@id='id_header_268435470']")
	 private static WebElement  placeofSupplyTxt;
	
	 @FindBy(xpath="//tbody[@id='id_header_268435470_table_body']/tr/td[2]")
	 private static List<WebElement>  placeofSupplyList;
	
	
	 @FindBy(xpath="//tbody[@id='id_header_268435471_table_body']/tr/td[2]")
	 private static List<WebElement>  jurisdictionList;
	
	 @FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[3]")
	 private static List<WebElement>  billwiseAdjustBillsDocList;
	
	 @FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[13]")
	 private static List<WebElement>  billwiseAdjustBillsAdjustColumn;
		
	 @FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr/td[2]/input")
	 private static List<WebElement>  billwiseAdjustBillsChkBoxList;

	 @FindBy(xpath="//*[@id='id_Adjustment_Grid_body']/tr[1]/td[2]/input")
	 private static WebElement  billrefAdjuBills1stChkbox;
	 
	

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
		
		@FindBy(xpath="//label[@id='id_BillWise_IP_BaseCurrencyValue']")
		private static WebElement conversationRateBaseCurrencyRate;
		
		@FindBy(xpath="//label[@id='id_BillWise_IP_LocalConversionRateValue']")
		private static WebElement conversationRateLocalCurrencyRate;
		
		@FindBy(xpath="//*[@id='id_transactionentry_save']")
		private static WebElement openingBalancesSaveBtn;
		
		
		@FindBy(xpath="//input[@id='id_header_145']")
		private static WebElement  voucherHeaderLocalExchangeRate;
		
		@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_18']")
		private static WebElement vocFooterdebitAmount;
		
		@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_19']")
		private static WebElement vocFooterCreditAmount;
	
	
		@FindBy (xpath="//tbody[@id='tblBodyTransRender']/tr/td")
		private static List<WebElement> voucherHomeBodyList;
	
	
	 public boolean checkSavingRecepitsVocher1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
			cashAndBankMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
			receiptsVoucher.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen Opened");
			
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
	    	
	    	
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
			voucherHeaderCurrency.click();
			voucherHeaderCurrency.sendKeys(Keys.END);
			voucherHeaderCurrency.sendKeys(Keys.SHIFT, Keys.HOME);
			Thread.sleep(2000);
			voucherHeaderCurrency.sendKeys("AED");
			Thread.sleep(3000);
			voucherHeaderCurrency.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderExchangeRate));
			voucherHeaderExchangeRate.click();
			voucherHeaderExchangeRate.sendKeys(Keys.END);
			voucherHeaderExchangeRate.sendKeys(Keys.SHIFT, Keys.HOME);
			voucherHeaderExchangeRate.sendKeys("0.060");
			voucherHeaderExchangeRate.sendKeys(Keys.TAB);
	    	
	    	
	    	
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
				
				if(data.equalsIgnoreCase("INDIA"))
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
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys("Display_Un-Realize_GainOrLoss_In_Ledger");
			Thread.sleep(3000);
			enter_AccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			enter_Amount.sendKeys("200");
			enter_Amount.sendKeys(Keys.TAB);
			
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
			voucherSaveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPartyName));
			
			String actPartyName = billRefPartyName.getText();
			String expPartyName = "Display_Un-Realize_GainOrLoss_In_Ledger (DisplayUnRealizeGainOrLossInLedger)";
			 
			 
			System.out.println("Bill wise Screen Cutomer Name "  + actPartyName + "  Value Expected  " + expPartyName);
	       
			int Adjustbills=billRefAdjustBillsGridList.size();
			
			String actAdjustbills=Integer.toString(Adjustbills);
			
			String expAdjustbills="1";
			 
			System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
			
			
			int billwiseAdjustBillsDocListcount=billwiseAdjustBillsDocList.size();
		        
			HashSet<String> actbillwiseAdjustBillsDocList  = new HashSet<String>();
				
			for (int i = 0; i < billwiseAdjustBillsDocListcount; i++) 
			{
				String data		                              = billwiseAdjustBillsDocList.get(i).getText();
				actbillwiseAdjustBillsDocList.add(data);
			}
			
			String actDocumentNumberText=actbillwiseAdjustBillsDocList.toString();
			
			String expDocumentNumberText="[NDT55:1]";
			
			
	        System.out.println("actDocumentNumberText   : "+actDocumentNumberText);
	        System.out.println("expDocumentNumberText   : "+expDocumentNumberText);
			
	     
	       Thread.sleep(2000);			
	      
	       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billrefAdjuBills1stChkbox));
	       billrefAdjuBills1stChkbox.click();
	       Thread.sleep(2000);
		
			 
			System.err.println("actAdjustbills : "+actAdjustbills +" Value Expected  : "+expAdjustbills);
			
			
			 Thread.sleep(2000);
		        
	        JavascriptExecutor js = (JavascriptExecutor) getDriver();
	 	    js.executeScript("arguments[0].scrollIntoView();", gridAdjustmentAmtRow1);
	         
				
			
			String expBillNewReference                      ="0.00";
			String expBillTransactionCurrency               ="200.00";
			String expBillBaseCurrency                      ="12.00";
			String expBillLocalCurrency                     ="200.00";
			String expBillBalanceNewRefAmount               ="0.00";
			
	       String expbillRefAdjustAmountInTransCurency         ="200.00";
	       String expbillRefBalanceAmountAdjustInTrnasCurrency ="0.00";
	       

	       
	       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	       String actBillNewReference                           = billRefNewReferenceTxt.getAttribute("value");
			String actBillTransactionCurrency                    = billRefTransactionCurency.getText();
			String actBillBaseCurrency                           = billRefBaseCurrency.getText();
			String actBillLocalCurrency                          = localCurrencyDhs.getText();
			String actBillBalanceNewRefAmount                    = balanceNewReferenceAmt.getText();
	       String actbillRefAdjustAmountInTransCurency          = billRefAdjustAmountInTransCurency.getText();
	       String actbillRefBalanceAmountAdjustInTrnasCurrency  = billRefBalanceAmountAdjustInTrnasCurrency.getText();
	       
			
	       
	       	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridFirstRowAdjustmentAmtTxt));
	 		billRefGridFirstRowAdjustmentAmtTxt.click();
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			billRefPickIcon.click();
	   	
			String expBillNewReferencePick                          = "0.00";
			String expBillTransactionCurrencyPick                   = "200";
			String expBillBaseCurrencyPick                          = "12";
			String expBillLocalCurrencyPick                         = "200.00";
			String expBillBalanceNewRefAmountPick                   = "0.00";
		    String expbillRefAdjustAmountInTransCurencyPick         = "200.00";
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
		
	          
	       
	       String expbreakUpDetailsAccountPick             ="071-001";
	       //String expbreakUpDetailsItemPick                ="";
			String expbreakUpDetailsDepartmentPick          ="INDIA";
	       String expconversationRateBaseCurrencyRatePick  ="0.06";
	       String expconversationRateLocalCurrencyRatePick ="1";
			
	       String expasOnEntryDateTransAmtPick             ="200.00";
	       String expasOnEntryDateBaseConcersationRatePick ="0.05";
	       String expasOnEntryDateBaseAmountPick           ="10.00";
	       String expasOnEntryDateLocConversationRatePick  ="1";
	       String expasOnEntryDateAmtPick                  ="200.00";
			
	       String expbalOnAdjstDateTransAmtPick            ="200.00";
	       String expbalOnAdjstDateBasrConversionRatePick  ="0.06";
	       String expbalOnAdjstDateBaseAmountPick          ="12.00";
	       String expbalOnAdjstDateLocalConversionRatePick ="1";
	       String expbalOnAdjstDateAmtPick                 ="200.00";
		
	       String expadjustmentsAmount1Pick                ="200.00";
	       String expadjustmentsAmount2Pick                ="12.00";
	       String expadjustmentsAmount3Pick                ="200.00";
	       String expadjustmentsAmount4Pick                ="200.00";
			
	       String expexchangeGainLossForBaseCurrencyPick   ="2.00";	
	       String expexchangeGainLossForLocalCurrencyPick  ="0.00";

	       
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
	       System.out.println("actBillLocalCurrencyPick :             "+ actBillLocalCurrencyPick+ "                " +"expBillLocalCurrencyPick :"+expBillLocalCurrencyPick);
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

	     
	       
	   		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
	       
			String expMessage1 = "Voucher saved successfully";
			String expMessage2 = " : 1";
			String actMessage = checkValidationMessage(expMessage1);
	 
	 
	       if( actAdjustbills.equalsIgnoreCase(expAdjustbills)  && actBillNewReference.equalsIgnoreCase(expBillNewReference) && actBillTransactionCurrency.equalsIgnoreCase(expBillTransactionCurrency) && 
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
					actbillRefBalanceAmountAdjustInTrnasCurrencyPick.equalsIgnoreCase(expbillRefBalanceAmountAdjustInTrnasCurrencyPick)
					
					&& actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
	       {
				return true;
	       }
	       else
	       {
	    	   return false;
	       }	
		}
		
		
	 
	 
	 
	 

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
	 
	 

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[1]/td")
private static List<WebElement> report1stRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[2]/td")
private static List<WebElement> report2ndRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[3]/td")
private static List<WebElement> report3rdRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[4]/td")
private static List<WebElement> report4thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[5]/td")
private static List<WebElement> report5thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[6]/td")
private static List<WebElement> report6thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[7]/td")
private static List<WebElement> report7thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[8]/td")
private static List<WebElement> report8thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[9]/td")
private static List<WebElement> report9thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[10]/td")
private static List<WebElement> report10thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[11]/td")
private static List<WebElement> report11thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[12]/td")
private static List<WebElement> report12thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[13]/td")
private static List<WebElement> report13thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[14]/td")
private static List<WebElement> report14thRowList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/tbody/tr[15]/td")
private static List<WebElement> report15thRowList;

@FindBy(xpath="//*[@id='trRender_0']/td[1]")
private static WebElement sl_1stRow1stCol;

@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[11]")
private static List<WebElement> stockLedgerHometableItemNamesList;

@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[8]/div/label/input")
private static List<WebElement> stockLedgerHometableItemChkboxList;

@FindBy(xpath="//div[@id='dvReportDetails']/div/table/thead/tr/th")
private static List<WebElement> reportsHeaderList;

@FindBy(xpath="//*[@id='trRender_1']/td[1]")
private static WebElement sl_2ndRow1stCol;
		
@FindBy(xpath="//*[@id='trRender_1']/td[2]")
private static WebElement sl_2ndRow2ndCol;

@FindBy(xpath="//*[@id='trRender_1']/td[3]")
private static WebElement sl_2ndRow3rdCol;

	 
	 public boolean checkCustomerStatementReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
	 {
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		 	financialsMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		 	receivableAndPayableAnalysisMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		 	customerDetailMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
		 	customerDetailsCustomerStatementsReport.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("Display_Un-Realize_GainOrLoss_In_Ledger"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		 	Select s=new Select(sl_DateOptionDropdown);
		 	s.selectByValue("1");
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		 	sl_OkBtn.click();
		 	
		     Thread.sleep(3000);
		     
		     
		     	String s1 = sl_2ndRow3rdCol.getText(); 
				Calendar cal=Calendar.getInstance();
				SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
			    String s2 = f.format(cal.getTime());
			    
			    System.out.println("VoucherDate String : "+s1);
			    System.out.println("CurrentDate String : "+s2);
			    
			    Date VoucherDate = f.parse(s1); 
			    Date PresentDate = f.parse(s2);


			    Calendar day1 = Calendar.getInstance();
			    Calendar day2 = Calendar.getInstance(); 
			    day1.setTime(VoucherDate);
			    day2.setTime(PresentDate);

			    int daysBetween = day2.get(Calendar.DAY_OF_YEAR) - day1.get(Calendar.DAY_OF_YEAR);      

			    String delayInPayment = String.valueOf(daysBetween);
			    
			   System.err.println("DelayInPayment : "+daysBetween);
			   
			   String currentdate = f.format(cal.getTime()).toString();
			   
		 	
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		 	
		 	int reportsRow1ListCount = report1stRowList.size();
		 	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		 	for(int i=1;i<reportsRow1ListCount;i++)
		 	{
		 		String data = report1stRowList.get(i).getText();
		 		reportsRow1ListArray.add(data);
		 	}
		 	String actRow1List = reportsRow1ListArray.toString();
		 	String expRow1List = "[Display_Un-Realize_GainOrLoss_In_Ledger DisplayUnRealizeGainOrLossInLedger]";
		 	
		 	
		 	int report2ndRowListCount = report2ndRowList.size();
		 	ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		 	for(int i=1;i<report2ndRowListCount;i++)
		 	{
		 		String data = report2ndRowList.get(i).getText();
		 		
		 		report2ndRowListArray.add(data);
		 	}
		 	String actRow2List = report2ndRowListArray.toString();
		 	String expRow2List = "[NDT55:5, "+currentdate+", Display_Un-Realize_GainOrLoss_In_Ledger, 10.00, , , , , 200.00, , , , "+delayInPayment+", United Arab Emirates Dirham, "+currentdate+", DisplayUnRealizeGainOrLossInLedger]";
		 	
		 	
		 	int report3rdRowListCount = report3rdRowList.size();
		 	ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		 	for(int i=1;i<report3rdRowListCount;i++)
		 	{
		 		String data = report3rdRowList.get(i).getText();

		 		report3rdRowListArray.add(data);
		 	}
		 	String actRow3List = report3rdRowListArray.toString();
		 	String expRow3List = "[Rct:1, "+currentdate+", Display_Un-Realize_GainOrLoss_In_Ledger, , 10.00, , , , , 200.00, , , "+delayInPayment+", United Arab Emirates Dirham, "+currentdate+", DisplayUnRealizeGainOrLossInLedger]";
		 	
		 	
		 	int report4thRowListCount = report4thRowList.size();
		 	ArrayList<String> report4thRowListArray = new ArrayList<String>();
		 	for(int i=1;i<report4thRowListCount;i++)
		 	{
		 		String data = report4thRowList.get(i).getText();
		 		
		 		report4thRowListArray.add(data);
		 	}
		 	String actRow4List = report4thRowListArray.toString();
		 	String expRow4List = "[Total, , , 10.00, 10.00, , , , 200.00, 200.00, , , 0, , , ]";
	
		 	
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
		 			
		 	 	
		 	if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
		 		   && actRow4List.equalsIgnoreCase(expRow4List))
		 	{
		 		return true;
		 	}
		 	else
		 	{
		 		return false;
		 	}
	 	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	// Consolidate when both Accounts are same
	 
	 
		public static boolean checkCreatingAccountForConsolidateWhenBothAccountsAreSame() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
		    
		    Thread.sleep(2000);
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		    nameTxt.sendKeys("Consolidate_When_Both_Accounts_Are_Same");
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys("ConsolidateWhenBothAccountsAreSame");
		    
			Thread.sleep(2000);
			
			Select accountTypeDrpdwn = new Select(accountTypeDropdown);
		    
			accountTypeDrpdwn.selectByVisibleText("Cash");
			
		    System.out.println("***********************************checkCreatingAccountForConsolidateWhenBothAccountsAreSame*********************************");
		    
	  	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			 
			String expMessage = "Saved Successfully";
			
			String actMessage = checkValidationMessage(expMessage);
	    	
			if(actMessage.equalsIgnoreCase(expMessage))
			{	
				return true;
			}	 
			else
			{
				return false;
			}
	     }
		
		 
		  @FindBy(xpath="//span[contains(text(),'Account Properties')]")
		    public static WebElement accountPropertiesLabel;
		     
			@FindBy(xpath="//input[@id='rbnNormal']")
			public static WebElement normalRadioBtn;

			@FindBy(xpath="//input[@id='rbnDisplayDebitCreditTotalForEachAccountUnderGroup']")
			private static WebElement  displayDebitCreditTotalForEachAccountUnderGroup;
			
			@FindBy(xpath="//input[@id='rbnClubTranOfAllAcctsUnderGrpWhenDispInLedger']")
			private static WebElement  ClubTheTransactionsofAllTheAccountsUnderGroup;
								
			@FindBy(xpath="//input[@id='rbnShowSummaryOfAccount']")
			private static WebElement showSummaryOfTheAccountRadioBtn ;	
			
			@FindBy(xpath="//input[@id='chkSuspendCreditLimit']")
			private static WebElement suspendCreditLimitChkbox ;
									
			@FindBy(xpath="//input[@id='rbnDisplayDebitCreditTotalForEachMonth']")
			private static WebElement  displayDebitCreditTotalForEachMonthRadioBtn;
								
			@FindBy(xpath="//input[@id='rbnrbnDisplayDebitCreditTotalForEachDay']")
			private static WebElement  displayDebitCreditTotalForEachDayRadioBtn;
			
			@FindBy(xpath="//input[@id='rbnNone']")
			public static WebElement  noneRadioBtn;
			
			@FindBy(xpath="//input[@id='rbnConsolidateWhenBothAccountsAreSame']")
			public static WebElement consolidateWhenBothAccountsAreSameRadioBtn ;
			
			@FindBy(xpath="//input[@id='rbnConsolidateAlways']")
			public static WebElement consolidateAlwaysRadioBtn ;
			
			@FindBy(xpath="//select[@id='ddlStatus']")
			public static WebElement  statusDropdown;
			
			@FindBy(xpath="//input[@id='chkDoNotRestrictSelectionEvenIfRightsNotAllotted']")
			public static WebElement  doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox;
			
			@FindBy(xpath="//input[@id='chkAllowOtherCompaniesToViewRecords']")
			public static WebElement allowOtherCompaniesToViewRecordsCheckbox;
			
			@FindBy(xpath="//input[@id='chkGenerateLedgerByCurrency']")
			public static WebElement generateLedgerByCurrencyCheckbox;
			
			@FindBy(xpath="//input[@id='chkSendSmsEmailWhereverAcDebitedCredited']")
			public static WebElement sendSmsEmailWhereverAcDebitedCreditedCheckbox;
			
			@FindBy(xpath="//span[@id='btnPropOk']")
			public static WebElement properties_okBtn;
			
			@FindBy(xpath="//*[@id='divMasterProperty']/ul/li/span[2]")
			public static WebElement  properties_cancelBtn;
		     
		
		
		
		
		public static boolean checkMasterAccountEnablingConsolidateWhenBothAccountsAreSameInProperties() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			
			Thread.sleep(3000);
			
			int count = masterGridBodyName.size();
			
			ArrayList<String> AccountNames = new ArrayList<String>();
			
			for (int i = 0; i < count; i++) 
			{
				String data = masterGridBodyName.get(i).getText();
				AccountNames.add(data);
				
				if (data.equalsIgnoreCase("Consolidate_When_Both_Accounts_Are_Same")) 
				{
					getAction().contextClick(masterGridBodyChkbox.get(i)).build().perform();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAccountPropertiesBtn));
			selectAccountPropertiesBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(consolidateWhenBothAccountsAreSameRadioBtn));
			consolidateWhenBothAccountsAreSameRadioBtn.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();
			
			for (int i = 0; i < count; i++) 
			{
				String data = masterGridBodyName.get(i).getText();
				AccountNames.add(data);
				
				if (data.equalsIgnoreCase("Consolidate_When_Both_Accounts_Are_Same")) 
				{
					getAction().contextClick(masterGridBodyChkbox.get(i)).build().perform();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAccountPropertiesBtn));
			selectAccountPropertiesBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(consolidateWhenBothAccountsAreSameRadioBtn));
			
			boolean actconsolidateWhenBothAccountsAreSameRadioBtn = consolidateWhenBothAccountsAreSameRadioBtn.isSelected();
			boolean expconsolidateWhenBothAccountsAreSameRadioBtn = true;
			
			System.out.println("***********************************checkMasterAccountEnablingConsolidateWhenBothAccountsAreSameInProperties*********************************");
			
			System.out.println("consolidateWhenBothAccountsAreSameRadioBtn  : "+actconsolidateWhenBothAccountsAreSameRadioBtn+"  Value Expected  "+expconsolidateWhenBothAccountsAreSameRadioBtn);
					
			if(actconsolidateWhenBothAccountsAreSameRadioBtn==expconsolidateWhenBothAccountsAreSameRadioBtn)
			{	
				return true;
			}	 
			else
			{
				return false;
			}
		 }
		
	 

		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
		private static WebElement  select2ndRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
		private static WebElement  select2ndRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
		private static WebElement  select2ndRow_3rdColumn;
		
		
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
		private static WebElement  select3rdRow_1stColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
		private static WebElement  select3rdRow_2ndColumn;
		
		@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
		private static WebElement  select3rdRow_3rdColumn;
		
		
		
		@FindBy(xpath="//td[@id='AccountAmount_col_1-1']")
		private static WebElement  billRefGridAccountRow1;	
		
		@FindBy(xpath="//td[@id='AccountAmount_col_1-2']")
		private static WebElement  billRefGridAmountRow1;	
		
		@FindBy(xpath="//td[@id='AccountAmount_col_2-1']")
		private static WebElement  billRefGridAccountRow2;	
		
		@FindBy(xpath="//td[@id='AccountAmount_col_2-2']")
		private static WebElement  billRefGridAmountRow2;	
		
		@FindBy(xpath="//td[@id='AccountAmount_col_3-1']")
		private static WebElement  billRefGridAccountRow3;
		
		@FindBy(xpath="//td[@id='AccountAmount_col_3-2']")
		private static WebElement  billRefGridAmountRow3;
		
		 public boolean checkSavingRecepitsVocherForValidatingConsolidateWhenBothAccountsAreSame() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		 {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
				finacinalsMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
				financialsTransactionMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
				cashAndBankMenu.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
				receiptsVoucher.click();
				
				Thread.sleep(2000);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
				newBtn.click();
				
				checkValidationMessage("Screen Opened");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
		        newCashBankAccountTxt.click();
				
				newCashBankAccountTxt.sendKeys(Keys.SPACE);
				
		        int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();
		    	
		        System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);
		        
		    	for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
		    	{
		    		String data		  = cashAndBAnkAccountList.get(i).getText();
		    		
		    		if(data.equalsIgnoreCase("Consolidate_When_Both_Accounts_Are_Same"))
					{
		    			cashAndBAnkAccountList.get(i).click();
						
						break;
					}
				}
		    	
		    	newCashBankAccountTxt.sendKeys(Keys.TAB);
		    	
		    	
		    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
				departmentTxt.click();
				departmentTxt.sendKeys(Keys.SPACE);
				Thread.sleep(2000);
				int departmentcount=departmentListCount.size();
				
				System.err.println(departmentcount);
					
				for(int i=0 ; i < departmentcount ;i++)
				{
					String data=departmentListCount.get(i).getText();
					
					if(data.equalsIgnoreCase("INDIA"))
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
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
				enter_AccountTxt.click();
				enter_AccountTxt.sendKeys("Customer A");
				Thread.sleep(3000);
				enter_AccountTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
				enter_Amount.sendKeys("100");
				enter_Amount.sendKeys(Keys.TAB);
				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
				select2ndRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
				enter_AccountTxt.click();
				enter_AccountTxt.sendKeys("Customer B");
				Thread.sleep(3000);
				enter_AccountTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
				enter_Amount.sendKeys("200");
				enter_Amount.sendKeys(Keys.TAB);
				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
				select3rdRow_1stColumn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
				enter_AccountTxt.click();
				enter_AccountTxt.sendKeys("Customer A");
				Thread.sleep(3000);
				enter_AccountTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
				enter_Amount.sendKeys("300");
				enter_Amount.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
				voucherSaveBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridAccountRow1));
				billRefGridAccountRow1.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
				newReferenceTxt.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
				pickBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridAccountRow2));
				billRefGridAccountRow2.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
				newReferenceTxt.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
				pickBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridAccountRow3));
				billRefGridAccountRow3.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
				newReferenceTxt.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
				pickBtn.click();
		       
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
				billRefOkBtn.click();
				
		       System.out.println("*********************************************************************************************************");
		       
				String expMessage1 = "Voucher saved successfully";
				String expMessage2 = " : 2";
				String actMessage = checkValidationMessage(expMessage1);
		 
		       if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
		       {
					return true;
		       }
		       else
		       {
		    	   return false;
		       }	
			}
			
	
		 
		 
		 
		 
			 
			public boolean checkLedgerReportForConsolidateWhenBothAccountsAreSame() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
				financialsMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
				financialsReportsMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
				ledger.click();
				
				Thread.sleep(3000);
				
				int rowcount=stockLedgerHometableRowCount.size();
				
				System.out.println(rowcount);
				
				for (int i = 0; i < rowcount; i++) 
				{
					String actName = stockLedgerHometableItemNamesList.get(i).getText();
					
					System.out.println(actName);
					
					if(actName.equalsIgnoreCase("Consolidate_When_Both_Accounts_Are_Same"))
					{
						stockLedgerHometableItemChkboxList.get(i).click();
						break;
					}
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
				sl_DateOptionDropdown.click();
				Select s=new Select(sl_DateOptionDropdown);
				s.selectByValue("1");
				
				Thread.sleep(2000);
			
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
				String expRow1List = "[Consolidate_When_Both_Accounts_Are_Same ConsolidateWhenBothAccountsAreSame]";
				
				
				int report2ndRowListCount = report2ndRowList.size();
				ArrayList<String> report2ndRowListArray = new ArrayList<String>();
				for(int i=2;i<report2ndRowListCount;i++)
				{
					String data = report2ndRowList.get(i).getText();
					report2ndRowListArray.add(data);
				}
				String actRow2List = report2ndRowListArray.toString();
				String expRow2List = "[Rct : 2, Customer A, 400.00, , 400.00, 28.00, , 28.00, 400.00, , 400.00, Indian Rupees]";
				
				
				int report3rdRowListCount = report3rdRowList.size();
				ArrayList<String> report3rdRowListArray = new ArrayList<String>();
				for(int i=2;i<report3rdRowListCount;i++)
				{
					String data = report3rdRowList.get(i).getText();
					report3rdRowListArray.add(data);
				}
				String actRow3List = report3rdRowListArray.toString();
				String expRow3List = "[Rct : 2, Customer B, 200.00, , 600.00, 14.00, , 42.00, 200.00, , 600.00, Indian Rupees]";
				
				
				int report4thRowListCount = report4thRowList.size();
				ArrayList<String> report4thRowListArray = new ArrayList<String>();
				for(int i=1;i<report4thRowListCount;i++)
				{
					String data = report4thRowList.get(i).getText();
					report4thRowListArray.add(data);
				}
				String actRow4List = report4thRowListArray.toString();
				String expRow4List = "[Total, , , 600.00, , 600.00, 42.00, , 42.00, 600.00, , 600.00, ]";

				
				
				System.out.println("************************************checkLedgerReportForConsolidateWhenBothAccountsAreSame********************************************");
				
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
						
				if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List) 
					  && actRow4List.equalsIgnoreCase(expRow4List))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
	
			
			
			
			
			
			
			// Consolidate Always
			
			
			public static boolean checkCreatingAccountForConsolidateAlways() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
			    
			    Thread.sleep(2000);
			    
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			    nameTxt.sendKeys("Consolidate_Always");
			    
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("ConsolidateAlways");
			    
				Thread.sleep(2000);
				
				Select accountTypeDrpdwn = new Select(accountTypeDropdown);
			    
				accountTypeDrpdwn.selectByVisibleText("Cash");
				
			    System.out.println("***********************************checkCreatingAccountForConsolidateAlways*********************************");
			    
		  	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				 
				String expMessage = "Saved Successfully";
				
				String actMessage = checkValidationMessage(expMessage);
		    	
				if(actMessage.equalsIgnoreCase(expMessage))
				{	
					return true;
				}	 
				else
				{
					return false;
				}
		     }
			
			 
			
			
			
			
			
			public static boolean checkMasterAccountEnablingConsolidateAlwaysInProperties() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				
				Thread.sleep(3000);
				
				int count = masterGridBodyName.size();
				
				ArrayList<String> AccountNames = new ArrayList<String>();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					AccountNames.add(data);
					
					if (data.equalsIgnoreCase("Consolidate_Always")) 
					{
						getAction().contextClick(masterGridBodyChkbox.get(i)).build().perform();
						break;
					}
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAccountPropertiesBtn));
				selectAccountPropertiesBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(consolidateAlwaysRadioBtn));
				consolidateAlwaysRadioBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
				okBtnInAccountProperties.click();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					AccountNames.add(data);
					
					if (data.equalsIgnoreCase("Consolidate_Always")) 
					{
						getAction().contextClick(masterGridBodyChkbox.get(i)).build().perform();
						break;
					}
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAccountPropertiesBtn));
				selectAccountPropertiesBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(consolidateAlwaysRadioBtn));
				
				boolean actconsolidateAlwaysRadioBtn = consolidateAlwaysRadioBtn.isSelected();
				boolean expconsolidateAlwaysRadioBtn = true;
				
				System.out.println("***********************************checkMasterAccountEnablingConsolidateAlwaysInProperties*********************************");
				
				System.out.println("consolidateAlwaysRadioBtn  : "+actconsolidateAlwaysRadioBtn+"  Value Expected  "+expconsolidateAlwaysRadioBtn);
						
				if(actconsolidateAlwaysRadioBtn==expconsolidateAlwaysRadioBtn)
				{	
					return true;
				}	 
				else
				{
					return false;
				}
			 }
			
			
			
			
			
			
	
	
	 
	
	 public boolean checkSavingRecepitsVocherForValidatingConsolidateAlways() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finacinalsMenu));
			finacinalsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
			financialsTransactionMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
			cashAndBankMenu.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
			receiptsVoucher.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			
			checkValidationMessage("Screen Opened");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCashBankAccountTxt));
	        newCashBankAccountTxt.click();
			
			newCashBankAccountTxt.sendKeys(Keys.SPACE);
			
	        int cashAndBAnkAccountListCount  = cashAndBAnkAccountList.size();
	    	
	        System.err.println("cashAndBAnkAccountListCount   : "+cashAndBAnkAccountListCount);
	        
	    	for (int i = 0; i < cashAndBAnkAccountListCount; i++) 
	    	{
	    		String data		  = cashAndBAnkAccountList.get(i).getText();
	    		
	    		if(data.equalsIgnoreCase("Consolidate_Always"))
				{
	    			cashAndBAnkAccountList.get(i).click();
					
					break;
				}
			}
	    	
	    	newCashBankAccountTxt.sendKeys(Keys.TAB);
	    	
	    	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.click();
			departmentTxt.sendKeys(Keys.SPACE);
			Thread.sleep(2000);
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("INDIA"))
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
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys("Customer A");
			Thread.sleep(3000);
			enter_AccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			enter_Amount.sendKeys("100");
			enter_Amount.sendKeys(Keys.TAB);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
			select2ndRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys("Customer B");
			Thread.sleep(3000);
			enter_AccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			enter_Amount.sendKeys("200");
			enter_Amount.sendKeys(Keys.TAB);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select3rdRow_1stColumn));
			select3rdRow_1stColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AccountTxt));
			enter_AccountTxt.click();
			enter_AccountTxt.sendKeys("Customer C");
			Thread.sleep(3000);
			enter_AccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Amount));
			enter_Amount.sendKeys("300");
			enter_Amount.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));	
			voucherSaveBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridAccountRow1));
			billRefGridAccountRow1.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			newReferenceTxt.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
			pickBtn.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridAccountRow2));
			billRefGridAccountRow2.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			newReferenceTxt.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
			pickBtn.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefGridAccountRow3));
			billRefGridAccountRow3.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReferenceTxt));
			newReferenceTxt.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
			pickBtn.click();
	       
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			billRefOkBtn.click();
			
	       System.out.println("*********************************************************************************************************");
	       
			String expMessage1 = "Voucher saved successfully";
			String expMessage2 = " : 3";
			String actMessage = checkValidationMessage(expMessage1);
	 
	       if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2))
	       {
				return true;
	       }
	       else
	       {
	    	   return false;
	       }	
		}
		

	 
	 
	 
	 
		 
		public boolean checkLedgerReportForConsolidateAlways() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
			ledger.click();
			
			Thread.sleep(3000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("Consolidate_Always"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			Thread.sleep(2000);
		
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
			String expRow1List = "[Consolidate_Always ConsolidateAlways]";
			
			
			int report2ndRowListCount = report2ndRowList.size();
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			for(int i=2;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
			}
			String actRow2List = report2ndRowListArray.toString();
			String expRow2List = "[Rct : 3, Customer C, 600.00, , 600.00, 42.00, , 42.00, 600.00, , 600.00, Indian Rupees]";
			
			
			int report3rdRowListCount = report3rdRowList.size();
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			for(int i=1;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdRowListArray.add(data);
			}
			String actRow3List = report3rdRowListArray.toString();
			String expRow3List = "[Total, , , 600.00, , 600.00, 42.00, , 42.00, 600.00, , 600.00, ]";
			
			
			System.out.println("************************************checkLedgerReportForConsolidateAlways********************************************");
			
			System.out.println("actRow1List  : "+actRow1List);
			System.out.println("expRow1List  : "+expRow1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow2List  : "+actRow2List);
			System.out.println("expRow2List  : "+expRow2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow3List  : "+actRow3List);
			System.out.println("expRow3List  : "+expRow3List);
			System.out.println("*********************************************************************");
					
			if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	
	
 
	
	
		
		
		
		
		// Active and In Active 
		
		public static boolean checkAccouncreatedWithPropertAsStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
	
			Thread.sleep(2000);
	
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 Thread.sleep(2000);
			 
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

		
		
		



		@FindBy(xpath="//*[@id='ddlStatus']")
		private static WebElement statusDropDownInAcoountProperties;

		public static boolean checkPropertiesForCreatedAccountAsDisplayWhenStatusIsActive() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int count = masterGridBodyName.size();
			
			ArrayList<String> AccountNames = new ArrayList<String>();
			
			for (int i = 0; i < count; i++) 
			{
				String data = masterGridBodyName.get(i).getText();
				AccountNames.add(data);
				
				if (data.equalsIgnoreCase("cust_display_when_StatusIsActive")) 
				{
					masterGridBodyChkbox.get(i).click();
					break;
				}
			}
			
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			masterPropertiesBtn.click();
			Thread.sleep(2000);
	
			Select statusDropdown = new Select(statusDropDownInAcoountProperties);
	
			statusDropdown.selectByVisibleText("Active");	
			
			Thread.sleep(2000);
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();
	
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			masterPropertiesBtn.click();
			
			Thread.sleep(2000);
	
			String actStatus = statusDropdown.getFirstSelectedOption().getText();	
			String expStatus = "Active";
					
			Thread.sleep(2000);
	
			System.out.println("Status : "+actStatus+"  Value Expected  "+expStatus);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();

			if (actStatus.equalsIgnoreCase(expStatus)) 
			{
				return true;
			} 
			else
			{
				return false;
			}
		}
				
				
			
		
		
		
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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
		customerAccountTxt.sendKeys("cust_Display_when_StatusIsActive");
		Thread.sleep(3000);
		customerAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

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
			
			if(data.equalsIgnoreCase("India"))
			{
				departmentListCount.get(i).click();
				
				Thread.sleep(1000);
				
				break;
			}
		}
			
		departmentTxt.sendKeys(Keys.TAB);	
		
		Thread.sleep(2000);

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
		Thread.sleep(3000);
		jurisdictionTxt.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.sendKeys("Hyderabad");
		Thread.sleep(3000);
		enter_WarehouseTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.sendKeys("STD RATE COGS ITEM");
		Thread.sleep(3000);
		enter_ItemTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
		select1stRow_5thColumn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys("1");
		enter_AQTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
		select1stRow_12thColumn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.click();
		enter_Vat.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();

		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 String expTransactionmsg="This Transaction will make the Stock Negative.";
		 String actTransactionmsg =checkValidationMessage(expTransactionmsg);
		 
		 String expSavingMessage1 = "Voucher saved successfully";
		 String expSavingMessage2 = " : 6";
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



			
		public static boolean checkCustomerStatementsReportForCustDisplayWhenStatusIsActive() throws InterruptedException
		{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			 	financialsMenu.click();
			 	
			 	Thread.sleep(2000);
			 	
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
			 	receivableAndPayableAnalysisMenu.click();
			 	
			 	Thread.sleep(2000);
			 	
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
			 	customerDetailMenu.click();
			 	
			 	Thread.sleep(2000);
			 	
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
			 	customerDetailsCustomerStatementsReport.click();
			 	
			 	Thread.sleep(2000);
			 	
			 	int rowcount=stockLedgerHometableRowCount.size();
				
				System.out.println(rowcount);
				
				for (int i = 0; i < rowcount; i++) 
				{
					String actName = stockLedgerHometableItemNamesList.get(i).getText();
					
					System.out.println(actName);
					
					if(actName.equalsIgnoreCase("cust_Display_when_StatusIsActive"))
					{
						stockLedgerHometableItemChkboxList.get(i).click();
						break;
					}
				}
			 	
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			 	Select s=new Select(sl_DateOptionDropdown);
			 	s.selectByValue("1");
			 	
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			 	sl_OkBtn.click();
			 	
			    Thread.sleep(3000);
		 
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
				if (i==13) 
				{
					reportsByWarehouseRow2ListArray.add("Delay in Payment");
				} 
				else 
				{
					reportsByWarehouseRow2ListArray.add(data);
				}
			}
			
			Calendar cal=Calendar.getInstance();
			SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		    String currentDate = f.format(cal.getTime());
			
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[cust_Display_when_StatusIsActive, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, Indian Rupees, "+currentDate+", custActive]";
	
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				if (i==13) 
				{
					reportsByWarehouseRow3ListArray.add("Delay in Payment");
				}
				else 
				{
					reportsByWarehouseRow3ListArray.add(data);
				}
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[Total, , , 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, , , ]";
	
	
			System.out.println("*********************************checkCustomerStatementsReportForCustDisplayWhenStatusIsActive*****************************************");
	
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
		
		
		
		
				
				
		
		public static boolean checkReportDetailsInLedgerReportPageForCustomerAccountStatusAsActive() throws InterruptedException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
			ledger.click();
			
			Thread.sleep(3000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("cust_Display_when_StatusIsActive"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			Thread.sleep(2000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
		
			Thread.sleep(1500);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
	
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
	
	
			System.out.println("*********************************checkReportDetailsInLedgerReportPageForCustomerAccountStatusAsActive*****************************************");
	
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
		
		
		
		
		
		
		// In Active
		
		public static boolean checkChangeAccountPropertyFromActiveToInActive() throws InterruptedException
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
			 
			 int count = masterGridBodyName.size();
				
			 ArrayList<String> AccountNames = new ArrayList<String>();
			
			 for (int i = 0; i < count; i++) 
			 {
				String data = masterGridBodyName.get(i).getText();
				AccountNames.add(data);
				
				if (data.equalsIgnoreCase("cust_display_when_StatusIsActive")) 
				{
					masterGridBodyChkbox.get(i).click();
					break;
				}
			 }
			
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			 masterPropertiesBtn.click();
				
			 Thread.sleep(2000);
			 
			 Select statusDropdown = new Select(statusDropDownInAcoountProperties);
				
			statusDropdown.selectByVisibleText("In Active");	
			
			Thread.sleep(2000);
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();
	
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			masterPropertiesBtn.click();
			
			Thread.sleep(2000);
	
			String actStatus = statusDropdown.getFirstSelectedOption().getText();	
			String expStatus = "In Active";
					
			Thread.sleep(2000);
	
			System.out.println("Status : "+actStatus+"  Value Expected  "+expStatus);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();

			if (actStatus.equalsIgnoreCase(expStatus)) 
			{
				return true;
			} 
			else
			{
				return false;
			}
		}
		

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
	    
	    @FindBy(xpath="//*[@id='dashName']")
		private static WebElement dashboard;
		
		
		@FindBy(xpath="//div[@id='chartdiv0']")
		public static WebElement dashboardGraph;
					
		@FindBy(xpath="//div[@id='DBdashlate1']")
		public static WebElement dashboardLedger;
		
		@FindBy(xpath="//div[@id='DBdashlate2']")
		public static WebElement dashboardInfoPanel;
		
		
		
	
		public static boolean checkLogoutAndLoginToCheckCustomerStatementsReports() throws InterruptedException
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
			
			String compname="Account Properties And Customization";
			
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
	
	
			String expuserInfo            ="SU";
			String expLoginCompanyName    ="Account Properties And Customization ";
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
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
			 customerDetailsCustomerStatementsReport.click();
			 	
		 	Thread.sleep(2000);
		 	
		 	int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("cust_Display_when_StatusIsActive"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			 
			 Thread.sleep(2000);
			 
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		 		Select s=new Select(sl_DateOptionDropdown);
		 		s.selectByValue("1");
		 	
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		 		sl_OkBtn.click();
		 	
		 		Thread.sleep(3000);			 
				
		 		boolean actTableIsEmpty = ledgerTable.getText().isEmpty();
				boolean expTableIsEmpty = true; 
				
				System.out.println("****************************************checkCustomerStatementsReportisEmpty************************************");
				
				System.out.println("Ledger Table isEmpty : "+actTableIsEmpty+"  Value Expected  "+expTableIsEmpty);
			 
			if (actTableIsEmpty==expTableIsEmpty)
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
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
			ledger.click();
			
			Thread.sleep(3000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("cust_Display_when_StatusIsActive"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			Thread.sleep(2000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
		
			Thread.sleep(1500);
			
			boolean actTableIsEmpty = ledgerTable.getText().isEmpty();
			boolean expTableIsEmpty = true; 
	
			System.out.println("*********************************checkLedgerIsEmptyForCustomerAccountStatusAsInActive*****************************************");
	
			System.out.println("Ledger Table isEmpty : "+actTableIsEmpty+"  Value Expected  "+expTableIsEmpty);
			 
			if (actTableIsEmpty==expTableIsEmpty)
			{
				return true;
			} 
			else
			{
				return false;
			}
		}
		
		
		
		
		
		
				
				
				
		// Do not restrict the selection even if rights are not allotted
		
		public static boolean checkCreatingAccountForDoNotRestrictTheSelectionEvenIfRightsAreNotAllotted() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
		    
		    Thread.sleep(2000);
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		    nameTxt.sendKeys("DoNot_Restrict_If_Rights_Are_Not_Allotted");
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys("DoNotRestrictIfRightsAreNotAllotted");
		    
			Thread.sleep(2000);
			
			Select accountTypeDrpdwn = new Select(accountTypeDropdown);
		    
			accountTypeDrpdwn.selectByVisibleText("Customer");
			
		    System.out.println("***********************************checkCreatingAccountForDoNotRestrictTheSelectionEvenIfRightsAreNotAllotted*********************************");
		    
	  	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			 
			String expMessage = "Saved Successfully";
			
			String actMessage = checkValidationMessage(expMessage);
	    	
			if(actMessage.equalsIgnoreCase(expMessage))
			{	
				return true;
			}	 
			else
			{
				return false;
			}
	     }
		
				
		
		
		
		
		
		//Home Menu Security Menu
		@FindBy (xpath="//*[@id='6']/span")
	    private static WebElement securityMenu;
		
		
		@FindBy(xpath="//span[contains(text(),'Create User')]")
		private static WebElement createUserMenu;

		@FindBy(xpath="//i[@class='icon-font6 icon-create-user']")
		private static WebElement createUserIcon;
		
		@FindBy(xpath="//i[@class='icon-font6 icon-group']")
		private static WebElement createUserCreateGroupIcon;

		@FindBy(xpath="//i[@class='icon-font6 icon-cancel']")
		private static WebElement createUserCancelIcon;

		@FindBy(xpath="//input[@id='loginName']")
		private static WebElement createUserLoginNameTxt;

		@FindBy(xpath="//select[@id='ERPRoles']")
		private static WebElement createUserERPRoleDropDown;

		@FindBy(xpath="//select[@id='passwordPolicy']")
		private static WebElement createUserPasswordPolicyDropdown;

		@FindBy(xpath="//input[@id='password']")
		private static WebElement createUserPasswordTxt;

		@FindBy(xpath="//input[@id='confirmpassword']")
		private static WebElement createUserConfirmPasswordTxt;

		@FindBy(xpath="//input[@id='Username']")
		private static WebElement createUserNameTxt;

		@FindBy(xpath="//input[@id='lginAbbr']")
		private static WebElement createUserLoginAbbrivationTxt;

		@FindBy(xpath="//select[@id='SecurityQues']")
		private static WebElement createUserSecurityQuestionDropDown;

		@FindBy(xpath="//input[@id='SecurityAns']")
		private static WebElement createUserSecurityAnswerTxt;

		@FindBy(xpath="//select[@id='language']")
		private static WebElement createUserLanguageTxt;

		@FindBy(xpath="//select[@id='altLanguage']")
		private static WebElement createUserAlternateLanguageTxt;

		@FindBy(xpath="//i[@class='icon-unlock-user icon-font6']")
		private static WebElement createUserUnlockUserIcon;

		@FindBy(xpath="//i[@class='icon-move-user icon-font6']")
		private static WebElement createUserMoveUserIcon;

		@FindBy(xpath="//i[@class='icon-reset icon-font6']")
		private static WebElement createUserResetIcon;

		@FindBy(xpath="//span[@id='btnLoadFrom']")
		private static WebElement createUserLoadFromIcon;	
		
		@FindBy(xpath="//span[@id='btnSave']//i[@class='icon-save icon-font6']")
		private static WebElement createUserSaveIcon;

		@FindBy(xpath="//i[@class='icon-close icon-font6']")
		private static WebElement createUserCloseIcon;

		@FindBy(xpath="//input[@id='emailId']")
		private static WebElement createUserEmailTxt;
		
		@FindBy(xpath="//input[@id='Emailpassword']")
		private static WebElement createUserEmailPasswordTxt;
		
		@FindBy(xpath="//input[@id='phone']")
		private static WebElement createUserPhoneTxt;
		
		@FindBy(xpath="//input[@id='mobile']")
		private static WebElement createUserMobileTxt;
		
		@FindBy(xpath="//input[@id='IsEmailAuthPermission']")
		private static WebElement createUserSetPermissionForEmailAuthorizationChkBox;
		
		@FindBy(xpath="//select[@id='DominSecurityMping']")
		private static WebElement createUserDomainUserMappingDrpDwn;
		
		@FindBy(xpath="//input[@id='domainUserName']")
		private static WebElement createUserDomainUserMappingTxt;
		
		@FindBy(xpath="//input[@id='ipAddr1']")
		private static WebElement createUserUserValuesTxt1;
		
		@FindBy(xpath="//input[@id='ipAddr2']")
		private static WebElement createUserUserValuesTxt2;
		
		@FindBy(xpath="//input[@id='ipAddr3']")
		private static WebElement createUserUserValuesTxt3;
		
		@FindBy(xpath="//input[@id='ipAddr4']")
		private static WebElement createUserUserValuesTxt4;
		
		@FindBy(xpath="//input[@id='ipAddr5']")
		private static WebElement createUserUserValuesTxt5;
		
		@FindBy(xpath="//select[@id='typeOfUser']")
		private static WebElement createUserUserTypeDrpDwn;
		
		@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
		private static WebElement createUserUserTypeCombo;
		
		@FindBy(xpath="//select[@id='crmRoles']")
		private static WebElement createUserCRMRolesDrpDwn;
		
		@FindBy(xpath="//input[@id='UserTypeMobile']")
		private static WebElement createUserMobileChkBox;
		
		@FindBy(xpath="//input[@id='UserTypeOffline']")
		private static WebElement createUserOfflineChkBox;
		
		@FindBy(xpath="//input[@id='UserTypeWeb']")
		private static WebElement createUserWebChkBox;
		
		@FindBy(xpath="//select[@id='ERPRoles']/option")
		private static List<WebElement> createUserERPRolesDropdownOptions;
		
		@FindBy(xpath="//select[@id='passwordPolicy']//option[6]")
		private static WebElement getNumericValue;
		 
		@FindBy(xpath="//select[@id='language']")
		private static WebElement getLanguage;
		 
		@FindBy(xpath="//select[@id='altLanguage']")
		private static WebElement getAltLanguage;
		
		@FindBy(xpath="//select[@id='language']/option")
		private static List<WebElement> createUserLanguageDropdownList;
		
		@FindBy(xpath="//select[@id='altLanguage']/option")
		private static List<WebElement> createUserAltLanguageDropdownList;
		 
		@FindBy(xpath="//span[contains(text(),'Additional Info')]")
		private static WebElement createUserAdditionalInfoTab;
		
		@FindBy(xpath="//span[contains(text(),'Restriction for entry')]")
		private static WebElement createUserRestrictionforentryTab;
		
		@FindBy(xpath="//div[@id='RestrictionEntryMasters']/ul/li[@id='1']")
		private static WebElement restrictEntryMasterAccount;
		
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[2]")
		private static WebElement restrictForEntryTable1stRow1stCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[3]")
		private static WebElement restrictForEntryTable1stRow2ndCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[4]")
		private static WebElement restrictForEntryTable1stRow3rdCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[1]/td[5]")
		private static WebElement restrictForEntryTable1stRow4thCol;
		
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[2]")
		private static WebElement restrictForEntryTable2ndRow1stCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[3]")
		private static WebElement restrictForEntryTable2ndRow2ndCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[4]")
		private static WebElement restrictForEntryTable2ndRow3rdCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[2]/td[5]")
		private static WebElement restrictForEntryTable2ndRow4thCol;
		
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[3]/td[2]")
		private static WebElement restrictForEntryTable3rdRow1stCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[3]/td[3]")
		private static WebElement restrictForEntryTable3rdRow2ndCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[3]/td[4]")
		private static WebElement restrictForEntryTable3rdRow3rdCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[3]/td[5]")
		private static WebElement restrictForEntryTable3rdRow4thCol;
		
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[4]/td[2]")
		private static WebElement restrictForEntryTable4thRow1stCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[4]/td[3]")
		private static WebElement restrictForEntryTable4thRow2ndCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[4]/td[4]")
		private static WebElement restrictForEntryTable4thRow3rdCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[4]/td[5]")
		private static WebElement restrictForEntryTable4thRow4thCol;
		
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[5]/td[2]")
		private static WebElement restrictForEntryTable5thRow1stCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[5]/td[3]")
		private static WebElement restrictForEntryTable5thRow2ndCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[5]/td[4]")
		private static WebElement restrictForEntryTable5thRow3rdCol;
		
		@FindBy(xpath="//tbody[@id='restrictionEntryTable_body']/tr[5]/td[5]")
		private static WebElement restrictForEntryTable5thRow4thCol;
		
		
		
		@FindBy(xpath="//input[@id='MasteroptionControl']")
		private static WebElement restrictForEntryTableMastersCombo;
		
		@FindBy(xpath="//input[@id='chkEntry_1_2']")
		private static WebElement restrictForEntryTableRow1EntryChkbox;
		
		@FindBy(xpath="//input[@id='chkReport_1_3']")
		private static WebElement restrictForEntryTableRow1ReportChkbox;
		
		@FindBy(xpath="//input[@id='chkView_1_4']")
		private static WebElement restrictForEntryTableRow1ViewChkbox;
		
		
		
		@FindBy(xpath="//input[@id='chkEntry_2_2']")
		private static WebElement restrictForEntryTableRow2EntryChkbox;
		
		@FindBy(xpath="//input[@id='chkReport_2_3']")
		private static WebElement restrictForEntryTableRow2ReportChkbox;
		
		@FindBy(xpath="//input[@id='chkView_2_4']")
		private static WebElement restrictForEntryTableRow2ViewChkbox;
		
		
		
		@FindBy(xpath="//input[@id='chkEntry_3_2']")
		private static WebElement restrictForEntryTableRow3EntryChkbox;
		
		@FindBy(xpath="//input[@id='chkReport_3_3']")
		private static WebElement restrictForEntryTableRow3ReportChkbox;
		
		@FindBy(xpath="//input[@id='chkView_3_4']")
		private static WebElement restrictForEntryTableRow3ViewChkbox;
		

		
		@FindBy(xpath="//input[@id='chkEntry_4_2']")
		private static WebElement restrictForEntryTableRow4EntryChkbox;
		
		@FindBy(xpath="//input[@id='chkReport_4_3']")
		private static WebElement restrictForEntryTableRow4ReportChkbox;
		
		@FindBy(xpath="//input[@id='chkView_4_4']")
		private static WebElement restrictForEntryTableRow4ViewChkbox;
		
		
		@FindBy(xpath="//input[@id='chkExclusion']")
		private static WebElement restrictForEntryExclusionChkbox;
		
		
		
		
		
		
		
		public boolean checkUserCreationForRestrictionOfAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
							
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
			securityMenu.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
			createUserMenu.click();
			
			Thread.sleep(5000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
			 createUserIcon.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
			 createUserLoginNameTxt.click();
			 createUserLoginNameTxt.sendKeys("AccountRestrictUser");

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
			 createUserERPRoleDropDown.click();
			 createUserERPRoleDropDown.sendKeys("SampleRole1");
			 
		     int count = createUserERPRolesDropdownOptions.size()-1;
			 System.out.println("Count "+ count);
		    
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
			 createUserPasswordTxt.sendKeys("12345");

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
			 createUserConfirmPasswordTxt.sendKeys("12345");
			 	
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
			 createUserNameTxt.sendKeys("UserForAccountRestriction");
			 	
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginAbbrivationTxt));
			 createUserLoginAbbrivationTxt.sendKeys("UFAR");
			 
			 createUserSecurityQuestionDropDown.click();
			 Select s = new Select(createUserSecurityQuestionDropDown);
			 s.selectByVisibleText("In which county were you born?");

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityAnswerTxt));	
			 createUserSecurityAnswerTxt.sendKeys("India");
			 	 	
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
			 createUserAdditionalInfoTab.click();

			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
			 Select user = new Select(createUserUserTypeDrpDwn);
			 user.selectByVisibleText("Customer");
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
			 createUserEmailTxt.click();
			 createUserEmailTxt.clear();
			 createUserEmailTxt.sendKeys("accountrestrection@focussoftnet.com");
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserRestrictionforentryTab));
			 createUserRestrictionforentryTab.click();

			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictEntryMasterAccount));
			 restrictEntryMasterAccount.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTable1stRow1stCol));
			 restrictForEntryTable1stRow1stCol.click();
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableMastersCombo));
			 restrictForEntryTableMastersCombo.sendKeys("Vendor B");
			 Thread.sleep(3000);
			 restrictForEntryTableMastersCombo.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow1EntryChkbox));
			 restrictForEntryTableRow1EntryChkbox.click();
			 restrictForEntryTableRow1EntryChkbox.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow1ReportChkbox));
			 restrictForEntryTableRow1ReportChkbox.click();
			 restrictForEntryTableRow1ReportChkbox.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow1ViewChkbox));
			 restrictForEntryTableRow1ViewChkbox.click();
			 restrictForEntryTableRow1ViewChkbox.sendKeys(Keys.TAB);
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableMastersCombo));
			 restrictForEntryTableMastersCombo.sendKeys("Display_Un-Realize_GainOrLoss_In_Ledger");
			 Thread.sleep(3000);
			 restrictForEntryTableMastersCombo.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow2EntryChkbox));
			 restrictForEntryTableRow2EntryChkbox.click();
			 restrictForEntryTableRow2EntryChkbox.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow2ReportChkbox));
			 restrictForEntryTableRow2ReportChkbox.click();
			 restrictForEntryTableRow2ReportChkbox.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow2ViewChkbox));
			 restrictForEntryTableRow2ViewChkbox.click();
			 restrictForEntryTableRow2ViewChkbox.sendKeys(Keys.TAB);
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableMastersCombo));
			 restrictForEntryTableMastersCombo.sendKeys("Sales - Computers");
			 Thread.sleep(3000);
			 restrictForEntryTableMastersCombo.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow3EntryChkbox));
			 restrictForEntryTableRow3EntryChkbox.click();
			 restrictForEntryTableRow3EntryChkbox.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow3ReportChkbox));
			 restrictForEntryTableRow3ReportChkbox.click();
			 restrictForEntryTableRow3ReportChkbox.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow3ViewChkbox));
			 restrictForEntryTableRow3ViewChkbox.click();
			 restrictForEntryTableRow3ViewChkbox.sendKeys(Keys.TAB);
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableMastersCombo));
			 restrictForEntryTableMastersCombo.sendKeys("Purchase");
			 Thread.sleep(3000);
			 restrictForEntryTableMastersCombo.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow4EntryChkbox));
			 restrictForEntryTableRow4EntryChkbox.click();
			 restrictForEntryTableRow4EntryChkbox.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow4ReportChkbox));
			 restrictForEntryTableRow4ReportChkbox.click();
			 restrictForEntryTableRow4ReportChkbox.sendKeys(Keys.TAB);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(restrictForEntryTableRow4ViewChkbox));
			 restrictForEntryTableRow4ViewChkbox.click();
			 restrictForEntryTableRow4ViewChkbox.sendKeys(Keys.TAB);
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
			 createUserSaveIcon.click();
			 
			 String expMessage = "new user created successfully";
			 String actMessage = checkValidationMessage(expMessage);
			 
			 System.out.println(actMessage);
			 System.out.println(expMessage);
			 
		     if (actMessage.equalsIgnoreCase(expMessage)) 
		     {
		    	 return true;
		 	 } 
		 	 else 
		 	 {
				return false;
		 	 }
		}

		
		
		
		
		
		
		
		
		public static boolean checkSavingSalesInvoivesVATWithCustomerAccountAsDoNotRestrictIfRightsAreNotAllotted() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
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
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			    	
			checkValidationMessage("Screen opened");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.sendKeys("DoNot_Restrict_If_Rights_Are_Not_Allotted");
			Thread.sleep(3000);
			customerAccountTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
			departmentTxt.sendKeys(Keys.SPACE);
				
			int departmentcount=departmentListCount.size();
			
			System.err.println(departmentcount);
				
			for(int i=0 ; i < departmentcount ;i++)
			{
				String data=departmentListCount.get(i).getText();
				
				if(data.equalsIgnoreCase("INDIA"))
				{
					departmentListCount.get(i).click();
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
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
			enter_AQTxt.sendKeys("1");
			enter_AQTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
			enter_FQTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
			select1stRow_11thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("200");
			enter_Rate.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.click();
			enter_Gross.sendKeys(Keys.TAB);
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
			select1stRow_17thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
			enter_Vat.click();
			enter_Vat.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_18thColumn));
			select1stRow_18thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Taxable));
			enter_Taxable.click();
			
			Thread.sleep(2000);*/
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			 voucherSaveBtn.click();
			
			 Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			 billRefPickIcon.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			 billRefOkBtn.click();
			 
			 String expTransactionmsg="This Transaction will make the Stock Negative.";
			 String actTransactionmsg =checkValidationMessage(expTransactionmsg);
			 
			 String expSavingMessage1 = "Voucher saved successfully";
			 String expSavingMessage2 = " : 7";
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
		
		
		
		
		
		
		public static boolean checkLogoutAndLoginWithAccountRestrictUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			userNameDisplay.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
			
			Thread.sleep(4000);
			
			LoginPage lp=new LoginPage(getDriver()); 
				
		    String unamelt="AccountRestrictUser";
		  
		    String pawslt="12345";
		    
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
			
			
			
			String compname="Account Properties And Customization";
			
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
			
		    
		    String expuserInfo            ="AccountRestrictUser";
		    String expLoginCompanyName    ="Account Properties And Customization ";
		    String expDashboard			  ="Graph with Active and setAsDefault";
		   
			
			System.out.println("***********************************checkLogin*********************************");
		    
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
		
		
		
		
		@FindBy(xpath="//table[@id='landgridData']/tbody")
		private static WebElement reportAccountsTable;
		
		
		public boolean checkLedgerReportForUserRestrictAccountWithoutEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
			ledger.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
			masterSearchTxt.click();
			masterSearchTxt.sendKeys("DoNot_Restrict_If_Rights_Are_Not_Allotted");
			masterSearchTxt.sendKeys(Keys.ENTER);
			
			Thread.sleep(3000);
			
			String actRestrictedAccount = reportAccountsTable.getText();
			String expRestrictedAccount = "No record found";
			
			System.out.println("************************************checkLedgerReportForUserRestrictAccountWithoutEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption********************************************");
			
			System.out.println("Restricted Account : "+actRestrictedAccount+"  Value Expected  "+expRestrictedAccount);
			
			if(actRestrictedAccount.equalsIgnoreCase(expRestrictedAccount))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		@FindBy(xpath="//tbody[@id='tblBodyTransRender']/tr/td[4]")
		private static List<WebElement> voucherNumberList;
		
		
		
		
		public static boolean checkSalesInvoivesVATWithOutEnablingDoNotRestrictIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
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
			
			int actNoOfVouchers = voucherNumberList.size()-1;
			int expNoOfVouchers = 1;
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			    	
			checkValidationMessage("Screen opened");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			
			boolean restrict = true;
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.sendKeys(Keys.SPACE);
			Thread.sleep(3000);
			
			int count = customerAccountComboList.size();
			
			for (int i = 0; i < count; i++) 
			{
				String data = customerAccountComboList.get(i).getText();
				
				if (data.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted")) 
				{
					restrict = false;
					System.err.println("***Account is Displaying Even After Restricting***");
					break;
				}
			}
			
			System.out.println("********checkSalesInvoivesVATWithOutEnablingDoNotRestrictIfRightsAreNotAllottedOption********");
			
			System.out.println("No Of Vouchers Displaying            : "+actNoOfVouchers +"  Value Expected  "+expNoOfVouchers);
			System.out.println("Restricted Account Is Not Displaying : "+restrict        +"  Value Expected  "+"true");
			
			
			if(actNoOfVouchers==expNoOfVouchers && restrict==true)
			{
				getDriver().navigate().refresh();
				Thread.sleep(2000);
				return true;
			}
			else
			{
				getDriver().navigate().refresh();
				Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		
		
		public static boolean checkMasterAccountEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		    homeMenu.click();
			
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		    mastersMenu.click();
		     
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		    accounts.click();
		    
			Thread.sleep(3000);
			
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			
			int count = masterGridBodyName.size();
			
			ArrayList<String> AccountNames = new ArrayList<String>();
			
			for (int i = 0; i < count; i++) 
			{
				String data = masterGridBodyName.get(i).getText();
				AccountNames.add(data);
				
				if (data.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted")) 
				{
					getAction().contextClick(masterGridBodyChkbox.get(i)).build().perform();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAccountPropertiesBtn));
			selectAccountPropertiesBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox));
			doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();
			
			for (int i = 0; i < count; i++) 
			{
				String data = masterGridBodyName.get(i).getText();
				AccountNames.add(data);
				
				if (data.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted")) 
				{
					getAction().contextClick(masterGridBodyChkbox.get(i)).build().perform();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAccountPropertiesBtn));
			selectAccountPropertiesBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox));
			
			boolean actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox = doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox.isSelected();
			boolean expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox = true;
			
			System.out.println("***********************************checkMasterAccountEnablingDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption*********************************");
			
			System.out.println("doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox  : "+actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox+"  Value Expected  "+expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox);
					
			if(actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox==expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox)
			{	
				return true;
			}	 
			else
			{
				return false;
			}
		 }
				
				
				
		
		
		
		
		
		
		public boolean checkLedgerReportForUserRestrictAccountWithDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
			ledger.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
			masterSearchTxt.click();
			masterSearchTxt.sendKeys("DoNot_Restrict_If_Rights_Are_Not_Allotted");
			masterSearchTxt.sendKeys(Keys.ENTER);
			
			Thread.sleep(3000);

			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			Thread.sleep(2000);
		
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
			String expRow1List = "[DoNot_Restrict_If_Rights_Are_Not_Allotted DoNotRestrictIfRightsAreNotAllotted]";
			
			
			int report2ndRowListCount = report2ndRowList.size();
			ArrayList<String> report2ndRowListArray = new ArrayList<String>();
			for(int i=2;i<report2ndRowListCount;i++)
			{
				String data = report2ndRowList.get(i).getText();
				report2ndRowListArray.add(data);
			}
			String actRow2List = report2ndRowListArray.toString();
			String expRow2List = "[NDT55 : 7, Sales - Computers, 200.00, , 200.00, 14.00, , 14.00, 200.00, , 200.00, Indian Rupees]";
			
			
			int report3rdRowListCount = report3rdRowList.size();
			ArrayList<String> report3rdRowListArray = new ArrayList<String>();
			for(int i=1;i<report3rdRowListCount;i++)
			{
				String data = report3rdRowList.get(i).getText();
				report3rdRowListArray.add(data);
			}
			String actRow3List = report3rdRowListArray.toString();
			String expRow3List = "[Total, , , 200.00, , 200.00, 14.00, , 14.00, 200.00, , 200.00, ]";
			

			System.out.println("************************************checkLedgerReportForUserRestrictAccountWithDoNotRestrictTheSelectionEvenIfRightsAreNotAllottedOption********************************************");
			
			System.out.println("actRow1List  : "+actRow1List);
			System.out.println("expRow1List  : "+expRow1List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow2List  : "+actRow2List);
			System.out.println("expRow2List  : "+expRow2List);
			System.out.println("*********************************************************************");
					
			System.out.println("actRow3List  : "+actRow3List);
			System.out.println("expRow3List  : "+expRow3List);
			System.out.println("*********************************************************************");
					
			if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) && actRow3List.equalsIgnoreCase(expRow3List))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		
		
		
		public static boolean checkSalesInvoivesVATAfterEnablingDoNotRestrictIfRightsAreNotAllottedOption() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
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
			
			int actNoOfVouchers = voucherNumberList.size()-1;
			int expNoOfVouchers = 2;
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
			newBtn.click();
			    	
			checkValidationMessage("Screen opened");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
			
			
			boolean restrict = false;
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
			customerAccountTxt.sendKeys(Keys.SPACE);
			Thread.sleep(3000);
			
			int count = customerAccountComboList.size();
			
			for (int i = 0; i < count; i++) 
			{
				String data = customerAccountComboList.get(i).getText();
				
				if (data.equalsIgnoreCase("DoNot_Restrict_If_Rights_Are_Not_Allotted")) 
				{
					restrict = true;
					break;
				}
			}
			
			System.out.println("********checkSalesInvoivesVATAfterEnablingDoNotRestrictIfRightsAreNotAllottedOption********");
			
			System.out.println("No Of Vouchers Displaying            : "+actNoOfVouchers +"  Value Expected  "+expNoOfVouchers);
			System.out.println("Restricted Account Is Not Displaying : "+restrict        +"  Value Expected  "+"true");
			
			
			if(/*actNoOfVouchers==expNoOfVouchers &&*/ restrict==true)
			{
				getDriver().navigate().refresh();
				Thread.sleep(2000);
				return true;
			}
			else
			{
				getDriver().navigate().refresh();
				Thread.sleep(2000);
				return false;
			}
		}
		
		
		
		
		
		
		
		// Display ledger by currency
		
		
		public static boolean checkAccouncreatedWithPropertyAsDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			
			Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 Thread.sleep(2000);
			 
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

		
		
		

		public static boolean checkPropertiesForCreatedAccountAsDisplayLedgerByCurrency() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("cust_display_ledger_by_currency"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			masterPropertiesBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayLedgerByCurrencyCheckboxInProperties));
			displayLedgerByCurrencyCheckboxInProperties.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			masterPropertiesBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayLedgerByCurrencyCheckboxInProperties));
			
			boolean actdisplayLedgerByCurrencyCheckboxInProperties = displayLedgerByCurrencyCheckboxInProperties.isSelected();
			boolean expdisplayLedgerByCurrencyCheckboxInProperties = true;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
			okBtnInAccountProperties.click();
			
			System.out.println("displayLedgerByCurrencyCheckboxInProperties : "+actdisplayLedgerByCurrencyCheckboxInProperties+"  VAlue Expected  "+expdisplayLedgerByCurrencyCheckboxInProperties);
			
			
			if (actdisplayLedgerByCurrencyCheckboxInProperties==expdisplayLedgerByCurrencyCheckboxInProperties) 
			{
				return true;
			} 
			else
			{
				return false;
			}
		}

		
		
		
		@FindBy (xpath="//*[@id='chkGenerateLedgerByCurrency']")
		public static WebElement displayLedgerByCurrencyCheckboxInProperties;



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
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
			select1stRow_8thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
			enter_AQTxt.sendKeys("1");
			enter_AQTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
			enter_FQTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
			select1stRow_12thColumn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
			select1stRow_14thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
			enter_Rate.sendKeys("200");
			enter_Rate.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
			enter_Gross.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
			select1stRow_17thColumn.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
			enter_Vat.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
			 voucherSaveBtn.click();
			
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
			 billRefPickIcon.click();
			 
			 Thread.sleep(2000);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
			 billRefOkBtn.click();
			 
			String expTransactionmsg= "This transaction will make stock negative.";
			String actTransactionmsg=checkValidationMessage(expTransactionmsg);
			 
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

		
		
		
		
		

		public static boolean checkLedgerDetailsForCustomerDisplayLedgerByCurrency() throws InterruptedException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
			financialsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
			financialsReportsMenu.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
			ledger.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
			masterSearchTxt.click();
			masterSearchTxt.sendKeys("cust_display_ledger_by_Currency");
			masterSearchTxt.sendKeys(Keys.ENTER);
			
			Thread.sleep(3000);

			int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("cust_display_ledger_by_Currency"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
			sl_DateOptionDropdown.click();
			Select s=new Select(sl_DateOptionDropdown);
			s.selectByValue("1");
			
			Thread.sleep(2000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
			sl_OkBtn.click();
		
			Thread.sleep(1500);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
			 
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
			String expRow3List = "[29/01/2021, NDT55 : 8, Sales - Computers, 210.00, , 210.00, 14.70, , 14.70, 210.00, , 210.00, Indian Rupees]";
			
			
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
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		 	financialsMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		 	receivableAndPayableAnalysisMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		 	customerDetailMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
		 	customerDetailsCustomerStatementsReport.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("cust_display_ledger_by_Currency"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		 	Select s=new Select(sl_DateOptionDropdown);
		 	s.selectByValue("1");
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		 	sl_OkBtn.click();
		 	
		    Thread.sleep(3000);

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
				if (i==13) 
				{
					reportsByWarehouseRow2ListArray.add("Delay in Payment");	
				}
				else 
				{
					reportsByWarehouseRow2ListArray.add(data);
				}
			}
			String actRow2List = reportsByWarehouseRow2ListArray.toString();
			String expRow2List = "[NDT55:8, 29/01/2021, cust_display_ledger_by_Currency, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, Indian Rupees, 29/01/2021, CustLedger]";
			
			
			int reportsByWarehouseRow3ListCount = reportsRow3List.size();
			ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
			for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
			{
				String data = reportsRow3List.get(i).getText();
				if (i==13) 
				{
					reportsByWarehouseRow3ListArray.add("Delay in Payment");
				} 
				else 
				{
					reportsByWarehouseRow3ListArray.add(data);
				}
				
			}
			String actRow3List = reportsByWarehouseRow3ListArray.toString();
			String expRow3List = "[Total, , , 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, , , ]";
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


		
		
		
		
		
		
		
		// Club the transactions of all the Accounts under Group
		
		@FindBy(xpath="//*[@id='btnNew']/i")
		private static WebElement  newBtnInGrp;
		
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
		
		int rowcount=stockLedgerHometableRowCount.size();
		
		System.out.println(rowcount);
		
		for (int i = 0; i < rowcount; i++) 
		{
			String actName = stockLedgerHometableItemNamesList.get(i).getText();
			
			System.out.println(actName);
			
			if(actName.equalsIgnoreCase("Cust_ClubTransactionsOf_AllAccounts_Group"))
			{
				getAction().doubleClick(stockLedgerHometableItemChkboxList.get(i)).build().perform();
				break;
			}
		}

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


		Thread.sleep(3000);
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
		
		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);

		if(actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage) && actSaveAccountMessage1.equalsIgnoreCase(expSaveAccountMessage1) 
			   && actSaveAccountMessage2.equalsIgnoreCase(expSaveAccountMessage2))
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
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 int rowcount=stockLedgerHometableRowCount.size();
				
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("Cust_ClubTransactionsOf_AllAccounts_Group"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
			 

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties));
		ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties));
		
		boolean actClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties = ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties.isSelected();
		boolean expClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties = true;


		System.out.println("ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties   :" + actClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties+ "  Value Expected : " + expClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties);

		if (actClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties==expClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
		}

		
		
		@FindBy (xpath="//*[@id='rbnDisplayDebitCreditTotalForEachAccountUnderGroup']")
		public static WebElement displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties;
		
		
		@FindBy (xpath="//*[@id='rbnClubTranOfAllAcctsUnderGrpWhenDispInLedger']")
		public static WebElement ClubTheTransactionsOfAllTheAccountsUnderGroupRadioBtnInProperties;



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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");

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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys("1");
		enter_AQTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
		select1stRow_12thColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();

		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 String expSavingMessage1 = "This transaction will make stock negative.";

		 String actSavingMessage = checkValidationMessage(expSavingMessage1);
		 
		 
		 String expSavingMessage2 = "Voucher saved successfully";

		 String actSavingMessage1 = checkValidationMessage(expSavingMessage2);

		if(actSavingMessage1.startsWith(expSavingMessage2))
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
			Thread.sleep(3000);
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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys("1");
		enter_AQTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
		select1stRow_12thColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		 String expSavingMessage = "This transaction will make stock negative.";

		 String actSavingMessage = checkValidationMessage(expSavingMessage);
		 
		 
		

		String expSavingMessage1 = "Voucher saved successfully";
		String expSavingMessage2 = " : 10";
		String actSavingMessage1 = checkValidationMessage(expSavingMessage1);

		if(actSavingMessage1.startsWith(expSavingMessage1) && actSavingMessage1.endsWith(expSavingMessage2))
		{
		return true;
		}
		else
		{
		return false;
		}

		}


		public static boolean checkCustomerStatementsReportDetailsForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup() throws InterruptedException
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		 	financialsMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		 	receivableAndPayableAnalysisMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		 	customerDetailMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
		 	customerDetailsCustomerStatementsReport.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("Cust_ClubTransactionsOf_AllAccounts_Group"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		 	Select s=new Select(sl_DateOptionDropdown);
		 	s.selectByValue("1");
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		 	sl_OkBtn.click();
		 	
		    Thread.sleep(3000);
		    
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
		for(int i=1;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			if (i==13) 
			{
				reportsByWarehouseRow2ListArray.add("Delay in Payment");
			} 
			else 
			{
				reportsByWarehouseRow2ListArray.add(data);
			}
		}
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	    String currentDate = f.format(cal.getTime());
		
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[NDT55:10, "+currentDate+", cust-club trans of all accts two, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, Indian Rupees, "+currentDate+", custTwo]";


		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			if (i==13) 
			{
				reportsByWarehouseRow3ListArray.add("Delay in Payment");
			}
			else 
			{
				reportsByWarehouseRow3ListArray.add(data);
			}
			
		}
		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[NDT55:9, "+currentDate+", cust-club trans of all accts One, 210.00, , , 210.00, 420.00, 210.00, , , 210.00, Delay in Payment, Indian Rupees, "+currentDate+", custOne]";


		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			if (i==13) 
			{
				reportsByWarehouseRow4ListArray.add("Delay in Payment");
			} 
			else 
			{
				reportsByWarehouseRow4ListArray.add(data);
			}
		}
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[Grand Total, , , 420.00, , , 420.00, 630.00, 420.00, , , 420.00, Delay in Payment, , , ]";

		System.out.println("*********************************checkCustomerStatementsReportDetailsForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup*****************************************");

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
		
		
		
		
		
		
		
		
		
		// Display Debit/Credit totals for each Account under group
		
		
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

		int rowcount=stockLedgerHometableRowCount.size();
		
		System.out.println(rowcount);
		
		for (int i = 0; i < rowcount; i++) 
		{
			String actName = stockLedgerHometableItemNamesList.get(i).getText();
			
			System.out.println(actName);
			
			if(actName.equalsIgnoreCase("Cust_Display Debit/Credit totals for each Account under group"))
			{
				getAction().doubleClick(stockLedgerHometableItemChkboxList.get(i)).build().perform();
				break;
			}
		}

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

		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);

		if(actSaveAccountMessage.equalsIgnoreCase(expSaveAccountMessage) && actSaveAccountMessage1.equalsIgnoreCase(expSaveAccountMessage1)
				&& actSaveAccountMessage2.equalsIgnoreCase(expSaveAccountMessage2))
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
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));		
			 mastersMenu.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));		
			 accounts.click();
			 
			 Thread.sleep(2000);
			 
			 int rowcount=stockLedgerHometableRowCount.size();
				
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("Cust_Display Debit/Credit totals for each Account under group"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}


			Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties));
		displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties.click();
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties));
		boolean actdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties = displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties.isSelected();
		boolean expdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties = true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAccountProperties));
		okBtnInAccountProperties.click();


		System.out.println("displayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties :" + actdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties+ "     Value Expected : " + expdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties);

		if (actdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties==expdisplayDebitCreditTotalsForEachAccountUnderGroupRadioBtnInProperties) 
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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		    	
		checkValidationMessage("Screen opened");
		    	
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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys("1");
		enter_AQTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
		select1stRow_12thColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		 voucherSaveBtn.click();

		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		 billRefPickIcon.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		 billRefOkBtn.click();
		 
		 String expSavingMessage = "This transaction will make stock negative.";

		 String actSavingMessage = checkValidationMessage(expSavingMessage);
		
		 String expSavingMessage1 = "Voucher saved successfully";

		 String actSavingMessage1 = checkValidationMessage(expSavingMessage1);

		if(actSavingMessage1.startsWith(expSavingMessage1))
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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
		select1stRow_8thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
		enter_AQTxt.sendKeys("1");
		enter_AQTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
		enter_FQTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_12thColumn));
		select1stRow_12thColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.sendKeys("200");
		enter_Rate.sendKeys(Keys.TAB);


		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_17thColumn));
		select1stRow_17thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Vat));
		enter_Vat.sendKeys(Keys.TAB);


		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefPickIcon));
		billRefPickIcon.click();

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefOkBtn));
		billRefOkBtn.click();
		
		 String expSavingMessage = "This transaction will make stock negative.";

		 String actSavingMessage = checkValidationMessage(expSavingMessage);
		 
		String expSavingMessage1 = "Voucher saved successfully";
		String expSavingMessage2 = " : 12";
		String actSavingMessage1 = checkValidationMessage(expSavingMessage1);

		if(actSavingMessage1.startsWith(expSavingMessage1) && actSavingMessage1.endsWith(expSavingMessage2))
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
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		 	financialsMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		 	receivableAndPayableAnalysisMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		 	customerDetailMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailsCustomerStatementsReport));
		 	customerDetailsCustomerStatementsReport.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	int rowcount=stockLedgerHometableRowCount.size();
			
			System.out.println(rowcount);
			
			for (int i = 0; i < rowcount; i++) 
			{
				String actName = stockLedgerHometableItemNamesList.get(i).getText();
				
				System.out.println(actName);
				
				if(actName.equalsIgnoreCase("Cust_Display Debit/Credit totals for each Account under group"))
				{
					stockLedgerHometableItemChkboxList.get(i).click();
					break;
				}
			}
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		 	Select s=new Select(sl_DateOptionDropdown);
		 	s.selectByValue("1");
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		 	sl_OkBtn.click();
		 	
		    Thread.sleep(3000);

		int reportsByWarehouseRow1ListCount = reportsRow1List.size();
		ArrayList<String> reportsByWarehouseRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow1ListCount;i++)
		{
			String data = reportsRow1List.get(i).getText();
			reportsByWarehouseRow1ListArray.add(data);
		}
		String actRow1List = reportsByWarehouseRow1ListArray.toString();
		String expRow1List = "[Cust_Display Debit/Credit totals for each Account under group]";

		Calendar cal=Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	    String currentDate = f.format(cal.getTime());
		
		int reportsByWarehouseRow2ListCount = reportsRow2List.size();
		ArrayList<String> reportsByWarehouseRow2ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow2ListCount;i++)
		{
			String data = reportsRow2List.get(i).getText();
			if (i==13) 
			{
				reportsByWarehouseRow2ListArray.add("Delay in Payment");
			} 
			else 
			{
				reportsByWarehouseRow2ListArray.add(data);
			}
			reportsByWarehouseRow2ListArray.add(data);
		}
		String actRow2List = reportsByWarehouseRow2ListArray.toString();
		String expRow2List = "[cust-club trans of all accts One, 210.00, , , 210.00, 210.00, 210.00, , , 210.00, Delay in Payment, Indian Rupees, "+currentDate+", custOne]";


		int reportsByWarehouseRow3ListCount = reportsRow3List.size();
		ArrayList<String> reportsByWarehouseRow3ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow3ListCount;i++)
		{
			String data = reportsRow3List.get(i).getText();
			if (i==13) 
			{
				reportsByWarehouseRow3ListArray.add("Delay in Payment");
			} 
			else 
			{
				reportsByWarehouseRow3ListArray.add(data);
			}
		}

		String actRow3List = reportsByWarehouseRow3ListArray.toString();
		String expRow3List = "[cust-club trans of all accts two, 210.00, , , 210.00, 420.00, 210.00, , , 210.00, Delay in Payment, Indian Rupees, "+currentDate+", custTwo]";


		int reportsByWarehouseRow4ListCount = reportsRow4List.size();
		ArrayList<String> reportsByWarehouseRow4ListArray = new ArrayList<String>();
		for(int i=1;i<reportsByWarehouseRow4ListCount;i++)
		{
			String data = reportsRow4List.get(i).getText();
			if (i==13) 
			{
				reportsByWarehouseRow4ListArray.add("Delay in Payment");
			} 
			else 
			{
				reportsByWarehouseRow4ListArray.add(data);
			}
		}
		
		String actRow4List = reportsByWarehouseRow4ListArray.toString();
		String expRow4List = "[Total, , , 420.00, , , 420.00, 630.00, 420.00, , , 420.00, Delay in Payment, , , ]";

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

		
		public static boolean checklogoutAccountPropertiesPage() throws InterruptedException
		{
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			  userNameDisplay.click();
			 
			  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			  logoutOption.click();
			  
			  Thread.sleep(2000);
			  
			  boolean actUserLoginPage              = username.isDisplayed() && username.isEnabled()
	                                                  && password.isDisplayed() && password.isEnabled();
	                                         
			  boolean expUserLoginPage              = true;
			  
			  if(actUserLoginPage==expUserLoginPage)  
		      {
				System.out.println("***Test Pass: Login Successfull***");
				
				return true;
			  }
		      else
		      {
		  	 
				System.out.println("***Test Fail: Login Not Successfull***");
				
				return false;
			  }
			}
		

		 public AccountPropertiesPage(WebDriver driver)
		 {
			PageFactory.initElements(driver, this);
			
		 }

		
		
		
}
