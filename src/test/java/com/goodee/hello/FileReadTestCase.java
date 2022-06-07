package com.goodee.hello;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={})
public class FileReadTestCase {

	private FileReader reader;
	
	@Before
	public void setUp() throws Exception {
		try {
			reader = new FileReader("data.txt");
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Cannot open data.txt");
		}
	}

	@After
	public void tearDown() throws Exception {
		try {
			reader.close();
		} catch (IOException e) {
			throw new RuntimeException("Cannot close data.txt");
		}
	}

	@Test
	public void 파일읽기테스트() throws IOException {
		assertEquals(5, reader.toString().length());
	}

}
