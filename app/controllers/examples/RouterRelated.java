package controllers.examples;

import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

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
        return internalServerError("This page is left to be intended to throw internal server error. ");
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
        return ok(id);
    }

    public Result getQueryString() {
        final Set<Map.Entry<String, String[]>> queryString = request().queryString().entrySet();
        for (Map.Entry<String,String[]> entry: queryString) {
            final String key = entry.getKey();
            final String value = Arrays.toString(entry.getValue());
            Logger.debug(key + ": " + value);
        }
        return ok("Query String");
    }
}
