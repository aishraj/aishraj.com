package controllers;

import models.ContactRequest;
import play.Routes;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Form<ContactRequest> contactRequestForm = Form.form(ContactRequest.class);

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result contactSubmit() {
        return ok("okay");
    }
    public static Result jsRoutes() {
        response().setContentType("text/javascript");
        return ok(Routes.javascriptRouter("jsRoutes",
                        controllers.routes.javascript.Application.contactSubmit()
                )
        );
    }
}
