package com.spring.shorturl.repository;

public interface ShortRepository {

    void makeShort(String originUrl);
    String findShort(String originUrl);
    String findOrigin(String shortUrl);

    long getVisitCount(String originUrl);
}
