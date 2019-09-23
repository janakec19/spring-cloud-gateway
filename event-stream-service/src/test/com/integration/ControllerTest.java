package com.integration;

import com.field.controller.FieldController;
import com.field.controller.TelemetrySummaryException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

	@Autowired
	private MockMvc mvc;


	@Before
	public void setup() {
		this.mvc = MockMvcBuilders.standaloneSetup(new FieldController()).build();
	}

    @Test
    public void shouldReturnEmpty() throws Exception {
        this.mvc.perform(post("/event")).andDo(print()).andExpect(status().isBadRequest())
        .andExpect(jsonPath("$").doesNotExist());
    }



	@Test(expected = Exception.class)
	public void missingHeaderException() throws Exception {
		mvc.perform(
				MockMvcRequestBuilders.post("/event")
						.contentType(MediaType.APPLICATION_JSON)
						.content(field_Data));
	}


}