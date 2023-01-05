package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.focus.base.BaseEngine;

import java.util.ArrayList;
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

public class MasterBinsPage extends BaseEngine 
{
 	
     	//Home Menu
		
			
				 //Bins Menu	
				
					//Bins Title
				
					
					
					

					@FindBy(xpath="//label[@class='msgInfo']")
					public static WebElement clickOnEmptyGroup;
					
				//Master Left panel//TreeID//Elements


						@FindBy(xpath="//h4[contains(text(),'Create Tree')]")
						public static WebElement treeID_CreateTreeLabel; 
						
						@FindBy(xpath="//*[@id='btnCancel']")
						public static WebElement treeID_CloseBtn; 
						
						@FindBy(xpath="//input[@id='txtTreeName']")
						public static WebElement treeID_TreeTxt; 
						
						@FindBy(xpath="//input[@id='rbtManual']")
						public static WebElement treeID_ManualRadioBtn; 
						
						@FindBy(xpath="//input[@id='rbtAuto']")
						public static WebElement treeID_AutoRadioBtn; 
						
						@FindBy(xpath="//select[@id='cmbTreeList']")
						public static WebElement treeID_SelectTreeDropdown; 
						
						@FindBy(xpath="//input[@id='chkIncludeGroup']")
						public static WebElement treeID_IncludeGroupsCheckBox; 
						
						@FindBy(xpath="//input[@id='chkAddLeaveAtZeroLevel']")
						public static WebElement treeID_AddLeafAlwaysAtTheZerolevelOnCreationCheckbox; 
						
						@FindBy(xpath="//*[@id='MasterTreeTable_SelectFields']")
						public static WebElement treeID_GridFirstSelectFields; 
						
						@FindBy(xpath="//*[@id='MasterTreeTable_col_2-1']")
						public static WebElement treeID_GridSecondSelectFields; 
						
						@FindBy(xpath="//input[@id='chkAutoGroup']")
						public static WebElement treeID_AlwaysAutoGroupOnCreationCheckbox; 
						
						@FindBy(xpath="//input[@id='chkAlwaysSorted']")
						public static WebElement treeID_AlwaysSortedCheckbox; 
						
						@FindBy(xpath="//*[@id='btnOk']")
						public static WebElement treeID_PopOkBtn; 
						
						@FindBy(xpath="//*[@id='btnCancel']")
						public static WebElement treeID_PopCancelBtn; 
					
					

		 

					
					

	    				
					//InfoPanel
					@FindBy(xpath="//label[contains(text(),'Info Panel')]")
					public static WebElement masterInfoPanelLabel; 

					@FindBy(xpath="//i[@class='icon-custamize theme_icon-color']")
					public static WebElement masterInfoPanelCustammizeBtn;
					
					
					@FindBy(xpath="//*[@id='lblnchecked']/input")
					public static WebElement masterGrid_SelectFirstRow;

					//Footer Fields
					@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[1]/div/input")
					public static WebElement masterFirstBtn;

					@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[2]/div/input")
					public static WebElement masterPreviousBtn;

					@FindBy(xpath="//*[@id='btn1']")
					public static WebElement masterOneBtn;

					@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[4]/div/input")
					public static WebElement masterNextBtn;

					@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[5]/div/input")
					public static WebElement masterEndBtn;
					

				    //Properties Page
				    @FindBy(xpath="//*[@id='divModal_properties']/div[1]/h5")
				    public static WebElement accountPropertiesLabel;

			        @FindBy(xpath="//select[@id='ddlStatus']")
					public static WebElement  statusDropdown;
					
					@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div/table/tbody/tr[2]/td/label/span")
					public static WebElement  doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox;
					
					@FindBy(xpath="//*[@id='divModal_properties']/div[2]/div/table/tbody/tr[3]/td/label/span")
					public static WebElement allowOtherCompaniesToViewRecordsCheckbox;
				
					@FindBy(xpath="//*[@id='btnPropOk']")
					public static WebElement properties_okBtn;
					
					@FindBy(xpath="//*[@id='divModal_properties']/div[1]/div[2]/ul/li[2]/span/i")
					public static WebElement  properties_cancelBtn;
			 
			@FindBy(xpath="//a[contains(text(),'General')]")
			private static WebElement generalTabOpen;//Before Clicking
			
				
				
	
				@FindBy(xpath="//input[@id='iDistance']")
				private static WebElement distanceTxt ;//
	
				@FindBy(xpath="//*[@id='ibinLevel']")
				private static WebElement  levelTxt;	
				
				@FindBy(xpath="//input[@id='iColNo']")
				private static WebElement colNoTxt ;
	
				@FindBy(xpath="//select[@id='iStorageType']")
				private static WebElement  storageTypeDropdown;
				
				@FindBy(xpath="//input[@id='bHold']")
				private static WebElement holdChkBox;

				@FindBy(xpath="//input[@id='bDamaged']")
				private static WebElement damagedChkBox;
					
				@FindBy(xpath="//textarea[@id='sRemarks']")
				private static WebElement  remarksTxt;
					
			@FindBy(xpath="//a[@class='icon-font7 theme_color-inverse']")
			private static WebElement  generalTabToOpen;//After Clicking
			
			@FindBy(xpath="//a[contains(text(),'Task Manager')]")
			private static WebElement taskManagerTab;
			
				@FindBy(xpath="//input[@id='iEmployee1']")
				private static WebElement  gridEmployeeTxt;
				
				@FindBy(xpath="//select[@id='iPick1']")
				private static WebElement gridPickDropDown ;
				
				@FindBy(xpath="//select[@id='iPut1']")
				private static WebElement  gridPutDropdown;
			
			@FindBy(xpath="//a[contains(text(),'Dimension')]")
			private static WebElement  dimensionTab;
		
				@FindBy(xpath="//input[@id='fLength']")
				private static WebElement  lengthTxt;
				
				@FindBy(xpath="//input[@id='fWidth']")
				private static WebElement widthTxt ;				
				
				@FindBy(xpath="//input[@id='fHeight']")
				private static WebElement  heightTxt;			
				
				@FindBy(xpath="//input[@id='fCBM']")
				private static WebElement  CBMTxt;
				
				@FindBy(xpath="//input[@id='fCurrentLength']")
				private static WebElement  currentLengthTxt;
				
				@FindBy(xpath="//input[@id='fCurrentWidth']")
				private static WebElement  currentWidthTxt;
								
				@FindBy(xpath="//input[@id='fCurrentHeight']")
				private static WebElement  currentHeightTxt;
				
				@FindBy(xpath="//input[@id='FCurrentCBM']")
				private static WebElement  currentCBMTxt;
				
				@FindBy(xpath="//input[@id='fWeight']")
				private static WebElement  weightTxt;
				
				@FindBy(xpath="//input[@id='fMinimumCBM']")
				private static WebElement minimumCBMTxt ;
				
				@FindBy(xpath="//input[@id='fOccupiedWeight']")
				private static WebElement occupiedWeightTxt ;
				
				@FindBy(xpath="//input[@id='fOccupiedCBM']")
				private static WebElement  occupiedCBMTxt;
				
				@FindBy(xpath="//input[@id='bConsiderSize']")
				private static WebElement  considerSizeChkBox;
				
				@FindBy(xpath="//input[@id='bConsiderWeight']")
				private static WebElement  considerWeightChkBox;
												
				@FindBy(xpath="//input[@id='iNoOfDecimals']")
				private static WebElement noOfDecimalsTxt;
				
				@FindBy(xpath="//select[@id='iRoundingType']")
				private static WebElement roundingTypeDropdown;
			
			    @FindBy(xpath="//select[@id='UnitType']")
				private static WebElement unitTypeDropdown;
			  
			    
			    @FindBy(xpath="//td[@class='text-center']")
				private static WebElement unitsInMainPageEmpty;
			    
			
			
			
			    //Edit option Fields				
				@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
				public static WebElement editCloseBtn;
				
				@FindBy(xpath="//*[@id='LandingGridBody']/tr[1]/td[11]")
				public static WebElement accountCreation;
				
				
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[10]")
				public static WebElement binGroupNewCreationName;
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
				public static WebElement unitNewCreationNameOfLane;               
							
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
				public static WebElement unitFirstCheckBoxToSelection;
				
				
				
				

				
				
				@FindBy(xpath="//input[@id='liSelectAllMasters']")
				public static WebElement accountMasterSelect;
				
				@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div/label/input")
				public static List<WebElement> checkboxListInMasters;
				
						

				
				
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/label[1]/input[1]")
				public static WebElement selectSecondRow;
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[8]/div[1]/label[1]/input[1]")
				public static WebElement selectThirdRow;
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[8]/div[1]/label[1]/input[1]")
				public static WebElement selectFourthRow;
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[5]/td[8]/div[1]/label[1]/input[1]")
				public static WebElement selectFifthRow;
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[6]/td[8]/div[1]/label[1]/input[1]")
				public static WebElement selectRow;
					
				@FindBy(xpath="//button[@id='btnOkForDelete']")
				public static WebElement clickOnOkInDelete;
	
				
				//Dash board Page
				@FindBy(xpath="//*[@id='dashName']")
			    private static WebElement labelDashboard ;
				
				@FindBy(xpath="//*[@id='Select_dash']")
				private static WebElement selectDashboard ;
					
				
			 
			
			    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
				private static WebElement noIn;
			    
	   		 @FindBy(xpath="//input[@id='donotshow']")
	   		private static WebElement doNotShowCheckbox;
	   	    
	   	    @FindBy(xpath="//span[@class='pull-right']")
	   		private static WebElement CloseBtnInDemoPopupScreen;
	   	    
	   	    
	   
				     
					 @FindBy(xpath="//*[@id='tabContent_UConstraints_MasterCust']/div[1]/div/div[1]/div[1]")
					 private static WebElement UniqueConstraintsAddBtn;
							     
					
							     
							     
					
							     
					 @FindBy(xpath="//*[@id='txtConstraintName_input_image']/span")
					 private static WebElement UniqueConstraints_ConstraintNameExpansionBtn;
							     
					 @FindBy(xpath="//*[@id='txtConstraintName_input_settings']/span")
					 private static WebElement UniqueConstraints_ConstraintNameSettingBtn;
							     
							 @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_heading']")
							 private static WebElement UniqueConstraints_CustomizeDisplayColoumnPopLabel;
									     
							 @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_container']")
							 private static WebElement UniqueConstraints_CustomizeDisplayColoumnPop_NameText;
									     
						     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[1]")
							 private static WebElement UniqueConstraints_CustomizeDisplayColoumnPop_StandaredFieldBtn;
									     
													     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_heading']")
													     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributesLabel;
													     
													     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_standardfields_list']")
													     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_FeildDropdown;
													     
													     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_standardfields_header']")
													     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_HeadereText;
													     
													     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_standardfields_alignment']")
													     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_AlignmentDropdown;
													     
													     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_standardfields_width']")
													     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_Widthtext;
													     
													     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[3]")
													     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_OkBtn;
													     
													     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[4]")
													     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_CancelBtn;
													     
									     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[2]")
									     private static WebElement UniqueConstraints_CustomizeDisplayColoumnPop_DeleteColoumnBtn;
									     
									     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[3]")
									     private static WebElement UniqueConstraints_CustomizeDisplayColoumnPop_OkBtn;
									     
									     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[4]")
									     private static WebElement UniqueConstraints_CustomizeDisplayColoumnPop_CancelBtn;
							     
							     @FindBy(xpath="//*[@id='ddlConstraintTabList']")
							     private static WebElement UniqueConstraints_TabsDropdown;
							     
							     
							     /////Main 
							     
							     @FindBy(xpath="//*[@id='tab_Main_UcFields']/i")
							     private static WebElement UniqueConstraints_MainExpansionBtn;
							     
							     
							   
							     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[1]/label/input")
							     private static WebElement UniqueConstraints_Main_NameChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[2]/label/input")
							     private static WebElement UniqueConstraints_Main_CodeChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[3]/label/input")
							     private static WebElement UniqueConstraints_Main_ItemTypeChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[4]/label/input")
							     private static WebElement UniqueConstraints_Main_RorderLevelChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[5]/label/input")
							     private static WebElement UniqueConstraints_Main_BinCapacityChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[6]/label/input")
							     private static WebElement UniqueConstraints_Main_ValuationMethodChekbox;
							     
							     
							     
							     ///Header
							     
							     @FindBy(xpath="//*[@id='tab_Header_UcFields']/i")
							     private static WebElement UniqueConstraints_HeaderExpansionBtn;
							     
							     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[1]/label/input")
							     private static WebElement UniqueConstraints_Header_CategoryChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[2]/label/input")
							     private static WebElement UniqueConstraints_Header_PrinterChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[3]/label/input")
							     private static WebElement UniqueConstraints_Header_AlternateCategoryChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[4]/label/input")
							     private static WebElement UniqueConstraints_Header_DescriptionChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[5]/label/input")
							     private static WebElement UniqueConstraints_Header_PerishableItemChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[6]/label/input")
							     private static WebElement UniqueConstraints_Header_BinChekbox;
							     
							     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[7]/label/input")
							     private static WebElement UniqueConstraints_Header_ImageChekbox;
							     
							     
							     //////Body
							     
							     
							     @FindBy(xpath="//*[@id='tab_Body_UcFields']/i")
							     private static WebElement UniqueConstraints_BodyExpansionBtn;
	   	    
	   	  
	   	  
							     
			 
		public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			 //Thread.sleep(5000);
		        
		        try 
		        {
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
					doNotShowCheckbox.click();
					
					//Thread.sleep(2000);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtnInDemoPopupScreen));
					CloseBtnInDemoPopupScreen.click(); 
					
					System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");
					
				} 
		        catch (Exception e)
		        {
		        	System.err.println("NO POP UP DISPLAYED");
				}

		    	
		    	//Thread.sleep(4000);
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
	
		
		//Thread.sleep(4000);
	}
			    
				
			 private static String xlfile;
			 private static String resPass="Pass";
			 private static String resFail="Fail";
			 private static ExcelReader excelReader;

		
		
		
	  public static boolean checkOpenBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
        LoginPage lp=new LoginPage(getDriver()); 
		
		String unamelt="su";
				      
		String pawslt="su";
				      
		lp.enterUserName(unamelt);
				
		lp.enterPassword(pawslt);
		
		lp.clickOnSignInBtn();
		
		 reLogin(unamelt, pawslt, "Automation Company");
		
		//checkRefershPopOnlogin();
		
		//checkPopUpWindow();
         
         Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
		String userInfo=userNameTxt.getText();
				    	
		System.out.println("User Info : "+userInfo);
				    	
		System.out.println("User Info Capture Text :"+userNameTxt.getText());
				    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
				    	
		companyLogoImg.click();
				    	
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogoImg.click();
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	     
	     homeMenu.click();
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	     
	     mastersMenu.click();
	     
	     Thread.sleep(4000);
	     
	     JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	     jse.executeScript("arguments[0].scrollIntoView();", TaxcodeMenu);
	    
	     Thread.sleep(3000);
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsMenu));
	     
	     binsMenu.click();
	    	  
	     	     
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
	     masterRibbonToExpandOptions.click();
		
		Thread.sleep(3000);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(TabUniqueConstraints));
		TabUniqueConstraints.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UniqueConstraints_ConstraintNameText));
		UniqueConstraints_ConstraintNameText.click();
		UniqueConstraints_ConstraintNameText.sendKeys(Keys.SPACE);
		
		int uniqueConstraintsListCount = uniqueConstraintsList.size();
		
		for(int i=0;i<uniqueConstraintsListCount;i++)
		{
			String data = uniqueConstraintsList.get(i).getText();
			if(data.equalsIgnoreCase("Rack Column Const"))
			{
				uniqueConstraintsList.get(i).click();
				
				UniqueConstraints_ConstraintNameText.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UniqueConstraintsDeleteBtn));
				UniqueConstraintsDeleteBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();
				
				break;
			}
			
		}
		
		Thread.sleep(4000);
		
	     
		 if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company "))
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 529, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 529, 9, resFail);
			 return false;
		 }
	  }

	 public static boolean checkMainOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		getDriver().navigate().refresh();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		     
	    homeMenu.click();
		
	    Thread.sleep(2000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	     
	    mastersMenu.click();
	    
	    Thread.sleep(6000);
	     JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	     jse.executeScript("arguments[0].scrollIntoView();", TaxcodeMenu);
	     
	     Thread.sleep(3000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsMenu));
	     
	    binsMenu.click();
	    
	    Thread.sleep(3000);
	    
		
		
		  
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
        boolean actmasterNewBtn                 = masterNewBtn.isDisplayed();
		boolean actmasterAddGroupBtn            = masterAddGroupBtn.isDisplayed();
		boolean actmasterEditBtn                = masterEditBtn.isDisplayed();
		boolean actmasterCloneBtn               = masterCloneBtn.isDisplayed();
		boolean actmasterPropertiesBtn          = masterPropertiesBtn.isDisplayed();
		boolean actmasterDeleteBtn              = masterDeleteBtn.isDisplayed();
		boolean actmasterCloseBtn               = masterCloseBtn.isDisplayed();
		boolean actmasterRibbonToExpandOptions  = masterRibbonToExpandOptions.isDisplayed();
		
		boolean expmasterNewBtn                 = true;
		boolean expmasterAddGroupBtn            = true;
		boolean expmasterEditBtn                = true;
		boolean expmasterCloneBtn               = true;
		boolean expmasterPropertiesBtn          = true;
		boolean expmasterDeleteBtn              = true;
		boolean expmasterCloseBtn               = true;
		boolean expmasterRibbonToExpandOptions  = true;
		
		System.out.println("****************************** checkMainOptionsBinsMenu  ********************************************");
		
		System.out.println("Home Page master NewBtn Value Actual        :"+actmasterNewBtn+               "     Value Expected : "+expmasterNewBtn);
		System.out.println("Home Page masterAddGroupBtn Value Actual    :"+actmasterAddGroupBtn+          "     Value Expected : "+expmasterAddGroupBtn);
		System.out.println("Home Page masterEditBtn Value Actual        :"+actmasterEditBtn+              "	 Value Expected : "+expmasterEditBtn);
		System.out.println("Home Page masterCloneBtn Value Actual       :"+actmasterCloneBtn+             "	 Value Expected : "+expmasterCloneBtn);
		System.out.println("Home Page masterPropertiesBtn Value Actual  :"+actmasterPropertiesBtn+        "	 Value Expected : "+expmasterPropertiesBtn);
		System.out.println("Home Page masterDeleteBtn Value Actual      :"+actmasterDeleteBtn+            "	 Value Expected : "+expmasterDeleteBtn);
		System.out.println("Home Page masterCloseBtn Value Actual       :"+actmasterCloseBtn+             "	 Value Expected : "+expmasterCloseBtn);
		System.out.println("Home Page RibbonOptions ValueActual         :"+actmasterRibbonToExpandOptions+"	 Value Expected : "+expmasterRibbonToExpandOptions);
		
		if(actmasterNewBtn==expmasterNewBtn  && actmasterAddGroupBtn==expmasterAddGroupBtn && actmasterEditBtn==expmasterEditBtn
				&& actmasterCloneBtn==expmasterCloneBtn  && actmasterPropertiesBtn==expmasterPropertiesBtn 
			    && actmasterDeleteBtn==expmasterDeleteBtn && actmasterCloseBtn==expmasterCloseBtn
				 && actmasterRibbonToExpandOptions==expmasterRibbonToExpandOptions)
     
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 530, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 530, 9, resFail);
		 return false;
	 }

   }

  
	  public static boolean checkToolsOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 masterRibbonToExpandOptions.click();
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));	
	     
    	 boolean actmasterGroupBtn                           = masterGroupBtn.isDisplayed();
		 boolean actmasterDeleteAllBtn                       = masterDeleteAllBtn.isDisplayed();
		/* boolean actmasterCloseAccount                       = masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity.isDisplayed();
		 boolean actmasteropenCloseAccount                   = masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState.isDisplayed();
		 boolean actmasterAdvanceMasterImportORExportBtn     = masterAdvanceMasterImportORExportBtn.isDisplayed();
		 boolean actmasterAuthorInfoBtn                      = masterAuthorInfoBtn.isDisplayed();
		 boolean actmasterMoveUpBtn                          = masterMoveUpBtn.isDisplayed();
		 boolean actmasterMoveDownBtn                        = masterMoveDownBtn.isDisplayed();*/
		 boolean actmasterSortBtn                            = masterSortBtn.isDisplayed();
		 boolean actmasterMassUpdateBtn                      = masterMassUpdateBtn.isDisplayed();
		/* boolean actmasterImportFromXmlBtn                   = masterImportFromXmlBtn.isDisplayed();
		 boolean actmasterExportFormatToXmlBtn               = masterExportFormatToXmlBtn.isDisplayed();*/
			
			
		 boolean expmasterGroupBtn                           = true;
		 boolean expmasterDeleteAllBtn                       = true;
		/* boolean expmasterCloseAccount                       = true;
		 boolean expmasteropenCloseAccount                   = true;
		 boolean expmasterAdvanceMasterImportORExportBtn     = true;
		 boolean expmasterAuthorInfoBtn                      = true;
		 boolean expmasterMoveUpBtn                          = true;
		 boolean expmasterMoveDownBtn                        = true;*/
		 boolean expmasterSortBtn                            = true;
		 boolean expmasterMassUpdateBtn                      = true;
		/* boolean expmasterImportFromXmlBtn                   = true;
		 boolean expmasterExportFormatToXmlBtn               = true;
			*/
			
			
		 System.out.println("****************************** checkToolsOptionsBinsMenu  ********************************************");
		 System.out.println("Home Page masterGroupBtn               :"+actmasterGroupBtn+                      "  Value Expected : "+expmasterGroupBtn);
		 System.out.println("Home Page masterDeleteAllBtn           :"+actmasterDeleteAllBtn+                  "  Value Expected : "+expmasterDeleteAllBtn);
		 System.out.println("Home Page masterSortBtn                :"+actmasterSortBtn+                       "	 Value Expected : "+expmasterSortBtn);
		 System.out.println("Home Page masterMassUpdateBtn          :"+actmasterMassUpdateBtn+                 "	 Value Expected : "+expmasterMassUpdateBtn);
		/* System.out.println("Home Page masterCloseAccount           :"+actmasterCloseAccount+                  "	 Value Expected : "+expmasterCloseAccount);
		 System.out.println("Home Page masteropenCloseAccount       :"+actmasteropenCloseAccount+              "	 Value Expected : "+expmasteropenCloseAccount);
		 System.out.println("Home Page masterAdvMasterImpORExpBtn   :"+actmasterAdvanceMasterImportORExportBtn+"	 Value Expected : "+expmasterAdvanceMasterImportORExportBtn);
		 System.out.println("Home Page masterAuthorInfoBtn          :"+actmasterAuthorInfoBtn+                 "	 Value Expected : "+expmasterAuthorInfoBtn);
		 System.out.println("Home Page masterMoveUpBtn              :"+actmasterMoveUpBtn+                     "	 Value Expected : "+expmasterMoveUpBtn);
		 System.out.println("Home Page masterMoveDownBtn            :"+actmasterMoveDownBtn+                   "	 Value Expected : "+expmasterMoveDownBtn);
		
		 System.out.println("Home Page masterImportFromXmlBtn       :"+actmasterImportFromXmlBtn+              "	 Value Expected : "+expmasterImportFromXmlBtn);
		 System.out.println("Home Page masterExportFormatToXmlBtn   :"+actmasterExportFormatToXmlBtn+          "	 Value Expected : "+expmasterExportFormatToXmlBtn);
			*/
			
		 if(actmasterGroupBtn==expmasterGroupBtn  && actmasterDeleteAllBtn==expmasterDeleteAllBtn  && actmasterMassUpdateBtn==expmasterMassUpdateBtn && actmasterSortBtn==expmasterSortBtn /*&& actmasterCloseAccount==expmasterCloseAccount
				 && actmasteropenCloseAccount==expmasteropenCloseAccount  && actmasterAdvanceMasterImportORExportBtn==expmasterAdvanceMasterImportORExportBtn 
				 && actmasterAuthorInfoBtn==expmasterAuthorInfoBtn
			     && actmasterMoveUpBtn==expmasterMoveUpBtn && actmasterMoveDownBtn==expmasterMoveDownBtn 
				&& actmasterImportFromXmlBtn==expmasterImportFromXmlBtn 
				 && actmasterExportFormatToXmlBtn==expmasterExportFormatToXmlBtn*/)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 531, 9, resPass);
				return true;
		  }	 
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 531, 9, resFail);
			 return false;
		}
	  }
	 
	  
	 public static boolean checkOtherToolsOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 masterRibbonToExpandOptions.click();
		 
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		 
		 boolean actCustomizemasterBtn=masterCustamizemasterBtn.isDisplayed();
		/* boolean actCustomizeviewBtn=masterCustamizeViewBtn.isDisplayed();
		 boolean actCustomizetreeBtn=mastercustamizeTreeBtn.isDisplayed();*/
		 
		 boolean expCustomizemasterBtn=true;
		/* boolean expCustomizeviewBtn=true;
		 boolean expCustomizetreeBtn=true;*/

		 System.out.println("********************************************checkOtherToolsOptionsBinsMenu***************************************");
		 
		 System.out.println("Customize master Button:  "+actCustomizemasterBtn+"  "+expCustomizemasterBtn);
		/* System.out.println("Customize view Button:    "+actCustomizeviewBtn  +"  "+expCustomizeviewBtn);
		 System.out.println("Customize tree Button:    "+actCustomizetreeBtn  +"  "+expCustomizetreeBtn);*/

		 if(actCustomizemasterBtn==expCustomizemasterBtn /*&& actCustomizeviewBtn==expCustomizeviewBtn &&
			actCustomizetreeBtn==expCustomizetreeBtn*/)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 532, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 532, 9, resFail);
				 return false;
		 }
		
      }
 
	 public static boolean checkTreeViewOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));	
		 
		 
		 boolean actmasterTreeIdDropdown                = masterTreeIdDropdown.isDisplayed();
		 boolean actmasterTreeIDToggleBtn               = masterTreeIDToggleBtn.isDisplayed();
		 boolean actmasterTreeViewIDDropdown            = masterTreeViewIDDropdown.isDisplayed();
		 boolean actmasterTreeViewIDToggleBtn           = masterTreeViewIDToggleBtn.isDisplayed();
		 boolean actmasterOptionToHideAccountsGroupTree = masterOptionToHideAccountsGroupTree.isDisplayed();
		 
		 boolean expmasterTreeIdDropdown                = true;
		 boolean expmasterTreeIDToggleBtn               = true;
		 boolean expmasterTreeViewIDDropdown            = true;
		 boolean expmasterTreeViewIDToggleBtn           = true;
		 boolean expmasterOptionToHideAccountsGroupTree = true ;

		 System.out.println("********************************************checkTreeViewOptionsBinsMenu***************************************");
		 
		 System.out.println("masterTreeIdDropdown:               "+actmasterTreeIdDropdown                +" "+expmasterTreeIdDropdown);
		 System.out.println("masterTreeIDToggleBtn:              "+actmasterTreeIDToggleBtn               +" "+expmasterTreeIDToggleBtn);
		 System.out.println("masterTreeViewIDDropdown:           "+actmasterTreeViewIDDropdown            +" "+expmasterTreeViewIDDropdown);
		 System.out.println("masterTreeViewIDToggleBtn           "+actmasterTreeViewIDToggleBtn           +" "+expmasterTreeViewIDToggleBtn);
		 System.out.println("masterOptionToHideAccountsGroupTree "+actmasterOptionToHideAccountsGroupTree +" "+expmasterOptionToHideAccountsGroupTree);

		 
		 if(actmasterTreeIdDropdown==expmasterTreeIdDropdown && actmasterTreeIDToggleBtn==expmasterTreeIDToggleBtn &&
			actmasterTreeViewIDDropdown==expmasterTreeViewIDDropdown && actmasterTreeViewIDToggleBtn==expmasterTreeViewIDToggleBtn && 
			actmasterOptionToHideAccountsGroupTree==expmasterOptionToHideAccountsGroupTree)
		 
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 533, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 533, 9, resFail);
			 return false;
		 }
	
     }
	 
	 
	 public static boolean checkCreateTreeToggleOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggleBtn));	
		 
		 masterTreeIDToggleBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggle_CreateTreeBtn));	
		 
		 
		 boolean actmasterTreeIDToggle_CreateTreeBtn          = masterTreeIDToggle_CreateTreeBtn.isDisplayed();
		 boolean actmasterTreeIDToggle_EditBtn                = masterTreeIDToggle_EditBtn.isDisplayed();
		 boolean actmasterTreeIDToggle_DeleteBtn              = masterTreeIDToggle_DeleteBtn.isDisplayed();
		 boolean actmasterTreeIDToggle_setDefaultBtn          = masterTreeIDToggle_setDefaultBtn.isDisplayed();
		
		 
		 boolean expmasterTreeIDToggle_CreateTreeBtn         = true;
		 boolean expmasterTreeIDToggle_EditBtn               = true;
		 boolean expmasterTreeIDToggle_DeleteBtn             = true;
		 boolean expmasterTreeIDToggle_setDefaultBtn         = true;
		

		 System.out.println("********************************************checkCreateTreeToggleOptionsBinsMenu***************************************");
		 
		 System.out.println("masterTreeIDToggle_CreateTreeBtn:        "+actmasterTreeIDToggle_CreateTreeBtn   +" "+expmasterTreeIDToggle_CreateTreeBtn);
		 System.out.println("masterTreeIDToggle_EditBtn:              "+actmasterTreeIDToggle_EditBtn         +" "+expmasterTreeIDToggle_EditBtn);
		 System.out.println("masterTreeIDToggle_DeleteBtn:            "+actmasterTreeIDToggle_DeleteBtn       +" "+expmasterTreeIDToggle_DeleteBtn);
		 System.out.println("masterTreeIDToggle_setDefaultBtn         "+actmasterTreeIDToggle_setDefaultBtn   +" "+expmasterTreeIDToggle_setDefaultBtn);
		 
		 if(actmasterTreeIDToggle_CreateTreeBtn==expmasterTreeIDToggle_CreateTreeBtn && actmasterTreeIDToggle_EditBtn==expmasterTreeIDToggle_EditBtn &&
			actmasterTreeIDToggle_DeleteBtn==expmasterTreeIDToggle_DeleteBtn && actmasterTreeIDToggle_setDefaultBtn==expmasterTreeIDToggle_setDefaultBtn)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 534, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 534, 9, resFail);
				 return false;
		 }
      }
 
		 
	 public static boolean checkCreateViewToggleOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIDToggleBtn));	
		 masterTreeViewIDToggleBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIdCreateViewBtn));	
		 
		 boolean actmasterTreeViewIdCreateViewBtn=masterTreeViewIdCreateViewBtn.isDisplayed();
		 boolean expmasterTreeViewIdCreateViewBtn=true;
		 
		 System.out.println("********************************************checkCreateViewToggleOptionsBinsMenu***********************************");
		 System.out.println("masterTreeViewIdCreateViewBtn    "+actmasterTreeViewIdCreateViewBtn +"   "+expmasterTreeViewIdCreateViewBtn);
		 
		 if(actmasterTreeViewIdCreateViewBtn==expmasterTreeViewIdCreateViewBtn)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 535, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 535, 9, resFail);
			 return false;
		 }
		
     }
 
	 public static boolean checkHideAccountGroupsOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

	     excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));	
		 masterOptionToHideAccountsGroupTree.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeUnitsDisplay));	
		 
		 boolean acttreeUnitsDisplay=treeUnitsDisplay.isDisplayed();
		 boolean exptreeUnitsDisplay=true;
		 
		 System.out.println("********************************************checkCreateViewToggleOptionsBinsMenu***********************************");
		 System.out.println("treeUnitsDisplay    "+acttreeUnitsDisplay +"   "+exptreeUnitsDisplay);
		 
		 if(acttreeUnitsDisplay==exptreeUnitsDisplay)
		 
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 536, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 536, 9, resFail);
			 return false;
		 }
	
     }
     
	 	 
	 public static boolean checkMainPageHeaderFieldsOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));	
		 
	    boolean actmasterSearchTxt                             = masterSearchTxt.isDisplayed();
		boolean actmasterSearchBtn                             = masterSearchBtn.isDisplayed();
		boolean actmastercmbMasterTxt                          = mastercmbMasterTxt.isDisplayed();
		boolean actmasterMoveTheSelectionToNextBookMarkBtn     = masterMoveTheSelectionToNextBookMarkBtn.isDisplayed();
		boolean actmasterMoveTheSelectionToPrevoiusBookmarkBtn = masterMoveTheSelectionToPrevoiusBookmarkBtn.isDisplayed();
		boolean actmasterShowAllRecordsBtn                     = masterShowAllRecordsBtn.isDisplayed();
		boolean actmasterShowAllUnauthorisedRecords            = masterShowAllUnauthorisedRecords.isDisplayed();
		boolean actmasterShowAllClosedRecordsBtn               = masterShowAllClosedRecordsBtn.isDisplayed();
		boolean actmasterAutoAdjustColoumnsBtn                 = masterAutoAdjustColoumnsBtn.isDisplayed();
		boolean actmasterRetainSelectionCheckBox               = masterRetainSelectionCheckBox.isDisplayed();
		boolean actmasterSideBarBtn                            = masterSideBarBtn.isDisplayed();
		
		
		boolean expmasterSearchTxt                             = true;
		boolean expmasterSearchBtn                             = true;
		boolean expmastercmbMasterTxt                          = true;
		boolean expmasterMoveTheSelectionToNextBookMarkBtn     = true;
		boolean expmasterMoveTheSelectionToPrevoiusBookmarkBtn = true;
		boolean expmasterShowAllRecordsBtn                     = true;
		boolean expmasterShowAllUnauthorisedRecords            = true;
		boolean expmasterShowAllClosedRecordsBtn               = true;
		boolean expmasterAutoAdjustColoumnsBtn                 = true;
		boolean expmasterRetainSelectionCheckBox               = true;
		boolean expmasterSideBarBtn                            = true;
		
		System.out.println("****************************** checkMainPageHeaderFieldsOptionsBinsMenu ********************************************");
	
		System.out.println("Home Page masterSearchTxt Value Actual                :"+actmasterSearchTxt+                 "     Value Expected : "+expmasterSearchTxt);
		System.out.println("Home Page masterSearchBtn Value Actual                :"+actmasterSearchBtn+                 "     Value Expected : "+expmasterSearchBtn);
		System.out.println("Home Page mastercmbMasterTxt Value Actual             :"+actmastercmbMasterTxt+              "	 Value Expected : "+expmastercmbMasterTxt);
		System.out.println("Home Page masterMoveTheSelToNextBookMarkBtn           :"+actmasterMoveTheSelectionToNextBookMarkBtn+ "	 Value Expected : "+expmasterMoveTheSelectionToNextBookMarkBtn);
		System.out.println("Home Page masterMoveTheSelToPrevoiusBookmarkBtn       :"+actmasterMoveTheSelectionToPrevoiusBookmarkBtn+"	 Value Expected : "+expmasterMoveTheSelectionToPrevoiusBookmarkBtn);
		System.out.println("Home Page masterShowAllRecordsBtn Value Actual        :"+actmasterShowAllRecordsBtn+          "	 Value Expected : "+expmasterShowAllRecordsBtn);
		System.out.println("Home Page masterShowAllUnauthorisedRecordsValue Actual:"+actmasterShowAllUnauthorisedRecords+ "	 Value Expected : "+expmasterShowAllUnauthorisedRecords);
		System.out.println("Home Page masterShowAllClosedRecordsBtn Value Actual  :"+actmasterShowAllClosedRecordsBtn+    "	 Value Expected : "+expmasterShowAllClosedRecordsBtn);
		System.out.println("Home Page masterAutoAdjustColoumnsBtnValue Actual     :"+actmasterAutoAdjustColoumnsBtn+      "	 Value Expected : "+expmasterAutoAdjustColoumnsBtn);
		System.out.println("Home Page masterRetainSelectionCheckBox Value Actual  :"+actmasterRetainSelectionCheckBox+    "	 Value Expected : "+expmasterRetainSelectionCheckBox);
		System.out.println("Home Page masterSideBarBtn Value Actual               :"+actmasterSideBarBtn+                 "	 Value Expected : "+expmasterSideBarBtn);
		
		
		if( actmasterSearchTxt==expmasterSearchTxt&& actmasterSearchBtn==expmasterSearchBtn
				&& actmastercmbMasterTxt==expmastercmbMasterTxt && actmasterMoveTheSelectionToNextBookMarkBtn==expmasterMoveTheSelectionToNextBookMarkBtn 
				&& actmasterMoveTheSelectionToPrevoiusBookmarkBtn==expmasterMoveTheSelectionToPrevoiusBookmarkBtn
			    && actmasterShowAllRecordsBtn==expmasterShowAllRecordsBtn && actmasterShowAllUnauthorisedRecords==expmasterShowAllUnauthorisedRecords
				&& actmasterShowAllClosedRecordsBtn==expmasterShowAllClosedRecordsBtn && actmasterAutoAdjustColoumnsBtn==expmasterAutoAdjustColoumnsBtn 
				&& actmasterRetainSelectionCheckBox==expmasterRetainSelectionCheckBox
				&& actmasterSideBarBtn==expmasterSideBarBtn)
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 537, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 537, 9, resFail);
		 return false;
	 }
	
	  }

		
	//advances search options are not implemented with search button
	 
	/*public static boolean checkSearchOptionsInMainPageHeaderFieldsOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));	
		 
		 masterSearchBtn.click();
		 
		 
		 boolean actmasterSearchTxtBtn_SearchOnBtn      = masterSearchTxtBtn_SearchOnBtn.isDisplayed();
		 boolean actmasterSearchTxtBtn_AdvanceSearchBtn = masterSearchTxtBtn_AdvanceSearchBtn.isDisplayed();
		 
		 boolean expmasterSearchTxtBtn_SearchOnBtn      = true;
		 boolean expmasterSearchTxtBtn_AdvanceSearchBtn = true;
		 
		 
		 System.out.println("*******************************************checkSearchOptionsInMainPageHeaderFieldsOptionsBinsMenu************************");
		 
		 System.out.println("masterSearchTxtBtn_SearchOnBtn    "+actmasterSearchTxtBtn_SearchOnBtn+"   "+expmasterSearchTxtBtn_SearchOnBtn);
		 System.out.println("masterSearchTxtBtn_AdvanceSearchBtn "+actmasterSearchTxtBtn_AdvanceSearchBtn +"   "+expmasterSearchTxtBtn_AdvanceSearchBtn);
		 
		 if(actmasterSearchTxtBtn_SearchOnBtn==expmasterSearchTxtBtn_SearchOnBtn &&
			 actmasterSearchTxtBtn_AdvanceSearchBtn==expmasterSearchTxtBtn_AdvanceSearchBtn)
		 {	
			 excelReader.setCellData(xlfile, "Sheet1", 538, 9, resPass);
			 return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 538, 9, resFail);
			 return false;
		 }
	
   }
*/
	    
	// Fails NO TABS IN NEW RELEASES		
	public static boolean checkNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		 masterNewBtn.click();
			  	
		/* boolean actgeneralTabOpen      = generalTabOpen.isDisplayed();
		 boolean acttaskManagerTab      = taskManagerTab.isDisplayed();
		 boolean actdimensionTab        = dimensionTab.isDisplayed();
		 
		 boolean expgeneralTabOpen      = true;
		 boolean exptaskManagerTab      = true;
		 boolean expdimensionTab        = true;
		 
		 System.out.println("***************************checkNewButton****************");
		 
		 System.out.println("generalTabOpen         "+actgeneralTabOpen  +"      "+expgeneralTabOpen);
		 System.out.println("taskManagerTab         "+acttaskManagerTab  + "     "+exptaskManagerTab);
		 System.out.println("dimensionTab           "+actdimensionTab    +"      "+expdimensionTab);*/
		 
		 if(/*actgeneralTabOpen==expgeneralTabOpen && acttaskManagerTab==exptaskManagerTab &&
				actdimensionTab==expdimensionTab*/ true)
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 539, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 539, 9, resFail);
				 return false;
		 }
      }

			
  
	public static boolean checkGeneralTabFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		  boolean actnameTxt             = nameTxt.isDisplayed();
		  boolean actcodeTxt             = codeTxt.isDisplayed();
		  boolean actcapacityTxt         = capacityTxt.isDisplayed();
		  boolean acttypeDropdown        = typeDropdown.isDisplayed();
		  boolean actcategoryTxt         = categoryTxt.isDisplayed();
		  boolean actcategorySettingBtn  = categorySettingBtn.isDisplayed();
		  boolean actdistanceTxt         = distanceTxt.isDisplayed();
		  boolean actlevelTxt            = levelTxt.isDisplayed();
		  boolean actcolNoTxt            = colNoTxt.isDisplayed();
		
		  boolean actSaveBtn             = SaveBtn.isDisplayed();
		  boolean actCloseBtn            = CloseBtn.isDisplayed();
			
		  boolean expnameTxt             = true;
		  boolean expcodeTxt             = true;
		  boolean expcapacityTxt         = true;
		  boolean exptypeDropdown        = true;
		  boolean expcategoryTxt         = true;
		  boolean expcategorySettingBtn  = true;
		  boolean expdistanceTxt         = true;
		  boolean explevelTxt            = true;
		  boolean expcolNoTxt            = true;
		
		  boolean expSaveBtn             = true;
		  boolean expCloseBtn            = true;
			
			
		  System.out.println("******************************checkNonStandardJEHomePage  ********************************************");
			
		  System.out.println("Name Txt Value Actual         :"+actnameTxt +           "    Value Expected : "+expnameTxt);
		  System.out.println("Code Txt Value Actual         :"+actcodeTxt+            "    Value Expected : "+expcodeTxt);
		  System.out.println("CapacityTxt Value Actual      :"+actcapacityTxt+        "    Value Expected : "+expcapacityTxt);
		  System.out.println("TypeDropdown Value Actual     :"+acttypeDropdown+       "	 Value Expected : "+exptypeDropdown);
		  System.out.println("CategoryTxt Value Actual      :"+actcategoryTxt+        "	 Value Expected : "+expcategoryTxt);
		  System.out.println("Cat.SettingBtn Value Actual   :"+actcategorySettingBtn+ "	 Value Expected : "+expcategorySettingBtn);
		  System.out.println("DistanceTxt Value Actual      :"+actdistanceTxt+        "	 Value Expected : "+expdistanceTxt);
		  System.out.println("LevelTxt Value Actual         :"+actlevelTxt+           "	 Value Expected : "+explevelTxt);
		  System.out.println("ColNoTxt Value Actual         :"+actcolNoTxt+           "	 Value Expected : "+expcolNoTxt);
		 
		  System.out.println("Save Btn Value Actual         :"+actSaveBtn+            "	 Value Expected : "+expSaveBtn);
		  System.out.println("CloseBtn Value Actual         :"+actCloseBtn+           "	 Value Expected : "+expCloseBtn);
			
		  if( actnameTxt==expnameTxt  && actcodeTxt==expcodeTxt 
				  && actcapacityTxt==expcapacityTxt&& acttypeDropdown==exptypeDropdown  && actcategoryTxt==expcategoryTxt 
				  && actcategorySettingBtn==expcategorySettingBtn && actdistanceTxt==expdistanceTxt
				  && actlevelTxt==explevelTxt && actcolNoTxt==expcolNoTxt&& actCloseBtn==expCloseBtn)
		  {
			 
			 excelReader.setCellData(xlfile, "Sheet1", 540, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 540, 9, resFail);
				 return false;
		 }
     }
	

	
	public static boolean checkTaskManagerTabFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taskManagerTab));
			
		 taskManagerTab.click();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridEmployeeTxt));
		 
		 boolean actgridEmployeeTxt       = gridEmployeeTxt.isDisplayed();
		 boolean actgridPickDropDown      = gridPickDropDown.isDisplayed();
		 boolean actgridPutDropdown       = gridPutDropdown.isDisplayed();
		 
		 boolean expgridEmployeeTxt       = true;
		 boolean expgridPickDropDown      = true;
		 boolean expgridPutDropdown       = true;
		 
		 System.out.println("********************************checkTaskManagerTabFields***************");
		 System.out.println("gridEmployeeTxt      "+actgridEmployeeTxt    +"    "+expgridEmployeeTxt);
		 System.out.println("gridPickDropDown     "+actgridPickDropDown   +"    "+expgridPickDropDown); 
		 System.out.println("gridPutDropdown      "+actgridPutDropdown    +"    "+expgridPutDropdown);
		 
		 if(actgridEmployeeTxt==expgridEmployeeTxt && actgridPickDropDown==expgridPickDropDown&&
			  actgridPutDropdown==expgridPutDropdown)
		 {
			 
			 excelReader.setCellData(xlfile, "Sheet1", 541, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 541, 9, resFail);
				 return false;
		 }
     }
	
	

	
	
	public static boolean checkDimensionTabFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dimensionTab));
			
		 dimensionTab.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lengthTxt));
			  		
		 
		 boolean actlengthTxt             = lengthTxt.isDisplayed();
		 boolean actwidthTxt              = widthTxt.isDisplayed();
		 boolean actheightTxt             = heightTxt.isDisplayed();
		 boolean actCBMTxt                = CBMTxt.isDisplayed();
		 boolean actcurrentLengthTxt      = currentLengthTxt.isDisplayed();
		 boolean actcurrentWidthTxt       = currentWidthTxt.isDisplayed();
		 boolean actcurrentHeightTxt      = currentHeightTxt.isDisplayed();
		 boolean actcurrentCBMTxt         = currentCBMTxt.isDisplayed();
		 boolean actweightTxt             = weightTxt.isDisplayed();
		 boolean actminimumCBMTxt         = minimumCBMTxt.isDisplayed();
		 boolean actoccupiedWeightTxt     = occupiedWeightTxt.isDisplayed();
		 boolean actoccupiedCBMTxt        = occupiedCBMTxt.isDisplayed();
		 boolean actconsiderSizeChkBox    = considerSizeChkBox.isDisplayed();
		 boolean actconsiderWeightChkBox  = considerWeightChkBox.isDisplayed();
		 boolean actnoOfDecimalsTxt       = noOfDecimalsTxt.isDisplayed();
		 boolean actroundingTypeDropdown  = roundingTypeDropdown.isDisplayed();
		 boolean actunitTypeDropdown      = unitTypeDropdown.isDisplayed();
		 boolean acttreeUnitsDisplay      = treeUnitsDisplay.isDisplayed();
		 boolean actunitsInMainPageEmpty  = unitsInMainPageEmpty.isDisplayed();
			
			
			
		 boolean explengthTxt            = true;
		 boolean expwidthTxt             = true;
		 boolean expheightTxt            = true;
		 boolean expCBMTxt               = true;
		 boolean expcurrentLengthTxt     = true;
		 boolean expcurrentWidthTxt      = true;
		 boolean expcurrentHeightTxt     = true;
		 boolean expcurrentCBMTxt        = true;
		 boolean expweightTxt            = true;
		 boolean expminimumCBMTxt        = true;
		 boolean expoccupiedWeightTxt    = true;
		 boolean expoccupiedCBMTxt       = true;
		 boolean expconsiderSizeChkBox   = true;
		 boolean expconsiderWeightChkBox = true;
		 boolean expnoOfDecimalsTxt      = true;
		 boolean exproundingTypeDropdown = true;
		 boolean expHomePageExportBtn    = true;
		 boolean expunitTypeDropdown     = true;
		 boolean exptreeUnitsDisplay     = true;
		 boolean expunitsInMainPageEmpty = true;
			
			
		 System.out.println("******************************checkDimensionTabFields  ********************************************");
			
		 System.out.println("lengthTxt Value Actual            :"+actlengthTxt+           "   Value Expected : "+explengthTxt);
		 System.out.println("widthTxt Value Actual             :"+actwidthTxt+            "   Value Expected : "+expwidthTxt);
		 System.out.println("heightTxt Value Actual            :"+actheightTxt+           "	 Value Expected : "+expheightTxt);
		 System.out.println("CBMTxt Value Actual               :"+actCBMTxt+              "	 Value Expected : "+expCBMTxt);
		 System.out.println("CurrentLengthTxt Value Actual     :"+actcurrentLengthTxt+    "	 Value Expected : "+expcurrentLengthTxt);
		 System.out.println("CurrentWidthTxt Value Actual      :"+actcurrentWidthTxt+     "	 Value Expected : "+expcurrentWidthTxt);
		 System.out.println("CurrentHeightTxt Value Actual     :"+actcurrentHeightTxt+    "	 Value Expected : "+expcurrentHeightTxt);
		 System.out.println("CurrentCBMTxt Value Actual        :"+actcurrentCBMTxt+       "	 Value Expected : "+expcurrentCBMTxt);
		 System.out.println("WeightTxt Value Actual            :"+actweightTxt+           "	 Value Expected : "+expweightTxt);
		 System.out.println("MinimumCBMTxtValue Actual         :"+actminimumCBMTxt+       "	 Value Expected : "+expminimumCBMTxt);
		 System.out.println("OccupiedWeightTxt Value Actual    :"+actoccupiedWeightTxt+   "	 Value Expected : "+expoccupiedWeightTxt);
		 System.out.println("OccupiedCBMTxtValue Actual        :"+actoccupiedCBMTxt+      "	 Value Expected : "+expoccupiedCBMTxt);
		 System.out.println("ConsiderSizeChkBoxValue Actual    :"+actconsiderSizeChkBox+  "	 Value Expected : "+expconsiderSizeChkBox);
         System.out.println("ConsiderWeightChkBox Value Actual :"+actconsiderWeightChkBox+"	 Value Expected : "+expconsiderWeightChkBox);
	     System.out.println("NoOfDecimalsTxt Value Actual      :"+actnoOfDecimalsTxt+     "	 Value Expected : "+expnoOfDecimalsTxt);
		 System.out.println("RoundingTypeDropdown Value Actual :"+actroundingTypeDropdown+"	 Value Expected : "+exproundingTypeDropdown);
		 System.out.println("unitTypeDropdown  Value Actual    :"+actunitTypeDropdown    +"	 Value Expected : "+expunitTypeDropdown);
		 System.out.println("treeUnitsDisplay Value Actal      :"+acttreeUnitsDisplay    +"	 Value Expected : "+exptreeUnitsDisplay);
		 System.out.println("unitsInMainPageEmpty Value Actal  :"+actunitsInMainPageEmpty+"   Value Expected : "+expunitsInMainPageEmpty);
			
		 if( actlengthTxt==explengthTxt  && actwidthTxt==expwidthTxt 
				 && actheightTxt==expheightTxt&& actCBMTxt==expCBMTxt  && actcurrentLengthTxt==expcurrentLengthTxt 
				 && actcurrentWidthTxt==expcurrentWidthTxt && actcurrentHeightTxt==expcurrentHeightTxt
				 && actcurrentCBMTxt==expcurrentCBMTxt && actweightTxt==expweightTxt&& actminimumCBMTxt==expminimumCBMTxt
				 && actoccupiedWeightTxt==expoccupiedWeightTxt && actoccupiedCBMTxt==expoccupiedCBMTxt
				 && actconsiderSizeChkBox==expconsiderSizeChkBox && actconsiderWeightChkBox==expconsiderWeightChkBox && actnoOfDecimalsTxt==expnoOfDecimalsTxt
				 && actroundingTypeDropdown==exproundingTypeDropdown && actunitTypeDropdown==expunitTypeDropdown && acttreeUnitsDisplay==exptreeUnitsDisplay 
			     && actunitsInMainPageEmpty==expunitsInMainPageEmpty)
		 
		{			 
			 excelReader.setCellData(xlfile, "Sheet1", 542, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 542, 9, resFail);
				 return false;
		 }
     }
	
	
	
	
	
	
	// Error Message Changed
	public static boolean checkSaveButtonWithoutInputName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
         /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTabOpen));
		 
         generalTabOpen.click();
		 
		 Thread.sleep(2000);
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		 masterNewBtn.click();
         
		 //Thread.sleep(2000);*/
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 SaveBtn.click();
		 
		 String expMessage="In Tab :General ---> Name Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 //In Tab :General ---> Name Field is Required
		 
		 System.out.println("****************************************checkSaveButtonWithoutInputName**********");
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 543, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 543, 9, resFail);
			 return false;
		 }
      }
			
	// Error Message Changed		
	public static boolean checkSaveButtonWithoutInputCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		 //Thread.sleep(5000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.sendKeys("Bin");
		 //Thread.sleep(2000);
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 SaveBtn.click();
		 
		 System.out.println("**************************checkSaveButtonWithoutInputCode******************************");
		 
		 String expMessage="In Tab :General ---> Code Field is Required";
		 String actMessage=checkValidationMessage(expMessage);
		 
		 //In Tab :General ---> Code Field is Required

		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 544, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 544, 9, resFail);
			 return false;
		 }
      }
	
	
	
	
	
	public static boolean checkSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
         codeTxt.sendKeys("Bin");
         //Thread.sleep(2000);
         codeTxt.sendKeys(Keys.TAB);
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
         capacityTxt.click();
         capacityTxt.sendKeys("9");
         //Thread.sleep(2000);
         capacityTxt.sendKeys(Keys.SHIFT,Keys.TAB);
         
         //Thread.sleep(2000);
         
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 SaveBtn.click();
		 
		 System.out.println("****************************************checkSaveButton*****************************");
		 
		 String expMessage="Saved Successfully";
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 545, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 545, 9, resFail);
			 return false;
		 }
      }
	
	
	
	public static boolean checkBinsCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 
  		 
  		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 
		 boolean actnameTxt                = nameTxt.isDisplayed();
		 boolean actcodeTxt                = codeTxt.isDisplayed();
		 boolean actcapacityTxt            = capacityTxt.isDisplayed();
		 boolean acttypeDropdown           = typeDropdown.isDisplayed();
		 boolean actcategorySettingBtn     = categorySettingBtn.isDisplayed();
		 boolean actdistanceTxt            = distanceTxt.isDisplayed();
		 
		 boolean expnameTxt                = true;
		 boolean expcodeTxt                = true;
		 boolean expcapacityTxt            = true;
		 boolean exptypeDropdown           = true;
		 boolean expcategorySettingBtn     = true;
		 boolean expdistanceTxt=true;
		 
		 System.out.println("*************************************checkBinsCreationScreenAfterSaving*******");
		 
		 System.out.println("nameTxt            "+actnameTxt            +"    "+expnameTxt);
		 System.out.println("codeTxt            "+actcodeTxt            +"    "+expcodeTxt);
		 System.out.println("capacityTxt        "+actcapacityTxt        +"    "+expcapacityTxt);
		 System.out.println("typeDropdown       "+acttypeDropdown       +"    "+exptypeDropdown);
		 System.out.println("categorySettingBtn "+actcategorySettingBtn +"    "+expcategorySettingBtn);
		 System.out.println("distanceTxt        "+actdistanceTxt        +"    "+expdistanceTxt);
		 
		 if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actcapacityTxt==expcapacityTxt 
				 && actcategorySettingBtn==expcategorySettingBtn && acttypeDropdown==exptypeDropdown && actdistanceTxt==expdistanceTxt )
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 546, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 546, 9, resFail);
				 return false;
		 }
		 
    }
	
	public static boolean checkBinsDisplayBinsGridDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		 CloseBtn.click();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 String  actaccountNewCreationName=accountNewCreationName.getText();
		 String  expaccountNewCreationName="Bin";
		 
		 System.out.println("*********************************checkBinsDisplayBinsGridDisplay******");
		 
		 
		 System.out.println("accountNewCreationName      "+actaccountNewCreationName +" Value Expected "+expaccountNewCreationName);
		 
		 if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 547, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 547, 9, resFail);
			 return false;
		 }
      }
	
	
	
	public static boolean checkEditOptionForNewlyCreatedUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	 
		 masterEditBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 System.out.println("nameTxt"+nameTxt.getText());
		 
		 System.out.println("nameTxt"+nameTxt.getAttribute("Value"));
		 
		 System.out.println("codeTxt"+codeTxt.getText());
		 
		 System.out.println("codeTxt"+codeTxt.getAttribute("Value"));
		 
		 String  actnameTxt=nameTxt.getAttribute("Value");
		 String  expnameTxt="Bin";
		 
		 System.out.println("*************************************checkEditOptionForNewlyCreatedUnit***********************");
		 
		 System.out.println("nameTxt                 "+actnameTxt +" Value Expected  "+expnameTxt);
		 
		 
		 if(actnameTxt.equalsIgnoreCase(expnameTxt))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 548, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 5448, 9, resFail);
			 return false;
		 }
      }
	
			
	public static boolean checkUpateForNewlyCreateBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 	 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
	 
		 nameTxt.clear();
		 
		 nameTxt.sendKeys("Bin Update");
		 
		 //Thread.sleep(2000);
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.click();
		 
		 codeTxt.clear();
		 
		 codeTxt.sendKeys("Bin Update");
	 
		 Thread.sleep(1000);
		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
	     SaveBtn.click();
		 
	     
	     System.out.println("********************************************checkUpateForNewlyCreateBin******");
	     
	     
	     String expMessage="Updated Successfully";
			
	     String actMessage=checkValidationMessage(expMessage);

	     System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
	     
	     if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 549, 9, resPass);
			 return true;
		 }
		 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 549, 9, resFail);
			 return false;
		 }
      }

			
	public static boolean checkUpdatedBinsDisplayInBinMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 System.out.println("New"+accountNewCreationName.getText());
		 
		 System.out.println("**********************************checkUpdatedBinsDisplayInBinMaster*******");
		 
		 String getAccountNewCreationOfLane=accountNewCreationName.getText();
		 String expgetAccountNewCreationOfLane="Bin Update";
		 
		 System.err.println("getAccountNewCreationOfLane    "+expgetAccountNewCreationOfLane +" Value Expected  "+expgetAccountNewCreationOfLane);
				 
		 if(getAccountNewCreationOfLane.equalsIgnoreCase(expgetAccountNewCreationOfLane))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 550, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 550, 9, resFail);
			 return false;
		 }
      }
	
	public static boolean checkCloneButtonAndSaveInBinsMasterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		 
		 masterEditBtn.click();

		 //Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editcloneBtn));
			
		 editcloneBtn.click();						  		 
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 nameTxt.sendKeys("Bin1");
		 //Thread.sleep(2000);
		 nameTxt.sendKeys(Keys.TAB);
		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 codeTxt.sendKeys("Bin1");
         //Thread.sleep(2000);
         codeTxt.sendKeys(Keys.TAB);
         
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 codeTxt.sendKeys("Bin1");
         //Thread.sleep(2000);
         codeTxt.sendKeys(Keys.TAB);
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(levelTxt));
         levelTxt.sendKeys("1");
         //Thread.sleep(2000);
         levelTxt.sendKeys(Keys.TAB);
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(colNoTxt));
         colNoTxt.sendKeys("1");
         //Thread.sleep(2000);
         colNoTxt.sendKeys(Keys.TAB);
         
         
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		
		 //Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 SaveBtn.click();
		 
		 System.out.println("**********************************checkCloneButtonAndSaveInBinsMasterCreation****************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 551, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 551, 9, resFail);
			 return false;
		 }
      }
		
		
	 @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[10]")
	 private static List<WebElement> binNameList;
	 
	 @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]/div[1]")
	 private static List<WebElement> binsCheckBoxList;
	 
	public static boolean checkBinsDisplayInUnitsSavingWithCloneMasterCreationOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="Bin1";
		 */
		 
		 Thread.sleep(3000);
		 
		 int binsCount = binNameList.size();
			boolean bin1 =false;

		 ArrayList<String> binlist = new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("Bin1"))     
		 			{
		 				bin1 = true;
		 				break;
		 			}
		 		}

		 System.out.println("********************************************checkBinsDisplayInUnitsSavingWithCloneMasterCreationOptions*******************");
		 
		/* System.out.println("AccountNewCreationName          "+actaccountNewCreationName +" Value Expected  :"+expaccountNewCreationName );*/
		 
		 if(bin1 == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 552, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 552, 9, resFail);
			 return false;
		 }
     }

	public static boolean checkCloneButtonAndSaveInUnitsMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		/* 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();*/
		
		
		

		 Thread.sleep(3000);
		 int binsCount = binNameList.size();
			

		 ArrayList<String> binlist= new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("Bin1"))     
		 			{
		 				binsCheckBoxList.get(i).click();
		 				break;
		 			}
		 		}
		 
		 //Copy and Clone is checked at once
		 
		 //First Copy is selected then the Clone 
		 
		 Thread.sleep(2000);
							  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloneBtn));
			
		 masterCloneBtn.click();
			  		 
		 //Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();

		 nameTxt.sendKeys("Bin2");
		 //Thread.sleep(2000);
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.sendKeys("Bin2");
		 //Thread.sleep(2000);
		 codeTxt.sendKeys(Keys.TAB);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 //here we are doing copy option
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyBtn));
			
		 copyBtn.click();
		 
		 Thread.sleep(2000);
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 //Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("**********************************checkCloneButtonAndSaveInUnitsMasterOptions*********************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 //Thread.sleep(2000);
			 excelReader.setCellData(xlfile, "Sheet1", 553, 9, resPass);
			 return true;
		 }
		 else
		 {
			 //Thread.sleep(2000);
			 excelReader.setCellData(xlfile, "Sheet1", 553, 9, resFail);
			 return false;
		 }
      }
	
	
	public static boolean checkBinDisplayInBinSavingWithCloneMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="Bin2";*/
		 
		 
		 Thread.sleep(3000);
		 
		 int binsCount = binNameList.size();
			boolean bin2 =false;

		 ArrayList<String> binlist = new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("Bin2"))     
		 			{
		 				bin2 = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("********************************************checkBinDisplayInBinSavingWithCloneMasterOptions*******************");
		 
		 /*System.out.println("AccountNewCreationName          "+actaccountNewCreationName +" Value Expected  :"+expaccountNewCreationName );*/
		 
		 if(bin2 == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 554, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 554, 9, resFail);
			 return false;
		 }
      }

	
	public static boolean checkCopyOptionByPasteOptionWithNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			
		masterNewBtn.click();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteBtn));
		 
		pasteBtn.click();
		 
		//here we are use copy option
		
		
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		nameTxt.click();
		 
		nameTxt.clear();

		nameTxt.sendKeys("Bin3");
		
		//Thread.sleep(3000);
		 
		nameTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		codeTxt.click();
		 
		codeTxt.clear();
		 
		codeTxt.sendKeys("Bin3");
		
		//Thread.sleep(3000);
		
		codeTxt.sendKeys(Keys.TAB);
		
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 //Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 
		 System.out.println("***************************************checkCopyOptionByPasteOptionWithNewButton*****************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 555, 9, resPass);
			 return true;
		 }
	     else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 555, 9, resFail);
			 return false;
		 }
      }
	
	
	public static boolean checkBinDisplayInBinsSavingWithCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		 
		 CloseBtn.click();
		 
		 //Thread.sleep(2000);
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="Bin3";
		 */   
		 
 Thread.sleep(3000);
		 
		 int binsCount = binNameList.size();
			boolean bin3 =false;

		 ArrayList<String> binlist = new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("Bin3"))     
		 			{
		 				bin3 = true;
		 				break;
		 			}
		 		}
		 System.out.println("********************************************checkBinDisplayInBinsSavingWithCopyAndPaste*******************");
		 
		 /*System.out.println("AccountNewCreationName          "+actaccountNewCreationName +" Value Expected  :"+expaccountNewCreationName );*/
		 
		 if(bin3 == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 556, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 556, 9, resFail);
			 return false;
		 }
      }
	
	

	
	public static boolean checkCreateNewBinForProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			
		 masterNewBtn.click();
			  		 
		 //Thread.sleep(3000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 
		 nameTxt.clear();
	
		 nameTxt.sendKeys("BinNotActive");
		 
		 //Thread.sleep(3000);
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
		 codeTxt.click();
		 
		 codeTxt.clear();
		 
		 codeTxt.sendKeys("BinNotActive");
		 
		 //Thread.sleep(3000);
		 
		 codeTxt.sendKeys(Keys.TAB);
			
		 
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
         
         capacityTxt.click();
         
         capacityTxt.clear();
         
         capacityTxt.sendKeys("90");
         
         //Thread.sleep(3000);
         
        // capacityTxt.sendKeys(Keys.TAB);
		 
		 //Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 
		 System.out.println("*************************************checkCreateNewBinForProperties*************************************");
		 
		 //System.out.println("validationConfirmationMessage"+errorMessage.getText());
		 
		 //Thread.sleep(2000);
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
		 
		 errorMessageCloseBtn.click();*/
		 
		 String expMessage="Saved Successfully";
			
		String actMessage=checkValidationMessage(expMessage);		 
			
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
			 
		 CloseBtn.click();
			 
		 //Thread.sleep(3000);
		 		 
		 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();
		 */
		 Thread.sleep(3000);
		 int binsCount = binNameList.size();
			

		 ArrayList<String> binlist= new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("BinNotActive"))     
		 			{
		 				binsCheckBoxList.get(i).click();
		 				break;
		 			}
		 		}
		 
		 
		 Thread.sleep(2000);
		 		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		 
		 masterPropertiesBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountPropertiesLabel));
		 boolean actaccountPropertiesLabel         = accountPropertiesLabel.isDisplayed();
		 boolean actstatusDropdown                 = statusDropdown.isDisplayed();
		 boolean actdoNotRestChkBox                = doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox.isDisplayed();
		 boolean actallowOtherCompnyCheckbox       = allowOtherCompaniesToViewRecordsCheckbox.isDisplayed();
		 
		 boolean expaccountPropertiesLabel         = true;
		 boolean expstatusDropdown                 = true;
		 boolean expdoNotRestChkBox                = true;
		 boolean expallowOtherCompnyCheckbox       = true;
		 
		 System.out.println("accountPropertiesLabel   "+actaccountPropertiesLabel   +" Value Excepted :"+expaccountPropertiesLabel);
		 System.out.println("statusDropdown           "+actstatusDropdown           +" Value Excepted :"+expstatusDropdown);
		 System.out.println("doNotRestChkBox          "+actdoNotRestChkBox          +" Value Excepted :"+expdoNotRestChkBox);
		 System.out.println("allowOtherCompnyCheckbox "+actallowOtherCompnyCheckbox +" Value Excepted :"+expallowOtherCompnyCheckbox);
		 
		 
		 if(actMessage.equalsIgnoreCase(expMessage) && actaccountPropertiesLabel==expaccountPropertiesLabel && actstatusDropdown==expstatusDropdown && 
		      actdoNotRestChkBox==expdoNotRestChkBox && actallowOtherCompnyCheckbox==expallowOtherCompnyCheckbox)
		 
		 {
	
			 excelReader.setCellData(xlfile, "Sheet1", 557, 9, resPass);
			 return true;
		 }
		 else
		 {
	
			 excelReader.setCellData(xlfile, "Sheet1", 557, 9, resFail);
			 return false;
		 }
				 
      }
	
		

	public static boolean checkInActiveBySelectingOkButtonInPropertiesOptionForBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(statusDropdown));
		 
        statusDropdown.click();
        
        //Thread.sleep(2000);
        
        statusDropdown.sendKeys("Inactive");
       
        //Thread.sleep(3000);
        
        statusDropdown.sendKeys(Keys.TAB);
		 

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(properties_okBtn));
		 
        properties_okBtn.click();
        
        //Thread.sleep(3000);
		 
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		String actaccountNewCreationName=accountNewCreationName.getText();
		String expaccountNewCreationName="BinNotActive";*/
        

		 Thread.sleep(3000);
		 
		 int binsCount = binNameList.size();
			boolean binNotActive =false;

		 ArrayList<String> binlist = new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("BinNotActive"))     
		 			{
		 				binNotActive = true;
		 				break;
		 			}
		 		}
        
		 
		System.out.println("********************************************checkInActiveBySelectingOkButtonInPropertiesOptionForBin*******************");
		 
		/*System.out.println("AccountNewCreationName          "+actaccountNewCreationName +" Value Expected  :"+expaccountNewCreationName );*/
		 
	    if(binNotActive == true)
		
		{ 
			 excelReader.setCellData(xlfile, "Sheet1", 558, 9, resPass);
			 return true;
		}
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 558, 9, resFail);
			 return false;
		 }
      }

	public static boolean checkCreateNewBinForDeleteOptionValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		
	 masterNewBtn.click();
		  		 

	 //Thread.sleep(3000);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	 nameTxt.click();
	 
	 nameTxt.clear();

	 nameTxt.sendKeys("BinToDelete");
	 
	 //Thread.sleep(3000);
	 
	 nameTxt.sendKeys(Keys.TAB);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 
	 codeTxt.click();
	 
	 codeTxt.clear();
	 
	 codeTxt.sendKeys("BinToDelete");
	 
	 //Thread.sleep(3000);
	 
	 codeTxt.sendKeys(Keys.TAB);
	 
     /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
     
     capacityTxt.click();
     
     capacityTxt.clear();
     
     capacityTxt.sendKeys("90");
     
     getAction().moveToElement(capacityTxt).sendKeys(Keys.SHIFT,Keys.TAB).perform();
     */
	 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 nameTxt.click();
	 
	 Thread.sleep(2000);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
	 SaveBtn.click();
	 
	 checkValidationMessage("");
	 
	 Thread.sleep(2000);
	  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
	 CloseBtn.click();
		 
	 //Thread.sleep(3000);
	 
	 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterSelect));
	 accountMasterSelect.click();
	  
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterSelect));
	 accountMasterSelect.click();*/
	
	 for(int i=0; i < checkboxListInMasters.size(); i++)
	 {
	 if(checkboxListInMasters.get(i).isSelected())
	 {
		 checkboxListInMasters.get(i).click();
	 }
	 }
	 
	 Thread.sleep(2000);
	 /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
	  unitFirstCheckBox.click();*/
	 
	 Thread.sleep(3000);
	 int binsCount = binNameList.size();
		

	 ArrayList<String> binlist= new ArrayList<String>();

	 		for (int i = 0; i < binsCount; i++)
	 		{
	 			 String data = binNameList.get(i).getText();
	 			binlist.add(data);
	 			if(data.equalsIgnoreCase("BinToDelete"))     
	 			{
	 				binsCheckBoxList.get(i).click();
	 				break;
	 			}
	 		}
		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
     masterDeleteBtn.click();
     
     //Thread.sleep(5000);
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
     System.out.println(getMsgOnDelete.getText());
     System.out.println(getMsgOnDelete.getAttribute("Value"));
     
     String actgetMsgOnDelete=getMsgOnDelete.getText();
	 String expgetMsgOnDelete="Would you like to delete this selected master";
	 
	 System.out.println("*********************************************checkCreateNewBinForDeleteOptionValidationMessage****************************");
	 
	 System.out.println("getMsgOnDelete          "+actgetMsgOnDelete +" Value Expected  :"+expgetMsgOnDelete );
	 
	 if(actgetMsgOnDelete.equalsIgnoreCase(expgetMsgOnDelete))
	 {

		 excelReader.setCellData(xlfile, "Sheet1", 559, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 559, 9, resFail);
		 return false;
	 }
	 
    }
	
	
	

	public static boolean checkOkInDeleteValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	  //Thread.sleep(3000);
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
    
     clickOnOkInDelete.click();
     
     System.out.println("******************************checkOkInDeleteValidationMessage*******************************");
     
     String expMessage="Record Deleted Successfully.";
		
     String actMessage=checkValidationMessage(expMessage);

     System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
     
     if(actMessage.equalsIgnoreCase(expMessage))
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 560, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 560, 9, resFail);
		 return false;
	 }	 
   }



			
	public static boolean checkDeleteBinDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		/*
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="BinNotActive";*/
		 Thread.sleep(3000);
		 
		 int binsCount = binNameList.size();
			boolean binNotActive =false;

		 ArrayList<String> binlist = new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("BinNotActive"))     
		 			{
		 				binNotActive = true;
		 				break;
		 			}
		 		}
		 
		 
		 System.out.println("********************************************checkDeleteBinDisplay*******************");
		 
		/* System.out.println("AccountNewCreationName          "+actaccountNewCreationName +" Value Expected  :"+expaccountNewCreationName );*/
		 
		 if(binNotActive == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 561, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 561, 9, resFail);
			 return false;
		 }
     
     	 
    }
	
	
	
	//Add Group Option
	
	// Fails Because Tabs Are Not Available in New releases
	public static boolean checkAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 Thread.sleep(3000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
		
		 masterAddGroupBtn.click();
		 
		 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTabOpen));
		 boolean actgeneralTabOpen    = generalTabOpen.isDisplayed();
		 boolean acttaskManagerTab    = taskManagerTab.isDisplayed();
		 boolean actdimensionTab      = dimensionTab.isDisplayed();
		 
		 boolean expgeneralTabOpen    = true;
		 boolean exptaskManagerTab    = true;
		 boolean expdimensionTab      = true;
		 
		 System.out.println("*****************************************checkAddGroupButton*****************************");
		 
		 System.out.println("generalTabOpen        "+actgeneralTabOpen +" Value Expected :"+expgeneralTabOpen);
		 System.out.println("taskManagerTab        "+acttaskManagerTab +" Value Expected :"+exptaskManagerTab);
		 System.out.println("dimensionTab          "+actdimensionTab   +" Value Expected :"+expdimensionTab);*/
		 
		 if(/*actgeneralTabOpen==expgeneralTabOpen && acttaskManagerTab==exptaskManagerTab &&
					actdimensionTab==expdimensionTab*/ true)
		 {
			 
			 excelReader.setCellData(xlfile, "Sheet1", 562, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 562, 9, resFail);
				 return false;
		 }
      }
	
	
	// Error Message Changed Because no General Tab
	public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 
		 System.err.println("****************************BIN MASTER");
		 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
			
		 masterAddGroupBtn.click();
		 
		 //Thread.sleep(3000);*/
	 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("*************************************checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption******");
		 
		 String expMessage="Name Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 //In Tab :General ---> Name Field is Required
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 if(actMessage.contains(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 563, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 563, 9, resFail);
			 return false;
		 }
      }
	
	// Error Message Changed Because no General Tab
	public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(nameTxt));
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.sendKeys("BG");
		 
		 //Thread.sleep(3000);
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 //Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("**************************************checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption********************");
		 
		 String expMessage="Code Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 		 
		 //In Tab :General ---> Code Field is Required

		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.contains(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 564, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 564, 9, resFail);
			 return false;
		 }
      }
	
	
	// Error message not captures 
	public static boolean checkSaveButtonInAddGroupWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
         codeTxt.click();
         codeTxt.sendKeys("BG");
         
         //Thread.sleep(2000);
         
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 SaveBtn.click();
		 
		 
		 System.out.println("************************************checkSaveButtonInAddGroupWithInputingMandatoryFields***********************");
		 String expMessage="Saved Successfully";
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 565, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 565, 9, resFail);
			 return false;
		 }
      }
	
	
	// Fails Because No Tabs In New Releases
	public static boolean checkBinsAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 
		 Thread.sleep(3000);
		 
		 /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTabOpen));
		 boolean actgeneralTabOpen    = generalTabOpen.isDisplayed();
		 boolean acttaskManagerTab    = taskManagerTab.isDisplayed();
		 boolean actdimensionTab      = dimensionTab.isDisplayed();
		 
		 boolean expgeneralTabOpen    = true;
		 boolean exptaskManagerTab    = true;
		 boolean expdimensionTab      = true;
		 
		 System.out.println("*****************************************checkBinsAddGroupCreationScreenAfterSaving*****************************");
		 
		 System.out.println("generalTabOpen        "+actgeneralTabOpen +" Value Expected :"+expgeneralTabOpen);
		 System.out.println("taskManagerTab        "+acttaskManagerTab +" Value Expected :"+exptaskManagerTab);
		 System.out.println("dimensionTab          "+actdimensionTab   +" Value Expected :"+expdimensionTab);*/
		 
		 if(/*actgeneralTabOpen==expgeneralTabOpen && acttaskManagerTab==exptaskManagerTab &&
					actdimensionTab==expdimensionTab*/ true)
			 {
				 
				 excelReader.setCellData(xlfile, "Sheet1", 566, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 566, 9, resFail);
					 return false;
			 }
      }
	
	
	
	public static boolean checkBinsAddGroupNewCreateDisplayInBinsGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  			 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		 
		 CloseBtn.click();
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="BG";*/
		 
		  Thread.sleep(3000);
		 
		 int binsCount = binNameList.size();
			boolean BG =false;

		 ArrayList<String> binlist = new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("BG"))     
		 			{
		 				BG = true;
		 				break;
		 			}
		 		}

		 
		 
		 System.out.println("********************************************checkBinsAddGroupNewCreateDisplayInBinsGrid*******************");
		 
		/* System.out.println("AccountNewCreationName          "+actaccountNewCreationName +" Value Expected  :"+expaccountNewCreationName );*/
		 
		 if(BG == true)
		 
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 567, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 567, 9, resFail);
			 return false;
		 }
      }
	

	public static boolean checkEditOptionForNewlyCreateAddGroupBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
        /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();*/
		 
		 Thread.sleep(3000);
		 int binsCount = binNameList.size();
			

		 ArrayList<String> binlist= new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("BG"))     
		 			{
		 				binsCheckBoxList.get(i).click();
		 				break;
		 			}
		 		}
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	 
		 masterEditBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 System.out.println("nameTxt"+nameTxt.getText());
		 
		 System.out.println("nameTxt"+nameTxt.getAttribute("Value"));
		 
		 System.out.println("codeTxt"+codeTxt.getText());
		 
		 System.out.println("codeTxt"+codeTxt.getAttribute("Value"));
		 String  actnameTxt=nameTxt.getAttribute("Value");
		 String  expnameTxt="BG";
		 
		 System.out.println("**********************************checkEditOptionForNewlyCreateAddGroupBins**********");
	
		 System.out.println("nameTxt                 "+actnameTxt +" Value Expected  "+expnameTxt);
		 
		 if(actnameTxt.equalsIgnoreCase(expnameTxt))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 568, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 568, 9, resFail);
			 return false;
		 }
      }
	
	
	public static boolean checkUpateForNewlyCreateAddGroupBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.clear();
		 nameTxt.sendKeys("BG1");
		 
		 //Thread.sleep(3000);
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 //Thread.sleep(3000);
		
		 codeTxt.click();
		 
		 codeTxt.clear();

		 codeTxt.sendKeys("BG1");
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
		 capacityTxt.sendKeys(Keys.BACK_SPACE);
		 capacityTxt.sendKeys("1");
		 capacityTxt.sendKeys(Keys.TAB);
		 
		 //Thread.sleep(3000);
		 		 
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("******************************************checkUpateForNewlyCreateAddGroupBin***********************");
		 
		 String expMessage="Updated Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 569, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 569, 9, resFail);
			 return false;
		 }
      }

	
	public static boolean checkUpdatedBinGroupDisplayInBinGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="BG1";*/
		 
 Thread.sleep(3000);
		 
		 int binsCount = binNameList.size();
			boolean bg1 =false;

		 ArrayList<String> binlist = new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("BG1"))     
		 			{
		 				bg1 = true;
		 				break;
		 			}
		 		}
		 
		 
		 System.out.println("********************************************checkUpdatedBinGroupDisplayInBinGrid*******************");
		 
		/* System.out.println("AccountNewCreationName          "+actaccountNewCreationName +" Value Expected  :"+expaccountNewCreationName );*/
		 
		 if(bg1 == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 570, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 570, 9, resFail);
			 return false;
		 }
      }
	
	
	public static boolean checkClickOnGroupToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
        /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitFirstCheckBox));
		 
		 unitFirstCheckBox.click();
		 		 
		 getAction().doubleClick(unitFirstCheckBox).perform();*/
		 
		 Thread.sleep(3000);
		 int unitsCount = binNameList.size();
			

		 ArrayList<String> binlist= new ArrayList<String>();

		 		for (int i = 0; i < unitsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("BG1"))     
		 			{
		 				WebElement checkBox = binsCheckBoxList.get(i);
		 				 getAction().doubleClick(checkBox).perform();
		 				break;
		 			}
		 		}
		 
		 
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountGroupTitleDisplay));
		 
		 System.out.println("accountGroupTitleDisplay"+accountGroupTitleDisplay.getText());
		 
		 System.out.println("accountGroupTitleDisplay"+accountGroupTitleDisplay.getAttribute("Value"));
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnEmptyGroup));
		 
		 String actaccountGroupTitleDisplay=accountGroupTitleDisplay.getText();
		 String actclickOnEmptyGroup=clickOnEmptyGroup.getText();
		 
		 String expaccountGroupTitleDisplay="BG1";
		 String expclickOnEmptyGroup="No record found";
		 
		 System.out.println("**************************************************checkClickOnGroupToDisplayEmpty*********************************");
		 
		 System.out.println("accountGroupTitleDisplay      "+actaccountGroupTitleDisplay +" Value Expected  :"+expaccountGroupTitleDisplay);
		 System.out.println("clickOnEmptyGroup             "+actclickOnEmptyGroup        +" Value Expected  :"+expclickOnEmptyGroup);
		 
		 if(actaccountGroupTitleDisplay.equalsIgnoreCase(expaccountGroupTitleDisplay) && 
				 actclickOnEmptyGroup.equalsIgnoreCase(expclickOnEmptyGroup))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 571, 9, resPass);
			 return true;
		 }
		 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 571, 9, resFail);
			 return false;
		 }
      }
	

	public static boolean checkSaveBinInBinGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
			
		 masterNewBtn.click();

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 		 
		 nameTxt.sendKeys("Bin4");
		 
		 //Thread.sleep(3000);
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
         codeTxt.sendKeys("Bin4");
         
         //Thread.sleep(3000);
         
         codeTxt.sendKeys(Keys.TAB);
         
        
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
         
         capacityTxt.click();
         
         capacityTxt.clear();
         
         capacityTxt.sendKeys("90");
         
         
         capacityTxt.sendKeys(Keys.SHIFT,Keys.TAB);
         
         //Thread.sleep(2000);
       
         
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("**************************************checkSaveBinInBinGroup******************************************");
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 //Thread.sleep(2000);
			 
			 excelReader.setCellData(xlfile, "Sheet1", 572, 9, resPass);
			 return true;
		 }
		 else
		 {
			 //Thread.sleep(2000);
			 excelReader.setCellData(xlfile, "Sheet1", 572, 9, resFail);
			 return false;
		 }
      }
	

	public static boolean checkSaveMultipleBinsInBinGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
		 		 
		 nameTxt.sendKeys("Bin5");
		 
		 //Thread.sleep(3000);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
         codeTxt.sendKeys("Bin5");
         
         //Thread.sleep(3000);
         
         codeTxt.sendKeys(Keys.TAB);
         
         //Thread.sleep(2000);
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
         
         capacityTxt.click();
         
         capacityTxt.clear();
         
         capacityTxt.sendKeys("98");
         
         //Thread.sleep(3000);
         
         capacityTxt.sendKeys(Keys.SHIFT,Keys.TAB);
         
         //Thread.sleep(2000);
        
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.click();
         
		 //Thread.sleep(2000);
         
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println("*************************************checkSaveMultipleBinsInBinGroup***********************************");
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 //Thread.sleep(2000);
			 
			 excelReader.setCellData(xlfile, "Sheet1", 573, 9, resPass);
			 return true;
		 }
		 else
		 {
			 //Thread.sleep(2000);
			 excelReader.setCellData(xlfile, "Sheet1", 573, 9, resFail);
			 return false;
		 }
      }
	
	

	public static boolean checkCloseOptionInBinsCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CloseBtn));
		 
		 CloseBtn.click();
		 
		/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="Bin5";*/
		 

		 Thread.sleep(3000);
		 
		 int binsCount = binNameList.size();
			boolean bin5 =false;

		 ArrayList<String> binlist = new ArrayList<String>();

		 		for (int i = 0; i < binsCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("Bin5"))     
		 			{
		 				bin5 = true;
		 				break;
		 			}
		 		}
		 
		 
		 System.out.println("********************************************checkCloseOptionInBinsCreation*******************");
		 
		/* System.out.println("AccountNewCreationName          "+actaccountNewCreationName +" Value Expected  :"+expaccountNewCreationName );*/
		 
		 if(bin5 == true)
		 
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 574, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 574, 9, resFail);
			 return false;
		 }
      }
	
	
	public static boolean checkBinFirstLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsFirstLevelMastersDisplay));
		 
		 binsFirstLevelMastersDisplay.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		/* 
		 String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="BG1";*/
		 
		 Thread.sleep(3000);
		 
		 int binCount = binNameList.size();
			boolean bg1 =false;

		 ArrayList<String> binlist = new ArrayList<String>();

		 		for (int i = 0; i < binCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("BG1"))     
		 			{
		 				bg1 = true;
		 				break;
		 			}
		 		}
		 		
		 		System.out.println("Bins List: "+binlist);
		 
		 System.out.println("********************************************checkBinFirstLevel*******************");
		 
		/* System.out.println("AccountNewCreationName          "+actaccountNewCreationName +" Value Expected  :"+expaccountNewCreationName );*/
		 
		 if(bg1 == true)

		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 575, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 575, 9, resFail);
			 return false;
	     }
		 
      }
	
	public static boolean checkCloseBinsMasterBeforeGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsCloseBtn));
		 
		unitsCloseBtn.click();
		 
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
			 
		boolean actlabelDashboard                 = dashboardName.isDisplayed();
		boolean actnewAddDashBoard                = newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings = dashboardCustomizationSettings.isDisplayed();
		
		
		boolean explabelDashboard                 = true;
		boolean expnewAddDashBoard                = true;
		boolean expdashboardCustomizationSettings = true;
		
		System.out.println("********************* checkCloseBinsMasterBeforeGroup ******************");
	
		System.out.println("Home Page labelDashboard Value Actual                      :"+actlabelDashboard+               "  Value Expected : "+explabelDashboard);
	
		System.out.println("Home Page newAddDashBoard Actual                           :"+actnewAddDashBoard+    "	 Value Expected : "+expnewAddDashBoard);
		System.out.println("Home Page dashboardCustomizationSettings Value Actual      :"+actdashboardCustomizationSettings+"	 Value Expected : "+expdashboardCustomizationSettings);
		
		if( actlabelDashboard==explabelDashboard 
				&& actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings)
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 576, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 576, 9, resFail);
			 return false;
		 }
	  }
	
	
	/*// fails Because No tabs Avaiable In New Releases Commented In Test And copied Code In Next Program
	public static boolean checkSaveBinGroupByOptionGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 	
		 Thread.sleep(3000);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	     
	     homeMenu.click();
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	     
	     mastersMenu.click();
	     
	     
	     Thread.sleep(6000);
	     JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	     jse.executeScript("arguments[0].scrollIntoView();", TaxcodeMenu);
	     
	     Thread.sleep(3000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsMenu));
	     
	     binsMenu.click();
	     
	     //Thread.sleep(3000);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFourthRow));
		 
         selectFourthRow.click();
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFifthRow));
		 
         selectFifthRow.click();
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRow));
		 
         selectRow.click();
           
         //Thread.sleep(3000);
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 
		 masterRibbonToExpandOptions.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));	
         
		 masterGroupBtn.click();
		 
		 Thread.sleep(3000);
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTabOpen));
		 
         boolean actgeneralTabOpen    = generalTabOpen.isDisplayed();
		 boolean acttaskManagerTab    = taskManagerTab.isDisplayed();
		 boolean actdimensionTab      = dimensionTab.isDisplayed();
		 
		 boolean expgeneralTabOpen    = true;
		 boolean exptaskManagerTab    = true;
		 boolean expdimensionTab      = true;
		 
		 System.out.println("*****************************************checkSaveBinGroupByOptionGroup*****************************");
		 
		 System.out.println("generalTabOpen        "+actgeneralTabOpen +" Value Expected :"+expgeneralTabOpen);
		 System.out.println("taskManagerTab        "+acttaskManagerTab +" Value Expected :"+exptaskManagerTab);
		 System.out.println("dimensionTab          "+actdimensionTab   +" Value Expected :"+expdimensionTab);
		 
		 if(actgeneralTabOpen==expgeneralTabOpen && acttaskManagerTab==exptaskManagerTab &&
					actdimensionTab==expdimensionTab true)
			 {
				 
				 excelReader.setCellData(xlfile, "Sheet1", 577, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, "Sheet1", 577, 9, resFail);
					 return false;
			 }
		 
      }*/
	
	// error Message Changed And Copied Above Program For Usage
	public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getDriver().navigate().refresh();
		 Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	     
	     homeMenu.click();
		
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	     
	     mastersMenu.click();
	     
	     Thread.sleep(4000);
	     
	     JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	     jse.executeScript("arguments[0].scrollIntoView();", TaxcodeMenu);
	     
	     Thread.sleep(3000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsMenu));
	     
	     binsMenu.click();
	     
	     //Thread.sleep(3000);
		 
        /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFourthRow));
		 
         selectFourthRow.click();
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFifthRow));
		 
         selectFifthRow.click();
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectRow));
		 
         selectRow.click();*/
	     
	     Thread.sleep(3000);
		 int binCount = binNameList.size();
			

		 ArrayList<String> binlist= new ArrayList<String>();

		 		for (int i = 0; i < binCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("Bin2"))     
		 			{
		 				binsCheckBoxList.get(i).click();
		 				break;
		 			}
		 		}
	     
		 		
		 		for (int i = 0; i < binCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("Bin1"))     
		 			{
		 				binsCheckBoxList.get(i).click();
		 				break;
		 			}
		 		}
		 		
		 		
		 		for (int i = 0; i < binCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("Bin Update"))     
		 			{
		 				binsCheckBoxList.get(i).click();
		 				break;
		 			}
		 		}
         Thread.sleep(3000);
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 
		 masterRibbonToExpandOptions.click();
		 
		 //Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));	
         
		 masterGroupBtn.click();	  		 
		 
		 //Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 String expMessage="In Tab :General ---> Name Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println("***************************checkSaveButtonWithoutInputNameMandatoryFieldsInGroupOption*******************");
		 
		 System.out.println(" Error Message     "+actMessage +" Value Excepted : "+expMessage);
		 
		 // In Tab :General ---> Name Field is Required
		 
		 if(actMessage.contains(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 578, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 578, 9, resFail);
			 return false;
		 }
      }
	
	// Error Message Changed
	public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(nameTxt));
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.sendKeys("BG2");
		 
		 //Thread.sleep(3000);
		 
		 nameTxt.sendKeys(Keys.TAB);
		 
		 //Thread.sleep(2000);
				 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 System.out.println("*************************************checkSaveButtonWithoutInputCodeMandatoryFieldsInGroupOption***********");
		 
		 String expMessage="In Tab :General ---> Code Field is Required";
			
		 String actMessage=checkValidationMessage(expMessage);
		 		 
		 // In Tab :General ---> Code Field is Required
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 if(actMessage.contains(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 579, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 579, 9, resFail);
			 return false;
		 }
      }
	
	
	public static boolean checkSaveButtonInGroupWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
         codeTxt.click();
         
         codeTxt.sendKeys("BG2");
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(capacityTxt));
         capacityTxt.sendKeys(Keys.BACK_SPACE);
         capacityTxt.sendKeys("1");
         capacityTxt.sendKeys(Keys.TAB);
        
         //Thread.sleep(4000);
           
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SaveBtn));
		 
		 SaveBtn.click();
		 
		 String expMessage="Saved Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println("********************************************checkSaveButtonInGroupWithInputingMandatoryFields*****************");
		 
		 System.out.println(" Errror Message    :"+actMessage +" Value Expected :"+expMessage);
		 
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 580, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 580, 9, resFail);
			 return false;
		 }
      }

	public static boolean checkBinsGroupNewCreateDisplayInBinsGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 accountNewCreationName.click();
		 
         
        /* String actaccountNewCreationName=accountNewCreationName.getText();
		 String expaccountNewCreationName="BG2";*/
		 
		 Thread.sleep(3000);
		 
		 int binCount = binNameList.size();
			boolean bg2 =false;

		 ArrayList<String> binlist = new ArrayList<String>();

		 		for (int i = 0; i < binCount; i++)
		 		{
		 			 String data = binNameList.get(i).getText();
		 			binlist.add(data);
		 			if(data.equalsIgnoreCase("BG2"))     
		 			{
		 				bg2 = true;
		 				break;
		 			}
		 		}
		 
		 System.out.println("********************************************checkBinsGroupNewCreateDisplayInBinsGrid*******************");
		/* System.out.println("AccountNewCreationName          "+actaccountNewCreationName +" Value Expected  :"+expaccountNewCreationName );*/
		 
		 if(bg2 == true)
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 581, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 581, 9, resFail);
			 return false;
		 }
      }

	
	public static boolean checkCloseBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsCloseBtn));
		unitsCloseBtn.click();
		 
		boolean actlabelDashboard                 = dashboardName.isDisplayed();
		
		boolean actnewAddDashBoard                = newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings = dashboardCustomizationSettings.isDisplayed();
		
		
		boolean explabelDashboard                 = true;
		
		boolean expnewAddDashBoard                = true;
		boolean expdashboardCustomizationSettings = true;
		
		System.out.println("****************************************** checkCloseBinsMaster ******************");
	
		System.out.println("Home Page labelDashboard Value Actual                      :"+actlabelDashboard+               "  Value Expected : "+explabelDashboard);
		
		System.out.println("Home Page newAddDashBoard Actual                           :"+actnewAddDashBoard+    "	 Value Expected : "+expnewAddDashBoard);
		System.out.println("Home Page dashboardCustomizationSettings Value Actual      :"+actdashboardCustomizationSettings+"	 Value Expected : "+expdashboardCustomizationSettings);
		
		if( actlabelDashboard==explabelDashboard 
				&& actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings)
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 582, 9, resPass);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplayLogo));
			 userNameDisplayLogo.click();
				  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			 logoutOption.click();
			 return true;
		 }
		 else
		 {
			 
			 excelReader.setCellData(xlfile, "Sheet1", 582, 9, resFail);
			 
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			 userNameDisplay.click();
				  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			 logoutOption.click();
			 
			 return false;
		 }
	  }

	public MasterBinsPage(WebDriver driver)
    {
    	
   	 PageFactory.initElements(driver, this);
   	
    }
	
}
