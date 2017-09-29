package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void myTest() {
		assertTrue(true);
	}

	@Test
	public void calculate_methods_first_param_should_not_be_null() throws Exception {
		try {
			DemoApplication.additionner(null,2);
			DemoApplication.soustraire(null,2);
			DemoApplication.multiplier(null,2);
			assertTrue(false);
		}
		catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void calculate_methods_second_param_should_not_be_null() throws Exception {
		try {
			DemoApplication.additionner(1,null);
			DemoApplication.soustraire(1,null);
			DemoApplication.multiplier(1,null);
			assertTrue(false);
		}
		catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void additionner_should_give_a_number_with_two_integers() throws Exception {
		//GIVEN
		
		//WHEN
		Integer result = DemoApplication.additionner(1,2);
		//THEN
		Integer expected = 3;
		if (result == expected) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

	@Test
	public void soustraire_should_give_a_number_with_two_integers() throws Exception {
		//GIVEN
		
		//WHEN
		Integer result = DemoApplication.soustraire(1,2);
		//THEN
		Integer expected = -1;
		if (result == expected) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

	@Test
	public void multiplier_should_give_a_number_with_two_integers() throws Exception {
		//GIVEN
		
		//WHEN
		Integer result = DemoApplication.multiplier(1,2);
		//THEN
		Integer expected = 2;
		if (result == expected) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

}
