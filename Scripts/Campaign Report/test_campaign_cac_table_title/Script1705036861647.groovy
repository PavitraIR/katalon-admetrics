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
//
//WebUI.click(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/li_Campaign'))
//
//WebUI.click(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/svg_mat-datepicker-toggle-default-icon ng-s_f1b13c'))
//
//WebUI.click(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/button_mat-focus-indicator mat-calendar-pre_09dfc7'))
//
//WebUI.click(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_1'))
//
//WebUI.click(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_30'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/h2_Campaign CAC'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/h2_Campaign CAC'), 'Campaign CAC')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_Date'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_Date'), 'Date')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_Campaign Name'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_Campaign Name'), 'Campaign Name')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_Campaign Spend'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_Campaign Spend'), 'Campaign Spend')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_No Conversion'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_No Conversion'), 'No Conversion')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_Campaign CAC'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Campaign_CAC_Table_Title/Page_/div_Campaign CAC'), 'Campaign CAC')

