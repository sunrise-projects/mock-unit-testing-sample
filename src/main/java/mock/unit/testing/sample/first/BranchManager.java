package mock.unit.testing.sample.first;

import javax.inject.Named;

@Named
public class BranchManager {  // -- does not use interface. Direct class call.

	public String sayHelloFromBranchManager(String input) {
		System.out.println("sayHelloFromBranchManager "+input);
		return input;
	}

}
