package edu.dmacc.codedsm.app;

public class OrderViewController {
    private Service service;

    public OrderViewController(Service service) {
        this.service = service;
    }

    public OrderView handleInput(String input) {
        Integer parsedInput = -1;
        String message = null;
        Order order = null;
        try {
            parsedInput = Integer.parseInt(input);
            order = service.retrieveOrder(parsedInput);
        } catch (NumberFormatException nfe) {
            message = "Numbers only please.";
        }
        OrderView view = new OrderView();
        view.setOrder(order);
        view.setMessage(message);
        return view;
    }
}
