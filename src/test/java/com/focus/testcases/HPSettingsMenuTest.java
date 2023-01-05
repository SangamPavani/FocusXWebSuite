package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.HPSettingsMenuPage;
import com.focus.base.BaseEngine;

public class HPSettingsMenuTest extends BaseEngine       
{
	HPSettingsMenuPage HPSMP;

	 @Test(priority=142)
	 public void verifySettingsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPSMP=new HPSettingsMenuPage(getDriver());
		 Assert.assertEquals(HPSettingsMenuPage.checkSettingsMenu(), true);
		
	 }
}
