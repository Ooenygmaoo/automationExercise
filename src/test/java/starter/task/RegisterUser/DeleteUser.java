package starter.task.RegisterUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import starter.ui.RegistrationPage.DeleteLoginPage;

public class DeleteUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(DeleteLoginPage.ACCOUNTCREATED)
                        .text().containsIgnoringCase("Account Created!"),
                Click.on(DeleteLoginPage.CONTINUE),
                Click.on(DeleteLoginPage.DELETEACCOUNT),
                Ensure.that(DeleteLoginPage.ACCOUNTDELETE)
                        .text().containsIgnoringCase("Account Deleted!"),
                Click.on(DeleteLoginPage.CONTINUE)

        );
    }
}
