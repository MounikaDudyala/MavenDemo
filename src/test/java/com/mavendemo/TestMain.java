package com.mavendemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	@Test
	public void test() {
		MavenDemo maven=new MavenDemo();
		assertEquals(12,maven.add(7, 5));
	}

}
