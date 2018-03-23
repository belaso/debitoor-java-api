package de.ctsc.debitoor.java.api;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Debitoor {

	private static final String DEBITOOR_URL = "https://api.debitoor.com";

	private final ObjectMapper mapper;

	private final String accessToken;

	public Debitoor(String accessToken) {
		this.mapper = new ObjectMapper();
		this.accessToken = accessToken;
	}

	public <T> T get(String api, Class<T> clazz) throws IOException {
		T object = mapper.readValue(get(api), clazz);
		return object;
	}

	public InputStream get(String api) throws IOException {
		URL baseURL = new URL(DEBITOOR_URL + api);
		HttpsURLConnection connection = (HttpsURLConnection) baseURL.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("x-token", accessToken);
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setUseCaches(false);
		connection.setDoInput(true);
		return connection.getInputStream();
	}

}
