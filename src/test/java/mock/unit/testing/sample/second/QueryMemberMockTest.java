package mock.unit.testing.sample.second;


import static org.junit.Assert.*;
import mock.unit.testing.sample.first.CustomerManager;
import mock.unit.testing.sample.first.CustomerService;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.reflect.Whitebox;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class QueryMemberMockTest {

	private QueryMember queryMember;
	
	@Mock
	private QueryStringUtils queryStringUtils;
	
	
	@Before
	public void setUp() throws Exception {
		
		queryMember = new QueryMember();
		Whitebox.setInternalState(queryMember, queryStringUtils);
		
	}
	
	
	//@Test
	public void test1() {
		String rt = queryMember.findMember("test", "test");
		System.out.println(rt);
		
		String rt2 = queryMember.findMember("aaaa", "test");
		System.out.println(rt2);
	}
	
	//@Test
	public void test2() {
		
		when(queryStringUtils.reverse(Matchers.anyString())).thenReturn("mock-override");     
		
		String rt = queryMember.findMember("test", "test");
		System.out.println(rt);
		
		String rt2 = queryMember.findMember("aaaa", "test");
		System.out.println(rt2);
	}
	
	@Test
	public void test3() {
		
		//no override mocking of method. it will be null only.
		//when(queryStringUtils.reverse(Matchers.anyString())).thenReturn("mock-override");     
		
		String rt = queryMember.findMember("test", "test");
		System.out.println(rt);
		
		String rt2 = queryMember.findMember("aaaa", "test");
		System.out.println(rt2);
	}
	
}
