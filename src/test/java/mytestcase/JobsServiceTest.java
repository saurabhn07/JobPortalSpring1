package mytestcase;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import com.mph.controller.EmployerRestController;
import com.mph.model.Employer;
import com.mph.service.JobsService;
   
public class JobsServiceTest {
	EmployerRestController  js = new EmployerRestController();
    @BeforeClass
	public static void setUpBeforeClass() 
    {
      System.out.println("@BeforeClass called");
    }
    @Before
    public void setUpBefore()
    { 
     
      System.out.println("@Before called");
    }
    @Test
    public void testSum()
    {
    	System.out.println("@testAdd called");
    	js. listAllEmployers() ;
    }
    @Test
    public void testMult()
    {
    	System.out.println("testMult called");
    	js.deleteEmployer(1);
    }
    @AfterClass
	public static void tearDownAfterClass() 
    {
      System.out.println("@AfterClass called");
    }
    @After
    public void tearDownAfter()
    {
      System.out.println("@After called");
    }
}
