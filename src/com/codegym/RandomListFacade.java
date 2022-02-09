package com.codegym;

import java.util.List;

public class RandomListFacade {
    private final ListFilter listFilter;
    private final ListPrinter listPrinter;
    private final RandomList randomList;

    public RandomListFacade() {
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
        this.randomList = new RandomList();
    }

    public void printRandomEvenList(int size, int max, int min){
        List<Integer> list = randomList.generateList(size, max, min);
        List<Integer> filteredList = listFilter.filterOdd(list);
        listPrinter.printList(filteredList);
    }
}
