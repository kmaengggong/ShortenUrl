package com.spring.shorturl.repository;

import com.spring.shorturl.dto.UrlDTO;
import com.spring.shorturl.encoder.Base56Encoder;
import com.spring.shorturl.encoder.Base64Encoder;

import java.util.ArrayList;

public class ShortRepositoryImp implements ShortRepository {
    private static final ArrayList<UrlDTO> urlArr = new ArrayList<>();

    @Override
    public void makeShort(String originUrl){
        for(UrlDTO urlDTO : urlArr){
            if(urlDTO.getOriginUrl().equals(originUrl)) return;
        }

        //Base64Encoder encoder = new Base64Encoder();
        Base56Encoder encoder = new Base56Encoder();
        urlArr.add(new UrlDTO(originUrl, encoder.encode(), 0));
    }

    @Override
    public String findShort(String originUrl){
        for(UrlDTO urlDTO : urlArr){
            if(urlDTO.getOriginUrl().equals(originUrl)){
                return urlDTO.getShortUrl();
            }
        }
        return null;
    }

    @Override
    public String findOrigin(String shortUrl){
        for(UrlDTO urlDTO : urlArr){
            if(urlDTO.getShortUrl().equals(shortUrl)){
                urlDTO.setVisitCount(urlDTO.getVisitCount()+1);
                return urlDTO.getOriginUrl();
            }
        }
        return null;
    }

    @Override
    public long getVisitCount(String originUrl){
        for(UrlDTO urlDTO : urlArr){
            if(urlDTO.getOriginUrl().equals(originUrl)){
                return urlDTO.getVisitCount();
            }
        }
        return 0;
    }
}
