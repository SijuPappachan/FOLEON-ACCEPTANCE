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
WebUI.click(findTestObject('Object Repository/Page_Foleon/span_Forgot password'), FailureHandling.STOP_ON_FAILURE)

//verify dashboard after click
WebUI.verifyLinksAccessible(['https://app-staging.foleon.dev/forgot-password'])

//verify element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/a_Contact us'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/button_send mail'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/div_Any questionsContact us'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/div_Email address'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/div_Email address_sc-bwzfXH sc-htpNat dnBLRv'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Forgot password  Foleon/div_Forgot your passwordEnter your email'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/div_Forgot your password frame'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/div_Forgot your password frame'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/div_Go back'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/div_New to FoleonStart a free trial'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/h2_Forgot your password'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/input_Email address_sc-fBuWsC kJDrms'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/p_Any questions'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/span_Enter your email address and well get you back on track'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/span_Go back'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Forgot password  Foleon/span_v20272'), 2)

//close browser
WebUI.closeBrowser()

