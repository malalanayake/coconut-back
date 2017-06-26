package com.sysensor.coconut.config;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
public class InitTestProcess {

    public InitTestProcess() {

    }
}
