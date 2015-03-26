package mock.unit.testing.sample.second;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class QueryMember {

	@Inject
	private QueryStringUtils queryStringUtils;
	
	public String findMember(String name, String city) {
		
		if(name.isEmpty() || city.isEmpty()) {
			return "complete value";
		}
		
		if(name.contains("test") && name.contains("test")) {
			return "test test found";
		}
		
		name = toUpperName(name);
		
		name = queryStringUtils.reverse(name);
		
		return "result found: " + name+ " " +city;
	}
	
	public String toUpperName(String input) {
		return "custom-"+input.toUpperCase();
	}
	
	
	
}
