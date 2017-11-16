package at.amort.dsg.spark;

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String body = "{ \"average\": 42.1 }";


    public static void main( String[] args )
    {
        System.out.println( "IoT measurement" );


        //get("/average", (req, res) -> { res.type("application/json"); return "{ \"average\": 42.1 }";});

        /*
        Route route = new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {

                System.out.println("foo");
                response.type("application/json");
                response.body("{ \"average\": 42.1 }");

                return "{ \"average\": 42.1 }";
            }
        };

        get("/average", route);
        */

        Route route = new Route("/average") {
            @Override
            public Object handle(Request request, Response response) {
                //System.out.println("request received");
                response.type("application/json");
                response.body("{ \"foo\" : 234 }");
                return body;
            }
        };

        get(route);

    }
}
