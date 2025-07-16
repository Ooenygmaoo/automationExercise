package starter.task.RegisterUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.ui.RegistrationPage.RegisterLoginPage;

public class AddUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterLoginPage.SIGNUPLOGIN),
                Ensure.that(RegisterLoginPage.SIGNUPELEMENT)
                        .text().contains("New User Signup!"),
                Enter.theValue("David").into(RegisterLoginPage.INPUTNAME),
                Enter.theValue("david@micorreo.com").
                        into(RegisterLoginPage.INPUTEMAIL),
                Click.on("//button[normalize-space()='Signup']"),
                Ensure.that(RegisterLoginPage.ENTERACCOUNTINFO)
                        .text().contains("ENTER ACCOUNT INFORMATION"),
                Click.on(RegisterLoginPage.GENDER),
                Enter.theValue("miclave1").into(RegisterLoginPage.PASSWORD),
                SelectFromOptions.byValue("15").from(RegisterLoginPage.DAYS),
                SelectFromOptions.byValue("2").from(RegisterLoginPage.MONTHS),
                SelectFromOptions.byValue("1995").from(RegisterLoginPage.YEAR),
                Click.on(RegisterLoginPage.OPTION),
                Enter.theValue("Pedro").into(RegisterLoginPage.FIRSTNAME),
                Enter.theValue("Perez").into(RegisterLoginPage.LASTNAME),
                Enter.theValue("Mi empresa").into(RegisterLoginPage.COMPANY),
                Enter.theValue("fake adresss 123").into(RegisterLoginPage.ADDRESSS),
                SelectFromOptions.byValue("United States").from(RegisterLoginPage.COUNTRY),
                Enter.theValue("Florida").into(RegisterLoginPage.STATE),
                Enter.theValue("Miami").into(RegisterLoginPage.CITY),
                Enter.theValue("33101").into(RegisterLoginPage.ZIPCODE),
                Enter.theValue("3323232211").into(RegisterLoginPage.MOBILE),
                Click.on(RegisterLoginPage.BUTTONREGISTER)

        );
    }
}
