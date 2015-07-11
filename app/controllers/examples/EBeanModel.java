package controllers.examples;

import com.avaje.ebean.Model;
import models.Page;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * EBean Model Example
 * <p>
 * Steps to use EBean ORM to communicate to database.
 * Step 1: Enable `db.default.driver`, `db.default.url="jdbc:h2:mem:play"`, `db.default.user=sa`, `db.default.password=""`
 * from `application.conf`
 * Notes for Step 1
 * Note 1-1: Default datasource is `default`
 * Note 1-2: Available drivers, for H2: org.h2.Driver, for MySQL: com.mysql.jdbc.Driver
 * <p>
 * Step 2: Enable EBean Model configuration. (Insert code if it isn't in comment).
 * By default, the package location is at models. `ebean.default = ["models.*"]`
 * Notes for Step 2
 * Note 2-1: This will enable evolution and will let you apply evolution.
 * <p>
 * Step 3: Apply script!
 *
 *
 * TODO: Batch insertion
 * TODO: Data passed to template
 * TODO: 1-1 relation
 * TODO: 1-n relation
 * TODO: m-n relation
 * TODO: transaction
 * TODO: Raw Queries
 */
public class EBeanModel extends Controller {

    private final Model.Finder<Long, Page> finder;

    public EBeanModel() {
        this.finder = new Model.Finder<Long, Page>(Long.class, Page.class);
    }

    /**
     * Insert records to database
     * @return Result
     */
    public Result insertion() {
        Page page = new Page();
        page.title = "Page title 1";
        page.url = "test.html";
        page.save();

        Page page2 = new Page();
        page2.title = "Page title 2";
        page2.url = "test2.html";
        page2.save();

        return ok("Inserted");
    }

    /**
     * Search a record by its property, like(): case sensitive, ilike(): case insensitive
     * @return Result
     */
    public Result searchBy() {
        List<Page> pages = this.finder.where().like("url", "%test.html%").findList();
        return ok(Json.toJson(pages));
    }

    /**
     * Update a record
     * @return Result
     */
    public Result updates() {
        try {
            Page page = this.finder.byId(new Long(1));
            page.title = "Modified Page title 1";
            page.update();
            return ok("Updated");
        }
        catch (NullPointerException e) {
            return notFound("Record does not exist. ");
        }
    }

    /**
     * Delete a record given by its id
     * @return Result
     */
    public Result deletion() {
        try {
            Page page = Page.finder.byId(new Long(1));
            page.delete();
            return ok("Deleted");
        }
        catch (NullPointerException e) {
            return notFound("Record does not exist. ");
        }
    }

    /**
     * Return result in JSON response
     * Using Model's finder
     *
     * @return Result
     */
    public Result resultWithJsonResponse() {
        List<Page> pages = Page.finder.all();
        return ok(Json.toJson(pages));
    }

    /**
     * Return result in String response
     * @return Result
     */
    public Result resultWithPlainString() {
        List<Page> pages = this.finder.all();
        StringBuilder response = new StringBuilder();
        for (Page page : pages) {
            response.append("ID: " + page.id + " " + page.title + " - [" + page.createdAt.toString() + "]").append("\n");
        }

        return ok(response.toString());
    }

}
