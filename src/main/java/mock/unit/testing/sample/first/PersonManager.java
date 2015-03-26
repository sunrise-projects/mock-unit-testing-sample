package mock.unit.testing.sample.first;

import javax.inject.Named;

@Named
public class PersonManager {  // -- does not use interface. Direct class call.

	public String sayHelloFromManagerClass(String input) {
		System.out.println("sayHelloFromManagerClass "+input);
		return input;
	}

}
