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
WebUI.navigateToUrl('https://app.foleon.dev')

// Set api override
WebUI.executeJavaScript("localStorage.setItem('X-Api-Override', 'https://api-acceptance.foleon.dev')", null)
WebUI.navigateToUrl('https://api-acceptance.foleon.dev/bodega/order/20324/payment/redirect')

//Reload the page
WebUI.refresh()

WebUI.delay(10)


//Billing details - Verify Payment method elements
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/h3_Payment method'), 2)
WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Store 3 Foleon/div_Payment method'), 2)
WebUI.delay(2)
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

WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Anonymous link/Page_Store  Foleon/button_PAY ORDER'), 2)
WebUI.click(findTestObject('Object Repository/DASHBOARD - Store - Anonymous link/Page_Store  Foleon/button_PAY ORDER'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('DASHBOARD - Store - Essentials/Page_Online transfer/input_Please check your merchant return url_buttonedit'), 2)
WebUI.click(findTestObject('DASHBOARD - Store - Essentials/Page_Online transfer/input_Please check your merchant return url_buttonedit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Anonymous link/Page_Store  Foleon/div_Payment confirmedYour payment has been processed succesfullyYou can safely close this page'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Anonymous link/Page_Store  Foleon/h2_Payment confirmed'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Anonymous link/Page_Store  Foleon/span_You can safely close this page'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/DASHBOARD - Store - Anonymous link/Page_Store  Foleon/span_Your payment has been processed succesfully'), 2)

WebUI.delay(5)

WebUI.closeBrowser()
