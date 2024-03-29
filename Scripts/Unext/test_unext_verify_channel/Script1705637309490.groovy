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

//WebUI.callTestCase(findTestCase('Unext/test_verify_unext_login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Page_Unext_Verify_Channel/Page_/li_Campaign Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Unext_Verify_Channel/Page_/div_Select Channel'), 'Select Channel')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Unext_Verify_Channel/Page_/span_ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Page_Unext_Verify_Channel/Page_/span_ng-arrow-wrapper'))

options = findTestObject('Object Repository/Page_Channel_Dropdown_Verify/Page_/span_ng-arrow-wrapper')

if (options) {
    println('Options are present in the unext channel dropdown')
} else {
    println('No options found in the unext channel dropdown')
}

WebUI.click(findTestObject('Object Repository/Page_Unext_Verify_Channel/Page_/span_ng-arrow-wrapper'))

