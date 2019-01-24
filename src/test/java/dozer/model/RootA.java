package dozer.model;

import java.util.ArrayList;
import java.util.List;

public class RootA {

    private List<ItemA> list = new ArrayList<>();

    public RootA() {
    }

    public RootA(List<ItemA> list) {
        this.list = list;
    }

    public RootA(ItemA singleItem) {
        this.list.add(singleItem);
    }

    public List<ItemA> getList() {
        return this.list;
    }

    public void setList(List<ItemA> list) {
        this.list = list;
    }
}
