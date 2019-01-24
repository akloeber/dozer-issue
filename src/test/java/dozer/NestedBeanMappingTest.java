package dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import dozer.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NestedBeanMappingTest {

    @Test
    void shouldReuseNestedObjects() {
        RootA objA = new RootA(
            new ItemA(
                3,
                new NestedA(
                    "nestedValue",
                    "internalValue"
                ),
                "itemValue"
            )
        );
        RootB objB = new RootB(
            new ItemB(
                3,
                new NestedB(
                    "nestedValueNew"
                ),
                "itemValueNew"
            )
        );

        ItemA itemOrig = objA.getList().get(0);
        NestedA nestedOrig = itemOrig.getNested();

        DozerBeanMapperBuilder.buildDefault().map(objB, objA);

        Assertions.assertEquals(1, objA.getList().size());
        Assertions.assertEquals("itemValueNew", objA.getList().get(0).getValue());
        Assertions.assertEquals("nestedValueNew", objA.getList().get(0).getNested().getValue());
        Assertions.assertSame(itemOrig, objA.getList().get(0));
        Assertions.assertSame(nestedOrig, objA.getList().get(0).getNested());
        Assertions.assertSame("internalValue", objA.getList().get(0).getNested().getInternal());
    }
}
