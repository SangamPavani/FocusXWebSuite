package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.HPPointOfSaleMenuPage;
import com.focus.base.BaseEngine;

public class HPPointOfSaleMenuTest extends BaseEngine
{
	HPPointOfSaleMenuPage HPPOSMP;
	
	 @Test(priority=123)
	 public void verifyPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkPointOfSaleMenu(), true);
		
	 }
	 
	 @Test(priority=124)
	 public void verifyMainScreenMenuPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkMainScreenMenuInPointOfSaleMenu(), true);
		
	 }
	 
	 @Test(priority=125)
	 public void verifyPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkPOSReportsMenuInPointOfSaleMenu(), true);
		
	 }
	 
	 
	 
	 @Test(priority=126)
	 public void verifyRetailSalesReportMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkRetailSalesReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 @Test(priority=127)
	 public void verifySummarySalesReportMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkSummarySalesReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 @Test(priority=128)
	 public void verifyPreOrderReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkPreOrderReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 @Test(priority=129)
	 public void verifyPreOrderPaymentReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkPreOrderPaymentReportsMenuInPosReReportsMenu(), true);
		
	 }

	 @Test(priority=130)
	 public void verifyMemberReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkMemberReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 @Test(priority=131)
	 public void verifyMemberPointsReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkMemberPointsReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 
	 @Test(priority=132)
	 public void verifyItemReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkItemReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 @Test(priority=133)
	 public void verifyCashReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkCashReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 @Test(priority=134)
	 public void verifyStockReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkStockReportsMenuInPosReReportsMenu(), true);
		
	 }


	 @Test(priority=135)
	 public void verifyPerodicSalesReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkPreodicSalesReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 
	 @Test(priority=136)
	 public void verifyLastYearComparisonReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkLastYearCompraisonReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 
	 @Test(priority=137)
	 public void verifyMiscellenousReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkMiscellaneousReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 
	 @Test(priority=138)
	 public void verifyRestaurantReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkResturantReportsMenuInPosReReportsMenu(), true);
		
	 }
	 
	 
	 @Test(priority=139)
	 public void verifyUtilitiesMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPPOSMP=new HPPointOfSaleMenuPage(getDriver());
		 Assert.assertEquals(HPPointOfSaleMenuPage.checkUtilitiesMenuInPointOfSaleMenu(), true);
		
	 }
	 
	 
}
