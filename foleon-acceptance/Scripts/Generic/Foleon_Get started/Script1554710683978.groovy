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

WebUI.openBrowser('')

//maximize window
WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

//navigate URL
WebUI.navigateToUrl('https://app-staging.foleon.dev')

// Set api override
WebUI.executeJavaScript("localStorage.setItem('X-Api-Override', 'https://api-bart.foleon.dev')", null)

//verify element
WebUI.verifyElementPresent(findTestObject('null'), 2)

WebUI.verifyElementPresent(findTestObject('null'), 2)

WebUI.setText(findTestObject('null'), fieldemail)

WebUI.setText(findTestObject('null'), fieldpassword)

WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Page_Create account2 - Foleon/span_Back'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

//verify element
WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/button_2Get started'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/button_Design'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/button_I work for an agency'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/button_Marketing  Communications'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/button_Other'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/button_Sales'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_1'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_1About you'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_2'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_2Get started'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Continue'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_First name'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_First nameLast nameCompany nameBusiness phone number'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Tell us a bit about yourse'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Tell us a bit about yourselfPlease answer a few questions so we can help you get started on the right foot1About you2Get started'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_1'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_2'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Design'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Get started'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_How do you currently present content'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_I work for an agency'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_In what industry are you active'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Marketing  Communications'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_'), 2)

WebUI.click(findTestObject('Page_Create account2 - Foleon/span_'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Pick one'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Publisher'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Construction  Real Estate'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Healthcare'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Government'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Education Management'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Retail'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Travel'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Automotive'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Non Profit  NGO'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Business services'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Other'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Sales'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Student'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_IT'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Other'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Union  Association'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_What department are you a part of'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Your contact details'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Non Profit  NGO'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Other'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Other software'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_PDFs'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Pick one'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Print'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Publisher'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Retail'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Student'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Education Management'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Automotive'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Business services'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Construction  Real Estate'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Government'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Healthcare'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_I dont currently present content'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_IT'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Marketing  CommunicationsSalesDesignI work for an agencyOther'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/span_Agency'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_Agency'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Create account2 - Foleon/div_My website'), 2)

//close browser
WebUI.closeBrowser()

