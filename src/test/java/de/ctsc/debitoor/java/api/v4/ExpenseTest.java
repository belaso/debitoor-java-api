package de.ctsc.debitoor.java.api.v4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.ctsc.debitoor.java.api.ExpenseRepository;

public class ExpenseTest {

	static ObjectMapper mapper;

	@BeforeClass
	public static void beforeClass() {
		mapper = new ObjectMapper();
	}

	@Test
	public void example1() throws JsonParseException, JsonMappingException, IOException {
		Expense expense = mapper.readValue(getClass().getResourceAsStream("/examples/example1.json"), Expense.class);
		assertNotNull(expense);
		assertEquals(Double.valueOf(313.29), expense.getTotalGrossAmount());
		assertEquals("EUR", expense.getCurrency());
	}

	@Test
	public void connection() throws IOException {
		ExpenseRepository expenseRepository = new ExpenseRepository(getAccessToken());
		Expense expense = expenseRepository.findOne("59e21ce79f000d001b421a7e");
		assertNotNull(expense);
		assertEquals(Double.valueOf(313.29), expense.getTotalGrossAmount());
		assertEquals("EUR", expense.getCurrency());
	}

	private String getAccessToken() throws IOException {
		InputStream accessTokenInputStream = getClass().getResourceAsStream("/access_token.txt");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accessTokenInputStream));
		return bufferedReader.readLine();
	}

}
