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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(sitename)

WebUI.setText(findTestObject('Object Repository/shoprepo/Page_Marketing Automation - test uycia form_d640cb/input_Podaj imi_mauticformimie'), 
    imie)

WebUI.setText(findTestObject('Object Repository/shoprepo/Page_Marketing Automation - test uycia form_d640cb/input_Podaj nazwisko_mauticformnazwisko'), 
    nazwisko)

WebUI.setText(findTestObject('Object Repository/shoprepo/Page_Marketing Automation - test uycia form_d640cb/input_imi.nazwiskosubowy-adres.pl_mauticformemail'), 
    email)

WebUI.setText(findTestObject('Object Repository/shoprepo/Page_Marketing Automation - test uycia form_d640cb/input_Temat_mauticformtemat'), 
    temat)

WebUI.setText(findTestObject('Object Repository/shoprepo/Page_Marketing Automation - test uycia form_d640cb/textarea_Wiadomo_mauticformwiadomosc'), 
    message)

WebUI.verifyElementPresent(findTestObject('shoprepo/Page_Marketing Automation - test uycia form_d640cb/button_Wylij'), 0)

WebUI.click(findTestObject('Object Repository/shoprepo/Page_Marketing Automation - test uycia form_d640cb/button_Wylij'))

WebUI.closeBrowser()

