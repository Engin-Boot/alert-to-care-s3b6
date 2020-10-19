package com.philips.webTest;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.philips.dao.IBedDao;
import com.philips.entity.Bed;

//@ExtendWith(SpringExtension.class)
//@WebFluxTest(controllers = BedService.class)
//@Import(BedService.class)
@SpringBootTest
public class BedServiceTest {
	
//	@MockBean
//    IBedDao repository;
	
//	@Autowired
//    private WebTestClient webClient;
	
	@Test
    void testCreateBed() throws URISyntaxException {
//		RestTemplate restTemplate = new RestTemplate();
//        final String baseUrl = "http://localhost:"+8082+"/addbed";
//        URI uri = new URI(baseUrl);
//        Bed bed = new Bed(3);
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("X-COM-PERSIST", "true");      
// 
//        HttpEntity<Bed> request = new HttpEntity<>(bed, headers);
//         
//        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
//         
//        Assertions.assertEquals(200, result.getStatusCodeValue());
    }
     
}
