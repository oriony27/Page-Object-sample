package com.formy.sample.config;

import java.util.concurrent.TimeUnit;

public final class WaitConfiguration {
    private int defaultImplicitTimeout;
    private TimeUnit defaultImplicitTimeUnit;
    private int defaultExplicitTimeout;

    public WaitConfiguration(Builder builder) {
        this.defaultExplicitTimeout = builder.defaultExplicitTimeout;
        this.defaultImplicitTimeout = builder.defaultImplicitTimeout;
        this.defaultImplicitTimeUnit = builder.defaultImplicitTimeUnit;
    }

    public static class Builder {
        private int defaultImplicitTimeout = 3;
        private TimeUnit defaultImplicitTimeUnit = TimeUnit.SECONDS;
        private int defaultExplicitTimeout = 5;

        public Builder setDefaultImplicitTimeout(int timeout) {
            this.defaultImplicitTimeout = timeout;
            return this;
        }

        public Builder setDefaultImplicitTimeUnit(TimeUnit timeUnit) {
            this.defaultImplicitTimeUnit = timeUnit;
            return this;
        }

        public Builder setDefaultExplicitTimeout(int timeout) {
            this.defaultExplicitTimeout = timeout;
            return this;
        }

        public WaitConfiguration build() {
            return new WaitConfiguration(this);
        }
    }

    public int getDefaultImplicitTimeout() {
        return defaultImplicitTimeout;
    }

    public TimeUnit getDefaultImplicitTimeUnit() {
        return defaultImplicitTimeUnit;
    }

    public int getDefaultExplicitTimeout() {
        return defaultExplicitTimeout;
    }
}