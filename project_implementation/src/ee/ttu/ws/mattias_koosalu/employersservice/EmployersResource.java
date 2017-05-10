package ee.ttu.ws.mattias_koosalu.employersservice;
import com.sun.net.httpserver.HttpServer;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import ee.ttu.ws.mattias_koosalu.employers.*;

import java.awt.*;
import java.io.IOException;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/employers")
public class EmployersResource {
    Employers employers;

    public EmployersResource() {
        employers = new Employers();
        employers.initializeTestData();
    }

    public EmployersResource(Employers employers) {
        this.employers = employers;
    }

    @POST
    @Path("employees/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeResponseType addEmployee(@QueryParam("token") String token,
                                             @QueryParam("operationId") String operationId,
                                             Employee employee) {
        AddEmployeeRequestType request = new AddEmployeeRequestType();

        request.setToken(token);
        request.setOperationId(operationId);
        request.setEmployee(employee);

        return employers.addEmployee(request);
    }

    @POST
    @Path("employers/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public EmployerResponseType addEmployer(@QueryParam("token") String token,
                                             @QueryParam("operationId") String operationId,
                                             NewEmployer employer) {
        AddEmployerRequestType request = new AddEmployerRequestType();

        request.setToken(token);
        request.setOperationId(operationId);
        request.setEmployer(employer);

        return employers.addEmployer(request);
    }

    @GET
    @Path("employees/{idCode: .+}")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeeResponseType getEmployeeByIdCode(@QueryParam("token") String token,
                                                    @QueryParam("operationId") String operationId,
                                                    @PathParam("idCode") String idCode) {
        EmployeeByIdCodeRequestType request = new EmployeeByIdCodeRequestType();

        request.setToken(token);
        request.setOperationId(operationId);
        request.setIdCode(idCode);

        return employers.getEmployeeByIdCode(request);
    }

    @GET
    @Path("employers/{id: .+}")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployerResponseType getEmployerById(@QueryParam("token") String token,
                                                @QueryParam("operationId") String operationId,
                                                @PathParam("id") String id) {
        EmployerByIdRequestType request = new EmployerByIdRequestType();

        request.setToken(token);
        request.setOperationId(operationId);
        request.setEmployerId(id);

        return employers.getEmployerById(request);
    }

    @GET
    @Path("employees")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeesResponseType getEmployees(@QueryParam("token") String token,
                                              @QueryParam("operationId") String operationId) {
        EmployeesRequestType request = new EmployeesRequestType();

        request.setToken(token);
        request.setOperationId(operationId);

        return employers.getAllEmployees(request);
    }

    @GET
    @Path("employers")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployersResponseType getEmployers(@QueryParam("token") String token,
                                              @QueryParam("operationId") String operationId) {
        EmployersRequestType request = new EmployersRequestType();
        request.setToken(token);
        request.setOperationId(operationId);

        return employers.getAllEmployers(request);
    }

    @GET
    @Path("employees/find")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeesResponseType findEmployees(@QueryParam("token") String token,
                                               @QueryParam("operationId") String operationId,
                                               @QueryParam("name") String name,
                                               @QueryParam("age") int age,
                                               @QueryParam("hairColor") String hairColor,
                                               @QueryParam("eyeColor") String eyeColor) {
        FindEmployeesRequestType request = new FindEmployeesRequestType();

        request.setToken(token);
        request.setOperationId(operationId);
        request.setName(name);
        request.setAge(age);
        request.setHairColor(hairColor);
        request.setEyeColor(eyeColor);

        return employers.findEmployees(request);
    }

    @GET
    @Path("employers/{id: .+}/employees")
    @Produces(MediaType.APPLICATION_JSON)
    public EmployeesResponseType getEmployeesAtEmployer(@QueryParam("token") String token,
                                                        @QueryParam("operationId") String operationId,
                                                        @PathParam("id") String id) {
        EmployeesAtEmployerRequestType request = new EmployeesAtEmployerRequestType();

        request.setToken(token);
        request.setOperationId(operationId);
        request.setEmployerId(id);

        return employers.getEmployeesAtEmployer(request);
    }


    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:9001/");
        server.start();

        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9998/helloworld");
        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
    }
}
