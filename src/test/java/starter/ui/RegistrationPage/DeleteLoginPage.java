package starter.ui.RegistrationPage;

import net.serenitybdd.screenplay.targets.Target;

public class DeleteLoginPage {

    public static Target ACCOUNTCREATED = Target.the("account created")
            .locatedBy("h2[class='title text-center'] b");

    public static Target CONTINUE = Target.the("continue")
            .locatedBy("//a[normalize-space()='Continue']");

    public static Target DELETEACCOUNT = Target.the("deleteaccount")
            .locatedBy("//a[normalize-space()='Delete Account']");
    public static Target ACCOUNTDELETE = Target.the("accountdelete")
            .locatedBy("h2[class='title text-center'] b");


}
