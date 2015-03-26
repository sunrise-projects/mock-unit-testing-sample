package mock.unit.testing.sample.first;

import javax.inject.Named;


@Named
public class CustomerManager {

	public void save() {
		System.out.println("CustomerDAO save method...");
	}
	
}
