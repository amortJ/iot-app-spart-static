package at.amort.dsg.spark;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "IoT measurement" );

        get("/average", (req, res) -> { res.type("application/json"); return "{ \"average\": 42.1 }";});
    }
}
