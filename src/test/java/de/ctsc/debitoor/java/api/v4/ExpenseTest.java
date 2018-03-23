package de.ctsc.debitoor.java.api.v4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExpenseTest {

	@Test
	public void example1() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Expense expense = mapper.readValue(getClass().getResourceAsStream("/examples/example1.json"), Expense.class);
		assertNotNull(expense);
		assertEquals(Double.valueOf(313.29), expense.getTotalGrossAmount());
		assertEquals("EUR", expense.getCurrency());
	}

}
