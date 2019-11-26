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
WebUI.navigateToUrl(' https://app-staging.foleon.dev')

//verify element
WebUI.verifyElementPresent(findTestObject('null'), 2)

WebUI.verifyElementPresent(findTestObject('null'), 2)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

WebUI.verifyElementPresent(findTestObject('null'), 2)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

WebUI.verifyElementPresent(findTestObject('null'), 2)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

WebUI.verifyElementPresent(findTestObject('null'), 2)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

WebUI.verifyElementPresent(findTestObject('null'), 2)

WebUI.verifyElementPresent(findTestObject('null'), 2)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

WebUI.verifyElementPresent(findTestObject('null'), 2)

//Hangle Alerts email as 'a@a'
WebUI.setText(findTestObject('null'), address)

//Clicking on the create account button'
WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

//Hangle Alerts email as 'sijujohn728@gmail.com'
WebUI.setText(findTestObject('null'), email)

//Clicking on the create account button'
WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('null'), 
    2)

//Verify Alerts email as 'a'
WebUI.setText(findTestObject('null'), Email)

//Clicking on the create account button'
WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

//close browser
WebUI.closeBrowser()

