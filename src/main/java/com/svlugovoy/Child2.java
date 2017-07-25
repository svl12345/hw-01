package com.svlugovoy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Child2 extends BaseScreen {

    private Set<String> set;

    public Set<String> getSet() {
        if (set == null) {
            set = new HashSet<>();
        }
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    String getTitle() {
        return "This is getTitle() from child 2.";
    }

    private void doSmthWithSet(Set<String> set) {
        System.out.println("The private method. Something happens with our set here.");
    }

    public void printSet(Set<String> set) {
        doSmthWithSet(set);
        for (String s : set) {
            System.out.println(s);
        }
    }

    public void printSet(Set<String> set, boolean printInCaps) {
        for (String s : set) {
            if (printInCaps) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s);
            }
        }
    }

    public void printSetWithIterator(Set<String> set) {
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
