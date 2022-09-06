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

WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

'//==>Pilih Loginnya menggunakan User apa'
CustomKeywords.'mypackage.userLogin.Login_Implementor'()

'//==>Pilih Menu apa yang mau dipakai'
CustomKeywords.'mypackage.userForm.BiayaUmum'()

WebUI.click(findTestObject('Button Global/a_Tambah Baru'))

WebUI.click(findTestObject('Biaya Umum/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/DDL_Nama_Vendor'))

WebUI.setText(findTestObject('Button Global/input_select2'), Nama_Vendor)

WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Biaya Umum/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/DDL_Item'))

WebUI.setText(findTestObject('Button Global/input_select2'), Item)

WebUI.click(findTestObject('Object Repository/Button Global/Select2 Result'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Biaya Umum/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/input_Volume'), Volume)

WebUI.setText(findTestObject('Biaya Umum/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/input_Unit Price'), Unit_Price)

WebUI.setText(findTestObject('Biaya Umum/Page_TOTAL - CONSTRUCTION INTEGRATED SYSTEM/input_Keterangan'), Keterangan)

WebUI.click(findTestObject('Button Global/btn_Save'))

WebUI.click(findTestObject('Button Global/btn_Kembali'))

