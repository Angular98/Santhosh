package com.fare.business.service;

import java.util.Map;

public interface FareCalculatorBusinessService {

	String calculateFare(Map<String, String> requestHeader, Map<String, String> requestParam);

}