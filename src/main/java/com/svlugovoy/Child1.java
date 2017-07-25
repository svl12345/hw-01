package com.svlugovoy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Child1 extends BaseScreen {

    private List<String> list;

    public List<String> getList() {
        if (list == null) {
            list = new ArrayList<>();
        }
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    String getTitle() {
        return "This is getTitle() from child 1.";
    }

    private void doSmthWithList(List<String> list) {
        System.out.println("The private method doSmthWithList() from child 1. was invoked.");
    }

    public void doSmthWithListCommon(List<String> list) {
        doSmthWithList(list);
        System.out.println("This is public method doSmthWithListCommon() from child 1.");
    }

    public void doSmthWithListCommon(List<String> list, String msg) {
        System.out.println("This is example of Overloading for method doSmthWithListCommon() from child 1. Message was - \"" + msg + "\".");
    }

    public void printListInDirectAndThenReverseOrder(List<String> list) {

        ListIterator<String> listiter = list.listIterator();

        while (listiter.hasNext()) {
            System.out.printf(listiter.next() + " ");

        }
        System.out.printf("\n");
        while (listiter.hasPrevious()) {
            System.out.printf(listiter.previous() + " ");
        }
        System.out.printf("\n");
    }
}
