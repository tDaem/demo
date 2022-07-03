package com.daem.demo.web.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.security.test.web.reactive.server.SecurityMockServerConfigurers.csrf;

import com.daem.demo.IntegrationTest;
import com.daem.demo.repository.EntityManager;
import com.daem.demo.security.AuthoritiesConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.reactive.server.WebTestClient;

@AutoConfigureWebTestClient(timeout = IntegrationTest.DEFAULT_TIMEOUT)
@WithMockUser(authorities = AuthoritiesConstants.ADMIN)
@IntegrationTest
class DemoResourceIT {

    private static final String DEFAULT_LOGIN = "johndoe";

    @Autowired
    private EntityManager em;

    @Autowired
    private WebTestClient webTestClient;

    @BeforeEach
    public void setupCsrf() {
        webTestClient = webTestClient.mutateWith(csrf());
    }

    @BeforeEach
    public void initTest() {}

    @Test
    void getAllPublicUsers() {}
}
