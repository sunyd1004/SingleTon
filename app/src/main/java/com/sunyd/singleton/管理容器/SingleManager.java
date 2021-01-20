package com.sunyd.singleton.管理容器;

import java.util.HashMap;
import java.util.Map;

/**
 * 方便管理
 * 写法复杂
 *
 * Created by sunyd on 2021/1/20
 */
public class SingleManager {

    private static Map<String, Object> map = new HashMap<>();

    public static void set(String key, Object object) {
        if (!map.containsKey(key)) {
            map.put(key, object);
        }
    }

    public static Object get(String key) {
        return map.get(key);
    }
}
