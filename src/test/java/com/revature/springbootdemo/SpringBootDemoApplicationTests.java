package com.revature.springbootdemo;

import com.revature.springbootdemo.entity.Pet;
import com.revature.springbootdemo.repository.PetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:test.properties")
class SpringBootDemoApplicationTests {

	@Autowired
	PetRepository petRepository;

	@Test
	void contextLoads() {
		System.out.println(System.getenv("RDS_URL"));
		System.out.println(petRepository.save(new Pet()));
	}

}
