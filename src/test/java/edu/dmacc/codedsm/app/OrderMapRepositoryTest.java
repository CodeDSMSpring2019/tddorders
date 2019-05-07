package edu.dmacc.codedsm.app;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class OrderMapRepositoryTest {

    private OrderMapRepository classUnderTest;
    private Map<Integer, Order> orderStubs;
    private Order expectedOrder;

    @Before
    public void setUp() throws Exception {
        orderStubs = new HashMap<>();
        expectedOrder = new Order();
        orderStubs.put(1, expectedOrder);

        classUnderTest = new OrderMapRepository(orderStubs);
    }

    @Test
    public void shouldGetOneOrder() {
        Order result = classUnderTest.findOne(1);

        assertSame(expectedOrder, result);
    }
}
