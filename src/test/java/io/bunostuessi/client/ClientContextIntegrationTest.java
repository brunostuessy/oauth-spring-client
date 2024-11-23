package io.bunostuessi.client;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest(classes = { ClientSpringApp.class })
public class ClientContextIntegrationTest {

	@Test
	public void whenLoadApplication_thenSuccess() {
		assertDoesNotThrow(() -> {});
	}

}