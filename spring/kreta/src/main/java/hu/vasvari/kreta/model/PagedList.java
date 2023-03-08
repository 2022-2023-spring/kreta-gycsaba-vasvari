package hu.vasvari.kreta.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
public class PagedList<T> implements Iterable {
    private long numberOfItems;
    private int pageSize;
    private int currentPage;
    private int numberOfPage;
    private List<T> list;

    public PagedList() {
        numberOfItems=0;
        pageSize=0;
        currentPage=0;
        numberOfPage=0;
        list = new ArrayList<T>();
    }

    @Override
    public Iterator iterator() {
        return new MyIterator<T>(this);
    }

}
