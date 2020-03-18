package edu.qksdemo.configs;

import io.quarkus.arc.config.ConfigProperties;

/**
 * AppConfig
 */
@ConfigProperties(prefix = "app")
public class AppConfig {

    private String name;
    private String version;
    private String[] tags;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "AppConfig [name=" + name + ", version=" + version + "]";
    }

}