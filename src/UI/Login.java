import com.vaadin.flow.Route;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedLayout.VerticalLayout;

@Route

public class Login extends Composite<VerticalLayout>{

    public Login(){
        getContent().add(new LoginForm());
    }
}