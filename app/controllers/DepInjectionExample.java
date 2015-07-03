package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Content;
import repo.*;
import views.html.*;
import javax.inject.Inject;

public class DepInjectionExample extends Controller {
    protected PageRepoInterface pageRepo;

    @Inject
    public DepInjectionExample(PageRepoInterface pageRepo) {
        this.pageRepo = pageRepo;
    }

    public Result index() {
        Content content = index.render(this.pageRepo.sayHello());
        return ok(content);
    }
}
