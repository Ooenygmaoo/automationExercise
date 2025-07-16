package starter.ui.RegistrationPage;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterLoginPage {

    public static Target SIGNUPLOGIN = Target.the("sigupElementLogin")
            .locatedBy("//a[normalize-space()='Signup / Login']");
    public static Target SIGNUPELEMENT = Target.the("sigupElement")
            .locatedBy("div[class='signup-form'] h2");

    public static Target INPUTNAME = Target.the("inputname")
            .locatedBy("//input[@placeholder='Name']");
    public static Target INPUTEMAIL = Target.the("inputemail")
            .locatedBy("(//input[@placeholder='Email Address'])[2]");
    public static Target BUTTONSIGNUP = Target.the("buttonsignup")
            .locatedBy("//button[normalize-space()='Signup']");

    public static Target ENTERACCOUNTINFO = Target.the("enteraccountinfo")
            .locatedBy("//b[normalize-space()='Enter Account Information']");

    public static Target GENDER = Target.the("gender")
            .locatedBy("#id_gender1");

    public static Target PASSWORD = Target.the("password")
            .locatedBy("#password");

    public static Target DAYS = Target.the("days")
            .locatedBy("#days");

    public static Target MONTHS = Target.the("months")
            .locatedBy("#months");
    public static Target YEAR = Target.the("year")
            .locatedBy("#years");
    public static Target OPTION = Target.the("option")
            .locatedBy("#optin");
    public static Target FIRSTNAME = Target.the("firstname")
            .locatedBy("#first_name");
    public static Target LASTNAME = Target.the("lastname")
            .locatedBy("#last_name");

    public static Target COMPANY = Target.the("company")
            .locatedBy("#company");

    public static Target ADDRESSS = Target.the("address")
            .locatedBy("#address1");

    public static Target COUNTRY = Target.the("country")
            .locatedBy("#country");

    public static Target STATE = Target.the("state")
            .locatedBy("#state");

    public static Target CITY = Target.the("city")
            .locatedBy("#city");
    public static Target ZIPCODE = Target.the("zipcode")
            .locatedBy("#zipcode");

    public static Target MOBILE = Target.the("mobilenumber")
            .locatedBy("#mobile_number");
    public static Target BUTTONREGISTER = Target.the("buttonregister")
            .locatedBy("//button[normalize-space()='Create Account']");


}
