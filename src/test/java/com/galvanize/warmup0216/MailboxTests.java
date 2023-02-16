package com.galvanize.warmup0216;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import org.springframework.http.MediaType;

@WebMvcTest
public class MailboxTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void defaultEndpointGetReturnsEmptyMessage() throws Exception {
        mockMvc.perform(get("/")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("You've got /"));
    }

    @Test
    void mailEndpointGetReturnsAppropriateMessage() throws Exception {
        mockMvc.perform(get("/mail")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("You've got mail!"));
    }

    @Test
    void mailEndpointPostReturnsAppropriateMessage() throws Exception {
        mockMvc.perform(post("/mail")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("You've sent mail!"));
    }

    @Test
    void mailEndpointPatchReturnsAppropriateMessage() throws Exception {
        mockMvc.perform(patch("/mail")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("You've edited mail!"));
    }
    @Test
    void mailEndpointPutReturnsAppropriateMessage() throws Exception {
        mockMvc.perform(put("/mail")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("You've created mail!"));
    }
    @Test
    void mailEndpointDeleteReturnsAppropriateMessage() throws Exception {
        mockMvc.perform(delete("/mail")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("DELETED!"));
    }

    @Test
    void specificMailCanBeDeletedWithAppropriateMessage() throws Exception {
        mockMvc.perform(delete("/mail/45")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("The 45 email was DELETED!"));
    }
}
