package com.fare.business.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fare.business.FareCalculatorBusinessServiceConstants;

/**
 * Class to build a method to call mock service
 * 
 * @author santhosh
 *
 */
@Component
public class FareCalculatorBusinessProxy {
	private final RestTemplate restTemplate = new RestTemplate();

	@Value("${mock.service.uri}")
	private String url;

	/**
	 * Method to call mock service
	 * 
	 * @return
	 */
	public String callMock() {
		String mockServiceUrl = FareCalculatorBusinessServiceConstants.HTTP_URL+url;
		ParameterizedTypeReference<String> responseType = new ParameterizedTypeReference<String>() {
		};
		ResponseEntity<String> response = restTemplate.exchange(mockServiceUrl, HttpMethod.GET, null, responseType);
		return response.getBody();
	
	}

}
