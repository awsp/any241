package controllers.examples;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Router Related Example
 * <p>
 * Result class functions
 * ok(): 200 OK
 * badRequest(): 400 Bad Request
 * forbidden(): 403 Forbidden
 * notFound(): 404 Not Found
 * internalServerError(): 500 Internal Server Error
 */
public class RouterRelated extends Controller {

    /**
     * 500 Internal Server Error
     * @return Result
     */
    public Result internalErrorMessage() {
        return internalServerError("This page is intended left to be having internal server error. ");
    }

    /**
     * Get router parameter
     * @param foz Integer
     * @param baz Integer
     * @return Result
     */
    public Result getRouteParam(Integer foz, Integer baz) {
        return ok(foz.toString() + ":" + baz.toString());
    }

    /**
     * Indicate a page with regular expression.
     * p[0-9]+\.foo, Ex. p3.foo => p3
     * @param id String
     * @return Result
     */
    public Result getRegExpParam(String id) {
        return ok(id.toString());
    }

}
