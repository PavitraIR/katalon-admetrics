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

//WebUI.callTestCase(findTestCase('Reusable_Functions/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://dash.admetrics.ai/')
//
//WebUI.setText(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/input_username'), 'moonlyte_admin')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/input_password'), 
//    'scHS/WAFTca3ilHes/WTig==')
//
//WebUI.click(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/li_Performance'))
//
//WebUI.click(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/div_Daily Buyer CAC Report'))
WebUI.verifyElementText(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/div_Items per page'), 
    'Items per page:')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/div_mat-select-arrow-wrapper ng-tns-c109-17'))

WebUI.click(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/div_mat-select-arrow-wrapper ng-tns-c109-17'))

WebUI.click(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/span_10'))

WebUI.click(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/div_mat-select-arrow-wrapper ng-tns-c109-17'))

WebUI.click(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/span_20'))

WebUI.click(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/div_mat-select-arrow-wrapper ng-tns-c109-17'))

WebUI.click(findTestObject('Object Repository/Page_Daily_Buyer_Items_Dropdown_Table2/Page_/span_30'))

