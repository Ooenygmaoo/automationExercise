package starter.stepdefinitions.Registration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;


public class RegistrationStepsDefinitions {


    @Given("{actor}is on the Automation Exercise home page")
    public void isOnTheAutomationExercisehomePage(Actor actor) {
        actor.attemptsTo(
                Open.url("https://automationexercise.com"),
                Click.on("//a[normalize-space()='Signup / Login']"),
                Ensure.that(Target.the("signup element")
                        .locatedBy("div[class='login-form'] h2"))
                        .text().containsIgnoringCase("Login to your account")


        );
    }


    @When("{actor}  registers a new account with valid personal information")
    public void  registersANewAccountWithValidPersonalInformation(Actor actor) {
        actor.attemptsTo(
                Enter.theValue("David").into("input[placeholder='Name']")

        );


    }

    @Then("{actor}should be logged in and able to delete the account successfully")
    public void shouldbeLoggedinAndAbleToDeleteTheAccountSuccessfully(Actor actor) {

        actor.attemptsTo(

        );

    }

}
