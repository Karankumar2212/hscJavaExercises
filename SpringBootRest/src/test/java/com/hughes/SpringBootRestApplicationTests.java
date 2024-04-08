package com.hughes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest
class SpringBootRestApplicationTests {

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate ourTemplate;
	
	@Test
	void myRestTesting() {
		assertThat(ourTemplate.getForObject("http://localhost:"+port+"/",String.class)).contains("");
	}

}
