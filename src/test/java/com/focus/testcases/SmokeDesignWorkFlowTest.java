package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SmokeDesignWorkFlowPage;

import com.focus.base.BaseEngine;

public class SmokeDesignWorkFlowTest extends BaseEngine
	{

	 
		static SmokeDesignWorkFlowPage dwfp ;
		
		
		  
		@Test(priority=837)
		public  static void verifyOpenDesignWorkFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOpenDesignWorkFlow(),true);
			  
		}
	
   
		/*@Test(priority=838)
		public  static void verifyOptionsInDesignWorkFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOptionsInDesignWorkFlow(),true);
			  
		}

		
		@Test(priority=839)
		public  static void verifySaveButtonWithoutWorkFlowName() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSaveButtonWithoutWorkFlowName(),true);
			  
		}
		
		@Test(priority=840)
		public  static void verifyInputWorkFlowName() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkInputWorkFlowName(),true);
			  
		}  
		
		
		
		@Test(priority=841)
		public  static void checkSelectAndDragVoucherPurchaseOrder() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectAndDragVoucherPurchaseOrder(),true);
			  
		} 
		  
		
		@Test(priority=842)
		public  static void verifySaveButtonWithSingleVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSaveButtonWithSingleVoucher(),true);
			  
		} 
		
		
		@Test(priority=843)
		public  static void verifyClearButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkClearButton(),true);
			  
		} 
		
		
		
		@Test(priority=844)
		public  static void verifySelectBaseAndLinkVouchersToDrag() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectBaseAndLinkVouchersToDrag(),true);
			  
		} 
		
		@Test(priority=845)
		public  static void verifySavingVouchersWithoutHavingLink() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSavingVouchersWithoutHavingLink(),true);
			  
		} 
		
		
		@Test(priority=846)
		public  static void verifyOptionsInLinkBetweenBaseAndLinkVouchers() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOptionsInLinkBetweenBaseAndLinkVouchers(),true);
			  
		} 
		
		
		@Test(priority=847)
		public  static void verifyLinkOptionInBetweenAutoSalesOrderAndAutoSalesInvoice() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkOptionInBetweenAutoSalesOrderAndAutoSalesInvoice(),true);
			  
		} 
		
		
		@Test(priority=848)
		public  static void verifyLinkNodeLineFromBaseVoucherToLinkVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkNodeLineFromBaseVoucherToLinkVoucher(),true);
			  
		} 
		
		@Test(priority=849)
		public  static void verifySavingVouchersWithHavingLink() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSavingVouchersWithHavingLink(),true);
			  
		} 
		
		
		@Test(priority=850)
		public  static void verifyWorkFlowOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkWorkFlowOptions(),true);
			  
		} 
		
		
		@Test(priority=851)
		public  static void verifyLinkValueOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkValueOptions(),true);
			  
		} 
		
		
		@Test(priority=852)
		public  static void verifySettingTabOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSettingTabOptions(),true);
			  
		} 
		
		
		@Test(priority=853)
		public  static void verifyPropertiesTabOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkPropertiesTabOptions(),true);
			  
		} 
		
		
		@Test(priority=854)
		public  static void verifyLinkValue() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkValue(),true);
			  
		} 
		
		@Test(priority=855)
		public  static void verifyOkButtonWithoutSelectionOfMandatoryFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOkButtonWithoutSelectionOfMandatoryFields(),true);
			  
		} 
		
		@Test(priority=856)
		public  static void verifyOkButtonWithSelectionOfMandatroryFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOkButtonWithSelectionOfMandatroryFields(),true);
			  
		} 
		
		@Test(priority=857)
		public  static void verifySaveButtonInDesignWorkflowScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSaveButtonInDesignWorkflowScreen(),true);
			  
		} 
		
		
		@Test(priority=858)
		public  static void verifySaveWorkFlowNameDisplay() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSaveWorkFlowNameDisplay(),true);
			  
		} 
		
		@Test(priority=859)
		public  static void checkUpdatingSavedTestFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkUpdatingSavedTestFlow(),true);
			  
		} 
		
		@Test(priority=860)
		public  static void checkUpdatedTestFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkUpdatedTestFlow(),true);
			  
		} 
		
		
		
		@Test(priority=861)
		public  static void  checkDeletingTestFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkDeletingTestFlow(),true);
			  
		} 
		*/

		//Purchase Flow Starts From Here
		
		
		@Test(priority=928)
		public  static void checkInputingWorkflowNameAsPurchasesFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkInputingWorkflowNameAsPurchasesFlow(),true);
			  
		}
		
		@Test(priority=929)
		public  static void checkSelectingMaterialRequisitionfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingMaterialRequisitionfromVoucherlist(),true);
			  
		}
		
		
		@Test(priority=930)
		public  static void checkSelectingPurcahseOrdersfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingPurcahseOrdersfromVoucherlist(),true);
			  
		}
		
		@Test(priority=931)
		public  static void checkMovingPurchaseOrderToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMovingPurchaseOrderToPosition(),true);
			  
		}
		
		
		
		@Test(priority=931)
		public  static void checkSelectingPurchaseVoucherVatfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingPurchaseVoucherVatfromVoucherlist(),true);
			  
		}
		

		
		
		
		@Test(priority=933)
		public  static void  checkMovingPurchaseVoucherVATToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMovingPurchaseVoucherVATToPosition(),true);
			  
		}
		
		
		@Test(priority=934)
		public  static void  verifySelectingPurchaseReturnsfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingPurchaseReturnsfromVoucherlist(),true);
			  
		}
		
		
		@Test(priority=935)
		public  static void  verifyMovingPurchaseReturnsToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMovingPurchaseReturnsToPosition(),true);
			  
		}
		
		
		
		@Test(priority=936)
		public  static void  checkSelectingPurchaseVoucherfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingPurchaseVoucherfromVoucherlist(),true);
			  
		}
		
	
		@Test(priority=937)
		public  static void  checkMovingPurchaseVoucherToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMovingPurchaseVoucherToPosition(),true);
			  
		}
		
		
		@Test(priority=938)
		public  static void  verifySelectingMRNfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingMRNfromVoucherlist(),true);
			  
		}
		
		
		
		/*@Test(priority=939)
		public  static void  verifyMovingMRNToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMovingMRNToPosition(),true);
			  
		}
		*/
		@Test(priority=940)
		public  static void  checkLinkandDeleteOptionsinMR() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinMR(),true);
			  
		}
		
		@Test(priority=941)
		public  static void  checkMappingBetweenMRtoPurchaseOrders() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMappingBetweenMRtoPurchaseOrders(),true);
			  
		}
		
		
		
		@Test(priority=942)
		public  static void  verifyLinkandDeleteOptionsinPurchaseorders() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinPurchaseorders(),true);
			  
		}
		
		
		
		@Test(priority=943)
		public  static void  checkMappingBetweenPurchaseOrdersAndPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMappingBetweenPurchaseOrdersAndPurchaseVoucher(),true);
			  
		}
		
		
		
		@Test(priority=944)
		public  static void  checkLinkandDeleteOptionsinPurchasevouchersVat() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinPurchasevouchersVat(),true);
			  
		}
		
		
		@Test(priority=945)
		public  static void  checkMappingBetweenPurchaseVoucherAndPurchseReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMappingBetweenPurchaseVoucherAndPurchseReturns(),true);
			  
		}
		
		
		
		
		@Test(priority=946)
		public  static void  checkLinkandDeleteOptionsinPurchaseorders2() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinPurchaseorders2(),true);
			  
		}
		
		
		
		@Test(priority=947)
		public  static void  checkMappingBetweenPurchaseOrdersAndPurchaseVoucherN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMappingBetweenPurchaseOrdersAndPurchaseVoucherN(),true);
			  
		}
		
		
		
		
		
		@Test(priority=948)
		public  static void  checkLinkandDeleteOptionsinPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinPurchaseVoucher(),true);
			  
		}
		
		
		
		
		@Test(priority=949)
		public  static void  checkMappingBetweenPurchaseVoucherNAndMRN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMappingBetweenPurchaseVoucherNAndMRN(),true);
			  
		}
		
		
		
		
		@Test(priority=950)
		public  static void  checkLinkandDeleteOptionsinMRN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinMRN(),true);
			  
		}
		
		
		
		
		
		@Test(priority=951)
		public  static void  checkMappingBetweenMRNandPurchaseReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkMappingBetweenMRNandPurchaseReturns(),true);
			  
		}
		
		@Test(priority=952)
		public  static void  checkLinkBetweenMRandPurchaseOrders() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkBetweenMRandPurchaseOrders(),true);
			  
		}
		
		@Test(priority=953)
		public  static void  checkSelectingQuantityinLinkValueOptionBetweenMRandPurchaseOrders() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenMRandPurchaseOrders(),true);
			  
		}
		
		@Test(priority=954)
		public  static void  checkSelectingItemOptionBetweenMRandPurchaseOrders() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenMRandPurchaseOrders(),true);
			  
		}
		
		@Test(priority=955)
		public  static void  checkOkBetweenMRandPurchaseOrders() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOkBetweenMRandPurchaseOrders(),true);
			  
		}
		
		
		@Test(priority=956)
		public  static void  checkLinkBetweenPurchaseOrderAndpurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkBetweenPurchaseOrderAndpurchaseVoucherVAT(),true);
			  
		}
		
		
		
		@Test(priority=957)
		public  static void  checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrdersAndPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrdersAndPurchaseVoucherVAT(),true);
			  
		}
		
		
		
		
		@Test(priority=958)
		public  static void  checkSelectingItemOptionBetweenPurchseOrdersAndPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenPurchseOrdersAndPurchaseVoucherVAT(),true);
			  
		}
		
		
		
		
		@Test(priority=959)
		public  static void  checkOkBetweenPurchaseOrderAndPurchaseVocuherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOkBetweenPurchaseOrderAndPurchaseVocuherVAT(),true);
			  
		}
		
		
		
		
		@Test(priority=960)
		public  static void  checkLinkBetweenPurchaseVoucherAndpurchaseReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkBetweenPurchaseVoucherAndpurchaseReturns(),true);
			  
		}
	
		
		
		@Test(priority=961)
		public  static void  checkSelectingQuantityinLinkValueOptionBetweenPurchaseVoucherAndPurchaseReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenPurchaseVoucherAndPurchaseReturns(),true);
			  
		}
		
		
		
		
		@Test(priority=962)
		public  static void  checkSelectingItemOptionBetweenPurchaseVoucherAndPurchaseReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenPurchaseVoucherAndPurchaseReturns(),true);
			  
		}
		
		
		

		@Test(priority=963)
		public  static void  checkOkBetweenBetweenPurchaseVoucherAndPurchaseReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOkBetweenBetweenPurchaseVoucherAndPurchaseReturns(),true);
			  
		}
		
		
		@Test(priority=964)
		public  static void  checkLinkBetweenPurchaseOrdersAndPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkBetweenPurchaseOrdersAndPurchaseVoucher(),true);
			  
		}
		
		
		
		
		@Test(priority=965)
		public  static void  checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrdersAndPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrdersAndPurchaseVoucher(),true);
			  
		}
		
		
		
		
		@Test(priority=966)
		public  static void  checkSelectingItemOptionBetweenPurchaseOrdersAndPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenPurchaseOrdersAndPurchaseVoucher(),true);
			  
		}
		
		
		
		
		@Test(priority=967)
		public  static void  checkOkBetweenBetweenPurchaseOrdersAndPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOkBetweenBetweenPurchaseOrdersAndPurchaseVoucher(),true);
			  
		}
		
		
		
		@Test(priority=968)
		public  static void  checkLinkBetweenPurchaseVoucherAndMRN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkBetweenPurchaseVoucherAndMRN(),true);
			  
		}
		
		
		
		
		@Test(priority=969)
		public  static void  checkSelectingQuantityinLinkValueOptionBetweenPurchaseVoucherNAndMRN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenPurchaseVoucherNAndMRN(),true);
			  
		}
		
		
		
		
		
		@Test(priority=970)
		public  static void  checkSelectingItemOptionBetweenPurchaseVoucherNAndMRN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenPurchaseVoucherNAndMRN(),true);
			  
		}
		
		
		
		
		@Test(priority=971)
		public  static void  checkOkBetweenBetweenPurchaseVoucherNAndMRN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOkBetweenBetweenPurchaseVoucherNAndMRN(),true);
			  
		}
		
		
		@Test(priority=972)
		public  static void  checkLinkBetweenMRNAndPurchasereturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkLinkBetweenMRNAndPurchasereturns(),true);
			  
		}
		
		
		@Test(priority=973)
		public  static void  checkSelectingQuantityinLinkValueOptionBetweenMRNAndPurchaseReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenMRNAndPurchaseReturns(),true);
			  
		}
		
		
		
		@Test(priority=974)
		public  static void  checkSelectingItemOptionBetweenMRNAndPurchaseReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenMRNAndPurchaseReturns(),true);
			  
		}
		
		
		
		
		@Test(priority=975)
		public  static void  checkOkBetweenBetweenMRNAndPurchaseReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkOkBetweenBetweenMRNAndPurchaseReturns(),true);
			  
		}
		
		
		
		@Test(priority=976)
		public  static void  checkSavingPurchasesFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSavingPurchasesFlow(),true);
			  
		} 
		
		
		@Test(priority=977)
		public  static void  checkEditingSavedPurchasesFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkEditingSavedPurchasesFlow(),true);
			  
		}  
		
		

		// Auto Reservation
	
	
		//@Test(priority=990)
		public  static void  checkSavingAutoReservationFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
		{

			dwfp=new SmokeDesignWorkFlowPage(getDriver());
			Assert.assertEquals(dwfp.checkSavingAutoReservationFlow(),true);
			  
		} 
		
		
		// Sales Flow
		
		// Sales Flow
		/*
				@Test(priority=1001)
				public  static void verifySelectingSalesVoucherTypesfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingSalesVoucherTypesfromVoucherlist(),true);
					  
				} 
				
				
				@Test(priority=1002)
				public  static void verifySelectingSalesOrdersfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingSalesOrdersfromVoucherlist(),true);
					  
				} 
				

				
				
				
				//-----------------------
				

				@Test(priority=1003)
				public  static void  verifyMovingSalesOrderToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMovingSalesOrderToPosition(),true);
					  
				} 
				
				
				@Test(priority=1004)
				public  static void  verifySelectingSalesInvoicesfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingSalesInvoicesfromVoucherlist(),true);
					  
				} 
				
				
				@Test(priority=1005)
				public  static void  verifyMovingSalesInvoicesToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMovingSalesInvoicesToPosition(),true);
					  
				}
				
			
				@Test(priority=1006)
				public  static void  verifySelectingSalesReturnsfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingSalesReturnsfromVoucherlist(),true);
					  
				}
				
				
				
			//	@Test(priority=1007)
				public  static void  verifyMovingSalesReturnsToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMovingSalesReturnsToPosition(),true);
					  
				}
				
				@Test(priority=1009)
				public  static void  verifySelectingExcessInStocksfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingExcessInStocksfromVoucherlist(),true);
					  
				}
				
				//@Test(priority=1009)
				public  static void  verifyMovingExcessInStocksToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMovingExcessInStocksToPosition(),true);
					  
				}
				
				
				
				@Test(priority=1010)
				public  static void  verifySelectingStockTransferfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingStockTransferfromVoucherlist(),true);
					  
				}
				
				//Here onwards change the script
				
				
			
				@Test(priority=1011)
				public  static void  verifyMovingStockTransferToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMovingStockTransferToPosition(),true);
					  
				}
				
				
				
				@Test(priority=1008)
				public  static void  verifySelectingShortageinStocksfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingShortageinStocksfromVoucherlist(),true);
					  
				}
				
				
				
				@Test(priority=1013)
				public  static void  checkMovingShortageinStocksToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMovingShortageinStocksToPosition(),true);
					  
				}
				

				
				@Test(priority=1014)
				public  static void verifySelectingsalesInvoicesNfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingsalesInvoicesNfromVoucherlist(),true);
					  
				}
				
				@Test(priority=1015)
				public  static void verifyMovingsalesInvoicesNToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMovingsalesInvoicesNToPosition(),true);
					  
				}
				
				@Test(priority=1016)
				public  static void verifySelectingDeliveryNotesfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingDeliveryNotesfromVoucherlist(),true);
					  
				}
				
				@Test(priority=1017)
				public  static void verifyMovingDeliveryNotesToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMovingDeliveryNotesToPosition(),true);
					  
				}

				
				@Test(priority=1018)
				public  static void checkSelectingAutoSalesOrderfromVoucherlist() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingAutoSalesOrderfromVoucherlist(),true);
					  
				}
				
				@Test(priority=1019)
				public  static void checkMovingAutoSalesOrderToPosition() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMovingAutoSalesOrderToPosition(),true);
					  
				}
				
				@Test(priority=1020)
				public  static void verifyLinkandDeleteOptionsinSalesQuotations() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinSalesQuotations(),true);
					  
				}
				
				@Test(priority=1021)
				public  static void verifySelectingLinkButtoninSalesQuotations() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingLinkButtoninSalesQuotations(),true);
					  
				}
				
				
				@Test(priority=1022)
				public  static void verifyMappingFromSalesQuotationsToSalesOrder() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMappingFromSalesQuotationsToSalesOrder(),true);
					  
				}
				
				@Test(priority=1023)
				public  static void verifyLinkandDeleteOptionsinSalesOrdersAndSelectingLinkOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinSalesOrdersAndSelectingLinkOption(),true);
					  
				}
				
				
				
				@Test(priority=1024)
				public  static void verifyMappingFromSalesOrderToSalesInvoice() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMappingFromSalesOrderToSalesInvoice(),true);
					  
				}
				
				
				@Test(priority=1025)
				public  static void verifyLinkandDeleteOptionsinSalesInvoiceAndSelectingLinkOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinSalesInvoiceAndSelectingLinkOption(),true);
					  
				}
				
				
				@Test(priority=1026)
				public  static void checkMappingFromSalesInvoiceToSalesReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMappingFromSalesInvoiceToSalesReturns(),true);
					  
				}
				

				@Test(priority=1027)
				public  static void verifyLinkandDeleteOptionsinSalesQuotationAndSelectingLinkOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinSalesQuotationAndSelectingLinkOption(),true);
					  
				}
				
				@Test(priority=1028)
				public  static void checkMappingFromSalesQuotationToExcessinStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMappingFromSalesQuotationToExcessinStocks(),true);
					  
				}
				
				@Test(priority=1029)
				public  static void verifyLinkandDeleteOptionsinExcessinStocksAndSelectingLinkOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinExcessinStocksAndSelectingLinkOption(),true);
					  
				}
				
				
				@Test(priority=1030)
				public  static void checkMappingFromExcessinStocksToStockTransfer() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMappingFromExcessinStocksToStockTransfer(),true);
					  
				}
				
				@Test(priority=1031)
				public  static void checkLinkandDeleteOptionsinExcessinStocks2AndSelectingLinkOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinExcessinStocks2AndSelectingLinkOption(),true);
					  
				}
				
				@Test(priority=1032)
				public  static void checkMappingFromExcessinStocksToShortageinStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMappingFromExcessinStocksToShortageinStocks(),true);
					  
				}
				
				
				@Test(priority=1033)
				public  static void checkLinkandDeleteOptionsinStockTransferAndSelectingLinkOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinStockTransferAndSelectingLinkOption(),true);
					  
				}
				
				@Test(priority=1034)
				public  static void checkMappingFromStockTransferToSalesInvoiceN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMappingFromStockTransferToSalesInvoiceN(),true);
					  
				}
				
				
				@Test(priority=1035)
				public  static void verifyLinkandDeleteOptionsinSalesInvoiceNAndSelectingLinkOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinSalesInvoiceNAndSelectingLinkOption(),true);
					  
				}
				
				@Test(priority=1036)
				public  static void checkMappingFromSalesInvoiceNToDeliveryNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMappingFromSalesInvoiceNToDeliveryNotes(),true);
					  
				}
				
				@Test(priority=1037)
				public  static void checkLinkandDeleteOptionsinAutoSalesOrderAndSelectingLinkOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkandDeleteOptionsinAutoSalesOrderAndSelectingLinkOption(),true);
					  
				}
				
				
				@Test(priority=1038)
				public  static void checkMappingFromAutoSalesOrderToSalesInvoice() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkMappingFromAutoSalesOrderToSalesInvoice(),true);
					  
				}
				
				@Test(priority=1039)
				public  static void checkLinkBetweenSalesQuotationAndSalesOrder() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkBetweenSalesQuotationAndSalesOrder(),true);
					  
				}
				
				@Test(priority=1040)
				public  static void checkSelectingQuantityinLinkValueOptionBetweenSalesQuotationAndSalesOrder() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenSalesQuotationAndSalesOrder(),true);
					  
				}
				
				
				@Test(priority=1041)
				public  static void checkSelectingItemOptionBetweenSalesQuotationAndSalesOrder() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenSalesQuotationAndSalesOrder(),true);
					  
				}
				
				@Test(priority=1042)
				public  static void checkLinkBetweenSalesOrderAndSalesInvoice() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkBetweenSalesOrderAndSalesInvoice(),true);
					  
				}
				
				
				
				@Test(priority=1043)
				public  static void checkSelectingQuantityinLinkValueOptionBetweenSalesOrderAndSalesInvoices() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenSalesOrderAndSalesInvoices(),true);
					  
				}
				
				@Test(priority=1044)
				public  static void checkSelectingItemOptionBetweenSalesOrderAndSalesInvoices() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenSalesOrderAndSalesInvoices(),true);
					  
				}
				
				@Test(priority=1045) //
				public  static void checkEnabletheOptionCheckStockWhileLinking() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkEnabletheOptionCheckStockWhileLinking(),true);
					  
				}
				
				
				@Test(priority=1046)
				public  static void checkOkBetweenBetweenSalesOrderAndSalesInvoices() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkOkBetweenBetweenSalesOrderAndSalesInvoices(),true);
					  
				}
				
				
				@Test(priority=1047)
				public  static void checkLinkBetweenSalesInvoiceAndSalesReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkBetweenSalesInvoiceAndSalesReturns(),true);
					  
				}
				
				
				@Test(priority=1048)
				public  static void checkSelectingQuantityinLinkValueOptionBetweenSalesInvoicesAndSalesReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenSalesInvoicesAndSalesReturns(),true);
					  
				}
				
				
				@Test(priority=1049)
				public  static void checkSelectingItemOptionBetweenSalesInvoicesAndSalesReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenSalesInvoicesAndSalesReturns(),true);
					  
				}
				
				@Test(priority=1050)
				public  static void checkSelectingtheExtrafieldforoptionBasedonFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingtheExtrafieldforoptionBasedonFields(),true);
					  
				}
				
				@Test(priority=1051)
				public  static void checkOkBetweenBetweenSalesInvoicesrAndSalesReturns() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkOkBetweenBetweenSalesInvoicesrAndSalesReturns(),true);
					  
				}
				
				
				
				@Test(priority=1052)
				public  static void checkLinkBetweenSalesQuotationsToExcessinStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkBetweenSalesQuotationsToExcessinStocks(),true);
					  
				}
				
				
				@Test(priority=1053)
				public  static void checkSelectingQuantityinLinkValueOptionBetweenSalesQuotationsAndExcessinStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenSalesQuotationsAndExcessinStocks(),true);
					  
				}
				
				@Test(priority=1054)
				public  static void checkSelectingItemOptionBetweenSalesQuotationsAndExcessinStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenSalesQuotationsAndExcessinStocks(),true);
					  
				}
				
				
				@Test(priority=1055)
				public  static void checkOkBetweenBetweenSalesQuotationsAndExcessinStock() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkOkBetweenBetweenSalesQuotationsAndExcessinStock(),true);
					  
				}
				
				@Test(priority=1056)
				public  static void checkLinkBetweenExcessinStocksToStockTransfers() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkBetweenExcessinStocksToStockTransfers(),true);
					  
				}
				
				
				@Test(priority=1057)
				public  static void checkSelectingQuantityinLinkValueOptionBetweenExcessinStocksAndStockTransfer() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenExcessinStocksAndStockTransfer(),true);
					  
				}
				
				
				@Test(priority=1058)
				public  static void checkSelectingItemOptionBetweenExcessinStocksStockTransfer() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenExcessinStocksStockTransfer(),true);
					  
				}
				
				
				@Test(priority=1059)
				public  static void checkOkBetweenBetweenExcessinStockAndStockTransfer() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkOkBetweenBetweenExcessinStockAndStockTransfer(),true);
					  
				}
				
				
				@Test(priority=1060)
				public  static void checkLinkBetweenExcessinStocksToShoratgeinStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkBetweenExcessinStocksToShoratgeinStocks(),true);
					  
				}
				
				@Test(priority=1061)
				public  static void verifySelectingQuantityinLinkValueOptionBetweenExcessinStocksAndShortageinStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenExcessinStocksAndShortageinStocks(),true);
					  
				}
				
				@Test(priority=1062)
				public  static void checkSelectingItemOptionBetweenExcessinStocksShortageinStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenExcessinStocksShortageinStocks(),true);
					  
				}
				
				
				@Test(priority=1063)
				public  static void checkOkBetweenBetweenExcessinStockAndShortageinStocks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkOkBetweenBetweenExcessinStockAndShortageinStocks(),true);
					  
				}
				
				
				@Test(priority=1064)
				public  static void checkLinkBetweenStockTransferToSalesInvoiceN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkBetweenStockTransferToSalesInvoiceN(),true);
					  
				}
				
				@Test(priority=1065)
				public  static void checkSelectingQuantityinLinkValueOptionBetweenStockTransferAndSalesInvoiceN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenStockTransferAndSalesInvoiceN(),true);
					  
				}
				
				@Test(priority=1066)
				public  static void checkSelectingItemOptionBetweenStockTransferAndSalesInvoiceN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenStockTransferAndSalesInvoiceN(),true);
					  
				}
				
				@Test(priority=1067)
				public  static void checkOkBetweenBetweenStockTransferAndSalesInvoiceN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkOkBetweenBetweenStockTransferAndSalesInvoiceN(),true);
					  
				}
				
				@Test(priority=1068)
				public  static void checkLinkBetweenSalesInvoiceNToDeliveryNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkBetweenSalesInvoiceNToDeliveryNotes(),true);
					  
				}
				
				
				@Test(priority=1069)
				public  static void checkSelectingQuantityinLinkValueOptionBetweenSalesInvoiceNAndDeliveryNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenSalesInvoiceNAndDeliveryNotes(),true);
					  
				}
				
				
				@Test(priority=1070)
				public  static void checkSelectingItemOptionBetweenSalesInvoiceNAndDeliveryNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenSalesInvoiceNAndDeliveryNotes(),true);
					  
				}
				
				
				@Test(priority=1071)
				public  static void checkOkBetweenBetweenSalesInvoiceNAndDeliveryNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkOkBetweenBetweenSalesInvoiceNAndDeliveryNotes(),true);
					  
				}
				
				@Test(priority=1072)
				public  static void checkLinkBetweenAutoSalesOrderandSalesInvoice() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkLinkBetweenAutoSalesOrderandSalesInvoice(),true);
					  
				}
				
				@Test(priority=1073)
				public  static void checkSelectingQuantityinLinkValueOptionBetweenAutoSalesOrderandSalesInvoice() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingQuantityinLinkValueOptionBetweenAutoSalesOrderandSalesInvoice(),true);
					  
				}
				
				@Test(priority=1074)
				public  static void checkSelectingItemOptionBetweenAutoSalesOrderAndSalesInvoice() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingItemOptionBetweenAutoSalesOrderAndSalesInvoice(),true);
					  
				}
				
				@Test(priority=1075)
				public  static void checkOkBetweenBetweenAutoSalesOrderAndSalesInvoice() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkOkBetweenBetweenAutoSalesOrderAndSalesInvoice(),true);
					  
				}
				
				@Test(priority=1076)
				public  static void checkSaveWorkflowAsSalesFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSaveWorkflowAsSalesFlow(),true);
					  
				}
				
				@Test(priority=1077)
				public  static void checkSelectingNarration() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
				{

					dwfp=new SmokeDesignWorkFlowPage(getDriver());
					Assert.assertEquals(dwfp.checkSelectingNarration(),true);
					  
				}
				
	
	*/
		
}
