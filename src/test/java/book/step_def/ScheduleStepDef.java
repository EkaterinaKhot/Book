package book.step_def;

import book.pages.BookItElementsPage;
import book.pages.WebTableLoginPage;
import book.utilities.ConfigurationReader;
import book.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;


public class ScheduleStepDef {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BookItElementsPage bookItElementsPage = new BookItElementsPage();


    @Given("User should be able to log in to Bookit using the team member credentials.")
    public void user_should_be_able_to_log_in_to_bookit_using_the_team_member_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        webTableLoginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));


    }

    @When("User hover over to “schedule” it should be highlighted, and the drop-down list should be appeared: my and general")
    public void user_hover_over_to_schedule_it_should_be_highlighted_and_the_drop_down_list_should_be_appeared_my_and_general() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(BookItElementsPage.scheduleBtn).perform();
        BookItElementsPage.scheduleBtn.click();
    }

    @When("The user clicks to “my” and user should be able to see “schedule Raymond Reddington")
    public void the_user_clicks_to_my() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(BookItElementsPage.myScheduleBtn).perform();
        BookItElementsPage.myScheduleBtn.click();


    }


    @When("The user clicks to “general” and user should be able to see “schedule light-side today\"")
    public void theUserClicksToGeneralAndUserShouldBeAbleToSeeScheduleLightSideToday() throws Throwable {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(BookItElementsPage.generalScheduleBtn).perform();
        BookItElementsPage.generalScheduleBtn.click();
    }
}

