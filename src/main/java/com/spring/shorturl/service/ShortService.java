package com.spring.shorturl.service;

import com.spring.shorturl.repository.ShortRepository;
import com.spring.shorturl.repository.ShortRepositoryImp;
import org.springframework.stereotype.Service;

@Service
public class ShortService {
    private final ShortRepository shortRepository = new ShortRepositoryImp();

    public void makeShort(String shortUrl){
        shortRepository.makeShort(shortUrl);
    }

    public String findShort(String originUrl){
        return shortRepository.findShort(originUrl);
    }

    public String findOrigin(String shortUrl){
        return shortRepository.findOrigin(shortUrl);
    }

    public long getVisitCount(String originUrl) { return shortRepository.getVisitCount(originUrl); }
}
