import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testcis.totalbp.com/login/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login/Page_LOGIN/input_username'), 'officer.trial')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_LOGIN/input_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Object Repository/Login/Page_LOGIN/btnLogin'))

WebUI.click(findTestObject('Object Repository/Button Global/Main_Kode_Proyek'))

WebUI.setText(findTestObject('null'), 
    '707')

WebUI.sendKeys(findTestObject('null'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Button Global/Hide_UnHide_Menu'))

WebUI.setText(findTestObject('Object Repository/Button Global/input_Menu_Search'), 
    'Kontrak Vendor')

WebUI.click(findTestObject('Object Repository/Button Global/span_Procurement'))

WebUI.click(findTestObject('Object Repository/Button Global/span_Tender'))

WebUI.click(findTestObject('Object Repository/Button Global/span_BiayaUmum'))

WebUI.click(findTestObject('Object Repository/Button Global/UserAccount'))

WebUI.click(findTestObject('Object Repository/Button Global/LogOut'))

