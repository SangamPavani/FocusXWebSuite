package com.focus.testcases;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SmokePricebookPage;
import com.focus.Pages.SmokePricebookPage;
import com.focus.base.BaseEngine;


public class SmokePricebookTest extends BaseEngine
{static SmokePricebookPage spb;
		
    // BUYER PRICE BOOK PAGE
	
	@Test(priority=500267)
	public void checkSignToCheckPricebookMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  spb=new SmokePricebookPage(getDriver());	
		  Assert.assertEquals(spb.checkSignToCheckPricebookMastersPage(), true);
	}   
    
    
    
    @Test(priority=500268)
    public void checkClickOnBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkClickOnBuyerPriceBook(), true);
    }
    
    @Test(priority=500269)
    public void checkClickOnCustomizationSettingsOptionInBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkClickOnCustomizationSettingsOptionInBuyerPriceBook(), true);
    }
    
    @Test(priority=500270)
    public void checkCustomizeColumnsInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkCustomizeColumnsInGrid(), true);
    }
    
    @Test(priority=500271)
    public void checkSaveBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkSaveBuyerPriceBook(), true);
    }
    
    @Test(priority=500272)
    public void checkEditBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkEditBuyerPriceBook(), true);
    }
    
    @Test(priority=500273)
    public void checkUpdateBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkUpdateBuyerPriceBook(), true);
    }
    
    @Test(priority=500274)
    public void checkUpdatePricebookInEditPricebook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkUpdatePricebookInEditPricebook(), true);
    }
   
    @Test(priority=500275)
    public void checkClickOnYesOptionInDeleteSavedCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkClickOnYesOptionInDeleteSavedCopyAndPaste(), true);
    }
    
    @Test(priority=500276)
    public void checkSaveOptionBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkSaveOptionBuyerPriceBook(), true);
    }
   
    
  
    @Test(priority=500277)
    public void checkClickOnCloseButtonInBuyingRates() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkClickOnCloseButtonInBuyingRates(), true);
    }

    
    //SELLER PRICE BOOK PAGE

    @Test(priority=500278)
    public void checkClickOnSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkClickOnSellerPriceBook(), true);
    }
    
    @Test(priority=500279)
    public void checkClickOnCustomizationSettingsOptionInSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkClickOnCustomizationSettingsOptionInSellerPriceBook(), true);
    }
    
    @Test(priority=500280)
    public void checkSellerPriceBookCustomizeColumnsInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkSellerPriceBookCustomizeColumnsInGrid(), true);
    }
   
    @Test(priority=500281)
    public void checkSaveSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkSaveSellerPriceBook(), true);
    }
  
    @Test(priority=500282)
    public void checkEditSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkEditSellerPriceBook(), true);
    }
   
    @Test(priority=500283)
    public void checkUpdateSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkUpdateSellerPriceBook(), true);
    }
    
    @Test(priority=500284)
    public void checkUpdateSellerPricebookInEditPricebook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkUpdateSellerPricebookInEditPricebook(), true);
    }
   
    @Test(priority=500285)
    public void checkClickOnYesOptionInDeleteSavedCopyAndPasteInSellerPriceBookPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkClickOnYesOptionInDeleteSavedCopyAndPasteInSellerPriceBookPage(), true);
    }
   
    @Test(priority=500286)
    public void checkSaveOptionSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	  spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkSaveOptionSellerPriceBook(), true);
    }
    
    
    @Test(priority=500287)
    public void checkClickOnCloseButtonInSellingRates() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
 	   spb=new SmokePricebookPage(getDriver());	
 	  Assert.assertEquals(spb.checkClickOnCloseButtonInSellingRates(), true);
    }
	       
	
}
