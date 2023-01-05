package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.HPQualityControlMenuPage;
import com.focus.base.BaseEngine;


public class HPQualityControlMenuTest  extends BaseEngine
{
	
	HPQualityControlMenuPage HPQCMP;

	 @Test(priority=140)
	 public void verifyQualityControlMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPQCMP=new HPQualityControlMenuPage(getDriver());
		 Assert.assertEquals(HPQualityControlMenuPage.checkQualityConrolMenu(), true);
		
	 }
	
	 @Test(priority=141)
	 public void verifyTransactionMenuInQualityControlMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPQCMP=new HPQualityControlMenuPage(getDriver());
		 Assert.assertEquals(HPQualityControlMenuPage.checkTransactioMenuInQualityConrolMenu(), true);
		
	 }
	 
	 
}
