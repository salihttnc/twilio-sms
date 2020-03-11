package com.stutuncu.twiliosms.service;

import com.stutuncu.twiliosms.service.impl.TwilioSmsSender;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TwilioService {

    private final SmsSender smsSender;
    @Autowired
    public TwilioService(@Qualifier("twilio") TwilioSmsSender smsSender){
        this.smsSender=smsSender;

    }

    public void sendSms(SmsRequest smsRequest){
        smsSender.sendSms(smsRequest);
    }

}
