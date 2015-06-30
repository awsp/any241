package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Content;
import views.html.*;


public class Application extends Controller {

    public Result index() {
	    Content html = (Content) index.render("Hello World.");
	    return ok(html);
    }

}
