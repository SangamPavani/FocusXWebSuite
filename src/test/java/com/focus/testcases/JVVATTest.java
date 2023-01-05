package com.focus.testcases;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.JVVATPage;
import com.focus.base.BaseEngine;

public class JVVATTest extends BaseEngine
{

	
	
	static JVVATPage jvp;
	
	
	
	@Test(priority=700699)
	public  static void checkLoginToFinancialVouchers() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkLoginToFinancialVouchers(),true);
	}
	

	@Test(priority=700700)
	public  static void checkNavigationToJVVATVocher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkNavigationToJVVATVocher(),true);
	}
		

	@Test(priority=700701)
	public  static void checkJVVATViewVoucherHomeScreenOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherHomeScreenOptions(),true);
	}
		
	
	@Test(priority=700702)
	public  static void checkJVVATViewNewHomePageNewOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewNewHomePageNewOption(),true);
	}
	
	@Test(priority=700703)
	public  static void checkJVVATViewNewEntryPageRibbonControl() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewNewEntryPageRibbonControl(),true);
	}
	
	@Test(priority=700704)
	public  static void checkJVVATViewHomePageOptionsUndertoggleBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewHomePageOptionsUndertoggleBtn(),true);
	}
	
	
	@Test(priority=700705)
	public  static void checkCustomizationOptionInJVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkCustomizationOptionInJVVATView(),true);
	}
	
	
	@Test(priority=700706)
	public  static void checkJVVATViewNewEntryPageHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewNewEntryPageHeaderFields(),true);
	}
	
	@Test(priority=700707)
	public  static void checkJVVATViewEntryPageBodyFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewEntryPageBodyFields(),true);
	}
	
	@Test(priority=700708)
	public  static void checkJVVATViewEntryPageFooterFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewEntryPageFooterFields(),true);
	}
	
	
	@Test(priority=700709)
	public  static void checkJVVATViewEntryPageDocumentNumber() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewEntryPageDocumentNumber(),true);
	}
	
	@Test(priority=700710)
	public  static void checkJVVATViewVoucherNewEntryPageInfoSideBarCustomizeBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherNewEntryPageInfoSideBarCustomizeBtn(),true);
	}
	
	@Test(priority=700711)
	public  static void checJVVATViewVoucherEntryPageInfoSideBarGraphOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checJVVATViewVoucherEntryPageInfoSideBarGraphOption(),true);
	}
	
	@Test(priority=700712)
	public  static void checkJVVATViewVoucherEntryPageInfoSideBarReportOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherEntryPageInfoSideBarReportOption(),true);
	}
	
	@Test(priority=700713)
	public  static void checkJVVATViewVoucherNewEntryPageInfoSideBarInfoPanelOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherNewEntryPageInfoSideBarInfoPanelOption(),true);
	}
	
	
	@Test(priority=700714)
	public  static void checkJVVATViewVoucherNewEntryPageInfoSideBarWorkFlowOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherNewEntryPageInfoSideBarWorkFlowOption(),true);
	}
	
	@Test(priority=700715)
	public  static void checkJVVATViewVoucherNewEntryPageInfoSideBarOtherDashletsOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherNewEntryPageInfoSideBarOtherDashletsOption(),true);
	}
	
	@Test(priority=700716)
	public  static void checkJVVATViewVoucherNewEntryPageInfoSideBarSearch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherNewEntryPageInfoSideBarSearch(),true);
	}
	
	@Test(priority=700717)
	public  static void checkJVVATViewVoucherNewInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherNewInfoPanelDashlet(),true);
	}
	
	
	@Test(priority=700718)
	public  static void checkJVVATViewVoucherNewSaveInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherNewSaveInfoPanelDashlet(),true);
	}
	
	@Test(priority=700719)
	public  static void checkSmokeJVVATViewNewDateFieldLessThanCompanyAccountingDate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkSmokeJVVATViewNewDateFieldLessThanCompanyAccountingDate(),true);
	}
	
	@Test(priority=700720)
	public  static void checkNewOptioninEntryPageinJVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkNewOptioninEntryPageinJVVATView(),true);
	}
	
	@Test(priority=700721)
	public  static void checkJVVATViewSaveWithoutMandatoryFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewSaveWithoutMandatoryFields(),true);
	}
	
	@Test(priority=700722)
	public  static void checkCurrencyOptioninSmokeJVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkCurrencyOptioninSmokeJVVATView(),true);
	}
	
	@Test(priority=700723)
	public  static void checkJVVATViewVoucherVATDepartment() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherVATDepartment(),true);
	}
	
	@Test(priority=700724)
	public  static void checkJVVATViewWithCurrencyINRInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewWithCurrencyINRInputAndExcgRate(),true);
	}
	
	@Test(priority=700725)
	public  static void checkJVVATViewWithCurrencyUSDInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewWithCurrencyUSDInputAndExcgRate(),true);
	}
	
	
	@Test(priority=700726)
	public  static void checkJVVATViewWithCurrencyAEDInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewWithCurrencyAEDInputAndExcgRate(),true);
	}

	

	@Test(priority=700727)
	public  static void checkJVVATViewVoucherSaveWithHeaderFieldsInput() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkJVVATViewVoucherSaveWithHeaderFieldsInput(),true);
	}
	
	@Test(priority=700728)
	public  static void checkPartyAccountsCannotBeAdjustedWithEachOtherInSmokeJVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkPartyAccountsCannotBeAdjustedWithEachOtherInSmokeJVVATView(),true);
	}
	
	@Test(priority=700729)
	public  static void checkEnteringDataIntoBodyGridIneJVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkEnteringDataIntoBodyGridIneJVVATView(),true);
	}
	
	
	@Test(priority=700730)
	public  static void checkEnteringDataIntoBodySecondRowJVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkEnteringDataIntoBodySecondRowJVVATView(),true);
	}
	
	
	@Test(priority=700731)
	public  static void checkBillwiseScreenInJVVATWithAdjustAmountForVendorA() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkBillwiseScreenInJVVATWithAdjustAmountForVendorA(),true);
	}
	
	@Test(priority=700732)
	public  static void checkBillwiseScreenInJVVATWithAdjustAmountForCustomerA() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkBillwiseScreenInJVVATWithAdjustAmountForCustomerA(),true);
	}
	
	
	@Test(priority=700733)
	public  static void checkSavedVoucherInJVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkSavedVoucherInJVVATView(),true);
	}
	
	@Test(priority=700734)
	public  static void checkCopyAndPasteToClipBoardAndSavingInJVVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkCopyAndPasteToClipBoardAndSavingInJVVAT(),true);
	}
	
	
	@Test(priority=700735)
	public  static void checkCopyDocumentAndSavingInJVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkCopyDocumentAndSavingInJVVATView(),true);
	}
	
	
	@Test(priority=700736)
	public  static void checkSuspendedOptionInReceiptsJVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkSuspendedOptionInReceiptsJVVATView(),true);
	}
	
	
	@Test(priority=700737)
	public  static void checkDeleteOptionInJVVATViewHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkDeleteOptionInJVVATViewHomePage(),true);
	}
	
	
	
	@Test(priority=700738)
	public  static void checkConsumedAdjustmentBillInBillwiseScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		jvp=new JVVATPage(getDriver());
		Assert.assertEquals(jvp.checkConsumedAdjustmentBillInBillwiseScreen(),true);
	}

	
	
	
	
	
}






