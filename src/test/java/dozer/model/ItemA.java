package dozer.model;

import java.util.Objects;

public class ItemA {
    private int id;
    private NestedA nested;
    private String value;

    public ItemA(int id, NestedA nested, String value) {
        this.id = id;
        this.nested = nested;
        this.value = value;
    }

    public ItemA() {
    }

    public int getId() {
        return this.id;
    }

    public NestedA getNested() {
        return this.nested;
    }

    public String getValue() {
        return this.value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNested(NestedA nested) {
        this.nested = nested;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemA)) return false;
        ItemA itemA = (ItemA) o;
        return getId() == itemA.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
