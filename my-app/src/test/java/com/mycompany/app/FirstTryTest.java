package com.mycompany.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.app.config.AppConfig;
import com.mycompany.app.service.FirstTryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class FirstTryTest {
	@Autowired
	private FirstTryService firstTryService;

	@Test
	public void testFirstTry() {
		Integer returnCal = firstTryService.cal(3, 3);
		System.out.println(returnCal);
	}

}
