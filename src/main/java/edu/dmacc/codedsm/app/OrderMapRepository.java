package edu.dmacc.codedsm.app;

import java.util.Map;

public class OrderMapRepository implements MapRepository {
    private Map<Integer, Order> orderStubs;

    public OrderMapRepository(Map<Integer, Order> orderStubs) {
        this.orderStubs = orderStubs;
    }

    @Override
    public Order findOne(Integer id) {
        return orderStubs.get(id);
    }
}
