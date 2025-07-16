package starter.stepdefinitions.Registration;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import starter.models.RegisterModel;
import starter.task.RegisterUser.AddUser;
import starter.task.RegisterUser.DeleteUser;
import starter.ui.registration.RegisterPage;
import starter.util.GetInfoFromTable;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.stateOf;


public class RegistrationStepsDefinitions {


    @Given("{actor}is on the Automation Exercise home page")
    public void isOnTheAutomationExercisehomePage(Actor actor) {
        actor.attemptsTo(
                Open.browserOn(new RegisterPage()));


    }


    @When("{actor}  registers a new account with valid personal information")
    public void registersANewAccountWithValidPersonalInformation(Actor actor, DataTable regdta) {
        RegisterModel registerModel = GetInfoFromTable.getRegisterdata(regdta);

        actor.attemptsTo(
                AddUser.regInfo(
                        registerModel.getInputName(),
                        registerModel.getEmail(),
                        registerModel.getPassword(),
                        registerModel.getDays(),
                        registerModel.getMonths(),
                        registerModel.getYear(),
                        registerModel.getFirstname(),
                        registerModel.getLastname(),
                        registerModel.getCompany(),
                        registerModel.getAddress(),
                        registerModel.getCountry(),
                        registerModel.getState(),
                        registerModel.getCity(),
                        registerModel.getZipcode(),
                        registerModel.getMobile()


                )


        );

    }

    @Then("{actor}should be logged in and able to delete the account successfully")
    public void shouldbeLoggedinAndAbleToDeleteTheAccountSuccessfully(Actor actor) {

        actor.attemptsTo(

                new DeleteUser()


        );

    }

}
