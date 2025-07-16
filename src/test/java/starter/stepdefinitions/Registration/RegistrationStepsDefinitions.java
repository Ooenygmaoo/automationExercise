package starter.stepdefinitions.Registration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import starter.task.RegisterUser.AddUser;
import starter.task.RegisterUser.DeleteUser;
import starter.ui.registration.RegisterPage;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.stateOf;


public class RegistrationStepsDefinitions {


    @Given("{actor}is on the Automation Exercise home page")
    public void isOnTheAutomationExercisehomePage(Actor actor) {
        actor.attemptsTo(
                Open.browserOn(new RegisterPage()));


    }


    @When("{actor}  registers a new account with valid personal information")
    public void registersANewAccountWithValidPersonalInformation(Actor actor) {
        actor.attemptsTo(


                new AddUser()


        );

    }

    @Then("{actor}should be logged in and able to delete the account successfully")
    public void shouldbeLoggedinAndAbleToDeleteTheAccountSuccessfully(Actor actor) {

        actor.attemptsTo(

            new DeleteUser()



        );

    }

}
