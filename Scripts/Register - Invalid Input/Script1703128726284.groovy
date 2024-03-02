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

Mobile.startApplication('/Users/juliastuti/Downloads/mahaputra.apk', true)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Skip Login'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Register'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Register (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Name'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Name (1)'), '12345', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Phone Number'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Phone Number (1)'), '899942688888', 
    0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Password'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.LinearLayout (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Password (1)'), 'passw', 0)

Mobile.scrollToText('empty')

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Password Confirmation'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Password Confirmation (1)'), 'password', 
    0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Register (2)'), 0)

Mobile.closeApplication()

