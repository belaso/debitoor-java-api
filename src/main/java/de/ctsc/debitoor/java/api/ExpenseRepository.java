package de.ctsc.debitoor.java.api;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.ctsc.debitoor.java.api.v4.Expense;

public class ExpenseRepository {

	private final ObjectMapper mapper;

	private final String accessToken;

	public ExpenseRepository(String accessToken) {
		this.mapper = new ObjectMapper();
		this.accessToken = accessToken;
	}

	public Expense findOne(String id) throws IOException {
		String api = "/api/expenses/" + id + "/v4";
		InputStream expenseInputStream = doGet(api);
		Expense expense = mapper.readValue(expenseInputStream, Expense.class);
		return expense;
	}

	private InputStream doGet(String api) throws IOException {
		URL baseURL = new URL("https://api.debitoor.com" + api);
		HttpsURLConnection connection = (HttpsURLConnection) baseURL.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("x-token", accessToken);
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setUseCaches(false);
		connection.setDoInput(true);
		return connection.getInputStream();
	}

}
