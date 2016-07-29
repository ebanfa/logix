/**
 * 
 */
package com.cloderia.helion.client.local;

import org.jboss.errai.bus.client.framework.Configuration;

public class Config implements Configuration {
    @Override
    public String getRemoteLocation() {
        // you probably want to do something environment specify here instead of something like this:
        return "https://grocery-edewit.rhcloud.com/errai-jpa-demo-grocery-list";
    }
}