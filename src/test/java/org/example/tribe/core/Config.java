package org.example.tribe.core;

import io.restassured.http.ContentType;

public interface Config {
	String  APP_BASE_URL = "https://jsonplaceholder.typicode.com/";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 4000L;
}