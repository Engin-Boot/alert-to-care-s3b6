package com.philips.webTest;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.philips.entity.Patient;
//@SpringBootTest
public class PatientServiceTest {
	@Test
    void testCreatePatient() throws URISyntaxException {
//		RestTemplate restTemplate = new RestTemplate();
//        final String baseUrl = "http://localhost:"+8082+"/addPatient";
//        URI uri = new URI(baseUrl);
//        Patient p = new Patient(3);
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("X-COM-PERSIST", "true");      
// 
//        HttpEntity<Patient> request = new HttpEntity<>(p, headers);
//         
//        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
//         
//        Assertions.assertEquals(200, result.getStatusCodeValue());
    }
	
}
