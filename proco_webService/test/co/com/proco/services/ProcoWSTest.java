package co.com.proco.services;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ProcoWSTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test() {
		fail("Not yet implemented"); // TODO
	}
	
	@Test
	public final void getMethod(){
		
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8181/WebService/rest/json/servicios/sesion");
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
			
			if (response.getStatus() != 200){
				throw  new RuntimeException("Failed : HTTP error code: " + response.getStatus());			
			}
			
			String output = response.getEntity(String.class);
			System.out.println("Output from server ... \n");
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public final void postMethod(){
		
		try {
			
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8181/WebService/rest/json/servicios/sesion_sesion");
			String input = "{\"titulo\":\"Entretenimiento\"}";
			ClientResponse response = webResource.accept("application/json").post(ClientResponse.class,input);
			
			if (response.getStatus() != 200){
				throw  new RuntimeException("Failed : HTTP error code: " + response.getStatus());			
			}
			
			String output = response.getEntity(String.class);
			System.out.println("Output from server ... \n");
			System.out.println(output);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
