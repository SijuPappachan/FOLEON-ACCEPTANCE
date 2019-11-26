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

WebUI.navigateToUrl('https://app-staging.foleon.dev')

// Find an object which was defined already in Object Repository
myPredefinedObject = findTestObject('Object Repository/Page_Foleon/svg_New to Foleon_sc-EHOje eafHZ')

// Create a new object programmatically
myNewObject = new TestObject('Logo')

// Add property to Test Object, a property is defined by:
//	property name,
//	condition type,
//	property value,
//	a boolean value to indicate if the property will be used to identify the object during execution
myNewObject.addProperty('class', ConditionType.EQUALS, 'sc-EHOje eafHZK', true)

//verify element
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Foleon/Logo'), 2)

//close browser
WebUI.closeBrowser()

