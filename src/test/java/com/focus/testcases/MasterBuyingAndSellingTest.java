package com.focus.testcases;


import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.HPHomeMenuPage;
import com.focus.Pages.MasterAccountsPage;
import com.focus.Pages.MasterBinsPage;
import com.focus.Pages.MasterBuyingAndSellingPage;
import com.focus.Pages.MasterDepartmentPage;
import com.focus.Pages.MasterUnitPage;
import com.focus.Pages.MasterWarehousePage;
import com.focus.Pages.PreferencesPage;
import com.focus.base.BaseEngine;


public class MasterBuyingAndSellingTest extends BaseEngine
{
    static MasterBuyingAndSellingPage mbsp;
		
   
	   @Test(priority=784)
	   public void verifyBuyerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		 mbsp=new MasterBuyingAndSellingPage(getDriver());
		 Assert.assertEquals(mbsp.checkBuyerPriceBook(), true);
	   }
	/*	
		
       @Test(priority=785)
	   public void verifyCustomizationSettingsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		 mbsp=new MasterBuyingAndSellingPage(getDriver());
	     Assert.assertEquals(mbsp.checkCustomizationSettingsOption(), true);
	   }
	   
	   
	   @Test(priority=786)
	   public void verifyCustomizeColumnsInGrid() throws InterruptedException, EncryptedDocumentException,   InvalidFormatException, IOException
	   {
		 mbsp=new MasterBuyingAndSellingPage(getDriver());
	     Assert.assertEquals(mbsp.checkCustomizeColumnsInGrid(), true);
	   }
	   
	   @Test(priority=787)
	   public void verifyCustomizeColumnsAfterInputofBuyerPriceName() throws InterruptedException, EncryptedDocumentException,   InvalidFormatException, IOException
	   {
		 mbsp=new MasterBuyingAndSellingPage(getDriver());
	     Assert.assertEquals(mbsp.checkCustomizeColumnsAfterInputofBuyerPriceName(), true);
	   }
	   
	  
	   @Test(priority=788)
	   public void verifyMandatoryFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
	      mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkMandatoryFields(), true);
	   }
	   
	 
	   @Test(priority=789)
	   public void verifyProductNameAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkProductNameAsMandatory(), true);
	   }
	   
	
	    
	   @Test(priority=790)
	   public void VerifyRateAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkRateAsMandatory(), true);
	   }
	

	
	   @Test(priority=791)
	   public void verifySaveBuyerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSaveBuyerPriceBook(), true);
	   }
	   
	   
	   @Test(priority=792)
	   public void verifyEditBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException 
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkEditBuyerPriceBook(), true);
	   }
	   
	   
	   @Test(priority=793)
	   public void verifySavedBuyerRatesInformation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSavedBuyerRatesInformation(), true);
	   }
	   
	   @Test(priority=794)
	   public void verifyUpdateBuyerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		 mbsp=new MasterBuyingAndSellingPage(getDriver());
		 Assert.assertEquals(mbsp.checkUpdateBuyerPriceBook(), true);
	   }
	   
	   @Test(priority=795)
	   public void verifyCloseInBuyerPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkCloseInBuyerPriceBook(), true);
	   }
	   
	    
	   
	  @Test(priority=796)
	   public void checkClearOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkClearOption(), true);
	   }
	   
	  
	   @Test(priority=797)
	   public void checkCopyandPaste() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkCopyandPaste(), true);
	   }
	   
	   
	 
	   @Test(priority=798)
	   public void checkSaveOptionAfterPerformingPasteOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSaveOptionAfterPerformingPasteOption(), true);
	   }
	   

	
	   @Test(priority=799)
	   public void checkSaveOptionAfterPerformingPasteOptionWithPricebookName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSaveOptionAfterPerformingPasteOptionWithPricebookName(), true);
	   }
	   

	   @Test(priority=800)
	   public void checkPriceBookThroughCopyandPaste() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
			mbsp=new MasterBuyingAndSellingPage(getDriver());
			Assert.assertEquals(mbsp.checkPriceBookThroughCopyandPaste(), true);
	   }
	   
	   

	   @Test(priority=801)
	   public void clickCopyAndPasteInformatioinOnLoadButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			mbsp=new MasterBuyingAndSellingPage(getDriver());
	        Assert.assertEquals(mbsp.clickCopyAndPasteInformatioinOnLoadButton(), true);
		}
	   

	   @Test(priority=802)
	   public void checkDeleteOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		   mbsp=new MasterBuyingAndSellingPage(getDriver());
		   Assert.assertEquals(mbsp.checkDeleteOption(), true);
	 
		}   

	   @Test(priority=803)
	   public void checkNoOptionOnClickOnDelete() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		   mbsp=new MasterBuyingAndSellingPage(getDriver());
	       Assert.assertEquals(mbsp.checkNoOptionOnClickOnDelete(), true);
		}
	 
	   @Test(priority=804)
	   public void checkYesOptionOnClickDelete() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkYesOptionOnClickDelete(), true);
		}
	   
	   @Test(priority=805)
	   public void checkExportExcelWithoutSelectingPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkExportExcelWithoutSelectingPriceBook(), true);
	 
		}

	   
	   // Commenting below As Auto it not present..Uncomment it 
	   // after this seller price book will start

	 
	   @Test(priority=806)
	   public void checkExportExcel() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
	      Assert.assertEquals(mbsp.checkExportExcel(), true);
		}
	   
	
	   @Test(priority=807) //
	   public void checkFileExportedIntoFile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		 mbsp=new MasterBuyingAndSellingPage(getDriver());
		 Assert.assertEquals(mbsp.checkFileExportedIntoFile(), true);
		}
	  
	  

	  
	   @Test(priority=808)
	   public void checkImportFromExcelOptionWithoutPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkImportFromExcelOptionWithoutPriceBook(), true);
	   }
	   
	   
	   @Test(priority=809)
	   public void checkImportFromExcelOptionWithPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkImportFromExcelOptionWithPriceBook(), true);
	   }
	   
	   
	   @Test(priority=810)
	   public void checkImportButtonWithoutPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkImportButtonWithoutPriceBook(), true);
	   }
	   
	   
	  // @Test(priority=811)
	   public void verifySelectTheBrowseFile() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSelectTheBrowseFile(), true);
	   }
	   
	   
	   @Test(priority=812)
	   public void verifySheetPopUpToSelect() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSheetPopUpToSelect(), true);
	   }
	 
	   
	   @Test(priority=813)
	   public void verifyOkButtonWithoutSelectingSheetInSheetPopUpToSelect() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkOkButtonWithoutSelectingSheetInSheetPopUpToSelect(), true);
	   }
	   

	   @Test(priority=814)
	   public void verifyOkButtonWithSelectingSheetInSheetPopUpToSelect() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkOkButtonWithSelectingSheetInSheetPopUpToSelect(), true);
	   }
	   
	   
	   @Test(priority=815)
	   public void verifyMandatoryFieldsWithoutSelectExternalFields() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkMandatoryFieldsWithoutSelectExternalFields(), true);
	   }
	   
	   @Test(priority=816)
	   public void verifyCountOfExtraFields() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkCountOfExtraFields(), true);
	   }
	   
	   @Test(priority=817)
	   public void verifyImportDataOption() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkImportDataOption(), true);
	   }
	   
    
       @Test(priority=818)
	   public void verifyImportPriceBook() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkImportPriceBook(), true);
	   }
	   
	   
	   
	   @Test(priority=819)//
	   public void veriyImportPriceBookInformation() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkImportPriceBookInformation(), true);
	   }
	   
	   */
	   //seller price book
	   @Test(priority=820)
	   public void verifySellerPriceBook() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSellerPriceBook(), true);
	   }
	   
	   
	   @Test(priority=821)
	   public void verifySellerPricebookSettingsOption() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSellerPricebookSettingsOption(), true);
	   }
	   
	   
	   @Test(priority=822)
	   public void verifyCustomizeColumnsInSellerPricebook() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkCustomizeColumnsInSellerPricebook(), true);
	   }
	   
	   
	   
	   @Test(priority=823)
	   public void verifyCustomizeColumnsAfterInputofSellerPriceName() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkCustomizeColumnsAfterInputofSellerPriceName(), true);
	   }
	   
	   
	   
	   @Test(priority=824)
	   public void verifyMandatoryFieldsInSellerPriceBook() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkMandatoryFieldsInSellerPriceBook(), true);
	   }
	   
	   
	   @Test(priority=825)
	   public void verifyProductMandatory() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkProductMandatory(), true);
	   }
	   
	   @Test(priority=826)
	   public void verifySellerPriceBookRate() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSellerPriceBookRate(), true);
	   }
	   
	   
	   @Test(priority=827)
	   public void verifySaveSellerPriceBook() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSaveSellerPriceBook(), true);
	   }
	   
	   @Test(priority=828)
	   public void verifyEditSellerPriceBook() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkEditSellerPriceBook(), true);
	   }
	   
	   
	   @Test(priority=829)
	   public void verifySavedSellerRatesInformation() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSavedSellerRatesInformation(), true);
	   }
	   
	   
	   @Test(priority=830)
	   public void verifyUpdateSellerPriceBook() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkUpdateSellerPriceBook(), true);
	   }
	   
	   
	   @Test(priority=831)
	   public void verifyCloseInSellerPriceBook() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkCloseInSellerPriceBook(), true);
	   }
	   
	   
	   
	   
	   
	   @Test(priority=832)
	   public void verifyCopyClearPasteDeleteOption() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkCopyClearPasteDeleteOption(), true);
	   }
	   
	   
	   
	   @Test(priority=833)
	   public void verifySellerPricebookNoOptionOnClickOnDelete() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSellerPricebookNoOptionOnClickOnDelete(), true);
	   }
	   
	   
	   @Test(priority=834)
	   public void verifySellerPricebookYesOptionOnClickDelete() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSellerPricebookYesOptionOnClickDelete(), true);
	   }
	   
	   
	   @Test(priority=835)
	   public void checkSellerPricebookWithInactive() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkSellerPricebookWithInactive(), true);
	   }
	   
	   

	   @Test(priority=836)
	   public void verifyCloseOptionAfterSavingInactiveInSellerPriceBook() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkCloseOptionAfterSavingInactiveInSellerPriceBook(), true);
	   }
	   
	   
	   
	////////////////////////////////////////////////////////////////////////////////////////////////   
	   
	   /*

	   @Test(priority=797)
	   public void VerifyCreationofPriceBookWithProductTypeisBin() throws InterruptedException
		{
			 mbsp=new MasterBuyingAndSellingPage(getDriver());
		
		     Assert.assertEquals(mbsp.checkCreationofPriceBookWithProductTypeisBin(), true);
	 
		}
	 
	   
	   @Test(priority=798)
	   public void VerifyCopyandPaste() throws InterruptedException
		{
			 mbsp=new MasterBuyingAndSellingPage(getDriver());
		
			 Assert.assertEquals(mbsp.checkCopyandPaste(), true);
	 
		}
	   
	   
	   
	   
	   @Test(priority=799)
	   public void verifySaveOptionAfterPerformingPasteOption() throws InterruptedException
		{
			 mbsp=new MasterBuyingAndSellingPage(getDriver());
		
			Assert.assertEquals(mbsp.checkSaveOptionAfterPerformingPasteOption(), true);
	 
		}
	   
	   
	   @Test(priority=800)
	   public void VerifyPriceBookThroughCopyandPaste() throws InterruptedException
		{
			 mbsp=new MasterBuyingAndSellingPage(getDriver());
		
			Assert.assertEquals(mbsp.checkPriceBookThroughCopyandPaste(), true);
	 
		}
	   
	  
	  
	   
	   @Test(priority=801)
	   public void ClickonLoadButton() throws InterruptedException
		{
			 mbsp=new MasterBuyingAndSellingPage(getDriver());
		
			Assert.assertEquals(mbsp.ClickonLoadButton(), true);
	 
		}
	   
	   
	   
	   
	   @Test(priority=802)
	   public void VerifyDelete() throws InterruptedException
		{
			 mbsp=new MasterBuyingAndSellingPage(getDriver());
		
			 Assert.assertEquals(mbsp.checkDelete(), true);
	  
		}
	   
	   
	   
	   
	   
	   
	   
	   @Test(priority=803)
	   public void SelecttheCreatedpriceBookfromDropdownandClickonDeletebutton() throws InterruptedException
		{
			 mbsp=new MasterBuyingAndSellingPage(getDriver());
			 
			 Assert.assertEquals(mbsp.SelecttheCreatedpriceBookfromDropdownandClickonDeletebutton(), true);
	 
		}
	   
	   
	   
	   

	   @Test(priority=804)
	   public void checkwithNoButtoninDeleteoption() throws InterruptedException
		{
			 mbsp=new MasterBuyingAndSellingPage(getDriver());
			 
			 Assert.assertEquals(mbsp.checkwithNoButtoninDeleteoption(), true);
	 
		}
	   
	   
	   
	   

	   @Test(priority=805)
	   public void checkwithYesButtoninDeleteoption() throws InterruptedException
		{
			 mbsp=new MasterBuyingAndSellingPage(getDriver());
		
			 Assert.assertEquals(mbsp.checkwithYesButtoninDeleteoption(), true);
	 
		}
	   
	   
	   
		   @Test(priority=806)
		   public void VerifyExportExcel() throws InterruptedException
			{
				 mbsp=new MasterBuyingAndSellingPage(getDriver());
			
				Assert.assertEquals(mbsp.checkExportExcel(), true);
		 
			}
	   
		   
	   
		
		
		   @Test(priority=807)
		   public void VerifyAdvanceImportOption() throws InterruptedException
			{
				 mbsp=new MasterBuyingAndSellingPage(getDriver());
				 
				Assert.assertEquals(mbsp.VerifyAdvanceImportOption(), true);
		 
			}
		
		
		
		
		
		
		
		   @Test(priority=808)
		   public void Verifyimportoptiobyselectingthefile() throws InterruptedException, IOException
			{
				 mbsp=new MasterBuyingAndSellingPage(getDriver());
				 
				 
				 
				 mbsp.Verifyimportoptiobyselectingthefile();
				 
				//Assert.assertEquals(mbsp.Verifyimportoptiobyselectingthefile(), true);
		 
			}
		
		
		
		
		
		
		
		///ExcelAnd Xml Import And Export Test cases is incomplete in buyer screen 
		
		
		
		
		
		
		
		
		
		
	   
		
		
		////////////////////////////////////////////////////////Seller price book///////////////////////////////////
		
		
		
		
		  @Test(priority=809)
		   public void verifySellerPriceBook() throws InterruptedException
			{
				 mbsp=new MasterBuyingAndSellingPage(getDriver());
				 
				 Assert.assertEquals(mbsp.checkSellerPriceBook(), true);
		 
			}

		
		

		  @Test(priority=810)
		   public void verifyCustomizeDisplayInSelletPriceBookScreen() throws InterruptedException
			{
				 mbsp=new MasterBuyingAndSellingPage(getDriver());
				 
				 Assert.assertEquals(mbsp.checkCustomizeDisplayInSelletPriceBookScreen(), true);
		 
			}

		

		@Test(priority=811)
		   public void verifyMandatoryFieldsInSelletPriceBookScreen() throws InterruptedException
			{
				 mbsp=new MasterBuyingAndSellingPage(getDriver());
				 
				 Assert.assertEquals(mbsp.checkMandatoryFieldsInSelletPriceBookScreen(), true);
		 
			}
		
	   
		    @Test(priority=812)
		    public void CheckInputNameasTestBuyingPriceHydWhandclickonSavebuttonOFSellerScreen() throws InterruptedException
			{
				 mbsp=new MasterBuyingAndSellingPage(getDriver());
				 
			 	 Assert.assertEquals(mbsp.CheckInputNameasTestBuyingPriceHydWhandclickonSavebuttonOFSellerScreen(), true);
		 
			}
	   
		    
		    
		    
		    
		       @Test(priority=813)
			   public void VerifybyinputdataintowarehouseAndSelectingProductsinCumboboxinSellerPriceScreen() throws InterruptedException
				{
					 mbsp=new MasterBuyingAndSellingPage(getDriver());
				
					 Assert.assertEquals(mbsp.checkbyinputdataintowarehouseAndSelectingProductsinCumboboxinSellerPriceScrenn(), true);
			 
				}  
		    
		       
		       
		       
		       

		       @Test(priority=814)
			   public void verifyEditSellerPriceBook() throws InterruptedException
				{
					 mbsp=new MasterBuyingAndSellingPage(getDriver());
				
					 Assert.assertEquals(mbsp.checkEditSellerPriceBook(), true);
			 
				}  
		       
		       
		    
		       @Test(priority=815)
			   public void SelectthePriceBookNameInSellerPriceBook() throws InterruptedException
				{
					 mbsp=new MasterBuyingAndSellingPage(getDriver());
					 
					 Assert.assertEquals(mbsp.SelectthePriceBookNameInSellerPriceBook(), true);
			 
				}  
		    
		    
		    
		    
		       
		       @Test(priority=816)
			   public void verifyUpdateSellerPriceBook() throws InterruptedException
				{
					 mbsp=new MasterBuyingAndSellingPage(getDriver());
				
					 Assert.assertEquals(mbsp.checkUpdateSellerPriceBook(), true);
			 
				}  
		    
		    
		       
		       @Test(priority=817)
			   public void verifyCloseinSellerPriceBook() throws InterruptedException
				{
					 mbsp=new MasterBuyingAndSellingPage(getDriver());
				
					 Assert.assertEquals(mbsp.CheckCloseinSellerPriceBook(), true);
			 
				}  
		    
		    
		    
		       @Test(priority=818)
			   public void VerifyUpdatedProductINSellerPriceBook() throws InterruptedException
				{
					 mbsp=new MasterBuyingAndSellingPage(getDriver());
					 
					 Assert.assertEquals(mbsp.checkUpdatedProductINSellerPriceBook(), true);
			 
				}  
		    
		    
		    
		    
		    
		    
       @Test(priority=819)
	   public void verifytheWarehouseandProductNamewhileupdatingproductINSellerPriceBook() throws InterruptedException
	   {
		   mbsp=new MasterBuyingAndSellingPage(getDriver());
		   Assert.assertEquals(mbsp.checktheWarehouseandProductNamewhileupdatingproductINSellerPriceBook(), true);
	   }  
		    

       @Test(priority=820)
	   public void verifybyaddingtheextraItemAndRateINSellerPriceBook() throws InterruptedException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkbyaddingtheextraItemAndRateINSellerPriceBook(), true);
	   }  
    
		   
       @Test(priority=821)
	   public void verifyClearOptionINSellerPriceBook() throws InterruptedException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkClearOptionINSellerPriceBook(), true);
	   }  
		        

       @Test(priority=822)
	   public void verifyCreationofPriceBookWithProductTypeisBininSellerPriceBook() throws InterruptedException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkCreationofPriceBookWithProductTypeisBininSellerPriceBook(), true);
	   }  
		    

       @Test(priority=823)
	   public void verifyCopyandPasteinSellerPriceBook() throws InterruptedException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkCopyandPasteinSellerPriceBook(), true);
	 
	   }


       @Test(priority=824)
	   public void verifySaveOptionAfterPerformingPasteOptioninSellerPriceBook() throws InterruptedException
	   {
		   mbsp=new MasterBuyingAndSellingPage(getDriver());
		   Assert.assertEquals(mbsp.checkSaveOptionAfterPerformingPasteOptioninSellerPriceBook(), true);
	   }
       

       @Test(priority=825)
	   public void verifyPriceBookThroughCopyandPasteinSellerPriceBook() throws InterruptedException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkPriceBookThroughCopyandPasteinSellerPriceBook(), true);
	   }
          

       @Test(priority=826)
	   public void ClickonLoadButtoninSellerPriceBook() throws InterruptedException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.ClickonLoadButtoninSellerPriceBook(), true);
	   }
		       

       @Test(priority=827)
	   public void verifyDeleteinSellerPriceBook() throws InterruptedException
	   {
		 mbsp=new MasterBuyingAndSellingPage(getDriver());
	     Assert.assertEquals(mbsp.checkDeleteinSellerPriceBook(), true);
	   }
		           

       @Test(priority=828)
	   public void SelecttheCreatedpriceBookfromDropdownandClickonDeletebuttonofSellerPriceBook() throws InterruptedException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.SelecttheCreatedpriceBookfromDropdownandClickonDeletebuttonofSellerPriceBook(), true);
	   }
		       

       @Test(priority=829)
	   public void verifywithNoButtoninDeleteoptionSellerPriceBook() throws InterruptedException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkwithNoButtoninDeleteoptionSellerPriceBook(), true);
	   }
		    


       @Test(priority=830)
	   public void verifywithYesButtoninDeleteoptioninSellerPriceBook() throws InterruptedException
	   {
		  mbsp=new MasterBuyingAndSellingPage(getDriver());
		  Assert.assertEquals(mbsp.checkwithYesButtoninDeleteoptioninSellerPriceBook(), true);
	   }
		       
		       

       @Test(priority=831)
	   public void verifyExportExcelinSellerPriceBook() throws InterruptedException
	   {
		 mbsp=new MasterBuyingAndSellingPage(getDriver());
		 Assert.assertEquals(mbsp.checkExportExcelinSellerPriceBook(), true);
	   }
		       
		       
		       */
		       
		       
		       
		 ///ExcelAnd Xml Import And Export Test cases is incomplete in seller screen
		       
	
}
