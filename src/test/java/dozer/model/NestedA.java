package dozer.model;

public class NestedA {

    private String value;

    private String internal;

    public NestedA(String value, String internal) {
        this.value = value;
        this.internal = internal;
    }

    public NestedA() {
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }
}
