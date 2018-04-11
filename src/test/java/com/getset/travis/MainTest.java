package com.getset.travis;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void testAdd() {
        Assert.assertEquals(Main.add(1,2), 3);
    }

}
