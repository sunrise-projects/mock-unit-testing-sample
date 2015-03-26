package mock.unit.testing.sample.first;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class PersonDAOImpl implements PersonDAO {

	@Inject 
	private PersonManager personManager;
	
	@Inject 
	private BranchManager branchManager;
	
	
	@Override
	public String sayHello(String input) {
		System.out.println("hello "+input);
		return input;
	}
	
	@Override
	public String sayHelloFromMgr(String input) {
		personManager.sayHelloFromManagerClass(input);
		return input;
	}
	
	@Override
	public String sayHelloFromPeopleAndBranchMgr(String input) {
		
		//spied
		personManager.sayHelloFromManagerClass(input);
		
		//mocked
		branchManager.sayHelloFromBranchManager(input);
		return input;
	}

}
