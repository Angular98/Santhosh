package com.fare.business;

public class FareCalculatorBusinessServiceConstants {

	public final static String response = "\"{\r\n" + "\r\n" + "	\\\"faredetails\\\": [{\r\n"
			+ "			\\\"origin\\\": \\\"MAA\\\",\r\n" + "			\\\"destination\\\": \\\"LHR\\\",\r\n"
			+ "			\\\"fare\\\": \\\"500\\\"\r\n" + "		},\r\n" + "		{\r\n"
			+ "			\\\"origin\\\": \\\"MUM\\\",\r\n" + "			\\\"destination\\\": \\\"LHR\\\",\r\n"
			+ "			\\\"fare\\\": \\\"400\\\"\r\n" + "		},\r\n" + "		{\r\n"
			+ "			\\\"origin\\\": \\\"HYD\\\",\r\n" + "			\\\"destination\\\": \\\"LHR\\\",\r\n"
			+ "			\\\"fare\\\": \\\"300\\\"\r\n" + "		}\r\n" + "	]\r\n" + "}\"";

	public static final String AUTHORIZATION_TOKEN = "authorization-token";
	public static final String USER_NOT_AUTHENTICATED = "user not authenticated";
	public static final String HTTP_URL = "http://localhost:9898";
	public static final String ORIGIN = "origin";
	public static final String DESTINATION = "destination";

	public static final String ERROR_PARSING_DATA = "error-parsing-data";
	public static final String CLIENT_ID="client-id";
	public static final String PASSWORD="psw";
}
