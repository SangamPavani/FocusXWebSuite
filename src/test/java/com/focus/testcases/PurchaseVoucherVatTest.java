package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.PurchaseVoucherVatPage;
import com.focus.Pages.PurchaseVoucherVatPage;
import com.focus.base.BaseEngine;

public class PurchaseVoucherVatTest extends BaseEngine
{
	
   static PurchaseVoucherVatPage pvvp;

    @Test(priority=60000)
  	public void checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		pvvp=new PurchaseVoucherVatPage(getDriver());
  		Assert.assertEquals(pvvp.checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage(), true);
  	}
   
    // Purchase Vocuher N
    
    //Starting Of PurchaseVoucher Transaction Authorization and Master Authorization
  
    @Test(priority=600799)
    public void checkFinancialsMenuTransactionsMenuPurchasesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	pvvp=new PurchaseVoucherVatPage(getDriver());
    	Assert.assertEquals(pvvp.checkFinancialsMenuTransactionsMenuPurchasesMenu(), true);
    }	
	
 
    @Test(priority=600800)
    public void checkPurchaseVoucherNewHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	pvvp=new PurchaseVoucherVatPage(getDriver());
    	Assert.assertEquals(pvvp.checkPurchaseVoucherNewHomePage(), true);
    }	
   
    
    @Test(priority=600802)
    public void checkPurchasesVoucherPendingLinksOptionsInHomePageOnAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	pvvp=new PurchaseVoucherVatPage(getDriver());
    	Assert.assertEquals(pvvp.checkPurchasesVoucherPendingLinksOptionsInHomePageOnAuthorization(), true);
    }	
  
    
    @Test(priority=600803)
    public void checkPurchasesVoucherOpenEntryByConvertOpyionInHomePageOnLinksView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	pvvp=new PurchaseVoucherVatPage(getDriver());
    	Assert.assertEquals(pvvp.checkPurchasesVoucherOpenEntryByConvertOpyionInHomePageOnLinksView(), true);
    }	
    
      
    @Test(priority=600804)
    public void checkEditVendorAccountToUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	pvvp=new PurchaseVoucherVatPage(getDriver());
    	Assert.assertEquals(pvvp.checkEditVendorAccountToUpdate(), true);
    }
        
    @Test(priority=600805)
    public void checkCreateVendorAccountMasterAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkCreateVendorAccountMasterAuthorization(), true);
    }
     
    @Test(priority=600807)
    public void checkPurchaseVoucherNewEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageHeaderFields(), true);
    }
   
    @Test(priority=600808)
    public void checkPurchaseVoucherNewEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageBodyFields(), true);
    }
   
    @Test(priority=600809)
    public void checkPurhaseVoucherNewEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	pvvp=new PurchaseVoucherVatPage(getDriver());
    	Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageFooterFields(), true);
    }
       
    @Test(priority=600810)
    public void checkPurchaseVoucherNewEntryPageDocumentNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageDocumentNumber(), true);
    }
   
    @Test(priority=600815)
    public void checkPurchaseVoucherNewDueDateOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewDueDateOption(), true);
    }
  
    @Test(priority=600816)
    public void checkPurchaseVoucherNewCurrencyHasNotDefinedOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewCurrencyHasNotDefinedOptions(), true);
    }
   
    @Test(priority=600823)
    public void checkCurrencyWithAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkCurrencyWithAED(), true);
    }
    
    @Test(priority=600824)
    public void checkCurrencyWithUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkCurrencyWithUSD(), true);
    }
  
  
    @Test(priority=600825)
    public void checkDepartmentEditExchangeRateAndLocalExchangeReateWithCurrencyAEDInPV() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkDepartmentEditExchangeRateAndLocalExchangeReateWithCurrencyAEDInPV(), true);
    }
   
      @Test(priority=600826)
	  public void checkExchangeRateAndLocalExchangeReateWithCurrencyUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkExchangeRateAndLocalExchangeReateWithCurrencyUSD(), true);
	  }
  
      @Test(priority=600827)
	  public void checkJursidicationValueOnChangeDepartmentAndLocalExchangeRateWithCurrencyINR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkJursidicationValueOnChangeDepartmentAndLocalExchangeRateWithCurrencyINR(), true);
	  }
        
	  
	
	  @Test(priority=600831) // Issue Reported
	  public  static void checkINVTagTaxCodeBySelectingStandardRateItemInPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkINVTagTaxCodeBySelectingStandardRateItemInPurchaseVoucherBody(),true);  
	  }

	  @Test(priority=600840)
	  public  static void checkPurchaseVoucherNewBillwise() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewBillwise(),true);
	  }  
	  
	  @Test(priority=600841)
	  public  static void checkPurchaseVoucherNewBillwiseScreenClickOnPick() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
	  	Assert.assertEquals(pvvp.checkPurchaseVoucherNewBillwiseScreenClickOnPick(),true);
	  }
	
	  @Test(priority=600842)
	  public  static void checkSavingOfPurchaseVoucherNewOnClickOkButtonInBillwisePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkSavingOfPurchaseVoucherNewOnClickOkButtonInBillwisePage(),true);
	  }

	  @Test(priority=600843)
	  public  static void checkStandardRateOptionByVoucherEdit() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkStandardRateOptionByVoucherEdit(),true);
	  }
	
	  @Test(priority=600844)
	  public  static void checkCloseBtnInEntryPageAndCheckLinksDisplayInHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkCloseBtnInEntryPageAndCheckLinksDisplayInHomePage(),true);
	  }
   
    
	  @Test(priority=600845)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBar() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageInfoSideBar(),true);
	  }
	
	  @Test(priority=600846)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarCustomizeBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageInfoSideBarCustomizeBtn(),true);
	  }
	
	  @Test(priority=600847)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarGraphOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageInfoSideBarGraphOption(),true);
	   }

	  @Test(priority=600848)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarReportOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageInfoSideBarReportOption(),true);
	  }
	
	  @Test(priority=600849)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarInfoPanelOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageInfoSideBarInfoPanelOption(),true);
	  }
	
	  @Test(priority=600850)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarWorkFlowOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageInfoSideBarWorkFlowOption(),true);
	  }	
	
	  @Test(priority=600851)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarOtherDashletsOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageInfoSideBarOtherDashletsOption(),true);
	  }
	
	  @Test(priority=600852)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarSearch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewEntryPageInfoSideBarSearch(),true);
	  }
	
	  @Test(priority=600853)
	  public  static void checkPurchaseVoucherNewInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewInfoPanelDashlet(),true);
	  }
	
	  @Test(priority=600854)
	  public  static void checkPurchaseVoucherNewSaveInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherNewSaveInfoPanelDashlet(),true);
	  }
	  
	  
	  
	 @Test(priority=600855) //
	 public  static void checkVendorAccountBlankNarrationToDisplayCaptionItem() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	 {
		 pvvp=new PurchaseVoucherVatPage(getDriver());
		 Assert.assertEquals(pvvp.checkVendorAccountBlankNarrationToDisplayCaptionItem(),true);	  
	 }
	
     
	 @Test(priority=600903)
 	public  static void checkPurchaseVoucherVATEntryPageHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATEntryPageHeaderFields(),true);
	}

	@Test(priority=600904)
	public  static void checkPurchaseVoucherVATEntryPageBodyFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATEntryPageBodyFields(),true);
	}
	
	
	@Test(priority=600905)
	public  static void checkPurchaseVoucherVATEntryPageFooterFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATEntryPageFooterFields(),true);
	}

	@Test(priority=600906)
	public  static void checkPurchaseVoucherVATEntryPageDocumentNumber() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATEntryPageDocumentNumber(),true);
	}
	
	
	@Test(priority=600907)
	public  static void checkPurchaseVoucherVATSaveWithOutInput() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATSaveWithOutInput(),true);
	}
	
	@Test(priority=600908)
	public  static void checkPurchaseVoucherVATVendorOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATVendorOptions(),true);
	}

	@Test(priority=600909)
	public  static void checkPurchaseVoucherVATSaveWithVendorInput() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATSaveWithVendorInput(),true);
	}
	
	@Test(priority=600910)
	public  static void checkDueDateOptioninPurchaseVoucherVATEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkDueDateOptioninPurchaseVoucherVATEntryPage(),true);
	}
	
	@Test(priority=600911)
	public  static void checkCurrencyOptioninPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkCurrencyOptioninPurchaseVoucherVAT(),true);
	}
	
	//@Test(priority=600912)
	public  static void checkPurchaseVoucherVATVouchersEntryPageNew() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATVouchersEntryPageNew(),true);
	}

	@Test(priority=600913)
	public  static void checkPurchaseVoucherVATWithCurrencyInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATWithCurrencyInputAndExcgRate(),true);
	}
	
	
	@Test(priority=600914)
	public  static void checkPurchaseVoucherVATDepartment() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATDepartment(),true);
	}
	
	@Test(priority=600915)
	public  static void checkExchangeRateAndLocalExchangeRateWithCurrencyINRInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkExchangeRateAndLocalExchangeRateWithCurrencyINRInPurchaseVoucherVAT(),true);
	}
	
	//@Test(priority=600916)
	public  static void checkSettingPlaceofSupplyForvendorAInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkSettingPlaceofSupplyForvendorAInPurchaseVoucherVAT(),true);
	}
	
	
	//@Test(priority=600917)
	public  static void checkDepartmentMasterCreationPageOnClickOnEditMasterInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkDepartmentMasterCreationPageOnClickOnEditMasterInPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600918) // Dubai
	public  static void checkDepartmentMasterUpdateByClickOnSaveInPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkDepartmentMasterUpdateByClickOnSaveInPurchaseVoucher(),true);
	}
	  
	  
	//919
	
	@Test(priority=600919)
	public  static void checkTaxCodeBySelectingStandardRateItemInPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingStandardRateItemInPurchaseVoucherBody(),true);
	}
	
	
	@Test(priority=600920)
	public  static void checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600921)
	public  static void checkGrossBySelectingStandardRateIteminPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingStandardRateIteminPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600922)
	public  static void checkVATValueBySelectingStandardRateIteminPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingStandardRateIteminPurchaseVoucherBody(),true);
	}
	
	
	@Test(priority=600923)
	public  static void checkTaxableValueBySelectingStandardRateItemAndClickonSaveWithoutBatch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingStandardRateItemAndClickonSaveWithoutBatch(),true);
	}
	
	@Test(priority=600924)
	public  static void checkBatchValueandExpireyDateInPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkBatchValueandExpireyDateInPurchaseVoucherBody(),true);
	}
	
	

	@Test(priority=600925)
	public  static void checkTaxCodeBySelectingStandardRateItemInSecondRowOfPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingStandardRateItemInSecondRowOfPurchaseVoucherBody(),true);
	}
	
	
	@Test(priority=600926)
	public  static void checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInSecondRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInSecondRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600927)
	public  static void checkGrossBySelectingStandardRateItemInSecondRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingStandardRateItemInSecondRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600928)
	public  static void checkVATValueBySelectingStandardRateItemInSecondRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingStandardRateItemInSecondRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600929)
	public  static void checkTaxableValueBySelectingStandardRateItemInSecondRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingStandardRateItemInSecondRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600930)
	public  static void checkBatchValueInSecondRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkBatchValueInSecondRowPurchaseVoucherBody(),true);
	}
	
	
	
	@Test(priority=600931)
	public  static void checkTaxCodeBySelectingStandardRateItemInThirdRowOfPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingStandardRateItemInThirdRowOfPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600932)
	public  static void checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInThirdRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInThirdRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600933)
	public  static void checkGrossBySelectingStandardRateItemInThirdRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingStandardRateItemInThirdRowPurchaseVoucherBody(),true);
	}
	
	
	@Test(priority=600934)
	public  static void checkVATValueBySelectingStandardRateItemInThirdRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingStandardRateItemInThirdRowPurchaseVoucherBody(),true);
	}
	
	
	@Test(priority=600935)
	public  static void checkTaxableValueBySelectingStandardRateItemInThirdRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingStandardRateItemInThirdRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600936)
	public  static void checkBatchValueInThirdRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkBatchValueInThirdRowPurchaseVoucherBody(),true);
	}
	

	@Test(priority=600937)
	public  static void checkUpdateItemSettingsAsZeroInFourthRowOfPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkUpdateItemSettingsAsZeroInFourthRowOfPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600938)
	public  static void checkPurchaseVoucherVATRowDelete() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATRowDelete(),true);
	}
	
	
	@Test(priority=600938)
	public  static void checkTaxCodeBySelectingStandardRateItemInFourthRowOfPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingStandardRateItemInFourthRowOfPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600939)//
	public  static void checkAvGRateAndAVGRateOBySelectingBinItemInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingBinItemInFourthRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600940)
	public  static void checkGrossBySelectingStandardRateItemInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingStandardRateItemInFourthRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600941)
	public  static void checkVATValueBySelectingStandardRateItemInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingStandardRateItemInFourthRowPurchaseVoucherBody(),true);
	}
	
	
	@Test(priority=600942)
	public  static void checkTaxableValueBySelectingStandardRateItemInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingStandardRateItemInFourthRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600943)
	public  static void checkBinPopUpPageInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkBinPopUpPageInFourthRowPurchaseVoucherBody(),true);
	}
	
	
	@Test(priority=600944)
	public  static void checkAutoAllocateOptionInBinPopupPageInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAutoAllocateOptionInBinPopupPageInFourthRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600945)
	public  static void checkCancelOptionInBinPopUpPageInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkCancelOptionInBinPopUpPageInFourthRowPurchaseVoucherBody(),true);
	}

	@Test(priority=600946)
	public  static void checkBinPopUpPageAfterClickOnCancelAndClickOnBinInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkBinPopUpPageAfterClickOnCancelAndClickOnBinInFourthRowPurchaseVoucherBody(),true);
	}
	
	@Test(priority=600947)
	public  static void checkPickOptionInBinPopupPageInFourthRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPickOptionInBinPopupPageInFourthRowOfPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600948)
	public  static void checkBinPopUpPagePickQtyAfterClickOnOkButtonAndClickOnBinInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkBinPopUpPagePickQtyAfterClickOnOkButtonAndClickOnBinInFourthRowPurchaseVoucherBody(),true);
	}

	
	
	@Test(priority=600949)
	public  static void checkTaxCodeBySelectingFIFOBinItemInFifthRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingFIFOBinItemInFifthRowOfPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600950)// Values 
	public  static void checkAvGRateAndAVGRateOBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=600951)
	public  static void checkGrossBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600952)
	public  static void checkVATValueBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600953)
	public  static void checkTaxableValueBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600954)
	public  static void checkBinPopUpPageInputManualInputInAllocateQtyInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkBinPopUpPageInputManualInputInAllocateQtyInPurchaseVoucherVAT(),true);
	}

	
	@Test(priority=600955)
	public  static void checkTaxCodeBySelectingFIFOBinItemInSixthRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingFIFOBinItemInSixthRowOfPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600956)
	public  static void checkGrossBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600957)
	public  static void checkVATValueBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600958)
	public  static void checkTaxableValueBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600959)// Avg Rate Values 
	public  static void checkAvGRateAndAVGRateOBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=600960)
	public  static void checkBinPopUpPageSelectBinAllocateQtyThroughDoubleClickInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkBinPopUpPageSelectBinAllocateQtyThroughDoubleClickInPurchaseVoucherVAT(),true);
	}

	
	@Test(priority=600961)
	public  static void checkTaxCodeBySelectingWACOGSRMAItemInSeventhRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingWACOGSRMAItemInSeventhRowOfPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600962)
	public  static void checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600963)
	public  static void checkGrossBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600964)
	public  static void checkVATValueBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600965)
	public  static void checkTaxableValueBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600966)
	public  static void checkAddAndOkButtonInRmaPageOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAddAndOkButtonInRmaPageOfPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=600967)
	public  static void checkTaxCodeBySelectingWACOGSRMAItemInEightRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingWACOGSRMAItemInEightRowOfPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600968)
	public  static void checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInEigthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInEigthRowPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=600969)
	public  static void checkGrossBySelectingWACOGSRMAItemIEigthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingWACOGSRMAItemIEigthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600970)
	public  static void checkVATValueBySelectingWACOGSRMAItemInEightRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingWACOGSRMAItemInEightRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600971)
	public  static void checkTaxableValueBySelectingWACOGSRMAItemInEigthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingWACOGSRMAItemInEigthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600972)
	public  static void checkAddAndOkButtonInRmaPageEigthRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAddAndOkButtonInRmaPageEigthRowOfPurchaseVoucherVAT(),true);
	}

	
	@Test(priority=600973)
	public  static void checkTaxCodeBySelectingWACOGSRMAItemInNinethRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingWACOGSRMAItemInNinethRowOfPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600974)
	public  static void checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600975)
	public  static void checkGrossBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600976)
	public  static void checkVATValueBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT(),true);
	}
	

	@Test(priority=600977)
	public  static void checkTaxableValueBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600978)
	public  static void checkAddAndOkButtonInRmaPageNinethRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAddAndOkButtonInRmaPageNinethRowOfPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=600979)
	public  static void checkTaxCodeBySelectingStdCOGSItemInTenthRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingStdCOGSItemInTenthRowOfPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600980)
	public  static void checkAvGRateAndAVGRateOBySelectingStdCOGSItemInTenthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingStdCOGSItemInTenthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600981)
	public  static void checkGrossBySelectingStdCOGSItemInTenthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingStdCOGSItemInTenthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600982)
	public  static void checkVATValueBySelectingStdCOGSInTenthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingStdCOGSInTenthRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600983)
	public  static void checkTaxableValueBySelectingStdCOGSInTenthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingStdCOGSInTenthRowPurchaseVoucherVAT(),true);
	}
	


	@Test(priority=600984)
	public  static void checkTaxCodeBySelectingStdCOGSInEleventhRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingStdCOGSInEleventhRowOfPurchaseVoucherVAT(),true);
	}
	;
	@Test(priority=600985)
	public  static void checkAvGRateAndAVGRateBySelectingStdCOGSInEleventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateBySelectingStdCOGSInEleventhRowPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=600986)
	public  static void checkGrossBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600987)
	public  static void checkVATValueBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600988)
	public  static void checkTaxableValueBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=600989)
	public  static void checkTaxCodeBySelectingStdCOGSInTwelevethRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxCodeBySelectingStdCOGSInTwelevethRowOfPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600990)
	public  static void checkAvGRateAndAVGRateOBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkAvGRateAndAVGRateOBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600991)
	public  static void checkGrossBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkGrossBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600992)
	public  static void checkVATValueBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkVATValueBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600993)
	public  static void checkTaxableValueBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTaxableValueBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=600994)
	public  static void checkPurchaseVoucherVATBillwisePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATBillwisePage(),true);
	}
	
	@Test(priority=600995)
	public  static void checkPurchaseVoucherVATBillwiseScreenClickOnPick() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATBillwiseScreenClickOnPick(),true);
	}
	
	@Test(priority=600996)
	public  static void checkSavingOfPurchaseVoucherVATOnClickOkButtonInBillwisePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkSavingOfPurchaseVoucherVATOnClickOkButtonInBillwisePage(),true);
	}
	
	@Test(priority=600997)
	public  static void checkBatchValidationInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkBatchValidationInPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600998)
	public  static void checkBinValidationInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkBinValidationInPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=600999)
	public  static void checkTotalConsumedBinValidationInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkTotalConsumedBinValidationInPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=601000)
	public  static void checkRowDeleteInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkRowDeleteInPurchaseVoucherVAT(),true);
	}
	
	

	@Test(priority=601001)
	public  static void checkChangingWareHouseAfterBinAllocatedinPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkChangingWareHouseAfterBinAllocatedinPurchaseVoucherVAT(),true);
	}
	
	
	
	@Test(priority=601002)
	public  static void checkRMAValidationInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkRMAValidationInPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=601003)
	public  static void checkRMAValidationWithDuplicateSerialNumberInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkRMAValidationWithDuplicateSerialNumberInPurchaseVoucherVAT(),true);
	}
	
	
	@Test(priority=601004)
	public  static void checkPurchaseVoucherVATCopyDocumentOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkPurchaseVoucherVATCopyDocumentOption(),true);
	}
	
	
	@Test(priority=601005)
	public  static void checkCopyDocumentOptioninPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkCopyDocumentOptioninPurchaseVoucherVAT(),true);
	}
	
	@Test(priority=601006)
	public  static void checkSavingVocuherWithAllInputsThroughCopyDocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkSavingVocuherWithAllInputsThroughCopyDocument(),true);
	}
	
	
	@Test(priority=601007)
	public  static void checkSuspedingPurchaseVoucherVatVoucherOnPreviousButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvvp=new PurchaseVoucherVatPage(getDriver());
		Assert.assertEquals(pvvp.checkSuspedingPurchaseVoucherVatVoucherOnPreviousButton(),true);
	}
	
	
	 @Test(priority=601011)
	 public  static void checkSavedVoucherInJobOrderAfterSavingVoucherInPVVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	 {
		 pvvp=new PurchaseVoucherVatPage(getDriver());
		 Assert.assertEquals(pvvp.checkSavedVoucherInJobOrderAfterSavingVoucherInPVVAT(),true);
	 }
	    
	    
	 @Test(priority=601012)
	 public  static void checkSavedVoucherInJobOrder() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	 {
		 pvvp=new PurchaseVoucherVatPage(getDriver());
		 Assert.assertEquals(pvvp.checkSavedVoucherInJobOrder(),true);
	 }
	 
      
}
