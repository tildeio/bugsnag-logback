package com.bugsnag.model;

import java.util.HashMap;
import java.util.Map;

public class MetaDataVO {
    private Map<String, Object> logging = new HashMap<String, Object>();

    public void addToLoggingTab(String key, Object value) {
        logging.put(key, value);
    }
}
