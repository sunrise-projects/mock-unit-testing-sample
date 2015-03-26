package mock.unit.testing.sample.second;

import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;

@Named
public class QueryStringUtils {

	public String reverse(String input) {
		System.out.println("QueryStringUtils.reverse is called!");
		return StringUtils.reverse(input);
	}
	
	
	
}
