package es.fplumara.dam2.springdemo.controllers;


import org.junit.jupiter.api.Test;
import static org.mockito.BDDMockito.given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import es.fplumara.dam2.springdemo.services.HelloService;

@WebMvcTest(HelloController.class)
class HelloControllerWebTest {

    @Autowired
    MockMvc mockMvc;

    @MockitoBean
    HelloService helloService;

    @Test
    void hello_returns_service_message() throws Exception {
        given(helloService.sayHello()).willReturn("Hola desde el mock");

        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hola desde el mock"));
    }
}

//PUNTO 10 A - PARA QUE FALLE EL TEST
/*
@WebMvcTest(HelloController.class)
class HelloControllerWebTest {

    @Autowired
    MockMvc mockMvc;

    //@MockitoBean
    //HelloService helloService;

    @Test
    void hello_returns_service_message() throws Exception {
        // given(helloService.sayHello()).willReturn("Hola desde el mock");

        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hola desde el mock"));
    }
}
*/