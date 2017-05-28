package domein;

public class StockServiceController {

    private StockService service = new StockService();

    public String executeCommand(String[] args) {
        String mes;
        switch (args[0]) {
            case "updateQuantity":
                mes = updateQuantity(args[1], Integer.parseInt(args[2]));
                break;
            case "createProduct":
                mes = createProduct(args[1], Integer.parseInt(args[2]));
                break;
            case "shipProduct":
                mes = shipProduct(args[1]);
                break;
            case "showStock":
                mes = showStock();
                break;
            default:
                mes = "Unrecognized command" + args[0];
                break;
        }
        return mes;
    }

    private String updateQuantity(String productName, int newQuantity) {
        return service.update(productName, newQuantity);
    }

    private String createProduct(String productName, int quantity) {
        return service.insert(productName, quantity);
    }

    private String shipProduct(String productName) {
        return service.ship(productName);
    }

    private String showStock() {
        return String.format("DATABASE : stockstatus%s%s%s",
                System.lineSeparator(), service.productenView(), System.lineSeparator());
    }
}
