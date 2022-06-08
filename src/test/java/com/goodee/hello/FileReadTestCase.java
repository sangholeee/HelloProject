package com.goodee.hello;

import static org.junit.Assert.assertArrayEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goodee.hello.config.DBConfig;
import com.goodee.hello.config.HelloConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={HelloConfig.class, DBConfig.class})
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
		
			char[] data = {'h', 'e', 'l', 'l', 'o'};
			char[] cbuf = new char[5];
			reader.read(cbuf);
			assertArrayEquals(data, cbuf);
		
	}

}
