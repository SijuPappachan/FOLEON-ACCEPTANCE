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
WebUI.navigateToUrl('https://editor.foleon.dev/create-account')

// Set api override
WebUI.executeJavaScript('localStorage.setItem(\'X-Api-Override\', \'https://api-staging.foleon.dev\')', null)

//Reload the page
WebUI.refresh()

//verify element/Step 1
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/logo'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/a_privacy policy'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/button_Create account'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/button_Log in here'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/div_Already have an accountLog in here'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/div_Business email'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/h1_Try Foleon free for 7 days'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/input_Business email_email'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/input_Password_password'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/span_Already have an accountLog in here'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/span_Business email'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/button_Create account'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/span_Foleon will not share your data for commercial use Check our privacy policy'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/span_Get occasional blog updates and other inspirational emails'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/span_Get product-related news and features'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/span_Password'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account1 - Foleon/span_Log in here'), 2)

//Create Account/Step 1
WebUI.setText(findTestObject('Object Repository/Page_Create account1 - Foleon/input_Business email_email'), BusinessEmail)

WebUI.setText(findTestObject('Object Repository/Page_Create account1 - Foleon/input_Password_password'), Password)

WebUI.click(findTestObject('Object Repository/Page_Create account1 - Foleon/button_Create account'), FailureHandling.STOP_ON_FAILURE)

//Verify account
//WebUI.navigateToUrl('https://app-staging.foleon.dev/verify/')
//WebUI.navigateToUrl('https://app-staging.foleon.dev/verify/fe15751628f4a2f7c820429fb07b2c0f')
//SetText/Create Account/Step 2

WebUI.delay (10)

WebUI.setText(findTestObject('Object Repository/Page_Create account2 - Foleon/input_First name_firstName'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page_Create account2 - Foleon/input_Last name_lastName'), LastName)

WebUI.setText(findTestObject('Object Repository/Page_Create account2 - Foleon/input_Company name_companyName'), CompanyName)

WebUI.setText(findTestObject('Object Repository/Page_Create account2 - Foleon/input_Business phone number_phoneNumber'), PhoneNumber)

//verify element/Step 2b
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/span_How do you currently present content'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/span_In what industry are you active'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/span_What department are you a part of'), 
    2)

//verify element/Step 2c
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_Marketing  Communications'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_Sales'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_Design'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_I work for an agency'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_Other'), 2)

//Click element /Step 2c
WebUI.click(findTestObject('Object Repository/Page_Create account2 - Foleon/button_Marketing  Communications'), FailureHandling.STOP_ON_FAILURE)

//verify element/Step 2d
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_PDFs'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_Print'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_PDFs'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_My website'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_Other software'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_I dont currently present content'), 
    2)

//Click element /Step 2d
WebUI.click(findTestObject('Object Repository/Page_Create account2 - Foleon/button_I dont currently present content'), FailureHandling.STOP_ON_FAILURE)

//Click element /Step 2e
WebUI.click(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Pick one'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

//verify element/Step 2e
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Pick one'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Agency'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Publisher'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Construction  Real Estate'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Government'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Education Management'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Retail'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Travel'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Healthcare'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Automotive'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Non Profit  NGO'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Union  Association'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Business services'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Student'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_IT'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Other'), 2)

//Click element /Step 2e sub
WebUI.click(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Agency'), FailureHandling.STOP_ON_FAILURE)

//verify element/Step 2f
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create account2 - Foleon/button_Continue'), 2)

//Click element /Step 2e
WebUI.click(findTestObject('Object Repository/Page_Create account2 - Foleon/button_Continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

//Click start from scratch /Step 2g
WebUI.click(findTestObject('Object Repository/Page_Create account2 - Foleon/div_Start from scratch'), FailureHandling.STOP_ON_FAILURE)

//Click start from scratch /Step 2h
WebUI.click(findTestObject('Object Repository/Page_Create account2 - Foleon/button_Get started'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(12)

WebUI.closeBrowser()

