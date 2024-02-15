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

WebUI.setText(findTestObject('Object Repository/Page_Alter_Verify_Navigating_Campaign_Report/Page_/input_User ID_username'), 
    'alter_admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Alter_Verify_Navigating_Campaign_Report/Page_/input_Password_password'), 
    'aZDBbEeiyZYuLxOJ3QXc3Q==')

WebUI.click(findTestObject('Object Repository/Page_Alter_Verify_Navigating_Campaign_Report/Page_/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Alter_Verify_Navigating_Campaign_Report/Page_/li_Campaign Report'))

WebUI.click(findTestObject('Object Repository/Page_Alter_Verify_Navigating_Campaign_Report/Page_/li_Campaign Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Alter_Verify_Navigating_Campaign_Report/Page_/p_Campaign View'), 
    'Campaign View')

WebUI.closeBrowser()
