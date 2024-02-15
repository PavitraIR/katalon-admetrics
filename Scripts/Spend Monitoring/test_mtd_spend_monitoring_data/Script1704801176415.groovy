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

//WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/li_Spend Monitoring'))
//WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_MTD Spend Monitoring'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/h1_0'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_achievement'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_achievement'), '% achievement')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/p_MTD Spend Prorated'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/p_MTD Spend Prorated'), 'MTD Spend Prorated')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_Items per page'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_Items per page'), 'Items per page:')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow-wrapper ng-tns-c110-12'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow ng-tns-c110-12'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_20'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow-wrapper ng-tns-c110-12'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_10'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow-wrapper ng-tns-c110-12'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_5'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow-wrapper ng-tns-c110-12'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_30'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/p_Monthly Spend Vs Target'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/p_Monthly Spend Vs Target'), 
    'Monthly Spend Vs Target')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_Items per page'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_Items per page'), 'Items per page:')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow ng-tns-c110-14'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow ng-tns-c110-14'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_20'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow-wrapper ng-tns-c110-14'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_10'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow-wrapper ng-tns-c110-14'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_5'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow ng-tns-c110-14'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_30'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/p_MTD Spend Vs Target by Channel'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/p_MTD Spend Vs Target by Channel'), 
    'MTD Spend Vs Target by Channel')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_Items per page'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_Items per page'), 'Items per page:')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow-wrapper ng-tns-c110-10'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow-wrapper ng-tns-c110-10'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_20'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow ng-tns-c110-10'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_10'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow-wrapper ng-tns-c110-10'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_5'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/div_mat-select-arrow ng-tns-c110-10'))

WebUI.click(findTestObject('Object Repository/Page_MTD_Spend_Monitoring_Data/Page_/span_30'))

