package io.mart.xstream.tweakingOutput;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    private Author writer;
    private List entries = new ArrayList();

    public Blog(Author writer) {
        this.writer = writer;
    }

    public void add(Entry entry) {
        entries.add(entry);
    }

    public List getContent() {
        return entries;
    }
}
