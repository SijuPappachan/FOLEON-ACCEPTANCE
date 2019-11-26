import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//open browser
WebUI.openBrowser('')

//maximize window
WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

//navigate URL
WebUI.navigateToUrl('https://app-staging.foleon.dev')

//click button
WebUI.click(findTestObject('Page_Foleon/button_Start a free trial'), FailureHandling.STOP_ON_FAILURE)

//verify element

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/logo'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/a_privacy policy'), 2)

WebUI.verifyElementPresent(findTestObject('null'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/button_Log in here'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/div_Already have an accountLog in here'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/div_Business email'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/h1_Try Foleon free for 7 days'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/input_Business email_email'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/input_Password_password'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/span_Already have an accountLog in here'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/span_Business email'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/span_Create account'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/span_Foleon will not share your data for commercial use Check our privacy policy'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/span_Get occasional blog updates and other inspirational emails'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/span_Get product-related news and features'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/span_Password'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account1 - Foleon/span_Log in here'), 2)

//close browser
WebUI.closeBrowser()

