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

//WebUI.click(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/li_Performance'))
//WebUI.click(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/div_Daily Buyer CAC Report'))
WebUI.verifyElementText(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/h2_Project By Channel Source'), 
    'Project By Channel Source')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/h2_Project By Channel Source'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/div_Date'), 'Date')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/div_Date'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/div_Day'), 'Day')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/div_Day'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/div_GoogleCPC'), 'Google/CPC')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/th_GoogleCPC'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/div_Others'), 'Others')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/div_Others'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/div_Grand Total'), 'Grand Total')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Daily_Buyer_CAC_Table2/Page_/div_Grand Total'), 0)

