package mock.unit.testing.sample.first;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class CustomerService {

	@Inject
	private CustomerManager customerManager;
	
	@Inject
	private PersonDAO personDAO;
	
	
	public void save() {
		customerManager.save();
	}

	public void sayHello() {
		personDAO.sayHello("Joe");
	}

	public void sayHelloFromMgr() {
		personDAO.sayHelloFromMgr("Jane");
	}

	public void sayHelloFromPeopleandBranchMgr() {
		personDAO.sayHelloFromPeopleAndBranchMgr("Jones");
	}
}
