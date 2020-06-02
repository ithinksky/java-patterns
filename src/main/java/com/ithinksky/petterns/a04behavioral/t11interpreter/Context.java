package com.ithinksky.petterns.a04behavioral.t11interpreter;

import java.util.HashMap;

/**
 * @author tengpeng.gao
 */
public class Context {

    private HashMap<String, String> map = new HashMap();

    public void assign(String key, String value) {
        map.put(key, value);
    }

    public String get(String key) {
        return map.get(key);
    }

}
