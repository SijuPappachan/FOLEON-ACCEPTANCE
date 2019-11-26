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

//click Contact us
WebUI.click(findTestObject('Object Repository/Page_Foleon/a_Contact us'), FailureHandling.STOP_ON_FAILURE)

WS.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

//verify element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/a_FAQ  Support'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/a_Free 7-day trial'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/a_infofoleoncom'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/a_Log in'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/a_Products and title frame'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/a_Resources dropdown grid'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/a_Solution dropdown grid'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/a_Support frame'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/b_By email'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/b_By phone'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/div_1'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/div_1 347 727 6809   New York'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/div_31 (0)20 303 2822   Amsterdam'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/div_44 (0) 203 923 4928  London'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/div__actions'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/div_By phone_flag'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/div_FAQ  support total frame'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/div_London_flag'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/DU a_All resources_hs-skip-lang-url-rewrite'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/h3_Send us a message'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/h3_Ways to contact us'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/h4_Support'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/iframe_concat(id(  drift-widget  ))_drift-widget'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/img'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/img DU'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/img NL'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/input__company'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/input__email'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/input__firstname'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/input__hs-button primary large'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/input_Phone number_phone'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/label_Email address'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/label_First name'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/label_Phone number'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/NL a_All resources_hs-skip-lang-url-rewrite'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/p_By phone'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/p_Got a question or comment Feel free to get in touch'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/p_Got a question or comment Feel free to get in touch (1)'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/p_Read our FAQs or check out our support section'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/p_See all of our support options'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/span_1 347 727 6809'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/span_31 (0)20 303 2822'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/span_Amsterdam'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/span_Email address'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/span_Find out more'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/span_London'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/span_Looking for help'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/span_New York'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/span_We love quality communication'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/span_Would you like to check out our platform or do you need help from support'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/textarea__message'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/UK a_All resources_hs-skip-lang-url-rewrite'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact Us  Foleon/div_logo-fillfillFFFFFF'), 2)

//close child window
WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

//close browser
WebUI.closeBrowser()

