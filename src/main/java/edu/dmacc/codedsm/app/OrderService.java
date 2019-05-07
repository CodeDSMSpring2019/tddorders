package edu.dmacc.codedsm.app;

public class OrderService implements Service {
    private MapRepository repository;

    public OrderService(MapRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order retrieveOrder(int i) {
        return repository.findOne(i);
    }
}
