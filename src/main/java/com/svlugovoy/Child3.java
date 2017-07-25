package com.svlugovoy;

import java.util.HashMap;
import java.util.Map;

public class Child3 extends BaseScreen {

    public Child3() {
        initializeMap();
    }

    private Map<Integer, String> map;

    public Map<Integer, String> getMap() {
        if (map == null) {
            map = new HashMap<>();
        }
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    String getTitle() {
        return "This is getTitle() from child 3.";
    }

    private void initializeMap() {
        map = new HashMap<>();
        map.put(1, "Ukraine");
        map.put(2, "Poland");
        map.put(3, "USA");
    }

    public void printOnlyValuesFromMap(Map<Integer, String> map) {
        for (String s : map.values()) {
            System.out.println(s);
        }
    }

    @Override
    protected void goBack(){
        System.out.println("This is overriden goBack() method in child 3 class.");
    }

}
