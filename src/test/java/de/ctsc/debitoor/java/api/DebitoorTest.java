package de.ctsc.debitoor.java.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class DebitoorTest {

	@Test
	public void oneExpense() throws IOException {
		Debitoor debitoor = new Debitoor(getAccessToken());
		Expense expense = debitoor.get("/api/expenses/59e21ce79f000d001b421a7e/v4", Expense.class);
		assertNotNull(expense);
		assertEquals(Double.valueOf(313.29), expense.getTotalGrossAmount());
		assertEquals("EUR", expense.getCurrency());
	}

	public static void main(String[] args) throws IOException {
		Debitoor debitoor = new Debitoor(getAccessToken());
		File dir = new File("src/main/resources/schema");
		Map<String, String> schemas = new HashMap<>();
		schemas.put("customer", "v1");
		schemas.put("expense", "v4");
		schemas.put("income", "v2");
		for (Map.Entry<String, String> entry : schemas.entrySet()) {
			String schemaName = entry.getKey();
			String schemaVersion = entry.getValue();
			InputStream schemaInputStream = debitoor.get("/api/schemas/" + schemaName + "/" + schemaVersion);
			File schemaFile = new File(dir, schemaName + ".json");
			Files.copy(schemaInputStream, schemaFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
		}
	}

	private static String getAccessToken() throws IOException {
		InputStream accessTokenInputStream = DebitoorTest.class.getResourceAsStream("/access_token.txt");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accessTokenInputStream));
		return bufferedReader.readLine();
	}

}
