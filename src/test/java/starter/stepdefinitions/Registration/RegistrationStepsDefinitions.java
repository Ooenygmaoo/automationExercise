package starter.stepdefinitions.Registration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import starter.ui.registration.RegisterPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.stateOf;


public class RegistrationStepsDefinitions {


    @Given("{actor}is on the Automation Exercise home page")
    public void isOnTheAutomationExercisehomePage(Actor actor) {
        actor.attemptsTo(
                Open.browserOn(new RegisterPage()));


    }


    @When("{actor}  registers a new account with valid personal information")
    public void registersANewAccountWithValidPersonalInformation(Actor actor) {
        actor.attemptsTo(Click.on("//a[normalize-space()='Signup / Login']"),
                Ensure.that(Target.the("signup element")
                                .locatedBy("div[class='signup-form'] h2"))
                        .text().containsIgnoringCase("New User Signup!"),
                Enter.theValue("David").into("//input[@placeholder='Name']"),
                Enter.theValue("david@micorreo.com").
                        into("(//input[@placeholder='Email Address'])[2]"),
                Click.on("//button[normalize-space()='Signup']"),
                Ensure.that(Target.the("Enter Account Information").
                                locatedBy("//b[normalize-space()='Enter Account Information']"))
                        .text().contains("ENTER ACCOUNT INFORMATION"),
                Click.on("#id_gender1"),
                Enter.theValue("miclave1").into("#password"),
                SelectFromOptions.byValue("15").from("#days"),
                SelectFromOptions.byValue("2").from("#months"),
                SelectFromOptions.byValue("1995").from("#years"),
                Click.on("#optin"),
                Enter.theValue("Pedro").into("#first_name"),
                Enter.theValue("Perez").into("#last_name"),
                Enter.theValue("Mi empresa").into("#company"),
                Enter.theValue("fake adresss 123").into("#address1"),
                SelectFromOptions.byValue("United States").from("#country"),
                Enter.theValue("Florida").into("#state"),
                Enter.theValue("Miami").into("#city"),
                Enter.theValue("33101").into("#zipcode"),
                Enter.theValue("3323232211").into("#mobile_number"),
                Click.on("//button[normalize-space()='Create Account']")








        );

    }

    @Then("{actor}should be logged in and able to delete the account successfully")
    public void shouldbeLoggedinAndAbleToDeleteTheAccountSuccessfully(Actor actor) {

        actor.attemptsTo(
                Ensure.that(Target.the("ACCOUNT CREATED")
                                .locatedBy("h2[class='title text-center'] b"))
                        .text().containsIgnoringCase("Account Created!"),
                Click.on("//a[normalize-space()='Continue']"),
                Click.on("//a[normalize-space()='Delete Account']"),
                Ensure.that(Target.the("ACCOUNT DELETE")
                                .locatedBy("h2[class='title text-center'] b"))
                        .text().containsIgnoringCase("Account Deleted!"),
                Click.on("//a[normalize-space()='Continue']")




        );

    }

}
