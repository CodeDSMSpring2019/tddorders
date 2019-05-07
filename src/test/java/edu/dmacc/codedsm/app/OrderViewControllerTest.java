package edu.dmacc.codedsm.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderViewControllerTest {

    private OrderViewController classUnderTest;
    private Order expectedObject;
    private Service serviceStub;

    @Before
    public void setUp() throws Exception {
        expectedObject = new Order();
        serviceStub = new Service() {
            @Override
            public Order retrieveOrder(int i) {
                return expectedObject;
            }
        };
        classUnderTest = new OrderViewController(serviceStub);
    }

    @Test
    public void shouldHandleNumberInputCorrectly() {
        OrderView result = classUnderTest.handleInput("1");
        assertSame(expectedObject, result.getOrder());
    }

    @Test
    public void shouldHandleStringInputCorrectly() {
        OrderView result = classUnderTest.handleInput("aaa");
        assertEquals("Numbers only please.", result.getMessage());
    }
}
