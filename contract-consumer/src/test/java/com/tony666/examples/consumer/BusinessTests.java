package com.tony666.examples.consumer;

import com.tony666.examples.consumer.config.HttpClientConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HttpClientConfig.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(ids = {"com.tony666.examples:contract-provider:+:8080"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class BusinessTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test() {
        ResponseEntity<String> mapResponseEntity = restTemplate.postForEntity("http://localhost:8080/payment/codes", null, String.class);
        log.info(mapResponseEntity.getBody());
    }

}
