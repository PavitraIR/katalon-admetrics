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

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Menu/Page_/img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Menu/Page_/span_admetrics'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Menu/Page_/span_admetrics'), 'admetrics')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Menu/Page_/div_spinner diagonal part-2'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/div_spinner diagonal part-2'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Menu/Page_/span_Spend Report'), 'Spend Report')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Menu/Page_/span_Spend Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Menu/Page_/span_Spend Monitoring'), 'Spend Monitoring')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Menu/Page_/span_Spend Monitoring'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Menu/Page_/span_Performance'), 'Performance')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Menu/Page_/span_Performance'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Menu/Page_/span_Campaign'), 'Campaign')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Menu/Page_/span_Campaign'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/div_spinner diagonal part-2_1'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/li_Spend Monitoring'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/div_spinner horizontal'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/div_spinner diagonal part-2_1'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/li_Performance'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/div_RespMenuIcon'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/label_sidebarIconToggle'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/label_sidebarIconToggle_1'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/li_Campaign'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/div_spinner horizontal'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/label_sidebarIconToggle_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Menu/Page_/i_signOut'))

WebUI.click(findTestObject('Object Repository/Page_Menu/Page_/i_signOut'))

WebUI.delay(2)

