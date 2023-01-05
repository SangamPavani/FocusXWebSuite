package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.VouchersExcessAndShortagesPage;
import com.focus.Pages.VouchersInwardPage;
import com.focus.base.BaseEngine;

public class VouchersExcessAndShortagesTest extends BaseEngine
{
	
	VouchersExcessAndShortagesPage vsrp;

    // Stock Transfer Starts From Here
	
    @Test(priority=629)
	public void checkLoginToCheckExcessAndShortages() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	   vsrp=new VouchersExcessAndShortagesPage(getDriver());
		Assert.assertEquals(vsrp.checkLoginToCheckExcessAndShortages(), true);
	   
	}

    
   
	// Excess In Stock Starts From Here
    

	@Test(priority=701)
   	public void checkExcessInStocksVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkExcessInStocksVoucher(), true);
   	}
	
	@Test(priority=702)
   	public void checkExcessInStocksHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkExcessInStocksHomePage(), true);
   	}
	
	@Test(priority=703)
   	public void checkExcessInStocksEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkExcessInStocksEntryPage(), true);
   	}
	
	
	@Test(priority=704)
   	public void checkExcessInStocksEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkExcessInStocksEntryPageHeaderFields(), true);
   	}
	
	
	@Test(priority=705)
   	public void checkExcessInStocksEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkExcessInStocksEntryPageBodyFields(), true);
   	}
	
	@Test(priority=706)
   	public void checkExcessInStocksEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkExcessInStocksEntryPageFooterFields(), true);
   	}
	
	
	@Test(priority=707)
   	public void checkSavingVoucherWithoutInputDATA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingVoucherWithoutInputDATA(), true);
   	}
	
	
	@Test(priority=708)
   	public void checkExcessStockLessthanAccountingDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkExcessStockLessthanAccountingDate(), true);
   	}
	

	@Test(priority=709)
   	public void checkSavingexcessInStocksVoucherWithALLItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingexcessInStocksVoucherWithALLItems(), true);
   	}
	
	
	@Test(priority=710)
   	public void checkSavedExcessInStocksVoucherPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavedExcessInStocksVoucherPrevious(), true);
   	}
	
	@Test(priority=711)
   	public void checkEntryPageSuspendOptionInExcessInStocksVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkEntryPageSuspendOptionInExcessInStocksVoucher(), true);
   	}
	
	@Test(priority=712)
   	public void checkCopyToPasteClipBoardOptionInExcessInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkCopyToPasteClipBoardOptionInExcessInStocks(), true);
   	}
	
	@Test(priority=713)
   	public void checkDeleteOptionINExcessStockEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkDeleteOptionINExcessStockEntryPage(), true);
   	}
	
	@Test(priority=714) // Catch Block Execution
   	public void checkCopyDocumentOptionAndSavingInExcessInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkCopyDocumentOptionAndSavingInExcessInStocks(), true);
   	}
	
	
	// Shortage In Stock Starts From Here
	
	
	@Test(priority=720)
   	public void checkShortagesInStocksVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkShortagesInStocksVoucher(), true);
   	}
	
	@Test(priority=721)
   	public void checkShortagesInStocksHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkShortagesInStocksHomePage(), true);
   	}
	
	@Test(priority=722)
   	public void checkShortagesInStocksEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkShortagesInStocksEntryPage(), true);
   	}
	
	@Test(priority=723)
   	public void checkShortagesInStocksEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkShortagesInStocksEntryPageHeaderFields(), true);
   	}
	
	@Test(priority=724)
   	public void checkShortagesInStocksEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkShortagesInStocksEntryPageBodyFields(), true);
   	}
	
	@Test(priority=725)
   	public void checkShortagesInStocksEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkShortagesInStocksEntryPageFooterFields(), true);
   	}
	
	@Test(priority=726)
   	public void CheckLinksDisplayInShortageInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.CheckLinksDisplayInShortageInStocks(), true);
   	}
	
	
	@Test(priority=727)
   	public void checkEntryPageSuspendAndDeleteOptionOnSavingAVoucherWithUsingLinksInShortagesInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkEntryPageSuspendAndDeleteOptionOnSavingAVoucherWithUsingLinksInShortagesInStocks(), true);
   	}
	
	@Test(priority=728)
   	public void checkSavingShortagesInStocksVoucherWithAllItemsWithLinksLineWise() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingShortagesInStocksVoucherWithAllItemsWithLinksLineWise(), true);
   	}
	
	@Test(priority=729)
   	public void checkSavedDocumentinShortageInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavedDocumentinShortageInStocks(), true);
   	}
	
	
	@Test(priority=730)
   	public void checkCopyDocumentOptionInShortagesInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkCopyDocumentOptionInShortagesInStocks(), true);
   	}
	
	
	@Test(priority=731)
   	public void checkPendingLinksInShortageInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkPendingLinksInShortageInStocks(), true);
   	}
	
	@Test(priority=732)
   	public void checkSuspendedOptionFromHomePageInExcessInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new VouchersExcessAndShortagesPage(getDriver());
   		Assert.assertEquals(vsrp.checkSuspendedOptionFromHomePageInExcessInStocks(), true);
   	}
	
	

	
	
	
	
	
}
