package com.focus.Pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.focus.base.BaseEngine;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRowFactory;
import org.omg.IOP.ExceptionDetailMessage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
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
import org.openqa.selenium.interactions.Actions;



public class ReportDesignerPage extends BaseEngine
{
	//Logout and Login Screen
	
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
    
    
	    
		 
	public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 
	        
	        try 
	        {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
				doNotShowCheckbox.click();
				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDemoPopupScreen));
				closeBtnInDemoPopupScreen.click(); 
				
				System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");
				
			} 
	        catch (Exception e)
	        {
	        	System.err.println("NO POP UP DISPLAYED");
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
	
	
	
	}
	
	 private static String xlfile;
	 private static String resPass="Pass";
	 private static String resFail="Fail";
	 private static ExcelReader excelReader;

	 private static int cSize;
	 
	 
		@FindBy(xpath="//*[@id='dashName']")
	    private static WebElement labelDashboard ;
		
		@FindBy(xpath="//*[@id='Select_dash']")
		private static WebElement selectDashboard ;
			
		@FindBy(xpath="//*[@id='Dashboard_AddDash']")
	    private static WebElement newAddDashBoard;
		 
	    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
        private static WebElement dashboardCustomizationSettings;
	
	public static boolean checkLoginForReportDesigner() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
	    
		/*String compname="Automation Company";
		
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
		}*/
	
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
		
	    
	    
	    String expuserInfo            ="SU";
	    String expLoginCompanyName    ="Automation Company ";
	    String expDashboard			  ="Graph with Active and setAsDefault";
	    boolean expdashboardGraph	  =true;
		boolean expdashboardLedger    =true;
		boolean expdashboardInfoPanel =true;
		String expAccountsTitle       ="Account";
		
		System.out.println("***********************************checkOpenAccountsMenu*********************************");
	    
	    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
	    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
	  
		if(userInfo.equalsIgnoreCase(expuserInfo) && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	 }
	

	@FindBy(xpath="//a[@id='22']//span[contains(text(),'Report Designer')]")
	private static WebElement reportDesignerMenu;
	
	@FindBy(xpath="//span[@class='icon-xmlimport icon-font6']")
	private static WebElement importFromExcelBtn;
	
	@FindBy(xpath="//div[@id='myNavbar']//ul[@class='nav navbar-nav navbar-right']")
	private static WebElement exportFromExcelBtn;
	
	@FindBy(xpath="//div[contains(text(),'Reset')]")
	private static WebElement restartBtn;
	
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	private static WebElement deleteBtn;
	
	@FindBy(xpath="//div[@id='myNavbar']//ul[@class='nav navbar-nav navbar-right']")
	private static WebElement backTab;
	
	@FindBy(xpath="//div[@onclick='RD_ENTRY.onNext_Click();']//div[@class='col-sm-12 toolbar_button_image']")
	private static WebElement nextTab;
	
	@FindBy(xpath="//span[@class='icon-ok icon-font6']")
	private static WebElement finishBtn;
	
	@FindBy(xpath="//span[@class='icon-close icon-font6']")
	private static WebElement cancelBtn;
	
	@FindBy(xpath="//div[@class='btn col-xs-12 header_button_group stop_text_overflow theme_background-color-inverse theme_color-inverse']")
	private static WebElement definitionTab;
	
	@FindBy(xpath="//input[@id='id_rd_definition_reportname']")
	private static WebElement reportNameDropdown;


	@FindBy(xpath="//select[@id='id_rd_definition_reporttype']")
	private static WebElement reportTypeDropdown; 	
	
	@FindBy(xpath="//input[@id='advanceEngine']")
	private static WebElement advanceEngineCkeckbox;


	@FindBy(xpath="//select[@id='id_rd_definition_modules']")
	private static WebElement moduleDropdown;
	
	
	
	@FindBy(xpath="//select[@id='id_rd_definition_datasets']")
	private static WebElement dataSetDropdown;


	@FindBy(xpath="//input[@id='id_rd_parameter_entry_fieldname']")
	private static WebElement fieldNameTextbox;
	
	@FindBy(xpath="//input[@id='id_rd_parameter_entry_variablename']")
	private static WebElement variablenameTextbox;


	@FindBy(xpath="//select[@id='id_rd_parameter_entry_fieldtype']")
	private static WebElement fieldTypeDropddown;
	
	@FindBy(xpath="//input[@id='id_rd_parameter_entry_viewname']")
	private static WebElement viewnameTextBox;


	@FindBy(xpath="//input[@id='id_rd_parameter_entry_valuecolumn']")
	private static WebElement valueColoumTextBox;
	
	@FindBy(xpath="//input[@id='id_rd_parameter_entry_displaycolumn']")
	private static WebElement displayColumnTexBox;
	
	@FindBy(xpath="//input[@onclick='RD_ENTRY.PARAMETER.onOK_Click();']")
	private static WebElement okBtn;
	
	@FindBy(xpath="//input[@onclick='RD_ENTRY.PARAMETER.onCancel_Click();']")
	private static WebElement cancelBtnatLast;
	
	@FindBy(xpath="//input[@value='Add']")
	private static WebElement addBtn;
	
	@FindBy(xpath="//input[@onclick='RD_ENTRY.PARAMETER.onDelete_Click();']")
	private static WebElement deleteBtnatLast;
	
	@FindBy (xpath="//*[@id='1']/div/span")
    public static WebElement homeMenu;
	
	
	  @FindBy (xpath="//*[@id='navigation_menu']/li[1]/ul/li[5]/ul/li")
	  private static List<WebElement> utilitesList;
	  
	  @FindBy(xpath="//a[@id='20']//span[contains(text(),'Utilities')]")
		private static WebElement  utilities;
	  
	  @FindBy(xpath="//*[@id='id_menu_tree_135']/a/i")
	  private static WebElement  inventoryExpandBtn;
	  
	 /* @FindBy(xpath="//*[@id='id_menu_tree_60']/a/span")
	  private static WebElement  finanincalExpandbtn;*/
	  
	  @FindBy(xpath="//*[@id='id_menu_tree_60']/a/i")
	  private static WebElement  finanincalExpandbtn;
	  
	  
	  @FindBy(xpath="//*[@id='id_menu_tree_81']/a/span")
	  private static WebElement  finanincalReportsExpandbtn;
	  
	
	  
	  @FindBy(xpath="	//*[@id='id_menu_tree_200']/a/span")
	  private static WebElement  reportsBtn;
	  
		//DATA SET Tab
		
		
		@FindBy(xpath="//*[@id='id_rd_header_button_group_2']/div[1]")
		private static WebElement dataSetTab;
		
		@FindBy(xpath="//span[@id='id_rd_customization_transet_tab_add']")
		private static WebElement plusBtn;
		
		
		@FindBy(xpath="//select[@id='id_rd_transet0_documentstatus']")
		private static WebElement documentStatsDropdown;
		
		
		@FindBy(xpath="//select[@id='id_rd_transet0_verificationstatus']")
		private static WebElement verificationDropdown;
		
		
		@FindBy(xpath="//select[@id='id_rd_transet0_authorizationstatus']")
		private static WebElement authorizationStatusDropdown;
		
		
		@FindBy(xpath="//select[@id='id_rd_transet0_brsstatus']")
		private static WebElement brsStatusDropdown;
		
		
		@FindBy(xpath="//span[@id='idFilterCustomizeIcon']")
		private static WebElement customizeIcon;
		
		
		@FindBy(xpath="//span[@id='a']")
		private static WebElement filterIcon;
		
		@FindBy(xpath="//*[@id='id_rd_transet0_select']/li")
		private static List<WebElement> transactionSetList;
		
		// Customization Tab
		
		@FindBy(xpath="//*[@id='id_rd_header_button_group_3']/div[1]/span[2]")
		private static WebElement customizationTab;
		
		
		@FindBy(xpath="//div[@id='id_rd_customization_columnproperty']//div[@class='col-sm-12 toolbar_button_image']")
		private static WebElement columnPropertyTab;
		
		
		@FindBy(xpath="//input[@id='id_rd_customization_tree_search']")
		private static WebElement searchBox;
		
		
		@FindBy(xpath="//span[@class='icon-searchnumaric icon-font6']")
		private static WebElement searchNumericIcon;
		
		
		@FindBy(xpath="//span[@class='glyphicon glyphicon-text-color']")
		private static WebElement searchStringItemIcon;
		
		
		@FindBy(xpath="//span[@class='icon-left-and-right-panel-icon icon-font6']")
		private static WebElement closingPanelIcon;
		
		
		@FindBy(xpath="//input[@value='Create Virtual Field']")
		private static WebElement createVirtualFieldBox;
		
		//Row Formatting Tab
		
		
		
		@FindBy(xpath="//div[@id='id_rd_customization_rowformatting']//div[@class='col-sm-12 toolbar_button_image']")
		private static WebElement rowFormattingTab;
		
		
		@FindBy(xpath="//input[@id='rfnew']")
		private static WebElement newBtn;
		
		
		@FindBy(xpath="//input[@id='rfdelete']")
		private static WebElement deleteBtnInRf;
		
		
		@FindBy(xpath="//select[@id='id_set_on_column']")
		private static WebElement setOnColumnDropdown;
		
		
		@FindBy(xpath="//input[@id='id_label_for_condition']")
		private static WebElement labelForConditionTextBox;
		
		
		@FindBy(xpath="//div[@id='id_rowformatting_browsefile_ctrl_container']//table")
		private static WebElement imageForCondtionFileElement;
		
		
		@FindBy(xpath="//span[@class='icon-edit icon-font7 theme_color-inverse FAttachment_Img']")
		private static WebElement imageForConitionNeworEditFile;
		
		@FindBy(xpath="//input[@id='id_rf_font']")
		private static WebElement fontBtn;
		
		
		@FindBy(xpath="//input[@id='id_DontUseAbsoluteValue']")
		private static WebElement useDefaultValueCheckBox;
		
		
		@FindBy(xpath="//input[@id='rfok']")
		private static WebElement okBtnAtLast;
		
		
		@FindBy(xpath="//input[@id='rfclear']")
		private static WebElement cancelBtnAtLast;
		
		//SORTING TAB
		
		
		@FindBy(xpath="//div[@id='id_rd_customization_sorting']//div[contains(@class,'col-sm-12 toolbar_button_image')]")
		private static WebElement sortingTab;
		
		@FindBy(xpath="//i[contains(@class,'fa fa-caret-right fa-2x')]")
		private static WebElement forwardBtn;
		
		
		@FindBy(xpath="//i[contains(@class,'fa fa-caret-left fa-2x')]")
		private static WebElement backwardBtn;
		
		@FindBy(xpath="//select[@id='id_rd_customization_sorting_select']")
		private static WebElement noneDropdown;
		
		
		@FindBy(xpath="//input[@id='id_rd_customization_sorting_rows']")
		private static WebElement emptyTextArea;
		
		@FindBy(xpath="//input[contains(@onclick,'RD_ENTRY.CUSTOMIZATION.SORTING.onOK_Click(event);')]")
		private static WebElement okButton;
		
		
		@FindBy(xpath="//input[contains(@onclick,'RD_ENTRY.on_Customization_ColumnProperty_Click();')]")
		private static WebElement cancelButton;
		
		@FindBy(xpath="//label[normalize-space()='Landscape Orientation']")
		private static WebElement landScapeOrientationTab;
		
		
		@FindBy(xpath="//l")
		private static WebElement printZeroValue;
		
		@FindBy(xpath="//div[@id='id_rd_header_button_group_4']//div[contains(@class,'btn col-xs-12 header_button_group stop_text_overflow theme_background-color theme_color')]")
		private static WebElement headerFooterTab;
		
		@FindBy(xpath="//div[@id='id_rd_header_button_group_5']//div[contains(@class,'btn col-xs-12 header_button_group stop_text_overflow theme_background-color theme_color')]")
		private static WebElement previewTab;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/a/i")
		private static WebElement transactionExpandBtn;
		
		@FindBy(xpath="//input[@id='id_rd_customization_tree_search']")
		private static WebElement custTabFieldSearchTxt;
		
		@FindBy(xpath="//*[@id='rd_customization_tree1']/a/span")
		private static WebElement custTabSearchFirstField;
		
		@FindBy(xpath="//span[contains(text(),'Date.Date')]")
		private static WebElement custTabSearchDATEField;
		
		
		@FindBy(xpath="(//li[@data-fieldname='Date']/a/i)[1]")
		private static WebElement dateExpandBtn;
		
		@FindBy(xpath="(//li[@data-fieldname='Date']/a/span)[2]")
		private static WebElement dateFieldBtn;

		@FindBy(xpath="//*[@id='rd_customization_tree1']/ul/li[7]")
		private static WebElement cashAndBankExpandBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree1']/ul/li[7]/ul/li[1]")
		private static WebElement cashAndBankNameBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree1']/ul/li[1]")
		private static WebElement acc1ExpandBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree1']/ul/li[1]/ul/li[1]")
		private static WebElement acc1NameBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree1']/ul/li[1]/ul/li[2]")
		private static WebElement acc1CodeBtn;
		
		
		@FindBy(xpath="//*[@id='rd_customization_tree1']/ul/li[2]")
		private static WebElement acc2ExpandBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree1']/ul/li[2]/ul/li[1]")
		private static WebElement acc2NameBtn;
		        
		@FindBy(xpath="//*[@id='rd_customization_tree1']/ul/li[2]/ul/li[2]")
		private static WebElement acc2CodeBtn;
		
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[19]")
		private static WebElement docNoFieldBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[14]")
		private static WebElement Rec_docNoFieldBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[19]")
		private static WebElement rec_FooterAmtBtn;
		
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[40]")
		private static WebElement rec_VoucherNameBtn;
		
		
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[29]")
		private static WebElement itemExpandBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[29]/ul/li[1]")
		private static WebElement itemNameBtn;
		
		

		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[34]")
		private static WebElement itemExpandBtn1;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[34]/ul/li[1]")
		private static WebElement itemNameBtn1;
		
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[34]/ul/li[2]")
		private static WebElement itemCodeBtn1;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[50]")
		private static WebElement quantityBtn1;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[49]")
		private static WebElement quantityBtn2;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[52]")
		private static WebElement rateBtn2;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[45]")
		private static WebElement quantityBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[48]")
		private static WebElement rateBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[26]")
		private static WebElement grossBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[5]")
		private static WebElement deptExpandBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[2]")
		private static WebElement Rec_deptExpandBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[2]/ul/li[1]")
		private static WebElement rec_deptNameBtn;
		
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[5]/ul/li[1]")
		private static WebElement deptNameBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[24]")
		private static WebElement warehouseExpandBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[24]/ul/li[1]")
		private static WebElement warehouseNameBtn;
		
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[31]")
		private static WebElement warehouseExpandBtn1;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[31]/ul/li[1]")
		private static WebElement warehouseNameBtn1;
		
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[35]")
		private static WebElement warehouseExpandBtn2;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[35]/ul/li[1]")
		private static WebElement warehouseNameBtn2;
		
		
		
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/ul/li[2]/ul/li[24]/ul/li[2]")
		private static WebElement warehouseCodeBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree310']/a/span")
		private static WebElement voucherAliasBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree1618']/a/span")
		private static WebElement voucherNameBtn;
		
		@FindBy (xpath="//select[@id='id_rd_transet0_select_documentclass']")
		private static WebElement dataSetTabVouchersTab;
		
		@FindBy (xpath="//select[@id='id_rd_transet0_select_documenttype']")
		private static WebElement dataSetTabVouchersDocType;
		
		
		@FindBy (xpath="//*[@id='rd_customization_tree0']/ul/li[1]/a/i")
		private static WebElement transactionFieldsExpandBtn;
		
		@FindBy (xpath="//*[@id='rd_customization_tree0']/ul/li[2]/a/i")
		private static WebElement extraFieldsExpandBtn;
		
		
		
		

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

/*String compname="User Restrictions--COGS";*/
String compname="Billwise";

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
		
		
 	public static boolean checkSavingReportDesignerOfAllTransactionsOfDocumentClass() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
 		
 		
 		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("All transactions of document class of Purchase Type");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Details");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryExpandBtn));
 		inventoryExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsBtn));
 		reportsBtn.click();
 		
 		
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("All transactions of document class"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		Select voucher = new Select(dataSetTabVouchersTab);
 		voucher.selectByVisibleText("Purchases Vouchers");
 		
 		Thread.sleep(2000);
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateExpandBtn));
 		dateExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateFieldBtn));
 		getAction().doubleClick(dateFieldBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateExpandBtn));
 		dateExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(docNoFieldBtn));
 		getAction().doubleClick(docNoFieldBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
 		itemExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn));
 		getAction().doubleClick(itemNameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
 		itemExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(quantityBtn));
 		getAction().doubleClick(quantityBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateBtn));
 		getAction().doubleClick(rateBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grossBtn));
 		getAction().doubleClick(grossBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deptExpandBtn));
 		deptExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deptNameBtn));
 		getAction().doubleClick(deptNameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deptExpandBtn));
 		deptExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn));
 		warehouseExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseNameBtn));
 		getAction().doubleClick(warehouseNameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn));
 		warehouseExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
		 
 			return true;
 		}
 		else
 		{
 			return false;
 		}
	}
	
 	
 	@FindBy(xpath="//*[@id='id_rd_definition_reportname_table_data']/tbody/tr/td")
 	private static List<WebElement> reportNameList;
 	
 	@FindBy(xpath="//*[@id='id_rd_customization_table']/thead/tr/th")
 	private static List<WebElement> customizeTabTableHeaderLsist;
	
 	

 	
 	public static boolean checkUpdatingTheSavedReportInreportDesinger() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.click();
 		reportNameDropdown.sendKeys(Keys.SPACE);
 		
 		int reportNameListcount = reportNameList.size();
 		
 		for(int i=0;i<reportNameListcount;i++)
 		{
 			String data = reportNameList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("All transactions of document class of Purchase Type"))
 			{
 				reportNameList.get(i).click();
 				break;
 			}
 		}

 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		
 		Thread.sleep(3000);
 				
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		int customizeTabTableHeaderLsistCount = customizeTabTableHeaderLsist.size();
 		System.err.println(customizeTabTableHeaderLsistCount);
 		for(int i=1;i<=customizeTabTableHeaderLsistCount;i++)
 		{
 			String data = customizeTabTableHeaderLsist.get(i).getText();
 			
 			if(data.equalsIgnoreCase("Warehouse.Name"))
 			{
 				customizeTabTableHeaderLsist.get(i).click();
 				
 				System.err.println(i);
 				Thread.sleep(1000);
 				
 				WebElement deletebtn = getDriver().findElement(By.xpath("//*[@id='rd_customization_table_column_7']/div[2]/span"));
 				
 				deletebtn.click();
 				
 				break;
 			}
 		}
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn));
 		warehouseExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseNameBtn));
 		getAction().doubleClick(warehouseNameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseCodeBtn));
 		getAction().doubleClick(warehouseCodeBtn).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn));
 		warehouseExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
		 
 			return true;
 		}
 		else
 		{
 			return false;
 		}
	}

 	
 	@FindBy(xpath="//body/section[@id='mainDiv']/div[@id='id_focus8_wrapper_default']/div[1]/section[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]")
 	private static WebElement reportDesginExportToXMLBtn;

 	
 	@FindBy(xpath="//*[@id='tblRDRender']/thead/tr[1]/th")
 	private static List<WebElement> previewTabHeaderList;
 	
 	public boolean checkHeaderAndFooterTabInReportDesiging() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
 	{
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.click();
 		reportNameDropdown.sendKeys(Keys.SPACE);
 		
 		int reportNameListcount = reportNameList.size();
 		
 		for(int i=0;i<reportNameListcount;i++)
 		{
 			String data = reportNameList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("All transactions of document class of Purchase Type"))
 			{
 				reportNameList.get(i).click();
 				break;
 			}
 		}

 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		Thread.sleep(3000);
 				
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerFooterTab));
 		headerFooterTab.click();
 		
 		Thread.sleep(3000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RDHeaderTab_WarehouseExpandBtn));
 		RDHeaderTab_WarehouseExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RDHeaderTab_WarehouseNamebtn));
 		RDHeaderTab_WarehouseNamebtn.click();

 		
 		
 		
 		return true;
 				
 		
 		 }
 	
 	
 	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a/span/i")
 	private static WebElement RDHeaderTab_TransExpandBtn;
 	

 	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/a/span/i")
 	private static WebElement RDHeaderTab_WarehouseExpandBtn;

 	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a/span")
 	private static WebElement RDHeaderTab_WarehouseNamebtn;

 	
 	
 	
 	
 	
 	
 	
 	
 	public boolean checkPreviewTabInReportDesiging() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
 	{
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.click();
 		reportNameDropdown.sendKeys(Keys.SPACE);
 		
 		int reportNameListcount = reportNameList.size();
 		
 		for(int i=0;i<reportNameListcount;i++)
 		{
 			String data = reportNameList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("All transactions of document class of Purchase Type"))
 			{
 				reportNameList.get(i).click();
 				break;
 			}
 		}

 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		Thread.sleep(3000);
 				
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previewTab));
 		previewTab.click();
 		
 		Thread.sleep(3000);
 		
 		int previewTabHeaderListCount=previewTabHeaderList.size();
 		
 		ArrayList<String >previewTabHeaderListArray=new ArrayList<>();
 		
 		for (int i = 0; i < previewTabHeaderListCount; i++)
 		{

 			String data=previewTabHeaderList.get(i).getText();
 			previewTabHeaderListArray.add(data);
 			
		}
 		String actpreviewTabHeaderList=previewTabHeaderListArray.toString();
 		String exppreviewTabHeaderList="[, Date, Document No., Quantity, Rate, Gross, Department.Name, Warehouse.Name, Warehouse.Code]";
 		
 		
 		System.out.println(" ACt List   :"+actpreviewTabHeaderList);
 		System.out.println("  Exp List  :"+exppreviewTabHeaderList);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage) && 
				actpreviewTabHeaderList.equalsIgnoreCase(exppreviewTabHeaderList))
 		{
		 
			System.out.println(" Test Pass: Preview Tab Displays as Expected ");
 			return true;
 		}
 		else
 		{
 			System.out.println(" Test Fail: Preview Tab Displays as Expected ");
 			return false;
 		}
	}
 	
 	
 	@FindBy(xpath="//input[@id='txtSearchMenu_MainLayout']")
 	private static WebElement searchTxt;
 	
	
	@FindBy(xpath="//select[@id='DateOptions_']")
	private static WebElement sl_DateOptionDropdown;
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-ok')]")
	private static WebElement sl_OkBtn;
	
	@FindBy(xpath="//input[@id='MasterGroup__101']")
	private static WebElement reportsAccountTxt;
	
	
	@FindBy(xpath="//input[@id='MasterSingle__101']")
	private static WebElement reportDepartmentTxt;
	
	
	
	@FindBy(xpath="//i[contains(@class,'icon-font6 icon-close')]")
	private static WebElement sl_CloseBtn;
	
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
 	
 	public boolean checkReportAllTransactionsOfDocumentClassOfPurchaseType() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
 		searchTxt.click();
 		searchTxt.sendKeys("All transactions of document class of Purchase Type");
 		Thread.sleep(1000);
 		searchTxt.sendKeys(Keys.ENTER);
 		
 		
 		Thread.sleep(2000);
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
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[NDT52:1, 1.00, 5.00, 5.00, DUBAI, HYDERABAD, HYDERABAD]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[NDT52:2, 1.00, 5.00, 5.00, DUBAI, HYDERABAD, HYDERABAD]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[, 2.00, 10.00, 10.00, , , ]";
		
		
		
		System.out.println("actRow1List  : "+actRow1List);
		System.out.println("expRow1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List  : "+actRow2List);
		System.out.println("expRow2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List  : "+actRow3List);
		System.out.println("expRow3List  : "+expRow3List);
		System.out.println("*********************************************************************");
				
 		if (actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List)) 
 		{
			
 			System.out.println(" Test Pass: Values Dsiplayed as Expected ");
 			return true;
		} 
 		else 
 		{

 			System.out.println(" Test FAIL: Values Dsiplayed as Expected ");
 			return false;
			
		}
 		
 		
 		
 	}
 	
 	
 	public boolean checkSavingAllTransactionsOfDocumentTypeOfPurchaseTypeToCubes() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
 	{

 		
 		
 		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("All transactions of document Type of Recepits VAT Type");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Details");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryExpandBtn));
 		inventoryExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsBtn));
 		reportsBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("All transactions of document Type"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		
 		dataSetTabVouchersDocType.click();
 		
 		dataSetTabVouchersDocType.sendKeys(Keys.ARROW_DOWN);
 		dataSetTabVouchersDocType.sendKeys(Keys.ARROW_DOWN);
 		dataSetTabVouchersDocType.sendKeys(Keys.ARROW_DOWN);
 		dataSetTabVouchersDocType.sendKeys(Keys.TAB);
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateExpandBtn));
 		dateExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateFieldBtn));
 		getAction().doubleClick(dateFieldBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateExpandBtn));
 		dateExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Rec_docNoFieldBtn));
 		getAction().doubleClick(Rec_docNoFieldBtn).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankExpandBtn));
 		cashAndBankExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankNameBtn));
 		getAction().doubleClick(cashAndBankNameBtn).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rec_FooterAmtBtn));
 		getAction().doubleClick(rec_FooterAmtBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rec_VoucherNameBtn));
 		getAction().doubleClick(rec_VoucherNameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Rec_deptExpandBtn));
 		Rec_deptExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rec_deptNameBtn));
 		getAction().doubleClick(rec_deptNameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Rec_deptExpandBtn));
 		Rec_deptExpandBtn.click();
 		
 	    Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
		 
			System.out.println(" Test PasS: Report desgining is saved with Document Type ");
 			return true;
 		}
 		else
 		{
 			System.out.println(" Test FAIL: Report desgining is saved with Document Type ");
 			return false;
 		}
	
 	}

 	
 	
 	public boolean checkReportAllTransactionsOfDocumentTypeOfRecepitsVATType() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
 		searchTxt.click();
 		searchTxt.sendKeys("All transactions of document Type of Recepits VAT Type");
 		Thread.sleep(1000);
 		searchTxt.sendKeys(Keys.ENTER);
 		
 		
 		Thread.sleep(2000);
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
		for(int i=2;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[1, Bank, , Receipts VAT, DUBAI]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=2;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[2, Bank, , Receipts VAT, DUBAI]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=2;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[3, Bank, , Receipts VAT, DUBAI]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=2;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[4, Bank, , Receipts VAT, DUBAI]";
		
		
		int report5thRowListCount = report5thRowList.size();
		ArrayList<String> report5thRowListArray = new ArrayList<String>();
		for(int i=1;i<report5thRowListCount;i++)
		{
			String data = report5thRowList.get(i).getText();
			report5thRowListArray.add(data);
		}
		String actRow5List = report5thRowListArray.toString();
		String expRow5List = "[Grand Total, , , , , ]";
		
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
				
 		if (actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List) && 
				actRow5List.equalsIgnoreCase(expRow5List)) 
 		{
 			System.out.println(" Test Pass: Values Dsiplayed as Expected ");
 			return true;
		} 
 		else 
 		{
 			System.out.println(" Test FAIL: Values Dsiplayed as Expected ");
 			return false;
		}
 	}
 	

 	
 	

 	public boolean checkSavingAccountingTransactionsOfAnAccountDetails() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
 	{

 		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("Accounting Transactions of an Account-Details");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Details");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryExpandBtn));
 		inventoryExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsBtn));
 		reportsBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("Accounting transactions of an account"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1ExpandBtn));
 		acc1ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1NameBtn));
 		getAction().doubleClick(acc1NameBtn).build().perform();
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2ExpandBtn));
 		acc2ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2NameBtn));
 		getAction().doubleClick(acc2NameBtn).build().perform();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn1));
 		itemExpandBtn1.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn1));
 		getAction().doubleClick(itemNameBtn1).build().perform();
 		
 		
 	
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn1));
 		warehouseExpandBtn1.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseNameBtn1));
 		getAction().doubleClick(warehouseNameBtn1).build().perform();
 		
 		
 	    Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
		 
			System.out.println(" Test PasS: Report desgining is saved with Document Type ");
 			return true;
 		}
 		else
 		{
 			System.out.println(" Test FAIL: Report desgining is saved with Document Type ");
 			return false;
 		}
	
 	}


 	public boolean checkReportAccountingTransactionsOfAnAccountDetails() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
 		searchTxt.click();
 		searchTxt.sendKeys("Accounting Transactions of an Account-Details");
 		Thread.sleep(1000);
 		searchTxt.sendKeys(Keys.ENTER);
 		
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		sl_DateOptionDropdown.click();
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
 		
		
		reportsAccountTxt.click();
		reportsAccountTxt.sendKeys("Customer A");
		Thread.sleep(1000);
		reportsAccountTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = report1stRowList.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = report1stRowList.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[Sales - Computers, Customer A, HYDERABAD]";
		
		
		int report2ndRowListCount = report2ndRowList.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = report2ndRowList.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Bank, Customer A, ]";
		
		
		int report3rdRowListCount = report3rdRowList.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = report3rdRowList.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[Bank, Customer A, ]";
		
		
		int report4thRowListCount = report4thRowList.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = report4thRowList.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[Sales - Computers, Customer A, HYDERABAD]";
		
		
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
		
			
 		if (actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List) ) 
 		{
 			System.out.println(" Test Pass: Values Dsiplayed as Expected ");
 			return true;
		} 
 		else 
 		{
 			System.out.println(" Test FAIL: Values Dsiplayed as Expected ");
 			return false;
		}
 	}
 	

 	
 	
 	
	public boolean checkSavingAccountingTransactionsOfAccountingTagDetails() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
 	{

 		
 		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("Accounting Transactions of Accounting Tag-Details");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Details");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryExpandBtn));
 		inventoryExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsBtn));
 		reportsBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("Accounting transactions of accounting tag"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateExpandBtn));
 		dateExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateFieldBtn));
 		getAction().doubleClick(dateFieldBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateExpandBtn));
 		dateExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(docNoFieldBtn));
 		getAction().doubleClick(docNoFieldBtn).build().perform();
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn1));
 		itemExpandBtn1.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn1));
 		getAction().doubleClick(itemNameBtn1).build().perform();
 		
 		Thread.sleep(2000);
 		
 		
 		getAction().moveToElement(acc1ExpandBtn).build().perform();

 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1ExpandBtn));
 		acc1ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1NameBtn));
 		getAction().doubleClick(acc1NameBtn).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2ExpandBtn));
 		acc2ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2NameBtn));
 		getAction().doubleClick(acc2NameBtn).build().perform();
 		
 		
 		quantityBtn1.click();
 		getAction().doubleClick(quantityBtn1).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn1));
 		warehouseExpandBtn1.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseNameBtn1));
 		getAction().doubleClick(warehouseNameBtn1).build().perform();
 		
 		
 	    Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
		 
			System.out.println(" Test PasS: Report desgining is saved with Document Type ");
 			return true;
 		}
 		else
 		{
 			System.out.println(" Test FAIL: Report desgining is saved with Document Type ");
 			return false;
 		}
	
 	}

 	
	public boolean checkReportAccountingTransactionsOfAnAccountingTagDetails() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
 		searchTxt.click();
 		searchTxt.sendKeys("Accounting Transactions of Accounting Tag-Details");
 		Thread.sleep(1000);
 		searchTxt.sendKeys(Keys.ENTER);
 		
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		/*sl_DateOptionDropdown.click();*/
		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
 		  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDepartmentTxt));
		reportDepartmentTxt.click();
		reportDepartmentTxt.sendKeys("Duabi"); 
		Thread.sleep(1000);
		reportDepartmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = reportCol3List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportCol3List.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[SU, SU, SU, SU, SU, SU, SU, SU, SU, SU, SU, SU, SU, SU, SU, SU, SU, SU]";
		
		
		int report2ndRowListCount = reportCol4List.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = reportCol4List.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Customer A, STD RATE COGS ACC INV, Bank, Bank, Customer A, SR COGS POSTING ACC, Bank, Bank, Vendor New Reference, , VAT INPUT, Vendor New Reference, Bank, , Vendor B, VAT INPUT, Vendor B, Vendor Full Adjustment]";
		
		
		int report3rdRowListCount = reportCol5List.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = reportCol5List.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[2.00, , , , 1.00, , , , 1.00, , , , , , , , 1.00, ]";
		
		
		int report4thRowListCount = reportCol6List.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = reportCol6List.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[HYDERABAD, HYDERABAD, , , HYDERABAD, HYDERABAD, , , HYDERABAD, HYDERABAD, HYDERABAD, HYDERABAD, , HYDERABAD, HYDERABAD, HYDERABAD, HYDERABAD, ]";
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_NextBtn));
		sl_NextBtn.click();
		
		Thread.sleep(3999);
		
		int reportsRow1ListCount1 = reportCol3List.size();
		ArrayList<String> reportsRow1ListArray1 = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount1;i++)
		{
			String data = reportCol3List.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List1 = reportsRow1ListArray1.toString();
		String expRow1List1 = "[]";
		
		
		int report2ndRowListCount1 = reportCol4List.size();
		ArrayList<String> report2ndRowListArray1 = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount1;i++)
		{
			String data = reportCol4List.get(i).getText();
			report2ndRowListArray1.add(data);
		}
		String actRow2List1 = report2ndRowListArray1.toString();
		String expRow2List1 = "[Bank, Journal Entries Control A/C, Journal Entries Control A/C, Bank, Bank, ]";
		
		
		int report3rdRowListCount1 = reportCol5List.size();
		ArrayList<String> report3rdRowListArray1 = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount1;i++)
		{
			String data = reportCol5List.get(i).getText();
			report3rdRowListArray1.add(data);
		}
		String actRow3List1 = report3rdRowListArray1.toString();
		String expRow3List1 = "[, , , , , 1.00]";
		
		
		int report4thRowListCount1 = reportCol6List.size();
		ArrayList<String> report4thRowListArray1 = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount1;i++)
		{
			String data = reportCol6List.get(i).getText();
			report4thRowListArray1.add(data);
		}
		String actRow4List1 = report4thRowListArray1.toString();
		String expRow4List1 = "[, , , , , ]";
		
		
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
		
		
		System.out.println("actRow1List1  : "+actRow1List1);
		System.out.println("expRow1List1  : "+expRow1List1);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List1  : "+actRow2List1);
		System.out.println("expRow2List1  : "+expRow2List1);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow3List1  : "+actRow3List1);
		System.out.println("expRow3List1  : "+expRow3List1);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow4List1  : "+actRow4List1);
		System.out.println("expRow4List1  : "+expRow4List1);
		System.out.println("*********************************************************************");
		
 		if (actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List)  && 
				
 				
				actRow1List1.equalsIgnoreCase(expRow1List1) &&
				actRow2List1.equalsIgnoreCase(expRow2List1) &&
				actRow3List1.equalsIgnoreCase(expRow3List1) && 
				actRow4List1.equalsIgnoreCase(expRow4List1)) 
 		{
 			System.out.println(" Test Pass: Values Dsiplayed as Expected ");
 			return true;
		} 
 		else 
 		{
 			System.out.println(" Test FAIL: Values Dsiplayed as Expected ");
 			return false;
		}
 	}
 	

	@FindBy(xpath="//div[@id='dvReportDetails']//tbody/tr/td[1]")
	private static List<WebElement> reportCol1List;

	@FindBy(xpath="//div[@id='dvReportDetails']//tbody/tr/td[2]")
	private static List<WebElement> reportCol2List;

	@FindBy(xpath="//div[@id='dvReportDetails']//tbody/tr/td[3]")
	private static List<WebElement> reportCol3List;

	@FindBy(xpath="//div[@id='dvReportDetails']//tbody/tr/td[4]")
	private static List<WebElement> reportCol4List;

	@FindBy(xpath="//div[@id='dvReportDetails']//tbody/tr/td[5]")
	private static List<WebElement> reportCol5List;

	@FindBy(xpath="//div[@id='dvReportDetails']//tbody/tr/td[6]")
	private static List<WebElement> reportCol6List;
	
	@FindBy(xpath="//div[@id='dvReportDetails']//tbody/tr/td[7]")
	private static List<WebElement> reportCol7List;
	
	
	@FindBy(xpath="//div[@id='dvReportDetails']//tbody/tr/td[8]")
	private static List<WebElement> reportCol8List;
	
	@FindBy(xpath="//div[@id='dvReportDetails']//tbody/tr/td[9]")
	private static List<WebElement> reportCol9List;
	
	
	
	@FindBy(xpath="//*[@id='tblFooterReportRender']//div/button[4]")
	private static WebElement sl_NextBtn;
	
	
	public boolean checkSavingAccountingTrasactionsOfInventoryTagDetails() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
 	{

 		
 		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("Accounting Trasactions of Inventory Tag-Details");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Details");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryExpandBtn));
 		inventoryExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsBtn));
 		reportsBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("Accounting transactions of inventory tag"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1ExpandBtn));
 		acc1ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1NameBtn));
 		getAction().doubleClick(acc1NameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1CodeBtn));
 		getAction().doubleClick(acc1CodeBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2ExpandBtn));
 		acc2ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2NameBtn));
 		getAction().doubleClick(acc2NameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2CodeBtn));
 		getAction().doubleClick(acc2CodeBtn).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn1));
 		itemExpandBtn1.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn1));
 		getAction().doubleClick(itemNameBtn1).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn1));
 		getAction().doubleClick(itemCodeBtn1).build().perform();
 		
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn1));
 		warehouseExpandBtn1.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseNameBtn1));
 		getAction().doubleClick(warehouseNameBtn1).build().perform();
 		
 		
 	    Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
		 
			System.out.println(" Test PasS: Report desgining is saved with Document Type ");
 			return true;
 		}
 		else
 		{
 			System.out.println(" Test FAIL: Report desgining is saved with Document Type ");
 			return false;
 		}
	
 	}

	
	
	
	

	public boolean checkReportAccountingTrasactionsofInventoryTagDetails() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
 		searchTxt.click();
 		searchTxt.sendKeys("Accounting Trasactions of Inventory Tag-Details");
 		Thread.sleep(1000);
 		searchTxt.sendKeys(Keys.ENTER);
 		
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		/*sl_DateOptionDropdown.click();*/
		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
 		  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDepartmentTxt));
		reportDepartmentTxt.click();
		reportDepartmentTxt.sendKeys("HYDERABAD"); 
		Thread.sleep(1000);
		reportDepartmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = reportCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportCol1List.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]";
		
		
		int report2ndRowListCount = reportCol2List.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = reportCol2List.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[STD RATE COGS ACC INV, Customer A, SR COGS POSTING ACC, Vendor New Reference, Vendor New Reference, , VAT INPUT, Vendor B, Vendor B, , VAT INPUT]";
		
		
		int report3rdRowListCount = reportCol3List.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = reportCol3List.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[STD RATE COGS ACC INV, 122-001, SR COGS POSTING ACC, Vendor New Reference, Vendor New Reference, , VAT INPUT, 033-002, 033-002, , VAT INPUT]";
		
		
		int report4thRowListCount = reportCol4List.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = reportCol4List.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[COGS POSTING ACC, Sales - Computers, STD RATE COGS ACC INV, STD RATE COGS ACC INV, VAT INPUT, PURCHASE VARIANCE, VAT ADVANCE PURCHASE, STD RATE COGS ACC INV, VAT INPUT, PURCHASE VARIANCE, VAT ADVANCE PURCHASE]";
		
		
		
		int reportsRow1ListCount1 = reportCol5List.size();
		ArrayList<String> reportsRow1ListArray1 = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount1;i++)
		{
			String data = reportCol5List.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List1 = reportsRow1ListArray1.toString();
		String expRow1List1 = "[]";
		
		
		int report2ndRowListCount1 = reportCol6List.size();
		ArrayList<String> report2ndRowListArray1 = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount1;i++)
		{
			String data = reportCol6List.get(i).getText();
			report2ndRowListArray1.add(data);
		}
		String actRow2List1 = report2ndRowListArray1.toString();
		String expRow2List1 = "[, STD RATE COGS ITEM, , STD RATE COGS ITEM, , , , STD RATE COGS ITEM, , , ]";
		
		
		
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
		
		
		System.out.println("actRow1List1  : "+actRow1List1);
		System.out.println("expRow1List1  : "+expRow1List1);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List1  : "+actRow2List1);
		System.out.println("expRow2List1  : "+expRow2List1);
		System.out.println("*********************************************************************");
				
		if (actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List)  && 
 				
				actRow1List1.equalsIgnoreCase(expRow1List1) &&
				actRow2List1.equalsIgnoreCase(expRow2List1)) 
 		{
 			System.out.println(" Test Pass: Values Dsiplayed as Expected ");
 			return true;
		} 
 		else 
 		{
 			System.out.println(" Test FAIL: Values Dsiplayed as Expected ");
 			return false;
		}
 	}
 	
	
	

	
	public boolean checkSavingAccountingTransactionsoFTagDetails() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
 	{

 		
 		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("Accounting Transactions of a Tag-Details");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Details");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanincalExpandbtn));
 		finanincalExpandbtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("Accounting transactions of a tag"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1ExpandBtn));
 		acc1ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1NameBtn));
 		getAction().doubleClick(acc1NameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1CodeBtn));
 		getAction().doubleClick(acc1CodeBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2ExpandBtn));
 		acc2ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2NameBtn));
 		getAction().doubleClick(acc2NameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2CodeBtn));
 		getAction().doubleClick(acc2CodeBtn).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn1));
 		itemExpandBtn1.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn1));
 		getAction().doubleClick(itemNameBtn1).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn1));
 		getAction().doubleClick(itemCodeBtn1).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn1));
 		warehouseExpandBtn1.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseNameBtn1));
 		getAction().doubleClick(warehouseNameBtn1).build().perform();
 		
 		
 	    Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
		 
			System.out.println(" Test PasS: Report desgining is saved with Document Type ");
 			return true;
 		}
 		else
 		{
 			System.out.println(" Test FAIL: Report desgining is saved with Document Type ");
 			return false;
 		}
	
 	}
	
	
	
	
	@FindBy(xpath="//div[@id='idGlobalError']")
	public static WebElement validationConfirmationMessage;

	public boolean checkReportAccountingTransactionsofTagDetails() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
 		searchTxt.click();
 		searchTxt.sendKeys("Accounting Transactions of a Tag-Details");
 		Thread.sleep(1000);
 		searchTxt.sendKeys(Keys.ENTER);
 		
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		/*sl_DateOptionDropdown.click();*/
		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
 		  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDepartmentTxt));
		reportDepartmentTxt.click();
		reportDepartmentTxt.sendKeys("DUBAI"); 
		Thread.sleep(1000);
		reportDepartmentTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		
		Thread.sleep(2000);
        boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		Thread.sleep(3000);
		
		/*Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = reportCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportCol1List.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]";
		
		
		int report2ndRowListCount = reportCol2List.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = reportCol2List.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[STD RATE COGS ACC INV, Customer A, SR COGS POSTING ACC, Vendor New Reference, Vendor New Reference, , VAT INPUT, Vendor B, Vendor B, , VAT INPUT]";
		
		
		int report3rdRowListCount = reportCol3List.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = reportCol3List.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[STD RATE COGS ACC INV, 122-001, SR COGS POSTING ACC, Vendor New Reference, Vendor New Reference, , VAT INPUT, 033-002, 033-002, , VAT INPUT]";
		
		
		int report4thRowListCount = reportCol4List.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = reportCol4List.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[COGS POSTING ACC, Sales - Computers, STD RATE COGS ACC INV, STD RATE COGS ACC INV, VAT INPUT, PURCHASE VARIANCE, VAT ADVANCE PURCHASE, STD RATE COGS ACC INV, VAT INPUT, PURCHASE VARIANCE, VAT ADVANCE PURCHASE]";
		
		
		
		int reportsRow1ListCount1 = reportCol5List.size();
		ArrayList<String> reportsRow1ListArray1 = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount1;i++)
		{
			String data = reportCol5List.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List1 = reportsRow1ListArray1.toString();
		String expRow1List1 = "[]";
		
		
		int report2ndRowListCount1 = reportCol6List.size();
		ArrayList<String> report2ndRowListArray1 = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount1;i++)
		{
			String data = reportCol6List.get(i).getText();
			report2ndRowListArray1.add(data);
		}
		String actRow2List1 = report2ndRowListArray1.toString();
		String expRow2List1 = "[, STD RATE COGS ITEM, , STD RATE COGS ITEM, , , , STD RATE COGS ITEM, , , ]";
		
		
		
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
		
		
		System.out.println("actRow1List1  : "+actRow1List1);
		System.out.println("expRow1List1  : "+expRow1List1);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List1  : "+actRow2List1);
		System.out.println("expRow2List1  : "+expRow2List1);
		System.out.println("*********************************************************************");*/
				
		if (/*actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List)  && 
 				
				actRow1List1.equalsIgnoreCase(expRow1List1) &&
				actRow2List1.equalsIgnoreCase(expRow2List1)*/
				
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage)) 
 		{
			
 			System.out.println(" Test Pass: Values Dsiplayed as Expected ");
 			return true;
		} 
 		else 
 		{
 			System.out.println(" Test FAIL: Values Dsiplayed as Expected ");
 			String meesage=validationConfirmationMessage.getText();
 			System.err.println(" Meesage Displayed  : "+meesage);
 			return false;
		}
 	}
 	
	 
	
	
	

	public boolean checkSavingAllAccountsByTagDetails() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
 	{

 		
 		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("All Accounts By Tag-Details");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Details");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanincalExpandbtn));
 		finanincalExpandbtn.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanincalReportsExpandbtn));
 		finanincalReportsExpandbtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("All accounts by tag"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1ExpandBtn));
 		acc1ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1NameBtn));
 		getAction().doubleClick(acc1NameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1CodeBtn));
 		getAction().doubleClick(acc1CodeBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2ExpandBtn));
 		acc2ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2NameBtn));
 		getAction().doubleClick(acc2NameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2CodeBtn));
 		getAction().doubleClick(acc2CodeBtn).build().perform();

 		Thread.sleep(2000);
 		getAction().moveToElement(quantityBtn2).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(quantityBtn2));
 		getAction().doubleClick(quantityBtn2).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateBtn2));
 		getAction().doubleClick(rateBtn2).build().perform();

 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn1));
 		itemExpandBtn1.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn1));
 		getAction().doubleClick(itemNameBtn1).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn1));
 		getAction().doubleClick(itemCodeBtn1).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn2));
 		warehouseExpandBtn2.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseNameBtn2));
 		getAction().doubleClick(warehouseNameBtn2).build().perform();
 		
 		
 	    Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
		 
			System.out.println(" Test PasS: Report desgining is saved with Document Type ");
 			return true;
 		}
 		else
 		{
 			System.out.println(" Test FAIL: Report desgining is saved with Document Type ");
 			return false;
 		}
	
 	}
	
	
	
	
	public boolean checkReportAllAccountsByTagDetails() throws InterruptedException
 	{
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
 		searchTxt.click();
 		searchTxt.sendKeys("All Accounts By Tag-Details");
 		Thread.sleep(1000);
 		searchTxt.sendKeys(Keys.ENTER);
 		
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		/*sl_DateOptionDropdown.click();*/
		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
 		  
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		
		Thread.sleep(2000);
        boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		Thread.sleep(3000);
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = reportCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportCol1List.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]";
		
		
		int report2ndRowListCount = reportCol2List.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = reportCol2List.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[STD RATE COGS ACC INV, Customer A, Bank, Bank, SR COGS POSTING ACC, Customer A, Bank, Bank, VAT INPUT, , Vendor New Reference, Vendor New Reference, Bank, Bank, Vendor B, Vendor B, VAT INPUT, ]";
		
		
		int report3rdRowListCount = reportCol3List.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = reportCol3List.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[STD RATE COGS ACC INV, 122-001, 121-001, 121-001, SR COGS POSTING ACC, 122-001, 121-001, 121-001, VAT INPUT, , Vendor New Reference, Vendor New Reference, 121-001, 121-001, 033-002, 033-002, VAT INPUT, ]";
		
		
		int report4thRowListCount = reportCol4List.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = reportCol4List.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[COGS POSTING ACC, Sales - Computers, Customer A, Customer A, STD RATE COGS ACC INV, Sales - Computers, Customer New Reference, Vendor New Reference, VAT ADVANCE PURCHASE, PURCHASE VARIANCE, VAT INPUT, STD RATE COGS ACC INV, Vendor New Reference, Vendor B, VAT INPUT, STD RATE COGS ACC INV, VAT ADVANCE PURCHASE, PURCHASE VARIANCE]";
		
		
		
		int reportsRow1ListCount1 = reportCol5List.size();
		ArrayList<String> reportsRow1ListArray1 = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount1;i++)
		{
			String data = reportCol5List.get(i).getText();
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List1 = reportsRow1ListArray1.toString();
		String expRow1List1 = "[]";
		
		
		int report2ndRowListCount1 = reportCol6List.size();
		ArrayList<String> report2ndRowListArray1 = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount1;i++)
		{
			String data = reportCol6List.get(i).getText();
			report2ndRowListArray1.add(data);
		}
		String actRow2List1 = report2ndRowListArray1.toString();
		String expRow2List1 = " [, 2.00, , , , 1.00, , , , , , 1.00, , , , 1.00, , ]";
		

		int report2ndRowListCount7 = reportCol7List.size();
		ArrayList<String> report2ndRowListArray7 = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount7;i++)
		{
			String data = reportCol7List.get(i).getText();
			report2ndRowListArray7.add(data);
		}
		String actRow2List7 = report2ndRowListArray7.toString();
		String expRow2List7 = "[, 10.00, , , , 5.00, , , , , , 5.00, , , , 5.00, , ]";
		
		int report2ndRowListCount8 = reportCol8List.size();
		ArrayList<String> report2ndRowListArray8 = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount8;i++)
		{
			String data = reportCol8List.get(i).getText();
			report2ndRowListArray8.add(data);
		}
		String actRow2List8 = report2ndRowListArray8.toString();
		String expRow2List8 = "[, STD RATE COGS ITEM, , , , STD RATE COGS ITEM, , , , , , STD RATE COGS ITEM, , , , STD RATE COGS ITEM, , ]";
		
		Thread.sleep(2000);
		
		sl_NextBtn.click();
		
		Thread.sleep(2000);
		

		int count = report6thRowList.size();
		ArrayList<String> array6 = new ArrayList<String>();
		for(int i=1;i<count;i++)
		{
			String data = report6thRowList.get(i).getText();
			array6.add(data);
		}
		String actRow6 = array6.toString();
		String expRow6 = "";
		
		
		
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
		
		
		System.out.println("actRow1List1  : "+actRow1List1);
		System.out.println("expRow1List1  : "+expRow1List1);
		System.out.println("*********************************************************************");
				
		System.out.println("actRow2List1  :  "+actRow2List1);
		System.out.println("expRow2List1  :  "+expRow2List1);
		System.out.println("*********************************************************************");
		
		System.out.println("actRow2List7  : "+actRow2List7);
		System.out.println("expRow2List7  : "+expRow2List7);
		System.out.println("*********************************************************************");
	
		System.out.println("actRow2List8  : "+actRow2List8);
		System.out.println("expRow2List8  : "+expRow2List8);
		System.out.println("*********************************************************************");
		
		System.out.println("row6  : "+actRow6);
		System.out.println("row6  : "+expRow6);
		System.out.println("*********************************************************************");
				
		if (actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List)  && 
 				
				actRow1List1.equalsIgnoreCase(expRow1List1)/* &&
				actRow2List1.equalsIgnoreCase(expRow2List1) /*&& 
				
				actRow2List7.equalsIgnoreCase(expRow2List7) && 
				actRow2List8.equalsIgnoreCase(expRow2List8) && 
				
				actvalidationConfirmationMessage.equalsIgnoreCase(expvalidationConfirmationMessage)*/) 
 		{
 			System.out.println(" Test Pass: Values Dsiplayed as Expected ");
 			return true;
		} 
 		else 
 		{
 			System.out.println(" Test FAIL: Values Dsiplayed as Expected ");
 			String meesage=validationConfirmationMessage.getText();
 			System.err.println(" Meesage Displayed  : "+meesage);
 			return false;
		}
 	}
 	
	
	
	 


	public boolean checkSavingInventoryTransactionsOfAProductDetails() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
 	{

 		
 		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("Inventory Transactions of a Product-Details");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Details");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryExpandBtn));
 		inventoryExpandBtn.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsBtn));
 		reportsBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("Inventory transactions of a product"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1ExpandBtn));
 		acc1ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1NameBtn));
 		getAction().doubleClick(acc1NameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1CodeBtn));
 		getAction().doubleClick(acc1CodeBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2ExpandBtn));
 		acc2ExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2NameBtn));
 		getAction().doubleClick(acc2NameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc2CodeBtn));
 		getAction().doubleClick(acc2CodeBtn).build().perform();

 		Thread.sleep(2000);
 		getAction().moveToElement(quantityBtn2).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(quantityBtn2));
 		getAction().doubleClick(quantityBtn2).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateBtn2));
 		getAction().doubleClick(rateBtn2).build().perform();

 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn1));
 		itemExpandBtn1.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn1));
 		getAction().doubleClick(itemNameBtn1).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn1));
 		getAction().doubleClick(itemCodeBtn1).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn2));
 		warehouseExpandBtn2.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseNameBtn2));
 		getAction().doubleClick(warehouseNameBtn2).build().perform();
 		
 		
 	    Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
		 
			System.out.println(" Test PasS: Report desgining is saved with Document Type ");
 			return true;
 		}
 		else
 		{
 			System.out.println(" Test FAIL: Report desgining is saved with Document Type ");
 			return false;
 		}
	
 	}
	
	
	@FindBy(xpath ="//*[@id='rd_customization_tree335']/a/span")
	private static WebElement qunatityInAccounttransactionBtn;
	
	
	@FindBy(xpath ="//*[@id='rd_customization_tree0']/ul/li[1]/ul/li[53]")
	private static WebElement rateInAccounttransactionBtn;
	
	
	@FindBy(xpath ="//*[@id='rd_customization_tree189']/a/span")
	private static WebElement documentNo;
	
	
	@FindBy(xpath ="//*[@id='rd_customization_tree170']/a/span")
	private static WebElement creditBtn;
	
	
	@FindBy(xpath ="//*[@id='rd_customization_tree188']/a/span")
	private static WebElement debitBtn;
	
	
	@FindBy(xpath ="//*[@id='rd_customization_tree3']/a/span")
	private static WebElement dragaccount;
	
	@FindBy(xpath ="//*[@id='id_rd_customization_cube_grouping_row']")
	private static WebElement dropaccount;
	
	
	
	
	
	
	
	public static boolean checkSavingAccountingTransactionsCube() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("Accounting Transactions-Cube");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Cubes");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanincalExpandbtn));
 		finanincalExpandbtn.click();//*[@id="id_menu_tree_60"]/a/i
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanincalReportsExpandbtn));
 		finanincalReportsExpandbtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("Accounting transactions"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1ExpandBtn));
 		acc1ExpandBtn.click();
 		
 		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\accountDrag.exe");
 		Thread.sleep(15000);
 	
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitBtn));
 		getAction().doubleClick(debitBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditBtn));
 		getAction().doubleClick(creditBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(qunatityInAccounttransactionBtn));
 		getAction().doubleClick(qunatityInAccounttransactionBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateInAccounttransactionBtn));
 		getAction().doubleClick(rateInAccounttransactionBtn).build().perform();

 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNo));
 		getAction().doubleClick(documentNo).build().perform();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
 			return true;
 		}
 		else
 		{
 			return false;
 		}
 		
 		
	}
	
	
	public static boolean checkReportAccountingTransactionsCube() throws InterruptedException
	{
		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
 		searchTxt.click();
 		searchTxt.sendKeys("Accounting Transactions_Cube");
 		Thread.sleep(1000);
 		searchTxt.sendKeys(Keys.ENTER);
 		
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		/*sl_DateOptionDropdown.click();*/
		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
 		  
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		
		Thread.sleep(2000);
        boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		Thread.sleep(3000);
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = reportCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportCol1List.get(i).getText();
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]";
		
		
		int report2ndRowListCount = reportCol2List.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = reportCol2List.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Bank, Customer A, Journal Entries Control A/C, Opening Balances Control A/C, SR COGS POSTING ACC, STD RATE COGS ACC INV, VAT INPUT, Vendor B, Vendor Full Adjustment, Vendor New Reference, Grand Total]";
		
		
		int report3rdRowListCount = reportCol3List.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = reportCol3List.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[29.75, 20.00, 10.00, 20.00, , , , , 10.00, , 69.75]";
		
		
		int report4thRowListCount = reportCol4List.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = reportCol4List.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[30.00, 5.00, 10.00, , 120.00, 20.00, , 5.25, , 5.25, 175.50]";
		
		
		
		int reportsRow1ListCount1 = reportCol5List.size();
		ArrayList<String> reportsRow1ListArray1 = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount1;i++)
		{
			String data = reportCol5List.get(i).getText();
	
			reportsRow1ListArray1.add(data);
		}
		String actRow1List1 = reportsRow1ListArray1.toString();
		String expRow1List1 = "[, 1.00, , , , , , 1.00, , 1.00, 1.00]";
		
		
		int report2ndRowListCount1 = reportCol6List.size();
		ArrayList<String> report2ndRowListArray1 = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount1;i++)
		{
			String data = reportCol6List.get(i).getText();
			report2ndRowListArray1.add(data);
		}
		String actRow2List1 = report2ndRowListArray1.toString();
		String expRow2List1 = "[, 15.00, , , , , , 5.00, , 5.00, 25.00]";
		

		int report2ndRowListCount7 = reportCol7List.size();
		ArrayList<String> report2ndRowListArray7 = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount7;i++)
		{
			String data = reportCol7List.get(i).getText();
			report2ndRowListArray7.add(data);
		}
		String actRow2List7 = report2ndRowListArray7.toString();
		String expRow2List7 = "[1, 1, 1, 1, 1, 1, 2, 2, 2, 1, ]";
		
		
		Thread.sleep(2000);
		
		sl_NextBtn.click();
		
		Thread.sleep(2000);
		

		
		
		System.out.println("actCol1List  : "+actRow1List);
		System.out.println("expCol1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actCol2List  : "+actRow2List);
		System.out.println("expCol2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actCol3List  : "+actRow3List);
		System.out.println("expCol3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actCol4List  : "+actRow4List);
		System.out.println("expCol4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		
		System.out.println("actCol5List  : "+actRow1List1);
		System.out.println("expCol5List : "+expRow1List1);
		System.out.println("*********************************************************************");
				
		System.out.println("actCol6List  :  "+actRow2List1);
		System.out.println("expCol6List  :  "+expRow2List1);
		System.out.println("*********************************************************************");
		
		System.out.println("actCol7List  : "+actRow2List7);
		System.out.println("expCol7List  : "+expRow2List7);
		System.out.println("*********************************************************************");
	
	
		if (actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List)  && 
 				
				actRow1List1.equalsIgnoreCase(expRow1List1) &&
				actRow2List1.equalsIgnoreCase(expRow2List1) && 
				
				actRow2List7.equalsIgnoreCase(expRow2List7) ) 
 		{
 			System.out.println(" Test Pass: Values Dsiplayed as Expected ");
 			return true;
		} 
 		else 
 		{
 			System.out.println(" Test FAIL: Values Dsiplayed as Expected ");
 			String meesage=validationConfirmationMessage.getText();
 			System.err.println(" Meesage Displayed  : "+meesage);
 			return false;
		}
	}
	
	@FindBy(xpath="//*[@id='rd_customization_tree215']/a/i")
	private static WebElement itemExpandBtnn;
	
	
	@FindBy(xpath="//*[@id='rd_customization_tree219']/a/span")
	private static WebElement itemAliasBtn;
	
	
	public static boolean checkSavingAccountingTransactionsOfAnAccountCube() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("Accounting Transactions of an account_Cube");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Cubes");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanincalExpandbtn));
 		finanincalExpandbtn.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanincalReportsExpandbtn));
 		finanincalReportsExpandbtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("Accounting transactions of an account"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc1ExpandBtn));
 		acc1ExpandBtn.click();
 		
 		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\accountDrag.exe");
 		Thread.sleep(20000);
 	
 		
 		/*getAction().moveToElement(debitBtn).perform();*/
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtnn));
 		itemExpandBtnn.click();
 		
 		getAction().moveToElement(itemAliasBtn).perform();
 		
 		Thread.sleep(3000);
 		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\itemDrag.exe");
 		Thread.sleep(20000);
 		
 		getAction().moveToElement(documentNo).perform();
 		
 		
 		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\CreditDebitDrag.exe");
 		Thread.sleep(21000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(qunatityInAccounttransactionBtn));
 		getAction().doubleClick(qunatityInAccounttransactionBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateInAccounttransactionBtn));
 		getAction().doubleClick(rateInAccounttransactionBtn).build().perform();

 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNo));
 		getAction().doubleClick(documentNo).build().perform();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 	
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
 			return true;
 		}
 		else
 		{
 			return false;
 		}
 		
	}
	
	public static boolean checkReportAccountingtransactionOfAnAccountCube() throws InterruptedException
	{

		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
 		searchTxt.click();
 		searchTxt.sendKeys("Accounting Transactions of an account_Cube");
 		Thread.sleep(1000);
 		searchTxt.sendKeys(Keys.ENTER);
 		
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_DateOptionDropdown));
		/*sl_DateOptionDropdown.click();*/
		
		Select s=new Select(sl_DateOptionDropdown);
		s.selectByValue("1");
		
		Thread.sleep(2000);
 		  
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_OkBtn));
		sl_OkBtn.click();
	
		
		Thread.sleep(2000);
        boolean novalidationConfirmationMessage =validationConfirmationMessage.getText().isEmpty();
		
		String actvalidationConfirmationMessage = Boolean.toString(novalidationConfirmationMessage);
		String expvalidationConfirmationMessage = "true";
		
		Thread.sleep(3000);
		
		Thread.sleep(1500);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sl_1stRow1stCol));
		
		int reportsRow1ListCount = reportCol1List.size();
		ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount;i++)
		{
			String data = reportCol1List.get(i).getText();
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date date=new Date();
		    String expadjustBills=df.format(date);
			
			reportsRow1ListArray.add(data);
		}
		String actRow1List = reportsRow1ListArray.toString();
		String expRow1List = "[2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]";
		
		
		int report2ndRowListCount = reportCol2List.size();
		ArrayList<String> report2ndRowListArray = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount;i++)
		{
			String data = reportCol2List.get(i).getText();
			report2ndRowListArray.add(data);
		}
		String actRow2List = report2ndRowListArray.toString();
		String expRow2List = "[Bank, COGS POSTING ACC, Customer A, Customer New Reference, Customer Semi Adjustment, Journal Entries Control A/C, Opening Balances Control A/C, PURCHASE VARIANCE, Sales - Computers, SR COGS POSTING ACC, STD RATE COGS ACC INV, VAT ADVANCE PURCHASE, VAT INPUT, Vendor B, Vendor Full Adjustment, Vendor New Reference, Vendor Semi Adjustment, Grand Total]";
		
		
		int report3rdRowListCount = reportCol3List.size();
		ArrayList<String> report3rdRowListArray = new ArrayList<String>();
		for(int i=1;i<report3rdRowListCount;i++)
		{
			String data = reportCol3List.get(i).getText();
			report3rdRowListArray.add(data);
		}
		String actRow3List = report3rdRowListArray.toString();
		String expRow3List = "[2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 3, ]";
		
		
		int report4thRowListCount = reportCol4List.size();
		ArrayList<String> report4thRowListArray = new ArrayList<String>();
		for(int i=1;i<report4thRowListCount;i++)
		{
			String data = reportCol4List.get(i).getText();
			report4thRowListArray.add(data);
		}
		String actRow4List = report4thRowListArray.toString();
		String expRow4List = "[30, 20, , 5, 15, 10, 20, , , , 120, , , , 10, 10, 10, 480]";
		
		
		
		int reportsRow1ListCount1 = reportCol5List.size();
		ArrayList<String> reportsRow1ListArray1 = new ArrayList<String>();
		for(int i=1;i<reportsRow1ListCount1;i++)
		{
			String data = reportCol5List.get(i).getText();
	
			reportsRow1ListArray1.add(data);
		}
		String actRow1List1 = reportsRow1ListArray1.toString();
		String expRow1List1 = "[40, , 15, 20, 15, 10, , , , 120, 20, , , , , 5, 5, 250]";
		
		
		int report2ndRowListCount1 = reportCol6List.size();
		ArrayList<String> report2ndRowListArray1 = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount1;i++)
		{
			String data = reportCol6List.get(i).getText();
			report2ndRowListArray1.add(data);
		}
		String actRow2List1 = report2ndRowListArray1.toString();
		String expRow2List1 = "[, , 20, , , , , , 5, , 11, , , , , , , 36]";
		

		int report2ndRowListCount7 = reportCol7List.size();
		ArrayList<String> report2ndRowListArray7 = new ArrayList<String>();
		for(int i=1;i<report2ndRowListCount7;i++)
		{
			String data = reportCol7List.get(i).getText();
			report2ndRowListArray7.add(data);
		}
		String actRow2List7 = report2ndRowListArray7.toString();
		String expRow2List7 = "[, , 5, , , , , , 20, , , , , 120, , 120, , 265]";
		
		
		
		int repor8col = reportCol8List.size();
		ArrayList<String> report8thColListArray = new ArrayList<String>();
		for(int i=1;i<repor8col;i++)
		{
			String data = reportCol8List.get(i).getText();
			report8thColListArray.add(data);
		}
		String act8thColList = report8thColListArray.toString();
		String exp8thcolList = "[30, 20, 20, 5, 15, 10, 20, , 5, , 131, , , , 10, 10, 10, 515]";
		
		Thread.sleep(2000);
		
		sl_NextBtn.click();
		
		Thread.sleep(2000);
		

		
		
		System.out.println("actCol1List  : "+actRow1List);
		System.out.println("expCol1List  : "+expRow1List);
		System.out.println("*********************************************************************");
				
		System.out.println("actCol2List  : "+actRow2List);
		System.out.println("expCol2List  : "+expRow2List);
		System.out.println("*********************************************************************");
				
		System.out.println("actCol3List  : "+actRow3List);
		System.out.println("expCol3List  : "+expRow3List);
		System.out.println("*********************************************************************");
		
		System.out.println("actCol4List  : "+actRow4List);
		System.out.println("expCol4List  : "+expRow4List);
		System.out.println("*********************************************************************");
		
		
		System.out.println("actCol5List  : "+actRow1List1);
		System.out.println("expCol5List : "+expRow1List1);
		System.out.println("*********************************************************************");
				
		System.out.println("actCol6List  :  "+actRow2List1);
		System.out.println("expCol6List  :  "+expRow2List1);
		System.out.println("*********************************************************************");
		
		System.out.println("actCol7List  : "+actRow2List7);
		System.out.println("expCol7List  : "+expRow2List7);
		System.out.println("*********************************************************************");
	
		
		System.out.println("actCol7List  : "+act8thColList);
		System.out.println("expCol7List  : "+exp8thcolList);
		System.out.println("*********************************************************************");
	
		if (actRow1List.equalsIgnoreCase(expRow1List) &&
				actRow2List.equalsIgnoreCase(expRow2List) &&
				actRow3List.equalsIgnoreCase(expRow3List) && 
				actRow4List.equalsIgnoreCase(expRow4List)  && 
 				
				actRow1List1.equalsIgnoreCase(expRow1List1) &&
				actRow2List1.equalsIgnoreCase(expRow2List1) && 
				
				actRow2List7.equalsIgnoreCase(expRow2List7) ) 
 		{
 			System.out.println(" Test Pass: Values Dsiplayed as Expected ");
 			return true;
		} 
 		else 
 		{
 			System.out.println(" Test FAIL: Values Dsiplayed as Expected ");
 			String meesage=validationConfirmationMessage.getText();
 			System.err.println(" Meesage Displayed  : "+meesage);
 			return false;
		}
	
	}
	
	
	@FindBy(xpath="//*[@id='rd_customization_tree382']/a/i")
	private static WebElement departmentExpandBtn;
	
	@FindBy(xpath="//*[@id='rd_customization_tree386']/a/span")
	private static WebElement jurisdictionTxt;
	
	
	@FindBy(xpath="//*[@id='rd_customization_tree373']/a/span")
	private static WebElement voucherTypeTxt;
	
	
	
	
	public static boolean checkSavingAccountingTransactionsOfAnAccountingTagCube() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(2999);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
	
 		Thread.sleep(2999);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("Accounting Transactions of an accounting tag_cube");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Cubes");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanincalExpandbtn));
 		finanincalExpandbtn.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finanincalReportsExpandbtn));
 		finanincalReportsExpandbtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("Accounting transactions of accounting tag"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentExpandBtn));
 		departmentExpandBtn.click();
 		
 		getAction().moveToElement(jurisdictionTxt).perform();
 		
 		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\departmentDrag.exe");
 		Thread.sleep(20000);
 	
 	
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		
 		
 		getAction().moveToElement(voucherTypeTxt).perform();
 		
 		Thread.sleep(3000);
 		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\voucherNameDrag.exe");
 		Thread.sleep(20000);
 		
 		
 		
 		getAction().moveToElement(documentNo).perform();
 		Thread.sleep(2000);
 		
 		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\CreditDebitDrag.exe");
 		Thread.sleep(21000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(qunatityInAccounttransactionBtn));
 		getAction().doubleClick(qunatityInAccounttransactionBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateInAccounttransactionBtn));
 		getAction().doubleClick(rateInAccounttransactionBtn).build().perform();

 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNo));
 		getAction().doubleClick(documentNo).build().perform();
 		
 		Thread.sleep(2000);
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 	
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
 			return true;
 		}
 		else
 		{
 			return false;
 		}
 		
	}
	
	
	

	
     public ReportDesignerPage(WebDriver driver)
     {
    	PageFactory.initElements(driver, this);
    	
     }
	
	
}
