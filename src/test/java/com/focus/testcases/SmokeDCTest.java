package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SmokeDCPage;
import com.focus.Pages.DCPage;
import com.focus.Pages.MasterDepartmentPage;
import com.focus.Pages.SmokePreferencesPage;
import com.focus.base.BaseEngine;

public class SmokeDCTest extends BaseEngine
{
	
	//1034---Before Security
	
	//1035---1082 (Create View)
	
	SmokeDCPage dcp;
	
	@Test(priority=1000)
	public void checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		dcp=new SmokeDCPage(getDriver());
	    Assert.assertEquals(dcp.checkLoginCompanyWithValidCredentials(), true);
	   
	}
	
	
    @Test(priority=1001)
	public void verifyDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 dcp=new SmokeDCPage(getDriver());
		 Assert.assertEquals(dcp.checkDocumentCustomization(), true);
	}
	

	@Test(priority=1002)
	public void verifyDocumentCustomizationOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());	
		Assert.assertEquals(dcp.checkDocumentCustomizationOptions(), true);
	}


	
	@Test(priority=1004)
	public void checkCreateNewVoucherOnSelectionOfReceipts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkCreateNewVoucherOnSelectionOfReceipts(), true);
	}
	
	
	@Test(priority=1005)
	public void checkDocumentsTabInReceipts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkDocumentsTabInReceipts(), true);
	}

	@Test(priority=1006)
	public void checkmiscellaneousTabInDCInReceiptNewVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkmiscellaneousTabInDCInReceiptNewVoucher(), true);	
	}
	
	
	@Test(priority=1007)
	public void checkEditLayoutInReceiptsNewVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkEditLayoutInReceiptsNewVoucher(), true);
		
	}
	
	
	@Test(priority=1008)
	public void checkAddFieldOptionsInReceiptsNewVoucherHeaderEditLayout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkAddFieldOptionsInReceiptsNewVoucherHeaderEditLayout(), true);
		
	}
	
	@Test(priority=1009)
	public void checkFieldDetailsTabOptionsEditLayoutHeader() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFieldDetailsTabOptionsEditLayoutHeader(), true);
		
	}
	
	@Test(priority=1010)
	public void checkPropertiesTabOptionsInEditLayoutHeader() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkPropertiesTabOptionsInEditLayoutHeader(), true);
		
	}
	
	@Test(priority=1011)
	public void checkFormattingTabOptionsInEditLayoutHeader() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFormattingTabOptionsInEditLayoutHeader(), true);
		
	}
	
	@Test(priority=1012)
	public void checkRulesTabOptionsInEditLayoutHeader() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkRulesTabOptionsInEditLayoutHeader(), true);
		
	}
	
	@Test(priority=1013)
	public void checkExternalModulesTabOptionsInEditLayoutHeader() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkExternalModulesTabOptionsInEditLayoutHeader(), true);
		
	}
	
	@Test(priority=1014)
	public void checkApplyButtonInEdtitLayoutHeader() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkApplyButtonInEdtitLayoutHeader(), true);
		
	}
	
	
	@Test(priority=1015)
	public void checkEditFieldOptionsInReceiptsNewVoucherHeaderEditLayout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkEditFieldOptionsInReceiptsNewVoucherHeaderEditLayout(), true);
		
	}
	
	@Test(priority=1016)
	public void checkDeleteFieldOptionsInReceiptsNewVoucherHeaderEditLayout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkDeleteFieldOptionsInReceiptsNewVoucherHeaderEditLayout(), true);
		
	}
	
	@Test(priority=1017)
	public void CheckAddFieldInEditLayoutBodyOfReceiptsNewVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.CheckAddFieldInEditLayoutBodyOfReceiptsNewVoucher(), true);
		
	}
	
	@Test(priority=1018)
	public void checkFieldDetailsTabOptionsEditLayoutBody() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFieldDetailsTabOptionsEditLayoutBody(), true);
		
	}
	
	@Test(priority=1019)
	public void checkPropertiesTabOptionsInEditLayoutBody() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkPropertiesTabOptionsInEditLayoutBody(), true);
		
	}
	
	//@Test(priority=1020)//no formatting tab 
	public void checkFormattingTabOptionsInEditLayoutBody() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFormattingTabOptionsInEditLayoutBody(), true);
		
	}
	
	@Test(priority=1021)
	public void checkRulesTabOptionsInEditLayoutBody() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkRulesTabOptionsInEditLayoutBody(), true);
		
	}
	
	@Test(priority=1022)
	public void checkExternalModulesTabOptionsInEditLayoutBody() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkExternalModulesTabOptionsInEditLayoutBody(), true);
		
	}
	
	@Test(priority=1023)
	public void checkApplyButtonInEdtitLayoutBody() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkApplyButtonInEdtitLayoutBody(), true);
		
	}
	
	
	@Test(priority=1024)
	public void checkEditFieldOptionsInReceiptsNewVoucherEditLayoutBody() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkEditFieldOptionsInReceiptsNewVoucherEditLayoutBody(), true);
		
	}
	
	@Test(priority=1025)
	public void checkDeleteFieldOptionsInReceiptsNewVoucherEditLayoutBody() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkDeleteFieldOptionsInReceiptsNewVoucherEditLayoutBody(), true);
		
	}

	
	@Test(priority=1026) // 
	public void checksUpdateButtonInReceiptsNewVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checksUpdateButtonInReceiptsNewVoucher(), true);
		
	}
	
	
	@Test(priority=1027)
	public void checkEditTheReceiptsNewVoucherByDeleteTagOptionInDocumentsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkDeleteTagOptionInDocumentsTab(), true);
		
	}

	
	@Test(priority=1028)
	public void checkLoadMastersOptionInPaymentNewVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkLoadMastersOptionInPaymentNewVoucher(), true);
		
	}
	
	@Test(priority=1029) //
	public void checkVouchersInLoadMastersOfPaymentNewVoucherType() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkVouchersInLoadMastersOfPaymentNewVoucherType(), true);
		
	}
	


	@Test(priority=1030)
	public void checkMiscellaneousTabInPaymentNewVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkmiscellaneousTabInDCInPaymentNewVoucher(), true);
		
	}
	
	@Test(priority=1031)
	public void checkEditLayoutHeaderLoadFieldInPaymentVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkEditLayoutHeaderLoadFieldInPaymentVoucher(), true);	
	}
	

	@Test(priority=1032)
	public void checkEditLayoutBodyLoadFieldInPaymentVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkEditLayoutBodyLoadFieldInPaymentVoucher(), true);	
	}

	
	@Test(priority=1033)
	public void checksUpdateButtonInPaymentsNewVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checksUpdateButtonInPaymentsNewVoucher(), true);	
	}

	
	
	@Test(priority=1034)
	public void checkCreatingNewVoucherInPostDatedRecepits() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkCreatingNewVoucherInPostDatedRecepits(), true);
		
	}
	
	@Test(priority=1035)
	public void checksUpdateButtoInPostDatedReceiptsNewVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checksUpdateButtoInPostDatedReceiptsNewVoucher(), true);
	}
	
	@Test(priority=1036)//
	public void checkCreatingNewVoucherInPostDatedPaymets() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkCreatingNewVoucherInPostDatedPaymets(), true);	
	}

	@Test(priority=1037)
	public void checksUpdateButtoInPostDatedPaymentsNewVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checksUpdateButtoInPostDatedPaymentsNewVoucher(), true);
	}
	
	
    
	@Test(priority=1038)
	public void checkDocumentTagsInPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkDocumentTagsInPurchaseVoucher(), true);
	}
	
	@Test(priority=1039)
	public void checkUpdateStockUncheckInMiscellaneousTabInPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkUpdateStockUncheckInmiscellaneousTabInDCInPurchaseVoucher(), true);
	}
	
	@Test(priority=1040)
	public void checkEditScreenOptionsInPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkEditScreenOptionsInPurchaseVoucher(), true);
	}
		
	
	@Test(priority=1041)
	public void checkAddButtonOptionsInPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkAddButtonOptionsInPurchaseVoucher(), true);
	}
	
	@Test(priority=1042)
	public void checkApplybuttonintheCreationFieldwithEmpty() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkApplybuttonintheCreationFieldwithEmpty(), true);
	}
	
	@Test(priority=1043)
	public void checkApplybuttonintheCreationFieldwithinputingdata() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkApplybuttonintheCreationFieldwithinputingdata(), true);
	}
	
	
	@Test(priority=1044)
	public void checkEditoptionEditScreeninPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkEditoptionEditScreeninPurchaseVoucher(), true);
	}

	
	@Test(priority=1046)
	public void checkDeleteoptionEditscreeninPurchasevoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkDeleteoptionEditscreeninPurchasevoucher(), true);
	}
	
	
	@Test(priority=1047)
	public void checkFooterTabEditScreenInPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFooterTabEditScreenInPurchaseVoucher(), true);
	}
	
	
	@Test(priority=1048)
	public void checkFooterTabOptionsEditScreeninPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFooterTabOptionsEditScreeninPurchaseVoucher(), true);
	}
	
	@Test(priority=1049)
	public void checkFooterTabAddbuttoninEditScreeninPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFooterTabAddbuttoninEditScreeninPurchaseVoucher(), true);
	}
	
	@Test(priority=1050)
	public void checkFooterTabApplybuttonintheCreationField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFooterTabApplybuttonintheCreationField(), true);
	}
	
	@Test(priority=1051)
	public void checkSavingFieldsinFooterTabEditScreeninPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkSavingFieldsinFooterTabEditScreeninPurchaseVoucher(), true);	
	}
		
	
	@Test(priority=1052)
	public void checkEditoptionInFooterTabEditScreeninPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkEditoptionInFooterTabEditScreeninPurchaseVoucher(), true);	
	}
	
	@Test(priority=1053)
	public void checkDeleteoptionInFooterTabEditScreeninPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkDeleteoptionInFooterTabEditScreeninPurchaseVoucher(), true);	
	}
	
	
	@Test(priority=1054)
	public void checkAddFieldFDInFooterField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkAddFieldFDInFooterField(), true);	
	}
	
	@Test(priority=1055)
	public void checkAddFieldRDInBodyaddingField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkAddFieldRDInBodyaddingField(), true);		
	}

	@Test(priority=1056)
	public void checkRatePreloadValue() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkRatePreloadValue(), true);
	}
	
	@Test(priority=1057)
	public void checkBehaviourOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkBehaviourOptions(), true);	
	}
	
	@Test(priority=1058)//not getting po,pt
	public void checkMasterValues() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkMasterValues(), true);		
	}	
	
	@Test(priority=1059)
	public void checkUpdatebuttonInEditScreenOfPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkUpdatebuttonInEditScreenOfPurchaseVoucher(), true);		
	}
	
    @Test(priority=1062)
	public void checkDocumentTagsInMaterialReceiptNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkDocumentTagsInMaterialReceiptNotes(), true);	
	}
	
	@Test(priority=1063)
	public void checkLoadFieldsEditScreenBodyTabMaterialReceiptsNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkLoadFieldsEditScreenBodyTabMaterialReceiptsNotes(), true);	
	}
	
	@Test(priority=1064)
	public void checkClickOnLoadFiledsOptionInEditScreenBodyTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkClickOnLoadFiledsOptionInEditScreenBodyTab(), true);	
	}
	
	@Test(priority=1065) //
	public void checkLoadFieldsDropdownListsInEditScreenBodyTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkLoadFieldsDropdownListsInEditScreenBodyTab(), true);	
	}

	@Test(priority=1066)
	public void checkselectingPurchseVoucherFromLoadFieldsDropdownBodyTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkselectingPurchseVoucherFromLoadFieldsDropdownBodyTab(), true);	
	}
	
	
	@Test(priority=1067)
	public void checkRDBodyFieldInMaterialReceiptNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkRDBodyFieldInMaterialReceiptNotes(), true);	
	}
	
	@Test(priority=1068)
	public void checkFormualaBodyaddingFieldInMaterialReceiptNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFormualaBodyaddingFieldInMaterialReceiptNotes(), true);	
	}
	
	@Test(priority=1069)
	public void checkFooterTabinEditScreenInMaterialReceiptsNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFooterTabinEditScreenInMaterialReceiptsNotes(), true);	
	}
	
	@Test(priority=1070)
	public void checkLoadFieldsinFooterTabinMaterialReceiptsNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkLoadFieldsinFooterTabinMaterialReceiptsNotes(), true);	
	}
	
	
	@Test(priority=1071)
	public void checkLoadFieldOptionsInMaterialreceiptNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkLoadFieldOptionsInMaterialreceiptNotes(), true);	
	}
	
	
	@Test(priority=1072) //
	public void checkLoadFieldsDropdownOptionsinFooterTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkLoadFieldsDropdownOptionsinFooterTab(), true);	
	}
	
	@Test(priority=1073)
	public void checkselectingPurchseVoucherFromLoadFieldsDropdownFooterTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkselectingPurchseVoucherFromLoadFieldsDropdownFooterTab(), true);	
	}
	
	@Test(priority=1074)
	public void checkFDSavingInFooterTabUpdateMaterialReceiptNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkFDSavingInFooterTabUpdateMaterialReceiptNotes(), true);	
	}
    

	@Test(priority=1075)
	public void checkTagsCurrencyAndDueDateOfSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkTagsCurrencyAndDueDateOfSalesInvoice(), true);
	}
	
	
	
	@Test(priority=1076)
	public void checkCreatingNewVoucherPurchaseVoucheVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());		
		Assert.assertEquals(dcp.checkCreatingNewVoucherPurchaseVoucheVAT(), true);	
	}
	
	
	@Test(priority=1077)
	public void checkCreatingNewVoucherSalesInvoiceNew() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherSalesInvoiceNew(), true);
	}
	
	@Test(priority=1078)
	public void checkCreatingNewVoucherSalesInvoicVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherSalesInvoicVAT(), true);
	}
	
	
	@Test(priority=1079)
	public void checkCreatingNewVoucherDebitNotesVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherDebitNotesVAT(), true);
	}
	
	@Test(priority=1080)
	public void checkCreatingNewVoucherCreditNotesVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherCreditNotesVAT(), true);
	}
	
	@Test(priority=1081)
	public void checkOpeningBalanceVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkOpeningBalanceVoucher(), true);
	}
	
	
	@Test(priority=1082)
	public void checkCreatingNewVoucherOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherOpeningBalance(), true);
	}
	
	@Test(priority=1083)
	public void checkopeningStocksVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkopeningStocksVoucher(), true);
	}
	
	
	
	
	@Test(priority=1087)
	public void checkShortageStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkShortageStock(), true);
	}
	
	
	@Test(priority=1089)
	public void checkExcessInStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkExcessInStock(), true);
	}
	
	@Test(priority=1090)
	public void checkCreatingNewVoucherExcessInStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherExcessInStock(), true);
	}
	
	@Test(priority=1091)
	public void checkJournalEnteries() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkJournalEnteries(), true);
	}
	
	
	@Test(priority=1092)
	public void checkCreatingNewVoucherjournalEntries() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherjournalEntries(), true);
	}
		
	@Test(priority=1093)
	public void checkSalesReturnInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkSalesReturnInDocumentCustomization(), true);
	}
	
	
	@Test(priority=1094)
	public void checkPurchaseReturnInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkPurchaseReturnInDocumentCustomization(), true);
	}
	
	
	
	
	@Test(priority=1095)
	public void checkSalesOrderVoucherInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkSalesOrderVoucherInDocumentCustomization(), true);
	}
	
	@Test(priority=1096)
	public void checkEditingTagsMasterSalesOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkEditingTagsMasterSalesOrders(), true);
	}
	
	@Test(priority=1098)
	public void checkCreateNewDocumentintheSalesOrderVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCreateNewDocumentintheSalesOrderVoucher(), true);
	}

	
	
	
	@Test(priority=1100)
	public void checkDeleteDocumentintheSalesInvoiceVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkDeleteDocumentintheSalesInvoiceVoucher(), true);
	}
	
	
	@Test(priority=1101)
	public void checkBudgetOptionsEnableWithSearchOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkBudgetOptionsEnableWithSearchOption(), true);
	}

	
	@Test(priority=1102)
	public void checkCloseAndLogoutTheCompany() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCloseAndLogoutTheCompany(), true);
	}


	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	@Test(priority=1103)
	public void checkAddingFieldsWithDefaultMinimumAndMaximumValuesInPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkAddingFieldsWithDefaultMinimumAndMaximumValuesInPurchaseVoucherVAT(), true);
	}

	@Test(priority=1104)
	public void checkAddingFieldWithhAddToNetDeductStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkAddingFieldWithhAddToNetDeductStock(), true);
	}
	
	@Test(priority=1105)
	public void checkAddingFieldWithAddToNetNotApplicableforAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkAddingFieldWithAddToNetNotApplicableforAddToStock(), true);
	}
	
	
	@Test(priority=1106)
	public void checkAddingFieldsWithDeductAsAddToNetADDAsAddToStockInPvVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkAddingFieldsWithDeductAsAddToNetADDAsAddToStockInPvVAT(), true);
	}
	
	@Test(priority=1107)
	public void checkAddingFieldWithNotApplicableAsAddToNetAddAsAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkAddingFieldWithNotApplicableAsAddToNetAddAsAddToStock(), true);
	}
	
	@Test(priority=1108)
	public void checkAddingFieldsWithDeductAsAddToNetDeductasAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkAddingFieldsWithDeductAsAddToNetDeductasAddToStock(), true);
	}
	
	@Test(priority=1109)
	public void checkAddingFieldWithNotApplicableAsAddToNetNotApplicableAsAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkAddingFieldWithNotApplicableAsAddToNetNotApplicableAsAddToStock(), true);
	}
	
	
	@Test(priority=1110)
	public void CheckAllFieldsInPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.CheckAllFieldsInPurchaseVoucherVAT(), true);
	}
	
	@Test(priority=1111)
	public void checkLedgerReportForAddToNetOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkLedgerReportForAddToNetOption(), true);
	}
	
	
	
	@Test(priority=1112)
	public void checkStockLedgerReportForAddToStockOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkStockLedgerReportForAddToStockOption(), true);
	}
	
	
	
	/*
	@Test(priority=1113)
	public void checkFieldPositionBQ_AddToNetNotApplicableToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkFieldPositionBQ_AddToNetNotApplicableToStock(), true);
	}
	
	
	@Test(priority=1114)
	public void checkFieldPositionBQR_DeductAsAddToNetAddAsAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkFieldPositionBQR_DeductAsAddToNetAddAsAddToStock(), true);
	}
	
	
	
	@Test(priority=1115)
	public void checkFieldPostionBRG_NotApplicableToAddToNetAddToAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkFieldPostionBRG_NotApplicableToAddToNetAddToAddToStock(), true);
	}
	
	
	@Test(priority=1116)
	public void checkFieldPositionAG_DeductAddToNetDeductToAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkFieldPositionAG_DeductAddToNetDeductToAddToStock(), true);
	}
	
	@Test(priority=1117)
	public void checkHiddenPropertyForNotApplicableToAddToNetNotApplicableToAddToStockField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkHiddenPropertyForNotApplicableToAddToNetNotApplicableToAddToStockField(), true);
	}
	
	
	@Test(priority=1118)
	public void checkRestrictMesageAndRestrictFormulaFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkRestrictMesageAndRestrictFormulaFields(), true);
	}
	
	
	@Test(priority=1119)
	public void checkFieldsPositionAndHiddenFieldAndRestrictMessageInPvVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkFieldsPositionAndHiddenFieldInPvVAT(), true);
	}
	*/
	//////Properties
	/*
	@Test(priority=1120)
	public void checkAudiTrailPropertyForCaption_Default_Text() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkAudiTrailPropertyForCaption_Default_Text(), true);
	}
	
	@Test(priority=1121)
	public void checkCannotExportPropertyForAddToNetDeductFromStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCannotExportPropertyForAddToNetDeductFromStock(), true);
	}

	@Test(priority=1122)
	public void checkCannotImportPropertyForAddToNetNotApplicableToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCannotImportPropertyForAddToNetNotApplicableToStock(), true);
	}
	
	@Test(priority=1123)
	public void checkHiddenPropertyForDeductAsAddToNetAddAsAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkHiddenPropertyForDeductAsAddToNetAddAsAddToStock(), true);
	}
	
	@Test(priority=1124)
	public void checkMandatoryPropertyForNotApplicableToAddToNetAddToAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkMandatoryPropertyForNotApplicableToAddToNetAddToAddToStock(), true);
	}
	
	@Test(priority=1125)
	public void checkNotAvailableForReportsForDeductAddToNetDeductToAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkNotAvailableForReportsForDeductAddToNetDeductToAddToStock(), true);
	}
	
	
	@Test(priority=1126)
	public void checkReadOnlyPropertyForNotApplicableToAddToNetNotApplicableToAddToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkReadOnlyPropertyForNotApplicableToAddToNetNotApplicableToAddToStock(), true);
	}
	
	
	@Test(priority=1127)
	public void checkAddedPropertiesForAllFieldsInPvVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkAddedPropertiesForAllFieldsInPvVAT(), true);
	}
	//not available for reports property validation 
	@Test(priority=1128)
	public void checkNotAvailableForReportsForDeductAddToNetDeductToAddToStockInLedger() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkNotAvailableForReportsForDeductAddToNetDeductToAddToStockInLedger(), true);
	}
	
	//cannot import property validation
	@Test(priority=1129)
	public void checkCannotImportPropertyForAddToNetNotApplicableToStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SmokeDCPage(getDriver());
		Assert.assertEquals(dcp.checkCannotImportPropertyForAddToNetNotApplicableToStock(), true);
	}
	*/
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	/*@Test(priority=1036)
	public void checkTagsCurrencyAndDueDateOfPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkTagsCurrencyAndDueDateOfPurchaseVoucher(), true);
	}
	
	
	@Test(priority=1037)
	public void checkRDBodyaddingFieldinPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkRDBodyaddingFieldinPurchaseVoucher(), true);
	}
	
	@Test(priority=1038)
	public void checkSavingFieldsinFooterTabEditScreenPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkSavingFieldsinFooterTabEditScreenPurchaseVoucher(), true);
	}
	
	@Test(priority=1015)
	public void checkTagsCurrencyAndDueDateOfSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkTagsCurrencyAndDueDateOfSalesInvoice(), true);
	}
	
	
	
	@Test(priority=1016)
	public void checkCreatingNewVoucherPurchaseVoucherNew() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherPurchaseVoucherNew(), true);
	}
	
	@Test(priority=1017)
	public void checkCreatingNewVoucherPurchaseVoucheVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherPurchaseVoucheVAT(), true);
	}
	
	/*
	@Test(priority=1018)
	public void checkCreatingNewVoucherPVVATView() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherPVVATView(), true);
	}
	
	@Test(priority=1019)
	public void checkCreatingNewVoucherSalesInvoiceNew() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherSalesInvoiceNew(), true);
	}
	
	@Test(priority=1020)
	public void checkCreatingNewVoucherSalesInvoicVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherSalesInvoicVAT(), true);
	}
	
	@Test(priority=1021)
	public void checkCreatingNewVoucherDebitNotesVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherDebitNotesVAT(), true);
	}
	
	@Test(priority=1022)
	public void checkCreatingNewVoucherCreditNotesVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherCreditNotesVAT(), true);
	}
	
	@Test(priority=1023)
	public void checkOpeningBalanceVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkOpeningBalanceVoucher(), true);
	}
	
	
	@Test(priority=1024)
	public void checkCreatingNewVoucherOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherOpeningBalance(), true);
	}
	
	@Test(priority=1025)
	public void checkopeningStocksVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkopeningStocksVoucher(), true);
	}
	
	@Test(priority=1026)
	public void checkCreatingNewVoucherOpeningStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherOpeningStock(), true);
	}
	
	
	@Test(priority=1027)
	public void checkopeningStocksTransfer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkopeningStocksTransfer(), true);
	}
	
	
	@Test(priority=1028)
	public void checkCreatingNewVoucherStockTransfer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherStockTransfer(), true);
	}
	
	@Test(priority=1029)
	public void checkShortageStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkShortageStock(), true);
	}
	
	@Test(priority=1030)
	public void checkCreatingNewVoucherShortageInStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherShortageInStock(), true);
	}
	
	@Test(priority=1031)
	public void checkExcessInStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkExcessInStock(), true);
	}
	
	
	@Test(priority=1032)
	public void checkCreatingNewVoucherExcessInStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherExcessInStock(), true);
	}
	
	
	@Test(priority=1033)
	public void checkJournalEnteries() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkJournalEnteries(), true);
	}
	
	@Test(priority=1034)
	public void checkCreatingNewVoucherjournalEntries() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherjournalEntries(), true);
	}
		
	@Test(priority=1035)
	public void checkSalesReturnInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkSalesReturnInDocumentCustomization(), true);
	}
	
	
	@Test(priority=1036)
	public void checkPurchaseReturnInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkPurchaseReturnInDocumentCustomization(), true);
	}
		
	@Test(priority=1037)
	public void checkSalesOrderVoucherInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkSalesOrderVoucherInDocumentCustomization(), true);
	}
	
	@Test(priority=1038)
	public void checkEditingTagsMasterSalesOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkEditingTagsMasterSalesOrders(), true);
	}
	
	@Test(priority=1039)
	public void checkCreateNewDocumentintheSalesOrderVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreateNewDocumentintheSalesOrderVoucher(), true);
	}

	
	@Test(priority=1040)
	public void checkCreateDocumentintheSalesInvoiceVoucherASAutoSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCreateDocumentintheSalesInvoiceVoucherASAutoSalesInvoice(), true);
	}
	
	
	@Test(priority=1041)
	public void checkDeleteDocumentintheSalesInvoiceVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkDeleteDocumentintheSalesInvoiceVoucher(), true);
	}
	
	
	@Test(priority=1042)
	public void checkEditingTagsMasterPurchaseOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkEditingTagsMasterPurchaseOrders(), true);
	}
	

	
	@Test(priority=1043)
	public void checkCloseAndLogoutTheCompany() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DocumentCustomizationPage(getDriver());
		Assert.assertEquals(dcp.checkCloseAndLogoutTheCompany(), true);
	}
	
	*/	
	
	
}
