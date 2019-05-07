package edu.dmacc.codedsm.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class OrderServiceTest {

    private OrderService classUnderTest;
    private Order expectedOrder;
    private MapRepository repositoryStub;

    @Before
    public void setUp() throws Exception {
        expectedOrder = new Order();
        repositoryStub = new MapRepository() {
            @Override
            public Order findOne(Integer id) {
                if (id == 1) {
                    return expectedOrder;
                } else {
                    return null;
                }
            }
        };
        classUnderTest = new OrderService(repositoryStub);
    }

    @Test
    public void shouldRetrieveOrder() {
        Order result = classUnderTest.retrieveOrder(1);

        assertSame(expectedOrder, result);
    }
}
