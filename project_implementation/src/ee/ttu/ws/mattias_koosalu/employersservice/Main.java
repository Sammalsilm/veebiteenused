package ee.ttu.ws.mattias_koosalu.employersservice;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

import javax.xml.ws.Endpoint;
import java.io.IOException;

/**
 * Created by sammalsilm on 5/9/17.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Employers implementor = new Employers();
        implementor.initializeTestData();
        String wsdlAddress = "http://localhost:9000/Employers";
        System.out.println("wsdl at: " + wsdlAddress);
        Endpoint.publish(wsdlAddress, implementor);

        String restAddress = "http://localhost:9001/";
        System.out.println("rest api at: " + restAddress);
        HttpServer server = HttpServerFactory.create(restAddress);
        server.start();
    }
}
