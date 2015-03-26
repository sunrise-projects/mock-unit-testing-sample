package mock.unit.testing.sample.first;

import static org.junit.Assert.*;
import mock.unit.testing.sample.first.CustomerManager;
import mock.unit.testing.sample.first.CustomerService;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.reflect.Whitebox;


@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

	@Spy
	private CustomerService customerService;
	
	@Spy
	private CustomerManager customerManager;
	
	@Spy
	private PersonManager personManager;
	
	@Spy // --@Spy toggle to find out. The spied logic will use sayHelloFromBranchManager method on BranchManager. Mock will not.
	private BranchManager branchManager;
	
	
	
//	@Spy  
//	private PersonDAO personDAO; // -- this is an interface. need to have the implementation
	
	@Spy
	private PersonDAO personDAO = new PersonDAOImpl();
	
	@Before
	public void setUp() throws Exception {
		Whitebox.setInternalState(customerService, customerManager);
		Whitebox.setInternalState(customerService, personDAO);
		
		Whitebox.setInternalState(personDAO, personManager);
		Whitebox.setInternalState(personDAO, branchManager);
		
	}

	//@Test
	public void test1() {
		customerService.save();
	}


	//@Test
	public void test2() {
		customerService.sayHello();
	}
	

	//@Test
	public void test3() {
		customerService.sayHelloFromMgr();
	}
	
	@Test
	public void test4() {
		customerService.sayHelloFromPeopleandBranchMgr();
		
		//output with spy
		//sayHelloFromManagerClass Jones
		//sayHelloFromBranchManager Jones
		
		
		
	}
	
}
