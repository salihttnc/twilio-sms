package com.stutuncu.twiliosms.service.impl;

import com.stutuncu.twiliosms.config.TwilioConfiguration;
import com.stutuncu.twiliosms.service.SmsRequest;
import com.stutuncu.twiliosms.service.SmsSender;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("twilio")
@RequiredArgsConstructor
public class TwilioSmsSender implements SmsSender {
    private static final Logger LOGGER= LoggerFactory.getLogger(TwilioSmsSender.class);
    @Autowired
    private final TwilioConfiguration twilioConfiguration;
    @Override
    public void sendSms(SmsRequest smsRequest) {
        if(isPhoneNumberValid(smsRequest.getPhoneNumber())){
            PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String message = smsRequest.getMessage();
            MessageCreator messageCreator=Message.creator(to, from, message);
            messageCreator.create();
            LOGGER.info("Send sms {}"+smsRequest);
        }else{
            throw new IllegalArgumentException("Phone number is not valid  "+ smsRequest.getPhoneNumber());
        }



    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        //
        return true;
    }
}
