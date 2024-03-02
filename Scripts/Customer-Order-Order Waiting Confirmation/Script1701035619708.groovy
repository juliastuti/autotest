import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startApplication('/Users/juliastuti/Downloads/app-development-debug.apk', true)

Mobile.waitForElementPresent(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.EditText - Email  Phone Number'), 30)

Mobile.tap(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.EditText - Email  Phone Number'), 
    0)

Mobile.setText(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.EditText - Email  Phone Number (1)'), 
    '8999426953', 0)

//Mobile.setText(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.EditText - 83119349227'), 
//    '8999426953', 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.EditText - Password'), 
    0)

Mobile.setText(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.EditText - Password (1)'), 
    'kecubung123', 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.Button - Login (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.LinearLayout'), 0)

Mobile.scrollToText('see all resto')

Mobile.tap(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.LinearLayout (1)'), 0)

Mobile.pressBack()

//Mobile.tap(findTestObject(''), 0)
Mobile.tap(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Order Confirmation - address too far/android.widget.FrameLayout'), 0)

//Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.Button - Add'), 30)

Mobile.tap(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.Button - Add'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.FrameLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation - address too far/android.widget.LinearLayout (2)'), 0)

Mobile.closeApplication()
