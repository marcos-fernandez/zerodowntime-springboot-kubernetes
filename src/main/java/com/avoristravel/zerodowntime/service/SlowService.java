package com.avoristravel.zerodowntime.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SlowService {

    private static final Random RANDOM = new Random();

    public String search() {
        try {
            long millis = RANDOM.nextLong(100, 3000);
            System.out.printf("complex calculation duration: %d%n", millis);
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
        return "Complex calculation";
    }
}
