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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev-dash.admetrics.ai/')

WebUI.setText(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/input_User ID_username'), 
    'alter_admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/input_Password_password'), 
    'aZDBbEeiyZYuLxOJ3QXc3Q==')

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/li_Performance Report'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Key Driver Performance'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Month_mat-sort-header-stem ng-tns-c98-9'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Month_mat-sort-header-stem ng-tns-c98-9'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Month_mat-sort-header-stem ng-tns-c98-9_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Impressions_mat-sort-header-arrow ng-tr_f979a5'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Impressions_mat-sort-header-arrow ng-tr_f979a5'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Impressions_mat-sort-header-arrow ng-tr_f979a5_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Clicks_mat-sort-header-stem ng-tns-c98-11'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Clicks_mat-sort-header-arrow ng-trigger_3fc29a'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Clicks_mat-sort-header-arrow ng-trigger_3fc29a_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_CTR_mat-sort-header-arrow ng-trigger ng_483f55'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_CTR_mat-sort-header-arrow ng-trigger ng_483f55'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_CTR_mat-sort-header-arrow ng-trigger ng_483f55_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Avg CPC_mat-sort-header-stem ng-tns-c98-13'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Avg CPC_mat-sort-header-stem ng-tns-c98-13'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Avg CPC_mat-sort-header-stem ng-tns-c98-13_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Conversions_mat-sort-header-arrow ng-tr_3a2914'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Conversions_mat-sort-header-stem ng-tns-c98-14'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Conversions_mat-sort-header-stem ng-tns-c98-14_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Conv Rate_mat-sort-header-arrow ng-trig_e55fce'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Conv Rate'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Conv Rate'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_CostConv_mat-sort-header-stem ng-tns-c98-16'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_CostConv_mat-sort-header-pointer-right _d88ed8'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_CostConv_mat-sort-header-pointer-right _d88ed8_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Costs_mat-sort-header-arrow ng-trigger _d40272'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Costs_mat-sort-header-arrow ng-trigger _d40272'))

WebUI.click(findTestObject('Object Repository/Page_Alter_key_Table_Ascending_Decending/Page_/div_Costs_mat-sort-header-arrow ng-trigger _d40272_1'))

WebUI.closeBrowser()

