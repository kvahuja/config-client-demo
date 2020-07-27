package com.kapil.scratchpad.configclientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class PropertiesRestController {
    @Value("${greetings:Hello World}")
    private String greeting;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/greetings")
    String getGreeting() {
        return this.greeting;
    }

    @RequestMapping("appName")
    String getAppName() {
        return this.appName;
    }
}
