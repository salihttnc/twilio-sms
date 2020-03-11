package com.stutuncu.twiliosms.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class SmsRequest {
    @NotBlank
    private final String phoneNumber;
    @NotBlank
    private final String message;
     public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber,@JsonProperty("message") String message){
         this.phoneNumber=phoneNumber;
         this.message=message;
     }
}
