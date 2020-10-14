package com.philips;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import com.philips.dto.Bed;

@SpringBootTest
class AlertToCareS3b6ApplicationTests {
	
	@Test
	void testBedClass() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(); 
		Bed b= new Bed(10,100,formatter.format(date));
		assertThat(b.getbId()).isEqualTo(10);
		assertThat(b.getPatientId()).isEqualTo(100);
	}
	@Test
	void testGetUri() {
		
	}
}
