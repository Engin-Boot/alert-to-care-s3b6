package com.philips;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.philips.entity.Bed;

@SpringBootTest
class AlertToCareS3b6ApplicationTests {
	
	@Test
	void testBedClass() {
		Bed b= new Bed(10);
		assertThat(b.getbId()).isEqualTo(10);
		
	}
	@Test
	void testGetUri() {
		
	}
}
