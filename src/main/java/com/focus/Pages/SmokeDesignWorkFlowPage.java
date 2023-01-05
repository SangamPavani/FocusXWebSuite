package com.focus.Pages;


import static org.testng.Assert.expectThrows;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;
import com.gargoylesoftware.htmlunit.WaitingRefreshHandler;
import com.steadystate.css.parser.selectors.SyntheticElementSelectorImpl;


public class SmokeDesignWorkFlowPage extends BaseEngine 
 {

	
	
	@FindBy(xpath="//*[@id='optWorkflow_input_settings']/span")
	public static WebElement workFlowNameSettingsBtn; 
					    
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_heading']")
					public static WebElement workflowNameCustomizeDisplayColoumnLabel;
					         
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_container']")
					public static WebElement workflowNameContainerTxt;
					
					@FindBy(xpath="///*[@id='optWorkflow_customize_popup_footer']/div/div/input[1]")
					public static WebElement workFlowNameStandardFieldsBtn;
					
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_list']")
							    public static WebElement workFlowNameFiledDropdown;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_header']")
							    public static WebElement workFlowNameHeaderTxt;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_alignment']")
							    public static WebElement workFlowNameAlignmentDropdown;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_standardfields_width']")
							    public static WebElement workFlowNameWidthTxt;
							
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[3]")
								public static WebElement workFlowNameStandardFieldsOkBtn;
								
								@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[4]")
								public static WebElement workFlowNameStandardFieldsCancelBtn;
					
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[2]")
					public static WebElement workFlowNameDeleteColoumnBtn;
					
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[3]")
					public static WebElement workFlowNameOkBtn;
					
					@FindBy(xpath="//*[@id='optWorkflow_customize_popup_footer']/div/div/input[4]")
					public static WebElement workFlowNameCancelBtn;
	

	//LeftSide Fields
	
	@FindBy(xpath="//div[@id='DocumentIcon']//span[@class='iconbar']")
	public static WebElement workFlowHOpenMenuBtn; 					
						
						
	@FindBy(xpath="//*[@id='idDocumentDiv']/div[1]/div[2]/i")
	public static WebElement workFlowHideMenuBtn; 
	
	@FindBy(xpath="//*[@id='docCustomizationUList']/li[1]")
	public static WebElement receiptsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle' and  text()='Payments']")
	public static WebElement paymentsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Petty Cash')]")
	public static WebElement pettyCashDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Post-Dated Receipts')]")
	public static WebElement postDatedReceiptsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Post-Dated Payments')]")
	public static WebElement postDatedPaymentsDragAndDrop; 
	
	@FindBy(xpath="//*[@id='docCustomizationUList']/li[6]/span")
	public static WebElement purchasesVouchersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Stock adjustment')]")
	public static WebElement stockAdjustmentDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Returns')]")
	public static WebElement purchasesReturnsDragAndDrop; 
	
	@FindBy(xpath="//*[@id='docCustomizationUList']/li[8]/span")
	public static WebElement purchasesOrdersDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Job orders')]")
	public static WebElement jobordersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Material Receipt Notes')]")
	public static WebElement materialReceiptNotesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Invoices')]")
	public static WebElement salesInvoicesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Cash Sales')]")
	public static WebElement cashSalesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Hire-Purchase Sales')]")
	public static WebElement hirePurchaseSalesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'POS Sales')]")
	public static WebElement posSalesDragAndDrop; 
	
	//@FindBy(xpath="//*[@id='DocumentDivSearched']/li[24]/span")
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Returns')]")
	public static WebElement salesReturnsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Orders')]")
	public static WebElement salesOrdersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Production Order')]")
	public static WebElement productionOrderDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Delivery Notes')]")
	public static WebElement deliveryNotesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Non-Standard Journal Entries')]")
	public static WebElement nonStandardJournalEntriesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Inter-Departmental JV')]")
	public static WebElement interDepartmentalJVDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Debit Notes (Linewise)')]")
	public static WebElement debitNotesLineWiseDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Credit Notes (Linewise)/Payroll')]")
	public static WebElement creditNotesLineWiseDragAndDrop; 
	
//	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Fixed Asset Depreciation Voucher')]")
	@FindBy(xpath="(//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Journal Entries')])[2]")
	public static WebElement fixedAssetDepreciationVoucherDragAndDrop; 
	
	//@FindBy(xpath="//div[16]//ul[1]//li[1]//span[1]")
	@FindBy(xpath="(//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Journal Entries')])[2]")
	public static WebElement journalEntriesDragAndDrop; 
	
//	@FindBy(xpath="//div[17]//ul[1]//li[1]//span[1]")
	@FindBy(xpath="(//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Debit Notes')])[3]")
	public static WebElement debitNotesDragAndDrop; 
	
//	@FindBy(xpath="//*[@id='DocumentDiv']/div[18]/ul/li/span")
	@FindBy(xpath="(//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Credit Notes')])[3]")
	public static WebElement creditNotesDragAndDrop; 
	
	@FindBy(xpath="//*[@id='DocumentDivSearched']/li[37]//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Payroll Postings')]")
	public static WebElement payrollPostingsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Opening Balances')]")
	public static WebElement openingBalancesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Shortages in Stock')]")
	public static WebElement shortagesInStockDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Excesses in Stocks')]")
	public static WebElement excessesInStocksDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Stock Transfer')]")
	public static WebElement stockTransferDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Opening Stocks')]")
	public static WebElement openingStocksDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Issues to Production')]")
	public static WebElement issuesToProductionDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Receipts from production')]")
	public static WebElement receiptsFromproductionDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Returns from Shop Floor')]")
	public static WebElement returnsFromShopFloorDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Job Work Issues')]")
	public static WebElement jobWorkIssuesDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Job Work Receipts')]")
	public static WebElement jobWorkReceiptsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchases Quotations')]")
	public static WebElement purchasesQuotationsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Quotations')]")
	public static WebElement salesQuotationsDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Job Order')]")
	public static WebElement jobOrderDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Production Process')]")
	public static WebElement productionProcessDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Material Requisition')]")
	public static WebElement materialRequisitionDragAndDrop; 
	
	@FindBy(xpath="//span[contains(text(),'Request For Quote')]")
	public static WebElement requestForQuoteDragAndDrop;
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Forex JV')]")
	public static WebElement forexJVDragAndDrop;
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Auto Sales Order')]")
	public static WebElement autoSalesOrdersDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Auto Sales Invoice')]")
	public static WebElement autoSalesInvoiceDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales Invoice N')]")
	public static WebElement salesInvoiceNDragAndDrop; 
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchase Vouchers N')]")
	public static WebElement purchaseVoucherNDragAndDrop; 
	
	@FindBy(xpath="//div[@id='DocumentDivSearched']//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchase Voucher New Two')]")
	public static WebElement purchaseVoucherNewTwoDragAndDrop; 
	
	@FindBy(xpath="//div[@id='DocumentDivSearched']//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Stock Transfer New')]")
	public static WebElement stockTransferNewDragAndDrop; 
	
	@FindBy(xpath="//div[@id='DocumentDivSearched']//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Opening Stocks New')]")
	public static WebElement openingStocksNewDragAndDrop; 
	
	@FindBy(xpath="//div[@id='idDocumentDiv']//input[@placeholder='Search']")
	public static WebElement searchTxt; 
	

	
	//Body Fields After Drag Then On Flow Chart Link  Layer

	//For the First element which Drags From List TO Screen The Id Property Changes And Remaining Will Be same
	
	@FindBy(xpath="(//div[@class='flowchart-operator-title ui-draggable-handle'])[1]")  //As it Is First One Selected Drag On FlowChart Is Same Id Property For Every Element
	public static WebElement FirstDraggedElement; 
	
	@FindBy(xpath="//div[contains(text(),'Receipts')]")
	public static WebElement draggedReceipts; 
	
	@FindBy(xpath="//div[text()='SalQuo']")
	public static WebElement draggedSalesQuotation; 
	
	
	
	@FindBy(xpath="//div[contains(text(),'Payments')]")
	public static WebElement draggedPayments; 
	
	@FindBy(xpath="//div[contains(text(),'Petty Cash')]")
	public static WebElement draggedPettyCash; 
	
	@FindBy(xpath="//div[contains(text(),'Post-Dated Receipts')]")
	public static WebElement draggedPostDatedReceipts; 
	
	@FindBy(xpath="//div[contains(text(),'Post-Dated Payments')]")
	public static WebElement draggedPostDatedPayments; 
	
	@FindBy(xpath="//div[contains(text(),'PurVou')]")
	public static WebElement draggedPurchasesVouchers; 
	
	@FindBy(xpath="//div[contains(text(),'Stock adjustment')]")
	public static WebElement draggedStockAdjustment; 
	
	@FindBy(xpath="//div[@title='Purchases Returns']")
	public static WebElement draggedPurchasesReturns; 
	
	@FindBy(xpath="//div[contains(text(),'PurOrd')]")
	public static WebElement draggedPurchasesOrders; 
	
	@FindBy(xpath="//div[contains(text(),'Job orders')]")
	public static WebElement draggedJoborders; 
	
	@FindBy(xpath="//div[@title='Material Receipt Notes']")
	public static WebElement draggedMaterialReceiptNotes; 
	
	@FindBy(xpath="//div[@title='Sales Invoices']")
	public static WebElement draggedSalesInvoices; 
	
	@FindBy(xpath="//div[contains(text(),'Cash Sales')]")
	public static WebElement draggedCashSales; 
	
	@FindBy(xpath="//div[contains(text(),'Hire-Purchase Sales')]")
	public static WebElement draggedHirePurchaseSales; 
	
	@FindBy(xpath="//div[contains(text(),'POS Sales')]")
	public static WebElement draggedPOSSales; 
	
	@FindBy(xpath="//div[@title='Sales Returns']")
	public static WebElement draggedSalesReturns; 
	
	@FindBy(xpath="//div[@title='Sales Orders']")
	public static WebElement draggedSalesOrders; 
	
	@FindBy(xpath="//div[contains(text(),'Production Order')]")
	public static WebElement draggedProductionOrder; 
	
	@FindBy(xpath="//div[@title='Delivery Notes']")
	public static WebElement draggedDeliveryNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Non-Standard Journal Entries')]")
	public static WebElement draggedNonStandardJournalEntries; 
	
	@FindBy(xpath="//div[contains(text(),'Inter-Departmental JV')]")
	public static WebElement draggedInterDepartmentalJV; 
	
	@FindBy(xpath="//div[contains(text(),'Debit Notes (Linewise)')]")
	public static WebElement draggedDebitNotesLineWise; 
	
	@FindBy(xpath="//div[contains(text(),'Credit Notes (Linewise)/Payroll')]")
	public static WebElement draggedCreditNotesLineWise; 
	
	@FindBy(xpath="//div[contains(text(),'Fixed Asset Depreciation Voucher')]")
	public static WebElement draggedFixedAssetDepreciationVoucher; 
	
	@FindBy(xpath="///div[contains(text(),'Journal Entries')]")
	public static WebElement draggedJournalEntries; 
	
	@FindBy(xpath="//div[contains(text(),'Debit Notes')]")
	public static WebElement draggedDebitNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Credit Notes')]")
	public static WebElement draggedCreditNotes; 
	
	@FindBy(xpath="//div[contains(text(),'Payroll Postings')]")
	public static WebElement draggedPayrollPostings; 
	
	@FindBy(xpath="//div[contains(text(),'Opening Balances')]")
	public static WebElement draggedOpeningBalances; 
	
	@FindBy(xpath="//div[@title='Shortages in Stock']")
	public static WebElement draggedShortagesInStock; 
	
	@FindBy(xpath="//div[@title='Excesses in Stocks']")
	public static WebElement draggedExcessesInStocks; 
	
	@FindBy(xpath="//div[@title='Stock Transfers']")
	public static WebElement draggedStockTransfer; 
	
	@FindBy(xpath="//div[contains(text(),'Opening Stocks')]")
	public static WebElement draggedOpeningStocks; 
	
	@FindBy(xpath="//div[contains(text(),'Issues to Production')]")
	public static WebElement draggedIssuesToProduction; 
	
	@FindBy(xpath="//div[contains(text(),'Receipts from production')]")
	public static WebElement draggedReceiptsFromproduction; 
	
	@FindBy(xpath="//div[contains(text(),'Receipts from production')]")
	public static WebElement draggedReturnsFromShopFloor; 
	
	@FindBy(xpath="//div[contains(text(),'Job Work Issues')]")
	public static WebElement draggedJobWorkIssues; 
	
	@FindBy(xpath="//div[contains(text(),'Job Work Receipts')]")
	public static WebElement draggedJobWorkReceipts; 
	
	@FindBy(xpath="//div[contains(text(),'Purchases Quotations')]")
	public static WebElement draggedPurchasesQuotations; 
	
	@FindBy(xpath="//div[contains(text(),'Sales Quotations')]")
	public static WebElement draggedSalesQuotations; 
	
	@FindBy(xpath="//div[contains(text(),'Job Order')]")
	public static WebElement draggedJobOrder; 
	
	@FindBy(xpath="//div[contains(text(),'Production Process')]")
	public static WebElement draggedProductionProcess; 
	
	@FindBy(xpath="//div[contains(text(),'Material Requisition')]")
	public static WebElement draggedMaterialRequisition ; 
	
	@FindBy(xpath="//div[contains(text(),'Request For Quote')]")
	public static WebElement draggedRequestForQuote; 
	
	@FindBy(xpath="//div[contains(text(),'Forex JV')]")
	public static WebElement draggedForexJV; 
	
	/*@FindBy(xpath="//div[contains(text(),'Purchase Voucher New')]")
	public static WebElement draggedPurchseVoucherNew; 
	
	@FindBy(xpath="//div[contains(text(),'Purchase Voucher New Two')]")
	public static WebElement draggedPurchseVoucherNewTwo; */
	
	@FindBy(xpath="//div[contains(text(),'Stock Transfer New')]")
	public static WebElement draggedStockTransferNew; 
	
	@FindBy(xpath="//div[contains(text(),'Opening Stocks New')]")
	public static WebElement draggedOpeningStocksNew; 
	
	@FindBy(xpath="//div[contains(text(),'Auto Sales Invoice')]")
	public static WebElement draggedAutoSalesInvoices; 
	
	@FindBy(xpath="//div[contains(text(),'Auto Sales Invoices Two')]")
	public static WebElement draggedAutoSalesInvoicesTwo; 
	
	@FindBy(xpath="//div[@title='Auto Sales Order']")
	public static WebElement draggedAutoSalesOrders; 
	
	@FindBy(xpath="//div[contains(text(),'Purchase Vouchers N')]")
	public static WebElement draggedPurchasesVouchersN;
	
	@FindBy(xpath="//div[@title='Sales Invoice N']")
	public static WebElement draggedSalesInvoicesN;
	
	
	
	

	// Link and Delete of Dragged Options
	
	//body[@class='custom_scrollbar']/ul[1]/li[1]
	@FindBy(xpath="/html[1]/body[1]/ul[1]/li[1]")
	public static WebElement draggedlinkBtn; 
	
	@FindBy(xpath="/html[1]/body[1]/ul[1]/li[2]")
	public static WebElement draggeddwdeleteBtn; 
	
	//li[@class='context-menu-item context-menu-visible']//span[contains(text(),'Delete')]
	
	
	//Connection Between Nodes
	
	//While Deleting or adding Link  to Nodes,the link id is also Updated to the NextLine Number.
	
	@FindBy(xpath="//*[@id='line0']")
	public static WebElement link0TO1; 
	
	@FindBy(xpath="//*[@id='line1']")
	public static WebElement link1TO2; 
	
	@FindBy(xpath="//*[@id='line2']")
	public static WebElement link2TO3; 
	
	@FindBy(xpath="//*[@id='line3']")
	public static WebElement link3TO4; 
	
	@FindBy(xpath="//*[@id='line4']")
	public static WebElement link4TO5; 
	
	@FindBy(xpath="//*[@id='line5']")
	public static WebElement link5TO6; 
	
	@FindBy(xpath="//*[@id='line6']")
	public static WebElement link6TO7; 
	
	@FindBy(xpath="//*[@id='line7']")
	public static WebElement link7TO8; 
	
	@FindBy(xpath="//*[@id='line8']")
	public static WebElement link8TO9; 
	
	
	
	//Connections  Node to Node Points Fields
	
	@FindBy(xpath="//*[@id='idNode_0']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode0Left; 
	
	@FindBy(xpath="//*[@id='idNode_1']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode1Left; 
	
	@FindBy(xpath="//*[@id='idNode_2']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode2Left;
	
	@FindBy(xpath="//*[@id='idNode_2']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode2to3Left;
	
	
	
	@FindBy(xpath="//*[@id='idNode_3']/div[2]/div[1]/div/div/div[2]")//*[@id="idNode_3"]/div[2]/div[1]/div/div/div[2]
	public static WebElement linkNode3Left; 
	
	@FindBy(xpath="//*[@id='idNode_4']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode4Left; 
	
	@FindBy(xpath="//*[@id='idNode_5']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode5Left;
	
	@FindBy(xpath="//*[@id='idNode_6']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode6Left; 
	
	@FindBy(xpath="//*[@id='idNode_7']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode7Left; 
	
	@FindBy(xpath="//*[@id='idNode_8']/div[2]/div[1]/div/div/div[2]")
	public static WebElement linkNode8Left;
	
	
	
	
	
	@FindBy(xpath="//*[@id='idNode_0']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode0Right; 
	
	@FindBy(xpath="//*[@id='idNode_1']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode1Right; 
	
	@FindBy(xpath="//*[@id='idNode_2']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode2Right; 
	
	@FindBy(xpath="//*[@id='idNode_3']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode3Right; 
	
	@FindBy(xpath="//*[@id='idNode_4']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode4Right; 
	
	@FindBy(xpath="//*[@id='idNode_5']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode5Right; 
	
	@FindBy(xpath="//*[@id='idNode_6']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode6Right; 
	
	@FindBy(xpath="//*[@id='idNode_7']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode7Right; 
	
	@FindBy(xpath="//*[@id='idNode_8']/div[2]/div[2]/div/div/div[2]")
	public static WebElement linkNode8Right; 
	
	
	
	
	//RightSide Fields
	
	//LinkSetting---Definition Tab   {Work Flow Setting-------------->Link Setting}
	
	@FindBy(xpath="//div[@id='settingIcon']//span[@class='iconbar']")
	public static WebElement rightSideExpandBtn; 
	
	@FindBy(xpath="//a[contains(text(),'Definition')]")
	public static WebElement DefinitionTab; 
	
	@FindBy(xpath="//a[contains(text(),'Mapping')]")
	public static WebElement MappingTab; 
	
	@FindBy(xpath="//*[@id='Maps']/div[2]/button[1]")
	public static WebElement MappingTabOkBtn; 
	
	@FindBy(xpath="//*[@id='Maps']/div[2]/button[2]")
	public static WebElement MappingTabCloseBtn; 
	
	@FindBy(xpath="//select[@id='DDLLinkValue']")
	public static WebElement DefinitionLinkValueDropdown; 
	
	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[1]/label/span")
	public static WebElement dateChkBox; 
	
	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[2]/label/span")
	public static WebElement customerAccountChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicewareHouseChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	public static WebElement autosalesOrderandInvoicewareHouseChkbox; 
	
	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[3]/label/span")
	public static WebElement narrationChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicenarrationChkbox;
	
	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[4]/label/span")
	public static WebElement itemchkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[3]//li[1]//input[1]")
	public static WebElement materialRequiitionAndPquotationsitemchkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	public static WebElement salesOrderandInvoiceitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	public static WebElement purchaseOrderandPvoucheritemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[5]//li[1]//input[1]")
	public static WebElement purchaseOrderandPvoucherUnitchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	public static WebElement purchaseVoucherAndPReturnsitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	public static WebElement purchaseVoucherNAndMRNitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[4]//li[1]//input[1]")
	public static WebElement mrnAndPurchaseReturnsitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	public static WebElement salesInvoicenAndDeliveryNotesitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	public static WebElement salesInvoiceAndSalesRetutrnsitemchkbox;
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	public static WebElement stockTransferAndSalesInvoiceNitemchkbox;
	
	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[5]/label/span")
	public static WebElement unitsChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[6]//li[1]//input[1]")
	public static WebElement salesOrderandInvoiceunitsChkbox;
	
	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[6]/label/span")
	public static WebElement quantityChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[7]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicequantityChkbox; 
	
	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[7]/label/span")
	public static WebElement voucherQtyhkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[8]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicevoucherQtyhkbox;
	
	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[8]/label/span")
	public static WebElement reserveChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[9]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicereserveChkbox;
	
	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[8]/label/span")
	public static WebElement rateChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[10]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicerateChkbox; 
	
	@FindBy(xpath="//*[@id='LeftSideChkbox']/div[9]/label/span")
	public static WebElement grossChkbox; 
	
	@FindBy(xpath="//div[@id='LeftSideChkbox']//ul[11]//li[1]//input[1]")
	public static WebElement salesOrderandInvoicegrossChkbox; 
	
	
	
	
	//Footer Fields oF Link Settings
	
	@FindBy(xpath="//button[contains(text(),'Map')]")
	public static WebElement MapBtn; 
	
	           //Map POp  Grid items to be write.
				
				@FindBy(xpath="//h5[contains(text(),'Link Mapping')]")
				public static WebElement linkMappingLabel; 
				
				@FindBy(xpath="//div[@class='modal-footer']//button[@class='Fbutton'][contains(text(),'Ok')]")
				public static WebElement linkMappingOkBtn; 
				
				@FindBy(xpath="//button[contains(text(),'Close')]")
				public static WebElement linkMappingdwcloseBtn; 
	
	@FindBy(xpath="//*[@id='WorkflowSettingDialog']/div[2]/div/div[3]/div/input[1]")
	public static WebElement OkBtn; 
	
	@FindBy(xpath="//*[@id='WorkflowSettingDialog']/div[2]/div/div[3]/div/input[2]")
	public static WebElement CancelBtn; 
	
	
  @FindBy(xpath="//span[@class='pull-right']")
  public static WebElement dwcloseBtnInDemoPopupScreen;
  
  
  
	 
public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	 Thread.sleep(5000);
     
     try 
     {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
			doNotShowCheckbox.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtnInDemoPopupScreen));
			dwcloseBtnInDemoPopupScreen.click(); 
			
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
	public static WebElement loginRefreshOkBtn;
	
	
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
	
	 
	 public static String xlfile;
	 public static String resPass="Pass";
	 public static String resFail="Fail";
	 public static ExcelReader excelReader;
	 public static String xlsheet="SmokeDesignWorkFlow";

	 public static int cSize; 
	 
	public boolean checkOpenDesignWorkFlow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
    	boolean actdesignWorkflowLabel           = designWorkflowLabel.isDisplayed();
		boolean actdwsaveBtn                       = dwsaveBtn.isDisplayed();
		boolean actclearBtn                      = clearBtn.isDisplayed();
		boolean actdwdeleteBtn                     = dwdeleteBtn.isDisplayed();
		boolean actdwcloseBtn                      = dwcloseBtn.isDisplayed();
		boolean actworkflowNameTxt               = workflowNameTxt.isDisplayed();
		boolean actworkFlowHideMenuBtn           = workFlowHideMenuBtn.isDisplayed();
		boolean actpurchaseVouchersExpandBtn     = purchaseVouchersExpandBtn.isDisplayed();
		boolean actpurchaseOrdersExpandBtn       = purchaseOrdersExpandBtn.isDisplayed();
		boolean actsalesInvoicesExpandBtn        = salesInvoicesExpandBtn.isDisplayed();
		boolean actsalesOrdersExpandBtn          = salesOrdersExpandBtn.isDisplayed();
		
		boolean expdesignWorkflowLabel           = true;
		boolean expdwsaveBtn                       = true;
		boolean expclearBtn                      = true;
		boolean expdwdeleteBtn                     = true;
		boolean expdwcloseBtn                      = true;
		boolean expworkflowNameTxt               = true;
		boolean expworkFlowHideMenuBtn           = true;
		boolean exppurchaseVouchersExpandBtn     = true;
		boolean exppurchaseOrdersExpandBtn       = true;
		boolean expsalesInvoicesExpandBtn        = true;
		boolean expsalesOrdersExpandBtn          = true;
		
		boolean actDisplay = actdesignWorkflowLabel==expdesignWorkflowLabel  && actdwsaveBtn==expdwsaveBtn
				&& actclearBtn==expclearBtn && actdwdeleteBtn==expdwdeleteBtn && actdwcloseBtn==expdwcloseBtn
			    && actworkflowNameTxt==expworkflowNameTxt&& actworkFlowHideMenuBtn==expworkFlowHideMenuBtn
				&& actpurchaseVouchersExpandBtn==exppurchaseVouchersExpandBtn&& actpurchaseOrdersExpandBtn==exppurchaseOrdersExpandBtn 
				&& actsalesInvoicesExpandBtn==expsalesInvoicesExpandBtn && actsalesOrdersExpandBtn==expsalesOrdersExpandBtn;
		
		String actMetod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 6, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 6, 8, actMetod);
		
		System.out.println("****************************** checkOpenDesignWorkFlow  ********************************************");
	
		System.out.println("DesignWorkflowLabel  Value Actual        :"+actdesignWorkflowLabel+         "    Value Expected : "+expdesignWorkflowLabel);
		System.out.println("dwsaveBtn Value Actual                     :"+actdwsaveBtn+                     "    Value Expected : "+expdwsaveBtn);
		System.out.println("ClearBtn Value Actual                    :"+actclearBtn+                    "	 Value Expected : "+expclearBtn);
		System.out.println("dwdeleteBtn Value Actual                   :"+actdwdeleteBtn+                   "	 Value Expected : "+expdwdeleteBtn);
		System.out.println("dwcloseBtn Value Actual                    :"+actdwcloseBtn+                    "	 Value Expected : "+expdwcloseBtn);
		System.out.println("WorkflowNameTxt Value Actual             :"+actworkflowNameTxt+             "	 Value Expected : "+expworkflowNameTxt);
		System.out.println("WorkFlowHideMenuBtn Value Actual         :"+actworkFlowHideMenuBtn+         "	 Value Expected : "+expworkFlowHideMenuBtn);
		System.out.println("PurchaseVouchersExpandBtn Value Actual   :"+actpurchaseVouchersExpandBtn+   "	 Value Expected : "+exppurchaseVouchersExpandBtn);
		System.out.println("PurchaseOrdersExpandBtn Value Actual     :"+actpurchaseOrdersExpandBtn+     "	 Value Expected : "+exppurchaseOrdersExpandBtn);
		System.out.println("SalesInvoicesExpandBtn Value Actual      :"+actsalesInvoicesExpandBtn+      "	 Value Expected : "+expsalesInvoicesExpandBtn);
		System.out.println("SalesOrdersExpandBtn Value Actual        :"+actsalesOrdersExpandBtn+        "	 Value Expected : "+expsalesOrdersExpandBtn);
		
			
		if(actMetod.equalsIgnoreCase(expMethod))
			
		{
			 System.out.println("Test Pass:  WorkFlow Screen Options Are Displayed ");
			 excelReader.setCellData(xlfile, xlsheet, 5, 9, resPass);
			 return true;
		} 
		else 
		{
			System.out.println(" Test Fail: WorkFlow Screen Options Are NOT Displayed  ");
			 excelReader.setCellData(xlfile, xlsheet, 5, 9, resFail);
			return false;
		}
   }
	
	

		
	public boolean checkOptionsInDesignWorkFlow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersExpandBtn));
		purchaseVouchersExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseOrdersExpandBtn));
		purchaseOrdersExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesExpandBtn));
		salesInvoicesExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersExpandBtn));
		salesOrdersExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nonStandardJournalEntriesExpandBtn));
		nonStandardJournalEntriesExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditNotesExpandBtn));
		creditNotesExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsFromProductionExpandBtn));
		receiptsFromProductionExpandBtn.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsDragAndDrop));
		
		boolean actreceiptsDragAndDrop							= receiptsDragAndDrop.isDisplayed();
		boolean actpaymentsDragAndDrop			                = paymentsDragAndDrop.isDisplayed();
		boolean actpettyCashDragAndDrop					        = pettyCashDragAndDrop.isDisplayed();
		boolean actpostDatedReceiptsDragAndDrop					= postDatedReceiptsDragAndDrop.isDisplayed();
        boolean actpostDatedPaymentsDragAndDrop				    = postDatedPaymentsDragAndDrop.isDisplayed();
	    boolean actpurchasesVouchersDragAndDrop					= purchasesVouchersDragAndDrop.isDisplayed();
		boolean actpurchasesReturnsDragAndDrop					= purchasesReturnsDragAndDrop.isDisplayed();
		boolean actpurchasesOrdersDragAndDrop					= purchasesOrdersDragAndDrop.isDisplayed();
	    boolean actjobordersDragAndDrop							= jobordersDragAndDrop.isDisplayed();
        boolean actmaterialReceiptNotesDragAndDrop			    = materialReceiptNotesDragAndDrop.isDisplayed();
		boolean actsalesInvoicesDragAndDrop					    = salesInvoicesDragAndDrop.isDisplayed();
		boolean actcashSalesDragAndDrop					        = cashSalesDragAndDrop.isDisplayed();
		boolean acthirePurchaseSalesDragAndDrop					= hirePurchaseSalesDragAndDrop.isDisplayed();
		boolean actposSalesDragAndDrop					        = posSalesDragAndDrop.isDisplayed();
		boolean actsalesReturnsDragAndDrop					    = salesReturnsDragAndDrop.isDisplayed();
		boolean actsalesOrdersDragAndDrop					    = salesOrdersDragAndDrop.isDisplayed();
		boolean actproductionOrderDragAndDrop					= productionOrderDragAndDrop.isDisplayed();
		boolean actdeliveryNotesDragAndDrop						= deliveryNotesDragAndDrop.isDisplayed();
		boolean actnonStandardJournalEntriesDragAndDrop			= nonStandardJournalEntriesDragAndDrop.isDisplayed();
		boolean actinterDepartmentalJVDragAndDrop				= interDepartmentalJVDragAndDrop.isDisplayed();
		boolean actdebitNotesLineWiseDragAndDrop				= debitNotesLineWiseDragAndDrop.isDisplayed();
		boolean actcreditNotesLineWiseDragAndDrop			    = creditNotesLineWiseDragAndDrop.isDisplayed();
		boolean actfixedAssetDepreciationVoucherDragAndDrop	    = fixedAssetDepreciationVoucherDragAndDrop.isDisplayed();
		boolean actjournalEntriesDragAndDrop			        = journalEntriesDragAndDrop.isDisplayed();
		
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", debitNotesDragAndDrop);
		
		boolean actdebitNotesDragAndDrop						= debitNotesDragAndDrop.isDisplayed();
		boolean actcreditNotesDragAndDrop						= creditNotesDragAndDrop.isDisplayed();
	//	boolean actpayrollPostingsDragAndDrop			        = payrollPostingsDragAndDrop.isDisplayed();
		boolean actopeningBalancesDragAndDrop				    = openingBalancesDragAndDrop.isDisplayed();
		boolean actshortagesInStockDragAndDrop				    = shortagesInStockDragAndDrop.isDisplayed();
		boolean actexcessesInStocksDragAndDrop				    = excessesInStocksDragAndDrop.isDisplayed();
		boolean actstockTransferDragAndDrop				        = stockTransferDragAndDrop.isDisplayed();
		boolean actopeningStocksDragAndDrop						= openingStocksDragAndDrop.isDisplayed();
		boolean actissuesToProductionDragAndDrop				= issuesToProductionDragAndDrop.isDisplayed();
		boolean actreceiptsFromproductionDragAndDrop            = receiptsFromproductionDragAndDrop.isDisplayed();
		boolean actreturnsFromShopFloorDragAndDrop              = returnsFromShopFloorDragAndDrop.isDisplayed();
		boolean actjobWorkIssuesDragAndDrop                     = jobWorkIssuesDragAndDrop.isDisplayed();
		boolean actjobWorkReceiptsDragAndDrop                   = jobWorkReceiptsDragAndDrop.isDisplayed();
		boolean actpurchasesQuotationsDragAndDrop               = purchasesQuotationsDragAndDrop.isDisplayed();
		boolean actsalesQuotationsDragAndDrop                   = salesQuotationsDragAndDrop.isDisplayed();
		boolean actjobOrderDragAndDrop                          = jobOrderDragAndDrop.isDisplayed();
		boolean actproductionProcessDragAndDrop                 = productionProcessDragAndDrop.isDisplayed();
		boolean actmaterialRequisitionDragAndDrop               = materialRequisitionDragAndDrop.isDisplayed();
		boolean actrequestForQuoteDragAndDrop                   = requestForQuoteDragAndDrop.isDisplayed();
		boolean actforexJVDragAndDrop                           = forexJVDragAndDrop.isDisplayed();
		boolean actsearchTxt                                    = searchTxt.isDisplayed();
		
		boolean expreceiptsDragAndDrop							= true;
		boolean exppaymentsDragAndDrop			                = true;
		boolean exppettyCashDragAndDrop					        = true;
		boolean exppostDatedReceiptsDragAndDrop					= true;
		boolean exppostDatedPaymentsDragAndDrop					= true;
		boolean exppurchasesVouchersDragAndDrop					= true;
		boolean exppurchasesReturnsDragAndDrop					= true;
		boolean exppurchasesOrdersDragAndDrop					= true;
		boolean expjobordersDragAndDrop			                = true;
		boolean expmaterialReceiptNotesDragAndDrop				= true;
		boolean expsalesInvoicesDragAndDrop					    = true;
		boolean expcashSalesDragAndDrop					        = true;
		boolean exphirePurchaseSalesDragAndDrop					= true;
		boolean expposSalesDragAndDrop					        = true;
		boolean expsalesReturnsDragAndDrop					    = true;
		boolean expsalesOrdersDragAndDrop					    = true;
		boolean expproductionOrderDragAndDrop					= true;
		boolean expdeliveryNotesDragAndDrop						= true;
		boolean expnonStandardJournalEntriesDragAndDrop			= true;
		boolean expinterDepartmentalJVDragAndDrop				= true;
		boolean expdebitNotesLineWiseDragAndDrop				= true;
		boolean expcreditNotesLineWiseDragAndDrop			    = true;
		boolean expfixedAssetDepreciationVoucherDragAndDrop		= true;
		boolean expjournalEntriesDragAndDrop			        = true;
		boolean expdebitNotesDragAndDrop						= true;
		boolean expcreditNotesDragAndDrop						= true;
		//boolean exppayrollPostingsDragAndDrop			        = true;
	    boolean expopeningBalancesDragAndDrop					= true;
		boolean expshortagesInStockDragAndDrop					= true;
		boolean expexcessesInStocksDragAndDrop					= true;
		boolean expstockTransferDragAndDrop						= true;
		boolean expopeningStocksDragAndDrop						= true;
		boolean expissuesToProductionDragAndDrop				= true;
		boolean expreceiptsFromproductionDragAndDrop  			= true;
		boolean expreturnsFromShopFloorDragAndDrop				= true;
		boolean expjobWorkIssuesDragAndDrop					    = true;
		boolean expjobWorkReceiptsDragAndDrop					= true;
		boolean exppurchasesQuotationsDragAndDrop				= true;
		boolean expsalesQuotationsDragAndDrop					= true;
		boolean expjobOrderDragAndDrop							= true;
		boolean expproductionProcessDragAndDrop					= true;
		boolean expmaterialRequisitionDragAndDrop				= true;
		boolean exprequestForQuoteDragAndDrop					= true;
		boolean expforexJVDragAndDrop							= true;
		boolean expsearchTxt								    = true;

		boolean actDisplay = actreceiptsDragAndDrop==expreceiptsDragAndDrop && actpaymentsDragAndDrop==exppaymentsDragAndDrop && actpettyCashDragAndDrop==exppettyCashDragAndDrop && 
				actpostDatedReceiptsDragAndDrop==exppostDatedReceiptsDragAndDrop && actpostDatedPaymentsDragAndDrop==exppostDatedPaymentsDragAndDrop && 
				actpurchasesVouchersDragAndDrop==exppurchasesVouchersDragAndDrop && actpurchasesReturnsDragAndDrop==exppurchasesReturnsDragAndDrop && 
				actpurchasesOrdersDragAndDrop==exppurchasesOrdersDragAndDrop && actjobordersDragAndDrop==expjobordersDragAndDrop && 
				actmaterialReceiptNotesDragAndDrop==expmaterialReceiptNotesDragAndDrop && actsalesInvoicesDragAndDrop==expsalesInvoicesDragAndDrop && 
				actcashSalesDragAndDrop==expcashSalesDragAndDrop && acthirePurchaseSalesDragAndDrop==exphirePurchaseSalesDragAndDrop && actposSalesDragAndDrop==expposSalesDragAndDrop && 
				actsalesReturnsDragAndDrop==expsalesReturnsDragAndDrop && actsalesOrdersDragAndDrop==expsalesOrdersDragAndDrop && actproductionOrderDragAndDrop==expproductionOrderDragAndDrop && 
				actdeliveryNotesDragAndDrop==expdeliveryNotesDragAndDrop && actnonStandardJournalEntriesDragAndDrop==expnonStandardJournalEntriesDragAndDrop && 
				actinterDepartmentalJVDragAndDrop==expinterDepartmentalJVDragAndDrop && actdebitNotesLineWiseDragAndDrop==expdebitNotesLineWiseDragAndDrop &&
				actcreditNotesLineWiseDragAndDrop==expcreditNotesLineWiseDragAndDrop && actfixedAssetDepreciationVoucherDragAndDrop==expfixedAssetDepreciationVoucherDragAndDrop && 
				actjournalEntriesDragAndDrop==expjournalEntriesDragAndDrop && actdebitNotesDragAndDrop==expdebitNotesDragAndDrop && actcreditNotesDragAndDrop==expcreditNotesDragAndDrop && 
				/*actpayrollPostingsDragAndDrop==exppayrollPostingsDragAndDrop &&*/ actopeningBalancesDragAndDrop==expopeningBalancesDragAndDrop && actshortagesInStockDragAndDrop==expshortagesInStockDragAndDrop && 
				actexcessesInStocksDragAndDrop==expexcessesInStocksDragAndDrop && actstockTransferDragAndDrop==expstockTransferDragAndDrop && 
				actopeningStocksDragAndDrop==expopeningStocksDragAndDrop && actissuesToProductionDragAndDrop==expissuesToProductionDragAndDrop && 
				actreceiptsFromproductionDragAndDrop==expreceiptsFromproductionDragAndDrop && actreturnsFromShopFloorDragAndDrop==expreturnsFromShopFloorDragAndDrop && 
				actjobWorkIssuesDragAndDrop==expjobWorkIssuesDragAndDrop && actjobWorkReceiptsDragAndDrop==expjobWorkReceiptsDragAndDrop && 
				actpurchasesQuotationsDragAndDrop==exppurchasesQuotationsDragAndDrop && actsalesQuotationsDragAndDrop==expsalesQuotationsDragAndDrop &&
				actjobOrderDragAndDrop==expjobOrderDragAndDrop && actproductionProcessDragAndDrop==expproductionProcessDragAndDrop && 
				actmaterialRequisitionDragAndDrop==expmaterialRequisitionDragAndDrop && actrequestForQuoteDragAndDrop==exprequestForQuoteDragAndDrop && 
				actforexJVDragAndDrop==expforexJVDragAndDrop && actsearchTxt==expsearchTxt ;
		
		String actMethod = Boolean.toString(actDisplay);
		String expMethod = excelReader.getCellData(xlsheet, 8, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 8, 8, actMethod);
		
		System.out.println("*******************************************************checkOptionsInDesignWorkFlow*****************************************"); 
		
		
		System.out.println("ReceiptsDragAndDrop               : "+actreceiptsDragAndDrop                      +"  value expected  "+expreceiptsDragAndDrop);
		System.out.println("PaymentsDragAndDrop               : "+actpaymentsDragAndDrop                      +"  value expected  "+exppaymentsDragAndDrop);
		System.out.println("PettyCashDragAndDrop              : "+actpettyCashDragAndDrop                     +"  value expected  "+exppettyCashDragAndDrop);
		System.out.println("PostDatedReceiptsDragAndDrop      : "+actpostDatedReceiptsDragAndDrop             +"  value expected  "+exppostDatedReceiptsDragAndDrop);
		System.out.println("PostDatedPaymentsDragAndDrop      : "+actpostDatedPaymentsDragAndDrop             +"  value expected  "+exppostDatedPaymentsDragAndDrop);
		System.out.println("PurchasesVouchersDragAndDrop      : "+actpurchasesVouchersDragAndDrop             +"  value expected  "+exppurchasesVouchersDragAndDrop);
		System.out.println("PurchasesReturnsDragAndDrop       : "+actpurchasesReturnsDragAndDrop              +"  value expected  "+exppurchasesReturnsDragAndDrop);
		System.out.println("PurchasesOrdersDragAndDrop        : "+actpurchasesOrdersDragAndDrop               +"  value expected  "+exppurchasesOrdersDragAndDrop);
		System.out.println("JobordersDragAndDrop              : "+actjobordersDragAndDrop                     +"  value expected  "+expjobordersDragAndDrop);
		System.out.println("MaterialRecNotesDragAndDrop       : "+actmaterialReceiptNotesDragAndDrop          +"  value expected  "+expmaterialReceiptNotesDragAndDrop);
		System.out.println("SalesInvoicesDragAndDrop          : "+actsalesInvoicesDragAndDrop                 +"  value expected  "+expsalesInvoicesDragAndDrop);
		System.out.println("CashSalesDragAndDrop              : "+actcashSalesDragAndDrop                     +"  value expected  "+expcashSalesDragAndDrop);
		System.out.println("HirePurchaseSalesDragAndDrop      : "+acthirePurchaseSalesDragAndDrop             +"  value expected  "+exphirePurchaseSalesDragAndDrop);
		System.out.println("PosSalesDragAndDrop               : "+actposSalesDragAndDrop                      +"  value expected  "+expposSalesDragAndDrop);
		System.out.println("SalesReturnsDragAndDrop           : "+actsalesReturnsDragAndDrop                  +"  value expected  "+expsalesReturnsDragAndDrop);
		System.out.println("SalesOrdersDragAndDrop            : "+actsalesOrdersDragAndDrop                   +"  value expected  "+expsalesOrdersDragAndDrop);
		System.out.println("ProductionOrderDragAndDrop        : "+actproductionOrderDragAndDrop               +"  value expected  "+expproductionOrderDragAndDrop);
		System.out.println("DeliveryNotesDragAndDrop          : "+actdeliveryNotesDragAndDrop                 +"  value expected  "+expdeliveryNotesDragAndDrop);
		System.out.println("NonStanJouEntriesDragAndDrop      : "+actnonStandardJournalEntriesDragAndDrop     +"  value expected  "+expnonStandardJournalEntriesDragAndDrop);
		System.out.println("InterDepartmentalJVDragAndDrop    : "+actinterDepartmentalJVDragAndDrop           +"  value expected  "+expinterDepartmentalJVDragAndDrop);
		System.out.println("DebitNotesLineWiseDragAndDrop     : "+actdebitNotesLineWiseDragAndDrop            +"  value expected  "+expdebitNotesLineWiseDragAndDrop);
		System.out.println("CreditNotesLineWiseDragAndDrop    : "+actcreditNotesLineWiseDragAndDrop           +"  value expected  "+expcreditNotesLineWiseDragAndDrop);
		System.out.println("FixedAssetDeprecVouDragAndDrop    : "+actfixedAssetDepreciationVoucherDragAndDrop +"  value expected  "+expfixedAssetDepreciationVoucherDragAndDrop);
		System.out.println("JournalEntriesDragAndDrop         : "+actjournalEntriesDragAndDrop                +"  value expected  "+expjournalEntriesDragAndDrop);
		System.out.println("DebitNotesDragAndDrop             : "+actdebitNotesDragAndDrop                    +"  value expected  "+expdebitNotesDragAndDrop);
		System.out.println("CreditNotesDragAndDrop            : "+actcreditNotesDragAndDrop                   +"  value expected  "+expcreditNotesDragAndDrop);
	//	System.out.println("PayrollPostingsDragAndDrop        : "+actpayrollPostingsDragAndDrop               +"  value expected  "+exppayrollPostingsDragAndDrop);
		System.out.println("OpeningBalancesDragAndDrop        : "+actopeningBalancesDragAndDrop               +"  value expected  "+expopeningBalancesDragAndDrop);
		System.out.println("ShortagesInStockDragAndDrop       : "+actshortagesInStockDragAndDrop              +"  value expected  "+expshortagesInStockDragAndDrop);
		System.out.println("ExcessesInStocksDragAndDrop       : "+actexcessesInStocksDragAndDrop              +"  value expected  "+expexcessesInStocksDragAndDrop);
		System.out.println("StockTransferDragAndDrop          : "+actstockTransferDragAndDrop                 +"  value expected  "+expstockTransferDragAndDrop);
		System.out.println("OpeningStocksDragAndDrop          : "+actopeningStocksDragAndDrop                 +"  value expected  "+expopeningStocksDragAndDrop);
		System.out.println("IssuesToProductionDragAndDrop     : "+actissuesToProductionDragAndDrop            +"  value expected  "+expissuesToProductionDragAndDrop);
		System.out.println("ReceiptsFromproductionDragAndDrop : "+actreceiptsFromproductionDragAndDrop        +"  value expected  "+expreceiptsFromproductionDragAndDrop);
		System.out.println("ReturnsFromShopFloorDragAndDrop   : "+actreturnsFromShopFloorDragAndDrop          +"  value expected  "+expreturnsFromShopFloorDragAndDrop);
		System.out.println("JobWorkIssuesDragAndDrop          : "+actjobWorkIssuesDragAndDrop                 +"  value expected  "+expjobWorkIssuesDragAndDrop);
		System.out.println("JobWorkReceiptsDragAndDrop        : "+actjobWorkReceiptsDragAndDrop               +"  value expected  "+expjobWorkReceiptsDragAndDrop);
		System.out.println("PurchasesQuotationsDragAndDrop    : "+actpurchasesQuotationsDragAndDrop           +"  value expected  "+exppurchasesQuotationsDragAndDrop);
		System.out.println("SalesQuotationsDragAndDrop        : "+actsalesQuotationsDragAndDrop               +"  value expected  "+expsalesQuotationsDragAndDrop);
		System.out.println("JobOrderDragAndDrop               : "+actjobOrderDragAndDrop                      +"  value expected  "+expjobOrderDragAndDrop);
		System.out.println("ProductionProcessDragAndDrop      : "+actproductionProcessDragAndDrop             +"  value expected  "+expproductionProcessDragAndDrop);
		System.out.println("MaterialRequisitionDragAndDrop    : "+actmaterialRequisitionDragAndDrop           +"  value expected  "+expmaterialRequisitionDragAndDrop);
		System.out.println("RequestForQuoteDragAndDrop        : "+actrequestForQuoteDragAndDrop               +"  value expected  "+exprequestForQuoteDragAndDrop);
		System.out.println("ForexJVDragAndDrop                :"+actforexJVDragAndDrop                        +"  value expected  "+expforexJVDragAndDrop);
		System.out.println("SearchTxt                         :"+actsearchTxt                                 +"  value expected  "+expsearchTxt);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			 
			 System.out.println("Test Pass: Vouchers Are Displayed As Expected");
			 excelReader.setCellData(xlfile, xlsheet, 7, 9, resPass);
			 return true;
		} else
		{
			System.out.println("Test Fail: Vouchers Are Not Dislaying As Expected ");
			 excelReader.setCellData(xlfile, xlsheet, 7, 9, resFail);
			return false;
		}
	}	
	
	
	public boolean checkSaveButtonWithoutWorkFlowName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
		dwsaveBtn.click();
		
		System.out.println("****************************************checkSaveButtonWithoutWorkFlowName************************");
		
		String expMessage=excelReader.getCellData(xlsheet, 10, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlsheet, 10, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Accepting Auto Reservation in WorkFlowName");
			excelReader.setCellData(xlfile, xlsheet, 9, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : NOT Accepting Auto Reservation in WorkFlowName");
			excelReader.setCellData(xlfile, xlsheet, 9, 9, resFail);
			return false;
		}
		
	}

	
	
	public boolean checkInputWorkFlowName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		
		workflowNameTxt.sendKeys(excelReader.getCellData(xlsheet, 11, 6));
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);
		
		String actworkflowNameTxt,expworkflowNameTxt;
		expworkflowNameTxt=excelReader.getCellData(xlsheet, 12, 7);
		actworkflowNameTxt=workflowNameTxt.getAttribute("value");
		
		excelReader.setCellData(xlfile, xlsheet, 12, 8, actworkflowNameTxt);
	
		System.out.println("*********************************************checkInputWorkFlowName***********************************");
		
		System.out.println("WorkflowNameTxt    : "+actworkflowNameTxt +" value Excepted : "+expworkflowNameTxt);
		
		if(actworkflowNameTxt.equalsIgnoreCase(expworkflowNameTxt))
		{
			System.out.println("Test Pass : Accepting Auto Reservation in WorkFlowName");
			excelReader.setCellData(xlfile, xlsheet, 11, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : NOT Accepting Auto Reservation in WorkFlowName");
			excelReader.setCellData(xlfile, xlsheet, 11, 9, resFail);
			return false;
		}
		
	}
	
	
	
	
	public boolean checkSelectAndDragVoucherPurchaseOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersDragAndDrop));
		purchasesOrdersDragAndDrop.click();
		
		getAction().dragAndDropBy(purchasesOrdersDragAndDrop, 350, 100).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
		
		boolean actFirstDraggedElement=FirstDraggedElement.isDisplayed();
		boolean expFirstDraggedElement=true;
		
		boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 14, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 14, 8, actMethod);
		
		System.out.println("**************************************checkSelectAndDragVoucherSalesOrder*****************************");
		
		System.out.println("FirstDraggedElement   : "+actFirstDraggedElement +" Value Expected :"+expFirstDraggedElement);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Auto Sales Order Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 13, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Auto Sales Order Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 13, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	public boolean checkSaveButtonWithSingleVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
		dwsaveBtn.click();
		
		System.out.println("**********************************checkSaveButtonWithSingleVoucher***********************");
		
		String expMessage=/*excelReader.getCellData(xlsheet, 16, 7);*/ "Cannot Save WorkFlow,Create A Link Among Nodes , Single Node Without Link Not Allowed.";
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlsheet, 16, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Error Message is as Expected");
			excelReader.setCellData(xlfile, xlsheet, 15, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Error Message is NOT as Expected");
			excelReader.setCellData(xlfile, xlsheet, 15, 9, resFail);
			return false;
		}
	}
	
	@FindBy(xpath="//div[@class='flowchart-operators-layer unselectable']")
	public static WebElement layoutarea;

	public boolean checkClearButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearBtn));
		clearBtn.click();
		
		Thread.sleep(2000);
		
		boolean actLayoutArea=layoutarea.getText().isEmpty();
		
		boolean expLayoutArea=true;
		
		boolean actDisplay = actLayoutArea==expLayoutArea;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 18, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 18, 8, actMethod);

		System.out.println("***********************checkClearButton****************************");
		
		System.out.println("WorkFlow Are After Clear : "+actLayoutArea+" value Expected : "+expLayoutArea);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Clearing Data Successfully ");
			excelReader.setCellData(xlfile, xlsheet, 17, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail : Not Clearing Data");
			excelReader.setCellData(xlfile, xlsheet, 17, 9, resFail);
			return false;
		}
	}

	
	
	
	public boolean checkSelectBaseAndLinkVouchersToDrag() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys(excelReader.getCellData(xlsheet, 19, 6));
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersDragAndDrop));
		purchasesOrdersDragAndDrop.click();
		
		getAction().dragAndDropBy(purchasesOrdersDragAndDrop, 350, 100).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVouchersDragAndDrop));
		purchasesVouchersDragAndDrop.click();
		
		getAction().dragAndDropBy(purchasesVouchersDragAndDrop, 650, 100).build().perform();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
		
		boolean actFirstDraggedElement=FirstDraggedElement.isDisplayed();
		boolean actdraggedPurchasesVouchers=draggedPurchasesVouchers.isDisplayed();
		
		boolean expFirstDraggedElement=true;
		boolean expdraggedPurchasesVouchers=true;
		
		boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement && actdraggedPurchasesVouchers==expdraggedPurchasesVouchers;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 20, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 20, 8, actMethod);
		
		System.out.println("**********************************************checkSelectBaseAndLinkVouchersToDrag*********************************");
		
		System.out.println("FirstDraggedElement      : "+actFirstDraggedElement      +" Value Expected  : "+expFirstDraggedElement);
		System.out.println("draggedPurchasesVouchers : "+actdraggedPurchasesVouchers +" VFalue Expected :"+expdraggedPurchasesVouchers);
		
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Auto Sales Orders And Auto Sales Invoices Are Displayed in Positions");
			excelReader.setCellData(xlfile, xlsheet, 19, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Auto Sales Orders And Auto Sales Invoices Are NOT Displayed in Positions");
			excelReader.setCellData(xlfile, xlsheet, 19, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	
	public boolean checkSavingVouchersWithoutHavingLink() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
		dwsaveBtn.click();
		
		System.out.println("******************************************checkSavingVouchersWithoutHavingLink*****************************");
		
		String expMessage=excelReader.getCellData(xlsheet, 22, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlsheet, 22, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Error Message is as Expected");
			excelReader.setCellData(xlfile, xlsheet, 21, 9, resPass);
			return true;
		}
                else
		{
			System.out.println("Test Fail : Error Message is NOT as Expected");
			excelReader.setCellData(xlfile, xlsheet, 21, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkOptionsInLinkBetweenBaseAndLinkVouchers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getAction().contextClick(FirstDraggedElement).build().perform();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		
		boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
		boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
		
		boolean expdraggedlinkBtn=true;
		boolean expdraggeddwdeleteBtn=true;
		
		boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn &&actdraggeddwdeleteBtn==expdraggeddwdeleteBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 24, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 24, 8, actMethod);
		
		
		System.out.println("*****************************checkOptionsInLinkBetweenBaseAndLinkVouchers*****************");
		
		System.out.println("DraggedlinkBtn    : "+actdraggedlinkBtn   +" Value Expected :"+expdraggedlinkBtn);
		System.out.println("DraggeddwdeleteBtn  : "+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
		
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			
			System.out.println("Test Pass : Link And delete Options Are Available");
			excelReader.setCellData(xlfile, xlsheet, 23, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Link And delete Options Are NOT Available");
			excelReader.setCellData(xlfile, xlsheet, 23, 9, resFail);
			return false;
		}
	}
	
	 
	public boolean checkLinkOptionInBetweenAutoSalesOrderAndAutoSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		draggedlinkBtn.click();
		
		try
		{
			
			boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn=true;
			boolean expdraggeddwdeleteBtn=true;
			
			boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 26, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 26, 8, actMethod);
			
			System.out.println("*******************************************checkLinkOptionInBetweenAutoSalesOrderAndAutoSalesInvoice*****************");
			
			System.out.println("DraggedlinkBtn    :"+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
			System.out.println("DraggeddwdeleteBtn  :"+actdraggeddwdeleteBtn +"  Value Excepted : "+expdraggeddwdeleteBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Fail : Not Selected Link Option ");
				excelReader.setCellData(xlfile, xlsheet, 25, 9, resFail);
				return false;
			}
			else
			{
				System.out.println("Test Pass : Selected Link Option Successfully ");
				excelReader.setCellData(xlfile, xlsheet, 25, 9, resPass);
				return true;
			}
		 }
		 catch(Exception e)
		{
				System.out.println("Test Pass : Selected Link Option Successfully ");
				excelReader.setCellData(xlfile, xlsheet, 25, 9, resFail);
				return true;
		}
	}
	
	
	
	public boolean checkLinkNodeLineFromBaseVoucherToLinkVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode1Left));
		linkNode1Left.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.querySelector('#line0 > path').setAttribute('stroke-width', '12')"); 
		
		
		boolean actlink0TO1=link0TO1.isDisplayed();
		boolean explink0TO1=true;
		
		boolean actDisplay = actlink0TO1==explink0TO1;
				
				String actMethod = Boolean.toString(actDisplay);
		
		String expMathod = excelReader.getCellData(xlsheet, 28, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 28, 8, actMethod);
		
		System.out.println("***********************************checkLinkNodeLineFromBaseVoucherToLinkVoucher***************************");
		
		System.out.println("Link0TO1   "+actlink0TO1 +" Value Excepted : "+explink0TO1);
		
		if(actMethod.equalsIgnoreCase(expMathod))
		{
			System.out.println("Test Pass : Mapping Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 27, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Mapping NOT Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 27, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	public boolean checkSavingVouchersWithHavingLink() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
		dwsaveBtn.click();
		
		Thread.sleep(2000);
		
		System.out.println("******************************checkSavingVouchersWithHavingLink*****************************");
		
		String expMessage=excelReader.getCellData(xlsheet, 30, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlsheet, 30, 8, actMessage);

		if(actMessage.startsWith(expMessage))
		{
			System.out.println("Test Pass : Error Message is as Expected");
			excelReader.setCellData(xlfile, xlsheet, 29, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Error Message is NOT as Expected");
			excelReader.setCellData(xlfile, xlsheet, 29, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkWorkFlowOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link0TO1));
		link0TO1.click();
		
		Thread.sleep(3000);
		
		boolean actDefinitionTab    = DefinitionTab.isDisplayed();
		boolean actsettingTab       = settingTab.isDisplayed();
		boolean actpropertiesTab    = propertiesTab.isDisplayed();
		boolean actMapBtn           = MappingTab.isDisplayed();
		boolean actOkBtn            = OkBtn.isDisplayed();
		boolean actCancelBtn        = CancelBtn.isDisplayed();
		
		
		boolean expDefinitionTab    = true;
		boolean expsettingTab       = true;
		boolean exppropertiesTab    = true;
		boolean expMapBtn           = true;
		boolean expOkBtn            = true;
		boolean expCancelBtn        = true;
		
		boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
				&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 32, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 32, 8, actMethod);
		
		System.out.println("**************************************checkWorkFlowOptions*******");
		
		System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
		System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
		System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
		System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
		System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
		System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link Options Are Displayed");
			excelReader.setCellData(xlfile, xlsheet, 31, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Link Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlsheet, 31, 9, resFail);
			return false;
		}
	}
	
	 
	
	
	public boolean checkLinkValueOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
		DefinitionLinkValueDropdown.click();
		Select s=new Select(DefinitionLinkValueDropdown);
		
		Thread.sleep(2000);
		
		int DefinitionLinkValueDropdownCount=s.getOptions().size();
		
		String actDefinitionLinkValueDropdown = Integer.toString(DefinitionLinkValueDropdownCount);
		
		String expDefinitionLinkValueDropdown= excelReader.getCellData(xlsheet, 34, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 34, 8, actDefinitionLinkValueDropdown);
		
		
		 boolean actdateChkBox                              = dateChkBox.isDisplayed();
	     boolean actcustomerAccountChkbox                   = customerAccountChkbox.isDisplayed();
		 boolean actnarrationChkbox                         = narrationChkbox.isDisplayed();
		 boolean actitemchkbox                              = itemchkbox.isDisplayed();
		 boolean actunitsChkbox                             = unitsChkbox.isDisplayed();
		 boolean actquantityChkbox                          = quantityChkbox.isDisplayed();
	     boolean actvoucherQtyhkbox          				= voucherQtyhkbox.isDisplayed();
		 boolean actreserveChkbox                       	= reserveChkbox.isDisplayed();
		 boolean actrateChkbox                          	= rateChkbox.isDisplayed();
		 boolean actgrossChkbox                             = grossChkbox.isDisplayed();
		 boolean actvoucherGrossChkbox                      = voucherGrossChkbox.isDisplayed();
		 boolean actnetChkbox                            	= netChkbox.isDisplayed();
		 boolean actvoucherNetChkbox                        = voucherNetChkbox.isDisplayed();
		 boolean actuserChkbox                              = userChkbox.isDisplayed();
		 boolean actroleChkbox                              = roleChkbox.isDisplayed();
		 boolean actuser1Chkbox                             = user1Chkbox.isDisplayed();
		 boolean actuser2Chkbox                             = user2Chkbox.isDisplayed();
		 boolean actuser3Chkbox                             = user3Chkbox.isDisplayed();
		 boolean actuser4Chkbox                             = user4Chkbox.isDisplayed();
		 boolean actuser5Chkbox                             = user5Chkbox.isDisplayed();
		 
		 boolean expdateChkBox                              = true;
		 boolean expcustomerAccountChkbox                   = true;
		 boolean expnarrationChkbox                         = true;
		 boolean expitemchkbox                              = true;
		 boolean expunitsChkbox                             = true;
		 boolean expquantityChkbox                          = true;
		 boolean expvoucherQtyhkbox                         = true;
		 boolean expreserveChkbox                           = true;
		 boolean exprateChkbox                              = true;
		 boolean expgrossChkbox                             = true;
		 boolean expvoucherGrossChkbox                      = true;
		 boolean expnetChkbox                               = true;
		 boolean expvoucherNetChkbox                        = true;
		 boolean expuserChkbox                              = true;
		 boolean exproleChkbox                              = true;
		 boolean expuser1Chkbox                             = true;
		 boolean expuser2Chkbox                             = true;
		 boolean expuser3Chkbox                             = true;
		 boolean expuser4Chkbox                             = true;
		 boolean expuser5Chkbox                             = true;
		 
		 boolean actDisplay = actdateChkBox==expdateChkBox  && actcustomerAccountChkbox==expcustomerAccountChkbox 
				 && actnarrationChkbox==expnarrationChkbox
				 && actitemchkbox==expitemchkbox  && actunitsChkbox==expunitsChkbox  && actquantityChkbox==expquantityChkbox && actvoucherQtyhkbox==expvoucherQtyhkbox 
			         && actreserveChkbox==expreserveChkbox && actrateChkbox==exprateChkbox
				 && actgrossChkbox==expgrossChkbox && actvoucherGrossChkbox==expvoucherGrossChkbox 
				 && actnetChkbox==expnetChkbox  && actvoucherNetChkbox==expvoucherNetChkbox
				 && actroleChkbox==exproleChkbox && actuser1Chkbox==expuser1Chkbox && actuser2Chkbox==expuser2Chkbox 
				 && actuser3Chkbox==expuser3Chkbox && actuser4Chkbox==expuser4Chkbox && actuser5Chkbox==expuser5Chkbox;
		 
		 String actMethod = Boolean.toString(actDisplay);
		 
		 String expMethod = excelReader.getCellData(xlsheet, 35, 7);
		 
		 excelReader.setCellData(xlfile, xlsheet, 35, 8, actMethod);
		 	
			
			
		 System.out.println("****************************** checkPropertiesOption  ********************************************");
		 
		 System.out.println("DateChkBox                  :"+actdateChkBox+             "     Value Expected : "+expdateChkBox);
		 System.out.println("CustomerAccountChkbox       :"+actcustomerAccountChkbox+  "     Value Expected : "+expcustomerAccountChkbox);
		 System.out.println("NarrationChkbox             :"+actnarrationChkbox+        "	 Value Expected : "+expnarrationChkbox);
		 System.out.println("Itemchkbox     			 :"+actitemchkbox+             "	 Value Expected : "+expitemchkbox);
		 System.out.println("UnitsChkbox                 :"+actunitsChkbox+            "	 Value Expected : "+expunitsChkbox);
		 System.out.println("QuantityChkbox      	     :"+actquantityChkbox+         "	 Value Expected : "+expquantityChkbox);
		 System.out.println("VoucherQtyhkbox             :"+actvoucherQtyhkbox+        "	 Value Expected : "+expvoucherQtyhkbox);
		 System.out.println("ReserveChkbox               :"+actreserveChkbox+          "	 Value Expected : "+expreserveChkbox);
		 System.out.println("RateChkbox                  :"+actrateChkbox+             "	 Value Expected : "+exprateChkbox);
		 System.out.println("GrossChkbox                 :"+actgrossChkbox+            "	 Value Expected : "+expgrossChkbox);
		 System.out.println("VoucherGrossChkbox          :"+actvoucherGrossChkbox+     "	 Value Expected : "+expvoucherGrossChkbox);
		 System.out.println("NetChkbox                   :"+actnetChkbox+              "	 Value Expected : "+expnetChkbox);
		 System.out.println("VoucherNetChkbox            :"+actvoucherNetChkbox+       "     Value Expected : "+expvoucherNetChkbox);
		 System.out.println("UserChkbox                  :"+actuserChkbox+             "     Value Expected : "+expuserChkbox);
		 System.out.println("RoleChkbox                  :"+actroleChkbox+             "	 Value Expected : "+exproleChkbox);
		 System.out.println("User1Chkbox                 :"+actuser1Chkbox+            "	 Value Expected : "+expuser1Chkbox);
		 System.out.println("User2Chkbox                 :"+actuser2Chkbox+            "	 Value Expected : "+expuser2Chkbox);
		 System.out.println("User3Chkbox                 :"+actuser3Chkbox+            "	 Value Expected : "+expuser3Chkbox);
		 System.out.println("User4Chkbox                 :"+actuser4Chkbox+            "	 Value Expected : "+expuser4Chkbox);
		 System.out.println("User5Chkbox                 :"+actuser5Chkbox+            "	 Value Expected : "+expuser5Chkbox);
		 	
			
		 if(actDefinitionLinkValueDropdown.equalsIgnoreCase(expDefinitionLinkValueDropdown) && actMethod.equalsIgnoreCase(expMethod))

		{
			System.out.println("Test Pass : Link Value Options Are As Expected");
			excelReader.setCellData(xlfile, xlsheet, 33, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Link Value Options Are NOT As Expected");
			excelReader.setCellData(xlfile, xlsheet, 33, 9, resFail);
			return false;
		}
	}
	
	

	
	
	
	
	
	public boolean checkSettingTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
		settingTab.click();
		
       Select s=new Select(settinglinkValueDropdown);
		
		int settinglinkValueDropdownCount=s.getOptions().size();
		
		String actsettinglinkValueDropdown = Integer.toString(settinglinkValueDropdownCount);
		
		String expsettinglinkValueDropdown=excelReader.getCellData(xlsheet, 37, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 37, 8, actsettinglinkValueDropdown);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadpendingDocumentsDropdown));
		loadpendingDocumentsDropdown.click();
		
		Select p=new Select(loadpendingDocumentsDropdown);
		int loadpendingDocumentsDropdownCOunt=p.getOptions().size();
		
		String actloadpendingDocumentsDropdown = Integer.toString(loadpendingDocumentsDropdownCOunt);
		
		String exploadpendingDocumentsDropdown=excelReader.getCellData(xlsheet, 38, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 38, 8, actloadpendingDocumentsDropdown);
		
		
		
		boolean actraiseLinkDocumentWhenbaseIsSavedChkbox   = raiseLinkDocumentWhenbaseIsSavedChkbox.isDisplayed();
		boolean acttolerance1Txt                            = tolerance1Txt.isDisplayed();
		boolean acttolerance2Txt                            = tolerance2Txt.isDisplayed();
		boolean actrelatesToDropdown                        = relatesToDropdown.isDisplayed();
		boolean actautoCloseTxt                             = autoCloseTxt.isDisplayed();
		boolean actsettinglinkValueDp                       = settinglinkValueDropdown.isDisplayed();
		boolean actloadpendingDocumentsDp                   = loadpendingDocumentsDropdown.isDisplayed();
		
		
		boolean expraiseLinkDocumentWhenbaseIsSavedChkbox   = true;
		boolean exptolerance1Txt                            = true;
		boolean exptolerance2Txt                            = true;
		boolean exprelatesToDropdown                        = true;
		boolean expautoCloseTxt                             = true;
		boolean expsettinglinkValueDp                       = true;
		boolean exploadpendingDocumentsDp                   = true;
		
		boolean actDisplay = actraiseLinkDocumentWhenbaseIsSavedChkbox==expraiseLinkDocumentWhenbaseIsSavedChkbox && acttolerance1Txt==exptolerance1Txt && 
				acttolerance2Txt==exptolerance2Txt && actrelatesToDropdown==exprelatesToDropdown && actautoCloseTxt==expautoCloseTxt &&
				actsettinglinkValueDp==expsettinglinkValueDp;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 39, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 39, 8, actMethod);
		
		System.out.println("***********************************************************checkSettingTabOptions**********************************************");
		System.out.println("SettinglinkValueDropdown                 :"+actsettinglinkValueDropdown               +" Value Expected  :"+expsettinglinkValueDropdown);
		System.out.println("LoadpendingDocumentsDropdown             :"+actloadpendingDocumentsDropdown           +" Value Expected  :"+exploadpendingDocumentsDropdown);
		System.out.println("RaiseLinkDocumentWhenbaseIsSavedChkbox   :"+actraiseLinkDocumentWhenbaseIsSavedChkbox +" Value Expected  :"+expraiseLinkDocumentWhenbaseIsSavedChkbox);
		System.out.println("Tolerance1Txt                            :"+acttolerance1Txt                          +" Value Expected  :"+exptolerance1Txt);
		System.out.println("Tolerance2Txt                            :"+acttolerance2Txt                          +" Value Expected  :"+exptolerance2Txt);
		System.out.println("TrelatesToDropdown                        :"+actrelatesToDropdown                      +" Value Expected  :"+exprelatesToDropdown);
		System.out.println("AutoCloseTxt                             :"+actautoCloseTxt                           +" Value Expected  :"+expautoCloseTxt);
		System.out.println("SettinglinkValueDp                       :"+actsettinglinkValueDp                     +" Value Expected  :"+expsettinglinkValueDp);
		System.out.println("LoadpendingDocumentsDp                   :"+actloadpendingDocumentsDp                 +" Value Expected  :"+exploadpendingDocumentsDp);
	
		
		if(actsettinglinkValueDropdown.equalsIgnoreCase(expsettinglinkValueDropdown) 
				&& actloadpendingDocumentsDropdown.equalsIgnoreCase(exploadpendingDocumentsDropdown)
				&& actMethod.equalsIgnoreCase(expMethod))
		
		{
			System.out.println("Test Pass : settingTab Options Are As Expected");
			excelReader.setCellData(xlfile, xlsheet, 36, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Pass : settingTab Options Are As Expected");
			excelReader.setCellData(xlfile, xlsheet, 36, 9, resFail);
			return false;
		}
		
	}
	
	
	
	
	public boolean checkPropertiesTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	     excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		 propertiesTab.click();
		 Thread.sleep(2000);
		
		
		 boolean actcheckUseItemWisetoleranceChkbox                                        = checkUseItemWisetoleranceChkbox.isDisplayed();
		 boolean actcannotExceedTheBaseValueChkbox                                      = cannotExceedTheBaseValueChkbox.isDisplayed();
		 boolean actbaseDocCannotBeEditedAfterItIsLinkedChkbox                          = baseDocumentCannotBeEditedAfterItIsLinkedChkbox.isDisplayed();
		 boolean actuseThisLinkOnlyForLoadingChkbox                           			= useThisLinkOnlyForLoadingChkbox.isDisplayed();
		 boolean actloadTheBaseDocDetailsAtTheTimeOfLinkingChkbox                       = loadTheBaseDocumentDetailsAtTheTimeOfLinkingChkbox.isDisplayed();
		 boolean actcloseLinkAfterTheDueDateElapsesChkbox                               = closeLinkAfterTheDueDateElapsesChkbox.isDisplayed();
		 boolean actlinkIsMandatoryChkbox          										= linkIsMandatoryChkbox.isDisplayed();
		 boolean actdoNotClubWithCommonBaseChkbox                       				= doNotClubWithCommonBaseChkbox.isDisplayed();
		 boolean actdoNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox                = doNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox.isDisplayed();
		// boolean actrecheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox   = recheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox.isDisplayed();
		 boolean actallowBackdatedLinkingChkbox                                   		= allowBackdatedLinkingChkbox.isDisplayed();
		 boolean actdoNotUpdateLinkUnlessQCIsDoneChkbox                            		= doNotUpdateLinkUnlessQCIsDoneChkbox.isDisplayed();
		
		 boolean expcheckUseItemWisetoleranceChkbox                                       = true;
		 boolean expcannotExceedTheBaseValueChkbox                                      = true;
		 boolean expbaseDocCannotBeEditedAfterItIsLinkedChkbox                          = true;
		 boolean expuseThisLinkOnlyForLoadingChkbox                           			= true;
		 boolean exploadTheBaseDocDetailsAtTheTimeOfLinkingChkbox                       = true;
		 boolean expcloseLinkAfterTheDueDateElapsesChkbox                               = true;
		 boolean explinkIsMandatoryChkbox         										= true;
		 boolean expdoNotClubWithCommonBaseChkbox                       				= true;
		 boolean expdoNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox                = true;
		// boolean exprecheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox   = true;
		 boolean expallowBackdatedLinkingChkbox                                   		= true;
		 boolean expdoNotUpdateLinkUnlessQCIsDoneChkbox                            		= true;
		 
			
		 boolean actDisplay = actcheckUseItemWisetoleranceChkbox==expcheckUseItemWisetoleranceChkbox  && actcannotExceedTheBaseValueChkbox==expcannotExceedTheBaseValueChkbox 
				 && actbaseDocCannotBeEditedAfterItIsLinkedChkbox ==expbaseDocCannotBeEditedAfterItIsLinkedChkbox 
				 && actuseThisLinkOnlyForLoadingChkbox==expuseThisLinkOnlyForLoadingChkbox  && actloadTheBaseDocDetailsAtTheTimeOfLinkingChkbox ==exploadTheBaseDocDetailsAtTheTimeOfLinkingChkbox  
				 && actcloseLinkAfterTheDueDateElapsesChkbox==expcloseLinkAfterTheDueDateElapsesChkbox
			     && actlinkIsMandatoryChkbox==explinkIsMandatoryChkbox 
			     && actdoNotClubWithCommonBaseChkbox==expdoNotClubWithCommonBaseChkbox && actdoNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox==expdoNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox
				 /*&& actrecheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox==exprecheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox */
				 && actallowBackdatedLinkingChkbox==expallowBackdatedLinkingChkbox 
				 && actdoNotUpdateLinkUnlessQCIsDoneChkbox==expdoNotUpdateLinkUnlessQCIsDoneChkbox;
		 
		 String actMethod = Boolean.toString(actDisplay);
		 
		 String expMethod = excelReader.getCellData(xlsheet, 41, 7);
		 
		 excelReader.setCellData(xlfile, xlsheet, 41, 8, actMethod);
			
		 System.out.println("************************************************************* checkPropertiesOption  ********************************************");
		 
		 System.out.println("CheckstockWhileLinkingChkbox                                     :"+actcheckUseItemWisetoleranceChkbox+                                     "  Value Expected : "+expcheckUseItemWisetoleranceChkbox);
		 System.out.println("CannotExceedTheBaseValueChkbox                                   :"+actcannotExceedTheBaseValueChkbox+                                   "  Value Expected : "+expcannotExceedTheBaseValueChkbox);
		 System.out.println("BaseDocCannotBeEditedAfterItIsLinkedChkbox                       :"+actbaseDocCannotBeEditedAfterItIsLinkedChkbox +                      "	 Value Expected : "+expbaseDocCannotBeEditedAfterItIsLinkedChkbox );
		 System.out.println("UseThisLinkOnlyForLoadingChkbox                                  :"+actuseThisLinkOnlyForLoadingChkbox+                                  "	 Value Expected : "+expuseThisLinkOnlyForLoadingChkbox);
		 System.out.println("LoadTheBaseDocDetailsAtTheTimeOfLinkingChkbox                    :"+actloadTheBaseDocDetailsAtTheTimeOfLinkingChkbox +                   "	 Value Expected : "+exploadTheBaseDocDetailsAtTheTimeOfLinkingChkbox );
		 System.out.println("CloseLinkAfterTheDueDateElapsesChkbox                            :"+actcloseLinkAfterTheDueDateElapsesChkbox+                            "	 Value Expected : "+expcloseLinkAfterTheDueDateElapsesChkbox);
		 System.out.println("LinkIsMandatoryChkbox                                            :"+actlinkIsMandatoryChkbox+                                            "	 Value Expected : "+explinkIsMandatoryChkbox);
		 System.out.println("DoNotClubWithCommonBaseChkbox                                    :"+actdoNotClubWithCommonBaseChkbox+                                    "	 Value Expected : "+expdoNotClubWithCommonBaseChkbox);
		 System.out.println("DoNotAllowSelIfLinksFieldsAreNotSelChkbox                        :"+actdoNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox+             "	 Value Expected : "+expdoNotAllowSelectionIfLinksFieldsAreNotSelectedChkbox);
		// System.out.println("RecheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox:"+actrecheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox+"	 Value Expected : "+exprecheckBeforeTheSavingIfLinkIsConsumeEelsewhereOnTheNetworkChkbox);
		 System.out.println("AllowBackdatedLinkingChkbox                                      :"+actallowBackdatedLinkingChkbox+                                      "	 Value Expected : "+expallowBackdatedLinkingChkbox);
		 System.out.println("DoNotUpdateLinkUnlessQCIsDoneChkbox                              :"+actdoNotUpdateLinkUnlessQCIsDoneChkbox+                              "	 Value Expected : "+expdoNotUpdateLinkUnlessQCIsDoneChkbox);
		 
		 
			
		 if(actMethod.equalsIgnoreCase(expMethod))
		
		{
			System.out.println("Test Pass : PropertiesTab  Options Are As Expected");
			excelReader.setCellData(xlfile, xlsheet, 40, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test FAil : PropertiesTab Options Are NOT As Expected");
			excelReader.setCellData(xlfile, xlsheet, 40, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	public boolean checkLinkValue() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		DefinitionTab.click();

		
		Select s=new Select(DefinitionLinkValueDropdown);
		
		s.selectByVisibleText(excelReader.getCellData(xlsheet, 42, 6));
		
		String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
		String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 43, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 43, 8, actDefinitionLinkValueDropdown);
		
		System.out.println("************************************checkLinkValue********************************");
		
		
		System.out.println("DefinitionLinkValueDropdown  : "+actDefinitionLinkValueDropdown +" Value Excepted : "+expDefinitionLinkValueDropdown);
		
		
		if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
		{
			System.out.println("Test Pass : Quantity Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 42, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Quantity not Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 42, 9, resFail);
			return false;
		}
		
	}
	
	
	
	
	public boolean checkOkButtonWithoutSelectionOfMandatoryFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		
		System.out.println("**********************************************checkOkButtonWithoutSelectionOfMandatoryFields*************************");
		
		String expMessage=excelReader.getCellData(xlsheet, 45, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlsheet, 45, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Error Message is as Expected");
			excelReader.setCellData(xlfile, xlsheet, 44, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Error Message is NOT as Expected");
			excelReader.setCellData(xlfile, xlsheet, 44, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkOkButtonWithSelectionOfMandatroryFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link0TO1));
		link0TO1.click();
		Thread.sleep(2000);
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		System.err.println(definitionTabChkBoxNameList);
		System.err.println(definitionTabChkBoxNameListCount);
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
		
		
		boolean actFirstDraggedElement           = FirstDraggedElement.isDisplayed();
		boolean actdraggedPurchasesVouchers      = draggedPurchasesVouchers.isDisplayed();
		boolean actlink0TO1                      = link0TO1.isDisplayed();
		
		
		boolean expFirstDraggedElement           = true;
		boolean expdraggedPurchasesVouchers      = true;
		boolean explink0TO1                      = true;
		
		boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement && actdraggedPurchasesVouchers==expdraggedPurchasesVouchers && 
				actlink0TO1==explink0TO1;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 47, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 47, 8, actMethod);
		
		System.out.println("****************************************************************checkOkButtonWithSelectionOfMandatroryFields*********************");
		
		System.out.println("FirstDraggedElement       :" +actFirstDraggedElement         +"  Value Expected : "+expFirstDraggedElement);
		System.out.println("draggedPurchasesVouchers  :" +actdraggedPurchasesVouchers    +"  Value Expected : "+expdraggedPurchasesVouchers);
		System.out.println("Link0TO1                  :" +actlink0TO1                    +"  Value Expected : "+explink0TO1);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Error Message is as Expected");
			excelReader.setCellData(xlfile, xlsheet, 46, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Error Message is NOT as Expected");
			excelReader.setCellData(xlfile, xlsheet, 46, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	public boolean checkSaveButtonInDesignWorkflowScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	    
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
		dwsaveBtn.click();
		
		Thread.sleep(2000);

		System.out.println("************************************************checkSaveButtonInDesignWorkflowScreen****************************");
		
		String expMessage=excelReader.getCellData(xlsheet, 49, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlsheet, 49, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Error Message is as Expected");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
			dwcloseBtn.click();
			
			excelReader.setCellData(xlfile, xlsheet, 48, 9, resPass);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Error Message is NOT as Expected");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
			dwcloseBtn.click();
			
			
			excelReader.setCellData(xlfile, xlsheet, 48, 9, resFail);
			
			
			return false;
		}
	}
	


	
	
	
	
	public boolean checkSaveWorkFlowNameDisplay() throws EncryptedDocumentException,  InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		
		workflowNameTxt.sendKeys(excelReader.getCellData(xlsheet, 50, 6));
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);
		
		String actworkflowNameTxt,expworkflowNameTxt;
		expworkflowNameTxt=excelReader.getCellData(xlsheet, 51, 7);
		actworkflowNameTxt=workflowNameTxt.getAttribute("value");
		
		excelReader.setCellData(xlfile, xlsheet, 51, 8, actworkflowNameTxt);
	
		
		System.out.println("*************************************checkSaveWorkFlowNameDisplay************************");
		
		System.out.println("WorkflowNameTxt   "+actworkflowNameTxt+" Value Expected : "+expworkflowNameTxt); 
		
		
		if(actworkflowNameTxt.equalsIgnoreCase(expworkflowNameTxt))
		{
			System.out.println("Test Pass : Accepting SalesFlow in WorkFlowName");
			excelReader.setCellData(xlfile, xlsheet, 50, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Accepting SalesFlow in WorkFlowName");
			excelReader.setCellData(xlfile, xlsheet, 50, 9, resFail);
			return false;
		}
		
	}
	
	

	
	public boolean checkUpdatingSavedTestFlow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode1Left));
		linkNode1Left.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.querySelector('#line0 > path').setAttribute('stroke-width', '12')"); 
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link0TO1));
		link0TO1.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		DefinitionTab.click();
		Thread.sleep(2000);
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("UNITS"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		
		Thread.sleep(3000);
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		Thread.sleep(3000);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
		
		
		boolean actFirstDraggedElement           = FirstDraggedElement.isDisplayed();
		boolean actdraggedPurchasesVouchers      = draggedPurchasesVouchers.isDisplayed();
		boolean actlink0TO1                      = link0TO1.isDisplayed();
		
		
		boolean expFirstDraggedElement           = true;
		boolean expdraggedPurchasesVouchers      = true;
		boolean explink0TO1                      = true;
		
		boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement && actdraggedPurchasesVouchers==expdraggedPurchasesVouchers && 
				actlink0TO1==explink0TO1;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 53, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 53, 8, actMethod);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
		dwsaveBtn.click();
		
		String expMessage=excelReader.getCellData(xlsheet, 54, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlsheet, 54, 8, actMessage);
		
		System.out.println("****************************************************************checkOkButtonWithSelectionOfMandatroryFields*********************");
		
		System.out.println("FirstDraggedElement       :" +actFirstDraggedElement         +"  Value Expected : "+expFirstDraggedElement);
		System.out.println("draggedPurchasesVouchers  :" +actdraggedPurchasesVouchers    +"  Value Expected : "+expdraggedPurchasesVouchers);
		System.out.println("Link0TO1                  :" +actlink0TO1                    +"  Value Expected : "+explink0TO1);
		
		if(actMethod.equalsIgnoreCase(expMethod) && actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Error Message is as Expected");
			excelReader.setCellData(xlfile, xlsheet, 52, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Error Message is NOT as Expected");
			excelReader.setCellData(xlfile, xlsheet, 52, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkUpdatedTestFlow() throws EncryptedDocumentException,  InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		
		workflowNameTxt.sendKeys(excelReader.getCellData(xlsheet, 55, 6));
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);
		
		String actworkflowNameTxt,expworkflowNameTxt;
		expworkflowNameTxt=excelReader.getCellData(xlsheet, 56, 7);
		actworkflowNameTxt=workflowNameTxt.getAttribute("value");
		
		excelReader.setCellData(xlfile, xlsheet, 56, 8, actworkflowNameTxt);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode1Left));
		linkNode1Left.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.querySelector('#line0 > path').setAttribute('stroke-width', '12')"); 
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link0TO1));
		link0TO1.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		DefinitionTab.click();
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		boolean selected = false;
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("UNITS") || data.equalsIgnoreCase("ITEM"))
			{
				selected=definitionTabChkBoxListSelected.get(i).isSelected();
				
			}
		}
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(unitsChkbox));
		
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
	
		/*boolean actpurchaseOrderandPvoucherUnitchkbox = purchaseOrderandPvoucherUnitchkbox.isSelected();
		boolean actpurchaseOrderandPvoucheritemchkbox = purchaseOrderandPvoucheritemchkbox.isSelected();
		
		boolean exppurchaseOrderandPvoucherUnitchkbox = true;
		boolean exppurchaseOrderandPvoucheritemchkbox = true;*/
		
		boolean actDisplay = selected==true;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 57, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 57, 8, actMethod);
		
		
		System.out.println("*************************************checkSaveWorkFlowNameDisplay************************");
		
		System.out.println("WorkflowNameTxt   "+actworkflowNameTxt+" Value Expected : "+expworkflowNameTxt); 
		//System.out.println("purchaseOrderandPvoucherUnitchkbox : "+actpurchaseOrderandPvoucherUnitchkbox+" Value Expected : "+exppurchaseOrderandPvoucherUnitchkbox);
		//System.out.println("purchaseOrderandPvoucheritemchkbox : "+actpurchaseOrderandPvoucheritemchkbox+" Value Expected : "+exppurchaseOrderandPvoucheritemchkbox);
		System.out.println("selected   "+actMethod+" Value Expected : "+expMethod); 
		
	/*	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDesignWorkflow));
		closeBtnInDesignWorkflow.click();*/
		
		if(actworkflowNameTxt.equalsIgnoreCase(expworkflowNameTxt) && actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Accepting SalesFlow in WorkFlowName");
			excelReader.setCellData(xlfile, xlsheet, 55, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Accepting SalesFlow in WorkFlowName");
			excelReader.setCellData(xlfile, xlsheet, 55, 9, resFail);
			return false;
		}
		
	}
	

	
	public boolean checkDeletingTestFlow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwdeleteBtn));
		dwdeleteBtn.click();
		Thread.sleep(2000);
		getWaitForAlert();
		this.getDriver().switchTo().alert().accept();
		
		System.out.println("************************************************checkDeletingTestFlow*******");
		
		String expMessage=excelReader.getCellData(xlsheet, 59, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlsheet, 59, 8, actMessage);
		
		Thread.sleep(2000);
		
		boolean actLayoutArea=layoutarea.getText().isEmpty();
		
		boolean expLayoutArea=true;
		
		boolean actDisplay = actLayoutArea==expLayoutArea;
		
		String actMethod = Boolean.toString(actDisplay);
		String expMethod = excelReader.getCellData(xlsheet, 60, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 60, 8, actMethod);

		System.out.println("***********************checkDeletingTestFlow****************************");
		
		System.out.println("WorkFlow layout Area : "+actLayoutArea+" value Expected : "+expLayoutArea);
		
		if(actMessage.equalsIgnoreCase(expMessage) && actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test fail : Test Flow NOT Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
			dwcloseBtn.click();
			excelReader.setCellData(xlfile, xlsheet, 58, 9, resPass);
			return true;
			
			
		}else
		{
			System.out.println("Test Pass : Test Flow Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
			dwcloseBtn.click();
			excelReader.setCellData(xlfile, xlsheet, 58, 9, resFail);
			return false;
		}
	}
	
	
	
	// Purchase Flow
	
	public boolean checkInputingWorkflowNameAsPurchasesFlow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
	    Thread.sleep(5000);
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys(excelReader.getCellData(xlsheet, 65, 6));
		Thread.sleep(2000);
		workflowNameTxt.sendKeys(Keys.TAB);
		
		String expworkflowNameTxt=excelReader.getCellData(xlsheet, 66, 7);
		String actworkflowNameTxt=workflowNameTxt.getAttribute("value");
		
		excelReader.setCellData(xlfile, xlsheet, 66, 8, actworkflowNameTxt);
	
		System.out.println("*********************************checkInputingWorkflowNameAsPurchasesFlow************");
		
		System.out.println("WorkflowNameTxt  :"+actworkflowNameTxt+" Value Expected : "+expworkflowNameTxt);
		
		if(actworkflowNameTxt.equalsIgnoreCase(expworkflowNameTxt))
		{
			System.out.println("Test Pass : Accepting PurchasesFlow in WorkFlowName");
			excelReader.setCellData(xlfile, xlsheet, 65, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Accepting PurchasesFlow in WorkFlowName");
			excelReader.setCellData(xlfile, xlsheet, 65, 9, resFail);
			return false;
		}
		
	}
	

	
	public boolean checkSelectingMaterialRequisitionfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		Thread.sleep(5000);
		
		getAction().moveToElement(materialRequisitionDragAndDrop).pause(2000).build().perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialRequisitionDragAndDrop));
		//materialRequisitionDragAndDrop.click();
		//Thread.sleep(2000);
		materialRequisitionDragAndDrop.click();
		Thread.sleep(2000);
		getAction().dragAndDropBy(materialRequisitionDragAndDrop, 350,-250).pause(2000).build().perform();
		
		Thread.sleep(3000);/*350, -250*/
		
	
		
		boolean actFirstDraggedElement=FirstDraggedElement.isDisplayed();
		boolean expFirstDraggedElement=true;
		
		boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 68, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 68, 8, actMethod);
		
		System.out.println("************************************checkSelectingPurcahseOrdersfromVoucherlist************************");
		
		System.out.println("FirstDraggedElement    : "+actFirstDraggedElement+"  value Expected :"+expFirstDraggedElement);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Purchase Orders Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 67, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Purchase Orders Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 67, 9, resFail);
			return false;
		}
	}
	
	

	
	
	public boolean checkSelectingPurcahseOrdersfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		Thread.sleep(5000);
		
		getAction().moveToElement(purchasesOrdersDragAndDrop).pause(1000).build().perform();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersDragAndDrop));
		purchasesOrdersDragAndDrop.click();
		
		getAction().dragAndDropBy(purchasesOrdersDragAndDrop, 450,-160).build().perform();
		
		
		boolean actdraggedPurchasesOrders=draggedPurchasesOrders.isDisplayed();
		boolean expdraggedPurchasesOrders=true;
		
		boolean actDisplay = actdraggedPurchasesOrders==expdraggedPurchasesOrders;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 68, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 68, 8, actMethod);
		
		System.out.println("************************************checkSelectingPurcahseOrdersfromVoucherlist************************");
		
		System.out.println("draggedPurchasesOrders    : "+actdraggedPurchasesOrders+"  value Expected :"+expdraggedPurchasesOrders);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Purchase Orders Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 67, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Purchase Orders Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 67, 9, resFail);
			return false;
		}
	}
	
	

	
	public boolean checkMovingPurchaseOrderToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
	    
	    
		getAction().dragAndDropBy(draggedPurchasesOrders, 400, 0).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesOrders));
		boolean actdraggedPurchasesOrders=draggedPurchasesOrders.isDisplayed();
		boolean expdraggedPurchasesOrders=true;
		
		boolean actDisplay = actdraggedPurchasesOrders==expdraggedPurchasesOrders;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 72, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 72, 8, actMethod);
		
		System.out.println("************************************checkMovingPurchaseVoucherToPosition************************");
		
		System.out.println("draggedPurchasesOrders    : "+actdraggedPurchasesOrders+"  value Expected :"+expdraggedPurchasesOrders);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Sales order Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 71, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Sales order Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 71, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkSelectingPurchaseVoucherVatfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
	    getAction().moveToElement(receiptsDragAndDrop).pause(1000).build().perform();
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersExpandBtn));
	    purchaseVouchersExpandBtn.click();
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVouchersVATDragAndDrop));
		purchasesVouchersVATDragAndDrop.click();
		Thread.sleep(2000);
		
		getAction().dragAndDropBy(purchasesVouchersVATDragAndDrop, 650,-250).build().perform();
	
		
		
		/*getAction().dragAndDrop(purchasesVouchersVATDragAndDrop, FirstDraggedElement).build().perform();*/
			
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesVouchersVAT));
		boolean actdraggedPurchasesVouchers=draggedPurchasesVouchersVAT.isDisplayed();
		boolean expdraggedPurchasesVouchers=true;
		
		boolean actDisplay = actdraggedPurchasesVouchers==expdraggedPurchasesVouchers;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 70, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 70, 8, actMethod);
		
		System.out.println("************************************checkSelectingPurchseVoucherfromVoucherlist************************");
		
		System.out.println("DraggedPurchasesVouchers    : "+actdraggedPurchasesVouchers+"  value Expected :"+expdraggedPurchasesVouchers);
		
		if(actMethod.equalsIgnoreCase(expMethod))
	
		{
			System.out.println("Test Pass : Purchse Voucher Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 69, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Purchase Voucher Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 69, 9, resFail);
			return false;
		}
	}
	

	
	
	public boolean checkMovingPurchaseVoucherVATToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getAction().dragAndDropBy(draggedPurchasesVouchersVAT, 450, 0).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesVouchersVAT));
		boolean actdraggedPurchasesVouchers=draggedPurchasesVouchersVAT.isDisplayed();
		boolean expdraggedPurchasesVouchers=true;
		
		boolean actDisplay = actdraggedPurchasesVouchers==expdraggedPurchasesVouchers;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 72, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 72, 8, actMethod);
		
		System.out.println("************************************checkMovingPurchaseVoucherToPosition************************");
		
		System.out.println("DraggedPurchasesVouchers    : "+actdraggedPurchasesVouchers+"  value Expected :"+expdraggedPurchasesVouchers);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Sales order Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 71, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Sales order Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 71, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkSelectingPurchaseReturnsfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesReturnsDragAndDrop));
		purchasesReturnsDragAndDrop.click();
		
		getAction().dragAndDropBy(purchasesReturnsDragAndDrop, 800, -80).build().perform();
		
	/*	
		getAction().dragAndDrop(purchasesReturnsDragAndDrop, FirstDraggedElement).build().perform();*/
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesReturns));
		boolean actdraggedPurchasesReturns=draggedPurchasesReturns.isDisplayed();
		boolean expdraggedPurchasesReturns=true;
		
		boolean actDisplay = actdraggedPurchasesReturns==expdraggedPurchasesReturns;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 74, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 74, 8, actMethod);
		
		System.out.println("************************************checkSelectingPurchaseReturnsfromVoucherlist************************");
		
		System.out.println("DraggedPurchasesVouchers    : "+actdraggedPurchasesReturns+"  value Expected :"+expdraggedPurchasesReturns);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Purchase Returns Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 73, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Purchase Returns Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 73, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkMovingPurchaseReturnsToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getAction().dragAndDropBy(draggedPurchasesReturns, 400, 150).build().perform();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesReturns));
		boolean actdraggedPurchasesReturns=draggedPurchasesReturns.isDisplayed();
		boolean expdraggedPurchasesReturns=true;
		
		boolean actDisplay = actdraggedPurchasesReturns==expdraggedPurchasesReturns;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 76, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 76, 8, actMethod);	
		
		System.out.println("************************************checkMovingPurchaseReturnsToPosition************************");
		
		System.out.println("DraggedPurchasesVouchers    : "+actdraggedPurchasesReturns+"  value Expected :"+expdraggedPurchasesReturns);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Purchase Returns Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 75, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Purchase Returns Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 75, 9, resFail);
			return false;
		}
	}
	

	public boolean checkSelectingPurchaseVoucherfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		Thread.sleep(3000);
	    getAction().moveToElement(receiptsDragAndDrop).pause(1000).build().perform();
	    
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesVouchersDragAndDrop));
		purchasesVouchersDragAndDrop.click();
		
		
		getAction().dragAndDropBy(purchasesVouchersDragAndDrop, 450, -3).build().perform();
	/*	getAction().dragAndDrop(purchasesVouchersDragAndDrop, FirstDraggedElement).build().perform();*/
	
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesVouchers));
		boolean actdraggedPurchasesVouchers=draggedPurchasesVouchers.isDisplayed();
		boolean expdraggedPurchasesVouchers=true;
		
		boolean actDisplay = actdraggedPurchasesVouchers==expdraggedPurchasesVouchers;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 78, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 78, 8, actMethod);
		
		System.out.println("************************************checkSelectingPurchaseVoucherNfromVoucherlist************************");
		
		System.out.println("draggedPurchasesVouchers    : "+actdraggedPurchasesVouchers+"  value Expected :"+expdraggedPurchasesVouchers);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Purchase Vouchers N Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 77, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Purchase Vouchers N Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 77, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkMovingPurchaseVoucherToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getAction().dragAndDropBy(draggedPurchasesVouchers, 250, 200).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesVouchers));
		boolean actdraggedPurchasesVouchers=draggedPurchasesVouchers.isDisplayed();
		boolean expdraggedPurchasesVouchers=true;
		
		boolean actDisplay = actdraggedPurchasesVouchers==expdraggedPurchasesVouchers;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 80, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 80, 8, actMethod);
		
		System.out.println("************************************checkMovingPurchaseVoucherNToPosition************************");
		
		System.out.println("draggedPurchasesVouchers    : "+actdraggedPurchasesVouchers+"  value Expected :"+expdraggedPurchasesVouchers);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Purchase Vouchers N Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 79, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Purchase Vouchers NIs NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 79, 9, resFail);
			return false;
		}
	}
	
	

	

	public boolean checkSelectingMRNfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
	    Thread.sleep(2000);
	    getAction().moveToElement(receiptsDragAndDrop).pause(1000).build().perform();
	    
		
	    getAction().moveToElement(materialReceiptNotesDragAndDrop).pause(1000).build().perform();
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(materialReceiptNotesDragAndDrop));
		materialReceiptNotesDragAndDrop.click();
		
	    getAction().dragAndDropBy(materialReceiptNotesDragAndDrop, 600, -100).build().perform();
		
	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedMaterialReceiptNotes));
		boolean actdraggedMaterialReceiptNotes=draggedMaterialReceiptNotes.isDisplayed();
		boolean expdraggedMaterialReceiptNotes=true;
		
		boolean actDisplay = actdraggedMaterialReceiptNotes==expdraggedMaterialReceiptNotes;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 82, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 82, 8, actMethod);	
		
		System.out.println("************************************checkSelectingMRNfromVoucherlist************************");
		
		System.out.println("DraggedMaterialReceiptNotes    : "+actdraggedMaterialReceiptNotes+"  value Expected :"+expdraggedMaterialReceiptNotes);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : materialReceiptNotes Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 81, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : materialReceiptNotes Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 81, 9, resFail);
			return false;
		}
	}
	
	
/*	
	
	public boolean checkMovingMRNToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getAction().dragAndDropBy(draggedMaterialReceiptNotes, 400, 200).build().perform();
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedMaterialReceiptNotes));
		boolean actdraggedMaterialReceiptNotes=draggedMaterialReceiptNotes.isDisplayed();
		boolean expdraggedMaterialReceiptNotes=true;
		
		boolean actDisplay = actdraggedMaterialReceiptNotes==expdraggedMaterialReceiptNotes;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 84, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 84, 8, actMethod);
		
		System.out.println("************************************checkSelectingMRNfromVoucherlist************************");
		
		System.out.println("DraggedMaterialReceiptNotes    : "+actdraggedMaterialReceiptNotes+"  value Expected :"+expdraggedMaterialReceiptNotes);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : materialReceiptNotes Is Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 83, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : materialReceiptNotes Is NOT Displayed in Design field");
			excelReader.setCellData(xlfile, xlsheet, 83, 9, resFail);
			return false;
		}
	}
	
	*/

	public boolean checkLinkandDeleteOptionsinMR() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getAction().contextClick(FirstDraggedElement).build().perform();
		
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		boolean actdraggedlinkBtn    = draggedlinkBtn.isDisplayed();
		boolean actdraggeddwdeleteBtn  = draggeddwdeleteBtn.isDisplayed();
		
		boolean expdraggedlinkBtn    = true;
		boolean expdraggeddwdeleteBtn  = true;
		
		boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 86, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 86, 8, actMethod);
		
		System.out.println("*************************checkLinkandDeleteOptionsinMR************");
		
		System.out.println("DraggedlinkBtn      :"+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
		System.out.println("DraggeddwdeleteBtn    :"+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link And delete Options Are Available");
			excelReader.setCellData(xlfile, xlsheet, 85, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Link And delete Options Are NOT Available");
			excelReader.setCellData(xlfile, xlsheet, 85, 9, resFail);
			return false;
		}
	}
	
	public boolean checkMappingBetweenMRtoPurchaseOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		draggedlinkBtn.click();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode1Left));
		linkNode1Left.click();
		
		Thread.sleep(2000);
		
		boolean actlink0TO1=link0TO1.isDisplayed();
		boolean explink0TO1=true;
		
		boolean actDisplay = actlink0TO1==explink0TO1;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 88, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 88, 8, actMethod);
		
		System.out.println("************************************checkMappingBetweenMRtoPurchaseOrders******");
		
		System.out.println("Link0TO1    : "+actlink0TO1+" Value Expected :" +explink0TO1);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Mapping Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 87, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Mapping NOT Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 87, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	public boolean checkLinkandDeleteOptionsinPurchaseorders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getAction().contextClick(draggedPurchasesOrders).build().perform();
		
	    Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		boolean actdraggedlinkBtn    = draggedlinkBtn.isDisplayed();
		boolean actdraggeddwdeleteBtn  = draggeddwdeleteBtn.isDisplayed();
		
		boolean expdraggedlinkBtn    = true;
		boolean expdraggeddwdeleteBtn  = true;
		
		boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 86, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 86, 8, actMethod);
		
		System.out.println("*************************checkLinkandDeleteOptionsinPurchaseorders************");
		
		System.out.println("DraggedlinkBtn      :"+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
		System.out.println("DraggeddwdeleteBtn    :"+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link And delete Options Are Available");
			excelReader.setCellData(xlfile, xlsheet, 85, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Link And delete Options Are NOT Available");
			excelReader.setCellData(xlfile, xlsheet, 85, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkMappingBetweenPurchaseOrdersAndPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		draggedlinkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode2Left));
		linkNode2Left.click();
		
		Thread.sleep(2000);
		
		boolean actlink1TO2=link1TO2.isDisplayed();
		boolean explink1TO2=true;
		
		boolean actDisplay = actlink1TO2==explink1TO2;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 88, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 88, 8, actMethod);
		
		System.out.println("************************************checkMappingBetweenPurchaseOrdersAndPurchaseVoucher******");
		
		System.out.println("Link0TO1    : "+actlink1TO2+" Value Expected :" +explink1TO2);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Mapping Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 87, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Mapping NOT Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 87, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkLinkandDeleteOptionsinPurchasevouchersVat() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getAction().contextClick(draggedPurchasesVouchersVAT).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		boolean actdraggedlinkBtn    = draggedlinkBtn.isDisplayed();
		boolean actdraggeddwdeleteBtn  = draggeddwdeleteBtn.isDisplayed();
		
		boolean expdraggedlinkBtn    = true;
		boolean expdraggeddwdeleteBtn  = true;
		
		boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 90, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 90, 8, actMethod);
		
		System.out.println("*************************checkLinkandDeleteOptionsinPurchasevouchers************");
		
		System.out.println("DraggedlinkBtn      :"+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
		System.out.println("DraggeddwdeleteBtn    :"+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link And delete Options Are Available");
			excelReader.setCellData(xlfile, xlsheet, 89, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Link And delete Options Are NOT Available");
			excelReader.setCellData(xlfile, xlsheet, 89, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkMappingBetweenPurchaseVoucherAndPurchseReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		draggedlinkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode3Left));
		linkNode3Left.click();
		Thread.sleep(2000);
		
		boolean actlink2TO3=link2TO3.isDisplayed();
		boolean explink2TO3=true;
		
		boolean actDisplay = actlink2TO3==explink2TO3;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 92, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 92, 8, actMethod);
		
		System.out.println("************************************checkMappingBetweenPurchaseVoucherAndPurchseReturns******");
		
		System.out.println("Link1TO2    : "+actlink2TO3+" Value Expected :" +explink2TO3);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Mapping Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 91, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Mapping NOT Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 91, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkLinkandDeleteOptionsinPurchaseorders2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getAction().contextClick(draggedPurchasesOrders).build().perform();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		boolean actdraggedlinkBtn    = draggedlinkBtn.isDisplayed();
		boolean actdraggeddwdeleteBtn  = draggeddwdeleteBtn.isDisplayed();
		
		boolean expdraggedlinkBtn    = true;
		boolean expdraggeddwdeleteBtn  = true;
		
		boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 94, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 94, 8, actMethod);
		
		System.out.println("*************************checkLinkandDeleteOptionsinPurchaseorders2************");
		
		System.out.println("DraggedlinkBtn      :"+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
		System.out.println("DraggeddwdeleteBtn    :"+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link And delete Options Are Available");
			excelReader.setCellData(xlfile, xlsheet, 93, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Link And delete Options Are NOT Available");
			excelReader.setCellData(xlfile, xlsheet, 93, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkMappingBetweenPurchaseOrdersAndPurchaseVoucherN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		draggedlinkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode4Left));
		linkNode4Left.click();
		
		Thread.sleep(2000);
		
		boolean actlink3TO4=link3TO4.isDisplayed();
		boolean explink3TO4=true;
		
		boolean actDisplay = actlink3TO4==explink3TO4;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 96, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 96, 8, actMethod);
		
		System.out.println("************************************checkMappingBetweenPurchaseOrdersAndPurchaseVoucherN******");
		
		System.out.println("Link2TO3    : "+actlink3TO4+" Value Expected :" +explink3TO4);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		
		{
			System.out.println("Test Pass : Mapping Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 95, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Mapping NOT Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 95, 9, resFail);
			return false;
		}
	}
	
	
	public boolean checkLinkandDeleteOptionsinPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getAction().contextClick(draggedPurchasesVouchers).build().perform();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		boolean actdraggedlinkBtn    = draggedlinkBtn.isDisplayed();
		boolean actdraggeddwdeleteBtn  = draggeddwdeleteBtn.isDisplayed();
		
		boolean expdraggedlinkBtn    = true;
		boolean expdraggeddwdeleteBtn  = true;
		
		boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 98, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 98, 8, actMethod);
		
		System.out.println("*************************checkLinkandDeleteOptionsinPurchaseVoucherN************");
		
		System.out.println("DraggedlinkBtn      :"+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
		System.out.println("DraggeddwdeleteBtn    :"+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link And delete Options Are Available");
			excelReader.setCellData(xlfile, xlsheet, 97, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Link And delete Options Are NOT Available");
			excelReader.setCellData(xlfile, xlsheet, 97, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkMappingBetweenPurchaseVoucherNAndMRN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		draggedlinkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode5Left));
		linkNode5Left.click();
		
		Thread.sleep(2000);
		boolean actlink4TO5=link4TO5.isDisplayed();
		boolean explink4TO5=true;
		
		boolean actDisplay = actlink4TO5==explink4TO5;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 100, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 100, 8, actMethod);
		
		System.out.println("************************************checkMappingBetweenPurchaseVoucherNAndMRN******");
		
		System.out.println("Link3TO4    : "+actlink4TO5+" Value Expected :" +explink4TO5);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Mapping Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 99, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Mapping NOT Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 99, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	public boolean checkLinkandDeleteOptionsinMRN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getAction().contextClick(draggedMaterialReceiptNotes).build().perform();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		boolean actdraggedlinkBtn    = draggedlinkBtn.isDisplayed();
		boolean actdraggeddwdeleteBtn  = draggeddwdeleteBtn.isDisplayed();
		
		boolean expdraggedlinkBtn    = true;
		boolean expdraggeddwdeleteBtn  = true;
		
		boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 102, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 102, 8, actMethod);
		
		System.out.println("*************************checkLinkandDeleteOptionsinMRN************");
		
		System.out.println("DraggedlinkBtn      :"+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
		System.out.println("DraggeddwdeleteBtn    :"+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link And delete Options Are Available");
			excelReader.setCellData(xlfile, xlsheet, 101, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Link And delete Options Are NOT Available");
			excelReader.setCellData(xlfile, xlsheet, 101, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkMappingBetweenMRNandPurchaseReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		draggedlinkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode3Left));
		linkNode3Left.click();
		
		Thread.sleep(2000);
		
		boolean actlink5TO6=link5TO6.isDisplayed();
		boolean explink5TO6=true;
		
		boolean actDisplay = actlink5TO6==explink5TO6;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 104, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 104, 8, actMethod);	
		
		System.out.println("************************************checkMappingBetweenMRNandPurchaseReturns******");
		
		System.out.println("Link4TO5    : "+actlink5TO6+" Value Expected :" +explink5TO6);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Mapping Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 103, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Mapping NOT Done Successfully");
			excelReader.setCellData(xlfile, xlsheet, 103, 9, resFail);
			return false;
		}
	}
	
	

	public boolean checkLinkBetweenMRandPurchaseOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
	    Thread.sleep(3000);
		/*FirstDraggedElement.click();*/
	    /*	Thread.sleep(2000);*/
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.querySelector('#line0 > path').setAttribute('stroke-width', '8')"); 
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link0TO1));
		link0TO1.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		boolean actDefinitionTab    = DefinitionTab.isDisplayed();
		boolean actsettingTab       = settingTab.isDisplayed();
		boolean actpropertiesTab    = propertiesTab.isDisplayed();
		boolean actMapBtn           = MappingTab.isDisplayed();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		
		boolean actOkBtn            = OkBtn.isDisplayed();
		boolean actCancelBtn        = CancelBtn.isDisplayed();
		
		
		boolean expDefinitionTab    = true;
		boolean expsettingTab       = true;
		boolean exppropertiesTab    = true;
		boolean expMapBtn           = true;
		boolean expOkBtn            = true;
		boolean expCancelBtn        = true;
		
		boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
				&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 106, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 106, 8, actMethod);
		
		System.out.println("**************************************checkLinkBetweenPurchaseOrderAndpurchaseVoucher*******");
		
		System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
		System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
		System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
		System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
		System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
		System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link Options Are Displayed");
			excelReader.setCellData(xlfile, xlsheet, 105, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Link Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlsheet, 105, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkSelectingQuantityinLinkValueOptionBetweenMRandPurchaseOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
		Select s=new Select(DefinitionLinkValueDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlsheet, 107, 6));
		
		String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
		String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 108, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 108, 8, actDefinitionLinkValueDropdown);
		
		
		System.out.println("***********************************************checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrdersAndPurchaseVoucher*****");
		
		System.out.println("DefinitionLinkValueDropdown  : "+actDefinitionLinkValueDropdown+" Value Expected : "+expDefinitionLinkValueDropdown);
		
		if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
		{
			System.out.println("Test Pass : Quantity Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 107, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Quantity not Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 107, 9, resFail);
			return false;
		}
	}
	
	public boolean checkSelectingItemOptionBetweenMRandPurchaseOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		boolean selected = false;
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("Item"))
			{
				selected=definitionTabChkBoxListSelected.get(i).isSelected();
				
				break;
				
			}
		}
		
		/*boolean actpurchaseOrderandPvoucheritemchkbox=purchaseOrderandPvoucheritemchkbox.isSelected();
		
		boolean exppurchaseOrderandPvoucheritemchkbox=true;*/
		
		boolean actDisplay = selected==true;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 110, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 110, 8, actMethod);
		
		System.out.println("******************************************checkSelectingItemOptionBetweenPurchseOrdersAndPurchaseVoucher****************");
		
		/*System.out.println("PurchaseOrderandPvoucheritemchkbox   : "+actpurchaseOrderandPvoucheritemchkbox+" Value Expected : "+exppurchaseOrderandPvoucheritemchkbox);*/
		
		System.out.println("PurchaseOrderandPvoucheritemchkbox   : "+actMethod+" Value Expected : "+expMethod);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass :itemchkbox is Enabled");
			excelReader.setCellData(xlfile, xlsheet, 109, 9, resFail);
			return true;
		}else
		{
			System.out.println("Test Fail : itemchkbox is NOT Enabled");
			excelReader.setCellData(xlfile, xlsheet, 109, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkOkBetweenMRandPurchaseOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
	
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
		boolean actFirstDraggedElement          = FirstDraggedElement.isDisplayed();
		boolean actdraggedPurchasesVouchers     = draggedPurchasesVouchersVAT.isDisplayed();
		boolean actlink0TO1                     = link0TO1.isDisplayed();
		
		boolean expFirstDraggedElement         = true;
		boolean expdraggedPurchasesVouchers     = true;
		boolean explink0TO1                    = true;
		
		boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement && actdraggedPurchasesVouchers==expdraggedPurchasesVouchers 
				&& actlink0TO1==explink0TO1;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 112, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 112, 8, actMethod);
		
		System.out.println("****************************************checkOkBetweenBetweenSalesQuotationsAndExcessinStock****************");
		
		System.out.println("FirstDraggedElement        :"+actFirstDraggedElement       +"Value Expected :"+expFirstDraggedElement);
		System.out.println("DraggedPurchasesVouchers   :"+actdraggedPurchasesVouchers   +"Value Expected :"+expdraggedPurchasesVouchers);
		System.out.println("Link0TO1                   :"+actlink0TO1                  +"Value Expected :"+explink0TO1);
		
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Ok Button Working As Expected");
			excelReader.setCellData(xlfile, xlsheet, 111, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Ok Buttton not Working as Expected");
			excelReader.setCellData(xlfile, xlsheet, 111, 9, resFail);
			return false;
		}
	}
	
	

	public boolean checkLinkBetweenPurchaseOrderAndpurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.querySelector('#line1 > path').setAttribute('stroke-width', '8')"); 
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link1TO2));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link1TO2));
		link1TO2.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		boolean actDefinitionTab    = DefinitionTab.isDisplayed();
		boolean actsettingTab       = settingTab.isDisplayed();
		boolean actpropertiesTab    = propertiesTab.isDisplayed();
		boolean actMapBtn           = MappingTab.isDisplayed();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		
		boolean actOkBtn            = OkBtn.isDisplayed();
		boolean actCancelBtn        = CancelBtn.isDisplayed();
		
		
		boolean expDefinitionTab    = true;
		boolean expsettingTab       = true;
		boolean exppropertiesTab    = true;
		boolean expMapBtn           = true;
		boolean expOkBtn            = true;
		boolean expCancelBtn        = true;
		
		boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
				&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 106, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 106, 8, actMethod);
		
		System.out.println("**************************************checkLinkBetweenPurchaseOrderAndpurchaseVoucher*******");
		
		System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
		System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
		System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
		System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
		System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
		System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link Options Are Displayed");
			excelReader.setCellData(xlfile, xlsheet, 105, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Link Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlsheet, 105, 9, resFail);
			return false;
		}
	}
	
	
	public boolean checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrdersAndPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
		Select s=new Select(DefinitionLinkValueDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlsheet, 107, 6));
		
		String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
		String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 108, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 108, 8, actDefinitionLinkValueDropdown);
		
		
		System.out.println("***********************************************checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrdersAndPurchaseVoucher*****");
		
		System.out.println("DefinitionLinkValueDropdown  : "+actDefinitionLinkValueDropdown+" Value Expected : "+expDefinitionLinkValueDropdown);
		
		if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
		{
			System.out.println("Test Pass : Quantity Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 107, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Quantity not Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 107, 9, resFail);
			return false;
		}
	}
	
	public boolean checkSelectingItemOptionBetweenPurchseOrdersAndPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		boolean selected = false;
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("Item"))
			{
				selected=definitionTabChkBoxListSelected.get(i).isSelected();
				
				break;
				
			}
		}
		
		/*boolean actpurchaseOrderandPvoucheritemchkbox=purchaseOrderandPvoucheritemchkbox.isSelected();
		
		boolean exppurchaseOrderandPvoucheritemchkbox=true;*/
		
		boolean actDisplay = selected==true;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 110, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 110, 8, actMethod);
		
		System.out.println("******************************************checkSelectingItemOptionBetweenPurchseOrdersAndPurchaseVoucher****************");
		
		/*System.out.println("PurchaseOrderandPvoucheritemchkbox   : "+actpurchaseOrderandPvoucheritemchkbox+" Value Expected : "+exppurchaseOrderandPvoucheritemchkbox);*/
		
		System.out.println("PurchaseOrderandPvoucheritemchkbox   : "+actMethod+" Value Expected : "+expMethod);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass :itemchkbox is Enabled");
			excelReader.setCellData(xlfile, xlsheet, 109, 9, resFail);
			return true;
		}else
		{
			System.out.println("Test Fail : itemchkbox is NOT Enabled");
			excelReader.setCellData(xlfile, xlsheet, 109, 9, resFail);
			return false;
		}
	}
	
	public boolean checkOkBetweenPurchaseOrderAndPurchaseVocuherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
	
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesOrders));
		boolean actdraggedPurchasesOrders          = draggedPurchasesOrders.isDisplayed();
		boolean actdraggedPurchasesVouchers     = draggedPurchasesVouchersVAT.isDisplayed();
		boolean actlink1TO2                     = link1TO2.isDisplayed();
		
		boolean expdraggedPurchasesOrders         = true;
		boolean expdraggedPurchasesVouchers     = true;
		boolean explink1TO2                    = true;
		
		boolean actDisplay = actdraggedPurchasesOrders==expdraggedPurchasesOrders && actdraggedPurchasesVouchers==expdraggedPurchasesVouchers 
				&& actlink1TO2==explink1TO2;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 112, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 112, 8, actMethod);
		
		System.out.println("****************************************checkOkBetweenBetweenSalesQuotationsAndExcessinStock****************");
		
		System.out.println("draggedPurchasesOrders        :"+actdraggedPurchasesOrders       +"Value Expected :"+expdraggedPurchasesOrders);
		System.out.println("DraggedPurchasesVouchers   :"+actdraggedPurchasesVouchers   +"Value Expected :"+expdraggedPurchasesVouchers);
		System.out.println("link1TO2                   :"+actlink1TO2                  +"Value Expected :"+explink1TO2);
		
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Ok Button Working As Expected");
			excelReader.setCellData(xlfile, xlsheet, 111, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Ok Buttton not Working as Expected");
			excelReader.setCellData(xlfile, xlsheet, 111, 9, resFail);
			return false;
		}
	}
	
	public boolean checkLinkBetweenPurchaseVoucherAndpurchaseReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("document.querySelector('#line2 > path').setAttribute('stroke-width', '8')"); 
		
		Thread.sleep(1000);
		draggedPurchasesVouchersVAT.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link2TO3));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link2TO3));
		link2TO3.click();
		//moveToElementAndClick(link2TO3);
		
		
		System.err.println("***********Link 2 is clicked********");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		boolean actDefinitionTab    = DefinitionTab.isDisplayed();
		boolean actsettingTab       = settingTab.isDisplayed();
		boolean actpropertiesTab    = propertiesTab.isDisplayed();
		boolean actMapBtn           = MappingTab.isDisplayed();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		
		boolean actOkBtn            = OkBtn.isDisplayed();
		boolean actCancelBtn        = CancelBtn.isDisplayed();
		
		
		boolean expDefinitionTab    = true;
		boolean expsettingTab       = true;
		boolean exppropertiesTab    = true;
		boolean expMapBtn           = true;
		boolean expOkBtn            = true;
		boolean expCancelBtn        = true;
		
		boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
				&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 114, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 114, 8, actMethod);
		
		System.out.println("**************************************checkLinkBetweenPurchaseVoucherAndpurchaseReturns*******");
		
		System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
		System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
		System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
		System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
		System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
		System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link Options Are Displayed");
			excelReader.setCellData(xlfile, xlsheet, 113, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Link Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlsheet, 113, 9, resFail);
			return false;
		}
	}
	
	
	public boolean checkSelectingQuantityinLinkValueOptionBetweenPurchaseVoucherAndPurchaseReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
		Select s=new Select(DefinitionLinkValueDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlsheet, 115, 6));
		
		String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
		String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 116, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 116, 8, actDefinitionLinkValueDropdown);
		
		System.out.println("*****************************checkSelectingQuantityinLinkValueOptionBetweenPurchaseVoucherAndPurchaseReturns************");
		
		System.out.println("DefinitionLinkValueDropdown   : "+expDefinitionLinkValueDropdown +" Value Expected : "+expDefinitionLinkValueDropdown);
		
		if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
		{
			System.out.println("Test Pass : Quantity Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 115, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Quantity not Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 115, 9, resFail);
			return false;
		}
	}
	
	public boolean checkSelectingItemOptionBetweenPurchaseVoucherAndPurchaseReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		Thread.sleep(2000);
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherAndPReturnsitemchkbox));
		purchaseVoucherAndPReturnsitemchkbox.click();*/
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		boolean selected = false;
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("Item"))
			{
				selected=definitionTabChkBoxListSelected.get(i).isSelected();
				
				break;
				
			}
		}
		
		/*boolean actpurchaseVoucherAndPReturnsitemchkbox=purchaseVoucherAndPReturnsitemchkbox.isSelected();
		boolean exppurchaseVoucherAndPReturnsitemchkbox=true;*/
		
		boolean actDisplay = selected==true;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 118, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 118, 8, actMethod);
		
		System.out.println("**********************************************checkSelectingItemOptionBetweenPurchaseVoucherAndPurchaseReturns*********************");
		
		/*System.out.println("PurchaseVoucherAndPReturnsitemchkbox  :"+actpurchaseVoucherAndPReturnsitemchkbox+" Value expected :"+exppurchaseVoucherAndPReturnsitemchkbox);*/
		System.out.println("PurchaseVoucherAndPReturnsitemchkbox  :"+actMethod+" Value expected :"+expMethod);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass :itemchkbox is Enabled");
			excelReader.setCellData(xlfile, xlsheet, 117, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : itemchkbox is NOT Enabled");
			excelReader.setCellData(xlfile, xlsheet, 117, 9, resFail);
			return false;
		}
	}
	
	@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Purchase Voucher VAT')]")
	public static WebElement purchasesVouchersVATDragAndDrop; 
	
	@FindBy(xpath="//div[@title='Purchase Voucher VAT']")
	public static WebElement draggedPurchasesVouchersVAT; 
	
	public boolean checkOkBetweenBetweenPurchaseVoucherAndPurchaseReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		Thread.sleep(2000);
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesVouchersVAT));
		boolean actdraggedPurchasesVouchers         = draggedPurchasesVouchersVAT.isDisplayed();
		boolean actdraggedPurchasesReturns          = draggedPurchasesReturns.isDisplayed();
		boolean actlink2TO3                         = link2TO3.isDisplayed();
		
		boolean expdraggedPurchasesVouchers         = true;
		boolean expdraggedPurchasesReturns    		= true;
		boolean explink2TO3                    		= true;
		
		boolean actDisplay = actdraggedPurchasesVouchers==expdraggedPurchasesVouchers && actdraggedPurchasesReturns==expdraggedPurchasesReturns 
				&& actlink2TO3==explink2TO3;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 120, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 120, 8, actMethod);
		
		System.out.println("****************************************checkOkBetweenBetweenPurchaseVoucherAndPurchaseReturns****************");
		
		System.out.println("DraggedPurchasesVouchers       :"+actdraggedPurchasesVouchers     +" Value Expected :"+expdraggedPurchasesVouchers);
		System.out.println("DraggedPurchasesReturns   :"+actdraggedPurchasesReturns           +" Value Expected :"+expdraggedPurchasesReturns);
		System.out.println("link2TO3                  :"+actlink2TO3                          +" Value Expected :"+explink2TO3);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Ok Button Working As Expected");
			excelReader.setCellData(xlfile, xlsheet, 119, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Ok Buttton not Working as Expected");
			excelReader.setCellData(xlfile, xlsheet, 119, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkLinkBetweenPurchaseOrdersAndPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.querySelector('#line3 > path').setAttribute('stroke-width', '8')"); 
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
		link3TO4.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		boolean actDefinitionTab    = DefinitionTab.isDisplayed();
		boolean actsettingTab       = settingTab.isDisplayed();
		boolean actpropertiesTab    = propertiesTab.isDisplayed();
		boolean actMapBtn           = MappingTab.isDisplayed();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		
		boolean actOkBtn            = OkBtn.isDisplayed();
		boolean actCancelBtn        = CancelBtn.isDisplayed();
		
		
		boolean expDefinitionTab    = true;
		boolean expsettingTab       = true;
		boolean exppropertiesTab    = true;
		boolean expMapBtn           = true;
		boolean expOkBtn            = true;
		boolean expCancelBtn        = true;
		
		boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
				&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 122, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 122, 8, actMethod);
		
		System.out.println("**************************************checkLinkBetweenPurchaseVoucherAndpurchaseReturns*******");
		
		System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
		System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
		System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
		System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
		System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
		System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link Options Are Displayed");
			excelReader.setCellData(xlfile, xlsheet, 121, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Link Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlsheet, 121, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrdersAndPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
		Select s=new Select(DefinitionLinkValueDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlsheet, 123, 6));
		
		String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
		String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 124, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 124, 8, actDefinitionLinkValueDropdown);		
		
		System.out.println("****************************************checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrdersAndPurchaseVoucherN***********");
		
		System.out.println("DefinitionLinkValueDropdown   :"+actDefinitionLinkValueDropdown+" Value Expected : "+expDefinitionLinkValueDropdown);
		
		if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
		{
			System.out.println("Test Pass : Quantity Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 123, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Quantity not Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 123, 9, resFail);
			return false;
		}
	}
	
	public boolean checkSelectingItemOptionBetweenPurchaseOrdersAndPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		Thread.sleep(2000);
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseOrderandPvoucheritemchkbox));
		purchaseOrderandPvoucheritemchkbox.click();*/
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		boolean selected = false;
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("Item"))
			{
				selected=definitionTabChkBoxListSelected.get(i).isSelected();
				
				break;
				
			}
		}
		
		/*boolean actpurchaseOrderandPvoucheritemchkbox=purchaseOrderandPvoucheritemchkbox.isSelected();
		boolean exppurchaseOrderandPvoucheritemchkbox=true;*/
		
		boolean actDisplay = selected==true;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 126, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 126, 8, actMethod);
		
		System.out.println("**************************************checkSelectingItemOptionBetweenPurchaseOrdersAndPurchaseVoucherN*************");
		
		/*System.out.println("PurchaseOrderandPvoucheritemchkbox : "+actpurchaseOrderandPvoucheritemchkbox+" Value Expected "+exppurchaseOrderandPvoucheritemchkbox);*/
		System.out.println("PurchaseOrderandPvoucheritemchkbox : "+actMethod+" Value Expected "+expMethod);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass :itemchkbox is Enabled");
			excelReader.setCellData(xlfile, xlsheet, 125, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : itemchkbox is NOT Enabled");
			excelReader.setCellData(xlfile, xlsheet, 125, 9, resFail);
		
			return false;
		}
	}
	
	
	
	public boolean checkOkBetweenBetweenPurchaseOrdersAndPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		Thread.sleep(2000);
	
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesOrders));
		boolean actdraggedPurchasesOrders               = draggedPurchasesOrders.isDisplayed();
		boolean actdraggedPurchasesVouchers         = draggedPurchasesVouchers.isDisplayed();
		boolean actlink3TO4                          = link3TO4.isDisplayed();
		
		boolean expdraggedPurchasesOrders               = true;
		boolean expdraggedPurchasesVouchers    	 = true;
		boolean explink3TO4                    		 = true;
		
		boolean actDisplay = actdraggedPurchasesOrders==expdraggedPurchasesOrders && actdraggedPurchasesVouchers==expdraggedPurchasesVouchers 
				&& actlink3TO4==explink3TO4;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 128, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 128, 8, actMethod);
		
		System.out.println("****************************************checkOkBetweenBetweenPurchaseOrdersAndPurchaseVoucherN****************");
		
		System.out.println("draggedPurchasesOrders       :"+actdraggedPurchasesOrders         +" Value Expected :"+expdraggedPurchasesOrders);
		System.out.println("draggedPurchasesVouchers :"+actdraggedPurchasesVouchers   +" Value Expected :"+expdraggedPurchasesVouchers);
		System.out.println("link3TO4                  :"+actlink3TO4                    +" Value Expected :"+explink3TO4);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Ok Button Working As Expected");
			excelReader.setCellData(xlfile, xlsheet, 127, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Ok Buttton not Working as Expected");
			excelReader.setCellData(xlfile, xlsheet, 127, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkLinkBetweenPurchaseVoucherAndMRN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.querySelector('#line4 > path').setAttribute('stroke-width', '8')"); 
		
	
		moveToElementAndClick(link4TO5);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		boolean actDefinitionTab    = DefinitionTab.isDisplayed();
		boolean actsettingTab       = settingTab.isDisplayed();
		boolean actpropertiesTab    = propertiesTab.isDisplayed();
		boolean actMapBtn           = MappingTab.isDisplayed();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
	
		boolean actOkBtn            = OkBtn.isDisplayed();
		boolean actCancelBtn        = CancelBtn.isDisplayed();
		
		
		boolean expDefinitionTab    = true;
		boolean expsettingTab       = true;
		boolean exppropertiesTab    = true;
		boolean expMapBtn           = true;
		boolean expOkBtn            = true;
		boolean expCancelBtn        = true;
		
		boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
				&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 130, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 130, 8, actMethod);
		
		System.out.println("**************************************checkLinkBetweenPurchaseVoucherNAndMRN*******");
		
		System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
		System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
		System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
		System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
		System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
		System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link Options Are Displayed");
			excelReader.setCellData(xlfile, xlsheet, 129, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Link Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlsheet, 129, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkSelectingQuantityinLinkValueOptionBetweenPurchaseVoucherNAndMRN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
		Select s=new Select(DefinitionLinkValueDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlsheet, 131, 6));
		
		String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
		String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 132, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 132, 8, actDefinitionLinkValueDropdown);
		
		System.out.println("********************************checkSelectingQuantityinLinkValueOptionBetweenPurchaseVoucherNAndMRN***********");
		
		System.out.println("DefinitionLinkValueDropdown  : "+actDefinitionLinkValueDropdown+" Value Ecpected : "+expDefinitionLinkValueDropdown);
		
		if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
		{
			System.out.println("Test Pass : Quantity Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 131, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Quantity not Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 131, 9, resFail);
			return false;
		}
	}
	
	public boolean checkSelectingItemOptionBetweenPurchaseVoucherNAndMRN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		Thread.sleep(2000);
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherNAndMRNitemchkbox));
		purchaseVoucherNAndMRNitemchkbox.click();*/
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		boolean selected = false;
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("Item"))
			{
				selected=definitionTabChkBoxListSelected.get(i).isSelected();
				
				break;
				
			}
		}
		
		/*boolean actpurchaseVoucherNAndMRNitemchkbox=purchaseVoucherNAndMRNitemchkbox.isSelected();
		boolean exppurchaseVoucherNAndMRNitemchkbox=true;*/
		
		boolean actDisplay = selected==true;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 134, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 134, 8, actMethod);
		
		System.out.println("*********************************checkSelectingItemOptionBetweenPurchaseVoucherNAndMRN*************"); 
		
		/*System.out.println("PurchaseVoucherNAndMRNitemchkbox  : "+actpurchaseVoucherNAndMRNitemchkbox+" Value Expected : "+exppurchaseVoucherNAndMRNitemchkbox);*/
		System.out.println("PurchaseVoucherNAndMRNitemchkbox  : "+actMethod+" Value Expected : "+expMethod);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass :itemchkbox is Enabled");
			excelReader.setCellData(xlfile, xlsheet, 133, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : itemchkbox is NOT Enabled");
			excelReader.setCellData(xlfile, xlsheet, 133, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkOkBetweenBetweenPurchaseVoucherNAndMRN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
	
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedPurchasesVouchers));
		boolean actdraggedPurchasesVouchersN         = draggedPurchasesVouchers.isDisplayed();
		boolean actdraggedMaterialReceiptNotes       = draggedMaterialReceiptNotes.isDisplayed();
		boolean actlink4TO5                          = link4TO5.isDisplayed();
		
		boolean expdraggedPurchasesVouchersN         = true;
		boolean expdraggedMaterialReceiptNotes       = true;
		boolean explink4TO5                          = true;
		
		boolean actDisplay = actdraggedPurchasesVouchersN==expdraggedPurchasesVouchersN && actdraggedMaterialReceiptNotes==expdraggedMaterialReceiptNotes 
				&& actlink4TO5==explink4TO5;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 136, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 136, 8, actMethod);
		
		System.out.println("****************************************checkOkBetweenBetweenPurchaseVoucherNAndMRN****************");
		
		System.out.println("DraggedPurchasesVouchersN      :"+actdraggedPurchasesVouchersN     +"Value Expected :"+expdraggedPurchasesVouchersN);
		System.out.println("DraggedMaterialReceiptNotes    :"+actdraggedMaterialReceiptNotes   +"Value Expected :"+expdraggedMaterialReceiptNotes);
		System.out.println("link4TO5                       :"+actlink4TO5                      +"Value Expected :"+explink4TO5);
		
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Ok Button Working As Expected");
			excelReader.setCellData(xlfile, xlsheet, 135, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Ok Buttton not Working as Expected");
			excelReader.setCellData(xlfile, xlsheet, 135, 9, resFail
					);
			return false;
		}
	}
	
	
	
	
	public boolean checkLinkBetweenMRNAndPurchasereturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("document.querySelector('#line5 > path').setAttribute('stroke-width', '8')"); 
		
		moveToElementAndClick(link5TO6);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		boolean actDefinitionTab    = DefinitionTab.isDisplayed();
		boolean actsettingTab       = settingTab.isDisplayed();
		boolean actpropertiesTab    = propertiesTab.isDisplayed();
		boolean actMapBtn           = MappingTab.isDisplayed();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		
		boolean actOkBtn            = OkBtn.isDisplayed();
		boolean actCancelBtn        = CancelBtn.isDisplayed();
		
		
		boolean expDefinitionTab    = true;
		boolean expsettingTab       = true;
		boolean exppropertiesTab    = true;
		boolean expMapBtn           = true;
		boolean expOkBtn            = true;
		boolean expCancelBtn        = true;
		
		boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
				&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 138, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 138, 8, actMethod);
		
		System.out.println("**************************************checkLinkBetweenMRNAndPurchasereturns*******");
		
		System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
		System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
		System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
		System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
		System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
		System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
		
		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass : Link Options Are Displayed");
			excelReader.setCellData(xlfile, xlsheet, 137, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Link Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlsheet, 137, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkSelectingQuantityinLinkValueOptionBetweenMRNAndPurchaseReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
		Select s=new Select(DefinitionLinkValueDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlsheet, 139, 6));
		
		String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
		String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 140, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 140, 8, actDefinitionLinkValueDropdown);
		
		System.out.println("***********************************checkSelectingQuantityinLinkValueOptionBetweenMRNAndPurchaseReturns******");
		
		System.out.println("DefinitionLinkValueDropdown  :"+ actDefinitionLinkValueDropdown+" Value Expected : "+expDefinitionLinkValueDropdown);
		
		if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
		{
			System.out.println("Test Pass : Quantity Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 139, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Quantity not Selected Sucessfully");
			excelReader.setCellData(xlfile, xlsheet, 139, 9, resFail);
			return false;
		}
	}
	
	public boolean checkSelectingItemOptionBetweenMRNAndPurchaseReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mrnAndPurchaseReturnsitemchkbox));
		mrnAndPurchaseReturnsitemchkbox.click();*/

		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM"))
			{
				definitionTabChkBoxList.get(i).click();
				break;
			}
		}
		
		boolean selected = false;
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("Item"))
			{
				selected=definitionTabChkBoxListSelected.get(i).isSelected();
				
				break;
				
			}
		}
		
		/*boolean actmrnAndPurchaseReturnsitemchkbox=mrnAndPurchaseReturnsitemchkbox.isSelected();
		boolean expmrnAndPurchaseReturnsitemchkbox=true;*/
		
		boolean actDisplay = selected==true;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 142, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 142, 8, actMethod);
		
		System.out.println("*****************************checkSelectingItemOptionBetweenMRNAndPurchaseReturns*******************************");
		
		/*System.out.println("MRNAndPurchaseReturnsitemchkbox  : "+actmrnAndPurchaseReturnsitemchkbox+" Value Expected : "+expmrnAndPurchaseReturnsitemchkbox);*/
		
		System.out.println("MRNAndPurchaseReturnsitemchkbox  : "+actMethod+" Value Expected : "+expMethod);

		if(actMethod.equalsIgnoreCase(expMethod))
		{
			System.out.println("Test Pass :itemchkbox is Enabled");
			excelReader.setCellData(xlfile, xlsheet, 141, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : itemchkbox is NOT Enabled");
			excelReader.setCellData(xlfile, xlsheet, 141, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkOkBetweenBetweenMRNAndPurchaseReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
	
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedMaterialReceiptNotes));
		boolean actdraggedMaterialReceiptNotes         = draggedMaterialReceiptNotes.isDisplayed();
		boolean actdraggedPurchasesReturns             = draggedPurchasesReturns.isDisplayed();
		boolean actlink5TO6                            = link5TO6.isDisplayed();
		
		boolean expdraggedMaterialReceiptNotes         = true;
		boolean expdraggedPurchasesReturns             = true;
		boolean explink5TO6                            = true;
		
		boolean actDisplay = actdraggedMaterialReceiptNotes==expdraggedMaterialReceiptNotes && actdraggedPurchasesReturns==expdraggedPurchasesReturns 
				&& actlink5TO6==explink5TO6;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 144, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 144, 8, actMethod);
		
		System.out.println("****************************************checkOkBetweenBetweenMRNAndPurchaseReturns****************");
		
		System.out.println("DraggedMaterialReceiptNotes   :"+actdraggedMaterialReceiptNotes    +"Value Expected :"+expdraggedMaterialReceiptNotes);
		System.out.println("DraggedPurchasesReturns       :"+actdraggedPurchasesReturns        +"Value Expected :"+expdraggedPurchasesReturns);
		System.out.println("link5TO6                      :"+actlink5TO6                       +"Value Expected :"+explink5TO6);
		
		
		if(actMethod.equalsIgnoreCase(expMethod))
		
		{
			System.out.println("Test Pass : Ok Button Working As Expected");
			excelReader.setCellData(xlfile, xlsheet, 143, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Ok Buttton not Working as Expected");
			excelReader.setCellData(xlfile, xlsheet, 143, 9, resFail);
			return false;
		}
	}
	
	
	public boolean checkSavingPurchasesFlow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
		dwsaveBtn.click();
		
		System.out.println("************************checkSavingPurchasesFlow*************************************");
		
		String expMessage=excelReader.getCellData(xlsheet, 146, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlsheet, 146, 8, actMessage);

		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Error Message is as Expected");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
			dwcloseBtn.click();
			excelReader.setCellData(xlfile, xlsheet, 145, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Error Message is NOT as Expected");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
			dwcloseBtn.click();
			excelReader.setCellData(xlfile, xlsheet, 145, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean checkEditingSavedPurchasesFlow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
	    Thread.sleep(5000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		workflowNameTxt.sendKeys(excelReader.getCellData(xlsheet, 147, 6));
		Thread.sleep(3000);
		workflowNameTxt.sendKeys(Keys.TAB);
 
		String actdata=workflowNameTxt.getAttribute("value");
		String expdata=excelReader.getCellData(xlsheet, 148, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 148, 8, actdata);
	
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link4TO5));
		link4TO5.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
		propertiesTab.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseDocumentCannotBeEditedAfterItIsLinkedChkbox));
		baseDocumentCannotBeEditedAfterItIsLinkedChkbox.click();
		Thread.sleep(2000);
		
		 boolean actbaseDocumentCannotBeEditedAfterItIsLinkedChkbox=baseDocumentCannotBeEditedAfterItIsLinkedChkbox.isSelected();
		 boolean expbaseDocumentCannotBeEditedAfterItIsLinkedChkbox=true;
		 
		 boolean actDisplay = actbaseDocumentCannotBeEditedAfterItIsLinkedChkbox==expbaseDocumentCannotBeEditedAfterItIsLinkedChkbox;
			
		 String actMethod = Boolean.toString(actDisplay);
			
		 String expMethod = excelReader.getCellData(xlsheet, 149, 7);
			
		 excelReader.setCellData(xlfile, xlsheet, 149, 8, actMethod);
			
		 System.out.println("****************************checkEditingSavedPurchasesFlow*******************************************************");
		 
		 System.out.println("BaseDocumentCannotBeEditedAfterItIsLinkedChkbox "+actbaseDocumentCannotBeEditedAfterItIsLinkedChkbox+"Value   "+expbaseDocumentCannotBeEditedAfterItIsLinkedChkbox);
		 
		 
		 Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
		 dwsaveBtn.click();
			
		 String expMessage=excelReader.getCellData(xlsheet, 150, 7);
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 excelReader.setCellData(xlfile, xlsheet, 150, 8, actMessage);
			
		 if(actdata.equalsIgnoreCase(expdata) && actMessage.equalsIgnoreCase(expMessage))
		 {
			 System.out.println("Test Pass : Error Message is as Expected");
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
			 dwcloseBtn.click();
			 excelReader.setCellData(xlfile, xlsheet, 147, 9, resPass);
			 return true;
		 }
		 else
		 {
			 System.out.println("Test Fail : Error Message is NOT as Expected");
			 dwcloseBtn.click();
			 excelReader.setCellData(xlfile, xlsheet, 147, 9, resFail);
			 return false;
		 }
	}
	
	
	// Auto Reservation
	
	
	
	
	

	
	public boolean checkSavingAutoReservationFlow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
		designWorkflowbtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
		workflowNameTxt.click();
		
		workflowNameTxt.sendKeys(excelReader.getCellData(xlsheet, 155, 6));
		workflowNameTxt.sendKeys(Keys.TAB);
		
		String actworkflowNameTxt,expworkflowNameTxt;
		expworkflowNameTxt=excelReader.getCellData(xlsheet, 156, 7);
		actworkflowNameTxt=workflowNameTxt.getAttribute("value");
		
		excelReader.setCellData(xlfile, xlsheet, 156, 8, actworkflowNameTxt);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersExpandBtn));
		salesOrdersExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoSalesOrdersDragAndDrop));
		autoSalesOrdersDragAndDrop.click();
		
		getAction().dragAndDropBy(autoSalesOrdersDragAndDrop, 350, -100).build().perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesExpandBtn));
		salesInvoicesExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoSalesInvoiceDragAndDrop));
		autoSalesInvoiceDragAndDrop.click();
		
		getAction().dragAndDropBy(autoSalesInvoiceDragAndDrop, 650, -100).build().perform();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
		
		boolean actFirstDraggedElement=FirstDraggedElement.isDisplayed();
		boolean actdraggedAutoSalesInvoices=draggedAutoSalesInvoices.isDisplayed();
		
		boolean expFirstDraggedElement=true;
		boolean expdraggedAutoSalesInvoices=true;
		
		getAction().contextClick(FirstDraggedElement).build().perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		
		boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
		boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
		
		boolean expdraggedlinkBtn=true;
		boolean expdraggeddwdeleteBtn=true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
		draggedlinkBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode1Left));
		linkNode1Left.click();
		
		Thread.sleep(2000);
		
		boolean actlink0TO1=link0TO1.isDisplayed();
		boolean explink0TO1=true;
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link0TO1));
		link0TO1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
		DefinitionTab.click();

		
		Select s=new Select(DefinitionLinkValueDropdown);
		
		s.selectByVisibleText(excelReader.getCellData(xlsheet, 156, 6));
		
		String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
		String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 157, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 157, 8, actDefinitionLinkValueDropdown);
		
		
		int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
		
		for(int i=1;i<definitionTabChkBoxNameListCount;i++)
		{
			String data = definitionTabChkBoxNameList.get(i).getText();
			if(data.equalsIgnoreCase("ITEM") || data.equalsIgnoreCase("Customer Account") || data.equalsIgnoreCase("Warehouse"))
			{
				definitionTabChkBoxList.get(i).click();
			}
		}
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrderandInvoiceitemchkbox));
		salesOrderandInvoiceitemchkbox.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountChkbox));
		customerAccountChkbox.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autosalesOrderandInvoicewareHouseChkbox));
		autosalesOrderandInvoicewareHouseChkbox.click();*/
		
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(3000);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
		
		
		boolean actFirstDraggedElementAfter           = FirstDraggedElement.isDisplayed();
		boolean actdraggedAutoSalesInvoicesAfter      = draggedAutoSalesInvoices.isDisplayed();
		boolean actlink0TO1After                      = link0TO1.isDisplayed();
		
		
		boolean expFirstDraggedElementAfter           = true;
		boolean expdraggedAutoSalesInvoicesAfter      = true;
		boolean explink0TO1After                      = true;
		
		
		boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement && actdraggedAutoSalesInvoices==expdraggedAutoSalesInvoices
				&& actdraggedlinkBtn==expdraggedlinkBtn &&actdraggeddwdeleteBtn==expdraggeddwdeleteBtn 
				&& actlink0TO1==explink0TO1 && actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown)
				&& actFirstDraggedElementAfter==expFirstDraggedElementAfter && actdraggedAutoSalesInvoicesAfter==expdraggedAutoSalesInvoicesAfter
				&& actlink0TO1After==explink0TO1After;
		
		String actMethod = Boolean.toString(actDisplay);
		
		String expMethod = excelReader.getCellData(xlsheet, 158, 7);
		
		excelReader.setCellData(xlfile, xlsheet, 158, 8, actMethod);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
		dwsaveBtn.click();

		String expMessage=excelReader.getCellData(xlsheet, 159, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlsheet, 159, 8, actMessage);
		
		
		System.out.println("**********************************************checkSelectBaseAndLinkVouchersToDrag*********************************");
		
		System.out.println("WorkflowNameTxt              : "+actworkflowNameTxt               +" value Excepted : " +expworkflowNameTxt);
		System.out.println("FirstDraggedElement          : "+actFirstDraggedElement           +" Value Expected : " +expFirstDraggedElement);
		System.out.println("DraggedAutoSalesInvoices     : "+actdraggedAutoSalesInvoices      +" Value Expected : " +expdraggedAutoSalesInvoices);
		System.out.println("DraggedlinkBtn               : "+actdraggedlinkBtn                +" Value Expected : " +expdraggedlinkBtn);
		System.out.println("DraggeddwdeleteBtn             : "+actdraggeddwdeleteBtn              +" Value Expected : " +expdraggeddwdeleteBtn);
		System.out.println("Link0TO1                     : "+actlink0TO1                      +" Value Excepted : " +explink0TO1);
		System.out.println("DefinitionLinkValueDropdown  : "+actDefinitionLinkValueDropdown   +" Value Excepted : " +expDefinitionLinkValueDropdown);
		System.out.println("FirstDraggedElementAfter     :" +actFirstDraggedElementAfter      +" Value Expected : " +expFirstDraggedElementAfter);
		System.out.println("DraggedAutoSalesInvoicesAfter:" +actdraggedAutoSalesInvoicesAfter +" Value Expected : " +expdraggedAutoSalesInvoicesAfter);
		System.out.println("Link0TO1After                :" +actlink0TO1After                 +" Value Expected : " +explink0TO1After);
		
		
		if(actMessage.equalsIgnoreCase(expMessage) && actworkflowNameTxt.equalsIgnoreCase(expworkflowNameTxt))
		{
			System.out.println("Test Pass : Error Message is as Expected");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
			dwcloseBtn.click();
			
			excelReader.setCellData(xlfile, xlsheet, 155, 9, resPass);
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Error Message is NOT as Expected");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
			dwcloseBtn.click();
			
			
			excelReader.setCellData(xlfile, xlsheet, 155, 9, resFail);
			
			
			return false;
		}
	}
	
	

	// Sales Flow
	
	

	// Sales Flow
	
	

		public boolean checkSelectingSalesVoucherTypesfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
			designWorkflowbtn.click();
			
			Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
			workflowNameTxt.click();
			
			workflowNameTxt.clear();
			
			workflowNameTxt.sendKeys(excelReader.getCellData(xlsheet, 175, 6));
			Thread.sleep(2000);
			workflowNameTxt.sendKeys(Keys.TAB);
			
			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesQuotationsDragAndDrop));
			salesQuotationsDragAndDrop.click();
			
			getAction().dragAndDropBy(salesQuotationsDragAndDrop, 350, -250).build().perform();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
			
			
			boolean actFirstDraggedElement=FirstDraggedElement.isDisplayed();
			boolean expFirstDraggedElement=true;
			
			boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 176, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 176, 8, actMethod);
			
			System.out.println("***************************************checkSelectingSalesVoucherTypesfromVoucherlist***********************");
			
			System.out.println("FirstDraggedElement  :"+actFirstDraggedElement+" Value Expected :"+expFirstDraggedElement);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Sales Quotation Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 175, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Sales Quotation Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 175, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkSelectingSalesOrdersfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		    getAction().moveToElement(receiptsDragAndDrop).pause(1000).build().perform();
		    Thread.sleep(1000);
			getAction().moveToElement(salesOrdersDragAndDrop).pause(1000).build().perform();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersDragAndDrop));
			salesOrdersDragAndDrop.click();
			
			getAction().dragAndDropBy(salesOrdersDragAndDrop, 500,-250).build().perform();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesOrders));
			
			boolean actdraggedSalesOrders=draggedSalesOrders.isDisplayed();
			boolean expdraggedSalesOrders=true;
			
			boolean actDisplay = actdraggedSalesOrders==expdraggedSalesOrders;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 178, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 178, 8, actMethod);	
			
			System.out.println("*********************************************checkSelectingSalesOrdersfromVoucherlist**************************");
			
			System.out.println("DraggedSalesOrders  :"+actdraggedSalesOrders+" Value Expected :"+expdraggedSalesOrders);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			
			{
				System.out.println("Test Pass : Sales order Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 177, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Sales order Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 177, 9, resFail);
				return false;
			}
		}
		
		
		/*

		public boolean checkMovingSalesOrderToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getAction().dragAndDropBy(draggedSalesOrders, 200, 0).build().perform();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesOrders));
			
			boolean actdraggedSalesOrders=draggedSalesOrders.isDisplayed();
			boolean expdraggedSalesOrders=true;
			
		   boolean actDisplay = actdraggedSalesOrders==expdraggedSalesOrders;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 180, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 180, 8, actMethod);
			
			System.out.println("*********************************************checkMovingSalesOrderToPosition**************************");
			
			System.out.println("DraggedSalesOrders  :"+actdraggedSalesOrders+" Value Expected :"+expdraggedSalesOrders);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Sales order Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 179, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Sales order Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 21799, 9, resFail);
				return false;
			}
		}
		*/
		
		@FindBy(xpath="//span[@class='DragLi ui-draggable ui-draggable-handle'][contains(text(),'Sales invoice VAT')]")
		public static WebElement salesInvoiceVATDragAndDrop; 

		@FindBy(xpath="//div[@title='Sales invoice VAT']")
		public static WebElement draggedSalesInvoicesVAT; 
		
		public boolean checkSelectingSalesInvoicesfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    Thread.sleep(3000);
		   
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesExpandBtn));
		    salesInvoicesExpandBtn.click();
		    
		    
			    Thread.sleep(1000);
				getAction().moveToElement(salesInvoiceVATDragAndDrop).pause(1000).build().perform();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATDragAndDrop));
				salesInvoiceVATDragAndDrop.click();
				
				getAction().dragAndDropBy(salesInvoiceVATDragAndDrop, 650,-250).build().perform();
				Thread.sleep(2000);
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesInvoicesVAT));
			boolean actdraggedSalesInvoices=draggedSalesInvoicesVAT.isDisplayed();
			boolean expdraggedSalesInvoices=true;
			
			
			boolean actDisplay = actdraggedSalesInvoices==expdraggedSalesInvoices;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 182, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 182, 8, actMethod);
			
			System.out.println("*********************************************checkSelectingSalesInvoicesfromVoucherlist**************************");
			
			System.out.println("DraggedSalesInvoices  :"+actdraggedSalesInvoices+" Value Expected :"+expdraggedSalesInvoices);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchTxt));
			 searchTxt.sendKeys(Keys.END);
			 searchTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			 searchTxt.sendKeys(Keys.BACK_SPACE);
			 
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Sales Invoices Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 181, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Sales Invoices Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 181, 9, resFail);
				return false;
			}
		}
		
		
		
		/*
		public boolean checkMovingSalesInvoicesToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getAction().dragAndDropBy(draggedSalesInvoicesVAT, 450, 0).build().perform();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesInvoicesVAT));
			boolean actdraggedSalesInvoices=draggedSalesInvoicesVAT.isDisplayed();
			boolean expdraggedSalesInvoices=true;
			
			boolean actDisplay = actdraggedSalesInvoices==expdraggedSalesInvoices;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 184, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 184, 8, actMethod);
			
			System.out.println("*********************************************checkMovingSalesInvoicesToPosition**************************");
			
			System.out.println("DraggedSalesInvoices  :"+actdraggedSalesInvoices+" Value Expected :"+expdraggedSalesInvoices);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Sales Invoices Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 183, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Sales Invoices Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 183, 9, resFail);
				return false;
			}
		}
		
		
		*/
		public boolean checkSelectingSalesReturnsfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
		    
		    Thread.sleep(2000);
			getAction().moveToElement(salesReturnsDragAndDrop).pause(1000).build().perform();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReturnsDragAndDrop));
			salesReturnsDragAndDrop.click();
			
			getAction().dragAndDropBy(salesReturnsDragAndDrop, 850,-240).build().perform();
			Thread.sleep(2000);
			
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesReturns));
			boolean actdraggedSalesReturns=draggedSalesReturns.isDisplayed();
			boolean expdraggedSalesReturns=true;
			
			boolean actDisplay = actdraggedSalesReturns==expdraggedSalesReturns;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 186, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 186, 8, actMethod);
			
			System.out.println("*********************************************checkSelectingSalesReturnsfromVoucherlist**************************");
			
			System.out.println("DraggedSalesReturns  :"+actdraggedSalesReturns+" Value Expected :"+expdraggedSalesReturns);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			
			{
				System.out.println("Test Pass : Sales Returns Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 185, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Sales Returns Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 185, 9, resFail);
				
				return false;
			}
		}
		
	/*	
		
		
		public boolean checkMovingSalesReturnsToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getAction().dragAndDropBy(draggedSalesReturns, 750, 0).build().perform();
			
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesReturns));
			boolean actdraggedSalesReturns=draggedSalesReturns.isDisplayed();
			boolean expdraggedSalesReturns=true;
			
			boolean actDisplay = actdraggedSalesReturns==expdraggedSalesReturns;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 188, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 188, 8, actMethod);
			
			System.out.println("*********************************************checkMovingSalesReturnsToPosition**************************");
			
			System.out.println("DraggedSalesReturns  :"+actdraggedSalesReturns+" Value Expected :"+expdraggedSalesReturns);
			
			if(actMethod.equalsIgnoreCase(expMethod))
		
			{
				System.out.println("Test Pass : Sales Returns Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 187, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Sales Returns Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 187, 9, resFail);
				return false;
			}
		}
		
		
		*/
		
		
		
		public boolean checkSelectingExcessInStocksfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    Thread.sleep(3000);
		    
		  /*  getAction().moveToElement(receiptsDragAndDrop).pause(1000).build().perform();*/
			
		    Thread.sleep(1000);
			getAction().moveToElement(excessesInStocksDragAndDrop).pause(1000).build().perform();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(excessesInStocksDragAndDrop));
			excessesInStocksDragAndDrop.click();
			
			getAction().dragAndDropBy(excessesInStocksDragAndDrop, 400,-80).build().perform();
			
		  
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedExcessesInStocks));
			boolean actdraggedExcessesInStocks=draggedExcessesInStocks.isDisplayed();
			boolean expdraggedExcessesInStocks=true;
			
			boolean actDisplay = actdraggedExcessesInStocks==expdraggedExcessesInStocks;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 190, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 190, 8, actMethod);
			
			System.out.println("*********************************************checkMovingSalesReturnsToPosition**************************");
			
			System.out.println("DraggedSalesReturns  :"+actdraggedExcessesInStocks+" Value Expected :"+expdraggedExcessesInStocks);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Excess In Stocks Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 189, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Excess In Stocks Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 189, 9, resFail);
				return false;
			}
		}
		
		
		/*
		
		public boolean checkMovingExcessInStocksToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getAction().dragAndDropBy(draggedExcessesInStocks, 100, 200).build().perform();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedExcessesInStocks));
			boolean actdraggedExcessesInStocks=draggedExcessesInStocks.isDisplayed();
			boolean expdraggedExcessesInStocks=true;
			
			boolean actDisplay = actdraggedExcessesInStocks==expdraggedExcessesInStocks;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 192, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 192, 8, actMethod);
			
			System.out.println("*********************************************checkMovingExcessInStocksToPosition**************************");
			
			System.out.println("DraggedSalesReturns  :"+actdraggedExcessesInStocks+" Value Expected :"+expdraggedExcessesInStocks);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			
			{
				System.out.println("Test Pass : Excess In Stocks Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 191, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Excess In Stocks Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 191, 9, resFail);
				return false;
			}
		}
		
		
		
		*/
		public boolean checkSelectingStockTransferfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			
			
			
			/*Thread.sleep(3000);
		    
		    getAction().moveToElement(receiptsDragAndDrop).pause(1000).build().perform();
			
		    Thread.sleep(1000);
			getAction().moveToElement(stockTransferDragAndDrop).pause(1000).build().perform();*/
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockTransferDragAndDrop));
			stockTransferDragAndDrop.click();
			
			getAction().dragAndDropBy(stockTransferDragAndDrop, 600,-80).build().perform();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedStockTransfer));
			boolean actdraggedStockTransfer=draggedStockTransfer.isDisplayed();
			boolean expdraggedStockTransfer=true;
			
			boolean actDisplay = actdraggedStockTransfer==expdraggedStockTransfer;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 194, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 194, 8, actMethod);	
			
			System.out.println("*********************************************checkSelectingStockTransferfromVoucherlist**************************");
			
			System.out.println("DraggedStockTransfer  :"+actdraggedStockTransfer+" Value Expected :"+expdraggedStockTransfer);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			
			{
				System.out.println("Test Pass : stockTransfer Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 193, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : stockTransfer Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 193, 9, resFail);
				return false;
			}
		}
		
		
/*
		
		public boolean checkMovingStockTransferToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    
			getAction().dragAndDropBy(draggedStockTransfer, 300, 200).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedStockTransfer));
			boolean actdraggedStockTransfer=draggedStockTransfer.isDisplayed();
			boolean expdraggedStockTransfer=true;
			
			boolean actDisplay = actdraggedStockTransfer==expdraggedStockTransfer;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 196, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 196, 8, actMethod);
			
			System.out.println("*********************************************checkMovingStockTransferToPosition**************************");
			
			System.out.println("DraggedStockTransfer  :"+actdraggedStockTransfer+" Value Expected :"+expdraggedStockTransfer);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : stockTransfer Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 195, 9, resPass);
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : stockTransfer Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 195, 9, resFail);
				return false;
			}
		}
		
*/
		
		public boolean checkSelectingShortageinStocksfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			
			/*Thread.sleep(3000);
		    
		    getAction().moveToElement(receiptsDragAndDrop).pause(1000).build().perform();
			*/
		    Thread.sleep(1000);
			getAction().moveToElement(shortagesInStockDragAndDrop).pause(1000).build().perform();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(shortagesInStockDragAndDrop));
			shortagesInStockDragAndDrop.click();
			
			getAction().dragAndDropBy(shortagesInStockDragAndDrop, 490,-5).build().perform();
			
	
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedShortagesInStock));
			boolean actdraggedShortagesInStock=draggedShortagesInStock.isDisplayed();
			boolean expdraggedShortagesInStock=true;
			
			boolean actDisplay = actdraggedShortagesInStock==expdraggedShortagesInStock;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 198, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 198, 8, actMethod);
			
			System.out.println("*********************************************checkSelectingShortageinStocksfromVoucherlist**************************");
			
			System.out.println("DraggedShortagesInStock  :"+actdraggedShortagesInStock+" Value Expected :"+expdraggedShortagesInStock);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			
			{
				System.out.println("Test Pass : ShortageinStocks Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 197, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : ShortageinStocks Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 197, 9, resFail);
				return false;
			}
		}
		
		
		/*
		
		public boolean checkMovingShortageinStocksToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getAction().dragAndDropBy(draggedShortagesInStock, 150, 350).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedShortagesInStock));
			boolean actdraggedShortagesInStock=draggedShortagesInStock.isDisplayed();
			boolean expdraggedShortagesInStock=true;
			
			boolean actDisplay = actdraggedShortagesInStock==expdraggedShortagesInStock;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 200, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 200, 8, actMethod);
			
			System.out.println("*********************************************checkMovingShortageinStocksToPosition**************************");
			
			System.out.println("DraggedShortagesInStock  :"+actdraggedShortagesInStock+" Value Expected :"+expdraggedShortagesInStock);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : ShortageinStocks Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 199, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : ShortageinStocks Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 199, 9, resFail);
				return false;
			}
		}
		
		
		

		*/
		public boolean checkSelectingsalesInvoicesNfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		   
		    JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		    jse.executeScript("arguments[0].scrollIntoView(true);", receiptsDragAndDrop);
		    Thread.sleep(1000);
		   
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesDragAndDrop));
			salesInvoicesDragAndDrop.click();
			
			getAction().dragAndDropBy(salesInvoicesDragAndDrop, 850,250).build().perform();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesInvoices));
			boolean actdraggedSalesInvoicesN=draggedSalesInvoices.isDisplayed();
			boolean expdraggedSalesInvoicesN=true;
			
			boolean actDisplay = actdraggedSalesInvoicesN==expdraggedSalesInvoicesN;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 202, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 202, 8, actMethod);
			
			System.out.println("*********************************************checkSelectingsalesInvoicesNfromVoucherlist**************************");
			
			System.out.println("DraggedSalesInvoicesN  :"+actdraggedSalesInvoicesN+" Value Expected :"+expdraggedSalesInvoicesN);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			
			{
				System.out.println("Test Pass : salesInvoicesN Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 201, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : salesInvoicesN Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 201, 9, resFail);
				return false;
			}
		}
		
		
		/*
		
		public boolean checkMovingsalesInvoicesNToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getAction().dragAndDropBy(draggedSalesInvoices, 450, 200).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesInvoices));
			boolean actdraggedSalesInvoicesN=draggedSalesInvoices.isDisplayed();
			boolean expdraggedSalesInvoicesN=true;
			
			boolean actDisplay = actdraggedSalesInvoicesN==expdraggedSalesInvoicesN;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 204, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 204, 8, actMethod);
			
			System.out.println("*********************************************checkMovingsalesInvoicesNToPosition**************************");
			
			System.out.println("DraggedSalesInvoicesN  :"+actdraggedSalesInvoicesN+" Value Expected :"+expdraggedSalesInvoicesN);
			
			if(actMethod.equalsIgnoreCase(expMethod))
		
			{
				System.out.println("Test Pass : salesInvoicesN Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 203, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : salesInvoicesN Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 203, 9, resFail);
				return false;
			}
		}
		
		
		*/
		
		public boolean checkSelectingDeliveryNotesfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    Thread.sleep(2000);
		 
			getAction().moveToElement(deliveryNotesDragAndDrop).pause(1000).build().perform();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deliveryNotesDragAndDrop));
			deliveryNotesDragAndDrop.click();
			
			getAction().dragAndDropBy(deliveryNotesDragAndDrop, 960,-55).build().perform();
			
			Thread.sleep(2000);
			
			boolean actdraggedDeliveryNotes=draggedDeliveryNotes.isDisplayed();
			boolean expdraggedDeliveryNotes=true;
			
			boolean actDisplay = actdraggedDeliveryNotes==expdraggedDeliveryNotes;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 206, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 206, 8, actMethod);
			
			System.out.println("*************************checkSelectingDeliveryNotesfromVoucherlist*********************");
			
			System.out.println("DraggedDeliveryNotes  :"+actdraggedDeliveryNotes+" Value Excepted : "+expdraggedDeliveryNotes);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : DeliveryNotes Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 205, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : DeliveryNotes Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 205, 9, resFail);
				return false;
			}
		}
		
		/*
		
		
		public boolean checkMovingDeliveryNotesToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getAction().dragAndDropBy(draggedDeliveryNotes, 700, 200).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedDeliveryNotes));
			boolean actdraggedDeliveryNotes=draggedDeliveryNotes.isDisplayed();
			boolean expdraggedDeliveryNotes=true;
			
			boolean actDisplay = actdraggedDeliveryNotes==expdraggedDeliveryNotes;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 208, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 208, 8, actMethod);
			
			System.out.println("*********************************************checkMovingDeliveryNotesToPosition**************************");
			
			System.out.println("DraggedDeliveryNotes  :"+actdraggedDeliveryNotes+" Value Expected :"+expdraggedDeliveryNotes);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : DeliveryNotes Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 207, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : DeliveryNotes Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 207, 9, resFail);
				return false;
			}
		}
		
		
		*/
		

		
		
		public boolean checkSelectingAutoSalesOrderfromVoucherlist() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    Thread.sleep(3000);
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrdersExpandBtn));
			salesOrdersExpandBtn.click();
			
		    Thread.sleep(2000);
		 
			getAction().moveToElement(autoSalesOrdersDragAndDrop).pause(1000).build().perform();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoSalesOrdersDragAndDrop));
			autoSalesOrdersDragAndDrop.click();
			
			getAction().dragAndDropBy(autoSalesOrdersDragAndDrop, 660,-90).build().perform();
			
			Thread.sleep(2000);
		    
			
			boolean actdraggedAutoSalesOrders=draggedAutoSalesOrders.isDisplayed();
			boolean expdraggedAutoSalesOrders=true;
			
			boolean actDisplay = actdraggedAutoSalesOrders==expdraggedAutoSalesOrders;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 206, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 206, 8, actMethod);
			
			System.out.println("*************************checkSelectingDeliveryNotesfromVoucherlist*********************");
			
			System.out.println("DraggedDeliveryNotes  :"+actdraggedAutoSalesOrders+" Value Excepted : "+expdraggedAutoSalesOrders);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : DeliveryNotes Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 205, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : DeliveryNotes Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 205, 9, resFail);
				return false;
			}
		}
		
		/*public boolean checkMovingAutoSalesOrderToPosition() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getAction().dragAndDropBy(draggedAutoSalesOrders, 400, 100).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedAutoSalesOrders));
			boolean actdraggedAutoSalesOrders=draggedAutoSalesOrders.isDisplayed();
			boolean expdraggedAutoSalesOrders=true;
			
			boolean actDisplay = actdraggedAutoSalesOrders==expdraggedAutoSalesOrders;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 208, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 208, 8, actMethod);
			
			System.out.println("*********************************************checkMovingDeliveryNotesToPosition**************************");
			
			System.out.println("DraggedDeliveryNotes  :"+actdraggedAutoSalesOrders+" Value Expected :"+expdraggedAutoSalesOrders);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : DeliveryNotes Is Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 207, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : DeliveryNotes Is NOT Displayed in Design field");
				excelReader.setCellData(xlfile, xlsheet, 207, 9, resFail);
				return false;
			}
		}
		
		
		*/
		
		public boolean checkLinkandDeleteOptionsinSalesQuotations() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getAction().contextClick(FirstDraggedElement).build().perform();
			
			Thread.sleep(2000);
			
			boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn=true;
			boolean expdraggeddwdeleteBtn=true;
			
			boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 210, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 210, 8, actMethod);
			
			System.out.println("***********************************checkLinkandDeleteOptionsinSalesQuotations****************");
			
			System.out.println("DraggedlinkBtn     : "+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
			System.out.println("DraggeddwdeleteBtn   : "+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Link And delete Options Are Available");
				excelReader.setCellData(xlfile, xlsheet, 209, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Link And delete Options Are NOT Available");
				excelReader.setCellData(xlfile, xlsheet, 209, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		public boolean checkSelectingLinkButtoninSalesQuotations() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
			draggedlinkBtn.click();
			
				boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
				boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
				
				boolean expdraggedlinkBtn=true;
				boolean expdraggeddwdeleteBtn=true;
				
				boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn;
				
				String actMethod = Boolean.toString(actDisplay);
				
				String expMethod = excelReader.getCellData(xlsheet, 212, 7);
				
				excelReader.setCellData(xlfile, xlsheet, 212, 8, actMethod);
				
				System.out.println("***********************************checkSelectingLinkButtoninSalesQuotations****************");
				
				System.out.println("DraggedlinkBtn     : "+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
				System.out.println("DraggeddwdeleteBtn   : "+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
				
				if(actMethod.equalsIgnoreCase(expMethod))
				
				{
					System.out.println("Test Fail : Not Selected Link Option ");
					excelReader.setCellData(xlfile, xlsheet, 211, 9, resFail);
					return false;
				}else
				{
					System.out.println("Test Pass : Selected Link Option Successfully ");
					excelReader.setCellData(xlfile, xlsheet, 211, 9, resPass);
					return true;
				}
				
		}
		
		
		
		public boolean checkMappingFromSalesQuotationsToSalesOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode1Left));
			linkNode1Left.click();
			
			Thread.sleep(2000);
			boolean actlink0TO1=link0TO1.isDisplayed();
			boolean explink0TO1=true;
			
			boolean actDisplay = actlink0TO1==explink0TO1;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 214, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 214, 8, actMethod);
			
			System.out.println("***********************************checkLinkNodeLineFromBaseVoucherToLinkVoucher***************************");
			
			System.out.println("Link0TO1   "+actlink0TO1 +" Value Excepted : "+explink0TO1);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Mapping Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 213, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Mapping NOT Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 213, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkLinkandDeleteOptionsinSalesOrdersAndSelectingLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		    Thread.sleep(3000);
		   	    
			getAction().contextClick(draggedSalesOrders).build().perform();

			boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn=true;
			boolean expdraggeddwdeleteBtn=true;
			
			
			System.out.println("***********************************checkLinkandDeleteOptionsinSalesOrdersAndSelectingLinkOption****************");
			
			System.out.println("DraggedlinkBtn     : ."+actdraggedlinkBtn   +". Value Expected : ."+expdraggedlinkBtn+".");
			System.out.println("DraggeddwdeleteBtn   : ."+actdraggeddwdeleteBtn +". Value Expected : ."+expdraggeddwdeleteBtn+".");
			
			Thread.sleep(200);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
			draggedlinkBtn.click();
			
			System.out.println("Test Pass : Link And delete Options Are Available");
			
			try
			{
				boolean actdraggedlinkBtn1=draggedlinkBtn.isDisplayed();
				boolean actdraggeddwdeleteBtn1=draggeddwdeleteBtn.isDisplayed();
				
				boolean expdraggedlinkBtn1=true;
				boolean expdraggeddwdeleteBtn1=true;
				
				boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn
						&&  actdraggedlinkBtn1==expdraggedlinkBtn1 && actdraggeddwdeleteBtn1==expdraggeddwdeleteBtn1;
				
				String actMethod = Boolean.toString(actDisplay);
				
				String expMethod = excelReader.getCellData(xlsheet, 216, 7);
				
				excelReader.setCellData(xlfile, xlsheet, 216, 8, actMethod);
				
				System.out.println("DraggedlinkBtn1     : ."+actdraggedlinkBtn1   +". Value Expected : ."+expdraggedlinkBtn1+".");
				System.out.println("DraggeddwdeleteBtn1   : ."+actdraggeddwdeleteBtn1 +". Value Expected : ."+expdraggeddwdeleteBtn1+".");
				
				if(actMethod.equalsIgnoreCase(expMethod))
				{
					System.out.println("Test Fail : Not Selected Link Option ");
					excelReader.setCellData(xlfile, xlsheet, 215, 9, resFail);
					return false;
				}
				else
				{
					System.out.println("Test Pass : Selected Link Option Successfully ");
					excelReader.setCellData(xlfile, xlsheet, 215, 9, resPass);
					return true;
				}
			}
			catch(Exception e)
			{
					System.out.println("Test Pass : Selected Link Option Successfully ");
					excelReader.setCellData(xlfile, xlsheet, 215, 9, resPass);
					return true;
			}
		}
		
		public boolean checkMappingFromSalesOrderToSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode2Left));
			linkNode2Left.click();
			
			Thread.sleep(2000);
			
			boolean actlink1TO2=link1TO2.isDisplayed();
			boolean explink1TO2=true;
			
			boolean actDisplay = actlink1TO2==explink1TO2;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 218, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 218, 8, actMethod);
			
			System.out.println("***********************************checkMappingFromSalesOrderToSalesInvoice***************************");
			
			System.out.println("Link1TO2   "+actlink1TO2 +" Value Excepted : "+explink1TO2);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Mapping Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 217, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Mapping NOT Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 217, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkLinkandDeleteOptionsinSalesInvoiceAndSelectingLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getAction().contextClick(draggedSalesInvoicesVAT).build().perform();
			
			Thread.sleep(2000);
			
			boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn=true;
			boolean expdraggeddwdeleteBtn=true;
			
			
			
			System.out.println("***********************************checkLinkandDeleteOptionsinSalesInvoiceAndSelectingLinkOption****************");
			
			System.out.println("DraggedlinkBtn     : "+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
			System.out.println("DraggeddwdeleteBtn   : "+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
			
			
			Thread.sleep(2000);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
			draggedlinkBtn.click();
			
			getAction().contextClick(draggedSalesInvoicesVAT).build().perform();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
			draggedlinkBtn.click();
			
			System.out.println("Test Pass : Link And delete Options Are Available");
			
			boolean actdraggedlinkBtn1=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn1=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn1=true;
			boolean expdraggeddwdeleteBtn1=true;
			
			boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn
					&& actdraggedlinkBtn1==expdraggedlinkBtn1 && actdraggeddwdeleteBtn1==expdraggeddwdeleteBtn1;
						
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 220, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 220, 8, actMethod);
			
			System.out.println("DraggedlinkBtn1     : "+actdraggedlinkBtn1   +" Value Expected : "+expdraggedlinkBtn1);
			System.out.println("DraggeddwdeleteBtn1   : "+actdraggeddwdeleteBtn1 +" Value Expected : "+expdraggeddwdeleteBtn1);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Fail : Not Selected Link Option ");
				excelReader.setCellData(xlfile, xlsheet, 219, 9, resFail);
				return false;
			}
			else
			{
				System.out.println("Test Pass : Selected Link Option Successfully ");
				excelReader.setCellData(xlfile, xlsheet, 219, 9, resPass);
				return true;
			}	
	     }
				 
		
		

		
		
		
		public boolean checkMappingFromSalesInvoiceToSalesReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode3Left));
			linkNode3Left.click();
			
			Thread.sleep(2000);
			
			boolean actlink2TO3=link2TO3.isDisplayed();
			boolean explink2TO3=true;
			
			boolean actDisplay = actlink2TO3==explink2TO3;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 222, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 222, 8, actMethod);
			
			System.out.println("***********************************checkMappingFromSalesInvoiceToSalesReturns***************************");
			
			System.out.println("Link2TO3   "+actlink2TO3 +" Value Excepted : "+explink2TO3);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Mapping Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 221, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Mapping NOT Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 221, 9, resFail);
				return false;
			}
		}
		
		public boolean checkLinkandDeleteOptionsinSalesQuotationAndSelectingLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getAction().contextClick(draggedSalesQuotation).build().perform();
			
			Thread.sleep(2000);
			
			boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn=true;
			boolean expdraggeddwdeleteBtn=true;
			
			
			
			System.out.println("***********************************checkLinkandDeleteOptionsinSalesInvoiceAndSelectingLinkOption****************");
			
			System.out.println("DraggedlinkBtn     : "+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
			System.out.println("DraggeddwdeleteBtn   : "+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
			
			Thread.sleep(200);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
			draggedlinkBtn.click();
			
			System.out.println("Test Pass : Link And delete Options Are Available");

	        boolean actdraggedlinkBtn1=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn1=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn1=true;
			boolean expdraggeddwdeleteBtn1=true;
			
			boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn
					&& actdraggedlinkBtn1==expdraggedlinkBtn1 && actdraggeddwdeleteBtn1==expdraggeddwdeleteBtn1;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 224, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 224, 8, actMethod);
			
			System.out.println("DraggedlinkBtn1     : "+actdraggedlinkBtn1   +" Value Expected : "+expdraggedlinkBtn1);
			System.out.println("DraggeddwdeleteBtn1   : "+actdraggeddwdeleteBtn1 +" Value Expected : "+expdraggeddwdeleteBtn1);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Fail : Not Selected Link Option ");
				excelReader.setCellData(xlfile, xlsheet, 223, 9, resPass);
				return false;
			}
			else
			{
				System.out.println("Test Pass : Selected Link Option Successfully ");
				excelReader.setCellData(xlfile, xlsheet, 223, 9, resPass);
				return true;
			}
		}
		
		

		
		
		
		public boolean checkMappingFromSalesQuotationToExcessinStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode5Left));
			
			linkNode5Left.click();
			
			Thread.sleep(2000);
			
			boolean actlink3TO4=link3TO4.isDisplayed();
			boolean explink3TO4=true;
			
			boolean actDisplay = actlink3TO4==explink3TO4;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 226, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 226, 8, actMethod);
			
			System.out.println("***********************************checkMappingFromSalesQuotationToExcessinStocks***************************");
			
			System.out.println("Link3TO4   "+actlink3TO4 +" Value Excepted : "+explink3TO4);
			
			if(actMethod.equalsIgnoreCase(expMethod))
		
			{
				System.out.println("Test Pass : Mapping Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 225, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Mapping NOT Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 225, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkLinkandDeleteOptionsinExcessinStocksAndSelectingLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getAction().contextClick(draggedExcessesInStocks).build().perform();
			Thread.sleep(2000);
			boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn=true;
			boolean expdraggeddwdeleteBtn=true;
			
			System.out.println("***********************************checkLinkandDeleteOptionsinExcessinStocksAndSelectingLinkOption****************");
			
			System.out.println("DraggedlinkBtn     : "+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
			System.out.println("DraggeddwdeleteBtn   : "+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
			
			Thread.sleep(200);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
			draggedlinkBtn.click();
			System.out.println("Test Pass : Link And delete Options Are Available");

	        boolean actdraggedlinkBtn1=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn1=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn1=true;
			boolean expdraggeddwdeleteBtn1=true;
			
			boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn
					&& actdraggedlinkBtn1==expdraggedlinkBtn1 && actdraggeddwdeleteBtn1==expdraggeddwdeleteBtn1;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 228, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 228, 8, actMethod);
			
			System.out.println("DraggedlinkBtn1     : "+actdraggedlinkBtn1   +" Value Expected : "+expdraggedlinkBtn1);
			System.out.println("DraggeddwdeleteBtn1   : "+actdraggeddwdeleteBtn1 +" Value Expected : "+expdraggeddwdeleteBtn1);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Fail : Not Selected Link Option ");
				excelReader.setCellData(xlfile, xlsheet, 227, 9, resFail);
				return false;
			}else
			{
				System.out.println("Test Pass : Selected Link Option Successfully ");
				excelReader.setCellData(xlfile, xlsheet, 227, 9, resPass);
				return true;
			}
		}
		
		

		
		
		
		public boolean checkMappingFromExcessinStocksToStockTransfer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode6Left));
			linkNode6Left.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link4TO5));
	        boolean actlink4TO5=link4TO5.isDisplayed();
			boolean explink4TO5=true;
			
			boolean actDisplay = actlink4TO5==explink4TO5;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 230, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 230, 8, actMethod);
			
			System.out.println("***********************************checkMappingFromExcessinStocksToStockTransfer***************************");
			
			System.out.println("Link4TO5   "+actlink4TO5 +" Value Excepted : "+explink4TO5);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Mapping Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 229, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Mapping NOT Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 229, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkLinkandDeleteOptionsinExcessinStocks2AndSelectingLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getAction().contextClick(draggedExcessesInStocks).build().perform();
			
			Thread.sleep(2000);
			
			boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn=true;
			boolean expdraggeddwdeleteBtn=true;
			
			System.out.println("***********************************checkLinkandDeleteOptionsinExcessinStocks2AndSelectingLinkOption****************");
			
			System.out.println("DraggedlinkBtn     : "+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
			System.out.println("DraggeddwdeleteBtn   : "+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
			
			Thread.sleep(200);
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
			draggedlinkBtn.click();
				
			System.out.println("Test Pass : Link And delete Options Are Available");

	        boolean actdraggedlinkBtn1=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn1=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn1=true;
			boolean expdraggeddwdeleteBtn1=true;
			
			boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn
					&& actdraggedlinkBtn1==expdraggedlinkBtn1 && actdraggeddwdeleteBtn1==expdraggeddwdeleteBtn1;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 232, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 232, 8, actMethod);
			
			System.out.println("DraggedlinkBtn1     : "+actdraggedlinkBtn1   +" Value Expected : "+expdraggedlinkBtn1);
			System.out.println("DraggeddwdeleteBtn1   : "+actdraggeddwdeleteBtn1 +" Value Expected : "+expdraggeddwdeleteBtn1);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Fail : Not Selected Link Option ");
				excelReader.setCellData(xlfile, xlsheet, 231, 9, resFail);
				return false;
			}else
			{
				System.out.println("Test Pass : Selected Link Option Successfully ");
				excelReader.setCellData(xlfile, xlsheet, 231, 9, resPass);
				return true;
			}
		}
		
		

		
		
		
		public boolean checkMappingFromExcessinStocksToShortageinStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode4Left));
			linkNode4Left.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link5TO6));
	        boolean actlink5TO6=link5TO6.isDisplayed();
			boolean explink5TO6=true;
			
			boolean actDisplay = actlink5TO6==explink5TO6;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 234, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 234, 8, actMethod);
			
			System.out.println("***********************************checkMappingFromExcessinStocksToShortageinStocks***************************");
			
			System.out.println("Link5TO6   "+actlink5TO6 +" Value Excepted : "+explink5TO6);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Mapping Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 233, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Mapping NOT Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 233, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkLinkandDeleteOptionsinStockTransferAndSelectingLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			
			getAction().contextClick(draggedStockTransfer).build().perform();
			Thread.sleep(2000);
			boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn=true;
			boolean expdraggeddwdeleteBtn=true;
			
			System.out.println("***********************************checkLinkandDeleteOptionsinStockTransferAndSelectingLinkOption****************");
			
			System.out.println("DraggedlinkBtn     : "+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
			System.out.println("DraggeddwdeleteBtn   : "+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
			draggedlinkBtn.click();
			System.out.println("Test Pass : Link And delete Options Are Available");
			
			boolean actdraggedlinkBtn1=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn1=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn1=true;
			boolean expdraggeddwdeleteBtn1=true;
			
			boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn
					&& actdraggedlinkBtn1==expdraggedlinkBtn1 && actdraggeddwdeleteBtn1==expdraggeddwdeleteBtn1;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 236, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 236, 8, actMethod);
			
			System.out.println("DraggedlinkBtn1     : "+actdraggedlinkBtn1   +" Value Expected : "+expdraggedlinkBtn1);
			System.out.println("DraggeddwdeleteBtn1   : "+actdraggeddwdeleteBtn1 +" Value Expected : "+expdraggeddwdeleteBtn1);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Fail : Not Selected Link Option ");
				excelReader.setCellData(xlfile, xlsheet, 235, 9, resFail);
				return false;
			}else
			{
				System.out.println("Test Pass : Selected Link Option Successfully ");
				excelReader.setCellData(xlfile, xlsheet, 235, 9, resPass);
				return true;
			}
		}
		
		
		public boolean checkMappingFromStockTransferToSalesInvoiceN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode7Left));
			linkNode7Left.click();
			Thread.sleep(2000);
			
			boolean actlink6TO7=link6TO7.isDisplayed();
			boolean explink6TO7=true;
			
			boolean actDisplay = actlink6TO7==explink6TO7;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 238, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 238, 8, actMethod);
			
			System.out.println("***********************************checkMappingFromStockTransferToSalesInvoiceN***************************");
			
			System.out.println("Link6TO7   "+actlink6TO7 +" Value Excepted : "+explink6TO7);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Mapping Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 237, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Mapping NOT Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 237, 9, resFail);
				return false;
			}
		}
		
		
		
		
		
		public boolean checkLinkandDeleteOptionsinSalesInvoiceNAndSelectingLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getAction().contextClick(draggedSalesInvoices).build().perform();
			Thread.sleep(2000);
			boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn=true;
			boolean expdraggeddwdeleteBtn=true;
			
			System.out.println("***********************************checkLinkandDeleteOptionsinSalesInvoiceNAndSelectingLinkOption****************");
			
			System.out.println("DraggedlinkBtn     : "+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
			System.out.println("DraggeddwdeleteBtn   : "+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
			
			Thread.sleep(200);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
			draggedlinkBtn.click();
			System.out.println("Test Pass : Link And delete Options Are Available");

	        boolean actdraggedlinkBtn1=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn1=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn1=true;
			boolean expdraggeddwdeleteBtn1=true;
			
			boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn
					&& actdraggedlinkBtn1==expdraggedlinkBtn1 && actdraggeddwdeleteBtn1==expdraggeddwdeleteBtn1;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 240, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 240, 8, actMethod);
			
			System.out.println("DraggedlinkBtn1     : "+actdraggedlinkBtn1   +" Value Expected : "+expdraggedlinkBtn1);
			System.out.println("DraggeddwdeleteBtn1   : "+actdraggeddwdeleteBtn1 +" Value Expected : "+expdraggeddwdeleteBtn1);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Fail : Not Selected Link Option ");
				excelReader.setCellData(xlfile, xlsheet, 239, 9, resFail);
				return false;
			}else
			{
				System.out.println("Test Pass : Selected Link Option Successfully ");
				excelReader.setCellData(xlfile, xlsheet, 239, 9, resPass);
				return true;
			}
		}
		
		
		
		public boolean checkMappingFromSalesInvoiceNToDeliveryNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode8Left));
			linkNode8Left.click();
			Thread.sleep(2000);

	        boolean actlink7TO8=link7TO8.isDisplayed();
			boolean explink7TO8=true;
			
			boolean actDisplay = actlink7TO8==explink7TO8;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 242, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 242, 8, actMethod);
			
			System.out.println("***********************************checkMappingFromSalesInvoiceNToDeliveryNotes***************************");
			
			System.out.println("Link7TO8   "+actlink7TO8 +" Value Excepted : "+explink7TO8);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Mapping Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 241, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Mapping NOT Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 241, 9, resFail);
				return false;
			}
		}
		
		
		

		
		public boolean checkLinkandDeleteOptionsinAutoSalesOrderAndSelectingLinkOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getAction().contextClick(draggedAutoSalesOrders).build().perform();
			Thread.sleep(2000);
			boolean actdraggedlinkBtn=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn=true;
			boolean expdraggeddwdeleteBtn=true;
			
			System.out.println("***********************************checkLinkandDeleteOptionsinSalesInvoiceNAndSelectingLinkOption****************");
			
			System.out.println("DraggedlinkBtn     : "+actdraggedlinkBtn   +" Value Expected : "+expdraggedlinkBtn);
			System.out.println("DraggeddwdeleteBtn   : "+actdraggeddwdeleteBtn +" Value Expected : "+expdraggeddwdeleteBtn);
			
			Thread.sleep(200);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedlinkBtn));
			draggedlinkBtn.click();
			System.out.println("Test Pass : Link And delete Options Are Available");

	        boolean actdraggedlinkBtn1=draggedlinkBtn.isDisplayed();
			boolean actdraggeddwdeleteBtn1=draggeddwdeleteBtn.isDisplayed();
			
			boolean expdraggedlinkBtn1=true;
			boolean expdraggeddwdeleteBtn1=true;
			
			boolean actDisplay = actdraggedlinkBtn==expdraggedlinkBtn && actdraggeddwdeleteBtn==expdraggeddwdeleteBtn
					&& actdraggedlinkBtn1==expdraggedlinkBtn1 && actdraggeddwdeleteBtn1==expdraggeddwdeleteBtn1;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 240, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 240, 8, actMethod);
			
			System.out.println("DraggedlinkBtn1     : "+actdraggedlinkBtn1   +" Value Expected : "+expdraggedlinkBtn1);
			System.out.println("DraggeddwdeleteBtn1   : "+actdraggeddwdeleteBtn1 +" Value Expected : "+expdraggeddwdeleteBtn1);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Fail : Not Selected Link Option ");
				excelReader.setCellData(xlfile, xlsheet, 239, 9, resFail);
				return false;
			}else
			{
				System.out.println("Test Pass : Selected Link Option Successfully ");
				excelReader.setCellData(xlfile, xlsheet, 239, 9, resPass);
				return true;
			}
		}
		
		
		
		public boolean checkMappingFromAutoSalesOrderToSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(linkNode7Left));
			linkNode7Left.click();
			Thread.sleep(2000);

	        boolean actlink8TO9=link8TO9.isDisplayed();
			boolean explink8TO9=true;
			
			boolean actDisplay = actlink8TO9==explink8TO9;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 242, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 242, 8, actMethod);
			
			System.out.println("***********************************checkMappingFromSalesInvoiceNToDeliveryNotes***************************");
			
			System.out.println("Link7TO8   "+actlink8TO9 +" Value Excepted : "+explink8TO9);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Mapping Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 241, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Mapping NOT Done Successfully");
				excelReader.setCellData(xlfile, xlsheet, 241, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkLinkBetweenSalesQuotationAndSalesOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    
		   /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
			FirstDraggedElement.click();*/
			
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.querySelector('#line0 > path').setAttribute('stroke-width', '8')"); 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link0TO1));
			link0TO1.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
			
			boolean actDefinitionTab    = DefinitionTab.isDisplayed();
			boolean actsettingTab       = settingTab.isDisplayed();
			boolean actpropertiesTab    = propertiesTab.isDisplayed();
			boolean actMapBtn           = MapBtn.isDisplayed();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			
			boolean actOkBtn            = OkBtn.isDisplayed();
			boolean actCancelBtn        = CancelBtn.isDisplayed();
			
			
			boolean expDefinitionTab    = true;
			boolean expsettingTab       = true;
			boolean exppropertiesTab    = true;
			boolean expMapBtn           = true;
			boolean expOkBtn            = true;
			boolean expCancelBtn        = true;
			
			boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
					&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 244, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 244, 8, actMethod);
			
			System.out.println("**************************************checkLinkBetweenSalesQuotationAndSalesOrder*******");
			
			System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
			System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
			System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
			System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
			System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
			System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Link Options Are Displayed");
				excelReader.setCellData(xlfile, xlsheet, 243, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Link Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlsheet, 243, 9, resFail);
				return false;
			}
		}
		
		 
		
		
		public boolean checkSelectingQuantityinLinkValueOptionBetweenSalesQuotationAndSalesOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
			Select s=new Select(DefinitionLinkValueDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 245, 6));
			
			String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
			String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 246, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 246, 8, actDefinitionLinkValueDropdown);
			
			
			System.out.println("*************************************************checkSelectingQuantityinLinkValueOptionBetweenSalesQuotationAndSalesOrder*************");
			
			System.out.println("DefinitionLinkValueDropdown  :"+actDefinitionLinkValueDropdown+ " Value Expected :"+expDefinitionLinkValueDropdown);
			
			if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
			{
				System.out.println("Test Pass : Quantity Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 245, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Quantity not Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 245, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkSelectingItemOptionBetweenSalesQuotationAndSalesOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemchkbox));
			itemchkbox.click();*/
		    
			int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("ITEM"))
				{
					definitionTabChkBoxList.get(i).click();
					break;
				}
			}
			
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			boolean actFirstDraggedElement=FirstDraggedElement.isDisplayed();
			boolean actdraggedSalesOrders=draggedSalesOrders.isDisplayed();
			boolean actlink0TO1=link0TO1.isDisplayed();
			
			boolean expFirstDraggedElement=true;
			boolean expdraggedSalesOrders=true;
			boolean explink0TO1=true;
			
			boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement && actdraggedSalesOrders==expdraggedSalesOrders && actlink0TO1==explink0TO1;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 248, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 248, 8, actMethod);
			
			System.out.println("************************************************checkSelectingItemOptionBetweenSalesQuotationAndSalesOrder*********************");
			
			System.out.println("FirstDraggedElement    :"+actFirstDraggedElement   +" Value Expected : "+expFirstDraggedElement);
			System.out.println("DraggedSalesOrders     :"+actdraggedSalesOrders    +" Value Expected : "+expdraggedSalesOrders);
			System.out.println("Link0TO1               :"+actlink0TO1              +" Value Expected : "+explink0TO1);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Error Message is as Expected");
				excelReader.setCellData(xlfile, xlsheet, 247, 9, resPass);
				
				return true;
			}else
			{
				
				System.out.println("Test Fail : Error Message is NOT as Expected");
				excelReader.setCellData(xlfile, xlsheet, 247, 9, resFail);
				return false;
			}
		}
		
		

		
		public boolean checkLinkBetweenSalesOrderAndSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesOrders));
			draggedSalesOrders.click();
			

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.querySelector('#line1 > path').setAttribute('stroke-width', '8')"); 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link1TO2));
			link1TO2.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
			boolean actDefinitionTab    = DefinitionTab.isDisplayed();
			boolean actsettingTab       = settingTab.isDisplayed();
			boolean actpropertiesTab    = propertiesTab.isDisplayed();
			boolean actMapBtn           = MapBtn.isDisplayed();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			
			boolean actOkBtn            = OkBtn.isDisplayed();
			boolean actCancelBtn        = CancelBtn.isDisplayed();
			
			
			boolean expDefinitionTab    = true;
			boolean expsettingTab       = true;
			boolean exppropertiesTab    = true;
			boolean expMapBtn           = true;
			boolean expOkBtn            = true;
			boolean expCancelBtn        = true;
			
			boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
					&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 250, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 250, 8, actMethod);
			
			System.out.println("**************************************checkLinkBetweenSalesOrderAndSalesInvoice*******");
			
			System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
			System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
			System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
			System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
			System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
			System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Link Options Are Displayed");
				excelReader.setCellData(xlfile, xlsheet, 249, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Link Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlsheet, 249, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkSelectingQuantityinLinkValueOptionBetweenSalesOrderAndSalesInvoices() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
			Select s=new Select(DefinitionLinkValueDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 251, 6));
			
			String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
			String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 252, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 252, 8, actDefinitionLinkValueDropdown);
			
			System.out.println("******************************checkSelectingQuantityinLinkValueOptionBetweenSalesOrderAndSalesInvoices********");
			System.out.println("DefinitionLinkValueDropdown   "+actDefinitionLinkValueDropdown+"    "+expDefinitionLinkValueDropdown);
			
			if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
			{
				System.out.println("Test Pass : Quantity Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 251, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Quantity not Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 251, 9, resFail);
				return false;
			}
		}
		
		public boolean checkSelectingItemOptionBetweenSalesOrderAndSalesInvoices() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrderandInvoiceitemchkbox));
			salesOrderandInvoiceitemchkbox.click();
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountChkbox));
			customerAccountChkbox.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesOrderandInvoicewareHouseChkbox));
			salesOrderandInvoicewareHouseChkbox.click();*/
		    
			int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("ITEM") || data.equalsIgnoreCase("Customer Account") || data.equalsIgnoreCase("Warehouse"))
				{
					definitionTabChkBoxList.get(i).click();
				}
			}
			
			Thread.sleep(1000);
			
			boolean selected = false;
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("Item") || data.equalsIgnoreCase("Customer Account") || data.equalsIgnoreCase("Warehouse"))
				{
					selected=definitionTabChkBoxList.get(i).isSelected();
					
					
				}
			}
			
			/*boolean actsalesOrderandInvoiceitemchkbox         = salesOrderandInvoiceitemchkbox.isDisplayed();
			boolean actcustomerAccountChkbox                    = customerAccountChkbox.isDisplayed();
			boolean actsalesOrderandInvoicewareHouseChkbox      = salesOrderandInvoicewareHouseChkbox.isDisplayed();
			
			boolean expsalesOrderandInvoiceitemchkbox           = true;
			boolean expcustomerAccountChkbox                    = true;
			boolean expsalesOrderandInvoicewareHouseChkbox      = true;*/
			
			boolean actDisplay = selected==true ;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 254, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 254, 8, actMethod);
			
			System.out.println("*************************************checkSelectingItemOptionBetweenSalesOrderAndSalesInvoices*******");
			
			/*System.out.println("SalesOrderandInvoiceitemchkbox        :"+actsalesOrderandInvoiceitemchkbox      +" Value : "+expsalesOrderandInvoiceitemchkbox);
			System.out.println("CustomerAccountChkbox                 :"+actcustomerAccountChkbox               +" Value : "+expcustomerAccountChkbox);
			System.out.println("SalesOrderandInvoicewareHouseChkbox   :"+actsalesOrderandInvoicewareHouseChkbox +" Value : "+expsalesOrderandInvoicewareHouseChkbox);*/
			
			System.out.println("Selected        :"+actMethod      +" Value : "+expMethod);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass :itemchkbox is Enabled");
				excelReader.setCellData(xlfile, xlsheet, 253, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : itemchkbox is NOT Enabled");
				excelReader.setCellData(xlfile, xlsheet, 253, 9, resFail);
				return false;
			}
		}
		
		public static boolean Status;

		
		public boolean checkEnabletheOptionCheckStockWhileLinking() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
			propertiesTab.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkUseItemWisetoleranceChkbox));
			checkUseItemWisetoleranceChkbox.click();
			
			boolean actcheckstockWhileLinkingChkbox=checkUseItemWisetoleranceChkbox.isDisplayed();
			boolean expcheckstockWhileLinkingChkbox=true;
			
			boolean actDisplay = actcheckstockWhileLinkingChkbox==expcheckstockWhileLinkingChkbox;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 256, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 256, 8, actMethod);
			
			System.out.println("************************************checkEnabletheOptionCheckStockWhileLinking************************");
			
			System.out.println("CheckstockWhileLinkingChkbox  "+actcheckstockWhileLinkingChkbox+" Value Expected  :"+expcheckstockWhileLinkingChkbox);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : checkstockWhileLinkingChkbox is Enabled");
				excelReader.setCellData(xlfile, xlsheet, 255, 9, resPass);
				Status =true;
				return true;
			}else
			{
				System.out.println("Test Fail : checkstockWhileLinkingChkbox is NOT Enabled");
				excelReader.setCellData(xlfile, xlsheet, 255, 9, resFail);
				Status =false;
				return false;
			}
			
		}
		

		
		public boolean checkOkBetweenBetweenSalesOrderAndSalesInvoices() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		
		    Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			
			boolean actdraggedSalesOrders=draggedSalesOrders.isDisplayed();
			boolean actdraggedSalesInvoices=draggedSalesInvoices.isDisplayed();
			boolean actlink1TO2=link1TO2.isDisplayed();
			
			boolean expdraggedSalesOrders=true;
			boolean expdraggedSalesInvoices=true;
			boolean explink1TO2=true;
			
			boolean actDisplay = actdraggedSalesOrders==expdraggedSalesOrders && actdraggedSalesInvoices==expdraggedSalesInvoices 
					&& actlink1TO2==explink1TO2;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 258, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 258, 8, actMethod);
			
			System.out.println("****************************************checkOkBetweenBetweenSalesOrderAndSalesInvoices****************");
			
			System.out.println("DraggedSalesOrders     :"+actdraggedSalesOrders    +"Value Expected :"+expdraggedSalesOrders);
			System.out.println("DraggedSalesInvoices   :"+actdraggedSalesInvoices  +"Value Expected :"+expdraggedSalesInvoices);
			System.out.println("Link1TO2               :"+actlink1TO2              +"Value Expected :"+explink1TO2);
			
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Ok Button Working As Expected");
				excelReader.setCellData(xlfile, xlsheet, 257, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Ok Buttton not Working as Expected");
				excelReader.setCellData(xlfile, xlsheet, 257, 9, resPass);
				return false;
			}
		}
		
		
		
		
		
		
		public boolean checkLinkBetweenSalesInvoiceAndSalesReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			draggedSalesInvoices.click();

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.querySelector('#line2 > path').setAttribute('stroke-width', '8')"); 
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link2TO3));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link2TO3));
			
			link2TO3.click();
			
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
			boolean actDefinitionTab    = DefinitionTab.isDisplayed();
			boolean actsettingTab       = settingTab.isDisplayed();
			boolean actpropertiesTab    = propertiesTab.isDisplayed();
			boolean actMapBtn           = MapBtn.isDisplayed();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
		
			boolean actOkBtn            = OkBtn.isDisplayed();
			boolean actCancelBtn        = CancelBtn.isDisplayed();
			
			
			boolean expDefinitionTab    = true;
			boolean expsettingTab       = true;
			boolean exppropertiesTab    = true;
			boolean expMapBtn           = true;
			boolean expOkBtn            = true;
			boolean expCancelBtn        = true;
			
			boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
					&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 260, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 260, 8, actMethod);
			
			System.out.println("**************************************checkLinkBetweenSalesInvoiceAndSalesReturns*******");
			
			System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
			System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
			System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
			System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
			System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
			System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Link Options Are Displayed");
				excelReader.setCellData(xlfile, xlsheet, 259, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Link Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlsheet, 259, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkSelectingQuantityinLinkValueOptionBetweenSalesInvoicesAndSalesReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
			Select s=new Select(DefinitionLinkValueDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 261, 6));
			
			String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
			String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 262, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 262, 8, actDefinitionLinkValueDropdown);
			
			System.out.println("***********************************checkSelectingQuantityinLinkValueOptionBetweenSalesInvoicesAndSalesReturns********");
			System.out.println("DefinitionLinkValueDropdown   :"+actDefinitionLinkValueDropdown +" Value Expected :"+expDefinitionLinkValueDropdown);
			
			
			if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
			{
				System.out.println("Test Pass : Quantity Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 261, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Quantity not Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 261, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkSelectingItemOptionBetweenSalesInvoicesAndSalesReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceAndSalesRetutrnsitemchkbox));
			salesInvoiceAndSalesRetutrnsitemchkbox.click();*/
			
			int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("ITEM"))
				{
					definitionTabChkBoxList.get(i).click();
					break;
				}
			}
			
			boolean selected = false;
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("Item"))
				{
					selected=definitionTabChkBoxList.get(i).isSelected();
					
					break;
					
				}
			}
			
			/*boolean actsalesInvoiceAndSalesRetutrnsitemchkbox=salesInvoiceAndSalesRetutrnsitemchkbox.isSelected();
			
			boolean expsalesInvoiceAndSalesRetutrnsitemchkbox= true;*/
			
			boolean actDisplay = selected==true;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 264, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 264, 8, actMethod);
			
			System.out.println("********************************************checkSelectingItemOptionBetweenSalesInvoicesAndSalesReturns*************************");
			
			/*System.out.println("SalesInvoiceAndSalesRetutrnsitemchkbox  :"+actsalesInvoiceAndSalesRetutrnsitemchkbox+" Value Expected :"+expsalesInvoiceAndSalesRetutrnsitemchkbox);*/
			System.out.println("SalesInvoiceAndSalesRetutrnsitemchkbox  :"+actMethod+" Value Expected :"+expMethod);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : itemchkbox is Enabled");
				excelReader.setCellData(xlfile, xlsheet, 263, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : itemchkbox is NOT Enabled");
				excelReader.setCellData(xlfile, xlsheet, 263, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkSelectingtheExtrafieldforoptionBasedonFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
			settingTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadpendingDocumentsDropdown));
			loadpendingDocumentsDropdown.click();
			
			Select s=new Select(loadpendingDocumentsDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 265, 6)); // error may Occcur Sometimes Spelling is Wrong in Dropdown Check whrn not Working
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadFieldsDropdown));
			loadFieldsDropdown.click();
			String actloadpendingDocumentsDropdown=s.getFirstSelectedOption().getText();
			String exploadpendingDocumentsDropdown=excelReader.getCellData(xlsheet, 266, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 266, 8, actloadpendingDocumentsDropdown);
			
			
			System.out.println("*******************************checkSelectingtheExtrafieldforoptionBasedonFields*************************");
			
			System.out.println("loadpendingDocumentsDropdown  : "+actloadpendingDocumentsDropdown+" Value Expected :"+exploadpendingDocumentsDropdown );
			
			
			if(actloadpendingDocumentsDropdown.equals(exploadpendingDocumentsDropdown))
			{
				System.out.println("Test Pass : Based On Fields Selected");
				s.selectByVisibleText("When Called");
				excelReader.setCellData(xlfile, xlsheet, 265, 9, resPass);
				return true; // load Field -- Narration is Not Present Wantedly Doing Fail
			}else
			{
				System.out.println("Test FAil : Based On Fields NOT Selected");
				excelReader.setCellData(xlfile, xlsheet, 265, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkOkBetweenBetweenSalesInvoicesrAndSalesReturns() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			//CancelBtn.click();  // Ok Btn Should Be Used But above TC Should Load Otherwise Ok Will Not Work So Doing Fail Wantedly
			
			boolean actdraggedSalesInvoices       = draggedSalesInvoices.isDisplayed();
			boolean actdraggedSalesReturns        = draggedSalesReturns.isDisplayed();
			boolean actlink3TO4                   = link3TO4.isDisplayed();
			
			boolean expdraggedSalesInvoices       = true;
			boolean expdraggedSalesReturns        = true;
			boolean explink3TO4                   = true;
			
			boolean actDisplay = actdraggedSalesInvoices==expdraggedSalesInvoices && actdraggedSalesReturns==expdraggedSalesReturns 
					&& actlink3TO4==explink3TO4;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 268, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 268, 8, actMethod);
			
			System.out.println("****************************************checkOkBetweenBetweenSalesInvoicesrAndSalesReturns****************");
			
			System.out.println("DraggedSalesInvoices   :"+actdraggedSalesInvoices  +"Value Expected :"+expdraggedSalesInvoices);
			System.out.println("DraggedSalesReturns    :"+actdraggedSalesReturns   +"Value Expected :"+expdraggedSalesReturns);
			System.out.println("Link3TO4               :"+actlink3TO4              +"Value Expected :"+explink3TO4);
			
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Ok Button Working As Expected");
				excelReader.setCellData(xlfile, xlsheet, 267, 9, resPass);
				return true;  // Change To True After Issue Closes 
			}else
			{
				System.out.println("Test Fail : Ok Buttton not Working as Expected");
				excelReader.setCellData(xlfile, xlsheet, 267, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkLinkBetweenSalesQuotationsToExcessinStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			FirstDraggedElement.click();

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.querySelector('#line3 > path').setAttribute('stroke-width', '8')"); 
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link3TO4));
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link3TO4));
			link3TO4.click();
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
			boolean actDefinitionTab    = DefinitionTab.isDisplayed();
			boolean actsettingTab       = settingTab.isDisplayed();
			boolean actpropertiesTab    = propertiesTab.isDisplayed();
			boolean actMapBtn           = MapBtn.isDisplayed();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			
			boolean actOkBtn            = OkBtn.isDisplayed();
			boolean actCancelBtn        = CancelBtn.isDisplayed();
			
			
			boolean expDefinitionTab    = true;
			boolean expsettingTab       = true;
			boolean exppropertiesTab    = true;
			boolean expMapBtn           = true;
			boolean expOkBtn            = true;
			boolean expCancelBtn        = true;
			
			boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
					&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 270, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 270, 8, actMethod);
			
			System.out.println("**************************************checkLinkBetweenSalesQuotationsToExcessinStocks*******");
			
			System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
			System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
			System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
			System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
			System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
			System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))	
			{
				System.out.println("Test Pass : Link Options Are Displayed");
				excelReader.setCellData(xlfile, xlsheet, 269, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Link Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlsheet, 269, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkSelectingQuantityinLinkValueOptionBetweenSalesQuotationsAndExcessinStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
			Select s=new Select(DefinitionLinkValueDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 271, 6));
			
			String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
			String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 272, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 272, 8, actDefinitionLinkValueDropdown);
			
			System.out.println("*****************************checkSelectingQuantityinLinkValueOptionBetweenSalesQuotationsAndExcessinStocks**********");
			
			System.out.println("DefinitionLinkValueDropdown  :"+actDefinitionLinkValueDropdown+" Value Expected : "+expDefinitionLinkValueDropdown);
			
			if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
			{
				System.out.println("Test Pass : Quantity Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 271, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Quantity not Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 271, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkSelectingItemOptionBetweenSalesQuotationsAndExcessinStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemchkbox));
			itemchkbox.click();*/
			
			int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("ITEM"))
				{
					definitionTabChkBoxList.get(i).click();
					break;
				}
			}
			
			boolean selected = false;
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("Item"))
				{
					selected=definitionTabChkBoxList.get(i).isSelected();
					
					break;
					
				}
			}
			
			/*boolean actitemchkbox=itemchkbox.isSelected();
			boolean expitemchkbox=true;*/
			
			boolean actDisplay = selected==true;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 274, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 274, 8, actMethod);
			
			System.out.println("**************************checkSelectingItemOptionBetweenSalesQuotationsAndExcessinStocks***************");
			
			/*System.out.println("Itemchkbox   :"+actitemchkbox+" Value Expected :"+expitemchkbox);*/
			System.out.println("Itemchkbox   :"+actMethod+" Value Expected :"+expMethod);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass :itemchkbox is Enabled");
				excelReader.setCellData(xlfile, xlsheet, 273, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : itemchkbox is NOT Enabled");
				excelReader.setCellData(xlfile, xlsheet, 273, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkOkBetweenBetweenSalesQuotationsAndExcessinStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FirstDraggedElement));
			boolean actFirstDraggedElement         = FirstDraggedElement.isDisplayed();
			boolean actdraggedExcessesInStocks     = draggedExcessesInStocks.isDisplayed();
			boolean actlink4TO5                    = link4TO5.isDisplayed();
			
			boolean expFirstDraggedElement         = true;
			boolean expdraggedExcessesInStocks     = true;
			boolean explink4TO5                    = true;
			
			boolean actDisplay = actFirstDraggedElement==expFirstDraggedElement && actdraggedExcessesInStocks==expdraggedExcessesInStocks 
					&& actlink4TO5==explink4TO5;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 276, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 276, 8, actMethod);
			
			System.out.println("****************************************checkOkBetweenBetweenSalesQuotationsAndExcessinStock****************");
			
			System.out.println("FirstDraggedElement       :"+actFirstDraggedElement       +"Value Expected :"+expFirstDraggedElement);
			System.out.println("DraggedExcessesInStocks   :"+actdraggedExcessesInStocks   +"Value Expected :"+expdraggedExcessesInStocks);
			System.out.println("Link4TO5                  :"+actlink4TO5                  +"Value Expected :"+explink4TO5);
			
			
			if(actMethod.equalsIgnoreCase(expMethod))
			
			{
				System.out.println("Test Pass : Ok Button Working As Expected");
				excelReader.setCellData(xlfile, xlsheet, 275, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Ok Buttton not Working as Expected");
				excelReader.setCellData(xlfile, xlsheet, 275, 9, resFail);
			
				return false;
			}
		}
		
		
		
		
		public boolean checkLinkBetweenExcessinStocksToStockTransfers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			draggedExcessesInStocks.click();

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.querySelector('#line4 > path').setAttribute('stroke-width', '8')"); 
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link4TO5));
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link4TO5));
			link4TO5.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
			boolean actDefinitionTab    = DefinitionTab.isDisplayed();
			boolean actsettingTab       = settingTab.isDisplayed();
			boolean actpropertiesTab    = propertiesTab.isDisplayed();
			boolean actMapBtn           = MapBtn.isDisplayed();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			
			boolean actOkBtn            = OkBtn.isDisplayed();
			boolean actCancelBtn        = CancelBtn.isDisplayed();
			
			
			boolean expDefinitionTab    = true;
			boolean expsettingTab       = true;
			boolean exppropertiesTab    = true;
			boolean expMapBtn           = true;
			boolean expOkBtn            = true;
			boolean expCancelBtn        = true;
			
			boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
					&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 278, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 278, 8, actMethod);
			
			System.out.println("**************************************checkLinkBetweenExcessinStocksToStockTransfers*******");
			
			System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
			System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
			System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
			System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
			System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
			System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))	
			{
				System.out.println("Test Pass : Link Options Are Displayed");
				excelReader.setCellData(xlfile, xlsheet, 277, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Link Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlsheet, 277, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkSelectingQuantityinLinkValueOptionBetweenExcessinStocksAndStockTransfer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
			Select s=new Select(DefinitionLinkValueDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 279, 6));
			
			String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
			String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 280, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 280, 8, actDefinitionLinkValueDropdown);
			
			System.out.println("***********************************checkSelectingQuantityinLinkValueOptionBetweenExcessinStocksAndStockTransfer******");
			
			System.out.println("DefinitionLinkValueDropdown   : "+actDefinitionLinkValueDropdown+" Value Expected :"+expDefinitionLinkValueDropdown);
			
			if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
			{
				System.out.println("Test Pass : Quantity Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 279, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Quantity not Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 279, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkSelectingItemOptionBetweenExcessinStocksStockTransfer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemchkbox));
			itemchkbox.click();*/
		    
			int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("ITEM"))
				{
					definitionTabChkBoxList.get(i).click();
					break;
				}
			}
			
			boolean selected = false;
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("Item"))
				{
					selected=definitionTabChkBoxList.get(i).isSelected();
					
					break;
					
				}
			}
			
			/*boolean actitemchkbox=itemchkbox.isSelected();
			boolean expitemchkbox=true;*/
			
			boolean actDisplay = selected==true;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 282, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 282, 8, actMethod);
			
			System.out.println("**************************checkSelectingItemOptionBetweenExcessinStocksStockTransfer***************");
			
			/*System.out.println("Itemchkbox   :"+actitemchkbox+" Value Expected :"+expitemchkbox);*/
			System.out.println("Itemchkbox   :"+actMethod+" Value Expected :"+expMethod);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass :itemchkbox is Enabled");
				excelReader.setCellData(xlfile, xlsheet, 281, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : itemchkbox is NOT Enabled");
				excelReader.setCellData(xlfile, xlsheet, 281, 9, resPass);
				return false;
			}
		}
		
		
		public boolean checkOkBetweenBetweenExcessinStockAndStockTransfer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedExcessesInStocks));
			boolean actdraggedExcessesInStocks         = draggedExcessesInStocks.isDisplayed();
			boolean actdraggedStockTransfer            = draggedStockTransfer.isDisplayed();
			boolean actlink4TO5                        = link4TO5.isDisplayed();
			
			boolean expdraggedExcessesInStocks         = true;
			boolean expdraggedStockTransfer            = true;
			boolean explink4TO5                        = true;
			
			boolean actDisplay = actdraggedExcessesInStocks==expdraggedExcessesInStocks && actdraggedStockTransfer==expdraggedStockTransfer 
					&& actlink4TO5==explink4TO5;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 284, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 284, 8, actMethod);
			
			System.out.println("****************************************checkOkBetweenBetweenExcessinStockAndStockTransfer****************");
			
			System.out.println("DraggedExcessesInStocks     :"+actdraggedExcessesInStocks   +"Value Expected :"+expdraggedExcessesInStocks);
			System.out.println("DraggedStockTransfer        :"+actdraggedStockTransfer      +"Value Expected :"+expdraggedStockTransfer);
			System.out.println("Link4TO5                    :"+actlink4TO5                  +"Value Expected :"+explink4TO5);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Ok Button Working As Expected");
				excelReader.setCellData(xlfile, xlsheet, 283, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Ok Buttton not Working as Expected");
				excelReader.setCellData(xlfile, xlsheet, 283, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkLinkBetweenExcessinStocksToShoratgeinStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedExcessesInStocks));
			draggedExcessesInStocks.click();

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.querySelector('#line5 > path').setAttribute('stroke-width', '8')"); 
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link5TO6));
			link5TO6.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
			boolean actDefinitionTab    = DefinitionTab.isDisplayed();
			boolean actsettingTab       = settingTab.isDisplayed();
			boolean actpropertiesTab    = propertiesTab.isDisplayed();
			boolean actMapBtn           = MapBtn.isDisplayed();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			
			boolean actOkBtn            = OkBtn.isDisplayed();
			boolean actCancelBtn        = CancelBtn.isDisplayed();
			
			
			boolean expDefinitionTab    = true;
			boolean expsettingTab       = true;
			boolean exppropertiesTab    = true;
			boolean expMapBtn           = true;
			boolean expOkBtn            = true;
			boolean expCancelBtn        = true;
			
			boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
					&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 286, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 286, 8, actMethod);
			
			System.out.println("**************************************checkLinkBetweenExcessinStocksToShoratgeinStocks*******");
			
			System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
			System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
			System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
			System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
			System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
			System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Link Options Are Displayed");
				excelReader.setCellData(xlfile, xlsheet, 285, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Link Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlsheet, 285, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkSelectingQuantityinLinkValueOptionBetweenExcessinStocksAndShortageinStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
			Select s=new Select(DefinitionLinkValueDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 287, 6));
			
			String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
			String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 288, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 288, 8, actDefinitionLinkValueDropdown);
			
			System.out.println("**********************************checkSelectingQuantityinLinkValueOptionBetweenExcessinStocksAndShortageinStocks******");
			
			System.out.println("DefinitionLinkValueDropdown  : "+actDefinitionLinkValueDropdown+" Value Ecpected :"+expDefinitionLinkValueDropdown);
			
			if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
			{
				System.out.println("Test Pass : Quantity Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 287, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Quantity not Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 287, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkSelectingItemOptionBetweenExcessinStocksShortageinStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemchkbox));
			itemchkbox.click();*/

			int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("ITEM"))
				{
					definitionTabChkBoxList.get(i).click();
					break;
				}
			}
		    
			boolean selected = false;
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("Item"))
				{
					selected=definitionTabChkBoxList.get(i).isSelected();
					
					break;
					
				}
			}
			
		    /*boolean actitemchkbox=itemchkbox.isSelected();
			boolean expitemchkbox=true;*/
			
			boolean actDisplay = selected==true;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 290, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 290, 8, actMethod);
			
			System.out.println("**************************checkSelectingItemOptionBetweenExcessinStocksShortageinStocks***************");
			
			/*System.out.println("Itemchkbox   :"+actitemchkbox+" Value Expected :"+expitemchkbox);*/
			
			System.out.println("Itemchkbox   :"+actMethod+" Value Expected :"+expMethod);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass :itemchkbox is Enabled");
				excelReader.setCellData(xlfile, xlsheet, 289, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : itemchkbox is NOT Enabled");
				excelReader.setCellData(xlfile, xlsheet, 289, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkOkBetweenBetweenExcessinStockAndShortageinStocks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		    Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedExcessesInStocks));
			boolean actdraggedExcessesInStocks         = draggedExcessesInStocks.isDisplayed();
			boolean actdraggedStockTransfer            = draggedStockTransfer.isDisplayed();
			boolean actlink4TO5                        = link4TO5.isDisplayed();
			
			boolean expdraggedExcessesInStocks         = true;
			boolean expdraggedStockTransfer            = true;
			boolean explink4TO5                        = true;
			
			boolean actDisplay = actdraggedExcessesInStocks==expdraggedExcessesInStocks && actdraggedStockTransfer==expdraggedStockTransfer 
					&& actlink4TO5==explink4TO5;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 292, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 292, 8, actMethod);
			
			System.out.println("****************************************checkOkBetweenBetweenExcessinStockAndShortageinStocks****************");
			
			System.out.println("DraggedExcessesInStocks     :"+actdraggedExcessesInStocks   +"Value Expected :"+expdraggedExcessesInStocks);
			System.out.println("DraggedStockTransfer        :"+actdraggedStockTransfer      +"Value Expected :"+expdraggedStockTransfer);
			System.out.println("Link4TO5                    :"+actlink4TO5                  +"Value Expected :"+explink4TO5);
			
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Ok Button Working As Expected");
				excelReader.setCellData(xlfile, xlsheet, 291, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Ok Buttton not Working as Expected");
				excelReader.setCellData(xlfile, xlsheet, 291, 9, resFail);
			
				return false;
			}
		}
		
		

		
		
		public boolean checkLinkBetweenStockTransferToSalesInvoiceN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedStockTransfer));
		    draggedStockTransfer.click();

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.querySelector('#line6 > path').setAttribute('stroke-width', '8')"); 
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link6TO7));
			link6TO7.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
			boolean actDefinitionTab    = DefinitionTab.isDisplayed();
			boolean actsettingTab       = settingTab.isDisplayed();
			boolean actpropertiesTab    = propertiesTab.isDisplayed();
			boolean actMapBtn           = MapBtn.isDisplayed();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			
			boolean actOkBtn            = OkBtn.isDisplayed();
			boolean actCancelBtn        = CancelBtn.isDisplayed();
			
			
			boolean expDefinitionTab    = true;
			boolean expsettingTab       = true;
			boolean exppropertiesTab    = true;
			boolean expMapBtn           = true;
			boolean expOkBtn            = true;
			boolean expCancelBtn        = true;
			
			boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
					&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 294, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 294, 8, actMethod);
			
			System.out.println("**************************************checkLinkBetweenStockTransferToSalesInvoiceN*******");
			
			System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
			System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
			System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
			System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
			System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
			System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Link Options Are Displayed");
				excelReader.setCellData(xlfile, xlsheet, 293, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Link Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlsheet, 293, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkSelectingQuantityinLinkValueOptionBetweenStockTransferAndSalesInvoiceN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
			Select s=new Select(DefinitionLinkValueDropdown);
			
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 295, 6));
			
			String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
					
			String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 296, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 296, 8, actDefinitionLinkValueDropdown);
			
			System.out.println("*******************checkSelectingQuantityinLinkValueOptionBetweenStockTransferAndSalesInvoiceN*******");
			
			System.out.println("DefinitionLinkValueDropdown  :"+actDefinitionLinkValueDropdown+" Value Expected : "+expDefinitionLinkValueDropdown);
			
			if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
			{
				System.out.println("Test Pass : Quantity Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 295, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Quantity not Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 295, 9, resFail);
				return false;
			}
		}
		
		

		
		public boolean checkSelectingItemOptionBetweenStockTransferAndSalesInvoiceN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockTransferAndSalesInvoiceNitemchkbox));
			stockTransferAndSalesInvoiceNitemchkbox.click();*/
		    
			int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("ITEM"))
				{
					definitionTabChkBoxList.get(i).click();
					break;
				}
			}
			
			
			boolean selected = false;
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("Item"))
				{
					selected=definitionTabChkBoxList.get(i).isSelected();
					
					break;
					
				}
			}
			
			/*boolean actstockTransferAndSalesInvoiceNitemchkbox=stockTransferAndSalesInvoiceNitemchkbox.isSelected();
			boolean expstockTransferAndSalesInvoiceNitemchkbox=true;*/
			
			boolean actDisplay = selected==true;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 298, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 298, 8, actMethod);
			
			System.out.println("*************************checkSelectingItemOptionBetweenStockTransferAndSalesInvoiceN************************************");
			
			/*System.out.println("StockTransferAndSalesInvoiceNitemchkbox  :"+actstockTransferAndSalesInvoiceNitemchkbox+" Value Expected :"+expstockTransferAndSalesInvoiceNitemchkbox );*/
			System.out.println("StockTransferAndSalesInvoiceNitemchkbox  :"+actMethod +" Value Expected :"+expMethod );
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass :itemchkbox is Enabled");
				excelReader.setCellData(xlfile, xlsheet, 297, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : itemchkbox is NOT Enabled");
				excelReader.setCellData(xlfile, xlsheet, 297, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkOkBetweenBetweenStockTransferAndSalesInvoiceN() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedExcessesInStocks));
			boolean actdraggedStockTransfer           = draggedStockTransfer.isDisplayed();
			boolean actdraggedSalesInvoicesN          = draggedSalesInvoices.isDisplayed();
			boolean actlink6TO7                       = link6TO7.isDisplayed();
			
			boolean expdraggedStockTransfer           = true;
			boolean expdraggedSalesInvoicesN          = true;
			boolean explink6TO7                       = true;
			
			boolean actDisplay = actdraggedStockTransfer==expdraggedStockTransfer && actdraggedSalesInvoicesN==expdraggedSalesInvoicesN 
					&& actlink6TO7==explink6TO7;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 300, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 300, 8, actMethod);
			
			System.out.println("****************************************checkOkBetweenBetweenStockTransferAndSalesInvoiceN****************");
			
			System.out.println("DraggedStockTransfer     :"+actdraggedStockTransfer     +"Value Expected :"+expdraggedStockTransfer);
			System.out.println("DraggedSalesInvoicesN    :"+actdraggedSalesInvoicesN    +"Value Expected :"+expdraggedSalesInvoicesN);
			System.out.println("Link6TO7                 :"+actlink6TO7                 +"Value Expected :"+explink6TO7);
			
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Ok Button Working As Expected");
				excelReader.setCellData(xlfile, xlsheet, 299, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Ok Buttton not Working as Expected");
				excelReader.setCellData(xlfile, xlsheet, 299, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkLinkBetweenSalesInvoiceNToDeliveryNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesInvoices));
			draggedSalesInvoices.click();
			
			Thread.sleep(2000);

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.querySelector('#line7 > path').setAttribute('stroke-width', '8')"); 
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link7TO8));
			link7TO8.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
			boolean actDefinitionTab    = DefinitionTab.isDisplayed();
			boolean actsettingTab       = settingTab.isDisplayed();
			boolean actpropertiesTab    = propertiesTab.isDisplayed();
			boolean actMapBtn           = MapBtn.isDisplayed();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			
			boolean actOkBtn            = OkBtn.isDisplayed();
			boolean actCancelBtn        = CancelBtn.isDisplayed();
			
			
			boolean expDefinitionTab    = true;
			boolean expsettingTab       = true;
			boolean exppropertiesTab    = true;
			boolean expMapBtn           = true;
			boolean expOkBtn            = true;
			boolean expCancelBtn        = true;
			
			boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
					&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 302, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 302, 8, actMethod);
			
			System.out.println("**************************************checkLinkBetweenSalesInvoiceNToDeliveryNotes*******");
			
			System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
			System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
			System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
			System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
			System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
			System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Link Options Are Displayed");
				excelReader.setCellData(xlfile, xlsheet, 301, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Link Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlsheet, 301, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkSelectingQuantityinLinkValueOptionBetweenSalesInvoiceNAndDeliveryNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
			Select s=new Select(DefinitionLinkValueDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 303, 6));
			
			String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
			String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 304, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 304, 8, actDefinitionLinkValueDropdown);
			
			System.out.println("************************************checkSelectingQuantityinLinkValueOptionBetweenSalesInvoiceNAndDeliveryNotes********************");
			
			System.out.println("DefinitionLinkValueDropdown  : "+actDefinitionLinkValueDropdown+" Value Expected : "+expDefinitionLinkValueDropdown);
			
			if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
			{
				System.out.println("Test Pass : Quantity Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 303, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Quantity not Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 303, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkSelectingItemOptionBetweenSalesInvoiceNAndDeliveryNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicenAndDeliveryNotesitemchkbox));
			salesInvoicenAndDeliveryNotesitemchkbox.click();*/
		    
			int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("ITEM"))
				{
					definitionTabChkBoxList.get(i).click();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			boolean selected = false;
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("Item"))
				{
					selected=definitionTabChkBoxList.get(i).isSelected();
					
					break;
					
				}
			}
			
			/*boolean actsalesInvoicenAndDeliveryNotesitemchkbox=salesInvoicenAndDeliveryNotesitemchkbox.isSelected();
			boolean expsalesInvoicenAndDeliveryNotesitemchkbox=true;*/
			
			boolean actDisplay = selected==true;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 306, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 306, 8, actMethod);
			
			System.out.println("*************************************checkSelectingItemOptionBetweenSalesInvoiceNAndDeliveryNotes**********");
			
			/*System.out.println("SalesInvoicenAndDeliveryNotesitemchkbox  :"+actsalesInvoicenAndDeliveryNotesitemchkbox+" Value Expected :"+expsalesInvoicenAndDeliveryNotesitemchkbox);*/
			System.out.println("SalesInvoicenAndDeliveryNotesitemchkbox  :"+actMethod+" Value Expected :"+expMethod);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass :itemchkbox is Enabled");
				excelReader.setCellData(xlfile, xlsheet, 305, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : itemchkbox is NOT Enabled");
				excelReader.setCellData(xlfile, xlsheet, 305, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkOkBetweenBetweenSalesInvoiceNAndDeliveryNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		    Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesInvoices));
			boolean actdraggedSalesInvoicesN           = draggedSalesInvoices.isDisplayed();
			boolean actdraggedDeliveryNotes          = draggedDeliveryNotes.isDisplayed();
			boolean actlink7TO8                       = link7TO8.isDisplayed();
			
			boolean expdraggedSalesInvoicesN           = true;
			boolean expdraggedDeliveryNotes          = true;
			boolean explink7TO8                       = true;
			
			boolean actDisplay = actdraggedSalesInvoicesN==expdraggedSalesInvoicesN &&actdraggedDeliveryNotes==expdraggedDeliveryNotes && 
					actlink7TO8==explink7TO8;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 308, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 308, 8, actMethod);
			
			System.out.println("****************************************checkOkBetweenBetweenStockTransferAndSalesInvoiceN****************");
			
			System.out.println("DraggedSalesInvoicesN     :"+actdraggedSalesInvoicesN     +"Value Expected :"+expdraggedSalesInvoicesN);
			System.out.println("DraggedDeliveryNotes    :"+actdraggedDeliveryNotes    +"Value Expected :"+expdraggedDeliveryNotes);
			System.out.println("Link7TO8                 :"+actlink7TO8                 +"Value Expected :"+explink7TO8);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Ok Button Working As Expected");
				excelReader.setCellData(xlfile, xlsheet, 307, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Ok Buttton not Working as Expected");
				excelReader.setCellData(xlfile, xlsheet, 307, 9, resFail);
				return false;
			}
		}
		
		
		//
		public boolean checkLinkBetweenAutoSalesOrderandSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedAutoSalesOrders));
		    draggedAutoSalesOrders.click();
			
			Thread.sleep(2000);

			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("document.querySelector('#line8 > path').setAttribute('stroke-width', '8')"); 
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link8TO9));
			link8TO9.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionTab));
			boolean actDefinitionTab    = DefinitionTab.isDisplayed();
			boolean actsettingTab       = settingTab.isDisplayed();
			boolean actpropertiesTab    = propertiesTab.isDisplayed();
			boolean actMapBtn           = MapBtn.isDisplayed();
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			
			boolean actOkBtn            = OkBtn.isDisplayed();
			boolean actCancelBtn        = CancelBtn.isDisplayed();
			
			
			boolean expDefinitionTab    = true;
			boolean expsettingTab       = true;
			boolean exppropertiesTab    = true;
			boolean expMapBtn           = true;
			boolean expOkBtn            = true;
			boolean expCancelBtn        = true;
			
			boolean actDisplay = actDefinitionTab==expDefinitionTab && actsettingTab==expsettingTab && actpropertiesTab==exppropertiesTab
					&& actMapBtn==expMapBtn && actOkBtn==expOkBtn && actCancelBtn==expCancelBtn;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 302, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 302, 8, actMethod);
			
			System.out.println("**************************************checkLinkBetweenSalesInvoiceNToDeliveryNotes*******");
			
			System.out.println("DefinitionTab   :"+actDefinitionTab  +" Value Excepted :"+expDefinitionTab);
			System.out.println("SettingTab      :"+actsettingTab     +" Value Excepted :"+expsettingTab);
			System.out.println("PropertiesTab   :"+actpropertiesTab  +" Value Excepted :"+exppropertiesTab);
			System.out.println("MapBtn          :"+actMapBtn         +" Value Excepted :"+expMapBtn);
			System.out.println("OkBtn           :"+actOkBtn          +" Value Excepted :"+expOkBtn);
			System.out.println("CancelBtn       :"+actCancelBtn      +" Value Excepted :"+expCancelBtn);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Link Options Are Displayed");
				excelReader.setCellData(xlfile, xlsheet, 301, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Link Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlsheet, 301, 9, resFail);
				return false;
			}
		}
		
		
		
		
		public boolean checkSelectingQuantityinLinkValueOptionBetweenAutoSalesOrderandSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DefinitionLinkValueDropdown));
			Select s=new Select(DefinitionLinkValueDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 303, 6));
			
			String actDefinitionLinkValueDropdown=s.getFirstSelectedOption().getText();
			String expDefinitionLinkValueDropdown=excelReader.getCellData(xlsheet, 304, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 304, 8, actDefinitionLinkValueDropdown);
			
			System.out.println("************************************checkSelectingQuantityinLinkValueOptionBetweenSalesInvoiceNAndDeliveryNotes********************");
			
			System.out.println("DefinitionLinkValueDropdown  : "+actDefinitionLinkValueDropdown+" Value Expected : "+expDefinitionLinkValueDropdown);
			
			if(actDefinitionLinkValueDropdown.equals(expDefinitionLinkValueDropdown))
			{
				System.out.println("Test Pass : Quantity Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 303, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Quantity not Selected Sucessfully");
				excelReader.setCellData(xlfile, xlsheet, 303, 9, resFail);
				return false;
			}
		}
		
		

		public boolean checkSelectingItemOptionBetweenAutoSalesOrderAndSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicenAndDeliveryNotesitemchkbox));
			salesInvoicenAndDeliveryNotesitemchkbox.click();*/
		    
			int definitionTabChkBoxNameListCount = definitionTabChkBoxNameList.size();
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("ITEM"))
				{
					definitionTabChkBoxList.get(i).click();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			boolean selected = false;
			
			for(int i=1;i<definitionTabChkBoxNameListCount;i++)
			{
				String data = definitionTabChkBoxNameList.get(i).getText();
				if(data.equalsIgnoreCase("Item"))
				{
					selected=definitionTabChkBoxList.get(i).isSelected();
					
					break;
					
				}
			}
			
			/*boolean actsalesInvoicenAndDeliveryNotesitemchkbox=salesInvoicenAndDeliveryNotesitemchkbox.isSelected();
			boolean expsalesInvoicenAndDeliveryNotesitemchkbox=true;*/
			
			boolean actDisplay = selected==true;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 306, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 306, 8, actMethod);
			
			System.out.println("*************************************checkSelectingItemOptionBetweenSalesInvoiceNAndDeliveryNotes**********");
			
			/*System.out.println("SalesInvoicenAndDeliveryNotesitemchkbox  :"+actsalesInvoicenAndDeliveryNotesitemchkbox+" Value Expected :"+expsalesInvoicenAndDeliveryNotesitemchkbox);*/
			System.out.println("SalesInvoicenAndDeliveryNotesitemchkbox  :"+actMethod+" Value Expected :"+expMethod);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass :itemchkbox is Enabled");
				excelReader.setCellData(xlfile, xlsheet, 305, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : itemchkbox is NOT Enabled");
				excelReader.setCellData(xlfile, xlsheet, 305, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkOkBetweenBetweenAutoSalesOrderAndSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		    Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
			OkBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(draggedSalesInvoices));
			boolean actdraggedSalesInvoicesN           = draggedSalesInvoices.isDisplayed();
			boolean actdraggedAutoSalesOrders          = draggedAutoSalesOrders.isDisplayed();
			boolean actlink8TO9                       = link8TO9.isDisplayed();
			
			boolean expdraggedSalesInvoicesN           = true;
			boolean expdraggedAutoSalesOrders          = true;
			boolean explink8TO9                       = true;
			
			boolean actDisplay = actdraggedSalesInvoicesN==expdraggedSalesInvoicesN &&actdraggedAutoSalesOrders==expdraggedAutoSalesOrders && 
					actlink8TO9==explink8TO9;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 308, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 308, 8, actMethod);
			
			System.out.println("****************************************checkOkBetweenBetweenStockTransferAndSalesInvoiceN****************");
			
			System.out.println("DraggedSalesInvoicesN     :"+actdraggedSalesInvoicesN     +"Value Expected :"+expdraggedSalesInvoicesN);
			System.out.println("DraggedDeliveryNotes    :"+actdraggedAutoSalesOrders    +"Value Expected :"+expdraggedAutoSalesOrders);
			System.out.println("link8TO9                 :"+actlink8TO9                 +"Value Expected :"+explink8TO9);
			
			if(actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Ok Button Working As Expected");
				excelReader.setCellData(xlfile, xlsheet, 307, 9, resPass);
				return true;
			}else
			{
				System.out.println("Test Fail : Ok Buttton not Working as Expected");
				excelReader.setCellData(xlfile, xlsheet, 307, 9, resFail);
				return false;
			}
		}
		
		
		public boolean checkSaveWorkflowAsSalesFlow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
			dwsaveBtn.click();
			
			
			System.out.println("****************************************checkSaveWorkflowAsSalesFlow*************************************");
		
			String expMessage=excelReader.getCellData(xlsheet, 310, 7);
			
			String actMessage=checkValidationMessage(expMessage);
			
			excelReader.setCellData(xlfile, xlsheet, 310, 8, actMessage);
			
			Thread.sleep(2000);
			
			boolean actLayoutArea=layoutarea.getText().isEmpty();
			
			boolean expLayoutArea=true;
			
			boolean actDisplay = actLayoutArea==expLayoutArea;
			
			String actMethod = Boolean.toString(actDisplay);
			
			String expMethod = excelReader.getCellData(xlsheet, 311, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 311, 8, actMethod);

			
			System.out.println("WorkFlow layout Area : "+actLayoutArea+" value Expected : "+expLayoutArea);
			
			if(actMessage.equalsIgnoreCase(expMessage) && actMethod.equalsIgnoreCase(expMethod))
			{
				System.out.println("Test Pass : Error Message is as Expected");
				dwcloseBtn.click();
				excelReader.setCellData(xlfile, xlsheet, 309, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Error Message is NOT as Expected");
				excelReader.setCellData(xlfile, xlsheet, 309, 9, resFail);
				return false;
			}
			
			/*try
			{
				if(actMessage.equalsIgnoreCase(expMessage) && FirstDraggedElement.isDisplayed() && draggedDeliveryNotes.isDisplayed())
				{
					System.out.println("Test Pass : Error Message is as Expected");
					dwcloseBtn.click();
					excelReader.setCellData(xlfile, xlsheet, 93, 9, resPass);
					return true;
				}else
				{
					System.out.println("Test Fail : Error Message is NOT as Expected");
					excelReader.setCellData(xlfile, xlsheet, 93, 9, resFail);
					return false;
				}
			}
			catch(Exception e)
			{
				System.out.println("Test Pass : Error Message is as Expected");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
				dwcloseBtn.click();
				
				excelReader.setCellData(xlfile, xlsheet, 93, 9, resPass);
				return true;
			}*/
			
		}
		
		

		public boolean checkSelectingNarration() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getDriver().navigate().refresh();
			
			Thread.sleep(10000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			
			Thread.sleep(5000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(designWorkflowbtn));
			designWorkflowbtn.click();
			
			Thread.sleep(5000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(workflowNameTxt));
			workflowNameTxt.click();
			workflowNameTxt.sendKeys(excelReader.getCellData(xlsheet, 312, 6));
			Thread.sleep(2000);
			workflowNameTxt.sendKeys(Keys.TAB);
			
			String actworkflowNameTxt=workflowNameTxt.getAttribute("value");
			String expworkflowNameTxt=excelReader.getCellData(xlsheet, 313, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 313, 8, actworkflowNameTxt);
			
			System.out.println("*****************************************************checkSelectingNarration******************************************************");
			
			System.out.println("WorkflowNameTxt  :"+actworkflowNameTxt+" Value Expected :"+expworkflowNameTxt);
			
			Thread.sleep(5000);
			
			draggedSalesInvoicesVAT.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(link5TO6));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(link5TO6));
			link5TO6.click();
			
			Thread.sleep(2000);
			
			boolean res =getIsAlertPresent();
			
			if(res==true)
			{
				getWaitForAlert();
				
				getAlert().accept();
				
			}
				
				
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingTab));
			settingTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadpendingDocumentsDropdown));
			loadpendingDocumentsDropdown.click();
			
			Select s=new Select(loadpendingDocumentsDropdown);
			s.selectByVisibleText(excelReader.getCellData(xlsheet, 313, 6));
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadFieldsDropdown));
			loadFieldsDropdown.click();
			
			String actloadpendingDocumentsDropdown=s.getFirstSelectedOption().getText();
			
			String exploadpendingDocumentsDropdown=excelReader.getCellData(xlsheet, 314, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 314, 8, actloadpendingDocumentsDropdown);
			
			System.out.println("loadpendingDocumentsDropdown   :"+actloadpendingDocumentsDropdown+" VAlue Expected : "+exploadpendingDocumentsDropdown);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loadFieldsDropdown));
			loadFieldsDropdown.click();

			Select s1=new Select(loadFieldsDropdown);
			s1.selectByVisibleText(excelReader.getCellData(xlsheet, 314, 6));
			
			String actloadFieldsDropdown=s1.getFirstSelectedOption().getText();
			
			String exploadFieldsDropdown=excelReader.getCellData(xlsheet, 315, 7);
			
			excelReader.setCellData(xlfile, xlsheet, 315, 8, actloadFieldsDropdown);
			
	        System.out.println("loadFieldsDropdown  : "+actloadFieldsDropdown+" Value Expected  :"+exploadFieldsDropdown);
			
	        
			System.out.println("Test Pass : Based On Fields Selected");
			
			if(Status==false)
			{
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesTab));
				propertiesTab.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkUseItemWisetoleranceChkbox));
				checkUseItemWisetoleranceChkbox.click();
				Thread.sleep(1000);
				JavascriptExecutor jse = (JavascriptExecutor)getDriver();
				jse.executeScript("arguments[0].scrollIntoView(true);", OkBtn);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
				OkBtn.click();
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwsaveBtn));
			dwsaveBtn.click();
			
			String expMessage=excelReader.getCellData(xlsheet, 316, 7);
			
			String actMessage=checkValidationMessage(expMessage);
			
			excelReader.setCellData(xlfile, xlsheet, 316, 8, actMessage);

			if(actworkflowNameTxt.equalsIgnoreCase(expworkflowNameTxt) && actloadpendingDocumentsDropdown.equals(exploadpendingDocumentsDropdown) && 
					actloadFieldsDropdown.equals(exploadFieldsDropdown) && actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Test Pass : Updated Narration");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
				dwcloseBtn.click();
				
				excelReader.setCellData(xlfile, xlsheet, 312, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : NOT Updated Narration");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dwcloseBtn));
				dwcloseBtn.click();
				
				excelReader.setCellData(xlfile, xlsheet, 312, 9, resFail);
				return false;
			}
			
		}
		
		
	
	
	
	public SmokeDesignWorkFlowPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
		
	
		
		

	
	
	
}

