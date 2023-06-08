package com.spring.shorturl.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShortRepositoryTest {
    private final ShortRepository shortRepository = new ShortRepositoryImp();

    @Test
    public void findShortTest(){
        String originUrl = "https://www.naver.com";
        shortRepository.makeShort(originUrl);
        Assertions.assertEquals("asdf", shortRepository.findShort(originUrl));
    }

    @Test
    public void findOriginTest(){
        String originUrl = "https://www.naver.com";
        shortRepository.makeShort(originUrl);
        Assertions.assertEquals(originUrl, shortRepository.findOrigin(shortRepository.findShort(originUrl)));
    }
}
