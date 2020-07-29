package com.appsdeveloperblog.app.ws.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {
   
	private final Random RAMDOM= new SecureRandom();
	private final String ALPHABAT = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public String generationUserId(int length) {
		return generateRandomString(length);
	}
	
	private String generateRandomString(int length) {
		StringBuilder returnValue = new StringBuilder(length);
		
		for(int i=0; i<length;i++)
		{
			returnValue.append(ALPHABAT.charAt(RAMDOM.nextInt(ALPHABAT.length())));
		}
		return new String(returnValue);
	}
}
