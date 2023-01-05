package com.focus.Pages;

import com.focus.base.BaseEngine;
import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class HPDashboardPage extends BaseEngine
{

	private static String getPatchDateTime;
	private static LoginPage lp;
	private static LoginPageCompanyCreationPage lpcc;
	private static ExcelReader excelReader;
	private static String url;
	private static String lgnTitle;
	private static String getCompanyInfo;
	private static String xlfile;
	private static String resPass="Pass";
	private static String resFail="Fail";
	

	 @FindBy(xpath="//*[@id='dashName']")
     private static WebElement labelDashboard ;
	
	 @FindBy(xpath="//ul[@class='dropdown-menu Select_dashboard']")
	 private static WebElement selectDashboardComboBox ;
		
	 @FindBy(xpath="//*[@id='Dashboard_AddDash']")
     private static WebElement newDashBoard;
	 
	   @FindBy(xpath="//input[@id='txtDashboardName']")
       private static WebElement dashBoardName;

	   @FindBy(xpath="//*[@id='txtDashboardName_input_settings']/span")
       private static WebElement dashBoardSettingInCombobox;
		   
	          //Customize Display Columns Screen
		     @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_container']")
		     private static WebElement dashBoardCustomizeDisplaysNameColumn;
		     
		     //Standard Fields Button
		     @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_footer']/div/div/input[1]")
		     private static WebElement dashBoardPopCustomizeStandardFieldsBtn;

				 @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_standardfields_list']")
			     private static WebElement dashBoardPopCustomizeStandardColumnAttributeFieldName;
				 
				 @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_standardfields_header']")
			     private static WebElement dashBoardPopCustomizeStandardColumnAttributeHeader;
			
				 @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_standardfields_alignment']")
			     private static WebElement dashBoardPopCustomizeStandardColumnAttributeAlignment;
		
				 @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_standardfields_width']")
			     private static WebElement dashBoardPopCustomizeStandardColumnAttributeWidth;
				 	 
				 @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_footer']/div/div/input[3]")
			     private static WebElement dashBoardPopCustomizeDisplayStandardColumnAttributeOkBtn;
				 
				 @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_footer']/div/div/input[4]")
			     private static WebElement dashBoardPopCustomizeDisplayStandardColumnAttributeCancelBtn;

			  //Delete Column Button
			  @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_footer']/div/div/input[2]")
		      private static WebElement dashBoardPopCustomizeDisplayColumnsDeleteColoumn;
			 
			  //Ok button
			  @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_footer']/div/div/input[3]")
		      private static WebElement dashBoardPopCustomizeDisplayColumnsOkBtn;
	 
			  //Cancel button
			  @FindBy(xpath="//*[@id='txtDashboardName_customize_popup_footer']/div/div/input[4]")
		      private static WebElement dashBoardPopCustomizeDisplayColumnsCancelBtn;
			  
	    @FindBy(xpath="//*[@id='txtAreaDescription']")
		private static WebElement DashBoardDescription;				
			  
	    @FindBy(xpath="//input[@id='txtHeader']")
        private static WebElement dashBoardHeaderTextBox;
 
	    @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[2]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/span[1]/button[1]")
        private static WebElement dashBoardHeaderSettingsBtn;
	    
					    @FindBy(xpath="//*[@id='fontFamily_ctrHeader']")
				        private static WebElement dashBoardHeader_FontFamilyDropdown;
					   
					    @FindBy(xpath="//*[@id='fontStyle_ctrHeader']")
				        private static WebElement dashBoardHeader_FontStyleDropdown;
					 
					    @FindBy(xpath="//*[@id='fontWeight_ctrHeader']")
				        private static WebElement dashBoardHeader_FontWeightDropdown;
					 
					    @FindBy(xpath="//*[@id='fontSizes_ctrHeader']")
				        private static WebElement dashBoardHeader_FontSizeDropdown;
					 
					    @FindBy(xpath="//*[@id='fontForeColor_ctrHeader']")
				        private static WebElement dashBoardHeader_FontForeColorDropdown;
					 
					    @FindBy(xpath="//*[@id='fontBackColor_ctrHeader']")
				        private static WebElement dashBoardHeader_FontBackColorDropdown;
					 
					    @FindBy(xpath="//*[@id='chkBaseline_ctrHeader']")
				        private static WebElement dashBoardHeader_BaselineCheckbox;
					 
					    @FindBy(xpath="//*[@id='chkOverLine_ctrHeader']")
				        private static WebElement dashBoardHeader_OverLineCheckbox;
					 
					    @FindBy(xpath="//*[@id='chkStrikeThrough_ctrHeader']")
				        private static WebElement dashBoardHeader_StrikeThroughCheckbox;
					   
					    @FindBy(xpath="//*[@id='chkUnderline_ctrHeader']")
				        private static WebElement dashBoardHeader_UnderlineCheckbox;
					 
					    @FindBy(xpath="//*[@id='previewfont_ctrHeader']")
				        private static WebElement dashBoardHeader_FontPreviewDescription;
					 
					    @FindBy(xpath="//*[@id='chkEnableFont_ctrHeader']")
				        private static WebElement dashBoardHeader_EnableFontCheckbox;
					
					    @FindBy(xpath="//*[@id='btnSaveFonts1']")
				        private static WebElement dashBoardHeaderSaveBtn;
					 
					    @FindBy(xpath="//*[@id='btnCloseFonts1']")
				        private static WebElement dashBoardHeaderCLoseBtn;
	 
					    
	    @FindBy(xpath="//*[@id='txtBody']")
        private static WebElement dashBoardBody;
	   
	    @FindBy(xpath="//*[@id='iBody']")
	    private static WebElement DashBoardBodySettingBtn;
	 
					 @FindBy(xpath="//*[@id='fontFamily_ctrBody']")
				     private static WebElement dashBoardBody_FontFamilyDropdown;
					 
					 @FindBy(xpath="//*[@id='fontStyle_ctrBody']")
				     private static WebElement dashBoardBody_FontStyleDropdown;
					 
					 @FindBy(xpath="//*[@id='fontWeight_ctrBody']")
				     private static WebElement dashBoardBody_FontWeightDropdown;
					 
					 @FindBy(xpath="//*[@id='fontSizes_ctrBody']")
				     private static WebElement dashBoardBody_FontSizeDropdown;
					 
					 @FindBy(xpath="//*[@id='fontForeColor_ctrBody']")
				     private static WebElement dashBoardBody_FontForeColorDropdown;
					 
					 @FindBy(xpath="//*[@id='fontBackColor_ctrBody']")
				     private static WebElement dashBoardBody_FontBackColorDropdown;
					 
					 @FindBy(xpath="//*[@id='chkBaseline_ctrBody']")
				     private static WebElement dashBoardBody_BaselineCheckbox;
					 
					 @FindBy(xpath="//*[@id='chkOverLine_ctrBody']")
				     private static WebElement dashBoardBody_OverLineCheckbox;
					 
					 @FindBy(xpath="//*[@id='chkStrikeThrough_ctrBody']")
				     private static WebElement dashBoardBody_StrikeThroughCheckbox;
					 
					 @FindBy(xpath="//*[@id='chkUnderline_ctrBody']")
				     private static WebElement dashBoardBody_UnderlineCheckbox;
					 
					 @FindBy(xpath="//*[@id='previewfont_ctrBody']")
				     private static WebElement dashBoardBody_FontPreviewDescription;
					 
					 @FindBy(xpath="//*[@id='chkEnableFont_ctrBody']")
				     private static WebElement dashBoardBody_EnableFontCB;
					
					 @FindBy(xpath="//*[@id='btnSaveFonts2']")
				     private static WebElement dashBoardBodySaveBtn;
					 
					 @FindBy(xpath="//span[@id='btnCloseFonts2']")
				     private static WebElement dashBoardBodyCLoseBtn;
			
	     @FindBy(xpath="//*[@id='txtFooter']")
	     private static WebElement dashBoardFooter;
	     
	     @FindBy(xpath="//*[@id='iFooter']")
	     private static WebElement DashBoardFooterSettingBtn;
	 
					 @FindBy(xpath="//*[@id='fontFamily_ctrFooter']")
					 private static WebElement dashBoardFooter_FontFamilyDropdown;
						 
					 @FindBy(xpath="//*[@id='fontStyle_ctrFooter']")
					 private static WebElement dashBoardFooter_FontStyleDropdown;
						 
					 @FindBy(xpath="//*[@id='fontWeight_ctrFooter']")
					 private static WebElement dashBoardFooter_FontWeightDropdown;
						 
					 @FindBy(xpath="//*[@id='fontSizes_ctrFooter']")
					 private static WebElement dashBoardFooter_FontSizeDropdown;
						 
					 @FindBy(xpath="//*[@id='fontForeColor_ctrFooter']")
					 private static WebElement dashBoardFooter_FontForeColorDropdown;
						 
					 @FindBy(xpath="//*[@id='fontBackColor_ctrFooter']")
					  private static WebElement dashBoardFooter_FontBackColorDD;
						 
					 @FindBy(xpath="//*[@id='chkBaseline_ctrFooter']")
					 private static WebElement dashBoardFooter_BaselineCheckbox;
						 
					 @FindBy(xpath="//*[@id='chkOverLine_ctrFooter']")
					 private static WebElement dashBoardFooter_OverLineCheckbox;
						 
					 @FindBy(xpath="//*[@id='chkStrikeThrough_ctrFooter']")
					 private static WebElement dashBoardFooter_StrikeThroughCheckbox;
						 
					 @FindBy(xpath="//*[@id='chkUnderline_ctrFooter']")
					 private static WebElement dashBoardFooter_UnderlineCheckbox;
						 
					 @FindBy(xpath="//*[@id='previewfont_ctrFooter']")
					 private static WebElement dashBoardFooter_FontPreviewDescription;
						 
					 @FindBy(xpath="//*[@id='chkEnableFont_ctrFooter']")
					 private static WebElement dashBoardFooter_EnableFontCheckbox;
						
					 @FindBy(xpath="//*[@id='btnSaveFonts3']")
					 private static WebElement dashBoardFooterSaveBtn;
						 
					 @FindBy(xpath="//*[@id='btnCloseFonts3']")
					 private static WebElement dashBoardFooterCLoseBtn;
	 
			    @FindBy(xpath="//*[@id='setasdefault']")
		        private static WebElement dashBoardSetAsDefaultCheckbox;
			 
			    @FindBy(xpath="//*[@id='active']")
		        private static WebElement dashBoardActiveCheckbox;
			 
			    //Users
			    @FindBy(xpath="//*[@id='rdoUsers']")
		        private static WebElement dashBoardUsersRadioBtn;
			 
			    @FindBy(xpath="//*[@id='widthDiv']")
			    private static WebElement dashBoardUsersAvaliableForSharing;
						
			    @FindBy(xpath="//*[@id='NinthFdiv']")
			    private static WebElement dashBoardSharedUsers;
							 
			    //Roles
				@FindBy(xpath="//*[@id='rdoRoles']")
				private static WebElement dashBoardRolesRadioBtn;				 
						 
				@FindBy(xpath="//*[@id='widthDiv']")
				private static WebElement dashBoarRolesAvaliableForSharing;
								 
				@FindBy(xpath="//*[@id='NinthFdiv']")
				private static WebElement dashBoardSharedRoles;
												
				@FindBy(xpath="//*[@id='sNinthDiv']/i[1]")
			    private static WebElement dashBoardRightSideArrowIcon;
				 
				@FindBy(xpath="//*[@id='sNinthDiv']/i[2]")
			    private static WebElement dashBoardLeftSideArrowIcon;
				
				@FindBy(xpath="//*[@id='Create_Dash_Save']/span")
			    private static WebElement dashBoardSaveBtn;
				 
				@FindBy(xpath="//*[@id='Create_Dash_Close']/span")
			    private static WebElement dashBoardCancelBtn;
			
				@FindBy(xpath="//*[@id='lblAvailableUsers']")
				private static WebElement  UsersavailableforsharingLabel;
				
				@FindBy(xpath="//*[@id='lblSharedUsers']")
				private static WebElement SharedUsersLabel;
				
				@FindBy(xpath="//*[@id='lblAvailableRoles']")
				private static WebElement  Rolesavailableforsharinglabel;
				
				@FindBy(xpath="//*[@id='lblSharedRoles']")
				private static WebElement SharedRolesLabel;
			
				@FindBy(xpath="//div[@class='theme_color font-6']")
				private static WebElement dashboardValidationAndConfirmationMessage;

		    //Dashboard Customization 
			@FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
			private static WebElement dashBoardCustomizeBtn;
			
			@FindBy(xpath="//*[@id='ErrorMessage']")
			private static WebElement validationPleaseSelectanyDashboardMessage;
			
			@FindBy(xpath="//*[@id='Select_dash']")
			private static WebElement selectdashBoardBtn;
			
			@FindBy(xpath="//*[@id='dashIcons']/div/ul/li[1]/h4")
			private static WebElement selectdashBoardOptionText;
			
			@FindBy(xpath="//*[@id='Dashboard_ddlList']/li[1]/a/label")
			private static WebElement dashBoardFirst;
			
			@FindBy(xpath="//*[@id='Dashboard_ddlList']/li[2]/a/label")
			private static WebElement dashBoardSecond;
			
			@FindBy(xpath="//*[@id='Dashboard_ddlList']/li[3]/a/label")
			private static WebElement dashBoardThird;
			
			@FindBy(xpath="//*[@id='Dashboard_ddlList']/li[1]/div/i[1]")
			private static WebElement dashBoardFirstEditBtn;
			
			@FindBy(xpath="//*[@id='Dashboard_ddlList']/li[2]/div/i[1]")
			private static WebElement dashBoardSecondEditBtn ;
			
			@FindBy(xpath="//*[@id='Dashboard_ddlList']/li[1]/div/i[2]")
			private static WebElement  dashBoardFirstDeleteBtn;
			
			@FindBy(xpath="//*[@id='Dashboard_ddlList']/li[2]/div/i[2]")
			private static WebElement dashBoardSecondDeleteBtn;
			
			@FindBy(xpath="//*[@id='Dashboardconfirm']/div/div/div[1]")
			private static WebElement dashBoardConfirmationMessage;
			
			@FindBy(xpath="//div[@id='Dashboardconfirm']//button[@id='deletebtn']")
			private static WebElement dashBoardConfirmationMessageOkBtn;
			
			@FindBy(xpath="//div[@id='Dashboardconfirm']//button[@id='btnCancel']")
			private static WebElement dashBoardConfirmationMessageCancelBtn;
						
			@FindBy(xpath="//*[@id='ErrorMessage']")
			private static WebElement validationDashboardMessageAtBotton;
			

			//-----------------Create DashLet Elements
			
					@FindBy(xpath="//*[@id='searchBox']")
					private static WebElement  dashBoardCustomizeSearch;
						
				    @FindBy(xpath="//*[@id='GraphOption']")
					private static WebElement  dashBoardCustomizeGraph;
									
						@FindBy(xpath="//a[@class='theme_icon-color']")
						private static WebElement  dashBoardCustomizeGraphNewGraph; 
						
						@FindBy(xpath="//*[@id='id_Dashlet1']/a/label")
                        private static WebElement  dashBoardCustomizeNewGraphCreated; 						
						
						@FindBy(xpath="//i[@class='icon-edit PANEl_EDiTE pull-right theme_icon-color']")
						private static WebElement  dashBoardCustomizeEditGraphCreated;
	
						@FindBy(xpath="//i[@class='icon-delete PANEl_DELetE pull-right theme_icon-color']")
                        private static WebElement  dashBoardCustomizeDeleteGraphCreated;
						
						@FindBy(xpath="//label[@id='lblWarnMessage']")
                        private static WebElement  dashBoardCustomizeDeleteTheDashletMessage;
						
						@FindBy(xpath="//button[@id='btnDelete_Dashboard']")
                        private static WebElement  dashBoardCustomizeDeleteDasletYesBtn;
						
						@FindBy(xpath="//button[contains(text(),'No')]")
                        private static WebElement  dashBoardCustomizeDeleteDashletNoBtn;
						
						@FindBy(xpath="//li[@id='id_Dashlet0']//span[@class='fa fa-circle iconCircle theme_icon-color']")
                        private static WebElement  dashBoardCreatedNewGraph;
						
						@FindBy(xpath="//li[@id='id_Dashlet0']")
                        private static WebElement  dashBoardGraphNewFromDrag;	
						
						@FindBy(xpath="//div[@id='LeftSideDiv']")
                        private static WebElement  dashBoardGraphNewToDrag;
						
						@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[2]/div[2]/div[2]/div[4]")
                        private static WebElement  dashBoardGraphDashlet;
						
							//---------------Graph customize Definition
					  		
							@FindBy(xpath="//*[@id='DashletTabs']/li[1]")
							private static WebElement  dashBoardCustomizeGraphDefTab;
							
							@FindBy(xpath="//input[@id='DashletName']")
							private static WebElement  dashBoardCustomizeGraphDefName;
							
							@FindBy(xpath="//*[@id='Type']")
							private static WebElement  dashBoardCustomizeGraphDefShowAs;
							
							@FindBy(xpath="//*[@id='IsDisplaySummary']")
							private static WebElement  dashBoardCustomizeGraphDefDisplaySummaryCheckBox;
							
							@FindBy(xpath="//*[@id='Include']")
							private static WebElement  dashBoardCustomizeGraphDefIncludeDropdown;
							
							@FindBy(xpath="//*[@id='IncludeValue']")
							private static WebElement  dashBoardCustomizeGraphDefIncludeValueTxtbox;
							
							@FindBy(xpath="//*[@id='IncludeType']")
							private static WebElement  dashBoardCustomizeGraphDefIncludeTypeDropdown;
							
							@FindBy(xpath="//*[@id='SeriesName1']")
							private static WebElement  dashBoardCustomizeGraphDefSeriesName;
							
							@FindBy(xpath="//*[@id='ddlDataSet1']")
							private static WebElement  dashBoardCustomizeGraphDefDataSetDropdown;
							
							@FindBy(xpath="//*[@id='yAxis_1']/div[1]/div/span")
							private static WebElement  dashBoardCustomizeGraphAddBtnImg;
						
							@FindBy(xpath="//*[@id='default_Graph_1']/div[1]/div[2]/div[2]/span")
							private static WebElement  dashBoardCustomizeGraphDeleteBtnImg;
							
							@FindBy(xpath="//*[@id='ddlValue1']")
							private static WebElement  dashBoardCustomizeGraphDefValueDropdown;
								
							@FindBy(xpath="//*[@id='ddlPeriod1']")
							private static WebElement  dashBoardCustomizeGraphDefPeriodDropdown;	
		
							
							
							// filter property 
							@FindBy(xpath="//*[@id='default_Graph_1']/div[2]/div[2]/span")
							private static WebElement  dashBoardCustomizeGraphDefFliterBtn;
							
							@FindBy(xpath="//*[@id='36_1_AdvancegraphFilter']/table/tbody/tr/td[1]/select")
							private static WebElement graphFilterConjuctionDropdown ;
							
							@FindBy(xpath="//*[@id='36_1_AdvancegraphFilter']/table/tbody/tr/td[2]/input")
							private static WebElement graphFilterSelectField ;
							
							@FindBy(xpath="//*[@id='36_1_AdvancegraphFilter']/table/tbody/tr/td[3]/select")
							private static WebElement graphFilterSelectOperatorDropdown ;
							
							@FindBy(xpath="//*[@id='36_1_AdvancegraphFilter']/table/tbody/tr/td[4]/select")
							private static WebElement graphFilterCompareWithDropdown ;
							
							@FindBy(xpath="//*[@id='36_1_AdvancegraphFilter']/table/tbody/tr/td[5]/input")
							private static WebElement graphFilterValurText ;
							
							@FindBy(xpath="//*[@id='36_1_AdvancegraphFilter']/table/tbody/tr/td[7]/span")
							private static WebElement graphFilterTOAddOneMoreRowBtn ;
							
							@FindBy(xpath="//*[@id='36_1_AdvancegraphFilter']/table/tbody/tr[1]/td[6]/span")
							private static WebElement graphFilterTODeleteFirstRowBtn ;
							
							@FindBy(xpath="//*[@id='36_1_AdvancegraphFilter']/table/tbody/tr[2]/td[6]/span")
							private static WebElement graphFilterTODeleteSecondtRowBtn ;	
								
							@FindBy(xpath="//*[@id='ddlSummary1']")
							private static WebElement  dashBoardCustomizeGraphDefSummary;
								
							@FindBy(xpath="//*[@id='XAxis']")
							private static WebElement  dashBoardCustomizeGraphDefXAxis;
							
							@FindBy(xpath="//*[@id='SaveDashlet_Icon']")
							private static WebElement  dashBoardCustomizeGraphDefSave;
							
							@FindBy(xpath="//li[@id='SaveDashlet_Icon']//span[text()='Save']")
							private static WebElement  dashBoardCustomizeReportSave;
							
							@FindBy(xpath="//*[@id='Newdashlet_Icons']/ul/li[2]")
							private static WebElement  dashBoardCustomizeGraphDefCancel;
							
							
							//------------------------Graph customize Properties
							
							@FindBy(xpath="//*[@id='DashletTabs']/li[2]")
							private static WebElement  dashBoardCustomizeGraphProperties;
							
							@FindBy(xpath="//*[@id='ddlGraphTypes']")
							private static WebElement  dashBoardCustomizeGraphPropertiesGraphTypeDropdown;
							
							@FindBy(xpath="//*[@id='Themes']")
							private static WebElement  dashBoardCustomizeGraphPropertiesThemeDropdown;
							
							@FindBy(xpath="//*[@id='LegendPosition']")
							private static WebElement  dashBoardCustomizeGraphPropertiesLegendPositionDropdown;
							
							@FindBy(xpath="//*[@id='IsZooming']")
							private static WebElement  dashBoardCustomizeGraphPropertiesZoomCheckbox;
							
							
							//----------------------Graph customize Maximized view
							
							@FindBy(xpath="//*[@id='DashletTabs']/li[3]")
							private static WebElement  dashBoardCustomizeGraphMaximizedView;
							
							@FindBy(xpath="//*[@id='DisplayType']")
							private static WebElement  dashBoardCustomizeGraphMaximizedViewDisplayCombobox;
							
							@FindBy(xpath="//*[@id='DisplayValue']")
							private static WebElement  dashBoardCustomizeGraphMaximizedViewDiplayitemSelectedCombobox;
							
							@FindBy(xpath="//*[@id='maxViewDiv']/div/div[1]/div/span[1]")
							private static WebElement  dashBoardCustomizeGraphMaximizedViewCustomizeIcon;
							
							@FindBy(xpath="//*[@id='maxViewDiv']/div/div[1]/div/span[2]")
							private static WebElement  dashBoardCustomizeGraphMaximizedViewCloseIcon;
							
					
				            //Report*****************************************							
											
							@FindBy(xpath="//*[@id='ReportOption']")
							private static WebElement  dashBoardCustomizeReport;

								@FindBy(xpath="//a[contains(text(),'New Report')]")
								private static WebElement  dashBoardCustomizeReportNewReport;

									//Report customize Report
									
									@FindBy(xpath="//*[@id='DashletTabs']/li[1]")
									private static WebElement  dashBoardCustomizeReport_ReportDef;
									
									@FindBy(xpath="//*[@id='ddlReports']")
									private static WebElement  dashBoardCustomizeReportReportName;
									
									@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[2]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[3]")
									private static WebElement  dashBoardCustomizeReportCaptionText;
									
									@FindBy(xpath="//*[@id='chkReport']")
									private static WebElement  dashBoardCustomizeReportReportRadioBtn;
									
									@FindBy(xpath="//*[@id='chkGraph']")
									private static WebElement  dashBoardCustomizeReportGraphRadioBtn;
									
									@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
									private static WebElement  inputMasterCombobox;
									
									@FindBy(xpath="//input[@id='txtsrch-term']")
									private static WebElement  searchMasterCombobox;
								
									@FindBy(xpath="//div[@id='dvReportInputs']")
									private static WebElement  inputReportsSettings;
									
									@FindBy(xpath="//td[contains(@class,'tdName padding0')]")
									private static WebElement  nameMasterSearchCombobox;
									
									@FindBy(xpath="//*[@id='LandingGridBody']/tr[3]/td[11]")
									private static WebElement  nameMasterInputCombobox;
									
									@FindBy(xpath="//*[@id='id_Dashlet1']/a/label")
									private static WebElement  newReportNameDisplayInCreateDashlet;
												
								@FindBy(xpath="//*[@id='SaveDashlet_Icon']")
								private static WebElement  receiptsEditCustomizeReportSettingsSave;
											
								@FindBy(xpath="//*[@id='Newdashlet_Icons']/ul/li[2]")
								private static WebElement  receiptsEditCustomizeReportSettingsCancel;
													
							
						          //InfoPanel****************************************************************				
										
										@FindBy(xpath="//*[@id='InfopanelOption']")
										private static WebElement  dashBoardCustomizeInfoPanel;

											@FindBy(xpath="//*[@id='NewInfopanel']")
											private static WebElement  dashBoardCustomizeInfopanelNewInfopanel;
										
										        //------------------------InfoPanel customize Def

												@FindBy(xpath="//*[@id='DashletTabs']/li[1]/a/i")
												private static WebElement  dashBoardCustomizeInfoPanelDef;
																			
													@FindBy(xpath="//*[@id='DashletTabs']/li[1]")
													private static WebElement  dashBoardCustomizeInfoPanelLabel;
									
													@FindBy(xpath="//*[@id='DashletName']")
													private static WebElement  dashBoardCustomizeInfoPanelDefNameText;
													
													@FindBy(xpath="//*[@id='Type']")
													private static WebElement  dashBoardCustomizeInfoPanelDefInfoTypeDropdown;
												
													///Selected StandardValue In DropDown
													@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[2]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]")
													private static WebElement  dashBoardCustomizeInfoPaneDefAddIcon;
													
													@FindBy(xpath="//*[@id='Variable1']")
													private static WebElement  dashBoardCustomizeInfoPanelDefFirstGridVariable;
													
													@FindBy(xpath="//*[@id='txtStandardVarCaption1']")
													private static WebElement  dashBoardCustomizeInfoPanelDefFirstGridCaption;
													
													@FindBy(xpath="//*[@id='ddlVariablePeriod1']")
													private static WebElement  dashBoardCustomizeInfoPanelDefFirstGridPeriod;
													
													@FindBy(xpath="//*[@id='divNewVariable1']/div[1]/div/span")
													private static WebElement  dashBoardCustomizeInfoPanelDefFirstGridDeleteIcon;
													
													@FindBy(xpath="//*[@id='divNewVariable1']/div[3]/div[2]/div/span")
													private static WebElement  dashBoardCustomizeInfoPanelDefFirstGridFilterIcon;
													
														//filter icon in detailed of First Row
														@FindBy(xpath="//*[@id='36_1_AdvanceinfoFilter']/table/tbody/tr/td[1]/select")
														private static WebElement infoFirstFilterConjuctionDropdown;
														
														@FindBy(xpath="//*[@id='36_1_AdvanceinfoFilter']/table/tbody/tr/td[2]/input")
														private static WebElement infoFirstFilterSelectField;
														
															//inner properties
															@FindBy(xpath="//*[@id='1']")
															private static WebElement infoFilterSelectFieldAccount ;
															
															@FindBy(xpath="//*[@id='2']")
															private static WebElement infoFilterSelectFieldProduct ;
															
															@FindBy(xpath="//*[@id='3']")
															private static WebElement infoFilterSelectFieldDepartment;
												
															@FindBy(xpath="//*[@id='6']")
															private static WebElement infoFilterSelectFieldLocation;
															
																	
																@FindBy(xpath="//*[@id='36_1_AdvanceinfoFilter']/table/tbody/tr/td[3]/select")
																private static WebElement infoFilterSelectOperatorFirstGridDropdown;
																
																@FindBy(xpath="//*[@id='36_1_AdvanceinfoFilter']/table/tbody/tr/td[4]/select")
																private static WebElement infoFilterCompareWithFirstGridDropdown;
																
																@FindBy(xpath="//*[@id='36_1_AdvanceinfoFilter']/table/tbody/tr/td[5]/input")
																private static WebElement infoFilterValueFirstGridText;
																
																@FindBy(xpath="//*[@id='36_1_AdvanceinfoFilter']/table/tbody/tr/td[7]/span")
																private static WebElement infoFilterTOFirstGridAddOneMoreRowBtn;
																
																@FindBy(xpath="//*[@id='36_1_AdvanceinfoFilter']/table/tbody/tr[1]/td[6]/span")
																private static WebElement infoFilterTOFirstGridDeleteFirstRowBtn;
																
																@FindBy(xpath="//*[@id='36_1_AdvanceinfoFilter']/table/tbody/tr[2]/td[6]/span")
																private static WebElement infoFilterTODeleteSecondtRowBtn;
															
														@FindBy(xpath="//*[@id='divNewVariable2']/div[1]/div/span")
														private static WebElement  dashBoardCustomizeInfoPanelDefSecondGridDeleteIcon;		
														
														@FindBy(xpath="//*[@id='divNewVariable2']/div[3]/div[2]/div/span")
														private static WebElement  dashBoardCustomizeInfoPanelDefSecondGridFilterIcon;
																		
															//filter icon in detailed of Second Row
															@FindBy(xpath="//*[@id='Variable2']")
															private static WebElement  dashBoardCustomizeInfoPanelDefSecondGridVariable;
															
															@FindBy(xpath="//*[@id='txtStandardVarCaption2']")
															private static WebElement  dashBoardCustomizeInfoPanelDefSecondGridCaption;
															
															@FindBy(xpath="//*[@id='ddlVariablePeriod2']")
															private static WebElement  dashBoardCustomizeInfoPanelDefSecondGridPeroid;
															
															//filter icon in detailed
															
															@FindBy(xpath="//*[@id='36_2_AdvanceinfoFilter']/table/tbody/tr/td[1]/select")
															private static WebElement infoFilterConjuctionSecondGridDropdown;
															
															@FindBy(xpath="//*[@id='36_2_AdvanceinfoFilter']/table/tbody/tr/td[2]/input")
															private static WebElement infoFilterSecondGridSelectField;
																		
																//inner properties
																
																@FindBy(xpath="//*[@id='1']")
																private static WebElement infoFilterSelectSecondGridFieldAccount;
																
																@FindBy(xpath="//*[@id='2']")
																private static WebElement infoFilterSelectSecondGridFieldProduct;
																
																@FindBy(xpath="//*[@id='3']")
																private static WebElement infoFilterSelectSecondGridFieldDepartment;
													
																		
														@FindBy(xpath="//*[@id='36_2_AdvanceinfoFilter']/table/tbody/tr/td[3]/select")
														private static WebElement infoFilterSelectOperatorSecondFilterDropdown;
														
														@FindBy(xpath="//*[@id='36_2_AdvanceinfoFilter']/table/tbody/tr/td[4]/select")
														private static WebElement infoFilterCompareWithSecondFilterDropdown;
														
														@FindBy(xpath="//*[@id='36_2_AdvanceinfoFilter']/table/tbody/tr/td[5]/input")
														private static WebElement infoSecondFilterValueText;
														
														@FindBy(xpath="//*[@id='36_2_AdvanceinfoFilter']/table/tbody/tr/td[7]/span")
														private static WebElement infoFilterTOSecondFilterAddOneMoreRowBtn;
														
														@FindBy(xpath="//*[@id='36_2_AdvanceinfoFilter']/table/tbody/tr[1]/td[6]/span")
														private static WebElement infoFilterTOSecondFilterDeleteFirstRowBtn;
														
														@FindBy(xpath="//*[@id='36_2_AdvanceinfoFilter']/table/tbody/tr[2]/td[6]/span")
														private static WebElement infoFilterTOSecondFilterDeleteSecondtRowBtn;
														
														
																		
						                                //Info type as Define		
														                 
														@FindBy(xpath="//*[@id='InfoPanel_ContainerDiv1']/div[4]/div[2]/span")
														private static WebElement infoPanelDef_InfoType_DefineDeleteBtn;		
														
														@FindBy(xpath="//*[@id='txtDefineCaption1']")
														private static WebElement infoPanelDef_InfoType_DefineCaption;		
														
														@FindBy(xpath="//*[@id='ddlDataSet1']")
														private static WebElement infoPanelDef_InfoType_DefineDataSetDropDown;
														
														@FindBy(xpath="//*[@id='ddlValue1']")
														private static WebElement infoPanelDef_InfoType_DefineValueDropdown;
														
														@FindBy(xpath="//*[@id='ddlSummary1']")
														private static WebElement infoPanelDef_InfoType_DefineSummaryDropdown;
														
														@FindBy(xpath="//*[@id='ddlPeriod1']")
														private static WebElement infoPanelDef_InfoType_DefinePeriodDropdown;
														
														
														@FindBy(xpath="//*[@id='InfoPanel_ContainerDiv1']/div[4]/div[2]/span")
														private static WebElement infoPanelDef_InfoType_DefineFilterBtn;		
														
														//filter icon in detailed
														
														@FindBy(xpath="//*[@id='36_1_AdvanceFilter']/table/tbody/tr/td[7]/span")
														private static WebElement infoPanelDef_FirstInfoType_DefineFilterAddBtn;
										                 
														@FindBy(xpath="//*[@id='36_1_AdvanceFilter']/table/tbody/tr/td[1]/select")
														private static WebElement infoPanelDef_FirstInfoType_DefineFilter_ConjuctionDropdown;
														
														@FindBy(xpath="//*[@id='36_1_AdvanceFilter']/table/tbody/tr/td[2]/input")
														private static WebElement infoPanelDef_FirstInfoType_DefinetFilterSelectField;
							
														//inner properties
														
														@FindBy(xpath="//*[@id='1']")
														private static WebElement infoPanelDef_InfoType_DefineFilterSelectFieldFirstAccount;
														
														@FindBy(xpath="//*[@id='2']")
														private static WebElement infoPanelDef_InfoType_DefineFilterSelectFieldFirstProduct;
														
														@FindBy(xpath="//*[@id='3']")
														private static WebElement infoPanelDef_InfoType_DefineFilterSelectFieldFirstDepartment;
														
														@FindBy(xpath="//*[@id='6']")
														private static WebElement infoPanelDef_InfoType_DefineFilterSelectFieldFirstLocation;
													
																					
														@FindBy(xpath="//*[@id='36_1_AdvanceFilter']/table/tbody/tr/td[3]/select")
														private static WebElement infoPanelDef_InfoType_DefineFilterSelectOperatorFirstDropdown;
														
														@FindBy(xpath="//*[@id='36_1_AdvanceFilter']/table/tbody/tr/td[4]/select")
														private static WebElement infoPanelDef_InfoType_DefineFilterFirstCompareWithDropdown;
														
														@FindBy(xpath="//*[@id='36_1_AdvanceFilter']/table/tbody/tr/td[5]/input")
														private static WebElement infoPanelDef_InfoType_DefineFirstFilterValurText;
														
														@FindBy(xpath="//*[@id='36_1_AdvanceFilter']/table/tbody/tr/td[6]/span")
														private static WebElement infoPanelDef_InfoType_DefineFilterFirstTODeleteFirstRowBtn;
														
														@FindBy(xpath="//*[@id='36_1_AdvanceFilter']/table/tbody/tr/td[7]/span")
														private static WebElement infoPanelDef_InfoType_DefineFilterTOFirstAddOneMoreRowBtn;
														
														@FindBy(xpath="//*[@id='36_1_AdvanceinfoPanelDef_InfoType_DefineFilter']/table/tbody/tr[2]/td[6]/span")
														private static WebElement infoPanelDef_InfoType_DefineFilterTOFirstDeleteSecondtRowBtn;
														
														
														
														///////////////////2  row Elements
														
																		
														
														@FindBy(xpath="//*[@id='InfoPanel_ContainerDiv2']/div[4]/div[2]/span")
														private static WebElement infoPanelDef_SecondInfoType_DefineDeleteBtn;		
														
														@FindBy(xpath="//*[@id='txtDefineCaption2']")
														private static WebElement infoPanelDef_SecondInfoType_DefineCaption;		
														
														@FindBy(xpath="//*[@id='ddlDataSet2']")
														private static WebElement infoPanelDef_SecondInfoType_DefineDataSetDropDown;
														
														@FindBy(xpath="//*[@id='ddlValue2']")
														private static WebElement infoPanelDef_SecondInfoType_DefineValueDropdown;
														
														@FindBy(xpath="//*[@id='ddlSummary2']")
														private static WebElement infoPanelDef_SecondInfoType_DefineSummaryDropdown;
														
														@FindBy(xpath="//*[@id='ddlPeriod2']")
														private static WebElement infoPanelDef_SecondInfoType_DefinePeriodDropdown;
														
														                
														@FindBy(xpath="//*[@id='InfoPanel_ContainerDiv2']/div[4]/div[2]/span")
														private static WebElement infoPanelDef_SeconInfoType_DefineFilterBtn;		
														
														
														
														//filter icon in detailed
														                            
														
														
														@FindBy(xpath="//*[@id='36_2_AdvanceFilter']/table/tbody/tr/td[1]/select")
														private static WebElement infoPanelDef_InfoType_DefineFilterFilter_SecondConjuctionDropdown;
														
														@FindBy(xpath="///*[@id='36_2_AdvanceFilter']/table/tbody/tr/td[2]/input")
														private static WebElement infoPanelDef_InfoType_DefineFilterSecondSelectField;
														
															//inner properties
															
															@FindBy(xpath="//*[@id='1']")
															private static WebElement infoPanelDef_SecondInfoType_DefineFilterSelectFieldAccount;
															
															@FindBy(xpath="//*[@id='2']")
															private static WebElement infoPanelDef_SecondInfoType_DefineFilterSelectFieldProduct;
															
															@FindBy(xpath="//*[@id='3']")
															private static WebElement infoPanelDef_SecondInfoType_DefineFilterSelectFieldDepartment;
														
												
															@FindBy(xpath="//*[@id='6']")
															private static WebElement infoPanelDef_SecondInfoType_DefineFilterSelectFieldLocation;
															
																					
																@FindBy(xpath="//*[@id='36_2_AdvanceFilter']/table/tbody/tr/td[3]/select")
																private static WebElement infoPanelDef_SecondInfoType_DefineFilterSelectOperatorDropdown;
																			
																@FindBy(xpath="//*[@id='36_2_AdvanceFilter']/table/tbody/tr/td[4]/select")
																private static WebElement infoPanelDef_SecondInfoType_DefineFilterCompareWithDropdown;
																	
																@FindBy(xpath="//*[@id='36_2_AdvanceFilter']/table/tbody/tr/td[5]/input")
																private static WebElement infoPanelDef_SecondInfoType_DefineFilterValurText;
																			
																@FindBy(xpath="//*[@id='36_2_AdvanceFilter']/table/tbody/tr/td[6]/span")
																private static WebElement infoPanelDef_SecondInfoType_DefineFilterTODeleteFirstRowBtn;
																			
																@FindBy(xpath="//*[@id='36_2_AdvanceFilter']/table/tbody/tr/td[7]/span")
																private static WebElement infoPanelDef_SecondInfoType_DefineFilterTOAddOneMoreRowBtn;
																			
																@FindBy(xpath="//*[@id='36_2_AdvanceinfoPanelDef_InfoType_DefineFilter']/table/tbody/tr[2]/td[6]/span")
																private static WebElement infoPanelDef_SecondInfoType_DefineFilterTODeleteSecondtRowBtn;													
																			
																
		//                                                     //In Create Dashlets, after saving info panel is added
																
																
																@FindBy(xpath="//*[@id='id_Dashlet2']/a/label")
																private static WebElement infoPanel_SelectingFirst;				
																
																@FindBy(xpath="//*[@id='id_Dashlet2']/i[2]")
																private static WebElement infoPanel_SelectingFirst_EditBtn;	
			
																@FindBy(xpath="//*[@id='id_Dashlet2']/i[1]")
																private static WebElement infoPanel_SelectingFirst_DeleteBtn;									
															
																		
						                                          /////Selected Info Type Drop down is Query															
																
																@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[2]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]")
																private static WebElement infoPanelDef_InfoType_QueryAddBtn;	
																
																@FindBy(xpath="//div[@id='InfoPanel_QueryDiv1']//span[@class='icon-delete icon-font6']")
																private static WebElement infoPanelDef_InfoType_QueryDelete1Btn;	
																
																@FindBy(xpath="//input[@id='txtQueryCaption1']")
																private static WebElement infoPanelDef_InfoType_QueryCaption1Textbox;	
																
																@FindBy(xpath="//select[@id='ddlQueryPeriod1']")
																private static WebElement infoPanelDef_InfoType_QueryPeriod1Dropdown;	
																
																@FindBy(xpath="//textarea[@id='txtQuery1']")
																private static WebElement infoPanelDef_InfoType_QueryDecrption1TxtBox;	
																
																@FindBy(xpath="//select[@id='ddlQueryValue1']")
																private static WebElement infoPanelDef_InfoType_QueryValue1Dropdown;	
																
																
															////////////////////////// For 2 Row elements	
																
																			
																
																@FindBy(xpath="//*[@id='InfoPanel_QueryDiv2']/div[1]/div/span")
																private static WebElement infoPanelDef_InfoType_QueryDelete2Btn;	
																
																@FindBy(xpath="//*[@id='txtQueryCaption2']")
																private static WebElement infoPanelDef_InfoType_QueryCaption2Textbox;	
																
																@FindBy(xpath="//*[@id='ddlQueryPeriod2']")
																private static WebElement infoPanelDef_InfoType_QueryPeriod2Dropdown;	
																
																@FindBy(xpath="//*[@id='txtQuery2']")
																private static WebElement infoPanelDef_InfoType_QueryDecrption2TxtBox;	
																
																@FindBy(xpath="//*[@id='ddlQueryValue2']")
																private static WebElement infoPanelDef_InfoType_QueryValue2Dropdown;	
																
														
										   //------------------------InfoPanel customize------- Properties
										
											@FindBy(xpath="//*[@id='DashletTabs']/li[2]")
											private static WebElement  dashBoardCustomizeInfoPanelProperties;
								
														
														@FindBy(xpath="//*[@id='Dashlet_InfoPanelPropeties']/div[2]/div[1]/div/input")
														private static WebElement  dashBoardCustomizeInfoPanelPropertiesPalette;
														
														@FindBy(xpath="//*[@id='Dashlet_InfoPanelPropeties']/div[2]/div[2]/div/input")
														private static WebElement  dashBoardCustomizeInfoPanelPropertiesBackGround;
														
														
												
									
												
										//----------------------InfoPanel customize Maximized view		
										
										@FindBy(xpath="//*[@id='DashletTabs']/li[3]")
										private static WebElement  dashBoardCustomizeInfoPanelMaximizedView;
												
												@FindBy(xpath="//*[@id='DisplayType']")
												private static WebElement  dashBoardCustomizeInfoPanelMaximizedViewDisplay;
												
												@FindBy(xpath="//*[@id='DisplayValue']")
												private static WebElement  dashBoardCustomizeInfoPanelMaximizedViewDiplayitemSelected;
													
												@FindBy(xpath="//*[@id='maxViewDiv']/div/div[1]/div/span[1]")
												private static WebElement  dashBoardCustomizeInfoPanelMaximizedViewCustomizeIcon;
												
												@FindBy(xpath="//*[@id='maxViewDiv']/div/div[1]/div/span[2]")
												private static WebElement  dashBoardCustomizeInfoPanelMaximizedViewCloseIcon;
												
												@FindBy(xpath="//*[@id='SaveDashlet_Icon']")
												private static WebElement  dashBoardCustomizeInfoPanelMaximizedViewSave;
												
												@FindBy(xpath="//*[@id='Newdashlet_Icons']/ul/li[2]")
												private static WebElement  dashBoardCustomizeInfoPanelMaximizedViewCancel;
												
												@FindBy(xpath="//label[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 padding0 Flabel theme_color-inverse font-4']")
												private static WebElement  dashBoardInfoPanel;
												
												@FindBy(xpath="//div[@id='dashlate3']")
												private static WebElement  dashBoardInfoPanelToDelete;
												
												@FindBy(xpath="/html/body/ul[1]/li")
												private static WebElement  dashboardInfoPanelDeleteOption;
												
												@FindBy(xpath="//*[@id='myModalLabel']")
												private static WebElement  dashboardDeleteOptionMessage;
																		
												@FindBy(xpath="//div[@id='confirm']//button[@id='btnCancel']")
												private static WebElement  dashboardDeleteOptionMessageCancelBtn;
												
												@FindBy(xpath="//div[@id='confirm']//button[@id='deletebtn']")
												private static WebElement  dashboardDeleteOptionMessageOkBtn;
												
								@FindBy(xpath="//*[@id='SaveDashlet_Icon']")
							    private static WebElement  dashBoardCustomizeInfoPanelSaveBtn;
												
								@FindBy(xpath="//*[@id='Newdashlet_Icons']/ul/li[2]")
							    private static WebElement  dashBoardCustomizeInfoPanelCancelBtn;

			    //------------------------WorkFlow customize Def								
				@FindBy(xpath="//*[@id='workflow']")
				private static WebElement  dashBoardCustomizeInfoWorkFlow;
				
					@FindBy(xpath="//*[@id='NewWorkflow']")
					private static WebElement  dashBoardCustomizeWorkFlow_NewWorkflow;
									
							@FindBy(xpath="//*[@id='DashletTabs']/li[1]")
							private static WebElement  dashBoardCustomizeWorkFlowDef;
									
							@FindBy(xpath="//*[@id='tbWkflowName']")
							private static WebElement  dashBoardCustomizeWorkFlowDefName;
								
									@FindBy(xpath="//*[@id='ddlWkflow']")
									private static WebElement  dashBoardCustomizeWorkFlowDef_WorkFlowName;
													
									@FindBy(xpath="//*[@id='SaveDashlet_Icon']")
									private static WebElement  dashBoardCustomizeWorkFlowSave;
																						
									@FindBy(xpath="//*[@id='Newdashlet_Icons']/ul/li[2]")
									private static WebElement  dashBoardCustomizeWorkFlowCancel;																	
										
							@FindBy(xpath="//*[@id='Dash_Save']")
							private static WebElement  dashBoardCustomizeDashSave;
							
							@FindBy(xpath="//*[@id='Dash_Close']")
							private static WebElement  dashBoardCustomizeDashCancel;
											
							@FindBy(xpath="//*[@id='lblErrMessage_Graph']")
							private static WebElement  dashBoardCustomizeMessageAtBottom;
							
							//After Saving Dashlets in the Dashboards
							@FindBy(xpath="//label[@class='theme_color-inverse']")
							private static WebElement  dashBoardCustomizeDashletGraph;
							
							@FindBy(xpath="//div[@class='theme_color-inverse']")
							private static WebElement  dashBoardCustomizeDashlNewReport;
				
							
							@FindBy(xpath="//span[@class='hidden-xs']")
							private static WebElement userNameDisplay;

						    
						   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
							private static WebElement userNameDisplay;*/

							@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
							private static WebElement companyName;


							
							@FindBy(xpath="//*[@id='companyLogo']")
							private static WebElement companyLogo;
						    
							@FindBy(xpath="//*[@id='dashName']")
							private static WebElement dashboard;
							 
							@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
							public static WebElement ErrorMessageCloseBtn;
							
							@FindBy(xpath="//*[@id='txtUsername']")
							private static WebElement username;

							@FindBy(id="txtPassword")
							private static WebElement password;
							
						    @FindBy(id="ddlCompany")
						    private static WebElement companyDropDownList;

							@FindBy(id="btnSignin")
							private static WebElement signIn;

							@FindBy(xpath="//*[@id='userprofile']/li/span[2]")
							private static WebElement logoutOption;	
							
						    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
							private static WebElement noIn;	
						    
						    
						    
						    
	
	 public static boolean checkDashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";


			
			LoginPage lp=new LoginPage(getDriver()); 
			
	        String unamelt="su";
	      
	        String pawslt="su";
	      
	        LoginPage.enterUserName(unamelt);

	        LoginPage.enterPassword(pawslt);
	  
	        LoginPage.clickOnSignInBtn();
	        
	        Thread.sleep(9000);
	        
	        
	        if(noIn.isDisplayed())
			{

				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(noIn));
				noIn.click();
				Thread.sleep(5000);
				
			}
	           	
	    	String userInfo=userNameDisplay.getText();
	    	
	    	System.out.println("User Info : "+userInfo);
	    	
	    	System.out.println("User Info Capture Text :"+userNameDisplay.getText());
	    	
	    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
	    	
	    	companyLogo.click();
	    	
	    	String getCompanyTxt=companyName.getText();
	    	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
	    	System.out.println("company name :"+ getLoginCompanyName);
	    	companyLogo.click();
	    	
	    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
	    	
	    	String getDashboard=dashboard.getText();
	    	
	    	System.out.println(getDashboard);

		
			 
	    	if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
		    		/*getDashboard.equalsIgnoreCase("Dashboard") &&*/ selectdashBoardBtn.isDisplayed() && newDashBoard.isDisplayed() && 
					 dashBoardCustomizeBtn.isDisplayed())
				 
		   {
			
				     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
			
					excelReader.setCellData(xlfile, "Sheet1", 160, 9, resPass);
					return true;
		   }
		   else
		   {
			 excelReader.setCellData(xlfile, "Sheet1", 160, 9, resFail);
				return false;
		   }
		}
	 
	 
	 
	 public static boolean checkNewDashboardOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newDashBoard));
			
			 newDashBoard.click();
			 
			 if(dashBoardName.isDisplayed() && dashBoardSettingInCombobox.isDisplayed() && 
					 DashBoardDescription.isDisplayed() && dashBoardHeaderTextBox.isDisplayed() && 
					 dashBoardHeaderSettingsBtn.isDisplayed() && dashBoardBody.isDisplayed() && 
					 DashBoardBodySettingBtn.isDisplayed() && DashBoardFooterSettingBtn.isDisplayed() &&
					 dashBoardFooter.isDisplayed() && dashBoardSetAsDefaultCheckbox.isDisplayed() &&
					 dashBoardActiveCheckbox.isDisplayed() && dashBoardUsersRadioBtn.isDisplayed() &&
					 dashBoardRolesRadioBtn.isDisplayed() && dashBoardSharedUsers.isDisplayed() &&
					 dashBoardRightSideArrowIcon.isDisplayed() && dashBoardLeftSideArrowIcon.isDisplayed() &&
					 dashBoardSaveBtn.isDisplayed() && dashBoardCancelBtn.isDisplayed())
			{
				excelReader.setCellData(xlfile, "Sheet1", 161, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 161, 9, resFail);
				return false;
			}
		}
	 
	
		     
	 
	  public static boolean checkSettingsCustomizeScreenInDashboardNameOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardSettingInCombobox));
				
				 dashBoardSettingInCombobox.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDisplaysNameColumn));
				 		 
				 if(dashBoardCustomizeDisplaysNameColumn.isDisplayed() && dashBoardPopCustomizeStandardFieldsBtn.isDisplayed() && 
						 dashBoardPopCustomizeDisplayColumnsDeleteColoumn.isDisplayed() && dashBoardPopCustomizeDisplayColumnsOkBtn.isDisplayed() && 
						 dashBoardPopCustomizeDisplayStandardColumnAttributeCancelBtn.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 162, 9, resPass);
					return true;
				}
				else
				{
					excelReader.setCellData(xlfile, "Sheet1", 162, 9, resFail);
					return false;
				}
	   }


	
	 
	 
			  public static boolean checkStandardFieldsColumnInCustomizeScreenInDashboardNameOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				 {
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardPopCustomizeStandardFieldsBtn));
						
						 dashBoardPopCustomizeStandardFieldsBtn.click();
						 
						 if(dashBoardPopCustomizeStandardColumnAttributeFieldName.isDisplayed() && dashBoardPopCustomizeStandardColumnAttributeHeader.isDisplayed() && 
								 dashBoardPopCustomizeStandardColumnAttributeAlignment.isDisplayed() && dashBoardPopCustomizeStandardColumnAttributeWidth.isDisplayed() && 
								 dashBoardPopCustomizeDisplayStandardColumnAttributeOkBtn.isDisplayed() && dashBoardPopCustomizeDisplayStandardColumnAttributeCancelBtn.isDisplayed())
						{
							excelReader.setCellData(xlfile, "Sheet1", 163, 9, resPass);
							dashBoardPopCustomizeDisplayStandardColumnAttributeCancelBtn.click();
							dashBoardPopCustomizeDisplayStandardColumnAttributeCancelBtn.click();
							return true;
						}
						else
						{
							excelReader.setCellData(xlfile, "Sheet1", 163, 9, resFail);
							return false;
						}
					}
				 
			  
			  public static boolean checkHeaderOptionsInNewDashboardOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				 {
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
						Thread.sleep(3000);
						
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardHeaderTextBox));
						
						getAction().doubleClick(dashBoardHeaderTextBox).perform();
						
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardHeaderSettingsBtn));
						
						 dashBoardHeaderSettingsBtn.click();
						 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardHeader_FontFamilyDropdown));
						
						 if(dashBoardHeader_FontFamilyDropdown.isDisplayed() && dashBoardHeader_FontStyleDropdown.isDisplayed() && 
								 dashBoardHeader_FontWeightDropdown.isDisplayed() && dashBoardHeader_FontSizeDropdown.isDisplayed() && 
								 dashBoardHeader_FontForeColorDropdown.isDisplayed() && dashBoardHeader_FontBackColorDropdown.isDisplayed() && 
								 dashBoardHeader_BaselineCheckbox.isDisplayed() && dashBoardHeader_OverLineCheckbox.isDisplayed() &&
								 dashBoardHeader_StrikeThroughCheckbox.isDisplayed() && dashBoardHeader_UnderlineCheckbox.isDisplayed() &&
								 dashBoardHeader_FontPreviewDescription.isDisplayed() && dashBoardHeader_EnableFontCheckbox.isDisplayed() &&
								 dashBoardHeaderSaveBtn.isDisplayed() && dashBoardHeaderCLoseBtn.isDisplayed())
						{
							dashBoardHeaderCLoseBtn.click();
							excelReader.setCellData(xlfile, "Sheet1", 164, 9, resPass);
							return true;
						}
						else
						{
							dashBoardHeaderCLoseBtn.click();
							excelReader.setCellData(xlfile, "Sheet1", 164, 9, resFail);
							return false;
						}
					}
			  
			
			  
			  public static boolean checkBodyOptionsInNewDashboardOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				 {
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
						Thread.sleep(3000);
						
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardBody));
						
						getAction().doubleClick(dashBoardBody).perform();
						
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(DashBoardBodySettingBtn));
						
						 DashBoardBodySettingBtn.click();
						 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardBody_FontFamilyDropdown));
						
						 if(dashBoardBody_FontFamilyDropdown.isDisplayed() && dashBoardBody_FontStyleDropdown.isDisplayed() && 
								 dashBoardBody_FontWeightDropdown.isDisplayed() && dashBoardBody_FontSizeDropdown.isDisplayed() && 
								 dashBoardBody_FontForeColorDropdown.isDisplayed() && dashBoardBody_FontBackColorDropdown.isDisplayed() && 
								 dashBoardBody_BaselineCheckbox.isDisplayed() && dashBoardBody_OverLineCheckbox.isDisplayed() &&
								 dashBoardBody_StrikeThroughCheckbox.isDisplayed() && dashBoardBody_UnderlineCheckbox.isDisplayed() &&
								 dashBoardBody_FontPreviewDescription.isDisplayed() && dashBoardBody_EnableFontCB.isDisplayed() &&
								 dashBoardBodySaveBtn.isDisplayed() && dashBoardBodyCLoseBtn.isDisplayed())
						{
							 dashBoardBodyCLoseBtn.click();
							excelReader.setCellData(xlfile, "Sheet1", 165, 9, resPass);
							return true;
						}
						else
						{
							dashBoardBodyCLoseBtn.click();
							excelReader.setCellData(xlfile, "Sheet1", 165, 9, resFail);
							return false;
						}
					}
		
			  
			  public static boolean checkFooterOptionsInNewDashboardOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				 {
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
						Thread.sleep(3000);
						
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFooter));
						
						getAction().doubleClick(dashBoardFooter).perform();
						
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(DashBoardFooterSettingBtn));
						
						 DashBoardFooterSettingBtn.click();
						 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFooter_FontFamilyDropdown));
						
						 if(dashBoardFooter_FontFamilyDropdown.isDisplayed() && dashBoardFooter_FontStyleDropdown.isDisplayed() && 
								 dashBoardFooter_FontWeightDropdown.isDisplayed() && dashBoardFooter_FontSizeDropdown.isDisplayed() && 
								 dashBoardFooter_FontForeColorDropdown.isDisplayed() && dashBoardFooter_FontBackColorDD.isDisplayed() && 
								 dashBoardFooter_BaselineCheckbox.isDisplayed() && dashBoardFooter_OverLineCheckbox.isDisplayed() &&
								 dashBoardFooter_StrikeThroughCheckbox.isDisplayed() && dashBoardFooter_UnderlineCheckbox.isDisplayed() &&
								 dashBoardFooter_FontPreviewDescription.isDisplayed() && dashBoardFooter_EnableFontCheckbox.isDisplayed() &&
								 dashBoardFooterSaveBtn.isDisplayed() && dashBoardFooterCLoseBtn.isDisplayed())
						{
							 dashBoardFooterCLoseBtn.click();
							excelReader.setCellData(xlfile, "Sheet1", 166, 9, resPass);
							return true;
						}
						else
						{
							dashBoardFooterCLoseBtn.click();
							excelReader.setCellData(xlfile, "Sheet1", 166, 9, resFail);
							return false;
						}
					}
					
			  
			  
			 public static boolean checkRolesAndUsersOptionsWithSecurity() throws EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
				    String getUsersFromq=dashBoardSharedUsers.getText();
				 		 
					 if(dashBoardActiveCheckbox.isSelected() && dashBoardUsersRadioBtn.isSelected() && dashBoardSharedUsers.getText().equalsIgnoreCase("SU"))
					 {
						 excelReader.setCellData(xlfile, "Sheet1", 167, 9, resPass);
						 return true;
					 }
					 else
					 {
						 excelReader.setCellData(xlfile, "Sheet1", 167, 9, resFail);
						 return false;
					 }
			 }
			  
			 
			
			 public static boolean checkRolesOption() throws EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					dashBoardRolesRadioBtn.click();
					
					if(dashBoardSharedUsers.getText().equalsIgnoreCase(""))
					{
						 excelReader.setCellData(xlfile, "Sheet1", 168, 9, resPass);
							return true;
							
			         }
					else
					{
						 excelReader.setCellData(xlfile, "Sheet1", 168, 9, resFail);
							return false;
					}
			 
				
			 }
			  
			  
			  
			 public static boolean checkSharedUsersonClickOnUsersRadioBtnOption() throws EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
					dashBoardUsersRadioBtn.click();
					
					if(dashBoardSharedUsers.getText().equalsIgnoreCase("SU"))
					{
						 excelReader.setCellData(xlfile, "Sheet1", 169, 9, resPass);
							return true;
							
			         }
					else
					{
						 excelReader.setCellData(xlfile, "Sheet1", 169, 9, resFail);
							return false;
					}
			 
				
			 }
			 
			 
	 
			 public static boolean checkSaveBtnWithoutInputDashboardNameMandatoryFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardSaveBtn));
						
					 dashBoardSaveBtn.click();
					 
					
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
					
					 if(dashboardValidationAndConfirmationMessage.getText().endsWith("Enter title for Dashboard."))
					{
						excelReader.setCellData(xlfile, "Sheet1", 170, 9, resPass);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 170, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					}
				}
				
		
			 public static boolean checkSaveBtnWithInputDashboardName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardName));
					 
					 dashBoardName.sendKeys("Graph");
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardSaveBtn));
						
					 dashBoardSaveBtn.click();

					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 if(dashboardValidationAndConfirmationMessage.getText().endsWith("Dashboard Saved successfully"))
					{
						excelReader.setCellData(xlfile, "Sheet1", 171, 9, resPass);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 171, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					}
				}
			 
			 
			 public static boolean checkCancelBtnWithInputDashboardName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCancelBtn));
						
					 dashBoardCancelBtn.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeBtn)); 
					 
					 if(dashBoardCustomizeBtn.isDisplayed())
					{
						excelReader.setCellData(xlfile, "Sheet1", 172, 9, resPass);
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 172, 9, resFail);
						return false;
					}
				}
			 
			 
			 public static boolean checkCustomizationsOptionWithoutSelectingDashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeBtn));
						
					 dashBoardCustomizeBtn.click();
					 
					 if(validationPleaseSelectanyDashboardMessage.getText().equalsIgnoreCase("Please Select any Dashboard"))
					{
						excelReader.setCellData(xlfile, "Sheet1", 173, 9, resPass);
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 173, 9, resFail);
						return false;
					}
				}
			 
			 
			 public static boolean checkSavedDashboardFromSelectDashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
						
					 selectdashBoardBtn.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirst));
					 
					 if(dashBoardFirst.getText().equalsIgnoreCase("Graph"))
					{
						selectdashBoardBtn.click();
						excelReader.setCellData(xlfile, "Sheet1", 174, 9, resPass);
						return true;
					}
					else
					{
						selectdashBoardBtn.click();
						excelReader.setCellData(xlfile, "Sheet1", 174, 9, resFail);
						return false;
					}
				}
			 
	 
			 public static boolean checkEditDashboardOptionInSelectDashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
					 excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
					
					 selectdashBoardBtn.click();
							
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirstEditBtn));
						
					 dashBoardFirstEditBtn.click();
					 
					 if(dashBoardName.isDisplayed() && dashBoardSettingInCombobox.isDisplayed() && 
							 DashBoardDescription.isDisplayed() && dashBoardHeaderTextBox.isDisplayed() && 
							 dashBoardHeaderSettingsBtn.isDisplayed() && dashBoardBody.isDisplayed() && 
							 DashBoardBodySettingBtn.isDisplayed() && DashBoardFooterSettingBtn.isDisplayed() &&
							 dashBoardFooter.isDisplayed() && dashBoardSetAsDefaultCheckbox.isDisplayed() &&
							 dashBoardActiveCheckbox.isDisplayed() && dashBoardUsersRadioBtn.isDisplayed() &&
							 dashBoardRolesRadioBtn.isDisplayed() && dashBoardSharedUsers.isDisplayed() &&
							 dashBoardRightSideArrowIcon.isDisplayed() && dashBoardLeftSideArrowIcon.isDisplayed() &&
							 dashBoardSaveBtn.isDisplayed() && dashBoardCancelBtn.isDisplayed())
					{
						excelReader.setCellData(xlfile, "Sheet1", 175, 9, resPass);
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 175, 9, resFail);
						return false;
					}
				}
			 
			 
			 public static boolean checkDashboardNameInEditDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
				String getDashboardName= dashBoardName.getAttribute("value");
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardName));
				 	 
				 if(getDashboardName.equalsIgnoreCase("Graph"))
					{
						excelReader.setCellData(xlfile, "Sheet1", 176, 9, resPass);
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 176, 9, resFail);
						return false;
					}
					
			 }
			 
			 
			 
			 public static boolean checkUpdateDashboardByClickOnSaveBtnInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
						 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(DashBoardDescription));
				 
				 DashBoardDescription.sendKeys("Graph Description");
				 	 
				 dashBoardSaveBtn.click();

				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
				 
				 if(dashboardValidationAndConfirmationMessage.getText().endsWith("Updated Successfully"))
				{
					excelReader.setCellData(xlfile, "Sheet1", 177, 9, resPass);
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					ErrorMessageCloseBtn.click();
					return true;
				}
				else
				{
					excelReader.setCellData(xlfile, "Sheet1", 177, 9, resFail);
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					ErrorMessageCloseBtn.click();
					return false;
				}
					
			 }
			 
			 
			 
			 
			 public static boolean checkUpdatedDashboardDescriptionInEditDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCancelBtn));
					
				 dashBoardCancelBtn.click();
				 		 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
					
				 selectdashBoardBtn.click();
						
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirstEditBtn));
					
				 dashBoardFirstEditBtn.click();

				 String getDescription= DashBoardDescription.getAttribute("value");
				 
				 
				 if(getDescription.equalsIgnoreCase("Graph Description"))
				{
					excelReader.setCellData(xlfile, "Sheet1", 178, 9, resPass);
					return true;
				}
				else
				{
					excelReader.setCellData(xlfile, "Sheet1", 178, 9, resFail);
					return false;
				}
					
			 }
			 
			 
			 public static boolean checkAlertOnCreationOfDashbordWithSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
                  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCancelBtn));
					
				 dashBoardCancelBtn.click();
				 		 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newDashBoard));
					
				 newDashBoard.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardName));
				 
				 dashBoardName.sendKeys("setAsDefaultOnly");
				 
                 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(DashBoardDescription));
      
 				 getAction().doubleClick(DashBoardDescription).perform();
 				
				 DashBoardDescription.sendKeys("Graph Description");
				 
				
				 	 
				 
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardActiveCheckbox));
				 
				 dashBoardActiveCheckbox.click();
				 
             
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardSetAsDefaultCheckbox));
					
				 dashBoardSetAsDefaultCheckbox.click();
				 
				 Thread.sleep(3000);
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardSaveBtn));
				 
				 dashBoardSaveBtn.click();
				 
				 Thread.sleep(3000);
				 
				 String getDashboardSaveMsg="Are you sure that you want to create an Inactive dashboard.";

				 getWaitForAlert();
			     
			     String getDashboardSave=getAlert().getText();
			     
			     System.out.println("Dashboard Saving is displaying as "+ getDashboardSave);	     
			     
			     if(getDashboardSaveMsg.equalsIgnoreCase(getDashboardSave))
			     {
			    	 excelReader.setCellData(xlfile, "Sheet1", 179, 9, resPass);
			    	 return true;
			     }
			     else
			     {
			    	 excelReader.setCellData(xlfile, "Sheet1", 179, 9, resFail);
			    	 return false;
			     }
					
			 }
			 
			 public static boolean checkCancelButtonInAlertOnCreationOfDashboardWithSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
				 Thread.sleep(3000);
			 		 
				 getAlert().dismiss();
				  
 
                 
				 System.out.print("dashBoardName"+dashBoardName.getAttribute("value"));
				  
				 if(dashBoardName.getAttribute("value").equalsIgnoreCase("setAsDefaultOnly"))
					{
						excelReader.setCellData(xlfile, "Sheet1", 180, 9, resPass);
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 180, 9, resFail);
						return false;
					}
					
			 }
			 
			 
			 
			 public static boolean checkAlertAfterClickonCancelAndClickSaveBtnOnCreationOfDashboardWithSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
	             getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardSaveBtn));
				 
				 dashBoardSaveBtn.click();
				 
				 Thread.sleep(3000);
				 
				 String getDashboardSaveMsg="Are you sure that you want to create an Inactive dashboard.";

			     getWaitForAlert();
			     
			     String getDashboardSave=getAlert().getText();
			     
			     System.out.println("Dashboard Saving is displaying as "+ getDashboardSave);
			     
			     if(getDashboardSaveMsg.equalsIgnoreCase(getDashboardSave))
			     {
			    	 excelReader.setCellData(xlfile, "Sheet1", 181, 9, resPass);
			    	 return true;
			     }
			     else
			     {
			    	 excelReader.setCellData(xlfile, "Sheet1", 181, 9, resFail);
			    	 return false;
			     }
			 }
			 
			 
			 
			 public static boolean checkOkButtonInAlertOnCreationOfDashboardWithSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
				 Thread.sleep(3000);
			
				 getAlert().accept();
				 
			 
					String getValidationMessage=dashboardValidationAndConfirmationMessage.getText();
					 
					 System.out.println("getValidationMessage"+getValidationMessage);
					 
					 
					 if(getValidationMessage.equalsIgnoreCase("Dashboard Saved successfully"))
					{
						excelReader.setCellData(xlfile, "Sheet1", 182, 9, resPass);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 182, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					}
					
			 }
			 
			 
			 public static boolean checkCreateDashboardWithActiveAndSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCancelBtn));
					
				 dashBoardCancelBtn.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newDashBoard));
					
				 newDashBoard.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardName));
				 
				 dashBoardName.sendKeys("Graph with Active and setAsDefault");
				 
			     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(DashBoardDescription));
			       
	 			 getAction().doubleClick(DashBoardDescription).perform();
	 			 	
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardSetAsDefaultCheckbox));
					
				 dashBoardSetAsDefaultCheckbox.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardSaveBtn));
				 
				 dashBoardSaveBtn.click();

				 System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQ"+dashboardValidationAndConfirmationMessage);
 
				 //getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
				 
				 if(dashboardValidationAndConfirmationMessage.getText().endsWith("Dashboard Saved successfully"))
				{
					excelReader.setCellData(xlfile, "Sheet1", 183, 9, resPass);
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					ErrorMessageCloseBtn.click();
					return true;
				}
				else
				{
					excelReader.setCellData(xlfile, "Sheet1", 183, 9, resFail);
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					ErrorMessageCloseBtn.click();
					return false;
				}
			 }
			 
			 
			 
			 
			 public static boolean checkAlertForCreateDashboardWithNoActiveAndNoSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCancelBtn));
					
				 dashBoardCancelBtn.click();
				 		 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newDashBoard));
					
				 newDashBoard.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardName));
				 
				 dashBoardName.sendKeys("Graph with No Active And SetAsDefault");		 
				 
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(DashBoardDescription));
			      
	 				 getAction().doubleClick(DashBoardDescription).perform();
	 				
					 DashBoardDescription.sendKeys("Graph Description");
					 
		/*			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardSetAsDefaultCheckbox));
						
					 dashBoardSetAsDefaultCheckbox.click();
		*/			 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardActiveCheckbox));
					 
					 dashBoardActiveCheckbox.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardSaveBtn));
					 
					 dashBoardSaveBtn.click();
					 
					 String getDashboardSaveMsg="Are you sure that you want to create an Inactive dashboard.";

					 BaseEngine.getWaitForAlert();
				     
				     String getDashboardSave=BaseEngine.getAlert().getText();
				     
				     System.out.println("Dashboard Saving is displaying as "+ getDashboardSave);
				     
				     
				     if(getDashboardSaveMsg.equalsIgnoreCase(getDashboardSave))
				     {
				    	 excelReader.setCellData(xlfile, "Sheet1", 184, 9, resPass);
				    	 return true;
				     }
				     else
				     {
				    	 excelReader.setCellData(xlfile, "Sheet1", 184, 9, resFail);
				    	 return false;
				     }
						
				 }
			 
			 
			 public static boolean checkOkButtonInAlertForSavingNoActiveAndNoSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
				 getWebDriverWait().until(ExpectedConditions.alertIsPresent());
				 		 
				 BaseEngine.getAlert().accept();
				 
				String getValidationMessage=dashboardValidationAndConfirmationMessage.getText();
				 
				 System.out.println("getValidationMessage"+getValidationMessage);
				 
				 
				 if(getValidationMessage.equalsIgnoreCase("Dashboard Saved successfully"))
					{
						excelReader.setCellData(xlfile, "Sheet1", 185, 9, resPass);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 185, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					}
					
			 }
			 
			 
			 
			 public static boolean checkCancelBtnAfterCreatingDashboards() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCancelBtn));
						
					 dashBoardCancelBtn.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeBtn)); 
					 
					 if(dashBoardCustomizeBtn.isDisplayed())
					{
						excelReader.setCellData(xlfile, "Sheet1", 186, 9, resPass);
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 186, 9, resFail);
						return false;
					}
				}
			 
			 
			 
			 
			 public static boolean checkRefreshDashboardToDisplayDefaultDashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
					System.out.println("Before Refreshing");
										
					getDriver().navigate().refresh();

					Thread.sleep(3000);
					
				    System.out.println("labelDashboard.getText()"+ labelDashboard.getText());
				    
				    System.out.println("validationDashboardMessageAtBotton.getText()"+ validationDashboardMessageAtBotton.getText());
				  
				    
					if(labelDashboard.getText().equalsIgnoreCase("Graph with Active and setAsDefault") && 
							validationDashboardMessageAtBotton.getText().equalsIgnoreCase("No Dashlate Available for this Dashboard"))
					{
						excelReader.setCellData(xlfile, "Sheet1", 187, 9, resPass);
						return true;
						
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 187, 9, resFail);
						return false;
					}
					
			 }
			 
			 
			 
			 public static boolean checkActiveDashboardsDisplayInSelectDashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {

				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
					 	
					 selectdashBoardBtn.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirst)); 		 
					 
  					 boolean getValueThirdComboBox=isElementNotDisplayed(dashBoardThird);
					 
  					 System.out.println("getValueThirdComboBox"+getValueThirdComboBox);
  					 
					 if(dashBoardFirst.getText().equalsIgnoreCase("Graph") && 
					 		 dashBoardSecond.getText().equalsIgnoreCase("Graph with Active and setAsDefault") &&
					 	    	getValueThirdComboBox==false)
					 {
						selectdashBoardBtn.click();
					 	excelReader.setCellData(xlfile, "Sheet1", 188, 9, resPass);
					 	return true;
					 }
					 else
					 {
						selectdashBoardBtn.click();
						excelReader.setCellData(xlfile, "Sheet1", 188, 9, resFail);
						return false;
					 }
				}
			 
			 
			 			 
			 public static boolean checkDeleteOptionDashboardInSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
				 	
				 selectdashBoardBtn.click();
					 	 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirstDeleteBtn));
				 
				 dashBoardFirstDeleteBtn.click();
				 				 
				 String getDashboardMsg="Are you sure to delete this Dashboard ?";
				 
				 //Thread.sleep(3000);
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardConfirmationMessage));
				
				 String getDeleteDashboardMessage=dashBoardConfirmationMessage.getText();
				 
			     if(getDeleteDashboardMessage.equalsIgnoreCase(getDashboardMsg))
			     {
			    	 excelReader.setCellData(xlfile, "Sheet1", 189, 9, resPass);
			    	 return true;
			     }
			     else
			     {
			    	 excelReader.setCellData(xlfile, "Sheet1", 189, 9, resFail);
			    	 return false;
			     }
			 }
			 
			
			 
			 
			 
			 public static boolean checkCancelInAlertDeleteDashboardInSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardConfirmationMessageCancelBtn));
				 
				 dashBoardConfirmationMessageCancelBtn.click();
				 
				 Thread.sleep(3000);
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
				 	
				 selectdashBoardBtn.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirst)); 		 
			
					 
				 if(dashBoardFirst.getText().equalsIgnoreCase("Graph") && 
				 		 dashBoardSecond.getText().equalsIgnoreCase("Graph with Active and setAsDefault"))
				 {
					selectdashBoardBtn.click();
				 	excelReader.setCellData(xlfile, "Sheet1", 190, 9, resPass);
				 	return true;
				 }
				 else
				 {
					selectdashBoardBtn.click();
					excelReader.setCellData(xlfile, "Sheet1", 190, 9, resFail);
					return false;
				 }
			 }
			 
			 
			 public static boolean checkDeleteAfterClickOnCancelInAlertSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
				 	
				 selectdashBoardBtn.click();
					 	 
				 Thread.sleep(3000);
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirstDeleteBtn));
				 
				 dashBoardFirstDeleteBtn.click();
				 
				 Thread.sleep(3000);
				 
                 String getDashboardMsg="Are you sure to delete this Dashboard ?";
				  
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardConfirmationMessage));
				
				 String getDeleteDashboardMessage=dashBoardConfirmationMessage.getText();
				 
			     if(getDeleteDashboardMessage.equalsIgnoreCase(getDashboardMsg))
			     {
			    	 excelReader.setCellData(xlfile, "Sheet1", 191, 9, resPass);
			    	 return true;
			     }
			     else
			     {
			    	 excelReader.setCellData(xlfile, "Sheet1", 191, 9, resFail);
			    	 return false;
			     }
			 }
			 
			 
			 
			 public static boolean checkOkBtnInAlertDeleteAfterClickOnCancelInAlertSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			 {
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 

		         Thread.sleep(2000);
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardConfirmationMessageOkBtn));
				 
				 dashBoardConfirmationMessageOkBtn.click();
				 
				 
				 
				 System.out.println("validationDashboardMessageAtBotton"+validationDashboardMessageAtBotton.getText());
				 
				 if(validationDashboardMessageAtBotton.getText().equalsIgnoreCase("Dashboard deleted Successfully"))
					{
						excelReader.setCellData(xlfile, "Sheet1", 192, 9, resPass);
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 192, 9, resFail);
						return false;
					}

			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 public static boolean checkDeleteDashboardInSelectDashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {

				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
					 	
					 selectdashBoardBtn.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirst)); 	
					 
					 System.out.println("dashBoardFirst.getText()"+ dashBoardFirst.getText());
					 
					 if(dashBoardFirst.getText().equalsIgnoreCase("Graph with Active and setAsDefault"))
					 {
						selectdashBoardBtn.click();
					 	excelReader.setCellData(xlfile, "Sheet1", 193, 9, resPass);
					 	return true;
					 }
					 else
					 {
						selectdashBoardBtn.click();
						excelReader.setCellData(xlfile, "Sheet1", 193, 9, resFail);
						return false;
					 }
				}
			 

			 public static boolean checkInActiveDashboardsInNewDashboardComboBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {

				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newDashBoard));
					 	
					 newDashBoard.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardName)); 	
					 					 
					 String Strq= dashBoardName.getText();
						
					 boolean getDashboardValue=false;
					 String[] str= Strq.split("\n");     
				     for(String st1 : str)
				     {
				    	
				    	  st1.equals("setAsDefaultOnly");
				    	  getDashboardValue=true;
				    	  break;
				     }
					 
				     boolean getDashboardV=false;
					 String[] stq= Strq.split("\n");     
				     for(String st1 : stq)
				     {
				    	
				    	  st1.equals("Graph with No Active And SetAsDefault");
				    	  getDashboardV=true;
				    	  break;
				     }
					 
					 if(getDashboardV==true && getDashboardV==true)
					 {
						
					 	excelReader.setCellData(xlfile, "Sheet1", 194, 9, resPass);
					 	return true;
					 }
					 else
					 {
						
						excelReader.setCellData(xlfile, "Sheet1", 194, 9, resFail);
						return false;
					 }
				} 
			 
			 
			 
			 
			
			 
			 public static boolean checkCustomizationWithOutSelectingDashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {

				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeBtn));
					 	
					 dashBoardCustomizeBtn.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationPleaseSelectanyDashboardMessage));
					 
					 if(validationPleaseSelectanyDashboardMessage.getText().equalsIgnoreCase("Please Select any Dashboard"))
					 {
						
					 	excelReader.setCellData(xlfile, "Sheet1", 194, 9, resPass);
					 	return true;
					 }
					 else
					 {
						
						excelReader.setCellData(xlfile, "Sheet1", 194, 9, resFail);
						return false;
					 }
				} 
			 
			 
			 
			 public static boolean checkCustomizationWithSelectingDashboard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {

				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
					 	
					 selectdashBoardBtn.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirst)); 	
					
					 dashBoardFirst.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeBtn));
					 	
					 dashBoardCustomizeBtn.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeSearch));
					 
					 if(dashBoardCustomizeSearch.isDisplayed() && dashBoardCustomizeGraph.isDisplayed() && 
							 dashBoardCustomizeReport.isDisplayed() && dashBoardCustomizeInfoPanel.isDisplayed() &&
							 dashBoardCustomizeInfoWorkFlow.isDisplayed())
					 {
						
					 	excelReader.setCellData(xlfile, "Sheet1", 195, 9, resPass);
					 	return true;
					 }
					 else
					 {
						
						excelReader.setCellData(xlfile, "Sheet1", 195, 9, resFail);
						return false;
					 }
				} 
				


			 
			 
		public static boolean checkGraphOptionsInCustomizeDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			
			     excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
				 
				 
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraph));
				 	
				 dashBoardCustomizeGraph.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphNewGraph));
				 
				 if(dashBoardCustomizeGraphNewGraph.isDisplayed())
				 {
				 	excelReader.setCellData(xlfile, "Sheet1", 196, 9, resPass);
				 	return true;
				 }
				 else
				 {
					excelReader.setCellData(xlfile, "Sheet1", 196, 9, resFail);
					return false;
				 }
			
		}
			 
		 
			public static boolean checkReportOptionsinCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeReport));
					 	
					 dashBoardCustomizeReport.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeReportNewReport));
					 
					 if(dashBoardCustomizeReportNewReport.isDisplayed())
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 197, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 197, 9, resFail);
						return false;
					 }
				
			}
			 
			 
			public static boolean checkInfoPanelOptionsinCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanel));
					 	
					 dashBoardCustomizeInfoPanel.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfopanelNewInfopanel));
					 
					 if(dashBoardCustomizeInfopanelNewInfopanel.isDisplayed())
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 198, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 198, 9, resFail);
						return false;
					 }
				
			 }
			 
			
			
			public static boolean checkWorkFlowOptionsinCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoWorkFlow));
					 	
					 dashBoardCustomizeInfoWorkFlow.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeWorkFlow_NewWorkflow));
					 
					 if(dashBoardCustomizeWorkFlow_NewWorkflow.isDisplayed())
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 199, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 199, 9, resFail);
						return false;
					 }
				
			}
			
			
			
			public static boolean checkDefineGraphDefinitionOptionsinCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraph));
					 	
					 dashBoardCustomizeGraph.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphNewGraph));
					 	
					 dashBoardCustomizeGraphNewGraph.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefTab));
					 
					 if(dashBoardCustomizeGraphDefTab.isDisplayed() && dashBoardCustomizeGraphDefName.isDisplayed() &&
							 dashBoardCustomizeGraphDefShowAs.isDisplayed() && dashBoardCustomizeGraphDefDisplaySummaryCheckBox.isDisplayed() &&
							 dashBoardCustomizeGraphDefIncludeDropdown.isDisplayed() && dashBoardCustomizeGraphDefIncludeValueTxtbox.isDisplayed() &&
							 dashBoardCustomizeGraphDefIncludeTypeDropdown.isDisplayed() && dashBoardCustomizeGraphDefSeriesName.isDisplayed() &&
							 dashBoardCustomizeGraphDefDataSetDropdown.isDisplayed() && dashBoardCustomizeGraphAddBtnImg.isDisplayed() &&
							 dashBoardCustomizeGraphDeleteBtnImg.isDisplayed() && dashBoardCustomizeGraphDefValueDropdown.isDisplayed() &&
							 dashBoardCustomizeGraphDefPeriodDropdown.isDisplayed() && dashBoardCustomizeGraphDefFliterBtn.isDisplayed() &&
							 dashBoardCustomizeGraphDefSummary.isDisplayed()&& dashBoardCustomizeGraphDefXAxis.isDisplayed()  &&
							 dashBoardCustomizeGraphProperties.isDisplayed() && dashBoardCustomizeGraphMaximizedView.isDisplayed() &&
							 dashBoardCustomizeGraphDefSave.isDisplayed() && dashBoardCustomizeGraphDefCancel.isDisplayed())
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 200, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 200, 9, resFail);
						return false;
					 }
				
			}
			
			
			public static boolean checkDefineGraphPropertiesOptionsinCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphProperties));
					 	
					 dashBoardCustomizeGraphProperties.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphPropertiesGraphTypeDropdown));
					 
					 if(dashBoardCustomizeGraphPropertiesGraphTypeDropdown.isDisplayed()  &&
							 dashBoardCustomizeGraphPropertiesThemeDropdown.isDisplayed() && 
							 dashBoardCustomizeGraphPropertiesLegendPositionDropdown.isDisplayed() &&
							 dashBoardCustomizeGraphPropertiesZoomCheckbox.isDisplayed())
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 201, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 201, 9, resFail);
						return false;
					 }
				
			}
			
			public static boolean checkDefineMaximizedOptionsinCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphMaximizedView));
					 	
					 dashBoardCustomizeGraphMaximizedView.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphMaximizedViewDisplayCombobox));
					 
					 if(dashBoardCustomizeGraphMaximizedViewDisplayCombobox.isDisplayed()  &&
							 dashBoardCustomizeGraphMaximizedViewDiplayitemSelectedCombobox.isDisplayed() && 
							 dashBoardCustomizeGraphMaximizedViewCustomizeIcon.isDisplayed() &&
							 dashBoardCustomizeGraphMaximizedViewCloseIcon.isDisplayed())
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 202, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 202, 9, resFail);
						return false;
					 }
				
			}
			
			
			public static boolean checkMandatoryFieldsCheckForNameInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefTab));
					 	
					 dashBoardCustomizeGraphDefTab.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSave));
					 	
					 dashBoardCustomizeGraphDefSave.click();
					 
					 Thread.sleep(4000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Enter Graph Name"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 203, 9, resPass);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 203, 9, resFail);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
						return false;
					 }
			  }
			
			
			public static boolean checkMandatoryFieldsCheckForSeriesInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefTab));
					 	
					 dashBoardCustomizeGraphDefTab.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefName));
					 
					 dashBoardCustomizeGraphDefName.sendKeys("Graph Test");
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSave));
					 	
					 dashBoardCustomizeGraphDefSave.click();
					 
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
				
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Enter Series Name"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 204, 9, resPass);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 204, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
						return false;
					 }
			  }
			
			
			
			public static boolean checkSaveInTheDefineGraphInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSeriesName));
					 
					 dashBoardCustomizeGraphDefSeriesName.sendKeys("Series Name Test");
					 
					 Thread.sleep(3000);
					 
					 dashBoardCustomizeGraphDefSeriesName.sendKeys(Keys.TAB);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSave));
					 	
					 dashBoardCustomizeGraphDefSave.click();
					 
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Dashlet Saved Successfully"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 205, 9, resPass);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 205, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
						return false;
					 }
			  }
			
			
			public static boolean checkGraphCreatedInDashletsInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeNewGraphCreated));
				
					 System.out.println("validationDashboardMessageAtBotton"+dashBoardCustomizeNewGraphCreated.getText());
					 
					 if(dashBoardCustomizeNewGraphCreated.isDisplayed() && dashBoardCustomizeNewGraphCreated.getText().equalsIgnoreCase("Graph Test"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 206, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 206, 9, resFail);
						return false;
					 }
			  }
			
			
			public static boolean checkEditGraphCreatedInDashletsInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeNewGraphCreated));
					 
					 dashBoardCustomizeNewGraphCreated.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeEditGraphCreated));
				
					 dashBoardCustomizeEditGraphCreated.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefName));
                     
                     String getGraphName=dashBoardCustomizeGraphDefName.getAttribute("Value");
                     
                     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSeriesName));
                     
                     String getSeriesName=dashBoardCustomizeGraphDefSeriesName.getAttribute("Value");
                     
                     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefTab));
                     
                     
					 if(dashBoardCustomizeGraphDefTab.isDisplayed() && dashBoardCustomizeGraphDefName.isDisplayed() &&
							 dashBoardCustomizeGraphDefShowAs.isDisplayed() && dashBoardCustomizeGraphDefDisplaySummaryCheckBox.isDisplayed() &&
							 dashBoardCustomizeGraphDefIncludeDropdown.isDisplayed() && dashBoardCustomizeGraphDefIncludeValueTxtbox.isDisplayed() &&
							 dashBoardCustomizeGraphDefIncludeTypeDropdown.isDisplayed() && dashBoardCustomizeGraphDefSeriesName.isDisplayed() &&
							 dashBoardCustomizeGraphDefDataSetDropdown.isDisplayed() && dashBoardCustomizeGraphAddBtnImg.isDisplayed() &&
							 dashBoardCustomizeGraphDeleteBtnImg.isDisplayed() && dashBoardCustomizeGraphDefValueDropdown.isDisplayed() &&
							 dashBoardCustomizeGraphDefPeriodDropdown.isDisplayed() && dashBoardCustomizeGraphDefFliterBtn.isDisplayed() &&
							 dashBoardCustomizeGraphDefSummary.isDisplayed()&& dashBoardCustomizeGraphDefXAxis.isDisplayed()  &&
							 dashBoardCustomizeGraphProperties.isDisplayed() && dashBoardCustomizeGraphMaximizedView.isDisplayed() &&
							 dashBoardCustomizeGraphDefSave.isDisplayed() && dashBoardCustomizeGraphDefCancel.isDisplayed() &&
							 getGraphName.equalsIgnoreCase("Graph Test") &&
							 getSeriesName.equalsIgnoreCase("Series Name Test"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 207, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 207, 9, resFail);
						return false;
					 }
			  }
			
			
			public static boolean checkUpdateGraphCreatedInDashletsInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefName));
					 
					 dashBoardCustomizeGraphDefName.click();
					 
					 dashBoardCustomizeGraphDefName.sendKeys("update");
					
                     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSave));
					 	
					 dashBoardCustomizeGraphDefSave.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Dashlet Updated Successfully"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 208, 9, resPass);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 208, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
						return false;
					 }
			  }
			
			
			public static boolean checkUpdatedGraphDisplayInDashletsInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeNewGraphCreated));
					 
					 dashBoardCustomizeNewGraphCreated.click();
					 
					 System.out.println("validationDashboardMessageAtBotton"+dashBoardCustomizeNewGraphCreated.getText());
					 
					 if(dashBoardCustomizeNewGraphCreated.isDisplayed() && dashBoardCustomizeNewGraphCreated.getText().equalsIgnoreCase("Graph Testupdate"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 209, 9, resPass);
					 	return true;
					 }
					 else
					 {
						 excelReader.setCellData(xlfile, "Sheet1", 209, 9, resFail);
						 return false;
					 }
			  }
			
			
			public static boolean checkDeleteGraphCreatedInDashletsInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDeleteGraphCreated));
					 
					 dashBoardCustomizeDeleteGraphCreated.click();
					 
					 Thread.sleep(4000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDeleteTheDashletMessage));
					 
					 System.out.println("dashBoardCustomizeDeleteTheDashletMessage"+dashBoardCustomizeDeleteTheDashletMessage.getText());
					 
					 if(dashBoardCustomizeDeleteTheDashletMessage.getText().equalsIgnoreCase("Are you sure that you want to delete dashlet ?"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 210, 9, resPass);
					 	return true;
					 }
					 else
					 {
						 excelReader.setCellData(xlfile, "Sheet1", 210, 9, resFail);
						 return false;
					 }
			  }
			
			
			public static boolean checkNoBtnInDeleteConfirmationMessagGraphCreatedInDashletsInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDeleteDashletNoBtn));
					 
					 dashBoardCustomizeDeleteDashletNoBtn.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeNewGraphCreated));
					 
                      System.out.println("dashBoardCustomizeNewGraphCreated"+dashBoardCustomizeNewGraphCreated.getText());
					 
					 if(dashBoardCustomizeNewGraphCreated.isDisplayed() && dashBoardCustomizeNewGraphCreated.getText().equalsIgnoreCase("Graph Testupdate"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 211, 9, resPass);
					 	return true;
					 }
					 else
					 {
						 excelReader.setCellData(xlfile, "Sheet1", 211, 9, resFail);
						 return false;
					 }
			  }
			
			
			public static boolean checkDeleteAfterClickOnNoGraphCreatedInDashletsInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	

					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeNewGraphCreated));
					 
					 dashBoardCustomizeNewGraphCreated.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDeleteGraphCreated));
					 
					 dashBoardCustomizeDeleteGraphCreated.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDeleteTheDashletMessage));
					 
					 System.out.println("dashBoardCustomizeDeleteTheDashletMessage"+dashBoardCustomizeDeleteTheDashletMessage.getText());
					 
					 if(dashBoardCustomizeDeleteTheDashletMessage.getText().equalsIgnoreCase("Are you sure that you want to delete dashlet ?"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 212, 9, resPass);
					 	return true;
					 }
					 else
					 {
						 excelReader.setCellData(xlfile, "Sheet1", 212, 9, resFail);
						 return false;
					 }
			  }
			
			
			public static boolean checkYesBtnInDeleteConfirmationMessagGraphCreatedInDashletsInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDeleteDasletYesBtn));
					 
					 dashBoardCustomizeDeleteDasletYesBtn.click();
					 
                     System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
 					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Dashlet Deleted Successfully"))
 					 {
 					 	excelReader.setCellData(xlfile, "Sheet1", 213, 9, resPass);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
 					    return true;
 					 }
 					 else
 					 {
					    excelReader.setCellData(xlfile, "Sheet1", 213, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					 }
			  }
			
			
			
		
			
			public static boolean checkCreateNewGraphCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphNewGraph));
					 	
					 dashBoardCustomizeGraphNewGraph.click();
					 
					 Thread.sleep(2000);
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefTab));
					 
					 if(dashBoardCustomizeGraphDefTab.isDisplayed() && dashBoardCustomizeGraphDefName.isDisplayed() &&
							 dashBoardCustomizeGraphDefShowAs.isDisplayed() && dashBoardCustomizeGraphDefDisplaySummaryCheckBox.isDisplayed() &&
							 dashBoardCustomizeGraphDefIncludeDropdown.isDisplayed() && dashBoardCustomizeGraphDefIncludeValueTxtbox.isDisplayed() &&
							 dashBoardCustomizeGraphDefIncludeTypeDropdown.isDisplayed() && dashBoardCustomizeGraphDefSeriesName.isDisplayed() &&
							 dashBoardCustomizeGraphDefDataSetDropdown.isDisplayed() && dashBoardCustomizeGraphAddBtnImg.isDisplayed() &&
							 dashBoardCustomizeGraphDeleteBtnImg.isDisplayed() && dashBoardCustomizeGraphDefValueDropdown.isDisplayed() &&
							 dashBoardCustomizeGraphDefPeriodDropdown.isDisplayed() && dashBoardCustomizeGraphDefFliterBtn.isDisplayed() &&
							 dashBoardCustomizeGraphDefSummary.isDisplayed()&& dashBoardCustomizeGraphDefXAxis.isDisplayed()  &&
							 dashBoardCustomizeGraphProperties.isDisplayed() && dashBoardCustomizeGraphMaximizedView.isDisplayed() &&
							 dashBoardCustomizeGraphDefSave.isDisplayed() && dashBoardCustomizeGraphDefCancel.isDisplayed())
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 214, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 214, 9, resFail);
						return false;
					 }
			
			}
			
			
			
			public static boolean checkSaveNewGraphAffterDelete() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
                      getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefName));
 					 
					 dashBoardCustomizeGraphDefName.sendKeys("Graph New Test");
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSeriesName));
					 
					 dashBoardCustomizeGraphDefSeriesName.sendKeys("Series Name Test");
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSave));
					 	
					 dashBoardCustomizeGraphDefSave.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Dashlet Saved Successfully"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 215, 9, resPass);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
			
						 excelReader.setCellData(xlfile, "Sheet1", 215, 9, resFail);
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						 ErrorMessageCloseBtn.click();
						 return false;
					 }
			}
			
			
			
			
			
			public static boolean checkNewGraphAfterDeletingInCreatedashlet() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraph));
					 	
					 dashBoardCustomizeGraph.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeNewGraphCreated));
				
					 System.out.println("validationDashboardMessageAtBotton"+dashBoardCustomizeNewGraphCreated.getText());
					 
					 if(dashBoardCustomizeNewGraphCreated.isDisplayed() && dashBoardCustomizeNewGraphCreated.getText().equalsIgnoreCase("Graph New Test"))
					 {
						dashBoardCustomizeNewGraphCreated.click();
					 	excelReader.setCellData(xlfile, "Sheet1", 216, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 216, 9, resFail);
						return false;
					 }
			  }
			
			
			public static boolean checkDragAndDropGraphAfterDeletingInCreatedashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraph));
					 	
					 dashBoardCustomizeGraph.click();
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCreatedNewGraph));	
					 
					 dashBoardCreatedNewGraph.click();
					 
                     Actions builder = new Actions(getDriver());
					 
					 Action dragAndDrop = builder.clickAndHold(dashBoardGraphNewFromDrag).build();
					  
					 dragAndDrop.perform();
								 
					 builder.dragAndDropBy(dashBoardGraphNewToDrag, -400,-200).build().perform();
					 
					 Thread.sleep(10000);
					 
					 
					 Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\graphDashlet.exe");
					 
					 
					 Thread.sleep(4909);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDashSave));
					 
					 dashBoardCustomizeDashSave.click();		 
	
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 String getDashboardConfirmationMsg=dashboardValidationAndConfirmationMessage.getAttribute("Value");
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
					 System.out.println("getDashboardConfirmationMsg"+getDashboardConfirmationMsg);
					   
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Dashboard Layout Saved Successfully."))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 217, 9, resPass);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 217, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					 }
			  }
			
			
			
			public static boolean checkDashletGraphCreatedInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDashletGraph));

					 System.out.println(dashBoardCustomizeDashletGraph.getText());
					
					 if(dashBoardCustomizeDashletGraph.getText().equalsIgnoreCase("Graph New Test"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 218, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 218, 9, resFail);
						return false;
					 }
				
			}
			
				
			
			
			
			public static boolean checkNewReportOptionsOptionsinCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
					 	
					 selectdashBoardBtn.click();				
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirst));
					 	
					 dashBoardFirst.click();
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeBtn));
					 
					 dashBoardCustomizeBtn.click();
					 
					 Thread.sleep(3000);
					 					  
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeReport));
					 	
					 dashBoardCustomizeReport.click();
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeReportNewReport));
					 
					 dashBoardCustomizeReportNewReport.click();
					
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeReportReportName));
					 
					 if(dashBoardCustomizeReport_ReportDef.isDisplayed() && dashBoardCustomizeReportReportName.isDisplayed() &&
							 dashBoardCustomizeReportCaptionText.isDisplayed() && dashBoardCustomizeReportReportRadioBtn.isDisplayed() &&
							 dashBoardCustomizeReportGraphRadioBtn.isDisplayed() && dashBoardCustomizeGraphDefSave.isDisplayed() 
							 && dashBoardCustomizeGraphDefCancel.isDisplayed())
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 219, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 219, 9, resFail);
						return false;
					 }
				
			}
			
			
			


			public static boolean checkListofReportsForReportNameInNewReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeReportReportName));
					 
					 //Finding the Count of the Calender Type
					 Select oSelect = new Select(dashBoardCustomizeReportReportName);
					 List <WebElement> elementCount = oSelect.getOptions();
					
					 int iSize = elementCount.size();
					 System.out.println("dashBoardCustomizeReportReportName Count :"+iSize);
					 	
		
					 if(iSize==213)
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 220, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 220, 9, resFail);
						return false;
					 }
				
			}
			
			
			
			
			
			
			public static boolean checkMandatoryFieldsInNewReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeReportSave));
					 	
					 dashBoardCustomizeReportSave.click();
					 
					 
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
				
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Select Report"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 221, 9, resPass);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 221, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					 }
				
			}
			
			
			public static boolean checkSelectedReportNameInReportNameOptionIsSelected() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeReportReportName));
					 	
					 dashBoardCustomizeReportReportName.sendKeys("Ledger");
					 
					 Thread.sleep(2000);
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeReportCaptionText));
					 
					 getAction().moveToElement(dashBoardCustomizeReportReportName).sendKeys(Keys.TAB).build().perform();
					 
					 if(inputMasterCombobox.isDisplayed() && searchMasterCombobox.isDisplayed() && inputReportsSettings.isDisplayed())
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 222, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 222, 9, resFail);
						return false;
					 }
			}
			
			
			
			
			
			
			
			
			
			
			
			
			public static boolean checkSearchMasterInReportNameOptionIsSelected() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMasterCombobox));
					 	
					 searchMasterCombobox.sendKeys("Customer C");
					 
					 getAction().moveToElement(dashBoardCustomizeReportReportName).sendKeys(Keys.ENTER).build().perform();
					 
					 Thread.sleep(2000);
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameMasterSearchCombobox));
	 
					 if(nameMasterSearchCombobox.getText().equalsIgnoreCase("Customer C"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 223, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 223, 9, resFail);
						return false;
					 }
			}
			
			
			
			public static boolean checkSaveNewReportWithoutSelectingMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSave));
					 
                     dashBoardCustomizeGraphDefSave.click();
					 
                     
                     
                     
                     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
                     
					 //getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeMessageAtBottom));
					 
					 
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
				
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Select Record"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 224, 9, resPass);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 224, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					 }
			}
			
			
			public static boolean checkInputMasterInReportNameOptionIsSelected() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputMasterCombobox));
					 	
					 inputMasterCombobox.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputMasterCombobox));
					 
					 inputMasterCombobox.sendKeys("C");
					 
					 Thread.sleep(2000);
					 
					 getAction().moveToElement(inputMasterCombobox).sendKeys(Keys.BACK_SPACE).build().perform();
					 
					 inputMasterCombobox.sendKeys("Customer C");
					 
					 getAction().moveToElement(inputMasterCombobox).sendKeys(Keys.TAB).build().perform();
					 
					 Thread.sleep(2000);
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameMasterInputCombobox));

					 System.out.println("nameMasterInputCombobox"+nameMasterInputCombobox.getAttribute("value"));
					 
					 System.out.println("nameMasterInputCombobox"+nameMasterInputCombobox.getText());
					 
					 if(nameMasterInputCombobox.getText().equalsIgnoreCase("Customer C"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 225, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 225, 9, resFail);
						return false;
					 }
			}
			
			
			
			
			public static boolean checkSaveReportName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSave));
					 	
					 dashBoardCustomizeGraphDefSave.click();
					 
			         getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Dashlet Saved Successfully"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 226, 9, resPass);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 226, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					 }
			}
			
			
			public static boolean checkCreatNewReportNameInDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReportNameDisplayInCreateDashlet));
					 
					 newReportNameDisplayInCreateDashlet.click();
					 					 
					 System.out.println("newReportNameDisplayInCreateDashlet"+newReportNameDisplayInCreateDashlet.getText());
				
					 System.out.println("newReportNameDisplayInCreateDashlet"+newReportNameDisplayInCreateDashlet.getAttribute("Value"));
					 
					 if(newReportNameDisplayInCreateDashlet.getText().equalsIgnoreCase("Ledger"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 227, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 227, 9, resFail);
						return false;
					 }
			}
			
			
			
			
			public static boolean checkDragAndDropReportAfterDeletingInCreatedashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newReportNameDisplayInCreateDashlet));	
					 
					 newReportNameDisplayInCreateDashlet.click();
					 					 
                     Actions builder = new Actions(getDriver());
					 
					 Action dragAndDrop = builder.clickAndHold(newReportNameDisplayInCreateDashlet) 
					  
					 .build();
					  
					 dragAndDrop.perform();
								 
					 builder.dragAndDropBy(dashBoardGraphNewToDrag, -300,-100).build().perform();
					 
					 Thread.sleep(5000);
					 
					 Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\reportDashlet.exe");
					 
					 Thread.sleep(5000);
					 
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDashSave));
					 
					 dashBoardCustomizeDashSave.click();		 
	
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 String getDashboardConfirmationMsg=dashboardValidationAndConfirmationMessage.getText();
					 
					 System.out.println("getDashboardConfirmationMsg"+getDashboardConfirmationMsg);
					  
					 if(ErrorMessageCloseBtn.isDisplayed())
					 {
					
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						 //here for temporary reasons error message close button in not working so implemented time to wait
						 Thread.sleep(9000);
						 
					 }
					 
					 if(getDashboardConfirmationMsg.equalsIgnoreCase("Dashboard Layout Saved Successfully."))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 228, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 228, 9, resFail);
						return false;
					 }
			  }
			
			
			
			public static boolean checkDashletNewReportCreatedInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDashlNewReport));

					 System.out.println(dashBoardCustomizeDashlNewReport.getText());
					
					 getDriver().navigate().refresh();
					 
					 Thread.sleep(3000);
					 
					 if(dashBoardCustomizeDashlNewReport.getText().equalsIgnoreCase("Ledger"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 229, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 229, 9, resFail);
						return false;
					 }
				
			}
			
			
			
			
			
			public static boolean checkNewInfoPanelOptionsOptionsinCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
					 	
					 selectdashBoardBtn.click();				 
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirst));
					 	
					 dashBoardFirst.click();
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeBtn));
					 
					 dashBoardCustomizeBtn.click();
					 
					 Thread.sleep(3000);
					 					  
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanel));
					 	
					 dashBoardCustomizeInfoPanel.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfopanelNewInfopanel));
					 
					 dashBoardCustomizeInfopanelNewInfopanel.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelDef));
					 
					 if(dashBoardCustomizeInfoPanelDef.isDisplayed() && dashBoardCustomizeInfoPanelDefNameText.isDisplayed() &&
							 dashBoardCustomizeInfoPanelDefInfoTypeDropdown.isDisplayed() && dashBoardCustomizeInfoPaneDefAddIcon.isDisplayed() &&
							 dashBoardCustomizeInfoPanelDefFirstGridVariable.isDisplayed() && dashBoardCustomizeInfoPanelDefFirstGridCaption.isDisplayed() &&
							 dashBoardCustomizeInfoPanelDefFirstGridPeriod.isDisplayed() && dashBoardCustomizeInfoPanelDefFirstGridDeleteIcon.isDisplayed() &&
							 dashBoardCustomizeInfoPanelDefFirstGridFilterIcon.isDisplayed() && dashBoardCustomizeInfoPanelSaveBtn.isDisplayed() &&
							 dashBoardCustomizeInfoPanelCancelBtn.isDisplayed() && dashBoardCustomizeInfoPanelProperties.isDisplayed() &&
							 dashBoardCustomizeInfoPanelMaximizedView.isDisplayed())
					 {

						    excelReader.setCellData(xlfile, "Sheet1", 230, 9, resPass); 
						 	return true;
								 
					 }
					 else
					 {
							excelReader.setCellData(xlfile, "Sheet1", 230, 9, resFail);
							return false;
					 }
									 
			}
			
			
			public static boolean checkPropertiesTabOptionsOptionsinCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
				
					  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelProperties));
					  dashBoardCustomizeInfoPanelProperties.click();

					  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelPropertiesPalette));
					    if(dashBoardCustomizeInfoPanelPropertiesPalette.isDisplayed() && dashBoardCustomizeInfoPanelPropertiesBackGround.isDisplayed())
					    {
					   
						    excelReader.setCellData(xlfile, "Sheet1", 231, 9, resPass); 
						 	return true;
								 
					 }
					 else
					 {
							excelReader.setCellData(xlfile, "Sheet1", 231, 9, resFail);
							return false;
					 }   			
			
			}
			
			
			
			
			public static boolean checkMaximizedTabOptionsOptionsinCustomizeDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelMaximizedView));
					 dashBoardCustomizeInfoPanelMaximizedView.click();
					 
					 Thread.sleep(9000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelMaximizedViewDisplay));
					 
						 if(dashBoardCustomizeInfoPanelMaximizedViewDisplay.isDisplayed() && dashBoardCustomizeInfoPanelMaximizedViewDiplayitemSelected.isDisplayed() &&
								 dashBoardCustomizeInfoPanelMaximizedViewCustomizeIcon.isDisplayed() && dashBoardCustomizeInfoPanelMaximizedViewCloseIcon.isDisplayed())
						 {		 
						 
						    excelReader.setCellData(xlfile, "Sheet1", 232, 9, resPass); 
						 	return true;
								 
						 }
						 else
						 {
								excelReader.setCellData(xlfile, "Sheet1", 232, 9, resFail);
								return false;
						 }
										 
			}
			
			
			
			
			
			public static boolean checkMandatoryFieldsInNewInfoPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelDef));
					 	
					 dashBoardCustomizeInfoPanelDef.click();
					 
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelSaveBtn));
					 	
					 dashBoardCustomizeInfoPanelSaveBtn.click();
					 
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
				
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Enter InfoPanel Name"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 233, 9, resPass);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 233, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					 }
				
			}
			
			
			
			public static boolean checkMandatoryFieldsVariableInNewInfoPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelDefNameText));
					 	
					 dashBoardCustomizeInfoPanelDefNameText.sendKeys("Test Info Panel");
					 
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelSaveBtn));
					 	
					 dashBoardCustomizeInfoPanelSaveBtn.click();
					 
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
				
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Select Variable Name"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 234, 9, resPass);
					 	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					 	ErrorMessageCloseBtn.click();
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 234, 9, resFail);
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
						ErrorMessageCloseBtn.click();
						return false;
					 }
				
			}
			
			
			public static boolean checkInfoTypeComboBoxValues() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				 excelReader=new ExcelReader(POJOUtility.getExcelPath());
				 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelDefInfoTypeDropdown));
				 
				 Select oSelect = new Select(dashBoardCustomizeInfoPanelDefInfoTypeDropdown);
				 
				 List <WebElement> elementCount = oSelect.getOptions();
				
				 int iSize = elementCount.size();
				 System.out.println("InfoType Count :"+iSize);
				 
				 String Strq= dashBoardCustomizeInfoPanelDefInfoTypeDropdown.getText();
					
				 boolean getInfoTypeValue=false;
				 String[] str= Strq.split("\n");     
			     for(String st1 : str)
			     {
			    	
			    	  st1.equals("Standard value");
			    	  getInfoTypeValue=true;
			    	  break;
			     }
			     	
			
				 
				 if(iSize==3 && getInfoTypeValue==true)
				 {
					 
					 excelReader.setCellData(xlfile, "Sheet1", 235, 9, resPass);
					 return true;
				 }
				 else
				 {
					 
					 
					 excelReader.setCellData(xlfile, "Sheet1", 235, 9, resFail);
					 return false;
				 }
			      
			}
			
			
			public static boolean checkInfoTypeOptionAsDefine() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelDefInfoTypeDropdown));
					 dashBoardCustomizeInfoPanelDefInfoTypeDropdown.click();
					 
					 dashBoardCustomizeInfoPanelDefInfoTypeDropdown.sendKeys("Define");
					 
					 
					 getAction().moveToElement(dashBoardCustomizeInfoPanelDefInfoTypeDropdown).sendKeys(Keys.ENTER).perform();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelDef_InfoType_DefineCaption));
					 
						 if(infoPanelDef_InfoType_DefineCaption.isDisplayed() && infoPanelDef_InfoType_DefineDataSetDropDown.isDisplayed() &&
								 infoPanelDef_InfoType_DefineValueDropdown.isDisplayed() && infoPanelDef_InfoType_DefineSummaryDropdown.isDisplayed() &&
								 infoPanelDef_InfoType_DefinePeriodDropdown.isDisplayed())
						 {		 
						 
						    excelReader.setCellData(xlfile, "Sheet1", 236, 9, resPass); 
						 	return true;
								 
						 }
						 else
						 {
								excelReader.setCellData(xlfile, "Sheet1", 236, 9, resFail);
								return false;
						 }
										 
			}
			
			
			
			
			
			public static boolean checkInfoTypeOptionAsQuery() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelDefInfoTypeDropdown));
					 dashBoardCustomizeInfoPanelDefInfoTypeDropdown.click();
					 
					 dashBoardCustomizeInfoPanelDefInfoTypeDropdown.sendKeys("Query");					 
					 getAction().moveToElement(dashBoardCustomizeInfoPanelDefInfoTypeDropdown).sendKeys(Keys.ENTER).perform();
					 
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanelDef_InfoType_QueryCaption1Textbox));
					 
						 if(infoPanelDef_InfoType_QueryCaption1Textbox.isDisplayed() && infoPanelDef_InfoType_QueryPeriod1Dropdown.isDisplayed() &&
								 infoPanelDef_InfoType_QueryDecrption1TxtBox.isDisplayed() && infoPanelDef_InfoType_QueryValue1Dropdown.isDisplayed() &&
								 infoPanelDef_InfoType_QueryValue1Dropdown.isDisplayed() && infoPanelDef_InfoType_QueryAddBtn.isDisplayed() &&
								 infoPanelDef_InfoType_QueryDelete1Btn.isDisplayed())
						 {		 

						    excelReader.setCellData(xlfile, "Sheet1", 237, 9, resPass); 
						 	return true;
								 
						 }
						 else
						 {
								excelReader.setCellData(xlfile, "Sheet1", 237, 9, resFail);
								return false;
						 }
										 
			}
			
			
			public static boolean checkInfoTypeOptionWithVariableInStandardValue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelDefInfoTypeDropdown));
					 dashBoardCustomizeInfoPanelDefInfoTypeDropdown.click();
					 
					 dashBoardCustomizeInfoPanelDefInfoTypeDropdown.sendKeys("Standard value");
					
					 
					 getAction().moveToElement(dashBoardCustomizeInfoPanelDefInfoTypeDropdown).sendKeys(Keys.ENTER).perform();
					 
					 Select oSelect = new Select(dashBoardCustomizeInfoPanelDefFirstGridVariable);
					 
					 List <WebElement> elementCount = oSelect.getOptions();
					
					 int iSize = elementCount.size();
					 System.out.println("InfoType Count :"+iSize);
					 
					 String Strq= dashBoardCustomizeInfoPanelDefFirstGridVariable.getText();
						
					 boolean getInfoTypeValue=false;
					 String[] str= Strq.split("\n");     
				     for(String st1 : str)
				     {
				    	
				    	  st1.equals("None");
				    	  getInfoTypeValue=true;
				    	  break;
				     }
				     	
				
					 
					 if(iSize==86 && getInfoTypeValue==true)
					 {
						 
						 excelReader.setCellData(xlfile, "Sheet1", 238, 9, resPass);
						 return true;
					 }
					 else
					 {
						 
						 
						 excelReader.setCellData(xlfile, "Sheet1", 238, 9, resFail);
						 return false;
					 }
										 
			}
			
			public static boolean checkSaveInfoPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanelDefFirstGridVariable));
					 dashBoardCustomizeInfoPanelDefFirstGridVariable.click();
					 
					 dashBoardCustomizeInfoPanelDefFirstGridVariable.sendKeys("Qty Issue");
					 
					 getAction().moveToElement(dashBoardCustomizeInfoPanelDefFirstGridVariable).sendKeys(Keys.ENTER).perform();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeGraphDefSave));
					 	
					 dashBoardCustomizeGraphDefSave.click();
					 
			         getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
	
					 
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Dashlet Saved Successfully"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 239, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 239, 9, resFail);
						return false;
					 }
			}
			
			
			


			public static boolean checkCreatNewInfoPanelNameInDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					  
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanel_SelectingFirst));
					 
					 infoPanel_SelectingFirst.click();
					 
					 System.out.println("infoPanel_SelectingFirst"+infoPanel_SelectingFirst.getText());
				
					 System.out.println("infoPanel_SelectingFirst"+infoPanel_SelectingFirst.getAttribute("Value"));
					 
					 if(infoPanel_SelectingFirst.getText().equalsIgnoreCase("Test Info Panel"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 240, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 240, 9, resFail);
						return false;
					 }
			}
			
			
			
			
			
			public static boolean checkDragAndDropInfoPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanel_SelectingFirst));	
					 
					 infoPanel_SelectingFirst.click();

                     Actions builder = new Actions(getDriver());
					 
					 Action dragAndDrop = builder.clickAndHold(infoPanel_SelectingFirst) 
					  
					 .build();
					  
					 dragAndDrop.perform();
								 
					 builder.dragAndDropBy(dashBoardGraphNewToDrag, 300,200).build().perform();
					 
					 Thread.sleep(5000);
					 
					 Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\infopanelDashlet.exe");
					 
					 Thread.sleep(5000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDashSave));
					 
					 dashBoardCustomizeDashSave.click();		 
					 
					 
					 //Here commenting the code for close the Error message confirmation
					 /*getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ErrorMessageCloseBtn));
					   ErrorMessageCloseBtn.click();*/
					 
					 Thread.sleep(9000);
	
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 String getDashboardConfirmationMsg=dashboardValidationAndConfirmationMessage.getText();
					 
					 String msgDashboardConfirmation="Dashboard Layout Saved Successfully.";
					 
					 System.out.println("getDashboardConfirmationMsg"+getDashboardConfirmationMsg);
					   
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
					 if(msgDashboardConfirmation.equalsIgnoreCase(getDashboardConfirmationMsg))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 241, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 241, 9, resFail);
						return false;
					 }
			  }
			
			
			
			public static boolean checkInfoPanelCreatedInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardInfoPanel));

					 System.out.println(dashBoardInfoPanel.getText());
					
					 if(dashBoardInfoPanel.getText().equalsIgnoreCase("Test Info Panel"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 242, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 242, 9, resFail);
						return false;
					 }
				
			}
			

/*			
			@FindBy(xpath="//i[@id='i']")
			private static WebElement  selectInfoPanel;
			
			*/
			
			
			
			public static boolean checkDeleteDashboardInfoPanelToAddTestInfoPanelOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectdashBoardBtn));
					 	
					 selectdashBoardBtn.click();				 
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardFirst));
					 	
					 dashBoardFirst.click();
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeBtn));
					 
					 dashBoardCustomizeBtn.click();
					 
					 Thread.sleep(3000);
					 					  
					 if(dashBoardCustomizeInfopanelNewInfopanel.isDisplayed())
					 {
						 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanel_SelectingFirst));	
						 
						 infoPanel_SelectingFirst.click();
						 
					 }
					 else
					 {
						 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeInfoPanel));
						 	
						 dashBoardCustomizeInfoPanel.click();
		
						 Thread.sleep(2000);
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(infoPanel_SelectingFirst));	
						 
						 infoPanel_SelectingFirst.click();
						 
					 }
					 
					
					 
					 
					 
					 
                     

                     Actions builder = new Actions(getDriver());
					 
					 Action dragAndDrop = builder.clickAndHold(infoPanel_SelectingFirst) 
					  
					 .build();
					  
					 dragAndDrop.perform();
					 
                     builder.dragAndDropBy(dashBoardGraphNewToDrag, 300,200).build().perform();
					 
					 Thread.sleep(5000);
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDashSave));
					 
					 dashBoardCustomizeDashSave.click();		 
	
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 String getDashboardConfirmationMsg=dashboardValidationAndConfirmationMessage.getText();
					 
					 String msgDashboardConfirmation="Dashboard Layout Saved Successfully.";
					 
					 System.out.println("getDashboardConfirmationMsg"+getDashboardConfirmationMsg);
		
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 
					 Thread.sleep(5000);
					 
					 if(msgDashboardConfirmation.equalsIgnoreCase(getDashboardConfirmationMsg))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 243, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 243, 9, resFail);
						return false;
					 }
					
				
			}
			
			
			
			
			
			public static boolean checkDeleteOptionIsDisplayInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeBtn));
					 
					 dashBoardCustomizeBtn.click();
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardInfoPanelToDelete));
					 
					 dashBoardInfoPanelToDelete.click();
				
					 getAction().contextClick(dashBoardInfoPanelToDelete).perform();
					 	 
					 if(dashboardInfoPanelDeleteOption.isDisplayed())
					 {
						 	excelReader.setCellData(xlfile, "Sheet1", 244, 9, resPass);
						 	return true;
						 }
						 else
						 {
							excelReader.setCellData(xlfile, "Sheet1", 244, 9, resFail);
							return false;
						 }
					 
					
					
			
			}
			
			

			public static boolean checkMessageDisplayDeleteDashletInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardInfoPanelDeleteOption));
					 
					 dashboardInfoPanelDeleteOption.click();
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardDeleteOptionMessage));    
									 
					 System.out.println("dashboardDeleteOptionMessage"+dashboardDeleteOptionMessage.getAttribute("Value"));
					 
					 System.out.println("dashboardDeleteOptionMessage"+dashboardDeleteOptionMessage.getText());
					 
					 if(dashboardDeleteOptionMessage.getText().equalsIgnoreCase("Are you sure that you want to delete dashlet ?"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 245, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 245, 9, resFail);
						return false;
					 }
					
			
			}
			
			
			public static boolean checkCancelBtnInMessageForDeleteDashletInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardDeleteOptionMessageCancelBtn));
					 
					 dashboardDeleteOptionMessageCancelBtn.click();
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardInfoPanelToDelete));
					 
					 System.out.println("dashBoardInfoPanelToDelete.getText()"+dashBoardInfoPanelToDelete.getText());
					 
					 Thread.sleep(3000);
	
					 if(dashBoardInfoPanelToDelete.getText().equalsIgnoreCase("Test Info Panel"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 246, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 246, 9, resFail);
						return false;
					 }
					
			
			}
			
			
			
			public static boolean checkOkBtnInMessageForDeleteDashletInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
	                 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardInfoPanelToDelete));
					 
					 dashBoardInfoPanelToDelete.click();
				
					 Thread.sleep(3000);
					 
					 
					 getAction().contextClick(dashBoardInfoPanelToDelete).perform();	 
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardInfoPanelDeleteOption));
					 
					 dashboardInfoPanelDeleteOption.click();		
					 
					 Thread.sleep(3000);
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardDeleteOptionMessageOkBtn));
					 
					 dashboardDeleteOptionMessageOkBtn.click();
					 		 
					 Thread.sleep(3000);
					 
					 System.out.println("validationDashboardMessageAtBotton"+dashboardValidationAndConfirmationMessage);
					 
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Dashlet Deleted Successfully"))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 247, 9, resPass);
					 	return true;
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 247, 9, resFail);
						return false;
					 }
			}
			
			
			
			
			
			
			
			public static boolean checkSaveDashboardAfterDeleteDashletAddToDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				     excelReader=new ExcelReader(POJOUtility.getExcelPath());
					 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";	
					 
					 Thread.sleep(8988);
					 
                     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashBoardCustomizeDashSave));
					 
					 dashBoardCustomizeDashSave.click();		 
	
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 String getDashboardConfirmationMsg=dashboardValidationAndConfirmationMessage.getAttribute("Value");
					 
					 System.out.println("getDashboardConfirmationMsg"+getDashboardConfirmationMsg);
					   
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardValidationAndConfirmationMessage));
					 
					 System.out.println("dashboardValidationAndConfirmationMessage"+dashboardValidationAndConfirmationMessage.getText());
					 				 
					 Thread.sleep(9000);
					 
					 if(dashboardValidationAndConfirmationMessage.getText().equalsIgnoreCase("Dashboard Layout Saved Successfully."))
					 {
					 	excelReader.setCellData(xlfile, "Sheet1", 248, 9, resPass);
					 	
					 	  getWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		    			  userNameDisplay.click();
		    			  
		    			  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		    			  logoutOption.click();
		    			 
		    			  boolean verifyFiledsStatus=true;
		    				
		    			  getWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		    				
		    			  if(username.isDisplayed() && password.isDisplayed()&& companyDropDownList.isDisplayed() && signIn.isDisplayed())
		    			  {	
    						excelReader.setCellData(xlfile, "Sheet1", 248, 9, resPass);
    						return true;
		    			  }
		    			  else
		    			  {
    						excelReader.setCellData(xlfile, "Sheet1", 248, 9, resFail);
    						return false;
		    			  }
					 	
					 }
					 else
					 {
						excelReader.setCellData(xlfile, "Sheet1", 248, 9, resFail);
						return false;
					 }
			}
			
			
			
			
			
			
			
		public HPDashboardPage(WebDriver driver)
		{	
			
		PageFactory.initElements(driver, this);
		
		}
			

	
	
	
	
}
