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

WebUI.setText(findTestObject('Object Repository/Page_Foleon/input_Email address_sc-hSdWYo biyAbi'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Foleon/input_Password_sc-hSdWYo biyAbi'), Password)

WebUI.click(findTestObject('Object Repository/Page_Foleon/button_Log in'), FailureHandling.STOP_ON_FAILURE)

//verify element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Foleon/div_The email address or password you entered is incorrect Please try again'), 
    2)

//close browser
WebUI.closeBrowser()

