package mypackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class userLogin {
	
	@Keyword
	public static void Login_Officer(){
		'Login Officer.Trial'
		WebUI.setText(findTestObject('Object Repository/Login/Page_ LOGIN/input_username'), findTestData("LoginData").getValue(1, 4))

		WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_ LOGIN/input_password'),findTestData("LoginData").getValue(2, 4))

		WebUI.click(findTestObject('Object Repository/Login/Page_ LOGIN/Btn_Login'))
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'), 10)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'), 2)

		WebUI.click(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'))

		WebUI.setText(findTestObject('Object Repository/Button Global/input select2'), '707')

		WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForPageLoad(5)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'), 2)

		WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))

		WebUI.click(findTestObject('Object Repository/Login/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/Menu_Procurement'))

		WebUI.click(findTestObject('Object Repository/Login/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/Menu_eTender'))
	}
}
