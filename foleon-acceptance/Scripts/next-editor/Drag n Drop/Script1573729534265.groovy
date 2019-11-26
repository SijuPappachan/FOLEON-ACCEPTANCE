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
WebUI.navigateToUrl('https://next-staging.foleon.dev/publication/71762/pages/719147')

// Set api override
WebUI.executeJavaScript("localStorage.setItem('X-Api-Override', 'https://api-acceptance.foleon.dev')", null)
WebUI.executeJavaScript("localStorage.setItem('X-EN-ACCESS-TOKEN', '162d64021b1ffea0329183fa04f4f990ab02596b')", null)

//Reload the page
WebUI.refresh()

WebUI.delay(3)
//verify element/Elements
WebUI.verifyElementPresent(findTestObject('Object Repository/next-editor/div_ElementsDrag'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/next-editor/div_COLUMN'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/next-editor/div_Elements'), 2)
WebUI.click(findTestObject('next-editor/div_Elements'), FailureHandling.STOP_ON_FAILURE)


//select elements & dnd
WebUI.verifyElementPresent(findTestObject('Object Repository/next-editor/div_Divider'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/next-editor/div_Social'), 2)
WebUI.delay(5)

//Use the dragAndDropObjectToObject keyword to perform the drag and drop action
WebUI.click(findTestObject('Object Repository/next-editor/div_Divider'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3)
WebUI.dragAndDropToObject(findTestObject('Object Repository/next-editor/div_Divider'), findTestObject('Object Repository/next-editor/div_COLUMN'))
WebUI.delay(5)
WebUI.click(findTestObject('next-editor/div_Elements'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/next-editor/div_Social'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
WebUI.dragAndDropToObject(findTestObject('Object Repository/next-editor/div_Social'), findTestObject('Object Repository/next-editor/div_COLUMN'))
WebUI.delay(5)
WebUI.click(findTestObject('next-editor/div_Elements'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/next-editor/div_Divider'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
WebUI.dragAndDropToObject(findTestObject('Object Repository/next-editor/div_Divider'), findTestObject('Object Repository/next-editor/div_COLUMN'))
WebUI.delay(5)
WebUI.click(findTestObject('next-editor/div_Elements'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/next-editor/div_Divider'), FailureHandling.STOP_ON_FAILURE)
WebUI.dragAndDropToObject(findTestObject('Object Repository/next-editor/div_Divider'), findTestObject('Object Repository/next-editor/div_Social'))
WebUI.delay(5)
WebUI.click(findTestObject('next-editor/div_Elements'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/next-editor/div_Divider'), FailureHandling.STOP_ON_FAILURE)
WebUI.dragAndDropToObject(findTestObject('Object Repository/next-editor/div_Divider'), findTestObject('Object Repository/next-editor/div_COLUMN'))
WebUI.delay(5)
WebUI.click(findTestObject('next-editor/div_Elements'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/next-editor/div_Divider'), FailureHandling.STOP_ON_FAILURE)
WebUI.dragAndDropToObject(findTestObject('Object Repository/next-editor/div_Divider'), findTestObject('Object Repository/next-editor/div_Social'))
WebUI.delay(5)

//WebUI.dragAndDropToObject(findTestObject('Object Repository/next-editor/div_Social'),findTestObject('Object Repository/next-editor/div_COLUMN'))
//Verify if it is actually changed to "Dropped!" because of the drag and drop action.
//WebUI.verifyEqual(droppable_text, 'An extraordinary title')

//Clean up the testing environment by closing the browser
//WebUI.closeBrowser()