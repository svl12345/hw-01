package com.svlugovoy;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {

        Child1 child1 = new Child1();
        List<String> child1List = child1.getList();
        child1List.add("One");
        child1List.add("Two");
        child1List.add("Three");
        child1.doSmthWithListCommon(child1List);
        child1.doSmthWithListCommon(child1List, "Hello world");
        child1.printListInDirectAndThenReverseOrder(child1List);

        Child2 child2 = new Child2();
        Set<String> child2Set = child2.getSet();
        child2Set.add("dog");
        child2Set.add("cat");
        System.out.println(child2.getTitle());
        child2.printSet(child2Set);
        child2.printSet(child2Set, true);
        child2.goBack();

        Child3 child3 = new Child3();
        Map<Integer, String> child3Map = child3.getMap();
        child3.printOnlyValuesFromMap(child3Map);
        child3.goBack();

    }
}
