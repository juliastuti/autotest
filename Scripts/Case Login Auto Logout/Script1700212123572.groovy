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

Mobile.startApplication('/Users/juliastuti/Downloads/app-development-debug (1).apk', true)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Login (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email  Phone Number (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Email  Phone Number (3)'), '08999426953', 
    0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - password (4)'), 'kecubung123', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ScrollView'), 0)

Mobile.scrollToText('resto mamankz')

Mobile.scrollToText('food store')

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - See All'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView -  1650 Amphitheatre Pkwy, Mountain View, CA 94043, USA'), 
    0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.LinearLayout'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView -  -'), 0)

Mobile.closeApplication()

