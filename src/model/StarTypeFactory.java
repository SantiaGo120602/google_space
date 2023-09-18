package model;

import java.awt.Color;
import java.util.HashMap;

public final class StarTypeFactory {
    private static HashMap<String, StarType> startTypesMap = new HashMap<>();

    public static StarType getType(Color color, int id){
        String key = color.toString() + String.valueOf(id);
        if (startTypesMap.containsKey(key)) {
            return startTypesMap.get(key);
        } else {
            StarType type = new StarType(color, new StarSprite(id));
            startTypesMap.put(key, type);
            return type;
        }
    }
}
