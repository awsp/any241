package controllers.examples;

import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Content;
import repo.interfaces.PageRepo;
import views.html.*;
import javax.inject.Inject;

public class DepInjection extends Controller {
    protected PageRepo pageRepo;

    @Inject
    public DepInjection(PageRepo pageRepo) {
        this.pageRepo = pageRepo;
    }

    public Result index() {
        Content content = index.render(this.pageRepo.sayHello());
        return ok(content);
    }
}
