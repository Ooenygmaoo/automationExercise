package starter.task.RegisterUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.ui.RegistrationPage.RegisterLoginPage;

public class AddUser {

    public static Performable regInfo(String inputname,String email,String password,String days
            ,String months,String years,String firstname,String lastname,String company,String address
            ,String country,String state,String city,String zipcode,String mobile){
           return Task.where("{0},adds a new user",
                   Click.on(RegisterLoginPage.SIGNUPLOGIN),
                   Ensure.that(RegisterLoginPage.SIGNUPELEMENT)
                           .text().contains("New User Signup!"),
                   Enter.theValue(inputname).into(RegisterLoginPage.INPUTNAME),
                   Enter.theValue(email).
                           into(RegisterLoginPage.INPUTEMAIL),
                   Click.on(RegisterLoginPage.BUTTONSIGNUP),
                   Ensure.that(RegisterLoginPage.ENTERACCOUNTINFO)
                           .text().contains("ENTER ACCOUNT INFORMATION"),
                   Click.on(RegisterLoginPage.GENDER),
                   Enter.theValue(password).into(RegisterLoginPage.PASSWORD),
                   SelectFromOptions.byValue(days).from(RegisterLoginPage.DAYS),
                   SelectFromOptions.byValue(months).from(RegisterLoginPage.MONTHS),
                   SelectFromOptions.byValue(years).from(RegisterLoginPage.YEAR),
                   Click.on(RegisterLoginPage.OPTION),
                   Enter.theValue(firstname).into(RegisterLoginPage.FIRSTNAME),
                   Enter.theValue(lastname).into(RegisterLoginPage.LASTNAME),
                   Enter.theValue(company).into(RegisterLoginPage.COMPANY),
                   Enter.theValue(address).into(RegisterLoginPage.ADDRESSS),
                   SelectFromOptions.byValue(country).from(RegisterLoginPage.COUNTRY),
                   Enter.theValue(state).into(RegisterLoginPage.STATE),
                   Enter.theValue(city).into(RegisterLoginPage.CITY),
                   Enter.theValue(zipcode).into(RegisterLoginPage.ZIPCODE),
                   Enter.theValue(mobile).into(RegisterLoginPage.MOBILE),
                   Click.on(RegisterLoginPage.BUTTONREGISTER)

           );
    }
}
