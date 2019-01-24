package dozer.model;

import java.util.Objects;

public class ItemB {
    private int id;
    private NestedB nested;
    private String value;

    public ItemB(int id, NestedB nested, String value) {
        this.id = id;
        this.nested = nested;
        this.value = value;
    }

    public ItemB() {
    }

    public int getId() {
        return this.id;
    }

    public NestedB getNested() {
        return this.nested;
    }

    public String getValue() {
        return this.value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNested(NestedB nested) {
        this.nested = nested;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemB)) return false;
        ItemB itemB = (ItemB) o;
        return getId() == itemB.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
