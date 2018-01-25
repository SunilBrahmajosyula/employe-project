package com.adp.assignment;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

public class ArrayToMap {
  public static void main(String[] args) {
    String[] arrayItems = { "key0", "Item0", "key1", "Item1", "key2", "Item2", "key3", "Item3", "key4", "Item4" };

    // sol 1
    Map map = ArrayUtils.toMap(arrayItems);
    System.out.println(map.get("key0"));

    // sol 2
    Map<String, String> arrayToMap = new HashMap<>();
    for (int i = 0; i < arrayItems.length; i++) {
      arrayToMap.put(arrayItems[i], arrayItems[i + 1]);
    }

  }

}
