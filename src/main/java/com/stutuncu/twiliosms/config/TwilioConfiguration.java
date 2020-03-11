package com.stutuncu.twiliosms.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Setter
@Getter
public class TwilioConfiguration {
    private String accountSid="twilio accountSid";
    private String authToken="twilio aouthToken";
    private String trialNumber="twilio trial number";
    public TwilioConfiguration(){

    }
}
