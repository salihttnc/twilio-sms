package com.stutuncu.twiliosms.controller;

import com.stutuncu.twiliosms.service.SmsRequest;
import com.stutuncu.twiliosms.service.TwilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/sms")

public class SensSmsApi {
    private final TwilioService twilioService;
    @Autowired
    public SensSmsApi(TwilioService twilioService){
        this.twilioService=twilioService;
    }
    @PostMapping
    public void sendSms(@Valid  @RequestBody SmsRequest smsRequest){
        twilioService.sendSms(smsRequest);
    }
}
