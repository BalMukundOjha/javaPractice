package com.mukund.maven.mavendemo;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
	
	@Test
	public void givenNameWhenHelloThenReturnName() {
		App app = new App();
		String result = app.hello("BM");
		Assert.assertNotNull(result);
		Assert.assertEquals("Hello BM", result);
	}
}
