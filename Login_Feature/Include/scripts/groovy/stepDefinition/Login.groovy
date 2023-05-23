package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.eclipse.osgi.internal.hooks.EclipseLazyStarter

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.Then
import cucumber.api.java.en.And
import internal.GlobalVariable

public class Login {

	@Given("user is in login page")
	public void user_is_in_login_page() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://secondhand-store.herokuapp.com/')

		WebUI.click(findTestObject('Homepage/Button_Masuk_Homepage'))
	}


	@When("user click the Masuk button")
	public void user_click_the_Masuk_button() {
		WebUI.click(findTestObject('Login page/Button_Masuk'))
	}

	@When("user fill the email field with (.*) email")
	public void user_fill_the_email_field_with_email(String email) {
		if(email=='valid') {
			WebUI.setText(findTestObject('Login page/Field_Input_Email'), 'fadematthew23@gmail.com')
		}else if(email=='empty') {
			WebUI.setText(findTestObject('Login page/Field_Input_Email'), '')
		}else if(email=='valid') {
			WebUI.setText(findTestObject('Login page/Field_Input_Email'), 'fadematthew23@gmail.com')
		}else if(email=='invalid') {
			WebUI.setText(findTestObject('Login page/Field_Input_Email'), 'emailsalah@gmail.com')
		}
	}
	@When("user fill the password field with (.*) password")
	public void user_fill_the_password_field_with_password(String password) {
		if(password=='correct') {
			WebUI.setText(findTestObject('Login page/Field_Input_Password'), 'cadel1323')
		}else if(password=='correct') {
			WebUI.setText(findTestObject('Login page/Field_Input_Password'), 'cadel1323')
		}else if(password=='empty') {
			WebUI.setText(findTestObject('Login page/Field_Input_Password'), '')
		}else if(password=='incorrect') {
			WebUI.setText(findTestObject('Login page/Field_Input_Password'), 'passwordsalah')
		}
	}

	@Then("user can (.*) login")
	public void user_can_login(String result) {
		if(result=='succesfully') {
			WebUI.verifyElementVisible(findTestObject('Homepage/Button_Profile'),)
		}else if(result=='failed') {
			WebUI.verifyElementVisible(findTestObject('Login page/Button_Masuk'),)
		}
	}
	}

