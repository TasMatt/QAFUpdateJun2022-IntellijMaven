package com.application.steps;

import com.application.pages.BasePage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;

public class LoginStep extends WebDriverTestCase {

	@QAFTestStep(description = "Navigate to Valley Bank")
	public void LoginToApplication() {

		BasePage basePage = new BasePage();

		basePage.openWebsite();
		basePage.waitForPageToLoad();

		Validator.verifyTrue(basePage.labelHeadingWelcomeToValley.isPresent(),
				"Valley Bank is not invoked.",
				"Valley Bank is invoked successfully.");

	}

	@QAFTestStep(description = "Validate top menu displays")
	public void validateMenuDisplays() {

		BasePage basePage = new BasePage();

		Validator.assertTrue(basePage.labelTopMenuOpenAnAccount.isDisplayed(),
				"Top Menu, Open An Account is not displayed.",
				"Top Menu, Open An Account is displayed.");
	}

		@QAFTestStep(description = "User Verifies DataSheet value {value}")
	public void verifyDataSheet(String strValue) {

		Validator.verifyTrue(strValue.equals("chrome"),
				"Datasheet does not work successfully",
				"Datasheet works successfully");

	}
}
