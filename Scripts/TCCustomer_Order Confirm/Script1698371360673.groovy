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

Mobile.startApplication('/Users/juliastuti/Downloads/app-development-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button - Login (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Email  Phone Number'), 0)

Mobile.setText(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Email  Phone Number (1)'), 
    '08999426953', 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Password (1)'), 'kecubung123', 
    0)

//Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button - OK'), 0)
//Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - 83119349222'), 0)
//Mobile.setText(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - 83119349222 (1)'), '083119349227', 
//    0)
//Mobile.tap(findTestObject(''), 0)
Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button - Ok'), 0)

//Mobile.scrollToText('Rekomendasi')

//Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Search Product'), 0)

Mobile.setText(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Search Here'), 'iPhone', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject(''), 'serba ada', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.TextView - Category'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.TextView'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button -  Cart'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button - Go to Cart'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.TextView - Rp 12,000,000'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button - Checkout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button -  Add Address'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Pick Location in Maps'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Or search in maps'), 0)

Mobile.setText(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Search'), 'pt timedoor indonesia', 
    0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.TextView - PT.Timedoor Indonesia'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button - Use This Location'), 0)

Mobile.setText(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Title'), 'Kantor', 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Recipient Name'), 0)

Mobile.setText(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Recipient Name (1)'), 'Tester', 
    0)

Mobile.setText(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Phone Number'), '83119349227', 
    0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button - Add'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Address'), 0)

Mobile.setText(findTestObject('Object Repository/Order Confirmation/android.widget.EditText - Address (1)'), 'pt timedoor', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.Button - Add (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Confirmation/android.widget.LinearLayout (2)'), 0)

Mobile.scrollToText('assurance fee')

Mobile.scrollToText('shipment address')

Mobile.pressBack()

Mobile.closeApplication()

Mobile.startApplication('/Users/juliastuti/Downloads/app-development-debug.apk', true)

Mobile.closeApplication()

