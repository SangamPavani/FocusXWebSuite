package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.PointOfSalePage;
import com.focus.base.BaseEngine;

public class PointOfSalesTest extends BaseEngine
{

	PointOfSalePage pos;
	
	
	//@Test(priority=1001)
	public void checkLoginForPos() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkLoginForPos(), true);
	}
	
	
	/*
	@Test(priority=1002)
	public void checkLogoutAndLoginAndSaveTagsInConfigureTransactionsAndVouchers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkLogoutAndLoginAndSaveTagsInConfigureTransactionsAndVouchers(), true);
	}
	
	@Test(priority=1003)
	public void checkOpenSettingWizardPageIsOpen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkOpenSettingWizardPageIsOpen(), true);
	}
	
	@Test(priority=1004)
	public void checkPosMenuAndOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPosMenuAndOptions(), true);
	}
	
	
	@Test(priority=1005)
	public void checkSelectingActivateRetailSalesAndUpdate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectingActivateRetailSalesAndUpdate(), true);
	}
	
	@Test(priority=1006)
	public void checkLogoutAndLoginAndpdatedPosSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkLogoutAndLoginAndpdatedPosSettings(), true);
	}
	
	@Test(priority=1007)
	public void checkSaveVatOptionsInSettingsWizard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSaveVatOptionsInSettingsWizard(), true);
	}
	
	
	@Test(priority=1008)
	public void checkSavingPosSettingForUserInCreateUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingPosSettingForUserInCreateUser(), true);
	}
	
	
	
	@Test(priority=1009)
	public void checkupdatedPosSettingForUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkupdatedPosSettingForUser(), true);
	}
	
	@Test(priority=1010)
	public void checkPosMenuOptionsAndSubMenus() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPosMenuOptionsAndSubMenus(), true);
	}
	
	@Test(priority=1011)
	public void checkDefaultMemberAndOptionsAvailable() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDefaultMemberAndOptionsAvailable(), true);
	}
	
	@Test(priority=1012)
	public void checkNewOptionInMemberAndCheckMandateMessageOnSavingNewMember() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkNewOptionInMemberAndCheckMandateMessageOnSavingNewMember(), true);
	}
	
	@Test(priority=1013)
	public void checkSavingMemberTypeOnClickingMemberTypeLabel() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingMemberTypeOnClickingMemberTypeLabel(), true);
	}
	
	@Test(priority=1014)
	public void checkSavedMemberTypeAndCheckSavingMember() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedMemberTypeAndCheckSavingMember(), true);
	}
	
	@Test(priority=1015)
	public void checkSavedMemberAndEditingMember() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedMemberAndEditingMember(), true);
	}
	
	@Test(priority=1016)
	public void checkUpdatedMemberAndSaveMemberUsingCloneOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedMemberAndSaveMemberUsingCloneOption(), true);
	}
	
	@Test(priority=1017)
	public void checkDeleteMemberAndClose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDeleteMemberAndClose(), true);
	}
	
	
	// outlet
	
	
	@Test(priority=1018)
	public void checkOutletHomePageOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkOutletHomePageOptions(), true);
	}
	
	
	
	@Test(priority=1019)
	public void checkNewOptionInOutletAndAvailableFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkNewOptionInOutletAndAvailableFields(), true);
	}
	
	
	@Test(priority=1020)
	public void checkSavingOutletWithAllMandateFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingOutletWithAllMandateFields(), true);
	}
	
	@Test(priority=1021)
	public void checkSavedOutletAndEditingOutlet() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedOutletAndEditingOutlet(), true);
	}
	
	@Test(priority=1022)
	public void checkUpdatedOutletAndSaveoutletUsingCloneOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedOutletAndSaveoutletUsingCloneOption(), true);
	}
	
	@Test(priority=1023)
	public void checkDeleteOutletAndClose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDeleteOutletAndClose(), true);
	}
	
	
	
	
	
	// Counter
	
	
	
	
	@Test(priority=1024)
	public void checkCounterHomePageOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCounterHomePageOptions(), true);
	}
	
	
	@Test(priority=1025)
	public void checkNewOptionInCounterAndAvailableFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkNewOptionInCounterAndAvailableFields(), true);
	}
	
	@Test(priority=1026)
	public void checkSavingCounterWithAllMandateFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingCounterWithAllMandateFields(), true);
	}
	
	@Test(priority=1027)
	public void checkSavedCounterAndEditingCounter() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedCounterAndEditingCounter(), true);
	}
	
	@Test(priority=1028)
	public void checkUpdatedCounterAndSaveCounterUsingCloneOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedCounterAndSaveCounterUsingCloneOption(), true);
	}
	
	
	@Test(priority=1029)
	public void checkDeleteCounterAndClose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDeleteCounterAndClose(), true);
	}
	
	// Designation
	
	@Test(priority=1030)
	public void checkDesignationHomePageOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDesignationHomePageOptions(), true);
	}
	
	@Test(priority=1031)
	public void checkNewOptionInDesignationAndAvailableFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkNewOptionInDesignationAndAvailableFields(), true);
	}
	
	@Test(priority=1032)
	public void checkSavingDesignationWithAllMandateFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingDesignationWithAllMandateFields(), true);
	}
	
	@Test(priority=1033)
	public void checkSavedDesignationAndEditingDesignation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedDesignationAndEditingDesignation(), true);
	}
	
	@Test(priority=1034)
	public void checkUpdatedDesignationAndSaveDesignationUsingCloneOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedDesignationAndSaveDesignationUsingCloneOption(), true);
	}
	
	@Test(priority=1035)
	public void checkDeleteDesignationAndClose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDeleteDesignationAndClose(), true);
	}
	
	
	
	// Employee
	
	

	@Test(priority=1036)
	public void checkEmployeeHomePageOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkEmployeeHomePageOptions(), true);
	}
	
	@Test(priority=1037)
	public void checkNewOptionInEmployeeAndAvailableFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkNewOptionInEmployeeAndAvailableFields(), true);
	}
	
	@Test(priority=1038) 
	public void checkSavingEmployeeWithAllMandateFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingEmployeeWithAllMandateFields(), true);
	}
	
	@Test(priority=1039) // 
	public void checkSavedEmployeeAndEditingEmployee() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedEmployeeAndEditingEmployee(), true);
	}
	
	
	@Test(priority=1040)
	public void checkUpdatedEmployeeAndSaveEmployeeUsingCloneOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedEmployeeAndSaveEmployeeUsingCloneOption(), true);
	}
	
	@Test(priority=1041)
	public void checkDeleteEmployeeAndClose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDeleteEmployeeAndClose(), true);
	}
	
	// Bank Card Type
	
	@Test(priority=1042)
	public void checkBankCardTypeHomePageOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkBankCardTypeHomePageOptions(), true);
	}
	
	@Test(priority=1043)
	public void checkNewOptionInBankCardTypeAndAvailableFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkNewOptionInBankCardTypeAndAvailableFields(), true);
	}
	
	@Test(priority=1044)
	public void checkSavingBankCardWithAllMandateFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingBankCardWithAllMandateFields(), true);
	}
	
	@Test(priority=1045)
	public void checkSavedCardTypeAndEditingCardType() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedCardTypeAndEditingCardType(), true);
	}
	
	
	@Test(priority=1046)
	public void checkUpdatedCardTypeAndSaveCardTypeUsingCloneOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedCardTypeAndSaveCardTypeUsingCloneOption(), true);
	}
	
	@Test(priority=1047)
	public void checkSaveCardTypeAsDebitUsingHomeCloneOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSaveCardTypeAsDebitUsingHomeCloneOption(), true);
	}
	
	@Test(priority=1048)
	public void checkDeleteCardTypeAndClose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDeleteCardTypeAndClose(), true);
	}
	

	// Pos Menu
	
	@Test(priority=1049)
	public void verifyPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPointOfSaleMenu(), true);
	}
	 
	@Test(priority=1050)
	public void verifyMainScreenMenuPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkMainScreenMenuInPointOfSaleMenu(), true);
	}
	 
	@Test(priority=1051)
	public void verifyPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPOSReportsMenuInPointOfSaleMenu(), true);
	}
	 
	 
	@Test(priority=1052)
	public void verifyRetailSalesReportMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkRetailSalesReportsMenuInPosReReportsMenu(), true);
	}
	 
	@Test(priority=1053)
	public void verifySummarySalesReportMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSummarySalesReportsMenuInPosReReportsMenu(), true);
	}
	 
	@Test(priority=1054)
	public void verifyPreOrderReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPreOrderReportsMenuInPosReReportsMenu(), true);
	}
	 
	@Test(priority=1055)
	public void verifyPreOrderPaymentReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPreOrderPaymentReportsMenuInPosReReportsMenu(), true);
	}

	@Test(priority=1056)
	public void verifyMemberReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkMemberReportsMenuInPosReReportsMenu(), true);
	}
	 
	@Test(priority=1057)
	public void verifyMemberPointsReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkMemberPointsReportsMenuInPosReReportsMenu(), true);
	}
	 
	 
	@Test(priority=1058)
	public void verifyItemReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkItemReportsMenuInPosReReportsMenu(), true);
	}
	 
	@Test(priority=1059)
	public void verifyCashReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCashReportsMenuInPosReReportsMenu(), true);
	}
	 
	@Test(priority=1060)
	public void verifyStockReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkStockReportsMenuInPosReReportsMenu(), true);
	}


	@Test(priority=1061)
	public void verifyPerodicSalesReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPreodicSalesReportsMenuInPosReReportsMenu(), true);
	}
	
	@Test(priority=1062)
	public void verifyLastYearComparisonReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkLastYearCompraisonReportsMenuInPosReReportsMenu(), true);
	}
	 
	 
	@Test(priority=1063)
	public void verifyMiscellenousReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkMiscellaneousReportsMenuInPosReReportsMenu(), true);
	}
	
	@Test(priority=1064)
	public void verifyRestaurantReportsMenuInPOSReportsMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkResturantReportsMenuInPosReReportsMenu(), true);
	}
	 
	@Test(priority=1065)
	public void verifyUtilitiesMenuInPointOfSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUtilitiesMenuInPointOfSaleMenu(), true);
	}
	

	
	
	
	
	
	// Pos/Utilities/Preferenes
	
	
	
	@Test(priority=1066)
	public void checkPreferencesMenuInPointOfSaleMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPreferencesMenuInPointOfSaleMenu(), true);
	}
	 
	
	
	
	@Test(priority=1067)
	public void checkOutLetInPointOfSalePreferencesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkOutLetInPointOfSalePreferencesMenu(), true);
	}
	
	
	

	@Test(priority=1068)
	public void checkSavingOutletSettingsInPosPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingOutletSettingsInPosPreferences(), true);
	}
	
	@Test(priority=1069)
	public void checkMiscellaneousInPointOfSalePreferencesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkMiscellaneousInPointOfSalePreferencesMenu(), true);
	}
	
	@Test(priority=1070)
	public void checkSavingMiscellaneousSettingsInPosPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingMiscellaneousSettingsInPosPreferences(), true);
	}
	
	
	
	
	
	
	
	
	@Test(priority=1071)
	public void checkAccountInPointOfSalePreferencesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkAccountInPointOfSalePreferencesMenu(), true);
	}
	
	
	@Test(priority=1072) // 
	public void checkComboBoxFiledsOfEachAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkComboBoxFiledsOfEachAccount(), true);
	}
	
	
	@Test(priority=1073)
	public void checkSavingAccountSettingsInPosPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingAccountSettingsInPosPreferences(), true);
	}
	
	@Test(priority=1074) //
	public void checkSavedAccountsInPointOfSalePreferencesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedAccountsInPointOfSalePreferencesMenu(), true);
	}
	
	// Posting
	
	@Test(priority=1075)
	public void checkPostingInPointOfSalePreferencesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPostingInPointOfSalePreferencesMenu(), true);
	}
	
	@Test(priority=1076)
	public void checkSavingPostingVoucherInPosPreference() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingPostingVoucherInPosPreference(), true);
	}
	
	@Test(priority=1077)
	public void checkSavedPostingInPointOfSalePreferencesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedPostingInPointOfSalePreferencesMenu(), true);
	}
	
	
	
	// Print Formats

	@Test(priority=1078)
	public void checkPosPrintLayoutMenuInPointOfSaleMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPosPrintLayoutMenuInPointOfSaleMenu(), true);
	}
	
	@Test(priority=1079)
	public void checkSavingPosPrintLayoutFormats() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingPosPrintLayoutFormats(), true);
	}
	
	@Test(priority=1080)
	public void checkSavedPrintFormatsOfOutlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedPrintFormatsOfOutlet(), true);
	}
	
	
	// Payments
	 
	@Test(priority=1081)
	public void checkPosPaymentstMenuInPointOfSaleMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPosPaymentstMenuInPointOfSaleMenu(), true);
	}
	
	@Test(priority=1082)
	public void checkSavingPosPayments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingPosPayments(), true);
	}
	
	@Test(priority=1083)
	public void checkSavedPaymentsOfOutlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedPaymentsOfOutlet(), true);
	}
	  
	  
	  
	  
	  
	 

	
	// Pos Customization
	
	
	@Test(priority=1084)
	public void checkPosCustomizationMenuInPointOfSaleMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPosCustomizationMenuInPointOfSaleMenu(), true);
	}
	
	
	@Test(priority=1085) // Header List Vat is Not available
	public void checkPosCustomizationScreenOnCreatingTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPosCustomizationScreenOnCreatingTemplate(), true);
	}
	
	
	@Test(priority=1086)
	public void checkPosAddCustomizationAddShortcutsAndAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPosAddCustomizationAddShortcutsAndAddGroup(), true);
	}
	
	
	@Test(priority=1087)
	public void checkAddingShortCutToCustomizationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkAddingShortCutToCustomizationPage(), true);
	}
	
	
	@Test(priority=1088)
	public void checkImpotingOfPosCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkImpotingOfPosCustomization(), true);
	}
	
	
	@Test(priority=1089)
	public void checkSavedImportedTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedImportedTemplate(), true);
	}
		
	
		
	
	
	//  Voucher
	
	
	@Test(priority=2000)
	public void checkOpeningStocksNewVoucherSaveWithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkOpeningStocksNewVoucherSaveWithBatchItem(), true);
	}
	
	
	@Test(priority=2001)
	public void checkPosScreenOnLoginWithUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPosScreenOnLoginWithUser(), true);
	}
	
	
	@Test(priority=2002)
	public void checkSelectingItemAndSeletingBatchInBatchPopUp() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectingItemAndSeletingBatchInBatchPopUp(), true);
	}
	
	@Test(priority=2003)
	public void checkBatchPopUPValuesAfterClickOnPickOnFifo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkBatchPopUPValuesAfterClickOnPickOnFifo(), true);
	}
	
	@Test(priority=2004)
	public void checkOkInBatchPopUpAndChangeRateofItemAndClickOK() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkOkInBatchPopUpAndChangeRateofItemAndClickOK(), true);
	}
	
	@Test(priority=2005)
	public void checkMemberOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkMemberOptions(), true);
	}
	
	@Test(priority=2006)
	public void checkSelectingMember() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectingMember(), true);
	}
	
	@Test(priority=2007)
	public void checkEmployeeOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkEmployeeOptions(), true);
	}
	
	@Test(priority=2008)
	public void checkSelectingEmployee() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectingEmployee(), true);
	}
	
	@Test(priority=2009)
	public void checkFunctionsOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkFunctionsOptions(), true);
	}
	
	@Test(priority=2010)
	public void checkSelectingBillSettlemtAndItsOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectingBillSettlemtAndItsOptions(), true);
	}
	
	@Test(priority=2011)
	public void checkSelectingCashAndPrintBill() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectingCashAndPrintBill(), true);
	}
	
	@Test(priority=2012)
	public void checkDayEndTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDayEndTab(), true);
	}
	

	@Test(priority=2013)
	public void checkVouchersWhichArePosted() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkVouchersWhichArePosted(), true);
	}
	
	
	
	//Sales Return 
	@Test(priority=2014)
	public void checkOptionsUnderSalesReturn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkOptionsUnderSalesReturn(), true);
	}


	@Test(priority=2015)
	public void checkPOSSalesReturnByReceiptHomePageOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPOSSalesReturnByReceiptHomePageOptions(), true);
	}
	
	
	@Test(priority=2016)
	public void checkLoadingFieldsInSalesReturnPopUpScreenOnSelectingBillNo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkLoadingFieldsInSalesReturnPopUpScreenOnSelectingBillNo(), true);
	}
	
	
	@Test(priority=2017)
	public void checkEnteringAmountinSalesReturnInGridAndClickOnPayButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkEnteringAmountinSalesReturnInGridAndClickOnPayButton(), true);
	}
	
	@Test(priority=2018)
	public void checkCashTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCashTabOptions(), true);
	}
	
	@Test(priority=2019)
	public void checkGiftVoucherTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkGiftVoucherTabOptions(), true);
	}
	
	@Test(priority=2020)
	public void checkCreditNoteTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCreditNoteTabOptions(), true);
	}
	
	@Test(priority=2021)
	public void checkPayWithCashInSalesRetuenByRecepit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPayWithCashInSalesRetuenByRecepit(), true);
	}
	
	
	
	@Test(priority=2022)
	public void checkSalesReturnByMemberHomePageOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSalesReturnByMemberHomePageOptions(), true);
	}
	
	
	@Test(priority=2023) // Optional Control Issue
	public void checkSelectingMemeberNameInSalesReturnByMember() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectingMemeberNameInSalesReturnByMember(), true);
	}
	
	@Test(priority=2024)
	public void checkreprintSalesReturnHomePageOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkreprintSalesReturnHomePageOptions(), true);
	}
	
	@Test(priority=2025)
	public void checkReprintSalesReturnScreenByBillNumRadioBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkReprintSalesReturnScreenByBillNumRadioBtn(), true);
	}
	
	
	@Test(priority=2026)
	public void checkReprintSalesReturnScreenByMemberNameRadioBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkReprintSalesReturnScreenByMemberNameRadioBtn(), true);
	}
	
	@Test(priority=2027)
	public void checkReprintSalesReturnScreenByBillDateRadioBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkReprintSalesReturnScreenByBillDateRadioBtn(), true);
	}
	
	@Test(priority=2028)
	public void checkReprintSalesReturnScreenByBetweenDateRadioBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkReprintSalesReturnScreenByBetweenDateRadioBtn(), true);
	}
	
	@Test(priority=2029)
	public void checkReprintSalesReturnScreenBySalesMan() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkReprintSalesReturnScreenBySalesMan(), true);
	}
	
	@Test(priority=2030)
	public void checkPrintAndPrintLastBillOptionsInRepruntSalesReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPrintAndPrintLastBillOptionsInRepruntSalesReturns(), true);
	}
	

	@Test(priority=2031)
	public void checkSelectItemByNameInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectItemByNameInPosScreen(), true);
	}
	
	@Test(priority=2032)
	public void checkSelectItemByAliasInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectItemByAliasInPosScreen(), true);
	}
	
	
	@Test(priority=2033) //
	public void checkAdvanceSearchItemInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkAdvanceSearchItemInPosScreen(), true);
	}
	
	@Test(priority=2034)
	public void checkCreateItemInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCreateItemInPosScreen(), true);
	}
	
	
	
	@Test(priority=2035)
	public void checkSavedItemInSelectItemByNameInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedItemInSelectItemByNameInPosScreen(), true);
	}
	
	@Test(priority=2036)
	public void checkViewItemInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkViewItemInPosScreen(), true);
	}
	
	@Test(priority=2037)
	public void checkEditItemInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkEditItemInPosScreen(), true);
	}
	
	
	@Test(priority=2038)
	public void checkUpdatedItemInSelectItemByAliasInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedItemInSelectItemByAliasInPosScreen(), true);
	}
	
	@Test(priority=2039)
	public void checkAddItemCommentInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkAddItemCommentInPosScreen(), true);
	}
	
	
	@Test(priority=2040)
	public void checkSchemeListRelatedToTheSelectedItemInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSchemeListRelatedToTheSelectedItemInPosScreen(), true);
	}
	
	@Test(priority=2041)
	public void checkItemQueryInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkItemQueryInPosScreen(), true);
	}
	
	@Test(priority=2042)
	public void checkSelectMemberByNameInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectMemberByNameInPosScreen(), true);
	}
	
	@Test(priority=2043)
	public void checkSelectMemberByTelepohoneInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectMemberByTelepohoneInPosScreen(), true);
	}
	
	@Test(priority=2044)
	public void checkSelectMemberByBarCodeCardInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectMemberByBarCodeCardInPosScreen(), true);
	}
	
	@Test(priority=2045) //
	public void checkAdvanceSearchMemberInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkAdvanceSearchMemberInPosScreen(), true);
	}
	
	@Test(priority=2046)
	public void checkCreateMemberInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCreateMemberInPosScreen(), true);
	}
	
	@Test(priority=2047)
	public void checkCreatedMemberThroughSelectMemberByNameInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCreatedMemberThroughSelectMemberByNameInPosScreen(), true);
	}
	
	@Test(priority=2048)
	public void checkClearMemberInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkClearMemberInPosScreen(), true);
	}
	
	@Test(priority=2049)
	public void checkCreatedMemberThroughSelectMemberByTelephoneInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCreatedMemberThroughSelectMemberByTelephoneInPosScreen(), true);
	}
	
	@Test(priority=2050)
	public void checkViewMemberInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkViewMemberInPosScreen(), true);
	}
	
	@Test(priority=2051)
	public void checkEditMemberInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkEditMemberInPosScreen(), true);
	}
	
	
	
	@Test(priority=2052)
	public void checkSelectEmployeeyCodeInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectEmployeeyCodeInPosScreen(), true);
	}
	
	
	
	@Test(priority=2053)
	public void checkSelectEmployeeByBarCodeCardInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectEmployeeByBarCodeCardInPosScreen(), true);
	}
	
	@Test(priority=2054)
	public void checkClearEmployeeInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkClearEmployeeInPosScreen(), true);
	}
	
	
	
	@Test(priority=2055)
	public void checkSelectEmployeebyAliasInPosScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectEmployeebyAliasInPosScreen(), true);
	}
	
	
	@Test(priority=2056)
	public void checkSavingCounter2AndOutlet2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingCounter2AndOutlet2(), true);
	}
	
	
	@Test(priority=2057)
	public void checkGiftVoucherDefinitionHomePageOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkGiftVoucherDefinitionHomePageOptions(), true);
	}
	
	@Test(priority=2058)
	public void checkNewOptionInGiftVoucherDefintionAndAvailableFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkNewOptionInGiftVoucherDefintionAndAvailableFields(), true);
	}
	
	@Test(priority=2059)
	public void checkSavingGiftVoucherDefinitionWithAllMandateFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingGiftVoucherDefinitionWithAllMandateFields(), true);
	}

	@Test(priority=2060)
	public void checkSavedGiftVoucherDefinitionAndEditing() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedGiftVoucherDefinitionAndEditing(), true);
	}

	@Test(priority=2061)
	public void checkUpdatedGiftVoucherDefintionAndSaveGVDUsingCloneOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedGiftVoucherDefintionAndSaveGVDUsingCloneOption(), true);
	}

	@Test(priority=2062)
	public void checkSaveGVDThroughMasterCloneOptionAndDeleteGiftVoucherDefintion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSaveGVDThroughMasterCloneOptionAndDeleteGiftVoucherDefintion(), true);
	}
	
	@Test(priority=2063)
	public void checkGiftVoucherRegistrationHomePageOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkGiftVoucherRegistrationHomePageOptions(), true);
	}
	

	@Test(priority=2064)
	public void checkSavingExternalGiftVoucherRegistration() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingExternalGiftVoucherRegistration(), true);
	}
	
	@Test(priority=2065)
	public void checkSavedGiftVoucherRegistration() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedGiftVoucherRegistration(), true);
	}
	
	@Test(priority=2066)
	public void checkClearOptionGiftVoucherRegistration() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkClearOptionGiftVoucherRegistration(), true);
	}
	
	@Test(priority=2067)
	public void checkSavingInteralGiftVoucherRegistration() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingInteralGiftVoucherRegistration(), true);
	}
	
	
	// Discount Voucher
	
	@Test(priority=2068)
	public void checkDiscountVoucherDefinitionHomePageOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDiscountVoucherDefinitionHomePageOptions(), true);
	}
	
	
	@Test(priority=2069)
	public void checkNewOptionInDiscountVoucherDefintionAndAvailableFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkNewOptionInDiscountVoucherDefintionAndAvailableFields(), true);
	}
	

	@Test(priority=2070)
	public void checkSavingDiscountVoucherDefinitionWithAllMandateFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingDiscountVoucherDefinitionWithAllMandateFields(), true);
	}
	
	@Test(priority=2071)
	public void checkSavedDiscountVoucherDefinitionAndEditing() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedDiscountVoucherDefinitionAndEditing(), true);
	}
	
	@Test(priority=2072)
	public void checkUpdateDiscountVoucherDefintionAndSaveGVDUsingCloneOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdateDiscountVoucherDefintionAndSaveGVDUsingCloneOption(), true);
	}
	
	@Test(priority=2073)
	public void checkDeleteDiscountVoucherDefintion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDeleteDiscountVoucherDefintion(), true);
	}
	
	@Test(priority=2074)
	public void checkSavingDVDVoucherWithRedeemableOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingDVDVoucherWithRedeemableOption(), true);
	}
	
	
	
	@Test(priority=2075)
	public void checkDiscountVoucherRegistrationHomePageOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDiscountVoucherRegistrationHomePageOptions(), true);
	}
	
	@Test(priority=2076)
	public void checkSavingVoucherDiscountVoucherRegistration() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingVoucherDiscountVoucherRegistration(), true);
	}
	
	@Test(priority=2077)//Issue Outlet IS Not Displaying 
	public void checkSavedDiscountVoucherRegistration() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedDiscountVoucherRegistration(), true);
	}
	
	
	@Test(priority=2078)
	public void checkClearOptionDiscountVoucherRegistration() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkClearOptionDiscountVoucherRegistration(), true);
	}
	
	@Test(priority=2079)
	public void checkSavingDiscountVoucherRegistration() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingDiscountVoucherRegistration(), true);
	}
	
	

	
	@Test(priority=2080)
	public void checkSavingPosPaymentsAsGiftVoucherAndDiscountVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingPosPaymentsAsGiftVoucherAndDiscountVoucher(), true);
	}
	
	
	@Test(priority=2081)
	public void checkSelectItemMemberAndEmployee() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectItemMemberAndEmployee(), true);
	}
	
	
	@Test(priority=2082)
	public void checkTaskOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkTaskOptions(), true);
	}
	
	@Test(priority=2083)
	public void checkCashInThroughCounter() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCashInThroughCounter(), true);
	}
	
	@Test(priority=2084)
	public void checkCashInThroughAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCashInThroughAccount(), true);
	}

	@Test(priority=2085)
	public void checkCashOutThroughCounter() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCashOutThroughCounter(), true);
	}
	
	@Test(priority=2086)
	public void checkCashOutThroughAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCashOutThroughAccount(), true);
	}
	
	
	@Test(priority=2087)
	public void checkCashCollection() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCashCollection(), true);
	}
	
	

	@Test(priority=2088)
	public void checkReprintReceiptBill() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkReprintReceiptBill(), true);
	}
	
	@Test(priority=2089)
	public void checkOpenDayInShortCut() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkOpenDayInShortCut(), true);
	}
	
	@Test(priority=2090)
	public void checkCloseDayEndShortCut() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkCloseDayEndShortCut(), true);
	}
	
	@Test(priority=2091)
	public void checkReprintDayEndShortCut() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkReprintDayEndShortCut(), true);
	}
	
	@Test(priority=2092)
	public void checkGiftVoucherTransferShortCut() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkGiftVoucherTransferShortCut(), true);
	}
	
	@Test(priority=2093)
	public void checkSavingGiftVoucherInTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingGiftVoucherInTransfer(), true);
	}
	
	@Test(priority=2094)
	public void checkGiftVoucherSalesShortCut() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkGiftVoucherSalesShortCut(), true);
	}
	
	@Test(priority=2095)
	public void checkLoadingGiftVoucherInternalForMember() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkLoadingGiftVoucherInternalForMember(), true);
	}
	
	@Test(priority=2096)
	public void checkClickOnAddGiftVoucherInternalForMember() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkClickOnAddGiftVoucherInternalForMember(), true);
	}
	
	@Test(priority=2097)
	public void checkSelectingCreditCardAndCheckBillDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectingCreditCardAndCheckBillDetails(), true);
	}
	
	@Test(priority=2098)
	public void checkSelectingHDFCCreditCardAndCheckBillDetailsAfterSelecting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectingHDFCCreditCardAndCheckBillDetailsAfterSelecting(), true);
	}
	
	
	@Test(priority=2099)
	public void checkGiftVouhcerRedemption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkGiftVouhcerRedemption(), true);
	}
	
	@Test(priority=2100)
	public void checkPaymentMethodAsCreditCard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPaymentMethodAsCreditCard(), true);
	}
	
	@Test(priority=2101)
	public void checkSelectItemMemberAndEmployeeForDiscountSale() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSelectItemMemberAndEmployeeForDiscountSale(), true);
	}
	
	@Test(priority=2102)
	public void checkPaymentMethodAsDebitCard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPaymentMethodAsDebitCard(), true);
	}
	
	
	
	
	//epayments
	/*
	@Test(priority=2103)
	public void checkEPaymentHomePageOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkEPaymentHomePageOptions(), true);
	}
	
	@Test(priority=2104)
	public void checkNewOptionInEPaymentAndAvailableFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkNewOptionInEPaymentAndAvailableFields(), true);
	}
	
	@Test(priority=2105)
	public void checkSavingEpaymemtWithAllMandateFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingEpaymemtWithAllMandateFields(), true);
	}
	
	@Test(priority=2106)
	public void checkSavedEpaymentVoucherAndEditing() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedEpaymentVoucherAndEditing(), true);
	}
	
	@Test(priority=2107)
	public void checkUpdatedEpaymentAndSaveGVDUsingCloneOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedEpaymentAndSaveGVDUsingCloneOption(), true);
	}
	
	@Test(priority=2108)
	public void checkDeleteEGooglePayToDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDeleteEGooglePayToDelete(), true);
	}
	
	
	@Test(priority=2109)
	public void checkSavingEpaymemtAsPhonePay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingEpaymemtAsPhonePay(), true);
	}
		
		
	//Preorder
	
	@Test(priority=2110)
	public void checkPreorderUnderPreference() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPreorderUnderPreference(), true);
	}
	
	
	@Test(priority=2111)
	public void checkOptionsUnderSPreOrderUnderPOS() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkOptionsUnderSPreOrderUnderPOS(), true);
	}
	

	@Test(priority=2112)
	public void checkPreorderScreenOptionsWithItemAndMemberAndEmoployeeInPOS() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPreorderScreenOptionsWithItemAndMemberAndEmoployeeInPOS(), true);
	}
	
	@Test(priority=2113)
	public void checkPreorderScreenOptionsWithFunctionInPOS() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPreorderScreenOptionsWithFunctionInPOS(), true);
	}
	
	@Test(priority=2114)
	public void checkPosPreOrderEnqirey() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPosPreOrderEnqirey(), true);
	}
	
	
	@Test(priority=2115)
	public void checkPOSPreOrderEditBeforeCollected() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPOSPreOrderEditBeforeCollected(), true);
	}
	
	@Test(priority=2116)
	public void checkPOSPreOrderViewOrderBeforeCollection() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPOSPreOrderViewOrderBeforeCollection(), true);
	}
	
	@Test(priority=2117)
	public void checkPOSPreOrderCollection() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPOSPreOrderCollection(), true);
	}
	
	@Test(priority=2118)
	public void checkPOSPreOrderCollectionromPreOrderEnquirey() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPOSPreOrderCollectionromPreOrderEnquirey(), true);
	}
	
	@Test(priority=2119)
	public void checkPOSPreOrderCollectionPaymentScreenWithEPayment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPOSPreOrderCollectionPaymentScreenWithEPayment(), true);
	}
	
	@Test(priority=2120)
	public void checkPosBillSettlementScreenAfterClickOnPayBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPosBillSettlementScreenAfterClickOnPayBtn(), true);
	}
	*/
	
	//Scheme Starts From Here 
	/*
		@Test(priority=2110)
		public void checkSchemeMenuInMasters() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkSchemeMenuInMasters(), true);
		}
		
		@Test(priority=2111)
		public void checkSchemeHomePageOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkSchemeHomePageOptions(), true);
		}
		
		
		@Test(priority=2112)
		public void checkAddingSchemeInSchcmeScreenInPOSWithschemeWithOnBillDiscAmt() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingSchemeInSchcmeScreenInPOSWithschemeWithOnBillDiscAmt(), true);
		}
		
		@Test(priority=2113)
		public void checkAddingSchemeWithOnBillDiscPercentage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingSchemeWithOnBillDiscPercentage(), true);
		}
		
		@Test(priority=2114)
		public void checkAddingSchemeWithCombinationOfValueAndQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingSchemeWithCombinationOfValueAndQty(), true);
		}
		
		@Test(priority=2115)
		public void checkAddingSchemeWithFixedRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingSchemeWithFixedRate(), true);
		}
		
		@Test(priority=2116)
		public void checkAddingSchemeWithDiscountVouchersAndClickOnSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingSchemeWithDiscountVouchersAndClickOnSave(), true);
		}
		
		
		@Test(priority=2118)
		public void checkAddingSchemeInSchcmeScreenInPOSWithschemeWithOnItemDiscAmt() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingSchemeInSchcmeScreenInPOSWithschemeWithOnItemDiscAmt(), true);
		}
		
		@Test(priority=2119)
		public void checkAddingSchemeWithOnItemDiscPercentage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingSchemeWithOnItemDiscPercentage(), true);
		}
		
		@Test(priority=2120)
		public void checkAddingSchemeWithCombinationOfValueAndQtyOnItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingSchemeWithCombinationOfValueAndQtyOnItem(), true);
		}
		
		@Test(priority=2121)
		public void checkAddingSchemeWithFixedRateONItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingSchemeWithFixedRateONItem(), true);
		}
		
		@Test(priority=2122)
		public void checkAddingSchemeWithDiscountVouchersAndClickOnSaveOnItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingSchemeWithDiscountVouchersAndClickOnSaveOnItem(), true);
		}

		
		@Test(priority=2123)
		public void checkSavedSchemeWithOnItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkSavedSchemeWithOnItem(), true);
		}
		
		
		@Test(priority=2124)//Expected 
		public void checkEditOptionInScheme() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkEditOptionInScheme(), true);
		}
		
		
		@Test(priority=2125)
		public void checkCloneOptionInScheme() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkCloneOptionInScheme(), true);
		}
		
		@Test(priority=2126)
		public void checkDeleteOptionInScheme() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkDeleteOptionInScheme(), true);
		}
		
		
		@Test(priority=2127)
		public void checkFreeItemSchemeInMasters() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkFreeItemSchemeInMasters(), true);
		}
		

		@Test(priority=2128)
		public void checkAddingFreeItemSchemeWithDisAmt5Of1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingFreeItemSchemeWithDisAmt5Of1(), true);
		}
		
		@Test(priority=2129)
		public void checkAddingFreeItemSchemeWithDisPercentage10Of1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingFreeItemSchemeWithDisPercentage10Of1(), true);
		}
		
		@Test(priority=2130)
		public void checkAddingFreeItemSchemeWithFreeItem15Of5() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingFreeItemSchemeWithFreeItem15Of5(), true);
		}
		
		@Test(priority=2131)
		public void checkAddingFreeItemSchemeWithFixedRate20Of1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			pos=new PointOfSalePage(getDriver());
			Assert.assertEquals(pos.checkAddingFreeItemSchemeWithFixedRate20Of1(), true);
		}
		
	// Payment Discount
	
	@Test(priority=2121)
	public void checkDiscountDefintionseMenuInMasters() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDiscountDefintionseMenuInMasters(), true);
	}
	
	@Test(priority=2122)
	public void checkPaymentDiscountHomePageOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkPaymentDiscountHomePageOptions(), true);
	}
	
	@Test(priority=2123)
	public void checkSavingPaymentDiscountWithDifferentDiscountTypesOnBill() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingPaymentDiscountWithDifferentDiscountTypesOnBill(), true);
	}
	
	@Test(priority=2124)
	public void checkSavedPaymentDiscountOnBillAndUpdateIt() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedPaymentDiscountOnBillAndUpdateIt(), true);
	}
	
	@Test(priority=2125)
	public void checkUpdatedPaymentDiscountOnBillAndCheckClearOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedPaymentDiscountOnBillAndCheckClearOption(), true);
	}
	
	
	@Test(priority=2126)
	public void checkSavingPaymentDiscountWithDifferentDiscountTypesOnItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingPaymentDiscountWithDifferentDiscountTypesOnItem(), true);
	}
	
	@Test(priority=2127)
	public void checkSavedPaymentDiscountOnItemAndUpdateIt() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavedPaymentDiscountOnItemAndUpdateIt(), true);
	}
	

	
	@Test(priority=2128)
	public void checkUpdatedPaymentDiscountOnItemAndCheckClearOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkUpdatedPaymentDiscountOnItemAndCheckClearOption(), true);
	}
	
	@Test(priority=2129)
	public void checkSavingPaymentDiscountToDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingPaymentDiscountToDelete(), true);
	}
	
	@Test(priority=2130)
	public void checkDeletingPaymentDiscountToDeleteAndClose() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkDeletingPaymentDiscountToDeleteAndClose(), true);
	}
	
	*/
	//  Memeber Discount
		
	@Test(priority=2131)
	public void checkHomePageOptionsInMemberDiscount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkHomePageOptionsInMemberDiscount(), true);
	}
	
	
	@Test(priority=2132) // Mandatory Field
	public void checkAddingMemberDiscountTypeOnBillWithGoldenType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkAddingMemberDiscountTypeOnBillWithGoldenType(), true);
	}
	
	@Test(priority=2134) // Mandatory Field
	public void checkAddingMemberDiscountTypeOnBillWithSilverType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkAddingMemberDiscountTypeOnBillWithSilverType(), true);
	}
	
	
	@Test(priority=2135)
	public void checkAddingMemberDiscountTypeOnItemWithGoldenType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkAddingMemberDiscountTypeOnItemWithGoldenType(), true);
	}
	
	@Test(priority=2136)
	public void checkAddingMemberDiscountTypeOnItemWithSilverType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkAddingMemberDiscountTypeOnItemWithSilverType(), true);
	}
		

	//Employe Discount
	
	@Test(priority=2140)
	public void checkHomePageOptionsInEmployeeDiscount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkHomePageOptionsInEmployeeDiscount(), true);
	}
	
	
	@Test(priority=2141)
	public void chechAddingEmplyeeTypeSalesManOnBill() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.chechAddingEmplyeeTypeSalesManOnBill(), true);
	}
	
	@Test(priority=2142)
	public void chechAddingEmployeeTypeSalesGirlOnBill() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.chechAddingEmployeeTypeSalesGirlOnBill(), true);
	}
		
	@Test(priority=2143)
	public void checkSavingSchemeOnItemOfEmplyeDiscount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pos=new PointOfSalePage(getDriver());
		Assert.assertEquals(pos.checkSavingSchemeOnItemOfEmplyeDiscount(), true);
	}
	
	
	
	
}
