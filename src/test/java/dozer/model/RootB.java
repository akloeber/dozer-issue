package dozer.model;

import java.util.ArrayList;
import java.util.List;

public class RootB {
    private List<ItemB> list = new ArrayList<>();

    public RootB() {
    }

    public RootB(List<ItemB> list) {
        this.list = list;
    }

    public RootB(ItemB singleItem) {
        this.list.add(singleItem);
    }

    public List<ItemB> getList() {
        return this.list;
    }

    public void setList(List<ItemB> list) {
        this.list = list;
    }
}
