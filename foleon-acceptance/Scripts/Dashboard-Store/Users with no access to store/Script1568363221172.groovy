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
import org.openqa.selenium.Keys as Keys

//open browser
WebUI.openBrowser('')

//maximize window
WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

//navigate URL
WebUI.navigateToUrl('https://app.foleon.dev/')

// Set api override
WebUI.executeJavaScript("localStorage.setItem('X-Api-Override', 'https://api-acceptance.foleon.dev')", null)

//Reload the page
WebUI.refresh()

//verify element/Login

WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Login  Foleon/Password'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Login  Foleon/button_Log in'), 2)

//Login/home
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Login  Foleon/Email address'), EmailAddress)
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Login  Foleon/Password'), Password)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Login  Foleon/button_Log in'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

//verify & click element Account
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Account'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Account'), FailureHandling.STOP_ON_FAILURE)

//verify & click element Store
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Store'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Store'), FailureHandling.STOP_ON_FAILURE)

//verify elements 1 order

WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/button_month'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/button_Publications'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/button_Users'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_1'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_2'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_3'), 2)
WebUI.delay(5)

//Order - click element Pay monthly
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Pay monthly'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Pay monthly'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Pay yearly (2 months free)'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h3_Add extra publications and users'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h3_Order summary'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h3_Get more out of Foleon with our add-ons'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/p_Tailor Foleon to your needs by unlocking powerful additional features'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h5_300 month'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h5_Communcation add-on'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h5_Essentials'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h5_Marketing add-on'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h5_Publications'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h5_Security add-on'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h5_Template Manager'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h5_Total per month'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/h5_Users'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/p_By default, the Essentials license includes 10 publications and 3 users'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/span_Billing details'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/span_Order'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/span_Summary'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/span_TO BILLING DETAILS'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/span_Your monthly plan'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/a_See details'), 2)



//Order - click element TO BILLING DETAILS
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/span_TO BILLING DETAILS'), FailureHandling.STOP_ON_FAILURE)


//Billing details - input Billing details elements
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input'), Country)
WebUI.sendKeys(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input'), Keys.chord(Keys.ENTER, 'Enter key'))
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_Street1'), Street)
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_House number'), HouseNumber)
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_City'), City)
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_Postal code'), PostalCode)
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_State province'), State)
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_Billing name'), BillingName)
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_Billing email'), BillingEmail)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_VAT number'), 2)
WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_KvK number'), KvKNumber)

WebUI.delay(5)
//Billing details - Verify Billing details elements

WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/div_Country'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/div_Essentials'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/div_Pay monthly'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/div_Pay yearly (2 months free)'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/h3_Billing details'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_Billing email'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_Billing name'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/h5_Total per month'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_House number'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_Postal code'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_State province'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/label_Payment method'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/input_City'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/span_Essentials'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/span_Your monthly plan'), 2)

//Billing details - Verify Payment method elements
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/h3_Payment method'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/div_Payment method'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store 2 Foleon/div_Select payment method'), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/div_iDEAL'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/div_iDEAL'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)
WebUI.sendKeys(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/div_Select payment method'), Keys.chord(Keys.ENTER, 'Enter key'))
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/div_Choose bank'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/div_Choose bank'), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/div_Test Issuer'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/div_Test Issuer'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/label_Payment reference  PO number'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/textarea_Payment reference PO number'), 2)
//WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/textarea_Payment reference PO number'), 2)
//WebUI.setText(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/textarea_Payment reference PO number'), Reference)

WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/button_TO SUMMARY'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/button_TO SUMMARY'), FailureHandling.STOP_ON_FAILURE)


WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Online transfer/label_I agree to the Terms and Conditions and Data processing agreement'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Online transfer/label_I hereby authorize Foleon to to debit the chosen payment method for all recurring charges arising from this purchase'), 2)

WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_I agree to the Terms and Conditions and Data processing agreement'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Online transfer/label_I hereby authorize Foleon to to debit the chosen payment method for all recurring charges arising from this purchase'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/button_PLACE ORDER'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/Page_Store  Foleon/button_PLACE ORDER'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Online transfer/input_Please check your merchant return url_buttonedit'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Online transfer/input_Please check your merchant return url_buttonedit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Online transfer/div_Payment confirmedYour payment has been processed successfullyGo to dashboard'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Online transfer/button_Go to dashboard'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Online transfer/button_Go to dashboard'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

//verify & click element Account
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Account'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

//verify & click element Store
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Store'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Store  Foleon/div_Store'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.closeBrowser()
