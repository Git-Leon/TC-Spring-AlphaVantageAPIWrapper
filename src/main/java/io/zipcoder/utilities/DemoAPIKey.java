package io.zipcoder.utilities;

/**
 * Created by leon on 11/30/17.
 */
public enum DemoAPIKey implements APIKey {
    DEMO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
