package com.spring.shorturl.dto;

import com.spring.shorturl.entity.Url;
import lombok.*;

@Getter @Setter @Builder @ToString
@AllArgsConstructor @NoArgsConstructor
public class UrlDTO {
    private String originUrl;
    private String shortUrl;
    private long visitCount;

    public UrlDTO(Url url){
        this.originUrl = url.getOriginUrl();
        this.shortUrl = url.getShortUrl();
        this.visitCount = url.getVisitCount();
    }
}
