package com.spring.shorturl.encoder;

import java.util.Base64;

public class Base64Encoder {
    public String encode(String strUrl){
        byte[] targetUrl = strUrl.getBytes();
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encodedUrl = encoder.encode(targetUrl);

        return new String(encodedUrl);
    }
}
