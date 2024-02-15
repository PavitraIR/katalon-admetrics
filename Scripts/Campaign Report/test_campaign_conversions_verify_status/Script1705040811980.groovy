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

//WebUI.click(findTestObject('Object Repository/Page_Campaign_Conversions_Verify_Status/Page_/li_Campaign'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Campaign_Conversions_Verify_Status/Page_/div_Select Campaign Status'), 
    'Select Campaign Status')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Campaign_Conversions_Verify_Status/Page_/div_Select Campaign Status'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Campaign_Conversions_Verify_Status/Page_/span_ng-arrow-wrapper'))

WebUI.callTestCase(findTestCase('Reusable_Functions/Campaign_status_dropdown_verify'), [:], FailureHandling.CONTINUE_ON_FAILURE)

