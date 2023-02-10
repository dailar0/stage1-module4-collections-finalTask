package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> result = new HashMap<>();
        for (String s : sourceMap.keySet()) {
            int key = s.length();
            Set<String> oldSet = result.get(key);

            if (oldSet != null) {
                oldSet.add(s);
            } else {
                HashSet<String> freshSet = new HashSet<>();
                freshSet.add(s);
                result.put(key, freshSet);
            }
        }

        return result;
    }
}
