package ee.ttu.ws.mattias_koosalu.employersservice;

import com.sun.jersey.api.client.Client;
import ee.ttu.ws.mattias_koosalu.employers.Employee;
import ee.ttu.ws.mattias_koosalu.employers.EmployeeByIdCodeRequestType;
import ee.ttu.ws.mattias_koosalu.employers.EmployeeResponseType;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by sammalsilm on 5/9/17.
 */
public class EmployersClient {

    private static void getIdWsdlTest() {
        Employers employers = new Employers();
        employers.initializeTestData();
        EmployeeByIdCodeRequestType request = new EmployeeByIdCodeRequestType();
        request.setToken("?");
        request.setOperationId("9402839-239589218-5943159423058943284092350");
        request.setIdCode("123");
        EmployeeResponseType res = employers.getEmployeeByIdCode(request);
        Employee response = res.getEmployee();
        System.out.println("result wsdl");
        System.out.println("idCode=" + response.getIdCode());
        System.out.println("response.getName() = " + response.getName());
        System.out.println("response.getAge() = " + response.getAge());
        System.out.println("response.getHairColor() = " + response.getHairColor());
        System.out.println("response.getEyeColor() = " + response.getEyeColor());
        System.out.println("response.getEmployer() = " + response.getEmployer());
    }

    private static void getIdUrlTest() throws Exception {
        URLConnection conn = new URL("http://localhost:9001/employers/employees/123?token=?&operationId=31289380192434").openConnection();
        try (InputStream is = conn.getInputStream()) {
            BufferedInputStream in = new BufferedInputStream(is);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        getIdUrlTest();
        getIdWsdlTest();
    }
}
