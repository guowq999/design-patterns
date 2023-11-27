package com.owenguo.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {

    // 集合，充当池的作用
    private Map<String, ConcreteWebsite> pool = new HashMap<>();

    public Website getWebsiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    public int getWebsiteCount() {
        return pool.size();
    }
}
