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

WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/span_Order'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/span_Summary'), 2)
WebUI.delay(3)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/button_Contact us'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/div_Publication group0'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/div_Single publication0'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/button_Single publication'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/button_Publication group'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/div_Total0'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/div_Want more features'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/h3_Want more features'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/h3_0'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/h3_Order summary'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/p_0'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/p_Add projects or single publications to continue'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/p_Youre currently'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/span_Amount due'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/span_Incl 210 VAT 0'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/span_Order'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/span_Summary'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/span_TO SUMMARY'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/strong_Enterprise license'), 2)


//Order - click element
WebUI.click(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/button_Single publication'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/button_Publication group'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
//Order - click element TO SUMMARY
WebUI.click(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/span_TO SUMMARY'), FailureHandling.STOP_ON_FAILURE)


//Billing details - input Billing details elements
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Old License/Page_Store  Foleon/h3_Summary'), 2)


//Billing details - Verify Payment method elements
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/h3_Payment method'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/div_Payment method'), 2)
WebUI.delay(5)
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

//Terms and condition
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
