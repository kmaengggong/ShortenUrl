package com.spring.shorturl.entity;

import lombok.*;

@Getter @ToString @NoArgsConstructor
public class Url {
    private String originUrl;
    private String shortUrl;
    private long visitCount;
}
