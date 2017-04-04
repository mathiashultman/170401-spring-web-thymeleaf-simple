package biz.mathias.test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import biz.mathias.controllers.MyController;

public class ControllerTest {

	@Test
	public void shouldGetHome() throws Exception {
		MyController controller = new MyController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView(new InternalResourceView("/WEB-INF/templates/home.html")).build();
		mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("home"))
				.andExpect(MockMvcResultMatchers.model().attributeExists("mine"));
	}
}
