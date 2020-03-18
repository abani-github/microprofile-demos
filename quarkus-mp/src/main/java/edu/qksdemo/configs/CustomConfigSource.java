package edu.qksdemo.configs;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.microprofile.config.spi.ConfigSource;

/**
 * CustomConfigSource
 */
public class CustomConfigSource implements ConfigSource {

    private Map<String, String> configs;

    public CustomConfigSource(){
        configs = new HashMap<>();
        configs.put("welcome.msg", "Welcome to Custom Config");
    }

    @Override
    public Map<String, String> getProperties() {
        return configs;
    }

    @Override
    public String getValue(String propertyName) {
        return configs.get(propertyName);
    }

    @Override
    public String getName() {
        return CustomConfigSource.class.getName();
    }
    
}