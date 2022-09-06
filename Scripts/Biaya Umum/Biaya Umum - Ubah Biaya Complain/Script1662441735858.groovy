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

WebUI.click(findTestObject('Biaya Umum/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/Action_Btn'))

WebUI.click(findTestObject('Biaya Umum/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/Action_btn_Ubah'))

WebUI.click(findTestObject('Biaya Umum/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/PopUp_Biaya_Complain_DDL_Masalah'))

WebUI.setText(findTestObject('Button Global/input_select2'), Masalah)

WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Biaya Umum/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/PopUp_Biaya_Complain_DDL_Lantai'))

WebUI.setText(findTestObject('Button Global/input_select2'), Lantai)

WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

