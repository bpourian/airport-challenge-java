package com.cleo.airport;

import java.util.Random;

class Weather {

    private Random random;

    public Weather(final Random random){
        this.random = random;
    }

    public boolean stormy() {
        return this.random.nextBoolean();
    }
}
