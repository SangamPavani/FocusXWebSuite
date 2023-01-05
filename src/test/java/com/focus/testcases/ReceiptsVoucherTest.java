package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.ReceiptsVoucherPage;
import com.focus.base.BaseEngine;

public class ReceiptsVoucherTest extends BaseEngine
{

	static ReceiptsVoucherPage rvp;
	
	@Test(priority=700601)
	public  static void checkLoginToFinancialVouchers() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkLoginToFinancialVouchers(),true);
	}
	
	
	@Test(priority=700602)
	public  static void checkNavigationToRecepitsVATVocher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkNavigationToRecepitsVATVocher(),true);
	}
	
	@Test(priority=700603)
	public  static void checkRecepitssVATVoucherHomeScreenOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkRecepitsVATVoucherHomeScreenOptions(),true);
	}
	
	@Test(priority=700604)
	public  static void checkPendingBillsInRecepitsVATVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkPendingBillsInRecepitsVATVoucher(),true);
	}

	@Test(priority=700605)
	public  static void checkRecepitsVATNewHomePageNewOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkRecepitsVATNewHomePageNewOption(),true);
	}
	
	@Test(priority=700606)
	public  static void checkRecepitsVATNewEntryPageRibbonControl() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkRecepitsVATNewEntryPageRibbonControl(),true);
	}
	
	@Test(priority=700607)
	public  static void checkRecepitsVATHomePageOptionsUndertoggleBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkRecepitsVATHomePageOptionsUndertoggleBtn(),true);
	}
	
	
	@Test(priority=700608)
	public  static void checkCustomizationOptionInRecepitsVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkCustomizationOptionInRecepitsVAT(),true);
	}
	
	@Test(priority=700609)
	public  static void checkRecepitsVATNewEntryPageHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkRecepitsVATNewEntryPageHeaderFields(),true);
	}
	
	@Test(priority=700610)
	public  static void checkRecepitsVATEntryPageBodyFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkRecepitsVATEntryPageBodyFields(),true);
	}
	
	@Test(priority=700611)
	public  static void checkRecepitsVATEntryPageFooterFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkRecepitsVATEntryPageFooterFields(),true);
	}
	
	@Test(priority=700612)
	public  static void checkRecepitsVATEntryPageDocumentNumber() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkRecepitsVATEntryPageDocumentNumber(),true);
	}
 
 
	//@Test(priority=700613)
	public  static void checkRecepitsVATVoucherNewEntryPageInfoSideBarCustomizeBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkRecepitsVATVoucherNewEntryPageInfoSideBarCustomizeBtn(),true);
	}
	
	//@Test(priority=700614)
	public  static void checkReceiptsVATVoucherEntryPageInfoSideBarGraphOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATVoucherEntryPageInfoSideBarGraphOption(),true);
	}
	
	//@Test(priority=700615)
	public  static void checkReceiptsVATVoucherEntryPageInfoSideBarReportOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATVoucherEntryPageInfoSideBarReportOption(),true);
	}
	
	//@Test(priority=700616)
	public  static void checkReceiptsVATVoucherNewEntryPageInfoSideBarInfoPanelOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATVoucherNewEntryPageInfoSideBarInfoPanelOption(),true);
	}
	
	//@Test(priority=700617)
	public  static void checkReceiptsVATVoucherNewEntryPageInfoSideBarWorkFlowOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATVoucherNewEntryPageInfoSideBarWorkFlowOption(),true);
	}
	
	//@Test(priority=700618)
	public  static void checkReceiptsVATVoucherNewEntryPageInfoSideBarOtherDashletsOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATVoucherNewEntryPageInfoSideBarOtherDashletsOption(),true);
	}
	
	//@Test(priority=700619)
	public  static void checkReceiptsVATVoucherNewEntryPageInfoSideBarSearch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATVoucherNewEntryPageInfoSideBarSearch(),true);
	}
	
	//@Test(priority=700620)
	public  static void checkReceiptsVATVoucherNewInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATVoucherNewInfoPanelDashlet(),true);
	}
	
	//@Test(priority=700621)
	public  static void checkReceiptsVATVoucherNewSaveInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATVoucherNewSaveInfoPanelDashlet(),true);
	}
	
	@Test(priority=700622)
	public  static void checkReceiptsVATNewDateFieldLessThanCompanyAccountingDate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATNewDateFieldLessThanCompanyAccountingDate(),true);
	}
	
	@Test(priority=700623)
	public  static void CheckClickOnNewButtonInEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkNewOptioninEntryPageinReceiptsVAT(),true);
	}
	
	
	@Test(priority=700624)
	public  static void checkReceiptsVATSaveWithoutMandatoryFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATSaveWithoutMandatoryFields(),true);
	}
	
 
	@Test(priority=700625)
	public  static void checkCurrencyOptioninRecepitsVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkCurrencyOptioninRecepitsVAT(),true);
	}

	
	@Test(priority=700626)
	public  static void checkReceiptsVATVoucherVATDepartment() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATVoucherVATDepartment(),true);
	}
	
	@Test(priority=700627) //
	public  static void checkReceiptsVATWithCurrencyINRInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATWithCurrencyINRInputAndExcgRate(),true);
	}
	
	
	@Test(priority=700628) //
	public  static void checkReceiptsVATWithCurrencyUSDInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATWithCurrencyUSDInputAndExcgRate(),true);
	}
	
	@Test(priority=700629)
	public  static void checkReceiptsVATWithCurrencyAEDInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATWithCurrencyAEDInputAndExcgRate(),true);
	}
	
	
	@Test(priority=700630)
	public  static void checkReceiptsVATVoucherSaveWithHeaderFieldsInput() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkReceiptsVATVoucherSaveWithHeaderFieldsInput(),true);
	}
	
	@Test(priority=700631)
	public  static void checkDueDateOptioninReceiptsVATEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkDueDateOptioninReceiptsVATEntryPage(),true);
	}
	
	

	@Test(priority=700632)
	public  static void checkNewOptioninEntryPageinReceiptsVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkNewOptioninEntryPageinReceiptsVAT(),true);
	}

	@Test(priority=700633)
	public  static void checkEnteringDataIntoBodyGridInReceiptsVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkEnteringDataIntoBodyGridInReceiptsVAT(),true);
	}
	
	@Test(priority=700634)
	public  static void checkBillwiseScreeninRecepitsVATWithNewAmountForVendorA() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkBillwiseScreeninRecepitsVATWithNewAmountForVendorA(),true);
	}
	
	@Test(priority=700635)
	public  static void checkClickOnSecondEntryInBillwiseScreenForVendorBINRecepitsVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkClickOnSecondEntryInBillwiseScreenForVendorBINRecepitsVAT(),true);
	}
	
	@Test(priority=700636)
	public  static void checkSavedVoucherInRecepitsVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkSavedVoucherInRecepitsVAT(),true);
	}
	
	@Test(priority=700637)
	public  static void checkCopyAndPasteToClipBoardAndSavingInReceiptsVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkCopyAndPasteToClipBoardAndSavingInReceiptsVAT(),true);
	}
	
	@Test(priority=700638)
	public  static void checkCopyDocumentAndSavingInReceiptsVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkCopyDocumentAndSavingInReceiptsVAT(),true);
	}
	
 
	@Test(priority=700639)
	public  static void checkDeleteOptionInReceiptsEntryPageVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkDeleteOptionInReceiptsEntryPageVAT(),true);
	}

	@Test(priority=700640)
	public  static void checkSignOutRecepitsVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		rvp=new ReceiptsVoucherPage(getDriver());
		Assert.assertEquals(rvp.checkSignOutRecepitsVoucher(),true);
	}

	

	
	
}
