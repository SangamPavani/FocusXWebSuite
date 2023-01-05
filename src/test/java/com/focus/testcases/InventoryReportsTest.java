package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.InventoryReportsPage;
import com.focus.base.BaseEngine;

public class InventoryReportsTest extends BaseEngine
{
	InventoryReportsPage IRP;
	
	 /*@Test(priority=100)
	 public void checkStockStatementReportInSERVER() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockStatementReportInSERVER(), true);
	 }
	 
	 @Test(priority=100)
	 public void checkStockMovementReportInSERVER() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockMovementReportInSERVER(), true);
	 }
	 */
	 @Test(priority=100)
	 public void checkStockLedgerReportInSERVER() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockLedgerReportInSERVER(), true);
	 }
	 
	 
	
	/*
	
	 @Test(priority=340)
	 public void checkLoginToInventoryReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkLoginToInventoryReports(), true);
	 }
	 
	
	 @Test(priority=341)
	 public void checkItemQueryReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkItemQueryReport(), true);
	 }
	 
	 
	 @Test(priority=342)
	 public void checkStockLedgerReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockLedgerReport(), true);
	 }
	 
	
	 
	 
	 
	 
	 
	 @Test(priority=345)
	 public void checkOpeningStockRegisterReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkOpeningStockRegisterReport(), true);
	 }
	 
	
	
	 
	 
	 
	 
	 @Test(priority=347)
	 public void checkStockStatementReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockStatementReport(), true);
	 } 
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=350)
	 public void checkStockMovementReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockMovementReports(), true);
	 } 
	 
	 
	 
	 
	
	 @Test(priority=353)
	 public void checkMultiLevelStockMovementReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkMultiLevelStockMovementReports(), true);
	 } 
		
	     
	 
	 
	 
	 
	
	 
	 @Test(priority=356)
	 public void checkVirtualStockAnalysisReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkVirtualStockAnalysisReports(), true);
	 } 
	 
	 
	 
	 
	
	 @Test(priority=359)
	 public void checkStockValuationReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockValuationReports(), true);
	 }
	 
	 
	 
	

	 
	 @Test(priority=362)
	 public void checkStockReportbyTagReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockReportbyTagReports(), true);
	 }
	 
	 
	 
	 
	 
	 
	 @Test(priority=364)
	 public void checkABCAnalysisReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkABCAnalysisReports(), true);
	 }
	 
	 
	 
	 
	 
	 
	 @Test(priority=367)
	 public void checkStockAnalysisByBatchReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockAnalysisByBatchReport(), true);
	 }
	 
	 
	 
	 
	 
	 @Test(priority=370)
	 public void checkStockAnalysisByRmaReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockAnalysisByRmaReports(), true);
	 }
	 
	 
	 
	 
	 
	 
	 @Test(priority=372)
	 public void checkStockDetailsByBinsReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockDetailsByBinsReports(), true);
	 }
	 
	 
	 
	
	 
	 
	 @Test(priority=374)
	 public void checkStockBalanaceByBinsReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockBalanaceByBinsReports(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=376)
	 public void checkStockBalancesByItemByBinsReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockBalancesByItemByBinsReports(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=378)
	 public void checkExpiredStockByBinsReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkExpiredStockByBinsReports(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=380)
	 public void checkStockBalanceByWarehouseReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockBalanceByWarehouseReports(), true);
	 }
	 
	 
	 
	

	 
	 @Test(priority=383)
	 public void checkStockAgeingAnalysisReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockAgeingAnalysisReports(), true);
	 }
	 
	 
	 
	 @Test(priority=386)
	 public void checkAgeingAnalysisByBatchReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkAgeingAnalysisByBatchReports(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=389)
	 public void checkAgeingAnalysisByRMAReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkAgeingAnalysisByRMAReport(), true);
	 }
	 
	 
	 
	 
	 
	 
	 @Test(priority=392)
	 public void checkAgeingStockByBinsReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkAgeingStockByBinsReports(), true);
	 }
	 
	 
	
	 
	 @Test(priority=395)
	 public void checkAgeingByItemByBinsReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkAgeingByItemByBinsReports(), true);
	 }
	 
	 
	 
	 
	 
	
	 
	 @Test(priority=398)
	 public void checkReorderReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkReorderReports(), true);
	 }
	 
	 
	 
	
	 
	 
	 @Test(priority=400)
	 public void checkFastMovingItemsReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkFastMovingItemsReport(), true);
	 }
	 
	 
	 
	 
	 
	 
	 @Test(priority=402)
	 public void checkSlowMovingItemsReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkSlowMovingItemsReport(), true);
	 }
	 
	 
	
	 
	 
	 
	 @Test(priority=404)
	 public void checkPeakAndLowBalancesReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkPeakAndLowBalancesReport(), true);
	 }
	 
	 

	 
	 @Test(priority=406)
	 public void checkBestSellingItemReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkBestSellingItemReport(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=409)
	 public void checkStockTransferRegisterReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockTransferRegisterReport(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=412)
	 public void checkStockReservationRegisterReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkStockReservationRegisterReport(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=414)
	 public void checkTransactionTypeWiseStockReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkTransactionTypeWiseStockReport(), true);
	 }
	 
	
	 
	 
	 
	 
	 
	 
	 @Test(priority=416)
	 public void checkActualConsumptionReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 IRP=new InventoryReportsPage(getDriver());
		 Assert.assertEquals(IRP.checkActualConsumptionReport(), true);
	 }
	 
	
	*/
		
	

}
